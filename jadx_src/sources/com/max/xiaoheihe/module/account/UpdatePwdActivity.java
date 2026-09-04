package com.max.xiaoheihe.module.account;

import android.content.Context;
import android.content.Intent;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import com.max.hbcommon.base.BaseActivity;
import com.max.hbcustomview.loadingdialog.LoadingDialog;
import com.max.hbutils.bean.Result;
import com.max.xiaoheihe.R;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.PatchProxyResult;

/* JADX INFO: loaded from: classes9.dex */
public class UpdatePwdActivity extends BaseActivity implements View.OnClickListener {
    public static ChangeQuickRedirect changeQuickRedirect;
    private EditText L;
    private EditText M;
    private EditText N;
    private LoadingDialog O;
    private Button P;
    private TextView Q;
    private boolean R;
    private View S;
    private View T;

    public class a extends com.max.hbcommon.network.d<Result> {
        public static ChangeQuickRedirect changeQuickRedirect;

        a() {
        }

        @Override // com.max.hbcommon.network.d, io.reactivex.g0
        public void onComplete() {
            if (PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 24380, new Class[0], Void.TYPE).isSupported) {
                return;
            }
            com.max.hbutils.utils.c cVar = com.max.hbutils.utils.c.f73533a;
            com.max.hbutils.utils.c.f(UpdatePwdActivity.this.getString(R.string.change_success));
            if (UpdatePwdActivity.this.O != null) {
                UpdatePwdActivity.this.O.c();
            }
            UpdatePwdActivity.this.finish();
        }

        @Override // com.max.hbcommon.network.d, io.reactivex.g0
        public void onError(Throwable th2) {
            if (PatchProxy.proxy(new Object[]{th2}, this, changeQuickRedirect, false, 24379, new Class[]{Throwable.class}, Void.TYPE).isSupported) {
                return;
            }
            super.onError(th2);
            if (UpdatePwdActivity.this.O != null) {
                UpdatePwdActivity.this.O.c();
            }
        }

        public void onNext(Result result) {
            if (PatchProxy.proxy(new Object[]{result}, this, changeQuickRedirect, false, 24381, new Class[]{Result.class}, Void.TYPE).isSupported) {
                return;
            }
            com.max.xiaoheihe.utils.d.X0(((BaseActivity) UpdatePwdActivity.this).f66601b, true);
        }

        @Override // com.max.hbcommon.network.d, io.reactivex.g0
        public /* bridge */ /* synthetic */ void onNext(Object obj) {
            if (PatchProxy.proxy(new Object[]{obj}, this, changeQuickRedirect, false, 24382, new Class[]{Object.class}, Void.TYPE).isSupported) {
                return;
            }
            onNext((Result) obj);
        }
    }

    public class b extends com.max.hbcommon.network.d<Result> {
        public static ChangeQuickRedirect changeQuickRedirect;

        b() {
        }

        @Override // com.max.hbcommon.network.d, io.reactivex.g0
        public void onComplete() {
            if (PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 24384, new Class[0], Void.TYPE).isSupported) {
                return;
            }
            com.max.hbutils.utils.c cVar = com.max.hbutils.utils.c.f73533a;
            com.max.hbutils.utils.c.f(UpdatePwdActivity.this.getString(R.string.success));
            if (UpdatePwdActivity.this.O != null) {
                UpdatePwdActivity.this.O.c();
            }
            UpdatePwdActivity.this.finish();
        }

        @Override // com.max.hbcommon.network.d, io.reactivex.g0
        public void onError(Throwable th2) {
            if (PatchProxy.proxy(new Object[]{th2}, this, changeQuickRedirect, false, 24383, new Class[]{Throwable.class}, Void.TYPE).isSupported) {
                return;
            }
            super.onError(th2);
            if (UpdatePwdActivity.this.O != null) {
                UpdatePwdActivity.this.O.c();
            }
        }

        public void onNext(Result result) {
            if (PatchProxy.proxy(new Object[]{result}, this, changeQuickRedirect, false, 24385, new Class[]{Result.class}, Void.TYPE).isSupported) {
                return;
            }
            com.max.xiaoheihe.utils.d.X0(((BaseActivity) UpdatePwdActivity.this).f66601b, true);
        }

        @Override // com.max.hbcommon.network.d, io.reactivex.g0
        public /* bridge */ /* synthetic */ void onNext(Object obj) {
            if (PatchProxy.proxy(new Object[]{obj}, this, changeQuickRedirect, false, 24386, new Class[]{Object.class}, Void.TYPE).isSupported) {
                return;
            }
            onNext((Result) obj);
        }
    }

    public static Intent Q1(Context context, boolean z10) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{context, new Byte(z10 ? (byte) 1 : (byte) 0)}, null, changeQuickRedirect, true, 24374, new Class[]{Context.class, Boolean.TYPE}, Intent.class);
        if (patchProxyResultProxy.isSupported) {
            return (Intent) patchProxyResultProxy.result;
        }
        Intent intent = new Intent(context, (Class<?>) UpdatePwdActivity.class);
        intent.putExtra("no_pwd", z10);
        return intent;
    }

    private void R1() {
        if (PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 24378, new Class[0], Void.TYPE).isSupported) {
            return;
        }
        this.O = new LoadingDialog(this.f66601b, getString(R.string.setting_pwd), true).r();
        V((io.reactivex.disposables.b) com.max.xiaoheihe.network.i.a().T(com.max.xiaoheihe.utils.w.a(this.M.getText().toString())).I5(io.reactivex.schedulers.b.d()).a4(io.reactivex.android.schedulers.a.c()).J5(new b()));
    }

    private void T1() {
        if (PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 24377, new Class[0], Void.TYPE).isSupported) {
            return;
        }
        this.O = new LoadingDialog(this.f66601b, getString(R.string.changing_pwd), true).r();
        V((io.reactivex.disposables.b) com.max.xiaoheihe.network.i.a().rb(com.max.xiaoheihe.utils.w.a(this.L.getText().toString()), com.max.xiaoheihe.utils.w.a(this.M.getText().toString())).I5(io.reactivex.schedulers.b.d()).a4(io.reactivex.android.schedulers.a.c()).J5(new a()));
    }

    @Override // com.max.hbcommon.base.BaseActivity
    public void k1() {
        if (PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 24375, new Class[0], Void.TYPE).isSupported) {
            return;
        }
        setContentView(R.layout.activity_update_pwd);
        boolean booleanExtra = getIntent().getBooleanExtra("no_pwd", true);
        this.R = booleanExtra;
        this.f66616q.setTitle(booleanExtra ? getString(R.string.set_pwd) : getString(R.string.change_pwd));
        this.S = findViewById(R.id.vg_old);
        this.T = findViewById(R.id.divider_old);
        this.L = (EditText) findViewById(R.id.et_old);
        this.M = (EditText) findViewById(R.id.et_new);
        this.N = (EditText) findViewById(R.id.et_renew);
        this.Q = (TextView) findViewById(R.id.tv_current_account);
        Button button = (Button) findViewById(R.id.bt_update_pwd);
        this.P = button;
        button.setBackgroundResource(R.drawable.text_primary_2dp);
        this.P.setOnClickListener(this);
        if (this.R) {
            this.S.setVisibility(8);
            this.T.setVisibility(8);
            this.P.setText(R.string.set_pwd);
        }
        if (!com.max.hbcommon.utils.c.u(com.max.xiaoheihe.utils.i0.o().getPhonenum())) {
            this.Q.setText(new StringBuilder(com.max.xiaoheihe.utils.i0.o().getPhonenum()).replace(3, 7, "****"));
            return;
        }
        this.Q.setText("ID:" + com.max.xiaoheihe.utils.i0.o().getAccount_detail().getUserid());
    }

    @Override // android.view.View.OnClickListener
    public void onClick(View view) {
        if (!PatchProxy.proxy(new Object[]{view}, this, changeQuickRedirect, false, 24376, new Class[]{View.class}, Void.TYPE).isSupported && view.getId() == R.id.bt_update_pwd) {
            if ((!this.R && com.max.hbcommon.utils.c.g(this, this.L, getString(R.string.pwd_empty_msg))) || com.max.hbcommon.utils.c.g(this, this.M, getString(R.string.new_pwd_empty_msg)) || com.max.hbcommon.utils.c.g(this, this.N, getString(R.string.confirm_pwd_empty_msg))) {
                return;
            }
            if (!this.R && this.L.length() < 6) {
                com.max.hbutils.utils.c cVar = com.max.hbutils.utils.c.f73533a;
                com.max.hbutils.utils.c.f(getString(R.string.pwd_min_msg));
                return;
            }
            if (this.M.length() < 6) {
                com.max.hbutils.utils.c cVar2 = com.max.hbutils.utils.c.f73533a;
                com.max.hbutils.utils.c.f(getString(R.string.new_pwd_min_msg));
                return;
            }
            if (this.N.length() < 6) {
                com.max.hbutils.utils.c cVar3 = com.max.hbutils.utils.c.f73533a;
                com.max.hbutils.utils.c.f(getString(R.string.confirm_pwd_min_msg));
                return;
            }
            if (this.M.length() > 20) {
                com.max.hbutils.utils.c cVar4 = com.max.hbutils.utils.c.f73533a;
                com.max.hbutils.utils.c.f(getString(R.string.pwd_max_msg));
                return;
            }
            if (!this.R && this.L.getText().toString().equals(this.M.getText().toString())) {
                com.max.hbutils.utils.c cVar5 = com.max.hbutils.utils.c.f73533a;
                com.max.hbutils.utils.c.f(getString(R.string.same_pwd_msg));
                return;
            }
            if (!this.N.getText().toString().equals(this.M.getText().toString())) {
                com.max.hbutils.utils.c cVar6 = com.max.hbutils.utils.c.f73533a;
                com.max.hbutils.utils.c.f(getString(R.string.diff_pwd_msg));
            } else if (com.max.hbcommon.utils.c.G(this.M.getText().toString().trim())) {
                com.max.hbutils.utils.c cVar7 = com.max.hbutils.utils.c.f73533a;
                com.max.hbutils.utils.c.f(getString(R.string.pwd_simple_msg));
            } else if (this.R) {
                R1();
            } else {
                T1();
            }
        }
    }
}
