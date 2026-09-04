package com.tencent.thumbplayer.tcmedia.utils;

import android.text.TextUtils;
import java.util.Map;
import java.util.Properties;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes4.dex */
public class l implements com.tencent.thumbplayer.tcmedia.common.a.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    protected final Properties f103165a;

    public l() {
        this(null);
    }

    public l(Properties properties) {
        this.f103165a = new Properties();
        if (properties != null) {
            for (Map.Entry entry : properties.entrySet()) {
                a((String) entry.getKey(), (String) entry.getValue());
            }
        }
    }

    public Properties a() {
        return this.f103165a;
    }

    @Override // com.tencent.thumbplayer.tcmedia.common.a.a
    public void a(String str, float f10) {
        if (str != null) {
            this.f103165a.put(str, String.valueOf(f10));
        }
    }

    @Override // com.tencent.thumbplayer.tcmedia.common.a.a
    public void a(String str, int i10) {
        if (str != null) {
            this.f103165a.put(str, String.valueOf(i10));
        }
    }

    @Override // com.tencent.thumbplayer.tcmedia.common.a.a
    public void a(String str, long j10) {
        if (str != null) {
            this.f103165a.put(str, String.valueOf(j10));
        }
    }

    @Override // com.tencent.thumbplayer.tcmedia.common.a.a
    public void a(String str, String str2) {
        if (str != null) {
            if (TextUtils.isEmpty(str2)) {
                this.f103165a.put(str, "");
            } else {
                this.f103165a.put(str, str2);
            }
        }
    }

    @Override // com.tencent.thumbplayer.tcmedia.common.a.a
    public void a(Map<String, String> map) {
        if (map == null) {
            throw new IllegalArgumentException("map must not be null!");
        }
        for (Map.Entry entry : this.f103165a.entrySet()) {
            Object key = entry.getKey();
            Object value = entry.getValue();
            if (value == null) {
                map.put(key.toString(), "");
            } else {
                map.put(key.toString(), value.toString());
            }
        }
    }

    public String toString() {
        JSONObject jSONObject = new JSONObject(this.f103165a);
        if (jSONObject.has("data")) {
            try {
                String string = jSONObject.getString("data");
                jSONObject.remove("data");
                jSONObject.put("data", new JSONObject(string));
            } catch (JSONException e10) {
                TPLogUtil.e("TPProperties", e10);
            }
        }
        return jSONObject.toString();
    }
}
