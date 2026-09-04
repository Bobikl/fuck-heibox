package com.tencent.liteav.videobase.frame;

import com.tencent.liteav.base.annotations.JNINamespace;

/* JADX INFO: loaded from: classes4.dex */
@JNINamespace("liteav::video")
public class MirrorInfo {
    public boolean isHorizontal;
    public boolean isVertical;

    public MirrorInfo() {
        this.isHorizontal = false;
        this.isVertical = false;
    }

    public MirrorInfo(boolean z10, boolean z11) {
        this.isHorizontal = z10;
        this.isVertical = z11;
    }
}
