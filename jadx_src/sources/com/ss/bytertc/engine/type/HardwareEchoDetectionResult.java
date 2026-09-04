package com.ss.bytertc.engine.type;

/* JADX INFO: loaded from: classes4.dex */
public enum HardwareEchoDetectionResult {
    HARDWARE_ECHO_RESULT_CANCELED(0),
    HARDWARE_ECHO_RESULT_UNKNOWN(1),
    HARDWARE_ECHO_RESULT_NORMAL(2),
    HARDWARE_ECHO_RESULT_POOR(3);

    private final int value;

    HardwareEchoDetectionResult(int i10) {
        this.value = i10;
    }

    public static HardwareEchoDetectionResult fromId(int i10) {
        for (HardwareEchoDetectionResult hardwareEchoDetectionResult : values()) {
            if (hardwareEchoDetectionResult.value() == i10) {
                return hardwareEchoDetectionResult;
            }
        }
        return HARDWARE_ECHO_RESULT_NORMAL;
    }

    public int value() {
        return this.value;
    }
}
