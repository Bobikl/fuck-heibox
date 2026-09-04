package com.tencent.trtcplugin.listener;

import com.tencent.live.beauty.custom.ITXCustomBeautyProcesser;
import com.tencent.live.beauty.custom.ITXCustomBeautyProcesserFactory;
import com.tencent.live.beauty.custom.TXCustomBeautyDef;
import com.tencent.trtc.TRTCCloudDef;
import com.tencent.trtc.TRTCCloudListener;
import com.tencent.trtcplugin.TRTCCloudPlugin;

/* JADX INFO: loaded from: classes4.dex */
public class ProcessVideoFrame implements TRTCCloudListener.TRTCVideoFrameListener {
    private ITXCustomBeautyProcesser mCustomBeautyProcesser;

    public ProcessVideoFrame(ITXCustomBeautyProcesser iTXCustomBeautyProcesser) {
        this.mCustomBeautyProcesser = iTXCustomBeautyProcesser;
    }

    private static TXCustomBeautyDef.TXCustomBeautyVideoFrame createCustomBeautyVideoFrame(TRTCCloudDef.TRTCVideoFrame tRTCVideoFrame) {
        TXCustomBeautyDef.TXCustomBeautyVideoFrame tXCustomBeautyVideoFrame = new TXCustomBeautyDef.TXCustomBeautyVideoFrame();
        int i10 = tRTCVideoFrame.pixelFormat;
        if (i10 == 0) {
            tXCustomBeautyVideoFrame.pixelFormat = TXCustomBeautyDef.TXCustomBeautyPixelFormat.TXCustomBeautyPixelFormatUnknown;
        } else if (i10 == 1) {
            tXCustomBeautyVideoFrame.pixelFormat = TXCustomBeautyDef.TXCustomBeautyPixelFormat.TXCustomBeautyPixelFormatI420;
        } else if (i10 == 2) {
            tXCustomBeautyVideoFrame.pixelFormat = TXCustomBeautyDef.TXCustomBeautyPixelFormat.TXCustomBeautyPixelFormatTexture2D;
        }
        int i11 = tRTCVideoFrame.bufferType;
        if (i11 == 0) {
            tXCustomBeautyVideoFrame.bufferType = TXCustomBeautyDef.TXCustomBeautyBufferType.TXCustomBeautyBufferTypeUnknown;
        } else if (i11 == 2) {
            tXCustomBeautyVideoFrame.bufferType = TXCustomBeautyDef.TXCustomBeautyBufferType.TXCustomBeautyBufferTypeByteArray;
        } else if (i11 == 1) {
            tXCustomBeautyVideoFrame.bufferType = TXCustomBeautyDef.TXCustomBeautyBufferType.TXCustomBeautyBufferTypeByteBuffer;
        } else if (i11 == 3) {
            tXCustomBeautyVideoFrame.bufferType = TXCustomBeautyDef.TXCustomBeautyBufferType.TXCustomBeautyBufferTypeTexture;
        }
        if (tRTCVideoFrame.texture != null) {
            TXCustomBeautyDef.TXThirdTexture tXThirdTexture = new TXCustomBeautyDef.TXThirdTexture();
            tXCustomBeautyVideoFrame.texture = tXThirdTexture;
            TRTCCloudDef.TRTCTexture tRTCTexture = tRTCVideoFrame.texture;
            tXThirdTexture.textureId = tRTCTexture.textureId;
            tXThirdTexture.eglContext10 = tRTCTexture.eglContext10;
            tXThirdTexture.eglContext14 = tRTCTexture.eglContext14;
        }
        tXCustomBeautyVideoFrame.data = tRTCVideoFrame.data;
        tXCustomBeautyVideoFrame.buffer = tRTCVideoFrame.buffer;
        tXCustomBeautyVideoFrame.width = tRTCVideoFrame.width;
        tXCustomBeautyVideoFrame.height = tRTCVideoFrame.height;
        tXCustomBeautyVideoFrame.rotation = tRTCVideoFrame.rotation;
        tXCustomBeautyVideoFrame.timestamp = tRTCVideoFrame.timestamp;
        return tXCustomBeautyVideoFrame;
    }

    @Override // com.tencent.trtc.TRTCCloudListener.TRTCVideoFrameListener
    public void onGLContextCreated() {
    }

    @Override // com.tencent.trtc.TRTCCloudListener.TRTCVideoFrameListener
    public void onGLContextDestory() {
        ITXCustomBeautyProcesserFactory beautyProcesserFactory = TRTCCloudPlugin.getBeautyProcesserFactory();
        if (beautyProcesserFactory != null) {
            beautyProcesserFactory.destroyCustomBeautyProcesser();
        }
        this.mCustomBeautyProcesser = null;
    }

    @Override // com.tencent.trtc.TRTCCloudListener.TRTCVideoFrameListener
    public int onProcessVideoFrame(TRTCCloudDef.TRTCVideoFrame tRTCVideoFrame, TRTCCloudDef.TRTCVideoFrame tRTCVideoFrame2) {
        TXCustomBeautyDef.TXCustomBeautyVideoFrame tXCustomBeautyVideoFrameCreateCustomBeautyVideoFrame = createCustomBeautyVideoFrame(tRTCVideoFrame);
        TXCustomBeautyDef.TXCustomBeautyVideoFrame tXCustomBeautyVideoFrameCreateCustomBeautyVideoFrame2 = createCustomBeautyVideoFrame(tRTCVideoFrame2);
        ITXCustomBeautyProcesser iTXCustomBeautyProcesser = this.mCustomBeautyProcesser;
        if (iTXCustomBeautyProcesser != null) {
            iTXCustomBeautyProcesser.onProcessVideoFrame(tXCustomBeautyVideoFrameCreateCustomBeautyVideoFrame, tXCustomBeautyVideoFrameCreateCustomBeautyVideoFrame2);
        }
        TXCustomBeautyDef.TXThirdTexture tXThirdTexture = tXCustomBeautyVideoFrameCreateCustomBeautyVideoFrame2.texture;
        if (tXThirdTexture != null) {
            tRTCVideoFrame2.texture.textureId = tXThirdTexture.textureId;
        }
        tRTCVideoFrame2.data = tXCustomBeautyVideoFrameCreateCustomBeautyVideoFrame2.data;
        tRTCVideoFrame2.buffer = tXCustomBeautyVideoFrameCreateCustomBeautyVideoFrame2.buffer;
        tRTCVideoFrame2.width = tXCustomBeautyVideoFrameCreateCustomBeautyVideoFrame2.width;
        tRTCVideoFrame2.height = tXCustomBeautyVideoFrameCreateCustomBeautyVideoFrame2.height;
        tRTCVideoFrame2.rotation = tXCustomBeautyVideoFrameCreateCustomBeautyVideoFrame2.rotation;
        return 0;
    }
}
