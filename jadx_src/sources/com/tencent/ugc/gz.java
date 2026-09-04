package com.tencent.ugc;

import android.os.Handler;
import android.os.Message;

/* JADX INFO: loaded from: classes4.dex */
public final /* synthetic */ class gz implements Handler.Callback {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final UGCVideoProcessor f103686a;

    private gz(UGCVideoProcessor uGCVideoProcessor) {
        this.f103686a = uGCVideoProcessor;
    }

    public static Handler.Callback a(UGCVideoProcessor uGCVideoProcessor) {
        return new gz(uGCVideoProcessor);
    }

    @Override // android.os.Handler.Callback
    public final boolean handleMessage(Message message) {
        return this.f103686a.handleMessage(message);
    }
}
