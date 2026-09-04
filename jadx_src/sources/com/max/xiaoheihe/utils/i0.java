package com.max.xiaoheihe.utils;

import android.app.Activity;
import android.app.Dialog;
import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.text.SpannableString;
import android.text.TextUtils;
import android.text.method.LinkMovementMethod;
import android.text.style.ForegroundColorSpan;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import android.widget.CheckBox;
import android.widget.CompoundButton;
import android.widget.EditText;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.view.g3;
import androidx.core.view.j1;
import androidx.core.view.n3;
import androidx.core.view.z0;
import com.max.hbcommon.base.BaseActivity;
import com.max.hbutils.bean.Result;
import com.max.hbutils.utils.ViewUtils;
import com.max.xiaoheihe.R;
import com.max.xiaoheihe.app.HeyBoxApplication;
import com.max.xiaoheihe.bean.account.AccountDetailObj;
import com.max.xiaoheihe.bean.account.HomeDataObj;
import com.max.xiaoheihe.bean.account.SteamIdInfoObj;
import com.max.xiaoheihe.bean.account.User;
import com.max.xiaoheihe.bean.chat.GroupUserObj;
import com.max.xiaoheihe.module.account.AccountManagerActivity;
import com.max.xiaoheihe.module.account.LoginDialogActivity;
import com.max.xiaoheihe.module.account.UpdateAccountActivity;
import com.max.xiaoheihe.module.game.r1;
import com.max.xiaoheihe.module.webview.NativeWebActionActivity;
import com.max.xiaoheihe.module.webview.WebActionActivity;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.PatchProxyResult;

/* JADX INFO: compiled from: UserManager.java */
/* JADX INFO: loaded from: classes13.dex */
public class i0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final String f95403a = "/mall/award";

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final String f95404b = "user_certification_award_shown_time";

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final String f95405c = "user_profile_editor_settings";
    public static ChangeQuickRedirect changeQuickRedirect;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private static User f95406d;

    /* JADX INFO: compiled from: UserManager.java */
    public class a implements View.OnClickListener {
        public static ChangeQuickRedirect changeQuickRedirect;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ Dialog f95407b;

        a(Dialog dialog) {
            this.f95407b = dialog;
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            Dialog dialog;
            if (PatchProxy.proxy(new Object[]{view}, this, changeQuickRedirect, false, 48933, new Class[]{View.class}, Void.TYPE).isSupported || (dialog = this.f95407b) == null || !dialog.isShowing()) {
                return;
            }
            this.f95407b.dismiss();
        }
    }

    /* JADX INFO: compiled from: UserManager.java */
    public class b extends com.max.hbcommon.network.d<Result> {
        public static ChangeQuickRedirect changeQuickRedirect;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ BaseActivity f95408b;

        b(BaseActivity baseActivity) {
            this.f95408b = baseActivity;
        }

        public void onNext(Result result) {
            if (!PatchProxy.proxy(new Object[]{result}, this, changeQuickRedirect, false, 48934, new Class[]{Result.class}, Void.TYPE).isSupported && this.f95408b.isActive()) {
                boolean zBooleanValue = ((Boolean) result.getKeyMap().get("certificated")).booleanValue();
                User userI = i0.i();
                userI.setCertificated(zBooleanValue);
                i0.z(userI);
                String str = result.getKeyMap().get("award_msg");
                String str2 = result.getKeyMap().get("award_img");
                if (com.max.hbcommon.utils.c.u(str) || com.max.hbcommon.utils.c.u(str2)) {
                    return;
                }
                i0.D(this.f95408b, str, str2);
            }
        }

        @Override // com.max.hbcommon.network.d, io.reactivex.g0
        public /* bridge */ /* synthetic */ void onNext(Object obj) {
            if (PatchProxy.proxy(new Object[]{obj}, this, changeQuickRedirect, false, 48935, new Class[]{Object.class}, Void.TYPE).isSupported) {
                return;
            }
            onNext((Result) obj);
        }
    }

    /* JADX INFO: compiled from: UserManager.java */
    public class c implements View.OnClickListener {
        public static ChangeQuickRedirect changeQuickRedirect;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ BaseActivity f95409b;

        c(BaseActivity baseActivity) {
            this.f95409b = baseActivity;
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            if (PatchProxy.proxy(new Object[]{view}, this, changeQuickRedirect, false, 48936, new Class[]{View.class}, Void.TYPE).isSupported) {
                return;
            }
            Intent intent = new Intent(this.f95409b, (Class<?>) NativeWebActionActivity.class);
            intent.putExtra("title", "帮助");
            intent.putExtra("pageurl", lb.a.f130952d4);
            this.f95409b.startActivity(intent);
        }
    }

    /* JADX INFO: compiled from: UserManager.java */
    public class d implements DialogInterface.OnClickListener {
        public static ChangeQuickRedirect changeQuickRedirect;

        d() {
        }

        @Override // android.content.DialogInterface.OnClickListener
        public void onClick(DialogInterface dialogInterface, int i10) {
            if (PatchProxy.proxy(new Object[]{dialogInterface, new Integer(i10)}, this, changeQuickRedirect, false, 48937, new Class[]{DialogInterface.class, Integer.TYPE}, Void.TYPE).isSupported) {
                return;
            }
            i0.B(i0.f95403a, null);
            dialogInterface.dismiss();
        }
    }

    /* JADX INFO: compiled from: UserManager.java */
    public class e implements com.max.xiaoheihe.view.m {
        public static ChangeQuickRedirect changeQuickRedirect;

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ Context f95410a;

        e(Context context) {
            this.f95410a = context;
        }

        @Override // com.max.xiaoheihe.view.m
        public void a(Dialog dialog) {
            if (PatchProxy.proxy(new Object[]{dialog}, this, changeQuickRedirect, false, 48932, new Class[]{Dialog.class}, Void.TYPE).isSupported) {
                return;
            }
            com.max.xiaoheihe.utils.d.I1(this.f95410a);
            dialog.dismiss();
        }

        @Override // com.max.xiaoheihe.view.m
        public void b(Dialog dialog) {
            if (PatchProxy.proxy(new Object[]{dialog}, this, changeQuickRedirect, false, 48931, new Class[]{Dialog.class}, Void.TYPE).isSupported) {
                return;
            }
            dialog.dismiss();
        }
    }

    /* JADX INFO: compiled from: UserManager.java */
    public class f implements com.max.xiaoheihe.view.m {
        public static ChangeQuickRedirect changeQuickRedirect;

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ Context f95411a;

        f(Context context) {
            this.f95411a = context;
        }

        @Override // com.max.xiaoheihe.view.m
        public void a(Dialog dialog) {
            if (PatchProxy.proxy(new Object[]{dialog}, this, changeQuickRedirect, false, 48939, new Class[]{Dialog.class}, Void.TYPE).isSupported) {
                return;
            }
            Context context = this.f95411a;
            context.startActivity(UpdateAccountActivity.e2(context, UpdateAccountActivity.T));
            dialog.dismiss();
        }

        @Override // com.max.xiaoheihe.view.m
        public void b(Dialog dialog) {
            if (PatchProxy.proxy(new Object[]{dialog}, this, changeQuickRedirect, false, 48938, new Class[]{Dialog.class}, Void.TYPE).isSupported) {
                return;
            }
            dialog.dismiss();
        }
    }

    /* JADX INFO: compiled from: UserManager.java */
    public class g extends com.max.hbcommon.network.d<Result<HomeDataObj>> {
        public static ChangeQuickRedirect changeQuickRedirect;

        g() {
        }

        public void onNext(Result<HomeDataObj> result) {
            if (PatchProxy.proxy(new Object[]{result}, this, changeQuickRedirect, false, 48940, new Class[]{Result.class}, Void.TYPE).isSupported || result == null || result.getResult() == null || result.getResult().getAccount_detail() == null) {
                return;
            }
            User userI = i0.i();
            userI.setAccount_detail(result.getResult().getAccount_detail());
            i0.z(userI);
        }

        @Override // com.max.hbcommon.network.d, io.reactivex.g0
        public /* bridge */ /* synthetic */ void onNext(Object obj) {
            if (PatchProxy.proxy(new Object[]{obj}, this, changeQuickRedirect, false, 48941, new Class[]{Object.class}, Void.TYPE).isSupported) {
                return;
            }
            onNext((Result<HomeDataObj>) obj);
        }
    }

    /* JADX INFO: compiled from: UserManager.java */
    public class h extends com.max.hbcommon.component.i {
        h(Context context, boolean z10, View view) {
            super(context, z10, view);
        }
    }

    /* JADX INFO: compiled from: UserManager.java */
    public class i implements View.OnClickListener {
        public static ChangeQuickRedirect changeQuickRedirect;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ CheckBox f95412b;

        i(CheckBox checkBox) {
            this.f95412b = checkBox;
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            if (PatchProxy.proxy(new Object[]{view}, this, changeQuickRedirect, false, 48942, new Class[]{View.class}, Void.TYPE).isSupported) {
                return;
            }
            CheckBox checkBox = this.f95412b;
            checkBox.setChecked(true ^ checkBox.isChecked());
        }
    }

    /* JADX INFO: compiled from: UserManager.java */
    public class j implements CompoundButton.OnCheckedChangeListener {
        public static ChangeQuickRedirect changeQuickRedirect;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ TextView f95413b;

        j(TextView textView) {
            this.f95413b = textView;
        }

        @Override // android.widget.CompoundButton.OnCheckedChangeListener
        public void onCheckedChanged(CompoundButton compoundButton, boolean z10) {
            if (PatchProxy.proxy(new Object[]{compoundButton, new Byte(z10 ? (byte) 1 : (byte) 0)}, this, changeQuickRedirect, false, 48943, new Class[]{CompoundButton.class, Boolean.TYPE}, Void.TYPE).isSupported) {
                return;
            }
            this.f95413b.setEnabled(z10);
        }
    }

    /* JADX INFO: compiled from: UserManager.java */
    public class k extends com.max.hbcustomview.spans.d {
        public static ChangeQuickRedirect changeQuickRedirect;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        final /* synthetic */ Activity f95414d;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        k(int i10, Activity activity) {
            super(i10);
            this.f95414d = activity;
        }

        @Override // android.text.style.ClickableSpan
        public void onClick(View view) {
            if (PatchProxy.proxy(new Object[]{view}, this, changeQuickRedirect, false, 48944, new Class[]{View.class}, Void.TYPE).isSupported) {
                return;
            }
            Intent intent = new Intent(this.f95414d, (Class<?>) WebActionActivity.class);
            intent.putExtra("title", "用户协议");
            intent.putExtra("pageurl", lb.a.D1);
            this.f95414d.startActivity(intent);
        }
    }

    /* JADX INFO: compiled from: UserManager.java */
    public class l extends com.max.hbcustomview.spans.d {
        public static ChangeQuickRedirect changeQuickRedirect;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        final /* synthetic */ Activity f95415d;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        l(int i10, Activity activity) {
            super(i10);
            this.f95415d = activity;
        }

        @Override // android.text.style.ClickableSpan
        public void onClick(View view) {
            if (PatchProxy.proxy(new Object[]{view}, this, changeQuickRedirect, false, 48945, new Class[]{View.class}, Void.TYPE).isSupported) {
                return;
            }
            Intent intent = new Intent(this.f95415d, (Class<?>) WebActionActivity.class);
            intent.putExtra("title", "隐私政策");
            intent.putExtra("pageurl", lb.a.E1);
            this.f95415d.startActivity(intent);
        }
    }

    /* JADX INFO: compiled from: UserManager.java */
    public class m implements View.OnClickListener {
        public static ChangeQuickRedirect changeQuickRedirect;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ Activity f95416b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ EditText f95417c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        final /* synthetic */ EditText f95418d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        final /* synthetic */ Dialog f95419e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        final /* synthetic */ String f95420f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        final /* synthetic */ l0.g f95421g;

        m(Activity activity, EditText editText, EditText editText2, Dialog dialog, String str, l0.g gVar) {
            this.f95416b = activity;
            this.f95417c = editText;
            this.f95418d = editText2;
            this.f95419e = dialog;
            this.f95420f = str;
            this.f95421g = gVar;
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            if (PatchProxy.proxy(new Object[]{view}, this, changeQuickRedirect, false, 48946, new Class[]{View.class}, Void.TYPE).isSupported || com.max.hbcommon.utils.c.g(this.f95416b, this.f95417c, "姓名不能为空") || com.max.hbcommon.utils.c.g(this.f95416b, this.f95418d, "证件号不能为空")) {
                return;
            }
            com.max.xiaoheihe.module.game.mobilelicense.a.a(this.f95419e, this.f95418d.getText().toString(), this.f95417c.getText().toString(), null, this.f95420f, this.f95421g);
        }
    }

    public static void A() {
        if (PatchProxy.proxy(new Object[0], null, changeQuickRedirect, true, 48910, new Class[0], Void.TYPE).isSupported) {
            return;
        }
        HeyBoxApplication heyBoxApplicationC = HeyBoxApplication.C();
        Intent intent = new Intent(heyBoxApplicationC, (Class<?>) LoginDialogActivity.class);
        intent.addFlags(268435456);
        heyBoxApplicationC.startActivity(intent);
    }

    public static void B(final String str, final l0.g gVar) {
        if (PatchProxy.proxy(new Object[]{str, gVar}, null, changeQuickRedirect, true, 48920, new Class[]{String.class, l0.g.class}, Void.TYPE).isSupported) {
            return;
        }
        try {
            AppCompatActivity appCompatActivity = (AppCompatActivity) HeyBoxApplication.C().E();
            if (appCompatActivity != null && !appCompatActivity.isFinishing()) {
                SpannableString spannableString = new SpannableString(com.max.xiaoheihe.utils.d.n0(R.string.real_name_tips));
                spannableString.setSpan(new ForegroundColorSpan(com.max.xiaoheihe.utils.d.E(R.color.text_primary_1_color)), 78, 81, 33);
                spannableString.setSpan(new ForegroundColorSpan(com.max.xiaoheihe.utils.d.E(R.color.text_primary_1_color)), 82, 89, 33);
                new com.max.hbcommon.component.bottomsheet.a().z("实名认证").n(R.drawable.bottom_sheets_broken_logo_80x80).k(true).x(false).l(new SpannableString(spannableString)).v("去认证", true, new View.OnClickListener() { // from class: com.max.xiaoheihe.utils.f0
                    @Override // android.view.View.OnClickListener
                    public final void onClick(View view) {
                        i0.u(str, gVar, view);
                    }
                }).p("暂不认证", true, new View.OnClickListener() { // from class: com.max.xiaoheihe.utils.g0
                    @Override // android.view.View.OnClickListener
                    public final void onClick(View view) {
                        i0.v(view);
                    }
                }).a().M3(appCompatActivity.getSupportFragmentManager(), "login_steam");
            }
        } catch (Throwable th2) {
            com.max.heybox.hblog.g.G("showNameVerifyDialog error: " + th2.getMessage());
        }
    }

    public static void C(String str, l0.g gVar) {
        Activity activityE;
        boolean z10 = false;
        if (PatchProxy.proxy(new Object[]{str, gVar}, null, changeQuickRedirect, true, 48921, new Class[]{String.class, l0.g.class}, Void.TYPE).isSupported || (activityE = HeyBoxApplication.C().E()) == null || activityE.isFinishing()) {
            return;
        }
        View viewInflate = LayoutInflater.from(activityE).inflate(R.layout.dialog_real_name_auth, (ViewGroup) null, false);
        viewInflate.setElevation(ViewUtils.f(activityE, 2.0f));
        h hVar = new h(activityE, true, viewInflate);
        final View viewFindViewById = viewInflate.findViewById(R.id.vg_bottom_bar);
        View viewFindViewById2 = viewInflate.findViewById(R.id.vg_bg);
        ImageView imageView = (ImageView) viewInflate.findViewById(R.id.iv_avatar);
        EditText editText = (EditText) viewInflate.findViewById(R.id.et_name);
        EditText editText2 = (EditText) viewInflate.findViewById(R.id.et_id_card);
        ViewGroup viewGroup = (ViewGroup) viewInflate.findViewById(R.id.vg_checkbox);
        CheckBox checkBox = (CheckBox) viewInflate.findViewById(R.id.cb_agreement);
        TextView textView = (TextView) viewInflate.findViewById(R.id.tv_confirm);
        TextView textView2 = (TextView) viewInflate.findViewById(R.id.tv_agreement);
        TextView textView3 = (TextView) viewInflate.findViewById(R.id.tv_tips);
        Window window = hVar.getWindow();
        window.addFlags(16777216);
        g3.c(window, false);
        window.setSoftInputMode(19);
        j1.a2(viewInflate, new z0() { // from class: com.max.xiaoheihe.utils.h0
            @Override // androidx.core.view.z0
            public final n3 a(View view, n3 n3Var) {
                return i0.w(viewFindViewById, view, n3Var);
            }
        });
        viewFindViewById.setOnClickListener(null);
        if (!com.max.hbcommon.utils.c.u(str) && !str.equals(AccountManagerActivity.T)) {
            z10 = true;
        }
        if (z10) {
            textView3.setText("您尚未完成认证，将无法使用该功能，请尽快完成认证！");
        } else {
            textView3.setText("实名信息一经认证则无法修改，可在设置-安全与绑定中查看");
        }
        viewGroup.setOnClickListener(new i(checkBox));
        checkBox.setOnCheckedChangeListener(new j(textView));
        SpannableString spannableString = new SpannableString("我已阅读并同意《用户协议》、《隐私政策》");
        spannableString.setSpan(new k(activityE.getResources().getColor(R.color.click_blue), activityE), 7, 13, 33);
        spannableString.setSpan(new l(activityE.getResources().getColor(R.color.click_blue), activityE), 14, 20, 33);
        textView2.setText(spannableString);
        textView2.setMovementMethod(LinkMovementMethod.getInstance());
        com.max.hbimage.b.I(i().getAccount_detail().getAvartar(), imageView, R.drawable.common_default_avatar_40x40);
        textView.setOnClickListener(new m(activityE, editText, editText2, hVar, str, gVar));
        hVar.setContentView(viewInflate);
        hVar.setCancelable(true);
        viewFindViewById2.setOnClickListener(new a(hVar));
        hVar.show();
    }

    public static void D(BaseActivity baseActivity, String str, String str2) {
        if (PatchProxy.proxy(new Object[]{baseActivity, str, str2}, null, changeQuickRedirect, true, 48923, new Class[]{BaseActivity.class, String.class, String.class}, Void.TYPE).isSupported || !baseActivity.isActive() || baseActivity.isFinishing()) {
            return;
        }
        FrameLayout frameLayout = new FrameLayout(baseActivity);
        frameLayout.setLayoutParams(new ViewGroup.LayoutParams(-1, -2));
        ImageView imageView = new ImageView(baseActivity);
        FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(ViewUtils.f(baseActivity, 315.0f), ViewUtils.f(baseActivity, 146.0f));
        layoutParams.gravity = 17;
        com.max.hbimage.b.L(str2, imageView, R.drawable.common_default_placeholder_375x210);
        frameLayout.setPadding(0, ViewUtils.f(baseActivity, 16.0f), 0, ViewUtils.f(baseActivity, 12.0f));
        frameLayout.addView(imageView, layoutParams);
        com.max.hbcommon.view.a.f fVar = new com.max.hbcommon.view.a.f(baseActivity);
        FrameLayout frameLayout2 = new FrameLayout(baseActivity);
        FrameLayout.LayoutParams layoutParams2 = new FrameLayout.LayoutParams(-2, -2);
        layoutParams2.gravity = 17;
        TextView textView = new TextView(baseActivity);
        frameLayout2.addView(textView, layoutParams2);
        LinearLayout.LayoutParams layoutParams3 = new LinearLayout.LayoutParams(-1, -2);
        layoutParams3.topMargin = ViewUtils.f(baseActivity, 10.0f);
        layoutParams3.bottomMargin = ViewUtils.f(baseActivity, 24.0f);
        layoutParams3.gravity = 1;
        frameLayout2.setLayoutParams(layoutParams3);
        textView.setTextColor(com.max.xiaoheihe.utils.d.E(R.color.text_secondary_1_color));
        textView.setTextSize(1, 12.0f);
        textView.setText("认证须知");
        Drawable drawable = baseActivity.getDrawable(R.drawable.special_right_small_line_24x24);
        drawable.setBounds(0, 0, ViewUtils.f(baseActivity, 12.0f), ViewUtils.f(baseActivity, 12.0f));
        drawable.setColorFilter(com.max.xiaoheihe.utils.d.E(R.color.text_secondary_1_color), PorterDuff.Mode.SRC_ATOP);
        textView.setCompoundDrawables(null, null, drawable, null);
        textView.setCompoundDrawablePadding(ViewUtils.f(baseActivity, 2.0f));
        frameLayout2.setOnClickListener(new c(baseActivity));
        fVar.i(frameLayout2);
        com.max.hbcommon.view.a aVarF = fVar.A(frameLayout).y(com.max.xiaoheihe.utils.d.A() + "邀请您实名认证").l(str).w(true).u("认证领取奖励", new d()).F();
        aVarF.f().setTextColor(com.max.xiaoheihe.utils.d.E(R.color.text_primary_2_color));
        ((ViewGroup.MarginLayoutParams) aVarF.f().getLayoutParams()).topMargin = ViewUtils.f(baseActivity, 9.0f);
        com.max.hbcache.c.z(f95404b, System.currentTimeMillis() + "");
    }

    public static void E() {
        if (!PatchProxy.proxy(new Object[0], null, changeQuickRedirect, true, 48912, new Class[0], Void.TYPE).isSupported && s()) {
            com.max.xiaoheihe.network.i.a().i5().I5(io.reactivex.schedulers.b.d()).a4(io.reactivex.schedulers.b.d()).g(new g());
        }
    }

    public static boolean d(Context context) {
        return true;
    }

    public static boolean e(Context context) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{context}, null, changeQuickRedirect, true, 48909, new Class[]{Context.class}, Boolean.TYPE);
        if (patchProxyResultProxy.isSupported) {
            return ((Boolean) patchProxyResultProxy.result).booleanValue();
        }
        if (s()) {
            return true;
        }
        com.max.xiaoheihe.view.l.D(context, "", com.max.xiaoheihe.utils.d.n0(R.string.need_login_to_use), "去登录", "取消", new e(context));
        return false;
    }

    public static void f(BaseActivity baseActivity) {
        if (PatchProxy.proxy(new Object[]{baseActivity}, null, changeQuickRedirect, true, 48922, new Class[]{BaseActivity.class}, Void.TYPE).isSupported || !s() || i().isCertificated()) {
            return;
        }
        String strJ = com.max.hbcache.c.j(f95404b);
        if (System.currentTimeMillis() - (!TextUtils.isEmpty(strJ) ? Long.parseLong(strJ) : 0L) >= 604800000) {
            baseActivity.V((io.reactivex.disposables.b) com.max.xiaoheihe.network.i.a().Z5(null).I5(io.reactivex.schedulers.b.d()).a4(io.reactivex.android.schedulers.a.c()).J5(new b(baseActivity)));
        }
    }

    public static boolean g(Context context) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{context}, null, changeQuickRedirect, true, 48911, new Class[]{Context.class}, Boolean.TYPE);
        if (patchProxyResultProxy.isSupported) {
            return ((Boolean) patchProxyResultProxy.result).booleanValue();
        }
        if (e(context) && !com.max.hbcommon.utils.c.u(i().getAccount_detail().getUsername()) && !"匿名玩家".equals(i().getAccount_detail().getUsername())) {
            return true;
        }
        E();
        com.max.xiaoheihe.view.l.D(context, "", "请先修改昵称", "修改", "取消", new f(context));
        return false;
    }

    public static void h() {
        if (PatchProxy.proxy(new Object[0], null, changeQuickRedirect, true, 48925, new Class[0], Void.TYPE).isSupported) {
            return;
        }
        com.max.hbcache.c.n("user").edit().clear().apply();
        y(null);
        com.max.hbcache.c.b();
        HeyBoxApplication.C().F();
    }

    public static User i() {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[0], null, changeQuickRedirect, true, 48913, new Class[0], User.class);
        return patchProxyResultProxy.isSupported ? (User) patchProxyResultProxy.result : o();
    }

    public static String j() {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[0], null, changeQuickRedirect, true, 48914, new Class[0], String.class);
        if (patchProxyResultProxy.isSupported) {
            return (String) patchProxyResultProxy.result;
        }
        AccountDetailObj account_detail = i().getAccount_detail();
        return account_detail != null ? account_detail.getUserid() : "-1";
    }

    public static String k() {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[0], null, changeQuickRedirect, true, 48917, new Class[0], String.class);
        if (patchProxyResultProxy.isSupported) {
            return (String) patchProxyResultProxy.result;
        }
        AccountDetailObj account_detail = i().getAccount_detail();
        if (account_detail != null) {
            return account_detail.getUsername();
        }
        return null;
    }

    public static String l(String str, String str2) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{str, str2}, null, changeQuickRedirect, true, 48916, new Class[]{String.class, String.class}, String.class);
        if (patchProxyResultProxy.isSupported) {
            return (String) patchProxyResultProxy.result;
        }
        if (com.max.hbcommon.utils.c.u(str2)) {
            str2 = r1.b0(str);
        }
        User userI = i();
        if (userI == null) {
            return null;
        }
        if (lb.a.J0.equals(str2) && userI.getPubg_account_info() != null && userI.getPubg_account_info().getPlayer_info() != null) {
            return userI.getPubg_account_info().getPlayer_info().getNickname();
        }
        if (lb.a.S0.equals(str2)) {
            return null;
        }
        if (lb.a.K0.equals(str2) && userI.getR6_account_info() != null) {
            return userI.getR6_account_info().getId();
        }
        if (lb.a.L0.equals(str2) && userI.getApex_account_info() != null) {
            return userI.getApex_account_info().getId();
        }
        if (lb.a.M0.equals(str2) && userI.getOw_account_info() != null) {
            return userI.getOw_account_info().getPlayer_id();
        }
        if (lb.a.R0.equals(str2) && userI.getDestiny2_account_info() != null) {
            return userI.getDestiny2_account_info().getPlayer_id();
        }
        if (lb.a.T0.equals(str2) && userI.getCsgob5_account_info() != null) {
            return userI.getCsgob5_account_info().getAccount_id();
        }
        if ("csgo".equals(str2) && userI.getCsgo_account_info() != null) {
            return userI.getCsgo_account_info().getAccount_id();
        }
        if (!lb.a.V0.equals(str2) || userI.getCsgo5e_account_info() == null) {
            return null;
        }
        return userI.getCsgo5e_account_info().getAccount_id();
    }

    public static String m() {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[0], null, changeQuickRedirect, true, 48915, new Class[0], String.class);
        if (patchProxyResultProxy.isSupported) {
            return (String) patchProxyResultProxy.result;
        }
        SteamIdInfoObj steam_id_info = i().getSteam_id_info();
        if (steam_id_info != null) {
            return steam_id_info.getSteamid();
        }
        return null;
    }

    public static GroupUserObj n(String str) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{str}, null, changeQuickRedirect, true, 48928, new Class[]{String.class}, GroupUserObj.class);
        return patchProxyResultProxy.isSupported ? (GroupUserObj) patchProxyResultProxy.result : (GroupUserObj) com.max.hbcache.c.d(com.max.hbcache.c.f66122g, str, GroupUserObj.class);
    }

    public static User o() {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[0], null, changeQuickRedirect, true, 48906, new Class[0], User.class);
        if (patchProxyResultProxy.isSupported) {
            return (User) patchProxyResultProxy.result;
        }
        if (f95406d == null) {
            f95406d = p();
        }
        return f95406d;
    }

    public static User p() {
        User user;
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[0], null, changeQuickRedirect, true, 48926, new Class[0], User.class);
        if (patchProxyResultProxy.isSupported) {
            return (User) patchProxyResultProxy.result;
        }
        String string = com.max.hbcache.c.n("user").getString("user", "");
        if (TextUtils.isEmpty(string) || (user = (User) com.max.hbutils.utils.k.a(string, User.class)) == null) {
            return new User();
        }
        y(user);
        return user;
    }

    public static boolean q(String str) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{str}, null, changeQuickRedirect, true, 48918, new Class[]{String.class}, Boolean.TYPE);
        if (patchProxyResultProxy.isSupported) {
            return ((Boolean) patchProxyResultProxy.result).booleanValue();
        }
        String strJ = j();
        return (strJ == null || "-1".equals(strJ) || !strJ.equals(str)) ? false : true;
    }

    public static boolean r(String str) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{str}, null, changeQuickRedirect, true, 48919, new Class[]{String.class}, Boolean.TYPE);
        if (patchProxyResultProxy.isSupported) {
            return ((Boolean) patchProxyResultProxy.result).booleanValue();
        }
        return (com.max.hbcommon.utils.c.u(str) || "-1".equals(str)) ? false : true;
    }

    public static boolean s() {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[0], null, changeQuickRedirect, true, 48907, new Class[0], Boolean.TYPE);
        return patchProxyResultProxy.isSupported ? ((Boolean) patchProxyResultProxy.result).booleanValue() : o().isLoginFlag();
    }

    public static boolean t() {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[0], null, changeQuickRedirect, true, 48908, new Class[0], Boolean.TYPE);
        return patchProxyResultProxy.isSupported ? ((Boolean) patchProxyResultProxy.result).booleanValue() : com.max.hbcommon.utils.c.x(o().getVisitor_enabled());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ void u(String str, l0.g gVar, View view) {
        if (PatchProxy.proxy(new Object[]{str, gVar, view}, null, changeQuickRedirect, true, 48930, new Class[]{String.class, l0.g.class, View.class}, Void.TYPE).isSupported) {
            return;
        }
        C(str, gVar);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ void v(View view) {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ n3 w(View view, View view2, n3 n3Var) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{view, view2, n3Var}, null, changeQuickRedirect, true, 48929, new Class[]{View.class, View.class, n3.class}, n3.class);
        if (patchProxyResultProxy.isSupported) {
            return (n3) patchProxyResultProxy.result;
        }
        androidx.core.graphics.h0 h0VarF = n3Var.f(n3.m.d());
        androidx.core.graphics.h0 h0VarF2 = n3Var.f(n3.m.i());
        int i10 = h0VarF.f20745d;
        int i11 = h0VarF2.f20745d;
        if (i10 - i11 > 0) {
            view.setPadding(0, 0, 0, i10);
        } else {
            view.setPadding(0, 0, 0, i11);
        }
        return n3Var;
    }

    public static void x(GroupUserObj groupUserObj) {
        if (PatchProxy.proxy(new Object[]{groupUserObj}, null, changeQuickRedirect, true, 48927, new Class[]{GroupUserObj.class}, Void.TYPE).isSupported) {
            return;
        }
        com.max.hbcache.c.w(com.max.hbcache.c.f66122g, groupUserObj.getUserid(), groupUserObj);
    }

    private static void y(User user) {
        f95406d = user;
    }

    public static void z(User user) {
        if (PatchProxy.proxy(new Object[]{user}, null, changeQuickRedirect, true, 48924, new Class[]{User.class}, Void.TYPE).isSupported) {
            return;
        }
        com.max.hbcache.c.n("user").edit().putString("user", com.max.hbutils.utils.k.p(user)).apply();
        y(user);
    }
}
