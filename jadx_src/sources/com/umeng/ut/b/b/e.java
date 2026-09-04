package com.umeng.ut.b.b;

/* JADX INFO: loaded from: classes4.dex */
public class e {
    public static boolean a(com.umeng.ut.a.b.a aVar) {
        String str = "";
        try {
            str = new String(aVar.data, "UTF-8");
        } catch (Exception e10) {
            com.umeng.ut.a.c.e.m56a("", e10);
        }
        if (com.umeng.ut.a.b.a.a(str, aVar.signature)) {
            return b.a(b.a(str).f106443d);
        }
        return false;
    }
}
