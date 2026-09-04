package androidx.constraintlayout.core.state.helpers;

import androidx.constraintlayout.core.state.ConstraintReference;
import androidx.constraintlayout.core.state.State;
import java.util.Iterator;

/* JADX INFO: compiled from: AlignVerticallyReference.java */
/* JADX INFO: loaded from: classes.dex */
public class b extends androidx.constraintlayout.core.state.a {

    /* JADX INFO: renamed from: h0, reason: collision with root package name */
    private float f18142h0;

    public b(State state) {
        super(state, State.Helper.ALIGN_VERTICALLY);
        this.f18142h0 = 0.5f;
    }

    @Override // androidx.constraintlayout.core.state.a, androidx.constraintlayout.core.state.ConstraintReference, androidx.constraintlayout.core.state.c
    public void apply() {
        Iterator<Object> it = this.f18136f0.iterator();
        while (it.hasNext()) {
            ConstraintReference constraintReferenceE = this.f18134d0.e(it.next());
            constraintReferenceE.t();
            Object obj = this.O;
            if (obj != null) {
                constraintReferenceE.w0(obj);
            } else {
                Object obj2 = this.P;
                if (obj2 != null) {
                    constraintReferenceE.v0(obj2);
                } else {
                    constraintReferenceE.w0(State.f18127j);
                }
            }
            Object obj3 = this.Q;
            if (obj3 != null) {
                constraintReferenceE.n(obj3);
            } else {
                Object obj4 = this.R;
                if (obj4 != null) {
                    constraintReferenceE.m(obj4);
                } else {
                    constraintReferenceE.m(State.f18127j);
                }
            }
            float f10 = this.f18142h0;
            if (f10 != 0.5f) {
                constraintReferenceE.B0(f10);
            }
        }
    }
}
