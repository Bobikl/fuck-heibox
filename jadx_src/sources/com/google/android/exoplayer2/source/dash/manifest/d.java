package com.google.android.exoplayer2.source.dash.manifest;

import android.net.Uri;
import android.text.TextUtils;
import android.util.Base64;
import android.util.Pair;
import android.util.Xml;
import androidx.annotation.p0;
import com.google.android.exoplayer2.ParserException;
import com.google.android.exoplayer2.a2;
import com.google.android.exoplayer2.drm.DrmInitData;
import com.google.android.exoplayer2.metadata.emsg.EventMessage;
import com.google.android.exoplayer2.source.rtsp.k0;
import com.google.android.exoplayer2.upstream.i0;
import com.google.android.exoplayer2.util.q0;
import com.google.android.exoplayer2.util.u;
import com.google.android.exoplayer2.util.u0;
import com.google.android.exoplayer2.util.v0;
import com.google.android.exoplayer2.util.y;
import com.google.common.collect.ImmutableList;
import com.google.common.collect.Lists;
import com.starlightc.ucropplus.model.puzzle.BasePuzzleInfo;
import com.umeng.socialize.common.SocializeConstants;
import com.xiaomi.mipush.sdk.Constants;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.List;
import java.util.UUID;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import org.xml.sax.helpers.DefaultHandler;
import org.xmlpull.v1.XmlPullParser;
import org.xmlpull.v1.XmlPullParserException;
import org.xmlpull.v1.XmlPullParserFactory;
import org.xmlpull.v1.XmlSerializer;

/* JADX INFO: compiled from: DashManifestParser.java */
/* JADX INFO: loaded from: classes7.dex */
public class d extends DefaultHandler implements i0.a<c> {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static final String f47886c = "MpdParser";

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private static final Pattern f47887d = Pattern.compile("(\\d+)(?:/(\\d+))?");

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private static final Pattern f47888e = Pattern.compile("CC([1-4])=.*");

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private static final Pattern f47889f = Pattern.compile("([1-9]|[1-5][0-9]|6[0-3])=.*");

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private static final int[] f47890g = {-1, 1, 2, 3, 4, 5, 6, 8, 2, 3, 4, 7, 8, 24, 8, 12, 10, 12, 14, 12, 14};

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final XmlPullParserFactory f47891b;

    /* JADX INFO: compiled from: DashManifestParser.java */
    public static final class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final a2 f47892a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final ImmutableList<b> f47893b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final k f47894c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        @p0
        public final String f47895d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public final ArrayList<DrmInitData.SchemeData> f47896e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public final ArrayList<e> f47897f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        public final long f47898g;

        public a(a2 a2Var, List<b> list, k kVar, @p0 String str, ArrayList<DrmInitData.SchemeData> arrayList, ArrayList<e> arrayList2, long j10) {
            this.f47892a = a2Var;
            this.f47893b = ImmutableList.v(list);
            this.f47894c = kVar;
            this.f47895d = str;
            this.f47896e = arrayList;
            this.f47897f = arrayList2;
            this.f47898g = j10;
        }
    }

    public d() {
        try {
            this.f47891b = XmlPullParserFactory.newInstance();
        } catch (XmlPullParserException e10) {
            throw new RuntimeException("Couldn't create XmlPullParserFactory instance", e10);
        }
    }

    protected static int B(List<e> list) {
        String str;
        for (int i10 = 0; i10 < list.size(); i10++) {
            e eVar = list.get(i10);
            if ("urn:scte:dash:cc:cea-608:2015".equals(eVar.f47899a) && (str = eVar.f47900b) != null) {
                Matcher matcher = f47888e.matcher(str);
                if (matcher.matches()) {
                    return Integer.parseInt(matcher.group(1));
                }
                String strValueOf = String.valueOf(eVar.f47900b);
                u.m(f47886c, strValueOf.length() != 0 ? "Unable to parse CEA-608 channel number from: ".concat(strValueOf) : new String("Unable to parse CEA-608 channel number from: "));
            }
        }
        return -1;
    }

    protected static int C(List<e> list) {
        String str;
        for (int i10 = 0; i10 < list.size(); i10++) {
            e eVar = list.get(i10);
            if ("urn:scte:dash:cc:cea-708:2015".equals(eVar.f47899a) && (str = eVar.f47900b) != null) {
                Matcher matcher = f47889f.matcher(str);
                if (matcher.matches()) {
                    return Integer.parseInt(matcher.group(1));
                }
                String strValueOf = String.valueOf(eVar.f47900b);
                u.m(f47886c, strValueOf.length() != 0 ? "Unable to parse CEA-708 service block number from: ".concat(strValueOf) : new String("Unable to parse CEA-708 service block number from: "));
            }
        }
        return -1;
    }

    protected static long F(XmlPullParser xmlPullParser, String str, long j10) throws ParserException {
        String attributeValue = xmlPullParser.getAttributeValue(null, str);
        return attributeValue == null ? j10 : u0.c1(attributeValue);
    }

    protected static e G(XmlPullParser xmlPullParser, String str) throws XmlPullParserException, IOException {
        String strM0 = m0(xmlPullParser, "schemeIdUri", "");
        String strM1 = m0(xmlPullParser, "value", null);
        String strM2 = m0(xmlPullParser, "id", null);
        do {
            xmlPullParser.next();
        } while (!v0.d(xmlPullParser, str));
        return new e(strM0, strM1, strM2);
    }

    protected static int H(XmlPullParser xmlPullParser) {
        String attributeValue = xmlPullParser.getAttributeValue(null, "value");
        if (attributeValue == null) {
            return -1;
        }
        String strG = com.google.common.base.a.g(attributeValue);
        strG.hashCode();
        switch (strG) {
            case "4000":
                return 1;
            case "a000":
                return 2;
            case "f801":
                return 6;
            case "fa01":
                return 8;
            default:
                return -1;
        }
    }

    protected static long I(XmlPullParser xmlPullParser, String str, long j10) {
        String attributeValue = xmlPullParser.getAttributeValue(null, str);
        return attributeValue == null ? j10 : u0.d1(attributeValue);
    }

    protected static String J(List<e> list) {
        for (int i10 = 0; i10 < list.size(); i10++) {
            e eVar = list.get(i10);
            String str = eVar.f47899a;
            if ("tag:dolby.com,2018:dash:EC3_ExtensionType:2018".equals(str) && "JOC".equals(eVar.f47900b)) {
                return y.N;
            }
            if ("tag:dolby.com,2014:dash:DolbyDigitalPlusExtensionType:2014".equals(str) && y.J0.equals(eVar.f47900b)) {
                return y.N;
            }
        }
        return y.M;
    }

    protected static float N(XmlPullParser xmlPullParser, String str, float f10) {
        String attributeValue = xmlPullParser.getAttributeValue(null, str);
        return attributeValue == null ? f10 : Float.parseFloat(attributeValue);
    }

    protected static float O(XmlPullParser xmlPullParser, float f10) {
        String attributeValue = xmlPullParser.getAttributeValue(null, "frameRate");
        if (attributeValue == null) {
            return f10;
        }
        Matcher matcher = f47887d.matcher(attributeValue);
        if (!matcher.matches()) {
            return f10;
        }
        int i10 = Integer.parseInt(matcher.group(1));
        String strGroup = matcher.group(2);
        return !TextUtils.isEmpty(strGroup) ? i10 / Integer.parseInt(strGroup) : i10;
    }

    protected static int Q(XmlPullParser xmlPullParser, String str, int i10) {
        String attributeValue = xmlPullParser.getAttributeValue(null, str);
        return attributeValue == null ? i10 : Integer.parseInt(attributeValue);
    }

    protected static long S(List<e> list) {
        for (int i10 = 0; i10 < list.size(); i10++) {
            e eVar = list.get(i10);
            if (com.google.common.base.a.a("http://dashif.org/guidelines/last-segment-number", eVar.f47899a)) {
                return Long.parseLong(eVar.f47900b);
            }
        }
        return -1L;
    }

    protected static long T(XmlPullParser xmlPullParser, String str, long j10) {
        String attributeValue = xmlPullParser.getAttributeValue(null, str);
        return attributeValue == null ? j10 : Long.parseLong(attributeValue);
    }

    protected static int V(XmlPullParser xmlPullParser) {
        int iQ = Q(xmlPullParser, "value", -1);
        if (iQ < 0) {
            return -1;
        }
        int[] iArr = f47890g;
        if (iQ < iArr.length) {
            return iArr[iQ];
        }
        return -1;
    }

    private long b(List<k.d> list, long j10, long j11, int i10, long j12) {
        int iN = i10 >= 0 ? i10 + 1 : (int) u0.n(j12 - j10, j11);
        for (int i11 = 0; i11 < iN; i11++) {
            list.add(m(j10, j11));
            j10 += j11;
        }
        return j10;
    }

    protected static String m0(XmlPullParser xmlPullParser, String str, String str2) {
        String attributeValue = xmlPullParser.getAttributeValue(null, str);
        return attributeValue == null ? str2 : attributeValue;
    }

    protected static String n0(XmlPullParser xmlPullParser, String str) throws XmlPullParserException, IOException {
        String text = "";
        do {
            xmlPullParser.next();
            if (xmlPullParser.getEventType() == 4) {
                text = xmlPullParser.getText();
            } else {
                u(xmlPullParser);
            }
        } while (!v0.d(xmlPullParser, str));
        return text;
    }

    private static int p(int i10, int i11) {
        if (i10 == -1) {
            return i11;
        }
        if (i11 == -1) {
            return i10;
        }
        com.google.android.exoplayer2.util.a.i(i10 == i11);
        return i10;
    }

    @p0
    private static String q(@p0 String str, @p0 String str2) {
        if (str == null) {
            return str2;
        }
        if (str2 == null) {
            return str;
        }
        com.google.android.exoplayer2.util.a.i(str.equals(str2));
        return str;
    }

    private static void r(ArrayList<DrmInitData.SchemeData> arrayList) {
        for (int size = arrayList.size() - 1; size >= 0; size--) {
            DrmInitData.SchemeData schemeData = arrayList.get(size);
            if (!schemeData.c()) {
                for (int i10 = 0; i10 < arrayList.size(); i10++) {
                    if (arrayList.get(i10).a(schemeData)) {
                        arrayList.remove(size);
                        break;
                    }
                }
            }
        }
    }

    private static long s(long j10, long j11) {
        if (j11 != com.google.android.exoplayer2.j.f46377b) {
            j10 = j11;
        }
        return j10 == Long.MAX_VALUE ? com.google.android.exoplayer2.j.f46377b : j10;
    }

    @p0
    private static String t(@p0 String str, @p0 String str2) {
        if (y.p(str)) {
            return y.c(str2);
        }
        if (y.t(str)) {
            return y.o(str2);
        }
        if (y.s(str)) {
            return y.f51607x0.equals(str) ? y.j(str2) : str;
        }
        if (y.q(str)) {
            return str;
        }
        if (!y.f51579j0.equals(str)) {
            return null;
        }
        String strG = y.g(str2);
        return "text/vtt".equals(strG) ? y.f51603v0 : strG;
    }

    public static void u(XmlPullParser xmlPullParser) throws XmlPullParserException, IOException {
        if (v0.e(xmlPullParser)) {
            int i10 = 1;
            while (i10 != 0) {
                xmlPullParser.next();
                if (v0.e(xmlPullParser)) {
                    i10++;
                } else if (v0.c(xmlPullParser)) {
                    i10--;
                }
            }
        }
    }

    protected List<b> A(XmlPullParser xmlPullParser, List<b> list) throws XmlPullParserException, IOException {
        String attributeValue = xmlPullParser.getAttributeValue(null, "dvb:priority");
        int i10 = attributeValue != null ? Integer.parseInt(attributeValue) : 1;
        String attributeValue2 = xmlPullParser.getAttributeValue(null, "dvb:weight");
        int i11 = attributeValue2 != null ? Integer.parseInt(attributeValue2) : 1;
        String attributeValue3 = xmlPullParser.getAttributeValue(null, "serviceLocation");
        String strN0 = n0(xmlPullParser, "BaseURL");
        if (attributeValue3 == null) {
            attributeValue3 = strN0;
        }
        if (q0.b(strN0)) {
            return Lists.t(new b(strN0, attributeValue3, i10, i11));
        }
        ArrayList arrayList = new ArrayList();
        for (int i12 = 0; i12 < list.size(); i12++) {
            b bVar = list.get(i12);
            arrayList.add(new b(q0.e(bVar.f47869a, strN0), bVar.f47870b, bVar.f47871c, bVar.f47872d));
        }
        return arrayList;
    }

    /* JADX WARN: Code duplicated, block: B:34:0x0082  */
    /* JADX WARN: Code duplicated, block: B:58:0x00ea  */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r4v10, types: [byte[]] */
    /* JADX WARN: Type inference failed for: r4v2 */
    /* JADX WARN: Type inference failed for: r4v20 */
    /* JADX WARN: Type inference failed for: r4v21 */
    /* JADX WARN: Type inference failed for: r4v22 */
    /* JADX WARN: Type inference failed for: r4v23 */
    /* JADX WARN: Type inference failed for: r4v24 */
    /* JADX WARN: Type inference failed for: r4v3 */
    /* JADX WARN: Type inference failed for: r4v8 */
    /* JADX WARN: Type inference failed for: r4v9 */
    /* JADX WARN: Type inference failed for: r5v0 */
    /* JADX WARN: Type inference failed for: r5v1 */
    /* JADX WARN: Type inference failed for: r5v10 */
    /* JADX WARN: Type inference failed for: r5v11 */
    /* JADX WARN: Type inference failed for: r5v12 */
    /* JADX WARN: Type inference failed for: r5v13 */
    /* JADX WARN: Type inference failed for: r5v14 */
    /* JADX WARN: Type inference failed for: r5v2 */
    /* JADX WARN: Type inference failed for: r5v3, types: [java.lang.String] */
    /* JADX WARN: Type inference failed for: r5v8 */
    protected Pair<String, DrmInitData.SchemeData> D(XmlPullParser xmlPullParser) throws XmlPullParserException, IOException {
        String attributeValue;
        UUID uuid;
        UUID uuid2;
        ?? attributeValue2;
        ?? B;
        String attributeValue3 = xmlPullParser.getAttributeValue(null, "schemeIdUri");
        if (attributeValue3 != null) {
            String strG = com.google.common.base.a.g(attributeValue3);
            strG.hashCode();
            switch (strG) {
                case "urn:uuid:9a04f079-9840-4286-ab92-e65be0885f95":
                    uuid = com.google.android.exoplayer2.j.Y1;
                    attributeValue = null;
                    uuid2 = null;
                    attributeValue2 = uuid2;
                    B = uuid2;
                    break;
                case "urn:uuid:edef8ba9-79d6-4ace-a3c8-27dcd51d21ed":
                    uuid = com.google.android.exoplayer2.j.X1;
                    attributeValue = null;
                    uuid2 = null;
                    attributeValue2 = uuid2;
                    B = uuid2;
                    break;
                case "urn:mpeg:dash:mp4protection:2011":
                    attributeValue = xmlPullParser.getAttributeValue(null, "value");
                    String strB = v0.b(xmlPullParser, "default_KID");
                    if (!TextUtils.isEmpty(strB) && !"00000000-0000-0000-0000-000000000000".equals(strB)) {
                        String[] strArrSplit = strB.split("\\s+");
                        UUID[] uuidArr = new UUID[strArrSplit.length];
                        for (int i10 = 0; i10 < strArrSplit.length; i10++) {
                            uuidArr[i10] = UUID.fromString(strArrSplit[i10]);
                        }
                        uuid = com.google.android.exoplayer2.j.V1;
                        attributeValue2 = 0;
                        B = com.google.android.exoplayer2.extractor.mp4.l.b(uuid, uuidArr, null);
                        break;
                    } else {
                        uuid = null;
                        uuid2 = uuid;
                        attributeValue2 = uuid2;
                        B = uuid2;
                        break;
                    }
                    break;
                default:
                    attributeValue = null;
                    uuid = null;
                    uuid2 = uuid;
                    attributeValue2 = uuid2;
                    B = uuid2;
                    break;
            }
        } else {
            attributeValue = null;
            uuid = null;
            uuid2 = uuid;
            attributeValue2 = uuid2;
            B = uuid2;
        }
        do {
            xmlPullParser.next();
            if (v0.f(xmlPullParser, "ms:laurl")) {
                B = B;
                attributeValue2 = xmlPullParser.getAttributeValue(null, "licenseUrl");
            } else if (B == 0 && v0.g(xmlPullParser, "pssh") && xmlPullParser.next() == 4) {
                byte[] bArrDecode = Base64.decode(xmlPullParser.getText(), 0);
                UUID uuidF = com.google.android.exoplayer2.extractor.mp4.l.f(bArrDecode);
                if (uuidF == null) {
                    u.m(f47886c, "Skipping malformed cenc:pssh data");
                    uuid = uuidF;
                    B = 0;
                    attributeValue2 = attributeValue2;
                } else {
                    B = bArrDecode;
                    uuid = uuidF;
                    attributeValue2 = attributeValue2;
                }
            } else if (B == 0) {
                UUID uuid3 = com.google.android.exoplayer2.j.Y1;
                if (uuid3.equals(uuid) && v0.f(xmlPullParser, "mspr:pro") && xmlPullParser.next() == 4) {
                    B = com.google.android.exoplayer2.extractor.mp4.l.a(uuid3, Base64.decode(xmlPullParser.getText(), 0));
                    attributeValue2 = attributeValue2;
                } else {
                    u(xmlPullParser);
                    B = B;
                    attributeValue2 = attributeValue2;
                }
            } else {
                u(xmlPullParser);
                B = B;
                attributeValue2 = attributeValue2;
            }
        } while (!v0.d(xmlPullParser, "ContentProtection"));
        return Pair.create(attributeValue, uuid != null ? new DrmInitData.SchemeData(uuid, attributeValue2, "video/mp4", B) : null);
    }

    protected int E(XmlPullParser xmlPullParser) {
        String attributeValue = xmlPullParser.getAttributeValue(null, "contentType");
        if (TextUtils.isEmpty(attributeValue)) {
            return -1;
        }
        if ("audio".equals(attributeValue)) {
            return 1;
        }
        if ("video".equals(attributeValue)) {
            return 2;
        }
        return "text".equals(attributeValue) ? 3 : -1;
    }

    protected Pair<Long, EventMessage> K(XmlPullParser xmlPullParser, String str, String str2, long j10, ByteArrayOutputStream byteArrayOutputStream) throws XmlPullParserException, IOException {
        long jT = T(xmlPullParser, "id", 0L);
        long jT2 = T(xmlPullParser, "duration", com.google.android.exoplayer2.j.f46377b);
        long jT3 = T(xmlPullParser, "presentationTime", 0L);
        long jJ1 = u0.j1(jT2, 1000L, j10);
        long jJ2 = u0.j1(jT3, 1000000L, j10);
        String strM0 = m0(xmlPullParser, "messageData", null);
        byte[] bArrL = L(xmlPullParser, byteArrayOutputStream);
        Long lValueOf = Long.valueOf(jJ2);
        if (strM0 != null) {
            bArrL = u0.y0(strM0);
        }
        return Pair.create(lValueOf, d(str, str2, jT, jJ1, bArrL));
    }

    protected byte[] L(XmlPullParser xmlPullParser, ByteArrayOutputStream byteArrayOutputStream) throws XmlPullParserException, IOException {
        byteArrayOutputStream.reset();
        XmlSerializer xmlSerializerNewSerializer = Xml.newSerializer();
        xmlSerializerNewSerializer.setOutput(byteArrayOutputStream, com.google.common.base.c.f56721c.name());
        xmlPullParser.nextToken();
        while (!v0.d(xmlPullParser, "Event")) {
            switch (xmlPullParser.getEventType()) {
                case 0:
                    xmlSerializerNewSerializer.startDocument(null, Boolean.FALSE);
                    break;
                case 1:
                    xmlSerializerNewSerializer.endDocument();
                    break;
                case 2:
                    xmlSerializerNewSerializer.startTag(xmlPullParser.getNamespace(), xmlPullParser.getName());
                    for (int i10 = 0; i10 < xmlPullParser.getAttributeCount(); i10++) {
                        xmlSerializerNewSerializer.attribute(xmlPullParser.getAttributeNamespace(i10), xmlPullParser.getAttributeName(i10), xmlPullParser.getAttributeValue(i10));
                    }
                    break;
                case 3:
                    xmlSerializerNewSerializer.endTag(xmlPullParser.getNamespace(), xmlPullParser.getName());
                    break;
                case 4:
                    xmlSerializerNewSerializer.text(xmlPullParser.getText());
                    break;
                case 5:
                    xmlSerializerNewSerializer.cdsect(xmlPullParser.getText());
                    break;
                case 6:
                    xmlSerializerNewSerializer.entityRef(xmlPullParser.getText());
                    break;
                case 7:
                    xmlSerializerNewSerializer.ignorableWhitespace(xmlPullParser.getText());
                    break;
                case 8:
                    xmlSerializerNewSerializer.processingInstruction(xmlPullParser.getText());
                    break;
                case 9:
                    xmlSerializerNewSerializer.comment(xmlPullParser.getText());
                    break;
                case 10:
                    xmlSerializerNewSerializer.docdecl(xmlPullParser.getText());
                    break;
            }
            xmlPullParser.nextToken();
        }
        xmlSerializerNewSerializer.flush();
        return byteArrayOutputStream.toByteArray();
    }

    protected f M(XmlPullParser xmlPullParser) throws XmlPullParserException, IOException {
        String strM0 = m0(xmlPullParser, "schemeIdUri", "");
        String strM1 = m0(xmlPullParser, "value", "");
        long jT = T(xmlPullParser, "timescale", 1L);
        ArrayList arrayList = new ArrayList();
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream(512);
        do {
            xmlPullParser.next();
            if (v0.f(xmlPullParser, "Event")) {
                arrayList.add(K(xmlPullParser, strM0, strM1, jT, byteArrayOutputStream));
            } else {
                u(xmlPullParser);
            }
        } while (!v0.d(xmlPullParser, "EventStream"));
        long[] jArr = new long[arrayList.size()];
        EventMessage[] eventMessageArr = new EventMessage[arrayList.size()];
        for (int i10 = 0; i10 < arrayList.size(); i10++) {
            Pair pair = (Pair) arrayList.get(i10);
            jArr[i10] = ((Long) pair.first).longValue();
            eventMessageArr[i10] = (EventMessage) pair.second;
        }
        return e(strM0, strM1, jT, jArr, eventMessageArr);
    }

    protected i P(XmlPullParser xmlPullParser) {
        return Y(xmlPullParser, "sourceURL", k0.f48802q);
    }

    protected String R(XmlPullParser xmlPullParser) throws XmlPullParserException, IOException {
        return n0(xmlPullParser, "Label");
    }

    /* JADX WARN: Code duplicated, block: B:62:0x0179  */
    /* JADX WARN: Code duplicated, block: B:64:0x017d  */
    /* JADX WARN: Code duplicated, block: B:65:0x0180 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:67:0x0183  */
    /* JADX WARN: Code duplicated, block: B:69:0x018a  */
    /* JADX WARN: Code duplicated, block: B:72:0x0192  */
    /* JADX WARN: Code duplicated, block: B:74:0x01b2  */
    /* JADX WARN: Code duplicated, block: B:76:0x01b9 A[LOOP:0: B:20:0x0082->B:76:0x01b9, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:78:0x0175 A[SYNTHETIC] */
    protected c U(XmlPullParser xmlPullParser, b bVar) throws XmlPullParserException, IOException {
        long j10;
        ArrayList arrayList;
        List<b> list;
        Throwable th2;
        boolean z10;
        List<g> list2;
        long j11;
        long jF = F(xmlPullParser, "availabilityStartTime", com.google.android.exoplayer2.j.f46377b);
        long jI = I(xmlPullParser, "mediaPresentationDuration", com.google.android.exoplayer2.j.f46377b);
        long jI2 = I(xmlPullParser, "minBufferTime", com.google.android.exoplayer2.j.f46377b);
        Throwable th3 = null;
        boolean zEquals = "dynamic".equals(xmlPullParser.getAttributeValue(null, "type"));
        long jI3 = zEquals ? I(xmlPullParser, "minimumUpdatePeriod", com.google.android.exoplayer2.j.f46377b) : -9223372036854775807L;
        long jI4 = zEquals ? I(xmlPullParser, "timeShiftBufferDepth", com.google.android.exoplayer2.j.f46377b) : -9223372036854775807L;
        long jI5 = zEquals ? I(xmlPullParser, "suggestedPresentationDelay", com.google.android.exoplayer2.j.f46377b) : -9223372036854775807L;
        long jF2 = F(xmlPullParser, "publishTime", com.google.android.exoplayer2.j.f46377b);
        long j12 = zEquals ? 0L : -9223372036854775807L;
        boolean z11 = true;
        List<b> listT = Lists.t(bVar);
        List<g> arrayList2 = new ArrayList<>();
        ArrayList arrayList3 = new ArrayList();
        long j13 = zEquals ? -9223372036854775807L : 0L;
        long jZ = j12;
        boolean z12 = false;
        boolean z13 = false;
        h hVarX = null;
        o oVarQ0 = null;
        Uri uri = null;
        l lVarL0 = null;
        while (true) {
            xmlPullParser.next();
            if (v0.f(xmlPullParser, "BaseURL")) {
                if (!z12) {
                    jZ = z(xmlPullParser, jZ);
                    z12 = z11;
                }
                arrayList3.addAll(A(xmlPullParser, listT));
            } else if (v0.f(xmlPullParser, "ProgramInformation")) {
                hVarX = X(xmlPullParser);
            } else if (v0.f(xmlPullParser, "UTCTiming")) {
                oVarQ0 = q0(xmlPullParser);
            } else if (v0.f(xmlPullParser, "Location")) {
                uri = Uri.parse(xmlPullParser.nextText());
            } else {
                if (v0.f(xmlPullParser, "ServiceDescription")) {
                    lVarL0 = l0(xmlPullParser);
                } else {
                    if (!v0.f(xmlPullParser, "Period") || z13) {
                        j10 = jZ;
                        arrayList = arrayList3;
                        list = listT;
                        th2 = th3;
                        z10 = z11;
                        list2 = arrayList2;
                        u(xmlPullParser);
                    } else {
                        j10 = jZ;
                        arrayList = arrayList3;
                        list = listT;
                        list2 = arrayList2;
                        z10 = z11;
                        Pair<g, Long> pairW = W(xmlPullParser, !arrayList3.isEmpty() ? arrayList3 : listT, j13, j10, jF, jI4);
                        g gVar = (g) pairW.first;
                        if (gVar.f47908b != com.google.android.exoplayer2.j.f46377b) {
                            th2 = null;
                            long jLongValue = ((Long) pairW.second).longValue();
                            j13 = jLongValue == com.google.android.exoplayer2.j.f46377b ? -9223372036854775807L : gVar.f47908b + jLongValue;
                            list2.add(gVar);
                        } else {
                            if (!zEquals) {
                                int size = list2.size();
                                StringBuilder sb2 = new StringBuilder(47);
                                sb2.append("Unable to determine start of period ");
                                sb2.append(size);
                                throw ParserException.c(sb2.toString(), null);
                            }
                            list2 = list2;
                            z13 = z10;
                            th2 = null;
                        }
                    }
                    jZ = j10;
                }
                if (v0.d(xmlPullParser, "MPD")) {
                    if (jI != com.google.android.exoplayer2.j.f46377b) {
                        j11 = jI;
                    } else if (j13 != com.google.android.exoplayer2.j.f46377b) {
                        j11 = j13;
                    } else {
                        if (!zEquals) {
                            throw ParserException.c("Unable to determine duration of static manifest.", th2);
                        }
                        j11 = jI;
                    }
                    if (list2.isEmpty()) {
                        throw ParserException.c("No periods found.", th2);
                    }
                    return g(jF, j11, jI2, zEquals, jI3, jI4, jI5, jF2, hVarX, oVarQ0, lVarL0, uri, list2);
                }
                th3 = th2;
                arrayList2 = list2;
                arrayList3 = arrayList;
                listT = list;
                z11 = z10;
            }
            arrayList = arrayList3;
            list = listT;
            th2 = th3;
            z10 = z11;
            list2 = arrayList2;
            if (v0.d(xmlPullParser, "MPD")) {
                if (jI != com.google.android.exoplayer2.j.f46377b) {
                    j11 = jI;
                } else if (j13 != com.google.android.exoplayer2.j.f46377b) {
                    j11 = j13;
                } else {
                    if (!zEquals) {
                        throw ParserException.c("Unable to determine duration of static manifest.", th2);
                    }
                    j11 = jI;
                }
                if (list2.isEmpty()) {
                    return g(jF, j11, jI2, zEquals, jI3, jI4, jI5, jF2, hVarX, oVarQ0, lVarL0, uri, list2);
                }
                throw ParserException.c("No periods found.", th2);
            }
            th3 = th2;
            arrayList2 = list2;
            arrayList3 = arrayList;
            listT = list;
            z11 = z10;
        }
    }

    protected Pair<g, Long> W(XmlPullParser xmlPullParser, List<b> list, long j10, long j11, long j12, long j13) throws XmlPullParserException, IOException {
        ArrayList arrayList;
        List<com.google.android.exoplayer2.source.dash.manifest.a> list2;
        List<f> list3;
        Object obj;
        long j14;
        k kVarG0;
        Object obj2 = null;
        String attributeValue = xmlPullParser.getAttributeValue(null, "id");
        long jI = I(xmlPullParser, com.google.android.exoplayer2.text.ttml.d.f49798o0, j10);
        long j15 = com.google.android.exoplayer2.j.f46377b;
        long j16 = j12 != com.google.android.exoplayer2.j.f46377b ? j12 + jI : -9223372036854775807L;
        long jI2 = I(xmlPullParser, "duration", com.google.android.exoplayer2.j.f46377b);
        List<com.google.android.exoplayer2.source.dash.manifest.a> arrayList2 = new ArrayList<>();
        List<f> arrayList3 = new ArrayList<>();
        ArrayList arrayList4 = new ArrayList();
        long jZ = j11;
        boolean z10 = false;
        long j17 = -9223372036854775807L;
        k kVarE0 = null;
        e eVarG = null;
        while (true) {
            xmlPullParser.next();
            if (v0.f(xmlPullParser, "BaseURL")) {
                if (!z10) {
                    jZ = z(xmlPullParser, jZ);
                    z10 = true;
                }
                arrayList4.addAll(A(xmlPullParser, list));
                list3 = arrayList3;
                arrayList = arrayList4;
                j14 = j15;
                obj = obj2;
                list2 = arrayList2;
            } else {
                if (v0.f(xmlPullParser, "AdaptationSet")) {
                    jZ = jZ;
                    arrayList = arrayList4;
                    list2 = arrayList2;
                    list2.add(w(xmlPullParser, !arrayList4.isEmpty() ? arrayList4 : list, kVarE0, jI2, jZ, j17, j16, j13));
                    list3 = arrayList3;
                } else {
                    jZ = jZ;
                    List<f> list4 = arrayList3;
                    arrayList = arrayList4;
                    list2 = arrayList2;
                    if (v0.f(xmlPullParser, "EventStream")) {
                        list4.add(M(xmlPullParser));
                        list3 = list4;
                    } else if (v0.f(xmlPullParser, "SegmentBase")) {
                        list3 = list4;
                        kVarE0 = e0(xmlPullParser, null);
                        obj = null;
                        jZ = jZ;
                        j14 = com.google.android.exoplayer2.j.f46377b;
                    } else {
                        list3 = list4;
                        if (v0.f(xmlPullParser, "SegmentList")) {
                            long jZ2 = z(xmlPullParser, com.google.android.exoplayer2.j.f46377b);
                            obj = null;
                            kVarG0 = f0(xmlPullParser, null, j16, jI2, jZ, jZ2, j13);
                            j17 = jZ2;
                            j14 = com.google.android.exoplayer2.j.f46377b;
                        } else {
                            obj = null;
                            if (v0.f(xmlPullParser, "SegmentTemplate")) {
                                long jZ3 = z(xmlPullParser, com.google.android.exoplayer2.j.f46377b);
                                j14 = -9223372036854775807L;
                                kVarG0 = g0(xmlPullParser, null, ImmutableList.B(), j16, jI2, jZ, jZ3, j13);
                                j17 = jZ3;
                            } else {
                                j14 = com.google.android.exoplayer2.j.f46377b;
                                if (v0.f(xmlPullParser, "AssetIdentifier")) {
                                    eVarG = G(xmlPullParser, "AssetIdentifier");
                                } else {
                                    u(xmlPullParser);
                                }
                                jZ = jZ;
                            }
                        }
                        kVarE0 = kVarG0;
                    }
                }
                obj = null;
                j14 = com.google.android.exoplayer2.j.f46377b;
                jZ = jZ;
            }
            if (v0.d(xmlPullParser, "Period")) {
                return Pair.create(h(attributeValue, jI, list2, list3, eVarG), Long.valueOf(jI2));
            }
            arrayList2 = list2;
            arrayList4 = arrayList;
            obj2 = obj;
            arrayList3 = list3;
            j15 = j14;
        }
    }

    protected h X(XmlPullParser xmlPullParser) throws XmlPullParserException, IOException {
        String strNextText = null;
        String strM0 = m0(xmlPullParser, "moreInformationURL", null);
        String strM1 = m0(xmlPullParser, "lang", null);
        String strNextText2 = null;
        String strNextText3 = null;
        while (true) {
            xmlPullParser.next();
            if (v0.f(xmlPullParser, "Title")) {
                strNextText = xmlPullParser.nextText();
            } else if (v0.f(xmlPullParser, "Source")) {
                strNextText2 = xmlPullParser.nextText();
            } else if (v0.f(xmlPullParser, androidx.exifinterface.media.a.f23215a0)) {
                strNextText3 = xmlPullParser.nextText();
            } else {
                u(xmlPullParser);
            }
            String str = strNextText3;
            if (v0.d(xmlPullParser, "ProgramInformation")) {
                return new h(strNextText, strNextText2, str, strM0, strM1);
            }
            strNextText3 = str;
        }
    }

    protected i Y(XmlPullParser xmlPullParser, String str, String str2) {
        long j10;
        long j11;
        String attributeValue = xmlPullParser.getAttributeValue(null, str);
        String attributeValue2 = xmlPullParser.getAttributeValue(null, str2);
        if (attributeValue2 != null) {
            String[] strArrSplit = attributeValue2.split(Constants.ACCEPT_TIME_SEPARATOR_SERVER);
            j10 = Long.parseLong(strArrSplit[0]);
            if (strArrSplit.length == 2) {
                j11 = (Long.parseLong(strArrSplit[1]) - j10) + 1;
            }
            return i(attributeValue, j10, j11);
        }
        j10 = 0;
        j11 = -1;
        return i(attributeValue, j10, j11);
    }

    /* JADX WARN: Code duplicated, block: B:57:0x01e2 A[LOOP:0: B:3:0x006a->B:57:0x01e2, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:58:0x0190 A[EDGE_INSN: B:58:0x0190->B:47:0x0190 BREAK  A[LOOP:0: B:3:0x006a->B:57:0x01e2], SYNTHETIC] */
    protected a Z(XmlPullParser xmlPullParser, List<b> list, @p0 String str, @p0 String str2, int i10, int i11, float f10, int i12, int i13, @p0 String str3, List<e> list2, List<e> list3, List<e> list4, List<e> list5, @p0 k kVar, long j10, long j11, long j12, long j13, long j14) throws XmlPullParserException, IOException {
        long j15;
        ArrayList arrayList;
        ArrayList arrayList2;
        ArrayList arrayList3;
        ArrayList arrayList4;
        ArrayList arrayList5;
        long jZ;
        ArrayList arrayList6;
        k eVar;
        ArrayList arrayList7;
        ArrayList arrayList8;
        ArrayList arrayList9;
        String attributeValue = xmlPullParser.getAttributeValue(null, "id");
        int iQ = Q(xmlPullParser, "bandwidth", -1);
        String strM0 = m0(xmlPullParser, "mimeType", str);
        String strM1 = m0(xmlPullParser, "codecs", str2);
        int iQ2 = Q(xmlPullParser, "width", i10);
        int iQ3 = Q(xmlPullParser, "height", i11);
        float fO = O(xmlPullParser, f10);
        int iQ4 = Q(xmlPullParser, "audioSamplingRate", i13);
        ArrayList arrayList10 = new ArrayList();
        ArrayList arrayList11 = new ArrayList();
        ArrayList arrayList12 = new ArrayList(list4);
        ArrayList arrayList13 = new ArrayList(list5);
        int iY = i12;
        long jZ2 = j12;
        String str4 = null;
        boolean z10 = false;
        k kVarG0 = kVar;
        long j16 = j13;
        ArrayList arrayList14 = new ArrayList();
        while (true) {
            xmlPullParser.next();
            if (v0.f(xmlPullParser, "BaseURL")) {
                if (!z10) {
                    jZ2 = z(xmlPullParser, jZ2);
                    z10 = true;
                }
                arrayList14.addAll(A(xmlPullParser, list));
            } else {
                if (v0.f(xmlPullParser, "AudioChannelConfiguration")) {
                    eVar = kVarG0;
                    iY = y(xmlPullParser);
                    arrayList4 = arrayList11;
                    arrayList5 = arrayList13;
                    arrayList9 = arrayList14;
                } else if (v0.f(xmlPullParser, "SegmentBase")) {
                    kVarG0 = e0(xmlPullParser, (k.e) kVarG0);
                } else {
                    if (v0.f(xmlPullParser, "SegmentList")) {
                        jZ = z(xmlPullParser, j16);
                        j15 = jZ2;
                        arrayList8 = arrayList14;
                        arrayList = arrayList13;
                        arrayList2 = arrayList11;
                        arrayList3 = arrayList12;
                        kVarG0 = f0(xmlPullParser, (k.b) kVarG0, j10, j11, j15, jZ, j14);
                    } else {
                        j15 = jZ2;
                        ArrayList arrayList15 = arrayList14;
                        arrayList = arrayList13;
                        arrayList2 = arrayList11;
                        arrayList3 = arrayList12;
                        if (v0.f(xmlPullParser, "SegmentTemplate")) {
                            jZ = z(xmlPullParser, j16);
                            kVarG0 = g0(xmlPullParser, (k.c) kVarG0, list5, j10, j11, j15, jZ, j14);
                            arrayList8 = arrayList15;
                        } else {
                            arrayList10 = arrayList10;
                            if (v0.f(xmlPullParser, "ContentProtection")) {
                                Pair<String, DrmInitData.SchemeData> pairD = D(xmlPullParser);
                                Object obj = pairD.first;
                                if (obj != null) {
                                    str4 = (String) obj;
                                }
                                Object obj2 = pairD.second;
                                if (obj2 != null) {
                                    arrayList10.add((DrmInitData.SchemeData) obj2);
                                }
                                arrayList7 = arrayList15;
                                jZ2 = j15;
                                arrayList5 = arrayList;
                                arrayList4 = arrayList2;
                                arrayList12 = arrayList3;
                                arrayList6 = arrayList7;
                            } else {
                                if (v0.f(xmlPullParser, "InbandEventStream")) {
                                    arrayList4 = arrayList2;
                                    arrayList4.add(G(xmlPullParser, "InbandEventStream"));
                                    arrayList5 = arrayList;
                                    arrayList12 = arrayList3;
                                } else {
                                    arrayList4 = arrayList2;
                                    if (v0.f(xmlPullParser, "EssentialProperty")) {
                                        arrayList12 = arrayList3;
                                        arrayList12.add(G(xmlPullParser, "EssentialProperty"));
                                        arrayList5 = arrayList;
                                    } else {
                                        arrayList12 = arrayList3;
                                        if (v0.f(xmlPullParser, "SupplementalProperty")) {
                                            arrayList5 = arrayList;
                                            arrayList5.add(G(xmlPullParser, "SupplementalProperty"));
                                        } else {
                                            arrayList5 = arrayList;
                                            u(xmlPullParser);
                                        }
                                    }
                                }
                                iY = iY;
                                jZ2 = j15;
                                arrayList6 = arrayList15;
                            }
                        }
                        eVar = kVarG0;
                        arrayList9 = arrayList6;
                    }
                    j16 = jZ;
                    arrayList7 = arrayList8;
                    jZ2 = j15;
                    arrayList5 = arrayList;
                    arrayList4 = arrayList2;
                    arrayList12 = arrayList3;
                    arrayList6 = arrayList7;
                    eVar = kVarG0;
                    arrayList9 = arrayList6;
                }
                if (v0.d(xmlPullParser, "Representation")) {
                    break;
                }
                arrayList13 = arrayList5;
                arrayList11 = arrayList4;
                arrayList10 = arrayList10;
                kVarG0 = eVar;
                iY = iY;
                arrayList14 = arrayList9;
            }
            iY = iY;
            eVar = kVarG0;
            arrayList4 = arrayList11;
            arrayList5 = arrayList13;
            arrayList9 = arrayList14;
            if (v0.d(xmlPullParser, "Representation")) {
                break;
                break;
            }
            arrayList13 = arrayList5;
            arrayList11 = arrayList4;
            arrayList10 = arrayList10;
            kVarG0 = eVar;
            iY = iY;
            arrayList14 = arrayList9;
        }
        ArrayList arrayList16 = arrayList4;
        a2 a2VarF = f(attributeValue, strM0, iQ2, iQ3, fO, iY, iQ4, iQ, str3, list2, list3, strM1, arrayList12, arrayList5);
        if (eVar == null) {
            eVar = new k.e();
        }
        boolean zIsEmpty = arrayList9.isEmpty();
        List list6 = arrayList9;
        if (zIsEmpty) {
            list6 = list;
        }
        return new a(a2VarF, list6, eVar, str4, arrayList10, arrayList16, -1L);
    }

    protected int a0(List<e> list) {
        int iO0;
        int i10 = 0;
        for (int i11 = 0; i11 < list.size(); i11++) {
            e eVar = list.get(i11);
            if (com.google.common.base.a.a("urn:mpeg:dash:role:2011", eVar.f47899a)) {
                iO0 = b0(eVar.f47900b);
            } else {
                if (com.google.common.base.a.a("urn:tva:metadata:cs:AudioPurposeCS:2007", eVar.f47899a)) {
                    iO0 = o0(eVar.f47900b);
                }
            }
            i10 |= iO0;
        }
        return i10;
    }

    protected int b0(@p0 String str) {
        if (str == null) {
            return 0;
        }
        switch (str) {
            case "subtitle":
            case "forced_subtitle":
                return 128;
            case "description":
                return 512;
            case "enhanced-audio-intelligibility":
                return 2048;
            case "alternate":
                return 2;
            case "dub":
                return 16;
            case "main":
                return 1;
            case "sign":
                return 256;
            case "caption":
                return 64;
            case "commentary":
                return 8;
            case "emergency":
                return 32;
            case "supplementary":
                return 4;
            default:
                return 0;
        }
    }

    protected com.google.android.exoplayer2.source.dash.manifest.a c(int i10, int i11, List<j> list, List<e> list2, List<e> list3, List<e> list4) {
        return new com.google.android.exoplayer2.source.dash.manifest.a(i10, i11, list, list2, list3, list4);
    }

    protected int c0(List<e> list) {
        int i10 = 0;
        for (int i11 = 0; i11 < list.size(); i11++) {
            if (com.google.common.base.a.a("http://dashif.org/guidelines/trickmode", list.get(i11).f47899a)) {
                i10 |= 16384;
            }
        }
        return i10;
    }

    protected EventMessage d(String str, String str2, long j10, long j11, byte[] bArr) {
        return new EventMessage(str, str2, j11, j10, bArr);
    }

    protected int d0(List<e> list) {
        int iB0 = 0;
        for (int i10 = 0; i10 < list.size(); i10++) {
            e eVar = list.get(i10);
            if (com.google.common.base.a.a("urn:mpeg:dash:role:2011", eVar.f47899a)) {
                iB0 |= b0(eVar.f47900b);
            }
        }
        return iB0;
    }

    protected f e(String str, String str2, long j10, long[] jArr, EventMessage[] eventMessageArr) {
        return new f(str, str2, j10, jArr, eventMessageArr);
    }

    protected k.e e0(XmlPullParser xmlPullParser, @p0 k.e eVar) throws XmlPullParserException, IOException {
        long j10;
        long j11;
        long jT = T(xmlPullParser, "timescale", eVar != null ? eVar.f47935b : 1L);
        long jT2 = T(xmlPullParser, "presentationTimeOffset", eVar != null ? eVar.f47936c : 0L);
        long j12 = eVar != null ? eVar.f47949d : 0L;
        long j13 = eVar != null ? eVar.f47950e : 0L;
        String attributeValue = xmlPullParser.getAttributeValue(null, "indexRange");
        if (attributeValue != null) {
            String[] strArrSplit = attributeValue.split(Constants.ACCEPT_TIME_SEPARATOR_SERVER);
            long j14 = Long.parseLong(strArrSplit[0]);
            j10 = (Long.parseLong(strArrSplit[1]) - j14) + 1;
            j11 = j14;
        } else {
            j10 = j13;
            j11 = j12;
        }
        i iVarP = eVar != null ? eVar.f47934a : null;
        do {
            xmlPullParser.next();
            if (v0.f(xmlPullParser, "Initialization")) {
                iVarP = P(xmlPullParser);
            } else {
                u(xmlPullParser);
            }
        } while (!v0.d(xmlPullParser, "SegmentBase"));
        return n(iVarP, jT, jT2, j11, j10);
    }

    protected a2 f(@p0 String str, @p0 String str2, int i10, int i11, float f10, int i12, int i13, int i14, @p0 String str3, List<e> list, List<e> list2, @p0 String str4, List<e> list3, List<e> list4) {
        String str5 = str4;
        String strT = t(str2, str5);
        if (y.M.equals(strT)) {
            strT = J(list4);
            if (y.N.equals(strT)) {
                str5 = y.J0;
            }
        }
        int iK0 = k0(list);
        a2.b bVarV = new a2.b().S(str).K(str2).e0(strT).I(str5).Z(i14).g0(iK0).c0(d0(list) | a0(list2) | c0(list3) | c0(list4)).V(str3);
        if (y.t(strT)) {
            bVarV.j0(i10).Q(i11).P(f10);
        } else if (y.p(strT)) {
            bVarV.H(i12).f0(i13);
        } else if (y.s(strT)) {
            int iC = -1;
            if (y.f51593q0.equals(strT)) {
                iC = B(list2);
            } else if (y.f51595r0.equals(strT)) {
                iC = C(list2);
            }
            bVarV.F(iC);
        } else if (y.q(strT)) {
            bVarV.j0(i10).Q(i11);
        }
        return bVarV.E();
    }

    protected k.b f0(XmlPullParser xmlPullParser, @p0 k.b bVar, long j10, long j11, long j12, long j13, long j14) throws XmlPullParserException, IOException {
        long jT = T(xmlPullParser, "timescale", bVar != null ? bVar.f47935b : 1L);
        long jT2 = T(xmlPullParser, "presentationTimeOffset", bVar != null ? bVar.f47936c : 0L);
        long jT3 = T(xmlPullParser, "duration", bVar != null ? bVar.f47938e : com.google.android.exoplayer2.j.f46377b);
        long jT4 = T(xmlPullParser, "startNumber", bVar != null ? bVar.f47937d : 1L);
        long jS = s(j12, j13);
        List<k.d> listH0 = null;
        List<i> arrayList = null;
        i iVarP = null;
        do {
            xmlPullParser.next();
            if (v0.f(xmlPullParser, "Initialization")) {
                iVarP = P(xmlPullParser);
            } else if (v0.f(xmlPullParser, "SegmentTimeline")) {
                listH0 = h0(xmlPullParser, jT, j11);
            } else if (v0.f(xmlPullParser, "SegmentURL")) {
                if (arrayList == null) {
                    arrayList = new ArrayList<>();
                }
                arrayList.add(i0(xmlPullParser));
            } else {
                u(xmlPullParser);
            }
        } while (!v0.d(xmlPullParser, "SegmentList"));
        if (bVar != null) {
            if (iVarP == null) {
                iVarP = bVar.f47934a;
            }
            if (listH0 == null) {
                listH0 = bVar.f47939f;
            }
            if (arrayList == null) {
                arrayList = bVar.f47943j;
            }
        }
        return k(iVarP, jT, jT2, jT4, jT3, listH0, jS, arrayList, j14, j10);
    }

    protected c g(long j10, long j11, long j12, boolean z10, long j13, long j14, long j15, long j16, @p0 h hVar, @p0 o oVar, @p0 l lVar, @p0 Uri uri, List<g> list) {
        return new c(j10, j11, j12, z10, j13, j14, j15, j16, hVar, oVar, lVar, uri, list);
    }

    protected k.c g0(XmlPullParser xmlPullParser, @p0 k.c cVar, List<e> list, long j10, long j11, long j12, long j13, long j14) throws XmlPullParserException, IOException {
        long jT = T(xmlPullParser, "timescale", cVar != null ? cVar.f47935b : 1L);
        long jT2 = T(xmlPullParser, "presentationTimeOffset", cVar != null ? cVar.f47936c : 0L);
        long jT3 = T(xmlPullParser, "duration", cVar != null ? cVar.f47938e : com.google.android.exoplayer2.j.f46377b);
        long jT4 = T(xmlPullParser, "startNumber", cVar != null ? cVar.f47937d : 1L);
        long jS = S(list);
        long jS2 = s(j12, j13);
        List<k.d> listH0 = null;
        n nVarP0 = p0(xmlPullParser, SocializeConstants.KEY_PLATFORM, cVar != null ? cVar.f47945k : null);
        n nVarP1 = p0(xmlPullParser, org.aspectj.lang.c.f137687i, cVar != null ? cVar.f47944j : null);
        i iVarP = null;
        do {
            xmlPullParser.next();
            if (v0.f(xmlPullParser, "Initialization")) {
                iVarP = P(xmlPullParser);
            } else if (v0.f(xmlPullParser, "SegmentTimeline")) {
                listH0 = h0(xmlPullParser, jT, j11);
            } else {
                u(xmlPullParser);
            }
        } while (!v0.d(xmlPullParser, "SegmentTemplate"));
        if (cVar != null) {
            if (iVarP == null) {
                iVarP = cVar.f47934a;
            }
            if (listH0 == null) {
                listH0 = cVar.f47939f;
            }
        }
        return l(iVarP, jT, jT2, jT4, jS, jT3, listH0, jS2, nVarP1, nVarP0, j14, j10);
    }

    protected g h(@p0 String str, long j10, List<com.google.android.exoplayer2.source.dash.manifest.a> list, List<f> list2, @p0 e eVar) {
        return new g(str, j10, list, list2, eVar);
    }

    protected List<k.d> h0(XmlPullParser xmlPullParser, long j10, long j11) throws XmlPullParserException, IOException {
        ArrayList arrayList = new ArrayList();
        long jB = 0;
        boolean z10 = false;
        int iQ = 0;
        long jT = -9223372036854775807L;
        do {
            xmlPullParser.next();
            if (v0.f(xmlPullParser, androidx.exifinterface.media.a.R4)) {
                long jT2 = T(xmlPullParser, "t", com.google.android.exoplayer2.j.f46377b);
                if (z10) {
                    jB = b(arrayList, jB, jT, iQ, jT2);
                }
                if (jT2 == com.google.android.exoplayer2.j.f46377b) {
                    jT2 = jB;
                }
                jT = T(xmlPullParser, "d", com.google.android.exoplayer2.j.f46377b);
                iQ = Q(xmlPullParser, "r", 0);
                z10 = true;
                jB = jT2;
            } else {
                u(xmlPullParser);
            }
        } while (!v0.d(xmlPullParser, "SegmentTimeline"));
        if (z10) {
            b(arrayList, jB, jT, iQ, u0.j1(j11, j10, 1000L));
        }
        return arrayList;
    }

    protected i i(String str, long j10, long j11) {
        return new i(str, j10, j11);
    }

    protected i i0(XmlPullParser xmlPullParser) {
        return Y(xmlPullParser, SocializeConstants.KEY_PLATFORM, "mediaRange");
    }

    protected j j(a aVar, @p0 String str, @p0 String str2, ArrayList<DrmInitData.SchemeData> arrayList, ArrayList<e> arrayList2) {
        a2.b bVarC = aVar.f47892a.c();
        if (str != null) {
            bVarC.U(str);
        }
        String str3 = aVar.f47895d;
        if (str3 != null) {
            str2 = str3;
        }
        ArrayList<DrmInitData.SchemeData> arrayList3 = aVar.f47896e;
        arrayList3.addAll(arrayList);
        if (!arrayList3.isEmpty()) {
            r(arrayList3);
            bVarC.M(new DrmInitData(str2, arrayList3));
        }
        ArrayList<e> arrayList4 = aVar.f47897f;
        arrayList4.addAll(arrayList2);
        return j.p(aVar.f47898g, bVarC.E(), aVar.f47893b, aVar.f47894c, arrayList4);
    }

    protected int j0(@p0 String str) {
        if (str == null) {
            return 0;
        }
        if (str.equals("forced_subtitle")) {
            return 2;
        }
        return !str.equals("main") ? 0 : 1;
    }

    protected k.b k(i iVar, long j10, long j11, long j12, long j13, @p0 List<k.d> list, long j14, @p0 List<i> list2, long j15, long j16) {
        return new k.b(iVar, j10, j11, j12, j13, list, j14, list2, u0.U0(j15), u0.U0(j16));
    }

    protected int k0(List<e> list) {
        int iJ0 = 0;
        for (int i10 = 0; i10 < list.size(); i10++) {
            e eVar = list.get(i10);
            if (com.google.common.base.a.a("urn:mpeg:dash:role:2011", eVar.f47899a)) {
                iJ0 |= j0(eVar.f47900b);
            }
        }
        return iJ0;
    }

    protected k.c l(i iVar, long j10, long j11, long j12, long j13, long j14, List<k.d> list, long j15, @p0 n nVar, @p0 n nVar2, long j16, long j17) {
        return new k.c(iVar, j10, j11, j12, j13, j14, list, j15, nVar, nVar2, u0.U0(j16), u0.U0(j17));
    }

    protected l l0(XmlPullParser xmlPullParser) throws XmlPullParserException, IOException {
        float fN = -3.4028235E38f;
        float fN2 = -3.4028235E38f;
        long jT = -9223372036854775807L;
        long jT2 = -9223372036854775807L;
        long jT3 = -9223372036854775807L;
        while (true) {
            xmlPullParser.next();
            if (v0.f(xmlPullParser, "Latency")) {
                jT = T(xmlPullParser, "target", com.google.android.exoplayer2.j.f46377b);
                jT2 = T(xmlPullParser, org.apache.tools.ant.types.selectors.o.f136588l, com.google.android.exoplayer2.j.f46377b);
                jT3 = T(xmlPullParser, org.apache.tools.ant.types.selectors.o.f136589m, com.google.android.exoplayer2.j.f46377b);
            } else if (v0.f(xmlPullParser, "PlaybackRate")) {
                fN = N(xmlPullParser, org.apache.tools.ant.types.selectors.o.f136588l, -3.4028235E38f);
                fN2 = N(xmlPullParser, org.apache.tools.ant.types.selectors.o.f136589m, -3.4028235E38f);
            }
            long j10 = jT;
            long j11 = jT2;
            long j12 = jT3;
            float f10 = fN;
            float f11 = fN2;
            if (v0.d(xmlPullParser, "ServiceDescription")) {
                return new l(j10, j11, j12, f10, f11);
            }
            jT = j10;
            jT2 = j11;
            jT3 = j12;
            fN = f10;
            fN2 = f11;
        }
    }

    protected k.d m(long j10, long j11) {
        return new k.d(j10, j11);
    }

    protected k.e n(i iVar, long j10, long j11, long j12, long j13) {
        return new k.e(iVar, j10, j11, j12, j13);
    }

    protected o o(String str, String str2) {
        return new o(str, str2);
    }

    protected int o0(@p0 String str) {
        if (str == null) {
            return 0;
        }
        byte b10 = -1;
        switch (str.hashCode()) {
            case 49:
                if (str.equals("1")) {
                    b10 = 0;
                }
                break;
            case 50:
                if (str.equals("2")) {
                    b10 = 1;
                }
                break;
            case 51:
                if (str.equals("3")) {
                    b10 = 2;
                }
                break;
            case 52:
                if (str.equals("4")) {
                    b10 = 3;
                }
                break;
            case 54:
                if (str.equals("6")) {
                    b10 = 4;
                }
                break;
        }
        switch (b10) {
            case 0:
                return 512;
            case 1:
                return 2048;
            case 2:
                return 4;
            case 3:
                return 8;
            case 4:
                return 1;
            default:
                return 0;
        }
    }

    @p0
    protected n p0(XmlPullParser xmlPullParser, String str, @p0 n nVar) {
        String attributeValue = xmlPullParser.getAttributeValue(null, str);
        return attributeValue != null ? n.b(attributeValue) : nVar;
    }

    protected o q0(XmlPullParser xmlPullParser) {
        return o(xmlPullParser.getAttributeValue(null, "schemeIdUri"), xmlPullParser.getAttributeValue(null, "value"));
    }

    @Override // com.google.android.exoplayer2.upstream.i0.a
    /* JADX INFO: renamed from: v, reason: merged with bridge method [inline-methods] */
    public c a(Uri uri, InputStream inputStream) throws IOException {
        try {
            XmlPullParser xmlPullParserNewPullParser = this.f47891b.newPullParser();
            xmlPullParserNewPullParser.setInput(inputStream, null);
            if (xmlPullParserNewPullParser.next() == 2 && "MPD".equals(xmlPullParserNewPullParser.getName())) {
                return U(xmlPullParserNewPullParser, new b(uri.toString()));
            }
            throw ParserException.c("inputStream does not contain a valid media presentation description", null);
        } catch (XmlPullParserException e10) {
            throw ParserException.c(null, e10);
        }
    }

    /* JADX WARN: Code duplicated, block: B:74:0x031a A[LOOP:0: B:3:0x007c->B:74:0x031a, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:75:0x02da A[EDGE_INSN: B:75:0x02da->B:68:0x02da BREAK  A[LOOP:0: B:3:0x007c->B:74:0x031a], SYNTHETIC] */
    protected com.google.android.exoplayer2.source.dash.manifest.a w(XmlPullParser xmlPullParser, List<b> list, @p0 k kVar, long j10, long j11, long j12, long j13, long j14) throws XmlPullParserException, IOException {
        String str;
        long j15;
        ArrayList arrayList;
        ArrayList arrayList2;
        ArrayList arrayList3;
        ArrayList arrayList4;
        Object obj;
        ArrayList arrayList5;
        int i10;
        ArrayList<e> arrayList6;
        long jZ;
        String str2;
        XmlPullParser xmlPullParser2 = xmlPullParser;
        int iQ = Q(xmlPullParser2, "id", -1);
        int iE = E(xmlPullParser);
        String attributeValue = xmlPullParser2.getAttributeValue(null, "mimeType");
        String attributeValue2 = xmlPullParser2.getAttributeValue(null, "codecs");
        int iQ2 = Q(xmlPullParser2, "width", -1);
        int iQ3 = Q(xmlPullParser2, "height", -1);
        float fO = O(xmlPullParser2, -1.0f);
        int iQ4 = Q(xmlPullParser2, "audioSamplingRate", -1);
        String str3 = "lang";
        String attributeValue3 = xmlPullParser2.getAttributeValue(null, "lang");
        String attributeValue4 = xmlPullParser2.getAttributeValue(null, BasePuzzleInfo.PUZZLE_TYPE_LABEL);
        ArrayList<DrmInitData.SchemeData> arrayList7 = new ArrayList<>();
        ArrayList<e> arrayList8 = new ArrayList<>();
        ArrayList arrayList9 = new ArrayList();
        ArrayList arrayList10 = new ArrayList();
        ArrayList arrayList11 = new ArrayList();
        ArrayList arrayList12 = new ArrayList();
        ArrayList arrayList13 = new ArrayList();
        ArrayList arrayList14 = new ArrayList();
        k kVarG0 = kVar;
        int iP = iE;
        int iY = -1;
        String str4 = attributeValue3;
        String strR = attributeValue4;
        String str5 = null;
        boolean z10 = false;
        long jZ2 = j11;
        long j16 = j12;
        while (true) {
            xmlPullParser.next();
            if (v0.f(xmlPullParser2, "BaseURL")) {
                if (!z10) {
                    jZ2 = z(xmlPullParser2, jZ2);
                    z10 = true;
                }
                arrayList14.addAll(A(xmlPullParser, list));
            } else {
                if (v0.f(xmlPullParser2, "ContentProtection")) {
                    Pair<String, DrmInitData.SchemeData> pairD = D(xmlPullParser);
                    long j17 = j16;
                    Object obj2 = pairD.first;
                    if (obj2 != null) {
                        str5 = (String) obj2;
                    }
                    Object obj3 = pairD.second;
                    if (obj3 != null) {
                        arrayList7.add((DrmInitData.SchemeData) obj3);
                    }
                    j16 = j17;
                } else {
                    long j18 = j16;
                    if (v0.f(xmlPullParser2, "ContentComponent")) {
                        String strQ = q(str4, xmlPullParser2.getAttributeValue(null, str3));
                        iP = p(iP, E(xmlPullParser));
                        j15 = jZ2;
                        arrayList5 = arrayList13;
                        arrayList = arrayList12;
                        arrayList2 = arrayList11;
                        arrayList3 = arrayList10;
                        arrayList4 = arrayList9;
                        arrayList6 = arrayList8;
                        obj = null;
                        str2 = strQ;
                    } else {
                        int i11 = iP;
                        String str6 = str4;
                        if (v0.f(xmlPullParser2, "Role")) {
                            arrayList10.add(G(xmlPullParser2, "Role"));
                        } else if (v0.f(xmlPullParser2, "AudioChannelConfiguration")) {
                            iY = y(xmlPullParser);
                            j15 = jZ2;
                            arrayList = arrayList12;
                            arrayList2 = arrayList11;
                            arrayList3 = arrayList10;
                            arrayList4 = arrayList9;
                            arrayList6 = arrayList8;
                            obj = null;
                            iP = i11;
                            str2 = str6;
                            arrayList5 = arrayList13;
                        } else if (v0.f(xmlPullParser2, "Accessibility")) {
                            arrayList9.add(G(xmlPullParser2, "Accessibility"));
                        } else if (v0.f(xmlPullParser2, "EssentialProperty")) {
                            arrayList11.add(G(xmlPullParser2, "EssentialProperty"));
                        } else if (v0.f(xmlPullParser2, "SupplementalProperty")) {
                            arrayList12.add(G(xmlPullParser2, "SupplementalProperty"));
                        } else if (v0.f(xmlPullParser2, "Representation")) {
                            j15 = jZ2;
                            arrayList = arrayList12;
                            arrayList2 = arrayList11;
                            arrayList3 = arrayList10;
                            arrayList4 = arrayList9;
                            obj = null;
                            a aVarZ = Z(xmlPullParser, !arrayList14.isEmpty() ? arrayList14 : list, attributeValue, attributeValue2, iQ2, iQ3, fO, iY, iQ4, str6, arrayList3, arrayList4, arrayList2, arrayList, kVarG0, j13, j10, j15, j18, j14);
                            int iP2 = p(i11, y.l(aVarZ.f47892a.f43593m));
                            arrayList5 = arrayList13;
                            arrayList5.add(aVarZ);
                            xmlPullParser2 = xmlPullParser;
                            str2 = str6;
                            arrayList6 = arrayList8;
                            iP = iP2;
                        } else {
                            str = str6;
                            j15 = jZ2;
                            arrayList14 = arrayList14;
                            arrayList = arrayList12;
                            arrayList2 = arrayList11;
                            arrayList3 = arrayList10;
                            arrayList4 = arrayList9;
                            ArrayList<e> arrayList15 = arrayList8;
                            arrayList7 = arrayList7;
                            str3 = str3;
                            obj = null;
                            arrayList5 = arrayList13;
                            xmlPullParser2 = xmlPullParser;
                            if (v0.f(xmlPullParser2, "SegmentBase")) {
                                kVarG0 = e0(xmlPullParser2, (k.e) kVarG0);
                                str2 = str;
                                arrayList6 = arrayList15;
                                j16 = j18;
                                iP = i11;
                                xmlPullParser2 = xmlPullParser2;
                            } else {
                                if (v0.f(xmlPullParser2, "SegmentList")) {
                                    jZ = z(xmlPullParser2, j18);
                                    i10 = i11;
                                    kVarG0 = f0(xmlPullParser, (k.b) kVarG0, j13, j10, j15, jZ, j14);
                                } else {
                                    j16 = j18;
                                    i10 = i11;
                                    if (v0.f(xmlPullParser2, "SegmentTemplate")) {
                                        jZ = z(xmlPullParser2, j16);
                                        kVarG0 = g0(xmlPullParser, (k.c) kVarG0, arrayList, j13, j10, j15, jZ, j14);
                                    } else {
                                        xmlPullParser2 = xmlPullParser2;
                                        if (v0.f(xmlPullParser2, "InbandEventStream")) {
                                            arrayList6 = arrayList15;
                                            arrayList6.add(G(xmlPullParser2, "InbandEventStream"));
                                        } else {
                                            arrayList6 = arrayList15;
                                            if (v0.f(xmlPullParser2, "Label")) {
                                                strR = R(xmlPullParser);
                                            } else if (v0.e(xmlPullParser)) {
                                                x(xmlPullParser);
                                            }
                                        }
                                        str2 = str;
                                        iP = i10;
                                    }
                                }
                                j16 = jZ;
                                str2 = str;
                                arrayList6 = arrayList15;
                                iP = i10;
                            }
                        }
                        str = str6;
                        j15 = jZ2;
                        arrayList14 = arrayList14;
                        arrayList = arrayList12;
                        arrayList2 = arrayList11;
                        arrayList3 = arrayList10;
                        arrayList4 = arrayList9;
                        arrayList6 = arrayList8;
                        arrayList7 = arrayList7;
                        str3 = str3;
                        obj = null;
                        i10 = i11;
                        j16 = j18;
                        arrayList5 = arrayList13;
                        str2 = str;
                        iP = i10;
                    }
                    j16 = j18;
                }
                if (v0.d(xmlPullParser2, "AdaptationSet")) {
                    break;
                }
                arrayList8 = arrayList6;
                arrayList13 = arrayList5;
                arrayList14 = arrayList14;
                arrayList12 = arrayList;
                arrayList11 = arrayList2;
                arrayList10 = arrayList3;
                arrayList9 = arrayList4;
                arrayList7 = arrayList7;
                str3 = str3;
                str4 = str2;
                jZ2 = j15;
            }
            j15 = jZ2;
            arrayList5 = arrayList13;
            arrayList = arrayList12;
            arrayList2 = arrayList11;
            arrayList3 = arrayList10;
            arrayList4 = arrayList9;
            arrayList6 = arrayList8;
            arrayList7 = arrayList7;
            str3 = str3;
            str2 = str4;
            obj = null;
            arrayList14 = arrayList14;
            if (v0.d(xmlPullParser2, "AdaptationSet")) {
                break;
                break;
            }
            arrayList8 = arrayList6;
            arrayList13 = arrayList5;
            arrayList14 = arrayList14;
            arrayList12 = arrayList;
            arrayList11 = arrayList2;
            arrayList10 = arrayList3;
            arrayList9 = arrayList4;
            arrayList7 = arrayList7;
            str3 = str3;
            str4 = str2;
            jZ2 = j15;
        }
        List<j> arrayList16 = new ArrayList<>(arrayList5.size());
        for (int i12 = 0; i12 < arrayList5.size(); i12++) {
            arrayList16.add(j((a) arrayList5.get(i12), strR, str5, arrayList7, arrayList6));
        }
        return c(iQ, iP, arrayList16, arrayList4, arrayList2, arrayList);
    }

    protected void x(XmlPullParser xmlPullParser) throws XmlPullParserException, IOException {
        u(xmlPullParser);
    }

    protected int y(XmlPullParser xmlPullParser) throws XmlPullParserException, IOException {
        String strM0 = m0(xmlPullParser, "schemeIdUri", null);
        strM0.hashCode();
        int iQ = -1;
        switch (strM0) {
            case "urn:mpeg:dash:23003:3:audio_channel_configuration:2011":
                iQ = Q(xmlPullParser, "value", -1);
                break;
            case "tag:dolby.com,2014:dash:audio_channel_configuration:2011":
            case "urn:dolby:dash:audio_channel_configuration:2011":
                iQ = H(xmlPullParser);
                break;
            case "urn:mpeg:mpegB:cicp:ChannelConfiguration":
                iQ = V(xmlPullParser);
                break;
        }
        do {
            xmlPullParser.next();
        } while (!v0.d(xmlPullParser, "AudioChannelConfiguration"));
        return iQ;
    }

    protected long z(XmlPullParser xmlPullParser, long j10) {
        String attributeValue = xmlPullParser.getAttributeValue(null, "availabilityTimeOffset");
        if (attributeValue == null) {
            return j10;
        }
        if ("INF".equals(attributeValue)) {
            return Long.MAX_VALUE;
        }
        return (long) (Float.parseFloat(attributeValue) * 1000000.0f);
    }
}
