package com.tencent.thumbplayer.tcmedia.c;

import android.content.Context;
import android.text.TextUtils;
import com.meituan.robust.Constants;
import com.tencent.thumbplayer.tcmedia.api.proxy.ITPPreloadProxy;
import com.tencent.thumbplayer.tcmedia.api.proxy.TPDownloadParamData;
import com.tencent.thumbplayer.tcmedia.config.TPPlayerConfig;
import com.tencent.thumbplayer.tcmedia.core.downloadproxy.api.ITPDLProxyLogListener;
import com.tencent.thumbplayer.tcmedia.core.downloadproxy.api.ITPDownloadProxy;
import com.tencent.thumbplayer.tcmedia.core.downloadproxy.api.ITPPreLoadListener;
import com.tencent.thumbplayer.tcmedia.core.downloadproxy.api.TPDownloadProxyEnum;
import com.tencent.thumbplayer.tcmedia.utils.TPLogUtil;
import java.util.ArrayList;
import java.util.Map;

/* JADX INFO: loaded from: classes4.dex */
public class g implements ITPPreloadProxy {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private Context f102542a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private int f102543b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private ITPDownloadProxy f102544c;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private boolean f102547f = false;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private a f102545d = new a();

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private ITPPreloadProxy.IPreloadListener f102546e = new f("TPPreloadProxyImpl");

    public class a implements ITPDLProxyLogListener, ITPPreLoadListener {
        private a() {
        }

        @Override // com.tencent.thumbplayer.tcmedia.core.downloadproxy.api.ITPDLProxyLogListener
        public int d(String str, int i10, String str2, String str3) {
            TPLogUtil.d(str2, Constants.ARRAY_TYPE + str + ":" + i10 + "] " + str3);
            return 0;
        }

        @Override // com.tencent.thumbplayer.tcmedia.core.downloadproxy.api.ITPDLProxyLogListener
        public int e(String str, int i10, String str2, String str3) {
            TPLogUtil.e(str2, Constants.ARRAY_TYPE + str + ":" + i10 + "] " + str3);
            return 0;
        }

        @Override // com.tencent.thumbplayer.tcmedia.core.downloadproxy.api.ITPDLProxyLogListener
        public int i(String str, int i10, String str2, String str3) {
            TPLogUtil.i(str2, Constants.ARRAY_TYPE + str + ":" + i10 + "] " + str3);
            return 0;
        }

        @Override // com.tencent.thumbplayer.tcmedia.core.downloadproxy.api.ITPPreLoadListener
        public void onPrepareDownloadProgressUpdate(int i10, int i11, long j10, long j11, String str) {
            g.this.f102546e.onPrepareDownloadProgressUpdate(i10, i11, j10, j11);
        }

        @Override // com.tencent.thumbplayer.tcmedia.core.downloadproxy.api.ITPPreLoadListener
        public void onPrepareError(int i10, int i11, String str) {
            g.this.f102546e.onPrepareError();
        }

        @Override // com.tencent.thumbplayer.tcmedia.core.downloadproxy.api.ITPPreLoadListener
        public void onPrepareOK() {
            g.this.f102546e.onPrepareSuccess();
        }

        @Override // com.tencent.thumbplayer.tcmedia.core.downloadproxy.api.ITPDLProxyLogListener
        public int w(String str, int i10, String str2, String str3) {
            TPLogUtil.w(str2, Constants.ARRAY_TYPE + str + ":" + i10 + "] " + str3);
            return 0;
        }
    }

    public g(Context context, int i10) {
        this.f102542a = context;
        this.f102543b = i10;
        a();
    }

    private void a() {
        int i10 = 3;
        while (i10 > 0 && !this.f102547f) {
            try {
                b bVarA = i.a().a(this.f102543b);
                if (bVarA != null && bVarA.a() != null) {
                    ITPDownloadProxy iTPDownloadProxyA = bVarA.a();
                    this.f102544c = iTPDownloadProxyA;
                    iTPDownloadProxyA.setLogListener(this.f102545d);
                    this.f102544c.setUserData(TPDownloadProxyEnum.USER_IS_VIP, Boolean.valueOf(TPPlayerConfig.isUserIsVip()));
                    if (!TextUtils.isEmpty(TPPlayerConfig.getUserUin())) {
                        this.f102544c.setUserData(TPDownloadProxyEnum.USER_UIN, TPPlayerConfig.getUserUin());
                    }
                    if (!TextUtils.isEmpty(TPPlayerConfig.getAppVersionName(this.f102542a))) {
                        this.f102544c.setUserData(TPDownloadProxyEnum.USER_APP_VERSION, TPPlayerConfig.getAppVersionName(this.f102542a));
                    }
                    if (TPPlayerConfig.getBuildNumber(this.f102542a) != -1) {
                        this.f102544c.setUserData("app_version_code", String.valueOf(TPPlayerConfig.getBuildNumber(this.f102542a)));
                    }
                    this.f102544c.setUserData(TPDownloadProxyEnum.USER_UPC, TPPlayerConfig.getUserUpc());
                    this.f102544c.setUserData(TPDownloadProxyEnum.USER_UPC_STATE, Integer.valueOf(TPPlayerConfig.getUserUpcState()));
                    this.f102544c.setUserData(TPDownloadProxyEnum.USER_EXTERNAL_NETWORK_IP, TPPlayerConfig.getOutNetIp());
                    this.f102547f = true;
                    return;
                }
                i10--;
                TPLogUtil.e("TPPreloadProxyImpl", "p2p so load failed");
            } catch (Exception e10) {
                i10--;
                TPLogUtil.e("TPPreloadProxyImpl", e10);
            }
        }
    }

    @Override // com.tencent.thumbplayer.tcmedia.api.proxy.ITPPreloadProxy
    public String getPlayErrorCodeStr(int i10) {
        return null;
    }

    @Override // com.tencent.thumbplayer.tcmedia.api.proxy.ITPPreloadProxy
    public boolean isAvailable() {
        return this.f102544c != null && this.f102547f;
    }

    @Override // com.tencent.thumbplayer.tcmedia.api.proxy.ITPPreloadProxy
    public void pushEvent(int i10) {
        if (isAvailable()) {
            try {
                this.f102544c.pushEvent(i10);
            } catch (Throwable th2) {
                TPLogUtil.e("TPPreloadProxyImpl", th2);
            }
        }
    }

    @Override // com.tencent.thumbplayer.tcmedia.api.proxy.ITPPreloadProxy
    public void setPreloadListener(ITPPreloadProxy.IPreloadListener iPreloadListener) {
        if (iPreloadListener == null) {
            this.f102546e = new f("TPPreloadProxyImpl");
        } else {
            this.f102546e = iPreloadListener;
        }
    }

    @Override // com.tencent.thumbplayer.tcmedia.api.proxy.ITPPreloadProxy
    public int startClipPreload(String str, ArrayList<TPDownloadParamData> arrayList) {
        TPLogUtil.i("TPPreloadProxyImpl", "[startClipPreload] Preloading clips.");
        if (arrayList == null) {
            TPLogUtil.e("TPPreloadProxyImpl", "[startClipPreload] Fail to start clip preload: null download parameter list.");
            return -1;
        }
        if (!isAvailable()) {
            a();
            if (!isAvailable()) {
                TPLogUtil.e("TPPreloadProxyImpl", "[startClipPreload] Fail to initialize proxy.");
                return -1;
            }
        }
        int iStartClipPreload = this.f102544c.startClipPreload(str, arrayList.size(), this.f102545d);
        if (iStartClipPreload <= 0) {
            TPLogUtil.e("TPPreloadProxyImpl", "[startClipPreload] Fail to start clip preload: invalid preload ID.");
            stopPreload(iStartClipPreload);
            return -1;
        }
        int i10 = 1;
        for (TPDownloadParamData tPDownloadParamData : arrayList) {
            if (!this.f102544c.setClipInfo(iStartClipPreload, i10, tPDownloadParamData.getDownloadFileID(), k.a(tPDownloadParamData.getUrl(), tPDownloadParamData, null, null))) {
                TPLogUtil.e("TPPreloadProxyImpl", "[startClipPreload] Fail to set clip info.");
                stopPreload(iStartClipPreload);
                return -1;
            }
            i10++;
        }
        try {
            this.f102544c.startTask(iStartClipPreload);
            return iStartClipPreload;
        } catch (Throwable th2) {
            TPLogUtil.e("TPPreloadProxyImpl", "[startClipPreload] Fail to start task: " + th2.toString());
            stopPreload(iStartClipPreload);
            return -1;
        }
    }

    @Override // com.tencent.thumbplayer.tcmedia.api.proxy.ITPPreloadProxy
    public int startPreload(String str, TPDownloadParamData tPDownloadParamData) {
        return startPreload(str, tPDownloadParamData, null);
    }

    @Override // com.tencent.thumbplayer.tcmedia.api.proxy.ITPPreloadProxy
    public int startPreload(String str, TPDownloadParamData tPDownloadParamData, Map<String, String> map) {
        if (!isAvailable()) {
            a();
            if (!isAvailable()) {
                return -1;
            }
        }
        if (tPDownloadParamData != null) {
            try {
                return this.f102544c.startPreload(str, k.a(null, tPDownloadParamData, map, null), this.f102545d);
            } catch (Throwable th2) {
                TPLogUtil.e("TPPreloadProxyImpl", th2);
            }
        }
        return -1;
    }

    @Override // com.tencent.thumbplayer.tcmedia.api.proxy.ITPPreloadProxy
    public void stopPreload(int i10) {
        ITPDownloadProxy iTPDownloadProxy = this.f102544c;
        if (iTPDownloadProxy == null) {
            return;
        }
        try {
            iTPDownloadProxy.stopPreload(i10);
        } catch (Throwable th2) {
            TPLogUtil.e("TPPreloadProxyImpl", th2);
        }
    }
}
