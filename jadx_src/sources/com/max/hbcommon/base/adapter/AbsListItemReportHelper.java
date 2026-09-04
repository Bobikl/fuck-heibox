package com.max.hbcommon.base.adapter;

import android.os.Handler;
import android.os.Looper;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import androidx.recyclerview.widget.RecyclerView.Adapter;
import androidx.recyclerview.widget.StaggeredGridLayoutManager;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import kotlin.Triple;
import kotlin.collections.ArraysKt___ArraysKt;
import kotlin.collections.k0;
import kotlin.jvm.internal.f0;
import kotlin.jvm.internal.t0;
import kotlinx.coroutines.e1;
import kotlinx.coroutines.q0;
import kotlinx.coroutines.r0;

/* JADX INFO: compiled from: AbsListItemReportHelper.kt */
/* JADX INFO: loaded from: classes9.dex */
@t0({"SMAP\nAbsListItemReportHelper.kt\nKotlin\n*S Kotlin\n*F\n+ 1 AbsListItemReportHelper.kt\ncom/max/hbcommon/base/adapter/AbsListItemReportHelper\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,201:1\n1855#2,2:202\n1855#2,2:204\n1855#2,2:206\n*S KotlinDebug\n*F\n+ 1 AbsListItemReportHelper.kt\ncom/max/hbcommon/base/adapter/AbsListItemReportHelper\n*L\n125#1:202,2\n139#1:204,2\n156#1:206,2\n*E\n"})
public abstract class AbsListItemReportHelper<L extends RecyclerView.Adapter<?>, T, R> implements a0 {
    public static ChangeQuickRedirect changeQuickRedirect;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @dl.e
    private final androidx.lifecycle.y f66634a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @dl.d
    private final RecyclerView f66635b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final boolean f66636c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final long f66637d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    @dl.d
    private final Runnable f66638e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    @dl.d
    private Handler f66639f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    @dl.e
    private RecyclerViewItemWatcher<L> f66640g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    @dl.d
    private final HashSet<Triple<R, Event, Integer>> f66641h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    @dl.d
    private final q0 f66642i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    @dl.d
    private final HashSet<Integer> f66643j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    @dl.d
    private final HashSet<Integer> f66644k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private int f66645l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private int f66646m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private int f66647n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    private int f66648o;

    public AbsListItemReportHelper(@dl.e androidx.lifecycle.y yVar, @dl.d RecyclerView mRecyclerView, boolean z10) {
        f0.p(mRecyclerView, "mRecyclerView");
        this.f66634a = yVar;
        this.f66635b = mRecyclerView;
        this.f66636c = z10;
        this.f66637d = 400L;
        this.f66638e = new Runnable() { // from class: com.max.hbcommon.base.adapter.a
            @Override // java.lang.Runnable
            public final void run() {
                AbsListItemReportHelper.j(this.f66731b);
            }
        };
        this.f66639f = new Handler(Looper.getMainLooper());
        this.f66641h = new HashSet<>();
        this.f66642i = r0.a(e1.a());
        this.f66643j = new HashSet<>();
        this.f66644k = new HashSet<>();
        this.f66640g = new RecyclerViewItemWatcher<>(yVar, mRecyclerView, this, 0, z10);
    }

    public /* synthetic */ AbsListItemReportHelper(androidx.lifecycle.y yVar, RecyclerView recyclerView, boolean z10, int i10, kotlin.jvm.internal.u uVar) {
        this(yVar, recyclerView, (i10 & 4) != 0 ? true : z10);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void j(AbsListItemReportHelper this$0) {
        if (PatchProxy.proxy(new Object[]{this$0}, null, changeQuickRedirect, true, bb.c.b.Rw, new Class[]{AbsListItemReportHelper.class}, Void.TYPE).isSupported) {
            return;
        }
        f0.p(this$0, "this$0");
        this$0.o();
    }

    private final void o() {
        if (PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, bb.c.b.Nw, new Class[0], Void.TYPE).isSupported || this.f66641h.isEmpty()) {
            return;
        }
        HashSet hashSet = new HashSet(this.f66641h);
        this.f66641h.clear();
        kotlinx.coroutines.k.f(this.f66642i, null, null, new AbsListItemReportHelper$postEvent$1(hashSet, this, null), 3, null);
    }

    @Override // com.max.hbcommon.base.adapter.a0
    public void a(int i10, @dl.e RecyclerView.ViewHolder viewHolder, float f10) {
        if (PatchProxy.proxy(new Object[]{new Integer(i10), viewHolder, new Float(f10)}, this, changeQuickRedirect, false, bb.c.b.Qw, new Class[]{Integer.TYPE, RecyclerView.ViewHolder.class, Float.TYPE}, Void.TYPE).isSupported) {
            return;
        }
        a0.a.a(this, i10, viewHolder, f10);
    }

    @Override // com.max.hbcommon.base.adapter.a0
    public void b(int i10, @dl.e RecyclerView.ViewHolder viewHolder) {
        if (PatchProxy.proxy(new Object[]{new Integer(i10), viewHolder}, this, changeQuickRedirect, false, bb.c.b.Kw, new Class[]{Integer.TYPE, RecyclerView.ViewHolder.class}, Void.TYPE).isSupported) {
            return;
        }
        com.max.heybox.hblog.g.f74531b.q(b.f66732a + ", onScrollOut, bindingAdapterPosition = " + i10 + " viewTag = " + viewHolder);
        T tF = f(i10, viewHolder);
        if (tF == null) {
            return;
        }
        Event event = Event.SCROLL_OUT;
        if (k(tF, event)) {
            m(tF, event);
            p(i(tF, event), event, i10);
            if (b.f66733b) {
                this.f66644k.add(Integer.valueOf(i10));
            }
        }
    }

    @Override // com.max.hbcommon.base.adapter.a0
    public void c(int i10, @dl.e RecyclerView.ViewHolder viewHolder) {
        if (PatchProxy.proxy(new Object[]{new Integer(i10), viewHolder}, this, changeQuickRedirect, false, bb.c.b.Jw, new Class[]{Integer.TYPE, RecyclerView.ViewHolder.class}, Void.TYPE).isSupported) {
            return;
        }
        com.max.heybox.hblog.g.f74531b.q(b.f66732a + ", onScrollIn, bindingAdapterPosition = " + i10 + " viewTag = " + viewHolder);
        T tF = f(i10, viewHolder);
        if (tF == null) {
            return;
        }
        Event event = Event.SCROLL_IN;
        if (k(tF, event)) {
            m(tF, event);
            p(i(tF, event), event, i10);
            if (b.f66733b) {
                this.f66643j.add(Integer.valueOf(i10));
                if (i10 > this.f66646m) {
                    this.f66646m = i10;
                }
            }
        }
    }

    public final void e() {
        if (PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, bb.c.b.Ow, new Class[0], Void.TYPE).isSupported) {
            return;
        }
        Iterator<Integer> it = new fi.l(this.f66645l, this.f66646m).iterator();
        while (it.hasNext()) {
            int iNextInt = ((k0) it).nextInt();
            if (this.f66643j.contains(Integer.valueOf(iNextInt))) {
                com.max.heybox.hblog.g.f74531b.q(b.f66732a + ", checkTrackIn " + iNextInt + " scrollIn success");
            } else {
                com.max.heybox.hblog.g.f74531b.v(b.f66732a + ", checkTrackIn " + iNextInt + " don't scrollIn");
            }
        }
        this.f66645l = this.f66646m + 1;
        if (this.f66635b.getLayoutManager() instanceof LinearLayoutManager) {
            RecyclerView.LayoutManager layoutManager = this.f66635b.getLayoutManager();
            f0.n(layoutManager, "null cannot be cast to non-null type androidx.recyclerview.widget.LinearLayoutManager");
            int iFindFirstVisibleItemPosition = ((LinearLayoutManager) layoutManager).findFirstVisibleItemPosition();
            if (iFindFirstVisibleItemPosition == 0) {
                return;
            }
            Iterator<Integer> it2 = new fi.l(this.f66647n, iFindFirstVisibleItemPosition - 1).iterator();
            while (it2.hasNext()) {
                int iNextInt2 = ((k0) it2).nextInt();
                if (this.f66644k.contains(Integer.valueOf(iNextInt2))) {
                    com.max.heybox.hblog.g.f74531b.q(b.f66732a + ", checkTrackOut " + iNextInt2 + " scrollOut success");
                } else {
                    com.max.heybox.hblog.g.f74531b.v(b.f66732a + ", checkTrackOut " + iNextInt2 + " don't scrollOut");
                }
            }
            this.f66647n = iFindFirstVisibleItemPosition;
            return;
        }
        if (this.f66635b.getLayoutManager() instanceof StaggeredGridLayoutManager) {
            RecyclerView.LayoutManager layoutManager2 = this.f66635b.getLayoutManager();
            f0.n(layoutManager2, "null cannot be cast to non-null type androidx.recyclerview.widget.StaggeredGridLayoutManager");
            int[] iArrFindFirstVisibleItemPositions = ((StaggeredGridLayoutManager) layoutManager2).findFirstVisibleItemPositions(null);
            f0.o(iArrFindFirstVisibleItemPositions, "findFirstVisibleItemPositions(...)");
            Integer numNn = ArraysKt___ArraysKt.Nn(iArrFindFirstVisibleItemPositions);
            if (numNn == null || numNn.intValue() == 0) {
                return;
            }
            Iterator<Integer> it3 = new fi.l(this.f66647n, numNn.intValue() - 1).iterator();
            while (it3.hasNext()) {
                int iNextInt3 = ((k0) it3).nextInt();
                if (this.f66644k.contains(Integer.valueOf(iNextInt3))) {
                    com.max.heybox.hblog.g.f74531b.q(b.f66732a + ", checkTrackOut " + iNextInt3 + " scrollOut success " + ArraysKt___ArraysKt.Kh(iArrFindFirstVisibleItemPositions, ", ", null, null, 0, null, null, 62, null));
                } else {
                    com.max.heybox.hblog.g.f74531b.v(b.f66732a + ", checkTrackOut " + iNextInt3 + " don't scrollOut " + ArraysKt___ArraysKt.Kh(iArrFindFirstVisibleItemPositions, ", ", null, null, 0, null, null, 62, null));
                }
            }
            this.f66647n = numNn.intValue();
        }
    }

    @dl.e
    public abstract T f(int i10, @dl.e RecyclerView.ViewHolder viewHolder);

    @dl.e
    public final androidx.lifecycle.y g() {
        return this.f66634a;
    }

    @dl.d
    public final RecyclerView h() {
        return this.f66635b;
    }

    public abstract R i(T t10, @dl.d Event event);

    public abstract boolean k(T t10, @dl.d Event event);

    @androidx.annotation.k0
    public abstract void l(@dl.d List<? extends Triple<? extends R, ? extends Event, Integer>> list);

    public void m(T t10, @dl.d Event event) {
        if (PatchProxy.proxy(new Object[]{t10, event}, this, changeQuickRedirect, false, bb.c.b.Pw, new Class[]{Object.class, Event.class}, Void.TYPE).isSupported) {
            return;
        }
        f0.p(event, "event");
    }

    @androidx.annotation.k0
    public abstract void n(R r10, @dl.d Event event, int i10);

    public void p(R r10, @dl.d Event event, int i10) {
        if (PatchProxy.proxy(new Object[]{r10, event, new Integer(i10)}, this, changeQuickRedirect, false, bb.c.b.Lw, new Class[]{Object.class, Event.class, Integer.TYPE}, Void.TYPE).isSupported) {
            return;
        }
        f0.p(event, "event");
        this.f66641h.add(new Triple<>(r10, event, Integer.valueOf(i10)));
        this.f66639f.removeCallbacks(this.f66638e);
        this.f66639f.postDelayed(this.f66638e, this.f66637d);
    }

    @androidx.annotation.k0
    public final void q() {
        RecyclerViewItemWatcher<L> recyclerViewItemWatcher;
        if (PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, bb.c.b.Mw, new Class[0], Void.TYPE).isSupported || (recyclerViewItemWatcher = this.f66640g) == null) {
            return;
        }
        recyclerViewItemWatcher.A();
    }
}
