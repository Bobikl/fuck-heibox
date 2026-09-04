package com.tencent.rtmp;

import android.content.Context;
import com.tencent.liteav.LiveSettingJni;
import com.tencent.liteav.base.ContextUtils;
import com.tencent.liteav.base.system.LiteavSystemInfo;
import com.tencent.liteav.base.util.CommonUtil;
import com.tencent.liteav.base.util.HttpDnsUtil;
import com.tencent.liteav.base.util.LiteavLog;
import com.tencent.liteav.base.util.s;
import com.tencent.liteav.sdk.common.LicenseChecker;
import java.util.List;

/* JADX INFO: loaded from: classes4.dex */
public class TXLiveBase {
    private static final String TAG = "TXLiveBase";
    private static TXLiveBase instance = new TXLiveBase();
    private static b networkTimeCallback = new b(0);
    private static TXLiveBaseListener sListener;

    public static final class a implements LiteavLog.a {
        private a() {
        }

        /* synthetic */ a(byte b10) {
            this();
        }

        @Override // com.tencent.liteav.base.util.LiteavLog.a
        public final void a(int i10, String str, String str2) {
            TXLiveBaseListener tXLiveBaseListener = TXLiveBase.sListener;
            if (tXLiveBaseListener != null) {
                tXLiveBaseListener.onLog(i10, str, str2);
            }
        }
    }

    public static final class b implements CommonUtil.a {
        private b() {
        }

        /* synthetic */ b(byte b10) {
            this();
        }

        @Override // com.tencent.liteav.base.util.CommonUtil.a
        public final void a(int i10, String str) {
            TXLiveBase.onUpdateNetworkTime(i10, str);
        }
    }

    static {
        if (s.a()) {
            CommonUtil.setUpdateNetworkTimeCallback(networkTimeCallback);
        }
    }

    private TXLiveBase() {
    }

    public static void enableCustomHttpDNS(boolean z10) {
        if (z10) {
            HttpDnsUtil.enableCustomHttpDNS(true, new HttpDnsUtil.a() { // from class: com.tencent.rtmp.TXLiveBase.2
                @Override // com.tencent.liteav.base.util.HttpDnsUtil.a
                public final void a(String str, List<String> list) {
                    if (TXLiveBase.sListener != null) {
                        TXLiveBase.sListener.onCustomHttpDNS(str, list);
                    }
                }
            });
        } else {
            HttpDnsUtil.enableCustomHttpDNS(false, null);
        }
    }

    public static TXLiveBase getInstance() {
        return instance;
    }

    public static long getNetworkTimestamp() {
        return CommonUtil.getNetworkTimestamp();
    }

    public static String getPituSDKVersion() {
        return "";
    }

    public static String getSDKVersionStr() {
        return CommonUtil.getSDKVersionStr();
    }

    public static boolean isLibraryPathValid(String str) {
        return false;
    }

    public static void onUpdateNetworkTime(int i10, String str) {
        TXLiveBaseListener tXLiveBaseListener = sListener;
        if (tXLiveBaseListener != null) {
            tXLiveBaseListener.onUpdateNetworkTime(i10, str);
        }
    }

    public static void setAppID(String str) {
        LiveSettingJni.setAppId(str);
    }

    public static void setAppVersion(String str) {
        LiteavLog.i(TAG, "Set app version:".concat(String.valueOf(str)));
        LiveSettingJni.setAppVersion(str);
    }

    public static void setConsoleEnabled(boolean z10) {
        LiteavLog.nativeSetConsoleLogEnabled(z10);
    }

    public static boolean setExtID(String str, String str2) {
        return LiteavSystemInfo.setExtID(str, str2);
    }

    public static int setGlobalEnv(String str) {
        return CommonUtil.setGlobalEnv(str);
    }

    public static boolean setLibraryPath(String str) {
        s.b(str);
        boolean zA = s.a();
        if (zA) {
            CommonUtil.setUpdateNetworkTimeCallback(networkTimeCallback);
        }
        return zA;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static void setListener(TXLiveBaseListener tXLiveBaseListener) {
        LiteavLog.setCallback(new a(0 == true ? 1 : 0));
        LiteavLog.nativeSetLogCallbackEnabled(tXLiveBaseListener != null);
        sListener = tXLiveBaseListener;
    }

    public static void setLogLevel(int i10) {
        LiteavLog.b bVar = LiteavLog.b.kAll;
        if (i10 == 2) {
            bVar = LiteavLog.b.kInfo;
        } else if (i10 == 3) {
            bVar = LiteavLog.b.kWarning;
        } else if (i10 == 4) {
            bVar = LiteavLog.b.kError;
        } else if (i10 == 5) {
            bVar = LiteavLog.b.kFatal;
        } else if (i10 == 6) {
            bVar = LiteavLog.b.kNone;
        }
        LiteavLog.nativeSetLogLevel(bVar.mNativeValue);
    }

    public static void setPituLicencePath(String str) {
    }

    public static void setUserId(String str) {
        LiveSettingJni.setUserId(str);
    }

    public static int updateNetworkTime() {
        return CommonUtil.updateNetworkTime();
    }

    public String getLicenceInfo(Context context) {
        ContextUtils.initApplicationContext(context.getApplicationContext());
        ContextUtils.setDataDirectorySuffix("liteav");
        return LicenseChecker.getInstance().getLicense(LicenseChecker.c.LIVE);
    }

    public void setLicence(Context context, String str, String str2) {
        ContextUtils.initApplicationContext(context.getApplicationContext());
        ContextUtils.setDataDirectorySuffix("liteav");
        LicenseChecker.getInstance().setListener(new LicenseChecker.b() { // from class: com.tencent.rtmp.TXLiveBase.1
            @Override // com.tencent.liteav.sdk.common.LicenseChecker.b
            public final void a(int i10, String str3) {
                TXLiveBaseListener tXLiveBaseListener = TXLiveBase.sListener;
                if (tXLiveBaseListener != null) {
                    tXLiveBaseListener.onLicenceLoaded(i10, str3);
                }
            }
        });
        LicenseChecker.getInstance().setLicense(LicenseChecker.c.LIVE, str, str2);
    }
}
