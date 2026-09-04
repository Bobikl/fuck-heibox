package com.max.hbcommon.utils;

import android.content.Context;
import android.webkit.MimeTypeMap;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.PatchProxyResult;
import com.tencent.cos.xml.common.COSRequestHeaderKey;
import java.io.File;

/* JADX INFO: compiled from: FileUtil.java */
/* JADX INFO: loaded from: classes9.dex */
public class f {
    public static ChangeQuickRedirect changeQuickRedirect;

    public static void a(File file) {
        if (PatchProxy.proxy(new Object[]{file}, null, changeQuickRedirect, true, bb.c.f.f32569t0, new Class[]{File.class}, Void.TYPE).isSupported || file == null || !file.exists()) {
            return;
        }
        if (file.isFile()) {
            file.delete();
            return;
        }
        String[] list = file.list();
        if (list == null || list.length == 0) {
            file.delete();
            return;
        }
        File[] fileArrListFiles = file.listFiles();
        if (fileArrListFiles == null) {
            file.delete();
            return;
        }
        for (File file2 : fileArrListFiles) {
            a(file2);
            file2.delete();
        }
    }

    public static void b(File file, String[] strArr) {
        int i10 = 0;
        if (!PatchProxy.proxy(new Object[]{file, strArr}, null, changeQuickRedirect, true, bb.c.f.f32591u0, new Class[]{File.class, String[].class}, Void.TYPE).isSupported && file.exists()) {
            if (file.isFile() || file.list().length == 0) {
                if (strArr.length > 0) {
                    while (i10 < strArr.length) {
                        if (strArr[i10].equals(file.getName())) {
                            return;
                        } else {
                            i10++;
                        }
                    }
                }
                file.delete();
                return;
            }
            File[] fileArrListFiles = file.listFiles();
            int length = fileArrListFiles.length;
            while (i10 < length) {
                File file2 = fileArrListFiles[i10];
                b(file2, strArr);
                file2.delete();
                i10++;
            }
        }
    }

    public static String c(String str) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{str}, null, changeQuickRedirect, true, bb.c.f.f32657x0, new Class[]{String.class}, String.class);
        if (patchProxyResultProxy.isSupported) {
            return (String) patchProxyResultProxy.result;
        }
        if (str == null) {
            return null;
        }
        int iLastIndexOf = str.lastIndexOf(".");
        return iLastIndexOf >= 0 ? str.substring(iLastIndexOf) : "";
    }

    public static long d(Context context, File file) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{context, file}, null, changeQuickRedirect, true, bb.c.f.f32613v0, new Class[]{Context.class, File.class}, Long.TYPE);
        if (patchProxyResultProxy.isSupported) {
            return ((Long) patchProxyResultProxy.result).longValue();
        }
        long jD = 0;
        try {
            File[] fileArrListFiles = file.listFiles();
            for (int i10 = 0; i10 < fileArrListFiles.length; i10++) {
                jD += fileArrListFiles[i10].isDirectory() ? d(context, fileArrListFiles[i10]) : fileArrListFiles[i10].length();
            }
        } catch (Exception e10) {
            e10.printStackTrace();
        }
        return jD;
    }

    public static long e(File file, String[] strArr) {
        boolean z10;
        long length;
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{file, strArr}, null, changeQuickRedirect, true, bb.c.f.f32635w0, new Class[]{File.class, String[].class}, Long.TYPE);
        if (patchProxyResultProxy.isSupported) {
            return ((Long) patchProxyResultProxy.result).longValue();
        }
        long j10 = 0;
        try {
            File[] fileArrListFiles = file.listFiles();
            for (int i10 = 0; i10 < fileArrListFiles.length; i10++) {
                if (fileArrListFiles[i10].isDirectory()) {
                    length = e(fileArrListFiles[i10], strArr);
                } else {
                    int i11 = 0;
                    while (true) {
                        if (i11 >= strArr.length) {
                            z10 = false;
                            break;
                        }
                        if (strArr[i11].equals(fileArrListFiles[i10].getName())) {
                            z10 = true;
                            break;
                        }
                        i11++;
                    }
                    if (!z10) {
                        length = fileArrListFiles[i10].length();
                    }
                }
                j10 += length;
            }
        } catch (Exception e10) {
            e10.printStackTrace();
        }
        return j10;
    }

    public static String f(File file) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{file}, null, changeQuickRedirect, true, bb.c.f.f32679y0, new Class[]{File.class}, String.class);
        if (patchProxyResultProxy.isSupported) {
            return (String) patchProxyResultProxy.result;
        }
        String strC = c(file.getName());
        return strC.length() > 0 ? MimeTypeMap.getSingleton().getMimeTypeFromExtension(strC.substring(1)) : COSRequestHeaderKey.APPLICATION_OCTET_STREAM;
    }

    public static boolean g(String str) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{str}, null, changeQuickRedirect, true, bb.c.f.f32547s0, new Class[]{String.class}, Boolean.TYPE);
        if (patchProxyResultProxy.isSupported) {
            return ((Boolean) patchProxyResultProxy.result).booleanValue();
        }
        if (c.u(str)) {
            return false;
        }
        return new File(str).exists();
    }
}
