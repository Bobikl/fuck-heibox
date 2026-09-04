package com.max.xiaoheihe.module.mall.adapter;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.a0;
import androidx.lifecycle.y;
import androidx.recyclerview.widget.RecyclerView;
import com.max.hbcommon.bean.AdsBannerObj;
import com.max.hbcustomview.bannerview.BannerViewPager;
import com.max.xiaoheihe.R;
import com.max.xiaoheihe.bean.mall.MallGameInfoObj;
import com.max.xiaoheihe.bean.mall.MallProductObj;
import com.max.xiaoheihe.module.game.adapter.v;
import com.max.xiaoheihe.module.game.z;
import com.max.xiaoheihe.module.mall.MallProductDetailActivity;
import com.max.xiaoheihe.module.mall.component.MallProductViewV2;
import com.max.xiaoheihe.utils.i0;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.PatchProxyResult;
import java.util.List;
import kotlin.collections.CollectionsKt__CollectionsKt;
import kotlin.jvm.internal.f0;
import kotlin.jvm.internal.u;

/* JADX INFO: compiled from: MallProductAdapterV2.kt */
/* JADX INFO: loaded from: classes11.dex */
@androidx.compose.runtime.internal.o(parameters = 0)
public final class g extends com.max.hbcommon.base.adapter.s<MallProductObj> implements y {
    public static ChangeQuickRedirect changeQuickRedirect = null;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    @dl.d
    public static final a f89958g = new a(null);

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public static final int f89959h = 8;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public static final int f89960i = 0;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public static final int f89961j = 1;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @dl.d
    private final Context f89962b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @dl.d
    private final a0 f89963c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @dl.e
    private v<g> f89964d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    @dl.d
    private final j f89965e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    @dl.d
    private final com.max.xiaoheihe.module.mall.adapter.b f89966f;

    /* JADX INFO: compiled from: MallProductAdapterV2.kt */
    public static final class a {
        private a() {
        }

        public /* synthetic */ a(u uVar) {
            this();
        }
    }

    /* JADX INFO: compiled from: MallProductAdapterV2.kt */
    public static final class b implements View.OnClickListener {
        public static ChangeQuickRedirect changeQuickRedirect;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ com.max.hbcommon.base.adapter.s.e f89968c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        final /* synthetic */ MallProductObj f89969d;

        b(com.max.hbcommon.base.adapter.s.e eVar, MallProductObj mallProductObj) {
            this.f89968c = eVar;
            this.f89969d = mallProductObj;
        }

        @Override // android.view.View.OnClickListener
        public final void onClick(View view) {
            if (PatchProxy.proxy(new Object[]{view}, this, changeQuickRedirect, false, 41145, new Class[]{View.class}, Void.TYPE).isSupported) {
                return;
            }
            g.m(g.this, this.f89968c);
            g.this.u();
            h.a(g.this.o(), this.f89969d);
            MallProductObj mallProductObj = this.f89969d;
            if (!com.max.hbcommon.utils.c.u(mallProductObj != null ? mallProductObj.getProtocol() : null)) {
                Context contextO = g.this.o();
                MallProductObj mallProductObj2 = this.f89969d;
                com.max.xiaoheihe.base.router.b.k0(contextO, mallProductObj2 != null ? mallProductObj2.getProtocol() : null);
                return;
            }
            g gVar = g.this;
            MallProductObj mallProductObj3 = this.f89969d;
            MallGameInfoObj game_info = mallProductObj3 != null ? mallProductObj3.getGame_info() : null;
            MallProductObj mallProductObj4 = this.f89969d;
            String h_src = mallProductObj4 != null ? mallProductObj4.getH_src() : null;
            MallProductObj mallProductObj5 = this.f89969d;
            g.n(gVar, game_info, h_src, mallProductObj5 != null ? mallProductObj5.getSku_id() : null);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public g(@dl.d Context context, @dl.e List<? extends MallProductObj> list) {
        super(context, list, R.layout.item_mall_product_v2);
        f0.p(context, "context");
        this.f89962b = context;
        this.f89963c = new a0(this);
        this.f89965e = new j(context);
        this.f89966f = new com.max.xiaoheihe.module.mall.adapter.b();
    }

    public static final /* synthetic */ void m(g gVar, com.max.hbcommon.base.adapter.s.e eVar) {
        if (PatchProxy.proxy(new Object[]{gVar, eVar}, null, changeQuickRedirect, true, 41143, new Class[]{g.class, com.max.hbcommon.base.adapter.s.e.class}, Void.TYPE).isSupported) {
            return;
        }
        gVar.v(eVar);
    }

    public static final /* synthetic */ void n(g gVar, MallGameInfoObj mallGameInfoObj, String str, String str2) {
        if (PatchProxy.proxy(new Object[]{gVar, mallGameInfoObj, str, str2}, null, changeQuickRedirect, true, 41144, new Class[]{g.class, MallGameInfoObj.class, String.class, String.class}, Void.TYPE).isSupported) {
            return;
        }
        gVar.w(mallGameInfoObj, str, str2);
    }

    private final void p(MallProductObj mallProductObj, com.max.hbcommon.base.adapter.s.e eVar) {
        if (PatchProxy.proxy(new Object[]{mallProductObj, eVar}, this, changeQuickRedirect, false, 41136, new Class[]{MallProductObj.class, com.max.hbcommon.base.adapter.s.e.class}, Void.TYPE).isSupported) {
            return;
        }
        eVar.b().setTag(mallProductObj);
        eVar.b().setOnClickListener(new b(eVar, mallProductObj));
    }

    private final void q(MallProductViewV2 mallProductViewV2, MallProductObj mallProductObj) {
        if (PatchProxy.proxy(new Object[]{mallProductViewV2, mallProductObj}, this, changeQuickRedirect, false, 41132, new Class[]{MallProductViewV2.class, MallProductObj.class}, Void.TYPE).isSupported) {
            return;
        }
        j jVar = this.f89965e;
        jVar.f(mallProductViewV2);
        jVar.a(mallProductViewV2, mallProductObj);
        jVar.e(mallProductViewV2);
        jVar.g(mallProductViewV2, mallProductObj);
        jVar.c(mallProductViewV2, mallProductObj);
        jVar.b(mallProductViewV2, mallProductObj);
        jVar.d(mallProductViewV2, mallProductObj);
    }

    private final void r(com.max.hbcommon.base.adapter.s.e eVar, MallProductObj mallProductObj) {
        BannerViewPager<AdsBannerObj> bannerViewPagerA;
        if (PatchProxy.proxy(new Object[]{eVar, mallProductObj}, this, changeQuickRedirect, false, 41128, new Class[]{com.max.hbcommon.base.adapter.s.e.class, MallProductObj.class}, Void.TYPE).isSupported || (bannerViewPagerA = h.c(eVar).a()) == null) {
            return;
        }
        this.f89966f.a(bannerViewPagerA, mallProductObj);
    }

    private final void s(com.max.hbcommon.base.adapter.s.e eVar, MallProductObj mallProductObj) {
        if (PatchProxy.proxy(new Object[]{eVar, mallProductObj}, this, changeQuickRedirect, false, 41129, new Class[]{com.max.hbcommon.base.adapter.s.e.class, MallProductObj.class}, Void.TYPE).isSupported) {
            return;
        }
        MallProductViewV2 mallProductViewV2A = h.d(eVar).a();
        if (mallProductViewV2A != null) {
            q(mallProductViewV2A, mallProductObj);
        }
        p(mallProductObj, eVar);
    }

    private final void v(com.max.hbcommon.base.adapter.s.e eVar) {
        if (PatchProxy.proxy(new Object[]{eVar}, this, changeQuickRedirect, false, 41137, new Class[]{com.max.hbcommon.base.adapter.s.e.class}, Void.TYPE).isSupported) {
            return;
        }
        com.max.heybox.hblog.g.f74531b.q("MallProductAdapter, onItemClick, viewHolder = " + eVar);
    }

    private final void w(MallGameInfoObj mallGameInfoObj, String str, String str2) {
        if (PatchProxy.proxy(new Object[]{mallGameInfoObj, str, str2}, this, changeQuickRedirect, false, 41138, new Class[]{MallGameInfoObj.class, String.class, String.class}, Void.TYPE).isSupported) {
            return;
        }
        if (mallGameInfoObj != null) {
            x(str, mallGameInfoObj, str2);
        } else {
            y(str2, str);
        }
    }

    private final void x(String str, MallGameInfoObj mallGameInfoObj, String str2) {
        if (PatchProxy.proxy(new Object[]{str, mallGameInfoObj, str2}, this, changeQuickRedirect, false, 41139, new Class[]{String.class, MallGameInfoObj.class, String.class}, Void.TYPE).isSupported) {
            return;
        }
        Context context = this.f89962b;
        context.startActivity(z.b(context, str, mallGameInfoObj.getAppid(), mallGameInfoObj.getGame_type(), null, i0.m(), i0.j(), str2));
    }

    private final void y(String str, String str2) {
        if (PatchProxy.proxy(new Object[]{str, str2}, this, changeQuickRedirect, false, 41140, new Class[]{String.class, String.class}, Void.TYPE).isSupported) {
            return;
        }
        Context context = this.f89962b;
        context.startActivity(MallProductDetailActivity.n2(context, str, str2));
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public int getItemViewType(int i10) {
        Object[] objArr = {new Integer(i10)};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        Class cls = Integer.TYPE;
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(objArr, this, changeQuickRedirect2, false, 41130, new Class[]{cls}, cls);
        if (patchProxyResultProxy.isSupported) {
            return ((Integer) patchProxyResultProxy.result).intValue();
        }
        List<MallProductObj> dataList = getDataList();
        if (dataList == null) {
            return super.getItemViewType(i10);
        }
        return (i10 >= 0 || i10 <= CollectionsKt__CollectionsKt.G(dataList)) ? dataList.get(i10).isBanner() ? 1 : 0 : super.getItemViewType(i10);
    }

    @Override // androidx.lifecycle.y
    @dl.d
    public Lifecycle getLifecycle() {
        return this.f89963c;
    }

    @dl.d
    public final Context o() {
        return this.f89962b;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public void onAttachedToRecyclerView(@dl.d RecyclerView recyclerView) {
        if (PatchProxy.proxy(new Object[]{recyclerView}, this, changeQuickRedirect, false, 41134, new Class[]{RecyclerView.class}, Void.TYPE).isSupported) {
            return;
        }
        f0.p(recyclerView, "recyclerView");
        super.onAttachedToRecyclerView(recyclerView);
        this.f89963c.l(Lifecycle.Event.ON_RESUME);
        this.f89964d = new v<>(this, recyclerView, false, null, 12, null);
    }

    @Override // com.max.hbcommon.base.adapter.s
    public /* bridge */ /* synthetic */ void onBindViewHolder(com.max.hbcommon.base.adapter.s.e eVar, MallProductObj mallProductObj) {
        if (PatchProxy.proxy(new Object[]{eVar, mallProductObj}, this, changeQuickRedirect, false, 41141, new Class[]{com.max.hbcommon.base.adapter.s.e.class, Object.class}, Void.TYPE).isSupported) {
            return;
        }
        t(eVar, mallProductObj);
    }

    @Override // com.max.hbcommon.base.adapter.s, androidx.recyclerview.widget.RecyclerView.Adapter
    public /* bridge */ /* synthetic */ RecyclerView.ViewHolder onCreateViewHolder(ViewGroup viewGroup, int i10) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{viewGroup, new Integer(i10)}, this, changeQuickRedirect, false, 41142, new Class[]{ViewGroup.class, Integer.TYPE}, RecyclerView.ViewHolder.class);
        return patchProxyResultProxy.isSupported ? (RecyclerView.ViewHolder) patchProxyResultProxy.result : onCreateViewHolder(viewGroup, i10);
    }

    @Override // com.max.hbcommon.base.adapter.s, androidx.recyclerview.widget.RecyclerView.Adapter
    @dl.d
    public com.max.hbcommon.base.adapter.s.e onCreateViewHolder(@dl.d ViewGroup parent, int i10) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{parent, new Integer(i10)}, this, changeQuickRedirect, false, 41131, new Class[]{ViewGroup.class, Integer.TYPE}, com.max.hbcommon.base.adapter.s.e.class);
        if (patchProxyResultProxy.isSupported) {
            return (com.max.hbcommon.base.adapter.s.e) patchProxyResultProxy.result;
        }
        f0.p(parent, "parent");
        if (i10 != 1) {
            com.max.hbcommon.base.adapter.s.e eVarOnCreateViewHolder = super.onCreateViewHolder(parent, i10);
            f0.o(eVarOnCreateViewHolder, "{\n            super.onCr…rent, viewType)\n        }");
            return eVarOnCreateViewHolder;
        }
        View viewInflate = LayoutInflater.from(this.f89962b).inflate(R.layout.item_banner, parent, false);
        com.max.hbcommon.base.adapter.s.e eVar = new com.max.hbcommon.base.adapter.s.e(R.layout.item_banner, viewInflate);
        setListener(parent, i10, viewInflate, eVar);
        return eVar;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public void onDetachedFromRecyclerView(@dl.d RecyclerView recyclerView) {
        if (PatchProxy.proxy(new Object[]{recyclerView}, this, changeQuickRedirect, false, 41135, new Class[]{RecyclerView.class}, Void.TYPE).isSupported) {
            return;
        }
        f0.p(recyclerView, "recyclerView");
        super.onDetachedFromRecyclerView(recyclerView);
        this.f89963c.l(Lifecycle.Event.ON_DESTROY);
    }

    public void t(@dl.e com.max.hbcommon.base.adapter.s.e eVar, @dl.e MallProductObj mallProductObj) {
        if (PatchProxy.proxy(new Object[]{eVar, mallProductObj}, this, changeQuickRedirect, false, 41127, new Class[]{com.max.hbcommon.base.adapter.s.e.class, MallProductObj.class}, Void.TYPE).isSupported || eVar == null || mallProductObj == null) {
            return;
        }
        if (mallProductObj.isBanner()) {
            r(eVar, mallProductObj);
        } else {
            s(eVar, mallProductObj);
        }
    }

    public final void u() {
        v<g> vVar;
        if (PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 41133, new Class[0], Void.TYPE).isSupported || (vVar = this.f89964d) == null) {
            return;
        }
        vVar.q();
    }
}
