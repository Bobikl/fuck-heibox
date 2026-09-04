package com.xiaomi.push;

import android.text.TextUtils;
import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.HashMap;
import org.xmlpull.v1.XmlPullParser;
import org.xmlpull.v1.XmlPullParserException;
import org.xmlpull.v1.XmlPullParserFactory;

/* JADX INFO: loaded from: classes4.dex */
public class ia {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static XmlPullParser f107355a;

    public static hp a(String str, String str2, XmlPullParser xmlPullParser) {
        Object objM463a = hz.a().m463a("all", "xm:chat");
        if (objM463a == null || !(objM463a instanceof com.xiaomi.push.service.l)) {
            return null;
        }
        return ((com.xiaomi.push.service.l) objM463a).b(xmlPullParser);
    }

    public static hq a(XmlPullParser xmlPullParser, hb hbVar) throws XmlPullParserException, IOException {
        String attributeValue = xmlPullParser.getAttributeValue("", "id");
        String attributeValue2 = xmlPullParser.getAttributeValue("", "to");
        String attributeValue3 = xmlPullParser.getAttributeValue("", "from");
        String attributeValue4 = xmlPullParser.getAttributeValue("", "chid");
        hq.a aVarA = hq.a.a(xmlPullParser.getAttributeValue("", "type"));
        HashMap map = new HashMap();
        boolean z10 = false;
        for (int i10 = 0; i10 < xmlPullParser.getAttributeCount(); i10++) {
            String attributeName = xmlPullParser.getAttributeName(i10);
            map.put(attributeName, xmlPullParser.getAttributeValue("", attributeName));
        }
        hq icVar = null;
        hw hwVarM475a = null;
        while (!z10) {
            int next = xmlPullParser.next();
            if (next == 2) {
                String name = xmlPullParser.getName();
                String namespace = xmlPullParser.getNamespace();
                if (name.equals("error")) {
                    hwVarM475a = m475a(xmlPullParser);
                } else {
                    icVar = new hq();
                    icVar.a(a(name, namespace, xmlPullParser));
                }
            } else if (next == 3 && xmlPullParser.getName().equals("iq")) {
                z10 = true;
            }
        }
        if (icVar == null) {
            if (hq.a.f107277a == aVarA || hq.a.f107278b == aVarA) {
                ib ibVar = new ib();
                ibVar.k(attributeValue);
                ibVar.m(attributeValue3);
                ibVar.n(attributeValue2);
                ibVar.a(hq.a.f107280d);
                ibVar.l(attributeValue4);
                ibVar.a(new hw(hw.a.f107327e));
                hbVar.a(ibVar);
                com.xiaomi.channel.commonutils.logger.b.d("iq usage error. send packet in packet parser.");
                return null;
            }
            icVar = new ic();
        }
        icVar.k(attributeValue);
        icVar.m(attributeValue2);
        icVar.l(attributeValue4);
        icVar.n(attributeValue3);
        icVar.a(aVarA);
        icVar.a(hwVarM475a);
        icVar.a(map);
        return icVar;
    }

    public static hs a(XmlPullParser xmlPullParser) throws XmlPullParserException, IOException, hm {
        String attributeValue;
        boolean z10 = false;
        String strNextText = null;
        if ("1".equals(xmlPullParser.getAttributeValue("", com.umeng.analytics.pro.ak.aB))) {
            String attributeValue2 = xmlPullParser.getAttributeValue("", "chid");
            String attributeValue3 = xmlPullParser.getAttributeValue("", "id");
            String attributeValue4 = xmlPullParser.getAttributeValue("", "from");
            String attributeValue5 = xmlPullParser.getAttributeValue("", "to");
            String attributeValue6 = xmlPullParser.getAttributeValue("", "type");
            com.xiaomi.push.service.bf.b bVarA = com.xiaomi.push.service.bf.a().a(attributeValue2, attributeValue5);
            if (bVarA == null) {
                bVarA = com.xiaomi.push.service.bf.a().a(attributeValue2, attributeValue4);
            }
            if (bVarA == null) {
                throw new hm("the channel id is wrong while receiving a encrypted message");
            }
            hs hsVarA = null;
            while (!z10) {
                int next = xmlPullParser.next();
                if (next == 2) {
                    if (!com.umeng.analytics.pro.ak.aB.equals(xmlPullParser.getName())) {
                        throw new hm("error while receiving a encrypted message with wrong format");
                    }
                    if (xmlPullParser.next() != 4) {
                        throw new hm("error while receiving a encrypted message with wrong format");
                    }
                    String text = xmlPullParser.getText();
                    if ("5".equals(attributeValue2) || "6".equals(attributeValue2)) {
                        hr hrVar = new hr();
                        hrVar.l(attributeValue2);
                        hrVar.b(true);
                        hrVar.n(attributeValue4);
                        hrVar.m(attributeValue5);
                        hrVar.k(attributeValue3);
                        hrVar.f(attributeValue6);
                        hp hpVar = new hp(com.umeng.analytics.pro.ak.aB, null, null, null);
                        hpVar.m454a(text);
                        hrVar.a(hpVar);
                        return hrVar;
                    }
                    a(com.xiaomi.push.service.bo.a(com.xiaomi.push.service.bo.a(bVarA.f107918h, attributeValue3), text));
                    f107355a.next();
                    hsVarA = a(f107355a);
                } else if (next == 3 && xmlPullParser.getName().equals("message")) {
                    z10 = true;
                }
            }
            if (hsVarA != null) {
                return hsVarA;
            }
            throw new hm("error while receiving a encrypted message with wrong format");
        }
        hr hrVar2 = new hr();
        String attributeValue7 = xmlPullParser.getAttributeValue("", "id");
        if (attributeValue7 == null) {
            attributeValue7 = "ID_NOT_AVAILABLE";
        }
        hrVar2.k(attributeValue7);
        hrVar2.m(xmlPullParser.getAttributeValue("", "to"));
        hrVar2.n(xmlPullParser.getAttributeValue("", "from"));
        hrVar2.l(xmlPullParser.getAttributeValue("", "chid"));
        hrVar2.a(xmlPullParser.getAttributeValue("", "appid"));
        try {
            attributeValue = xmlPullParser.getAttributeValue("", "transient");
        } catch (Exception unused) {
            attributeValue = null;
        }
        try {
            String attributeValue8 = xmlPullParser.getAttributeValue("", "seq");
            if (!TextUtils.isEmpty(attributeValue8)) {
                hrVar2.b(attributeValue8);
            }
        } catch (Exception unused2) {
        }
        try {
            String attributeValue9 = xmlPullParser.getAttributeValue("", "mseq");
            if (!TextUtils.isEmpty(attributeValue9)) {
                hrVar2.c(attributeValue9);
            }
        } catch (Exception unused3) {
        }
        try {
            String attributeValue10 = xmlPullParser.getAttributeValue("", "fseq");
            if (!TextUtils.isEmpty(attributeValue10)) {
                hrVar2.d(attributeValue10);
            }
        } catch (Exception unused4) {
        }
        try {
            String attributeValue11 = xmlPullParser.getAttributeValue("", "status");
            if (!TextUtils.isEmpty(attributeValue11)) {
                hrVar2.e(attributeValue11);
            }
        } catch (Exception unused5) {
        }
        hrVar2.a(!TextUtils.isEmpty(attributeValue) && attributeValue.equalsIgnoreCase("true"));
        hrVar2.f(xmlPullParser.getAttributeValue("", "type"));
        String strB = b(xmlPullParser);
        if (strB == null || "".equals(strB.trim())) {
            hs.q();
        } else {
            hrVar2.j(strB);
        }
        while (!z10) {
            int next2 = xmlPullParser.next();
            if (next2 == 2) {
                String name = xmlPullParser.getName();
                String namespace = xmlPullParser.getNamespace();
                if (TextUtils.isEmpty(namespace)) {
                    namespace = "xm";
                }
                if (name.equals("subject")) {
                    b(xmlPullParser);
                    hrVar2.g(m476a(xmlPullParser));
                } else if (name.equals("body")) {
                    String attributeValue12 = xmlPullParser.getAttributeValue("", "encode");
                    String strM476a = m476a(xmlPullParser);
                    if (TextUtils.isEmpty(attributeValue12)) {
                        hrVar2.h(strM476a);
                    } else {
                        hrVar2.a(strM476a, attributeValue12);
                    }
                } else if (name.equals("thread")) {
                    if (strNextText == null) {
                        strNextText = xmlPullParser.nextText();
                    }
                } else if (name.equals("error")) {
                    hrVar2.a(m475a(xmlPullParser));
                } else {
                    hrVar2.a(a(name, namespace, xmlPullParser));
                }
            } else if (next2 == 3 && xmlPullParser.getName().equals("message")) {
                z10 = true;
            }
        }
        hrVar2.i(strNextText);
        return hrVar2;
    }

    /* JADX INFO: renamed from: a, reason: collision with other method in class */
    public static hu m473a(XmlPullParser xmlPullParser) throws XmlPullParserException, IOException {
        hu.b bVarValueOf = hu.b.available;
        String attributeValue = xmlPullParser.getAttributeValue("", "type");
        if (attributeValue != null && !attributeValue.equals("")) {
            try {
                bVarValueOf = hu.b.valueOf(attributeValue);
            } catch (IllegalArgumentException unused) {
                System.err.println("Found invalid presence type " + attributeValue);
            }
        }
        hu huVar = new hu(bVarValueOf);
        huVar.m(xmlPullParser.getAttributeValue("", "to"));
        huVar.n(xmlPullParser.getAttributeValue("", "from"));
        huVar.l(xmlPullParser.getAttributeValue("", "chid"));
        String attributeValue2 = xmlPullParser.getAttributeValue("", "id");
        if (attributeValue2 == null) {
            attributeValue2 = "ID_NOT_AVAILABLE";
        }
        huVar.k(attributeValue2);
        boolean z10 = false;
        while (!z10) {
            int next = xmlPullParser.next();
            if (next == 2) {
                String name = xmlPullParser.getName();
                String namespace = xmlPullParser.getNamespace();
                if (name.equals("status")) {
                    huVar.a(xmlPullParser.nextText());
                } else if (name.equals("priority")) {
                    try {
                        huVar.a(Integer.parseInt(xmlPullParser.nextText()));
                    } catch (NumberFormatException unused2) {
                    } catch (IllegalArgumentException unused3) {
                        huVar.a(0);
                    }
                } else if (name.equals("show")) {
                    String strNextText = xmlPullParser.nextText();
                    try {
                        huVar.a(hu.a.valueOf(strNextText));
                    } catch (IllegalArgumentException unused4) {
                        System.err.println("Found invalid presence mode " + strNextText);
                    }
                } else if (name.equals("error")) {
                    huVar.a(m475a(xmlPullParser));
                } else {
                    huVar.a(a(name, namespace, xmlPullParser));
                }
            } else if (next == 3 && xmlPullParser.getName().equals("presence")) {
                z10 = true;
            }
        }
        return huVar;
    }

    /* JADX INFO: renamed from: a, reason: collision with other method in class */
    public static hv m474a(XmlPullParser xmlPullParser) throws XmlPullParserException, IOException {
        hv hvVar = null;
        boolean z10 = false;
        while (!z10) {
            int next = xmlPullParser.next();
            if (next == 2) {
                hvVar = new hv(xmlPullParser.getName());
            } else if (next == 3 && xmlPullParser.getName().equals("error")) {
                z10 = true;
            }
        }
        return hvVar;
    }

    /* JADX INFO: renamed from: a, reason: collision with other method in class */
    public static hw m475a(XmlPullParser xmlPullParser) throws XmlPullParserException, IOException {
        ArrayList arrayList = new ArrayList();
        boolean z10 = false;
        String attributeValue = "-1";
        String attributeValue2 = null;
        String attributeValue3 = null;
        for (int i10 = 0; i10 < xmlPullParser.getAttributeCount(); i10++) {
            if (xmlPullParser.getAttributeName(i10).equals("code")) {
                attributeValue = xmlPullParser.getAttributeValue("", "code");
            }
            if (xmlPullParser.getAttributeName(i10).equals("type")) {
                attributeValue3 = xmlPullParser.getAttributeValue("", "type");
            }
            if (xmlPullParser.getAttributeName(i10).equals("reason")) {
                attributeValue2 = xmlPullParser.getAttributeValue("", "reason");
            }
        }
        String str = null;
        String strNextText = null;
        while (!z10) {
            int next = xmlPullParser.next();
            if (next == 2) {
                if (xmlPullParser.getName().equals("text")) {
                    strNextText = xmlPullParser.nextText();
                } else {
                    String name = xmlPullParser.getName();
                    String namespace = xmlPullParser.getNamespace();
                    if ("urn:ietf:params:xml:ns:xmpp-stanzas".equals(namespace)) {
                        str = name;
                    } else {
                        arrayList.add(a(name, namespace, xmlPullParser));
                    }
                }
            } else if (next == 3) {
                if (xmlPullParser.getName().equals("error")) {
                    z10 = true;
                }
            } else if (next == 4) {
                strNextText = xmlPullParser.getText();
            }
        }
        return new hw(Integer.parseInt(attributeValue), attributeValue3 == null ? "cancel" : attributeValue3, attributeValue2, str, strNextText, arrayList);
    }

    /* JADX INFO: renamed from: a, reason: collision with other method in class */
    private static String m476a(XmlPullParser xmlPullParser) {
        int depth = xmlPullParser.getDepth();
        String str = "";
        while (true) {
            if (xmlPullParser.next() == 3 && xmlPullParser.getDepth() == depth) {
                return str;
            }
            str = str + xmlPullParser.getText();
        }
    }

    private static void a(byte[] bArr) throws XmlPullParserException {
        if (f107355a == null) {
            try {
                XmlPullParser xmlPullParserNewPullParser = XmlPullParserFactory.newInstance().newPullParser();
                f107355a = xmlPullParserNewPullParser;
                xmlPullParserNewPullParser.setFeature("http://xmlpull.org/v1/doc/features.html#process-namespaces", true);
            } catch (XmlPullParserException e10) {
                e10.printStackTrace();
            }
        }
        f107355a.setInput(new InputStreamReader(new ByteArrayInputStream(bArr)));
    }

    private static String b(XmlPullParser xmlPullParser) {
        for (int i10 = 0; i10 < xmlPullParser.getAttributeCount(); i10++) {
            String attributeName = xmlPullParser.getAttributeName(i10);
            if ("xml:lang".equals(attributeName) || ("lang".equals(attributeName) && "xml".equals(xmlPullParser.getAttributePrefix(i10)))) {
                return xmlPullParser.getAttributeValue(i10);
            }
        }
        return null;
    }
}
