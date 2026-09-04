package com.tencent.liteav.base.util;

import android.os.MessageQueue;

/* JADX INFO: loaded from: classes4.dex */
public final /* synthetic */ class e implements Runnable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final CustomHandler f99701a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final MessageQueue.IdleHandler f99702b;

    private e(CustomHandler customHandler, MessageQueue.IdleHandler idleHandler) {
        this.f99701a = customHandler;
        this.f99702b = idleHandler;
    }

    public static Runnable a(CustomHandler customHandler, MessageQueue.IdleHandler idleHandler) {
        return new e(customHandler, idleHandler);
    }

    @Override // java.lang.Runnable
    public final void run() {
        CustomHandler.lambda$quitLooper$3(this.f99701a, this.f99702b);
    }
}
