package com.tencent.rtmp.downloader.a;

import android.app.Application;
import android.content.Context;
import android.os.Parcel;
import android.text.TextUtils;
import android.util.Base64;
import com.tencent.liteav.base.ContextUtils;
import com.tencent.liteav.base.storage.PersistStorage;
import com.tencent.liteav.base.util.LiteavLog;
import com.tencent.liteav.txcvodplayer.b.e;
import com.tencent.liteav.txcvodplayer.b.f;
import com.tencent.liteav.txcvodplayer.b.g;
import com.tencent.rtmp.TXPlayerAuthBuilder;
import com.tencent.rtmp.TXPlayerDrmBuilder;
import com.tencent.rtmp.downloader.ITXVodDownloadListener;
import com.tencent.rtmp.downloader.TXVodDownloadDataSource;
import com.tencent.rtmp.downloader.TXVodDownloadMediaInfo;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: loaded from: classes4.dex */
public final class b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public d f102070a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public ArrayList<c> f102071b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public ITXVodDownloadListener f102072c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    d.a f102073d = new d.a() { // from class: com.tencent.rtmp.downloader.a.b.3
        @Override // com.tencent.rtmp.downloader.a.d.a
        public final void a(c cVar) {
            if (cVar != null) {
                LiteavLog.i("TXVodDownloadManagerImpl", "downloadBegin " + cVar.getPlayPath());
                cVar.d(1);
                b.a(b.this, cVar);
                ITXVodDownloadListener iTXVodDownloadListener = b.this.f102072c;
                if (iTXVodDownloadListener != null) {
                    iTXVodDownloadListener.onDownloadStart(cVar);
                }
            }
        }

        @Override // com.tencent.rtmp.downloader.a.d.a
        public final void a(c cVar, int i10, String str) {
            if (cVar != null) {
                LiteavLog.w("TXVodDownloadManagerImpl", "downloadError " + cVar.getPlayPath() + " " + i10 + " ： " + str);
                cVar.d(3);
                b.a(b.this, cVar);
                synchronized (b.this.f102071b) {
                    b.this.f102071b.remove(cVar);
                }
                if (b.this.f102072c != null) {
                    if (cVar.getDownloadState() == 2) {
                        b.this.f102072c.onDownloadStop(cVar);
                        return;
                    }
                    if (i10 == 1008) {
                        b.this.f102072c.onDownloadError(cVar, -5006, str);
                    } else if (i10 == 14020003) {
                        b.this.f102072c.onDownloadError(cVar, -5008, str);
                    } else {
                        b.this.f102072c.onDownloadError(cVar, -5005, str);
                    }
                }
            }
        }

        @Override // com.tencent.rtmp.downloader.a.d.a
        public final void b(c cVar) {
            if (cVar != null) {
                LiteavLog.i("TXVodDownloadManagerImpl", "downloadEnd " + cVar.getPlayPath());
                cVar.d(2);
                b.a(b.this, cVar);
                synchronized (b.this.f102071b) {
                    b.this.f102071b.remove(cVar);
                }
                ITXVodDownloadListener iTXVodDownloadListener = b.this.f102072c;
                if (iTXVodDownloadListener != null) {
                    iTXVodDownloadListener.onDownloadStop(cVar);
                }
            }
        }

        @Override // com.tencent.rtmp.downloader.a.d.a
        public final void c(c cVar) {
            if (cVar != null) {
                LiteavLog.i("TXVodDownloadManagerImpl", "downloadFinish " + cVar.getPlayPath());
                cVar.d(4);
                b.a(b.this, cVar);
                synchronized (b.this.f102071b) {
                    b.this.f102071b.remove(cVar);
                }
                ITXVodDownloadListener iTXVodDownloadListener = b.this.f102072c;
                if (iTXVodDownloadListener != null) {
                    iTXVodDownloadListener.onDownloadFinish(cVar);
                }
            }
        }

        @Override // com.tencent.rtmp.downloader.a.d.a
        public final void d(c cVar) {
            ITXVodDownloadListener iTXVodDownloadListener;
            if (cVar == null || (iTXVodDownloadListener = b.this.f102072c) == null) {
                return;
            }
            iTXVodDownloadListener.onDownloadProgress(cVar);
        }
    };

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private PersistStorage f102074e;

    public b() {
        Context contextB = b();
        d dVarA = d.a(contextB);
        this.f102070a = dVarA;
        if (dVarA != null) {
            dVarA.f102085b = this.f102073d;
        }
        this.f102071b = new ArrayList<>();
        if (contextB != null) {
            ContextUtils.initApplicationContext(contextB);
            ContextUtils.setDataDirectorySuffix("liteav");
            this.f102074e = new PersistStorage("vod_download");
        }
    }

    private static String a(String str, c cVar) {
        TXVodDownloadDataSource dataSource = cVar.getDataSource();
        StringBuilder sb2 = new StringBuilder();
        if (dataSource != null && !TextUtils.isEmpty(dataSource.getOverlayKey())) {
            sb2.append("&oversign=");
            sb2.append(dataSource.getAppId());
            sb2.append("&o1=");
            sb2.append(dataSource.getUserName());
            sb2.append("&o2=");
            sb2.append(dataSource.getFileId());
            sb2.append("&o3=");
            sb2.append(dataSource.getQuality());
            sb2.append("&o4=");
            sb2.append(dataSource.getOverlayKey());
            sb2.append("&o5=");
            sb2.append(dataSource.getOverlayIv());
        }
        if (cVar.getPreferredResolution() > 0) {
            if (sb2.length() == 0) {
                sb2.append("&oversign=");
            }
            sb2.append("&o6=");
            sb2.append(cVar.getPreferredResolution());
        }
        TXPlayerDrmBuilder drmBuilder = cVar.getDrmBuilder();
        if (drmBuilder != null) {
            String keyLicenseUrl = drmBuilder.getKeyLicenseUrl();
            if (!TextUtils.isEmpty(keyLicenseUrl)) {
                if (sb2.length() == 0) {
                    sb2.append("&oversign=");
                }
                sb2.append("&o7=");
                sb2.append(keyLicenseUrl);
            }
        }
        if (sb2.length() <= 0) {
            return str;
        }
        sb2.append("&oversign=");
        return str.concat(sb2.toString());
    }

    static /* synthetic */ void a(b bVar, c cVar) {
        String str;
        if (bVar.f102074e != null) {
            if (cVar == null) {
                str = "";
            } else {
                Parcel parcelObtain = Parcel.obtain();
                cVar.writeToParcel(parcelObtain, 0);
                parcelObtain.setDataPosition(0);
                String strEncodeToString = Base64.encodeToString(parcelObtain.marshall(), 2);
                parcelObtain.recycle();
                str = strEncodeToString;
            }
            if (TextUtils.isEmpty(str)) {
                return;
            }
            String strC = bVar.c(cVar);
            if (TextUtils.isEmpty(strC)) {
                return;
            }
            bVar.f102074e.put(strC, str);
            bVar.f102074e.commit();
            LiteavLog.i("TXVodDownloadManagerImpl", "saveDownloadMediaInfo key: " + strC + "| mediaInfo: " + str);
        }
    }

    /* JADX WARN: Code duplicated, block: B:54:0x00d9 A[ADDED_TO_REGION, REMOVE] */
    static /* synthetic */ void a(b bVar, c cVar, com.tencent.liteav.txcvodplayer.b.c cVar2) {
        TXPlayerDrmBuilder tXPlayerDrmBuilder;
        long jH;
        List<com.tencent.liteav.txcvodplayer.b.c.e> listK;
        List<com.tencent.liteav.txcvodplayer.b.c.e> listK2;
        int iAbs;
        if (cVar2 == null || cVar.getDataSource() == null) {
            ITXVodDownloadListener iTXVodDownloadListener = bVar.f102072c;
            if (iTXVodDownloadListener != null) {
                iTXVodDownloadListener.onDownloadError(cVar, -5001, "get substream infos failure");
                return;
            }
            return;
        }
        String strB = cVar2.b();
        String strA = cVar2.a("Widevine");
        com.tencent.liteav.txcvodplayer.b.c.e eVar = null;
        if (TextUtils.isEmpty(strA)) {
            strA = com.tencent.liteav.txcplayer.a.a.a(strB, cVar2.d());
            tXPlayerDrmBuilder = null;
        } else {
            tXPlayerDrmBuilder = new TXPlayerDrmBuilder(cVar2.m(), strA);
        }
        if (TextUtils.isEmpty(strA)) {
            ITXVodDownloadListener iTXVodDownloadListener2 = bVar.f102072c;
            if (iTXVodDownloadListener2 != null) {
                iTXVodDownloadListener2.onDownloadError(cVar, -5001, "get substream infos failure");
                return;
            }
            return;
        }
        cVar.a(cVar2.g() * 1000);
        int iA = a.a(cVar.getDataSource().getQuality());
        long j10 = -1;
        if (iA > 0 && (listK2 = cVar2.k()) != null && listK2.size() > 0) {
            int i10 = Integer.MAX_VALUE;
            int i11 = 0;
            int i12 = 0;
            while (true) {
                if (i11 >= listK2.size()) {
                    i11 = i12;
                    break;
                }
                com.tencent.liteav.txcvodplayer.b.c.e eVar2 = listK2.get(i11);
                int iMin = Math.min(eVar2.f100088b, eVar2.f100089c);
                if (iA >= iMin && (iAbs = Math.abs(iA - iMin)) <= i10) {
                    if (iAbs == 0) {
                        break;
                    }
                    i12 = i11;
                    i10 = iAbs;
                }
                i11++;
            }
            com.tencent.liteav.txcvodplayer.b.c.e eVar3 = listK2.get(i11);
            j10 = eVar3.f100088b * eVar3.f100089c;
        }
        if (j10 <= 0 || (listK = cVar2.k()) == null || listK.size() == 0) {
            jH = cVar2.h();
        } else {
            for (com.tencent.liteav.txcvodplayer.b.c.e eVar4 : listK) {
                if (j10 == eVar4.f100089c * eVar4.f100088b) {
                    eVar = eVar4;
                    break;
                }
            }
            if (eVar != null) {
                jH = eVar.f100091e;
                if (jH <= 0) {
                    jH = cVar2.h();
                }
            } else {
                jH = cVar2.h();
            }
        }
        cVar.a(jH);
        cVar.b(strA);
        cVar.c(j10);
        if (tXPlayerDrmBuilder != null) {
            cVar.a(tXPlayerDrmBuilder);
        }
        bVar.a(cVar);
    }

    private static Context b() {
        try {
            Method method = Class.forName("android.app.ActivityThread").getMethod("currentActivityThread", new Class[0]);
            if (method == null) {
                return null;
            }
            method.setAccessible(true);
            Object objInvoke = method.invoke(null, new Object[0]);
            Method method2 = objInvoke.getClass().getMethod("getApplication", new Class[0]);
            if (method2 == null) {
                return null;
            }
            return ((Application) method2.invoke(objInvoke, new Object[0])).getApplicationContext();
        } catch (Throwable th2) {
            th2.printStackTrace();
            return null;
        }
    }

    private c b(String str) {
        a aVar;
        if (TextUtils.isEmpty(str)) {
            return null;
        }
        byte[] bArrDecode = Base64.decode(str, 2);
        Parcel parcelObtain = Parcel.obtain();
        parcelObtain.unmarshall(bArrDecode, 0, bArrDecode.length);
        parcelObtain.setDataPosition(0);
        c cVarCreateFromParcel = c.CREATOR.createFromParcel(parcelObtain);
        parcelObtain.recycle();
        if (cVarCreateFromParcel == null) {
            return null;
        }
        if (d(cVarCreateFromParcel) == null) {
            if (cVarCreateFromParcel.getDownloadState() == 1) {
                cVarCreateFromParcel.d(2);
                cVarCreateFromParcel.a(this.f102070a.a(cVarCreateFromParcel));
            }
            if (!this.f102070a.b(cVarCreateFromParcel)) {
                cVarCreateFromParcel.a();
            }
        }
        if (!cVarCreateFromParcel.getPlayPath().contains("&oversign=") && (aVar = (a) cVarCreateFromParcel.getDataSource()) != null && !TextUtils.isEmpty(aVar.getOverlayKey())) {
            cVarCreateFromParcel.a(a(cVarCreateFromParcel.getPlayPath(), cVarCreateFromParcel));
        }
        return cVarCreateFromParcel;
    }

    private String c(TXVodDownloadMediaInfo tXVodDownloadMediaInfo) {
        TXVodDownloadDataSource dataSource = tXVodDownloadMediaInfo.getDataSource();
        if (dataSource != null) {
            if (TextUtils.isEmpty(dataSource.getFileId())) {
                return null;
            }
            return dataSource.getUserName() + lg.a.f131412e + dataSource.getAppId() + lg.a.f131412e + dataSource.getFileId() + lg.a.f131412e + dataSource.getQuality();
        }
        if (TextUtils.isEmpty(tXVodDownloadMediaInfo.getUrl())) {
            return null;
        }
        String str = lg.a.f131412e + com.tencent.liteav.txcplayer.a.a.b(tXVodDownloadMediaInfo.getUrl());
        if (!TextUtils.isEmpty(this.f102074e.getString(str))) {
            return str;
        }
        String str2 = tXVodDownloadMediaInfo.getUserName() + str;
        if (!TextUtils.isEmpty(this.f102074e.getString(str2)) || tXVodDownloadMediaInfo.getPreferredResolution() <= 0) {
            return str2;
        }
        return str2 + lg.a.f131412e + tXVodDownloadMediaInfo.getPreferredResolution();
    }

    private c d(TXVodDownloadMediaInfo tXVodDownloadMediaInfo) {
        c cVar = null;
        if (tXVodDownloadMediaInfo != null) {
            synchronized (this.f102071b) {
                for (c cVar2 : this.f102071b) {
                    if (cVar2.getPlayPath().equals(tXVodDownloadMediaInfo.getPlayPath())) {
                        cVar = cVar2;
                        break;
                    }
                }
            }
        }
        return cVar;
    }

    public final TXVodDownloadMediaInfo a(int i10, String str, int i11, String str2) {
        if (TextUtils.isEmpty(str)) {
            return null;
        }
        synchronized (this.f102071b) {
            for (c cVar : this.f102071b) {
                TXVodDownloadDataSource dataSource = cVar.getDataSource();
                if (dataSource != null && dataSource.getAppId() == i10 && dataSource.getFileId().equals(str) && dataSource.getQuality() == i11) {
                    return cVar;
                }
            }
            if (this.f102074e == null) {
                return null;
            }
            c cVar2 = new c();
            cVar2.a(new a(i10, str, i11, null, str2));
            return b(this.f102074e.getString(c(cVar2)));
        }
    }

    public final TXVodDownloadMediaInfo a(String str, long j10, String str2) {
        if (TextUtils.isEmpty(str)) {
            return null;
        }
        synchronized (this.f102071b) {
            for (c cVar : this.f102071b) {
                if (cVar.getUrl() != null && cVar.getUrl().equals(str)) {
                    return cVar;
                }
            }
            if (this.f102074e == null) {
                return null;
            }
            c cVar2 = new c();
            cVar2.b(str);
            cVar2.c(str2);
            if (j10 > 0) {
                cVar2.c(j10);
            }
            return b(this.f102074e.getString(c(cVar2)));
        }
    }

    public final c a(final TXVodDownloadDataSource tXVodDownloadDataSource) {
        final c cVar = new c();
        final a aVar = TextUtils.isEmpty(tXVodDownloadDataSource.getTemplateName()) ? new a(tXVodDownloadDataSource.getAuthBuilder(), tXVodDownloadDataSource.getQuality()) : new a(tXVodDownloadDataSource.getAuthBuilder(), tXVodDownloadDataSource.getTemplateName());
        cVar.a(aVar);
        c cVarA = a((TXVodDownloadMediaInfo) cVar);
        if (cVarA != null) {
            return cVarA;
        }
        if (tXVodDownloadDataSource.getAuthBuilder() == null) {
            return null;
        }
        TXPlayerAuthBuilder authBuilder = aVar.getAuthBuilder();
        com.tencent.liteav.txcvodplayer.b.d dVar = new com.tencent.liteav.txcvodplayer.b.d();
        dVar.f100095c = authBuilder.isHttps();
        dVar.a(new e() { // from class: com.tencent.rtmp.downloader.a.b.1
            @Override // com.tencent.liteav.txcvodplayer.b.e
            public final void a(com.tencent.liteav.txcvodplayer.b.d dVar2) {
                String templateName;
                String str;
                List<Integer> list;
                String str2;
                if (cVar.getDownloadState() == 2) {
                    synchronized (b.this.f102071b) {
                        b.this.f102071b.remove(cVar);
                    }
                    ITXVodDownloadListener iTXVodDownloadListener = b.this.f102072c;
                    if (iTXVodDownloadListener != null) {
                        iTXVodDownloadListener.onDownloadStop(cVar);
                    }
                    LiteavLog.w("TXVodDownloadManagerImpl", "Download task canceled");
                    return;
                }
                f fVarA = dVar2.a();
                g gVarF = null;
                if (tXVodDownloadDataSource.getQuality() != 1000) {
                    int quality = aVar.getQuality();
                    if (quality != 0) {
                        String strB = a.b(quality);
                        List<f.a> listK = fVarA.k();
                        if (listK == null) {
                            list = null;
                            break;
                        }
                        Iterator<f.a> it = listK.iterator();
                        while (true) {
                            if (!it.hasNext()) {
                                list = null;
                                break;
                            }
                            f.a next = it.next();
                            if (next.f100113a.equals(strB)) {
                                list = next.f100115c;
                                break;
                            }
                        }
                        if (list != null) {
                            for (g gVar : fVarA.e()) {
                                if (list.contains(Integer.valueOf(gVar.f100124i)) && ((str2 = gVar.f100122g) == null || str2.contains("hls"))) {
                                    gVarF = gVar;
                                    break;
                                }
                            }
                        }
                    } else {
                        gVarF = fVarA.f();
                    }
                } else if (tXVodDownloadDataSource.getTemplateName() != null && (templateName = aVar.getTemplateName()) != null) {
                    for (g gVar2 : fVarA.e()) {
                        if (templateName.equals(gVar2.f100123h) && ((str = gVar2.f100122g) == null || str.contains("hls"))) {
                            gVarF = gVar2;
                            break;
                        }
                    }
                }
                if (gVarF == null) {
                    synchronized (b.this.f102071b) {
                        b.this.f102071b.remove(cVar);
                    }
                    ITXVodDownloadListener iTXVodDownloadListener2 = b.this.f102072c;
                    if (iTXVodDownloadListener2 != null) {
                        iTXVodDownloadListener2.onDownloadError(cVar, -5003, "No such resolution");
                        return;
                    }
                    return;
                }
                String strA = gVarF.f100116a;
                TXVodDownloadDataSource tXVodDownloadDataSource2 = tXVodDownloadDataSource;
                if (tXVodDownloadDataSource2 != null) {
                    strA = com.tencent.liteav.txcplayer.a.a.a(strA, tXVodDownloadDataSource2.getToken());
                }
                cVar.b(strA);
                cVar.a(gVarF.f100119d);
                cVar.a(gVarF.f100120e * 1000);
                b.this.a(cVar);
            }

            @Override // com.tencent.liteav.txcvodplayer.b.e
            public final void a(com.tencent.liteav.txcvodplayer.b.d dVar2, String str, int i10) {
                synchronized (b.this.f102071b) {
                    b.this.f102071b.remove(cVar);
                }
                ITXVodDownloadListener iTXVodDownloadListener = b.this.f102072c;
                if (iTXVodDownloadListener != null) {
                    iTXVodDownloadListener.onDownloadError(cVar, -5001, str);
                }
            }
        });
        if (dVar.a(authBuilder.getAppId(), authBuilder.getFileId(), authBuilder.getTimeout(), authBuilder.getUs(), authBuilder.getExper(), authBuilder.getSign()) != 0) {
            LiteavLog.e("TXVodDownloadManagerImpl", "unable to getPlayInfo");
            return null;
        }
        cVar.a(dVar);
        synchronized (this.f102071b) {
            this.f102071b.add(cVar);
        }
        return cVar;
    }

    public final c a(TXVodDownloadMediaInfo tXVodDownloadMediaInfo) {
        c cVarB;
        String strC = c(tXVodDownloadMediaInfo);
        if (TextUtils.isEmpty(strC)) {
            return null;
        }
        String string = this.f102074e.getString(strC);
        if (TextUtils.isEmpty(string) || (cVarB = b(string)) == null) {
            return null;
        }
        LiteavLog.i("TXVodDownloadManagerImpl", "partly download, resume download");
        a(cVarB);
        return cVarB;
    }

    public final List<TXVodDownloadMediaInfo> a() {
        PersistStorage persistStorage = this.f102074e;
        if (persistStorage != null) {
            try {
                String[] allKeys = persistStorage.getAllKeys();
                if (allKeys == null) {
                    return null;
                }
                ArrayList arrayList = new ArrayList(allKeys.length);
                for (String str : allKeys) {
                    c cVarB = b(this.f102074e.getString(str));
                    c cVarD = d(cVarB);
                    if (cVarD != null) {
                        arrayList.add(cVarD);
                    } else {
                        arrayList.add(cVarB);
                    }
                }
                return arrayList;
            } catch (Exception e10) {
                e10.printStackTrace();
            }
        }
        return null;
    }

    public final void a(c cVar) {
        String url = cVar.getUrl();
        if (TextUtils.isEmpty(url)) {
            return;
        }
        cVar.a(a(this.f102070a.a(url), cVar));
        if (cVar.getPlayPath() == null) {
            ITXVodDownloadListener iTXVodDownloadListener = this.f102072c;
            if (iTXVodDownloadListener != null) {
                iTXVodDownloadListener.onDownloadError(cVar, -5007, "Failed to create local path");
                return;
            }
            return;
        }
        LiteavLog.i("TXVodDownloadManagerImpl", "download url " + url + " to " + cVar.getPlayPath());
        synchronized (this.f102071b) {
            this.f102071b.add(cVar);
        }
        cVar.c(this.f102070a.c(cVar));
        if (cVar.getTaskId() < 0) {
            LiteavLog.e("TXVodDownloadManagerImpl", "start download failed");
            ITXVodDownloadListener iTXVodDownloadListener2 = this.f102072c;
            if (iTXVodDownloadListener2 != null) {
                iTXVodDownloadListener2.onDownloadError(cVar, -5004, "Internal error");
            }
        }
    }

    public final boolean a(String str) {
        LiteavLog.i("TXVodDownloadManagerImpl", "delete file ".concat(String.valueOf(str)));
        synchronized (this.f102071b) {
            for (c cVar : this.f102071b) {
                if (cVar.getPlayPath() != null && cVar.getPlayPath().equals(str)) {
                    LiteavLog.e("TXVodDownloadManagerImpl", "file is downloading, can not be delete");
                    return false;
                }
            }
            return this.f102070a.a(str, -1L);
        }
    }

    public final boolean b(TXVodDownloadMediaInfo tXVodDownloadMediaInfo) {
        TXPlayerDrmBuilder drmBuilder;
        synchronized (this.f102071b) {
            for (c cVar : this.f102071b) {
                if (!TextUtils.isEmpty(cVar.getPlayPath()) && cVar.getPlayPath().equals(tXVodDownloadMediaInfo.getPlayPath())) {
                    LiteavLog.e("TXVodDownloadManagerImpl", "file is downloading, can not be delete");
                    return false;
                }
            }
            d dVar = this.f102070a;
            String playPath = tXVodDownloadMediaInfo.getPlayPath();
            boolean zA = dVar.a(playPath, tXVodDownloadMediaInfo.getPreferredResolution());
            if (zA && (drmBuilder = tXVodDownloadMediaInfo.getDrmBuilder()) != null) {
                String playUrl = drmBuilder.getPlayUrl();
                String keyLicenseUrl = drmBuilder.getKeyLicenseUrl();
                if (!TextUtils.isEmpty(playUrl) && !TextUtils.isEmpty(keyLicenseUrl)) {
                    String strSubstring = playPath.substring(0, playPath.indexOf("?"));
                    zA = dVar.f102087d.deleteOfflineLicenseKeySetId(strSubstring.substring(0, strSubstring.lastIndexOf("/")), playUrl, keyLicenseUrl) == 0;
                }
            }
            if (zA) {
                String strC = c(tXVodDownloadMediaInfo);
                PersistStorage persistStorage = this.f102074e;
                if (persistStorage != null) {
                    persistStorage.clear(strC);
                    this.f102074e.clear(strC + "_kv");
                    this.f102074e.commit();
                    TXVodDownloadDataSource dataSource = tXVodDownloadMediaInfo.getDataSource();
                    if (dataSource != null && !TextUtils.isEmpty(dataSource.getOverlayKey())) {
                        com.tencent.liteav.txcvodplayer.c.a aVarA = com.tencent.liteav.txcvodplayer.c.a.a();
                        int appId = dataSource.getAppId();
                        String fileId = dataSource.getFileId();
                        if (!TextUtils.isEmpty(fileId)) {
                            aVarA.f100126a.clear(com.tencent.liteav.txcvodplayer.c.a.b(appId, fileId));
                            aVarA.f100126a.commit();
                        }
                    }
                    LiteavLog.i("TXVodDownloadManagerImpl", "delete DownloadMediaInfo and file complete");
                    return true;
                }
            }
            return false;
        }
    }
}
