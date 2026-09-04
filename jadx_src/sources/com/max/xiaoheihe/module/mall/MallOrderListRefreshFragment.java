package com.max.xiaoheihe.module.mall;

import android.app.Activity;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import butterknife.BindView;
import butterknife.ButterKnife;
import com.max.hbcommon.base.adapter.s;
import com.max.hbcommon.base.adapter.u;
import com.max.hbcommon.bean.KeyDescObj;
import com.max.hbcustomview.MallPriceCamelView;
import com.max.hbcustomview.QMUIRadiusImageView;
import com.max.hbutils.bean.Result;
import com.max.hbutils.utils.ViewUtils;
import com.max.xiaoheihe.R;
import com.max.xiaoheihe.bean.mall.MallOrderObj;
import com.max.xiaoheihe.bean.mall.MallOrdersObj;
import com.max.xiaoheihe.bean.mall.cart.CartItemObj;
import com.max.xiaoheihe.module.game.GameStoreOrderDetailActivity;
import com.max.xiaoheihe.module.game.r1;
import com.max.xiaoheihe.module.webview.WebActionActivity;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.PatchProxyResult;
import com.scwang.smartrefresh.layout.SmartRefreshLayout;
import df.zp;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/* JADX INFO: loaded from: classes11.dex */
public class MallOrderListRefreshFragment extends com.max.hbcommon.base.d {
    public static ChangeQuickRedirect changeQuickRedirect = null;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private static final String f89653h = "filter";

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private String f89654b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private int f89655c;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private d f89657e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private RefreshBroadcastReceiver f89658f;

    @BindView(R.id.rv_empty_view)
    View mEmptyView;

    @BindView(R.id.rv)
    RecyclerView mRecyclerView;

    @BindView(R.id.srl)
    SmartRefreshLayout mRefreshLayout;

    @BindView(R.id.tv_empty)
    TextView tv_empty;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private List<MallOrderObj> f89656d = new ArrayList();

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private Map<String, String> f89659g = new HashMap(16);

    public class RefreshBroadcastReceiver extends BroadcastReceiver {
        public static ChangeQuickRedirect changeQuickRedirect;

        private RefreshBroadcastReceiver() {
        }

        /* synthetic */ RefreshBroadcastReceiver(MallOrderListRefreshFragment mallOrderListRefreshFragment, a aVar) {
            this();
        }

        @Override // android.content.BroadcastReceiver
        public void onReceive(Context context, Intent intent) {
            if (!PatchProxy.proxy(new Object[]{context, intent}, this, changeQuickRedirect, false, 40313, new Class[]{Context.class, Intent.class}, Void.TYPE).isSupported && lb.a.A.equals(intent.getAction())) {
                MallOrderListRefreshFragment.this.f89655c = 0;
                MallOrderListRefreshFragment.O3(MallOrderListRefreshFragment.this);
            }
        }
    }

    public class a implements pg.d {
        public static ChangeQuickRedirect changeQuickRedirect;

        a() {
        }

        @Override // pg.d
        public void k(ng.j jVar) {
            if (PatchProxy.proxy(new Object[]{jVar}, this, changeQuickRedirect, false, 40299, new Class[]{ng.j.class}, Void.TYPE).isSupported) {
                return;
            }
            MallOrderListRefreshFragment.this.f89655c = 0;
            MallOrderListRefreshFragment.O3(MallOrderListRefreshFragment.this);
        }
    }

    public class b implements pg.b {
        public static ChangeQuickRedirect changeQuickRedirect;

        b() {
        }

        @Override // pg.b
        public void f(ng.j jVar) {
            if (PatchProxy.proxy(new Object[]{jVar}, this, changeQuickRedirect, false, 40300, new Class[]{ng.j.class}, Void.TYPE).isSupported) {
                return;
            }
            MallOrderListRefreshFragment.N3(MallOrderListRefreshFragment.this, 30);
            MallOrderListRefreshFragment.O3(MallOrderListRefreshFragment.this);
        }
    }

    public class c extends com.max.hbcommon.network.d<Result<MallOrdersObj>> {
        public static ChangeQuickRedirect changeQuickRedirect;

        c() {
        }

        @Override // com.max.hbcommon.network.d, io.reactivex.g0
        public void onComplete() {
            if (!PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 40302, new Class[0], Void.TYPE).isSupported && MallOrderListRefreshFragment.this.isActive()) {
                super.onComplete();
                MallOrderListRefreshFragment.this.mRefreshLayout.A(0);
                MallOrderListRefreshFragment.this.mRefreshLayout.p(0);
            }
        }

        @Override // com.max.hbcommon.network.d, io.reactivex.g0
        public void onError(Throwable th2) {
            if (!PatchProxy.proxy(new Object[]{th2}, this, changeQuickRedirect, false, 40301, new Class[]{Throwable.class}, Void.TYPE).isSupported && MallOrderListRefreshFragment.this.isActive()) {
                super.onError(th2);
                MallOrderListRefreshFragment.j4(MallOrderListRefreshFragment.this);
                MallOrderListRefreshFragment.this.mRefreshLayout.A(0);
                MallOrderListRefreshFragment.this.mRefreshLayout.p(0);
            }
        }

        public void onNext(Result<MallOrdersObj> result) {
            if (!PatchProxy.proxy(new Object[]{result}, this, changeQuickRedirect, false, 40303, new Class[]{Result.class}, Void.TYPE).isSupported && MallOrderListRefreshFragment.this.isActive()) {
                super.onNext(result);
                MallOrderListRefreshFragment.m4(MallOrderListRefreshFragment.this);
                MallOrdersObj result2 = result.getResult();
                if (MallOrderListRefreshFragment.this.f89655c == 0) {
                    MallOrderListRefreshFragment.this.f89656d.clear();
                }
                if (result2 != null && result2.getOrders() != null) {
                    MallOrderListRefreshFragment.this.f89656d.addAll(result2.getOrders());
                }
                MallOrderListRefreshFragment.this.f89657e.notifyDataSetChanged();
                MallOrderListRefreshFragment.p4(MallOrderListRefreshFragment.this);
            }
        }

        @Override // com.max.hbcommon.network.d, io.reactivex.g0
        public /* bridge */ /* synthetic */ void onNext(Object obj) {
            if (PatchProxy.proxy(new Object[]{obj}, this, changeQuickRedirect, false, 40304, new Class[]{Object.class}, Void.TYPE).isSupported) {
                return;
            }
            onNext((Result<MallOrdersObj>) obj);
        }
    }

    public class d extends u<MallOrderObj> {
        public static ChangeQuickRedirect changeQuickRedirect;

        public class a implements View.OnClickListener {
            public static ChangeQuickRedirect changeQuickRedirect;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            final /* synthetic */ MallOrderObj f89665b;

            a(MallOrderObj mallOrderObj) {
                this.f89665b = mallOrderObj;
            }

            @Override // android.view.View.OnClickListener
            public void onClick(View view) {
                if (PatchProxy.proxy(new Object[]{view}, this, changeQuickRedirect, false, 40310, new Class[]{View.class}, Void.TYPE).isSupported) {
                    return;
                }
                Intent intent = new Intent(((com.max.hbcommon.base.d) MallOrderListRefreshFragment.this).mContext, (Class<?>) WebActionActivity.class);
                intent.putExtra("pageurl", this.f89665b.getFaq());
                intent.putExtra("title", MallOrderListRefreshFragment.this.getString(R.string.setting_faq));
                MallOrderListRefreshFragment.this.startActivity(intent);
            }
        }

        public class b implements View.OnClickListener {
            public static ChangeQuickRedirect changeQuickRedirect;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            final /* synthetic */ MallOrderObj f89667b;

            b(MallOrderObj mallOrderObj) {
                this.f89667b = mallOrderObj;
            }

            @Override // android.view.View.OnClickListener
            public void onClick(View view) {
                if (PatchProxy.proxy(new Object[]{view}, this, changeQuickRedirect, false, 40311, new Class[]{View.class}, Void.TYPE).isSupported) {
                    return;
                }
                if ("game".equals(this.f89667b.getCat())) {
                    MallOrderListRefreshFragment mallOrderListRefreshFragment = MallOrderListRefreshFragment.this;
                    mallOrderListRefreshFragment.startActivity(GameStoreOrderDetailActivity.y4(((com.max.hbcommon.base.d) mallOrderListRefreshFragment).mContext, this.f89667b.getOrder_id()));
                } else if ("cart".equals(this.f89667b.getOrder_src())) {
                    com.max.xiaoheihe.base.router.b.D(((com.max.hbcommon.base.d) MallOrderListRefreshFragment.this).mContext, this.f89667b.getOrder_id()).A();
                } else if ("steam".equals(this.f89667b.getOrder_src())) {
                    com.max.xiaoheihe.base.router.b.a0(((com.max.hbcommon.base.d) MallOrderListRefreshFragment.this).mContext, this.f89667b.getOrder_id()).A();
                } else {
                    com.max.xiaoheihe.base.router.b.R(((com.max.hbcommon.base.d) MallOrderListRefreshFragment.this).mContext, this.f89667b.getOrder_id(), true).A();
                }
            }
        }

        public class c implements View.OnClickListener {
            public static ChangeQuickRedirect changeQuickRedirect;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            final /* synthetic */ KeyDescObj f89669b;

            c(KeyDescObj keyDescObj) {
                this.f89669b = keyDescObj;
            }

            @Override // android.view.View.OnClickListener
            public void onClick(View view) {
                if (PatchProxy.proxy(new Object[]{view}, this, changeQuickRedirect, false, 40312, new Class[]{View.class}, Void.TYPE).isSupported) {
                    return;
                }
                com.max.xiaoheihe.base.router.b.k0(((com.max.hbcommon.base.d) MallOrderListRefreshFragment.this).mContext, this.f89669b.getProtocol());
            }
        }

        public d() {
            super(((com.max.hbcommon.base.d) MallOrderListRefreshFragment.this).mContext, MallOrderListRefreshFragment.this.f89656d);
        }

        private void p(LinearLayout linearLayout, List<KeyDescObj> list) {
            if (PatchProxy.proxy(new Object[]{linearLayout, list}, this, changeQuickRedirect, false, 40307, new Class[]{LinearLayout.class, List.class}, Void.TYPE).isSupported) {
                return;
            }
            if (list == null || list.isEmpty()) {
                linearLayout.setVisibility(8);
                return;
            }
            linearLayout.setVisibility(0);
            linearLayout.removeAllViews();
            Context context = linearLayout.getContext();
            float f10 = 12.0f;
            int iF = ViewUtils.f(context, 12.0f);
            int iF2 = ViewUtils.f(context, 7.0f);
            int iF3 = ViewUtils.f(context, 12.0f);
            int iF4 = ViewUtils.f(context, 60.0f);
            int iF5 = ViewUtils.f(context, 30.0f);
            for (KeyDescObj keyDescObj : list) {
                TextView textView = new TextView(context);
                textView.setPadding(iF, iF2, iF, iF2);
                textView.setTextSize(1, f10);
                textView.setTextColor(context.getResources().getColor(R.color.text_primary_2_color));
                textView.setText(keyDescObj.getDesc());
                textView.setGravity(17);
                textView.setMinWidth(iF4);
                textView.setMinHeight(iF5);
                LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(-2, ViewUtils.f(((com.max.hbcommon.base.d) MallOrderListRefreshFragment.this).mContext, 30.0f));
                layoutParams.leftMargin = iF3;
                layoutParams.bottomMargin = iF3;
                textView.setLayoutParams(layoutParams);
                textView.setBackgroundResource(R.drawable.btn_border_2dp);
                textView.setOnClickListener(new c(keyDescObj));
                linearLayout.addView(textView);
                f10 = 12.0f;
            }
        }

        @Override // com.max.hbcommon.base.adapter.u
        public /* bridge */ /* synthetic */ int m(int i10, MallOrderObj mallOrderObj) {
            Object[] objArr = {new Integer(i10), mallOrderObj};
            ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
            Class cls = Integer.TYPE;
            PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(objArr, this, changeQuickRedirect2, false, 40308, new Class[]{cls, Object.class}, cls);
            return patchProxyResultProxy.isSupported ? ((Integer) patchProxyResultProxy.result).intValue() : n(i10, mallOrderObj);
        }

        public int n(int i10, MallOrderObj mallOrderObj) {
            Object[] objArr = {new Integer(i10), mallOrderObj};
            ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
            Class cls = Integer.TYPE;
            PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(objArr, this, changeQuickRedirect2, false, 40305, new Class[]{cls, MallOrderObj.class}, cls);
            if (patchProxyResultProxy.isSupported) {
                return ((Integer) patchProxyResultProxy.result).intValue();
            }
            return mallOrderObj.getDisplay_items().size() > 1 ? R.layout.item_order_list_multi : R.layout.item_order_list_single;
        }

        public void o(s.e eVar, MallOrderObj mallOrderObj) {
            char c10;
            if (PatchProxy.proxy(new Object[]{eVar, mallOrderObj}, this, changeQuickRedirect, false, 40306, new Class[]{s.e.class, MallOrderObj.class}, Void.TYPE).isSupported) {
                return;
            }
            View viewI = eVar.i(R.id.vg_state_desc);
            TextView textView = (TextView) eVar.i(R.id.tv_state_desc);
            ImageView imageView = (ImageView) eVar.i(R.id.iv_state_desc_faq);
            eVar.p(R.id.tv_state_desc, mallOrderObj.getState_desc());
            if (com.max.hbcommon.utils.c.u(mallOrderObj.getState_desc_color())) {
                textView.setTextColor(MallOrderListRefreshFragment.this.getResources().getColor(R.color.text_secondary_1_color));
                imageView.setColorFilter(MallOrderListRefreshFragment.this.getResources().getColor(R.color.text_secondary_1_color));
            } else {
                int iE1 = com.max.xiaoheihe.utils.d.e1(mallOrderObj.getState_desc_color());
                textView.setTextColor(iE1);
                imageView.setColorFilter(iE1);
            }
            if (com.max.hbcommon.utils.c.u(mallOrderObj.getFaq())) {
                imageView.setVisibility(8);
                viewI.setClickable(false);
            } else {
                imageView.setVisibility(0);
                viewI.setOnClickListener(new a(mallOrderObj));
            }
            View.OnClickListener bVar = new b(mallOrderObj);
            eVar.itemView.setOnClickListener(bVar);
            if (eVar.d() == R.layout.item_order_list_single) {
                p((LinearLayout) eVar.i(R.id.ll_btn), mallOrderObj.getButtons());
                zp zpVarA = zp.a(eVar.i(R.id.vg_product));
                CartItemObj cartItemObj = mallOrderObj.getDisplay_items().get(0);
                if (com.max.hbcommon.utils.c.A(cartItemObj.getProduct().getShow_default_background_img())) {
                    zpVarA.f118418c.setVisibility(0);
                    com.max.hbimage.b.d0(cartItemObj.getProduct().getHead_image(), zpVarA.f118418c, ViewUtils.f(((com.max.hbcommon.base.d) MallOrderListRefreshFragment.this).mContext, 3.0f));
                    zpVarA.f118419d.setImageResource(R.drawable.sku_background_empty);
                } else {
                    com.max.hbimage.b.K(cartItemObj.getProduct().getHead_image(), zpVarA.f118419d);
                    zpVarA.f118418c.setVisibility(8);
                }
                zpVarA.f118423h.setText(cartItemObj.getProduct().getName());
                if (cartItemObj.getContent() != null) {
                    StringBuilder sb2 = new StringBuilder();
                    for (String str : cartItemObj.getContent()) {
                        if (sb2.length() > 0) {
                            sb2.append(";");
                        }
                        sb2.append(str);
                    }
                    zpVarA.f118422g.setText(sb2.toString());
                } else {
                    zpVarA.f118422g.setText("");
                }
                zpVarA.f118420e.setText("共" + mallOrderObj.getCount() + "件");
                if (!com.max.hbcommon.utils.c.u(mallOrderObj.getCoupon_desc())) {
                    zpVarA.f118426k.setVisibility(8);
                    zpVarA.f118421f.setVisibility(0);
                    zpVarA.f118421f.setText(mallOrderObj.getCoupon_desc());
                } else if (MallOrderListRefreshFragment.U3(MallOrderListRefreshFragment.this, mallOrderObj)) {
                    zpVarA.f118426k.setVisibility(0);
                    zpVarA.f118421f.setVisibility(8);
                    zpVarA.f118426k.setPrice(r1.I(mallOrderObj.getCost_coin()));
                } else {
                    zpVarA.f118426k.setVisibility(8);
                    zpVarA.f118421f.setVisibility(8);
                }
                if (com.max.hbcommon.utils.c.u(cartItemObj.getSale_state_desc())) {
                    zpVarA.f118424i.setVisibility(8);
                    return;
                }
                zpVarA.f118424i.setVisibility(0);
                zpVarA.f118424i.setBackgroundDrawable(com.max.hbutils.utils.q.C(((com.max.hbcommon.base.d) MallOrderListRefreshFragment.this).mContext, R.color.text_primary_1_color_alpha30, 4.0f));
                zpVarA.f118424i.setText(cartItemObj.getSale_state_desc());
                return;
            }
            if (eVar.d() == R.layout.item_order_list_multi) {
                TextView textView2 = (TextView) eVar.i(R.id.tv_count);
                MallPriceCamelView mallPriceCamelView = (MallPriceCamelView) eVar.i(R.id.vg_price);
                ViewGroup viewGroup = (ViewGroup) eVar.i(R.id.vg_product);
                if (MallOrderListRefreshFragment.U3(MallOrderListRefreshFragment.this, mallOrderObj)) {
                    mallPriceCamelView.setVisibility(0);
                    mallPriceCamelView.setPrice(r1.I(mallOrderObj.getCost_coin()));
                } else {
                    mallPriceCamelView.setVisibility(8);
                }
                textView2.setText("共" + mallOrderObj.getCount() + "件");
                viewGroup.removeAllViews();
                viewGroup.setOnClickListener(bVar);
                for (CartItemObj cartItemObj2 : mallOrderObj.getDisplay_items()) {
                    FrameLayout frameLayout = new FrameLayout(((com.max.hbcommon.base.d) MallOrderListRefreshFragment.this).mContext);
                    QMUIRadiusImageView qMUIRadiusImageView = new QMUIRadiusImageView(((com.max.hbcommon.base.d) MallOrderListRefreshFragment.this).mContext);
                    ImageView imageView2 = new ImageView(((com.max.hbcommon.base.d) MallOrderListRefreshFragment.this).mContext);
                    FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(ViewUtils.f(((com.max.hbcommon.base.d) MallOrderListRefreshFragment.this).mContext, 84.0f), ViewUtils.f(((com.max.hbcommon.base.d) MallOrderListRefreshFragment.this).mContext, 84.0f));
                    FrameLayout.LayoutParams layoutParams2 = new FrameLayout.LayoutParams(ViewUtils.f(((com.max.hbcommon.base.d) MallOrderListRefreshFragment.this).mContext, 68.0f), ViewUtils.f(((com.max.hbcommon.base.d) MallOrderListRefreshFragment.this).mContext, 34.0f));
                    layoutParams2.gravity = 17;
                    frameLayout.addView(qMUIRadiusImageView, layoutParams);
                    frameLayout.addView(imageView2, layoutParams2);
                    LinearLayout.LayoutParams layoutParams3 = new LinearLayout.LayoutParams(ViewUtils.f(((com.max.hbcommon.base.d) MallOrderListRefreshFragment.this).mContext, 84.0f), ViewUtils.f(((com.max.hbcommon.base.d) MallOrderListRefreshFragment.this).mContext, 84.0f));
                    if (viewGroup.getChildCount() > 0) {
                        layoutParams3.leftMargin = ViewUtils.f(((com.max.hbcommon.base.d) MallOrderListRefreshFragment.this).mContext, 4.0f);
                    }
                    qMUIRadiusImageView.setBorderColor(com.max.xiaoheihe.utils.d.E(R.color.divider_secondary_1_color));
                    qMUIRadiusImageView.setBorderWidth(ViewUtils.f(((com.max.hbcommon.base.d) MallOrderListRefreshFragment.this).mContext, 0.5f));
                    qMUIRadiusImageView.setCornerRadius(ViewUtils.f(((com.max.hbcommon.base.d) MallOrderListRefreshFragment.this).mContext, 4.0f));
                    if (com.max.hbcommon.utils.c.A(cartItemObj2.getProduct().getShow_default_background_img())) {
                        imageView2.setVisibility(0);
                        com.max.hbimage.b.d0(cartItemObj2.getProduct().getHead_image(), imageView2, ViewUtils.f(((com.max.hbcommon.base.d) MallOrderListRefreshFragment.this).mContext, 1.0f));
                        qMUIRadiusImageView.setImageResource(R.drawable.sku_background_empty);
                        c10 = '\b';
                    } else {
                        com.max.hbimage.b.K(cartItemObj2.getProduct().getHead_image(), qMUIRadiusImageView);
                        c10 = '\b';
                        imageView2.setVisibility(8);
                    }
                    viewGroup.addView(frameLayout, layoutParams3);
                }
            }
        }

        @Override // com.max.hbcommon.base.adapter.s
        public /* bridge */ /* synthetic */ void onBindViewHolder(s.e eVar, Object obj) {
            if (PatchProxy.proxy(new Object[]{eVar, obj}, this, changeQuickRedirect, false, 40309, new Class[]{s.e.class, Object.class}, Void.TYPE).isSupported) {
                return;
            }
            o(eVar, (MallOrderObj) obj);
        }
    }

    static /* synthetic */ int N3(MallOrderListRefreshFragment mallOrderListRefreshFragment, int i10) {
        int i11 = mallOrderListRefreshFragment.f89655c + i10;
        mallOrderListRefreshFragment.f89655c = i11;
        return i11;
    }

    static /* synthetic */ void O3(MallOrderListRefreshFragment mallOrderListRefreshFragment) {
        if (PatchProxy.proxy(new Object[]{mallOrderListRefreshFragment}, null, changeQuickRedirect, true, 40294, new Class[]{MallOrderListRefreshFragment.class}, Void.TYPE).isSupported) {
            return;
        }
        mallOrderListRefreshFragment.s4();
    }

    static /* synthetic */ boolean U3(MallOrderListRefreshFragment mallOrderListRefreshFragment, MallOrderObj mallOrderObj) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{mallOrderListRefreshFragment, mallOrderObj}, null, changeQuickRedirect, true, 40298, new Class[]{MallOrderListRefreshFragment.class, MallOrderObj.class}, Boolean.TYPE);
        return patchProxyResultProxy.isSupported ? ((Boolean) patchProxyResultProxy.result).booleanValue() : mallOrderListRefreshFragment.u4(mallOrderObj);
    }

    static /* synthetic */ void j4(MallOrderListRefreshFragment mallOrderListRefreshFragment) {
        if (PatchProxy.proxy(new Object[]{mallOrderListRefreshFragment}, null, changeQuickRedirect, true, 40295, new Class[]{MallOrderListRefreshFragment.class}, Void.TYPE).isSupported) {
            return;
        }
        mallOrderListRefreshFragment.showError();
    }

    static /* synthetic */ void m4(MallOrderListRefreshFragment mallOrderListRefreshFragment) {
        if (PatchProxy.proxy(new Object[]{mallOrderListRefreshFragment}, null, changeQuickRedirect, true, 40296, new Class[]{MallOrderListRefreshFragment.class}, Void.TYPE).isSupported) {
            return;
        }
        mallOrderListRefreshFragment.showContentView();
    }

    static /* synthetic */ void p4(MallOrderListRefreshFragment mallOrderListRefreshFragment) {
        if (PatchProxy.proxy(new Object[]{mallOrderListRefreshFragment}, null, changeQuickRedirect, true, 40297, new Class[]{MallOrderListRefreshFragment.class}, Void.TYPE).isSupported) {
            return;
        }
        mallOrderListRefreshFragment.x4();
    }

    private void s4() {
        if (PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 40289, new Class[0], Void.TYPE).isSupported) {
            return;
        }
        com.max.xiaoheihe.network.e eVarA = com.max.xiaoheihe.network.i.a();
        String str = this.f89654b;
        Map<String, String> map = this.f89659g;
        if (map == null) {
            map = new HashMap<>();
        }
        addDisposable((io.reactivex.disposables.b) eVarA.S0(str, map, this.f89655c, 30).I5(io.reactivex.schedulers.b.d()).a4(io.reactivex.android.schedulers.a.c()).J5(new c()));
    }

    private boolean u4(MallOrderObj mallOrderObj) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{mallOrderObj}, this, changeQuickRedirect, false, 40292, new Class[]{MallOrderObj.class}, Boolean.TYPE);
        if (patchProxyResultProxy.isSupported) {
            return ((Boolean) patchProxyResultProxy.result).booleanValue();
        }
        return com.max.hbutils.utils.n.q(mallOrderObj.getState()) > 0 && com.max.hbutils.utils.n.q(mallOrderObj.getState()) != 100;
    }

    public static MallOrderListRefreshFragment v4(String str) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{str}, null, changeQuickRedirect, true, 40284, new Class[]{String.class}, MallOrderListRefreshFragment.class);
        if (patchProxyResultProxy.isSupported) {
            return (MallOrderListRefreshFragment) patchProxyResultProxy.result;
        }
        MallOrderListRefreshFragment mallOrderListRefreshFragment = new MallOrderListRefreshFragment();
        Bundle bundle = new Bundle();
        bundle.putString(f89653h, str);
        mallOrderListRefreshFragment.setArguments(bundle);
        return mallOrderListRefreshFragment;
    }

    private void x4() {
        if (PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 40290, new Class[0], Void.TYPE).isSupported) {
            return;
        }
        if (!com.max.hbcommon.utils.c.w(this.f89656d)) {
            this.mEmptyView.setVisibility(8);
            this.mRefreshLayout.i0(true);
            this.mRefreshLayout.b0(true);
        } else {
            this.mRefreshLayout.i0(false);
            this.mRefreshLayout.b0(false);
            this.mEmptyView.setVisibility(0);
            this.tv_empty.setText("没有相关订单");
        }
    }

    @Override // com.max.hbcommon.base.d
    public void installViews(View view) {
        if (PatchProxy.proxy(new Object[]{view}, this, changeQuickRedirect, false, 40285, new Class[]{View.class}, Void.TYPE).isSupported) {
            return;
        }
        setContentView(R.layout.layout_refresh_rv_empty);
        this.mUnBinder = ButterKnife.f(this, view);
        if (getArguments() != null) {
            this.f89654b = getArguments().getString(f89653h);
        }
        this.f89657e = new d();
        RecyclerView recyclerView = this.mRecyclerView;
        Activity activity = this.mContext;
        recyclerView.addItemDecoration(new com.max.hbcommon.base.adapter.i(activity, ViewUtils.f(activity, 4.0f), 0, 0));
        this.mRecyclerView.setLayoutManager(new LinearLayoutManager(this.mContext));
        this.mRecyclerView.setAdapter(this.f89657e);
        this.mRefreshLayout.S(new a());
        this.mRefreshLayout.f0(new b());
        showLoading();
        s4();
    }

    @Override // com.max.hbcommon.base.d
    public void onRefresh() {
        if (PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 40291, new Class[0], Void.TYPE).isSupported) {
            return;
        }
        showLoading();
        s4();
    }

    @Override // com.max.hbcommon.base.d
    public void onRegisterReceiver() {
        if (PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 40286, new Class[0], Void.TYPE).isSupported) {
            return;
        }
        super.onRegisterReceiver();
        RefreshBroadcastReceiver refreshBroadcastReceiver = new RefreshBroadcastReceiver(this, null);
        this.f89658f = refreshBroadcastReceiver;
        registerReceiver(refreshBroadcastReceiver, lb.a.A);
    }

    @Override // com.max.hbcommon.base.d, androidx.fragment.app.Fragment
    public void onStop() {
        if (PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 40287, new Class[0], Void.TYPE).isSupported) {
            return;
        }
        super.onStop();
    }

    @Override // com.max.hbcommon.base.d
    public void onUnRegisterReceiver() {
        if (PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 40288, new Class[0], Void.TYPE).isSupported) {
            return;
        }
        super.onUnRegisterReceiver();
        unregisterReceiver(this.f89658f);
    }

    public void t4(Map<String, String> map, List<MallOrderObj> list) {
        this.f89659g = map;
        this.f89656d = list;
        this.f89655c += 30;
    }

    public void w4(Map<String, String> map) {
        if (PatchProxy.proxy(new Object[]{map}, this, changeQuickRedirect, false, 40293, new Class[]{Map.class}, Void.TYPE).isSupported) {
            return;
        }
        Map<String, String> map2 = this.f89659g;
        if (map2 == null || !map2.equals(map)) {
            this.f89659g = map;
            this.f89655c = 0;
            s4();
        }
    }
}
