package com.tencent.ugc;

import android.content.Context;
import com.tencent.liteav.base.ContextUtils;
import com.tencent.liteav.sdk.common.LicenseChecker;
import com.tencent.ugc.datereport.UGCDataReport;

/* JADX INFO: loaded from: classes4.dex */
public class TXUGCBase {
    private static TXUGCBase sInstance;
    private static TXUGCBaseListener sListener;

    public static abstract class TXUGCBaseListener {
        public abstract void onLicenceLoaded(int i10, String str);
    }

    static {
        com.tencent.liteav.base.util.s.a();
    }

    private TXUGCBase() {
    }

    public static TXUGCBase getInstance() {
        if (sInstance == null) {
            synchronized (TXUGCBase.class) {
                if (sInstance == null) {
                    sInstance = new TXUGCBase();
                }
            }
        }
        return sInstance;
    }

    static /* synthetic */ void lambda$setLicence$0(int i10, String str) {
        TXUGCBaseListener tXUGCBaseListener = sListener;
        if (tXUGCBaseListener != null) {
            tXUGCBaseListener.onLicenceLoaded(i10, str);
        }
    }

    public static void setListener(TXUGCBaseListener tXUGCBaseListener) {
        sListener = tXUGCBaseListener;
    }

    public String callExperimentalAPI(Context context, String str) {
        ContextUtils.initApplicationContext(context.getApplicationContext());
        ContextUtils.setDataDirectorySuffix("liteav");
        return UGCBaseJni.callExperimentalAPI(str);
    }

    public String getLicenceInfo(Context context) {
        ContextUtils.initApplicationContext(context.getApplicationContext());
        ContextUtils.setDataDirectorySuffix("liteav");
        return LicenseChecker.getInstance().getLicense(LicenseChecker.c.UGC);
    }

    public void setLicence(Context context, String str, String str2) {
        ContextUtils.initApplicationContext(context.getApplicationContext());
        ContextUtils.setDataDirectorySuffix("liteav");
        LicenseChecker.getInstance().setListener(b.a());
        LicenseChecker.getInstance().setLicense(LicenseChecker.c.UGC, str, str2);
        UGCDataReport.reportDAU(1099);
    }
}
