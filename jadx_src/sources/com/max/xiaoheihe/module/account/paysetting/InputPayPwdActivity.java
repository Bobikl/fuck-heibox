package com.max.xiaoheihe.module.account.paysetting;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.view.View;
import android.widget.LinearLayout;
import androidx.compose.runtime.internal.o;
import com.max.hbcommon.base.BaseActivity;
import com.max.hbcustomview.AutoPlayView;
import com.max.hbcustomview.PinEntryEditText;
import com.max.hbcustomview.loadingdialog.LoadingDialog;
import com.max.hbutils.bean.Result;
import com.max.hbutils.utils.ViewUtils;
import com.max.xiaoheihe.R;
import com.max.xiaoheihe.network.i;
import com.max.xiaoheihe.utils.w;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.PatchProxyResult;
import df.x0;
import kotlin.jvm.internal.f0;
import kotlin.jvm.internal.u;
import kotlin.k;
import xh.m;

/* JADX INFO: compiled from: InputPayPwdActivity.kt */
/* JADX INFO: loaded from: classes9.dex */
@o(parameters = 0)
public final class InputPayPwdActivity extends BaseActivity {

    @dl.d
    public static final a O = new a(null);
    public static final int P = 8;

    @dl.d
    private static final String Q = "ARG_PAGE_STYLE";
    private static final int R = 9;
    public static ChangeQuickRedirect changeQuickRedirect;
    private x0 L;
    private int M;

    @dl.e
    private LoadingDialog N;

    /* JADX INFO: compiled from: InputPayPwdActivity.kt */
    public static final class a {
        public static ChangeQuickRedirect changeQuickRedirect;

        private a() {
        }

        public /* synthetic */ a(u uVar) {
            this();
        }

        @dl.d
        public final String a() {
            PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 25182, new Class[0], String.class);
            return patchProxyResultProxy.isSupported ? (String) patchProxyResultProxy.result : InputPayPwdActivity.Q;
        }

        @dl.d
        @m
        public final Intent b(@dl.d Context context) {
            PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{context}, this, changeQuickRedirect, false, 25185, new Class[]{Context.class}, Intent.class);
            if (patchProxyResultProxy.isSupported) {
                return (Intent) patchProxyResultProxy.result;
            }
            f0.p(context, "context");
            Intent intent = new Intent(context, (Class<?>) InputPayPwdActivity.class);
            intent.putExtra(a(), 1);
            return intent;
        }

        public final int c() {
            PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 25183, new Class[0], Integer.TYPE);
            return patchProxyResultProxy.isSupported ? ((Integer) patchProxyResultProxy.result).intValue() : InputPayPwdActivity.R;
        }

        @dl.d
        @m
        public final Intent d(@dl.d Context context) {
            PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{context}, this, changeQuickRedirect, false, 25186, new Class[]{Context.class}, Intent.class);
            if (patchProxyResultProxy.isSupported) {
                return (Intent) patchProxyResultProxy.result;
            }
            f0.p(context, "context");
            Intent intent = new Intent(context, (Class<?>) InputPayPwdActivity.class);
            intent.putExtra(a(), 2);
            return intent;
        }

        @dl.d
        @m
        public final Intent e(@dl.d Context context) {
            PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{context}, this, changeQuickRedirect, false, 25184, new Class[]{Context.class}, Intent.class);
            if (patchProxyResultProxy.isSupported) {
                return (Intent) patchProxyResultProxy.result;
            }
            f0.p(context, "context");
            Intent intent = new Intent(context, (Class<?>) InputPayPwdActivity.class);
            intent.putExtra(a(), 0);
            return intent;
        }
    }

    /* JADX INFO: compiled from: InputPayPwdActivity.kt */
    public static final class b implements PinEntryEditText.i {
        public static ChangeQuickRedirect changeQuickRedirect;

        b() {
        }

        @Override // com.max.hbcustomview.PinEntryEditText.i
        public final void a(CharSequence charSequence) {
            if (PatchProxy.proxy(new Object[]{charSequence}, this, changeQuickRedirect, false, 25187, new Class[]{CharSequence.class}, Void.TYPE).isSupported) {
                return;
            }
            InputPayPwdActivity.T1(InputPayPwdActivity.this, charSequence.toString());
        }
    }

    /* JADX INFO: compiled from: InputPayPwdActivity.kt */
    public static final class c implements View.OnClickListener {
        public static ChangeQuickRedirect changeQuickRedirect;

        c() {
        }

        @Override // android.view.View.OnClickListener
        public final void onClick(View view) {
            if (PatchProxy.proxy(new Object[]{view}, this, changeQuickRedirect, false, 25188, new Class[]{View.class}, Void.TYPE).isSupported) {
                return;
            }
            Activity mContext = ((BaseActivity) InputPayPwdActivity.this).f66601b;
            f0.o(mContext, "mContext");
            com.max.xiaoheihe.base.router.b.f(mContext, lb.d.f131237q4).C(InputPayPwdActivity.O.c()).A();
        }
    }

    /* JADX INFO: compiled from: InputPayPwdActivity.kt */
    public static final class d extends com.max.hbcommon.network.d<Result<Object>> {
        public static ChangeQuickRedirect changeQuickRedirect;

        d() {
        }

        @Override // com.max.hbcommon.network.d, io.reactivex.g0
        public void onError(@dl.d Throwable e10) {
            if (PatchProxy.proxy(new Object[]{e10}, this, changeQuickRedirect, false, 25189, new Class[]{Throwable.class}, Void.TYPE).isSupported) {
                return;
            }
            f0.p(e10, "e");
            if (InputPayPwdActivity.this.isActive()) {
                LoadingDialog loadingDialog = InputPayPwdActivity.this.N;
                if (loadingDialog != null) {
                    loadingDialog.a();
                }
                super.onError(e10);
            }
        }

        public void onNext(@dl.d Result<Object> result) {
            if (PatchProxy.proxy(new Object[]{result}, this, changeQuickRedirect, false, 25190, new Class[]{Result.class}, Void.TYPE).isSupported) {
                return;
            }
            f0.p(result, "result");
            if (InputPayPwdActivity.this.isActive()) {
                InputPayPwdActivity.this.setResult(-1);
                InputPayPwdActivity.this.finish();
            }
        }

        @Override // com.max.hbcommon.network.d, io.reactivex.g0
        public /* bridge */ /* synthetic */ void onNext(Object obj) {
            if (PatchProxy.proxy(new Object[]{obj}, this, changeQuickRedirect, false, 25191, new Class[]{Object.class}, Void.TYPE).isSupported) {
                return;
            }
            onNext((Result<Object>) obj);
        }
    }

    /* JADX INFO: compiled from: InputPayPwdActivity.kt */
    public static final class e extends com.max.hbcommon.network.d<Result<Object>> {
        public static ChangeQuickRedirect changeQuickRedirect;

        e() {
        }

        @Override // com.max.hbcommon.network.d, io.reactivex.g0
        public void onError(@dl.d Throwable e10) {
            if (PatchProxy.proxy(new Object[]{e10}, this, changeQuickRedirect, false, 25192, new Class[]{Throwable.class}, Void.TYPE).isSupported) {
                return;
            }
            f0.p(e10, "e");
            if (InputPayPwdActivity.this.isActive()) {
                LoadingDialog loadingDialog = InputPayPwdActivity.this.N;
                if (loadingDialog != null) {
                    loadingDialog.a();
                }
                super.onError(e10);
                x0 x0Var = InputPayPwdActivity.this.L;
                if (x0Var == null) {
                    f0.S("mBinding");
                    x0Var = null;
                }
                x0Var.f117330e.setText("");
            }
        }

        public void onNext(@dl.d Result<Object> result) {
            if (PatchProxy.proxy(new Object[]{result}, this, changeQuickRedirect, false, 25193, new Class[]{Result.class}, Void.TYPE).isSupported) {
                return;
            }
            f0.p(result, "result");
            if (InputPayPwdActivity.this.isActive()) {
                InputPayPwdActivity.this.setResult(-1);
                InputPayPwdActivity.this.finish();
            }
        }

        @Override // com.max.hbcommon.network.d, io.reactivex.g0
        public /* bridge */ /* synthetic */ void onNext(Object obj) {
            if (PatchProxy.proxy(new Object[]{obj}, this, changeQuickRedirect, false, 25194, new Class[]{Object.class}, Void.TYPE).isSupported) {
                return;
            }
            onNext((Result<Object>) obj);
        }
    }

    public static final /* synthetic */ void T1(InputPayPwdActivity inputPayPwdActivity, String str) {
        if (PatchProxy.proxy(new Object[]{inputPayPwdActivity, str}, null, changeQuickRedirect, true, 25181, new Class[]{InputPayPwdActivity.class, String.class}, Void.TYPE).isSupported) {
            return;
        }
        inputPayPwdActivity.a2(str);
    }

    @dl.d
    @m
    public static final Intent V1(@dl.d Context context) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{context}, null, changeQuickRedirect, true, 25179, new Class[]{Context.class}, Intent.class);
        return patchProxyResultProxy.isSupported ? (Intent) patchProxyResultProxy.result : O.b(context);
    }

    @dl.d
    @m
    public static final Intent W1(@dl.d Context context) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{context}, null, changeQuickRedirect, true, 25180, new Class[]{Context.class}, Intent.class);
        return patchProxyResultProxy.isSupported ? (Intent) patchProxyResultProxy.result : O.d(context);
    }

    @dl.d
    @m
    public static final Intent X1(@dl.d Context context) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{context}, null, changeQuickRedirect, true, 25178, new Class[]{Context.class}, Intent.class);
        return patchProxyResultProxy.isSupported ? (Intent) patchProxyResultProxy.result : O.e(context);
    }

    private final void Y1() {
        AutoPlayView autoPlayView;
        if (PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 25173, new Class[0], Void.TYPE).isSupported) {
            return;
        }
        x0 x0Var = this.L;
        x0 x0Var2 = null;
        if (x0Var == null) {
            f0.S("mBinding");
            x0Var = null;
        }
        x0Var.f117335j.removeAllViews();
        int iCeil = (int) Math.ceil(((double) ViewUtils.J(this.f66601b)) / ((double) ViewUtils.f(this.f66601b, 46.0f)));
        for (int i10 = 0; i10 < iCeil; i10++) {
            int i11 = i10 % 6;
            if (i11 == 0) {
                autoPlayView = new AutoPlayView(this.f66601b, true, R.drawable.login_bg_anim_1);
            } else if (i11 == 1) {
                autoPlayView = new AutoPlayView(this.f66601b, false, R.drawable.login_bg_anim_1);
            } else if (i11 == 2) {
                autoPlayView = new AutoPlayView(this.f66601b, true, R.drawable.login_bg_anim_2);
            } else if (i11 == 3) {
                autoPlayView = new AutoPlayView(this.f66601b, false, R.drawable.login_bg_anim_2);
            } else {
                autoPlayView = i11 == 4 ? new AutoPlayView(this.f66601b, true, R.drawable.login_bg_anim_3) : new AutoPlayView(this.f66601b, false, R.drawable.login_bg_anim_3);
            }
            LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(-2, -2);
            layoutParams.bottomMargin = ViewUtils.f(this.f66601b, 30.0f);
            autoPlayView.setLayoutParams(layoutParams);
            x0 x0Var3 = this.L;
            if (x0Var3 == null) {
                f0.S("mBinding");
                x0Var3 = null;
            }
            x0Var3.f117335j.addView(autoPlayView);
        }
        x0 x0Var4 = this.L;
        if (x0Var4 == null) {
            f0.S("mBinding");
        } else {
            x0Var2 = x0Var4;
        }
        x0Var2.f117330e.setOnPinEnteredListener(new b());
    }

    private final void Z1() {
        if (PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 25174, new Class[0], Void.TYPE).isSupported) {
            return;
        }
        int i10 = this.M;
        x0 x0Var = null;
        if (i10 == 0) {
            x0 x0Var2 = this.L;
            if (x0Var2 == null) {
                f0.S("mBinding");
                x0Var2 = null;
            }
            x0Var2.f117334i.setTitle("验证支付密码");
            x0 x0Var3 = this.L;
            if (x0Var3 == null) {
                f0.S("mBinding");
                x0Var3 = null;
            }
            x0Var3.f117333h.setText("验证支付密码");
            x0 x0Var4 = this.L;
            if (x0Var4 == null) {
                f0.S("mBinding");
                x0Var4 = null;
            }
            x0Var4.f117331f.setText("请输入当前支付密码，用于支付认证");
            x0 x0Var5 = this.L;
            if (x0Var5 == null) {
                f0.S("mBinding");
                x0Var5 = null;
            }
            x0Var5.f117332g.setVisibility(0);
            x0 x0Var6 = this.L;
            if (x0Var6 == null) {
                f0.S("mBinding");
            } else {
                x0Var = x0Var6;
            }
            x0Var.f117332g.setOnClickListener(new c());
            return;
        }
        if (i10 == 1) {
            x0 x0Var7 = this.L;
            if (x0Var7 == null) {
                f0.S("mBinding");
                x0Var7 = null;
            }
            x0Var7.f117334i.setTitle("修改支付密码");
        } else {
            x0 x0Var8 = this.L;
            if (x0Var8 == null) {
                f0.S("mBinding");
                x0Var8 = null;
            }
            x0Var8.f117334i.setTitle("设置支付密码");
        }
        x0 x0Var9 = this.L;
        if (x0Var9 == null) {
            f0.S("mBinding");
            x0Var9 = null;
        }
        x0Var9.f117333h.setText("设置6位数字支付密码");
        x0 x0Var10 = this.L;
        if (x0Var10 == null) {
            f0.S("mBinding");
            x0Var10 = null;
        }
        x0Var10.f117331f.setText("请设置新密码，用于支付认证");
        x0 x0Var11 = this.L;
        if (x0Var11 == null) {
            f0.S("mBinding");
        } else {
            x0Var = x0Var11;
        }
        x0Var.f117332g.setVisibility(8);
    }

    private final void a2(String str) {
        if (PatchProxy.proxy(new Object[]{str}, this, changeQuickRedirect, false, 25175, new Class[]{String.class}, Void.TYPE).isSupported) {
            return;
        }
        this.N = new LoadingDialog(this, "").r();
        if (this.M == 0) {
            c2(str);
        } else {
            b2(str);
        }
    }

    private final void b2(String str) {
        if (PatchProxy.proxy(new Object[]{str}, this, changeQuickRedirect, false, 25176, new Class[]{String.class}, Void.TYPE).isSupported) {
            return;
        }
        V((io.reactivex.disposables.b) i.a().B7(w.a(str)).I5(io.reactivex.schedulers.b.d()).a4(io.reactivex.android.schedulers.a.c()).J5(new d()));
    }

    private final void c2(String str) {
        if (PatchProxy.proxy(new Object[]{str}, this, changeQuickRedirect, false, 25177, new Class[]{String.class}, Void.TYPE).isSupported) {
            return;
        }
        V((io.reactivex.disposables.b) i.a().p3(w.a(str)).I5(io.reactivex.schedulers.b.d()).a4(io.reactivex.android.schedulers.a.c()).J5(new e()));
    }

    @Override // com.max.hbcommon.base.BaseActivity
    public void k1() {
        if (PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 25172, new Class[0], Void.TYPE).isSupported) {
            return;
        }
        x0 x0VarC = x0.c(this.f66602c);
        f0.o(x0VarC, "inflate(mInflater)");
        this.L = x0VarC;
        x0 x0Var = null;
        if (x0VarC == null) {
            f0.S("mBinding");
            x0VarC = null;
        }
        setContentView(x0VarC.b());
        this.M = getIntent().getIntExtra(Q, 0);
        Y1();
        Z1();
        x0 x0Var2 = this.L;
        if (x0Var2 == null) {
            f0.S("mBinding");
        } else {
            x0Var = x0Var2;
        }
        com.max.xiaoheihe.utils.d.C1(this, x0Var.f117330e);
    }

    @Override // androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, android.app.Activity
    @k(message = "")
    public void onActivityResult(int i10, int i11, @dl.e Intent intent) {
        super.onActivityResult(i10, i11, intent);
        if (i11 == -1 && i10 == R) {
            Activity mContext = this.f66601b;
            a aVar = O;
            f0.o(mContext, "mContext");
            mContext.startActivity(aVar.b(mContext));
            finish();
        }
    }
}
