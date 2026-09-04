package com.tencent.rtmp.downloader;

import android.text.TextUtils;
import com.tencent.liteav.base.util.LiteavLog;
import com.tencent.liteav.txcvodplayer.hlsencoder.TXCHLSEncoder;
import com.tencent.rtmp.TXPlayInfoParams;
import com.tencent.rtmp.TXPlayerDrmBuilder;
import com.tencent.rtmp.downloader.ITXVodDownloadListener;
import com.tencent.rtmp.downloader.a.a;
import com.tencent.rtmp.downloader.a.b;
import com.tencent.rtmp.downloader.a.c;
import com.tencent.rtmp.downloader.a.d;
import java.io.File;
import java.util.List;
import java.util.Map;

/* JADX INFO: loaded from: classes4.dex */
public class TXVodDownloadManager {
    public static final int DOWNLOAD_403FORBIDDEN = -5008;
    public static final int DOWNLOAD_AUTH_FAILED = -5001;
    public static final int DOWNLOAD_DISCONNECT = -5005;
    public static final int DOWNLOAD_FORMAT_ERROR = -5004;
    public static final int DOWNLOAD_HLS_KEY_ERROR = -5006;
    public static final int DOWNLOAD_NO_FILE = -5003;
    public static final int DOWNLOAD_PATH_ERROR = -5007;
    public static final int DOWNLOAD_SUCCESS = 0;
    private static final String TAG = "TXVodDownloadManager";
    private static TXVodDownloadManager sInstance;
    private final b mManagerImpl = new b();

    private TXVodDownloadManager() {
    }

    public static TXVodDownloadManager getInstance() {
        synchronized (TXVodDownloadManager.class) {
            if (sInstance == null) {
                sInstance = new TXVodDownloadManager();
            }
        }
        return sInstance;
    }

    @Deprecated
    public boolean deleteDownloadFile(String str) {
        return this.mManagerImpl.a(str);
    }

    public boolean deleteDownloadMediaInfo(TXVodDownloadMediaInfo tXVodDownloadMediaInfo) {
        return this.mManagerImpl.b(tXVodDownloadMediaInfo);
    }

    @Deprecated
    public TXVodDownloadMediaInfo getDownloadMediaInfo(int i10, String str, int i11) {
        return this.mManagerImpl.a(i10, str, i11, "");
    }

    public TXVodDownloadMediaInfo getDownloadMediaInfo(int i10, String str, int i11, String str2) {
        return this.mManagerImpl.a(i10, str, i11, str2);
    }

    @Deprecated
    public TXVodDownloadMediaInfo getDownloadMediaInfo(String str) {
        return getDownloadMediaInfo(str, -1L, "");
    }

    public TXVodDownloadMediaInfo getDownloadMediaInfo(String str, long j10, String str2) {
        return this.mManagerImpl.a(str, j10, str2);
    }

    public List<TXVodDownloadMediaInfo> getDownloadMediaInfoList() {
        return this.mManagerImpl.a();
    }

    @Deprecated
    public void setDownloadPath(String str) {
        d dVar = this.mManagerImpl.f102070a;
        if (TextUtils.isEmpty(str)) {
            return;
        }
        String strA = com.tencent.liteav.txcplayer.common.b.a();
        dVar.f102084a = strA;
        if (TextUtils.isEmpty(strA)) {
            String str2 = str + "/txcache";
            dVar.f102084a = str2;
            com.tencent.liteav.txcplayer.common.b.a(str2);
        }
        try {
            new File(dVar.f102084a).mkdirs();
        } catch (Exception e10) {
            LiteavLog.e("ThumbPlayerDownloader", "setDownloadPath exception: " + e10.getLocalizedMessage());
        }
    }

    public void setHeaders(Map<String, String> map) {
        this.mManagerImpl.f102070a.f102086c = map;
    }

    public void setListener(ITXVodDownloadListener iTXVodDownloadListener) {
        this.mManagerImpl.f102072c = iTXVodDownloadListener;
    }

    public TXVodDownloadMediaInfo startDownload(TXVodDownloadDataSource tXVodDownloadDataSource) {
        b bVar = this.mManagerImpl;
        if (tXVodDownloadDataSource.getAuthBuilder() != null) {
            LiteavLog.w("TXVodDownloadManagerImpl", "startDownloadV2");
            return bVar.a(tXVodDownloadDataSource);
        }
        LiteavLog.w("TXVodDownloadManagerImpl", "startDownloadV4");
        a aVar = new a(tXVodDownloadDataSource.getAppId(), tXVodDownloadDataSource.getFileId(), tXVodDownloadDataSource.getQuality(), tXVodDownloadDataSource.getPSign(), tXVodDownloadDataSource.getUserName());
        c cVar = new c();
        cVar.a(aVar);
        c cVarA = bVar.a((TXVodDownloadMediaInfo) cVar);
        if (cVarA != null) {
            return cVarA;
        }
        new com.tencent.liteav.txcvodplayer.b.c(new TXPlayInfoParams(aVar.getAppId(), aVar.getFileId(), aVar.getPSign())).a(new com.tencent.liteav.txcvodplayer.b.c.a() { // from class: com.tencent.rtmp.downloader.a.b.2

            /* JADX INFO: renamed from: a */
            final /* synthetic */ c f102079a;

            public AnonymousClass2() {
                cVar = cVar;
            }

            @Override // com.tencent.liteav.txcvodplayer.b.c.a
            public final void a(int i10, String str) {
                LiteavLog.w("TXVodDownloadManagerImpl", "onFail: errorCode = " + i10 + " message = " + str);
                synchronized (b.this.f102071b) {
                    b.this.f102071b.remove(cVar);
                }
                ITXVodDownloadListener iTXVodDownloadListener = b.this.f102072c;
                if (iTXVodDownloadListener != null) {
                    iTXVodDownloadListener.onDownloadError(cVar, -5001, str);
                }
            }

            @Override // com.tencent.liteav.txcvodplayer.b.c.a
            public final void a(com.tencent.liteav.txcvodplayer.b.c cVar2, TXPlayInfoParams tXPlayInfoParams) {
                com.tencent.liteav.txcvodplayer.b.c.b bVar2;
                LiteavLog.i("TXVodDownloadManagerImpl", "onSuccess: protocol params = " + tXPlayInfoParams.toString());
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
                if ("SimpleAES".equalsIgnoreCase(cVar2.l()) && (bVar2 = cVar2.f100060d) != null && !TextUtils.isEmpty(bVar2.f100079a)) {
                    a aVar2 = (a) cVar.getDataSource();
                    String strA = TXCHLSEncoder.a(aVar2.getAppId(), aVar2.getUserName(), aVar2.getFileId(), aVar2.getQuality());
                    String strA2 = TXCHLSEncoder.a(strA, bVar2.f100079a);
                    String strA3 = TXCHLSEncoder.a(strA, bVar2.f100080b);
                    if (TextUtils.isEmpty(strA2) || TextUtils.isEmpty(strA3)) {
                        LiteavLog.e("TXVodDownloadManagerImpl", "create local key exception!");
                        return;
                    } else {
                        aVar2.a(strA2);
                        aVar2.b(strA3);
                        com.tencent.liteav.txcvodplayer.c.a.a().a(tXPlayInfoParams.getAppId(), tXPlayInfoParams.getFileId(), bVar2);
                    }
                }
                b.a(b.this, cVar, cVar2);
            }
        });
        return cVar;
    }

    public TXVodDownloadMediaInfo startDownloadDrm(TXPlayerDrmBuilder tXPlayerDrmBuilder, long j10, String str) {
        b bVar = this.mManagerImpl;
        c cVar = new c();
        cVar.b(tXPlayerDrmBuilder.getPlayUrl());
        cVar.c(str);
        cVar.c(j10);
        cVar.a(tXPlayerDrmBuilder);
        c cVarA = bVar.a((TXVodDownloadMediaInfo) cVar);
        if (cVarA != null) {
            return cVarA;
        }
        bVar.a(cVar);
        return cVar;
    }

    @Deprecated
    public TXVodDownloadMediaInfo startDownloadUrl(String str) {
        return startDownloadUrl(str, -1L, "default");
    }

    public TXVodDownloadMediaInfo startDownloadUrl(String str, long j10, String str2) {
        b bVar = this.mManagerImpl;
        c cVar = new c();
        cVar.b(str);
        cVar.c(str2);
        cVar.c(j10);
        c cVarA = bVar.a((TXVodDownloadMediaInfo) cVar);
        if (cVarA != null) {
            return cVarA;
        }
        bVar.a(cVar);
        return cVar;
    }

    @Deprecated
    public TXVodDownloadMediaInfo startDownloadUrl(String str, String str2) {
        return startDownloadUrl(str, -1L, str2);
    }

    public void stopDownload(TXVodDownloadMediaInfo tXVodDownloadMediaInfo) {
        d.a aVar;
        b bVar = this.mManagerImpl;
        if (tXVodDownloadMediaInfo != null) {
            if (tXVodDownloadMediaInfo.getTaskId() < 0) {
                LiteavLog.w("TXVodDownloadManagerImpl", "stop download not start task");
                return;
            }
            synchronized (bVar.f102071b) {
                for (c cVar : bVar.f102071b) {
                    if (cVar.getTaskId() == tXVodDownloadMediaInfo.getTaskId()) {
                        d dVar = bVar.f102070a;
                        if (dVar.f102087d.pauseDownload(cVar.getTaskId()) == 0 && (aVar = dVar.f102085b) != null) {
                            aVar.b(cVar);
                        }
                        LiteavLog.i("TXVodDownloadManagerImpl", "stop download " + tXVodDownloadMediaInfo.getUrl());
                        break;
                    }
                }
            }
        }
    }
}
