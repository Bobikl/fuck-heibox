package com.xiaomi.push.service;

import com.xiaomi.push.hp;
import com.xiaomi.push.hy;
import com.xiaomi.push.hz;
import com.xiaomi.push.id;
import java.io.IOException;
import java.util.ArrayList;
import org.xmlpull.v1.XmlPullParser;
import org.xmlpull.v1.XmlPullParserException;

/* JADX INFO: loaded from: classes4.dex */
public class l implements hy {
    public static hp a(XmlPullParser xmlPullParser) throws XmlPullParserException, IOException {
        String[] strArr;
        String[] strArr2;
        String strTrim;
        ArrayList arrayList;
        if (xmlPullParser.getEventType() != 2) {
            return null;
        }
        String name = xmlPullParser.getName();
        String namespace = xmlPullParser.getNamespace();
        if (xmlPullParser.getAttributeCount() > 0) {
            String[] strArr3 = new String[xmlPullParser.getAttributeCount()];
            String[] strArr4 = new String[xmlPullParser.getAttributeCount()];
            for (int i10 = 0; i10 < xmlPullParser.getAttributeCount(); i10++) {
                strArr3[i10] = xmlPullParser.getAttributeName(i10);
                strArr4[i10] = id.b(xmlPullParser.getAttributeValue(i10));
            }
            strArr = strArr3;
            strTrim = null;
            arrayList = null;
            strArr2 = strArr4;
        } else {
            strArr = null;
            strArr2 = null;
            strTrim = null;
            arrayList = null;
        }
        while (true) {
            int next = xmlPullParser.next();
            if (next == 3) {
                return new hp(name, namespace, strArr, strArr2, strTrim, arrayList);
            }
            if (next == 4) {
                strTrim = xmlPullParser.getText().trim();
            } else if (next == 2) {
                if (arrayList == null) {
                    arrayList = new ArrayList();
                }
                hp hpVarA = a(xmlPullParser);
                if (hpVarA != null) {
                    arrayList.add(hpVarA);
                }
            }
        }
    }

    public void a() {
        hz.a().a("all", "xm:chat", this);
    }

    public hp b(XmlPullParser xmlPullParser) throws XmlPullParserException, IOException {
        int eventType = xmlPullParser.getEventType();
        while (eventType != 1 && eventType != 2) {
            eventType = xmlPullParser.next();
        }
        if (eventType == 2) {
            return a(xmlPullParser);
        }
        return null;
    }
}
