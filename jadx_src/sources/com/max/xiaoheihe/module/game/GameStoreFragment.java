package com.max.xiaoheihe.module.game;

import android.annotation.SuppressLint;
import android.app.Activity;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.graphics.Rect;
import android.os.Bundle;
import android.os.Handler;
import android.os.Message;
import android.text.SpannableString;
import android.text.style.AbsoluteSizeSpan;
import android.text.style.ForegroundColorSpan;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.ProgressBar;
import android.widget.RadioGroup;
import android.widget.TextView;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.LinearSnapHelper;
import androidx.recyclerview.widget.RecyclerView;
import androidx.recyclerview.widget.SimpleItemAnimator;
import androidx.recyclerview.widget.StaggeredGridLayoutManager;
import com.donkingliang.consecutivescroller.ConsecutiveScrollerLayout;
import com.max.hbcommon.base.BaseActivity;
import com.max.hbcommon.base.adapter.OneTimeValidExposureWatcher;
import com.max.hbcommon.bean.AdsBannerObj;
import com.max.hbcommon.bean.KeyDescObj;
import com.max.hbcommon.component.HeyBoxTabLayout;
import com.max.hbcommon.component.segmentfilters.SegmentFilterView;
import com.max.hbcustomview.bannerview.BannerViewPager;
import com.max.hbutils.bean.Result;
import com.max.hbutils.utils.ViewUtils;
import com.max.hbwallet.MallCouponListActivity;
import com.max.xiaoheihe.R;
import com.max.xiaoheihe.bean.MenuObj;
import com.max.xiaoheihe.bean.MenusObj;
import com.max.xiaoheihe.bean.game.GameObj;
import com.max.xiaoheihe.bean.mall.MallGameInfoObj;
import com.max.xiaoheihe.bean.mall.MallHeaderObj;
import com.max.xiaoheihe.bean.mall.MallProductObj;
import com.max.xiaoheihe.bean.mall.MallProductsObj;
import com.max.xiaoheihe.bean.mall.MallSaleObj;
import com.max.xiaoheihe.bean.mall.MallSalesObj;
import com.max.xiaoheihe.bean.mall.MallSkuObj;
import com.max.xiaoheihe.module.mall.MallProductDetailActivity;
import com.max.xiaoheihe.module.mall.NotificationType;
import com.max.xiaoheihe.module.mall.cart.MallCartUtils;
import com.max.xiaoheihe.module.webview.WebActionActivity;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.PatchProxyResult;
import com.tencent.mmkv.MMKV;
import df.m9;
import df.pq;
import df.yk;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

/* JADX INFO: loaded from: classes11.dex */
@com.max.hbcommon.analytics.m(path = lb.d.V1)
public class GameStoreFragment extends com.max.hbcommon.base.d {
    public static ChangeQuickRedirect changeQuickRedirect = null;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    private static final String f84874q = "game_purchase";

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private String f84875b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private MallHeaderObj f84876c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private String f84877d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private String f84878e;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private com.max.hbcommon.base.adapter.s f84881h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private int f84882i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private MallSalesObj f84883j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private String f84884k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private String f84885l;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private RefreshBroadcastReceiver f84887n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    private BannerViewPager<AdsBannerObj> f84888o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    private m9 f84889p;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private String f84879f = "game";

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private List<MallProductObj> f84880g = new ArrayList();

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private final m f84886m = new m(this);

    public class RefreshBroadcastReceiver extends BroadcastReceiver {
        public static ChangeQuickRedirect changeQuickRedirect;

        private RefreshBroadcastReceiver() {
        }

        /* synthetic */ RefreshBroadcastReceiver(GameStoreFragment gameStoreFragment, d dVar) {
            this();
        }

        @Override // android.content.BroadcastReceiver
        public void onReceive(Context context, Intent intent) {
            if (!PatchProxy.proxy(new Object[]{context, intent}, this, changeQuickRedirect, false, 33921, new Class[]{Context.class, Intent.class}, Void.TYPE).isSupported && lb.a.B.equals(intent.getAction())) {
                GameStoreFragment.x4(GameStoreFragment.this);
            }
        }
    }

    public class a implements View.OnClickListener {
        public static ChangeQuickRedirect changeQuickRedirect;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ MallSkuObj f84891b;

        a(MallSkuObj mallSkuObj) {
            this.f84891b = mallSkuObj;
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            if (PatchProxy.proxy(new Object[]{view}, this, changeQuickRedirect, false, 33894, new Class[]{View.class}, Void.TYPE).isSupported) {
                return;
            }
            if (this.f84891b.getGame_info() != null) {
                GameStoreFragment gameStoreFragment = GameStoreFragment.this;
                gameStoreFragment.startActivity(z.b(((com.max.hbcommon.base.d) gameStoreFragment).mContext, null, this.f84891b.getGame_info().getAppid(), this.f84891b.getGame_info().getGame_type(), null, com.max.xiaoheihe.utils.i0.m(), com.max.xiaoheihe.utils.i0.j(), null));
            } else {
                GameStoreFragment gameStoreFragment2 = GameStoreFragment.this;
                gameStoreFragment2.startActivity(MallProductDetailActivity.n2(((com.max.hbcommon.base.d) gameStoreFragment2).mContext, this.f84891b.getSku_id(), this.f84891b.getH_src()));
            }
        }
    }

    public class b extends com.max.hbcommon.base.adapter.s<MenuObj> {
        public static ChangeQuickRedirect changeQuickRedirect;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ int f84893b;

        public class a implements View.OnClickListener {
            public static ChangeQuickRedirect changeQuickRedirect;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            final /* synthetic */ MenuObj f84895b;

            a(MenuObj menuObj) {
                this.f84895b = menuObj;
            }

            @Override // android.view.View.OnClickListener
            public void onClick(View view) {
                if (PatchProxy.proxy(new Object[]{view}, this, changeQuickRedirect, false, 33902, new Class[]{View.class}, Void.TYPE).isSupported) {
                    return;
                }
                com.max.xiaoheihe.accelworld.m.b(MMKV.mmkvWithID("mall"), com.max.xiaoheihe.accelworld.m.f76768f, true);
                if (com.max.xiaoheihe.utils.i0.e(((com.max.hbcommon.base.d) GameStoreFragment.this).mContext)) {
                    if (GameObj.TAG_TYPE_COUPON.equalsIgnoreCase(this.f84895b.getKey())) {
                        ((com.max.hbcommon.base.d) GameStoreFragment.this).mContext.startActivity(MallCouponListActivity.V1(((com.max.hbcommon.base.d) GameStoreFragment.this).mContext, MallCouponListActivity.V, "all", null, null));
                        return;
                    }
                    if ("order".equalsIgnoreCase(this.f84895b.getKey())) {
                        com.max.xiaoheihe.base.router.b.i0(((com.max.hbcommon.base.d) GameStoreFragment.this).mContext, lb.d.W1);
                        return;
                    }
                    if ("whishlist".equalsIgnoreCase(this.f84895b.getKey())) {
                        com.max.xiaoheihe.base.router.b.i0(((com.max.hbcommon.base.d) GameStoreFragment.this).mContext, lb.d.f131186j2);
                        return;
                    }
                    if ("address".equalsIgnoreCase(this.f84895b.getKey())) {
                        com.max.xiaoheihe.base.router.b.C(((com.max.hbcommon.base.d) GameStoreFragment.this).mContext, false).A();
                        return;
                    }
                    if (c4.a.A.equalsIgnoreCase(this.f84895b.getKey())) {
                        com.max.xiaoheihe.base.router.b.i0(((com.max.hbcommon.base.d) GameStoreFragment.this).mContext, lb.d.f131221o2);
                        return;
                    }
                    if (!"1".equalsIgnoreCase(this.f84895b.getEnable()) || !"h5".equalsIgnoreCase(this.f84895b.getType()) || this.f84895b.getContent_url() == null) {
                        if (!com.max.hbcommon.utils.c.u(this.f84895b.getProt())) {
                            com.max.xiaoheihe.base.router.b.k0(((com.max.hbcommon.base.d) GameStoreFragment.this).mContext, this.f84895b.getProt());
                            return;
                        } else {
                            com.max.hbutils.utils.c cVar = com.max.hbutils.utils.c.f73533a;
                            com.max.hbutils.utils.c.f(GameStoreFragment.this.getString(R.string.plz_wait));
                            return;
                        }
                    }
                    if (!this.f84895b.getContent_url().startsWith("http")) {
                        com.max.xiaoheihe.base.router.b.k0(((com.max.hbcommon.base.d) GameStoreFragment.this).mContext, this.f84895b.getContent_url());
                        return;
                    }
                    Intent intent = new Intent(((com.max.hbcommon.base.d) GameStoreFragment.this).mContext, (Class<?>) WebActionActivity.class);
                    intent.putExtra("pageurl", this.f84895b.getContent_url());
                    intent.putExtra("title", this.f84895b.getDesc());
                    intent.putExtra("isPullRefresh", "true");
                    GameStoreFragment.this.startActivity(intent);
                }
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        b(Context context, List list, int i10, int i11) {
            super(context, list, i10);
            this.f84893b = i11;
        }

        private void n(MenuObj menuObj, TextView textView) {
            if (PatchProxy.proxy(new Object[]{menuObj, textView}, this, changeQuickRedirect, false, 33900, new Class[]{MenuObj.class, TextView.class}, Void.TYPE).isSupported || textView == null) {
                return;
            }
            if (com.max.hbutils.utils.n.q(menuObj.getTips_count()) <= 0) {
                textView.setVisibility(8);
            } else {
                textView.setVisibility(0);
                textView.setText(menuObj.getTips_count());
            }
        }

        private void o(MenuObj menuObj, TextView textView) {
            if (PatchProxy.proxy(new Object[]{menuObj, textView}, this, changeQuickRedirect, false, 33898, new Class[]{MenuObj.class, TextView.class}, Void.TYPE).isSupported || textView == null) {
                return;
            }
            textView.setText(menuObj.getDesc());
        }

        private void p(MenuObj menuObj, ImageView imageView) {
            if (PatchProxy.proxy(new Object[]{menuObj, imageView}, this, changeQuickRedirect, false, 33899, new Class[]{MenuObj.class, ImageView.class}, Void.TYPE).isSupported || imageView == null) {
                return;
            }
            com.max.hbimage.b.K(menuObj.getImage_url(), imageView);
        }

        private void q(MenuObj menuObj, View view) {
            if (PatchProxy.proxy(new Object[]{menuObj, view}, this, changeQuickRedirect, false, 33897, new Class[]{MenuObj.class, View.class}, Void.TYPE).isSupported) {
                return;
            }
            view.setOnClickListener(new a(menuObj));
        }

        private void r(View view) {
            if (PatchProxy.proxy(new Object[]{view}, this, changeQuickRedirect, false, 33896, new Class[]{View.class}, Void.TYPE).isSupported) {
                return;
            }
            ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
            layoutParams.width = (int) ((ViewUtils.L(((com.max.hbcommon.base.d) GameStoreFragment.this).mContext) / this.f84893b) + 0.5f);
            view.setLayoutParams(layoutParams);
        }

        public void m(com.max.hbcommon.base.adapter.s.e eVar, MenuObj menuObj) {
            if (PatchProxy.proxy(new Object[]{eVar, menuObj}, this, changeQuickRedirect, false, 33895, new Class[]{com.max.hbcommon.base.adapter.s.e.class, MenuObj.class}, Void.TYPE).isSupported) {
                return;
            }
            View view = eVar.itemView;
            r(view);
            p(menuObj, (ImageView) view.findViewById(R.id.iv_img));
            TextView textView = (TextView) view.findViewById(R.id.tv_badge);
            n(menuObj, textView);
            o(menuObj, (TextView) view.findViewById(R.id.tv_desc));
            TextView textView2 = (TextView) view.findViewById(R.id.tv_tipsbox);
            View viewFindViewById = view.findViewById(R.id.iv_button_time);
            View viewFindViewById2 = view.findViewById(R.id.fl_auto_rotate_container);
            boolean zA = com.max.xiaoheihe.accelworld.m.a(MMKV.mmkvWithID("mall"), com.max.xiaoheihe.accelworld.m.f76768f, false);
            if (!menuObj.isShow_flash_animation() || zA) {
                viewFindViewById2.setVisibility(8);
            } else {
                viewFindViewById2.setVisibility(0);
                textView.setVisibility(8);
                textView2.setVisibility(8);
                viewFindViewById.setVisibility(8);
            }
            q(menuObj, view);
        }

        @Override // com.max.hbcommon.base.adapter.s
        public /* bridge */ /* synthetic */ void onBindViewHolder(com.max.hbcommon.base.adapter.s.e eVar, MenuObj menuObj) {
            if (PatchProxy.proxy(new Object[]{eVar, menuObj}, this, changeQuickRedirect, false, 33901, new Class[]{com.max.hbcommon.base.adapter.s.e.class, Object.class}, Void.TYPE).isSupported) {
                return;
            }
            m(eVar, menuObj);
        }
    }

    public class c implements HeyBoxTabLayout.g {
        public static ChangeQuickRedirect changeQuickRedirect;

        c() {
        }

        @Override // com.max.hbcommon.component.HeyBoxTabLayout.c
        public void a(HeyBoxTabLayout.i iVar) {
        }

        @Override // com.max.hbcommon.component.HeyBoxTabLayout.c
        public void b(HeyBoxTabLayout.i iVar) {
        }

        @Override // com.max.hbcommon.component.HeyBoxTabLayout.c
        public void c(HeyBoxTabLayout.i iVar) {
            if (PatchProxy.proxy(new Object[]{iVar}, this, changeQuickRedirect, false, 33903, new Class[]{HeyBoxTabLayout.i.class}, Void.TYPE).isSupported) {
                return;
            }
            GameStoreFragment.v4(GameStoreFragment.this);
            GameStoreFragment.this.f84875b = (String) iVar.i();
            GameStoreFragment.this.f84882i = 0;
            GameStoreFragment.o4(GameStoreFragment.this);
        }
    }

    public class d extends RecyclerView.ItemDecoration {
        public static ChangeQuickRedirect changeQuickRedirect;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        int f84898b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        int f84899c;

        d() {
            this.f84898b = ViewUtils.f(((com.max.hbcommon.base.d) GameStoreFragment.this).mContext, 12.0f);
            this.f84899c = ViewUtils.f(((com.max.hbcommon.base.d) GameStoreFragment.this).mContext, 7.0f) / 2;
        }

        @Override // androidx.recyclerview.widget.RecyclerView.ItemDecoration
        public void getItemOffsets(@androidx.annotation.n0 Rect rect, @androidx.annotation.n0 View view, @androidx.annotation.n0 RecyclerView recyclerView, @androidx.annotation.n0 RecyclerView.State state) {
            if (PatchProxy.proxy(new Object[]{rect, view, recyclerView, state}, this, changeQuickRedirect, false, 33893, new Class[]{Rect.class, View.class, RecyclerView.class, RecyclerView.State.class}, Void.TYPE).isSupported) {
                return;
            }
            int childAdapterPosition = recyclerView.getChildAdapterPosition(view);
            int spanIndex = ((StaggeredGridLayoutManager.LayoutParams) view.getLayoutParams()).getSpanIndex();
            int i10 = childAdapterPosition >= 2 ? this.f84899c : this.f84898b;
            if (childAdapterPosition < 0) {
                rect.set(0, 0, 0, 0);
                return;
            }
            if (spanIndex % 2 != 0) {
                int i11 = this.f84899c;
                rect.set(i11, i10, this.f84898b, i11);
            } else {
                int i12 = this.f84898b;
                int i13 = this.f84899c;
                rect.set(i12, i10, i13, i13);
            }
        }
    }

    public class e implements pg.d {
        public static ChangeQuickRedirect changeQuickRedirect;

        e() {
        }

        @Override // pg.d
        public void k(ng.j jVar) {
            if (PatchProxy.proxy(new Object[]{jVar}, this, changeQuickRedirect, false, 33904, new Class[]{ng.j.class}, Void.TYPE).isSupported) {
                return;
            }
            GameStoreFragment.this.f84882i = 0;
            GameStoreFragment.o4(GameStoreFragment.this);
        }
    }

    public class f extends pg.g {
        public static ChangeQuickRedirect changeQuickRedirect;

        f() {
        }

        @Override // pg.g, pg.c
        public void i(ng.f fVar, boolean z10, float f10, int i10, int i11, int i12) {
            Object[] objArr = {fVar, new Byte(z10 ? (byte) 1 : (byte) 0), new Float(f10), new Integer(i10), new Integer(i11), new Integer(i12)};
            ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
            Class cls = Integer.TYPE;
            if (PatchProxy.proxy(objArr, this, changeQuickRedirect2, false, 33905, new Class[]{ng.f.class, Boolean.TYPE, Float.TYPE, cls, cls, cls}, Void.TYPE).isSupported || !GameStoreFragment.this.isActive() || GameStoreFragment.this.f84889p.f113342b == null) {
                return;
            }
            GameStoreFragment.this.f84889p.f113342b.setStickyOffset(i10);
        }
    }

    public class g implements pg.b {
        public static ChangeQuickRedirect changeQuickRedirect;

        g() {
        }

        @Override // pg.b
        public void f(ng.j jVar) {
            if (PatchProxy.proxy(new Object[]{jVar}, this, changeQuickRedirect, false, 33906, new Class[]{ng.j.class}, Void.TYPE).isSupported) {
                return;
            }
            GameStoreFragment.f4(GameStoreFragment.this, 30);
            GameStoreFragment.o4(GameStoreFragment.this);
        }
    }

    public class h extends com.max.hbcommon.network.d<Result<MallProductsObj>> {
        public static ChangeQuickRedirect changeQuickRedirect;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ com.max.hbcommon.base.d f84904b;

        h(com.max.hbcommon.base.d dVar) {
            this.f84904b = dVar;
        }

        @Override // com.max.hbcommon.network.d, io.reactivex.g0
        public void onComplete() {
            if (!PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 33907, new Class[0], Void.TYPE).isSupported && GameStoreFragment.this.isActive()) {
                super.onComplete();
                GameStoreFragment.this.f84889p.f113345e.A(0);
                GameStoreFragment.this.f84889p.f113345e.p(0);
            }
        }

        @Override // com.max.hbcommon.network.d, io.reactivex.g0
        public void onError(Throwable th2) {
            if (!PatchProxy.proxy(new Object[]{th2}, this, changeQuickRedirect, false, 33908, new Class[]{Throwable.class}, Void.TYPE).isSupported && GameStoreFragment.this.isActive()) {
                super.onError(th2);
                GameStoreFragment.z4(GameStoreFragment.this);
                GameStoreFragment.this.f84889p.f113345e.A(0);
                GameStoreFragment.this.f84889p.f113345e.p(0);
            }
        }

        public void onNext(Result<MallProductsObj> result) {
            View viewS3;
            if (!PatchProxy.proxy(new Object[]{result}, this, changeQuickRedirect, false, 33909, new Class[]{Result.class}, Void.TYPE).isSupported && GameStoreFragment.this.isActive()) {
                super.onNext(result);
                GameStoreFragment.A4(GameStoreFragment.this);
                GameStoreFragment gameStoreFragment = GameStoreFragment.this;
                GameStoreFragment.D4(gameStoreFragment, gameStoreFragment.f84876c);
                GameStoreFragment.P3(GameStoreFragment.this, result.getResult());
                GameStoreFragment.this.H4();
                if (GameStoreFragment.this.f84877d == null || (viewS3 = GameStoreFragment.S3(GameStoreFragment.this, R.id.multi_status_view_container)) == null) {
                    return;
                }
                com.max.xiaoheihe.module.mall.a.a(this.f84904b, GameStoreFragment.this.f84877d, viewS3, ViewUtils.f(viewS3.getContext(), 120.0f), NotificationType.MALL_HEADER);
            }
        }

        @Override // com.max.hbcommon.network.d, io.reactivex.g0
        public /* bridge */ /* synthetic */ void onNext(Object obj) {
            if (PatchProxy.proxy(new Object[]{obj}, this, changeQuickRedirect, false, 33910, new Class[]{Object.class}, Void.TYPE).isSupported) {
                return;
            }
            onNext((Result<MallProductsObj>) obj);
        }
    }

    public class i implements kh.o<Result<MallHeaderObj>, io.reactivex.z<Result<MallProductsObj>>> {
        public static ChangeQuickRedirect changeQuickRedirect;

        i() {
        }

        public io.reactivex.z<Result<MallProductsObj>> a(Result<MallHeaderObj> result) throws Exception {
            PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{result}, this, changeQuickRedirect, false, 33911, new Class[]{Result.class}, io.reactivex.z.class);
            if (patchProxyResultProxy.isSupported) {
                return (io.reactivex.z) patchProxyResultProxy.result;
            }
            GameStoreFragment.this.f84876c = result.getResult();
            GameStoreFragment.this.f84877d = result.getProtocol();
            HashMap map = new HashMap(16);
            MenusObj tabs = GameStoreFragment.this.f84876c != null ? GameStoreFragment.this.f84876c.getTabs() : null;
            GameStoreFragment.this.f84878e = tabs != null ? tabs.getKey() : null;
            List<KeyDescObj> menu = tabs != null ? tabs.getMenu() : null;
            if (GameStoreFragment.this.f84879f == null && menu != null && menu.size() > 0) {
                GameStoreFragment.this.f84879f = menu.get(0).getKey();
            }
            if (GameStoreFragment.this.f84878e != null && GameStoreFragment.this.f84879f != null) {
                map.put(GameStoreFragment.this.f84878e, GameStoreFragment.this.f84879f);
            }
            return com.max.xiaoheihe.network.i.a().z3(map, 0, 30);
        }

        /* JADX WARN: Type inference failed for: r9v3, types: [io.reactivex.z<com.max.hbutils.bean.Result<com.max.xiaoheihe.bean.mall.MallProductsObj>>, java.lang.Object] */
        @Override // kh.o
        public /* bridge */ /* synthetic */ io.reactivex.z<Result<MallProductsObj>> apply(Result<MallHeaderObj> result) throws Exception {
            PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{result}, this, changeQuickRedirect, false, 33912, new Class[]{Object.class}, Object.class);
            return patchProxyResultProxy.isSupported ? patchProxyResultProxy.result : a(result);
        }
    }

    public class j extends com.max.hbcommon.network.d<Result<MallProductsObj>> {
        public static ChangeQuickRedirect changeQuickRedirect;

        j() {
        }

        @Override // com.max.hbcommon.network.d, io.reactivex.g0
        public void onComplete() {
            if (!PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 33913, new Class[0], Void.TYPE).isSupported && GameStoreFragment.this.isActive()) {
                super.onComplete();
                GameStoreFragment.this.f84889p.f113345e.A(0);
                GameStoreFragment.this.f84889p.f113345e.p(0);
            }
        }

        @Override // com.max.hbcommon.network.d, io.reactivex.g0
        public void onError(Throwable th2) {
            if (!PatchProxy.proxy(new Object[]{th2}, this, changeQuickRedirect, false, 33914, new Class[]{Throwable.class}, Void.TYPE).isSupported && GameStoreFragment.this.isActive()) {
                super.onError(th2);
                GameStoreFragment.X3(GameStoreFragment.this);
                GameStoreFragment.this.f84889p.f113345e.A(0);
                GameStoreFragment.this.f84889p.f113345e.p(0);
            }
        }

        public void onNext(Result<MallProductsObj> result) {
            if (!PatchProxy.proxy(new Object[]{result}, this, changeQuickRedirect, false, 33915, new Class[]{Result.class}, Void.TYPE).isSupported && GameStoreFragment.this.isActive()) {
                super.onNext(result);
                GameStoreFragment.P3(GameStoreFragment.this, result.getResult());
            }
        }

        @Override // com.max.hbcommon.network.d, io.reactivex.g0
        public /* bridge */ /* synthetic */ void onNext(Object obj) {
            if (PatchProxy.proxy(new Object[]{obj}, this, changeQuickRedirect, false, 33916, new Class[]{Object.class}, Void.TYPE).isSupported) {
                return;
            }
            onNext((Result<MallProductsObj>) obj);
        }
    }

    public class k extends com.max.hbcommon.network.d<Result<MallSalesObj>> {
        public static ChangeQuickRedirect changeQuickRedirect;

        k() {
        }

        public void onNext(Result<MallSalesObj> result) {
            if (!PatchProxy.proxy(new Object[]{result}, this, changeQuickRedirect, false, 33917, new Class[]{Result.class}, Void.TYPE).isSupported && GameStoreFragment.this.isActive()) {
                super.onNext(result);
                GameStoreFragment.this.f84883j = result.getResult();
                GameStoreFragment.Z3(GameStoreFragment.this);
            }
        }

        @Override // com.max.hbcommon.network.d, io.reactivex.g0
        public /* bridge */ /* synthetic */ void onNext(Object obj) {
            if (PatchProxy.proxy(new Object[]{obj}, this, changeQuickRedirect, false, 33918, new Class[]{Object.class}, Void.TYPE).isSupported) {
                return;
            }
            onNext((Result<MallSalesObj>) obj);
        }
    }

    public class l implements View.OnClickListener {
        public static ChangeQuickRedirect changeQuickRedirect;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ MallSkuObj f84909b;

        l(MallSkuObj mallSkuObj) {
            this.f84909b = mallSkuObj;
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            if (!PatchProxy.proxy(new Object[]{view}, this, changeQuickRedirect, false, 33919, new Class[]{View.class}, Void.TYPE).isSupported && com.max.xiaoheihe.utils.i0.e(((com.max.hbcommon.base.d) GameStoreFragment.this).mContext)) {
                MallGameInfoObj game_info = this.f84909b.getGame_info();
                if (game_info != null) {
                    ((com.max.hbcommon.base.d) GameStoreFragment.this).mContext.startActivity(z.b(((com.max.hbcommon.base.d) GameStoreFragment.this).mContext, GameStoreFragment.this.f84879f, game_info.getAppid(), game_info.getGame_type(), null, com.max.xiaoheihe.utils.i0.m(), com.max.xiaoheihe.utils.i0.j(), this.f84909b.getSku_id()));
                } else {
                    ((com.max.hbcommon.base.d) GameStoreFragment.this).mContext.startActivity(MallProductDetailActivity.n2(((com.max.hbcommon.base.d) GameStoreFragment.this).mContext, this.f84909b.getSku_id(), GameStoreFragment.this.f84879f));
                }
            }
        }
    }

    public static class m extends Handler {
        public static ChangeQuickRedirect changeQuickRedirect;

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final WeakReference<GameStoreFragment> f84911a;

        public m(GameStoreFragment gameStoreFragment) {
            this.f84911a = new WeakReference<>(gameStoreFragment);
        }

        @Override // android.os.Handler
        public void handleMessage(Message message) {
            if (PatchProxy.proxy(new Object[]{message}, this, changeQuickRedirect, false, 33920, new Class[]{Message.class}, Void.TYPE).isSupported) {
                return;
            }
            super.handleMessage(message);
            GameStoreFragment gameStoreFragment = this.f84911a.get();
            if (gameStoreFragment == null || !gameStoreFragment.isActive()) {
                return;
            }
            gameStoreFragment.P4();
            if ("2".equals(gameStoreFragment.F4())) {
                sendEmptyMessageDelayed(0, 1000L);
            }
        }
    }

    static /* synthetic */ void A4(GameStoreFragment gameStoreFragment) {
        if (PatchProxy.proxy(new Object[]{gameStoreFragment}, null, changeQuickRedirect, true, 33885, new Class[]{GameStoreFragment.class}, Void.TYPE).isSupported) {
            return;
        }
        gameStoreFragment.showContentView();
    }

    static /* synthetic */ void D4(GameStoreFragment gameStoreFragment, MallHeaderObj mallHeaderObj) {
        if (PatchProxy.proxy(new Object[]{gameStoreFragment, mallHeaderObj}, null, changeQuickRedirect, true, 33886, new Class[]{GameStoreFragment.class, MallHeaderObj.class}, Void.TYPE).isSupported) {
            return;
        }
        gameStoreFragment.S4(mallHeaderObj);
    }

    private void E4() {
        if (PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 33862, new Class[0], Void.TYPE).isSupported) {
            return;
        }
        com.max.hbcommon.base.adapter.s sVar = this.f84881h;
        if (sVar instanceof com.max.xiaoheihe.module.mall.e) {
            ((com.max.xiaoheihe.module.mall.e) sVar).o();
        } else if (sVar instanceof com.max.xiaoheihe.module.mall.adapter.g) {
            ((com.max.xiaoheihe.module.mall.adapter.g) sVar).u();
        }
    }

    @SuppressLint({"AutoDispose"})
    private void G4() {
        if (PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 33864, new Class[0], Void.TYPE).isSupported) {
            return;
        }
        this.f84882i = 0;
        addDisposable((io.reactivex.disposables.b) com.max.xiaoheihe.network.i.a().L7().k2(new i()).I5(io.reactivex.schedulers.b.d()).a4(io.reactivex.android.schedulers.a.c()).J5(new h(this)));
    }

    @SuppressLint({"AutoDispose"})
    private void I4() {
        String str;
        if (PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 33865, new Class[0], Void.TYPE).isSupported) {
            return;
        }
        HashMap map = new HashMap(16);
        String str2 = this.f84875b;
        if (str2 != null) {
            map.put("sort_type", str2);
        }
        String str3 = this.f84878e;
        if (str3 != null && (str = this.f84879f) != null) {
            map.put(str3, str);
        }
        addDisposable((io.reactivex.disposables.b) com.max.xiaoheihe.network.i.a().z3(map, this.f84882i, 30).I5(io.reactivex.schedulers.b.d()).a4(io.reactivex.android.schedulers.a.c()).J5(new j()));
    }

    private void J4() {
        if (PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 33867, new Class[0], Void.TYPE).isSupported) {
            return;
        }
        com.max.hbsearch.o.a();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void K4(View view, int i10, int i11, int i12) {
        Object[] objArr = {view, new Integer(i10), new Integer(i11), new Integer(i12)};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        Class cls = Integer.TYPE;
        if (PatchProxy.proxy(objArr, this, changeQuickRedirect2, false, 33882, new Class[]{View.class, cls, cls, cls}, Void.TYPE).isSupported) {
            return;
        }
        E4();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void L4(KeyDescObj keyDescObj, int i10) {
        if (PatchProxy.proxy(new Object[]{keyDescObj, new Integer(i10)}, this, changeQuickRedirect, false, 33881, new Class[]{KeyDescObj.class, Integer.TYPE}, Void.TYPE).isSupported) {
            return;
        }
        E4();
        this.f84879f = keyDescObj.getKey();
        this.f84875b = null;
        G4();
    }

    public static GameStoreFragment M4() {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[0], null, changeQuickRedirect, true, 33860, new Class[0], GameStoreFragment.class);
        if (patchProxyResultProxy.isSupported) {
            return (GameStoreFragment) patchProxyResultProxy.result;
        }
        GameStoreFragment gameStoreFragment = new GameStoreFragment();
        gameStoreFragment.setArguments(new Bundle());
        return gameStoreFragment;
    }

    private void N4(MallProductsObj mallProductsObj) {
        if (PatchProxy.proxy(new Object[]{mallProductsObj}, this, changeQuickRedirect, false, 33868, new Class[]{MallProductsObj.class}, Void.TYPE).isSupported) {
            return;
        }
        showContentView();
        Q4(mallProductsObj);
        MallCartUtils.f90196a.D(com.max.hbutils.utils.n.q(mallProductsObj.getCart_count()));
        Activity activity = this.mContext;
        if (activity instanceof GameStoreActivity) {
            ((GameStoreActivity) activity).T1();
        }
        int size = this.f84880g.size();
        if (this.f84882i == 0) {
            this.f84880g.clear();
        }
        if (mallProductsObj.getItems() != null) {
            this.f84880g.addAll(mallProductsObj.getItems());
        }
        if (com.max.hbcommon.utils.c.w(this.f84880g)) {
            this.f84889p.f113344d.b().setVisibility(0);
            this.f84889p.f113344d.f131709d.setText("暂无内容");
            this.f84889p.f113343c.setVisibility(8);
            return;
        }
        this.f84889p.f113344d.b().setVisibility(8);
        this.f84889p.f113343c.setVisibility(0);
        if (this.f84882i == 0) {
            this.f84881h.notifyDataSetChanged();
        } else {
            if (mallProductsObj.getItems() == null || mallProductsObj.getItems().size() <= 0) {
                return;
            }
            this.f84881h.notifyItemRangeChanged(size, mallProductsObj.getItems().size());
        }
    }

    private void O4(com.max.hbcommon.base.adapter.s.e eVar, MallSkuObj mallSkuObj) {
        boolean z10;
        if (PatchProxy.proxy(new Object[]{eVar, mallSkuObj}, this, changeQuickRedirect, false, 33871, new Class[]{com.max.hbcommon.base.adapter.s.e.class, MallSkuObj.class}, Void.TYPE).isSupported) {
            return;
        }
        ImageView imageView = (ImageView) eVar.i(R.id.iv_game_img);
        TextView textView = (TextView) eVar.i(R.id.tv_name);
        TextView textView2 = (TextView) eVar.i(R.id.tv_discount);
        View viewI = eVar.i(R.id.vg_purchase);
        ImageView imageView2 = (ImageView) eVar.i(R.id.iv_purchase);
        TextView textView3 = (TextView) eVar.i(R.id.tv_purchase);
        ProgressBar progressBar = (ProgressBar) eVar.i(R.id.pb_progress);
        TextView textView4 = (TextView) eVar.i(R.id.tv_progress_desc);
        View viewI2 = eVar.i(R.id.iv_scrim);
        View viewB = eVar.b();
        com.max.hbimage.b.L(mallSkuObj.getHead_image(), imageView, R.drawable.common_default_placeholder_375x210);
        r1.j1(textView2, mallSkuObj.getPrice(), null);
        textView.setText(mallSkuObj.getName());
        r1.G1(eVar, mallSkuObj.getPrice(), true);
        String state = mallSkuObj.getSale() != null ? mallSkuObj.getSale().getState() : null;
        int iRound = mallSkuObj.getSale() != null ? Math.round(com.max.hbutils.utils.n.p(mallSkuObj.getSale().getLeft_percent()) * 100.0f) : 0;
        if ("0".equals(state)) {
            textView4.setText(getString(R.string.sold_out));
            progressBar.setProgress(0);
        } else {
            textView4.setText(String.format(getString(R.string.remained_format), iRound + "%"));
            progressBar.setProgress(iRound);
        }
        if ("0".equals(state) || "2".equals(state)) {
            z10 = false;
            viewI2.setVisibility(0);
            viewI.setEnabled(false);
            imageView2.setColorFilter(getResources().getColor(R.color.text_secondary_1_color));
            textView3.setEnabled(false);
        } else {
            viewI2.setVisibility(8);
            viewI.setEnabled(true);
            imageView2.setColorFilter(getResources().getColor(R.color.white));
            textView3.setEnabled(true);
            viewI.setOnClickListener(new l(mallSkuObj));
            z10 = false;
        }
        if ("0".equals(state)) {
            viewB.setClickable(z10);
        } else {
            viewB.setOnClickListener(new a(mallSkuObj));
        }
    }

    static /* synthetic */ void P3(GameStoreFragment gameStoreFragment, MallProductsObj mallProductsObj) {
        if (PatchProxy.proxy(new Object[]{gameStoreFragment, mallProductsObj}, null, changeQuickRedirect, true, 33887, new Class[]{GameStoreFragment.class, MallProductsObj.class}, Void.TYPE).isSupported) {
            return;
        }
        gameStoreFragment.N4(mallProductsObj);
    }

    private void Q4(MallProductsObj mallProductsObj) {
        if (PatchProxy.proxy(new Object[]{mallProductsObj}, this, changeQuickRedirect, false, 33877, new Class[]{MallProductsObj.class}, Void.TYPE).isSupported) {
            return;
        }
        R4(mallProductsObj.getSort_types());
    }

    private void R4(List<KeyDescObj> list) {
        if (PatchProxy.proxy(new Object[]{list}, this, changeQuickRedirect, false, 33878, new Class[]{List.class}, Void.TYPE).isSupported) {
            return;
        }
        yk ykVar = this.f84889p.f113346f;
        HeyBoxTabLayout heyBoxTabLayout = ykVar.f117987e;
        TextView textView = ykVar.f117988f;
        View view = ykVar.f117985c;
        if (list != null && list.size() > 0 && this.f84875b == null) {
            heyBoxTabLayout.o();
            heyBoxTabLayout.H();
            HeyBoxTabLayout.i iVar = null;
            for (KeyDescObj keyDescObj : list) {
                HeyBoxTabLayout.i iVarV = heyBoxTabLayout.E().x(keyDescObj.getDesc()).v(keyDescObj.getKey());
                String str = this.f84875b;
                if (str != null && str.equals(keyDescObj.getKey())) {
                    iVar = iVarV;
                }
                heyBoxTabLayout.e(iVarV);
            }
            if (iVar != null) {
                iVar.m();
            }
            heyBoxTabLayout.d(new c());
        }
        textView.setVisibility(8);
        view.setVisibility(8);
    }

    static /* synthetic */ View S3(GameStoreFragment gameStoreFragment, int i10) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{gameStoreFragment, new Integer(i10)}, null, changeQuickRedirect, true, 33888, new Class[]{GameStoreFragment.class, Integer.TYPE}, View.class);
        return patchProxyResultProxy.isSupported ? (View) patchProxyResultProxy.result : gameStoreFragment.findViewById(i10);
    }

    private void S4(MallHeaderObj mallHeaderObj) {
        if (PatchProxy.proxy(new Object[]{mallHeaderObj}, this, changeQuickRedirect, false, 33874, new Class[]{MallHeaderObj.class}, Void.TYPE).isSupported) {
            return;
        }
        this.f84888o = this.f84889p.f113347g.f112221d.f131796b;
        Activity activity = this.mContext;
        com.max.hbcommon.utils.b.h(this.f84888o, mallHeaderObj.getBanners(), ViewUtils.L(this.mContext) - ViewUtils.f(this.mContext, 24.0f), ViewUtils.h0(this.mContext, ViewUtils.n(activity, ViewUtils.L(activity), ViewUtils.f(this.mContext, 72.0f), ViewUtils.ViewType.IMAGE)), 12.0f, false);
        if (mallHeaderObj.getMember_info() != null) {
            com.max.xiaoheihe.module.mall.p.f90999a.c(mallHeaderObj.getMember_info(), this.f84889p.f113347g.f112224g.f117077b.b(), 106.0f, 14.0f);
            this.f84889p.f113347g.f112224g.b().setVisibility(0);
        } else {
            this.f84889p.f113347g.f112224g.b().setVisibility(8);
        }
        pq pqVar = this.f84889p.f113347g.f112225h;
        U4(pqVar.f114597b, pqVar.f114598c, mallHeaderObj.getMenu());
        W4(this.f84889p.f113347g.f112220c, mallHeaderObj.getTabs() != null ? mallHeaderObj.getTabs().getMenu() : null);
    }

    private void T4() {
        MallSalesObj mallSalesObj;
        if (PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 33870, new Class[0], Void.TYPE).isSupported || (mallSalesObj = this.f84883j) == null) {
            return;
        }
        LinearLayout linearLayout = this.f84889p.f113347g.f112222e;
        if (com.max.hbcommon.utils.c.w(mallSalesObj.getSales())) {
            linearLayout.setVisibility(8);
            return;
        }
        MallSaleObj mallSaleObj = this.f84883j.getSales().get(0);
        LinearLayout linearLayout2 = this.f84889p.f113347g.f112219b;
        this.f84884k = mallSaleObj.getNext_sale_time();
        linearLayout.setVisibility(0);
        mb.f fVar = this.f84889p.f113347g.f112223f;
        TextView textView = fVar.f131542e;
        LinearLayout linearLayout3 = fVar.f131543f;
        ImageView imageView = fVar.f131539b;
        if (MallSaleObj.KEY_SALES.equals(mallSaleObj.getKey())) {
            linearLayout3.setVisibility(0);
            imageView.setVisibility(8);
            String title = mallSaleObj.getTitle();
            String str = " - " + mallSaleObj.getQa();
            SpannableString spannableString = new SpannableString(title + str);
            spannableString.setSpan(new AbsoluteSizeSpan(getResources().getDimensionPixelSize(R.dimen.text_size_12)), spannableString.length() - str.length(), spannableString.length(), 33);
            spannableString.setSpan(new ForegroundColorSpan(getResources().getColor(R.color.text_secondary_1_color)), spannableString.length() - str.length(), spannableString.length(), 33);
            textView.setText(spannableString);
        } else if ("bundle".equals(mallSaleObj.getKey())) {
            linearLayout3.setVisibility(8);
            textView.setText(mallSaleObj.getTitle());
        }
        linearLayout2.removeAllViews();
        List<MallSkuObj> skus = mallSaleObj.getSkus();
        int size = skus.size();
        int i10 = 0;
        int i11 = 0;
        int i12 = size;
        while (true) {
            if (i10 >= size) {
                break;
            }
            MallSkuObj mallSkuObj = skus.get(i10);
            String state = mallSkuObj.getSale() != null ? mallSkuObj.getSale().getState() : null;
            if ("2".equals(state)) {
                i11++;
            } else if ("0".equals(state)) {
                i12--;
            }
            View viewInflate = this.mInflater.inflate(R.layout.item_game_store_daily_sales, (ViewGroup) linearLayout2, false);
            O4(new com.max.hbcommon.base.adapter.s.e(R.layout.item_game_store_daily_sales, viewInflate), mallSkuObj);
            LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(-1, -2);
            if (i10 != 0) {
                layoutParams.topMargin = ViewUtils.f(this.mContext, 4.0f);
            }
            linearLayout2.addView(viewInflate, layoutParams);
            i10++;
        }
        if (MallSaleObj.KEY_SALES.equals(mallSaleObj.getKey())) {
            if (i11 > 0) {
                this.f84885l = "2";
            } else if (i12 <= 0) {
                this.f84885l = "0";
            } else {
                this.f84885l = "1";
            }
            this.f84886m.removeCallbacksAndMessages(null);
            this.f84886m.sendEmptyMessage(0);
        }
    }

    private void U4(RecyclerView recyclerView, RadioGroup radioGroup, List<MenuObj> list) {
        if (PatchProxy.proxy(new Object[]{recyclerView, radioGroup, list}, this, changeQuickRedirect, false, 33876, new Class[]{RecyclerView.class, RadioGroup.class, List.class}, Void.TYPE).isSupported) {
            return;
        }
        if (list == null || list.size() <= 0) {
            recyclerView.setVisibility(8);
            radioGroup.setVisibility(8);
            return;
        }
        recyclerView.setVisibility(0);
        int iMin = Math.min(5, list.size());
        if (list.size() > iMin) {
            radioGroup.setVisibility(0);
            com.max.xiaoheihe.module.mall.o.k(this.mContext, radioGroup, (int) Math.ceil(((double) list.size()) / ((double) iMin)));
        }
        recyclerView.clearOnScrollListeners();
        recyclerView.setOnFlingListener(null);
        recyclerView.setLayoutManager(new LinearLayoutManager(this.mContext, 0, false));
        new LinearSnapHelper().attachToRecyclerView(recyclerView);
        recyclerView.setAdapter(new b(this.mContext, list, R.layout.hb_l_store_item_menu_store, iMin));
        if (list.size() > iMin) {
            com.max.xiaoheihe.module.mall.o.j(recyclerView, radioGroup, iMin);
        }
    }

    private void W4(SegmentFilterView segmentFilterView, List<KeyDescObj> list) {
        if (PatchProxy.proxy(new Object[]{segmentFilterView, list}, this, changeQuickRedirect, false, 33875, new Class[]{SegmentFilterView.class, List.class}, Void.TYPE).isSupported || list == null || list.size() <= 0) {
            return;
        }
        segmentFilterView.setData(list);
        segmentFilterView.setMOnTabCheckedListener(new SegmentFilterView.a() { // from class: com.max.xiaoheihe.module.game.p0
            @Override // com.max.hbcommon.component.segmentfilters.SegmentFilterView.a
            public final void a(KeyDescObj keyDescObj, int i10) {
                this.f87966a.L4(keyDescObj, i10);
            }
        });
        segmentFilterView.d();
    }

    static /* synthetic */ void X3(GameStoreFragment gameStoreFragment) {
        if (PatchProxy.proxy(new Object[]{gameStoreFragment}, null, changeQuickRedirect, true, 33889, new Class[]{GameStoreFragment.class}, Void.TYPE).isSupported) {
            return;
        }
        gameStoreFragment.showError();
    }

    static /* synthetic */ void Z3(GameStoreFragment gameStoreFragment) {
        if (PatchProxy.proxy(new Object[]{gameStoreFragment}, null, changeQuickRedirect, true, 33890, new Class[]{GameStoreFragment.class}, Void.TYPE).isSupported) {
            return;
        }
        gameStoreFragment.T4();
    }

    static /* synthetic */ int f4(GameStoreFragment gameStoreFragment, int i10) {
        int i11 = gameStoreFragment.f84882i + i10;
        gameStoreFragment.f84882i = i11;
        return i11;
    }

    static /* synthetic */ void o4(GameStoreFragment gameStoreFragment) {
        if (PatchProxy.proxy(new Object[]{gameStoreFragment}, null, changeQuickRedirect, true, 33883, new Class[]{GameStoreFragment.class}, Void.TYPE).isSupported) {
            return;
        }
        gameStoreFragment.I4();
    }

    static /* synthetic */ void v4(GameStoreFragment gameStoreFragment) {
        if (PatchProxy.proxy(new Object[]{gameStoreFragment}, null, changeQuickRedirect, true, 33891, new Class[]{GameStoreFragment.class}, Void.TYPE).isSupported) {
            return;
        }
        gameStoreFragment.E4();
    }

    static /* synthetic */ void x4(GameStoreFragment gameStoreFragment) {
        if (PatchProxy.proxy(new Object[]{gameStoreFragment}, null, changeQuickRedirect, true, 33892, new Class[]{GameStoreFragment.class}, Void.TYPE).isSupported) {
            return;
        }
        gameStoreFragment.G4();
    }

    static /* synthetic */ void z4(GameStoreFragment gameStoreFragment) {
        if (PatchProxy.proxy(new Object[]{gameStoreFragment}, null, changeQuickRedirect, true, 33884, new Class[]{GameStoreFragment.class}, Void.TYPE).isSupported) {
            return;
        }
        gameStoreFragment.showError();
    }

    public String F4() {
        return this.f84885l;
    }

    @SuppressLint({"AutoDispose"})
    public void H4() {
        if (!PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 33866, new Class[0], Void.TYPE).isSupported && com.max.xiaoheihe.utils.i0.s()) {
            addDisposable((io.reactivex.disposables.b) com.max.xiaoheihe.network.i.a().d2().I5(io.reactivex.schedulers.b.d()).a4(io.reactivex.android.schedulers.a.c()).J5(new k()));
        }
    }

    public void P4() {
        TextView textView;
        if (PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 33869, new Class[0], Void.TYPE).isSupported || (textView = this.f84889p.f113347g.f112223f.f131541d) == null) {
            return;
        }
        if ("0".equals(this.f84885l)) {
            textView.setText(getString(R.string.sold_out));
            return;
        }
        if ("1".equals(this.f84885l)) {
            textView.setText(getString(R.string.doing));
            return;
        }
        if (!"2".equals(this.f84885l) || com.max.hbcommon.utils.c.u(this.f84884k)) {
            return;
        }
        long jU = com.max.hbutils.utils.w.U(this.f84884k) - System.currentTimeMillis();
        if (jU > 0) {
            textView.setText(String.format(getString(R.string.count_down_format), com.max.hbutils.utils.w.k(jU)));
        } else if (jU > -1000) {
            this.f84885l = "1";
            this.f84886m.removeCallbacksAndMessages(null);
            H4();
        }
    }

    public void V4() {
        if (PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 33880, new Class[0], Void.TYPE).isSupported) {
            return;
        }
        G4();
    }

    @Override // com.max.hbcommon.base.d
    public void installViews(View view) {
        if (PatchProxy.proxy(new Object[]{view}, this, changeQuickRedirect, false, 33861, new Class[]{View.class}, Void.TYPE).isSupported) {
            return;
        }
        m9 m9VarC = m9.c(this.mInflater);
        this.f84889p = m9VarC;
        setContentView(m9VarC);
        this.f84889p.f113343c.setLayoutManager(new StaggeredGridLayoutManager(2, 1));
        this.f84889p.f113343c.addItemDecoration(new d());
        com.max.xiaoheihe.module.mall.adapter.g gVar = new com.max.xiaoheihe.module.mall.adapter.g(this.mContext, this.f84880g);
        this.f84881h = gVar;
        this.f84889p.f113343c.setAdapter(gVar);
        ((SimpleItemAnimator) this.f84889p.f113343c.getItemAnimator()).setSupportsChangeAnimations(false);
        this.f84889p.f113345e.setBackgroundColor(getResources().getColor(R.color.divider_secondary_1_color));
        this.f84889p.f113345e.S(new e());
        this.f84889p.f113345e.k0(new f());
        this.f84889p.f113342b.setOnVerticalScrollChangeListener(new ConsecutiveScrollerLayout.h() { // from class: com.max.xiaoheihe.module.game.o0
            @Override // com.donkingliang.consecutivescroller.ConsecutiveScrollerLayout.h
            public final void a(View view2, int i10, int i11, int i12) {
                this.f87846a.K4(view2, i10, i11, i12);
            }
        });
        this.f84889p.f113345e.f0(new g());
        RefreshBroadcastReceiver refreshBroadcastReceiver = new RefreshBroadcastReceiver(this, null);
        this.f84887n = refreshBroadcastReceiver;
        registerReceiver(refreshBroadcastReceiver, lb.a.B);
        showLoading();
        G4();
        J4();
        new OneTimeValidExposureWatcher(this, this.f84889p.f113343c);
    }

    @Override // com.max.hbcommon.base.d, androidx.fragment.app.Fragment
    public void onDestroy() {
        if (PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 33873, new Class[0], Void.TYPE).isSupported) {
            return;
        }
        this.f84886m.removeCallbacksAndMessages(null);
        RefreshBroadcastReceiver refreshBroadcastReceiver = this.f84887n;
        if (refreshBroadcastReceiver != null) {
            this.mContext.unregisterReceiver(refreshBroadcastReceiver);
        }
        super.onDestroy();
    }

    @Override // com.max.hbcommon.base.d
    public void onFragmentShow() {
        if (PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 33863, new Class[0], Void.TYPE).isSupported) {
            return;
        }
        super.onFragmentShow();
        com.max.xiaoheihe.utils.i0.f((BaseActivity) this.mContext);
    }

    @Override // com.max.hbcommon.base.d
    public void onRefresh() {
        if (PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 33872, new Class[0], Void.TYPE).isSupported) {
            return;
        }
        showLoading();
        this.f84882i = 0;
        G4();
    }

    @Override // com.max.hbcommon.base.d, androidx.fragment.app.Fragment
    public void onStop() {
        if (PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 33879, new Class[0], Void.TYPE).isSupported) {
            return;
        }
        super.onStop();
    }
}
