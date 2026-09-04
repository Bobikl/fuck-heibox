package com.max.xiaoheihe.module.account;

import android.content.Context;
import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import butterknife.BindView;
import butterknife.ButterKnife;
import com.max.hbminiprogram.NativeLittleProgramFragment;
import com.max.hbutils.bean.Result;
import com.max.xiaoheihe.R;
import com.max.xiaoheihe.bean.account.AchieveObj;
import com.max.xiaoheihe.bean.game.GameObj;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.PatchProxyResult;
import com.scwang.smartrefresh.layout.SmartRefreshLayout;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes9.dex */
public class GameAchievementFragment extends NativeLittleProgramFragment {
    public static ChangeQuickRedirect changeQuickRedirect = null;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    private static final String f77845x = "GameAchievementFragment";

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    private static final String f77846y = "steamId";

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    private static final String f77847z = "steamAppId";

    @BindView(R.id.rv_fragment_game_achievement_list)
    RecyclerView mRecyclerView;

    @BindView(R.id.srl_fragment_game_achievement)
    SmartRefreshLayout mSmartRefreshLayout;

    @BindView(R.id.vg_fragment_game_achievement_game_info)
    ViewGroup mVgGameInfo;

    @BindView(R.id.vg_fragment_game_achievement_title)
    ViewGroup mVgTitle;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    private String f77848p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    private String f77849q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    private GameObj f77850r;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    private com.max.hbcommon.base.adapter.s<AchieveObj> f77852t;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    private List<AchieveObj> f77851s = new ArrayList();

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    private int f77853u = 0;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    private String f77854v = "1";

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    private int f77855w = 0;

    public class a extends com.max.hbcommon.base.adapter.s<AchieveObj> {
        public static ChangeQuickRedirect changeQuickRedirect;

        a(Context context, List list, int i10) {
            super(context, list, i10);
        }

        public void m(com.max.hbcommon.base.adapter.s.e eVar, AchieveObj achieveObj) {
            if (PatchProxy.proxy(new Object[]{eVar, achieveObj}, this, changeQuickRedirect, false, 23066, new Class[]{com.max.hbcommon.base.adapter.s.e.class, AchieveObj.class}, Void.TYPE).isSupported) {
                return;
            }
            int adapterPosition = eVar.getAdapterPosition() - 1;
            int adapterPosition2 = eVar.getAdapterPosition() + 1;
            com.max.xiaoheihe.module.account.utils.l.T((ViewGroup) eVar.itemView, achieveObj, eVar.getAdapterPosition() == GameAchievementFragment.this.f77851s.size() - 1 || (adapterPosition2 < GameAchievementFragment.this.f77851s.size() && adapterPosition2 >= 0 && ((AchieveObj) GameAchievementFragment.this.f77851s.get(adapterPosition2)).getAchieved() + achieveObj.getAchieved() == 1), adapterPosition >= 0 && adapterPosition < GameAchievementFragment.this.f77851s.size() && ((AchieveObj) GameAchievementFragment.this.f77851s.get(adapterPosition)).getAchieved() + achieveObj.getAchieved() == 1 && GameAchievementFragment.this.f77855w == 0, adapterPosition == -1);
        }

        @Override // com.max.hbcommon.base.adapter.s
        public /* bridge */ /* synthetic */ void onBindViewHolder(com.max.hbcommon.base.adapter.s.e eVar, AchieveObj achieveObj) {
            if (PatchProxy.proxy(new Object[]{eVar, achieveObj}, this, changeQuickRedirect, false, 23067, new Class[]{com.max.hbcommon.base.adapter.s.e.class, Object.class}, Void.TYPE).isSupported) {
                return;
            }
            m(eVar, achieveObj);
        }
    }

    public class b implements pg.b {
        public static ChangeQuickRedirect changeQuickRedirect;

        b() {
        }

        @Override // pg.b
        public void f(ng.j jVar) {
            if (PatchProxy.proxy(new Object[]{jVar}, this, changeQuickRedirect, false, 23068, new Class[]{ng.j.class}, Void.TYPE).isSupported) {
                return;
            }
            GameAchievementFragment.M4(GameAchievementFragment.this, 30);
            GameAchievementFragment.N4(GameAchievementFragment.this);
        }
    }

    public class c implements pg.d {
        public static ChangeQuickRedirect changeQuickRedirect;

        c() {
        }

        @Override // pg.d
        public void k(ng.j jVar) {
            if (PatchProxy.proxy(new Object[]{jVar}, this, changeQuickRedirect, false, 23069, new Class[]{ng.j.class}, Void.TYPE).isSupported) {
                return;
            }
            GameAchievementFragment.this.f77853u = 0;
            GameAchievementFragment.N4(GameAchievementFragment.this);
        }
    }

    public class d extends com.max.hbcommon.network.d<Result<GameObj>> {
        public static ChangeQuickRedirect changeQuickRedirect;

        d() {
        }

        @Override // com.max.hbcommon.network.d, io.reactivex.g0
        public void onComplete() {
            if (!PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 23070, new Class[0], Void.TYPE).isSupported && GameAchievementFragment.this.isActive()) {
                GameAchievementFragment.this.mSmartRefreshLayout.A(0);
                GameAchievementFragment.this.mSmartRefreshLayout.p(0);
                super.onComplete();
            }
        }

        @Override // com.max.hbcommon.network.d, io.reactivex.g0
        public void onError(Throwable th2) {
            if (!PatchProxy.proxy(new Object[]{th2}, this, changeQuickRedirect, false, 23071, new Class[]{Throwable.class}, Void.TYPE).isSupported && GameAchievementFragment.this.isActive()) {
                GameAchievementFragment.this.mSmartRefreshLayout.A(0);
                GameAchievementFragment.this.mSmartRefreshLayout.p(0);
                super.onError(th2);
                GameAchievementFragment.O4(GameAchievementFragment.this);
                th2.printStackTrace();
            }
        }

        public void onNext(Result<GameObj> result) {
            if (!PatchProxy.proxy(new Object[]{result}, this, changeQuickRedirect, false, 23072, new Class[]{Result.class}, Void.TYPE).isSupported && GameAchievementFragment.this.isActive()) {
                if (result == null) {
                    GameAchievementFragment.P4(GameAchievementFragment.this);
                } else {
                    GameAchievementFragment.this.f77850r = result.getResult();
                    GameAchievementFragment.R4(GameAchievementFragment.this);
                }
            }
        }

        @Override // com.max.hbcommon.network.d, io.reactivex.g0
        public /* bridge */ /* synthetic */ void onNext(Object obj) {
            if (PatchProxy.proxy(new Object[]{obj}, this, changeQuickRedirect, false, 23073, new Class[]{Object.class}, Void.TYPE).isSupported) {
                return;
            }
            onNext((Result<GameObj>) obj);
        }
    }

    public class e implements com.max.xiaoheihe.module.account.utils.l.k0<Integer> {
        public static ChangeQuickRedirect changeQuickRedirect;

        e() {
        }

        @Override // com.max.xiaoheihe.module.account.utils.l.k0
        public /* bridge */ /* synthetic */ void a(Integer num) {
            if (PatchProxy.proxy(new Object[]{num}, this, changeQuickRedirect, false, 23075, new Class[]{Object.class}, Void.TYPE).isSupported) {
                return;
            }
            b(num);
        }

        public void b(Integer num) {
            if (PatchProxy.proxy(new Object[]{num}, this, changeQuickRedirect, false, 23074, new Class[]{Integer.class}, Void.TYPE).isSupported) {
                return;
            }
            GameAchievementFragment.this.f77855w = num.intValue();
            int i10 = GameAchievementFragment.this.f77855w;
            if (i10 == 0) {
                GameAchievementFragment.this.f77854v = "1";
            } else if (i10 == 1) {
                GameAchievementFragment.this.f77854v = "2";
            } else if (i10 == 2) {
                GameAchievementFragment.this.f77854v = "3";
            }
            GameAchievementFragment.this.f77853u = 0;
            GameAchievementFragment.N4(GameAchievementFragment.this);
        }
    }

    static /* synthetic */ int M4(GameAchievementFragment gameAchievementFragment, int i10) {
        int i11 = gameAchievementFragment.f77853u + i10;
        gameAchievementFragment.f77853u = i11;
        return i11;
    }

    static /* synthetic */ void N4(GameAchievementFragment gameAchievementFragment) {
        if (PatchProxy.proxy(new Object[]{gameAchievementFragment}, null, changeQuickRedirect, true, 23062, new Class[]{GameAchievementFragment.class}, Void.TYPE).isSupported) {
            return;
        }
        gameAchievementFragment.T4();
    }

    static /* synthetic */ void O4(GameAchievementFragment gameAchievementFragment) {
        if (PatchProxy.proxy(new Object[]{gameAchievementFragment}, null, changeQuickRedirect, true, 23063, new Class[]{GameAchievementFragment.class}, Void.TYPE).isSupported) {
            return;
        }
        gameAchievementFragment.showError();
    }

    static /* synthetic */ void P4(GameAchievementFragment gameAchievementFragment) {
        if (PatchProxy.proxy(new Object[]{gameAchievementFragment}, null, changeQuickRedirect, true, 23064, new Class[]{GameAchievementFragment.class}, Void.TYPE).isSupported) {
            return;
        }
        gameAchievementFragment.showError();
    }

    static /* synthetic */ void R4(GameAchievementFragment gameAchievementFragment) {
        if (PatchProxy.proxy(new Object[]{gameAchievementFragment}, null, changeQuickRedirect, true, 23065, new Class[]{GameAchievementFragment.class}, Void.TYPE).isSupported) {
            return;
        }
        gameAchievementFragment.V4();
    }

    private void T4() {
        if (PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 23059, new Class[0], Void.TYPE).isSupported) {
            return;
        }
        addDisposable((io.reactivex.disposables.b) com.max.xiaoheihe.network.i.a().H5(this.f77848p, this.f77849q, this.f77853u, 30, this.f77854v).I5(io.reactivex.schedulers.b.d()).a4(io.reactivex.android.schedulers.a.c()).J5(new d()));
    }

    public static GameAchievementFragment U4(String str, String str2) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{str, str2}, null, changeQuickRedirect, true, 23057, new Class[]{String.class, String.class}, GameAchievementFragment.class);
        if (patchProxyResultProxy.isSupported) {
            return (GameAchievementFragment) patchProxyResultProxy.result;
        }
        GameAchievementFragment gameAchievementFragment = new GameAchievementFragment();
        Bundle bundle = new Bundle();
        bundle.putString("steamId", str);
        bundle.putString(f77847z, str2);
        gameAchievementFragment.setArguments(bundle);
        return gameAchievementFragment;
    }

    private void V4() {
        if (PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 23061, new Class[0], Void.TYPE).isSupported) {
            return;
        }
        showContentView();
        com.max.xiaoheihe.module.account.utils.l.I(this.mVgGameInfo, this.f77850r.toGamePlayStatObj(), null, this.f77848p);
        com.max.xiaoheihe.module.account.utils.l.F(this.mVgTitle, this.f77855w, new e());
        if (this.f77853u == 0) {
            this.f77851s.clear();
        }
        GameObj gameObj = this.f77850r;
        if (gameObj != null && gameObj.getItems() != null) {
            this.f77851s.addAll(this.f77850r.getItems());
        }
        List<AchieveObj> list = this.f77851s;
        if (list == null || list.size() <= 0) {
            this.mRecyclerView.setVisibility(8);
            this.mVgTitle.setVisibility(8);
        } else {
            this.mRecyclerView.setVisibility(0);
            this.mVgTitle.setVisibility(0);
        }
        this.f77852t.notifyDataSetChanged();
    }

    @Override // com.max.hbminiprogram.NativeLittleProgramFragment, com.max.hbminiprogram.fragment.BaseLittleProgramFragment
    public void a4(View view, boolean z10) {
        if (PatchProxy.proxy(new Object[]{view, new Byte(z10 ? (byte) 1 : (byte) 0)}, this, changeQuickRedirect, false, 23058, new Class[]{View.class, Boolean.TYPE}, Void.TYPE).isSupported) {
            return;
        }
        super.a4(view, z10);
        setContentView(R.layout.fragment_game_achievement);
        this.mUnBinder = ButterKnife.f(this, view);
        if (getArguments() != null) {
            this.f77849q = getArguments().getString(f77847z);
            this.f77848p = getArguments().getString("steamId");
        }
        this.mTitleBar.setVisibility(0);
        this.mTitleBar.setBackgroundResource(R.color.appbar_bg_color);
        this.mTitleBar.a0();
        if (com.max.xiaoheihe.module.account.utils.c.h(this.f77848p) == 1) {
            this.mTitleBar.setTitle(com.max.xiaoheihe.utils.d.n0(R.string.my_achievement));
        } else {
            this.mTitleBar.setTitle(com.max.xiaoheihe.utils.d.n0(R.string.his_achievement));
        }
        this.mTitleBarDivider.setVisibility(0);
        a aVar = new a(this.mContext, this.f77851s, R.layout.item_single_achievement_x);
        this.f77852t = aVar;
        this.mRecyclerView.setAdapter(aVar);
        this.mRecyclerView.setLayoutManager(new LinearLayoutManager(getContext()));
        this.mRecyclerView.setNestedScrollingEnabled(false);
        this.mSmartRefreshLayout.f0(new b());
        this.mSmartRefreshLayout.S(new c());
        showLoading();
        T4();
    }

    @Override // com.max.hbminiprogram.fragment.BaseLittleProgramFragment, com.max.hbcommon.base.d
    public void onRefresh() {
        if (PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 23060, new Class[0], Void.TYPE).isSupported) {
            return;
        }
        showLoading();
        T4();
    }
}
