package com.huawei.hms.aaid.encrypt;

import android.content.Context;
import android.text.TextUtils;
import com.huawei.hms.opendevice.o;
import com.huawei.secure.android.common.encrypt.aes.AesCbc;

/* JADX INFO: loaded from: classes7.dex */
public class PushEncrypter {
    public static String decrypter(Context context, String str) {
        return TextUtils.isEmpty(str) ? "" : AesCbc.decrypt(str, o.b(context));
    }

    public static String encrypter(Context context, String str) {
        return TextUtils.isEmpty(str) ? "" : AesCbc.encrypt(str, o.b(context));
    }

    public static String encrypterOld(Context context, String str) {
        return TextUtils.isEmpty(str) ? "" : AesCbc.encrypt(str, o.a(context));
    }
}
