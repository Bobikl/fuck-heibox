package com.tencent.ugc.decoder;

import android.media.MediaCodec;
import android.media.MediaCodecInfo;
import android.media.MediaCodecList;
import android.media.MediaFormat;
import com.tencent.liteav.base.util.CustomHandler;
import com.tencent.liteav.base.util.LiteavLog;
import com.tencent.liteav.base.util.Size;
import com.tencent.liteav.videobase.common.CodecType;
import com.tencent.ugc.videobase.common.EncodedVideoFrame;
import com.tencent.ugc.videobase.common.MediaCodecAbility;
import com.tencent.ugc.videobase.frame.PixelFrame;
import com.tencent.ugc.videobase.utils.CollectionUtils;
import com.tencent.ugc.videobase.utils.HardwareDecoderMediaFormatBuilder;
import com.tencent.ugc.videobase.utils.MemoryAllocator;
import java.io.IOException;
import java.nio.ByteBuffer;
import java.util.concurrent.TimeUnit;

/* JADX INFO: loaded from: classes4.dex */
public abstract class MediaCodecDecoder {
    private final HardwareDecoderMediaFormatBuilder mDecoderMediaFormatBuilder;
    protected final boolean mForceSoftwareDecoder;
    protected MediaCodecDecoderListener mListener;
    protected final Size mResolution;
    private volatile CustomHandler mWorkHandler;
    protected String mTAG = "MediaCodecDecoder";
    private MediaCodec mMediaCodec = null;
    protected final MediaCodec.BufferInfo mBufferInfo = new MediaCodec.BufferInfo();
    private boolean mEnableLimitMaxDecFrameBufferingInH264Sps = false;
    private final H264SPSModifier mSPSModifier = new H264SPSModifier();
    protected final com.tencent.liteav.base.b.b mThrottlers = new com.tencent.liteav.base.b.b();

    public static class BuildResult {
        public boolean isSuccess = true;
        public String warningMessage = "";
    }

    public interface MediaCodecDecoderListener {
        void onDecodeFrame(PixelFrame pixelFrame, boolean z10);

        void onDecoderError();
    }

    public MediaCodecDecoder(HardwareDecoderMediaFormatBuilder hardwareDecoderMediaFormatBuilder, Size size, boolean z10, MediaCodecDecoderListener mediaCodecDecoderListener, CustomHandler customHandler) {
        this.mDecoderMediaFormatBuilder = hardwareDecoderMediaFormatBuilder;
        this.mResolution = size;
        this.mForceSoftwareDecoder = z10;
        this.mListener = mediaCodecDecoderListener;
        this.mWorkHandler = customHandler;
    }

    private byte[] getSpsData(byte[] bArr, int[] iArr) {
        int nextNALHeaderPos = 0;
        while (nextNALHeaderPos + 4 < bArr.length && (nextNALHeaderPos = EncodedVideoFrame.getNextNALHeaderPos(nextNALHeaderPos, ByteBuffer.wrap(bArr))) >= 0) {
            if ((bArr[nextNALHeaderPos] & 31) == 7) {
                iArr[0] = nextNALHeaderPos;
                break;
            }
        }
        int i10 = iArr[0];
        if (i10 < 0) {
            return null;
        }
        int length = bArr.length - i10;
        while (true) {
            int i11 = i10 + 3;
            if (i11 < bArr.length) {
                byte b10 = bArr[i10];
                if ((b10 == 0 && bArr[i10 + 1] == 0 && bArr[i10 + 2] == 1) || (b10 == 0 && bArr[i10 + 1] == 0 && bArr[i10 + 2] == 0 && bArr[i11] == 1)) {
                    length = i10 - iArr[0];
                    break;
                }
                i10++;
            } else {
                break;
            }
        }
        byte[] bArr2 = new byte[length];
        System.arraycopy(bArr, iArr[0], bArr2, 0, length);
        return bArr2;
    }

    private void limitMaxDecFrameBufferingInH264Sps(EncodedVideoFrame encodedVideoFrame) {
        byte[] bArrAllocateByteArray;
        ByteBuffer byteBufferAllocateDirectBuffer;
        if (encodedVideoFrame.isIDRFrame() && encodedVideoFrame.codecType == CodecType.H264 && this.mEnableLimitMaxDecFrameBufferingInH264Sps && (bArrAllocateByteArray = MemoryAllocator.allocateByteArray(encodedVideoFrame.data.remaining())) != null) {
            encodedVideoFrame.data.get(bArrAllocateByteArray);
            encodedVideoFrame.data.rewind();
            int[] iArr = {-1};
            byte[] spsData = getSpsData(bArrAllocateByteArray, iArr);
            if (spsData == null || iArr[0] < 0) {
                return;
            }
            byte[] bArrUpdateVUIforMaxBuffering = null;
            try {
                bArrUpdateVUIforMaxBuffering = this.mSPSModifier.updateVUIforMaxBuffering(spsData);
            } catch (Throwable th2) {
                LiteavLog.e(this.mTAG, "modify dec buffer error ", th2);
            }
            if (bArrUpdateVUIforMaxBuffering == null || (byteBufferAllocateDirectBuffer = MemoryAllocator.allocateDirectBuffer((bArrAllocateByteArray.length - spsData.length) + bArrUpdateVUIforMaxBuffering.length)) == null) {
                return;
            }
            encodedVideoFrame.data = byteBufferAllocateDirectBuffer;
            int i10 = iArr[0];
            if (i10 > 0) {
                byteBufferAllocateDirectBuffer.put(bArrAllocateByteArray, 0, i10);
            }
            encodedVideoFrame.data.put(bArrUpdateVUIforMaxBuffering);
            ByteBuffer byteBuffer = encodedVideoFrame.data;
            int i11 = iArr[0];
            byteBuffer.put(bArrAllocateByteArray, spsData.length + i11, (bArrAllocateByteArray.length - i11) - spsData.length);
            encodedVideoFrame.data.rewind();
        }
    }

    public BuildResult buildMediaCodec(boolean z10, MediaCodec mediaCodec) {
        String str;
        this.mDecoderMediaFormatBuilder.setIsLowLatencyDecodeEnabled(z10);
        MediaFormat mediaFormatBuild = this.mDecoderMediaFormatBuilder.build();
        BuildResult buildResult = new BuildResult();
        boolean z11 = false;
        String str2 = "";
        try {
            if (mediaCodec != null) {
                this.mMediaCodec = mediaCodec;
                updateOutputSurface(mediaCodec);
                LiteavLog.i(this.mTAG, "preload MediaCodec update surface success (%s)", this.mMediaCodec.getName());
                z11 = true;
            } else {
                MediaCodec mediaCodecCreateMediaCodecInternal = createMediaCodecInternal(this.mForceSoftwareDecoder, mediaFormatBuild.getString(org.apache.tools.ant.taskdefs.email.b.I));
                this.mMediaCodec = mediaCodecCreateMediaCodecInternal;
                mediaCodecCreateMediaCodecInternal.setVideoScalingMode(1);
                boolean zConfigureMediaCodec = configureMediaCodec(this.mMediaCodec, mediaFormatBuild);
                if (zConfigureMediaCodec) {
                    LiteavLog.i(this.mTAG, "configure MediaCodec with ".concat(String.valueOf(mediaFormatBuild)));
                    this.mMediaCodec.start();
                    LiteavLog.i(this.mTAG, "start MediaCodec(%s) success.", this.mMediaCodec.getName());
                }
                z11 = zConfigureMediaCodec;
            }
        } catch (Throwable th2) {
            LiteavLog.e(this.mTAG, "start MediaCodec failed.", th2);
            if (th2 instanceof IllegalArgumentException) {
                str = "VideoDecode: illegal argument, Start decoder failed";
            } else {
                str = th2 instanceof IllegalStateException ? "VideoDecode: illegal state, Start decoder failed" : "VideoDecode: Start decoder failed";
            }
            str2 = "decoder config fail, message:" + str + " exception:" + th2.getMessage();
        }
        buildResult.isSuccess = z11;
        if (!z11) {
            destroyMediaCodec();
            buildResult.warningMessage = str2;
        }
        return buildResult;
    }

    protected abstract boolean configureMediaCodec(MediaCodec mediaCodec, MediaFormat mediaFormat);

    public MediaCodec createMediaCodecInternal(boolean z10, String str) throws IOException {
        if (!z10) {
            return MediaCodec.createDecoderByType(str);
        }
        for (MediaCodecInfo mediaCodecInfo : new MediaCodecList(0).getCodecInfos()) {
            String[] supportedTypes = mediaCodecInfo.getSupportedTypes();
            if (!mediaCodecInfo.isEncoder()) {
                for (String str2 : supportedTypes) {
                    if (str2.contains(str) && MediaCodecAbility.isSoftOnlyDecoder(mediaCodecInfo)) {
                        LiteavLog.i(this.mTAG, "Use soft only decoder:%s", mediaCodecInfo.getName());
                        return MediaCodec.createByCodecName(mediaCodecInfo.getName());
                    }
                }
            }
        }
        return MediaCodec.createDecoderByType(str);
    }

    protected void destroyMediaCodec() {
        if (this.mMediaCodec == null) {
            return;
        }
        try {
            LiteavLog.i(this.mTAG, "mediaCodec stop");
            this.mMediaCodec.stop();
            try {
                LiteavLog.i(this.mTAG, "mediaCodec release");
                this.mMediaCodec.release();
            } catch (Throwable th2) {
                LiteavLog.e(this.mTAG, "release MediaCodec failed.", th2);
            }
            this.mMediaCodec = null;
        } catch (Throwable th3) {
            try {
                LiteavLog.e(this.mTAG, "stop MediaCodec failed." + th3.getMessage());
            } finally {
                try {
                    LiteavLog.i(this.mTAG, "mediaCodec release");
                    this.mMediaCodec.release();
                } catch (Throwable th4) {
                    LiteavLog.e(this.mTAG, "release MediaCodec failed.", th4);
                }
                this.mMediaCodec = null;
            }
        }
    }

    public boolean drainDecodedFrame() {
        int iDequeueOutputBuffer;
        if (this.mMediaCodec == null) {
            return false;
        }
        for (int i10 = 0; i10 < 3 && (iDequeueOutputBuffer = MediaCodecWrapper.dequeueOutputBuffer(this.mMediaCodec, this.mBufferInfo, TimeUnit.MILLISECONDS.toMicros(1L))) != -1; i10++) {
            if (iDequeueOutputBuffer != -3) {
                if (iDequeueOutputBuffer != -2) {
                    if (iDequeueOutputBuffer < 0) {
                        LiteavLog.d(this.mTAG, "dequeueOutputBuffer get invalid index: %d", Integer.valueOf(iDequeueOutputBuffer));
                        break;
                    }
                    return handleOutputBuffer(this.mMediaCodec, this.mBufferInfo, iDequeueOutputBuffer);
                }
                outputFormatChange(this.mMediaCodec.getOutputFormat());
            } else {
                LiteavLog.i(this.mTAG, "on output buffers changed");
            }
        }
        return false;
    }

    public void enableLimitMaxDecFrameBuffer(boolean z10) {
        this.mEnableLimitMaxDecFrameBufferingInH264Sps = z10;
    }

    public boolean feedEncodedFrame(EncodedVideoFrame encodedVideoFrame) {
        ByteBuffer byteBuffer;
        if (this.mMediaCodec == null) {
            return false;
        }
        if (encodedVideoFrame == null || (!encodedVideoFrame.isEosFrame && ((byteBuffer = encodedVideoFrame.data) == null || byteBuffer.remaining() == 0))) {
            LiteavLog.w(this.mTAG, "receive empty buffer.");
            return true;
        }
        ByteBuffer[] inputBuffers = this.mMediaCodec.getInputBuffers();
        if (CollectionUtils.isEmpty(inputBuffers)) {
            LiteavLog.e(this.mTAG, "get invalid input buffers.");
            return false;
        }
        MediaCodec mediaCodec = this.mMediaCodec;
        TimeUnit timeUnit = TimeUnit.MILLISECONDS;
        int iDequeueInputBuffer = MediaCodecWrapper.dequeueInputBuffer(mediaCodec, timeUnit.toMicros(3L));
        if (iDequeueInputBuffer < 0) {
            return false;
        }
        if (encodedVideoFrame.isEosFrame) {
            LiteavLog.i(this.mTAG, "feedDataToMediaCodec BUFFER_FLAG_END_OF_STREAM");
            MediaCodecWrapper.queueInputBuffer(this.mMediaCodec, iDequeueInputBuffer, 0, 0, 0L, 4);
        } else {
            limitMaxDecFrameBufferingInH264Sps(encodedVideoFrame);
            int iRemaining = encodedVideoFrame.data.remaining();
            inputBuffers[iDequeueInputBuffer].put(encodedVideoFrame.data);
            MediaCodecWrapper.queueInputBuffer(this.mMediaCodec, iDequeueInputBuffer, 0, iRemaining, timeUnit.toMicros(encodedVideoFrame.pts), 0);
        }
        return true;
    }

    public void flush() {
        MediaCodec mediaCodec = this.mMediaCodec;
        if (mediaCodec != null) {
            try {
                mediaCodec.flush();
            } catch (Throwable th2) {
                LiteavLog.e(this.mTAG, "mediacodec flush exception.", th2);
            }
        }
    }

    protected abstract boolean handleOutputBuffer(MediaCodec mediaCodec, MediaCodec.BufferInfo bufferInfo, int i10);

    protected void outputFormatChange(MediaFormat mediaFormat) {
        LiteavLog.i(this.mTAG, "decode output format changed: ".concat(String.valueOf(mediaFormat)));
        LiteavLog.i(this.mTAG, "cropWidth: %d, cropHeight: %d, frameWidth: %d, frameHeight: %d", Integer.valueOf(Math.abs(mediaFormat.getInteger("crop-right") - mediaFormat.getInteger("crop-left")) + 1), Integer.valueOf(Math.abs(mediaFormat.getInteger("crop-bottom") - mediaFormat.getInteger("crop-top")) + 1), Integer.valueOf(mediaFormat.getInteger("width")), Integer.valueOf(mediaFormat.getInteger("height")));
    }

    protected void runOnWorkThread(Runnable runnable) {
        if (this.mWorkHandler != null) {
            this.mWorkHandler.runOrPost(runnable);
        }
    }

    public abstract boolean start(Object obj);

    public void stop() {
        destroyMediaCodec();
    }

    protected abstract void updateOutputSurface(MediaCodec mediaCodec);
}
