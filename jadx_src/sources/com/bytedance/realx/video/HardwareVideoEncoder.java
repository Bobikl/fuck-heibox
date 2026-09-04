package com.bytedance.realx.video;

import android.annotation.TargetApi;
import android.media.MediaCodec;
import android.media.MediaCodecInfo;
import android.media.MediaFormat;
import android.opengl.GLES20;
import android.os.Build;
import android.os.Bundle;
import android.os.SystemClock;
import android.text.TextUtils;
import android.view.Surface;
import androidx.annotation.p0;
import com.bytedance.realx.RXVideoSurfaceController;
import com.bytedance.realx.base.RXDeviceInfoAndroid;
import com.bytedance.realx.base.RXLogging;
import com.bytedance.realx.base.ThreadUtils;
import com.bytedance.realx.video.memory.NativeRXByteMemory;
import com.bytedance.realx.video.memory.NativeRXOpenGLMemory;
import com.bytedance.realx.video.memory.RXVideoFrameInterface;
import com.bytedance.realx.video.memory.RXVideoMemoryInterface;
import java.nio.ByteBuffer;
import java.util.Deque;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.LinkedBlockingDeque;
import java.util.concurrent.TimeUnit;

/* JADX INFO: loaded from: classes6.dex */
@TargetApi(21)
public class HardwareVideoEncoder implements VideoEncoder {
    private static final int DEQUEUE_OUTPUT_BUFFER_TIMEOUT_US = 100000;
    private static final int DTS_OFFSET_FRAME_NUM = 7;
    private static final String KEY_HISI_EXT_CODEC_MAX_QP = "vendor.hisi.hisi-ext-codec-max-qp";
    private static final String KEY_HISI_EXT_CODEC_MIN_QP = "vendor.hisi.hisi-ext-codec-min-qp";
    private static final String KEY_HISI_EXT_CODEC_NON_REF_P_FRAMES = "vendor.hisi.hisi-ext-codec-non-ref-p-frames";
    private static final String KEY_HISI_EXT_CODEC_NON_REF_P_FRAMES_SUPPORTED = "vendor.hisi.hisi-ext-codec-non-ref-p-frames-supported";
    private static final String KEY_HISI_EXT_CODEC_QP_REGULATION_SUPPORETD = "vendor.hisi.hisi-ext-codec-qp-regulation-supported";
    private static final String KEY_HISI_EXT_CODEC_VENDOR_CONFIGURE = "vendor.hisi.hisi-ext-codec-vendor-configure";
    private static final String KEY_PRIVATE_PARAM_FORCE_SURFACE_INPUT = "realx.force.surface.input";
    private static final int MAX_VIDEO_FRAMERATE = 60;
    private static final int MEDIA_CODEC_RELEASE_TIMEOUT_MS = 5000;
    private static final int RESTART_ENCODER_TIME_THRESHOLD_MS = 5000;
    private static final String TAG = "HardwareVideoEncoder";
    private int adjustedBitrate;
    private boolean automaticResizeOn;
    private VideoEncoder.BitrateMode bitrateMode;
    private VideoEncoder.Callback callback;

    @p0
    private MediaCodecWrapper codec;
    private final RXVideoCodecDesc codecDesc;
    private final String codecName;

    @p0
    private ByteBuffer configBuffer;
    private final Deque<Long> dtsQueue;
    private final ThreadUtils.ThreadChecker encodeThreadChecker;
    private boolean encodedFirstFrame;
    private long firstFrameDiffUs;
    private Boolean forceSurfaceInput;
    private final long forcedKeyFrameNs;
    private int height;
    private boolean isNeedSurfaceInputWorkaround;
    private Boolean isTextureBuffer;
    private final int keyFrameIntervalSec;
    private long lastKeyFrameNs;
    private final MediaCodecWrapperFactory mediaCodecWrapperFactory;

    @p0
    private Thread outputThread;
    private final ThreadUtils.ThreadChecker outputThreadChecker;
    private HashMap<String, String> privateParams;
    private volatile boolean running;
    private VideoEncoder.ScaleMode scaleMode;
    private VideoEncoder.Settings settings;
    private EglBase14.Context sharedContext;

    @p0
    private volatile Exception shutdownException;
    private final Integer surfaceColorFormat;
    private int svcRealLayerNum;

    @p0
    private EglBase14 textureEglBase;

    @p0
    private Surface textureInputSurface;
    private int updateBitrate;
    private long updateBitrateTimestamp;
    private boolean useSurfaceMode;
    private HashMap<String, String> vpassPrivateParams;
    private int width;
    private final Integer yuvColorFormat;
    private final YuvFormat yuvFormat;
    private GlRectDrawer textureDrawer = new GlRectDrawer();
    private VideoFrameDrawer videoFrameDrawer = new VideoFrameDrawer();

    /* JADX INFO: renamed from: com.bytedance.realx.video.HardwareVideoEncoder$2, reason: invalid class name */
    public static /* synthetic */ class AnonymousClass2 {
        static final /* synthetic */ int[] $SwitchMap$com$bytedance$realx$video$RXVideoCodecProfile;

        static {
            int[] iArr = new int[RXVideoCodecProfile.values().length];
            $SwitchMap$com$bytedance$realx$video$RXVideoCodecProfile = iArr;
            try {
                iArr[RXVideoCodecProfile.ProfileHigh.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                $SwitchMap$com$bytedance$realx$video$RXVideoCodecProfile[RXVideoCodecProfile.ProfileConstrainedHigh.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                $SwitchMap$com$bytedance$realx$video$RXVideoCodecProfile[RXVideoCodecProfile.ProfileBaseline.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                $SwitchMap$com$bytedance$realx$video$RXVideoCodecProfile[RXVideoCodecProfile.ProfileConstrainedBaseline.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                $SwitchMap$com$bytedance$realx$video$RXVideoCodecProfile[RXVideoCodecProfile.ProfileMain.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                $SwitchMap$com$bytedance$realx$video$RXVideoCodecProfile[RXVideoCodecProfile.ByteVC1ProfileMain.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                $SwitchMap$com$bytedance$realx$video$RXVideoCodecProfile[RXVideoCodecProfile.ByteVC1ProfileMain10.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                $SwitchMap$com$bytedance$realx$video$RXVideoCodecProfile[RXVideoCodecProfile.ByteVC1ProfileMain10HDR10.ordinal()] = 8;
            } catch (NoSuchFieldError unused8) {
            }
        }
    }

    public enum YuvFormat {
        I420 { // from class: com.bytedance.realx.video.HardwareVideoEncoder.YuvFormat.1
            @Override // com.bytedance.realx.video.HardwareVideoEncoder.YuvFormat
            void fillBuffer(ByteBuffer byteBuffer, RXVideoFrameInterface rXVideoFrameInterface) {
                RXVideoMemoryInterface andRetainVideoFrameMemory;
                if (rXVideoFrameInterface == null || (andRetainVideoFrameMemory = rXVideoFrameInterface.getAndRetainVideoFrameMemory()) == null) {
                    return;
                }
                if (andRetainVideoFrameMemory.getPixelFormat() == RXPixelFormat.kI420 && (andRetainVideoFrameMemory instanceof NativeRXByteMemory)) {
                    NativeRXByteMemory nativeRXByteMemory = (NativeRXByteMemory) andRetainVideoFrameMemory;
                    YuvHelper.I420Copy(nativeRXByteMemory.getPlaneData(0), nativeRXByteMemory.getPlaneLineSize(0), nativeRXByteMemory.getPlaneData(1), nativeRXByteMemory.getPlaneLineSize(1), nativeRXByteMemory.getPlaneData(2), nativeRXByteMemory.getPlaneLineSize(2), byteBuffer, rXVideoFrameInterface.getWidth(), rXVideoFrameInterface.getHeight());
                } else {
                    RXVideoFrameInterface i420 = rXVideoFrameInterface.toI420();
                    if (i420 == null) {
                        andRetainVideoFrameMemory.release();
                        return;
                    }
                    RXVideoMemoryInterface andRetainVideoFrameMemory2 = i420.getAndRetainVideoFrameMemory();
                    if (andRetainVideoFrameMemory2 == null) {
                        i420.release();
                        andRetainVideoFrameMemory.release();
                        return;
                    } else if (!(andRetainVideoFrameMemory2 instanceof NativeRXByteMemory)) {
                        andRetainVideoFrameMemory2.release();
                        i420.release();
                        andRetainVideoFrameMemory.release();
                        return;
                    } else {
                        NativeRXByteMemory nativeRXByteMemory2 = (NativeRXByteMemory) andRetainVideoFrameMemory2;
                        YuvHelper.I420Copy(nativeRXByteMemory2.getPlaneData(0), nativeRXByteMemory2.getPlaneLineSize(0), nativeRXByteMemory2.getPlaneData(1), nativeRXByteMemory2.getPlaneLineSize(1), nativeRXByteMemory2.getPlaneData(2), nativeRXByteMemory2.getPlaneLineSize(2), byteBuffer, i420.getWidth(), i420.getHeight());
                        andRetainVideoFrameMemory2.release();
                        i420.release();
                    }
                }
                andRetainVideoFrameMemory.release();
            }
        },
        NV12 { // from class: com.bytedance.realx.video.HardwareVideoEncoder.YuvFormat.2
            @Override // com.bytedance.realx.video.HardwareVideoEncoder.YuvFormat
            void fillBuffer(ByteBuffer byteBuffer, RXVideoFrameInterface rXVideoFrameInterface) {
                RXVideoMemoryInterface andRetainVideoFrameMemory;
                if (rXVideoFrameInterface == null || (andRetainVideoFrameMemory = rXVideoFrameInterface.getAndRetainVideoFrameMemory()) == null) {
                    return;
                }
                if (andRetainVideoFrameMemory.getPixelFormat() == RXPixelFormat.kNv12 && (andRetainVideoFrameMemory instanceof NativeRXByteMemory)) {
                    NativeRXByteMemory nativeRXByteMemory = (NativeRXByteMemory) andRetainVideoFrameMemory;
                    YuvHelper.NV12Copy(nativeRXByteMemory.getPlaneData(0), nativeRXByteMemory.getPlaneLineSize(0), nativeRXByteMemory.getPlaneData(1), nativeRXByteMemory.getPlaneLineSize(1), byteBuffer, rXVideoFrameInterface.getWidth(), rXVideoFrameInterface.getHeight());
                } else {
                    RXVideoFrameInterface i420 = rXVideoFrameInterface.toI420();
                    if (i420 == null) {
                        andRetainVideoFrameMemory.release();
                        return;
                    }
                    RXVideoMemoryInterface andRetainVideoFrameMemory2 = i420.getAndRetainVideoFrameMemory();
                    if (andRetainVideoFrameMemory2 == null) {
                        i420.release();
                        andRetainVideoFrameMemory.release();
                        return;
                    } else if (!(andRetainVideoFrameMemory2 instanceof NativeRXByteMemory)) {
                        andRetainVideoFrameMemory2.release();
                        i420.release();
                        andRetainVideoFrameMemory.release();
                        return;
                    } else {
                        NativeRXByteMemory nativeRXByteMemory2 = (NativeRXByteMemory) andRetainVideoFrameMemory2;
                        YuvHelper.I420ToNV12(nativeRXByteMemory2.getPlaneData(0), nativeRXByteMemory2.getPlaneLineSize(0), nativeRXByteMemory2.getPlaneData(1), nativeRXByteMemory2.getPlaneLineSize(1), nativeRXByteMemory2.getPlaneData(2), nativeRXByteMemory2.getPlaneLineSize(2), byteBuffer, i420.getWidth(), i420.getHeight());
                        andRetainVideoFrameMemory2.release();
                        i420.release();
                    }
                }
                andRetainVideoFrameMemory.release();
            }
        };

        static YuvFormat valueOf(int i10) {
            if (i10 == 19) {
                return I420;
            }
            if (i10 == 21 || i10 == 2141391872 || i10 == 2141391876) {
                return NV12;
            }
            throw new IllegalArgumentException("Unsupported colorFormat: " + i10);
        }

        abstract void fillBuffer(ByteBuffer byteBuffer, RXVideoFrameInterface rXVideoFrameInterface);
    }

    public HardwareVideoEncoder(MediaCodecWrapperFactory mediaCodecWrapperFactory, String str, RXVideoCodecDesc rXVideoCodecDesc, Integer num, Integer num2, int i10, int i11) throws Throwable {
        ThreadUtils.ThreadChecker threadChecker = new ThreadUtils.ThreadChecker();
        this.encodeThreadChecker = threadChecker;
        this.outputThreadChecker = new ThreadUtils.ThreadChecker();
        this.privateParams = new HashMap<>();
        this.vpassPrivateParams = new HashMap<>();
        this.forceSurfaceInput = null;
        this.isNeedSurfaceInputWorkaround = false;
        this.svcRealLayerNum = 1;
        this.encodedFirstFrame = false;
        this.firstFrameDiffUs = 0L;
        this.dtsQueue = new LinkedBlockingDeque();
        this.mediaCodecWrapperFactory = mediaCodecWrapperFactory;
        this.codecName = str;
        this.codecDesc = rXVideoCodecDesc;
        this.surfaceColorFormat = num;
        this.yuvColorFormat = num2;
        this.yuvFormat = YuvFormat.valueOf(num2.intValue());
        this.keyFrameIntervalSec = i10;
        this.forcedKeyFrameNs = TimeUnit.MILLISECONDS.toNanos(i11);
        String strGetCpuModel = RXDeviceInfoAndroid.GetCpuModel();
        String strGetDeviceModel = RXDeviceInfoAndroid.GetDeviceModel();
        if (strGetCpuModel != null) {
            this.isNeedSurfaceInputWorkaround = strGetCpuModel.contains("MT6785V/CC") || (strGetCpuModel.contains("MT6833V/ZA") && !"RMX3610".equalsIgnoreCase(strGetDeviceModel)) || strGetCpuModel.contains("MT6833V/PNZA") || strGetCpuModel.contains("MT6853V/ZA") || strGetCpuModel.contains("MT6893Z_C/CZA");
        }
        threadChecker.detachThread();
    }

    private void caculateDts(long j10, EncodedImage.Builder builder) {
        if (isBFrameEnabled()) {
            Long lPollLast = this.dtsQueue.pollLast();
            if (lPollLast == null) {
                RXLogging.e(TAG, "dtsQueue is empty.");
                return;
            }
            if (!this.encodedFirstFrame) {
                this.encodedFirstFrame = true;
                this.firstFrameDiffUs = j10 - lPollLast.longValue();
                RXLogging.w(TAG, "firstFrameDiffUs: " + this.firstFrameDiffUs + " " + j10);
            }
            Long lValueOf = Long.valueOf((lPollLast.longValue() + this.firstFrameDiffUs) - ((long) ((1000000 / this.settings.targetFps) * 7)));
            long jLongValue = j10 - lValueOf.longValue();
            if (lValueOf.longValue() >= 0 && jLongValue >= 0) {
                if (jLongValue == 0) {
                    jLongValue = 1;
                }
                builder.setCompositionTimeUs(jLongValue);
            } else {
                RXLogging.e(TAG, "ctsUs < 0; " + jLongValue + " " + lValueOf);
            }
        }
    }

    private boolean canUseSurface() {
        return this.surfaceColorFormat != null;
    }

    private Thread createOutputThread() {
        return new Thread("video_encoded_thread") { // from class: com.bytedance.realx.video.HardwareVideoEncoder.1
            @Override // java.lang.Thread, java.lang.Runnable
            public void run() {
                while (HardwareVideoEncoder.this.running) {
                    HardwareVideoEncoder.this.deliverEncodedImage();
                }
                HardwareVideoEncoder.this.releaseCodecOnOutputThread();
            }
        };
    }

    private VideoCodecStatus encodeByteBuffer(RXVideoFrameInterface rXVideoFrameInterface) {
        this.encodeThreadChecker.checkIsOnValidThread();
        int height = ((rXVideoFrameInterface.getHeight() * rXVideoFrameInterface.getWidth()) * 3) / 2;
        long timestampNs = rXVideoFrameInterface.getTimestampNs() / 1000;
        try {
            int iDequeueInputBuffer = this.codec.dequeueInputBuffer(0L);
            if (iDequeueInputBuffer == -1) {
                RXLogging.i(TAG, "Dropped frame, no input buffers available");
                return VideoCodecStatus.NO_OUTPUT;
            }
            try {
                fillInputBuffer(this.codec.getInputBuffers()[iDequeueInputBuffer], rXVideoFrameInterface);
                try {
                    this.codec.queueInputBuffer(iDequeueInputBuffer, 0, height, timestampNs, 0);
                    return VideoCodecStatus.OK;
                } catch (Exception e10) {
                    RXLogging.e(TAG, "queueInputBuffer failed", e10);
                    return VideoCodecStatus.FALLBACK_SOFTWARE;
                }
            } catch (Exception e11) {
                RXLogging.e(TAG, "getInputBuffers failed", e11);
                return VideoCodecStatus.FALLBACK_SOFTWARE;
            }
        } catch (Exception e12) {
            RXLogging.e(TAG, "dequeueInputBuffer failed", e12);
            return VideoCodecStatus.FALLBACK_SOFTWARE;
        }
    }

    private VideoCodecStatus encodeTextureBuffer(RXVideoFrameInterface rXVideoFrameInterface) {
        this.encodeThreadChecker.checkIsOnValidThread();
        try {
            int iGlGetError = GLES20.glGetError();
            if (iGlGetError != 0) {
                RXLogging.e(TAG, "got egl err:" + iGlGetError);
            }
            rXVideoFrameInterface.setRotation(RXVideoRotation.VIDEO_ROTATION_0);
            this.videoFrameDrawer.drawFrame(rXVideoFrameInterface, this.textureDrawer, null);
            this.textureEglBase.swapBuffers(rXVideoFrameInterface.getTimestampNs());
            return VideoCodecStatus.OK;
        } catch (Exception e10) {
            RXLogging.e(TAG, "encodeTexture failed", e10);
            return VideoCodecStatus.FALLBACK_SOFTWARE;
        }
    }

    private VideoCodecStatus initEncodeInternal() {
        MediaFormat outputFormat;
        this.encodeThreadChecker.checkIsOnValidThread();
        this.lastKeyFrameNs = -1L;
        this.privateParams.clear();
        this.privateParams.putAll(this.vpassPrivateParams);
        this.dtsQueue.clear();
        try {
            this.codec = this.mediaCodecWrapperFactory.createByCodecName(this.codecName);
            try {
                MediaFormat mediaFormatCreateVideoFormat = MediaFormat.createVideoFormat(this.codecDesc.getStandard().mimeType(), this.width, this.height);
                initMediaFormat(mediaFormatCreateVideoFormat);
                RXLogging.w(TAG, "Format: " + mediaFormatCreateVideoFormat);
                this.codec.configure(mediaFormatCreateVideoFormat, null, null, 1);
                if (isSvcEnabled() && (outputFormat = this.codec.getOutputFormat()) != null) {
                    this.svcRealLayerNum = parseRealLayerNum(outputFormat);
                    RXLogging.w(TAG, "" + this.svcRealLayerNum + "，output format after configure: " + outputFormat.toString());
                }
                if (RXVideoSurfaceController.getInstance().usePassSurfaceMode()) {
                    this.textureInputSurface = this.codec.createInputSurface();
                    RXVideoSurfaceController.getInstance().setSurface(this.textureInputSurface);
                } else if (this.useSurfaceMode) {
                    this.textureInputSurface = this.codec.createInputSurface();
                    EglBase14 eglBase14 = new EglBase14(this.sharedContext, EglBase.CONFIG_RECORDABLE);
                    this.textureEglBase = eglBase14;
                    eglBase14.createSurface(this.textureInputSurface);
                    this.textureEglBase.makeCurrent();
                }
                this.codec.start();
                VideoEncoder.Settings settings = this.settings;
                setExtCodecForHisi(settings.maxQp, settings.minQp);
                VideoEncoder.Settings settings2 = this.settings;
                if (settings2.encodeMode == VideoEncoder.EncodeMode.LIVE) {
                    updateBitrate(settings2.targetBps);
                }
                this.running = true;
                this.outputThreadChecker.detachThread();
                Thread threadCreateOutputThread = createOutputThread();
                this.outputThread = threadCreateOutputThread;
                threadCreateOutputThread.start();
                return VideoCodecStatus.OK;
            } catch (Exception e10) {
                RXLogging.e(TAG, "initEncodeInternal failed", e10);
                release();
                return VideoCodecStatus.FALLBACK_SOFTWARE;
            }
        } catch (Exception e11) {
            RXLogging.e(TAG, "Cannot create media encoder " + this.codecName, e11);
            return VideoCodecStatus.FALLBACK_SOFTWARE;
        }
    }

    private void initMediaFormat(MediaFormat mediaFormat) {
        int iIntValue = (this.useSurfaceMode ? this.surfaceColorFormat : this.yuvColorFormat).intValue();
        RXVideoCodecStandard standard = this.codecDesc.getStandard();
        setIntegerParam(mediaFormat, "bitrate", Integer.valueOf(this.settings.targetBps));
        setIntegerParam(mediaFormat, "color-format", Integer.valueOf(iIntValue));
        setIntegerParam(mediaFormat, "frame-rate", Integer.valueOf(this.settings.targetFps));
        int i10 = this.settings.targetKeyFrameIntervalMs;
        if (i10 <= 0) {
            setIntegerParam(mediaFormat, "i-frame-interval", Integer.valueOf(this.keyFrameIntervalSec));
        } else {
            int i11 = i10 / 1000;
            if (i11 <= 1) {
                i11 = 1;
            }
            setIntegerParam(mediaFormat, "i-frame-interval", Integer.valueOf(i11));
        }
        setBitrateMode(mediaFormat);
        setBFrameNumber(mediaFormat);
        if (this.settings.encodeMode == VideoEncoder.EncodeMode.LIVE) {
            setProfileForLive(mediaFormat);
        } else {
            setProfileForRTC(mediaFormat);
            setColorSpace(mediaFormat);
        }
        setSVCNumber(mediaFormat);
        if (standard != RXVideoCodecStandard.VP8 && this.settings.enableQpSetting) {
            if (this.codecName.contains("OMX.hisi.")) {
                setIntegerParam(mediaFormat, KEY_HISI_EXT_CODEC_VENDOR_CONFIGURE, 1);
            }
            setIPFrameMinMaxQP(mediaFormat);
            if (isBFrameEnabled()) {
                setBFrameMinMaxQP(mediaFormat);
            }
        }
        for (Map.Entry<String, String> entry : this.privateParams.entrySet()) {
            RXLogging.w(TAG, "set android hardware encoder private param with Key:" + entry.getKey() + " Value:" + entry.getValue());
            if (isNumeric(entry.getValue())) {
                mediaFormat.setInteger(entry.getKey(), Integer.parseInt(entry.getValue()));
            } else if (entry.getValue().length() > 0) {
                mediaFormat.setString(entry.getKey(), entry.getValue());
            }
        }
    }

    private boolean isBFrameEnabled() {
        return Build.VERSION.SDK_INT >= 29 && this.settings.bFrameNum > 0;
    }

    private boolean isDeviceSupportResetBitrate() {
        return !"M2007J17C".equalsIgnoreCase(RXDeviceInfoAndroid.GetDeviceModel());
    }

    private boolean isForceUseSurfaceInput(int i10) {
        if ((this.codecName.toLowerCase().contains("qti") || this.codecName.toLowerCase().contains("qcom")) && isBFrameEnabled()) {
            return true;
        }
        Boolean bool = this.forceSurfaceInput;
        if ((bool == null || !bool.booleanValue() || this.isNeedSurfaceInputWorkaround) ? false : true) {
            return true;
        }
        return this.isNeedSurfaceInputWorkaround && i10 % 16 != 0;
    }

    private boolean isNumeric(String str) {
        return str != null && str.matches("[0-9]+");
    }

    private boolean isSvcEnabled() {
        return this.settings.temporalLayerNum > 1;
    }

    private int parseRealLayerNum(MediaFormat mediaFormat) {
        String string = mediaFormat.getString("ts-schema");
        if (TextUtils.isEmpty(string) || string.length() < 17) {
            RXLogging.w(TAG, "output temporal str is: " + string);
            return 1;
        }
        String strSubstring = string.substring(16, 17);
        if (isNumeric(strSubstring)) {
            try {
                int i10 = Integer.parseInt(strSubstring);
                if (i10 <= this.settings.temporalLayerNum && i10 > 0) {
                    return i10;
                }
            } catch (NumberFormatException e10) {
                RXLogging.e(TAG, e10.toString());
            }
        }
        RXLogging.e(TAG, "temporal layer invalid: " + string);
        return 1;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void releaseCodecOnOutputThread() {
        this.outputThreadChecker.checkIsOnValidThread();
        RXLogging.i(TAG, "Releasing MediaCodec on output thread");
        try {
            this.codec.stop();
        } catch (Exception e10) {
            RXLogging.e(TAG, "Media encoder stop failed", e10);
        }
        try {
            this.codec.release();
        } catch (Exception e11) {
            RXLogging.e(TAG, "Media encoder release failed", e11);
            this.shutdownException = e11;
        }
        this.configBuffer = null;
        RXLogging.i(TAG, "Release on output thread done");
    }

    private void requestKeyFrame(long j10) {
        this.encodeThreadChecker.checkIsOnValidThread();
        try {
            Bundle bundle = new Bundle();
            bundle.putInt("request-sync", 0);
            this.codec.setParameters(bundle);
            this.lastKeyFrameNs = j10;
        } catch (Exception e10) {
            RXLogging.e(TAG, "requestKeyFrame failed", e10);
        }
    }

    private VideoCodecStatus resetCodec(int i10, int i11, boolean z10) {
        this.encodeThreadChecker.checkIsOnValidThread();
        VideoCodecStatus videoCodecStatusRelease = release();
        if (videoCodecStatusRelease != VideoCodecStatus.OK) {
            return videoCodecStatusRelease;
        }
        this.width = i10;
        this.height = i11;
        this.useSurfaceMode = z10;
        this.settings.targetBps = this.updateBitrate;
        this.updateBitrateTimestamp = SystemClock.elapsedRealtime();
        return initEncodeInternal();
    }

    private void resetCodecWhenBitrateChange() {
        if ((isDeviceSupportResetBitrate() || this.updateBitrate == this.settings.targetBps || SystemClock.elapsedRealtime() - this.updateBitrateTimestamp < 5000) ? false : true) {
            resetCodec(this.width, this.height, this.useSurfaceMode);
        }
    }

    private void setBFrameMinMaxQP(MediaFormat mediaFormat) {
        if (Build.VERSION.SDK_INT >= 31) {
            setIntegerParam(mediaFormat, "video-qp-b-max", Integer.valueOf(this.settings.maxQp));
            setIntegerParam(mediaFormat, "video-qp-b-min", Integer.valueOf(this.settings.minQp));
        }
        if (this.codecName.toLowerCase().contains("qti")) {
            setIntegerParam(mediaFormat, "vendor.qti-ext-enc-qp-range.qp-b-min", Integer.valueOf(this.settings.minQp));
            setIntegerParam(mediaFormat, "vendor.qti-ext-enc-qp-range.qp-b-max", Integer.valueOf(this.settings.maxQp));
        }
    }

    private void setBFrameNumber(MediaFormat mediaFormat) {
        if (isBFrameEnabled()) {
            setIntegerParam(mediaFormat, "max-bframes", 1);
        } else {
            setIntegerParam(mediaFormat, "max-bframes", 0);
        }
    }

    private void setBitrateMode(MediaFormat mediaFormat) {
        this.codec.getCodecInfo();
        VideoEncoder.BitrateMode bitrateMode = VideoEncoder.BitrateMode.CBR;
        VideoEncoder.BitrateMode bitrateMode2 = this.settings.bitrateMode;
        if (bitrateMode == bitrateMode2 || VideoEncoder.BitrateMode.AUTO == bitrateMode2) {
            setIntegerParam(mediaFormat, "bitrate-mode", 2);
        } else {
            setIntegerParam(mediaFormat, "bitrate-mode", 1);
        }
    }

    private void setExtCodecForHisi(int i10, int i11) {
        MediaCodecWrapper mediaCodecWrapper;
        MediaFormat outputFormat;
        if (!this.codecName.contains("OMX.hisi.") || (mediaCodecWrapper = this.codec) == null) {
            return;
        }
        try {
            outputFormat = mediaCodecWrapper.getOutputFormat();
        } catch (Exception e10) {
            RXLogging.e(TAG, "getOutputFormat failed", e10);
            outputFormat = null;
        }
        if (outputFormat == null) {
            return;
        }
        RXLogging.i(TAG, "output format before start: " + outputFormat.toString());
        boolean z10 = false;
        boolean z11 = outputFormat.containsKey(KEY_HISI_EXT_CODEC_QP_REGULATION_SUPPORETD) && outputFormat.getInteger(KEY_HISI_EXT_CODEC_QP_REGULATION_SUPPORETD) == 1;
        if (outputFormat.containsKey(KEY_HISI_EXT_CODEC_NON_REF_P_FRAMES_SUPPORTED) && outputFormat.getInteger(KEY_HISI_EXT_CODEC_NON_REF_P_FRAMES_SUPPORTED) == 1) {
            z10 = true;
        }
        Bundle bundle = new Bundle();
        if (z10 && isSvcEnabled() && this.svcRealLayerNum <= 1) {
            bundle.putInt(KEY_HISI_EXT_CODEC_NON_REF_P_FRAMES, 1);
            this.svcRealLayerNum = 2;
            RXLogging.w(TAG, "support Non Ref PFrame.");
        }
        if (z11) {
            bundle.putInt(KEY_HISI_EXT_CODEC_MAX_QP, i10);
            bundle.putInt(KEY_HISI_EXT_CODEC_MIN_QP, i11);
        }
        if (z10 || z11) {
            try {
                this.codec.setParameters(bundle);
            } catch (Exception e11) {
                RXLogging.e(TAG, "setExtCodecForHisi failed", e11);
            }
        }
    }

    private void setIPFrameMinMaxQP(MediaFormat mediaFormat) {
        if (Build.VERSION.SDK_INT >= 31) {
            setIntegerParam(mediaFormat, "video-qp-i-min", Integer.valueOf(this.settings.minIQp));
            setIntegerParam(mediaFormat, "video-qp-i-max", Integer.valueOf(this.settings.maxIQp));
            setIntegerParam(mediaFormat, "video-qp-p-min", Integer.valueOf(this.settings.minQp));
            setIntegerParam(mediaFormat, "video-qp-p-max", Integer.valueOf(this.settings.maxQp));
        }
        setIntegerParam(mediaFormat, "vendor.qti-ext-enc-qp-range.qp-i-min", Integer.valueOf(this.settings.minIQp));
        setIntegerParam(mediaFormat, "vendor.qti-ext-enc-qp-range.qp-i-max", Integer.valueOf(this.settings.maxIQp));
        setIntegerParam(mediaFormat, "vendor.qti-ext-enc-qp-range.qp-p-min", Integer.valueOf(this.settings.minQp));
        setIntegerParam(mediaFormat, "vendor.qti-ext-enc-qp-range.qp-p-max", Integer.valueOf(this.settings.maxQp));
        setIntegerParam(mediaFormat, "vendor.rtc-ext-enc-qp-range.qp-i-min", Integer.valueOf(this.settings.minIQp));
        setIntegerParam(mediaFormat, "vendor.rtc-ext-enc-qp-range.qp-i-max", Integer.valueOf(this.settings.maxIQp));
        setIntegerParam(mediaFormat, "vendor.rtc-ext-enc-qp-range.qp-p-min", Integer.valueOf(this.settings.minQp));
        setIntegerParam(mediaFormat, "vendor.rtc-ext-enc-qp-range.qp-p-max", Integer.valueOf(this.settings.maxQp));
        setIntegerParam(mediaFormat, "vendor.rtc-ext-enc-low-latency.enable", 1);
        if (this.codecName.toLowerCase().contains("exynos")) {
            setIntegerParam(mediaFormat, "vendor.sec-ext-enc-qp-range.I-minQP", Integer.valueOf(this.settings.minIQp));
            setIntegerParam(mediaFormat, "vendor.sec-ext-enc-qp-range.I-maxQP", Integer.valueOf(this.settings.maxIQp));
            setIntegerParam(mediaFormat, "vendor.sec-ext-enc-qp-range.P-maxQP", Integer.valueOf(this.settings.maxQp));
            setIntegerParam(mediaFormat, "vendor.sec-ext-enc-qp-range.P-minQP", Integer.valueOf(this.settings.minQp));
        }
        if (this.codecName.toLowerCase().contains("mtk")) {
            setIntegerParam(mediaFormat, "vendor.mtk.venc.dynamic.qpbound.min", Integer.valueOf(this.settings.minQp));
            setIntegerParam(mediaFormat, "vendor.mtk.venc.dynamic.qpbound.max", Integer.valueOf(this.settings.maxQp));
        }
    }

    private void setIntegerParam(MediaFormat mediaFormat, String str, Integer num) {
        for (Map.Entry<String, String> entry : this.privateParams.entrySet()) {
            if (entry.getKey().equals(str)) {
                if (isNumeric(entry.getValue())) {
                    mediaFormat.setInteger(entry.getKey(), Integer.parseInt(entry.getValue()));
                    RXLogging.w(TAG, "the encoder params " + entry.getKey() + " is coverd by vpaas with value:" + entry.getValue());
                    this.privateParams.remove(str);
                    return;
                }
                this.privateParams.remove(str);
                if (entry.getValue().length() <= 0) {
                    RXLogging.w(TAG, "the encoder params " + entry.getKey() + " is disabled by vpaas,skip it");
                    return;
                }
                RXLogging.w(TAG, "the encoder params " + entry.getKey() + " set by vpaas is invalid with value:" + entry.getValue() + ",skip it");
            }
        }
        RXLogging.w(TAG, "encoder int params has been set with Key:" + str + " Value:" + num);
        mediaFormat.setInteger(str, num.intValue());
    }

    private void setProfileForLive(MediaFormat mediaFormat) {
        RXVideoCodecStandard standard = this.codecDesc.getStandard();
        MediaCodecInfo codecInfo = this.codec.getCodecInfo();
        RXVideoCodecProfile profile = this.codecDesc.getProfile();
        int systemProfile = 1;
        if (standard != RXVideoCodecStandard.H264) {
            if (standard == RXVideoCodecStandard.ByteVC1) {
                try {
                    systemProfile = profile.toSystemProfile();
                } catch (Exception e10) {
                    RXLogging.w(TAG, "" + e10);
                }
                mediaFormat.setInteger(com.google.android.gms.common.m.f52595a, systemProfile);
                mediaFormat.setInteger("level", 256);
                return;
            }
            return;
        }
        try {
            systemProfile = profile.toSystemProfile();
        } catch (Exception e11) {
            RXLogging.w(TAG, "" + e11);
        }
        MediaCodecInfo.CodecProfileLevel codecProfileLevel = null;
        for (MediaCodecInfo.CodecProfileLevel codecProfileLevel2 : codecInfo.getCapabilitiesForType(standard.mimeType()).profileLevels) {
            if (systemProfile == codecProfileLevel2.profile) {
                codecProfileLevel = codecProfileLevel2;
                break;
            }
        }
        if (codecProfileLevel == null) {
            RXLogging.w(TAG, "not set profile");
        } else {
            mediaFormat.setInteger(com.google.android.gms.common.m.f52595a, codecProfileLevel.profile);
            mediaFormat.setInteger("level", codecProfileLevel.level);
        }
    }

    private void setProfileForRTC(MediaFormat mediaFormat) {
        RXLogging.w(TAG, "close setting profile:" + this.settings.closeSetProfile);
        RXVideoCodecStandard standard = this.codecDesc.getStandard();
        if (this.settings.closeSetProfile) {
            return;
        }
        if (standard == RXVideoCodecStandard.H264) {
            RXVideoCodecProfile profile = this.codecDesc.getProfile();
            int i10 = AnonymousClass2.$SwitchMap$com$bytedance$realx$video$RXVideoCodecProfile[profile.ordinal()];
            if (i10 == 1 || i10 == 2) {
                RXLogging.w(TAG, "setting high profile ");
                setIntegerParam(mediaFormat, com.google.android.gms.common.m.f52595a, 8);
                setIntegerParam(mediaFormat, "level", 256);
                return;
            } else {
                if (i10 == 3 || i10 == 4 || i10 == 5) {
                    RXLogging.w(TAG, "setting baseline profile ");
                    setIntegerParam(mediaFormat, com.google.android.gms.common.m.f52595a, 1);
                    setIntegerParam(mediaFormat, "level", 256);
                    return;
                }
                RXLogging.w(TAG, "Unknown profile level id: " + profile + "default to baseline profile");
                setIntegerParam(mediaFormat, com.google.android.gms.common.m.f52595a, 1);
                setIntegerParam(mediaFormat, "level", 256);
                return;
            }
        }
        if (standard != RXVideoCodecStandard.ByteVC1) {
            if (standard == RXVideoCodecStandard.VP8) {
                setIntegerParam(mediaFormat, com.google.android.gms.common.m.f52595a, 1);
                return;
            }
            return;
        }
        RXVideoCodecProfile profile2 = this.codecDesc.getProfile();
        int i11 = AnonymousClass2.$SwitchMap$com$bytedance$realx$video$RXVideoCodecProfile[profile2.ordinal()];
        if (i11 == 6) {
            setIntegerParam(mediaFormat, com.google.android.gms.common.m.f52595a, 1);
            setIntegerParam(mediaFormat, "level", 8);
            return;
        }
        if (i11 == 7) {
            setIntegerParam(mediaFormat, com.google.android.gms.common.m.f52595a, 2);
            setIntegerParam(mediaFormat, "level", 8);
            return;
        }
        if (i11 == 8) {
            setIntegerParam(mediaFormat, com.google.android.gms.common.m.f52595a, 4096);
            setIntegerParam(mediaFormat, "level", 8);
            return;
        }
        RXLogging.w(TAG, "Unknown profile level id: " + profile2 + "default to Main profile");
        setIntegerParam(mediaFormat, com.google.android.gms.common.m.f52595a, 1);
        setIntegerParam(mediaFormat, "level", 8);
    }

    private void setSVCNumber(MediaFormat mediaFormat) {
        if (Build.VERSION.SDK_INT < 25 || !isSvcEnabled()) {
            return;
        }
        setStringParam(mediaFormat, "ts-schema", "android.generic." + this.settings.temporalLayerNum);
    }

    private void setStringParam(MediaFormat mediaFormat, String str, String str2) {
        for (Map.Entry<String, String> entry : this.privateParams.entrySet()) {
            if (entry.getKey().equals(str)) {
                if (entry.getValue().length() > 0) {
                    mediaFormat.setString(entry.getKey(), entry.getValue());
                    RXLogging.w(TAG, "the encoder params " + entry.getKey() + " is coverd by vpaas with value:" + entry.getValue());
                } else {
                    RXLogging.w(TAG, "the encoder params " + entry.getKey() + " is disabled by vpaas,skip it");
                }
                this.privateParams.remove(str);
                return;
            }
        }
        RXLogging.w(TAG, "encoder string params has been set with Key:" + str + " Value:" + str2);
        mediaFormat.setString(str, str2);
    }

    private boolean shouldForceKeyFrame(long j10) {
        this.encodeThreadChecker.checkIsOnValidThread();
        long j11 = this.forcedKeyFrameNs;
        return j11 > 0 && j10 > this.lastKeyFrameNs + j11;
    }

    private VideoCodecStatus updateBitrate(int i10) {
        this.encodeThreadChecker.checkIsOnValidThread();
        this.updateBitrate = i10;
        try {
            Bundle bundle = new Bundle();
            bundle.putInt("video-bitrate", i10);
            this.codec.setParameters(bundle);
            return VideoCodecStatus.OK;
        } catch (Exception e10) {
            RXLogging.e(TAG, "updateBitrate failed", e10);
            return VideoCodecStatus.ERROR;
        }
    }

    protected void deliverEncodedImage() {
        ByteBuffer byteBufferSlice;
        try {
            this.outputThreadChecker.checkIsOnValidThread();
            long jCurrentTimeMillis = System.currentTimeMillis();
            try {
                MediaCodec.BufferInfo bufferInfo = new MediaCodec.BufferInfo();
                int iDequeueOutputBuffer = this.codec.dequeueOutputBuffer(bufferInfo, 100000L);
                if (iDequeueOutputBuffer == -2) {
                    RXLogging.i(TAG, "output format changed: " + this.codec.getOutputFormat().toString());
                    return;
                }
                if (iDequeueOutputBuffer == -1) {
                    return;
                }
                if (iDequeueOutputBuffer != -3 && iDequeueOutputBuffer < 0) {
                    RXLogging.e(TAG, "should not be here: index:" + iDequeueOutputBuffer);
                    return;
                }
                ByteBuffer byteBuffer = this.codec.getOutputBuffers()[iDequeueOutputBuffer];
                byteBuffer.position(bufferInfo.offset);
                byteBuffer.limit(bufferInfo.offset + bufferInfo.size);
                int i10 = bufferInfo.flags;
                if ((i10 & 2) != 0) {
                    RXLogging.i(TAG, "Config frame generated. Offset: " + bufferInfo.offset + ". Size: " + bufferInfo.size);
                    ByteBuffer byteBufferAllocateDirect = ByteBuffer.allocateDirect(bufferInfo.size);
                    this.configBuffer = byteBufferAllocateDirect;
                    byteBufferAllocateDirect.put(byteBuffer);
                } else {
                    boolean z10 = true;
                    if ((i10 & 1) == 0) {
                        z10 = false;
                    }
                    if (z10) {
                        RXLogging.i(TAG, "Sync frame generated");
                    }
                    if (z10 && (this.codecDesc.getStandard() == RXVideoCodecStandard.H264 || this.codecDesc.getStandard() == RXVideoCodecStandard.ByteVC1)) {
                        RXLogging.i(TAG, "Prepending config frame of size " + this.configBuffer.capacity() + " to output buffer with offset " + bufferInfo.offset + ", size " + bufferInfo.size);
                        byteBufferSlice = ByteBuffer.allocateDirect(bufferInfo.size + this.configBuffer.capacity());
                        this.configBuffer.rewind();
                        byteBufferSlice.put(this.configBuffer);
                        byteBufferSlice.put(byteBuffer);
                        byteBufferSlice.rewind();
                    } else {
                        byteBufferSlice = byteBuffer.slice();
                    }
                    EncodedImage.Builder frameType = EncodedImage.builder().setEncodedWidth(this.width).setEncodedHeight(this.height).setCaptureTimeNs(bufferInfo.presentationTimeUs * 1000).setBuffer(byteBufferSlice).setSvcLayerNum(this.svcRealLayerNum).setFrameType(z10 ? EncodedImage.FrameType.kIntra : EncodedImage.FrameType.kPredicted);
                    caculateDts(bufferInfo.presentationTimeUs, frameType);
                    this.callback.onEncodedFrame(frameType.createEncodedImage(), new VideoEncoder.CodecSpecificInfo(this.codecDesc.getStandard()));
                }
                this.codec.releaseOutputBuffer(iDequeueOutputBuffer, false);
            } catch (Exception e10) {
                if (System.currentTimeMillis() - jCurrentTimeMillis < 100) {
                    RXLogging.e(TAG, "deliverOutput failed", e10);
                    try {
                        Thread.sleep(100L);
                    } catch (InterruptedException e11) {
                        e11.printStackTrace();
                    }
                }
            }
        } catch (IllegalStateException unused) {
            RXLogging.e(TAG, "the encoded image is last encoder data, drop it");
        }
    }

    /* JADX WARN: Code duplicated, block: B:28:0x0082  */
    @Override // com.bytedance.realx.video.VideoEncoder
    public VideoCodecStatus encode(RXVideoFrameInterface rXVideoFrameInterface, boolean z10) {
        this.encodeThreadChecker.checkIsOnValidThread();
        GlUtil.clearGLES2Error(TAG);
        if (this.codec == null) {
            return VideoCodecStatus.UNINITIALIZED;
        }
        RXVideoMemoryInterface andRetainVideoFrameMemory = rXVideoFrameInterface.getAndRetainVideoFrameMemory();
        if (andRetainVideoFrameMemory == null) {
            return VideoCodecStatus.MEMORY;
        }
        boolean z11 = andRetainVideoFrameMemory instanceof NativeRXOpenGLMemory;
        Boolean bool = this.isTextureBuffer;
        if (bool == null || bool.booleanValue() != z11) {
            this.isTextureBuffer = Boolean.valueOf(z11);
            RXLogging.e(TAG, "isTextureBuffer: " + this.isTextureBuffer);
        }
        int width = rXVideoFrameInterface.getWidth();
        int height = rXVideoFrameInterface.getHeight();
        boolean z12 = true;
        boolean z13 = false;
        boolean z14 = canUseSurface() && (z11 || isForceUseSurfaceInput(width));
        if (z14 && z11) {
            EglBase14.Context context = new EglBase14.Context(((NativeRXOpenGLMemory) andRetainVideoFrameMemory).getEGLContext());
            if (this.sharedContext == null || context.getNativeEglContext() != this.sharedContext.getNativeEglContext()) {
                this.sharedContext = context;
            } else {
                z12 = false;
            }
        } else {
            z12 = false;
        }
        andRetainVideoFrameMemory.release();
        if (z14 != this.useSurfaceMode) {
            VideoCodecStatus videoCodecStatusResetCodec = resetCodec(width, height, z14);
            if (videoCodecStatusResetCodec != VideoCodecStatus.OK) {
                return videoCodecStatusResetCodec;
            }
        } else {
            z13 = z12;
        }
        if (z13 && this.useSurfaceMode && !RXVideoSurfaceController.getInstance().usePassSurfaceMode()) {
            RXLogging.w(TAG, "egl env changed, create new shared context from the new videoframe egl context");
            this.textureDrawer.release();
            this.videoFrameDrawer.release();
            this.textureDrawer = new GlRectDrawer();
            this.videoFrameDrawer = new VideoFrameDrawer();
            EglBase14 eglBase14 = this.textureEglBase;
            if (eglBase14 != null) {
                eglBase14.release();
                this.textureEglBase = null;
            }
            EglBase14 eglBase15 = new EglBase14(this.sharedContext, EglBase.CONFIG_RECORDABLE);
            this.textureEglBase = eglBase15;
            eglBase15.createSurface(this.textureInputSurface);
            try {
                this.textureEglBase.makeCurrent();
            } catch (Exception e10) {
                RXLogging.e(TAG, "egl makeCurrent failed", e10);
                return VideoCodecStatus.FALLBACK_SOFTWARE;
            }
        }
        resetCodecWhenBitrateChange();
        if (z10) {
            RXLogging.i(TAG, "Request key frame");
        }
        if (z10 || shouldForceKeyFrame(rXVideoFrameInterface.getTimestampNs())) {
            requestKeyFrame(rXVideoFrameInterface.getTimestampNs());
        }
        if (isBFrameEnabled()) {
            this.dtsQueue.push(Long.valueOf(rXVideoFrameInterface.getTimestampUs()));
        }
        VideoCodecStatus videoCodecStatusEncodeTextureBuffer = this.useSurfaceMode ? encodeTextureBuffer(rXVideoFrameInterface) : encodeByteBuffer(rXVideoFrameInterface);
        if (videoCodecStatusEncodeTextureBuffer != VideoCodecStatus.OK && isBFrameEnabled()) {
            this.dtsQueue.pollFirst();
        }
        return videoCodecStatusEncodeTextureBuffer;
    }

    protected void fillInputBuffer(ByteBuffer byteBuffer, RXVideoFrameInterface rXVideoFrameInterface) {
        this.yuvFormat.fillBuffer(byteBuffer, rXVideoFrameInterface);
    }

    public VideoEncoder.ScalingSettings getScalingSettings() {
        this.encodeThreadChecker.checkIsOnValidThread();
        if (this.automaticResizeOn) {
            RXVideoCodecStandard standard = this.codecDesc.getStandard();
            RXVideoCodecStandard rXVideoCodecStandard = RXVideoCodecStandard.VP8;
            if (standard == rXVideoCodecStandard) {
                return new VideoEncoder.ScalingSettings(29, 95);
            }
            if (this.codecDesc.getStandard() == rXVideoCodecStandard) {
                return new VideoEncoder.ScalingSettings(24, 37);
            }
        }
        return VideoEncoder.ScalingSettings.OFF;
    }

    @Override // com.bytedance.realx.video.VideoEncoder
    public VideoCodecStatus initEncode(VideoEncoder.Settings settings, VideoEncoder.Callback callback) {
        this.encodeThreadChecker.checkIsOnValidThread();
        this.sharedContext = settings.sharedContext;
        this.callback = callback;
        this.automaticResizeOn = true;
        this.width = settings.width;
        this.height = settings.height;
        this.scaleMode = settings.scaleMode;
        this.bitrateMode = settings.bitrateMode;
        this.updateBitrate = settings.targetBps;
        this.updateBitrateTimestamp = SystemClock.elapsedRealtime();
        this.settings = settings;
        if (RXVideoSurfaceController.getInstance().usePassSurfaceMode()) {
            RXLogging.e(TAG, "using pass surface mode");
            this.useSurfaceMode = true;
        } else {
            this.useSurfaceMode = canUseSurface() && settings.useSurfaceMode && this.sharedContext != null;
            if (isForceUseSurfaceInput(this.width)) {
                this.useSurfaceMode = true;
            }
        }
        RXLogging.w(TAG, "initEncode, codec name:" + this.codecName + ", with resolution:" + this.width + " x " + this.height + ". @ " + settings.targetBps + "bps. Fps: " + settings.targetFps + " Use surface mode: " + this.useSurfaceMode + " initUseSurfaceMode: " + settings.useSurfaceMode + " settings.bitrateMode:" + settings.bitrateMode + " qp_min:" + settings.minQp + " qp_max:" + settings.maxQp + " qp_i_min:" + settings.minIQp + " qp_i_max:" + settings.maxIQp);
        return initEncodeInternal();
    }

    @Override // com.bytedance.realx.video.VideoEncoder
    public VideoCodecStatus release() {
        VideoCodecStatus videoCodecStatus;
        this.encodeThreadChecker.checkIsOnValidThread();
        RXLogging.w(TAG, "hardware video encoder release start.");
        if (this.outputThread == null) {
            videoCodecStatus = VideoCodecStatus.OK;
        } else {
            this.running = false;
            if (!ThreadUtils.joinUninterruptibly(this.outputThread, 5000L)) {
                RXLogging.e(TAG, "Media encoder release timeout");
                videoCodecStatus = VideoCodecStatus.TIMEOUT;
            } else if (this.shutdownException != null) {
                RXLogging.e(TAG, "Media encoder release exception", this.shutdownException);
                videoCodecStatus = VideoCodecStatus.ERROR;
            } else {
                videoCodecStatus = VideoCodecStatus.OK;
            }
        }
        RXLogging.w(TAG, "Media encoder release ok.");
        this.textureDrawer.release();
        RXLogging.w(TAG, "textureDrawer release ok.");
        this.videoFrameDrawer.release();
        RXLogging.w(TAG, "videoFrameDrawer release ok.");
        EglBase14 eglBase14 = this.textureEglBase;
        if (eglBase14 != null) {
            eglBase14.release();
            this.textureEglBase = null;
        }
        RXLogging.w(TAG, "textureEglBase release ok.");
        Surface surface = this.textureInputSurface;
        if (surface != null) {
            surface.release();
            this.textureInputSurface = null;
        }
        RXLogging.w(TAG, "textureInputSurface release ok.");
        this.codec = null;
        this.outputThread = null;
        this.encodeThreadChecker.detachThread();
        RXLogging.w(TAG, "hardware video encoder release end.");
        return videoCodecStatus;
    }

    @Override // com.bytedance.realx.video.VideoEncoder
    public VideoCodecStatus requestKeyFrame() {
        requestKeyFrame(System.currentTimeMillis());
        return VideoCodecStatus.OK;
    }

    void setColorSpace(MediaFormat mediaFormat) {
        if (!this.useSurfaceMode && this.codecName.contains("OMX.hisi.") && this.settings.rangeId == 0 && (this.yuvColorFormat.intValue() == 19 || this.yuvColorFormat.intValue() == 21)) {
            RXLogging.w(TAG, "kirin chips skip setting MediaFormat COLOR_RANGE");
        } else if (this.settings.rangeId == 1) {
            RXLogging.w(TAG, "setting MediaFormat COLOR_RANGE_FULL");
            setIntegerParam(mediaFormat, "color-range", 1);
        } else {
            RXLogging.w(TAG, "setting MediaFormat COLOR_RANGE_LIMITED");
            setIntegerParam(mediaFormat, "color-range", 2);
        }
        setIntegerParam(mediaFormat, "color-standard", 4);
        setIntegerParam(mediaFormat, "color-transfer", 3);
    }

    @Override // com.bytedance.realx.video.VideoEncoder
    public VideoCodecStatus setPrivateParam(String str, String str2) {
        RXLogging.w(TAG, "got android hardware encoder setPrivateParam with key:" + str + " value:" + str2);
        str.hashCode();
        if (str.equals(KEY_PRIVATE_PARAM_FORCE_SURFACE_INPUT)) {
            this.forceSurfaceInput = Boolean.valueOf("true".equalsIgnoreCase(str2));
        } else {
            this.vpassPrivateParams.put(str, str2);
        }
        return VideoCodecStatus.OK;
    }

    @Override // com.bytedance.realx.video.VideoEncoder
    public VideoCodecStatus setRateAllocation(int i10, int i11) {
        this.encodeThreadChecker.checkIsOnValidThread();
        updateBitrate(i10);
        return VideoCodecStatus.OK;
    }
}
