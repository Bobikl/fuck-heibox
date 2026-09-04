package com.taobao.accs.client;

import android.app.ActivityManager;
import android.content.Context;
import android.text.TextUtils;
import com.ss.bytertc.base.media.screen.RXScreenCaptureService;
import com.taobao.accs.IProcessName;
import com.taobao.accs.utl.ALog;
import java.util.concurrent.atomic.AtomicInteger;

/* JADX INFO: compiled from: Taobao */
/* JADX INFO: loaded from: classes4.dex */
public class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static String f98185a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static String f98186b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static String f98187c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static String f98188d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static IProcessName f98189e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static AtomicInteger f98190f = new AtomicInteger(-1);

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private static volatile a f98191g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private static Context f98192h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private ActivityManager f98193i;

    private a(Context context) {
        if (context == null) {
            throw new RuntimeException("Context is null!!");
        }
        if (f98192h == null) {
            f98192h = context.getApplicationContext();
        }
    }

    public static a a(Context context) {
        if (f98191g == null) {
            synchronized (a.class) {
                if (f98191g == null) {
                    f98191g = new a(context);
                }
            }
        }
        return f98191g;
    }

    public static String b() {
        String str = TextUtils.isEmpty(f98185a) ? "com.umeng.message.component.UmengIntentService" : f98185a;
        ALog.d("AdapterGlobalClientInfo", "getAgooCustomServiceName", "serviceName", str);
        return str;
    }

    public static boolean c() {
        return f98190f.intValue() == 0;
    }

    public ActivityManager a() {
        if (this.f98193i == null) {
            this.f98193i = (ActivityManager) f98192h.getSystemService(RXScreenCaptureService.KEY_LAUNCH_ACTIVITY);
        }
        return this.f98193i;
    }
}
