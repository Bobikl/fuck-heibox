package com.umeng.powersdk;

import android.content.Context;
import android.content.SharedPreferences;
import android.util.Log;
import com.efs.sdk.base.EfsReporter;
import com.efs.sdk.base.observer.IConfigCallback;
import com.efs.sdk.base.samplingwhitelist.SamplingWhiteListUtil;
import com.efs.sdk.pa.config.ConfigManager;
import java.util.Map;
import java.util.Random;

/* JADX INFO: loaded from: classes4.dex */
public class PowerConfigManager {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private Context f105986b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private EfsReporter f105987c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private int f105988d;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private int f105990f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private boolean f105991g;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final String f105985a = "PageConfigManager";

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final int f105989e = 0;

    public PowerConfigManager(Context context, EfsReporter efsReporter) {
        SharedPreferences.Editor editorEdit;
        SharedPreferences.Editor editorEdit2;
        SharedPreferences.Editor editorEdit3;
        SharedPreferences.Editor editorEdit4;
        SharedPreferences.Editor editorEdit5;
        this.f105988d = 100;
        this.f105991g = false;
        Context applicationContext = context.getApplicationContext();
        this.f105986b = applicationContext;
        this.f105987c = efsReporter;
        SharedPreferences sharedPreferences = applicationContext.getSharedPreferences("efs_power", 0);
        if (sharedPreferences != null) {
            this.f105990f = sharedPreferences.getInt("apm_powerperf_sampling_rate_last", 0);
        }
        SharedPreferences sharedPreferences2 = this.f105986b.getSharedPreferences("efs_power", 0);
        int i10 = sharedPreferences2 != null ? sharedPreferences2.getInt("apm_powerperf_sampling_rate", -1) : -1;
        this.f105987c.getAllSdkConfig(new String[]{"apm_powerperf_sampling_rate", "apm_powerperf_collect_interval", "apm_powerperf_collect_max_period_sec"}, new IConfigCallback() { // from class: com.umeng.powersdk.PowerConfigManager.1
            @Override // com.efs.sdk.base.observer.IConfigCallback
            public final void onChange(Map<String, Object> map) {
                SharedPreferences.Editor editorEdit6;
                try {
                    SharedPreferences sharedPreferences3 = PowerConfigManager.this.f105986b.getSharedPreferences("efs_power", 0);
                    if (sharedPreferences3 == null || (editorEdit6 = sharedPreferences3.edit()) == null || map == null) {
                        return;
                    }
                    Object obj = map.get("apm_powerperf_sampling_rate");
                    if (obj != null) {
                        editorEdit6.putInt("apm_powerperf_sampling_rate", Integer.parseInt(obj.toString()));
                    }
                    Object obj2 = map.get("apm_powerperf_collect_interval");
                    if (obj2 != null) {
                        editorEdit6.putInt("apm_powerperf_collect_interval", Integer.parseInt(obj2.toString()));
                    }
                    Object obj3 = map.get("apm_powerperf_collect_max_period_sec");
                    if (obj3 != null) {
                        editorEdit6.putInt("apm_powerperf_collect_max_period_sec", Integer.parseInt(obj3.toString()));
                    }
                    editorEdit6.apply();
                } catch (Throwable th2) {
                    th2.printStackTrace();
                }
            }
        });
        if (i10 != -1) {
            this.f105988d = i10;
        }
        boolean z10 = true;
        if (!SamplingWhiteListUtil.isHitWL()) {
            SharedPreferences sharedPreferences3 = this.f105986b.getSharedPreferences("efs_power", 0);
            long j10 = sharedPreferences3 != null ? sharedPreferences3.getLong(ConfigManager.FLAG_PA_FORE_CHECK_TIME, 0L) : 0L;
            boolean z11 = sharedPreferences3 != null ? sharedPreferences3.getBoolean(ConfigManager.FLAG_PA_CHECK_IN_STATE, false) : false;
            int i11 = this.f105988d;
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
                boolean z12 = i11 != this.f105990f;
                Long lValueOf = Long.valueOf(j10);
                int i12 = this.f105988d;
                Long lValueOf2 = Long.valueOf(System.currentTimeMillis());
                Long lValueOf3 = Long.valueOf(lValueOf2.longValue() - lValueOf.longValue());
                if (!z11 || lValueOf3.longValue() >= 86400000 || z12) {
                    if (lValueOf3.longValue() >= 86400000 || z12) {
                        if (!(i12 != 0 && (i12 == 100 || new Random().nextInt(100) <= i12))) {
                            if (PowerManager.isDebug) {
                                Log.d("PageConfigManager", "check in page rate. random not check in!");
                            }
                            z10 = false;
                        } else if (PowerManager.isDebug) {
                            Log.d("PageConfigManager", "check in page rate. random check in");
                        }
                        SharedPreferences sharedPreferences4 = this.f105986b.getSharedPreferences("efs_power", 0);
                        if (sharedPreferences4 != null && (editorEdit3 = sharedPreferences4.edit()) != null) {
                            editorEdit3.putBoolean(ConfigManager.FLAG_PA_CHECK_IN_STATE, z10);
                            editorEdit3.apply();
                        }
                        if (sharedPreferences4 != null && (editorEdit2 = sharedPreferences4.edit()) != null) {
                            editorEdit2.putLong(ConfigManager.FLAG_PA_FORE_CHECK_TIME, lValueOf2.longValue());
                            editorEdit2.apply();
                        }
                    } else if (PowerManager.isDebug) {
                        Log.d("PageConfigManager", "check in page rate. un repeat check in 24 hour!");
                    }
                } else if (PowerManager.isDebug) {
                    Log.d("PageConfigManager", "check in page rate. check in allready.");
                }
            }
            z10 = false;
        }
        this.f105991g = z10;
        SharedPreferences sharedPreferences5 = this.f105986b.getSharedPreferences("efs_power", 0);
        if (sharedPreferences5 == null || (editorEdit = sharedPreferences5.edit()) == null) {
            return;
        }
        editorEdit.putInt("apm_powerperf_sampling_rate_last", this.f105988d);
        editorEdit.apply();
    }

    public boolean enableTracer() {
        return this.f105991g;
    }
}
