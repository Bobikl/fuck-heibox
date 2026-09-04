package com.tencent.liteav.base.util;

import java.util.concurrent.ThreadFactory;

/* JADX INFO: loaded from: classes4.dex */
public final /* synthetic */ class n implements ThreadFactory {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final String f99725a;

    private n(String str) {
        this.f99725a = str;
    }

    public static ThreadFactory a(String str) {
        return new n(str);
    }

    @Override // java.util.concurrent.ThreadFactory
    public final Thread newThread(Runnable runnable) {
        return new Thread(runnable, this.f99725a);
    }
}
