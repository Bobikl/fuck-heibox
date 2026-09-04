package com.google.android.exoplayer2.source.smoothstreaming.manifest;

import android.net.Uri;
import android.text.TextUtils;
import android.util.Base64;
import android.util.Pair;
import androidx.annotation.p0;
import com.google.android.exoplayer2.ParserException;
import com.google.android.exoplayer2.a2;
import com.google.android.exoplayer2.drm.DrmInitData;
import com.google.android.exoplayer2.extractor.mp4.l;
import com.google.android.exoplayer2.extractor.mp4.p;
import com.google.android.exoplayer2.j;
import com.google.android.exoplayer2.upstream.i0;
import com.google.android.exoplayer2.util.f;
import com.google.android.exoplayer2.util.u0;
import com.google.android.exoplayer2.util.y;
import java.io.IOException;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedList;
import java.util.List;
import java.util.UUID;
import org.xmlpull.v1.XmlPullParser;
import org.xmlpull.v1.XmlPullParserException;
import org.xmlpull.v1.XmlPullParserFactory;

/* JADX INFO: loaded from: classes7.dex */
public class SsManifestParser implements i0.a<com.google.android.exoplayer2.source.smoothstreaming.manifest.a> {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final XmlPullParserFactory f49069b;

    public static class MissingFieldException extends ParserException {
        /* JADX WARN: Illegal instructions before constructor call */
        public MissingFieldException(String str) {
            String strValueOf = String.valueOf(str);
            super(strValueOf.length() != 0 ? "Missing required field: ".concat(strValueOf) : new String("Missing required field: "), null, true, 4);
        }
    }

    public static abstract class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final String f49070a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final String f49071b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        @p0
        private final a f49072c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private final List<Pair<String, Object>> f49073d = new LinkedList();

        public a(@p0 a aVar, String str, String str2) {
            this.f49072c = aVar;
            this.f49070a = str;
            this.f49071b = str2;
        }

        private a e(a aVar, String str, String str2) {
            if (c.f49081f.equals(str)) {
                return new c(aVar, str2);
            }
            if (b.f49074h.equals(str)) {
                return new b(aVar, str2);
            }
            if (e.f49112s.equals(str)) {
                return new e(aVar, str2);
            }
            return null;
        }

        protected void a(Object obj) {
        }

        protected abstract Object b();

        @p0
        protected final Object c(String str) {
            for (int i10 = 0; i10 < this.f49073d.size(); i10++) {
                Pair<String, Object> pair = this.f49073d.get(i10);
                if (((String) pair.first).equals(str)) {
                    return pair.second;
                }
            }
            a aVar = this.f49072c;
            if (aVar == null) {
                return null;
            }
            return aVar.c(str);
        }

        protected boolean d(String str) {
            return false;
        }

        public final Object f(XmlPullParser xmlPullParser) throws XmlPullParserException, IOException {
            boolean z10 = false;
            int i10 = 0;
            while (true) {
                int eventType = xmlPullParser.getEventType();
                if (eventType == 1) {
                    return null;
                }
                if (eventType == 2) {
                    String name = xmlPullParser.getName();
                    if (this.f49071b.equals(name)) {
                        n(xmlPullParser);
                        z10 = true;
                    } else if (z10) {
                        if (i10 > 0) {
                            i10++;
                        } else if (d(name)) {
                            n(xmlPullParser);
                        } else {
                            a aVarE = e(this, name, this.f49070a);
                            if (aVarE == null) {
                                i10 = 1;
                            } else {
                                a(aVarE.f(xmlPullParser));
                            }
                        }
                    }
                } else if (eventType != 3) {
                    if (eventType == 4 && z10 && i10 == 0) {
                        o(xmlPullParser);
                    }
                } else if (!z10) {
                    continue;
                } else if (i10 > 0) {
                    i10--;
                } else {
                    String name2 = xmlPullParser.getName();
                    h(xmlPullParser);
                    if (!d(name2)) {
                        return b();
                    }
                }
                xmlPullParser.next();
            }
        }

        protected final boolean g(XmlPullParser xmlPullParser, String str, boolean z10) {
            String attributeValue = xmlPullParser.getAttributeValue(null, str);
            return attributeValue != null ? Boolean.parseBoolean(attributeValue) : z10;
        }

        protected void h(XmlPullParser xmlPullParser) {
        }

        protected final int i(XmlPullParser xmlPullParser, String str, int i10) throws ParserException {
            String attributeValue = xmlPullParser.getAttributeValue(null, str);
            if (attributeValue == null) {
                return i10;
            }
            try {
                return Integer.parseInt(attributeValue);
            } catch (NumberFormatException e10) {
                throw ParserException.c(null, e10);
            }
        }

        protected final long j(XmlPullParser xmlPullParser, String str, long j10) throws ParserException {
            String attributeValue = xmlPullParser.getAttributeValue(null, str);
            if (attributeValue == null) {
                return j10;
            }
            try {
                return Long.parseLong(attributeValue);
            } catch (NumberFormatException e10) {
                throw ParserException.c(null, e10);
            }
        }

        protected final int k(XmlPullParser xmlPullParser, String str) throws ParserException {
            String attributeValue = xmlPullParser.getAttributeValue(null, str);
            if (attributeValue == null) {
                throw new MissingFieldException(str);
            }
            try {
                return Integer.parseInt(attributeValue);
            } catch (NumberFormatException e10) {
                throw ParserException.c(null, e10);
            }
        }

        protected final long l(XmlPullParser xmlPullParser, String str) throws ParserException {
            String attributeValue = xmlPullParser.getAttributeValue(null, str);
            if (attributeValue == null) {
                throw new MissingFieldException(str);
            }
            try {
                return Long.parseLong(attributeValue);
            } catch (NumberFormatException e10) {
                throw ParserException.c(null, e10);
            }
        }

        protected final String m(XmlPullParser xmlPullParser, String str) throws MissingFieldException {
            String attributeValue = xmlPullParser.getAttributeValue(null, str);
            if (attributeValue != null) {
                return attributeValue;
            }
            throw new MissingFieldException(str);
        }

        protected void n(XmlPullParser xmlPullParser) throws ParserException {
        }

        protected void o(XmlPullParser xmlPullParser) {
        }

        protected final void p(String str, @p0 Object obj) {
            this.f49073d.add(Pair.create(str, obj));
        }
    }

    public static class b extends a {

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        public static final String f49074h = "Protection";

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        public static final String f49075i = "ProtectionHeader";

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        public static final String f49076j = "SystemID";

        /* JADX INFO: renamed from: k, reason: collision with root package name */
        private static final int f49077k = 8;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        private boolean f49078e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        private UUID f49079f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        private byte[] f49080g;

        public b(a aVar, String str) {
            super(aVar, str, f49074h);
        }

        private static p[] q(byte[] bArr) {
            return new p[]{new p(true, null, 8, r(bArr), 0, 0, null)};
        }

        private static byte[] r(byte[] bArr) {
            StringBuilder sb2 = new StringBuilder();
            for (int i10 = 0; i10 < bArr.length; i10 += 2) {
                sb2.append((char) bArr[i10]);
            }
            String string = sb2.toString();
            byte[] bArrDecode = Base64.decode(string.substring(string.indexOf("<KID>") + 5, string.indexOf("</KID>")), 0);
            t(bArrDecode, 0, 3);
            t(bArrDecode, 1, 2);
            t(bArrDecode, 4, 5);
            t(bArrDecode, 6, 7);
            return bArrDecode;
        }

        private static String s(String str) {
            return (str.charAt(0) == '{' && str.charAt(str.length() - 1) == '}') ? str.substring(1, str.length() - 1) : str;
        }

        private static void t(byte[] bArr, int i10, int i11) {
            byte b10 = bArr[i10];
            bArr[i10] = bArr[i11];
            bArr[i11] = b10;
        }

        @Override // com.google.android.exoplayer2.source.smoothstreaming.manifest.SsManifestParser.a
        public Object b() {
            UUID uuid = this.f49079f;
            return new com.google.android.exoplayer2.source.smoothstreaming.manifest.a.C0389a(uuid, l.a(uuid, this.f49080g), q(this.f49080g));
        }

        @Override // com.google.android.exoplayer2.source.smoothstreaming.manifest.SsManifestParser.a
        public boolean d(String str) {
            return f49075i.equals(str);
        }

        @Override // com.google.android.exoplayer2.source.smoothstreaming.manifest.SsManifestParser.a
        public void h(XmlPullParser xmlPullParser) {
            if (f49075i.equals(xmlPullParser.getName())) {
                this.f49078e = false;
            }
        }

        @Override // com.google.android.exoplayer2.source.smoothstreaming.manifest.SsManifestParser.a
        public void n(XmlPullParser xmlPullParser) {
            if (f49075i.equals(xmlPullParser.getName())) {
                this.f49078e = true;
                this.f49079f = UUID.fromString(s(xmlPullParser.getAttributeValue(null, f49076j)));
            }
        }

        @Override // com.google.android.exoplayer2.source.smoothstreaming.manifest.SsManifestParser.a
        public void o(XmlPullParser xmlPullParser) {
            if (this.f49078e) {
                this.f49080g = Base64.decode(xmlPullParser.getText(), 0);
            }
        }
    }

    public static class c extends a {

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public static final String f49081f = "QualityLevel";

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        private static final String f49082g = "Index";

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        private static final String f49083h = "Bitrate";

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        private static final String f49084i = "CodecPrivateData";

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        private static final String f49085j = "SamplingRate";

        /* JADX INFO: renamed from: k, reason: collision with root package name */
        private static final String f49086k = "Channels";

        /* JADX INFO: renamed from: l, reason: collision with root package name */
        private static final String f49087l = "FourCC";

        /* JADX INFO: renamed from: m, reason: collision with root package name */
        private static final String f49088m = "Type";

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        private static final String f49089n = "Subtype";

        /* JADX INFO: renamed from: o, reason: collision with root package name */
        private static final String f49090o = "Language";

        /* JADX INFO: renamed from: p, reason: collision with root package name */
        private static final String f49091p = "Name";

        /* JADX INFO: renamed from: q, reason: collision with root package name */
        private static final String f49092q = "MaxWidth";

        /* JADX INFO: renamed from: r, reason: collision with root package name */
        private static final String f49093r = "MaxHeight";

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        private a2 f49094e;

        public c(a aVar, String str) {
            super(aVar, str, f49081f);
        }

        private static List<byte[]> q(String str) {
            ArrayList arrayList = new ArrayList();
            if (!TextUtils.isEmpty(str)) {
                byte[] bArrQ = u0.Q(str);
                byte[][] bArrI = f.i(bArrQ);
                if (bArrI == null) {
                    arrayList.add(bArrQ);
                } else {
                    Collections.addAll(arrayList, bArrI);
                }
            }
            return arrayList;
        }

        @p0
        private static String r(String str) {
            if (str.equalsIgnoreCase("H264") || str.equalsIgnoreCase("X264") || str.equalsIgnoreCase("AVC1") || str.equalsIgnoreCase("DAVC")) {
                return "video/avc";
            }
            if (str.equalsIgnoreCase("AAC") || str.equalsIgnoreCase("AACL") || str.equalsIgnoreCase("AACH") || str.equalsIgnoreCase("AACP")) {
                return y.A;
            }
            if (str.equalsIgnoreCase("TTML") || str.equalsIgnoreCase("DFXP")) {
                return y.f51599t0;
            }
            if (str.equalsIgnoreCase("ac-3") || str.equalsIgnoreCase("dac3")) {
                return y.L;
            }
            if (str.equalsIgnoreCase("ec-3") || str.equalsIgnoreCase("dec3")) {
                return y.M;
            }
            if (str.equalsIgnoreCase("dtsc")) {
                return y.Q;
            }
            if (str.equalsIgnoreCase("dtsh") || str.equalsIgnoreCase("dtsl")) {
                return y.R;
            }
            if (str.equalsIgnoreCase("dtse")) {
                return y.S;
            }
            if (str.equalsIgnoreCase("opus")) {
                return y.V;
            }
            return null;
        }

        @Override // com.google.android.exoplayer2.source.smoothstreaming.manifest.SsManifestParser.a
        public Object b() {
            return this.f49094e;
        }

        @Override // com.google.android.exoplayer2.source.smoothstreaming.manifest.SsManifestParser.a
        public void n(XmlPullParser xmlPullParser) throws ParserException {
            a2.b bVar = new a2.b();
            String strR = r(m(xmlPullParser, f49087l));
            int iIntValue = ((Integer) c(f49088m)).intValue();
            if (iIntValue == 2) {
                bVar.K("video/mp4").j0(k(xmlPullParser, f49092q)).Q(k(xmlPullParser, f49093r)).T(q(xmlPullParser.getAttributeValue(null, f49084i)));
            } else if (iIntValue == 1) {
                if (strR == null) {
                    strR = y.A;
                }
                int iK = k(xmlPullParser, f49086k);
                int iK2 = k(xmlPullParser, f49085j);
                List<byte[]> listQ = q(xmlPullParser.getAttributeValue(null, f49084i));
                if (listQ.isEmpty() && y.A.equals(strR)) {
                    listQ = Collections.singletonList(com.google.android.exoplayer2.audio.a.a(iK2, iK));
                }
                bVar.K(y.f51610z).H(iK).f0(iK2).T(listQ);
            } else if (iIntValue == 3) {
                int i10 = 0;
                String str = (String) c(f49089n);
                if (str != null) {
                    if (str.equals("CAPT")) {
                        i10 = 64;
                    } else if (str.equals("DESC")) {
                        i10 = 1024;
                    }
                }
                bVar.K(y.f51579j0).c0(i10);
            } else {
                bVar.K(y.f51579j0);
            }
            this.f49094e = bVar.S(xmlPullParser.getAttributeValue(null, f49082g)).U((String) c("Name")).e0(strR).G(k(xmlPullParser, f49083h)).V((String) c(f49090o)).E();
        }
    }

    public static class d extends a {

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        public static final String f49095n = "SmoothStreamingMedia";

        /* JADX INFO: renamed from: o, reason: collision with root package name */
        private static final String f49096o = "MajorVersion";

        /* JADX INFO: renamed from: p, reason: collision with root package name */
        private static final String f49097p = "MinorVersion";

        /* JADX INFO: renamed from: q, reason: collision with root package name */
        private static final String f49098q = "TimeScale";

        /* JADX INFO: renamed from: r, reason: collision with root package name */
        private static final String f49099r = "DVRWindowLength";

        /* JADX INFO: renamed from: s, reason: collision with root package name */
        private static final String f49100s = "Duration";

        /* JADX INFO: renamed from: t, reason: collision with root package name */
        private static final String f49101t = "LookaheadCount";

        /* JADX INFO: renamed from: u, reason: collision with root package name */
        private static final String f49102u = "IsLive";

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        private final List<com.google.android.exoplayer2.source.smoothstreaming.manifest.a.b> f49103e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        private int f49104f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        private int f49105g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        private long f49106h;

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        private long f49107i;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        private long f49108j;

        /* JADX INFO: renamed from: k, reason: collision with root package name */
        private int f49109k;

        /* JADX INFO: renamed from: l, reason: collision with root package name */
        private boolean f49110l;

        /* JADX INFO: renamed from: m, reason: collision with root package name */
        @p0
        private com.google.android.exoplayer2.source.smoothstreaming.manifest.a.C0389a f49111m;

        public d(a aVar, String str) {
            super(aVar, str, f49095n);
            this.f49109k = -1;
            this.f49111m = null;
            this.f49103e = new LinkedList();
        }

        @Override // com.google.android.exoplayer2.source.smoothstreaming.manifest.SsManifestParser.a
        public void a(Object obj) {
            if (obj instanceof com.google.android.exoplayer2.source.smoothstreaming.manifest.a.b) {
                this.f49103e.add((com.google.android.exoplayer2.source.smoothstreaming.manifest.a.b) obj);
            } else if (obj instanceof com.google.android.exoplayer2.source.smoothstreaming.manifest.a.C0389a) {
                com.google.android.exoplayer2.util.a.i(this.f49111m == null);
                this.f49111m = (com.google.android.exoplayer2.source.smoothstreaming.manifest.a.C0389a) obj;
            }
        }

        @Override // com.google.android.exoplayer2.source.smoothstreaming.manifest.SsManifestParser.a
        public Object b() {
            int size = this.f49103e.size();
            com.google.android.exoplayer2.source.smoothstreaming.manifest.a.b[] bVarArr = new com.google.android.exoplayer2.source.smoothstreaming.manifest.a.b[size];
            this.f49103e.toArray(bVarArr);
            if (this.f49111m != null) {
                com.google.android.exoplayer2.source.smoothstreaming.manifest.a.C0389a c0389a = this.f49111m;
                DrmInitData drmInitData = new DrmInitData(new DrmInitData.SchemeData(c0389a.f49143a, "video/mp4", c0389a.f49144b));
                for (int i10 = 0; i10 < size; i10++) {
                    com.google.android.exoplayer2.source.smoothstreaming.manifest.a.b bVar = bVarArr[i10];
                    int i11 = bVar.f49150a;
                    if (i11 == 2 || i11 == 1) {
                        a2[] a2VarArr = bVar.f49159j;
                        for (int i12 = 0; i12 < a2VarArr.length; i12++) {
                            a2VarArr[i12] = a2VarArr[i12].c().M(drmInitData).E();
                        }
                    }
                }
            }
            return new com.google.android.exoplayer2.source.smoothstreaming.manifest.a(this.f49104f, this.f49105g, this.f49106h, this.f49107i, this.f49108j, this.f49109k, this.f49110l, this.f49111m, bVarArr);
        }

        @Override // com.google.android.exoplayer2.source.smoothstreaming.manifest.SsManifestParser.a
        public void n(XmlPullParser xmlPullParser) throws ParserException {
            this.f49104f = k(xmlPullParser, f49096o);
            this.f49105g = k(xmlPullParser, f49097p);
            this.f49106h = j(xmlPullParser, f49098q, 10000000L);
            this.f49107i = l(xmlPullParser, f49100s);
            this.f49108j = j(xmlPullParser, f49099r, 0L);
            this.f49109k = i(xmlPullParser, f49101t, -1);
            this.f49110l = g(xmlPullParser, f49102u, false);
            p(f49098q, Long.valueOf(this.f49106h));
        }
    }

    public static class e extends a {
        private static final String A = "Url";
        private static final String B = "MaxWidth";
        private static final String C = "MaxHeight";
        private static final String D = "DisplayWidth";
        private static final String E = "DisplayHeight";
        private static final String F = "Language";
        private static final String G = "TimeScale";
        private static final String H = "d";
        private static final String I = "t";
        private static final String J = "r";

        /* JADX INFO: renamed from: s, reason: collision with root package name */
        public static final String f49112s = "StreamIndex";

        /* JADX INFO: renamed from: t, reason: collision with root package name */
        private static final String f49113t = "c";

        /* JADX INFO: renamed from: u, reason: collision with root package name */
        private static final String f49114u = "Type";

        /* JADX INFO: renamed from: v, reason: collision with root package name */
        private static final String f49115v = "audio";

        /* JADX INFO: renamed from: w, reason: collision with root package name */
        private static final String f49116w = "video";

        /* JADX INFO: renamed from: x, reason: collision with root package name */
        private static final String f49117x = "text";

        /* JADX INFO: renamed from: y, reason: collision with root package name */
        private static final String f49118y = "Subtype";

        /* JADX INFO: renamed from: z, reason: collision with root package name */
        private static final String f49119z = "Name";

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        private final String f49120e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        private final List<a2> f49121f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        private int f49122g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        private String f49123h;

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        private long f49124i;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        private String f49125j;

        /* JADX INFO: renamed from: k, reason: collision with root package name */
        private String f49126k;

        /* JADX INFO: renamed from: l, reason: collision with root package name */
        private int f49127l;

        /* JADX INFO: renamed from: m, reason: collision with root package name */
        private int f49128m;

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        private int f49129n;

        /* JADX INFO: renamed from: o, reason: collision with root package name */
        private int f49130o;

        /* JADX INFO: renamed from: p, reason: collision with root package name */
        private String f49131p;

        /* JADX INFO: renamed from: q, reason: collision with root package name */
        private ArrayList<Long> f49132q;

        /* JADX INFO: renamed from: r, reason: collision with root package name */
        private long f49133r;

        public e(a aVar, String str) {
            super(aVar, str, f49112s);
            this.f49120e = str;
            this.f49121f = new LinkedList();
        }

        private void q(XmlPullParser xmlPullParser) throws ParserException {
            int iS = s(xmlPullParser);
            this.f49122g = iS;
            p(f49114u, Integer.valueOf(iS));
            if (this.f49122g == 3) {
                this.f49123h = m(xmlPullParser, f49118y);
            } else {
                this.f49123h = xmlPullParser.getAttributeValue(null, f49118y);
            }
            p(f49118y, this.f49123h);
            String attributeValue = xmlPullParser.getAttributeValue(null, "Name");
            this.f49125j = attributeValue;
            p("Name", attributeValue);
            this.f49126k = m(xmlPullParser, A);
            this.f49127l = i(xmlPullParser, B, -1);
            this.f49128m = i(xmlPullParser, C, -1);
            this.f49129n = i(xmlPullParser, D, -1);
            this.f49130o = i(xmlPullParser, E, -1);
            String attributeValue2 = xmlPullParser.getAttributeValue(null, F);
            this.f49131p = attributeValue2;
            p(F, attributeValue2);
            long jI = i(xmlPullParser, G, -1);
            this.f49124i = jI;
            if (jI == -1) {
                this.f49124i = ((Long) c(G)).longValue();
            }
            this.f49132q = new ArrayList<>();
        }

        private void r(XmlPullParser xmlPullParser) throws ParserException {
            int size = this.f49132q.size();
            long j10 = j(xmlPullParser, "t", j.f46377b);
            int i10 = 1;
            if (j10 == j.f46377b) {
                if (size == 0) {
                    j10 = 0;
                } else {
                    if (this.f49133r == -1) {
                        throw ParserException.c("Unable to infer start time", null);
                    }
                    j10 = this.f49133r + this.f49132q.get(size - 1).longValue();
                }
            }
            this.f49132q.add(Long.valueOf(j10));
            this.f49133r = j(xmlPullParser, H, j.f46377b);
            long j11 = j(xmlPullParser, J, 1L);
            if (j11 > 1 && this.f49133r == j.f46377b) {
                throw ParserException.c("Repeated chunk with unspecified duration", null);
            }
            while (true) {
                long j12 = i10;
                if (j12 >= j11) {
                    return;
                }
                this.f49132q.add(Long.valueOf((this.f49133r * j12) + j10));
                i10++;
            }
        }

        private int s(XmlPullParser xmlPullParser) throws ParserException {
            String attributeValue = xmlPullParser.getAttributeValue(null, f49114u);
            if (attributeValue == null) {
                throw new MissingFieldException(f49114u);
            }
            if ("audio".equalsIgnoreCase(attributeValue)) {
                return 1;
            }
            if ("video".equalsIgnoreCase(attributeValue)) {
                return 2;
            }
            if ("text".equalsIgnoreCase(attributeValue)) {
                return 3;
            }
            StringBuilder sb2 = new StringBuilder(attributeValue.length() + 19);
            sb2.append("Invalid key value[");
            sb2.append(attributeValue);
            sb2.append("]");
            throw ParserException.c(sb2.toString(), null);
        }

        @Override // com.google.android.exoplayer2.source.smoothstreaming.manifest.SsManifestParser.a
        public void a(Object obj) {
            if (obj instanceof a2) {
                this.f49121f.add((a2) obj);
            }
        }

        @Override // com.google.android.exoplayer2.source.smoothstreaming.manifest.SsManifestParser.a
        public Object b() {
            a2[] a2VarArr = new a2[this.f49121f.size()];
            this.f49121f.toArray(a2VarArr);
            return new com.google.android.exoplayer2.source.smoothstreaming.manifest.a.b(this.f49120e, this.f49126k, this.f49122g, this.f49123h, this.f49124i, this.f49125j, this.f49127l, this.f49128m, this.f49129n, this.f49130o, this.f49131p, a2VarArr, this.f49132q, this.f49133r);
        }

        @Override // com.google.android.exoplayer2.source.smoothstreaming.manifest.SsManifestParser.a
        public boolean d(String str) {
            return "c".equals(str);
        }

        @Override // com.google.android.exoplayer2.source.smoothstreaming.manifest.SsManifestParser.a
        public void n(XmlPullParser xmlPullParser) throws ParserException {
            if ("c".equals(xmlPullParser.getName())) {
                r(xmlPullParser);
            } else {
                q(xmlPullParser);
            }
        }
    }

    public SsManifestParser() {
        try {
            this.f49069b = XmlPullParserFactory.newInstance();
        } catch (XmlPullParserException e10) {
            throw new RuntimeException("Couldn't create XmlPullParserFactory instance", e10);
        }
    }

    @Override // com.google.android.exoplayer2.upstream.i0.a
    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public com.google.android.exoplayer2.source.smoothstreaming.manifest.a a(Uri uri, InputStream inputStream) throws IOException {
        try {
            XmlPullParser xmlPullParserNewPullParser = this.f49069b.newPullParser();
            xmlPullParserNewPullParser.setInput(inputStream, null);
            return (com.google.android.exoplayer2.source.smoothstreaming.manifest.a) new d(null, uri.toString()).f(xmlPullParserNewPullParser);
        } catch (XmlPullParserException e10) {
            throw ParserException.c(null, e10);
        }
    }
}
