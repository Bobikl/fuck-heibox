package re;

import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import androidx.annotation.b1;
import androidx.annotation.n0;
import androidx.fragment.app.Fragment;
import com.max.mediaselector.lib.utils.o;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.PatchProxyResult;

/* JADX INFO: compiled from: PermissionUtil.java */
/* JADX INFO: loaded from: classes2.dex */
public class d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final String f138893a = "android.settings.MANAGE_ALL_FILES_ACCESS_PERMISSION";
    public static ChangeQuickRedirect changeQuickRedirect;

    public static void a(Fragment fragment, boolean z10, int i10) {
        if (PatchProxy.proxy(new Object[]{fragment, new Byte(z10 ? (byte) 1 : (byte) 0), new Integer(i10)}, null, changeQuickRedirect, true, bb.c.m.S2, new Class[]{Fragment.class, Boolean.TYPE, Integer.TYPE}, Void.TYPE).isSupported) {
            return;
        }
        try {
            if (o.f() && z10) {
                fragment.startActivityForResult(new Intent(f138893a), i10);
            } else {
                Intent intent = new Intent("android.settings.APPLICATION_DETAILS_SETTINGS");
                intent.setData(Uri.fromParts("package", fragment.getActivity().getPackageName(), null));
                fragment.startActivityForResult(intent, i10);
            }
        } catch (Exception e10) {
            e10.printStackTrace();
        }
    }

    public static boolean b(@n0 Context context, @n0 @b1(min = 1) String... strArr) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{context, strArr}, null, changeQuickRedirect, true, bb.c.m.R2, new Class[]{Context.class, String[].class}, Boolean.TYPE);
        if (patchProxyResultProxy.isSupported) {
            return ((Boolean) patchProxyResultProxy.result).booleanValue();
        }
        for (String str : strArr) {
            if (androidx.core.content.d.a(context, str) != 0) {
                return false;
            }
        }
        return true;
    }

    public static boolean c(int[] iArr) {
        if (iArr.length <= 0) {
            return false;
        }
        for (int i10 : iArr) {
            if (i10 != 0) {
                return false;
            }
        }
        return true;
    }
}
