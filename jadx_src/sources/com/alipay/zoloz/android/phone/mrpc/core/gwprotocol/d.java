package com.alipay.zoloz.android.phone.mrpc.core.gwprotocol;

import android.util.Log;
import com.alipay.zoloz.mobile.common.rpc.RpcException;
import com.max.xiaoheihe.module.search.SearchHelper;
import java.lang.reflect.Type;
import org.json.JSONObject;
import z5.j;

/* JADX INFO: compiled from: JsonDeserializer.java */
/* JADX INFO: loaded from: classes6.dex */
public class d extends a {
    public d(Type type, byte[] bArr) {
        super(type, bArr);
    }

    @Override // com.alipay.zoloz.android.phone.mrpc.core.gwprotocol.c
    public Object m() throws RpcException {
        try {
            String str = new String(this.f39688b);
            Log.v("HttpCaller", "threadid = " + Thread.currentThread().getId() + "; rpc response:  " + str);
            JSONObject jSONObject = new JSONObject(str);
            int i10 = jSONObject.getInt(j.f141892a);
            if (i10 == 1000) {
                return this.f39687a == String.class ? jSONObject.optString("result") : l6.a.c(jSONObject.optString("result"), this.f39687a);
            }
            throw new RpcException(Integer.valueOf(i10), jSONObject.optString(SearchHelper.f91592t));
        } catch (Exception e10) {
            StringBuilder sb2 = new StringBuilder();
            sb2.append("response  =");
            sb2.append(new String(this.f39688b));
            sb2.append(":");
            sb2.append(e10);
            throw new RpcException((Integer) 10, sb2.toString() == null ? "" : e10.getMessage());
        }
    }
}
