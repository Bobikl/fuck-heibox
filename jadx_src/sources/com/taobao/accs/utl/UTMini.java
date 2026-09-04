package com.taobao.accs.utl;

import android.app.Application;
import android.content.Context;
import android.text.TextUtils;
import com.huawei.hms.framework.common.ContainerUtils;
import com.xiaomi.mipush.sdk.Constants;
import java.util.Map;

/* JADX INFO: compiled from: Taobao */
/* JADX INFO: loaded from: classes4.dex */
public final class UTMini {
    public static final int EVENTID_AGOO = 19999;
    public static final String PAGE_AGOO = "Page_Push";
    private static final String TAG = "UTMini";
    private static UTMini instance = new UTMini();

    private String _convertStringAToKVSString(String... strArr) {
        if (strArr != null && strArr.length == 0) {
            return null;
        }
        StringBuffer stringBuffer = new StringBuffer();
        if (strArr != null && strArr.length > 0) {
            boolean z10 = false;
            for (int i10 = 0; i10 < strArr.length; i10++) {
                if (!TextUtils.isEmpty(strArr[i10])) {
                    if (z10) {
                        stringBuffer.append(Constants.ACCEPT_TIME_SEPARATOR_SP);
                    }
                    stringBuffer.append(strArr[i10]);
                    z10 = true;
                }
            }
        }
        return stringBuffer.toString();
    }

    public static String convertObjectToString(Object obj) {
        if (obj == null) {
            return "";
        }
        if (obj instanceof String) {
            return (String) obj;
        }
        if (obj instanceof Integer) {
            return "" + ((Integer) obj).intValue();
        }
        if (obj instanceof Long) {
            return "" + ((Long) obj).longValue();
        }
        if (obj instanceof Double) {
            return "" + ((Double) obj).doubleValue();
        }
        if (obj instanceof Float) {
            return "" + ((Float) obj).floatValue();
        }
        if (obj instanceof Short) {
            return "" + ((int) ((Short) obj).shortValue());
        }
        if (!(obj instanceof Byte)) {
            if (obj instanceof Boolean) {
                return ((Boolean) obj).toString();
            }
            return obj instanceof Character ? ((Character) obj).toString() : obj.toString();
        }
        return "" + ((int) ((Byte) obj).byteValue());
    }

    public static String getCommitInfo(int i10, String str, String str2, String str3, String str4) {
        StringBuilder sb2 = new StringBuilder();
        sb2.append("eventId=");
        sb2.append(i10);
        sb2.append(";arg1=");
        sb2.append(str);
        sb2.append(";arg2=");
        sb2.append(str2);
        sb2.append(";arg3=");
        sb2.append(str3);
        if (str4 != null) {
            sb2.append(";");
            sb2.append("args=");
            sb2.append(str4);
        }
        return sb2.toString();
    }

    public static String getCommitInfo(int i10, String str, String str2, String str3, Map<String, String> map) {
        StringBuilder sb2 = new StringBuilder();
        sb2.append("eventId=");
        sb2.append(i10);
        sb2.append(";arg1=");
        sb2.append(str);
        sb2.append(";arg2=");
        sb2.append(str2);
        sb2.append(";arg3=");
        sb2.append(str3);
        if (map != null) {
            sb2.append(";");
            sb2.append("args=");
            sb2.append(map.toString());
        }
        return sb2.toString();
    }

    public static UTMini getInstance() {
        return instance;
    }

    private static String[] mapToArray(Map<String, String> map) {
        int i10 = 0;
        if (map == null || map.isEmpty()) {
            return new String[0];
        }
        String[] strArr = new String[map.size()];
        for (Map.Entry<String, String> entry : map.entrySet()) {
            String key = entry.getKey();
            String value = entry.getValue();
            if (key == null) {
                strArr[i10] = "";
            } else {
                strArr[i10] = key + ContainerUtils.KEY_VALUE_DELIMITER + value;
            }
            i10++;
        }
        return strArr;
    }

    public final void commitEvent(int i10, String str, Object obj) {
    }

    public final void commitEvent(int i10, String str, Object obj, Object obj2) {
    }

    public final void commitEvent(int i10, String str, Object obj, Object obj2, Object obj3) {
    }

    public final void commitEvent(int i10, String str, Object obj, Object obj2, Object obj3, Map<String, String> map) {
    }

    public final void commitEvent(int i10, String str, Object obj, Object obj2, Object obj3, String... strArr) {
    }

    public final String getUtdId(Context context) {
        return null;
    }

    public final void onCaughException(Throwable th2) {
    }

    public final void start(Application application, String str, String str2, String str3) {
    }

    public final void stop(Context context) {
    }
}
