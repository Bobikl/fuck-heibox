package com.umeng.message.proguard;

import android.app.Application;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.net.Uri;
import com.igexin.sdk.PushConsts;
import com.taobao.accs.EventReceiver;
import com.taobao.agoo.AgooCommondReceiver;
import com.umeng.commonsdk.framework.UMWorkDispatch;
import com.umeng.message.common.UPLog;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes4.dex */
public final class i {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static boolean f105803a = false;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static volatile boolean f105804b = true;

    public static final class a extends BroadcastReceiver {
        private a() {
        }

        /* synthetic */ a(byte b10) {
            this();
        }

        @Override // android.content.BroadcastReceiver
        public final void onReceive(final Context context, final Intent intent) {
            if (!i.f105804b || intent == null || intent.getData() == null) {
                return;
            }
            com.umeng.message.proguard.b.c(new Runnable() { // from class: com.umeng.message.proguard.i.a.1
                @Override // java.lang.Runnable
                public final void run() {
                    try {
                        i.a(context, intent);
                    } catch (Throwable th2) {
                        UPLog.e("RH", th2);
                    }
                }
            });
        }
    }

    public static final class b extends BroadcastReceiver {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final BroadcastReceiver f105808a = new EventReceiver();

        b() {
        }

        @Override // android.content.BroadcastReceiver
        public final void onReceive(final Context context, final Intent intent) {
            if (intent == null) {
                return;
            }
            com.umeng.message.proguard.b.c(new Runnable() { // from class: com.umeng.message.proguard.i.b.1
                @Override // java.lang.Runnable
                public final void run() {
                    try {
                        b.this.f105808a.onReceive(context, intent);
                    } catch (Throwable th2) {
                        UPLog.e("RH", th2);
                    }
                }
            });
        }
    }

    public static synchronized void a() {
        if (f105803a) {
            return;
        }
        Application applicationA = x.a();
        if (applicationA == null) {
            return;
        }
        try {
            IntentFilter intentFilter = new IntentFilter();
            intentFilter.addAction("android.intent.action.SCREEN_ON");
            intentFilter.addAction("android.intent.action.SCREEN_OFF");
            intentFilter.addAction(PushConsts.ACTION_BROADCAST_USER_PRESENT);
            applicationA.registerReceiver(new b(), intentFilter);
        } catch (Throwable unused) {
        }
        if (f105804b) {
            try {
                IntentFilter intentFilter2 = new IntentFilter();
                intentFilter2.addAction("android.intent.action.PACKAGE_ADDED");
                intentFilter2.addAction("android.intent.action.PACKAGE_REMOVED");
                intentFilter2.addDataScheme("package");
                applicationA.registerReceiver(new a((byte) 0), intentFilter2);
            } catch (Throwable unused2) {
            }
            f105803a = true;
        }
    }

    static /* synthetic */ void a(Context context, Intent intent) {
        Uri data;
        if (intent == null || (data = intent.getData()) == null) {
            return;
        }
        boolean booleanExtra = intent.getBooleanExtra("android.intent.extra.REPLACING", false);
        String action = intent.getAction();
        String schemeSpecificPart = data.getSchemeSpecificPart();
        if (schemeSpecificPart == null || schemeSpecificPart.length() == 0) {
            return;
        }
        if ("android.intent.action.PACKAGE_REMOVED".equals(action) && !booleanExtra) {
            a(schemeSpecificPart, 80);
            new AgooCommondReceiver().onReceive(context, intent);
        } else if ("android.intent.action.PACKAGE_ADDED".equals(action)) {
            if (booleanExtra) {
                a(schemeSpecificPart, 81);
            } else {
                a(schemeSpecificPart, 82);
            }
        }
    }

    private static void a(String str, int i10) {
        try {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("pkg", str);
            jSONObject.put("action_type", i10);
            UMWorkDispatch.sendEvent(x.a(), 16390, v.a(), jSONObject.toString());
        } catch (Exception unused) {
        }
    }

    public static void a(boolean z10) {
        f105804b = z10;
    }
}
