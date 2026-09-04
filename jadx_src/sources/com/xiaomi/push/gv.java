package com.xiaomi.push;

import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import org.xmlpull.v1.XmlPullParser;
import org.xmlpull.v1.XmlPullParserException;
import org.xmlpull.v1.XmlPullParserFactory;

/* JADX INFO: loaded from: classes4.dex */
public class gv {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private XmlPullParser f107236a;

    gv() {
        try {
            XmlPullParser xmlPullParserNewPullParser = XmlPullParserFactory.newInstance().newPullParser();
            this.f107236a = xmlPullParserNewPullParser;
            xmlPullParserNewPullParser.setFeature("http://xmlpull.org/v1/doc/features.html#process-namespaces", true);
        } catch (XmlPullParserException unused) {
        }
    }

    hs a(byte[] bArr, hb hbVar) throws XmlPullParserException, IOException, hm {
        this.f107236a.setInput(new InputStreamReader(new ByteArrayInputStream(bArr)));
        this.f107236a.next();
        int eventType = this.f107236a.getEventType();
        String name = this.f107236a.getName();
        if (eventType != 2) {
            return null;
        }
        if (name.equals("message")) {
            return ia.a(this.f107236a);
        }
        if (name.equals("iq")) {
            return ia.a(this.f107236a, hbVar);
        }
        if (name.equals("presence")) {
            return ia.m473a(this.f107236a);
        }
        if (this.f107236a.getName().equals("stream")) {
            return null;
        }
        if (this.f107236a.getName().equals("error")) {
            throw new hm(ia.m474a(this.f107236a));
        }
        if (!this.f107236a.getName().equals("warning")) {
            this.f107236a.getName().equals("bind");
            return null;
        }
        this.f107236a.next();
        this.f107236a.getName().equals("multi-login");
        return null;
    }
}
