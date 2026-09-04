package androidx.appcompat.app;

import android.util.AttributeSet;
import androidx.annotation.n0;
import androidx.annotation.p0;
import java.lang.ref.WeakReference;
import java.util.ArrayDeque;
import java.util.Deque;
import org.xmlpull.v1.XmlPullParser;
import org.xmlpull.v1.XmlPullParserException;

/* JADX INFO: compiled from: LayoutIncludeDetector.java */
/* JADX INFO: loaded from: classes.dex */
public class l {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @n0
    private final Deque<WeakReference<XmlPullParser>> f1816a = new ArrayDeque();

    l() {
    }

    private static boolean b(@p0 XmlPullParser xmlPullParser) {
        if (xmlPullParser == null) {
            return true;
        }
        try {
            return xmlPullParser.getEventType() == 3 || xmlPullParser.getEventType() == 1;
        } catch (XmlPullParserException unused) {
            return true;
        }
    }

    @p0
    private static XmlPullParser c(@n0 Deque<WeakReference<XmlPullParser>> deque) {
        while (!deque.isEmpty()) {
            XmlPullParser xmlPullParser = deque.peek().get();
            if (!b(xmlPullParser)) {
                return xmlPullParser;
            }
            deque.pop();
        }
        return null;
    }

    private static boolean d(@n0 XmlPullParser xmlPullParser, @p0 XmlPullParser xmlPullParser2) {
        if (xmlPullParser2 == null || xmlPullParser == xmlPullParser2) {
            return false;
        }
        try {
            if (xmlPullParser2.getEventType() == 2) {
                return "include".equals(xmlPullParser2.getName());
            }
            return false;
        } catch (XmlPullParserException unused) {
            return false;
        }
    }

    boolean a(@n0 AttributeSet attributeSet) {
        if (!(attributeSet instanceof XmlPullParser)) {
            return false;
        }
        XmlPullParser xmlPullParser = (XmlPullParser) attributeSet;
        if (xmlPullParser.getDepth() != 1) {
            return false;
        }
        XmlPullParser xmlPullParserC = c(this.f1816a);
        this.f1816a.push(new WeakReference<>(xmlPullParser));
        return d(xmlPullParser, xmlPullParserC);
    }
}
