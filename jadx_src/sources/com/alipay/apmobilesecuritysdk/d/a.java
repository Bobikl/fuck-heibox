package com.alipay.apmobilesecuritysdk.d;

import android.content.Context;
import java.util.HashMap;
import java.util.Map;

/* JADX INFO: loaded from: classes6.dex */
public final class a {
    public static synchronized Map<String, String> a(Context context, Map<String, String> map) {
        HashMap map2;
        String strB = e6.a.b(map, "appchannel", "");
        map2 = new HashMap();
        map2.put("AA1", context.getPackageName());
        o4.a.b();
        map2.put("AA2", o4.a.a(context));
        map2.put("AA3", "APPSecuritySDK-ALIPAYSDK");
        map2.put("AA4", "3.4.0.202206130311");
        map2.put("AA6", strB);
        return map2;
    }
}
