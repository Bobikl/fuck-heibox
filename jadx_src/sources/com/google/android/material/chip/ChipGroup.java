package com.google.android.material.chip;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.view.accessibility.AccessibilityNodeInfo;
import androidx.annotation.d0;
import androidx.annotation.h;
import androidx.annotation.n0;
import androidx.annotation.p0;
import androidx.annotation.q;
import androidx.annotation.r;
import androidx.core.view.accessibility.a0;
import androidx.core.view.j1;
import com.google.android.material.R;
import com.google.android.material.internal.FlowLayout;
import com.google.android.material.internal.c0;
import java.util.List;
import java.util.Set;

/* JADX INFO: loaded from: classes7.dex */
public class ChipGroup extends FlowLayout {

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private static final int f53575l = R.style.Widget_MaterialComponents_ChipGroup;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    @r
    private int f53576f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    @r
    private int f53577g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    @p0
    private d f53578h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private final com.google.android.material.internal.a<Chip> f53579i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private final int f53580j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    @n0
    private final e f53581k;

    public static class LayoutParams extends ViewGroup.MarginLayoutParams {
        public LayoutParams(int i10, int i11) {
            super(i10, i11);
        }

        public LayoutParams(Context context, AttributeSet attributeSet) {
            super(context, attributeSet);
        }

        public LayoutParams(ViewGroup.LayoutParams layoutParams) {
            super(layoutParams);
        }

        public LayoutParams(ViewGroup.MarginLayoutParams marginLayoutParams) {
            super(marginLayoutParams);
        }
    }

    public class a implements com.google.android.material.internal.a.b {
        a() {
        }

        @Override // com.google.android.material.internal.a.b
        public void a(Set<Integer> set) {
            if (ChipGroup.this.f53578h != null) {
                d dVar = ChipGroup.this.f53578h;
                ChipGroup chipGroup = ChipGroup.this;
                dVar.a(chipGroup, chipGroup.f53579i.j(ChipGroup.this));
            }
        }
    }

    public class b implements d {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ c f53583a;

        b(c cVar) {
            this.f53583a = cVar;
        }

        @Override // com.google.android.material.chip.ChipGroup.d
        public void a(@n0 ChipGroup chipGroup, @n0 List<Integer> list) {
            if (ChipGroup.this.f53579i.m()) {
                this.f53583a.a(chipGroup, ChipGroup.this.getCheckedChipId());
            }
        }
    }

    @Deprecated
    public interface c {
        void a(@n0 ChipGroup chipGroup, @d0 int i10);
    }

    public interface d {
        void a(@n0 ChipGroup chipGroup, @n0 List<Integer> list);
    }

    public class e implements ViewGroup.OnHierarchyChangeListener {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private ViewGroup.OnHierarchyChangeListener f53585b;

        private e() {
        }

        /* synthetic */ e(ChipGroup chipGroup, a aVar) {
            this();
        }

        @Override // android.view.ViewGroup.OnHierarchyChangeListener
        public void onChildViewAdded(View view, View view2) {
            if (view == ChipGroup.this && (view2 instanceof Chip)) {
                if (view2.getId() == -1) {
                    view2.setId(j1.D());
                }
                ChipGroup.this.f53579i.e((Chip) view2);
            }
            ViewGroup.OnHierarchyChangeListener onHierarchyChangeListener = this.f53585b;
            if (onHierarchyChangeListener != null) {
                onHierarchyChangeListener.onChildViewAdded(view, view2);
            }
        }

        @Override // android.view.ViewGroup.OnHierarchyChangeListener
        public void onChildViewRemoved(View view, View view2) {
            ChipGroup chipGroup = ChipGroup.this;
            if (view == chipGroup && (view2 instanceof Chip)) {
                chipGroup.f53579i.o((Chip) view2);
            }
            ViewGroup.OnHierarchyChangeListener onHierarchyChangeListener = this.f53585b;
            if (onHierarchyChangeListener != null) {
                onHierarchyChangeListener.onChildViewRemoved(view, view2);
            }
        }
    }

    public ChipGroup(Context context) {
        this(context, null);
    }

    public ChipGroup(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, R.attr.chipGroupStyle);
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public ChipGroup(Context context, AttributeSet attributeSet, int i10) {
        int i11 = f53575l;
        super(j9.a.c(context, attributeSet, i10, i11), attributeSet, i10);
        com.google.android.material.internal.a<Chip> aVar = new com.google.android.material.internal.a<>();
        this.f53579i = aVar;
        e eVar = new e(this, null);
        this.f53581k = eVar;
        TypedArray typedArrayK = c0.k(getContext(), attributeSet, R.styleable.D, i10, i11, new int[0]);
        int dimensionPixelOffset = typedArrayK.getDimensionPixelOffset(R.styleable.ChipGroup_chipSpacing, 0);
        setChipSpacingHorizontal(typedArrayK.getDimensionPixelOffset(R.styleable.ChipGroup_chipSpacingHorizontal, dimensionPixelOffset));
        setChipSpacingVertical(typedArrayK.getDimensionPixelOffset(R.styleable.ChipGroup_chipSpacingVertical, dimensionPixelOffset));
        setSingleLine(typedArrayK.getBoolean(R.styleable.ChipGroup_singleLine, false));
        setSingleSelection(typedArrayK.getBoolean(R.styleable.ChipGroup_singleSelection, false));
        setSelectionRequired(typedArrayK.getBoolean(R.styleable.ChipGroup_selectionRequired, false));
        this.f53580j = typedArrayK.getResourceId(R.styleable.ChipGroup_checkedChip, -1);
        typedArrayK.recycle();
        aVar.p(new a());
        super.setOnHierarchyChangeListener(eVar);
        j1.R1(this, 1);
    }

    private int getVisibleChipCount() {
        int i10 = 0;
        for (int i11 = 0; i11 < getChildCount(); i11++) {
            if ((getChildAt(i11) instanceof Chip) && j(i11)) {
                i10++;
            }
        }
        return i10;
    }

    private boolean j(int i10) {
        return getChildAt(i10).getVisibility() == 0;
    }

    @Override // com.google.android.material.internal.FlowLayout
    public boolean c() {
        return super.c();
    }

    @Override // android.view.ViewGroup
    protected boolean checkLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return super.checkLayoutParams(layoutParams) && (layoutParams instanceof LayoutParams);
    }

    public void g(@d0 int i10) {
        this.f53579i.f(i10);
    }

    @Override // android.view.ViewGroup
    @n0
    protected ViewGroup.LayoutParams generateDefaultLayoutParams() {
        return new LayoutParams(-2, -2);
    }

    @Override // android.view.ViewGroup
    @n0
    public ViewGroup.LayoutParams generateLayoutParams(AttributeSet attributeSet) {
        return new LayoutParams(getContext(), attributeSet);
    }

    @Override // android.view.ViewGroup
    @n0
    protected ViewGroup.LayoutParams generateLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return new LayoutParams(layoutParams);
    }

    @d0
    public int getCheckedChipId() {
        return this.f53579i.k();
    }

    @n0
    public List<Integer> getCheckedChipIds() {
        return this.f53579i.j(this);
    }

    @r
    public int getChipSpacingHorizontal() {
        return this.f53576f;
    }

    @r
    public int getChipSpacingVertical() {
        return this.f53577g;
    }

    public void h() {
        this.f53579i.h();
    }

    int i(@p0 View view) {
        if (!(view instanceof Chip)) {
            return -1;
        }
        int i10 = 0;
        for (int i11 = 0; i11 < getChildCount(); i11++) {
            View childAt = getChildAt(i11);
            if ((childAt instanceof Chip) && j(i11)) {
                if (((Chip) childAt) == view) {
                    return i10;
                }
                i10++;
            }
        }
        return -1;
    }

    public boolean k() {
        return this.f53579i.l();
    }

    public boolean l() {
        return this.f53579i.m();
    }

    @Override // android.view.View
    protected void onFinishInflate() {
        super.onFinishInflate();
        int i10 = this.f53580j;
        if (i10 != -1) {
            this.f53579i.f(i10);
        }
    }

    @Override // android.view.View
    public void onInitializeAccessibilityNodeInfo(@n0 AccessibilityNodeInfo accessibilityNodeInfo) {
        super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
        a0.g2(accessibilityNodeInfo).d1(a0.d.f(getRowCount(), c() ? getVisibleChipCount() : -1, false, l() ? 1 : 2));
    }

    public void setChipSpacing(@r int i10) {
        setChipSpacingHorizontal(i10);
        setChipSpacingVertical(i10);
    }

    public void setChipSpacingHorizontal(@r int i10) {
        if (this.f53576f != i10) {
            this.f53576f = i10;
            setItemSpacing(i10);
            requestLayout();
        }
    }

    public void setChipSpacingHorizontalResource(@q int i10) {
        setChipSpacingHorizontal(getResources().getDimensionPixelOffset(i10));
    }

    public void setChipSpacingResource(@q int i10) {
        setChipSpacing(getResources().getDimensionPixelOffset(i10));
    }

    public void setChipSpacingVertical(@r int i10) {
        if (this.f53577g != i10) {
            this.f53577g = i10;
            setLineSpacing(i10);
            requestLayout();
        }
    }

    public void setChipSpacingVerticalResource(@q int i10) {
        setChipSpacingVertical(getResources().getDimensionPixelOffset(i10));
    }

    @Deprecated
    public void setDividerDrawableHorizontal(Drawable drawable) {
        throw new UnsupportedOperationException("Changing divider drawables have no effect. ChipGroup do not use divider drawables as spacing.");
    }

    @Deprecated
    public void setDividerDrawableVertical(@p0 Drawable drawable) {
        throw new UnsupportedOperationException("Changing divider drawables have no effect. ChipGroup do not use divider drawables as spacing.");
    }

    @Deprecated
    public void setFlexWrap(int i10) {
        throw new UnsupportedOperationException("Changing flex wrap not allowed. ChipGroup exposes a singleLine attribute instead.");
    }

    @Deprecated
    public void setOnCheckedChangeListener(@p0 c cVar) {
        if (cVar == null) {
            setOnCheckedStateChangeListener(null);
        } else {
            setOnCheckedStateChangeListener(new b(cVar));
        }
    }

    public void setOnCheckedStateChangeListener(@p0 d dVar) {
        this.f53578h = dVar;
    }

    @Override // android.view.ViewGroup
    public void setOnHierarchyChangeListener(ViewGroup.OnHierarchyChangeListener onHierarchyChangeListener) {
        this.f53581k.f53585b = onHierarchyChangeListener;
    }

    public void setSelectionRequired(boolean z10) {
        this.f53579i.q(z10);
    }

    @Deprecated
    public void setShowDividerHorizontal(int i10) {
        throw new UnsupportedOperationException("Changing divider modes has no effect. ChipGroup do not use divider drawables as spacing.");
    }

    @Deprecated
    public void setShowDividerVertical(int i10) {
        throw new UnsupportedOperationException("Changing divider modes has no effect. ChipGroup do not use divider drawables as spacing.");
    }

    public void setSingleLine(@h int i10) {
        setSingleLine(getResources().getBoolean(i10));
    }

    @Override // com.google.android.material.internal.FlowLayout
    public void setSingleLine(boolean z10) {
        super.setSingleLine(z10);
    }

    public void setSingleSelection(@h int i10) {
        setSingleSelection(getResources().getBoolean(i10));
    }

    public void setSingleSelection(boolean z10) {
        this.f53579i.r(z10);
    }
}
