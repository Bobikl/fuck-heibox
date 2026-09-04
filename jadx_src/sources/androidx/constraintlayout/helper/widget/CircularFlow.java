package androidx.constraintlayout.helper.widget;

import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.util.Log;
import android.view.View;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.constraintlayout.widget.R;
import androidx.constraintlayout.widget.VirtualLayout;
import androidx.constraintlayout.widget.c;
import java.util.Arrays;

/* JADX INFO: loaded from: classes.dex */
public class CircularFlow extends VirtualLayout {

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    private static final String f18521w = "CircularFlow";

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    private static int f18522x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    private static float f18523y;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    ConstraintLayout f18524m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    int f18525n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    private float[] f18526o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    private int[] f18527p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    private int f18528q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    private int f18529r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    private String f18530s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    private String f18531t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    private Float f18532u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    private Integer f18533v;

    public CircularFlow(Context context) {
        super(context);
    }

    public CircularFlow(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public CircularFlow(Context context, AttributeSet attributeSet, int i10) {
        super(context, attributeSet, i10);
    }

    private void K(String str) {
        float[] fArr;
        if (str == null || str.length() == 0 || this.f19250d == null || (fArr = this.f18526o) == null) {
            return;
        }
        if (this.f18529r + 1 > fArr.length) {
            this.f18526o = Arrays.copyOf(fArr, fArr.length + 1);
        }
        this.f18526o[this.f18529r] = Integer.parseInt(str);
        this.f18529r++;
    }

    private void L(String str) {
        int[] iArr;
        if (str == null || str.length() == 0 || this.f19250d == null || (iArr = this.f18527p) == null) {
            return;
        }
        if (this.f18528q + 1 > iArr.length) {
            this.f18527p = Arrays.copyOf(iArr, iArr.length + 1);
        }
        this.f18527p[this.f18528q] = (int) (Integer.parseInt(str) * this.f19250d.getResources().getDisplayMetrics().density);
        this.f18528q++;
    }

    private void N() {
        this.f18524m = (ConstraintLayout) getParent();
        for (int i10 = 0; i10 < this.f19249c; i10++) {
            View viewP = this.f18524m.p(this.f19248b[i10]);
            if (viewP != null) {
                int i11 = f18522x;
                float f10 = f18523y;
                int[] iArr = this.f18527p;
                if (iArr == null || i10 >= iArr.length) {
                    Integer num = this.f18533v;
                    if (num == null || num.intValue() == -1) {
                        Log.e(f18521w, "Added radius to view with id: " + this.f19256j.get(Integer.valueOf(viewP.getId())));
                    } else {
                        this.f18528q++;
                        if (this.f18527p == null) {
                            this.f18527p = new int[1];
                        }
                        int[] radius = getRadius();
                        this.f18527p = radius;
                        radius[this.f18528q - 1] = i11;
                    }
                } else {
                    i11 = iArr[i10];
                }
                float[] fArr = this.f18526o;
                if (fArr == null || i10 >= fArr.length) {
                    Float f11 = this.f18532u;
                    if (f11 == null || f11.floatValue() == -1.0f) {
                        Log.e(f18521w, "Added angle to view with id: " + this.f19256j.get(Integer.valueOf(viewP.getId())));
                    } else {
                        this.f18529r++;
                        if (this.f18526o == null) {
                            this.f18526o = new float[1];
                        }
                        float[] angles = getAngles();
                        this.f18526o = angles;
                        angles[this.f18529r - 1] = f10;
                    }
                } else {
                    f10 = fArr[i10];
                }
                ConstraintLayout.LayoutParams layoutParams = (ConstraintLayout.LayoutParams) viewP.getLayoutParams();
                layoutParams.f19318q = f10;
                layoutParams.f19314o = this.f18525n;
                layoutParams.f19316p = i11;
                viewP.setLayoutParams(layoutParams);
            }
        }
        p();
    }

    private float[] P(float[] fArr, int i10) {
        return (fArr == null || i10 < 0 || i10 >= this.f18529r) ? fArr : Q(fArr, i10);
    }

    public static float[] Q(float[] fArr, int i10) {
        float[] fArr2 = new float[fArr.length - 1];
        int i11 = 0;
        for (int i12 = 0; i12 < fArr.length; i12++) {
            if (i12 != i10) {
                fArr2[i11] = fArr[i12];
                i11++;
            }
        }
        return fArr2;
    }

    public static int[] R(int[] iArr, int i10) {
        int[] iArr2 = new int[iArr.length - 1];
        int i11 = 0;
        for (int i12 = 0; i12 < iArr.length; i12++) {
            if (i12 != i10) {
                iArr2[i11] = iArr[i12];
                i11++;
            }
        }
        return iArr2;
    }

    private int[] S(int[] iArr, int i10) {
        return (iArr == null || i10 < 0 || i10 >= this.f18528q) ? iArr : R(iArr, i10);
    }

    private void setAngles(String str) {
        if (str == null) {
            return;
        }
        int i10 = 0;
        this.f18529r = 0;
        while (true) {
            int iIndexOf = str.indexOf(44, i10);
            if (iIndexOf == -1) {
                K(str.substring(i10).trim());
                return;
            } else {
                K(str.substring(i10, iIndexOf).trim());
                i10 = iIndexOf + 1;
            }
        }
    }

    private void setRadius(String str) {
        if (str == null) {
            return;
        }
        int i10 = 0;
        this.f18528q = 0;
        while (true) {
            int iIndexOf = str.indexOf(44, i10);
            if (iIndexOf == -1) {
                L(str.substring(i10).trim());
                return;
            } else {
                L(str.substring(i10, iIndexOf).trim());
                i10 = iIndexOf + 1;
            }
        }
    }

    @Override // androidx.constraintlayout.widget.ConstraintHelper
    public int A(View view) {
        int iA = super.A(view);
        if (iA == -1) {
            return iA;
        }
        c cVar = new c();
        cVar.H(this.f18524m);
        cVar.F(view.getId(), 8);
        cVar.r(this.f18524m);
        float[] fArr = this.f18526o;
        if (iA < fArr.length) {
            this.f18526o = P(fArr, iA);
            this.f18529r--;
        }
        int[] iArr = this.f18527p;
        if (iA < iArr.length) {
            this.f18527p = S(iArr, iA);
            this.f18528q--;
        }
        N();
        return iA;
    }

    public void M(View view, int i10, float f10) {
        if (s(view.getId())) {
            return;
        }
        o(view);
        this.f18529r++;
        float[] angles = getAngles();
        this.f18526o = angles;
        angles[this.f18529r - 1] = f10;
        this.f18528q++;
        int[] radius = getRadius();
        this.f18527p = radius;
        radius[this.f18528q - 1] = (int) (i10 * this.f19250d.getResources().getDisplayMetrics().density);
        N();
    }

    public boolean O(View view) {
        return s(view.getId()) && x(view.getId()) != -1;
    }

    public void T(View view, float f10) {
        if (!O(view)) {
            Log.e(f18521w, "It was not possible to update angle to view with id: " + view.getId());
            return;
        }
        int iX = x(view.getId());
        if (iX > this.f18526o.length) {
            return;
        }
        float[] angles = getAngles();
        this.f18526o = angles;
        angles[iX] = f10;
        N();
    }

    public void U(View view, int i10) {
        if (!O(view)) {
            Log.e(f18521w, "It was not possible to update radius to view with id: " + view.getId());
            return;
        }
        int iX = x(view.getId());
        if (iX > this.f18527p.length) {
            return;
        }
        int[] radius = getRadius();
        this.f18527p = radius;
        radius[iX] = (int) (i10 * this.f19250d.getResources().getDisplayMetrics().density);
        N();
    }

    public void V(View view, int i10, float f10) {
        if (!O(view)) {
            Log.e(f18521w, "It was not possible to update radius and angle to view with id: " + view.getId());
            return;
        }
        int iX = x(view.getId());
        if (getAngles().length > iX) {
            float[] angles = getAngles();
            this.f18526o = angles;
            angles[iX] = f10;
        }
        if (getRadius().length > iX) {
            int[] radius = getRadius();
            this.f18527p = radius;
            radius[iX] = (int) (i10 * this.f19250d.getResources().getDisplayMetrics().density);
        }
        N();
    }

    public float[] getAngles() {
        return Arrays.copyOf(this.f18526o, this.f18529r);
    }

    public int[] getRadius() {
        return Arrays.copyOf(this.f18527p, this.f18528q);
    }

    @Override // androidx.constraintlayout.widget.VirtualLayout, androidx.constraintlayout.widget.ConstraintHelper, android.view.View
    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        String str = this.f18530s;
        if (str != null) {
            this.f18526o = new float[1];
            setAngles(str);
        }
        String str2 = this.f18531t;
        if (str2 != null) {
            this.f18527p = new int[1];
            setRadius(str2);
        }
        Float f10 = this.f18532u;
        if (f10 != null) {
            setDefaultAngle(f10.floatValue());
        }
        Integer num = this.f18533v;
        if (num != null) {
            setDefaultRadius(num.intValue());
        }
        N();
    }

    public void setDefaultAngle(float f10) {
        f18523y = f10;
    }

    public void setDefaultRadius(int i10) {
        f18522x = i10;
    }

    @Override // androidx.constraintlayout.widget.VirtualLayout, androidx.constraintlayout.widget.ConstraintHelper
    protected void y(AttributeSet attributeSet) {
        super.y(attributeSet);
        if (attributeSet != null) {
            TypedArray typedArrayObtainStyledAttributes = getContext().obtainStyledAttributes(attributeSet, R.styleable.f19429u);
            int indexCount = typedArrayObtainStyledAttributes.getIndexCount();
            for (int i10 = 0; i10 < indexCount; i10++) {
                int index = typedArrayObtainStyledAttributes.getIndex(i10);
                if (index == R.styleable.ConstraintLayout_Layout_circularflow_viewCenter) {
                    this.f18525n = typedArrayObtainStyledAttributes.getResourceId(index, 0);
                } else if (index == R.styleable.ConstraintLayout_Layout_circularflow_angles) {
                    String string = typedArrayObtainStyledAttributes.getString(index);
                    this.f18530s = string;
                    setAngles(string);
                } else if (index == R.styleable.ConstraintLayout_Layout_circularflow_radiusInDP) {
                    String string2 = typedArrayObtainStyledAttributes.getString(index);
                    this.f18531t = string2;
                    setRadius(string2);
                } else if (index == R.styleable.ConstraintLayout_Layout_circularflow_defaultAngle) {
                    Float fValueOf = Float.valueOf(typedArrayObtainStyledAttributes.getFloat(index, f18523y));
                    this.f18532u = fValueOf;
                    setDefaultAngle(fValueOf.floatValue());
                } else if (index == R.styleable.ConstraintLayout_Layout_circularflow_defaultRadius) {
                    Integer numValueOf = Integer.valueOf(typedArrayObtainStyledAttributes.getDimensionPixelSize(index, f18522x));
                    this.f18533v = numValueOf;
                    setDefaultRadius(numValueOf.intValue());
                }
            }
            typedArrayObtainStyledAttributes.recycle();
        }
    }
}
