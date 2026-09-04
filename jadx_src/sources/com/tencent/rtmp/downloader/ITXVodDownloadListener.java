package com.tencent.rtmp.downloader;

/* JADX INFO: loaded from: classes4.dex */
public interface ITXVodDownloadListener {
    int hlsKeyVerify(TXVodDownloadMediaInfo tXVodDownloadMediaInfo, String str, byte[] bArr);

    void onDownloadError(TXVodDownloadMediaInfo tXVodDownloadMediaInfo, int i10, String str);

    void onDownloadFinish(TXVodDownloadMediaInfo tXVodDownloadMediaInfo);

    void onDownloadProgress(TXVodDownloadMediaInfo tXVodDownloadMediaInfo);

    void onDownloadStart(TXVodDownloadMediaInfo tXVodDownloadMediaInfo);

    void onDownloadStop(TXVodDownloadMediaInfo tXVodDownloadMediaInfo);
}
