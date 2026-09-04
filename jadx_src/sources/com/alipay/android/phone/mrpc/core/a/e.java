package com.alipay.android.phone.mrpc.core.a;

import com.alipay.android.phone.mrpc.core.RpcException;
import java.util.ArrayList;
import java.util.Objects;
import okhttp3.t;
import org.apache.http.client.utils.URLEncodedUtils;
import org.apache.http.message.BasicNameValuePair;

/* JADX INFO: loaded from: classes6.dex */
public final class e extends b {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public int f38081c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public Object f38082d;

    public e(int i10, String str, Object obj) {
        super(str, obj);
        this.f38081c = i10;
    }

    @Override // com.alipay.android.phone.mrpc.core.a.f
    public final void a(Object obj) {
        this.f38082d = obj;
    }

    @Override // com.alipay.android.phone.mrpc.core.a.f
    public final byte[] a() {
        try {
            ArrayList arrayList = new ArrayList();
            if (this.f38082d != null) {
                arrayList.add(new BasicNameValuePair("extParam", v4.f.a(this.f38082d)));
            }
            arrayList.add(new BasicNameValuePair("operationType", this.f38079a));
            StringBuilder sb2 = new StringBuilder();
            sb2.append(this.f38081c);
            arrayList.add(new BasicNameValuePair("id", sb2.toString()));
            Objects.toString(this.f38080b);
            Object obj = this.f38080b;
            arrayList.add(new BasicNameValuePair("requestData", obj == null ? t.f132643o : v4.f.a(obj)));
            return URLEncodedUtils.format(arrayList, "utf-8").getBytes();
        } catch (Exception e10) {
            StringBuilder sb3 = new StringBuilder("request  =");
            sb3.append(this.f38080b);
            sb3.append(":");
            sb3.append(e10);
            throw new RpcException(9, sb3.toString() == null ? "" : e10.getMessage(), e10);
        }
    }
}
