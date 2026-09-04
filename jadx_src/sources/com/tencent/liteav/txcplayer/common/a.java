package com.tencent.liteav.txcplayer.common;

import java.util.concurrent.Executors;
import java.util.concurrent.LinkedBlockingDeque;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

/* JADX INFO: loaded from: classes4.dex */
public final class a extends ThreadPoolExecutor {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static ThreadPoolExecutor f99897a;

    private a() {
        super(1, 3, 100L, TimeUnit.MILLISECONDS, new LinkedBlockingDeque(), Executors.defaultThreadFactory(), new ThreadPoolExecutor.AbortPolicy());
    }

    public static synchronized ThreadPoolExecutor a() {
        ThreadPoolExecutor threadPoolExecutor = f99897a;
        if (threadPoolExecutor == null || threadPoolExecutor.isShutdown()) {
            f99897a = new a();
        }
        return f99897a;
    }
}
