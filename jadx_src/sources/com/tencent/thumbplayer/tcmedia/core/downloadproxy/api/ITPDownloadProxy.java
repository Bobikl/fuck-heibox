package com.tencent.thumbplayer.tcmedia.core.downloadproxy.api;

import android.content.Context;

/* JADX INFO: loaded from: classes4.dex */
public interface ITPDownloadProxy {
    boolean checkResourceExist(String str, String str2, long j10);

    int checkResourceStatus(String str, String str2, int i10);

    @Deprecated
    int clearCache(String str, String str2, int i10);

    int clearCache(String str, String str2, int i10, long j10);

    int deinit();

    int deleteOfflineLicenseKeySetId(String str, String str2, String str3);

    String getClipPlayUrl(int i10, int i11, int i12);

    String getNativeInfo(int i10);

    byte[] getOfflineLicenseKeySetId(String str, String str2, String str3);

    TPDLProxyMsg.TPPDTInfo[] getPDTInfos(int i10);

    String getPlayErrorCodeStr(int i10);

    String getPlayUrl(int i10, int i11);

    float getResourceDownloadProgress(String str, String str2, long j10);

    long getResourceSize(String str, String str2);

    int init(Context context, TPDLProxyInitParam tPDLProxyInitParam);

    int pauseDownload(int i10);

    void pushEvent(int i10);

    @Deprecated
    int removeStorageCache(String str);

    int removeStorageCache(String str, long j10);

    int resumeDownload(int i10);

    boolean setClipInfo(int i10, int i11, String str, TPDownloadParam tPDownloadParam);

    void setLogListener(ITPDLProxyLogListener iTPDLProxyLogListener);

    void setMaxStorageSizeMB(long j10);

    void setPlayState(int i10, int i11);

    void setUserData(String str, Object obj);

    int startClipOfflineDownload(String str, int i10, ITPOfflineDownloadListener iTPOfflineDownloadListener);

    int startClipPlay(String str, int i10, ITPPlayListener iTPPlayListener);

    int startClipPreload(String str, int i10, ITPPreLoadListener iTPPreLoadListener);

    int startOfflineDownload(String str, TPDownloadParam tPDownloadParam, ITPOfflineDownloadListener iTPOfflineDownloadListener);

    int startPlay(String str, TPDownloadParam tPDownloadParam, ITPPlayListener iTPPlayListener);

    int startPreload(String str, TPDownloadParam tPDownloadParam, ITPPreLoadListener iTPPreLoadListener);

    void startTask(int i10);

    void stopOfflineDownload(int i10);

    void stopPlay(int i10);

    void stopPreload(int i10);

    void switchToResolution(int i10, int i11, int i12);

    void updateStoragePath(String str);

    void updateTaskInfo(int i10, String str, Object obj);
}
