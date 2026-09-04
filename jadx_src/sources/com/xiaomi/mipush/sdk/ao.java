package com.xiaomi.mipush.sdk;

import android.app.Application;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.os.Build;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import android.os.Messenger;
import android.os.RemoteException;
import android.os.SystemClock;
import android.text.TextUtils;
import com.xiaomi.push.bg;
import com.xiaomi.push.bk;
import com.xiaomi.push.bo;
import com.xiaomi.push.dt;
import com.xiaomi.push.fo;
import com.xiaomi.push.in;
import com.xiaomi.push.io;
import com.xiaomi.push.ir;
import com.xiaomi.push.is;
import com.xiaomi.push.ix;
import com.xiaomi.push.ja;
import com.xiaomi.push.jj;
import com.xiaomi.push.jm;
import com.xiaomi.push.jn;
import com.xiaomi.push.jt;
import com.xiaomi.push.jx;
import com.xiaomi.push.jy;
import com.xiaomi.push.service.az;
import com.xiaomi.push.service.bc;
import com.xiaomi.push.service.bj;
import com.xiaomi.push.service.bm;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

/* JADX INFO: loaded from: classes4.dex */
public class ao {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static ao f106758a = null;

    /* JADX INFO: renamed from: a, reason: collision with other field name */
    private static final ArrayList<a> f125a = new ArrayList<>();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static boolean f106759b = false;

    /* JADX INFO: renamed from: a, reason: collision with other field name */
    private long f126a;

    /* JADX INFO: renamed from: a, reason: collision with other field name */
    private Context f127a;

    /* JADX INFO: renamed from: a, reason: collision with other field name */
    private Handler f129a;

    /* JADX INFO: renamed from: a, reason: collision with other field name */
    private Messenger f130a;

    /* JADX INFO: renamed from: a, reason: collision with other field name */
    private boolean f134a;

    /* JADX INFO: renamed from: a, reason: collision with other field name */
    private List<Message> f133a = new ArrayList();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private boolean f106760c = false;

    /* JADX INFO: renamed from: b, reason: collision with other field name */
    private String f135b = null;

    /* JADX INFO: renamed from: a, reason: collision with other field name */
    private Intent f128a = null;

    /* JADX INFO: renamed from: a, reason: collision with other field name */
    private Integer f131a = null;

    /* JADX INFO: renamed from: a, reason: collision with other field name */
    private String f132a = null;

    public static class a<T extends jy<T, ?>> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        in f106761a;

        /* JADX INFO: renamed from: a, reason: collision with other field name */
        T f136a;

        /* JADX INFO: renamed from: a, reason: collision with other field name */
        boolean f137a;

        a() {
        }
    }

    private ao(Context context) {
        this.f134a = false;
        this.f129a = null;
        this.f127a = context.getApplicationContext();
        this.f134a = m97c();
        f106759b = m98d();
        this.f129a = new ap(this, Looper.getMainLooper());
        if (com.xiaomi.push.j.m521a(context)) {
            com.xiaomi.push.service.j.a(new aq(this));
        }
        Intent intentB = b();
        if (intentB != null) {
            b(intentB);
        }
    }

    private synchronized int a() {
        return this.f127a.getSharedPreferences("mipush_extra", 0).getInt(Constants.EXTRA_KEY_BOOT_SERVICE_MODE, -1);
    }

    /* JADX INFO: renamed from: a, reason: collision with other method in class */
    private Intent m92a() {
        return (!m104a() || "com.xiaomi.xmsf".equals(this.f127a.getPackageName())) ? e() : d();
    }

    private Message a(Intent intent) {
        Message messageObtain = Message.obtain();
        messageObtain.what = 17;
        messageObtain.obj = intent;
        return messageObtain;
    }

    public static synchronized ao a(Context context) {
        if (f106758a == null) {
            f106758a = new ao(context);
        }
        return f106758a;
    }

    /* JADX INFO: renamed from: a, reason: collision with other method in class */
    private String m95a() {
        String str = this.f135b;
        if (str != null) {
            return str;
        }
        try {
            if (this.f127a.getPackageManager().getPackageInfo("com.xiaomi.xmsf", 4).versionCode >= 106) {
                this.f135b = "com.xiaomi.push.service.XMPushService";
                return "com.xiaomi.push.service.XMPushService";
            }
        } catch (Exception unused) {
        }
        this.f135b = "com.xiaomi.xmsf.push.service.XMPushService";
        return "com.xiaomi.xmsf.push.service.XMPushService";
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void a(String str, au auVar, boolean z10, HashMap<String, String> map) {
        jm jmVar;
        String strA = str;
        if (b.m111a(this.f127a).m118b() && bg.b(this.f127a)) {
            jm jmVar2 = new jm();
            jmVar2.a(true);
            Intent intentM92a = m92a();
            if (TextUtils.isEmpty(str)) {
                strA = bc.a();
                jmVar2.a(strA);
                jmVar = z10 ? new jm(strA, true) : null;
                synchronized (af.class) {
                    af.a(this.f127a).m88a(strA);
                }
            } else {
                jmVar2.a(strA);
                jmVar = z10 ? new jm(strA, true) : null;
            }
            switch (at.f106766a[auVar.ordinal()]) {
                case 1:
                    ix ixVar = ix.DisablePushMessage;
                    jmVar2.c(ixVar.f623a);
                    jmVar.c(ixVar.f623a);
                    if (map != null) {
                        jmVar2.a(map);
                        jmVar.a(map);
                    }
                    intentM92a.setAction("com.xiaomi.mipush.DISABLE_PUSH_MESSAGE");
                    break;
                case 2:
                    ix ixVar2 = ix.EnablePushMessage;
                    jmVar2.c(ixVar2.f623a);
                    jmVar.c(ixVar2.f623a);
                    if (map != null) {
                        jmVar2.a(map);
                        jmVar.a(map);
                    }
                    intentM92a.setAction("com.xiaomi.mipush.ENABLE_PUSH_MESSAGE");
                    break;
                case 3:
                case 4:
                case 5:
                case 6:
                    jmVar2.c(ix.ThirdPartyRegUpdate.f623a);
                    if (map != null) {
                        jmVar2.a(map);
                    }
                    break;
            }
            com.xiaomi.channel.commonutils.logger.b.e("type:" + auVar + ", " + strA);
            jmVar2.b(b.m111a(this.f127a).m112a());
            jmVar2.d(this.f127a.getPackageName());
            in inVar = in.Notification;
            a(jmVar2, inVar, false, (ja) null);
            if (z10) {
                jmVar.b(b.m111a(this.f127a).m112a());
                jmVar.d(this.f127a.getPackageName());
                Context context = this.f127a;
                byte[] bArrA = jx.a(ai.a(context, jmVar, inVar, false, context.getPackageName(), b.m111a(this.f127a).m112a()));
                if (bArrA != null) {
                    dt.a(this.f127a.getPackageName(), this.f127a, jmVar, inVar, bArrA.length);
                    intentM92a.putExtra("mipush_payload", bArrA);
                    intentM92a.putExtra("com.xiaomi.mipush.MESSAGE_CACHE", true);
                    intentM92a.putExtra("mipush_app_id", b.m111a(this.f127a).m112a());
                    intentM92a.putExtra("mipush_app_token", b.m111a(this.f127a).b());
                    c(intentM92a);
                }
            }
            Message messageObtain = Message.obtain();
            messageObtain.what = 19;
            int iOrdinal = auVar.ordinal();
            messageObtain.obj = strA;
            messageObtain.arg1 = iOrdinal;
            if (map != null && map.get("third_sync_reason") != null) {
                Bundle bundle = new Bundle();
                bundle.putString("third_sync_reason", map.get("third_sync_reason"));
                messageObtain.setData(bundle);
            }
            this.f129a.sendMessageDelayed(messageObtain, 5000L);
        }
    }

    private Intent b() {
        if (!"com.xiaomi.xmsf".equals(this.f127a.getPackageName())) {
            return c();
        }
        com.xiaomi.channel.commonutils.logger.b.c("pushChannel xmsf create own channel");
        return e();
    }

    private void b(Intent intent) {
        try {
            if (com.xiaomi.push.j.m520a() || Build.VERSION.SDK_INT < 26) {
                this.f127a.startService(intent);
            } else {
                d(intent);
            }
        } catch (Exception e10) {
            com.xiaomi.channel.commonutils.logger.b.a(e10);
        }
    }

    private Intent c() {
        if (m104a()) {
            com.xiaomi.channel.commonutils.logger.b.c("pushChannel app start miui china channel");
            return d();
        }
        com.xiaomi.channel.commonutils.logger.b.c("pushChannel app start  own channel");
        return e();
    }

    private synchronized void c(int i10) {
        this.f127a.getSharedPreferences("mipush_extra", 0).edit().putInt(Constants.EXTRA_KEY_BOOT_SERVICE_MODE, i10).commit();
    }

    private void c(Intent intent) {
        az azVarA = az.a(this.f127a);
        int iA = is.ServiceBootMode.a();
        io ioVar = io.START;
        int iA2 = azVarA.a(iA, ioVar.a());
        int iA3 = a();
        io ioVar2 = io.BIND;
        boolean z10 = iA2 == ioVar2.a() && f106759b;
        int iA4 = z10 ? ioVar2.a() : ioVar.a();
        if (iA4 != iA3) {
            m105a(iA4);
        }
        if (z10) {
            d(intent);
        } else {
            b(intent);
        }
    }

    /* JADX INFO: renamed from: c, reason: collision with other method in class */
    private boolean m97c() {
        try {
            PackageInfo packageInfo = this.f127a.getPackageManager().getPackageInfo("com.xiaomi.xmsf", 4);
            return packageInfo != null && packageInfo.versionCode >= 105;
        } catch (Throwable unused) {
            return false;
        }
    }

    private Intent d() {
        Intent intent = new Intent();
        String packageName = this.f127a.getPackageName();
        intent.setPackage("com.xiaomi.xmsf");
        intent.setClassName("com.xiaomi.xmsf", m95a());
        intent.putExtra("mipush_app_package", packageName);
        h();
        return intent;
    }

    private synchronized void d(Intent intent) {
        try {
            if (this.f106760c) {
                Message messageA = a(intent);
                if (this.f133a.size() >= 50) {
                    this.f133a.remove(0);
                }
                this.f133a.add(messageA);
                return;
            }
            if (this.f130a == null) {
                this.f127a.bindService(intent, new as(this), 1);
                this.f106760c = true;
                this.f133a.clear();
                this.f133a.add(a(intent));
            } else {
                try {
                    this.f130a.send(a(intent));
                } catch (RemoteException unused) {
                    this.f130a = null;
                    this.f106760c = false;
                }
            }
        } catch (Throwable th2) {
            throw th2;
        }
    }

    /* JADX INFO: renamed from: d, reason: collision with other method in class */
    private boolean m98d() {
        if (m104a()) {
            try {
                return this.f127a.getPackageManager().getPackageInfo("com.xiaomi.xmsf", 4).versionCode >= 108;
            } catch (Exception unused) {
            }
        }
        return true;
    }

    private Intent e() {
        Intent intent = new Intent();
        String packageName = this.f127a.getPackageName();
        i();
        intent.setComponent(new ComponentName(this.f127a, "com.xiaomi.push.service.XMPushService"));
        intent.putExtra("mipush_app_package", packageName);
        return intent;
    }

    /* JADX INFO: renamed from: e, reason: collision with other method in class */
    private boolean m99e() {
        String packageName = this.f127a.getPackageName();
        return packageName.contains("miui") || packageName.contains("xiaomi") || (this.f127a.getApplicationInfo().flags & 1) != 0;
    }

    private void g() {
        this.f126a = SystemClock.elapsedRealtime();
    }

    private void h() {
        try {
            PackageManager packageManager = this.f127a.getPackageManager();
            ComponentName componentName = new ComponentName(this.f127a, "com.xiaomi.push.service.XMPushService");
            if (packageManager.getComponentEnabledSetting(componentName) == 2) {
                return;
            }
            packageManager.setComponentEnabledSetting(componentName, 2, 1);
        } catch (Throwable unused) {
        }
    }

    private void i() {
        try {
            PackageManager packageManager = this.f127a.getPackageManager();
            ComponentName componentName = new ComponentName(this.f127a, "com.xiaomi.push.service.XMPushService");
            if (packageManager.getComponentEnabledSetting(componentName) == 1) {
                return;
            }
            packageManager.setComponentEnabledSetting(componentName, 1, 1);
        } catch (Throwable unused) {
        }
    }

    /* JADX INFO: renamed from: a, reason: collision with other method in class */
    public long m100a() {
        return this.f126a;
    }

    /* JADX INFO: renamed from: a, reason: collision with other method in class */
    public void m101a() {
        b(m92a());
    }

    public void a(int i10) {
        a(i10, 0);
    }

    void a(int i10, int i11) {
        Intent intentM92a = m92a();
        intentM92a.setAction("com.xiaomi.mipush.CLEAR_NOTIFICATION");
        intentM92a.putExtra(bj.F, this.f127a.getPackageName());
        intentM92a.putExtra(bj.G, i10);
        intentM92a.putExtra(bj.H, i11);
        c(intentM92a);
    }

    void a(int i10, String str) {
        Intent intentM92a = m92a();
        intentM92a.setAction("com.xiaomi.mipush.thirdparty");
        intentM92a.putExtra("com.xiaomi.mipush.thirdparty_LEVEL", i10);
        intentM92a.putExtra("com.xiaomi.mipush.thirdparty_DESC", str);
        b(intentM92a);
    }

    /* JADX INFO: renamed from: a, reason: collision with other method in class */
    public void m102a(Context context) {
        if (com.xiaomi.push.j.m520a()) {
            return;
        }
        ag agVarA = n.a(context);
        if (ag.HUAWEI.equals(agVarA)) {
            a((String) null, au.UPLOAD_HUAWEI_TOKEN, e.ASSEMBLE_PUSH_HUAWEI, "update");
        }
        if (ag.OPPO.equals(agVarA)) {
            a((String) null, au.UPLOAD_COS_TOKEN, e.ASSEMBLE_PUSH_COS, "update");
        }
        if (ag.VIVO.equals(agVarA)) {
            a((String) null, au.UPLOAD_FTOS_TOKEN, e.ASSEMBLE_PUSH_FTOS, "update");
        }
    }

    /* JADX INFO: renamed from: a, reason: collision with other method in class */
    void m103a(Intent intent) {
        intent.fillIn(m92a(), 24);
        c(intent);
    }

    public final void a(ir irVar) {
        Intent intentM92a = m92a();
        byte[] bArrA = jx.a(irVar);
        if (bArrA == null) {
            com.xiaomi.channel.commonutils.logger.b.m62a("send TinyData failed, because tinyDataBytes is null.");
            return;
        }
        intentM92a.setAction("com.xiaomi.mipush.SEND_TINYDATA");
        intentM92a.putExtra("mipush_payload", bArrA);
        b(intentM92a);
    }

    public final void a(jn jnVar, boolean z10) {
        fo.a(this.f127a.getApplicationContext()).a(this.f127a.getPackageName(), "E100003", jnVar.a(), 6001, null);
        this.f128a = null;
        b.m111a(this.f127a).f142a = jnVar.a();
        Intent intentM92a = m92a();
        byte[] bArrA = jx.a(ai.a(this.f127a, jnVar, in.Registration));
        if (bArrA == null) {
            com.xiaomi.channel.commonutils.logger.b.m62a("register fail, because msgBytes is null.");
            return;
        }
        intentM92a.setAction("com.xiaomi.mipush.REGISTER_APP");
        intentM92a.putExtra("mipush_app_id", b.m111a(this.f127a).m112a());
        intentM92a.putExtra("mipush_payload", bArrA);
        intentM92a.putExtra("mipush_session", this.f132a);
        intentM92a.putExtra("mipush_env_chanage", z10);
        intentM92a.putExtra("mipush_env_type", b.m111a(this.f127a).a());
        if (!bg.b(this.f127a) || !m107b()) {
            this.f128a = intentM92a;
        } else {
            g();
            c(intentM92a);
        }
    }

    public final void a(jt jtVar) {
        byte[] bArrA = jx.a(ai.a(this.f127a, jtVar, in.UnRegistration));
        if (bArrA == null) {
            com.xiaomi.channel.commonutils.logger.b.m62a("unregister fail, because msgBytes is null.");
            return;
        }
        Intent intentM92a = m92a();
        intentM92a.setAction("com.xiaomi.mipush.UNREGISTER_APP");
        intentM92a.putExtra("mipush_app_id", b.m111a(this.f127a).m112a());
        intentM92a.putExtra("mipush_payload", bArrA);
        c(intentM92a);
    }

    public final <T extends jy<T, ?>> void a(T t10, in inVar, ja jaVar) {
        a(t10, inVar, !inVar.equals(in.Registration), jaVar);
    }

    public <T extends jy<T, ?>> void a(T t10, in inVar, boolean z10) {
        a aVar = new a();
        aVar.f136a = t10;
        aVar.f106761a = inVar;
        aVar.f137a = z10;
        ArrayList<a> arrayList = f125a;
        synchronized (arrayList) {
            arrayList.add(aVar);
            if (arrayList.size() > 10) {
                arrayList.remove(0);
            }
        }
    }

    public final <T extends jy<T, ?>> void a(T t10, in inVar, boolean z10, ja jaVar) {
        a(t10, inVar, z10, true, jaVar, true);
    }

    public final <T extends jy<T, ?>> void a(T t10, in inVar, boolean z10, ja jaVar, boolean z11) {
        a(t10, inVar, z10, true, jaVar, z11);
    }

    public final <T extends jy<T, ?>> void a(T t10, in inVar, boolean z10, boolean z11, ja jaVar, boolean z12) {
        a(t10, inVar, z10, z11, jaVar, z12, this.f127a.getPackageName(), b.m111a(this.f127a).m112a());
    }

    public final <T extends jy<T, ?>> void a(T t10, in inVar, boolean z10, boolean z11, ja jaVar, boolean z12, String str, String str2) {
        a(t10, inVar, z10, z11, jaVar, z12, str, str2, true);
    }

    public final <T extends jy<T, ?>> void a(T t10, in inVar, boolean z10, boolean z11, ja jaVar, boolean z12, String str, String str2, boolean z13) {
        a(t10, inVar, z10, z11, jaVar, z12, str, str2, z13, true);
    }

    public final <T extends jy<T, ?>> void a(T t10, in inVar, boolean z10, boolean z11, ja jaVar, boolean z12, String str, String str2, boolean z13, boolean z14) {
        if (z14 && !b.m111a(this.f127a).m120c()) {
            if (z11) {
                a(t10, inVar, z10);
                return;
            } else {
                com.xiaomi.channel.commonutils.logger.b.m62a("drop the message before initialization.");
                return;
            }
        }
        jj jjVarA = z13 ? ai.a(this.f127a, t10, inVar, z10, str, str2) : ai.b(this.f127a, t10, inVar, z10, str, str2);
        if (jaVar != null) {
            jjVarA.a(jaVar);
        }
        byte[] bArrA = jx.a(jjVarA);
        if (bArrA == null) {
            com.xiaomi.channel.commonutils.logger.b.m62a("send message fail, because msgBytes is null.");
            return;
        }
        dt.a(this.f127a.getPackageName(), this.f127a, t10, inVar, bArrA.length);
        Intent intentM92a = m92a();
        intentM92a.setAction("com.xiaomi.mipush.SEND_MESSAGE");
        intentM92a.putExtra("mipush_payload", bArrA);
        intentM92a.putExtra("com.xiaomi.mipush.MESSAGE_CACHE", z12);
        c(intentM92a);
    }

    public final void a(String str, au auVar, e eVar, String str2) {
        af.a(this.f127a).a(auVar, "syncing");
        HashMap<String, String> mapM130a = i.m130a(this.f127a, eVar);
        mapM130a.put("third_sync_reason", str2);
        a(str, auVar, false, mapM130a);
    }

    public void a(String str, String str2) {
        Intent intentM92a = m92a();
        intentM92a.setAction("com.xiaomi.mipush.CLEAR_NOTIFICATION");
        intentM92a.putExtra(bj.F, this.f127a.getPackageName());
        intentM92a.putExtra(bj.L, str);
        intentM92a.putExtra(bj.M, str2);
        c(intentM92a);
    }

    public final void a(boolean z10) {
        a(z10, (String) null);
    }

    public final void a(boolean z10, String str) {
        if (z10) {
            af afVarA = af.a(this.f127a);
            au auVar = au.DISABLE_PUSH;
            afVarA.a(auVar, "syncing");
            af.a(this.f127a).a(au.ENABLE_PUSH, "");
            a(str, auVar, true, (HashMap<String, String>) null);
            return;
        }
        af afVarA2 = af.a(this.f127a);
        au auVar2 = au.ENABLE_PUSH;
        afVarA2.a(auVar2, "syncing");
        af.a(this.f127a).a(au.DISABLE_PUSH, "");
        a(str, auVar2, true, (HashMap<String, String>) null);
    }

    /* JADX INFO: renamed from: a, reason: collision with other method in class */
    public boolean m104a() {
        return this.f134a && 1 == b.m111a(this.f127a).a();
    }

    /* JADX INFO: renamed from: a, reason: collision with other method in class */
    public boolean m105a(int i10) {
        if (!b.m111a(this.f127a).m118b()) {
            return false;
        }
        c(i10);
        jm jmVar = new jm();
        jmVar.a(bc.a());
        jmVar.b(b.m111a(this.f127a).m112a());
        jmVar.d(this.f127a.getPackageName());
        jmVar.c(ix.ClientABTest.f623a);
        HashMap map = new HashMap();
        jmVar.f763a = map;
        map.put("boot_mode", i10 + "");
        a(this.f127a).a(jmVar, in.Notification, false, (ja) null);
        return true;
    }

    /* JADX INFO: renamed from: b, reason: collision with other method in class */
    public final void m106b() {
        Intent intentM92a = m92a();
        intentM92a.setAction("com.xiaomi.mipush.DISABLE_PUSH");
        c(intentM92a);
    }

    public void b(int i10) {
        Intent intentM92a = m92a();
        intentM92a.setAction("com.xiaomi.mipush.SET_NOTIFICATION_TYPE");
        intentM92a.putExtra(bj.F, this.f127a.getPackageName());
        intentM92a.putExtra(bj.I, i10);
        intentM92a.putExtra(bj.K, bo.b(this.f127a.getPackageName() + i10));
        c(intentM92a);
    }

    /* JADX INFO: renamed from: b, reason: collision with other method in class */
    public boolean m107b() {
        if (!m104a() || !m99e()) {
            return true;
        }
        if (this.f131a == null) {
            Integer numValueOf = Integer.valueOf(bm.a(this.f127a).a());
            this.f131a = numValueOf;
            if (numValueOf.intValue() == 0) {
                this.f127a.getContentResolver().registerContentObserver(bm.a(this.f127a).m733a(), false, new ar(this, new Handler(Looper.getMainLooper())));
            }
        }
        return this.f131a.intValue() != 0;
    }

    /* JADX INFO: renamed from: c, reason: collision with other method in class */
    public void m108c() {
        if (this.f128a != null) {
            g();
            c(this.f128a);
            this.f128a = null;
        }
    }

    /* JADX INFO: renamed from: d, reason: collision with other method in class */
    public void m109d() {
        ArrayList<a> arrayList = f125a;
        synchronized (arrayList) {
            boolean z10 = Thread.currentThread() == Looper.getMainLooper().getThread();
            for (a aVar : arrayList) {
                a(aVar.f136a, aVar.f106761a, aVar.f137a, false, null, true);
                if (!z10) {
                    try {
                        Thread.sleep(100L);
                    } catch (InterruptedException unused) {
                    }
                }
            }
            f125a.clear();
        }
    }

    /* JADX INFO: renamed from: e, reason: collision with other method in class */
    public void m110e() {
        Intent intentM92a = m92a();
        intentM92a.setAction("com.xiaomi.mipush.CLEAR_HEADSUPNOTIFICATION");
        Application application = (Application) bk.a("android.app.ActivityThread", "currentApplication", new Object[0]);
        String packageName = (application == null || application.getApplicationContext() == null) ? null : application.getApplicationContext().getPackageName();
        String packageName2 = this.f127a.getPackageName();
        if (TextUtils.isEmpty(packageName) || packageName.equals(packageName2)) {
            packageName = packageName2;
        } else {
            com.xiaomi.channel.commonutils.logger.b.m62a("application package name: " + packageName + ", not equals context package name: " + packageName2);
        }
        intentM92a.putExtra(bj.F, packageName);
        c(intentM92a);
    }

    public void f() {
        Intent intentM92a = m92a();
        intentM92a.setAction("com.xiaomi.mipush.SET_NOTIFICATION_TYPE");
        intentM92a.putExtra(bj.F, this.f127a.getPackageName());
        intentM92a.putExtra(bj.K, bo.b(this.f127a.getPackageName()));
        c(intentM92a);
    }
}
