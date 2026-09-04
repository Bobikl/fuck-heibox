package com.tencent.cos.xml.crypto;

import java.io.Serializable;
import java.security.KeyPair;
import javax.crypto.SecretKey;

/* JADX INFO: loaded from: classes4.dex */
public class KMSEncryptionMaterials extends EncryptionMaterials implements Serializable {
    public static final String CUSTOMER_MASTER_KEY_ID = "kms_cmk_id";

    public KMSEncryptionMaterials(String str) {
        super(null, null);
        if (str == null || str.length() == 0) {
            throw new IllegalArgumentException("The default customer master key id must be specified");
        }
        addDescription(CUSTOMER_MASTER_KEY_ID, str);
    }

    @Override // com.tencent.cos.xml.crypto.EncryptionMaterials
    public String getCustomerMasterKeyId() {
        return getDescription(CUSTOMER_MASTER_KEY_ID);
    }

    @Override // com.tencent.cos.xml.crypto.EncryptionMaterials
    public final KeyPair getKeyPair() {
        throw new UnsupportedOperationException();
    }

    @Override // com.tencent.cos.xml.crypto.EncryptionMaterials
    public final SecretKey getSymmetricKey() {
        throw new UnsupportedOperationException();
    }

    @Override // com.tencent.cos.xml.crypto.EncryptionMaterials
    public final boolean isKMSEnabled() {
        return true;
    }

    public String toString() {
        return String.valueOf(getMaterialsDescription());
    }
}
