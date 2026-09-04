package com.google.android.exoplayer2.text.ttml;

import android.text.Layout;
import androidx.annotation.p0;
import com.google.android.exoplayer2.j;
import com.google.android.exoplayer2.text.SubtitleDecoderException;
import com.google.android.exoplayer2.util.u;
import com.google.android.exoplayer2.util.u0;
import com.google.android.exoplayer2.util.v0;
import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.util.ArrayDeque;
import java.util.HashMap;
import java.util.Map;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import org.xmlpull.v1.XmlPullParser;
import org.xmlpull.v1.XmlPullParserException;
import org.xmlpull.v1.XmlPullParserFactory;

/* JADX INFO: compiled from: TtmlDecoder.java */
/* JADX INFO: loaded from: classes7.dex */
public final class c extends com.google.android.exoplayer2.text.f {
    private static final int E = 30;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    private static final String f49763p = "TtmlDecoder";

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    private static final String f49764q = "http://www.w3.org/ns/ttml#parameter";

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    private static final String f49765r = "begin";

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    private static final String f49766s = "dur";

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    private static final String f49767t = "end";

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    private static final String f49768u = "style";

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    private static final String f49769v = "region";

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    private static final String f49770w = "backgroundImage";

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    private final XmlPullParserFactory f49774o;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    private static final Pattern f49771x = Pattern.compile("^([0-9][0-9]+):([0-9][0-9]):([0-9][0-9])(?:(\\.[0-9]+)|:([0-9][0-9])(?:\\.([0-9]+))?)?$");

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    private static final Pattern f49772y = Pattern.compile("^([0-9]+(?:\\.[0-9]+)?)(h|m|s|ms|f|t)$");

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    private static final Pattern f49773z = Pattern.compile("^(([0-9]*.)?[0-9]+)(px|em|%)$");
    static final Pattern A = Pattern.compile("^([-+]?\\d+\\.?\\d*?)%$");
    static final Pattern B = Pattern.compile("^(\\d+\\.?\\d*?)% (\\d+\\.?\\d*?)%$");
    private static final Pattern C = Pattern.compile("^(\\d+\\.?\\d*?)px (\\d+\\.?\\d*?)px$");
    private static final Pattern D = Pattern.compile("^(\\d+) (\\d+)$");
    private static final b F = new b(30.0f, 1, 1);
    private static final a G = new a(32, 15);

    /* JADX INFO: compiled from: TtmlDecoder.java */
    public static final class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final int f49775a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final int f49776b;

        a(int i10, int i11) {
            this.f49775a = i10;
            this.f49776b = i11;
        }
    }

    /* JADX INFO: compiled from: TtmlDecoder.java */
    public static final class b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final float f49777a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final int f49778b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final int f49779c;

        b(float f10, int i10, int i11) {
            this.f49777a = f10;
            this.f49778b = i10;
            this.f49779c = i11;
        }
    }

    /* JADX INFO: renamed from: com.google.android.exoplayer2.text.ttml.c$c, reason: collision with other inner class name */
    /* JADX INFO: compiled from: TtmlDecoder.java */
    public static final class C0397c {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final int f49780a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final int f49781b;

        C0397c(int i10, int i11) {
            this.f49780a = i10;
            this.f49781b = i11;
        }
    }

    public c() {
        super(f49763p);
        try {
            XmlPullParserFactory xmlPullParserFactoryNewInstance = XmlPullParserFactory.newInstance();
            this.f49774o = xmlPullParserFactoryNewInstance;
            xmlPullParserFactoryNewInstance.setNamespaceAware(true);
        } catch (XmlPullParserException e10) {
            throw new RuntimeException("Couldn't create XmlPullParserFactory instance", e10);
        }
    }

    private static g A(@p0 g gVar) {
        return gVar == null ? new g() : gVar;
    }

    private static boolean B(String str) {
        return str.equals(d.f49795n) || str.equals("head") || str.equals("body") || str.equals(d.f49801q) || str.equals("p") || str.equals(d.f49805s) || str.equals(d.f49807t) || str.equals("style") || str.equals(d.f49811v) || str.equals(d.f49813w) || str.equals("region") || str.equals(d.f49817y) || str.equals("image") || str.equals("data") || str.equals(d.B);
    }

    @p0
    private static Layout.Alignment C(String str) {
        String strG = com.google.common.base.a.g(str);
        strG.hashCode();
        switch (strG) {
            case "center":
                return Layout.Alignment.ALIGN_CENTER;
            case "end":
            case "right":
                return Layout.Alignment.ALIGN_OPPOSITE;
            case "left":
            case "start":
                return Layout.Alignment.ALIGN_NORMAL;
            default:
                return null;
        }
    }

    private static a D(XmlPullParser xmlPullParser, a aVar) throws SubtitleDecoderException {
        String attributeValue = xmlPullParser.getAttributeValue(f49764q, "cellResolution");
        if (attributeValue == null) {
            return aVar;
        }
        Matcher matcher = D.matcher(attributeValue);
        if (!matcher.matches()) {
            u.m(f49763p, attributeValue.length() != 0 ? "Ignoring malformed cell resolution: ".concat(attributeValue) : new String("Ignoring malformed cell resolution: "));
            return aVar;
        }
        try {
            int i10 = Integer.parseInt((String) com.google.android.exoplayer2.util.a.g(matcher.group(1)));
            int i11 = Integer.parseInt((String) com.google.android.exoplayer2.util.a.g(matcher.group(2)));
            if (i10 != 0 && i11 != 0) {
                return new a(i10, i11);
            }
            StringBuilder sb2 = new StringBuilder(47);
            sb2.append("Invalid cell resolution ");
            sb2.append(i10);
            sb2.append(" ");
            sb2.append(i11);
            throw new SubtitleDecoderException(sb2.toString());
        } catch (NumberFormatException unused) {
            u.m(f49763p, attributeValue.length() != 0 ? "Ignoring malformed cell resolution: ".concat(attributeValue) : new String("Ignoring malformed cell resolution: "));
            return aVar;
        }
    }

    private static void E(String str, g gVar) throws SubtitleDecoderException {
        Matcher matcher;
        String[] strArrP1 = u0.p1(str, "\\s+");
        if (strArrP1.length == 1) {
            matcher = f49773z.matcher(str);
        } else {
            if (strArrP1.length != 2) {
                int length = strArrP1.length;
                StringBuilder sb2 = new StringBuilder(52);
                sb2.append("Invalid number of entries for fontSize: ");
                sb2.append(length);
                sb2.append(".");
                throw new SubtitleDecoderException(sb2.toString());
            }
            matcher = f49773z.matcher(strArrP1[1]);
            u.m(f49763p, "Multiple values in fontSize attribute. Picking the second value for vertical font size and ignoring the first.");
        }
        if (!matcher.matches()) {
            StringBuilder sb3 = new StringBuilder(String.valueOf(str).length() + 36);
            sb3.append("Invalid expression for fontSize: '");
            sb3.append(str);
            sb3.append("'.");
            throw new SubtitleDecoderException(sb3.toString());
        }
        String str2 = (String) com.google.android.exoplayer2.util.a.g(matcher.group(3));
        str2.hashCode();
        switch (str2) {
            case "%":
                gVar.A(3);
                break;
            case "em":
                gVar.A(2);
                break;
            case "px":
                gVar.A(1);
                break;
            default:
                StringBuilder sb4 = new StringBuilder(str2.length() + 30);
                sb4.append("Invalid unit for fontSize: '");
                sb4.append(str2);
                sb4.append("'.");
                throw new SubtitleDecoderException(sb4.toString());
        }
        gVar.z(Float.parseFloat((String) com.google.android.exoplayer2.util.a.g(matcher.group(1))));
    }

    private static b F(XmlPullParser xmlPullParser) throws SubtitleDecoderException {
        String attributeValue = xmlPullParser.getAttributeValue(f49764q, "frameRate");
        int i10 = attributeValue != null ? Integer.parseInt(attributeValue) : 30;
        float f10 = 1.0f;
        String attributeValue2 = xmlPullParser.getAttributeValue(f49764q, "frameRateMultiplier");
        if (attributeValue2 != null) {
            String[] strArrP1 = u0.p1(attributeValue2, " ");
            if (strArrP1.length != 2) {
                throw new SubtitleDecoderException("frameRateMultiplier doesn't have 2 parts");
            }
            f10 = Integer.parseInt(strArrP1[0]) / Integer.parseInt(strArrP1[1]);
        }
        b bVar = F;
        int i11 = bVar.f49778b;
        String attributeValue3 = xmlPullParser.getAttributeValue(f49764q, "subFrameRate");
        if (attributeValue3 != null) {
            i11 = Integer.parseInt(attributeValue3);
        }
        int i12 = bVar.f49779c;
        String attributeValue4 = xmlPullParser.getAttributeValue(f49764q, "tickRate");
        if (attributeValue4 != null) {
            i12 = Integer.parseInt(attributeValue4);
        }
        return new b(i10 * f10, i11, i12);
    }

    private static Map<String, g> G(XmlPullParser xmlPullParser, Map<String, g> map, a aVar, @p0 C0397c c0397c, Map<String, e> map2, Map<String, String> map3) throws XmlPullParserException, IOException {
        do {
            xmlPullParser.next();
            if (v0.f(xmlPullParser, "style")) {
                String strA = v0.a(xmlPullParser, "style");
                g gVarL = L(xmlPullParser, new g());
                if (strA != null) {
                    for (String str : M(strA)) {
                        gVarL.a(map.get(str));
                    }
                }
                String strG = gVarL.g();
                if (strG != null) {
                    map.put(strG, gVarL);
                }
            } else if (v0.f(xmlPullParser, "region")) {
                e eVarJ = J(xmlPullParser, aVar, c0397c);
                if (eVarJ != null) {
                    map2.put(eVarJ.f49834a, eVarJ);
                }
            } else if (v0.f(xmlPullParser, d.f49817y)) {
                H(xmlPullParser, map3);
            }
        } while (!v0.d(xmlPullParser, "head"));
        return map;
    }

    private static void H(XmlPullParser xmlPullParser, Map<String, String> map) throws XmlPullParserException, IOException {
        String strA;
        do {
            xmlPullParser.next();
            if (v0.f(xmlPullParser, "image") && (strA = v0.a(xmlPullParser, "id")) != null) {
                map.put(strA, xmlPullParser.nextText());
            }
        } while (!v0.d(xmlPullParser, d.f49817y));
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code duplicated, block: B:66:0x00e9  */
    /* JADX WARN: Code duplicated, block: B:6:0x0038  */
    private static d I(XmlPullParser xmlPullParser, @p0 d dVar, Map<String, e> map, b bVar) throws SubtitleDecoderException {
        long j10;
        long j11;
        int attributeCount = xmlPullParser.getAttributeCount();
        g gVarL = L(xmlPullParser, null);
        String strSubstring = null;
        String str = "";
        long jN = j.f46377b;
        long jN2 = j.f46377b;
        long jN3 = j.f46377b;
        String[] strArr = null;
        for (int i10 = 0; i10 < attributeCount; i10++) {
            String attributeName = xmlPullParser.getAttributeName(i10);
            String attributeValue = xmlPullParser.getAttributeValue(i10);
            attributeName.hashCode();
            switch (attributeName) {
                case "region":
                    if (map.containsKey(attributeValue)) {
                        str = attributeValue;
                        continue;
                    }
                    break;
                case "dur":
                    jN3 = N(attributeValue, bVar);
                    break;
                case "end":
                    jN2 = N(attributeValue, bVar);
                    break;
                case "begin":
                    jN = N(attributeValue, bVar);
                    break;
                case "style":
                    String[] strArrM = M(attributeValue);
                    if (strArrM.length > 0) {
                        strArr = strArrM;
                        break;
                    }
                    break;
                case "backgroundImage":
                    if (attributeValue.startsWith("#")) {
                        strSubstring = attributeValue.substring(1);
                        break;
                    }
                    break;
            }
        }
        if (dVar != null) {
            long j12 = dVar.f49824d;
            j10 = j.f46377b;
            if (j12 != j.f46377b) {
                if (jN != j.f46377b) {
                    jN += j12;
                }
                if (jN2 != j.f46377b) {
                    jN2 += j12;
                }
            }
        } else {
            j10 = j.f46377b;
        }
        long j13 = jN;
        if (jN2 != j10) {
            j11 = jN2;
        } else if (jN3 != j10) {
            j11 = j13 + jN3;
        } else if (dVar != null) {
            long j14 = dVar.f49825e;
            if (j14 != j10) {
                j11 = j14;
            } else {
                j11 = jN2;
            }
        } else {
            j11 = jN2;
        }
        return d.c(xmlPullParser.getName(), j13, j11, gVarL, strArr, str, strSubstring, dVar);
    }

    /* JADX WARN: Code duplicated, block: B:60:0x0169  */
    /* JADX WARN: Code duplicated, block: B:81:0x01b6  */
    @p0
    private static e J(XmlPullParser xmlPullParser, a aVar, @p0 C0397c c0397c) {
        float f10;
        float f11;
        float f12;
        float f13;
        int i10;
        float f14;
        int i11;
        String strA = v0.a(xmlPullParser, "id");
        if (strA == null) {
            return null;
        }
        String strA2 = v0.a(xmlPullParser, "origin");
        if (strA2 == null) {
            u.m(f49763p, "Ignoring region without an origin");
            return null;
        }
        Pattern pattern = B;
        Matcher matcher = pattern.matcher(strA2);
        Pattern pattern2 = C;
        Matcher matcher2 = pattern2.matcher(strA2);
        if (matcher.matches()) {
            try {
                float f15 = Float.parseFloat((String) com.google.android.exoplayer2.util.a.g(matcher.group(1))) / 100.0f;
                f10 = Float.parseFloat((String) com.google.android.exoplayer2.util.a.g(matcher.group(2))) / 100.0f;
                f11 = f15;
            } catch (NumberFormatException unused) {
                u.m(f49763p, strA2.length() != 0 ? "Ignoring region with malformed origin: ".concat(strA2) : new String("Ignoring region with malformed origin: "));
                return null;
            }
        } else {
            if (!matcher2.matches()) {
                u.m(f49763p, strA2.length() != 0 ? "Ignoring region with unsupported origin: ".concat(strA2) : new String("Ignoring region with unsupported origin: "));
                return null;
            }
            if (c0397c == null) {
                u.m(f49763p, strA2.length() != 0 ? "Ignoring region with missing tts:extent: ".concat(strA2) : new String("Ignoring region with missing tts:extent: "));
                return null;
            }
            try {
                int i12 = Integer.parseInt((String) com.google.android.exoplayer2.util.a.g(matcher2.group(1)));
                int i13 = Integer.parseInt((String) com.google.android.exoplayer2.util.a.g(matcher2.group(2)));
                f11 = i12 / c0397c.f49780a;
                f10 = i13 / c0397c.f49781b;
            } catch (NumberFormatException unused2) {
                u.m(f49763p, strA2.length() != 0 ? "Ignoring region with malformed origin: ".concat(strA2) : new String("Ignoring region with malformed origin: "));
                return null;
            }
        }
        String strA3 = v0.a(xmlPullParser, d.F);
        if (strA3 == null) {
            u.m(f49763p, "Ignoring region without an extent");
            return null;
        }
        Matcher matcher3 = pattern.matcher(strA3);
        Matcher matcher4 = pattern2.matcher(strA3);
        if (matcher3.matches()) {
            try {
                f12 = Float.parseFloat((String) com.google.android.exoplayer2.util.a.g(matcher3.group(1))) / 100.0f;
                f13 = Float.parseFloat((String) com.google.android.exoplayer2.util.a.g(matcher3.group(2))) / 100.0f;
            } catch (NumberFormatException unused3) {
                u.m(f49763p, strA2.length() != 0 ? "Ignoring region with malformed extent: ".concat(strA2) : new String("Ignoring region with malformed extent: "));
                return null;
            }
        } else {
            if (!matcher4.matches()) {
                u.m(f49763p, strA2.length() != 0 ? "Ignoring region with unsupported extent: ".concat(strA2) : new String("Ignoring region with unsupported extent: "));
                return null;
            }
            if (c0397c == null) {
                u.m(f49763p, strA2.length() != 0 ? "Ignoring region with missing tts:extent: ".concat(strA2) : new String("Ignoring region with missing tts:extent: "));
                return null;
            }
            try {
                int i14 = Integer.parseInt((String) com.google.android.exoplayer2.util.a.g(matcher4.group(1)));
                int i15 = Integer.parseInt((String) com.google.android.exoplayer2.util.a.g(matcher4.group(2)));
                f12 = i14 / c0397c.f49780a;
                f13 = i15 / c0397c.f49781b;
            } catch (NumberFormatException unused4) {
                u.m(f49763p, strA2.length() != 0 ? "Ignoring region with malformed extent: ".concat(strA2) : new String("Ignoring region with malformed extent: "));
                return null;
            }
        }
        String strA4 = v0.a(xmlPullParser, d.G);
        if (strA4 != null) {
            String strG = com.google.common.base.a.g(strA4);
            strG.hashCode();
            if (strG.equals(d.f49794m0)) {
                f14 = f10 + (f13 / 2.0f);
                i10 = 1;
            } else if (strG.equals(d.f49785d0)) {
                f14 = f10 + f13;
                i10 = 2;
            } else {
                i10 = 0;
                f14 = f10;
            }
        } else {
            i10 = 0;
            f14 = f10;
        }
        float f16 = 1.0f / aVar.f49776b;
        String strA5 = v0.a(xmlPullParser, d.T);
        if (strA5 != null) {
            String strG2 = com.google.common.base.a.g(strA5);
            strG2.hashCode();
            switch (strG2) {
                case "tb":
                case "tblr":
                    i11 = 2;
                    break;
                case "tbrl":
                    i11 = 1;
                    break;
                default:
                    i11 = Integer.MIN_VALUE;
                    break;
            }
        } else {
            i11 = Integer.MIN_VALUE;
        }
        return new e(strA, f11, f14, 0, i10, f12, f13, 1, f16, i11);
    }

    private static float K(String str) {
        Matcher matcher = A.matcher(str);
        if (!matcher.matches()) {
            String strValueOf = String.valueOf(str);
            u.m(f49763p, strValueOf.length() != 0 ? "Invalid value for shear: ".concat(strValueOf) : new String("Invalid value for shear: "));
            return Float.MAX_VALUE;
        }
        try {
            return Math.min(100.0f, Math.max(-100.0f, Float.parseFloat((String) com.google.android.exoplayer2.util.a.g(matcher.group(1)))));
        } catch (NumberFormatException e10) {
            String strValueOf2 = String.valueOf(str);
            u.n(f49763p, strValueOf2.length() != 0 ? "Failed to parse shear: ".concat(strValueOf2) : new String("Failed to parse shear: "), e10);
            return Float.MAX_VALUE;
        }
    }

    private static g L(XmlPullParser xmlPullParser, g gVar) {
        int attributeCount = xmlPullParser.getAttributeCount();
        for (int i10 = 0; i10 < attributeCount; i10++) {
            String attributeValue = xmlPullParser.getAttributeValue(i10);
            String attributeName = xmlPullParser.getAttributeName(i10);
            attributeName.hashCode();
            switch (attributeName) {
                case "fontStyle":
                    gVar = A(gVar).C(d.f49791j0.equalsIgnoreCase(attributeValue));
                    break;
                case "fontFamily":
                    gVar = A(gVar).y(attributeValue);
                    break;
                case "textAlign":
                    gVar = A(gVar).I(C(attributeValue));
                    break;
                case "textDecoration":
                    String strG = com.google.common.base.a.g(attributeValue);
                    strG.hashCode();
                    switch (strG) {
                        case "nounderline":
                            gVar = A(gVar).L(false);
                            break;
                        case "underline":
                            gVar = A(gVar).L(true);
                            break;
                        case "nolinethrough":
                            gVar = A(gVar).D(false);
                            break;
                        case "linethrough":
                            gVar = A(gVar).D(true);
                            break;
                    }
                    break;
                case "fontWeight":
                    gVar = A(gVar).w(d.f49792k0.equalsIgnoreCase(attributeValue));
                    break;
                case "id":
                    if (!"style".equals(xmlPullParser.getName())) {
                        break;
                    } else {
                        gVar = A(gVar).B(attributeValue);
                        break;
                    }
                    break;
                case "ruby":
                    String strG2 = com.google.common.base.a.g(attributeValue);
                    strG2.hashCode();
                    switch (strG2) {
                        case "baseContainer":
                        case "base":
                            gVar = A(gVar).G(2);
                            break;
                        case "container":
                            gVar = A(gVar).G(1);
                            break;
                        case "delimiter":
                            gVar = A(gVar).G(4);
                            break;
                        case "textContainer":
                        case "text":
                            gVar = A(gVar).G(3);
                            break;
                    }
                    break;
                case "color":
                    gVar = A(gVar);
                    try {
                        gVar.x(com.google.android.exoplayer2.util.g.c(attributeValue));
                        break;
                    } catch (IllegalArgumentException unused) {
                        String strValueOf = String.valueOf(attributeValue);
                        u.m(f49763p, strValueOf.length() != 0 ? "Failed parsing color value: ".concat(strValueOf) : new String("Failed parsing color value: "));
                        break;
                    }
                    break;
                case "shear":
                    gVar = A(gVar).H(K(attributeValue));
                    break;
                case "textCombine":
                    String strG3 = com.google.common.base.a.g(attributeValue);
                    strG3.hashCode();
                    if (!strG3.equals("all")) {
                        if (strG3.equals("none")) {
                            gVar = A(gVar).J(false);
                        }
                        break;
                    } else {
                        gVar = A(gVar).J(true);
                        break;
                    }
                    break;
                case "fontSize":
                    try {
                        gVar = A(gVar);
                        E(attributeValue, gVar);
                        break;
                    } catch (SubtitleDecoderException unused2) {
                        String strValueOf2 = String.valueOf(attributeValue);
                        u.m(f49763p, strValueOf2.length() != 0 ? "Failed parsing fontSize value: ".concat(strValueOf2) : new String("Failed parsing fontSize value: "));
                        break;
                    }
                    break;
                case "textEmphasis":
                    gVar = A(gVar).K(com.google.android.exoplayer2.text.ttml.b.a(attributeValue));
                    break;
                case "rubyPosition":
                    String strG4 = com.google.common.base.a.g(attributeValue);
                    strG4.hashCode();
                    if (!strG4.equals(d.f49784c0)) {
                        if (strG4.equals(d.f49785d0)) {
                            gVar = A(gVar).F(2);
                        }
                        break;
                    } else {
                        gVar = A(gVar).F(1);
                        break;
                    }
                    break;
                case "backgroundColor":
                    gVar = A(gVar);
                    try {
                        gVar.v(com.google.android.exoplayer2.util.g.c(attributeValue));
                        break;
                    } catch (IllegalArgumentException unused3) {
                        String strValueOf3 = String.valueOf(attributeValue);
                        u.m(f49763p, strValueOf3.length() != 0 ? "Failed parsing background value: ".concat(strValueOf3) : new String("Failed parsing background value: "));
                        break;
                    }
                    break;
                case "multiRowAlign":
                    gVar = A(gVar).E(C(attributeValue));
                    break;
            }
        }
        return gVar;
    }

    private static String[] M(String str) {
        String strTrim = str.trim();
        return strTrim.isEmpty() ? new String[0] : u0.p1(strTrim, "\\s+");
    }

    private static long N(String str, b bVar) throws SubtitleDecoderException {
        double d10;
        double d11;
        Matcher matcher = f49771x.matcher(str);
        if (matcher.matches()) {
            double d12 = (Long.parseLong((String) com.google.android.exoplayer2.util.a.g(matcher.group(1))) * 3600) + (Long.parseLong((String) com.google.android.exoplayer2.util.a.g(matcher.group(2))) * 60) + Long.parseLong((String) com.google.android.exoplayer2.util.a.g(matcher.group(3)));
            String strGroup = matcher.group(4);
            double d13 = d12 + (strGroup != null ? Double.parseDouble(strGroup) : 0.0d);
            String strGroup2 = matcher.group(5);
            double d14 = d13 + (strGroup2 != null ? Long.parseLong(strGroup2) / bVar.f49777a : 0.0d);
            String strGroup3 = matcher.group(6);
            return (long) ((d14 + (strGroup3 != null ? (Long.parseLong(strGroup3) / ((double) bVar.f49778b)) / ((double) bVar.f49777a) : 0.0d)) * 1000000.0d);
        }
        Matcher matcher2 = f49772y.matcher(str);
        if (!matcher2.matches()) {
            String strValueOf = String.valueOf(str);
            throw new SubtitleDecoderException(strValueOf.length() != 0 ? "Malformed time expression: ".concat(strValueOf) : new String("Malformed time expression: "));
        }
        double d15 = Double.parseDouble((String) com.google.android.exoplayer2.util.a.g(matcher2.group(1)));
        String str2 = (String) com.google.android.exoplayer2.util.a.g(matcher2.group(2));
        str2.hashCode();
        switch (str2) {
            case "f":
                d10 = bVar.f49777a;
                d15 /= d10;
                return (long) (d15 * 1000000.0d);
            case "h":
                d11 = 3600.0d;
                break;
            case "m":
                d11 = 60.0d;
                break;
            case "t":
                d10 = bVar.f49779c;
                d15 /= d10;
                return (long) (d15 * 1000000.0d);
            case "ms":
                d10 = 1000.0d;
                d15 /= d10;
                return (long) (d15 * 1000000.0d);
            default:
                return (long) (d15 * 1000000.0d);
        }
        d15 *= d11;
        return (long) (d15 * 1000000.0d);
    }

    @p0
    private static C0397c O(XmlPullParser xmlPullParser) {
        String strA = v0.a(xmlPullParser, d.F);
        if (strA == null) {
            return null;
        }
        Matcher matcher = C.matcher(strA);
        if (!matcher.matches()) {
            u.m(f49763p, strA.length() != 0 ? "Ignoring non-pixel tts extent: ".concat(strA) : new String("Ignoring non-pixel tts extent: "));
            return null;
        }
        try {
            return new C0397c(Integer.parseInt((String) com.google.android.exoplayer2.util.a.g(matcher.group(1))), Integer.parseInt((String) com.google.android.exoplayer2.util.a.g(matcher.group(2))));
        } catch (NumberFormatException unused) {
            u.m(f49763p, strA.length() != 0 ? "Ignoring malformed tts extent: ".concat(strA) : new String("Ignoring malformed tts extent: "));
            return null;
        }
    }

    @Override // com.google.android.exoplayer2.text.f
    protected com.google.android.exoplayer2.text.g y(byte[] bArr, int i10, boolean z10) throws SubtitleDecoderException {
        b bVar;
        try {
            XmlPullParser xmlPullParserNewPullParser = this.f49774o.newPullParser();
            HashMap map = new HashMap();
            HashMap map2 = new HashMap();
            HashMap map3 = new HashMap();
            map2.put("", new e(""));
            C0397c c0397cO = null;
            xmlPullParserNewPullParser.setInput(new ByteArrayInputStream(bArr, 0, i10), null);
            ArrayDeque arrayDeque = new ArrayDeque();
            b bVarF = F;
            a aVarD = G;
            int i11 = 0;
            h hVar = null;
            for (int eventType = xmlPullParserNewPullParser.getEventType(); eventType != 1; eventType = xmlPullParserNewPullParser.getEventType()) {
                d dVar = (d) arrayDeque.peek();
                if (i11 == 0) {
                    String name = xmlPullParserNewPullParser.getName();
                    if (eventType == 2) {
                        if (d.f49795n.equals(name)) {
                            bVarF = F(xmlPullParserNewPullParser);
                            aVarD = D(xmlPullParserNewPullParser, G);
                            c0397cO = O(xmlPullParserNewPullParser);
                        }
                        C0397c c0397c = c0397cO;
                        b bVar2 = bVarF;
                        a aVar = aVarD;
                        if (B(name)) {
                            if ("head".equals(name)) {
                                bVar = bVar2;
                                G(xmlPullParserNewPullParser, map, aVar, c0397c, map2, map3);
                            } else {
                                bVar = bVar2;
                                try {
                                    d dVarI = I(xmlPullParserNewPullParser, dVar, map2, bVar);
                                    arrayDeque.push(dVarI);
                                    if (dVar != null) {
                                        dVar.a(dVarI);
                                    }
                                } catch (SubtitleDecoderException e10) {
                                    u.n(f49763p, "Suppressing parser error", e10);
                                    i11++;
                                }
                            }
                            bVarF = bVar;
                        } else {
                            String strValueOf = String.valueOf(xmlPullParserNewPullParser.getName());
                            u.h(f49763p, strValueOf.length() != 0 ? "Ignoring unsupported tag: ".concat(strValueOf) : new String("Ignoring unsupported tag: "));
                            i11++;
                            bVarF = bVar2;
                        }
                        c0397cO = c0397c;
                        aVarD = aVar;
                    } else if (eventType == 4) {
                        ((d) com.google.android.exoplayer2.util.a.g(dVar)).a(d.d(xmlPullParserNewPullParser.getText()));
                    } else if (eventType == 3) {
                        if (xmlPullParserNewPullParser.getName().equals(d.f49795n)) {
                            hVar = new h((d) com.google.android.exoplayer2.util.a.g((d) arrayDeque.peek()), map, map2, map3);
                        }
                        arrayDeque.pop();
                    }
                } else if (eventType == 2) {
                    i11++;
                } else if (eventType == 3) {
                    i11--;
                }
                xmlPullParserNewPullParser.next();
            }
            if (hVar != null) {
                return hVar;
            }
            throw new SubtitleDecoderException("No TTML subtitles found");
        } catch (IOException e11) {
            throw new IllegalStateException("Unexpected error when reading input.", e11);
        } catch (XmlPullParserException e12) {
            throw new SubtitleDecoderException("Unable to decode source", e12);
        }
    }
}
