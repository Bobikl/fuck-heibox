package com.alipay.android.phone.mrpc.core.a;

import com.alipay.android.phone.mrpc.core.RpcException;
import com.max.xiaoheihe.module.search.SearchHelper;
import java.lang.reflect.Type;
import org.json.JSONObject;
import z5.j;

/* JADX INFO: loaded from: classes6.dex */
public final class d extends a {
    public d(Type type, byte[] bArr) {
        super(type, bArr);
    }

    @Override // com.alipay.android.phone.mrpc.core.a.c
    public final Object a() {
        try {
            String str = new String(this.f38078b);
            Thread.currentThread().getId();
            JSONObject jSONObject = new JSONObject(str);
            int i10 = jSONObject.getInt(j.f141892a);
            if (i10 == 1000) {
                return this.f38077a == String.class ? jSONObject.optString("result") : v4.e.b(jSONObject.optString("result"), this.f38077a);
            }
            throw new RpcException(Integer.valueOf(i10), jSONObject.optString(SearchHelper.f91592t));
        } catch (Exception e10) {
            StringBuilder sb2 = new StringBuilder("response  =");
            sb2.append(new String(this.f38078b));
            sb2.append(":");
            sb2.append(e10);
            throw new RpcException((Integer) 10, sb2.toString() == null ? "" : e10.getMessage());
        }
    }
}
