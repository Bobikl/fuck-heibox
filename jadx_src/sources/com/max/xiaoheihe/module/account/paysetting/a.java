package com.max.xiaoheihe.module.account.paysetting;

import android.app.Activity;
import android.content.Context;
import android.content.DialogInterface;
import android.text.SpannableString;
import android.text.method.LinkMovementMethod;
import android.view.View;
import androidx.compose.runtime.internal.o;
import com.max.hbutils.bean.Result;
import com.max.xiaoheihe.R;
import com.max.xiaoheihe.bean.account.PayPwdConfigObj;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import kotlin.b2;
import kotlin.jvm.internal.f0;
import pb.p;

/* JADX INFO: compiled from: HBalancePwdUtils.kt */
/* JADX INFO: loaded from: classes9.dex */
@o(parameters = 0)
public final class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @dl.d
    public static final a f79140a = new a();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static final int f79141b = -9;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final int f79142c = 0;
    public static ChangeQuickRedirect changeQuickRedirect;

    /* JADX INFO: renamed from: com.max.xiaoheihe.module.account.paysetting.a$a, reason: collision with other inner class name */
    /* JADX INFO: compiled from: HBalancePwdUtils.kt */
    public static final class C0658a extends com.max.hbcommon.network.d<Result<PayPwdConfigObj>> {
        public static ChangeQuickRedirect changeQuickRedirect;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ Activity f79143b;

        C0658a(Activity activity) {
            this.f79143b = activity;
        }

        @Override // com.max.hbcommon.network.d, io.reactivex.g0
        public void onError(@dl.d Throwable e10) {
            if (PatchProxy.proxy(new Object[]{e10}, this, changeQuickRedirect, false, 25159, new Class[]{Throwable.class}, Void.TYPE).isSupported) {
                return;
            }
            f0.p(e10, "e");
        }

        public void onNext(@dl.d Result<PayPwdConfigObj> result) {
            Activity activity;
            if (PatchProxy.proxy(new Object[]{result}, this, changeQuickRedirect, false, 25160, new Class[]{Result.class}, Void.TYPE).isSupported) {
                return;
            }
            f0.p(result, "result");
            if (result.getResult().getSet_pay_password() || (activity = this.f79143b) == null || activity.isFinishing()) {
                return;
            }
            a.f79140a.g(this.f79143b);
        }

        @Override // com.max.hbcommon.network.d, io.reactivex.g0
        public /* bridge */ /* synthetic */ void onNext(Object obj) {
            if (PatchProxy.proxy(new Object[]{obj}, this, changeQuickRedirect, false, 25161, new Class[]{Object.class}, Void.TYPE).isSupported) {
                return;
            }
            onNext((Result<PayPwdConfigObj>) obj);
        }
    }

    /* JADX INFO: compiled from: HBalancePwdUtils.kt */
    public static final class b extends com.max.hbcommon.network.d<Result<Object>> {
        public static ChangeQuickRedirect changeQuickRedirect;

        b() {
        }

        public void onNext(@dl.d Result<Object> result) {
            if (PatchProxy.proxy(new Object[]{result}, this, changeQuickRedirect, false, 25162, new Class[]{Result.class}, Void.TYPE).isSupported) {
                return;
            }
            f0.p(result, "result");
            com.max.hbutils.utils.c.f("开启成功");
        }

        @Override // com.max.hbcommon.network.d, io.reactivex.g0
        public /* bridge */ /* synthetic */ void onNext(Object obj) {
            if (PatchProxy.proxy(new Object[]{obj}, this, changeQuickRedirect, false, 25163, new Class[]{Object.class}, Void.TYPE).isSupported) {
                return;
            }
            onNext((Result<Object>) obj);
        }
    }

    /* JADX INFO: compiled from: HBalancePwdUtils.kt */
    public static final class c implements DialogInterface.OnClickListener {
        public static ChangeQuickRedirect changeQuickRedirect;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ yh.a<b2> f79144b;

        c(yh.a<b2> aVar) {
            this.f79144b = aVar;
        }

        @Override // android.content.DialogInterface.OnClickListener
        public final void onClick(DialogInterface dialogInterface, int i10) {
            if (PatchProxy.proxy(new Object[]{dialogInterface, new Integer(i10)}, this, changeQuickRedirect, false, 25164, new Class[]{DialogInterface.class, Integer.TYPE}, Void.TYPE).isSupported) {
                return;
            }
            this.f79144b.invoke();
            dialogInterface.dismiss();
        }
    }

    /* JADX INFO: compiled from: HBalancePwdUtils.kt */
    public static final class d implements DialogInterface.OnClickListener {
        public static ChangeQuickRedirect changeQuickRedirect;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ yh.a<b2> f79145b;

        d(yh.a<b2> aVar) {
            this.f79145b = aVar;
        }

        @Override // android.content.DialogInterface.OnClickListener
        public final void onClick(DialogInterface dialogInterface, int i10) {
            if (PatchProxy.proxy(new Object[]{dialogInterface, new Integer(i10)}, this, changeQuickRedirect, false, 25165, new Class[]{DialogInterface.class, Integer.TYPE}, Void.TYPE).isSupported) {
                return;
            }
            this.f79145b.invoke();
            dialogInterface.dismiss();
        }
    }

    /* JADX INFO: compiled from: HBalancePwdUtils.kt */
    public static final class e extends com.max.hbcustomview.spans.d {
        public static ChangeQuickRedirect changeQuickRedirect;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        final /* synthetic */ Context f79146d;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        e(Context context, int i10) {
            super(i10);
            this.f79146d = context;
        }

        @Override // android.text.style.ClickableSpan
        public void onClick(@dl.d View view) {
            if (PatchProxy.proxy(new Object[]{view}, this, changeQuickRedirect, false, 25166, new Class[]{View.class}, Void.TYPE).isSupported) {
                return;
            }
            f0.p(view, "view");
            p pVarP = ob.a.p();
            Context context = this.f79146d;
            String PAY_WITHOUT_PWD_AGREEMENT = lb.a.A4;
            f0.o(PAY_WITHOUT_PWD_AGREEMENT, "PAY_WITHOUT_PWD_AGREEMENT");
            pVarP.a(context, "黑盒余额小额免密支付服务协议", PAY_WITHOUT_PWD_AGREEMENT);
        }
    }

    /* JADX INFO: compiled from: HBalancePwdUtils.kt */
    public static final class f implements DialogInterface.OnClickListener {
        public static ChangeQuickRedirect changeQuickRedirect;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ yh.a<b2> f79147b;

        f(yh.a<b2> aVar) {
            this.f79147b = aVar;
        }

        @Override // android.content.DialogInterface.OnClickListener
        public final void onClick(DialogInterface dialogInterface, int i10) {
            if (PatchProxy.proxy(new Object[]{dialogInterface, new Integer(i10)}, this, changeQuickRedirect, false, 25167, new Class[]{DialogInterface.class, Integer.TYPE}, Void.TYPE).isSupported) {
                return;
            }
            this.f79147b.invoke();
            dialogInterface.dismiss();
        }
    }

    /* JADX INFO: compiled from: HBalancePwdUtils.kt */
    public static final class g implements DialogInterface.OnClickListener {
        public static ChangeQuickRedirect changeQuickRedirect;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ yh.a<b2> f79148b;

        g(yh.a<b2> aVar) {
            this.f79148b = aVar;
        }

        @Override // android.content.DialogInterface.OnClickListener
        public final void onClick(DialogInterface dialogInterface, int i10) {
            if (PatchProxy.proxy(new Object[]{dialogInterface, new Integer(i10)}, this, changeQuickRedirect, false, 25168, new Class[]{DialogInterface.class, Integer.TYPE}, Void.TYPE).isSupported) {
                return;
            }
            this.f79148b.invoke();
            dialogInterface.dismiss();
        }
    }

    /* JADX INFO: compiled from: HBalancePwdUtils.kt */
    public static final class h implements DialogInterface.OnClickListener {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public static final h f79149b = new h();
        public static ChangeQuickRedirect changeQuickRedirect;

        h() {
        }

        @Override // android.content.DialogInterface.OnClickListener
        public final void onClick(DialogInterface dialogInterface, int i10) {
            if (PatchProxy.proxy(new Object[]{dialogInterface, new Integer(i10)}, this, changeQuickRedirect, false, 25169, new Class[]{DialogInterface.class, Integer.TYPE}, Void.TYPE).isSupported) {
                return;
            }
            dialogInterface.dismiss();
        }
    }

    /* JADX INFO: compiled from: HBalancePwdUtils.kt */
    public static final class i implements DialogInterface.OnClickListener {
        public static ChangeQuickRedirect changeQuickRedirect;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ Activity f79150b;

        i(Activity activity) {
            this.f79150b = activity;
        }

        @Override // android.content.DialogInterface.OnClickListener
        public final void onClick(DialogInterface dialogInterface, int i10) {
            if (PatchProxy.proxy(new Object[]{dialogInterface, new Integer(i10)}, this, changeQuickRedirect, false, 25170, new Class[]{DialogInterface.class, Integer.TYPE}, Void.TYPE).isSupported) {
                return;
            }
            Activity activity = this.f79150b;
            activity.startActivity(InputPayPwdActivity.O.d(activity));
            dialogInterface.dismiss();
        }
    }

    /* JADX INFO: compiled from: HBalancePwdUtils.kt */
    public static final class j implements DialogInterface.OnClickListener {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public static final j f79151b = new j();
        public static ChangeQuickRedirect changeQuickRedirect;

        j() {
        }

        @Override // android.content.DialogInterface.OnClickListener
        public final void onClick(DialogInterface dialogInterface, int i10) {
            if (PatchProxy.proxy(new Object[]{dialogInterface, new Integer(i10)}, this, changeQuickRedirect, false, 25171, new Class[]{DialogInterface.class, Integer.TYPE}, Void.TYPE).isSupported) {
                return;
            }
            dialogInterface.dismiss();
        }
    }

    private a() {
    }

    public final void a(@dl.d Activity activity) {
        if (PatchProxy.proxy(new Object[]{activity}, this, changeQuickRedirect, false, 25157, new Class[]{Activity.class}, Void.TYPE).isSupported) {
            return;
        }
        f0.p(activity, "activity");
        com.max.xiaoheihe.network.i.a().Q5().I5(io.reactivex.schedulers.b.d()).a4(io.reactivex.android.schedulers.a.c()).g(new C0658a(activity));
    }

    public final int b() {
        return f79141b;
    }

    public final void c() {
        if (PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 25156, new Class[0], Void.TYPE).isSupported) {
            return;
        }
        com.max.xiaoheihe.network.i.a().p2("open").I5(io.reactivex.schedulers.b.d()).a4(io.reactivex.android.schedulers.a.c()).J5(new b());
    }

    public final void d(@dl.d Context mContext, @dl.d yh.a<b2> callback, @dl.d yh.a<b2> dissmissCallback) {
        if (PatchProxy.proxy(new Object[]{mContext, callback, dissmissCallback}, this, changeQuickRedirect, false, 25153, new Class[]{Context.class, yh.a.class, yh.a.class}, Void.TYPE).isSupported) {
            return;
        }
        f0.p(mContext, "mContext");
        f0.p(callback, "callback");
        f0.p(dissmissCallback, "dissmissCallback");
        new com.max.hbcommon.view.a.f(mContext).y("关闭黑盒余额免密支付").l("黑盒余额免密支付关闭后，再次开启需要输入支付密码验证，确认要关闭黑盒余额免密支付吗？").g(false).u("继续使用", new c(dissmissCallback)).o("确认关闭", new d(callback)).F().o(17);
    }

    public final void e(@dl.d Context mContext, @dl.d yh.a<b2> callback) {
        if (PatchProxy.proxy(new Object[]{mContext, callback}, this, changeQuickRedirect, false, 25155, new Class[]{Context.class, yh.a.class}, Void.TYPE).isSupported) {
            return;
        }
        f0.p(mContext, "mContext");
        f0.p(callback, "callback");
        SpannableString spannableString = new SpannableString("黑盒余额小额支付时，无需输入支付密码开启后可在 设置-安全与绑定 中关闭\n查看《黑盒余额小额免密支付服务协议》");
        spannableString.setSpan(new e(mContext, mContext.getResources().getColor(R.color.click_blue)), spannableString.length() + (-16), spannableString.length(), 33);
        com.max.hbcommon.view.a aVarF = new com.max.hbcommon.view.a.f(mContext).y("开启黑盒余额免密支付").l(spannableString).u("同意协议并开通免密支付", new f(callback)).g(false).w(true).F();
        aVarF.o(17);
        aVarF.f().setMovementMethod(LinkMovementMethod.getInstance());
    }

    public final void f(@dl.d Context mContext, @dl.d yh.a<b2> callback) {
        if (PatchProxy.proxy(new Object[]{mContext, callback}, this, changeQuickRedirect, false, 25154, new Class[]{Context.class, yh.a.class}, Void.TYPE).isSupported) {
            return;
        }
        f0.p(mContext, "mContext");
        f0.p(callback, "callback");
        new com.max.hbcommon.view.a.f(mContext).y("设置黑盒余额支付密码").l("为了保障您使用黑盒余额的支付安全，需要设置支付密码").u("去设置", new g(callback)).o("取消", h.f79149b).g(false).F().o(17);
    }

    public final void g(@dl.d Activity activity) {
        if (PatchProxy.proxy(new Object[]{activity}, this, changeQuickRedirect, false, 25158, new Class[]{Activity.class}, Void.TYPE).isSupported) {
            return;
        }
        f0.p(activity, "activity");
        new com.max.hbcommon.view.a.f(activity).y("请设置黑盒余额支付密码").l("为了保证您的支付安全," + com.max.xiaoheihe.utils.d.A() + "余额支付需要设置支付密码").u("去设置", new i(activity)).o("暂不设置", j.f79151b).g(false).F().o(17);
    }
}
