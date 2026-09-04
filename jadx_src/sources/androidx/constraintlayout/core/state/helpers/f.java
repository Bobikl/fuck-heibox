package androidx.constraintlayout.core.state.helpers;

import androidx.constraintlayout.core.state.State;
import androidx.constraintlayout.core.widgets.ConstraintWidget;

/* JADX INFO: compiled from: GuidelineReference.java */
/* JADX INFO: loaded from: classes.dex */
public class f implements e, androidx.constraintlayout.core.state.c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    final State f18149a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private int f18150b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private androidx.constraintlayout.core.widgets.f f18151c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private int f18152d = -1;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private int f18153e = -1;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private float f18154f = 0.0f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private Object f18155g;

    public f(State state) {
        this.f18149a = state;
    }

    @Override // androidx.constraintlayout.core.state.helpers.e, androidx.constraintlayout.core.state.c
    public ConstraintWidget a() {
        if (this.f18151c == null) {
            this.f18151c = new androidx.constraintlayout.core.widgets.f();
        }
        return this.f18151c;
    }

    @Override // androidx.constraintlayout.core.state.helpers.e, androidx.constraintlayout.core.state.c
    public void apply() {
        this.f18151c.v2(this.f18150b);
        int i10 = this.f18152d;
        if (i10 != -1) {
            this.f18151c.q2(i10);
            return;
        }
        int i11 = this.f18153e;
        if (i11 != -1) {
            this.f18151c.r2(i11);
        } else {
            this.f18151c.s2(this.f18154f);
        }
    }

    @Override // androidx.constraintlayout.core.state.c
    public void b(ConstraintWidget constraintWidget) {
        if (constraintWidget instanceof androidx.constraintlayout.core.widgets.f) {
            this.f18151c = (androidx.constraintlayout.core.widgets.f) constraintWidget;
        } else {
            this.f18151c = null;
        }
    }

    @Override // androidx.constraintlayout.core.state.c
    public void c(Object obj) {
        this.f18155g = obj;
    }

    @Override // androidx.constraintlayout.core.state.c
    public e d() {
        return null;
    }

    public f e(Object obj) {
        this.f18152d = -1;
        this.f18153e = this.f18149a.f(obj);
        this.f18154f = 0.0f;
        return this;
    }

    public int f() {
        return this.f18150b;
    }

    public f g(float f10) {
        this.f18152d = -1;
        this.f18153e = -1;
        this.f18154f = f10;
        return this;
    }

    @Override // androidx.constraintlayout.core.state.c
    public Object getKey() {
        return this.f18155g;
    }

    public void h(int i10) {
        this.f18150b = i10;
    }

    public f i(Object obj) {
        this.f18152d = this.f18149a.f(obj);
        this.f18153e = -1;
        this.f18154f = 0.0f;
        return this;
    }
}
