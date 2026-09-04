package com.google.android.exoplayer2.source.dash.manifest;

/* JADX INFO: compiled from: UtcTimingElement.java */
/* JADX INFO: loaded from: classes7.dex */
public final class o {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f47971a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f47972b;

    public o(String str, String str2) {
        this.f47971a = str;
        this.f47972b = str2;
    }

    public String toString() {
        String str = this.f47971a;
        String str2 = this.f47972b;
        StringBuilder sb2 = new StringBuilder(String.valueOf(str).length() + 2 + String.valueOf(str2).length());
        sb2.append(str);
        sb2.append(", ");
        sb2.append(str2);
        return sb2.toString();
    }
}
