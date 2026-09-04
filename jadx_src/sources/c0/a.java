package c0;

import android.animation.ObjectAnimator;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.util.TypedValue;
import androidx.annotation.RestrictTo;
import androidx.annotation.n0;
import androidx.annotation.p0;
import androidx.annotation.u;
import androidx.annotation.w0;
import java.io.IOException;
import org.xmlpull.v1.XmlPullParser;
import org.xmlpull.v1.XmlPullParserException;

/* JADX INFO: compiled from: Compatibility.java */
/* JADX INFO: loaded from: classes.dex */
@RestrictTo({RestrictTo.Scope.LIBRARY})
public final class a {

    /* JADX INFO: renamed from: c0.a$a, reason: collision with other inner class name */
    /* JADX INFO: compiled from: Compatibility.java */
    @w0(15)
    public static class C0263a {
        private C0263a() {
        }

        @u
        public static void a(@n0 Resources resources, int i10, int i11, @n0 TypedValue typedValue, boolean z10) {
            resources.getValueForDensity(i10, i11, typedValue, z10);
        }
    }

    /* JADX INFO: compiled from: Compatibility.java */
    @w0(18)
    public static class b {
        private b() {
        }

        @u
        public static void a(@n0 ObjectAnimator objectAnimator, boolean z10) {
            objectAnimator.setAutoCancel(z10);
        }
    }

    /* JADX INFO: compiled from: Compatibility.java */
    @w0(21)
    public static class c {
        private c() {
        }

        @n0
        @u
        public static Drawable a(@n0 Resources resources, @n0 XmlPullParser xmlPullParser, @n0 AttributeSet attributeSet, @p0 Resources.Theme theme) throws XmlPullParserException, IOException {
            return Drawable.createFromXmlInner(resources, xmlPullParser, attributeSet, theme);
        }

        @u
        public static int b(@n0 TypedArray typedArray) {
            return typedArray.getChangingConfigurations();
        }

        @u
        public static void c(@n0 Drawable drawable, @n0 Resources resources, @n0 XmlPullParser xmlPullParser, @n0 AttributeSet attributeSet, @p0 Resources.Theme theme) throws XmlPullParserException, IOException {
            drawable.inflate(resources, xmlPullParser, attributeSet, theme);
        }
    }

    private a() {
    }
}
