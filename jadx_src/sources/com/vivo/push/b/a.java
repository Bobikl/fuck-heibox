package com.vivo.push.b;

import java.util.ArrayList;

/* JADX INFO: compiled from: AliasCommand.java */
/* JADX INFO: loaded from: classes4.dex */
public final class a extends c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private ArrayList<String> f106461a;

    public a(boolean z10, String str, ArrayList<String> arrayList) {
        super(z10 ? 2002 : 2003, str);
        this.f106461a = arrayList;
    }

    @Override // com.vivo.push.b.c, com.vivo.push.o
    public final void c(com.vivo.push.a aVar) {
        super.c(aVar);
        aVar.a("tags", this.f106461a);
    }

    @Override // com.vivo.push.b.c, com.vivo.push.o
    public final void d(com.vivo.push.a aVar) {
        super.d(aVar);
        this.f106461a = aVar.c("tags");
    }

    @Override // com.vivo.push.b.c, com.vivo.push.o
    public final String toString() {
        return "AliasCommand:" + b();
    }
}
