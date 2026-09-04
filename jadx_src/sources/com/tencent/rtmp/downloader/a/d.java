package com.tencent.rtmp.downloader.a;

import android.content.Context;
import android.text.TextUtils;
import com.tencent.liteav.base.util.LiteavLog;
import com.tencent.thumbplayer.tcmedia.core.downloadproxy.api.ITPDownloadProxy;
import com.tencent.thumbplayer.tcmedia.core.downloadproxy.api.ITPOfflineDownloadListener;
import com.tencent.thumbplayer.tcmedia.core.downloadproxy.api.TPDLProxyInitParam;
import com.tencent.thumbplayer.tcmedia.core.downloadproxy.api.TPDownloadParam;
import com.tencent.thumbplayer.tcmedia.core.downloadproxy.api.TPDownloadProxyEnum;
import com.tencent.thumbplayer.tcmedia.core.downloadproxy.api.TPDownloadProxyFactory;
import com.xiaomi.mipush.sdk.Constants;
import java.io.File;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

/* JADX INFO: loaded from: classes4.dex */
public class d {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private static d f102083e;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public String f102084a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public a f102085b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public Map<String, String> f102086c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public ITPDownloadProxy f102087d = TPDownloadProxyFactory.getTPDownloadProxy(2330303);

    public interface a {
        void a(c cVar);

        void a(c cVar, int i10, String str);

        void b(c cVar);

        void c(c cVar);

        void d(c cVar);
    }

    private d(Context context) {
        File externalFilesDir;
        if (context != null) {
            String strA = com.tencent.liteav.txcplayer.common.b.a();
            this.f102084a = strA;
            try {
                if (TextUtils.isEmpty(strA) && (externalFilesDir = context.getExternalFilesDir(null)) != null) {
                    this.f102084a = externalFilesDir.getAbsolutePath() + "/txcache";
                }
                if (!TextUtils.isEmpty(this.f102084a)) {
                    File file = new File(this.f102084a);
                    if (!file.exists() || !file.isDirectory()) {
                        file.mkdirs();
                    }
                }
            } catch (Exception e10) {
                LiteavLog.e("ThumbPlayerDownloader", "downloader init exception: " + e10.getLocalizedMessage());
            }
            this.f102087d.init(context, new TPDLProxyInitParam(2330303, "1.0.0", "liteav_tbplayer_android_" + context.getPackageName(), this.f102084a));
        }
    }

    public static d a(Context context) {
        synchronized (d.class) {
            if (f102083e == null) {
                f102083e = new d(context);
            }
        }
        return f102083e;
    }

    public final float a(c cVar) {
        String playPath = cVar.getPlayPath();
        if (TextUtils.isEmpty(playPath)) {
            return 0.0f;
        }
        String strSubstring = playPath.substring(0, playPath.indexOf("?"));
        return this.f102087d.getResourceDownloadProgress(strSubstring.substring(0, strSubstring.lastIndexOf("/")), strSubstring.substring(strSubstring.lastIndexOf("/") + 1), cVar.getPreferredResolution());
    }

    public final String a(String str) {
        String strA = com.tencent.liteav.txcplayer.common.b.a();
        if (!TextUtils.equals(this.f102084a, strA)) {
            if (TextUtils.isEmpty(strA)) {
                com.tencent.liteav.txcplayer.common.b.a(this.f102084a);
            } else {
                this.f102084a = strA;
            }
        }
        this.f102087d.updateStoragePath(this.f102084a);
        return this.f102084a + "/" + com.tencent.liteav.txcplayer.a.a.d(str) + "?" + str;
    }

    final boolean a(String str, long j10) {
        if (TextUtils.isEmpty(str)) {
            return false;
        }
        if (str.trim().endsWith(".sqlite")) {
            return new File(str).delete();
        }
        String strSubstring = str.substring(0, str.indexOf("?"));
        String strSubstring2 = strSubstring.substring(strSubstring.lastIndexOf("/") + 1);
        if (!TextUtils.isEmpty(strSubstring2)) {
            String strSubstring3 = strSubstring.substring(0, strSubstring.lastIndexOf("/"));
            this.f102087d.updateStoragePath(strSubstring3);
            if (this.f102087d.clearCache(strSubstring3, strSubstring2, 1, j10) == 0) {
                return true;
            }
        }
        return false;
    }

    public final boolean b(c cVar) {
        String playPath = cVar.getPlayPath();
        if (TextUtils.isEmpty(playPath)) {
            return false;
        }
        String strSubstring = playPath.substring(0, playPath.indexOf("?"));
        String strSubstring2 = strSubstring.substring(0, strSubstring.lastIndexOf("/"));
        String strSubstring3 = strSubstring.substring(strSubstring.lastIndexOf("/") + 1);
        this.f102087d.updateStoragePath(strSubstring2);
        return this.f102087d.checkResourceExist(strSubstring2, strSubstring3, cVar.getPreferredResolution());
    }

    public final int c(final c cVar) {
        String playPath = cVar.getPlayPath();
        if (TextUtils.isEmpty(playPath)) {
            return -1;
        }
        String strSubstring = playPath.substring(0, playPath.indexOf("?"));
        String strSubstring2 = strSubstring.substring(strSubstring.lastIndexOf("/") + 1);
        String url = cVar.getUrl();
        ArrayList arrayList = new ArrayList();
        arrayList.add(url);
        TPDownloadParam tPDownloadParam = new TPDownloadParam(arrayList, 0, null);
        HashMap map = new HashMap();
        Map<String, String> map2 = this.f102086c;
        if (map2 != null && map2.size() > 0) {
            ArrayList arrayList2 = new ArrayList();
            arrayList2.add(this.f102086c);
            map.put(TPDownloadProxyEnum.DLPARAM_URL_HEADER, arrayList2);
        }
        long preferredResolution = cVar.getPreferredResolution();
        if (preferredResolution > 0) {
            map.put(TPDownloadProxyEnum.DLPARAM_OFFLINE_SCHEDULER_LEVEL, 4);
            map.put(TPDownloadProxyEnum.DLPARAM_PREFERRED_RESOLUTION, Long.valueOf(preferredResolution));
        }
        if (cVar.getDrmBuilder() != null) {
            map.put(TPDownloadProxyEnum.DLPARAM_KEY_LICENSE_URL, cVar.getDrmBuilder().getKeyLicenseUrl());
            map.put(TPDownloadProxyEnum.DLPARAM_DEVICE_CERTIFICATE_URL, cVar.getDrmBuilder().getDeviceCertificateUrl());
        }
        tPDownloadParam.setExtInfoMap(map);
        int iStartOfflineDownload = this.f102087d.startOfflineDownload(strSubstring2, tPDownloadParam, new ITPOfflineDownloadListener() { // from class: com.tencent.rtmp.downloader.a.d.1
            @Override // com.tencent.thumbplayer.tcmedia.core.downloadproxy.api.ITPOfflineDownloadListener
            public final void onDownloadCdnUrlExpired(Map<String, String> map3) {
                LiteavLog.i("ThumbPlayerDownloader", "onDownloadCdnUrlExpired!");
            }

            @Override // com.tencent.thumbplayer.tcmedia.core.downloadproxy.api.ITPOfflineDownloadListener
            public final void onDownloadCdnUrlInfoUpdate(String str, String str2, String str3, String str4) {
            }

            @Override // com.tencent.thumbplayer.tcmedia.core.downloadproxy.api.ITPOfflineDownloadListener
            public final void onDownloadCdnUrlUpdate(String str) {
                LiteavLog.i("ThumbPlayerDownloader", "onDownloadCdnUrlUpdate! url:".concat(String.valueOf(str)));
            }

            @Override // com.tencent.thumbplayer.tcmedia.core.downloadproxy.api.ITPOfflineDownloadListener
            public final void onDownloadError(int i10, int i11, String str) {
                LiteavLog.e("ThumbPlayerDownloader", "offline download error! moduleID:" + i10 + ", errCode:" + i11);
                if (d.this.f102085b != null) {
                    d.this.f102085b.a(cVar, i11, str);
                }
            }

            @Override // com.tencent.thumbplayer.tcmedia.core.downloadproxy.api.ITPOfflineDownloadListener
            public final void onDownloadFinish() {
                if (d.this.f102085b != null) {
                    d.this.f102085b.c(cVar);
                }
            }

            @Override // com.tencent.thumbplayer.tcmedia.core.downloadproxy.api.ITPOfflineDownloadListener
            public final void onDownloadProgressUpdate(int i10, int i11, long j10, long j11, String str) {
                if (j10 > 1024 && j10 != cVar.getDownloadSize()) {
                    cVar.b(j10);
                }
                if (cVar.getSize() <= 0 && j11 > 0) {
                    cVar.a(j11);
                }
                if (i10 > 0) {
                    cVar.b(i10);
                }
                if (cVar.getDuration() <= 0 && !TextUtils.isEmpty(str) && str.contains("totalDuration")) {
                    for (String str2 : str.split(Constants.ACCEPT_TIME_SEPARATOR_SP)) {
                        if (str2.contains("totalDuration")) {
                            cVar.a(Integer.valueOf(str2.split(":")[1]).intValue() * 1000);
                            break;
                        }
                    }
                }
                cVar.e(i11);
                if (d.this.f102085b != null) {
                    d.this.f102085b.d(cVar);
                }
            }

            @Override // com.tencent.thumbplayer.tcmedia.core.downloadproxy.api.ITPOfflineDownloadListener
            public final void onDownloadProtocolUpdate(String str, String str2) {
                LiteavLog.i("ThumbPlayerDownloader", "onDownloadProtocolUpdate! protocol:" + str + ", protocolVer:" + str2);
            }

            @Override // com.tencent.thumbplayer.tcmedia.core.downloadproxy.api.ITPOfflineDownloadListener
            public final void onDownloadStatusUpdate(int i10) {
                LiteavLog.i("ThumbPlayerDownloader", "onDownloadStatusUpdate! statusCode:".concat(String.valueOf(i10)));
            }
        });
        cVar.c(iStartOfflineDownload);
        a aVar = this.f102085b;
        if (aVar != null) {
            aVar.a(cVar);
        }
        return iStartOfflineDownload;
    }
}
