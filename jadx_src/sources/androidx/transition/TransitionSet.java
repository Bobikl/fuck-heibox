package androidx.transition;

import android.animation.TimeInterpolator;
import android.annotation.SuppressLint;
import android.content.Context;
import android.content.res.TypedArray;
import android.content.res.XmlResourceParser;
import android.util.AndroidRuntimeException;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import androidx.annotation.RestrictTo;
import java.util.ArrayList;
import java.util.Iterator;

/* JADX INFO: loaded from: classes6.dex */
public class TransitionSet extends Transition {

    /* JADX INFO: renamed from: b0, reason: collision with root package name */
    private static final int f27786b0 = 1;

    /* JADX INFO: renamed from: c0, reason: collision with root package name */
    private static final int f27787c0 = 2;

    /* JADX INFO: renamed from: p1, reason: collision with root package name */
    private static final int f27788p1 = 4;

    /* JADX INFO: renamed from: p2, reason: collision with root package name */
    public static final int f27789p2 = 1;

    /* JADX INFO: renamed from: x1, reason: collision with root package name */
    private static final int f27790x1 = 8;

    /* JADX INFO: renamed from: y1, reason: collision with root package name */
    public static final int f27791y1 = 0;
    private ArrayList<Transition> W;
    private boolean X;
    int Y;
    boolean Z;

    /* JADX INFO: renamed from: a0, reason: collision with root package name */
    private int f27792a0;

    public class a extends u {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ Transition f27793b;

        a(Transition transition) {
            this.f27793b = transition;
        }

        @Override // androidx.transition.u, androidx.transition.Transition.h
        public void d(@androidx.annotation.n0 Transition transition) {
            this.f27793b.u0();
            transition.n0(this);
        }
    }

    public static class b extends u {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        TransitionSet f27795b;

        b(TransitionSet transitionSet) {
            this.f27795b = transitionSet;
        }

        @Override // androidx.transition.u, androidx.transition.Transition.h
        public void b(@androidx.annotation.n0 Transition transition) {
            TransitionSet transitionSet = this.f27795b;
            if (transitionSet.Z) {
                return;
            }
            transitionSet.F0();
            this.f27795b.Z = true;
        }

        @Override // androidx.transition.u, androidx.transition.Transition.h
        public void d(@androidx.annotation.n0 Transition transition) {
            TransitionSet transitionSet = this.f27795b;
            int i10 = transitionSet.Y - 1;
            transitionSet.Y = i10;
            if (i10 == 0) {
                transitionSet.Z = false;
                transitionSet.s();
            }
            transition.n0(this);
        }
    }

    public TransitionSet() {
        this.W = new ArrayList<>();
        this.X = true;
        this.Z = false;
        this.f27792a0 = 0;
    }

    @SuppressLint({"RestrictedApi"})
    public TransitionSet(@androidx.annotation.n0 Context context, @androidx.annotation.n0 AttributeSet attributeSet) {
        super(context, attributeSet);
        this.W = new ArrayList<>();
        this.X = true;
        this.Z = false;
        this.f27792a0 = 0;
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, s.f27914i);
        c1(androidx.core.content.res.q.k(typedArrayObtainStyledAttributes, (XmlResourceParser) attributeSet, "transitionOrdering", 0, 0));
        typedArrayObtainStyledAttributes.recycle();
    }

    private void O0(@androidx.annotation.n0 Transition transition) {
        this.W.add(transition);
        transition.f27770s = this;
    }

    private void e1() {
        b bVar = new b(this);
        Iterator<Transition> it = this.W.iterator();
        while (it.hasNext()) {
            it.next().a(bVar);
        }
        this.Y = this.W.size();
    }

    @Override // androidx.transition.Transition
    public void A0(PathMotion pathMotion) {
        super.A0(pathMotion);
        this.f27792a0 |= 4;
        if (this.W != null) {
            for (int i10 = 0; i10 < this.W.size(); i10++) {
                this.W.get(i10).A0(pathMotion);
            }
        }
    }

    @Override // androidx.transition.Transition
    @androidx.annotation.n0
    public Transition B(@androidx.annotation.n0 Class<?> cls, boolean z10) {
        for (int i10 = 0; i10 < this.W.size(); i10++) {
            this.W.get(i10).B(cls, z10);
        }
        return super.B(cls, z10);
    }

    @Override // androidx.transition.Transition
    public void B0(w wVar) {
        super.B0(wVar);
        this.f27792a0 |= 2;
        int size = this.W.size();
        for (int i10 = 0; i10 < size; i10++) {
            this.W.get(i10).B0(wVar);
        }
    }

    @Override // androidx.transition.Transition
    @androidx.annotation.n0
    public Transition C(@androidx.annotation.n0 String str, boolean z10) {
        for (int i10 = 0; i10 < this.W.size(); i10++) {
            this.W.get(i10).C(str, z10);
        }
        return super.C(str, z10);
    }

    @Override // androidx.transition.Transition
    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP_PREFIX})
    void F(ViewGroup viewGroup) {
        super.F(viewGroup);
        int size = this.W.size();
        for (int i10 = 0; i10 < size; i10++) {
            this.W.get(i10).F(viewGroup);
        }
    }

    @Override // androidx.transition.Transition
    String H0(String str) {
        String strH0 = super.H0(str);
        for (int i10 = 0; i10 < this.W.size(); i10++) {
            StringBuilder sb2 = new StringBuilder();
            sb2.append(strH0);
            sb2.append("\n");
            sb2.append(this.W.get(i10).H0(str + "  "));
            strH0 = sb2.toString();
        }
        return strH0;
    }

    @Override // androidx.transition.Transition
    @androidx.annotation.n0
    /* JADX INFO: renamed from: I0, reason: merged with bridge method [inline-methods] */
    public TransitionSet a(@androidx.annotation.n0 Transition.h hVar) {
        return (TransitionSet) super.a(hVar);
    }

    @Override // androidx.transition.Transition
    @androidx.annotation.n0
    /* JADX INFO: renamed from: J0, reason: merged with bridge method [inline-methods] */
    public TransitionSet b(@androidx.annotation.d0 int i10) {
        for (int i11 = 0; i11 < this.W.size(); i11++) {
            this.W.get(i11).b(i10);
        }
        return (TransitionSet) super.b(i10);
    }

    @Override // androidx.transition.Transition
    @androidx.annotation.n0
    /* JADX INFO: renamed from: K0, reason: merged with bridge method [inline-methods] */
    public TransitionSet c(@androidx.annotation.n0 View view) {
        for (int i10 = 0; i10 < this.W.size(); i10++) {
            this.W.get(i10).c(view);
        }
        return (TransitionSet) super.c(view);
    }

    @Override // androidx.transition.Transition
    @androidx.annotation.n0
    /* JADX INFO: renamed from: L0, reason: merged with bridge method [inline-methods] */
    public TransitionSet d(@androidx.annotation.n0 Class<?> cls) {
        for (int i10 = 0; i10 < this.W.size(); i10++) {
            this.W.get(i10).d(cls);
        }
        return (TransitionSet) super.d(cls);
    }

    @Override // androidx.transition.Transition
    @androidx.annotation.n0
    /* JADX INFO: renamed from: M0, reason: merged with bridge method [inline-methods] */
    public TransitionSet e(@androidx.annotation.n0 String str) {
        for (int i10 = 0; i10 < this.W.size(); i10++) {
            this.W.get(i10).e(str);
        }
        return (TransitionSet) super.e(str);
    }

    @androidx.annotation.n0
    public TransitionSet N0(@androidx.annotation.n0 Transition transition) {
        O0(transition);
        long j10 = this.f27755d;
        if (j10 >= 0) {
            transition.w0(j10);
        }
        if ((this.f27792a0 & 1) != 0) {
            transition.y0(K());
        }
        if ((this.f27792a0 & 2) != 0) {
            transition.B0(Q());
        }
        if ((this.f27792a0 & 4) != 0) {
            transition.A0(P());
        }
        if ((this.f27792a0 & 8) != 0) {
            transition.x0(J());
        }
        return this;
    }

    public int P0() {
        return !this.X ? 1 : 0;
    }

    @androidx.annotation.p0
    public Transition Q0(int i10) {
        if (i10 < 0 || i10 >= this.W.size()) {
            return null;
        }
        return this.W.get(i10);
    }

    public int R0() {
        return this.W.size();
    }

    @Override // androidx.transition.Transition
    @androidx.annotation.n0
    /* JADX INFO: renamed from: S0, reason: merged with bridge method [inline-methods] */
    public TransitionSet n0(@androidx.annotation.n0 Transition.h hVar) {
        return (TransitionSet) super.n0(hVar);
    }

    @Override // androidx.transition.Transition
    @androidx.annotation.n0
    /* JADX INFO: renamed from: T0, reason: merged with bridge method [inline-methods] */
    public TransitionSet o0(@androidx.annotation.d0 int i10) {
        for (int i11 = 0; i11 < this.W.size(); i11++) {
            this.W.get(i11).o0(i10);
        }
        return (TransitionSet) super.o0(i10);
    }

    @Override // androidx.transition.Transition
    @androidx.annotation.n0
    /* JADX INFO: renamed from: U0, reason: merged with bridge method [inline-methods] */
    public TransitionSet p0(@androidx.annotation.n0 View view) {
        for (int i10 = 0; i10 < this.W.size(); i10++) {
            this.W.get(i10).p0(view);
        }
        return (TransitionSet) super.p0(view);
    }

    @Override // androidx.transition.Transition
    @androidx.annotation.n0
    /* JADX INFO: renamed from: V0, reason: merged with bridge method [inline-methods] */
    public TransitionSet q0(@androidx.annotation.n0 Class<?> cls) {
        for (int i10 = 0; i10 < this.W.size(); i10++) {
            this.W.get(i10).q0(cls);
        }
        return (TransitionSet) super.q0(cls);
    }

    @Override // androidx.transition.Transition
    @androidx.annotation.n0
    /* JADX INFO: renamed from: W0, reason: merged with bridge method [inline-methods] */
    public TransitionSet r0(@androidx.annotation.n0 String str) {
        for (int i10 = 0; i10 < this.W.size(); i10++) {
            this.W.get(i10).r0(str);
        }
        return (TransitionSet) super.r0(str);
    }

    @androidx.annotation.n0
    public TransitionSet X0(@androidx.annotation.n0 Transition transition) {
        this.W.remove(transition);
        transition.f27770s = null;
        return this;
    }

    @Override // androidx.transition.Transition
    @androidx.annotation.n0
    /* JADX INFO: renamed from: Y0, reason: merged with bridge method [inline-methods] */
    public TransitionSet w0(long j10) {
        ArrayList<Transition> arrayList;
        super.w0(j10);
        if (this.f27755d >= 0 && (arrayList = this.W) != null) {
            int size = arrayList.size();
            for (int i10 = 0; i10 < size; i10++) {
                this.W.get(i10).w0(j10);
            }
        }
        return this;
    }

    @Override // androidx.transition.Transition
    @androidx.annotation.n0
    /* JADX INFO: renamed from: Z0, reason: merged with bridge method [inline-methods] */
    public TransitionSet y0(@androidx.annotation.p0 TimeInterpolator timeInterpolator) {
        this.f27792a0 |= 1;
        ArrayList<Transition> arrayList = this.W;
        if (arrayList != null) {
            int size = arrayList.size();
            for (int i10 = 0; i10 < size; i10++) {
                this.W.get(i10).y0(timeInterpolator);
            }
        }
        return (TransitionSet) super.y0(timeInterpolator);
    }

    @androidx.annotation.n0
    public TransitionSet c1(int i10) {
        if (i10 == 0) {
            this.X = true;
        } else {
            if (i10 != 1) {
                throw new AndroidRuntimeException("Invalid parameter for TransitionSet ordering: " + i10);
            }
            this.X = false;
        }
        return this;
    }

    @Override // androidx.transition.Transition
    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP_PREFIX})
    protected void cancel() {
        super.cancel();
        int size = this.W.size();
        for (int i10 = 0; i10 < size; i10++) {
            this.W.get(i10).cancel();
        }
    }

    @Override // androidx.transition.Transition
    @androidx.annotation.n0
    /* JADX INFO: renamed from: d1, reason: merged with bridge method [inline-methods] */
    public TransitionSet E0(long j10) {
        return (TransitionSet) super.E0(j10);
    }

    @Override // androidx.transition.Transition
    public void j(@androidx.annotation.n0 z zVar) {
        if (d0(zVar.f27974b)) {
            for (Transition transition : this.W) {
                if (transition.d0(zVar.f27974b)) {
                    transition.j(zVar);
                    zVar.f27975c.add(transition);
                }
            }
        }
    }

    @Override // androidx.transition.Transition
    void l(z zVar) {
        super.l(zVar);
        int size = this.W.size();
        for (int i10 = 0; i10 < size; i10++) {
            this.W.get(i10).l(zVar);
        }
    }

    @Override // androidx.transition.Transition
    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP_PREFIX})
    public void l0(View view) {
        super.l0(view);
        int size = this.W.size();
        for (int i10 = 0; i10 < size; i10++) {
            this.W.get(i10).l0(view);
        }
    }

    @Override // androidx.transition.Transition
    public void m(@androidx.annotation.n0 z zVar) {
        if (d0(zVar.f27974b)) {
            for (Transition transition : this.W) {
                if (transition.d0(zVar.f27974b)) {
                    transition.m(zVar);
                    zVar.f27975c.add(transition);
                }
            }
        }
    }

    @Override // androidx.transition.Transition
    /* JADX INFO: renamed from: p */
    public Transition clone() {
        TransitionSet transitionSet = (TransitionSet) super.clone();
        transitionSet.W = new ArrayList<>();
        int size = this.W.size();
        for (int i10 = 0; i10 < size; i10++) {
            transitionSet.O0(this.W.get(i10).clone());
        }
        return transitionSet;
    }

    @Override // androidx.transition.Transition
    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP_PREFIX})
    protected void r(ViewGroup viewGroup, a0 a0Var, a0 a0Var2, ArrayList<z> arrayList, ArrayList<z> arrayList2) {
        long jS = S();
        int size = this.W.size();
        for (int i10 = 0; i10 < size; i10++) {
            Transition transition = this.W.get(i10);
            if (jS > 0 && (this.X || i10 == 0)) {
                long jS2 = transition.S();
                if (jS2 > 0) {
                    transition.E0(jS2 + jS);
                } else {
                    transition.E0(jS);
                }
            }
            transition.r(viewGroup, a0Var, a0Var2, arrayList, arrayList2);
        }
    }

    @Override // androidx.transition.Transition
    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP_PREFIX})
    public void s0(View view) {
        super.s0(view);
        int size = this.W.size();
        for (int i10 = 0; i10 < size; i10++) {
            this.W.get(i10).s0(view);
        }
    }

    @Override // androidx.transition.Transition
    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP_PREFIX})
    protected void u0() {
        if (this.W.isEmpty()) {
            F0();
            s();
            return;
        }
        e1();
        if (this.X) {
            Iterator<Transition> it = this.W.iterator();
            while (it.hasNext()) {
                it.next().u0();
            }
            return;
        }
        for (int i10 = 1; i10 < this.W.size(); i10++) {
            this.W.get(i10 - 1).a(new a(this.W.get(i10)));
        }
        Transition transition = this.W.get(0);
        if (transition != null) {
            transition.u0();
        }
    }

    @Override // androidx.transition.Transition
    void v0(boolean z10) {
        super.v0(z10);
        int size = this.W.size();
        for (int i10 = 0; i10 < size; i10++) {
            this.W.get(i10).v0(z10);
        }
    }

    @Override // androidx.transition.Transition
    public void x0(Transition.f fVar) {
        super.x0(fVar);
        this.f27792a0 |= 8;
        int size = this.W.size();
        for (int i10 = 0; i10 < size; i10++) {
            this.W.get(i10).x0(fVar);
        }
    }

    @Override // androidx.transition.Transition
    @androidx.annotation.n0
    public Transition y(int i10, boolean z10) {
        for (int i11 = 0; i11 < this.W.size(); i11++) {
            this.W.get(i11).y(i10, z10);
        }
        return super.y(i10, z10);
    }

    @Override // androidx.transition.Transition
    @androidx.annotation.n0
    public Transition z(@androidx.annotation.n0 View view, boolean z10) {
        for (int i10 = 0; i10 < this.W.size(); i10++) {
            this.W.get(i10).z(view, z10);
        }
        return super.z(view, z10);
    }
}
