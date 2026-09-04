package com.huawei.hms.push;

import android.content.Context;
import android.content.Intent;
import com.huawei.hms.support.log.HMSLog;

/* JADX INFO: compiled from: PushSelfShowThread.java */
/* JADX INFO: loaded from: classes7.dex */
public class n extends Thread {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private Context f61280a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private m f61281b;

    public n(Context context, m mVar) {
        this.f61280a = context;
        this.f61281b = mVar;
    }

    private static Intent a(Context context, m mVar) {
        if (mVar == null) {
            return null;
        }
        Intent intentB = d.b(context, mVar.d());
        if (mVar.n() == null) {
            if (mVar.a() != null) {
                Intent intent = new Intent(mVar.a());
                if (d.a(context, mVar.d(), intent).booleanValue()) {
                    intentB = intent;
                }
            }
            intentB.setPackage(mVar.d());
            return intentB;
        }
        try {
            Intent uri = Intent.parseUri(mVar.n(), 0);
            uri.setSelector(null);
            HMSLog.d("PushSelfShowLog", "Intent.parseUri(msg.intentUri, 0), action:" + uri.getAction());
            return d.a(context, mVar.d(), uri).booleanValue() ? uri : intentB;
        } catch (Exception e10) {
            HMSLog.w("PushSelfShowLog", "intentUri error," + e10.toString());
            return intentB;
        }
    }

    private boolean a(Context context) {
        return d.c(context, this.f61281b.d());
    }

    private boolean b(Context context) {
        if ("cosa".equals(this.f61281b.i())) {
            return a(context);
        }
        return true;
    }

    private boolean b(Context context, m mVar) {
        if (!"cosa".equals(mVar.i()) || a(context, mVar) != null) {
            return false;
        }
        HMSLog.d("PushSelfShowLog", "launchCosaApp,intent == null");
        return true;
    }

    @Override // java.lang.Thread, java.lang.Runnable
    public void run() {
        HMSLog.i("PushSelfShowLog", "enter run()");
        try {
            if (!b(this.f61280a) || b(this.f61280a, this.f61281b)) {
                return;
            }
            l.a(this.f61280a, this.f61281b);
        } catch (Exception e10) {
            HMSLog.e("PushSelfShowLog", e10.toString());
        }
    }
}
