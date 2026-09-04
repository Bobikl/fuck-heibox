package com.igexin.push.core;

import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import androidx.core.view.q0;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public class m {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static m f63760a;

    private int a(List<com.igexin.push.d.c.j> list) {
        NetworkInfo activeNetworkInfo;
        try {
            ConnectivityManager connectivityManager = (ConnectivityManager) d.f63671e.getSystemService("connectivity");
            if (connectivityManager == null || (activeNetworkInfo = connectivityManager.getActiveNetworkInfo()) == null) {
                return -1;
            }
            int type = activeNetworkInfo.getType();
            com.igexin.push.d.c.j jVar = new com.igexin.push.d.c.j();
            jVar.f63862a = (byte) 2;
            jVar.f63863b = String.valueOf(type);
            list.add(jVar);
            return type;
        } catch (Throwable unused) {
            return -1;
        }
    }

    public static m a() {
        if (f63760a == null) {
            f63760a = new m();
        }
        return f63760a;
    }

    private void b(List<com.igexin.push.d.c.j> list) {
        if (x.a().f63789b == null) {
            return;
        }
        int iIntValue = ((Integer) x.a().f63789b.first).intValue();
        String str = iIntValue + "";
        if (iIntValue == 1) {
            str = str + "#" + ((String) x.a().f63789b.second);
        }
        com.igexin.push.d.c.j jVar = new com.igexin.push.d.c.j();
        jVar.f63862a = (byte) 5;
        jVar.f63863b = str;
        list.add(jVar);
    }

    public int b() {
        if (!d.f63675i || com.igexin.push.util.a.a(System.currentTimeMillis()) || !com.igexin.push.util.a.b()) {
            com.igexin.a.a.c.b.a("LoginInteractor|keyNegotiate stop ++++++++++", new Object[0]);
            return -1;
        }
        com.igexin.push.d.c.g gVar = new com.igexin.push.d.c.g();
        gVar.f63851a = d.f63655a;
        return c.a().i().a("K-", gVar, true) < 0 ? 0 : 1;
    }

    public void c() {
        com.igexin.a.a.c.a.f.a().a("Start login appid = " + d.f63655a);
        if (d.f63677k) {
            d.f63677k = false;
        }
        com.igexin.push.c.i.a().d().g();
        if (d.f63684r == 0) {
            com.igexin.a.a.c.b.a("registerReq #####", new Object[0]);
            com.igexin.push.d.c.d dVar = new com.igexin.push.d.c.d(d.f63687u, d.f63688v, d.B, d.f63655a);
            com.igexin.push.e.a aVarI = c.a().i();
            StringBuilder sb2 = new StringBuilder();
            sb2.append("R-");
            sb2.append(d.B);
            com.igexin.a.a.c.b.a("registerReq|" + (aVarI.a(sb2.toString(), dVar, true) >= 0) + "|" + d.B, new Object[0]);
            return;
        }
        com.igexin.push.d.c.i iVarD = d();
        com.igexin.a.a.c.b.a("loginReqBefore|" + iVarD.f63857a, new Object[0]);
        com.igexin.push.e.a aVarI2 = c.a().i();
        StringBuilder sb3 = new StringBuilder();
        sb3.append("S-");
        sb3.append(d.f63684r);
        if (aVarI2.a(sb3.toString(), iVarD, true) >= 0) {
            com.igexin.a.a.c.b.a("LoginInteractor|loginReq|" + d.f63685s, new Object[0]);
        }
    }

    public com.igexin.push.d.c.i d() {
        com.igexin.push.d.c.i iVar = new com.igexin.push.d.c.i();
        iVar.f63857a = d.f63684r;
        iVar.f63858b = (byte) 0;
        iVar.f63859c = q0.f21790f;
        iVar.f63860d = d.f63655a;
        try {
            boolean zA = com.igexin.push.util.a.a();
            ArrayList arrayList = new ArrayList();
            if (zA) {
                a(arrayList);
            }
            b(arrayList);
            if (!arrayList.isEmpty()) {
                iVar.f63861e = arrayList;
            }
        } catch (Throwable unused) {
        }
        return iVar;
    }
}
