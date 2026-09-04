package com.ss.bytertc.engine.type;

/* JADX INFO: loaded from: classes4.dex */
public enum SEIStreamUpdateEvent {
    STREAM_ADD(0),
    STREAM_REMOVE(1);

    int value;

    SEIStreamUpdateEvent(int i10) {
        this.value = i10;
    }

    public int value() {
        return this.value;
    }
}
