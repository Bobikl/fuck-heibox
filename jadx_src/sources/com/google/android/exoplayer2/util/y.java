package com.google.android.exoplayer2.util;

import android.text.TextUtils;
import androidx.annotation.j1;
import com.xiaomi.mipush.sdk.Constants;
import java.util.ArrayList;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/* JADX INFO: compiled from: MimeTypes.java */
/* JADX INFO: loaded from: classes7.dex */
public final class y {
    public static final String A = "audio/mp4a-latm";
    public static final String A0 = "application/x-scte35";
    public static final String B = "audio/x-matroska";
    public static final String B0 = "application/x-camera-motion";
    public static final String C = "audio/webm";
    public static final String C0 = "application/x-emsg";
    public static final String D = "audio/mpeg";
    public static final String D0 = "application/dvbsubs";
    public static final String E = "audio/mpeg-L1";
    public static final String E0 = "application/x-exif";
    public static final String F = "audio/mpeg-L2";
    public static final String F0 = "application/x-icy";
    public static final String G = "audio/mha1";
    public static final String G0 = "application/vnd.dvb.ait";
    public static final String H = "audio/mhm1";
    public static final String H0 = "application/x-rtsp";
    public static final String I = "audio/raw";
    public static final String I0 = "image/jpeg";
    public static final String J = "audio/g711-alaw";
    public static final String J0 = "ec+3";
    public static final String K = "audio/g711-mlaw";
    public static final String L = "audio/ac3";
    public static final String M = "audio/eac3";
    public static final String N = "audio/eac3-joc";
    public static final String O = "audio/ac4";
    public static final String P = "audio/true-hd";
    public static final String Q = "audio/vnd.dts";
    public static final String R = "audio/vnd.dts.hd";
    public static final String S = "audio/vnd.dts.hd;profile=lbr";
    public static final String T = "audio/vnd.dts.uhd;profile=p2";
    public static final String U = "audio/vorbis";
    public static final String V = "audio/opus";
    public static final String W = "audio/amr";
    public static final String X = "audio/3gpp";
    public static final String Y = "audio/amr-wb";
    public static final String Z = "audio/flac";

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final String f51560a = "video";

    /* JADX INFO: renamed from: a0, reason: collision with root package name */
    public static final String f51561a0 = "audio/alac";

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final String f51562b = "audio";

    /* JADX INFO: renamed from: b0, reason: collision with root package name */
    public static final String f51563b0 = "audio/gsm";

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final String f51564c = "text";

    /* JADX INFO: renamed from: c0, reason: collision with root package name */
    public static final String f51565c0 = "audio/ogg";

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final String f51566d = "image";

    /* JADX INFO: renamed from: d0, reason: collision with root package name */
    public static final String f51567d0 = "audio/wav";

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final String f51568e = "application";

    /* JADX INFO: renamed from: e0, reason: collision with root package name */
    public static final String f51569e0 = "audio/x-unknown";

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final String f51570f = "video/mp4";

    /* JADX INFO: renamed from: f0, reason: collision with root package name */
    public static final String f51571f0 = "text/vtt";

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static final String f51572g = "video/x-matroska";

    /* JADX INFO: renamed from: g0, reason: collision with root package name */
    public static final String f51573g0 = "text/x-ssa";

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public static final String f51574h = "video/webm";

    /* JADX INFO: renamed from: h0, reason: collision with root package name */
    public static final String f51575h0 = "text/x-exoplayer-cues";

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public static final String f51576i = "video/3gpp";

    /* JADX INFO: renamed from: i0, reason: collision with root package name */
    public static final String f51577i0 = "text/x-unknown";

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public static final String f51578j = "video/avc";

    /* JADX INFO: renamed from: j0, reason: collision with root package name */
    public static final String f51579j0 = "application/mp4";

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public static final String f51580k = "video/hevc";

    /* JADX INFO: renamed from: k0, reason: collision with root package name */
    public static final String f51581k0 = "application/webm";

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public static final String f51582l = "video/x-vnd.on2.vp8";

    /* JADX INFO: renamed from: l0, reason: collision with root package name */
    public static final String f51583l0 = "application/x-matroska";

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public static final String f51584m = "video/x-vnd.on2.vp9";

    /* JADX INFO: renamed from: m0, reason: collision with root package name */
    public static final String f51585m0 = "application/dash+xml";

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public static final String f51586n = "video/av01";

    /* JADX INFO: renamed from: n0, reason: collision with root package name */
    public static final String f51587n0 = "application/x-mpegURL";

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public static final String f51588o = "video/mp2t";

    /* JADX INFO: renamed from: o0, reason: collision with root package name */
    public static final String f51589o0 = "application/vnd.ms-sstr+xml";

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public static final String f51590p = "video/mp4v-es";

    /* JADX INFO: renamed from: p0, reason: collision with root package name */
    public static final String f51591p0 = "application/id3";

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public static final String f51592q = "video/mpeg";

    /* JADX INFO: renamed from: q0, reason: collision with root package name */
    public static final String f51593q0 = "application/cea-608";

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public static final String f51594r = "video/mp2p";

    /* JADX INFO: renamed from: r0, reason: collision with root package name */
    public static final String f51595r0 = "application/cea-708";

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public static final String f51596s = "video/mpeg2";

    /* JADX INFO: renamed from: s0, reason: collision with root package name */
    public static final String f51597s0 = "application/x-subrip";

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public static final String f51598t = "video/wvc1";

    /* JADX INFO: renamed from: t0, reason: collision with root package name */
    public static final String f51599t0 = "application/ttml+xml";

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public static final String f51600u = "video/divx";

    /* JADX INFO: renamed from: u0, reason: collision with root package name */
    public static final String f51601u0 = "application/x-quicktime-tx3g";

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public static final String f51602v = "video/x-flv";

    /* JADX INFO: renamed from: v0, reason: collision with root package name */
    public static final String f51603v0 = "application/x-mp4-vtt";

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public static final String f51604w = "video/dolby-vision";

    /* JADX INFO: renamed from: w0, reason: collision with root package name */
    public static final String f51605w0 = "application/x-mp4-cea-608";

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public static final String f51606x = "video/ogg";

    /* JADX INFO: renamed from: x0, reason: collision with root package name */
    public static final String f51607x0 = "application/x-rawcc";

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public static final String f51608y = "video/x-unknown";

    /* JADX INFO: renamed from: y0, reason: collision with root package name */
    public static final String f51609y0 = "application/vobsub";

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    public static final String f51610z = "audio/mp4";

    /* JADX INFO: renamed from: z0, reason: collision with root package name */
    public static final String f51611z0 = "application/pgs";
    private static final ArrayList<a> K0 = new ArrayList<>();
    private static final Pattern L0 = Pattern.compile("^mp4a\\.([a-zA-Z0-9]{2})(?:\\.([0-9]{1,2}))?$");

    /* JADX INFO: compiled from: MimeTypes.java */
    public static final class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final String f51612a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final String f51613b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final int f51614c;

        public a(String str, String str2, int i10) {
            this.f51612a = str;
            this.f51613b = str2;
            this.f51614c = i10;
        }
    }

    /* JADX INFO: compiled from: MimeTypes.java */
    @j1
    public static final class b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final int f51615a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final int f51616b;

        public b(int i10, int i11) {
            this.f51615a = i10;
            this.f51616b = i11;
        }

        public int a() {
            int i10 = this.f51616b;
            if (i10 == 2) {
                return 10;
            }
            if (i10 == 5) {
                return 11;
            }
            if (i10 == 29) {
                return 12;
            }
            if (i10 == 42) {
                return 16;
            }
            if (i10 != 22) {
                return i10 != 23 ? 0 : 15;
            }
            return 1073741824;
        }
    }

    private y() {
    }

    public static boolean a(@androidx.annotation.p0 String str, @androidx.annotation.p0 String str2) {
        b bVarI;
        int iA;
        if (str == null) {
            return false;
        }
        switch (str) {
            case "audio/eac3-joc":
            case "audio/mpeg-L1":
            case "audio/mpeg-L2":
            case "audio/ac3":
            case "audio/raw":
            case "audio/eac3":
            case "audio/flac":
            case "audio/mpeg":
            case "audio/g711-alaw":
            case "audio/g711-mlaw":
                return true;
            case "audio/mp4a-latm":
                return (str2 == null || (bVarI = i(str2)) == null || (iA = bVarI.a()) == 0 || iA == 16) ? false : true;
            default:
                return false;
        }
    }

    public static boolean b(@androidx.annotation.p0 String str, String str2) {
        return d(str, str2) != null;
    }

    @androidx.annotation.p0
    public static String c(@androidx.annotation.p0 String str) {
        if (str == null) {
            return null;
        }
        for (String str2 : u0.r1(str)) {
            String strG = g(str2);
            if (strG != null && p(strG)) {
                return strG;
            }
        }
        return null;
    }

    @androidx.annotation.p0
    public static String d(@androidx.annotation.p0 String str, @androidx.annotation.p0 String str2) {
        if (str == null || str2 == null) {
            return null;
        }
        String[] strArrR1 = u0.r1(str);
        StringBuilder sb2 = new StringBuilder();
        for (String str3 : strArrR1) {
            if (str2.equals(g(str3))) {
                if (sb2.length() > 0) {
                    sb2.append(Constants.ACCEPT_TIME_SEPARATOR_SP);
                }
                sb2.append(str3);
            }
        }
        if (sb2.length() > 0) {
            return sb2.toString();
        }
        return null;
    }

    @androidx.annotation.p0
    private static String e(String str) {
        int size = K0.size();
        for (int i10 = 0; i10 < size; i10++) {
            a aVar = K0.get(i10);
            if (str.startsWith(aVar.f51613b)) {
                return aVar.f51612a;
            }
        }
        return null;
    }

    public static int f(String str, @androidx.annotation.p0 String str2) {
        b bVarI;
        str.hashCode();
        switch (str) {
            case "audio/eac3-joc":
                return 18;
            case "audio/vnd.dts":
                return 7;
            case "audio/mp4a-latm":
                if (str2 == null || (bVarI = i(str2)) == null) {
                    return 0;
                }
                return bVarI.a();
            case "audio/ac3":
                return 5;
            case "audio/ac4":
                return 17;
            case "audio/eac3":
                return 6;
            case "audio/mpeg":
                return 9;
            case "audio/vnd.dts.hd":
                return 8;
            case "audio/true-hd":
                return 14;
            default:
                return 0;
        }
    }

    @androidx.annotation.p0
    public static String g(@androidx.annotation.p0 String str) {
        b bVarI;
        String strH = null;
        if (str == null) {
            return null;
        }
        String strG = com.google.common.base.a.g(str.trim());
        if (strG.startsWith("avc1") || strG.startsWith("avc3")) {
            return "video/avc";
        }
        if (strG.startsWith("hev1") || strG.startsWith("hvc1")) {
            return "video/hevc";
        }
        if (strG.startsWith("dvav") || strG.startsWith("dva1") || strG.startsWith("dvhe") || strG.startsWith("dvh1")) {
            return "video/dolby-vision";
        }
        if (strG.startsWith("av01")) {
            return "video/av01";
        }
        if (strG.startsWith("vp9") || strG.startsWith("vp09")) {
            return "video/x-vnd.on2.vp9";
        }
        if (strG.startsWith("vp8") || strG.startsWith("vp08")) {
            return "video/x-vnd.on2.vp8";
        }
        if (strG.startsWith("mp4a")) {
            if (strG.startsWith("mp4a.") && (bVarI = i(strG)) != null) {
                strH = h(bVarI.f51615a);
            }
            return strH == null ? A : strH;
        }
        if (strG.startsWith("mha1")) {
            return G;
        }
        if (strG.startsWith("mhm1")) {
            return H;
        }
        if (strG.startsWith("ac-3") || strG.startsWith("dac3")) {
            return L;
        }
        if (strG.startsWith("ec-3") || strG.startsWith("dec3")) {
            return M;
        }
        if (strG.startsWith(J0)) {
            return N;
        }
        if (strG.startsWith("ac-4") || strG.startsWith("dac4")) {
            return O;
        }
        if (strG.startsWith("dtsc")) {
            return Q;
        }
        if (strG.startsWith("dtse")) {
            return S;
        }
        if (strG.startsWith("dtsh") || strG.startsWith("dtsl")) {
            return R;
        }
        if (strG.startsWith("dtsx")) {
            return T;
        }
        if (strG.startsWith("opus")) {
            return V;
        }
        if (strG.startsWith("vorbis")) {
            return U;
        }
        if (strG.startsWith("flac")) {
            return Z;
        }
        if (strG.startsWith("stpp")) {
            return f51599t0;
        }
        if (strG.startsWith("wvtt")) {
            return "text/vtt";
        }
        if (strG.contains("cea708")) {
            return f51595r0;
        }
        return (strG.contains("eia608") || strG.contains("cea608")) ? f51593q0 : e(strG);
    }

    @androidx.annotation.p0
    public static String h(int i10) {
        if (i10 == 32) {
            return f51590p;
        }
        if (i10 == 33) {
            return "video/avc";
        }
        if (i10 == 35) {
            return "video/hevc";
        }
        if (i10 == 64) {
            return A;
        }
        if (i10 == 163) {
            return f51598t;
        }
        if (i10 == 177) {
            return "video/x-vnd.on2.vp9";
        }
        if (i10 == 165) {
            return L;
        }
        if (i10 == 166) {
            return M;
        }
        switch (i10) {
            case 96:
            case 97:
            case 98:
            case 99:
            case 100:
            case 101:
                return f51596s;
            case 102:
            case 103:
            case 104:
                return A;
            case 105:
            case 107:
                return "audio/mpeg";
            case 106:
                return f51592q;
            default:
                switch (i10) {
                    case 169:
                    case 172:
                        return Q;
                    case bb.c.b.f30828o0 /* 170 */:
                    case bb.c.b.f30851p0 /* 171 */:
                        return R;
                    case bb.c.b.f30896r0 /* 173 */:
                        return V;
                    case bb.c.b.f30918s0 /* 174 */:
                        return O;
                    default:
                        return null;
                }
        }
    }

    @j1
    @androidx.annotation.p0
    static b i(String str) {
        Matcher matcher = L0.matcher(str);
        if (!matcher.matches()) {
            return null;
        }
        String str2 = (String) com.google.android.exoplayer2.util.a.g(matcher.group(1));
        String strGroup = matcher.group(2);
        try {
            return new b(Integer.parseInt(str2, 16), strGroup != null ? Integer.parseInt(strGroup) : 0);
        } catch (NumberFormatException unused) {
            return null;
        }
    }

    @androidx.annotation.p0
    public static String j(@androidx.annotation.p0 String str) {
        if (str == null) {
            return null;
        }
        for (String str2 : u0.r1(str)) {
            String strG = g(str2);
            if (strG != null && s(strG)) {
                return strG;
            }
        }
        return null;
    }

    @androidx.annotation.p0
    private static String k(@androidx.annotation.p0 String str) {
        int iIndexOf;
        if (str == null || (iIndexOf = str.indexOf(47)) == -1) {
            return null;
        }
        return str.substring(0, iIndexOf);
    }

    public static int l(@androidx.annotation.p0 String str) {
        if (TextUtils.isEmpty(str)) {
            return -1;
        }
        if (p(str)) {
            return 1;
        }
        if (t(str)) {
            return 2;
        }
        if (s(str)) {
            return 3;
        }
        if (q(str)) {
            return 4;
        }
        if (f51591p0.equals(str) || C0.equals(str) || A0.equals(str)) {
            return 5;
        }
        if (B0.equals(str)) {
            return 6;
        }
        return m(str);
    }

    private static int m(String str) {
        int size = K0.size();
        for (int i10 = 0; i10 < size; i10++) {
            a aVar = K0.get(i10);
            if (str.equals(aVar.f51612a)) {
                return aVar.f51614c;
            }
        }
        return -1;
    }

    public static int n(String str) {
        return l(g(str));
    }

    @androidx.annotation.p0
    public static String o(@androidx.annotation.p0 String str) {
        if (str == null) {
            return null;
        }
        for (String str2 : u0.r1(str)) {
            String strG = g(str2);
            if (strG != null && t(strG)) {
                return strG;
            }
        }
        return null;
    }

    public static boolean p(@androidx.annotation.p0 String str) {
        return "audio".equals(k(str));
    }

    public static boolean q(@androidx.annotation.p0 String str) {
        return "image".equals(k(str));
    }

    public static boolean r(@androidx.annotation.p0 String str) {
        if (str == null) {
            return false;
        }
        return str.startsWith(f51574h) || str.startsWith(C) || str.startsWith(f51581k0) || str.startsWith(f51572g) || str.startsWith(B) || str.startsWith(f51583l0);
    }

    public static boolean s(@androidx.annotation.p0 String str) {
        return "text".equals(k(str)) || f51593q0.equals(str) || f51595r0.equals(str) || f51605w0.equals(str) || f51597s0.equals(str) || f51599t0.equals(str) || f51601u0.equals(str) || f51603v0.equals(str) || f51607x0.equals(str) || f51609y0.equals(str) || f51611z0.equals(str) || D0.equals(str);
    }

    public static boolean t(@androidx.annotation.p0 String str) {
        return "video".equals(k(str));
    }

    public static String u(String str) {
        str.hashCode();
        switch (str) {
            case "audio/x-flac":
                return Z;
            case "audio/x-wav":
                return f51567d0;
            case "audio/mp3":
                return "audio/mpeg";
            default:
                return str;
        }
    }

    public static void v(String str, String str2, int i10) {
        a aVar = new a(str, str2, i10);
        int size = K0.size();
        for (int i11 = 0; i11 < size; i11++) {
            ArrayList<a> arrayList = K0;
            if (str.equals(arrayList.get(i11).f51612a)) {
                arrayList.remove(i11);
                break;
            }
        }
        K0.add(aVar);
    }
}
