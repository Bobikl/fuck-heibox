package com.huawei.hms.push;

import android.content.Context;
import android.content.Intent;
import com.huawei.hms.support.log.HMSLog;
import com.tencent.connect.common.Constants;

/* JADX INFO: compiled from: SelfShowType.java */
/* JADX INFO: loaded from: classes7.dex */
public class s {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static final String[] f61289c = {"url", Constants.JumpUrlConstants.SRC_TYPE_APP, "cosa", "rp"};

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private Context f61290a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private m f61291b;

    public s(Context context, m mVar) {
        this.f61290a = context;
        this.f61291b = mVar;
    }

    private void a() {
        try {
            HMSLog.i("PushSelfShowLog", "enter launchApp, appPackageName =" + this.f61291b.d());
            if (d.c(this.f61290a, this.f61291b.d())) {
                b();
            }
        } catch (Exception e10) {
            HMSLog.e("PushSelfShowLog", "launchApp error:" + e10.toString());
        }
    }

    public static boolean a(String str) {
        for (String str2 : f61289c) {
            if (str2.equals(str)) {
                return true;
            }
        }
        return false;
    }

    /* JADX WARN: Code duplicated, block: B:15:0x00bc A[PHI: r2 r3
  0x00bc: PHI (r2v22 android.content.Intent) = (r2v16 android.content.Intent), (r2v25 android.content.Intent) binds: [B:7:0x007a, B:14:0x00ba] A[DONT_GENERATE, DONT_INLINE]
  0x00bc: PHI (r3v5 boolean) = (r3v3 boolean), (r3v1 boolean) binds: [B:7:0x007a, B:14:0x00ba] A[DONT_GENERATE, DONT_INLINE]] */
    private void b() {
        Intent uri;
        HMSLog.i("PushSelfShowLog", "run into launchCosaApp");
        try {
            HMSLog.i("PushSelfShowLog", "enter launchExistApp cosa, appPackageName =" + this.f61291b.d() + ",and msg.intentUri is " + this.f61291b.n());
            Intent intentB = d.b(this.f61290a, this.f61291b.d());
            boolean zBooleanValue = false;
            if (this.f61291b.n() != null) {
                try {
                    uri = Intent.parseUri(this.f61291b.n(), 0);
                    uri.setSelector(null);
                    HMSLog.i("PushSelfShowLog", "Intent.parseUri(msg.intentUri, 0), action:" + uri.getAction());
                    zBooleanValue = d.a(this.f61290a, this.f61291b.d(), uri).booleanValue();
                    if (zBooleanValue) {
                        intentB = uri;
                    }
                } catch (Exception e10) {
                    HMSLog.w("PushSelfShowLog", "intentUri error." + e10.toString());
                }
            } else if (this.f61291b.a() != null) {
                uri = new Intent(this.f61291b.a());
                if (d.a(this.f61290a, this.f61291b.d(), uri).booleanValue()) {
                    intentB = uri;
                }
            }
            if (intentB == null) {
                HMSLog.i("PushSelfShowLog", "launchCosaApp,intent == null");
                return;
            }
            intentB.setPackage(this.f61291b.d());
            if (zBooleanValue) {
                intentB.addFlags(268435456);
            } else {
                intentB.setFlags(805437440);
            }
            this.f61290a.startActivity(intentB);
        } catch (Exception e11) {
            HMSLog.e("PushSelfShowLog", "launch Cosa App exception." + e11.toString());
        }
    }

    public void c() {
        m mVar;
        HMSLog.d("PushSelfShowLog", "enter launchNotify()");
        if (this.f61290a == null || (mVar = this.f61291b) == null) {
            HMSLog.d("PushSelfShowLog", "launchNotify  context or msg is null");
            return;
        }
        if (Constants.JumpUrlConstants.SRC_TYPE_APP.equals(mVar.i())) {
            a();
            return;
        }
        if ("cosa".equals(this.f61291b.i())) {
            b();
            return;
        }
        if ("rp".equals(this.f61291b.i())) {
            HMSLog.w("PushSelfShowLog", this.f61291b.i() + " not support rich message.");
            return;
        }
        if ("url".equals(this.f61291b.i())) {
            HMSLog.w("PushSelfShowLog", this.f61291b.i() + " not support URL.");
            return;
        }
        HMSLog.d("PushSelfShowLog", this.f61291b.i() + " is not exist in hShowType");
    }
}
