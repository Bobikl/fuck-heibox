package com.ss.bytertc.engine.handler;

import androidx.annotation.n0;
import com.bytedance.realx.base.CalledByNative;
import com.ss.bytertc.engine.utils.LogUtil;
import com.ss.bytertc.ktv.IKTVPlayerEventHandler;
import com.ss.bytertc.ktv.data.KTVPlayerErrorCode;
import com.ss.bytertc.ktv.data.PlayState;

/* JADX INFO: loaded from: classes4.dex */
public class KTVPlayEventHandler extends IKTVPlayerEventHandler {
    private static final String TAG = "KTVPlayEventHandler";
    private final IKTVPlayerEventHandler mHandler;

    public KTVPlayEventHandler(IKTVPlayerEventHandler iKTVPlayerEventHandler) {
        this.mHandler = iKTVPlayerEventHandler;
    }

    @Override // com.ss.bytertc.ktv.IKTVPlayerEventHandler
    @CalledByNative
    public void onPlayProgress(@n0 String str, long j10) {
        LogUtil.d(TAG, "onPlayProgress...musicId: " + str + ",progress:" + j10);
        try {
            IKTVPlayerEventHandler iKTVPlayerEventHandler = this.mHandler;
            if (iKTVPlayerEventHandler != null) {
                iKTVPlayerEventHandler.onPlayProgress(str, j10);
            }
        } catch (Exception e10) {
            LogUtil.e(TAG, "onPlayProgress callback catch exception.\n" + e10.getMessage());
        }
    }

    @Override // com.ss.bytertc.ktv.IKTVPlayerEventHandler
    @CalledByNative
    public void onPlayStateChanged(@n0 String str, @n0 PlayState playState, KTVPlayerErrorCode kTVPlayerErrorCode) {
        LogUtil.d(TAG, "onPlayStateChanged...musicId: " + str + ",playState:" + playState.toString());
        try {
            IKTVPlayerEventHandler iKTVPlayerEventHandler = this.mHandler;
            if (iKTVPlayerEventHandler != null) {
                iKTVPlayerEventHandler.onPlayStateChanged(str, playState, kTVPlayerErrorCode);
            }
        } catch (Exception e10) {
            LogUtil.e(TAG, "onPlayStateChanged callback catch exception.\n" + e10.getMessage());
        }
    }
}
