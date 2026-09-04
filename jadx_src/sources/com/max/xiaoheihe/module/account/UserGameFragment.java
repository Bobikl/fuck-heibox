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
import com.max.xiaoheihe.bean.account.MyGameListObj;
import com.max.xiaoheihe.bean.game.GameObj;
import com.max.xiaoheihe.module.game.component.GameTimeAchieveItemView;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.PatchProxyResult;
import com.scwang.smartrefresh.layout.SmartRefreshLayout;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: loaded from: classes9.dex */
public class UserGameFragment extends NativeLittleProgramFragment {
    private static final String A = "nickname";
    public static ChangeQuickRedirect changeQuickRedirect = null;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    private static final String f78524y = "heyboxId";

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    private static final String f78525z = "steamId";

    @BindView(R.id.rv_game_list)
    RecyclerView mRvGameList;

    @BindView(R.id.srl_game_list_wrapper)
    SmartRefreshLayout mSmartRefreshLayout;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    private com.max.hbcommon.base.adapter.u<GameObj> f78529s;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    private String f78532v;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    private int f78526p = 0;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    private int f78527q = 1;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    private List<GameObj> f78528r = new ArrayList();

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    private String f78530t = "-1";

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    private String f78531u = "-1";

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    private int f78533w = -1;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    @com.max.xiaoheihe.module.account.utils.l.m0
    private String f78534x = com.max.xiaoheihe.module.account.utils.l.f79323c;

    public class a extends com.max.hbcommon.base.adapter.u<GameObj> {
        public static ChangeQuickRedirect changeQuickRedirect;

        /* JADX INFO: renamed from: com.max.xiaoheihe.module.account.UserGameFragment$a$a, reason: collision with other inner class name */
        public class C0643a implements com.max.xiaoheihe.module.account.utils.l.k0<String> {
            public static ChangeQuickRedirect changeQuickRedirect;

            C0643a() {
            }

            @Override // com.max.xiaoheihe.module.account.utils.l.k0
            public /* bridge */ /* synthetic */ void a(String str) {
                if (PatchProxy.proxy(new Object[]{str}, this, changeQuickRedirect, false, 24453, new Class[]{Object.class}, Void.TYPE).isSupported) {
                    return;
                }
                b(str);
            }

            public void b(String str) {
                if (PatchProxy.proxy(new Object[]{str}, this, changeQuickRedirect, false, 24452, new Class[]{String.class}, Void.TYPE).isSupported) {
                    return;
                }
                if ((com.max.xiaoheihe.module.account.utils.l.f79324d.equals(str) || "all".equals(str) || com.max.xiaoheihe.module.account.utils.l.f79323c.equals(str)) && !UserGameFragment.this.f78534x.equals(str)) {
                    UserGameFragment.this.f78534x = str;
                    UserGameFragment.this.f78526p = 0;
                    UserGameFragment.O4(UserGameFragment.this);
                }
            }
        }

        a(Context context, List list) {
            super(context, list);
        }

        @Override // com.max.hbcommon.base.adapter.s, androidx.recyclerview.widget.RecyclerView.Adapter
        public int getItemCount() {
            PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 24448, new Class[0], Integer.TYPE);
            return patchProxyResultProxy.isSupported ? ((Integer) patchProxyResultProxy.result).intValue() : super.getItemCount() + 1;
        }

        @Override // com.max.hbcommon.base.adapter.u, androidx.recyclerview.widget.RecyclerView.Adapter
        public int getItemViewType(int i10) {
            Object[] objArr = {new Integer(i10)};
            ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
            Class cls = Integer.TYPE;
            PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(objArr, this, changeQuickRedirect2, false, 24447, new Class[]{cls}, cls);
            return patchProxyResultProxy.isSupported ? ((Integer) patchProxyResultProxy.result).intValue() : n(i10, null);
        }

        @Override // com.max.hbcommon.base.adapter.u
        public /* bridge */ /* synthetic */ int m(int i10, GameObj gameObj) {
            Object[] objArr = {new Integer(i10), gameObj};
            ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
            Class cls = Integer.TYPE;
            PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(objArr, this, changeQuickRedirect2, false, 24449, new Class[]{cls, Object.class}, cls);
            return patchProxyResultProxy.isSupported ? ((Integer) patchProxyResultProxy.result).intValue() : n(i10, gameObj);
        }

        public int n(int i10, GameObj gameObj) {
            return i10 == 0 ? R.layout.item_my_game_title : R.layout.item_my_game_with_time_and_achieve;
        }

        public void o(com.max.hbcommon.base.adapter.s.e eVar, int i10, List<Object> list) {
            if (PatchProxy.proxy(new Object[]{eVar, new Integer(i10), list}, this, changeQuickRedirect, false, 24446, new Class[]{com.max.hbcommon.base.adapter.s.e.class, Integer.TYPE, List.class}, Void.TYPE).isSupported) {
                return;
            }
            p(eVar, i10 == 0 ? null : (GameObj) this.mDataList.get(i10 - 1));
        }

        @Override // androidx.recyclerview.widget.RecyclerView.Adapter
        public /* bridge */ /* synthetic */ void onBindViewHolder(RecyclerView.ViewHolder viewHolder, int i10, List list) {
            if (PatchProxy.proxy(new Object[]{viewHolder, new Integer(i10), list}, this, changeQuickRedirect, false, 24451, new Class[]{RecyclerView.ViewHolder.class, Integer.TYPE, List.class}, Void.TYPE).isSupported) {
                return;
            }
            o((com.max.hbcommon.base.adapter.s.e) viewHolder, i10, list);
        }

        @Override // com.max.hbcommon.base.adapter.s
        public /* bridge */ /* synthetic */ void onBindViewHolder(com.max.hbcommon.base.adapter.s.e eVar, Object obj) {
            if (PatchProxy.proxy(new Object[]{eVar, obj}, this, changeQuickRedirect, false, 24450, new Class[]{com.max.hbcommon.base.adapter.s.e.class, Object.class}, Void.TYPE).isSupported) {
                return;
            }
            p(eVar, (GameObj) obj);
        }

        public void p(com.max.hbcommon.base.adapter.s.e eVar, GameObj gameObj) {
            String string;
            if (PatchProxy.proxy(new Object[]{eVar, gameObj}, this, changeQuickRedirect, false, 24445, new Class[]{com.max.hbcommon.base.adapter.s.e.class, GameObj.class}, Void.TYPE).isSupported) {
            }
            switch (eVar.d()) {
                case R.layout.item_my_game_title /* 2131559334 */:
                    if (com.max.xiaoheihe.module.account.utils.c.c(UserGameFragment.this.f78530t) == 1) {
                        if (UserGameFragment.this.f78533w >= 0) {
                            UserGameFragment userGameFragment = UserGameFragment.this;
                            string = userGameFragment.getString(R.string.my_game_x_with_total_count, Integer.valueOf(userGameFragment.f78533w));
                        } else {
                            string = UserGameFragment.this.getString(R.string.my_game_x);
                        }
                    } else if (UserGameFragment.this.f78533w >= 0) {
                        UserGameFragment userGameFragment2 = UserGameFragment.this;
                        string = userGameFragment2.getString(R.string.his_game_x_with_total_count, Integer.valueOf(userGameFragment2.f78533w));
                    } else {
                        string = UserGameFragment.this.getString(R.string.his_game);
                    }
                    com.max.xiaoheihe.module.account.utils.l.M((ViewGroup) eVar.itemView, string, "", UserGameFragment.this.f78534x, new C0643a(), false);
                    break;
                case R.layout.item_my_game_with_time_and_achieve /* 2131559335 */:
                    com.max.xiaoheihe.module.account.utils.l.O((GameTimeAchieveItemView) eVar.i(R.id.gtaiv), gameObj, 0, eVar.getAdapterPosition() == getItemCount() - 1, UserGameFragment.this.f78531u, UserGameFragment.this.f78532v, UserGameFragment.this.f78530t);
                    break;
            }
        }
    }

    public class b implements pg.d {
        public static ChangeQuickRedirect changeQuickRedirect;

        b() {
        }

        @Override // pg.d
        public void k(ng.j jVar) {
            if (PatchProxy.proxy(new Object[]{jVar}, this, changeQuickRedirect, false, 24454, new Class[]{ng.j.class}, Void.TYPE).isSupported) {
                return;
            }
            UserGameFragment.this.f78526p = 0;
            UserGameFragment.O4(UserGameFragment.this);
        }
    }

    public class c implements pg.b {
        public static ChangeQuickRedirect changeQuickRedirect;

        c() {
        }

        @Override // pg.b
        public void f(ng.j jVar) {
            if (PatchProxy.proxy(new Object[]{jVar}, this, changeQuickRedirect, false, 24455, new Class[]{ng.j.class}, Void.TYPE).isSupported) {
                return;
            }
            UserGameFragment.N4(UserGameFragment.this, 30);
            UserGameFragment.O4(UserGameFragment.this);
        }
    }

    public class d extends com.max.hbcommon.network.d<Result<MyGameListObj>> {
        public static ChangeQuickRedirect changeQuickRedirect;

        d() {
        }

        @Override // com.max.hbcommon.network.d, io.reactivex.g0
        public void onComplete() {
            SmartRefreshLayout smartRefreshLayout;
            if (PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 24457, new Class[0], Void.TYPE).isSupported || !UserGameFragment.this.isActive() || (smartRefreshLayout = UserGameFragment.this.mSmartRefreshLayout) == null) {
                return;
            }
            smartRefreshLayout.A(0);
            UserGameFragment.this.mSmartRefreshLayout.p(0);
        }

        @Override // com.max.hbcommon.network.d, io.reactivex.g0
        public void onError(Throwable th2) {
            if (!PatchProxy.proxy(new Object[]{th2}, this, changeQuickRedirect, false, 24456, new Class[]{Throwable.class}, Void.TYPE).isSupported && UserGameFragment.this.isActive()) {
                SmartRefreshLayout smartRefreshLayout = UserGameFragment.this.mSmartRefreshLayout;
                if (smartRefreshLayout != null) {
                    smartRefreshLayout.A(0);
                    UserGameFragment.this.mSmartRefreshLayout.p(0);
                }
                super.onError(th2);
                UserGameFragment.R4(UserGameFragment.this);
                th2.printStackTrace();
            }
        }

        public void onNext(Result<MyGameListObj> result) {
            if (!PatchProxy.proxy(new Object[]{result}, this, changeQuickRedirect, false, 24458, new Class[]{Result.class}, Void.TYPE).isSupported && UserGameFragment.this.isActive()) {
                super.onNext(result);
                MyGameListObj result2 = result.getResult();
                if (result2 != null) {
                    UserGameFragment.S4(UserGameFragment.this, result2.getGame_list());
                } else {
                    UserGameFragment.T4(UserGameFragment.this);
                }
            }
        }

        @Override // com.max.hbcommon.network.d, io.reactivex.g0
        public /* bridge */ /* synthetic */ void onNext(Object obj) {
            if (PatchProxy.proxy(new Object[]{obj}, this, changeQuickRedirect, false, 24459, new Class[]{Object.class}, Void.TYPE).isSupported) {
                return;
            }
            onNext((Result<MyGameListObj>) obj);
        }
    }

    static /* synthetic */ int N4(UserGameFragment userGameFragment, int i10) {
        int i11 = userGameFragment.f78526p + i10;
        userGameFragment.f78526p = i11;
        return i11;
    }

    static /* synthetic */ void O4(UserGameFragment userGameFragment) {
        if (PatchProxy.proxy(new Object[]{userGameFragment}, null, changeQuickRedirect, true, 24441, new Class[]{UserGameFragment.class}, Void.TYPE).isSupported) {
            return;
        }
        userGameFragment.U4();
    }

    static /* synthetic */ void R4(UserGameFragment userGameFragment) {
        if (PatchProxy.proxy(new Object[]{userGameFragment}, null, changeQuickRedirect, true, 24442, new Class[]{UserGameFragment.class}, Void.TYPE).isSupported) {
            return;
        }
        userGameFragment.showError();
    }

    static /* synthetic */ void S4(UserGameFragment userGameFragment, List list) {
        if (PatchProxy.proxy(new Object[]{userGameFragment, list}, null, changeQuickRedirect, true, 24443, new Class[]{UserGameFragment.class, List.class}, Void.TYPE).isSupported) {
            return;
        }
        userGameFragment.W4(list);
    }

    static /* synthetic */ void T4(UserGameFragment userGameFragment) {
        if (PatchProxy.proxy(new Object[]{userGameFragment}, null, changeQuickRedirect, true, 24444, new Class[]{UserGameFragment.class}, Void.TYPE).isSupported) {
            return;
        }
        userGameFragment.showError();
    }

    private void U4() {
        if (PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 24438, new Class[0], Void.TYPE).isSupported) {
            return;
        }
        addDisposable((io.reactivex.disposables.b) com.max.xiaoheihe.network.i.a().s6(this.f78530t, this.f78531u, this.f78526p, 30, this.f78534x).I5(io.reactivex.schedulers.b.d()).a4(io.reactivex.android.schedulers.a.c()).J5(new d()));
    }

    public static UserGameFragment V4(String str, String str2, String str3, int i10) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{str, str2, str3, new Integer(i10)}, null, changeQuickRedirect, true, 24436, new Class[]{String.class, String.class, String.class, Integer.TYPE}, UserGameFragment.class);
        if (patchProxyResultProxy.isSupported) {
            return (UserGameFragment) patchProxyResultProxy.result;
        }
        UserGameFragment userGameFragment = new UserGameFragment();
        Bundle bundle = new Bundle();
        bundle.putString("heyboxId", str);
        bundle.putString("steamId", str2);
        bundle.putString("nickname", str3);
        bundle.putInt(MineActivity.f78215c0, i10);
        userGameFragment.setArguments(bundle);
        return userGameFragment;
    }

    private void W4(List<GameObj> list) {
        if (PatchProxy.proxy(new Object[]{list}, this, changeQuickRedirect, false, 24440, new Class[]{List.class}, Void.TYPE).isSupported) {
            return;
        }
        showContentView();
        if (this.mSmartRefreshLayout != null) {
            if (this.f78526p == 0) {
                this.f78528r.clear();
            }
            if (list != null) {
                this.f78528r.addAll(list);
            }
            Iterator<GameObj> it = this.f78528r.iterator();
            while (it.hasNext()) {
                int iQ = com.max.hbutils.utils.n.q(it.next().getPlaytime_forever());
                if (iQ > this.f78527q) {
                    this.f78527q = iQ;
                }
            }
            this.f78529s.notifyDataSetChanged();
        }
    }

    @Override // com.max.hbminiprogram.NativeLittleProgramFragment, com.max.hbminiprogram.fragment.BaseLittleProgramFragment
    public void a4(View view, boolean z10) {
        if (PatchProxy.proxy(new Object[]{view, new Byte(z10 ? (byte) 1 : (byte) 0)}, this, changeQuickRedirect, false, 24437, new Class[]{View.class, Boolean.TYPE}, Void.TYPE).isSupported) {
            return;
        }
        super.a4(view, z10);
        setContentView(R.layout.fragment_my_game);
        this.mUnBinder = ButterKnife.f(this, view);
        if (getArguments() != null) {
            this.f78530t = getArguments().getString("heyboxId");
            String string = getArguments().getString("steamId");
            this.f78531u = string;
            String str = this.f78530t;
            if (str == null) {
                str = "-1";
            }
            this.f78530t = str;
            if (string == null) {
                string = "-1";
            }
            this.f78531u = string;
            this.f78532v = getArguments().getString(this.f78532v);
            this.f78533w = getArguments().getInt(MineActivity.f78215c0, this.f78533w);
        }
        this.mTitleBar.setVisibility(0);
        this.mTitleBar.setBackgroundResource(R.color.appbar_bg_color);
        this.mTitleBar.a0();
        if (com.max.xiaoheihe.module.account.utils.c.c(this.f78530t) == 1) {
            this.mTitleBar.setTitle(getString(R.string.my_game_x));
        } else {
            this.mTitleBar.setTitle(getString(R.string.his_game));
        }
        this.mTitleBarDivider.setVisibility(0);
        a aVar = new a(this.mContext, this.f78528r);
        this.f78529s = aVar;
        this.mRvGameList.setAdapter(aVar);
        this.mRvGameList.setLayoutManager(new LinearLayoutManager(this.mContext));
        this.mSmartRefreshLayout.S(new b());
        this.mSmartRefreshLayout.f0(new c());
        showLoading();
        U4();
    }

    @Override // com.max.hbminiprogram.fragment.BaseLittleProgramFragment, com.max.hbcommon.base.d
    public void onRefresh() {
        if (PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 24439, new Class[0], Void.TYPE).isSupported) {
            return;
        }
        this.f78526p = 0;
        showLoading();
        U4();
    }
}
