package androidx.constraintlayout.widget;

import android.content.Context;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.util.AttributeSet;
import android.util.Log;
import android.util.SparseArray;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import androidx.constraintlayout.core.widgets.ConstraintWidget;
import androidx.constraintlayout.core.widgets.g;
import androidx.constraintlayout.core.widgets.h;
import com.xiaomi.mipush.sdk.Constants;
import java.util.Arrays;
import java.util.HashMap;

/* JADX INFO: loaded from: classes.dex */
public abstract class ConstraintHelper extends View {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    protected int[] f19248b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    protected int f19249c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    protected Context f19250d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    protected g f19251e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    protected boolean f19252f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    protected String f19253g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    protected String f19254h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private View[] f19255i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    protected HashMap<Integer, String> f19256j;

    public ConstraintHelper(Context context) {
        super(context);
        this.f19248b = new int[32];
        this.f19252f = false;
        this.f19255i = null;
        this.f19256j = new HashMap<>();
        this.f19250d = context;
        y(null);
    }

    public ConstraintHelper(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f19248b = new int[32];
        this.f19252f = false;
        this.f19255i = null;
        this.f19256j = new HashMap<>();
        this.f19250d = context;
        y(attributeSet);
    }

    public ConstraintHelper(Context context, AttributeSet attributeSet, int i10) {
        super(context, attributeSet, i10);
        this.f19248b = new int[32];
        this.f19252f = false;
        this.f19255i = null;
        this.f19256j = new HashMap<>();
        this.f19250d = context;
        y(attributeSet);
    }

    private void l(String str) {
        if (str == null || str.length() == 0 || this.f19250d == null) {
            return;
        }
        String strTrim = str.trim();
        if (getParent() instanceof ConstraintLayout) {
        }
        int iV = v(strTrim);
        if (iV != 0) {
            this.f19256j.put(Integer.valueOf(iV), strTrim);
            m(iV);
            return;
        }
        Log.w("ConstraintHelper", "Could not find id of \"" + strTrim + "\"");
    }

    private void m(int i10) {
        if (i10 == getId()) {
            return;
        }
        int i11 = this.f19249c + 1;
        int[] iArr = this.f19248b;
        if (i11 > iArr.length) {
            this.f19248b = Arrays.copyOf(iArr, iArr.length * 2);
        }
        int[] iArr2 = this.f19248b;
        int i12 = this.f19249c;
        iArr2[i12] = i10;
        this.f19249c = i12 + 1;
    }

    private void n(String str) {
        if (str == null || str.length() == 0 || this.f19250d == null) {
            return;
        }
        String strTrim = str.trim();
        ConstraintLayout constraintLayout = getParent() instanceof ConstraintLayout ? (ConstraintLayout) getParent() : null;
        if (constraintLayout == null) {
            Log.w("ConstraintHelper", "Parent not a ConstraintLayout");
            return;
        }
        int childCount = constraintLayout.getChildCount();
        for (int i10 = 0; i10 < childCount; i10++) {
            View childAt = constraintLayout.getChildAt(i10);
            ViewGroup.LayoutParams layoutParams = childAt.getLayoutParams();
            if ((layoutParams instanceof ConstraintLayout.LayoutParams) && strTrim.equals(((ConstraintLayout.LayoutParams) layoutParams).f19289b0)) {
                if (childAt.getId() == -1) {
                    Log.w("ConstraintHelper", "to use ConstraintTag view " + childAt.getClass().getSimpleName() + " must have an ID");
                } else {
                    m(childAt.getId());
                }
            }
        }
    }

    private int[] t(View view, String str) {
        String[] strArrSplit = str.split(Constants.ACCEPT_TIME_SEPARATOR_SP);
        view.getContext();
        int[] iArr = new int[strArrSplit.length];
        int i10 = 0;
        for (String str2 : strArrSplit) {
            int iV = v(str2.trim());
            if (iV != 0) {
                iArr[i10] = iV;
                i10++;
            }
        }
        return i10 != strArrSplit.length ? Arrays.copyOf(iArr, i10) : iArr;
    }

    private int u(ConstraintLayout constraintLayout, String str) {
        Resources resources;
        if (str == null || constraintLayout == null || (resources = this.f19250d.getResources()) == null) {
            return 0;
        }
        int childCount = constraintLayout.getChildCount();
        for (int i10 = 0; i10 < childCount; i10++) {
            View childAt = constraintLayout.getChildAt(i10);
            if (childAt.getId() != -1) {
                String resourceEntryName = null;
                try {
                    resourceEntryName = resources.getResourceEntryName(childAt.getId());
                } catch (Resources.NotFoundException unused) {
                }
                if (str.equals(resourceEntryName)) {
                    return childAt.getId();
                }
            }
        }
        return 0;
    }

    private int v(String str) {
        ConstraintLayout constraintLayout = getParent() instanceof ConstraintLayout ? (ConstraintLayout) getParent() : null;
        int iU = 0;
        if (isInEditMode() && constraintLayout != null) {
            Object objN = constraintLayout.n(0, str);
            if (objN instanceof Integer) {
                iU = ((Integer) objN).intValue();
            }
        }
        if (iU == 0 && constraintLayout != null) {
            iU = u(constraintLayout, str);
        }
        if (iU == 0) {
            try {
                iU = R.id.class.getField(str).getInt(null);
            } catch (Exception unused) {
            }
        }
        return iU == 0 ? this.f19250d.getResources().getIdentifier(str, "id", this.f19250d.getPackageName()) : iU;
    }

    public int A(View view) {
        int i10;
        int id2 = view.getId();
        int i11 = -1;
        if (id2 == -1) {
            return -1;
        }
        this.f19253g = null;
        for (int i12 = 0; i12 < this.f19249c; i12++) {
            if (this.f19248b[i12] == id2) {
                int i13 = i12;
                while (true) {
                    i10 = this.f19249c;
                    if (i13 >= i10 - 1) {
                        break;
                    }
                    int[] iArr = this.f19248b;
                    int i14 = i13 + 1;
                    iArr[i13] = iArr[i14];
                    i13 = i14;
                }
                this.f19248b[i10 - 1] = 0;
                this.f19249c = i10 - 1;
                i11 = i12;
                break;
            }
        }
        requestLayout();
        return i11;
    }

    public void B(ConstraintWidget constraintWidget, boolean z10) {
    }

    public void C(ConstraintLayout constraintLayout) {
    }

    public void D(ConstraintLayout constraintLayout) {
    }

    public void E(ConstraintLayout constraintLayout) {
    }

    public void F(ConstraintLayout constraintLayout) {
    }

    public void G(androidx.constraintlayout.core.widgets.d dVar, g gVar, SparseArray<ConstraintWidget> sparseArray) {
        gVar.b();
        for (int i10 = 0; i10 < this.f19249c; i10++) {
            gVar.a(sparseArray.get(this.f19248b[i10]));
        }
    }

    public void H(ConstraintLayout constraintLayout) {
        String str;
        int iU;
        if (isInEditMode()) {
            setIds(this.f19253g);
        }
        g gVar = this.f19251e;
        if (gVar == null) {
            return;
        }
        gVar.b();
        for (int i10 = 0; i10 < this.f19249c; i10++) {
            int i11 = this.f19248b[i10];
            View viewP = constraintLayout.p(i11);
            if (viewP == null && (iU = u(constraintLayout, (str = this.f19256j.get(Integer.valueOf(i11))))) != 0) {
                this.f19248b[i10] = iU;
                this.f19256j.put(Integer.valueOf(iU), str);
                viewP = constraintLayout.p(iU);
            }
            if (viewP != null) {
                this.f19251e.a(constraintLayout.q(viewP));
            }
        }
        this.f19251e.c(constraintLayout.f19259d);
    }

    public void I() {
        if (this.f19251e == null) {
            return;
        }
        ViewGroup.LayoutParams layoutParams = getLayoutParams();
        if (layoutParams instanceof ConstraintLayout.LayoutParams) {
            ((ConstraintLayout.LayoutParams) layoutParams).f19327u0 = (ConstraintWidget) this.f19251e;
        }
    }

    public int[] getReferencedIds() {
        return Arrays.copyOf(this.f19248b, this.f19249c);
    }

    public void o(View view) {
        if (view == this) {
            return;
        }
        if (view.getId() == -1) {
            Log.e("ConstraintHelper", "Views added to a ConstraintHelper need to have an id");
        } else {
            if (view.getParent() == null) {
                Log.e("ConstraintHelper", "Views added to a ConstraintHelper need to have a parent");
                return;
            }
            this.f19253g = null;
            m(view.getId());
            requestLayout();
        }
    }

    @Override // android.view.View
    protected void onAttachedToWindow() {
        super.onAttachedToWindow();
        String str = this.f19253g;
        if (str != null) {
            setIds(str);
        }
        String str2 = this.f19254h;
        if (str2 != null) {
            setReferenceTags(str2);
        }
    }

    @Override // android.view.View
    public void onDraw(Canvas canvas) {
    }

    @Override // android.view.View
    protected void onMeasure(int i10, int i11) {
        if (this.f19252f) {
            super.onMeasure(i10, i11);
        } else {
            setMeasuredDimension(0, 0);
        }
    }

    protected void p() {
        ViewParent parent = getParent();
        if (parent == null || !(parent instanceof ConstraintLayout)) {
            return;
        }
        q((ConstraintLayout) parent);
    }

    protected void q(ConstraintLayout constraintLayout) {
        int visibility = getVisibility();
        float elevation = getElevation();
        for (int i10 = 0; i10 < this.f19249c; i10++) {
            View viewP = constraintLayout.p(this.f19248b[i10]);
            if (viewP != null) {
                viewP.setVisibility(visibility);
                if (elevation > 0.0f) {
                    viewP.setTranslationZ(viewP.getTranslationZ() + elevation);
                }
            }
        }
    }

    protected void r(ConstraintLayout constraintLayout) {
    }

    public boolean s(int i10) {
        for (int i11 : this.f19248b) {
            if (i11 == i10) {
                return true;
            }
        }
        return false;
    }

    protected void setIds(String str) {
        this.f19253g = str;
        if (str == null) {
            return;
        }
        int i10 = 0;
        this.f19249c = 0;
        while (true) {
            int iIndexOf = str.indexOf(44, i10);
            if (iIndexOf == -1) {
                l(str.substring(i10));
                return;
            } else {
                l(str.substring(i10, iIndexOf));
                i10 = iIndexOf + 1;
            }
        }
    }

    protected void setReferenceTags(String str) {
        this.f19254h = str;
        if (str == null) {
            return;
        }
        int i10 = 0;
        this.f19249c = 0;
        while (true) {
            int iIndexOf = str.indexOf(44, i10);
            if (iIndexOf == -1) {
                n(str.substring(i10));
                return;
            } else {
                n(str.substring(i10, iIndexOf));
                i10 = iIndexOf + 1;
            }
        }
    }

    public void setReferencedIds(int[] iArr) {
        this.f19253g = null;
        this.f19249c = 0;
        for (int i10 : iArr) {
            m(i10);
        }
    }

    @Override // android.view.View
    public void setTag(int i10, Object obj) {
        super.setTag(i10, obj);
        if (obj == null && this.f19253g == null) {
            m(i10);
        }
    }

    protected View[] w(ConstraintLayout constraintLayout) {
        View[] viewArr = this.f19255i;
        if (viewArr == null || viewArr.length != this.f19249c) {
            this.f19255i = new View[this.f19249c];
        }
        for (int i10 = 0; i10 < this.f19249c; i10++) {
            this.f19255i[i10] = constraintLayout.p(this.f19248b[i10]);
        }
        return this.f19255i;
    }

    public int x(int i10) {
        int i11 = -1;
        for (int i12 : this.f19248b) {
            i11++;
            if (i12 == i10) {
                return i11;
            }
        }
        return i11;
    }

    protected void y(AttributeSet attributeSet) {
        if (attributeSet != null) {
            TypedArray typedArrayObtainStyledAttributes = getContext().obtainStyledAttributes(attributeSet, R.styleable.f19429u);
            int indexCount = typedArrayObtainStyledAttributes.getIndexCount();
            for (int i10 = 0; i10 < indexCount; i10++) {
                int index = typedArrayObtainStyledAttributes.getIndex(i10);
                if (index == R.styleable.ConstraintLayout_Layout_constraint_referenced_ids) {
                    String string = typedArrayObtainStyledAttributes.getString(index);
                    this.f19253g = string;
                    setIds(string);
                } else if (index == R.styleable.ConstraintLayout_Layout_constraint_referenced_tags) {
                    String string2 = typedArrayObtainStyledAttributes.getString(index);
                    this.f19254h = string2;
                    setReferenceTags(string2);
                }
            }
            typedArrayObtainStyledAttributes.recycle();
        }
    }

    public void z(c.a aVar, h hVar, ConstraintLayout.LayoutParams layoutParams, SparseArray<ConstraintWidget> sparseArray) {
        c.b bVar = aVar.f19564e;
        int[] iArr = bVar.f19633j0;
        if (iArr != null) {
            setReferencedIds(iArr);
        } else {
            String str = bVar.f19635k0;
            if (str != null) {
                if (str.length() > 0) {
                    c.b bVar2 = aVar.f19564e;
                    bVar2.f19633j0 = t(this, bVar2.f19635k0);
                } else {
                    aVar.f19564e.f19633j0 = null;
                }
            }
        }
        if (hVar == null) {
            return;
        }
        hVar.b();
        if (aVar.f19564e.f19633j0 == null) {
            return;
        }
        int i10 = 0;
        while (true) {
            int[] iArr2 = aVar.f19564e.f19633j0;
            if (i10 >= iArr2.length) {
                return;
            }
            ConstraintWidget constraintWidget = sparseArray.get(iArr2[i10]);
            if (constraintWidget != null) {
                hVar.a(constraintWidget);
            }
            i10++;
        }
    }
}
