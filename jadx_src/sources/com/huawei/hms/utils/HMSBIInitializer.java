package com.huawei.hms.utils;

import android.content.Context;
import android.os.AsyncTask;
import android.text.TextUtils;
import com.huawei.hianalytics.process.HiAnalyticsConfig;
import com.huawei.hianalytics.process.HiAnalyticsInstance;
import com.huawei.hianalytics.process.HiAnalyticsManager;
import com.huawei.hms.framework.network.grs.GrsApp;
import com.huawei.hms.framework.network.grs.GrsBaseInfo;
import com.huawei.hms.framework.network.grs.GrsClient;
import com.huawei.hms.framework.network.grs.IQueryUrlCallBack;
import com.huawei.hms.hatool.HmsHiAnalyticsUtils;
import com.huawei.hms.stats.c;
import com.huawei.hms.support.hianalytics.HiAnalyticsConstant;
import com.huawei.hms.support.log.HMSLog;
import java.util.Locale;
import java.util.concurrent.atomic.AtomicBoolean;

/* JADX INFO: loaded from: classes7.dex */
public class HMSBIInitializer {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private static final Object f62750d = new Object();

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private static HMSBIInitializer f62751e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private static HiAnalyticsInstance f62752f;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Context f62753a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private AtomicBoolean f62754b = new AtomicBoolean(false);

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private boolean f62755c = c.a();

    public class a implements IQueryUrlCallBack {
        a() {
        }

        @Override // com.huawei.hms.framework.network.grs.IQueryUrlCallBack
        public void onCallBackFail(int i10) {
            HMSLog.e("HMSBIInitializer", "get grs failed, the errorcode is " + i10);
            HMSBIInitializer.this.f62754b.set(false);
            com.huawei.hms.stats.a.c().a();
        }

        @Override // com.huawei.hms.framework.network.grs.IQueryUrlCallBack
        public void onCallBackSuccess(String str) {
            if (!TextUtils.isEmpty(str)) {
                if (HMSBIInitializer.this.f62755c) {
                    HiAnalyticsConfig hiAnalyticsConfigBuild = new HiAnalyticsConfig.Builder().setEnableImei(false).setEnableUDID(false).setEnableSN(false).setCollectURL(str).build();
                    HiAnalyticsInstance unused = HMSBIInitializer.f62752f = new HiAnalyticsInstance.Builder(HMSBIInitializer.this.f62753a).setOperConf(hiAnalyticsConfigBuild).setMaintConf(new HiAnalyticsConfig.Builder().setEnableImei(false).setEnableUDID(false).setEnableSN(false).setCollectURL(str).build()).create(HiAnalyticsConstant.HA_SERVICE_TAG);
                    HMSBIInitializer.f62752f.setAppid("com.huawei.hwid");
                } else {
                    HmsHiAnalyticsUtils.init(HMSBIInitializer.this.f62753a, false, false, false, str, "com.huawei.hwid");
                }
                HMSLog.i("HMSBIInitializer", "BI URL acquired successfully");
            }
            HMSBIInitializer.this.f62754b.set(false);
            com.huawei.hms.stats.a.c().b();
        }
    }

    public class b extends AsyncTask<String, Integer, Void> {
        private b() {
        }

        /* synthetic */ b(HMSBIInitializer hMSBIInitializer, a aVar) {
            this();
        }

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // android.os.AsyncTask
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public Void doInBackground(String... strArr) {
            HMSBIInitializer.this.a(strArr[0]);
            return null;
        }
    }

    private HMSBIInitializer(Context context) {
        this.f62753a = context;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void a(String str) {
        HMSLog.i("HMSBIInitializer", "Start to query GRS");
        GrsBaseInfo grsBaseInfo = new GrsBaseInfo();
        grsBaseInfo.setIssueCountry(str);
        new GrsClient(this.f62753a, grsBaseInfo).ayncGetGrsUrl("com.huawei.cloud.opensdkhianalytics", "ROOTV2", new a());
    }

    public static HMSBIInitializer getInstance(Context context) {
        synchronized (f62750d) {
            if (f62751e == null) {
                Context applicationContext = context.getApplicationContext();
                if (applicationContext != null) {
                    f62751e = new HMSBIInitializer(applicationContext);
                } else {
                    f62751e = new HMSBIInitializer(context);
                }
            }
        }
        return f62751e;
    }

    public HiAnalyticsInstance getAnalyticsInstance() {
        return f62752f;
    }

    public void initBI() {
        boolean initFlag = !this.f62755c ? HmsHiAnalyticsUtils.getInitFlag() : HiAnalyticsManager.getInitFlag(HiAnalyticsConstant.HA_SERVICE_TAG);
        HMSLog.i("HMSBIInitializer", "Builder->biInitFlag :" + initFlag);
        if (initFlag || AnalyticsSwitchHolder.isAnalyticsDisabled(this.f62753a)) {
            return;
        }
        HMSLog.i("HMSBIInitializer", "Builder->biInitFlag : start initHaSDK");
        initHaSDK();
    }

    protected void initHaSDK() {
        if (this.f62754b.compareAndSet(false, true)) {
            String issueCountryCode = GrsApp.getInstance().getIssueCountryCode(this.f62753a);
            if (!TextUtils.isEmpty(issueCountryCode)) {
                issueCountryCode = issueCountryCode.toUpperCase(Locale.ENGLISH);
            }
            if (!"UNKNOWN".equalsIgnoreCase(issueCountryCode) && !TextUtils.isEmpty(issueCountryCode)) {
                new b(this, null).execute(issueCountryCode);
            } else {
                HMSLog.e("HMSBIInitializer", "Failed to get device issue country");
                this.f62754b.set(false);
            }
        }
    }

    public boolean isInit() {
        return !this.f62755c ? HmsHiAnalyticsUtils.getInitFlag() : HiAnalyticsManager.getInitFlag(HiAnalyticsConstant.HA_SERVICE_TAG);
    }
}
