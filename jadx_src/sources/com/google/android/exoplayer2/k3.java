package com.google.android.exoplayer2;

import android.os.Bundle;

/* JADX INFO: compiled from: Rating.java */
/* JADX INFO: loaded from: classes7.dex */
public abstract class k3 implements i {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final float f46514b = -1.0f;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    static final int f46515c = -1;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    static final int f46516d = 0;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    static final int f46517e = 1;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    static final int f46518f = 2;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    static final int f46519g = 3;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    static final int f46520h = 0;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public static final i.a<k3> f46521i = new i.a() { // from class: com.google.android.exoplayer2.j3
        @Override // com.google.android.exoplayer2.i.a
        public final i a(Bundle bundle) {
            return k3.c(bundle);
        }
    };

    k3() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static k3 c(Bundle bundle) {
        int i10 = bundle.getInt(e(0), -1);
        if (i10 == 0) {
            return (k3) e2.f44780o.a(bundle);
        }
        if (i10 == 1) {
            return (k3) x2.f52041m.a(bundle);
        }
        if (i10 == 2) {
            return (k3) u3.f50377p.a(bundle);
        }
        if (i10 == 3) {
            return (k3) x3.f52046o.a(bundle);
        }
        StringBuilder sb2 = new StringBuilder(44);
        sb2.append("Encountered unknown rating type: ");
        sb2.append(i10);
        throw new IllegalArgumentException(sb2.toString());
    }

    private static String e(int i10) {
        return Integer.toString(i10, 36);
    }

    public abstract boolean d();
}
