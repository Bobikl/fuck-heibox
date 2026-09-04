package androidx.core.content.pm;

import android.content.Context;
import android.content.Intent;
import android.content.pm.ActivityInfo;
import android.content.pm.ResolveInfo;
import android.content.res.XmlResourceParser;
import android.os.Bundle;
import android.util.Log;
import androidx.annotation.RestrictTo;
import androidx.annotation.j1;
import androidx.annotation.k1;
import androidx.annotation.n0;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import org.xmlpull.v1.XmlPullParser;
import org.xmlpull.v1.XmlPullParserException;

/* JADX INFO: compiled from: ShortcutXmlParser.java */
/* JADX INFO: loaded from: classes.dex */
@RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
public class v {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final String f20533a = "ShortcutXmlParser";

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static final String f20534b = "android.app.shortcuts";

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static final String f20535c = "shortcut";

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private static final String f20536d = "shortcutId";

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private static volatile ArrayList<String> f20537e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private static final Object f20538f = new Object();

    private v() {
    }

    private static String a(XmlPullParser xmlPullParser, String str) {
        String attributeValue = xmlPullParser.getAttributeValue("http://schemas.android.com/apk/res/android", str);
        return attributeValue == null ? xmlPullParser.getAttributeValue(null, str) : attributeValue;
    }

    @k1
    @n0
    public static List<String> b(@n0 Context context) {
        if (f20537e == null) {
            synchronized (f20538f) {
                if (f20537e == null) {
                    f20537e = new ArrayList<>();
                    f20537e.addAll(e(context));
                }
            }
        }
        return f20537e;
    }

    @n0
    private static XmlResourceParser c(Context context, ActivityInfo activityInfo) {
        XmlResourceParser xmlResourceParserLoadXmlMetaData = activityInfo.loadXmlMetaData(context.getPackageManager(), f20534b);
        if (xmlResourceParserLoadXmlMetaData != null) {
            return xmlResourceParserLoadXmlMetaData;
        }
        throw new IllegalArgumentException("Failed to open android.app.shortcuts meta-data resource of " + activityInfo.name);
    }

    @j1
    @n0
    public static List<String> d(@n0 XmlPullParser xmlPullParser) throws XmlPullParserException, IOException {
        String strA;
        ArrayList arrayList = new ArrayList(1);
        while (true) {
            int next = xmlPullParser.next();
            if (next == 1 || (next == 3 && xmlPullParser.getDepth() <= 0)) {
                break;
            }
            int depth = xmlPullParser.getDepth();
            String name = xmlPullParser.getName();
            if (next == 2 && depth == 2 && f20535c.equals(name) && (strA = a(xmlPullParser, f20536d)) != null) {
                arrayList.add(strA);
            }
        }
        return arrayList;
    }

    @n0
    private static Set<String> e(@n0 Context context) {
        HashSet hashSet = new HashSet();
        Intent intent = new Intent("android.intent.action.MAIN");
        intent.addCategory("android.intent.category.LAUNCHER");
        intent.setPackage(context.getPackageName());
        List<ResolveInfo> listQueryIntentActivities = context.getPackageManager().queryIntentActivities(intent, 128);
        if (listQueryIntentActivities != null && listQueryIntentActivities.size() != 0) {
            try {
                Iterator<ResolveInfo> it = listQueryIntentActivities.iterator();
                while (it.hasNext()) {
                    ActivityInfo activityInfo = it.next().activityInfo;
                    Bundle bundle = activityInfo.metaData;
                    if (bundle != null && bundle.containsKey(f20534b)) {
                        XmlResourceParser xmlResourceParserC = c(context, activityInfo);
                        try {
                            hashSet.addAll(d(xmlResourceParserC));
                            if (xmlResourceParserC != null) {
                                xmlResourceParserC.close();
                            }
                        } catch (Throwable th2) {
                            if (xmlResourceParserC != null) {
                                try {
                                    xmlResourceParserC.close();
                                } catch (Throwable th3) {
                                    th2.addSuppressed(th3);
                                }
                            }
                            throw th2;
                        }
                    }
                }
            } catch (Exception e10) {
                Log.e(f20533a, "Failed to parse the Xml resource: ", e10);
            }
        }
        return hashSet;
    }
}
