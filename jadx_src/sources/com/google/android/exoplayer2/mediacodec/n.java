package com.google.android.exoplayer2.mediacodec;

import android.graphics.Point;
import android.media.MediaCodecInfo;
import android.util.Pair;
import androidx.annotation.j1;
import androidx.annotation.p0;
import androidx.annotation.w0;
import com.google.android.exoplayer2.a2;
import com.google.android.exoplayer2.util.u0;

/* JADX INFO: compiled from: MediaCodecInfo.java */
/* JADX INFO: loaded from: classes7.dex */
public final class n {

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public static final String f46795l = "MediaCodecInfo";

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public static final int f46796m = -1;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f46797a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f46798b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f46799c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @p0
    public final MediaCodecInfo.CodecCapabilities f46800d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final boolean f46801e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final boolean f46802f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final boolean f46803g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final boolean f46804h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final boolean f46805i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final boolean f46806j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private final boolean f46807k;

    @j1
    n(String str, String str2, String str3, @p0 MediaCodecInfo.CodecCapabilities codecCapabilities, boolean z10, boolean z11, boolean z12, boolean z13, boolean z14, boolean z15) {
        this.f46797a = (String) com.google.android.exoplayer2.util.a.g(str);
        this.f46798b = str2;
        this.f46799c = str3;
        this.f46800d = codecCapabilities;
        this.f46804h = z10;
        this.f46805i = z11;
        this.f46806j = z12;
        this.f46801e = z13;
        this.f46802f = z14;
        this.f46803g = z15;
        this.f46807k = com.google.android.exoplayer2.util.y.t(str2);
    }

    private static boolean A(String str) {
        return u0.f51539d.startsWith("SM-T230") && "OMX.MARVELL.VIDEO.HW.CODA7542DECODER".equals(str);
    }

    private static boolean B(String str) {
        if (u0.f51536a <= 22) {
            String str2 = u0.f51539d;
            if (("ODROID-XU3".equals(str2) || "Nexus 10".equals(str2)) && ("OMX.Exynos.AVC.Decoder".equals(str) || "OMX.Exynos.AVC.Decoder.secure".equals(str))) {
                return true;
            }
        }
        return false;
    }

    private static final boolean C(String str) {
        return ("OMX.MTK.VIDEO.DECODER.HEVC".equals(str) && "mcv5a".equals(u0.f51537b)) ? false : true;
    }

    public static n D(String str, String str2, String str3, @p0 MediaCodecInfo.CodecCapabilities codecCapabilities, boolean z10, boolean z11, boolean z12, boolean z13, boolean z14) {
        return new n(str, str2, str3, codecCapabilities, z10, z11, z12, (z13 || codecCapabilities == null || !j(codecCapabilities) || B(str)) ? false : true, codecCapabilities != null && u(codecCapabilities), z14 || (codecCapabilities != null && s(codecCapabilities)));
    }

    private static int a(String str, String str2, int i10) {
        int i11;
        if (i10 > 1 || ((u0.f51536a >= 26 && i10 > 0) || "audio/mpeg".equals(str2) || com.google.android.exoplayer2.util.y.X.equals(str2) || com.google.android.exoplayer2.util.y.Y.equals(str2) || com.google.android.exoplayer2.util.y.A.equals(str2) || com.google.android.exoplayer2.util.y.U.equals(str2) || com.google.android.exoplayer2.util.y.V.equals(str2) || com.google.android.exoplayer2.util.y.I.equals(str2) || com.google.android.exoplayer2.util.y.Z.equals(str2) || com.google.android.exoplayer2.util.y.J.equals(str2) || com.google.android.exoplayer2.util.y.K.equals(str2) || com.google.android.exoplayer2.util.y.f51563b0.equals(str2))) {
            return i10;
        }
        if (com.google.android.exoplayer2.util.y.L.equals(str2)) {
            i11 = 6;
        } else {
            i11 = com.google.android.exoplayer2.util.y.M.equals(str2) ? 16 : 30;
        }
        StringBuilder sb2 = new StringBuilder(String.valueOf(str).length() + 59);
        sb2.append("AssumedMaxChannelAdjustment: ");
        sb2.append(str);
        sb2.append(", [");
        sb2.append(i10);
        sb2.append(" to ");
        sb2.append(i11);
        sb2.append("]");
        com.google.android.exoplayer2.util.u.m(f46795l, sb2.toString());
        return i11;
    }

    @w0(21)
    private static Point c(MediaCodecInfo.VideoCapabilities videoCapabilities, int i10, int i11) {
        int widthAlignment = videoCapabilities.getWidthAlignment();
        int heightAlignment = videoCapabilities.getHeightAlignment();
        return new Point(u0.m(i10, widthAlignment) * widthAlignment, u0.m(i11, heightAlignment) * heightAlignment);
    }

    @w0(21)
    private static boolean d(MediaCodecInfo.VideoCapabilities videoCapabilities, int i10, int i11, double d10) {
        Point pointC = c(videoCapabilities, i10, i11);
        int i12 = pointC.x;
        int i13 = pointC.y;
        return (d10 == -1.0d || d10 < 1.0d) ? videoCapabilities.isSizeSupported(i12, i13) : videoCapabilities.areSizeAndRateSupported(i12, i13, Math.floor(d10));
    }

    private static MediaCodecInfo.CodecProfileLevel[] f(@p0 MediaCodecInfo.CodecCapabilities codecCapabilities) {
        int i10;
        MediaCodecInfo.VideoCapabilities videoCapabilities;
        int iIntValue = (codecCapabilities == null || (videoCapabilities = codecCapabilities.getVideoCapabilities()) == null) ? 0 : ((Integer) videoCapabilities.getBitrateRange().getUpper()).intValue();
        if (iIntValue >= 180000000) {
            i10 = 1024;
        } else if (iIntValue >= 120000000) {
            i10 = 512;
        } else if (iIntValue >= 60000000) {
            i10 = 256;
        } else if (iIntValue >= 30000000) {
            i10 = 128;
        } else if (iIntValue >= 18000000) {
            i10 = 64;
        } else if (iIntValue >= 12000000) {
            i10 = 32;
        } else if (iIntValue >= 7200000) {
            i10 = 16;
        } else if (iIntValue >= 3600000) {
            i10 = 8;
        } else if (iIntValue >= 1800000) {
            i10 = 4;
        } else {
            i10 = iIntValue >= 800000 ? 2 : 1;
        }
        MediaCodecInfo.CodecProfileLevel codecProfileLevel = new MediaCodecInfo.CodecProfileLevel();
        codecProfileLevel.profile = 1;
        codecProfileLevel.level = i10;
        return new MediaCodecInfo.CodecProfileLevel[]{codecProfileLevel};
    }

    @w0(23)
    private static int h(MediaCodecInfo.CodecCapabilities codecCapabilities) {
        return codecCapabilities.getMaxSupportedInstances();
    }

    private static boolean j(MediaCodecInfo.CodecCapabilities codecCapabilities) {
        return u0.f51536a >= 19 && k(codecCapabilities);
    }

    @w0(19)
    private static boolean k(MediaCodecInfo.CodecCapabilities codecCapabilities) {
        return codecCapabilities.isFeatureSupported("adaptive-playback");
    }

    private static boolean s(MediaCodecInfo.CodecCapabilities codecCapabilities) {
        return u0.f51536a >= 21 && t(codecCapabilities);
    }

    @w0(21)
    private static boolean t(MediaCodecInfo.CodecCapabilities codecCapabilities) {
        return codecCapabilities.isFeatureSupported("secure-playback");
    }

    private static boolean u(MediaCodecInfo.CodecCapabilities codecCapabilities) {
        return u0.f51536a >= 21 && v(codecCapabilities);
    }

    @w0(21)
    private static boolean v(MediaCodecInfo.CodecCapabilities codecCapabilities) {
        return codecCapabilities.isFeatureSupported("tunneled-playback");
    }

    private void x(String str) {
        String str2 = this.f46797a;
        String str3 = this.f46798b;
        String str4 = u0.f51540e;
        StringBuilder sb2 = new StringBuilder(String.valueOf(str).length() + 25 + String.valueOf(str2).length() + String.valueOf(str3).length() + String.valueOf(str4).length());
        sb2.append("AssumedSupport [");
        sb2.append(str);
        sb2.append("] [");
        sb2.append(str2);
        sb2.append(", ");
        sb2.append(str3);
        sb2.append("] [");
        sb2.append(str4);
        sb2.append("]");
        com.google.android.exoplayer2.util.u.b(f46795l, sb2.toString());
    }

    private void y(String str) {
        String str2 = this.f46797a;
        String str3 = this.f46798b;
        String str4 = u0.f51540e;
        StringBuilder sb2 = new StringBuilder(String.valueOf(str).length() + 20 + String.valueOf(str2).length() + String.valueOf(str3).length() + String.valueOf(str4).length());
        sb2.append("NoSupport [");
        sb2.append(str);
        sb2.append("] [");
        sb2.append(str2);
        sb2.append(", ");
        sb2.append(str3);
        sb2.append("] [");
        sb2.append(str4);
        sb2.append("]");
        com.google.android.exoplayer2.util.u.b(f46795l, sb2.toString());
    }

    private static boolean z(String str) {
        return com.google.android.exoplayer2.util.y.V.equals(str);
    }

    @w0(21)
    @p0
    public Point b(int i10, int i11) {
        MediaCodecInfo.VideoCapabilities videoCapabilities;
        MediaCodecInfo.CodecCapabilities codecCapabilities = this.f46800d;
        if (codecCapabilities == null || (videoCapabilities = codecCapabilities.getVideoCapabilities()) == null) {
            return null;
        }
        return c(videoCapabilities, i10, i11);
    }

    public com.google.android.exoplayer2.decoder.i e(a2 a2Var, a2 a2Var2) {
        int i10 = !u0.c(a2Var.f43593m, a2Var2.f43593m) ? 8 : 0;
        if (this.f46807k) {
            if (a2Var.f43601u != a2Var2.f43601u) {
                i10 |= 1024;
            }
            if (!this.f46801e && (a2Var.f43598r != a2Var2.f43598r || a2Var.f43599s != a2Var2.f43599s)) {
                i10 |= 512;
            }
            if (!u0.c(a2Var.f43605y, a2Var2.f43605y)) {
                i10 |= 2048;
            }
            if (A(this.f46797a) && !a2Var.x(a2Var2)) {
                i10 |= 2;
            }
            if (i10 == 0) {
                return new com.google.android.exoplayer2.decoder.i(this.f46797a, a2Var, a2Var2, a2Var.x(a2Var2) ? 3 : 2, 0);
            }
        } else {
            if (a2Var.f43606z != a2Var2.f43606z) {
                i10 |= 4096;
            }
            if (a2Var.A != a2Var2.A) {
                i10 |= 8192;
            }
            if (a2Var.B != a2Var2.B) {
                i10 |= 16384;
            }
            if (i10 == 0 && com.google.android.exoplayer2.util.y.A.equals(this.f46798b)) {
                Pair<Integer, Integer> pairQ = MediaCodecUtil.q(a2Var);
                Pair<Integer, Integer> pairQ2 = MediaCodecUtil.q(a2Var2);
                if (pairQ != null && pairQ2 != null) {
                    int iIntValue = ((Integer) pairQ.first).intValue();
                    int iIntValue2 = ((Integer) pairQ2.first).intValue();
                    if (iIntValue == 42 && iIntValue2 == 42) {
                        return new com.google.android.exoplayer2.decoder.i(this.f46797a, a2Var, a2Var2, 3, 0);
                    }
                }
            }
            if (!a2Var.x(a2Var2)) {
                i10 |= 32;
            }
            if (z(this.f46798b)) {
                i10 |= 2;
            }
            if (i10 == 0) {
                return new com.google.android.exoplayer2.decoder.i(this.f46797a, a2Var, a2Var2, 1, 0);
            }
        }
        return new com.google.android.exoplayer2.decoder.i(this.f46797a, a2Var, a2Var2, 0, i10);
    }

    public int g() {
        MediaCodecInfo.CodecCapabilities codecCapabilities;
        if (u0.f51536a < 23 || (codecCapabilities = this.f46800d) == null) {
            return -1;
        }
        return h(codecCapabilities);
    }

    public MediaCodecInfo.CodecProfileLevel[] i() {
        MediaCodecInfo.CodecProfileLevel[] codecProfileLevelArr;
        MediaCodecInfo.CodecCapabilities codecCapabilities = this.f46800d;
        return (codecCapabilities == null || (codecProfileLevelArr = codecCapabilities.profileLevels) == null) ? new MediaCodecInfo.CodecProfileLevel[0] : codecProfileLevelArr;
    }

    @w0(21)
    public boolean l(int i10) {
        MediaCodecInfo.CodecCapabilities codecCapabilities = this.f46800d;
        if (codecCapabilities == null) {
            y("channelCount.caps");
            return false;
        }
        MediaCodecInfo.AudioCapabilities audioCapabilities = codecCapabilities.getAudioCapabilities();
        if (audioCapabilities == null) {
            y("channelCount.aCaps");
            return false;
        }
        if (a(this.f46797a, this.f46798b, audioCapabilities.getMaxInputChannelCount()) >= i10) {
            return true;
        }
        StringBuilder sb2 = new StringBuilder(33);
        sb2.append("channelCount.support, ");
        sb2.append(i10);
        y(sb2.toString());
        return false;
    }

    @w0(21)
    public boolean m(int i10) {
        MediaCodecInfo.CodecCapabilities codecCapabilities = this.f46800d;
        if (codecCapabilities == null) {
            y("sampleRate.caps");
            return false;
        }
        MediaCodecInfo.AudioCapabilities audioCapabilities = codecCapabilities.getAudioCapabilities();
        if (audioCapabilities == null) {
            y("sampleRate.aCaps");
            return false;
        }
        if (audioCapabilities.isSampleRateSupported(i10)) {
            return true;
        }
        StringBuilder sb2 = new StringBuilder(31);
        sb2.append("sampleRate.support, ");
        sb2.append(i10);
        y(sb2.toString());
        return false;
    }

    public boolean n(a2 a2Var) {
        String strG;
        String str = a2Var.f43590j;
        if (str == null || this.f46798b == null || (strG = com.google.android.exoplayer2.util.y.g(str)) == null) {
            return true;
        }
        if (!this.f46798b.equals(strG)) {
            String str2 = a2Var.f43590j;
            StringBuilder sb2 = new StringBuilder(String.valueOf(str2).length() + 13 + strG.length());
            sb2.append("codec.mime ");
            sb2.append(str2);
            sb2.append(", ");
            sb2.append(strG);
            y(sb2.toString());
            return false;
        }
        Pair<Integer, Integer> pairQ = MediaCodecUtil.q(a2Var);
        if (pairQ == null) {
            return true;
        }
        int iIntValue = ((Integer) pairQ.first).intValue();
        int iIntValue2 = ((Integer) pairQ.second).intValue();
        if (!this.f46807k && iIntValue != 42) {
            return true;
        }
        MediaCodecInfo.CodecProfileLevel[] codecProfileLevelArrI = i();
        if (u0.f51536a <= 23 && "video/x-vnd.on2.vp9".equals(this.f46798b) && codecProfileLevelArrI.length == 0) {
            codecProfileLevelArrI = f(this.f46800d);
        }
        for (MediaCodecInfo.CodecProfileLevel codecProfileLevel : codecProfileLevelArrI) {
            if (codecProfileLevel.profile == iIntValue && codecProfileLevel.level >= iIntValue2) {
                return true;
            }
        }
        String str3 = a2Var.f43590j;
        StringBuilder sb3 = new StringBuilder(String.valueOf(str3).length() + 22 + strG.length());
        sb3.append("codec.profileLevel, ");
        sb3.append(str3);
        sb3.append(", ");
        sb3.append(strG);
        y(sb3.toString());
        return false;
    }

    public boolean o(a2 a2Var) throws MediaCodecUtil.DecoderQueryException {
        int i10;
        if (!n(a2Var)) {
            return false;
        }
        if (!this.f46807k) {
            if (u0.f51536a >= 21) {
                int i11 = a2Var.A;
                if (i11 != -1 && !m(i11)) {
                    return false;
                }
                int i12 = a2Var.f43606z;
                if (i12 != -1 && !l(i12)) {
                    return false;
                }
            }
            return true;
        }
        int i13 = a2Var.f43598r;
        if (i13 <= 0 || (i10 = a2Var.f43599s) <= 0) {
            return true;
        }
        if (u0.f51536a >= 21) {
            return w(i13, i10, a2Var.f43600t);
        }
        boolean z10 = i13 * i10 <= MediaCodecUtil.N();
        if (!z10) {
            int i14 = a2Var.f43598r;
            int i15 = a2Var.f43599s;
            StringBuilder sb2 = new StringBuilder(40);
            sb2.append("legacyFrameSize, ");
            sb2.append(i14);
            sb2.append("x");
            sb2.append(i15);
            y(sb2.toString());
        }
        return z10;
    }

    public boolean p() {
        if (u0.f51536a >= 29 && "video/x-vnd.on2.vp9".equals(this.f46798b)) {
            for (MediaCodecInfo.CodecProfileLevel codecProfileLevel : i()) {
                if (codecProfileLevel.profile == 16384) {
                    return true;
                }
            }
        }
        return false;
    }

    public boolean q(a2 a2Var) {
        if (this.f46807k) {
            return this.f46801e;
        }
        Pair<Integer, Integer> pairQ = MediaCodecUtil.q(a2Var);
        return pairQ != null && ((Integer) pairQ.first).intValue() == 42;
    }

    @Deprecated
    public boolean r(a2 a2Var, a2 a2Var2, boolean z10) {
        if (!z10 && a2Var.f43605y != null && a2Var2.f43605y == null) {
            a2Var2 = a2Var2.c().J(a2Var.f43605y).E();
        }
        int i10 = e(a2Var, a2Var2).f44547d;
        return i10 == 2 || i10 == 3;
    }

    public String toString() {
        return this.f46797a;
    }

    @w0(21)
    public boolean w(int i10, int i11, double d10) {
        MediaCodecInfo.CodecCapabilities codecCapabilities = this.f46800d;
        if (codecCapabilities == null) {
            y("sizeAndRate.caps");
            return false;
        }
        MediaCodecInfo.VideoCapabilities videoCapabilities = codecCapabilities.getVideoCapabilities();
        if (videoCapabilities == null) {
            y("sizeAndRate.vCaps");
            return false;
        }
        if (d(videoCapabilities, i10, i11, d10)) {
            return true;
        }
        if (i10 < i11 && C(this.f46797a) && d(videoCapabilities, i11, i10, d10)) {
            StringBuilder sb2 = new StringBuilder(69);
            sb2.append("sizeAndRate.rotated, ");
            sb2.append(i10);
            sb2.append("x");
            sb2.append(i11);
            sb2.append("x");
            sb2.append(d10);
            x(sb2.toString());
            return true;
        }
        StringBuilder sb3 = new StringBuilder(69);
        sb3.append("sizeAndRate.support, ");
        sb3.append(i10);
        sb3.append("x");
        sb3.append(i11);
        sb3.append("x");
        sb3.append(d10);
        y(sb3.toString());
        return false;
    }
}
