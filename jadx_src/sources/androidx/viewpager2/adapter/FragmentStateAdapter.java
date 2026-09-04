package androidx.viewpager2.adapter;

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
import androidx.viewpager2.widget.ViewPager2;
import java.util.Iterator;

/* JADX INFO: loaded from: classes6.dex */
public abstract class FragmentStateAdapter extends RecyclerView.Adapter<androidx.viewpager2.adapter.a> implements androidx.viewpager2.adapter.b {
    private static final long GRACE_WINDOW_TIME_MS = 10000;
    private static final String KEY_PREFIX_FRAGMENT = "f#";
    private static final String KEY_PREFIX_STATE = "s#";
    final FragmentManager mFragmentManager;
    private FragmentMaxLifecycleEnforcer mFragmentMaxLifecycleEnforcer;
    final x0<Fragment> mFragments;
    private boolean mHasStaleFragments;
    boolean mIsInGracePeriod;
    private final x0<Integer> mItemIdToViewHolder;
    final Lifecycle mLifecycle;
    private final x0<Fragment.SavedState> mSavedStates;

    public class FragmentMaxLifecycleEnforcer {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private ViewPager2.OnPageChangeCallback f28303a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private RecyclerView.AdapterDataObserver f28304b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private v f28305c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private ViewPager2 f28306d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        private long f28307e = -1;

        public class a extends ViewPager2.OnPageChangeCallback {
            a() {
            }

            @Override // androidx.viewpager2.widget.ViewPager2.OnPageChangeCallback
            public void onPageScrollStateChanged(int i10) {
                FragmentMaxLifecycleEnforcer.this.d(false);
            }

            @Override // androidx.viewpager2.widget.ViewPager2.OnPageChangeCallback
            public void onPageSelected(int i10) {
                FragmentMaxLifecycleEnforcer.this.d(false);
            }
        }

        public class b extends d {
            b() {
                super(null);
            }

            @Override // androidx.viewpager2.adapter.FragmentStateAdapter.d, androidx.recyclerview.widget.RecyclerView.AdapterDataObserver
            public void onChanged() {
                FragmentMaxLifecycleEnforcer.this.d(true);
            }
        }

        FragmentMaxLifecycleEnforcer() {
        }

        @n0
        private ViewPager2 a(@n0 RecyclerView recyclerView) {
            ViewParent parent = recyclerView.getParent();
            if (parent instanceof ViewPager2) {
                return (ViewPager2) parent;
            }
            throw new IllegalStateException("Expected ViewPager2 instance. Got: " + parent);
        }

        void b(@n0 RecyclerView recyclerView) {
            this.f28306d = a(recyclerView);
            a aVar = new a();
            this.f28303a = aVar;
            this.f28306d.registerOnPageChangeCallback(aVar);
            b bVar = new b();
            this.f28304b = bVar;
            FragmentStateAdapter.this.registerAdapterDataObserver(bVar);
            v vVar = new v() { // from class: androidx.viewpager2.adapter.FragmentStateAdapter.FragmentMaxLifecycleEnforcer.3
                @Override // androidx.lifecycle.v
                public void d(@n0 y yVar, @n0 Lifecycle.Event event) {
                    FragmentMaxLifecycleEnforcer.this.d(false);
                }
            };
            this.f28305c = vVar;
            FragmentStateAdapter.this.mLifecycle.a(vVar);
        }

        void c(@n0 RecyclerView recyclerView) {
            a(recyclerView).unregisterOnPageChangeCallback(this.f28303a);
            FragmentStateAdapter.this.unregisterAdapterDataObserver(this.f28304b);
            FragmentStateAdapter.this.mLifecycle.d(this.f28305c);
            this.f28306d = null;
        }

        void d(boolean z10) {
            int currentItem;
            Fragment fragmentG;
            if (FragmentStateAdapter.this.shouldDelayFragmentTransactions() || this.f28306d.getScrollState() != 0 || FragmentStateAdapter.this.mFragments.k() || FragmentStateAdapter.this.getItemCount() == 0 || (currentItem = this.f28306d.getCurrentItem()) >= FragmentStateAdapter.this.getItemCount()) {
                return;
            }
            long itemId = FragmentStateAdapter.this.getItemId(currentItem);
            if ((itemId != this.f28307e || z10) && (fragmentG = FragmentStateAdapter.this.mFragments.g(itemId)) != null && fragmentG.isAdded()) {
                this.f28307e = itemId;
                p0 p0VarU = FragmentStateAdapter.this.mFragmentManager.u();
                Fragment fragment = null;
                for (int i10 = 0; i10 < FragmentStateAdapter.this.mFragments.v(); i10++) {
                    long jL = FragmentStateAdapter.this.mFragments.l(i10);
                    Fragment fragmentW = FragmentStateAdapter.this.mFragments.w(i10);
                    if (fragmentW.isAdded()) {
                        if (jL != this.f28307e) {
                            p0VarU.K(fragmentW, Lifecycle.State.STARTED);
                        } else {
                            fragment = fragmentW;
                        }
                        fragmentW.setMenuVisibility(jL == this.f28307e);
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

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ FrameLayout f28312b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ androidx.viewpager2.adapter.a f28313c;

        a(FrameLayout frameLayout, androidx.viewpager2.adapter.a aVar) {
            this.f28312b = frameLayout;
            this.f28313c = aVar;
        }

        @Override // android.view.View.OnLayoutChangeListener
        public void onLayoutChange(View view, int i10, int i11, int i12, int i13, int i14, int i15, int i16, int i17) {
            if (this.f28312b.getParent() != null) {
                this.f28312b.removeOnLayoutChangeListener(this);
                FragmentStateAdapter.this.placeFragmentInViewHolder(this.f28313c);
            }
        }
    }

    public class b extends FragmentManager.m {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ Fragment f28315a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ FrameLayout f28316b;

        b(Fragment fragment, FrameLayout frameLayout) {
            this.f28315a = fragment;
            this.f28316b = frameLayout;
        }

        @Override // androidx.fragment.app.FragmentManager.m
        public void m(@n0 FragmentManager fragmentManager, @n0 Fragment fragment, @n0 View view, @androidx.annotation.p0 Bundle bundle) {
            if (fragment == this.f28315a) {
                fragmentManager.g2(this);
                FragmentStateAdapter.this.addViewToContainer(view, this.f28316b);
            }
        }
    }

    public class c implements Runnable {
        c() {
        }

        @Override // java.lang.Runnable
        public void run() {
            FragmentStateAdapter fragmentStateAdapter = FragmentStateAdapter.this;
            fragmentStateAdapter.mIsInGracePeriod = false;
            fragmentStateAdapter.gcFragments();
        }
    }

    public static abstract class d extends RecyclerView.AdapterDataObserver {
        private d() {
        }

        /* synthetic */ d(a aVar) {
            this();
        }

        @Override // androidx.recyclerview.widget.RecyclerView.AdapterDataObserver
        public abstract void onChanged();

        @Override // androidx.recyclerview.widget.RecyclerView.AdapterDataObserver
        public final void onItemRangeChanged(int i10, int i11) {
            onChanged();
        }

        @Override // androidx.recyclerview.widget.RecyclerView.AdapterDataObserver
        public final void onItemRangeChanged(int i10, int i11, @androidx.annotation.p0 Object obj) {
            onChanged();
        }

        @Override // androidx.recyclerview.widget.RecyclerView.AdapterDataObserver
        public final void onItemRangeInserted(int i10, int i11) {
            onChanged();
        }

        @Override // androidx.recyclerview.widget.RecyclerView.AdapterDataObserver
        public final void onItemRangeMoved(int i10, int i11, int i12) {
            onChanged();
        }

        @Override // androidx.recyclerview.widget.RecyclerView.AdapterDataObserver
        public final void onItemRangeRemoved(int i10, int i11) {
            onChanged();
        }
    }

    public FragmentStateAdapter(@n0 Fragment fragment) {
        this(fragment.getChildFragmentManager(), fragment.getLifecycle());
    }

    public FragmentStateAdapter(@n0 FragmentActivity fragmentActivity) {
        this(fragmentActivity.getSupportFragmentManager(), fragmentActivity.getLifecycle());
    }

    public FragmentStateAdapter(@n0 FragmentManager fragmentManager, @n0 Lifecycle lifecycle) {
        this.mFragments = new x0<>();
        this.mSavedStates = new x0<>();
        this.mItemIdToViewHolder = new x0<>();
        this.mIsInGracePeriod = false;
        this.mHasStaleFragments = false;
        this.mFragmentManager = fragmentManager;
        this.mLifecycle = lifecycle;
        super.setHasStableIds(true);
    }

    @n0
    private static String createKey(@n0 String str, long j10) {
        return str + j10;
    }

    private void ensureFragment(int i10) {
        long itemId = getItemId(i10);
        if (this.mFragments.d(itemId)) {
            return;
        }
        Fragment fragmentCreateFragment = createFragment(i10);
        fragmentCreateFragment.setInitialSavedState(this.mSavedStates.g(itemId));
        this.mFragments.m(itemId, fragmentCreateFragment);
    }

    private boolean isFragmentViewBound(long j10) {
        View view;
        if (this.mItemIdToViewHolder.d(j10)) {
            return true;
        }
        Fragment fragmentG = this.mFragments.g(j10);
        return (fragmentG == null || (view = fragmentG.getView()) == null || view.getParent() == null) ? false : true;
    }

    private static boolean isValidKey(@n0 String str, @n0 String str2) {
        return str.startsWith(str2) && str.length() > str2.length();
    }

    private Long itemForViewHolder(int i10) {
        Long lValueOf = null;
        for (int i11 = 0; i11 < this.mItemIdToViewHolder.v(); i11++) {
            if (this.mItemIdToViewHolder.w(i11).intValue() == i10) {
                if (lValueOf != null) {
                    throw new IllegalStateException("Design assumption violated: a ViewHolder can only be bound to one item at a time.");
                }
                lValueOf = Long.valueOf(this.mItemIdToViewHolder.l(i11));
            }
        }
        return lValueOf;
    }

    private static long parseIdFromKey(@n0 String str, @n0 String str2) {
        return Long.parseLong(str.substring(str2.length()));
    }

    private void removeFragment(long j10) {
        ViewParent parent;
        Fragment fragmentG = this.mFragments.g(j10);
        if (fragmentG == null) {
            return;
        }
        if (fragmentG.getView() != null && (parent = fragmentG.getView().getParent()) != null) {
            ((FrameLayout) parent).removeAllViews();
        }
        if (!containsItem(j10)) {
            this.mSavedStates.p(j10);
        }
        if (!fragmentG.isAdded()) {
            this.mFragments.p(j10);
            return;
        }
        if (shouldDelayFragmentTransactions()) {
            this.mHasStaleFragments = true;
            return;
        }
        if (fragmentG.isAdded() && containsItem(j10)) {
            this.mSavedStates.m(j10, this.mFragmentManager.U1(fragmentG));
        }
        this.mFragmentManager.u().x(fragmentG).o();
        this.mFragments.p(j10);
    }

    private void scheduleGracePeriodEnd() {
        final Handler handler = new Handler(Looper.getMainLooper());
        final c cVar = new c();
        this.mLifecycle.a(new v() { // from class: androidx.viewpager2.adapter.FragmentStateAdapter.5
            @Override // androidx.lifecycle.v
            public void d(@n0 y yVar, @n0 Lifecycle.Event event) {
                if (event == Lifecycle.Event.ON_DESTROY) {
                    handler.removeCallbacks(cVar);
                    yVar.getLifecycle().d(this);
                }
            }
        });
        handler.postDelayed(cVar, 10000L);
    }

    private void scheduleViewAttach(Fragment fragment, @n0 FrameLayout frameLayout) {
        this.mFragmentManager.C1(new b(fragment, frameLayout), false);
    }

    void addViewToContainer(@n0 View view, @n0 FrameLayout frameLayout) {
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
        return j10 >= 0 && j10 < ((long) getItemCount());
    }

    @n0
    public abstract Fragment createFragment(int i10);

    void gcFragments() {
        if (!this.mHasStaleFragments || shouldDelayFragmentTransactions()) {
            return;
        }
        androidx.collection.c cVar = new androidx.collection.c();
        for (int i10 = 0; i10 < this.mFragments.v(); i10++) {
            long jL = this.mFragments.l(i10);
            if (!containsItem(jL)) {
                cVar.add(Long.valueOf(jL));
                this.mItemIdToViewHolder.p(jL);
            }
        }
        if (!this.mIsInGracePeriod) {
            this.mHasStaleFragments = false;
            for (int i11 = 0; i11 < this.mFragments.v(); i11++) {
                long jL2 = this.mFragments.l(i11);
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

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    @i
    public void onAttachedToRecyclerView(@n0 RecyclerView recyclerView) {
        o.a(this.mFragmentMaxLifecycleEnforcer == null);
        FragmentMaxLifecycleEnforcer fragmentMaxLifecycleEnforcer = new FragmentMaxLifecycleEnforcer();
        this.mFragmentMaxLifecycleEnforcer = fragmentMaxLifecycleEnforcer;
        fragmentMaxLifecycleEnforcer.b(recyclerView);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public final void onBindViewHolder(@n0 androidx.viewpager2.adapter.a aVar, int i10) {
        long itemId = aVar.getItemId();
        int id2 = aVar.b().getId();
        Long lItemForViewHolder = itemForViewHolder(id2);
        if (lItemForViewHolder != null && lItemForViewHolder.longValue() != itemId) {
            removeFragment(lItemForViewHolder.longValue());
            this.mItemIdToViewHolder.p(lItemForViewHolder.longValue());
        }
        this.mItemIdToViewHolder.m(itemId, Integer.valueOf(id2));
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

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    @n0
    public final androidx.viewpager2.adapter.a onCreateViewHolder(@n0 ViewGroup viewGroup, int i10) {
        return androidx.viewpager2.adapter.a.a(viewGroup);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    @i
    public void onDetachedFromRecyclerView(@n0 RecyclerView recyclerView) {
        this.mFragmentMaxLifecycleEnforcer.c(recyclerView);
        this.mFragmentMaxLifecycleEnforcer = null;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public final boolean onFailedToRecycleView(@n0 androidx.viewpager2.adapter.a aVar) {
        return true;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public final void onViewAttachedToWindow(@n0 androidx.viewpager2.adapter.a aVar) {
        placeFragmentInViewHolder(aVar);
        gcFragments();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public final void onViewRecycled(@n0 androidx.viewpager2.adapter.a aVar) {
        Long lItemForViewHolder = itemForViewHolder(aVar.b().getId());
        if (lItemForViewHolder != null) {
            removeFragment(lItemForViewHolder.longValue());
            this.mItemIdToViewHolder.p(lItemForViewHolder.longValue());
        }
    }

    void placeFragmentInViewHolder(@n0 final androidx.viewpager2.adapter.a aVar) {
        Fragment fragmentG = this.mFragments.g(aVar.getItemId());
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
            if (this.mFragmentManager.W0()) {
                return;
            }
            this.mLifecycle.a(new v() { // from class: androidx.viewpager2.adapter.FragmentStateAdapter.2
                @Override // androidx.lifecycle.v
                public void d(@n0 y yVar, @n0 Lifecycle.Event event) {
                    if (FragmentStateAdapter.this.shouldDelayFragmentTransactions()) {
                        return;
                    }
                    yVar.getLifecycle().d(this);
                    if (j1.O0(aVar.b())) {
                        FragmentStateAdapter.this.placeFragmentInViewHolder(aVar);
                    }
                }
            });
            return;
        }
        scheduleViewAttach(fragmentG, frameLayoutB);
        this.mFragmentManager.u().g(fragmentG, "f" + aVar.getItemId()).K(fragmentG, Lifecycle.State.STARTED).o();
        this.mFragmentMaxLifecycleEnforcer.d(false);
    }

    @Override // androidx.viewpager2.adapter.b
    public final void restoreState(@n0 Parcelable parcelable) {
        if (!this.mSavedStates.k() || !this.mFragments.k()) {
            throw new IllegalStateException("Expected the adapter to be 'fresh' while restoring state.");
        }
        Bundle bundle = (Bundle) parcelable;
        if (bundle.getClassLoader() == null) {
            bundle.setClassLoader(getClass().getClassLoader());
        }
        for (String str : bundle.keySet()) {
            if (isValidKey(str, KEY_PREFIX_FRAGMENT)) {
                this.mFragments.m(parseIdFromKey(str, KEY_PREFIX_FRAGMENT), this.mFragmentManager.F0(bundle, str));
            } else {
                if (!isValidKey(str, KEY_PREFIX_STATE)) {
                    throw new IllegalArgumentException("Unexpected key in savedState: " + str);
                }
                long idFromKey = parseIdFromKey(str, KEY_PREFIX_STATE);
                Fragment.SavedState savedState = (Fragment.SavedState) bundle.getParcelable(str);
                if (containsItem(idFromKey)) {
                    this.mSavedStates.m(idFromKey, savedState);
                }
            }
        }
        if (this.mFragments.k()) {
            return;
        }
        this.mHasStaleFragments = true;
        this.mIsInGracePeriod = true;
        gcFragments();
        scheduleGracePeriodEnd();
    }

    @Override // androidx.viewpager2.adapter.b
    @n0
    public final Parcelable saveState() {
        Bundle bundle = new Bundle(this.mFragments.v() + this.mSavedStates.v());
        for (int i10 = 0; i10 < this.mFragments.v(); i10++) {
            long jL = this.mFragments.l(i10);
            Fragment fragmentG = this.mFragments.g(jL);
            if (fragmentG != null && fragmentG.isAdded()) {
                this.mFragmentManager.B1(bundle, createKey(KEY_PREFIX_FRAGMENT, jL), fragmentG);
            }
        }
        for (int i11 = 0; i11 < this.mSavedStates.v(); i11++) {
            long jL2 = this.mSavedStates.l(i11);
            if (containsItem(jL2)) {
                bundle.putParcelable(createKey(KEY_PREFIX_STATE, jL2), this.mSavedStates.g(jL2));
            }
        }
        return bundle;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public final void setHasStableIds(boolean z10) {
        throw new UnsupportedOperationException("Stable Ids are required for the adapter to function properly, and the adapter takes care of setting the flag.");
    }

    boolean shouldDelayFragmentTransactions() {
        return this.mFragmentManager.e1();
    }
}
