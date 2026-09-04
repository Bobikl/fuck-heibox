package com.tencent.ugc.videobase.utils;

import android.media.MediaCodecInfo;
import android.media.MediaCodecList;
import android.media.MediaFormat;
import com.tencent.liteav.base.system.LiteavSystemInfo;
import com.tencent.liteav.base.util.LiteavLog;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes4.dex */
public class HardwareDecoderMediaFormatBuilder {
    private static final String TAG = "HardwareDecoderMediaFormatBuilder";
    private ChipBrand mChipBrand;
    private int mHeight;
    private boolean mIsLowLatencyDecodeEnabled;
    private JSONArray mMediaCodecDeviceRelatedParams;
    private MediaFormat mMediaFormat;
    private String mMimeType;
    private int mWidth;

    /* JADX INFO: renamed from: com.tencent.ugc.videobase.utils.HardwareDecoderMediaFormatBuilder$1, reason: invalid class name */
    public static final /* synthetic */ class AnonymousClass1 {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        static final /* synthetic */ int[] f103899a;

        static {
            int[] iArr = new int[ChipBrand.values().length];
            f103899a = iArr;
            try {
                iArr[ChipBrand.kQcom.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f103899a[ChipBrand.kHisi.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f103899a[ChipBrand.kExynos.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f103899a[ChipBrand.kAmlogic.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
        }
    }

    public enum ChipBrand {
        kUnKnown,
        kQcom,
        kHisi,
        kExynos,
        kAmlogic
    }

    public HardwareDecoderMediaFormatBuilder() {
        ChipBrand chipBrand = ChipBrand.kUnKnown;
        this.mChipBrand = chipBrand;
        ChipBrand chipBrandBySupportedCodecs = getChipBrandBySupportedCodecs();
        this.mChipBrand = chipBrandBySupportedCodecs == chipBrand ? getChipBrandBySystemInfo() : chipBrandBySupportedCodecs;
        LiteavLog.i(TAG, "hardware name:" + LiteavSystemInfo.getHardware().toLowerCase() + " chip brand:" + this.mChipBrand);
    }

    private void configLowLatency(MediaFormat mediaFormat) {
        int systemOSVersionInt = LiteavSystemInfo.getSystemOSVersionInt();
        if (systemOSVersionInt >= 30 && this.mChipBrand != ChipBrand.kHisi) {
            mediaFormat.setInteger("low-latency", 1);
        }
        if (systemOSVersionInt > 23 || !LiteavSystemInfo.getManufacturer().toLowerCase().contains("xiaomi")) {
            mediaFormat.setInteger("vdec-lowlatency", 1);
        }
        if (systemOSVersionInt >= 26) {
            configVendorLowLatencyAfterApi26(mediaFormat);
        }
    }

    private void configVendorLowLatencyAfterApi26(MediaFormat mediaFormat) {
        int i10 = AnonymousClass1.f103899a[this.mChipBrand.ordinal()];
        if (i10 == 1) {
            mediaFormat.setInteger("vendor.qti-ext-dec-low-latency.enable", 1);
            mediaFormat.setInteger("vendor.qti-ext-dec-picture-order.enable", 1);
        } else if (i10 == 2) {
            mediaFormat.setInteger("vendor.hisi-ext-low-latency-video-dec.video-scene-for-low-latency-req", 1);
            mediaFormat.setInteger("vendor.hisi-ext-low-latency-video-dec.video-scene-for-low-latency-rdy", -1);
        } else if (i10 == 3) {
            mediaFormat.setInteger("vendor.rtc-ext-dec-low-latency.enable", 1);
        } else {
            if (i10 != 4) {
                return;
            }
            mediaFormat.setInteger("vendor.low-latency.enable", 1);
        }
    }

    private static void fillDeviceRelatedDecodeParams(MediaFormat mediaFormat, JSONArray jSONArray) {
        if (jSONArray == null) {
            return;
        }
        for (int i10 = 0; i10 < jSONArray.length(); i10++) {
            try {
                JSONObject jSONObject = jSONArray.getJSONObject(i10);
                mediaFormat.setInteger(jSONObject.optString("key"), jSONObject.optInt("value"));
            } catch (JSONException e10) {
                LiteavLog.e(TAG, "set MediaCodec device related params failed.", e10);
                return;
            }
        }
    }

    private ChipBrand getChipBrandBySupportedCodecs() {
        int i10;
        if (LiteavSystemInfo.getSystemOSVersionInt() < 21) {
            return ChipBrand.kUnKnown;
        }
        try {
            MediaCodecInfo[] codecInfos = new MediaCodecList(0).getCodecInfos();
            int length = codecInfos.length;
            while (i10 < length) {
                String lowerCase = codecInfos[i10].getName().toLowerCase();
                if (lowerCase.contains("hisi")) {
                    return ChipBrand.kHisi;
                }
                if (lowerCase.contains("amlogic")) {
                    return ChipBrand.kAmlogic;
                }
                i10 = (lowerCase.contains("qcom") || lowerCase.contains("qti")) ? 0 : i10 + 1;
                return ChipBrand.kQcom;
            }
        } catch (Throwable th2) {
            LiteavLog.e(TAG, "get mediacode info error:" + th2.getMessage());
        }
        return ChipBrand.kUnKnown;
    }

    private ChipBrand getChipBrandBySystemInfo() {
        String lowerCase = LiteavSystemInfo.getHardware().toLowerCase();
        if (lowerCase.contains("qcom")) {
            return ChipBrand.kQcom;
        }
        if (lowerCase.contains("kirin")) {
            return ChipBrand.kHisi;
        }
        return lowerCase.contains("exynos") ? ChipBrand.kExynos : ChipBrand.kUnKnown;
    }

    private MediaFormat getMediaFormatForConfigure() {
        MediaFormat mediaFormat = this.mMediaFormat;
        return mediaFormat == null ? MediaFormat.createVideoFormat(this.mMimeType, this.mWidth, this.mHeight) : mediaFormat;
    }

    public MediaFormat build() {
        MediaFormat mediaFormatForConfigure = getMediaFormatForConfigure();
        if (this.mIsLowLatencyDecodeEnabled) {
            configLowLatency(mediaFormatForConfigure);
        }
        fillDeviceRelatedDecodeParams(mediaFormatForConfigure, this.mMediaCodecDeviceRelatedParams);
        return mediaFormatForConfigure;
    }

    public HardwareDecoderMediaFormatBuilder setHeight(int i10) {
        this.mHeight = i10;
        return this;
    }

    public HardwareDecoderMediaFormatBuilder setIsLowLatencyDecodeEnabled(boolean z10) {
        this.mIsLowLatencyDecodeEnabled = z10;
        return this;
    }

    public HardwareDecoderMediaFormatBuilder setMediaCodecDeviceRelatedParams(JSONArray jSONArray) {
        this.mMediaCodecDeviceRelatedParams = jSONArray;
        return this;
    }

    public HardwareDecoderMediaFormatBuilder setMediaFormat(MediaFormat mediaFormat) {
        this.mMediaFormat = mediaFormat;
        return this;
    }

    public HardwareDecoderMediaFormatBuilder setMimeType(String str) {
        this.mMimeType = str;
        return this;
    }

    public HardwareDecoderMediaFormatBuilder setWidth(int i10) {
        this.mWidth = i10;
        return this;
    }
}
