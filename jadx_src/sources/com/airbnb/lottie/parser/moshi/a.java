package com.airbnb.lottie.parser.moshi;

import kotlin.text.y;

/* JADX INFO: compiled from: JsonScope.java */
/* JADX INFO: loaded from: classes6.dex */
public final class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    static final int f37760a = 1;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    static final int f37761b = 2;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    static final int f37762c = 3;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    static final int f37763d = 4;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    static final int f37764e = 5;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    static final int f37765f = 6;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    static final int f37766g = 7;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    static final int f37767h = 8;

    private a() {
    }

    static String a(int i10, int[] iArr, String[] strArr, int[] iArr2) {
        StringBuilder sb2 = new StringBuilder();
        sb2.append(y.f128594c);
        for (int i11 = 0; i11 < i10; i11++) {
            int i12 = iArr[i11];
            if (i12 == 1 || i12 == 2) {
                sb2.append('[');
                sb2.append(iArr2[i11]);
                sb2.append(']');
            } else if (i12 == 3 || i12 == 4 || i12 == 5) {
                sb2.append(lg.a.f131414g);
                String str = strArr[i11];
                if (str != null) {
                    sb2.append(str);
                }
            }
        }
        return sb2.toString();
    }
}
