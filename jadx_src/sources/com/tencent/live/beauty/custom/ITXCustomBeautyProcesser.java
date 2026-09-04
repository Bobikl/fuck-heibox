package com.tencent.live.beauty.custom;

/* JADX INFO: loaded from: classes4.dex */
public interface ITXCustomBeautyProcesser {
    TXCustomBeautyDef.TXCustomBeautyBufferType getSupportedBufferType();

    TXCustomBeautyDef.TXCustomBeautyPixelFormat getSupportedPixelFormat();

    void onProcessVideoFrame(TXCustomBeautyDef.TXCustomBeautyVideoFrame tXCustomBeautyVideoFrame, TXCustomBeautyDef.TXCustomBeautyVideoFrame tXCustomBeautyVideoFrame2);
}
