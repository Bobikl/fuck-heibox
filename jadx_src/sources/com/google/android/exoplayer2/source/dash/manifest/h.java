package com.google.android.exoplayer2.source.dash.manifest;

import androidx.annotation.p0;
import com.google.android.exoplayer2.util.u0;

/* JADX INFO: compiled from: ProgramInformation.java */
/* JADX INFO: loaded from: classes7.dex */
public final class h {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @p0
    public final String f47912a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @p0
    public final String f47913b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @p0
    public final String f47914c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @p0
    public final String f47915d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    @p0
    public final String f47916e;

    public h(@p0 String str, @p0 String str2, @p0 String str3, @p0 String str4, @p0 String str5) {
        this.f47912a = str;
        this.f47913b = str2;
        this.f47914c = str3;
        this.f47915d = str4;
        this.f47916e = str5;
    }

    public boolean equals(@p0 Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof h)) {
            return false;
        }
        h hVar = (h) obj;
        return u0.c(this.f47912a, hVar.f47912a) && u0.c(this.f47913b, hVar.f47913b) && u0.c(this.f47914c, hVar.f47914c) && u0.c(this.f47915d, hVar.f47915d) && u0.c(this.f47916e, hVar.f47916e);
    }

    public int hashCode() {
        String str = this.f47912a;
        int iHashCode = (bb.c.b.f30674h7 + (str != null ? str.hashCode() : 0)) * 31;
        String str2 = this.f47913b;
        int iHashCode2 = (iHashCode + (str2 != null ? str2.hashCode() : 0)) * 31;
        String str3 = this.f47914c;
        int iHashCode3 = (iHashCode2 + (str3 != null ? str3.hashCode() : 0)) * 31;
        String str4 = this.f47915d;
        int iHashCode4 = (iHashCode3 + (str4 != null ? str4.hashCode() : 0)) * 31;
        String str5 = this.f47916e;
        return iHashCode4 + (str5 != null ? str5.hashCode() : 0);
    }
}
