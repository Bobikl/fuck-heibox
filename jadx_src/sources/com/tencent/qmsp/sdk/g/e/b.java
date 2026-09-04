package com.tencent.qmsp.sdk.g.e;

/* JADX INFO: loaded from: classes4.dex */
public class b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f101991a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public long f101992b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public String f101993c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public String f101994d;

    public b(String str) {
        this.f101993c = str;
    }

    public void a(int i10) {
        this.f101991a = i10;
    }

    public void a(long j10) {
        this.f101992b = j10;
    }

    public void a(String str) {
        this.f101994d = str;
    }

    public boolean a() {
        return this.f101992b > System.currentTimeMillis();
    }

    public void b() {
        this.f101992b = 0L;
    }
}
