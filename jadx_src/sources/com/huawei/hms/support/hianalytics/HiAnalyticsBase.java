package com.huawei.hms.support.hianalytics;

import android.content.Context;
import android.text.TextUtils;
import java.util.HashMap;
import java.util.Map;

/* JADX INFO: loaded from: classes7.dex */
public class HiAnalyticsBase {
    protected static Map<String, String> getMapForBi(Context context, String str) {
        HashMap map = new HashMap();
        if (context != null && !TextUtils.isEmpty(str)) {
            String[] strArrSplit = str.split("\\.");
            if (strArrSplit.length >= 2) {
                String str2 = strArrSplit[0];
                String str3 = strArrSplit[1];
                map.put("service", str2);
                map.put("apiName", str3);
                map.put("package", context.getPackageName());
                map.put(HiAnalyticsConstant.HaKey.BI_KEY_BASE_VERSION, "6.8.0.300");
                map.put("callTime", String.valueOf(System.currentTimeMillis()));
            }
        }
        return map;
    }
}
