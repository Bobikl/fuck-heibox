package com.umeng.pagesdk;

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
public class PageConfigManger {
    public static final String APM_FPSPERF_COLLECT_INTERVAL = "apm_pageperf_collect_interval";
    public static final String APM_FPSPERF_COLLECT_INTERVAL_TOGETHER = "apm_pageperf_collect_interval_together";
    public static final String APM_FPSPERF_COLLECT_MAX_PERIOD_SEC = "apm_pageperf_collect_max_period_sec";

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private Context f105944b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private EfsReporter f105945c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private int f105946d;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private int f105948f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private boolean f105949g;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final String f105943a = "PageConfigManager";

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final int f105947e = 0;

    public PageConfigManger(Context context, EfsReporter efsReporter) {
        SharedPreferences.Editor editorEdit;
        SharedPreferences.Editor editorEdit2;
        SharedPreferences.Editor editorEdit3;
        SharedPreferences.Editor editorEdit4;
        SharedPreferences.Editor editorEdit5;
        this.f105946d = 100;
        this.f105949g = false;
        Context applicationContext = context.getApplicationContext();
        this.f105944b = applicationContext;
        this.f105945c = efsReporter;
        SharedPreferences sharedPreferences = applicationContext.getSharedPreferences("efs_page", 0);
        if (sharedPreferences != null) {
            this.f105948f = sharedPreferences.getInt("apm_pageperf_sampling_rate_last", 0);
        }
        SharedPreferences sharedPreferences2 = this.f105944b.getSharedPreferences("efs_page", 0);
        int i10 = sharedPreferences2 != null ? sharedPreferences2.getInt("apm_pageperf_sampling_rate", -1) : -1;
        this.f105945c.getAllSdkConfig(new String[]{"apm_pageperf_sampling_rate", APM_FPSPERF_COLLECT_INTERVAL, APM_FPSPERF_COLLECT_INTERVAL_TOGETHER, APM_FPSPERF_COLLECT_MAX_PERIOD_SEC}, new IConfigCallback() { // from class: com.umeng.pagesdk.PageConfigManger.1
            @Override // com.efs.sdk.base.observer.IConfigCallback
            public final void onChange(Map<String, Object> map) {
                SharedPreferences.Editor editorEdit6;
                try {
                    SharedPreferences sharedPreferences3 = PageConfigManger.this.f105944b.getSharedPreferences("efs_page", 0);
                    if (sharedPreferences3 == null || (editorEdit6 = sharedPreferences3.edit()) == null || map == null) {
                        return;
                    }
                    Object obj = map.get("apm_pageperf_sampling_rate");
                    if (obj != null) {
                        editorEdit6.putInt("apm_pageperf_sampling_rate", Integer.parseInt(obj.toString()));
                    }
                    Object obj2 = map.get(PageConfigManger.APM_FPSPERF_COLLECT_INTERVAL);
                    if (obj2 != null) {
                        editorEdit6.putFloat(PageConfigManger.APM_FPSPERF_COLLECT_INTERVAL, Float.parseFloat(obj2.toString()) * 1000.0f);
                    }
                    Object obj3 = map.get(PageConfigManger.APM_FPSPERF_COLLECT_INTERVAL_TOGETHER);
                    if (obj3 != null) {
                        editorEdit6.putInt(PageConfigManger.APM_FPSPERF_COLLECT_INTERVAL_TOGETHER, Integer.parseInt(obj3.toString()));
                    }
                    Object obj4 = map.get(PageConfigManger.APM_FPSPERF_COLLECT_MAX_PERIOD_SEC);
                    if (obj4 != null) {
                        editorEdit6.putLong(PageConfigManger.APM_FPSPERF_COLLECT_MAX_PERIOD_SEC, Long.parseLong(obj4.toString()) * 1000);
                    }
                    editorEdit6.commit();
                } catch (Throwable th2) {
                    th2.printStackTrace();
                }
            }
        });
        if (i10 != -1) {
            this.f105946d = i10;
        }
        boolean z10 = true;
        if (!SamplingWhiteListUtil.isHitWL()) {
            SharedPreferences sharedPreferences3 = this.f105944b.getSharedPreferences("efs_page", 0);
            long j10 = sharedPreferences3 != null ? sharedPreferences3.getLong(ConfigManager.FLAG_PA_FORE_CHECK_TIME, 0L) : 0L;
            boolean z11 = sharedPreferences3 != null ? sharedPreferences3.getBoolean(ConfigManager.FLAG_PA_CHECK_IN_STATE, false) : false;
            int i11 = this.f105946d;
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
                boolean z12 = i11 != this.f105948f;
                Long lValueOf = Long.valueOf(j10);
                int i12 = this.f105946d;
                Long lValueOf2 = Long.valueOf(System.currentTimeMillis());
                Long lValueOf3 = Long.valueOf(lValueOf2.longValue() - lValueOf.longValue());
                if (!z11 || lValueOf3.longValue() >= 86400000 || z12) {
                    if (lValueOf3.longValue() >= 86400000 || z12) {
                        if (!(i12 != 0 && (i12 == 100 || new Random().nextInt(100) <= i12))) {
                            if (PageManger.isDebug) {
                                Log.d("PageConfigManager", "check in page rate. random not check in!");
                            }
                            z10 = false;
                        } else if (PageManger.isDebug) {
                            Log.d("PageConfigManager", "check in page rate. random check in");
                        }
                        SharedPreferences sharedPreferences4 = this.f105944b.getSharedPreferences("efs_page", 0);
                        if (sharedPreferences4 != null && (editorEdit3 = sharedPreferences4.edit()) != null) {
                            editorEdit3.putBoolean(ConfigManager.FLAG_PA_CHECK_IN_STATE, z10);
                            editorEdit3.commit();
                        }
                        if (sharedPreferences4 != null && (editorEdit2 = sharedPreferences4.edit()) != null) {
                            editorEdit2.putLong(ConfigManager.FLAG_PA_FORE_CHECK_TIME, lValueOf2.longValue());
                            editorEdit2.commit();
                        }
                    } else if (PageManger.isDebug) {
                        Log.d("PageConfigManager", "check in page rate. un repeat check in 24 hour!");
                    }
                } else if (PageManger.isDebug) {
                    Log.d("PageConfigManager", "check in page rate. check in allready.");
                }
            }
            z10 = false;
        }
        this.f105949g = z10;
        SharedPreferences sharedPreferences5 = this.f105944b.getSharedPreferences("efs_page", 0);
        if (sharedPreferences5 == null || (editorEdit = sharedPreferences5.edit()) == null) {
            return;
        }
        editorEdit.putInt("apm_pageperf_sampling_rate_last", this.f105946d);
        editorEdit.commit();
    }

    public boolean enableTracer() {
        return this.f105949g;
    }
}
