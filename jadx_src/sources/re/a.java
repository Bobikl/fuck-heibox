package re;

import android.content.Context;
import android.os.Build;
import android.os.Environment;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentActivity;
import com.max.mediaselector.lib.basic.g;
import com.max.mediaselector.lib.utils.o;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.PatchProxyResult;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: compiled from: PermissionChecker.java */
/* JADX INFO: loaded from: classes2.dex */
public class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final int f138886a = 10086;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static a f138887b;
    public static ChangeQuickRedirect changeQuickRedirect;

    private a() {
    }

    public static boolean a(Context context, String[] strArr) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{context, strArr}, null, changeQuickRedirect, true, bb.c.m.N2, new Class[]{Context.class, String[].class}, Boolean.TYPE);
        if (patchProxyResultProxy.isSupported) {
            return ((Boolean) patchProxyResultProxy.result).booleanValue();
        }
        for (String str : strArr) {
            if (androidx.core.content.d.a(context.getApplicationContext(), str) != 0) {
                return false;
            }
        }
        return true;
    }

    public static a b() {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[0], null, changeQuickRedirect, true, bb.c.m.I2, new Class[0], a.class);
        if (patchProxyResultProxy.isSupported) {
            return (a) patchProxyResultProxy.result;
        }
        if (f138887b == null) {
            synchronized (a.class) {
                if (f138887b == null) {
                    f138887b = new a();
                }
            }
        }
        return f138887b;
    }

    public static boolean c(Context context) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{context}, null, changeQuickRedirect, true, bb.c.m.Q2, new Class[]{Context.class}, Boolean.TYPE);
        return patchProxyResultProxy.isSupported ? ((Boolean) patchProxyResultProxy.result).booleanValue() : a(context, new String[]{"android.permission.CAMERA"});
    }

    public static boolean d(Context context) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{context}, null, changeQuickRedirect, true, bb.c.m.O2, new Class[]{Context.class}, Boolean.TYPE);
        if (patchProxyResultProxy.isSupported) {
            return ((Boolean) patchProxyResultProxy.result).booleanValue();
        }
        if (Build.VERSION.SDK_INT >= 33) {
            return a(context, new String[]{"android.permission.READ_MEDIA_IMAGES"});
        }
        return o.f() ? Environment.isExternalStorageManager() : a(context, new String[]{"android.permission.READ_EXTERNAL_STORAGE"});
    }

    public static boolean e(Context context) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{context}, null, changeQuickRedirect, true, bb.c.m.P2, new Class[]{Context.class}, Boolean.TYPE);
        if (patchProxyResultProxy.isSupported) {
            return ((Boolean) patchProxyResultProxy.result).booleanValue();
        }
        return o.f() ? Environment.isExternalStorageManager() : a(context, new String[]{"android.permission.WRITE_EXTERNAL_STORAGE"});
    }

    private void g(Fragment fragment, List<String[]> list, int i10, c cVar) {
        if (PatchProxy.proxy(new Object[]{fragment, list, new Integer(i10), cVar}, this, changeQuickRedirect, false, bb.c.m.L2, new Class[]{Fragment.class, List.class, Integer.TYPE, c.class}, Void.TYPE).isSupported || com.max.mediaselector.lib.utils.a.d(fragment.getActivity()) || !(fragment instanceof g)) {
            return;
        }
        FragmentActivity activity = fragment.getActivity();
        ArrayList arrayList = new ArrayList();
        for (String[] strArr : list) {
            for (String str : strArr) {
                if (androidx.core.content.d.a(activity, str) != 0) {
                    arrayList.add(str);
                }
            }
        }
        if (arrayList.size() <= 0) {
            if (cVar != null) {
                cVar.a();
            }
        } else {
            ((g) fragment).F4(cVar);
            String[] strArr2 = new String[arrayList.size()];
            arrayList.toArray(strArr2);
            fragment.requestPermissions(strArr2, i10);
            androidx.core.app.b.J(activity, strArr2, i10);
        }
    }

    public void f(int[] iArr, c cVar) {
        if (PatchProxy.proxy(new Object[]{iArr, cVar}, this, changeQuickRedirect, false, bb.c.m.M2, new Class[]{int[].class, c.class}, Void.TYPE).isSupported) {
            return;
        }
        if (d.c(iArr)) {
            cVar.a();
        } else {
            cVar.b();
        }
    }

    public void h(Fragment fragment, List<String[]> list, c cVar) {
        if (PatchProxy.proxy(new Object[]{fragment, list, cVar}, this, changeQuickRedirect, false, bb.c.m.K2, new Class[]{Fragment.class, List.class, c.class}, Void.TYPE).isSupported) {
            return;
        }
        g(fragment, list, 10086, cVar);
    }

    public void i(Fragment fragment, String[] strArr, c cVar) {
        if (PatchProxy.proxy(new Object[]{fragment, strArr, cVar}, this, changeQuickRedirect, false, bb.c.m.J2, new Class[]{Fragment.class, String[].class, c.class}, Void.TYPE).isSupported) {
            return;
        }
        ArrayList arrayList = new ArrayList();
        arrayList.add(strArr);
        g(fragment, arrayList, 10086, cVar);
    }
}
