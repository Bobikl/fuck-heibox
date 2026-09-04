package com.tencent.ugc.encoder;

import android.media.MediaCodec;
import android.media.MediaCrypto;
import android.media.MediaFormat;
import android.os.Bundle;
import android.view.Surface;
import com.tencent.liteav.base.annotations.JNINamespace;
import com.tencent.liteav.base.system.LiteavSystemInfo;
import com.tencent.liteav.base.util.LiteavLog;
import com.tencent.liteav.videobase.base.GLConstants;
import com.tencent.liteav.videobase.common.CodecType;
import com.tencent.ugc.videobase.common.EncodedVideoFrame;
import java.nio.ByteBuffer;
import java.util.ArrayList;
import java.util.concurrent.TimeUnit;

/* JADX INFO: loaded from: classes4.dex */
@JNINamespace("liteav::ugc")
public class UGCMediaCodecJni {
    public static final int DRAIN_ERROR = -1;
    public static final int DRAIN_SUCCESS = 0;
    public static final int DRAIN_TRY_AGAIN_LATER = 2;
    public static final int DRAIN_TRY_AGAIN_ONCE = 1;
    public static final int FEED_ERROR = -1;
    public static final int FEED_SUCCESS = 0;
    public static final int FEED_TRY_AGAIN_LATER = 1;
    private static final String TAG = "UGCMediaCodecJni";

    public static MediaFormat configureMediaCodec(MediaCodec mediaCodec, VideoEncodeParams videoEncodeParams, boolean z10, int i10, int i11) {
        MediaFormatBuilder mediaFormatBuilder = new MediaFormatBuilder(mediaCodec, videoEncodeParams.codecType == CodecType.H265 ? "video/hevc" : "video/avc", videoEncodeParams);
        mediaFormatBuilder.enableSetBitrateModeIfSupport(true);
        mediaFormatBuilder.useProfileAndLevel(z10);
        MediaFormat mediaFormatBuild = mediaFormatBuilder.build();
        if (mediaFormatBuild == null) {
            return null;
        }
        try {
            LiteavLog.i(TAG, "Configure MediaCodec with MediaFormat: ".concat(String.valueOf(mediaFormatBuild)));
            setPixelFormatToMediaFormat(mediaFormatBuild, GLConstants.PixelFormatType.a(i10));
            setColorRangeToMediaFormat(mediaFormatBuild, videoEncodeParams.colorRange);
            setColorSpaceToMediaFormat(mediaFormatBuild, videoEncodeParams.colorSpace);
            setMaxBFramesToMediaFormat(mediaFormatBuild, i11);
            mediaCodec.configure(mediaFormatBuild, (Surface) null, (MediaCrypto) null, 1);
            return mediaFormatBuild;
        } catch (Throwable th2) {
            LiteavLog.e(TAG, "MediaCodec configure failed.".concat(String.valueOf(th2)));
            return null;
        }
    }

    public static Surface createInputSurface(MediaCodec mediaCodec) {
        if (mediaCodec == null) {
            return null;
        }
        try {
            return mediaCodec.createInputSurface();
        } catch (Throwable th2) {
            LiteavLog.e(TAG, "MediaCodec create input surface failed.".concat(String.valueOf(th2)));
            return null;
        }
    }

    public static MediaCodec createMediaCodec(String str) {
        MediaCodec mediaCodecCreateEncoderByType;
        try {
            mediaCodecCreateEncoderByType = MediaCodec.createEncoderByType(str);
            try {
                if (!"OMX.google.h264.encoder".equals(mediaCodecCreateEncoderByType.getName())) {
                    return mediaCodecCreateEncoderByType;
                }
            } catch (Throwable th2) {
                th = th2;
                LiteavLog.e(TAG, "create MediaCodec failed.".concat(String.valueOf(th)));
            }
        } catch (Throwable th3) {
            th = th3;
            mediaCodecCreateEncoderByType = null;
        }
        destroyMediaCodec(mediaCodecCreateEncoderByType);
        return null;
    }

    public static void destroyMediaCodec(MediaCodec mediaCodec) {
        if (mediaCodec == null) {
            return;
        }
        try {
            mediaCodec.stop();
        } catch (Throwable th2) {
            LiteavLog.e(TAG, "Stop MediaCodec failed.".concat(String.valueOf(th2)));
        }
        try {
            mediaCodec.release();
        } catch (Throwable th3) {
            LiteavLog.e(TAG, "Destroy MediaCodec failed.".concat(String.valueOf(th3)));
        }
    }

    public static int drainOutputBuffer(MediaCodec mediaCodec, EncodedVideoFrame encodedVideoFrame, int i10) {
        try {
            MediaCodec.BufferInfo bufferInfo = new MediaCodec.BufferInfo();
            int iDequeueOutputBuffer = mediaCodec.dequeueOutputBuffer(bufferInfo, TimeUnit.MILLISECONDS.toMicros(i10));
            if (iDequeueOutputBuffer == -1) {
                return 2;
            }
            boolean z10 = true;
            if (iDequeueOutputBuffer == -2) {
                return 1;
            }
            if (iDequeueOutputBuffer == -3) {
                LiteavLog.i(TAG, "encoder output buffers changed");
                return 1;
            }
            if (iDequeueOutputBuffer < 0) {
                return -1;
            }
            if (bufferInfo.size == 0 && (bufferInfo.flags & 4) == 0) {
                LiteavLog.e(TAG, "size is zero, but it isn't end of stream");
                return -1;
            }
            ByteBuffer outputBuffer = LiteavSystemInfo.getSystemOSVersionInt() >= 21 ? mediaCodec.getOutputBuffer(iDequeueOutputBuffer) : mediaCodec.getOutputBuffers()[iDequeueOutputBuffer];
            if (outputBuffer == null) {
                return -1;
            }
            outputBuffer.position(bufferInfo.offset);
            outputBuffer.limit(bufferInfo.offset + bufferInfo.size);
            ByteBuffer byteBufferAllocateDirect = ByteBuffer.allocateDirect(bufferInfo.size);
            encodedVideoFrame.data = byteBufferAllocateDirect;
            byteBufferAllocateDirect.put(outputBuffer);
            encodedVideoFrame.nalType = (bufferInfo.flags & 1) > 0 ? com.tencent.liteav.videobase.common.c.IDR : com.tencent.liteav.videobase.common.c.UNKNOWN;
            encodedVideoFrame.pts = TimeUnit.MICROSECONDS.toMillis(bufferInfo.presentationTimeUs);
            if ((bufferInfo.flags & 4) <= 0) {
                z10 = false;
            }
            encodedVideoFrame.isEosFrame = z10;
            mediaCodec.releaseOutputBuffer(iDequeueOutputBuffer, false);
            return 0;
        } catch (Throwable th2) {
            LiteavLog.e(TAG, "Drain output from MediaCodec failed.", th2);
            return -1;
        }
    }

    public static int feedEndOfStreamBufferToMediaCodec(MediaCodec mediaCodec, int i10) {
        try {
            TimeUnit timeUnit = TimeUnit.MILLISECONDS;
            int iDequeueInputBuffer = mediaCodec.dequeueInputBuffer(timeUnit.toMicros(i10));
            if (iDequeueInputBuffer < 0) {
                return 1;
            }
            mediaCodec.queueInputBuffer(iDequeueInputBuffer, 0, 0, timeUnit.toMicros(0L), 4);
            return 0;
        } catch (Throwable th2) {
            LiteavLog.e(TAG, "Feed yuv buffer to MediaCodec failed.".concat(String.valueOf(th2)));
            return -1;
        }
    }

    public static int feedYuvBufferToMediaCodec(MediaCodec mediaCodec, ByteBuffer byteBuffer, long j10, int i10) {
        try {
            TimeUnit timeUnit = TimeUnit.MILLISECONDS;
            int iDequeueInputBuffer = mediaCodec.dequeueInputBuffer(timeUnit.toMicros(i10));
            if (iDequeueInputBuffer < 0) {
                return 1;
            }
            ByteBuffer byteBuffer2 = mediaCodec.getInputBuffers()[iDequeueInputBuffer];
            byteBuffer2.clear();
            byteBuffer2.put(byteBuffer);
            mediaCodec.queueInputBuffer(iDequeueInputBuffer, 0, byteBuffer.capacity(), timeUnit.toMicros(j10), 0);
            return 0;
        } catch (Throwable th2) {
            LiteavLog.e(TAG, "Feed yuv buffer to MediaCodec failed.".concat(String.valueOf(th2)));
            return -1;
        }
    }

    public static int getIntFromMediaFormat(MediaFormat mediaFormat, String str, int i10) {
        if (mediaFormat != null) {
            try {
                return mediaFormat.getInteger(str);
            } catch (Throwable th2) {
                LiteavLog.e(TAG, "Get %s from MediaFormat failed.".concat(String.valueOf(th2)));
            }
        }
        return i10;
    }

    public static int getSupportInputBufferColorFormat(String str) {
        MediaCodec mediaCodecCreateEncoderByType;
        ArrayList arrayList = new ArrayList();
        try {
            mediaCodecCreateEncoderByType = MediaCodec.createEncoderByType(str);
            try {
                for (int i10 : mediaCodecCreateEncoderByType.getCodecInfo().getCapabilitiesForType(str).colorFormats) {
                    if (i10 == 19) {
                        arrayList.add(GLConstants.PixelFormatType.I420);
                    } else if (i10 == 21) {
                        arrayList.add(GLConstants.PixelFormatType.NV12);
                    }
                }
            } catch (Throwable th2) {
                th = th2;
                LiteavLog.e(TAG, "get support color format error ".concat(String.valueOf(th)));
            }
        } catch (Throwable th3) {
            th = th3;
            mediaCodecCreateEncoderByType = null;
        }
        destroyMediaCodec(mediaCodecCreateEncoderByType);
        return !arrayList.isEmpty() ? ((GLConstants.PixelFormatType) arrayList.get(0)).getValue() : GLConstants.PixelFormatType.MAX.getValue();
    }

    public static void releaseSurface(Surface surface) {
        if (surface != null) {
            try {
                surface.release();
            } catch (Throwable th2) {
                LiteavLog.e(TAG, "Release surface failed.".concat(String.valueOf(th2)));
            }
        }
    }

    private static void setColorRangeToMediaFormat(MediaFormat mediaFormat, GLConstants.ColorRange colorRange) {
        if (LiteavSystemInfo.getSystemOSVersionInt() < 24) {
            return;
        }
        if (colorRange == GLConstants.ColorRange.FULL_RANGE) {
            mediaFormat.setInteger("color-range", 1);
        } else if (colorRange == GLConstants.ColorRange.VIDEO_RANGE) {
            mediaFormat.setInteger("color-range", 2);
        }
    }

    private static void setColorSpaceToMediaFormat(MediaFormat mediaFormat, GLConstants.ColorSpace colorSpace) {
        if (LiteavSystemInfo.getSystemOSVersionInt() < 24) {
            return;
        }
        if (colorSpace == GLConstants.ColorSpace.BT709) {
            mediaFormat.setInteger("color-standard", 1);
        } else if (colorSpace == GLConstants.ColorSpace.BT601) {
            mediaFormat.setInteger("color-standard", 4);
        }
    }

    private static void setMaxBFramesToMediaFormat(MediaFormat mediaFormat, int i10) {
        if (i10 <= 0 || LiteavSystemInfo.getSystemOSVersionInt() < 29) {
            return;
        }
        mediaFormat.setInteger("max-bframes", i10);
    }

    private static void setPixelFormatToMediaFormat(MediaFormat mediaFormat, GLConstants.PixelFormatType pixelFormatType) {
        if (pixelFormatType == GLConstants.PixelFormatType.I420) {
            mediaFormat.setInteger("color-format", 19);
        } else if (pixelFormatType == GLConstants.PixelFormatType.NV12) {
            mediaFormat.setInteger("color-format", 21);
        }
    }

    public static void signalEndOfInputStream(MediaCodec mediaCodec) {
        if (mediaCodec != null) {
            try {
                mediaCodec.signalEndOfInputStream();
            } catch (Throwable th2) {
                LiteavLog.e(TAG, "signalEndOfStream failed. ".concat(String.valueOf(th2)));
            }
        }
    }

    public static boolean startMediaCodec(MediaCodec mediaCodec) {
        if (mediaCodec == null) {
            return false;
        }
        try {
            mediaCodec.start();
            return true;
        } catch (Throwable th2) {
            LiteavLog.e(TAG, "MediaCodec start failed.".concat(String.valueOf(th2)));
            return false;
        }
    }

    public static boolean updateBitrate(MediaCodec mediaCodec, int i10) {
        if (mediaCodec != null && LiteavSystemInfo.getSystemOSVersionInt() >= 19) {
            try {
                Bundle bundle = new Bundle();
                bundle.putInt("video-bitrate", i10);
                mediaCodec.setParameters(bundle);
                return true;
            } catch (Throwable th2) {
                LiteavLog.e(TAG, "update bitrate to MediaCodec failed.".concat(String.valueOf(th2)));
            }
        }
        return false;
    }
}
