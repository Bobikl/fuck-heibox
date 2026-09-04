package com.google.android.exoplayer2.source.dash.manifest;

import android.net.Uri;
import androidx.annotation.p0;
import com.google.android.exoplayer2.util.q0;

/* JADX INFO: compiled from: RangedUri.java */
/* JADX INFO: loaded from: classes7.dex */
public final class i {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final long f47917a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final long f47918b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final String f47919c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private int f47920d;

    public i(@p0 String str, long j10, long j11) {
        this.f47919c = str == null ? "" : str;
        this.f47917a = j10;
        this.f47918b = j11;
    }

    @p0
    public i a(@p0 i iVar, String str) {
        String strC = c(str);
        if (iVar != null && strC.equals(iVar.c(str))) {
            long j10 = this.f47918b;
            if (j10 != -1) {
                long j11 = this.f47917a;
                if (j11 + j10 == iVar.f47917a) {
                    long j12 = iVar.f47918b;
                    return new i(strC, j11, j12 != -1 ? j10 + j12 : -1L);
                }
            }
            long j13 = iVar.f47918b;
            if (j13 != -1) {
                long j14 = iVar.f47917a;
                if (j14 + j13 == this.f47917a) {
                    return new i(strC, j14, j10 != -1 ? j13 + j10 : -1L);
                }
            }
        }
        return null;
    }

    public Uri b(String str) {
        return q0.f(str, this.f47919c);
    }

    public String c(String str) {
        return q0.e(str, this.f47919c);
    }

    public boolean equals(@p0 Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || i.class != obj.getClass()) {
            return false;
        }
        i iVar = (i) obj;
        return this.f47917a == iVar.f47917a && this.f47918b == iVar.f47918b && this.f47919c.equals(iVar.f47919c);
    }

    public int hashCode() {
        if (this.f47920d == 0) {
            this.f47920d = ((((bb.c.b.f30674h7 + ((int) this.f47917a)) * 31) + ((int) this.f47918b)) * 31) + this.f47919c.hashCode();
        }
        return this.f47920d;
    }

    public String toString() {
        String str = this.f47919c;
        long j10 = this.f47917a;
        long j11 = this.f47918b;
        StringBuilder sb2 = new StringBuilder(String.valueOf(str).length() + 81);
        sb2.append("RangedUri(referenceUri=");
        sb2.append(str);
        sb2.append(", start=");
        sb2.append(j10);
        sb2.append(", length=");
        sb2.append(j11);
        sb2.append(")");
        return sb2.toString();
    }
}
