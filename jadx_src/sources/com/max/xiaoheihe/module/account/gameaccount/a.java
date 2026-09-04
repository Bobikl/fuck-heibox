package com.max.xiaoheihe.module.account.gameaccount;

import android.app.Activity;
import android.content.Context;
import android.content.DialogInterface;
import androidx.compose.runtime.internal.o;
import com.max.hbcommon.base.BaseActivity;
import com.max.hbcustomview.loadingdialog.LoadingDialog;
import com.max.hbutils.bean.Result;
import com.max.heybox.hblog.g;
import com.max.xiaoheihe.R;
import com.max.xiaoheihe.module.account.MeHomeFragmentx;
import com.max.xiaoheihe.module.account.utils.l;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import dl.e;
import java.util.Arrays;
import kotlin.jvm.internal.f0;
import kotlin.jvm.internal.v0;

/* JADX INFO: compiled from: GameAccountController.kt */
/* JADX INFO: loaded from: classes9.dex */
@o(parameters = 0)
public final class a {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final int f78930b = 8;
    public static ChangeQuickRedirect changeQuickRedirect;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @dl.d
    private final Context f78931a;

    /* JADX INFO: renamed from: com.max.xiaoheihe.module.account.gameaccount.a$a, reason: collision with other inner class name */
    /* JADX INFO: compiled from: GameAccountController.kt */
    public static final class C0653a extends com.max.hbcommon.network.d<Result<Object>> {
        public static ChangeQuickRedirect changeQuickRedirect;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ LoadingDialog f78932b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ Context f78933c;

        C0653a(LoadingDialog loadingDialog, Context context) {
            this.f78932b = loadingDialog;
            this.f78933c = context;
        }

        @Override // com.max.hbcommon.network.d, io.reactivex.g0
        public void onError(@dl.d Throwable e10) {
            if (PatchProxy.proxy(new Object[]{e10}, this, changeQuickRedirect, false, 24969, new Class[]{Throwable.class}, Void.TYPE).isSupported) {
                return;
            }
            f0.p(e10, "e");
            super.onError(e10);
            this.f78932b.c();
        }

        public void onNext(@dl.d Result<Object> result) {
            if (PatchProxy.proxy(new Object[]{result}, this, changeQuickRedirect, false, 24970, new Class[]{Result.class}, Void.TYPE).isSupported) {
                return;
            }
            f0.p(result, "result");
            this.f78932b.c();
            com.max.xiaoheihe.utils.d.y1(this.f78933c, lb.a.f131074y0);
            super.onNext(result);
        }

        @Override // com.max.hbcommon.network.d, io.reactivex.g0
        public /* bridge */ /* synthetic */ void onNext(Object obj) {
            if (PatchProxy.proxy(new Object[]{obj}, this, changeQuickRedirect, false, 24971, new Class[]{Object.class}, Void.TYPE).isSupported) {
                return;
            }
            onNext((Result<Object>) obj);
        }
    }

    /* JADX INFO: compiled from: GameAccountController.kt */
    public static final class b extends com.max.hbcommon.network.d<Result<?>> {
        public static ChangeQuickRedirect changeQuickRedirect;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ LoadingDialog f78934b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ String f78935c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        final /* synthetic */ a f78936d;

        b(LoadingDialog loadingDialog, String str, a aVar) {
            this.f78934b = loadingDialog;
            this.f78935c = str;
            this.f78936d = aVar;
        }

        @Override // com.max.hbcommon.network.d, io.reactivex.g0
        public void onError(@dl.d Throwable e10) {
            if (PatchProxy.proxy(new Object[]{e10}, this, changeQuickRedirect, false, 24972, new Class[]{Throwable.class}, Void.TYPE).isSupported) {
                return;
            }
            f0.p(e10, "e");
            super.onError(e10);
            this.f78934b.c();
        }

        public void onNext(@dl.d Result<?> result) {
            if (PatchProxy.proxy(new Object[]{result}, this, changeQuickRedirect, false, 24973, new Class[]{Result.class}, Void.TYPE).isSupported) {
                return;
            }
            f0.p(result, "result");
            super.onNext(result);
            this.f78934b.c();
            if (f0.g("epic", this.f78935c)) {
                MeHomeFragmentx.Z3 = false;
            }
            com.max.xiaoheihe.utils.d.y1(this.f78936d.b(), lb.a.f131074y0);
        }

        @Override // com.max.hbcommon.network.d, io.reactivex.g0
        public /* bridge */ /* synthetic */ void onNext(Object obj) {
            if (PatchProxy.proxy(new Object[]{obj}, this, changeQuickRedirect, false, 24974, new Class[]{Object.class}, Void.TYPE).isSupported) {
                return;
            }
            onNext((Result<?>) obj);
        }
    }

    /* JADX INFO: compiled from: GameAccountController.kt */
    public static final class c implements DialogInterface.OnClickListener {
        public static ChangeQuickRedirect changeQuickRedirect;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ String f78938c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        final /* synthetic */ String f78939d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        final /* synthetic */ boolean f78940e;

        c(String str, String str2, boolean z10) {
            this.f78938c = str;
            this.f78939d = str2;
            this.f78940e = z10;
        }

        @Override // android.content.DialogInterface.OnClickListener
        public final void onClick(DialogInterface dialogInterface, int i10) {
            if (PatchProxy.proxy(new Object[]{dialogInterface, new Integer(i10)}, this, changeQuickRedirect, false, 24975, new Class[]{DialogInterface.class, Integer.TYPE}, Void.TYPE).isSupported) {
                return;
            }
            a.a(a.this, this.f78938c, this.f78939d, this.f78940e);
            dialogInterface.dismiss();
        }
    }

    /* JADX INFO: compiled from: GameAccountController.kt */
    public static final class d implements DialogInterface.OnClickListener {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public static final d f78941b = new d();
        public static ChangeQuickRedirect changeQuickRedirect;

        d() {
        }

        @Override // android.content.DialogInterface.OnClickListener
        public final void onClick(DialogInterface dialogInterface, int i10) {
            if (PatchProxy.proxy(new Object[]{dialogInterface, new Integer(i10)}, this, changeQuickRedirect, false, 24976, new Class[]{DialogInterface.class, Integer.TYPE}, Void.TYPE).isSupported) {
                return;
            }
            dialogInterface.dismiss();
        }
    }

    public a(@dl.d Context context) {
        f0.p(context, "context");
        this.f78931a = context;
    }

    public static final /* synthetic */ void a(a aVar, String str, String str2, boolean z10) {
        if (PatchProxy.proxy(new Object[]{aVar, str, str2, new Byte(z10 ? (byte) 1 : (byte) 0)}, null, changeQuickRedirect, true, 24968, new Class[]{a.class, String.class, String.class, Boolean.TYPE}, Void.TYPE).isSupported) {
            return;
        }
        aVar.d(str, str2, z10);
    }

    private final void d(String str, String str2, boolean z10) {
        if (PatchProxy.proxy(new Object[]{str, str2, new Byte(z10 ? (byte) 1 : (byte) 0)}, this, changeQuickRedirect, false, 24966, new Class[]{String.class, String.class, Boolean.TYPE}, Void.TYPE).isSupported) {
            return;
        }
        g.f74531b.q("ChangeBindListAdapterV2, unBindGame, gameType = " + str + ", accountId = " + str2);
        if (f0.g("steam", str)) {
            Context context = this.f78931a;
            if ((context instanceof BaseActivity) && z10) {
                f0.n(context, "null cannot be cast to non-null type com.max.hbcommon.base.BaseActivity");
                l.D(((BaseActivity) context).V0(), (Activity) this.f78931a, true, true, 3);
                return;
            }
        }
    }

    static /* synthetic */ void e(a aVar, String str, String str2, boolean z10, int i10, Object obj) {
        if (PatchProxy.proxy(new Object[]{aVar, str, str2, new Byte(z10 ? (byte) 1 : (byte) 0), new Integer(i10), obj}, null, changeQuickRedirect, true, 24967, new Class[]{a.class, String.class, String.class, Boolean.TYPE, Integer.TYPE, Object.class}, Void.TYPE).isSupported) {
            return;
        }
        aVar.d(str, str2, (i10 & 4) == 0 ? z10 ? 1 : 0 : false);
    }

    public static /* synthetic */ void g(a aVar, String str, String str2, String str3, boolean z10, int i10, Object obj) {
        if (PatchProxy.proxy(new Object[]{aVar, str, str2, str3, new Byte(z10 ? (byte) 1 : (byte) 0), new Integer(i10), obj}, null, changeQuickRedirect, true, 24965, new Class[]{a.class, String.class, String.class, String.class, Boolean.TYPE, Integer.TYPE, Object.class}, Void.TYPE).isSupported) {
            return;
        }
        aVar.f(str, str2, str3, (i10 & 8) == 0 ? z10 ? 1 : 0 : false);
    }

    @dl.d
    public final Context b() {
        return this.f78931a;
    }

    public final void c(@dl.d Context context, @dl.d String accountId, @dl.d String platform) {
        if (PatchProxy.proxy(new Object[]{context, accountId, platform}, this, changeQuickRedirect, false, 24963, new Class[]{Context.class, String.class, String.class}, Void.TYPE).isSupported) {
            return;
        }
        f0.p(context, "context");
        f0.p(accountId, "accountId");
        f0.p(platform, "platform");
    }

    public final void f(@e String str, @e String str2, @e String str3, boolean z10) {
        String str4;
        if (PatchProxy.proxy(new Object[]{str, str2, str3, new Byte(z10 ? (byte) 1 : (byte) 0)}, this, changeQuickRedirect, false, 24964, new Class[]{String.class, String.class, String.class, Boolean.TYPE}, Void.TYPE).isSupported) {
            return;
        }
        String str5 = "确认解绑当前账号";
        if (f0.g("steam", str2)) {
            str4 = z10 ? "解绑Steam主账号需要登录验证" : "";
        } else {
            v0 v0Var = v0.f124986a;
            str5 = String.format("%s 解绑", Arrays.copyOf(new Object[]{str}, 1));
            f0.o(str5, "format(format, *args)");
            str4 = String.format("你确定要解除%s绑定吗？", Arrays.copyOf(new Object[]{str}, 1));
            f0.o(str4, "format(format, *args)");
        }
        new com.max.hbcommon.view.a.f(this.f78931a).y(str5).l(str4).t(R.string.confirm, new c(str2, str3, z10)).n(R.string.cancel, d.f78941b).F();
    }
}
