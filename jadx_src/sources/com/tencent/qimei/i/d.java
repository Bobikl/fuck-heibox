package com.tencent.qimei.i;

/* JADX INFO: compiled from: IntegerParser.java */
/* JADX INFO: loaded from: classes4.dex */
public class d extends a<Integer> {
    public d(com.tencent.qimei.g.a<?>... aVarArr) {
        super(aVarArr);
    }

    @Override // com.tencent.qimei.i.c
    public Integer a(com.tencent.qimei.g.a<Integer> aVar, String str) {
        String strA = a(str, a(aVar));
        if (strA == null || strA.isEmpty()) {
            return aVar.a();
        }
        try {
            return Integer.valueOf(Integer.parseInt(strA));
        } catch (Exception e10) {
            e10.printStackTrace();
            return aVar.a();
        }
    }

    @Override // com.tencent.qimei.i.c
    public /* bridge */ /* synthetic */ Object a(com.tencent.qimei.g.a aVar, String str) {
        return a((com.tencent.qimei.g.a<Integer>) aVar, str);
    }
}
