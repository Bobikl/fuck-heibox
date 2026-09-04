package com.vivo.push.cache;

import android.content.Context;
import android.text.TextUtils;
import android.util.Base64;
import com.vivo.push.util.f;
import com.vivo.push.util.p;
import com.xiaomi.mipush.sdk.Constants;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: compiled from: PushConfigSettings.java */
/* JADX INFO: loaded from: classes4.dex */
public final class e extends c<com.vivo.push.model.a> {
    public e(Context context) {
        super(context);
    }

    @Override // com.vivo.push.cache.c
    protected final String a() {
        return "com.vivo.pushservice.other";
    }

    @Override // com.vivo.push.cache.c
    public final List<com.vivo.push.model.a> a(String str) {
        if (TextUtils.isEmpty(str)) {
            return null;
        }
        ArrayList arrayList = new ArrayList();
        for (String str2 : str.trim().split("@#")) {
            String strTrim = str2.trim();
            String[] strArrSplit = strTrim.trim().split(Constants.ACCEPT_TIME_SEPARATOR_SP);
            if (strArrSplit.length >= 2) {
                try {
                    String str3 = strArrSplit[0];
                    arrayList.add(new com.vivo.push.model.a(str3, strTrim.substring(str3.length() + 1)));
                } catch (Exception e10) {
                    p.d("PushConfigSettings", "str2Clients E: ".concat(String.valueOf(e10)));
                }
            }
        }
        return arrayList;
    }

    @Override // com.vivo.push.cache.c
    final String b(String str) throws Exception {
        return new String(f.a(f.a(e()), f.a(f()), Base64.decode(str, 2)), "utf-8");
    }

    public final String c(String str) {
        synchronized (c.f106521a) {
            for (T t10 : this.f106522b) {
                if (!TextUtils.isEmpty(t10.a()) && t10.a().equals(str)) {
                    return t10.b();
                }
            }
            return null;
        }
    }
}
