package com.max.xiaoheihe.module.account;

import android.annotation.SuppressLint;
import android.app.Activity;
import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;
import android.os.Bundle;
import android.text.SpannableString;
import android.text.method.LinkMovementMethod;
import android.view.View;
import android.widget.CheckBox;
import android.widget.CompoundButton;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.view.j1;
import androidx.core.view.n3;
import androidx.core.view.z0;
import com.alibaba.fastjson.JSONObject;
import com.max.hbcustomview.HBLineHeightTextView;
import com.max.hbcustomview.loadingdialog.LoadingDialog;
import com.max.hbutils.bean.Result;
import com.max.xiaoheihe.R;
import com.max.xiaoheihe.bean.account.VerifyInfoObj;
import com.max.xiaoheihe.bean.trade.AliCertifyResult;
import com.max.xiaoheihe.bean.trade.TradeOfferStateObj;
import com.max.xiaoheihe.module.webview.WebActionActivity;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.PatchProxyResult;
import df.l4;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.TimeUnit;

/* JADX INFO: compiled from: AliVerifyDialogActivity.kt */
/* JADX INFO: loaded from: classes9.dex */
@androidx.compose.runtime.internal.o(parameters = 0)
public final class AliVerifyDialogActivity extends AppCompatActivity {
    public static ChangeQuickRedirect changeQuickRedirect = null;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    @dl.d
    public static final a f77459i = new a(null);

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public static final int f77460j = 8;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    @dl.d
    public static final String f77461k = "verify";

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private l4 f77462b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @dl.e
    private LoadingDialog f77463c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private Activity f77464d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    @dl.e
    private String f77465e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private boolean f77466f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    @dl.d
    private final io.reactivex.disposables.a f77467g = new io.reactivex.disposables.a();

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    @dl.e
    private VerifyInfoObj f77468h;

    /* JADX INFO: compiled from: AliVerifyDialogActivity.kt */
    public static final class a {
        public static ChangeQuickRedirect changeQuickRedirect;

        private a() {
        }

        public /* synthetic */ a(kotlin.jvm.internal.u uVar) {
            this();
        }

        @dl.d
        public final Intent a(@dl.d Context context, @dl.d VerifyInfoObj verifyInfo) {
            PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{context, verifyInfo}, this, changeQuickRedirect, false, 22386, new Class[]{Context.class, VerifyInfoObj.class}, Intent.class);
            if (patchProxyResultProxy.isSupported) {
                return (Intent) patchProxyResultProxy.result;
            }
            kotlin.jvm.internal.f0.p(context, "context");
            kotlin.jvm.internal.f0.p(verifyInfo, "verifyInfo");
            Intent intent = new Intent(context, (Class<?>) AliVerifyDialogActivity.class);
            intent.putExtra(AliVerifyDialogActivity.f77461k, verifyInfo);
            return intent;
        }
    }

    /* JADX INFO: compiled from: AliVerifyDialogActivity.kt */
    public static final class b implements DialogInterface.OnClickListener {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public static final b f77469b = new b();
        public static ChangeQuickRedirect changeQuickRedirect;

        b() {
        }

        @Override // android.content.DialogInterface.OnClickListener
        public final void onClick(DialogInterface dialogInterface, int i10) {
            if (PatchProxy.proxy(new Object[]{dialogInterface, new Integer(i10)}, this, changeQuickRedirect, false, 22387, new Class[]{DialogInterface.class, Integer.TYPE}, Void.TYPE).isSupported) {
                return;
            }
            dialogInterface.dismiss();
        }
    }

    /* JADX INFO: compiled from: AliVerifyDialogActivity.kt */
    @kotlin.jvm.internal.t0({"SMAP\nAliVerifyDialogActivity.kt\nKotlin\n*S Kotlin\n*F\n+ 1 AliVerifyDialogActivity.kt\ncom/max/xiaoheihe/module/account/AliVerifyDialogActivity$onCreate$1\n+ 2 View.kt\nandroidx/core/view/ViewKt\n*L\n1#1,291:1\n162#2,8:292\n*S KotlinDebug\n*F\n+ 1 AliVerifyDialogActivity.kt\ncom/max/xiaoheihe/module/account/AliVerifyDialogActivity$onCreate$1\n*L\n74#1:292,8\n*E\n"})
    public static final class c implements z0 {
        public static ChangeQuickRedirect changeQuickRedirect;

        c() {
        }

        @Override // androidx.core.view.z0
        @dl.d
        public final n3 a(@dl.e View view, @dl.d n3 windowInsets) {
            PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{view, windowInsets}, this, changeQuickRedirect, false, 22388, new Class[]{View.class, n3.class}, n3.class);
            if (patchProxyResultProxy.isSupported) {
                return (n3) patchProxyResultProxy.result;
            }
            kotlin.jvm.internal.f0.p(windowInsets, "windowInsets");
            androidx.core.graphics.h0 h0VarF = windowInsets.f(n3.m.i());
            kotlin.jvm.internal.f0.o(h0VarF, "windowInsets.getInsets(W…Compat.Type.systemBars())");
            l4 l4Var = AliVerifyDialogActivity.this.f77462b;
            if (l4Var == null) {
                kotlin.jvm.internal.f0.S("binding");
                l4Var = null;
            }
            LinearLayout linearLayout = l4Var.f112855l;
            kotlin.jvm.internal.f0.o(linearLayout, "binding.vgBottomBar");
            linearLayout.setPadding(linearLayout.getPaddingLeft(), linearLayout.getPaddingTop(), linearLayout.getPaddingRight(), h0VarF.f20745d);
            return n3.f21708c;
        }
    }

    /* JADX INFO: compiled from: AliVerifyDialogActivity.kt */
    public static final class d extends com.max.hbcommon.network.d<Result<TradeOfferStateObj>> {
        public static ChangeQuickRedirect changeQuickRedirect;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ int f77472c;

        d(int i10) {
            this.f77472c = i10;
        }

        @Override // com.max.hbcommon.network.d, io.reactivex.g0
        public void onError(@dl.d Throwable e10) {
            if (PatchProxy.proxy(new Object[]{e10}, this, changeQuickRedirect, false, 22389, new Class[]{Throwable.class}, Void.TYPE).isSupported) {
                return;
            }
            kotlin.jvm.internal.f0.p(e10, "e");
            if (AliVerifyDialogActivity.this.isFinishing()) {
                return;
            }
            AliVerifyDialogActivity.Q0(AliVerifyDialogActivity.this);
            super.onError(e10);
        }

        public void onNext(@dl.d Result<TradeOfferStateObj> result) {
            if (PatchProxy.proxy(new Object[]{result}, this, changeQuickRedirect, false, 22390, new Class[]{Result.class}, Void.TYPE).isSupported) {
                return;
            }
            kotlin.jvm.internal.f0.p(result, "result");
            if (AliVerifyDialogActivity.this.isFinishing()) {
                return;
            }
            if (kotlin.jvm.internal.f0.g(result.getResult().getState(), "passed")) {
                if (!com.max.hbcommon.utils.c.u(result.getResult().getToast_msg())) {
                    com.max.hbutils.utils.c.f(result.getResult().getToast_msg());
                }
                AliVerifyDialogActivity.Q0(AliVerifyDialogActivity.this);
                AliVerifyDialogActivity.this.finish();
                return;
            }
            if (kotlin.jvm.internal.f0.g(result.getResult().getState(), z5.f.f141859j)) {
                AliVerifyDialogActivity.R0(AliVerifyDialogActivity.this);
                AliVerifyDialogActivity.Q0(AliVerifyDialogActivity.this);
            } else {
                if (!kotlin.jvm.internal.f0.g(result.getResult().getState(), "waiting")) {
                    AliVerifyDialogActivity.R0(AliVerifyDialogActivity.this);
                    AliVerifyDialogActivity.Q0(AliVerifyDialogActivity.this);
                    return;
                }
                int i10 = this.f77472c;
                if (i10 < 5) {
                    AliVerifyDialogActivity.S0(AliVerifyDialogActivity.this, i10 + 1);
                } else {
                    AliVerifyDialogActivity.R0(AliVerifyDialogActivity.this);
                    AliVerifyDialogActivity.Q0(AliVerifyDialogActivity.this);
                }
            }
        }

        @Override // com.max.hbcommon.network.d, io.reactivex.g0
        public /* bridge */ /* synthetic */ void onNext(Object obj) {
            if (PatchProxy.proxy(new Object[]{obj}, this, changeQuickRedirect, false, 22391, new Class[]{Object.class}, Void.TYPE).isSupported) {
                return;
            }
            onNext((Result<TradeOfferStateObj>) obj);
        }
    }

    /* JADX INFO: compiled from: AliVerifyDialogActivity.kt */
    public static final class e implements View.OnClickListener {
        public static ChangeQuickRedirect changeQuickRedirect;

        e() {
        }

        @Override // android.view.View.OnClickListener
        public final void onClick(View view) {
            if (PatchProxy.proxy(new Object[]{view}, this, changeQuickRedirect, false, 22392, new Class[]{View.class}, Void.TYPE).isSupported) {
                return;
            }
            l4 l4Var = AliVerifyDialogActivity.this.f77462b;
            l4 l4Var2 = null;
            if (l4Var == null) {
                kotlin.jvm.internal.f0.S("binding");
                l4Var = null;
            }
            CheckBox checkBox = l4Var.f112845b;
            l4 l4Var3 = AliVerifyDialogActivity.this.f77462b;
            if (l4Var3 == null) {
                kotlin.jvm.internal.f0.S("binding");
            } else {
                l4Var2 = l4Var3;
            }
            checkBox.setChecked(true ^ l4Var2.f112845b.isChecked());
        }
    }

    /* JADX INFO: compiled from: AliVerifyDialogActivity.kt */
    public static final class f implements CompoundButton.OnCheckedChangeListener {
        public static ChangeQuickRedirect changeQuickRedirect;

        f() {
        }

        @Override // android.widget.CompoundButton.OnCheckedChangeListener
        public final void onCheckedChanged(CompoundButton compoundButton, boolean z10) {
            if (PatchProxy.proxy(new Object[]{compoundButton, new Byte(z10 ? (byte) 1 : (byte) 0)}, this, changeQuickRedirect, false, 22393, new Class[]{CompoundButton.class, Boolean.TYPE}, Void.TYPE).isSupported) {
                return;
            }
            l4 l4Var = AliVerifyDialogActivity.this.f77462b;
            if (l4Var == null) {
                kotlin.jvm.internal.f0.S("binding");
                l4Var = null;
            }
            l4Var.f112850g.setEnabled(z10);
        }
    }

    /* JADX INFO: compiled from: AliVerifyDialogActivity.kt */
    public static final class g extends com.max.hbcustomview.spans.d {
        public static ChangeQuickRedirect changeQuickRedirect;

        g(int i10) {
            super(i10);
        }

        @Override // android.text.style.ClickableSpan
        public void onClick(@dl.d View view) {
            if (PatchProxy.proxy(new Object[]{view}, this, changeQuickRedirect, false, 22394, new Class[]{View.class}, Void.TYPE).isSupported) {
                return;
            }
            kotlin.jvm.internal.f0.p(view, "view");
            Activity activity = AliVerifyDialogActivity.this.f77464d;
            Activity activity2 = null;
            if (activity == null) {
                kotlin.jvm.internal.f0.S("mContext");
                activity = null;
            }
            Intent intent = new Intent(activity, (Class<?>) WebActionActivity.class);
            intent.putExtra("title", "支付宝认证服务协议");
            intent.putExtra("pageurl", lb.a.E3);
            Activity activity3 = AliVerifyDialogActivity.this.f77464d;
            if (activity3 == null) {
                kotlin.jvm.internal.f0.S("mContext");
            } else {
                activity2 = activity3;
            }
            activity2.startActivity(intent);
        }
    }

    /* JADX INFO: compiled from: AliVerifyDialogActivity.kt */
    public static final class h implements View.OnClickListener {
        public static ChangeQuickRedirect changeQuickRedirect;

        h() {
        }

        @Override // android.view.View.OnClickListener
        public final void onClick(View view) {
            if (PatchProxy.proxy(new Object[]{view}, this, changeQuickRedirect, false, 22395, new Class[]{View.class}, Void.TYPE).isSupported) {
                return;
            }
            AliVerifyDialogActivity.V0(AliVerifyDialogActivity.this);
        }
    }

    /* JADX INFO: compiled from: AliVerifyDialogActivity.kt */
    public static final class i implements View.OnClickListener {
        public static ChangeQuickRedirect changeQuickRedirect;

        i() {
        }

        @Override // android.view.View.OnClickListener
        public final void onClick(View view) {
            if (PatchProxy.proxy(new Object[]{view}, this, changeQuickRedirect, false, 22396, new Class[]{View.class}, Void.TYPE).isSupported) {
                return;
            }
            AliVerifyDialogActivity.this.finish();
        }
    }

    /* JADX INFO: compiled from: AliVerifyDialogActivity.kt */
    public static final class j extends com.max.hbcommon.network.d<Result<AliCertifyResult>> {
        public static ChangeQuickRedirect changeQuickRedirect;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ String f77479c;

        /* JADX INFO: compiled from: AliVerifyDialogActivity.kt */
        public static final class a implements l4.a {
            public static ChangeQuickRedirect changeQuickRedirect;

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            final /* synthetic */ AliVerifyDialogActivity f77480a;

            a(AliVerifyDialogActivity aliVerifyDialogActivity) {
                this.f77480a = aliVerifyDialogActivity;
            }

            @Override // l4.a
            public final void a(Map<String, String> map) {
                if (PatchProxy.proxy(new Object[]{map}, this, changeQuickRedirect, false, 22400, new Class[]{Map.class}, Void.TYPE).isSupported) {
                    return;
                }
                String str = map.get(z5.j.f141892a);
                if (kotlin.jvm.internal.f0.g("9001", str)) {
                    this.f77480a.f77466f = true;
                    return;
                }
                if (kotlin.jvm.internal.f0.g("9000", str)) {
                    this.f77480a.f77466f = true;
                    return;
                }
                com.max.hbutils.utils.c.f("验证错误 code:" + str);
            }
        }

        j(String str) {
            this.f77479c = str;
        }

        @Override // com.max.hbcommon.network.d, io.reactivex.g0
        public void onError(@dl.d Throwable e10) {
            if (PatchProxy.proxy(new Object[]{e10}, this, changeQuickRedirect, false, 22397, new Class[]{Throwable.class}, Void.TYPE).isSupported) {
                return;
            }
            kotlin.jvm.internal.f0.p(e10, "e");
            if (AliVerifyDialogActivity.this.isFinishing()) {
                return;
            }
            AliVerifyDialogActivity.Q0(AliVerifyDialogActivity.this);
            super.onError(e10);
        }

        public void onNext(@dl.d Result<AliCertifyResult> result) {
            if (PatchProxy.proxy(new Object[]{result}, this, changeQuickRedirect, false, 22398, new Class[]{Result.class}, Void.TYPE).isSupported) {
                return;
            }
            kotlin.jvm.internal.f0.p(result, "result");
            if (AliVerifyDialogActivity.this.isFinishing()) {
                return;
            }
            if (kotlin.jvm.internal.f0.g(result.getResult().getOp(), "pass")) {
                if (!com.max.hbcommon.utils.c.u(result.getResult().getToast_msg())) {
                    com.max.hbutils.utils.c.f(result.getResult().getToast_msg());
                }
                AliVerifyDialogActivity.Q0(AliVerifyDialogActivity.this);
                AliVerifyDialogActivity.this.finish();
                return;
            }
            Activity activity = null;
            if (kotlin.jvm.internal.f0.g(result.getResult().getOp(), "query")) {
                AliVerifyDialogActivity.this.f77465e = result.getResult().getCertify_id();
                AliVerifyDialogActivity.c1(AliVerifyDialogActivity.this, 0, 1, null);
                return;
            }
            AliVerifyDialogActivity.Q0(AliVerifyDialogActivity.this);
            JSONObject jSONObject = new JSONObject();
            AliVerifyDialogActivity.this.f77465e = result.getResult().getCertify_id();
            jSONObject.put("url", (Object) result.getResult().getUrl());
            jSONObject.put("certifyId", (Object) AliVerifyDialogActivity.this.f77465e);
            jSONObject.put("bizCode", (Object) this.f77479c);
            l4.b bVarA = com.alipay.mobile.android.verify.sdk.a.a();
            Activity activity2 = AliVerifyDialogActivity.this.f77464d;
            if (activity2 == null) {
                kotlin.jvm.internal.f0.S("mContext");
            } else {
                activity = activity2;
            }
            bVarA.b(activity, jSONObject, new a(AliVerifyDialogActivity.this));
        }

        @Override // com.max.hbcommon.network.d, io.reactivex.g0
        public /* bridge */ /* synthetic */ void onNext(Object obj) {
            if (PatchProxy.proxy(new Object[]{obj}, this, changeQuickRedirect, false, 22399, new Class[]{Object.class}, Void.TYPE).isSupported) {
                return;
            }
            onNext((Result<AliCertifyResult>) obj);
        }
    }

    public static final /* synthetic */ void Q0(AliVerifyDialogActivity aliVerifyDialogActivity) {
        if (PatchProxy.proxy(new Object[]{aliVerifyDialogActivity}, null, changeQuickRedirect, true, 22383, new Class[]{AliVerifyDialogActivity.class}, Void.TYPE).isSupported) {
            return;
        }
        aliVerifyDialogActivity.X0();
    }

    public static final /* synthetic */ void R0(AliVerifyDialogActivity aliVerifyDialogActivity) {
        if (PatchProxy.proxy(new Object[]{aliVerifyDialogActivity}, null, changeQuickRedirect, true, 22384, new Class[]{AliVerifyDialogActivity.class}, Void.TYPE).isSupported) {
            return;
        }
        aliVerifyDialogActivity.Z0();
    }

    public static final /* synthetic */ void S0(AliVerifyDialogActivity aliVerifyDialogActivity, int i10) {
        if (PatchProxy.proxy(new Object[]{aliVerifyDialogActivity, new Integer(i10)}, null, changeQuickRedirect, true, 22385, new Class[]{AliVerifyDialogActivity.class, Integer.TYPE}, Void.TYPE).isSupported) {
            return;
        }
        aliVerifyDialogActivity.a1(i10);
    }

    public static final /* synthetic */ void V0(AliVerifyDialogActivity aliVerifyDialogActivity) {
        if (PatchProxy.proxy(new Object[]{aliVerifyDialogActivity}, null, changeQuickRedirect, true, 22382, new Class[]{AliVerifyDialogActivity.class}, Void.TYPE).isSupported) {
            return;
        }
        aliVerifyDialogActivity.h1();
    }

    private final Map<String, Object> W0() {
        HashMap<String, Object> query_param;
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 22376, new Class[0], Map.class);
        if (patchProxyResultProxy.isSupported) {
            return (Map) patchProxyResultProxy.result;
        }
        VerifyInfoObj verifyInfoObj = this.f77468h;
        return (verifyInfoObj == null || (query_param = verifyInfoObj.getQuery_param()) == null) ? new HashMap() : query_param;
    }

    private final void X0() {
        LoadingDialog loadingDialog;
        if (PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 22381, new Class[0], Void.TYPE).isSupported || isFinishing() || (loadingDialog = this.f77463c) == null) {
            return;
        }
        kotlin.jvm.internal.f0.m(loadingDialog);
        loadingDialog.c();
    }

    private final void Z0() {
        if (PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 22379, new Class[0], Void.TYPE).isSupported) {
            return;
        }
        Activity activity = this.f77464d;
        if (activity == null) {
            kotlin.jvm.internal.f0.S("mContext");
            activity = null;
        }
        com.max.hbcommon.view.a.f fVar = new com.max.hbcommon.view.a.f(activity);
        fVar.y("实名认证失败,请稍后再试").g(true).u(getString(R.string.confirm), b.f77469b);
        fVar.F();
    }

    @SuppressLint({"AutoDispose"})
    private final void a1(int i10) {
        Boolean goto_certify_manager;
        boolean z10 = true;
        boolean zBooleanValue = false;
        if (PatchProxy.proxy(new Object[]{new Integer(i10)}, this, changeQuickRedirect, false, 22374, new Class[]{Integer.TYPE}, Void.TYPE).isSupported) {
            return;
        }
        String str = this.f77465e;
        if (str != null && str.length() != 0) {
            z10 = false;
        }
        if (z10) {
            return;
        }
        long j10 = i10 > 0 ? 2L : 0L;
        showLoadingDialog();
        io.reactivex.disposables.a aVar = this.f77467g;
        com.max.xiaoheihe.network.e eVarA = com.max.xiaoheihe.network.i.a();
        String str2 = this.f77465e;
        VerifyInfoObj verifyInfoObj = this.f77468h;
        if (verifyInfoObj != null && (goto_certify_manager = verifyInfoObj.getGoto_certify_manager()) != null) {
            zBooleanValue = goto_certify_manager.booleanValue();
        }
        aVar.c((io.reactivex.disposables.b) eVarA.M2(str2, zBooleanValue, W0()).C1(j10, TimeUnit.SECONDS).I5(io.reactivex.schedulers.b.d()).a4(io.reactivex.android.schedulers.a.c()).J5(new d(i10)));
    }

    static /* synthetic */ void c1(AliVerifyDialogActivity aliVerifyDialogActivity, int i10, int i11, Object obj) {
        Object[] objArr = {aliVerifyDialogActivity, new Integer(i10), new Integer(i11), obj};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        Class cls = Integer.TYPE;
        if (PatchProxy.proxy(objArr, null, changeQuickRedirect2, true, 22375, new Class[]{AliVerifyDialogActivity.class, cls, cls, Object.class}, Void.TYPE).isSupported) {
            return;
        }
        if ((i11 & 1) != 0) {
            i10 = 0;
        }
        aliVerifyDialogActivity.a1(i10);
    }

    private final void g1() {
        if (PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 22372, new Class[0], Void.TYPE).isSupported) {
            return;
        }
        l4 l4Var = this.f77462b;
        l4 l4Var2 = null;
        if (l4Var == null) {
            kotlin.jvm.internal.f0.S("binding");
            l4Var = null;
        }
        TextView textView = l4Var.f112853j;
        VerifyInfoObj verifyInfoObj = this.f77468h;
        textView.setText(verifyInfoObj != null ? verifyInfoObj.getName() : null);
        l4 l4Var3 = this.f77462b;
        if (l4Var3 == null) {
            kotlin.jvm.internal.f0.S("binding");
            l4Var3 = null;
        }
        TextView textView2 = l4Var3.f112852i;
        VerifyInfoObj verifyInfoObj2 = this.f77468h;
        textView2.setText(verifyInfoObj2 != null ? verifyInfoObj2.getId_card() : null);
        l4 l4Var4 = this.f77462b;
        if (l4Var4 == null) {
            kotlin.jvm.internal.f0.S("binding");
            l4Var4 = null;
        }
        HBLineHeightTextView hBLineHeightTextView = l4Var4.f112851h;
        VerifyInfoObj verifyInfoObj3 = this.f77468h;
        hBLineHeightTextView.setText(verifyInfoObj3 != null ? verifyInfoObj3.getTips() : null);
        l4 l4Var5 = this.f77462b;
        if (l4Var5 == null) {
            kotlin.jvm.internal.f0.S("binding");
            l4Var5 = null;
        }
        TextView textView3 = l4Var5.f112849f;
        VerifyInfoObj verifyInfoObj4 = this.f77468h;
        textView3.setText(verifyInfoObj4 != null ? verifyInfoObj4.getTitle() : null);
        l4 l4Var6 = this.f77462b;
        if (l4Var6 == null) {
            kotlin.jvm.internal.f0.S("binding");
            l4Var6 = null;
        }
        l4Var6.f112856m.setOnClickListener(new e());
        l4 l4Var7 = this.f77462b;
        if (l4Var7 == null) {
            kotlin.jvm.internal.f0.S("binding");
            l4Var7 = null;
        }
        l4Var7.f112845b.setOnCheckedChangeListener(new f());
        SpannableString spannableString = new SpannableString("我已阅读并同意《支付宝认证服务协议》");
        spannableString.setSpan(new g(getResources().getColor(R.color.click_blue)), 7, 18, 33);
        l4 l4Var8 = this.f77462b;
        if (l4Var8 == null) {
            kotlin.jvm.internal.f0.S("binding");
            l4Var8 = null;
        }
        l4Var8.f112848e.setText(spannableString);
        l4 l4Var9 = this.f77462b;
        if (l4Var9 == null) {
            kotlin.jvm.internal.f0.S("binding");
            l4Var9 = null;
        }
        l4Var9.f112848e.setMovementMethod(LinkMovementMethod.getInstance());
        l4 l4Var10 = this.f77462b;
        if (l4Var10 == null) {
            kotlin.jvm.internal.f0.S("binding");
            l4Var10 = null;
        }
        l4Var10.f112850g.setOnClickListener(new h());
        l4 l4Var11 = this.f77462b;
        if (l4Var11 == null) {
            kotlin.jvm.internal.f0.S("binding");
        } else {
            l4Var2 = l4Var11;
        }
        l4Var2.f112847d.setOnClickListener(new i());
    }

    @SuppressLint({"AutoDispose"})
    private final void h1() {
        Boolean goto_certify_manager;
        boolean zBooleanValue = false;
        if (PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 22373, new Class[0], Void.TYPE).isSupported) {
            return;
        }
        String strA = com.alipay.mobile.android.verify.sdk.a.a().a(this);
        showLoadingDialog();
        io.reactivex.disposables.a aVar = this.f77467g;
        com.max.xiaoheihe.network.e eVarA = com.max.xiaoheihe.network.i.a();
        VerifyInfoObj verifyInfoObj = this.f77468h;
        if (verifyInfoObj != null && (goto_certify_manager = verifyInfoObj.getGoto_certify_manager()) != null) {
            zBooleanValue = goto_certify_manager.booleanValue();
        }
        aVar.c((io.reactivex.disposables.b) eVarA.na(strA, zBooleanValue, W0()).I5(io.reactivex.schedulers.b.d()).a4(io.reactivex.android.schedulers.a.c()).J5(new j(strA)));
    }

    private final void showLoadingDialog() {
        if (PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 22380, new Class[0], Void.TYPE).isSupported || isFinishing()) {
            return;
        }
        LoadingDialog loadingDialog = this.f77463c;
        if (loadingDialog != null) {
            kotlin.jvm.internal.f0.m(loadingDialog);
            if (loadingDialog.i()) {
                return;
            }
        }
        this.f77463c = new LoadingDialog(this, "").r();
    }

    @Override // androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public void onCreate(@dl.e Bundle bundle) {
        if (PatchProxy.proxy(new Object[]{bundle}, this, changeQuickRedirect, false, 22371, new Class[]{Bundle.class}, Void.TYPE).isSupported) {
            return;
        }
        super.onCreate(bundle);
        this.f77464d = this;
        com.max.hbutils.utils.t.c0(this);
        l4 l4VarC = l4.c(getLayoutInflater());
        kotlin.jvm.internal.f0.o(l4VarC, "inflate(layoutInflater)");
        this.f77462b = l4VarC;
        l4 l4Var = null;
        if (l4VarC == null) {
            kotlin.jvm.internal.f0.S("binding");
            l4VarC = null;
        }
        setContentView(l4VarC.b());
        getWindow().setLayout(-1, -1);
        getWindow().setGravity(17);
        l4 l4Var2 = this.f77462b;
        if (l4Var2 == null) {
            kotlin.jvm.internal.f0.S("binding");
        } else {
            l4Var = l4Var2;
        }
        j1.a2(l4Var.b(), new c());
        Intent intent = getIntent();
        if (intent != null) {
            this.f77468h = (VerifyInfoObj) intent.getSerializableExtra(f77461k);
        }
        if (this.f77468h != null) {
            g1();
        } else {
            com.max.hbutils.utils.c.d("实名信息为空");
            finish();
        }
    }

    @Override // androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, android.app.Activity
    public void onDestroy() {
        if (PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 22377, new Class[0], Void.TYPE).isSupported) {
            return;
        }
        super.onDestroy();
        this.f77467g.f();
    }

    @Override // androidx.fragment.app.FragmentActivity, android.app.Activity
    public void onResume() {
        if (PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 22378, new Class[0], Void.TYPE).isSupported) {
            return;
        }
        super.onResume();
        if (this.f77466f) {
            this.f77466f = false;
            c1(this, 0, 1, null);
        }
    }
}
