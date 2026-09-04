package com.vivo.push.util;

import android.content.Context;
import android.util.Base64;
import com.tencent.cos.xml.crypto.JceEncryptionConstants;
import javax.crypto.Cipher;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;

/* JADX INFO: compiled from: AESParseManager.java */
/* JADX INFO: loaded from: classes4.dex */
public class a {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static volatile a f106654c;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private byte[] f106655a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private byte[] f106656b;

    private a(Context context) {
        w.b().a(ContextDelegate.getContext(context));
        w wVarB = w.b();
        this.f106655a = wVarB.c();
        this.f106656b = wVarB.d();
    }

    public static a a(Context context) {
        if (f106654c == null) {
            synchronized (a.class) {
                if (f106654c == null) {
                    f106654c = new a(context.getApplicationContext());
                }
            }
        }
        return f106654c;
    }

    private byte[] a() {
        byte[] bArr = this.f106655a;
        return (bArr == null || bArr.length <= 0) ? w.b().c() : bArr;
    }

    private byte[] b() {
        byte[] bArr = this.f106656b;
        return (bArr == null || bArr.length <= 0) ? w.b().d() : bArr;
    }

    public final String a(String str) throws Exception {
        String strA = f.a(a());
        String strA2 = f.a(b());
        byte[] bytes = str.getBytes("utf-8");
        SecretKeySpec secretKeySpec = new SecretKeySpec(strA2.getBytes("utf-8"), JceEncryptionConstants.SYMMETRIC_KEY_ALGORITHM);
        Cipher cipher = Cipher.getInstance(JceEncryptionConstants.SYMMETRIC_CIPHER_METHOD);
        cipher.init(1, secretKeySpec, new IvParameterSpec(strA.getBytes("utf-8")));
        return Base64.encodeToString(cipher.doFinal(bytes), 2);
    }

    public final String b(String str) throws Exception {
        return new String(f.a(f.a(a()), f.a(b()), Base64.decode(str, 2)), "utf-8");
    }
}
