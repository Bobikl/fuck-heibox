package com.umeng.message.proguard;

import android.app.Activity;
import android.content.Intent;
import com.umeng.message.api.UPushMessageNotifyApi;
import com.umeng.message.common.UPLog;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes4.dex */
public class aj implements UPushMessageNotifyApi {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static volatile aj f105719c;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ak f105720a = new ak();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public volatile boolean f105721b;

    private aj() {
    }

    public static aj a() {
        if (f105719c == null) {
            synchronized (aj.class) {
                if (f105719c == null) {
                    f105719c = new aj();
                }
            }
        }
        return f105719c;
    }

    public final void a(Activity activity, Intent intent) {
        this.f105720a.a(activity, intent);
    }

    public final void a(JSONObject jSONObject) {
        this.f105720a.a(jSONObject);
    }

    public final void b() {
        if (this.f105721b) {
            return;
        }
        this.f105721b = true;
        this.f105720a.a();
    }

    @Override // com.umeng.message.api.UPushMessageNotifyApi
    public boolean isEnabled() {
        return this.f105720a.f105723b.a();
    }

    @Override // com.umeng.message.api.UPushMessageNotifyApi
    public void setCallback(UPushMessageNotifyApi.Callback callback) {
        ak akVar = this.f105720a;
        akVar.f105722a = callback;
        if (callback == null || !akVar.f105724c) {
            return;
        }
        try {
            callback.onNotified();
            akVar.f105724c = false;
        } catch (Throwable unused) {
        }
    }

    @Override // com.umeng.message.api.UPushMessageNotifyApi
    public void setEnable(final boolean z10) {
        final ak akVar = this.f105720a;
        if (akVar.f105723b.a() != z10) {
            akVar.f105723b.f105734a.a("e_u", z10);
            b.b(new Runnable() { // from class: com.umeng.message.proguard.ak.4
                @Override // java.lang.Runnable
                public final void run() {
                    ak.this.f105723b.b(true);
                    boolean zA = false;
                    try {
                        if (d.h(x.a())) {
                            zA = ak.a(z10);
                        }
                    } catch (Throwable th2) {
                        UPLog.e("Notify", th2);
                    }
                    ak.this.f105723b.b(!zA);
                }
            });
        }
    }
}
