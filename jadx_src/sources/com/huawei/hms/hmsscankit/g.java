package com.huawei.hms.hmsscankit;

import android.content.Context;
import android.content.pm.PackageManager;
import android.os.IBinder;
import android.util.Log;
import com.huawei.hms.common.Preconditions;
import com.huawei.hms.feature.dynamic.DynamicModule;
import com.huawei.hms.hmsscankit.api.IRemoteCreator;
import com.huawei.hms.scankit.p.b4;
import com.huawei.hms.scankit.p.o4;
import com.huawei.hms.scankit.p.y3;
import java.lang.reflect.InvocationTargetException;

/* JADX INFO: compiled from: RemoteViewInitializer.java */
/* JADX INFO: loaded from: classes7.dex */
public class g {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static boolean f61135a = false;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static boolean f61136b = false;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static boolean f61137c = false;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    static int f61138d = Integer.MIN_VALUE;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    static int f61139e = Integer.MIN_VALUE;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private static volatile Context f61140f;

    public static int a(Context context) {
        try {
            return context.getPackageManager().getApplicationInfo(context.getPackageName(), 128).metaData.getInt("huawei_module_scankit_local", Integer.MAX_VALUE);
        } catch (PackageManager.NameNotFoundException unused) {
            o4.b("exception", "NameNotFoundException");
            return Integer.MAX_VALUE;
        }
    }

    public static boolean a() {
        return f61137c && f61135a && f61136b;
    }

    public static void b(Context context) throws IllegalAccessException, NoSuchMethodException, ClassNotFoundException, InvocationTargetException {
        context.getClassLoader().loadClass("com.huawei.hms.feature.DynamicModuleInitializer").getDeclaredMethod("initializeModule", Context.class).invoke(null, context);
    }

    static IRemoteCreator c(Context context) {
        Preconditions.checkNotNull(context);
        try {
            Context contextE = e(context);
            if (contextE == null) {
                return null;
            }
            Object objNewInstance = contextE.getClassLoader().loadClass("com.huawei.hms.scankit.Creator").newInstance();
            if (objNewInstance instanceof IBinder) {
                return IRemoteCreator.Stub.asInterface((IBinder) objNewInstance);
            }
            return null;
        } catch (ClassNotFoundException unused) {
            o4.b("exception", "ClassNotFoundException");
            return null;
        } catch (IllegalAccessException unused2) {
            o4.b("exception", "IllegalAccessException");
            return null;
        } catch (InstantiationException unused3) {
            o4.b("exception", "InstantiationException");
            return null;
        } catch (NoSuchMethodException unused4) {
            o4.b("exception", "NoSuchMethodException");
            return null;
        } catch (InvocationTargetException unused5) {
            o4.b("exception", "InvocationTargetException");
            return null;
        }
    }

    static IRemoteCreator d(Context context) {
        Preconditions.checkNotNull(context);
        try {
            Object objNewInstance = context.getClassLoader().loadClass("com.huawei.hms.scankit.Creator").newInstance();
            if (objNewInstance instanceof IBinder) {
                return IRemoteCreator.Stub.asInterface((IBinder) objNewInstance);
            }
        } catch (ClassNotFoundException unused) {
            o4.b("exception", "ClassNotFoundException");
        } catch (IllegalAccessException unused2) {
            o4.b("exception", "IllegalAccessException");
        } catch (InstantiationException unused3) {
            o4.b("exception", "InvocationTargetException");
        }
        return null;
    }

    public static Context e(Context context) throws IllegalAccessException, NoSuchMethodException, ClassNotFoundException, InvocationTargetException {
        Log.i("ScankitSDK", "ScankitSDK Version: SCAN2.12.0.301");
        b(context);
        if (f61140f != null && !a()) {
            Log.i("ScankitSDK", "context has been inited");
            return f61140f;
        }
        try {
            b4.f61566a = false;
            if (f61138d == Integer.MIN_VALUE) {
                f61138d = a(context);
            }
            Context moduleContext = DynamicModule.load(context.getApplicationContext(), DynamicModule.PREFER_REMOTE, "huawei_module_scankit").getModuleContext();
            if (f61139e == Integer.MIN_VALUE) {
                f61139e = DynamicModule.getRemoteVersion(context.getApplicationContext(), "huawei_module_scankit");
            }
            if (f61138d >= 21200300) {
                f61137c = true;
            } else {
                f61137c = false;
            }
            String strB = y3.b(context);
            o4.d("ScankitSDK", "local Version: " + f61138d + " remote Version: " + f61139e);
            if (!a() && f61138d < f61139e && !strB.equals("com.huawei.scanner")) {
                f61135a = true;
                b4.f61566a = true;
                b4.f61567b = String.valueOf(f61139e);
                Log.i("ScankitSDK", "use remote scankit " + f61139e);
                f61140f = moduleContext;
                return f61140f;
            }
            o4.d("ScankitSDK", "use local Version: " + f61138d);
            b(context);
            f61135a = false;
            f61140f = null;
            return context;
        } catch (DynamicModule.LoadingException e10) {
            o4.b("ScankitSDK", "ClassNotFoundException exception " + e10.getMessage());
            b(context);
            return context;
        } catch (ClassNotFoundException unused) {
            o4.b("ScankitSDK", "ClassNotFoundException exception");
            b(context);
            return context;
        } catch (IllegalAccessException unused2) {
            o4.b("ScankitSDK", "IllegalAccessException exception");
            b(context);
            return context;
        } catch (NoSuchMethodException unused3) {
            o4.b("ScankitSDK", "NoSuchMethodException exception");
            b(context);
            return context;
        } catch (RuntimeException unused4) {
            o4.b("ScankitSDK", "other RuntimeException exception");
            b(context);
            return context;
        } catch (InvocationTargetException unused5) {
            o4.b("ScankitSDK", "InvocationTargetException exception");
            b(context);
            return context;
        } catch (Exception unused6) {
            o4.b("ScankitSDK", "Exception exception");
            b(context);
            return context;
        } catch (Throwable unused7) {
            o4.b("ScankitSDK", "Throwable exception");
            b(context);
            return context;
        }
    }
}
