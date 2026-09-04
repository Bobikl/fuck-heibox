package com.tencent.ugc.decoder;

import android.media.MediaCodec;
import android.media.MediaFormat;
import android.view.Surface;
import com.tencent.liteav.base.util.CustomHandler;
import com.tencent.liteav.base.util.LiteavLog;
import com.tencent.liteav.base.util.Size;
import com.tencent.ugc.videobase.frame.PixelFrame;
import com.tencent.ugc.videobase.utils.HardwareDecoderMediaFormatBuilder;
import java.util.concurrent.TimeUnit;

/* JADX INFO: loaded from: classes4.dex */
public class MediaCodecHDRDecoder extends MediaCodecDecoder {
    private Surface mOutputSurface;

    public MediaCodecHDRDecoder(HardwareDecoderMediaFormatBuilder hardwareDecoderMediaFormatBuilder, Size size, boolean z10, MediaCodecDecoder.MediaCodecDecoderListener mediaCodecDecoderListener, CustomHandler customHandler) {
        super(hardwareDecoderMediaFormatBuilder, size, z10, mediaCodecDecoderListener, customHandler);
        this.mTAG = "MediaCodecHDRDecoder" + hashCode();
    }

    @Override // com.tencent.ugc.decoder.MediaCodecDecoder
    protected boolean configureMediaCodec(MediaCodec mediaCodec, MediaFormat mediaFormat) {
        Surface surface = this.mOutputSurface;
        if (surface == null) {
            return false;
        }
        MediaCodecWrapper.configure(mediaCodec, mediaFormat, surface, null, 0);
        return true;
    }

    @Override // com.tencent.ugc.decoder.MediaCodecDecoder
    protected boolean handleOutputBuffer(MediaCodec mediaCodec, MediaCodec.BufferInfo bufferInfo, int i10) {
        mediaCodec.releaseOutputBuffer(i10, true);
        if ((bufferInfo.flags & 4) != 0) {
            LiteavLog.i(this.mTAG, "meet end of stream.");
            MediaCodecDecoder.MediaCodecDecoderListener mediaCodecDecoderListener = this.mListener;
            if (mediaCodecDecoderListener != null) {
                mediaCodecDecoderListener.onDecodeFrame(null, true);
            }
        } else {
            PixelFrame pixelFrame = new PixelFrame();
            pixelFrame.setWidth(this.mResolution.width);
            pixelFrame.setHeight(this.mResolution.height);
            pixelFrame.setTimestamp(TimeUnit.MICROSECONDS.toMillis(bufferInfo.presentationTimeUs));
            MediaCodecDecoder.MediaCodecDecoderListener mediaCodecDecoderListener2 = this.mListener;
            if (mediaCodecDecoderListener2 != null) {
                mediaCodecDecoderListener2.onDecodeFrame(pixelFrame, false);
            }
        }
        return false;
    }

    public void setOutputSurface(Surface surface) {
        runOnWorkThread(i.a(this, surface));
    }

    @Override // com.tencent.ugc.decoder.MediaCodecDecoder
    public boolean start(Object obj) {
        return true;
    }

    @Override // com.tencent.ugc.decoder.MediaCodecDecoder
    protected void updateOutputSurface(MediaCodec mediaCodec) {
    }
}
