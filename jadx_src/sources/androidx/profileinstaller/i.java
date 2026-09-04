package androidx.profileinstaller;

import android.content.Context;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.content.res.AssetManager;
import android.util.Log;
import androidx.annotation.RestrictTo;
import androidx.annotation.k1;
import androidx.annotation.n0;
import androidx.annotation.p0;
import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.util.concurrent.Executor;

/* JADX INFO: compiled from: ProfileInstaller.java */
/* JADX INFO: loaded from: classes6.dex */
public class i {
    public static final int A = 14;
    public static final int B = 15;
    public static final int C = 16;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final String f26765a = "ProfileInstaller";

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static final String f26766b = "/data/misc/profiles/cur/0";

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static final String f26767c = "primary.prof";

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private static final String f26768d = "dexopt/baseline.prof";

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private static final String f26769e = "dexopt/baseline.profm";

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private static final String f26770f = "profileinstaller_profileWrittenFor_lastUpdateTime.dat";

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private static final d f26771g = new a();

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    @n0
    static final d f26772h = new b();

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public static final int f26773i = 1;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public static final int f26774j = 2;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public static final int f26775k = 3;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public static final int f26776l = 4;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public static final int f26777m = 5;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public static final int f26778n = 1;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public static final int f26779o = 2;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public static final int f26780p = 3;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public static final int f26781q = 4;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public static final int f26782r = 5;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public static final int f26783s = 6;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public static final int f26784t = 7;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public static final int f26785u = 8;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public static final int f26786v = 9;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public static final int f26787w = 10;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public static final int f26788x = 11;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public static final int f26789y = 12;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    public static final int f26790z = 13;

    /* JADX INFO: compiled from: ProfileInstaller.java */
    public class a implements d {
        a() {
        }

        @Override // androidx.profileinstaller.i.d
        public void a(int i10, @p0 Object obj) {
        }

        @Override // androidx.profileinstaller.i.d
        public void b(int i10, @p0 Object obj) {
        }
    }

    /* JADX INFO: compiled from: ProfileInstaller.java */
    public class b implements d {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        static final String f26791a = "ProfileInstaller";

        b() {
        }

        @Override // androidx.profileinstaller.i.d
        public void a(int i10, @p0 Object obj) {
            String str;
            switch (i10) {
                case 1:
                    str = "RESULT_INSTALL_SUCCESS";
                    break;
                case 2:
                    str = "RESULT_ALREADY_INSTALLED";
                    break;
                case 3:
                    str = "RESULT_UNSUPPORTED_ART_VERSION";
                    break;
                case 4:
                    str = "RESULT_NOT_WRITABLE";
                    break;
                case 5:
                    str = "RESULT_DESIRED_FORMAT_UNSUPPORTED";
                    break;
                case 6:
                    str = "RESULT_BASELINE_PROFILE_NOT_FOUND";
                    break;
                case 7:
                    str = "RESULT_IO_EXCEPTION";
                    break;
                case 8:
                    str = "RESULT_PARSE_EXCEPTION";
                    break;
                case 9:
                default:
                    str = "";
                    break;
                case 10:
                    str = "RESULT_INSTALL_SKIP_FILE_SUCCESS";
                    break;
                case 11:
                    str = "RESULT_DELETE_SKIP_FILE_SUCCESS";
                    break;
            }
            if (i10 == 6 || i10 == 7 || i10 == 8) {
                Log.e(f26791a, str, (Throwable) obj);
            } else {
                Log.d(f26791a, str);
            }
        }

        @Override // androidx.profileinstaller.i.d
        public void b(int i10, @p0 Object obj) {
            String str;
            if (i10 == 1) {
                str = "DIAGNOSTIC_CURRENT_PROFILE_EXISTS";
            } else if (i10 == 2) {
                str = "DIAGNOSTIC_CURRENT_PROFILE_DOES_NOT_EXIST";
            } else if (i10 == 3) {
                str = "DIAGNOSTIC_REF_PROFILE_EXISTS";
            } else if (i10 != 4) {
                str = i10 != 5 ? "" : "DIAGNOSTIC_PROFILE_IS_COMPRESSED";
            } else {
                str = "DIAGNOSTIC_REF_PROFILE_DOES_NOT_EXIST";
            }
            Log.d(f26791a, str);
        }
    }

    /* JADX INFO: compiled from: ProfileInstaller.java */
    @Retention(RetentionPolicy.SOURCE)
    @RestrictTo({RestrictTo.Scope.LIBRARY})
    public @interface c {
    }

    /* JADX INFO: compiled from: ProfileInstaller.java */
    public interface d {
        void a(int i10, @p0 Object obj);

        void b(int i10, @p0 Object obj);
    }

    /* JADX INFO: compiled from: ProfileInstaller.java */
    @Retention(RetentionPolicy.SOURCE)
    @RestrictTo({RestrictTo.Scope.LIBRARY})
    public @interface e {
    }

    private i() {
    }

    @RestrictTo({RestrictTo.Scope.LIBRARY})
    static boolean c(@n0 File file) {
        return new File(file, f26770f).delete();
    }

    @k1
    static void d(@n0 Context context, @n0 Executor executor, @n0 d dVar) {
        c(context.getFilesDir());
        j(executor, dVar, 11, null);
    }

    static void e(@n0 Executor executor, @n0 final d dVar, final int i10, @p0 final Object obj) {
        executor.execute(new Runnable() { // from class: androidx.profileinstaller.h
            @Override // java.lang.Runnable
            public final void run() {
                dVar.b(i10, obj);
            }
        });
    }

    @k1
    @RestrictTo({RestrictTo.Scope.LIBRARY})
    static boolean f(PackageInfo packageInfo, File file, d dVar) {
        File file2 = new File(file, f26770f);
        if (!file2.exists()) {
            return false;
        }
        try {
            DataInputStream dataInputStream = new DataInputStream(new FileInputStream(file2));
            try {
                long j10 = dataInputStream.readLong();
                dataInputStream.close();
                boolean z10 = j10 == packageInfo.lastUpdateTime;
                if (z10) {
                    dVar.a(2, null);
                }
                return z10;
            } catch (Throwable th2) {
                try {
                    dataInputStream.close();
                } catch (Throwable th3) {
                    th2.addSuppressed(th3);
                }
                throw th2;
            }
        } catch (IOException unused) {
            return false;
        }
    }

    @RestrictTo({RestrictTo.Scope.LIBRARY})
    static void i(@n0 PackageInfo packageInfo, @n0 File file) {
        try {
            DataOutputStream dataOutputStream = new DataOutputStream(new FileOutputStream(new File(file, f26770f)));
            try {
                dataOutputStream.writeLong(packageInfo.lastUpdateTime);
                dataOutputStream.close();
            } catch (Throwable th2) {
                try {
                    dataOutputStream.close();
                } catch (Throwable th3) {
                    th2.addSuppressed(th3);
                }
                throw th2;
            }
        } catch (IOException unused) {
        }
    }

    static void j(@n0 Executor executor, @n0 final d dVar, final int i10, @p0 final Object obj) {
        executor.execute(new Runnable() { // from class: androidx.profileinstaller.g
            @Override // java.lang.Runnable
            public final void run() {
                dVar.a(i10, obj);
            }
        });
    }

    private static boolean k(@n0 AssetManager assetManager, @n0 String str, @n0 PackageInfo packageInfo, @n0 File file, @n0 String str2, @n0 Executor executor, @n0 d dVar) {
        androidx.profileinstaller.c cVar = new androidx.profileinstaller.c(assetManager, executor, dVar, str2, f26768d, f26769e, new File(new File(f26766b, str), f26767c));
        if (!cVar.e()) {
            return false;
        }
        boolean zN = cVar.i().m().n();
        if (zN) {
            i(packageInfo, file);
        }
        return zN;
    }

    @k1
    public static void l(@n0 Context context) {
        m(context, new f(), f26771g);
    }

    @k1
    public static void m(@n0 Context context, @n0 Executor executor, @n0 d dVar) {
        n(context, executor, dVar, false);
    }

    @k1
    static void n(@n0 Context context, @n0 Executor executor, @n0 d dVar, boolean z10) {
        Context applicationContext = context.getApplicationContext();
        String packageName = applicationContext.getPackageName();
        ApplicationInfo applicationInfo = applicationContext.getApplicationInfo();
        AssetManager assets = applicationContext.getAssets();
        String name = new File(applicationInfo.sourceDir).getName();
        boolean z11 = false;
        try {
            PackageInfo packageInfo = context.getPackageManager().getPackageInfo(packageName, 0);
            File filesDir = context.getFilesDir();
            if (!z10 && f(packageInfo, filesDir, dVar)) {
                Log.d(f26765a, "Skipping profile installation for " + context.getPackageName());
                o.e(context, false);
                return;
            }
            Log.d(f26765a, "Installing profile for " + context.getPackageName());
            if (k(assets, packageName, packageInfo, filesDir, name, executor, dVar) && z10) {
                z11 = true;
            }
            o.e(context, z11);
        } catch (PackageManager.NameNotFoundException e10) {
            dVar.a(7, e10);
            o.e(context, false);
        }
    }

    @k1
    static void o(@n0 Context context, @n0 Executor executor, @n0 d dVar) {
        try {
            i(context.getPackageManager().getPackageInfo(context.getApplicationContext().getPackageName(), 0), context.getFilesDir());
            j(executor, dVar, 10, null);
        } catch (PackageManager.NameNotFoundException e10) {
            j(executor, dVar, 7, e10);
        }
    }
}
