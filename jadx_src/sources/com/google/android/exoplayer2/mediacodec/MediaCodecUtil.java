package com.google.android.exoplayer2.mediacodec;

import android.annotation.SuppressLint;
import android.media.MediaCodecInfo;
import android.media.MediaCodecList;
import android.text.TextUtils;
import android.util.Pair;
import androidx.annotation.b0;
import androidx.annotation.p0;
import androidx.annotation.w0;
import com.google.android.exoplayer2.a2;
import com.google.android.exoplayer2.util.u0;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/* JADX INFO: loaded from: classes7.dex */
@SuppressLint({"InlinedApi"})
public final class MediaCodecUtil {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final String f46698a = "MediaCodecUtil";

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private static final String f46701d = "avc1";

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private static final String f46702e = "avc2";

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private static final String f46703f = "vp09";

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private static final String f46704g = "hev1";

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private static final String f46705h = "hvc1";

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private static final String f46706i = "av01";

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private static final String f46707j = "mp4a";

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static final Pattern f46699b = Pattern.compile("^\\D?(\\d+)$");

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @b0("MediaCodecUtil.class")
    private static final HashMap<b, List<n>> f46700c = new HashMap<>();

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private static int f46708k = -1;

    public static class DecoderQueryException extends Exception {
        private DecoderQueryException(Throwable th2) {
            super("Failed to query underlying media codecs", th2);
        }
    }

    public static final class b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final String f46709a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final boolean f46710b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final boolean f46711c;

        public b(String str, boolean z10, boolean z11) {
            this.f46709a = str;
            this.f46710b = z10;
            this.f46711c = z11;
        }

        public boolean equals(@p0 Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj == null || obj.getClass() != b.class) {
                return false;
            }
            b bVar = (b) obj;
            return TextUtils.equals(this.f46709a, bVar.f46709a) && this.f46710b == bVar.f46710b && this.f46711c == bVar.f46711c;
        }

        public int hashCode() {
            return ((((this.f46709a.hashCode() + 31) * 31) + (this.f46710b ? 1231 : 1237)) * 31) + (this.f46711c ? 1231 : 1237);
        }
    }

    public interface c {
        boolean a(String str, String str2, MediaCodecInfo.CodecCapabilities codecCapabilities);

        MediaCodecInfo b(int i10);

        boolean c(String str, String str2, MediaCodecInfo.CodecCapabilities codecCapabilities);

        int d();

        boolean e();
    }

    public static final class d implements c {
        private d() {
        }

        @Override // com.google.android.exoplayer2.mediacodec.MediaCodecUtil.c
        public boolean a(String str, String str2, MediaCodecInfo.CodecCapabilities codecCapabilities) {
            return false;
        }

        @Override // com.google.android.exoplayer2.mediacodec.MediaCodecUtil.c
        public MediaCodecInfo b(int i10) {
            return MediaCodecList.getCodecInfoAt(i10);
        }

        @Override // com.google.android.exoplayer2.mediacodec.MediaCodecUtil.c
        public boolean c(String str, String str2, MediaCodecInfo.CodecCapabilities codecCapabilities) {
            return "secure-playback".equals(str) && "video/avc".equals(str2);
        }

        @Override // com.google.android.exoplayer2.mediacodec.MediaCodecUtil.c
        public int d() {
            return MediaCodecList.getCodecCount();
        }

        @Override // com.google.android.exoplayer2.mediacodec.MediaCodecUtil.c
        public boolean e() {
            return false;
        }
    }

    @w0(21)
    public static final class e implements c {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final int f46712a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        @p0
        private MediaCodecInfo[] f46713b;

        public e(boolean z10, boolean z11) {
            this.f46712a = (z10 || z11) ? 1 : 0;
        }

        @mk.d({"mediaCodecInfos"})
        private void f() {
            if (this.f46713b == null) {
                this.f46713b = new MediaCodecList(this.f46712a).getCodecInfos();
            }
        }

        @Override // com.google.android.exoplayer2.mediacodec.MediaCodecUtil.c
        public boolean a(String str, String str2, MediaCodecInfo.CodecCapabilities codecCapabilities) {
            return codecCapabilities.isFeatureRequired(str);
        }

        @Override // com.google.android.exoplayer2.mediacodec.MediaCodecUtil.c
        public MediaCodecInfo b(int i10) {
            f();
            return this.f46713b[i10];
        }

        @Override // com.google.android.exoplayer2.mediacodec.MediaCodecUtil.c
        public boolean c(String str, String str2, MediaCodecInfo.CodecCapabilities codecCapabilities) {
            return codecCapabilities.isFeatureSupported(str);
        }

        @Override // com.google.android.exoplayer2.mediacodec.MediaCodecUtil.c
        public int d() {
            f();
            return this.f46713b.length;
        }

        @Override // com.google.android.exoplayer2.mediacodec.MediaCodecUtil.c
        public boolean e() {
            return true;
        }
    }

    public interface f<T> {
        int a(T t10);
    }

    private MediaCodecUtil() {
    }

    private static boolean A(MediaCodecInfo mediaCodecInfo) {
        return u0.f51536a >= 29 && B(mediaCodecInfo);
    }

    @w0(29)
    private static boolean B(MediaCodecInfo mediaCodecInfo) {
        return mediaCodecInfo.isAlias();
    }

    private static boolean C(MediaCodecInfo mediaCodecInfo, String str, boolean z10, String str2) {
        if (mediaCodecInfo.isEncoder() || (!z10 && str.endsWith(".secure"))) {
            return false;
        }
        int i10 = u0.f51536a;
        if (i10 < 21 && ("CIPAACDecoder".equals(str) || "CIPMP3Decoder".equals(str) || "CIPVorbisDecoder".equals(str) || "CIPAMRNBDecoder".equals(str) || "AACDecoder".equals(str) || "MP3Decoder".equals(str))) {
            return false;
        }
        if (i10 < 18 && "OMX.MTK.AUDIO.DECODER.AAC".equals(str)) {
            String str3 = u0.f51537b;
            if ("a70".equals(str3) || ("Xiaomi".equals(u0.f51538c) && str3.startsWith("HM"))) {
                return false;
            }
        }
        if (i10 == 16 && "OMX.qcom.audio.decoder.mp3".equals(str)) {
            String str4 = u0.f51537b;
            if ("dlxu".equals(str4) || "protou".equals(str4) || "ville".equals(str4) || "villeplus".equals(str4) || "villec2".equals(str4) || str4.startsWith("gee") || "C6602".equals(str4) || "C6603".equals(str4) || "C6606".equals(str4) || "C6616".equals(str4) || "L36h".equals(str4) || "SO-02E".equals(str4)) {
                return false;
            }
        }
        if (i10 == 16 && "OMX.qcom.audio.decoder.aac".equals(str)) {
            String str5 = u0.f51537b;
            if ("C1504".equals(str5) || "C1505".equals(str5) || "C1604".equals(str5) || "C1605".equals(str5)) {
                return false;
            }
        }
        if (i10 < 24 && (("OMX.SEC.aac.dec".equals(str) || "OMX.Exynos.AAC.Decoder".equals(str)) && "samsung".equals(u0.f51538c))) {
            String str6 = u0.f51537b;
            if (str6.startsWith("zeroflte") || str6.startsWith("zerolte") || str6.startsWith("zenlte") || "SC-05G".equals(str6) || "marinelteatt".equals(str6) || "404SC".equals(str6) || "SC-04G".equals(str6) || "SCV31".equals(str6)) {
                return false;
            }
        }
        if (i10 <= 19 && "OMX.SEC.vp8.dec".equals(str) && "samsung".equals(u0.f51538c)) {
            String str7 = u0.f51537b;
            if (str7.startsWith("d2") || str7.startsWith("serrano") || str7.startsWith("jflte") || str7.startsWith("santos") || str7.startsWith("t0")) {
                return false;
            }
        }
        if (i10 <= 19 && u0.f51537b.startsWith("jflte") && "OMX.qcom.video.decoder.vp8".equals(str)) {
            return false;
        }
        return (com.google.android.exoplayer2.util.y.N.equals(str2) && "OMX.MTK.AUDIO.DECODER.DSPAC3".equals(str)) ? false : true;
    }

    private static boolean D(MediaCodecInfo mediaCodecInfo) {
        return u0.f51536a >= 29 ? E(mediaCodecInfo) : !F(mediaCodecInfo);
    }

    @w0(29)
    private static boolean E(MediaCodecInfo mediaCodecInfo) {
        return mediaCodecInfo.isHardwareAccelerated();
    }

    private static boolean F(MediaCodecInfo mediaCodecInfo) {
        if (u0.f51536a >= 29) {
            return G(mediaCodecInfo);
        }
        String strG = com.google.common.base.a.g(mediaCodecInfo.getName());
        if (strG.startsWith("arc.")) {
            return false;
        }
        return strG.startsWith("omx.google.") || strG.startsWith("omx.ffmpeg.") || (strG.startsWith("omx.sec.") && strG.contains(".sw.")) || strG.equals("omx.qcom.video.decoder.hevcswvdec") || strG.startsWith("c2.android.") || strG.startsWith("c2.google.") || !(strG.startsWith("omx.") || strG.startsWith("c2."));
    }

    @w0(29)
    private static boolean G(MediaCodecInfo mediaCodecInfo) {
        return mediaCodecInfo.isSoftwareOnly();
    }

    private static boolean H(MediaCodecInfo mediaCodecInfo) {
        if (u0.f51536a >= 29) {
            return I(mediaCodecInfo);
        }
        String strG = com.google.common.base.a.g(mediaCodecInfo.getName());
        return (strG.startsWith("omx.google.") || strG.startsWith("c2.android.") || strG.startsWith("c2.google.")) ? false : true;
    }

    @w0(29)
    private static boolean I(MediaCodecInfo mediaCodecInfo) {
        return mediaCodecInfo.isVendor();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ int J(n nVar) {
        String str = nVar.f46797a;
        if (str.startsWith("OMX.google") || str.startsWith("c2.android")) {
            return 1;
        }
        return (u0.f51536a >= 26 || !str.equals("OMX.MTK.AUDIO.DECODER.RAW")) ? 0 : -1;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ int K(n nVar) {
        return nVar.f46797a.startsWith("OMX.google") ? 1 : 0;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ int L(a2 a2Var, n nVar) {
        try {
            return nVar.o(a2Var) ? 1 : 0;
        } catch (DecoderQueryException unused) {
            return -1;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ int M(f fVar, Object obj, Object obj2) {
        return fVar.a(obj2) - fVar.a(obj);
    }

    public static int N() throws DecoderQueryException {
        if (f46708k == -1) {
            int iMax = 0;
            n nVarR = r("video/avc", false, false);
            if (nVarR != null) {
                MediaCodecInfo.CodecProfileLevel[] codecProfileLevelArrI = nVarR.i();
                int length = codecProfileLevelArrI.length;
                int iMax2 = 0;
                while (iMax < length) {
                    iMax2 = Math.max(h(codecProfileLevelArrI[iMax].level), iMax2);
                    iMax++;
                }
                iMax = Math.max(iMax2, u0.f51536a >= 21 ? 345600 : 172800);
            }
            f46708k = iMax;
        }
        return f46708k;
    }

    private static int O(int i10) {
        int i11 = 17;
        if (i10 != 17) {
            i11 = 20;
            if (i10 != 20) {
                i11 = 23;
                if (i10 != 23) {
                    i11 = 29;
                    if (i10 != 29) {
                        i11 = 39;
                        if (i10 != 39) {
                            i11 = 42;
                            if (i10 != 42) {
                                switch (i10) {
                                    case 1:
                                        return 1;
                                    case 2:
                                        return 2;
                                    case 3:
                                        return 3;
                                    case 4:
                                        return 4;
                                    case 5:
                                        return 5;
                                    case 6:
                                        return 6;
                                    default:
                                        return -1;
                                }
                            }
                        }
                    }
                }
            }
        }
        return i11;
    }

    private static <T> void P(List<T> list, final f<T> fVar) {
        Collections.sort(list, new Comparator() { // from class: com.google.android.exoplayer2.mediacodec.t
            @Override // java.util.Comparator
            public final int compare(Object obj, Object obj2) {
                return MediaCodecUtil.M(fVar, obj, obj2);
            }
        });
    }

    private static int Q(int i10) {
        if (i10 == 10) {
            return 1;
        }
        if (i10 == 11) {
            return 2;
        }
        if (i10 == 20) {
            return 4;
        }
        if (i10 == 21) {
            return 8;
        }
        if (i10 == 30) {
            return 16;
        }
        if (i10 == 31) {
            return 32;
        }
        if (i10 == 40) {
            return 64;
        }
        if (i10 == 41) {
            return 128;
        }
        if (i10 == 50) {
            return 256;
        }
        if (i10 == 51) {
            return 512;
        }
        switch (i10) {
            case 60:
                return 2048;
            case 61:
                return 4096;
            case 62:
                return 8192;
            default:
                return -1;
        }
    }

    private static int R(int i10) {
        if (i10 == 0) {
            return 1;
        }
        if (i10 == 1) {
            return 2;
        }
        if (i10 != 2) {
            return i10 != 3 ? -1 : 8;
        }
        return 4;
    }

    public static void S(String str, boolean z10, boolean z11) {
        try {
            s(str, z10, z11);
        } catch (DecoderQueryException e10) {
            com.google.android.exoplayer2.util.u.e(f46698a, "Codec warming failed", e10);
        }
    }

    private static void e(String str, List<n> list) {
        if (com.google.android.exoplayer2.util.y.I.equals(str)) {
            if (u0.f51536a < 26 && u0.f51537b.equals("R9") && list.size() == 1 && list.get(0).f46797a.equals("OMX.MTK.AUDIO.DECODER.RAW")) {
                list.add(n.D("OMX.google.raw.decoder", com.google.android.exoplayer2.util.y.I, com.google.android.exoplayer2.util.y.I, null, false, true, false, false, false));
            }
            P(list, new f() { // from class: com.google.android.exoplayer2.mediacodec.u
                @Override // com.google.android.exoplayer2.mediacodec.MediaCodecUtil.f
                public final int a(Object obj) {
                    return MediaCodecUtil.J((n) obj);
                }
            });
        }
        int i10 = u0.f51536a;
        if (i10 < 21 && list.size() > 1) {
            String str2 = list.get(0).f46797a;
            if ("OMX.SEC.mp3.dec".equals(str2) || "OMX.SEC.MP3.Decoder".equals(str2) || "OMX.brcm.audio.mp3.decoder".equals(str2)) {
                P(list, new f() { // from class: com.google.android.exoplayer2.mediacodec.v
                    @Override // com.google.android.exoplayer2.mediacodec.MediaCodecUtil.f
                    public final int a(Object obj) {
                        return MediaCodecUtil.K((n) obj);
                    }
                });
            }
        }
        if (i10 >= 32 || list.size() <= 1 || !"OMX.qti.audio.decoder.flac".equals(list.get(0).f46797a)) {
            return;
        }
        list.add(list.remove(0));
    }

    private static int f(int i10) {
        switch (i10) {
            case 0:
                return 1;
            case 1:
                return 2;
            case 2:
                return 4;
            case 3:
                return 8;
            case 4:
                return 16;
            case 5:
                return 32;
            case 6:
                return 64;
            case 7:
                return 128;
            case 8:
                return 256;
            case 9:
                return 512;
            case 10:
                return 1024;
            case 11:
                return 2048;
            case 12:
                return 4096;
            case 13:
                return 8192;
            case 14:
                return 16384;
            case 15:
                return 32768;
            case 16:
                return 65536;
            case 17:
                return 131072;
            case 18:
                return 262144;
            case 19:
                return 524288;
            case 20:
                return 1048576;
            case 21:
                return 2097152;
            case 22:
                return 4194304;
            case 23:
                return 8388608;
            default:
                return -1;
        }
    }

    private static int g(int i10) {
        switch (i10) {
            case 10:
                return 1;
            case 11:
                return 4;
            case 12:
                return 8;
            case 13:
                return 16;
            default:
                switch (i10) {
                    case 20:
                        return 32;
                    case 21:
                        return 64;
                    case 22:
                        return 128;
                    default:
                        switch (i10) {
                            case 30:
                                return 256;
                            case 31:
                                return 512;
                            case 32:
                                return 1024;
                            default:
                                switch (i10) {
                                    case 40:
                                        return 2048;
                                    case 41:
                                        return 4096;
                                    case 42:
                                        return 8192;
                                    default:
                                        switch (i10) {
                                            case 50:
                                                return 16384;
                                            case 51:
                                                return 32768;
                                            case 52:
                                                return 65536;
                                            default:
                                                return -1;
                                        }
                                }
                        }
                }
        }
    }

    private static int h(int i10) {
        if (i10 == 1 || i10 == 2) {
            return 25344;
        }
        switch (i10) {
            case 8:
            case 16:
            case 32:
                return 101376;
            case 64:
                return 202752;
            case 128:
            case 256:
                return 414720;
            case 512:
                return 921600;
            case 1024:
                return 1310720;
            case 2048:
            case 4096:
                return 2097152;
            case 8192:
                return 2228224;
            case 16384:
                return 5652480;
            case 32768:
            case 65536:
                return 9437184;
            case 131072:
            case 262144:
            case 524288:
                return 35651584;
            default:
                return -1;
        }
    }

    private static int i(int i10) {
        if (i10 == 66) {
            return 1;
        }
        if (i10 == 77) {
            return 2;
        }
        if (i10 == 88) {
            return 4;
        }
        if (i10 == 100) {
            return 8;
        }
        if (i10 == 110) {
            return 16;
        }
        if (i10 != 122) {
            return i10 != 244 ? -1 : 64;
        }
        return 32;
    }

    public static synchronized void j() {
        f46700c.clear();
    }

    @p0
    private static Integer k(@p0 String str) {
        if (str == null) {
            return null;
        }
        switch (str) {
            case "01":
                return 1;
            case "02":
                return 2;
            case "03":
                return 4;
            case "04":
                return 8;
            case "05":
                return 16;
            case "06":
                return 32;
            case "07":
                return 64;
            case "08":
                return 128;
            case "09":
                return 256;
            case "10":
                return 512;
            case "11":
                return 1024;
            case "12":
                return 2048;
            case "13":
                return 4096;
            default:
                return null;
        }
    }

    @p0
    private static Integer l(@p0 String str) {
        if (str == null) {
            return null;
        }
        switch (str) {
            case "00":
                return 1;
            case "01":
                return 2;
            case "02":
                return 4;
            case "03":
                return 8;
            case "04":
                return 16;
            case "05":
                return 32;
            case "06":
                return 64;
            case "07":
                return 128;
            case "08":
                return 256;
            case "09":
                return 512;
            default:
                return null;
        }
    }

    @p0
    private static Pair<Integer, Integer> m(String str, String[] strArr) {
        int iO;
        if (strArr.length != 3) {
            String strValueOf = String.valueOf(str);
            com.google.android.exoplayer2.util.u.m(f46698a, strValueOf.length() != 0 ? "Ignoring malformed MP4A codec string: ".concat(strValueOf) : new String("Ignoring malformed MP4A codec string: "));
            return null;
        }
        try {
            if (com.google.android.exoplayer2.util.y.A.equals(com.google.android.exoplayer2.util.y.h(Integer.parseInt(strArr[1], 16))) && (iO = O(Integer.parseInt(strArr[2]))) != -1) {
                return new Pair<>(Integer.valueOf(iO), 0);
            }
        } catch (NumberFormatException unused) {
            String strValueOf2 = String.valueOf(str);
            com.google.android.exoplayer2.util.u.m(f46698a, strValueOf2.length() != 0 ? "Ignoring malformed MP4A codec string: ".concat(strValueOf2) : new String("Ignoring malformed MP4A codec string: "));
        }
        return null;
    }

    @p0
    private static Pair<Integer, Integer> n(String str, String[] strArr, @p0 com.google.android.exoplayer2.video.c cVar) {
        int i10;
        if (strArr.length < 4) {
            String strValueOf = String.valueOf(str);
            com.google.android.exoplayer2.util.u.m(f46698a, strValueOf.length() != 0 ? "Ignoring malformed AV1 codec string: ".concat(strValueOf) : new String("Ignoring malformed AV1 codec string: "));
            return null;
        }
        int i11 = 1;
        try {
            int i12 = Integer.parseInt(strArr[1]);
            int i13 = Integer.parseInt(strArr[2].substring(0, 2));
            int i14 = Integer.parseInt(strArr[3]);
            if (i12 != 0) {
                StringBuilder sb2 = new StringBuilder(32);
                sb2.append("Unknown AV1 profile: ");
                sb2.append(i12);
                com.google.android.exoplayer2.util.u.m(f46698a, sb2.toString());
                return null;
            }
            if (i14 != 8 && i14 != 10) {
                StringBuilder sb3 = new StringBuilder(34);
                sb3.append("Unknown AV1 bit depth: ");
                sb3.append(i14);
                com.google.android.exoplayer2.util.u.m(f46698a, sb3.toString());
                return null;
            }
            if (i14 != 8) {
                i11 = (cVar == null || !(cVar.f51724e != null || (i10 = cVar.f51723d) == 7 || i10 == 6)) ? 2 : 4096;
            }
            int iF = f(i13);
            if (iF != -1) {
                return new Pair<>(Integer.valueOf(i11), Integer.valueOf(iF));
            }
            StringBuilder sb4 = new StringBuilder(30);
            sb4.append("Unknown AV1 level: ");
            sb4.append(i13);
            com.google.android.exoplayer2.util.u.m(f46698a, sb4.toString());
            return null;
        } catch (NumberFormatException unused) {
            String strValueOf2 = String.valueOf(str);
            com.google.android.exoplayer2.util.u.m(f46698a, strValueOf2.length() != 0 ? "Ignoring malformed AV1 codec string: ".concat(strValueOf2) : new String("Ignoring malformed AV1 codec string: "));
            return null;
        }
    }

    @p0
    private static Pair<Integer, Integer> o(String str, String[] strArr) {
        int i10;
        int i11;
        if (strArr.length < 2) {
            String strValueOf = String.valueOf(str);
            com.google.android.exoplayer2.util.u.m(f46698a, strValueOf.length() != 0 ? "Ignoring malformed AVC codec string: ".concat(strValueOf) : new String("Ignoring malformed AVC codec string: "));
            return null;
        }
        try {
            if (strArr[1].length() == 6) {
                i11 = Integer.parseInt(strArr[1].substring(0, 2), 16);
                i10 = Integer.parseInt(strArr[1].substring(4), 16);
            } else {
                if (strArr.length < 3) {
                    String strValueOf2 = String.valueOf(str);
                    com.google.android.exoplayer2.util.u.m(f46698a, strValueOf2.length() != 0 ? "Ignoring malformed AVC codec string: ".concat(strValueOf2) : new String("Ignoring malformed AVC codec string: "));
                    return null;
                }
                int i12 = Integer.parseInt(strArr[1]);
                i10 = Integer.parseInt(strArr[2]);
                i11 = i12;
            }
            int i13 = i(i11);
            if (i13 == -1) {
                StringBuilder sb2 = new StringBuilder(32);
                sb2.append("Unknown AVC profile: ");
                sb2.append(i11);
                com.google.android.exoplayer2.util.u.m(f46698a, sb2.toString());
                return null;
            }
            int iG = g(i10);
            if (iG != -1) {
                return new Pair<>(Integer.valueOf(i13), Integer.valueOf(iG));
            }
            StringBuilder sb3 = new StringBuilder(30);
            sb3.append("Unknown AVC level: ");
            sb3.append(i10);
            com.google.android.exoplayer2.util.u.m(f46698a, sb3.toString());
            return null;
        } catch (NumberFormatException unused) {
            String strValueOf3 = String.valueOf(str);
            com.google.android.exoplayer2.util.u.m(f46698a, strValueOf3.length() != 0 ? "Ignoring malformed AVC codec string: ".concat(strValueOf3) : new String("Ignoring malformed AVC codec string: "));
            return null;
        }
    }

    @p0
    private static String p(MediaCodecInfo mediaCodecInfo, String str, String str2) {
        for (String str3 : mediaCodecInfo.getSupportedTypes()) {
            if (str3.equalsIgnoreCase(str2)) {
                return str3;
            }
        }
        if (str2.equals("video/dolby-vision")) {
            if ("OMX.MS.HEVCDV.Decoder".equals(str)) {
                return "video/hevcdv";
            }
            if ("OMX.RTK.video.decoder".equals(str) || "OMX.realtek.video.decoder.tunneled".equals(str)) {
                return "video/dv_hevc";
            }
            return null;
        }
        if (str2.equals(com.google.android.exoplayer2.util.y.f51561a0) && "OMX.lge.alac.decoder".equals(str)) {
            return "audio/x-lg-alac";
        }
        if (str2.equals(com.google.android.exoplayer2.util.y.Z) && "OMX.lge.flac.decoder".equals(str)) {
            return "audio/x-lg-flac";
        }
        return null;
    }

    @p0
    public static Pair<Integer, Integer> q(a2 a2Var) {
        String str = a2Var.f43590j;
        if (str == null) {
            return null;
        }
        String[] strArrSplit = str.split("\\.");
        if ("video/dolby-vision".equals(a2Var.f43593m)) {
            return w(a2Var.f43590j, strArrSplit);
        }
        byte b10 = 0;
        String str2 = strArrSplit[0];
        str2.hashCode();
        switch (str2.hashCode()) {
            case 3004662:
                if (!str2.equals(f46706i)) {
                    b10 = -1;
                }
                break;
            case 3006243:
                b10 = !str2.equals(f46701d) ? (byte) -1 : (byte) 1;
                break;
            case 3006244:
                b10 = !str2.equals(f46702e) ? (byte) -1 : (byte) 2;
                break;
            case 3199032:
                b10 = !str2.equals(f46704g) ? (byte) -1 : (byte) 3;
                break;
            case 3214780:
                b10 = !str2.equals(f46705h) ? (byte) -1 : (byte) 4;
                break;
            case 3356560:
                b10 = !str2.equals(f46707j) ? (byte) -1 : (byte) 5;
                break;
            case 3624515:
                b10 = !str2.equals(f46703f) ? (byte) -1 : (byte) 6;
                break;
            default:
                b10 = -1;
                break;
        }
        switch (b10) {
            case 0:
                return n(a2Var.f43590j, strArrSplit, a2Var.f43605y);
            case 1:
            case 2:
                return o(a2Var.f43590j, strArrSplit);
            case 3:
            case 4:
                return x(a2Var.f43590j, strArrSplit);
            case 5:
                return m(a2Var.f43590j, strArrSplit);
            case 6:
                return y(a2Var.f43590j, strArrSplit);
            default:
                return null;
        }
    }

    @p0
    public static n r(String str, boolean z10, boolean z11) throws DecoderQueryException {
        List<n> listS = s(str, z10, z11);
        if (listS.isEmpty()) {
            return null;
        }
        return listS.get(0);
    }

    public static synchronized List<n> s(String str, boolean z10, boolean z11) throws DecoderQueryException {
        b bVar = new b(str, z10, z11);
        HashMap<b, List<n>> map = f46700c;
        List<n> list = map.get(bVar);
        if (list != null) {
            return list;
        }
        int i10 = u0.f51536a;
        ArrayList<n> arrayListT = t(bVar, i10 >= 21 ? new e(z10, z11) : new d());
        if (z10 && arrayListT.isEmpty() && 21 <= i10 && i10 <= 23) {
            arrayListT = t(bVar, new d());
            if (!arrayListT.isEmpty()) {
                String str2 = arrayListT.get(0).f46797a;
                StringBuilder sb2 = new StringBuilder(String.valueOf(str).length() + 63 + String.valueOf(str2).length());
                sb2.append("MediaCodecList API didn't list secure decoder for: ");
                sb2.append(str);
                sb2.append(". Assuming: ");
                sb2.append(str2);
                com.google.android.exoplayer2.util.u.m(f46698a, sb2.toString());
            }
        }
        e(str, arrayListT);
        List<n> listUnmodifiableList = Collections.unmodifiableList(arrayListT);
        map.put(bVar, listUnmodifiableList);
        return listUnmodifiableList;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0025  */
    private static ArrayList<n> t(b bVar, c cVar) throws DecoderQueryException {
        String strP;
        String str;
        String str2;
        int i10;
        boolean z10;
        int i11;
        try {
            ArrayList<n> arrayList = new ArrayList<>();
            String str3 = bVar.f46709a;
            int iD = cVar.d();
            boolean zE = cVar.e();
            int i12 = 0;
            while (i12 < iD) {
                MediaCodecInfo mediaCodecInfoB = cVar.b(i12);
                if (A(mediaCodecInfoB)) {
                    i10 = i12;
                    z10 = zE;
                    i11 = iD;
                } else {
                    String name = mediaCodecInfoB.getName();
                    if (C(mediaCodecInfoB, name, zE, str3) && (strP = p(mediaCodecInfoB, name, str3)) != null) {
                        try {
                            MediaCodecInfo.CodecCapabilities capabilitiesForType = mediaCodecInfoB.getCapabilitiesForType(strP);
                            boolean zC = cVar.c("tunneled-playback", strP, capabilitiesForType);
                            boolean zA = cVar.a("tunneled-playback", strP, capabilitiesForType);
                            boolean z11 = bVar.f46711c;
                            if ((z11 || !zA) && (!z11 || zC)) {
                                boolean zC2 = cVar.c("secure-playback", strP, capabilitiesForType);
                                boolean zA2 = cVar.a("secure-playback", strP, capabilitiesForType);
                                boolean z12 = bVar.f46710b;
                                if ((z12 || !zA2) && (!z12 || zC2)) {
                                    boolean zD = D(mediaCodecInfoB);
                                    boolean zF = F(mediaCodecInfoB);
                                    boolean zH = H(mediaCodecInfoB);
                                    if (!(zE && bVar.f46710b == zC2) && (zE || bVar.f46710b)) {
                                        str = strP;
                                        str2 = name;
                                        i10 = i12;
                                        z10 = zE;
                                        i11 = iD;
                                        if (!z10 && zC2) {
                                            arrayList.add(n.D(String.valueOf(str2).concat(".secure"), str3, str, capabilitiesForType, zD, zF, zH, false, true));
                                            return arrayList;
                                        }
                                    } else {
                                        str = strP;
                                        str2 = name;
                                        i10 = i12;
                                        z10 = zE;
                                        i11 = iD;
                                        try {
                                            arrayList.add(n.D(name, str3, strP, capabilitiesForType, zD, zF, zH, false, false));
                                        } catch (Exception e10) {
                                            e = e10;
                                            if (u0.f51536a > 23 || arrayList.isEmpty()) {
                                                String str4 = str2;
                                                StringBuilder sb2 = new StringBuilder(String.valueOf(str4).length() + 25 + str.length());
                                                sb2.append("Failed to query codec ");
                                                sb2.append(str4);
                                                sb2.append(" (");
                                                sb2.append(str);
                                                sb2.append(")");
                                                com.google.android.exoplayer2.util.u.d(f46698a, sb2.toString());
                                                throw e;
                                            }
                                            StringBuilder sb3 = new StringBuilder(String.valueOf(str2).length() + 46);
                                            sb3.append("Skipping codec ");
                                            sb3.append(str2);
                                            sb3.append(" (failed to query capabilities)");
                                            com.google.android.exoplayer2.util.u.d(f46698a, sb3.toString());
                                        }
                                    }
                                } else {
                                    i10 = i12;
                                    z10 = zE;
                                    i11 = iD;
                                }
                            } else {
                                i10 = i12;
                                z10 = zE;
                                i11 = iD;
                            }
                        } catch (Exception e11) {
                            e = e11;
                            str = strP;
                            str2 = name;
                            i10 = i12;
                            z10 = zE;
                            i11 = iD;
                        }
                    } else {
                        i10 = i12;
                        z10 = zE;
                        i11 = iD;
                    }
                }
                i12 = i10 + 1;
                iD = i11;
                zE = z10;
            }
            return arrayList;
        } catch (Exception e12) {
            throw new DecoderQueryException(e12);
        }
    }

    @androidx.annotation.j
    public static List<n> u(List<n> list, final a2 a2Var) {
        ArrayList arrayList = new ArrayList(list);
        P(arrayList, new f() { // from class: com.google.android.exoplayer2.mediacodec.w
            @Override // com.google.android.exoplayer2.mediacodec.MediaCodecUtil.f
            public final int a(Object obj) {
                return MediaCodecUtil.L(a2Var, (n) obj);
            }
        });
        return arrayList;
    }

    @p0
    public static n v() throws DecoderQueryException {
        return r(com.google.android.exoplayer2.util.y.I, false, false);
    }

    @p0
    private static Pair<Integer, Integer> w(String str, String[] strArr) {
        if (strArr.length < 3) {
            String strValueOf = String.valueOf(str);
            com.google.android.exoplayer2.util.u.m(f46698a, strValueOf.length() != 0 ? "Ignoring malformed Dolby Vision codec string: ".concat(strValueOf) : new String("Ignoring malformed Dolby Vision codec string: "));
            return null;
        }
        Matcher matcher = f46699b.matcher(strArr[1]);
        if (!matcher.matches()) {
            String strValueOf2 = String.valueOf(str);
            com.google.android.exoplayer2.util.u.m(f46698a, strValueOf2.length() != 0 ? "Ignoring malformed Dolby Vision codec string: ".concat(strValueOf2) : new String("Ignoring malformed Dolby Vision codec string: "));
            return null;
        }
        String strGroup = matcher.group(1);
        Integer numL = l(strGroup);
        if (numL == null) {
            String strValueOf3 = String.valueOf(strGroup);
            com.google.android.exoplayer2.util.u.m(f46698a, strValueOf3.length() != 0 ? "Unknown Dolby Vision profile string: ".concat(strValueOf3) : new String("Unknown Dolby Vision profile string: "));
            return null;
        }
        String str2 = strArr[2];
        Integer numK = k(str2);
        if (numK != null) {
            return new Pair<>(numL, numK);
        }
        String strValueOf4 = String.valueOf(str2);
        com.google.android.exoplayer2.util.u.m(f46698a, strValueOf4.length() != 0 ? "Unknown Dolby Vision level string: ".concat(strValueOf4) : new String("Unknown Dolby Vision level string: "));
        return null;
    }

    @p0
    private static Pair<Integer, Integer> x(String str, String[] strArr) {
        if (strArr.length < 4) {
            String strValueOf = String.valueOf(str);
            com.google.android.exoplayer2.util.u.m(f46698a, strValueOf.length() != 0 ? "Ignoring malformed HEVC codec string: ".concat(strValueOf) : new String("Ignoring malformed HEVC codec string: "));
            return null;
        }
        int i10 = 1;
        Matcher matcher = f46699b.matcher(strArr[1]);
        if (!matcher.matches()) {
            String strValueOf2 = String.valueOf(str);
            com.google.android.exoplayer2.util.u.m(f46698a, strValueOf2.length() != 0 ? "Ignoring malformed HEVC codec string: ".concat(strValueOf2) : new String("Ignoring malformed HEVC codec string: "));
            return null;
        }
        String strGroup = matcher.group(1);
        if (!"1".equals(strGroup)) {
            if (!"2".equals(strGroup)) {
                String strValueOf3 = String.valueOf(strGroup);
                com.google.android.exoplayer2.util.u.m(f46698a, strValueOf3.length() != 0 ? "Unknown HEVC profile string: ".concat(strValueOf3) : new String("Unknown HEVC profile string: "));
                return null;
            }
            i10 = 2;
        }
        String str2 = strArr[3];
        Integer numZ = z(str2);
        if (numZ != null) {
            return new Pair<>(Integer.valueOf(i10), numZ);
        }
        String strValueOf4 = String.valueOf(str2);
        com.google.android.exoplayer2.util.u.m(f46698a, strValueOf4.length() != 0 ? "Unknown HEVC level string: ".concat(strValueOf4) : new String("Unknown HEVC level string: "));
        return null;
    }

    @p0
    private static Pair<Integer, Integer> y(String str, String[] strArr) {
        if (strArr.length < 3) {
            String strValueOf = String.valueOf(str);
            com.google.android.exoplayer2.util.u.m(f46698a, strValueOf.length() != 0 ? "Ignoring malformed VP9 codec string: ".concat(strValueOf) : new String("Ignoring malformed VP9 codec string: "));
            return null;
        }
        try {
            int i10 = Integer.parseInt(strArr[1]);
            int i11 = Integer.parseInt(strArr[2]);
            int iR = R(i10);
            if (iR == -1) {
                StringBuilder sb2 = new StringBuilder(32);
                sb2.append("Unknown VP9 profile: ");
                sb2.append(i10);
                com.google.android.exoplayer2.util.u.m(f46698a, sb2.toString());
                return null;
            }
            int iQ = Q(i11);
            if (iQ != -1) {
                return new Pair<>(Integer.valueOf(iR), Integer.valueOf(iQ));
            }
            StringBuilder sb3 = new StringBuilder(30);
            sb3.append("Unknown VP9 level: ");
            sb3.append(i11);
            com.google.android.exoplayer2.util.u.m(f46698a, sb3.toString());
            return null;
        } catch (NumberFormatException unused) {
            String strValueOf2 = String.valueOf(str);
            com.google.android.exoplayer2.util.u.m(f46698a, strValueOf2.length() != 0 ? "Ignoring malformed VP9 codec string: ".concat(strValueOf2) : new String("Ignoring malformed VP9 codec string: "));
            return null;
        }
    }

    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    @p0
    private static Integer z(@p0 String str) {
        if (str == null) {
            return null;
        }
        byte b10 = -1;
        switch (str.hashCode()) {
            case 70821:
                if (str.equals("H30")) {
                    b10 = 0;
                }
                break;
            case 70914:
                if (str.equals("H60")) {
                    b10 = 1;
                }
                break;
            case 70917:
                if (str.equals("H63")) {
                    b10 = 2;
                }
                break;
            case 71007:
                if (str.equals("H90")) {
                    b10 = 3;
                }
                break;
            case 71010:
                if (str.equals("H93")) {
                    b10 = 4;
                }
                break;
            case 74665:
                if (str.equals("L30")) {
                    b10 = 5;
                }
                break;
            case 74758:
                if (str.equals("L60")) {
                    b10 = 6;
                }
                break;
            case 74761:
                if (str.equals("L63")) {
                    b10 = 7;
                }
                break;
            case 74851:
                if (str.equals("L90")) {
                    b10 = 8;
                }
                break;
            case 74854:
                if (str.equals("L93")) {
                    b10 = 9;
                }
                break;
            case 2193639:
                if (str.equals("H120")) {
                    b10 = 10;
                }
                break;
            case 2193642:
                if (str.equals("H123")) {
                    b10 = 11;
                }
                break;
            case 2193732:
                if (str.equals("H150")) {
                    b10 = 12;
                }
                break;
            case 2193735:
                if (str.equals("H153")) {
                    b10 = 13;
                }
                break;
            case 2193738:
                if (str.equals("H156")) {
                    b10 = 14;
                }
                break;
            case 2193825:
                if (str.equals("H180")) {
                    b10 = 15;
                }
                break;
            case 2193828:
                if (str.equals("H183")) {
                    b10 = 16;
                }
                break;
            case 2193831:
                if (str.equals("H186")) {
                    b10 = 17;
                }
                break;
            case 2312803:
                if (str.equals("L120")) {
                    b10 = com.google.common.base.a.f56668u;
                }
                break;
            case 2312806:
                if (str.equals("L123")) {
                    b10 = 19;
                }
                break;
            case 2312896:
                if (str.equals("L150")) {
                    b10 = com.google.common.base.a.f56671x;
                }
                break;
            case 2312899:
                if (str.equals("L153")) {
                    b10 = com.google.common.base.a.f56672y;
                }
                break;
            case 2312902:
                if (str.equals("L156")) {
                    b10 = com.google.common.base.a.f56673z;
                }
                break;
            case 2312989:
                if (str.equals("L180")) {
                    b10 = com.google.common.base.a.A;
                }
                break;
            case 2312992:
                if (str.equals("L183")) {
                    b10 = com.google.common.base.a.B;
                }
                break;
            case 2312995:
                if (str.equals("L186")) {
                    b10 = com.google.common.base.a.C;
                }
                break;
        }
        switch (b10) {
            case 0:
                return 2;
            case 1:
                return 8;
            case 2:
                return 32;
            case 3:
                return 128;
            case 4:
                return 512;
            case 5:
                return 1;
            case 6:
                return 4;
            case 7:
                return 16;
            case 8:
                return 64;
            case 9:
                return 256;
            case 10:
                return 2048;
            case 11:
                return 8192;
            case 12:
                return 32768;
            case 13:
                return 131072;
            case 14:
                return 524288;
            case 15:
                return 2097152;
            case 16:
                return 8388608;
            case 17:
                return 33554432;
            case 18:
                return 1024;
            case 19:
                return 4096;
            case 20:
                return 16384;
            case 21:
                return 65536;
            case 22:
                return 262144;
            case 23:
                return 1048576;
            case 24:
                return 4194304;
            case 25:
                return 16777216;
            default:
                return null;
        }
    }
}
