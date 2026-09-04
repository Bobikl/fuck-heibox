package com.umeng.powersdk;

import android.app.Activity;
import android.os.BatteryManager;
import com.efs.sdk.base.core.config.GlobalInfoManager;
import java.lang.ref.WeakReference;
import org.apache.tools.ant.taskdefs.optional.ccm.g;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes4.dex */
public final class c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    int f106005a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    int f106006b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    int f106007c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    WeakReference<Activity> f106008d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    boolean f106009e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    int f106010f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    boolean f106011g;

    public static final class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private static final c f106021a = new c(0);
    }

    private c() {
        this.f106005a = 1;
        this.f106006b = 0;
        this.f106007c = 0;
        this.f106009e = true;
    }

    /* synthetic */ c(byte b10) {
        this();
    }

    final JSONObject a() {
        JSONObject jSONObject = new JSONObject();
        try {
            BatteryManager batteryManager = (BatteryManager) PowerManager.getApplicationContext().getSystemService("batterymanager");
            if (batteryManager != null) {
                float longProperty = batteryManager.getLongProperty(2);
                if (longProperty >= 10000.0f || longProperty <= -10000.0f) {
                    longProperty /= 1000.0f;
                }
                jSONObject.put(g.f134710p, Math.abs(longProperty));
            }
        } catch (Throwable unused) {
        }
        try {
            com.umeng.powersdk.a aVarA = b.a(PowerManager.getApplicationContext()).a();
            jSONObject.put("le", aVarA.f105997a);
            jSONObject.put("vo", aVarA.f105998b);
            jSONObject.put("te", aVarA.f105999c);
            jSONObject.put("st", aVarA.f106000d);
            jSONObject.put("ch", aVarA.f106001e);
            jSONObject.put("ts", aVarA.f106002f);
            try {
                long jLongValue = ((Long) GlobalInfoManager.getInstance().getGlobalInfo().getGlobalInfoMap().get("stime")).longValue();
                if (jLongValue > 0) {
                    jSONObject.put("ptime", System.currentTimeMillis() - jLongValue);
                }
            } catch (Throwable unused2) {
            }
            WeakReference<Activity> weakReference = this.f106008d;
            if (weakReference != null) {
                jSONObject.put("c_act", weakReference.get().getClass().getName());
            }
        } catch (Throwable unused3) {
        }
        return jSONObject;
    }
}
