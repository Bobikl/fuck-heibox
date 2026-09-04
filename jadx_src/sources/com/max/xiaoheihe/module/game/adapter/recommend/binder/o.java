package com.max.xiaoheihe.module.game.adapter.recommend.binder;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import androidx.viewpager2.widget.ViewPager2;
import com.google.gson.JsonObject;
import com.max.hbcommon.bean.KeyDescObj;
import com.max.hbcommon.bean.analytics.PathSrcNode;
import com.max.hbcustomview.bannerview.BannerViewPager;
import com.max.hbutils.utils.ViewUtils;
import com.max.xiaoheihe.R;
import com.max.xiaoheihe.bean.game.RecommendGameListItemObj;
import com.max.xiaoheihe.bean.game.recommend.GameCardListObj;
import com.max.xiaoheihe.bean.game.recommend.GameCardObj;
import com.max.xiaoheihe.bean.game.recommend.GameRecommendBaseObj;
import com.max.xiaoheihe.module.game.component.BigGameCardView;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.PatchProxyResult;
import java.util.ArrayList;
import java.util.List;
import kotlin.collections.CollectionsKt__CollectionsKt;
import kotlin.jvm.internal.Ref;
import kotlin.jvm.internal.f0;
import kotlin.jvm.internal.t0;
import kotlin.jvm.internal.w0;

/* JADX INFO: compiled from: RecommendBigScrollCardV2VHB.kt */
/* JADX INFO: loaded from: classes11.dex */
@t0({"SMAP\nRecommendBigScrollCardV2VHB.kt\nKotlin\n*S Kotlin\n*F\n+ 1 RecommendBigScrollCardV2VHB.kt\ncom/max/xiaoheihe/module/game/adapter/recommend/binder/RecommendBigScrollCardV2VHB\n+ 2 View.kt\nandroidx/core/view/ViewKt\n*L\n1#1,269:1\n262#2,2:270\n262#2,2:272\n*S KotlinDebug\n*F\n+ 1 RecommendBigScrollCardV2VHB.kt\ncom/max/xiaoheihe/module/game/adapter/recommend/binder/RecommendBigScrollCardV2VHB\n*L\n130#1:270,2\n132#1:272,2\n*E\n"})
@androidx.compose.runtime.internal.o(parameters = 0)
public final class o extends p {
    public static ChangeQuickRedirect changeQuickRedirect = null;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public static final int f86205k = 8;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private BannerViewPager<GameCardObj> f86206j;

    /* JADX INFO: compiled from: RecommendBigScrollCardV2VHB.kt */
    public static final class a extends com.max.hbcustomview.bannerview.d<GameCardObj> {
        public static ChangeQuickRedirect changeQuickRedirect;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        final /* synthetic */ GameRecommendBaseObj f86208g;

        a(GameRecommendBaseObj gameRecommendBaseObj) {
            this.f86208g = gameRecommendBaseObj;
        }

        public void A(@dl.e com.max.hbcustomview.bannerview.e<GameCardObj> eVar, @dl.e GameCardObj gameCardObj, int i10, int i11) {
            View view;
            Object[] objArr = {eVar, gameCardObj, new Integer(i10), new Integer(i11)};
            ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
            Class cls = Integer.TYPE;
            if (PatchProxy.proxy(objArr, this, changeQuickRedirect2, false, 36077, new Class[]{com.max.hbcustomview.bannerview.e.class, GameCardObj.class, cls, cls}, Void.TYPE).isSupported || gameCardObj == null) {
                return;
            }
            o oVar = o.this;
            GameRecommendBaseObj gameRecommendBaseObj = this.f86208g;
            BigGameCardView bigGameCardView = (eVar == null || (view = eVar.itemView) == null) ? null : (BigGameCardView) view.findViewById(R.id.big_game_card);
            f0.m(eVar);
            oVar.x(bigGameCardView, gameCardObj, gameRecommendBaseObj, eVar.getBindingAdapterPosition());
        }

        @Override // com.max.hbcustomview.bannerview.d
        public /* bridge */ /* synthetic */ void n(com.max.hbcustomview.bannerview.e<GameCardObj> eVar, GameCardObj gameCardObj, int i10, int i11) {
            Object[] objArr = {eVar, gameCardObj, new Integer(i10), new Integer(i11)};
            ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
            Class cls = Integer.TYPE;
            if (PatchProxy.proxy(objArr, this, changeQuickRedirect2, false, 36078, new Class[]{com.max.hbcustomview.bannerview.e.class, Object.class, cls, cls}, Void.TYPE).isSupported) {
                return;
            }
            A(eVar, gameCardObj, i10, i11);
        }

        @Override // com.max.hbcustomview.bannerview.d
        public int q(int i10) {
            return R.layout.item_big_game_card;
        }
    }

    /* JADX INFO: compiled from: RecommendBigScrollCardV2VHB.kt */
    @t0({"SMAP\nRecommendBigScrollCardV2VHB.kt\nKotlin\n*S Kotlin\n*F\n+ 1 RecommendBigScrollCardV2VHB.kt\ncom/max/xiaoheihe/module/game/adapter/recommend/binder/RecommendBigScrollCardV2VHB$contentBinding$2\n+ 2 View.kt\nandroidx/core/view/ViewKt\n*L\n1#1,269:1\n260#2:270\n*S KotlinDebug\n*F\n+ 1 RecommendBigScrollCardV2VHB.kt\ncom/max/xiaoheihe/module/game/adapter/recommend/binder/RecommendBigScrollCardV2VHB$contentBinding$2\n*L\n108#1:270\n*E\n"})
    public static final class b extends ViewPager2.OnPageChangeCallback {
        public static ChangeQuickRedirect changeQuickRedirect;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ GameRecommendBaseObj f86210b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ RecyclerView f86211c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        final /* synthetic */ Ref.IntRef f86212d;

        b(GameRecommendBaseObj gameRecommendBaseObj, RecyclerView recyclerView, Ref.IntRef intRef) {
            this.f86210b = gameRecommendBaseObj;
            this.f86211c = recyclerView;
            this.f86212d = intRef;
        }

        @Override // androidx.viewpager2.widget.ViewPager2.OnPageChangeCallback
        public void onPageScrolled(int i10, float f10, int i11) {
            Object[] objArr = {new Integer(i10), new Float(f10), new Integer(i11)};
            ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
            Class cls = Integer.TYPE;
            if (PatchProxy.proxy(objArr, this, changeQuickRedirect2, false, 36079, new Class[]{cls, Float.TYPE, cls}, Void.TYPE).isSupported) {
                return;
            }
            super.onPageScrolled(i10, f10, i11);
            BannerViewPager bannerViewPager = o.this.f86206j;
            BannerViewPager bannerViewPager2 = null;
            if (bannerViewPager == null) {
                f0.S("banner");
                bannerViewPager = null;
            }
            Object tag = bannerViewPager.getTag(o.this.m());
            if (tag != null) {
                o oVar = o.this;
                GameRecommendBaseObj gameRecommendBaseObj = this.f86210b;
                BannerViewPager bannerViewPager3 = oVar.f86206j;
                if (bannerViewPager3 == null) {
                    f0.S("banner");
                } else {
                    bannerViewPager2 = bannerViewPager3;
                }
                Object tag2 = bannerViewPager2.getTag(oVar.l());
                f0.n(tag2, "null cannot be cast to non-null type com.max.xiaoheihe.bean.game.recommend.GameCardListObj");
                oVar.C(w0.g(tag), o.B(oVar, (GameCardListObj) gameRecommendBaseObj, i10), (GameCardListObj) tag2);
            }
        }

        @Override // androidx.viewpager2.widget.ViewPager2.OnPageChangeCallback
        public void onPageSelected(int i10) {
            ArrayList<KeyDescObj> tab;
            int i11;
            if (PatchProxy.proxy(new Object[]{new Integer(i10)}, this, changeQuickRedirect, false, 36080, new Class[]{Integer.TYPE}, Void.TYPE).isSupported) {
                return;
            }
            super.onPageSelected(i10);
            if (!(this.f86211c.getVisibility() == 0) || (tab = ((GameCardListObj) this.f86210b).getTab()) == null) {
                return;
            }
            Ref.IntRef intRef = this.f86212d;
            RecyclerView recyclerView = this.f86211c;
            int size = tab.size();
            for (int i12 = 0; i12 < size; i12++) {
                if (i10 >= tab.get(i12).getIndex() && ((i12 == CollectionsKt__CollectionsKt.G(tab) || i10 < tab.get(i12 + 1).getIndex()) && i12 != (i11 = intRef.f124889b))) {
                    intRef.f124889b = i12;
                    RecyclerView.Adapter adapter = recyclerView.getAdapter();
                    if (adapter != null) {
                        adapter.notifyItemChanged(i11);
                    }
                    RecyclerView.Adapter adapter2 = recyclerView.getAdapter();
                    if (adapter2 != null) {
                        adapter2.notifyItemChanged(intRef.f124889b);
                    }
                    recyclerView.smoothScrollToPosition(intRef.f124889b);
                }
            }
        }
    }

    /* JADX INFO: compiled from: RecommendBigScrollCardV2VHB.kt */
    public static final class c extends com.max.hbcommon.base.adapter.s<KeyDescObj> {
        public static ChangeQuickRedirect changeQuickRedirect;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ Ref.IntRef f86213b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ RecyclerView f86214c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        final /* synthetic */ o f86215d;

        /* JADX INFO: compiled from: RecommendBigScrollCardV2VHB.kt */
        public static final class a implements View.OnClickListener {
            public static ChangeQuickRedirect changeQuickRedirect;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            final /* synthetic */ com.max.hbcommon.base.adapter.s.e f86216b;

            /* JADX INFO: renamed from: c, reason: collision with root package name */
            final /* synthetic */ Ref.IntRef f86217c;

            /* JADX INFO: renamed from: d, reason: collision with root package name */
            final /* synthetic */ c f86218d;

            /* JADX INFO: renamed from: e, reason: collision with root package name */
            final /* synthetic */ o f86219e;

            /* JADX INFO: renamed from: f, reason: collision with root package name */
            final /* synthetic */ KeyDescObj f86220f;

            a(com.max.hbcommon.base.adapter.s.e eVar, Ref.IntRef intRef, c cVar, o oVar, KeyDescObj keyDescObj) {
                this.f86216b = eVar;
                this.f86217c = intRef;
                this.f86218d = cVar;
                this.f86219e = oVar;
                this.f86220f = keyDescObj;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                if (PatchProxy.proxy(new Object[]{view}, this, changeQuickRedirect, false, 36083, new Class[]{View.class}, Void.TYPE).isSupported) {
                    return;
                }
                int absoluteAdapterPosition = this.f86216b.getAbsoluteAdapterPosition();
                Ref.IntRef intRef = this.f86217c;
                int i10 = intRef.f124889b;
                if (absoluteAdapterPosition != i10) {
                    intRef.f124889b = this.f86216b.getAbsoluteAdapterPosition();
                    this.f86218d.notifyItemChanged(i10);
                    this.f86218d.notifyItemChanged(this.f86217c.f124889b);
                }
                BannerViewPager bannerViewPager = this.f86219e.f86206j;
                if (bannerViewPager == null) {
                    f0.S("banner");
                    bannerViewPager = null;
                }
                bannerViewPager.setCurrentItem(this.f86220f.getIndex());
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        c(Ref.IntRef intRef, RecyclerView recyclerView, o oVar, Context context, ArrayList<KeyDescObj> arrayList) {
            super(context, arrayList, R.layout.item_game_award_tab);
            this.f86213b = intRef;
            this.f86214c = recyclerView;
            this.f86215d = oVar;
        }

        public void m(@dl.e com.max.hbcommon.base.adapter.s.e eVar, @dl.e KeyDescObj keyDescObj) {
            TextView textView;
            if (PatchProxy.proxy(new Object[]{eVar, keyDescObj}, this, changeQuickRedirect, false, 36081, new Class[]{com.max.hbcommon.base.adapter.s.e.class, KeyDescObj.class}, Void.TYPE).isSupported || eVar == null) {
                return;
            }
            Ref.IntRef intRef = this.f86213b;
            RecyclerView recyclerView = this.f86214c;
            o oVar = this.f86215d;
            if (keyDescObj == null || (textView = (TextView) eVar.i(R.id.tv_tab)) == null) {
                return;
            }
            f0.o(textView, "getView<TextView>(R.id.tv_tab)");
            textView.setText(keyDescObj.getName());
            if (eVar.getAbsoluteAdapterPosition() == intRef.f124889b) {
                com.max.xiaoheihe.accelworld.l.q(textView, R.color.background_layer_3_color, 3.0f);
                textView.setTypeface(com.max.hbresource.a.f71893a.a(com.max.hbresource.a.f71895c));
                textView.setTextColor(com.max.xiaoheihe.accelworld.l.h(recyclerView.getContext(), R.color.text_primary_1_color));
            } else {
                com.max.xiaoheihe.accelworld.l.q(textView, R.color.background_card_1_color, 3.0f);
                textView.setTypeface(com.max.hbresource.a.f71893a.a(com.max.hbresource.a.f71894b));
                textView.setTextColor(com.max.xiaoheihe.accelworld.l.h(recyclerView.getContext(), R.color.text_secondary_1_color));
            }
            textView.setOnClickListener(new a(eVar, intRef, this, oVar, keyDescObj));
        }

        @Override // com.max.hbcommon.base.adapter.s
        public /* bridge */ /* synthetic */ void onBindViewHolder(com.max.hbcommon.base.adapter.s.e eVar, KeyDescObj keyDescObj) {
            if (PatchProxy.proxy(new Object[]{eVar, keyDescObj}, this, changeQuickRedirect, false, 36082, new Class[]{com.max.hbcommon.base.adapter.s.e.class, Object.class}, Void.TYPE).isSupported) {
                return;
            }
            m(eVar, keyDescObj);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public o(@dl.d RecommendVHBParam param) {
        super(param);
        f0.p(param, "param");
    }

    public static final /* synthetic */ ArrayList B(o oVar, GameCardListObj gameCardListObj, int i10) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{oVar, gameCardListObj, new Integer(i10)}, null, changeQuickRedirect, true, 36076, new Class[]{o.class, GameCardListObj.class, Integer.TYPE}, ArrayList.class);
        return patchProxyResultProxy.isSupported ? (ArrayList) patchProxyResultProxy.result : oVar.E(gameCardListObj, i10);
    }

    private final GameCardObj D(ArrayList<GameCardObj> arrayList, int i10) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{arrayList, new Integer(i10)}, this, changeQuickRedirect, false, 36074, new Class[]{ArrayList.class, Integer.TYPE}, GameCardObj.class);
        if (patchProxyResultProxy.isSupported) {
            return (GameCardObj) patchProxyResultProxy.result;
        }
        if (com.max.hbcommon.utils.c.w(arrayList)) {
            return null;
        }
        f0.m(arrayList);
        int size = arrayList.size();
        for (int i11 = 0; i11 < size; i11++) {
            arrayList.get(i11).setIndex(i11);
        }
        if (i10 == -1) {
            return arrayList.get(arrayList.size() - 1);
        }
        if (i10 == arrayList.size()) {
            return arrayList.get(0);
        }
        if (i10 < 0 || i10 >= arrayList.size()) {
            return null;
        }
        return arrayList.get(i10);
    }

    private final ArrayList<GameCardObj> E(GameCardListObj gameCardListObj, int i10) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{gameCardListObj, new Integer(i10)}, this, changeQuickRedirect, false, 36073, new Class[]{GameCardListObj.class, Integer.TYPE}, ArrayList.class);
        if (patchProxyResultProxy.isSupported) {
            return (ArrayList) patchProxyResultProxy.result;
        }
        ArrayList<GameCardObj> arrayList = new ArrayList<>();
        GameCardObj gameCardObjD = D(gameCardListObj.getGames(), i10 - 1);
        if (gameCardObjD != null) {
            arrayList.add(gameCardObjD);
        }
        GameCardObj gameCardObjD2 = D(gameCardListObj.getGames(), i10);
        if (gameCardObjD2 != null) {
            arrayList.add(gameCardObjD2);
        }
        GameCardObj gameCardObjD3 = D(gameCardListObj.getGames(), i10 + 1);
        if (gameCardObjD3 != null) {
            arrayList.add(gameCardObjD3);
        }
        return arrayList;
    }

    public final void C(@dl.d List<PathSrcNode> shownList, @dl.e ArrayList<GameCardObj> arrayList, @dl.d GameRecommendBaseObj data) {
        if (PatchProxy.proxy(new Object[]{shownList, arrayList, data}, this, changeQuickRedirect, false, 36075, new Class[]{List.class, ArrayList.class, GameRecommendBaseObj.class}, Void.TYPE).isSupported) {
            return;
        }
        f0.p(shownList, "shownList");
        f0.p(data, "data");
        if (com.max.hbcommon.utils.c.w(arrayList)) {
            return;
        }
        f0.m(arrayList);
        for (GameCardObj gameCardObj : arrayList) {
            f0.o(gameCardObj, "games!!");
            GameCardObj gameCardObj2 = gameCardObj;
            if (!gameCardObj2.isReported_exposure()) {
                RecommendGameListItemObj game = gameCardObj2.getGame();
                String h_src = null;
                if ((game != null ? game.getAppid() : null) != null) {
                    PathSrcNode node = data.copyToPathNode();
                    JsonObject addition = node.getAddition();
                    RecommendGameListItemObj game2 = gameCardObj2.getGame();
                    addition.addProperty("app_id", game2 != null ? game2.getAppid() : null);
                    JsonObject addition2 = node.getAddition();
                    String h_src2 = gameCardObj2.getH_src();
                    if (h_src2 == null) {
                        RecommendGameListItemObj game3 = gameCardObj2.getGame();
                        if (game3 != null) {
                            h_src = game3.getH_src();
                        }
                    } else {
                        h_src = h_src2;
                    }
                    addition2.addProperty("h_src", h_src);
                    node.getAddition().addProperty("idx", Integer.valueOf(gameCardObj2.getIndex()));
                    gameCardObj2.setReported_exposure(true);
                    f0.o(node, "node");
                    r(shownList, node);
                }
            }
        }
    }

    @Override // com.max.xiaoheihe.module.game.adapter.recommend.binder.p, com.max.xiaoheihe.module.game.adapter.recommend.binder.r
    public void g(@dl.d com.max.hbcommon.base.adapter.s.e viewHolder, @dl.d GameRecommendBaseObj data) {
        if (PatchProxy.proxy(new Object[]{viewHolder, data}, this, changeQuickRedirect, false, 36070, new Class[]{com.max.hbcommon.base.adapter.s.e.class, GameRecommendBaseObj.class}, Void.TYPE).isSupported) {
            return;
        }
        f0.p(viewHolder, "viewHolder");
        f0.p(data, "data");
        if (data instanceof GameCardListObj) {
            View viewI = viewHolder.i(R.id.banner);
            f0.o(viewI, "viewHolder.getView(R.id.banner)");
            this.f86206j = (BannerViewPager) viewI;
            View viewI2 = viewHolder.i(R.id.rv_tab);
            f0.o(viewI2, "viewHolder.getView(R.id.rv_tab)");
            RecyclerView recyclerView = (RecyclerView) viewI2;
            Ref.IntRef intRef = new Ref.IntRef();
            BannerViewPager<GameCardObj> bannerViewPager = this.f86206j;
            BannerViewPager<GameCardObj> bannerViewPager2 = null;
            if (bannerViewPager == null) {
                f0.S("banner");
                bannerViewPager = null;
            }
            if (!f0.g(data, bannerViewPager.getTag(R.id.banner))) {
                BannerViewPager<GameCardObj> bannerViewPager3 = this.f86206j;
                if (bannerViewPager3 == null) {
                    f0.S("banner");
                    bannerViewPager3 = null;
                }
                bannerViewPager3.setTag(R.id.banner, data);
                BannerViewPager<GameCardObj> bannerViewPager4 = this.f86206j;
                if (bannerViewPager4 == null) {
                    f0.S("banner");
                    bannerViewPager4 = null;
                }
                bannerViewPager4.R(new a(data));
                if (w() == 0) {
                    z(ViewUtils.L(v().b()) - ViewUtils.f(v().b(), 40.0f));
                }
                BannerViewPager<GameCardObj> bannerViewPager5 = this.f86206j;
                if (bannerViewPager5 == null) {
                    f0.S("banner");
                    bannerViewPager5 = null;
                }
                ViewGroup.LayoutParams layoutParams = bannerViewPager5.getLayoutParams();
                if (layoutParams == null) {
                    layoutParams = new ViewGroup.LayoutParams(w(), w());
                } else {
                    layoutParams.height = w();
                }
                BannerViewPager<GameCardObj> bannerViewPager6 = this.f86206j;
                if (bannerViewPager6 == null) {
                    f0.S("banner");
                    bannerViewPager6 = null;
                }
                bannerViewPager6.setLayoutParams(layoutParams);
                BannerViewPager<GameCardObj> bannerViewPager7 = this.f86206j;
                if (bannerViewPager7 == null) {
                    f0.S("banner");
                    bannerViewPager7 = null;
                }
                bannerViewPager7.setViewPagerPageMargin(ViewUtils.f(v().b(), 20.0f));
                BannerViewPager<GameCardObj> bannerViewPager8 = this.f86206j;
                if (bannerViewPager8 == null) {
                    f0.S("banner");
                    bannerViewPager8 = null;
                }
                bannerViewPager8.n0(ViewUtils.f(v().b(), 8.0f));
                BannerViewPager<GameCardObj> bannerViewPager9 = this.f86206j;
                if (bannerViewPager9 == null) {
                    f0.S("banner");
                    bannerViewPager9 = null;
                }
                bannerViewPager9.h0(((int) com.max.hbutils.utils.n.p(((GameCardListObj) data).getAuto_scroll())) * 1000);
                BannerViewPager<GameCardObj> bannerViewPager10 = this.f86206j;
                if (bannerViewPager10 == null) {
                    f0.S("banner");
                    bannerViewPager10 = null;
                }
                bannerViewPager10.setTag(l(), data);
                BannerViewPager<GameCardObj> bannerViewPager11 = this.f86206j;
                if (bannerViewPager11 == null) {
                    f0.S("banner");
                    bannerViewPager11 = null;
                }
                bannerViewPager11.L(new b(data, recyclerView, intRef));
                BannerViewPager<GameCardObj> bannerViewPager12 = this.f86206j;
                if (bannerViewPager12 == null) {
                    f0.S("banner");
                } else {
                    bannerViewPager2 = bannerViewPager12;
                }
                bannerViewPager2.k();
            }
            GameCardListObj gameCardListObj = (GameCardListObj) data;
            ArrayList<KeyDescObj> tab = gameCardListObj.getTab();
            if ((tab != null ? tab.size() : 0) <= 1) {
                recyclerView.setVisibility(8);
                return;
            }
            recyclerView.setVisibility(0);
            if (recyclerView.getItemDecorationCount() == 0) {
                Context context = recyclerView.getContext();
                f0.o(context, "context");
                int iC = com.max.xiaoheihe.accelworld.l.c(8.0f, context);
                Context context2 = recyclerView.getContext();
                f0.o(context2, "context");
                recyclerView.addItemDecoration(new com.max.hbcustomview.d(iC, com.max.xiaoheihe.accelworld.l.c(12.0f, context2)));
            }
            recyclerView.setLayoutManager(new LinearLayoutManager(recyclerView.getContext(), 0, false));
            recyclerView.setAdapter(new c(intRef, recyclerView, this, recyclerView.getContext(), gameCardListObj.getTab()));
            RecyclerView.Adapter adapter = recyclerView.getAdapter();
            if (adapter != null) {
                adapter.notifyDataSetChanged();
            }
        }
    }

    @Override // com.max.xiaoheihe.module.game.adapter.recommend.binder.r
    public void h(@dl.d com.max.hbcommon.base.adapter.s.e viewHolder, @dl.d GameRecommendBaseObj data) {
        if (PatchProxy.proxy(new Object[]{viewHolder, data}, this, changeQuickRedirect, false, 36071, new Class[]{com.max.hbcommon.base.adapter.s.e.class, GameRecommendBaseObj.class}, Void.TYPE).isSupported) {
            return;
        }
        f0.p(viewHolder, "viewHolder");
        f0.p(data, "data");
        super.h(viewHolder, data);
        com.max.heybox.hblog.g.a aVar = com.max.heybox.hblog.g.f74531b;
        StringBuilder sb2 = new StringBuilder();
        sb2.append("RecommendBigScrollCardV2VHB, contentBindingOnMainThread, banner.isAttachedToWindow = ");
        BannerViewPager<GameCardObj> bannerViewPager = this.f86206j;
        BannerViewPager<GameCardObj> bannerViewPager2 = null;
        if (bannerViewPager == null) {
            f0.S("banner");
            bannerViewPager = null;
        }
        sb2.append(bannerViewPager.isAttachedToWindow());
        sb2.append(' ');
        sb2.append(data);
        aVar.v(sb2.toString());
        if (data instanceof GameCardListObj) {
            if (v().b() instanceof AppCompatActivity) {
                BannerViewPager<GameCardObj> bannerViewPager3 = this.f86206j;
                if (bannerViewPager3 == null) {
                    f0.S("banner");
                    bannerViewPager3 = null;
                }
                Context contextB = v().b();
                f0.n(contextB, "null cannot be cast to non-null type androidx.appcompat.app.AppCompatActivity");
                bannerViewPager3.j0(((AppCompatActivity) contextB).getLifecycle());
            }
            BannerViewPager<GameCardObj> bannerViewPager4 = this.f86206j;
            if (bannerViewPager4 == null) {
                f0.S("banner");
            } else {
                bannerViewPager2 = bannerViewPager4;
            }
            bannerViewPager2.J(((GameCardListObj) data).getGames());
        }
    }

    @Override // com.max.xiaoheihe.module.game.adapter.recommend.binder.p, com.max.xiaoheihe.module.game.adapter.recommend.binder.r
    public void p(@dl.d View itemView, @dl.d List<PathSrcNode> shownList, @dl.d GameRecommendBaseObj data) {
        if (PatchProxy.proxy(new Object[]{itemView, shownList, data}, this, changeQuickRedirect, false, 36072, new Class[]{View.class, List.class, GameRecommendBaseObj.class}, Void.TYPE).isSupported) {
            return;
        }
        f0.p(itemView, "itemView");
        f0.p(shownList, "shownList");
        f0.p(data, "data");
        if (com.max.hbcommon.utils.c.u(data.getReport_path()) || !(data instanceof GameCardListObj)) {
            return;
        }
        GameCardListObj gameCardListObj = (GameCardListObj) data;
        if (gameCardListObj.isReported_exposure()) {
            return;
        }
        gameCardListObj.setReported_exposure(true);
        BannerViewPager bannerViewPager = (BannerViewPager) itemView.findViewById(R.id.banner);
        bannerViewPager.setTag(m(), shownList);
        C(shownList, E(gameCardListObj, bannerViewPager.getCurrentItem()), data);
    }
}
