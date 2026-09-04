package com.tencent.liteav.videobase.b;

import java.util.List;

/* JADX INFO: loaded from: classes4.dex */
public final /* synthetic */ class c implements Runnable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final b f100231a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final List f100232b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final List f100233c;

    private c(b bVar, List list, List list2) {
        this.f100231a = bVar;
        this.f100232b = list;
        this.f100233c = list2;
    }

    public static Runnable a(b bVar, List list, List list2) {
        return new c(bVar, list, list2);
    }

    @Override // java.lang.Runnable
    public final void run() {
        b.a(this.f100231a, this.f100232b, this.f100233c);
    }
}
