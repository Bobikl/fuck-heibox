package com.ss.bytertc.engine.type;

/* JADX INFO: loaded from: classes4.dex */
public enum MessageConfig {
    RELIABLE_ORDERED(0),
    UNRELIABLE_ORDERED(1),
    UNRELIABLE_UNORDERED(2);

    int value;

    MessageConfig(int i10) {
        this.value = i10;
    }

    public static MessageConfig fromId(int i10) {
        for (MessageConfig messageConfig : values()) {
            if (messageConfig.value() == i10) {
                return messageConfig;
            }
        }
        return RELIABLE_ORDERED;
    }

    public int value() {
        return this.value;
    }
}
