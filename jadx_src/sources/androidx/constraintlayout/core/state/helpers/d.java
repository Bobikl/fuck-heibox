package androidx.constraintlayout.core.state.helpers;

import androidx.constraintlayout.core.state.State;

/* JADX INFO: compiled from: ChainReference.java */
/* JADX INFO: loaded from: classes.dex */
public class d extends androidx.constraintlayout.core.state.a {

    /* JADX INFO: renamed from: h0, reason: collision with root package name */
    protected float f18147h0;

    /* JADX INFO: renamed from: i0, reason: collision with root package name */
    protected State.Chain f18148i0;

    public d(State state, State.Helper helper) {
        super(state, helper);
        this.f18147h0 = 0.5f;
        this.f18148i0 = State.Chain.SPREAD;
    }

    @Override // androidx.constraintlayout.core.state.ConstraintReference
    /* JADX INFO: renamed from: I0, reason: merged with bridge method [inline-methods] */
    public d k(float f10) {
        this.f18147h0 = f10;
        return this;
    }

    public float J0() {
        return this.f18147h0;
    }

    public State.Chain K0() {
        return State.Chain.SPREAD;
    }

    public d L0(State.Chain chain) {
        this.f18148i0 = chain;
        return this;
    }
}
