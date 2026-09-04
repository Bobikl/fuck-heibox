package com.max.xiaoheihe.module.account;

import android.content.Intent;
import com.max.hbcommon.base.BaseActivity;
import com.max.hbutils.bean.Result;
import com.max.xiaoheihe.MainActivity;
import com.max.xiaoheihe.app.HeyBoxApplication;
import com.max.xiaoheihe.bean.account.GetRegisterCodeObj;
import com.max.xiaoheihe.bean.account.User;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;

/* JADX INFO: compiled from: LoginSession.kt */
/* JADX INFO: loaded from: classes9.dex */
@androidx.compose.runtime.internal.o(parameters = 0)
public final class o {
    public static ChangeQuickRedirect changeQuickRedirect = null;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final int f79102e = 8;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @dl.e
    @xh.e
    protected io.reactivex.disposables.a f79103a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @dl.d
    @xh.e
    protected String f79104b = "";

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @dl.d
    @xh.e
    protected String f79105c = "+86";

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @dl.e
    @xh.e
    protected BaseActivity f79106d;

    /* JADX INFO: compiled from: LoginSession.kt */
    public static final class a extends com.max.hbcommon.network.d<Result<GetRegisterCodeObj>> {
        public static ChangeQuickRedirect changeQuickRedirect;

        a() {
        }

        public void onNext(@dl.d Result<GetRegisterCodeObj> t10) {
            if (PatchProxy.proxy(new Object[]{t10}, this, changeQuickRedirect, false, 23268, new Class[]{Result.class}, Void.TYPE).isSupported) {
                return;
            }
            kotlin.jvm.internal.f0.p(t10, "t");
            String code = t10.getResult().getCode();
            o oVar = o.this;
            kotlin.jvm.internal.f0.o(code, "code");
            o.b(oVar, code);
        }

        @Override // com.max.hbcommon.network.d, io.reactivex.g0
        public /* bridge */ /* synthetic */ void onNext(Object obj) {
            if (PatchProxy.proxy(new Object[]{obj}, this, changeQuickRedirect, false, 23269, new Class[]{Object.class}, Void.TYPE).isSupported) {
                return;
            }
            onNext((Result<GetRegisterCodeObj>) obj);
        }
    }

    /* JADX INFO: compiled from: LoginSession.kt */
    public static final class b extends com.max.hbcommon.network.d<Result<User>> {
        public static ChangeQuickRedirect changeQuickRedirect;

        b() {
        }

        public void onNext(@dl.d Result<User> t10) {
            if (PatchProxy.proxy(new Object[]{t10}, this, changeQuickRedirect, false, 23270, new Class[]{Result.class}, Void.TYPE).isSupported) {
                return;
            }
            kotlin.jvm.internal.f0.p(t10, "t");
            String str = o.this.f79105c + o.this.f79104b;
            com.max.hbcache.c.C("user_account", str);
            com.max.hbcache.c.C("user_bind_phone", str);
            o oVar = o.this;
            User result = t10.getResult();
            kotlin.jvm.internal.f0.o(result, "t.result");
            o.a(oVar, result);
        }

        @Override // com.max.hbcommon.network.d, io.reactivex.g0
        public /* bridge */ /* synthetic */ void onNext(Object obj) {
            if (PatchProxy.proxy(new Object[]{obj}, this, changeQuickRedirect, false, 23271, new Class[]{Object.class}, Void.TYPE).isSupported) {
                return;
            }
            onNext((Result<User>) obj);
        }
    }

    public static final /* synthetic */ void a(o oVar, User user) {
        if (PatchProxy.proxy(new Object[]{oVar, user}, null, changeQuickRedirect, true, 23267, new Class[]{o.class, User.class}, Void.TYPE).isSupported) {
            return;
        }
        oVar.e(user);
    }

    public static final /* synthetic */ void b(o oVar, String str) {
        if (PatchProxy.proxy(new Object[]{oVar, str}, null, changeQuickRedirect, true, 23266, new Class[]{o.class, String.class}, Void.TYPE).isSupported) {
            return;
        }
        oVar.f(str);
    }

    private final void d() {
        io.reactivex.disposables.a aVar;
        if (PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 23263, new Class[0], Void.TYPE).isSupported || (aVar = this.f79103a) == null) {
            return;
        }
        aVar.c((io.reactivex.disposables.b) com.max.xiaoheihe.network.i.a().d1(com.max.xiaoheihe.utils.w.a(this.f79105c + this.f79104b)).I5(io.reactivex.schedulers.b.d()).a4(io.reactivex.android.schedulers.a.c()).J5(new a()));
    }

    private final void e(User user) {
        if (PatchProxy.proxy(new Object[]{user}, this, changeQuickRedirect, false, 23265, new Class[]{User.class}, Void.TYPE).isSupported) {
            return;
        }
        User userO = com.max.xiaoheihe.utils.i0.o();
        userO.setLoginFlag(true);
        userO.setPkey(user.getPkey());
        userO.setAccount_detail(user.getAccount_detail());
        userO.setProfile(user.getProfile());
        MainActivity.f76171q5 = user.getTips_state();
        com.max.xiaoheihe.utils.i0.z(userO);
        HeyBoxApplication.C().F();
        HeyBoxApplication.C().sendBroadcast(new Intent(lb.a.f130942c0));
        com.max.xiaoheihe.utils.m0.x().C();
        com.max.xiaoheihe.utils.d.U0(this.f79106d);
    }

    private final void f(String str) {
        io.reactivex.disposables.a aVar;
        if (PatchProxy.proxy(new Object[]{str}, this, changeQuickRedirect, false, 23264, new Class[]{String.class}, Void.TYPE).isSupported || (aVar = this.f79103a) == null) {
            return;
        }
        aVar.c((io.reactivex.disposables.b) com.max.xiaoheihe.network.i.a().F3(com.max.xiaoheihe.utils.w.a("+86" + this.f79104b), str, null).I5(io.reactivex.schedulers.b.d()).a4(io.reactivex.android.schedulers.a.c()).J5(new b()));
    }

    public final void c(@dl.e io.reactivex.disposables.a aVar, @dl.d String phoneNumber, @dl.e BaseActivity baseActivity) {
        if (PatchProxy.proxy(new Object[]{aVar, phoneNumber, baseActivity}, this, changeQuickRedirect, false, 23262, new Class[]{io.reactivex.disposables.a.class, String.class, BaseActivity.class}, Void.TYPE).isSupported) {
            return;
        }
        kotlin.jvm.internal.f0.p(phoneNumber, "phoneNumber");
        this.f79103a = aVar;
        this.f79104b = phoneNumber;
        this.f79106d = baseActivity;
        d();
    }
}
