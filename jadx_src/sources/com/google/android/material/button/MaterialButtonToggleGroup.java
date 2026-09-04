package com.google.android.material.button;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.util.Log;
import android.view.View;
import android.view.ViewGroup;
import android.view.accessibility.AccessibilityNodeInfo;
import android.widget.LinearLayout;
import android.widget.RadioButton;
import android.widget.ToggleButton;
import androidx.annotation.d0;
import androidx.annotation.h;
import androidx.annotation.n0;
import androidx.annotation.p0;
import androidx.core.view.accessibility.a0;
import androidx.core.view.j1;
import androidx.core.view.s;
import com.google.android.material.R;
import com.google.android.material.internal.c0;
import com.google.android.material.internal.j0;
import com.google.android.material.shape.p;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;
import java.util.TreeMap;

/* JADX INFO: loaded from: classes7.dex */
public class MaterialButtonToggleGroup extends LinearLayout {

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private static final String f53372l = "MButtonToggleGroup";

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private static final int f53373m = R.style.Widget_MaterialComponents_MaterialButtonToggleGroup;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final List<c> f53374b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final e f53375c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final LinkedHashSet<d> f53376d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final Comparator<MaterialButton> f53377e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private Integer[] f53378f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private boolean f53379g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private boolean f53380h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private boolean f53381i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    @d0
    private final int f53382j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private Set<Integer> f53383k;

    public class a implements Comparator<MaterialButton> {
        a() {
        }

        @Override // java.util.Comparator
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public int compare(MaterialButton materialButton, MaterialButton materialButton2) {
            int iCompareTo = Boolean.valueOf(materialButton.isChecked()).compareTo(Boolean.valueOf(materialButton2.isChecked()));
            if (iCompareTo != 0) {
                return iCompareTo;
            }
            int iCompareTo2 = Boolean.valueOf(materialButton.isPressed()).compareTo(Boolean.valueOf(materialButton2.isPressed()));
            return iCompareTo2 != 0 ? iCompareTo2 : Integer.valueOf(MaterialButtonToggleGroup.this.indexOfChild(materialButton)).compareTo(Integer.valueOf(MaterialButtonToggleGroup.this.indexOfChild(materialButton2)));
        }
    }

    public class b extends androidx.core.view.a {
        b() {
        }

        @Override // androidx.core.view.a
        public void onInitializeAccessibilityNodeInfo(View view, @n0 a0 a0Var) {
            super.onInitializeAccessibilityNodeInfo(view, a0Var);
            a0Var.e1(a0.e.h(0, 1, MaterialButtonToggleGroup.this.k(view), 1, false, ((MaterialButton) view).isChecked()));
        }
    }

    public static class c {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        private static final com.google.android.material.shape.e f53386e = new com.google.android.material.shape.a(0.0f);

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        com.google.android.material.shape.e f53387a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        com.google.android.material.shape.e f53388b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        com.google.android.material.shape.e f53389c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        com.google.android.material.shape.e f53390d;

        c(com.google.android.material.shape.e eVar, com.google.android.material.shape.e eVar2, com.google.android.material.shape.e eVar3, com.google.android.material.shape.e eVar4) {
            this.f53387a = eVar;
            this.f53388b = eVar3;
            this.f53389c = eVar4;
            this.f53390d = eVar2;
        }

        public static c a(c cVar) {
            com.google.android.material.shape.e eVar = f53386e;
            return new c(eVar, cVar.f53390d, eVar, cVar.f53389c);
        }

        public static c b(c cVar, View view) {
            return j0.q(view) ? c(cVar) : d(cVar);
        }

        public static c c(c cVar) {
            com.google.android.material.shape.e eVar = cVar.f53387a;
            com.google.android.material.shape.e eVar2 = cVar.f53390d;
            com.google.android.material.shape.e eVar3 = f53386e;
            return new c(eVar, eVar2, eVar3, eVar3);
        }

        public static c d(c cVar) {
            com.google.android.material.shape.e eVar = f53386e;
            return new c(eVar, eVar, cVar.f53388b, cVar.f53389c);
        }

        public static c e(c cVar, View view) {
            return j0.q(view) ? d(cVar) : c(cVar);
        }

        public static c f(c cVar) {
            com.google.android.material.shape.e eVar = cVar.f53387a;
            com.google.android.material.shape.e eVar2 = f53386e;
            return new c(eVar, eVar2, cVar.f53388b, eVar2);
        }
    }

    public interface d {
        void a(MaterialButtonToggleGroup materialButtonToggleGroup, @d0 int i10, boolean z10);
    }

    public class e implements MaterialButton.c {
        private e() {
        }

        /* synthetic */ e(MaterialButtonToggleGroup materialButtonToggleGroup, a aVar) {
            this();
        }

        @Override // com.google.android.material.button.MaterialButton.c
        public void a(@n0 MaterialButton materialButton, boolean z10) {
            MaterialButtonToggleGroup.this.invalidate();
        }
    }

    public MaterialButtonToggleGroup(@n0 Context context) {
        this(context, null);
    }

    public MaterialButtonToggleGroup(@n0 Context context, @p0 AttributeSet attributeSet) {
        this(context, attributeSet, R.attr.materialButtonToggleGroupStyle);
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public MaterialButtonToggleGroup(@n0 Context context, @p0 AttributeSet attributeSet, int i10) {
        int i11 = f53373m;
        super(j9.a.c(context, attributeSet, i10, i11), attributeSet, i10);
        this.f53374b = new ArrayList();
        this.f53375c = new e(this, null);
        this.f53376d = new LinkedHashSet<>();
        this.f53377e = new a();
        this.f53379g = false;
        this.f53383k = new HashSet();
        TypedArray typedArrayK = c0.k(getContext(), attributeSet, R.styleable.f52885w0, i10, i11, new int[0]);
        setSingleSelection(typedArrayK.getBoolean(R.styleable.MaterialButtonToggleGroup_singleSelection, false));
        this.f53382j = typedArrayK.getResourceId(R.styleable.MaterialButtonToggleGroup_checkedButton, -1);
        this.f53381i = typedArrayK.getBoolean(R.styleable.MaterialButtonToggleGroup_selectionRequired, false);
        setChildrenDrawingOrderEnabled(true);
        setEnabled(typedArrayK.getBoolean(R.styleable.MaterialButtonToggleGroup_android_enabled, true));
        typedArrayK.recycle();
        j1.R1(this, 1);
    }

    private void c() {
        int firstVisibleChildIndex = getFirstVisibleChildIndex();
        if (firstVisibleChildIndex == -1) {
            return;
        }
        for (int i10 = firstVisibleChildIndex + 1; i10 < getChildCount(); i10++) {
            MaterialButton materialButtonJ = j(i10);
            int iMin = Math.min(materialButtonJ.getStrokeWidth(), j(i10 - 1).getStrokeWidth());
            LinearLayout.LayoutParams layoutParamsD = d(materialButtonJ);
            if (getOrientation() == 0) {
                s.g(layoutParamsD, 0);
                s.h(layoutParamsD, -iMin);
                layoutParamsD.topMargin = 0;
            } else {
                layoutParamsD.bottomMargin = 0;
                layoutParamsD.topMargin = -iMin;
                s.h(layoutParamsD, 0);
            }
            materialButtonJ.setLayoutParams(layoutParamsD);
        }
        r(firstVisibleChildIndex);
    }

    @n0
    private LinearLayout.LayoutParams d(@n0 View view) {
        ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
        return layoutParams instanceof LinearLayout.LayoutParams ? (LinearLayout.LayoutParams) layoutParams : new LinearLayout.LayoutParams(layoutParams.width, layoutParams.height);
    }

    private void f(@d0 int i10, boolean z10) {
        if (i10 == -1) {
            Log.e(f53372l, "Button ID is not valid: " + i10);
            return;
        }
        HashSet hashSet = new HashSet(this.f53383k);
        if (z10 && !hashSet.contains(Integer.valueOf(i10))) {
            if (this.f53380h && !hashSet.isEmpty()) {
                hashSet.clear();
            }
            hashSet.add(Integer.valueOf(i10));
        } else {
            if (z10 || !hashSet.contains(Integer.valueOf(i10))) {
                return;
            }
            if (!this.f53381i || hashSet.size() > 1) {
                hashSet.remove(Integer.valueOf(i10));
            }
        }
        v(hashSet);
    }

    private int getFirstVisibleChildIndex() {
        int childCount = getChildCount();
        for (int i10 = 0; i10 < childCount; i10++) {
            if (m(i10)) {
                return i10;
            }
        }
        return -1;
    }

    private int getLastVisibleChildIndex() {
        for (int childCount = getChildCount() - 1; childCount >= 0; childCount--) {
            if (m(childCount)) {
                return childCount;
            }
        }
        return -1;
    }

    private int getVisibleButtonCount() {
        int i10 = 0;
        for (int i11 = 0; i11 < getChildCount(); i11++) {
            if ((getChildAt(i11) instanceof MaterialButton) && m(i11)) {
                i10++;
            }
        }
        return i10;
    }

    private void i(@d0 int i10, boolean z10) {
        Iterator<d> it = this.f53376d.iterator();
        while (it.hasNext()) {
            it.next().a(this, i10, z10);
        }
    }

    private MaterialButton j(int i10) {
        return (MaterialButton) getChildAt(i10);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public int k(@p0 View view) {
        if (!(view instanceof MaterialButton)) {
            return -1;
        }
        int i10 = 0;
        for (int i11 = 0; i11 < getChildCount(); i11++) {
            if (getChildAt(i11) == view) {
                return i10;
            }
            if ((getChildAt(i11) instanceof MaterialButton) && m(i11)) {
                i10++;
            }
        }
        return -1;
    }

    @p0
    private c l(int i10, int i11, int i12) {
        c cVar = this.f53374b.get(i10);
        if (i11 == i12) {
            return cVar;
        }
        boolean z10 = getOrientation() == 0;
        if (i10 == i11) {
            return z10 ? c.e(cVar, this) : c.f(cVar);
        }
        if (i10 == i12) {
            return z10 ? c.b(cVar, this) : c.a(cVar);
        }
        return null;
    }

    private boolean m(int i10) {
        return getChildAt(i10).getVisibility() != 8;
    }

    private void r(int i10) {
        if (getChildCount() == 0 || i10 == -1) {
            return;
        }
        LinearLayout.LayoutParams layoutParams = (LinearLayout.LayoutParams) j(i10).getLayoutParams();
        if (getOrientation() == 1) {
            layoutParams.topMargin = 0;
            layoutParams.bottomMargin = 0;
        } else {
            s.g(layoutParams, 0);
            s.h(layoutParams, 0);
            layoutParams.leftMargin = 0;
            layoutParams.rightMargin = 0;
        }
    }

    private void s(@d0 int i10, boolean z10) {
        View viewFindViewById = findViewById(i10);
        if (viewFindViewById instanceof MaterialButton) {
            this.f53379g = true;
            ((MaterialButton) viewFindViewById).setChecked(z10);
            this.f53379g = false;
        }
    }

    private void setGeneratedIdIfNeeded(@n0 MaterialButton materialButton) {
        if (materialButton.getId() == -1) {
            materialButton.setId(j1.D());
        }
    }

    private void setupButtonChild(@n0 MaterialButton materialButton) {
        materialButton.setMaxLines(1);
        materialButton.setEllipsize(TextUtils.TruncateAt.END);
        materialButton.setCheckable(true);
        materialButton.setOnPressedChangeListenerInternal(this.f53375c);
        materialButton.setShouldDrawSurfaceColorStroke(true);
    }

    private static void u(p.b bVar, @p0 c cVar) {
        if (cVar == null) {
            bVar.o(0.0f);
        } else {
            bVar.L(cVar.f53387a).y(cVar.f53390d).Q(cVar.f53388b).D(cVar.f53389c);
        }
    }

    private void v(Set<Integer> set) {
        Set<Integer> set2 = this.f53383k;
        this.f53383k = new HashSet(set);
        for (int i10 = 0; i10 < getChildCount(); i10++) {
            int id2 = j(i10).getId();
            s(id2, set.contains(Integer.valueOf(id2)));
            if (set2.contains(Integer.valueOf(id2)) != set.contains(Integer.valueOf(id2))) {
                i(id2, set.contains(Integer.valueOf(id2)));
            }
        }
        invalidate();
    }

    private void w() {
        TreeMap treeMap = new TreeMap(this.f53377e);
        int childCount = getChildCount();
        for (int i10 = 0; i10 < childCount; i10++) {
            treeMap.put(j(i10), Integer.valueOf(i10));
        }
        this.f53378f = (Integer[]) treeMap.values().toArray(new Integer[0]);
    }

    private void y() {
        for (int i10 = 0; i10 < getChildCount(); i10++) {
            j(i10).setA11yClassName((this.f53380h ? RadioButton.class : ToggleButton.class).getName());
        }
    }

    @Override // android.view.ViewGroup
    public void addView(View view, int i10, ViewGroup.LayoutParams layoutParams) {
        if (!(view instanceof MaterialButton)) {
            Log.e(f53372l, "Child views must be of type MaterialButton.");
            return;
        }
        super.addView(view, i10, layoutParams);
        MaterialButton materialButton = (MaterialButton) view;
        setGeneratedIdIfNeeded(materialButton);
        setupButtonChild(materialButton);
        f(materialButton.getId(), materialButton.isChecked());
        p shapeAppearanceModel = materialButton.getShapeAppearanceModel();
        this.f53374b.add(new c(shapeAppearanceModel.r(), shapeAppearanceModel.j(), shapeAppearanceModel.t(), shapeAppearanceModel.l()));
        materialButton.setEnabled(isEnabled());
        j1.B1(materialButton, new b());
    }

    public void b(@n0 d dVar) {
        this.f53376d.add(dVar);
    }

    @Override // android.view.ViewGroup, android.view.View
    protected void dispatchDraw(@n0 Canvas canvas) {
        w();
        super.dispatchDraw(canvas);
    }

    public void e(@d0 int i10) {
        f(i10, true);
    }

    public void g() {
        v(new HashSet());
    }

    @d0
    public int getCheckedButtonId() {
        if (!this.f53380h || this.f53383k.isEmpty()) {
            return -1;
        }
        return this.f53383k.iterator().next().intValue();
    }

    @n0
    public List<Integer> getCheckedButtonIds() {
        ArrayList arrayList = new ArrayList();
        for (int i10 = 0; i10 < getChildCount(); i10++) {
            int id2 = j(i10).getId();
            if (this.f53383k.contains(Integer.valueOf(id2))) {
                arrayList.add(Integer.valueOf(id2));
            }
        }
        return arrayList;
    }

    @Override // android.view.ViewGroup
    protected int getChildDrawingOrder(int i10, int i11) {
        Integer[] numArr = this.f53378f;
        if (numArr != null && i11 < numArr.length) {
            return numArr[i11].intValue();
        }
        Log.w(f53372l, "Child order wasn't updated");
        return i11;
    }

    public void h() {
        this.f53376d.clear();
    }

    public boolean n() {
        return this.f53381i;
    }

    public boolean o() {
        return this.f53380h;
    }

    @Override // android.view.View
    protected void onFinishInflate() {
        super.onFinishInflate();
        int i10 = this.f53382j;
        if (i10 != -1) {
            v(Collections.singleton(Integer.valueOf(i10)));
        }
    }

    @Override // android.view.View
    public void onInitializeAccessibilityNodeInfo(@n0 AccessibilityNodeInfo accessibilityNodeInfo) {
        super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
        a0.g2(accessibilityNodeInfo).d1(a0.d.f(1, getVisibleButtonCount(), false, o() ? 1 : 2));
    }

    @Override // android.widget.LinearLayout, android.view.View
    protected void onMeasure(int i10, int i11) {
        x();
        c();
        super.onMeasure(i10, i11);
    }

    @Override // android.view.ViewGroup
    public void onViewRemoved(View view) {
        super.onViewRemoved(view);
        if (view instanceof MaterialButton) {
            ((MaterialButton) view).setOnPressedChangeListenerInternal(null);
        }
        int iIndexOfChild = indexOfChild(view);
        if (iIndexOfChild >= 0) {
            this.f53374b.remove(iIndexOfChild);
        }
        x();
        c();
    }

    void p(@n0 MaterialButton materialButton, boolean z10) {
        if (this.f53379g) {
            return;
        }
        f(materialButton.getId(), z10);
    }

    public void q(@n0 d dVar) {
        this.f53376d.remove(dVar);
    }

    @Override // android.view.View
    public void setEnabled(boolean z10) {
        super.setEnabled(z10);
        for (int i10 = 0; i10 < getChildCount(); i10++) {
            j(i10).setEnabled(z10);
        }
    }

    public void setSelectionRequired(boolean z10) {
        this.f53381i = z10;
    }

    public void setSingleSelection(@h int i10) {
        setSingleSelection(getResources().getBoolean(i10));
    }

    public void setSingleSelection(boolean z10) {
        if (this.f53380h != z10) {
            this.f53380h = z10;
            g();
        }
        y();
    }

    public void t(@d0 int i10) {
        f(i10, false);
    }

    @androidx.annotation.j1
    void x() {
        int childCount = getChildCount();
        int firstVisibleChildIndex = getFirstVisibleChildIndex();
        int lastVisibleChildIndex = getLastVisibleChildIndex();
        for (int i10 = 0; i10 < childCount; i10++) {
            MaterialButton materialButtonJ = j(i10);
            if (materialButtonJ.getVisibility() != 8) {
                p.b bVarV = materialButtonJ.getShapeAppearanceModel().v();
                u(bVarV, l(i10, firstVisibleChildIndex, lastVisibleChildIndex));
                materialButtonJ.setShapeAppearanceModel(bVarV.m());
            }
        }
    }
}
