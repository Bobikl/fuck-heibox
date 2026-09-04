package com.tencent.liteav.base.util;

import android.os.MessageQueue;

/* JADX INFO: loaded from: classes4.dex */
public final /* synthetic */ class d implements MessageQueue.IdleHandler {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final CustomHandler f99700a;

    private d(CustomHandler customHandler) {
        this.f99700a = customHandler;
    }

    public static MessageQueue.IdleHandler a(CustomHandler customHandler) {
        return new d(customHandler);
    }

    @Override // android.os.MessageQueue.IdleHandler
    public final boolean queueIdle() {
        return CustomHandler.lambda$quitLooper$2(this.f99700a);
    }
}
