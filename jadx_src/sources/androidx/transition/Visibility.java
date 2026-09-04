package androidx.transition;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.annotation.SuppressLint;
import android.content.Context;
import android.content.res.TypedArray;
import android.content.res.XmlResourceParser;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import androidx.annotation.RestrictTo;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;

/* JADX INFO: loaded from: classes6.dex */
public abstract class Visibility extends Transition {
    private static final String Z = "android:visibility:screenLocation";

    /* JADX INFO: renamed from: a0, reason: collision with root package name */
    public static final int f27803a0 = 1;

    /* JADX INFO: renamed from: b0, reason: collision with root package name */
    public static final int f27804b0 = 2;
    private int W;
    static final String X = "android:visibility:visibility";
    private static final String Y = "android:visibility:parent";

    /* JADX INFO: renamed from: c0, reason: collision with root package name */
    private static final String[] f27805c0 = {X, Y};

    public class a extends u {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ ViewGroup f27806b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ View f27807c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        final /* synthetic */ View f27808d;

        a(ViewGroup viewGroup, View view, View view2) {
            this.f27806b = viewGroup;
            this.f27807c = view;
            this.f27808d = view2;
        }

        @Override // androidx.transition.u, androidx.transition.Transition.h
        public void a(@androidx.annotation.n0 Transition transition) {
            if (this.f27807c.getParent() == null) {
                h0.b(this.f27806b).c(this.f27807c);
            } else {
                Visibility.this.cancel();
            }
        }

        @Override // androidx.transition.u, androidx.transition.Transition.h
        public void c(@androidx.annotation.n0 Transition transition) {
            h0.b(this.f27806b).d(this.f27807c);
        }

        @Override // androidx.transition.u, androidx.transition.Transition.h
        public void d(@androidx.annotation.n0 Transition transition) {
            this.f27808d.setTag(R.id.save_overlay_view, null);
            h0.b(this.f27806b).d(this.f27807c);
            transition.n0(this);
        }
    }

    public static class b extends AnimatorListenerAdapter implements Transition.h, androidx.transition.a.InterfaceC0220a {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final View f27810b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private final int f27811c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private final ViewGroup f27812d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        private final boolean f27813e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        private boolean f27814f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        boolean f27815g = false;

        b(View view, int i10, boolean z10) {
            this.f27810b = view;
            this.f27811c = i10;
            this.f27812d = (ViewGroup) view.getParent();
            this.f27813e = z10;
            g(true);
        }

        private void f() {
            if (!this.f27815g) {
                l0.i(this.f27810b, this.f27811c);
                ViewGroup viewGroup = this.f27812d;
                if (viewGroup != null) {
                    viewGroup.invalidate();
                }
            }
            g(false);
        }

        private void g(boolean z10) {
            ViewGroup viewGroup;
            if (!this.f27813e || this.f27814f == z10 || (viewGroup = this.f27812d) == null) {
                return;
            }
            this.f27814f = z10;
            h0.d(viewGroup, z10);
        }

        @Override // androidx.transition.Transition.h
        public void a(@androidx.annotation.n0 Transition transition) {
            g(true);
        }

        @Override // androidx.transition.Transition.h
        public void b(@androidx.annotation.n0 Transition transition) {
        }

        @Override // androidx.transition.Transition.h
        public void c(@androidx.annotation.n0 Transition transition) {
            g(false);
        }

        @Override // androidx.transition.Transition.h
        public void d(@androidx.annotation.n0 Transition transition) {
            f();
            transition.n0(this);
        }

        @Override // androidx.transition.Transition.h
        public void e(@androidx.annotation.n0 Transition transition) {
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationCancel(Animator animator) {
            this.f27815g = true;
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationEnd(Animator animator) {
            f();
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorPauseListener, androidx.transition.a.InterfaceC0220a
        public void onAnimationPause(Animator animator) {
            if (this.f27815g) {
                return;
            }
            l0.i(this.f27810b, this.f27811c);
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationRepeat(Animator animator) {
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorPauseListener, androidx.transition.a.InterfaceC0220a
        public void onAnimationResume(Animator animator) {
            if (this.f27815g) {
                return;
            }
            l0.i(this.f27810b, 0);
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationStart(Animator animator) {
        }
    }

    @SuppressLint({"UniqueConstants"})
    @Retention(RetentionPolicy.SOURCE)
    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP_PREFIX})
    public @interface c {
    }

    public static class d {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        boolean f27816a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        boolean f27817b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        int f27818c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        int f27819d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        ViewGroup f27820e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        ViewGroup f27821f;

        d() {
        }
    }

    public Visibility() {
        this.W = 3;
    }

    @SuppressLint({"RestrictedApi"})
    public Visibility(@androidx.annotation.n0 Context context, @androidx.annotation.n0 AttributeSet attributeSet) {
        super(context, attributeSet);
        this.W = 3;
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, s.f27910e);
        int iK = androidx.core.content.res.q.k(typedArrayObtainStyledAttributes, (XmlResourceParser) attributeSet, "transitionVisibilityMode", 0, 0);
        typedArrayObtainStyledAttributes.recycle();
        if (iK != 0) {
            Q0(iK);
        }
    }

    private void I0(z zVar) {
        zVar.f27973a.put(X, Integer.valueOf(zVar.f27974b.getVisibility()));
        zVar.f27973a.put(Y, zVar.f27974b.getParent());
        int[] iArr = new int[2];
        zVar.f27974b.getLocationOnScreen(iArr);
        zVar.f27973a.put(Z, iArr);
    }

    private d K0(z zVar, z zVar2) {
        d dVar = new d();
        dVar.f27816a = false;
        dVar.f27817b = false;
        if (zVar == null || !zVar.f27973a.containsKey(X)) {
            dVar.f27818c = -1;
            dVar.f27820e = null;
        } else {
            dVar.f27818c = ((Integer) zVar.f27973a.get(X)).intValue();
            dVar.f27820e = (ViewGroup) zVar.f27973a.get(Y);
        }
        if (zVar2 == null || !zVar2.f27973a.containsKey(X)) {
            dVar.f27819d = -1;
            dVar.f27821f = null;
        } else {
            dVar.f27819d = ((Integer) zVar2.f27973a.get(X)).intValue();
            dVar.f27821f = (ViewGroup) zVar2.f27973a.get(Y);
        }
        if (zVar != null && zVar2 != null) {
            int i10 = dVar.f27818c;
            int i11 = dVar.f27819d;
            if (i10 == i11 && dVar.f27820e == dVar.f27821f) {
                return dVar;
            }
            if (i10 != i11) {
                if (i10 == 0) {
                    dVar.f27817b = false;
                    dVar.f27816a = true;
                } else if (i11 == 0) {
                    dVar.f27817b = true;
                    dVar.f27816a = true;
                }
            } else if (dVar.f27821f == null) {
                dVar.f27817b = false;
                dVar.f27816a = true;
            } else if (dVar.f27820e == null) {
                dVar.f27817b = true;
                dVar.f27816a = true;
            }
        } else if (zVar == null && dVar.f27819d == 0) {
            dVar.f27817b = true;
            dVar.f27816a = true;
        } else if (zVar2 == null && dVar.f27818c == 0) {
            dVar.f27817b = false;
            dVar.f27816a = true;
        }
        return dVar;
    }

    public int J0() {
        return this.W;
    }

    public boolean L0(z zVar) {
        if (zVar == null) {
            return false;
        }
        return ((Integer) zVar.f27973a.get(X)).intValue() == 0 && ((View) zVar.f27973a.get(Y)) != null;
    }

    @androidx.annotation.p0
    public Animator M0(ViewGroup viewGroup, View view, z zVar, z zVar2) {
        return null;
    }

    @androidx.annotation.p0
    public Animator N0(ViewGroup viewGroup, z zVar, int i10, z zVar2, int i11) {
        if ((this.W & 1) != 1 || zVar2 == null) {
            return null;
        }
        if (zVar == null) {
            View view = (View) zVar2.f27974b.getParent();
            if (K0(M(view, false), Z(view, false)).f27816a) {
                return null;
            }
        }
        return M0(viewGroup, zVar2.f27974b, zVar, zVar2);
    }

    @androidx.annotation.p0
    public Animator O0(ViewGroup viewGroup, View view, z zVar, z zVar2) {
        return null;
    }

    /* JADX WARN: Code duplicated, block: B:25:0x0045  */
    @androidx.annotation.p0
    public Animator P0(ViewGroup viewGroup, z zVar, int i10, z zVar2, int i11) {
        View view;
        boolean z10;
        boolean z11;
        View view2;
        if ((this.W & 2) != 2 || zVar == null) {
            return null;
        }
        View view3 = zVar.f27974b;
        View viewA = zVar2 != null ? zVar2.f27974b : null;
        int i12 = R.id.save_overlay_view;
        View view4 = (View) view3.getTag(i12);
        if (view4 != null) {
            view2 = null;
            z11 = true;
        } else {
            if (viewA == null || viewA.getParent() == null) {
                if (viewA != null) {
                    view = null;
                    z10 = false;
                } else {
                    viewA = null;
                    view = null;
                    z10 = true;
                }
            } else if (i11 == 4 || view3 == viewA) {
                view = viewA;
                z10 = false;
                viewA = null;
            } else {
                viewA = null;
                view = null;
                z10 = true;
            }
            if (z10) {
                if (view3.getParent() != null) {
                    if (view3.getParent() instanceof View) {
                        View view5 = (View) view3.getParent();
                        if (K0(Z(view5, true), M(view5, true)).f27816a) {
                            int id2 = view5.getId();
                            if (view5.getParent() != null || id2 == -1 || viewGroup.findViewById(id2) == null || !this.f27774w) {
                            }
                        } else {
                            viewA = y.a(viewGroup, view3, view5);
                        }
                    }
                    z11 = false;
                    View view6 = view;
                    view4 = viewA;
                    view2 = view6;
                }
                view2 = view;
                z11 = false;
                view4 = view3;
            } else {
                z11 = false;
                View view7 = view;
                view4 = viewA;
                view2 = view7;
            }
        }
        if (view4 == null) {
            if (view2 == null) {
                return null;
            }
            int visibility = view2.getVisibility();
            l0.i(view2, 0);
            Animator animatorO0 = O0(viewGroup, view2, zVar, zVar2);
            if (animatorO0 != null) {
                b bVar = new b(view2, i11, true);
                animatorO0.addListener(bVar);
                androidx.transition.a.a(animatorO0, bVar);
                a(bVar);
            } else {
                l0.i(view2, visibility);
            }
            return animatorO0;
        }
        if (!z11) {
            int[] iArr = (int[]) zVar.f27973a.get(Z);
            int i13 = iArr[0];
            int i14 = iArr[1];
            int[] iArr2 = new int[2];
            viewGroup.getLocationOnScreen(iArr2);
            view4.offsetLeftAndRight((i13 - iArr2[0]) - view4.getLeft());
            view4.offsetTopAndBottom((i14 - iArr2[1]) - view4.getTop());
            h0.b(viewGroup).c(view4);
        }
        Animator animatorO1 = O0(viewGroup, view4, zVar, zVar2);
        if (!z11) {
            if (animatorO1 == null) {
                h0.b(viewGroup).d(view4);
            } else {
                view3.setTag(i12, view4);
                a(new a(viewGroup, view4, view3));
            }
        }
        return animatorO1;
    }

    public void Q0(int i10) {
        if ((i10 & (-4)) != 0) {
            throw new IllegalArgumentException("Only MODE_IN and MODE_OUT flags are allowed");
        }
        this.W = i10;
    }

    @Override // androidx.transition.Transition
    @androidx.annotation.p0
    public String[] Y() {
        return f27805c0;
    }

    @Override // androidx.transition.Transition
    public boolean b0(@androidx.annotation.p0 z zVar, @androidx.annotation.p0 z zVar2) {
        if (zVar == null && zVar2 == null) {
            return false;
        }
        if (zVar != null && zVar2 != null && zVar2.f27973a.containsKey(X) != zVar.f27973a.containsKey(X)) {
            return false;
        }
        d dVarK0 = K0(zVar, zVar2);
        if (dVarK0.f27816a) {
            return dVarK0.f27818c == 0 || dVarK0.f27819d == 0;
        }
        return false;
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
        d dVarK0 = K0(zVar, zVar2);
        if (!dVarK0.f27816a) {
            return null;
        }
        if (dVarK0.f27820e == null && dVarK0.f27821f == null) {
            return null;
        }
        return dVarK0.f27817b ? N0(viewGroup, zVar, dVarK0.f27818c, zVar2, dVarK0.f27819d) : P0(viewGroup, zVar, dVarK0.f27818c, zVar2, dVarK0.f27819d);
    }
}
