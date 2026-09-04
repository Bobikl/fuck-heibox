package com.tencent.beacon.a.b;

/* JADX INFO: compiled from: AttaAggregateReport.java */
/* JADX INFO: loaded from: classes4.dex */
public class f extends e {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private static volatile f f98758d;

    private f() {
    }

    public static f e() {
        if (f98758d == null) {
            synchronized (f.class) {
                if (f98758d == null) {
                    f98758d = new f();
                }
            }
        }
        return f98758d;
    }

    @Override // com.tencent.beacon.a.b.e
    String b() {
        return "03300051017";
    }

    @Override // com.tencent.beacon.a.b.e
    String c() {
        return "9462881773";
    }
}
