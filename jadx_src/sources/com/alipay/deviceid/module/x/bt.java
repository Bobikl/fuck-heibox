package com.alipay.deviceid.module.x;

import android.content.Context;
import android.os.Build;
import android.util.Log;
import com.max.xiaoheihe.loader.dynamic_so.DynamicSoManager;
import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.File;
import java.io.FileFilter;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.Locale;

/* JADX INFO: compiled from: SEProtectLoaderEx.java */
/* JADX INFO: loaded from: classes6.dex */
public class bt {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static String f38323a = "";

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static Context f38324b;

    /* JADX INFO: compiled from: SEProtectLoaderEx.java */
    public final class a implements FileFilter {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        String f38325a;

        public a(String str) {
            this.f38325a = str;
        }

        @Override // java.io.FileFilter
        public final boolean accept(File file) {
            return file.getName().startsWith(this.f38325a);
        }
    }

    public bt(Context context) {
        f38324b = context;
    }

    private void a(File file) {
        if (file.exists()) {
            if (file.isFile()) {
                file.delete();
                return;
            }
            if (file.isDirectory()) {
                for (File file2 : file.listFiles()) {
                    a(file2);
                }
                file.delete();
            }
        }
    }

    private void a(String str, String str2) {
        try {
            for (File file : new File(str).listFiles(new a(str2))) {
                a(file);
            }
        } catch (Exception e10) {
            Log.e("SEProtect", e10.toString());
        }
    }

    /* JADX WARN: Code duplicated, block: B:68:0x00bb A[Catch: IOException -> 0x00b7, TryCatch #1 {IOException -> 0x00b7, blocks: (B:64:0x00b3, B:68:0x00bb, B:70:0x00c0), top: B:74:0x00b3 }] */
    /* JADX WARN: Code duplicated, block: B:70:0x00c0 A[Catch: IOException -> 0x00b7, TRY_LEAVE, TryCatch #1 {IOException -> 0x00b7, blocks: (B:64:0x00b3, B:68:0x00bb, B:70:0x00c0), top: B:74:0x00b3 }] */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r8v0, types: [java.io.File] */
    /* JADX WARN: Type inference failed for: r8v1 */
    /* JADX WARN: Type inference failed for: r8v10, types: [java.io.OutputStream] */
    /* JADX WARN: Type inference failed for: r8v11 */
    /* JADX WARN: Type inference failed for: r8v12 */
    /* JADX WARN: Type inference failed for: r8v13 */
    /* JADX WARN: Type inference failed for: r8v15 */
    /* JADX WARN: Type inference failed for: r8v17 */
    /* JADX WARN: Type inference failed for: r8v19 */
    /* JADX WARN: Type inference failed for: r8v2 */
    /* JADX WARN: Type inference failed for: r8v20, types: [java.io.BufferedOutputStream, java.io.OutputStream] */
    /* JADX WARN: Type inference failed for: r8v21 */
    /* JADX WARN: Type inference failed for: r8v22 */
    /* JADX WARN: Type inference failed for: r8v3 */
    /* JADX WARN: Type inference failed for: r8v4 */
    /* JADX WARN: Type inference failed for: r8v5, types: [java.io.OutputStream] */
    /* JADX WARN: Type inference failed for: r8v8, types: [java.io.OutputStream] */
    /* JADX WARN: Type inference failed for: r8v9 */
    private static boolean a(InputStream inputStream, File file) throws Throwable {
        BufferedInputStream bufferedInputStream;
        FileOutputStream fileOutputStream = null;
        try {
            try {
                try {
                    if (file.exists()) {
                        file.delete();
                    }
                    file.createNewFile();
                    bufferedInputStream = new BufferedInputStream(inputStream);
                    try {
                        FileOutputStream fileOutputStream2 = new FileOutputStream((File) file);
                        try {
                            file = new BufferedOutputStream(fileOutputStream2);
                            try {
                                byte[] bArr = new byte[512];
                                while (true) {
                                    int i10 = bufferedInputStream.read(bArr);
                                    if (i10 == -1) {
                                        file.flush();
                                        fileOutputStream2.flush();
                                        fileOutputStream2.close();
                                        bufferedInputStream.close();
                                        file.close();
                                        return true;
                                    }
                                    file.write(bArr, 0, i10);
                                }
                            } catch (FileNotFoundException e10) {
                                fileOutputStream = fileOutputStream2;
                                e = e10;
                                file = file;
                                Log.e("SEProtect", e.toString());
                                if (fileOutputStream != null) {
                                    fileOutputStream.close();
                                }
                                if (bufferedInputStream != null) {
                                    bufferedInputStream.close();
                                }
                                if (file != 0) {
                                    file.close();
                                }
                                return false;
                            } catch (IOException e11) {
                                fileOutputStream = fileOutputStream2;
                                e = e11;
                                file = file;
                                Log.e("SEProtect", e.toString());
                                if (fileOutputStream != null) {
                                    fileOutputStream.close();
                                }
                                if (bufferedInputStream != null) {
                                    bufferedInputStream.close();
                                }
                                if (file != 0) {
                                    file.close();
                                }
                                return false;
                            } catch (Throwable th2) {
                                fileOutputStream = fileOutputStream2;
                                th = th2;
                                if (fileOutputStream != null) {
                                    try {
                                        fileOutputStream.close();
                                        if (bufferedInputStream != null) {
                                            bufferedInputStream.close();
                                        }
                                        if (file != 0) {
                                            file.close();
                                        }
                                    } catch (IOException e12) {
                                        Log.e("SEProtect", e12.toString());
                                        throw th;
                                    }
                                } else {
                                    if (bufferedInputStream != null) {
                                        bufferedInputStream.close();
                                    }
                                    if (file != 0) {
                                        file.close();
                                    }
                                }
                                throw th;
                            }
                        } catch (FileNotFoundException e13) {
                            fileOutputStream = fileOutputStream2;
                            e = e13;
                            file = 0;
                        } catch (IOException e14) {
                            fileOutputStream = fileOutputStream2;
                            e = e14;
                            file = 0;
                        } catch (Throwable th3) {
                            fileOutputStream = fileOutputStream2;
                            th = th3;
                            file = 0;
                        }
                    } catch (FileNotFoundException e15) {
                        e = e15;
                        file = 0;
                    } catch (IOException e16) {
                        e = e16;
                        file = 0;
                    } catch (Throwable th4) {
                        th = th4;
                        file = 0;
                    }
                } catch (Throwable th5) {
                    th = th5;
                }
            } catch (FileNotFoundException e17) {
                e = e17;
                file = 0;
                bufferedInputStream = null;
            } catch (IOException e18) {
                e = e18;
                file = 0;
                bufferedInputStream = null;
            } catch (Throwable th6) {
                th = th6;
                file = 0;
                bufferedInputStream = null;
            }
        } catch (IOException e19) {
            Log.e("SEProtect", e19.toString());
            return false;
        }
    }

    private boolean a(String str, String str2, String str3) {
        String str4;
        File file;
        Exception e10;
        File file2;
        String str5 = Build.CPU_ABI;
        String str6 = "lib" + str3 + lg.a.f131412e + f38323a + DynamicSoManager.f77250e;
        if ("x86".equals(str5)) {
            str4 = "lib/x86/" + str6;
        } else if (str5.startsWith("armeabi")) {
            str4 = "lib/armeabi/" + str6;
        } else {
            Log.e("SEProtect", "apse is not support for this mode: " + str5);
            str4 = null;
        }
        try {
            StringBuilder sb2 = new StringBuilder();
            sb2.append(str);
            String str7 = File.separator;
            sb2.append(str7);
            sb2.append(str2);
            file2 = new File(sb2.toString());
            try {
                file = new File(file2.toString() + str7 + str6);
                try {
                    file.toString();
                } catch (Exception e11) {
                    e10 = e11;
                    e10.toString();
                }
            } catch (Exception e12) {
                file = null;
                e10 = e12;
            }
        } catch (Exception e13) {
            file = null;
            e10 = e13;
            file2 = null;
        }
        if (file == null) {
            return false;
        }
        if (file.exists()) {
            file.toString();
            return true;
        }
        a(str, str2);
        file2.mkdirs();
        return a(str, str4, str6, file);
    }

    private static boolean a(String str, String str2, String str3, File file) throws Throwable {
        InputStream resourceAsStream = bt.class.getClassLoader().getResourceAsStream(str2);
        if (resourceAsStream == null) {
            return false;
        }
        if (str == null) {
            Log.e("SEProtect", "apse file cann't be null...");
        }
        boolean zA = a(resourceAsStream, file);
        try {
            resourceAsStream.close();
            return zA;
        } catch (IOException e10) {
            Log.e("SEProtect", e10.toString());
            return zA;
        }
    }

    public final boolean a(String str) {
        String str2 = str + "_BK";
        try {
            File filesDir = f38324b.getFilesDir();
            if (!a(filesDir.toString(), str2, str)) {
                Log.e("SEProtect", String.format(Locale.ENGLISH, "error copy %1$s lib fail", str));
                return false;
            }
            String str3 = "lib" + str + lg.a.f131412e + f38323a + DynamicSoManager.f77250e;
            StringBuilder sb2 = new StringBuilder();
            sb2.append(str2);
            String str4 = File.separator;
            sb2.append(str4);
            sb2.append(str3);
            File file = new File(filesDir.toString() + str4 + sb2.toString());
            if (!file.exists()) {
                String.format(Locale.ENGLISH, "error can't find %1$s lib in plugins_lib", str);
                return false;
            }
            try {
                System.load(file.toString());
                return true;
            } catch (UnsatisfiedLinkError e10) {
                Log.e("SEProtect", e10.toString());
                return false;
            }
        } catch (FileNotFoundException e11) {
            Log.e("SEProtect", e11.toString());
            return false;
        }
    }
}
