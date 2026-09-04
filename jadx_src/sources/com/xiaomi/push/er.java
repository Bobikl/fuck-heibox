package com.xiaomi.push;

import android.app.Application;
import android.content.Context;
import android.content.SharedPreferences;

/* JADX INFO: loaded from: classes4.dex */
public class er {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static volatile er f107045a;

    /* JADX INFO: renamed from: a, reason: collision with other field name */
    private Context f339a;

    /* JADX INFO: renamed from: a, reason: collision with other field name */
    private a f340a;

    public interface a {
        void a();
    }

    private er(Context context) {
        this.f339a = context;
    }

    public static int a(int i10) {
        return Math.max(60, i10);
    }

    public static er a(Context context) {
        if (f107045a == null) {
            synchronized (er.class) {
                if (f107045a == null) {
                    f107045a = new er(context);
                }
            }
        }
        return f107045a;
    }

    private void a(com.xiaomi.push.service.az azVar, ah ahVar, boolean z10) {
        if (azVar.a(is.UploadSwitch.a(), true)) {
            ev evVar = new ev(this.f339a);
            if (z10) {
                ahVar.a((ah.a) evVar, a(azVar.a(is.UploadFrequency.a(), 86400)));
            } else {
                ahVar.m144a((ah.a) evVar);
            }
        }
    }

    private boolean a() {
        try {
            Context context = this.f339a;
            (context instanceof Application ? (Application) context : (Application) context.getApplicationContext()).registerActivityLifecycleCallbacks(new el(this.f339a, String.valueOf(System.currentTimeMillis() / 1000)));
            return true;
        } catch (Exception e10) {
            com.xiaomi.channel.commonutils.logger.b.a(e10);
            return false;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void b() {
        a aVar;
        ah ahVarA = ah.a(this.f339a);
        com.xiaomi.push.service.az azVarA = com.xiaomi.push.service.az.a(this.f339a);
        SharedPreferences sharedPreferences = this.f339a.getSharedPreferences("mipush_extra", 0);
        long jCurrentTimeMillis = System.currentTimeMillis();
        long j10 = sharedPreferences.getLong("first_try_ts", jCurrentTimeMillis);
        if (j10 == jCurrentTimeMillis) {
            sharedPreferences.edit().putLong("first_try_ts", jCurrentTimeMillis).commit();
        }
        if (Math.abs(jCurrentTimeMillis - j10) < 172800000) {
            return;
        }
        a(azVarA, ahVarA, false);
        if (azVarA.a(is.StorageCollectionSwitch.a(), true)) {
            int iA = a(azVarA.a(is.StorageCollectionFrequency.a(), 86400));
            ahVarA.a(new eu(this.f339a, iA), iA, 0);
        }
        if (j.m521a(this.f339a) && (aVar = this.f340a) != null) {
            aVar.a();
        }
        if (azVarA.a(is.ActivityTSSwitch.a(), false)) {
            a();
        }
        a(azVarA, ahVarA, true);
    }

    /* JADX INFO: renamed from: a, reason: collision with other method in class */
    public void m284a() {
        ah.a(this.f339a).a(new es(this));
    }
}
