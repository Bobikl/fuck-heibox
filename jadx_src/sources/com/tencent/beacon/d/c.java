package com.tencent.beacon.d;

import android.content.Context;
import android.content.SharedPreferences;
import com.tencent.beacon.a.c.e;
import com.tencent.beacon.a.c.f;
import com.tencent.beacon.module.ModuleName;
import com.tencent.beacon.module.StatModule;
import java.util.HashMap;
import java.util.Map;

/* JADX INFO: compiled from: Heartbeat.java */
/* JADX INFO: loaded from: classes4.dex */
public class c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    protected final Context f98975a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final boolean f98976b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private boolean f98977c = false;

    public c(Context context) {
        this.f98975a = context;
        this.f98976b = com.tencent.beacon.a.c.b.f(context);
    }

    private Map<String, String> b() {
        this.f98977c = com.tencent.beacon.a.c.b.f98782d;
        HashMap map = new HashMap(8);
        e eVarL = e.l();
        f fVarE = f.e();
        map.put("A19", eVarL.q());
        map.put("A66", com.tencent.beacon.a.c.b.f(this.f98975a) ? "F" : "B");
        map.put("A68", "" + com.tencent.beacon.a.c.b.b(this.f98975a));
        map.put("A85", this.f98977c ? "Y" : "N");
        map.put("A20", fVarE.j());
        map.put("A69", fVarE.k());
        return map;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public boolean c() {
        return ((StatModule) com.tencent.beacon.a.c.c.d().a(ModuleName.STAT)).c(b());
    }

    public void a() {
        com.tencent.beacon.a.d.a aVarA = com.tencent.beacon.a.d.a.a();
        if (com.tencent.beacon.base.util.b.d().equals(aVarA.getString("active_user_date", ""))) {
            com.tencent.beacon.base.util.c.e("[event] active user event had upload.", new Object[0]);
            return;
        }
        com.tencent.beacon.base.util.c.a("[event] recover a heart beat for active user.", new Object[0]);
        if (c()) {
            com.tencent.beacon.base.util.c.a("[event] rqd_heartbeat A85=Y report success", new Object[0]);
            com.tencent.beacon.a.d.a.SharedPreferencesEditorC0949a sharedPreferencesEditorC0949aEdit = aVarA.edit();
            if (com.tencent.beacon.base.util.b.a((SharedPreferences.Editor) sharedPreferencesEditorC0949aEdit)) {
                sharedPreferencesEditorC0949aEdit.putString("active_user_date", com.tencent.beacon.base.util.b.d()).apply();
            }
        }
    }

    public void a(com.tencent.beacon.e.b bVar) {
        String strD = com.tencent.beacon.base.util.b.d();
        com.tencent.beacon.a.d.a aVarA = com.tencent.beacon.a.d.a.a();
        String string = aVarA.getString("HEART_DENGTA", "");
        String string2 = aVarA.getString("active_user_date", "");
        if (strD.equals(string) || string2.equals(strD)) {
            com.tencent.beacon.base.util.c.e("[event] heartbeat had upload!", new Object[0]);
            return;
        }
        if (bVar.a("rqd_heartbeat")) {
            com.tencent.beacon.base.util.c.e("[event] rqd_heartbeat not allowed in strategy!", new Object[0]);
        } else if (bVar.b("rqd_heartbeat")) {
            com.tencent.beacon.a.b.a.a().a(new b(this, strD, aVarA));
        } else {
            com.tencent.beacon.base.util.c.e("[event] rqd_heartbeat is sampled by svr rate!", new Object[0]);
        }
    }
}
