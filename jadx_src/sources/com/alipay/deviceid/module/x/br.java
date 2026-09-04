package com.alipay.deviceid.module.x;

import com.alipay.deviceid.module.rpc.mrpc.core.RpcException;
import java.util.ArrayList;
import java.util.Objects;
import org.apache.http.client.utils.URLEncodedUtils;
import org.apache.http.message.BasicNameValuePair;

/* JADX INFO: compiled from: JsonSerializer.java */
/* JADX INFO: loaded from: classes6.dex */
public final class br extends bo {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private int f38321c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private Object f38322d;

    public br(int i10, String str, Object obj) {
        super(str, obj);
        this.f38321c = i10;
    }

    @Override // com.alipay.deviceid.module.x.bs
    public final void a(Object obj) {
        this.f38322d = obj;
    }

    @Override // com.alipay.deviceid.module.x.bs
    public final byte[] a() {
        try {
            ArrayList arrayList = new ArrayList();
            if (this.f38322d != null) {
                arrayList.add(new BasicNameValuePair("extParam", ag.a(this.f38322d)));
            }
            arrayList.add(new BasicNameValuePair("operationType", this.f38319a));
            StringBuilder sb2 = new StringBuilder();
            sb2.append(this.f38321c);
            arrayList.add(new BasicNameValuePair("id", sb2.toString()));
            Objects.toString(this.f38320b);
            Object obj = this.f38320b;
            arrayList.add(new BasicNameValuePair("requestData", obj == null ? okhttp3.t.f132643o : ag.a(obj)));
            return URLEncodedUtils.format(arrayList, "utf-8").getBytes();
        } catch (Exception e10) {
            StringBuilder sb3 = new StringBuilder("request  =");
            sb3.append(this.f38320b);
            sb3.append(":");
            sb3.append(e10);
            throw new RpcException(9, sb3.toString() == null ? "" : e10.getMessage(), e10);
        }
    }
}
