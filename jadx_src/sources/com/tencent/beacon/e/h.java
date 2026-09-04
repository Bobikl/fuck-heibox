package com.tencent.beacon.e;

import android.content.Context;
import android.content.SharedPreferences;
import android.text.TextUtils;
import android.util.Base64;
import com.tencent.beacon.base.net.RequestType;
import com.tencent.beacon.base.net.a.m;
import com.tencent.beacon.module.StrategyModule;
import com.tencent.beacon.pack.CommonStrategy;
import com.tencent.beacon.pack.ModuleStrategy;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

/* JADX INFO: compiled from: StrategyQueryTask.java */
/* JADX INFO: loaded from: classes4.dex */
public class h implements Runnable, com.tencent.beacon.base.net.a.b<byte[]> {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final StrategyModule f99032b;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private boolean f99034d;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private volatile boolean f99033c = false;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Context f99031a = com.tencent.beacon.a.c.c.d().c();

    public h(StrategyModule strategyModule) {
        this.f99032b = strategyModule;
    }

    private void a(d dVar, b bVar, ModuleStrategy moduleStrategy) {
        if (moduleStrategy.detail != null) {
            com.tencent.beacon.base.util.c.a("[strategy] mid: %d , detail changed...", Byte.valueOf(moduleStrategy.mId));
            dVar.a(moduleStrategy.detail);
            bVar.a(moduleStrategy.detail);
            this.f99034d = true;
        }
    }

    private void a(d dVar, ModuleStrategy moduleStrategy) {
        boolean z10 = moduleStrategy.onOff == 1;
        if (dVar.c() != z10) {
            com.tencent.beacon.base.util.c.a("[strategy] mid: %d , isUsable changed: %b ", Byte.valueOf(moduleStrategy.mId), Boolean.valueOf(z10));
            dVar.a(z10);
            this.f99034d = true;
        }
    }

    private void a(ModuleStrategy moduleStrategy) {
        String strA = com.tencent.beacon.base.net.c.b.a(moduleStrategy.url);
        if (com.tencent.beacon.base.net.c.b.a(true).equals(strA)) {
            return;
        }
        com.tencent.beacon.base.util.c.a("[strategy] mid: %d , url changed: %s", Byte.valueOf(moduleStrategy.mId), moduleStrategy.url);
        com.tencent.beacon.base.net.c.b.b(strA);
        this.f99034d = true;
    }

    private boolean a(Map<String, String> map, a aVar) {
        if (aVar == null || map == null) {
            return false;
        }
        aVar.a(map);
        return true;
    }

    private void b(d dVar, b bVar, ModuleStrategy moduleStrategy) {
        ArrayList<String> arrayList = moduleStrategy.preventEventCode;
        if (arrayList == null || arrayList.isEmpty()) {
            return;
        }
        com.tencent.beacon.base.util.c.a("[strategy] mid: %d , PreventEventCode changed...", Byte.valueOf(moduleStrategy.mId));
        this.f99034d = true;
        dVar.a(com.tencent.beacon.base.util.b.a(moduleStrategy.preventEventCode));
        bVar.a(com.tencent.beacon.base.util.b.a(moduleStrategy.preventEventCode));
    }

    private void c() {
        f();
        this.f99033c = false;
    }

    private void c(d dVar, b bVar, ModuleStrategy moduleStrategy) {
        ArrayList<String> arrayList = moduleStrategy.sampleEvent;
        if (arrayList == null || arrayList.isEmpty()) {
            return;
        }
        com.tencent.beacon.base.util.c.a("[strategy] mid: %d , SampleEventSet changed...", Byte.valueOf(moduleStrategy.mId));
        this.f99034d = true;
        dVar.b(com.tencent.beacon.base.util.b.a(moduleStrategy.sampleEvent));
        bVar.b(com.tencent.beacon.base.util.b.a(moduleStrategy.sampleEvent));
    }

    private void d() {
        HashMap map = new HashMap();
        map.put("s_e_e", Boolean.FALSE);
        com.tencent.beacon.a.a.b.a().a(new com.tencent.beacon.a.a.c(7, map));
    }

    private void e() {
        com.tencent.beacon.base.util.c.a("local strategyQuery finish!", new Object[0]);
        com.tencent.beacon.a.a.b.a().a(new com.tencent.beacon.a.a.c(10));
    }

    private void f() {
        long jB = ((long) this.f99032b.a().b()) * 60000;
        com.tencent.beacon.a.b.a.a().a(jB, this);
        com.tencent.beacon.base.util.c.a("[strategy] next time: %d", Long.valueOf(jB));
    }

    private void g() {
        if (j.b() || j.c()) {
            com.tencent.beacon.base.util.c.e("[strategy] query times or query success times arrive max, return!", new Object[0]);
            this.f99032b.a(true);
        } else {
            com.tencent.beacon.a.c.e eVarL = com.tencent.beacon.a.c.e.l();
            com.tencent.beacon.a.c.f fVarE = com.tencent.beacon.a.c.f.e();
            com.tencent.beacon.base.net.d.c().a(m.a().a(RequestType.STRATEGY).a(100).b(101).a(com.tencent.beacon.a.c.c.d().f()).b(com.tencent.beacon.base.net.c.b.b(false)).a(com.tencent.beacon.base.net.c.b.b(true), bb.c.k.A3).b("A1", com.tencent.beacon.a.c.c.d().l()).b("A2", fVarE.b()).b("A4", fVarE.d()).b("A6", fVarE.f()).b("A7", fVarE.a()).b("A23", com.tencent.beacon.a.c.c.d().a()).b("A31", eVarL.p()).b("A19", eVarL.q()).b("A66", com.tencent.beacon.a.c.b.f(this.f99031a) ? "F" : "B").b("A67", com.tencent.beacon.a.c.b.c(this.f99031a)).b("A68", String.valueOf(com.tencent.beacon.a.c.b.b(this.f99031a))).b("A85", com.tencent.beacon.a.c.b.f98782d ? "Y" : "N").a(com.tencent.beacon.a.c.j.e()).a()).b(this);
        }
    }

    @Override // com.tencent.beacon.base.net.a.b
    public void a(com.tencent.beacon.base.net.e eVar) {
        c();
    }

    @Override // com.tencent.beacon.base.net.a.b
    public void a(byte[] bArr) {
        a(bArr, true);
        this.f99032b.a(true);
        c();
    }

    public void a(byte[] bArr, boolean z10) {
        try {
            CommonStrategy commonStrategy = new CommonStrategy();
            commonStrategy.readFrom(new com.tencent.beacon.pack.a(bArr));
            com.tencent.beacon.base.util.c.a("[strategy] -> common strategy: %s", commonStrategy);
            if (a(commonStrategy, a.a()) && z10) {
                com.tencent.beacon.a.d.a.SharedPreferencesEditorC0949a sharedPreferencesEditorC0949aEdit = com.tencent.beacon.a.d.a.a().edit();
                if (com.tencent.beacon.base.util.b.a((SharedPreferences.Editor) sharedPreferencesEditorC0949aEdit)) {
                    sharedPreferencesEditorC0949aEdit.putString("strategy_data", Base64.encodeToString(bArr, 0));
                }
            }
            if (z10) {
                j.d();
            }
        } catch (Throwable th2) {
            com.tencent.beacon.base.util.c.a(th2);
            com.tencent.beacon.base.util.c.b("[strategy] error to common strategy!", new Object[0]);
        }
    }

    public boolean a() {
        return this.f99033c;
    }

    protected boolean a(CommonStrategy commonStrategy, a aVar) {
        if (commonStrategy == null || aVar == null) {
            return false;
        }
        String strA = com.tencent.beacon.base.net.c.b.a(commonStrategy.url);
        if (!strA.equals(com.tencent.beacon.base.net.c.b.b(true))) {
            com.tencent.beacon.base.util.c.a("[strategy] url changed to: %s", commonStrategy.url);
            this.f99034d = true;
            com.tencent.beacon.base.net.c.b.d(strA);
        }
        if (commonStrategy.queryInterval != aVar.b()) {
            com.tencent.beacon.base.util.c.a("[strategy] QueryPeriod changed to: %d", Integer.valueOf(commonStrategy.queryInterval));
            this.f99034d = true;
            aVar.a(commonStrategy.queryInterval);
        }
        if (a(commonStrategy.moduleList)) {
            this.f99034d = true;
        }
        if (a(commonStrategy.cloudParas, aVar)) {
            this.f99034d = true;
        }
        return this.f99034d;
    }

    boolean a(ArrayList<ModuleStrategy> arrayList) {
        d dVarD = this.f99032b.a().d();
        if (arrayList == null) {
            dVarD.a(false);
            d();
            return false;
        }
        b bVarB = this.f99032b.b();
        for (ModuleStrategy moduleStrategy : arrayList) {
            if (moduleStrategy.mId == dVarD.b()) {
                a(dVarD, moduleStrategy);
                a(moduleStrategy);
                a(dVarD, bVarB, moduleStrategy);
                b(dVarD, bVarB, moduleStrategy);
                c(dVarD, bVarB, moduleStrategy);
            }
        }
        return this.f99034d;
    }

    public void b() {
        byte[] bArrDecode;
        try {
            try {
                String string = com.tencent.beacon.a.d.a.a().getString("strategy_data", "");
                if (TextUtils.isEmpty(string)) {
                    i iVarA = j.a(this.f99031a, 101);
                    bArrDecode = iVarA != null ? iVarA.f99037c : null;
                } else {
                    bArrDecode = Base64.decode(string, 0);
                }
                if (bArrDecode != null) {
                    a(bArrDecode, false);
                } else {
                    com.tencent.beacon.base.util.c.a("[strategy] local strategy is null!", new Object[0]);
                }
            } catch (Exception e10) {
                com.tencent.beacon.base.util.c.a(e10);
            }
        } finally {
            e();
        }
    }

    @Override // java.lang.Runnable
    public void run() {
        this.f99033c = true;
        if (this.f99032b.a().e()) {
            return;
        }
        g();
    }
}
