package com.tencent.qimei.i;

/* JADX INFO: compiled from: BooleanParser.java */
/* JADX INFO: loaded from: classes4.dex */
public class b extends a<Boolean> {
    public b(com.tencent.qimei.g.a<?>... aVarArr) {
        super(aVarArr);
    }

    @Override // com.tencent.qimei.i.c
    public Boolean a(com.tencent.qimei.g.a<Boolean> aVar, String str) {
        String strA = a(str, a(aVar));
        return (strA == null || strA.isEmpty()) ? aVar.a() : Boolean.valueOf("1".equals(strA));
    }

    @Override // com.tencent.qimei.i.c
    public /* bridge */ /* synthetic */ Object a(com.tencent.qimei.g.a aVar, String str) {
        return a((com.tencent.qimei.g.a<Boolean>) aVar, str);
    }
}
