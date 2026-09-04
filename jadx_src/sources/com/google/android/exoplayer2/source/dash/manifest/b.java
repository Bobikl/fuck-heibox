package com.google.android.exoplayer2.source.dash.manifest;

import androidx.annotation.p0;
import com.google.common.base.s;

/* JADX INFO: compiled from: BaseUrl.java */
/* JADX INFO: loaded from: classes7.dex */
public final class b {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final int f47867e = 1;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final int f47868f = 1;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f47869a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f47870b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final int f47871c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final int f47872d;

    public b(String str) {
        this(str, str, 1, 1);
    }

    public b(String str, String str2, int i10, int i11) {
        this.f47869a = str;
        this.f47870b = str2;
        this.f47871c = i10;
        this.f47872d = i11;
    }

    public boolean equals(@p0 Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof b)) {
            return false;
        }
        b bVar = (b) obj;
        return this.f47871c == bVar.f47871c && this.f47872d == bVar.f47872d && s.a(this.f47869a, bVar.f47869a) && s.a(this.f47870b, bVar.f47870b);
    }

    public int hashCode() {
        return s.b(this.f47869a, this.f47870b, Integer.valueOf(this.f47871c), Integer.valueOf(this.f47872d));
    }
}
