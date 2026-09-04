package com.max.xiaoheihe.module.bbs;

import android.content.Context;
import android.content.Intent;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import butterknife.BindView;
import butterknife.ButterKnife;
import com.max.hbcommon.base.BaseActivity;
import com.max.hbutils.bean.Result;
import com.max.xiaoheihe.R;
import com.max.xiaoheihe.bean.bbs.BBSFollowedMomentObj;
import com.max.xiaoheihe.bean.game.GameObj;
import com.max.xiaoheihe.module.game.a2;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.PatchProxyResult;
import com.scwang.smartrefresh.layout.SmartRefreshLayout;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes10.dex */
public class LinkMomentsActivity extends BaseActivity {
    private static final String R = "group_id";
    private static final String S = "user_id";
    private static final String T = "content_type";
    public static ChangeQuickRedirect changeQuickRedirect;
    private String L;
    private String M;
    private String N;
    private com.max.xiaoheihe.module.game.adapter.u O;
    private List<GameObj> P = new ArrayList();
    private a2 Q = new a2();

    @BindView(R.id.rv)
    RecyclerView mRecyclerView;

    @BindView(R.id.srl)
    SmartRefreshLayout mRefreshLayout;

    public class a implements pg.d {
        public static ChangeQuickRedirect changeQuickRedirect;

        a() {
        }

        @Override // pg.d
        public void k(ng.j jVar) {
            if (PatchProxy.proxy(new Object[]{jVar}, this, changeQuickRedirect, false, 26717, new Class[]{ng.j.class}, Void.TYPE).isSupported) {
                return;
            }
            LinkMomentsActivity.M1(LinkMomentsActivity.this);
        }
    }

    public class b extends com.max.hbcommon.network.d<Result<BBSFollowedMomentObj>> {
        public static ChangeQuickRedirect changeQuickRedirect;

        b() {
        }

        @Override // com.max.hbcommon.network.d, io.reactivex.g0
        public void onComplete() {
            if (!PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 26719, new Class[0], Void.TYPE).isSupported && LinkMomentsActivity.this.isActive()) {
                super.onComplete();
                LinkMomentsActivity.this.mRefreshLayout.A(0);
                LinkMomentsActivity.this.mRefreshLayout.p(0);
            }
        }

        @Override // com.max.hbcommon.network.d, io.reactivex.g0
        public void onError(Throwable th2) {
            if (!PatchProxy.proxy(new Object[]{th2}, this, changeQuickRedirect, false, 26718, new Class[]{Throwable.class}, Void.TYPE).isSupported && LinkMomentsActivity.this.isActive()) {
                super.onError(th2);
                LinkMomentsActivity.N1(LinkMomentsActivity.this);
                LinkMomentsActivity.this.mRefreshLayout.A(0);
                LinkMomentsActivity.this.mRefreshLayout.p(0);
            }
        }

        public void onNext(Result<BBSFollowedMomentObj> result) {
            if (!PatchProxy.proxy(new Object[]{result}, this, changeQuickRedirect, false, 26720, new Class[]{Result.class}, Void.TYPE).isSupported && LinkMomentsActivity.this.isActive()) {
                super.onNext(result);
                LinkMomentsActivity.O1(LinkMomentsActivity.this, result.getResult());
            }
        }

        @Override // com.max.hbcommon.network.d, io.reactivex.g0
        public /* bridge */ /* synthetic */ void onNext(Object obj) {
            if (PatchProxy.proxy(new Object[]{obj}, this, changeQuickRedirect, false, 26721, new Class[]{Object.class}, Void.TYPE).isSupported) {
                return;
            }
            onNext((Result<BBSFollowedMomentObj>) obj);
        }
    }

    static /* synthetic */ void M1(LinkMomentsActivity linkMomentsActivity) {
        if (PatchProxy.proxy(new Object[]{linkMomentsActivity}, null, changeQuickRedirect, true, 26714, new Class[]{LinkMomentsActivity.class}, Void.TYPE).isSupported) {
            return;
        }
        linkMomentsActivity.R1();
    }

    static /* synthetic */ void N1(LinkMomentsActivity linkMomentsActivity) {
        if (PatchProxy.proxy(new Object[]{linkMomentsActivity}, null, changeQuickRedirect, true, 26715, new Class[]{LinkMomentsActivity.class}, Void.TYPE).isSupported) {
            return;
        }
        linkMomentsActivity.C1();
    }

    static /* synthetic */ void O1(LinkMomentsActivity linkMomentsActivity, BBSFollowedMomentObj bBSFollowedMomentObj) {
        if (PatchProxy.proxy(new Object[]{linkMomentsActivity, bBSFollowedMomentObj}, null, changeQuickRedirect, true, 26716, new Class[]{LinkMomentsActivity.class, BBSFollowedMomentObj.class}, Void.TYPE).isSupported) {
            return;
        }
        linkMomentsActivity.T1(bBSFollowedMomentObj);
    }

    public static Intent Q1(Context context, String str, String str2, String str3) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{context, str, str2, str3}, null, changeQuickRedirect, true, 26708, new Class[]{Context.class, String.class, String.class, String.class}, Intent.class);
        if (patchProxyResultProxy.isSupported) {
            return (Intent) patchProxyResultProxy.result;
        }
        Intent intent = new Intent(context, (Class<?>) LinkMomentsActivity.class);
        intent.putExtra("group_id", str);
        intent.putExtra("user_id", str2);
        intent.putExtra(T, str3);
        return intent;
    }

    private void R1() {
        if (PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 26710, new Class[0], Void.TYPE).isSupported) {
            return;
        }
        V((io.reactivex.disposables.b) com.max.xiaoheihe.network.i.a().Z2(this.L, this.M, this.N, null).I5(io.reactivex.schedulers.b.d()).a4(io.reactivex.android.schedulers.a.c()).J5(new b()));
    }

    private void T1(BBSFollowedMomentObj bBSFollowedMomentObj) {
        if (PatchProxy.proxy(new Object[]{bBSFollowedMomentObj}, this, changeQuickRedirect, false, 26711, new Class[]{BBSFollowedMomentObj.class}, Void.TYPE).isSupported) {
            return;
        }
        x1();
        if (bBSFollowedMomentObj == null || bBSFollowedMomentObj.getItems() == null) {
            return;
        }
        this.P.clear();
        this.P.addAll(bBSFollowedMomentObj.getItems());
        this.O.notifyDataSetChanged();
    }

    @Override // com.max.hbcommon.base.BaseActivity
    public void k1() {
        if (PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 26709, new Class[0], Void.TYPE).isSupported) {
            return;
        }
        setContentView(R.layout.layout_sample_refresh_rv);
        ButterKnife.a(this);
        this.L = getIntent().getStringExtra("group_id");
        this.M = getIntent().getStringExtra("user_id");
        this.N = getIntent().getStringExtra(T);
        this.f66616q.setTitle(getString(R.string.game));
        this.f66617r.setVisibility(0);
        this.O = new com.max.xiaoheihe.module.game.adapter.u(this.f66601b, this.P, this.Q, null);
        this.mRecyclerView.setLayoutManager(new LinearLayoutManager(this.f66601b));
        this.mRefreshLayout.S(new a());
        this.mRefreshLayout.b0(false);
        E1();
        R1();
    }

    @Override // com.max.hbcommon.base.BaseActivity
    public void n1() {
        if (PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 26712, new Class[0], Void.TYPE).isSupported) {
            return;
        }
        E1();
        R1();
    }

    @Override // com.max.hbcommon.base.BaseActivity, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, android.app.Activity
    public void onDestroy() {
        if (PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 26713, new Class[0], Void.TYPE).isSupported) {
            return;
        }
        super.onDestroy();
        this.Q.f();
    }
}
