package com.vivo.push.c;

import android.security.keystore.KeyGenParameterSpec;
import com.tencent.cos.xml.crypto.JceEncryptionConstants;
import com.vivo.push.util.p;
import java.security.KeyStore;
import javax.crypto.KeyGenerator;
import javax.crypto.SecretKey;

/* JADX INFO: compiled from: AesSecurity.java */
/* JADX INFO: loaded from: classes4.dex */
public final class a implements c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private KeyStore f106508a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private SecretKey f106509b;

    public a() {
        a();
        b();
    }

    private void a() {
        try {
            KeyStore keyStore = KeyStore.getInstance("AndroidKeyStore");
            this.f106508a = keyStore;
            keyStore.load(null);
        } catch (Exception e10) {
            e10.printStackTrace();
            p.a("AesSecurity", "initKeyStore error" + e10.getMessage());
        }
    }

    private SecretKey b() {
        try {
            SecretKey secretKey = this.f106509b;
            if (secretKey != null) {
                return secretKey;
            }
            if (c()) {
                this.f106509b = d();
            } else {
                KeyGenerator keyGenerator = KeyGenerator.getInstance(JceEncryptionConstants.SYMMETRIC_KEY_ALGORITHM, "AndroidKeyStore");
                keyGenerator.init(new KeyGenParameterSpec.Builder("AesKeyAlias", 3).setBlockModes("GCM").setEncryptionPaddings("NoPadding").setKeySize(256).build());
                this.f106509b = keyGenerator.generateKey();
            }
            return this.f106509b;
        } catch (Exception e10) {
            e10.printStackTrace();
            p.a("AesSecurity", "getSecretKey error" + e10.getMessage());
            return null;
        }
    }

    private boolean c() {
        try {
            if (this.f106508a == null) {
                a();
            }
            return this.f106508a.containsAlias("AesKeyAlias");
        } catch (Exception e10) {
            e10.printStackTrace();
            p.a("AesSecurity", "hasAESKey error" + e10.getMessage());
            return false;
        }
    }

    private SecretKey d() {
        try {
            return ((KeyStore.SecretKeyEntry) this.f106508a.getEntry("AesKeyAlias", null)).getSecretKey();
        } catch (Exception e10) {
            e10.printStackTrace();
            p.a("AesSecurity", "getAESSecretKey error" + e10.getMessage());
            return null;
        }
    }
}
