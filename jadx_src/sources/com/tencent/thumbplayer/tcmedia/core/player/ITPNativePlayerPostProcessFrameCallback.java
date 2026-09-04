package com.tencent.thumbplayer.tcmedia.core.player;

import com.tencent.thumbplayer.tcmedia.core.common.TPPostProcessFrame;

/* JADX INFO: loaded from: classes4.dex */
public interface ITPNativePlayerPostProcessFrameCallback {
    public static final int EVENT_EOS = 1;
    public static final int EVENT_FLUSH = 2;

    TPPostProcessFrame onPostProcessFrame(TPPostProcessFrame tPPostProcessFrame, int i10);
}
