package com.huawei.hms.utils;

import com.huawei.hms.framework.common.ExceptionCode;
import java.util.regex.Pattern;

/* JADX INFO: loaded from: classes7.dex */
public class StringUtil {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final Pattern f62795a = Pattern.compile("(^([0-9]{1,2}\\.){2}[0-9]{1,2}$)|(^([0-9]{1,2}\\.){3}[0-9]{1,3}$)");

    private StringUtil() {
    }

    public static String addByteForNum(String str, int i10, char c10) {
        int length = str.length();
        if (length == i10) {
            return str;
        }
        if (length > i10) {
            return str.substring(length - i10);
        }
        StringBuffer stringBuffer = new StringBuffer();
        while (length < i10) {
            stringBuffer.append(c10);
            length++;
        }
        stringBuffer.append(str);
        return stringBuffer.toString();
    }

    public static boolean checkVersion(String str) {
        return f62795a.matcher(str).find();
    }

    public static int convertVersion2Integer(String str) {
        if (!checkVersion(str)) {
            return 0;
        }
        String[] strArrSplit = str.split("\\.");
        if (strArrSplit.length < 3) {
            return 0;
        }
        int i10 = (Integer.parseInt(strArrSplit[0]) * ExceptionCode.CRASH_EXCEPTION) + (Integer.parseInt(strArrSplit[1]) * 100000) + (Integer.parseInt(strArrSplit[2]) * 1000);
        return strArrSplit.length == 4 ? i10 + Integer.parseInt(strArrSplit[3]) : i10;
    }

    public static String objDesc(Object obj) {
        if (obj == null) {
            return "null";
        }
        return obj.getClass().getName() + '@' + Integer.toHexString(obj.hashCode());
    }
}
