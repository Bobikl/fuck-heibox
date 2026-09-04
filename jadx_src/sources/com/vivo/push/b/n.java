package com.vivo.push.b;

/* JADX INFO: compiled from: OnLogReceiveCommand.java */
/* JADX INFO: loaded from: classes4.dex */
public final class n extends s {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private String f106483a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private int f106484b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private boolean f106485c;

    public n() {
        super(7);
        this.f106484b = 0;
        this.f106485c = false;
    }

    public final void a(int i10) {
        this.f106484b = i10;
    }

    public final void a(boolean z10) {
        this.f106485c = z10;
    }

    public final void b(String str) {
        this.f106483a = str;
    }

    @Override // com.vivo.push.b.s, com.vivo.push.o
    protected final void c(com.vivo.push.a aVar) {
        super.c(aVar);
        aVar.a("content", this.f106483a);
        aVar.a("log_level", this.f106484b);
        aVar.a("is_server_log", this.f106485c);
    }

    public final String d() {
        return this.f106483a;
    }

    @Override // com.vivo.push.b.s, com.vivo.push.o
    protected final void d(com.vivo.push.a aVar) {
        super.d(aVar);
        this.f106483a = aVar.a("content");
        this.f106484b = aVar.b("log_level", 0);
        this.f106485c = aVar.e("is_server_log");
    }

    public final int e() {
        return this.f106484b;
    }

    public final boolean f() {
        return this.f106485c;
    }

    @Override // com.vivo.push.b.s, com.vivo.push.o
    public final String toString() {
        return "OnLogCommand";
    }
}
