package com.max.xiaoheihe.module.search.viewholderbinder;

import android.content.Context;
import android.graphics.Rect;
import android.view.View;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.max.hbutils.utils.ViewUtils;
import com.max.xiaoheihe.R;
import com.max.xiaoheihe.bean.GeneralSearchInfo;
import com.max.xiaoheihe.bean.SearchGameListObj;
import com.max.xiaoheihe.bean.game.GameObj;
import com.max.xiaoheihe.module.game.adapter.c0;
import com.max.xiaoheihe.module.search.SearchHelper;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import java.util.List;
import kotlin.jvm.internal.f0;
import kotlin.jvm.internal.t0;

/* JADX INFO: compiled from: SearchGameListVHB.kt */
/* JADX INFO: loaded from: classes12.dex */
@t0({"SMAP\nSearchGameListVHB.kt\nKotlin\n*S Kotlin\n*F\n+ 1 SearchGameListVHB.kt\ncom/max/xiaoheihe/module/search/viewholderbinder/SearchGameListVHB\n+ 2 View.kt\nandroidx/core/view/ViewKt\n*L\n1#1,100:1\n162#2,8:101\n*S KotlinDebug\n*F\n+ 1 SearchGameListVHB.kt\ncom/max/xiaoheihe/module/search/viewholderbinder/SearchGameListVHB\n*L\n42#1:101,8\n*E\n"})
@androidx.compose.runtime.internal.o(parameters = 0)
public final class k extends a0 {
    public static ChangeQuickRedirect changeQuickRedirect;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public static final int f91806l = 0;

    /* JADX INFO: compiled from: SearchGameListVHB.kt */
    public static final class a extends RecyclerView.ItemDecoration {
        public static ChangeQuickRedirect changeQuickRedirect;

        a() {
        }

        @Override // androidx.recyclerview.widget.RecyclerView.ItemDecoration
        public void getItemOffsets(@dl.d Rect outRect, @dl.d View view, @dl.d RecyclerView parent, @dl.d RecyclerView.State state) {
            int itemCount;
            int iF;
            if (PatchProxy.proxy(new Object[]{outRect, view, parent, state}, this, changeQuickRedirect, false, 43343, new Class[]{Rect.class, View.class, RecyclerView.class, RecyclerView.State.class}, Void.TYPE).isSupported) {
                return;
            }
            f0.p(outRect, "outRect");
            f0.p(view, "view");
            f0.p(parent, "parent");
            f0.p(state, "state");
            int childAdapterPosition = parent.getChildAdapterPosition(view);
            int iF2 = childAdapterPosition == 0 ? ViewUtils.f(k.this.m(), 12.0f) : ViewUtils.f(k.this.m(), 5.0f);
            if (parent.getAdapter() != null) {
                RecyclerView.Adapter adapter = parent.getAdapter();
                f0.m(adapter);
                itemCount = adapter.getItemCount();
            } else {
                itemCount = 0;
            }
            int i10 = itemCount - 1;
            if (childAdapterPosition != i10 || itemCount <= 4) {
                iF = childAdapterPosition == i10 ? ViewUtils.f(k.this.m(), 12.0f) : ViewUtils.f(k.this.m(), 5.0f);
            } else {
                iF = 0;
            }
            outRect.set(iF2, 0, iF, 0);
        }
    }

    /* JADX INFO: compiled from: SearchGameListVHB.kt */
    public static final class b extends RecyclerView.OnScrollListener {
        public static ChangeQuickRedirect changeQuickRedirect;

        b() {
        }

        @Override // androidx.recyclerview.widget.RecyclerView.OnScrollListener
        public void onScrolled(@dl.d RecyclerView recyclerView, int i10, int i11) {
            Object[] objArr = {recyclerView, new Integer(i10), new Integer(i11)};
            ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
            Class cls = Integer.TYPE;
            if (PatchProxy.proxy(objArr, this, changeQuickRedirect2, false, 43344, new Class[]{RecyclerView.class, cls, cls}, Void.TYPE).isSupported) {
                return;
            }
            f0.p(recyclerView, "recyclerView");
            super.onScrolled(recyclerView, i10, i11);
            if (k.this.o().n() instanceof com.max.xiaoheihe.module.search.a) {
                com.max.hbcommon.base.adapter.u<?> uVarN = k.this.o().n();
                f0.n(uVarN, "null cannot be cast to non-null type com.max.xiaoheihe.module.search.MultiTypeAdapter");
                ((com.max.xiaoheihe.module.search.a) uVarN).v(recyclerView);
            }
        }
    }

    /* JADX INFO: compiled from: SearchGameListVHB.kt */
    public static final class c implements View.OnClickListener {
        public static ChangeQuickRedirect changeQuickRedirect;

        c() {
        }

        @Override // android.view.View.OnClickListener
        public final void onClick(View view) {
            if (PatchProxy.proxy(new Object[]{view}, this, changeQuickRedirect, false, 43345, new Class[]{View.class}, Void.TYPE).isSupported) {
                return;
            }
            String string = k.this.m().getResources().getString(R.string.game);
            f0.o(string, "mContext.resources.getString(R.string.game)");
            com.max.hbsearch.g gVarT = k.this.o().t();
            if (gVarT != null) {
                int size = gVarT.G1().a().size();
                for (int i10 = 0; i10 < size; i10++) {
                    if (f0.g(string, gVarT.G1().a().get(i10))) {
                        gVarT.x2(i10);
                        return;
                    }
                }
            }
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public k(@dl.d z param) {
        super(param);
        f0.p(param, "param");
    }

    @Override // com.max.xiaoheihe.module.search.viewholderbinder.a0, cb.c
    public /* bridge */ /* synthetic */ void b(com.max.hbcommon.base.adapter.s.e eVar, GeneralSearchInfo generalSearchInfo) {
        if (PatchProxy.proxy(new Object[]{eVar, generalSearchInfo}, this, changeQuickRedirect, false, 43342, new Class[]{com.max.hbcommon.base.adapter.s.e.class, Object.class}, Void.TYPE).isSupported) {
            return;
        }
        f(eVar, generalSearchInfo);
    }

    @Override // com.max.xiaoheihe.module.search.viewholderbinder.a0
    public void f(@dl.d com.max.hbcommon.base.adapter.s.e viewHolder, @dl.d GeneralSearchInfo data) {
        if (PatchProxy.proxy(new Object[]{viewHolder, data}, this, changeQuickRedirect, false, 43341, new Class[]{com.max.hbcommon.base.adapter.s.e.class, GeneralSearchInfo.class}, Void.TYPE).isSupported) {
            return;
        }
        f0.p(viewHolder, "viewHolder");
        f0.p(data, "data");
        super.f(viewHolder, data);
        SearchGameListObj searchGameListObj = (SearchGameListObj) com.max.hbutils.utils.k.a(data.getInfo(), SearchGameListObj.class);
        if ((searchGameListObj != null ? searchGameListObj.getGame_list() : null) == null) {
            viewHolder.itemView.setVisibility(8);
            return;
        }
        List<GameObj> game_list = searchGameListObj.getGame_list();
        f0.m(game_list);
        int size = game_list.size();
        for (int i10 = 0; i10 < size; i10++) {
            List<GameObj> game_list2 = searchGameListObj.getGame_list();
            f0.m(game_list2);
            game_list2.get(i10).setCustom_index(String.valueOf(i10));
            List<GameObj> game_list3 = searchGameListObj.getGame_list();
            f0.m(game_list3);
            game_list3.get(i10).setCustom_suggested_from(data.getSuggested_from());
        }
        viewHolder.itemView.setVisibility(0);
        RecyclerView recyclerView = (RecyclerView) viewHolder.i(R.id.rv_game);
        recyclerView.setLayoutManager(new LinearLayoutManager(m(), 0, false));
        int iC = f0.g(SearchHelper.f91584l, data.getType()) ? 0 : com.max.xiaoheihe.accelworld.l.c(14.0f, o().q());
        View view = viewHolder.itemView;
        f0.o(view, "viewHolder.itemView");
        view.setPadding(view.getPaddingLeft(), iC, view.getPaddingRight(), iC);
        if (recyclerView.getItemDecorationCount() == 0) {
            recyclerView.addItemDecoration(new a());
        }
        Context contextM = m();
        Context contextM2 = m();
        List<GameObj> game_list4 = searchGameListObj.getGame_list();
        f0.m(game_list4);
        com.max.hbcommon.base.adapter.w wVar = new com.max.hbcommon.base.adapter.w(contextM, new c0(contextM2, game_list4), new c());
        recyclerView.clearOnScrollListeners();
        recyclerView.addOnScrollListener(new b());
        wVar.J(115);
        List<GameObj> game_list5 = searchGameListObj.getGame_list();
        f0.m(game_list5);
        wVar.G(game_list5.size() > 4);
        recyclerView.setAdapter(wVar);
    }
}
