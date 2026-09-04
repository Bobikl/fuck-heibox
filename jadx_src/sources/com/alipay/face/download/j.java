package com.alipay.face.download;

import android.content.Context;
import android.content.pm.ApplicationInfo;
import android.os.Build;
import android.util.Log;
import java.io.File;
import java.io.IOException;
import java.util.Arrays;
import java.util.Enumeration;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;
import java.util.zip.ZipEntry;
import java.util.zip.ZipFile;

/* JADX INFO: compiled from: CpuArchUtils.java */
/* JADX INFO: loaded from: classes6.dex */
public class j {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final int f38775a = -1;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final int f38776b = 7;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final int f38777c = 8;

    public static int a(Context context) {
        if (e(context) == 8) {
            return 8;
        }
        return d();
    }

    public static int b(Context context) throws Throwable {
        Set<String> setF = f(context.getApplicationInfo());
        if (Build.SUPPORTED_64_BIT_ABIS.length == 0) {
            return 7;
        }
        int i10 = -1;
        if (setF == null || setF.isEmpty()) {
            return -1;
        }
        for (String str : setF) {
            if (com.max.xiaoheihe.dynamic_so.a.f77018b.endsWith(str) || "x86_64".equals(str) || "mips64".equals(str)) {
                i10 = 8;
            }
        }
        return i10;
    }

    private static int c(String str) {
        if (str == null) {
            return -1;
        }
        File file = new File(str);
        if (file.isDirectory()) {
            return file.getName().toLowerCase().startsWith("arm64") ? 8 : 7;
        }
        return -1;
    }

    public static int d() {
        String str = Build.SUPPORTED_ABIS[0];
        if (str.toLowerCase().startsWith("arm64") || str.toLowerCase().startsWith("x86_64") || str.toLowerCase().startsWith("mips64")) {
            return 8;
        }
        return (str.toLowerCase().startsWith("armeabi") || str.toLowerCase().startsWith("armeabi-v7a") || str.toLowerCase().startsWith("x86")) ? 7 : -1;
    }

    public static int e(Context context) {
        int iC = c(context.getApplicationInfo().nativeLibraryDir);
        Log.d("CpuArch", "getCpuArchValue " + iC);
        return iC;
    }

    private static Set<String> f(ApplicationInfo applicationInfo) throws Throwable {
        HashSet hashSet = new HashSet();
        hashSet.add(applicationInfo.sourceDir);
        String[] strArr = applicationInfo.splitSourceDirs;
        if (strArr != null) {
            hashSet.addAll(Arrays.asList(strArr));
        }
        HashSet hashSet2 = new HashSet();
        Iterator it = hashSet.iterator();
        while (it.hasNext()) {
            ZipFile zipFile = null;
            try {
                try {
                    ZipFile zipFile2 = new ZipFile((String) it.next());
                    try {
                        Enumeration<? extends ZipEntry> enumerationEntries = zipFile2.entries();
                        while (enumerationEntries.hasMoreElements()) {
                            ZipEntry zipEntryNextElement = enumerationEntries.nextElement();
                            if (zipEntryNextElement.getName().equals("../")) {
                                break;
                            }
                            File parentFile = new File(zipEntryNextElement.getName()).getParentFile();
                            if (parentFile != null && parentFile.getPath().startsWith("lib/")) {
                                hashSet2.add(parentFile.getName());
                            }
                        }
                        try {
                            zipFile2.close();
                        } catch (IOException e10) {
                            e10.printStackTrace();
                        }
                    } catch (IOException e11) {
                        e = e11;
                        zipFile = zipFile2;
                        e.printStackTrace();
                        if (zipFile != null) {
                            zipFile.close();
                        }
                    } catch (Throwable th2) {
                        th = th2;
                        zipFile = zipFile2;
                        if (zipFile != null) {
                            try {
                                zipFile.close();
                            } catch (IOException e12) {
                                e12.printStackTrace();
                            }
                        }
                        throw th;
                    }
                } catch (Throwable th3) {
                    th = th3;
                }
            } catch (IOException e13) {
                e = e13;
            }
        }
        return hashSet2;
    }
}
