package com.max.hbcustomview.viewpager2.adapter;

import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.os.Parcelable;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.widget.FrameLayout;
import androidx.annotation.i;
import androidx.annotation.n0;
import androidx.collection.x0;
import androidx.core.util.o;
import androidx.core.view.j1;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentActivity;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.p0;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.v;
import androidx.lifecycle.y;
import androidx.recyclerview.widget.RecyclerView;
import com.max.hbcustomview.viewpager2.widget.HBViewPager2;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.PatchProxyResult;
import java.util.Iterator;

/* JADX INFO: loaded from: classes10.dex */
public abstract class HBFragmentStateAdapter extends RecyclerView.Adapter<com.max.hbcustomview.viewpager2.adapter.a> implements com.max.hbcustomview.viewpager2.adapter.b {
    public static ChangeQuickRedirect changeQuickRedirect = null;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private static final String f69694j = "f#";

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private static final String f69695k = "s#";

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private static final long f69696l = 10000;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    final Lifecycle f69697b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    final FragmentManager f69698c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    final x0<Fragment> f69699d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final x0<Fragment.SavedState> f69700e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final x0<Integer> f69701f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private FragmentMaxLifecycleEnforcer f69702g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    boolean f69703h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private boolean f69704i;

    public class FragmentMaxLifecycleEnforcer {
        public static ChangeQuickRedirect changeQuickRedirect;

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private HBViewPager2.i f69710a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private RecyclerView.AdapterDataObserver f69711b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private v f69712c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private HBViewPager2 f69713d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        private long f69714e = -1;

        public class a extends HBViewPager2.i {
            public static ChangeQuickRedirect changeQuickRedirect;

            a() {
            }

            @Override // com.max.hbcustomview.viewpager2.widget.HBViewPager2.i
            public void a(int i10) {
                if (PatchProxy.proxy(new Object[]{new Integer(i10)}, this, changeQuickRedirect, false, bb.c.f.Rw, new Class[]{Integer.TYPE}, Void.TYPE).isSupported) {
                    return;
                }
                FragmentMaxLifecycleEnforcer.this.d(false);
            }

            @Override // com.max.hbcustomview.viewpager2.widget.HBViewPager2.i
            public void c(int i10) {
                if (PatchProxy.proxy(new Object[]{new Integer(i10)}, this, changeQuickRedirect, false, bb.c.f.Sw, new Class[]{Integer.TYPE}, Void.TYPE).isSupported) {
                    return;
                }
                FragmentMaxLifecycleEnforcer.this.d(false);
            }
        }

        public class b extends d {
            public static ChangeQuickRedirect changeQuickRedirect;

            b() {
                super(null);
            }

            @Override // com.max.hbcustomview.viewpager2.adapter.HBFragmentStateAdapter.d, androidx.recyclerview.widget.RecyclerView.AdapterDataObserver
            public void onChanged() {
                if (PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, bb.c.f.Tw, new Class[0], Void.TYPE).isSupported) {
                    return;
                }
                FragmentMaxLifecycleEnforcer.this.d(true);
            }
        }

        FragmentMaxLifecycleEnforcer() {
        }

        @n0
        private HBViewPager2 a(@n0 RecyclerView recyclerView) {
            PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{recyclerView}, this, changeQuickRedirect, false, bb.c.f.Qw, new Class[]{RecyclerView.class}, HBViewPager2.class);
            if (patchProxyResultProxy.isSupported) {
                return (HBViewPager2) patchProxyResultProxy.result;
            }
            ViewParent parent = recyclerView.getParent();
            if (parent instanceof HBViewPager2) {
                return (HBViewPager2) parent;
            }
            throw new IllegalStateException("Expected ViewPager2 instance. Got: " + parent);
        }

        void b(@n0 RecyclerView recyclerView) {
            if (PatchProxy.proxy(new Object[]{recyclerView}, this, changeQuickRedirect, false, bb.c.f.Nw, new Class[]{RecyclerView.class}, Void.TYPE).isSupported) {
                return;
            }
            this.f69713d = a(recyclerView);
            a aVar = new a();
            this.f69710a = aVar;
            this.f69713d.n(aVar);
            b bVar = new b();
            this.f69711b = bVar;
            HBFragmentStateAdapter.this.registerAdapterDataObserver(bVar);
            v vVar = new v() { // from class: com.max.hbcustomview.viewpager2.adapter.HBFragmentStateAdapter.FragmentMaxLifecycleEnforcer.3
                public static ChangeQuickRedirect changeQuickRedirect;

                @Override // androidx.lifecycle.v
                public void d(@n0 y yVar, @n0 Lifecycle.Event event) {
                    if (PatchProxy.proxy(new Object[]{yVar, event}, this, changeQuickRedirect, false, bb.c.f.Uw, new Class[]{y.class, Lifecycle.Event.class}, Void.TYPE).isSupported) {
                        return;
                    }
                    FragmentMaxLifecycleEnforcer.this.d(false);
                }
            };
            this.f69712c = vVar;
            HBFragmentStateAdapter.this.f69697b.a(vVar);
        }

        void c(@n0 RecyclerView recyclerView) {
            if (PatchProxy.proxy(new Object[]{recyclerView}, this, changeQuickRedirect, false, bb.c.f.Ow, new Class[]{RecyclerView.class}, Void.TYPE).isSupported) {
                return;
            }
            a(recyclerView).w(this.f69710a);
            HBFragmentStateAdapter.this.unregisterAdapterDataObserver(this.f69711b);
            HBFragmentStateAdapter.this.f69697b.d(this.f69712c);
            this.f69713d = null;
        }

        void d(boolean z10) {
            int currentItem;
            Fragment fragmentG;
            if (PatchProxy.proxy(new Object[]{new Byte(z10 ? (byte) 1 : (byte) 0)}, this, changeQuickRedirect, false, bb.c.f.Pw, new Class[]{Boolean.TYPE}, Void.TYPE).isSupported || HBFragmentStateAdapter.this.shouldDelayFragmentTransactions() || this.f69713d.getScrollState() != 0 || HBFragmentStateAdapter.this.f69699d.k() || HBFragmentStateAdapter.this.getItemCount() == 0 || (currentItem = this.f69713d.getCurrentItem()) >= HBFragmentStateAdapter.this.getItemCount()) {
                return;
            }
            long itemId = HBFragmentStateAdapter.this.getItemId(currentItem);
            if ((itemId != this.f69714e || z10) && (fragmentG = HBFragmentStateAdapter.this.f69699d.g(itemId)) != null && fragmentG.isAdded()) {
                this.f69714e = itemId;
                p0 p0VarU = HBFragmentStateAdapter.this.f69698c.u();
                Fragment fragment = null;
                for (int i10 = 0; i10 < HBFragmentStateAdapter.this.f69699d.v(); i10++) {
                    long jL = HBFragmentStateAdapter.this.f69699d.l(i10);
                    Fragment fragmentW = HBFragmentStateAdapter.this.f69699d.w(i10);
                    if (fragmentW.isAdded()) {
                        if (jL != this.f69714e) {
                            p0VarU.K(fragmentW, Lifecycle.State.STARTED);
                        } else {
                            fragment = fragmentW;
                        }
                        fragmentW.setMenuVisibility(jL == this.f69714e);
                    }
                }
                if (fragment != null) {
                    p0VarU.K(fragment, Lifecycle.State.RESUMED);
                }
                if (p0VarU.w()) {
                    return;
                }
                p0VarU.o();
            }
        }
    }

    public class a implements View.OnLayoutChangeListener {
        public static ChangeQuickRedirect changeQuickRedirect;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ FrameLayout f69719b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ com.max.hbcustomview.viewpager2.adapter.a f69720c;

        a(FrameLayout frameLayout, com.max.hbcustomview.viewpager2.adapter.a aVar) {
            this.f69719b = frameLayout;
            this.f69720c = aVar;
        }

        @Override // android.view.View.OnLayoutChangeListener
        public void onLayoutChange(View view, int i10, int i11, int i12, int i13, int i14, int i15, int i16, int i17) {
            Object[] objArr = {view, new Integer(i10), new Integer(i11), new Integer(i12), new Integer(i13), new Integer(i14), new Integer(i15), new Integer(i16), new Integer(i17)};
            ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
            Class cls = Integer.TYPE;
            if (PatchProxy.proxy(objArr, this, changeQuickRedirect2, false, bb.c.f.Dw, new Class[]{View.class, cls, cls, cls, cls, cls, cls, cls, cls}, Void.TYPE).isSupported || this.f69719b.getParent() == null) {
                return;
            }
            this.f69719b.removeOnLayoutChangeListener(this);
            HBFragmentStateAdapter.this.r(this.f69720c);
        }
    }

    public class b extends FragmentManager.m {
        public static ChangeQuickRedirect changeQuickRedirect;

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ Fragment f69722a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ FrameLayout f69723b;

        b(Fragment fragment, FrameLayout frameLayout) {
            this.f69722a = fragment;
            this.f69723b = frameLayout;
        }

        @Override // androidx.fragment.app.FragmentManager.m
        public void m(@n0 FragmentManager fragmentManager, @n0 Fragment fragment, @n0 View view, @androidx.annotation.p0 Bundle bundle) {
            if (!PatchProxy.proxy(new Object[]{fragmentManager, fragment, view, bundle}, this, changeQuickRedirect, false, bb.c.f.Fw, new Class[]{FragmentManager.class, Fragment.class, View.class, Bundle.class}, Void.TYPE).isSupported && fragment == this.f69722a) {
                fragmentManager.g2(this);
                HBFragmentStateAdapter.this.addViewToContainer(view, this.f69723b);
            }
        }
    }

    public class c implements Runnable {
        public static ChangeQuickRedirect changeQuickRedirect;

        c() {
        }

        @Override // java.lang.Runnable
        public void run() {
            if (PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, bb.c.f.Gw, new Class[0], Void.TYPE).isSupported) {
                return;
            }
            HBFragmentStateAdapter hBFragmentStateAdapter = HBFragmentStateAdapter.this;
            hBFragmentStateAdapter.f69703h = false;
            hBFragmentStateAdapter.gcFragments();
        }
    }

    public static abstract class d extends RecyclerView.AdapterDataObserver {
        public static ChangeQuickRedirect changeQuickRedirect;

        private d() {
        }

        /* synthetic */ d(a aVar) {
            this();
        }

        @Override // androidx.recyclerview.widget.RecyclerView.AdapterDataObserver
        public abstract void onChanged();

        @Override // androidx.recyclerview.widget.RecyclerView.AdapterDataObserver
        public final void onItemRangeChanged(int i10, int i11) {
            Object[] objArr = {new Integer(i10), new Integer(i11)};
            ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
            Class cls = Integer.TYPE;
            if (PatchProxy.proxy(objArr, this, changeQuickRedirect2, false, bb.c.f.Iw, new Class[]{cls, cls}, Void.TYPE).isSupported) {
                return;
            }
            onChanged();
        }

        @Override // androidx.recyclerview.widget.RecyclerView.AdapterDataObserver
        public final void onItemRangeChanged(int i10, int i11, @androidx.annotation.p0 Object obj) {
            Object[] objArr = {new Integer(i10), new Integer(i11), obj};
            ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
            Class cls = Integer.TYPE;
            if (PatchProxy.proxy(objArr, this, changeQuickRedirect2, false, bb.c.f.Jw, new Class[]{cls, cls, Object.class}, Void.TYPE).isSupported) {
                return;
            }
            onChanged();
        }

        @Override // androidx.recyclerview.widget.RecyclerView.AdapterDataObserver
        public final void onItemRangeInserted(int i10, int i11) {
            Object[] objArr = {new Integer(i10), new Integer(i11)};
            ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
            Class cls = Integer.TYPE;
            if (PatchProxy.proxy(objArr, this, changeQuickRedirect2, false, bb.c.f.Kw, new Class[]{cls, cls}, Void.TYPE).isSupported) {
                return;
            }
            onChanged();
        }

        @Override // androidx.recyclerview.widget.RecyclerView.AdapterDataObserver
        public final void onItemRangeMoved(int i10, int i11, int i12) {
            Object[] objArr = {new Integer(i10), new Integer(i11), new Integer(i12)};
            ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
            Class cls = Integer.TYPE;
            if (PatchProxy.proxy(objArr, this, changeQuickRedirect2, false, bb.c.f.Mw, new Class[]{cls, cls, cls}, Void.TYPE).isSupported) {
                return;
            }
            onChanged();
        }

        @Override // androidx.recyclerview.widget.RecyclerView.AdapterDataObserver
        public final void onItemRangeRemoved(int i10, int i11) {
            Object[] objArr = {new Integer(i10), new Integer(i11)};
            ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
            Class cls = Integer.TYPE;
            if (PatchProxy.proxy(objArr, this, changeQuickRedirect2, false, bb.c.f.Lw, new Class[]{cls, cls}, Void.TYPE).isSupported) {
                return;
            }
            onChanged();
        }
    }

    public HBFragmentStateAdapter(@n0 Fragment fragment) {
        this(fragment.getChildFragmentManager(), fragment.getLifecycle());
    }

    public HBFragmentStateAdapter(@n0 FragmentActivity fragmentActivity) {
        this(fragmentActivity.getSupportFragmentManager(), fragmentActivity.getLifecycle());
    }

    public HBFragmentStateAdapter(@n0 FragmentManager fragmentManager, @n0 Lifecycle lifecycle) {
        this.f69699d = new x0<>();
        this.f69700e = new x0<>();
        this.f69701f = new x0<>();
        this.f69703h = false;
        this.f69704i = false;
        this.f69698c = fragmentManager;
        this.f69697b = lifecycle;
        super.setHasStableIds(true);
    }

    @n0
    private static String createKey(@n0 String str, long j10) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{str, new Long(j10)}, null, changeQuickRedirect, true, bb.c.f.vw, new Class[]{String.class, Long.TYPE}, String.class);
        if (patchProxyResultProxy.isSupported) {
            return (String) patchProxyResultProxy.result;
        }
        return str + j10;
    }

    private void ensureFragment(int i10) {
        if (PatchProxy.proxy(new Object[]{new Integer(i10)}, this, changeQuickRedirect, false, bb.c.f.iw, new Class[]{Integer.TYPE}, Void.TYPE).isSupported) {
            return;
        }
        long itemId = getItemId(i10);
        if (this.f69699d.d(itemId)) {
            return;
        }
        Fragment fragmentCreateFragment = createFragment(i10);
        fragmentCreateFragment.setInitialSavedState(this.f69700e.g(itemId));
        this.f69699d.m(itemId, fragmentCreateFragment);
    }

    private boolean isFragmentViewBound(long j10) {
        View view;
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{new Long(j10)}, this, changeQuickRedirect, false, bb.c.f.gw, new Class[]{Long.TYPE}, Boolean.TYPE);
        if (patchProxyResultProxy.isSupported) {
            return ((Boolean) patchProxyResultProxy.result).booleanValue();
        }
        if (this.f69701f.d(j10)) {
            return true;
        }
        Fragment fragmentG = this.f69699d.g(j10);
        return (fragmentG == null || (view = fragmentG.getView()) == null || view.getParent() == null) ? false : true;
    }

    private static boolean isValidKey(@n0 String str, @n0 String str2) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{str, str2}, null, changeQuickRedirect, true, bb.c.f.ww, new Class[]{String.class, String.class}, Boolean.TYPE);
        if (patchProxyResultProxy.isSupported) {
            return ((Boolean) patchProxyResultProxy.result).booleanValue();
        }
        return str.startsWith(str2) && str.length() > str2.length();
    }

    private Long itemForViewHolder(int i10) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{new Integer(i10)}, this, changeQuickRedirect, false, bb.c.f.hw, new Class[]{Integer.TYPE}, Long.class);
        if (patchProxyResultProxy.isSupported) {
            return (Long) patchProxyResultProxy.result;
        }
        Long lValueOf = null;
        for (int i11 = 0; i11 < this.f69701f.v(); i11++) {
            if (this.f69701f.w(i11).intValue() == i10) {
                if (lValueOf != null) {
                    throw new IllegalStateException("Design assumption violated: a ViewHolder can only be bound to one item at a time.");
                }
                lValueOf = Long.valueOf(this.f69701f.l(i11));
            }
        }
        return lValueOf;
    }

    private static long parseIdFromKey(@n0 String str, @n0 String str2) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{str, str2}, null, changeQuickRedirect, true, bb.c.f.xw, new Class[]{String.class, String.class}, Long.TYPE);
        return patchProxyResultProxy.isSupported ? ((Long) patchProxyResultProxy.result).longValue() : Long.parseLong(str.substring(str2.length()));
    }

    private void removeFragment(long j10) {
        Fragment fragmentG;
        ViewParent parent;
        if (PatchProxy.proxy(new Object[]{new Long(j10)}, this, changeQuickRedirect, false, bb.c.f.ow, new Class[]{Long.TYPE}, Void.TYPE).isSupported || (fragmentG = this.f69699d.g(j10)) == null) {
            return;
        }
        if (fragmentG.getView() != null && (parent = fragmentG.getView().getParent()) != null) {
            ((FrameLayout) parent).removeAllViews();
        }
        if (!containsItem(j10)) {
            this.f69700e.p(j10);
        }
        if (!fragmentG.isAdded()) {
            this.f69699d.p(j10);
            return;
        }
        if (shouldDelayFragmentTransactions()) {
            this.f69704i = true;
            return;
        }
        if (fragmentG.isAdded() && containsItem(j10)) {
            this.f69700e.m(j10, this.f69698c.U1(fragmentG));
        }
        this.f69698c.u().x(fragmentG).o();
        this.f69699d.p(j10);
    }

    private void scheduleGracePeriodEnd() {
        if (PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, bb.c.f.uw, new Class[0], Void.TYPE).isSupported) {
            return;
        }
        final Handler handler = new Handler(Looper.getMainLooper());
        final c cVar = new c();
        this.f69697b.a(new v() { // from class: com.max.hbcustomview.viewpager2.adapter.HBFragmentStateAdapter.5
            public static ChangeQuickRedirect changeQuickRedirect;

            @Override // androidx.lifecycle.v
            public void d(@n0 y yVar, @n0 Lifecycle.Event event) {
                if (!PatchProxy.proxy(new Object[]{yVar, event}, this, changeQuickRedirect, false, bb.c.f.Hw, new Class[]{y.class, Lifecycle.Event.class}, Void.TYPE).isSupported && event == Lifecycle.Event.ON_DESTROY) {
                    handler.removeCallbacks(cVar);
                    yVar.getLifecycle().d(this);
                }
            }
        });
        handler.postDelayed(cVar, 10000L);
    }

    private void scheduleViewAttach(Fragment fragment, @n0 FrameLayout frameLayout) {
        if (PatchProxy.proxy(new Object[]{fragment, frameLayout}, this, changeQuickRedirect, false, bb.c.f.lw, new Class[]{Fragment.class, FrameLayout.class}, Void.TYPE).isSupported) {
            return;
        }
        this.f69698c.C1(new b(fragment, frameLayout), false);
    }

    void addViewToContainer(@n0 View view, @n0 FrameLayout frameLayout) {
        if (PatchProxy.proxy(new Object[]{view, frameLayout}, this, changeQuickRedirect, false, bb.c.f.mw, new Class[]{View.class, FrameLayout.class}, Void.TYPE).isSupported) {
            return;
        }
        if (frameLayout.getChildCount() > 1) {
            throw new IllegalStateException("Design assumption violated.");
        }
        if (view.getParent() == frameLayout) {
            return;
        }
        if (frameLayout.getChildCount() > 0) {
            frameLayout.removeAllViews();
        }
        if (view.getParent() != null) {
            ((ViewGroup) view.getParent()).removeView(view);
        }
        frameLayout.addView(view);
    }

    public boolean containsItem(long j10) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{new Long(j10)}, this, changeQuickRedirect, false, bb.c.f.qw, new Class[]{Long.TYPE}, Boolean.TYPE);
        if (patchProxyResultProxy.isSupported) {
            return ((Boolean) patchProxyResultProxy.result).booleanValue();
        }
        return j10 >= 0 && j10 < ((long) getItemCount());
    }

    @n0
    public abstract Fragment createFragment(int i10);

    void gcFragments() {
        if (PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, bb.c.f.fw, new Class[0], Void.TYPE).isSupported || !this.f69704i || shouldDelayFragmentTransactions()) {
            return;
        }
        androidx.collection.c cVar = new androidx.collection.c();
        for (int i10 = 0; i10 < this.f69699d.v(); i10++) {
            long jL = this.f69699d.l(i10);
            if (!containsItem(jL)) {
                cVar.add(Long.valueOf(jL));
                this.f69701f.p(jL);
            }
        }
        if (!this.f69703h) {
            this.f69704i = false;
            for (int i11 = 0; i11 < this.f69699d.v(); i11++) {
                long jL2 = this.f69699d.l(i11);
                if (!isFragmentViewBound(jL2)) {
                    cVar.add(Long.valueOf(jL2));
                }
            }
        }
        Iterator<E> it = cVar.iterator();
        while (it.hasNext()) {
            removeFragment(((Long) it.next()).longValue());
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public long getItemId(int i10) {
        return i10;
    }

    public final void m(@n0 com.max.hbcustomview.viewpager2.adapter.a aVar, int i10) {
        if (PatchProxy.proxy(new Object[]{aVar, new Integer(i10)}, this, changeQuickRedirect, false, bb.c.f.ew, new Class[]{com.max.hbcustomview.viewpager2.adapter.a.class, Integer.TYPE}, Void.TYPE).isSupported) {
            return;
        }
        long itemId = aVar.getItemId();
        int id2 = aVar.b().getId();
        Long lItemForViewHolder = itemForViewHolder(id2);
        if (lItemForViewHolder != null && lItemForViewHolder.longValue() != itemId) {
            removeFragment(lItemForViewHolder.longValue());
            this.f69701f.p(lItemForViewHolder.longValue());
        }
        this.f69701f.m(itemId, Integer.valueOf(id2));
        ensureFragment(i10);
        FrameLayout frameLayoutB = aVar.b();
        if (j1.O0(frameLayoutB)) {
            if (frameLayoutB.getParent() != null) {
                throw new IllegalStateException("Design assumption violated.");
            }
            frameLayoutB.addOnLayoutChangeListener(new a(frameLayoutB, aVar));
        }
        gcFragments();
    }

    @n0
    public final com.max.hbcustomview.viewpager2.adapter.a n(@n0 ViewGroup viewGroup, int i10) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{viewGroup, new Integer(i10)}, this, changeQuickRedirect, false, bb.c.f.dw, new Class[]{ViewGroup.class, Integer.TYPE}, com.max.hbcustomview.viewpager2.adapter.a.class);
        return patchProxyResultProxy.isSupported ? (com.max.hbcustomview.viewpager2.adapter.a) patchProxyResultProxy.result : com.max.hbcustomview.viewpager2.adapter.a.a(viewGroup);
    }

    public final boolean o(@n0 com.max.hbcustomview.viewpager2.adapter.a aVar) {
        return true;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    @i
    public void onAttachedToRecyclerView(@n0 RecyclerView recyclerView) {
        if (PatchProxy.proxy(new Object[]{recyclerView}, this, changeQuickRedirect, false, bb.c.f.bw, new Class[]{RecyclerView.class}, Void.TYPE).isSupported) {
            return;
        }
        o.a(this.f69702g == null);
        FragmentMaxLifecycleEnforcer fragmentMaxLifecycleEnforcer = new FragmentMaxLifecycleEnforcer();
        this.f69702g = fragmentMaxLifecycleEnforcer;
        fragmentMaxLifecycleEnforcer.b(recyclerView);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public /* bridge */ /* synthetic */ void onBindViewHolder(@n0 RecyclerView.ViewHolder viewHolder, int i10) {
        if (PatchProxy.proxy(new Object[]{viewHolder, new Integer(i10)}, this, changeQuickRedirect, false, bb.c.f.Bw, new Class[]{RecyclerView.ViewHolder.class, Integer.TYPE}, Void.TYPE).isSupported) {
            return;
        }
        m((com.max.hbcustomview.viewpager2.adapter.a) viewHolder, i10);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    @n0
    public /* bridge */ /* synthetic */ RecyclerView.ViewHolder onCreateViewHolder(@n0 ViewGroup viewGroup, int i10) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{viewGroup, new Integer(i10)}, this, changeQuickRedirect, false, bb.c.f.Cw, new Class[]{ViewGroup.class, Integer.TYPE}, RecyclerView.ViewHolder.class);
        return patchProxyResultProxy.isSupported ? (RecyclerView.ViewHolder) patchProxyResultProxy.result : n(viewGroup, i10);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    @i
    public void onDetachedFromRecyclerView(@n0 RecyclerView recyclerView) {
        if (PatchProxy.proxy(new Object[]{recyclerView}, this, changeQuickRedirect, false, bb.c.f.cw, new Class[]{RecyclerView.class}, Void.TYPE).isSupported) {
            return;
        }
        this.f69702g.c(recyclerView);
        this.f69702g = null;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public /* bridge */ /* synthetic */ boolean onFailedToRecycleView(@n0 RecyclerView.ViewHolder viewHolder) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{viewHolder}, this, changeQuickRedirect, false, bb.c.f.zw, new Class[]{RecyclerView.ViewHolder.class}, Boolean.TYPE);
        return patchProxyResultProxy.isSupported ? ((Boolean) patchProxyResultProxy.result).booleanValue() : o((com.max.hbcustomview.viewpager2.adapter.a) viewHolder);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public /* bridge */ /* synthetic */ void onViewAttachedToWindow(@n0 RecyclerView.ViewHolder viewHolder) {
        if (PatchProxy.proxy(new Object[]{viewHolder}, this, changeQuickRedirect, false, bb.c.f.yw, new Class[]{RecyclerView.ViewHolder.class}, Void.TYPE).isSupported) {
            return;
        }
        p((com.max.hbcustomview.viewpager2.adapter.a) viewHolder);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public /* bridge */ /* synthetic */ void onViewRecycled(@n0 RecyclerView.ViewHolder viewHolder) {
        if (PatchProxy.proxy(new Object[]{viewHolder}, this, changeQuickRedirect, false, bb.c.f.Aw, new Class[]{RecyclerView.ViewHolder.class}, Void.TYPE).isSupported) {
            return;
        }
        q((com.max.hbcustomview.viewpager2.adapter.a) viewHolder);
    }

    public final void p(@n0 com.max.hbcustomview.viewpager2.adapter.a aVar) {
        if (PatchProxy.proxy(new Object[]{aVar}, this, changeQuickRedirect, false, bb.c.f.jw, new Class[]{com.max.hbcustomview.viewpager2.adapter.a.class}, Void.TYPE).isSupported) {
            return;
        }
        r(aVar);
        gcFragments();
    }

    public final void q(@n0 com.max.hbcustomview.viewpager2.adapter.a aVar) {
        Long lItemForViewHolder;
        if (PatchProxy.proxy(new Object[]{aVar}, this, changeQuickRedirect, false, bb.c.f.nw, new Class[]{com.max.hbcustomview.viewpager2.adapter.a.class}, Void.TYPE).isSupported || (lItemForViewHolder = itemForViewHolder(aVar.b().getId())) == null) {
            return;
        }
        removeFragment(lItemForViewHolder.longValue());
        this.f69701f.p(lItemForViewHolder.longValue());
    }

    void r(@n0 final com.max.hbcustomview.viewpager2.adapter.a aVar) {
        if (PatchProxy.proxy(new Object[]{aVar}, this, changeQuickRedirect, false, bb.c.f.kw, new Class[]{com.max.hbcustomview.viewpager2.adapter.a.class}, Void.TYPE).isSupported) {
            return;
        }
        Fragment fragmentG = this.f69699d.g(aVar.getItemId());
        if (fragmentG == null) {
            throw new IllegalStateException("Design assumption violated.");
        }
        FrameLayout frameLayoutB = aVar.b();
        View view = fragmentG.getView();
        if (!fragmentG.isAdded() && view != null) {
            throw new IllegalStateException("Design assumption violated.");
        }
        if (fragmentG.isAdded() && view == null) {
            scheduleViewAttach(fragmentG, frameLayoutB);
            return;
        }
        if (fragmentG.isAdded() && view.getParent() != null) {
            if (view.getParent() != frameLayoutB) {
                addViewToContainer(view, frameLayoutB);
                return;
            }
            return;
        }
        if (fragmentG.isAdded()) {
            addViewToContainer(view, frameLayoutB);
            return;
        }
        if (shouldDelayFragmentTransactions()) {
            if (this.f69698c.W0()) {
                return;
            }
            this.f69697b.a(new v() { // from class: com.max.hbcustomview.viewpager2.adapter.HBFragmentStateAdapter.2
                public static ChangeQuickRedirect changeQuickRedirect;

                @Override // androidx.lifecycle.v
                public void d(@n0 y yVar, @n0 Lifecycle.Event event) {
                    if (PatchProxy.proxy(new Object[]{yVar, event}, this, changeQuickRedirect, false, bb.c.f.Ew, new Class[]{y.class, Lifecycle.Event.class}, Void.TYPE).isSupported || HBFragmentStateAdapter.this.shouldDelayFragmentTransactions()) {
                        return;
                    }
                    yVar.getLifecycle().d(this);
                    if (j1.O0(aVar.b())) {
                        HBFragmentStateAdapter.this.r(aVar);
                    }
                }
            });
            return;
        }
        scheduleViewAttach(fragmentG, frameLayoutB);
        this.f69698c.u().g(fragmentG, "f" + aVar.getItemId()).K(fragmentG, Lifecycle.State.STARTED).o();
        this.f69702g.d(false);
    }

    @Override // com.max.hbcustomview.viewpager2.adapter.b
    public final void restoreState(@n0 Parcelable parcelable) {
        if (PatchProxy.proxy(new Object[]{parcelable}, this, changeQuickRedirect, false, bb.c.f.tw, new Class[]{Parcelable.class}, Void.TYPE).isSupported) {
            return;
        }
        if (!this.f69700e.k() || !this.f69699d.k()) {
            throw new IllegalStateException("Expected the adapter to be 'fresh' while restoring state.");
        }
        Bundle bundle = (Bundle) parcelable;
        if (bundle.getClassLoader() == null) {
            bundle.setClassLoader(getClass().getClassLoader());
        }
        for (String str : bundle.keySet()) {
            if (isValidKey(str, f69694j)) {
                this.f69699d.m(parseIdFromKey(str, f69694j), this.f69698c.F0(bundle, str));
            } else {
                if (!isValidKey(str, f69695k)) {
                    throw new IllegalArgumentException("Unexpected key in savedState: " + str);
                }
                long idFromKey = parseIdFromKey(str, f69695k);
                Fragment.SavedState savedState = (Fragment.SavedState) bundle.getParcelable(str);
                if (containsItem(idFromKey)) {
                    this.f69700e.m(idFromKey, savedState);
                }
            }
        }
        if (this.f69699d.k()) {
            return;
        }
        this.f69704i = true;
        this.f69703h = true;
        gcFragments();
        scheduleGracePeriodEnd();
    }

    @Override // com.max.hbcustomview.viewpager2.adapter.b
    @n0
    public final Parcelable saveState() {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, bb.c.f.sw, new Class[0], Parcelable.class);
        if (patchProxyResultProxy.isSupported) {
            return (Parcelable) patchProxyResultProxy.result;
        }
        Bundle bundle = new Bundle(this.f69699d.v() + this.f69700e.v());
        for (int i10 = 0; i10 < this.f69699d.v(); i10++) {
            long jL = this.f69699d.l(i10);
            Fragment fragmentG = this.f69699d.g(jL);
            if (fragmentG != null && fragmentG.isAdded()) {
                this.f69698c.B1(bundle, createKey(f69694j, jL), fragmentG);
            }
        }
        for (int i11 = 0; i11 < this.f69700e.v(); i11++) {
            long jL2 = this.f69700e.l(i11);
            if (containsItem(jL2)) {
                bundle.putParcelable(createKey(f69695k, jL2), this.f69700e.g(jL2));
            }
        }
        return bundle;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public final void setHasStableIds(boolean z10) {
        if (!PatchProxy.proxy(new Object[]{new Byte(z10 ? (byte) 1 : (byte) 0)}, this, changeQuickRedirect, false, bb.c.f.rw, new Class[]{Boolean.TYPE}, Void.TYPE).isSupported) {
            throw new UnsupportedOperationException("Stable Ids are required for the adapter to function properly, and the adapter takes care of setting the flag.");
        }
    }

    boolean shouldDelayFragmentTransactions() {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, bb.c.f.pw, new Class[0], Boolean.TYPE);
        return patchProxyResultProxy.isSupported ? ((Boolean) patchProxyResultProxy.result).booleanValue() : this.f69698c.e1();
    }
}
