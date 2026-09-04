package com.tencent.liteav.videoproducer.a;

import java.util.Locale;

/* JADX INFO: loaded from: classes4.dex */
public final class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f100678a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f100679b;

    public a(int i10, int i11) {
        this.f100678a = i10;
        this.f100679b = i11;
    }

    public final String toString() {
        return String.format(Locale.ENGLISH, "[%d, %d]", Integer.valueOf(this.f100678a), Integer.valueOf(this.f100679b));
    }
}
