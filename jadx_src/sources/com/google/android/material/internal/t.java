package com.google.android.material.internal;

import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.RippleDrawable;
import android.os.Bundle;
import android.os.Parcelable;
import android.util.SparseArray;
import android.view.LayoutInflater;
import android.view.SubMenu;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.annotation.RestrictTo;
import androidx.annotation.e1;
import androidx.annotation.n0;
import androidx.annotation.p0;
import androidx.annotation.t0;
import androidx.core.view.j1;
import androidx.core.view.n3;
import androidx.recyclerview.widget.RecyclerView;
import androidx.recyclerview.widget.RecyclerViewAccessibilityDelegate;
import com.google.android.material.R;
import java.util.ArrayList;

/* JADX INFO: compiled from: NavigationMenuPresenter.java */
/* JADX INFO: loaded from: classes7.dex */
@RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
public class t implements androidx.appcompat.view.menu.m {
    public static final int E = 0;
    private static final String F = "android:menu:list";
    private static final String G = "android:menu:adapter";
    private static final String H = "android:menu:header";
    private int A;
    int B;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private NavigationMenuView f54532b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    LinearLayout f54533c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private androidx.appcompat.view.menu.m.a f54534d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    androidx.appcompat.view.menu.g f54535e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private int f54536f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    c f54537g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    LayoutInflater f54538h;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    @p0
    ColorStateList f54540j;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    ColorStateList f54542l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    ColorStateList f54543m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    Drawable f54544n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    RippleDrawable f54545o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    int f54546p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    @t0
    int f54547q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    int f54548r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    int f54549s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    @t0
    int f54550t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    @t0
    int f54551u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    @t0
    int f54552v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    @t0
    int f54553w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    boolean f54554x;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    private int f54556z;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    int f54539i = 0;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    int f54541k = 0;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    boolean f54555y = true;
    private int C = -1;
    final View.OnClickListener D = new a();

    /* JADX INFO: compiled from: NavigationMenuPresenter.java */
    public class a implements View.OnClickListener {
        a() {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            boolean z10 = true;
            t.this.Z(true);
            androidx.appcompat.view.menu.j itemData = ((NavigationMenuItemView) view).getItemData();
            t tVar = t.this;
            boolean zP = tVar.f54535e.P(itemData, tVar, 0);
            if (itemData != null && itemData.isCheckable() && zP) {
                t.this.f54537g.y(itemData);
            } else {
                z10 = false;
            }
            t.this.Z(false);
            if (z10) {
                t.this.e(false);
            }
        }
    }

    /* JADX INFO: compiled from: NavigationMenuPresenter.java */
    public static class b extends l {
        public b(View view) {
            super(view);
        }
    }

    /* JADX INFO: compiled from: NavigationMenuPresenter.java */
    public class c extends RecyclerView.Adapter<l> {

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        private static final String f54558f = "android:menu:checked";

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        private static final String f54559g = "android:menu:action_views";

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        private static final int f54560h = 0;

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        private static final int f54561i = 1;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        private static final int f54562j = 2;

        /* JADX INFO: renamed from: k, reason: collision with root package name */
        private static final int f54563k = 3;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final ArrayList<e> f54564b = new ArrayList<>();

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private androidx.appcompat.view.menu.j f54565c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private boolean f54566d;

        /* JADX INFO: compiled from: NavigationMenuPresenter.java */
        public class a extends androidx.core.view.a {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            final /* synthetic */ int f54568a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            final /* synthetic */ boolean f54569b;

            a(int i10, boolean z10) {
                this.f54568a = i10;
                this.f54569b = z10;
            }

            @Override // androidx.core.view.a
            public void onInitializeAccessibilityNodeInfo(@n0 View view, @n0 androidx.core.view.accessibility.a0 a0Var) {
                super.onInitializeAccessibilityNodeInfo(view, a0Var);
                a0Var.e1(androidx.core.view.accessibility.a0.e.h(c.this.n(this.f54568a), 1, 1, 1, this.f54569b, view.isSelected()));
            }
        }

        c() {
            v();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public int n(int i10) {
            int i11 = i10;
            for (int i12 = 0; i12 < i10; i12++) {
                if (t.this.f54537g.getItemViewType(i12) == 2) {
                    i11--;
                }
            }
            return t.this.f54533c.getChildCount() == 0 ? i11 - 1 : i11;
        }

        private void o(int i10, int i11) {
            while (i10 < i11) {
                ((g) this.f54564b.get(i10)).f54574b = true;
                i10++;
            }
        }

        private void v() {
            if (this.f54566d) {
                return;
            }
            boolean z10 = true;
            this.f54566d = true;
            this.f54564b.clear();
            this.f54564b.add(new d());
            int i10 = -1;
            int size = t.this.f54535e.H().size();
            int i11 = 0;
            boolean z11 = false;
            int size2 = 0;
            while (i11 < size) {
                androidx.appcompat.view.menu.j jVar = t.this.f54535e.H().get(i11);
                if (jVar.isChecked()) {
                    y(jVar);
                }
                if (jVar.isCheckable()) {
                    jVar.w(false);
                }
                if (jVar.hasSubMenu()) {
                    SubMenu subMenu = jVar.getSubMenu();
                    if (subMenu.hasVisibleItems()) {
                        if (i11 != 0) {
                            this.f54564b.add(new f(t.this.B, 0));
                        }
                        this.f54564b.add(new g(jVar));
                        int size3 = this.f54564b.size();
                        int size4 = subMenu.size();
                        int i12 = 0;
                        boolean z12 = false;
                        while (i12 < size4) {
                            androidx.appcompat.view.menu.j jVar2 = (androidx.appcompat.view.menu.j) subMenu.getItem(i12);
                            if (jVar2.isVisible()) {
                                if (!z12 && jVar2.getIcon() != null) {
                                    z12 = z10;
                                }
                                if (jVar2.isCheckable()) {
                                    jVar2.w(false);
                                }
                                if (jVar.isChecked()) {
                                    y(jVar);
                                }
                                this.f54564b.add(new g(jVar2));
                            }
                            i12++;
                            z10 = true;
                        }
                        if (z12) {
                            o(size3, this.f54564b.size());
                        }
                    }
                } else {
                    int groupId = jVar.getGroupId();
                    if (groupId != i10) {
                        size2 = this.f54564b.size();
                        z11 = jVar.getIcon() != null;
                        if (i11 != 0) {
                            size2++;
                            ArrayList<e> arrayList = this.f54564b;
                            int i13 = t.this.B;
                            arrayList.add(new f(i13, i13));
                        }
                    } else if (!z11 && jVar.getIcon() != null) {
                        o(size2, this.f54564b.size());
                        z11 = true;
                    }
                    g gVar = new g(jVar);
                    gVar.f54574b = z11;
                    this.f54564b.add(gVar);
                    i10 = groupId;
                }
                i11++;
                z10 = true;
            }
            this.f54566d = false;
        }

        private void x(View view, int i10, boolean z10) {
            j1.B1(view, new a(i10, z10));
        }

        public void A() {
            v();
            notifyDataSetChanged();
        }

        @Override // androidx.recyclerview.widget.RecyclerView.Adapter
        public int getItemCount() {
            return this.f54564b.size();
        }

        @Override // androidx.recyclerview.widget.RecyclerView.Adapter
        public long getItemId(int i10) {
            return i10;
        }

        @Override // androidx.recyclerview.widget.RecyclerView.Adapter
        public int getItemViewType(int i10) {
            e eVar = this.f54564b.get(i10);
            if (eVar instanceof f) {
                return 2;
            }
            if (eVar instanceof d) {
                return 3;
            }
            if (eVar instanceof g) {
                return ((g) eVar).a().hasSubMenu() ? 1 : 0;
            }
            throw new RuntimeException("Unknown item type.");
        }

        @n0
        public Bundle p() {
            Bundle bundle = new Bundle();
            androidx.appcompat.view.menu.j jVar = this.f54565c;
            if (jVar != null) {
                bundle.putInt(f54558f, jVar.getItemId());
            }
            SparseArray<? extends Parcelable> sparseArray = new SparseArray<>();
            int size = this.f54564b.size();
            for (int i10 = 0; i10 < size; i10++) {
                e eVar = this.f54564b.get(i10);
                if (eVar instanceof g) {
                    androidx.appcompat.view.menu.j jVarA = ((g) eVar).a();
                    View actionView = jVarA != null ? jVarA.getActionView() : null;
                    if (actionView != null) {
                        ParcelableSparseArray parcelableSparseArray = new ParcelableSparseArray();
                        actionView.saveHierarchyState(parcelableSparseArray);
                        sparseArray.put(jVarA.getItemId(), parcelableSparseArray);
                    }
                }
            }
            bundle.putSparseParcelableArray(f54559g, sparseArray);
            return bundle;
        }

        public androidx.appcompat.view.menu.j q() {
            return this.f54565c;
        }

        int r() {
            int i10 = t.this.f54533c.getChildCount() == 0 ? 0 : 1;
            for (int i11 = 0; i11 < t.this.f54537g.getItemCount(); i11++) {
                int itemViewType = t.this.f54537g.getItemViewType(i11);
                if (itemViewType == 0 || itemViewType == 1) {
                    i10++;
                }
            }
            return i10;
        }

        @Override // androidx.recyclerview.widget.RecyclerView.Adapter
        /* JADX INFO: renamed from: s, reason: merged with bridge method [inline-methods] */
        public void onBindViewHolder(@n0 l lVar, int i10) {
            int itemViewType = getItemViewType(i10);
            if (itemViewType != 0) {
                if (itemViewType != 1) {
                    if (itemViewType == 2) {
                        f fVar = (f) this.f54564b.get(i10);
                        lVar.itemView.setPadding(t.this.f54550t, fVar.b(), t.this.f54551u, fVar.a());
                        return;
                    } else {
                        if (itemViewType != 3) {
                            return;
                        }
                        x(lVar.itemView, i10, true);
                        return;
                    }
                }
                TextView textView = (TextView) lVar.itemView;
                textView.setText(((g) this.f54564b.get(i10)).a().getTitle());
                int i11 = t.this.f54539i;
                if (i11 != 0) {
                    androidx.core.widget.q.E(textView, i11);
                }
                textView.setPadding(t.this.f54552v, textView.getPaddingTop(), t.this.f54553w, textView.getPaddingBottom());
                ColorStateList colorStateList = t.this.f54540j;
                if (colorStateList != null) {
                    textView.setTextColor(colorStateList);
                }
                x(textView, i10, true);
                return;
            }
            NavigationMenuItemView navigationMenuItemView = (NavigationMenuItemView) lVar.itemView;
            navigationMenuItemView.setIconTintList(t.this.f54543m);
            int i12 = t.this.f54541k;
            if (i12 != 0) {
                navigationMenuItemView.setTextAppearance(i12);
            }
            ColorStateList colorStateList2 = t.this.f54542l;
            if (colorStateList2 != null) {
                navigationMenuItemView.setTextColor(colorStateList2);
            }
            Drawable drawable = t.this.f54544n;
            j1.I1(navigationMenuItemView, drawable != null ? drawable.getConstantState().newDrawable() : null);
            RippleDrawable rippleDrawable = t.this.f54545o;
            if (rippleDrawable != null) {
                navigationMenuItemView.setForeground(rippleDrawable.getConstantState().newDrawable());
            }
            g gVar = (g) this.f54564b.get(i10);
            navigationMenuItemView.setNeedsEmptyIcon(gVar.f54574b);
            t tVar = t.this;
            int i13 = tVar.f54546p;
            int i14 = tVar.f54547q;
            navigationMenuItemView.setPadding(i13, i14, i13, i14);
            navigationMenuItemView.setIconPadding(t.this.f54548r);
            t tVar2 = t.this;
            if (tVar2.f54554x) {
                navigationMenuItemView.setIconSize(tVar2.f54549s);
            }
            navigationMenuItemView.setMaxLines(t.this.f54556z);
            navigationMenuItemView.d(gVar.a(), 0);
            x(navigationMenuItemView, i10, false);
        }

        @Override // androidx.recyclerview.widget.RecyclerView.Adapter
        @p0
        /* JADX INFO: renamed from: t, reason: merged with bridge method [inline-methods] */
        public l onCreateViewHolder(ViewGroup viewGroup, int i10) {
            if (i10 == 0) {
                t tVar = t.this;
                return new i(tVar.f54538h, viewGroup, tVar.D);
            }
            if (i10 == 1) {
                return new k(t.this.f54538h, viewGroup);
            }
            if (i10 == 2) {
                return new j(t.this.f54538h, viewGroup);
            }
            if (i10 != 3) {
                return null;
            }
            return new b(t.this.f54533c);
        }

        @Override // androidx.recyclerview.widget.RecyclerView.Adapter
        /* JADX INFO: renamed from: u, reason: merged with bridge method [inline-methods] */
        public void onViewRecycled(l lVar) {
            if (lVar instanceof i) {
                ((NavigationMenuItemView) lVar.itemView).E();
            }
        }

        public void w(@n0 Bundle bundle) {
            androidx.appcompat.view.menu.j jVarA;
            View actionView;
            ParcelableSparseArray parcelableSparseArray;
            androidx.appcompat.view.menu.j jVarA2;
            int i10 = bundle.getInt(f54558f, 0);
            if (i10 != 0) {
                this.f54566d = true;
                int size = this.f54564b.size();
                for (int i11 = 0; i11 < size; i11++) {
                    e eVar = this.f54564b.get(i11);
                    if ((eVar instanceof g) && (jVarA2 = ((g) eVar).a()) != null && jVarA2.getItemId() == i10) {
                        y(jVarA2);
                        break;
                    }
                }
                this.f54566d = false;
                v();
            }
            SparseArray sparseParcelableArray = bundle.getSparseParcelableArray(f54559g);
            if (sparseParcelableArray != null) {
                int size2 = this.f54564b.size();
                for (int i12 = 0; i12 < size2; i12++) {
                    e eVar2 = this.f54564b.get(i12);
                    if ((eVar2 instanceof g) && (jVarA = ((g) eVar2).a()) != null && (actionView = jVarA.getActionView()) != null && (parcelableSparseArray = (ParcelableSparseArray) sparseParcelableArray.get(jVarA.getItemId())) != null) {
                        actionView.restoreHierarchyState(parcelableSparseArray);
                    }
                }
            }
        }

        public void y(@n0 androidx.appcompat.view.menu.j jVar) {
            if (this.f54565c == jVar || !jVar.isCheckable()) {
                return;
            }
            androidx.appcompat.view.menu.j jVar2 = this.f54565c;
            if (jVar2 != null) {
                jVar2.setChecked(false);
            }
            this.f54565c = jVar;
            jVar.setChecked(true);
        }

        public void z(boolean z10) {
            this.f54566d = z10;
        }
    }

    /* JADX INFO: compiled from: NavigationMenuPresenter.java */
    public static class d implements e {
        d() {
        }
    }

    /* JADX INFO: compiled from: NavigationMenuPresenter.java */
    public interface e {
    }

    /* JADX INFO: compiled from: NavigationMenuPresenter.java */
    public static class f implements e {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final int f54571a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final int f54572b;

        public f(int i10, int i11) {
            this.f54571a = i10;
            this.f54572b = i11;
        }

        public int a() {
            return this.f54572b;
        }

        public int b() {
            return this.f54571a;
        }
    }

    /* JADX INFO: compiled from: NavigationMenuPresenter.java */
    public static class g implements e {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final androidx.appcompat.view.menu.j f54573a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        boolean f54574b;

        g(androidx.appcompat.view.menu.j jVar) {
            this.f54573a = jVar;
        }

        public androidx.appcompat.view.menu.j a() {
            return this.f54573a;
        }
    }

    /* JADX INFO: compiled from: NavigationMenuPresenter.java */
    public class h extends RecyclerViewAccessibilityDelegate {
        h(RecyclerView recyclerView) {
            super(recyclerView);
        }

        @Override // androidx.recyclerview.widget.RecyclerViewAccessibilityDelegate, androidx.core.view.a
        public void onInitializeAccessibilityNodeInfo(View view, @n0 androidx.core.view.accessibility.a0 a0Var) {
            super.onInitializeAccessibilityNodeInfo(view, a0Var);
            a0Var.d1(androidx.core.view.accessibility.a0.d.e(t.this.f54537g.r(), 1, false));
        }
    }

    /* JADX INFO: compiled from: NavigationMenuPresenter.java */
    public static class i extends l {
        public i(@n0 LayoutInflater layoutInflater, ViewGroup viewGroup, View.OnClickListener onClickListener) {
            super(layoutInflater.inflate(R.layout.design_navigation_item, viewGroup, false));
            this.itemView.setOnClickListener(onClickListener);
        }
    }

    /* JADX INFO: compiled from: NavigationMenuPresenter.java */
    public static class j extends l {
        public j(@n0 LayoutInflater layoutInflater, ViewGroup viewGroup) {
            super(layoutInflater.inflate(R.layout.design_navigation_item_separator, viewGroup, false));
        }
    }

    /* JADX INFO: compiled from: NavigationMenuPresenter.java */
    public static class k extends l {
        public k(@n0 LayoutInflater layoutInflater, ViewGroup viewGroup) {
            super(layoutInflater.inflate(R.layout.design_navigation_item_subheader, viewGroup, false));
        }
    }

    /* JADX INFO: compiled from: NavigationMenuPresenter.java */
    public static abstract class l extends RecyclerView.ViewHolder {
        public l(View view) {
            super(view);
        }
    }

    private void a0() {
        int i10 = (this.f54533c.getChildCount() == 0 && this.f54555y) ? this.A : 0;
        NavigationMenuView navigationMenuView = this.f54532b;
        navigationMenuView.setPadding(0, i10, 0, navigationMenuView.getPaddingBottom());
    }

    @t0
    public int A() {
        return this.f54553w;
    }

    @t0
    public int B() {
        return this.f54552v;
    }

    public View C(@androidx.annotation.i0 int i10) {
        View viewInflate = this.f54538h.inflate(i10, (ViewGroup) this.f54533c, false);
        j(viewInflate);
        return viewInflate;
    }

    public boolean D() {
        return this.f54555y;
    }

    public void E(@n0 View view) {
        this.f54533c.removeView(view);
        if (this.f54533c.getChildCount() == 0) {
            NavigationMenuView navigationMenuView = this.f54532b;
            navigationMenuView.setPadding(0, this.A, 0, navigationMenuView.getPaddingBottom());
        }
    }

    public void F(boolean z10) {
        if (this.f54555y != z10) {
            this.f54555y = z10;
            a0();
        }
    }

    public void G(@n0 androidx.appcompat.view.menu.j jVar) {
        this.f54537g.y(jVar);
    }

    public void H(@t0 int i10) {
        this.f54551u = i10;
        e(false);
    }

    public void I(@t0 int i10) {
        this.f54550t = i10;
        e(false);
    }

    public void J(int i10) {
        this.f54536f = i10;
    }

    public void K(@p0 Drawable drawable) {
        this.f54544n = drawable;
        e(false);
    }

    public void L(@p0 RippleDrawable rippleDrawable) {
        this.f54545o = rippleDrawable;
        e(false);
    }

    public void M(int i10) {
        this.f54546p = i10;
        e(false);
    }

    public void N(int i10) {
        this.f54548r = i10;
        e(false);
    }

    public void O(@androidx.annotation.r int i10) {
        if (this.f54549s != i10) {
            this.f54549s = i10;
            this.f54554x = true;
            e(false);
        }
    }

    public void P(@p0 ColorStateList colorStateList) {
        this.f54543m = colorStateList;
        e(false);
    }

    public void Q(int i10) {
        this.f54556z = i10;
        e(false);
    }

    public void R(@e1 int i10) {
        this.f54541k = i10;
        e(false);
    }

    public void S(@p0 ColorStateList colorStateList) {
        this.f54542l = colorStateList;
        e(false);
    }

    public void T(@t0 int i10) {
        this.f54547q = i10;
        e(false);
    }

    public void U(int i10) {
        this.C = i10;
        NavigationMenuView navigationMenuView = this.f54532b;
        if (navigationMenuView != null) {
            navigationMenuView.setOverScrollMode(i10);
        }
    }

    public void V(@p0 ColorStateList colorStateList) {
        this.f54540j = colorStateList;
        e(false);
    }

    public void W(@t0 int i10) {
        this.f54553w = i10;
        e(false);
    }

    public void X(@t0 int i10) {
        this.f54552v = i10;
        e(false);
    }

    public void Y(@e1 int i10) {
        this.f54539i = i10;
        e(false);
    }

    public void Z(boolean z10) {
        c cVar = this.f54537g;
        if (cVar != null) {
            cVar.z(z10);
        }
    }

    @Override // androidx.appcompat.view.menu.m
    public void a(androidx.appcompat.view.menu.g gVar, boolean z10) {
        androidx.appcompat.view.menu.m.a aVar = this.f54534d;
        if (aVar != null) {
            aVar.a(gVar, z10);
        }
    }

    @Override // androidx.appcompat.view.menu.m
    public boolean c(androidx.appcompat.view.menu.g gVar, androidx.appcompat.view.menu.j jVar) {
        return false;
    }

    @Override // androidx.appcompat.view.menu.m
    @n0
    public Parcelable d() {
        Bundle bundle = new Bundle();
        if (this.f54532b != null) {
            SparseArray<Parcelable> sparseArray = new SparseArray<>();
            this.f54532b.saveHierarchyState(sparseArray);
            bundle.putSparseParcelableArray("android:menu:list", sparseArray);
        }
        c cVar = this.f54537g;
        if (cVar != null) {
            bundle.putBundle(G, cVar.p());
        }
        if (this.f54533c != null) {
            SparseArray<Parcelable> sparseArray2 = new SparseArray<>();
            this.f54533c.saveHierarchyState(sparseArray2);
            bundle.putSparseParcelableArray(H, sparseArray2);
        }
        return bundle;
    }

    @Override // androidx.appcompat.view.menu.m
    public void e(boolean z10) {
        c cVar = this.f54537g;
        if (cVar != null) {
            cVar.A();
        }
    }

    @Override // androidx.appcompat.view.menu.m
    public boolean f() {
        return false;
    }

    @Override // androidx.appcompat.view.menu.m
    public boolean g(androidx.appcompat.view.menu.g gVar, androidx.appcompat.view.menu.j jVar) {
        return false;
    }

    @Override // androidx.appcompat.view.menu.m
    public int getId() {
        return this.f54536f;
    }

    @Override // androidx.appcompat.view.menu.m
    public void h(@n0 Context context, @n0 androidx.appcompat.view.menu.g gVar) {
        this.f54538h = LayoutInflater.from(context);
        this.f54535e = gVar;
        this.B = context.getResources().getDimensionPixelOffset(R.dimen.design_navigation_separator_vertical_padding);
    }

    @Override // androidx.appcompat.view.menu.m
    public void i(androidx.appcompat.view.menu.m.a aVar) {
        this.f54534d = aVar;
    }

    public void j(@n0 View view) {
        this.f54533c.addView(view);
        NavigationMenuView navigationMenuView = this.f54532b;
        navigationMenuView.setPadding(0, 0, 0, navigationMenuView.getPaddingBottom());
    }

    @Override // androidx.appcompat.view.menu.m
    public void k(Parcelable parcelable) {
        if (parcelable instanceof Bundle) {
            Bundle bundle = (Bundle) parcelable;
            SparseArray<Parcelable> sparseParcelableArray = bundle.getSparseParcelableArray("android:menu:list");
            if (sparseParcelableArray != null) {
                this.f54532b.restoreHierarchyState(sparseParcelableArray);
            }
            Bundle bundle2 = bundle.getBundle(G);
            if (bundle2 != null) {
                this.f54537g.w(bundle2);
            }
            SparseArray<Parcelable> sparseParcelableArray2 = bundle.getSparseParcelableArray(H);
            if (sparseParcelableArray2 != null) {
                this.f54533c.restoreHierarchyState(sparseParcelableArray2);
            }
        }
    }

    @Override // androidx.appcompat.view.menu.m
    public boolean l(androidx.appcompat.view.menu.r rVar) {
        return false;
    }

    @Override // androidx.appcompat.view.menu.m
    public androidx.appcompat.view.menu.n m(ViewGroup viewGroup) {
        if (this.f54532b == null) {
            NavigationMenuView navigationMenuView = (NavigationMenuView) this.f54538h.inflate(R.layout.design_navigation_menu, viewGroup, false);
            this.f54532b = navigationMenuView;
            navigationMenuView.setAccessibilityDelegateCompat(new h(this.f54532b));
            if (this.f54537g == null) {
                this.f54537g = new c();
            }
            int i10 = this.C;
            if (i10 != -1) {
                this.f54532b.setOverScrollMode(i10);
            }
            this.f54533c = (LinearLayout) this.f54538h.inflate(R.layout.design_navigation_item_header, (ViewGroup) this.f54532b, false);
            this.f54532b.setAdapter(this.f54537g);
        }
        return this.f54532b;
    }

    public void n(@n0 n3 n3Var) {
        int iR = n3Var.r();
        if (this.A != iR) {
            this.A = iR;
            a0();
        }
        NavigationMenuView navigationMenuView = this.f54532b;
        navigationMenuView.setPadding(0, navigationMenuView.getPaddingTop(), 0, n3Var.o());
        j1.p(this.f54533c, n3Var);
    }

    @p0
    public androidx.appcompat.view.menu.j o() {
        return this.f54537g.q();
    }

    @t0
    public int p() {
        return this.f54551u;
    }

    @t0
    public int q() {
        return this.f54550t;
    }

    public int r() {
        return this.f54533c.getChildCount();
    }

    public View s(int i10) {
        return this.f54533c.getChildAt(i10);
    }

    @p0
    public Drawable t() {
        return this.f54544n;
    }

    public int u() {
        return this.f54546p;
    }

    public int v() {
        return this.f54548r;
    }

    public int w() {
        return this.f54556z;
    }

    @p0
    public ColorStateList x() {
        return this.f54542l;
    }

    @p0
    public ColorStateList y() {
        return this.f54543m;
    }

    @t0
    public int z() {
        return this.f54547q;
    }
}
