package com.max.xiaoheihe.module.account.paysetting;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.view.View;
import android.widget.CompoundButton;
import androidx.compose.runtime.internal.o;
import com.max.hbcommon.base.BaseActivity;
import com.max.hbcommon.utils.d;
import com.max.hbutils.bean.Result;
import com.max.xiaoheihe.bean.account.PayPwdConfigObj;
import com.max.xiaoheihe.network.i;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.PatchProxyResult;
import df.q0;
import dl.e;
import kotlin.b2;
import kotlin.jvm.internal.f0;
import kotlin.jvm.internal.u;
import kotlin.k;
import xh.m;

/* JADX INFO: compiled from: HBalancePaySettingActivity.kt */
/* JADX INFO: loaded from: classes9.dex */
@o(parameters = 0)
public final class HBalancePaySettingActivity extends BaseActivity {

    @dl.d
    public static final a O = new a(null);
    public static final int P = 8;
    private static final int Q = 8;
    private static final int R = 9;
    private static final int S = 10;
    public static ChangeQuickRedirect changeQuickRedirect;
    private q0 L;
    private boolean M;
    private boolean N;

    /* JADX INFO: compiled from: HBalancePaySettingActivity.kt */
    public static final class a {
        public static ChangeQuickRedirect changeQuickRedirect;

        private a() {
        }

        public /* synthetic */ a(u uVar) {
            this();
        }

        @dl.d
        @m
        public final Intent a(@dl.d Context context) {
            PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{context}, this, changeQuickRedirect, false, 25138, new Class[]{Context.class}, Intent.class);
            if (patchProxyResultProxy.isSupported) {
                return (Intent) patchProxyResultProxy.result;
            }
            f0.p(context, "context");
            return new Intent(context, (Class<?>) HBalancePaySettingActivity.class);
        }

        public final int b() {
            PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 25136, new Class[0], Integer.TYPE);
            return patchProxyResultProxy.isSupported ? ((Integer) patchProxyResultProxy.result).intValue() : HBalancePaySettingActivity.R;
        }

        public final int c() {
            PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 25135, new Class[0], Integer.TYPE);
            return patchProxyResultProxy.isSupported ? ((Integer) patchProxyResultProxy.result).intValue() : HBalancePaySettingActivity.Q;
        }

        public final int d() {
            PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 25137, new Class[0], Integer.TYPE);
            return patchProxyResultProxy.isSupported ? ((Integer) patchProxyResultProxy.result).intValue() : HBalancePaySettingActivity.S;
        }
    }

    /* JADX INFO: compiled from: HBalancePaySettingActivity.kt */
    public static final class b extends com.max.hbcommon.network.d<Result<PayPwdConfigObj>> {
        public static ChangeQuickRedirect changeQuickRedirect;

        b() {
        }

        @Override // com.max.hbcommon.network.d, io.reactivex.g0
        public void onError(@dl.d Throwable e10) {
            if (PatchProxy.proxy(new Object[]{e10}, this, changeQuickRedirect, false, 25139, new Class[]{Throwable.class}, Void.TYPE).isSupported) {
                return;
            }
            f0.p(e10, "e");
            if (HBalancePaySettingActivity.this.isActive()) {
                super.onError(e10);
                HBalancePaySettingActivity.b2(HBalancePaySettingActivity.this);
            }
        }

        public void onNext(@dl.d Result<PayPwdConfigObj> result) {
            if (PatchProxy.proxy(new Object[]{result}, this, changeQuickRedirect, false, 25140, new Class[]{Result.class}, Void.TYPE).isSupported) {
                return;
            }
            f0.p(result, "result");
            if (HBalancePaySettingActivity.this.isActive()) {
                HBalancePaySettingActivity.a2(HBalancePaySettingActivity.this);
                HBalancePaySettingActivity.this.N = result.getResult().getPay_without_pwd();
                HBalancePaySettingActivity.this.M = result.getResult().getSet_pay_password();
                q0 q0Var = HBalancePaySettingActivity.this.L;
                q0 q0Var2 = null;
                if (q0Var == null) {
                    f0.S("mBinding");
                    q0Var = null;
                }
                q0Var.f114642c.setTitleDesc(result.getResult().getRestriction_tip());
                if (HBalancePaySettingActivity.this.M) {
                    q0 q0Var3 = HBalancePaySettingActivity.this.L;
                    if (q0Var3 == null) {
                        f0.S("mBinding");
                    } else {
                        q0Var2 = q0Var3;
                    }
                    q0Var2.f114641b.setTitle("修改支付密码");
                } else {
                    q0 q0Var4 = HBalancePaySettingActivity.this.L;
                    if (q0Var4 == null) {
                        f0.S("mBinding");
                    } else {
                        q0Var2 = q0Var4;
                    }
                    q0Var2.f114641b.setTitle("设置支付密码");
                }
                HBalancePaySettingActivity.X1(HBalancePaySettingActivity.this);
            }
        }

        @Override // com.max.hbcommon.network.d, io.reactivex.g0
        public /* bridge */ /* synthetic */ void onNext(Object obj) {
            if (PatchProxy.proxy(new Object[]{obj}, this, changeQuickRedirect, false, 25141, new Class[]{Object.class}, Void.TYPE).isSupported) {
                return;
            }
            onNext((Result<PayPwdConfigObj>) obj);
        }
    }

    /* JADX INFO: compiled from: HBalancePaySettingActivity.kt */
    public static final class c implements View.OnClickListener {
        public static ChangeQuickRedirect changeQuickRedirect;

        c() {
        }

        @Override // android.view.View.OnClickListener
        public final void onClick(View view) {
            if (PatchProxy.proxy(new Object[]{view}, this, changeQuickRedirect, false, 25149, new Class[]{View.class}, Void.TYPE).isSupported) {
                return;
            }
            if (!HBalancePaySettingActivity.this.M) {
                HBalancePaySettingActivity.W1(HBalancePaySettingActivity.this);
                return;
            }
            Activity activity = ((BaseActivity) HBalancePaySettingActivity.this).f66601b;
            InputPayPwdActivity.a aVar = InputPayPwdActivity.O;
            Activity mContext = ((BaseActivity) HBalancePaySettingActivity.this).f66601b;
            f0.o(mContext, "mContext");
            activity.startActivityForResult(aVar.e(mContext), HBalancePaySettingActivity.O.b());
        }
    }

    /* JADX INFO: compiled from: HBalancePaySettingActivity.kt */
    public static final class d extends com.max.hbcommon.network.d<Result<Object>> {
        public static ChangeQuickRedirect changeQuickRedirect;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ boolean f79131c;

        d(boolean z10) {
            this.f79131c = z10;
        }

        @Override // com.max.hbcommon.network.d, io.reactivex.g0
        public void onError(@dl.d Throwable e10) {
            if (PatchProxy.proxy(new Object[]{e10}, this, changeQuickRedirect, false, 25150, new Class[]{Throwable.class}, Void.TYPE).isSupported) {
                return;
            }
            f0.p(e10, "e");
            if (HBalancePaySettingActivity.this.isActive()) {
                super.onError(e10);
                HBalancePaySettingActivity.X1(HBalancePaySettingActivity.this);
            }
        }

        public void onNext(@dl.d Result<Object> result) {
            if (PatchProxy.proxy(new Object[]{result}, this, changeQuickRedirect, false, 25151, new Class[]{Result.class}, Void.TYPE).isSupported) {
                return;
            }
            f0.p(result, "result");
            if (HBalancePaySettingActivity.this.isActive()) {
                HBalancePaySettingActivity.this.N = this.f79131c;
                HBalancePaySettingActivity.X1(HBalancePaySettingActivity.this);
                if (HBalancePaySettingActivity.this.N) {
                    com.max.hbutils.utils.c.f("开启成功");
                } else {
                    com.max.hbutils.utils.c.f("已暂停使用");
                }
            }
        }

        @Override // com.max.hbcommon.network.d, io.reactivex.g0
        public /* bridge */ /* synthetic */ void onNext(Object obj) {
            if (PatchProxy.proxy(new Object[]{obj}, this, changeQuickRedirect, false, 25152, new Class[]{Object.class}, Void.TYPE).isSupported) {
                return;
            }
            onNext((Result<Object>) obj);
        }
    }

    public static final /* synthetic */ void W1(HBalancePaySettingActivity hBalancePaySettingActivity) {
        if (PatchProxy.proxy(new Object[]{hBalancePaySettingActivity}, null, changeQuickRedirect, true, 25132, new Class[]{HBalancePaySettingActivity.class}, Void.TYPE).isSupported) {
            return;
        }
        hBalancePaySettingActivity.h2();
    }

    public static final /* synthetic */ void X1(HBalancePaySettingActivity hBalancePaySettingActivity) {
        if (PatchProxy.proxy(new Object[]{hBalancePaySettingActivity}, null, changeQuickRedirect, true, 25131, new Class[]{HBalancePaySettingActivity.class}, Void.TYPE).isSupported) {
            return;
        }
        hBalancePaySettingActivity.i2();
    }

    public static final /* synthetic */ void a2(HBalancePaySettingActivity hBalancePaySettingActivity) {
        if (PatchProxy.proxy(new Object[]{hBalancePaySettingActivity}, null, changeQuickRedirect, true, 25134, new Class[]{HBalancePaySettingActivity.class}, Void.TYPE).isSupported) {
            return;
        }
        hBalancePaySettingActivity.x1();
    }

    public static final /* synthetic */ void b2(HBalancePaySettingActivity hBalancePaySettingActivity) {
        if (PatchProxy.proxy(new Object[]{hBalancePaySettingActivity}, null, changeQuickRedirect, true, 25133, new Class[]{HBalancePaySettingActivity.class}, Void.TYPE).isSupported) {
            return;
        }
        hBalancePaySettingActivity.C1();
    }

    public static final /* synthetic */ void c2(HBalancePaySettingActivity hBalancePaySettingActivity, boolean z10) {
        if (PatchProxy.proxy(new Object[]{hBalancePaySettingActivity, new Byte(z10 ? (byte) 1 : (byte) 0)}, null, changeQuickRedirect, true, 25130, new Class[]{HBalancePaySettingActivity.class, Boolean.TYPE}, Void.TYPE).isSupported) {
            return;
        }
        hBalancePaySettingActivity.j2(z10);
    }

    private final void e2() {
        if (PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 25124, new Class[0], Void.TYPE).isSupported) {
            return;
        }
        V((io.reactivex.disposables.b) i.a().Q5().I5(io.reactivex.schedulers.b.d()).a4(io.reactivex.android.schedulers.a.c()).J5(new b()));
    }

    @dl.d
    @m
    public static final Intent f2(@dl.d Context context) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{context}, null, changeQuickRedirect, true, 25129, new Class[]{Context.class}, Intent.class);
        return patchProxyResultProxy.isSupported ? (Intent) patchProxyResultProxy.result : O.a(context);
    }

    private final void h2() {
        if (PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 25128, new Class[0], Void.TYPE).isSupported) {
            return;
        }
        Activity mContext = this.f66601b;
        InputPayPwdActivity.a aVar = InputPayPwdActivity.O;
        f0.o(mContext, "mContext");
        mContext.startActivityForResult(aVar.d(mContext), S);
    }

    private final void i2() {
        if (PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 25127, new Class[0], Void.TYPE).isSupported) {
            return;
        }
        q0 q0Var = this.L;
        if (q0Var == null) {
            f0.S("mBinding");
            q0Var = null;
        }
        q0Var.f114642c.setChecked(this.N, false);
    }

    private final void j2(boolean z10) {
        if (PatchProxy.proxy(new Object[]{new Byte(z10 ? (byte) 1 : (byte) 0)}, this, changeQuickRedirect, false, 25126, new Class[]{Boolean.TYPE}, Void.TYPE).isSupported) {
            return;
        }
        V((io.reactivex.disposables.b) i.a().p2(z10 ? "open" : "close").I5(io.reactivex.schedulers.b.d()).a4(io.reactivex.android.schedulers.a.c()).J5(new d(z10)));
    }

    @Override // com.max.hbcommon.base.BaseActivity
    public void k1() {
        if (PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 25121, new Class[0], Void.TYPE).isSupported) {
            return;
        }
        q0 q0VarC = q0.c(this.f66602c);
        f0.o(q0VarC, "inflate(mInflater)");
        this.L = q0VarC;
        if (q0VarC == null) {
            f0.S("mBinding");
            q0VarC = null;
        }
        setContentView(q0VarC.b());
        this.f66616q.setTitle("黑盒余额便捷支付");
        this.f66617r.setVisibility(0);
        E1();
    }

    @Override // com.max.hbcommon.base.BaseActivity
    public void n1() {
        if (PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 25125, new Class[0], Void.TYPE).isSupported) {
            return;
        }
        e2();
    }

    @Override // androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, android.app.Activity
    @k(message = "")
    public void onActivityResult(int i10, int i11, @e Intent intent) {
        super.onActivityResult(i10, i11, intent);
        if (i11 == -1) {
            if (i10 == Q) {
                com.max.xiaoheihe.module.account.paysetting.a aVar = com.max.xiaoheihe.module.account.paysetting.a.f79140a;
                Activity mContext = this.f66601b;
                f0.o(mContext, "mContext");
                aVar.e(mContext, new yh.a<b2>() { // from class: com.max.xiaoheihe.module.account.paysetting.HBalancePaySettingActivity.onActivityResult.1
                    public static ChangeQuickRedirect changeQuickRedirect;

                    {
                        super(0);
                    }

                    /* JADX WARN: Type inference failed for: r0v3, types: [java.lang.Object, kotlin.b2] */
                    @Override // yh.a
                    public /* bridge */ /* synthetic */ b2 invoke() {
                        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 25143, new Class[0], Object.class);
                        if (patchProxyResultProxy.isSupported) {
                            return patchProxyResultProxy.result;
                        }
                        invoke2();
                        return b2.f124493a;
                    }

                    /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
                    public final void invoke2() {
                        if (PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 25142, new Class[0], Void.TYPE).isSupported) {
                            return;
                        }
                        HBalancePaySettingActivity.c2(HBalancePaySettingActivity.this, true);
                    }
                });
                return;
            }
            if (i10 != R) {
                if (i10 == S) {
                    this.M = true;
                }
            } else {
                Activity mContext2 = this.f66601b;
                InputPayPwdActivity.a aVar2 = InputPayPwdActivity.O;
                f0.o(mContext2, "mContext");
                mContext2.startActivity(aVar2.b(mContext2));
            }
        }
    }

    @Override // com.max.hbcommon.base.BaseActivity, androidx.fragment.app.FragmentActivity, android.app.Activity
    public void onResume() {
        if (PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 25122, new Class[0], Void.TYPE).isSupported) {
            return;
        }
        super.onResume();
        e2();
    }

    @Override // com.max.hbcommon.base.BaseActivity
    public void q1() {
        if (PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 25123, new Class[0], Void.TYPE).isSupported) {
            return;
        }
        q0 q0Var = this.L;
        q0 q0Var2 = null;
        if (q0Var == null) {
            f0.S("mBinding");
            q0Var = null;
        }
        q0Var.f114642c.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() { // from class: com.max.xiaoheihe.module.account.paysetting.HBalancePaySettingActivity$registerEvents$1
            public static ChangeQuickRedirect changeQuickRedirect;

            @Override // android.widget.CompoundButton.OnCheckedChangeListener
            public final void onCheckedChanged(CompoundButton compoundButton, boolean z10) {
                if (PatchProxy.proxy(new Object[]{compoundButton, new Byte(z10 ? (byte) 1 : (byte) 0)}, this, changeQuickRedirect, false, 25144, new Class[]{CompoundButton.class, Boolean.TYPE}, Void.TYPE).isSupported) {
                    return;
                }
                if (!z10) {
                    a aVar = a.f79140a;
                    Activity mContext = ((BaseActivity) this.f79133b).f66601b;
                    f0.o(mContext, "mContext");
                    final HBalancePaySettingActivity hBalancePaySettingActivity = this.f79133b;
                    yh.a<b2> aVar2 = new yh.a<b2>() { // from class: com.max.xiaoheihe.module.account.paysetting.HBalancePaySettingActivity$registerEvents$1.1
                        public static ChangeQuickRedirect changeQuickRedirect;

                        {
                            super(0);
                        }

                        /* JADX WARN: Type inference failed for: r0v3, types: [java.lang.Object, kotlin.b2] */
                        @Override // yh.a
                        public /* bridge */ /* synthetic */ b2 invoke() {
                            PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 25146, new Class[0], Object.class);
                            if (patchProxyResultProxy.isSupported) {
                                return patchProxyResultProxy.result;
                            }
                            invoke2();
                            return b2.f124493a;
                        }

                        /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
                        public final void invoke2() {
                            if (PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 25145, new Class[0], Void.TYPE).isSupported) {
                                return;
                            }
                            HBalancePaySettingActivity.c2(hBalancePaySettingActivity, false);
                        }
                    };
                    final HBalancePaySettingActivity hBalancePaySettingActivity2 = this.f79133b;
                    aVar.d(mContext, aVar2, new yh.a<b2>() { // from class: com.max.xiaoheihe.module.account.paysetting.HBalancePaySettingActivity$registerEvents$1.2
                        public static ChangeQuickRedirect changeQuickRedirect;

                        {
                            super(0);
                        }

                        /* JADX WARN: Type inference failed for: r0v3, types: [java.lang.Object, kotlin.b2] */
                        @Override // yh.a
                        public /* bridge */ /* synthetic */ b2 invoke() {
                            PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 25148, new Class[0], Object.class);
                            if (patchProxyResultProxy.isSupported) {
                                return patchProxyResultProxy.result;
                            }
                            invoke2();
                            return b2.f124493a;
                        }

                        /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
                        public final void invoke2() {
                            if (PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 25147, new Class[0], Void.TYPE).isSupported) {
                                return;
                            }
                            HBalancePaySettingActivity.X1(hBalancePaySettingActivity2);
                        }
                    });
                } else if (this.f79133b.M) {
                    Activity activity = ((BaseActivity) this.f79133b).f66601b;
                    InputPayPwdActivity.a aVar3 = InputPayPwdActivity.O;
                    Activity mContext2 = ((BaseActivity) this.f79133b).f66601b;
                    f0.o(mContext2, "mContext");
                    activity.startActivityForResult(aVar3.e(mContext2), HBalancePaySettingActivity.O.c());
                    HBalancePaySettingActivity.X1(this.f79133b);
                } else {
                    HBalancePaySettingActivity.c2(this.f79133b, true);
                }
                d.b("HBalancePaySettingActivity", " checked ==" + z10);
            }
        });
        q0 q0Var3 = this.L;
        if (q0Var3 == null) {
            f0.S("mBinding");
        } else {
            q0Var2 = q0Var3;
        }
        q0Var2.f114641b.setOnClickListener(new c());
    }
}
