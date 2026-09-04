package com.igexin.push.core;

import android.os.Handler;
import android.os.HandlerThread;

/* JADX INFO: loaded from: classes.dex */
public final class t {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    final /* synthetic */ r f63780a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final Handler f63781b;

    t(r rVar) {
        this.f63780a = rVar;
        HandlerThread handlerThread = new HandlerThread("GTIS-HANDLER");
        handlerThread.start();
        this.f63781b = new u(this, handlerThread.getLooper(), rVar);
    }

    Handler a() {
        return this.f63781b;
    }
}
