package com.bytedance.realx.video;

import android.media.MediaCodec;
import android.media.MediaCodecInfo;
import android.media.MediaFormat;
import android.os.SystemClock;
import android.view.Surface;
import androidx.annotation.p0;
import com.bytedance.realx.base.RXLogging;
import com.bytedance.realx.base.ThreadUtils;
import com.bytedance.realx.video.memory.NativeRXByteMemory;
import com.bytedance.realx.video.memory.NativeRXVideoFrame;
import com.bytedance.realx.video.memory.RXVideoFrameInterface;
import java.io.IOException;
import java.io.PrintWriter;
import java.io.StringWriter;
import java.nio.ByteBuffer;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.TimeUnit;

/* JADX INFO: loaded from: classes6.dex */
public class AndroidVideoDecoder implements VideoDecoder, VideoSink {
    private static final int ADAPTIVE_PLAYBACK_MAX_DIMENSION = 9000;
    private static final int DEFAULT_OUTPUT_FRAME_WAIT_TIME_MS = 16;
    private static final int DEQUEUE_INPUT_TIMEOUT_US = 500000;
    private static final int DEQUEUE_OUTPUT_BUFFER_TIMEOUT_US = 100000;
    private static final String HISI_DECODER_END_CODE = "bytertc.hisi.decoder.endcode.enable";
    private static final String MAX_EGL_NUM = "bytertc.hw.decoder.maxeglnum";
    private static final int MAX_OUTPUT_FRAME_WAIT_TIME_MS = 1300;
    private static final int MAX_RECREATE_DECODER_COUNT = 5;
    private static final int MEDIA_CODEC_RELEASE_TIMEOUT_MS = 6000;
    private static final String MEDIA_FORMAT_KEY_CROP_BOTTOM = "crop-bottom";
    private static final String MEDIA_FORMAT_KEY_CROP_LEFT = "crop-left";
    private static final String MEDIA_FORMAT_KEY_CROP_RIGHT = "crop-right";
    private static final String MEDIA_FORMAT_KEY_CROP_TOP = "crop-top";
    private static final String MEDIA_FORMAT_KEY_SLICE_HEIGHT = "slice-height";
    private static final String MEDIA_FORMAT_KEY_STRIDE = "stride";
    private static final int MIN_OUTPUT_FRAME_TIME_DELTA_MS = 10;
    private static final String TAG = "AndroidVideoDecoder";
    private static int curEglContextNum = 0;
    private static int maxEglContextNum = 16;

    @p0
    private VideoDecoder.Callback callback;

    @p0
    private MediaCodecWrapper codec;
    private final String codecName;
    private final RXVideoCodecStandard codecType;
    private int colorFormat;
    private ThreadUtils.ThreadChecker decoderThreadChecker;

    @p0
    private Surface ex_surface;
    private boolean hasDecodedFirstFrame;
    private int height;
    private boolean keyFrameRequired;
    private final MediaCodecWrapperFactory mediaCodecWrapperFactory;

    @p0
    private Thread outputThread;
    private ThreadUtils.ThreadChecker outputThreadChecker;

    @p0
    private DecodedTextureMetadata renderedTextureMetadata;
    private volatile boolean running;

    @p0
    private VideoDecoder.Settings settings;
    private final EglBase.Context sharedContext;

    @p0
    private volatile Exception shutdownException;
    private int sliceHeight;
    private int stride;

    @p0
    private Surface surface;

    @p0
    private SurfaceTextureHelper surfaceTextureHelper;
    private int width;
    boolean enableHisiEndCode = true;
    private int maxExSurfaceRecreateDecoderCount = 0;
    private final Object dimensionLock = new Object();
    private int encoded_width = 0;
    private int encoded_height = 0;
    private final Object surfaceTextureHelperLock = new Object();
    private long lastOutputTime = 0;
    private long currentOutputTime = 0;
    private long lastInputTime = 0;
    private long currentInputTimeDelta = 0;
    private long packetCount2s = 0;
    private long timeForAvg = 0;
    private long avgInputTimeDelta = 0;
    private long inputFrameCount = 0;
    private long outputFrameCount = 0;
    private long dropDecodedFrameCount = 0;
    private long callbackDecodedFrameCount = 0;
    private long minFrameCache = -1;
    private long currentFrameCache = -1;
    private final Object smoothOutputLock = new Object();
    private boolean usingInternalSurfaceLast = true;
    private HashMap<String, String> privateParams = new HashMap<>();
    private HashMap<String, String> vpassPrivateParams = new HashMap<>();
    private boolean mustUseYUVoutput = false;
    private boolean enable_adaptive_playback = false;
    private int adaptive_playback_max_width = 0;
    private int adaptive_playback_max_height = 0;
    private boolean enableRetryDeliver = false;
    private int maxTryCount = 16;
    private float minAccelerateRatio = 0.0f;
    private float maxDeaccelerateRatio = 1.0f;
    private int frameCacheThreshold = 2;
    private final Object renderedTextureMetadataLock = new Object();

    public static class DecodedTextureMetadata {
        final long presentationTimestampUs;

        DecodedTextureMetadata(long j10) {
            this.presentationTimestampUs = j10;
        }
    }

    AndroidVideoDecoder(MediaCodecWrapperFactory mediaCodecWrapperFactory, String str, RXVideoCodecStandard rXVideoCodecStandard, int i10, EglBase.Context context) {
        if (!isSupportedColorFormat(i10)) {
            throw new IllegalArgumentException("Unsupported color format: " + i10);
        }
        RXLogging.w(TAG, "ctor name: " + str + " type: " + rXVideoCodecStandard + " color format(19:I420 21:NV12): " + i10 + " context: " + context);
        this.mediaCodecWrapperFactory = mediaCodecWrapperFactory;
        this.codecName = str;
        this.codecType = rXVideoCodecStandard;
        this.colorFormat = i10;
        this.sharedContext = context;
        this.width = 0;
        this.height = 0;
    }

    private NativeRXByteMemory copyI420Buffer(ByteBuffer byteBuffer, int i10, int i11, int i12, int i13) {
        if (i10 % 2 != 0) {
            throw new AssertionError("Stride is not divisible by two: " + i10);
        }
        int i14 = (i12 + 1) / 2;
        int i15 = i11 % 2;
        int i16 = i15 == 0 ? (i13 + 1) / 2 : i13 / 2;
        int i17 = i10 / 2;
        int i18 = (i10 * i13) + 0;
        int i19 = (i10 * i11) + 0;
        int i20 = i17 * i16;
        int i21 = i19 + i20;
        int i22 = i19 + ((i17 * i11) / 2);
        int i23 = i22 + i20;
        NativeRXByteMemory nativeRXByteMemoryAllocateI420Buffer = allocateI420Buffer(i12, i13);
        if (nativeRXByteMemoryAllocateI420Buffer == null) {
            return null;
        }
        if (nativeRXByteMemoryAllocateI420Buffer.getNumberOfPlanes() != 3) {
            nativeRXByteMemoryAllocateI420Buffer.release();
            return null;
        }
        byteBuffer.limit(i18);
        byteBuffer.position(0);
        copyPlane(byteBuffer.slice(), i10, nativeRXByteMemoryAllocateI420Buffer.getPlaneData(0), nativeRXByteMemoryAllocateI420Buffer.getPlaneLineSize(0), i12, i13);
        byteBuffer.limit(i21);
        byteBuffer.position(i19);
        copyPlane(byteBuffer.slice(), i17, nativeRXByteMemoryAllocateI420Buffer.getPlaneData(1), nativeRXByteMemoryAllocateI420Buffer.getPlaneLineSize(1), i14, i16);
        if (i15 == 1) {
            byteBuffer.position(i19 + ((i16 - 1) * i17));
            ByteBuffer planeData = nativeRXByteMemoryAllocateI420Buffer.getPlaneData(1);
            planeData.position(nativeRXByteMemoryAllocateI420Buffer.getPlaneLineSize(1) * i16);
            planeData.put(byteBuffer);
        }
        byteBuffer.limit(i23);
        byteBuffer.position(i22);
        copyPlane(byteBuffer.slice(), i17, nativeRXByteMemoryAllocateI420Buffer.getPlaneData(2), nativeRXByteMemoryAllocateI420Buffer.getPlaneLineSize(2), i14, i16);
        if (i15 == 1) {
            byteBuffer.position(i22 + (i17 * (i16 - 1)));
            ByteBuffer planeData2 = nativeRXByteMemoryAllocateI420Buffer.getPlaneData(2);
            planeData2.position(nativeRXByteMemoryAllocateI420Buffer.getPlaneLineSize(2) * i16);
            planeData2.put(byteBuffer);
        }
        return nativeRXByteMemoryAllocateI420Buffer;
    }

    private NativeRXByteMemory copyNV12Buffer(ByteBuffer byteBuffer, int i10, int i11, int i12, int i13) {
        int i14 = (i13 + 1) / 2;
        int i15 = (i10 * i13) + 0;
        int i16 = (i10 * i11) + 0;
        int i17 = i16 + (i10 * i14);
        NativeRXByteMemory nativeRXByteMemoryCreateRXByteMemory = NativeRXByteMemory.createRXByteMemory(i12, i13, RXPixelFormat.kNv12, 0L);
        if (nativeRXByteMemoryCreateRXByteMemory == null) {
            return null;
        }
        if (nativeRXByteMemoryCreateRXByteMemory.getNumberOfPlanes() != 2) {
            nativeRXByteMemoryCreateRXByteMemory.release();
            return null;
        }
        byteBuffer.limit(i15);
        byteBuffer.position(0);
        copyPlane(byteBuffer.slice(), i10, nativeRXByteMemoryCreateRXByteMemory.getPlaneData(0), nativeRXByteMemoryCreateRXByteMemory.getPlaneLineSize(0), i12, i13);
        byteBuffer.limit(i17);
        byteBuffer.position(i16);
        copyPlane(byteBuffer.slice(), i10, nativeRXByteMemoryCreateRXByteMemory.getPlaneData(1), nativeRXByteMemoryCreateRXByteMemory.getPlaneLineSize(1), i12, i14);
        return nativeRXByteMemoryCreateRXByteMemory;
    }

    private Thread createOutputThread() {
        return new Thread("AndroidVideoDecoder.outputThread") { // from class: com.bytedance.realx.video.AndroidVideoDecoder.1
            @Override // java.lang.Thread, java.lang.Runnable
            public void run() {
                AndroidVideoDecoder.this.outputThreadChecker = new ThreadUtils.ThreadChecker();
                while (AndroidVideoDecoder.this.running) {
                    AndroidVideoDecoder.this.deliverDecodedFrame();
                }
                AndroidVideoDecoder.this.releaseCodecOnOutputThread();
            }
        };
    }

    private void deliverByteFrame(int i10, MediaCodec.BufferInfo bufferInfo) {
        int i11;
        int i12;
        int i13;
        int i14;
        synchronized (this.dimensionLock) {
            i11 = this.width;
            i12 = this.height;
            i13 = this.stride;
            i14 = this.sliceHeight;
        }
        int i15 = bufferInfo.size;
        if (i15 < ((i11 * i12) * 3) / 2) {
            RXLogging.e(TAG, "Insufficient output buffer size: " + bufferInfo.size);
            return;
        }
        int i16 = (i15 >= ((i13 * i12) * 3) / 2 || i14 != i12 || i13 <= i11) ? i13 : (i15 * 2) / (i12 * 3);
        ByteBuffer byteBuffer = this.codec.getOutputBuffers()[i10];
        byteBuffer.position(bufferInfo.offset);
        byteBuffer.limit(bufferInfo.offset + bufferInfo.size);
        ByteBuffer byteBufferSlice = byteBuffer.slice();
        NativeRXByteMemory nativeRXByteMemoryCopyI420Buffer = this.colorFormat == 19 ? copyI420Buffer(byteBufferSlice, i16, i14, i11, i12) : copyNV12Buffer(byteBufferSlice, i16, i14, i11, i12);
        if (nativeRXByteMemoryCopyI420Buffer == null) {
            RXLogging.e(TAG, "byteMemory is null, colorFormat:" + this.colorFormat);
            this.dropDecodedFrameCount = this.dropDecodedFrameCount + 1;
            return;
        }
        this.codec.releaseOutputBuffer(i10, false);
        NativeRXVideoFrame nativeRXVideoFrameCreateRXVideoFrame = NativeRXVideoFrame.createRXVideoFrame(nativeRXByteMemoryCopyI420Buffer, bufferInfo.presentationTimeUs * 1000, (ByteBuffer) null, RXColorSpace.kUnknown, RXVideoRotation.VIDEO_ROTATION_0);
        this.callback.onDecodedFrame(nativeRXVideoFrameCreateRXVideoFrame);
        this.callbackDecodedFrameCount++;
        nativeRXByteMemoryCopyI420Buffer.release();
        nativeRXVideoFrameCreateRXVideoFrame.release();
    }

    private void deliverTextureFrame(int i10, MediaCodec.BufferInfo bufferInfo) {
        int i11;
        int i12;
        MediaCodecWrapper mediaCodecWrapper;
        float f10;
        float f11;
        boolean z10;
        boolean z11;
        synchronized (this.dimensionLock) {
            i11 = this.width;
            i12 = this.height;
        }
        VideoDecoder.Settings settings = this.settings;
        if (settings.enableSmoothOutput && !settings.latencyInsensitiveMode) {
            smoothOutputFrame();
        }
        if (this.settings.latencyInsensitiveMode && this.running) {
            int i13 = 0;
            boolean z12 = true;
            while (z12 && i13 < 200) {
                i13++;
                synchronized (this.renderedTextureMetadataLock) {
                    z11 = this.renderedTextureMetadata != null;
                }
                if (z11) {
                    try {
                        Thread.sleep(10L);
                    } catch (InterruptedException e10) {
                        e10.printStackTrace();
                    }
                }
                z12 = z11;
            }
        }
        if (this.enableRetryDeliver && this.running) {
            long jElapsedRealtime = SystemClock.elapsedRealtime();
            RXLogging.i(TAG, "currentFrameCache:" + this.currentFrameCache);
            if (this.currentFrameCache <= this.frameCacheThreshold) {
                f10 = this.maxTryCount;
                f11 = this.maxDeaccelerateRatio;
            } else {
                f10 = this.maxTryCount;
                f11 = this.minAccelerateRatio;
            }
            int i14 = (int) (f10 * f11);
            boolean z13 = true;
            while (z13 && SystemClock.elapsedRealtime() - jElapsedRealtime < i14) {
                synchronized (this.renderedTextureMetadataLock) {
                    z10 = this.renderedTextureMetadata != null;
                }
                if (z10) {
                    try {
                        Thread.sleep(1L);
                    } catch (InterruptedException e11) {
                        e11.printStackTrace();
                    }
                }
                z13 = z10;
            }
            RXLogging.i(TAG, "retry delivering frame take ms: " + (SystemClock.elapsedRealtime() - jElapsedRealtime));
        }
        synchronized (this.renderedTextureMetadataLock) {
            if (this.renderedTextureMetadata != null && (mediaCodecWrapper = this.codec) != null) {
                try {
                    mediaCodecWrapper.releaseOutputBuffer(i10, false);
                } catch (IllegalStateException e12) {
                    RXLogging.e(TAG, "releaseOutputBuffer failed", e12);
                }
                this.dropDecodedFrameCount++;
                this.callback.onMediaCodecStatus(VideoCodecStatus.DROP_DECODED_FRAME, "waiting for texture for the previous frame");
                return;
            }
            synchronized (this.surfaceTextureHelperLock) {
                SurfaceTextureHelper surfaceTextureHelper = this.surfaceTextureHelper;
                if (surfaceTextureHelper != null) {
                    surfaceTextureHelper.setTextureSize(i11, i12);
                    this.renderedTextureMetadata = new DecodedTextureMetadata(bufferInfo.presentationTimeUs);
                    MediaCodecWrapper mediaCodecWrapper2 = this.codec;
                    if (mediaCodecWrapper2 != null) {
                        try {
                            mediaCodecWrapper2.releaseOutputBuffer(i10, true);
                        } catch (IllegalStateException e13) {
                            RXLogging.e(TAG, "releaseOutputBuffer failed!", e13);
                        }
                    }
                    return;
                }
                this.dropDecodedFrameCount++;
                this.callback.onMediaCodecStatus(VideoCodecStatus.DROP_DECODED_FRAME, "surfaceTextureHelper is null");
                RXLogging.e(TAG, "surfaceTextureHelper is null, drop current decoded frame.");
                MediaCodecWrapper mediaCodecWrapper3 = this.codec;
                if (mediaCodecWrapper3 != null) {
                    try {
                        mediaCodecWrapper3.releaseOutputBuffer(i10, false);
                    } catch (IllegalStateException e14) {
                        RXLogging.e(TAG, "releaseOutputBuffer failed", e14);
                    }
                }
                return;
            }
            throw th;
        }
    }

    private VideoCodecStatus initDecodeInternal(int i10, int i11) {
        if (this.callback == null) {
            RXLogging.d(TAG, "callback uninitalized");
            return VideoCodecStatus.UNINITIALIZED;
        }
        long jElapsedRealtime = SystemClock.elapsedRealtime();
        this.decoderThreadChecker = new ThreadUtils.ThreadChecker();
        if (this.sharedContext != null && this.ex_surface == null) {
            VideoDecoder.Settings settings = this.settings;
            if (!settings.enableYUVOutput && curEglContextNum < maxEglContextNum && (this.surfaceTextureHelper == null || !settings.enableSurfaceTextureReuse)) {
                SurfaceTextureHelper surfaceTextureHelperCreateSurfaceTextureHelper = createSurfaceTextureHelper();
                this.surfaceTextureHelper = surfaceTextureHelperCreateSurfaceTextureHelper;
                if (surfaceTextureHelperCreateSurfaceTextureHelper == null) {
                    RXLogging.w(TAG, "surfaceTextureHelper create fail,egl context maybe is full, the hw decoder should use yuvoutput mode");
                    this.mustUseYUVoutput = true;
                } else {
                    RXLogging.w(TAG, "surfaceTextureHelper create successful.");
                    curEglContextNum++;
                    this.surface = new Surface(this.surfaceTextureHelper.getSurfaceTexture());
                    this.surfaceTextureHelper.startListening(this);
                }
            }
        }
        RXLogging.w(TAG, "initDecodeInternal name: " + this.codecName + " type: " + this.codecType + " width: " + i10 + " height: " + i11 + " sharedContext:" + this.sharedContext + " outputByDts:" + this.settings.outputByDts + ", external surface:" + this.ex_surface + ", internal surface:" + this.surface + " smoothOutput:" + this.settings.enableSmoothOutput + " yuv mode:" + this.settings.enableYUVOutput + " mustUseYUVoutput:" + this.mustUseYUVoutput + ", latencyInsensitiveMode:" + this.settings.latencyInsensitiveMode + ", enableRecreateByResolution:" + this.settings.enableRecreateByResolution + ", enableBFrameDecode:" + this.settings.enableBFrameDecode + ", curEglContextNum:" + curEglContextNum);
        if (this.outputThread != null) {
            RXLogging.e(TAG, "initDecodeInternal called while the codec is already running");
            releaseSurface();
            return VideoCodecStatus.FALLBACK_SOFTWARE;
        }
        this.width = i10;
        this.height = i11;
        this.stride = i10;
        this.sliceHeight = i11;
        this.hasDecodedFirstFrame = false;
        this.keyFrameRequired = true;
        this.inputFrameCount = 0L;
        this.outputFrameCount = 0L;
        this.dropDecodedFrameCount = 0L;
        this.callbackDecodedFrameCount = 0L;
        this.minFrameCache = -1L;
        this.currentFrameCache = -1L;
        this.privateParams.clear();
        this.privateParams.putAll(this.vpassPrivateParams);
        try {
            this.codec = this.mediaCodecWrapperFactory.createByCodecName(this.codecName);
            try {
                MediaFormat mediaFormatCreateVideoFormat = MediaFormat.createVideoFormat(this.codecType.mimeType(), i10, i11);
                initMediaFormat(mediaFormatCreateVideoFormat);
                int i12 = this.maxExSurfaceRecreateDecoderCount;
                if (i12 >= 2) {
                    this.ex_surface = null;
                }
                Surface surface = this.ex_surface;
                if (surface != null) {
                    this.maxExSurfaceRecreateDecoderCount = i12 + 1;
                    this.codec.configure(mediaFormatCreateVideoFormat, surface, null, 0);
                    RXLogging.w(TAG, "init codec done with external surface:" + this.ex_surface);
                } else {
                    this.codec.configure(mediaFormatCreateVideoFormat, this.surface, null, 0);
                    RXLogging.w(TAG, "init codec done with internal surface:" + this.surface);
                }
                this.codec.start();
            } catch (IllegalArgumentException | IllegalStateException unused) {
                MediaCodecInfo.CodecCapabilities capabilitiesForType = this.codec.getCodecInfo().getCapabilitiesForType(this.codecType.mimeType());
                RXLogging.w(TAG, "current decoder SupportedHeights:" + capabilitiesForType.getVideoCapabilities().getSupportedHeights());
                RXLogging.w(TAG, "current decoder SupportedWidths:" + capabilitiesForType.getVideoCapabilities().getSupportedWidths());
                RXLogging.w(TAG, "current decoder SupportedFrameRates:" + capabilitiesForType.getVideoCapabilities().getSupportedFrameRates());
                if (!capabilitiesForType.getVideoCapabilities().getSupportedHeights().contains(Integer.valueOf(i11)) || !capabilitiesForType.getVideoCapabilities().getSupportedWidths().contains(Integer.valueOf(i10))) {
                    this.callback.onMediaCodecStatus(VideoCodecStatus.MEDIACODEC_OUT_OF_RESOLUTION, "hardware decoder not support the resolution:" + i10 + "x" + i11);
                    this.codec.release();
                    releaseSurface();
                    RXLogging.w(TAG, "initDecodeInternal err,decoder not support the resolution:" + i10 + "xheight, fallback software");
                    return VideoCodecStatus.FALLBACK_SOFTWARE;
                }
                RXLogging.e(TAG, "initDecode Argument err, try reset Argument and reconfig");
                this.callback.onMediaCodecStatus(VideoCodecStatus.MEDIACODEC_EXCEPTION, "initDecode Argument err, try reset Argument and reconfig");
                MediaFormat mediaFormatCreateVideoFormat2 = MediaFormat.createVideoFormat(this.codecType.mimeType(), i10, i11);
                if (this.sharedContext == null || this.settings.enableYUVOutput) {
                    mediaFormatCreateVideoFormat2.setInteger("color-format", this.colorFormat);
                }
                try {
                    this.codec.configure(mediaFormatCreateVideoFormat2, this.surface, null, 0);
                    this.codec.start();
                } catch (IllegalArgumentException | IllegalStateException e10) {
                    RXLogging.e(TAG, "initDecode failed when retry config:" + e10);
                    StringWriter stringWriter = new StringWriter();
                    e10.printStackTrace(new PrintWriter(stringWriter));
                    this.callback.onMediaCodecStatus(VideoCodecStatus.MEDIACODEC_EXCEPTION, stringWriter.toString());
                    this.codec.release();
                    releaseSurface();
                    return VideoCodecStatus.FALLBACK_SOFTWARE;
                }
            }
            this.running = true;
            this.maxExSurfaceRecreateDecoderCount = 0;
            Thread threadCreateOutputThread = createOutputThread();
            this.outputThread = threadCreateOutputThread;
            threadCreateOutputThread.start();
            long jElapsedRealtime2 = SystemClock.elapsedRealtime() - jElapsedRealtime;
            this.callback.onDecoderInited(jElapsedRealtime2);
            RXLogging.w(TAG, "initDecodeInternal done,init video decoder cost time:" + jElapsedRealtime2);
            Surface surface2 = this.ex_surface;
            if (surface2 != null && this.surface == null) {
                this.usingInternalSurfaceLast = false;
            } else if (surface2 == null && this.surface != null && !this.usingInternalSurfaceLast) {
                this.usingInternalSurfaceLast = true;
                this.callback.onMediaCodecStatus(VideoCodecStatus.USING_INTERNAL_SURFACE, "using internal surface");
            }
            return VideoCodecStatus.OK;
        } catch (IOException | IllegalArgumentException | IllegalStateException | NullPointerException unused2) {
            RXLogging.e(TAG, "Cannot create media decoder " + this.codecName);
            releaseSurface();
            return VideoCodecStatus.FALLBACK_SOFTWARE;
        }
    }

    private void initMediaFormat(MediaFormat mediaFormat) {
        if (this.sharedContext == null || this.settings.enableYUVOutput) {
            RXLogging.w(TAG, "init colorFormatis(I420:19):" + this.colorFormat);
            setIntegerParam(mediaFormat, "color-format", Integer.valueOf(this.colorFormat));
        }
        MediaCodecWrapper mediaCodecWrapper = this.codec;
        if (mediaCodecWrapper != null && mediaCodecWrapper.getCodecInfo().getCapabilitiesForType(this.codecType.mimeType()).isFeatureSupported("adaptive-playback")) {
            boolean z10 = setAdaptivePlaybackParam(mediaFormat, "max-width", Integer.valueOf(mediaFormat.getInteger("width"))) && setAdaptivePlaybackParam(mediaFormat, "max-height", Integer.valueOf(mediaFormat.getInteger("height")));
            this.enable_adaptive_playback = z10;
            if (z10) {
                this.adaptive_playback_max_width = mediaFormat.getInteger("max-width");
                this.adaptive_playback_max_height = mediaFormat.getInteger("max-height");
                RXLogging.w(TAG, "enable adaptive playback max_width: " + this.adaptive_playback_max_width + ", max_height: " + this.adaptive_playback_max_height);
            }
        }
        VideoDecoder.Settings settings = this.settings;
        if (settings.outputByDts && !settings.latencyInsensitiveMode) {
            setIntegerParam(mediaFormat, "low-latency", 1);
            setIntegerParam(mediaFormat, "vendor.qti-ext-dec-picture-order.enable", 1);
            setIntegerParam(mediaFormat, "vendor.qti-ext-dec-low-latency.enable", 1);
            setIntegerParam(mediaFormat, "vendor.rtc-ext-dec-low-latency.enable", 1);
            if (this.width < this.height) {
                setIntegerParam(mediaFormat, "vendor.hisi-ext-low-latency-video-dec.video-scene-for-low-latency-req", 1);
            }
            setIntegerParam(mediaFormat, "vendor.hisi-ext-low-latency-video-dec.video-scene-for-low-latency-rdy", -1);
            setIntegerParam(mediaFormat, "fast-output-mode", 1);
            setStringParam(mediaFormat, "vendor.vdec.example-ext-dec-low-latency.enable", "true");
        }
        for (Map.Entry<String, String> entry : this.privateParams.entrySet()) {
            if (!entry.getKey().equals("max-width") && !entry.getKey().equals("max-height")) {
                RXLogging.w(TAG, "set android hardware decoder private param with Key:" + entry.getKey() + " Value:" + entry.getValue());
                if (entry.getValue().equals(HISI_DECODER_END_CODE) && entry.getValue() == "0") {
                    this.enableHisiEndCode = false;
                    RXLogging.w(TAG, "set android hardware decoder close hisi hw decoder endcode");
                } else {
                    RXLogging.w(TAG, "set android hardware decoder private param with Key:" + entry.getKey() + " Value:" + entry.getValue());
                    if (isNumeric(entry.getValue())) {
                        mediaFormat.setInteger(entry.getKey(), Integer.parseInt(entry.getValue()));
                    } else if (entry.getValue().length() > 0) {
                        mediaFormat.setString(entry.getKey(), entry.getValue());
                    }
                }
            }
        }
    }

    private boolean isNumeric(String str) {
        return str != null && str.matches("[0-9]+");
    }

    private boolean isSupportedColorFormat(int i10) {
        for (int i11 : MediaCodecUtils.DECODER_COLOR_FORMATS) {
            if (i11 == i10) {
                return true;
            }
        }
        return false;
    }

    private void reformat(MediaFormat mediaFormat) {
        int integer;
        int integer2;
        this.outputThreadChecker.checkIsOnValidThread();
        if (mediaFormat.containsKey(MEDIA_FORMAT_KEY_CROP_LEFT) && mediaFormat.containsKey(MEDIA_FORMAT_KEY_CROP_RIGHT) && mediaFormat.containsKey(MEDIA_FORMAT_KEY_CROP_BOTTOM) && mediaFormat.containsKey(MEDIA_FORMAT_KEY_CROP_TOP)) {
            integer = (mediaFormat.getInteger(MEDIA_FORMAT_KEY_CROP_RIGHT) + 1) - mediaFormat.getInteger(MEDIA_FORMAT_KEY_CROP_LEFT);
            integer2 = (mediaFormat.getInteger(MEDIA_FORMAT_KEY_CROP_BOTTOM) + 1) - mediaFormat.getInteger(MEDIA_FORMAT_KEY_CROP_TOP);
            RXLogging.i(TAG, "stream have crop info newWidth:" + integer + " newHeight:" + integer2);
        } else {
            integer = mediaFormat.getInteger("width");
            integer2 = mediaFormat.getInteger("height");
        }
        synchronized (this.dimensionLock) {
            if (this.hasDecodedFirstFrame && (this.width != integer || this.height != integer2)) {
                stopOnOutputThread(new RuntimeException("Unexpected size change. Configured " + this.width + androidx.webkit.b.f28327e + this.height + ". New " + integer + androidx.webkit.b.f28327e + integer2));
                return;
            }
            this.width = integer;
            this.height = integer2;
            if (((this.surfaceTextureHelper == null && this.ex_surface == null) || this.settings.enableYUVOutput) && mediaFormat.containsKey("color-format")) {
                this.colorFormat = mediaFormat.getInteger("color-format");
                RXLogging.i(TAG, "Color: 0x" + Integer.toHexString(this.colorFormat));
                if (!isSupportedColorFormat(this.colorFormat)) {
                    stopOnOutputThread(new IllegalStateException("Unsupported color format: " + this.colorFormat));
                    return;
                }
            }
            synchronized (this.dimensionLock) {
                if (mediaFormat.containsKey(MEDIA_FORMAT_KEY_STRIDE)) {
                    this.stride = mediaFormat.getInteger(MEDIA_FORMAT_KEY_STRIDE);
                }
                if (mediaFormat.containsKey(MEDIA_FORMAT_KEY_SLICE_HEIGHT)) {
                    this.sliceHeight = mediaFormat.getInteger(MEDIA_FORMAT_KEY_SLICE_HEIGHT);
                }
                RXLogging.i(TAG, "Frame stride and slice height: " + this.stride + " x " + this.sliceHeight);
                this.stride = Math.max(this.width, this.stride);
                this.sliceHeight = Math.max(this.height, this.sliceHeight);
            }
        }
    }

    private VideoCodecStatus reinitDecode(int i10, int i11) {
        VideoCodecStatus videoCodecStatusReleaseInternal = releaseInternal();
        if (!this.settings.enableSurfaceTextureReuse) {
            releaseSurface();
        }
        if (videoCodecStatusReleaseInternal != VideoCodecStatus.OK) {
            RXLogging.e(TAG, "releaseInternal err");
            return videoCodecStatusReleaseInternal;
        }
        VideoCodecStatus videoCodecStatusInitDecodeInternal = VideoCodecStatus.FALLBACK_SOFTWARE;
        for (int i12 = 0; i12 < 5 && VideoCodecStatus.OK != (videoCodecStatusInitDecodeInternal = initDecodeInternal(i10, i11)); i12++) {
            releaseSurface();
        }
        return videoCodecStatusInitDecodeInternal;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void releaseCodecOnOutputThread() {
        this.outputThreadChecker.checkIsOnValidThread();
        RXLogging.i(TAG, "Releasing MediaCodec on output thread");
        try {
            this.codec.stop();
        } catch (Exception e10) {
            RXLogging.e(TAG, "Media decoder stop failed", e10);
        }
        try {
            this.codec.release();
        } catch (Exception e11) {
            RXLogging.e(TAG, "Media decoder release failed", e11);
            this.shutdownException = e11;
        }
        releaseSurface();
        RXLogging.i(TAG, "Release on output thread done");
    }

    /* JADX WARN: Multi-variable type inference failed */
    private VideoCodecStatus releaseInternal() {
        if (!this.running) {
            RXLogging.d(TAG, "release: Decoder is not running.");
            return VideoCodecStatus.OK;
        }
        try {
            this.running = false;
            if (!ThreadUtils.joinUninterruptibly(this.outputThread, 6000L)) {
                RXLogging.e(TAG, "Media decoder release timeout", new RuntimeException());
                return VideoCodecStatus.TIMEOUT;
            }
            if (this.shutdownException == null) {
                Object[] objArr = objArr == true ? 1 : 0;
                return VideoCodecStatus.OK;
            }
            RXLogging.e(TAG, "Media decoder release error", new RuntimeException(this.shutdownException));
            this.shutdownException = null;
            return VideoCodecStatus.ERROR;
        } finally {
            this.codec = null;
            this.outputThread = null;
        }
    }

    private boolean setAdaptivePlaybackParam(MediaFormat mediaFormat, String str, Integer num) {
        for (Map.Entry<String, String> entry : this.privateParams.entrySet()) {
            if (entry.getKey().equals(str) && isNumeric(entry.getValue())) {
                int iMax = Math.max(Integer.parseInt(entry.getValue()), num.intValue());
                if (iMax > 9000 || iMax <= 0) {
                    RXLogging.w(TAG, "setAdaptivePlaybackParam failed! exceeding the valid range(0, 10000], key: " + entry.getKey() + ", value: " + iMax + " {privateConfig: " + Integer.parseInt(entry.getValue()) + ", resoluion: " + num + z5.g.f141884d);
                    return false;
                }
                mediaFormat.setInteger(entry.getKey(), iMax);
                RXLogging.w(TAG, "setAdaptivePlaybackParam params key: " + entry.getKey() + ", value:" + Math.max(Integer.parseInt(entry.getValue()), num.intValue()) + " {privateConfig: " + Integer.parseInt(entry.getValue()) + ", resoluion: " + num + z5.g.f141884d);
                return true;
            }
        }
        RXLogging.w(TAG, "setAdaptivePlaybackParam, but private key isn't setted, params: " + str);
        return false;
    }

    private void setIntegerParam(MediaFormat mediaFormat, String str, Integer num) {
        for (Map.Entry<String, String> entry : this.privateParams.entrySet()) {
            if (entry.getKey().equals(str)) {
                if (isNumeric(entry.getValue())) {
                    mediaFormat.setInteger(entry.getKey(), Integer.parseInt(entry.getValue()));
                    RXLogging.w(TAG, "the decoder params " + entry.getKey() + " is coverd by vpaas with value:" + entry.getValue());
                    this.privateParams.remove(str);
                    return;
                }
                this.privateParams.remove(str);
                if (entry.getValue().length() <= 0) {
                    RXLogging.w(TAG, "the decoder params " + entry.getKey() + " is disabled by vpaas,skip it");
                    return;
                }
                RXLogging.w(TAG, "the decoder params " + entry.getKey() + " set by vpaas is invalid with value:" + entry.getValue() + ",skip it");
            }
        }
        RXLogging.w(TAG, "decoder int params has been set with Key:" + str + " Value:" + num);
        mediaFormat.setInteger(str, num.intValue());
    }

    private void setStringParam(MediaFormat mediaFormat, String str, String str2) {
        for (Map.Entry<String, String> entry : this.privateParams.entrySet()) {
            if (entry.getKey().equals(str)) {
                if (entry.getValue().length() > 0) {
                    mediaFormat.setString(entry.getKey(), entry.getValue());
                    RXLogging.w(TAG, "the decoder params " + entry.getKey() + " is coverd by vpaas with value:" + entry.getValue());
                } else {
                    RXLogging.w(TAG, "the decoder params " + entry.getKey() + " is disabled by vpaas,skip it");
                }
                this.privateParams.remove(str);
                return;
            }
        }
        RXLogging.w(TAG, "decoder string params has been set with Key:" + str + " Value:" + str2);
        mediaFormat.setString(str, str2);
    }

    private void smoothOutputFrame() {
        long jElapsedRealtime = SystemClock.elapsedRealtime();
        this.currentOutputTime = jElapsedRealtime;
        long j10 = this.outputFrameCount;
        long j11 = this.inputFrameCount;
        if (j10 > j11) {
            this.outputFrameCount = j11;
        }
        long j12 = this.minFrameCache;
        if (j12 < 0) {
            this.minFrameCache = this.currentFrameCache;
        } else {
            long j13 = this.currentFrameCache;
            if (j12 > j13 && j13 >= 0) {
                j12 = j13;
            }
            this.minFrameCache = j12;
        }
        long j14 = this.lastOutputTime;
        long j15 = jElapsedRealtime - j14;
        long j16 = this.avgInputTimeDelta;
        if (j16 <= 0) {
            j16 = this.currentInputTimeDelta;
            if (j16 <= 0) {
                j16 = 16;
            }
        } else {
            long j17 = this.currentInputTimeDelta;
            if (j17 < j16) {
                j16 = 10;
                if (j17 > 10) {
                    j16 = j17;
                }
            }
        }
        if (j14 > 0 && j15 < j16) {
            long j18 = j16 - j15;
            if (this.currentFrameCache > this.minFrameCache) {
                j18 /= 2;
            }
            if (j18 > 1300) {
                j18 = 1300;
            }
            if (j18 > 0) {
                try {
                    synchronized (this.smoothOutputLock) {
                        this.smoothOutputLock.wait(j18);
                    }
                } catch (Exception e10) {
                    e10.printStackTrace();
                }
            }
        }
        this.lastOutputTime = SystemClock.elapsedRealtime();
    }

    private void stopOnOutputThread(Exception exc) {
        this.outputThreadChecker.checkIsOnValidThread();
        this.running = false;
        this.shutdownException = exc;
    }

    protected NativeRXByteMemory allocateI420Buffer(int i10, int i11) {
        return NativeRXByteMemory.createRXByteMemory(i10, i11, RXPixelFormat.kI420, 0L);
    }

    protected void copyPlane(ByteBuffer byteBuffer, int i10, ByteBuffer byteBuffer2, int i11, int i12, int i13) {
        YuvHelper.copyPlane(byteBuffer, i10, byteBuffer2, i11, i12, i13);
    }

    @Override // com.bytedance.realx.video.VideoDecoder
    public /* synthetic */ long createNativeVideoDecoder() {
        return d0.a(this);
    }

    protected SurfaceTextureHelper createSurfaceTextureHelper() {
        return SurfaceTextureHelper.create("decoder-texture-thread", this.sharedContext);
    }

    /* JADX WARN: Code duplicated, block: B:85:0x01ee  */
    @Override // com.bytedance.realx.video.VideoDecoder
    public VideoCodecStatus decode(EncodedImage encodedImage) {
        VideoCodecStatus videoCodecStatusReinitDecode;
        int i10;
        long jElapsedRealtime = SystemClock.elapsedRealtime();
        long j10 = this.lastInputTime;
        if (j10 > 0) {
            this.currentInputTimeDelta = jElapsedRealtime - j10;
        }
        this.lastInputTime = jElapsedRealtime;
        long j11 = this.packetCount2s + 1;
        this.packetCount2s = j11;
        if (0 == this.timeForAvg) {
            this.timeForAvg = jElapsedRealtime;
        }
        long j12 = this.timeForAvg;
        if (jElapsedRealtime - j12 >= 2000 && j11 > 0) {
            this.avgInputTimeDelta = (jElapsedRealtime - j12) / j11;
            this.packetCount2s = 0L;
            this.timeForAvg = jElapsedRealtime;
        }
        try {
            int i11 = encodedImage.encodedWidth;
            boolean z10 = true;
            if (i11 != this.encoded_width || encodedImage.encodedHeight != this.encoded_height) {
                if (this.codec != null && this.enable_adaptive_playback && (i11 > this.adaptive_playback_max_width || encodedImage.encodedHeight > this.adaptive_playback_max_height)) {
                    RXLogging.w(TAG, "frame resolution(" + encodedImage.encodedWidth + androidx.webkit.b.f28327e + encodedImage.encodedHeight + " exceeded maximum limit of adaptive playback max_width: " + this.adaptive_playback_max_width + ", max_height: " + this.adaptive_playback_max_height);
                    this.enable_adaptive_playback = false;
                }
                StringBuilder sb2 = new StringBuilder();
                sb2.append("resolution changed, try to reinit decoder. enable_adaptive_playback: ");
                sb2.append(this.enable_adaptive_playback);
                sb2.append(", is first init: ");
                sb2.append(this.encoded_width == 0);
                sb2.append(", new width: ");
                sb2.append(encodedImage.encodedWidth);
                sb2.append(", new height: ");
                sb2.append(encodedImage.encodedHeight);
                RXLogging.w(TAG, sb2.toString());
                if ((this.encoded_width == 0 || !this.enable_adaptive_playback) && (videoCodecStatusReinitDecode = reinitDecode(encodedImage.encodedWidth, encodedImage.encodedHeight)) != VideoCodecStatus.OK) {
                    return videoCodecStatusReinitDecode;
                }
                synchronized (this.dimensionLock) {
                    int i12 = encodedImage.encodedWidth;
                    this.encoded_width = i12;
                    int i13 = encodedImage.encodedHeight;
                    this.encoded_height = i13;
                    this.width = i12;
                    this.height = i13;
                }
            }
            this.decoderThreadChecker.checkIsOnValidThread();
            if (this.codec != null && this.callback != null) {
                ByteBuffer byteBuffer = encodedImage.buffer;
                if (byteBuffer == null) {
                    RXLogging.e(TAG, "decode() - no input data");
                    return VideoCodecStatus.ERR_PARAMETER;
                }
                int iRemaining = byteBuffer.remaining();
                if (iRemaining == 0) {
                    RXLogging.e(TAG, "decode() - input buffer empty");
                    return VideoCodecStatus.ERR_PARAMETER;
                }
                if (this.keyFrameRequired) {
                    if (encodedImage.frameType != EncodedImage.FrameType.kIntra) {
                        RXLogging.e(TAG, "decode() - key frame required first");
                        return VideoCodecStatus.NO_OUTPUT;
                    }
                    if (!encodedImage.completeFrame) {
                        RXLogging.e(TAG, "decode() - complete frame required first");
                        return VideoCodecStatus.NO_OUTPUT;
                    }
                }
                try {
                    int iDequeueInputBuffer = this.codec.dequeueInputBuffer(this.settings.latencyInsensitiveMode ? 5000000L : 500000L);
                    if (iDequeueInputBuffer < 0) {
                        RXLogging.e(TAG, "decode() - no HW buffers available; decoder falling behind");
                        return VideoCodecStatus.OVERLOAD;
                    }
                    try {
                        ByteBuffer byteBuffer2 = this.codec.getInputBuffers()[iDequeueInputBuffer];
                        if (byteBuffer2.capacity() < iRemaining) {
                            RXLogging.e(TAG, "decode() - HW buffer too small");
                            return VideoCodecStatus.OVERLOAD;
                        }
                        byteBuffer2.put(encodedImage.buffer);
                        if (this.enableHisiEndCode && this.codecName.startsWith("OMX.hisi")) {
                            byte[] bArr = {0, 0, 0, 1, com.google.common.base.a.H, 72, org.apache.tools.tar.c.P, 80, 73, 67, 69, 78, 68, 0, 0, 0, 1, 0};
                            int i14 = iRemaining + 18;
                            if (byteBuffer2.capacity() >= i14) {
                                byteBuffer2.put(bArr);
                                i10 = i14;
                            } else {
                                i10 = iRemaining;
                            }
                        } else {
                            i10 = iRemaining;
                        }
                        try {
                            this.codec.queueInputBuffer(iDequeueInputBuffer, 0, i10, TimeUnit.NANOSECONDS.toMicros(encodedImage.captureTimeNs), 0);
                            if (this.keyFrameRequired) {
                                this.keyFrameRequired = false;
                            }
                            VideoDecoder.Settings settings = this.settings;
                            if (settings.enableSmoothOutput && !settings.latencyInsensitiveMode && !settings.enableBFrameDecode) {
                                long j13 = this.inputFrameCount - this.outputFrameCount;
                                if (j13 <= 0) {
                                    j13 = this.currentFrameCache;
                                }
                                this.currentFrameCache = j13;
                                long j14 = this.minFrameCache;
                                if (j14 >= 0 && j13 > j14) {
                                    try {
                                        synchronized (this.smoothOutputLock) {
                                            this.smoothOutputLock.notify();
                                        }
                                    } catch (Exception unused) {
                                        RXLogging.e(TAG, "currentFrameCache:" + this.currentFrameCache + " minFrameCache:" + this.minFrameCache);
                                    }
                                }
                            }
                            this.inputFrameCount++;
                            return VideoCodecStatus.OK;
                        } catch (IllegalStateException e10) {
                            RXLogging.e(TAG, "queueInputBuffer failed", e10);
                            return VideoCodecStatus.ERROR;
                        }
                    } catch (IllegalStateException e11) {
                        RXLogging.e(TAG, "getInputBuffers failed", e11);
                        return VideoCodecStatus.ERROR;
                    }
                } catch (IllegalStateException e12) {
                    RXLogging.e(TAG, "dequeueInputBuffer failed", e12);
                    return VideoCodecStatus.ERROR;
                }
            }
            StringBuilder sb3 = new StringBuilder();
            sb3.append("decode uninitalized, codec: ");
            if (this.codec == null) {
                z10 = false;
            }
            sb3.append(z10);
            sb3.append(", callback: ");
            sb3.append(this.callback);
            RXLogging.d(TAG, sb3.toString());
            return VideoCodecStatus.UNINITIALIZED;
        } catch (Exception e13) {
            RXLogging.e(TAG, "android decode err", e13);
            return VideoCodecStatus.ERROR;
        }
    }

    protected void deliverDecodedFrame() {
        this.outputThreadChecker.checkIsOnValidThread();
        if (this.codec == null) {
            RXLogging.w(TAG, "codec is null when call deliverDecodedFrame");
            return;
        }
        try {
            MediaCodec.BufferInfo bufferInfo = new MediaCodec.BufferInfo();
            int iDequeueOutputBuffer = this.codec.dequeueOutputBuffer(bufferInfo, this.settings.latencyInsensitiveMode ? 25000L : 100000L);
            if (iDequeueOutputBuffer == -2) {
                reformat(this.codec.getOutputFormat());
                return;
            }
            if (iDequeueOutputBuffer < 0) {
                RXLogging.w(TAG, "dequeueOutputBuffer err, returned " + iDequeueOutputBuffer);
                return;
            }
            this.outputFrameCount++;
            if (this.ex_surface == null) {
                if (!this.hasDecodedFirstFrame) {
                    this.hasDecodedFirstFrame = true;
                }
                if (this.surfaceTextureHelper != null) {
                    deliverTextureFrame(iDequeueOutputBuffer, bufferInfo);
                    return;
                } else {
                    deliverByteFrame(iDequeueOutputBuffer, bufferInfo);
                    return;
                }
            }
            try {
                this.codec.releaseOutputBuffer(iDequeueOutputBuffer, true);
                if (!this.hasDecodedFirstFrame) {
                    this.hasDecodedFirstFrame = true;
                }
                NativeRXByteMemory nativeRXByteMemory = new NativeRXByteMemory(this.width, this.height, 0L, null, null, RXPixelFormat.kUnknown);
                NativeRXVideoFrame nativeRXVideoFrameCreateRXVideoFrame = NativeRXVideoFrame.createRXVideoFrame(nativeRXByteMemory, bufferInfo.presentationTimeUs * 1000, (ByteBuffer) null, RXColorSpace.kUnknown, RXVideoRotation.VIDEO_ROTATION_0);
                this.callback.onDecodedFrame(nativeRXVideoFrameCreateRXVideoFrame);
                this.callbackDecodedFrameCount++;
                nativeRXByteMemory.release();
                nativeRXVideoFrameCreateRXVideoFrame.release();
            } catch (IllegalStateException e10) {
                StringWriter stringWriter = new StringWriter();
                e10.printStackTrace(new PrintWriter(stringWriter));
                this.callback.onMediaCodecStatus(VideoCodecStatus.MEDIACODEC_EXCEPTION, stringWriter.toString());
                this.callback.onMediaCodecStatus(VideoCodecStatus.DROP_DECODED_FRAME, "releaseOutputBuffer err");
                this.dropDecodedFrameCount++;
            }
        } catch (IllegalStateException e11) {
            RXLogging.e(TAG, "deliverDecodedFrame failed", e11);
        }
    }

    @Override // com.bytedance.realx.video.VideoDecoder
    public void disableExternalSurface() {
        RXLogging.w(TAG, "disable external surface.");
        this.ex_surface = null;
    }

    @Override // com.bytedance.realx.video.VideoDecoder
    public String getImplementationName() {
        return this.codecName;
    }

    @Override // com.bytedance.realx.video.VideoDecoder
    public boolean getPrefersLateDecoding() {
        return true;
    }

    @Override // com.bytedance.realx.video.VideoDecoder
    public VideoCodecStatus initDecode(VideoDecoder.Settings settings, VideoDecoder.Callback callback) {
        this.callback = callback;
        this.settings = settings;
        return VideoCodecStatus.OK;
    }

    @Override // com.bytedance.realx.video.VideoDecoder, com.bytedance.realx.video.VideoSink
    public void onFrame(RXVideoFrameInterface rXVideoFrameInterface) {
        synchronized (this.renderedTextureMetadataLock) {
            DecodedTextureMetadata decodedTextureMetadata = this.renderedTextureMetadata;
            if (decodedTextureMetadata != null) {
                long j10 = decodedTextureMetadata.presentationTimestampUs * 1000;
                this.renderedTextureMetadata = null;
                rXVideoFrameInterface.setTimestampNs(j10);
                this.callback.onDecodedFrame(rXVideoFrameInterface);
                this.callbackDecodedFrameCount++;
                return;
            }
            RXLogging.e(TAG, "renderedTextureMetadata is null drop current decoded frame,running:" + this.running);
            this.callback.onMediaCodecStatus(VideoCodecStatus.DROP_DECODED_FRAME, "renderedTextureMetadata is null");
            this.dropDecodedFrameCount = this.dropDecodedFrameCount + 1;
        }
    }

    @Override // com.bytedance.realx.video.VideoDecoder
    public VideoCodecStatus release() {
        RXLogging.w(TAG, "mediacodec release");
        VideoCodecStatus videoCodecStatusReleaseInternal = releaseInternal();
        releaseSurface();
        releaseSurfaceTextureHelper();
        synchronized (this.renderedTextureMetadataLock) {
            this.renderedTextureMetadata = null;
        }
        this.callback = null;
        this.encoded_width = 0;
        this.encoded_height = 0;
        return videoCodecStatusReleaseInternal;
    }

    protected void releaseSurface() {
        RXLogging.w(TAG, "releaseSurface start");
        if (this.surface != null) {
            RXLogging.w(TAG, "release surface");
            this.surface.release();
            this.surface = null;
        }
        synchronized (this.surfaceTextureHelperLock) {
            if (this.surfaceTextureHelper != null) {
                RXLogging.w(TAG, "surfaceTextureHelper.stopListening()");
                this.surfaceTextureHelper.stopListening();
            }
        }
        if (this.settings.enableSurfaceTextureReuse) {
            return;
        }
        releaseSurfaceTextureHelper();
    }

    protected void releaseSurfaceTextureHelper() {
        synchronized (this.surfaceTextureHelperLock) {
            if (this.surfaceTextureHelper != null) {
                RXLogging.w(TAG, "release surfaceTextureHelper");
                this.surfaceTextureHelper.dispose();
                this.surfaceTextureHelper = null;
                curEglContextNum--;
                RXLogging.w(TAG, "release surfaceTextureHelper done, curEglContextNum:" + curEglContextNum);
            }
        }
    }

    @Override // com.bytedance.realx.video.VideoDecoder
    public VideoCodecStatus setDeliverParams(boolean z10, int i10, float f10, float f11, int i11) {
        RXLogging.w(TAG, "got android hardware decoder setDeliverParams enable:" + z10 + ", maxTryCount:" + i10 + ", minAccelerateRatio:" + f10 + ", maxDeaccelerateRatio:" + f11 + ", frameCacheThreshold:" + i11);
        this.enableRetryDeliver = z10;
        this.maxTryCount = i10;
        this.minAccelerateRatio = f10;
        this.maxDeaccelerateRatio = f11;
        this.frameCacheThreshold = i11;
        return VideoCodecStatus.OK;
    }

    @Override // com.bytedance.realx.video.VideoDecoder
    public void setExternalSurface(Surface surface) {
        RXLogging.w(TAG, "set external surface . surface:" + surface);
        if (surface != null) {
            this.ex_surface = surface;
            this.surface = null;
        }
    }

    @Override // com.bytedance.realx.video.VideoDecoder
    public VideoCodecStatus setPrivateParam(String str, String str2) {
        RXLogging.w(TAG, "got android hardware decoder setPrivateParam key:" + str + " value:" + str2);
        if (!str.equals(MAX_EGL_NUM)) {
            this.vpassPrivateParams.put(str, str2);
            return VideoCodecStatus.OK;
        }
        if (isNumeric(str2)) {
            maxEglContextNum = Integer.parseInt(str2);
        }
        RXLogging.w(TAG, "this is not a param set to HW Decoder, only for control.");
        return VideoCodecStatus.OK;
    }

    @Override // com.bytedance.realx.video.VideoDecoder
    public VideoCodecStatus updateSettings(VideoDecoder.Settings settings) {
        this.settings = settings;
        RXLogging.w(TAG, "updateSettings outputByDts:" + this.settings.outputByDts + ", smoothOutput:" + this.settings.enableSmoothOutput + ", yuv mode:" + this.settings.enableYUVOutput + ", latencyInsensitiveMode:" + this.settings.latencyInsensitiveMode + ", enableRecreateByResolution:" + this.settings.enableRecreateByResolution + ", enableBFrameDecode:" + this.settings.enableBFrameDecode);
        return VideoCodecStatus.OK;
    }
}
