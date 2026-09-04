package com.max.xiaoheihe.accelworld;

import android.app.Activity;
import android.content.Context;
import android.os.Build;
import android.view.Display;
import android.view.WindowManager;
import android.view.WindowMetrics;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.PatchProxyResult;
import kotlin.jvm.internal.f0;

/* JADX INFO: compiled from: AccelWorldMultiWindowMode.kt */
/* JADX INFO: loaded from: classes3.dex */
public final class n {
    public static ChangeQuickRedirect changeQuickRedirect;

    public static final boolean a(@dl.e Context context) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{context}, null, changeQuickRedirect, true, bb.c.m.gx, new Class[]{Context.class}, Boolean.TYPE);
        if (patchProxyResultProxy.isSupported) {
            return ((Boolean) patchProxyResultProxy.result).booleanValue();
        }
        if (q.c(context)) {
            return b(context);
        }
        if (Build.VERSION.SDK_INT < 24 || !(context instanceof Activity)) {
            return false;
        }
        return ((Activity) context).isInMultiWindowMode();
    }

    private static final boolean b(Context context) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{context}, null, changeQuickRedirect, true, bb.c.m.hx, new Class[]{Context.class}, Boolean.TYPE);
        if (patchProxyResultProxy.isSupported) {
            return ((Boolean) patchProxyResultProxy.result).booleanValue();
        }
        if (context != null && Build.VERSION.SDK_INT >= 30) {
            Object systemService = context.getSystemService("window");
            f0.n(systemService, "null cannot be cast to non-null type android.view.WindowManager");
            WindowMetrics currentWindowMetrics = ((WindowManager) systemService).getCurrentWindowMetrics();
            f0.o(currentWindowMetrics, "localWindowManager.currentWindowMetrics");
            int iHeight = currentWindowMetrics.getBounds().height();
            int iWidth = currentWindowMetrics.getBounds().width();
            com.max.heybox.hblog.g.a aVar = com.max.heybox.hblog.g.f74531b;
            aVar.M("app check window width: " + iWidth + " height: " + iHeight);
            if (context.getDisplay() != null) {
                Display display = context.getDisplay();
                f0.m(display);
                int physicalHeight = display.getMode().getPhysicalHeight();
                Display display2 = context.getDisplay();
                f0.m(display2);
                int physicalWidth = display2.getMode().getPhysicalWidth();
                aVar.M("app check window physicalWidth: " + physicalWidth + " physicalWidth: " + physicalHeight);
                return (iWidth == physicalWidth && iHeight == physicalHeight) ? false : true;
            }
        }
        return false;
    }
}
