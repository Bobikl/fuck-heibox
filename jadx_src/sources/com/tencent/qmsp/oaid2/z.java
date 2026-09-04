package com.tencent.qmsp.oaid2;

/* JADX INFO: loaded from: classes4.dex */
public class z {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f101672a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public long f101673b = System.currentTimeMillis() + 86400000;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public String f101674c;

    public z(String str, int i10) {
        this.f101674c = str;
        this.f101672a = i10;
    }

    public String toString() {
        return "ValueData{value='" + this.f101674c + "', code=" + this.f101672a + ", expired=" + this.f101673b + '}';
    }
}
