package com.apm.lite.f;

import android.content.Context;
import android.content.pm.ApplicationInfo;
import android.os.Build;
import com.apm.lite.k.i;
import com.apm.lite.k.k;
import dalvik.system.BaseDexClassLoader;
import java.io.File;
import java.io.FileOutputStream;
import java.io.InputStream;
import java.lang.reflect.Field;
import java.util.ArrayList;
import java.util.List;
import java.util.zip.ZipEntry;
import java.util.zip.ZipFile;

/* JADX INFO: loaded from: classes6.dex */
public class c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static List<String> f39951a = new ArrayList();

    public static String a(Context context, String str, File file) {
        ApplicationInfo applicationInfo = context.getApplicationInfo();
        String strB = b(applicationInfo.sourceDir, str, file);
        if (strB == null) {
            return null;
        }
        String[] strArr = applicationInfo.splitSourceDirs;
        if (strArr != null) {
            for (String str2 : strArr) {
                strB = b(str2, str, file);
                if (strB == null) {
                    return null;
                }
            }
        }
        try {
            ClassLoader classLoader = c.class.getClassLoader();
            while (!(classLoader instanceof BaseDexClassLoader) && classLoader.getParent() != null) {
                classLoader = classLoader.getParent();
            }
            if (!(classLoader instanceof BaseDexClassLoader)) {
                return strB;
            }
            Field declaredField = BaseDexClassLoader.class.getDeclaredField("pathList");
            declaredField.setAccessible(true);
            Object obj = declaredField.get(classLoader);
            Field declaredField2 = obj.getClass().getDeclaredField("nativeLibraryDirectories");
            declaredField2.setAccessible(true);
            for (String str3 : (String[]) declaredField2.get(obj)) {
                File file2 = new File(str3, System.mapLibraryName(str));
                if (file2.exists()) {
                    i.i(file2, file);
                    k.b(file.getAbsolutePath(), 493);
                    return null;
                }
            }
            return "not_found";
        } catch (Throwable th2) {
            return th2.getMessage();
        }
    }

    public static String b(String str, String str2, File file) {
        InputStream inputStream;
        ZipFile zipFile;
        String message;
        FileOutputStream fileOutputStream = null;
        try {
            zipFile = new ZipFile(new File(str), 1);
            try {
                StringBuilder sb2 = new StringBuilder();
                sb2.append("lib/");
                String str3 = Build.CPU_ABI;
                sb2.append(str3);
                sb2.append("/");
                sb2.append(System.mapLibraryName(str2));
                ZipEntry entry = zipFile.getEntry(sb2.toString());
                if (entry == null) {
                    int iIndexOf = str3.indexOf(45);
                    StringBuilder sb3 = new StringBuilder();
                    sb3.append("lib/");
                    if (iIndexOf <= 0) {
                        iIndexOf = str3.length();
                    }
                    sb3.append(str3.substring(0, iIndexOf));
                    sb3.append("/");
                    sb3.append(System.mapLibraryName(str2));
                    String string = sb3.toString();
                    ZipEntry entry2 = zipFile.getEntry(string);
                    if (entry2 == null) {
                        message = "Library entry not found:" + string;
                        k.a(null);
                        k.a(null);
                        return message;
                    }
                    entry = entry2;
                }
                file.createNewFile();
                InputStream inputStream2 = zipFile.getInputStream(entry);
                try {
                    FileOutputStream fileOutputStream2 = new FileOutputStream(file);
                    try {
                        byte[] bArr = new byte[4096];
                        while (true) {
                            int i10 = inputStream2.read(bArr);
                            if (i10 <= 0) {
                                k.b(file.getAbsolutePath(), 493);
                                k.a(fileOutputStream2);
                                k.a(inputStream2);
                                k.c(zipFile);
                                return null;
                            }
                            fileOutputStream2.write(bArr, 0, i10);
                        }
                    } catch (Throwable th2) {
                        fileOutputStream = fileOutputStream2;
                        inputStream = inputStream2;
                        th = th2;
                        try {
                            message = th.getMessage();
                            k.a(fileOutputStream);
                            k.a(inputStream);
                            return message;
                        } finally {
                            k.a(fileOutputStream);
                            k.a(inputStream);
                            k.c(zipFile);
                        }
                    }
                } catch (Throwable th3) {
                    inputStream = inputStream2;
                    th = th3;
                }
            } catch (Throwable th4) {
                th = th4;
                inputStream = null;
            }
        } catch (Throwable th5) {
            th = th5;
            inputStream = null;
            zipFile = null;
        }
    }
}
