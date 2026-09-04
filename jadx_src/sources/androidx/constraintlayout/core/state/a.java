package androidx.constraintlayout.core.state;

import androidx.constraintlayout.core.widgets.ConstraintWidget;
import java.util.ArrayList;
import java.util.Collections;

/* JADX INFO: compiled from: HelperReference.java */
/* JADX INFO: loaded from: classes.dex */
public class a extends ConstraintReference implements androidx.constraintlayout.core.state.helpers.e {

    /* JADX INFO: renamed from: d0, reason: collision with root package name */
    protected final State f18134d0;

    /* JADX INFO: renamed from: e0, reason: collision with root package name */
    final State.Helper f18135e0;

    /* JADX INFO: renamed from: f0, reason: collision with root package name */
    protected ArrayList<Object> f18136f0;

    /* JADX INFO: renamed from: g0, reason: collision with root package name */
    private androidx.constraintlayout.core.widgets.h f18137g0;

    public a(State state, State.Helper helper) {
        super(state);
        this.f18136f0 = new ArrayList<>();
        this.f18134d0 = state;
        this.f18135e0 = helper;
    }

    public a E0(Object... objArr) {
        Collections.addAll(this.f18136f0, objArr);
        return this;
    }

    public androidx.constraintlayout.core.widgets.h F0() {
        return this.f18137g0;
    }

    public State.Helper G0() {
        return this.f18135e0;
    }

    public void H0(androidx.constraintlayout.core.widgets.h hVar) {
        this.f18137g0 = hVar;
    }

    @Override // androidx.constraintlayout.core.state.ConstraintReference, androidx.constraintlayout.core.state.c
    public ConstraintWidget a() {
        return F0();
    }

    @Override // androidx.constraintlayout.core.state.ConstraintReference, androidx.constraintlayout.core.state.c
    public void apply() {
    }
}
