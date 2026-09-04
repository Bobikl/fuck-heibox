package com.google.android.exoplayer2.extractor;

import androidx.annotation.p0;

/* JADX INFO: compiled from: SeekPoint.java */
/* JADX INFO: loaded from: classes7.dex */
public final class c0 {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final c0 f44854c = new c0(0, 0);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final long f44855a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final long f44856b;

    public c0(long j10, long j11) {
        this.f44855a = j10;
        this.f44856b = j11;
    }

    public boolean equals(@p0 Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || c0.class != obj.getClass()) {
            return false;
        }
        c0 c0Var = (c0) obj;
        return this.f44855a == c0Var.f44855a && this.f44856b == c0Var.f44856b;
    }

    public int hashCode() {
        return (((int) this.f44855a) * 31) + ((int) this.f44856b);
    }

    public String toString() {
        long j10 = this.f44855a;
        long j11 = this.f44856b;
        StringBuilder sb2 = new StringBuilder(60);
        sb2.append("[timeUs=");
        sb2.append(j10);
        sb2.append(", position=");
        sb2.append(j11);
        sb2.append("]");
        return sb2.toString();
    }
}
