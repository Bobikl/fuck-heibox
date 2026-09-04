package com.efs.sdk.base.core.c;

import android.content.Context;
import android.content.SharedPreferences;
import android.os.Handler;
import android.os.Message;
import android.text.TextUtils;
import androidx.annotation.n0;
import com.efs.sdk.base.core.config.GlobalInfoManager;
import com.efs.sdk.base.core.controller.ControllerCenter;
import com.efs.sdk.base.core.util.Log;
import com.efs.sdk.base.newsharedpreferences.SharedPreferencesUtils;
import java.io.File;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.atomic.AtomicInteger;

/* JADX INFO: loaded from: classes6.dex */
public class b extends Handler {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final Map<String, Long> f42440a = new HashMap<String, Long>() { // from class: com.efs.sdk.base.core.c.b.1
        {
            put("flow_5min", 300000L);
            put("flow_hour", 3600000L);
            put("flow_day", 86400000L);
        }
    };

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static final Map<String, Long> f42441b = new HashMap<String, Long>() { // from class: com.efs.sdk.base.core.c.b.2
        {
            put("flow_5min", 1048576L);
            put("flow_hour", 1048576L);
            put("flow_day", 2097152L);
        }
    };

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private Map<String, AtomicInteger> f42442c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private volatile SharedPreferences f42443d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private volatile SharedPreferences.Editor f42444e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private Context f42445f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private String f42446g;

    public static final class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private static final b f42447a = new b(0);
    }

    private b() {
        super(com.efs.sdk.base.core.util.concurrent.a.f42576a.getLooper());
        this.f42442c = new ConcurrentHashMap(5);
        this.f42445f = ControllerCenter.getGlobalEnvStruct().mAppContext;
        this.f42446g = ControllerCenter.getGlobalEnvStruct().getAppid();
        b();
        File fileC = com.efs.sdk.base.core.util.a.c(ControllerCenter.getGlobalEnvStruct().mAppContext, ControllerCenter.getGlobalEnvStruct().getAppid());
        if (fileC.exists()) {
            com.efs.sdk.base.core.util.b.b(fileC);
        }
    }

    /* synthetic */ b(byte b10) {
        this();
    }

    private static long a(Map<String, String> map, @n0 String str, @n0 String str2) {
        long jLongValue = f42441b.get(str).longValue();
        if (map == null || !map.containsKey(str2) || TextUtils.isEmpty(map.get(str2))) {
            return jLongValue;
        }
        try {
            return Long.parseLong(map.get(str2));
        } catch (Throwable th2) {
            Log.w("efs.flow", "get max flow error", th2);
            return jLongValue;
        }
    }

    public static b a() {
        return a.f42447a;
    }

    private static List<String> a(String str, String str2, String str3) {
        ArrayList arrayList = new ArrayList();
        arrayList.add(str);
        if (!TextUtils.isEmpty(str2)) {
            arrayList.add(str + lg.a.f131412e + str2);
        }
        if (!TextUtils.isEmpty(str3) && !"unknown".equalsIgnoreCase(str3)) {
            arrayList.add(str + lg.a.f131412e + str3);
        }
        if (!TextUtils.isEmpty(str2) && !TextUtils.isEmpty(str3)) {
            arrayList.add(str + lg.a.f131412e + str2 + lg.a.f131412e + str3);
        }
        return arrayList;
    }

    private void a(String str) {
        if (!this.f42442c.containsKey(str) || this.f42442c.get(str) == null || this.f42442c.get(str).get() <= 10) {
            com.efs.sdk.base.core.f.f.a.f42551a.a(com.efs.sdk.base.core.config.a.c.a().f42493d.f42483a, str);
            if (str.equals("flow_day")) {
                com.efs.sdk.base.core.f.f.a.f42551a.a(com.efs.sdk.base.core.config.a.c.a().f42493d.f42483a);
            }
            if (!this.f42442c.containsKey(str)) {
                this.f42442c.put(str, new AtomicInteger());
            }
            this.f42442c.get(str).incrementAndGet();
        }
    }

    private boolean a(@n0 String str, long j10, @n0 String str2, @n0 String str3, long j11) {
        b();
        if (this.f42443d == null) {
            Log.w("efs.flow", "sharedpreferences is null, cann't get last flow stat");
            return false;
        }
        List<String> listA = a(str, str2, str3);
        Map<String, String> mapC = com.efs.sdk.base.core.config.a.c.a().c();
        for (String str4 : listA) {
            if (Math.abs(System.currentTimeMillis() - this.f42443d.getLong("curr_time_".concat(String.valueOf(str)), System.currentTimeMillis())) > j10) {
                Message messageObtain = Message.obtain();
                messageObtain.what = 1;
                messageObtain.obj = str;
                messageObtain.arg1 = Long.valueOf(j10).intValue();
                sendMessage(messageObtain);
            }
            long jA = a(mapC, str, str4);
            long j12 = this.f42443d.getLong(str4, 0L);
            if (j12 + j11 > jA) {
                Log.i("efs.flow", "flow limit, key: " + str4 + ", max: " + jA + ", now: " + j12 + ", size: " + j11);
                a(str4);
                return false;
            }
        }
        return true;
    }

    private void b() {
        try {
            c();
        } catch (Throwable th2) {
            Log.e("efs.flow", "init sharedpreferences error", th2);
        }
    }

    private void c() {
        if (this.f42443d == null) {
            synchronized (b.class) {
                if (this.f42443d == null) {
                    this.f42443d = SharedPreferencesUtils.getSharedPreferences(this.f42445f, this.f42446g.toLowerCase() + "_flow");
                }
            }
        }
        if (this.f42444e == null) {
            synchronized (b.class) {
                if (this.f42444e == null) {
                    this.f42444e = this.f42443d.edit();
                }
            }
        }
    }

    public final boolean a(@n0 String str, long j10) {
        String netStatus = GlobalInfoManager.getInstance().getNetStatus();
        boolean zA = true;
        for (Map.Entry<String, Long> entry : f42440a.entrySet()) {
            zA = a(entry.getKey(), entry.getValue().longValue(), str, netStatus, j10);
            if (!zA) {
                break;
            }
        }
        return zA;
    }

    @Override // android.os.Handler
    public void handleMessage(@n0 Message message) {
        super.handleMessage(message);
        int i10 = message.what;
        if (i10 == 0) {
            b();
            if (this.f42443d == null) {
                Log.w("efs.flow", "sharedpreferences is null, cann't get last flow stat");
                return;
            }
            if (this.f42444e == null) {
                Log.w("efs.flow", "sharedpreferences editor is null, cann't refresh flow stat");
                return;
            }
            String strValueOf = String.valueOf(message.obj);
            long j10 = message.arg1;
            String netStatus = GlobalInfoManager.getInstance().getNetStatus();
            for (String str : f42440a.keySet()) {
                String strConcat = "curr_time_".concat(String.valueOf(str));
                if (!this.f42443d.contains(strConcat)) {
                    this.f42444e.putLong(strConcat, System.currentTimeMillis());
                }
                for (String str2 : a(str, strValueOf, netStatus)) {
                    this.f42444e.putLong(str2, this.f42443d.getLong(str2, 0L) + j10);
                }
            }
            this.f42444e.apply();
            return;
        }
        if (i10 != 1) {
            Log.w("efs.flow", "flow stat listener not support action '" + message.what + "'");
            return;
        }
        String strValueOf2 = String.valueOf(message.obj);
        long j11 = message.arg1;
        b();
        if (this.f42443d == null) {
            Log.w("efs.flow", "sharedpreferences is null, cann't get last refresh timestamp");
            return;
        }
        if (this.f42444e == null) {
            Log.w("efs.flow", "sharedpreferences editor is null, cann't refresh timestamp");
            return;
        }
        String strConcat2 = "curr_time_".concat(strValueOf2);
        if (Math.abs(System.currentTimeMillis() - this.f42443d.getLong(strConcat2, System.currentTimeMillis())) >= j11) {
            for (String str3 : this.f42443d.getAll().keySet()) {
                if (str3.startsWith(strValueOf2)) {
                    this.f42444e.putLong(str3, 0L);
                }
            }
            this.f42444e.putLong(strConcat2, System.currentTimeMillis());
            this.f42444e.apply();
            this.f42442c.clear();
        }
    }
}
