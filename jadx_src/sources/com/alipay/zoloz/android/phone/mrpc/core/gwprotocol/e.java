package com.alipay.zoloz.android.phone.mrpc.core.gwprotocol;

import android.util.Log;
import com.alipay.zoloz.mobile.common.rpc.RpcException;
import java.util.ArrayList;
import okhttp3.t;
import org.apache.http.client.utils.URLEncodedUtils;
import org.apache.http.message.BasicNameValuePair;

/* JADX INFO: compiled from: JsonSerializer.java */
/* JADX INFO: loaded from: classes6.dex */
public class e extends b {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final String f39691e = "1.0.0";

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private static final String f39692f = "JsonSerializer";

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private int f39693c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private Object f39694d;

    public e(int i10, String str, Object obj) {
        super(str, obj);
        this.f39693c = i10;
    }

    @Override // com.alipay.zoloz.android.phone.mrpc.core.gwprotocol.f
    public void a(Object obj) {
        this.f39694d = obj;
    }

    @Override // com.alipay.zoloz.android.phone.mrpc.core.gwprotocol.f
    public byte[] b() throws RpcException {
        try {
            ArrayList arrayList = new ArrayList();
            if (this.f39694d != null) {
                arrayList.add(new BasicNameValuePair("extParam", l6.a.d(this.f39694d)));
            }
            arrayList.add(new BasicNameValuePair("operationType", this.f39689a));
            arrayList.add(new BasicNameValuePair("id", this.f39693c + ""));
            Log.d(f39692f, "mParams is:" + this.f39690b);
            Object obj = this.f39690b;
            arrayList.add(new BasicNameValuePair("requestData", obj == null ? t.f132643o : l6.a.d(obj)));
            String str = URLEncodedUtils.format(arrayList, "utf-8");
            Log.i(f39692f, "request = " + str);
            return str.getBytes();
        } catch (Exception e10) {
            StringBuilder sb2 = new StringBuilder();
            sb2.append("request  =");
            sb2.append(this.f39690b);
            sb2.append(":");
            sb2.append(e10);
            throw new RpcException(9, sb2.toString() != null ? e10.getMessage() : "", e10);
        }
    }

    public int c() {
        return this.f39693c;
    }

    public void d(int i10) {
        this.f39693c = i10;
    }
}
