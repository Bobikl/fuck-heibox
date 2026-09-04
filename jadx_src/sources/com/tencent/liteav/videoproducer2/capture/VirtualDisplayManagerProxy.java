package com.tencent.liteav.videoproducer2.capture;

import android.media.projection.MediaProjection;
import android.view.Surface;
import com.tencent.liteav.base.ContextUtils;
import com.tencent.liteav.base.annotations.JNINamespace;
import com.tencent.liteav.base.util.LiteavLog;
import com.tencent.liteav.videoproducer.capture.VirtualDisplayManager;
import com.tencent.liteav.videoproducer.capture.h;
import com.tencent.liteav.videoproducer.capture.i;

/* JADX INFO: loaded from: classes4.dex */
@JNINamespace("liteav::video")
public class VirtualDisplayManagerProxy {
    private final VirtualDisplayManager mManager = VirtualDisplayManager.a(ContextUtils.getApplicationContext());

    public void startVirtualDisplaySync(Surface surface, int i10, int i11, MediaProjection mediaProjection, VirtualDisplayManager.VirtualDisplayListener virtualDisplayListener) {
        VirtualDisplayManager virtualDisplayManager = this.mManager;
        LiteavLog.i("VirtualDisplayManager", "startVirtualDisplaySync, surface:" + surface + ", width:" + i10 + ", height:" + i11 + ", mediaProjection: " + mediaProjection + ", listener:" + virtualDisplayListener);
        virtualDisplayManager.f100690a.b(h.a(virtualDisplayManager, surface, i10, i11, mediaProjection, virtualDisplayListener));
    }

    public void stopVirtualDisplaySync(Surface surface) {
        VirtualDisplayManager virtualDisplayManager = this.mManager;
        LiteavLog.i("VirtualDisplayManager", "stopVirtualDisplaySync, surface:".concat(String.valueOf(surface)));
        virtualDisplayManager.f100690a.b(i.a(virtualDisplayManager, surface));
    }
}
