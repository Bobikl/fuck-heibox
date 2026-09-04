package vd;

import android.content.Context;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.PatchProxyResult;

/* JADX INFO: compiled from: OppoNotchSizeUtil.java */
/* JADX INFO: loaded from: classes13.dex */
public class b {
    public static ChangeQuickRedirect changeQuickRedirect;

    public static boolean a(Context context) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{context}, null, changeQuickRedirect, true, bb.c.k.Zv, new Class[]{Context.class}, Boolean.TYPE);
        return patchProxyResultProxy.isSupported ? ((Boolean) patchProxyResultProxy.result).booleanValue() : context.getPackageManager().hasSystemFeature("com.oppo.feature.screen.heteromorphism");
    }
}
