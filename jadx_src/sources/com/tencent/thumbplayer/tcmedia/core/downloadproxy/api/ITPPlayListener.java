package com.tencent.thumbplayer.tcmedia.core.downloadproxy.api;

import java.util.Map;

/* JADX INFO: loaded from: classes4.dex */
public interface ITPPlayListener {
    public static final int MESSAGE_FLV_PRELOAD_STATUS = 5;
    public static final int MESSAGE_HTTP_HEADER = 3;
    public static final int MESSAGE_MULTI_NETWORK_LOW_SPEED = 10;
    public static final int MESSAGE_MULTI_NETWORK_STATUS = 11;
    public static final int MESSAGE_NOTIFY_M3U8_CONTENT = 4;
    public static final int MESSAGE_NOTIFY_PLAYER_SWITCH_DEFINITION = 2;
    public static final int MESSAGE_PLAY_VIDEO_NO_MORE_CACHE = 1;
    public static final int MESSAGE_QUIC_DOWNLOAD_STATUS = 6;
    public static final int MESSAGE_TAB_TESTID = 8;
    public static final int MSG_M3U8_REFRESH = 9;
    public static final int MSG_NOTIFY_HIT_CACHE = 12;

    long getAdvRemainTime();

    String getContentType(int i10, String str);

    int getCurrentPlayClipNo();

    long[] getCurrentPlayOffset();

    long getCurrentPosition();

    String getDataFilePath(int i10, String str);

    long getDataTotalSize(int i10, String str);

    Object getPlayInfo(long j10);

    Object getPlayInfo(String str);

    long getPlayerBufferLength();

    void onDownloadCdnUrlExpired(Map<String, String> map);

    void onDownloadCdnUrlInfoUpdate(String str, String str2, String str3, String str4);

    void onDownloadCdnUrlUpdate(String str);

    void onDownloadError(int i10, int i11, String str);

    void onDownloadFinish();

    void onDownloadProgressUpdate(int i10, int i11, long j10, long j11, String str);

    void onDownloadProtocolUpdate(String str, String str2);

    void onDownloadStatusUpdate(int i10);

    Object onPlayCallback(int i10, Object obj, Object obj2, Object obj3, Object obj4);

    int onReadData(int i10, String str, long j10, long j11);

    int onStartReadData(int i10, String str, long j10, long j11);

    int onStopReadData(int i10, String str, int i11);
}
