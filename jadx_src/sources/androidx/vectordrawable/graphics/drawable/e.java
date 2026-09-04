package androidx.vectordrawable.graphics.drawable;

import android.animation.Animator;
import android.animation.AnimatorInflater;
import android.animation.AnimatorSet;
import android.animation.Keyframe;
import android.animation.ObjectAnimator;
import android.animation.PropertyValuesHolder;
import android.animation.TypeEvaluator;
import android.animation.ValueAnimator;
import android.content.Context;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.content.res.XmlResourceParser;
import android.graphics.Path;
import android.graphics.PathMeasure;
import android.os.Build;
import android.util.AttributeSet;
import android.util.Log;
import android.util.TypedValue;
import android.util.Xml;
import android.view.InflateException;
import androidx.annotation.RestrictTo;
import androidx.core.content.res.q;
import androidx.core.graphics.m0;
import com.lzy.okgo.model.Progress;
import com.tencent.ugc.videoprocessor.watermark.data.AnimatedPasterJsonConfig;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Iterator;
import org.xmlpull.v1.XmlPullParser;
import org.xmlpull.v1.XmlPullParserException;

/* JADX INFO: compiled from: AnimatorInflaterCompat.java */
/* JADX INFO: loaded from: classes6.dex */
@RestrictTo({RestrictTo.Scope.LIBRARY_GROUP_PREFIX})
public class e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final String f28060a = "AnimatorInflater";

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static final int f28061b = 0;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static final int f28062c = 100;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private static final int f28063d = 0;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private static final int f28064e = 1;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private static final int f28065f = 2;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private static final int f28066g = 3;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private static final int f28067h = 4;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private static final boolean f28068i = false;

    /* JADX INFO: compiled from: AnimatorInflaterCompat.java */
    public static class a implements TypeEvaluator<m0.b[]> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private m0.b[] f28069a;

        a() {
        }

        a(m0.b[] bVarArr) {
            this.f28069a = bVarArr;
        }

        @Override // android.animation.TypeEvaluator
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public m0.b[] evaluate(float f10, m0.b[] bVarArr, m0.b[] bVarArr2) {
            if (!m0.b(bVarArr, bVarArr2)) {
                throw new IllegalArgumentException("Can't interpolate between two incompatible pathData");
            }
            if (!m0.b(this.f28069a, bVarArr)) {
                this.f28069a = m0.f(bVarArr);
            }
            for (int i10 = 0; i10 < bVarArr.length; i10++) {
                this.f28069a[i10].d(bVarArr[i10], bVarArr2[i10], f10);
            }
            return this.f28069a;
        }
    }

    private e() {
    }

    private static Animator a(Context context, Resources resources, Resources.Theme theme, XmlPullParser xmlPullParser, float f10) throws XmlPullParserException, IOException {
        return b(context, resources, theme, xmlPullParser, Xml.asAttributeSet(xmlPullParser), null, 0, f10);
    }

    private static Animator b(Context context, Resources resources, Resources.Theme theme, XmlPullParser xmlPullParser, AttributeSet attributeSet, AnimatorSet animatorSet, int i10, float f10) throws XmlPullParserException, IOException {
        int i11;
        int depth = xmlPullParser.getDepth();
        Animator animatorM = null;
        ArrayList arrayList = null;
        while (true) {
            int next = xmlPullParser.next();
            i11 = 0;
            if ((next == 3 && xmlPullParser.getDepth() <= depth) || next == 1) {
                break;
            }
            if (next == 2) {
                String name = xmlPullParser.getName();
                if (name.equals("objectAnimator")) {
                    animatorM = o(context, resources, theme, attributeSet, f10, xmlPullParser);
                } else {
                    if (name.equals("animator")) {
                        animatorM = m(context, resources, theme, attributeSet, null, f10, xmlPullParser);
                    } else if (name.equals("set")) {
                        AnimatorSet animatorSet2 = new AnimatorSet();
                        TypedArray typedArrayS = q.s(resources, theme, attributeSet, androidx.vectordrawable.graphics.drawable.a.f27988a0);
                        b(context, resources, theme, xmlPullParser, attributeSet, animatorSet2, q.k(typedArrayS, xmlPullParser, "ordering", 0, 0), f10);
                        typedArrayS.recycle();
                        animatorM = animatorSet2;
                    } else {
                        if (!name.equals("propertyValuesHolder")) {
                            throw new RuntimeException("Unknown animator name: " + xmlPullParser.getName());
                        }
                        PropertyValuesHolder[] propertyValuesHolderArrQ = q(context, resources, theme, xmlPullParser, Xml.asAttributeSet(xmlPullParser));
                        if (propertyValuesHolderArrQ != null && (animatorM instanceof ValueAnimator)) {
                            ((ValueAnimator) animatorM).setValues(propertyValuesHolderArrQ);
                        }
                        i11 = 1;
                    }
                    if (animatorSet == null && i11 == 0) {
                        if (arrayList == null) {
                            arrayList = new ArrayList();
                        }
                        arrayList.add(animatorM);
                    }
                }
                if (animatorSet == null) {
                }
            }
        }
        if (animatorSet != null && arrayList != null) {
            Animator[] animatorArr = new Animator[arrayList.size()];
            Iterator it = arrayList.iterator();
            while (it.hasNext()) {
                animatorArr[i11] = (Animator) it.next();
                i11++;
            }
            if (i10 == 0) {
                animatorSet.playTogether(animatorArr);
            } else {
                animatorSet.playSequentially(animatorArr);
            }
        }
        return animatorM;
    }

    private static Keyframe c(Keyframe keyframe, float f10) {
        if (keyframe.getType() == Float.TYPE) {
            return Keyframe.ofFloat(f10);
        }
        return keyframe.getType() == Integer.TYPE ? Keyframe.ofInt(f10) : Keyframe.ofObject(f10);
    }

    private static void d(Keyframe[] keyframeArr, float f10, int i10, int i11) {
        float f11 = f10 / ((i11 - i10) + 2);
        while (i10 <= i11) {
            keyframeArr[i10].setFraction(keyframeArr[i10 - 1].getFraction() + f11);
            i10++;
        }
    }

    private static void e(Object[] objArr, String str) {
        if (objArr == null || objArr.length == 0) {
            return;
        }
        Log.d(f28060a, str);
        int length = objArr.length;
        for (int i10 = 0; i10 < length; i10++) {
            Keyframe keyframe = (Keyframe) objArr[i10];
            StringBuilder sb2 = new StringBuilder();
            sb2.append("Keyframe ");
            sb2.append(i10);
            sb2.append(": fraction ");
            Object value = "null";
            sb2.append(keyframe.getFraction() < 0.0f ? "null" : Float.valueOf(keyframe.getFraction()));
            sb2.append(", , value : ");
            if (keyframe.hasValue()) {
                value = keyframe.getValue();
            }
            sb2.append(value);
            Log.d(f28060a, sb2.toString());
        }
    }

    private static PropertyValuesHolder f(TypedArray typedArray, int i10, int i11, int i12, String str) {
        int color;
        int color2;
        int color3;
        PropertyValuesHolder propertyValuesHolderOfFloat;
        PropertyValuesHolder propertyValuesHolderOfObject;
        TypedValue typedValuePeekValue = typedArray.peekValue(i11);
        boolean z10 = typedValuePeekValue != null;
        int i13 = z10 ? typedValuePeekValue.type : 0;
        TypedValue typedValuePeekValue2 = typedArray.peekValue(i12);
        boolean z11 = typedValuePeekValue2 != null;
        int i14 = z11 ? typedValuePeekValue2.type : 0;
        if (i10 == 4) {
            i10 = ((z10 && i(i13)) || (z11 && i(i14))) ? 3 : 0;
        }
        boolean z12 = i10 == 0;
        PropertyValuesHolder propertyValuesHolderOfInt = null;
        if (i10 == 2) {
            String string = typedArray.getString(i11);
            String string2 = typedArray.getString(i12);
            m0.b[] bVarArrD = m0.d(string);
            m0.b[] bVarArrD2 = m0.d(string2);
            if (bVarArrD == null && bVarArrD2 == null) {
                return null;
            }
            if (bVarArrD == null) {
                if (bVarArrD2 != null) {
                    return PropertyValuesHolder.ofObject(str, new a(), bVarArrD2);
                }
                return null;
            }
            a aVar = new a();
            if (bVarArrD2 == null) {
                propertyValuesHolderOfObject = PropertyValuesHolder.ofObject(str, aVar, bVarArrD);
            } else {
                if (!m0.b(bVarArrD, bVarArrD2)) {
                    throw new InflateException(" Can't morph from " + string + " to " + string2);
                }
                propertyValuesHolderOfObject = PropertyValuesHolder.ofObject(str, aVar, bVarArrD, bVarArrD2);
            }
            return propertyValuesHolderOfObject;
        }
        f fVarA = i10 == 3 ? f.a() : null;
        if (z12) {
            if (z10) {
                float dimension = i13 == 5 ? typedArray.getDimension(i11, 0.0f) : typedArray.getFloat(i11, 0.0f);
                if (z11) {
                    propertyValuesHolderOfFloat = PropertyValuesHolder.ofFloat(str, dimension, i14 == 5 ? typedArray.getDimension(i12, 0.0f) : typedArray.getFloat(i12, 0.0f));
                } else {
                    propertyValuesHolderOfFloat = PropertyValuesHolder.ofFloat(str, dimension);
                }
            } else {
                propertyValuesHolderOfFloat = PropertyValuesHolder.ofFloat(str, i14 == 5 ? typedArray.getDimension(i12, 0.0f) : typedArray.getFloat(i12, 0.0f));
            }
            propertyValuesHolderOfInt = propertyValuesHolderOfFloat;
        } else if (z10) {
            if (i13 == 5) {
                color2 = (int) typedArray.getDimension(i11, 0.0f);
            } else {
                color2 = i(i13) ? typedArray.getColor(i11, 0) : typedArray.getInt(i11, 0);
            }
            if (z11) {
                if (i14 == 5) {
                    color3 = (int) typedArray.getDimension(i12, 0.0f);
                } else {
                    color3 = i(i14) ? typedArray.getColor(i12, 0) : typedArray.getInt(i12, 0);
                }
                propertyValuesHolderOfInt = PropertyValuesHolder.ofInt(str, color2, color3);
            } else {
                propertyValuesHolderOfInt = PropertyValuesHolder.ofInt(str, color2);
            }
        } else if (z11) {
            if (i14 == 5) {
                color = (int) typedArray.getDimension(i12, 0.0f);
            } else {
                color = i(i14) ? typedArray.getColor(i12, 0) : typedArray.getInt(i12, 0);
            }
            propertyValuesHolderOfInt = PropertyValuesHolder.ofInt(str, color);
        }
        if (propertyValuesHolderOfInt == null || fVarA == null) {
            return propertyValuesHolderOfInt;
        }
        propertyValuesHolderOfInt.setEvaluator(fVarA);
        return propertyValuesHolderOfInt;
    }

    private static int g(TypedArray typedArray, int i10, int i11) {
        TypedValue typedValuePeekValue = typedArray.peekValue(i10);
        boolean z10 = typedValuePeekValue != null;
        int i12 = z10 ? typedValuePeekValue.type : 0;
        TypedValue typedValuePeekValue2 = typedArray.peekValue(i11);
        boolean z11 = typedValuePeekValue2 != null;
        return ((z10 && i(i12)) || (z11 && i(z11 ? typedValuePeekValue2.type : 0))) ? 3 : 0;
    }

    private static int h(Resources resources, Resources.Theme theme, AttributeSet attributeSet, XmlPullParser xmlPullParser) {
        TypedArray typedArrayS = q.s(resources, theme, attributeSet, androidx.vectordrawable.graphics.drawable.a.f28002h0);
        int i10 = 0;
        TypedValue typedValueT = q.t(typedArrayS, xmlPullParser, "value", 0);
        if ((typedValueT != null) && i(typedValueT.type)) {
            i10 = 3;
        }
        typedArrayS.recycle();
        return i10;
    }

    private static boolean i(int i10) {
        return i10 >= 28 && i10 <= 31;
    }

    public static Animator j(Context context, @androidx.annotation.b int i10) throws Resources.NotFoundException {
        return Build.VERSION.SDK_INT >= 24 ? AnimatorInflater.loadAnimator(context, i10) : k(context, context.getResources(), context.getTheme(), i10);
    }

    public static Animator k(Context context, Resources resources, Resources.Theme theme, @androidx.annotation.b int i10) throws Resources.NotFoundException {
        return l(context, resources, theme, i10, 1.0f);
    }

    public static Animator l(Context context, Resources resources, Resources.Theme theme, @androidx.annotation.b int i10, float f10) throws Resources.NotFoundException {
        XmlResourceParser animation = null;
        try {
            try {
                try {
                    animation = resources.getAnimation(i10);
                    Animator animatorA = a(context, resources, theme, animation, f10);
                    if (animation != null) {
                        animation.close();
                    }
                    return animatorA;
                } catch (XmlPullParserException e10) {
                    Resources.NotFoundException notFoundException = new Resources.NotFoundException("Can't load animation resource ID #0x" + Integer.toHexString(i10));
                    notFoundException.initCause(e10);
                    throw notFoundException;
                }
            } catch (IOException e11) {
                Resources.NotFoundException notFoundException2 = new Resources.NotFoundException("Can't load animation resource ID #0x" + Integer.toHexString(i10));
                notFoundException2.initCause(e11);
                throw notFoundException2;
            }
        } catch (Throwable th2) {
            if (animation != null) {
                animation.close();
            }
            throw th2;
        }
    }

    private static ValueAnimator m(Context context, Resources resources, Resources.Theme theme, AttributeSet attributeSet, ValueAnimator valueAnimator, float f10, XmlPullParser xmlPullParser) throws Resources.NotFoundException {
        TypedArray typedArrayS = q.s(resources, theme, attributeSet, androidx.vectordrawable.graphics.drawable.a.R);
        TypedArray typedArrayS2 = q.s(resources, theme, attributeSet, androidx.vectordrawable.graphics.drawable.a.f28012m0);
        if (valueAnimator == null) {
            valueAnimator = new ValueAnimator();
        }
        r(valueAnimator, typedArrayS, typedArrayS2, f10, xmlPullParser);
        int iL = q.l(typedArrayS, xmlPullParser, "interpolator", 0, 0);
        if (iL > 0) {
            valueAnimator.setInterpolator(d.b(context, iL));
        }
        typedArrayS.recycle();
        if (typedArrayS2 != null) {
            typedArrayS2.recycle();
        }
        return valueAnimator;
    }

    private static Keyframe n(Context context, Resources resources, Resources.Theme theme, AttributeSet attributeSet, int i10, XmlPullParser xmlPullParser) throws XmlPullParserException, IOException {
        Keyframe keyframeOfFloat;
        TypedArray typedArrayS = q.s(resources, theme, attributeSet, androidx.vectordrawable.graphics.drawable.a.f28002h0);
        float fJ = q.j(typedArrayS, xmlPullParser, Progress.G, 3, -1.0f);
        TypedValue typedValueT = q.t(typedArrayS, xmlPullParser, "value", 0);
        boolean z10 = typedValueT != null;
        if (i10 == 4) {
            i10 = (z10 && i(typedValueT.type)) ? 3 : 0;
        }
        if (!z10) {
            keyframeOfFloat = i10 == 0 ? Keyframe.ofFloat(fJ) : Keyframe.ofInt(fJ);
        } else if (i10 != 0) {
            keyframeOfFloat = (i10 == 1 || i10 == 3) ? Keyframe.ofInt(fJ, q.k(typedArrayS, xmlPullParser, "value", 0, 0)) : null;
        } else {
            keyframeOfFloat = Keyframe.ofFloat(fJ, q.j(typedArrayS, xmlPullParser, "value", 0, 0.0f));
        }
        int iL = q.l(typedArrayS, xmlPullParser, "interpolator", 1, 0);
        if (iL > 0) {
            keyframeOfFloat.setInterpolator(d.b(context, iL));
        }
        typedArrayS.recycle();
        return keyframeOfFloat;
    }

    private static ObjectAnimator o(Context context, Resources resources, Resources.Theme theme, AttributeSet attributeSet, float f10, XmlPullParser xmlPullParser) throws Resources.NotFoundException {
        ObjectAnimator objectAnimator = new ObjectAnimator();
        m(context, resources, theme, attributeSet, objectAnimator, f10, xmlPullParser);
        return objectAnimator;
    }

    private static PropertyValuesHolder p(Context context, Resources resources, Resources.Theme theme, XmlPullParser xmlPullParser, String str, int i10) throws XmlPullParserException, IOException {
        int size;
        PropertyValuesHolder propertyValuesHolderOfKeyframe = null;
        ArrayList arrayList = null;
        while (true) {
            int next = xmlPullParser.next();
            if (next == 3 || next == 1) {
                break;
            }
            if (xmlPullParser.getName().equals(AnimatedPasterJsonConfig.CONFIG_KEYFRAME)) {
                if (i10 == 4) {
                    i10 = h(resources, theme, Xml.asAttributeSet(xmlPullParser), xmlPullParser);
                }
                Keyframe keyframeN = n(context, resources, theme, Xml.asAttributeSet(xmlPullParser), i10, xmlPullParser);
                if (keyframeN != null) {
                    if (arrayList == null) {
                        arrayList = new ArrayList();
                    }
                    arrayList.add(keyframeN);
                }
                xmlPullParser.next();
            }
        }
        if (arrayList != null && (size = arrayList.size()) > 0) {
            Keyframe keyframe = (Keyframe) arrayList.get(0);
            Keyframe keyframe2 = (Keyframe) arrayList.get(size - 1);
            float fraction = keyframe2.getFraction();
            if (fraction < 1.0f) {
                if (fraction < 0.0f) {
                    keyframe2.setFraction(1.0f);
                } else {
                    arrayList.add(arrayList.size(), c(keyframe2, 1.0f));
                    size++;
                }
            }
            float fraction2 = keyframe.getFraction();
            if (fraction2 != 0.0f) {
                if (fraction2 < 0.0f) {
                    keyframe.setFraction(0.0f);
                } else {
                    arrayList.add(0, c(keyframe, 0.0f));
                    size++;
                }
            }
            Keyframe[] keyframeArr = new Keyframe[size];
            arrayList.toArray(keyframeArr);
            for (int i11 = 0; i11 < size; i11++) {
                Keyframe keyframe3 = keyframeArr[i11];
                if (keyframe3.getFraction() < 0.0f) {
                    if (i11 == 0) {
                        keyframe3.setFraction(0.0f);
                    } else {
                        int i12 = size - 1;
                        if (i11 == i12) {
                            keyframe3.setFraction(1.0f);
                        } else {
                            int i13 = i11;
                            for (int i14 = i11 + 1; i14 < i12 && keyframeArr[i14].getFraction() < 0.0f; i14++) {
                                i13 = i14;
                            }
                            d(keyframeArr, keyframeArr[i13 + 1].getFraction() - keyframeArr[i11 - 1].getFraction(), i11, i13);
                        }
                    }
                }
            }
            propertyValuesHolderOfKeyframe = PropertyValuesHolder.ofKeyframe(str, keyframeArr);
            if (i10 == 3) {
                propertyValuesHolderOfKeyframe.setEvaluator(f.a());
            }
        }
        return propertyValuesHolderOfKeyframe;
    }

    private static PropertyValuesHolder[] q(Context context, Resources resources, Resources.Theme theme, XmlPullParser xmlPullParser, AttributeSet attributeSet) throws XmlPullParserException, IOException {
        int i10;
        PropertyValuesHolder[] propertyValuesHolderArr = null;
        ArrayList arrayList = null;
        while (true) {
            int eventType = xmlPullParser.getEventType();
            if (eventType == 3 || eventType == 1) {
                break;
            }
            if (eventType != 2) {
                xmlPullParser.next();
            } else {
                if (xmlPullParser.getName().equals("propertyValuesHolder")) {
                    TypedArray typedArrayS = q.s(resources, theme, attributeSet, androidx.vectordrawable.graphics.drawable.a.f27992c0);
                    String strM = q.m(typedArrayS, xmlPullParser, "propertyName", 3);
                    int iK = q.k(typedArrayS, xmlPullParser, "valueType", 2, 4);
                    PropertyValuesHolder propertyValuesHolderP = p(context, resources, theme, xmlPullParser, strM, iK);
                    if (propertyValuesHolderP == null) {
                        propertyValuesHolderP = f(typedArrayS, iK, 0, 1, strM);
                    }
                    if (propertyValuesHolderP != null) {
                        if (arrayList == null) {
                            arrayList = new ArrayList();
                        }
                        arrayList.add(propertyValuesHolderP);
                    }
                    typedArrayS.recycle();
                }
                xmlPullParser.next();
            }
        }
        if (arrayList != null) {
            int size = arrayList.size();
            propertyValuesHolderArr = new PropertyValuesHolder[size];
            for (i10 = 0; i10 < size; i10++) {
                propertyValuesHolderArr[i10] = (PropertyValuesHolder) arrayList.get(i10);
            }
        }
        return propertyValuesHolderArr;
    }

    private static void r(ValueAnimator valueAnimator, TypedArray typedArray, TypedArray typedArray2, float f10, XmlPullParser xmlPullParser) {
        long jK = q.k(typedArray, xmlPullParser, "duration", 1, 300);
        long jK2 = q.k(typedArray, xmlPullParser, "startOffset", 2, 0);
        int iK = q.k(typedArray, xmlPullParser, "valueType", 7, 4);
        if (q.r(xmlPullParser, "valueFrom") && q.r(xmlPullParser, "valueTo")) {
            if (iK == 4) {
                iK = g(typedArray, 5, 6);
            }
            PropertyValuesHolder propertyValuesHolderF = f(typedArray, iK, 5, 6, "");
            if (propertyValuesHolderF != null) {
                valueAnimator.setValues(propertyValuesHolderF);
            }
        }
        valueAnimator.setDuration(jK);
        valueAnimator.setStartDelay(jK2);
        valueAnimator.setRepeatCount(q.k(typedArray, xmlPullParser, "repeatCount", 3, 0));
        valueAnimator.setRepeatMode(q.k(typedArray, xmlPullParser, "repeatMode", 4, 1));
        if (typedArray2 != null) {
            s(valueAnimator, typedArray2, iK, f10, xmlPullParser);
        }
    }

    private static void s(ValueAnimator valueAnimator, TypedArray typedArray, int i10, float f10, XmlPullParser xmlPullParser) {
        ObjectAnimator objectAnimator = (ObjectAnimator) valueAnimator;
        String strM = q.m(typedArray, xmlPullParser, "pathData", 1);
        if (strM == null) {
            objectAnimator.setPropertyName(q.m(typedArray, xmlPullParser, "propertyName", 0));
            return;
        }
        String strM2 = q.m(typedArray, xmlPullParser, "propertyXName", 2);
        String strM3 = q.m(typedArray, xmlPullParser, "propertyYName", 3);
        if (i10 != 2) {
        }
        if (strM2 != null || strM3 != null) {
            t(m0.e(strM), objectAnimator, f10 * 0.5f, strM2, strM3);
            return;
        }
        throw new InflateException(typedArray.getPositionDescription() + " propertyXName or propertyYName is needed for PathData");
    }

    private static void t(Path path, ObjectAnimator objectAnimator, float f10, String str, String str2) {
        PathMeasure pathMeasure = new PathMeasure(path, false);
        ArrayList arrayList = new ArrayList();
        float f11 = 0.0f;
        arrayList.add(Float.valueOf(0.0f));
        float length = 0.0f;
        do {
            length += pathMeasure.getLength();
            arrayList.add(Float.valueOf(length));
        } while (pathMeasure.nextContour());
        PathMeasure pathMeasure2 = new PathMeasure(path, false);
        int iMin = Math.min(100, ((int) (length / f10)) + 1);
        float[] fArr = new float[iMin];
        float[] fArr2 = new float[iMin];
        float[] fArr3 = new float[2];
        float f12 = length / (iMin - 1);
        int i10 = 0;
        int i11 = 0;
        while (true) {
            if (i10 >= iMin) {
                break;
            }
            pathMeasure2.getPosTan(f11 - ((Float) arrayList.get(i11)).floatValue(), fArr3, null);
            fArr[i10] = fArr3[0];
            fArr2[i10] = fArr3[1];
            f11 += f12;
            int i12 = i11 + 1;
            if (i12 < arrayList.size() && f11 > ((Float) arrayList.get(i12)).floatValue()) {
                pathMeasure2.nextContour();
                i11 = i12;
            }
            i10++;
        }
        PropertyValuesHolder propertyValuesHolderOfFloat = str != null ? PropertyValuesHolder.ofFloat(str, fArr) : null;
        PropertyValuesHolder propertyValuesHolderOfFloat2 = str2 != null ? PropertyValuesHolder.ofFloat(str2, fArr2) : null;
        if (propertyValuesHolderOfFloat == null) {
            objectAnimator.setValues(propertyValuesHolderOfFloat2);
        } else if (propertyValuesHolderOfFloat2 == null) {
            objectAnimator.setValues(propertyValuesHolderOfFloat);
        } else {
            objectAnimator.setValues(propertyValuesHolderOfFloat, propertyValuesHolderOfFloat2);
        }
    }
}
