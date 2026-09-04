package com.alipay.deviceid.module.x;

import com.alipay.deviceid.module.rpc.mrpc.core.RpcException;
import com.max.xiaoheihe.module.search.SearchHelper;
import java.lang.reflect.Type;
import org.json.JSONObject;

/* JADX INFO: compiled from: JsonDeserializer.java */
/* JADX INFO: loaded from: classes6.dex */
public final class bq extends bn {
    public bq(Type type, byte[] bArr) {
        super(type, bArr);
    }

    @Override // com.alipay.deviceid.module.x.bp
    public final Object a() {
        try {
            String str = new String(this.f38318b);
            Thread.currentThread().getId();
            JSONObject jSONObject = new JSONObject(str);
            int i10 = jSONObject.getInt(z5.j.f141892a);
            if (i10 == 1000) {
                return this.f38317a == String.class ? jSONObject.optString("result") : af.a(jSONObject.optString("result"), this.f38317a);
            }
            throw new RpcException(Integer.valueOf(i10), jSONObject.optString(SearchHelper.f91592t));
        } catch (Exception e10) {
            StringBuilder sb2 = new StringBuilder("response  =");
            sb2.append(new String(this.f38318b));
            sb2.append(":");
            sb2.append(e10);
            throw new RpcException((Integer) 10, sb2.toString() == null ? "" : e10.getMessage());
        }
    }
}
