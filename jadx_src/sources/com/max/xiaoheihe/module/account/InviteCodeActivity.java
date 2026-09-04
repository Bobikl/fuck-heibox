package com.max.xiaoheihe.module.account;

import android.content.Context;
import android.content.Intent;
import android.text.Editable;
import android.text.TextWatcher;
import android.view.View;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import butterknife.BindView;
import butterknife.ButterKnife;
import com.max.hbcommon.base.BaseActivity;
import com.max.hbcommon.network.ApiException;
import com.max.hbcustomview.AutoPlayView;
import com.max.hbcustomview.loadingdialog.LoadingDialog;
import com.max.hbutils.bean.Result;
import com.max.hbutils.utils.ViewUtils;
import com.max.xiaoheihe.MainActivity;
import com.max.xiaoheihe.R;
import com.max.xiaoheihe.bean.account.InterestProfileObj;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.PatchProxyResult;
import org.apache.tools.ant.taskdefs.z0;

/* JADX INFO: loaded from: classes9.dex */
@ig.d(path = {lb.d.f131230p4})
public class InviteCodeActivity extends BaseActivity {
    public static final String P = "arg_account";
    public static final String Q = "arg_rule";
    public static final String R = "arg_profile";
    public static ChangeQuickRedirect changeQuickRedirect;
    private LoadingDialog L;
    private String M;
    private String N;
    private String O;

    @BindView(R.id.et_invite_code)
    EditText etInviteCode;

    @BindView(R.id.ib_icon_back)
    ImageView ibIconBack;

    @BindView(R.id.iv_del)
    ImageView ivDel;

    @BindView(R.id.tv_action)
    TextView tvAction;

    @BindView(R.id.tv_error_message)
    TextView tvErrorMsg;

    @BindView(R.id.tv_number)
    TextView tvNumber;

    @BindView(R.id.tv_rules)
    TextView tvRules;

    @BindView(R.id.tv_skip)
    TextView tvSkip;

    @BindView(R.id.vg_bg)
    LinearLayout vg_bg;

    public class a implements TextWatcher {
        public static ChangeQuickRedirect changeQuickRedirect;

        a() {
        }

        @Override // android.text.TextWatcher
        public void afterTextChanged(Editable editable) {
            if (PatchProxy.proxy(new Object[]{editable}, this, changeQuickRedirect, false, 23241, new Class[]{Editable.class}, Void.TYPE).isSupported) {
                return;
            }
            InviteCodeActivity.M1(InviteCodeActivity.this);
            if (editable.length() > 0) {
                InviteCodeActivity.this.ivDel.setVisibility(0);
            } else {
                InviteCodeActivity.this.ivDel.setVisibility(8);
            }
        }

        @Override // android.text.TextWatcher
        public void beforeTextChanged(CharSequence charSequence, int i10, int i11, int i12) {
        }

        @Override // android.text.TextWatcher
        public void onTextChanged(CharSequence charSequence, int i10, int i11, int i12) {
        }
    }

    public class b implements View.OnClickListener {
        public static ChangeQuickRedirect changeQuickRedirect;

        b() {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            if (PatchProxy.proxy(new Object[]{view}, this, changeQuickRedirect, false, 23242, new Class[]{View.class}, Void.TYPE).isSupported) {
                return;
            }
            InviteCodeActivity.this.etInviteCode.setText("");
        }
    }

    public class c implements View.OnClickListener {
        public static ChangeQuickRedirect changeQuickRedirect;

        c() {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            if (PatchProxy.proxy(new Object[]{view}, this, changeQuickRedirect, false, 23243, new Class[]{View.class}, Void.TYPE).isSupported) {
                return;
            }
            if (InviteCodeActivity.this.etInviteCode.getText().toString().length() <= 0) {
                InviteCodeActivity.O1(InviteCodeActivity.this);
            } else {
                InviteCodeActivity inviteCodeActivity = InviteCodeActivity.this;
                InviteCodeActivity.N1(inviteCodeActivity, inviteCodeActivity.etInviteCode.getText().toString());
            }
        }
    }

    public class d implements View.OnClickListener {
        public static ChangeQuickRedirect changeQuickRedirect;

        d() {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            if (PatchProxy.proxy(new Object[]{view}, this, changeQuickRedirect, false, 23244, new Class[]{View.class}, Void.TYPE).isSupported) {
                return;
            }
            InviteCodeActivity.O1(InviteCodeActivity.this);
        }
    }

    public class e implements View.OnClickListener {
        public static ChangeQuickRedirect changeQuickRedirect;

        e() {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            if (PatchProxy.proxy(new Object[]{view}, this, changeQuickRedirect, false, 23245, new Class[]{View.class}, Void.TYPE).isSupported) {
                return;
            }
            InviteCodeActivity.O1(InviteCodeActivity.this);
        }
    }

    public class f extends com.max.hbcommon.network.d<Result> {
        public static ChangeQuickRedirect changeQuickRedirect;

        f() {
        }

        @Override // com.max.hbcommon.network.d, io.reactivex.g0
        public void onComplete() {
            if (PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 23247, new Class[0], Void.TYPE).isSupported || !InviteCodeActivity.this.isActive() || InviteCodeActivity.this.L == null) {
                return;
            }
            InviteCodeActivity.this.L.c();
        }

        @Override // com.max.hbcommon.network.d, io.reactivex.g0
        public void onError(Throwable th2) {
            if (!PatchProxy.proxy(new Object[]{th2}, this, changeQuickRedirect, false, 23246, new Class[]{Throwable.class}, Void.TYPE).isSupported && InviteCodeActivity.this.isActive()) {
                if (th2 instanceof ApiException) {
                    String strD = ((ApiException) th2).d();
                    if ("relogin".equals(strD) || "expired".equals(strD) || z0.b.f136024i.equals(strD)) {
                        super.onError(th2);
                    } else {
                        InviteCodeActivity.this.tvErrorMsg.setVisibility(0);
                        InviteCodeActivity.this.tvErrorMsg.setText(th2.getMessage());
                    }
                } else {
                    super.onError(th2);
                }
                if (InviteCodeActivity.this.L != null) {
                    InviteCodeActivity.this.L.c();
                }
            }
        }

        public void onNext(Result result) {
            if (!PatchProxy.proxy(new Object[]{result}, this, changeQuickRedirect, false, 23248, new Class[]{Result.class}, Void.TYPE).isSupported && InviteCodeActivity.this.isActive()) {
                if (com.max.hbcommon.utils.c.u(result.getMsg())) {
                    com.max.hbutils.utils.c cVar = com.max.hbutils.utils.c.f73533a;
                    com.max.hbutils.utils.c.f(InviteCodeActivity.this.getString(R.string.success));
                } else {
                    com.max.hbutils.utils.c cVar2 = com.max.hbutils.utils.c.f73533a;
                    com.max.hbutils.utils.c.f(result.getMsg());
                }
                InviteCodeActivity.O1(InviteCodeActivity.this);
            }
        }

        @Override // com.max.hbcommon.network.d, io.reactivex.g0
        public /* bridge */ /* synthetic */ void onNext(Object obj) {
            if (PatchProxy.proxy(new Object[]{obj}, this, changeQuickRedirect, false, 23249, new Class[]{Object.class}, Void.TYPE).isSupported) {
                return;
            }
            onNext((Result) obj);
        }
    }

    static /* synthetic */ void M1(InviteCodeActivity inviteCodeActivity) {
        if (PatchProxy.proxy(new Object[]{inviteCodeActivity}, null, changeQuickRedirect, true, 23238, new Class[]{InviteCodeActivity.class}, Void.TYPE).isSupported) {
            return;
        }
        inviteCodeActivity.V1();
    }

    static /* synthetic */ void N1(InviteCodeActivity inviteCodeActivity, String str) {
        if (PatchProxy.proxy(new Object[]{inviteCodeActivity, str}, null, changeQuickRedirect, true, 23239, new Class[]{InviteCodeActivity.class, String.class}, Void.TYPE).isSupported) {
            return;
        }
        inviteCodeActivity.W1(str);
    }

    static /* synthetic */ void O1(InviteCodeActivity inviteCodeActivity) {
        if (PatchProxy.proxy(new Object[]{inviteCodeActivity}, null, changeQuickRedirect, true, 23240, new Class[]{InviteCodeActivity.class}, Void.TYPE).isSupported) {
            return;
        }
        inviteCodeActivity.X1();
    }

    public static Intent R1(Context context, String str, String str2, String str3) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{context, str, str2, str3}, null, changeQuickRedirect, true, 23231, new Class[]{Context.class, String.class, String.class, String.class}, Intent.class);
        if (patchProxyResultProxy.isSupported) {
            return (Intent) patchProxyResultProxy.result;
        }
        Intent intent = new Intent(context, (Class<?>) InviteCodeActivity.class);
        intent.putExtra(P, str);
        intent.putExtra(Q, str2);
        intent.putExtra(R, str3);
        return intent;
    }

    private void T1() {
        AutoPlayView autoPlayView;
        if (PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 23235, new Class[0], Void.TYPE).isSupported) {
            return;
        }
        this.vg_bg.removeAllViews();
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
            this.vg_bg.addView(autoPlayView);
        }
        this.tvNumber.setText(this.M);
        this.tvRules.setText(this.N);
    }

    private void V1() {
        if (PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 23236, new Class[0], Void.TYPE).isSupported) {
            return;
        }
        this.tvAction.setEnabled(true);
        if (this.etInviteCode.getText().toString().length() > 0) {
            this.tvAction.setBackgroundResource(R.drawable.text_primary_2dp);
            this.tvAction.setTextColor(com.max.xiaoheihe.utils.d.E(R.color.white));
        } else {
            this.tvAction.setBackgroundResource(R.drawable.topic_bg_2dp);
            this.tvAction.setTextColor(com.max.xiaoheihe.utils.d.E(R.color.text_primary_1_color));
        }
    }

    private void W1(String str) {
        if (PatchProxy.proxy(new Object[]{str}, this, changeQuickRedirect, false, 23237, new Class[]{String.class}, Void.TYPE).isSupported) {
            return;
        }
        this.L = new LoadingDialog(this, "正在验证邀请码...").r();
        V((io.reactivex.disposables.b) com.max.xiaoheihe.network.i.a().Y9(str).I5(io.reactivex.schedulers.b.d()).a4(io.reactivex.android.schedulers.a.c()).J5(new f()));
    }

    private void X1() {
        if (PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 23234, new Class[0], Void.TYPE).isSupported) {
            return;
        }
        InterestProfileObj interestProfileObj = (InterestProfileObj) com.max.hbutils.utils.k.a(this.O, InterestProfileObj.class);
        if (interestProfileObj != null && (!com.max.hbcommon.utils.c.w(interestProfileObj.getOptions()) || !com.max.hbcommon.utils.c.w(interestProfileObj.getTopic_group_list()))) {
            startActivity(InterestInitV2Activity.f77935y2.a(this.f66601b, interestProfileObj));
            finish();
        } else if (com.max.xiaoheihe.utils.d.J0(this.f66601b, MainActivity.class)) {
            finish();
        } else {
            com.max.xiaoheihe.utils.d.U0(this);
        }
    }

    @Override // com.max.hbcommon.base.BaseActivity
    public void k1() {
        if (PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 23232, new Class[0], Void.TYPE).isSupported) {
            return;
        }
        setContentView(R.layout.activity_invite_code);
        ButterKnife.a(this);
        com.max.hbutils.utils.t.X(this, 0, null);
        com.max.hbutils.utils.t.M(this.f66601b, true);
        if (getIntent() != null) {
            Intent intent = getIntent();
            this.M = intent.getStringExtra(P);
            this.N = intent.getStringExtra(Q);
            this.O = intent.getStringExtra(R);
        }
        T1();
    }

    @Override // com.max.hbcommon.base.BaseActivity
    public void q1() {
        if (PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 23233, new Class[0], Void.TYPE).isSupported) {
            return;
        }
        this.etInviteCode.addTextChangedListener(new a());
        this.ivDel.setOnClickListener(new b());
        this.tvAction.setOnClickListener(new c());
        this.ibIconBack.setOnClickListener(new d());
        this.tvSkip.setOnClickListener(new e());
    }
}
