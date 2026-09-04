package com.max.hbcommon.base.adapter;

import android.content.Context;
import android.util.Log;
import android.view.View;
import android.view.ViewGroup;
import androidx.annotation.k1;
import androidx.recyclerview.widget.RecyclerView;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.PatchProxyResult;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.atomic.AtomicBoolean;
import kotlin.Pair;
import kotlin.b2;
import kotlin.jvm.internal.f0;
import kotlin.jvm.internal.t0;
import kotlinx.coroutines.CoroutineDispatcher;
import kotlinx.coroutines.e1;

/* JADX INFO: compiled from: BigBrotherAdapterWrapper.kt */
/* JADX INFO: loaded from: classes9.dex */
public final class BigBrotherAdapterWrapper<T> extends RecyclerView.Adapter<s.e> implements l {
    public static ChangeQuickRedirect changeQuickRedirect;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @dl.d
    private final s<T> f66663b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @dl.d
    private final e<T> f66664c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @dl.e
    private RecyclerView f66665d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    @dl.d
    private final RecyclerView.ViewCacheExtension f66666e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    @dl.d
    private ArrayList<T> f66667f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    @dl.d
    private ConcurrentHashMap<Integer, Integer> f66668g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    @dl.d
    private ConcurrentHashMap<Integer, View> f66669h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    @dl.d
    private ConcurrentHashMap<Integer, Integer> f66670i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    @dl.d
    private AtomicBoolean f66671j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private boolean f66672k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    @dl.d
    private final BigBrotherAdapterWrapper<T>.b f66673l;

    /* JADX INFO: compiled from: BigBrotherAdapterWrapper.kt */
    public static final class a extends RecyclerView.ViewCacheExtension {
        public static ChangeQuickRedirect changeQuickRedirect;

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ BigBrotherAdapterWrapper<T> f66674a;

        a(BigBrotherAdapterWrapper<T> bigBrotherAdapterWrapper) {
            this.f66674a = bigBrotherAdapterWrapper;
        }

        @Override // androidx.recyclerview.widget.RecyclerView.ViewCacheExtension
        @dl.e
        public View getViewForPositionAndType(@dl.d RecyclerView.Recycler recycler, int i10, int i11) {
            Object[] objArr = {recycler, new Integer(i10), new Integer(i11)};
            ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
            Class cls = Integer.TYPE;
            PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(objArr, this, changeQuickRedirect2, false, bb.c.b.Vx, new Class[]{RecyclerView.Recycler.class, cls, cls}, View.class);
            if (patchProxyResultProxy.isSupported) {
                return (View) patchProxyResultProxy.result;
            }
            f0.p(recycler, "recycler");
            if (com.max.xiaoheihe.module.game.adapter.recommend.f.a(i11) != i10) {
                return null;
            }
            com.max.heybox.hblog.g.f74531b.q("BigBotherAdapterWrapper, itemCacheExtension, getViewForPositionAndType = " + this.f66674a.t().get(Integer.valueOf(i11)));
            return this.f66674a.t().get(Integer.valueOf(i11));
        }
    }

    /* JADX INFO: compiled from: BigBrotherAdapterWrapper.kt */
    @t0({"SMAP\nBigBrotherAdapterWrapper.kt\nKotlin\n*S Kotlin\n*F\n+ 1 BigBrotherAdapterWrapper.kt\ncom/max/hbcommon/base/adapter/BigBrotherAdapterWrapper$DataObserver\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,393:1\n1855#2,2:394\n1855#2,2:396\n*S KotlinDebug\n*F\n+ 1 BigBrotherAdapterWrapper.kt\ncom/max/hbcommon/base/adapter/BigBrotherAdapterWrapper$DataObserver\n*L\n333#1:394,2\n363#1:396,2\n*E\n"})
    public final class b extends RecyclerView.AdapterDataObserver {
        public static ChangeQuickRedirect changeQuickRedirect;

        public b() {
        }

        private final void a(int i10) {
            if (PatchProxy.proxy(new Object[]{new Integer(i10)}, this, changeQuickRedirect, false, bb.c.b.dy, new Class[]{Integer.TYPE}, Void.TYPE).isSupported) {
                return;
            }
            if (i10 >= BigBrotherAdapterWrapper.this.p().mDataList.size()) {
                Log.e("BigBotherAdapterWrapper", "BigBotherAdapterWrapper, DataObserver, onItemChange position = " + i10 + ' ' + Log.getStackTraceString(new Throwable()));
            } else {
                com.max.heybox.hblog.g.f74531b.q("BigBotherAdapterWrapper, DataObserver, onItemChange position = " + i10 + ' ' + BigBrotherAdapterWrapper.this.p().mDataList.get(i10));
            }
            BigBrotherAdapterWrapper.this.n(i10);
            BigBrotherAdapterWrapper.this.u().remove(Integer.valueOf(i10));
        }

        private final void b(int i10, int i11) {
            Object[] objArr = {new Integer(i10), new Integer(i11)};
            ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
            Class cls = Integer.TYPE;
            if (PatchProxy.proxy(objArr, this, changeQuickRedirect2, false, bb.c.b.Zx, new Class[]{cls, cls}, Void.TYPE).isSupported || BigBrotherAdapterWrapper.this.r(i10) == null) {
                return;
            }
            BigBrotherAdapterWrapper.this.n(i10);
            BigBrotherAdapterWrapper.this.n(i11);
            BigBrotherAdapterWrapper.this.u().remove(Integer.valueOf(i10));
            BigBrotherAdapterWrapper.this.u().remove(Integer.valueOf(i11));
        }

        @Override // androidx.recyclerview.widget.RecyclerView.AdapterDataObserver
        public void onChanged() {
            if (PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, bb.c.b.Wx, new Class[0], Void.TYPE).isSupported) {
                return;
            }
            com.max.heybox.hblog.g.f74531b.q("BigBotherAdapterWrapper, DataObserver, onChanged");
        }

        @Override // androidx.recyclerview.widget.RecyclerView.AdapterDataObserver
        public void onItemRangeChanged(int i10, int i11) {
            Object[] objArr = {new Integer(i10), new Integer(i11)};
            ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
            Class cls = Integer.TYPE;
            if (PatchProxy.proxy(objArr, this, changeQuickRedirect2, false, bb.c.b.cy, new Class[]{cls, cls}, Void.TYPE).isSupported) {
                return;
            }
            com.max.heybox.hblog.g.f74531b.q("BigBotherAdapterWrapper, DataObserver, onItemRangeChanged positionStart = " + i10 + ", itemCount = " + i11);
            for (int i12 = 0; i12 < i11; i12++) {
                a(i10 + i12);
            }
        }

        @Override // androidx.recyclerview.widget.RecyclerView.AdapterDataObserver
        public void onItemRangeInserted(int i10, int i11) {
            Object[] objArr = {new Integer(i10), new Integer(i11)};
            ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
            Class cls = Integer.TYPE;
            if (PatchProxy.proxy(objArr, this, changeQuickRedirect2, false, 1920, new Class[]{cls, cls}, Void.TYPE).isSupported) {
                return;
            }
            boolean z10 = i10 + i11 >= BigBrotherAdapterWrapper.this.p().mDataList.size();
            if (!z10) {
                Set<Integer> setKeySet = BigBrotherAdapterWrapper.this.u().keySet();
                f0.o(setKeySet, "<get-keys>(...)");
                BigBrotherAdapterWrapper<T> bigBrotherAdapterWrapper = BigBrotherAdapterWrapper.this;
                for (Integer num : setKeySet) {
                    f0.m(num);
                    if (num.intValue() >= i10) {
                        bigBrotherAdapterWrapper.n(num.intValue());
                        bigBrotherAdapterWrapper.u().remove(num);
                    }
                }
            }
            com.max.heybox.hblog.g.f74531b.q("BigBotherAdapterWrapper, DataObserver, onItemRangeInserted size = " + BigBrotherAdapterWrapper.this.p().mDataList.size() + " positionStart = " + i10 + ", itemCount = " + i11 + ' ' + z10);
        }

        @Override // androidx.recyclerview.widget.RecyclerView.AdapterDataObserver
        public void onItemRangeMoved(int i10, int i11, int i12) {
            Object[] objArr = {new Integer(i10), new Integer(i11), new Integer(i12)};
            ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
            Class cls = Integer.TYPE;
            if (PatchProxy.proxy(objArr, this, changeQuickRedirect2, false, bb.c.b.Yx, new Class[]{cls, cls, cls}, Void.TYPE).isSupported) {
                return;
            }
            com.max.heybox.hblog.g.f74531b.q("BigBotherAdapterWrapper, DataObserver, onItemRangeMoved fromPosition = " + i10 + ", toPosition = " + i11 + ", itemCount = " + i12);
            for (int i13 = 0; i13 < i12; i13++) {
                b(i10 + i13, i11 + i13);
            }
        }

        @Override // androidx.recyclerview.widget.RecyclerView.AdapterDataObserver
        public void onItemRangeRemoved(int i10, int i11) {
            Object[] objArr = {new Integer(i10), new Integer(i11)};
            ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
            Class cls = Integer.TYPE;
            if (PatchProxy.proxy(objArr, this, changeQuickRedirect2, false, bb.c.b.ay, new Class[]{cls, cls}, Void.TYPE).isSupported) {
                return;
            }
            com.max.heybox.hblog.g.f74531b.q("BigBotherAdapterWrapper, DataObserver, onItemRangeRemoved positionStart = " + i10 + ", itemCount = " + i11);
            Set<Integer> setKeySet = BigBrotherAdapterWrapper.this.u().keySet();
            f0.o(setKeySet, "<get-keys>(...)");
            BigBrotherAdapterWrapper<T> bigBrotherAdapterWrapper = BigBrotherAdapterWrapper.this;
            for (Integer num : setKeySet) {
                f0.m(num);
                if (num.intValue() >= i10) {
                    bigBrotherAdapterWrapper.n(num.intValue());
                    bigBrotherAdapterWrapper.u().remove(num);
                }
            }
        }
    }

    public BigBrotherAdapterWrapper(@dl.e Context context, @dl.d s<T> mAdapter, @dl.d e<T> mDelegate) {
        f0.p(mAdapter, "mAdapter");
        f0.p(mDelegate, "mDelegate");
        this.f66663b = mAdapter;
        this.f66664c = mDelegate;
        this.f66667f = new ArrayList<>();
        this.f66668g = new ConcurrentHashMap<>();
        this.f66669h = new ConcurrentHashMap<>();
        this.f66670i = new ConcurrentHashMap<>();
        this.f66671j = new AtomicBoolean(false);
        BigBrotherAdapterWrapper<T>.b bVar = new b();
        this.f66673l = bVar;
        registerAdapterDataObserver(bVar);
        this.f66666e = new a(this);
    }

    public void A(@dl.d s.e holder) {
        if (PatchProxy.proxy(new Object[]{holder}, this, changeQuickRedirect, false, bb.c.b.vx, new Class[]{s.e.class}, Void.TYPE).isSupported) {
            return;
        }
        f0.p(holder, "holder");
        com.max.heybox.hblog.g.f74531b.q("BigBotherAdapterWrapper, onViewRecycled, " + holder.getLayoutPosition() + " itemViewType = " + holder.getItemViewType() + ' ' + Integer.toBinaryString(com.max.xiaoheihe.module.game.adapter.recommend.f.b(holder.getItemViewType())) + " holder = " + holder);
        super.onViewRecycled(holder);
        if (holder instanceof g) {
            ((g) holder).f();
        }
    }

    /* JADX WARN: Code duplicated, block: B:11:0x0039  */
    @dl.e
    public final Object B(@dl.e List<? extends T> list, @dl.d kotlin.coroutines.c<? super b2> cVar) throws Throwable {
        BigBrotherAdapterWrapper$preLoadDataList$1 bigBrotherAdapterWrapper$preLoadDataList$1;
        long j10;
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{list, cVar}, this, changeQuickRedirect, false, bb.c.b.wx, new Class[]{List.class, kotlin.coroutines.c.class}, Object.class);
        if (patchProxyResultProxy.isSupported) {
            return patchProxyResultProxy.result;
        }
        if (cVar instanceof BigBrotherAdapterWrapper$preLoadDataList$1) {
            bigBrotherAdapterWrapper$preLoadDataList$1 = (BigBrotherAdapterWrapper$preLoadDataList$1) cVar;
            int i10 = bigBrotherAdapterWrapper$preLoadDataList$1.f66679e;
            if ((i10 & Integer.MIN_VALUE) != 0) {
                bigBrotherAdapterWrapper$preLoadDataList$1.f66679e = i10 - Integer.MIN_VALUE;
            } else {
                bigBrotherAdapterWrapper$preLoadDataList$1 = new BigBrotherAdapterWrapper$preLoadDataList$1(this, cVar);
            }
        } else {
            bigBrotherAdapterWrapper$preLoadDataList$1 = new BigBrotherAdapterWrapper$preLoadDataList$1(this, cVar);
        }
        Object obj = bigBrotherAdapterWrapper$preLoadDataList$1.f66677c;
        Object objH = kotlin.coroutines.intrinsics.b.h();
        int i11 = bigBrotherAdapterWrapper$preLoadDataList$1.f66679e;
        if (i11 == 0) {
            kotlin.t0.n(obj);
            if (list == null || list.isEmpty() || this.f66665d == null || this.f66672k) {
                return b2.f124493a;
            }
            this.f66672k = true;
            long jCurrentTimeMillis = System.currentTimeMillis();
            com.max.heybox.hblog.g.f74531b.q("BigBotherAdapterWrapper, preLoadViewHolder1, start time = " + jCurrentTimeMillis);
            CoroutineDispatcher coroutineDispatcherA = e1.a();
            BigBrotherAdapterWrapper$preLoadDataList$2 bigBrotherAdapterWrapper$preLoadDataList$2 = new BigBrotherAdapterWrapper$preLoadDataList$2(this, list, null);
            bigBrotherAdapterWrapper$preLoadDataList$1.f66676b = jCurrentTimeMillis;
            bigBrotherAdapterWrapper$preLoadDataList$1.f66679e = 1;
            if (kotlinx.coroutines.i.h(coroutineDispatcherA, bigBrotherAdapterWrapper$preLoadDataList$2, bigBrotherAdapterWrapper$preLoadDataList$1) == objH) {
                return objH;
            }
            j10 = jCurrentTimeMillis;
        } else {
            if (i11 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            j10 = bigBrotherAdapterWrapper$preLoadDataList$1.f66676b;
            kotlin.t0.n(obj);
        }
        com.max.heybox.hblog.g.f74531b.q("BigBotherAdapterWrapper, preLoadViewHolder2, spend time = " + (System.currentTimeMillis() - j10));
        return b2.f124493a;
    }

    /* JADX WARN: Code duplicated, block: B:11:0x0045  */
    /* JADX WARN: Type inference incomplete: some casts might be missing */
    @dl.e
    public final Object C(int i10, T t10, @dl.d kotlin.coroutines.c<? super b2> cVar) throws Throwable {
        BigBrotherAdapterWrapper$preLoadItem$1 bigBrotherAdapterWrapper$preLoadItem$1;
        int iC;
        s.e eVar;
        BigBrotherAdapterWrapper<T> bigBrotherAdapterWrapper;
        s.e eVar2;
        RecyclerView recyclerView;
        RecyclerView.RecycledViewPool recycledViewPool;
        RecyclerView.RecycledViewPool recycledViewPool2;
        RecyclerView recyclerView2;
        RecyclerView.RecycledViewPool recycledViewPool3;
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{new Integer(i10), t10, cVar}, this, changeQuickRedirect, false, bb.c.b.Bx, new Class[]{Integer.TYPE, Object.class, kotlin.coroutines.c.class}, Object.class);
        if (patchProxyResultProxy.isSupported) {
            return patchProxyResultProxy.result;
        }
        if (cVar instanceof BigBrotherAdapterWrapper$preLoadItem$1) {
            bigBrotherAdapterWrapper$preLoadItem$1 = (BigBrotherAdapterWrapper$preLoadItem$1) cVar;
            int i11 = bigBrotherAdapterWrapper$preLoadItem$1.f66696h;
            if ((i11 & Integer.MIN_VALUE) != 0) {
                bigBrotherAdapterWrapper$preLoadItem$1.f66696h = i11 - Integer.MIN_VALUE;
            } else {
                bigBrotherAdapterWrapper$preLoadItem$1 = new BigBrotherAdapterWrapper$preLoadItem$1(this, cVar);
            }
        } else {
            bigBrotherAdapterWrapper$preLoadItem$1 = new BigBrotherAdapterWrapper$preLoadItem$1(this, cVar);
        }
        Object obj = bigBrotherAdapterWrapper$preLoadItem$1.f66694f;
        Object objH = kotlin.coroutines.intrinsics.b.h();
        int i12 = bigBrotherAdapterWrapper$preLoadItem$1.f66696h;
        if (i12 == 0) {
            kotlin.t0.n(obj);
            Integer numE = this.f66664c.e(t10);
            if (numE == null) {
                return b2.f124493a;
            }
            int iIntValue = numE.intValue();
            iC = com.max.xiaoheihe.module.game.adapter.recommend.f.c(i10, iIntValue << 22);
            RecyclerView recyclerView3 = this.f66665d;
            Integer numF = (recyclerView3 == null || (recycledViewPool2 = recyclerView3.getRecycledViewPool()) == null) ? null : kotlin.coroutines.jvm.internal.a.f(recycledViewPool2.getRecycledViewCount(iC));
            com.max.heybox.hblog.g.f74531b.q("BigBotherAdapterWrapper, preLoadItem viewtype_mask = " + iIntValue + ", index = " + i10 + " recycledViewCount = " + numF);
            if ((numF != null ? numF.intValue() : 0) >= 1 && (recyclerView = this.f66665d) != null && (recycledViewPool = recyclerView.getRecycledViewPool()) != null) {
                recycledViewPool.getRecycledView(iC);
            }
            RecyclerView recyclerView4 = this.f66665d;
            f0.m(recyclerView4);
            s.e eVarCreateViewHolder = createViewHolder(recyclerView4, iC);
            f0.o(eVarCreateViewHolder, "createViewHolder(...)");
            eVar = eVarCreateViewHolder;
            if (eVar instanceof g) {
                Pair<l, RecyclerView> pairJ = this.f66664c.j((g) eVar, (s<?>) this.f66663b, t10);
                if (pairJ != null) {
                    l lVarE = pairJ.e();
                    bigBrotherAdapterWrapper$preLoadItem$1.f66690b = this;
                    bigBrotherAdapterWrapper$preLoadItem$1.f66691c = eVar;
                    bigBrotherAdapterWrapper$preLoadItem$1.f66692d = i10;
                    bigBrotherAdapterWrapper$preLoadItem$1.f66693e = iC;
                    bigBrotherAdapterWrapper$preLoadItem$1.f66696h = 1;
                    if (lVarE.d(bigBrotherAdapterWrapper$preLoadItem$1) == objH) {
                        return objH;
                    }
                    bigBrotherAdapterWrapper = this;
                    eVar2 = eVar;
                } else {
                    bigBrotherAdapterWrapper = this;
                }
                bigBrotherAdapterWrapper.f66668g.put(kotlin.coroutines.jvm.internal.a.f(i10), kotlin.coroutines.jvm.internal.a.f(iC));
            } else {
                bigBrotherAdapterWrapper = this;
            }
            recyclerView2 = bigBrotherAdapterWrapper.f66665d;
            if (recyclerView2 != null && (recycledViewPool3 = recyclerView2.getRecycledViewPool()) != null) {
                recycledViewPool3.putRecycledView(eVar);
            }
            return b2.f124493a;
        }
        if (i12 != 1) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        int i13 = bigBrotherAdapterWrapper$preLoadItem$1.f66693e;
        int i14 = bigBrotherAdapterWrapper$preLoadItem$1.f66692d;
        eVar2 = (s.e) bigBrotherAdapterWrapper$preLoadItem$1.f66691c;
        bigBrotherAdapterWrapper = (BigBrotherAdapterWrapper) bigBrotherAdapterWrapper$preLoadItem$1.f66690b;
        kotlin.t0.n(obj);
        iC = i13;
        i10 = i14;
        eVar = eVar2;
        bigBrotherAdapterWrapper.f66668g.put(kotlin.coroutines.jvm.internal.a.f(i10), kotlin.coroutines.jvm.internal.a.f(iC));
        recyclerView2 = bigBrotherAdapterWrapper.f66665d;
        if (recyclerView2 != null) {
            recycledViewPool3.putRecycledView(eVar);
        }
        return b2.f124493a;
    }

    @dl.e
    public final Object D(int i10, @dl.d List<? extends T> list, @dl.d kotlin.coroutines.c<? super b2> cVar) throws Throwable {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{new Integer(i10), list, cVar}, this, changeQuickRedirect, false, bb.c.b.Ax, new Class[]{Integer.TYPE, List.class, kotlin.coroutines.c.class}, Object.class);
        if (patchProxyResultProxy.isSupported) {
            return patchProxyResultProxy.result;
        }
        Object objH = kotlinx.coroutines.i.h(e1.a(), new BigBrotherAdapterWrapper$preloadMore$2(list, this, i10, null), cVar);
        return objH == kotlin.coroutines.intrinsics.b.h() ? objH : b2.f124493a;
    }

    public final void E(@dl.d RecyclerView.AdapterDataObserver observer) {
        if (PatchProxy.proxy(new Object[]{observer}, this, changeQuickRedirect, false, bb.c.b.Ox, new Class[]{RecyclerView.AdapterDataObserver.class}, Void.TYPE).isSupported) {
            return;
        }
        f0.p(observer, "observer");
        super.registerAdapterDataObserver(observer);
    }

    public final void F() {
        RecyclerView.RecycledViewPool recycledViewPool;
        if (PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, bb.c.b.zx, new Class[0], Void.TYPE).isSupported) {
            return;
        }
        this.f66668g.clear();
        this.f66669h.clear();
        RecyclerView recyclerView = this.f66665d;
        if (recyclerView != null && (recycledViewPool = recyclerView.getRecycledViewPool()) != null) {
            recycledViewPool.clear();
        }
        this.f66672k = false;
    }

    public final void G(@dl.d ConcurrentHashMap<Integer, Integer> concurrentHashMap) {
        if (PatchProxy.proxy(new Object[]{concurrentHashMap}, this, changeQuickRedirect, false, bb.c.b.tx, new Class[]{ConcurrentHashMap.class}, Void.TYPE).isSupported) {
            return;
        }
        f0.p(concurrentHashMap, "<set-?>");
        this.f66670i = concurrentHashMap;
    }

    public final void H(@dl.e List<? extends T> list) {
        if (PatchProxy.proxy(new Object[]{list}, this, changeQuickRedirect, false, bb.c.b.xx, new Class[]{List.class}, Void.TYPE).isSupported || this.f66671j.get() || list == null) {
            return;
        }
        this.f66667f.clear();
        this.f66667f.addAll(list);
    }

    public final void I(@dl.d AtomicBoolean atomicBoolean) {
        if (PatchProxy.proxy(new Object[]{atomicBoolean}, this, changeQuickRedirect, false, bb.c.b.ux, new Class[]{AtomicBoolean.class}, Void.TYPE).isSupported) {
            return;
        }
        f0.p(atomicBoolean, "<set-?>");
        this.f66671j = atomicBoolean;
    }

    public final void J(@dl.d ConcurrentHashMap<Integer, View> concurrentHashMap) {
        if (PatchProxy.proxy(new Object[]{concurrentHashMap}, this, changeQuickRedirect, false, bb.c.b.sx, new Class[]{ConcurrentHashMap.class}, Void.TYPE).isSupported) {
            return;
        }
        f0.p(concurrentHashMap, "<set-?>");
        this.f66669h = concurrentHashMap;
    }

    public final void K(@dl.d ConcurrentHashMap<Integer, Integer> concurrentHashMap) {
        if (PatchProxy.proxy(new Object[]{concurrentHashMap}, this, changeQuickRedirect, false, bb.c.b.rx, new Class[]{ConcurrentHashMap.class}, Void.TYPE).isSupported) {
            return;
        }
        f0.p(concurrentHashMap, "<set-?>");
        this.f66668g = concurrentHashMap;
    }

    public final void L(boolean z10) {
        this.f66672k = z10;
    }

    public final void M(@dl.d RecyclerView.AdapterDataObserver observer) {
        if (PatchProxy.proxy(new Object[]{observer}, this, changeQuickRedirect, false, bb.c.b.Px, new Class[]{RecyclerView.AdapterDataObserver.class}, Void.TYPE).isSupported) {
            return;
        }
        f0.p(observer, "observer");
        super.unregisterAdapterDataObserver(observer);
    }

    /* JADX WARN: Code duplicated, block: B:11:0x0032  */
    @Override // com.max.hbcommon.base.adapter.l
    @k1
    @dl.e
    public Object d(@dl.d kotlin.coroutines.c<? super b2> cVar) throws Throwable {
        BigBrotherAdapterWrapper$preLoadInitialViewHolder$1 bigBrotherAdapterWrapper$preLoadInitialViewHolder$1;
        BigBrotherAdapterWrapper bigBrotherAdapterWrapper;
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{cVar}, this, changeQuickRedirect, false, bb.c.b.yx, new Class[]{kotlin.coroutines.c.class}, Object.class);
        if (patchProxyResultProxy.isSupported) {
            return patchProxyResultProxy.result;
        }
        if (cVar instanceof BigBrotherAdapterWrapper$preLoadInitialViewHolder$1) {
            bigBrotherAdapterWrapper$preLoadInitialViewHolder$1 = (BigBrotherAdapterWrapper$preLoadInitialViewHolder$1) cVar;
            int i10 = bigBrotherAdapterWrapper$preLoadInitialViewHolder$1.f66689e;
            if ((i10 & Integer.MIN_VALUE) != 0) {
                bigBrotherAdapterWrapper$preLoadInitialViewHolder$1.f66689e = i10 - Integer.MIN_VALUE;
            } else {
                bigBrotherAdapterWrapper$preLoadInitialViewHolder$1 = new BigBrotherAdapterWrapper$preLoadInitialViewHolder$1(this, cVar);
            }
        } else {
            bigBrotherAdapterWrapper$preLoadInitialViewHolder$1 = new BigBrotherAdapterWrapper$preLoadInitialViewHolder$1(this, cVar);
        }
        Object obj = bigBrotherAdapterWrapper$preLoadInitialViewHolder$1.f66687c;
        Object objH = kotlin.coroutines.intrinsics.b.h();
        int i11 = bigBrotherAdapterWrapper$preLoadInitialViewHolder$1.f66689e;
        if (i11 == 0) {
            kotlin.t0.n(obj);
            com.max.heybox.hblog.g.f74531b.q("BigBotherAdapterWrapper, preLoadInitialViewHolder1");
            this.f66671j.compareAndSet(false, true);
            List<? extends T> list = this.f66667f;
            bigBrotherAdapterWrapper$preLoadInitialViewHolder$1.f66686b = this;
            bigBrotherAdapterWrapper$preLoadInitialViewHolder$1.f66689e = 1;
            if (B(list, bigBrotherAdapterWrapper$preLoadInitialViewHolder$1) == objH) {
                return objH;
            }
            bigBrotherAdapterWrapper = this;
        } else {
            if (i11 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            BigBrotherAdapterWrapper bigBrotherAdapterWrapper2 = (BigBrotherAdapterWrapper) bigBrotherAdapterWrapper$preLoadInitialViewHolder$1.f66686b;
            kotlin.t0.n(obj);
            bigBrotherAdapterWrapper = bigBrotherAdapterWrapper2;
        }
        com.max.heybox.hblog.g.f74531b.q("BigBotherAdapterWrapper, preLoadInitialViewHolder2");
        bigBrotherAdapterWrapper.f66667f.clear();
        bigBrotherAdapterWrapper.f66671j.compareAndSet(true, false);
        return b2.f124493a;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public int getItemCount() {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, bb.c.b.Kx, new Class[0], Integer.TYPE);
        return patchProxyResultProxy.isSupported ? ((Integer) patchProxyResultProxy.result).intValue() : this.f66663b.getItemCount();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public int getItemViewType(int i10) {
        Object[] objArr = {new Integer(i10)};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        Class cls = Integer.TYPE;
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(objArr, this, changeQuickRedirect2, false, bb.c.b.Jx, new Class[]{cls}, cls);
        if (patchProxyResultProxy.isSupported) {
            return ((Integer) patchProxyResultProxy.result).intValue();
        }
        Integer numR = r(i10);
        com.max.heybox.hblog.g.f74531b.q("BigBotherAdapterWrapper, getItemViewType position = " + i10 + ", mixViewtype = " + numR);
        return numR != null ? numR.intValue() : this.f66663b.getItemViewType(i10);
    }

    public final void n(int i10) {
        Integer num;
        RecyclerView.RecycledViewPool recycledViewPool;
        RecyclerView.RecycledViewPool recycledViewPool2;
        if (PatchProxy.proxy(new Object[]{new Integer(i10)}, this, changeQuickRedirect, false, bb.c.b.Ix, new Class[]{Integer.TYPE}, Void.TYPE).isSupported || (num = this.f66668g.get(Integer.valueOf(i10))) == null) {
            return;
        }
        int iIntValue = num.intValue();
        RecyclerView recyclerView = this.f66665d;
        Integer numValueOf = null;
        RecyclerView.ViewHolder recycledView = (recyclerView == null || (recycledViewPool2 = recyclerView.getRecycledViewPool()) == null) ? null : recycledViewPool2.getRecycledView(iIntValue);
        com.max.heybox.hblog.g.a aVar = com.max.heybox.hblog.g.f74531b;
        StringBuilder sb2 = new StringBuilder();
        sb2.append("BigBotherAdapterWrapper, onBindViewHolder, ");
        sb2.append(recycledView);
        sb2.append(" has covered, No longer needed!! poolCount = ");
        RecyclerView recyclerView2 = this.f66665d;
        if (recyclerView2 != null && (recycledViewPool = recyclerView2.getRecycledViewPool()) != null) {
            numValueOf = Integer.valueOf(recycledViewPool.getRecycledViewCount(iIntValue));
        }
        sb2.append(numValueOf);
        aVar.q(sb2.toString());
    }

    @dl.d
    public final ConcurrentHashMap<Integer, Integer> o() {
        return this.f66670i;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public void onAttachedToRecyclerView(@dl.d RecyclerView recyclerView) {
        if (PatchProxy.proxy(new Object[]{recyclerView}, this, changeQuickRedirect, false, 1899, new Class[]{RecyclerView.class}, Void.TYPE).isSupported) {
            return;
        }
        f0.p(recyclerView, "recyclerView");
        super.onAttachedToRecyclerView(recyclerView);
        this.f66665d = recyclerView;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public /* bridge */ /* synthetic */ void onBindViewHolder(RecyclerView.ViewHolder viewHolder, int i10) {
        if (PatchProxy.proxy(new Object[]{viewHolder, new Integer(i10)}, this, changeQuickRedirect, false, bb.c.b.Ux, new Class[]{RecyclerView.ViewHolder.class, Integer.TYPE}, Void.TYPE).isSupported) {
            return;
        }
        onBindViewHolder((s.e) viewHolder, i10);
    }

    /* JADX WARN: Type inference incomplete: some casts might be missing */
    public void onBindViewHolder(@dl.d s.e viewHolder, int i10) {
        Integer num;
        if (PatchProxy.proxy(new Object[]{viewHolder, new Integer(i10)}, this, changeQuickRedirect, false, bb.c.b.Hx, new Class[]{s.e.class, Integer.TYPE}, Void.TYPE).isSupported) {
            return;
        }
        f0.p(viewHolder, "viewHolder");
        long jCurrentTimeMillis = System.currentTimeMillis();
        Log.d("BigBotherAdapterWrapper", "BigBotherAdapterWrapper, onBindViewHolder, " + viewHolder + " start time = " + jCurrentTimeMillis + ", position = " + i10);
        if (viewHolder instanceof g) {
            g gVar = (g) viewHolder;
            if (gVar.r()) {
                return;
            }
            e<T> eVar = this.f66664c;
            s<T> sVar = this.f66663b;
            eVar.h(gVar, (s<?>) sVar, sVar.getDataList().get(i10));
            return;
        }
        this.f66663b.onBindViewHolder(viewHolder, i10);
        if (this.f66668g.contains(Integer.valueOf(i10)) && (num = this.f66668g.get(Integer.valueOf(i10))) != null) {
            num.intValue();
            n(i10);
        }
        com.max.heybox.hblog.g.f74531b.q("BigBotherAdapterWrapper, onBindViewHolder, spend time = " + (System.currentTimeMillis() - jCurrentTimeMillis) + ", position = " + i10);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public /* bridge */ /* synthetic */ RecyclerView.ViewHolder onCreateViewHolder(ViewGroup viewGroup, int i10) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{viewGroup, new Integer(i10)}, this, changeQuickRedirect, false, bb.c.b.Rx, new Class[]{ViewGroup.class, Integer.TYPE}, RecyclerView.ViewHolder.class);
        return patchProxyResultProxy.isSupported ? (RecyclerView.ViewHolder) patchProxyResultProxy.result : onCreateViewHolder(viewGroup, i10);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    @dl.d
    public s.e onCreateViewHolder(@dl.d ViewGroup parent, int i10) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{parent, new Integer(i10)}, this, changeQuickRedirect, false, bb.c.b.Dx, new Class[]{ViewGroup.class, Integer.TYPE}, s.e.class);
        if (patchProxyResultProxy.isSupported) {
            return (s.e) patchProxyResultProxy.result;
        }
        f0.p(parent, "parent");
        com.max.heybox.hblog.g.f74531b.q("BigBotherAdapterWrapper, onCreateViewHolder, viewType = " + i10 + ", ViewTypeMask = " + v(i10) + " IndexMask = " + com.max.xiaoheihe.module.game.adapter.recommend.f.a(i10) + ' ' + Integer.toBinaryString(i10));
        g gVarI = this.f66664c.i(parent, v(i10));
        if (gVarI != null) {
            return gVarI;
        }
        s.e eVarOnCreateViewHolder = this.f66663b.onCreateViewHolder(parent, i10);
        f0.o(eVarOnCreateViewHolder, "onCreateViewHolder(...)");
        return eVarOnCreateViewHolder;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public /* bridge */ /* synthetic */ void onViewAttachedToWindow(RecyclerView.ViewHolder viewHolder) {
        if (PatchProxy.proxy(new Object[]{viewHolder}, this, changeQuickRedirect, false, bb.c.b.Sx, new Class[]{RecyclerView.ViewHolder.class}, Void.TYPE).isSupported) {
            return;
        }
        y((s.e) viewHolder);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public /* bridge */ /* synthetic */ void onViewDetachedFromWindow(RecyclerView.ViewHolder viewHolder) {
        if (PatchProxy.proxy(new Object[]{viewHolder}, this, changeQuickRedirect, false, bb.c.b.Tx, new Class[]{RecyclerView.ViewHolder.class}, Void.TYPE).isSupported) {
            return;
        }
        z((s.e) viewHolder);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public /* bridge */ /* synthetic */ void onViewRecycled(RecyclerView.ViewHolder viewHolder) {
        if (PatchProxy.proxy(new Object[]{viewHolder}, this, changeQuickRedirect, false, bb.c.b.Qx, new Class[]{RecyclerView.ViewHolder.class}, Void.TYPE).isSupported) {
            return;
        }
        A((s.e) viewHolder);
    }

    @dl.d
    public final s<T> p() {
        return this.f66663b;
    }

    @dl.d
    public final e<T> q() {
        return this.f66664c;
    }

    @dl.e
    public final Integer r(int i10) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{new Integer(i10)}, this, changeQuickRedirect, false, bb.c.b.Lx, new Class[]{Integer.TYPE}, Integer.class);
        return patchProxyResultProxy.isSupported ? (Integer) patchProxyResultProxy.result : s(i10, this.f66663b.mDataList.get(i10));
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public void registerAdapterDataObserver(@dl.d RecyclerView.AdapterDataObserver observer) {
        if (PatchProxy.proxy(new Object[]{observer}, this, changeQuickRedirect, false, bb.c.b.Nx, new Class[]{RecyclerView.AdapterDataObserver.class}, Void.TYPE).isSupported) {
            return;
        }
        f0.p(observer, "observer");
        super.registerAdapterDataObserver(observer);
        s<T> sVar = this.f66663b;
        if (sVar instanceof RVCommonBigBrotherAdapter) {
            return;
        }
        sVar.registerAdapterDataObserver(observer);
    }

    @dl.e
    public final Integer s(int i10, T t10) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{new Integer(i10), t10}, this, changeQuickRedirect, false, bb.c.b.Mx, new Class[]{Integer.TYPE, Object.class}, Integer.class);
        if (patchProxyResultProxy.isSupported) {
            return (Integer) patchProxyResultProxy.result;
        }
        Integer numE = this.f66664c.e(t10);
        Integer numValueOf = numE != null ? Integer.valueOf(com.max.xiaoheihe.module.game.adapter.recommend.f.c(i10, numE.intValue() << 22)) : null;
        Integer num = this.f66668g.get(Integer.valueOf(i10));
        if (numValueOf == null || num == null || !f0.g(numValueOf, num)) {
            return null;
        }
        return numValueOf;
    }

    @dl.d
    public final ConcurrentHashMap<Integer, View> t() {
        return this.f66669h;
    }

    @dl.d
    public final ConcurrentHashMap<Integer, Integer> u() {
        return this.f66668g;
    }

    public final int v(int i10) {
        Object[] objArr = {new Integer(i10)};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        Class cls = Integer.TYPE;
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(objArr, this, changeQuickRedirect2, false, bb.c.b.Ex, new Class[]{cls}, cls);
        return patchProxyResultProxy.isSupported ? ((Integer) patchProxyResultProxy.result).intValue() : com.max.xiaoheihe.module.game.adapter.recommend.f.b(i10) >> 22;
    }

    @dl.d
    public final AtomicBoolean w() {
        return this.f66671j;
    }

    public final boolean x() {
        return this.f66672k;
    }

    public void y(@dl.d s.e holder) {
        if (PatchProxy.proxy(new Object[]{holder}, this, changeQuickRedirect, false, bb.c.b.Fx, new Class[]{s.e.class}, Void.TYPE).isSupported) {
            return;
        }
        f0.p(holder, "holder");
        super.onViewAttachedToWindow(holder);
        if (holder instanceof g) {
            this.f66664c.c((g) holder);
        }
    }

    public void z(@dl.d s.e holder) {
        if (PatchProxy.proxy(new Object[]{holder}, this, changeQuickRedirect, false, bb.c.b.Gx, new Class[]{s.e.class}, Void.TYPE).isSupported) {
            return;
        }
        f0.p(holder, "holder");
        super.onViewDetachedFromWindow(holder);
        if (holder instanceof g) {
            this.f66664c.l((g) holder);
        }
    }
}
