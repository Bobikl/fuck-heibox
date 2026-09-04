package com.max.hbutils.utils;

import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.PatchProxyResult;
import java.io.File;
import java.io.FileInputStream;
import java.security.MessageDigest;

/* JADX INFO: compiled from: SignatureUtil.java */
/* JADX INFO: loaded from: classes13.dex */
public class s {
    public static ChangeQuickRedirect changeQuickRedirect;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final char[] f73576a = "0123456789abcdef".toCharArray();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static final char[] f73577b = new char[64];

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static final char[] f73578c = new char[40];

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private static final char[] f73579d = new char[32];

    private static String a(byte[] bArr, char[] cArr) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{bArr, cArr}, null, changeQuickRedirect, true, bb.c.k.jr, new Class[]{byte[].class, char[].class}, String.class);
        if (patchProxyResultProxy.isSupported) {
            return (String) patchProxyResultProxy.result;
        }
        for (int i10 = 0; i10 < bArr.length; i10++) {
            int i11 = bArr[i10] & 255;
            int i12 = i10 * 2;
            char[] cArr2 = f73576a;
            cArr[i12] = cArr2[i11 >>> 4];
            cArr[i12 + 1] = cArr2[i11 & 15];
        }
        return new String(cArr);
    }

    public static String b(File file) {
        int i10;
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{file}, null, changeQuickRedirect, true, bb.c.k.gr, new Class[]{File.class}, String.class);
        if (patchProxyResultProxy.isSupported) {
            return (String) patchProxyResultProxy.result;
        }
        try {
            MessageDigest messageDigest = MessageDigest.getInstance("MD5");
            FileInputStream fileInputStream = new FileInputStream(file);
            byte[] bArr = new byte[1024];
            do {
                i10 = fileInputStream.read(bArr);
                if (i10 > 0) {
                    messageDigest.update(bArr, 0, i10);
                }
            } while (i10 != -1);
            fileInputStream.close();
            return e(messageDigest.digest());
        } catch (Exception e10) {
            e10.printStackTrace();
            return null;
        }
    }

    public static String c(String str) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{str}, null, changeQuickRedirect, true, bb.c.k.fr, new Class[]{String.class}, String.class);
        if (patchProxyResultProxy.isSupported) {
            return (String) patchProxyResultProxy.result;
        }
        try {
            MessageDigest messageDigest = MessageDigest.getInstance("MD5");
            messageDigest.update(str.getBytes("UTF-8"));
            return e(messageDigest.digest());
        } catch (Exception e10) {
            e10.printStackTrace();
            return str;
        }
    }

    public static String d(String str) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{str}, null, changeQuickRedirect, true, bb.c.k.er, new Class[]{String.class}, String.class);
        if (patchProxyResultProxy.isSupported) {
            return (String) patchProxyResultProxy.result;
        }
        try {
            MessageDigest messageDigest = MessageDigest.getInstance("SHA-256");
            messageDigest.update(str.getBytes("UTF-8"));
            return f(messageDigest.digest());
        } catch (Exception e10) {
            e10.printStackTrace();
            return str;
        }
    }

    public static String e(byte[] bArr) {
        String strA;
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{bArr}, null, changeQuickRedirect, true, bb.c.k.ir, new Class[]{byte[].class}, String.class);
        if (patchProxyResultProxy.isSupported) {
            return (String) patchProxyResultProxy.result;
        }
        char[] cArr = f73579d;
        synchronized (cArr) {
            strA = a(bArr, cArr);
        }
        return strA;
    }

    public static String f(byte[] bArr) {
        String strA;
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{bArr}, null, changeQuickRedirect, true, bb.c.k.hr, new Class[]{byte[].class}, String.class);
        if (patchProxyResultProxy.isSupported) {
            return (String) patchProxyResultProxy.result;
        }
        char[] cArr = f73577b;
        synchronized (cArr) {
            strA = a(bArr, cArr);
        }
        return strA;
    }
}
