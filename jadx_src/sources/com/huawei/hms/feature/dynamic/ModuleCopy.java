package com.huawei.hms.feature.dynamic;

import android.content.Context;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import android.text.TextUtils;
import com.huawei.hms.common.util.Logger;
import java.io.BufferedOutputStream;
import java.io.Closeable;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

/* JADX INFO: loaded from: classes7.dex */
public class ModuleCopy {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final String f60659a = "ModuleCopy";

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final int f60660b = 2048;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final int f60661c = 0;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final int f60662d = 1;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final String f60663e = "module_uri_path";

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final String f60664f = "loader_uri_path";

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static final String f60665g = "dynamic_modules";

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public static final String f60666h = ".apk";

    public static final class a implements Runnable {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ String f60667a;

        public a(String str) {
            this.f60667a = str;
        }

        @Override // java.lang.Runnable
        public void run() {
            try {
                ModuleCopy.c(this.f60667a);
            } catch (SecurityException unused) {
                Logger.w(ModuleCopy.f60659a, "Delete file failed: SecurityException.");
            }
        }
    }

    public static final class b implements Runnable {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ String[] f60668a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ int f60669b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final /* synthetic */ String f60670c;

        public b(String[] strArr, int i10, String str) {
            this.f60668a = strArr;
            this.f60669b = i10;
            this.f60670c = str;
        }

        @Override // java.lang.Runnable
        public void run() {
            for (String str : this.f60668a) {
                if (Integer.parseInt(str) < this.f60669b) {
                    Logger.i(ModuleCopy.f60659a, "Delete low version:" + this.f60669b + " in modulePath.");
                    ModuleCopy.c(this.f60670c + File.separator + str);
                }
            }
        }
    }

    public static int a(String[] strArr) {
        if (strArr == null || strArr.length == 0) {
            Logger.i(f60659a, "No version dirs in module path, need mkdir.");
            return 0;
        }
        int iMax = 0;
        for (String str : strArr) {
            iMax = Math.max(Integer.parseInt(str), iMax);
        }
        return iMax;
    }

    public static String a(Context context, Bundle bundle, int i10, Uri uri) {
        String str;
        String string;
        String strValueOf;
        StringBuilder sb2;
        String[] list;
        int iA;
        if (i10 == 0) {
            str = com.huawei.hms.feature.dynamic.b.f60688j;
            string = bundle.getString(com.huawei.hms.feature.dynamic.b.f60688j);
            strValueOf = String.valueOf(bundle.getInt(com.huawei.hms.feature.dynamic.b.f60689k));
            sb2 = new StringBuilder();
        } else {
            str = com.huawei.hms.feature.dynamic.b.f60694p;
            string = bundle.getString(com.huawei.hms.feature.dynamic.b.f60694p);
            strValueOf = String.valueOf(bundle.getInt(com.huawei.hms.feature.dynamic.b.f60695q));
            sb2 = new StringBuilder();
        }
        sb2.append(bundle.getString(str));
        sb2.append(".apk");
        String string2 = sb2.toString();
        try {
            StringBuilder sb3 = new StringBuilder();
            sb3.append(getProtectedPath(context));
            String str2 = File.separator;
            sb3.append(str2);
            sb3.append("dynamic_modules");
            sb3.append(str2);
            sb3.append(string);
            String string3 = sb3.toString();
            String str3 = string3 + str2 + strValueOf;
            String str4 = str3 + str2 + string2;
            if (new File(string3).exists() && (iA = a((list = new File(string3).list()))) >= Integer.parseInt(strValueOf)) {
                clearLowVersionModule(iA, string3, list, f60659a);
                return string3 + str2 + iA + str2 + string2;
            }
            return a(context, str3, uri, str4);
        } catch (IOException e10) {
            Logger.w(f60659a, "request modulePath error: " + e10.getMessage());
            return null;
        }
    }

    public static String a(Context context, String str, Uri uri, String str2) throws Throwable {
        if (!makeDirectory(str)) {
            Logger.e(f60659a, "makeDirectory return false");
            return null;
        }
        a(context, uri, str2);
        if (com.huawei.hms.feature.dynamic.f.d.b(context, str2)) {
            return str2;
        }
        Logger.w(f60659a, "The coped module apk is invalid.");
        b(str2);
        return null;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r3v0, types: [android.content.Context] */
    /* JADX WARN: Type inference failed for: r3v1 */
    /* JADX WARN: Type inference failed for: r3v10, types: [java.io.Closeable] */
    /* JADX WARN: Type inference failed for: r3v11 */
    /* JADX WARN: Type inference failed for: r3v13, types: [java.io.Closeable, java.io.InputStream] */
    /* JADX WARN: Type inference failed for: r3v14 */
    /* JADX WARN: Type inference failed for: r3v15 */
    /* JADX WARN: Type inference failed for: r3v3 */
    /* JADX WARN: Type inference failed for: r3v5 */
    /* JADX WARN: Type inference failed for: r3v6 */
    /* JADX WARN: Type inference failed for: r3v7 */
    /* JADX WARN: Type inference failed for: r3v8, types: [java.io.Closeable] */
    /* JADX WARN: Type inference failed for: r3v9 */
    public static void a(Context context, Uri uri, String str) throws Throwable {
        IOException e10;
        FileNotFoundException e11;
        StringBuilder sb2;
        BufferedOutputStream bufferedOutputStream = null;
        try {
            try {
                context = context.getContentResolver().openInputStream(uri);
                try {
                    if (context == 0) {
                        Logger.w(f60659a, "Get input stream failed: null.");
                        closeQuietly(context);
                        closeQuietly(null);
                        return;
                    }
                    BufferedOutputStream bufferedOutputStream2 = new BufferedOutputStream(new FileOutputStream(str));
                    try {
                        byte[] bArr = new byte[2048];
                        while (true) {
                            int i10 = context.read(bArr);
                            if (i10 == -1) {
                                closeQuietly(context);
                                closeQuietly(bufferedOutputStream2);
                                return;
                            }
                            bufferedOutputStream2.write(bArr, 0, i10);
                        }
                    } catch (FileNotFoundException e12) {
                        bufferedOutputStream = bufferedOutputStream2;
                        e11 = e12;
                        sb2 = new StringBuilder();
                        sb2.append("FileNotFoundException:");
                        sb2.append(e11.getMessage());
                        context = context;
                        Logger.e(f60659a, sb2.toString());
                        closeQuietly(context);
                        closeQuietly(bufferedOutputStream);
                    } catch (IOException e13) {
                        bufferedOutputStream = bufferedOutputStream2;
                        e10 = e13;
                        sb2 = new StringBuilder();
                        sb2.append("IOException ");
                        sb2.append(e10.getMessage());
                        context = context;
                        Logger.e(f60659a, sb2.toString());
                        closeQuietly(context);
                        closeQuietly(bufferedOutputStream);
                    } catch (Throwable th2) {
                        th = th2;
                        bufferedOutputStream = bufferedOutputStream2;
                        closeQuietly(context);
                        closeQuietly(bufferedOutputStream);
                        throw th;
                    }
                } catch (FileNotFoundException e14) {
                    e11 = e14;
                } catch (IOException e15) {
                    e10 = e15;
                } catch (Throwable th3) {
                    th = th3;
                    th = th;
                    closeQuietly(context);
                    closeQuietly(bufferedOutputStream);
                    throw th;
                }
            } catch (Throwable th4) {
                th = th4;
            }
        } catch (FileNotFoundException e16) {
            e11 = e16;
            context = 0;
        } catch (IOException e17) {
            e10 = e17;
            context = 0;
        } catch (Throwable th5) {
            th = th5;
            context = 0;
        }
    }

    public static void a(Context context, Bundle bundle, int i10) {
        String string = bundle.getString(i10 == 0 ? f60663e : f60664f);
        Logger.i(f60659a, "path:" + string);
        String strA = a(context, bundle, i10, Uri.parse(string));
        if (TextUtils.isEmpty(strA)) {
            Logger.w(f60659a, "checkModulePath failed: null.");
        } else {
            bundle.putString(i10 == 0 ? com.huawei.hms.feature.dynamic.b.f60692n : com.huawei.hms.feature.dynamic.b.f60696r, strA);
        }
    }

    public static boolean a(Bundle bundle) {
        return TextUtils.equals(bundle.getString(com.huawei.hms.feature.dynamic.b.f60692n), bundle.getString(com.huawei.hms.feature.dynamic.b.f60696r));
    }

    public static void b(String str) {
        c.a(1, "DeleteFile").execute(new a(str));
    }

    /* JADX WARN: Code duplicated, block: B:13:0x003c  */
    public static boolean c(String str) {
        boolean z10;
        File file = new File(str);
        if (!file.isDirectory() || file.list() == null) {
            z10 = true;
        } else {
            z10 = true;
            for (String str2 : file.list()) {
                if (z10) {
                    if (c(str + File.separator + str2)) {
                        z10 = true;
                    } else {
                        z10 = false;
                    }
                } else {
                    z10 = false;
                }
            }
        }
        return z10 && file.delete();
    }

    public static void clearLowVersionModule(int i10, String str, String[] strArr, String str2) {
        c.a(1, str2).execute(new b(strArr, i10, str));
    }

    public static void closeQuietly(Closeable closeable) {
        if (closeable != null) {
            try {
                closeable.close();
            } catch (IOException unused) {
                Logger.e(f60659a, "An exception occurred while closing the 'Closeable' object.");
            }
        }
    }

    public static void copyModule(Context context, Bundle bundle) {
        if (context == null || bundle == null) {
            Logger.e(f60659a, "The context or module info bundle is null.");
            return;
        }
        boolean zA = a(bundle);
        a(context, bundle, 0);
        if (zA) {
            bundle.putString(com.huawei.hms.feature.dynamic.b.f60696r, bundle.getString(com.huawei.hms.feature.dynamic.b.f60692n));
        } else {
            a(context, bundle, 1);
        }
    }

    public static String getProtectedPath(Context context) throws IOException {
        if (Build.VERSION.SDK_INT >= 24) {
            return context.createDeviceProtectedStorageContext().getDataDir().getCanonicalPath();
        }
        String canonicalPath = context.getFilesDir().getCanonicalPath();
        int iLastIndexOf = canonicalPath.lastIndexOf(File.separator);
        return iLastIndexOf <= 0 ? canonicalPath : canonicalPath.substring(0, iLastIndexOf);
    }

    public static boolean isLocalModuleFile(Context context, String str) {
        if (context == null || TextUtils.isEmpty(str)) {
            Logger.w(f60659a, "context or filePath is null.");
            return false;
        }
        try {
            return new File(str).getCanonicalPath().startsWith(getProtectedPath(context) + File.separator + "dynamic_modules");
        } catch (IOException unused) {
            return false;
        }
    }

    public static boolean makeDirectory(String str) {
        try {
            File file = new File(str);
            if (file.exists()) {
                return true;
            }
            return file.mkdirs();
        } catch (Exception e10) {
            Logger.e(f60659a, "makeDirectory Exception: " + e10.getMessage());
            return false;
        }
    }

    public static String trimLastSection(String str) {
        int iLastIndexOf = str.lastIndexOf(File.separator);
        return iLastIndexOf <= 0 ? str : str.substring(0, iLastIndexOf);
    }
}
