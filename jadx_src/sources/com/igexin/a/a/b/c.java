package com.igexin.a.a.b;

import com.igexin.a.a.d.f;
import java.util.concurrent.TimeUnit;

/* JADX INFO: loaded from: classes7.dex */
public class c extends f {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    static c f63183a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public volatile long f63184b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public volatile long f63185c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public volatile long f63186d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public volatile long f63187e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    com.igexin.a.a.d.a.a<String, Integer, b, d> f63188f;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    private byte[] f63189v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    private byte[] f63190w;

    public static c b() {
        if (f63183a == null) {
            f63183a = new c();
        }
        return f63183a;
    }

    public static void d() {
        f63183a.f63184b = 0L;
        f63183a.f63186d = 0L;
        f63183a.f63185c = 0L;
        f63183a.f63187e = 0L;
    }

    public d a(String str, int i10, b bVar, Object obj, boolean z10) {
        return a(str, i10, bVar, obj, z10, -1, -1L, (byte) 0, null, null);
    }

    public d a(String str, int i10, b bVar, Object obj, boolean z10, int i11, long j10, byte b10, Object obj2, com.igexin.a.a.d.a.c cVar) {
        return a(str, i10, bVar, obj, z10, i11, j10, b10, obj2, cVar, 0, null);
    }

    public d a(String str, int i10, b bVar, Object obj, boolean z10, int i11, long j10, byte b10, Object obj2, com.igexin.a.a.d.a.c cVar, int i12, com.igexin.a.a.d.a.f fVar) {
        d dVar;
        com.igexin.a.a.d.a.a<String, Integer, b, d> aVar = this.f63188f;
        if (aVar == null || (dVar = (d) aVar.a(str, Integer.valueOf(i10), bVar)) == null || dVar.r()) {
            return null;
        }
        if (fVar != null) {
            dVar.a(i12, fVar);
        }
        a(dVar, obj, z10, i11, j10, b10, obj2, cVar);
        return dVar;
    }

    public d a(String str, int i10, b bVar, Object obj, boolean z10, int i11, com.igexin.a.a.d.a.f fVar) {
        return a(str, i10, bVar, obj, z10, -1, -1L, (byte) 0, null, null, i11, fVar);
    }

    public void a(com.igexin.a.a.d.a.a<String, Integer, b, d> aVar) {
        this.f63188f = aVar;
    }

    public void a(byte[] bArr) {
        this.f63189v = bArr;
        this.f63190w = com.igexin.a.b.a.a(bArr);
    }

    boolean a(d dVar, Object obj, boolean z10, int i10, long j10, byte b10, Object obj2, com.igexin.a.a.d.a.c cVar) {
        dVar.f63193c = obj;
        dVar.a(j10, TimeUnit.MILLISECONDS);
        dVar.f63244w = i10;
        dVar.a(b10);
        dVar.B = obj2;
        dVar.a(cVar);
        return a(dVar, z10);
    }

    public byte[] a() {
        return this.f63190w;
    }

    public final void c() {
        f();
    }
}
