package com.google.android.exoplayer2.extractor.jpeg;

import androidx.annotation.p0;
import androidx.compose.material3.TextFieldImplKt;
import com.google.android.exoplayer2.ParserException;
import com.google.android.exoplayer2.j;
import com.google.android.exoplayer2.util.u;
import com.google.android.exoplayer2.util.v0;
import com.google.common.collect.ImmutableList;
import java.io.IOException;
import java.io.StringReader;
import org.xmlpull.v1.XmlPullParser;
import org.xmlpull.v1.XmlPullParserException;
import org.xmlpull.v1.XmlPullParserFactory;

/* JADX INFO: compiled from: XmpMotionPhotoDescriptionParser.java */
/* JADX INFO: loaded from: classes7.dex */
public final class e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final String f45076a = "MotionPhotoXmpParser";

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static final String[] f45077b = {"Camera:MotionPhoto", "GCamera:MotionPhoto", "Camera:MicroVideo", "GCamera:MicroVideo"};

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static final String[] f45078c = {"Camera:MotionPhotoPresentationTimestampUs", "GCamera:MotionPhotoPresentationTimestampUs", "Camera:MicroVideoPresentationTimestampUs", "GCamera:MicroVideoPresentationTimestampUs"};

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private static final String[] f45079d = {"Camera:MicroVideoOffset", "GCamera:MicroVideoOffset"};

    private e() {
    }

    @p0
    public static b a(String str) throws IOException {
        try {
            return b(str);
        } catch (ParserException | NumberFormatException | XmlPullParserException unused) {
            u.m(f45076a, "Ignoring unexpected XMP metadata");
            return null;
        }
    }

    @p0
    private static b b(String str) throws XmlPullParserException, IOException {
        XmlPullParser xmlPullParserNewPullParser = XmlPullParserFactory.newInstance().newPullParser();
        xmlPullParserNewPullParser.setInput(new StringReader(str));
        xmlPullParserNewPullParser.next();
        if (!v0.f(xmlPullParserNewPullParser, "x:xmpmeta")) {
            throw ParserException.a("Couldn't find xmp metadata", null);
        }
        long jE = j.f46377b;
        ImmutableList<b.a> immutableListB = ImmutableList.B();
        do {
            xmlPullParserNewPullParser.next();
            if (v0.f(xmlPullParserNewPullParser, "rdf:Description")) {
                if (!d(xmlPullParserNewPullParser)) {
                    return null;
                }
                jE = e(xmlPullParserNewPullParser);
                immutableListB = c(xmlPullParserNewPullParser);
            } else if (v0.f(xmlPullParserNewPullParser, "Container:Directory")) {
                immutableListB = f(xmlPullParserNewPullParser, TextFieldImplKt.f11420g, "Item");
            } else if (v0.f(xmlPullParserNewPullParser, "GContainer:Directory")) {
                immutableListB = f(xmlPullParserNewPullParser, "GContainer", "GContainerItem");
            }
        } while (!v0.d(xmlPullParserNewPullParser, "x:xmpmeta"));
        if (immutableListB.isEmpty()) {
            return null;
        }
        return new b(jE, immutableListB);
    }

    private static ImmutableList<b.a> c(XmlPullParser xmlPullParser) {
        for (String str : f45079d) {
            String strA = v0.a(xmlPullParser, str);
            if (strA != null) {
                return ImmutableList.E(new b.a("image/jpeg", "Primary", 0L, 0L), new b.a("video/mp4", "MotionPhoto", Long.parseLong(strA), 0L));
            }
        }
        return ImmutableList.B();
    }

    private static boolean d(XmlPullParser xmlPullParser) {
        for (String str : f45077b) {
            String strA = v0.a(xmlPullParser, str);
            if (strA != null) {
                return Integer.parseInt(strA) == 1;
            }
        }
        return false;
    }

    private static long e(XmlPullParser xmlPullParser) {
        for (String str : f45078c) {
            String strA = v0.a(xmlPullParser, str);
            if (strA != null) {
                long j10 = Long.parseLong(strA);
                return j10 == -1 ? j.f46377b : j10;
            }
        }
        return j.f46377b;
    }

    private static ImmutableList<b.a> f(XmlPullParser xmlPullParser, String str, String str2) throws XmlPullParserException, IOException {
        ImmutableList.a aVarQ = ImmutableList.q();
        String strConcat = String.valueOf(str).concat(":Item");
        String strConcat2 = String.valueOf(str).concat(":Directory");
        do {
            xmlPullParser.next();
            if (v0.f(xmlPullParser, strConcat)) {
                String strConcat3 = String.valueOf(str2).concat(":Mime");
                String strConcat4 = String.valueOf(str2).concat(":Semantic");
                String strConcat5 = String.valueOf(str2).concat(":Length");
                String strConcat6 = String.valueOf(str2).concat(":Padding");
                String strA = v0.a(xmlPullParser, strConcat3);
                String strA2 = v0.a(xmlPullParser, strConcat4);
                String strA3 = v0.a(xmlPullParser, strConcat5);
                String strA4 = v0.a(xmlPullParser, strConcat6);
                if (strA == null || strA2 == null) {
                    return ImmutableList.B();
                }
                aVarQ.a(new b.a(strA, strA2, strA3 != null ? Long.parseLong(strA3) : 0L, strA4 != null ? Long.parseLong(strA4) : 0L));
            }
        } while (!v0.d(xmlPullParser, strConcat2));
        return aVarQ.e();
    }
}
