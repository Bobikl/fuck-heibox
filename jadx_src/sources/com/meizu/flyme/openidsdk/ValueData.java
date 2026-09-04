package com.meizu.flyme.openidsdk;

/* JADX INFO: loaded from: classes13.dex */
public class ValueData {
    public int code;
    public long expired = System.currentTimeMillis() + 86400000;
    public String value;

    public ValueData(String str, int i10) {
        this.value = str;
        this.code = i10;
    }

    public native String toString();
}
