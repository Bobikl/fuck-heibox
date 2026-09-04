package com.google.android.play.core.splitinstall;

import android.util.Log;
import com.umeng.analytics.pro.ak;
import java.io.IOException;
import org.xmlpull.v1.XmlPullParser;
import org.xmlpull.v1.XmlPullParserException;

/* JADX INFO: compiled from: com.google.android.play:feature-delivery@@2.1.0 */
/* JADX INFO: loaded from: classes7.dex */
public final class p0 {
    @androidx.annotation.p0
    static final y0 a(XmlPullParser xmlPullParser, w0 w0Var) {
        while (xmlPullParser.next() != 1) {
            try {
                if (xmlPullParser.getEventType() == 2) {
                    if (xmlPullParser.getName().equals("splits")) {
                        while (xmlPullParser.next() != 3) {
                            if (xmlPullParser.getEventType() == 2) {
                                if (xmlPullParser.getName().equals("module")) {
                                    String strB = b("name", xmlPullParser, w0Var);
                                    if (strB != null) {
                                        while (xmlPullParser.next() != 3) {
                                            if (xmlPullParser.getEventType() == 2) {
                                                if (xmlPullParser.getName().equals(ak.N)) {
                                                    while (xmlPullParser.next() != 3) {
                                                        if (xmlPullParser.getEventType() == 2) {
                                                            if (xmlPullParser.getName().equals("entry")) {
                                                                String strB2 = b("key", xmlPullParser, w0Var);
                                                                String strB3 = b("split", xmlPullParser, w0Var);
                                                                c(xmlPullParser, w0Var);
                                                                if (strB2 != null && strB3 != null) {
                                                                    w0Var.a(strB, strB2, strB3);
                                                                }
                                                            } else {
                                                                c(xmlPullParser, w0Var);
                                                            }
                                                        }
                                                    }
                                                } else {
                                                    c(xmlPullParser, w0Var);
                                                }
                                            }
                                        }
                                    } else {
                                        c(xmlPullParser, w0Var);
                                    }
                                } else {
                                    c(xmlPullParser, w0Var);
                                }
                            }
                        }
                    } else {
                        c(xmlPullParser, w0Var);
                    }
                }
            } catch (IOException | IllegalStateException | XmlPullParserException e10) {
                Log.e("SplitInstall", "Error while parsing splits.xml", e10);
                return null;
            }
        }
        return w0Var.b();
    }

    @androidx.annotation.p0
    private static final String b(String str, XmlPullParser xmlPullParser, w0 w0Var) {
        for (int i10 = 0; i10 < xmlPullParser.getAttributeCount(); i10++) {
            if (xmlPullParser.getAttributeName(i10).equals(str)) {
                return xmlPullParser.getAttributeValue(i10);
            }
        }
        return null;
    }

    private static final void c(XmlPullParser xmlPullParser, w0 w0Var) throws XmlPullParserException, IOException {
        int i10 = 1;
        while (i10 != 0) {
            int next = xmlPullParser.next();
            if (next == 2) {
                i10++;
            } else if (next == 3) {
                i10--;
            }
        }
    }
}
