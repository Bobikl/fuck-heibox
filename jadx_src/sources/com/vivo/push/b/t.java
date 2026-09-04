package com.vivo.push.b;

import java.util.ArrayList;
import java.util.List;

/* JADX INFO: compiled from: OnTagsReceiveCommand.java */
/* JADX INFO: loaded from: classes4.dex */
public final class t extends s {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private ArrayList<String> f106496a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private ArrayList<String> f106497b;

    public t(int i10) {
        super(i10);
        this.f106496a = null;
        this.f106497b = null;
    }

    @Override // com.vivo.push.b.s, com.vivo.push.o
    protected final void c(com.vivo.push.a aVar) {
        super.c(aVar);
        aVar.a("content", this.f106496a);
        aVar.a("error_msg", this.f106497b);
    }

    public final ArrayList<String> d() {
        return this.f106496a;
    }

    @Override // com.vivo.push.b.s, com.vivo.push.o
    protected final void d(com.vivo.push.a aVar) {
        super.d(aVar);
        this.f106496a = aVar.c("content");
        this.f106497b = aVar.c("error_msg");
    }

    public final List<String> e() {
        return this.f106497b;
    }

    @Override // com.vivo.push.b.s, com.vivo.push.o
    public final String toString() {
        return "OnSetTagsCommand";
    }
}
