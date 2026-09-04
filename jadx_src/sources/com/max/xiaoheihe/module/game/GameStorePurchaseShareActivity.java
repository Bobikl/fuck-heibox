package com.max.xiaoheihe.module.game;

import android.app.Dialog;
import android.content.Context;
import android.content.Intent;
import android.graphics.Rect;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import butterknife.BindView;
import butterknife.ButterKnife;
import com.max.hbcommon.base.BaseActivity;
import com.max.hbshare.bean.HBShareData;
import com.max.hbutils.bean.Result;
import com.max.hbutils.utils.ViewUtils;
import com.max.xiaoheihe.R;
import com.max.xiaoheihe.bean.ShareInfoObj;
import com.max.xiaoheihe.bean.game.GamePurchaseResultObj;
import com.max.xiaoheihe.bean.game.GameStoreItemObj;
import com.max.xiaoheihe.module.bbs.ChannelsDetailActivity;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.PatchProxyResult;
import com.scwang.smartrefresh.layout.SmartRefreshLayout;
import com.umeng.socialize.UMShareAPI;
import com.umeng.socialize.UMShareListener;
import com.umeng.socialize.bean.SHARE_MEDIA;
import com.umeng.socialize.media.UMImage;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes11.dex */
public class GameStorePurchaseShareActivity extends BaseActivity {

    /* JADX INFO: renamed from: a0, reason: collision with root package name */
    public static final String f85087a0 = "purchase_src";

    /* JADX INFO: renamed from: b0, reason: collision with root package name */
    public static final String f85088b0 = "game_detail";

    /* JADX INFO: renamed from: c0, reason: collision with root package name */
    public static final String f85089c0 = "shopping_cart";
    public static ChangeQuickRedirect changeQuickRedirect = null;

    /* JADX INFO: renamed from: p1, reason: collision with root package name */
    public static final String f85090p1 = "game_store";

    /* JADX INFO: renamed from: p2, reason: collision with root package name */
    private static final String f85091p2 = "buy_type";

    /* JADX INFO: renamed from: x1, reason: collision with root package name */
    public static final String f85092x1 = "wish_list";

    /* JADX INFO: renamed from: y1, reason: collision with root package name */
    private static final String f85093y1 = "order_id";
    ImageView L;
    TextView M;
    TextView N;
    View O;
    ImageView P;
    ImageView Q;
    ImageView R;
    TextView S;
    private String T;
    private String U;
    private List<GameStoreItemObj> V = new ArrayList();
    private com.max.hbcommon.base.adapter.t W;
    private Dialog X;
    private UMShareListener Y;
    private com.max.hbshare.c.b Z;

    @BindView(R.id.tv_activate)
    TextView mActivateTextView;

    @BindView(R.id.rv)
    RecyclerView mRecyclerView;

    @BindView(R.id.srl)
    SmartRefreshLayout mRefreshLayout;

    public class a implements UMShareListener {
        public static ChangeQuickRedirect changeQuickRedirect;

        a() {
        }

        @Override // com.umeng.socialize.UMShareListener
        public void onCancel(SHARE_MEDIA share_media) {
        }

        @Override // com.umeng.socialize.UMShareListener
        public void onError(SHARE_MEDIA share_media, Throwable th2) {
            if (PatchProxy.proxy(new Object[]{share_media, th2}, this, changeQuickRedirect, false, 34379, new Class[]{SHARE_MEDIA.class, Throwable.class}, Void.TYPE).isSupported) {
                return;
            }
            com.max.hbutils.utils.c cVar = com.max.hbutils.utils.c.f73533a;
            com.max.hbutils.utils.c.f(GameStorePurchaseShareActivity.this.getString(R.string.share_fail));
        }

        @Override // com.umeng.socialize.UMShareListener
        public void onResult(SHARE_MEDIA share_media) {
            if (PatchProxy.proxy(new Object[]{share_media}, this, changeQuickRedirect, false, 34378, new Class[]{SHARE_MEDIA.class}, Void.TYPE).isSupported) {
                return;
            }
            com.max.hbutils.utils.c cVar = com.max.hbutils.utils.c.f73533a;
            com.max.hbutils.utils.c.f(GameStorePurchaseShareActivity.this.getString(R.string.share_success));
        }

        @Override // com.umeng.socialize.UMShareListener
        public void onStart(SHARE_MEDIA share_media) {
        }
    }

    public class b implements View.OnClickListener {
        public static ChangeQuickRedirect changeQuickRedirect;

        b() {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            if (PatchProxy.proxy(new Object[]{view}, this, changeQuickRedirect, false, 34377, new Class[]{View.class}, Void.TYPE).isSupported) {
                return;
            }
            GameStorePurchaseShareActivity.this.onBackPressed();
        }
    }

    public class c implements pg.d {
        public static ChangeQuickRedirect changeQuickRedirect;

        c() {
        }

        @Override // pg.d
        public void k(ng.j jVar) {
            if (PatchProxy.proxy(new Object[]{jVar}, this, changeQuickRedirect, false, 34380, new Class[]{ng.j.class}, Void.TYPE).isSupported) {
                return;
            }
            GameStorePurchaseShareActivity.M1(GameStorePurchaseShareActivity.this);
        }
    }

    public class d extends RecyclerView.ItemDecoration {
        public static ChangeQuickRedirect changeQuickRedirect;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        int f85097b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        int f85098c;

        d() {
            this.f85097b = ViewUtils.f(((BaseActivity) GameStorePurchaseShareActivity.this).f66601b, 6.0f);
            this.f85098c = ViewUtils.f(((BaseActivity) GameStorePurchaseShareActivity.this).f66601b, 20.0f);
        }

        @Override // androidx.recyclerview.widget.RecyclerView.ItemDecoration
        public void getItemOffsets(@androidx.annotation.n0 Rect rect, @androidx.annotation.n0 View view, @androidx.annotation.n0 RecyclerView recyclerView, @androidx.annotation.n0 RecyclerView.State state) {
            if (PatchProxy.proxy(new Object[]{rect, view, recyclerView, state}, this, changeQuickRedirect, false, 34381, new Class[]{Rect.class, View.class, RecyclerView.class, RecyclerView.State.class}, Void.TYPE).isSupported) {
                return;
            }
            int childAdapterPosition = recyclerView.getChildAdapterPosition(view);
            if (childAdapterPosition == 0) {
                rect.set(0, 0, 0, 0);
            } else if (childAdapterPosition % 2 == 0) {
                int i10 = this.f85097b;
                rect.set(i10, 0, i10 * 2, this.f85098c);
            } else {
                int i11 = this.f85097b;
                rect.set(i11 * 2, 0, i11, this.f85098c);
            }
        }
    }

    public class e extends com.max.hbcommon.base.adapter.s<GameStoreItemObj> {
        public static ChangeQuickRedirect changeQuickRedirect;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        int f85100b;

        e(Context context, List list, int i10) {
            super(context, list, i10);
            this.f85100b = (int) (((((ViewUtils.L(((BaseActivity) GameStorePurchaseShareActivity.this).f66601b) - ViewUtils.f(((BaseActivity) GameStorePurchaseShareActivity.this).f66601b, 36.0f)) / 2.0f) * 84.0f) / 173.5f) + 0.5f);
        }

        public void m(com.max.hbcommon.base.adapter.s.e eVar, GameStoreItemObj gameStoreItemObj) {
            if (PatchProxy.proxy(new Object[]{eVar, gameStoreItemObj}, this, changeQuickRedirect, false, 34382, new Class[]{com.max.hbcommon.base.adapter.s.e.class, GameStoreItemObj.class}, Void.TYPE).isSupported) {
                return;
            }
            ImageView imageView = (ImageView) eVar.i(R.id.iv_img);
            ViewGroup.LayoutParams layoutParams = imageView.getLayoutParams();
            int i10 = layoutParams.height;
            int i11 = this.f85100b;
            if (i10 != i11) {
                layoutParams.height = i11;
                imageView.setLayoutParams(layoutParams);
            }
            r1.v1(eVar, r1.t(gameStoreItemObj), "recommend", true);
        }

        @Override // com.max.hbcommon.base.adapter.s
        public /* bridge */ /* synthetic */ void onBindViewHolder(com.max.hbcommon.base.adapter.s.e eVar, GameStoreItemObj gameStoreItemObj) {
            if (PatchProxy.proxy(new Object[]{eVar, gameStoreItemObj}, this, changeQuickRedirect, false, 34383, new Class[]{com.max.hbcommon.base.adapter.s.e.class, Object.class}, Void.TYPE).isSupported) {
                return;
            }
            m(eVar, gameStoreItemObj);
        }
    }

    public class f extends com.max.hbcommon.network.d<Result<GamePurchaseResultObj>> {
        public static ChangeQuickRedirect changeQuickRedirect;

        f() {
        }

        @Override // com.max.hbcommon.network.d, io.reactivex.g0
        public void onComplete() {
            if (!PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 34385, new Class[0], Void.TYPE).isSupported && GameStorePurchaseShareActivity.this.isActive()) {
                super.onComplete();
                GameStorePurchaseShareActivity.this.mRefreshLayout.A(0);
                GameStorePurchaseShareActivity.this.mRefreshLayout.p(0);
            }
        }

        @Override // com.max.hbcommon.network.d, io.reactivex.g0
        public void onError(Throwable th2) {
            if (!PatchProxy.proxy(new Object[]{th2}, this, changeQuickRedirect, false, 34384, new Class[]{Throwable.class}, Void.TYPE).isSupported && GameStorePurchaseShareActivity.this.isActive()) {
                super.onError(th2);
                GameStorePurchaseShareActivity.Y1(GameStorePurchaseShareActivity.this);
                GameStorePurchaseShareActivity.this.mRefreshLayout.A(0);
                GameStorePurchaseShareActivity.this.mRefreshLayout.p(0);
            }
        }

        public void onNext(Result<GamePurchaseResultObj> result) {
            if (!PatchProxy.proxy(new Object[]{result}, this, changeQuickRedirect, false, 34386, new Class[]{Result.class}, Void.TYPE).isSupported && GameStorePurchaseShareActivity.this.isActive()) {
                super.onNext(result);
                GameStorePurchaseShareActivity.Z1(GameStorePurchaseShareActivity.this, result.getResult());
            }
        }

        @Override // com.max.hbcommon.network.d, io.reactivex.g0
        public /* bridge */ /* synthetic */ void onNext(Object obj) {
            if (PatchProxy.proxy(new Object[]{obj}, this, changeQuickRedirect, false, 34387, new Class[]{Object.class}, Void.TYPE).isSupported) {
                return;
            }
            onNext((Result<GamePurchaseResultObj>) obj);
        }
    }

    public class g implements View.OnClickListener {
        public static ChangeQuickRedirect changeQuickRedirect;

        g() {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            if (PatchProxy.proxy(new Object[]{view}, this, changeQuickRedirect, false, 34388, new Class[]{View.class}, Void.TYPE).isSupported) {
                return;
            }
            ((BaseActivity) GameStorePurchaseShareActivity.this).f66601b.startActivity(GameStoreSteamTradingActivity.I2(((BaseActivity) GameStorePurchaseShareActivity.this).f66601b, GameStorePurchaseShareActivity.this.T, "cdkey", null, false, false));
        }
    }

    public class h implements View.OnClickListener {
        public static ChangeQuickRedirect changeQuickRedirect;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ HBShareData f85104b;

        h(HBShareData hBShareData) {
            this.f85104b = hBShareData;
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            if (PatchProxy.proxy(new Object[]{view}, this, changeQuickRedirect, false, 34389, new Class[]{View.class}, Void.TYPE).isSupported) {
                return;
            }
            GameStorePurchaseShareActivity.O1(GameStorePurchaseShareActivity.this);
            com.max.hbshare.d.D(((BaseActivity) GameStorePurchaseShareActivity.this).f66601b, this.f85104b);
        }
    }

    public class i implements View.OnClickListener {
        public static ChangeQuickRedirect changeQuickRedirect;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ HBShareData f85106b;

        i(HBShareData hBShareData) {
            this.f85106b = hBShareData;
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            if (PatchProxy.proxy(new Object[]{view}, this, changeQuickRedirect, false, 34390, new Class[]{View.class}, Void.TYPE).isSupported) {
                return;
            }
            GameStorePurchaseShareActivity.O1(GameStorePurchaseShareActivity.this);
            com.max.hbshare.d.C(((BaseActivity) GameStorePurchaseShareActivity.this).f66601b, this.f85106b);
        }
    }

    public class j implements View.OnClickListener {
        public static ChangeQuickRedirect changeQuickRedirect;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ HBShareData f85108b;

        j(HBShareData hBShareData) {
            this.f85108b = hBShareData;
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            if (PatchProxy.proxy(new Object[]{view}, this, changeQuickRedirect, false, 34391, new Class[]{View.class}, Void.TYPE).isSupported) {
                return;
            }
            GameStorePurchaseShareActivity.O1(GameStorePurchaseShareActivity.this);
            com.max.hbshare.d.z(((BaseActivity) GameStorePurchaseShareActivity.this).f66601b, this.f85108b);
        }
    }

    public GameStorePurchaseShareActivity() {
        a aVar = new a();
        this.Y = aVar;
        this.Z = new com.max.hbshare.c.b(com.max.hbshare.c.f72545a, aVar);
    }

    static /* synthetic */ void M1(GameStorePurchaseShareActivity gameStorePurchaseShareActivity) {
        if (PatchProxy.proxy(new Object[]{gameStorePurchaseShareActivity}, null, changeQuickRedirect, true, 34373, new Class[]{GameStorePurchaseShareActivity.class}, Void.TYPE).isSupported) {
            return;
        }
        gameStorePurchaseShareActivity.h2();
    }

    static /* synthetic */ void O1(GameStorePurchaseShareActivity gameStorePurchaseShareActivity) {
        if (PatchProxy.proxy(new Object[]{gameStorePurchaseShareActivity}, null, changeQuickRedirect, true, 34376, new Class[]{GameStorePurchaseShareActivity.class}, Void.TYPE).isSupported) {
            return;
        }
        gameStorePurchaseShareActivity.i2();
    }

    static /* synthetic */ void Y1(GameStorePurchaseShareActivity gameStorePurchaseShareActivity) {
        if (PatchProxy.proxy(new Object[]{gameStorePurchaseShareActivity}, null, changeQuickRedirect, true, 34374, new Class[]{GameStorePurchaseShareActivity.class}, Void.TYPE).isSupported) {
            return;
        }
        gameStorePurchaseShareActivity.C1();
    }

    static /* synthetic */ void Z1(GameStorePurchaseShareActivity gameStorePurchaseShareActivity, GamePurchaseResultObj gamePurchaseResultObj) {
        if (PatchProxy.proxy(new Object[]{gameStorePurchaseShareActivity, gamePurchaseResultObj}, null, changeQuickRedirect, true, 34375, new Class[]{GameStorePurchaseShareActivity.class, GamePurchaseResultObj.class}, Void.TYPE).isSupported) {
            return;
        }
        gameStorePurchaseShareActivity.j2(gamePurchaseResultObj);
    }

    private void e2(ShareInfoObj shareInfoObj, ImageView imageView, ImageView imageView2, ImageView imageView3) {
        if (PatchProxy.proxy(new Object[]{shareInfoObj, imageView, imageView2, imageView3}, this, changeQuickRedirect, false, 34366, new Class[]{ShareInfoObj.class, ImageView.class, ImageView.class, ImageView.class}, Void.TYPE).isSupported || shareInfoObj == null) {
            return;
        }
        HBShareData hBShareData = new HBShareData(false, true, shareInfoObj.getShare_title(), shareInfoObj.getShare_desc(), shareInfoObj.getShare_url(), null, !com.max.hbcommon.utils.c.u(shareInfoObj.getShare_img()) ? new UMImage(this.f66601b, shareInfoObj.getShare_img()) : new UMImage(this.f66601b, R.drawable.share_thumbnail), this.Z);
        imageView.setOnClickListener(new h(hBShareData));
        imageView2.setOnClickListener(new i(hBShareData));
        imageView3.setOnClickListener(new j(hBShareData));
    }

    public static Intent f2(Context context, String str, String str2) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{context, str, str2}, null, changeQuickRedirect, true, 34362, new Class[]{Context.class, String.class, String.class}, Intent.class);
        if (patchProxyResultProxy.isSupported) {
            return (Intent) patchProxyResultProxy.result;
        }
        Intent intent = new Intent(context, (Class<?>) GameStorePurchaseShareActivity.class);
        intent.putExtra("order_id", str);
        intent.putExtra("buy_type", str2);
        return intent;
    }

    private void h2() {
        if (PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 34364, new Class[0], Void.TYPE).isSupported) {
            return;
        }
        V((io.reactivex.disposables.b) com.max.xiaoheihe.network.i.a().s1(this.T).I5(io.reactivex.schedulers.b.d()).a4(io.reactivex.android.schedulers.a.c()).J5(new f()));
    }

    private void i2() {
        Dialog dialog;
        if (PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 34368, new Class[0], Void.TYPE).isSupported || this.f66601b.isFinishing() || (dialog = this.X) == null) {
            return;
        }
        dialog.dismiss();
    }

    private void j2(GamePurchaseResultObj gamePurchaseResultObj) {
        if (PatchProxy.proxy(new Object[]{gamePurchaseResultObj}, this, changeQuickRedirect, false, 34365, new Class[]{GamePurchaseResultObj.class}, Void.TYPE).isSupported) {
            return;
        }
        x1();
        int iL = ViewUtils.L(this.f66601b) - ViewUtils.f(this.f66601b, 40.0f);
        int i10 = (int) (((iL * 156.0f) / 335.0f) + 0.5f);
        ViewGroup.LayoutParams layoutParams = this.L.getLayoutParams();
        if (layoutParams.width != iL || layoutParams.height != i10) {
            layoutParams.width = iL;
            layoutParams.height = i10;
            this.L.setLayoutParams(layoutParams);
        }
        com.max.hbimage.b.L(gamePurchaseResultObj.getGame_img(), this.L, R.drawable.common_default_placeholder_375x210);
        this.M.setText(String.format(getString(R.string.purchase_succeed_desc_format), gamePurchaseResultObj.getGame_name()));
        if ("cdkey".equalsIgnoreCase(this.U)) {
            this.N.setText(getString(R.string.purchase_cdkey_succeed_tips));
        } else if ("gift".equalsIgnoreCase(this.U)) {
            this.N.setText(getString(R.string.please_goto_steam_store));
        } else {
            this.N.setText((CharSequence) null);
        }
        ShareInfoObj share_info = gamePurchaseResultObj.getShare_info();
        if (share_info != null) {
            this.O.setVisibility(0);
            this.S.setVisibility(0);
            e2(share_info, this.P, this.Q, this.R);
            if (this.X == null) {
                this.X = k2(share_info);
            }
        } else {
            this.O.setVisibility(8);
            this.S.setVisibility(8);
        }
        List<GameStoreItemObj> recommend_list = gamePurchaseResultObj.getRecommend_list();
        if (recommend_list != null) {
            this.V.clear();
            this.V.addAll(recommend_list);
        }
        this.W.notifyDataSetChanged();
        if (!"cdkey".equalsIgnoreCase(this.U)) {
            this.mActivateTextView.setVisibility(8);
        } else {
            this.mActivateTextView.setText(getString(R.string.go_to_activate));
            this.mActivateTextView.setOnClickListener(new g());
        }
    }

    private Dialog k2(ShareInfoObj shareInfoObj) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{shareInfoObj}, this, changeQuickRedirect, false, 34367, new Class[]{ShareInfoObj.class}, Dialog.class);
        if (patchProxyResultProxy.isSupported) {
            return (Dialog) patchProxyResultProxy.result;
        }
        if (this.f66601b.isFinishing()) {
            return null;
        }
        View viewInflate = this.f66602c.inflate(R.layout.dialog_game_store_purchase_share, (ViewGroup) null);
        viewInflate.setLayoutParams(new ViewGroup.LayoutParams(-1, -2));
        e2(shareInfoObj, (ImageView) viewInflate.findViewById(R.id.iv_share_weixin_circle), (ImageView) viewInflate.findViewById(R.id.iv_share_weixin), (ImageView) viewInflate.findViewById(R.id.iv_share_qq));
        return new com.max.hbcommon.view.a.f(this.f66601b).y(getString(R.string.game_store_purchase_share_tips)).i(viewInflate).B(true).w(true).F();
    }

    @Override // com.max.hbcommon.base.BaseActivity
    public void k1() {
        if (PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 34363, new Class[0], Void.TYPE).isSupported) {
            return;
        }
        setContentView(R.layout.activity_game_store_purchase_share);
        ButterKnife.a(this);
        this.T = getIntent().getStringExtra("order_id");
        this.U = getIntent().getStringExtra("buy_type");
        this.f66616q.setTitle(getString(R.string.purchase_succeed));
        this.f66617r.setVisibility(0);
        this.f66616q.getAppbarNavButtonView().setOnClickListener(new b());
        this.mRefreshLayout.S(new c());
        this.mRefreshLayout.b0(false);
        this.mRecyclerView.setBackgroundDrawable(getResources().getDrawable(R.color.white));
        this.mRecyclerView.setLayoutManager(new GridLayoutManager(this.f66601b, 2));
        this.mRecyclerView.addItemDecoration(new d());
        this.W = new com.max.hbcommon.base.adapter.t(new e(this.f66601b, this.V, R.layout.component_game_medium));
        View viewInflate = this.f66602c.inflate(R.layout.item_game_store_purchase_share_header, (ViewGroup) this.mRecyclerView, false);
        this.L = (ImageView) viewInflate.findViewById(R.id.iv_game_img);
        this.M = (TextView) viewInflate.findViewById(R.id.tv_share_desc);
        this.N = (TextView) viewInflate.findViewById(R.id.tv_share_tips);
        this.O = viewInflate.findViewById(R.id.vg_weixin_share_container);
        this.P = (ImageView) viewInflate.findViewById(R.id.iv_share_weixin_circle);
        this.Q = (ImageView) viewInflate.findViewById(R.id.iv_share_weixin);
        this.R = (ImageView) viewInflate.findViewById(R.id.iv_share_qq);
        this.S = (TextView) viewInflate.findViewById(R.id.tv_weixin_share_desc);
        this.W.p(R.layout.item_game_store_purchase_share_header, viewInflate);
        this.mRecyclerView.setAdapter(this.W);
        E1();
        h2();
    }

    @Override // com.max.hbcommon.base.BaseActivity
    public void n1() {
        if (PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 34372, new Class[0], Void.TYPE).isSupported) {
            return;
        }
        E1();
        h2();
    }

    @Override // androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, android.app.Activity
    public void onActivityResult(int i10, int i11, Intent intent) {
        Object[] objArr = {new Integer(i10), new Integer(i11), intent};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        Class cls = Integer.TYPE;
        if (PatchProxy.proxy(objArr, this, changeQuickRedirect2, false, 34369, new Class[]{cls, cls, Intent.class}, Void.TYPE).isSupported) {
            return;
        }
        super.onActivityResult(i10, i11, intent);
        UMShareAPI.get(this.f66601b).onActivityResult(i10, i11, intent);
    }

    @Override // androidx.activity.ComponentActivity, android.app.Activity
    public void onBackPressed() {
        if (PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 34371, new Class[0], Void.TYPE).isSupported) {
            return;
        }
        String strO = com.max.hbcache.c.o(f85087a0, "");
        if ("game_detail".equals(strO)) {
            com.max.hbcache.c.C(f85087a0, "");
            Intent intent = new Intent(this.f66601b, (Class<?>) ChannelsDetailActivity.class);
            intent.addFlags(603979776);
            startActivity(intent);
            return;
        }
        if (f85090p1.equals(strO)) {
            com.max.hbcache.c.C(f85087a0, "");
            Intent intent2 = new Intent(this.f66601b, (Class<?>) GameStoreActivity.class);
            intent2.addFlags(603979776);
            startActivity(intent2);
            return;
        }
        if (!f85092x1.equals(strO)) {
            super.onBackPressed();
            return;
        }
        com.max.hbcache.c.C(f85087a0, "");
        Intent intent3 = new Intent(this.f66601b, (Class<?>) GameWishListActivity.class);
        intent3.addFlags(603979776);
        startActivity(intent3);
    }

    @Override // com.max.hbcommon.base.BaseActivity, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, android.app.Activity
    public void onDestroy() {
        if (PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 34370, new Class[0], Void.TYPE).isSupported) {
            return;
        }
        UMShareAPI.get(this).release();
        super.onDestroy();
    }
}
