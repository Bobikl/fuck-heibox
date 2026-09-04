package com.max.xiaoheihe.module.mall;

import android.app.Activity;
import android.content.DialogInterface;
import com.max.hbcommon.base.BaseActivity;
import com.max.hbcustomview.loadingdialog.LoadingDialog;
import com.max.hbutils.bean.Result;
import com.max.xiaoheihe.R;
import com.max.xiaoheihe.bean.mall.MallPrepareStateObj;
import com.max.xiaoheihe.bean.mall.SteamWalletJsObj;
import com.max.xiaoheihe.module.mall.direct_purchace.SteamDirectPurchaseTool;
import com.max.xiaoheihe.utils.l0;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import java.util.concurrent.TimeUnit;

/* JADX INFO: compiled from: MallCheckSteamAccountManager.java */
/* JADX INFO: loaded from: classes11.dex */
public class c {
    public static ChangeQuickRedirect changeQuickRedirect;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private com.max.xiaoheihe.module.game.f f90029a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private boolean f90030b = false;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private Activity f90031c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private LoadingDialog f90032d;

    /* JADX INFO: compiled from: MallCheckSteamAccountManager.java */
    public class a extends com.max.hbcommon.network.d<Result<MallPrepareStateObj>> {
        public static ChangeQuickRedirect changeQuickRedirect;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ int f90033b;

        /* JADX INFO: renamed from: com.max.xiaoheihe.module.mall.c$a$a, reason: collision with other inner class name */
        /* JADX INFO: compiled from: MallCheckSteamAccountManager.java */
        public class C0821a implements l0.g {
            public static ChangeQuickRedirect changeQuickRedirect;

            C0821a() {
            }

            @Override // com.max.xiaoheihe.utils.l0.g
            public void a() {
                if (PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 39946, new Class[0], Void.TYPE).isSupported) {
                    return;
                }
                c.f(c.this);
            }
        }

        a(int i10) {
            this.f90033b = i10;
        }

        @Override // com.max.hbcommon.network.d, io.reactivex.g0
        public void onError(Throwable th2) {
            if (PatchProxy.proxy(new Object[]{th2}, this, changeQuickRedirect, false, 39943, new Class[]{Throwable.class}, Void.TYPE).isSupported) {
                return;
            }
            super.onError(th2);
            if (c.this.f90031c.isFinishing()) {
                return;
            }
            c.this.f90030b = false;
            c.this.f90032d.c();
        }

        public void onNext(Result<MallPrepareStateObj> result) {
            if (PatchProxy.proxy(new Object[]{result}, this, changeQuickRedirect, false, 39944, new Class[]{Result.class}, Void.TYPE).isSupported || c.this.f90031c.isFinishing()) {
                return;
            }
            super.onNext(result);
            MallPrepareStateObj result2 = result.getResult();
            if ("1".equals(result2.getPrepare_state())) {
                c.this.f90030b = false;
                c.this.f90032d.c();
                c.this.f90029a.onSuccess();
                return;
            }
            if ("2".equals(result2.getPrepare_state())) {
                c.this.f90030b = false;
                com.max.hbcommon.analytics.l.f66572a.t(SteamDirectPurchaseTool.f90634f);
                c.e(c.this, false);
                return;
            }
            if ("3".equals(result2.getPrepare_state())) {
                c.this.f90032d.c();
                c.this.f90030b = false;
                com.max.hbcommon.analytics.l.f66572a.t(SteamDirectPurchaseTool.f90636h);
                o.w(c.this.f90031c, "登录Steam账号", com.max.hbcommon.utils.l.e(R.string.purchase_login_steam_tips), null, new C0821a());
                return;
            }
            if ("4".equals(result2.getPrepare_state())) {
                int i10 = this.f90033b;
                if (i10 <= 20) {
                    c.this.g(i10 + 1);
                    return;
                }
                c.this.f90030b = false;
                c.this.f90029a.a();
                c.this.f90032d.c();
                com.max.hbutils.utils.c cVar = com.max.hbutils.utils.c.f73533a;
                com.max.hbutils.utils.c.f("检测超时请稍后再试");
                return;
            }
            if ("5".equals(result2.getPrepare_state())) {
                c.this.f90030b = false;
                c.this.f90029a.a();
                c.this.f90032d.c();
                o.w((BaseActivity) c.this.f90031c, null, result2.getMsg(), null, null);
                return;
            }
            c.this.f90030b = false;
            c.this.f90029a.a();
            c.this.f90032d.c();
            o.w((BaseActivity) c.this.f90031c, null, "检测异常", null, null);
        }

        @Override // com.max.hbcommon.network.d, io.reactivex.g0
        public /* bridge */ /* synthetic */ void onNext(Object obj) {
            if (PatchProxy.proxy(new Object[]{obj}, this, changeQuickRedirect, false, 39945, new Class[]{Object.class}, Void.TYPE).isSupported) {
                return;
            }
            onNext((Result<MallPrepareStateObj>) obj);
        }
    }

    /* JADX INFO: compiled from: MallCheckSteamAccountManager.java */
    public class b implements DialogInterface.OnClickListener {
        public static ChangeQuickRedirect changeQuickRedirect;

        b() {
        }

        @Override // android.content.DialogInterface.OnClickListener
        public void onClick(DialogInterface dialogInterface, int i10) {
            if (PatchProxy.proxy(new Object[]{dialogInterface, new Integer(i10)}, this, changeQuickRedirect, false, 39947, new Class[]{DialogInterface.class, Integer.TYPE}, Void.TYPE).isSupported) {
                return;
            }
            dialogInterface.dismiss();
        }
    }

    /* JADX INFO: renamed from: com.max.xiaoheihe.module.mall.c$c, reason: collision with other inner class name */
    /* JADX INFO: compiled from: MallCheckSteamAccountManager.java */
    public class DialogInterfaceOnClickListenerC0822c implements DialogInterface.OnClickListener {
        public static ChangeQuickRedirect changeQuickRedirect;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ boolean f90037b;

        DialogInterfaceOnClickListenerC0822c(boolean z10) {
            this.f90037b = z10;
        }

        @Override // android.content.DialogInterface.OnClickListener
        public void onClick(DialogInterface dialogInterface, int i10) {
            if (PatchProxy.proxy(new Object[]{dialogInterface, new Integer(i10)}, this, changeQuickRedirect, false, 39948, new Class[]{DialogInterface.class, Integer.TYPE}, Void.TYPE).isSupported) {
                return;
            }
            if (!this.f90037b) {
                com.max.hbcommon.analytics.l.f66572a.r(SteamDirectPurchaseTool.f90635g);
            }
            com.max.xiaoheihe.module.account.utils.l.D(c.this.f90031c instanceof BaseActivity ? ((BaseActivity) c.this.f90031c).V0() : new io.reactivex.disposables.a(), c.this.f90031c, false, true, 0);
            dialogInterface.dismiss();
        }
    }

    /* JADX INFO: compiled from: MallCheckSteamAccountManager.java */
    public class d extends com.max.hbcommon.network.d<Result<SteamWalletJsObj>> {
        public static ChangeQuickRedirect changeQuickRedirect;

        d() {
        }

        @Override // com.max.hbcommon.network.d, io.reactivex.g0
        public void onError(Throwable th2) {
            if (PatchProxy.proxy(new Object[]{th2}, this, changeQuickRedirect, false, 39949, new Class[]{Throwable.class}, Void.TYPE).isSupported || c.this.f90031c.isFinishing()) {
                return;
            }
            super.onError(th2);
            c.this.f90032d.c();
        }

        public void onNext(Result<SteamWalletJsObj> result) {
            if (PatchProxy.proxy(new Object[]{result}, this, changeQuickRedirect, false, 39950, new Class[]{Result.class}, Void.TYPE).isSupported || c.this.f90031c.isFinishing()) {
                return;
            }
            super.onNext(result);
            c.this.f90032d.c();
            SteamWalletJsObj result2 = result.getResult();
            result2.setCheckAccount(true);
            com.max.xiaoheihe.accelworld.p.b(c.this.f90031c, result2);
        }

        @Override // com.max.hbcommon.network.d, io.reactivex.g0
        public /* bridge */ /* synthetic */ void onNext(Object obj) {
            if (PatchProxy.proxy(new Object[]{obj}, this, changeQuickRedirect, false, 39951, new Class[]{Object.class}, Void.TYPE).isSupported) {
                return;
            }
            onNext((Result<SteamWalletJsObj>) obj);
        }
    }

    public c(Activity activity, com.max.xiaoheihe.module.game.f fVar) {
        this.f90029a = fVar;
        this.f90031c = activity;
        this.f90032d = new LoadingDialog(activity, "");
    }

    static /* synthetic */ void e(c cVar, boolean z10) {
        if (PatchProxy.proxy(new Object[]{cVar, new Byte(z10 ? (byte) 1 : (byte) 0)}, null, changeQuickRedirect, true, 39941, new Class[]{c.class, Boolean.TYPE}, Void.TYPE).isSupported) {
            return;
        }
        cVar.i(z10);
    }

    static /* synthetic */ void f(c cVar) {
        if (PatchProxy.proxy(new Object[]{cVar}, null, changeQuickRedirect, true, 39942, new Class[]{c.class}, Void.TYPE).isSupported) {
            return;
        }
        cVar.h();
    }

    private void h() {
        if (PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 39940, new Class[0], Void.TYPE).isSupported) {
            return;
        }
        com.max.xiaoheihe.network.i.a().h7(SteamWalletJsObj.KEY_LOAD_COOKIE).I5(io.reactivex.schedulers.b.d()).a4(io.reactivex.android.schedulers.a.c()).J5(new d());
    }

    private void i(boolean z10) {
        if (PatchProxy.proxy(new Object[]{new Byte(z10 ? (byte) 1 : (byte) 0)}, this, changeQuickRedirect, false, 39939, new Class[]{Boolean.TYPE}, Void.TYPE).isSupported) {
            return;
        }
        this.f90032d.c();
        if (this.f90031c.isFinishing()) {
            return;
        }
        new com.max.hbcommon.view.a.f(this.f90031c).y(this.f90031c.getString(R.string.bind_steam_tips_title)).l(this.f90031c.getString(R.string.bind_steam_tips_message)).u(this.f90031c.getString(R.string.confirm), new DialogInterfaceOnClickListenerC0822c(z10)).o(this.f90031c.getString(R.string.cancel), new b()).F();
    }

    public void g(int i10) {
        if (PatchProxy.proxy(new Object[]{new Integer(i10)}, this, changeQuickRedirect, false, 39938, new Class[]{Integer.TYPE}, Void.TYPE).isSupported) {
            return;
        }
        if (i10 == 0) {
            if (this.f90030b) {
                return;
            }
            this.f90030b = true;
            this.f90032d.r();
        }
        long j10 = 0;
        if (i10 > 4) {
            j10 = 2;
        } else if (i10 > 0) {
            j10 = 1;
        }
        com.max.xiaoheihe.network.i.a().H3().I5(io.reactivex.schedulers.b.d()).C1(j10, TimeUnit.SECONDS).a4(io.reactivex.android.schedulers.a.c()).J5(new a(i10));
    }
}
