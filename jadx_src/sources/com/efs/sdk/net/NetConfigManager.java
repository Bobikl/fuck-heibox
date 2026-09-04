package com.efs.sdk.net;

import android.content.Context;
import android.content.SharedPreferences;
import com.efs.sdk.base.EfsReporter;
import com.efs.sdk.base.core.util.Log;
import com.efs.sdk.base.observer.IConfigCallback;
import com.efs.sdk.base.samplingwhitelist.SamplingWhiteListUtil;
import com.efs.sdk.pa.config.ConfigManager;
import java.util.Map;
import java.util.Random;

/* JADX INFO: loaded from: classes6.dex */
public class NetConfigManager {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final String f42670a = "NetConfigManager";

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final int f42671b = 0;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private EfsReporter f42672c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private int f42673d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private int f42674e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private boolean f42675f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private Context f42676g;

    public NetConfigManager(Context context, EfsReporter efsReporter) {
        SharedPreferences.Editor editorEdit;
        SharedPreferences.Editor editorEdit2;
        SharedPreferences.Editor editorEdit3;
        SharedPreferences.Editor editorEdit4;
        SharedPreferences.Editor editorEdit5;
        this.f42673d = 0;
        this.f42675f = false;
        Context applicationContext = context.getApplicationContext();
        this.f42676g = applicationContext;
        this.f42672c = efsReporter;
        SharedPreferences sharedPreferences = applicationContext.getSharedPreferences("net_launch", 0);
        if (sharedPreferences != null) {
            this.f42674e = sharedPreferences.getInt("apm_netperf_sampling_rate_last", 0);
        }
        SharedPreferences sharedPreferences2 = this.f42676g.getSharedPreferences("net_launch", 0);
        int i10 = sharedPreferences2 != null ? sharedPreferences2.getInt("apm_netperf_sampling_rate", -1) : -1;
        this.f42672c.getAllSdkConfig(new String[]{"apm_netperf_sampling_rate"}, new IConfigCallback() { // from class: com.efs.sdk.net.NetConfigManager.1
            @Override // com.efs.sdk.base.observer.IConfigCallback
            public final void onChange(Map<String, Object> map) {
                SharedPreferences sharedPreferences3;
                final SharedPreferences.Editor editorEdit6;
                try {
                    final Object obj = map.get("apm_netperf_sampling_rate");
                    if (obj == null || (sharedPreferences3 = NetConfigManager.this.f42676g.getSharedPreferences("net_launch", 0)) == null || (editorEdit6 = sharedPreferences3.edit()) == null) {
                        return;
                    }
                    new Thread(new Runnable() { // from class: com.efs.sdk.net.NetConfigManager.1.1
                        @Override // java.lang.Runnable
                        public final void run() {
                            editorEdit6.putInt("apm_netperf_sampling_rate", Integer.parseInt(obj.toString()));
                            editorEdit6.commit();
                        }
                    }).start();
                } catch (Throwable th2) {
                    th2.printStackTrace();
                }
            }
        });
        if (i10 != -1) {
            this.f42673d = i10;
        }
        boolean z10 = true;
        if (!SamplingWhiteListUtil.isHitWL()) {
            SharedPreferences sharedPreferences3 = this.f42676g.getSharedPreferences("net_launch", 0);
            long j10 = sharedPreferences3 != null ? sharedPreferences3.getLong(ConfigManager.FLAG_PA_FORE_CHECK_TIME, 0L) : 0L;
            boolean z11 = sharedPreferences3 != null ? sharedPreferences3.getBoolean(ConfigManager.FLAG_PA_CHECK_IN_STATE, false) : false;
            int i11 = this.f42673d;
            if (i11 == 0) {
                if (z11 && sharedPreferences3 != null && (editorEdit5 = sharedPreferences3.edit()) != null) {
                    editorEdit5.putBoolean(ConfigManager.FLAG_PA_CHECK_IN_STATE, false);
                    editorEdit5.commit();
                }
                if (j10 != 0 && sharedPreferences3 != null && (editorEdit4 = sharedPreferences3.edit()) != null) {
                    editorEdit4.putLong(ConfigManager.FLAG_PA_FORE_CHECK_TIME, 0L);
                    editorEdit4.commit();
                }
            } else {
                boolean z12 = i11 != this.f42674e;
                Long lValueOf = Long.valueOf(j10);
                int i12 = this.f42673d;
                Long lValueOf2 = Long.valueOf(System.currentTimeMillis());
                Long lValueOf3 = Long.valueOf(lValueOf2.longValue() - lValueOf.longValue());
                if (z11 && lValueOf3.longValue() < 86400000 && !z12) {
                    Log.d("NetConfigManager", " check in allready");
                } else if (lValueOf3.longValue() >= 86400000 || z12) {
                    if (i12 != 0 && (i12 == 100 || new Random().nextInt(100) <= i12)) {
                        Log.d("NetConfigManager", "random check in");
                    } else {
                        Log.d("NetConfigManager", "random not check in!");
                        z10 = false;
                    }
                    SharedPreferences sharedPreferences4 = this.f42676g.getSharedPreferences("net_launch", 0);
                    if (sharedPreferences4 != null && (editorEdit3 = sharedPreferences4.edit()) != null) {
                        editorEdit3.putBoolean(ConfigManager.FLAG_PA_CHECK_IN_STATE, z10);
                        editorEdit3.commit();
                    }
                    if (sharedPreferences4 != null && (editorEdit2 = sharedPreferences4.edit()) != null) {
                        editorEdit2.putLong(ConfigManager.FLAG_PA_FORE_CHECK_TIME, lValueOf2.longValue());
                        editorEdit2.commit();
                    }
                } else {
                    Log.d("NetConfigManager", "un repeat check in 24 hour!");
                }
            }
            z10 = false;
        }
        this.f42675f = z10;
        SharedPreferences sharedPreferences5 = this.f42676g.getSharedPreferences("net_launch", 0);
        if (sharedPreferences5 == null || (editorEdit = sharedPreferences5.edit()) == null) {
            return;
        }
        editorEdit.putInt("apm_netperf_sampling_rate_last", this.f42673d);
        editorEdit.commit();
    }

    public boolean enableTracer() {
        return this.f42675f;
    }
}
