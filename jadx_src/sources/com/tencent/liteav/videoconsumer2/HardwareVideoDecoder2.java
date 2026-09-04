package com.tencent.liteav.videoconsumer2;

import android.graphics.SurfaceTexture;
import android.media.MediaCodec;
import android.media.MediaCodecInfo;
import android.media.MediaCodecList;
import android.media.MediaCrypto;
import android.media.MediaFormat;
import android.view.Surface;
import com.tencent.liteav.base.annotations.JNINamespace;
import com.tencent.liteav.base.util.LiteavLog;
import com.tencent.liteav.videobase.base.GLConstants;
import com.tencent.liteav.videobase.common.CodecType;
import com.tencent.liteav.videobase.common.EncodedVideoFrame;
import com.tencent.liteav.videobase.common.MediaCodecAbility;
import com.tencent.liteav.videobase.utils.b;
import com.tencent.liteav.videobase.utils.d;
import com.tencent.liteav.videobase.videobase.e;
import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.nio.ByteBuffer;
import java.util.concurrent.TimeUnit;

/* JADX INFO: loaded from: classes4.dex */
@JNINamespace("liteav::video")
public class HardwareVideoDecoder2 implements SurfaceTexture.OnFrameAvailableListener {
    private static final int DRAIN_ERROR = -1;
    private static final int DRAIN_SUCCESS = 0;
    private static final int DRAIN_SUCCESS_MEET_END_OF_STREAM = 1;
    private static final int INVALID_COLOR_FORMAT = 0;
    private final b mDecoderMediaFormatBuilder;
    private Surface mExternalSurface;
    private boolean mIsRealTime;
    private boolean mIsStarted;
    private long mNativeVideoDecoderImplAndroid;
    private Surface mOutputSurface;
    private SurfaceTexture mSurfaceTexture;
    private final String mTAG;
    private boolean mUseByteBuffer;
    private boolean mUseSoftwareDecoder;
    private final com.tencent.liteav.base.b.b mThrottlers = new com.tencent.liteav.base.b.b();
    private MediaCodec mMediaCodec = null;
    private final MediaCodec.BufferInfo mBufferInfo = new MediaCodec.BufferInfo();
    private boolean mEnableLimitMaxDecFrameBufferingInH264Sps = true;
    private final com.tencent.liteav.videoconsumer.a.a mSPSModifier = new com.tencent.liteav.videoconsumer.a.a();

    public static final class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public MediaCodec f100673a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public e.c f100674b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public String f100675c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public Throwable f100676d;

        private a() {
            this.f100673a = null;
            this.f100674b = null;
            this.f100675c = null;
            this.f100676d = null;
        }

        /* synthetic */ a(byte b10) {
            this();
        }
    }

    HardwareVideoDecoder2(String str, boolean z10, boolean z11, int i10, int i11, boolean z12, boolean z13, long j10) {
        this.mUseSoftwareDecoder = false;
        this.mUseByteBuffer = false;
        this.mTAG = str + "HardwareVideoDecoder2";
        this.mIsRealTime = z10;
        this.mUseSoftwareDecoder = z12;
        this.mUseByteBuffer = z13;
        this.mNativeVideoDecoderImplAndroid = j10;
        b bVar = new b();
        bVar.f100406c = z11 ? "video/hevc" : "video/avc";
        bVar.f100404a = i10;
        bVar.f100405b = i11;
        this.mDecoderMediaFormatBuilder = bVar;
    }

    private boolean configureDecoder(a aVar, boolean z10) {
        String str;
        Surface surface;
        b bVar = this.mDecoderMediaFormatBuilder;
        bVar.f100407d = z10;
        MediaFormat mediaFormatA = bVar.a();
        LiteavLog.i(this.mTAG, "mediaFormat:".concat(String.valueOf(mediaFormatA)));
        try {
            String string = mediaFormatA.getString(org.apache.tools.ant.taskdefs.email.b.I);
            MediaCodec mediaCodecCreateMediaCodecInternal = createMediaCodecInternal(this.mUseSoftwareDecoder, string);
            aVar.f100673a = mediaCodecCreateMediaCodecInternal;
            if (this.mUseByteBuffer) {
                int supportedByteBufferColorFormat = getSupportedByteBufferColorFormat(mediaCodecCreateMediaCodecInternal, string);
                if (supportedByteBufferColorFormat == 0) {
                    LiteavLog.e(this.mTAG, "No supported color format");
                    return false;
                }
                mediaFormatA.setInteger("color-format", supportedByteBufferColorFormat);
            }
            if (this.mUseByteBuffer) {
                surface = null;
            } else {
                surface = this.mExternalSurface;
                if (surface == null) {
                    surface = this.mOutputSurface;
                }
            }
            aVar.f100673a.configure(mediaFormatA, surface, (MediaCrypto) null, 0);
            aVar.f100673a.setVideoScalingMode(1);
            aVar.f100673a.start();
            LiteavLog.i(this.mTAG, "Start MediaCodec(%s) success.", aVar.f100673a.getName());
            return true;
        } catch (Throwable th2) {
            LiteavLog.e(this.mTAG, "Start MediaCodec failed.", th2);
            destroyMediaCodec(aVar.f100673a);
            aVar.f100673a = null;
            e.c cVar = e.c.WARNING_VIDEO_DECODE_START_FAILED;
            if (th2 instanceof IllegalArgumentException) {
                cVar = e.c.WARNING_VIDEO_DECODE_START_FAILED_ILLEGAL_ARGUMENT;
                str = "VideoDecode: illegal argument, Start decoder failed";
            } else if (th2 instanceof IllegalStateException) {
                cVar = e.c.WARNING_VIDEO_DECODE_START_FAILED_ILLEGAL_STATE;
                str = "VideoDecode: illegal state, Start decoder failed";
            } else {
                str = "VideoDecode: Start decoder failed";
            }
            aVar.f100674b = cVar;
            aVar.f100675c = str;
            aVar.f100676d = th2;
            return false;
        }
    }

    private void destroyMediaCodec(MediaCodec mediaCodec) {
        if (mediaCodec != null) {
            try {
                try {
                    LiteavLog.i(this.mTAG, "mediaCodec stop");
                    mediaCodec.stop();
                    LiteavLog.i(this.mTAG, "mediaCodec release");
                    mediaCodec.release();
                } catch (Throwable th2) {
                    try {
                        LiteavLog.e(this.mTAG, "Stop MediaCodec failed." + th2.getMessage());
                        LiteavLog.i(this.mTAG, "mediaCodec release");
                        mediaCodec.release();
                    } catch (Throwable th3) {
                        try {
                            LiteavLog.i(this.mTAG, "mediaCodec release");
                            mediaCodec.release();
                        } catch (Throwable th4) {
                            LiteavLog.e(this.mTAG, "release MediaCodec failed.", th4);
                        }
                        throw th3;
                    }
                }
            } catch (Throwable th5) {
                LiteavLog.e(this.mTAG, "release MediaCodec failed.", th5);
            }
        }
    }

    private int drainDecodedFrameInternal() {
        int iDequeueOutputBuffer;
        for (int i10 = 0; i10 < 3 && (iDequeueOutputBuffer = this.mMediaCodec.dequeueOutputBuffer(this.mBufferInfo, TimeUnit.MILLISECONDS.toMicros(10L))) != -1; i10++) {
            if (iDequeueOutputBuffer != -3) {
                if (iDequeueOutputBuffer != -2) {
                    if (iDequeueOutputBuffer < 0) {
                        LiteavLog.d(this.mTAG, "dequeueOutputBuffer get invalid index: %d", Integer.valueOf(iDequeueOutputBuffer));
                        break;
                    }
                    if ((this.mBufferInfo.flags & 4) != 0) {
                        LiteavLog.i(this.mTAG, "meet end of stream.");
                        this.mMediaCodec.releaseOutputBuffer(iDequeueOutputBuffer, true);
                        return 1;
                    }
                    int iHandleOutputBuffer = this.mUseByteBuffer ? handleOutputBuffer(iDequeueOutputBuffer) : 0;
                    this.mMediaCodec.releaseOutputBuffer(iDequeueOutputBuffer, true);
                    if (this.mExternalSurface != null) {
                        long millis = TimeUnit.MICROSECONDS.toMillis(this.mBufferInfo.presentationTimeUs);
                        long j10 = this.mNativeVideoDecoderImplAndroid;
                        if (j10 != 0) {
                            nativeOnDecodedFrameWithSurface(j10, millis);
                        }
                    }
                    return iHandleOutputBuffer;
                }
                outputFormatChange();
            } else {
                LiteavLog.i(this.mTAG, "on output buffers changed");
            }
        }
        return -1;
    }

    private boolean feedDataToMediaCodec(EncodedVideoFrame encodedVideoFrame) {
        ByteBuffer byteBuffer;
        if (this.mMediaCodec == null) {
            LiteavLog.w(this.mTAG, "MediaCodec is stopped.");
            return false;
        }
        if (encodedVideoFrame == null || (!encodedVideoFrame.isEosFrame && ((byteBuffer = encodedVideoFrame.data) == null || byteBuffer.remaining() == 0))) {
            LiteavLog.w(this.mTAG, "receive empty buffer.");
            return true;
        }
        ByteBuffer[] inputBuffers = this.mMediaCodec.getInputBuffers();
        if (inputBuffers == null || inputBuffers.length == 0) {
            LiteavLog.e(this.mTAG, "get invalid input buffers.");
            return false;
        }
        int iDequeueInputBuffer = this.mMediaCodec.dequeueInputBuffer(10000L);
        if (iDequeueInputBuffer < 0) {
            return false;
        }
        if (encodedVideoFrame.isEosFrame) {
            LiteavLog.i(this.mTAG, "feedDataToMediaCodec BUFFER_FLAG_END_OF_STREAM");
            this.mMediaCodec.queueInputBuffer(iDequeueInputBuffer, 0, 0, 0L, 4);
        } else {
            limitMaxDecFrameBufferingInH264Sps(encodedVideoFrame);
            int iRemaining = encodedVideoFrame.data.remaining();
            inputBuffers[iDequeueInputBuffer].put(encodedVideoFrame.data);
            this.mMediaCodec.queueInputBuffer(iDequeueInputBuffer, 0, iRemaining, TimeUnit.MILLISECONDS.toMicros(encodedVideoFrame.pts), 0);
        }
        return true;
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

    private int getSupportedByteBufferColorFormat(MediaCodec mediaCodec, String str) {
        boolean z10 = false;
        boolean z11 = false;
        for (int i10 : mediaCodec.getCodecInfo().getCapabilitiesForType(str).colorFormats) {
            if (i10 == 19) {
                z10 = true;
            } else if (i10 == 21) {
                z11 = true;
            }
        }
        if (z10) {
            return 19;
        }
        return z11 ? 21 : 0;
    }

    private void handleDecoderError(e.c cVar, String str, Object... objArr) {
        LiteavLog.e(this.mTAG, str, objArr);
        long j10 = this.mNativeVideoDecoderImplAndroid;
        if (j10 != 0) {
            nativeOnDecodedFrameFailed(j10, e.a(cVar));
        }
    }

    private int handleOutputBuffer(int i10) {
        int value;
        synchronized (this) {
            ByteBuffer outputBuffer = this.mMediaCodec.getOutputBuffer(i10);
            outputBuffer.position(this.mBufferInfo.offset);
            MediaCodec.BufferInfo bufferInfo = this.mBufferInfo;
            outputBuffer.limit(bufferInfo.offset + bufferInfo.size);
            outputBuffer.rewind();
            MediaFormat outputFormat = this.mMediaCodec.getOutputFormat();
            int integer = outputFormat.getInteger("color-format");
            if (integer == 19) {
                value = GLConstants.PixelFormatType.I420.getValue();
            } else {
                if (integer != 21) {
                    handleDecoderError(e.c.WARNING_VIDEO_DECODE_ERROR_NOT_SUPPORT_PIXEL_FORMAT_TYPE, "Unsupported color format: %d", Integer.valueOf(integer));
                    return -1;
                }
                value = GLConstants.PixelFormatType.NV12.getValue();
            }
            int i11 = value;
            int integer2 = outputFormat.getInteger("width");
            int integer3 = outputFormat.getInteger("height");
            int iAbs = (outputFormat.containsKey("crop-right") && outputFormat.containsKey("crop-left")) ? Math.abs(outputFormat.getInteger("crop-right") - outputFormat.getInteger("crop-left")) + 1 : integer2;
            int iAbs2 = (outputFormat.containsKey("crop-bottom") && outputFormat.containsKey("crop-top")) ? Math.abs(outputFormat.getInteger("crop-bottom") - outputFormat.getInteger("crop-top")) + 1 : integer3;
            if (outputFormat.containsKey("stride")) {
                integer2 = outputFormat.getInteger("stride");
            }
            int i12 = integer2;
            int integer4 = outputFormat.containsKey("slice-height") ? outputFormat.getInteger("slice-height") : integer3;
            long millis = TimeUnit.MICROSECONDS.toMillis(this.mBufferInfo.presentationTimeUs);
            long j10 = this.mNativeVideoDecoderImplAndroid;
            if (j10 != 0) {
                nativeOnByteBuffer(j10, i11, outputBuffer, this.mBufferInfo.size, iAbs, iAbs2, i12, integer4, millis);
            }
            return 0;
        }
    }

    private boolean initializeSurface(int i10) {
        LiteavLog.i(this.mTAG, "initialize surface");
        synchronized (this) {
            try {
                this.mSurfaceTexture = new SurfaceTexture(i10);
                this.mOutputSurface = new Surface(this.mSurfaceTexture);
                this.mSurfaceTexture.setOnFrameAvailableListener(this);
            } catch (Surface.OutOfResourcesException e10) {
                LiteavLog.e(this.mThrottlers.a("surface"), this.mTAG, "create SurfaceTexture failed.", e10);
                handleDecoderError(e.c.WARNING_VIDEO_DECODE_START_FAILED_INSUFFICIENT_RESOURCE, "VideoDecode: insufficient resource, Start decoder failed:" + e10.getMessage(), new Object[0]);
                return false;
            }
        }
        LiteavLog.i(this.mThrottlers.a("initializeSurface"), this.mTAG, "initializeSurface", new Object[0]);
        return true;
    }

    static /* synthetic */ boolean lambda$limitMaxDecFrameBufferingInH264Sps$0(HardwareVideoDecoder2 hardwareVideoDecoder2, int i10, int i11, int i12, int i13) {
        LiteavLog.e(hardwareVideoDecoder2.mTAG, "frame cropping flag exist, crop[l:" + i10 + ",r:" + i11 + ",t:" + i12 + ",b:" + i13 + "]");
        hardwareVideoDecoder2.mEnableLimitMaxDecFrameBufferingInH264Sps = false;
        long j10 = hardwareVideoDecoder2.mNativeVideoDecoderImplAndroid;
        if (j10 != 0) {
            hardwareVideoDecoder2.nativeOnFrameFlagCropExist(j10, i10, i11, i12, i13);
        }
        return false;
    }

    /* JADX WARN: Code duplicated, block: B:33:0x007a A[Catch: all -> 0x00aa, TryCatch #0 {all -> 0x00aa, blocks: (B:19:0x0044, B:20:0x0050, B:22:0x0053, B:24:0x0058, B:26:0x005c, B:28:0x0062, B:30:0x0068, B:32:0x006e, B:33:0x007a, B:35:0x0085, B:37:0x0088, B:42:0x0097, B:45:0x00a4), top: B:59:0x0044 }] */
    private void limitMaxDecFrameBufferingInH264Sps(EncodedVideoFrame encodedVideoFrame) {
        byte[] bArrA;
        byte[] bArr;
        ByteBuffer byteBufferB;
        byte[] bArr2;
        boolean z10;
        byte b10;
        if (encodedVideoFrame.isIDRFrame() && encodedVideoFrame.codecType == CodecType.H264 && this.mEnableLimitMaxDecFrameBufferingInH264Sps && this.mIsRealTime && (bArrA = d.a(encodedVideoFrame.data.remaining())) != null) {
            encodedVideoFrame.data.get(bArrA);
            encodedVideoFrame.data.rewind();
            int[] iArr = {-1};
            byte[] spsData = getSpsData(bArrA, iArr);
            if (spsData == null || iArr[0] < 0) {
                return;
            }
            try {
                com.tencent.liteav.videoconsumer.a.a aVar = this.mSPSModifier;
                com.tencent.liteav.videoconsumer.a.a.InterfaceC0966a interfaceC0966a = new com.tencent.liteav.videoconsumer.a.a.InterfaceC0966a(this) { // from class: com.tencent.liteav.videoconsumer2.a

                    /* JADX INFO: renamed from: a, reason: collision with root package name */
                    private final HardwareVideoDecoder2 f100677a;

                    {
                        this.f100677a = this;
                    }

                    @Override // com.tencent.liteav.videoconsumer.a.a.InterfaceC0966a
                    public final boolean a(int i10, int i11, int i12, int i13) {
                        return HardwareVideoDecoder2.lambda$limitMaxDecFrameBufferingInH264Sps$0(this.f100677a, i10, i11, i12, i13);
                    }
                };
                byte[] bArr3 = new byte[spsData.length];
                int i10 = 0;
                int i11 = 0;
                while (i10 < spsData.length) {
                    if (i10 >= spsData.length - 3 || (b10 = spsData[i10]) != 0) {
                        bArr3[i11] = spsData[i10];
                        i10++;
                        i11++;
                    } else {
                        int i12 = i10 + 1;
                        if (spsData[i12] == 0 && spsData[i10 + 2] == 3) {
                            int i13 = i10 + 3;
                            if (spsData[i13] <= 3) {
                                int i14 = i11 + 1;
                                bArr3[i11] = b10;
                                i11 = i14 + 1;
                                bArr3[i14] = spsData[i12];
                                i10 = i13;
                            } else {
                                bArr3[i11] = spsData[i10];
                                i10++;
                                i11++;
                            }
                        } else {
                            bArr3[i11] = spsData[i10];
                            i10++;
                            i11++;
                        }
                    }
                }
                if (i11 != spsData.length) {
                    bArr2 = new byte[i11];
                    System.arraycopy(bArr3, 0, bArr2, 0, i11);
                } else {
                    bArr2 = null;
                }
                if (bArr2 != null) {
                    z10 = true;
                } else {
                    bArr2 = spsData;
                    z10 = false;
                }
                byte[] bArrA2 = aVar.a(new ByteArrayInputStream(bArr2), interfaceC0966a);
                if (bArrA2 != null && z10) {
                    bArrA2 = com.tencent.liteav.videoconsumer.a.a.a(bArrA2);
                }
                bArr = bArrA2;
            } catch (Throwable th2) {
                LiteavLog.e(this.mTAG, "modify dec buffer error ", th2);
                bArr = null;
            }
            if (bArr == null || (byteBufferB = d.b((bArrA.length - spsData.length) + bArr.length)) == null) {
                return;
            }
            encodedVideoFrame.data = byteBufferB;
            int i15 = iArr[0];
            if (i15 > 0) {
                byteBufferB.put(bArrA, 0, i15);
            }
            encodedVideoFrame.data.put(bArr);
            ByteBuffer byteBuffer = encodedVideoFrame.data;
            int i16 = iArr[0];
            byteBuffer.put(bArrA, spsData.length + i16, (bArrA.length - i16) - spsData.length);
            encodedVideoFrame.data.rewind();
        }
    }

    private native void nativeOnByteBuffer(long j10, int i10, ByteBuffer byteBuffer, int i11, int i12, int i13, int i14, int i15, long j11);

    private native void nativeOnDecodedFrameFailed(long j10, int i10);

    private native void nativeOnDecodedFrameWithSurface(long j10, long j11);

    private native void nativeOnFrameAvailable(long j10, long j11);

    private native void nativeOnFrameFlagCropExist(long j10, int i10, int i11, int i12, int i13);

    private void outputFormatChange() {
        LiteavLog.i(this.mTAG, "decode output format changed: ".concat(String.valueOf(this.mMediaCodec.getOutputFormat())));
    }

    private boolean startInternal() {
        a aVar = new a((byte) 0);
        if (configureDecoder(aVar, this.mIsRealTime) || configureDecoder(aVar, false)) {
            this.mMediaCodec = aVar.f100673a;
            this.mIsStarted = true;
            LiteavLog.i(this.mTAG, "Start succeed");
            return true;
        }
        handleDecoderError(aVar.f100674b, "decoder config fail, message:" + aVar.f100675c + " exception:" + aVar.f100676d.getMessage(), new Object[0]);
        return false;
    }

    private void uninitializeSurface() {
        LiteavLog.i(this.mTAG, "uninitialize surface");
        synchronized (this) {
            Surface surface = this.mOutputSurface;
            if (surface != null) {
                surface.release();
                this.mOutputSurface = null;
            }
            SurfaceTexture surfaceTexture = this.mSurfaceTexture;
            if (surfaceTexture != null) {
                surfaceTexture.release();
                this.mSurfaceTexture = null;
            }
        }
    }

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

    public boolean decodeFrame(EncodedVideoFrame encodedVideoFrame) {
        if (this.mMediaCodec == null) {
            LiteavLog.w(this.mTAG, "MediaCodec is stopped.");
            return false;
        }
        if (encodedVideoFrame == null) {
            return true;
        }
        try {
            if (!feedDataToMediaCodec(encodedVideoFrame)) {
                encodedVideoFrame.release();
                return false;
            }
        } catch (Throwable th2) {
            LiteavLog.e(this.mTAG, "decode failed.", th2);
            handleDecoderError(e.c.WARNING_VIDEO_DECODE_RESTART_WHEN_DECODE_ERROR, "VideoDecode: decode error, restart decoder message:" + th2.getMessage(), new Object[0]);
        }
        encodedVideoFrame.release();
        return true;
    }

    public int drainDecodedFrame() {
        try {
            return drainDecodedFrameInternal();
        } catch (Throwable th2) {
            LiteavLog.e(this.mTAG, "decode failed.", th2);
            handleDecoderError(e.c.WARNING_VIDEO_DECODE_RESTART_WHEN_DECODE_ERROR, "VideoDecode: decode error, restart decoder message:" + th2.getMessage(), new Object[0]);
            return -1;
        }
    }

    @Override // android.graphics.SurfaceTexture.OnFrameAvailableListener
    public void onFrameAvailable(SurfaceTexture surfaceTexture) {
        synchronized (this) {
            SurfaceTexture surfaceTexture2 = this.mSurfaceTexture;
            if (surfaceTexture2 != null && surfaceTexture2 == surfaceTexture) {
                long millis = TimeUnit.NANOSECONDS.toMillis(surfaceTexture.getTimestamp());
                if (millis == 0) {
                    millis = TimeUnit.MICROSECONDS.toMillis(this.mBufferInfo.presentationTimeUs);
                }
                long j10 = this.mNativeVideoDecoderImplAndroid;
                if (j10 != 0) {
                    nativeOnFrameAvailable(j10, millis);
                }
            }
        }
    }

    public void resetNativeHandle() {
        this.mNativeVideoDecoderImplAndroid = 0L;
    }

    public void setEnableVui(boolean z10) {
        this.mEnableLimitMaxDecFrameBufferingInH264Sps = z10;
    }

    public boolean start(int i10) {
        if (this.mIsStarted) {
            return true;
        }
        LiteavLog.i(this.mTAG, "Start: texture_id = %d", Integer.valueOf(i10));
        if (this.mUseByteBuffer || initializeSurface(i10)) {
            return startInternal();
        }
        return false;
    }

    public boolean start(Surface surface) {
        if (this.mIsStarted) {
            return true;
        }
        LiteavLog.i(this.mTAG, "Start with surface ".concat(String.valueOf(surface)));
        if (surface == null) {
            return false;
        }
        this.mExternalSurface = surface;
        return startInternal();
    }

    public void stop() {
        LiteavLog.i(this.mTAG, "stop");
        if (this.mIsStarted) {
            destroyMediaCodec(this.mMediaCodec);
            this.mMediaCodec = null;
            uninitializeSurface();
            this.mIsStarted = false;
            this.mExternalSurface = null;
        }
    }

    public float[] updateTexImage() {
        SurfaceTexture surfaceTexture = this.mSurfaceTexture;
        if (surfaceTexture == null) {
            return null;
        }
        try {
            float[] fArr = new float[16];
            surfaceTexture.updateTexImage();
            this.mSurfaceTexture.getTransformMatrix(fArr);
            return fArr;
        } catch (Throwable th2) {
            LiteavLog.w(this.mThrottlers.a("updateImage"), this.mTAG, "updateTexImage exception: ".concat(String.valueOf(th2)), new Object[0]);
            return null;
        }
    }
}
