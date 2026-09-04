package com.tencent.thumbplayer.tcmedia.core.player;

import android.graphics.SurfaceTexture;
import android.view.Surface;

/* JADX INFO: loaded from: classes4.dex */
public class TPNativePlayerSurface extends Surface {
    private ITPNativePlayerSurfaceCallback mSurfaceCallback;

    public TPNativePlayerSurface(SurfaceTexture surfaceTexture) {
        super(surfaceTexture);
    }

    public void setTPSurfaceCallback(ITPNativePlayerSurfaceCallback iTPNativePlayerSurfaceCallback) {
        this.mSurfaceCallback = iTPNativePlayerSurfaceCallback;
    }
}
