package com.google.android.material.transition;

import android.animation.TimeInterpolator;
import android.content.Context;
import android.graphics.Canvas;
import android.graphics.LinearGradient;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.Shader;
import android.util.TypedValue;
import android.view.View;
import androidx.annotation.d0;
import androidx.annotation.n0;
import androidx.annotation.p0;
import androidx.annotation.x;
import androidx.core.graphics.m0;
import androidx.transition.PathMotion;
import androidx.transition.PatternPathMotion;
import androidx.transition.Transition;
import androidx.transition.TransitionSet;

/* JADX INFO: compiled from: TransitionUtils.java */
/* JADX INFO: loaded from: classes7.dex */
public class v {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    static final int f56180a = -1;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @androidx.annotation.f
    static final int f56181b = 0;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static final int f56182c = 0;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private static final int f56183d = 1;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private static final RectF f56184e = new RectF();

    /* JADX INFO: compiled from: TransitionUtils.java */
    public class a implements b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ RectF f56185a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ RectF f56186b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ float f56187c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        final /* synthetic */ float f56188d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        final /* synthetic */ float f56189e;

        a(RectF rectF, RectF rectF2, float f10, float f11, float f12) {
            this.f56185a = rectF;
            this.f56186b = rectF2;
            this.f56187c = f10;
            this.f56188d = f11;
            this.f56189e = f12;
        }

        @Override // com.google.android.material.transition.v.b
        @n0
        public com.google.android.material.shape.e a(@n0 com.google.android.material.shape.e eVar, @n0 com.google.android.material.shape.e eVar2) {
            return new com.google.android.material.shape.a(v.n(eVar.a(this.f56185a), eVar2.a(this.f56186b), this.f56187c, this.f56188d, this.f56189e));
        }
    }

    /* JADX INFO: compiled from: TransitionUtils.java */
    public interface b {
        @n0
        com.google.android.material.shape.e a(@n0 com.google.android.material.shape.e eVar, @n0 com.google.android.material.shape.e eVar2);
    }

    private v() {
    }

    static float b(@n0 RectF rectF) {
        return rectF.width() * rectF.height();
    }

    static com.google.android.material.shape.p c(com.google.android.material.shape.p pVar, final RectF rectF) {
        return pVar.y(new com.google.android.material.shape.p.c() { // from class: com.google.android.material.transition.u
            @Override // com.google.android.material.shape.p.c
            public final com.google.android.material.shape.e a(com.google.android.material.shape.e eVar) {
                return com.google.android.material.shape.n.b(rectF, eVar);
            }
        });
    }

    static Shader d(@androidx.annotation.l int i10) {
        return new LinearGradient(0.0f, 0.0f, 0.0f, 0.0f, i10, i10, Shader.TileMode.CLAMP);
    }

    @n0
    static <T> T e(@p0 T t10, @n0 T t11) {
        return t10 != null ? t10 : t11;
    }

    static View f(View view, @d0 int i10) {
        String resourceName = view.getResources().getResourceName(i10);
        while (view != null) {
            if (view.getId() != i10) {
                Object parent = view.getParent();
                if (!(parent instanceof View)) {
                    break;
                }
                view = (View) parent;
            } else {
                return view;
            }
        }
        throw new IllegalArgumentException(resourceName + " is not a valid ancestor");
    }

    static View g(View view, @d0 int i10) {
        View viewFindViewById = view.findViewById(i10);
        return viewFindViewById != null ? viewFindViewById : f(view, i10);
    }

    static RectF h(View view) {
        int[] iArr = new int[2];
        view.getLocationOnScreen(iArr);
        int i10 = iArr[0];
        int i11 = iArr[1];
        return new RectF(i10, i11, view.getWidth() + i10, view.getHeight() + i11);
    }

    static RectF i(View view) {
        return new RectF(view.getLeft(), view.getTop(), view.getRight(), view.getBottom());
    }

    static Rect j(View view) {
        return new Rect(view.getLeft(), view.getTop(), view.getRight(), view.getBottom());
    }

    private static boolean k(com.google.android.material.shape.p pVar, RectF rectF) {
        return (pVar.r().a(rectF) == 0.0f && pVar.t().a(rectF) == 0.0f && pVar.l().a(rectF) == 0.0f && pVar.j().a(rectF) == 0.0f) ? false : true;
    }

    static float m(float f10, float f11, float f12) {
        return f10 + (f12 * (f11 - f10));
    }

    static float n(float f10, float f11, @x(from = 0.0d, to = com.google.android.material.color.utilities.d.f53848a) float f12, @x(from = 0.0d, to = com.google.android.material.color.utilities.d.f53848a) float f13, @x(from = 0.0d, to = com.google.android.material.color.utilities.d.f53848a) float f14) {
        return o(f10, f11, f12, f13, f14, false);
    }

    static float o(float f10, float f11, @x(from = 0.0d, to = com.google.android.material.color.utilities.d.f53848a) float f12, @x(from = 0.0d, to = com.google.android.material.color.utilities.d.f53848a) float f13, @x(from = 0.0d) float f14, boolean z10) {
        if (z10 && (f14 < 0.0f || f14 > 1.0f)) {
            return m(f10, f11, f14);
        }
        if (f14 < f12) {
            return f10;
        }
        return f14 > f13 ? f11 : m(f10, f11, (f14 - f12) / (f13 - f12));
    }

    static int p(int i10, int i11, @x(from = 0.0d, to = com.google.android.material.color.utilities.d.f53848a) float f10, @x(from = 0.0d, to = com.google.android.material.color.utilities.d.f53848a) float f11, @x(from = 0.0d, to = com.google.android.material.color.utilities.d.f53848a) float f12) {
        if (f12 < f10) {
            return i10;
        }
        return f12 > f11 ? i11 : (int) m(i10, i11, (f12 - f10) / (f11 - f10));
    }

    static com.google.android.material.shape.p q(com.google.android.material.shape.p pVar, com.google.android.material.shape.p pVar2, RectF rectF, RectF rectF2, @x(from = 0.0d, to = com.google.android.material.color.utilities.d.f53848a) float f10, @x(from = 0.0d, to = com.google.android.material.color.utilities.d.f53848a) float f11, @x(from = 0.0d, to = com.google.android.material.color.utilities.d.f53848a) float f12) {
        if (f12 < f10) {
            return pVar;
        }
        return f12 > f11 ? pVar2 : z(pVar, pVar2, rectF, new a(rectF, rectF2, f10, f11, f12));
    }

    static void r(TransitionSet transitionSet, @p0 Transition transition) {
        if (transition != null) {
            transitionSet.N0(transition);
        }
    }

    static boolean s(Transition transition, Context context, @androidx.annotation.f int i10) {
        int iF;
        if (i10 == 0 || transition.G() != -1 || (iF = i9.a.f(context, i10, -1)) == -1) {
            return false;
        }
        transition.w0(iF);
        return true;
    }

    static boolean t(Transition transition, Context context, @androidx.annotation.f int i10, TimeInterpolator timeInterpolator) {
        if (i10 == 0 || transition.K() != null) {
            return false;
        }
        transition.y0(i9.a.g(context, i10, timeInterpolator));
        return true;
    }

    static boolean u(Transition transition, Context context, @androidx.annotation.f int i10) {
        PathMotion pathMotionW;
        if (i10 == 0 || (pathMotionW = w(context, i10)) == null) {
            return false;
        }
        transition.A0(pathMotionW);
        return true;
    }

    static void v(TransitionSet transitionSet, @p0 Transition transition) {
        if (transition != null) {
            transitionSet.X0(transition);
        }
    }

    @p0
    static PathMotion w(Context context, @androidx.annotation.f int i10) {
        TypedValue typedValue = new TypedValue();
        if (!context.getTheme().resolveAttribute(i10, typedValue, true)) {
            return null;
        }
        int i11 = typedValue.type;
        if (i11 != 16) {
            if (i11 == 3) {
                return new PatternPathMotion(m0.e(String.valueOf(typedValue.string)));
            }
            throw new IllegalArgumentException("Motion path theme attribute must either be an enum value or path data string");
        }
        int i12 = typedValue.data;
        if (i12 == 0) {
            return null;
        }
        if (i12 == 1) {
            return new k();
        }
        throw new IllegalArgumentException("Invalid motion path type: " + i12);
    }

    private static int x(Canvas canvas, Rect rect, int i10) {
        RectF rectF = f56184e;
        rectF.set(rect);
        return canvas.saveLayerAlpha(rectF, i10);
    }

    static void y(Canvas canvas, Rect rect, float f10, float f11, float f12, int i10, c9.a.InterfaceC0267a interfaceC0267a) {
        if (i10 <= 0) {
            return;
        }
        int iSave = canvas.save();
        canvas.translate(f10, f11);
        canvas.scale(f12, f12);
        if (i10 < 255) {
            x(canvas, rect, i10);
        }
        interfaceC0267a.a(canvas);
        canvas.restoreToCount(iSave);
    }

    static com.google.android.material.shape.p z(com.google.android.material.shape.p pVar, com.google.android.material.shape.p pVar2, RectF rectF, b bVar) {
        return (k(pVar, rectF) ? pVar : pVar2).v().L(bVar.a(pVar.r(), pVar2.r())).Q(bVar.a(pVar.t(), pVar2.t())).y(bVar.a(pVar.j(), pVar2.j())).D(bVar.a(pVar.l(), pVar2.l())).m();
    }
}
