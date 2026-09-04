package com.tencent.liteav.videoproducer.encoder;

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
import org.json.JSONObject;

/* JADX INFO: loaded from: classes4.dex */
public final class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    boolean f100821a = true;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    boolean f100822b = true;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final MediaCodec f100823c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final String f100824d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final VideoEncodeParams f100825e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private Boolean f100826f;

    /* JADX INFO: renamed from: com.tencent.liteav.videoproducer.encoder.a$1, reason: invalid class name */
    public static final /* synthetic */ class AnonymousClass1 {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        static final /* synthetic */ int[] f100827a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        static final /* synthetic */ int[] f100828b;

        static {
            int[] iArr = new int[VideoEncoderDef.EncoderProfile.values().length];
            f100828b = iArr;
            try {
                iArr[VideoEncoderDef.EncoderProfile.PROFILE_MAIN.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f100828b[VideoEncoderDef.EncoderProfile.PROFILE_HIGH.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f100828b[VideoEncoderDef.EncoderProfile.PROFILE_BASELINE.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            int[] iArr2 = new int[VideoEncoderDef.BitrateMode.values().length];
            f100827a = iArr2;
            try {
                iArr2[VideoEncoderDef.BitrateMode.CBR.ordinal()] = 1;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f100827a[VideoEncoderDef.BitrateMode.VBR.ordinal()] = 2;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                f100827a[VideoEncoderDef.BitrateMode.CQ.ordinal()] = 3;
            } catch (NoSuchFieldError unused6) {
            }
        }
    }

    public a(MediaCodec mediaCodec, String str, VideoEncodeParams videoEncodeParams, Boolean bool) {
        this.f100823c = mediaCodec;
        this.f100824d = str;
        this.f100825e = videoEncodeParams;
        this.f100826f = bool;
    }

    private MediaCodecInfo.VideoCapabilities a(int i10, int i11) {
        MediaCodecInfo.CodecCapabilities codecCapabilitiesCreateFromProfileLevel;
        if (LiteavSystemInfo.getSystemOSVersionInt() >= 21 && (codecCapabilitiesCreateFromProfileLevel = MediaCodecInfo.CodecCapabilities.createFromProfileLevel(this.f100824d, i10, i11)) != null) {
            return codecCapabilitiesCreateFromProfileLevel.getVideoCapabilities();
        }
        return null;
    }

    private static Pair<Integer, Integer> a(MediaFormat mediaFormat) {
        int integer;
        int integer2 = 0;
        try {
            integer = mediaFormat.getInteger(m.f52595a);
        } catch (Throwable th2) {
            LiteavLog.i("MediaFormatBuilder", "get profile fail.", th2);
            integer = 0;
        }
        try {
            integer2 = mediaFormat.getInteger("level");
        } catch (Throwable th3) {
            LiteavLog.i("MediaFormatBuilder", "get level fail.", th3);
        }
        return new Pair<>(Integer.valueOf(integer), Integer.valueOf(integer2));
    }

    private boolean a(int i10, MediaCodecInfo.EncoderCapabilities encoderCapabilities) {
        Boolean bool;
        return (i10 != 2 || (bool = this.f100826f) == null) ? encoderCapabilities.isBitrateModeSupported(i10) : bool.booleanValue();
    }

    /* JADX WARN: Code duplicated, block: B:145:0x02b5  */
    /* JADX WARN: Code duplicated, block: B:54:0x00c9  */
    /* JADX WARN: Code duplicated, block: B:83:0x0131  */
    public final MediaFormat a() {
        MediaFormat mediaFormat;
        MediaCodecInfo.CodecCapabilities capabilitiesForType;
        MediaCodecInfo.CodecCapabilities codecCapabilitiesCreateFromProfileLevel;
        MediaCodecInfo.CodecCapabilities capabilitiesForType2;
        MediaCodecInfo.VideoCapabilities videoCapabilities;
        int i10;
        int i11;
        int i12;
        int i13;
        int i14;
        Range<Integer> complexityRange;
        int i15;
        MediaFormat mediaFormatCreateVideoFormat;
        String str = "value";
        VideoEncodeParams videoEncodeParams = this.f100825e;
        int i16 = videoEncodeParams.width;
        if (i16 == 0 || (i15 = videoEncodeParams.height) == 0 || videoEncodeParams.bitrate == 0 || videoEncodeParams.fps == 0 || (mediaFormatCreateVideoFormat = MediaFormat.createVideoFormat(this.f100824d, i16, i15)) == null) {
            mediaFormat = null;
        } else {
            mediaFormatCreateVideoFormat.setInteger("bitrate", this.f100825e.bitrate * 1024);
            mediaFormatCreateVideoFormat.setInteger("frame-rate", this.f100825e.fps);
            mediaFormatCreateVideoFormat.setInteger("color-format", 2130708361);
            VideoEncodeParams videoEncodeParams2 = this.f100825e;
            mediaFormatCreateVideoFormat.setInteger("i-frame-interval", videoEncodeParams2.fullIFrame ? 0 : videoEncodeParams2.gop);
            mediaFormat = mediaFormatCreateVideoFormat;
        }
        if (mediaFormat == null) {
            return null;
        }
        int codecCount = MediaCodecList.getCodecCount();
        int i17 = 0;
        loop0: while (true) {
            if (i17 >= codecCount) {
                capabilitiesForType = null;
                break;
            }
            MediaCodecInfo codecInfoAt = MediaCodecList.getCodecInfoAt(i17);
            if (codecInfoAt.isEncoder()) {
                for (String str2 : codecInfoAt.getSupportedTypes()) {
                    if (str2.equalsIgnoreCase(this.f100824d)) {
                        capabilitiesForType = codecInfoAt.getCapabilitiesForType(this.f100824d);
                        break loop0;
                    }
                }
            }
            i17++;
        }
        if (capabilitiesForType != null && LiteavSystemInfo.getSystemOSVersionInt() >= 21) {
            MediaCodecInfo.EncoderCapabilities encoderCapabilities = capabilitiesForType.getEncoderCapabilities();
            if (encoderCapabilities != null && (complexityRange = encoderCapabilities.getComplexityRange()) != null) {
                mediaFormat.setInteger("complexity", ((Integer) complexityRange.getUpper()).intValue());
            }
            if (this.f100822b) {
                VideoEncodeParams videoEncodeParams3 = this.f100825e;
                VideoEncoderDef.EncoderProfile encoderProfile = videoEncodeParams3.encoderProfile;
                if ((!(videoEncodeParams3.codecType == CodecType.H265) || LiteavSystemInfo.getSystemOSVersionInt() < 21) && encoderProfile != null) {
                    int i18 = AnonymousClass1.f100828b[encoderProfile.ordinal()];
                    if (i18 == 1) {
                        i12 = 2;
                    } else if (i18 != 2) {
                        i12 = 1;
                    } else {
                        i12 = 8;
                    }
                } else {
                    i12 = 1;
                }
                int i19 = Integer.MAX_VALUE;
                if (this.f100824d.equals("video/avc")) {
                    i13 = 256;
                    i19 = 32768;
                } else {
                    i13 = Integer.MIN_VALUE;
                }
                int i20 = 0;
                int iMin = 0;
                for (MediaCodecInfo.CodecProfileLevel codecProfileLevel : capabilitiesForType.profileLevels) {
                    int i21 = codecProfileLevel.level;
                    if (i21 >= i13 && (i14 = codecProfileLevel.profile) <= i12 && (i14 > i20 || (i14 == i20 && i21 > iMin))) {
                        iMin = Math.min(i21, i19);
                        i20 = i14;
                    }
                }
                mediaFormat.setInteger(m.f52595a, i20);
                if (LiteavSystemInfo.getSystemOSVersionInt() >= 23) {
                    mediaFormat.setInteger("level", iMin);
                }
            }
            if (this.f100821a) {
                VideoEncoderDef.BitrateMode bitrateMode = this.f100825e.bitrateMode;
                if (bitrateMode == null || (i10 = AnonymousClass1.f100827a[bitrateMode.ordinal()]) == 1) {
                    i11 = 2;
                } else if (i10 == 2) {
                    i11 = 1;
                } else if (i10 != 3) {
                    i11 = 2;
                } else {
                    i11 = 0;
                }
                MediaCodecInfo.EncoderCapabilities encoderCapabilities2 = capabilitiesForType.getEncoderCapabilities();
                if (encoderCapabilities2 != null) {
                    if (a(i11, encoderCapabilities2)) {
                        mediaFormat.setInteger("bitrate-mode", i11);
                    } else if (this.f100825e.fullIFrame) {
                        if (a(1, encoderCapabilities2)) {
                            mediaFormat.setInteger("bitrate-mode", 1);
                        } else if (a(2, encoderCapabilities2)) {
                            mediaFormat.setInteger("bitrate-mode", 2);
                        }
                    } else if (a(2, encoderCapabilities2)) {
                        mediaFormat.setInteger("bitrate-mode", 2);
                    }
                }
            }
        }
        if (LiteavSystemInfo.getSystemOSVersionInt() < 23) {
            codecCapabilitiesCreateFromProfileLevel = null;
        } else {
            Pair<Integer, Integer> pairA = a(mediaFormat);
            codecCapabilitiesCreateFromProfileLevel = MediaCodecInfo.CodecCapabilities.createFromProfileLevel(this.f100824d, ((Integer) pairA.first).intValue(), ((Integer) pairA.second).intValue());
        }
        if (codecCapabilitiesCreateFromProfileLevel != null) {
            capabilitiesForType = codecCapabilitiesCreateFromProfileLevel;
        }
        if (capabilitiesForType != null && LiteavSystemInfo.getSystemOSVersionInt() >= 21 && (videoCapabilities = capabilitiesForType.getVideoCapabilities()) != null) {
            Range<Integer> bitrateRange = videoCapabilities.getBitrateRange();
            int integer = mediaFormat.getInteger("bitrate");
            int iIntValue = ((Integer) bitrateRange.clamp(Integer.valueOf(integer))).intValue();
            LiteavLog.i("MediaFormatBuilder", "bitrateRange=(%d, %d),bitrate=%d,clampBitrate=%d", bitrateRange.getLower(), bitrateRange.getUpper(), Integer.valueOf(integer), Integer.valueOf(iIntValue));
            if (integer != iIntValue) {
                mediaFormat.setInteger("bitrate", iIntValue);
            }
        }
        if (LiteavSystemInfo.getSystemOSVersionInt() >= 23) {
            Pair<Integer, Integer> pairA2 = a(mediaFormat);
            int iIntValue2 = ((Integer) pairA2.first).intValue();
            int iIntValue3 = ((Integer) pairA2.second).intValue();
            MediaCodecInfo.VideoCapabilities videoCapabilitiesA = a(iIntValue2, iIntValue3);
            if (videoCapabilitiesA != null) {
                Range<Integer> supportedWidths = videoCapabilitiesA.getSupportedWidths();
                Range<Integer> supportedHeights = videoCapabilitiesA.getSupportedHeights();
                if (supportedWidths != null && supportedHeights != null) {
                    Integer num = (Integer) supportedWidths.getUpper();
                    Integer num2 = (Integer) supportedHeights.getUpper();
                    int integer2 = mediaFormat.getInteger("width");
                    int integer3 = mediaFormat.getInteger("height");
                    if ((integer2 > integer3 && num.intValue() < num2.intValue()) || (integer2 < integer3 && num.intValue() > num2.intValue())) {
                        Integer numValueOf = Integer.valueOf(num.intValue());
                        num = num2;
                        num2 = numValueOf;
                    }
                    if (num.intValue() < integer2 || num2.intValue() < integer3) {
                        float f10 = integer2;
                        float f11 = integer3;
                        float fMin = Math.min(num.intValue() / (f10 * 1.0f), num2.intValue() / (f11 * 1.0f));
                        mediaFormat.setInteger("width", (int) (f10 * fMin));
                        mediaFormat.setInteger("height", (int) (fMin * f11));
                        LiteavLog.i("MediaFormatBuilder", "updateMediaFormatToUpperSize:srcWidth=%d,srcHeight=%d,upperW=%d,upperH=%d", Integer.valueOf(integer2), Integer.valueOf(integer3), num, num2);
                    }
                }
            }
            MediaCodecInfo.VideoCapabilities videoCapabilitiesA2 = a(iIntValue2, iIntValue3);
            if (videoCapabilitiesA2 != null) {
                Range<Integer> supportedWidths2 = videoCapabilitiesA2.getSupportedWidths();
                Range<Integer> supportedHeights2 = videoCapabilitiesA2.getSupportedHeights();
                if (supportedWidths2 != null && supportedHeights2 != null) {
                    Integer numValueOf2 = (Integer) supportedWidths2.getLower();
                    Integer numValueOf3 = (Integer) supportedHeights2.getLower();
                    MediaCodecInfo.VideoCapabilities videoCapabilities2 = (this.f100823c == null || LiteavSystemInfo.getSystemOSVersionInt() < 21 || (capabilitiesForType2 = this.f100823c.getCodecInfo().getCapabilitiesForType(this.f100824d)) == null) ? null : capabilitiesForType2.getVideoCapabilities();
                    if (videoCapabilities2 != null) {
                        Range<Integer> supportedWidths3 = videoCapabilities2.getSupportedWidths();
                        Range<Integer> supportedHeights3 = videoCapabilities2.getSupportedHeights();
                        if (supportedWidths3 != null && supportedHeights3 != null) {
                            numValueOf2 = Integer.valueOf(Math.max(numValueOf2.intValue(), ((Integer) supportedWidths3.getLower()).intValue()));
                            numValueOf3 = Integer.valueOf(Math.max(numValueOf3.intValue(), ((Integer) supportedHeights3.getLower()).intValue()));
                        }
                    }
                    if (numValueOf2.intValue() >= 0 && numValueOf3.intValue() >= 0) {
                        int integer4 = mediaFormat.getInteger("width");
                        int integer5 = mediaFormat.getInteger("height");
                        if (numValueOf2.intValue() > integer4 || numValueOf3.intValue() > integer5) {
                            float f12 = integer4;
                            float f13 = integer5;
                            float fMax = Math.max(numValueOf2.intValue() / (f12 * 1.0f), numValueOf3.intValue() / (1.0f * f13));
                            mediaFormat.setInteger("width", (int) (f12 * fMax));
                            mediaFormat.setInteger("height", (int) (fMax * f13));
                            LiteavLog.i("MediaFormatBuilder", "updateMediaFormatToLowerSize:lowerW=%d,lowerH=%d", numValueOf2, numValueOf3);
                        }
                    }
                }
            }
            MediaCodecInfo.VideoCapabilities videoCapabilitiesA3 = a(iIntValue2, iIntValue3);
            if (videoCapabilitiesA3 != null) {
                int widthAlignment = videoCapabilitiesA3.getWidthAlignment();
                int heightAlignment = videoCapabilitiesA3.getHeightAlignment();
                LiteavLog.i("MediaFormatBuilder", "widthAlignment=%d,heightAlignment=%d", Integer.valueOf(widthAlignment), Integer.valueOf(heightAlignment));
                if (widthAlignment >= 2 && heightAlignment >= 2 && widthAlignment % 2 == 0 && heightAlignment % 2 == 0) {
                    int integer6 = mediaFormat.getInteger("width");
                    int integer7 = mediaFormat.getInteger("height");
                    int i22 = (integer6 / widthAlignment) * widthAlignment;
                    int i23 = (integer7 / heightAlignment) * heightAlignment;
                    if (integer6 != i22 || integer7 != i23) {
                        mediaFormat.setInteger("width", i22);
                        mediaFormat.setInteger("height", i23);
                        LiteavLog.i("MediaFormatBuilder", "updateMediaFormatWithAlignment,srcSize=(%d x %d),fixSize=(%d x %d),widthAlignment=%d,heightAlignment=%d", Integer.valueOf(integer6), Integer.valueOf(integer7), Integer.valueOf(i22), Integer.valueOf(i23), Integer.valueOf(widthAlignment), Integer.valueOf(heightAlignment));
                    }
                }
            }
        } else {
            str = "value";
        }
        if (this.f100825e.mediaCodecDeviceRelatedParams != null) {
            int i24 = 0;
            while (i24 < this.f100825e.mediaCodecDeviceRelatedParams.length()) {
                try {
                    JSONObject jSONObject = this.f100825e.mediaCodecDeviceRelatedParams.getJSONObject(i24);
                    try {
                        Object[] objArr = new Object[3];
                        try {
                            objArr[0] = Integer.valueOf(i24);
                            try {
                                objArr[1] = jSONObject.optString("key");
                                str = str;
                                try {
                                    try {
                                        objArr[2] = Integer.valueOf(jSONObject.optInt(str));
                                        LiteavLog.i("MediaFormatBuilder", "setDeviceRelatedParams,index=%d,key=%s,value=%d", objArr);
                                        mediaFormat.setInteger(jSONObject.optString("key"), jSONObject.optInt(str));
                                    } catch (Throwable th2) {
                                        th = th2;
                                        LiteavLog.e("MediaFormatBuilder", "set mediaCodec device related params failed,index=".concat(String.valueOf(i24)), th);
                                    }
                                } catch (Throwable th3) {
                                    th = th3;
                                    LiteavLog.e("MediaFormatBuilder", "set mediaCodec device related params failed,index=".concat(String.valueOf(i24)), th);
                                    i24++;
                                    str = str;
                                }
                            } catch (Throwable th4) {
                                th = th4;
                                str = str;
                            }
                        } catch (Throwable th5) {
                            th = th5;
                            str = str;
                            LiteavLog.e("MediaFormatBuilder", "set mediaCodec device related params failed,index=".concat(String.valueOf(i24)), th);
                            i24++;
                            str = str;
                        }
                    } catch (Throwable th6) {
                        th = th6;
                        LiteavLog.e("MediaFormatBuilder", "set mediaCodec device related params failed,index=".concat(String.valueOf(i24)), th);
                        i24++;
                        str = str;
                    }
                } catch (Throwable th7) {
                    th = th7;
                }
                i24++;
                str = str;
            }
        }
        return mediaFormat;
    }
}
