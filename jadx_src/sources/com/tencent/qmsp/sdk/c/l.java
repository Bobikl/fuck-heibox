package com.tencent.qmsp.sdk.c;

import java.util.HashMap;

/* JADX INFO: loaded from: classes4.dex */
public class l implements c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private HashMap<String, e> f101846a = new HashMap<>();

    public void a(e eVar) {
        String strA = eVar.a();
        if (strA == null || this.f101846a.containsKey(strA)) {
            return;
        }
        this.f101846a.put(strA, eVar);
    }

    @Override // com.tencent.qmsp.sdk.c.c
    public Object getApplicationContext() {
        return com.tencent.qmsp.sdk.app.a.getContext();
    }

    @Override // com.tencent.qmsp.sdk.c.c
    public int getRuntimeVersion() {
        return 512;
    }

    @Override // com.tencent.qmsp.sdk.c.c
    public e queryRuntimeInterface(String str) {
        if (str == null) {
            return null;
        }
        e eVar = this.f101846a.get(str);
        if (eVar == null || str.equals(eVar.a())) {
            return eVar;
        }
        return null;
    }
}
