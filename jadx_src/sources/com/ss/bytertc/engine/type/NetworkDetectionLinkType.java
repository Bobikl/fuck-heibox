package com.ss.bytertc.engine.type;

/* JADX INFO: loaded from: classes4.dex */
public enum NetworkDetectionLinkType {
    UP(0),
    DOWN(1);

    int value;

    NetworkDetectionLinkType(int i10) {
        this.value = i10;
    }

    public static NetworkDetectionLinkType fromId(int i10) {
        for (NetworkDetectionLinkType networkDetectionLinkType : values()) {
            if (networkDetectionLinkType.value() == i10) {
                return networkDetectionLinkType;
            }
        }
        return UP;
    }

    public int value() {
        return this.value;
    }
}
