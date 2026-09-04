package com.xiaomi.push;

import com.vivo.push.PushClientConstants;
import java.io.IOException;
import java.io.InputStream;
import java.net.URL;
import java.util.ArrayList;
import java.util.Enumeration;
import java.util.Vector;
import org.xmlpull.v1.XmlPullParser;
import org.xmlpull.v1.XmlPullParserException;
import org.xmlpull.v1.XmlPullParserFactory;

/* JADX INFO: loaded from: classes4.dex */
public final class hh {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static int f107255a = 5000;

    /* JADX INFO: renamed from: a, reason: collision with other field name */
    private static Vector<String> f538a = new Vector<>();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static int f107256b = 330000;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static int f107257c = 600000;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private static int f107258d = 330000;

    static {
        try {
            for (ClassLoader classLoader : m449a()) {
                Enumeration<URL> resources = classLoader.getResources("META-INF/smack-config.xml");
                while (resources.hasMoreElements()) {
                    InputStream inputStreamOpenStream = null;
                    try {
                        try {
                            inputStreamOpenStream = resources.nextElement().openStream();
                            XmlPullParser xmlPullParserNewPullParser = XmlPullParserFactory.newInstance().newPullParser();
                            xmlPullParserNewPullParser.setFeature("http://xmlpull.org/v1/doc/features.html#process-namespaces", true);
                            xmlPullParserNewPullParser.setInput(inputStreamOpenStream, "UTF-8");
                            int eventType = xmlPullParserNewPullParser.getEventType();
                            do {
                                if (eventType == 2) {
                                    if (xmlPullParserNewPullParser.getName().equals(PushClientConstants.TAG_CLASS_NAME)) {
                                        a(xmlPullParserNewPullParser);
                                    } else if (xmlPullParserNewPullParser.getName().equals("packetReplyTimeout")) {
                                        f107255a = a(xmlPullParserNewPullParser, f107255a);
                                    } else if (xmlPullParserNewPullParser.getName().equals("keepAliveInterval")) {
                                        f107256b = a(xmlPullParserNewPullParser, f107256b);
                                    } else if (xmlPullParserNewPullParser.getName().equals("mechName")) {
                                        f538a.add(xmlPullParserNewPullParser.nextText());
                                    }
                                }
                                eventType = xmlPullParserNewPullParser.next();
                            } while (eventType != 1);
                        } catch (Exception e10) {
                            e10.printStackTrace();
                        }
                        try {
                            inputStreamOpenStream.close();
                        } catch (Exception unused) {
                        }
                    } catch (Throwable th2) {
                        try {
                            inputStreamOpenStream.close();
                        } catch (Exception unused2) {
                        }
                        throw th2;
                    }
                }
            }
        } catch (Exception e11) {
            e11.printStackTrace();
        }
    }

    private hh() {
    }

    public static int a() {
        return f107256b;
    }

    private static int a(XmlPullParser xmlPullParser, int i10) {
        try {
            return Integer.parseInt(xmlPullParser.nextText());
        } catch (NumberFormatException e10) {
            e10.printStackTrace();
            return i10;
        }
    }

    /* JADX INFO: renamed from: a, reason: collision with other method in class */
    public static String m448a() {
        return gg.a.f119052f;
    }

    private static void a(XmlPullParser xmlPullParser) throws XmlPullParserException, IOException {
        String strNextText = xmlPullParser.nextText();
        try {
            Class.forName(strNextText);
        } catch (ClassNotFoundException unused) {
            System.err.println("Error! A startup class specified in smack-config.xml could not be loaded: " + strNextText);
        }
    }

    /* JADX INFO: renamed from: a, reason: collision with other method in class */
    private static ClassLoader[] m449a() {
        ClassLoader[] classLoaderArr = {hh.class.getClassLoader(), Thread.currentThread().getContextClassLoader()};
        ArrayList arrayList = new ArrayList();
        for (int i10 = 0; i10 < 2; i10++) {
            ClassLoader classLoader = classLoaderArr[i10];
            if (classLoader != null) {
                arrayList.add(classLoader);
            }
        }
        return (ClassLoader[]) arrayList.toArray(new ClassLoader[arrayList.size()]);
    }

    public static int b() {
        return f107257c;
    }
}
