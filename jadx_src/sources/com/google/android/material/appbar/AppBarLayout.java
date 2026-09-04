package com.google.android.material.appbar;

import android.animation.TimeInterpolator;
import android.animation.ValueAnimator;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Rect;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.os.Parcel;
import android.os.Parcelable;
import android.util.AttributeSet;
import android.view.KeyEvent;
import android.view.MotionEvent;
import android.view.View;
import android.view.View$OnUnhandledKeyEventListener;
import android.view.ViewGroup;
import android.view.ViewOutlineProvider;
import android.view.animation.AnimationUtils;
import android.view.animation.Interpolator;
import android.widget.AbsListView;
import android.widget.LinearLayout;
import android.widget.ScrollView;
import androidx.annotation.RestrictTo;
import androidx.annotation.d0;
import androidx.annotation.l;
import androidx.annotation.n0;
import androidx.annotation.p0;
import androidx.annotation.r;
import androidx.annotation.v;
import androidx.annotation.w0;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import androidx.core.view.accessibility.a0;
import androidx.core.view.accessibility.e0;
import androidx.core.view.j1;
import androidx.core.view.n3;
import androidx.core.view.t0;
import androidx.core.view.z0;
import androidx.customview.view.AbsSavedState;
import com.google.android.material.R;
import com.google.android.material.internal.c0;
import com.google.android.material.shape.k;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: loaded from: classes7.dex */
public class AppBarLayout extends LinearLayout implements CoordinatorLayout.b {
    static final int A = 1;
    static final int B = 2;
    static final int C = 4;
    static final int D = 8;
    private static final int E = R.style.Widget_Design_AppBarLayout;
    private static final int F = -1;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    static final int f52920z = 0;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private int f52921b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private int f52922c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private int f52923d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private int f52924e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private boolean f52925f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private int f52926g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    @p0
    private n3 f52927h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private List<b> f52928i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private boolean f52929j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private boolean f52930k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private boolean f52931l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private boolean f52932m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    @d0
    private int f52933n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    @p0
    private WeakReference<View> f52934o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    @p0
    private final ColorStateList f52935p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    @p0
    private ValueAnimator f52936q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    @p0
    private ValueAnimator.AnimatorUpdateListener f52937r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    private final List<e> f52938s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    private final long f52939t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    private final TimeInterpolator f52940u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    private int[] f52941v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    @p0
    private Drawable f52942w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    private final float f52943x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    private Behavior f52944y;

    public static class BaseBehavior<T extends AppBarLayout> extends HeaderBehavior<T> {

        /* JADX INFO: renamed from: x, reason: collision with root package name */
        private static final int f52945x = 600;

        /* JADX INFO: renamed from: y, reason: collision with root package name */
        private static final double f52946y = 0.1d;

        /* JADX INFO: renamed from: q, reason: collision with root package name */
        private int f52947q;

        /* JADX INFO: renamed from: r, reason: collision with root package name */
        private int f52948r;

        /* JADX INFO: renamed from: s, reason: collision with root package name */
        private ValueAnimator f52949s;

        /* JADX INFO: renamed from: t, reason: collision with root package name */
        private SavedState f52950t;

        /* JADX INFO: renamed from: u, reason: collision with root package name */
        @p0
        private WeakReference<View> f52951u;

        /* JADX INFO: renamed from: v, reason: collision with root package name */
        private e f52952v;

        /* JADX INFO: renamed from: w, reason: collision with root package name */
        private boolean f52953w;

        public static class SavedState extends AbsSavedState {
            public static final Parcelable.Creator<SavedState> CREATOR = new a();

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            boolean f52954b;

            /* JADX INFO: renamed from: c, reason: collision with root package name */
            boolean f52955c;

            /* JADX INFO: renamed from: d, reason: collision with root package name */
            int f52956d;

            /* JADX INFO: renamed from: e, reason: collision with root package name */
            float f52957e;

            /* JADX INFO: renamed from: f, reason: collision with root package name */
            boolean f52958f;

            public class a implements Parcelable.ClassLoaderCreator<SavedState> {
                a() {
                }

                @Override // android.os.Parcelable.Creator
                @p0
                /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
                public SavedState createFromParcel(@n0 Parcel parcel) {
                    return new SavedState(parcel, null);
                }

                @Override // android.os.Parcelable.ClassLoaderCreator
                @n0
                /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
                public SavedState createFromParcel(@n0 Parcel parcel, ClassLoader classLoader) {
                    return new SavedState(parcel, classLoader);
                }

                @Override // android.os.Parcelable.Creator
                @n0
                /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
                public SavedState[] newArray(int i10) {
                    return new SavedState[i10];
                }
            }

            public SavedState(@n0 Parcel parcel, ClassLoader classLoader) {
                super(parcel, classLoader);
                this.f52954b = parcel.readByte() != 0;
                this.f52955c = parcel.readByte() != 0;
                this.f52956d = parcel.readInt();
                this.f52957e = parcel.readFloat();
                this.f52958f = parcel.readByte() != 0;
            }

            public SavedState(Parcelable parcelable) {
                super(parcelable);
            }

            @Override // androidx.customview.view.AbsSavedState, android.os.Parcelable
            public void writeToParcel(@n0 Parcel parcel, int i10) {
                super.writeToParcel(parcel, i10);
                parcel.writeByte(this.f52954b ? (byte) 1 : (byte) 0);
                parcel.writeByte(this.f52955c ? (byte) 1 : (byte) 0);
                parcel.writeInt(this.f52956d);
                parcel.writeFloat(this.f52957e);
                parcel.writeByte(this.f52958f ? (byte) 1 : (byte) 0);
            }
        }

        public class a implements ValueAnimator.AnimatorUpdateListener {

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            final /* synthetic */ CoordinatorLayout f52959b;

            /* JADX INFO: renamed from: c, reason: collision with root package name */
            final /* synthetic */ AppBarLayout f52960c;

            a(CoordinatorLayout coordinatorLayout, AppBarLayout appBarLayout) {
                this.f52959b = coordinatorLayout;
                this.f52960c = appBarLayout;
            }

            @Override // android.animation.ValueAnimator.AnimatorUpdateListener
            public void onAnimationUpdate(@n0 ValueAnimator valueAnimator) {
                BaseBehavior.this.a0(this.f52959b, this.f52960c, ((Integer) valueAnimator.getAnimatedValue()).intValue());
            }
        }

        public class b extends androidx.core.view.a {
            b() {
            }

            @Override // androidx.core.view.a
            public void onInitializeAccessibilityNodeInfo(View view, @n0 a0 a0Var) {
                super.onInitializeAccessibilityNodeInfo(view, a0Var);
                a0Var.M1(BaseBehavior.this.f52953w);
                a0Var.b1(ScrollView.class.getName());
            }
        }

        public class c implements e0 {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            final /* synthetic */ CoordinatorLayout f52963a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            final /* synthetic */ AppBarLayout f52964b;

            /* JADX INFO: renamed from: c, reason: collision with root package name */
            final /* synthetic */ View f52965c;

            /* JADX INFO: renamed from: d, reason: collision with root package name */
            final /* synthetic */ int f52966d;

            c(CoordinatorLayout coordinatorLayout, AppBarLayout appBarLayout, View view, int i10) {
                this.f52963a = coordinatorLayout;
                this.f52964b = appBarLayout;
                this.f52965c = view;
                this.f52966d = i10;
            }

            /* JADX WARN: Multi-variable type inference failed */
            /* JADX WARN: Type inference fix 'apply assigned field type' failed
            java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$PrimitiveArg
            	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:596)
            	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
            	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
            	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
            	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
            	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
            	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
             */
            @Override // androidx.core.view.accessibility.e0
            public boolean perform(@n0 View view, @p0 e0.a aVar) {
                BaseBehavior.this.u(this.f52963a, this.f52964b, this.f52965c, 0, this.f52966d, new int[]{0, 0}, 1);
                return true;
            }
        }

        public class d implements e0 {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            final /* synthetic */ AppBarLayout f52968a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            final /* synthetic */ boolean f52969b;

            d(AppBarLayout appBarLayout, boolean z10) {
                this.f52968a = appBarLayout;
                this.f52969b = z10;
            }

            @Override // androidx.core.view.accessibility.e0
            public boolean perform(@n0 View view, @p0 e0.a aVar) {
                this.f52968a.setExpanded(this.f52969b);
                return true;
            }
        }

        public static abstract class e<T extends AppBarLayout> {
            public abstract boolean a(@n0 T t10);
        }

        public BaseBehavior() {
        }

        public BaseBehavior(Context context, AttributeSet attributeSet) {
            super(context, attributeSet);
        }

        private boolean N0(@n0 CoordinatorLayout coordinatorLayout, @n0 T t10) {
            List<View> listT = coordinatorLayout.t(t10);
            int size = listT.size();
            for (int i10 = 0; i10 < size; i10++) {
                CoordinatorLayout.Behavior behaviorF = ((CoordinatorLayout.f) listT.get(i10).getLayoutParams()).f();
                if (behaviorF instanceof ScrollingViewBehavior) {
                    return ((ScrollingViewBehavior) behaviorF).V() != 0;
                }
            }
            return false;
        }

        private void O0(CoordinatorLayout coordinatorLayout, @n0 T t10) {
            int topInset = t10.getTopInset() + t10.getPaddingTop();
            int iX = X() - topInset;
            int iS0 = s0(t10, iX);
            if (iS0 >= 0) {
                View childAt = t10.getChildAt(iS0);
                LayoutParams layoutParams = (LayoutParams) childAt.getLayoutParams();
                int iC = layoutParams.c();
                if ((iC & 17) == 17) {
                    int topInset2 = -childAt.getTop();
                    int iE0 = -childAt.getBottom();
                    if (iS0 == 0 && j1.U(t10) && j1.U(childAt)) {
                        topInset2 -= t10.getTopInset();
                    }
                    if (n0(iC, 2)) {
                        iE0 += j1.e0(childAt);
                    } else if (n0(iC, 5)) {
                        int iE1 = j1.e0(childAt) + iE0;
                        if (iX < iE1) {
                            topInset2 = iE1;
                        } else {
                            iE0 = iE1;
                        }
                    }
                    if (n0(iC, 32)) {
                        topInset2 += ((LinearLayout.LayoutParams) layoutParams).topMargin;
                        iE0 -= ((LinearLayout.LayoutParams) layoutParams).bottomMargin;
                    }
                    i0(coordinatorLayout, t10, a2.a.e(k0(iX, iE0, topInset2) + topInset, -t10.getTotalScrollRange(), 0), 0.0f);
                }
            }
        }

        private void P0(CoordinatorLayout coordinatorLayout, @n0 T t10) {
            View viewT0;
            j1.r1(coordinatorLayout, a0.a.f21388r.b());
            j1.r1(coordinatorLayout, a0.a.f21389s.b());
            if (t10.getTotalScrollRange() == 0 || (viewT0 = t0(coordinatorLayout)) == null || !o0(t10)) {
                return;
            }
            if (!j1.G0(coordinatorLayout)) {
                j1.B1(coordinatorLayout, new b());
            }
            this.f52953w = g0(coordinatorLayout, t10, viewT0);
        }

        private void Q0(@n0 CoordinatorLayout coordinatorLayout, @n0 T t10, int i10, int i11, boolean z10) {
            View viewR0 = r0(t10, i10);
            boolean zI = false;
            if (viewR0 != null) {
                int iC = ((LayoutParams) viewR0.getLayoutParams()).c();
                if ((iC & 1) != 0) {
                    int iE0 = j1.e0(viewR0);
                    if (i11 <= 0 || (iC & 12) == 0 ? !((iC & 2) == 0 || (-i10) < (viewR0.getBottom() - iE0) - t10.getTopInset()) : (-i10) >= (viewR0.getBottom() - iE0) - t10.getTopInset()) {
                        zI = true;
                    }
                }
            }
            if (t10.r()) {
                zI = t10.I(q0(coordinatorLayout));
            }
            boolean zF = t10.F(zI);
            if (z10 || (zF && N0(coordinatorLayout, t10))) {
                t10.jumpDrawablesToCurrentState();
            }
        }

        private boolean g0(CoordinatorLayout coordinatorLayout, @n0 T t10, @n0 View view) {
            boolean z10 = false;
            if (X() != (-t10.getTotalScrollRange())) {
                h0(coordinatorLayout, t10, a0.a.f21388r, false);
                z10 = true;
            }
            if (X() != 0) {
                if (!view.canScrollVertically(-1)) {
                    h0(coordinatorLayout, t10, a0.a.f21389s, true);
                    return true;
                }
                int i10 = -t10.getDownNestedPreScrollRange();
                if (i10 != 0) {
                    j1.u1(coordinatorLayout, a0.a.f21389s, null, new c(coordinatorLayout, t10, view, i10));
                    return true;
                }
            }
            return z10;
        }

        private void h0(CoordinatorLayout coordinatorLayout, @n0 T t10, @n0 a0.a aVar, boolean z10) {
            j1.u1(coordinatorLayout, aVar, null, new d(t10, z10));
        }

        private void i0(CoordinatorLayout coordinatorLayout, @n0 T t10, int i10, float f10) {
            int iAbs = Math.abs(X() - i10);
            float fAbs = Math.abs(f10);
            j0(coordinatorLayout, t10, i10, fAbs > 0.0f ? Math.round((iAbs / fAbs) * 1000.0f) * 3 : (int) (((iAbs / t10.getHeight()) + 1.0f) * 150.0f));
        }

        private void j0(CoordinatorLayout coordinatorLayout, T t10, int i10, int i11) {
            int iX = X();
            if (iX == i10) {
                ValueAnimator valueAnimator = this.f52949s;
                if (valueAnimator == null || !valueAnimator.isRunning()) {
                    return;
                }
                this.f52949s.cancel();
                return;
            }
            ValueAnimator valueAnimator2 = this.f52949s;
            if (valueAnimator2 == null) {
                ValueAnimator valueAnimator3 = new ValueAnimator();
                this.f52949s = valueAnimator3;
                valueAnimator3.setInterpolator(com.google.android.material.animation.b.f52900e);
                this.f52949s.addUpdateListener(new a(coordinatorLayout, t10));
            } else {
                valueAnimator2.cancel();
            }
            this.f52949s.setDuration(Math.min(i11, 600));
            this.f52949s.setIntValues(iX, i10);
            this.f52949s.start();
        }

        private int k0(int i10, int i11, int i12) {
            return i10 < (i11 + i12) / 2 ? i11 : i12;
        }

        private boolean m0(@n0 CoordinatorLayout coordinatorLayout, @n0 T t10, @n0 View view) {
            return t10.n() && coordinatorLayout.getHeight() - view.getHeight() <= t10.getHeight();
        }

        private static boolean n0(int i10, int i11) {
            return (i10 & i11) == i11;
        }

        private boolean o0(AppBarLayout appBarLayout) {
            int childCount = appBarLayout.getChildCount();
            for (int i10 = 0; i10 < childCount; i10++) {
                if (((LayoutParams) appBarLayout.getChildAt(i10).getLayoutParams()).f52983a != 0) {
                    return true;
                }
            }
            return false;
        }

        private void p0(KeyEvent keyEvent, View view, AppBarLayout appBarLayout) {
            if (keyEvent.getAction() == 0 || keyEvent.getAction() == 1) {
                int keyCode = keyEvent.getKeyCode();
                if (keyCode == 19 || keyCode == 280 || keyCode == 92) {
                    if (view.getScrollY() < ((double) view.getMeasuredHeight()) * f52946y) {
                        appBarLayout.setExpanded(true);
                    }
                } else if ((keyCode == 20 || keyCode == 281 || keyCode == 93) && view.getScrollY() > 0) {
                    appBarLayout.setExpanded(false);
                }
            }
        }

        @p0
        private View q0(@n0 CoordinatorLayout coordinatorLayout) {
            int childCount = coordinatorLayout.getChildCount();
            for (int i10 = 0; i10 < childCount; i10++) {
                View childAt = coordinatorLayout.getChildAt(i10);
                if ((childAt instanceof t0) || (childAt instanceof AbsListView) || (childAt instanceof ScrollView)) {
                    return childAt;
                }
            }
            return null;
        }

        @p0
        private static View r0(@n0 AppBarLayout appBarLayout, int i10) {
            int iAbs = Math.abs(i10);
            int childCount = appBarLayout.getChildCount();
            for (int i11 = 0; i11 < childCount; i11++) {
                View childAt = appBarLayout.getChildAt(i11);
                if (iAbs >= childAt.getTop() && iAbs <= childAt.getBottom()) {
                    return childAt;
                }
            }
            return null;
        }

        private int s0(@n0 T t10, int i10) {
            int childCount = t10.getChildCount();
            for (int i11 = 0; i11 < childCount; i11++) {
                View childAt = t10.getChildAt(i11);
                int top = childAt.getTop();
                int bottom = childAt.getBottom();
                LayoutParams layoutParams = (LayoutParams) childAt.getLayoutParams();
                if (n0(layoutParams.c(), 32)) {
                    top -= ((LinearLayout.LayoutParams) layoutParams).topMargin;
                    bottom += ((LinearLayout.LayoutParams) layoutParams).bottomMargin;
                }
                int i12 = -i10;
                if (top <= i12 && bottom >= i12) {
                    return i11;
                }
            }
            return -1;
        }

        @p0
        private View t0(CoordinatorLayout coordinatorLayout) {
            int childCount = coordinatorLayout.getChildCount();
            for (int i10 = 0; i10 < childCount; i10++) {
                View childAt = coordinatorLayout.getChildAt(i10);
                if (((CoordinatorLayout.f) childAt.getLayoutParams()).f() instanceof ScrollingViewBehavior) {
                    return childAt;
                }
            }
            return null;
        }

        private int w0(@n0 T t10, int i10) {
            int iAbs = Math.abs(i10);
            int childCount = t10.getChildCount();
            int topInset = 0;
            for (int i11 = 0; i11 < childCount; i11++) {
                View childAt = t10.getChildAt(i11);
                LayoutParams layoutParams = (LayoutParams) childAt.getLayoutParams();
                Interpolator interpolatorD = layoutParams.d();
                if (iAbs >= childAt.getTop() && iAbs <= childAt.getBottom()) {
                    if (interpolatorD == null) {
                        break;
                    }
                    int iC = layoutParams.c();
                    if ((iC & 1) != 0) {
                        topInset = 0 + childAt.getHeight() + ((LinearLayout.LayoutParams) layoutParams).topMargin + ((LinearLayout.LayoutParams) layoutParams).bottomMargin;
                        if ((iC & 2) != 0) {
                            topInset -= j1.e0(childAt);
                        }
                    }
                    if (j1.U(childAt)) {
                        topInset -= t10.getTopInset();
                    }
                    if (topInset <= 0) {
                        break;
                    }
                    float f10 = topInset;
                    return Integer.signum(i10) * (childAt.getTop() + Math.round(f10 * interpolatorD.getInterpolation((iAbs - childAt.getTop()) / f10)));
                }
            }
            return i10;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public /* synthetic */ boolean y0(View view, AppBarLayout appBarLayout, View view2, KeyEvent keyEvent) {
            p0(keyEvent, view, appBarLayout);
            return false;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public /* synthetic */ boolean z0(View view, AppBarLayout appBarLayout, View view2, int i10, KeyEvent keyEvent) {
            p0(keyEvent, view, appBarLayout);
            return false;
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        @Override // com.google.android.material.appbar.HeaderBehavior
        /* JADX INFO: renamed from: A0, reason: merged with bridge method [inline-methods] */
        public void Y(@n0 CoordinatorLayout coordinatorLayout, @n0 T t10) {
            O0(coordinatorLayout, t10);
            if (t10.r()) {
                t10.F(t10.I(q0(coordinatorLayout)));
            }
        }

        @Override // com.google.android.material.appbar.ViewOffsetBehavior, androidx.coordinatorlayout.widget.CoordinatorLayout.Behavior
        /* JADX INFO: renamed from: B0, reason: merged with bridge method [inline-methods] */
        public boolean p(@n0 CoordinatorLayout coordinatorLayout, @n0 final T t10, int i10) {
            boolean zP = super.p(coordinatorLayout, t10, i10);
            int pendingAction = t10.getPendingAction();
            SavedState savedState = this.f52950t;
            if (savedState == null || (pendingAction & 8) != 0) {
                if (pendingAction != 0) {
                    boolean z10 = (pendingAction & 4) != 0;
                    if ((pendingAction & 2) != 0) {
                        int i11 = -t10.getUpNestedPreScrollRange();
                        if (z10) {
                            i0(coordinatorLayout, t10, i11, 0.0f);
                        } else {
                            a0(coordinatorLayout, t10, i11);
                        }
                    } else if ((pendingAction & 1) != 0) {
                        if (z10) {
                            i0(coordinatorLayout, t10, 0, 0.0f);
                        } else {
                            a0(coordinatorLayout, t10, 0);
                        }
                    }
                }
            } else if (savedState.f52954b) {
                a0(coordinatorLayout, t10, -t10.getTotalScrollRange());
            } else if (savedState.f52955c) {
                a0(coordinatorLayout, t10, 0);
            } else {
                View childAt = t10.getChildAt(savedState.f52956d);
                a0(coordinatorLayout, t10, (-childAt.getBottom()) + (this.f52950t.f52958f ? j1.e0(childAt) + t10.getTopInset() : Math.round(childAt.getHeight() * this.f52950t.f52957e)));
            }
            t10.A();
            this.f52950t = null;
            Q(a2.a.e(K(), -t10.getTotalScrollRange(), 0));
            Q0(coordinatorLayout, t10, K(), 0, true);
            t10.v(K());
            P0(coordinatorLayout, t10);
            final View viewQ0 = q0(coordinatorLayout);
            if (viewQ0 != null) {
                if (Build.VERSION.SDK_INT >= 28) {
                    viewQ0.addOnUnhandledKeyEventListener(new View$OnUnhandledKeyEventListener() { // from class: com.google.android.material.appbar.c
                        public final boolean onUnhandledKeyEvent(View view, KeyEvent keyEvent) {
                            return this.f53049a.y0(viewQ0, t10, view, keyEvent);
                        }
                    });
                } else {
                    viewQ0.setOnKeyListener(new View.OnKeyListener() { // from class: com.google.android.material.appbar.d
                        @Override // android.view.View.OnKeyListener
                        public final boolean onKey(View view, int i12, KeyEvent keyEvent) {
                            return this.f53052b.z0(viewQ0, t10, view, i12, keyEvent);
                        }
                    });
                }
            }
            return zP;
        }

        @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.Behavior
        /* JADX INFO: renamed from: C0, reason: merged with bridge method [inline-methods] */
        public boolean q(@n0 CoordinatorLayout coordinatorLayout, @n0 T t10, int i10, int i11, int i12, int i13) {
            if (((ViewGroup.MarginLayoutParams) ((CoordinatorLayout.f) t10.getLayoutParams())).height != -2) {
                return super.q(coordinatorLayout, t10, i10, i11, i12, i13);
            }
            coordinatorLayout.L(t10, i10, i11, View.MeasureSpec.makeMeasureSpec(0, 0), i13);
            return true;
        }

        @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.Behavior
        /* JADX INFO: renamed from: D0, reason: merged with bridge method [inline-methods] */
        public void u(CoordinatorLayout coordinatorLayout, @n0 T t10, View view, int i10, int i11, int[] iArr, int i12) {
            int i13;
            int downNestedPreScrollRange;
            if (i11 != 0) {
                if (i11 < 0) {
                    i13 = -t10.getTotalScrollRange();
                    downNestedPreScrollRange = t10.getDownNestedPreScrollRange() + i13;
                } else {
                    i13 = -t10.getUpNestedPreScrollRange();
                    downNestedPreScrollRange = 0;
                }
                int i14 = i13;
                int i15 = downNestedPreScrollRange;
                if (i14 != i15) {
                    iArr[1] = Z(coordinatorLayout, t10, i11, i14, i15);
                }
            }
            if (t10.r()) {
                t10.F(t10.I(view));
            }
        }

        @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.Behavior
        /* JADX INFO: renamed from: E0, reason: merged with bridge method [inline-methods] */
        public void x(CoordinatorLayout coordinatorLayout, @n0 T t10, View view, int i10, int i11, int i12, int i13, int i14, int[] iArr) {
            if (i13 < 0) {
                iArr[1] = Z(coordinatorLayout, t10, i13, -t10.getDownNestedScrollRange(), 0);
            }
            if (i13 == 0) {
                P0(coordinatorLayout, t10);
            }
        }

        @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.Behavior
        /* JADX INFO: renamed from: F0, reason: merged with bridge method [inline-methods] */
        public void B(@n0 CoordinatorLayout coordinatorLayout, @n0 T t10, Parcelable parcelable) {
            if (parcelable instanceof SavedState) {
                J0((SavedState) parcelable, true);
                super.B(coordinatorLayout, t10, this.f52950t.getSuperState());
            } else {
                super.B(coordinatorLayout, t10, parcelable);
                this.f52950t = null;
            }
        }

        @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.Behavior
        /* JADX INFO: renamed from: G0, reason: merged with bridge method [inline-methods] */
        public Parcelable C(@n0 CoordinatorLayout coordinatorLayout, @n0 T t10) {
            Parcelable parcelableC = super.C(coordinatorLayout, t10);
            SavedState savedStateK0 = K0(parcelableC, t10);
            return savedStateK0 == null ? parcelableC : savedStateK0;
        }

        @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.Behavior
        /* JADX INFO: renamed from: H0, reason: merged with bridge method [inline-methods] */
        public boolean E(@n0 CoordinatorLayout coordinatorLayout, @n0 T t10, @n0 View view, View view2, int i10, int i11) {
            ValueAnimator valueAnimator;
            boolean z10 = (i10 & 2) != 0 && (t10.r() || m0(coordinatorLayout, t10, view));
            if (z10 && (valueAnimator = this.f52949s) != null) {
                valueAnimator.cancel();
            }
            this.f52951u = null;
            this.f52948r = i11;
            return z10;
        }

        @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.Behavior
        /* JADX INFO: renamed from: I0, reason: merged with bridge method [inline-methods] */
        public void G(CoordinatorLayout coordinatorLayout, @n0 T t10, View view, int i10) {
            if (this.f52948r == 0 || i10 == 1) {
                O0(coordinatorLayout, t10);
                if (t10.r()) {
                    t10.F(t10.I(view));
                }
            }
            this.f52951u = new WeakReference<>(view);
        }

        void J0(@p0 SavedState savedState, boolean z10) {
            if (this.f52950t == null || z10) {
                this.f52950t = savedState;
            }
        }

        @p0
        SavedState K0(@p0 Parcelable parcelable, @n0 T t10) {
            int iK = K();
            int childCount = t10.getChildCount();
            for (int i10 = 0; i10 < childCount; i10++) {
                View childAt = t10.getChildAt(i10);
                int bottom = childAt.getBottom() + iK;
                if (childAt.getTop() + iK <= 0 && bottom >= 0) {
                    if (parcelable == null) {
                        parcelable = AbsSavedState.EMPTY_STATE;
                    }
                    SavedState savedState = new SavedState(parcelable);
                    boolean z10 = iK == 0;
                    savedState.f52955c = z10;
                    savedState.f52954b = !z10 && (-iK) >= t10.getTotalScrollRange();
                    savedState.f52956d = i10;
                    savedState.f52958f = bottom == j1.e0(childAt) + t10.getTopInset();
                    savedState.f52957e = bottom / childAt.getHeight();
                    return savedState;
                }
            }
            return null;
        }

        public void L0(@p0 e eVar) {
            this.f52952v = eVar;
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        @Override // com.google.android.material.appbar.HeaderBehavior
        /* JADX INFO: renamed from: M0, reason: merged with bridge method [inline-methods] */
        public int b0(@n0 CoordinatorLayout coordinatorLayout, @n0 T t10, int i10, int i11, int i12) {
            int iX = X();
            int i13 = 0;
            if (i11 == 0 || iX < i11 || iX > i12) {
                this.f52947q = 0;
            } else {
                int iE = a2.a.e(i10, i11, i12);
                if (iX != iE) {
                    int iW0 = t10.l() ? w0(t10, iE) : iE;
                    boolean zQ = Q(iW0);
                    int i14 = iX - iE;
                    this.f52947q = iE - iW0;
                    if (zQ) {
                        while (i13 < t10.getChildCount()) {
                            LayoutParams layoutParams = (LayoutParams) t10.getChildAt(i13).getLayoutParams();
                            c cVarB = layoutParams.b();
                            if (cVarB != null && (layoutParams.c() & 1) != 0) {
                                cVarB.a(t10, t10.getChildAt(i13), K());
                            }
                            i13++;
                        }
                    }
                    if (!zQ && t10.l()) {
                        coordinatorLayout.l(t10);
                    }
                    t10.v(K());
                    Q0(coordinatorLayout, t10, iE, iE < iX ? -1 : 1, false);
                    i13 = i14;
                }
            }
            P0(coordinatorLayout, t10);
            return i13;
        }

        @Override // com.google.android.material.appbar.HeaderBehavior
        int X() {
            return K() + this.f52947q;
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        @Override // com.google.android.material.appbar.HeaderBehavior
        /* JADX INFO: renamed from: l0, reason: merged with bridge method [inline-methods] */
        public boolean S(T t10) {
            e eVar = this.f52952v;
            if (eVar != null) {
                return eVar.a(t10);
            }
            WeakReference<View> weakReference = this.f52951u;
            if (weakReference == null) {
                return true;
            }
            View view = weakReference.get();
            return (view == null || !view.isShown() || view.canScrollVertically(-1)) ? false : true;
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        @Override // com.google.android.material.appbar.HeaderBehavior
        /* JADX INFO: renamed from: u0, reason: merged with bridge method [inline-methods] */
        public int V(@n0 T t10) {
            return -t10.getDownNestedScrollRange();
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        @Override // com.google.android.material.appbar.HeaderBehavior
        /* JADX INFO: renamed from: v0, reason: merged with bridge method [inline-methods] */
        public int W(@n0 T t10) {
            return t10.getTotalScrollRange();
        }

        @androidx.annotation.j1
        boolean x0() {
            ValueAnimator valueAnimator = this.f52949s;
            return valueAnimator != null && valueAnimator.isRunning();
        }
    }

    public static class Behavior extends BaseBehavior<AppBarLayout> {

        public static abstract class a extends BaseBehavior.e<AppBarLayout> {
        }

        public Behavior() {
        }

        public Behavior(Context context, AttributeSet attributeSet) {
            super(context, attributeSet);
        }

        @Override // com.google.android.material.appbar.AppBarLayout.BaseBehavior
        /* JADX INFO: renamed from: B0 */
        public /* bridge */ /* synthetic */ boolean p(@n0 CoordinatorLayout coordinatorLayout, @n0 AppBarLayout appBarLayout, int i10) {
            return super.p(coordinatorLayout, appBarLayout, i10);
        }

        @Override // com.google.android.material.appbar.AppBarLayout.BaseBehavior
        /* JADX INFO: renamed from: C0 */
        public /* bridge */ /* synthetic */ boolean q(@n0 CoordinatorLayout coordinatorLayout, @n0 AppBarLayout appBarLayout, int i10, int i11, int i12, int i13) {
            return super.q(coordinatorLayout, appBarLayout, i10, i11, i12, i13);
        }

        @Override // com.google.android.material.appbar.AppBarLayout.BaseBehavior
        /* JADX INFO: renamed from: D0 */
        public /* bridge */ /* synthetic */ void u(CoordinatorLayout coordinatorLayout, @n0 AppBarLayout appBarLayout, View view, int i10, int i11, int[] iArr, int i12) {
            super.u(coordinatorLayout, appBarLayout, view, i10, i11, iArr, i12);
        }

        @Override // com.google.android.material.appbar.AppBarLayout.BaseBehavior
        /* JADX INFO: renamed from: E0 */
        public /* bridge */ /* synthetic */ void x(CoordinatorLayout coordinatorLayout, @n0 AppBarLayout appBarLayout, View view, int i10, int i11, int i12, int i13, int i14, int[] iArr) {
            super.x(coordinatorLayout, appBarLayout, view, i10, i11, i12, i13, i14, iArr);
        }

        @Override // com.google.android.material.appbar.AppBarLayout.BaseBehavior
        /* JADX INFO: renamed from: F0 */
        public /* bridge */ /* synthetic */ void B(@n0 CoordinatorLayout coordinatorLayout, @n0 AppBarLayout appBarLayout, Parcelable parcelable) {
            super.B(coordinatorLayout, appBarLayout, parcelable);
        }

        @Override // com.google.android.material.appbar.AppBarLayout.BaseBehavior
        /* JADX INFO: renamed from: G0 */
        public /* bridge */ /* synthetic */ Parcelable C(@n0 CoordinatorLayout coordinatorLayout, @n0 AppBarLayout appBarLayout) {
            return super.C(coordinatorLayout, appBarLayout);
        }

        @Override // com.google.android.material.appbar.HeaderBehavior, androidx.coordinatorlayout.widget.CoordinatorLayout.Behavior
        public /* bridge */ /* synthetic */ boolean H(@n0 CoordinatorLayout coordinatorLayout, @n0 View view, @n0 MotionEvent motionEvent) {
            return super.H(coordinatorLayout, view, motionEvent);
        }

        @Override // com.google.android.material.appbar.AppBarLayout.BaseBehavior
        /* JADX INFO: renamed from: H0 */
        public /* bridge */ /* synthetic */ boolean E(@n0 CoordinatorLayout coordinatorLayout, @n0 AppBarLayout appBarLayout, @n0 View view, View view2, int i10, int i11) {
            return super.E(coordinatorLayout, appBarLayout, view, view2, i10, i11);
        }

        @Override // com.google.android.material.appbar.AppBarLayout.BaseBehavior
        /* JADX INFO: renamed from: I0 */
        public /* bridge */ /* synthetic */ void G(CoordinatorLayout coordinatorLayout, @n0 AppBarLayout appBarLayout, View view, int i10) {
            super.G(coordinatorLayout, appBarLayout, view, i10);
        }

        @Override // com.google.android.material.appbar.ViewOffsetBehavior
        public /* bridge */ /* synthetic */ int J() {
            return super.J();
        }

        @Override // com.google.android.material.appbar.ViewOffsetBehavior
        public /* bridge */ /* synthetic */ int K() {
            return super.K();
        }

        @Override // com.google.android.material.appbar.ViewOffsetBehavior
        public /* bridge */ /* synthetic */ boolean L() {
            return super.L();
        }

        @Override // com.google.android.material.appbar.AppBarLayout.BaseBehavior
        public /* bridge */ /* synthetic */ void L0(@p0 BaseBehavior.e eVar) {
            super.L0(eVar);
        }

        @Override // com.google.android.material.appbar.ViewOffsetBehavior
        public /* bridge */ /* synthetic */ boolean M() {
            return super.M();
        }

        @Override // com.google.android.material.appbar.ViewOffsetBehavior
        public /* bridge */ /* synthetic */ void O(boolean z10) {
            super.O(z10);
        }

        @Override // com.google.android.material.appbar.ViewOffsetBehavior
        public /* bridge */ /* synthetic */ boolean P(int i10) {
            return super.P(i10);
        }

        @Override // com.google.android.material.appbar.ViewOffsetBehavior
        public /* bridge */ /* synthetic */ boolean Q(int i10) {
            return super.Q(i10);
        }

        @Override // com.google.android.material.appbar.ViewOffsetBehavior
        public /* bridge */ /* synthetic */ void R(boolean z10) {
            super.R(z10);
        }

        @Override // com.google.android.material.appbar.HeaderBehavior, androidx.coordinatorlayout.widget.CoordinatorLayout.Behavior
        public /* bridge */ /* synthetic */ boolean o(@n0 CoordinatorLayout coordinatorLayout, @n0 View view, @n0 MotionEvent motionEvent) {
            return super.o(coordinatorLayout, view, motionEvent);
        }
    }

    public static class LayoutParams extends LinearLayout.LayoutParams {

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public static final int f52971d = 0;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public static final int f52972e = 1;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public static final int f52973f = 2;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        public static final int f52974g = 4;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        public static final int f52975h = 8;

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        public static final int f52976i = 16;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        public static final int f52977j = 32;

        /* JADX INFO: renamed from: k, reason: collision with root package name */
        static final int f52978k = 5;

        /* JADX INFO: renamed from: l, reason: collision with root package name */
        static final int f52979l = 17;

        /* JADX INFO: renamed from: m, reason: collision with root package name */
        static final int f52980m = 10;

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        public static final int f52981n = 0;

        /* JADX INFO: renamed from: o, reason: collision with root package name */
        public static final int f52982o = 1;

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        int f52983a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private c f52984b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        Interpolator f52985c;

        @Retention(RetentionPolicy.SOURCE)
        @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
        public @interface a {
        }

        @Retention(RetentionPolicy.SOURCE)
        @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
        public @interface b {
        }

        public LayoutParams(int i10, int i11) {
            super(i10, i11);
            this.f52983a = 1;
        }

        public LayoutParams(int i10, int i11, float f10) {
            super(i10, i11, f10);
            this.f52983a = 1;
        }

        public LayoutParams(Context context, AttributeSet attributeSet) {
            super(context, attributeSet);
            this.f52983a = 1;
            TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, R.styleable.f52854m);
            this.f52983a = typedArrayObtainStyledAttributes.getInt(R.styleable.AppBarLayout_Layout_layout_scrollFlags, 0);
            f(typedArrayObtainStyledAttributes.getInt(R.styleable.AppBarLayout_Layout_layout_scrollEffect, 0));
            int i10 = R.styleable.AppBarLayout_Layout_layout_scrollInterpolator;
            if (typedArrayObtainStyledAttributes.hasValue(i10)) {
                this.f52985c = AnimationUtils.loadInterpolator(context, typedArrayObtainStyledAttributes.getResourceId(i10, 0));
            }
            typedArrayObtainStyledAttributes.recycle();
        }

        public LayoutParams(ViewGroup.LayoutParams layoutParams) {
            super(layoutParams);
            this.f52983a = 1;
        }

        public LayoutParams(ViewGroup.MarginLayoutParams marginLayoutParams) {
            super(marginLayoutParams);
            this.f52983a = 1;
        }

        @w0(19)
        public LayoutParams(LinearLayout.LayoutParams layoutParams) {
            super(layoutParams);
            this.f52983a = 1;
        }

        @w0(19)
        public LayoutParams(@n0 LayoutParams layoutParams) {
            super((LinearLayout.LayoutParams) layoutParams);
            this.f52983a = 1;
            this.f52983a = layoutParams.f52983a;
            this.f52984b = layoutParams.f52984b;
            this.f52985c = layoutParams.f52985c;
        }

        @p0
        private c a(int i10) {
            if (i10 != 1) {
                return null;
            }
            return new d();
        }

        @p0
        public c b() {
            return this.f52984b;
        }

        public int c() {
            return this.f52983a;
        }

        public Interpolator d() {
            return this.f52985c;
        }

        boolean e() {
            int i10 = this.f52983a;
            return (i10 & 1) == 1 && (i10 & 10) != 0;
        }

        public void f(int i10) {
            this.f52984b = a(i10);
        }

        public void g(@p0 c cVar) {
            this.f52984b = cVar;
        }

        public void h(int i10) {
            this.f52983a = i10;
        }

        public void i(Interpolator interpolator) {
            this.f52985c = interpolator;
        }
    }

    public static class ScrollingViewBehavior extends HeaderScrollingViewBehavior {
        public ScrollingViewBehavior() {
        }

        public ScrollingViewBehavior(Context context, AttributeSet attributeSet) {
            super(context, attributeSet);
            TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, R.styleable.f52841h1);
            Z(typedArrayObtainStyledAttributes.getDimensionPixelSize(R.styleable.ScrollingViewBehavior_Layout_behavior_overlapTop, 0));
            typedArrayObtainStyledAttributes.recycle();
        }

        private static int c0(@n0 AppBarLayout appBarLayout) {
            CoordinatorLayout.Behavior behaviorF = ((CoordinatorLayout.f) appBarLayout.getLayoutParams()).f();
            if (behaviorF instanceof BaseBehavior) {
                return ((BaseBehavior) behaviorF).X();
            }
            return 0;
        }

        private void d0(@n0 View view, @n0 View view2) {
            CoordinatorLayout.Behavior behaviorF = ((CoordinatorLayout.f) view2.getLayoutParams()).f();
            if (behaviorF instanceof BaseBehavior) {
                j1.f1(view, (((view2.getBottom() - view.getTop()) + ((BaseBehavior) behaviorF).f52947q) + X()) - T(view2));
            }
        }

        private void e0(View view, View view2) {
            if (view2 instanceof AppBarLayout) {
                AppBarLayout appBarLayout = (AppBarLayout) view2;
                if (appBarLayout.r()) {
                    appBarLayout.F(appBarLayout.I(view));
                }
            }
        }

        @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.Behavior
        public boolean A(@n0 CoordinatorLayout coordinatorLayout, @n0 View view, @n0 Rect rect, boolean z10) {
            AppBarLayout appBarLayoutS = S(coordinatorLayout.s(view));
            if (appBarLayoutS != null) {
                Rect rect2 = new Rect(rect);
                rect2.offset(view.getLeft(), view.getTop());
                Rect rect3 = this.f53035i;
                rect3.set(0, 0, coordinatorLayout.getWidth(), coordinatorLayout.getHeight());
                if (!rect3.contains(rect2)) {
                    appBarLayoutS.setExpanded(false, !z10);
                    return true;
                }
            }
            return false;
        }

        @Override // com.google.android.material.appbar.ViewOffsetBehavior
        public /* bridge */ /* synthetic */ int J() {
            return super.J();
        }

        @Override // com.google.android.material.appbar.ViewOffsetBehavior
        public /* bridge */ /* synthetic */ int K() {
            return super.K();
        }

        @Override // com.google.android.material.appbar.ViewOffsetBehavior
        public /* bridge */ /* synthetic */ boolean L() {
            return super.L();
        }

        @Override // com.google.android.material.appbar.ViewOffsetBehavior
        public /* bridge */ /* synthetic */ boolean M() {
            return super.M();
        }

        @Override // com.google.android.material.appbar.ViewOffsetBehavior
        public /* bridge */ /* synthetic */ void O(boolean z10) {
            super.O(z10);
        }

        @Override // com.google.android.material.appbar.ViewOffsetBehavior
        public /* bridge */ /* synthetic */ boolean P(int i10) {
            return super.P(i10);
        }

        @Override // com.google.android.material.appbar.ViewOffsetBehavior
        public /* bridge */ /* synthetic */ boolean Q(int i10) {
            return super.Q(i10);
        }

        @Override // com.google.android.material.appbar.ViewOffsetBehavior
        public /* bridge */ /* synthetic */ void R(boolean z10) {
            super.R(z10);
        }

        @Override // com.google.android.material.appbar.HeaderScrollingViewBehavior
        float U(View view) {
            int i10;
            if (view instanceof AppBarLayout) {
                AppBarLayout appBarLayout = (AppBarLayout) view;
                int totalScrollRange = appBarLayout.getTotalScrollRange();
                int downNestedPreScrollRange = appBarLayout.getDownNestedPreScrollRange();
                int iC0 = c0(appBarLayout);
                if ((downNestedPreScrollRange == 0 || totalScrollRange + iC0 > downNestedPreScrollRange) && (i10 = totalScrollRange - downNestedPreScrollRange) != 0) {
                    return (iC0 / i10) + 1.0f;
                }
            }
            return 0.0f;
        }

        @Override // com.google.android.material.appbar.HeaderScrollingViewBehavior
        int W(View view) {
            return view instanceof AppBarLayout ? ((AppBarLayout) view).getTotalScrollRange() : super.W(view);
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        @Override // com.google.android.material.appbar.HeaderScrollingViewBehavior
        @p0
        /* JADX INFO: renamed from: b0, reason: merged with bridge method [inline-methods] */
        public AppBarLayout S(@n0 List<View> list) {
            int size = list.size();
            for (int i10 = 0; i10 < size; i10++) {
                View view = list.get(i10);
                if (view instanceof AppBarLayout) {
                    return (AppBarLayout) view;
                }
            }
            return null;
        }

        @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.Behavior
        public boolean i(CoordinatorLayout coordinatorLayout, View view, View view2) {
            return view2 instanceof AppBarLayout;
        }

        @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.Behavior
        public boolean l(@n0 CoordinatorLayout coordinatorLayout, @n0 View view, @n0 View view2) {
            d0(view, view2);
            e0(view, view2);
            return false;
        }

        @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.Behavior
        public void m(@n0 CoordinatorLayout coordinatorLayout, @n0 View view, @n0 View view2) {
            if (view2 instanceof AppBarLayout) {
                j1.r1(coordinatorLayout, a0.a.f21388r.b());
                j1.r1(coordinatorLayout, a0.a.f21389s.b());
                j1.B1(coordinatorLayout, null);
            }
        }

        @Override // com.google.android.material.appbar.ViewOffsetBehavior, androidx.coordinatorlayout.widget.CoordinatorLayout.Behavior
        public /* bridge */ /* synthetic */ boolean p(@n0 CoordinatorLayout coordinatorLayout, @n0 View view, int i10) {
            return super.p(coordinatorLayout, view, i10);
        }

        @Override // com.google.android.material.appbar.HeaderScrollingViewBehavior, androidx.coordinatorlayout.widget.CoordinatorLayout.Behavior
        public /* bridge */ /* synthetic */ boolean q(@n0 CoordinatorLayout coordinatorLayout, @n0 View view, int i10, int i11, int i12, int i13) {
            return super.q(coordinatorLayout, view, i10, i11, i12, i13);
        }
    }

    public class a implements z0 {
        a() {
        }

        @Override // androidx.core.view.z0
        public n3 a(View view, n3 n3Var) {
            return AppBarLayout.this.w(n3Var);
        }
    }

    public interface b<T extends AppBarLayout> {
        void a(T t10, int i10);
    }

    public static abstract class c {
        public abstract void a(@n0 AppBarLayout appBarLayout, @n0 View view, float f10);
    }

    public static class d extends c {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private static final float f52987c = 0.3f;

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final Rect f52988a = new Rect();

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final Rect f52989b = new Rect();

        private static void b(Rect rect, AppBarLayout appBarLayout, View view) {
            view.getDrawingRect(rect);
            appBarLayout.offsetDescendantRectToMyCoords(view, rect);
            rect.offset(0, -appBarLayout.getTopInset());
        }

        @Override // com.google.android.material.appbar.AppBarLayout.c
        public void a(@n0 AppBarLayout appBarLayout, @n0 View view, float f10) {
            b(this.f52988a, appBarLayout, view);
            float fAbs = this.f52988a.top - Math.abs(f10);
            if (fAbs > 0.0f) {
                j1.M1(view, null);
                view.setTranslationY(0.0f);
                return;
            }
            float fD = 1.0f - a2.a.d(Math.abs(fAbs / this.f52988a.height()), 0.0f, 1.0f);
            float fHeight = (-fAbs) - ((this.f52988a.height() * 0.3f) * (1.0f - (fD * fD)));
            view.setTranslationY(fHeight);
            view.getDrawingRect(this.f52989b);
            this.f52989b.offset(0, (int) (-fHeight));
            j1.M1(view, this.f52989b);
        }
    }

    public interface e {
        void a(@r float f10, @l int i10);
    }

    public interface f extends b<AppBarLayout> {
        @Override // com.google.android.material.appbar.AppBarLayout.b
        void a(AppBarLayout appBarLayout, int i10);
    }

    public AppBarLayout(@n0 Context context) {
        this(context, null);
    }

    public AppBarLayout(@n0 Context context, @p0 AttributeSet attributeSet) {
        this(context, attributeSet, R.attr.appBarLayoutStyle);
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public AppBarLayout(@n0 Context context, @p0 AttributeSet attributeSet, int i10) {
        int i11 = E;
        super(j9.a.c(context, attributeSet, i10, i11), attributeSet, i10);
        this.f52922c = -1;
        this.f52923d = -1;
        this.f52924e = -1;
        this.f52926g = 0;
        this.f52938s = new ArrayList();
        Context context2 = getContext();
        setOrientation(1);
        int i12 = Build.VERSION.SDK_INT;
        if (getOutlineProvider() == ViewOutlineProvider.BACKGROUND) {
            j.a(this);
        }
        j.c(this, attributeSet, i10, i11);
        TypedArray typedArrayK = c0.k(context2, attributeSet, R.styleable.f52848k, i10, i11, new int[0]);
        j1.I1(this, typedArrayK.getDrawable(R.styleable.AppBarLayout_android_background));
        ColorStateList colorStateListA = com.google.android.material.resources.c.a(context2, typedArrayK, R.styleable.AppBarLayout_liftOnScrollColor);
        this.f52935p = colorStateListA;
        if (getBackground() instanceof ColorDrawable) {
            ColorDrawable colorDrawable = (ColorDrawable) getBackground();
            k kVar = new k();
            kVar.o0(ColorStateList.valueOf(colorDrawable.getColor()));
            if (colorStateListA != null) {
                o(kVar);
            } else {
                p(context2, kVar);
            }
            j1.I1(this, kVar);
        }
        this.f52939t = i9.a.f(context2, R.attr.motionDurationMedium2, getResources().getInteger(R.integer.app_bar_elevation_anim_duration));
        this.f52940u = i9.a.g(context2, R.attr.motionEasingStandardInterpolator, com.google.android.material.animation.b.f52896a);
        int i13 = R.styleable.AppBarLayout_expanded;
        if (typedArrayK.hasValue(i13)) {
            B(typedArrayK.getBoolean(i13, false), false, false);
        }
        int i14 = R.styleable.AppBarLayout_elevation;
        if (typedArrayK.hasValue(i14)) {
            j.b(this, typedArrayK.getDimensionPixelSize(i14, 0));
        }
        if (i12 >= 26) {
            int i15 = R.styleable.AppBarLayout_android_keyboardNavigationCluster;
            if (typedArrayK.hasValue(i15)) {
                setKeyboardNavigationCluster(typedArrayK.getBoolean(i15, false));
            }
            int i16 = R.styleable.AppBarLayout_android_touchscreenBlocksFocus;
            if (typedArrayK.hasValue(i16)) {
                setTouchscreenBlocksFocus(typedArrayK.getBoolean(i16, false));
            }
        }
        this.f52943x = getResources().getDimension(R.dimen.design_appbar_elevation);
        this.f52932m = typedArrayK.getBoolean(R.styleable.AppBarLayout_liftOnScroll, false);
        this.f52933n = typedArrayK.getResourceId(R.styleable.AppBarLayout_liftOnScrollTargetViewId, -1);
        setStatusBarForeground(typedArrayK.getDrawable(R.styleable.AppBarLayout_statusBarForeground));
        typedArrayK.recycle();
        j1.a2(this, new a());
    }

    private void B(boolean z10, boolean z11, boolean z12) {
        this.f52926g = (z10 ? 1 : 2) | (z11 ? 4 : 0) | (z12 ? 8 : 0);
        requestLayout();
    }

    private boolean D(boolean z10) {
        if (this.f52930k == z10) {
            return false;
        }
        this.f52930k = z10;
        refreshDrawableState();
        return true;
    }

    private boolean H() {
        return this.f52942w != null && getTopInset() > 0;
    }

    private boolean J() {
        if (getChildCount() <= 0) {
            return false;
        }
        View childAt = getChildAt(0);
        return (childAt.getVisibility() == 8 || j1.U(childAt)) ? false : true;
    }

    private void K(float f10, float f11) {
        ValueAnimator valueAnimator = this.f52936q;
        if (valueAnimator != null) {
            valueAnimator.cancel();
        }
        ValueAnimator valueAnimatorOfFloat = ValueAnimator.ofFloat(f10, f11);
        this.f52936q = valueAnimatorOfFloat;
        valueAnimatorOfFloat.setDuration(this.f52939t);
        this.f52936q.setInterpolator(this.f52940u);
        ValueAnimator.AnimatorUpdateListener animatorUpdateListener = this.f52937r;
        if (animatorUpdateListener != null) {
            this.f52936q.addUpdateListener(animatorUpdateListener);
        }
        this.f52936q.start();
    }

    private void L() {
        setWillNotDraw(!H());
    }

    private void g() {
        WeakReference<View> weakReference = this.f52934o;
        if (weakReference != null) {
            weakReference.clear();
        }
        this.f52934o = null;
    }

    @p0
    private View h(@p0 View view) {
        int i10;
        if (this.f52934o == null && (i10 = this.f52933n) != -1) {
            View viewFindViewById = view != null ? view.findViewById(i10) : null;
            if (viewFindViewById == null && (getParent() instanceof ViewGroup)) {
                viewFindViewById = ((ViewGroup) getParent()).findViewById(this.f52933n);
            }
            if (viewFindViewById != null) {
                this.f52934o = new WeakReference<>(viewFindViewById);
            }
        }
        WeakReference<View> weakReference = this.f52934o;
        if (weakReference != null) {
            return weakReference.get();
        }
        return null;
    }

    private boolean m() {
        int childCount = getChildCount();
        for (int i10 = 0; i10 < childCount; i10++) {
            if (((LayoutParams) getChildAt(i10).getLayoutParams()).e()) {
                return true;
            }
        }
        return false;
    }

    private void o(final k kVar) {
        kVar.setAlpha(this.f52931l ? 255 : 0);
        kVar.o0(this.f52935p);
        this.f52937r = new ValueAnimator.AnimatorUpdateListener() { // from class: com.google.android.material.appbar.a
            @Override // android.animation.ValueAnimator.AnimatorUpdateListener
            public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                this.f53045b.t(kVar, valueAnimator);
            }
        };
    }

    private void p(Context context, final k kVar) {
        kVar.Z(context);
        this.f52937r = new ValueAnimator.AnimatorUpdateListener() { // from class: com.google.android.material.appbar.b
            @Override // android.animation.ValueAnimator.AnimatorUpdateListener
            public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                this.f53047b.u(kVar, valueAnimator);
            }
        };
    }

    private void q() {
        Behavior behavior = this.f52944y;
        BaseBehavior.SavedState savedStateK0 = (behavior == null || this.f52922c == -1 || this.f52926g != 0) ? null : behavior.K0(AbsSavedState.EMPTY_STATE, this);
        this.f52922c = -1;
        this.f52923d = -1;
        this.f52924e = -1;
        if (savedStateK0 != null) {
            this.f52944y.J0(savedStateK0, false);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void t(k kVar, ValueAnimator valueAnimator) {
        int iFloatValue = (int) ((Float) valueAnimator.getAnimatedValue()).floatValue();
        kVar.setAlpha(iFloatValue);
        for (e eVar : this.f52938s) {
            if (kVar.y() != null) {
                eVar.a(0.0f, kVar.y().withAlpha(iFloatValue).getDefaultColor());
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void u(k kVar, ValueAnimator valueAnimator) {
        float fFloatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
        kVar.n0(fFloatValue);
        Drawable drawable = this.f52942w;
        if (drawable instanceof k) {
            ((k) drawable).n0(fFloatValue);
        }
        Iterator<e> it = this.f52938s.iterator();
        while (it.hasNext()) {
            it.next().a(fFloatValue, kVar.D());
        }
    }

    void A() {
        this.f52926g = 0;
    }

    public boolean C(boolean z10) {
        this.f52929j = true;
        return D(z10);
    }

    public boolean E(boolean z10) {
        return G(z10, true);
    }

    boolean F(boolean z10) {
        return G(z10, !this.f52929j);
    }

    boolean G(boolean z10, boolean z11) {
        if (!z11 || this.f52931l == z10) {
            return false;
        }
        this.f52931l = z10;
        refreshDrawableState();
        if (!this.f52932m || !(getBackground() instanceof k)) {
            return true;
        }
        if (this.f52935p != null) {
            K(z10 ? 0.0f : 255.0f, z10 ? 255.0f : 0.0f);
            return true;
        }
        K(z10 ? 0.0f : this.f52943x, z10 ? this.f52943x : 0.0f);
        return true;
    }

    boolean I(@p0 View view) {
        View viewH = h(view);
        if (viewH != null) {
            view = viewH;
        }
        return view != null && (view.canScrollVertically(-1) || view.getScrollY() > 0);
    }

    public void c(@n0 e eVar) {
        this.f52938s.add(eVar);
    }

    @Override // android.widget.LinearLayout, android.view.ViewGroup
    protected boolean checkLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return layoutParams instanceof LayoutParams;
    }

    public void d(@p0 b bVar) {
        if (this.f52928i == null) {
            this.f52928i = new ArrayList();
        }
        if (bVar == null || this.f52928i.contains(bVar)) {
            return;
        }
        this.f52928i.add(bVar);
    }

    @Override // android.view.View
    public void draw(@n0 Canvas canvas) {
        super.draw(canvas);
        if (H()) {
            int iSave = canvas.save();
            canvas.translate(0.0f, -this.f52921b);
            this.f52942w.draw(canvas);
            canvas.restoreToCount(iSave);
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    protected void drawableStateChanged() {
        super.drawableStateChanged();
        int[] drawableState = getDrawableState();
        Drawable drawable = this.f52942w;
        if (drawable != null && drawable.isStateful() && drawable.setState(drawableState)) {
            invalidateDrawable(drawable);
        }
    }

    public void e(f fVar) {
        d(fVar);
    }

    public void f() {
        this.f52938s.clear();
    }

    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.b
    @n0
    public CoordinatorLayout.Behavior<AppBarLayout> getBehavior() {
        Behavior behavior = new Behavior();
        this.f52944y = behavior;
        return behavior;
    }

    int getDownNestedPreScrollRange() {
        int iMin;
        int iE0;
        int i10 = this.f52923d;
        if (i10 != -1) {
            return i10;
        }
        int i11 = 0;
        for (int childCount = getChildCount() - 1; childCount >= 0; childCount--) {
            View childAt = getChildAt(childCount);
            if (childAt.getVisibility() != 8) {
                LayoutParams layoutParams = (LayoutParams) childAt.getLayoutParams();
                int measuredHeight = childAt.getMeasuredHeight();
                int i12 = layoutParams.f52983a;
                if ((i12 & 5) != 5) {
                    if (i11 > 0) {
                        break;
                    }
                } else {
                    int i13 = ((LinearLayout.LayoutParams) layoutParams).topMargin + ((LinearLayout.LayoutParams) layoutParams).bottomMargin;
                    if ((i12 & 8) != 0) {
                        iE0 = j1.e0(childAt);
                    } else {
                        if ((i12 & 2) != 0) {
                            iE0 = measuredHeight - j1.e0(childAt);
                        } else {
                            iMin = i13 + measuredHeight;
                        }
                        if (childCount == 0 && j1.U(childAt)) {
                            iMin = Math.min(iMin, measuredHeight - getTopInset());
                        }
                        i11 += iMin;
                    }
                    iMin = i13 + iE0;
                    if (childCount == 0) {
                        iMin = Math.min(iMin, measuredHeight - getTopInset());
                    }
                    i11 += iMin;
                }
            }
        }
        int iMax = Math.max(0, i11);
        this.f52923d = iMax;
        return iMax;
    }

    int getDownNestedScrollRange() {
        int i10 = this.f52924e;
        if (i10 != -1) {
            return i10;
        }
        int childCount = getChildCount();
        int iE0 = 0;
        for (int i11 = 0; i11 < childCount; i11++) {
            View childAt = getChildAt(i11);
            if (childAt.getVisibility() != 8) {
                LayoutParams layoutParams = (LayoutParams) childAt.getLayoutParams();
                int measuredHeight = childAt.getMeasuredHeight() + ((LinearLayout.LayoutParams) layoutParams).topMargin + ((LinearLayout.LayoutParams) layoutParams).bottomMargin;
                int i12 = layoutParams.f52983a;
                if ((i12 & 1) == 0) {
                    break;
                }
                iE0 += measuredHeight;
                if ((i12 & 2) != 0) {
                    iE0 -= j1.e0(childAt);
                    break;
                }
            }
        }
        int iMax = Math.max(0, iE0);
        this.f52924e = iMax;
        return iMax;
    }

    @d0
    public int getLiftOnScrollTargetViewId() {
        return this.f52933n;
    }

    public final int getMinimumHeightForVisibleOverlappingContent() {
        int topInset = getTopInset();
        int iE0 = j1.e0(this);
        if (iE0 == 0) {
            int childCount = getChildCount();
            iE0 = childCount >= 1 ? j1.e0(getChildAt(childCount - 1)) : 0;
            if (iE0 == 0) {
                return getHeight() / 3;
            }
        }
        return (iE0 * 2) + topInset;
    }

    int getPendingAction() {
        return this.f52926g;
    }

    @p0
    public Drawable getStatusBarForeground() {
        return this.f52942w;
    }

    @Deprecated
    public float getTargetElevation() {
        return 0.0f;
    }

    @androidx.annotation.j1
    final int getTopInset() {
        n3 n3Var = this.f52927h;
        if (n3Var != null) {
            return n3Var.r();
        }
        return 0;
    }

    public final int getTotalScrollRange() {
        int i10 = this.f52922c;
        if (i10 != -1) {
            return i10;
        }
        int childCount = getChildCount();
        int iE0 = 0;
        for (int i11 = 0; i11 < childCount; i11++) {
            View childAt = getChildAt(i11);
            if (childAt.getVisibility() != 8) {
                LayoutParams layoutParams = (LayoutParams) childAt.getLayoutParams();
                int measuredHeight = childAt.getMeasuredHeight();
                int i12 = layoutParams.f52983a;
                if ((i12 & 1) == 0) {
                    break;
                }
                iE0 += measuredHeight + ((LinearLayout.LayoutParams) layoutParams).topMargin + ((LinearLayout.LayoutParams) layoutParams).bottomMargin;
                if (i11 == 0 && j1.U(childAt)) {
                    iE0 -= getTopInset();
                }
                if ((i12 & 2) != 0) {
                    iE0 -= j1.e0(childAt);
                    break;
                }
            }
        }
        int iMax = Math.max(0, iE0);
        this.f52922c = iMax;
        return iMax;
    }

    int getUpNestedPreScrollRange() {
        return getTotalScrollRange();
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // android.widget.LinearLayout, android.view.ViewGroup
    /* JADX INFO: renamed from: i, reason: merged with bridge method [inline-methods] */
    public LayoutParams generateDefaultLayoutParams() {
        return new LayoutParams(-1, -2);
    }

    @Override // android.widget.LinearLayout, android.view.ViewGroup
    /* JADX INFO: renamed from: j, reason: merged with bridge method [inline-methods] */
    public LayoutParams generateLayoutParams(AttributeSet attributeSet) {
        return new LayoutParams(getContext(), attributeSet);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // android.widget.LinearLayout, android.view.ViewGroup
    /* JADX INFO: renamed from: k, reason: merged with bridge method [inline-methods] */
    public LayoutParams generateLayoutParams(ViewGroup.LayoutParams layoutParams) {
        if (layoutParams instanceof LinearLayout.LayoutParams) {
            return new LayoutParams((LinearLayout.LayoutParams) layoutParams);
        }
        return layoutParams instanceof ViewGroup.MarginLayoutParams ? new LayoutParams((ViewGroup.MarginLayoutParams) layoutParams) : new LayoutParams(layoutParams);
    }

    boolean l() {
        return this.f52925f;
    }

    boolean n() {
        return getTotalScrollRange() != 0;
    }

    @Override // android.view.ViewGroup, android.view.View
    protected void onAttachedToWindow() {
        super.onAttachedToWindow();
        com.google.android.material.shape.l.e(this);
    }

    @Override // android.view.ViewGroup, android.view.View
    protected int[] onCreateDrawableState(int i10) {
        if (this.f52941v == null) {
            this.f52941v = new int[4];
        }
        int[] iArr = this.f52941v;
        int[] iArrOnCreateDrawableState = super.onCreateDrawableState(i10 + iArr.length);
        boolean z10 = this.f52930k;
        int i11 = R.attr.state_liftable;
        if (!z10) {
            i11 = -i11;
        }
        iArr[0] = i11;
        iArr[1] = (z10 && this.f52931l) ? R.attr.state_lifted : -R.attr.state_lifted;
        int i12 = R.attr.state_collapsible;
        if (!z10) {
            i12 = -i12;
        }
        iArr[2] = i12;
        iArr[3] = (z10 && this.f52931l) ? R.attr.state_collapsed : -R.attr.state_collapsed;
        return View.mergeDrawableStates(iArrOnCreateDrawableState, iArr);
    }

    @Override // android.view.ViewGroup, android.view.View
    protected void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        g();
    }

    @Override // android.widget.LinearLayout, android.view.ViewGroup, android.view.View
    protected void onLayout(boolean z10, int i10, int i11, int i12, int i13) {
        super.onLayout(z10, i10, i11, i12, i13);
        boolean z11 = true;
        if (j1.U(this) && J()) {
            int topInset = getTopInset();
            for (int childCount = getChildCount() - 1; childCount >= 0; childCount--) {
                j1.f1(getChildAt(childCount), topInset);
            }
        }
        q();
        this.f52925f = false;
        int childCount2 = getChildCount();
        for (int i14 = 0; i14 < childCount2; i14++) {
            if (((LayoutParams) getChildAt(i14).getLayoutParams()).d() != null) {
                this.f52925f = true;
                break;
            }
        }
        Drawable drawable = this.f52942w;
        if (drawable != null) {
            drawable.setBounds(0, 0, getWidth(), getTopInset());
        }
        if (this.f52929j) {
            return;
        }
        if (!this.f52932m && !m()) {
            z11 = false;
        }
        D(z11);
    }

    @Override // android.widget.LinearLayout, android.view.View
    protected void onMeasure(int i10, int i11) {
        super.onMeasure(i10, i11);
        int mode = View.MeasureSpec.getMode(i11);
        if (mode != 1073741824 && j1.U(this) && J()) {
            int measuredHeight = getMeasuredHeight();
            if (mode == Integer.MIN_VALUE) {
                measuredHeight = a2.a.e(getMeasuredHeight() + getTopInset(), 0, View.MeasureSpec.getSize(i11));
            } else if (mode == 0) {
                measuredHeight += getTopInset();
            }
            setMeasuredDimension(getMeasuredWidth(), measuredHeight);
        }
        q();
    }

    public boolean r() {
        return this.f52932m;
    }

    public boolean s() {
        return this.f52931l;
    }

    @Override // android.view.View
    @w0(21)
    public void setElevation(float f10) {
        super.setElevation(f10);
        com.google.android.material.shape.l.d(this, f10);
    }

    public void setExpanded(boolean z10) {
        setExpanded(z10, j1.U0(this));
    }

    public void setExpanded(boolean z10, boolean z11) {
        B(z10, z11, true);
    }

    public void setLiftOnScroll(boolean z10) {
        this.f52932m = z10;
    }

    public void setLiftOnScrollTargetView(@p0 View view) {
        this.f52933n = -1;
        if (view == null) {
            g();
        } else {
            this.f52934o = new WeakReference<>(view);
        }
    }

    public void setLiftOnScrollTargetViewId(@d0 int i10) {
        this.f52933n = i10;
        g();
    }

    public void setLiftableOverrideEnabled(boolean z10) {
        this.f52929j = z10;
    }

    @Override // android.widget.LinearLayout
    public void setOrientation(int i10) {
        if (i10 != 1) {
            throw new IllegalArgumentException("AppBarLayout is always vertical and does not support horizontal orientation");
        }
        super.setOrientation(i10);
    }

    public void setStatusBarForeground(@p0 Drawable drawable) {
        Drawable drawable2 = this.f52942w;
        if (drawable2 != drawable) {
            if (drawable2 != null) {
                drawable2.setCallback(null);
            }
            Drawable drawableMutate = drawable != null ? drawable.mutate() : null;
            this.f52942w = drawableMutate;
            if (drawableMutate != null) {
                if (drawableMutate.isStateful()) {
                    this.f52942w.setState(getDrawableState());
                }
                androidx.core.graphics.drawable.d.m(this.f52942w, j1.Z(this));
                this.f52942w.setVisible(getVisibility() == 0, false);
                this.f52942w.setCallback(this);
            }
            L();
            j1.n1(this);
        }
    }

    public void setStatusBarForegroundColor(@l int i10) {
        setStatusBarForeground(new ColorDrawable(i10));
    }

    public void setStatusBarForegroundResource(@v int i10) {
        setStatusBarForeground(b0.a.b(getContext(), i10));
    }

    @Deprecated
    public void setTargetElevation(float f10) {
        j.b(this, f10);
    }

    @Override // android.view.View
    public void setVisibility(int i10) {
        super.setVisibility(i10);
        boolean z10 = i10 == 0;
        Drawable drawable = this.f52942w;
        if (drawable != null) {
            drawable.setVisible(z10, false);
        }
    }

    void v(int i10) {
        this.f52921b = i10;
        if (!willNotDraw()) {
            j1.n1(this);
        }
        List<b> list = this.f52928i;
        if (list != null) {
            int size = list.size();
            for (int i11 = 0; i11 < size; i11++) {
                b bVar = this.f52928i.get(i11);
                if (bVar != null) {
                    bVar.a(this, i10);
                }
            }
        }
    }

    @Override // android.view.View
    protected boolean verifyDrawable(@n0 Drawable drawable) {
        return super.verifyDrawable(drawable) || drawable == this.f52942w;
    }

    n3 w(n3 n3Var) {
        n3 n3Var2 = j1.U(this) ? n3Var : null;
        if (!androidx.core.util.j.a(this.f52927h, n3Var2)) {
            this.f52927h = n3Var2;
            L();
            requestLayout();
        }
        return n3Var;
    }

    public boolean x(@n0 e eVar) {
        return this.f52938s.remove(eVar);
    }

    public void y(@p0 b bVar) {
        List<b> list = this.f52928i;
        if (list == null || bVar == null) {
            return;
        }
        list.remove(bVar);
    }

    public void z(f fVar) {
        y(fVar);
    }
}
