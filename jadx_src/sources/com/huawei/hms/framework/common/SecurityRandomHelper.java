package com.huawei.hms.framework.common;

import android.annotation.SuppressLint;
import com.huawei.secure.android.common.encrypt.utils.EncryptUtil;

/* JADX INFO: loaded from: classes7.dex */
public class SecurityRandomHelper {

    @SuppressLint({"StaticFieldLeak"})
    public static volatile SecurityRandomHelper instance;

    private SecurityRandomHelper() {
    }

    public static SecurityRandomHelper getInstance() {
        if (instance == null) {
            synchronized (SecurityRandomHelper.class) {
                if (instance == null) {
                    EncryptUtil.setBouncycastleFlag(true);
                    instance = new SecurityRandomHelper();
                }
            }
        }
        return instance;
    }

    public byte[] generateSecureRandom(int i10) {
        return EncryptUtil.generateSecureRandom(i10);
    }

    public String generateSecureRandomStr(int i10) {
        return EncryptUtil.generateSecureRandomStr(i10);
    }
}
