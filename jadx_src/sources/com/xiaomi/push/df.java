package com.xiaomi.push;

import java.util.ArrayList;
import java.util.Map;

/* JADX INFO: loaded from: classes4.dex */
public class df extends cz {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    cz f106953a;

    /* JADX INFO: renamed from: a, reason: collision with other field name */
    final /* synthetic */ dd f277a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    final /* synthetic */ cz f106954b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    df(dd ddVar, String str, cz czVar) {
        super(str);
        this.f277a = ddVar;
        this.f106954b = czVar;
        this.f106953a = czVar;
        ((cz) this).f263b = ((cz) this).f263b;
        if (czVar != null) {
            this.f106941f = czVar.f106941f;
        }
    }

    @Override // com.xiaomi.push.cz
    public synchronized ArrayList<String> a(boolean z10) {
        ArrayList<String> arrayList;
        arrayList = new ArrayList<>();
        cz czVar = this.f106953a;
        if (czVar != null) {
            arrayList.addAll(czVar.a(true));
        }
        Map<String, cz> map = dd.f106949b;
        synchronized (map) {
            cz czVar2 = map.get(((cz) this).f263b);
            if (czVar2 != null) {
                for (String str : czVar2.a(true)) {
                    if (arrayList.indexOf(str) == -1) {
                        arrayList.add(str);
                    }
                }
                arrayList.remove(((cz) this).f263b);
                arrayList.add(((cz) this).f263b);
            }
        }
        return arrayList;
    }

    @Override // com.xiaomi.push.cz
    public synchronized void a(String str, cy cyVar) {
        cz czVar = this.f106953a;
        if (czVar != null) {
            czVar.a(str, cyVar);
        }
    }

    @Override // com.xiaomi.push.cz
    public boolean b() {
        return false;
    }
}
