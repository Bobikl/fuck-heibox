package androidx.transition;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.annotation.SuppressLint;
import android.content.Context;
import android.content.res.TypedArray;
import android.content.res.XmlResourceParser;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.PointF;
import android.graphics.Rect;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.util.Property;
import android.view.View;
import android.view.ViewGroup;
import androidx.core.view.j1;
import com.umeng.socialize.net.dplus.CommonNetImpl;
import java.util.Map;

/* JADX INFO: loaded from: classes6.dex */
public class ChangeBounds extends Transition {
    private int[] W;
    private boolean X;
    private boolean Y;
    private static final String Z = "android:changeBounds:bounds";

    /* JADX INFO: renamed from: a0, reason: collision with root package name */
    private static final String f27624a0 = "android:changeBounds:clip";

    /* JADX INFO: renamed from: b0, reason: collision with root package name */
    private static final String f27625b0 = "android:changeBounds:parent";

    /* JADX INFO: renamed from: c0, reason: collision with root package name */
    private static final String f27626c0 = "android:changeBounds:windowX";

    /* JADX INFO: renamed from: p1, reason: collision with root package name */
    private static final String f27627p1 = "android:changeBounds:windowY";

    /* JADX INFO: renamed from: x1, reason: collision with root package name */
    private static final String[] f27630x1 = {Z, f27624a0, f27625b0, f27626c0, f27627p1};

    /* JADX INFO: renamed from: y1, reason: collision with root package name */
    private static final Property<Drawable, PointF> f27632y1 = new b(PointF.class, "boundsOrigin");

    /* JADX INFO: renamed from: p2, reason: collision with root package name */
    private static final Property<k, PointF> f27628p2 = new c(PointF.class, "topLeft");

    /* JADX INFO: renamed from: x2, reason: collision with root package name */
    private static final Property<k, PointF> f27631x2 = new d(PointF.class, "bottomRight");

    /* JADX INFO: renamed from: y2, reason: collision with root package name */
    private static final Property<View, PointF> f27633y2 = new e(PointF.class, "bottomRight");
    private static final Property<View, PointF> G2 = new f(PointF.class, "topLeft");

    /* JADX INFO: renamed from: p3, reason: collision with root package name */
    private static final Property<View, PointF> f27629p3 = new g(PointF.class, CommonNetImpl.POSITION);
    private static o G3 = new o();

    public class a extends AnimatorListenerAdapter {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ ViewGroup f27634b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ BitmapDrawable f27635c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        final /* synthetic */ View f27636d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        final /* synthetic */ float f27637e;

        a(ViewGroup viewGroup, BitmapDrawable bitmapDrawable, View view, float f10) {
            this.f27634b = viewGroup;
            this.f27635c = bitmapDrawable;
            this.f27636d = view;
            this.f27637e = f10;
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationEnd(Animator animator) {
            l0.b(this.f27634b).a(this.f27635c);
            l0.h(this.f27636d, this.f27637e);
        }
    }

    public class b extends Property<Drawable, PointF> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private Rect f27639a;

        b(Class cls, String str) {
            super(cls, str);
            this.f27639a = new Rect();
        }

        @Override // android.util.Property
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public PointF get(Drawable drawable) {
            drawable.copyBounds(this.f27639a);
            Rect rect = this.f27639a;
            return new PointF(rect.left, rect.top);
        }

        @Override // android.util.Property
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public void set(Drawable drawable, PointF pointF) {
            drawable.copyBounds(this.f27639a);
            this.f27639a.offsetTo(Math.round(pointF.x), Math.round(pointF.y));
            drawable.setBounds(this.f27639a);
        }
    }

    public class c extends Property<k, PointF> {
        c(Class cls, String str) {
            super(cls, str);
        }

        @Override // android.util.Property
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public PointF get(k kVar) {
            return null;
        }

        @Override // android.util.Property
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public void set(k kVar, PointF pointF) {
            kVar.c(pointF);
        }
    }

    public class d extends Property<k, PointF> {
        d(Class cls, String str) {
            super(cls, str);
        }

        @Override // android.util.Property
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public PointF get(k kVar) {
            return null;
        }

        @Override // android.util.Property
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public void set(k kVar, PointF pointF) {
            kVar.a(pointF);
        }
    }

    public class e extends Property<View, PointF> {
        e(Class cls, String str) {
            super(cls, str);
        }

        @Override // android.util.Property
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public PointF get(View view) {
            return null;
        }

        @Override // android.util.Property
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public void set(View view, PointF pointF) {
            l0.g(view, view.getLeft(), view.getTop(), Math.round(pointF.x), Math.round(pointF.y));
        }
    }

    public class f extends Property<View, PointF> {
        f(Class cls, String str) {
            super(cls, str);
        }

        @Override // android.util.Property
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public PointF get(View view) {
            return null;
        }

        @Override // android.util.Property
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public void set(View view, PointF pointF) {
            l0.g(view, Math.round(pointF.x), Math.round(pointF.y), view.getRight(), view.getBottom());
        }
    }

    public class g extends Property<View, PointF> {
        g(Class cls, String str) {
            super(cls, str);
        }

        @Override // android.util.Property
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public PointF get(View view) {
            return null;
        }

        @Override // android.util.Property
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public void set(View view, PointF pointF) {
            int iRound = Math.round(pointF.x);
            int iRound2 = Math.round(pointF.y);
            l0.g(view, iRound, iRound2, view.getWidth() + iRound, view.getHeight() + iRound2);
        }
    }

    public class h extends AnimatorListenerAdapter {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ k f27640b;
        private k mViewBounds;

        h(k kVar) {
            this.f27640b = kVar;
            this.mViewBounds = kVar;
        }
    }

    public class i extends AnimatorListenerAdapter {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private boolean f27642b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ View f27643c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        final /* synthetic */ Rect f27644d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        final /* synthetic */ int f27645e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        final /* synthetic */ int f27646f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        final /* synthetic */ int f27647g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        final /* synthetic */ int f27648h;

        i(View view, Rect rect, int i10, int i11, int i12, int i13) {
            this.f27643c = view;
            this.f27644d = rect;
            this.f27645e = i10;
            this.f27646f = i11;
            this.f27647g = i12;
            this.f27648h = i13;
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationCancel(Animator animator) {
            this.f27642b = true;
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationEnd(Animator animator) {
            if (this.f27642b) {
                return;
            }
            j1.M1(this.f27643c, this.f27644d);
            l0.g(this.f27643c, this.f27645e, this.f27646f, this.f27647g, this.f27648h);
        }
    }

    public class j extends u {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        boolean f27650b = false;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ ViewGroup f27651c;

        j(ViewGroup viewGroup) {
            this.f27651c = viewGroup;
        }

        @Override // androidx.transition.u, androidx.transition.Transition.h
        public void a(@androidx.annotation.n0 Transition transition) {
            h0.d(this.f27651c, true);
        }

        @Override // androidx.transition.u, androidx.transition.Transition.h
        public void c(@androidx.annotation.n0 Transition transition) {
            h0.d(this.f27651c, false);
        }

        @Override // androidx.transition.u, androidx.transition.Transition.h
        public void d(@androidx.annotation.n0 Transition transition) {
            if (!this.f27650b) {
                h0.d(this.f27651c, false);
            }
            transition.n0(this);
        }

        @Override // androidx.transition.u, androidx.transition.Transition.h
        public void e(@androidx.annotation.n0 Transition transition) {
            h0.d(this.f27651c, false);
            this.f27650b = true;
        }
    }

    public static class k {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private int f27653a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private int f27654b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private int f27655c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private int f27656d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        private View f27657e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        private int f27658f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        private int f27659g;

        k(View view) {
            this.f27657e = view;
        }

        private void b() {
            l0.g(this.f27657e, this.f27653a, this.f27654b, this.f27655c, this.f27656d);
            this.f27658f = 0;
            this.f27659g = 0;
        }

        void a(PointF pointF) {
            this.f27655c = Math.round(pointF.x);
            this.f27656d = Math.round(pointF.y);
            int i10 = this.f27659g + 1;
            this.f27659g = i10;
            if (this.f27658f == i10) {
                b();
            }
        }

        void c(PointF pointF) {
            this.f27653a = Math.round(pointF.x);
            this.f27654b = Math.round(pointF.y);
            int i10 = this.f27658f + 1;
            this.f27658f = i10;
            if (i10 == this.f27659g) {
                b();
            }
        }
    }

    public ChangeBounds() {
        this.W = new int[2];
        this.X = false;
        this.Y = false;
    }

    @SuppressLint({"RestrictedApi"})
    public ChangeBounds(@androidx.annotation.n0 Context context, @androidx.annotation.n0 AttributeSet attributeSet) {
        super(context, attributeSet);
        this.W = new int[2];
        this.X = false;
        this.Y = false;
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, s.f27909d);
        boolean zE = androidx.core.content.res.q.e(typedArrayObtainStyledAttributes, (XmlResourceParser) attributeSet, "resizeClip", 0, false);
        typedArrayObtainStyledAttributes.recycle();
        L0(zE);
    }

    private void I0(z zVar) {
        View view = zVar.f27974b;
        if (!j1.U0(view) && view.getWidth() == 0 && view.getHeight() == 0) {
            return;
        }
        zVar.f27973a.put(Z, new Rect(view.getLeft(), view.getTop(), view.getRight(), view.getBottom()));
        zVar.f27973a.put(f27625b0, zVar.f27974b.getParent());
        if (this.Y) {
            zVar.f27974b.getLocationInWindow(this.W);
            zVar.f27973a.put(f27626c0, Integer.valueOf(this.W[0]));
            zVar.f27973a.put(f27627p1, Integer.valueOf(this.W[1]));
        }
        if (this.X) {
            zVar.f27973a.put(f27624a0, j1.P(view));
        }
    }

    private boolean K0(View view, View view2) {
        if (!this.Y) {
            return true;
        }
        z zVarM = M(view, true);
        if (zVarM == null) {
            if (view == view2) {
                return true;
            }
        } else if (view2 == zVarM.f27974b) {
            return true;
        }
        return false;
    }

    public boolean J0() {
        return this.X;
    }

    public void L0(boolean z10) {
        this.X = z10;
    }

    @Override // androidx.transition.Transition
    @androidx.annotation.n0
    public String[] Y() {
        return f27630x1;
    }

    @Override // androidx.transition.Transition
    public void j(@androidx.annotation.n0 z zVar) {
        I0(zVar);
    }

    @Override // androidx.transition.Transition
    public void m(@androidx.annotation.n0 z zVar) {
        I0(zVar);
    }

    @Override // androidx.transition.Transition
    @androidx.annotation.p0
    public Animator q(@androidx.annotation.n0 ViewGroup viewGroup, @androidx.annotation.p0 z zVar, @androidx.annotation.p0 z zVar2) {
        int i10;
        View view;
        ObjectAnimator objectAnimatorA;
        int i11;
        Rect rect;
        ObjectAnimator objectAnimator;
        Animator animatorC;
        if (zVar == null || zVar2 == null) {
            return null;
        }
        Map<String, Object> map = zVar.f27973a;
        Map<String, Object> map2 = zVar2.f27973a;
        ViewGroup viewGroup2 = (ViewGroup) map.get(f27625b0);
        ViewGroup viewGroup3 = (ViewGroup) map2.get(f27625b0);
        if (viewGroup2 == null || viewGroup3 == null) {
            return null;
        }
        View view2 = zVar2.f27974b;
        if (!K0(viewGroup2, viewGroup3)) {
            int iIntValue = ((Integer) zVar.f27973a.get(f27626c0)).intValue();
            int iIntValue2 = ((Integer) zVar.f27973a.get(f27627p1)).intValue();
            int iIntValue3 = ((Integer) zVar2.f27973a.get(f27626c0)).intValue();
            int iIntValue4 = ((Integer) zVar2.f27973a.get(f27627p1)).intValue();
            if (iIntValue == iIntValue3 && iIntValue2 == iIntValue4) {
                return null;
            }
            viewGroup.getLocationInWindow(this.W);
            Bitmap bitmapCreateBitmap = Bitmap.createBitmap(view2.getWidth(), view2.getHeight(), Bitmap.Config.ARGB_8888);
            view2.draw(new Canvas(bitmapCreateBitmap));
            BitmapDrawable bitmapDrawable = new BitmapDrawable(bitmapCreateBitmap);
            float fC = l0.c(view2);
            l0.h(view2, 0.0f);
            l0.b(viewGroup).b(bitmapDrawable);
            PathMotion pathMotionP = P();
            int[] iArr = this.W;
            int i12 = iArr[0];
            int i13 = iArr[1];
            ObjectAnimator objectAnimatorOfPropertyValuesHolder = ObjectAnimator.ofPropertyValuesHolder(bitmapDrawable, n.a(f27632y1, pathMotionP.a(iIntValue - i12, iIntValue2 - i13, iIntValue3 - i12, iIntValue4 - i13)));
            objectAnimatorOfPropertyValuesHolder.addListener(new a(viewGroup, bitmapDrawable, view2, fC));
            return objectAnimatorOfPropertyValuesHolder;
        }
        Rect rect2 = (Rect) zVar.f27973a.get(Z);
        Rect rect3 = (Rect) zVar2.f27973a.get(Z);
        int i14 = rect2.left;
        int i15 = rect3.left;
        int i16 = rect2.top;
        int i17 = rect3.top;
        int i18 = rect2.right;
        int i19 = rect3.right;
        int i20 = rect2.bottom;
        int i21 = rect3.bottom;
        int i22 = i18 - i14;
        int i23 = i20 - i16;
        int i24 = i19 - i15;
        int i25 = i21 - i17;
        Rect rect4 = (Rect) zVar.f27973a.get(f27624a0);
        Rect rect5 = (Rect) zVar2.f27973a.get(f27624a0);
        if ((i22 == 0 || i23 == 0) && (i24 == 0 || i25 == 0)) {
            i10 = 0;
        } else {
            i10 = (i14 == i15 && i16 == i17) ? 0 : 1;
            if (i18 != i19 || i20 != i21) {
                i10++;
            }
        }
        if ((rect4 != null && !rect4.equals(rect5)) || (rect4 == null && rect5 != null)) {
            i10++;
        }
        if (i10 <= 0) {
            return null;
        }
        if (this.X) {
            l0.g(view, i14, i16, Math.max(i22, i24) + i14, Math.max(i23, i25) + i16);
            if (i14 == i15 && i16 == i17) {
                objectAnimatorA = null;
            } else {
                view = view2;
                objectAnimatorA = l.a(view, f27629p3, P().a(i14, i16, i15, i17));
            }
            if (rect4 == null) {
                i11 = 0;
                rect = new Rect(0, 0, i22, i23);
            } else {
                i11 = 0;
                rect = rect4;
            }
            Rect rect6 = rect5 == null ? new Rect(i11, i11, i24, i25) : rect5;
            if (rect.equals(rect6)) {
                objectAnimator = null;
            } else {
                j1.M1(view, rect);
                o oVar = G3;
                Object[] objArr = new Object[2];
                objArr[i11] = rect;
                objArr[1] = rect6;
                ObjectAnimator objectAnimatorOfObject = ObjectAnimator.ofObject(view, "clipBounds", oVar, objArr);
                objectAnimatorOfObject.addListener(new i(view, rect5, i15, i17, i19, i21));
                objectAnimator = objectAnimatorOfObject;
            }
            animatorC = y.c(objectAnimatorA, objectAnimator);
        } else {
            l0.g(view, i14, i16, i18, i20);
            if (i10 != 2) {
                animatorC = (i14 == i15 && i16 == i17) ? l.a(view, f27633y2, P().a(i18, i20, i19, i21)) : l.a(view, G2, P().a(i14, i16, i15, i17));
            } else if (i22 == i24 && i23 == i25) {
                animatorC = l.a(view, f27629p3, P().a(i14, i16, i15, i17));
            } else {
                k kVar = new k(view);
                ObjectAnimator objectAnimatorA2 = l.a(kVar, f27628p2, P().a(i14, i16, i15, i17));
                ObjectAnimator objectAnimatorA3 = l.a(kVar, f27631x2, P().a(i18, i20, i19, i21));
                AnimatorSet animatorSet = new AnimatorSet();
                animatorSet.playTogether(objectAnimatorA2, objectAnimatorA3);
                animatorSet.addListener(new h(kVar));
                animatorC = animatorSet;
            }
        }
        if (view.getParent() instanceof ViewGroup) {
            ViewGroup viewGroup4 = (ViewGroup) view.getParent();
            h0.d(viewGroup4, true);
            a(new j(viewGroup4));
        }
        return animatorC;
    }
}
