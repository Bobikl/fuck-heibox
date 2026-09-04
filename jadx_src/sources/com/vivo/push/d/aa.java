package com.vivo.push.d;

import java.util.ArrayList;
import java.util.List;

/* JADX INFO: compiled from: OnSetTagsReceiveTask.java */
/* JADX INFO: loaded from: classes4.dex */
public final class aa extends z {
    aa(com.vivo.push.o oVar) {
        super(oVar);
    }

    @Override // com.vivo.push.l
    protected final void a(com.vivo.push.o oVar) {
        com.vivo.push.b.t tVar = (com.vivo.push.b.t) oVar;
        ArrayList<String> arrayListD = tVar.d();
        List<String> listE = tVar.e();
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = new ArrayList();
        ArrayList arrayList3 = new ArrayList();
        ArrayList arrayList4 = new ArrayList();
        int iH = tVar.h();
        String strG = tVar.g();
        if (arrayListD != null) {
            for (String str : arrayListD) {
                if (str.startsWith("ali/")) {
                    arrayList2.add(str.replace("ali/", ""));
                } else if (str.startsWith("tag/")) {
                    arrayList.add(str.replace("tag/", ""));
                }
            }
        }
        if (listE != null) {
            for (String str2 : listE) {
                if (str2.startsWith("ali/")) {
                    arrayList4.add(str2.replace("ali/", ""));
                } else if (str2.startsWith("tag/")) {
                    arrayList3.add(str2.replace("tag/", ""));
                }
            }
        }
        if (arrayList.size() > 0 || arrayList3.size() > 0) {
            if (arrayList.size() > 0) {
                com.vivo.push.e.a().a(arrayList);
            }
            com.vivo.push.e.a().a(tVar.g(), arrayList3.size() > 0 ? 10000 : iH);
            com.vivo.push.m.b(new ab(this, iH, arrayList, arrayList3, strG));
        }
        if (arrayList2.size() > 0 || arrayList4.size() > 0) {
            if (arrayList2.size() > 0) {
                com.vivo.push.e.a().b((String) arrayList2.get(0));
            }
            com.vivo.push.e.a().a(tVar.g(), iH);
            com.vivo.push.m.b(new ac(this, iH, arrayList2, arrayList4, strG));
        }
    }
}
