package com.tencent.thumbplayer.tcmedia.core.player;

import com.tencent.thumbplayer.tcmedia.core.common.TPVideoPacket;

/* JADX INFO: loaded from: classes4.dex */
public interface ITPNativePlayerSurfaceCallback {
    void onFlush();

    void onRenderInfo(TPNativePlayerSurfaceRenderInfo tPNativePlayerSurfaceRenderInfo);

    void onVideoPacket(TPVideoPacket tPVideoPacket);
}
