package com.max.xiaoheihe.module.game;

import android.content.Context;
import android.content.Intent;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import butterknife.BindView;
import butterknife.ButterKnife;
import com.google.android.material.appbar.AppBarLayout;
import com.google.android.material.appbar.CollapsingToolbarLayout;
import com.max.hbcommon.base.BaseActivity;
import com.max.hbcommon.component.TitleBar;
import com.max.hbutils.bean.Result;
import com.max.hbutils.utils.ViewUtils;
import com.max.xiaoheihe.R;
import com.max.xiaoheihe.bean.game.GameDeveloperObj;
import com.max.xiaoheihe.bean.game.GameObj;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.PatchProxyResult;
import com.scwang.smartrefresh.layout.SmartRefreshLayout;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes11.dex */
public class GameDeveloperDetailActivity extends BaseActivity {
    private static final String S = "developer_id";
    public static ChangeQuickRedirect changeQuickRedirect;
    private String L;
    private int N;
    private GameDeveloperObj O;
    private com.max.xiaoheihe.module.game.adapter.u Q;

    @BindView(R.id.abl)
    AppBarLayout mAppBarLayout;

    @BindView(R.id.iv_bg_img)
    ImageView mBGImageView;

    @BindView(R.id.ctl)
    CollapsingToolbarLayout mCollapsingToolbarLayout;

    @BindView(R.id.tv_desc)
    TextView mDescTextView;

    @BindView(R.id.tv_follow_state)
    TextView mFollowStateTextView;

    @BindView(R.id.vg_header_container)
    View mHeaderContainerView;

    @BindView(R.id.iv_img)
    ImageView mImgImageView;

    @BindView(R.id.tv_name)
    TextView mNameTextView;

    @BindView(R.id.rv)
    RecyclerView mRecyclerView;

    @BindView(R.id.srl)
    SmartRefreshLayout mRefreshLayout;

    @BindView(R.id.toolbar)
    TitleBar mToolbar;
    private boolean M = true;
    private List<GameObj> P = new ArrayList();
    private a2 R = new a2();

    public class a implements AppBarLayout.f {
        public static ChangeQuickRedirect changeQuickRedirect;

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ int f84431a;

        a(int i10) {
            this.f84431a = i10;
        }

        @Override // com.google.android.material.appbar.AppBarLayout.f, com.google.android.material.appbar.AppBarLayout.b
        public void a(AppBarLayout appBarLayout, int i10) {
            if (PatchProxy.proxy(new Object[]{appBarLayout, new Integer(i10)}, this, changeQuickRedirect, false, 33016, new Class[]{AppBarLayout.class, Integer.TYPE}, Void.TYPE).isSupported) {
                return;
            }
            if (Math.abs(i10) >= appBarLayout.getTotalScrollRange()) {
                if (GameDeveloperDetailActivity.this.M) {
                    GameDeveloperDetailActivity.this.mToolbar.setBackgroundColor(this.f84431a);
                    GameDeveloperDetailActivity.this.mToolbar.getAppbarTitleTextView().setAlpha(1.0f);
                    if (com.max.hbutils.utils.t.M(((BaseActivity) GameDeveloperDetailActivity.this).f66601b, com.max.xiaoheihe.utils.d.M0(this.f84431a))) {
                        com.max.hbutils.utils.t.A(((BaseActivity) GameDeveloperDetailActivity.this).f66601b, this.f84431a, 0);
                    } else {
                        com.max.hbutils.utils.t.z(((BaseActivity) GameDeveloperDetailActivity.this).f66601b, this.f84431a);
                    }
                }
                GameDeveloperDetailActivity.this.M = false;
                return;
            }
            if (GameDeveloperDetailActivity.this.M) {
                return;
            }
            GameDeveloperDetailActivity gameDeveloperDetailActivity = GameDeveloperDetailActivity.this;
            gameDeveloperDetailActivity.mToolbar.setBackgroundColor(((BaseActivity) gameDeveloperDetailActivity).f66601b.getResources().getColor(R.color.transparent));
            GameDeveloperDetailActivity.this.mToolbar.getAppbarTitleTextView().setAlpha(0.0f);
            com.max.hbutils.utils.t.X(((BaseActivity) GameDeveloperDetailActivity.this).f66601b, 0, GameDeveloperDetailActivity.this.mToolbar);
            GameDeveloperDetailActivity.this.M = true;
        }
    }

    public class b implements pg.d {
        public static ChangeQuickRedirect changeQuickRedirect;

        b() {
        }

        @Override // pg.d
        public void k(ng.j jVar) {
            if (PatchProxy.proxy(new Object[]{jVar}, this, changeQuickRedirect, false, 33017, new Class[]{ng.j.class}, Void.TYPE).isSupported) {
                return;
            }
            GameDeveloperDetailActivity.this.N = 0;
            GameDeveloperDetailActivity.j2(GameDeveloperDetailActivity.this);
        }
    }

    public class c implements pg.b {
        public static ChangeQuickRedirect changeQuickRedirect;

        c() {
        }

        @Override // pg.b
        public void f(ng.j jVar) {
            if (PatchProxy.proxy(new Object[]{jVar}, this, changeQuickRedirect, false, 33018, new Class[]{ng.j.class}, Void.TYPE).isSupported) {
                return;
            }
            GameDeveloperDetailActivity.i2(GameDeveloperDetailActivity.this, 30);
            GameDeveloperDetailActivity.j2(GameDeveloperDetailActivity.this);
        }
    }

    public class d extends com.max.hbcommon.network.d<Result<GameDeveloperObj>> {
        public static ChangeQuickRedirect changeQuickRedirect;

        d() {
        }

        @Override // com.max.hbcommon.network.d, io.reactivex.g0
        public void onComplete() {
            if (!PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 33019, new Class[0], Void.TYPE).isSupported && GameDeveloperDetailActivity.this.isActive()) {
                super.onComplete();
                GameDeveloperDetailActivity.this.mRefreshLayout.A(0);
                GameDeveloperDetailActivity.this.mRefreshLayout.p(0);
            }
        }

        @Override // com.max.hbcommon.network.d, io.reactivex.g0
        public void onError(Throwable th2) {
            if (!PatchProxy.proxy(new Object[]{th2}, this, changeQuickRedirect, false, 33020, new Class[]{Throwable.class}, Void.TYPE).isSupported && GameDeveloperDetailActivity.this.isActive()) {
                super.onError(th2);
                GameDeveloperDetailActivity.k2(GameDeveloperDetailActivity.this);
                GameDeveloperDetailActivity.this.mRefreshLayout.A(0);
                GameDeveloperDetailActivity.this.mRefreshLayout.p(0);
            }
        }

        public void onNext(Result<GameDeveloperObj> result) {
            if (!PatchProxy.proxy(new Object[]{result}, this, changeQuickRedirect, false, 33021, new Class[]{Result.class}, Void.TYPE).isSupported && GameDeveloperDetailActivity.this.isActive()) {
                super.onNext(result);
                GameDeveloperDetailActivity.l2(GameDeveloperDetailActivity.this, result.getResult());
            }
        }

        @Override // com.max.hbcommon.network.d, io.reactivex.g0
        public /* bridge */ /* synthetic */ void onNext(Object obj) {
            if (PatchProxy.proxy(new Object[]{obj}, this, changeQuickRedirect, false, 33022, new Class[]{Object.class}, Void.TYPE).isSupported) {
                return;
            }
            onNext((Result<GameDeveloperObj>) obj);
        }
    }

    public class e extends com.max.hbcommon.network.d<Result> {
        public static ChangeQuickRedirect changeQuickRedirect;

        e() {
        }

        @Override // com.max.hbcommon.network.d, io.reactivex.g0
        public void onError(Throwable th2) {
            if (!PatchProxy.proxy(new Object[]{th2}, this, changeQuickRedirect, false, 33023, new Class[]{Throwable.class}, Void.TYPE).isSupported && GameDeveloperDetailActivity.this.isActive()) {
                super.onError(th2);
                com.max.hbutils.utils.c cVar = com.max.hbutils.utils.c.f73533a;
                com.max.hbutils.utils.c.f(GameDeveloperDetailActivity.this.getString(R.string.fail));
                GameDeveloperDetailActivity.Q1(GameDeveloperDetailActivity.this);
            }
        }

        public void onNext(Result result) {
            if (!PatchProxy.proxy(new Object[]{result}, this, changeQuickRedirect, false, 33024, new Class[]{Result.class}, Void.TYPE).isSupported && GameDeveloperDetailActivity.this.isActive()) {
                if (com.max.hbcommon.utils.c.u(result.getMsg())) {
                    com.max.hbutils.utils.c cVar = com.max.hbutils.utils.c.f73533a;
                    com.max.hbutils.utils.c.f(GameDeveloperDetailActivity.this.getString(R.string.success));
                } else {
                    com.max.hbutils.utils.c cVar2 = com.max.hbutils.utils.c.f73533a;
                    com.max.hbutils.utils.c.f(result.getMsg());
                }
                super.onNext(result);
                GameDeveloperDetailActivity.this.O.setFollow_state("following");
                com.max.xiaoheihe.utils.d.x1(((BaseActivity) GameDeveloperDetailActivity.this).f66601b);
            }
        }

        @Override // com.max.hbcommon.network.d, io.reactivex.g0
        public /* bridge */ /* synthetic */ void onNext(Object obj) {
            if (PatchProxy.proxy(new Object[]{obj}, this, changeQuickRedirect, false, 33025, new Class[]{Object.class}, Void.TYPE).isSupported) {
                return;
            }
            onNext((Result) obj);
        }
    }

    public class f extends com.max.hbcommon.network.d<Result> {
        public static ChangeQuickRedirect changeQuickRedirect;

        f() {
        }

        @Override // com.max.hbcommon.network.d, io.reactivex.g0
        public void onError(Throwable th2) {
            if (!PatchProxy.proxy(new Object[]{th2}, this, changeQuickRedirect, false, 33026, new Class[]{Throwable.class}, Void.TYPE).isSupported && GameDeveloperDetailActivity.this.isActive()) {
                super.onError(th2);
                com.max.hbutils.utils.c cVar = com.max.hbutils.utils.c.f73533a;
                com.max.hbutils.utils.c.f(GameDeveloperDetailActivity.this.getString(R.string.fail));
                GameDeveloperDetailActivity.Q1(GameDeveloperDetailActivity.this);
            }
        }

        public void onNext(Result result) {
            if (!PatchProxy.proxy(new Object[]{result}, this, changeQuickRedirect, false, 33027, new Class[]{Result.class}, Void.TYPE).isSupported && GameDeveloperDetailActivity.this.isActive()) {
                if (com.max.hbcommon.utils.c.u(result.getMsg())) {
                    com.max.hbutils.utils.c cVar = com.max.hbutils.utils.c.f73533a;
                    com.max.hbutils.utils.c.f(GameDeveloperDetailActivity.this.getString(R.string.success));
                } else {
                    com.max.hbutils.utils.c cVar2 = com.max.hbutils.utils.c.f73533a;
                    com.max.hbutils.utils.c.f(result.getMsg());
                }
                super.onNext(result);
                GameDeveloperDetailActivity.this.O.setFollow_state("unfollowing");
                com.max.xiaoheihe.utils.d.x1(((BaseActivity) GameDeveloperDetailActivity.this).f66601b);
            }
        }

        @Override // com.max.hbcommon.network.d, io.reactivex.g0
        public /* bridge */ /* synthetic */ void onNext(Object obj) {
            if (PatchProxy.proxy(new Object[]{obj}, this, changeQuickRedirect, false, 33028, new Class[]{Object.class}, Void.TYPE).isSupported) {
                return;
            }
            onNext((Result) obj);
        }
    }

    public class g implements View.OnClickListener {
        public static ChangeQuickRedirect changeQuickRedirect;

        g() {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            if (!PatchProxy.proxy(new Object[]{view}, this, changeQuickRedirect, false, 33029, new Class[]{View.class}, Void.TYPE).isSupported && com.max.xiaoheihe.utils.i0.e(((BaseActivity) GameDeveloperDetailActivity.this).f66601b)) {
                if ("unfollowing".equalsIgnoreCase(GameDeveloperDetailActivity.this.O.getFollow_state())) {
                    GameDeveloperDetailActivity.X1(GameDeveloperDetailActivity.this, true);
                    GameDeveloperDetailActivity gameDeveloperDetailActivity = GameDeveloperDetailActivity.this;
                    GameDeveloperDetailActivity.Z1(gameDeveloperDetailActivity, gameDeveloperDetailActivity.L);
                } else {
                    GameDeveloperDetailActivity.X1(GameDeveloperDetailActivity.this, false);
                    GameDeveloperDetailActivity gameDeveloperDetailActivity2 = GameDeveloperDetailActivity.this;
                    GameDeveloperDetailActivity.a2(gameDeveloperDetailActivity2, gameDeveloperDetailActivity2.L);
                }
            }
        }
    }

    static /* synthetic */ void Q1(GameDeveloperDetailActivity gameDeveloperDetailActivity) {
        if (PatchProxy.proxy(new Object[]{gameDeveloperDetailActivity}, null, changeQuickRedirect, true, 33012, new Class[]{GameDeveloperDetailActivity.class}, Void.TYPE).isSupported) {
            return;
        }
        gameDeveloperDetailActivity.q2();
    }

    static /* synthetic */ void X1(GameDeveloperDetailActivity gameDeveloperDetailActivity, boolean z10) {
        if (PatchProxy.proxy(new Object[]{gameDeveloperDetailActivity, new Byte(z10 ? (byte) 1 : (byte) 0)}, null, changeQuickRedirect, true, 33013, new Class[]{GameDeveloperDetailActivity.class, Boolean.TYPE}, Void.TYPE).isSupported) {
            return;
        }
        gameDeveloperDetailActivity.r2(z10);
    }

    static /* synthetic */ void Z1(GameDeveloperDetailActivity gameDeveloperDetailActivity, String str) {
        if (PatchProxy.proxy(new Object[]{gameDeveloperDetailActivity, str}, null, changeQuickRedirect, true, 33014, new Class[]{GameDeveloperDetailActivity.class, String.class}, Void.TYPE).isSupported) {
            return;
        }
        gameDeveloperDetailActivity.m2(str);
    }

    static /* synthetic */ void a2(GameDeveloperDetailActivity gameDeveloperDetailActivity, String str) {
        if (PatchProxy.proxy(new Object[]{gameDeveloperDetailActivity, str}, null, changeQuickRedirect, true, 33015, new Class[]{GameDeveloperDetailActivity.class, String.class}, Void.TYPE).isSupported) {
            return;
        }
        gameDeveloperDetailActivity.u2(str);
    }

    static /* synthetic */ int i2(GameDeveloperDetailActivity gameDeveloperDetailActivity, int i10) {
        int i11 = gameDeveloperDetailActivity.N + i10;
        gameDeveloperDetailActivity.N = i11;
        return i11;
    }

    static /* synthetic */ void j2(GameDeveloperDetailActivity gameDeveloperDetailActivity) {
        if (PatchProxy.proxy(new Object[]{gameDeveloperDetailActivity}, null, changeQuickRedirect, true, 33009, new Class[]{GameDeveloperDetailActivity.class}, Void.TYPE).isSupported) {
            return;
        }
        gameDeveloperDetailActivity.n2();
    }

    static /* synthetic */ void k2(GameDeveloperDetailActivity gameDeveloperDetailActivity) {
        if (PatchProxy.proxy(new Object[]{gameDeveloperDetailActivity}, null, changeQuickRedirect, true, 33010, new Class[]{GameDeveloperDetailActivity.class}, Void.TYPE).isSupported) {
            return;
        }
        gameDeveloperDetailActivity.C1();
    }

    static /* synthetic */ void l2(GameDeveloperDetailActivity gameDeveloperDetailActivity, GameDeveloperObj gameDeveloperObj) {
        if (PatchProxy.proxy(new Object[]{gameDeveloperDetailActivity, gameDeveloperObj}, null, changeQuickRedirect, true, 33011, new Class[]{GameDeveloperDetailActivity.class, GameDeveloperObj.class}, Void.TYPE).isSupported) {
            return;
        }
        gameDeveloperDetailActivity.p2(gameDeveloperObj);
    }

    private void m2(String str) {
        if (PatchProxy.proxy(new Object[]{str}, this, changeQuickRedirect, false, 33002, new Class[]{String.class}, Void.TYPE).isSupported) {
            return;
        }
        V((io.reactivex.disposables.b) com.max.xiaoheihe.network.i.a().C5(str).I5(io.reactivex.schedulers.b.d()).a4(io.reactivex.android.schedulers.a.c()).J5(new e()));
    }

    private void n2() {
        if (PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 33001, new Class[0], Void.TYPE).isSupported) {
            return;
        }
        V((io.reactivex.disposables.b) com.max.xiaoheihe.network.i.a().Va(this.L, this.N, 30).I5(io.reactivex.schedulers.b.d()).a4(io.reactivex.android.schedulers.a.c()).J5(new d()));
    }

    public static Intent o2(Context context, String str) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{context, str}, null, changeQuickRedirect, true, 32999, new Class[]{Context.class, String.class}, Intent.class);
        if (patchProxyResultProxy.isSupported) {
            return (Intent) patchProxyResultProxy.result;
        }
        Intent intent = new Intent(context, (Class<?>) GameDeveloperDetailActivity.class);
        intent.putExtra(S, str);
        return intent;
    }

    private void p2(GameDeveloperObj gameDeveloperObj) {
        if (PatchProxy.proxy(new Object[]{gameDeveloperObj}, this, changeQuickRedirect, false, 33004, new Class[]{GameDeveloperObj.class}, Void.TYPE).isSupported) {
            return;
        }
        x1();
        this.O = gameDeveloperObj;
        if (gameDeveloperObj != null) {
            com.max.hbimage.b.L(gameDeveloperObj.getBg_img(), this.mBGImageView, R.drawable.common_default_placeholder_375x210);
            com.max.hbimage.b.K(gameDeveloperObj.getImg_url(), this.mImgImageView);
            this.mNameTextView.setText(gameDeveloperObj.getName());
            this.mToolbar.setTitle(gameDeveloperObj.getName());
            this.mDescTextView.setText(gameDeveloperObj.getDesc());
            q2();
            this.mFollowStateTextView.setVisibility(0);
            this.mFollowStateTextView.setOnClickListener(new g());
            if (this.N == 0) {
                this.P.clear();
            }
            if (gameDeveloperObj.getGames() != null) {
                this.P.addAll(gameDeveloperObj.getGames());
            }
            this.Q.notifyDataSetChanged();
        }
    }

    private void q2() {
        if (PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 33005, new Class[0], Void.TYPE).isSupported) {
            return;
        }
        r2("following".equalsIgnoreCase(this.O.getFollow_state()));
    }

    private void r2(boolean z10) {
        TextView textView;
        if (PatchProxy.proxy(new Object[]{new Byte(z10 ? (byte) 1 : (byte) 0)}, this, changeQuickRedirect, false, 33006, new Class[]{Boolean.TYPE}, Void.TYPE).isSupported || (textView = this.mFollowStateTextView) == null) {
            return;
        }
        if (z10) {
            textView.setText(this.f66601b.getResources().getString(R.string.has_followed));
            this.mFollowStateTextView.setBackgroundDrawable(ViewUtils.H(ViewUtils.f(this.f66601b, 2.0f), this.f66601b.getResources().getColor(R.color.white_alpha20), this.f66601b.getResources().getColor(R.color.white_alpha20)));
            this.mFollowStateTextView.setTextColor(this.f66601b.getResources().getColor(R.color.white));
        } else {
            textView.setText(this.f66601b.getResources().getString(R.string.follow));
            this.mFollowStateTextView.setBackgroundDrawable(ViewUtils.H(ViewUtils.f(this.f66601b, 2.0f), this.f66601b.getResources().getColor(R.color.white), this.f66601b.getResources().getColor(R.color.white)));
            this.mFollowStateTextView.setTextColor(this.f66601b.getResources().getColor(R.color.text_primary_1_color));
        }
    }

    private void u2(String str) {
        if (PatchProxy.proxy(new Object[]{str}, this, changeQuickRedirect, false, 33003, new Class[]{String.class}, Void.TYPE).isSupported) {
            return;
        }
        V((io.reactivex.disposables.b) com.max.xiaoheihe.network.i.a().a0(str).I5(io.reactivex.schedulers.b.d()).a4(io.reactivex.android.schedulers.a.c()).J5(new f()));
    }

    @Override // com.max.hbcommon.base.BaseActivity
    public void k1() {
        if (PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 33000, new Class[0], Void.TYPE).isSupported) {
            return;
        }
        setContentView(R.layout.activity_game_developer_detail);
        this.L = getIntent().getStringExtra(S);
        ButterKnife.a(this);
        int color = this.f66601b.getResources().getColor(R.color.text_primary_1_color);
        this.mToolbar.getAppbarTitleTextView().setAlpha(0.0f);
        this.mToolbar.getAppbarNavButtonView().setAlpha(0);
        ViewGroup.LayoutParams layoutParams = this.mHeaderContainerView.getLayoutParams();
        int iM = ViewUtils.M() + ViewUtils.f(this.f66601b, 140.0f);
        if (layoutParams.height != iM) {
            layoutParams.height = iM;
            this.mHeaderContainerView.setLayoutParams(layoutParams);
        }
        this.mToolbar.setVisibility(0);
        this.mToolbar.a0();
        this.mToolbar.getAppbarTitleTextView().setAlpha(0.0f);
        this.mToolbar.getAppbarNavButtonView().setAlpha(255);
        this.mToolbar.getAppbarActionButtonView().setColorFilter(this.f66601b.getResources().getColor(R.color.white));
        this.mToolbar.setNavigationIcon(this.f66601b.getResources().getDrawable(R.drawable.common_arrow_single_10x18));
        this.mToolbar.setTitleTextColor(this.f66601b.getResources().getColor(R.color.white));
        AppBarLayout.LayoutParams layoutParams2 = (AppBarLayout.LayoutParams) this.mCollapsingToolbarLayout.getLayoutParams();
        layoutParams2.h(3);
        this.mCollapsingToolbarLayout.setLayoutParams(layoutParams2);
        com.max.hbutils.utils.t.X(this.f66601b, 0, this.mToolbar);
        this.mAppBarLayout.e(new a(color));
        this.mRecyclerView.setClipToPadding(false);
        this.mRecyclerView.setClipChildren(false);
        this.mRecyclerView.setPadding(0, ViewUtils.f(this.f66601b, 4.0f), 0, ViewUtils.f(this.f66601b, 4.0f));
        this.mRecyclerView.setLayoutManager(new LinearLayoutManager(this.f66601b));
        com.max.xiaoheihe.module.game.adapter.u uVar = new com.max.xiaoheihe.module.game.adapter.u(this.f66601b, this.P, this.R, null);
        this.Q = uVar;
        this.mRecyclerView.setAdapter(uVar);
        this.mRefreshLayout.S(new b());
        this.mRefreshLayout.f0(new c());
        E1();
        n2();
    }

    @Override // com.max.hbcommon.base.BaseActivity
    public void n1() {
        if (PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 33007, new Class[0], Void.TYPE).isSupported) {
            return;
        }
        E1();
        n2();
    }

    @Override // com.max.hbcommon.base.BaseActivity, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, android.app.Activity
    public void onDestroy() {
        if (PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 33008, new Class[0], Void.TYPE).isSupported) {
            return;
        }
        super.onDestroy();
        this.R.f();
    }
}
