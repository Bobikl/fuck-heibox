package com.igexin.a.a.b;

/* JADX INFO: loaded from: classes7.dex */
public abstract class b {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    protected String f63179c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    protected b f63180d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    protected b f63181e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    protected boolean f63182f;

    public b(String str, boolean z10) {
        this.f63179c = str;
        this.f63182f = z10;
    }

    public abstract Object a(d dVar, Object obj) throws Exception;

    protected final void a(b bVar) {
        if (bVar == null) {
            return;
        }
        b bVar2 = bVar.f63180d;
        bVar.f63180d = this;
        this.f63181e = bVar;
        this.f63180d = bVar2;
    }

    public void a(boolean z10) {
        if (this.f63182f && !z10) {
            return;
        }
        while (true) {
            b bVar = this.f63180d;
            if (bVar == null) {
                return;
            }
            b bVar2 = bVar.f63180d;
            bVar.f63180d = null;
            this.f63180d = bVar2;
        }
    }

    public abstract Object c(d dVar, Object obj) throws Exception;

    public final Object d(d dVar, Object obj) throws Exception {
        if (obj == null) {
            throw new NullPointerException("Nothing to encode!");
        }
        b bVar = this.f63180d;
        if (bVar != null) {
            obj = bVar.d(dVar, obj);
        }
        return a(dVar, obj);
    }
}
