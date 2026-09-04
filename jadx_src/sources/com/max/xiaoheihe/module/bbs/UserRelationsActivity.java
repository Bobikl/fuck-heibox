package com.max.xiaoheihe.module.bbs;

import android.content.Context;
import android.content.Intent;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import butterknife.BindView;
import butterknife.ButterKnife;
import com.max.hbcommon.base.BaseActivity;
import com.max.hbutils.bean.Result;
import com.max.hbutils.utils.ViewUtils;
import com.max.xiaoheihe.R;
import com.max.xiaoheihe.bean.bbs.BBSUserInfoObj;
import com.max.xiaoheihe.bean.bbs.BBSUserRelationsObj;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.PatchProxyResult;
import com.scwang.smartrefresh.layout.SmartRefreshLayout;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes10.dex */
@ig.d(path = {lb.d.f131188j4})
public class UserRelationsActivity extends BaseActivity {
    private static final String O = "not_in_blacklist";
    private static final String P = "in_blacklist";
    public static ChangeQuickRedirect changeQuickRedirect;
    private com.max.hbcommon.base.adapter.s<BBSUserInfoObj> M;

    @BindView(R.id.rv)
    RecyclerView mRecyclerView;

    @BindView(R.id.srl)
    SmartRefreshLayout mRefreshLayout;
    private int L = 0;
    private List<BBSUserInfoObj> N = new ArrayList();

    public class a extends com.max.hbcommon.base.adapter.s<BBSUserInfoObj> {
        public static ChangeQuickRedirect changeQuickRedirect;

        /* JADX INFO: renamed from: com.max.xiaoheihe.module.bbs.UserRelationsActivity$a$a, reason: collision with other inner class name */
        public class ViewOnClickListenerC0672a implements View.OnClickListener {
            public static ChangeQuickRedirect changeQuickRedirect;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            final /* synthetic */ BBSUserInfoObj f80211b;

            /* JADX INFO: renamed from: c, reason: collision with root package name */
            final /* synthetic */ TextView f80212c;

            ViewOnClickListenerC0672a(BBSUserInfoObj bBSUserInfoObj, TextView textView) {
                this.f80211b = bBSUserInfoObj;
                this.f80212c = textView;
            }

            @Override // android.view.View.OnClickListener
            public void onClick(View view) {
                if (PatchProxy.proxy(new Object[]{view}, this, changeQuickRedirect, false, 27103, new Class[]{View.class}, Void.TYPE).isSupported) {
                    return;
                }
                if (UserRelationsActivity.O.equals(this.f80211b.getFollow_status())) {
                    a.m(a.this, this.f80212c, UserRelationsActivity.P);
                    UserRelationsActivity.h2(UserRelationsActivity.this, this.f80211b);
                } else {
                    a.m(a.this, this.f80212c, UserRelationsActivity.O);
                    UserRelationsActivity.i2(UserRelationsActivity.this, this.f80211b);
                }
            }
        }

        public class b implements View.OnClickListener {
            public static ChangeQuickRedirect changeQuickRedirect;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            final /* synthetic */ BBSUserInfoObj f80214b;

            b(BBSUserInfoObj bBSUserInfoObj) {
                this.f80214b = bBSUserInfoObj;
            }

            @Override // android.view.View.OnClickListener
            public void onClick(View view) {
                if (PatchProxy.proxy(new Object[]{view}, this, changeQuickRedirect, false, 27104, new Class[]{View.class}, Void.TYPE).isSupported) {
                    return;
                }
                com.max.xiaoheihe.base.router.b.T(((BaseActivity) UserRelationsActivity.this).f66601b, this.f80214b.getUserid()).A();
            }
        }

        a(Context context, List list, int i10) {
            super(context, list, i10);
        }

        static /* synthetic */ void m(a aVar, TextView textView, String str) {
            if (PatchProxy.proxy(new Object[]{aVar, textView, str}, null, changeQuickRedirect, true, 27102, new Class[]{a.class, TextView.class, String.class}, Void.TYPE).isSupported) {
                return;
            }
            aVar.o(textView, str);
        }

        private void o(TextView textView, String str) {
            if (PatchProxy.proxy(new Object[]{textView, str}, this, changeQuickRedirect, false, 27100, new Class[]{TextView.class, String.class}, Void.TYPE).isSupported) {
                return;
            }
            if (UserRelationsActivity.O.equals(str)) {
                textView.setBackgroundDrawable(((BaseActivity) UserRelationsActivity.this).f66601b.getResources().getDrawable(R.drawable.btn_interactive_2dp));
                textView.setTextColor(((BaseActivity) UserRelationsActivity.this).f66601b.getResources().getColor(R.color.white));
                textView.setText(((BaseActivity) UserRelationsActivity.this).f66601b.getResources().getString(R.string.pull_sb_into_blacklist));
            } else {
                textView.setBackgroundDrawable(((BaseActivity) UserRelationsActivity.this).f66601b.getResources().getDrawable(R.drawable.btn_error_2dp));
                textView.setTextColor(((BaseActivity) UserRelationsActivity.this).f66601b.getResources().getColor(R.color.white));
                textView.setText(((BaseActivity) UserRelationsActivity.this).f66601b.getResources().getString(R.string.drop_sb_from_blacklist));
            }
        }

        public void n(com.max.hbcommon.base.adapter.s.e eVar, BBSUserInfoObj bBSUserInfoObj) {
            if (PatchProxy.proxy(new Object[]{eVar, bBSUserInfoObj}, this, changeQuickRedirect, false, 27099, new Class[]{com.max.hbcommon.base.adapter.s.e.class, BBSUserInfoObj.class}, Void.TYPE).isSupported) {
                return;
            }
            ImageView imageView = (ImageView) eVar.i(R.id.iv_avatar);
            TextView textView = (TextView) eVar.i(R.id.tv_name);
            TextView textView2 = (TextView) eVar.i(R.id.tv_follow_state);
            com.max.hbimage.b.I(bBSUserInfoObj.getAvartar(), imageView, R.drawable.common_default_avatar_40x40);
            textView.setText(bBSUserInfoObj.getUsername());
            textView2.setMinWidth(ViewUtils.f(((BaseActivity) UserRelationsActivity.this).f66601b, 70.0f));
            textView2.setPadding(ViewUtils.f(((BaseActivity) UserRelationsActivity.this).f66601b, 9.0f), ViewUtils.f(((BaseActivity) UserRelationsActivity.this).f66601b, 6.0f), ViewUtils.f(((BaseActivity) UserRelationsActivity.this).f66601b, 9.0f), ViewUtils.f(((BaseActivity) UserRelationsActivity.this).f66601b, 6.0f));
            o(textView2, bBSUserInfoObj.getFollow_status());
            textView2.setOnClickListener(new ViewOnClickListenerC0672a(bBSUserInfoObj, textView2));
            eVar.b().setOnClickListener(new b(bBSUserInfoObj));
        }

        @Override // com.max.hbcommon.base.adapter.s
        public /* bridge */ /* synthetic */ void onBindViewHolder(com.max.hbcommon.base.adapter.s.e eVar, BBSUserInfoObj bBSUserInfoObj) {
            if (PatchProxy.proxy(new Object[]{eVar, bBSUserInfoObj}, this, changeQuickRedirect, false, 27101, new Class[]{com.max.hbcommon.base.adapter.s.e.class, Object.class}, Void.TYPE).isSupported) {
                return;
            }
            n(eVar, bBSUserInfoObj);
        }
    }

    public class b implements pg.d {
        public static ChangeQuickRedirect changeQuickRedirect;

        b() {
        }

        @Override // pg.d
        public void k(ng.j jVar) {
            if (PatchProxy.proxy(new Object[]{jVar}, this, changeQuickRedirect, false, 27105, new Class[]{ng.j.class}, Void.TYPE).isSupported) {
                return;
            }
            UserRelationsActivity.this.L = 0;
            UserRelationsActivity.Y1(UserRelationsActivity.this);
        }
    }

    public class c implements pg.b {
        public static ChangeQuickRedirect changeQuickRedirect;

        c() {
        }

        @Override // pg.b
        public void f(ng.j jVar) {
            if (PatchProxy.proxy(new Object[]{jVar}, this, changeQuickRedirect, false, 27106, new Class[]{ng.j.class}, Void.TYPE).isSupported) {
                return;
            }
            UserRelationsActivity.X1(UserRelationsActivity.this, 30);
            UserRelationsActivity.Y1(UserRelationsActivity.this);
        }
    }

    public class d extends com.max.hbcommon.network.d<Result<BBSUserRelationsObj>> {
        public static ChangeQuickRedirect changeQuickRedirect;

        d() {
        }

        @Override // com.max.hbcommon.network.d, io.reactivex.g0
        public void onComplete() {
            if (!PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 27108, new Class[0], Void.TYPE).isSupported && UserRelationsActivity.this.isActive()) {
                super.onComplete();
                UserRelationsActivity.this.mRefreshLayout.A(0);
                UserRelationsActivity.this.mRefreshLayout.p(0);
            }
        }

        @Override // com.max.hbcommon.network.d, io.reactivex.g0
        public void onError(Throwable th2) {
            if (!PatchProxy.proxy(new Object[]{th2}, this, changeQuickRedirect, false, 27107, new Class[]{Throwable.class}, Void.TYPE).isSupported && UserRelationsActivity.this.isActive()) {
                super.onError(th2);
                UserRelationsActivity.Z1(UserRelationsActivity.this);
                UserRelationsActivity.this.mRefreshLayout.A(0);
                UserRelationsActivity.this.mRefreshLayout.p(0);
            }
        }

        public void onNext(Result<BBSUserRelationsObj> result) {
            if (!PatchProxy.proxy(new Object[]{result}, this, changeQuickRedirect, false, 27109, new Class[]{Result.class}, Void.TYPE).isSupported && UserRelationsActivity.this.isActive()) {
                super.onNext(result);
                UserRelationsActivity.a2(UserRelationsActivity.this, result.getResult());
            }
        }

        @Override // com.max.hbcommon.network.d, io.reactivex.g0
        public /* bridge */ /* synthetic */ void onNext(Object obj) {
            if (PatchProxy.proxy(new Object[]{obj}, this, changeQuickRedirect, false, 27110, new Class[]{Object.class}, Void.TYPE).isSupported) {
                return;
            }
            onNext((Result<BBSUserRelationsObj>) obj);
        }
    }

    public class e extends com.max.hbcommon.network.d<Result> {
        public static ChangeQuickRedirect changeQuickRedirect;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ BBSUserInfoObj f80219b;

        e(BBSUserInfoObj bBSUserInfoObj) {
            this.f80219b = bBSUserInfoObj;
        }

        @Override // com.max.hbcommon.network.d, io.reactivex.g0
        public void onError(Throwable th2) {
            if (!PatchProxy.proxy(new Object[]{th2}, this, changeQuickRedirect, false, 27111, new Class[]{Throwable.class}, Void.TYPE).isSupported && UserRelationsActivity.this.isActive()) {
                super.onError(th2);
                UserRelationsActivity.this.M.notifyDataSetChanged();
            }
        }

        public void onNext(Result result) {
            if (!PatchProxy.proxy(new Object[]{result}, this, changeQuickRedirect, false, 27112, new Class[]{Result.class}, Void.TYPE).isSupported && UserRelationsActivity.this.isActive()) {
                super.onNext(result);
                this.f80219b.setFollow_status(UserRelationsActivity.O);
                if (com.max.hbcommon.utils.c.u(result.getMsg())) {
                    com.max.hbutils.utils.c cVar = com.max.hbutils.utils.c.f73533a;
                    com.max.hbutils.utils.c.f(UserRelationsActivity.this.getString(R.string.success));
                } else {
                    com.max.hbutils.utils.c cVar2 = com.max.hbutils.utils.c.f73533a;
                    com.max.hbutils.utils.c.f(result.getMsg());
                }
            }
        }

        @Override // com.max.hbcommon.network.d, io.reactivex.g0
        public /* bridge */ /* synthetic */ void onNext(Object obj) {
            if (PatchProxy.proxy(new Object[]{obj}, this, changeQuickRedirect, false, 27113, new Class[]{Object.class}, Void.TYPE).isSupported) {
                return;
            }
            onNext((Result) obj);
        }
    }

    public class f extends com.max.hbcommon.network.d<Result> {
        public static ChangeQuickRedirect changeQuickRedirect;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ BBSUserInfoObj f80221b;

        f(BBSUserInfoObj bBSUserInfoObj) {
            this.f80221b = bBSUserInfoObj;
        }

        @Override // com.max.hbcommon.network.d, io.reactivex.g0
        public void onError(Throwable th2) {
            if (!PatchProxy.proxy(new Object[]{th2}, this, changeQuickRedirect, false, 27114, new Class[]{Throwable.class}, Void.TYPE).isSupported && UserRelationsActivity.this.isActive()) {
                super.onError(th2);
                UserRelationsActivity.this.M.notifyDataSetChanged();
            }
        }

        public void onNext(Result result) {
            if (!PatchProxy.proxy(new Object[]{result}, this, changeQuickRedirect, false, 27115, new Class[]{Result.class}, Void.TYPE).isSupported && UserRelationsActivity.this.isActive()) {
                this.f80221b.setFollow_status(UserRelationsActivity.P);
                if (com.max.hbcommon.utils.c.u(result.getMsg())) {
                    com.max.hbutils.utils.c cVar = com.max.hbutils.utils.c.f73533a;
                    com.max.hbutils.utils.c.f(UserRelationsActivity.this.getString(R.string.success));
                } else {
                    com.max.hbutils.utils.c cVar2 = com.max.hbutils.utils.c.f73533a;
                    com.max.hbutils.utils.c.f(result.getMsg());
                }
            }
        }

        @Override // com.max.hbcommon.network.d, io.reactivex.g0
        public /* bridge */ /* synthetic */ void onNext(Object obj) {
            if (PatchProxy.proxy(new Object[]{obj}, this, changeQuickRedirect, false, 27116, new Class[]{Object.class}, Void.TYPE).isSupported) {
                return;
            }
            onNext((Result) obj);
        }
    }

    static /* synthetic */ int X1(UserRelationsActivity userRelationsActivity, int i10) {
        int i11 = userRelationsActivity.L + i10;
        userRelationsActivity.L = i11;
        return i11;
    }

    static /* synthetic */ void Y1(UserRelationsActivity userRelationsActivity) {
        if (PatchProxy.proxy(new Object[]{userRelationsActivity}, null, changeQuickRedirect, true, 27096, new Class[]{UserRelationsActivity.class}, Void.TYPE).isSupported) {
            return;
        }
        userRelationsActivity.n2();
    }

    static /* synthetic */ void Z1(UserRelationsActivity userRelationsActivity) {
        if (PatchProxy.proxy(new Object[]{userRelationsActivity}, null, changeQuickRedirect, true, 27097, new Class[]{UserRelationsActivity.class}, Void.TYPE).isSupported) {
            return;
        }
        userRelationsActivity.C1();
    }

    static /* synthetic */ void a2(UserRelationsActivity userRelationsActivity, BBSUserRelationsObj bBSUserRelationsObj) {
        if (PatchProxy.proxy(new Object[]{userRelationsActivity, bBSUserRelationsObj}, null, changeQuickRedirect, true, 27098, new Class[]{UserRelationsActivity.class, BBSUserRelationsObj.class}, Void.TYPE).isSupported) {
            return;
        }
        userRelationsActivity.p2(bBSUserRelationsObj);
    }

    static /* synthetic */ void h2(UserRelationsActivity userRelationsActivity, BBSUserInfoObj bBSUserInfoObj) {
        if (PatchProxy.proxy(new Object[]{userRelationsActivity, bBSUserInfoObj}, null, changeQuickRedirect, true, 27094, new Class[]{UserRelationsActivity.class, BBSUserInfoObj.class}, Void.TYPE).isSupported) {
            return;
        }
        userRelationsActivity.o2(bBSUserInfoObj);
    }

    static /* synthetic */ void i2(UserRelationsActivity userRelationsActivity, BBSUserInfoObj bBSUserInfoObj) {
        if (PatchProxy.proxy(new Object[]{userRelationsActivity, bBSUserInfoObj}, null, changeQuickRedirect, true, 27095, new Class[]{UserRelationsActivity.class, BBSUserInfoObj.class}, Void.TYPE).isSupported) {
            return;
        }
        userRelationsActivity.l2(bBSUserInfoObj);
    }

    private void l2(BBSUserInfoObj bBSUserInfoObj) {
        if (PatchProxy.proxy(new Object[]{bBSUserInfoObj}, this, changeQuickRedirect, false, 27090, new Class[]{BBSUserInfoObj.class}, Void.TYPE).isSupported) {
            return;
        }
        V((io.reactivex.disposables.b) com.max.xiaoheihe.network.i.a().R(bBSUserInfoObj.getUserid(), "-1").I5(io.reactivex.schedulers.b.d()).a4(io.reactivex.android.schedulers.a.c()).J5(new e(bBSUserInfoObj)));
    }

    public static Intent m2(Context context) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{context}, null, changeQuickRedirect, true, 27087, new Class[]{Context.class}, Intent.class);
        return patchProxyResultProxy.isSupported ? (Intent) patchProxyResultProxy.result : new Intent(context, (Class<?>) UserRelationsActivity.class);
    }

    private void n2() {
        if (PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 27089, new Class[0], Void.TYPE).isSupported) {
            return;
        }
        V((io.reactivex.disposables.b) com.max.xiaoheihe.network.i.a().O0(this.L, 30).I5(io.reactivex.schedulers.b.d()).a4(io.reactivex.android.schedulers.a.c()).J5(new d()));
    }

    private void o2(BBSUserInfoObj bBSUserInfoObj) {
        if (PatchProxy.proxy(new Object[]{bBSUserInfoObj}, this, changeQuickRedirect, false, 27091, new Class[]{BBSUserInfoObj.class}, Void.TYPE).isSupported) {
            return;
        }
        V((io.reactivex.disposables.b) com.max.xiaoheihe.network.i.a().L6(bBSUserInfoObj.getUserid(), "-1").I5(io.reactivex.schedulers.b.d()).a4(io.reactivex.android.schedulers.a.c()).J5(new f(bBSUserInfoObj)));
    }

    private void p2(BBSUserRelationsObj bBSUserRelationsObj) {
        if (PatchProxy.proxy(new Object[]{bBSUserRelationsObj}, this, changeQuickRedirect, false, 27092, new Class[]{BBSUserRelationsObj.class}, Void.TYPE).isSupported) {
            return;
        }
        if (bBSUserRelationsObj != null && bBSUserRelationsObj.getUsers() != null) {
            if (this.L == 0) {
                this.N.clear();
            }
            for (BBSUserInfoObj bBSUserInfoObj : bBSUserRelationsObj.getUsers()) {
                bBSUserInfoObj.setFollow_status(P);
                this.N.add(bBSUserInfoObj);
            }
            this.M.notifyDataSetChanged();
        }
        if (this.N.size() > 0) {
            x1();
        } else {
            y1();
        }
    }

    @Override // com.max.hbcommon.base.BaseActivity
    public void k1() {
        if (PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 27088, new Class[0], Void.TYPE).isSupported) {
            return;
        }
        setContentView(R.layout.layout_sample_refresh_rv);
        ButterKnife.a(this);
        this.f66616q.setTitle(getString(R.string.black_list_management));
        this.f66617r.setVisibility(0);
        this.M = new a(this.f66601b, this.N, R.layout.item_follow_list);
        this.mRecyclerView.setLayoutManager(new LinearLayoutManager(this.f66601b));
        this.mRecyclerView.setAdapter(this.M);
        this.mRefreshLayout.S(new b());
        this.mRefreshLayout.f0(new c());
        E1();
        n2();
    }

    @Override // com.max.hbcommon.base.BaseActivity
    public void n1() {
        if (PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 27093, new Class[0], Void.TYPE).isSupported) {
            return;
        }
        E1();
        n2();
    }
}
