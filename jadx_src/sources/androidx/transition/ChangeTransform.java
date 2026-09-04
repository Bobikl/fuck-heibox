package androidx.transition;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.ObjectAnimator;
import android.animation.PropertyValuesHolder;
import android.annotation.SuppressLint;
import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Matrix;
import android.graphics.PointF;
import android.util.AttributeSet;
import android.util.Property;
import android.view.View;
import android.view.ViewGroup;
import androidx.core.view.j1;
import org.xmlpull.v1.XmlPullParser;

/* JADX INFO: loaded from: classes6.dex */
public class ChangeTransform extends Transition {

    /* JADX INFO: renamed from: b0, reason: collision with root package name */
    private static final String f27665b0 = "android:changeTransform:parent";

    /* JADX INFO: renamed from: p1, reason: collision with root package name */
    private static final String f27667p1 = "android:changeTransform:intermediateParentMatrix";

    /* JADX INFO: renamed from: x1, reason: collision with root package name */
    private static final String f27669x1 = "android:changeTransform:intermediateMatrix";
    boolean W;
    private boolean X;
    private Matrix Y;
    private static final String Z = "android:changeTransform:matrix";

    /* JADX INFO: renamed from: a0, reason: collision with root package name */
    private static final String f27664a0 = "android:changeTransform:transforms";

    /* JADX INFO: renamed from: c0, reason: collision with root package name */
    private static final String f27666c0 = "android:changeTransform:parentMatrix";

    /* JADX INFO: renamed from: y1, reason: collision with root package name */
    private static final String[] f27671y1 = {Z, f27664a0, f27666c0};

    /* JADX INFO: renamed from: p2, reason: collision with root package name */
    private static final Property<e, float[]> f27668p2 = new a(float[].class, "nonTranslations");

    /* JADX INFO: renamed from: x2, reason: collision with root package name */
    private static final Property<e, PointF> f27670x2 = new b(PointF.class, "translations");

    /* JADX INFO: renamed from: y2, reason: collision with root package name */
    private static final boolean f27672y2 = true;

    public class a extends Property<e, float[]> {
        a(Class cls, String str) {
            super(cls, str);
        }

        @Override // android.util.Property
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public float[] get(e eVar) {
            return null;
        }

        @Override // android.util.Property
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public void set(e eVar, float[] fArr) {
            eVar.d(fArr);
        }
    }

    public class b extends Property<e, PointF> {
        b(Class cls, String str) {
            super(cls, str);
        }

        @Override // android.util.Property
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public PointF get(e eVar) {
            return null;
        }

        @Override // android.util.Property
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public void set(e eVar, PointF pointF) {
            eVar.c(pointF);
        }
    }

    public class c extends AnimatorListenerAdapter {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private boolean f27673b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private Matrix f27674c = new Matrix();

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        final /* synthetic */ boolean f27675d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        final /* synthetic */ Matrix f27676e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        final /* synthetic */ View f27677f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        final /* synthetic */ f f27678g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        final /* synthetic */ e f27679h;

        c(boolean z10, Matrix matrix, View view, f fVar, e eVar) {
            this.f27675d = z10;
            this.f27676e = matrix;
            this.f27677f = view;
            this.f27678g = fVar;
            this.f27679h = eVar;
        }

        private void a(Matrix matrix) {
            this.f27674c.set(matrix);
            this.f27677f.setTag(R.id.transition_transform, this.f27674c);
            this.f27678g.a(this.f27677f);
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationCancel(Animator animator) {
            this.f27673b = true;
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationEnd(Animator animator) {
            if (!this.f27673b) {
                if (this.f27675d && ChangeTransform.this.W) {
                    a(this.f27676e);
                } else {
                    this.f27677f.setTag(R.id.transition_transform, null);
                    this.f27677f.setTag(R.id.parent_matrix, null);
                }
            }
            l0.f(this.f27677f, null);
            this.f27678g.a(this.f27677f);
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorPauseListener
        public void onAnimationPause(Animator animator) {
            a(this.f27679h.a());
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorPauseListener
        public void onAnimationResume(Animator animator) {
            ChangeTransform.O0(this.f27677f);
        }
    }

    public static class d extends u {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private View f27681b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private androidx.transition.f f27682c;

        d(View view, androidx.transition.f fVar) {
            this.f27681b = view;
            this.f27682c = fVar;
        }

        @Override // androidx.transition.u, androidx.transition.Transition.h
        public void a(@androidx.annotation.n0 Transition transition) {
            this.f27682c.setVisibility(0);
        }

        @Override // androidx.transition.u, androidx.transition.Transition.h
        public void c(@androidx.annotation.n0 Transition transition) {
            this.f27682c.setVisibility(4);
        }

        @Override // androidx.transition.u, androidx.transition.Transition.h
        public void d(@androidx.annotation.n0 Transition transition) {
            transition.n0(this);
            h.b(this.f27681b);
            this.f27681b.setTag(R.id.transition_transform, null);
            this.f27681b.setTag(R.id.parent_matrix, null);
        }
    }

    public static class e {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final Matrix f27683a = new Matrix();

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final View f27684b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private final float[] f27685c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private float f27686d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        private float f27687e;

        e(View view, float[] fArr) {
            this.f27684b = view;
            float[] fArr2 = (float[]) fArr.clone();
            this.f27685c = fArr2;
            this.f27686d = fArr2[2];
            this.f27687e = fArr2[5];
            b();
        }

        private void b() {
            float[] fArr = this.f27685c;
            fArr[2] = this.f27686d;
            fArr[5] = this.f27687e;
            this.f27683a.setValues(fArr);
            l0.f(this.f27684b, this.f27683a);
        }

        Matrix a() {
            return this.f27683a;
        }

        void c(PointF pointF) {
            this.f27686d = pointF.x;
            this.f27687e = pointF.y;
            b();
        }

        void d(float[] fArr) {
            System.arraycopy(fArr, 0, this.f27685c, 0, fArr.length);
            b();
        }
    }

    public static class f {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final float f27688a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final float f27689b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final float f27690c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        final float f27691d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        final float f27692e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        final float f27693f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        final float f27694g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        final float f27695h;

        f(View view) {
            this.f27688a = view.getTranslationX();
            this.f27689b = view.getTranslationY();
            this.f27690c = j1.A0(view);
            this.f27691d = view.getScaleX();
            this.f27692e = view.getScaleY();
            this.f27693f = view.getRotationX();
            this.f27694g = view.getRotationY();
            this.f27695h = view.getRotation();
        }

        public void a(View view) {
            ChangeTransform.S0(view, this.f27688a, this.f27689b, this.f27690c, this.f27691d, this.f27692e, this.f27693f, this.f27694g, this.f27695h);
        }

        public boolean equals(Object obj) {
            if (!(obj instanceof f)) {
                return false;
            }
            f fVar = (f) obj;
            return fVar.f27688a == this.f27688a && fVar.f27689b == this.f27689b && fVar.f27690c == this.f27690c && fVar.f27691d == this.f27691d && fVar.f27692e == this.f27692e && fVar.f27693f == this.f27693f && fVar.f27694g == this.f27694g && fVar.f27695h == this.f27695h;
        }

        public int hashCode() {
            float f10 = this.f27688a;
            int iFloatToIntBits = (f10 != 0.0f ? Float.floatToIntBits(f10) : 0) * 31;
            float f11 = this.f27689b;
            int iFloatToIntBits2 = (iFloatToIntBits + (f11 != 0.0f ? Float.floatToIntBits(f11) : 0)) * 31;
            float f12 = this.f27690c;
            int iFloatToIntBits3 = (iFloatToIntBits2 + (f12 != 0.0f ? Float.floatToIntBits(f12) : 0)) * 31;
            float f13 = this.f27691d;
            int iFloatToIntBits4 = (iFloatToIntBits3 + (f13 != 0.0f ? Float.floatToIntBits(f13) : 0)) * 31;
            float f14 = this.f27692e;
            int iFloatToIntBits5 = (iFloatToIntBits4 + (f14 != 0.0f ? Float.floatToIntBits(f14) : 0)) * 31;
            float f15 = this.f27693f;
            int iFloatToIntBits6 = (iFloatToIntBits5 + (f15 != 0.0f ? Float.floatToIntBits(f15) : 0)) * 31;
            float f16 = this.f27694g;
            int iFloatToIntBits7 = (iFloatToIntBits6 + (f16 != 0.0f ? Float.floatToIntBits(f16) : 0)) * 31;
            float f17 = this.f27695h;
            return iFloatToIntBits7 + (f17 != 0.0f ? Float.floatToIntBits(f17) : 0);
        }
    }

    public ChangeTransform() {
        this.W = true;
        this.X = true;
        this.Y = new Matrix();
    }

    @SuppressLint({"RestrictedApi"})
    public ChangeTransform(@androidx.annotation.n0 Context context, @androidx.annotation.n0 AttributeSet attributeSet) {
        super(context, attributeSet);
        this.W = true;
        this.X = true;
        this.Y = new Matrix();
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, s.f27912g);
        XmlPullParser xmlPullParser = (XmlPullParser) attributeSet;
        this.W = androidx.core.content.res.q.e(typedArrayObtainStyledAttributes, xmlPullParser, "reparentWithOverlay", 1, true);
        this.X = androidx.core.content.res.q.e(typedArrayObtainStyledAttributes, xmlPullParser, "reparent", 0, true);
        typedArrayObtainStyledAttributes.recycle();
    }

    private void I0(z zVar) {
        View view = zVar.f27974b;
        if (view.getVisibility() == 8) {
            return;
        }
        zVar.f27973a.put(f27665b0, view.getParent());
        zVar.f27973a.put(f27664a0, new f(view));
        Matrix matrix = view.getMatrix();
        zVar.f27973a.put(Z, (matrix == null || matrix.isIdentity()) ? null : new Matrix(matrix));
        if (this.X) {
            Matrix matrix2 = new Matrix();
            ViewGroup viewGroup = (ViewGroup) view.getParent();
            l0.j(viewGroup, matrix2);
            matrix2.preTranslate(-viewGroup.getScrollX(), -viewGroup.getScrollY());
            zVar.f27973a.put(f27666c0, matrix2);
            zVar.f27973a.put(f27669x1, view.getTag(R.id.transition_transform));
            zVar.f27973a.put(f27667p1, view.getTag(R.id.parent_matrix));
        }
    }

    private void J0(ViewGroup viewGroup, z zVar, z zVar2) {
        View view = zVar2.f27974b;
        Matrix matrix = new Matrix((Matrix) zVar2.f27973a.get(f27666c0));
        l0.k(viewGroup, matrix);
        androidx.transition.f fVarA = h.a(view, viewGroup, matrix);
        if (fVarA == null) {
            return;
        }
        fVarA.a((ViewGroup) zVar.f27973a.get(f27665b0), zVar.f27974b);
        Transition transition = this;
        while (true) {
            TransitionSet transitionSet = transition.f27770s;
            if (transitionSet == null) {
                break;
            } else {
                transition = transitionSet;
            }
        }
        transition.a(new d(view, fVarA));
        if (f27672y2) {
            View view2 = zVar.f27974b;
            if (view2 != zVar2.f27974b) {
                l0.h(view2, 0.0f);
            }
            l0.h(view, 1.0f);
        }
    }

    private ObjectAnimator K0(z zVar, z zVar2, boolean z10) {
        Matrix matrix = (Matrix) zVar.f27973a.get(Z);
        Matrix matrix2 = (Matrix) zVar2.f27973a.get(Z);
        if (matrix == null) {
            matrix = k.f27882a;
        }
        if (matrix2 == null) {
            matrix2 = k.f27882a;
        }
        Matrix matrix3 = matrix2;
        if (matrix.equals(matrix3)) {
            return null;
        }
        f fVar = (f) zVar2.f27973a.get(f27664a0);
        View view = zVar2.f27974b;
        O0(view);
        float[] fArr = new float[9];
        matrix.getValues(fArr);
        float[] fArr2 = new float[9];
        matrix3.getValues(fArr2);
        e eVar = new e(view, fArr);
        ObjectAnimator objectAnimatorOfPropertyValuesHolder = ObjectAnimator.ofPropertyValuesHolder(eVar, PropertyValuesHolder.ofObject(f27668p2, new androidx.transition.d(new float[9]), fArr, fArr2), n.a(f27670x2, P().a(fArr[2], fArr[5], fArr2[2], fArr2[5])));
        c cVar = new c(z10, matrix3, view, fVar, eVar);
        objectAnimatorOfPropertyValuesHolder.addListener(cVar);
        androidx.transition.a.a(objectAnimatorOfPropertyValuesHolder, cVar);
        return objectAnimatorOfPropertyValuesHolder;
    }

    /* JADX WARN: Code duplicated, block: B:14:0x001d  */
    private boolean N0(ViewGroup viewGroup, ViewGroup viewGroup2) {
        boolean z10 = true;
        if (d0(viewGroup) && d0(viewGroup2)) {
            z zVarM = M(viewGroup, true);
            if (zVarM == null) {
                return false;
            }
            if (viewGroup2 != zVarM.f27974b) {
                z10 = false;
            }
        } else if (viewGroup != viewGroup2) {
            z10 = false;
        }
        return z10;
    }

    static void O0(View view) {
        S0(view, 0.0f, 0.0f, 0.0f, 1.0f, 1.0f, 0.0f, 0.0f, 0.0f);
    }

    private void P0(z zVar, z zVar2) {
        Matrix matrix = (Matrix) zVar2.f27973a.get(f27666c0);
        zVar2.f27974b.setTag(R.id.parent_matrix, matrix);
        Matrix matrix2 = this.Y;
        matrix2.reset();
        matrix.invert(matrix2);
        Matrix matrix3 = (Matrix) zVar.f27973a.get(Z);
        if (matrix3 == null) {
            matrix3 = new Matrix();
            zVar.f27973a.put(Z, matrix3);
        }
        matrix3.postConcat((Matrix) zVar.f27973a.get(f27666c0));
        matrix3.postConcat(matrix2);
    }

    static void S0(View view, float f10, float f11, float f12, float f13, float f14, float f15, float f16, float f17) {
        view.setTranslationX(f10);
        view.setTranslationY(f11);
        j1.w2(view, f12);
        view.setScaleX(f13);
        view.setScaleY(f14);
        view.setRotationX(f15);
        view.setRotationY(f16);
        view.setRotation(f17);
    }

    public boolean L0() {
        return this.X;
    }

    public boolean M0() {
        return this.W;
    }

    public void Q0(boolean z10) {
        this.X = z10;
    }

    public void R0(boolean z10) {
        this.W = z10;
    }

    @Override // androidx.transition.Transition
    @androidx.annotation.n0
    public String[] Y() {
        return f27671y1;
    }

    @Override // androidx.transition.Transition
    public void j(@androidx.annotation.n0 z zVar) {
        I0(zVar);
    }

    @Override // androidx.transition.Transition
    public void m(@androidx.annotation.n0 z zVar) {
        I0(zVar);
        if (f27672y2) {
            return;
        }
        ((ViewGroup) zVar.f27974b.getParent()).startViewTransition(zVar.f27974b);
    }

    @Override // androidx.transition.Transition
    @androidx.annotation.p0
    public Animator q(@androidx.annotation.n0 ViewGroup viewGroup, @androidx.annotation.p0 z zVar, @androidx.annotation.p0 z zVar2) {
        if (zVar == null || zVar2 == null || !zVar.f27973a.containsKey(f27665b0) || !zVar2.f27973a.containsKey(f27665b0)) {
            return null;
        }
        ViewGroup viewGroup2 = (ViewGroup) zVar.f27973a.get(f27665b0);
        boolean z10 = this.X && !N0(viewGroup2, (ViewGroup) zVar2.f27973a.get(f27665b0));
        Matrix matrix = (Matrix) zVar.f27973a.get(f27669x1);
        if (matrix != null) {
            zVar.f27973a.put(Z, matrix);
        }
        Matrix matrix2 = (Matrix) zVar.f27973a.get(f27667p1);
        if (matrix2 != null) {
            zVar.f27973a.put(f27666c0, matrix2);
        }
        if (z10) {
            P0(zVar, zVar2);
        }
        ObjectAnimator objectAnimatorK0 = K0(zVar, zVar2, z10);
        if (z10 && objectAnimatorK0 != null && this.W) {
            J0(viewGroup, zVar, zVar2);
        } else if (!f27672y2) {
            viewGroup2.endViewTransition(zVar.f27974b);
        }
        return objectAnimatorK0;
    }
}
