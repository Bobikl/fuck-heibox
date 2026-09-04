package androidx.appcompat.view.menu;

import android.content.Context;
import android.os.Bundle;
import android.os.Parcelable;
import android.util.SparseArray;
import android.view.ContextThemeWrapper;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.BaseAdapter;
import android.widget.ListAdapter;
import androidx.annotation.RestrictTo;
import androidx.appcompat.R;
import java.util.ArrayList;

/* JADX INFO: compiled from: ListMenuPresenter.java */
/* JADX INFO: loaded from: classes.dex */
@RestrictTo({RestrictTo.Scope.LIBRARY_GROUP_PREFIX})
public class e implements m, AdapterView.OnItemClickListener {

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private static final String f2167l = "ListMenuPresenter";

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public static final String f2168m = "android:menu:list";

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    Context f2169b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    LayoutInflater f2170c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    g f2171d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    ExpandedMenuView f2172e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    int f2173f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    int f2174g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    int f2175h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private m.a f2176i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    a f2177j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private int f2178k;

    /* JADX INFO: compiled from: ListMenuPresenter.java */
    public class a extends BaseAdapter {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private int f2179b = -1;

        public a() {
            a();
        }

        void a() {
            j jVarY = e.this.f2171d.y();
            if (jVarY != null) {
                ArrayList<j> arrayListC = e.this.f2171d.C();
                int size = arrayListC.size();
                for (int i10 = 0; i10 < size; i10++) {
                    if (arrayListC.get(i10) == jVarY) {
                        this.f2179b = i10;
                        return;
                    }
                }
            }
            this.f2179b = -1;
        }

        @Override // android.widget.Adapter
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public j getItem(int i10) {
            ArrayList<j> arrayListC = e.this.f2171d.C();
            int i11 = i10 + e.this.f2173f;
            int i12 = this.f2179b;
            if (i12 >= 0 && i11 >= i12) {
                i11++;
            }
            return arrayListC.get(i11);
        }

        @Override // android.widget.Adapter
        public int getCount() {
            int size = e.this.f2171d.C().size() - e.this.f2173f;
            return this.f2179b < 0 ? size : size - 1;
        }

        @Override // android.widget.Adapter
        public long getItemId(int i10) {
            return i10;
        }

        @Override // android.widget.Adapter
        public View getView(int i10, View view, ViewGroup viewGroup) {
            if (view == null) {
                e eVar = e.this;
                view = eVar.f2170c.inflate(eVar.f2175h, viewGroup, false);
            }
            ((n.a) view).d(getItem(i10), 0);
            return view;
        }

        @Override // android.widget.BaseAdapter
        public void notifyDataSetChanged() {
            a();
            super.notifyDataSetChanged();
        }
    }

    public e(int i10, int i11) {
        this.f2175h = i10;
        this.f2174g = i11;
    }

    public e(Context context, int i10) {
        this(i10, 0);
        this.f2169b = context;
        this.f2170c = LayoutInflater.from(context);
    }

    @Override // androidx.appcompat.view.menu.m
    public void a(g gVar, boolean z10) {
        m.a aVar = this.f2176i;
        if (aVar != null) {
            aVar.a(gVar, z10);
        }
    }

    public ListAdapter b() {
        if (this.f2177j == null) {
            this.f2177j = new a();
        }
        return this.f2177j;
    }

    @Override // androidx.appcompat.view.menu.m
    public boolean c(g gVar, j jVar) {
        return false;
    }

    @Override // androidx.appcompat.view.menu.m
    public Parcelable d() {
        if (this.f2172e == null) {
            return null;
        }
        Bundle bundle = new Bundle();
        o(bundle);
        return bundle;
    }

    @Override // androidx.appcompat.view.menu.m
    public void e(boolean z10) {
        a aVar = this.f2177j;
        if (aVar != null) {
            aVar.notifyDataSetChanged();
        }
    }

    @Override // androidx.appcompat.view.menu.m
    public boolean f() {
        return false;
    }

    @Override // androidx.appcompat.view.menu.m
    public boolean g(g gVar, j jVar) {
        return false;
    }

    @Override // androidx.appcompat.view.menu.m
    public int getId() {
        return this.f2178k;
    }

    @Override // androidx.appcompat.view.menu.m
    public void h(Context context, g gVar) {
        if (this.f2174g != 0) {
            ContextThemeWrapper contextThemeWrapper = new ContextThemeWrapper(context, this.f2174g);
            this.f2169b = contextThemeWrapper;
            this.f2170c = LayoutInflater.from(contextThemeWrapper);
        } else if (this.f2169b != null) {
            this.f2169b = context;
            if (this.f2170c == null) {
                this.f2170c = LayoutInflater.from(context);
            }
        }
        this.f2171d = gVar;
        a aVar = this.f2177j;
        if (aVar != null) {
            aVar.notifyDataSetChanged();
        }
    }

    @Override // androidx.appcompat.view.menu.m
    public void i(m.a aVar) {
        this.f2176i = aVar;
    }

    int j() {
        return this.f2173f;
    }

    @Override // androidx.appcompat.view.menu.m
    public void k(Parcelable parcelable) {
        n((Bundle) parcelable);
    }

    @Override // androidx.appcompat.view.menu.m
    public boolean l(r rVar) {
        if (!rVar.hasVisibleItems()) {
            return false;
        }
        new h(rVar).e(null);
        m.a aVar = this.f2176i;
        if (aVar == null) {
            return true;
        }
        aVar.b(rVar);
        return true;
    }

    @Override // androidx.appcompat.view.menu.m
    public n m(ViewGroup viewGroup) {
        if (this.f2172e == null) {
            this.f2172e = (ExpandedMenuView) this.f2170c.inflate(R.layout.abc_expanded_menu_layout, viewGroup, false);
            if (this.f2177j == null) {
                this.f2177j = new a();
            }
            this.f2172e.setAdapter((ListAdapter) this.f2177j);
            this.f2172e.setOnItemClickListener(this);
        }
        return this.f2172e;
    }

    public void n(Bundle bundle) {
        SparseArray<Parcelable> sparseParcelableArray = bundle.getSparseParcelableArray(f2168m);
        if (sparseParcelableArray != null) {
            this.f2172e.restoreHierarchyState(sparseParcelableArray);
        }
    }

    public void o(Bundle bundle) {
        SparseArray<Parcelable> sparseArray = new SparseArray<>();
        ExpandedMenuView expandedMenuView = this.f2172e;
        if (expandedMenuView != null) {
            expandedMenuView.saveHierarchyState(sparseArray);
        }
        bundle.putSparseParcelableArray(f2168m, sparseArray);
    }

    @Override // android.widget.AdapterView.OnItemClickListener
    public void onItemClick(AdapterView<?> adapterView, View view, int i10, long j10) {
        this.f2171d.P(this.f2177j.getItem(i10), this, 0);
    }

    public void p(int i10) {
        this.f2178k = i10;
    }

    public void q(int i10) {
        this.f2173f = i10;
        if (this.f2172e != null) {
            e(false);
        }
    }
}
