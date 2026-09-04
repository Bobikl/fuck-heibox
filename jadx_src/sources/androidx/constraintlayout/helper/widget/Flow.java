package androidx.constraintlayout.helper.widget;

import android.annotation.SuppressLint;
import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.util.SparseArray;
import android.view.View;
import androidx.constraintlayout.core.widgets.ConstraintWidget;
import androidx.constraintlayout.core.widgets.e;
import androidx.constraintlayout.core.widgets.h;
import androidx.constraintlayout.core.widgets.l;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.constraintlayout.widget.R;
import androidx.constraintlayout.widget.VirtualLayout;
import androidx.constraintlayout.widget.c;

/* JADX INFO: loaded from: classes.dex */
public class Flow extends VirtualLayout {
    public static final int A = 1;
    public static final int B = 2;
    public static final int C = 3;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private static final String f18534n = "Flow";

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public static final int f18535o = 0;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public static final int f18536p = 1;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public static final int f18537q = 0;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public static final int f18538r = 1;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public static final int f18539s = 2;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public static final int f18540t = 0;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public static final int f18541u = 1;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public static final int f18542v = 2;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public static final int f18543w = 0;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public static final int f18544x = 1;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public static final int f18545y = 2;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    public static final int f18546z = 0;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private e f18547m;

    public Flow(Context context) {
        super(context);
    }

    public Flow(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public Flow(Context context, AttributeSet attributeSet, int i10) {
        super(context, attributeSet, i10);
    }

    @Override // androidx.constraintlayout.widget.ConstraintHelper
    public void B(ConstraintWidget constraintWidget, boolean z10) {
        this.f18547m.g2(z10);
    }

    @Override // androidx.constraintlayout.widget.VirtualLayout
    public void J(l lVar, int i10, int i11) {
        int mode = View.MeasureSpec.getMode(i10);
        int size = View.MeasureSpec.getSize(i10);
        int mode2 = View.MeasureSpec.getMode(i11);
        int size2 = View.MeasureSpec.getSize(i11);
        if (lVar == null) {
            setMeasuredDimension(0, 0);
        } else {
            lVar.p2(mode, size, mode2, size2);
            setMeasuredDimension(lVar.k2(), lVar.j2());
        }
    }

    @Override // androidx.constraintlayout.widget.ConstraintHelper, android.view.View
    @SuppressLint({"WrongCall"})
    protected void onMeasure(int i10, int i11) {
        J(this.f18547m, i10, i11);
    }

    public void setFirstHorizontalBias(float f10) {
        this.f18547m.c3(f10);
        requestLayout();
    }

    public void setFirstHorizontalStyle(int i10) {
        this.f18547m.d3(i10);
        requestLayout();
    }

    public void setFirstVerticalBias(float f10) {
        this.f18547m.e3(f10);
        requestLayout();
    }

    public void setFirstVerticalStyle(int i10) {
        this.f18547m.f3(i10);
        requestLayout();
    }

    public void setHorizontalAlign(int i10) {
        this.f18547m.g3(i10);
        requestLayout();
    }

    public void setHorizontalBias(float f10) {
        this.f18547m.h3(f10);
        requestLayout();
    }

    public void setHorizontalGap(int i10) {
        this.f18547m.i3(i10);
        requestLayout();
    }

    public void setHorizontalStyle(int i10) {
        this.f18547m.j3(i10);
        requestLayout();
    }

    public void setLastHorizontalBias(float f10) {
        this.f18547m.k3(f10);
        requestLayout();
    }

    public void setLastHorizontalStyle(int i10) {
        this.f18547m.l3(i10);
        requestLayout();
    }

    public void setLastVerticalBias(float f10) {
        this.f18547m.m3(f10);
        requestLayout();
    }

    public void setLastVerticalStyle(int i10) {
        this.f18547m.n3(i10);
        requestLayout();
    }

    public void setMaxElementsWrap(int i10) {
        this.f18547m.o3(i10);
        requestLayout();
    }

    public void setOrientation(int i10) {
        this.f18547m.p3(i10);
        requestLayout();
    }

    public void setPadding(int i10) {
        this.f18547m.v2(i10);
        requestLayout();
    }

    public void setPaddingBottom(int i10) {
        this.f18547m.w2(i10);
        requestLayout();
    }

    public void setPaddingLeft(int i10) {
        this.f18547m.y2(i10);
        requestLayout();
    }

    public void setPaddingRight(int i10) {
        this.f18547m.z2(i10);
        requestLayout();
    }

    public void setPaddingTop(int i10) {
        this.f18547m.B2(i10);
        requestLayout();
    }

    public void setVerticalAlign(int i10) {
        this.f18547m.q3(i10);
        requestLayout();
    }

    public void setVerticalBias(float f10) {
        this.f18547m.r3(f10);
        requestLayout();
    }

    public void setVerticalGap(int i10) {
        this.f18547m.s3(i10);
        requestLayout();
    }

    public void setVerticalStyle(int i10) {
        this.f18547m.t3(i10);
        requestLayout();
    }

    public void setWrapMode(int i10) {
        this.f18547m.u3(i10);
        requestLayout();
    }

    @Override // androidx.constraintlayout.widget.VirtualLayout, androidx.constraintlayout.widget.ConstraintHelper
    protected void y(AttributeSet attributeSet) {
        super.y(attributeSet);
        this.f18547m = new e();
        if (attributeSet != null) {
            TypedArray typedArrayObtainStyledAttributes = getContext().obtainStyledAttributes(attributeSet, R.styleable.f19429u);
            int indexCount = typedArrayObtainStyledAttributes.getIndexCount();
            for (int i10 = 0; i10 < indexCount; i10++) {
                int index = typedArrayObtainStyledAttributes.getIndex(i10);
                if (index == R.styleable.ConstraintLayout_Layout_android_orientation) {
                    this.f18547m.p3(typedArrayObtainStyledAttributes.getInt(index, 0));
                } else if (index == R.styleable.ConstraintLayout_Layout_android_padding) {
                    this.f18547m.v2(typedArrayObtainStyledAttributes.getDimensionPixelSize(index, 0));
                } else if (index == R.styleable.ConstraintLayout_Layout_android_paddingStart) {
                    this.f18547m.A2(typedArrayObtainStyledAttributes.getDimensionPixelSize(index, 0));
                } else if (index == R.styleable.ConstraintLayout_Layout_android_paddingEnd) {
                    this.f18547m.x2(typedArrayObtainStyledAttributes.getDimensionPixelSize(index, 0));
                } else if (index == R.styleable.ConstraintLayout_Layout_android_paddingLeft) {
                    this.f18547m.y2(typedArrayObtainStyledAttributes.getDimensionPixelSize(index, 0));
                } else if (index == R.styleable.ConstraintLayout_Layout_android_paddingTop) {
                    this.f18547m.B2(typedArrayObtainStyledAttributes.getDimensionPixelSize(index, 0));
                } else if (index == R.styleable.ConstraintLayout_Layout_android_paddingRight) {
                    this.f18547m.z2(typedArrayObtainStyledAttributes.getDimensionPixelSize(index, 0));
                } else if (index == R.styleable.ConstraintLayout_Layout_android_paddingBottom) {
                    this.f18547m.w2(typedArrayObtainStyledAttributes.getDimensionPixelSize(index, 0));
                } else if (index == R.styleable.ConstraintLayout_Layout_flow_wrapMode) {
                    this.f18547m.u3(typedArrayObtainStyledAttributes.getInt(index, 0));
                } else if (index == R.styleable.ConstraintLayout_Layout_flow_horizontalStyle) {
                    this.f18547m.j3(typedArrayObtainStyledAttributes.getInt(index, 0));
                } else if (index == R.styleable.ConstraintLayout_Layout_flow_verticalStyle) {
                    this.f18547m.t3(typedArrayObtainStyledAttributes.getInt(index, 0));
                } else if (index == R.styleable.ConstraintLayout_Layout_flow_firstHorizontalStyle) {
                    this.f18547m.d3(typedArrayObtainStyledAttributes.getInt(index, 0));
                } else if (index == R.styleable.ConstraintLayout_Layout_flow_lastHorizontalStyle) {
                    this.f18547m.l3(typedArrayObtainStyledAttributes.getInt(index, 0));
                } else if (index == R.styleable.ConstraintLayout_Layout_flow_firstVerticalStyle) {
                    this.f18547m.f3(typedArrayObtainStyledAttributes.getInt(index, 0));
                } else if (index == R.styleable.ConstraintLayout_Layout_flow_lastVerticalStyle) {
                    this.f18547m.n3(typedArrayObtainStyledAttributes.getInt(index, 0));
                } else if (index == R.styleable.ConstraintLayout_Layout_flow_horizontalBias) {
                    this.f18547m.h3(typedArrayObtainStyledAttributes.getFloat(index, 0.5f));
                } else if (index == R.styleable.ConstraintLayout_Layout_flow_firstHorizontalBias) {
                    this.f18547m.c3(typedArrayObtainStyledAttributes.getFloat(index, 0.5f));
                } else if (index == R.styleable.ConstraintLayout_Layout_flow_lastHorizontalBias) {
                    this.f18547m.k3(typedArrayObtainStyledAttributes.getFloat(index, 0.5f));
                } else if (index == R.styleable.ConstraintLayout_Layout_flow_firstVerticalBias) {
                    this.f18547m.e3(typedArrayObtainStyledAttributes.getFloat(index, 0.5f));
                } else if (index == R.styleable.ConstraintLayout_Layout_flow_lastVerticalBias) {
                    this.f18547m.m3(typedArrayObtainStyledAttributes.getFloat(index, 0.5f));
                } else if (index == R.styleable.ConstraintLayout_Layout_flow_verticalBias) {
                    this.f18547m.r3(typedArrayObtainStyledAttributes.getFloat(index, 0.5f));
                } else if (index == R.styleable.ConstraintLayout_Layout_flow_horizontalAlign) {
                    this.f18547m.g3(typedArrayObtainStyledAttributes.getInt(index, 2));
                } else if (index == R.styleable.ConstraintLayout_Layout_flow_verticalAlign) {
                    this.f18547m.q3(typedArrayObtainStyledAttributes.getInt(index, 2));
                } else if (index == R.styleable.ConstraintLayout_Layout_flow_horizontalGap) {
                    this.f18547m.i3(typedArrayObtainStyledAttributes.getDimensionPixelSize(index, 0));
                } else if (index == R.styleable.ConstraintLayout_Layout_flow_verticalGap) {
                    this.f18547m.s3(typedArrayObtainStyledAttributes.getDimensionPixelSize(index, 0));
                } else if (index == R.styleable.ConstraintLayout_Layout_flow_maxElementsWrap) {
                    this.f18547m.o3(typedArrayObtainStyledAttributes.getInt(index, -1));
                }
            }
            typedArrayObtainStyledAttributes.recycle();
        }
        this.f19251e = this.f18547m;
        I();
    }

    @Override // androidx.constraintlayout.widget.ConstraintHelper
    public void z(c.a aVar, h hVar, ConstraintLayout.LayoutParams layoutParams, SparseArray<ConstraintWidget> sparseArray) {
        super.z(aVar, hVar, layoutParams, sparseArray);
        if (hVar instanceof e) {
            e eVar = (e) hVar;
            int i10 = layoutParams.Y;
            if (i10 != -1) {
                eVar.p3(i10);
            }
        }
    }
}
