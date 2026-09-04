package vd;

import android.content.Context;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.PatchProxyResult;

/* JADX INFO: compiled from: SmartisanNotchSizeUtil.java */
/* JADX INFO: loaded from: classes13.dex */
public class c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final int f140877a = 1;
    public static ChangeQuickRedirect changeQuickRedirect;

    public static boolean a(Context context) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{context}, null, changeQuickRedirect, true, bb.c.k.aw, new Class[]{Context.class}, Boolean.TYPE);
        if (patchProxyResultProxy.isSupported) {
            return ((Boolean) patchProxyResultProxy.result).booleanValue();
        }
        try {
            Class<?> clsLoadClass = context.getClassLoader().loadClass("smartisanos.api.DisplayUtilsSmt");
            return ((Boolean) clsLoadClass.getMethod("isFeatureSupport", Integer.TYPE).invoke(clsLoadClass, 1)).booleanValue();
        } catch (Exception e10) {
            e10.printStackTrace();
            return false;
        }
    }
}
