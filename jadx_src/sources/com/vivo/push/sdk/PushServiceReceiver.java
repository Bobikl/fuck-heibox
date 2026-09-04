package com.vivo.push.sdk;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.net.NetworkInfo;
import android.os.Handler;
import android.os.HandlerThread;
import com.vivo.push.PushClient;
import com.vivo.push.cache.ClientConfigManagerImpl;
import com.vivo.push.e;
import com.vivo.push.util.ContextDelegate;
import com.vivo.push.util.VivoPushException;
import com.vivo.push.util.p;
import com.vivo.push.util.r;
import com.xiaomi.mipush.sdk.Constants;

/* JADX INFO: loaded from: classes4.dex */
public class PushServiceReceiver extends BroadcastReceiver {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static HandlerThread f106634a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static Handler f106635b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static a f106636c = new a();

    public static final class a implements Runnable {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private Context f106637a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private String f106638b;

        a() {
        }

        static /* synthetic */ void a(a aVar, Context context, String str) {
            aVar.f106637a = ContextDelegate.getContext(context);
            aVar.f106638b = str;
        }

        @Override // java.lang.Runnable
        public final void run() {
            NetworkInfo networkInfoA = r.a(this.f106637a);
            if (!(networkInfoA != null ? networkInfoA.isConnectedOrConnecting() : false)) {
                p.d("PushServiceReceiver", this.f106637a.getPackageName() + ": 无网络  by " + this.f106638b);
                p.a(this.f106637a, "触发静态广播:无网络(" + this.f106638b + Constants.ACCEPT_TIME_SEPARATOR_SP + this.f106637a.getPackageName() + ")");
                return;
            }
            p.d("PushServiceReceiver", this.f106637a.getPackageName() + ": 执行开始出发动作: " + this.f106638b);
            p.a(this.f106637a, "触发静态广播(" + this.f106638b + Constants.ACCEPT_TIME_SEPARATOR_SP + this.f106637a.getPackageName() + ")");
            e.a().a(this.f106637a);
            if (ClientConfigManagerImpl.getInstance(this.f106637a).isCancleBroadcastReceiver()) {
                return;
            }
            try {
                PushClient.getInstance(this.f106637a).initialize();
            } catch (VivoPushException e10) {
                e10.printStackTrace();
                p.a(this.f106637a, " 初始化异常 error= " + e10.getMessage());
            }
        }
    }

    @Override // android.content.BroadcastReceiver
    public void onReceive(Context context, Intent intent) {
        Context context2 = ContextDelegate.getContext(context);
        String action = intent.getAction();
        if ("android.net.conn.CONNECTIVITY_CHANGE".equals(action) || "android.intent.action.ACTION_POWER_CONNECTED".equals(action) || "android.intent.action.ACTION_POWER_DISCONNECTED".equals(action)) {
            if (f106634a == null) {
                HandlerThread handlerThread = new HandlerThread("PushServiceReceiver");
                f106634a = handlerThread;
                handlerThread.start();
                f106635b = new Handler(f106634a.getLooper());
            }
            p.d("PushServiceReceiver", context2.getPackageName() + ": start PushSerevice for by " + action + "  ; handler : " + f106635b);
            a.a(f106636c, context2, action);
            f106635b.removeCallbacks(f106636c);
            f106635b.postDelayed(f106636c, 2000L);
        }
    }
}
