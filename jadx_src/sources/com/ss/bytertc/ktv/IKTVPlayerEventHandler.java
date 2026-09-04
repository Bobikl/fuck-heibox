package com.ss.bytertc.ktv;

import androidx.annotation.n0;
import com.ss.bytertc.ktv.data.KTVPlayerErrorCode;
import com.ss.bytertc.ktv.data.PlayState;

/* JADX INFO: loaded from: classes4.dex */
public abstract class IKTVPlayerEventHandler {
    public abstract void onPlayProgress(@n0 String str, long j10);

    public abstract void onPlayStateChanged(@n0 String str, @n0 PlayState playState, KTVPlayerErrorCode kTVPlayerErrorCode);
}
