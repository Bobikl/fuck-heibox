package com.max.xiaoheihe.module.search.viewholderbinder;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.max.hbminiprogram.bean.MiniProgramObj;
import com.max.hbminiprogram.component.MiniProgramView;
import com.max.hbuikit.bean.param.UiKitSpanObj;
import com.max.hbutils.utils.ViewUtils;
import com.max.xiaoheihe.R;
import com.max.xiaoheihe.bean.GeneralSearchInfo;
import com.max.xiaoheihe.bean.SearchMiniProgramObj;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import java.util.List;
import kotlin.jvm.internal.f0;

/* JADX INFO: compiled from: SearchMiniProgramV2VHB.kt */
/* JADX INFO: loaded from: classes12.dex */
@androidx.compose.runtime.internal.o(parameters = 0)
public final class q extends a0 {
    public static ChangeQuickRedirect changeQuickRedirect;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public static final int f91828l = 0;

    /* JADX INFO: compiled from: SearchMiniProgramV2VHB.kt */
    public static final class a extends com.max.hbcommon.base.adapter.s<MiniProgramObj> {
        public static ChangeQuickRedirect changeQuickRedirect;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ int f91829b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ boolean f91830c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        final /* synthetic */ int f91831d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        final /* synthetic */ q f91832e;

        /* JADX INFO: renamed from: com.max.xiaoheihe.module.search.viewholderbinder.q$a$a, reason: collision with other inner class name */
        /* JADX INFO: compiled from: SearchMiniProgramV2VHB.kt */
        public static final class ViewOnClickListenerC0862a implements View.OnClickListener {
            public static ChangeQuickRedirect changeQuickRedirect;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            final /* synthetic */ MiniProgramObj f91833b;

            /* JADX INFO: renamed from: c, reason: collision with root package name */
            final /* synthetic */ q f91834c;

            /* JADX INFO: renamed from: d, reason: collision with root package name */
            final /* synthetic */ MiniProgramView f91835d;

            ViewOnClickListenerC0862a(MiniProgramObj miniProgramObj, q qVar, MiniProgramView miniProgramView) {
                this.f91833b = miniProgramObj;
                this.f91834c = qVar;
                this.f91835d = miniProgramView;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                if (PatchProxy.proxy(new Object[]{view}, this, changeQuickRedirect, false, 43367, new Class[]{View.class}, Void.TYPE).isSupported) {
                    return;
                }
                com.max.hbcommon.utils.k.f(this.f91833b.getReport_id(), UiKitSpanObj.TYPE_CLICK, this.f91833b.getCustom_index(), null);
                if (com.max.hbcommon.utils.c.w(this.f91833b.getMore_mini_app())) {
                    com.max.xiaoheihe.base.router.b.k0(this.f91834c.o().q(), this.f91833b.getProto());
                }
                this.f91833b.setHave_new(false);
                this.f91833b.setShow_animator(false);
                this.f91835d.getIv_point().setVisibility(8);
                this.f91835d.t();
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        a(int i10, boolean z10, int i11, q qVar, Context context, List<MiniProgramObj> list) {
            super(context, list, R.layout.item_mini_program_v2);
            this.f91829b = i10;
            this.f91830c = z10;
            this.f91831d = i11;
            this.f91832e = qVar;
        }

        public void m(@dl.e com.max.hbcommon.base.adapter.s.e eVar, @dl.e MiniProgramObj miniProgramObj) {
            if (PatchProxy.proxy(new Object[]{eVar, miniProgramObj}, this, changeQuickRedirect, false, 43365, new Class[]{com.max.hbcommon.base.adapter.s.e.class, MiniProgramObj.class}, Void.TYPE).isSupported || eVar == null) {
                return;
            }
            int i10 = this.f91829b;
            boolean z10 = this.f91830c;
            int i11 = this.f91831d;
            q qVar = this.f91832e;
            if (miniProgramObj != null) {
                miniProgramObj.setCustom_index(String.valueOf(eVar.getAbsoluteAdapterPosition()));
                eVar.itemView.setTag(miniProgramObj);
                View viewI = eVar.i(R.id.v_mini_program);
                f0.o(viewI, "viewHolder.getView(R.id.v_mini_program)");
                MiniProgramView miniProgramView = (MiniProgramView) viewI;
                miniProgramView.setData(miniProgramObj);
                miniProgramView.setOnClickListener(new ViewOnClickListenerC0862a(miniProgramObj, qVar, miniProgramView));
                ViewGroup.LayoutParams layoutParams = miniProgramView.getLayoutParams();
                layoutParams.width = i10;
                if (z10) {
                    layoutParams.height = i11;
                }
                miniProgramView.setLayoutParams(layoutParams);
            }
        }

        @Override // com.max.hbcommon.base.adapter.s
        public /* bridge */ /* synthetic */ void onBindViewHolder(com.max.hbcommon.base.adapter.s.e eVar, MiniProgramObj miniProgramObj) {
            if (PatchProxy.proxy(new Object[]{eVar, miniProgramObj}, this, changeQuickRedirect, false, 43366, new Class[]{com.max.hbcommon.base.adapter.s.e.class, Object.class}, Void.TYPE).isSupported) {
                return;
            }
            m(eVar, miniProgramObj);
        }
    }

    /* JADX INFO: compiled from: SearchMiniProgramV2VHB.kt */
    public static final class b extends RecyclerView.OnScrollListener {
        public static ChangeQuickRedirect changeQuickRedirect;

        b() {
        }

        @Override // androidx.recyclerview.widget.RecyclerView.OnScrollListener
        public void onScrolled(@dl.d RecyclerView recyclerView, int i10, int i11) {
            Object[] objArr = {recyclerView, new Integer(i10), new Integer(i11)};
            ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
            Class cls = Integer.TYPE;
            if (PatchProxy.proxy(objArr, this, changeQuickRedirect2, false, 43368, new Class[]{RecyclerView.class, cls, cls}, Void.TYPE).isSupported) {
                return;
            }
            f0.p(recyclerView, "recyclerView");
            super.onScrolled(recyclerView, i10, i11);
            if (q.this.o().n() instanceof com.max.xiaoheihe.module.search.a) {
                com.max.hbcommon.base.adapter.u<?> uVarN = q.this.o().n();
                f0.n(uVarN, "null cannot be cast to non-null type com.max.xiaoheihe.module.search.MultiTypeAdapter");
                ((com.max.xiaoheihe.module.search.a) uVarN).v(recyclerView);
            }
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public q(@dl.d z param) {
        super(param);
        f0.p(param, "param");
    }

    @Override // com.max.xiaoheihe.module.search.viewholderbinder.a0, cb.c
    public /* bridge */ /* synthetic */ void b(com.max.hbcommon.base.adapter.s.e eVar, GeneralSearchInfo generalSearchInfo) {
        if (PatchProxy.proxy(new Object[]{eVar, generalSearchInfo}, this, changeQuickRedirect, false, 43364, new Class[]{com.max.hbcommon.base.adapter.s.e.class, Object.class}, Void.TYPE).isSupported) {
            return;
        }
        f(eVar, generalSearchInfo);
    }

    @Override // com.max.xiaoheihe.module.search.viewholderbinder.a0
    public void f(@dl.d com.max.hbcommon.base.adapter.s.e viewHolder, @dl.d GeneralSearchInfo data) {
        if (PatchProxy.proxy(new Object[]{viewHolder, data}, this, changeQuickRedirect, false, 43363, new Class[]{com.max.hbcommon.base.adapter.s.e.class, GeneralSearchInfo.class}, Void.TYPE).isSupported) {
            return;
        }
        f0.p(viewHolder, "viewHolder");
        f0.p(data, "data");
        super.f(viewHolder, data);
        viewHolder.setIsRecyclable(false);
        SearchMiniProgramObj searchMiniProgramObj = (SearchMiniProgramObj) com.max.hbutils.utils.k.a(data.getInfo(), SearchMiniProgramObj.class);
        View viewI = viewHolder.i(R.id.rv);
        f0.o(viewI, "viewHolder.getView(R.id.rv)");
        RecyclerView recyclerView = (RecyclerView) viewI;
        if (com.max.hbcommon.utils.c.w(searchMiniProgramObj.getApp_list())) {
            recyclerView.setVisibility(8);
            return;
        }
        recyclerView.setVisibility(0);
        ViewGroup.LayoutParams layoutParams = recyclerView.getLayoutParams();
        f0.n(layoutParams, "null cannot be cast to non-null type android.view.ViewGroup.MarginLayoutParams");
        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) layoutParams;
        marginLayoutParams.leftMargin = 0;
        marginLayoutParams.rightMargin = 0;
        recyclerView.setLayoutManager(new LinearLayoutManager(o().q(), 0, false));
        recyclerView.setBackgroundResource(R.color.background_layer_2_color);
        int iF = ViewUtils.f(m(), 80.0f);
        if (recyclerView.getItemDecorationCount() == 0) {
            recyclerView.addItemDecoration(new com.max.hbcustomview.d(ViewUtils.L(m()) >= ViewUtils.f(m(), 375.0f) ? ViewUtils.f(o().q(), 8.0f) : ViewUtils.f(o().q(), 5.0f), ViewUtils.f(m(), 12.0f)));
        }
        recyclerView.setAdapter(new a(iF, ViewUtils.L(o().q()) >= ViewUtils.f(o().q(), 390.0f), ViewUtils.f(o().q(), 46.0f), this, o().q(), searchMiniProgramObj.getApp_list()));
        recyclerView.addOnScrollListener(new b());
    }
}
