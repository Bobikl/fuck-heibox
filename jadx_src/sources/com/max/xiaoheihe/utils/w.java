package com.max.xiaoheihe.utils;

import android.util.Base64;
import com.max.xiaoheihe.app.HeyBoxApplication;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.PatchProxyResult;
import java.security.KeyFactory;
import java.security.NoSuchAlgorithmException;
import java.security.interfaces.RSAPublicKey;
import java.security.spec.InvalidKeySpecException;
import java.security.spec.X509EncodedKeySpec;
import javax.crypto.Cipher;

/* JADX INFO: compiled from: RSAUtil.java */
/* JADX INFO: loaded from: classes13.dex */
public class w {
    public static ChangeQuickRedirect changeQuickRedirect;

    public static String a(String str) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{str}, null, changeQuickRedirect, true, 48819, new Class[]{String.class}, String.class);
        if (patchProxyResultProxy.isSupported) {
            return (String) patchProxyResultProxy.result;
        }
        try {
            byte[] bytes = str.getBytes();
            RSAPublicKey rSAPublicKeyB = b(NDKTools.getrsakey(HeyBoxApplication.C(), lb.a.f130995l, lb.a.f131080z0));
            Cipher cipher = Cipher.getInstance("RSA/ECB/PKCS1Padding");
            cipher.init(1, rSAPublicKeyB);
            return Base64.encodeToString(cipher.doFinal(bytes), 0);
        } catch (Exception unused) {
            return null;
        }
    }

    public static RSAPublicKey b(String str) throws Exception {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{str}, null, changeQuickRedirect, true, 48818, new Class[]{String.class}, RSAPublicKey.class);
        if (patchProxyResultProxy.isSupported) {
            return (RSAPublicKey) patchProxyResultProxy.result;
        }
        try {
            return (RSAPublicKey) KeyFactory.getInstance(n5.d.f132016a).generatePublic(new X509EncodedKeySpec(Base64.decode(str, 0)));
        } catch (NullPointerException unused) {
            com.max.hbcommon.utils.d.b("zzzzRSA", "----------公钥数据为空----------");
            throw new Exception("公钥数据为空");
        } catch (NoSuchAlgorithmException unused2) {
            com.max.hbcommon.utils.d.b("zzzzRSA", "----------无此算法----------");
            throw new Exception("无此算法");
        } catch (InvalidKeySpecException unused3) {
            com.max.hbcommon.utils.d.b("zzzzRSA", "----------公钥非法----------");
            throw new Exception("公钥非法");
        }
    }

    public static String c(String str) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{str}, null, changeQuickRedirect, true, 48820, new Class[]{String.class}, String.class);
        if (patchProxyResultProxy.isSupported) {
            return (String) patchProxyResultProxy.result;
        }
        try {
            byte[] bArrDecode = Base64.decode(str, 0);
            RSAPublicKey rSAPublicKeyB = b(NDKTools.getrsakey(HeyBoxApplication.C(), lb.a.f130995l, lb.a.f131080z0));
            Cipher cipher = Cipher.getInstance("RSA/ECB/PKCS1Padding");
            cipher.init(2, rSAPublicKeyB);
            return new String(cipher.doFinal(bArrDecode));
        } catch (Exception unused) {
            return null;
        }
    }
}
