package com.elvishew.xlog.printer;

/* JADX INFO: compiled from: ConsolePrinter.java */
/* JADX INFO: loaded from: classes6.dex */
public class b implements c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private com.elvishew.xlog.flattener.d f42916a;

    public b() {
        this.f42916a = com.elvishew.xlog.internal.a.f();
    }

    public b(com.elvishew.xlog.flattener.d dVar) {
        this.f42916a = dVar;
    }

    @Override // com.elvishew.xlog.printer.c
    public void a(int i10, String str, String str2) {
        System.out.println(this.f42916a.b(i10, str, str2).toString());
    }
}
