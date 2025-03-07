// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.

package com.azure.resourcemanager.compute.models;

import com.azure.core.annotation.Fluent;
import com.azure.core.util.CoreUtils;

/** Options for managed data disk of a virtual machine. */
@Fluent
public final class VirtualMachineDiskOptions {

    private StorageAccountTypes storageAccountType;
    private CachingTypes cachingTypes;
    private DeleteOptions deleteOptions;
    private Boolean writeAcceleratorEnabled;

    /**
     * Creates a new instance of VirtualMachineDiskOptions.
     */
    public VirtualMachineDiskOptions() {
    }

    // DiskEncryptionSetParameters instance without ID means do not configure.
    // If disk is already encrypted with CMK, it remains so when attached.
    private DiskEncryptionSetParameters diskEncryptionSetOptions;

    /**
     * Gets the disk storage account type.
     *
     * @return the disk storage account type
     */
    public StorageAccountTypes storageAccountType() {
        return storageAccountType;
    }

    /**
     * Gets the disk caching type.
     *
     * @return the disk caching type
     */
    public CachingTypes cachingTypes() {
        return cachingTypes;
    }

    /**
     * Gets the disk delete options.
     *
     * @return the disk delete options
     */
    public DeleteOptions deleteOptions() {
        return deleteOptions;
    }

    /**
     * Gets whether the write accelerator is enabled. {@literal null} if no change.
     *
     * @return whether the write accelerator is enabled
     */
    public Boolean writeAcceleratorEnabled() {
        return writeAcceleratorEnabled;
    }

    /**
     * Checks whether disk encryption set is configured.
     *
     * @return whether disk encryption set is configured,
     * either as the ID of disk encryption set, or as {@code null} to override default configuration.
     */
    public boolean isDiskEncryptionSetConfigured() {
        return diskEncryptionSetOptions != null;
    }

    /**
     * Gets the ID of disk encryption set.
     *
     * @return the ID of disk encryption set
     */
    public String diskEncryptionSetId() {
        if (diskEncryptionSetOptions == null) {
            return null;
        }
        return diskEncryptionSetOptions.id();
    }

    /**
     * Sets the storage account type.
     * <p>
     * Storage account type configured here will not work when attaching a disk.
     *
     * @param storageAccountType the storage account type
     * @return self
     */
    public VirtualMachineDiskOptions withStorageAccountTypes(StorageAccountTypes storageAccountType) {
        this.storageAccountType = storageAccountType;
        return this;
    }

    /**
     * Sets the caching type.
     *
     * @param cachingTypes the caching type
     * @return self
     */
    public VirtualMachineDiskOptions withCachingTypes(CachingTypes cachingTypes) {
        this.cachingTypes = cachingTypes;
        return this;
    }

    /**
     * Sets the delete options of the disk, when the virtual machine is deleted.
     *
     * @param deleteOptions the delete options
     * @return self
     */
    public VirtualMachineDiskOptions withDeleteOptions(DeleteOptions deleteOptions) {
        this.deleteOptions = deleteOptions;
        return this;
    }

    /**
     * Enables/disables the write accelerator.
     * <p>
     * Write Accelerator is generally available for M-series VMs in the Public Cloud.
     * Enabling write accelerator for the operating system disk of the VM will reboot the VM.
     * The Premium disk caching must be set to 'None' or 'Read Only'. All other caching modes are not supported.
     *
     * @param writeAcceleratorEnabled whether to enable the write accelerator
     * @return self
     */
    public VirtualMachineDiskOptions withWriteAcceleratorEnabled(boolean writeAcceleratorEnabled) {
        this.writeAcceleratorEnabled = writeAcceleratorEnabled;
        return this;
    }

    /**
     * Sets the ID of disk encryption set.
     *
     * {@code null} to indicate that do not configure disk encryption set.
     * If disk is already encrypted with customer-managed key, it remains so when attached.
     *
     * @param diskEncryptionSetId the ID of disk encryption set
     * @return self
     */
    public VirtualMachineDiskOptions withDiskEncryptionSet(String diskEncryptionSetId) {
        if (CoreUtils.isNullOrEmpty(diskEncryptionSetId)) {
            // set DiskEncryptionSet as signal that disk encryption set is configured
            if (this.diskEncryptionSetOptions == null) {
                this.diskEncryptionSetOptions = new DiskEncryptionSetParameters();
            }
            this.diskEncryptionSetOptions.withId(null);
        } else {
            if (this.diskEncryptionSetOptions == null) {
                this.diskEncryptionSetOptions = new DiskEncryptionSetParameters();
            }
            this.diskEncryptionSetOptions.withId(diskEncryptionSetId);
        }
        return this;
    }
}
