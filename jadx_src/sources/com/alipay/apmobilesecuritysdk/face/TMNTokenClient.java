package com.alipay.apmobilesecuritysdk.face;

import android.content.Context;
import com.alipay.apmobilesecuritysdk.f.b;
import com.alipay.apmobilesecuritysdk.otherid.UtdidWrapper;
import e6.a;
import java.util.HashMap;

/* JADX INFO: loaded from: classes6.dex */
public class TMNTokenClient {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static TMNTokenClient f38203a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public Context f38204b;

    public interface InitResultListener {
        void onResult(String str, int i10);
    }

    public TMNTokenClient(Context context) {
        this.f38204b = null;
        if (context == null) {
            throw new IllegalArgumentException("TMNTokenClient initialization error: context is null.");
        }
        this.f38204b = context;
    }

    public static TMNTokenClient getInstance(Context context) {
        if (f38203a == null) {
            synchronized (TMNTokenClient.class) {
                if (f38203a == null) {
                    f38203a = new TMNTokenClient(context);
                }
            }
        }
        return f38203a;
    }

    public void intiToken(final String str, String str2, String str3, final InitResultListener initResultListener) {
        if (a.c(str) && initResultListener != null) {
            initResultListener.onResult("", 2);
        }
        if (a.c(str2) && initResultListener != null) {
            initResultListener.onResult("", 3);
        }
        final HashMap map = new HashMap();
        map.put("utdid", UtdidWrapper.getUtdid(this.f38204b));
        map.put("tid", "");
        map.put("userId", "");
        map.put("appName", str);
        map.put("appKeyClient", str2);
        map.put("appchannel", "openapi");
        map.put("sessionId", str3);
        map.put("rpcVersion", "8");
        b.a().a(new Runnable() { // from class: com.alipay.apmobilesecuritysdk.face.TMNTokenClient.1
            @Override // java.lang.Runnable
            public void run() {
                int iA = new com.alipay.apmobilesecuritysdk.a.a(TMNTokenClient.this.f38204b).a(map);
                InitResultListener initResultListener2 = initResultListener;
                if (initResultListener2 == null) {
                    return;
                }
                if (iA != 0) {
                    initResultListener2.onResult("", iA);
                } else {
                    initResultListener.onResult(com.alipay.apmobilesecuritysdk.a.a.a(TMNTokenClient.this.f38204b, str), 0);
                }
            }
        });
    }
}
