package com.max.hbcommon.base.adapter;

import android.annotation.SuppressLint;
import android.util.Log;
import android.util.SparseArray;
import android.view.View;
import androidx.annotation.k0;
import androidx.compose.ui.platform.AndroidComposeViewAccessibilityDelegateCompat;
import androidx.lifecycle.Lifecycle;
import androidx.recyclerview.widget.RecyclerView;
import androidx.recyclerview.widget.RecyclerView.Adapter;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.PatchProxyResult;
import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.internal.f0;
import kotlin.jvm.internal.t0;

/* JADX INFO: compiled from: RecyclerViewItemWatcher.kt */
/* JADX INFO: loaded from: classes9.dex */
@t0({"SMAP\nRecyclerViewItemWatcher.kt\nKotlin\n*S Kotlin\n*F\n+ 1 RecyclerViewItemWatcher.kt\ncom/max/hbcommon/base/adapter/RecyclerViewItemWatcher\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,514:1\n1#2:515\n*E\n"})
public class RecyclerViewItemWatcher<L extends RecyclerView.Adapter<?>> extends RecyclerView.OnScrollListener implements RecyclerView.OnChildAttachStateChangeListener, androidx.lifecycle.v, View.OnLayoutChangeListener {
    public static ChangeQuickRedirect changeQuickRedirect;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @dl.e
    private final androidx.lifecycle.y f66716b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @dl.d
    private final RecyclerView f66717c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @dl.d
    private final a0 f66718d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final int f66719e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final boolean f66720f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    @dl.d
    private final RecyclerView.ItemAnimator.ItemAnimatorFinishedListener f66721g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private boolean f66722h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    @dl.d
    private final SparseArray<p> f66723i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    @dl.d
    private final List<p> f66724j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private boolean f66725k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    @dl.e
    private RecyclerView.Adapter<?> f66726l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    @dl.d
    private final RecyclerViewItemWatcher<L>.a f66727m;

    /* JADX INFO: compiled from: RecyclerViewItemWatcher.kt */
    public final class a extends RecyclerView.AdapterDataObserver {
        public static ChangeQuickRedirect changeQuickRedirect;

        public a() {
        }

        private final void a(int i10, int i11) {
            Object[] objArr = {new Integer(i10), new Integer(i11)};
            ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
            Class cls = Integer.TYPE;
            if (PatchProxy.proxy(objArr, this, changeQuickRedirect2, false, bb.c.d.f31562u1, new Class[]{cls, cls}, Void.TYPE).isSupported) {
                return;
            }
            for (p pVar : ((RecyclerViewItemWatcher) RecyclerViewItemWatcher.this).f66724j) {
                int iA = pVar.a();
                if (iA == i10) {
                    pVar.f(i11 - i10);
                    ((RecyclerViewItemWatcher) RecyclerViewItemWatcher.this).f66725k = true;
                } else if (i10 < i11) {
                    if (i10 + 1 <= iA && iA <= i11) {
                        pVar.f(-1);
                        ((RecyclerViewItemWatcher) RecyclerViewItemWatcher.this).f66725k = true;
                    }
                } else if (i10 > i11) {
                    if (i11 <= iA && iA < i10) {
                        pVar.f(1);
                        ((RecyclerViewItemWatcher) RecyclerViewItemWatcher.this).f66725k = true;
                    }
                }
            }
        }

        @Override // androidx.recyclerview.widget.RecyclerView.AdapterDataObserver
        public void onChanged() {
            if (PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, bb.c.d.f31474q1, new Class[0], Void.TYPE).isSupported) {
                return;
            }
            com.max.heybox.hblog.g.f74531b.q(y.f66858a + ", DataObserver, onChanged");
            ((RecyclerViewItemWatcher) RecyclerViewItemWatcher.this).f66723i.clear();
            ((RecyclerViewItemWatcher) RecyclerViewItemWatcher.this).f66724j.clear();
            ((RecyclerViewItemWatcher) RecyclerViewItemWatcher.this).f66725k = true;
        }

        @Override // androidx.recyclerview.widget.RecyclerView.AdapterDataObserver
        public void onItemRangeInserted(int i10, int i11) {
            Object[] objArr = {new Integer(i10), new Integer(i11)};
            ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
            Class cls = Integer.TYPE;
            if (PatchProxy.proxy(objArr, this, changeQuickRedirect2, false, bb.c.d.f31518s1, new Class[]{cls, cls}, Void.TYPE).isSupported) {
                return;
            }
            com.max.heybox.hblog.g.f74531b.q(y.f66858a + ", DataObserver, onItemRangeInserted positionStart = " + i10 + ", itemCount = " + i11);
            for (p pVar : ((RecyclerViewItemWatcher) RecyclerViewItemWatcher.this).f66724j) {
                if (pVar.a() >= i10) {
                    ((RecyclerViewItemWatcher) RecyclerViewItemWatcher.this).f66725k = true;
                    pVar.f(i11);
                }
            }
        }

        @Override // androidx.recyclerview.widget.RecyclerView.AdapterDataObserver
        public void onItemRangeMoved(int i10, int i11, int i12) {
            Object[] objArr = {new Integer(i10), new Integer(i11), new Integer(i12)};
            ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
            Class cls = Integer.TYPE;
            if (PatchProxy.proxy(objArr, this, changeQuickRedirect2, false, bb.c.d.f31496r1, new Class[]{cls, cls, cls}, Void.TYPE).isSupported) {
                return;
            }
            com.max.heybox.hblog.g.f74531b.q(y.f66858a + ", DataObserver, onItemRangeMoved fromPosition = " + i10 + ", toPosition = " + i11 + ", itemCount = " + i12);
            for (int i13 = 0; i13 < i12; i13++) {
                a(i10 + i13, i11 + i13);
            }
        }

        @Override // androidx.recyclerview.widget.RecyclerView.AdapterDataObserver
        public void onItemRangeRemoved(int i10, int i11) {
            Object[] objArr = {new Integer(i10), new Integer(i11)};
            ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
            Class cls = Integer.TYPE;
            if (PatchProxy.proxy(objArr, this, changeQuickRedirect2, false, bb.c.d.f31540t1, new Class[]{cls, cls}, Void.TYPE).isSupported) {
                return;
            }
            com.max.heybox.hblog.g.f74531b.q(y.f66858a + ", DataObserver, onItemRangeRemoved positionStart = " + i10 + ", itemCount = " + i11);
            for (p pVar : ((RecyclerViewItemWatcher) RecyclerViewItemWatcher.this).f66724j) {
                if (pVar.a() >= i10) {
                    ((RecyclerViewItemWatcher) RecyclerViewItemWatcher.this).f66725k = true;
                    pVar.f(-i11);
                }
            }
        }
    }

    /* JADX INFO: compiled from: RecyclerViewItemWatcher.kt */
    public final /* synthetic */ class b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f66729a;

        static {
            int[] iArr = new int[Lifecycle.Event.values().length];
            try {
                iArr[Lifecycle.Event.ON_CREATE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[Lifecycle.Event.ON_START.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[Lifecycle.Event.ON_RESUME.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[Lifecycle.Event.ON_PAUSE.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                iArr[Lifecycle.Event.ON_STOP.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                iArr[Lifecycle.Event.ON_DESTROY.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                iArr[Lifecycle.Event.ON_ANY.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
            f66729a = iArr;
        }
    }

    /* JADX INFO: compiled from: RecyclerViewItemWatcher.kt */
    public static final class c extends RecyclerView.OnScrollListener {
        public static ChangeQuickRedirect changeQuickRedirect;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ RecyclerViewItemWatcher<L> f66730b;

        c(RecyclerViewItemWatcher<L> recyclerViewItemWatcher) {
            this.f66730b = recyclerViewItemWatcher;
        }

        @Override // androidx.recyclerview.widget.RecyclerView.OnScrollListener
        public void onScrollStateChanged(@dl.d RecyclerView recyclerView, int i10) {
            if (PatchProxy.proxy(new Object[]{recyclerView, new Integer(i10)}, this, changeQuickRedirect, false, bb.c.d.f31606w1, new Class[]{RecyclerView.class, Integer.TYPE}, Void.TYPE).isSupported) {
                return;
            }
            f0.p(recyclerView, "recyclerView");
            super.onScrollStateChanged(recyclerView, i10);
            Log.d(y.f66858a, y.f66858a + ", onScrollStateChanged");
            if (i10 == 1) {
                this.f66730b.B();
                recyclerView.removeOnScrollListener(this);
            }
        }

        @Override // androidx.recyclerview.widget.RecyclerView.OnScrollListener
        public void onScrolled(@dl.d RecyclerView recyclerView, int i10, int i11) {
            Object[] objArr = {recyclerView, new Integer(i10), new Integer(i11)};
            ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
            Class cls = Integer.TYPE;
            if (PatchProxy.proxy(objArr, this, changeQuickRedirect2, false, bb.c.d.f31584v1, new Class[]{RecyclerView.class, cls, cls}, Void.TYPE).isSupported) {
                return;
            }
            f0.p(recyclerView, "recyclerView");
            super.onScrolled(recyclerView, i10, i11);
            com.max.heybox.hblog.g.f74531b.q(y.f66858a + ", onScrolled, dx = " + i10 + ", dy = " + i10);
            if (i10 == 0 && i11 == 0) {
                return;
            }
            this.f66730b.B();
            recyclerView.removeOnScrollListener(this);
        }
    }

    public RecyclerViewItemWatcher(@dl.e androidx.lifecycle.y yVar, @dl.d RecyclerView recyclerView, @dl.d a0 listener, @androidx.annotation.f0(from = 0, to = AndroidComposeViewAccessibilityDelegateCompat.F) int i10, boolean z10) {
        Lifecycle lifecycle;
        f0.p(recyclerView, "recyclerView");
        f0.p(listener, "listener");
        this.f66716b = yVar;
        this.f66717c = recyclerView;
        this.f66718d = listener;
        this.f66719e = i10;
        this.f66720f = z10;
        this.f66721g = new RecyclerView.ItemAnimator.ItemAnimatorFinishedListener() { // from class: com.max.hbcommon.base.adapter.x
            @Override // androidx.recyclerview.widget.RecyclerView.ItemAnimator.ItemAnimatorFinishedListener
            public final void onAnimationsFinished() {
                RecyclerViewItemWatcher.p(this.f66857a);
            }
        };
        this.f66723i = new SparseArray<>();
        this.f66724j = new ArrayList();
        this.f66727m = new a();
        if (yVar != null && (lifecycle = yVar.getLifecycle()) != null) {
            lifecycle.a(this);
        }
        if (yVar == null) {
            s();
        }
    }

    public /* synthetic */ RecyclerViewItemWatcher(androidx.lifecycle.y yVar, RecyclerView recyclerView, a0 a0Var, int i10, boolean z10, int i11, kotlin.jvm.internal.u uVar) {
        this(yVar, recyclerView, a0Var, (i11 & 8) != 0 ? 0 : i10, (i11 & 16) != 0 ? true : z10);
    }

    private final boolean o(RecyclerView.ViewHolder viewHolder) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{viewHolder}, this, changeQuickRedirect, false, bb.c.d.f31382m1, new Class[]{RecyclerView.ViewHolder.class}, Boolean.TYPE);
        if (patchProxyResultProxy.isSupported) {
            return ((Boolean) patchProxyResultProxy.result).booleanValue();
        }
        return (viewHolder == null || viewHolder.getBindingAdapter() == null) ? false : true;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void p(RecyclerViewItemWatcher this$0) {
        if (PatchProxy.proxy(new Object[]{this$0}, null, changeQuickRedirect, true, bb.c.d.f31451p1, new Class[]{RecyclerViewItemWatcher.class}, Void.TYPE).isSupported) {
            return;
        }
        f0.p(this$0, "this$0");
        this$0.u("ItemAnimatorFinishedListener.onAnimationsFinished", false);
    }

    private final void u(String str, boolean z10) {
        if (PatchProxy.proxy(new Object[]{str, new Byte(z10 ? (byte) 1 : (byte) 0)}, this, changeQuickRedirect, false, bb.c.d.f31128b1, new Class[]{String.class, Boolean.TYPE}, Void.TYPE).isSupported) {
            return;
        }
        RecyclerView.ItemAnimator itemAnimator = this.f66717c.getItemAnimator();
        if (!z10 || itemAnimator == null) {
            w(null, str);
        } else {
            itemAnimator.isRunning();
            w(null, str);
        }
    }

    static /* synthetic */ void v(RecyclerViewItemWatcher recyclerViewItemWatcher, String str, boolean z10, int i10, Object obj) {
        if (PatchProxy.proxy(new Object[]{recyclerViewItemWatcher, str, new Byte(z10 ? (byte) 1 : (byte) 0), new Integer(i10), obj}, null, changeQuickRedirect, true, bb.c.d.f31151c1, new Class[]{RecyclerViewItemWatcher.class, String.class, Boolean.TYPE, Integer.TYPE, Object.class}, Void.TYPE).isSupported) {
            return;
        }
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: processChangeEvent");
        }
        if ((i10 & 2) != 0) {
            z10 = true;
        }
        recyclerViewItemWatcher.u(str, z10);
    }

    private final void w(View view, String str) {
        if (PatchProxy.proxy(new Object[]{view, str}, this, changeQuickRedirect, false, bb.c.d.f31175d1, new Class[]{View.class, String.class}, Void.TYPE).isSupported) {
            return;
        }
        y();
        if (view != null) {
            x(view, true, str);
        }
        int childCount = this.f66717c.getChildCount();
        for (int i10 = 0; i10 < childCount; i10++) {
            View childAt = this.f66717c.getChildAt(i10);
            if (childAt != null && childAt != view) {
                x(childAt, false, str);
            }
        }
    }

    private final void x(View view, boolean z10, String str) {
        if (PatchProxy.proxy(new Object[]{view, new Byte(z10 ? (byte) 1 : (byte) 0), str}, this, changeQuickRedirect, false, bb.c.d.f31221f1, new Class[]{View.class, Boolean.TYPE, String.class}, Void.TYPE).isSupported) {
            return;
        }
        RecyclerView.ViewHolder childViewHolder = view.getParent() == null || view.getParent() == this.f66717c ? this.f66717c.getChildViewHolder(view) : null;
        com.max.heybox.hblog.g.f74531b.q(y.f66858a + ", processChild, viewHolder = " + childViewHolder + ", context = " + this.f66716b);
        if (childViewHolder != null) {
            z(this.f66717c, childViewHolder, z10, str);
        }
    }

    private final void y() {
        RecyclerView.Adapter<?> adapter;
        if (PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, bb.c.d.f31198e1, new Class[0], Void.TYPE).isSupported || (adapter = this.f66717c.getAdapter()) == null || f0.g(this.f66726l, adapter)) {
            return;
        }
        RecyclerView.Adapter<?> adapter2 = this.f66726l;
        if (adapter2 != null) {
            adapter2.unregisterAdapterDataObserver(this.f66727m);
        }
        adapter.registerAdapterDataObserver(this.f66727m);
        this.f66726l = adapter;
    }

    private final void z(RecyclerView recyclerView, RecyclerView.ViewHolder viewHolder, boolean z10, String str) {
        if (PatchProxy.proxy(new Object[]{recyclerView, viewHolder, new Byte(z10 ? (byte) 1 : (byte) 0), str}, this, changeQuickRedirect, false, bb.c.d.f31244g1, new Class[]{RecyclerView.class, RecyclerView.ViewHolder.class, Boolean.TYPE, String.class}, Void.TYPE).isSupported) {
            return;
        }
        com.max.heybox.hblog.g.f74531b.q(y.f66858a + ", " + str + ".processVisibilityEvents " + System.identityHashCode(viewHolder) + ", context = " + this.f66716b + ", " + z10 + ", " + viewHolder.getBindingAdapterPosition());
        View itemView = viewHolder.itemView;
        f0.o(itemView, "itemView");
        int iIdentityHashCode = System.identityHashCode(itemView);
        p pVar = this.f66723i.get(iIdentityHashCode);
        if (pVar == null) {
            pVar = new p(Integer.valueOf(viewHolder.getBindingAdapterPosition()));
            this.f66723i.put(iIdentityHashCode, pVar);
            this.f66724j.add(pVar);
        } else if (viewHolder.getBindingAdapterPosition() != -1 && pVar.a() != viewHolder.getBindingAdapterPosition()) {
            pVar.e(viewHolder.getBindingAdapterPosition());
        }
        if (pVar.g(itemView, recyclerView, z10)) {
            pVar.b(viewHolder, this.f66718d, z10, this.f66719e);
        }
    }

    @k0
    public final void A() {
        if (PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, bb.c.d.f31290i1, new Class[0], Void.TYPE).isSupported) {
            return;
        }
        com.max.heybox.hblog.g.f74531b.q(y.f66858a + ", requestVisibilityCheck");
        B();
        v(this, "requestVisibilityCheck", false, 2, null);
    }

    public final void B() {
        if (PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, bb.c.d.Z0, new Class[0], Void.TYPE).isSupported || this.f66722h) {
            return;
        }
        com.max.heybox.hblog.g.f74531b.q(y.f66858a + ", startTrack");
        this.f66717c.addOnChildAttachStateChangeListener(this);
        this.f66717c.addOnScrollListener(this);
        this.f66722h = true;
    }

    @Override // androidx.lifecycle.v
    public void d(@dl.d androidx.lifecycle.y source, @dl.d Lifecycle.Event event) {
        if (PatchProxy.proxy(new Object[]{source, event}, this, changeQuickRedirect, false, bb.c.d.X0, new Class[]{androidx.lifecycle.y.class, Lifecycle.Event.class}, Void.TYPE).isSupported) {
            return;
        }
        f0.p(source, "source");
        f0.p(event, "event");
        int i10 = b.f66729a[event.ordinal()];
        if (i10 == 3) {
            s();
        } else if (i10 == 5) {
            t();
        } else {
            if (i10 != 6) {
                return;
            }
            r();
        }
    }

    public final void h() {
        if (PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, bb.c.d.f31267h1, new Class[0], Void.TYPE).isSupported) {
            return;
        }
        this.f66723i.clear();
        this.f66724j.clear();
    }

    @dl.e
    public final androidx.lifecycle.y i() {
        return this.f66716b;
    }

    @dl.d
    public final a0 k() {
        return this.f66718d;
    }

    @dl.d
    public final RecyclerView m() {
        return this.f66717c;
    }

    public final int n() {
        return this.f66719e;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.OnChildAttachStateChangeListener
    public void onChildViewAttachedToWindow(@dl.d View view) {
        if (PatchProxy.proxy(new Object[]{view}, this, changeQuickRedirect, false, bb.c.d.f31359l1, new Class[]{View.class}, Void.TYPE).isSupported) {
            return;
        }
        f0.p(view, "view");
        x(view, false, "onChildViewAttachedToWindow");
    }

    @Override // androidx.recyclerview.widget.RecyclerView.OnChildAttachStateChangeListener
    public void onChildViewDetachedFromWindow(@dl.d View view) {
        if (PatchProxy.proxy(new Object[]{view}, this, changeQuickRedirect, false, bb.c.d.f31405n1, new Class[]{View.class}, Void.TYPE).isSupported) {
            return;
        }
        f0.p(view, "view");
        if (!this.f66725k) {
            x(view, true, "onChildViewDetachedFromWindow");
        } else {
            w(view, "onChildViewDetachedFromWindow");
            this.f66725k = false;
        }
    }

    @Override // android.view.View.OnLayoutChangeListener
    public void onLayoutChange(@dl.e View view, int i10, int i11, int i12, int i13, int i14, int i15, int i16, int i17) {
        Object[] objArr = {view, new Integer(i10), new Integer(i11), new Integer(i12), new Integer(i13), new Integer(i14), new Integer(i15), new Integer(i16), new Integer(i17)};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        Class cls = Integer.TYPE;
        if (PatchProxy.proxy(objArr, this, changeQuickRedirect2, false, bb.c.d.f31428o1, new Class[]{View.class, cls, cls, cls, cls, cls, cls, cls, cls}, Void.TYPE).isSupported) {
            return;
        }
        v(this, "onLayoutChange", false, 2, null);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.OnScrollListener
    public void onScrolled(@dl.d RecyclerView recyclerView, int i10, int i11) {
        Object[] objArr = {recyclerView, new Integer(i10), new Integer(i11)};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        Class cls = Integer.TYPE;
        if (PatchProxy.proxy(objArr, this, changeQuickRedirect2, false, bb.c.d.f31105a1, new Class[]{RecyclerView.class, cls, cls}, Void.TYPE).isSupported) {
            return;
        }
        f0.p(recyclerView, "recyclerView");
        super.onScrolled(recyclerView, i10, i11);
        v(this, "onScrolled", false, 2, null);
    }

    public final void r() {
        if (PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, bb.c.d.f31336k1, new Class[0], Void.TYPE).isSupported) {
            return;
        }
        h();
    }

    @SuppressLint({"ClickableViewAccessibility"})
    public final void s() {
        if (PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, bb.c.d.Y0, new Class[0], Void.TYPE).isSupported) {
            return;
        }
        Log.d(y.f66858a, y.f66858a + ", onStart, isExposureOnAction = " + this.f66720f + ", recyclerView.parent = " + this.f66717c.getParent());
        if (this.f66720f) {
            this.f66717c.addOnScrollListener(new c(this));
        } else {
            B();
        }
    }

    public final void t() {
        if (PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, bb.c.d.f31313j1, new Class[0], Void.TYPE).isSupported) {
            return;
        }
        this.f66722h = false;
        this.f66717c.removeOnChildAttachStateChangeListener(this);
        this.f66717c.removeOnScrollListener(this);
        this.f66717c.removeOnLayoutChangeListener(this);
    }
}
