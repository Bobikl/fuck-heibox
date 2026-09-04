package com.tencent.ugc;

import com.tencent.ugc.videobase.frame.PixelFrame;

/* JADX INFO: loaded from: classes4.dex */
public class UGCVideoFrame extends PixelFrame {
    private boolean isEosFrame;

    public boolean isEosFrame() {
        return this.isEosFrame;
    }

    public void setEosFrame(boolean z10) {
        this.isEosFrame = z10;
    }
}
