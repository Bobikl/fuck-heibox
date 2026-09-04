package com.google.android.gms.dynamite;

import android.content.Context;
import android.content.pm.ApplicationInfo;
import android.content.pm.ProviderInfo;
import android.database.Cursor;
import android.net.Uri;
import android.os.Build;
import android.os.IBinder;
import android.os.IInterface;
import android.os.RemoteException;
import android.os.SystemClock;
import android.util.Log;
import androidx.annotation.n0;
import androidx.annotation.p0;
import com.google.android.gms.common.util.DynamiteApi;
import com.huawei.hms.framework.common.ExceptionCode;
import dalvik.system.PathClassLoader;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import javax.annotation.concurrent.GuardedBy;

/* JADX INFO: compiled from: com.google.android.gms:play-services-basement@@18.1.0 */
/* JADX INFO: loaded from: classes7.dex */
@v8.a
public final class DynamiteModule {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @v8.a
    public static final int f52675b = -1;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @v8.a
    public static final int f52676c = 1;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @v8.a
    public static final int f52677d = 0;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    @v8.a
    public static final int f52678e = 0;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    @GuardedBy("DynamiteModule.class")
    @p0
    private static Boolean f52685l = null;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    @GuardedBy("DynamiteModule.class")
    @p0
    private static String f52686m = null;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    @GuardedBy("DynamiteModule.class")
    private static boolean f52687n = false;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    @GuardedBy("DynamiteModule.class")
    private static int f52688o = -1;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    @GuardedBy("DynamiteModule.class")
    @p0
    private static Boolean f52689p;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    @GuardedBy("DynamiteModule.class")
    @p0
    private static q f52694u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    @GuardedBy("DynamiteModule.class")
    @p0
    private static r f52695v;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Context f52696a;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    private static final ThreadLocal f52690q = new ThreadLocal();

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    private static final ThreadLocal f52691r = new d();

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    private static final a.InterfaceC0412a f52692s = new e();

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    @n0
    @v8.a
    public static final a f52679f = new f();

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    @n0
    @v8.a
    public static final a f52680g = new g();

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    @n0
    @v8.a
    public static final a f52681h = new h();

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    @n0
    @v8.a
    public static final a f52682i = new i();

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    @n0
    @v8.a
    public static final a f52683j = new j();

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    @n0
    @v8.a
    public static final a f52684k = new k();

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    @n0
    public static final a f52693t = new l();

    /* JADX INFO: compiled from: com.google.android.gms:play-services-basement@@18.1.0 */
    @DynamiteApi
    public static class DynamiteLoaderClassLoader {

        @GuardedBy("DynamiteLoaderClassLoader.class")
        @p0
        public static ClassLoader sClassLoader;
    }

    /* JADX INFO: compiled from: com.google.android.gms:play-services-basement@@18.1.0 */
    @v8.a
    public static class LoadingException extends Exception {
        /* synthetic */ LoadingException(String str, p pVar) {
            super(str);
        }

        /* synthetic */ LoadingException(String str, Throwable th2, p pVar) {
            super(str, th2);
        }
    }

    /* JADX INFO: compiled from: com.google.android.gms:play-services-basement@@18.1.0 */
    public interface a {

        /* JADX INFO: renamed from: com.google.android.gms.dynamite.DynamiteModule$a$a, reason: collision with other inner class name */
        /* JADX INFO: compiled from: com.google.android.gms:play-services-basement@@18.1.0 */
        @v8.a
        public interface InterfaceC0412a {
            int a(@n0 Context context, @n0 String str, boolean z10) throws LoadingException;

            int b(@n0 Context context, @n0 String str);
        }

        /* JADX INFO: compiled from: com.google.android.gms:play-services-basement@@18.1.0 */
        @v8.a
        public static class b {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            @v8.a
            public int f52697a = 0;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            @v8.a
            public int f52698b = 0;

            /* JADX INFO: renamed from: c, reason: collision with root package name */
            @v8.a
            public int f52699c = 0;
        }

        @n0
        @v8.a
        b a(@n0 Context context, @n0 String str, @n0 InterfaceC0412a interfaceC0412a) throws LoadingException;
    }

    private DynamiteModule(Context context) {
        com.google.android.gms.common.internal.p.l(context);
        this.f52696a = context;
    }

    @v8.a
    public static int a(@n0 Context context, @n0 String str) {
        try {
            Class<?> clsLoadClass = context.getApplicationContext().getClassLoader().loadClass("com.google.android.gms.dynamite.descriptors." + str + ".ModuleDescriptor");
            Field declaredField = clsLoadClass.getDeclaredField("MODULE_ID");
            Field declaredField2 = clsLoadClass.getDeclaredField("MODULE_VERSION");
            if (com.google.android.gms.common.internal.o.b(declaredField.get(null), str)) {
                return declaredField2.getInt(null);
            }
            Log.e("DynamiteModule", "Module descriptor id '" + String.valueOf(declaredField.get(null)) + "' didn't match expected id '" + str + "'");
            return 0;
        } catch (ClassNotFoundException unused) {
            Log.w("DynamiteModule", "Local module descriptor class for " + str + " not found.");
            return 0;
        } catch (Exception e10) {
            Log.e("DynamiteModule", "Failed to load module descriptor class: ".concat(String.valueOf(e10.getMessage())));
            return 0;
        }
    }

    @v8.a
    public static int c(@n0 Context context, @n0 String str) {
        return f(context, str, false);
    }

    /* JADX WARN: Code duplicated, block: B:101:0x0209 A[Catch: all -> 0x0212, TRY_ENTER, TryCatch #2 {, blocks: (B:28:0x00a2, B:30:0x00a8, B:31:0x00aa, B:101:0x0209, B:102:0x0211), top: B:148:0x00a2 }] */
    /* JADX WARN: Code duplicated, block: B:131:0x028d A[Catch: all -> 0x02d6, TryCatch #6 {all -> 0x02d6, blocks: (B:3:0x0025, B:7:0x006f, B:12:0x0077, B:15:0x007d, B:26:0x009f, B:107:0x0216, B:108:0x0221, B:110:0x0223, B:112:0x0225, B:113:0x022d, B:131:0x028d, B:132:0x02a4, B:115:0x022f, B:117:0x024d, B:119:0x025e, B:129:0x0284, B:130:0x028c, B:133:0x02a5, B:134:0x02d5), top: B:151:0x0025, inners: #1 }] */
    /* JADX WARN: Code duplicated, block: B:147:0x009f A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:148:0x00a2 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:149:0x00d3 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:15:0x007d A[Catch: all -> 0x02d6, TRY_LEAVE, TryCatch #6 {all -> 0x02d6, blocks: (B:3:0x0025, B:7:0x006f, B:12:0x0077, B:15:0x007d, B:26:0x009f, B:107:0x0216, B:108:0x0221, B:110:0x0223, B:112:0x0225, B:113:0x022d, B:131:0x028d, B:132:0x02a4, B:115:0x022f, B:117:0x024d, B:119:0x025e, B:129:0x0284, B:130:0x028c, B:133:0x02a5, B:134:0x02d5), top: B:151:0x0025, inners: #1 }] */
    /* JADX WARN: Code duplicated, block: B:18:0x0087  */
    /* JADX WARN: Code duplicated, block: B:19:0x008b  */
    /* JADX WARN: Code duplicated, block: B:22:0x0096  */
    /* JADX WARN: Code duplicated, block: B:25:0x009d A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:30:0x00a8 A[Catch: all -> 0x0212, TryCatch #2 {, blocks: (B:28:0x00a2, B:30:0x00a8, B:31:0x00aa, B:101:0x0209, B:102:0x0211), top: B:148:0x00a2 }] */
    /* JADX WARN: Code duplicated, block: B:33:0x00ad A[Catch: all -> 0x0215, LoadingException -> 0x0222, RemoteException -> 0x0224, TRY_ENTER, TryCatch #7 {RemoteException -> 0x0224, LoadingException -> 0x0222, all -> 0x0215, blocks: (B:27:0x00a1, B:33:0x00ad, B:35:0x00b4, B:36:0x00d2, B:40:0x00d8, B:42:0x00e0, B:44:0x00e4, B:45:0x00ef, B:52:0x00fc, B:54:0x0102, B:56:0x0129, B:58:0x0131, B:59:0x0138, B:60:0x0140, B:55:0x0116, B:63:0x0143, B:64:0x0144, B:65:0x014c, B:66:0x014d, B:67:0x0155, B:70:0x0158, B:71:0x0159, B:73:0x017d, B:75:0x0184, B:77:0x018c, B:83:0x01c5, B:85:0x01cb, B:95:0x01ee, B:96:0x01f6, B:78:0x019b, B:79:0x01a3, B:81:0x01a6, B:82:0x01b6, B:97:0x01f7, B:98:0x01ff, B:99:0x0200, B:100:0x0208, B:105:0x0214), top: B:152:0x00a1 }] */
    /* JADX WARN: Code duplicated, block: B:35:0x00b4 A[Catch: all -> 0x0215, LoadingException -> 0x0222, RemoteException -> 0x0224, TryCatch #7 {RemoteException -> 0x0224, LoadingException -> 0x0222, all -> 0x0215, blocks: (B:27:0x00a1, B:33:0x00ad, B:35:0x00b4, B:36:0x00d2, B:40:0x00d8, B:42:0x00e0, B:44:0x00e4, B:45:0x00ef, B:52:0x00fc, B:54:0x0102, B:56:0x0129, B:58:0x0131, B:59:0x0138, B:60:0x0140, B:55:0x0116, B:63:0x0143, B:64:0x0144, B:65:0x014c, B:66:0x014d, B:67:0x0155, B:70:0x0158, B:71:0x0159, B:73:0x017d, B:75:0x0184, B:77:0x018c, B:83:0x01c5, B:85:0x01cb, B:95:0x01ee, B:96:0x01f6, B:78:0x019b, B:79:0x01a3, B:81:0x01a6, B:82:0x01b6, B:97:0x01f7, B:98:0x01ff, B:99:0x0200, B:100:0x0208, B:105:0x0214), top: B:152:0x00a1 }] */
    /* JADX WARN: Code duplicated, block: B:40:0x00d8 A[Catch: all -> 0x0215, LoadingException -> 0x0222, RemoteException -> 0x0224, TRY_ENTER, TryCatch #7 {RemoteException -> 0x0224, LoadingException -> 0x0222, all -> 0x0215, blocks: (B:27:0x00a1, B:33:0x00ad, B:35:0x00b4, B:36:0x00d2, B:40:0x00d8, B:42:0x00e0, B:44:0x00e4, B:45:0x00ef, B:52:0x00fc, B:54:0x0102, B:56:0x0129, B:58:0x0131, B:59:0x0138, B:60:0x0140, B:55:0x0116, B:63:0x0143, B:64:0x0144, B:65:0x014c, B:66:0x014d, B:67:0x0155, B:70:0x0158, B:71:0x0159, B:73:0x017d, B:75:0x0184, B:77:0x018c, B:83:0x01c5, B:85:0x01cb, B:95:0x01ee, B:96:0x01f6, B:78:0x019b, B:79:0x01a3, B:81:0x01a6, B:82:0x01b6, B:97:0x01f7, B:98:0x01ff, B:99:0x0200, B:100:0x0208, B:105:0x0214), top: B:152:0x00a1 }] */
    /* JADX WARN: Code duplicated, block: B:66:0x014d A[Catch: all -> 0x0215, LoadingException -> 0x0222, RemoteException -> 0x0224, TryCatch #7 {RemoteException -> 0x0224, LoadingException -> 0x0222, all -> 0x0215, blocks: (B:27:0x00a1, B:33:0x00ad, B:35:0x00b4, B:36:0x00d2, B:40:0x00d8, B:42:0x00e0, B:44:0x00e4, B:45:0x00ef, B:52:0x00fc, B:54:0x0102, B:56:0x0129, B:58:0x0131, B:59:0x0138, B:60:0x0140, B:55:0x0116, B:63:0x0143, B:64:0x0144, B:65:0x014c, B:66:0x014d, B:67:0x0155, B:70:0x0158, B:71:0x0159, B:73:0x017d, B:75:0x0184, B:77:0x018c, B:83:0x01c5, B:85:0x01cb, B:95:0x01ee, B:96:0x01f6, B:78:0x019b, B:79:0x01a3, B:81:0x01a6, B:82:0x01b6, B:97:0x01f7, B:98:0x01ff, B:99:0x0200, B:100:0x0208, B:105:0x0214), top: B:152:0x00a1 }] */
    /* JADX WARN: Code duplicated, block: B:71:0x0159 A[Catch: all -> 0x0215, LoadingException -> 0x0222, RemoteException -> 0x0224, TryCatch #7 {RemoteException -> 0x0224, LoadingException -> 0x0222, all -> 0x0215, blocks: (B:27:0x00a1, B:33:0x00ad, B:35:0x00b4, B:36:0x00d2, B:40:0x00d8, B:42:0x00e0, B:44:0x00e4, B:45:0x00ef, B:52:0x00fc, B:54:0x0102, B:56:0x0129, B:58:0x0131, B:59:0x0138, B:60:0x0140, B:55:0x0116, B:63:0x0143, B:64:0x0144, B:65:0x014c, B:66:0x014d, B:67:0x0155, B:70:0x0158, B:71:0x0159, B:73:0x017d, B:75:0x0184, B:77:0x018c, B:83:0x01c5, B:85:0x01cb, B:95:0x01ee, B:96:0x01f6, B:78:0x019b, B:79:0x01a3, B:81:0x01a6, B:82:0x01b6, B:97:0x01f7, B:98:0x01ff, B:99:0x0200, B:100:0x0208, B:105:0x0214), top: B:152:0x00a1 }] */
    /* JADX WARN: Code duplicated, block: B:73:0x017d A[Catch: all -> 0x0215, LoadingException -> 0x0222, RemoteException -> 0x0224, TryCatch #7 {RemoteException -> 0x0224, LoadingException -> 0x0222, all -> 0x0215, blocks: (B:27:0x00a1, B:33:0x00ad, B:35:0x00b4, B:36:0x00d2, B:40:0x00d8, B:42:0x00e0, B:44:0x00e4, B:45:0x00ef, B:52:0x00fc, B:54:0x0102, B:56:0x0129, B:58:0x0131, B:59:0x0138, B:60:0x0140, B:55:0x0116, B:63:0x0143, B:64:0x0144, B:65:0x014c, B:66:0x014d, B:67:0x0155, B:70:0x0158, B:71:0x0159, B:73:0x017d, B:75:0x0184, B:77:0x018c, B:83:0x01c5, B:85:0x01cb, B:95:0x01ee, B:96:0x01f6, B:78:0x019b, B:79:0x01a3, B:81:0x01a6, B:82:0x01b6, B:97:0x01f7, B:98:0x01ff, B:99:0x0200, B:100:0x0208, B:105:0x0214), top: B:152:0x00a1 }] */
    /* JADX WARN: Code duplicated, block: B:75:0x0184 A[Catch: all -> 0x0215, LoadingException -> 0x0222, RemoteException -> 0x0224, TryCatch #7 {RemoteException -> 0x0224, LoadingException -> 0x0222, all -> 0x0215, blocks: (B:27:0x00a1, B:33:0x00ad, B:35:0x00b4, B:36:0x00d2, B:40:0x00d8, B:42:0x00e0, B:44:0x00e4, B:45:0x00ef, B:52:0x00fc, B:54:0x0102, B:56:0x0129, B:58:0x0131, B:59:0x0138, B:60:0x0140, B:55:0x0116, B:63:0x0143, B:64:0x0144, B:65:0x014c, B:66:0x014d, B:67:0x0155, B:70:0x0158, B:71:0x0159, B:73:0x017d, B:75:0x0184, B:77:0x018c, B:83:0x01c5, B:85:0x01cb, B:95:0x01ee, B:96:0x01f6, B:78:0x019b, B:79:0x01a3, B:81:0x01a6, B:82:0x01b6, B:97:0x01f7, B:98:0x01ff, B:99:0x0200, B:100:0x0208, B:105:0x0214), top: B:152:0x00a1 }] */
    /* JADX WARN: Code duplicated, block: B:77:0x018c A[Catch: all -> 0x0215, LoadingException -> 0x0222, RemoteException -> 0x0224, TryCatch #7 {RemoteException -> 0x0224, LoadingException -> 0x0222, all -> 0x0215, blocks: (B:27:0x00a1, B:33:0x00ad, B:35:0x00b4, B:36:0x00d2, B:40:0x00d8, B:42:0x00e0, B:44:0x00e4, B:45:0x00ef, B:52:0x00fc, B:54:0x0102, B:56:0x0129, B:58:0x0131, B:59:0x0138, B:60:0x0140, B:55:0x0116, B:63:0x0143, B:64:0x0144, B:65:0x014c, B:66:0x014d, B:67:0x0155, B:70:0x0158, B:71:0x0159, B:73:0x017d, B:75:0x0184, B:77:0x018c, B:83:0x01c5, B:85:0x01cb, B:95:0x01ee, B:96:0x01f6, B:78:0x019b, B:79:0x01a3, B:81:0x01a6, B:82:0x01b6, B:97:0x01f7, B:98:0x01ff, B:99:0x0200, B:100:0x0208, B:105:0x0214), top: B:152:0x00a1 }] */
    /* JADX WARN: Code duplicated, block: B:78:0x019b A[Catch: all -> 0x0215, LoadingException -> 0x0222, RemoteException -> 0x0224, TryCatch #7 {RemoteException -> 0x0224, LoadingException -> 0x0222, all -> 0x0215, blocks: (B:27:0x00a1, B:33:0x00ad, B:35:0x00b4, B:36:0x00d2, B:40:0x00d8, B:42:0x00e0, B:44:0x00e4, B:45:0x00ef, B:52:0x00fc, B:54:0x0102, B:56:0x0129, B:58:0x0131, B:59:0x0138, B:60:0x0140, B:55:0x0116, B:63:0x0143, B:64:0x0144, B:65:0x014c, B:66:0x014d, B:67:0x0155, B:70:0x0158, B:71:0x0159, B:73:0x017d, B:75:0x0184, B:77:0x018c, B:83:0x01c5, B:85:0x01cb, B:95:0x01ee, B:96:0x01f6, B:78:0x019b, B:79:0x01a3, B:81:0x01a6, B:82:0x01b6, B:97:0x01f7, B:98:0x01ff, B:99:0x0200, B:100:0x0208, B:105:0x0214), top: B:152:0x00a1 }] */
    /* JADX WARN: Code duplicated, block: B:80:0x01a4 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:81:0x01a6 A[Catch: all -> 0x0215, LoadingException -> 0x0222, RemoteException -> 0x0224, TryCatch #7 {RemoteException -> 0x0224, LoadingException -> 0x0222, all -> 0x0215, blocks: (B:27:0x00a1, B:33:0x00ad, B:35:0x00b4, B:36:0x00d2, B:40:0x00d8, B:42:0x00e0, B:44:0x00e4, B:45:0x00ef, B:52:0x00fc, B:54:0x0102, B:56:0x0129, B:58:0x0131, B:59:0x0138, B:60:0x0140, B:55:0x0116, B:63:0x0143, B:64:0x0144, B:65:0x014c, B:66:0x014d, B:67:0x0155, B:70:0x0158, B:71:0x0159, B:73:0x017d, B:75:0x0184, B:77:0x018c, B:83:0x01c5, B:85:0x01cb, B:95:0x01ee, B:96:0x01f6, B:78:0x019b, B:79:0x01a3, B:81:0x01a6, B:82:0x01b6, B:97:0x01f7, B:98:0x01ff, B:99:0x0200, B:100:0x0208, B:105:0x0214), top: B:152:0x00a1 }] */
    /* JADX WARN: Code duplicated, block: B:82:0x01b6 A[Catch: all -> 0x0215, LoadingException -> 0x0222, RemoteException -> 0x0224, TryCatch #7 {RemoteException -> 0x0224, LoadingException -> 0x0222, all -> 0x0215, blocks: (B:27:0x00a1, B:33:0x00ad, B:35:0x00b4, B:36:0x00d2, B:40:0x00d8, B:42:0x00e0, B:44:0x00e4, B:45:0x00ef, B:52:0x00fc, B:54:0x0102, B:56:0x0129, B:58:0x0131, B:59:0x0138, B:60:0x0140, B:55:0x0116, B:63:0x0143, B:64:0x0144, B:65:0x014c, B:66:0x014d, B:67:0x0155, B:70:0x0158, B:71:0x0159, B:73:0x017d, B:75:0x0184, B:77:0x018c, B:83:0x01c5, B:85:0x01cb, B:95:0x01ee, B:96:0x01f6, B:78:0x019b, B:79:0x01a3, B:81:0x01a6, B:82:0x01b6, B:97:0x01f7, B:98:0x01ff, B:99:0x0200, B:100:0x0208, B:105:0x0214), top: B:152:0x00a1 }] */
    /* JADX WARN: Code duplicated, block: B:85:0x01cb A[Catch: all -> 0x0215, LoadingException -> 0x0222, RemoteException -> 0x0224, TRY_LEAVE, TryCatch #7 {RemoteException -> 0x0224, LoadingException -> 0x0222, all -> 0x0215, blocks: (B:27:0x00a1, B:33:0x00ad, B:35:0x00b4, B:36:0x00d2, B:40:0x00d8, B:42:0x00e0, B:44:0x00e4, B:45:0x00ef, B:52:0x00fc, B:54:0x0102, B:56:0x0129, B:58:0x0131, B:59:0x0138, B:60:0x0140, B:55:0x0116, B:63:0x0143, B:64:0x0144, B:65:0x014c, B:66:0x014d, B:67:0x0155, B:70:0x0158, B:71:0x0159, B:73:0x017d, B:75:0x0184, B:77:0x018c, B:83:0x01c5, B:85:0x01cb, B:95:0x01ee, B:96:0x01f6, B:78:0x019b, B:79:0x01a3, B:81:0x01a6, B:82:0x01b6, B:97:0x01f7, B:98:0x01ff, B:99:0x0200, B:100:0x0208, B:105:0x0214), top: B:152:0x00a1 }] */
    /* JADX WARN: Code duplicated, block: B:88:0x01d8  */
    /* JADX WARN: Code duplicated, block: B:89:0x01dc  */
    /* JADX WARN: Code duplicated, block: B:92:0x01e7  */
    /* JADX WARN: Code duplicated, block: B:95:0x01ee A[Catch: all -> 0x0215, LoadingException -> 0x0222, RemoteException -> 0x0224, TRY_ENTER, TryCatch #7 {RemoteException -> 0x0224, LoadingException -> 0x0222, all -> 0x0215, blocks: (B:27:0x00a1, B:33:0x00ad, B:35:0x00b4, B:36:0x00d2, B:40:0x00d8, B:42:0x00e0, B:44:0x00e4, B:45:0x00ef, B:52:0x00fc, B:54:0x0102, B:56:0x0129, B:58:0x0131, B:59:0x0138, B:60:0x0140, B:55:0x0116, B:63:0x0143, B:64:0x0144, B:65:0x014c, B:66:0x014d, B:67:0x0155, B:70:0x0158, B:71:0x0159, B:73:0x017d, B:75:0x0184, B:77:0x018c, B:83:0x01c5, B:85:0x01cb, B:95:0x01ee, B:96:0x01f6, B:78:0x019b, B:79:0x01a3, B:81:0x01a6, B:82:0x01b6, B:97:0x01f7, B:98:0x01ff, B:99:0x0200, B:100:0x0208, B:105:0x0214), top: B:152:0x00a1 }] */
    /* JADX WARN: Code duplicated, block: B:97:0x01f7 A[Catch: all -> 0x0215, LoadingException -> 0x0222, RemoteException -> 0x0224, TryCatch #7 {RemoteException -> 0x0224, LoadingException -> 0x0222, all -> 0x0215, blocks: (B:27:0x00a1, B:33:0x00ad, B:35:0x00b4, B:36:0x00d2, B:40:0x00d8, B:42:0x00e0, B:44:0x00e4, B:45:0x00ef, B:52:0x00fc, B:54:0x0102, B:56:0x0129, B:58:0x0131, B:59:0x0138, B:60:0x0140, B:55:0x0116, B:63:0x0143, B:64:0x0144, B:65:0x014c, B:66:0x014d, B:67:0x0155, B:70:0x0158, B:71:0x0159, B:73:0x017d, B:75:0x0184, B:77:0x018c, B:83:0x01c5, B:85:0x01cb, B:95:0x01ee, B:96:0x01f6, B:78:0x019b, B:79:0x01a3, B:81:0x01a6, B:82:0x01b6, B:97:0x01f7, B:98:0x01ff, B:99:0x0200, B:100:0x0208, B:105:0x0214), top: B:152:0x00a1 }] */
    /* JADX WARN: Code duplicated, block: B:99:0x0200 A[Catch: all -> 0x0215, LoadingException -> 0x0222, RemoteException -> 0x0224, TryCatch #7 {RemoteException -> 0x0224, LoadingException -> 0x0222, all -> 0x0215, blocks: (B:27:0x00a1, B:33:0x00ad, B:35:0x00b4, B:36:0x00d2, B:40:0x00d8, B:42:0x00e0, B:44:0x00e4, B:45:0x00ef, B:52:0x00fc, B:54:0x0102, B:56:0x0129, B:58:0x0131, B:59:0x0138, B:60:0x0140, B:55:0x0116, B:63:0x0143, B:64:0x0144, B:65:0x014c, B:66:0x014d, B:67:0x0155, B:70:0x0158, B:71:0x0159, B:73:0x017d, B:75:0x0184, B:77:0x018c, B:83:0x01c5, B:85:0x01cb, B:95:0x01ee, B:96:0x01f6, B:78:0x019b, B:79:0x01a3, B:81:0x01a6, B:82:0x01b6, B:97:0x01f7, B:98:0x01ff, B:99:0x0200, B:100:0x0208, B:105:0x0214), top: B:152:0x00a1 }] */
    /* JADX WARN: Instruction removed from duplicated block: B:131:0x028d, please report this as an issue */
    /* JADX WARN: Instruction removed from duplicated block: B:35:0x00b4, please report this as an issue */
    /* JADX WARN: Instruction removed from duplicated block: B:71:0x0159, please report this as an issue */
    @n0
    @v8.a
    public static DynamiteModule e(@n0 Context context, @n0 a aVar, @n0 String str) throws LoadingException {
        int i10;
        Boolean bool;
        q qVarL;
        int iQ1;
        com.google.android.gms.dynamic.c cVarT1;
        Object objR0;
        DynamiteModule dynamiteModule;
        n nVar;
        Cursor cursor;
        r rVar;
        n nVar2;
        Boolean boolValueOf;
        com.google.android.gms.dynamic.c cVarQ1;
        Cursor cursor2;
        ThreadLocal threadLocal = f52690q;
        n nVar3 = (n) threadLocal.get();
        n nVar4 = new n(null);
        threadLocal.set(nVar4);
        ThreadLocal threadLocal2 = f52691r;
        long jLongValue = ((Long) threadLocal2.get()).longValue();
        try {
            threadLocal2.set(Long.valueOf(SystemClock.elapsedRealtime()));
            a.b bVarA = aVar.a(context, str, f52692s);
            Log.i("DynamiteModule", "Considering local module " + str + ":" + bVarA.f52697a + " and remote module " + str + ":" + bVarA.f52698b);
            int i11 = bVarA.f52699c;
            if (i11 != 0) {
                if (i11 != -1) {
                    if (i11 == 1 || bVarA.f52698b != 0) {
                        if (i11 == -1) {
                            DynamiteModule dynamiteModuleH = h(context, str);
                            if (jLongValue == 0) {
                                threadLocal2.remove();
                            } else {
                                threadLocal2.set(Long.valueOf(jLongValue));
                            }
                            cursor2 = nVar4.f52702a;
                            if (cursor2 != null) {
                                cursor2.close();
                            }
                            threadLocal.set(nVar3);
                            return dynamiteModuleH;
                        }
                        if (i11 == 1) {
                            throw new LoadingException("VersionPolicy returned invalid code:" + i11, null);
                        }
                        try {
                            i10 = bVarA.f52698b;
                            try {
                                synchronized (DynamiteModule.class) {
                                    if (k(context)) {
                                        throw new LoadingException("Remote loading disabled", null);
                                    }
                                    bool = f52685l;
                                }
                                if (bool != null) {
                                    throw new LoadingException("Failed to determine which loading route to use.", null);
                                }
                                if (bool.booleanValue()) {
                                    Log.i("DynamiteModule", "Selected remote version of " + str + ", version >= " + i10);
                                    synchronized (DynamiteModule.class) {
                                        rVar = f52695v;
                                    }
                                    if (rVar != null) {
                                        throw new LoadingException("DynamiteLoaderV2 was not cached.", null);
                                    }
                                    nVar2 = (n) threadLocal.get();
                                    if (nVar2 != null || nVar2.f52702a == null) {
                                        throw new LoadingException("No result cursor", null);
                                    }
                                    Context applicationContext = context.getApplicationContext();
                                    Cursor cursor3 = nVar2.f52702a;
                                    com.google.android.gms.dynamic.e.f1(null);
                                    synchronized (DynamiteModule.class) {
                                        boolValueOf = Boolean.valueOf(f52688o >= 2);
                                    }
                                    if (boolValueOf.booleanValue()) {
                                        Log.v("DynamiteModule", "Dynamite loader version >= 2, using loadModule2NoCrashUtils");
                                        cVarQ1 = rVar.r1(com.google.android.gms.dynamic.e.f1(applicationContext), str, i10, com.google.android.gms.dynamic.e.f1(cursor3));
                                    } else {
                                        Log.w("DynamiteModule", "Dynamite loader version < 2, falling back to loadModule2");
                                        cVarQ1 = rVar.q1(com.google.android.gms.dynamic.e.f1(applicationContext), str, i10, com.google.android.gms.dynamic.e.f1(cursor3));
                                    }
                                    Context context2 = (Context) com.google.android.gms.dynamic.e.r0(cVarQ1);
                                    if (context2 == null) {
                                        throw new LoadingException("Failed to get module context", null);
                                    }
                                    dynamiteModule = new DynamiteModule(context2);
                                } else {
                                    Log.i("DynamiteModule", "Selected remote version of " + str + ", version >= " + i10);
                                    qVarL = l(context);
                                    if (qVarL != null) {
                                        throw new LoadingException("Failed to create IDynamiteLoader.", null);
                                    }
                                    iQ1 = qVarL.q1();
                                    if (iQ1 >= 3) {
                                        nVar = (n) threadLocal.get();
                                        if (nVar != null) {
                                            throw new LoadingException("No cached result cursor holder", null);
                                        }
                                        cVarT1 = qVarL.u1(com.google.android.gms.dynamic.e.f1(context), str, i10, com.google.android.gms.dynamic.e.f1(nVar.f52702a));
                                    } else if (iQ1 == 2) {
                                        Log.w("DynamiteModule", "IDynamite loader version = 2");
                                        cVarT1 = qVarL.v1(com.google.android.gms.dynamic.e.f1(context), str, i10);
                                    } else {
                                        Log.w("DynamiteModule", "Dynamite loader version < 2, falling back to createModuleContext");
                                        cVarT1 = qVarL.t1(com.google.android.gms.dynamic.e.f1(context), str, i10);
                                    }
                                    objR0 = com.google.android.gms.dynamic.e.r0(cVarT1);
                                    if (objR0 != null) {
                                        throw new LoadingException("Failed to load remote module.", null);
                                    }
                                    dynamiteModule = new DynamiteModule((Context) objR0);
                                }
                                if (jLongValue == 0) {
                                    threadLocal2.remove();
                                } else {
                                    threadLocal2.set(Long.valueOf(jLongValue));
                                }
                                cursor = nVar4.f52702a;
                                if (cursor != null) {
                                    cursor.close();
                                }
                                threadLocal.set(nVar3);
                                return dynamiteModule;
                            } catch (RemoteException e10) {
                                throw new LoadingException("Failed to load remote module.", e10, null);
                            } catch (LoadingException e11) {
                                throw e11;
                            } catch (Throwable th2) {
                                z8.i.a(context, th2);
                                throw new LoadingException("Failed to load remote module.", th2, null);
                            }
                        } catch (LoadingException e12) {
                            Log.w("DynamiteModule", "Failed to load remote module: " + e12.getMessage());
                            int i12 = bVarA.f52697a;
                            if (i12 == 0 || aVar.a(context, str, new o(i12, 0)).f52699c != -1) {
                                throw new LoadingException("Remote load failed. No local fallback found.", e12, null);
                            }
                            DynamiteModule dynamiteModuleH2 = h(context, str);
                            if (jLongValue == 0) {
                                f52691r.remove();
                            } else {
                                f52691r.set(Long.valueOf(jLongValue));
                            }
                            Cursor cursor4 = nVar4.f52702a;
                            if (cursor4 != null) {
                                cursor4.close();
                            }
                            f52690q.set(nVar3);
                            return dynamiteModuleH2;
                        }
                    }
                } else if (bVarA.f52697a != 0) {
                    i11 = -1;
                    if (i11 == 1) {
                    }
                    if (i11 == -1) {
                        DynamiteModule dynamiteModuleH3 = h(context, str);
                        if (jLongValue == 0) {
                            threadLocal2.remove();
                        } else {
                            threadLocal2.set(Long.valueOf(jLongValue));
                        }
                        cursor2 = nVar4.f52702a;
                        if (cursor2 != null) {
                            cursor2.close();
                        }
                        threadLocal.set(nVar3);
                        return dynamiteModuleH3;
                    }
                    if (i11 == 1) {
                        throw new LoadingException("VersionPolicy returned invalid code:" + i11, null);
                    }
                    i10 = bVarA.f52698b;
                    synchronized (DynamiteModule.class) {
                        if (k(context)) {
                            throw new LoadingException("Remote loading disabled", null);
                        }
                        bool = f52685l;
                        if (bool != null) {
                            throw new LoadingException("Failed to determine which loading route to use.", null);
                        }
                        if (bool.booleanValue()) {
                            Log.i("DynamiteModule", "Selected remote version of " + str + ", version >= " + i10);
                            synchronized (DynamiteModule.class) {
                                rVar = f52695v;
                                if (rVar != null) {
                                    throw new LoadingException("DynamiteLoaderV2 was not cached.", null);
                                }
                                nVar2 = (n) threadLocal.get();
                                if (nVar2 != null) {
                                }
                                throw new LoadingException("No result cursor", null);
                            }
                        }
                        Log.i("DynamiteModule", "Selected remote version of " + str + ", version >= " + i10);
                        qVarL = l(context);
                        if (qVarL != null) {
                            throw new LoadingException("Failed to create IDynamiteLoader.", null);
                        }
                        iQ1 = qVarL.q1();
                        if (iQ1 >= 3) {
                            nVar = (n) threadLocal.get();
                            if (nVar != null) {
                                throw new LoadingException("No cached result cursor holder", null);
                            }
                            cVarT1 = qVarL.u1(com.google.android.gms.dynamic.e.f1(context), str, i10, com.google.android.gms.dynamic.e.f1(nVar.f52702a));
                        } else if (iQ1 == 2) {
                            Log.w("DynamiteModule", "IDynamite loader version = 2");
                            cVarT1 = qVarL.v1(com.google.android.gms.dynamic.e.f1(context), str, i10);
                        } else {
                            Log.w("DynamiteModule", "Dynamite loader version < 2, falling back to createModuleContext");
                            cVarT1 = qVarL.t1(com.google.android.gms.dynamic.e.f1(context), str, i10);
                        }
                        objR0 = com.google.android.gms.dynamic.e.r0(cVarT1);
                        if (objR0 != null) {
                            throw new LoadingException("Failed to load remote module.", null);
                        }
                        dynamiteModule = new DynamiteModule((Context) objR0);
                        if (jLongValue == 0) {
                            threadLocal2.remove();
                        } else {
                            threadLocal2.set(Long.valueOf(jLongValue));
                        }
                        cursor = nVar4.f52702a;
                        if (cursor != null) {
                            cursor.close();
                        }
                        threadLocal.set(nVar3);
                        return dynamiteModule;
                    }
                }
            }
            throw new LoadingException("No acceptable module " + str + " found. Local version is " + bVarA.f52697a + " and remote version is " + bVarA.f52698b + ".", null);
        } catch (Throwable th3) {
            if (jLongValue == 0) {
                f52691r.remove();
            } else {
                f52691r.set(Long.valueOf(jLongValue));
            }
            Cursor cursor5 = nVar4.f52702a;
            if (cursor5 != null) {
                cursor5.close();
            }
            f52690q.set(nVar3);
            throw th3;
        }
    }

    /* JADX INFO: Removed unreachable split cross block B:135:0x01b6 */
    /* JADX WARN: Code duplicated, block: B:47:0x00a7 A[Catch: all -> 0x00b2, TryCatch #5 {, blocks: (B:9:0x0026, B:11:0x0032, B:48:0x00b0, B:14:0x0038, B:16:0x003f, B:18:0x0045, B:21:0x0048, B:23:0x004c, B:27:0x0056, B:29:0x005e, B:32:0x0065, B:39:0x008f, B:40:0x0097, B:35:0x006c, B:37:0x0072, B:38:0x0081, B:43:0x009a, B:46:0x009d, B:47:0x00a7, B:15:0x003b), top: B:129:0x0026, inners: #0 }] */
    /* JADX WARN: Code duplicated, block: B:94:0x0166 A[Catch: all -> 0x01c2, TRY_ENTER, TRY_LEAVE, TryCatch #2 {all -> 0x01c2, blocks: (B:3:0x0002, B:61:0x00d9, B:63:0x00df, B:68:0x0100, B:90:0x0158, B:94:0x0166, B:115:0x01bb, B:116:0x01be, B:110:0x01b3, B:66:0x00e5, B:119:0x01c1, B:4:0x0003, B:7:0x0009, B:8:0x0025, B:59:0x00d6, B:19:0x0046, B:41:0x0098, B:44:0x009b, B:52:0x00b4, B:60:0x00d8, B:58:0x00ba), top: B:128:0x0002, inners: #9, #12 }] */
    public static int f(@n0 Context context, @n0 String str, boolean z10) {
        Throwable th2;
        RemoteException e10;
        Cursor cursor;
        try {
            synchronized (DynamiteModule.class) {
                Boolean bool = f52685l;
                Cursor cursor2 = null;
                int iR1 = 0;
                if (bool == null) {
                    try {
                        Field declaredField = context.getApplicationContext().getClassLoader().loadClass(DynamiteLoaderClassLoader.class.getName()).getDeclaredField("sClassLoader");
                        synchronized (declaredField.getDeclaringClass()) {
                            ClassLoader classLoader = (ClassLoader) declaredField.get(null);
                            if (classLoader == ClassLoader.getSystemClassLoader()) {
                                bool = Boolean.FALSE;
                            } else if (classLoader != null) {
                                try {
                                    i(classLoader);
                                } catch (LoadingException unused) {
                                }
                                bool = Boolean.TRUE;
                            } else {
                                if (!k(context)) {
                                    return 0;
                                }
                                if (f52687n) {
                                    declaredField.set(null, ClassLoader.getSystemClassLoader());
                                    bool = Boolean.FALSE;
                                } else {
                                    Boolean bool2 = Boolean.TRUE;
                                    if (bool2.equals(null)) {
                                        declaredField.set(null, ClassLoader.getSystemClassLoader());
                                        bool = Boolean.FALSE;
                                    } else {
                                        try {
                                            int iG = g(context, str, z10, true);
                                            String str2 = f52686m;
                                            if (str2 != null && !str2.isEmpty()) {
                                                ClassLoader classLoaderA = b.a();
                                                if (classLoaderA == null) {
                                                    if (Build.VERSION.SDK_INT >= 29) {
                                                        final String str3 = f52686m;
                                                        com.google.android.gms.common.internal.p.l(str3);
                                                        final ClassLoader systemClassLoader = ClassLoader.getSystemClassLoader();
                                                        classLoaderA = new PathClassLoader(str3, systemClassLoader) { // from class: dalvik.system.DelegateLastClassLoader
                                                            static {
                                                                throw new NoClassDefFoundError();
                                                            }
                                                        };
                                                    } else {
                                                        String str4 = f52686m;
                                                        com.google.android.gms.common.internal.p.l(str4);
                                                        classLoaderA = new c(str4, ClassLoader.getSystemClassLoader());
                                                    }
                                                }
                                                i(classLoaderA);
                                                declaredField.set(null, classLoaderA);
                                                f52685l = bool2;
                                                return iG;
                                            }
                                            return iG;
                                        } catch (LoadingException unused2) {
                                            declaredField.set(null, ClassLoader.getSystemClassLoader());
                                            bool = Boolean.FALSE;
                                        }
                                    }
                                }
                            }
                            f52685l = bool;
                        }
                    } catch (ClassNotFoundException | IllegalAccessException | NoSuchFieldException e11) {
                        Log.w("DynamiteModule", "Failed to load module via V2: " + e11.toString());
                        bool = Boolean.FALSE;
                    }
                }
                if (bool.booleanValue()) {
                    try {
                        return g(context, str, z10, false);
                    } catch (LoadingException e12) {
                        Log.w("DynamiteModule", "Failed to retrieve remote module version: " + e12.getMessage());
                        return 0;
                    }
                }
                q qVarL = l(context);
                try {
                    if (qVarL != null) {
                        try {
                            int iQ1 = qVarL.q1();
                            if (iQ1 >= 3) {
                                n nVar = (n) f52690q.get();
                                if (nVar == null || (cursor = nVar.f52702a) == null) {
                                    Cursor cursor3 = (Cursor) com.google.android.gms.dynamic.e.r0(qVarL.w1(com.google.android.gms.dynamic.e.f1(context), str, z10, ((Long) f52691r.get()).longValue()));
                                    if (cursor3 != null) {
                                        try {
                                            if (cursor3.moveToFirst()) {
                                                int i10 = cursor3.getInt(0);
                                                cursor2 = (i10 <= 0 || !j(cursor3)) ? cursor3 : null;
                                                if (cursor2 != null) {
                                                    cursor2.close();
                                                }
                                                iR1 = i10;
                                            } else {
                                                Log.w("DynamiteModule", "Failed to retrieve remote module version.");
                                                if (cursor3 != null) {
                                                    cursor3.close();
                                                }
                                            }
                                        } catch (RemoteException e13) {
                                            e10 = e13;
                                            cursor2 = cursor3;
                                            Log.w("DynamiteModule", "Failed to retrieve remote module version: " + e10.getMessage());
                                            if (cursor2 != null) {
                                                cursor2.close();
                                            }
                                        } catch (Throwable th3) {
                                            th2 = th3;
                                            cursor2 = cursor3;
                                            if (cursor2 != null) {
                                                cursor2.close();
                                            }
                                            throw th2;
                                        }
                                    } else {
                                        Log.w("DynamiteModule", "Failed to retrieve remote module version.");
                                        if (cursor3 != null) {
                                            cursor3.close();
                                        }
                                    }
                                } else {
                                    iR1 = cursor.getInt(0);
                                }
                            } else if (iQ1 == 2) {
                                Log.w("DynamiteModule", "IDynamite loader version = 2, no high precision latency measurement.");
                                iR1 = qVarL.s1(com.google.android.gms.dynamic.e.f1(context), str, z10);
                            } else {
                                Log.w("DynamiteModule", "IDynamite loader version < 2, falling back to getModuleVersion2");
                                iR1 = qVarL.r1(com.google.android.gms.dynamic.e.f1(context), str, z10);
                            }
                        } catch (RemoteException e14) {
                            e10 = e14;
                        }
                    }
                    return iR1;
                } catch (Throwable th4) {
                    th2 = th4;
                }
            }
        } catch (Throwable th5) {
            z8.i.a(context, th5);
            throw th5;
        }
    }

    /* JADX WARN: Code duplicated, block: B:56:0x00c9  */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v0 */
    /* JADX WARN: Type inference failed for: r0v1, types: [android.database.Cursor] */
    /* JADX WARN: Type inference failed for: r0v2 */
    /* JADX WARN: Type inference failed for: r0v3 */
    /* JADX WARN: Type inference failed for: r0v4 */
    /* JADX WARN: Type inference failed for: r0v5 */
    /* JADX WARN: Type inference failed for: r0v6 */
    /* JADX WARN: Type inference failed for: r0v7 */
    /* JADX WARN: Type inference failed for: r0v8 */
    private static int g(Context context, String str, boolean z10, boolean z11) throws Throwable {
        Throwable th2;
        Exception e10;
        ?? r10 = 0;
        ?? r11 = 0;
        ?? r12 = 0;
        ?? r13 = 0;
        try {
            try {
                boolean z12 = true;
                Cursor cursorQuery = context.getContentResolver().query(new Uri.Builder().scheme("content").authority("com.google.android.gms.chimera").path(true != z10 ? "api" : "api_force_staging").appendPath(str).appendQueryParameter("requestStartTime", String.valueOf(((Long) f52691r.get()).longValue())).build(), null, null, null, null);
                if (cursorQuery != null) {
                    try {
                        if (cursorQuery.moveToFirst()) {
                            boolean z13 = false;
                            int i10 = cursorQuery.getInt(0);
                            if (i10 > 0) {
                                synchronized (DynamiteModule.class) {
                                    f52686m = cursorQuery.getString(2);
                                    int columnIndex = cursorQuery.getColumnIndex("loaderVersion");
                                    if (columnIndex >= 0) {
                                        f52688o = cursorQuery.getInt(columnIndex);
                                    }
                                    int columnIndex2 = cursorQuery.getColumnIndex("disableStandaloneDynamiteLoader2");
                                    if (columnIndex2 >= 0) {
                                        if (cursorQuery.getInt(columnIndex2) == 0) {
                                            z12 = false;
                                        }
                                        f52687n = z12;
                                        z13 = z12;
                                    }
                                }
                                if (j(cursorQuery)) {
                                    cursorQuery = null;
                                }
                            }
                            if (z11 && z13) {
                                throw new LoadingException("forcing fallback to container DynamiteLoader impl", r12 == true ? 1 : 0);
                            }
                            if (cursorQuery != null) {
                                cursorQuery.close();
                            }
                            return i10;
                        }
                    } catch (Exception e11) {
                        e10 = e11;
                        if (e10 instanceof LoadingException) {
                            throw e10;
                        }
                        throw new LoadingException("V2 version check failed", e10, r11 == true ? 1 : 0);
                    }
                }
                Log.w("DynamiteModule", "Failed to retrieve remote module version.");
                throw new LoadingException("Failed to connect to dynamite module ContentResolver.", r13 == true ? 1 : 0);
            } catch (Throwable th3) {
                th2 = th3;
                r10 = context;
                if (r10 != 0) {
                    r10.close();
                }
                throw th2;
            }
        } catch (Exception e12) {
            e10 = e12;
        } catch (Throwable th4) {
            th2 = th4;
            if (r10 != 0) {
                r10.close();
            }
            throw th2;
        }
    }

    private static DynamiteModule h(Context context, String str) {
        Log.i("DynamiteModule", "Selected local version of ".concat(String.valueOf(str)));
        return new DynamiteModule(context.getApplicationContext());
    }

    @GuardedBy("DynamiteModule.class")
    private static void i(ClassLoader classLoader) throws LoadingException {
        r rVar;
        p pVar = null;
        try {
            IBinder iBinder = (IBinder) classLoader.loadClass("com.google.android.gms.dynamiteloader.DynamiteLoaderV2").getConstructor(new Class[0]).newInstance(new Object[0]);
            if (iBinder == null) {
                rVar = null;
            } else {
                IInterface iInterfaceQueryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.dynamite.IDynamiteLoaderV2");
                rVar = iInterfaceQueryLocalInterface instanceof r ? (r) iInterfaceQueryLocalInterface : new r(iBinder);
            }
            f52695v = rVar;
        } catch (ClassNotFoundException | IllegalAccessException | InstantiationException | NoSuchMethodException | InvocationTargetException e10) {
            throw new LoadingException("Failed to instantiate dynamite loader", e10, pVar);
        }
    }

    private static boolean j(Cursor cursor) {
        n nVar = (n) f52690q.get();
        if (nVar == null || nVar.f52702a != null) {
            return false;
        }
        nVar.f52702a = cursor;
        return true;
    }

    @GuardedBy("DynamiteModule.class")
    private static boolean k(Context context) {
        ApplicationInfo applicationInfo;
        Boolean bool = Boolean.TRUE;
        if (bool.equals(null) || bool.equals(f52689p)) {
            return true;
        }
        boolean zBooleanValue = false;
        if (f52689p == null) {
            ProviderInfo providerInfoResolveContentProvider = context.getPackageManager().resolveContentProvider("com.google.android.gms.chimera", 0);
            if (com.google.android.gms.common.e.i().k(context, ExceptionCode.CRASH_EXCEPTION) == 0 && providerInfoResolveContentProvider != null && "com.google.android.gms".equals(providerInfoResolveContentProvider.packageName)) {
                zBooleanValue = true;
            }
            Boolean boolValueOf = Boolean.valueOf(zBooleanValue);
            f52689p = boolValueOf;
            zBooleanValue = boolValueOf.booleanValue();
            if (zBooleanValue && providerInfoResolveContentProvider != null && (applicationInfo = providerInfoResolveContentProvider.applicationInfo) != null && (applicationInfo.flags & 129) == 0) {
                Log.i("DynamiteModule", "Non-system-image GmsCore APK, forcing V1");
                f52687n = true;
            }
        }
        if (!zBooleanValue) {
            Log.e("DynamiteModule", "Invalid GmsCore APK, remote loading disabled.");
        }
        return zBooleanValue;
    }

    @p0
    private static q l(Context context) {
        q qVar;
        synchronized (DynamiteModule.class) {
            q qVar2 = f52694u;
            if (qVar2 != null) {
                return qVar2;
            }
            try {
                IBinder iBinder = (IBinder) context.createPackageContext("com.google.android.gms", 3).getClassLoader().loadClass("com.google.android.gms.chimera.container.DynamiteLoaderImpl").newInstance();
                if (iBinder == null) {
                    qVar = null;
                } else {
                    IInterface iInterfaceQueryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.dynamite.IDynamiteLoader");
                    qVar = iInterfaceQueryLocalInterface instanceof q ? (q) iInterfaceQueryLocalInterface : new q(iBinder);
                }
                if (qVar != null) {
                    f52694u = qVar;
                    return qVar;
                }
            } catch (Exception e10) {
                Log.e("DynamiteModule", "Failed to load IDynamiteLoader from GmsCore: " + e10.getMessage());
            }
            return null;
        }
    }

    @n0
    @v8.a
    public Context b() {
        return this.f52696a;
    }

    @n0
    @v8.a
    public IBinder d(@n0 String str) throws LoadingException {
        try {
            return (IBinder) this.f52696a.getClassLoader().loadClass(str).newInstance();
        } catch (ClassNotFoundException | IllegalAccessException | InstantiationException e10) {
            throw new LoadingException("Failed to instantiate module class: ".concat(String.valueOf(str)), e10, null);
        }
    }
}
