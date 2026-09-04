package com.max.hbcommon.utils;

import android.text.TextUtils;
import android.util.Base64;
import com.max.hbcommon.bean.PostEncryptParamsObj;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.PatchProxyResult;
import com.tencent.cos.xml.crypto.JceEncryptionConstants;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.util.Random;
import javax.crypto.Cipher;
import javax.crypto.SecretKey;
import javax.crypto.SecretKeyFactory;
import javax.crypto.spec.DESKeySpec;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;

/* JADX INFO: compiled from: EncryptUtil.java */
/* JADX INFO: loaded from: classes9.dex */
public class e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static String f68239a = "abcdefgh";
    public static ChangeQuickRedirect changeQuickRedirect;

    public static String a(MessageDigest messageDigest) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{messageDigest}, null, changeQuickRedirect, true, bb.c.f.f32434n0, new Class[]{MessageDigest.class}, String.class);
        if (patchProxyResultProxy.isSupported) {
            return (String) patchProxyResultProxy.result;
        }
        byte[] bArrDigest = messageDigest.digest();
        StringBuffer stringBuffer = new StringBuffer("");
        for (int i10 = 0; i10 < bArrDigest.length; i10++) {
            int i11 = bArrDigest[i10];
            if (i11 < 0) {
                i11 += 256;
            }
            if (i11 < 16) {
                stringBuffer.append("0");
            }
            stringBuffer.append(Integer.toHexString(i11));
        }
        return stringBuffer.toString();
    }

    public static String b(byte[] bArr, String str) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{bArr, str}, null, changeQuickRedirect, true, bb.c.f.f32388l0, new Class[]{byte[].class, String.class}, String.class);
        if (patchProxyResultProxy.isSupported) {
            return (String) patchProxyResultProxy.result;
        }
        try {
            if (str == null) {
                System.out.print("Key为空null");
                return null;
            }
            if (str.length() != 16) {
                System.out.print("Key长度不是16位");
                return null;
            }
            IvParameterSpec ivParameterSpec = new IvParameterSpec("abcdefghijklmnop".getBytes());
            SecretKeySpec secretKeySpec = new SecretKeySpec(str.getBytes("utf-8"), JceEncryptionConstants.SYMMETRIC_KEY_ALGORITHM);
            Cipher cipher = Cipher.getInstance("AES/CBC/PKCS7Padding");
            cipher.init(1, secretKeySpec, ivParameterSpec);
            return Base64.encodeToString(cipher.doFinal(bArr), 0);
        } catch (Exception e10) {
            d.b("zzzz", "Exception=" + e10);
            return null;
        }
    }

    public static String c(String str, String str2) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{str, str2}, null, changeQuickRedirect, true, bb.c.f.f32365k0, new Class[]{String.class, String.class}, String.class);
        if (patchProxyResultProxy.isSupported) {
            return (String) patchProxyResultProxy.result;
        }
        try {
            byte[] bArrDecode = Base64.decode(str, 0);
            IvParameterSpec ivParameterSpec = new IvParameterSpec(f68239a.getBytes());
            SecretKey secretKeyGenerateSecret = SecretKeyFactory.getInstance("DES").generateSecret(new DESKeySpec(str2.getBytes()));
            Cipher cipher = Cipher.getInstance("DES/CBC/PKCS7Padding");
            cipher.init(2, secretKeyGenerateSecret, ivParameterSpec);
            return new String(cipher.doFinal(bArrDecode));
        } catch (Exception e10) {
            d.b("zzzz", "Exception=" + e10);
            return null;
        }
    }

    public static String d(String str, String str2) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{str, str2}, null, changeQuickRedirect, true, bb.c.f.f32319i0, new Class[]{String.class, String.class}, String.class);
        return patchProxyResultProxy.isSupported ? (String) patchProxyResultProxy.result : e(str.getBytes(), str2);
    }

    public static String e(byte[] bArr, String str) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{bArr, str}, null, changeQuickRedirect, true, bb.c.f.f32342j0, new Class[]{byte[].class, String.class}, String.class);
        if (patchProxyResultProxy.isSupported) {
            return (String) patchProxyResultProxy.result;
        }
        try {
            IvParameterSpec ivParameterSpec = new IvParameterSpec(f68239a.getBytes());
            SecretKey secretKeyGenerateSecret = SecretKeyFactory.getInstance("DES").generateSecret(new DESKeySpec(str.getBytes()));
            Cipher cipher = Cipher.getInstance("DES/CBC/PKCS7Padding");
            cipher.init(1, secretKeyGenerateSecret, ivParameterSpec);
            return Base64.encodeToString(cipher.doFinal(bArr), 0);
        } catch (Exception e10) {
            d.b("zzzz", "Exception=" + e10);
            return null;
        }
    }

    public static String f(int i10) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{new Integer(i10)}, null, changeQuickRedirect, true, bb.c.f.f32480p0, new Class[]{Integer.TYPE}, String.class);
        if (patchProxyResultProxy.isSupported) {
            return (String) patchProxyResultProxy.result;
        }
        Random random = new Random();
        StringBuffer stringBuffer = new StringBuffer();
        for (int i11 = 0; i11 < i10; i11++) {
            stringBuffer.append("abcdefghijklmnopqrstuvwxyz0123456789".charAt(random.nextInt(36)));
        }
        return stringBuffer.toString();
    }

    public static PostEncryptParamsObj g(String str) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{str}, null, changeQuickRedirect, true, bb.c.f.f32457o0, new Class[]{String.class}, PostEncryptParamsObj.class);
        return patchProxyResultProxy.isSupported ? (PostEncryptParamsObj) patchProxyResultProxy.result : h(str, false);
    }

    public static PostEncryptParamsObj h(String str, boolean z10) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{str, new Byte(z10 ? (byte) 1 : (byte) 0)}, null, changeQuickRedirect, true, bb.c.f.f32525r0, new Class[]{String.class, Boolean.TYPE}, PostEncryptParamsObj.class);
        if (patchProxyResultProxy.isSupported) {
            return (PostEncryptParamsObj) patchProxyResultProxy.result;
        }
        byte[] bArrA = h.a(str);
        String strI = z10 ? i(16) : f(8);
        String strB = z10 ? b(bArrA, strI) : e(bArrA, strI);
        ob.a aVar = ob.a.f132240a;
        String strD = ob.a.b().D(strI);
        String str2 = (System.currentTimeMillis() / 1000) + "";
        return new PostEncryptParamsObj(strB, strD, j(strD + str2) + j(strB), str2);
    }

    public static String i(int i10) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{new Integer(i10)}, null, changeQuickRedirect, true, bb.c.f.f32503q0, new Class[]{Integer.TYPE}, String.class);
        if (patchProxyResultProxy.isSupported) {
            return (String) patchProxyResultProxy.result;
        }
        Random random = new Random();
        StringBuffer stringBuffer = new StringBuffer();
        for (int i11 = 0; i11 < i10; i11++) {
            stringBuffer.append("0123456789abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ!\\\"#$%&'()*+,-./:;<=>?@[\\]^_`{|}~".charAt(random.nextInt(95)));
        }
        return stringBuffer.toString();
    }

    public static String j(String str) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{str}, null, changeQuickRedirect, true, bb.c.f.f32411m0, new Class[]{String.class}, String.class);
        if (patchProxyResultProxy.isSupported) {
            return (String) patchProxyResultProxy.result;
        }
        if (TextUtils.isEmpty(str)) {
            return "";
        }
        try {
            String str2 = "";
            for (byte b10 : MessageDigest.getInstance("MD5").digest(str.getBytes())) {
                String hexString = Integer.toHexString(b10 & 255);
                if (hexString.length() == 1) {
                    hexString = "0" + hexString;
                }
                str2 = str2 + hexString;
            }
            return str2;
        } catch (NoSuchAlgorithmException e10) {
            e10.printStackTrace();
            return "";
        }
    }
}
