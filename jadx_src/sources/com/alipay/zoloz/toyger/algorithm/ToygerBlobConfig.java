package com.alipay.zoloz.toyger.algorithm;

/* JADX INFO: loaded from: classes6.dex */
public abstract class ToygerBlobConfig {
    public String pubkey;

    public abstract float getCompressRate();

    public Integer getDesiredWidth() {
        return -1;
    }
}
