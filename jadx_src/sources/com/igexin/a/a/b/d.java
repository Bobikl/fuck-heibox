package com.igexin.a.a.b;

/* JADX INFO: loaded from: classes7.dex */
public abstract class d extends com.igexin.a.a.d.e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public String f63191a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public b f63192b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public Object f63193c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final String f63194d;

    public d(int i10, String str, b bVar) {
        super(i10);
        this.f63194d = getClass().getName();
        if (str != null) {
            this.f63191a = a(str);
        }
        this.f63192b = bVar;
    }

    public d(String str, b bVar) {
        this(0, str, bVar);
    }

    private String a(String str) {
        return e.a(e.a(str));
    }

    @Override // com.igexin.a.a.d.e
    public void f() {
        b bVar = this.f63192b;
        if (bVar != null) {
            bVar.a(false);
        }
        this.f63191a = null;
        super.f();
    }
}
