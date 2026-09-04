package com.ss.bytertc.engine.video;

/* JADX INFO: loaded from: classes4.dex */
public class RTCWatermarkConfig {
    public ByteWatermark positionInLandscapeMode;
    public ByteWatermark positionInPortraitMode;
    public boolean visibleInPreview;

    public RTCWatermarkConfig() {
        this.visibleInPreview = true;
    }

    public RTCWatermarkConfig(boolean z10, ByteWatermark byteWatermark, ByteWatermark byteWatermark2) {
        this.visibleInPreview = z10;
        this.positionInLandscapeMode = byteWatermark;
        this.positionInPortraitMode = byteWatermark2;
    }
}
