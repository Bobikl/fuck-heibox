package com.bytedance.realx;

import android.view.Surface;
import com.bytedance.realx.base.CalledByNative;

/* JADX INFO: loaded from: classes6.dex */
public class RXVideoSurfaceController {
    private static RXVideoSurfaceController instance = new RXVideoSurfaceController();
    private boolean usePassSurfaceMode = false;
    private RXSurfaceListener mSurfaceLisener = null;

    public interface RXSurfaceListener {
        void onSurfaceAvailable(Surface surface);
    }

    private RXVideoSurfaceController() {
    }

    @CalledByNative
    public static RXVideoSurfaceController getInstance() {
        return instance;
    }

    public void setPassSurfaceMode(boolean z10) {
        this.usePassSurfaceMode = z10;
    }

    public void setSurface(Surface surface) {
        RXSurfaceListener rXSurfaceListener = this.mSurfaceLisener;
        if (rXSurfaceListener != null) {
            rXSurfaceListener.onSurfaceAvailable(surface);
        }
    }

    public void setSurfaceListener(RXSurfaceListener rXSurfaceListener) {
        this.mSurfaceLisener = rXSurfaceListener;
    }

    @CalledByNative
    public boolean usePassSurfaceMode() {
        return this.usePassSurfaceMode;
    }
}
