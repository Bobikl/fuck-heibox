package com.alibaba.sdk.android.utils;

import android.text.TextUtils;
import android.util.Log;
import java.util.HashMap;
import java.util.Map;

/* JADX INFO: loaded from: classes6.dex */
public class AlicloudTracker {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private a f38033a;

    /* JADX INFO: renamed from: a, reason: collision with other field name */
    private String f53a;

    /* JADX INFO: renamed from: a, reason: collision with other field name */
    private Map<String, String> f54a = new HashMap();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private String f38034b;

    AlicloudTracker(a aVar, String str, String str2) {
        this.f38033a = aVar;
        this.f53a = str;
        this.f38034b = str2;
    }

    public void removeGlobalProperty(String str) {
        if (TextUtils.isEmpty(str) || !this.f54a.containsKey(str)) {
            Log.e("AlicloudTracker", "key is null or key is empty,please check it!");
        } else {
            this.f54a.remove(str);
        }
    }

    public void sendCustomHit(String str, long j10, Map<String, String> map) {
        try {
            if (this.f38033a == null) {
                Log.e("AlicloudTracker", "dataTracker is null, can not sendCustomHit");
                return;
            }
            if (map == null) {
                map = new HashMap<>();
            }
            map.putAll(this.f54a);
            map.put("sdkId", this.f53a);
            map.put("sdkVersion", this.f38034b);
            this.f38033a.sendCustomHit(this.f53a + lg.a.f131412e + str, j10, map);
        } catch (Exception e10) {
            e10.printStackTrace();
        }
    }

    public void sendCustomHit(String str, Map<String, String> map) {
        sendCustomHit(str, 0L, map);
    }

    public void setGlobalProperty(String str, String str2) {
        if (TextUtils.isEmpty(str) || str2 == null) {
            Log.e("AlicloudTracker", "key is null or key is empty or value is null,please check it!");
            return;
        }
        if (this.f54a.containsKey(str)) {
            this.f54a.remove(str);
        }
        this.f54a.put(str, str2);
    }
}
