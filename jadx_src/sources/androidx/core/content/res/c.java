package androidx.core.content.res;

import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.Color;
import android.os.Build;
import android.util.AttributeSet;
import android.util.Log;
import android.util.StateSet;
import android.util.TypedValue;
import android.util.Xml;
import androidx.annotation.RestrictTo;
import androidx.annotation.l1;
import androidx.annotation.n0;
import androidx.annotation.p0;
import androidx.annotation.x;
import androidx.core.R;
import com.max.xiaoheihe.module.bbs.ChannelListActivity;
import java.io.IOException;
import org.xmlpull.v1.XmlPullParser;
import org.xmlpull.v1.XmlPullParserException;

/* JADX INFO: compiled from: ColorStateListInflaterCompat.java */
/* JADX INFO: loaded from: classes.dex */
@RestrictTo({RestrictTo.Scope.LIBRARY_GROUP_PREFIX})
public final class c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final ThreadLocal<TypedValue> f20557a = new ThreadLocal<>();

    private c() {
    }

    @n0
    public static ColorStateList a(@n0 Resources resources, @n0 XmlPullParser xmlPullParser, @p0 Resources.Theme theme) throws XmlPullParserException, IOException {
        int next;
        AttributeSet attributeSetAsAttributeSet = Xml.asAttributeSet(xmlPullParser);
        do {
            next = xmlPullParser.next();
            if (next == 2) {
                break;
            }
        } while (next != 1);
        if (next == 2) {
            return b(resources, xmlPullParser, attributeSetAsAttributeSet, theme);
        }
        throw new XmlPullParserException("No start tag found");
    }

    @n0
    public static ColorStateList b(@n0 Resources resources, @n0 XmlPullParser xmlPullParser, @n0 AttributeSet attributeSet, @p0 Resources.Theme theme) throws XmlPullParserException, IOException {
        String name = xmlPullParser.getName();
        if (name.equals("selector")) {
            return e(resources, xmlPullParser, attributeSet, theme);
        }
        throw new XmlPullParserException(xmlPullParser.getPositionDescription() + ": invalid color state list tag " + name);
    }

    @n0
    private static TypedValue c() {
        ThreadLocal<TypedValue> threadLocal = f20557a;
        TypedValue typedValue = threadLocal.get();
        if (typedValue != null) {
            return typedValue;
        }
        TypedValue typedValue2 = new TypedValue();
        threadLocal.set(typedValue2);
        return typedValue2;
    }

    @p0
    public static ColorStateList d(@n0 Resources resources, @l1 int i10, @p0 Resources.Theme theme) {
        try {
            return a(resources, resources.getXml(i10), theme);
        } catch (Exception e10) {
            Log.e("CSLCompat", "Failed to inflate ColorStateList.", e10);
            return null;
        }
    }

    /* JADX WARN: Code duplicated, block: B:34:0x0095  */
    private static ColorStateList e(@n0 Resources resources, @n0 XmlPullParser xmlPullParser, @n0 AttributeSet attributeSet, @p0 Resources.Theme theme) throws XmlPullParserException, IOException {
        int depth;
        int color;
        float f10;
        int i10 = 1;
        int depth2 = xmlPullParser.getDepth() + 1;
        int[][] iArr = new int[20][];
        int[] iArrA = new int[20];
        int i11 = 0;
        while (true) {
            int next = xmlPullParser.next();
            if (next == i10 || ((depth = xmlPullParser.getDepth()) < depth2 && next == 3)) {
                break;
            }
            if (next == 2 && depth <= depth2 && xmlPullParser.getName().equals(ChannelListActivity.q.f79586f)) {
                TypedArray typedArrayH = h(resources, theme, attributeSet, R.styleable.f19827b);
                int i12 = R.styleable.ColorStateListItem_android_color;
                int resourceId = typedArrayH.getResourceId(i12, -1);
                if (resourceId == -1 || f(resources, resourceId)) {
                    color = typedArrayH.getColor(i12, -65281);
                } else {
                    try {
                        color = a(resources, resources.getXml(resourceId), theme).getDefaultColor();
                    } catch (Exception unused) {
                        color = typedArrayH.getColor(R.styleable.ColorStateListItem_android_color, -65281);
                    }
                }
                float f11 = 1.0f;
                int i13 = R.styleable.ColorStateListItem_android_alpha;
                if (typedArrayH.hasValue(i13)) {
                    f11 = typedArrayH.getFloat(i13, 1.0f);
                } else {
                    int i14 = R.styleable.ColorStateListItem_alpha;
                    if (typedArrayH.hasValue(i14)) {
                        f11 = typedArrayH.getFloat(i14, 1.0f);
                    }
                }
                if (Build.VERSION.SDK_INT >= 31) {
                    int i15 = R.styleable.ColorStateListItem_android_lStar;
                    if (typedArrayH.hasValue(i15)) {
                        f10 = typedArrayH.getFloat(i15, -1.0f);
                    } else {
                        f10 = typedArrayH.getFloat(R.styleable.ColorStateListItem_lStar, -1.0f);
                    }
                } else {
                    f10 = typedArrayH.getFloat(R.styleable.ColorStateListItem_lStar, -1.0f);
                }
                typedArrayH.recycle();
                int attributeCount = attributeSet.getAttributeCount();
                int[] iArr2 = new int[attributeCount];
                int i16 = 0;
                for (int i17 = 0; i17 < attributeCount; i17++) {
                    int attributeNameResource = attributeSet.getAttributeNameResource(i17);
                    if (attributeNameResource != 16843173 && attributeNameResource != 16843551 && attributeNameResource != R.attr.alpha && attributeNameResource != R.attr.lStar) {
                        int i18 = i16 + 1;
                        if (!attributeSet.getAttributeBooleanValue(i17, false)) {
                            attributeNameResource = -attributeNameResource;
                        }
                        iArr2[i16] = attributeNameResource;
                        i16 = i18;
                    }
                }
                int[] iArrTrimStateSet = StateSet.trimStateSet(iArr2, i16);
                iArrA = h.a(iArrA, i11, g(color, f11, f10));
                iArr = (int[][]) h.c(iArr, i11, iArrTrimStateSet);
                i11++;
            }
            i10 = 1;
        }
        int[] iArr3 = new int[i11];
        int[][] iArr4 = new int[i11][];
        System.arraycopy(iArrA, 0, iArr3, 0, i11);
        System.arraycopy(iArr, 0, iArr4, 0, i11);
        return new ColorStateList(iArr4, iArr3);
    }

    private static boolean f(@n0 Resources resources, @androidx.annotation.n int i10) {
        TypedValue typedValueC = c();
        resources.getValue(i10, typedValueC, true);
        int i11 = typedValueC.type;
        return i11 >= 28 && i11 <= 31;
    }

    @androidx.annotation.l
    private static int g(@androidx.annotation.l int i10, @x(from = 0.0d, to = com.google.android.material.color.utilities.d.f53848a) float f10, @x(from = 0.0d, to = 100.0d) float f11) {
        boolean z10 = f11 >= 0.0f && f11 <= 100.0f;
        if (f10 == 1.0f && !z10) {
            return i10;
        }
        int iE = a2.a.e((int) ((Color.alpha(i10) * f10) + 0.5f), 0, 255);
        if (z10) {
            a aVarC = a.c(i10);
            i10 = a.p(aVarC.j(), aVarC.i(), f11);
        }
        return (i10 & 16777215) | (iE << 24);
    }

    private static TypedArray h(Resources resources, Resources.Theme theme, AttributeSet attributeSet, int[] iArr) {
        return theme == null ? resources.obtainAttributes(attributeSet, iArr) : theme.obtainStyledAttributes(attributeSet, iArr, 0, 0);
    }
}
