package com.huawei.hms.framework.network.grs.g.i;

import android.content.Context;
import android.text.TextUtils;
import com.huawei.hms.framework.common.Logger;
import com.huawei.hms.framework.common.StringUtils;
import com.huawei.hms.framework.network.grs.GrsApp;
import com.huawei.hms.framework.network.grs.g.j.d;
import com.huawei.hms.framework.network.grs.h.c;
import java.util.ArrayList;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes7.dex */
public class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final String f60846a = "a";

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static d f60847b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static final Object f60848c = new Object();

    public static synchronized d a(Context context) {
        synchronized (f60848c) {
            d dVar = f60847b;
            if (dVar != null) {
                return dVar;
            }
            String strA = c.a(GrsApp.getInstance().getBrand("/") + "grs_sdk_server_config.json", context);
            ArrayList arrayList = null;
            if (TextUtils.isEmpty(strA)) {
                return null;
            }
            try {
                JSONObject jSONObject = new JSONObject(strA).getJSONObject("grs_server");
                JSONArray jSONArray = jSONObject.getJSONArray("grs_base_url");
                if (jSONArray != null && jSONArray.length() > 0) {
                    arrayList = new ArrayList();
                    for (int i10 = 0; i10 < jSONArray.length(); i10++) {
                        arrayList.add(jSONArray.get(i10).toString());
                    }
                }
                d dVar2 = new d();
                f60847b = dVar2;
                dVar2.a(arrayList);
                f60847b.a(jSONObject.getString("grs_query_endpoint_2.0"));
                f60847b.a(jSONObject.getInt("grs_query_timeout"));
            } catch (JSONException e10) {
                Logger.w(f60846a, "getGrsServerBean catch JSONException: %s", StringUtils.anonymizeMessage(e10.getMessage()));
            }
            return f60847b;
        }
    }
}
