package com.vivo.push.b;

/* JADX INFO: compiled from: StopServiceCommand.java */
/* JADX INFO: loaded from: classes4.dex */
public final class y extends com.vivo.push.o {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private String f106505a;

    public y() {
        super(2008);
    }

    public y(String str) {
        super(2008);
        this.f106505a = str;
    }

    @Override // com.vivo.push.o
    protected final void c(com.vivo.push.a aVar) {
        aVar.a("package_name", this.f106505a);
    }

    @Override // com.vivo.push.o
    protected final void d(com.vivo.push.a aVar) {
        this.f106505a = aVar.a("package_name");
    }

    @Override // com.vivo.push.o
    public final String toString() {
        return "StopServiceCommand";
    }
}
