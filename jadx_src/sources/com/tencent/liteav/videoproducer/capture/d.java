package com.tencent.liteav.videoproducer.capture;

import java.util.Comparator;

/* JADX INFO: loaded from: classes4.dex */
public final /* synthetic */ class d implements Comparator {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final d f100766a = new d();

    private d() {
    }

    public static Comparator a() {
        return f100766a;
    }

    @Override // java.util.Comparator
    public final int compare(Object obj, Object obj2) {
        com.tencent.liteav.videoproducer.a.a aVar = (com.tencent.liteav.videoproducer.a.a) obj;
        com.tencent.liteav.videoproducer.a.a aVar2 = (com.tencent.liteav.videoproducer.a.a) obj2;
        int i10 = aVar.f100678a;
        int i11 = aVar2.f100678a;
        if (i10 < i11) {
            return -1;
        }
        if (i10 == i11) {
            return aVar.f100679b - aVar2.f100679b;
        }
        return 1;
    }
}
