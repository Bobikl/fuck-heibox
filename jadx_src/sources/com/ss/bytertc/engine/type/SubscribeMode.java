package com.ss.bytertc.engine.type;

/* JADX INFO: loaded from: classes4.dex */
public enum SubscribeMode {
    AUTO_SUBSCRIBE_MODE(0),
    MANUAL_SUBSCRIBE_MODE(1);

    private int value;

    SubscribeMode(int i10) {
        this.value = i10;
    }

    public int value() {
        return this.value;
    }
}
