package com.ss.bytertc.engine.type;

/* JADX INFO: loaded from: classes4.dex */
public enum NetworkDetectionStopReason {
    USER(0),
    TIMEOUT(1),
    CONNECTION_LOST(2),
    STREAMING(3),
    INNER_ERR(4);

    int value;

    NetworkDetectionStopReason(int i10) {
        this.value = i10;
    }

    public static NetworkDetectionStopReason fromId(int i10) {
        for (NetworkDetectionStopReason networkDetectionStopReason : values()) {
            if (networkDetectionStopReason.value() == i10) {
                return networkDetectionStopReason;
            }
        }
        return USER;
    }

    public int value() {
        return this.value;
    }
}
