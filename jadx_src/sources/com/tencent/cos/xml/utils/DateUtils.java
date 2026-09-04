package com.tencent.cos.xml.utils;

import com.tencent.cos.xml.common.ClientErrorCode;
import com.tencent.cos.xml.exception.CosXmlClientException;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;

/* JADX INFO: loaded from: classes4.dex */
public class DateUtils {
    private static final String GMT_TIME_FORMAT = "EEE, dd MMM yyyy HH:mm:ss 'GMT'";

    public static String getFormatTime(String str, long j10) {
        return new SimpleDateFormat(str, Locale.ENGLISH).format(new Date(j10));
    }

    public static Date toDate(String str) throws CosXmlClientException {
        try {
            return new SimpleDateFormat(GMT_TIME_FORMAT, Locale.ENGLISH).parse(str);
        } catch (ParseException e10) {
            throw new CosXmlClientException(ClientErrorCode.INTERNAL_ERROR.getCode(), e10);
        }
    }

    public static String toString(long j10) {
        return new SimpleDateFormat(GMT_TIME_FORMAT, Locale.ENGLISH).format(new Date(j10));
    }

    public static String toString(Date date) {
        return new SimpleDateFormat(GMT_TIME_FORMAT, Locale.ENGLISH).format(date);
    }
}
