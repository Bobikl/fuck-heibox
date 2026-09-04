package androidx.constraintlayout.core.state.helpers;

import androidx.constraintlayout.core.state.ConstraintReference;
import androidx.constraintlayout.core.state.State;

/* JADX INFO: compiled from: BarrierReference.java */
/* JADX INFO: loaded from: classes.dex */
public class c extends androidx.constraintlayout.core.state.a {

    /* JADX INFO: renamed from: h0, reason: collision with root package name */
    private State.Direction f18143h0;

    /* JADX INFO: renamed from: i0, reason: collision with root package name */
    private int f18144i0;

    /* JADX INFO: renamed from: j0, reason: collision with root package name */
    private androidx.constraintlayout.core.widgets.a f18145j0;

    /* JADX INFO: compiled from: BarrierReference.java */
    public static /* synthetic */ class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        static final /* synthetic */ int[] f18146a;

        static {
            int[] iArr = new int[State.Direction.values().length];
            f18146a = iArr;
            try {
                iArr[State.Direction.LEFT.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f18146a[State.Direction.START.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f18146a[State.Direction.RIGHT.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f18146a[State.Direction.END.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f18146a[State.Direction.TOP.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                f18146a[State.Direction.BOTTOM.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
        }
    }

    public c(State state) {
        super(state, State.Helper.BARRIER);
    }

    @Override // androidx.constraintlayout.core.state.a
    public androidx.constraintlayout.core.widgets.h F0() {
        if (this.f18145j0 == null) {
            this.f18145j0 = new androidx.constraintlayout.core.widgets.a();
        }
        return this.f18145j0;
    }

    public void I0(State.Direction direction) {
        this.f18143h0 = direction;
    }

    @Override // androidx.constraintlayout.core.state.ConstraintReference
    public ConstraintReference X(int i10) {
        this.f18144i0 = i10;
        return this;
    }

    @Override // androidx.constraintlayout.core.state.ConstraintReference
    public ConstraintReference Y(Object obj) {
        X(this.f18134d0.f(obj));
        return this;
    }

    @Override // androidx.constraintlayout.core.state.a, androidx.constraintlayout.core.state.ConstraintReference, androidx.constraintlayout.core.state.c
    public void apply() {
        F0();
        int i10 = a.f18146a[this.f18143h0.ordinal()];
        int i11 = 3;
        if (i10 == 3 || i10 == 4) {
            i11 = 1;
        } else if (i10 == 5) {
            i11 = 2;
        } else if (i10 != 6) {
            i11 = 0;
        }
        this.f18145j0.o2(i11);
        this.f18145j0.p2(this.f18144i0);
    }
}
