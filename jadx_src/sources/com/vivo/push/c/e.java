package com.vivo.push.c;

import android.content.Context;
import android.security.KeyPairGeneratorSpec;
import android.text.TextUtils;
import android.util.Base64;
import com.vivo.push.util.p;
import java.math.BigInteger;
import java.security.KeyPairGenerator;
import java.security.KeyStore;
import java.security.PrivateKey;
import java.security.PublicKey;
import java.security.Signature;
import java.util.Calendar;
import javax.security.auth.x500.X500Principal;

/* JADX INFO: compiled from: RsaSecurity.java */
/* JADX INFO: loaded from: classes4.dex */
public final class e implements b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static PrivateKey f106514a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static PublicKey f106515b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static KeyStore f106516c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private static X500Principal f106517d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private Context f106518e;

    public e(Context context) {
        this.f106518e = context;
        try {
            b();
            a(context);
        } catch (Exception e10) {
            e10.printStackTrace();
            p.a("RsaSecurity", "init error" + e10.getMessage());
        }
    }

    private static void a(Context context) {
        try {
            if (context == null) {
                p.d("RsaSecurity", " generateRSAKeyPairSign context == null ");
                return;
            }
            if (b("PushRsaKeyAlias")) {
                p.d("RsaSecurity", " generateRSAKeyPairSign this keyAlias PushRsaKeyAlias is Created ");
                return;
            }
            Calendar calendar = Calendar.getInstance();
            Calendar calendar2 = Calendar.getInstance();
            calendar2.add(1, 999);
            KeyPairGeneratorSpec keyPairGeneratorSpecBuild = new KeyPairGeneratorSpec.Builder(context.getApplicationContext()).setAlias("PushRsaKeyAlias").setSubject(f106517d).setSerialNumber(BigInteger.valueOf(1337L)).setStartDate(calendar.getTime()).setEndDate(calendar2.getTime()).build();
            KeyPairGenerator keyPairGenerator = KeyPairGenerator.getInstance(n5.d.f132016a, "AndroidKeyStore");
            keyPairGenerator.initialize(keyPairGeneratorSpecBuild);
            keyPairGenerator.generateKeyPair();
        } catch (Exception e10) {
            e10.printStackTrace();
            p.a("RsaSecurity", "generateRSAKeyPairSign error" + e10.getMessage());
        }
    }

    private static PrivateKey b(Context context) {
        try {
            PrivateKey privateKey = f106514a;
            if (privateKey != null) {
                return privateKey;
            }
            if (context == null) {
                p.d("RsaSecurity", " getPrivateKeySigin context == null ");
                return null;
            }
            if (!b("PushRsaKeyAlias")) {
                a(context);
            }
            KeyStore.Entry entry = f106516c.getEntry("PushRsaKeyAlias", null);
            if (entry instanceof KeyStore.PrivateKeyEntry) {
                PrivateKey privateKey2 = ((KeyStore.PrivateKeyEntry) entry).getPrivateKey();
                f106514a = privateKey2;
                return privateKey2;
            }
            return null;
        } catch (Exception e10) {
            e10.printStackTrace();
            p.a("RsaSecurity", "getPrivateKeySigin error" + e10.getMessage());
        }
    }

    private static void b() {
        try {
            KeyStore keyStore = KeyStore.getInstance("AndroidKeyStore");
            f106516c = keyStore;
            keyStore.load(null);
            f106517d = new X500Principal("CN=Push SDK, OU=VIVO, O=VIVO PUSH, C=CN");
        } catch (Exception e10) {
            e10.printStackTrace();
            p.a("RsaSecurity", "initKeyStore error" + e10.getMessage());
        }
    }

    private static boolean b(String str) {
        if (TextUtils.isEmpty(str)) {
            return false;
        }
        try {
            if (f106516c == null) {
                b();
            }
            return f106516c.containsAlias(str);
        } catch (Exception e10) {
            e10.printStackTrace();
            p.a("RsaSecurity", "getPrivateKeySigin error" + e10.getMessage());
            return false;
        }
    }

    @Override // com.vivo.push.c.b
    public final String a(String str) {
        try {
            if (TextUtils.isEmpty(str) || b(this.f106518e) == null) {
                return null;
            }
            byte[] bytes = str.getBytes("UTF-8");
            PrivateKey privateKeyB = b(this.f106518e);
            Signature signature = Signature.getInstance("SHA256withRSA");
            signature.initSign(privateKeyB);
            signature.update(bytes);
            String strEncodeToString = Base64.encodeToString(signature.sign(), 2);
            p.d("RsaSecurity", str.hashCode() + " = " + strEncodeToString);
            return strEncodeToString;
        } catch (Exception e10) {
            e10.printStackTrace();
            p.a("RsaSecurity", "signClientSDK error" + e10.getMessage());
            return null;
        }
    }

    @Override // com.vivo.push.c.b
    public final PublicKey a() {
        try {
            PublicKey publicKey = f106515b;
            if (publicKey != null) {
                return publicKey;
            }
            if (!b("PushRsaKeyAlias")) {
                a(this.f106518e);
            }
            KeyStore.Entry entry = f106516c.getEntry("PushRsaKeyAlias", null);
            if (entry instanceof KeyStore.PrivateKeyEntry) {
                PublicKey publicKey2 = ((KeyStore.PrivateKeyEntry) entry).getCertificate().getPublicKey();
                f106515b = publicKey2;
                return publicKey2;
            }
        } catch (Exception e10) {
            e10.printStackTrace();
            p.a("RsaSecurity", "getPublicKeySign error" + e10.getMessage());
        }
        return null;
    }

    @Override // com.vivo.push.c.b
    public final boolean a(byte[] bArr, PublicKey publicKey, byte[] bArr2) {
        try {
            Signature signature = Signature.getInstance("SHA256withRSA");
            signature.initVerify(publicKey);
            signature.update(bArr);
            return signature.verify(bArr2);
        } catch (Exception e10) {
            e10.printStackTrace();
            p.a("RsaSecurity", "verifyClientSDK error" + e10.getMessage());
            return false;
        }
    }
}
