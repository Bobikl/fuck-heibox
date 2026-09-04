package androidx.core.content.res;

import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.LinearGradient;
import android.graphics.RadialGradient;
import android.graphics.Shader;
import android.graphics.SweepGradient;
import android.util.AttributeSet;
import android.util.Xml;
import androidx.annotation.RestrictTo;
import androidx.annotation.n0;
import androidx.annotation.p0;
import androidx.core.R;
import com.max.xiaoheihe.module.bbs.ChannelListActivity;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import org.xmlpull.v1.XmlPullParser;
import org.xmlpull.v1.XmlPullParserException;

/* JADX INFO: compiled from: GradientColorInflaterCompat.java */
/* JADX INFO: loaded from: classes.dex */
@RestrictTo({RestrictTo.Scope.LIBRARY_GROUP_PREFIX})
public final class g {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final int f20579a = 0;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static final int f20580b = 1;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static final int f20581c = 2;

    /* JADX INFO: compiled from: GradientColorInflaterCompat.java */
    public static final class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final int[] f20582a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final float[] f20583b;

        a(@androidx.annotation.l int i10, @androidx.annotation.l int i11) {
            this.f20582a = new int[]{i10, i11};
            this.f20583b = new float[]{0.0f, 1.0f};
        }

        a(@androidx.annotation.l int i10, @androidx.annotation.l int i11, @androidx.annotation.l int i12) {
            this.f20582a = new int[]{i10, i11, i12};
            this.f20583b = new float[]{0.0f, 0.5f, 1.0f};
        }

        a(@n0 List<Integer> list, @n0 List<Float> list2) {
            int size = list.size();
            this.f20582a = new int[size];
            this.f20583b = new float[size];
            for (int i10 = 0; i10 < size; i10++) {
                this.f20582a[i10] = list.get(i10).intValue();
                this.f20583b[i10] = list2.get(i10).floatValue();
            }
        }
    }

    private g() {
    }

    private static a a(@p0 a aVar, @androidx.annotation.l int i10, @androidx.annotation.l int i11, boolean z10, @androidx.annotation.l int i12) {
        if (aVar != null) {
            return aVar;
        }
        return z10 ? new a(i10, i12, i11) : new a(i10, i11);
    }

    static Shader b(@n0 Resources resources, @n0 XmlPullParser xmlPullParser, @p0 Resources.Theme theme) throws XmlPullParserException, IOException {
        int next;
        AttributeSet attributeSetAsAttributeSet = Xml.asAttributeSet(xmlPullParser);
        do {
            next = xmlPullParser.next();
            if (next == 2) {
                break;
            }
        } while (next != 1);
        if (next == 2) {
            return c(resources, xmlPullParser, attributeSetAsAttributeSet, theme);
        }
        throw new XmlPullParserException("No start tag found");
    }

    static Shader c(@n0 Resources resources, @n0 XmlPullParser xmlPullParser, @n0 AttributeSet attributeSet, @p0 Resources.Theme theme) throws XmlPullParserException, IOException {
        String name = xmlPullParser.getName();
        if (!name.equals("gradient")) {
            throw new XmlPullParserException(xmlPullParser.getPositionDescription() + ": invalid gradient color tag " + name);
        }
        TypedArray typedArrayS = q.s(resources, theme, attributeSet, R.styleable.f19830e);
        float fJ = q.j(typedArrayS, xmlPullParser, "startX", R.styleable.GradientColor_android_startX, 0.0f);
        float fJ2 = q.j(typedArrayS, xmlPullParser, "startY", R.styleable.GradientColor_android_startY, 0.0f);
        float fJ3 = q.j(typedArrayS, xmlPullParser, "endX", R.styleable.GradientColor_android_endX, 0.0f);
        float fJ4 = q.j(typedArrayS, xmlPullParser, "endY", R.styleable.GradientColor_android_endY, 0.0f);
        float fJ5 = q.j(typedArrayS, xmlPullParser, "centerX", R.styleable.GradientColor_android_centerX, 0.0f);
        float fJ6 = q.j(typedArrayS, xmlPullParser, "centerY", R.styleable.GradientColor_android_centerY, 0.0f);
        int iK = q.k(typedArrayS, xmlPullParser, "type", R.styleable.GradientColor_android_type, 0);
        int iF = q.f(typedArrayS, xmlPullParser, "startColor", R.styleable.GradientColor_android_startColor, 0);
        boolean zR = q.r(xmlPullParser, "centerColor");
        int iF2 = q.f(typedArrayS, xmlPullParser, "centerColor", R.styleable.GradientColor_android_centerColor, 0);
        int iF3 = q.f(typedArrayS, xmlPullParser, "endColor", R.styleable.GradientColor_android_endColor, 0);
        int iK2 = q.k(typedArrayS, xmlPullParser, "tileMode", R.styleable.GradientColor_android_tileMode, 0);
        float fJ7 = q.j(typedArrayS, xmlPullParser, "gradientRadius", R.styleable.GradientColor_android_gradientRadius, 0.0f);
        typedArrayS.recycle();
        a aVarA = a(d(resources, xmlPullParser, attributeSet, theme), iF, iF3, zR, iF2);
        if (iK != 1) {
            return iK != 2 ? new LinearGradient(fJ, fJ2, fJ3, fJ4, aVarA.f20582a, aVarA.f20583b, e(iK2)) : new SweepGradient(fJ5, fJ6, aVarA.f20582a, aVarA.f20583b);
        }
        if (fJ7 > 0.0f) {
            return new RadialGradient(fJ5, fJ6, fJ7, aVarA.f20582a, aVarA.f20583b, e(iK2));
        }
        throw new XmlPullParserException("<gradient> tag requires 'gradientRadius' attribute with radial type");
    }

    private static a d(@n0 Resources resources, @n0 XmlPullParser xmlPullParser, @n0 AttributeSet attributeSet, @p0 Resources.Theme theme) throws XmlPullParserException, IOException {
        int depth;
        int depth2 = xmlPullParser.getDepth() + 1;
        ArrayList arrayList = new ArrayList(20);
        ArrayList arrayList2 = new ArrayList(20);
        while (true) {
            int next = xmlPullParser.next();
            if (next == 1 || ((depth = xmlPullParser.getDepth()) < depth2 && next == 3)) {
                break;
            }
            if (next == 2 && depth <= depth2 && xmlPullParser.getName().equals(ChannelListActivity.q.f79586f)) {
                TypedArray typedArrayS = q.s(resources, theme, attributeSet, R.styleable.f19831f);
                int i10 = R.styleable.GradientColorItem_android_color;
                boolean zHasValue = typedArrayS.hasValue(i10);
                int i11 = R.styleable.GradientColorItem_android_offset;
                boolean zHasValue2 = typedArrayS.hasValue(i11);
                if (!zHasValue || !zHasValue2) {
                    throw new XmlPullParserException(xmlPullParser.getPositionDescription() + ": <item> tag requires a 'color' attribute and a 'offset' attribute!");
                }
                int color = typedArrayS.getColor(i10, 0);
                float f10 = typedArrayS.getFloat(i11, 0.0f);
                typedArrayS.recycle();
                arrayList2.add(Integer.valueOf(color));
                arrayList.add(Float.valueOf(f10));
            }
        }
        if (arrayList2.size() > 0) {
            return new a(arrayList2, arrayList);
        }
        return null;
    }

    private static Shader.TileMode e(int i10) {
        if (i10 != 1) {
            return i10 != 2 ? Shader.TileMode.CLAMP : Shader.TileMode.MIRROR;
        }
        return Shader.TileMode.REPEAT;
    }
}
