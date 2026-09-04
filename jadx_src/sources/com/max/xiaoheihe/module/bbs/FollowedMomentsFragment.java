package com.max.xiaoheihe.module.bbs;

import android.annotation.SuppressLint;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import android.widget.TextView;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.google.gson.JsonObject;
import com.max.hbcommon.base.adapter.OneTimeValidExposureWatcher;
import com.max.hbutils.bean.Result;
import com.max.hbutils.utils.ViewUtils;
import com.max.xiaoheihe.MainActivity;
import com.max.xiaoheihe.R;
import com.max.xiaoheihe.app.HeyBoxApplication;
import com.max.xiaoheihe.bean.bbs.BBSFollowedMomentsObj;
import com.max.xiaoheihe.bean.bbs.BBSFollowingResult;
import com.max.xiaoheihe.bean.bbs.BBSLinkObj;
import com.max.xiaoheihe.bean.bbs.BBSUserInfoObj;
import com.max.xiaoheihe.bean.bbs.FollowedMomentsWrapperObj;
import com.max.xiaoheihe.bean.bbs.ProfileEventResult;
import com.max.xiaoheihe.bean.news.FeedsContentBaseObj;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.PatchProxyResult;
import com.umeng.socialize.UMShareAPI;
import df.r8;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

/* JADX INFO: loaded from: classes10.dex */
@com.max.hbcommon.analytics.m(path = "/home/moment")
public class FollowedMomentsFragment extends com.max.hbcommon.base.d implements com.max.xiaoheihe.module.bbs.adapter.g.q, com.max.xiaoheihe.view.callback.a {
    public static ChangeQuickRedirect changeQuickRedirect = null;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    private static final String f79814q = "moments_filter_";

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private int f79815b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private String f79816c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private com.max.hbcommon.base.adapter.u<FeedsContentBaseObj> f79817d;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private RecyclerView f79822i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private com.max.hbcommon.base.adapter.w f79823j;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private boolean f79826m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private r8 f79827n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    private com.max.xiaoheihe.module.bbs.i<com.max.xiaoheihe.module.news.adapter.a> f79828o;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final List<FeedsContentBaseObj> f79818e = new ArrayList();

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final List<BBSLinkObj> f79819f = new ArrayList();

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private final List<BBSLinkObj> f79820g = new ArrayList();

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private final List<BBSUserInfoObj> f79821h = new ArrayList();

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private String f79824k = null;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private boolean f79825l = false;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    private final BroadcastReceiver f79829p = new BroadcastReceiver() { // from class: com.max.xiaoheihe.module.bbs.FollowedMomentsFragment.10
        public static ChangeQuickRedirect changeQuickRedirect;

        @Override // android.content.BroadcastReceiver
        public void onReceive(Context context, Intent intent) {
            if (PatchProxy.proxy(new Object[]{context, intent}, this, changeQuickRedirect, false, 26327, new Class[]{Context.class, Intent.class}, Void.TYPE).isSupported) {
                return;
            }
            com.max.heybox.hblog.g.x("MainAcitivty, Login Broadcast onReceive");
            if (FollowedMomentsFragment.this.isActive()) {
                FollowedMomentsFragment.this.f79827n.f115126b.v0(FollowedMomentsFragment.this.f79827n.f115133i);
                FollowedMomentsFragment.this.f79827n.f115131g.F();
            }
        }
    };

    public class a implements View.OnClickListener {
        public static ChangeQuickRedirect changeQuickRedirect;

        a() {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            if (!PatchProxy.proxy(new Object[]{view}, this, changeQuickRedirect, false, 26326, new Class[]{View.class}, Void.TYPE).isSupported && com.max.xiaoheihe.utils.i0.e(((com.max.hbcommon.base.d) FollowedMomentsFragment.this).mContext)) {
                s0.g4().show(FollowedMomentsFragment.this.getFragmentManager(), "writeposttype");
            }
        }
    }

    public class b implements pg.d {
        public static ChangeQuickRedirect changeQuickRedirect;

        b() {
        }

        @Override // pg.d
        public void k(ng.j jVar) {
            if (PatchProxy.proxy(new Object[]{jVar}, this, changeQuickRedirect, false, 26328, new Class[]{ng.j.class}, Void.TYPE).isSupported) {
                return;
            }
            FollowedMomentsFragment.this.f79815b = 0;
            FollowedMomentsFragment.this.f79816c = null;
            FollowedMomentsFragment.this.f79819f.clear();
            FollowedMomentsFragment.this.f79820g.clear();
            FollowedMomentsFragment.this.f79826m = true;
            FollowedMomentsFragment.d4(FollowedMomentsFragment.this);
            if (com.max.xiaoheihe.utils.i0.s() && FollowedMomentsFragment.this.f79824k == null) {
                FollowedMomentsFragment.f4(FollowedMomentsFragment.this);
            }
        }
    }

    public class c implements pg.b {
        public static ChangeQuickRedirect changeQuickRedirect;

        c() {
        }

        @Override // pg.b
        public void f(ng.j jVar) {
            if (PatchProxy.proxy(new Object[]{jVar}, this, changeQuickRedirect, false, 26329, new Class[]{ng.j.class}, Void.TYPE).isSupported) {
                return;
            }
            FollowedMomentsFragment.Q3(FollowedMomentsFragment.this, 30);
            FollowedMomentsFragment.d4(FollowedMomentsFragment.this);
        }
    }

    public class d extends com.max.hbcommon.base.adapter.s<BBSUserInfoObj> {
        public static ChangeQuickRedirect changeQuickRedirect;

        d(Context context, List list, int i10) {
            super(context, list, i10);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public /* synthetic */ void n(BBSUserInfoObj bBSUserInfoObj, View view) {
            if (PatchProxy.proxy(new Object[]{bBSUserInfoObj, view}, this, changeQuickRedirect, false, 26332, new Class[]{BBSUserInfoObj.class, View.class}, Void.TYPE).isSupported) {
                return;
            }
            bBSUserInfoObj.setUnread(0);
            FollowedMomentsFragment.g4(FollowedMomentsFragment.this, bBSUserInfoObj.getUserid());
        }

        public void o(com.max.hbcommon.base.adapter.s.e eVar, final BBSUserInfoObj bBSUserInfoObj) {
            if (PatchProxy.proxy(new Object[]{eVar, bBSUserInfoObj}, this, changeQuickRedirect, false, 26330, new Class[]{com.max.hbcommon.base.adapter.s.e.class, BBSUserInfoObj.class}, Void.TYPE).isSupported) {
                return;
            }
            View view = eVar.itemView;
            View viewI = eVar.i(R.id.v_mask);
            ImageView imageView = (ImageView) eVar.i(R.id.iv_avatar);
            ImageView imageView2 = (ImageView) eVar.i(R.id.iv_red_dot);
            TextView textView = (TextView) eVar.i(R.id.tv_user_name);
            textView.setText(bBSUserInfoObj.getUsername());
            com.max.hbimage.b.I(bBSUserInfoObj.getAvartar(), imageView, R.drawable.common_default_avatar_40x40);
            if (bBSUserInfoObj.getUnread() > 0) {
                imageView2.setVisibility(0);
            } else {
                imageView2.setVisibility(8);
            }
            if (bBSUserInfoObj.getUserid() != null && bBSUserInfoObj.getUserid().equals(FollowedMomentsFragment.this.f79824k)) {
                viewI.setVisibility(8);
                textView.setTextColor(androidx.core.content.res.i.e(FollowedMomentsFragment.this.getResources(), R.color.text_primary_1_color, null));
                view.setBackgroundColor(androidx.core.content.res.i.e(FollowedMomentsFragment.this.getResources(), R.color.divider_secondary_1_color, null));
            } else if (FollowedMomentsFragment.this.f79824k == null) {
                viewI.setVisibility(8);
                view.setBackgroundColor(androidx.core.content.res.i.e(FollowedMomentsFragment.this.getResources(), R.color.background_layer_2_color, null));
            } else {
                viewI.setVisibility(0);
                view.setBackgroundColor(androidx.core.content.res.i.e(FollowedMomentsFragment.this.getResources(), R.color.background_layer_2_color, null));
            }
            view.setOnClickListener(new View.OnClickListener() { // from class: com.max.xiaoheihe.module.bbs.l
                @Override // android.view.View.OnClickListener
                public final void onClick(View view2) {
                    this.f81215b.n(bBSUserInfoObj, view2);
                }
            });
        }

        @Override // com.max.hbcommon.base.adapter.s
        public /* bridge */ /* synthetic */ void onBindViewHolder(com.max.hbcommon.base.adapter.s.e eVar, BBSUserInfoObj bBSUserInfoObj) {
            if (PatchProxy.proxy(new Object[]{eVar, bBSUserInfoObj}, this, changeQuickRedirect, false, 26331, new Class[]{com.max.hbcommon.base.adapter.s.e.class, Object.class}, Void.TYPE).isSupported) {
                return;
            }
            o(eVar, bBSUserInfoObj);
        }
    }

    public class e implements View.OnClickListener {
        public static ChangeQuickRedirect changeQuickRedirect;

        e() {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            if (PatchProxy.proxy(new Object[]{view}, this, changeQuickRedirect, false, 26333, new Class[]{View.class}, Void.TYPE).isSupported) {
                return;
            }
            com.max.xiaoheihe.base.router.b.I(((com.max.hbcommon.base.d) FollowedMomentsFragment.this).mContext, com.max.xiaoheihe.module.account.utils.c.i(), "following", BBSLinkObj.REC_MARK_TIMELINE).A();
        }
    }

    public class f extends com.max.hbcommon.network.d<Result<BBSFollowingResult<String>>> {
        public static ChangeQuickRedirect changeQuickRedirect;

        f() {
        }

        @Override // com.max.hbcommon.network.d, io.reactivex.g0
        public void onError(Throwable th2) {
            if (!PatchProxy.proxy(new Object[]{th2}, this, changeQuickRedirect, false, 26335, new Class[]{Throwable.class}, Void.TYPE).isSupported && FollowedMomentsFragment.this.isActive()) {
                super.onError(th2);
            }
        }

        public void onNext(Result<BBSFollowingResult<String>> result) {
            if (!PatchProxy.proxy(new Object[]{result}, this, changeQuickRedirect, false, 26334, new Class[]{Result.class}, Void.TYPE).isSupported && FollowedMomentsFragment.this.isActive()) {
                FollowedMomentsFragment.P3(FollowedMomentsFragment.this, result.getResult());
            }
        }

        @Override // com.max.hbcommon.network.d, io.reactivex.g0
        public /* bridge */ /* synthetic */ void onNext(Object obj) {
            if (PatchProxy.proxy(new Object[]{obj}, this, changeQuickRedirect, false, 26336, new Class[]{Object.class}, Void.TYPE).isSupported) {
                return;
            }
            onNext((Result<BBSFollowingResult<String>>) obj);
        }
    }

    public class g implements View.OnClickListener {
        public static ChangeQuickRedirect changeQuickRedirect;

        g() {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            if (PatchProxy.proxy(new Object[]{view}, this, changeQuickRedirect, false, 26337, new Class[]{View.class}, Void.TYPE).isSupported) {
                return;
            }
            com.max.xiaoheihe.utils.d.I1(((com.max.hbcommon.base.d) FollowedMomentsFragment.this).mContext);
        }
    }

    public class h extends com.max.hbcommon.network.d<Result<ProfileEventResult>> {
        public static ChangeQuickRedirect changeQuickRedirect;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ String f79838b;

        h(String str) {
            this.f79838b = str;
        }

        @Override // com.max.hbcommon.network.d, io.reactivex.g0
        public void onComplete() {
            if (!PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 26339, new Class[0], Void.TYPE).isSupported && FollowedMomentsFragment.this.isActive()) {
                super.onComplete();
                FollowedMomentsFragment.this.f79827n.f115131g.A(0);
                FollowedMomentsFragment.this.f79827n.f115131g.p(0);
                FollowedMomentsFragment.this.f79827n.f115134j.setVisibility(8);
            }
        }

        @Override // com.max.hbcommon.network.d, io.reactivex.g0
        public void onError(Throwable th2) {
            if (!PatchProxy.proxy(new Object[]{th2}, this, changeQuickRedirect, false, 26338, new Class[]{Throwable.class}, Void.TYPE).isSupported && FollowedMomentsFragment.this.isActive()) {
                super.onError(th2);
                FollowedMomentsFragment.S3(FollowedMomentsFragment.this);
                FollowedMomentsFragment.this.f79827n.f115131g.A(0);
                FollowedMomentsFragment.this.f79827n.f115131g.p(0);
                FollowedMomentsFragment.this.f79827n.f115134j.setVisibility(8);
            }
        }

        public void onNext(Result<ProfileEventResult> result) {
            if (PatchProxy.proxy(new Object[]{result}, this, changeQuickRedirect, false, 26340, new Class[]{Result.class}, Void.TYPE).isSupported || !FollowedMomentsFragment.this.isActive() || FollowedMomentsFragment.this.f79824k == null || !FollowedMomentsFragment.this.f79824k.equals(this.f79838b) || result == null) {
                return;
            }
            ProfileEventResult result2 = result.getResult();
            if (!com.max.hbcommon.utils.c.u(result2.getLastval())) {
                FollowedMomentsFragment.this.f79816c = result2.getLastval();
            }
            FollowedMomentsFragment.U3(FollowedMomentsFragment.this, result2.getMoments());
        }

        @Override // com.max.hbcommon.network.d, io.reactivex.g0
        public /* bridge */ /* synthetic */ void onNext(Object obj) {
            if (PatchProxy.proxy(new Object[]{obj}, this, changeQuickRedirect, false, 26341, new Class[]{Object.class}, Void.TYPE).isSupported) {
                return;
            }
            onNext((Result<ProfileEventResult>) obj);
        }
    }

    public class i extends com.max.hbcommon.network.d<Result<BBSFollowedMomentsObj>> {
        public static ChangeQuickRedirect changeQuickRedirect;

        public class a implements Runnable {
            public static ChangeQuickRedirect changeQuickRedirect;

            a() {
            }

            @Override // java.lang.Runnable
            public void run() {
                if (PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 26346, new Class[0], Void.TYPE).isSupported || FollowedMomentsFragment.this.f79828o == null) {
                    return;
                }
                FollowedMomentsFragment.this.f79828o.q();
            }
        }

        i() {
        }

        @Override // com.max.hbcommon.network.d, io.reactivex.g0
        public void onComplete() {
            if (!PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 26342, new Class[0], Void.TYPE).isSupported && FollowedMomentsFragment.this.isActive()) {
                super.onComplete();
                FollowedMomentsFragment.this.f79827n.f115131g.A(0);
                FollowedMomentsFragment.this.f79827n.f115131g.p(0);
                FollowedMomentsFragment.this.f79827n.f115134j.setVisibility(8);
                if (FollowedMomentsFragment.this.f79826m) {
                    FollowedMomentsFragment.this.f79826m = false;
                    FollowedMomentsFragment.this.f79827n.f115130f.post(new a());
                }
            }
        }

        @Override // com.max.hbcommon.network.d, io.reactivex.g0
        public void onError(Throwable th2) {
            if (!PatchProxy.proxy(new Object[]{th2}, this, changeQuickRedirect, false, 26343, new Class[]{Throwable.class}, Void.TYPE).isSupported && FollowedMomentsFragment.this.isActive()) {
                super.onError(th2);
                FollowedMomentsFragment.W3(FollowedMomentsFragment.this);
                FollowedMomentsFragment.this.f79827n.f115131g.A(0);
                FollowedMomentsFragment.this.f79827n.f115131g.p(0);
                FollowedMomentsFragment.this.f79827n.f115134j.setVisibility(8);
                FollowedMomentsFragment.this.f79826m = false;
            }
        }

        public void onNext(Result<BBSFollowedMomentsObj> result) {
            if (!PatchProxy.proxy(new Object[]{result}, this, changeQuickRedirect, false, 26344, new Class[]{Result.class}, Void.TYPE).isSupported && FollowedMomentsFragment.this.isActive()) {
                super.onNext(result);
                if (FollowedMomentsFragment.this.f79824k != null) {
                    return;
                }
                FollowedMomentsFragment.X3(FollowedMomentsFragment.this, result.getResult());
            }
        }

        @Override // com.max.hbcommon.network.d, io.reactivex.g0
        public /* bridge */ /* synthetic */ void onNext(Object obj) {
            if (PatchProxy.proxy(new Object[]{obj}, this, changeQuickRedirect, false, 26345, new Class[]{Object.class}, Void.TYPE).isSupported) {
                return;
            }
            onNext((Result<BBSFollowedMomentsObj>) obj);
        }
    }

    static /* synthetic */ void P3(FollowedMomentsFragment followedMomentsFragment, BBSFollowingResult bBSFollowingResult) {
        if (PatchProxy.proxy(new Object[]{followedMomentsFragment, bBSFollowingResult}, null, changeQuickRedirect, true, 26321, new Class[]{FollowedMomentsFragment.class, BBSFollowingResult.class}, Void.TYPE).isSupported) {
            return;
        }
        followedMomentsFragment.q4(bBSFollowingResult);
    }

    static /* synthetic */ int Q3(FollowedMomentsFragment followedMomentsFragment, int i10) {
        int i11 = followedMomentsFragment.f79815b + i10;
        followedMomentsFragment.f79815b = i11;
        return i11;
    }

    static /* synthetic */ void S3(FollowedMomentsFragment followedMomentsFragment) {
        if (PatchProxy.proxy(new Object[]{followedMomentsFragment}, null, changeQuickRedirect, true, 26322, new Class[]{FollowedMomentsFragment.class}, Void.TYPE).isSupported) {
            return;
        }
        followedMomentsFragment.showError();
    }

    static /* synthetic */ void U3(FollowedMomentsFragment followedMomentsFragment, List list) {
        if (PatchProxy.proxy(new Object[]{followedMomentsFragment, list}, null, changeQuickRedirect, true, 26323, new Class[]{FollowedMomentsFragment.class, List.class}, Void.TYPE).isSupported) {
            return;
        }
        followedMomentsFragment.s4(list);
    }

    static /* synthetic */ void W3(FollowedMomentsFragment followedMomentsFragment) {
        if (PatchProxy.proxy(new Object[]{followedMomentsFragment}, null, changeQuickRedirect, true, 26324, new Class[]{FollowedMomentsFragment.class}, Void.TYPE).isSupported) {
            return;
        }
        followedMomentsFragment.showError();
    }

    static /* synthetic */ void X3(FollowedMomentsFragment followedMomentsFragment, BBSFollowedMomentsObj bBSFollowedMomentsObj) {
        if (PatchProxy.proxy(new Object[]{followedMomentsFragment, bBSFollowedMomentsObj}, null, changeQuickRedirect, true, 26325, new Class[]{FollowedMomentsFragment.class, BBSFollowedMomentsObj.class}, Void.TYPE).isSupported) {
            return;
        }
        followedMomentsFragment.p4(bBSFollowedMomentsObj);
    }

    static /* synthetic */ void d4(FollowedMomentsFragment followedMomentsFragment) {
        if (PatchProxy.proxy(new Object[]{followedMomentsFragment}, null, changeQuickRedirect, true, 26318, new Class[]{FollowedMomentsFragment.class}, Void.TYPE).isSupported) {
            return;
        }
        followedMomentsFragment.j4();
    }

    static /* synthetic */ void f4(FollowedMomentsFragment followedMomentsFragment) {
        if (PatchProxy.proxy(new Object[]{followedMomentsFragment}, null, changeQuickRedirect, true, 26319, new Class[]{FollowedMomentsFragment.class}, Void.TYPE).isSupported) {
            return;
        }
        followedMomentsFragment.i4();
    }

    static /* synthetic */ void g4(FollowedMomentsFragment followedMomentsFragment, String str) {
        if (PatchProxy.proxy(new Object[]{followedMomentsFragment, str}, null, changeQuickRedirect, true, 26320, new Class[]{FollowedMomentsFragment.class, String.class}, Void.TYPE).isSupported) {
            return;
        }
        followedMomentsFragment.o4(str);
    }

    @SuppressLint({"AutoDispose"})
    private void h4() {
        if (PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 26308, new Class[0], Void.TYPE).isSupported) {
            return;
        }
        addDisposable((io.reactivex.disposables.b) com.max.xiaoheihe.network.i.a().w4(this.f79815b, 30, this.f79816c, new HashMap(16)).I5(io.reactivex.schedulers.b.d()).a4(io.reactivex.android.schedulers.a.c()).J5(new i()));
    }

    @SuppressLint({"AutoDispose"})
    private void i4() {
        if (PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 26302, new Class[0], Void.TYPE).isSupported) {
            return;
        }
        addDisposable((io.reactivex.disposables.b) com.max.xiaoheihe.network.i.a().Q6(com.max.xiaoheihe.module.account.utils.c.i()).I5(io.reactivex.schedulers.b.d()).a4(io.reactivex.android.schedulers.a.c()).J5(new f()));
    }

    private void j4() {
        if (PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 26300, new Class[0], Void.TYPE).isSupported) {
            return;
        }
        String str = this.f79824k;
        if (str == null || str.trim().isEmpty()) {
            h4();
        } else {
            k4();
        }
    }

    @SuppressLint({"AutoDispose"})
    private void k4() {
        if (PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 26306, new Class[0], Void.TYPE).isSupported) {
            return;
        }
        String str = this.f79824k;
        addDisposable((io.reactivex.disposables.b) com.max.xiaoheihe.network.i.a().z6(str, this.f79815b, 30, this.f79816c, "events_list").I5(io.reactivex.schedulers.b.d()).a4(io.reactivex.android.schedulers.a.c()).J5(new h(str)));
    }

    private void l4() {
        if (PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 26297, new Class[0], Void.TYPE).isSupported) {
            return;
        }
        HeyBoxApplication.f76798t.k(getViewLifecycleOwner(), new androidx.lifecycle.j0() { // from class: com.max.xiaoheihe.module.bbs.k
            @Override // androidx.lifecycle.j0
            public final void a(Object obj) {
                this.f81210a.m4((Boolean) obj);
            }
        });
        HeyBoxApplication.f76798t.r(Boolean.FALSE);
        d dVar = new d(this.mContext, this.f79821h, R.layout.item_friend_header);
        LinearLayoutManager linearLayoutManager = new LinearLayoutManager(this.mContext);
        linearLayoutManager.setOrientation(0);
        com.max.hbcommon.base.adapter.w wVar = new com.max.hbcommon.base.adapter.w(this.mContext, dVar, new e());
        this.f79823j = wVar;
        wVar.I("左滑更多", "松开查看");
        this.f79827n.f115133i.setLayoutManager(linearLayoutManager);
        this.f79827n.f115133i.setAdapter(this.f79823j);
        u4();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void m4(Boolean bool) {
        String str;
        if (PatchProxy.proxy(new Object[]{bool}, this, changeQuickRedirect, false, 26317, new Class[]{Boolean.class}, Void.TYPE).isSupported || bool.booleanValue() || (str = this.f79824k) == null) {
            return;
        }
        o4(str);
    }

    public static FollowedMomentsFragment n4() {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[0], null, changeQuickRedirect, true, 26295, new Class[0], FollowedMomentsFragment.class);
        if (patchProxyResultProxy.isSupported) {
            return (FollowedMomentsFragment) patchProxyResultProxy.result;
        }
        FollowedMomentsFragment followedMomentsFragment = new FollowedMomentsFragment();
        followedMomentsFragment.setArguments(new Bundle());
        return followedMomentsFragment;
    }

    @SuppressLint({"NotifyDataSetChanged"})
    private void o4(String str) {
        if (PatchProxy.proxy(new Object[]{str}, this, changeQuickRedirect, false, 26299, new Class[]{String.class}, Void.TYPE).isSupported) {
            return;
        }
        com.max.hbcommon.analytics.j jVar = this.reporter;
        if (jVar != null) {
            jVar.e();
        }
        if (str.equals(this.f79824k)) {
            this.f79824k = null;
            RelativeLayout.LayoutParams layoutParams = (RelativeLayout.LayoutParams) this.f79827n.f115127c.getLayoutParams();
            if (layoutParams == null) {
                layoutParams = new RelativeLayout.LayoutParams(-1, ic.a.f119343a.a(this.mContext, 4.0f));
            }
            ic.a aVar = ic.a.f119343a;
            layoutParams.height = aVar.a(this.mContext, 4.0f);
            layoutParams.topMargin = aVar.a(this.mContext, 5.0f);
            this.f79827n.f115127c.setLayoutParams(layoutParams);
            this.f79827n.f115127c.requestLayout();
            HeyBoxApplication.f76798t.r(Boolean.FALSE);
            this.f79827n.f115136l.b().setVisibility(0);
        } else {
            this.f79824k = str;
            RelativeLayout.LayoutParams layoutParams2 = (RelativeLayout.LayoutParams) this.f79827n.f115127c.getLayoutParams();
            if (layoutParams2 == null) {
                layoutParams2 = new RelativeLayout.LayoutParams(-1, ic.a.f119343a.a(this.mContext, 1.0f));
            }
            layoutParams2.height = ic.a.f119343a.a(this.mContext, 1.0f);
            layoutParams2.topMargin = 0;
            this.f79827n.f115127c.setLayoutParams(layoutParams2);
            this.f79827n.f115127c.requestLayout();
            HeyBoxApplication.f76798t.r(Boolean.TRUE);
            this.f79827n.f115136l.b().setVisibility(8);
        }
        com.max.hbcommon.analytics.j jVar2 = this.reporter;
        if (jVar2 != null) {
            jVar2.f();
        }
        this.f79815b = 0;
        this.f79816c = null;
        this.f79819f.clear();
        this.f79820g.clear();
        this.f79823j.notifyDataSetChanged();
        this.f79818e.clear();
        this.f79817d.notifyDataSetChanged();
        this.f79827n.f115134j.setVisibility(0);
        j4();
    }

    private void p4(BBSFollowedMomentsObj bBSFollowedMomentsObj) {
        if (PatchProxy.proxy(new Object[]{bBSFollowedMomentsObj}, this, changeQuickRedirect, false, 26309, new Class[]{BBSFollowedMomentsObj.class}, Void.TYPE).isSupported) {
            return;
        }
        showContentView();
        t4();
        if (com.max.xiaoheihe.utils.i0.s() || bBSFollowedMomentsObj.getLogin_card() == null || com.max.hbcommon.utils.c.u(bBSFollowedMomentsObj.getLogin_card().getImg())) {
            this.f79827n.f115135k.b().setVisibility(8);
        } else {
            String img = bBSFollowedMomentsObj.getLogin_card().getImg();
            this.f79827n.f115135k.b().setVisibility(0);
            r4(img);
        }
        this.f79818e.size();
        if (bBSFollowedMomentsObj != null) {
            this.f79816c = bBSFollowedMomentsObj.getLastval();
            if (bBSFollowedMomentsObj.getMoments() != null) {
                if (this.f79815b == 0) {
                    this.f79818e.clear();
                    this.mContext.sendBroadcast(new Intent(lb.a.f131037s));
                }
                this.f79818e.addAll(bBSFollowedMomentsObj.getMoments());
            }
        }
        this.f79817d.notifyDataSetChanged();
    }

    private void q4(BBSFollowingResult<?> bBSFollowingResult) {
        if (PatchProxy.proxy(new Object[]{bBSFollowingResult}, this, changeQuickRedirect, false, 26303, new Class[]{BBSFollowingResult.class}, Void.TYPE).isSupported) {
            return;
        }
        this.f79825l = bBSFollowingResult.getHas_more() > 0;
        if (bBSFollowingResult.getFollow_list() != null) {
            this.f79821h.clear();
            this.f79821h.addAll(bBSFollowingResult.getFollow_list());
            this.f79823j.G(this.f79825l);
            u4();
        }
    }

    private void r4(String str) {
        if (PatchProxy.proxy(new Object[]{str}, this, changeQuickRedirect, false, 26304, new Class[]{String.class}, Void.TYPE).isSupported) {
            return;
        }
        this.f79827n.f115135k.b().setBackgroundResource(R.color.background_layer_2_color);
        com.max.hbimage.b.K(str, this.f79827n.f115135k.f114877c);
        this.f79827n.f115135k.b().setOnClickListener(new g());
    }

    private void s4(List<FeedsContentBaseObj> list) {
        if (PatchProxy.proxy(new Object[]{list}, this, changeQuickRedirect, false, 26307, new Class[]{List.class}, Void.TYPE).isSupported) {
            return;
        }
        showContentView();
        t4();
        if (this.f79815b == 0) {
            this.f79818e.clear();
            this.mContext.sendBroadcast(new Intent(lb.a.f131037s));
        }
        if (list != null) {
            this.f79818e.addAll(list);
        }
        this.f79817d.notifyDataSetChanged();
    }

    private void t4() {
        if (PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 26298, new Class[0], Void.TYPE).isSupported) {
            return;
        }
        if (!com.max.xiaoheihe.utils.i0.s()) {
            this.f79827n.f115137m.f112120b.setText("为您推荐");
            this.f79827n.f115136l.b().setVisibility(8);
            this.f79827n.f115137m.b().setVisibility(0);
        } else {
            if (this.f79824k == null) {
                this.f79827n.f115136l.b().setVisibility(0);
            } else {
                this.f79827n.f115136l.b().setVisibility(8);
            }
            this.f79827n.f115137m.b().setVisibility(8);
        }
    }

    @SuppressLint({"NotifyDataSetChanged"})
    private void u4() {
        if (PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 26305, new Class[0], Void.TYPE).isSupported) {
            return;
        }
        if (com.max.hbcommon.utils.c.w(this.f79821h)) {
            this.f79827n.f115133i.setVisibility(8);
            this.f79827n.f115127c.setVisibility(8);
            return;
        }
        if (this.f79827n.f115133i.getVisibility() != 0) {
            this.f79827n.f115133i.setVisibility(0);
            this.f79827n.f115127c.setVisibility(0);
            r8 r8Var = this.f79827n;
            r8Var.f115126b.v0(r8Var.f115133i);
        }
        this.f79823j.notifyDataSetChanged();
    }

    @Override // com.max.xiaoheihe.view.callback.a
    public void D3() {
        if (!PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 26311, new Class[0], Void.TYPE).isSupported && this.mIsVisible) {
            this.f79826m = true;
            r8 r8Var = this.f79827n;
            r8Var.f115126b.v0(r8Var.f115133i);
            this.f79827n.f115131g.F();
        }
    }

    @Override // com.max.xiaoheihe.module.bbs.adapter.g.q
    public void O(int i10, int i11) {
        Object[] objArr = {new Integer(i10), new Integer(i11)};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        Class cls = Integer.TYPE;
        if (PatchProxy.proxy(objArr, this, changeQuickRedirect2, false, 26313, new Class[]{cls, cls}, Void.TYPE).isSupported) {
            return;
        }
        this.f79817d.notifyItemRangeInserted(i10, i11);
    }

    @Override // com.max.hbcommon.base.d, com.max.hbcommon.analytics.d.f
    @androidx.annotation.p0
    public String getPageAdditional() {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 26315, new Class[0], String.class);
        if (patchProxyResultProxy.isSupported) {
            return (String) patchProxyResultProxy.result;
        }
        if (com.max.hbcommon.utils.c.u(this.f79824k)) {
            return null;
        }
        JsonObject jsonObject = new JsonObject();
        jsonObject.addProperty("userid", this.f79824k);
        return jsonObject.toString();
    }

    @Override // com.max.hbcommon.base.d
    public void initData() {
        if (PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 26301, new Class[0], Void.TYPE).isSupported) {
            return;
        }
        showLoading();
        if (com.max.xiaoheihe.utils.i0.s()) {
            i4();
        }
        j4();
    }

    @Override // com.max.hbcommon.base.d
    public void installViews(View view) {
        if (PatchProxy.proxy(new Object[]{view}, this, changeQuickRedirect, false, 26296, new Class[]{View.class}, Void.TYPE).isSupported) {
            return;
        }
        r8 r8VarC = r8.c(this.mInflater);
        this.f79827n = r8VarC;
        setContentView(r8VarC);
        this.f79827n.f115128d.setVisibility(MainActivity.E4 ? 8 : 0);
        this.f79827n.f115128d.setOnClickListener(new a());
        this.f79817d = new com.max.xiaoheihe.module.news.adapter.a(this.mContext, this.f79818e);
        this.f79827n.f115130f.setClipToPadding(false);
        this.f79827n.f115130f.setClipChildren(false);
        this.f79827n.f115130f.setLayoutManager(new LinearLayoutManager(this.mContext));
        t4();
        this.f79827n.f115130f.setAdapter(this.f79817d);
        this.f79828o = new com.max.xiaoheihe.module.bbs.i<>(this, this.f79827n.f115130f, BBSLinkObj.class);
        new OneTimeValidExposureWatcher(this, this.f79827n.f115130f);
        this.f79816c = null;
        this.f79827n.f115131g.setBackgroundResource(R.color.background_layer_2_color);
        this.f79827n.f115131g.S(new b());
        this.f79827n.f115131g.f0(new c());
        this.f79827n.f115130f.clearOnScrollListeners();
        l4();
        r8 r8Var = this.f79827n;
        ViewUtils.b(r8Var.f115126b, r8Var.f115132h.getRoot());
        if (this.mIsFirst) {
            showLoading();
        }
        registerReceiver(this.f79829p, lb.a.f130942c0);
    }

    @Override // androidx.fragment.app.Fragment
    public void onActivityResult(int i10, int i11, Intent intent) {
        Object[] objArr = {new Integer(i10), new Integer(i11), intent};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        Class cls = Integer.TYPE;
        if (PatchProxy.proxy(objArr, this, changeQuickRedirect2, false, 26312, new Class[]{cls, cls, Intent.class}, Void.TYPE).isSupported) {
            return;
        }
        super.onActivityResult(i10, i11, intent);
        UMShareAPI.get(getContext()).onActivityResult(i10, i11, intent);
    }

    @Override // com.max.hbcommon.base.d, androidx.fragment.app.Fragment
    public void onDestroy() {
        if (PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 26316, new Class[0], Void.TYPE).isSupported) {
            return;
        }
        if (ad.a.d()) {
            this.f79817d = null;
            this.f79822i = null;
            this.f79823j = null;
        }
        this.f79818e.clear();
        this.f79819f.clear();
        this.f79820g.clear();
        this.f79821h.clear();
        unregisterReceiver(this.f79829p);
        super.onDestroy();
    }

    @Override // com.max.hbcommon.base.d
    public void onRefresh() {
        if (PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 26310, new Class[0], Void.TYPE).isSupported) {
            return;
        }
        showLoading();
        h4();
        if (com.max.xiaoheihe.utils.i0.s()) {
            i4();
        }
    }

    @Override // com.max.xiaoheihe.module.bbs.adapter.g.q
    public void t1(com.max.hbcommon.base.adapter.s.e eVar, FollowedMomentsWrapperObj followedMomentsWrapperObj) {
        com.max.xiaoheihe.module.bbs.i<com.max.xiaoheihe.module.news.adapter.a> iVar;
        if (PatchProxy.proxy(new Object[]{eVar, followedMomentsWrapperObj}, this, changeQuickRedirect, false, 26314, new Class[]{com.max.hbcommon.base.adapter.s.e.class, FollowedMomentsWrapperObj.class}, Void.TYPE).isSupported || (iVar = this.f79828o) == null) {
            return;
        }
        iVar.q();
    }
}
