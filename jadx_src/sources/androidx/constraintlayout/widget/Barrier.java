package androidx.constraintlayout.widget;

import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.util.SparseArray;
import androidx.constraintlayout.core.widgets.ConstraintWidget;
import androidx.constraintlayout.core.widgets.h;

/* JADX INFO: loaded from: classes.dex */
public class Barrier extends ConstraintHelper {

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public static final int f19229n = 0;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public static final int f19230o = 2;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public static final int f19231p = 1;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public static final int f19232q = 3;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public static final int f19233r = 5;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public static final int f19234s = 6;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private int f19235k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private int f19236l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private androidx.constraintlayout.core.widgets.a f19237m;

    public Barrier(Context context) {
        super(context);
        super.setVisibility(8);
    }

    public Barrier(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        super.setVisibility(8);
    }

    public Barrier(Context context, AttributeSet attributeSet, int i10) {
        super(context, attributeSet, i10);
        super.setVisibility(8);
    }

    private void K(ConstraintWidget constraintWidget, int i10, boolean z10) {
        this.f19236l = i10;
        if (z10) {
            int i11 = this.f19235k;
            if (i11 == 5) {
                this.f19236l = 1;
            } else if (i11 == 6) {
                this.f19236l = 0;
            }
        } else {
            int i12 = this.f19235k;
            if (i12 == 5) {
                this.f19236l = 0;
            } else if (i12 == 6) {
                this.f19236l = 1;
            }
        }
        if (constraintWidget instanceof androidx.constraintlayout.core.widgets.a) {
            ((androidx.constraintlayout.core.widgets.a) constraintWidget).o2(this.f19236l);
        }
    }

    @Override // androidx.constraintlayout.widget.ConstraintHelper
    public void B(ConstraintWidget constraintWidget, boolean z10) {
        K(constraintWidget, this.f19235k, z10);
    }

    @Deprecated
    public boolean J() {
        return this.f19237m.i2();
    }

    public boolean getAllowsGoneWidget() {
        return this.f19237m.i2();
    }

    public int getMargin() {
        return this.f19237m.k2();
    }

    public int getType() {
        return this.f19235k;
    }

    public void setAllowsGoneWidget(boolean z10) {
        this.f19237m.n2(z10);
    }

    public void setDpMargin(int i10) {
        this.f19237m.p2((int) ((i10 * getResources().getDisplayMetrics().density) + 0.5f));
    }

    public void setMargin(int i10) {
        this.f19237m.p2(i10);
    }

    public void setType(int i10) {
        this.f19235k = i10;
    }

    @Override // androidx.constraintlayout.widget.ConstraintHelper
    protected void y(AttributeSet attributeSet) {
        super.y(attributeSet);
        this.f19237m = new androidx.constraintlayout.core.widgets.a();
        if (attributeSet != null) {
            TypedArray typedArrayObtainStyledAttributes = getContext().obtainStyledAttributes(attributeSet, R.styleable.f19429u);
            int indexCount = typedArrayObtainStyledAttributes.getIndexCount();
            for (int i10 = 0; i10 < indexCount; i10++) {
                int index = typedArrayObtainStyledAttributes.getIndex(i10);
                if (index == R.styleable.ConstraintLayout_Layout_barrierDirection) {
                    setType(typedArrayObtainStyledAttributes.getInt(index, 0));
                } else if (index == R.styleable.ConstraintLayout_Layout_barrierAllowsGoneWidgets) {
                    this.f19237m.n2(typedArrayObtainStyledAttributes.getBoolean(index, true));
                } else if (index == R.styleable.ConstraintLayout_Layout_barrierMargin) {
                    this.f19237m.p2(typedArrayObtainStyledAttributes.getDimensionPixelSize(index, 0));
                }
            }
            typedArrayObtainStyledAttributes.recycle();
        }
        this.f19251e = this.f19237m;
        I();
    }

    @Override // androidx.constraintlayout.widget.ConstraintHelper
    public void z(c.a aVar, h hVar, ConstraintLayout.LayoutParams layoutParams, SparseArray<ConstraintWidget> sparseArray) {
        super.z(aVar, hVar, layoutParams, sparseArray);
        if (hVar instanceof androidx.constraintlayout.core.widgets.a) {
            androidx.constraintlayout.core.widgets.a aVar2 = (androidx.constraintlayout.core.widgets.a) hVar;
            K(aVar2, aVar.f19564e.f19627g0, ((androidx.constraintlayout.core.widgets.d) hVar.U()).I2());
            aVar2.n2(aVar.f19564e.f19643o0);
            aVar2.p2(aVar.f19564e.f19629h0);
        }
    }
}
