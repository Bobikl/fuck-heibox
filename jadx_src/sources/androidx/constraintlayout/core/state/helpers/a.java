package androidx.constraintlayout.core.state.helpers;

import androidx.constraintlayout.core.state.ConstraintReference;
import androidx.constraintlayout.core.state.State;
import java.util.Iterator;

/* JADX INFO: compiled from: AlignHorizontallyReference.java */
/* JADX INFO: loaded from: classes.dex */
public class a extends androidx.constraintlayout.core.state.a {

    /* JADX INFO: renamed from: h0, reason: collision with root package name */
    private float f18141h0;

    public a(State state) {
        super(state, State.Helper.ALIGN_VERTICALLY);
        this.f18141h0 = 0.5f;
    }

    @Override // androidx.constraintlayout.core.state.a, androidx.constraintlayout.core.state.ConstraintReference, androidx.constraintlayout.core.state.c
    public void apply() {
        Iterator<Object> it = this.f18136f0.iterator();
        while (it.hasNext()) {
            ConstraintReference constraintReferenceE = this.f18134d0.e(it.next());
            constraintReferenceE.s();
            Object obj = this.K;
            if (obj != null) {
                constraintReferenceE.t0(obj);
            } else {
                Object obj2 = this.L;
                if (obj2 != null) {
                    constraintReferenceE.s0(obj2);
                } else {
                    constraintReferenceE.t0(State.f18127j);
                }
            }
            Object obj3 = this.M;
            if (obj3 != null) {
                constraintReferenceE.y(obj3);
            } else {
                Object obj4 = this.N;
                if (obj4 != null) {
                    constraintReferenceE.x(obj4);
                } else {
                    constraintReferenceE.x(State.f18127j);
                }
            }
            float f10 = this.f18141h0;
            if (f10 != 0.5f) {
                constraintReferenceE.T(f10);
            }
        }
    }
}
