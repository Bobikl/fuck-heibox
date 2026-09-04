package com.tekartik.sqflite.operation;

import com.tekartik.sqflite.g0;
import java.util.HashMap;
import java.util.Map;

/* JADX INFO: compiled from: SqlErrorInfo.java */
/* JADX INFO: loaded from: classes4.dex */
public class i {
    public static Map<String, Object> a(e eVar) {
        g0 g0VarC = eVar.c();
        if (g0VarC == null) {
            return null;
        }
        HashMap map = new HashMap();
        map.put(com.tekartik.sqflite.b.f98602u, g0VarC.c());
        map.put(com.tekartik.sqflite.b.f98603v, g0VarC.b());
        return map;
    }
}
