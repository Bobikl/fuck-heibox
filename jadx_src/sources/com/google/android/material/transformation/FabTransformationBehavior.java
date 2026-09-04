package com.google.android.material.transformation;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.animation.ValueAnimator;
import android.annotation.TargetApi;
import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.util.Pair;
import android.util.Property;
import android.view.View;
import android.view.ViewAnimationUtils;
import android.view.ViewGroup;
import android.widget.ImageView;
import androidx.annotation.n0;
import androidx.annotation.p0;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import androidx.core.view.j1;
import com.google.android.material.R;
import com.google.android.material.animation.f;
import com.google.android.material.animation.i;
import com.google.android.material.animation.j;
import com.google.android.material.animation.k;
import com.google.android.material.floatingactionbutton.FloatingActionButton;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes7.dex */
@Deprecated
public abstract class FabTransformationBehavior extends ExpandableTransformationBehavior {

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private final Rect f55856k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private final RectF f55857l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private final RectF f55858m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private final int[] f55859n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    private float f55860o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    private float f55861p;

    public class a extends AnimatorListenerAdapter {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ boolean f55862b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ View f55863c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        final /* synthetic */ View f55864d;

        a(boolean z10, View view, View view2) {
            this.f55862b = z10;
            this.f55863c = view;
            this.f55864d = view2;
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationEnd(Animator animator) {
            if (this.f55862b) {
                return;
            }
            this.f55863c.setVisibility(4);
            this.f55864d.setAlpha(1.0f);
            this.f55864d.setVisibility(0);
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationStart(Animator animator) {
            if (this.f55862b) {
                this.f55863c.setVisibility(0);
                this.f55864d.setAlpha(0.0f);
                this.f55864d.setVisibility(4);
            }
        }
    }

    public class b implements ValueAnimator.AnimatorUpdateListener {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ View f55866b;

        b(View view) {
            this.f55866b = view;
        }

        @Override // android.animation.ValueAnimator.AnimatorUpdateListener
        public void onAnimationUpdate(ValueAnimator valueAnimator) {
            this.f55866b.invalidate();
        }
    }

    public class c extends AnimatorListenerAdapter {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ com.google.android.material.circularreveal.c f55868b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ Drawable f55869c;

        c(com.google.android.material.circularreveal.c cVar, Drawable drawable) {
            this.f55868b = cVar;
            this.f55869c = drawable;
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationEnd(Animator animator) {
            this.f55868b.setCircularRevealOverlayDrawable(null);
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationStart(Animator animator) {
            this.f55868b.setCircularRevealOverlayDrawable(this.f55869c);
        }
    }

    public class d extends AnimatorListenerAdapter {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ com.google.android.material.circularreveal.c f55871b;

        d(com.google.android.material.circularreveal.c cVar) {
            this.f55871b = cVar;
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationEnd(Animator animator) {
            com.google.android.material.circularreveal.c.e revealInfo = this.f55871b.getRevealInfo();
            revealInfo.f53642c = Float.MAX_VALUE;
            this.f55871b.setRevealInfo(revealInfo);
        }
    }

    public static class e {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        @p0
        public i f55873a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public k f55874b;

        protected e() {
        }
    }

    public FabTransformationBehavior() {
        this.f55856k = new Rect();
        this.f55857l = new RectF();
        this.f55858m = new RectF();
        this.f55859n = new int[2];
    }

    public FabTransformationBehavior(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f55856k = new Rect();
        this.f55857l = new RectF();
        this.f55858m = new RectF();
        this.f55859n = new int[2];
    }

    @p0
    private ViewGroup Q(@n0 View view) {
        View viewFindViewById = view.findViewById(R.id.mtrl_child_content_container);
        if (viewFindViewById != null) {
            return l0(viewFindViewById);
        }
        return ((view instanceof TransformationChildLayout) || (view instanceof TransformationChildCard)) ? l0(((ViewGroup) view).getChildAt(0)) : l0(view);
    }

    private void R(@n0 View view, @n0 e eVar, @n0 j jVar, @n0 j jVar2, float f10, float f11, float f12, float f13, @n0 RectF rectF) {
        float fY = Y(eVar, jVar, f10, f12);
        float fY2 = Y(eVar, jVar2, f11, f13);
        Rect rect = this.f55856k;
        view.getWindowVisibleDisplayFrame(rect);
        RectF rectF2 = this.f55857l;
        rectF2.set(rect);
        RectF rectF3 = this.f55858m;
        Z(view, rectF3);
        rectF3.offset(fY, fY2);
        rectF3.intersect(rectF2);
        rectF.set(rectF3);
    }

    private void S(@n0 View view, @n0 RectF rectF) {
        Z(view, rectF);
        rectF.offset(this.f55860o, this.f55861p);
    }

    @n0
    private Pair<j, j> T(float f10, float f11, boolean z10, @n0 e eVar) {
        j jVarH;
        j jVarH2;
        if (f10 == 0.0f || f11 == 0.0f) {
            jVarH = eVar.f55873a.h("translationXLinear");
            jVarH2 = eVar.f55873a.h("translationYLinear");
        } else if ((!z10 || f11 >= 0.0f) && (z10 || f11 <= 0.0f)) {
            jVarH = eVar.f55873a.h("translationXCurveDownwards");
            jVarH2 = eVar.f55873a.h("translationYCurveDownwards");
        } else {
            jVarH = eVar.f55873a.h("translationXCurveUpwards");
            jVarH2 = eVar.f55873a.h("translationYCurveUpwards");
        }
        return new Pair<>(jVarH, jVarH2);
    }

    private float U(@n0 View view, @n0 View view2, @n0 k kVar) {
        RectF rectF = this.f55857l;
        RectF rectF2 = this.f55858m;
        S(view, rectF);
        Z(view2, rectF2);
        rectF2.offset(-W(view, view2, kVar), 0.0f);
        return rectF.centerX() - rectF2.left;
    }

    private float V(@n0 View view, @n0 View view2, @n0 k kVar) {
        RectF rectF = this.f55857l;
        RectF rectF2 = this.f55858m;
        S(view, rectF);
        Z(view2, rectF2);
        rectF2.offset(0.0f, -X(view, view2, kVar));
        return rectF.centerY() - rectF2.top;
    }

    private float W(@n0 View view, @n0 View view2, @n0 k kVar) {
        float fCenterX;
        float fCenterX2;
        float f10;
        RectF rectF = this.f55857l;
        RectF rectF2 = this.f55858m;
        S(view, rectF);
        Z(view2, rectF2);
        int i10 = kVar.f52917a & 7;
        if (i10 == 1) {
            fCenterX = rectF2.centerX();
            fCenterX2 = rectF.centerX();
        } else {
            if (i10 != 3) {
                if (i10 != 5) {
                    f10 = 0.0f;
                } else {
                    fCenterX = rectF2.right;
                    fCenterX2 = rectF.right;
                }
                return f10 + kVar.f52918b;
            }
            fCenterX = rectF2.left;
            fCenterX2 = rectF.left;
        }
        f10 = fCenterX - fCenterX2;
        return f10 + kVar.f52918b;
    }

    private float X(@n0 View view, @n0 View view2, @n0 k kVar) {
        float fCenterY;
        float fCenterY2;
        float f10;
        RectF rectF = this.f55857l;
        RectF rectF2 = this.f55858m;
        S(view, rectF);
        Z(view2, rectF2);
        int i10 = kVar.f52917a & 112;
        if (i10 == 16) {
            fCenterY = rectF2.centerY();
            fCenterY2 = rectF.centerY();
        } else {
            if (i10 != 48) {
                if (i10 != 80) {
                    f10 = 0.0f;
                } else {
                    fCenterY = rectF2.bottom;
                    fCenterY2 = rectF.bottom;
                }
                return f10 + kVar.f52919c;
            }
            fCenterY = rectF2.top;
            fCenterY2 = rectF.top;
        }
        f10 = fCenterY - fCenterY2;
        return f10 + kVar.f52919c;
    }

    private float Y(@n0 e eVar, @n0 j jVar, float f10, float f11) {
        long jC = jVar.c();
        long jD = jVar.d();
        j jVarH = eVar.f55873a.h("expansion");
        return com.google.android.material.animation.b.a(f10, f11, jVar.e().getInterpolation((((jVarH.c() + jVarH.d()) + 17) - jC) / jD));
    }

    private void Z(@n0 View view, RectF rectF) {
        rectF.set(0.0f, 0.0f, view.getWidth(), view.getHeight());
        int[] iArr = this.f55859n;
        view.getLocationInWindow(iArr);
        rectF.offsetTo(iArr[0], iArr[1]);
        rectF.offset((int) (-view.getTranslationX()), (int) (-view.getTranslationY()));
    }

    private void a0(View view, View view2, boolean z10, boolean z11, @n0 e eVar, @n0 List<Animator> list, List<Animator.AnimatorListener> list2) {
        ViewGroup viewGroupQ;
        ObjectAnimator objectAnimatorOfFloat;
        if (view2 instanceof ViewGroup) {
            if (((view2 instanceof com.google.android.material.circularreveal.c) && com.google.android.material.circularreveal.b.f53624o == 0) || (viewGroupQ = Q(view2)) == null) {
                return;
            }
            if (z10) {
                if (!z11) {
                    com.google.android.material.animation.e.f52902a.set(viewGroupQ, Float.valueOf(0.0f));
                }
                objectAnimatorOfFloat = ObjectAnimator.ofFloat(viewGroupQ, com.google.android.material.animation.e.f52902a, 1.0f);
            } else {
                objectAnimatorOfFloat = ObjectAnimator.ofFloat(viewGroupQ, com.google.android.material.animation.e.f52902a, 0.0f);
            }
            eVar.f55873a.h("contentFade").a(objectAnimatorOfFloat);
            list.add(objectAnimatorOfFloat);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    private void b0(@n0 View view, View view2, boolean z10, boolean z11, @n0 e eVar, @n0 List<Animator> list, List<Animator.AnimatorListener> list2) {
        ObjectAnimator objectAnimatorOfInt;
        if (view2 instanceof com.google.android.material.circularreveal.c) {
            com.google.android.material.circularreveal.c cVar = (com.google.android.material.circularreveal.c) view2;
            int iJ0 = j0(view);
            int i10 = 16777215 & iJ0;
            if (z10) {
                if (!z11) {
                    cVar.setCircularRevealScrimColor(iJ0);
                }
                objectAnimatorOfInt = ObjectAnimator.ofInt(cVar, com.google.android.material.circularreveal.c.d.f53638a, i10);
            } else {
                objectAnimatorOfInt = ObjectAnimator.ofInt(cVar, com.google.android.material.circularreveal.c.d.f53638a, iJ0);
            }
            objectAnimatorOfInt.setEvaluator(com.google.android.material.animation.d.b());
            eVar.f55873a.h("color").a(objectAnimatorOfInt);
            list.add(objectAnimatorOfInt);
        }
    }

    private void c0(@n0 View view, @n0 View view2, boolean z10, @n0 e eVar, @n0 List<Animator> list) {
        float fW = W(view, view2, eVar.f55874b);
        float fX = X(view, view2, eVar.f55874b);
        Pair<j, j> pairT = T(fW, fX, z10, eVar);
        j jVar = (j) pairT.first;
        j jVar2 = (j) pairT.second;
        Property property = View.TRANSLATION_X;
        float[] fArr = new float[1];
        if (!z10) {
            fW = this.f55860o;
        }
        fArr[0] = fW;
        ObjectAnimator objectAnimatorOfFloat = ObjectAnimator.ofFloat(view, (Property<View, Float>) property, fArr);
        Property property2 = View.TRANSLATION_Y;
        float[] fArr2 = new float[1];
        if (!z10) {
            fX = this.f55861p;
        }
        fArr2[0] = fX;
        ObjectAnimator objectAnimatorOfFloat2 = ObjectAnimator.ofFloat(view, (Property<View, Float>) property2, fArr2);
        jVar.a(objectAnimatorOfFloat);
        jVar2.a(objectAnimatorOfFloat2);
        list.add(objectAnimatorOfFloat);
        list.add(objectAnimatorOfFloat2);
    }

    @TargetApi(21)
    private void d0(View view, @n0 View view2, boolean z10, boolean z11, @n0 e eVar, @n0 List<Animator> list, List<Animator.AnimatorListener> list2) {
        ObjectAnimator objectAnimatorOfFloat;
        float fR = j1.R(view2) - j1.R(view);
        if (z10) {
            if (!z11) {
                view2.setTranslationZ(-fR);
            }
            objectAnimatorOfFloat = ObjectAnimator.ofFloat(view2, (Property<View, Float>) View.TRANSLATION_Z, 0.0f);
        } else {
            objectAnimatorOfFloat = ObjectAnimator.ofFloat(view2, (Property<View, Float>) View.TRANSLATION_Z, -fR);
        }
        eVar.f55873a.h("elevation").a(objectAnimatorOfFloat);
        list.add(objectAnimatorOfFloat);
    }

    /* JADX WARN: Multi-variable type inference failed */
    private void e0(@n0 View view, View view2, boolean z10, boolean z11, @n0 e eVar, float f10, float f11, @n0 List<Animator> list, @n0 List<Animator.AnimatorListener> list2) {
        Animator animatorA;
        if (view2 instanceof com.google.android.material.circularreveal.c) {
            com.google.android.material.circularreveal.c cVar = (com.google.android.material.circularreveal.c) view2;
            float fU = U(view, view2, eVar.f55874b);
            float fV = V(view, view2, eVar.f55874b);
            ((FloatingActionButton) view).k(this.f55856k);
            float fWidth = this.f55856k.width() / 2.0f;
            j jVarH = eVar.f55873a.h("expansion");
            if (z10) {
                if (!z11) {
                    cVar.setRevealInfo(new com.google.android.material.circularreveal.c.e(fU, fV, fWidth));
                }
                if (z11) {
                    fWidth = cVar.getRevealInfo().f53642c;
                }
                animatorA = com.google.android.material.circularreveal.a.a(cVar, fU, fV, h9.a.b(fU, fV, 0.0f, 0.0f, f10, f11));
                animatorA.addListener(new d(cVar));
                h0(view2, jVarH.c(), (int) fU, (int) fV, fWidth, list);
            } else {
                float f12 = cVar.getRevealInfo().f53642c;
                Animator animatorA2 = com.google.android.material.circularreveal.a.a(cVar, fU, fV, fWidth);
                int i10 = (int) fU;
                int i11 = (int) fV;
                h0(view2, jVarH.c(), i10, i11, f12, list);
                g0(view2, jVarH.c(), jVarH.d(), eVar.f55873a.i(), i10, i11, fWidth, list);
                animatorA = animatorA2;
            }
            jVarH.a(animatorA);
            list.add(animatorA);
            list2.add(com.google.android.material.circularreveal.a.c(cVar));
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    private void f0(View view, View view2, boolean z10, boolean z11, @n0 e eVar, @n0 List<Animator> list, @n0 List<Animator.AnimatorListener> list2) {
        ObjectAnimator objectAnimatorOfInt;
        if ((view2 instanceof com.google.android.material.circularreveal.c) && (view instanceof ImageView)) {
            com.google.android.material.circularreveal.c cVar = (com.google.android.material.circularreveal.c) view2;
            Drawable drawable = ((ImageView) view).getDrawable();
            if (drawable == null) {
                return;
            }
            drawable.mutate();
            if (z10) {
                if (!z11) {
                    drawable.setAlpha(255);
                }
                objectAnimatorOfInt = ObjectAnimator.ofInt(drawable, f.f52903b, 0);
            } else {
                objectAnimatorOfInt = ObjectAnimator.ofInt(drawable, f.f52903b, 255);
            }
            objectAnimatorOfInt.addUpdateListener(new b(view2));
            eVar.f55873a.h("iconFade").a(objectAnimatorOfInt);
            list.add(objectAnimatorOfInt);
            list2.add(new c(cVar, drawable));
        }
    }

    private void g0(View view, long j10, long j11, long j12, int i10, int i11, float f10, @n0 List<Animator> list) {
        long j13 = j10 + j11;
        if (j13 < j12) {
            Animator animatorCreateCircularReveal = ViewAnimationUtils.createCircularReveal(view, i10, i11, f10, f10);
            animatorCreateCircularReveal.setStartDelay(j13);
            animatorCreateCircularReveal.setDuration(j12 - j13);
            list.add(animatorCreateCircularReveal);
        }
    }

    private void h0(View view, long j10, int i10, int i11, float f10, @n0 List<Animator> list) {
        if (j10 > 0) {
            Animator animatorCreateCircularReveal = ViewAnimationUtils.createCircularReveal(view, i10, i11, f10, f10);
            animatorCreateCircularReveal.setStartDelay(0L);
            animatorCreateCircularReveal.setDuration(j10);
            list.add(animatorCreateCircularReveal);
        }
    }

    private void i0(@n0 View view, @n0 View view2, boolean z10, boolean z11, @n0 e eVar, @n0 List<Animator> list, List<Animator.AnimatorListener> list2, @n0 RectF rectF) {
        ObjectAnimator objectAnimatorOfFloat;
        ObjectAnimator objectAnimatorOfFloat2;
        float fW = W(view, view2, eVar.f55874b);
        float fX = X(view, view2, eVar.f55874b);
        Pair<j, j> pairT = T(fW, fX, z10, eVar);
        j jVar = (j) pairT.first;
        j jVar2 = (j) pairT.second;
        if (z10) {
            if (!z11) {
                view2.setTranslationX(-fW);
                view2.setTranslationY(-fX);
            }
            objectAnimatorOfFloat = ObjectAnimator.ofFloat(view2, (Property<View, Float>) View.TRANSLATION_X, 0.0f);
            objectAnimatorOfFloat2 = ObjectAnimator.ofFloat(view2, (Property<View, Float>) View.TRANSLATION_Y, 0.0f);
            R(view2, eVar, jVar, jVar2, -fW, -fX, 0.0f, 0.0f, rectF);
        } else {
            objectAnimatorOfFloat = ObjectAnimator.ofFloat(view2, (Property<View, Float>) View.TRANSLATION_X, -fW);
            objectAnimatorOfFloat2 = ObjectAnimator.ofFloat(view2, (Property<View, Float>) View.TRANSLATION_Y, -fX);
        }
        jVar.a(objectAnimatorOfFloat);
        jVar2.a(objectAnimatorOfFloat2);
        list.add(objectAnimatorOfFloat);
        list.add(objectAnimatorOfFloat2);
    }

    private int j0(@n0 View view) {
        ColorStateList colorStateListN = j1.N(view);
        if (colorStateListN != null) {
            return colorStateListN.getColorForState(view.getDrawableState(), colorStateListN.getDefaultColor());
        }
        return 0;
    }

    @p0
    private ViewGroup l0(View view) {
        if (view instanceof ViewGroup) {
            return (ViewGroup) view;
        }
        return null;
    }

    @Override // com.google.android.material.transformation.ExpandableTransformationBehavior
    @n0
    protected AnimatorSet P(@n0 View view, @n0 View view2, boolean z10, boolean z11) {
        e eVarK0 = k0(view2.getContext(), z10);
        if (z10) {
            this.f55860o = view.getTranslationX();
            this.f55861p = view.getTranslationY();
        }
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = new ArrayList();
        d0(view, view2, z10, z11, eVarK0, arrayList, arrayList2);
        RectF rectF = this.f55857l;
        i0(view, view2, z10, z11, eVarK0, arrayList, arrayList2, rectF);
        float fWidth = rectF.width();
        float fHeight = rectF.height();
        c0(view, view2, z10, eVarK0, arrayList);
        f0(view, view2, z10, z11, eVarK0, arrayList, arrayList2);
        e0(view, view2, z10, z11, eVarK0, fWidth, fHeight, arrayList, arrayList2);
        b0(view, view2, z10, z11, eVarK0, arrayList, arrayList2);
        a0(view, view2, z10, z11, eVarK0, arrayList, arrayList2);
        AnimatorSet animatorSet = new AnimatorSet();
        com.google.android.material.animation.c.a(animatorSet, arrayList);
        animatorSet.addListener(new a(z10, view2, view));
        int size = arrayList2.size();
        for (int i10 = 0; i10 < size; i10++) {
            animatorSet.addListener(arrayList2.get(i10));
        }
        return animatorSet;
    }

    @Override // com.google.android.material.transformation.ExpandableBehavior, androidx.coordinatorlayout.widget.CoordinatorLayout.Behavior
    @androidx.annotation.i
    public boolean i(@n0 CoordinatorLayout coordinatorLayout, @n0 View view, @n0 View view2) {
        if (view.getVisibility() == 8) {
            throw new IllegalStateException("This behavior cannot be attached to a GONE view. Set the view to INVISIBLE instead.");
        }
        if (!(view2 instanceof FloatingActionButton)) {
            return false;
        }
        int expandedComponentIdHint = ((FloatingActionButton) view2).getExpandedComponentIdHint();
        return expandedComponentIdHint == 0 || expandedComponentIdHint == view.getId();
    }

    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.Behavior
    @androidx.annotation.i
    public void k(@n0 CoordinatorLayout.f fVar) {
        if (fVar.f19808h == 0) {
            fVar.f19808h = 80;
        }
    }

    protected abstract e k0(Context context, boolean z10);
}
