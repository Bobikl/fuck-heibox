package com.google.android.material.textfield;

import android.R;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.graphics.Rect;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.RippleDrawable;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.view.accessibility.AccessibilityManager;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Filterable;
import android.widget.ListAdapter;
import android.widget.TextView;
import androidx.annotation.i0;
import androidx.annotation.n0;
import androidx.annotation.p0;
import androidx.appcompat.widget.AppCompatAutoCompleteTextView;
import androidx.appcompat.widget.ListPopupWindow;
import androidx.core.view.j1;
import com.google.android.material.internal.c0;

/* JADX INFO: loaded from: classes7.dex */
public class MaterialAutoCompleteTextView extends AppCompatAutoCompleteTextView {

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private static final int f55548m = 15;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    @n0
    private final ListPopupWindow f55549f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    @p0
    private final AccessibilityManager f55550g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    @n0
    private final Rect f55551h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    @i0
    private final int f55552i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private final float f55553j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private int f55554k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    @p0
    private ColorStateList f55555l;

    public class a implements AdapterView.OnItemClickListener {
        a() {
        }

        @Override // android.widget.AdapterView.OnItemClickListener
        public void onItemClick(AdapterView<?> adapterView, View view, int i10, long j10) {
            MaterialAutoCompleteTextView materialAutoCompleteTextView = MaterialAutoCompleteTextView.this;
            MaterialAutoCompleteTextView.this.j(i10 < 0 ? materialAutoCompleteTextView.f55549f.B() : materialAutoCompleteTextView.getAdapter().getItem(i10));
            AdapterView.OnItemClickListener onItemClickListener = MaterialAutoCompleteTextView.this.getOnItemClickListener();
            if (onItemClickListener != null) {
                if (view == null || i10 < 0) {
                    view = MaterialAutoCompleteTextView.this.f55549f.E();
                    i10 = MaterialAutoCompleteTextView.this.f55549f.D();
                    j10 = MaterialAutoCompleteTextView.this.f55549f.C();
                }
                onItemClickListener.onItemClick(MaterialAutoCompleteTextView.this.f55549f.j(), view, i10, j10);
            }
            MaterialAutoCompleteTextView.this.f55549f.dismiss();
        }
    }

    public class b<T> extends ArrayAdapter<String> {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        @p0
        private ColorStateList f55557b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        @p0
        private ColorStateList f55558c;

        b(Context context, @n0 int i10, String[] strArr) {
            super(context, i10, strArr);
            f();
        }

        @p0
        private ColorStateList a() {
            if (!c() || !d()) {
                return null;
            }
            int[] iArr = {R.attr.state_hovered, -16842919};
            int[] iArr2 = {R.attr.state_selected, -16842919};
            return new ColorStateList(new int[][]{iArr2, iArr, new int[0]}, new int[]{com.google.android.material.color.m.n(MaterialAutoCompleteTextView.this.f55554k, MaterialAutoCompleteTextView.this.f55555l.getColorForState(iArr2, 0)), com.google.android.material.color.m.n(MaterialAutoCompleteTextView.this.f55554k, MaterialAutoCompleteTextView.this.f55555l.getColorForState(iArr, 0)), MaterialAutoCompleteTextView.this.f55554k});
        }

        @p0
        private Drawable b() {
            if (!c()) {
                return null;
            }
            ColorDrawable colorDrawable = new ColorDrawable(MaterialAutoCompleteTextView.this.f55554k);
            if (this.f55558c == null) {
                return colorDrawable;
            }
            androidx.core.graphics.drawable.d.o(colorDrawable, this.f55557b);
            return new RippleDrawable(this.f55558c, colorDrawable, null);
        }

        private boolean c() {
            return MaterialAutoCompleteTextView.this.f55554k != 0;
        }

        private boolean d() {
            return MaterialAutoCompleteTextView.this.f55555l != null;
        }

        private ColorStateList e() {
            if (!d()) {
                return null;
            }
            int[] iArr = {R.attr.state_pressed};
            return new ColorStateList(new int[][]{iArr, new int[0]}, new int[]{MaterialAutoCompleteTextView.this.f55555l.getColorForState(iArr, 0), 0});
        }

        void f() {
            this.f55558c = e();
            this.f55557b = a();
        }

        @Override // android.widget.ArrayAdapter, android.widget.Adapter
        public View getView(int i10, @p0 View view, ViewGroup viewGroup) {
            View view2 = super.getView(i10, view, viewGroup);
            if (view2 instanceof TextView) {
                TextView textView = (TextView) view2;
                j1.I1(textView, MaterialAutoCompleteTextView.this.getText().toString().contentEquals(textView.getText()) ? b() : null);
            }
            return view2;
        }
    }

    public MaterialAutoCompleteTextView(@n0 Context context) {
        this(context, null);
    }

    public MaterialAutoCompleteTextView(@n0 Context context, @p0 AttributeSet attributeSet) {
        this(context, attributeSet, com.google.android.material.R.attr.autoCompleteTextViewStyle);
    }

    public MaterialAutoCompleteTextView(@n0 Context context, @p0 AttributeSet attributeSet, int i10) {
        super(j9.a.c(context, attributeSet, i10, 0), attributeSet, i10);
        this.f55551h = new Rect();
        Context context2 = getContext();
        TypedArray typedArrayK = c0.k(context2, attributeSet, com.google.android.material.R.styleable.f52879u0, i10, com.google.android.material.R.style.Widget_AppCompat_AutoCompleteTextView, new int[0]);
        int i11 = com.google.android.material.R.styleable.MaterialAutoCompleteTextView_android_inputType;
        if (typedArrayK.hasValue(i11) && typedArrayK.getInt(i11, 0) == 0) {
            setKeyListener(null);
        }
        this.f55552i = typedArrayK.getResourceId(com.google.android.material.R.styleable.MaterialAutoCompleteTextView_simpleItemLayout, com.google.android.material.R.layout.mtrl_auto_complete_simple_item);
        this.f55553j = typedArrayK.getDimensionPixelOffset(com.google.android.material.R.styleable.MaterialAutoCompleteTextView_android_popupElevation, com.google.android.material.R.dimen.mtrl_exposed_dropdown_menu_popup_elevation);
        this.f55554k = typedArrayK.getColor(com.google.android.material.R.styleable.MaterialAutoCompleteTextView_simpleItemSelectedColor, 0);
        this.f55555l = com.google.android.material.resources.c.a(context2, typedArrayK, com.google.android.material.R.styleable.MaterialAutoCompleteTextView_simpleItemSelectedRippleColor);
        this.f55550g = (AccessibilityManager) context2.getSystemService("accessibility");
        ListPopupWindow listPopupWindow = new ListPopupWindow(context2);
        this.f55549f = listPopupWindow;
        listPopupWindow.c0(true);
        listPopupWindow.R(this);
        listPopupWindow.Z(2);
        listPopupWindow.p(getAdapter());
        listPopupWindow.e0(new a());
        int i12 = com.google.android.material.R.styleable.MaterialAutoCompleteTextView_simpleItems;
        if (typedArrayK.hasValue(i12)) {
            setSimpleItems(typedArrayK.getResourceId(i12, 0));
        }
        typedArrayK.recycle();
    }

    @p0
    private TextInputLayout f() {
        for (ViewParent parent = getParent(); parent != null; parent = parent.getParent()) {
            if (parent instanceof TextInputLayout) {
                return (TextInputLayout) parent;
            }
        }
        return null;
    }

    private boolean g() {
        AccessibilityManager accessibilityManager = this.f55550g;
        return accessibilityManager != null && accessibilityManager.isTouchExplorationEnabled();
    }

    private int h() {
        ListAdapter adapter = getAdapter();
        TextInputLayout textInputLayoutF = f();
        int i10 = 0;
        if (adapter == null || textInputLayoutF == null) {
            return 0;
        }
        int iMakeMeasureSpec = View.MeasureSpec.makeMeasureSpec(getMeasuredWidth(), 0);
        int iMakeMeasureSpec2 = View.MeasureSpec.makeMeasureSpec(getMeasuredHeight(), 0);
        int iMin = Math.min(adapter.getCount(), Math.max(0, this.f55549f.D()) + 15);
        View view = null;
        int iMax = 0;
        for (int iMax2 = Math.max(0, iMin - 15); iMax2 < iMin; iMax2++) {
            int itemViewType = adapter.getItemViewType(iMax2);
            if (itemViewType != i10) {
                view = null;
                i10 = itemViewType;
            }
            view = adapter.getView(iMax2, view, textInputLayoutF);
            if (view.getLayoutParams() == null) {
                view.setLayoutParams(new ViewGroup.LayoutParams(-2, -2));
            }
            view.measure(iMakeMeasureSpec, iMakeMeasureSpec2);
            iMax = Math.max(iMax, view.getMeasuredWidth());
        }
        Drawable drawableD = this.f55549f.d();
        if (drawableD != null) {
            drawableD.getPadding(this.f55551h);
            Rect rect = this.f55551h;
            iMax += rect.left + rect.right;
        }
        return iMax + textInputLayoutF.getEndIconView().getMeasuredWidth();
    }

    private void i() {
        TextInputLayout textInputLayoutF = f();
        if (textInputLayoutF != null) {
            textInputLayoutF.F0();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public <T extends ListAdapter & Filterable> void j(Object obj) {
        setText(convertSelectionToString(obj), false);
    }

    @Override // android.widget.AutoCompleteTextView
    public void dismissDropDown() {
        if (g()) {
            this.f55549f.dismiss();
        } else {
            super.dismissDropDown();
        }
    }

    @Override // android.widget.TextView
    @p0
    public CharSequence getHint() {
        TextInputLayout textInputLayoutF = f();
        return (textInputLayoutF == null || !textInputLayoutF.a0()) ? super.getHint() : textInputLayoutF.getHint();
    }

    public float getPopupElevation() {
        return this.f55553j;
    }

    public int getSimpleItemSelectedColor() {
        return this.f55554k;
    }

    @p0
    public ColorStateList getSimpleItemSelectedRippleColor() {
        return this.f55555l;
    }

    @Override // android.widget.AutoCompleteTextView, android.widget.TextView, android.view.View
    protected void onAttachedToWindow() {
        super.onAttachedToWindow();
        TextInputLayout textInputLayoutF = f();
        if (textInputLayoutF != null && textInputLayoutF.a0() && super.getHint() == null && com.google.android.material.internal.l.c()) {
            setHint("");
        }
    }

    @Override // android.widget.AutoCompleteTextView, android.view.View
    protected void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        this.f55549f.dismiss();
    }

    @Override // android.widget.TextView, android.view.View
    protected void onMeasure(int i10, int i11) {
        super.onMeasure(i10, i11);
        if (View.MeasureSpec.getMode(i10) == Integer.MIN_VALUE) {
            setMeasuredDimension(Math.min(Math.max(getMeasuredWidth(), h()), View.MeasureSpec.getSize(i10)), getMeasuredHeight());
        }
    }

    @Override // android.widget.AutoCompleteTextView, android.widget.TextView, android.view.View
    public void onWindowFocusChanged(boolean z10) {
        if (g()) {
            return;
        }
        super.onWindowFocusChanged(z10);
    }

    @Override // android.widget.AutoCompleteTextView
    public <T extends ListAdapter & Filterable> void setAdapter(@p0 T t10) {
        super.setAdapter(t10);
        this.f55549f.p(getAdapter());
    }

    @Override // android.widget.AutoCompleteTextView
    public void setDropDownBackgroundDrawable(Drawable drawable) {
        super.setDropDownBackgroundDrawable(drawable);
        ListPopupWindow listPopupWindow = this.f55549f;
        if (listPopupWindow != null) {
            listPopupWindow.a(drawable);
        }
    }

    @Override // android.widget.AutoCompleteTextView
    public void setOnItemSelectedListener(@p0 AdapterView.OnItemSelectedListener onItemSelectedListener) {
        super.setOnItemSelectedListener(onItemSelectedListener);
        this.f55549f.f0(getOnItemSelectedListener());
    }

    @Override // android.widget.TextView
    public void setRawInputType(int i10) {
        super.setRawInputType(i10);
        i();
    }

    public void setSimpleItemSelectedColor(int i10) {
        this.f55554k = i10;
        if (getAdapter() instanceof b) {
            ((b) getAdapter()).f();
        }
    }

    public void setSimpleItemSelectedRippleColor(@p0 ColorStateList colorStateList) {
        this.f55555l = colorStateList;
        if (getAdapter() instanceof b) {
            ((b) getAdapter()).f();
        }
    }

    public void setSimpleItems(@androidx.annotation.e int i10) {
        setSimpleItems(getResources().getStringArray(i10));
    }

    public void setSimpleItems(@n0 String[] strArr) {
        setAdapter(new b(getContext(), this.f55552i, strArr));
    }

    @Override // android.widget.AutoCompleteTextView
    public void showDropDown() {
        if (g()) {
            this.f55549f.show();
        } else {
            super.showDropDown();
        }
    }
}
