package com.tencent.liteav.audio;

import android.content.Context;

/* JADX INFO: loaded from: classes4.dex */
public class TXCAudioUGCRecorder {
    private static final TXCAudioUGCRecorder INSTANCE = new TXCAudioUGCRecorder();

    private TXCAudioUGCRecorder() {
    }

    public static TXCAudioUGCRecorder getInstance() {
        return INSTANCE;
    }

    public synchronized boolean getIsMute() {
        return false;
    }

    public void setAECType(int i10, Context context) {
    }
}
