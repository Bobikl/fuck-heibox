package com.tencent.liteav.base.util;

import com.tencent.liteav.base.Log;
import java.text.SimpleDateFormat;
import java.util.Date;

/* JADX INFO: loaded from: classes4.dex */
public class TimeFormat {
    public static String format(long j10, String str) {
        try {
            return new SimpleDateFormat(str).format(new Date(j10));
        } catch (Exception e10) {
            Log.i("TimeFormat", "toString: Date conversion failed.", e10);
            return "";
        }
    }

    public static long fromString(String str, String str2) {
        try {
            Date date = new SimpleDateFormat(str2).parse(str);
            if (date == null) {
                return 0L;
            }
            return date.getTime();
        } catch (Exception e10) {
            Log.i("TimeFormat", "formString: Date conversion failed.", e10);
            return 0L;
        }
    }
}
