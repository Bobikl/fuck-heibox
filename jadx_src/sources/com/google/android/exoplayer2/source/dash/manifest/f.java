package com.google.android.exoplayer2.source.dash.manifest;

import com.google.android.exoplayer2.metadata.emsg.EventMessage;

/* JADX INFO: compiled from: EventStream.java */
/* JADX INFO: loaded from: classes7.dex */
public final class f {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final EventMessage[] f47902a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final long[] f47903b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f47904c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final String f47905d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final long f47906e;

    public f(String str, String str2, long j10, long[] jArr, EventMessage[] eventMessageArr) {
        this.f47904c = str;
        this.f47905d = str2;
        this.f47906e = j10;
        this.f47903b = jArr;
        this.f47902a = eventMessageArr;
    }

    public String a() {
        String str = this.f47904c;
        String str2 = this.f47905d;
        StringBuilder sb2 = new StringBuilder(String.valueOf(str).length() + 1 + String.valueOf(str2).length());
        sb2.append(str);
        sb2.append("/");
        sb2.append(str2);
        return sb2.toString();
    }
}
