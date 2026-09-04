package com.alipay.deviceid.module.x;

import android.content.Context;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import java.util.HashMap;
import java.util.Map;

/* JADX INFO: compiled from: ApdidManager.java */
/* JADX INFO: loaded from: classes6.dex */
public final class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private Context f38215a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private c f38216b = c.a();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private int f38217c = 4;

    public a(Context context) {
        this.f38215a = context;
    }

    public static String a(Context context, String str) {
        try {
            String strB = bw.b(context, str);
            return !e.a(strB) ? strB : "";
        } catch (Throwable unused) {
            return "";
        }
    }

    private o b(Map<String, String> map) {
        try {
            Context context = this.f38215a;
            p pVar = new p();
            String strA = e.a(map, "rpcVersion", "");
            String strA2 = a(context, e.a(map, "appName", ""));
            pVar.f38356a = "android";
            pVar.f38357b = strA2;
            pVar.f38358c = strA;
            d dVarA = d.a();
            if (dVarA.f38340a == null) {
                dVarA.b(context);
            }
            Map<String, String> map2 = dVarA.f38340a;
            HashMap map3 = new HashMap();
            String strA3 = e.a(map, "appName", "");
            String strA4 = e.a(map, "appKeyClient", "");
            map3.put("AC8", strA3);
            map3.put("AC9", strA4);
            map2.putAll(map3);
            Map<String, String> map4 = dVarA.f38340a;
            HashMap map5 = new HashMap();
            StringBuilder sb2 = new StringBuilder();
            sb2.append(System.currentTimeMillis() / 1000);
            map5.put("AE22", sb2.toString());
            map4.putAll(map5);
            Map<String, String> map6 = dVarA.f38340a;
            k.a();
            HashMap map7 = new HashMap();
            map7.put("AD19", k.n(context));
            StringBuilder sb3 = new StringBuilder();
            sb3.append(k.o());
            map7.put("AD32", sb3.toString());
            map7.put("AD33", k.p());
            map7.put("AD35", k.r(context));
            map7.put("AD36", k.p(context));
            map7.put("AD40", k.d(context));
            map7.put("AD41", k.c());
            map7.put("AD42", k.d());
            map7.put("AD43", k.b());
            map7.put("AL3", k.o(context));
            map6.putAll(map7);
            Map<String, String> map8 = dVarA.f38340a;
            String strA5 = e.a(map, "appchannel", "");
            HashMap map9 = new HashMap();
            map9.put("AA6", strA5);
            map8.putAll(map9);
            pVar.f38359d = dVarA.f38340a;
            return q.a(this.f38215a, this.f38216b.b()).a(this.f38215a, pVar);
        } catch (Throwable th2) {
            x.a(th2);
            return null;
        }
    }

    /* JADX WARN: Code duplicated, block: B:8:0x0031  */
    public final int a(Map<String, String> map) {
        boolean z10;
        int i10;
        try {
            x.a(this.f38215a, e.a(map, "tid", ""), e.a(map, "utdid", ""), "");
            String strA = e.a(map, "appName", "");
            boolean z11 = false;
            if (by.a()) {
                if (e.a(a(this.f38215a, strA))) {
                    z10 = true;
                } else {
                    z10 = false;
                }
            } else if ((!e.a(d.a().a(this.f38215a), bw.a(this.f38215a, strA))) || !by.a(this.f38215a, strA) || e.a(a(this.f38215a, strA))) {
                z10 = true;
            } else {
                z10 = false;
            }
            if (z10) {
                o oVarB = b(map);
                char c10 = 2;
                if (oVarB != null) {
                    if (oVarB.f38349a) {
                        if (!e.a(oVarB.f38351c)) {
                            c10 = 1;
                        }
                    } else if (y4.c.f141569o.equals(oVarB.f38350b)) {
                        c10 = 3;
                    }
                }
                if (c10 == 1) {
                    bx.a(this.f38215a, "1".equals(oVarB.f38353e));
                    bx.a(this.f38215a, oVarB.f38355g);
                    bw.b(this.f38215a, strA, oVarB.f38351c);
                    bw.a();
                    bw.a(this.f38215a, strA, d.a().a(this.f38215a));
                    bw.b(this.f38215a, "public", oVarB.f38351c);
                    bw.a(this.f38215a, "public", d.a().a(this.f38215a));
                    bx.a(this.f38215a, strA, System.currentTimeMillis());
                } else if (c10 == 3) {
                    i10 = 1;
                } else if (e.a(a(this.f38215a, strA))) {
                    i10 = 4;
                }
                i10 = 0;
            } else {
                i10 = 0;
            }
            this.f38217c = i10;
            q qVarA = q.a(this.f38215a, this.f38216b.b());
            Context context = this.f38215a;
            ConnectivityManager connectivityManager = (ConnectivityManager) context.getSystemService("connectivity");
            NetworkInfo activeNetworkInfo = connectivityManager != null ? connectivityManager.getActiveNetworkInfo() : null;
            if (activeNetworkInfo != null && activeNetworkInfo.isConnected() && activeNetworkInfo.getType() == 1) {
                z11 = true;
            }
            if (z11 && bx.a(context)) {
                new Thread(new Runnable() { // from class: com.alipay.deviceid.module.x.v.1
                    public AnonymousClass1() {
                    }

                    @Override // java.lang.Runnable
                    public final void run() {
                        try {
                            v.this.a();
                        } catch (Exception e10) {
                            w.a(e10);
                        }
                    }
                }).start();
            }
        } catch (Exception e10) {
            x.a(e10);
        }
        return this.f38217c;
    }
}
