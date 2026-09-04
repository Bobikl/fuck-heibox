package com.alipay.apmobilesecuritysdk.face;

import android.content.Context;
import com.alipay.apmobilesecuritysdk.a.a;
import com.alipay.apmobilesecuritysdk.e.d;
import com.alipay.apmobilesecuritysdk.e.g;
import com.alipay.apmobilesecuritysdk.e.h;
import com.alipay.apmobilesecuritysdk.e.i;
import com.alipay.apmobilesecuritysdk.f.b;
import com.alipay.apmobilesecuritysdk.otherid.UmidSdkWrapper;
import com.alipay.apmobilesecuritysdk.otherid.UtdidWrapper;
import java.util.HashMap;
import java.util.Map;

/* JADX INFO: loaded from: classes6.dex */
public class APSecuritySdk {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static APSecuritySdk f38196a;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static Object f38197c = new Object();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public Context f38198b;

    public interface InitResultListener {
        void onResult(TokenResult tokenResult);
    }

    public class TokenResult {
        public String apdid;
        public String apdidToken;
        public String clientKey;
        public String umidToken;

        public TokenResult() {
        }
    }

    public APSecuritySdk(Context context) {
        this.f38198b = context;
    }

    public static APSecuritySdk getInstance(Context context) {
        if (f38196a == null) {
            synchronized (f38197c) {
                if (f38196a == null) {
                    f38196a = new APSecuritySdk(context);
                }
            }
        }
        return f38196a;
    }

    public static String getUtdid(Context context) {
        return UtdidWrapper.getUtdid(context);
    }

    public String getApdidToken() {
        String strA = a.a(this.f38198b, "");
        if (e6.a.c(strA)) {
            initToken(0, new HashMap(), null);
        }
        return strA;
    }

    public String getSdkName() {
        return "APPSecuritySDK-ALIPAYSDK";
    }

    public String getSdkVersion() {
        return "3.4.0.202206130311";
    }

    public synchronized TokenResult getTokenResult() {
        TokenResult tokenResult;
        tokenResult = new TokenResult();
        try {
            tokenResult.apdidToken = a.a(this.f38198b, "");
            tokenResult.clientKey = h.f(this.f38198b);
            tokenResult.apdid = a.a(this.f38198b);
            tokenResult.umidToken = UmidSdkWrapper.getSecurityToken(this.f38198b);
            if (e6.a.c(tokenResult.apdid) || e6.a.c(tokenResult.apdidToken) || e6.a.c(tokenResult.clientKey)) {
                initToken(0, new HashMap(), null);
            }
        } catch (Throwable unused) {
        }
        return tokenResult;
    }

    public void initToken(int i10, Map<String, String> map, final InitResultListener initResultListener) {
        com.alipay.apmobilesecuritysdk.b.a.a().a(i10);
        String strB = h.b(this.f38198b);
        String strC = com.alipay.apmobilesecuritysdk.b.a.a().c();
        if (e6.a.f(strB) && !e6.a.d(strB, strC)) {
            com.alipay.apmobilesecuritysdk.e.a.a(this.f38198b);
            d.a(this.f38198b);
            g.a(this.f38198b);
            i.h();
        }
        if (!e6.a.d(strB, strC)) {
            h.c(this.f38198b, strC);
        }
        String strB2 = e6.a.b(map, "utdid", "");
        String strB3 = e6.a.b(map, "tid", "");
        String strB4 = e6.a.b(map, "userId", "");
        if (e6.a.c(strB2)) {
            strB2 = UtdidWrapper.getUtdid(this.f38198b);
        }
        final HashMap map2 = new HashMap();
        map2.put("utdid", strB2);
        map2.put("tid", strB3);
        map2.put("userId", strB4);
        map2.put("appName", "");
        map2.put("appKeyClient", "");
        map2.put("appchannel", "");
        map2.put("rpcVersion", "8");
        b.a().a(new Runnable() { // from class: com.alipay.apmobilesecuritysdk.face.APSecuritySdk.1
            @Override // java.lang.Runnable
            public void run() {
                new a(APSecuritySdk.this.f38198b).a(map2);
                InitResultListener initResultListener2 = initResultListener;
                if (initResultListener2 != null) {
                    initResultListener2.onResult(APSecuritySdk.this.getTokenResult());
                }
            }
        });
    }
}
