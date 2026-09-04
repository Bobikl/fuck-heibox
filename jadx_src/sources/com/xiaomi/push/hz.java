package com.xiaomi.push;

import java.io.InputStream;
import java.net.URL;
import java.util.ArrayList;
import java.util.Enumeration;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import org.xmlpull.v1.XmlPullParser;
import org.xmlpull.v1.XmlPullParserFactory;

/* JADX INFO: loaded from: classes4.dex */
public class hz {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static hz f107347a;

    /* JADX INFO: renamed from: a, reason: collision with other field name */
    private Map<String, Object> f565a = new ConcurrentHashMap();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private Map<String, Object> f107348b = new ConcurrentHashMap();

    private hz() {
        m464a();
    }

    public static synchronized hz a() {
        if (f107347a == null) {
            f107347a = new hz();
        }
        return f107347a;
    }

    private String a(String str, String str2) {
        StringBuilder sb2 = new StringBuilder();
        sb2.append("<");
        sb2.append(str);
        sb2.append("/>");
        if (str != null) {
            sb2.append("<");
            sb2.append(str2);
            sb2.append("/>");
        }
        return sb2.toString();
    }

    /* JADX INFO: renamed from: a, reason: collision with other method in class */
    private ClassLoader[] m462a() {
        ClassLoader[] classLoaderArr = {hz.class.getClassLoader(), Thread.currentThread().getContextClassLoader()};
        ArrayList arrayList = new ArrayList();
        for (int i10 = 0; i10 < 2; i10++) {
            ClassLoader classLoader = classLoaderArr[i10];
            if (classLoader != null) {
                arrayList.add(classLoader);
            }
        }
        return (ClassLoader[]) arrayList.toArray(new ClassLoader[arrayList.size()]);
    }

    /* JADX INFO: renamed from: a, reason: collision with other method in class */
    public Object m463a(String str, String str2) {
        return this.f565a.get(a(str, str2));
    }

    /* JADX INFO: renamed from: a, reason: collision with other method in class */
    protected void m464a() {
        try {
            for (ClassLoader classLoader : m462a()) {
                Enumeration<URL> resources = classLoader.getResources("META-INF/smack.providers");
                while (resources.hasMoreElements()) {
                    InputStream inputStreamOpenStream = null;
                    try {
                        inputStreamOpenStream = resources.nextElement().openStream();
                        XmlPullParser xmlPullParserNewPullParser = XmlPullParserFactory.newInstance().newPullParser();
                        xmlPullParserNewPullParser.setFeature("http://xmlpull.org/v1/doc/features.html#process-namespaces", true);
                        xmlPullParserNewPullParser.setInput(inputStreamOpenStream, "UTF-8");
                        int eventType = xmlPullParserNewPullParser.getEventType();
                        do {
                            if (eventType == 2) {
                                if (xmlPullParserNewPullParser.getName().equals("iqProvider")) {
                                    xmlPullParserNewPullParser.next();
                                    xmlPullParserNewPullParser.next();
                                    String strNextText = xmlPullParserNewPullParser.nextText();
                                    xmlPullParserNewPullParser.next();
                                    xmlPullParserNewPullParser.next();
                                    String strNextText2 = xmlPullParserNewPullParser.nextText();
                                    xmlPullParserNewPullParser.next();
                                    xmlPullParserNewPullParser.next();
                                    String strNextText3 = xmlPullParserNewPullParser.nextText();
                                    String strA = a(strNextText, strNextText2);
                                    if (!this.f107348b.containsKey(strA)) {
                                        try {
                                            Class<?> cls = Class.forName(strNextText3);
                                            if (hx.class.isAssignableFrom(cls)) {
                                                this.f107348b.put(strA, cls.newInstance());
                                            } else if (hq.class.isAssignableFrom(cls)) {
                                                this.f107348b.put(strA, cls);
                                            }
                                        } catch (ClassNotFoundException e10) {
                                            e10.printStackTrace();
                                        }
                                    }
                                } else if (xmlPullParserNewPullParser.getName().equals("extensionProvider")) {
                                    xmlPullParserNewPullParser.next();
                                    xmlPullParserNewPullParser.next();
                                    String strNextText4 = xmlPullParserNewPullParser.nextText();
                                    xmlPullParserNewPullParser.next();
                                    xmlPullParserNewPullParser.next();
                                    String strNextText5 = xmlPullParserNewPullParser.nextText();
                                    xmlPullParserNewPullParser.next();
                                    xmlPullParserNewPullParser.next();
                                    String strNextText6 = xmlPullParserNewPullParser.nextText();
                                    String strA2 = a(strNextText4, strNextText5);
                                    if (!this.f565a.containsKey(strA2)) {
                                        try {
                                            Class<?> cls2 = Class.forName(strNextText6);
                                            if (hy.class.isAssignableFrom(cls2)) {
                                                this.f565a.put(strA2, cls2.newInstance());
                                            } else if (ht.class.isAssignableFrom(cls2)) {
                                                this.f565a.put(strA2, cls2);
                                            }
                                        } catch (ClassNotFoundException e11) {
                                            e11.printStackTrace();
                                        }
                                    }
                                }
                            }
                            eventType = xmlPullParserNewPullParser.next();
                        } while (eventType != 1);
                        inputStreamOpenStream.close();
                    } catch (Throwable th2) {
                        try {
                            inputStreamOpenStream.close();
                        } catch (Exception unused) {
                        }
                        throw th2;
                    }
                }
            }
        } catch (Exception e12) {
            e12.printStackTrace();
        }
    }

    public void a(String str, String str2, Object obj) {
        if (!(obj instanceof hy) && !(obj instanceof Class)) {
            throw new IllegalArgumentException("Provider must be a PacketExtensionProvider or a Class instance.");
        }
        this.f565a.put(a(str, str2), obj);
    }
}
