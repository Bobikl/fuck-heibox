package com.max.xiaoheihe.module.game;

import android.content.Context;
import android.content.Intent;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import butterknife.BindView;
import butterknife.ButterKnife;
import com.max.hbcommon.base.BaseActivity;
import com.max.hbcommon.bean.KeyDescObj;
import com.max.hbcommon.component.TitleBar;
import com.max.hbutils.bean.Result;
import com.max.hbutils.utils.ViewUtils;
import com.max.xiaoheihe.R;
import com.max.xiaoheihe.bean.game.GameListObj;
import com.max.xiaoheihe.bean.game.GameObj;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.PatchProxyResult;
import com.scwang.smartrefresh.layout.SmartRefreshLayout;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes11.dex */
public class GameListActivity extends BaseActivity {
    private static final String U = "steam_appid";
    private static final String V = "bundle_id";
    private static final String W = "tag";
    private static final String X = "page_type";
    private static final String Y = "publisher";
    private static final int Z = 0;

    /* JADX INFO: renamed from: a0, reason: collision with root package name */
    private static final int f84484a0 = 1;

    /* JADX INFO: renamed from: b0, reason: collision with root package name */
    private static final int f84485b0 = 2;

    /* JADX INFO: renamed from: c0, reason: collision with root package name */
    private static final int f84486c0 = 3;
    public static ChangeQuickRedirect changeQuickRedirect;
    private int L;
    private String M;
    private KeyDescObj N;
    private String O;
    private KeyDescObj P;
    private com.max.hbcommon.base.adapter.s<GameObj> R;
    private int S;

    @BindView(R.id.rv)
    RecyclerView mRecyclerView;

    @BindView(R.id.srl)
    SmartRefreshLayout mRefreshLayout;
    private List<GameObj> Q = new ArrayList();
    private a2 T = new a2();

    public class a implements pg.d {
        public static ChangeQuickRedirect changeQuickRedirect;

        a() {
        }

        @Override // pg.d
        public void k(ng.j jVar) {
            if (PatchProxy.proxy(new Object[]{jVar}, this, changeQuickRedirect, false, 33209, new Class[]{ng.j.class}, Void.TYPE).isSupported) {
                return;
            }
            GameListActivity.this.S = 0;
            GameListActivity.O1(GameListActivity.this);
        }
    }

    public class b implements pg.b {
        public static ChangeQuickRedirect changeQuickRedirect;

        b() {
        }

        @Override // pg.b
        public void f(ng.j jVar) {
            if (PatchProxy.proxy(new Object[]{jVar}, this, changeQuickRedirect, false, 33210, new Class[]{ng.j.class}, Void.TYPE).isSupported) {
                return;
            }
            GameListActivity.N1(GameListActivity.this, 30);
            GameListActivity.O1(GameListActivity.this);
        }
    }

    public class c extends com.max.hbcommon.network.d<Result<GameListObj>> {
        public static ChangeQuickRedirect changeQuickRedirect;

        c() {
        }

        @Override // com.max.hbcommon.network.d, io.reactivex.g0
        public void onComplete() {
            if (!PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 33212, new Class[0], Void.TYPE).isSupported && GameListActivity.this.isActive()) {
                super.onComplete();
                GameListActivity.this.mRefreshLayout.A(0);
                GameListActivity.this.mRefreshLayout.p(0);
            }
        }

        @Override // com.max.hbcommon.network.d, io.reactivex.g0
        public void onError(Throwable th2) {
            if (!PatchProxy.proxy(new Object[]{th2}, this, changeQuickRedirect, false, 33211, new Class[]{Throwable.class}, Void.TYPE).isSupported && GameListActivity.this.isActive()) {
                super.onError(th2);
                GameListActivity.Q1(GameListActivity.this);
                GameListActivity.this.mRefreshLayout.A(0);
                GameListActivity.this.mRefreshLayout.p(0);
            }
        }

        public void onNext(Result<GameListObj> result) {
            if (!PatchProxy.proxy(new Object[]{result}, this, changeQuickRedirect, false, 33213, new Class[]{Result.class}, Void.TYPE).isSupported && GameListActivity.this.isActive()) {
                super.onNext(result);
                GameListActivity.R1(GameListActivity.this, result.getResult());
            }
        }

        @Override // com.max.hbcommon.network.d, io.reactivex.g0
        public /* bridge */ /* synthetic */ void onNext(Object obj) {
            if (PatchProxy.proxy(new Object[]{obj}, this, changeQuickRedirect, false, 33214, new Class[]{Object.class}, Void.TYPE).isSupported) {
                return;
            }
            onNext((Result<GameListObj>) obj);
        }
    }

    static /* synthetic */ int N1(GameListActivity gameListActivity, int i10) {
        int i11 = gameListActivity.S + i10;
        gameListActivity.S = i11;
        return i11;
    }

    static /* synthetic */ void O1(GameListActivity gameListActivity) {
        if (PatchProxy.proxy(new Object[]{gameListActivity}, null, changeQuickRedirect, true, 33206, new Class[]{GameListActivity.class}, Void.TYPE).isSupported) {
            return;
        }
        gameListActivity.V1();
    }

    static /* synthetic */ void Q1(GameListActivity gameListActivity) {
        if (PatchProxy.proxy(new Object[]{gameListActivity}, null, changeQuickRedirect, true, 33207, new Class[]{GameListActivity.class}, Void.TYPE).isSupported) {
            return;
        }
        gameListActivity.C1();
    }

    static /* synthetic */ void R1(GameListActivity gameListActivity, GameListObj gameListObj) {
        if (PatchProxy.proxy(new Object[]{gameListActivity, gameListObj}, null, changeQuickRedirect, true, 33208, new Class[]{GameListActivity.class, GameListObj.class}, Void.TYPE).isSupported) {
            return;
        }
        gameListActivity.Y1(gameListObj);
    }

    public static Intent T1(Context context, String str) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{context, str}, null, changeQuickRedirect, true, 33200, new Class[]{Context.class, String.class}, Intent.class);
        if (patchProxyResultProxy.isSupported) {
            return (Intent) patchProxyResultProxy.result;
        }
        Intent intent = new Intent(context, (Class<?>) GameListActivity.class);
        intent.putExtra(V, str);
        intent.putExtra("page_type", 2);
        return intent;
    }

    private void V1() {
        if (PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 33202, new Class[0], Void.TYPE).isSupported) {
            return;
        }
        int i10 = this.L;
        io.reactivex.z<Result<GameListObj>> zVarD3 = null;
        if (i10 == 0) {
            zVarD3 = com.max.xiaoheihe.network.i.a().D3(this.M, this.S, 30);
        } else if (i10 == 1) {
            zVarD3 = com.max.xiaoheihe.network.i.a().e4(this.M, this.N.getType(), this.N.getValue(), this.S, 30);
        } else if (i10 == 2) {
            zVarD3 = com.max.xiaoheihe.network.i.a().zb(this.O, this.S, 30);
        } else if (i10 == 3) {
            com.max.xiaoheihe.network.e eVarA = com.max.xiaoheihe.network.i.a();
            KeyDescObj keyDescObj = this.P;
            zVarD3 = eVarA.S9(keyDescObj != null ? keyDescObj.getKey() : null, this.S, 30);
        }
        if (zVarD3 != null) {
            V((io.reactivex.disposables.b) zVarD3.I5(io.reactivex.schedulers.b.d()).a4(io.reactivex.android.schedulers.a.c()).J5(new c()));
        }
    }

    public static Intent W1(Context context, String str, KeyDescObj keyDescObj) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{context, str, keyDescObj}, null, changeQuickRedirect, true, 33199, new Class[]{Context.class, String.class, KeyDescObj.class}, Intent.class);
        if (patchProxyResultProxy.isSupported) {
            return (Intent) patchProxyResultProxy.result;
        }
        Intent intent = new Intent(context, (Class<?>) GameListActivity.class);
        intent.putExtra("steam_appid", str);
        intent.putExtra(Y, keyDescObj);
        intent.putExtra("page_type", 1);
        return intent;
    }

    public static Intent X1(Context context, String str) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{context, str}, null, changeQuickRedirect, true, 33198, new Class[]{Context.class, String.class}, Intent.class);
        if (patchProxyResultProxy.isSupported) {
            return (Intent) patchProxyResultProxy.result;
        }
        Intent intent = new Intent(context, (Class<?>) GameListActivity.class);
        intent.putExtra("steam_appid", str);
        intent.putExtra("page_type", 0);
        return intent;
    }

    private void Y1(GameListObj gameListObj) {
        if (PatchProxy.proxy(new Object[]{gameListObj}, this, changeQuickRedirect, false, 33203, new Class[]{GameListObj.class}, Void.TYPE).isSupported) {
            return;
        }
        x1();
        List<GameObj> similar_games = null;
        int i10 = this.L;
        if (i10 == 0) {
            similar_games = gameListObj.getSimilar_games();
        } else if (i10 == 1) {
            similar_games = gameListObj.getPublisher_games();
        } else if (i10 == 2) {
            similar_games = gameListObj.getItems();
        } else if (i10 == 3) {
            similar_games = gameListObj.getGames();
        }
        if (similar_games != null) {
            if (this.S == 0) {
                this.Q.clear();
            }
            this.Q.addAll(similar_games);
            this.R.notifyDataSetChanged();
        }
    }

    @Override // com.max.hbcommon.base.BaseActivity
    public void k1() {
        if (PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 33201, new Class[0], Void.TYPE).isSupported) {
            return;
        }
        setContentView(R.layout.layout_sample_refresh_rv);
        ButterKnife.a(this);
        this.M = getIntent().getStringExtra("steam_appid");
        this.O = getIntent().getStringExtra(V);
        this.P = (KeyDescObj) getIntent().getSerializableExtra("tag");
        this.L = getIntent().getIntExtra("page_type", 0);
        KeyDescObj keyDescObj = (KeyDescObj) getIntent().getSerializableExtra(Y);
        this.N = keyDescObj;
        int i10 = this.L;
        if (i10 == 0) {
            this.f66616q.setTitle(getString(R.string.similar_games));
        } else if (i10 == 1) {
            this.f66616q.setTitle(!com.max.hbcommon.utils.c.u(keyDescObj.getValue()) ? this.N.getValue() : getString(R.string.publisher_games));
        } else if (i10 == 2) {
            this.f66616q.setTitle(getString(R.string.game));
        } else if (i10 == 3) {
            TitleBar titleBar = this.f66616q;
            KeyDescObj keyDescObj2 = this.P;
            titleBar.setTitle(keyDescObj2 != null ? keyDescObj2.getDesc() : getString(R.string.game));
        }
        this.f66617r.setVisibility(0);
        this.mRecyclerView.setClipToPadding(false);
        this.mRecyclerView.setClipChildren(false);
        this.mRecyclerView.setPadding(0, ViewUtils.f(this.f66601b, 4.0f), 0, 0);
        this.mRecyclerView.setLayoutManager(new LinearLayoutManager(this.f66601b, 1, false));
        com.max.xiaoheihe.module.game.adapter.u uVar = new com.max.xiaoheihe.module.game.adapter.u(this.f66601b, this.Q, this.T, null);
        this.R = uVar;
        this.mRecyclerView.setAdapter(uVar);
        this.mRefreshLayout.S(new a());
        this.mRefreshLayout.f0(new b());
        E1();
        V1();
    }

    @Override // com.max.hbcommon.base.BaseActivity
    public void n1() {
        if (PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 33204, new Class[0], Void.TYPE).isSupported) {
            return;
        }
        E1();
        this.S = 0;
        V1();
    }

    @Override // com.max.hbcommon.base.BaseActivity, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, android.app.Activity
    public void onDestroy() {
        if (PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 33205, new Class[0], Void.TYPE).isSupported) {
            return;
        }
        super.onDestroy();
        this.T.f();
    }
}
