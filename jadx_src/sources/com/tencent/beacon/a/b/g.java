package com.tencent.beacon.a.b;

/* JADX INFO: compiled from: AttaReport.java */
/* JADX INFO: loaded from: classes4.dex */
public class g extends e {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private static volatile g f98759d;

    private g() {
    }

    public static g e() {
        if (f98759d == null) {
            synchronized (g.class) {
                if (f98759d == null) {
                    f98759d = new g();
                }
            }
        }
        return f98759d;
    }

    @Override // com.tencent.beacon.a.b.e
    String b() {
        return "00400014144";
    }

    @Override // com.tencent.beacon.a.b.e
    String c() {
        return "6478159937";
    }
}
