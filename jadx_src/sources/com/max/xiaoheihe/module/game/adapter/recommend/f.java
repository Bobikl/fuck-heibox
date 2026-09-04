package com.max.xiaoheihe.module.game.adapter.recommend;

import androidx.annotation.f0;
import com.meituan.robust.ChangeQuickRedirect;

/* JADX INFO: compiled from: ViewTypeIndex.kt */
/* JADX INFO: loaded from: classes11.dex */
public final class f {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final int f86300a = 22;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final int f86301b = 2097152;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final int f86302c = -4194304;
    public static ChangeQuickRedirect changeQuickRedirect;

    public static final int a(int i10) {
        return i10 & 4194303;
    }

    public static final int b(int i10) {
        return i10 & f86302c;
    }

    public static final int c(@f0(from = 0, to = 2097152) int i10, int i11) {
        return (i10 & 4194303) | (i11 & f86302c);
    }
}
