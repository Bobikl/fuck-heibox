package com.tencent.thumbplayer.tcmedia.core.player;

import com.tencent.thumbplayer.tcmedia.core.common.TPAudioFrame;

/* JADX INFO: loaded from: classes4.dex */
public interface ITPNativePlayerAudioFrameCallback {
    public static final int FLAG_EOS = 1;

    void onAudioFrame(TPAudioFrame tPAudioFrame, int i10);
}
