package com.alipay.deviceid;

import android.content.Context;
import com.alipay.deviceid.module.senative.DeviceIdUtil;
import com.alipay.deviceid.module.x.a;
import com.alipay.deviceid.module.x.b;
import com.alipay.deviceid.module.x.bw;
import com.alipay.deviceid.module.x.bx;
import com.alipay.deviceid.module.x.c;
import com.alipay.deviceid.module.x.ca;
import com.alipay.deviceid.module.x.e;
import java.util.HashMap;
import java.util.concurrent.atomic.AtomicBoolean;

/* JADX INFO: loaded from: classes6.dex */
public class DeviceTokenClient {
    private static String appKeyClientCache = "";
    private static String appNameCache = "";
    private static DeviceTokenClient deviceTokenClientInstance;
    private Context context;
    private AtomicBoolean isRepInitializing = new AtomicBoolean(false);

    public interface InitResultListener {
        void onResult(String str, int i10);
    }

    public static class TokenResult {
        public String apdid;
        public String apdidToken;
        public String clientKey;
    }

    private DeviceTokenClient(Context context) {
        this.context = null;
        if (context == null) {
            throw new IllegalArgumentException("DeviceTokenClient initialization error: context is null.");
        }
        this.context = context;
    }

    public static DeviceTokenClient getInstance(Context context) {
        if (deviceTokenClientInstance == null) {
            synchronized (DeviceTokenClient.class) {
                if (deviceTokenClientInstance == null) {
                    deviceTokenClientInstance = new DeviceTokenClient(context);
                }
            }
        }
        return deviceTokenClientInstance;
    }

    private void initializeSo() {
        if (this.isRepInitializing.getAndSet(true)) {
            return;
        }
        new Thread(new Runnable() { // from class: com.alipay.deviceid.DeviceTokenClient.1
            @Override // java.lang.Runnable
            public final void run() {
                DeviceIdUtil.getInstance(DeviceTokenClient.this.context).initialize();
            }
        }).start();
    }

    public static void setEnvConfig(int i10) {
        c.a().f38334a = i10;
    }

    public static void setGatewayAddress(String str) {
        b.f38293a = str;
    }

    public String getExactID(Context context) {
        if (context == null) {
            return null;
        }
        try {
            return bx.b(context);
        } catch (Throwable unused) {
            return "";
        }
    }

    public TokenResult getTokenResult() {
        TokenResult tokenResult = new TokenResult();
        tokenResult.apdid = "";
        tokenResult.clientKey = "";
        tokenResult.apdidToken = "";
        String strB = bw.b(this.context, appNameCache);
        tokenResult.apdidToken = strB;
        if (strB != null && !"".equals(strB)) {
            return tokenResult;
        }
        String strB2 = bw.b(this.context, "public");
        tokenResult.apdidToken = strB2;
        if (strB2 != null && !"".equals(strB2)) {
            return tokenResult;
        }
        String str = appNameCache;
        if (str == null || appKeyClientCache == null || "".equals(str) || "".equals(appKeyClientCache)) {
            tokenResult.apdidToken = "";
            return tokenResult;
        }
        initToken(appNameCache, appKeyClientCache, new InitResultListener() { // from class: com.alipay.deviceid.DeviceTokenClient.3
            @Override // com.alipay.deviceid.DeviceTokenClient.InitResultListener
            public final void onResult(String str2, int i10) {
            }
        });
        return tokenResult;
    }

    public void initToken(final String str, String str2, final InitResultListener initResultListener) {
        initializeSo();
        if (e.a(str)) {
            if (initResultListener != null) {
                initResultListener.onResult("", 2);
            }
        } else {
            if (e.a(str2)) {
                if (initResultListener != null) {
                    initResultListener.onResult("", 3);
                    return;
                }
                return;
            }
            appKeyClientCache = str2;
            appNameCache = str;
            final HashMap map = new HashMap();
            map.put("appName", str);
            map.put("appKeyClient", str2);
            map.put("rpcVersion", "6");
            map.put("appchannel", "openapi");
            ca.a().a(new Runnable() { // from class: com.alipay.deviceid.DeviceTokenClient.2
                @Override // java.lang.Runnable
                public final void run() {
                    int iA = new a(DeviceTokenClient.this.context).a(map);
                    InitResultListener initResultListener2 = initResultListener;
                    if (initResultListener2 == null) {
                        return;
                    }
                    if (iA != 0) {
                        initResultListener2.onResult("", iA);
                    } else {
                        initResultListener.onResult(a.a(DeviceTokenClient.this.context, str), 0);
                    }
                }
            });
        }
    }
}
