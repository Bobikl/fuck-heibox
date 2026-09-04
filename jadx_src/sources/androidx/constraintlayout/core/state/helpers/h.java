package androidx.constraintlayout.core.state.helpers;

import androidx.constraintlayout.core.state.ConstraintReference;
import androidx.constraintlayout.core.state.State;
import java.util.Iterator;

/* JADX INFO: compiled from: VerticalChainReference.java */
/* JADX INFO: loaded from: classes.dex */
public class h extends d {

    /* JADX INFO: compiled from: VerticalChainReference.java */
    public static /* synthetic */ class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        static final /* synthetic */ int[] f18157a;

        static {
            int[] iArr = new int[State.Chain.values().length];
            f18157a = iArr;
            try {
                iArr[State.Chain.SPREAD.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f18157a[State.Chain.SPREAD_INSIDE.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f18157a[State.Chain.PACKED.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
        }
    }

    public h(State state) {
        super(state, State.Helper.VERTICAL_CHAIN);
    }

    @Override // androidx.constraintlayout.core.state.a, androidx.constraintlayout.core.state.ConstraintReference, androidx.constraintlayout.core.state.c
    public void apply() {
        Iterator<Object> it = this.f18136f0.iterator();
        while (it.hasNext()) {
            this.f18134d0.e(it.next()).t();
        }
        Iterator<Object> it2 = this.f18136f0.iterator();
        ConstraintReference constraintReference = null;
        ConstraintReference constraintReference2 = null;
        while (it2.hasNext()) {
            ConstraintReference constraintReferenceE = this.f18134d0.e(it2.next());
            if (constraintReference2 == null) {
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
                constraintReference2 = constraintReferenceE;
            }
            if (constraintReference != null) {
                constraintReference.n(constraintReferenceE.getKey());
                constraintReferenceE.v0(constraintReference.getKey());
            }
            constraintReference = constraintReferenceE;
        }
        if (constraintReference != null) {
            Object obj3 = this.Q;
            if (obj3 != null) {
                constraintReference.n(obj3);
            } else {
                Object obj4 = this.R;
                if (obj4 != null) {
                    constraintReference.m(obj4);
                } else {
                    constraintReference.m(State.f18127j);
                }
            }
        }
        if (constraintReference2 == null) {
            return;
        }
        float f10 = this.f18147h0;
        if (f10 != 0.5f) {
            constraintReference2.B0(f10);
        }
        int i10 = a.f18157a[this.f18148i0.ordinal()];
        if (i10 == 1) {
            constraintReference2.o0(0);
        } else if (i10 == 2) {
            constraintReference2.o0(1);
        } else {
            if (i10 != 3) {
                return;
            }
            constraintReference2.o0(2);
        }
    }
}
