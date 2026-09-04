package com.tencent.liteav.videoproducer.capture;

import java.util.Comparator;

/* JADX INFO: loaded from: classes4.dex */
public final /* synthetic */ class e implements Comparator {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final e f100767a = new e();

    private e() {
    }

    public static Comparator a() {
        return f100767a;
    }

    @Override // java.util.Comparator
    public final int compare(Object obj, Object obj2) {
        return ((com.tencent.liteav.videoproducer.a.a) obj).f100679b - ((com.tencent.liteav.videoproducer.a.a) obj2).f100679b;
    }
}
