package z8;

import android.content.Context;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageManager;
import android.os.Process;
import android.os.WorkSource;
import android.util.Log;
import androidx.annotation.n0;
import com.max.hbuikit.bean.param.UiKitSpanObj;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: compiled from: com.google.android.gms:play-services-basement@@18.1.0 */
/* JADX INFO: loaded from: classes7.dex */
@v8.a
public class e0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final int f141913a = Process.myUid();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static final Method f141914b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static final Method f141915c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private static final Method f141916d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private static final Method f141917e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private static final Method f141918f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private static final Method f141919g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private static final Method f141920h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private static final Method f141921i;

    static {
        Method method;
        Method method2;
        Method method3;
        Method method4;
        Method method5;
        Method method6;
        Method method7;
        Method method8 = null;
        try {
            method = WorkSource.class.getMethod("add", Integer.TYPE);
        } catch (Exception unused) {
            method = null;
        }
        f141914b = method;
        if (v.g()) {
            try {
                method2 = WorkSource.class.getMethod("add", Integer.TYPE, String.class);
            } catch (Exception unused2) {
                method2 = null;
            }
        } else {
            method2 = null;
        }
        f141915c = method2;
        try {
            method3 = WorkSource.class.getMethod(UiKitSpanObj.TYPE_SIZE, new Class[0]);
        } catch (Exception unused3) {
            method3 = null;
        }
        f141916d = method3;
        try {
            method4 = WorkSource.class.getMethod("get", Integer.TYPE);
        } catch (Exception unused4) {
            method4 = null;
        }
        f141917e = method4;
        if (v.g()) {
            try {
                method5 = WorkSource.class.getMethod("getName", Integer.TYPE);
            } catch (Exception unused5) {
                method5 = null;
            }
        } else {
            method5 = null;
        }
        f141918f = method5;
        if (v.o()) {
            try {
                method6 = WorkSource.class.getMethod("createWorkChain", new Class[0]);
            } catch (Exception e10) {
                Log.w("WorkSourceUtil", "Missing WorkChain API createWorkChain", e10);
                method6 = null;
            }
        } else {
            method6 = null;
        }
        f141919g = method6;
        if (v.o()) {
            try {
                method7 = Class.forName("android.os.WorkSource$WorkChain").getMethod("addNode", Integer.TYPE, String.class);
            } catch (Exception e11) {
                Log.w("WorkSourceUtil", "Missing WorkChain class", e11);
                method7 = null;
            }
        } else {
            method7 = null;
        }
        f141920h = method7;
        if (v.o()) {
            try {
                method8 = WorkSource.class.getMethod("isEmpty", new Class[0]);
                method8.setAccessible(true);
            } catch (Exception unused6) {
            }
        }
        f141921i = method8;
    }

    private e0() {
    }

    @v8.a
    public static void a(@n0 WorkSource workSource, int i10, @n0 String str) {
        Method method = f141915c;
        if (method != null) {
            if (str == null) {
                str = "";
            }
            try {
                method.invoke(workSource, Integer.valueOf(i10), str);
                return;
            } catch (Exception e10) {
                Log.wtf("WorkSourceUtil", "Unable to assign blame through WorkSource", e10);
                return;
            }
        }
        Method method2 = f141914b;
        if (method2 != null) {
            try {
                method2.invoke(workSource, Integer.valueOf(i10));
            } catch (Exception e11) {
                Log.wtf("WorkSourceUtil", "Unable to assign blame through WorkSource", e11);
            }
        }
    }

    @n0
    @v8.a
    public static WorkSource b(@n0 Context context, @n0 String str) {
        if (context != null && context.getPackageManager() != null && str != null) {
            try {
                ApplicationInfo applicationInfoC = com.google.android.gms.common.wrappers.e.a(context).c(str, 0);
                if (applicationInfoC == null) {
                    Log.e("WorkSourceUtil", "Could not get applicationInfo from package: ".concat(str));
                    return null;
                }
                int i10 = applicationInfoC.uid;
                WorkSource workSource = new WorkSource();
                a(workSource, i10, str);
                return workSource;
            } catch (PackageManager.NameNotFoundException unused) {
                Log.e("WorkSourceUtil", "Could not find package: ".concat(str));
            }
        }
        return null;
    }

    @n0
    @v8.a
    public static WorkSource c(@n0 Context context, @n0 String str, @n0 String str2) {
        Method method;
        if (context == null || context.getPackageManager() == null || str2 == null || str == null) {
            Log.w("WorkSourceUtil", "Unexpected null arguments");
            return null;
        }
        int i10 = -1;
        try {
            ApplicationInfo applicationInfoC = com.google.android.gms.common.wrappers.e.a(context).c(str, 0);
            if (applicationInfoC == null) {
                Log.e("WorkSourceUtil", "Could not get applicationInfo from package: ".concat(str));
            } else {
                i10 = applicationInfoC.uid;
            }
        } catch (PackageManager.NameNotFoundException unused) {
            Log.e("WorkSourceUtil", "Could not find package: ".concat(str));
        }
        if (i10 < 0) {
            return null;
        }
        WorkSource workSource = new WorkSource();
        Method method2 = f141919g;
        if (method2 == null || (method = f141920h) == null) {
            a(workSource, i10, str);
        } else {
            try {
                Object objInvoke = method2.invoke(workSource, new Object[0]);
                int i11 = f141913a;
                if (i10 != i11) {
                    method.invoke(objInvoke, Integer.valueOf(i10), str);
                }
                method.invoke(objInvoke, Integer.valueOf(i11), str2);
            } catch (Exception e10) {
                Log.w("WorkSourceUtil", "Unable to assign chained blame through WorkSource", e10);
            }
        }
        return workSource;
    }

    @v8.a
    public static int d(@n0 WorkSource workSource, int i10) {
        Method method = f141917e;
        if (method != null) {
            try {
                Object objInvoke = method.invoke(workSource, Integer.valueOf(i10));
                com.google.android.gms.common.internal.p.l(objInvoke);
                return ((Integer) objInvoke).intValue();
            } catch (Exception e10) {
                Log.wtf("WorkSourceUtil", "Unable to assign blame through WorkSource", e10);
            }
        }
        return 0;
    }

    @n0
    @v8.a
    public static String e(@n0 WorkSource workSource, int i10) {
        Method method = f141918f;
        if (method == null) {
            return null;
        }
        try {
            return (String) method.invoke(workSource, Integer.valueOf(i10));
        } catch (Exception e10) {
            Log.wtf("WorkSourceUtil", "Unable to assign blame through WorkSource", e10);
            return null;
        }
    }

    @n0
    @v8.a
    public static List<String> f(@n0 WorkSource workSource) {
        ArrayList arrayList = new ArrayList();
        int i10 = workSource == null ? 0 : i(workSource);
        if (i10 != 0) {
            for (int i11 = 0; i11 < i10; i11++) {
                String strE = e(workSource, i11);
                if (!b0.b(strE)) {
                    com.google.android.gms.common.internal.p.l(strE);
                    arrayList.add(strE);
                }
            }
        }
        return arrayList;
    }

    @v8.a
    public static boolean g(@n0 Context context) {
        return (context == null || context.getPackageManager() == null || com.google.android.gms.common.wrappers.e.a(context).b("android.permission.UPDATE_DEVICE_STATS", context.getPackageName()) != 0) ? false : true;
    }

    @v8.a
    public static boolean h(@n0 WorkSource workSource) {
        Method method = f141921i;
        if (method != null) {
            try {
                Object objInvoke = method.invoke(workSource, new Object[0]);
                com.google.android.gms.common.internal.p.l(objInvoke);
                return ((Boolean) objInvoke).booleanValue();
            } catch (Exception e10) {
                Log.e("WorkSourceUtil", "Unable to check WorkSource emptiness", e10);
            }
        }
        return i(workSource) == 0;
    }

    @v8.a
    public static int i(@n0 WorkSource workSource) {
        Method method = f141916d;
        if (method != null) {
            try {
                Object objInvoke = method.invoke(workSource, new Object[0]);
                com.google.android.gms.common.internal.p.l(objInvoke);
                return ((Integer) objInvoke).intValue();
            } catch (Exception e10) {
                Log.wtf("WorkSourceUtil", "Unable to assign blame through WorkSource", e10);
            }
        }
        return 0;
    }
}
