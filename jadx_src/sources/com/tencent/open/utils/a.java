package com.tencent.open.utils;

import android.content.Context;
import android.content.SharedPreferences;
import android.os.Build;
import android.security.keystore.KeyGenParameterSpec;
import android.util.Base64;
import com.tencent.open.log.SLog;
import java.security.KeyPairGenerator;
import java.security.KeyStore;
import java.security.PrivateKey;
import java.security.PublicKey;
import java.security.SecureRandom;
import javax.crypto.Cipher;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;

/* JADX INFO: compiled from: ProGuard */
/* JADX INFO: loaded from: classes4.dex */
public class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private KeyStore f101153a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private SharedPreferences f101154b;

    public a(Context context) {
        try {
            this.f101154b = context.getSharedPreferences("KEYSTORE_SETTING", 0);
            KeyStore keyStore = KeyStore.getInstance("AndroidKeyStore");
            this.f101153a = keyStore;
            keyStore.load(null);
            if (this.f101153a.containsAlias("KEYSTORE_AES")) {
                return;
            }
            c("");
            a(context);
            a();
        } catch (Exception e10) {
            SLog.d("KEYSTORE", "Exception", e10);
        }
    }

    private void a() throws Exception {
        byte[] bArr = new byte[16];
        SecureRandom secureRandom = new SecureRandom();
        secureRandom.nextBytes(bArr);
        c(Base64.encodeToString(secureRandom.generateSeed(12), 0));
        PublicKey publicKey = this.f101153a.getCertificate("KEYSTORE_AES").getPublicKey();
        Cipher cipher = Cipher.getInstance("RSA/ECB/PKCS1Padding");
        cipher.init(1, publicKey);
        d(Base64.encodeToString(cipher.doFinal(bArr), 0));
    }

    private void a(Context context) throws Exception {
        SLog.d("KEYSTORE", "Build.VERSION.SDK_INT=" + Build.VERSION.SDK_INT);
        KeyPairGenerator keyPairGenerator = KeyPairGenerator.getInstance(n5.d.f132016a, "AndroidKeyStore");
        keyPairGenerator.initialize(new KeyGenParameterSpec.Builder("KEYSTORE_AES", 3).setDigests("SHA-256", "SHA-512").setEncryptionPaddings("PKCS1Padding").build());
        keyPairGenerator.generateKeyPair();
    }

    private byte[] b() {
        return Base64.decode(this.f101154b.getString("PREF_KEY_IV", ""), 0);
    }

    private SecretKeySpec c() throws Exception {
        String string = this.f101154b.getString("PREF_KEY_AES", "");
        PrivateKey privateKey = (PrivateKey) this.f101153a.getKey("KEYSTORE_AES", null);
        Cipher cipher = Cipher.getInstance("RSA/ECB/PKCS1Padding");
        cipher.init(2, privateKey);
        return new SecretKeySpec(cipher.doFinal(Base64.decode(string, 0)), "AES/GCM/NoPadding");
    }

    private void c(String str) {
        this.f101154b.edit().putString("PREF_KEY_IV", str).apply();
    }

    private void d(String str) {
        this.f101154b.edit().putString("PREF_KEY_AES", str).apply();
    }

    public String a(String str) {
        try {
            Cipher cipher = Cipher.getInstance("AES/GCM/NoPadding");
            cipher.init(1, c(), new IvParameterSpec(b()));
            return Base64.encodeToString(cipher.doFinal(str.getBytes()), 0);
        } catch (Exception e10) {
            SLog.e("KEYSTORE", "Exception", e10);
            return "";
        }
    }

    public String b(String str) {
        try {
            byte[] bArrDecode = Base64.decode(str.getBytes(), 0);
            Cipher cipher = Cipher.getInstance("AES/GCM/NoPadding");
            cipher.init(2, c(), new IvParameterSpec(b()));
            return new String(cipher.doFinal(bArrDecode));
        } catch (Exception e10) {
            SLog.e("KEYSTORE", "Exception", e10);
            return "";
        }
    }
}
