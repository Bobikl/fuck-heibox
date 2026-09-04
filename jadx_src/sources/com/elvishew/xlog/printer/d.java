package com.elvishew.xlog.printer;

/* JADX INFO: compiled from: PrinterSet.java */
/* JADX INFO: loaded from: classes6.dex */
public class d implements c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private c[] f42917a;

    public d(c... cVarArr) {
        this.f42917a = cVarArr;
    }

    @Override // com.elvishew.xlog.printer.c
    public void a(int i10, String str, String str2) {
        for (c cVar : this.f42917a) {
            cVar.a(i10, str, str2);
        }
    }
}
