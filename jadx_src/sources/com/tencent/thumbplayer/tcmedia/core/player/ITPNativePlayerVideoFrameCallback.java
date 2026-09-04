package com.tencent.thumbplayer.tcmedia.core.player;

import com.tencent.thumbplayer.tcmedia.core.common.TPVideoFrame;

/* JADX INFO: loaded from: classes4.dex */
public interface ITPNativePlayerVideoFrameCallback {
    public static final int FLAG_EOS = 1;
    public static final int FLAG_MULTITRACK_END = 4;
    public static final int FLAG_MULTITRACK_START = 2;

    void onVideoFrame(TPVideoFrame tPVideoFrame, int i10);
}
