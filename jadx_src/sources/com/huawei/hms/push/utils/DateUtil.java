package com.huawei.hms.push.utils;

import com.huawei.hms.support.log.HMSLog;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Locale;
import java.util.TimeZone;

/* JADX INFO: loaded from: classes7.dex */
public class DateUtil {
    private DateUtil() {
    }

    public static String parseMilliSecondToString(Long l10) {
        if (l10 == null) {
            return null;
        }
        try {
            return new SimpleDateFormat("yyyy-MM-dd'T'HH:mm:ss.SSS'Z'").format(l10);
        } catch (Exception e10) {
            HMSLog.e("DateUtil", "parseMilliSecondToString Exception.", e10);
            return null;
        }
    }

    public static long parseUtcToMillisecond(String str) throws StringIndexOutOfBoundsException, ParseException {
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy-MM-dd'T'HH:mm:ss.SSS'Z'", Locale.US);
        simpleDateFormat.setTimeZone(TimeZone.getTimeZone("UTC"));
        return simpleDateFormat.parse(str.substring(0, str.indexOf(".")) + (str.substring(str.indexOf(".")).substring(0, 4) + "Z")).getTime();
    }
}
