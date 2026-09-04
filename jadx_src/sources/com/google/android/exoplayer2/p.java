package com.google.android.exoplayer2;

import android.os.Bundle;
import java.lang.annotation.Documented;
import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

/* JADX INFO: compiled from: DeviceInfo.java */
/* JADX INFO: loaded from: classes7.dex */
public final class p implements i {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final int f47308e = 0;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final int f47309f = 1;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private static final int f47311h = 0;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private static final int f47312i = 1;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private static final int f47313j = 2;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f47315b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final int f47316c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final int f47317d;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static final p f47310g = new p(0, 0, 0);

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public static final i.a<p> f47314k = new i.a() { // from class: com.google.android.exoplayer2.o
        @Override // com.google.android.exoplayer2.i.a
        public final i a(Bundle bundle) {
            return p.d(bundle);
        }
    };

    /* JADX INFO: compiled from: DeviceInfo.java */
    @Target({ElementType.TYPE_USE})
    @Documented
    @Retention(RetentionPolicy.SOURCE)
    public @interface a {
    }

    public p(int i10, int i11, int i12) {
        this.f47315b = i10;
        this.f47316c = i11;
        this.f47317d = i12;
    }

    private static String c(int i10) {
        return Integer.toString(i10, 36);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ p d(Bundle bundle) {
        return new p(bundle.getInt(c(0), 0), bundle.getInt(c(1), 0), bundle.getInt(c(2), 0));
    }

    @Override // com.google.android.exoplayer2.i
    public Bundle a() {
        Bundle bundle = new Bundle();
        bundle.putInt(c(0), this.f47315b);
        bundle.putInt(c(1), this.f47316c);
        bundle.putInt(c(2), this.f47317d);
        return bundle;
    }

    public boolean equals(@androidx.annotation.p0 Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof p)) {
            return false;
        }
        p pVar = (p) obj;
        return this.f47315b == pVar.f47315b && this.f47316c == pVar.f47316c && this.f47317d == pVar.f47317d;
    }

    public int hashCode() {
        return ((((bb.c.b.f30674h7 + this.f47315b) * 31) + this.f47316c) * 31) + this.f47317d;
    }
}
