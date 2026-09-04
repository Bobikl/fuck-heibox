package com.vivo.push.b;

import com.tencent.connect.common.Constants;

/* JADX INFO: compiled from: OnAppReceiveCommand.java */
/* JADX INFO: loaded from: classes4.dex */
public final class i extends s {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private String f106475a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private String f106476b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private String f106477c;

    public i(int i10) {
        super(i10);
    }

    @Override // com.vivo.push.b.s, com.vivo.push.o
    protected final void c(com.vivo.push.a aVar) {
        super.c(aVar);
        aVar.a("app_id", this.f106475a);
        aVar.a(Constants.PARAM_CLIENT_ID, this.f106476b);
        aVar.a("client_token", this.f106477c);
    }

    public final String d() {
        return this.f106475a;
    }

    @Override // com.vivo.push.b.s, com.vivo.push.o
    protected final void d(com.vivo.push.a aVar) {
        super.d(aVar);
        this.f106475a = aVar.a("app_id");
        this.f106476b = aVar.a(Constants.PARAM_CLIENT_ID);
        this.f106477c = aVar.a("client_token");
    }

    public final String e() {
        return this.f106477c;
    }

    @Override // com.vivo.push.b.s, com.vivo.push.o
    public final String toString() {
        return "OnBindCommand";
    }
}
