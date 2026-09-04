package com.google.android.exoplayer2.source.dash.manifest;

import androidx.annotation.p0;
import com.google.android.exoplayer2.util.u0;

/* JADX INFO: compiled from: Descriptor.java */
/* JADX INFO: loaded from: classes7.dex */
public final class e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f47899a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @p0
    public final String f47900b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @p0
    public final String f47901c;

    public e(String str, @p0 String str2, @p0 String str3) {
        this.f47899a = str;
        this.f47900b = str2;
        this.f47901c = str3;
    }

    public boolean equals(@p0 Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || e.class != obj.getClass()) {
            return false;
        }
        e eVar = (e) obj;
        return u0.c(this.f47899a, eVar.f47899a) && u0.c(this.f47900b, eVar.f47900b) && u0.c(this.f47901c, eVar.f47901c);
    }

    public int hashCode() {
        int iHashCode = this.f47899a.hashCode() * 31;
        String str = this.f47900b;
        int iHashCode2 = (iHashCode + (str != null ? str.hashCode() : 0)) * 31;
        String str2 = this.f47901c;
        return iHashCode2 + (str2 != null ? str2.hashCode() : 0);
    }
}
