package com.vivo.push.cache;

import android.content.Context;
import android.text.TextUtils;
import android.util.Base64;
import com.vivo.push.util.f;
import com.vivo.push.util.p;
import com.vivo.push.util.z;
import com.xiaomi.mipush.sdk.Constants;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: compiled from: AppConfigSettings.java */
/* JADX INFO: loaded from: classes4.dex */
public final class a extends c<com.vivo.push.model.a> {
    public a(Context context) {
        super(context);
    }

    public static boolean a(int i10) {
        if (i10 != -1) {
            return (i10 & 1) != 0;
        }
        return z.b("persist.sys.log.ctrl", "no").equals("yes");
    }

    @Override // com.vivo.push.cache.c
    protected final String a() {
        return "com.vivo.pushservice.back_up";
    }

    @Override // com.vivo.push.cache.c
    public final List<com.vivo.push.model.a> a(String str) {
        if (TextUtils.isEmpty(str)) {
            return null;
        }
        ArrayList arrayList = new ArrayList();
        if (!TextUtils.isEmpty(str)) {
            for (String str2 : str.trim().split("@#")) {
                String strTrim = str2.trim();
                String[] strArrSplit = strTrim.trim().split(Constants.ACCEPT_TIME_SEPARATOR_SP);
                if (strArrSplit.length >= 2) {
                    try {
                        String str3 = strArrSplit[0];
                        arrayList.add(new com.vivo.push.model.a(str3, strTrim.substring(str3.length() + 1)));
                    } catch (Exception e10) {
                        p.d("AppConfigSettings", "str2Clients E: ".concat(String.valueOf(e10)));
                    }
                }
            }
        }
        return arrayList;
    }

    public final int b() {
        com.vivo.push.model.a aVarC = c("push_mode");
        if (aVarC != null && !TextUtils.isEmpty(aVarC.b())) {
            try {
                return Integer.parseInt(aVarC.b());
            } catch (Exception unused) {
            }
        }
        return -1;
    }

    @Override // com.vivo.push.cache.c
    final String b(String str) throws Exception {
        return new String(f.a(f.a(e()), f.a(f()), Base64.decode(str, 2)), "utf-8");
    }

    public final com.vivo.push.model.a c(String str) {
        synchronized (c.f106521a) {
            for (T t10 : this.f106522b) {
                if (!TextUtils.isEmpty(t10.a()) && t10.a().equals(str)) {
                    return t10;
                }
            }
            return null;
        }
    }
}
