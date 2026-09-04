package com.max.hbutils.utils;

import android.app.ActivityManager;
import android.content.Intent;
import android.content.ServiceConnection;
import android.os.Build;
import androidx.annotation.n0;
import com.max.hbutils.core.BaseApplication;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.PatchProxyResult;
import com.ss.bytertc.base.media.screen.RXScreenCaptureService;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

/* JADX INFO: compiled from: ServiceUtils.java */
/* JADX INFO: loaded from: classes13.dex */
public final class p {
    public static ChangeQuickRedirect changeQuickRedirect;

    private p() {
        throw new UnsupportedOperationException("u can't instantiate me...");
    }

    public static void a(@n0 Intent intent, @n0 ServiceConnection serviceConnection, int i10) {
        if (PatchProxy.proxy(new Object[]{intent, serviceConnection, new Integer(i10)}, null, changeQuickRedirect, true, bb.c.k.gq, new Class[]{Intent.class, ServiceConnection.class, Integer.TYPE}, Void.TYPE).isSupported) {
            return;
        }
        try {
            BaseApplication.a().bindService(intent, serviceConnection, i10);
        } catch (Exception e10) {
            e10.printStackTrace();
        }
    }

    public static void b(@n0 Class<?> cls, @n0 ServiceConnection serviceConnection, int i10) {
        if (PatchProxy.proxy(new Object[]{cls, serviceConnection, new Integer(i10)}, null, changeQuickRedirect, true, bb.c.k.fq, new Class[]{Class.class, ServiceConnection.class, Integer.TYPE}, Void.TYPE).isSupported) {
            return;
        }
        a(new Intent(BaseApplication.a(), cls), serviceConnection, i10);
    }

    public static void c(@n0 String str, @n0 ServiceConnection serviceConnection, int i10) {
        if (PatchProxy.proxy(new Object[]{str, serviceConnection, new Integer(i10)}, null, changeQuickRedirect, true, bb.c.k.eq, new Class[]{String.class, ServiceConnection.class, Integer.TYPE}, Void.TYPE).isSupported) {
            return;
        }
        try {
            b(Class.forName(str), serviceConnection, i10);
        } catch (Exception e10) {
            e10.printStackTrace();
        }
    }

    public static Set<String> d() {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[0], null, changeQuickRedirect, true, bb.c.k.Xp, new Class[0], Set.class);
        if (patchProxyResultProxy.isSupported) {
            return (Set) patchProxyResultProxy.result;
        }
        List<ActivityManager.RunningServiceInfo> runningServices = ((ActivityManager) BaseApplication.a().getSystemService(RXScreenCaptureService.KEY_LAUNCH_ACTIVITY)).getRunningServices(Integer.MAX_VALUE);
        HashSet hashSet = new HashSet();
        if (runningServices == null || runningServices.size() == 0) {
            return null;
        }
        Iterator<ActivityManager.RunningServiceInfo> it = runningServices.iterator();
        while (it.hasNext()) {
            hashSet.add(it.next().service.getClassName());
        }
        return hashSet;
    }

    public static boolean e(@n0 Class<?> cls) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{cls}, null, changeQuickRedirect, true, bb.c.k.iq, new Class[]{Class.class}, Boolean.TYPE);
        return patchProxyResultProxy.isSupported ? ((Boolean) patchProxyResultProxy.result).booleanValue() : f(cls.getName());
    }

    public static boolean f(@n0 String str) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{str}, null, changeQuickRedirect, true, bb.c.k.jq, new Class[]{String.class}, Boolean.TYPE);
        if (patchProxyResultProxy.isSupported) {
            return ((Boolean) patchProxyResultProxy.result).booleanValue();
        }
        try {
            List<ActivityManager.RunningServiceInfo> runningServices = ((ActivityManager) BaseApplication.a().getSystemService(RXScreenCaptureService.KEY_LAUNCH_ACTIVITY)).getRunningServices(Integer.MAX_VALUE);
            if (runningServices != null && runningServices.size() != 0) {
                Iterator<ActivityManager.RunningServiceInfo> it = runningServices.iterator();
                while (it.hasNext()) {
                    if (str.equals(it.next().service.getClassName())) {
                        return true;
                    }
                }
            }
        } catch (Exception unused) {
        }
        return false;
    }

    public static void g(Intent intent) {
        if (PatchProxy.proxy(new Object[]{intent}, null, changeQuickRedirect, true, bb.c.k.aq, new Class[]{Intent.class}, Void.TYPE).isSupported) {
            return;
        }
        try {
            intent.setFlags(32);
            if (Build.VERSION.SDK_INT >= 26) {
                BaseApplication.a().startForegroundService(intent);
            } else {
                BaseApplication.a().startService(intent);
            }
        } catch (Exception e10) {
            e10.printStackTrace();
        }
    }

    public static void h(@n0 Class<?> cls) {
        if (PatchProxy.proxy(new Object[]{cls}, null, changeQuickRedirect, true, bb.c.k.Zp, new Class[]{Class.class}, Void.TYPE).isSupported) {
            return;
        }
        g(new Intent(BaseApplication.a(), cls));
    }

    public static void i(@n0 String str) {
        if (PatchProxy.proxy(new Object[]{str}, null, changeQuickRedirect, true, bb.c.k.Yp, new Class[]{String.class}, Void.TYPE).isSupported) {
            return;
        }
        try {
            h(Class.forName(str));
        } catch (Exception e10) {
            e10.printStackTrace();
        }
    }

    public static boolean j(@n0 Intent intent) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{intent}, null, changeQuickRedirect, true, bb.c.k.dq, new Class[]{Intent.class}, Boolean.TYPE);
        if (patchProxyResultProxy.isSupported) {
            return ((Boolean) patchProxyResultProxy.result).booleanValue();
        }
        try {
            return BaseApplication.a().stopService(intent);
        } catch (Exception e10) {
            e10.printStackTrace();
            return false;
        }
    }

    public static boolean k(@n0 Class<?> cls) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{cls}, null, changeQuickRedirect, true, bb.c.k.cq, new Class[]{Class.class}, Boolean.TYPE);
        return patchProxyResultProxy.isSupported ? ((Boolean) patchProxyResultProxy.result).booleanValue() : j(new Intent(BaseApplication.a(), cls));
    }

    public static boolean l(@n0 String str) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{str}, null, changeQuickRedirect, true, bb.c.k.bq, new Class[]{String.class}, Boolean.TYPE);
        if (patchProxyResultProxy.isSupported) {
            return ((Boolean) patchProxyResultProxy.result).booleanValue();
        }
        try {
            return k(Class.forName(str));
        } catch (Exception e10) {
            e10.printStackTrace();
            return false;
        }
    }

    public static void m(@n0 ServiceConnection serviceConnection) {
        if (PatchProxy.proxy(new Object[]{serviceConnection}, null, changeQuickRedirect, true, bb.c.k.hq, new Class[]{ServiceConnection.class}, Void.TYPE).isSupported) {
            return;
        }
        BaseApplication.a().unbindService(serviceConnection);
    }
}
