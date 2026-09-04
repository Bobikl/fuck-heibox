package com.google.android.exoplayer2;

/* JADX INFO: compiled from: RendererConfiguration.java */
/* JADX INFO: loaded from: classes7.dex */
public final class p3 {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final p3 f47322b = new p3(false);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final boolean f47323a;

    public p3(boolean z10) {
        this.f47323a = z10;
    }

    public boolean equals(@androidx.annotation.p0 Object obj) {
        if (this == obj) {
            return true;
        }
        return obj != null && p3.class == obj.getClass() && this.f47323a == ((p3) obj).f47323a;
    }

    public int hashCode() {
        return !this.f47323a ? 1 : 0;
    }
}
