package com.google.android.exoplayer2.drm;

import com.google.android.exoplayer2.util.u0;
import com.taobao.aranger.constant.Constants;
import com.tencent.qcloud.core.util.IOUtils;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: compiled from: ClearKeyUtil.java */
/* JADX INFO: loaded from: classes7.dex */
public final class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final String f44672a = "ClearKeyUtil";

    private a() {
    }

    public static byte[] a(byte[] bArr) {
        return u0.f51536a >= 27 ? bArr : u0.y0(c(u0.I(bArr)));
    }

    public static byte[] b(byte[] bArr) {
        if (u0.f51536a >= 27) {
            return bArr;
        }
        try {
            JSONObject jSONObject = new JSONObject(u0.I(bArr));
            StringBuilder sb2 = new StringBuilder("{\"keys\":[");
            JSONArray jSONArray = jSONObject.getJSONArray(Constants.PARAM_KEYS);
            for (int i10 = 0; i10 < jSONArray.length(); i10++) {
                if (i10 != 0) {
                    sb2.append(com.xiaomi.mipush.sdk.Constants.ACCEPT_TIME_SEPARATOR_SP);
                }
                JSONObject jSONObject2 = jSONArray.getJSONObject(i10);
                sb2.append("{\"k\":\"");
                sb2.append(d(jSONObject2.getString("k")));
                sb2.append("\",\"kid\":\"");
                sb2.append(d(jSONObject2.getString("kid")));
                sb2.append("\",\"kty\":\"");
                sb2.append(jSONObject2.getString("kty"));
                sb2.append("\"}");
            }
            sb2.append("]}");
            return u0.y0(sb2.toString());
        } catch (JSONException e10) {
            String strValueOf = String.valueOf(u0.I(bArr));
            com.google.android.exoplayer2.util.u.e(f44672a, strValueOf.length() != 0 ? "Failed to adjust response data: ".concat(strValueOf) : new String("Failed to adjust response data: "), e10);
            return bArr;
        }
    }

    private static String c(String str) {
        return str.replace('+', '-').replace(IOUtils.DIR_SEPARATOR_UNIX, '_');
    }

    private static String d(String str) {
        return str.replace('-', '+').replace('_', IOUtils.DIR_SEPARATOR_UNIX);
    }
}
