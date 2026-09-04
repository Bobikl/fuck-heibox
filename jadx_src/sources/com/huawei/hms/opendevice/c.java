package com.huawei.hms.opendevice;

import com.huawei.secure.android.common.encrypt.utils.HexUtil;

/* JADX INFO: compiled from: BaseUtil.java */
/* JADX INFO: loaded from: classes7.dex */
public abstract class c {
    public static String a(byte[] bArr) {
        return HexUtil.byteArray2HexStr(bArr);
    }

    public static byte[] a(String str) {
        return HexUtil.hexStr2ByteArray(str);
    }
}
