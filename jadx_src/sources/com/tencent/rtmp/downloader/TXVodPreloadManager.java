package com.tencent.rtmp.downloader;

import android.content.Context;
import android.os.Bundle;
import android.os.Looper;
import android.text.TextUtils;
import android.util.Pair;
import com.tencent.liteav.base.ContextUtils;
import com.tencent.liteav.base.util.LiteavLog;
import com.tencent.liteav.sdk.common.LicenseChecker;
import com.tencent.liteav.txcplayer.common.c;
import com.tencent.liteav.txcvodplayer.hlsencoder.TXCHLSEncoder;
import com.tencent.rtmp.TXPlayInfoParams;
import com.tencent.rtmp.TXPlayerDrmBuilder;
import com.tencent.rtmp.TXVodConstants;
import com.tencent.thumbplayer.tcmedia.core.downloadproxy.api.ITPDownloadProxy;
import com.tencent.thumbplayer.tcmedia.core.downloadproxy.api.ITPPreLoadListener;
import com.tencent.thumbplayer.tcmedia.core.downloadproxy.api.TPDLProxyInitParam;
import com.tencent.thumbplayer.tcmedia.core.downloadproxy.api.TPDownloadParam;
import com.tencent.thumbplayer.tcmedia.core.downloadproxy.api.TPDownloadProxyEnum;
import com.tencent.thumbplayer.tcmedia.core.downloadproxy.api.TPDownloadProxyFactory;
import com.xiaomi.mipush.sdk.Constants;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicInteger;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes4.dex */
public class TXVodPreloadManager {
    private static final String TAG = "TXVodPreloadManager";
    private static final String THUMB_PLAYER_GUID = "liteav_tbplayer_android_";
    private static final int THUMB_PLAYER_PLATFORM_ID = 2330303;
    private static Context mAppContext;
    private boolean mInit;
    private ITPDownloadProxy mTpDownloadProxy;

    public static final class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        static TXVodPreloadManager f102065a = new TXVodPreloadManager();
    }

    public static final class b implements ITPPreLoadListener {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        int f102066a = -1;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final ITXVodPreloadListener f102067b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private final String f102068c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private ITPDownloadProxy f102069d;

        public b(ITPDownloadProxy iTPDownloadProxy, String str, ITXVodPreloadListener iTXVodPreloadListener) {
            this.f102068c = str;
            this.f102067b = iTXVodPreloadListener;
            this.f102069d = iTPDownloadProxy;
        }

        private void a(int i10) {
            ITPDownloadProxy iTPDownloadProxy = this.f102069d;
            if (iTPDownloadProxy != null) {
                iTPDownloadProxy.stopPreload(i10);
            }
        }

        @Override // com.tencent.thumbplayer.tcmedia.core.downloadproxy.api.ITPPreLoadListener
        public final void onPrepareDownloadProgressUpdate(int i10, int i11, long j10, long j11, String str) {
            LiteavLog.i(TXVodPreloadManager.TAG, "preload: prepare process:" + i10 + Constants.ACCEPT_TIME_SEPARATOR_SP + i11 + Constants.ACCEPT_TIME_SEPARATOR_SP + j10 + Constants.ACCEPT_TIME_SEPARATOR_SP + j11);
        }

        @Override // com.tencent.thumbplayer.tcmedia.core.downloadproxy.api.ITPPreLoadListener
        public final void onPrepareError(int i10, int i11, String str) {
            LiteavLog.e(TXVodPreloadManager.TAG, "preload error: moduleId: " + i10 + ", errorCode: " + i11 + ", extInfo: " + str);
            ITXVodPreloadListener iTXVodPreloadListener = this.f102067b;
            if (iTXVodPreloadListener != null) {
                iTXVodPreloadListener.onError(this.f102066a, this.f102068c, i11, str);
            }
            a(this.f102066a);
        }

        @Override // com.tencent.thumbplayer.tcmedia.core.downloadproxy.api.ITPPreLoadListener
        public final void onPrepareOK() {
            LiteavLog.d(TXVodPreloadManager.TAG, "preload: onPrepareOK");
            ITXVodPreloadListener iTXVodPreloadListener = this.f102067b;
            if (iTXVodPreloadListener != null) {
                iTXVodPreloadListener.onComplete(this.f102066a, this.f102068c);
            }
            a(this.f102066a);
        }
    }

    private TXVodPreloadManager() {
        this.mInit = false;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public int checkDlType(int i10, String str) {
        if (i10 == 1) {
            return 3;
        }
        if (i10 == 2) {
            return 5;
        }
        if (i10 == 3) {
            return 10;
        }
        if (i10 != 4) {
            return (!TextUtils.isEmpty(str) && com.tencent.liteav.txcplayer.a.a.d(str).endsWith(".mp4")) ? 10 : 0;
        }
        return 19;
    }

    private synchronized Pair<Integer, String> checkInit() {
        ITPDownloadProxy tPDownloadProxy = TPDownloadProxyFactory.getTPDownloadProxy(THUMB_PLAYER_PLATFORM_ID);
        this.mTpDownloadProxy = tPDownloadProxy;
        if (tPDownloadProxy == null) {
            LiteavLog.e(TAG, "Inner error(-3).");
            return new Pair<>(-3, "Inner error.");
        }
        int iB = com.tencent.liteav.txcplayer.common.b.b();
        if (iB < 0) {
            LiteavLog.e(TAG, "MaxCacheSize not set(-1).");
            return new Pair<>(-1, "MaxCacheSize not set.");
        }
        String strA = com.tencent.liteav.txcplayer.common.b.a();
        if (TextUtils.equals(strA, "NO_SET")) {
            LiteavLog.e(TAG, "CacheFolderPath not set(-2).");
            return new Pair<>(-2, "CacheFolderPath not set.");
        }
        if (!this.mInit) {
            JSONObject jSONObject = new JSONObject();
            try {
                jSONObject.put("VodCacheReserveSizeMB", iB);
            } catch (Exception e10) {
                e10.printStackTrace();
            }
            this.mTpDownloadProxy.init(mAppContext, new TPDLProxyInitParam(THUMB_PLAYER_PLATFORM_ID, "1.0.0", THUMB_PLAYER_GUID + mAppContext.getPackageName(), null, strA, jSONObject.toString()));
            this.mInit = true;
        }
        this.mTpDownloadProxy.updateStoragePath(strA);
        this.mTpDownloadProxy.setMaxStorageSizeMB(iB);
        return new Pair<>(0, null);
    }

    public static TXVodPreloadManager getInstance(Context context) {
        if (context == null) {
            return null;
        }
        Context applicationContext = context.getApplicationContext();
        mAppContext = applicationContext;
        ContextUtils.initApplicationContext(applicationContext);
        ContextUtils.setDataDirectorySuffix("liteav");
        return a.f102065a;
    }

    private int startPreload(String str, float f10, long j10, ITXVodPreloadListener iTXVodPreloadListener, int i10, int i11, Map<String, String> map) {
        Pair<Integer, String> pairCheckInit = checkInit();
        if (((Integer) pairCheckInit.first).intValue() < 0) {
            if (iTXVodPreloadListener != null) {
                iTXVodPreloadListener.onError(-1, str, ((Integer) pairCheckInit.first).intValue(), (String) pairCheckInit.second);
            }
            return -1;
        }
        ArrayList arrayList = new ArrayList();
        arrayList.add(str);
        HashMap map2 = new HashMap();
        if (map != null && map.size() > 0) {
            ArrayList arrayList2 = new ArrayList();
            arrayList2.add(map);
            map2.put(TPDownloadProxyEnum.DLPARAM_URL_HEADER, arrayList2);
        }
        map2.put(TPDownloadProxyEnum.DLPARAM_PRELOAD_SIZE, Long.valueOf((long) (f10 * 1024.0f * 1024.0f)));
        map2.put(TPDownloadProxyEnum.DLPARAM_PREFERRED_RESOLUTION, Long.valueOf(j10));
        if (i11 == 2 && c.a(LicenseChecker.a.PLAYER_PREMIUM)) {
            map2.put(TPDownloadProxyEnum.DLPARAM_CACHE_NEED_ENCRYPT, Boolean.TRUE);
        }
        TPDownloadParam tPDownloadParam = new TPDownloadParam(arrayList, checkDlType(i10, str), map2);
        b bVar = new b(this.mTpDownloadProxy, str, iTXVodPreloadListener);
        int iStartPreload = this.mTpDownloadProxy.startPreload(com.tencent.liteav.txcplayer.a.a.d(str), tPDownloadParam, bVar);
        bVar.f102066a = iStartPreload;
        LiteavLog.i(TAG, "startPreload for url success, url: " + str + " ,taskID: " + iStartPreload);
        return iStartPreload;
    }

    public int startPreload(final TXPlayInfoParams tXPlayInfoParams, final float f10, final long j10, final ITXVodFilePreloadListener iTXVodFilePreloadListener) throws RuntimeException {
        LiteavLog.i(TAG, "startPreload for TXPlayInfoParams, playInfoParams: " + tXPlayInfoParams + " ,preloadSizeMB: " + f10 + " ,preferredResolution: " + j10 + " ,listener: " + iTXVodFilePreloadListener);
        if (tXPlayInfoParams != null && !TextUtils.isEmpty(tXPlayInfoParams.getUrl()) && TextUtils.isEmpty(tXPlayInfoParams.getFileId())) {
            return startPreload(tXPlayInfoParams.getUrl(), f10, j10, iTXVodFilePreloadListener, checkDlType(tXPlayInfoParams.getMediaType(), tXPlayInfoParams.getUrl()), tXPlayInfoParams.getEncryptedMp4Level(), tXPlayInfoParams.getHeaders());
        }
        if (Looper.myLooper() == Looper.getMainLooper()) {
            LiteavLog.e(TAG, "startPreload for TXPlayInfoParams can not be called on the main thread.");
            throw new RuntimeException("startPreload for TXPlayInfoParams can not be called on the main thread.");
        }
        Pair<Integer, String> pairCheckInit = checkInit();
        if (((Integer) pairCheckInit.first).intValue() < 0) {
            if (iTXVodFilePreloadListener != null) {
                iTXVodFilePreloadListener.onError(-1, "", ((Integer) pairCheckInit.first).intValue(), (String) pairCheckInit.second);
            }
            return -1;
        }
        if (tXPlayInfoParams == null || tXPlayInfoParams.getAppId() == 0 || TextUtils.isEmpty(tXPlayInfoParams.getFileId())) {
            if (iTXVodFilePreloadListener != null) {
                iTXVodFilePreloadListener.onError(-1, "", -1, " invalid params, appId or fileId is null");
            }
            return -1;
        }
        final AtomicInteger atomicInteger = new AtomicInteger(-1);
        final CountDownLatch countDownLatch = new CountDownLatch(1);
        new com.tencent.liteav.txcvodplayer.b.c(tXPlayInfoParams).a(new com.tencent.liteav.txcvodplayer.b.c.a() { // from class: com.tencent.rtmp.downloader.TXVodPreloadManager.1
            @Override // com.tencent.liteav.txcvodplayer.b.c.a
            public final void a(int i10, String str) {
                countDownLatch.countDown();
                if (iTXVodFilePreloadListener != null) {
                    LiteavLog.i(TXVodPreloadManager.TAG, "startPreload for TXPlayInfoParams failed, playInfoParams: " + tXPlayInfoParams + " ,getPlayInfo failed: " + str);
                    iTXVodFilePreloadListener.onError(-1, "", i10, "getPlayInfo failed: ".concat(String.valueOf(str)));
                }
            }

            /* JADX WARN: Code duplicated, block: B:4:0x0014  */
            @Override // com.tencent.liteav.txcvodplayer.b.c.a
            public final void a(com.tencent.liteav.txcvodplayer.b.c cVar, TXPlayInfoParams tXPlayInfoParams2) {
                boolean z10;
                Pair pair;
                String strL = cVar.l();
                if ("SimpleAES".equalsIgnoreCase(strL)) {
                    z10 = true;
                } else {
                    String strA = cVar.a("Widevine");
                    if (!"Widevine".equalsIgnoreCase(strL) || TextUtils.isEmpty(strA)) {
                        z10 = false;
                    } else {
                        z10 = true;
                    }
                }
                if (!(!z10 || c.a(LicenseChecker.a.PLAYER_PREMIUM))) {
                    LiteavLog.e(TXVodPreloadManager.TAG, "Encrypted fileId preload needs Player Premium license! fileId=" + tXPlayInfoParams2.getFileId());
                    countDownLatch.countDown();
                    ITXVodFilePreloadListener iTXVodFilePreloadListener2 = iTXVodFilePreloadListener;
                    if (iTXVodFilePreloadListener2 != null) {
                        iTXVodFilePreloadListener2.onError(-1, "", -5, "Encrypted fileId preload needs Player Premium license!");
                        return;
                    }
                    return;
                }
                Bundle bundle = new Bundle();
                long j11 = j10;
                String strB = cVar.b();
                String strL2 = cVar.l();
                boolean zIsEmpty = TextUtils.isEmpty(strL2);
                String strL3 = org.apache.tools.ant.taskdefs.email.b.K;
                if (zIsEmpty) {
                    strL2 = org.apache.tools.ant.taskdefs.email.b.K;
                }
                if (org.apache.tools.ant.taskdefs.email.b.K.equalsIgnoreCase(strL2)) {
                    pair = new Pair(strB, com.tencent.liteav.txcplayer.a.a.a(strB, tXPlayInfoParams2.getFileId(), strL2, tXPlayInfoParams2.getAppId()));
                } else {
                    String strA2 = cVar.a("Widevine");
                    boolean zIsEmpty2 = true ^ TextUtils.isEmpty(strA2);
                    if ("SimpleAES".equalsIgnoreCase(cVar.l()) || zIsEmpty2) {
                        if (zIsEmpty2) {
                            strB = strA2;
                        }
                        com.tencent.liteav.txcvodplayer.b.c.b bVar = cVar.f100060d;
                        if (bVar == null || TextUtils.isEmpty(bVar.f100079a)) {
                            LiteavLog.e("VodPreloadUtil", "overlayKey is null fileId=" + tXPlayInfoParams2.getFileId());
                            pair = new Pair(strB, strB);
                        } else {
                            String strA3 = TXCHLSEncoder.a(tXPlayInfoParams2.getAppId(), "default", tXPlayInfoParams2.getFileId(), 0);
                            String strA4 = TXCHLSEncoder.a(strA3, bVar.f100079a);
                            String strA5 = TXCHLSEncoder.a(strA3, bVar.f100080b);
                            if (TextUtils.isEmpty(strA4) || TextUtils.isEmpty(strA5)) {
                                LiteavLog.e("VodPreloadUtil", "create local key exception for fileId=" + tXPlayInfoParams2.getFileId());
                                pair = new Pair(strB, strB);
                            } else {
                                com.tencent.liteav.txcvodplayer.c.a.a().a(tXPlayInfoParams2.getAppId(), tXPlayInfoParams2.getFileId(), bVar);
                                String strA6 = com.tencent.liteav.txcplayer.a.a.a(strB, cVar.d());
                                String strA7 = com.tencent.liteav.txcplayer.a.a.a(strA6, tXPlayInfoParams2.getFileId(), strL2, tXPlayInfoParams2.getAppId());
                                StringBuilder sb2 = new StringBuilder();
                                sb2.append(strA7);
                                StringBuilder sb3 = new StringBuilder();
                                sb3.append("&oversign=");
                                sb3.append(tXPlayInfoParams2.getAppId());
                                sb3.append("&o1=default&o2=");
                                sb3.append(tXPlayInfoParams2.getFileId());
                                sb3.append("&o3=&o4=");
                                sb3.append(strA4);
                                sb3.append("&o5=");
                                sb3.append(strA5);
                                if (j11 > 0) {
                                    sb3.append("&o6=");
                                    sb3.append(j11);
                                }
                                String strM = cVar.m();
                                if (!TextUtils.isEmpty(strM)) {
                                    sb3.append("&o7=");
                                    sb3.append(strM);
                                }
                                if (sb3.length() > 0) {
                                    sb3.append("&oversign=");
                                }
                                sb2.append(sb3.toString());
                                pair = new Pair(strA6, sb2.toString());
                            }
                        }
                    } else {
                        LiteavLog.e("VodPreloadUtil", "invalid drmType=" + cVar.l() + " ,fileId=" + tXPlayInfoParams2.getFileId());
                        pair = new Pair(strB, strB);
                    }
                }
                bundle.putString("EVT_PLAY_URL", (String) pair.second);
                bundle.putString("EVT_PLAY_COVER_URL", cVar.c());
                bundle.putString("EVT_PLAY_NAME", cVar.e());
                bundle.putString("EVT_PLAY_DESCRIPTION", cVar.f());
                bundle.putInt("EVT_PLAY_DURATION", cVar.g());
                if (!TextUtils.isEmpty(cVar.l())) {
                    strL3 = cVar.l();
                }
                bundle.putString(TXVodConstants.EVT_DRM_TYPE, strL3);
                com.tencent.liteav.txcvodplayer.b.c.C0963c c0963cI = cVar.i();
                if (c0963cI != null) {
                    bundle.putString(TXVodConstants.EVT_IMAGESPRIT_WEBVTTURL, c0963cI.f100084b);
                    bundle.putStringArrayList(TXVodConstants.EVT_IMAGESPRIT_IMAGEURL_LIST, c0963cI.f100083a);
                }
                List<com.tencent.liteav.txcvodplayer.b.c.d> listJ = cVar.j();
                if (listJ != null && !listJ.isEmpty()) {
                    ArrayList<String> arrayList = new ArrayList<>();
                    float[] fArr = new float[listJ.size()];
                    for (int i10 = 0; i10 < listJ.size(); i10++) {
                        arrayList.add(listJ.get(i10).f100085a);
                        fArr[i10] = listJ.get(i10).f100086b;
                    }
                    bundle.putStringArrayList(TXVodConstants.EVT_KEY_FRAME_CONTENT_LIST, arrayList);
                    bundle.putFloatArray(TXVodConstants.EVT_KEY_FRAME_TIME_LIST, fArr);
                }
                bundle.putString(TXVodConstants.EVT_DRM_TYPE, cVar.l());
                ArrayList arrayList2 = new ArrayList();
                arrayList2.add(pair.first);
                HashMap map = new HashMap();
                if (tXPlayInfoParams.getHeaders() != null && tXPlayInfoParams.getHeaders().size() > 0) {
                    ArrayList arrayList3 = new ArrayList();
                    arrayList3.add(tXPlayInfoParams.getHeaders());
                    map.put(TPDownloadProxyEnum.DLPARAM_URL_HEADER, arrayList3);
                }
                map.put(TPDownloadProxyEnum.DLPARAM_PRELOAD_SIZE, Float.valueOf(f10 * 1024.0f * 1024.0f));
                map.put(TPDownloadProxyEnum.DLPARAM_PREFERRED_RESOLUTION, Long.valueOf(j10));
                if (tXPlayInfoParams.getEncryptedMp4Level() == 2 && c.a(LicenseChecker.a.PLAYER_PREMIUM)) {
                    map.put(TPDownloadProxyEnum.DLPARAM_CACHE_NEED_ENCRYPT, Boolean.TRUE);
                }
                if (!TextUtils.isEmpty(cVar.m())) {
                    map.put(TPDownloadProxyEnum.DLPARAM_KEY_LICENSE_URL, cVar.m());
                    map.put(TPDownloadProxyEnum.DLPARAM_DEVICE_CERTIFICATE_URL, new TXPlayerDrmBuilder().getDeviceCertificateUrl());
                }
                TPDownloadParam tPDownloadParam = new TPDownloadParam(arrayList2, TXVodPreloadManager.this.checkDlType(tXPlayInfoParams.getMediaType(), (String) pair.first), map);
                b bVar2 = new b(TXVodPreloadManager.this.mTpDownloadProxy, (String) pair.second, iTXVodFilePreloadListener);
                int iStartPreload = TXVodPreloadManager.this.mTpDownloadProxy.startPreload(com.tencent.liteav.txcplayer.a.a.d((String) pair.first), tPDownloadParam, bVar2);
                bVar2.f102066a = iStartPreload;
                atomicInteger.set(iStartPreload);
                countDownLatch.countDown();
                if (iTXVodFilePreloadListener != null) {
                    LiteavLog.i(TXVodPreloadManager.TAG, "startPreload for TXPlayInfoParams success, playInfoParams: " + tXPlayInfoParams + " ,taskID: " + iStartPreload);
                    iTXVodFilePreloadListener.onStart(iStartPreload, tXPlayInfoParams2.getFileId(), (String) pair.second, bundle);
                }
            }
        });
        try {
            countDownLatch.await(8L, TimeUnit.SECONDS);
        } catch (InterruptedException e10) {
            e10.printStackTrace();
        }
        return atomicInteger.get();
    }

    public int startPreload(String str, float f10, long j10, ITXVodPreloadListener iTXVodPreloadListener) {
        LiteavLog.i(TAG, "startPreload for url, url: " + str + " ,preloadSizeMB: " + f10 + " ,preferredResolution: " + j10 + " ,listener: " + iTXVodPreloadListener);
        return startPreload(str, f10, j10, iTXVodPreloadListener, 0, 0, null);
    }

    public void stopPreload(int i10) {
        LiteavLog.i(TAG, "stopPreload, taskID: ".concat(String.valueOf(i10)));
        if (((Integer) checkInit().first).intValue() < 0) {
            return;
        }
        this.mTpDownloadProxy.stopPreload(i10);
    }
}
