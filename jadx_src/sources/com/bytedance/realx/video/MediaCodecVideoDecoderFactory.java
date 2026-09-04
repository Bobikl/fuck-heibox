package com.bytedance.realx.video;

import android.media.MediaCodecInfo;
import android.media.MediaCodecList;
import android.os.Build;
import androidx.annotation.p0;
import com.bytedance.realx.base.CalledByNative;
import com.bytedance.realx.base.RXLogging;
import java.util.ArrayList;

/* JADX INFO: loaded from: classes6.dex */
public class MediaCodecVideoDecoderFactory {
    private static final String TAG = "MediaCodecVideoDecoderFactory";

    @p0
    private EglBase.Context sharedContext;

    @CalledByNative
    public MediaCodecVideoDecoderFactory(@p0 EglBase.Context context) {
        this.sharedContext = context;
    }

    @p0
    private MediaCodecInfo findCodecForType(RXVideoCodecStandard rXVideoCodecStandard) {
        MediaCodecInfo codecInfoAt;
        for (int i10 = 0; i10 < MediaCodecList.getCodecCount(); i10++) {
            try {
                try {
                    codecInfoAt = MediaCodecList.getCodecInfoAt(i10);
                } catch (IllegalArgumentException e10) {
                    RXLogging.e(TAG, "Cannot retrieve decoder codec info", e10);
                    codecInfoAt = null;
                }
                if (codecInfoAt != null && !codecInfoAt.isEncoder() && !isSoftwareDecoder(codecInfoAt) && isSupportedCodec(codecInfoAt, rXVideoCodecStandard)) {
                    return codecInfoAt;
                }
            } catch (Exception e11) {
                RXLogging.e(TAG, "findCodecForType got system error:", e11);
            }
        }
        return null;
    }

    private boolean isH264HighProfileSupported(MediaCodecInfo mediaCodecInfo, RXVideoCodecStandard rXVideoCodecStandard) {
        String name = mediaCodecInfo.getName();
        if (name.startsWith("OMX.qcom.") || name.startsWith("OMX.Exynos.")) {
            return true;
        }
        MediaCodecInfo.CodecCapabilities capabilitiesForType = mediaCodecInfo.getCapabilitiesForType(rXVideoCodecStandard.mimeType());
        int i10 = 0;
        while (true) {
            MediaCodecInfo.CodecProfileLevel[] codecProfileLevelArr = capabilitiesForType.profileLevels;
            if (i10 >= codecProfileLevelArr.length) {
                return false;
            }
            if (8 == codecProfileLevelArr[i10].profile) {
                return true;
            }
            i10++;
        }
    }

    private boolean isSoftwareDecoder(MediaCodecInfo mediaCodecInfo) {
        try {
            if (Build.VERSION.SDK_INT >= 29) {
                return mediaCodecInfo.isSoftwareOnly();
            }
            String name = mediaCodecInfo.getName();
            if (name == null) {
                return false;
            }
            String lowerCase = name.toLowerCase();
            if (lowerCase.startsWith("arc.")) {
                return false;
            }
            return lowerCase.startsWith("omx.google.") || lowerCase.startsWith("omx.ffmpeg.") || (lowerCase.startsWith("omx.sec.") && lowerCase.contains(".sw.")) || lowerCase.startsWith("c2.android.") || lowerCase.equals("omx.qcom.video.decoder.hevcswvdec") || lowerCase.startsWith("c2.google.") || !(lowerCase.startsWith("omx.") || lowerCase.startsWith("c2."));
        } catch (Exception e10) {
            RXLogging.e(TAG, "check decoder softonly error.", e10);
            return false;
        }
    }

    private boolean isSupportedCodec(MediaCodecInfo mediaCodecInfo, RXVideoCodecStandard rXVideoCodecStandard) {
        mediaCodecInfo.getName();
        return MediaCodecUtils.codecSupportsType(mediaCodecInfo, rXVideoCodecStandard) && MediaCodecUtils.selectColorFormat(MediaCodecUtils.DECODER_COLOR_FORMATS, mediaCodecInfo.getCapabilitiesForType(rXVideoCodecStandard.mimeType())) != null;
    }

    @CalledByNative
    @p0
    public VideoDecoder createDecoder(RXVideoCodecDesc rXVideoCodecDesc) {
        RXVideoCodecStandard standard = rXVideoCodecDesc.getStandard();
        MediaCodecInfo mediaCodecInfoFindCodecForType = findCodecForType(standard);
        if (mediaCodecInfoFindCodecForType == null) {
            return null;
        }
        MediaCodecInfo.CodecCapabilities capabilitiesForType = mediaCodecInfoFindCodecForType.getCapabilitiesForType(standard.mimeType());
        for (int i10 : capabilitiesForType.colorFormats) {
            RXLogging.w(TAG, "support codecColorFormat:" + i10);
        }
        Integer numSelectColorFormat = MediaCodecUtils.selectColorFormat(MediaCodecUtils.DECODER_COLOR_FORMATS, capabilitiesForType);
        if (numSelectColorFormat == null) {
            return null;
        }
        return new AndroidVideoDecoder(new MediaCodecWrapperFactoryImpl(), mediaCodecInfoFindCodecForType.getName(), standard, numSelectColorFormat.intValue(), this.sharedContext);
    }

    @CalledByNative
    public void enableEglLock(boolean z10) {
        RXLogging.e(TAG, "MediaCodecVideoDecoderFactory enableEglLock:" + z10);
        EglBase.EglLock.enableEglLock = z10;
    }

    @CalledByNative
    public RXVideoCodecDesc[] getSupportedCodecs() {
        ArrayList arrayList = new ArrayList();
        RXVideoCodecStandard rXVideoCodecStandard = RXVideoCodecStandard.H264;
        MediaCodecInfo mediaCodecInfoFindCodecForType = findCodecForType(rXVideoCodecStandard);
        if (mediaCodecInfoFindCodecForType != null) {
            if (isH264HighProfileSupported(mediaCodecInfoFindCodecForType, rXVideoCodecStandard)) {
                arrayList.add(new RXVideoCodecDesc(rXVideoCodecStandard, RXVideoCodecProfile.ProfileHigh));
            }
            arrayList.add(new RXVideoCodecDesc(rXVideoCodecStandard, RXVideoCodecProfile.ProfileBaseline));
        }
        return (RXVideoCodecDesc[]) arrayList.toArray(new RXVideoCodecDesc[arrayList.size()]);
    }

    @CalledByNative
    public void setHardwareContext(EglBase.Context context) {
        this.sharedContext = context;
    }
}
