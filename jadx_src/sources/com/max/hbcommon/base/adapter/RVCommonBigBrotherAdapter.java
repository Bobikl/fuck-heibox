package com.max.hbcommon.base.adapter;

import android.content.Context;
import android.view.ViewGroup;
import androidx.annotation.k1;
import androidx.recyclerview.widget.RecyclerView;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.PatchProxyResult;
import java.util.List;
import kotlin.b0;
import kotlin.b2;
import kotlin.jvm.internal.f0;

/* JADX INFO: compiled from: RVCommonBigBrotherAdapter.kt */
/* JADX INFO: loaded from: classes9.dex */
public abstract class RVCommonBigBrotherAdapter<T> extends s<T> implements e<T>, l {
    public static ChangeQuickRedirect changeQuickRedirect;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @dl.d
    private final kotlin.z f66713b;

    public RVCommonBigBrotherAdapter(@dl.e final Context context, @dl.e List<? extends T> list) {
        super(context, list, -1);
        this.f66713b = b0.c(new yh.a<BigBrotherAdapterWrapper<T>>() { // from class: com.max.hbcommon.base.adapter.RVCommonBigBrotherAdapter$bigBotherAdapterWrapper$2
            public static ChangeQuickRedirect changeQuickRedirect;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(0);
            }

            @dl.d
            public final BigBrotherAdapterWrapper<T> a() {
                PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 2050, new Class[0], BigBrotherAdapterWrapper.class);
                if (patchProxyResultProxy.isSupported) {
                    return (BigBrotherAdapterWrapper) patchProxyResultProxy.result;
                }
                Context context2 = context;
                RVCommonBigBrotherAdapter<T> rVCommonBigBrotherAdapter = this;
                return new BigBrotherAdapterWrapper<>(context2, rVCommonBigBrotherAdapter, rVCommonBigBrotherAdapter);
            }

            @Override // yh.a
            public /* bridge */ /* synthetic */ Object invoke() {
                PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, bb.c.d.f31604w, new Class[0], Object.class);
                return patchProxyResultProxy.isSupported ? patchProxyResultProxy.result : a();
            }
        });
    }

    private final BigBrotherAdapterWrapper<T> m() {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, bb.c.d.f31103a, new Class[0], BigBrotherAdapterWrapper.class);
        return patchProxyResultProxy.isSupported ? (BigBrotherAdapterWrapper) patchProxyResultProxy.result : (BigBrotherAdapterWrapper) this.f66713b.getValue();
    }

    @k1
    static /* synthetic */ <T> Object p(RVCommonBigBrotherAdapter<T> rVCommonBigBrotherAdapter, kotlin.coroutines.c<? super b2> cVar) throws Throwable {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{rVCommonBigBrotherAdapter, cVar}, null, changeQuickRedirect, true, 2033, new Class[]{RVCommonBigBrotherAdapter.class, kotlin.coroutines.c.class}, Object.class);
        if (patchProxyResultProxy.isSupported) {
            return patchProxyResultProxy.result;
        }
        Object objD = rVCommonBigBrotherAdapter.m().d(cVar);
        return objD == kotlin.coroutines.intrinsics.b.h() ? objD : b2.f124493a;
    }

    @Override // com.max.hbcommon.base.adapter.e
    public void c(@dl.d g gVar) {
        if (PatchProxy.proxy(new Object[]{gVar}, this, changeQuickRedirect, false, bb.c.d.f31449p, new Class[]{g.class}, Void.TYPE).isSupported) {
            return;
        }
        e.a.b(this, gVar);
    }

    @Override // com.max.hbcommon.base.adapter.l
    @k1
    @dl.e
    public Object d(@dl.d kotlin.coroutines.c<? super b2> cVar) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{cVar}, this, changeQuickRedirect, false, bb.c.d.f31173d, new Class[]{kotlin.coroutines.c.class}, Object.class);
        return patchProxyResultProxy.isSupported ? patchProxyResultProxy.result : p(this, cVar);
    }

    @Override // com.max.hbcommon.base.adapter.e
    @dl.d
    public final Integer e(T t10) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{t10}, this, changeQuickRedirect, false, bb.c.d.f31403n, new Class[]{Object.class}, Integer.class);
        if (patchProxyResultProxy.isSupported) {
            return (Integer) patchProxyResultProxy.result;
        }
        return 1;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public int getItemViewType(int i10) {
        Object[] objArr = {new Integer(i10)};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        Class cls = Integer.TYPE;
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(objArr, this, changeQuickRedirect2, false, bb.c.d.f31380m, new Class[]{cls}, cls);
        if (patchProxyResultProxy.isSupported) {
            return ((Integer) patchProxyResultProxy.result).intValue();
        }
        Integer numR = m().r(i10);
        if (numR != null) {
            return numR.intValue();
        }
        return 0;
    }

    @Override // com.max.hbcommon.base.adapter.e
    public void h(@dl.d g gVar, @dl.d s<?> sVar, T t10) {
        if (PatchProxy.proxy(new Object[]{gVar, sVar, t10}, this, changeQuickRedirect, false, bb.c.d.f31426o, new Class[]{g.class, s.class, Object.class}, Void.TYPE).isSupported) {
            return;
        }
        e.a.a(this, gVar, sVar, t10);
    }

    @Override // com.max.hbcommon.base.adapter.e
    @dl.d
    public abstract g i(@dl.d ViewGroup viewGroup, int i10);

    @Override // com.max.hbcommon.base.adapter.e
    public void l(@dl.d g gVar) {
        if (PatchProxy.proxy(new Object[]{gVar}, this, changeQuickRedirect, false, bb.c.d.f31472q, new Class[]{g.class}, Void.TYPE).isSupported) {
            return;
        }
        e.a.c(this, gVar);
    }

    public final void n(@dl.d s.e holder, int i10, @dl.d List<Object> payloads) {
        if (PatchProxy.proxy(new Object[]{holder, new Integer(i10), payloads}, this, changeQuickRedirect, false, 2035, new Class[]{s.e.class, Integer.TYPE, List.class}, Void.TYPE).isSupported) {
            return;
        }
        f0.p(holder, "holder");
        f0.p(payloads, "payloads");
        super.onBindViewHolder(holder, i10, payloads);
    }

    public void o(@dl.d s.e holder) {
        if (PatchProxy.proxy(new Object[]{holder}, this, changeQuickRedirect, false, bb.c.d.f31311j, new Class[]{s.e.class}, Void.TYPE).isSupported) {
            return;
        }
        f0.p(holder, "holder");
        super.onViewRecycled(holder);
        if (holder instanceof g) {
            g gVar = (g) holder;
            gVar.f();
            gVar.z(false);
            gVar.y(false);
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public void onAttachedToRecyclerView(@dl.d RecyclerView recyclerView) {
        if (PatchProxy.proxy(new Object[]{recyclerView}, this, changeQuickRedirect, false, 2030, new Class[]{RecyclerView.class}, Void.TYPE).isSupported) {
            return;
        }
        f0.p(recyclerView, "recyclerView");
        m().onAttachedToRecyclerView(recyclerView);
    }

    @Override // com.max.hbcommon.base.adapter.s, androidx.recyclerview.widget.RecyclerView.Adapter
    public /* bridge */ /* synthetic */ void onBindViewHolder(RecyclerView.ViewHolder viewHolder, int i10) {
        if (PatchProxy.proxy(new Object[]{viewHolder, new Integer(i10)}, this, changeQuickRedirect, false, 2048, new Class[]{RecyclerView.ViewHolder.class, Integer.TYPE}, Void.TYPE).isSupported) {
            return;
        }
        onBindViewHolder((s.e) viewHolder, i10);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public /* bridge */ /* synthetic */ void onBindViewHolder(RecyclerView.ViewHolder viewHolder, int i10, List list) {
        if (PatchProxy.proxy(new Object[]{viewHolder, new Integer(i10), list}, this, changeQuickRedirect, false, bb.c.d.f31516s, new Class[]{RecyclerView.ViewHolder.class, Integer.TYPE, List.class}, Void.TYPE).isSupported) {
            return;
        }
        n((s.e) viewHolder, i10, list);
    }

    @Override // com.max.hbcommon.base.adapter.s
    public final void onBindViewHolder(@dl.d s.e holder, int i10) {
        if (PatchProxy.proxy(new Object[]{holder, new Integer(i10)}, this, changeQuickRedirect, false, bb.c.d.f31265h, new Class[]{s.e.class, Integer.TYPE}, Void.TYPE).isSupported) {
            return;
        }
        f0.p(holder, "holder");
        super.onBindViewHolder(holder, i10);
    }

    @Override // com.max.hbcommon.base.adapter.s
    public final void onBindViewHolder(@dl.e s.e eVar, T t10) {
        if (!PatchProxy.proxy(new Object[]{eVar, t10}, this, changeQuickRedirect, false, bb.c.d.f31288i, new Class[]{s.e.class, Object.class}, Void.TYPE).isSupported && (eVar instanceof g)) {
            h((g) eVar, this, t10);
        }
    }

    @Override // com.max.hbcommon.base.adapter.s, androidx.recyclerview.widget.RecyclerView.Adapter
    public /* bridge */ /* synthetic */ RecyclerView.ViewHolder onCreateViewHolder(ViewGroup viewGroup, int i10) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{viewGroup, new Integer(i10)}, this, changeQuickRedirect, false, bb.c.d.f31494r, new Class[]{ViewGroup.class, Integer.TYPE}, RecyclerView.ViewHolder.class);
        return patchProxyResultProxy.isSupported ? (RecyclerView.ViewHolder) patchProxyResultProxy.result : onCreateViewHolder(viewGroup, i10);
    }

    @Override // com.max.hbcommon.base.adapter.s, androidx.recyclerview.widget.RecyclerView.Adapter
    @dl.d
    public final s.e onCreateViewHolder(@dl.d ViewGroup parent, int i10) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{parent, new Integer(i10)}, this, changeQuickRedirect, false, 2034, new Class[]{ViewGroup.class, Integer.TYPE}, s.e.class);
        if (patchProxyResultProxy.isSupported) {
            return (s.e) patchProxyResultProxy.result;
        }
        f0.p(parent, "parent");
        return i(parent, 1);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public /* bridge */ /* synthetic */ void onViewRecycled(RecyclerView.ViewHolder viewHolder) {
        if (PatchProxy.proxy(new Object[]{viewHolder}, this, changeQuickRedirect, false, 2049, new Class[]{RecyclerView.ViewHolder.class}, Void.TYPE).isSupported) {
            return;
        }
        o((s.e) viewHolder);
    }

    public final void q(@dl.e List<? extends T> list) {
        if (PatchProxy.proxy(new Object[]{list}, this, changeQuickRedirect, false, 2031, new Class[]{List.class}, Void.TYPE).isSupported) {
            return;
        }
        m().H(list);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public void registerAdapterDataObserver(@dl.d RecyclerView.AdapterDataObserver observer) {
        if (PatchProxy.proxy(new Object[]{observer}, this, changeQuickRedirect, false, bb.c.d.f31334k, new Class[]{RecyclerView.AdapterDataObserver.class}, Void.TYPE).isSupported) {
            return;
        }
        f0.p(observer, "observer");
        super.registerAdapterDataObserver(observer);
        m().E(observer);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public void unregisterAdapterDataObserver(@dl.d RecyclerView.AdapterDataObserver observer) {
        if (PatchProxy.proxy(new Object[]{observer}, this, changeQuickRedirect, false, bb.c.d.f31357l, new Class[]{RecyclerView.AdapterDataObserver.class}, Void.TYPE).isSupported) {
            return;
        }
        f0.p(observer, "observer");
        super.unregisterAdapterDataObserver(observer);
        m().M(observer);
    }
}
