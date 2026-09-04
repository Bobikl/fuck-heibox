package com.ss.bytertc.engine.video;

/* JADX INFO: loaded from: classes4.dex */
public enum RemoteVideoRenderPosition {
    AFTER_DECODER(0),
    AFTER_POST_PROCESS(1);

    private int value;

    RemoteVideoRenderPosition(int i10) {
        this.value = i10;
    }

    public static RemoteVideoRenderPosition convertFromInt(int i10) {
        return values()[i10];
    }

    public int getValue() {
        return this.value;
    }
}
