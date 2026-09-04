package com.igexin.push.core;

import android.os.HandlerThread;

/* JADX INFO: loaded from: classes.dex */
public class f extends HandlerThread {
    public f() {
        super("CoreThread");
    }

    @Override // android.os.HandlerThread
    protected void onLooperPrepared() {
        c.a().c();
    }
}
