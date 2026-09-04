package com.alipay.mobilesecuritysdk.face;

import android.content.Context;
import com.alipay.apmobilesecuritysdk.face.APSecuritySdk;
import e6.a;
import java.util.HashMap;
import java.util.Map;

/* JADX INFO: loaded from: classes6.dex */
public class SecurityClientMobile {
    public static synchronized String GetApdid(Context context, Map<String, String> map) {
        HashMap map2 = new HashMap();
        map2.put("utdid", a.b(map, "utdid", ""));
        map2.put("tid", a.b(map, "tid", ""));
        map2.put("userId", a.b(map, "userId", ""));
        APSecuritySdk.getInstance(context).initToken(0, map2, null);
        return com.alipay.apmobilesecuritysdk.a.a.a(context);
    }
}
