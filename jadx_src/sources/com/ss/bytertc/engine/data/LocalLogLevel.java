package com.ss.bytertc.engine.data;

/* JADX INFO: loaded from: classes4.dex */
public enum LocalLogLevel {
    INFO(0),
    WARNING(1),
    ERROR(2),
    NONE(3);

    private int value;

    LocalLogLevel(int i10) {
        this.value = i10;
    }

    public static LocalLogLevel fromId(int i10) {
        for (LocalLogLevel localLogLevel : values()) {
            if (localLogLevel.getValue() == i10) {
                return localLogLevel;
            }
        }
        return WARNING;
    }

    public int getValue() {
        return this.value;
    }
}
