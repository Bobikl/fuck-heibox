package com.vivo.push.b;

/* JADX INFO: compiled from: AppCommand.java */
/* JADX INFO: loaded from: classes4.dex */
public final class b extends c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private String f106462a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private String f106463b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private String f106464c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private String f106465d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private boolean f106466e;

    public b(boolean z10, String str) {
        super(z10 ? 2006 : 2007, str);
        this.f106466e = false;
    }

    @Override // com.vivo.push.b.c, com.vivo.push.o
    public final void c(com.vivo.push.a aVar) {
        super.c(aVar);
        aVar.a("sdk_clients", this.f106462a);
        aVar.a("sdk_version", 323L);
        aVar.a("BaseAppCommand.EXTRA_APPID", this.f106464c);
        aVar.a("BaseAppCommand.EXTRA_APPKEY", this.f106463b);
        aVar.a("PUSH_REGID", this.f106465d);
    }

    public final void d() {
        this.f106464c = null;
    }

    @Override // com.vivo.push.b.c, com.vivo.push.o
    public final void d(com.vivo.push.a aVar) {
        super.d(aVar);
        this.f106462a = aVar.a("sdk_clients");
        this.f106464c = aVar.a("BaseAppCommand.EXTRA_APPID");
        this.f106463b = aVar.a("BaseAppCommand.EXTRA_APPKEY");
        this.f106465d = aVar.a("PUSH_REGID");
    }

    public final void e() {
        this.f106463b = null;
    }

    @Override // com.vivo.push.b.c, com.vivo.push.o
    public final String toString() {
        return "AppCommand:" + b();
    }
}
