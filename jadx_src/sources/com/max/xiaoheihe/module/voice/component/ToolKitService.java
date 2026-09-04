package com.max.xiaoheihe.module.voice.component;

import android.app.NotificationChannel;
import android.app.NotificationManager;
import android.app.Service;
import android.content.Context;
import android.content.Intent;
import android.os.Binder;
import android.os.Build;
import android.os.IBinder;
import androidx.annotation.p0;
import com.max.hbutils.utils.p;
import com.max.xiaoheihe.R;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.PatchProxyResult;

/* JADX INFO: loaded from: classes12.dex */
public class ToolKitService extends Service {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static final int f94083b = 1001;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static final String f94084c = "ToolKitService";
    public static ChangeQuickRedirect changeQuickRedirect;

    public static void a(Context context) {
        if (PatchProxy.proxy(new Object[]{context}, null, changeQuickRedirect, true, 46806, new Class[]{Context.class}, Void.TYPE).isSupported || p.e(ToolKitService.class)) {
            return;
        }
        p.g(new Intent(context, (Class<?>) ToolKitService.class));
    }

    public static void b(Context context) {
        if (!PatchProxy.proxy(new Object[]{context}, null, changeQuickRedirect, true, 46807, new Class[]{Context.class}, Void.TYPE).isSupported && p.e(ToolKitService.class)) {
            p.j(new Intent(context, (Class<?>) ToolKitService.class));
        }
    }

    @Override // android.app.Service
    @p0
    public IBinder onBind(Intent intent) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{intent}, this, changeQuickRedirect, false, 46805, new Class[]{Intent.class}, IBinder.class);
        return patchProxyResultProxy.isSupported ? (IBinder) patchProxyResultProxy.result : new Binder();
    }

    @Override // android.app.Service
    public void onCreate() {
        if (PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 46803, new Class[0], Void.TYPE).isSupported) {
            return;
        }
        super.onCreate();
        if (Build.VERSION.SDK_INT >= 26) {
            ((NotificationManager) getSystemService("notification")).createNotificationChannel(new NotificationChannel(f94084c, getString(R.string.app_name), 3));
        }
        startForeground(1001, new c(this).c(f94084c, "黑盒语音小程序"));
    }

    @Override // android.app.Service
    public void onDestroy() {
        if (PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 46804, new Class[0], Void.TYPE).isSupported) {
            return;
        }
        super.onDestroy();
        if (Build.VERSION.SDK_INT >= 24) {
            stopForeground(1);
        }
    }
}
