package androidx.constraintlayout.core.state.helpers;

import androidx.constraintlayout.core.state.ConstraintReference;
import androidx.constraintlayout.core.state.State;
import java.util.Iterator;

/* JADX INFO: compiled from: HorizontalChainReference.java */
/* JADX INFO: loaded from: classes.dex */
public class g extends d {

    /* JADX INFO: compiled from: HorizontalChainReference.java */
    public static /* synthetic */ class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        static final /* synthetic */ int[] f18156a;

        static {
            int[] iArr = new int[State.Chain.values().length];
            f18156a = iArr;
            try {
                iArr[State.Chain.SPREAD.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f18156a[State.Chain.SPREAD_INSIDE.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f18156a[State.Chain.PACKED.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
        }
    }

    public g(State state) {
        super(state, State.Helper.HORIZONTAL_CHAIN);
    }

    @Override // androidx.constraintlayout.core.state.a, androidx.constraintlayout.core.state.ConstraintReference, androidx.constraintlayout.core.state.c
    public void apply() {
        Iterator<Object> it = this.f18136f0.iterator();
        while (it.hasNext()) {
            this.f18134d0.e(it.next()).s();
        }
        Iterator<Object> it2 = this.f18136f0.iterator();
        ConstraintReference constraintReference = null;
        ConstraintReference constraintReference2 = null;
        while (it2.hasNext()) {
            ConstraintReference constraintReferenceE = this.f18134d0.e(it2.next());
            if (constraintReference2 == null) {
                Object obj = this.K;
                if (obj != null) {
                    constraintReferenceE.t0(obj).X(this.f18091k);
                } else {
                    Object obj2 = this.L;
                    if (obj2 != null) {
                        constraintReferenceE.s0(obj2).X(this.f18091k);
                    } else {
                        constraintReferenceE.t0(State.f18127j);
                    }
                }
                constraintReference2 = constraintReferenceE;
            }
            if (constraintReference != null) {
                constraintReference.y(constraintReferenceE.getKey());
                constraintReferenceE.s0(constraintReference.getKey());
            }
            constraintReference = constraintReferenceE;
        }
        if (constraintReference != null) {
            Object obj3 = this.M;
            if (obj3 != null) {
                constraintReference.y(obj3).X(this.f18092l);
            } else {
                Object obj4 = this.N;
                if (obj4 != null) {
                    constraintReference.x(obj4).X(this.f18092l);
                } else {
                    constraintReference.x(State.f18127j);
                }
            }
        }
        if (constraintReference2 == null) {
            return;
        }
        float f10 = this.f18147h0;
        if (f10 != 0.5f) {
            constraintReference2.T(f10);
        }
        int i10 = a.f18156a[this.f18148i0.ordinal()];
        if (i10 == 1) {
            constraintReference2.m0(0);
        } else if (i10 == 2) {
            constraintReference2.m0(1);
        } else {
            if (i10 != 3) {
                return;
            }
            constraintReference2.m0(2);
        }
    }
}
