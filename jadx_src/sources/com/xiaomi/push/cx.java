package com.xiaomi.push;

import android.system.Os;
import java.io.File;

/* JADX INFO: loaded from: classes4.dex */
public class cx {
    public static long a(String str) {
        try {
            if (new File(str).exists()) {
                return Os.stat(str).st_size;
            }
            return 0L;
        } catch (Exception e10) {
            com.xiaomi.channel.commonutils.logger.b.a(e10);
            return 0L;
        }
    }
}
