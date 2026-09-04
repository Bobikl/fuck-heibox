package com.tencent.live2.impl;

import android.content.Context;
import com.tencent.liteav.LiveSettingJni;
import com.tencent.liteav.base.ContextUtils;
import com.tencent.liteav.base.util.CommonUtil;
import com.tencent.liteav.base.util.LiteavLog;
import com.tencent.liteav.live.V2TXLivePremierJni;
import com.tencent.liteav.sdk.common.LicenseChecker;
import com.tencent.live2.V2TXLiveDef;
import com.tencent.live2.V2TXLivePremier;

/* JADX INFO: loaded from: classes4.dex */
public final class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final C0969a f100884a = new C0969a();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static V2TXLivePremier.V2TXLivePremierObserver f100885b;

    /* JADX INFO: renamed from: com.tencent.live2.impl.a$a, reason: collision with other inner class name */
    public static final class C0969a implements LiteavLog.a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        V2TXLivePremier.V2TXLivePremierObserver f100886a;

        @Override // com.tencent.liteav.base.util.LiteavLog.a
        public final void a(int i10, String str, String str2) {
            V2TXLivePremier.V2TXLivePremierObserver v2TXLivePremierObserver = this.f100886a;
            if (v2TXLivePremierObserver != null) {
                v2TXLivePremierObserver.onLog(i10, str2);
            }
        }
    }

    public static String a() {
        return CommonUtil.getSDKVersionStr();
    }

    public static void a(Context context, String str, String str2) {
        ContextUtils.initApplicationContext(context.getApplicationContext());
        ContextUtils.setDataDirectorySuffix("liteav");
        LicenseChecker.getInstance().setListener(new LicenseChecker.b() { // from class: com.tencent.live2.impl.a.1
            @Override // com.tencent.liteav.sdk.common.LicenseChecker.b
            public final void a(int i10, String str3) {
                V2TXLivePremier.V2TXLivePremierObserver v2TXLivePremierObserver = a.f100885b;
                if (v2TXLivePremierObserver != null) {
                    v2TXLivePremierObserver.onLicenceLoaded(i10, str3);
                }
            }
        });
        LicenseChecker.getInstance().setLicense(LicenseChecker.c.LIVE, str, str2);
    }

    public static void a(V2TXLiveDef.V2TXLiveLogConfig v2TXLiveLogConfig) {
        LiteavLog.b bVar;
        if (v2TXLiveLogConfig != null) {
            LiteavLog.nativeSetConsoleLogEnabled(v2TXLiveLogConfig.enableConsole);
            LiteavLog.nativeSetLogToFileEnabled(v2TXLiveLogConfig.enableLogFile);
            String str = v2TXLiveLogConfig.logPath;
            if (str != null) {
                LiteavLog.nativeSetLogFilePath(str);
            }
            int i10 = v2TXLiveLogConfig.logLevel;
            if (i10 == 2) {
                bVar = LiteavLog.b.kInfo;
            } else if (i10 == 3) {
                bVar = LiteavLog.b.kWarning;
            } else if (i10 == 4) {
                bVar = LiteavLog.b.kError;
            } else if (i10 != 5) {
                bVar = i10 != 6 ? LiteavLog.b.kAll : LiteavLog.b.kNone;
            } else {
                bVar = LiteavLog.b.kFatal;
            }
            LiteavLog.nativeSetLogLevel(bVar.mNativeValue);
            C0969a c0969a = f100884a;
            boolean z10 = v2TXLiveLogConfig.enableObserver;
            if (!z10) {
                c0969a = null;
            }
            LiteavLog.setCallback(c0969a);
            LiteavLog.nativeSetLogCallbackEnabled(z10);
        }
    }

    public static void a(V2TXLivePremier.V2TXLivePremierObserver v2TXLivePremierObserver) {
        f100885b = v2TXLivePremierObserver;
        f100884a.f100886a = v2TXLivePremierObserver;
        V2TXLivePremierJni.setObserver(v2TXLivePremierObserver);
    }

    public static void a(String str) {
        CommonUtil.setGlobalEnv(str);
    }

    public static void a(String str, int i10, String str2, String str3, V2TXLiveDef.V2TXLiveSocks5ProxyConfig v2TXLiveSocks5ProxyConfig) {
        CommonUtil.setSocks5Proxy(str, i10, str2, str3, v2TXLiveSocks5ProxyConfig.supportHttps, v2TXLiveSocks5ProxyConfig.supportTcp, v2TXLiveSocks5ProxyConfig.supportUdp);
    }

    public static void a(boolean z10) {
        V2TXLivePremierJni.enableVoiceEarMonitorObserver(z10);
    }

    public static void a(boolean z10, V2TXLiveDef.V2TXLiveAudioFrameObserverFormat v2TXLiveAudioFrameObserverFormat) {
        V2TXLivePremierJni.enableAudioCaptureObserver(z10, v2TXLiveAudioFrameObserverFormat);
    }

    public static void b(String str) {
        LiveSettingJni.setUserId(str);
    }

    public static void b(boolean z10, V2TXLiveDef.V2TXLiveAudioFrameObserverFormat v2TXLiveAudioFrameObserverFormat) {
        V2TXLivePremierJni.enableAudioPlayoutObserver(z10, v2TXLiveAudioFrameObserverFormat);
    }

    public static int c(String str) {
        return V2TXLivePremierJni.callExperimentalAPI(str);
    }
}
