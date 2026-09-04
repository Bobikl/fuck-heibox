package com.tencent.liteav.videobase.utils;

import android.media.MediaCodecInfo;
import android.media.MediaCodecList;
import android.media.MediaFormat;
import com.tencent.liteav.base.system.LiteavSystemInfo;
import com.tencent.liteav.base.util.LiteavLog;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes4.dex */
public final class b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f100404a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public int f100405b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public String f100406c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public boolean f100407d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private a f100408e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private MediaFormat f100409f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private JSONArray f100410g;

    /* JADX INFO: renamed from: com.tencent.liteav.videobase.utils.b$1, reason: invalid class name */
    public static final /* synthetic */ class AnonymousClass1 {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        static final /* synthetic */ int[] f100411a;

        static {
            int[] iArr = new int[a.values().length];
            f100411a = iArr;
            try {
                iArr[a.kQcom.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f100411a[a.kHisi.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f100411a[a.kExynos.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f100411a[a.kAmlogic.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
        }
    }

    public enum a {
        kUnKnown,
        kQcom,
        kHisi,
        kExynos,
        kAmlogic
    }

    public b() {
        a aVar = a.kUnKnown;
        this.f100408e = aVar;
        a aVarB = b();
        if (aVarB == aVar) {
            String lowerCase = LiteavSystemInfo.getHardware().toLowerCase();
            if (lowerCase.contains("qcom")) {
                aVar = a.kQcom;
            } else if (lowerCase.contains("kirin")) {
                aVar = a.kHisi;
            } else if (lowerCase.contains("exynos")) {
                aVar = a.kExynos;
            }
            aVarB = aVar;
        }
        this.f100408e = aVarB;
        LiteavLog.i("HardwareDecoderMediaFormatBuilder", "hardware name:" + LiteavSystemInfo.getHardware().toLowerCase() + " chip brand:" + this.f100408e);
    }

    private static a b() {
        int i10;
        if (LiteavSystemInfo.getSystemOSVersionInt() < 21) {
            return a.kUnKnown;
        }
        try {
            MediaCodecInfo[] codecInfos = new MediaCodecList(0).getCodecInfos();
            int length = codecInfos.length;
            while (i10 < length) {
                String lowerCase = codecInfos[i10].getName().toLowerCase();
                if (lowerCase.contains("hisi")) {
                    return a.kHisi;
                }
                if (lowerCase.contains("amlogic")) {
                    return a.kAmlogic;
                }
                i10 = (lowerCase.contains("qcom") || lowerCase.contains("qti")) ? 0 : i10 + 1;
                return a.kQcom;
            }
        } catch (Throwable th2) {
            LiteavLog.e("HardwareDecoderMediaFormatBuilder", "get mediacode info error:" + th2.getMessage());
        }
        return a.kUnKnown;
    }

    public final MediaFormat a() {
        MediaFormat mediaFormatCreateVideoFormat = this.f100409f;
        if (mediaFormatCreateVideoFormat == null) {
            mediaFormatCreateVideoFormat = MediaFormat.createVideoFormat(this.f100406c, this.f100404a, this.f100405b);
        }
        if (this.f100407d) {
            int systemOSVersionInt = LiteavSystemInfo.getSystemOSVersionInt();
            if (systemOSVersionInt >= 30 && this.f100408e != a.kHisi) {
                mediaFormatCreateVideoFormat.setInteger("low-latency", 1);
            }
            if (systemOSVersionInt > 23 || !LiteavSystemInfo.getManufacturer().toLowerCase().contains("xiaomi")) {
                mediaFormatCreateVideoFormat.setInteger("vdec-lowlatency", 1);
            }
            if (systemOSVersionInt >= 26) {
                int i10 = AnonymousClass1.f100411a[this.f100408e.ordinal()];
                if (i10 == 1) {
                    mediaFormatCreateVideoFormat.setInteger("vendor.qti-ext-dec-low-latency.enable", 1);
                    mediaFormatCreateVideoFormat.setInteger("vendor.qti-ext-dec-picture-order.enable", 1);
                } else if (i10 == 2) {
                    mediaFormatCreateVideoFormat.setInteger("vendor.hisi-ext-low-latency-video-dec.video-scene-for-low-latency-req", 1);
                    mediaFormatCreateVideoFormat.setInteger("vendor.hisi-ext-low-latency-video-dec.video-scene-for-low-latency-rdy", -1);
                } else if (i10 == 3) {
                    mediaFormatCreateVideoFormat.setInteger("vendor.rtc-ext-dec-low-latency.enable", 1);
                } else if (i10 == 4) {
                    mediaFormatCreateVideoFormat.setInteger("vendor.low-latency.enable", 1);
                }
            }
        }
        JSONArray jSONArray = this.f100410g;
        if (jSONArray != null) {
            for (int i11 = 0; i11 < jSONArray.length(); i11++) {
                try {
                    JSONObject jSONObject = jSONArray.getJSONObject(i11);
                    mediaFormatCreateVideoFormat.setInteger(jSONObject.optString("key"), jSONObject.optInt("value"));
                } catch (JSONException e10) {
                    LiteavLog.e("HardwareDecoderMediaFormatBuilder", "set MediaCodec device related params failed.", e10);
                }
            }
        }
        return mediaFormatCreateVideoFormat;
    }
}
