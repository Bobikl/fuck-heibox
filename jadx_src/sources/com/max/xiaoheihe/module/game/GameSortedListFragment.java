package com.max.xiaoheihe.module.game;

import android.app.Activity;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.view.View;
import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import butterknife.BindView;
import butterknife.ButterKnife;
import com.google.gson.JsonObject;
import com.max.hbcommon.base.adapter.OneTimeValidExposureWatcher;
import com.max.hbcommon.bean.KeyDescObj;
import com.max.hbutils.bean.Result;
import com.max.hbutils.utils.ViewUtils;
import com.max.xiaoheihe.R;
import com.max.xiaoheihe.bean.StateObj;
import com.max.xiaoheihe.bean.game.GameListObj;
import com.max.xiaoheihe.bean.game.GameObj;
import com.max.xiaoheihe.module.account.GameBindingFragment;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.PatchProxyResult;
import com.scwang.smartrefresh.layout.SmartRefreshLayout;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.TimeUnit;

/* JADX INFO: loaded from: classes11.dex */
@com.max.hbcommon.analytics.m(path = lb.d.f131270v2)
public class GameSortedListFragment extends rb.a implements com.max.xiaoheihe.view.callback.a, rb.c {
    public static ChangeQuickRedirect changeQuickRedirect = null;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public static final String f84838n = "game_list_obj";

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public static final String f84839o = "game_list";

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    private static final String f84840p = "sort_type";

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    private static final String f84841q = "filter_head";

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    private static final String f84842r = "mobile";

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    private static final String f84843s = "script";

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    private static final String f84844t = "game";

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private int f84845b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private KeyDescObj f84846c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private String f84847d;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private com.max.xiaoheihe.module.game.adapter.u f84849f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private GameListObj f84850g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private f f84851h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private RefreshBroadcastReceiver f84852i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private String f84853j;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private of.c f84856m;

    @BindView(R.id.rv)
    RecyclerView mRecyclerView;

    @BindView(R.id.srl)
    SmartRefreshLayout mRefreshLayout;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private ArrayList<GameObj> f84848e = new ArrayList<>();

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private a2 f84854k = new a2();

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private boolean f84855l = false;

    public class RefreshBroadcastReceiver extends BroadcastReceiver {
        public static ChangeQuickRedirect changeQuickRedirect;

        public class a implements com.max.xiaoheihe.utils.l0.g {
            public static ChangeQuickRedirect changeQuickRedirect;

            a() {
            }

            @Override // com.max.xiaoheihe.utils.l0.g
            public void a() {
                if (PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 33839, new Class[0], Void.TYPE).isSupported) {
                    return;
                }
                Fragment parentFragment = GameSortedListFragment.this.getParentFragment();
                if (parentFragment instanceof t1) {
                    t1 t1Var = (t1) parentFragment;
                    if (t1Var.isActive()) {
                        t1Var.V4(true);
                    }
                }
                if (GameSortedListFragment.this.isActive()) {
                    GameSortedListFragment.V3(GameSortedListFragment.this);
                }
            }
        }

        private RefreshBroadcastReceiver() {
        }

        /* synthetic */ RefreshBroadcastReceiver(GameSortedListFragment gameSortedListFragment, a aVar) {
            this();
        }

        @Override // android.content.BroadcastReceiver
        public void onReceive(Context context, Intent intent) {
            if (PatchProxy.proxy(new Object[]{context, intent}, this, changeQuickRedirect, false, 33838, new Class[]{Context.class, Intent.class}, Void.TYPE).isSupported) {
                return;
            }
            String action = intent.getAction();
            if (!lb.a.D.equals(action) && !lb.a.X.equals(action)) {
                if (lb.a.T.equals(action)) {
                    GameSortedListFragment.W3(GameSortedListFragment.this, intent.getStringExtra(GameBindingFragment.f77862o), (Map) intent.getSerializableExtra(lb.a.f131026q0), new a());
                    return;
                }
                return;
            }
            if (lb.a.X.equals(action)) {
                Fragment parentFragment = GameSortedListFragment.this.getParentFragment();
                if (parentFragment instanceof t1) {
                    t1 t1Var = (t1) parentFragment;
                    if (t1Var.isActive()) {
                        t1Var.V4(true);
                    }
                }
            }
            if (GameSortedListFragment.this.isActive()) {
                GameSortedListFragment.V3(GameSortedListFragment.this);
            }
        }
    }

    public class a implements pg.d {
        public static ChangeQuickRedirect changeQuickRedirect;

        a() {
        }

        @Override // pg.d
        public void k(ng.j jVar) {
            if (PatchProxy.proxy(new Object[]{jVar}, this, changeQuickRedirect, false, 33829, new Class[]{ng.j.class}, Void.TYPE).isSupported) {
                return;
            }
            GameSortedListFragment.this.f84845b = 0;
            GameSortedListFragment.P3(GameSortedListFragment.this);
        }
    }

    public class b implements pg.b {
        public static ChangeQuickRedirect changeQuickRedirect;

        b() {
        }

        @Override // pg.b
        public void f(ng.j jVar) {
            if (PatchProxy.proxy(new Object[]{jVar}, this, changeQuickRedirect, false, 33830, new Class[]{ng.j.class}, Void.TYPE).isSupported) {
                return;
            }
            GameSortedListFragment.O3(GameSortedListFragment.this, 30);
            GameSortedListFragment.P3(GameSortedListFragment.this);
        }
    }

    public class c implements com.max.hbcommon.analytics.g {
        public static ChangeQuickRedirect changeQuickRedirect;

        c() {
        }

        @Override // com.max.hbcommon.analytics.g
        @androidx.annotation.p0
        public JsonObject getAdditional() {
            PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 33831, new Class[0], JsonObject.class);
            if (patchProxyResultProxy.isSupported) {
                return (JsonObject) patchProxyResultProxy.result;
            }
            JsonObject jsonObject = new JsonObject();
            if (GameSortedListFragment.this.f84846c != null) {
                jsonObject.addProperty(GameSortedListFragment.f84840p, GameSortedListFragment.this.f84846c.getKey());
            }
            jsonObject.addProperty(GameSortedListFragment.f84841q, GameSortedListFragment.this.f84847d);
            return jsonObject;
        }

        @Override // com.max.hbcommon.analytics.g
        @androidx.annotation.p0
        public String getPath() {
            return lb.d.f131277w2;
        }
    }

    public class d extends com.max.hbcommon.network.d<Result<GameListObj>> {
        public static ChangeQuickRedirect changeQuickRedirect;

        d() {
        }

        @Override // com.max.hbcommon.network.d, io.reactivex.g0
        public void onComplete() {
            if (!PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 33833, new Class[0], Void.TYPE).isSupported && GameSortedListFragment.this.isActive()) {
                GameSortedListFragment.this.mRefreshLayout.A(0);
                GameSortedListFragment.this.mRefreshLayout.p(0);
                super.onComplete();
            }
        }

        @Override // com.max.hbcommon.network.d, io.reactivex.g0
        public void onError(Throwable th2) {
            if (!PatchProxy.proxy(new Object[]{th2}, this, changeQuickRedirect, false, 33832, new Class[]{Throwable.class}, Void.TYPE).isSupported && GameSortedListFragment.this.isActive()) {
                super.onError(th2);
                GameSortedListFragment.T3(GameSortedListFragment.this);
                GameSortedListFragment.this.mRefreshLayout.A(0);
                GameSortedListFragment.this.mRefreshLayout.p(0);
            }
        }

        public void onNext(Result<GameListObj> result) {
            if (!PatchProxy.proxy(new Object[]{result}, this, changeQuickRedirect, false, 33834, new Class[]{Result.class}, Void.TYPE).isSupported && GameSortedListFragment.this.isActive()) {
                super.onNext(result);
                GameSortedListFragment.U3(GameSortedListFragment.this, result.getResult());
            }
        }

        @Override // com.max.hbcommon.network.d, io.reactivex.g0
        public /* bridge */ /* synthetic */ void onNext(Object obj) {
            if (PatchProxy.proxy(new Object[]{obj}, this, changeQuickRedirect, false, 33835, new Class[]{Object.class}, Void.TYPE).isSupported) {
                return;
            }
            onNext((Result<GameListObj>) obj);
        }
    }

    public class e extends com.max.hbcommon.network.d<Result<StateObj>> {
        public static ChangeQuickRedirect changeQuickRedirect;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ com.max.xiaoheihe.utils.l0.g f84863b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ int f84864c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        final /* synthetic */ String f84865d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        final /* synthetic */ Map f84866e;

        e(com.max.xiaoheihe.utils.l0.g gVar, int i10, String str, Map map) {
            this.f84863b = gVar;
            this.f84864c = i10;
            this.f84865d = str;
            this.f84866e = map;
        }

        @Override // com.max.hbcommon.network.d, io.reactivex.g0
        public void onError(Throwable th2) {
        }

        public void onNext(Result<StateObj> result) {
            if (PatchProxy.proxy(new Object[]{result}, this, changeQuickRedirect, false, 33836, new Class[]{Result.class}, Void.TYPE).isSupported) {
            }
            if (result == null || result.getResult().getState() == null) {
                GameSortedListFragment.X3(GameSortedListFragment.this);
                return;
            }
            String state = result.getResult().getState();
            state.hashCode();
            switch (state) {
                case "failed":
                    GameSortedListFragment.X3(GameSortedListFragment.this);
                    break;
                case "ok":
                    this.f84863b.a();
                    break;
                case "waiting":
                    int i10 = this.f84864c;
                    if (i10 <= 5) {
                        GameSortedListFragment.Q3(GameSortedListFragment.this, this.f84865d, this.f84866e, i10 + 1, this.f84863b);
                        break;
                    } else {
                        GameSortedListFragment.X3(GameSortedListFragment.this);
                        break;
                    }
                    break;
            }
        }

        @Override // com.max.hbcommon.network.d, io.reactivex.g0
        public /* bridge */ /* synthetic */ void onNext(Object obj) {
            if (PatchProxy.proxy(new Object[]{obj}, this, changeQuickRedirect, false, 33837, new Class[]{Object.class}, Void.TYPE).isSupported) {
                return;
            }
            onNext((Result<StateObj>) obj);
        }
    }

    public interface f {
        void c(GameListObj gameListObj);

        Map<String, String> getFilter();

        String getPlatform();

        View h3();
    }

    static /* synthetic */ int O3(GameSortedListFragment gameSortedListFragment, int i10) {
        int i11 = gameSortedListFragment.f84845b + i10;
        gameSortedListFragment.f84845b = i11;
        return i11;
    }

    static /* synthetic */ void P3(GameSortedListFragment gameSortedListFragment) {
        if (PatchProxy.proxy(new Object[]{gameSortedListFragment}, null, changeQuickRedirect, true, 33822, new Class[]{GameSortedListFragment.class}, Void.TYPE).isSupported) {
            return;
        }
        gameSortedListFragment.Y3();
    }

    static /* synthetic */ void Q3(GameSortedListFragment gameSortedListFragment, String str, Map map, int i10, com.max.xiaoheihe.utils.l0.g gVar) {
        if (PatchProxy.proxy(new Object[]{gameSortedListFragment, str, map, new Integer(i10), gVar}, null, changeQuickRedirect, true, 33828, new Class[]{GameSortedListFragment.class, String.class, Map.class, Integer.TYPE, com.max.xiaoheihe.utils.l0.g.class}, Void.TYPE).isSupported) {
            return;
        }
        gameSortedListFragment.j4(str, map, i10, gVar);
    }

    static /* synthetic */ void T3(GameSortedListFragment gameSortedListFragment) {
        if (PatchProxy.proxy(new Object[]{gameSortedListFragment}, null, changeQuickRedirect, true, 33823, new Class[]{GameSortedListFragment.class}, Void.TYPE).isSupported) {
            return;
        }
        gameSortedListFragment.showError();
    }

    static /* synthetic */ void U3(GameSortedListFragment gameSortedListFragment, GameListObj gameListObj) {
        if (PatchProxy.proxy(new Object[]{gameSortedListFragment, gameListObj}, null, changeQuickRedirect, true, 33824, new Class[]{GameSortedListFragment.class, GameListObj.class}, Void.TYPE).isSupported) {
            return;
        }
        gameSortedListFragment.c(gameListObj);
    }

    static /* synthetic */ void V3(GameSortedListFragment gameSortedListFragment) {
        if (PatchProxy.proxy(new Object[]{gameSortedListFragment}, null, changeQuickRedirect, true, 33825, new Class[]{GameSortedListFragment.class}, Void.TYPE).isSupported) {
            return;
        }
        gameSortedListFragment.d4();
    }

    static /* synthetic */ void W3(GameSortedListFragment gameSortedListFragment, String str, Map map, com.max.xiaoheihe.utils.l0.g gVar) {
        if (PatchProxy.proxy(new Object[]{gameSortedListFragment, str, map, gVar}, null, changeQuickRedirect, true, 33826, new Class[]{GameSortedListFragment.class, String.class, Map.class, com.max.xiaoheihe.utils.l0.g.class}, Void.TYPE).isSupported) {
            return;
        }
        gameSortedListFragment.k4(str, map, gVar);
    }

    static /* synthetic */ void X3(GameSortedListFragment gameSortedListFragment) {
        if (PatchProxy.proxy(new Object[]{gameSortedListFragment}, null, changeQuickRedirect, true, 33827, new Class[]{GameSortedListFragment.class}, Void.TYPE).isSupported) {
            return;
        }
        gameSortedListFragment.i4();
    }

    private void Y3() {
        if (PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 33812, new Class[0], Void.TYPE).isSupported) {
            return;
        }
        com.max.heybox.hblog.g.x("GameSortedListFragment, getGameList, mGameListObj = " + this.f84850g);
        HashMap map = new HashMap(16);
        KeyDescObj keyDescObj = this.f84846c;
        if (keyDescObj != null && !com.max.hbcommon.utils.c.u(keyDescObj.getKey())) {
            map.put(f84840p, this.f84846c.getKey());
        }
        Map<String, String> filter = this.f84851h.getFilter();
        if (this.f84851h != null && filter != null) {
            for (Map.Entry<String, String> entry : filter.entrySet()) {
                map.put(entry.getKey(), entry.getValue());
            }
        }
        addDisposable((io.reactivex.disposables.b) com.max.xiaoheihe.network.i.a().w7(map, this.f84845b, 30).I5(io.reactivex.schedulers.b.d()).a4(io.reactivex.android.schedulers.a.c()).J5(new d()));
    }

    private String Z3() {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 33814, new Class[0], String.class);
        if (patchProxyResultProxy.isSupported) {
            return (String) patchProxyResultProxy.result;
        }
        f fVar = this.f84851h;
        if (fVar != null && "mobile".equalsIgnoreCase(fVar.getPlatform())) {
            return "mobile";
        }
        f fVar2 = this.f84851h;
        return (fVar2 == null || !"script".equalsIgnoreCase(fVar2.getPlatform())) ? "game" : "script";
    }

    private void a4() {
        if (PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 33810, new Class[0], Void.TYPE).isSupported) {
            return;
        }
        if (this.f84845b == 0) {
            this.f84848e.clear();
        }
        int size = this.f84848e.size() + 1;
        GameListObj gameListObj = this.f84850g;
        if (gameListObj == null || gameListObj.getGames() == null) {
            return;
        }
        for (GameObj gameObj : this.f84850g.getGames()) {
            gameObj.setRank(size);
            gameObj.setIs_use_new_style(this.f84850g.getIs_use_new_style());
            this.f84848e.add(gameObj);
            size++;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void b4(boolean z10) {
        if (PatchProxy.proxy(new Object[]{new Byte(z10 ? (byte) 1 : (byte) 0)}, this, changeQuickRedirect, false, 33821, new Class[]{Boolean.TYPE}, Void.TYPE).isSupported || !isActive() || this.f84855l) {
            return;
        }
        this.f84855l = true;
        if (z10) {
            Y3();
        } else {
            e4();
        }
    }

    private void c(GameListObj gameListObj) {
        GameListObj gameListObj2;
        if (PatchProxy.proxy(new Object[]{gameListObj}, this, changeQuickRedirect, false, 33809, new Class[]{GameListObj.class}, Void.TYPE).isSupported) {
            return;
        }
        this.f84850g = gameListObj;
        KeyDescObj keyDescObj = this.f84846c;
        if (keyDescObj != null && com.max.hbcommon.utils.c.u(keyDescObj.getKey()) && (gameListObj2 = this.f84850g) != null && gameListObj2.getSort_types() != null && this.f84850g.getSort_types().size() > 0) {
            this.f84846c = this.f84850g.getSort_types().get(0);
        }
        a4();
        e4();
    }

    public static GameSortedListFragment c4(@androidx.annotation.n0 KeyDescObj keyDescObj, String str) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{keyDescObj, str}, null, changeQuickRedirect, true, 33796, new Class[]{KeyDescObj.class, String.class}, GameSortedListFragment.class);
        if (patchProxyResultProxy.isSupported) {
            return (GameSortedListFragment) patchProxyResultProxy.result;
        }
        GameSortedListFragment gameSortedListFragment = new GameSortedListFragment();
        Bundle bundle = new Bundle();
        bundle.putSerializable(f84840p, keyDescObj);
        bundle.putString(f84841q, str);
        gameSortedListFragment.setArguments(bundle);
        return gameSortedListFragment;
    }

    private void d4() {
        if (PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 33816, new Class[0], Void.TYPE).isSupported) {
            return;
        }
        this.mRecyclerView.scrollToPosition(0);
        this.mRefreshLayout.F();
    }

    private void e4() {
        if (PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 33811, new Class[0], Void.TYPE).isSupported) {
            return;
        }
        f fVar = this.f84851h;
        if (fVar != null) {
            fVar.c(this.f84850g);
        }
        GameListObj gameListObj = this.f84850g;
        if (gameListObj != null && !com.max.hbcommon.utils.c.u(gameListObj.getKey_point())) {
            this.f84849f.w(this.f84850g.getKey_point());
        }
        this.f84849f.notifyDataSetChanged();
        if (this.f84848e.isEmpty()) {
            showEmpty(R.drawable.common_tag_common_45x45, R.string.have_no_game_temporarily);
        } else {
            showContentView();
        }
    }

    private void i4() {
        if (PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 33820, new Class[0], Void.TYPE).isSupported) {
            return;
        }
        com.max.hbutils.utils.c cVar = com.max.hbutils.utils.c.f73533a;
        com.max.hbutils.utils.c.f("绑定失败，请稍后再试");
    }

    private void j4(String str, Map<String, String> map, int i10, com.max.xiaoheihe.utils.l0.g gVar) {
        if (PatchProxy.proxy(new Object[]{str, map, new Integer(i10), gVar}, this, changeQuickRedirect, false, 33819, new Class[]{String.class, Map.class, Integer.TYPE, com.max.xiaoheihe.utils.l0.g.class}, Void.TYPE).isSupported) {
            return;
        }
        String str2 = (map == null || map.isEmpty()) ? str : null;
        if (map == null) {
            map = new HashMap<>();
        }
        Map<String, String> map2 = map;
        com.max.xiaoheihe.network.i.a().t4(null, str2, null, map2).w1((i10 - 1) * 2, TimeUnit.SECONDS).I5(io.reactivex.schedulers.b.d()).a4(io.reactivex.android.schedulers.a.c()).g(new e(gVar, i10, str, map2));
    }

    private void k4(String str, Map<String, String> map, com.max.xiaoheihe.utils.l0.g gVar) {
        if (PatchProxy.proxy(new Object[]{str, map, gVar}, this, changeQuickRedirect, false, 33818, new Class[]{String.class, Map.class, com.max.xiaoheihe.utils.l0.g.class}, Void.TYPE).isSupported) {
            return;
        }
        j4(str, map, 1, gVar);
    }

    @Override // com.max.xiaoheihe.view.callback.a
    public void D3() {
        if (!PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 33815, new Class[0], Void.TYPE).isSupported && isActive() && this.mIsVisible) {
            d4();
        }
    }

    @Override // rb.a, rb.c
    @androidx.annotation.p0
    public Bundle M() {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 33806, new Class[0], Bundle.class);
        if (patchProxyResultProxy.isSupported) {
            return (Bundle) patchProxyResultProxy.result;
        }
        com.max.heybox.hblog.g.x("GameSortedListFragment, saveKilledState, mGameListObj = " + this.f84850g);
        Bundle bundle = new Bundle();
        GameListObj gameListObj = this.f84850g;
        if (gameListObj != null) {
            if (!com.max.hbcommon.utils.c.w(gameListObj.getGames())) {
                this.f84850g.getGames().clear();
            }
            bundle.putSerializable(f84838n, this.f84850g);
        }
        bundle.putSerializable("game_list", this.f84848e);
        return bundle;
    }

    @Override // rb.a, rb.c
    @androidx.annotation.p0
    public String W2() {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 33800, new Class[0], String.class);
        if (patchProxyResultProxy.isSupported) {
            return (String) patchProxyResultProxy.result;
        }
        if (getArguments() != null) {
            Serializable serializable = getArguments().getSerializable(f84840p);
            if (serializable instanceof KeyDescObj) {
                return ((KeyDescObj) serializable).getKey();
            }
        }
        return super.W2();
    }

    public void f4(String str) {
        this.f84847d = str;
    }

    public void g4(GameListObj gameListObj) {
        this.f84850g = gameListObj;
    }

    @Override // com.max.hbcommon.base.d, com.max.hbcommon.analytics.d.f
    @androidx.annotation.p0
    public String getPageAdditional() {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 33817, new Class[0], String.class);
        if (patchProxyResultProxy.isSupported) {
            return (String) patchProxyResultProxy.result;
        }
        JsonObject jsonObject = new JsonObject();
        KeyDescObj keyDescObj = this.f84846c;
        if (keyDescObj != null) {
            jsonObject.addProperty(f84840p, keyDescObj.getKey());
        }
        jsonObject.addProperty(f84841q, this.f84847d);
        return jsonObject.toString();
    }

    public void h4(KeyDescObj keyDescObj) {
        if (PatchProxy.proxy(new Object[]{keyDescObj}, this, changeQuickRedirect, false, 33804, new Class[]{KeyDescObj.class}, Void.TYPE).isSupported) {
            return;
        }
        if (keyDescObj == null || !"1".equals(keyDescObj.getMulti())) {
            this.f84846c = keyDescObj;
        } else {
            if (!com.max.hbcommon.utils.c.u(keyDescObj.getDesc()) || com.max.hbcommon.utils.c.w(keyDescObj.getData())) {
                return;
            }
            this.f84846c = keyDescObj.getData().get(0);
        }
    }

    @Override // com.max.hbcommon.base.d
    public void initData() {
        if (PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 33805, new Class[0], Void.TYPE).isSupported) {
            return;
        }
        final boolean z10 = this.f84850g == null || com.max.hbcommon.utils.c.w(this.f84848e);
        if (z10) {
            showLoading();
        }
        com.max.heybox.hblog.g.x("GameSortedListFragment, initData, savedInstance = , mGameListObj = " + this.f84850g);
        new Handler().postDelayed(new Runnable() { // from class: com.max.xiaoheihe.module.game.m0
            @Override // java.lang.Runnable
            public final void run() {
                this.f87821b.b4(z10);
            }
        }, 100L);
    }

    @Override // com.max.hbcommon.base.d
    public void installViews(View view) {
        if (PatchProxy.proxy(new Object[]{view}, this, changeQuickRedirect, false, 33802, new Class[]{View.class}, Void.TYPE).isSupported) {
            return;
        }
        setContentView(R.layout.layout_sample_refresh_rv);
        this.mUnBinder = ButterKnife.f(this, view);
        if (getArguments() != null) {
            KeyDescObj keyDescObj = (KeyDescObj) getArguments().getSerializable(f84840p);
            this.f84846c = keyDescObj;
            h4(keyDescObj);
            this.f84847d = getArguments().getString(f84841q);
        }
        this.f84853j = Z3();
        this.mRefreshLayout.S(new a());
        this.mRefreshLayout.f0(new b());
        this.mRefreshLayout.setBackgroundDrawable(getResources().getDrawable(R.color.background_layer_2_color));
        this.mRecyclerView.setLayoutManager(new LinearLayoutManager(this.mContext));
        this.mRecyclerView.setClipToPadding(false);
        this.mRecyclerView.setClipChildren(false);
        this.mRecyclerView.setPadding(0, ViewUtils.f(this.mContext, 3.0f), 0, 0);
        c cVar = new c();
        Activity activity = this.mContext;
        ArrayList<GameObj> arrayList = this.f84848e;
        a2 a2Var = this.f84854k;
        KeyDescObj keyDescObj2 = this.f84846c;
        com.max.xiaoheihe.module.game.adapter.u uVar = new com.max.xiaoheihe.module.game.adapter.u(activity, arrayList, cVar, a2Var, keyDescObj2 != null ? keyDescObj2.getKey() : null);
        this.f84849f = uVar;
        this.mRecyclerView.setAdapter(uVar);
        new OneTimeValidExposureWatcher(this, this.mRecyclerView);
        ViewUtils.b(this.mRecyclerView, this.f84851h.h3());
    }

    @Override // com.max.hbcommon.base.d, androidx.fragment.app.Fragment
    public void onAttach(Context context) {
        if (PatchProxy.proxy(new Object[]{context}, this, changeQuickRedirect, false, 33797, new Class[]{Context.class}, Void.TYPE).isSupported) {
            return;
        }
        super.onAttach(context);
        if (getParentFragment() instanceof f) {
            this.f84851h = (f) getParentFragment();
            return;
        }
        if (context instanceof f) {
            this.f84851h = (f) context;
            return;
        }
        throw new RuntimeException(getParentFragment() + " or " + context + " must implement GameListListener");
    }

    @Override // rb.a, com.max.hbcommon.base.d, androidx.fragment.app.Fragment
    public void onDestroyView() {
        if (PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 33807, new Class[0], Void.TYPE).isSupported) {
            return;
        }
        this.f84854k.f();
        super.onDestroyView();
    }

    @Override // com.max.hbcommon.base.d, androidx.fragment.app.Fragment
    public void onDetach() {
        if (PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 33801, new Class[0], Void.TYPE).isSupported) {
            return;
        }
        super.onDetach();
        this.f84851h = null;
    }

    @Override // com.max.hbcommon.base.d
    public void onRefresh() {
        if (PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 33813, new Class[0], Void.TYPE).isSupported) {
            return;
        }
        showLoading();
        Y3();
    }

    @Override // com.max.hbcommon.base.d
    public void onRegisterReceiver() {
        if (PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 33803, new Class[0], Void.TYPE).isSupported) {
            return;
        }
        super.onRegisterReceiver();
        RefreshBroadcastReceiver refreshBroadcastReceiver = new RefreshBroadcastReceiver(this, null);
        this.f84852i = refreshBroadcastReceiver;
        registerReceiver(refreshBroadcastReceiver, lb.a.D);
        registerReceiver(this.f84852i, lb.a.X);
        registerReceiver(this.f84852i, lb.a.T);
    }

    @Override // com.max.hbcommon.base.d
    public void onUnRegisterReceiver() {
        if (PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 33808, new Class[0], Void.TYPE).isSupported) {
            return;
        }
        super.onUnRegisterReceiver();
        unregisterReceiver(this.f84852i);
    }

    @Override // com.max.hbcommon.base.d, androidx.fragment.app.Fragment
    public void onViewCreated(@androidx.annotation.n0 View view, @androidx.annotation.p0 Bundle bundle) {
        if (PatchProxy.proxy(new Object[]{view, bundle}, this, changeQuickRedirect, false, 33798, new Class[]{View.class, Bundle.class}, Void.TYPE).isSupported) {
            return;
        }
        super.onViewCreated(view, bundle);
        this.f84856m = (of.c) new androidx.lifecycle.y0(this).a(of.c.class);
    }

    @Override // rb.a, rb.c
    public void p3(@androidx.annotation.p0 Bundle bundle) {
        if (PatchProxy.proxy(new Object[]{bundle}, this, changeQuickRedirect, false, 33799, new Class[]{Bundle.class}, Void.TYPE).isSupported) {
            return;
        }
        com.max.heybox.hblog.g.x("GameSortedListFragment, restoreKilledState, bundle = " + bundle + ", mFilterHead = " + this.f84847d);
        if (bundle != null) {
            Serializable serializable = bundle.getSerializable(f84838n);
            Serializable serializable2 = bundle.getSerializable("game_list");
            if (serializable instanceof GameListObj) {
                this.f84850g = (GameListObj) serializable;
            }
            if (serializable2 instanceof ArrayList) {
                ArrayList<GameObj> arrayList = (ArrayList) serializable2;
                this.f84848e = arrayList;
                this.f84845b = arrayList.size();
            }
        }
    }
}
