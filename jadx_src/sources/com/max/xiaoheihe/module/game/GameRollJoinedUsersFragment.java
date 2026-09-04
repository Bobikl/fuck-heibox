package com.max.xiaoheihe.module.game;

import android.content.Context;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import butterknife.BindView;
import butterknife.ButterKnife;
import com.max.hbminiprogram.NativeLittleProgramFragment;
import com.max.hbutils.bean.Result;
import com.max.xiaoheihe.R;
import com.max.xiaoheihe.bean.bbs.BBSUserInfoObj;
import com.max.xiaoheihe.bean.bbs.BBSUserListObj;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.PatchProxyResult;
import com.scwang.smartrefresh.layout.SmartRefreshLayout;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

/* JADX INFO: loaded from: classes11.dex */
@n9.a({com.max.hbminiprogram.d.class})
public class GameRollJoinedUsersFragment extends NativeLittleProgramFragment implements com.max.hbminiprogram.d {
    public static ChangeQuickRedirect changeQuickRedirect = null;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    private static final String f84715t = "room_id";

    @BindView(R.id.rv)
    RecyclerView mRecyclerView;

    @BindView(R.id.srl)
    SmartRefreshLayout mRefreshLayout;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    private String f84716p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    private com.max.hbcommon.base.adapter.s<BBSUserInfoObj> f84717q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    private List<BBSUserInfoObj> f84718r = new ArrayList();

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    private int f84719s;

    public class a extends com.max.hbcommon.base.adapter.s<BBSUserInfoObj> {
        public static ChangeQuickRedirect changeQuickRedirect;

        /* JADX INFO: renamed from: com.max.xiaoheihe.module.game.GameRollJoinedUsersFragment$a$a, reason: collision with other inner class name */
        public class ViewOnClickListenerC0752a implements View.OnClickListener {
            public static ChangeQuickRedirect changeQuickRedirect;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            final /* synthetic */ String f84721b;

            ViewOnClickListenerC0752a(String str) {
                this.f84721b = str;
            }

            @Override // android.view.View.OnClickListener
            public void onClick(View view) {
                if (PatchProxy.proxy(new Object[]{view}, this, changeQuickRedirect, false, 33621, new Class[]{View.class}, Void.TYPE).isSupported) {
                    return;
                }
                com.max.xiaoheihe.base.router.b.T(((com.max.hbcommon.base.d) GameRollJoinedUsersFragment.this).mContext, this.f84721b).A();
            }
        }

        a(Context context, List list, int i10) {
            super(context, list, i10);
        }

        public void m(com.max.hbcommon.base.adapter.s.e eVar, BBSUserInfoObj bBSUserInfoObj) {
            if (PatchProxy.proxy(new Object[]{eVar, bBSUserInfoObj}, this, changeQuickRedirect, false, 33619, new Class[]{com.max.hbcommon.base.adapter.s.e.class, BBSUserInfoObj.class}, Void.TYPE).isSupported) {
                return;
            }
            ImageView imageView = (ImageView) eVar.i(R.id.iv_avatar);
            TextView textView = (TextView) eVar.i(R.id.tv_name);
            View viewB = eVar.b();
            com.max.hbimage.b.I(bBSUserInfoObj.getAvartar(), imageView, R.drawable.common_default_avatar_40x40);
            textView.setText(bBSUserInfoObj.getUsername());
            String userid = bBSUserInfoObj.getUserid();
            if (com.max.hbcommon.utils.c.u(userid)) {
                viewB.setClickable(false);
            } else {
                viewB.setOnClickListener(new ViewOnClickListenerC0752a(userid));
            }
        }

        @Override // com.max.hbcommon.base.adapter.s
        public /* bridge */ /* synthetic */ void onBindViewHolder(com.max.hbcommon.base.adapter.s.e eVar, BBSUserInfoObj bBSUserInfoObj) {
            if (PatchProxy.proxy(new Object[]{eVar, bBSUserInfoObj}, this, changeQuickRedirect, false, 33620, new Class[]{com.max.hbcommon.base.adapter.s.e.class, Object.class}, Void.TYPE).isSupported) {
                return;
            }
            m(eVar, bBSUserInfoObj);
        }
    }

    public class b implements pg.d {
        public static ChangeQuickRedirect changeQuickRedirect;

        b() {
        }

        @Override // pg.d
        public void k(ng.j jVar) {
            if (PatchProxy.proxy(new Object[]{jVar}, this, changeQuickRedirect, false, 33622, new Class[]{ng.j.class}, Void.TYPE).isSupported) {
                return;
            }
            GameRollJoinedUsersFragment.this.f84719s = 0;
            GameRollJoinedUsersFragment.L4(GameRollJoinedUsersFragment.this);
        }
    }

    public class c implements pg.b {
        public static ChangeQuickRedirect changeQuickRedirect;

        c() {
        }

        @Override // pg.b
        public void f(ng.j jVar) {
            if (PatchProxy.proxy(new Object[]{jVar}, this, changeQuickRedirect, false, 33623, new Class[]{ng.j.class}, Void.TYPE).isSupported) {
                return;
            }
            GameRollJoinedUsersFragment.K4(GameRollJoinedUsersFragment.this, 30);
            GameRollJoinedUsersFragment.L4(GameRollJoinedUsersFragment.this);
        }
    }

    public class d extends com.max.hbcommon.network.d<Result<BBSUserListObj>> {
        public static ChangeQuickRedirect changeQuickRedirect;

        d() {
        }

        @Override // com.max.hbcommon.network.d, io.reactivex.g0
        public void onComplete() {
            if (!PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 33625, new Class[0], Void.TYPE).isSupported && GameRollJoinedUsersFragment.this.isActive()) {
                super.onComplete();
                GameRollJoinedUsersFragment.this.mRefreshLayout.A(0);
                GameRollJoinedUsersFragment.this.mRefreshLayout.p(0);
            }
        }

        @Override // com.max.hbcommon.network.d, io.reactivex.g0
        public void onError(Throwable th2) {
            if (!PatchProxy.proxy(new Object[]{th2}, this, changeQuickRedirect, false, 33624, new Class[]{Throwable.class}, Void.TYPE).isSupported && GameRollJoinedUsersFragment.this.isActive()) {
                super.onError(th2);
                GameRollJoinedUsersFragment.M4(GameRollJoinedUsersFragment.this);
                GameRollJoinedUsersFragment.this.mRefreshLayout.A(0);
                GameRollJoinedUsersFragment.this.mRefreshLayout.p(0);
            }
        }

        public void onNext(Result<BBSUserListObj> result) {
            if (!PatchProxy.proxy(new Object[]{result}, this, changeQuickRedirect, false, 33626, new Class[]{Result.class}, Void.TYPE).isSupported && GameRollJoinedUsersFragment.this.isActive()) {
                super.onNext(result);
                GameRollJoinedUsersFragment.N4(GameRollJoinedUsersFragment.this, result.getResult());
            }
        }

        @Override // com.max.hbcommon.network.d, io.reactivex.g0
        public /* bridge */ /* synthetic */ void onNext(Object obj) {
            if (PatchProxy.proxy(new Object[]{obj}, this, changeQuickRedirect, false, 33627, new Class[]{Object.class}, Void.TYPE).isSupported) {
                return;
            }
            onNext((Result<BBSUserListObj>) obj);
        }
    }

    static /* synthetic */ int K4(GameRollJoinedUsersFragment gameRollJoinedUsersFragment, int i10) {
        int i11 = gameRollJoinedUsersFragment.f84719s + i10;
        gameRollJoinedUsersFragment.f84719s = i11;
        return i11;
    }

    static /* synthetic */ void L4(GameRollJoinedUsersFragment gameRollJoinedUsersFragment) {
        if (PatchProxy.proxy(new Object[]{gameRollJoinedUsersFragment}, null, changeQuickRedirect, true, 33616, new Class[]{GameRollJoinedUsersFragment.class}, Void.TYPE).isSupported) {
            return;
        }
        gameRollJoinedUsersFragment.O4();
    }

    static /* synthetic */ void M4(GameRollJoinedUsersFragment gameRollJoinedUsersFragment) {
        if (PatchProxy.proxy(new Object[]{gameRollJoinedUsersFragment}, null, changeQuickRedirect, true, 33617, new Class[]{GameRollJoinedUsersFragment.class}, Void.TYPE).isSupported) {
            return;
        }
        gameRollJoinedUsersFragment.showError();
    }

    static /* synthetic */ void N4(GameRollJoinedUsersFragment gameRollJoinedUsersFragment, BBSUserListObj bBSUserListObj) {
        if (PatchProxy.proxy(new Object[]{gameRollJoinedUsersFragment, bBSUserListObj}, null, changeQuickRedirect, true, 33618, new Class[]{GameRollJoinedUsersFragment.class, BBSUserListObj.class}, Void.TYPE).isSupported) {
            return;
        }
        gameRollJoinedUsersFragment.Q4(bBSUserListObj);
    }

    private void O4() {
        if (PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 33612, new Class[0], Void.TYPE).isSupported) {
            return;
        }
        addDisposable((io.reactivex.disposables.b) com.max.xiaoheihe.network.i.a().i6(this.f84716p, this.f84719s, 30).I5(io.reactivex.schedulers.b.d()).a4(io.reactivex.android.schedulers.a.c()).J5(new d()));
    }

    public static GameRollJoinedUsersFragment P4(String str) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{str}, null, changeQuickRedirect, true, 33610, new Class[]{String.class}, GameRollJoinedUsersFragment.class);
        if (patchProxyResultProxy.isSupported) {
            return (GameRollJoinedUsersFragment) patchProxyResultProxy.result;
        }
        GameRollJoinedUsersFragment gameRollJoinedUsersFragment = new GameRollJoinedUsersFragment();
        Bundle bundle = new Bundle();
        bundle.putString(f84715t, str);
        gameRollJoinedUsersFragment.setArguments(bundle);
        return gameRollJoinedUsersFragment;
    }

    private void Q4(BBSUserListObj bBSUserListObj) {
        if (PatchProxy.proxy(new Object[]{bBSUserListObj}, this, changeQuickRedirect, false, 33613, new Class[]{BBSUserListObj.class}, Void.TYPE).isSupported) {
            return;
        }
        if (bBSUserListObj != null && bBSUserListObj.getList() != null) {
            if (this.f84719s == 0) {
                this.f84718r.clear();
            }
            this.f84718r.addAll(bBSUserListObj.getList());
            this.f84717q.notifyDataSetChanged();
        }
        if (this.f84718r.size() > 0) {
            showContentView();
        } else {
            showEmpty();
        }
    }

    @Override // com.max.hbminiprogram.NativeLittleProgramFragment, com.max.hbminiprogram.d
    @androidx.annotation.n0
    public Fragment a2(@androidx.annotation.p0 Map<String, ?> map) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{map}, this, changeQuickRedirect, false, 33615, new Class[]{Map.class}, Fragment.class);
        return patchProxyResultProxy.isSupported ? (Fragment) patchProxyResultProxy.result : P4(map.get(f84715t).toString());
    }

    @Override // com.max.hbminiprogram.NativeLittleProgramFragment, com.max.hbminiprogram.fragment.BaseLittleProgramFragment
    public void a4(View view, boolean z10) {
        if (PatchProxy.proxy(new Object[]{view, new Byte(z10 ? (byte) 1 : (byte) 0)}, this, changeQuickRedirect, false, 33611, new Class[]{View.class, Boolean.TYPE}, Void.TYPE).isSupported) {
            return;
        }
        super.a4(view, z10);
        setContentView(R.layout.layout_sample_refresh_rv);
        this.mUnBinder = ButterKnife.f(this, view);
        this.f84716p = getArguments().getString(f84715t);
        this.mTitleBar.setTitle(getString(R.string.joined_users));
        this.mTitleBarDivider.setVisibility(0);
        this.f84717q = new a(this.mContext, this.f84718r, R.layout.item_follow_list);
        this.mRecyclerView.setLayoutManager(new LinearLayoutManager(this.mContext));
        this.mRecyclerView.setAdapter(this.f84717q);
        this.mRefreshLayout.S(new b());
        this.mRefreshLayout.f0(new c());
        showLoading();
        O4();
    }

    @Override // com.max.hbminiprogram.fragment.BaseLittleProgramFragment, com.max.hbcommon.base.d
    public void onRefresh() {
        if (PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 33614, new Class[0], Void.TYPE).isSupported) {
            return;
        }
        showLoading();
        O4();
    }
}
