package com.tencent.qimei.i;

/* JADX INFO: compiled from: StringParser.java */
/* JADX INFO: loaded from: classes4.dex */
public class e extends a<String> {
    public e(com.tencent.qimei.g.a<?>... aVarArr) {
        super(aVarArr);
    }

    @Override // com.tencent.qimei.i.c
    public /* bridge */ /* synthetic */ Object a(com.tencent.qimei.g.a aVar, String str) {
        return a((com.tencent.qimei.g.a<String>) aVar, str);
    }

    @Override // com.tencent.qimei.i.c
    public String a(com.tencent.qimei.g.a<String> aVar, String str) {
        String strA = a(str, a(aVar));
        return (strA == null || strA.isEmpty()) ? aVar.a() : strA;
    }
}
