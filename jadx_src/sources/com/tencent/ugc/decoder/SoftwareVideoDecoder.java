package com.tencent.ugc.decoder;

import com.tencent.liteav.base.annotations.JNINamespace;
import com.tencent.liteav.base.util.LiteavLog;
import com.tencent.liteav.videobase.base.GLConstants;
import com.tencent.ugc.videobase.common.EncodedVideoFrame;
import com.tencent.ugc.videobase.frame.PixelFrame;
import com.tencent.ugc.videobase.frame.PixelFramePool;
import java.nio.ByteBuffer;

/* JADX INFO: loaded from: classes4.dex */
@JNINamespace("liteav::ugc")
public class SoftwareVideoDecoder implements VideoDecoderInterface {
    private static final String TAG = "SoftwareVideoDecoder";
    private final boolean mIsUseHevc;
    private VideoDecoderListener mListener;
    private long mNativeVideoDecoderWrapper = 0;
    private PixelFramePool mPixelFramePool;

    public SoftwareVideoDecoder(boolean z10) {
        this.mIsUseHevc = z10;
    }

    private ByteBuffer getByteBufferFromPixelFrame(PixelFrame pixelFrame) {
        return pixelFrame.getBuffer();
    }

    private void handleDecoderError() {
        VideoDecoderListener videoDecoderListener = this.mListener;
        if (videoDecoderListener != null) {
            videoDecoderListener.onDecodeFailed();
        }
    }

    private static native void nativeAbandonDecodingFrames(long j10);

    private static native long nativeCreate(SoftwareVideoDecoder softwareVideoDecoder);

    private static native int nativeDecodeFrame(long j10, EncodedVideoFrame encodedVideoFrame);

    private static native void nativeDestroy(long j10);

    private static native int nativeStart(long j10, boolean z10);

    private static native int nativeStop(long j10);

    private PixelFrame obtainPixelFrame(int i10, int i11, int i12, int i13, long j10, int i14, int i15) {
        GLConstants.PixelFormatType pixelFormatTypeA = GLConstants.PixelFormatType.a(i10);
        if (pixelFormatTypeA == null) {
            handleDecoderError();
            LiteavLog.e(TAG, "obtainPixelFrame formatType: ".concat(String.valueOf(i10)));
            return null;
        }
        PixelFramePool pixelFramePool = this.mPixelFramePool;
        if (pixelFramePool == null) {
            LiteavLog.i(TAG, "obtainPixelFrame mPixelFramePool is null.");
            return null;
        }
        PixelFrame pixelFrameObtain = pixelFramePool.obtain(i11, i12, GLConstants.a.BYTE_BUFFER, pixelFormatTypeA);
        pixelFrameObtain.setColorFormat(GLConstants.ColorRange.a(i15), GLConstants.ColorSpace.a(i14));
        pixelFrameObtain.setRotation(com.tencent.liteav.base.util.l.a(i13));
        pixelFrameObtain.setTimestamp(j10);
        return pixelFrameObtain;
    }

    private void onDecodedFrame(PixelFrame pixelFrame, long j10) {
        if (j10 != 0) {
            handleDecoderError();
            LiteavLog.e(TAG, "decode failed.".concat(String.valueOf(j10)));
            if (pixelFrame != null) {
                pixelFrame.release();
                return;
            }
            return;
        }
        if (pixelFrame != null) {
            VideoDecoderListener videoDecoderListener = this.mListener;
            if (videoDecoderListener != null) {
                videoDecoderListener.onDecodeFrame(pixelFrame, pixelFrame.getTimestamp());
            }
            pixelFrame.release();
        }
    }

    @Override // com.tencent.ugc.decoder.VideoDecoderInterface
    public void abandonDecodingFrames() {
        long j10 = this.mNativeVideoDecoderWrapper;
        if (j10 == 0) {
            LiteavLog.w(TAG, "decoder has already stopped");
            return;
        }
        nativeAbandonDecodingFrames(j10);
        VideoDecoderListener videoDecoderListener = this.mListener;
        if (videoDecoderListener != null) {
            videoDecoderListener.onAbandonDecodingFramesCompleted();
        }
    }

    @Override // com.tencent.ugc.decoder.VideoDecoderInterface
    public boolean decode(EncodedVideoFrame encodedVideoFrame) {
        VideoDecoderListener videoDecoderListener;
        if (encodedVideoFrame == null) {
            return false;
        }
        if (encodedVideoFrame.isEosFrame && (videoDecoderListener = this.mListener) != null) {
            videoDecoderListener.onDecodeCompleted();
            return true;
        }
        ByteBuffer byteBuffer = encodedVideoFrame.data;
        if (byteBuffer == null || byteBuffer.remaining() == 0) {
            return false;
        }
        nativeDecodeFrame(this.mNativeVideoDecoderWrapper, encodedVideoFrame);
        return true;
    }

    @Override // com.tencent.ugc.decoder.VideoDecoderInterface
    public VideoDecoderInterface.DecoderType getDecoderType() {
        return VideoDecoderInterface.DecoderType.SOFTWARE;
    }

    @Override // com.tencent.ugc.decoder.VideoDecoderInterface
    public void initialize() {
    }

    @Override // com.tencent.ugc.decoder.VideoDecoderInterface
    public void setScene(VideoDecoderDef.ConsumerScene consumerScene) {
    }

    @Override // com.tencent.ugc.decoder.VideoDecoderInterface
    public void start(Object obj, VideoDecoderListener videoDecoderListener) {
        if (this.mNativeVideoDecoderWrapper != 0) {
            LiteavLog.w(TAG, "decoder is already started!");
            return;
        }
        this.mPixelFramePool = new PixelFramePool();
        this.mListener = videoDecoderListener;
        long jNativeCreate = nativeCreate(this);
        this.mNativeVideoDecoderWrapper = jNativeCreate;
        if (jNativeCreate == 0) {
            handleDecoderError();
            LiteavLog.e(TAG, "create native instance failed.");
        } else if (nativeStart(jNativeCreate, this.mIsUseHevc) == 0) {
            LiteavLog.i(TAG, "decoder Start success.");
        } else {
            handleDecoderError();
            LiteavLog.e(TAG, "Start software decoder failed.");
        }
    }

    @Override // com.tencent.ugc.decoder.VideoDecoderInterface
    public void stop() {
        if (this.mNativeVideoDecoderWrapper == 0) {
            LiteavLog.w(TAG, "decoder has already stopped");
            return;
        }
        PixelFramePool pixelFramePool = this.mPixelFramePool;
        if (pixelFramePool != null) {
            pixelFramePool.destroy();
        }
        nativeStop(this.mNativeVideoDecoderWrapper);
        nativeDestroy(this.mNativeVideoDecoderWrapper);
        this.mNativeVideoDecoderWrapper = 0L;
        LiteavLog.i(TAG, "decoder stop.");
    }

    @Override // com.tencent.ugc.decoder.VideoDecoderInterface
    public void uninitialize() {
    }
}
