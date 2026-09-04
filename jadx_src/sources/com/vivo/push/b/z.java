package com.vivo.push.b;

import java.io.Serializable;
import java.util.ArrayList;

/* JADX INFO: compiled from: TagCommand.java */
/* JADX INFO: loaded from: classes4.dex */
public final class z extends c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private ArrayList<String> f106506a;

    public z(boolean z10, String str, ArrayList<String> arrayList) {
        super(z10 ? 2004 : 2005, str);
        this.f106506a = arrayList;
    }

    @Override // com.vivo.push.b.c, com.vivo.push.o
    protected final void c(com.vivo.push.a aVar) {
        super.c(aVar);
        aVar.a("tags", (Serializable) this.f106506a);
    }

    @Override // com.vivo.push.b.c, com.vivo.push.o
    protected final void d(com.vivo.push.a aVar) {
        super.d(aVar);
        this.f106506a = aVar.c("tags");
    }

    @Override // com.vivo.push.b.c, com.vivo.push.o
    public final String toString() {
        return "TagCommand";
    }
}
