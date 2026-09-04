package com.max.xiaoheihe.module.game.mobilelicense;

import android.annotation.SuppressLint;
import android.app.Activity;
import android.app.Dialog;
import android.content.Context;
import android.content.Intent;
import android.text.SpannableString;
import android.text.method.LinkMovementMethod;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.CheckBox;
import android.widget.CompoundButton;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.TextView;
import com.max.hbcommon.base.BaseActivity;
import com.max.hbutils.bean.Result;
import com.max.hbutils.utils.ViewUtils;
import com.max.xiaoheihe.R;
import com.max.xiaoheihe.bean.account.User;
import com.max.xiaoheihe.bean.account.VerifyInfoObj;
import com.max.xiaoheihe.module.account.AliVerifyDialogActivity;
import com.max.xiaoheihe.module.webview.WebActionActivity;
import com.max.xiaoheihe.utils.i0;
import com.max.xiaoheihe.utils.l0;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import kotlin.b2;
import kotlin.jvm.internal.f0;

/* JADX INFO: compiled from: LicenseUtils.kt */
/* JADX INFO: loaded from: classes11.dex */
public final class a {
    public static ChangeQuickRedirect changeQuickRedirect;

    /* JADX INFO: renamed from: com.max.xiaoheihe.module.game.mobilelicense.a$a, reason: collision with other inner class name */
    /* JADX INFO: compiled from: LicenseUtils.kt */
    public static final class C0802a extends com.max.hbcommon.network.d<Result<VerifyInfoObj>> {
        public static ChangeQuickRedirect changeQuickRedirect;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ Dialog f87824b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ l0.g f87825c;

        C0802a(Dialog dialog, l0.g gVar) {
            this.f87824b = dialog;
            this.f87825c = gVar;
        }

        public void onNext(@dl.d Result<VerifyInfoObj> result) {
            Activity activityA;
            if (PatchProxy.proxy(new Object[]{result}, this, changeQuickRedirect, false, 37902, new Class[]{Result.class}, Void.TYPE).isSupported) {
                return;
            }
            f0.p(result, "result");
            VerifyInfoObj result2 = result.getResult();
            if (!com.max.hbcommon.utils.c.u(result2 != null ? result2.getId_card() : null)) {
                VerifyInfoObj result3 = result.getResult();
                if (!com.max.hbcommon.utils.c.u(result3 != null ? result3.getName() : null)) {
                    com.max.hbutils.utils.e eVarB = com.max.hbutils.utils.e.b();
                    if (eVarB == null || (activityA = eVarB.a()) == null) {
                        return;
                    }
                    Activity activity = true ^ activityA.isFinishing() ? activityA : null;
                    if (activity != null) {
                        AliVerifyDialogActivity.a aVar = AliVerifyDialogActivity.f77459i;
                        VerifyInfoObj result4 = result.getResult();
                        VerifyInfoObj verifyInfoObj = result4;
                        verifyInfoObj.setGoto_certify_manager(Boolean.TRUE);
                        b2 b2Var = b2.f124493a;
                        f0.o(result4, "result.result.apply {\n  …                        }");
                        activity.startActivity(aVar.a(activity, verifyInfoObj));
                        return;
                    }
                    return;
                }
            }
            User userI = i0.i();
            userI.setCertificated(true);
            i0.z(userI);
            Dialog dialog = this.f87824b;
            if (dialog != null) {
                if (dialog.isShowing()) {
                    this.f87824b.dismiss();
                }
                if (com.max.hbcommon.utils.c.u(result.getMsg())) {
                    com.max.hbutils.utils.c.f(com.max.xiaoheihe.utils.d.n0(R.string.success));
                } else {
                    com.max.hbutils.utils.c.f(result.getMsg());
                }
                l0.g gVar = this.f87825c;
                if (gVar != null) {
                    gVar.a();
                }
            }
        }

        @Override // com.max.hbcommon.network.d, io.reactivex.g0
        public /* bridge */ /* synthetic */ void onNext(Object obj) {
            if (PatchProxy.proxy(new Object[]{obj}, this, changeQuickRedirect, false, 37903, new Class[]{Object.class}, Void.TYPE).isSupported) {
                return;
            }
            onNext((Result<VerifyInfoObj>) obj);
        }
    }

    /* JADX INFO: compiled from: LicenseUtils.kt */
    public static final class b implements View.OnClickListener {
        public static ChangeQuickRedirect changeQuickRedirect;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ CheckBox f87826b;

        b(CheckBox checkBox) {
            this.f87826b = checkBox;
        }

        @Override // android.view.View.OnClickListener
        public final void onClick(View view) {
            if (PatchProxy.proxy(new Object[]{view}, this, changeQuickRedirect, false, 37904, new Class[]{View.class}, Void.TYPE).isSupported) {
                return;
            }
            CheckBox checkBox = this.f87826b;
            checkBox.setChecked(true ^ checkBox.isChecked());
        }
    }

    /* JADX INFO: compiled from: LicenseUtils.kt */
    public static final class c implements CompoundButton.OnCheckedChangeListener {
        public static ChangeQuickRedirect changeQuickRedirect;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ TextView f87827b;

        c(TextView textView) {
            this.f87827b = textView;
        }

        @Override // android.widget.CompoundButton.OnCheckedChangeListener
        public final void onCheckedChanged(CompoundButton compoundButton, boolean z10) {
            if (PatchProxy.proxy(new Object[]{compoundButton, new Byte(z10 ? (byte) 1 : (byte) 0)}, this, changeQuickRedirect, false, 37905, new Class[]{CompoundButton.class, Boolean.TYPE}, Void.TYPE).isSupported) {
                return;
            }
            this.f87827b.setEnabled(z10);
        }
    }

    /* JADX INFO: compiled from: LicenseUtils.kt */
    public static final class d extends com.max.hbcustomview.spans.d {
        public static ChangeQuickRedirect changeQuickRedirect;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        final /* synthetic */ BaseActivity f87828d;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        d(BaseActivity baseActivity, int i10) {
            super(i10);
            this.f87828d = baseActivity;
        }

        @Override // android.text.style.ClickableSpan
        public void onClick(@dl.d View arg0) {
            if (PatchProxy.proxy(new Object[]{arg0}, this, changeQuickRedirect, false, 37906, new Class[]{View.class}, Void.TYPE).isSupported) {
                return;
            }
            f0.p(arg0, "arg0");
            Intent intent = new Intent(this.f87828d, (Class<?>) WebActionActivity.class);
            intent.putExtra("title", "用户协议");
            intent.putExtra("pageurl", lb.a.D1);
            this.f87828d.startActivity(intent);
        }
    }

    /* JADX INFO: compiled from: LicenseUtils.kt */
    public static final class e extends com.max.hbcustomview.spans.d {
        public static ChangeQuickRedirect changeQuickRedirect;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        final /* synthetic */ BaseActivity f87829d;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        e(BaseActivity baseActivity, int i10) {
            super(i10);
            this.f87829d = baseActivity;
        }

        @Override // android.text.style.ClickableSpan
        public void onClick(@dl.d View arg0) {
            if (PatchProxy.proxy(new Object[]{arg0}, this, changeQuickRedirect, false, 37907, new Class[]{View.class}, Void.TYPE).isSupported) {
                return;
            }
            f0.p(arg0, "arg0");
            Intent intent = new Intent(this.f87829d, (Class<?>) WebActionActivity.class);
            intent.putExtra("title", "隐私政策");
            intent.putExtra("pageurl", lb.a.E1);
            this.f87829d.startActivity(intent);
        }
    }

    /* JADX INFO: compiled from: LicenseUtils.kt */
    public static final class f implements View.OnClickListener {
        public static ChangeQuickRedirect changeQuickRedirect;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ BaseActivity f87830b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ EditText f87831c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        final /* synthetic */ EditText f87832d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        final /* synthetic */ Dialog f87833e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        final /* synthetic */ l0.g f87834f;

        f(BaseActivity baseActivity, EditText editText, EditText editText2, Dialog dialog, l0.g gVar) {
            this.f87830b = baseActivity;
            this.f87831c = editText;
            this.f87832d = editText2;
            this.f87833e = dialog;
            this.f87834f = gVar;
        }

        @Override // android.view.View.OnClickListener
        public final void onClick(View view) {
            if (PatchProxy.proxy(new Object[]{view}, this, changeQuickRedirect, false, 37908, new Class[]{View.class}, Void.TYPE).isSupported) {
                return;
            }
            BaseActivity baseActivity = this.f87830b;
            f0.n(baseActivity, "null cannot be cast to non-null type android.app.Activity");
            if (com.max.hbcommon.utils.c.g(baseActivity, this.f87831c, "姓名不能为空") || com.max.hbcommon.utils.c.g(this.f87830b, this.f87832d, "证件号不能为空")) {
                return;
            }
            a.a(this.f87833e, this.f87832d.getText().toString(), this.f87831c.getText().toString(), "1", null, this.f87834f);
        }
    }

    /* JADX INFO: compiled from: LicenseUtils.kt */
    public static final class g implements View.OnClickListener {
        public static ChangeQuickRedirect changeQuickRedirect;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ BaseActivity f87835b;

        g(BaseActivity baseActivity) {
            this.f87835b = baseActivity;
        }

        @Override // android.view.View.OnClickListener
        public final void onClick(View view) {
            if (PatchProxy.proxy(new Object[]{view}, this, changeQuickRedirect, false, 37909, new Class[]{View.class}, Void.TYPE).isSupported) {
                return;
            }
            Intent intent = new Intent(this.f87835b, (Class<?>) WebActionActivity.class);
            intent.putExtra("title", "说明");
            intent.putExtra("pageurl", lb.a.D3);
            this.f87835b.startActivity(intent);
        }
    }

    /* JADX INFO: compiled from: LicenseUtils.kt */
    public static final class h implements View.OnClickListener {
        public static ChangeQuickRedirect changeQuickRedirect;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ Dialog f87836b;

        h(Dialog dialog) {
            this.f87836b = dialog;
        }

        @Override // android.view.View.OnClickListener
        public final void onClick(View view) {
            Dialog dialog;
            if (PatchProxy.proxy(new Object[]{view}, this, changeQuickRedirect, false, 37910, new Class[]{View.class}, Void.TYPE).isSupported || (dialog = this.f87836b) == null || !dialog.isShowing()) {
                return;
            }
            this.f87836b.dismiss();
        }
    }

    /* JADX INFO: compiled from: LicenseUtils.kt */
    public static final class i extends com.max.hbcommon.component.i {
        public static ChangeQuickRedirect changeQuickRedirect;

        i(BaseActivity baseActivity, View view) {
            super((Context) baseActivity, true, view);
        }

        @Override // android.app.Dialog, android.content.DialogInterface
        public void cancel() {
            if (PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 37911, new Class[0], Void.TYPE).isSupported) {
                return;
            }
            super.cancel();
        }
    }

    @SuppressLint({"CheckResult"})
    public static final void a(@dl.e Dialog dialog, @dl.d String idcard, @dl.d String name, @dl.e String str, @dl.e String str2, @dl.e l0.g gVar) {
        if (PatchProxy.proxy(new Object[]{dialog, idcard, name, str, str2, gVar}, null, changeQuickRedirect, true, 37901, new Class[]{Dialog.class, String.class, String.class, String.class, String.class, l0.g.class}, Void.TYPE).isSupported) {
            return;
        }
        f0.p(idcard, "idcard");
        f0.p(name, "name");
        com.max.xiaoheihe.network.i.a().A8(idcard, name, str, str2).I5(io.reactivex.schedulers.b.d()).a4(io.reactivex.android.schedulers.a.c()).J5(new C0802a(dialog, gVar));
    }

    public static final void b(@dl.d BaseActivity mContext, @dl.d l0.g callback) {
        if (PatchProxy.proxy(new Object[]{mContext, callback}, null, changeQuickRedirect, true, 37900, new Class[]{BaseActivity.class, l0.g.class}, Void.TYPE).isSupported) {
            return;
        }
        f0.p(mContext, "mContext");
        f0.p(callback, "callback");
        View viewInflate = LayoutInflater.from(mContext).inflate(R.layout.dialog_real_name_auth, (ViewGroup) null, false);
        viewInflate.setElevation(ViewUtils.f(mContext, 2.0f));
        i iVar = new i(mContext, viewInflate);
        View viewFindViewById = viewInflate.findViewById(R.id.vg_bg);
        f0.n(viewFindViewById, "null cannot be cast to non-null type android.view.View");
        View viewFindViewById2 = viewInflate.findViewById(R.id.iv_avatar);
        f0.n(viewFindViewById2, "null cannot be cast to non-null type android.widget.ImageView");
        View viewFindViewById3 = viewInflate.findViewById(R.id.et_name);
        f0.n(viewFindViewById3, "null cannot be cast to non-null type android.widget.EditText");
        EditText editText = (EditText) viewFindViewById3;
        View viewFindViewById4 = viewInflate.findViewById(R.id.et_id_card);
        f0.n(viewFindViewById4, "null cannot be cast to non-null type android.widget.EditText");
        EditText editText2 = (EditText) viewFindViewById4;
        View viewFindViewById5 = viewInflate.findViewById(R.id.vg_checkbox);
        f0.n(viewFindViewById5, "null cannot be cast to non-null type android.view.ViewGroup");
        View viewFindViewById6 = viewInflate.findViewById(R.id.cb_agreement);
        f0.n(viewFindViewById6, "null cannot be cast to non-null type android.widget.CheckBox");
        CheckBox checkBox = (CheckBox) viewFindViewById6;
        View viewFindViewById7 = viewInflate.findViewById(R.id.tv_confirm);
        f0.n(viewFindViewById7, "null cannot be cast to non-null type android.widget.TextView");
        TextView textView = (TextView) viewFindViewById7;
        View viewFindViewById8 = viewInflate.findViewById(R.id.tv_faq);
        f0.n(viewFindViewById8, "null cannot be cast to non-null type android.widget.TextView");
        TextView textView2 = (TextView) viewFindViewById8;
        View viewFindViewById9 = viewInflate.findViewById(R.id.tv_auth_desc);
        f0.n(viewFindViewById9, "null cannot be cast to non-null type android.widget.TextView");
        View viewFindViewById10 = viewInflate.findViewById(R.id.tv_agreement);
        f0.n(viewFindViewById10, "null cannot be cast to non-null type android.widget.TextView");
        TextView textView3 = (TextView) viewFindViewById10;
        ((ViewGroup) viewFindViewById5).setOnClickListener(new b(checkBox));
        checkBox.setOnCheckedChangeListener(new c(textView));
        ((TextView) viewFindViewById9).setText("根据相关政策规定，下载付费游戏前需要进行实名认证（若您已满18周岁,可不受防沉迷影响）。");
        SpannableString spannableString = new SpannableString("我已阅读并同意《用户协议》、《隐私政策》");
        spannableString.setSpan(new d(mContext, mContext.getResources().getColor(R.color.click_blue)), 7, 13, 33);
        spannableString.setSpan(new e(mContext, mContext.getResources().getColor(R.color.click_blue)), 14, 20, 33);
        textView3.setText(spannableString);
        textView3.setMovementMethod(LinkMovementMethod.getInstance());
        com.max.hbimage.b.I(i0.i().getAccount_detail().getAvartar(), (ImageView) viewFindViewById2, R.drawable.common_default_avatar_40x40);
        textView.setOnClickListener(new f(mContext, editText, editText2, iVar, callback));
        textView2.setVisibility(0);
        textView2.setOnClickListener(new g(mContext));
        iVar.setContentView(viewInflate);
        iVar.setCancelable(true);
        viewFindViewById.setOnClickListener(new h(iVar));
        iVar.show();
    }
}
