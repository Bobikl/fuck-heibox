package com.tencent.liteav.videoproducer.capture;

import com.tencent.liteav.base.util.Size;
import java.util.Comparator;

/* JADX INFO: loaded from: classes4.dex */
public final /* synthetic */ class c implements Comparator {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final c f100765a = new c();

    private c() {
    }

    public static Comparator a() {
        return f100765a;
    }

    @Override // java.util.Comparator
    public final int compare(Object obj, Object obj2) {
        return ((Size) obj2).getArea() - ((Size) obj).getArea();
    }
}
