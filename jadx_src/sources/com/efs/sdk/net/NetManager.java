package com.efs.sdk.net;

import android.content.Context;
import com.efs.sdk.base.EfsReporter;
import com.efs.sdk.base.core.util.Log;
import com.huawei.hms.framework.common.ContainerUtils;
import java.util.Map;
import okhttp3.a0;
import okhttp3.b0;
import okhttp3.f;
import okhttp3.v;
import okhttp3.z;

/* JADX INFO: loaded from: classes6.dex */
public class NetManager {
    private static final String TAG = "OkHttpManager";
    private static NetConfigManager mNetConfigManager;
    private static EfsReporter mReporter;

    public static void get(String str, f fVar) {
        new z.a().s(OkHttpListener.get()).d(new OkHttpInterceptor()).f().a(new a0.a().B(str).b()).enqueue(fVar);
    }

    public static NetConfigManager getNetConfigManager() {
        return mNetConfigManager;
    }

    public static EfsReporter getReporter() {
        return mReporter;
    }

    public static void init(Context context, EfsReporter efsReporter) {
        if (context == null || efsReporter == null) {
            Log.e(TAG, "init net manager error! parameter is null!");
        } else {
            mReporter = efsReporter;
            mNetConfigManager = new NetConfigManager(context, efsReporter);
        }
    }

    public static void post(String str, Map<String, Object> map, f fVar) {
        StringBuilder sb2 = new StringBuilder();
        for (String str2 : map.keySet()) {
            sb2.append(str2);
            sb2.append(ContainerUtils.KEY_VALUE_DELIMITER);
            sb2.append(map.get(str2));
            sb2.append("&");
        }
        new z.a().s(OkHttpListener.get()).d(new OkHttpInterceptor()).f().a(new a0.a().B(str).r(b0.create(v.j("application/x-www-form-urlencoded"), sb2.toString())).b()).enqueue(fVar);
    }
}
