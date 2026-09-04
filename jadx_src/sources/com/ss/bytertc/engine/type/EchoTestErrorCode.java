package com.ss.bytertc.engine.type;

/* JADX INFO: loaded from: classes4.dex */
public enum EchoTestErrorCode {
    ECHO_TEST_RESULT_SUCCESS(0),
    ECHO_TEST_RESULT_TIMEOUT(1),
    ECHO_TEST_RESULT_SHORT_INTERVAL(2),
    ECHO_TEST_RESULT_AUDIO_DEVICE_ERROR(3),
    ECHO_TEST_RESULT_VIDEO_DEVICE_ERROR(4),
    ECHO_TEST_RESULT_AUDIO_RECEIVE_ERROR(5),
    ECHO_TEST_RESULT_VIDEO_RECEIVE_ERROR(6),
    ECHO_TEST_RESULT_INTERNAL_ERROR(7);

    private int value;

    EchoTestErrorCode(int i10) {
        this.value = i10;
    }

    public static EchoTestErrorCode fromId(int i10) {
        for (EchoTestErrorCode echoTestErrorCode : values()) {
            if (echoTestErrorCode.value() == i10) {
                return echoTestErrorCode;
            }
        }
        return ECHO_TEST_RESULT_SUCCESS;
    }

    public int value() {
        return this.value;
    }
}
