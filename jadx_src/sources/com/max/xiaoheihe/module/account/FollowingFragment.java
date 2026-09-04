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
import com.max.xiaoheihe.bean.account.FollowingListObj;
import com.max.xiaoheihe.bean.game.GameObj;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.PatchProxyResult;
import com.scwang.smartrefresh.layout.SmartRefreshLayout;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes9.dex */
public class FollowingFragment extends NativeLittleProgramFragment {
    public static ChangeQuickRedirect changeQuickRedirect = null;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    private static final String f77790v = "FollowingFragment";

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    private static final String f77791w = "heyboxId";

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    private static final String f77792x = "steamId";

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    private static final String f77793y = "nickname";

    @BindView(R.id.rv_following_list)
    RecyclerView mRvFollowingList;

    @BindView(R.id.srl_following_list_wrapper)
    SmartRefreshLayout mSmartRefreshLayout;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    private com.max.hbcommon.base.adapter.s<GameObj> f77796r;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    private String f77799u;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    private int f77794p = 0;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    private List<GameObj> f77795q = new ArrayList();

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    private String f77797s = "-1";

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    private String f77798t = "-1";

    public class a extends com.max.hbcommon.base.adapter.s<GameObj> {
        public static ChangeQuickRedirect changeQuickRedirect;

        a(Context context, List list, int i10) {
            super(context, list, i10);
        }

        public void m(com.max.hbcommon.base.adapter.s.e eVar, GameObj gameObj) {
            if (PatchProxy.proxy(new Object[]{eVar, gameObj}, this, changeQuickRedirect, false, 22928, new Class[]{com.max.hbcommon.base.adapter.s.e.class, GameObj.class}, Void.TYPE).isSupported) {
                return;
            }
            com.max.xiaoheihe.module.account.utils.l.H((ViewGroup) eVar.b(), gameObj, eVar.getAdapterPosition() == getItemCount() - 1);
        }

        @Override // com.max.hbcommon.base.adapter.s
        public /* bridge */ /* synthetic */ void onBindViewHolder(com.max.hbcommon.base.adapter.s.e eVar, GameObj gameObj) {
            if (PatchProxy.proxy(new Object[]{eVar, gameObj}, this, changeQuickRedirect, false, 22929, new Class[]{com.max.hbcommon.base.adapter.s.e.class, Object.class}, Void.TYPE).isSupported) {
                return;
            }
            m(eVar, gameObj);
        }
    }

    public class b implements pg.d {
        public static ChangeQuickRedirect changeQuickRedirect;

        b() {
        }

        @Override // pg.d
        public void k(ng.j jVar) {
            if (PatchProxy.proxy(new Object[]{jVar}, this, changeQuickRedirect, false, 22930, new Class[]{ng.j.class}, Void.TYPE).isSupported) {
                return;
            }
            FollowingFragment.this.f77794p = 0;
            FollowingFragment.K4(FollowingFragment.this);
        }
    }

    public class c implements pg.b {
        public static ChangeQuickRedirect changeQuickRedirect;

        c() {
        }

        @Override // pg.b
        public void f(ng.j jVar) {
            if (PatchProxy.proxy(new Object[]{jVar}, this, changeQuickRedirect, false, 22931, new Class[]{ng.j.class}, Void.TYPE).isSupported) {
                return;
            }
            FollowingFragment.J4(FollowingFragment.this, 30);
            FollowingFragment.K4(FollowingFragment.this);
        }
    }

    public class d extends com.max.hbcommon.network.d<Result<FollowingListObj>> {
        public static ChangeQuickRedirect changeQuickRedirect;

        d() {
        }

        @Override // com.max.hbcommon.network.d, io.reactivex.g0
        public void onComplete() {
            if (!PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 22933, new Class[0], Void.TYPE).isSupported && FollowingFragment.this.isActive()) {
                FollowingFragment.this.mSmartRefreshLayout.A(0);
                FollowingFragment.this.mSmartRefreshLayout.p(0);
            }
        }

        @Override // com.max.hbcommon.network.d, io.reactivex.g0
        public void onError(Throwable th2) {
            if (!PatchProxy.proxy(new Object[]{th2}, this, changeQuickRedirect, false, 22932, new Class[]{Throwable.class}, Void.TYPE).isSupported && FollowingFragment.this.isActive()) {
                FollowingFragment.this.mSmartRefreshLayout.A(0);
                FollowingFragment.this.mSmartRefreshLayout.p(0);
                super.onError(th2);
                FollowingFragment.L4(FollowingFragment.this);
                th2.printStackTrace();
            }
        }

        public void onNext(Result<FollowingListObj> result) {
            if (!PatchProxy.proxy(new Object[]{result}, this, changeQuickRedirect, false, 22934, new Class[]{Result.class}, Void.TYPE).isSupported && FollowingFragment.this.isActive()) {
                super.onNext(result);
                FollowingListObj result2 = result.getResult();
                if (result2 != null) {
                    FollowingFragment.M4(FollowingFragment.this, result2.getFollowing());
                } else {
                    FollowingFragment.N4(FollowingFragment.this);
                }
            }
        }

        @Override // com.max.hbcommon.network.d, io.reactivex.g0
        public /* bridge */ /* synthetic */ void onNext(Object obj) {
            if (PatchProxy.proxy(new Object[]{obj}, this, changeQuickRedirect, false, 22935, new Class[]{Object.class}, Void.TYPE).isSupported) {
                return;
            }
            onNext((Result<FollowingListObj>) obj);
        }
    }

    static /* synthetic */ int J4(FollowingFragment followingFragment, int i10) {
        int i11 = followingFragment.f77794p + i10;
        followingFragment.f77794p = i11;
        return i11;
    }

    static /* synthetic */ void K4(FollowingFragment followingFragment) {
        if (PatchProxy.proxy(new Object[]{followingFragment}, null, changeQuickRedirect, true, 22924, new Class[]{FollowingFragment.class}, Void.TYPE).isSupported) {
            return;
        }
        followingFragment.O4();
    }

    static /* synthetic */ void L4(FollowingFragment followingFragment) {
        if (PatchProxy.proxy(new Object[]{followingFragment}, null, changeQuickRedirect, true, 22925, new Class[]{FollowingFragment.class}, Void.TYPE).isSupported) {
            return;
        }
        followingFragment.showError();
    }

    static /* synthetic */ void M4(FollowingFragment followingFragment, List list) {
        if (PatchProxy.proxy(new Object[]{followingFragment, list}, null, changeQuickRedirect, true, 22926, new Class[]{FollowingFragment.class, List.class}, Void.TYPE).isSupported) {
            return;
        }
        followingFragment.Q4(list);
    }

    static /* synthetic */ void N4(FollowingFragment followingFragment) {
        if (PatchProxy.proxy(new Object[]{followingFragment}, null, changeQuickRedirect, true, 22927, new Class[]{FollowingFragment.class}, Void.TYPE).isSupported) {
            return;
        }
        followingFragment.showError();
    }

    private void O4() {
        if (PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 22921, new Class[0], Void.TYPE).isSupported) {
            return;
        }
        addDisposable((io.reactivex.disposables.b) com.max.xiaoheihe.network.i.a().j7(this.f77797s, this.f77794p, 30).I5(io.reactivex.schedulers.b.d()).a4(io.reactivex.android.schedulers.a.c()).J5(new d()));
    }

    public static FollowingFragment P4(String str, String str2, String str3) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{str, str2, str3}, null, changeQuickRedirect, true, 22919, new Class[]{String.class, String.class, String.class}, FollowingFragment.class);
        if (patchProxyResultProxy.isSupported) {
            return (FollowingFragment) patchProxyResultProxy.result;
        }
        FollowingFragment followingFragment = new FollowingFragment();
        Bundle bundle = new Bundle();
        bundle.putString("heyboxId", str);
        bundle.putString("steamId", str2);
        bundle.putString("nickname", str3);
        followingFragment.setArguments(bundle);
        return followingFragment;
    }

    private void Q4(List<GameObj> list) {
        if (PatchProxy.proxy(new Object[]{list}, this, changeQuickRedirect, false, 22923, new Class[]{List.class}, Void.TYPE).isSupported) {
            return;
        }
        showContentView();
        if (this.mSmartRefreshLayout != null) {
            if (this.f77794p == 0) {
                this.f77795q.clear();
            }
            this.f77795q.addAll(list);
            this.f77796r.notifyDataSetChanged();
        }
    }

    @Override // com.max.hbminiprogram.NativeLittleProgramFragment, com.max.hbminiprogram.fragment.BaseLittleProgramFragment
    public void a4(View view, boolean z10) {
        if (PatchProxy.proxy(new Object[]{view, new Byte(z10 ? (byte) 1 : (byte) 0)}, this, changeQuickRedirect, false, 22920, new Class[]{View.class, Boolean.TYPE}, Void.TYPE).isSupported) {
            return;
        }
        super.a4(view, z10);
        setContentView(R.layout.fragment_following);
        this.mUnBinder = ButterKnife.f(this, view);
        if (getArguments() != null) {
            this.f77797s = getArguments().getString("heyboxId");
            this.f77798t = getArguments().getString("steamId");
            this.f77799u = getArguments().getString("nickname");
            String str = this.f77797s;
            if (str == null) {
                str = "-1";
            }
            this.f77797s = str;
            String str2 = this.f77798t;
            this.f77798t = str2 != null ? str2 : "-1";
        }
        this.mTitleBar.setVisibility(0);
        this.mTitleBar.setBackgroundResource(R.color.appbar_bg_color);
        this.mTitleBar.a0();
        if (com.max.xiaoheihe.module.account.utils.c.c(this.f77797s) == 1) {
            this.mTitleBar.setTitle(getString(R.string.my_follow));
        } else {
            this.mTitleBar.setTitle(getString(R.string.his_follow));
        }
        this.mTitleBarDivider.setVisibility(0);
        a aVar = new a(this.mContext, this.f77795q, R.layout.item_game);
        this.f77796r = aVar;
        this.mRvFollowingList.setAdapter(aVar);
        this.mRvFollowingList.setLayoutManager(new LinearLayoutManager(this.mContext));
        this.mSmartRefreshLayout.S(new b());
        this.mSmartRefreshLayout.f0(new c());
        showLoading();
        O4();
    }

    @Override // com.max.hbminiprogram.fragment.BaseLittleProgramFragment, com.max.hbcommon.base.d
    public void onRefresh() {
        if (PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 22922, new Class[0], Void.TYPE).isSupported) {
            return;
        }
        this.f77794p = 0;
        showLoading();
        O4();
    }
}
