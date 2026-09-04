package com.ishumei.smantifraud.l111l1111llIl;

import android.text.TextUtils;
import com.xiaomi.mipush.sdk.Constants;
import java.util.Random;

/* JADX INFO: loaded from: classes6.dex */
public final class l111l11111Il {
    public static String l1111l111111Il() {
        StringBuilder sb2 = new StringBuilder();
        Random random = new Random(System.currentTimeMillis());
        for (int i10 = 0; i10 < 5; i10++) {
            sb2.append(random.nextInt(10));
        }
        return System.currentTimeMillis() + Constants.ACCEPT_TIME_SEPARATOR_SERVER + ((Object) sb2);
    }

    public static boolean l1111l111111Il(String str) {
        return str == null || str.isEmpty();
    }

    public static boolean l1111l111111Il(String str, String str2) {
        return TextUtils.equals(str, str2);
    }
}
