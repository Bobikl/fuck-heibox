package com.tencent.thumbplayer.tcmedia.c;

import android.content.Context;
import com.meituan.robust.Constants;
import com.tencent.thumbplayer.tcmedia.api.TPPlayerMgr;
import com.tencent.thumbplayer.tcmedia.config.TPPlayerConfig;
import com.tencent.thumbplayer.tcmedia.core.downloadproxy.api.ITPDLProxyLogListener;
import com.tencent.thumbplayer.tcmedia.core.downloadproxy.api.ITPDownloadProxy;
import com.tencent.thumbplayer.tcmedia.core.downloadproxy.api.TPDLProxyInitParam;
import com.tencent.thumbplayer.tcmedia.core.downloadproxy.api.TPDownloadProxyEnum;
import com.tencent.thumbplayer.tcmedia.core.downloadproxy.api.TPDownloadProxyFactory;
import com.tencent.thumbplayer.tcmedia.utils.TPLogUtil;
import java.util.Iterator;
import java.util.concurrent.ConcurrentHashMap;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes4.dex */
public class i implements com.tencent.thumbplayer.tcmedia.utils.f.a, com.tencent.thumbplayer.tcmedia.utils.i.b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private int f102549a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private String f102550b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private int f102551c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private ConcurrentHashMap<Integer, b> f102552d;

    public static class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private static i f102554a = new i();
    }

    private i() {
        this.f102549a = 0;
        this.f102550b = "";
        this.f102551c = 0;
        if (this.f102552d == null) {
            this.f102552d = new ConcurrentHashMap<>();
        }
        com.tencent.thumbplayer.tcmedia.utils.f.a(this);
        com.tencent.thumbplayer.tcmedia.utils.i.a().a(this);
    }

    public static i a() {
        return a.f102554a;
    }

    private static TPDLProxyInitParam a(Context context) {
        return new TPDLProxyInitParam(TPPlayerConfig.getPlatform(), TPPlayerConfig.getAppVersionName(context), TPPlayerConfig.getGuid(), TPPlayerConfig.getProxyCacheDir(), TPPlayerConfig.getProxyDataDir(), TPPlayerConfig.getProxyConfigDir());
    }

    private void a(String str, int i10) {
        this.f102550b = str;
        this.f102551c = i10;
        for (b bVar : this.f102552d.values()) {
            bVar.a().setUserData(TPDownloadProxyEnum.USER_UPC, str);
            bVar.a().setUserData(TPDownloadProxyEnum.USER_UPC_STATE, Integer.valueOf(i10));
        }
    }

    private String b(boolean z10) {
        try {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("EnableReport", z10);
            return jSONObject.toString();
        } catch (JSONException e10) {
            TPLogUtil.e("TPProxyGlobalManager", e10);
            return "";
        }
    }

    private void b(int i10) {
        Iterator<b> it = this.f102552d.values().iterator();
        while (it.hasNext()) {
            it.next().a(i10);
        }
    }

    private String c(long j10) {
        try {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("MaxUseMemoryLevel1MB", j10);
            jSONObject.put("MaxUseMemoryLevel2MB", j10);
            jSONObject.put("MaxUseMemoryMB", j10);
            return jSONObject.toString();
        } catch (JSONException e10) {
            TPLogUtil.e("TPProxyGlobalManager", e10);
            return "";
        }
    }

    /* JADX WARN: Code duplicated, block: B:34:0x00ba A[Catch: all -> 0x00dd, TryCatch #0 {all -> 0x00dd, blocks: (B:11:0x0028, B:13:0x003a, B:15:0x0048, B:17:0x0059, B:18:0x005c, B:25:0x0073, B:27:0x009f, B:29:0x00a9, B:31:0x00af, B:32:0x00b2, B:34:0x00ba, B:35:0x00c1, B:21:0x0063, B:24:0x006f), top: B:40:0x0028 }] */
    public b a(int i10) {
        String strC;
        if (i10 < 0) {
            return null;
        }
        if (this.f102552d.containsKey(Integer.valueOf(i10))) {
            return this.f102552d.get(Integer.valueOf(i10));
        }
        ITPDownloadProxy tPDownloadProxy = TPDownloadProxyFactory.getTPDownloadProxy(i10);
        if (tPDownloadProxy != null) {
            try {
                if (tPDownloadProxy.init(TPPlayerMgr.getAppContext(), a(TPPlayerMgr.getAppContext())) < 0) {
                    TPLogUtil.i("TPProxyGlobalManager", "downloadProxy init failed with status:".concat(String.valueOf(tPDownloadProxy)));
                    return null;
                }
                tPDownloadProxy.setLogListener(new ITPDLProxyLogListener() { // from class: com.tencent.thumbplayer.tcmedia.c.i.1
                    @Override // com.tencent.thumbplayer.tcmedia.core.downloadproxy.api.ITPDLProxyLogListener
                    public int d(String str, int i11, String str2, String str3) {
                        TPLogUtil.d(str2, Constants.ARRAY_TYPE + str + ":" + i11 + "] " + str3);
                        return 0;
                    }

                    @Override // com.tencent.thumbplayer.tcmedia.core.downloadproxy.api.ITPDLProxyLogListener
                    public int e(String str, int i11, String str2, String str3) {
                        TPLogUtil.e(str2, Constants.ARRAY_TYPE + str + ":" + i11 + "] " + str3);
                        return 0;
                    }

                    @Override // com.tencent.thumbplayer.tcmedia.core.downloadproxy.api.ITPDLProxyLogListener
                    public int i(String str, int i11, String str2, String str3) {
                        TPLogUtil.i(str2, Constants.ARRAY_TYPE + str + ":" + i11 + "] " + str3);
                        return 0;
                    }

                    @Override // com.tencent.thumbplayer.tcmedia.core.downloadproxy.api.ITPDLProxyLogListener
                    public int w(String str, int i11, String str2, String str3) {
                        TPLogUtil.w(str2, Constants.ARRAY_TYPE + str + ":" + i11 + "] " + str3);
                        return 0;
                    }
                });
                int iC = com.tencent.thumbplayer.tcmedia.utils.i.c();
                if (iC != 1) {
                    if (iC == 2) {
                        tPDownloadProxy.pushEvent(2);
                        tPDownloadProxy.pushEvent(9);
                    } else if (iC == 3) {
                        tPDownloadProxy.pushEvent(2);
                    }
                    tPDownloadProxy.pushEvent(this.f102549a);
                    tPDownloadProxy.setUserData(TPDownloadProxyEnum.USER_UPC, this.f102550b);
                    tPDownloadProxy.setUserData(TPDownloadProxyEnum.USER_UPC_STATE, Integer.valueOf(this.f102551c));
                    tPDownloadProxy.setUserData(TPDownloadProxyEnum.USER_PROXY_CONFIG, b(TPPlayerConfig.isDataReportEnable()));
                    if (TPPlayerConfig.getProxyMaxUseMemoryMB() > 0 && (strC = c(TPPlayerConfig.getProxyMaxUseMemoryMB())) != null && strC.length() > 0) {
                        tPDownloadProxy.setUserData(TPDownloadProxyEnum.USER_PROXY_CONFIG, strC);
                    }
                    if (TPPlayerConfig.getProxyMaxStorageSizeMB() > 0) {
                        tPDownloadProxy.setMaxStorageSizeMB(TPPlayerConfig.getProxyMaxStorageSizeMB());
                    }
                    j jVar = new j(tPDownloadProxy);
                    this.f102552d.put(Integer.valueOf(i10), jVar);
                    TPLogUtil.i("TPProxyGlobalManager", "getPlayerProxy, init proxy succeeded, serviceType:".concat(String.valueOf(i10)));
                    return jVar;
                }
                tPDownloadProxy.pushEvent(1);
                tPDownloadProxy.pushEvent(10);
                tPDownloadProxy.pushEvent(this.f102549a);
                tPDownloadProxy.setUserData(TPDownloadProxyEnum.USER_UPC, this.f102550b);
                tPDownloadProxy.setUserData(TPDownloadProxyEnum.USER_UPC_STATE, Integer.valueOf(this.f102551c));
                tPDownloadProxy.setUserData(TPDownloadProxyEnum.USER_PROXY_CONFIG, b(TPPlayerConfig.isDataReportEnable()));
                if (TPPlayerConfig.getProxyMaxUseMemoryMB() > 0) {
                    tPDownloadProxy.setUserData(TPDownloadProxyEnum.USER_PROXY_CONFIG, strC);
                }
                if (TPPlayerConfig.getProxyMaxStorageSizeMB() > 0) {
                    tPDownloadProxy.setMaxStorageSizeMB(TPPlayerConfig.getProxyMaxStorageSizeMB());
                }
                j jVar2 = new j(tPDownloadProxy);
                this.f102552d.put(Integer.valueOf(i10), jVar2);
                TPLogUtil.i("TPProxyGlobalManager", "getPlayerProxy, init proxy succeeded, serviceType:".concat(String.valueOf(i10)));
                return jVar2;
            } catch (Throwable th2) {
                TPLogUtil.e("TPProxyGlobalManager", "init proxy failed:".concat(String.valueOf(th2)));
            }
        }
        return null;
    }

    @Override // com.tencent.thumbplayer.tcmedia.utils.i.b
    public void a(int i10, int i11, int i12, int i13) {
        int i14 = 10;
        if (i11 == 1) {
            b(1);
        } else {
            if (i11 != 2) {
                if (i11 == 3) {
                    b(2);
                    b(10);
                    return;
                }
                return;
            }
            b(2);
            i14 = 9;
        }
        b(i14);
    }

    @Override // com.tencent.thumbplayer.tcmedia.utils.f.a
    public void a(int i10, int i11, int i12, Object obj) {
        int i13;
        TPLogUtil.i("TPProxyGlobalManager", "onEvent eventId: " + i10 + ", arg1: " + i11 + ", arg2: " + i12 + ", object" + obj);
        switch (i10) {
            case TPPlayerMgr.EVENT_ID_APP_ENTER_BACKGROUND /* 100001 */:
                i13 = 13;
                break;
            case TPPlayerMgr.EVENT_ID_APP_ENTER_FOREGROUND /* 100002 */:
                i13 = 14;
                break;
            case 100003:
                a((String) obj, i11);
                return;
            default:
                return;
        }
        this.f102549a = i13;
        b(i13);
    }

    public void a(long j10) {
        Iterator<b> it = this.f102552d.values().iterator();
        while (it.hasNext()) {
            ITPDownloadProxy iTPDownloadProxyA = it.next().a();
            if (iTPDownloadProxyA != null && j10 > 0) {
                iTPDownloadProxyA.setMaxStorageSizeMB(j10);
            }
        }
    }

    public void a(boolean z10) {
        Iterator<b> it = this.f102552d.values().iterator();
        while (it.hasNext()) {
            it.next().a().setUserData(TPDownloadProxyEnum.USER_PROXY_CONFIG, b(z10));
        }
    }

    public void b(long j10) {
        Iterator<b> it = this.f102552d.values().iterator();
        while (it.hasNext()) {
            it.next().a().setUserData(TPDownloadProxyEnum.USER_PROXY_CONFIG, c(j10));
        }
    }
}
