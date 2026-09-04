package com.sina.weibo.sdk.net;

import android.text.TextUtils;
import com.huawei.hms.framework.common.ContainerUtils;
import java.io.UnsupportedEncodingException;
import java.net.URLEncoder;
import java.util.HashMap;

/* JADX INFO: loaded from: classes8.dex */
public final class h {

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    private HashMap<String, String> f96839q = new HashMap<>();

    public final String g() {
        StringBuilder sb2 = new StringBuilder();
        boolean z10 = true;
        for (String str : this.f96839q.keySet()) {
            if (z10) {
                z10 = false;
            } else {
                sb2.append("&");
            }
            String str2 = this.f96839q.get(str);
            if (!TextUtils.isEmpty(str2)) {
                try {
                    sb2.append(URLEncoder.encode(str, "UTF-8"));
                    sb2.append(ContainerUtils.KEY_VALUE_DELIMITER);
                    sb2.append(URLEncoder.encode(str2, "UTF-8"));
                } catch (UnsupportedEncodingException e10) {
                    e10.printStackTrace();
                }
            }
        }
        return sb2.toString();
    }

    public final void put(String str, String str2) {
        this.f96839q.put(str, str2);
    }
}
