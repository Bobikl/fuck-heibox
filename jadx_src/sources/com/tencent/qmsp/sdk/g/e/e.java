package com.tencent.qmsp.sdk.g.e;

/* JADX INFO: loaded from: classes4.dex */
public class e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f102002a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public long f102003b = System.currentTimeMillis() + 86400000;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public String f102004c;

    public e(String str, int i10) {
        this.f102004c = str;
        this.f102002a = i10;
    }

    public String toString() {
        return "ValueData{value='" + this.f102004c + "', code=" + this.f102002a + ", expired=" + this.f102003b + '}';
    }
}
