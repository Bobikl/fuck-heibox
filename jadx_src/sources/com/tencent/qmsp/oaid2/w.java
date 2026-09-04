package com.tencent.qmsp.oaid2;

/* JADX INFO: loaded from: classes4.dex */
public class w {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f101661a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public long f101662b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public String f101663c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public String f101664d;

    public w(String str) {
        this.f101663c = str;
    }

    public void a(int i10) {
        this.f101661a = i10;
    }

    public void a(long j10) {
        this.f101662b = j10;
    }

    public void a(String str) {
        this.f101664d = str;
    }

    public boolean a() {
        return this.f101662b > System.currentTimeMillis();
    }

    public void b() {
        this.f101662b = 0L;
    }
}
