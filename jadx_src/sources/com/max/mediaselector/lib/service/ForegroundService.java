package com.max.mediaselector.lib.service;

import android.app.Notification;
import android.app.NotificationChannel;
import android.app.NotificationManager;
import android.app.Service;
import android.content.Context;
import android.content.Intent;
import android.os.IBinder;
import androidx.core.app.o0;
import bb.c;
import com.max.mediaselector.R;
import com.max.mediaselector.lib.config.PictureSelectionConfig;
import com.max.mediaselector.lib.config.h;
import com.max.mediaselector.lib.utils.o;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.PatchProxyResult;

/* JADX INFO: loaded from: classes2.dex */
public class ForegroundService extends Service {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static final String f75392c = "com.max.mediaselector";
    public static ChangeQuickRedirect changeQuickRedirect = null;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private static final int f75393d = 1;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static final String f75391b = "com.max.mediaselector." + ForegroundService.class.getName();

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private static boolean f75394e = false;

    private Notification a() {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, c.m.S4, new Class[0], Notification.class);
        if (patchProxyResultProxy.isSupported) {
            return (Notification) patchProxyResultProxy.result;
        }
        int i10 = o.a() ? 4 : 0;
        if (o.d()) {
            NotificationChannel notificationChannel = new NotificationChannel(f75391b, "com.max.mediaselector", i10);
            notificationChannel.setLightColor(-16776961);
            notificationChannel.canBypassDnd();
            notificationChannel.setBypassDnd(true);
            notificationChannel.setLockscreenVisibility(0);
            ((NotificationManager) getSystemService("notification")).createNotificationChannel(notificationChannel);
        }
        return new o0.n(this, f75391b).t0(R.drawable.ps_ic_trans_1px).P(b()).O(getString(PictureSelectionConfig.c().f75029b == h.b() ? R.string.ps_use_sound : R.string.ps_use_camera)).i0(true).h();
    }

    private String b() {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, c.m.T4, new Class[0], String.class);
        if (patchProxyResultProxy.isSupported) {
            return (String) patchProxyResultProxy.result;
        }
        try {
            return getPackageManager().getPackageInfo(getPackageName(), 0).applicationInfo.loadLabel(getPackageManager()).toString();
        } catch (Exception e10) {
            e10.printStackTrace();
            return "";
        }
    }

    public static void c(Context context) {
        if (PatchProxy.proxy(new Object[]{context}, null, changeQuickRedirect, true, c.m.U4, new Class[]{Context.class}, Void.TYPE).isSupported) {
            return;
        }
        try {
            if (!f75394e && PictureSelectionConfig.c().L3) {
                Intent intent = new Intent(context, (Class<?>) ForegroundService.class);
                if (o.d()) {
                    context.startForegroundService(intent);
                } else {
                    context.startService(intent);
                }
            }
        } catch (Exception e10) {
            e10.printStackTrace();
        }
    }

    public static void d(Context context) {
        if (PatchProxy.proxy(new Object[]{context}, null, changeQuickRedirect, true, c.m.V4, new Class[]{Context.class}, Void.TYPE).isSupported) {
            return;
        }
        try {
            if (f75394e) {
                context.stopService(new Intent(context, (Class<?>) ForegroundService.class));
            }
        } catch (Exception e10) {
            e10.printStackTrace();
        }
    }

    @Override // android.app.Service
    public IBinder onBind(Intent intent) {
        return null;
    }

    @Override // android.app.Service
    public void onCreate() {
        if (PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, c.m.P4, new Class[0], Void.TYPE).isSupported) {
            return;
        }
        super.onCreate();
        startForeground(1, a());
    }

    @Override // android.app.Service
    public void onDestroy() {
        if (PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, c.m.R4, new Class[0], Void.TYPE).isSupported) {
            return;
        }
        f75394e = false;
        stopForeground(true);
        super.onDestroy();
    }

    @Override // android.app.Service
    public int onStartCommand(Intent intent, int i10, int i11) {
        Object[] objArr = {intent, new Integer(i10), new Integer(i11)};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        Class cls = Integer.TYPE;
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(objArr, this, changeQuickRedirect2, false, c.m.Q4, new Class[]{Intent.class, cls, cls}, cls);
        if (patchProxyResultProxy.isSupported) {
            return ((Integer) patchProxyResultProxy.result).intValue();
        }
        f75394e = true;
        return super.onStartCommand(intent, i10, i11);
    }
}
