package com.max.xiaoheihe.module.account;

import android.app.Dialog;
import android.content.Context;
import android.os.Bundle;
import android.text.SpannableStringBuilder;
import android.text.method.LinkMovementMethod;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import android.view.WindowManager;
import android.widget.CheckBox;
import android.widget.FrameLayout;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import cn.fly.verify.FlyVerify;
import cn.fly.verify.common.callback.OperationCallback;
import cn.fly.verify.common.exception.VerifyException;
import cn.fly.verify.pure.entity.PreVerifyResult;
import cn.fly.verify.pure.entity.VerifyResult;
import com.google.gson.JsonObject;
import com.max.hbcommon.component.bottombutton.base.BaseBottomButton;
import com.max.hbcustomview.loadingdialog.LoadingDialog;
import com.max.xiaoheihe.R;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.PatchProxyResult;
import df.c8;
import kotlin.b2;

/* JADX INFO: compiled from: MobLoginFragmentDialog.kt */
/* JADX INFO: loaded from: classes9.dex */
@kotlin.jvm.internal.t0({"SMAP\nMobLoginFragmentDialog.kt\nKotlin\n*S Kotlin\n*F\n+ 1 MobLoginFragmentDialog.kt\ncom/max/xiaoheihe/module/account/MobLoginFragmentDialog\n+ 2 View.kt\nandroidx/core/view/ViewKt\n*L\n1#1,276:1\n162#2,8:277\n*S KotlinDebug\n*F\n+ 1 MobLoginFragmentDialog.kt\ncom/max/xiaoheihe/module/account/MobLoginFragmentDialog\n*L\n96#1:277,8\n*E\n"})
@androidx.compose.runtime.internal.o(parameters = 0)
public final class h0 extends com.max.hbcommon.base.c {
    public static ChangeQuickRedirect changeQuickRedirect = null;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    @dl.d
    public static final a f78943i = new a(null);

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public static final int f78944j = 8;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    @dl.d
    public static final String f78945k = "data";

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private c8 f78946e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    @dl.e
    private PreVerifyResult f78947f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public i0 f78948g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    @dl.e
    private LoadingDialog f78949h;

    /* JADX INFO: compiled from: MobLoginFragmentDialog.kt */
    public static final class a {
        public static ChangeQuickRedirect changeQuickRedirect;

        private a() {
        }

        public /* synthetic */ a(kotlin.jvm.internal.u uVar) {
            this();
        }

        @dl.d
        @xh.m
        public final h0 a() {
            PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 23746, new Class[0], h0.class);
            return patchProxyResultProxy.isSupported ? (h0) patchProxyResultProxy.result : new h0();
        }
    }

    /* JADX INFO: compiled from: MobLoginFragmentDialog.kt */
    public static final class b implements View.OnClickListener {
        public static ChangeQuickRedirect changeQuickRedirect;

        b() {
        }

        @Override // android.view.View.OnClickListener
        public final void onClick(View view) {
            if (PatchProxy.proxy(new Object[]{view}, this, changeQuickRedirect, false, 23747, new Class[]{View.class}, Void.TYPE).isSupported) {
                return;
            }
            h0.this.S3().close();
        }
    }

    /* JADX INFO: compiled from: MobLoginFragmentDialog.kt */
    public static final class c implements View.OnClickListener {
        public static ChangeQuickRedirect changeQuickRedirect;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ BaseBottomButton f78952c;

        /* JADX INFO: compiled from: MobLoginFragmentDialog.kt */
        public static final class a extends OperationCallback<VerifyResult> {
            public static ChangeQuickRedirect changeQuickRedirect;

            /* JADX INFO: renamed from: f, reason: collision with root package name */
            final /* synthetic */ h0 f78953f;

            /* JADX INFO: renamed from: g, reason: collision with root package name */
            final /* synthetic */ BaseBottomButton f78954g;

            a(h0 h0Var, BaseBottomButton baseBottomButton) {
                this.f78953f = h0Var;
                this.f78954g = baseBottomButton;
            }

            public void a(@dl.e VerifyResult verifyResult) {
                if (!PatchProxy.proxy(new Object[]{verifyResult}, this, changeQuickRedirect, false, 23749, new Class[]{VerifyResult.class}, Void.TYPE).isSupported && this.f78953f.isActive()) {
                    this.f78954g.setClickable(true);
                    h0.O3(this.f78953f);
                    this.f78953f.dismiss();
                    JsonObject jsonObject = new JsonObject();
                    jsonObject.addProperty(com.max.hbcache.c.L0, com.max.hbcache.c.N0);
                    com.max.hbcommon.analytics.d.e("3", lb.d.f131190k, null, null, jsonObject, null, true);
                    this.f78953f.S3().w(verifyResult != null ? verifyResult.getToken() : null, verifyResult != null ? verifyResult.getOpToken() : null, verifyResult != null ? verifyResult.getOperator() : null);
                }
            }

            @Override // cn.fly.verify.common.callback.OperationCallback
            public /* bridge */ /* synthetic */ void onComplete(VerifyResult verifyResult) {
                if (PatchProxy.proxy(new Object[]{verifyResult}, this, changeQuickRedirect, false, 23751, new Class[]{Object.class}, Void.TYPE).isSupported) {
                    return;
                }
                a(verifyResult);
            }

            @Override // cn.fly.verify.common.callback.OperationCallback
            public void onFailure(@dl.e VerifyException verifyException) {
                if (PatchProxy.proxy(new Object[]{verifyException}, this, changeQuickRedirect, false, 23750, new Class[]{VerifyException.class}, Void.TYPE).isSupported) {
                    return;
                }
                this.f78954g.setClickable(true);
                h0.O3(this.f78953f);
                StringBuilder sb2 = new StringBuilder();
                sb2.append("一键登录信息获取失败 ");
                sb2.append(verifyException != null ? Integer.valueOf(verifyException.getCode()) : null);
                sb2.append(' ');
                sb2.append(verifyException != null ? verifyException.getMessage() : null);
                com.max.hbutils.utils.c.d(sb2.toString());
                h0.Q3(this.f78953f, com.max.hbcache.c.N0, "auth", verifyException != null ? Integer.valueOf(verifyException.getCode()) : null);
            }
        }

        c(BaseBottomButton baseBottomButton) {
            this.f78952c = baseBottomButton;
        }

        @Override // android.view.View.OnClickListener
        public final void onClick(View view) {
            if (PatchProxy.proxy(new Object[]{view}, this, changeQuickRedirect, false, 23748, new Class[]{View.class}, Void.TYPE).isSupported) {
                return;
            }
            c8 c8Var = h0.this.f78946e;
            if (c8Var == null) {
                kotlin.jvm.internal.f0.S("binding");
                c8Var = null;
            }
            if (!c8Var.f109208c.isChecked()) {
                com.max.hbutils.utils.c.d("请先同意服务及隐私协议");
                return;
            }
            this.f78952c.setClickable(false);
            h0.P3(h0.this);
            FlyVerify.verify(new a(h0.this, this.f78952c));
        }
    }

    /* JADX INFO: compiled from: MobLoginFragmentDialog.kt */
    public static final class d implements View.OnClickListener {
        public static ChangeQuickRedirect changeQuickRedirect;

        d() {
        }

        @Override // android.view.View.OnClickListener
        public final void onClick(View view) {
            if (PatchProxy.proxy(new Object[]{view}, this, changeQuickRedirect, false, 23752, new Class[]{View.class}, Void.TYPE).isSupported) {
                return;
            }
            h0.this.dismiss();
        }
    }

    /* JADX INFO: compiled from: MobLoginFragmentDialog.kt */
    public static final class e implements View.OnClickListener {
        public static ChangeQuickRedirect changeQuickRedirect;

        /* JADX INFO: compiled from: MobLoginFragmentDialog.kt */
        public static final class a implements com.max.xiaoheihe.utils.l0.g {
            public static ChangeQuickRedirect changeQuickRedirect;

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            final /* synthetic */ h0 f78957a;

            a(h0 h0Var) {
                this.f78957a = h0Var;
            }

            @Override // com.max.xiaoheihe.utils.l0.g
            public final void a() {
                if (PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 23754, new Class[0], Void.TYPE).isSupported) {
                    return;
                }
                c8 c8Var = this.f78957a.f78946e;
                c8 c8Var2 = null;
                if (c8Var == null) {
                    kotlin.jvm.internal.f0.S("binding");
                    c8Var = null;
                }
                c8Var.f109208c.setChecked(true);
                c8 c8Var3 = this.f78957a.f78946e;
                if (c8Var3 == null) {
                    kotlin.jvm.internal.f0.S("binding");
                } else {
                    c8Var2 = c8Var3;
                }
                c8Var2.f109215j.performClick();
            }
        }

        e() {
        }

        @Override // android.view.View.OnClickListener
        public final void onClick(View view) {
            if (PatchProxy.proxy(new Object[]{view}, this, changeQuickRedirect, false, 23753, new Class[]{View.class}, Void.TYPE).isSupported) {
                return;
            }
            c8 c8Var = h0.this.f78946e;
            if (c8Var == null) {
                kotlin.jvm.internal.f0.S("binding");
                c8Var = null;
            }
            if (c8Var.f109208c.isChecked()) {
                h0.this.S3().W();
            } else {
                h0.this.S3().g0(new a(h0.this));
            }
        }
    }

    /* JADX INFO: compiled from: MobLoginFragmentDialog.kt */
    public static final class f implements View.OnClickListener {
        public static ChangeQuickRedirect changeQuickRedirect;

        f() {
        }

        @Override // android.view.View.OnClickListener
        public final void onClick(View view) {
            if (PatchProxy.proxy(new Object[]{view}, this, changeQuickRedirect, false, 23755, new Class[]{View.class}, Void.TYPE).isSupported) {
                return;
            }
            c8 c8Var = h0.this.f78946e;
            c8 c8Var2 = null;
            if (c8Var == null) {
                kotlin.jvm.internal.f0.S("binding");
                c8Var = null;
            }
            CheckBox checkBox = c8Var.f109208c;
            c8 c8Var3 = h0.this.f78946e;
            if (c8Var3 == null) {
                kotlin.jvm.internal.f0.S("binding");
            } else {
                c8Var2 = c8Var3;
            }
            checkBox.setChecked(true ^ c8Var2.f109208c.isChecked());
        }
    }

    /* JADX INFO: compiled from: MobLoginFragmentDialog.kt */
    public static final class g extends com.max.hbcustomview.spans.d {
        public static ChangeQuickRedirect changeQuickRedirect;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        final /* synthetic */ TextView f78959d;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        g(TextView textView, int i10) {
            super(i10);
            this.f78959d = textView;
        }

        @Override // android.text.style.ClickableSpan
        public void onClick(@dl.d View widget) {
            if (PatchProxy.proxy(new Object[]{widget}, this, changeQuickRedirect, false, 23756, new Class[]{View.class}, Void.TYPE).isSupported) {
                return;
            }
            kotlin.jvm.internal.f0.p(widget, "widget");
            Context context = this.f78959d.getContext();
            kotlin.jvm.internal.f0.o(context, "context");
            com.max.xiaoheihe.base.router.b.k0(context, lb.a.C1);
        }
    }

    /* JADX INFO: compiled from: MobLoginFragmentDialog.kt */
    public static final class h extends com.max.hbcustomview.spans.d {
        public static ChangeQuickRedirect changeQuickRedirect;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        final /* synthetic */ TextView f78960d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        final /* synthetic */ PreVerifyResult f78961e;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        h(TextView textView, PreVerifyResult preVerifyResult, int i10) {
            super(i10);
            this.f78960d = textView;
            this.f78961e = preVerifyResult;
        }

        @Override // android.text.style.ClickableSpan
        public void onClick(@dl.d View widget) {
            if (PatchProxy.proxy(new Object[]{widget}, this, changeQuickRedirect, false, 23757, new Class[]{View.class}, Void.TYPE).isSupported) {
                return;
            }
            kotlin.jvm.internal.f0.p(widget, "widget");
            Context context = this.f78960d.getContext();
            kotlin.jvm.internal.f0.o(context, "context");
            StringBuilder sb2 = new StringBuilder();
            sb2.append(this.f78961e.getUiElement().getPrivacyUrl());
            sb2.append(kotlin.jvm.internal.f0.g("CTCC", this.f78961e.getOperator()) ? "?hidetop=true" : "");
            com.max.xiaoheihe.base.router.b.k0(context, sb2.toString());
        }
    }

    public static final /* synthetic */ void O3(h0 h0Var) {
        if (PatchProxy.proxy(new Object[]{h0Var}, null, changeQuickRedirect, true, 23744, new Class[]{h0.class}, Void.TYPE).isSupported) {
            return;
        }
        h0Var.T3();
    }

    public static final /* synthetic */ void P3(h0 h0Var) {
        if (PatchProxy.proxy(new Object[]{h0Var}, null, changeQuickRedirect, true, 23743, new Class[]{h0.class}, Void.TYPE).isSupported) {
            return;
        }
        h0Var.Z3();
    }

    public static final /* synthetic */ void Q3(h0 h0Var, String str, String str2, Integer num) {
        if (PatchProxy.proxy(new Object[]{h0Var, str, str2, num}, null, changeQuickRedirect, true, 23745, new Class[]{h0.class, String.class, String.class, Integer.class}, Void.TYPE).isSupported) {
            return;
        }
        h0Var.a4(str, str2, num);
    }

    private final void T3() {
        LoadingDialog loadingDialog;
        if (PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 23740, new Class[0], Void.TYPE).isSupported || !isActive() || getContext() == null || (loadingDialog = this.f78949h) == null) {
            return;
        }
        if (!loadingDialog.i()) {
            loadingDialog = null;
        }
        if (loadingDialog != null) {
            loadingDialog.c();
        }
    }

    private final void U3() {
        if (PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 23736, new Class[0], Void.TYPE).isSupported) {
            return;
        }
        JsonObject jsonObject = new JsonObject();
        jsonObject.addProperty(com.max.hbcache.c.L0, com.max.hbcache.c.N0);
        b2 b2Var = b2.f124493a;
        com.max.hbcommon.analytics.d.e("1", lb.d.f131183j, null, null, jsonObject, null, true);
        PreVerifyResult preVerifyResult = this.f78947f;
        if (preVerifyResult != null) {
            c8 c8Var = this.f78946e;
            c8 c8Var2 = null;
            if (c8Var == null) {
                kotlin.jvm.internal.f0.S("binding");
                c8Var = null;
            }
            ConstraintLayout constraintLayoutB = c8Var.b();
            kotlin.jvm.internal.f0.o(constraintLayoutB, "binding.root");
            constraintLayoutB.setPadding(constraintLayoutB.getPaddingLeft(), com.max.hbutils.utils.t.p(getContext()), constraintLayoutB.getPaddingRight(), constraintLayoutB.getPaddingBottom());
            c8 c8Var3 = this.f78946e;
            if (c8Var3 == null) {
                kotlin.jvm.internal.f0.S("binding");
                c8Var3 = null;
            }
            FrameLayout frameLayout = c8Var3.f109216k;
            frameLayout.removeAllViews();
            View viewU = S3().U();
            viewU.setLayoutParams(new ViewGroup.LayoutParams(-1, -1));
            frameLayout.addView(viewU);
            c8 c8Var4 = this.f78946e;
            if (c8Var4 == null) {
                kotlin.jvm.internal.f0.S("binding");
                c8Var4 = null;
            }
            c8Var4.f109210e.setOnClickListener(new b());
            c8 c8Var5 = this.f78946e;
            if (c8Var5 == null) {
                kotlin.jvm.internal.f0.S("binding");
                c8Var5 = null;
            }
            c8Var5.f109212g.setText(preVerifyResult.getSecurityPhone());
            c8 c8Var6 = this.f78946e;
            if (c8Var6 == null) {
                kotlin.jvm.internal.f0.S("binding");
                c8Var6 = null;
            }
            c8Var6.f109213h.setText(preVerifyResult.getUiElement().getSlogan());
            c8 c8Var7 = this.f78946e;
            if (c8Var7 == null) {
                kotlin.jvm.internal.f0.S("binding");
                c8Var7 = null;
            }
            BaseBottomButton baseBottomButton = c8Var7.f109207b;
            baseBottomButton.getTv_button().setTextSize(1, 18.0f);
            baseBottomButton.setOnClickListener(new c(baseBottomButton));
            c8 c8Var8 = this.f78946e;
            if (c8Var8 == null) {
                kotlin.jvm.internal.f0.S("binding");
                c8Var8 = null;
            }
            c8Var8.f109211f.setOnClickListener(new d());
            c8 c8Var9 = this.f78946e;
            if (c8Var9 == null) {
                kotlin.jvm.internal.f0.S("binding");
                c8Var9 = null;
            }
            TextView textView = c8Var9.f109215j;
            bb.d.d(textView, 0);
            textView.setText("\uf1d7 " + com.max.xiaoheihe.utils.d.n0(R.string.login_by_weixin));
            textView.setOnClickListener(new e());
            c8 c8Var10 = this.f78946e;
            if (c8Var10 == null) {
                kotlin.jvm.internal.f0.S("binding");
                c8Var10 = null;
            }
            c8Var10.f109218m.setOnClickListener(new f());
            c8 c8Var11 = this.f78946e;
            if (c8Var11 == null) {
                kotlin.jvm.internal.f0.S("binding");
            } else {
                c8Var2 = c8Var11;
            }
            TextView textView2 = c8Var2.f109214i;
            textView2.setMovementMethod(LinkMovementMethod.getInstance());
            String str = (char) 12298 + com.max.xiaoheihe.utils.d.A() + "服务及隐私条款》";
            String str2 = "登录即表明同意" + str + "\n以及《" + preVerifyResult.getUiElement().getPrivacyName() + (char) 12299;
            SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(str2);
            spannableStringBuilder.setSpan(new g(textView2, com.max.xiaoheihe.utils.d.E(R.color.text_primary_1_color)), 7, ("登录即表明同意" + str).length(), 18);
            com.max.hbresource.a aVar = com.max.hbresource.a.f71893a;
            int i10 = com.max.hbresource.a.f71895c;
            spannableStringBuilder.setSpan(new com.max.hbcustomview.spans.g(aVar.a(i10)), 7, ("登录即表明同意" + str).length(), 18);
            spannableStringBuilder.setSpan(new h(textView2, preVerifyResult, com.max.xiaoheihe.utils.d.E(R.color.text_primary_1_color)), ("登录即表明同意" + str + "\n以及").length(), str2.length(), 18);
            spannableStringBuilder.setSpan(new com.max.hbcustomview.spans.g(aVar.a(i10)), ("登录即表明同意" + str + "\n以及").length(), str2.length(), 18);
            textView2.setText(spannableStringBuilder);
        }
    }

    @dl.d
    @xh.m
    public static final h0 V3() {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[0], null, changeQuickRedirect, true, 23742, new Class[0], h0.class);
        return patchProxyResultProxy.isSupported ? (h0) patchProxyResultProxy.result : f78943i.a();
    }

    private final void W3() {
        if (PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 23737, new Class[0], Void.TYPE).isSupported) {
            return;
        }
        c8 c8Var = this.f78946e;
        if (c8Var == null) {
            kotlin.jvm.internal.f0.S("binding");
            c8Var = null;
        }
        c8Var.b().setBackgroundResource(R.drawable.login_gradient_bg);
        c8Var.f109210e.setColorFilter(-1);
        c8Var.f109212g.setTextColor(-1);
        c8Var.f109213h.setTextColor(com.max.xiaoheihe.utils.d.E(R.color.team_chat_text_secondary));
        c8Var.f109211f.setTextColor(com.max.xiaoheihe.utils.d.E(R.color.team_chat_text_secondary));
        BaseBottomButton baseBottomButton = c8Var.f109207b;
        baseBottomButton.getVg_button().setBackground(com.max.hbutils.utils.q.o(baseBottomButton.getContext(), R.color.heybox_voice_btn_default, 5.0f));
        baseBottomButton.setTextColor(-1);
        baseBottomButton.setIconColor(-1);
        c8Var.f109209d.setColorFilter(-1);
        c8Var.f109208c.setBackgroundResource(R.drawable.heyboxchat_cb_green_bg);
        c8Var.f109214i.setTextColor(com.max.xiaoheihe.utils.d.E(R.color.text_secondary_1_not_change_color));
        Dialog dialog = getDialog();
        Window window = dialog != null ? dialog.getWindow() : null;
        if (window == null) {
            return;
        }
        window.setNavigationBarColor(com.max.xiaoheihe.utils.d.E(R.color.heyboxchat_login_bg_end_color));
    }

    private final void Z3() {
        if (PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 23739, new Class[0], Void.TYPE).isSupported || !isActive() || getContext() == null) {
            return;
        }
        if (this.f78949h == null) {
            Context contextRequireContext = requireContext();
            kotlin.jvm.internal.f0.o(contextRequireContext, "requireContext()");
            this.f78949h = new LoadingDialog(contextRequireContext);
        }
        LoadingDialog loadingDialog = this.f78949h;
        if (loadingDialog != null) {
            loadingDialog.r();
        }
    }

    private final void a4(String str, String str2, Integer num) {
        if (PatchProxy.proxy(new Object[]{str, str2, num}, this, changeQuickRedirect, false, 23738, new Class[]{String.class, String.class, Integer.class}, Void.TYPE).isSupported) {
            return;
        }
        JsonObject jsonObject = new JsonObject();
        jsonObject.addProperty(com.max.hbcache.c.L0, str);
        jsonObject.addProperty("code", num);
        jsonObject.addProperty("action", str2);
        com.max.hbcommon.analytics.d.d("3", lb.d.f131169h, null, jsonObject);
    }

    @Override // com.max.hbcommon.base.c
    public boolean L3() {
        return true;
    }

    @dl.e
    public final PreVerifyResult R3() {
        return this.f78947f;
    }

    @dl.d
    public final i0 S3() {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 23731, new Class[0], i0.class);
        if (patchProxyResultProxy.isSupported) {
            return (i0) patchProxyResultProxy.result;
        }
        i0 i0Var = this.f78948g;
        if (i0Var != null) {
            return i0Var;
        }
        kotlin.jvm.internal.f0.S("mobLoginListener");
        return null;
    }

    public final void X3(@dl.e PreVerifyResult preVerifyResult) {
        this.f78947f = preVerifyResult;
    }

    public final void Y3(@dl.d i0 i0Var) {
        if (PatchProxy.proxy(new Object[]{i0Var}, this, changeQuickRedirect, false, 23732, new Class[]{i0.class}, Void.TYPE).isSupported) {
            return;
        }
        kotlin.jvm.internal.f0.p(i0Var, "<set-?>");
        this.f78948g = i0Var;
    }

    @Override // androidx.fragment.app.j, androidx.fragment.app.Fragment
    public void onAttach(@dl.d Context context) throws Exception {
        if (PatchProxy.proxy(new Object[]{context}, this, changeQuickRedirect, false, 23733, new Class[]{Context.class}, Void.TYPE).isSupported) {
            return;
        }
        kotlin.jvm.internal.f0.p(context, "context");
        super.onAttach(context);
        if (context instanceof i0) {
            Y3((i0) context);
            return;
        }
        if (getParentFragment() instanceof i0) {
            androidx.activity.result.b parentFragment = getParentFragment();
            kotlin.jvm.internal.f0.n(parentFragment, "null cannot be cast to non-null type com.max.xiaoheihe.module.account.MobLoginListener");
            Y3((i0) parentFragment);
        } else {
            if (!(getActivity() instanceof i0)) {
                throw new Exception("parent must be MobLoginListener");
            }
            LayoutInflater.Factory activity = getActivity();
            kotlin.jvm.internal.f0.n(activity, "null cannot be cast to non-null type com.max.xiaoheihe.module.account.MobLoginListener");
            Y3((i0) activity);
        }
    }

    @Override // androidx.fragment.app.Fragment
    @dl.e
    public View onCreateView(@dl.d LayoutInflater inflater, @dl.e ViewGroup viewGroup, @dl.e Bundle bundle) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{inflater, viewGroup, bundle}, this, changeQuickRedirect, false, 23734, new Class[]{LayoutInflater.class, ViewGroup.class, Bundle.class}, View.class);
        if (patchProxyResultProxy.isSupported) {
            return (View) patchProxyResultProxy.result;
        }
        kotlin.jvm.internal.f0.p(inflater, "inflater");
        c8 c8VarC = c8.c(inflater);
        kotlin.jvm.internal.f0.o(c8VarC, "inflate(inflater)");
        this.f78946e = c8VarC;
        if (c8VarC == null) {
            kotlin.jvm.internal.f0.S("binding");
            c8VarC = null;
        }
        return c8VarC.b();
    }

    @Override // androidx.fragment.app.Fragment
    public void onDestroy() {
        if (PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 23741, new Class[0], Void.TYPE).isSupported) {
            return;
        }
        super.onDestroy();
        T3();
    }

    @Override // com.max.hbcommon.base.c, androidx.fragment.app.Fragment
    public void onViewCreated(@dl.d View view, @dl.e Bundle bundle) {
        Window window;
        if (PatchProxy.proxy(new Object[]{view, bundle}, this, changeQuickRedirect, false, 23735, new Class[]{View.class, Bundle.class}, Void.TYPE).isSupported) {
            return;
        }
        kotlin.jvm.internal.f0.p(view, "view");
        super.onViewCreated(view, bundle);
        Dialog dialog = getDialog();
        WindowManager.LayoutParams attributes = (dialog == null || (window = dialog.getWindow()) == null) ? null : window.getAttributes();
        if (attributes != null) {
            attributes.windowAnimations = R.style.login_window_in_out;
        }
        if (this.f78947f != null) {
            U3();
        }
    }
}
