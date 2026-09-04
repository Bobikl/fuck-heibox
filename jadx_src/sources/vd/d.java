package vd;

import android.content.Context;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.PatchProxyResult;

/* JADX INFO: compiled from: VivoNotchSizeUtil.java */
/* JADX INFO: loaded from: classes13.dex */
public class d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final int f140878a = 32;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static final int f140879b = 8;
    public static ChangeQuickRedirect changeQuickRedirect;

    public static boolean a(Context context) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{context}, null, changeQuickRedirect, true, bb.c.k.bw, new Class[]{Context.class}, Boolean.TYPE);
        if (patchProxyResultProxy.isSupported) {
            return ((Boolean) patchProxyResultProxy.result).booleanValue();
        }
        try {
            Class<?> clsLoadClass = context.getClassLoader().loadClass("android.util.FtFeature");
            return ((Boolean) clsLoadClass.getMethod("isFeatureSupport", Integer.TYPE).invoke(clsLoadClass, 32)).booleanValue();
        } catch (Exception e10) {
            e10.printStackTrace();
            return false;
        }
    }
}
