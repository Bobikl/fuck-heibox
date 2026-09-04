package com.max.xiaoheihe.module.game;

import android.content.Context;
import android.view.View;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import butterknife.BindView;
import butterknife.ButterKnife;
import com.max.hbcommon.base.BaseActivity;
import com.max.hbutils.bean.Result;
import com.max.hbutils.utils.ViewUtils;
import com.max.xiaoheihe.R;
import com.max.xiaoheihe.bean.game.GameStoreItemObj;
import com.max.xiaoheihe.bean.game.GameStoreObj;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.scwang.smartrefresh.layout.SmartRefreshLayout;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes11.dex */
@ig.d(path = {lb.d.f131186j2})
public class GameWishListActivity extends BaseActivity {
    private static final String O = "game_purchase";
    public static ChangeQuickRedirect changeQuickRedirect;
    private com.max.hbcommon.base.adapter.s<GameStoreItemObj> L;
    private List<GameStoreItemObj> M = new ArrayList();
    private int N;

    @BindView(R.id.rv)
    RecyclerView mRecyclerView;

    @BindView(R.id.srl)
    SmartRefreshLayout mRefreshLayout;

    public class a extends com.max.hbcommon.base.adapter.s<GameStoreItemObj> {
        public static ChangeQuickRedirect changeQuickRedirect;

        /* JADX INFO: renamed from: com.max.xiaoheihe.module.game.GameWishListActivity$a$a, reason: collision with other inner class name */
        public class ViewOnClickListenerC0757a implements View.OnClickListener {
            public static ChangeQuickRedirect changeQuickRedirect;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            final /* synthetic */ String f85273b;

            /* JADX INFO: renamed from: c, reason: collision with root package name */
            final /* synthetic */ String f85274c;

            ViewOnClickListenerC0757a(String str, String str2) {
                this.f85273b = str;
                this.f85274c = str2;
            }

            @Override // android.view.View.OnClickListener
            public void onClick(View view) {
                if (PatchProxy.proxy(new Object[]{view}, this, changeQuickRedirect, false, 34834, new Class[]{View.class}, Void.TYPE).isSupported) {
                    return;
                }
                ((BaseActivity) GameWishListActivity.this).f66601b.startActivity(z.b(((BaseActivity) GameWishListActivity.this).f66601b, this.f85273b, this.f85274c, null, null, com.max.xiaoheihe.utils.i0.m(), com.max.xiaoheihe.utils.i0.j(), null));
            }
        }

        public class b implements View.OnClickListener {
            public static ChangeQuickRedirect changeQuickRedirect;

            b() {
            }

            @Override // android.view.View.OnClickListener
            public void onClick(View view) {
                if (!PatchProxy.proxy(new Object[]{view}, this, changeQuickRedirect, false, 34835, new Class[]{View.class}, Void.TYPE).isSupported && com.max.xiaoheihe.utils.i0.e(((BaseActivity) GameWishListActivity.this).f66601b)) {
                    com.max.hbcache.c.C(GameStorePurchaseShareActivity.f85087a0, GameStorePurchaseShareActivity.f85092x1);
                }
            }
        }

        a(Context context, List list, int i10) {
            super(context, list, i10);
        }

        public void m(com.max.hbcommon.base.adapter.s.e eVar, GameStoreItemObj gameStoreItemObj) {
            if (PatchProxy.proxy(new Object[]{eVar, gameStoreItemObj}, this, changeQuickRedirect, false, 34832, new Class[]{com.max.hbcommon.base.adapter.s.e.class, GameStoreItemObj.class}, Void.TYPE).isSupported) {
                return;
            }
            String h_src = gameStoreItemObj.getH_src();
            String appid = gameStoreItemObj.getAppid();
            "1".equals(gameStoreItemObj.getProduct_type());
            r1.w1(eVar, gameStoreItemObj);
            View viewI = eVar.i(R.id.divider);
            View viewI2 = eVar.i(R.id.vg_store_price);
            if (gameStoreItemObj.getHeybox_price() != null) {
                viewI2.setVisibility(0);
                viewI2.setBackground(com.max.hbutils.utils.q.o(((BaseActivity) GameWishListActivity.this).f66601b, R.color.text_primary_1_color, ViewUtils.h0(((BaseActivity) GameWishListActivity.this).f66601b, ViewUtils.m(((BaseActivity) GameWishListActivity.this).f66601b, viewI2.getMinimumWidth(), viewI2.getMinimumHeight()))));
            } else {
                viewI2.setVisibility(8);
            }
            View viewB = eVar.b();
            if (gameStoreItemObj == this.mDataList.get(getItemCount() - 1)) {
                viewI.setVisibility(8);
            } else {
                viewI.setVisibility(0);
            }
            viewB.setOnClickListener(new ViewOnClickListenerC0757a(h_src, appid));
            eVar.i(R.id.vg_store_price).setOnClickListener(new b());
        }

        @Override // com.max.hbcommon.base.adapter.s
        public /* bridge */ /* synthetic */ void onBindViewHolder(com.max.hbcommon.base.adapter.s.e eVar, GameStoreItemObj gameStoreItemObj) {
            if (PatchProxy.proxy(new Object[]{eVar, gameStoreItemObj}, this, changeQuickRedirect, false, 34833, new Class[]{com.max.hbcommon.base.adapter.s.e.class, Object.class}, Void.TYPE).isSupported) {
                return;
            }
            m(eVar, gameStoreItemObj);
        }
    }

    public class b implements pg.d {
        public static ChangeQuickRedirect changeQuickRedirect;

        b() {
        }

        @Override // pg.d
        public void k(ng.j jVar) {
            if (PatchProxy.proxy(new Object[]{jVar}, this, changeQuickRedirect, false, 34836, new Class[]{ng.j.class}, Void.TYPE).isSupported) {
                return;
            }
            GameWishListActivity.this.N = 0;
            GameWishListActivity.X1(GameWishListActivity.this);
        }
    }

    public class c implements pg.b {
        public static ChangeQuickRedirect changeQuickRedirect;

        c() {
        }

        @Override // pg.b
        public void f(ng.j jVar) {
            if (PatchProxy.proxy(new Object[]{jVar}, this, changeQuickRedirect, false, 34837, new Class[]{ng.j.class}, Void.TYPE).isSupported) {
                return;
            }
            GameWishListActivity.W1(GameWishListActivity.this, 30);
            GameWishListActivity.X1(GameWishListActivity.this);
        }
    }

    public class d extends com.max.hbcommon.network.d<Result<GameStoreObj>> {
        public static ChangeQuickRedirect changeQuickRedirect;

        d() {
        }

        @Override // com.max.hbcommon.network.d, io.reactivex.g0
        public void onComplete() {
            if (!PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 34839, new Class[0], Void.TYPE).isSupported && GameWishListActivity.this.isActive()) {
                super.onComplete();
                GameWishListActivity.this.mRefreshLayout.A(0);
                GameWishListActivity.this.mRefreshLayout.p(0);
            }
        }

        @Override // com.max.hbcommon.network.d, io.reactivex.g0
        public void onError(Throwable th2) {
            if (!PatchProxy.proxy(new Object[]{th2}, this, changeQuickRedirect, false, 34838, new Class[]{Throwable.class}, Void.TYPE).isSupported && GameWishListActivity.this.isActive()) {
                super.onError(th2);
                GameWishListActivity.Y1(GameWishListActivity.this);
                GameWishListActivity.this.mRefreshLayout.A(0);
                GameWishListActivity.this.mRefreshLayout.p(0);
            }
        }

        public void onNext(Result<GameStoreObj> result) {
            if (!PatchProxy.proxy(new Object[]{result}, this, changeQuickRedirect, false, 34840, new Class[]{Result.class}, Void.TYPE).isSupported && GameWishListActivity.this.isActive()) {
                super.onNext(result);
                GameWishListActivity.Z1(GameWishListActivity.this, result.getResult());
            }
        }

        @Override // com.max.hbcommon.network.d, io.reactivex.g0
        public /* bridge */ /* synthetic */ void onNext(Object obj) {
            if (PatchProxy.proxy(new Object[]{obj}, this, changeQuickRedirect, false, 34841, new Class[]{Object.class}, Void.TYPE).isSupported) {
                return;
            }
            onNext((Result<GameStoreObj>) obj);
        }
    }

    static /* synthetic */ int W1(GameWishListActivity gameWishListActivity, int i10) {
        int i11 = gameWishListActivity.N + i10;
        gameWishListActivity.N = i11;
        return i11;
    }

    static /* synthetic */ void X1(GameWishListActivity gameWishListActivity) {
        if (PatchProxy.proxy(new Object[]{gameWishListActivity}, null, changeQuickRedirect, true, 34829, new Class[]{GameWishListActivity.class}, Void.TYPE).isSupported) {
            return;
        }
        gameWishListActivity.a2();
    }

    static /* synthetic */ void Y1(GameWishListActivity gameWishListActivity) {
        if (PatchProxy.proxy(new Object[]{gameWishListActivity}, null, changeQuickRedirect, true, 34830, new Class[]{GameWishListActivity.class}, Void.TYPE).isSupported) {
            return;
        }
        gameWishListActivity.C1();
    }

    static /* synthetic */ void Z1(GameWishListActivity gameWishListActivity, GameStoreObj gameStoreObj) {
        if (PatchProxy.proxy(new Object[]{gameWishListActivity, gameStoreObj}, null, changeQuickRedirect, true, 34831, new Class[]{GameWishListActivity.class, GameStoreObj.class}, Void.TYPE).isSupported) {
            return;
        }
        gameWishListActivity.b2(gameStoreObj);
    }

    private void a2() {
        if (PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 34826, new Class[0], Void.TYPE).isSupported) {
            return;
        }
        V((io.reactivex.disposables.b) com.max.xiaoheihe.network.i.a().R4(this.N, 30).I5(io.reactivex.schedulers.b.d()).a4(io.reactivex.android.schedulers.a.c()).J5(new d()));
    }

    private void b2(GameStoreObj gameStoreObj) {
        if (PatchProxy.proxy(new Object[]{gameStoreObj}, this, changeQuickRedirect, false, 34827, new Class[]{GameStoreObj.class}, Void.TYPE).isSupported) {
            return;
        }
        if (gameStoreObj != null && gameStoreObj.getWhishlist() != null && gameStoreObj.getWhishlist().size() > 0) {
            if (this.N == 0) {
                this.M.clear();
            }
            this.M.addAll(gameStoreObj.getWhishlist());
            this.L.notifyDataSetChanged();
        }
        if (this.M.size() > 0) {
            x1();
        } else {
            y1();
        }
    }

    @Override // com.max.hbcommon.base.BaseActivity
    public void k1() {
        if (PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 34825, new Class[0], Void.TYPE).isSupported) {
            return;
        }
        setContentView(R.layout.layout_sample_refresh_rv);
        ButterKnife.a(this);
        this.f66616q.setTitle(getString(R.string.my_wish_list));
        this.f66617r.setVisibility(0);
        this.L = new a(this.f66601b, this.M, R.layout.item_game_store_item);
        this.mRecyclerView.setLayoutManager(new LinearLayoutManager(this.f66601b));
        this.mRecyclerView.setAdapter(this.L);
        this.mRefreshLayout.S(new b());
        this.mRefreshLayout.f0(new c());
        E1();
        a2();
    }

    @Override // com.max.hbcommon.base.BaseActivity
    public void n1() {
        if (PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 34828, new Class[0], Void.TYPE).isSupported) {
            return;
        }
        E1();
        a2();
    }
}
