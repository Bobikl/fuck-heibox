package com.max.xiaoheihe.module.game.adapter.recommend.binder;

import android.content.Context;
import android.content.Intent;
import android.graphics.Outline;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewOutlineProvider;
import android.widget.ImageView;
import android.widget.RadioGroup;
import android.widget.RelativeLayout;
import android.widget.TextView;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.LinearSnapHelper;
import androidx.recyclerview.widget.RecyclerView;
import com.max.hbutils.utils.ViewUtils;
import com.max.hbwallet.MallCouponListActivity;
import com.max.xiaoheihe.R;
import com.max.xiaoheihe.bean.MenuObj;
import com.max.xiaoheihe.bean.game.GameListHeaderObj;
import com.max.xiaoheihe.bean.game.GameObj;
import com.max.xiaoheihe.bean.game.recommend.GameRecommendBaseObj;
import com.max.xiaoheihe.bean.game.recommend.RecommendMenuObj;
import com.max.xiaoheihe.module.game.GameCenterActivity;
import com.max.xiaoheihe.module.game.GameCompilationActivity;
import com.max.xiaoheihe.module.game.GameDeveloperListActivity;
import com.max.xiaoheihe.module.game.GameStoreActivity;
import com.max.xiaoheihe.module.game.GamesOfUnreleasedActivity;
import com.max.xiaoheihe.module.trade.ItemTradeCenterActivity;
import com.max.xiaoheihe.module.webview.WebActionActivity;
import com.max.xiaoheihe.utils.i0;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.f0;

/* JADX INFO: compiled from: MenuVHB.kt */
/* JADX INFO: loaded from: classes11.dex */
@androidx.compose.runtime.internal.o(parameters = 0)
public class i extends r {
    public static ChangeQuickRedirect changeQuickRedirect;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    @dl.d
    public static final a f86151h = new a(null);

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public static final int f86152i = 8;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    @dl.d
    private RecommendVHBParam f86153g;

    /* JADX INFO: compiled from: MenuVHB.kt */
    public static final class a {
        public static ChangeQuickRedirect changeQuickRedirect;

        private a() {
        }

        public /* synthetic */ a(kotlin.jvm.internal.u uVar) {
            this();
        }

        @xh.m
        public final void a(@dl.d Context context, @dl.d MenuObj obj) {
            if (PatchProxy.proxy(new Object[]{context, obj}, this, changeQuickRedirect, false, 36003, new Class[]{Context.class, MenuObj.class}, Void.TYPE).isSupported) {
                return;
            }
            f0.p(context, "context");
            f0.p(obj, "obj");
            if (kotlin.text.u.L1("shop", obj.getKey(), true)) {
                context.startActivity(GameStoreActivity.R1(context));
                return;
            }
            if (i0.e(context)) {
                if (kotlin.text.u.L1("release", obj.getKey(), true)) {
                    context.startActivity(GamesOfUnreleasedActivity.M1(context));
                    return;
                }
                if (kotlin.text.u.L1(GameObj.TAG_TYPE_COUPON, obj.getKey(), true)) {
                    context.startActivity(MallCouponListActivity.V1(context, MallCouponListActivity.V, "all", null, null));
                    return;
                }
                if (kotlin.text.u.L1("order", obj.getKey(), true)) {
                    com.max.xiaoheihe.base.router.b.i0(context, lb.d.W1);
                    return;
                }
                if (kotlin.text.u.L1("shop", obj.getKey(), true)) {
                    context.startActivity(GameStoreActivity.R1(context));
                    return;
                }
                if (kotlin.text.u.L1(GameListHeaderObj.KEY_COMPILATION, obj.getKey(), true)) {
                    GameListHeaderObj gameListHeaderObj = new GameListHeaderObj();
                    gameListHeaderObj.setTitle(context.getResources().getString(R.string.game_compilation));
                    context.startActivity(GameCompilationActivity.b2(context, gameListHeaderObj));
                    return;
                }
                if (kotlin.text.u.L1("developer", obj.getKey(), true)) {
                    context.startActivity(GameDeveloperListActivity.M1(context));
                    return;
                }
                if (kotlin.text.u.L1("add_to_cart", obj.getKey(), true)) {
                    com.max.xiaoheihe.base.router.b.i0(context, lb.d.B2);
                    return;
                }
                if (kotlin.text.u.L1("whishlist", obj.getKey(), true)) {
                    com.max.xiaoheihe.base.router.b.i0(context, lb.d.f131186j2);
                    return;
                }
                if (kotlin.text.u.L1(GameCenterActivity.S, obj.getKey(), true)) {
                    context.startActivity(GameCenterActivity.N1(context, GameCenterActivity.Z));
                    return;
                }
                if (kotlin.text.u.L1("h5game", obj.getKey(), true)) {
                    com.max.xiaoheihe.module.littleprogram.b.a.j(com.max.xiaoheihe.module.littleprogram.b.f88740a, context, null, 2, null);
                    return;
                }
                if (kotlin.text.u.L1("trade", obj.getKey(), true)) {
                    context.startActivity(ItemTradeCenterActivity.U.a(context));
                    return;
                }
                if (!kotlin.text.u.L1("1", obj.getEnable(), true) || !kotlin.text.u.L1("h5", obj.getType(), true) || obj.getContent_url() == null) {
                    com.max.hbutils.utils.c.f(context.getResources().getString(R.string.plz_wait));
                    return;
                }
                String content_url = obj.getContent_url();
                f0.o(content_url, "obj.content_url");
                if (!kotlin.text.u.v2(content_url, "http", false, 2, null)) {
                    com.max.xiaoheihe.base.router.b.k0(context, obj.getContent_url());
                    return;
                }
                Intent intent = new Intent(context, (Class<?>) WebActionActivity.class);
                intent.putExtra("pageurl", obj.getContent_url());
                intent.putExtra("title", obj.getDesc());
                intent.putExtra("isPullRefresh", "true");
                context.startActivity(intent);
            }
        }
    }

    /* JADX INFO: compiled from: MenuVHB.kt */
    public static final class b extends com.max.hbcommon.base.adapter.s<MenuObj> {
        public static ChangeQuickRedirect changeQuickRedirect;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ i f86154b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ int f86155c;

        /* JADX INFO: compiled from: MenuVHB.kt */
        public static final class a extends ViewOutlineProvider {
            public static ChangeQuickRedirect changeQuickRedirect;

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            final /* synthetic */ i f86156a;

            a(i iVar) {
                this.f86156a = iVar;
            }

            @Override // android.view.ViewOutlineProvider
            public void getOutline(@dl.d View view, @dl.d Outline outline) {
                if (PatchProxy.proxy(new Object[]{view, outline}, this, changeQuickRedirect, false, 36006, new Class[]{View.class, Outline.class}, Void.TYPE).isSupported) {
                    return;
                }
                f0.p(view, "view");
                f0.p(outline, "outline");
                outline.setRoundRect(0, 0, view.getWidth(), view.getHeight(), ViewUtils.f(this.f86156a.x().b(), 1.0f));
            }
        }

        /* JADX INFO: renamed from: com.max.xiaoheihe.module.game.adapter.recommend.binder.i$b$b, reason: collision with other inner class name */
        /* JADX INFO: compiled from: MenuVHB.kt */
        public static final class ViewOnClickListenerC0781b implements View.OnClickListener {
            public static ChangeQuickRedirect changeQuickRedirect;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            final /* synthetic */ View f86157b;

            /* JADX INFO: renamed from: c, reason: collision with root package name */
            final /* synthetic */ TextView f86158c;

            /* JADX INFO: renamed from: d, reason: collision with root package name */
            final /* synthetic */ MenuObj f86159d;

            /* JADX INFO: renamed from: e, reason: collision with root package name */
            final /* synthetic */ i f86160e;

            ViewOnClickListenerC0781b(View view, TextView textView, MenuObj menuObj, i iVar) {
                this.f86157b = view;
                this.f86158c = textView;
                this.f86159d = menuObj;
                this.f86160e = iVar;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                if (PatchProxy.proxy(new Object[]{view}, this, changeQuickRedirect, false, 36007, new Class[]{View.class}, Void.TYPE).isSupported) {
                    return;
                }
                this.f86157b.setVisibility(8);
                this.f86158c.setVisibility(8);
                if (this.f86159d.getGameCenterBubbleObj() == null) {
                    com.max.hbcache.c.C("game_rec_menu" + this.f86159d.getKey(), this.f86159d.getTips_time());
                } else {
                    com.max.hbcache.c.C("game_rec_menu" + this.f86159d.getKey(), this.f86159d.getGameCenterBubbleObj().getTips_time());
                }
                i.f86151h.a(this.f86160e.x().b(), this.f86159d);
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        b(List<MenuObj> list, i iVar, int i10, Context context) {
            super(context, list, R.layout.item_menu_store);
            this.f86154b = iVar;
            this.f86155c = i10;
        }

        public void m(@dl.d com.max.hbcommon.base.adapter.s.e viewHolder, @dl.d MenuObj obj) {
            if (PatchProxy.proxy(new Object[]{viewHolder, obj}, this, changeQuickRedirect, false, 36004, new Class[]{com.max.hbcommon.base.adapter.s.e.class, MenuObj.class}, Void.TYPE).isSupported) {
                return;
            }
            f0.p(viewHolder, "viewHolder");
            f0.p(obj, "obj");
            View view = viewHolder.itemView;
            f0.o(view, "viewHolder.itemView");
            ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
            f0.n(layoutParams, "null cannot be cast to non-null type android.view.ViewGroup.LayoutParams");
            layoutParams.width = (int) ((ViewUtils.L(this.f86154b.x().b()) / this.f86155c) + 0.5f);
            layoutParams.height = ViewUtils.f(this.f86154b.x().b(), 66.0f);
            view.setLayoutParams(layoutParams);
            View viewFindViewById = view.findViewById(R.id.vg_menu);
            View viewFindViewById2 = view.findViewById(R.id.iv_img);
            f0.n(viewFindViewById2, "null cannot be cast to non-null type android.widget.ImageView");
            ImageView imageView = (ImageView) viewFindViewById2;
            View viewFindViewById3 = view.findViewById(R.id.tv_badge);
            f0.n(viewFindViewById3, "null cannot be cast to non-null type android.widget.TextView");
            View viewFindViewById4 = view.findViewById(R.id.tv_desc);
            f0.n(viewFindViewById4, "null cannot be cast to non-null type android.widget.TextView");
            TextView textView = (TextView) view.findViewById(R.id.tv_tipsbox);
            View viewFindViewById5 = view.findViewById(R.id.iv_button_time);
            com.max.hbimage.b.K(obj.getImage_url(), imageView);
            i.v(this.f86154b, (TextView) viewFindViewById3, com.max.hbutils.utils.n.q(obj.getTips_count()));
            ((TextView) viewFindViewById4).setText(obj.getDesc());
            long jR = com.max.hbutils.utils.n.r(com.max.hbcache.c.o("game_rec_menu" + obj.getKey(), ""));
            viewFindViewById5.setVisibility(com.max.hbutils.utils.n.r(obj.getTips_time()) > jR ? 0 : 8);
            if (obj.getGameCenterBubbleObj() != null) {
                viewFindViewById5.setVisibility(8);
                ViewGroup.LayoutParams layoutParams2 = textView.getLayoutParams();
                f0.n(layoutParams2, "null cannot be cast to non-null type android.widget.RelativeLayout.LayoutParams");
                RelativeLayout.LayoutParams layoutParams3 = (RelativeLayout.LayoutParams) layoutParams2;
                int iW = (ViewUtils.W(viewFindViewById) - ViewUtils.W(imageView)) / 2;
                float fS = ViewUtils.S(textView.getPaint(), obj.getGameCenterBubbleObj().getDesc());
                if (fS < iW) {
                    layoutParams3.rightMargin = iW - ((int) fS);
                    textView.setLayoutParams(layoutParams3);
                }
                if (com.max.hbutils.utils.n.r(obj.getGameCenterBubbleObj().getTips_time()) > jR) {
                    textView.setVisibility(0);
                } else {
                    textView.setVisibility(4);
                }
                textView.setText(obj.getGameCenterBubbleObj().getDesc());
                textView.setBackgroundColor(com.max.xiaoheihe.utils.d.e1(obj.getGameCenterBubbleObj().getColor()));
                textView.setOutlineProvider(new a(this.f86154b));
                textView.setClipToOutline(true);
            } else {
                textView.setVisibility(8);
            }
            view.setOnClickListener(new ViewOnClickListenerC0781b(viewFindViewById5, textView, obj, this.f86154b));
        }

        @Override // com.max.hbcommon.base.adapter.s
        public /* bridge */ /* synthetic */ void onBindViewHolder(com.max.hbcommon.base.adapter.s.e eVar, MenuObj menuObj) {
            if (PatchProxy.proxy(new Object[]{eVar, menuObj}, this, changeQuickRedirect, false, 36005, new Class[]{com.max.hbcommon.base.adapter.s.e.class, Object.class}, Void.TYPE).isSupported) {
                return;
            }
            m(eVar, menuObj);
        }
    }

    public i(@dl.d RecommendVHBParam param) {
        f0.p(param, "param");
        this.f86153g = param;
    }

    public static final /* synthetic */ void v(i iVar, TextView textView, int i10) {
        if (PatchProxy.proxy(new Object[]{iVar, textView, new Integer(i10)}, null, changeQuickRedirect, true, 36002, new Class[]{i.class, TextView.class, Integer.TYPE}, Void.TYPE).isSupported) {
            return;
        }
        iVar.w(textView, i10);
    }

    private final void w(TextView textView, int i10) {
        if (PatchProxy.proxy(new Object[]{textView, new Integer(i10)}, this, changeQuickRedirect, false, 36000, new Class[]{TextView.class, Integer.TYPE}, Void.TYPE).isSupported) {
            return;
        }
        if (i10 <= 0) {
            textView.setVisibility(8);
        } else {
            textView.setVisibility(0);
            textView.setText(String.valueOf(i10));
        }
    }

    @xh.m
    public static final void y(@dl.d Context context, @dl.d MenuObj menuObj) {
        if (PatchProxy.proxy(new Object[]{context, menuObj}, null, changeQuickRedirect, true, 36001, new Class[]{Context.class, MenuObj.class}, Void.TYPE).isSupported) {
            return;
        }
        f86151h.a(context, menuObj);
    }

    public final void A(@dl.d RecommendVHBParam recommendVHBParam) {
        if (PatchProxy.proxy(new Object[]{recommendVHBParam}, this, changeQuickRedirect, false, 35997, new Class[]{RecommendVHBParam.class}, Void.TYPE).isSupported) {
            return;
        }
        f0.p(recommendVHBParam, "<set-?>");
        this.f86153g = recommendVHBParam;
    }

    @Override // com.max.xiaoheihe.module.game.adapter.recommend.binder.r
    public void g(@dl.d com.max.hbcommon.base.adapter.s.e viewHolder, @dl.d GameRecommendBaseObj data) {
        if (PatchProxy.proxy(new Object[]{viewHolder, data}, this, changeQuickRedirect, false, 35998, new Class[]{com.max.hbcommon.base.adapter.s.e.class, GameRecommendBaseObj.class}, Void.TYPE).isSupported) {
            return;
        }
        f0.p(viewHolder, "viewHolder");
        f0.p(data, "data");
        RecyclerView rv = (RecyclerView) viewHolder.i(R.id.ll_menu_container);
        if (!(data instanceof RecommendMenuObj) || f0.g(data, rv.getTag(R.id.ll_menu_container))) {
            return;
        }
        rv.setTag(R.id.ll_menu_container, data);
        RadioGroup vg_indicator = (RadioGroup) viewHolder.i(R.id.vg_indicator);
        f0.o(rv, "rv");
        f0.o(vg_indicator, "vg_indicator");
        z(rv, vg_indicator, ((RecommendMenuObj) data).getItems());
    }

    @dl.d
    public final RecommendVHBParam x() {
        return this.f86153g;
    }

    public final void z(@dl.d RecyclerView containerLinearLayout, @dl.d RadioGroup indicatorGroup, @dl.e List<MenuObj> list) {
        if (PatchProxy.proxy(new Object[]{containerLinearLayout, indicatorGroup, list}, this, changeQuickRedirect, false, 35999, new Class[]{RecyclerView.class, RadioGroup.class, List.class}, Void.TYPE).isSupported) {
            return;
        }
        f0.p(containerLinearLayout, "containerLinearLayout");
        f0.p(indicatorGroup, "indicatorGroup");
        if (list == null || list.size() <= 0) {
            containerLinearLayout.setVisibility(8);
            indicatorGroup.setVisibility(8);
            return;
        }
        if (!com.max.xiaoheihe.module.account.utils.d.f()) {
            Iterator<MenuObj> it = list.iterator();
            while (it.hasNext()) {
                if (kotlin.text.u.L1("h5game", it.next().getKey(), true)) {
                    it.remove();
                }
            }
        }
        containerLinearLayout.setVisibility(0);
        int iMin = Math.min(5, list.size());
        if (list.size() > iMin) {
            indicatorGroup.setVisibility(0);
            com.max.xiaoheihe.module.mall.o.k(this.f86153g.b(), indicatorGroup, (int) Math.ceil(((double) list.size()) / ((double) iMin)));
        }
        containerLinearLayout.clearOnScrollListeners();
        containerLinearLayout.setOnFlingListener(null);
        containerLinearLayout.setLayoutManager(new LinearLayoutManager(this.f86153g.b(), 0, false));
        new LinearSnapHelper().attachToRecyclerView(containerLinearLayout);
        containerLinearLayout.setAdapter(new b(list, this, iMin, this.f86153g.b()));
        if (list.size() > iMin) {
            com.max.xiaoheihe.module.mall.o.j(containerLinearLayout, indicatorGroup, iMin);
        }
    }
}
