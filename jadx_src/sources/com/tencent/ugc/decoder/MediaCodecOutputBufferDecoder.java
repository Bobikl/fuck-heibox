package com.tencent.ugc.decoder;

import android.media.MediaCodec;
import android.media.MediaFormat;
import com.tencent.liteav.base.util.CustomHandler;
import com.tencent.liteav.base.util.LiteavLog;
import com.tencent.liteav.base.util.Size;
import com.tencent.liteav.videobase.base.GLConstants;
import com.tencent.ugc.videobase.frame.PixelFrame;
import com.tencent.ugc.videobase.utils.HardwareDecoderMediaFormatBuilder;
import com.tencent.ugc.videobase.utils.MemoryAllocator;
import com.tencent.ugc.videobase.utils.OpenGlUtils;
import java.nio.ByteBuffer;
import java.util.Locale;
import java.util.concurrent.TimeUnit;

/* JADX INFO: loaded from: classes4.dex */
public class MediaCodecOutputBufferDecoder extends MediaCodecDecoder {
    private int mSliceHeight;
    private int mStride;

    public MediaCodecOutputBufferDecoder(HardwareDecoderMediaFormatBuilder hardwareDecoderMediaFormatBuilder, Size size, boolean z10, MediaCodecDecoder.MediaCodecDecoderListener mediaCodecDecoderListener, CustomHandler customHandler) {
        super(hardwareDecoderMediaFormatBuilder, size, z10, mediaCodecDecoderListener, customHandler);
        this.mStride = 0;
        this.mSliceHeight = 0;
        this.mTAG = "MediaCodecOutputBufferDecoder" + hashCode();
    }

    private void copyI420Buffer(ByteBuffer byteBuffer, ByteBuffer byteBuffer2, int i10, int i11, int i12, int i13) {
        copyPlane(byteBuffer, 0, byteBuffer2, 0, i12, i10, i11);
        int i14 = i12 * i13;
        int i15 = i14 + 0;
        int i16 = i10 * i11;
        int i17 = i16 + 0;
        int i18 = i12 / 2;
        int i19 = i10 / 2;
        int i20 = i11 / 2;
        copyPlane(byteBuffer, i15, byteBuffer2, i17, i18, i19, i20);
        copyPlane(byteBuffer, i15 + (i14 / 4), byteBuffer2, i17 + (i16 / 4), i18, i19, i20);
    }

    private void copyNV12Buffer(ByteBuffer byteBuffer, ByteBuffer byteBuffer2, int i10, int i11, int i12, int i13) {
        copyPlane(byteBuffer, 0, byteBuffer2, 0, i12, i10, i11);
        copyPlane(byteBuffer, (i13 * i12) + 0, byteBuffer2, (i10 * i11) + 0, i12, i10, i11 / 2);
    }

    private void copyPlane(ByteBuffer byteBuffer, int i10, ByteBuffer byteBuffer2, int i11, int i12, int i13, int i14) {
        OpenGlUtils.nativeCopyYuvFromByteBufferToByteBuffer(byteBuffer, i10, byteBuffer2, i11, i12, i13, i14);
    }

    private ByteBuffer copyYuvBuffer(ByteBuffer byteBuffer, MediaCodec.BufferInfo bufferInfo, int i10) {
        if (byteBuffer == null) {
            return null;
        }
        byteBuffer.position(bufferInfo.offset);
        byteBuffer.limit(bufferInfo.offset + bufferInfo.size);
        byteBuffer.rewind();
        Size size = this.mResolution;
        ByteBuffer byteBufferAllocateDirectBuffer = MemoryAllocator.allocateDirectBuffer(((size.width * size.height) * 3) / 2);
        if (byteBufferAllocateDirectBuffer == null) {
            return null;
        }
        if (i10 == 19) {
            Size size2 = this.mResolution;
            copyI420Buffer(byteBuffer, byteBufferAllocateDirectBuffer, size2.width, size2.height, this.mStride, this.mSliceHeight);
        } else {
            if (i10 != 21) {
                return null;
            }
            Size size3 = this.mResolution;
            copyNV12Buffer(byteBuffer, byteBufferAllocateDirectBuffer, size3.width, size3.height, this.mStride, this.mSliceHeight);
        }
        byteBufferAllocateDirectBuffer.rewind();
        return byteBufferAllocateDirectBuffer;
    }

    private PixelFrame createPixelFrame(ByteBuffer byteBuffer, MediaFormat mediaFormat, long j10) {
        int integer = mediaFormat.getInteger("color-format");
        if (!isSupportColorFormat(integer)) {
            return null;
        }
        PixelFrame pixelFrame = new PixelFrame();
        pixelFrame.setWidth(this.mResolution.width);
        pixelFrame.setHeight(this.mResolution.height);
        pixelFrame.setTimestamp(TimeUnit.MICROSECONDS.toMillis(j10));
        pixelFrame.setPixelBufferType(GLConstants.a.BYTE_BUFFER);
        pixelFrame.setBuffer(byteBuffer);
        pixelFrame.setPixelFormatType(integer == 19 ? GLConstants.PixelFormatType.I420 : GLConstants.PixelFormatType.NV12);
        pixelFrame.setColorFormat(getMediaFormatValue(mediaFormat, "color-range", 2) == 1 ? GLConstants.ColorRange.FULL_RANGE : GLConstants.ColorRange.VIDEO_RANGE, getMediaFormatValue(mediaFormat, "color-standard", 2) == 1 ? GLConstants.ColorSpace.BT709 : GLConstants.ColorSpace.BT601);
        return pixelFrame;
    }

    private int getMediaFormatValue(MediaFormat mediaFormat, String str, int i10) {
        return mediaFormat.containsKey(str) ? mediaFormat.getInteger(str) : i10;
    }

    public static boolean isSupportColorFormat(int i10) {
        return i10 == 19 || i10 == 21;
    }

    @Override // com.tencent.ugc.decoder.MediaCodecDecoder
    protected boolean configureMediaCodec(MediaCodec mediaCodec, MediaFormat mediaFormat) {
        int supportColorFormat = DecodeAbilityProvider.getInstance().getSupportColorFormat(mediaFormat.getString(org.apache.tools.ant.taskdefs.email.b.I));
        if (supportColorFormat <= 0) {
            return false;
        }
        mediaFormat.setInteger("color-format", supportColorFormat);
        MediaCodecWrapper.configure(mediaCodec, mediaFormat, null, null, 0);
        return true;
    }

    @Override // com.tencent.ugc.decoder.MediaCodecDecoder
    protected boolean handleOutputBuffer(MediaCodec mediaCodec, MediaCodec.BufferInfo bufferInfo, int i10) {
        if (this.mListener == null) {
            return false;
        }
        if ((bufferInfo.flags & 4) != 0) {
            LiteavLog.i(this.mTAG, "meet end of stream.");
            this.mListener.onDecodeFrame(null, true);
        } else {
            ByteBuffer outputBuffer = mediaCodec.getOutputBuffer(i10);
            MediaFormat outputFormat = mediaCodec.getOutputFormat();
            ByteBuffer byteBufferCopyYuvBuffer = copyYuvBuffer(outputBuffer, bufferInfo, outputFormat.getInteger("color-format"));
            if (byteBufferCopyYuvBuffer == null) {
                return false;
            }
            PixelFrame pixelFrameCreatePixelFrame = createPixelFrame(byteBufferCopyYuvBuffer, outputFormat, bufferInfo.presentationTimeUs);
            if (pixelFrameCreatePixelFrame != null) {
                this.mListener.onDecodeFrame(pixelFrameCreatePixelFrame, false);
            } else {
                LiteavLog.e(this.mThrottlers.a("handleOutputBuffer"), this.mTAG, String.format(Locale.ENGLISH, "output color format(%d) is unknown", Integer.valueOf(outputFormat.getInteger("color-format"))), new Object[0]);
                this.mListener.onDecoderError();
            }
        }
        mediaCodec.releaseOutputBuffer(i10, false);
        return false;
    }

    @Override // com.tencent.ugc.decoder.MediaCodecDecoder
    protected void outputFormatChange(MediaFormat mediaFormat) {
        LiteavLog.i(this.mTAG, "decode output format changed: ".concat(String.valueOf(mediaFormat)));
        int integer = mediaFormat.getInteger("width");
        int integer2 = mediaFormat.getInteger("height");
        this.mStride = integer;
        this.mSliceHeight = integer2;
        if (mediaFormat.containsKey("stride")) {
            this.mStride = mediaFormat.getInteger("stride");
        }
        if (mediaFormat.containsKey("slice-height")) {
            this.mSliceHeight = mediaFormat.getInteger("slice-height");
        }
        this.mStride = Math.max(integer, this.mStride);
        this.mSliceHeight = Math.max(integer2, this.mSliceHeight);
    }

    @Override // com.tencent.ugc.decoder.MediaCodecDecoder
    public boolean start(Object obj) {
        return true;
    }

    @Override // com.tencent.ugc.decoder.MediaCodecDecoder
    protected void updateOutputSurface(MediaCodec mediaCodec) {
    }
}
