package com.google.android.material.tabs;

import androidx.annotation.n0;
import androidx.annotation.p0;
import androidx.recyclerview.widget.RecyclerView;
import androidx.viewpager2.widget.ViewPager2;
import java.lang.ref.WeakReference;

/* JADX INFO: compiled from: TabLayoutMediator.java */
/* JADX INFO: loaded from: classes7.dex */
public final class d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @n0
    private final TabLayout f55502a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @n0
    private final ViewPager2 f55503b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final boolean f55504c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final boolean f55505d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final b f55506e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    @p0
    private RecyclerView.Adapter<?> f55507f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private boolean f55508g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    @p0
    private c f55509h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    @p0
    private TabLayout.f f55510i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    @p0
    private RecyclerView.AdapterDataObserver f55511j;

    /* JADX INFO: compiled from: TabLayoutMediator.java */
    public class a extends RecyclerView.AdapterDataObserver {
        a() {
        }

        @Override // androidx.recyclerview.widget.RecyclerView.AdapterDataObserver
        public void onChanged() {
            d.this.d();
        }

        @Override // androidx.recyclerview.widget.RecyclerView.AdapterDataObserver
        public void onItemRangeChanged(int i10, int i11) {
            d.this.d();
        }

        @Override // androidx.recyclerview.widget.RecyclerView.AdapterDataObserver
        public void onItemRangeChanged(int i10, int i11, @p0 Object obj) {
            d.this.d();
        }

        @Override // androidx.recyclerview.widget.RecyclerView.AdapterDataObserver
        public void onItemRangeInserted(int i10, int i11) {
            d.this.d();
        }

        @Override // androidx.recyclerview.widget.RecyclerView.AdapterDataObserver
        public void onItemRangeMoved(int i10, int i11, int i12) {
            d.this.d();
        }

        @Override // androidx.recyclerview.widget.RecyclerView.AdapterDataObserver
        public void onItemRangeRemoved(int i10, int i11) {
            d.this.d();
        }
    }

    /* JADX INFO: compiled from: TabLayoutMediator.java */
    public interface b {
        void a(@n0 TabLayout.h hVar, int i10);
    }

    /* JADX INFO: compiled from: TabLayoutMediator.java */
    public static class c extends ViewPager2.OnPageChangeCallback {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        @n0
        private final WeakReference<TabLayout> f55513a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private int f55514b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private int f55515c;

        c(TabLayout tabLayout) {
            this.f55513a = new WeakReference<>(tabLayout);
            a();
        }

        void a() {
            this.f55515c = 0;
            this.f55514b = 0;
        }

        @Override // androidx.viewpager2.widget.ViewPager2.OnPageChangeCallback
        public void onPageScrollStateChanged(int i10) {
            this.f55514b = this.f55515c;
            this.f55515c = i10;
            TabLayout tabLayout = this.f55513a.get();
            if (tabLayout != null) {
                tabLayout.Z(this.f55515c);
            }
        }

        @Override // androidx.viewpager2.widget.ViewPager2.OnPageChangeCallback
        public void onPageScrolled(int i10, float f10, int i11) {
            TabLayout tabLayout = this.f55513a.get();
            if (tabLayout != null) {
                int i12 = this.f55515c;
                tabLayout.U(i10, f10, i12 != 2 || this.f55514b == 1, (i12 == 2 && this.f55514b == 0) ? false : true, false);
            }
        }

        @Override // androidx.viewpager2.widget.ViewPager2.OnPageChangeCallback
        public void onPageSelected(int i10) {
            TabLayout tabLayout = this.f55513a.get();
            if (tabLayout == null || tabLayout.getSelectedTabPosition() == i10 || i10 >= tabLayout.getTabCount()) {
                return;
            }
            int i11 = this.f55515c;
            tabLayout.S(tabLayout.D(i10), i11 == 0 || (i11 == 2 && this.f55514b == 0));
        }
    }

    /* JADX INFO: renamed from: com.google.android.material.tabs.d$d, reason: collision with other inner class name */
    /* JADX INFO: compiled from: TabLayoutMediator.java */
    public static class C0432d implements TabLayout.f {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final ViewPager2 f55516a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final boolean f55517b;

        C0432d(ViewPager2 viewPager2, boolean z10) {
            this.f55516a = viewPager2;
            this.f55517b = z10;
        }

        @Override // com.google.android.material.tabs.TabLayout.c
        public void a(@n0 TabLayout.h hVar) {
            this.f55516a.setCurrentItem(hVar.k(), this.f55517b);
        }

        @Override // com.google.android.material.tabs.TabLayout.c
        public void b(TabLayout.h hVar) {
        }

        @Override // com.google.android.material.tabs.TabLayout.c
        public void c(TabLayout.h hVar) {
        }
    }

    public d(@n0 TabLayout tabLayout, @n0 ViewPager2 viewPager2, @n0 b bVar) {
        this(tabLayout, viewPager2, true, bVar);
    }

    public d(@n0 TabLayout tabLayout, @n0 ViewPager2 viewPager2, boolean z10, @n0 b bVar) {
        this(tabLayout, viewPager2, z10, true, bVar);
    }

    public d(@n0 TabLayout tabLayout, @n0 ViewPager2 viewPager2, boolean z10, boolean z11, @n0 b bVar) {
        this.f55502a = tabLayout;
        this.f55503b = viewPager2;
        this.f55504c = z10;
        this.f55505d = z11;
        this.f55506e = bVar;
    }

    public void a() {
        if (this.f55508g) {
            throw new IllegalStateException("TabLayoutMediator is already attached");
        }
        RecyclerView.Adapter<?> adapter = this.f55503b.getAdapter();
        this.f55507f = adapter;
        if (adapter == null) {
            throw new IllegalStateException("TabLayoutMediator attached before ViewPager2 has an adapter");
        }
        this.f55508g = true;
        c cVar = new c(this.f55502a);
        this.f55509h = cVar;
        this.f55503b.registerOnPageChangeCallback(cVar);
        C0432d c0432d = new C0432d(this.f55503b, this.f55505d);
        this.f55510i = c0432d;
        this.f55502a.h(c0432d);
        if (this.f55504c) {
            a aVar = new a();
            this.f55511j = aVar;
            this.f55507f.registerAdapterDataObserver(aVar);
        }
        d();
        this.f55502a.setScrollPosition(this.f55503b.getCurrentItem(), 0.0f, true);
    }

    public void b() {
        RecyclerView.Adapter<?> adapter;
        if (this.f55504c && (adapter = this.f55507f) != null) {
            adapter.unregisterAdapterDataObserver(this.f55511j);
            this.f55511j = null;
        }
        this.f55502a.N(this.f55510i);
        this.f55503b.unregisterOnPageChangeCallback(this.f55509h);
        this.f55510i = null;
        this.f55509h = null;
        this.f55507f = null;
        this.f55508g = false;
    }

    public boolean c() {
        return this.f55508g;
    }

    void d() {
        this.f55502a.L();
        RecyclerView.Adapter<?> adapter = this.f55507f;
        if (adapter != null) {
            int itemCount = adapter.getItemCount();
            for (int i10 = 0; i10 < itemCount; i10++) {
                TabLayout.h hVarI = this.f55502a.I();
                this.f55506e.a(hVarI, i10);
                this.f55502a.l(hVarI, false);
            }
            if (itemCount > 0) {
                int iMin = Math.min(this.f55503b.getCurrentItem(), this.f55502a.getTabCount() - 1);
                if (iMin != this.f55502a.getSelectedTabPosition()) {
                    TabLayout tabLayout = this.f55502a;
                    tabLayout.R(tabLayout.D(iMin));
                }
            }
        }
    }
}
