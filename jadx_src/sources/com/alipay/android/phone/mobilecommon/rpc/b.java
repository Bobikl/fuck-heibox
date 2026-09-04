package com.alipay.android.phone.mobilecommon.rpc;

import android.content.Context;
import android.util.Log;
import com.alipay.zoloz.android.phone.mrpc.core.d;
import com.alipay.zoloz.android.phone.mrpc.core.i;
import com.alipay.zoloz.android.phone.mrpc.core.t;
import com.alipay.zoloz.android.phone.mrpc.core.w;
import com.alipay.zoloz.android.phone.mrpc.core.y;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import org.apache.http.Header;
import org.apache.http.message.BasicHeader;
import r5.e;

/* JADX INFO: compiled from: AlipayRpcService.java */
/* JADX INFO: loaded from: classes6.dex */
public class b {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static final String f38059c = "http://mobilegw.stable.alipay.net/mgw.htm";

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private static final String f38060d = "http://mobilegw.dev01.alipay.net/mgw.htm";

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private static final String f38061e = "http://mobilegw-1-64.test.alipay.net/mgw.htm";

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private static final String f38062f = "https://mobilegwpre.alipay.com/mgw.htm";

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private static final String f38063g = "https://mobilegw.alipay.com/mgw.htm";

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public static final String f38064h = "98F6BCD082047";

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public static final String f38065i = "rpc-sdk-online";

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private static final String f38066j = "AlipayRpcService";

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    protected t f38067a = new com.alipay.android.phone.mobilecommon.rpc.a(new a());

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    protected String f38068b;

    /* JADX INFO: compiled from: AlipayRpcService.java */
    public class a implements d {

        /* JADX INFO: renamed from: com.alipay.android.phone.mobilecommon.rpc.b$a$a, reason: collision with other inner class name */
        /* JADX INFO: compiled from: AlipayRpcService.java */
        public class C0292a extends w {
            C0292a() {
            }

            @Override // com.alipay.zoloz.android.phone.mrpc.core.w
            public String a() {
                Log.w(b.f38066j, "getGwUrl() : mRemoteUrl=" + b.this.f38068b);
                return b.this.f38068b;
            }

            @Override // com.alipay.zoloz.android.phone.mrpc.core.w
            public List<Header> b() {
                String str;
                ArrayList arrayList = new ArrayList();
                arrayList.add(new BasicHeader(e.f138808h, "C321516081430"));
                String strE = com.alipay.zoloz.android.net.b.g().e();
                if (strE.equals(com.alipay.face.network.a.f38782k)) {
                    str = "staging";
                } else {
                    str = strE.equals(com.alipay.face.network.a.f38784m) ? "sit" : "prod";
                }
                arrayList.add(new BasicHeader("WorkspaceId", str));
                Log.w(b.f38066j, "getHeaders() : headers=" + arrayList);
                return arrayList;
            }
        }

        a() {
        }

        @Override // com.alipay.zoloz.android.phone.mrpc.core.d
        public y d() {
            return i.k(getApplicationContext());
        }

        @Override // com.alipay.zoloz.android.phone.mrpc.core.d
        public boolean e() {
            return true;
        }

        @Override // com.alipay.zoloz.android.phone.mrpc.core.d
        public w f() {
            return new C0292a();
        }

        @Override // com.alipay.zoloz.android.phone.mrpc.core.d
        public Context getApplicationContext() {
            return com.alipay.zoloz.android.net.b.g().d();
        }

        @Override // com.alipay.zoloz.android.phone.mrpc.core.d
        public String getUrl() {
            Log.w(b.f38066j, "getUrl() : mRemoteUrl=" + b.this.f38068b);
            return b.this.f38068b;
        }
    }

    public void a(Object obj, Map<String, String> map) {
    }

    public <T> T b(Class<T> cls) {
        return (T) this.f38067a.b(cls);
    }

    public void c(String str) {
        Log.w(f38066j, "setRemoteUrl(" + str + ")");
        this.f38068b = str;
        Log.w(f38066j, "setRemoteUrl() : mRemoteUrl=" + this.f38068b);
    }
}
