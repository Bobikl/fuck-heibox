package com.max.hbcommon.utils;

import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.PatchProxyResult;
import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.util.zip.GZIPInputStream;
import java.util.zip.GZIPOutputStream;

/* JADX INFO: compiled from: GzipUilts.java */
/* JADX INFO: loaded from: classes9.dex */
public class h {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static String f68240a = "utf-8";
    public static ChangeQuickRedirect changeQuickRedirect;

    public static byte[] a(String str) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{str}, null, changeQuickRedirect, true, bb.c.f.C0, new Class[]{String.class}, byte[].class);
        if (patchProxyResultProxy.isSupported) {
            return (byte[]) patchProxyResultProxy.result;
        }
        if (str == null || str.length() == 0) {
            return null;
        }
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        try {
            GZIPOutputStream gZIPOutputStream = new GZIPOutputStream(byteArrayOutputStream);
            gZIPOutputStream.write(str.getBytes(f68240a));
            gZIPOutputStream.close();
        } catch (IOException e10) {
            e10.printStackTrace();
        }
        return byteArrayOutputStream.toByteArray();
    }

    public static byte[] b(String str, String str2) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{str, str2}, null, changeQuickRedirect, true, bb.c.f.D0, new Class[]{String.class, String.class}, byte[].class);
        if (patchProxyResultProxy.isSupported) {
            return (byte[]) patchProxyResultProxy.result;
        }
        if (str == null || str.length() == 0) {
            return null;
        }
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        try {
            GZIPOutputStream gZIPOutputStream = new GZIPOutputStream(byteArrayOutputStream);
            gZIPOutputStream.write(str.getBytes(str2));
            gZIPOutputStream.close();
        } catch (IOException e10) {
            e10.printStackTrace();
        }
        return byteArrayOutputStream.toByteArray();
    }

    public static String c() {
        return f68240a;
    }

    public static void d(String str) {
        f68240a = str;
    }

    public static String e(byte[] bArr) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{bArr}, null, changeQuickRedirect, true, bb.c.f.E0, new Class[]{byte[].class}, String.class);
        if (patchProxyResultProxy.isSupported) {
            return (String) patchProxyResultProxy.result;
        }
        if (bArr == null || bArr.length == 0) {
            return null;
        }
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        try {
            GZIPInputStream gZIPInputStream = new GZIPInputStream(new ByteArrayInputStream(bArr));
            byte[] bArr2 = new byte[256];
            while (true) {
                int i10 = gZIPInputStream.read(bArr2);
                if (i10 < 0) {
                    break;
                }
                byteArrayOutputStream.write(bArr2, 0, i10);
            }
        } catch (IOException e10) {
            e10.printStackTrace();
        }
        return byteArrayOutputStream.toString();
    }

    public static String f(byte[] bArr, String str) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{bArr, str}, null, changeQuickRedirect, true, bb.c.f.F0, new Class[]{byte[].class, String.class}, String.class);
        if (patchProxyResultProxy.isSupported) {
            return (String) patchProxyResultProxy.result;
        }
        if (bArr != null && bArr.length != 0) {
            ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
            try {
                GZIPInputStream gZIPInputStream = new GZIPInputStream(new ByteArrayInputStream(bArr));
                byte[] bArr2 = new byte[256];
                while (true) {
                    int i10 = gZIPInputStream.read(bArr2);
                    if (i10 < 0) {
                        return byteArrayOutputStream.toString(str);
                    }
                    byteArrayOutputStream.write(bArr2, 0, i10);
                }
            } catch (IOException e10) {
                e10.printStackTrace();
            }
        }
        return null;
    }
}
