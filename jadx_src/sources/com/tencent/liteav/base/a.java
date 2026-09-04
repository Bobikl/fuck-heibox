package com.tencent.liteav.base;

import java.util.concurrent.Callable;

/* JADX INFO: loaded from: classes4.dex */
public final /* synthetic */ class a implements Callable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final a f99559a = new a();

    private a() {
    }

    public static Callable a() {
        return f99559a;
    }

    @Override // java.util.concurrent.Callable
    public final Object call() {
        return PathUtils.setPrivateDataDirectorySuffixInternal();
    }
}
