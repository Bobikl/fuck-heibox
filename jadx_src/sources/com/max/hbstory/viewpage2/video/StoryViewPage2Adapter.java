package com.max.hbstory.viewpage2.video;

import android.content.Context;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.LiveData;
import androidx.lifecycle.j0;
import androidx.recyclerview.widget.RecyclerView;
import androidx.viewpager2.widget.ViewPager2;
import com.max.hbstory.R;
import com.max.hbstory.bean.StoryCardIdInfoObj;
import com.max.hbstory.bean.StoryItemsObj;
import com.max.hbstory.utils.StoryUtilsKt;
import com.max.hbstory.widget.StoryVideoFrameLayout;
import com.max.hbutils.utils.k;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.PatchProxyResult;
import java.util.List;
import kotlin.b2;
import kotlin.jvm.internal.f0;
import kotlin.jvm.internal.t0;
import kotlin.jvm.internal.u;
import od.g;
import yh.l;

/* JADX INFO: compiled from: StoryViewPage2Adapter.kt */
/* JADX INFO: loaded from: classes13.dex */
@t0({"SMAP\nStoryViewPage2Adapter.kt\nKotlin\n*S Kotlin\n*F\n+ 1 StoryViewPage2Adapter.kt\ncom/max/hbstory/viewpage2/video/StoryViewPage2Adapter\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,204:1\n1#2:205\n*E\n"})
public final class StoryViewPage2Adapter extends RecyclerView.Adapter<c> {
    public static ChangeQuickRedirect changeQuickRedirect = null;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    @dl.d
    public static final a f73020e = new a(null);

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final int f73021f = 1;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static final int f73022g = 2;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @dl.e
    private final g f73023b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @dl.d
    private final com.max.hbstory.d f73024c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @dl.e
    private List<StoryItemsObj> f73025d;

    /* JADX INFO: compiled from: StoryViewPage2Adapter.kt */
    public static final class a {
        private a() {
        }

        public /* synthetic */ a(u uVar) {
            this();
        }
    }

    public StoryViewPage2Adapter(@dl.e g gVar, @dl.d com.max.hbstory.d mStoryContext) {
        LiveData<List<StoryItemsObj>> liveDataF;
        f0.p(mStoryContext, "mStoryContext");
        this.f73023b = gVar;
        this.f73024c = mStoryContext;
        com.max.hbstory.g gVarD = mStoryContext.d();
        if (gVarD != null) {
            gVarD.g();
        }
        v();
        com.max.hbstory.g gVarD2 = mStoryContext.d();
        this.f73025d = (gVarD2 == null || (liveDataF = gVarD2.F()) == null) ? null : liveDataF.f();
    }

    private final void A(c cVar, final int i10) {
        if (PatchProxy.proxy(new Object[]{cVar, new Integer(i10)}, this, changeQuickRedirect, false, bb.c.k.f33556fj, new Class[]{c.class, Integer.TYPE}, Void.TYPE).isSupported) {
            return;
        }
        View root = cVar.mo41getCoreViewBinding().getRoot();
        f0.o(root, "getRoot(...)");
        C(root, i10, new l<View, b2>() { // from class: com.max.hbstory.viewpage2.video.StoryViewPage2Adapter$refreshItem$1
            public static ChangeQuickRedirect changeQuickRedirect;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(1);
            }

            public final void a(@dl.d View view) {
                if (PatchProxy.proxy(new Object[]{view}, this, changeQuickRedirect, false, bb.c.k.f33897uj, new Class[]{View.class}, Void.TYPE).isSupported) {
                    return;
                }
                f0.p(view, "view");
                a aVar = view instanceof a ? (a) view : null;
                if (aVar != null) {
                    StoryViewPage2Adapter storyViewPage2Adapter = this.f73028b;
                    int i11 = i10;
                    aVar.c(storyViewPage2Adapter.f73024c, i11);
                    aVar.e(storyViewPage2Adapter.f73024c, i11);
                }
            }

            /* JADX WARN: Type inference failed for: r9v3, types: [java.lang.Object, kotlin.b2] */
            @Override // yh.l
            public /* bridge */ /* synthetic */ b2 invoke(View view) {
                PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{view}, this, changeQuickRedirect, false, bb.c.k.f33919vj, new Class[]{Object.class}, Object.class);
                if (patchProxyResultProxy.isSupported) {
                    return patchProxyResultProxy.result;
                }
                a(view);
                return b2.f124493a;
            }
        });
    }

    private final void B(View view) {
        if (PatchProxy.proxy(new Object[]{view}, this, changeQuickRedirect, false, bb.c.k.f33486cj, new Class[]{View.class}, Void.TYPE).isSupported) {
            return;
        }
        view.setLayoutParams(new ViewGroup.LayoutParams(-1, -1));
    }

    private final void C(View view, int i10, l<? super View, b2> lVar) {
        if (PatchProxy.proxy(new Object[]{view, new Integer(i10), lVar}, this, changeQuickRedirect, false, bb.c.k.f33602hj, new Class[]{View.class, Integer.TYPE, l.class}, Void.TYPE).isSupported) {
            return;
        }
        lVar.invoke(view);
        if (view instanceof ViewGroup) {
            ViewGroup viewGroup = (ViewGroup) view;
            int childCount = viewGroup.getChildCount();
            for (int i11 = 0; i11 < childCount; i11++) {
                View childAt = viewGroup.getChildAt(i11);
                f0.m(childAt);
                C(childAt, i10, lVar);
            }
        }
    }

    private final void D(View view, l<? super View, b2> lVar) {
        if (PatchProxy.proxy(new Object[]{view, lVar}, this, changeQuickRedirect, false, bb.c.k.f33624ij, new Class[]{View.class, l.class}, Void.TYPE).isSupported) {
            return;
        }
        lVar.invoke(view);
        if (view instanceof ViewGroup) {
            ViewGroup viewGroup = (ViewGroup) view;
            int childCount = viewGroup.getChildCount();
            for (int i10 = 0; i10 < childCount; i10++) {
                View childAt = viewGroup.getChildAt(i10);
                f0.m(childAt);
                D(childAt, lVar);
            }
        }
    }

    private final l3.c r(final ViewGroup viewGroup) {
        return new l3.c() { // from class: com.max.hbstory.viewpage2.video.e
            @Override // l3.c
            public final View getRoot() {
                return StoryViewPage2Adapter.s(viewGroup);
            }
        };
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final View s(ViewGroup parent) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{parent}, null, changeQuickRedirect, true, bb.c.k.f33717mj, new Class[]{ViewGroup.class}, View.class);
        if (patchProxyResultProxy.isSupported) {
            return (View) patchProxyResultProxy.result;
        }
        f0.p(parent, "$parent");
        FrameLayout frameLayout = new FrameLayout(parent.getContext());
        frameLayout.setBackgroundColor(androidx.core.content.d.f(frameLayout.getContext(), R.color.black_day));
        return frameLayout;
    }

    private final l3.c t(pd.c cVar, Context context) {
        yh.a<View> aVarA;
        yh.a<View> aVarB;
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{cVar, context}, this, changeQuickRedirect, false, bb.c.k.f33463bj, new Class[]{pd.c.class, Context.class}, l3.c.class);
        if (patchProxyResultProxy.isSupported) {
            return (l3.c) patchProxyResultProxy.result;
        }
        g gVar = this.f73023b;
        View view = null;
        od.c cVarB = gVar != null ? gVar.b() : null;
        View viewInvoke = (cVarB == null || (aVarB = cVarB.b()) == null) ? null : aVarB.invoke();
        if (cVarB != null && (aVarA = cVarB.a()) != null) {
            view = aVarA.invoke();
        }
        if (viewInvoke != null) {
            B(viewInvoke);
        }
        if (view != null) {
            B(view);
        }
        FrameLayout frameLayoutB = cVar.b();
        if (viewInvoke == null) {
            viewInvoke = new View(context);
        }
        frameLayoutB.addView(viewInvoke);
        FrameLayout frameLayoutB2 = cVar.b();
        if (view == null) {
            view = new View(context);
        }
        frameLayoutB2.addView(view);
        return cVar;
    }

    private final l3.c u(pd.e eVar) {
        od.d dVarD;
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{eVar}, this, changeQuickRedirect, false, bb.c.k.f33510dj, new Class[]{pd.e.class}, l3.c.class);
        if (patchProxyResultProxy.isSupported) {
            return (l3.c) patchProxyResultProxy.result;
        }
        FrameLayout frameLayoutB = eVar.b();
        g gVar = this.f73023b;
        if (gVar != null && (dVarD = gVar.d()) != null) {
            yh.a<View> aVarA = dVarD.a();
            frameLayoutB.addView(aVarA != null ? aVarA.invoke() : null);
            yh.a<View> aVarC = dVarD.c();
            frameLayoutB.addView(aVarC != null ? aVarC.invoke() : null);
            yh.a<View> aVarB = dVarD.b();
            frameLayoutB.addView(aVarB != null ? aVarB.invoke() : null);
        }
        return eVar;
    }

    private final void v() {
        Fragment fragmentB;
        com.max.hbstory.g gVarD;
        LiveData<List<StoryItemsObj>> liveDataF;
        if (PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, bb.c.k.Xi, new Class[0], Void.TYPE).isSupported || (fragmentB = this.f73024c.b()) == null || (gVarD = this.f73024c.d()) == null || (liveDataF = gVarD.F()) == null) {
            return;
        }
        final l<List<? extends StoryItemsObj>, b2> lVar = new l<List<? extends StoryItemsObj>, b2>() { // from class: com.max.hbstory.viewpage2.video.StoryViewPage2Adapter$observeStoryItemsObjList$1
            public static ChangeQuickRedirect changeQuickRedirect;

            {
                super(1);
            }

            public final void a(List<StoryItemsObj> list) {
                LiveData<List<StoryItemsObj>> liveDataE;
                boolean z10 = true;
                if (PatchProxy.proxy(new Object[]{list}, this, changeQuickRedirect, false, bb.c.k.f33809qj, new Class[]{List.class}, Void.TYPE).isSupported) {
                    return;
                }
                com.max.hbstory.g gVarD2 = this.f73026b.f73024c.d();
                List<StoryItemsObj> listF = (gVarD2 == null || (liveDataE = gVarD2.E()) == null) ? null : liveDataE.f();
                this.f73026b.f73025d = list;
                if (listF != null && !listF.isEmpty()) {
                    z10 = false;
                }
                if (z10 || !list.containsAll(listF)) {
                    this.f73026b.notifyDataSetChanged();
                } else {
                    this.f73026b.notifyItemRangeInserted(listF.size(), list.size() - listF.size());
                }
                com.max.hbstory.g gVarD3 = this.f73026b.f73024c.d();
                if (gVarD3 != null) {
                    gVarD3.j0(k.b(k.r(list), StoryItemsObj.class));
                }
            }

            /* JADX WARN: Type inference failed for: r9v3, types: [java.lang.Object, kotlin.b2] */
            @Override // yh.l
            public /* bridge */ /* synthetic */ b2 invoke(List<? extends StoryItemsObj> list) {
                PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{list}, this, changeQuickRedirect, false, bb.c.k.f33831rj, new Class[]{Object.class}, Object.class);
                if (patchProxyResultProxy.isSupported) {
                    return patchProxyResultProxy.result;
                }
                a(list);
                return b2.f124493a;
            }
        };
        liveDataF.k(fragmentB, new j0() { // from class: com.max.hbstory.viewpage2.video.d
            @Override // androidx.lifecycle.j0
            public final void a(Object obj) {
                StoryViewPage2Adapter.w(lVar, obj);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void w(l tmp0, Object obj) {
        if (PatchProxy.proxy(new Object[]{tmp0, obj}, null, changeQuickRedirect, true, bb.c.k.f33694lj, new Class[]{l.class, Object.class}, Void.TYPE).isSupported) {
            return;
        }
        f0.p(tmp0, "$tmp0");
        tmp0.invoke(obj);
    }

    public final void E(int i10) {
        RecyclerView.ViewHolder viewHolderFindViewHolderForAdapterPosition;
        if (PatchProxy.proxy(new Object[]{new Integer(i10)}, this, changeQuickRedirect, false, bb.c.k.f33579gj, new Class[]{Integer.TYPE}, Void.TYPE).isSupported) {
            return;
        }
        try {
            ViewPager2 viewPager2E = this.f73024c.e();
            View childAt = viewPager2E != null ? viewPager2E.getChildAt(0) : null;
            RecyclerView recyclerView = childAt instanceof RecyclerView ? (RecyclerView) childAt : null;
            if (recyclerView == null || (viewHolderFindViewHolderForAdapterPosition = recyclerView.findViewHolderForAdapterPosition(i10)) == null) {
                return;
            }
            f0.n(viewHolderFindViewHolderForAdapterPosition, "null cannot be cast to non-null type com.max.hbstory.viewpage2.video.StoryViewHolder");
            A((c) viewHolderFindViewHolderForAdapterPosition, i10);
        } catch (Throwable th2) {
            com.max.heybox.hblog.g.f74531b.v("StoryViewPager2Adapter updatePosition position: " + i10 + "  error: " + th2.getMessage());
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public int getItemCount() {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, bb.c.k.f33648jj, new Class[0], Integer.TYPE);
        if (patchProxyResultProxy.isSupported) {
            return ((Integer) patchProxyResultProxy.result).intValue();
        }
        List<StoryItemsObj> list = this.f73025d;
        if (list != null) {
            return list.size();
        }
        return 0;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public int getItemViewType(int i10) {
        StoryItemsObj storyItemsObj;
        StoryCardIdInfoObj card_id_info;
        Object[] objArr = {new Integer(i10)};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        Class cls = Integer.TYPE;
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(objArr, this, changeQuickRedirect2, false, bb.c.k.Zi, new Class[]{cls}, cls);
        if (patchProxyResultProxy.isSupported) {
            return ((Integer) patchProxyResultProxy.result).intValue();
        }
        List<StoryItemsObj> list = this.f73025d;
        if (list == null || (storyItemsObj = list.get(i10)) == null || (card_id_info = storyItemsObj.getCard_id_info()) == null) {
            return 0;
        }
        return card_id_info.getCard_type();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public /* bridge */ /* synthetic */ void onBindViewHolder(RecyclerView.ViewHolder viewHolder, int i10) {
        if (PatchProxy.proxy(new Object[]{viewHolder, new Integer(i10)}, this, changeQuickRedirect, false, bb.c.k.f33763oj, new Class[]{RecyclerView.ViewHolder.class, Integer.TYPE}, Void.TYPE).isSupported) {
            return;
        }
        x((c) viewHolder, i10);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public /* bridge */ /* synthetic */ RecyclerView.ViewHolder onCreateViewHolder(ViewGroup viewGroup, int i10) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{viewGroup, new Integer(i10)}, this, changeQuickRedirect, false, bb.c.k.f33740nj, new Class[]{ViewGroup.class, Integer.TYPE}, RecyclerView.ViewHolder.class);
        return patchProxyResultProxy.isSupported ? (RecyclerView.ViewHolder) patchProxyResultProxy.result : y(viewGroup, i10);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public /* bridge */ /* synthetic */ void onViewRecycled(RecyclerView.ViewHolder viewHolder) {
        if (PatchProxy.proxy(new Object[]{viewHolder}, this, changeQuickRedirect, false, bb.c.k.f33786pj, new Class[]{RecyclerView.ViewHolder.class}, Void.TYPE).isSupported) {
            return;
        }
        z((c) viewHolder);
    }

    public final /* synthetic */ <T> List<T> q(List<? extends T> list) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{list}, this, changeQuickRedirect, false, bb.c.k.Yi, new Class[]{List.class}, List.class);
        if (patchProxyResultProxy.isSupported) {
            return (List) patchProxyResultProxy.result;
        }
        String strR = k.r(list);
        f0.y(4, androidx.exifinterface.media.a.f23244d5);
        return k.b(strR, Object.class);
    }

    public void x(@dl.d c holder, int i10) {
        if (PatchProxy.proxy(new Object[]{holder, new Integer(i10)}, this, changeQuickRedirect, false, bb.c.k.f33533ej, new Class[]{c.class, Integer.TYPE}, Void.TYPE).isSupported) {
            return;
        }
        f0.p(holder, "holder");
        holder.c(this.f73024c, i10);
        holder.e(this.f73024c, i10);
        A(holder, i10);
        l3.c cVarMo41getCoreViewBinding = holder.mo41getCoreViewBinding();
        pd.e eVar = cVarMo41getCoreViewBinding instanceof pd.e ? (pd.e) cVarMo41getCoreViewBinding : null;
        StoryVideoFrameLayout storyVideoFrameLayout = eVar != null ? eVar.f138278b : null;
        if (storyVideoFrameLayout != null) {
            storyVideoFrameLayout.setTag(StoryUtilsKt.f73012a + i10);
        }
        l3.c cVarMo41getCoreViewBinding2 = holder.mo41getCoreViewBinding();
        pd.c cVar = cVarMo41getCoreViewBinding2 instanceof pd.c ? (pd.c) cVarMo41getCoreViewBinding2 : null;
        FrameLayout frameLayout = cVar != null ? cVar.f138271c : null;
        if (frameLayout != null) {
            frameLayout.setTag(StoryUtilsKt.f73013b + i10);
        }
        Log.d("observePageChanges", "onBindViewHolder  position: " + i10);
    }

    @dl.d
    public c y(@dl.d ViewGroup parent, int i10) {
        l3.c cVarU;
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{parent, new Integer(i10)}, this, changeQuickRedirect, false, bb.c.k.f33440aj, new Class[]{ViewGroup.class, Integer.TYPE}, c.class);
        if (patchProxyResultProxy.isSupported) {
            return (c) patchProxyResultProxy.result;
        }
        f0.p(parent, "parent");
        if (i10 == 1) {
            pd.e eVarC = pd.e.c(LayoutInflater.from(parent.getContext()));
            f0.o(eVarC, "inflate(...)");
            cVarU = u(eVarC);
        } else if (i10 != 2) {
            cVarU = r(parent);
        } else {
            pd.c cVarC = pd.c.c(LayoutInflater.from(parent.getContext()));
            f0.o(cVarC, "inflate(...)");
            Context context = parent.getContext();
            f0.o(context, "getContext(...)");
            cVarU = t(cVarC, context);
        }
        View root = cVarU.getRoot();
        f0.o(root, "getRoot(...)");
        B(root);
        return new c(cVarU);
    }

    public void z(@dl.d c holder) {
        if (PatchProxy.proxy(new Object[]{holder}, this, changeQuickRedirect, false, bb.c.k.f33671kj, new Class[]{c.class}, Void.TYPE).isSupported) {
            return;
        }
        f0.p(holder, "holder");
        holder.f();
        View root = holder.mo41getCoreViewBinding().getRoot();
        f0.o(root, "getRoot(...)");
        D(root, new l<View, b2>() { // from class: com.max.hbstory.viewpage2.video.StoryViewPage2Adapter.onViewRecycled.1
            public static ChangeQuickRedirect changeQuickRedirect;

            public final void a(@dl.d View view) {
                if (PatchProxy.proxy(new Object[]{view}, this, changeQuickRedirect, false, bb.c.k.f33853sj, new Class[]{View.class}, Void.TYPE).isSupported) {
                    return;
                }
                f0.p(view, "view");
                com.max.hbstory.viewpage2.video.a aVar = view instanceof com.max.hbstory.viewpage2.video.a ? (com.max.hbstory.viewpage2.video.a) view : null;
                if (aVar != null) {
                    aVar.f();
                }
            }

            /* JADX WARN: Type inference failed for: r9v3, types: [java.lang.Object, kotlin.b2] */
            @Override // yh.l
            public /* bridge */ /* synthetic */ b2 invoke(View view) {
                PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{view}, this, changeQuickRedirect, false, bb.c.k.f33875tj, new Class[]{Object.class}, Object.class);
                if (patchProxyResultProxy.isSupported) {
                    return patchProxyResultProxy.result;
                }
                a(view);
                return b2.f124493a;
            }
        });
        super.onViewRecycled(holder);
    }
}
