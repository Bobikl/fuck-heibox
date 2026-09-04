package com.google.android.exoplayer2.source.hls.playlist;

import android.net.Uri;
import android.text.TextUtils;
import android.util.Base64;
import androidx.annotation.p0;
import com.google.android.exoplayer2.ParserException;
import com.google.android.exoplayer2.a2;
import com.google.android.exoplayer2.drm.DrmInitData;
import com.google.android.exoplayer2.extractor.mp4.l;
import com.google.android.exoplayer2.metadata.Metadata;
import com.google.android.exoplayer2.source.hls.HlsTrackMetadataEntry;
import com.google.android.exoplayer2.upstream.i0;
import com.google.android.exoplayer2.util.q0;
import com.google.android.exoplayer2.util.u;
import com.google.android.exoplayer2.util.u0;
import com.google.android.exoplayer2.util.y;
import com.google.common.collect.l1;
import com.xiaomi.mipush.sdk.Constants;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.math.BigDecimal;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.NoSuchElementException;
import java.util.Queue;
import java.util.TreeMap;
import java.util.UUID;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/* JADX INFO: loaded from: classes7.dex */
public final class HlsPlaylistParser implements i0.a<h> {
    private static final String A = "#EXT-X-KEY";
    private static final String B = "#EXT-X-SESSION-KEY";
    private static final String C = "#EXT-X-BYTERANGE";
    private static final String D = "#EXT-X-GAP";
    private static final String E = "#EXT-X-SKIP";
    private static final String F = "#EXT-X-PRELOAD-HINT";
    private static final String G = "#EXT-X-RENDITION-REPORT";
    private static final String H = "AUDIO";
    private static final String I = "VIDEO";
    private static final String J = "SUBTITLES";
    private static final String K = "CLOSED-CAPTIONS";
    private static final String L = "PART";
    private static final String M = "MAP";
    private static final String N = "NONE";
    private static final String O = "AES-128";
    private static final String P = "SAMPLE-AES";
    private static final String Q = "SAMPLE-AES-CENC";
    private static final String R = "SAMPLE-AES-CTR";
    private static final String S = "com.microsoft.playready";
    private static final String T = "identity";
    private static final String U = "urn:uuid:edef8ba9-79d6-4ace-a3c8-27dcd51d21ed";
    private static final String V = "com.widevine";
    private static final String W = "YES";
    private static final String X = "NO";
    private static final String Y = "CLOSED-CAPTIONS=NONE";

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private static final String f48200d = "HlsPlaylistParser";

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private static final String f48202e = "#EXTM3U";

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private static final String f48204f = "#EXT";

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private static final String f48206g = "#EXT-X-VERSION";

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private static final String f48208h = "#EXT-X-PLAYLIST-TYPE";

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private static final String f48210i = "#EXT-X-DEFINE";

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private static final String f48212j = "#EXT-X-SERVER-CONTROL";

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private static final String f48214k = "#EXT-X-STREAM-INF";

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private static final String f48216l = "#EXT-X-PART-INF";

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private static final String f48218m = "#EXT-X-PART";

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private static final String f48220n = "#EXT-X-I-FRAME-STREAM-INF";

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    private static final String f48222o = "#EXT-X-I-FRAMES-ONLY";

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    private static final String f48224p = "#EXT-X-MEDIA";

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    private static final String f48229q = "#EXT-X-TARGETDURATION";

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    private static final String f48231r = "#EXT-X-DISCONTINUITY";

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    private static final String f48233s = "#EXT-X-DISCONTINUITY-SEQUENCE";

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    private static final String f48235t = "#EXT-X-PROGRAM-DATE-TIME";

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    private static final String f48237u = "#EXT-X-MAP";

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    private static final String f48239v = "#EXT-X-INDEPENDENT-SEGMENTS";

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    private static final String f48241w = "#EXTINF";

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    private static final String f48242x = "#EXT-X-MEDIA-SEQUENCE";

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    private static final String f48245y = "#EXT-X-START";

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    private static final String f48248z = "#EXT-X-ENDLIST";

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final f f48249b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @p0
    private final g f48250c;
    private static final Pattern Z = Pattern.compile("AVERAGE-BANDWIDTH=(\\d+)\\b");

    /* JADX INFO: renamed from: a0, reason: collision with root package name */
    private static final Pattern f48194a0 = Pattern.compile("VIDEO=\"(.+?)\"");

    /* JADX INFO: renamed from: b0, reason: collision with root package name */
    private static final Pattern f48196b0 = Pattern.compile("AUDIO=\"(.+?)\"");

    /* JADX INFO: renamed from: c0, reason: collision with root package name */
    private static final Pattern f48198c0 = Pattern.compile("SUBTITLES=\"(.+?)\"");

    /* JADX INFO: renamed from: p1, reason: collision with root package name */
    private static final Pattern f48225p1 = Pattern.compile("CLOSED-CAPTIONS=\"(.+?)\"");

    /* JADX INFO: renamed from: x1, reason: collision with root package name */
    private static final Pattern f48243x1 = Pattern.compile("[^-]BANDWIDTH=(\\d+)\\b");

    /* JADX INFO: renamed from: y1, reason: collision with root package name */
    private static final Pattern f48246y1 = Pattern.compile("CHANNELS=\"(.+?)\"");

    /* JADX INFO: renamed from: p2, reason: collision with root package name */
    private static final Pattern f48226p2 = Pattern.compile("CODECS=\"(.+?)\"");

    /* JADX INFO: renamed from: x2, reason: collision with root package name */
    private static final Pattern f48244x2 = Pattern.compile("RESOLUTION=(\\d+x\\d+)");

    /* JADX INFO: renamed from: y2, reason: collision with root package name */
    private static final Pattern f48247y2 = Pattern.compile("FRAME-RATE=([\\d\\.]+)\\b");
    private static final Pattern G2 = Pattern.compile("#EXT-X-TARGETDURATION:(\\d+)\\b");

    /* JADX INFO: renamed from: p3, reason: collision with root package name */
    private static final Pattern f48227p3 = Pattern.compile("DURATION=([\\d\\.]+)\\b");
    private static final Pattern G3 = Pattern.compile("PART-TARGET=([\\d\\.]+)\\b");
    private static final Pattern J3 = Pattern.compile("#EXT-X-VERSION:(\\d+)\\b");
    private static final Pattern K3 = Pattern.compile("#EXT-X-PLAYLIST-TYPE:(.+)\\b");
    private static final Pattern L3 = Pattern.compile("CAN-SKIP-UNTIL=([\\d\\.]+)\\b");
    private static final Pattern M3 = c("CAN-SKIP-DATERANGES");
    private static final Pattern N3 = Pattern.compile("SKIPPED-SEGMENTS=(\\d+)\\b");
    private static final Pattern O3 = Pattern.compile("[:|,]HOLD-BACK=([\\d\\.]+)\\b");
    private static final Pattern P3 = Pattern.compile("PART-HOLD-BACK=([\\d\\.]+)\\b");
    private static final Pattern Q3 = c("CAN-BLOCK-RELOAD");
    private static final Pattern R3 = Pattern.compile("#EXT-X-MEDIA-SEQUENCE:(\\d+)\\b");
    private static final Pattern S3 = Pattern.compile("#EXTINF:([\\d\\.]+)\\b");
    private static final Pattern T3 = Pattern.compile("#EXTINF:[\\d\\.]+\\b,(.+)");
    private static final Pattern U3 = Pattern.compile("LAST-MSN=(\\d+)\\b");
    private static final Pattern V3 = Pattern.compile("LAST-PART=(\\d+)\\b");
    private static final Pattern W3 = Pattern.compile("TIME-OFFSET=(-?[\\d\\.]+)\\b");
    private static final Pattern X3 = Pattern.compile("#EXT-X-BYTERANGE:(\\d+(?:@\\d+)?)\\b");
    private static final Pattern Y3 = Pattern.compile("BYTERANGE=\"(\\d+(?:@\\d+)?)\\b\"");
    private static final Pattern Z3 = Pattern.compile("BYTERANGE-START=(\\d+)\\b");

    /* JADX INFO: renamed from: a4, reason: collision with root package name */
    private static final Pattern f48195a4 = Pattern.compile("BYTERANGE-LENGTH=(\\d+)\\b");

    /* JADX INFO: renamed from: b4, reason: collision with root package name */
    private static final Pattern f48197b4 = Pattern.compile("METHOD=(NONE|AES-128|SAMPLE-AES|SAMPLE-AES-CENC|SAMPLE-AES-CTR)\\s*(?:,|$)");

    /* JADX INFO: renamed from: c4, reason: collision with root package name */
    private static final Pattern f48199c4 = Pattern.compile("KEYFORMAT=\"(.+?)\"");

    /* JADX INFO: renamed from: d4, reason: collision with root package name */
    private static final Pattern f48201d4 = Pattern.compile("KEYFORMATVERSIONS=\"(.+?)\"");

    /* JADX INFO: renamed from: e4, reason: collision with root package name */
    private static final Pattern f48203e4 = Pattern.compile("URI=\"(.+?)\"");

    /* JADX INFO: renamed from: f4, reason: collision with root package name */
    private static final Pattern f48205f4 = Pattern.compile("IV=([^,.*]+)");

    /* JADX INFO: renamed from: g4, reason: collision with root package name */
    private static final Pattern f48207g4 = Pattern.compile("TYPE=(AUDIO|VIDEO|SUBTITLES|CLOSED-CAPTIONS)");

    /* JADX INFO: renamed from: h4, reason: collision with root package name */
    private static final Pattern f48209h4 = Pattern.compile("TYPE=(PART|MAP)");

    /* JADX INFO: renamed from: i4, reason: collision with root package name */
    private static final Pattern f48211i4 = Pattern.compile("LANGUAGE=\"(.+?)\"");

    /* JADX INFO: renamed from: j4, reason: collision with root package name */
    private static final Pattern f48213j4 = Pattern.compile("NAME=\"(.+?)\"");

    /* JADX INFO: renamed from: k4, reason: collision with root package name */
    private static final Pattern f48215k4 = Pattern.compile("GROUP-ID=\"(.+?)\"");

    /* JADX INFO: renamed from: l4, reason: collision with root package name */
    private static final Pattern f48217l4 = Pattern.compile("CHARACTERISTICS=\"(.+?)\"");

    /* JADX INFO: renamed from: m4, reason: collision with root package name */
    private static final Pattern f48219m4 = Pattern.compile("INSTREAM-ID=\"((?:CC|SERVICE)\\d+)\"");

    /* JADX INFO: renamed from: n4, reason: collision with root package name */
    private static final Pattern f48221n4 = c("AUTOSELECT");

    /* JADX INFO: renamed from: o4, reason: collision with root package name */
    private static final Pattern f48223o4 = c("DEFAULT");

    /* JADX INFO: renamed from: p4, reason: collision with root package name */
    private static final Pattern f48228p4 = c("FORCED");

    /* JADX INFO: renamed from: q4, reason: collision with root package name */
    private static final Pattern f48230q4 = c("INDEPENDENT");

    /* JADX INFO: renamed from: r4, reason: collision with root package name */
    private static final Pattern f48232r4 = c("GAP");

    /* JADX INFO: renamed from: s4, reason: collision with root package name */
    private static final Pattern f48234s4 = c("PRECISE");

    /* JADX INFO: renamed from: t4, reason: collision with root package name */
    private static final Pattern f48236t4 = Pattern.compile("VALUE=\"(.+?)\"");

    /* JADX INFO: renamed from: u4, reason: collision with root package name */
    private static final Pattern f48238u4 = Pattern.compile("IMPORT=\"(.+?)\"");

    /* JADX INFO: renamed from: v4, reason: collision with root package name */
    private static final Pattern f48240v4 = Pattern.compile("\\{\\$([a-zA-Z0-9\\-_]+)\\}");

    public static final class DeltaUpdateException extends IOException {
    }

    public static class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final BufferedReader f48251a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final Queue<String> f48252b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        @p0
        private String f48253c;

        public a(Queue<String> queue, BufferedReader bufferedReader) {
            this.f48252b = queue;
            this.f48251a = bufferedReader;
        }

        @mk.e(expression = {"next"}, result = true)
        public boolean a() throws IOException {
            String strTrim;
            if (this.f48253c != null) {
                return true;
            }
            if (!this.f48252b.isEmpty()) {
                this.f48253c = (String) com.google.android.exoplayer2.util.a.g(this.f48252b.poll());
                return true;
            }
            do {
                String line = this.f48251a.readLine();
                this.f48253c = line;
                if (line == null) {
                    return false;
                }
                strTrim = line.trim();
                this.f48253c = strTrim;
            } while (strTrim.isEmpty());
            return true;
        }

        public String b() throws IOException {
            if (!a()) {
                throw new NoSuchElementException();
            }
            String str = this.f48253c;
            this.f48253c = null;
            return str;
        }
    }

    public HlsPlaylistParser() {
        this(f.f48292n, null);
    }

    public HlsPlaylistParser(f fVar, @p0 g gVar) {
        this.f48249b = fVar;
        this.f48250c = gVar;
    }

    private static long A(String str, Pattern pattern) throws ParserException {
        return new BigDecimal(z(str, pattern, Collections.emptyMap())).multiply(new BigDecimal(1000000L)).longValue();
    }

    private static String B(String str, Map<String, String> map) {
        Matcher matcher = f48240v4.matcher(str);
        StringBuffer stringBuffer = new StringBuffer();
        while (matcher.find()) {
            String strGroup = matcher.group(1);
            if (map.containsKey(strGroup)) {
                matcher.appendReplacement(stringBuffer, Matcher.quoteReplacement(map.get(strGroup)));
            }
        }
        matcher.appendTail(stringBuffer);
        return stringBuffer.toString();
    }

    private static int C(BufferedReader bufferedReader, boolean z10, int i10) throws IOException {
        while (i10 != -1 && Character.isWhitespace(i10) && (z10 || !u0.I0(i10))) {
            i10 = bufferedReader.read();
        }
        return i10;
    }

    private static boolean b(BufferedReader bufferedReader) throws IOException {
        int i10 = bufferedReader.read();
        if (i10 == 239) {
            if (bufferedReader.read() != 187 || bufferedReader.read() != 191) {
                return false;
            }
            i10 = bufferedReader.read();
        }
        int iC = C(bufferedReader, true, i10);
        for (int i11 = 0; i11 < 7; i11++) {
            if (iC != f48202e.charAt(i11)) {
                return false;
            }
            iC = bufferedReader.read();
        }
        return u0.I0(C(bufferedReader, false, iC));
    }

    private static Pattern c(String str) {
        StringBuilder sb2 = new StringBuilder(String.valueOf(str).length() + 9);
        sb2.append(str);
        sb2.append("=(");
        sb2.append(X);
        sb2.append("|");
        sb2.append(W);
        sb2.append(")");
        return Pattern.compile(sb2.toString());
    }

    private static DrmInitData d(@p0 String str, DrmInitData.SchemeData[] schemeDataArr) {
        DrmInitData.SchemeData[] schemeDataArr2 = new DrmInitData.SchemeData[schemeDataArr.length];
        for (int i10 = 0; i10 < schemeDataArr.length; i10++) {
            schemeDataArr2[i10] = schemeDataArr[i10].b(null);
        }
        return new DrmInitData(str, schemeDataArr2);
    }

    @p0
    private static String e(long j10, @p0 String str, @p0 String str2) {
        if (str == null) {
            return null;
        }
        return str2 != null ? str2 : Long.toHexString(j10);
    }

    @p0
    private static f.b f(ArrayList<f.b> arrayList, String str) {
        for (int i10 = 0; i10 < arrayList.size(); i10++) {
            f.b bVar = arrayList.get(i10);
            if (str.equals(bVar.f48313d)) {
                return bVar;
            }
        }
        return null;
    }

    @p0
    private static f.b g(ArrayList<f.b> arrayList, String str) {
        for (int i10 = 0; i10 < arrayList.size(); i10++) {
            f.b bVar = arrayList.get(i10);
            if (str.equals(bVar.f48314e)) {
                return bVar;
            }
        }
        return null;
    }

    @p0
    private static f.b h(ArrayList<f.b> arrayList, String str) {
        for (int i10 = 0; i10 < arrayList.size(); i10++) {
            f.b bVar = arrayList.get(i10);
            if (str.equals(bVar.f48312c)) {
                return bVar;
            }
        }
        return null;
    }

    private static double j(String str, Pattern pattern) throws ParserException {
        return Double.parseDouble(z(str, pattern, Collections.emptyMap()));
    }

    @p0
    private static DrmInitData.SchemeData k(String str, String str2, Map<String, String> map) throws ParserException {
        String strU = u(str, f48201d4, "1", map);
        if (U.equals(str2)) {
            String strZ = z(str, f48203e4, map);
            return new DrmInitData.SchemeData(com.google.android.exoplayer2.j.X1, "video/mp4", Base64.decode(strZ.substring(strZ.indexOf(44)), 0));
        }
        if (V.equals(str2)) {
            return new DrmInitData.SchemeData(com.google.android.exoplayer2.j.X1, "hls", u0.y0(str));
        }
        if (!S.equals(str2) || !"1".equals(strU)) {
            return null;
        }
        String strZ2 = z(str, f48203e4, map);
        byte[] bArrDecode = Base64.decode(strZ2.substring(strZ2.indexOf(44)), 0);
        UUID uuid = com.google.android.exoplayer2.j.Y1;
        return new DrmInitData.SchemeData(uuid, "video/mp4", l.a(uuid, bArrDecode));
    }

    private static String l(String str) {
        return (Q.equals(str) || R.equals(str)) ? com.google.android.exoplayer2.j.Q1 : com.google.android.exoplayer2.j.T1;
    }

    private static int m(String str, Pattern pattern) throws ParserException {
        return Integer.parseInt(z(str, pattern, Collections.emptyMap()));
    }

    private static long n(String str, Pattern pattern) throws ParserException {
        return Long.parseLong(z(str, pattern, Collections.emptyMap()));
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code duplicated, block: B:78:0x0338  */
    private static f o(a aVar, String str) throws IOException {
        ArrayList arrayList;
        String strG;
        int i10;
        String str2;
        String strG2;
        int i11;
        int i12;
        Uri uriF;
        HashMap map;
        int i13;
        HashMap map2 = new HashMap();
        HashMap map3 = new HashMap();
        ArrayList arrayList2 = new ArrayList();
        ArrayList arrayList3 = new ArrayList();
        ArrayList arrayList4 = new ArrayList();
        ArrayList arrayList5 = new ArrayList();
        ArrayList arrayList6 = new ArrayList();
        ArrayList arrayList7 = new ArrayList();
        ArrayList arrayList8 = new ArrayList();
        ArrayList arrayList9 = new ArrayList();
        boolean z10 = false;
        boolean z11 = false;
        while (true) {
            boolean zA = aVar.a();
            String str3 = y.f51587n0;
            if (!zA) {
                HashMap map4 = map2;
                ArrayList arrayList10 = arrayList7;
                ArrayList arrayList11 = arrayList3;
                ArrayList arrayList12 = arrayList4;
                ArrayList arrayList13 = arrayList5;
                ArrayList arrayList14 = arrayList6;
                ArrayList arrayList15 = arrayList9;
                boolean z12 = z10;
                ArrayList arrayList16 = arrayList8;
                ArrayList arrayList17 = new ArrayList();
                HashSet hashSet = new HashSet();
                for (int i14 = 0; i14 < arrayList2.size(); i14++) {
                    f.b bVar = (f.b) arrayList2.get(i14);
                    if (hashSet.add(bVar.f48310a)) {
                        com.google.android.exoplayer2.util.a.i(bVar.f48311b.f43591k == null);
                        arrayList17.add(bVar.a(bVar.f48311b.c().X(new Metadata(new HlsTrackMetadataEntry(null, null, (List) com.google.android.exoplayer2.util.a.g((ArrayList) map4.get(bVar.f48310a))))).E()));
                    }
                }
                Uri uri = null;
                ArrayList arrayList18 = null;
                a2 a2VarE = null;
                int i15 = 0;
                while (i15 < arrayList10.size()) {
                    ArrayList arrayList19 = arrayList10;
                    String str4 = (String) arrayList19.get(i15);
                    String strZ = z(str4, f48215k4, map3);
                    String strZ2 = z(str4, f48213j4, map3);
                    a2.b bVar2 = new a2.b();
                    StringBuilder sb2 = new StringBuilder(String.valueOf(strZ).length() + 1 + String.valueOf(strZ2).length());
                    sb2.append(strZ);
                    sb2.append(":");
                    sb2.append(strZ2);
                    a2.b bVarV = bVar2.S(sb2.toString()).U(strZ2).K(str3).g0(x(str4)).c0(w(str4, map3)).V(v(str4, f48211i4, map3));
                    String strV = v(str4, f48203e4, map3);
                    Uri uriF2 = strV == null ? uri : q0.f(str, strV);
                    arrayList10 = arrayList19;
                    String str5 = str3;
                    Metadata metadata = new Metadata(new HlsTrackMetadataEntry(strZ, strZ2, Collections.emptyList()));
                    String strZ3 = z(str4, f48207g4, map3);
                    strZ3.hashCode();
                    switch (strZ3) {
                        case "SUBTITLES":
                            a2VarE = a2VarE;
                            arrayList12 = arrayList12;
                            arrayList = arrayList11;
                            f.b bVarG = g(arrayList2, strZ);
                            if (bVarG != null) {
                                String strS = u0.S(bVarG.f48311b.f43590j, 3);
                                bVarV.I(strS);
                                strG = y.g(strS);
                            } else {
                                strG = null;
                            }
                            if (strG == null) {
                                strG = "text/vtt";
                            }
                            bVarV.e0(strG).X(metadata);
                            if (uriF2 != null) {
                                f.a aVar2 = new f.a(uriF2, bVarV.E(), strZ, strZ2);
                                arrayList13 = arrayList13;
                                arrayList13.add(aVar2);
                                break;
                            } else {
                                arrayList13 = arrayList13;
                                u.m(f48200d, "EXT-X-MEDIA tag with missing mandatory URI attribute: skipping");
                                break;
                            }
                            break;
                        case "CLOSED-CAPTIONS":
                            a2VarE = a2VarE;
                            arrayList12 = arrayList12;
                            arrayList = arrayList11;
                            String strZ4 = z(str4, f48219m4, map3);
                            if (strZ4.startsWith("CC")) {
                                i10 = Integer.parseInt(strZ4.substring(2));
                                str2 = y.f51593q0;
                            } else {
                                i10 = Integer.parseInt(strZ4.substring(7));
                                str2 = y.f51595r0;
                            }
                            if (arrayList18 == null) {
                                arrayList18 = new ArrayList();
                            }
                            bVarV.e0(str2).F(i10);
                            arrayList18.add(bVarV.E());
                            arrayList13 = arrayList13;
                            break;
                        case "AUDIO":
                            arrayList = arrayList11;
                            f.b bVarF = f(arrayList2, strZ);
                            if (bVarF != null) {
                                String strS2 = u0.S(bVarF.f48311b.f43590j, 1);
                                bVarV.I(strS2);
                                strG2 = y.g(strS2);
                            } else {
                                strG2 = null;
                            }
                            String strV2 = v(str4, f48246y1, map3);
                            if (strV2 != null) {
                                bVarV.H(Integer.parseInt(u0.q1(strV2, "/")[0]));
                                if (y.M.equals(strG2) && strV2.endsWith("/JOC")) {
                                    bVarV.I(y.J0);
                                    strG2 = y.N;
                                }
                            }
                            bVarV.e0(strG2);
                            if (uriF2 != null) {
                                bVarV.X(metadata);
                                arrayList12 = arrayList12;
                                arrayList12.add(new f.a(uriF2, bVarV.E(), strZ, strZ2));
                            } else {
                                arrayList12 = arrayList12;
                                if (bVarF != null) {
                                    a2VarE = bVarV.E();
                                }
                            }
                            arrayList13 = arrayList13;
                            break;
                        case "VIDEO":
                            f.b bVarH = h(arrayList2, strZ);
                            if (bVarH != null) {
                                a2 a2Var = bVarH.f48311b;
                                String strS3 = u0.S(a2Var.f43590j, 2);
                                bVarV.I(strS3).e0(y.g(strS3)).j0(a2Var.f43598r).Q(a2Var.f43599s).P(a2Var.f43600t);
                            }
                            if (uriF2 != null) {
                                bVarV.X(metadata);
                                arrayList = arrayList11;
                                arrayList.add(new f.a(uriF2, bVarV.E(), strZ, strZ2));
                            }
                        default:
                            arrayList = arrayList11;
                            break;
                    }
                    i15++;
                    arrayList13 = arrayList13;
                    arrayList12 = arrayList12;
                    arrayList11 = arrayList;
                    str3 = str5;
                    a2VarE = a2VarE;
                    uri = null;
                }
                return new f(str, arrayList15, arrayList17, arrayList11, arrayList12, arrayList13, arrayList14, a2VarE, z11 ? Collections.emptyList() : arrayList18, z12, map3, arrayList16);
            }
            String strB = aVar.b();
            if (strB.startsWith(f48204f)) {
                arrayList9.add(strB);
            }
            boolean zStartsWith = strB.startsWith(f48220n);
            boolean z13 = z10;
            if (strB.startsWith(f48210i)) {
                map3.put(z(strB, f48213j4, map3), z(strB, f48236t4, map3));
            } else {
                if (strB.equals(f48239v)) {
                    map = map2;
                    arrayList5 = arrayList5;
                    z10 = true;
                } else if (strB.startsWith(f48224p)) {
                    arrayList7.add(strB);
                } else if (strB.startsWith(B)) {
                    DrmInitData.SchemeData schemeDataK = k(strB, u(strB, f48199c4, T, map3), map3);
                    if (schemeDataK != null) {
                        arrayList8.add(new DrmInitData(l(z(strB, f48197b4, map3)), schemeDataK));
                    }
                } else if (strB.startsWith(f48214k) || zStartsWith) {
                    boolean zContains = z11 | strB.contains(Y);
                    int i16 = zStartsWith ? 16384 : 0;
                    int iM = m(strB, f48243x1);
                    int iS = s(strB, Z, -1);
                    String strV3 = v(strB, f48226p2, map3);
                    String strV4 = v(strB, f48244x2, map3);
                    if (strV4 != null) {
                        String[] strArrP1 = u0.p1(strV4, "x");
                        int i17 = Integer.parseInt(strArrP1[0]);
                        int i18 = Integer.parseInt(strArrP1[1]);
                        if (i17 <= 0 || i18 <= 0) {
                            i18 = -1;
                            i13 = -1;
                        } else {
                            i13 = i17;
                        }
                        i12 = i18;
                        i11 = i13;
                    } else {
                        i11 = -1;
                        i12 = -1;
                    }
                    String strV5 = v(strB, f48247y2, map3);
                    float f10 = strV5 != null ? Float.parseFloat(strV5) : -1.0f;
                    String strV6 = v(strB, f48194a0, map3);
                    String strV7 = v(strB, f48196b0, map3);
                    HashMap map5 = map2;
                    String strV8 = v(strB, f48198c0, map3);
                    String strV9 = v(strB, f48225p1, map3);
                    if (zStartsWith) {
                        uriF = q0.f(str, z(strB, f48203e4, map3));
                    } else {
                        if (!aVar.a()) {
                            throw ParserException.c("#EXT-X-STREAM-INF must be followed by another line", null);
                        }
                        uriF = q0.f(str, B(aVar.b(), map3));
                    }
                    arrayList2.add(new f.b(uriF, new a2.b().R(arrayList2.size()).K(y.f51587n0).I(strV3).G(iS).Z(iM).j0(i11).Q(i12).P(f10).c0(i16).E(), strV6, strV7, strV8, strV9));
                    map = map5;
                    ArrayList arrayList20 = (ArrayList) map.get(uriF);
                    if (arrayList20 == null) {
                        arrayList20 = new ArrayList();
                        map.put(uriF, arrayList20);
                    }
                    arrayList20.add(new HlsTrackMetadataEntry.VariantInfo(iS, iM, strV6, strV7, strV8, strV9));
                    z10 = z13;
                    z11 = zContains;
                }
                map2 = map;
                arrayList8 = arrayList8;
                arrayList6 = arrayList6;
                arrayList9 = arrayList9;
                arrayList5 = arrayList5;
                arrayList4 = arrayList4;
                arrayList3 = arrayList3;
                arrayList7 = arrayList7;
            }
            map = map2;
            arrayList5 = arrayList5;
            z10 = z13;
            map2 = map;
            arrayList8 = arrayList8;
            arrayList6 = arrayList6;
            arrayList9 = arrayList9;
            arrayList5 = arrayList5;
            arrayList4 = arrayList4;
            arrayList3 = arrayList3;
            arrayList7 = arrayList7;
        }
    }

    /* JADX WARN: Code duplicated, block: B:112:0x031d A[PHI: r79
  0x031d: PHI (r79v12 java.lang.String) = (r79v10 java.lang.String), (r79v1 java.lang.String) binds: [B:118:0x0333, B:110:0x0312] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Multi-variable type inference failed */
    private static g p(f fVar, @p0 g gVar, a aVar, String str) throws IOException {
        ArrayList arrayList;
        ArrayList arrayList2;
        ArrayList arrayList3;
        long j10;
        ArrayList arrayList4;
        boolean z10;
        int i10;
        String strZ;
        int i11;
        long j11;
        long j12;
        long j13;
        boolean z11;
        DrmInitData drmInitData;
        fVar = fVar;
        gVar = gVar;
        boolean z12 = fVar.f48363c;
        HashMap map = new HashMap();
        HashMap map2 = new HashMap();
        ArrayList arrayList5 = new ArrayList();
        ArrayList arrayList6 = new ArrayList();
        ArrayList arrayList7 = new ArrayList();
        ArrayList arrayList8 = new ArrayList();
        g.C0385g c0385g = new g.C0385g(com.google.android.exoplayer2.j.f46377b, false, com.google.android.exoplayer2.j.f46377b, com.google.android.exoplayer2.j.f46377b, false);
        TreeMap treeMap = new TreeMap();
        String str2 = "";
        boolean z13 = false;
        boolean z14 = z12;
        g.C0385g c0385gY = c0385g;
        String strU = "";
        int i12 = 0;
        boolean zQ = false;
        boolean z15 = false;
        int i13 = 0;
        boolean z16 = false;
        boolean z17 = false;
        int i14 = 0;
        boolean z18 = false;
        long jU0 = 0;
        long j14 = 0;
        long j15 = 0;
        long j16 = 0;
        long j17 = 0;
        long jN = 0;
        long jA = 0;
        long j18 = 0;
        long j19 = com.google.android.exoplayer2.j.f46377b;
        int iM = 1;
        long jM = com.google.android.exoplayer2.j.f46377b;
        long j20 = com.google.android.exoplayer2.j.f46377b;
        DrmInitData drmInitDataD = null;
        DrmInitData drmInitData2 = null;
        String str3 = null;
        long j21 = -1;
        String str4 = null;
        String strL = null;
        g.e eVar = null;
        ArrayList arrayList9 = arrayList6;
        g.b bVar = null;
        while (aVar.a()) {
            String strB = aVar.b();
            if (strB.startsWith(f48204f)) {
                arrayList8.add(strB);
            }
            if (strB.startsWith(f48208h)) {
                String strZ2 = z(strB, K3, map);
                if ("VOD".equals(strZ2)) {
                    i12 = 1;
                } else if ("EVENT".equals(strZ2)) {
                    i12 = 2;
                }
            } else if (strB.equals(f48222o)) {
                z18 = true;
            } else {
                if (strB.startsWith(f48245y)) {
                    arrayList = arrayList5;
                    long j22 = (long) (j(strB, W3) * 1000000.0d);
                    zQ = q(strB, f48234s4, z13);
                    j19 = j22;
                } else {
                    arrayList = arrayList5;
                    if (strB.startsWith(f48212j)) {
                        c0385gY = y(strB);
                    } else if (strB.startsWith(f48216l)) {
                        j20 = (long) (j(strB, G3) * 1000000.0d);
                    } else if (strB.startsWith(f48237u)) {
                        String strZ3 = z(strB, f48203e4, map);
                        String strV = v(strB, Y3, map);
                        if (strV != null) {
                            String[] strArrP1 = u0.p1(strV, "@");
                            j21 = Long.parseLong(strArrP1[z13 ? 1 : 0]);
                            if (strArrP1.length > 1) {
                                j15 = Long.parseLong(strArrP1[1]);
                            }
                        }
                        if (j21 == -1) {
                            j15 = 0;
                        }
                        String str5 = str3;
                        String str6 = str4;
                        if (str5 != null && str6 == null) {
                            throw ParserException.c("The encryption IV attribute must be present when an initialization segment is encrypted with METHOD=AES-128.", null);
                        }
                        eVar = new g.e(strZ3, j15, j21, str5, str6);
                        if (j21 != -1) {
                            j15 += j21;
                        }
                        str4 = str6;
                        str3 = str5;
                        arrayList5 = arrayList;
                        j21 = -1;
                    } else {
                        str3 = str3;
                        str4 = str4;
                        if (strB.startsWith(f48229q)) {
                            jM = 1000000 * ((long) m(strB, G2));
                        } else if (strB.startsWith(f48242x)) {
                            jN = n(strB, R3);
                            j14 = jN;
                            arrayList5 = arrayList;
                            z13 = false;
                        } else if (strB.startsWith(f48206g)) {
                            iM = m(strB, J3);
                        } else {
                            if (strB.startsWith(f48210i)) {
                                String strV2 = v(strB, f48238u4, map);
                                if (strV2 != null) {
                                    String str7 = fVar.f48304l.get(strV2);
                                    if (str7 != null) {
                                        map.put(strV2, str7);
                                    }
                                } else {
                                    map.put(z(strB, f48213j4, map), z(strB, f48236t4, map));
                                }
                                bVar = bVar;
                                arrayList2 = arrayList9;
                                arrayList3 = arrayList8;
                                str2 = str2;
                                strL = strL;
                                j10 = jN;
                                arrayList4 = arrayList;
                                z10 = false;
                                i10 = i12;
                                arrayList7 = arrayList7;
                            } else if (strB.startsWith(f48241w)) {
                                jA = A(strB, S3);
                                strU = u(strB, T3, str2, map);
                            } else {
                                if (strB.startsWith(E)) {
                                    int iM2 = m(strB, N3);
                                    com.google.android.exoplayer2.util.a.i(gVar != null && arrayList.isEmpty());
                                    int i15 = (int) (j14 - ((g) u0.k(gVar)).f48326k);
                                    int i16 = iM2 + i15;
                                    if (i15 < 0 || i16 > gVar.f48333r.size()) {
                                        throw new DeltaUpdateException();
                                    }
                                    String str8 = str2;
                                    str4 = str4;
                                    long j23 = j17;
                                    while (i15 < i16) {
                                        g.e eVarB = gVar.f48333r.get(i15);
                                        ArrayList arrayList10 = arrayList9;
                                        ArrayList arrayList11 = arrayList8;
                                        if (j14 != gVar.f48326k) {
                                            eVarB = eVarB.b(j23, (gVar.f48325j - i13) + eVarB.f48348e);
                                        }
                                        ArrayList arrayList12 = arrayList;
                                        arrayList12.add(eVarB);
                                        long j24 = j23 + eVarB.f48347d;
                                        long j25 = eVarB.f48354k;
                                        if (j25 != -1) {
                                            j15 = eVarB.f48353j + j25;
                                        }
                                        int i17 = eVarB.f48348e;
                                        g.e eVar2 = eVarB.f48346c;
                                        DrmInitData drmInitData3 = eVarB.f48350g;
                                        str3 = eVarB.f48351h;
                                        String str9 = eVarB.f48352i;
                                        if (str9 == null || !str9.equals(Long.toHexString(jN))) {
                                            str4 = eVarB.f48352i;
                                        }
                                        jN++;
                                        i15++;
                                        i14 = i17;
                                        eVar = eVar2;
                                        drmInitData2 = drmInitData3;
                                        arrayList = arrayList12;
                                        j23 = j24;
                                        j16 = j23;
                                        arrayList9 = arrayList10;
                                        arrayList8 = arrayList11;
                                        gVar = gVar;
                                    }
                                    fVar = fVar;
                                    gVar = gVar;
                                    j17 = j23;
                                    str3 = str3;
                                    arrayList5 = arrayList;
                                    str2 = str8;
                                } else {
                                    arrayList9 = arrayList9;
                                    arrayList3 = arrayList8;
                                    str2 = str2;
                                    arrayList4 = arrayList;
                                    if (strB.startsWith(A)) {
                                        String strZ4 = z(strB, f48197b4, map);
                                        String strU2 = u(strB, f48199c4, T, map);
                                        if (N.equals(strZ4)) {
                                            treeMap.clear();
                                            strZ = null;
                                            drmInitData2 = null;
                                            str4 = null;
                                        } else {
                                            String strV3 = v(strB, f48205f4, map);
                                            if (!T.equals(strU2)) {
                                                String str10 = strL;
                                                strL = str10 == null ? l(strZ4) : str10;
                                                DrmInitData.SchemeData schemeDataK = k(strB, strU2, map);
                                                if (schemeDataK != null) {
                                                    treeMap.put(strU2, schemeDataK);
                                                    str4 = strV3;
                                                    strZ = null;
                                                    drmInitData2 = null;
                                                } else {
                                                    str4 = strV3;
                                                    strZ = null;
                                                }
                                            } else if (O.equals(strZ4)) {
                                                strZ = z(strB, f48203e4, map);
                                                str4 = strV3;
                                            } else {
                                                str4 = strV3;
                                                strZ = null;
                                            }
                                        }
                                        str3 = strZ;
                                        arrayList5 = arrayList4;
                                        arrayList9 = arrayList9;
                                        str2 = str2;
                                        arrayList8 = arrayList3;
                                        z13 = false;
                                        fVar = fVar;
                                    } else {
                                        strL = strL;
                                        if (strB.startsWith(C)) {
                                            String[] strArrP2 = u0.p1(z(strB, X3, map), "@");
                                            j21 = Long.parseLong(strArrP2[0]);
                                            if (strArrP2.length > 1) {
                                                j15 = Long.parseLong(strArrP2[1]);
                                            }
                                        } else {
                                            if (strB.startsWith(f48233s)) {
                                                i13 = Integer.parseInt(strB.substring(strB.indexOf(58) + 1));
                                                z13 = false;
                                                z15 = true;
                                            } else if (strB.equals(f48231r)) {
                                                i14++;
                                            } else {
                                                if (strB.startsWith(f48235t)) {
                                                    if (jU0 == 0) {
                                                        jU0 = u0.U0(u0.c1(strB.substring(strB.indexOf(58) + 1))) - j17;
                                                    } else {
                                                        i10 = i12;
                                                    }
                                                } else if (strB.equals(D)) {
                                                    z13 = false;
                                                    z17 = true;
                                                } else if (strB.equals(f48239v)) {
                                                    z13 = false;
                                                    z14 = true;
                                                } else if (strB.equals(f48248z)) {
                                                    z13 = false;
                                                    z16 = true;
                                                } else {
                                                    if (strB.startsWith(G)) {
                                                        i11 = i12;
                                                        arrayList7.add(new g.d(Uri.parse(q0.e(str, z(strB, f48203e4, map))), t(strB, U3, -1L), s(strB, V3, -1)));
                                                    } else {
                                                        i11 = i12;
                                                        if (!strB.startsWith(F)) {
                                                            long j26 = jN;
                                                            if (strB.startsWith(f48218m)) {
                                                                String strE = e(j26, str3, str4);
                                                                String strZ5 = z(strB, f48203e4, map);
                                                                g.b bVar2 = bVar;
                                                                ArrayList arrayList13 = arrayList7;
                                                                long j27 = (long) (j(strB, f48227p3) * 1000000.0d);
                                                                boolean zQ2 = q(strB, f48230q4, false) | (z14 && arrayList9.isEmpty());
                                                                boolean zQ3 = q(strB, f48232r4, false);
                                                                String strV4 = v(strB, Y3, map);
                                                                if (strV4 != null) {
                                                                    String[] strArrP3 = u0.p1(strV4, "@");
                                                                    j11 = Long.parseLong(strArrP3[0]);
                                                                    if (strArrP3.length > 1) {
                                                                        j18 = Long.parseLong(strArrP3[1]);
                                                                    }
                                                                } else {
                                                                    j11 = -1;
                                                                }
                                                                if (j11 == -1) {
                                                                    j18 = 0;
                                                                }
                                                                if (drmInitData2 == null && !treeMap.isEmpty()) {
                                                                    DrmInitData.SchemeData[] schemeDataArr = (DrmInitData.SchemeData[]) treeMap.values().toArray(new DrmInitData.SchemeData[0]);
                                                                    DrmInitData drmInitData4 = new DrmInitData(strL, schemeDataArr);
                                                                    if (drmInitDataD == null) {
                                                                        drmInitDataD = d(strL, schemeDataArr);
                                                                    }
                                                                    drmInitData2 = drmInitData4;
                                                                }
                                                                arrayList9.add(new g.b(strZ5, eVar, j27, i14, j16, drmInitData2, str3, strE, j18, j11, zQ3, zQ2, false));
                                                                j16 += j27;
                                                                if (j11 != -1) {
                                                                    j18 += j11;
                                                                }
                                                                jN = j26;
                                                                arrayList7 = arrayList13;
                                                                str3 = str3;
                                                                bVar = bVar2;
                                                                i12 = i11;
                                                                str2 = str2;
                                                                fVar = fVar;
                                                                gVar = gVar;
                                                                strL = strL;
                                                                arrayList5 = arrayList4;
                                                                str4 = str4;
                                                                arrayList9 = arrayList9;
                                                                arrayList8 = arrayList3;
                                                            } else {
                                                                bVar = bVar;
                                                                arrayList7 = arrayList7;
                                                                i10 = i11;
                                                                arrayList2 = arrayList9;
                                                                if (strB.startsWith("#")) {
                                                                    j10 = j26;
                                                                    z10 = false;
                                                                } else {
                                                                    String strE2 = e(j26, str3, str4);
                                                                    long j28 = j26 + 1;
                                                                    String strB2 = B(strB, map);
                                                                    g.e eVar3 = (g.e) map2.get(strB2);
                                                                    if (j21 == -1) {
                                                                        j12 = 0;
                                                                    } else {
                                                                        if (z18 && eVar == null && eVar3 == null) {
                                                                            eVar3 = new g.e(strB2, 0L, j15, null, null);
                                                                            map2.put(strB2, eVar3);
                                                                        }
                                                                        j12 = j15;
                                                                    }
                                                                    if (drmInitData2 != null || treeMap.isEmpty()) {
                                                                        j13 = j28;
                                                                        z11 = false;
                                                                        drmInitData = drmInitData2;
                                                                    } else {
                                                                        j13 = j28;
                                                                        z11 = false;
                                                                        DrmInitData.SchemeData[] schemeDataArr2 = (DrmInitData.SchemeData[]) treeMap.values().toArray(new DrmInitData.SchemeData[0]);
                                                                        drmInitData = new DrmInitData(strL, schemeDataArr2);
                                                                        if (drmInitDataD == null) {
                                                                            drmInitDataD = d(strL, schemeDataArr2);
                                                                        }
                                                                    }
                                                                    arrayList4.add(new g.e(strB2, eVar != null ? eVar : eVar3, strU, jA, i14, j17, drmInitData, str3, strE2, j12, j21, z17, arrayList2));
                                                                    j16 = j17 + jA;
                                                                    ArrayList arrayList14 = new ArrayList();
                                                                    if (j21 != -1) {
                                                                        j12 += j21;
                                                                    }
                                                                    j15 = j12;
                                                                    z13 = z11;
                                                                    z17 = z13 ? 1 : 0;
                                                                    arrayList7 = arrayList7;
                                                                    drmInitData2 = drmInitData;
                                                                    str3 = str3;
                                                                    jA = 0;
                                                                    j17 = j16;
                                                                    jN = j13;
                                                                    bVar = bVar;
                                                                    i12 = i10;
                                                                    str2 = str2;
                                                                    strU = str2;
                                                                    j21 = -1;
                                                                    fVar = fVar;
                                                                    strL = strL;
                                                                    arrayList5 = arrayList4;
                                                                    str4 = str4;
                                                                    arrayList8 = arrayList3;
                                                                    arrayList9 = arrayList14;
                                                                    gVar = gVar;
                                                                }
                                                            }
                                                        } else if (bVar == null && L.equals(z(strB, f48209h4, map))) {
                                                            String strZ6 = z(strB, f48203e4, map);
                                                            long jT = t(strB, Z3, -1L);
                                                            long jT2 = t(strB, f48195a4, -1L);
                                                            long j29 = jN;
                                                            String strE3 = e(j29, str3, str4);
                                                            if (drmInitData2 == null && !treeMap.isEmpty()) {
                                                                DrmInitData.SchemeData[] schemeDataArr3 = (DrmInitData.SchemeData[]) treeMap.values().toArray(new DrmInitData.SchemeData[0]);
                                                                DrmInitData drmInitData5 = new DrmInitData(strL, schemeDataArr3);
                                                                if (drmInitDataD == null) {
                                                                    drmInitDataD = d(strL, schemeDataArr3);
                                                                }
                                                                drmInitData2 = drmInitData5;
                                                            }
                                                            if (jT == -1 || jT2 != -1) {
                                                                bVar = new g.b(strZ6, eVar, 0L, i14, j16, drmInitData2, str3, strE3, jT != -1 ? jT : 0L, jT2, false, false, true);
                                                            }
                                                            jN = j29;
                                                            i12 = i11;
                                                            z13 = false;
                                                        }
                                                    }
                                                    i10 = i11;
                                                }
                                                arrayList2 = arrayList9;
                                                j10 = jN;
                                                z10 = false;
                                            }
                                            arrayList5 = arrayList4;
                                            arrayList8 = arrayList3;
                                        }
                                        z13 = false;
                                        arrayList5 = arrayList4;
                                        arrayList8 = arrayList3;
                                    }
                                }
                                z13 = false;
                            }
                            arrayList7 = arrayList7;
                            str3 = str3;
                            jN = j10;
                            bVar = bVar;
                            i12 = i10;
                            str2 = str2;
                            strL = strL;
                            arrayList5 = arrayList4;
                            str4 = str4;
                            arrayList9 = arrayList2;
                            arrayList8 = arrayList3;
                            z13 = z10;
                            fVar = fVar;
                        }
                        arrayList5 = arrayList;
                        z13 = false;
                    }
                }
                arrayList5 = arrayList;
            }
        }
        int i18 = i12;
        g.b bVar3 = bVar;
        ArrayList arrayList15 = arrayList7;
        ArrayList arrayList16 = arrayList8;
        Object[] objArr = z13 ? 1 : 0;
        ArrayList arrayList17 = arrayList5;
        ArrayList arrayList18 = arrayList9;
        HashMap map3 = new HashMap();
        for (int i19 = objArr == true ? 1 : 0; i19 < arrayList15.size(); i19++) {
            g.d dVar = (g.d) arrayList15.get(i19);
            long size = dVar.f48341b;
            if (size == -1) {
                size = (j14 + ((long) arrayList17.size())) - (arrayList18.isEmpty() ? 1L : 0L);
            }
            int size2 = dVar.f48342c;
            if (size2 == -1 && j20 != com.google.android.exoplayer2.j.f46377b) {
                size2 = (arrayList18.isEmpty() ? ((g.e) l1.w(arrayList17)).f48344n : arrayList18).size() - 1;
            }
            Uri uri = dVar.f48340a;
            map3.put(uri, new g.d(uri, size, size2));
        }
        if (bVar3 != null) {
            arrayList18.add(bVar3);
        }
        return new g(i18, str, arrayList16, j19, zQ, jU0, z15, i13, j14, iM, jM, j20, z14, z16, jU0 != 0, drmInitDataD, arrayList17, arrayList18, c0385gY, map3);
    }

    private static boolean q(String str, Pattern pattern, boolean z10) {
        Matcher matcher = pattern.matcher(str);
        return matcher.find() ? W.equals(matcher.group(1)) : z10;
    }

    private static double r(String str, Pattern pattern, double d10) {
        Matcher matcher = pattern.matcher(str);
        return matcher.find() ? Double.parseDouble((String) com.google.android.exoplayer2.util.a.g(matcher.group(1))) : d10;
    }

    private static int s(String str, Pattern pattern, int i10) {
        Matcher matcher = pattern.matcher(str);
        return matcher.find() ? Integer.parseInt((String) com.google.android.exoplayer2.util.a.g(matcher.group(1))) : i10;
    }

    private static long t(String str, Pattern pattern, long j10) {
        Matcher matcher = pattern.matcher(str);
        return matcher.find() ? Long.parseLong((String) com.google.android.exoplayer2.util.a.g(matcher.group(1))) : j10;
    }

    private static String u(String str, Pattern pattern, String str2, Map<String, String> map) {
        Matcher matcher = pattern.matcher(str);
        if (matcher.find()) {
            str2 = (String) com.google.android.exoplayer2.util.a.g(matcher.group(1));
        }
        return (map.isEmpty() || str2 == null) ? str2 : B(str2, map);
    }

    @p0
    private static String v(String str, Pattern pattern, Map<String, String> map) {
        return u(str, pattern, null, map);
    }

    private static int w(String str, Map<String, String> map) {
        String strV = v(str, f48217l4, map);
        if (TextUtils.isEmpty(strV)) {
            return 0;
        }
        String[] strArrP1 = u0.p1(strV, Constants.ACCEPT_TIME_SEPARATOR_SP);
        int i10 = u0.u(strArrP1, "public.accessibility.describes-video") ? 512 : 0;
        if (u0.u(strArrP1, "public.accessibility.transcribes-spoken-dialog")) {
            i10 |= 4096;
        }
        if (u0.u(strArrP1, "public.accessibility.describes-music-and-sound")) {
            i10 |= 1024;
        }
        return u0.u(strArrP1, "public.easy-to-read") ? i10 | 8192 : i10;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v2, types: [int] */
    /* JADX WARN: Type inference failed for: r0v6 */
    /* JADX WARN: Type inference failed for: r0v7 */
    private static int x(String str) {
        boolean zQ = q(str, f48223o4, false);
        ?? r10 = zQ;
        if (q(str, f48228p4, false)) {
            r10 = (zQ ? 1 : 0) | 2;
        }
        return q(str, f48221n4, false) ? r10 | 4 : r10;
    }

    private static g.C0385g y(String str) {
        double dR = r(str, L3, -9.223372036854776E18d);
        long j10 = com.google.android.exoplayer2.j.f46377b;
        long j11 = dR == -9.223372036854776E18d ? -9223372036854775807L : (long) (dR * 1000000.0d);
        boolean zQ = q(str, M3, false);
        double dR2 = r(str, O3, -9.223372036854776E18d);
        long j12 = dR2 == -9.223372036854776E18d ? -9223372036854775807L : (long) (dR2 * 1000000.0d);
        double dR3 = r(str, P3, -9.223372036854776E18d);
        if (dR3 != -9.223372036854776E18d) {
            j10 = (long) (dR3 * 1000000.0d);
        }
        return new g.C0385g(j11, zQ, j12, j10, q(str, Q3, false));
    }

    private static String z(String str, Pattern pattern, Map<String, String> map) throws ParserException {
        String strV = v(str, pattern, map);
        if (strV != null) {
            return strV;
        }
        String strPattern = pattern.pattern();
        StringBuilder sb2 = new StringBuilder(String.valueOf(strPattern).length() + 19 + String.valueOf(str).length());
        sb2.append("Couldn't match ");
        sb2.append(strPattern);
        sb2.append(" in ");
        sb2.append(str);
        throw ParserException.c(sb2.toString(), null);
    }

    @Override // com.google.android.exoplayer2.upstream.i0.a
    /* JADX INFO: renamed from: i, reason: merged with bridge method [inline-methods] */
    public h a(Uri uri, InputStream inputStream) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(inputStream));
        ArrayDeque arrayDeque = new ArrayDeque();
        try {
            if (!b(bufferedReader)) {
                throw ParserException.c("Input does not start with the #EXTM3U header.", null);
            }
            while (true) {
                String line = bufferedReader.readLine();
                if (line == null) {
                    u0.p(bufferedReader);
                    throw ParserException.c("Failed to parse the playlist, could not identify any tags.", null);
                }
                String strTrim = line.trim();
                if (!strTrim.isEmpty()) {
                    if (strTrim.startsWith(f48214k)) {
                        arrayDeque.add(strTrim);
                        f fVarO = o(new a(arrayDeque, bufferedReader), uri.toString());
                        u0.p(bufferedReader);
                        return fVarO;
                    }
                    if (!strTrim.startsWith(f48229q) && !strTrim.startsWith(f48242x) && !strTrim.startsWith(f48241w) && !strTrim.startsWith(A) && !strTrim.startsWith(C) && !strTrim.equals(f48231r) && !strTrim.equals(f48233s) && !strTrim.equals(f48248z)) {
                        arrayDeque.add(strTrim);
                    }
                    arrayDeque.add(strTrim);
                    g gVarP = p(this.f48249b, this.f48250c, new a(arrayDeque, bufferedReader), uri.toString());
                    u0.p(bufferedReader);
                    return gVarP;
                }
            }
        } catch (Throwable th2) {
            u0.p(bufferedReader);
            throw th2;
        }
    }
}
