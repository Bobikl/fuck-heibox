package com.tencent.cos.xml.crypto;

import java.util.Collections;
import java.util.Map;
import java.util.TreeMap;

/* JADX INFO: loaded from: classes4.dex */
public class SecuredCEK {
    private final byte[] encrypted;
    private final String keyWrapAlgorithm;
    private final Map<String, String> matdesc;

    SecuredCEK(byte[] bArr, String str, Map<String, String> map) {
        this.encrypted = bArr;
        this.keyWrapAlgorithm = str;
        this.matdesc = Collections.unmodifiableMap(new TreeMap(map));
    }

    byte[] getEncrypted() {
        return this.encrypted;
    }

    String getKeyWrapAlgorithm() {
        return this.keyWrapAlgorithm;
    }

    Map<String, String> getMaterialDescription() {
        return this.matdesc;
    }
}
