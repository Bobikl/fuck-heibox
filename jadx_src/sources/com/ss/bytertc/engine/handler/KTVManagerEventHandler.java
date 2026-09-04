package com.ss.bytertc.engine.handler;

import com.bytedance.realx.base.CalledByNative;
import com.ss.bytertc.engine.utils.LogUtil;
import com.ss.bytertc.ktv.IKTVManagerEventHandler;
import com.ss.bytertc.ktv.data.DownloadResult;
import com.ss.bytertc.ktv.data.HotMusicInfo;
import com.ss.bytertc.ktv.data.KTVErrorCode;
import com.ss.bytertc.ktv.data.MusicInfo;

/* JADX INFO: loaded from: classes4.dex */
public class KTVManagerEventHandler extends IKTVManagerEventHandler {
    private static final String TAG = "KTVManagerEventHandler";
    private final IKTVManagerEventHandler mHandler;

    public KTVManagerEventHandler(IKTVManagerEventHandler iKTVManagerEventHandler) {
        this.mHandler = iKTVManagerEventHandler;
    }

    public IKTVManagerEventHandler getKTVHandler() {
        return this.mHandler;
    }

    @Override // com.ss.bytertc.ktv.IKTVManagerEventHandler
    @CalledByNative
    public void onClearCacheResult(KTVErrorCode kTVErrorCode) {
        LogUtil.d(TAG, "onClearCacheResult...errorCode: " + kTVErrorCode);
        try {
            IKTVManagerEventHandler iKTVManagerEventHandler = this.mHandler;
            if (iKTVManagerEventHandler != null) {
                iKTVManagerEventHandler.onClearCacheResult(kTVErrorCode);
            }
        } catch (Exception e10) {
            LogUtil.e(TAG, "onClearCacheResult callback catch exception.\n" + e10.getMessage());
        }
    }

    @Override // com.ss.bytertc.ktv.IKTVManagerEventHandler
    @CalledByNative
    public void onDownloadFailed(int i10, KTVErrorCode kTVErrorCode) {
        LogUtil.d(TAG, "onDownloadFailed...downloadId: " + i10 + ",errorCode:" + kTVErrorCode);
        try {
            IKTVManagerEventHandler iKTVManagerEventHandler = this.mHandler;
            if (iKTVManagerEventHandler != null) {
                iKTVManagerEventHandler.onDownloadFailed(i10, kTVErrorCode);
            }
        } catch (Exception e10) {
            LogUtil.e(TAG, "onDownloadFailed callback catch exception.\n" + e10.getMessage());
        }
    }

    @Override // com.ss.bytertc.ktv.IKTVManagerEventHandler
    @CalledByNative
    public void onDownloadMusicProgress(int i10, int i11) {
        LogUtil.d(TAG, "onDownloadMusicProgress...downloadId: " + i10 + ",downloadProgress:" + i11);
        try {
            IKTVManagerEventHandler iKTVManagerEventHandler = this.mHandler;
            if (iKTVManagerEventHandler != null) {
                iKTVManagerEventHandler.onDownloadMusicProgress(i10, i11);
            }
        } catch (Exception e10) {
            LogUtil.e(TAG, "onDownloadMusicProgress callback catch exception.\n" + e10.getMessage());
        }
    }

    @Override // com.ss.bytertc.ktv.IKTVManagerEventHandler
    @CalledByNative
    public void onDownloadSuccess(int i10, DownloadResult downloadResult) {
        LogUtil.d(TAG, "onDownloadSuccess...downloadId: " + i10 + ",result:" + downloadResult);
        try {
            IKTVManagerEventHandler iKTVManagerEventHandler = this.mHandler;
            if (iKTVManagerEventHandler != null) {
                iKTVManagerEventHandler.onDownloadSuccess(i10, downloadResult);
            }
        } catch (Exception e10) {
            LogUtil.e(TAG, "onDownloadSuccess callback catch exception.\n" + e10.getMessage());
        }
    }

    @Override // com.ss.bytertc.ktv.IKTVManagerEventHandler
    @CalledByNative
    public void onHotMusicResult(HotMusicInfo[] hotMusicInfoArr, KTVErrorCode kTVErrorCode) {
        LogUtil.d(TAG, "onHotMusicResult...errorCode: " + kTVErrorCode + ",musicsLen:" + hotMusicInfoArr.length);
        try {
            IKTVManagerEventHandler iKTVManagerEventHandler = this.mHandler;
            if (iKTVManagerEventHandler != null) {
                iKTVManagerEventHandler.onHotMusicResult(hotMusicInfoArr, kTVErrorCode);
            }
        } catch (Exception e10) {
            LogUtil.e(TAG, "onHotMusicResult callback catch exception.\n" + e10.getMessage());
        }
    }

    @Override // com.ss.bytertc.ktv.IKTVManagerEventHandler
    @CalledByNative
    public void onMusicDetailResult(MusicInfo musicInfo, KTVErrorCode kTVErrorCode) {
        LogUtil.d(TAG, "onMusicDetailResult...errorCode: " + kTVErrorCode + ",music:" + musicInfo);
        try {
            IKTVManagerEventHandler iKTVManagerEventHandler = this.mHandler;
            if (iKTVManagerEventHandler != null) {
                iKTVManagerEventHandler.onMusicDetailResult(musicInfo, kTVErrorCode);
            }
        } catch (Exception e10) {
            LogUtil.e(TAG, "onMusicDetailResult callback catch exception.\n" + e10.getMessage());
        }
    }

    @Override // com.ss.bytertc.ktv.IKTVManagerEventHandler
    @CalledByNative
    public void onMusicListResult(MusicInfo[] musicInfoArr, int i10, KTVErrorCode kTVErrorCode) {
        LogUtil.d(TAG, "onMusicListResult...errorCode: " + kTVErrorCode + ",totalSize:" + i10 + ",musicsLen:" + musicInfoArr.length);
        try {
            IKTVManagerEventHandler iKTVManagerEventHandler = this.mHandler;
            if (iKTVManagerEventHandler != null) {
                iKTVManagerEventHandler.onMusicListResult(musicInfoArr, i10, kTVErrorCode);
            }
        } catch (Exception e10) {
            LogUtil.e(TAG, "onMusicListResult callback catch exception.\n" + e10.getMessage());
        }
    }

    @Override // com.ss.bytertc.ktv.IKTVManagerEventHandler
    @CalledByNative
    public void onSearchMusicResult(MusicInfo[] musicInfoArr, int i10, KTVErrorCode kTVErrorCode) {
        LogUtil.d(TAG, "onSearchMusicResult...errorCode: " + kTVErrorCode + ",totalSize:" + i10 + ",musicsLen:" + musicInfoArr.length);
        try {
            IKTVManagerEventHandler iKTVManagerEventHandler = this.mHandler;
            if (iKTVManagerEventHandler != null) {
                iKTVManagerEventHandler.onSearchMusicResult(musicInfoArr, i10, kTVErrorCode);
            }
        } catch (Exception e10) {
            LogUtil.e(TAG, "onSearchMusicResult callback catch exception.\n" + e10.getMessage());
        }
    }
}
