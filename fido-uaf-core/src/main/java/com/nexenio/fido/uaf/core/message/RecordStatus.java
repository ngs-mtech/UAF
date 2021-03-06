package com.nexenio.fido.uaf.core.message;

public enum RecordStatus {
    INVALID_USERNAME,
    SUCCESS,
    ASSERTIONS_CHECK_FAILED,
    INVALID_SERVER_DATA_EXPIRED,
    INVALID_SERVER_DATA_SIGNATURE_NO_MATCH,
    INVALID_SERVER_DATA_CHECK_FAILED,
    STORAGE_ERROR,
    CONSTRAINT_ERROR,
    FAILED_SIGNATURE_NOT_VALID,
    FAILED_SIGNATURE_VERIFICATION,
    FAILED_ASSERTION_VERIFICATION
}
