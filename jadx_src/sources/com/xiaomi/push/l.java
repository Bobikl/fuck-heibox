package com.xiaomi.push;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.os.Build;
import android.os.Handler;
import android.os.HandlerThread;

/* JADX INFO: loaded from: classes4.dex */
public class l {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static volatile Handler f107812a;

    /* JADX INFO: renamed from: a, reason: collision with other field name */
    private static final Object f932a = new Object();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static volatile Handler f107813b;

    public static Intent a(Context context, BroadcastReceiver broadcastReceiver, IntentFilter intentFilter, int i10) {
        return a(context, broadcastReceiver, intentFilter, null, i10);
    }

    public static Intent a(Context context, BroadcastReceiver broadcastReceiver, IntentFilter intentFilter, String str, int i10) {
        return a(context, broadcastReceiver, intentFilter, str, b(), i10);
    }

    public static Intent a(Context context, BroadcastReceiver broadcastReceiver, IntentFilter intentFilter, String str, Handler handler, int i10) {
        if (context == null || broadcastReceiver == null || intentFilter == null) {
            return null;
        }
        return Build.VERSION.SDK_INT >= 33 ? context.registerReceiver(broadcastReceiver, intentFilter, str, handler, i10) : context.registerReceiver(broadcastReceiver, intentFilter, str, handler);
    }

    public static Handler a() {
        if (f107813b == null) {
            synchronized (f932a) {
                if (f107813b == null) {
                    HandlerThread handlerThread = new HandlerThread("receiver_task");
                    handlerThread.start();
                    f107813b = new Handler(handlerThread.getLooper());
                }
            }
        }
        return f107813b;
    }

    private static Handler b() {
        if (f107812a == null) {
            synchronized (l.class) {
                if (f107812a == null) {
                    HandlerThread handlerThread = new HandlerThread("handle_receiver");
                    handlerThread.start();
                    f107812a = new Handler(handlerThread.getLooper());
                }
            }
        }
        return f107812a;
    }
}
