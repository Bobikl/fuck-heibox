package com.tencent.ugc.encoder;

import android.media.MediaCodec;
import android.media.MediaCodecInfo;
import android.media.MediaCodecList;
import android.media.MediaFormat;
import android.util.Pair;
import android.util.Range;
import com.google.android.gms.common.m;
import com.tencent.liteav.base.system.LiteavSystemInfo;
import com.tencent.liteav.base.util.LiteavLog;
import com.tencent.liteav.videobase.common.CodecType;
import com.tencent.liteav.videoproducer.encoder.VideoEncoderDef;

/* JADX INFO: loaded from: classes4.dex */
public class MediaFormatBuilder {
    private static final String MIME_TYPE_H264 = "video/avc";
    private static final String MIME_TYPE_H265 = "video/hevc";
    private static final String TAG = "MediaFormatBuilder";
    private final MediaCodec mMediaCodec;
    private final String mMimeType;
    private final VideoEncodeParams mVideoEncodeParams;
    private boolean mEnableSetBitrateModeIfSupport = true;
    private boolean mUseProfileAndLevel = true;

    /* JADX INFO: renamed from: com.tencent.ugc.encoder.MediaFormatBuilder$1, reason: invalid class name */
    public static final /* synthetic */ class AnonymousClass1 {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        static final /* synthetic */ int[] f103561a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        static final /* synthetic */ int[] f103562b;

        static {
            int[] iArr = new int[com.tencent.liteav.videobase.common.d.values().length];
            f103562b = iArr;
            try {
                iArr[com.tencent.liteav.videobase.common.d.MAIN.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f103562b[com.tencent.liteav.videobase.common.d.HIGH.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f103562b[com.tencent.liteav.videobase.common.d.BASELINE.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            int[] iArr2 = new int[VideoEncoderDef.BitrateMode.values().length];
            f103561a = iArr2;
            try {
                iArr2[VideoEncoderDef.BitrateMode.CBR.ordinal()] = 1;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f103561a[VideoEncoderDef.BitrateMode.VBR.ordinal()] = 2;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                f103561a[VideoEncoderDef.BitrateMode.CQ.ordinal()] = 3;
            } catch (NoSuchFieldError unused6) {
            }
        }
    }

    public MediaFormatBuilder(MediaCodec mediaCodec, String str, VideoEncodeParams videoEncodeParams) {
        this.mMediaCodec = mediaCodec;
        this.mMimeType = str;
        this.mVideoEncodeParams = videoEncodeParams;
    }

    private MediaFormat createBaseFormat() {
        int i10;
        MediaFormat mediaFormatCreateVideoFormat;
        VideoEncodeParams videoEncodeParams = this.mVideoEncodeParams;
        int i11 = videoEncodeParams.width;
        if (i11 == 0 || (i10 = videoEncodeParams.height) == 0 || videoEncodeParams.bitrate == 0 || videoEncodeParams.fps == 0 || (mediaFormatCreateVideoFormat = MediaFormat.createVideoFormat(this.mMimeType, i11, i10)) == null) {
            return null;
        }
        mediaFormatCreateVideoFormat.setInteger("bitrate", this.mVideoEncodeParams.bitrate * 1024);
        mediaFormatCreateVideoFormat.setInteger("frame-rate", this.mVideoEncodeParams.fps);
        mediaFormatCreateVideoFormat.setInteger("color-format", 2130708361);
        VideoEncodeParams videoEncodeParams2 = this.mVideoEncodeParams;
        mediaFormatCreateVideoFormat.setInteger("i-frame-interval", videoEncodeParams2.fullIFrame ? 0 : videoEncodeParams2.gop);
        return mediaFormatCreateVideoFormat;
    }

    private MediaCodecInfo.CodecCapabilities createCodecCapabilities(MediaFormat mediaFormat) {
        if (mediaFormat == null || LiteavSystemInfo.getSystemOSVersionInt() < 23) {
            return null;
        }
        Pair<Integer, Integer> profileAndLevel = getProfileAndLevel(mediaFormat);
        return MediaCodecInfo.CodecCapabilities.createFromProfileLevel(this.mMimeType, ((Integer) profileAndLevel.first).intValue(), ((Integer) profileAndLevel.second).intValue());
    }

    private MediaCodecInfo.CodecCapabilities getCodecCapabilities() {
        int codecCount = MediaCodecList.getCodecCount();
        for (int i10 = 0; i10 < codecCount; i10++) {
            MediaCodecInfo codecInfoAt = MediaCodecList.getCodecInfoAt(i10);
            if (codecInfoAt.isEncoder()) {
                for (String str : codecInfoAt.getSupportedTypes()) {
                    if (str.equalsIgnoreCase(this.mMimeType)) {
                        return codecInfoAt.getCapabilitiesForType(this.mMimeType);
                    }
                }
            }
        }
        return null;
    }

    private static int getMediaCodecBitrateMode(VideoEncoderDef.BitrateMode bitrateMode) {
        int i10;
        if (bitrateMode == null || (i10 = AnonymousClass1.f103561a[bitrateMode.ordinal()]) == 1) {
            return 2;
        }
        if (i10 != 2) {
            return i10 != 3 ? 2 : 0;
        }
        return 1;
    }

    private static int getMediaCodecProfile(com.tencent.liteav.videobase.common.d dVar, boolean z10) {
        if ((z10 && LiteavSystemInfo.getSystemOSVersionInt() >= 21) || dVar == null) {
            return 1;
        }
        int i10 = AnonymousClass1.f103562b[dVar.ordinal()];
        if (i10 != 1) {
            return i10 != 2 ? 1 : 8;
        }
        return 2;
    }

    private Pair<Integer, Integer> getProfileAndLevel(MediaFormat mediaFormat) {
        int integer;
        int integer2 = 0;
        try {
            integer = mediaFormat.getInteger(m.f52595a);
        } catch (Throwable th2) {
            LiteavLog.i(TAG, "get profile fail.", th2);
            integer = 0;
        }
        try {
            integer2 = mediaFormat.getInteger("level");
        } catch (Throwable th3) {
            LiteavLog.i(TAG, "get level fail.", th3);
        }
        return new Pair<>(Integer.valueOf(integer), Integer.valueOf(integer2));
    }

    private MediaCodecInfo.VideoCapabilities getVideoCapabilitiesByMimeType() {
        MediaCodecInfo.CodecCapabilities capabilitiesForType;
        if (this.mMediaCodec == null || LiteavSystemInfo.getSystemOSVersionInt() < 21 || (capabilitiesForType = this.mMediaCodec.getCodecInfo().getCapabilitiesForType(this.mMimeType)) == null) {
            return null;
        }
        return capabilitiesForType.getVideoCapabilities();
    }

    private MediaCodecInfo.VideoCapabilities getVideoCapabilitiesByProfileLevel(int i10, int i11) {
        MediaCodecInfo.CodecCapabilities codecCapabilitiesCreateFromProfileLevel;
        if (LiteavSystemInfo.getSystemOSVersionInt() >= 21 && (codecCapabilitiesCreateFromProfileLevel = MediaCodecInfo.CodecCapabilities.createFromProfileLevel(this.mMimeType, i10, i11)) != null) {
            return codecCapabilitiesCreateFromProfileLevel.getVideoCapabilities();
        }
        return null;
    }

    private boolean isBitrateModeSupported(int i10, MediaCodecInfo.EncoderCapabilities encoderCapabilities) {
        return encoderCapabilities.isBitrateModeSupported(i10);
    }

    private void setBitrateModeIfDeviceSupport(MediaFormat mediaFormat, MediaCodecInfo.CodecCapabilities codecCapabilities, int i10) {
        MediaCodecInfo.EncoderCapabilities encoderCapabilities = codecCapabilities.getEncoderCapabilities();
        if (encoderCapabilities == null) {
            return;
        }
        if (isBitrateModeSupported(i10, encoderCapabilities)) {
            mediaFormat.setInteger("bitrate-mode", i10);
            return;
        }
        if (!this.mVideoEncodeParams.fullIFrame) {
            if (isBitrateModeSupported(2, encoderCapabilities)) {
                mediaFormat.setInteger("bitrate-mode", 2);
            }
        } else if (isBitrateModeSupported(1, encoderCapabilities)) {
            mediaFormat.setInteger("bitrate-mode", 1);
        } else if (isBitrateModeSupported(2, encoderCapabilities)) {
            mediaFormat.setInteger("bitrate-mode", 2);
        }
    }

    private void setComplexity(MediaFormat mediaFormat, MediaCodecInfo.CodecCapabilities codecCapabilities) {
        Range<Integer> complexityRange;
        MediaCodecInfo.EncoderCapabilities encoderCapabilities = codecCapabilities.getEncoderCapabilities();
        if (encoderCapabilities == null || (complexityRange = encoderCapabilities.getComplexityRange()) == null) {
            return;
        }
        mediaFormat.setInteger("complexity", ((Integer) complexityRange.getUpper()).intValue());
    }

    private void setProfileAndLevel(MediaFormat mediaFormat, MediaCodecInfo.CodecCapabilities codecCapabilities, int i10) {
        int i11;
        int i12;
        int i13;
        if (this.mMimeType.equals("video/avc")) {
            i11 = 256;
            i12 = 32768;
        } else {
            i11 = Integer.MIN_VALUE;
            i12 = Integer.MAX_VALUE;
        }
        int i14 = 0;
        int iMin = 0;
        for (MediaCodecInfo.CodecProfileLevel codecProfileLevel : codecCapabilities.profileLevels) {
            int i15 = codecProfileLevel.level;
            if (i15 >= i11 && (i13 = codecProfileLevel.profile) <= i10 && (i13 > i14 || (i13 == i14 && i15 > iMin))) {
                iMin = Math.min(i15, i12);
                i14 = i13;
            }
        }
        mediaFormat.setInteger(m.f52595a, i14);
        if (LiteavSystemInfo.getSystemOSVersionInt() >= 23) {
            mediaFormat.setInteger("level", iMin);
        }
    }

    private void updateBitRateFromSupportRange(MediaFormat mediaFormat, MediaCodecInfo.CodecCapabilities codecCapabilities) {
        MediaCodecInfo.VideoCapabilities videoCapabilities;
        if (codecCapabilities == null || mediaFormat == null || LiteavSystemInfo.getSystemOSVersionInt() < 21 || (videoCapabilities = codecCapabilities.getVideoCapabilities()) == null) {
            return;
        }
        Range<Integer> bitrateRange = videoCapabilities.getBitrateRange();
        int integer = mediaFormat.getInteger("bitrate");
        int iIntValue = ((Integer) bitrateRange.clamp(Integer.valueOf(integer))).intValue();
        LiteavLog.i(TAG, "bitrateRange=(%d, %d),bitrate=%d,clampBitrate=%d", bitrateRange.getLower(), bitrateRange.getUpper(), Integer.valueOf(integer), Integer.valueOf(iIntValue));
        if (integer != iIntValue) {
            mediaFormat.setInteger("bitrate", iIntValue);
        }
    }

    private void updateMediaFormatToLowerSize(MediaFormat mediaFormat, int i10, int i11) {
        MediaCodecInfo.VideoCapabilities videoCapabilitiesByProfileLevel;
        if (mediaFormat == null || (videoCapabilitiesByProfileLevel = getVideoCapabilitiesByProfileLevel(i10, i11)) == null) {
            return;
        }
        Range<Integer> supportedWidths = videoCapabilitiesByProfileLevel.getSupportedWidths();
        Range<Integer> supportedHeights = videoCapabilitiesByProfileLevel.getSupportedHeights();
        if (supportedWidths == null || supportedHeights == null) {
            return;
        }
        Integer numValueOf = (Integer) supportedWidths.getLower();
        Integer numValueOf2 = (Integer) supportedHeights.getLower();
        MediaCodecInfo.VideoCapabilities videoCapabilitiesByMimeType = getVideoCapabilitiesByMimeType();
        if (videoCapabilitiesByMimeType != null) {
            Range<Integer> supportedWidths2 = videoCapabilitiesByMimeType.getSupportedWidths();
            Range<Integer> supportedHeights2 = videoCapabilitiesByMimeType.getSupportedHeights();
            if (supportedWidths2 != null && supportedHeights2 != null) {
                numValueOf = Integer.valueOf(Math.max(numValueOf.intValue(), ((Integer) supportedWidths2.getLower()).intValue()));
                numValueOf2 = Integer.valueOf(Math.max(numValueOf2.intValue(), ((Integer) supportedHeights2.getLower()).intValue()));
            }
        }
        if (numValueOf.intValue() < 0 || numValueOf2.intValue() < 0) {
            return;
        }
        int integer = mediaFormat.getInteger("width");
        int integer2 = mediaFormat.getInteger("height");
        if (numValueOf.intValue() > integer || numValueOf2.intValue() > integer2) {
            float f10 = integer;
            float f11 = integer2;
            float fMax = Math.max(numValueOf.intValue() / (f10 * 1.0f), numValueOf2.intValue() / (1.0f * f11));
            mediaFormat.setInteger("width", (int) (f10 * fMax));
            mediaFormat.setInteger("height", (int) (fMax * f11));
            LiteavLog.i(TAG, "updateMediaFormatToLowerSize:lowerW=%d,lowerH=%d", numValueOf, numValueOf2);
        }
    }

    private void updateMediaFormatToUpperSize(MediaFormat mediaFormat, int i10, int i11) {
        MediaCodecInfo.VideoCapabilities videoCapabilitiesByProfileLevel;
        if (mediaFormat == null || (videoCapabilitiesByProfileLevel = getVideoCapabilitiesByProfileLevel(i10, i11)) == null) {
            return;
        }
        Range<Integer> supportedWidths = videoCapabilitiesByProfileLevel.getSupportedWidths();
        Range<Integer> supportedHeights = videoCapabilitiesByProfileLevel.getSupportedHeights();
        if (supportedWidths == null || supportedHeights == null) {
            return;
        }
        Integer num = (Integer) supportedWidths.getUpper();
        Integer num2 = (Integer) supportedHeights.getUpper();
        int integer = mediaFormat.getInteger("width");
        int integer2 = mediaFormat.getInteger("height");
        if ((integer > integer2 && num.intValue() < num2.intValue()) || (integer < integer2 && num.intValue() > num2.intValue())) {
            Integer numValueOf = Integer.valueOf(num.intValue());
            num = num2;
            num2 = numValueOf;
        }
        if (num.intValue() < integer || num2.intValue() < integer2) {
            float f10 = integer;
            float f11 = integer2;
            float fMin = Math.min(num.intValue() / (f10 * 1.0f), num2.intValue() / (1.0f * f11));
            mediaFormat.setInteger("width", (int) (f10 * fMin));
            mediaFormat.setInteger("height", (int) (fMin * f11));
            LiteavLog.i(TAG, "updateMediaFormatToUpperSize:srcWidth=%d,srcHeight=%d,upperW=%d,upperH=%d", Integer.valueOf(integer), Integer.valueOf(integer2), num, num2);
        }
    }

    private void updateMediaFormatWithAlignment(MediaFormat mediaFormat, int i10, int i11) {
        MediaCodecInfo.VideoCapabilities videoCapabilitiesByProfileLevel;
        if (mediaFormat == null || (videoCapabilitiesByProfileLevel = getVideoCapabilitiesByProfileLevel(i10, i11)) == null) {
            return;
        }
        int widthAlignment = videoCapabilitiesByProfileLevel.getWidthAlignment();
        int heightAlignment = videoCapabilitiesByProfileLevel.getHeightAlignment();
        LiteavLog.i(TAG, "widthAlignment=%d,heightAlignment=%d", Integer.valueOf(widthAlignment), Integer.valueOf(heightAlignment));
        if (widthAlignment < 2 || heightAlignment < 2 || widthAlignment % 2 != 0 || heightAlignment % 2 != 0) {
            return;
        }
        int integer = mediaFormat.getInteger("width");
        int integer2 = mediaFormat.getInteger("height");
        int i12 = (integer / widthAlignment) * widthAlignment;
        int i13 = (integer2 / heightAlignment) * heightAlignment;
        if (integer == i12 && integer2 == i13) {
            return;
        }
        mediaFormat.setInteger("width", i12);
        mediaFormat.setInteger("height", i13);
        LiteavLog.i(TAG, "updateMediaFormatWithAlignment,srcSize=(%d x %d),fixSize=(%d x %d),widthAlignment=%d,heightAlignment=%d", Integer.valueOf(integer), Integer.valueOf(integer2), Integer.valueOf(i12), Integer.valueOf(i13), Integer.valueOf(widthAlignment), Integer.valueOf(heightAlignment));
    }

    private void updateToCodecSupportSize(MediaFormat mediaFormat) {
        if (mediaFormat != null && LiteavSystemInfo.getSystemOSVersionInt() >= 23) {
            Pair<Integer, Integer> profileAndLevel = getProfileAndLevel(mediaFormat);
            int iIntValue = ((Integer) profileAndLevel.first).intValue();
            int iIntValue2 = ((Integer) profileAndLevel.second).intValue();
            updateMediaFormatToUpperSize(mediaFormat, iIntValue, iIntValue2);
            updateMediaFormatToLowerSize(mediaFormat, iIntValue, iIntValue2);
            updateMediaFormatWithAlignment(mediaFormat, iIntValue, iIntValue2);
        }
    }

    public MediaFormat build() {
        MediaFormat mediaFormatCreateBaseFormat = createBaseFormat();
        if (mediaFormatCreateBaseFormat == null) {
            return null;
        }
        MediaCodecInfo.CodecCapabilities codecCapabilities = getCodecCapabilities();
        if (codecCapabilities != null && LiteavSystemInfo.getSystemOSVersionInt() >= 21) {
            setComplexity(mediaFormatCreateBaseFormat, codecCapabilities);
            if (this.mUseProfileAndLevel) {
                VideoEncodeParams videoEncodeParams = this.mVideoEncodeParams;
                setProfileAndLevel(mediaFormatCreateBaseFormat, codecCapabilities, getMediaCodecProfile(videoEncodeParams.encoderProfile, videoEncodeParams.codecType == CodecType.H265));
            }
            if (this.mEnableSetBitrateModeIfSupport) {
                setBitrateModeIfDeviceSupport(mediaFormatCreateBaseFormat, codecCapabilities, getMediaCodecBitrateMode(this.mVideoEncodeParams.bitrateMode));
            }
        }
        MediaCodecInfo.CodecCapabilities codecCapabilitiesCreateCodecCapabilities = createCodecCapabilities(mediaFormatCreateBaseFormat);
        if (codecCapabilitiesCreateCodecCapabilities != null) {
            codecCapabilities = codecCapabilitiesCreateCodecCapabilities;
        }
        updateBitRateFromSupportRange(mediaFormatCreateBaseFormat, codecCapabilities);
        updateToCodecSupportSize(mediaFormatCreateBaseFormat);
        return mediaFormatCreateBaseFormat;
    }

    public MediaFormatBuilder enableSetBitrateModeIfSupport(boolean z10) {
        this.mEnableSetBitrateModeIfSupport = z10;
        return this;
    }

    public MediaFormatBuilder useProfileAndLevel(boolean z10) {
        this.mUseProfileAndLevel = z10;
        return this;
    }
}
