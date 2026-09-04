package com.max.hbwallet;

import android.annotation.SuppressLint;
import android.app.Activity;
import android.app.ProgressDialog;
import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;
import android.text.Editable;
import android.text.SpannableString;
import android.text.TextWatcher;
import android.text.method.LinkMovementMethod;
import android.view.KeyEvent;
import android.view.View;
import android.view.ViewGroup;
import android.widget.EditText;
import android.widget.TextView;
import com.max.hbcommon.base.BaseActivity;
import com.max.hbcommon.bean.KeyDescObj;
import com.max.hbpay.PaymentManager;
import com.max.hbutils.bean.Result;
import com.max.hbwallet.bean.VerifyStateObj;
import com.max.hbwallet.bean.WithdrawHomeResult;
import com.max.hbwallet.bean.WithdrawResult;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.PatchProxyResult;
import java.util.concurrent.TimeUnit;
import kotlin.jvm.internal.Ref;
import kotlin.text.StringsKt__StringsKt;

/* JADX INFO: compiled from: AliWithdrawActivity.kt */
/* JADX INFO: loaded from: classes2.dex */
public final class AliWithdrawActivity extends BaseActivity {

    @dl.d
    public static final a Y = new a(null);
    public static ChangeQuickRedirect changeQuickRedirect;

    @dl.e
    private WithdrawHomeResult L;
    private TextView M;
    private TextView N;
    private TextView O;
    private TextView P;
    private TextView Q;
    private TextView R;
    private TextView S;
    private EditText T;

    @dl.e
    private String U;
    private boolean V;

    @dl.e
    private ProgressDialog W;

    @dl.e
    private com.max.hbcommon.component.i X;

    /* JADX INFO: compiled from: AliWithdrawActivity.kt */
    public static final class a {
        public static ChangeQuickRedirect changeQuickRedirect;

        private a() {
        }

        public /* synthetic */ a(kotlin.jvm.internal.u uVar) {
            this();
        }

        @dl.d
        public final Intent a(@dl.d Context context) {
            PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{context}, this, changeQuickRedirect, false, bb.c.k.Xy, new Class[]{Context.class}, Intent.class);
            if (patchProxyResultProxy.isSupported) {
                return (Intent) patchProxyResultProxy.result;
            }
            kotlin.jvm.internal.f0.p(context, "context");
            return new Intent(context, (Class<?>) AliWithdrawActivity.class);
        }
    }

    /* JADX INFO: compiled from: AliWithdrawActivity.kt */
    public static final class b extends com.max.hbcommon.network.d<Result<WithdrawResult>> {
        public static ChangeQuickRedirect changeQuickRedirect;

        b() {
        }

        @Override // com.max.hbcommon.network.d, io.reactivex.g0
        public void onError(@dl.d Throwable e10) {
            if (PatchProxy.proxy(new Object[]{e10}, this, changeQuickRedirect, false, bb.c.k.Yy, new Class[]{Throwable.class}, Void.TYPE).isSupported) {
                return;
            }
            kotlin.jvm.internal.f0.p(e10, "e");
            if (AliWithdrawActivity.this.isActive()) {
                super.onError(e10);
            }
        }

        public void onNext(@dl.d Result<WithdrawResult> result) {
            boolean z10 = true;
            if (PatchProxy.proxy(new Object[]{result}, this, changeQuickRedirect, false, bb.c.k.Zy, new Class[]{Result.class}, Void.TYPE).isSupported) {
                return;
            }
            kotlin.jvm.internal.f0.p(result, "result");
            if (AliWithdrawActivity.this.isActive()) {
                if (kotlin.jvm.internal.f0.g(result.getResult().getSuccess(), "1")) {
                    AliWithdrawActivity aliWithdrawActivity = AliWithdrawActivity.this;
                    String success_msg = result.getResult().getSuccess_msg();
                    kotlin.jvm.internal.f0.m(success_msg);
                    AliWithdrawActivity.r2(aliWithdrawActivity, success_msg);
                    return;
                }
                if (kotlin.jvm.internal.f0.g(result.getResult().getNeed_certify(), "1")) {
                    ob.a.o().j(null);
                    return;
                }
                if (kotlin.jvm.internal.f0.g(result.getResult().getNeed_query(), "1")) {
                    AliWithdrawActivity.this.U = result.getResult().getCertify_id();
                    AliWithdrawActivity.E2(AliWithdrawActivity.this, 0, 1, null);
                    return;
                }
                String error_msg = result.getResult().getError_msg();
                if (error_msg != null && error_msg.length() != 0) {
                    z10 = false;
                }
                if (z10) {
                    return;
                }
                AliWithdrawActivity aliWithdrawActivity2 = AliWithdrawActivity.this;
                String error_msg2 = result.getResult().getError_msg();
                kotlin.jvm.internal.f0.m(error_msg2);
                AliWithdrawActivity.q2(aliWithdrawActivity2, error_msg2);
            }
        }

        @Override // com.max.hbcommon.network.d, io.reactivex.g0
        public /* bridge */ /* synthetic */ void onNext(Object obj) {
            if (PatchProxy.proxy(new Object[]{obj}, this, changeQuickRedirect, false, bb.c.k.az, new Class[]{Object.class}, Void.TYPE).isSupported) {
                return;
            }
            onNext((Result<WithdrawResult>) obj);
        }
    }

    /* JADX INFO: compiled from: AliWithdrawActivity.kt */
    public static final class c extends com.max.hbcommon.network.d<Result<Object>> {
        public static ChangeQuickRedirect changeQuickRedirect;

        c() {
        }

        @Override // com.max.hbcommon.network.d, io.reactivex.g0
        public void onComplete() {
            if (!PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, bb.c.k.bz, new Class[0], Void.TYPE).isSupported && AliWithdrawActivity.this.isActive()) {
                super.onComplete();
            }
        }

        @Override // com.max.hbcommon.network.d, io.reactivex.g0
        public void onError(@dl.d Throwable e10) {
            if (PatchProxy.proxy(new Object[]{e10}, this, changeQuickRedirect, false, bb.c.k.cz, new Class[]{Throwable.class}, Void.TYPE).isSupported) {
                return;
            }
            kotlin.jvm.internal.f0.p(e10, "e");
            if (AliWithdrawActivity.this.isActive()) {
                super.onError(e10);
            }
        }

        public void onNext(@dl.d Result<Object> result) {
            if (PatchProxy.proxy(new Object[]{result}, this, changeQuickRedirect, false, bb.c.k.dz, new Class[]{Result.class}, Void.TYPE).isSupported) {
                return;
            }
            kotlin.jvm.internal.f0.p(result, "result");
            if (AliWithdrawActivity.this.isActive()) {
                super.onNext(result);
                AliWithdrawActivity.this.x2();
            }
        }

        @Override // com.max.hbcommon.network.d, io.reactivex.g0
        public /* bridge */ /* synthetic */ void onNext(Object obj) {
            if (PatchProxy.proxy(new Object[]{obj}, this, changeQuickRedirect, false, bb.c.k.ez, new Class[]{Object.class}, Void.TYPE).isSupported) {
                return;
            }
            onNext((Result<Object>) obj);
        }
    }

    /* JADX INFO: compiled from: AliWithdrawActivity.kt */
    public static final class d extends com.max.hbcommon.network.d<Result<WithdrawHomeResult>> {
        public static ChangeQuickRedirect changeQuickRedirect;

        d() {
        }

        @Override // com.max.hbcommon.network.d, io.reactivex.g0
        public void onComplete() {
            if (!PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, bb.c.k.fz, new Class[0], Void.TYPE).isSupported && AliWithdrawActivity.this.isActive()) {
                super.onComplete();
            }
        }

        @Override // com.max.hbcommon.network.d, io.reactivex.g0
        public void onError(@dl.d Throwable e10) {
            if (PatchProxy.proxy(new Object[]{e10}, this, changeQuickRedirect, false, bb.c.k.gz, new Class[]{Throwable.class}, Void.TYPE).isSupported) {
                return;
            }
            kotlin.jvm.internal.f0.p(e10, "e");
            if (AliWithdrawActivity.this.isActive()) {
                super.onError(e10);
                AliWithdrawActivity.o2(AliWithdrawActivity.this);
            }
        }

        public void onNext(@dl.d Result<WithdrawHomeResult> result) {
            if (PatchProxy.proxy(new Object[]{result}, this, changeQuickRedirect, false, bb.c.k.hz, new Class[]{Result.class}, Void.TYPE).isSupported) {
                return;
            }
            kotlin.jvm.internal.f0.p(result, "result");
            if (AliWithdrawActivity.this.isActive()) {
                super.onNext(result);
                AliWithdrawActivity.this.L = result.getResult();
                AliWithdrawActivity.n2(AliWithdrawActivity.this);
            }
        }

        @Override // com.max.hbcommon.network.d, io.reactivex.g0
        public /* bridge */ /* synthetic */ void onNext(Object obj) {
            if (PatchProxy.proxy(new Object[]{obj}, this, changeQuickRedirect, false, bb.c.k.iz, new Class[]{Object.class}, Void.TYPE).isSupported) {
                return;
            }
            onNext((Result<WithdrawHomeResult>) obj);
        }
    }

    /* JADX INFO: compiled from: AliWithdrawActivity.kt */
    public static final class e implements TextWatcher {
        public static ChangeQuickRedirect changeQuickRedirect;

        e() {
        }

        @Override // android.text.TextWatcher
        public void afterTextChanged(@dl.e Editable editable) {
            if (PatchProxy.proxy(new Object[]{editable}, this, changeQuickRedirect, false, bb.c.k.jz, new Class[]{Editable.class}, Void.TYPE).isSupported || editable == null) {
                return;
            }
            AliWithdrawActivity aliWithdrawActivity = AliWithdrawActivity.this;
            if (editable.length() > 1) {
                EditText editText = null;
                if (!StringsKt__StringsKt.g5(editable, "0", false, 2, null) || StringsKt__StringsKt.g5(editable, "0.", false, 2, null)) {
                    if (StringsKt__StringsKt.g5(editable, ".", false, 2, null)) {
                        EditText editText2 = aliWithdrawActivity.T;
                        if (editText2 == null) {
                            kotlin.jvm.internal.f0.S("et_withdraw");
                        } else {
                            editText = editText2;
                        }
                        StringBuilder sb2 = new StringBuilder();
                        sb2.append('0');
                        sb2.append((Object) editable);
                        editText.setText(sb2.toString());
                        return;
                    }
                    return;
                }
                EditText editText3 = aliWithdrawActivity.T;
                if (editText3 == null) {
                    kotlin.jvm.internal.f0.S("et_withdraw");
                    editText3 = null;
                }
                editText3.setText(editable.subSequence(1, editable.length()));
                if (editable.length() == 2) {
                    EditText editText4 = aliWithdrawActivity.T;
                    if (editText4 == null) {
                        kotlin.jvm.internal.f0.S("et_withdraw");
                    } else {
                        editText = editText4;
                    }
                    editText.setSelection(1);
                }
            }
        }

        @Override // android.text.TextWatcher
        public void beforeTextChanged(@dl.e CharSequence charSequence, int i10, int i11, int i12) {
        }

        @Override // android.text.TextWatcher
        public void onTextChanged(@dl.e CharSequence charSequence, int i10, int i11, int i12) {
        }
    }

    /* JADX INFO: compiled from: AliWithdrawActivity.kt */
    public static final class f extends com.max.hbcustomview.spans.d {
        public static ChangeQuickRedirect changeQuickRedirect;

        f(int i10) {
            super(i10);
        }

        @Override // android.text.style.ClickableSpan
        public void onClick(@dl.d View view) {
            if (PatchProxy.proxy(new Object[]{view}, this, changeQuickRedirect, false, bb.c.k.kz, new Class[]{View.class}, Void.TYPE).isSupported) {
                return;
            }
            kotlin.jvm.internal.f0.p(view, "view");
            pb.p pVarP = ob.a.p();
            Activity activity = ((BaseActivity) AliWithdrawActivity.this).f66601b;
            kotlin.jvm.internal.f0.o(activity, "access$getMContext$p$s1758151127(...)");
            String str = ob.a.b().k() + "提现服务协议";
            String MALL_WITHDRAW_FAQ = lb.a.F3;
            kotlin.jvm.internal.f0.o(MALL_WITHDRAW_FAQ, "MALL_WITHDRAW_FAQ");
            pVarP.a(activity, str, MALL_WITHDRAW_FAQ);
        }
    }

    /* JADX INFO: compiled from: AliWithdrawActivity.kt */
    public static final class g extends com.max.hbcommon.network.d<Result<VerifyStateObj>> {
        public static ChangeQuickRedirect changeQuickRedirect;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ int f73853c;

        g(int i10) {
            this.f73853c = i10;
        }

        @Override // com.max.hbcommon.network.d, io.reactivex.g0
        public void onError(@dl.d Throwable e10) {
            if (PatchProxy.proxy(new Object[]{e10}, this, changeQuickRedirect, false, bb.c.k.lz, new Class[]{Throwable.class}, Void.TYPE).isSupported) {
                return;
            }
            kotlin.jvm.internal.f0.p(e10, "e");
            if (AliWithdrawActivity.this.isActive()) {
                AliWithdrawActivity.i2(AliWithdrawActivity.this);
                super.onError(e10);
            }
        }

        public void onNext(@dl.d Result<VerifyStateObj> result) {
            if (PatchProxy.proxy(new Object[]{result}, this, changeQuickRedirect, false, bb.c.k.mz, new Class[]{Result.class}, Void.TYPE).isSupported) {
                return;
            }
            kotlin.jvm.internal.f0.p(result, "result");
            if (AliWithdrawActivity.this.isActive()) {
                if (kotlin.jvm.internal.f0.g(result.getResult().getState(), "passed")) {
                    com.max.hbutils.utils.c.f("实名认证成功");
                    AliWithdrawActivity.i2(AliWithdrawActivity.this);
                    TextView textView = AliWithdrawActivity.this.S;
                    if (textView == null) {
                        kotlin.jvm.internal.f0.S("tv_confirm");
                        textView = null;
                    }
                    textView.performClick();
                    return;
                }
                if (kotlin.jvm.internal.f0.g(result.getResult().getState(), z5.f.f141859j)) {
                    AliWithdrawActivity.j2(AliWithdrawActivity.this);
                    AliWithdrawActivity.i2(AliWithdrawActivity.this);
                } else {
                    if (!kotlin.jvm.internal.f0.g(result.getResult().getState(), "waiting")) {
                        AliWithdrawActivity.j2(AliWithdrawActivity.this);
                        AliWithdrawActivity.i2(AliWithdrawActivity.this);
                        return;
                    }
                    int i10 = this.f73853c;
                    if (i10 < 5) {
                        AliWithdrawActivity.k2(AliWithdrawActivity.this, i10 + 1);
                    } else {
                        AliWithdrawActivity.j2(AliWithdrawActivity.this);
                        AliWithdrawActivity.i2(AliWithdrawActivity.this);
                    }
                }
            }
        }

        @Override // com.max.hbcommon.network.d, io.reactivex.g0
        public /* bridge */ /* synthetic */ void onNext(Object obj) {
            if (PatchProxy.proxy(new Object[]{obj}, this, changeQuickRedirect, false, bb.c.k.nz, new Class[]{Object.class}, Void.TYPE).isSupported) {
                return;
            }
            onNext((Result<VerifyStateObj>) obj);
        }
    }

    /* JADX INFO: compiled from: AliWithdrawActivity.kt */
    public static final class h extends com.max.hbcommon.network.d<Result<KeyDescObj>> {
        public static ChangeQuickRedirect changeQuickRedirect;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ String f73855c;

        h(String str) {
            this.f73855c = str;
        }

        @Override // com.max.hbcommon.network.d, io.reactivex.g0
        public void onError(@dl.d Throwable e10) {
            if (PatchProxy.proxy(new Object[]{e10}, this, changeQuickRedirect, false, bb.c.k.oz, new Class[]{Throwable.class}, Void.TYPE).isSupported) {
                return;
            }
            kotlin.jvm.internal.f0.p(e10, "e");
            if (AliWithdrawActivity.this.isActive()) {
                super.onError(e10);
            }
        }

        public void onNext(@dl.d Result<KeyDescObj> result) {
            if (PatchProxy.proxy(new Object[]{result}, this, changeQuickRedirect, false, bb.c.k.pz, new Class[]{Result.class}, Void.TYPE).isSupported) {
                return;
            }
            kotlin.jvm.internal.f0.p(result, "result");
            if (AliWithdrawActivity.this.isActive()) {
                AliWithdrawActivity aliWithdrawActivity = AliWithdrawActivity.this;
                KeyDescObj result2 = result.getResult();
                kotlin.jvm.internal.f0.o(result2, "getResult(...)");
                AliWithdrawActivity.p2(aliWithdrawActivity, result2, this.f73855c);
            }
        }

        @Override // com.max.hbcommon.network.d, io.reactivex.g0
        public /* bridge */ /* synthetic */ void onNext(Object obj) {
            if (PatchProxy.proxy(new Object[]{obj}, this, changeQuickRedirect, false, bb.c.k.qz, new Class[]{Object.class}, Void.TYPE).isSupported) {
                return;
            }
            onNext((Result<KeyDescObj>) obj);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void A2(AliWithdrawActivity this$0, View view) {
        if (PatchProxy.proxy(new Object[]{this$0, view}, null, changeQuickRedirect, true, bb.c.k.By, new Class[]{AliWithdrawActivity.class, View.class}, Void.TYPE).isSupported) {
            return;
        }
        kotlin.jvm.internal.f0.p(this$0, "this$0");
        Activity mContext = this$0.f66601b;
        ProfitWithdrawRecordActivity.a aVar = ProfitWithdrawRecordActivity.L;
        kotlin.jvm.internal.f0.o(mContext, "mContext");
        mContext.startActivity(aVar.a(mContext));
    }

    private final void B2() {
        if (PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, bb.c.k.Ay, new Class[0], Void.TYPE).isSupported) {
            return;
        }
        com.max.hbcommon.view.a.f fVar = new com.max.hbcommon.view.a.f(this.f66601b);
        fVar.y("实名认证失败,请稍后再试").g(true).u(getString(R.string.confirm), new DialogInterface.OnClickListener() { // from class: com.max.hbwallet.g
            @Override // android.content.DialogInterface.OnClickListener
            public final void onClick(DialogInterface dialogInterface, int i10) {
                AliWithdrawActivity.C2(dialogInterface, i10);
            }
        });
        fVar.F();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void C2(DialogInterface dialogInterface, int i10) {
        if (PatchProxy.proxy(new Object[]{dialogInterface, new Integer(i10)}, null, changeQuickRedirect, true, bb.c.k.Oy, new Class[]{DialogInterface.class, Integer.TYPE}, Void.TYPE).isSupported) {
            return;
        }
        dialogInterface.dismiss();
    }

    private final void D2(int i10) {
        boolean z10 = true;
        if (PatchProxy.proxy(new Object[]{new Integer(i10)}, this, changeQuickRedirect, false, bb.c.k.yy, new Class[]{Integer.TYPE}, Void.TYPE).isSupported) {
            return;
        }
        String str = this.U;
        if (str != null && str.length() != 0) {
            z10 = false;
        }
        if (z10) {
            return;
        }
        long j10 = i10 > 0 ? 2L : 0L;
        showLoadingDialog();
        V((io.reactivex.disposables.b) ce.b.a().d(this.U).C1(j10, TimeUnit.SECONDS).I5(io.reactivex.schedulers.b.d()).a4(io.reactivex.android.schedulers.a.c()).J5(new g(i10)));
    }

    static /* synthetic */ void E2(AliWithdrawActivity aliWithdrawActivity, int i10, int i11, Object obj) {
        Object[] objArr = {aliWithdrawActivity, new Integer(i10), new Integer(i11), obj};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        Class cls = Integer.TYPE;
        if (PatchProxy.proxy(objArr, null, changeQuickRedirect2, true, bb.c.k.zy, new Class[]{AliWithdrawActivity.class, cls, cls, Object.class}, Void.TYPE).isSupported) {
            return;
        }
        if ((i11 & 1) != 0) {
            i10 = 0;
        }
        aliWithdrawActivity.D2(i10);
    }

    private final void G2() {
        if (PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, bb.c.k.ny, new Class[0], Void.TYPE).isSupported) {
            return;
        }
        WithdrawHomeResult withdrawHomeResult = this.L;
        TextView textView = null;
        String alipay_logon_id = withdrawHomeResult != null ? withdrawHomeResult.getAlipay_logon_id() : null;
        if (alipay_logon_id == null || alipay_logon_id.length() == 0) {
            TextView textView2 = this.O;
            if (textView2 == null) {
                kotlin.jvm.internal.f0.S("tv_alipay_logon_id");
                textView2 = null;
            }
            textView2.setVisibility(8);
            TextView textView3 = this.M;
            if (textView3 == null) {
                kotlin.jvm.internal.f0.S("tv_account_action");
                textView3 = null;
            }
            textView3.setTextColor(com.max.hbcommon.utils.l.a(R.color.background_layer_2_color));
            TextView textView4 = this.M;
            if (textView4 == null) {
                kotlin.jvm.internal.f0.S("tv_account_action");
                textView4 = null;
            }
            textView4.setBackgroundResource(R.drawable.text_primary_2dp);
            TextView textView5 = this.M;
            if (textView5 == null) {
                kotlin.jvm.internal.f0.S("tv_account_action");
                textView5 = null;
            }
            textView5.setText("绑定账号");
        } else {
            TextView textView6 = this.O;
            if (textView6 == null) {
                kotlin.jvm.internal.f0.S("tv_alipay_logon_id");
                textView6 = null;
            }
            textView6.setVisibility(0);
            TextView textView7 = this.O;
            if (textView7 == null) {
                kotlin.jvm.internal.f0.S("tv_alipay_logon_id");
                textView7 = null;
            }
            WithdrawHomeResult withdrawHomeResult2 = this.L;
            textView7.setText(withdrawHomeResult2 != null ? withdrawHomeResult2.getAlipay_logon_id() : null);
            TextView textView8 = this.M;
            if (textView8 == null) {
                kotlin.jvm.internal.f0.S("tv_account_action");
                textView8 = null;
            }
            textView8.setTextColor(com.max.hbcommon.utils.l.a(R.color.text_secondary_1_color));
            TextView textView9 = this.M;
            if (textView9 == null) {
                kotlin.jvm.internal.f0.S("tv_account_action");
                textView9 = null;
            }
            textView9.setBackgroundResource(R.drawable.divider_color_concept_2dp);
            TextView textView10 = this.M;
            if (textView10 == null) {
                kotlin.jvm.internal.f0.S("tv_account_action");
                textView10 = null;
            }
            textView10.setText("解除绑定");
        }
        TextView textView11 = this.M;
        if (textView11 == null) {
            kotlin.jvm.internal.f0.S("tv_account_action");
        } else {
            textView = textView11;
        }
        textView.setOnClickListener(new View.OnClickListener() { // from class: com.max.hbwallet.e
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                AliWithdrawActivity.H2(this.f74198b, view);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void H2(final AliWithdrawActivity this$0, View view) {
        boolean z10 = true;
        if (PatchProxy.proxy(new Object[]{this$0, view}, null, changeQuickRedirect, true, bb.c.k.Hy, new Class[]{AliWithdrawActivity.class, View.class}, Void.TYPE).isSupported) {
            return;
        }
        kotlin.jvm.internal.f0.p(this$0, "this$0");
        WithdrawHomeResult withdrawHomeResult = this$0.L;
        String alipay_logon_id = withdrawHomeResult != null ? withdrawHomeResult.getAlipay_logon_id() : null;
        if (alipay_logon_id != null && alipay_logon_id.length() != 0) {
            z10 = false;
        }
        if (z10) {
            this$0.Q2();
        } else {
            new com.max.hbcommon.view.a.f(this$0.f66601b).l("确定解绑此账号？").u("确定", new DialogInterface.OnClickListener() { // from class: com.max.hbwallet.k
                @Override // android.content.DialogInterface.OnClickListener
                public final void onClick(DialogInterface dialogInterface, int i10) {
                    AliWithdrawActivity.I2(this.f74222b, dialogInterface, i10);
                }
            }).o("取消", new DialogInterface.OnClickListener() { // from class: com.max.hbwallet.l
                @Override // android.content.DialogInterface.OnClickListener
                public final void onClick(DialogInterface dialogInterface, int i10) {
                    AliWithdrawActivity.J2(dialogInterface, i10);
                }
            }).g(false).F();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void I2(AliWithdrawActivity this$0, DialogInterface dialogInterface, int i10) {
        if (PatchProxy.proxy(new Object[]{this$0, dialogInterface, new Integer(i10)}, null, changeQuickRedirect, true, bb.c.k.Fy, new Class[]{AliWithdrawActivity.class, DialogInterface.class, Integer.TYPE}, Void.TYPE).isSupported) {
            return;
        }
        kotlin.jvm.internal.f0.p(this$0, "this$0");
        this$0.v2("remove", null, null);
        dialogInterface.dismiss();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void J2(DialogInterface dialogInterface, int i10) {
        if (PatchProxy.proxy(new Object[]{dialogInterface, new Integer(i10)}, null, changeQuickRedirect, true, bb.c.k.Gy, new Class[]{DialogInterface.class, Integer.TYPE}, Void.TYPE).isSupported) {
            return;
        }
        dialogInterface.dismiss();
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v3, types: [T, java.lang.String] */
    private final void K2() {
        Double profit;
        if (PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, bb.c.k.my, new Class[0], Void.TYPE).isSupported) {
            return;
        }
        final Ref.ObjectRef objectRef = new Ref.ObjectRef();
        WithdrawHomeResult withdrawHomeResult = this.L;
        objectRef.f124891b = com.max.hbutils.utils.n.n((withdrawHomeResult == null || (profit = withdrawHomeResult.getProfit()) == null) ? 0 : Float.valueOf((float) (profit.doubleValue() / ((double) 100))));
        TextView textView = this.P;
        TextView textView2 = null;
        if (textView == null) {
            kotlin.jvm.internal.f0.S("tv_info");
            textView = null;
        }
        textView.setText(((String) objectRef.f124891b) + "，可提现" + ((String) objectRef.f124891b) + "元到支付宝");
        EditText editText = this.T;
        if (editText == null) {
            kotlin.jvm.internal.f0.S("et_withdraw");
            editText = null;
        }
        editText.setSingleLine();
        EditText editText2 = this.T;
        if (editText2 == null) {
            kotlin.jvm.internal.f0.S("et_withdraw");
            editText2 = null;
        }
        editText2.setImeOptions(6);
        EditText editText3 = this.T;
        if (editText3 == null) {
            kotlin.jvm.internal.f0.S("et_withdraw");
            editText3 = null;
        }
        editText3.setOnEditorActionListener(new TextView.OnEditorActionListener() { // from class: com.max.hbwallet.n
            @Override // android.widget.TextView.OnEditorActionListener
            public final boolean onEditorAction(TextView textView3, int i10, KeyEvent keyEvent) {
                return AliWithdrawActivity.L2(this.f74235b, textView3, i10, keyEvent);
            }
        });
        TextView textView3 = this.Q;
        if (textView3 == null) {
            kotlin.jvm.internal.f0.S("tv_use_all");
            textView3 = null;
        }
        textView3.setOnClickListener(new View.OnClickListener() { // from class: com.max.hbwallet.b
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                AliWithdrawActivity.O2(objectRef, this, view);
            }
        });
        TextView textView4 = this.S;
        if (textView4 == null) {
            kotlin.jvm.internal.f0.S("tv_confirm");
        } else {
            textView2 = textView4;
        }
        textView2.setOnClickListener(new View.OnClickListener() { // from class: com.max.hbwallet.c
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                AliWithdrawActivity.P2(this.f74166b, view);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean L2(AliWithdrawActivity this$0, TextView textView, int i10, KeyEvent keyEvent) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{this$0, textView, new Integer(i10), keyEvent}, null, changeQuickRedirect, true, bb.c.k.Cy, new Class[]{AliWithdrawActivity.class, TextView.class, Integer.TYPE, KeyEvent.class}, Boolean.TYPE);
        if (patchProxyResultProxy.isSupported) {
            return ((Boolean) patchProxyResultProxy.result).booleanValue();
        }
        kotlin.jvm.internal.f0.p(this$0, "this$0");
        if (i10 == 6) {
            TextView textView2 = this$0.S;
            if (textView2 == null) {
                kotlin.jvm.internal.f0.S("tv_confirm");
                textView2 = null;
            }
            textView2.performClick();
        }
        return false;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Multi-variable type inference failed */
    public static final void O2(Ref.ObjectRef mProftStr, AliWithdrawActivity this$0, View view) {
        if (PatchProxy.proxy(new Object[]{mProftStr, this$0, view}, null, changeQuickRedirect, true, bb.c.k.Dy, new Class[]{Ref.ObjectRef.class, AliWithdrawActivity.class, View.class}, Void.TYPE).isSupported) {
            return;
        }
        kotlin.jvm.internal.f0.p(mProftStr, "$mProftStr");
        kotlin.jvm.internal.f0.p(this$0, "this$0");
        String string = ((String) mProftStr.f124891b).toString();
        EditText editText = this$0.T;
        EditText editText2 = null;
        if (editText == null) {
            kotlin.jvm.internal.f0.S("et_withdraw");
            editText = null;
        }
        editText.setText(string);
        EditText editText3 = this$0.T;
        if (editText3 == null) {
            kotlin.jvm.internal.f0.S("et_withdraw");
            editText3 = null;
        }
        EditText editText4 = this$0.T;
        if (editText4 == null) {
            kotlin.jvm.internal.f0.S("et_withdraw");
        } else {
            editText2 = editText4;
        }
        editText3.setSelection(editText2.getText().length());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void P2(AliWithdrawActivity this$0, View view) {
        if (PatchProxy.proxy(new Object[]{this$0, view}, null, changeQuickRedirect, true, bb.c.k.Ey, new Class[]{AliWithdrawActivity.class, View.class}, Void.TYPE).isSupported) {
            return;
        }
        kotlin.jvm.internal.f0.p(this$0, "this$0");
        WithdrawHomeResult withdrawHomeResult = this$0.L;
        EditText editText = null;
        String alipay_logon_id = withdrawHomeResult != null ? withdrawHomeResult.getAlipay_logon_id() : null;
        if (alipay_logon_id == null || alipay_logon_id.length() == 0) {
            com.max.hbutils.utils.c.f("请先绑定账号！");
            return;
        }
        EditText editText2 = this$0.T;
        if (editText2 == null) {
            kotlin.jvm.internal.f0.S("et_withdraw");
        } else {
            editText = editText2;
        }
        this$0.h3(String.valueOf((int) (com.max.hbutils.utils.n.p(editText.getText().toString()) * 100)));
    }

    /* JADX WARN: Type inference failed for: r4v4, types: [T, android.view.View] */
    /* JADX WARN: Type inference failed for: r5v3, types: [T, android.view.View] */
    private final void Q2() {
        if (PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, bb.c.k.uy, new Class[0], Void.TYPE).isSupported) {
            return;
        }
        com.max.hbcommon.view.a.f fVar = new com.max.hbcommon.view.a.f(this.f66601b);
        View viewInflate = this.f66602c.inflate(R.layout.hbwallet_dialog_aliaccount_edittext, (ViewGroup) null);
        viewInflate.setLayoutParams(new ViewGroup.LayoutParams(-1, -2));
        final Ref.ObjectRef objectRef = new Ref.ObjectRef();
        objectRef.f124891b = viewInflate.findViewById(R.id.et_ali_name);
        final Ref.ObjectRef objectRef2 = new Ref.ObjectRef();
        objectRef2.f124891b = viewInflate.findViewById(R.id.et_ali_account);
        fVar.y("添加支付宝").l("仅用于提现，充值不需要填写").g(true).w(false).i(viewInflate).u(getString(R.string.confirm), new DialogInterface.OnClickListener() { // from class: com.max.hbwallet.a
            @Override // android.content.DialogInterface.OnClickListener
            public final void onClick(DialogInterface dialogInterface, int i10) {
                AliWithdrawActivity.S2(this.f74155b, objectRef, objectRef2, dialogInterface, i10);
            }
        }).o(getString(R.string.cancel), new DialogInterface.OnClickListener() { // from class: com.max.hbwallet.f
            @Override // android.content.DialogInterface.OnClickListener
            public final void onClick(DialogInterface dialogInterface, int i10) {
                AliWithdrawActivity.T2(dialogInterface, i10);
            }
        });
        fVar.F();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Multi-variable type inference failed */
    public static final void S2(AliWithdrawActivity this$0, Ref.ObjectRef et_ali_name, Ref.ObjectRef et_ali_account, DialogInterface dialogInterface, int i10) {
        if (PatchProxy.proxy(new Object[]{this$0, et_ali_name, et_ali_account, dialogInterface, new Integer(i10)}, null, changeQuickRedirect, true, bb.c.k.My, new Class[]{AliWithdrawActivity.class, Ref.ObjectRef.class, Ref.ObjectRef.class, DialogInterface.class, Integer.TYPE}, Void.TYPE).isSupported) {
            return;
        }
        kotlin.jvm.internal.f0.p(this$0, "this$0");
        kotlin.jvm.internal.f0.p(et_ali_name, "$et_ali_name");
        kotlin.jvm.internal.f0.p(et_ali_account, "$et_ali_account");
        dialogInterface.dismiss();
        this$0.v2("bind", ((EditText) et_ali_name.f124891b).getText().toString(), ((EditText) et_ali_account.f124891b).getText().toString());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void T2(DialogInterface dialogInterface, int i10) {
        if (PatchProxy.proxy(new Object[]{dialogInterface, new Integer(i10)}, null, changeQuickRedirect, true, bb.c.k.Ny, new Class[]{DialogInterface.class, Integer.TYPE}, Void.TYPE).isSupported) {
            return;
        }
        dialogInterface.dismiss();
    }

    private final void V2() {
        String desc;
        if (PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, bb.c.k.ly, new Class[0], Void.TYPE).isSupported) {
            return;
        }
        x1();
        G2();
        WithdrawHomeResult withdrawHomeResult = this.L;
        if (withdrawHomeResult != null && (desc = withdrawHomeResult.getDesc()) != null) {
            TextView textView = this.R;
            if (textView == null) {
                kotlin.jvm.internal.f0.S("tv_desc");
                textView = null;
            }
            textView.setText(desc);
        }
        K2();
    }

    private final void W2(KeyDescObj keyDescObj, final String str) {
        if (PatchProxy.proxy(new Object[]{keyDescObj, str}, this, changeQuickRedirect, false, bb.c.k.qy, new Class[]{KeyDescObj.class, String.class}, Void.TYPE).isSupported) {
            return;
        }
        com.max.hbcommon.view.a.f fVarY = new com.max.hbcommon.view.a.f(this.f66601b).y(keyDescObj.getTitle());
        fVarY.l(keyDescObj.getDesc());
        fVarY.u(com.max.hbcommon.utils.l.e(R.string.confirm), new DialogInterface.OnClickListener() { // from class: com.max.hbwallet.i
            @Override // android.content.DialogInterface.OnClickListener
            public final void onClick(DialogInterface dialogInterface, int i10) {
                AliWithdrawActivity.X2(this.f74216b, str, dialogInterface, i10);
            }
        });
        fVarY.o(com.max.hbcommon.utils.l.e(R.string.cancel), new DialogInterface.OnClickListener() { // from class: com.max.hbwallet.j
            @Override // android.content.DialogInterface.OnClickListener
            public final void onClick(DialogInterface dialogInterface, int i10) {
                AliWithdrawActivity.Y2(dialogInterface, i10);
            }
        });
        fVarY.F();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void X2(AliWithdrawActivity this$0, String amount, DialogInterface dialogInterface, int i10) {
        if (PatchProxy.proxy(new Object[]{this$0, amount, dialogInterface, new Integer(i10)}, null, changeQuickRedirect, true, bb.c.k.Iy, new Class[]{AliWithdrawActivity.class, String.class, DialogInterface.class, Integer.TYPE}, Void.TYPE).isSupported) {
            return;
        }
        kotlin.jvm.internal.f0.p(this$0, "this$0");
        kotlin.jvm.internal.f0.p(amount, "$amount");
        this$0.u2(amount);
        dialogInterface.dismiss();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void Y2(DialogInterface dialogInterface, int i10) {
        if (PatchProxy.proxy(new Object[]{dialogInterface, new Integer(i10)}, null, changeQuickRedirect, true, bb.c.k.Jy, new Class[]{DialogInterface.class, Integer.TYPE}, Void.TYPE).isSupported) {
            return;
        }
        dialogInterface.dismiss();
    }

    private final void a3(String str) {
        if (PatchProxy.proxy(new Object[]{str}, this, changeQuickRedirect, false, bb.c.k.ty, new Class[]{String.class}, Void.TYPE).isSupported) {
            return;
        }
        new com.max.hbcommon.view.a.f(this.f66601b).y("提现失败").l(str).u("确定", new DialogInterface.OnClickListener() { // from class: com.max.hbwallet.h
            @Override // android.content.DialogInterface.OnClickListener
            public final void onClick(DialogInterface dialogInterface, int i10) {
                AliWithdrawActivity.e3(dialogInterface, i10);
            }
        }).g(false).F();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void e3(DialogInterface dialogInterface, int i10) {
        if (PatchProxy.proxy(new Object[]{dialogInterface, new Integer(i10)}, null, changeQuickRedirect, true, bb.c.k.Ly, new Class[]{DialogInterface.class, Integer.TYPE}, Void.TYPE).isSupported) {
            return;
        }
        dialogInterface.dismiss();
    }

    private final void f3(String str) {
        if (PatchProxy.proxy(new Object[]{str}, this, changeQuickRedirect, false, bb.c.k.sy, new Class[]{String.class}, Void.TYPE).isSupported) {
            return;
        }
        new com.max.hbcommon.view.a.f(this.f66601b).y("提现成功").l(str).u("确定", new DialogInterface.OnClickListener() { // from class: com.max.hbwallet.d
            @Override // android.content.DialogInterface.OnClickListener
            public final void onClick(DialogInterface dialogInterface, int i10) {
                AliWithdrawActivity.g3(this.f74192b, dialogInterface, i10);
            }
        }).g(false).F();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void g3(AliWithdrawActivity this$0, DialogInterface dialogInterface, int i10) {
        if (PatchProxy.proxy(new Object[]{this$0, dialogInterface, new Integer(i10)}, null, changeQuickRedirect, true, bb.c.k.Ky, new Class[]{AliWithdrawActivity.class, DialogInterface.class, Integer.TYPE}, Void.TYPE).isSupported) {
            return;
        }
        kotlin.jvm.internal.f0.p(this$0, "this$0");
        dialogInterface.dismiss();
        this$0.setResult(-1);
        this$0.finish();
    }

    private final void h3(String str) {
        com.max.hbcommon.component.i iVar;
        if (PatchProxy.proxy(new Object[]{str}, this, changeQuickRedirect, false, bb.c.k.py, new Class[]{String.class}, Void.TYPE).isSupported) {
            return;
        }
        com.max.hbcommon.component.i iVar2 = this.X;
        if ((iVar2 != null && iVar2.isShowing()) && (iVar = this.X) != null) {
            iVar.dismiss();
        }
        V((io.reactivex.disposables.b) ce.b.a().n(PaymentManager.f71422u, "1", str).I5(io.reactivex.schedulers.b.d()).a4(io.reactivex.android.schedulers.a.c()).J5(new h(str)));
    }

    public static final /* synthetic */ void i2(AliWithdrawActivity aliWithdrawActivity) {
        if (PatchProxy.proxy(new Object[]{aliWithdrawActivity}, null, changeQuickRedirect, true, bb.c.k.Uy, new Class[]{AliWithdrawActivity.class}, Void.TYPE).isSupported) {
            return;
        }
        aliWithdrawActivity.y2();
    }

    public static final /* synthetic */ void j2(AliWithdrawActivity aliWithdrawActivity) {
        if (PatchProxy.proxy(new Object[]{aliWithdrawActivity}, null, changeQuickRedirect, true, bb.c.k.Vy, new Class[]{AliWithdrawActivity.class}, Void.TYPE).isSupported) {
            return;
        }
        aliWithdrawActivity.B2();
    }

    public static final /* synthetic */ void k2(AliWithdrawActivity aliWithdrawActivity, int i10) {
        if (PatchProxy.proxy(new Object[]{aliWithdrawActivity, new Integer(i10)}, null, changeQuickRedirect, true, bb.c.k.Wy, new Class[]{AliWithdrawActivity.class, Integer.TYPE}, Void.TYPE).isSupported) {
            return;
        }
        aliWithdrawActivity.D2(i10);
    }

    public static final /* synthetic */ void n2(AliWithdrawActivity aliWithdrawActivity) {
        if (PatchProxy.proxy(new Object[]{aliWithdrawActivity}, null, changeQuickRedirect, true, bb.c.k.Qy, new Class[]{AliWithdrawActivity.class}, Void.TYPE).isSupported) {
            return;
        }
        aliWithdrawActivity.V2();
    }

    public static final /* synthetic */ void o2(AliWithdrawActivity aliWithdrawActivity) {
        if (PatchProxy.proxy(new Object[]{aliWithdrawActivity}, null, changeQuickRedirect, true, bb.c.k.Py, new Class[]{AliWithdrawActivity.class}, Void.TYPE).isSupported) {
            return;
        }
        aliWithdrawActivity.C1();
    }

    public static final /* synthetic */ void p2(AliWithdrawActivity aliWithdrawActivity, KeyDescObj keyDescObj, String str) {
        if (PatchProxy.proxy(new Object[]{aliWithdrawActivity, keyDescObj, str}, null, changeQuickRedirect, true, bb.c.k.Ry, new Class[]{AliWithdrawActivity.class, KeyDescObj.class, String.class}, Void.TYPE).isSupported) {
            return;
        }
        aliWithdrawActivity.W2(keyDescObj, str);
    }

    public static final /* synthetic */ void q2(AliWithdrawActivity aliWithdrawActivity, String str) {
        if (PatchProxy.proxy(new Object[]{aliWithdrawActivity, str}, null, changeQuickRedirect, true, bb.c.k.Ty, new Class[]{AliWithdrawActivity.class, String.class}, Void.TYPE).isSupported) {
            return;
        }
        aliWithdrawActivity.a3(str);
    }

    public static final /* synthetic */ void r2(AliWithdrawActivity aliWithdrawActivity, String str) {
        if (PatchProxy.proxy(new Object[]{aliWithdrawActivity, str}, null, changeQuickRedirect, true, bb.c.k.Sy, new Class[]{AliWithdrawActivity.class, String.class}, Void.TYPE).isSupported) {
            return;
        }
        aliWithdrawActivity.f3(str);
    }

    private final void showLoadingDialog() {
        if (PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, bb.c.k.wy, new Class[0], Void.TYPE).isSupported || !isActive() || this.f66601b.isFinishing()) {
            return;
        }
        ProgressDialog progressDialog = this.W;
        if (progressDialog != null) {
            kotlin.jvm.internal.f0.m(progressDialog);
            if (progressDialog.isShowing()) {
                return;
            }
        }
        this.W = com.max.hbwallet.utils.d.c(this.f66601b, "", "", false);
    }

    @SuppressLint({"AutoDispose"})
    private final void u2(String str) {
        com.max.hbcommon.component.i iVar;
        if (PatchProxy.proxy(new Object[]{str}, this, changeQuickRedirect, false, bb.c.k.ry, new Class[]{String.class}, Void.TYPE).isSupported) {
            return;
        }
        com.max.hbcommon.component.i iVar2 = this.X;
        if ((iVar2 != null && iVar2.isShowing()) && (iVar = this.X) != null) {
            iVar.dismiss();
        }
        V((io.reactivex.disposables.b) ce.b.a().B(PaymentManager.f71422u, "1", str).I5(io.reactivex.schedulers.b.d()).a4(io.reactivex.android.schedulers.a.c()).J5(new b()));
    }

    private final void v2(String str, String str2, String str3) {
        if (PatchProxy.proxy(new Object[]{str, str2, str3}, this, changeQuickRedirect, false, bb.c.k.oy, new Class[]{String.class, String.class, String.class}, Void.TYPE).isSupported) {
            return;
        }
        V((io.reactivex.disposables.b) ce.b.a().e(str, str2, str3).I5(io.reactivex.schedulers.b.d()).a4(io.reactivex.android.schedulers.a.c()).J5(new c()));
    }

    private final void y2() {
        ProgressDialog progressDialog;
        if (PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, bb.c.k.xy, new Class[0], Void.TYPE).isSupported || !isActive() || this.f66601b.isFinishing() || (progressDialog = this.W) == null) {
            return;
        }
        kotlin.jvm.internal.f0.m(progressDialog);
        progressDialog.dismiss();
    }

    @Override // com.max.hbcommon.base.BaseActivity
    public void k1() {
        if (PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, bb.c.k.hy, new Class[0], Void.TYPE).isSupported) {
            return;
        }
        setContentView(R.layout.hbwallet_activity_ali_withdraw);
        this.f66616q.setTitle("收益提现");
        this.f66616q.setAction("明细");
        this.f66616q.setActionOnClickListener(new View.OnClickListener() { // from class: com.max.hbwallet.m
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                AliWithdrawActivity.A2(this.f74233b, view);
            }
        });
        z2();
        E1();
        x2();
    }

    @Override // com.max.hbcommon.base.BaseActivity
    public void n1() {
        if (PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, bb.c.k.jy, new Class[0], Void.TYPE).isSupported) {
            return;
        }
        E1();
        x2();
    }

    @Override // com.max.hbcommon.base.BaseActivity, androidx.fragment.app.FragmentActivity, android.app.Activity
    public void onResume() {
        if (PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, bb.c.k.vy, new Class[0], Void.TYPE).isSupported) {
            return;
        }
        super.onResume();
        if (this.V) {
            this.V = false;
            E2(this, 0, 1, null);
        }
    }

    public final void x2() {
        if (PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, bb.c.k.ky, new Class[0], Void.TYPE).isSupported) {
            return;
        }
        V((io.reactivex.disposables.b) ce.b.a().s().I5(io.reactivex.schedulers.b.d()).a4(io.reactivex.android.schedulers.a.c()).J5(new d()));
    }

    public final void z2() {
        if (PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, bb.c.k.iy, new Class[0], Void.TYPE).isSupported) {
            return;
        }
        View viewFindViewById = findViewById(R.id.tv_account_action);
        kotlin.jvm.internal.f0.o(viewFindViewById, "findViewById(...)");
        this.M = (TextView) viewFindViewById;
        View viewFindViewById2 = findViewById(R.id.tv_withdraw_agreement);
        kotlin.jvm.internal.f0.o(viewFindViewById2, "findViewById(...)");
        this.N = (TextView) viewFindViewById2;
        View viewFindViewById3 = findViewById(R.id.tv_alipay_logon_id);
        kotlin.jvm.internal.f0.o(viewFindViewById3, "findViewById(...)");
        this.O = (TextView) viewFindViewById3;
        View viewFindViewById4 = findViewById(R.id.tv_info);
        kotlin.jvm.internal.f0.o(viewFindViewById4, "findViewById(...)");
        this.P = (TextView) viewFindViewById4;
        View viewFindViewById5 = findViewById(R.id.tv_use_all);
        kotlin.jvm.internal.f0.o(viewFindViewById5, "findViewById(...)");
        this.Q = (TextView) viewFindViewById5;
        View viewFindViewById6 = findViewById(R.id.tv_confirm);
        kotlin.jvm.internal.f0.o(viewFindViewById6, "findViewById(...)");
        this.S = (TextView) viewFindViewById6;
        View viewFindViewById7 = findViewById(R.id.tv_desc);
        kotlin.jvm.internal.f0.o(viewFindViewById7, "findViewById(...)");
        this.R = (TextView) viewFindViewById7;
        View viewFindViewById8 = findViewById(R.id.et_withdraw);
        kotlin.jvm.internal.f0.o(viewFindViewById8, "findViewById(...)");
        EditText editText = (EditText) viewFindViewById8;
        this.T = editText;
        TextView textView = null;
        if (editText == null) {
            kotlin.jvm.internal.f0.S("et_withdraw");
            editText = null;
        }
        editText.setFilters(new com.max.hbwallet.utils.b[]{new com.max.hbwallet.utils.b()});
        EditText editText2 = this.T;
        if (editText2 == null) {
            kotlin.jvm.internal.f0.S("et_withdraw");
            editText2 = null;
        }
        editText2.addTextChangedListener(new e());
        String str = "提现代表您已同意《" + ob.a.b().k() + "提现服务协议》";
        SpannableString spannableString = new SpannableString(str);
        spannableString.setSpan(new f(this.f66601b.getResources().getColor(R.color.click_blue)), 8, str.length(), 33);
        TextView textView2 = this.N;
        if (textView2 == null) {
            kotlin.jvm.internal.f0.S("tv_withdraw_agreement");
            textView2 = null;
        }
        textView2.setText(spannableString);
        TextView textView3 = this.N;
        if (textView3 == null) {
            kotlin.jvm.internal.f0.S("tv_withdraw_agreement");
        } else {
            textView = textView3;
        }
        textView.setMovementMethod(LinkMovementMethod.getInstance());
    }
}
