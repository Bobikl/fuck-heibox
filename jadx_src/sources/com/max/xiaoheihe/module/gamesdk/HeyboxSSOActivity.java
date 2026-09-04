package com.max.xiaoheihe.module.gamesdk;

import android.content.Intent;
import android.content.pm.PackageManager;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import butterknife.BindView;
import butterknife.ButterKnife;
import com.google.gson.JsonObject;
import com.max.hbcommon.base.BaseActivity;
import com.max.hbcommon.network.ApiException;
import com.max.hbutils.bean.Result;
import com.max.hbutils.utils.c;
import com.max.xiaoheihe.R;
import com.max.xiaoheihe.app.HeyBoxApplication;
import com.max.xiaoheihe.bean.account.User;
import com.max.xiaoheihe.network.i;
import com.max.xiaoheihe.utils.d;
import com.max.xiaoheihe.utils.i0;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;

/* JADX INFO: loaded from: classes11.dex */
public class HeyboxSSOActivity extends BaseActivity {
    public static ChangeQuickRedirect changeQuickRedirect;
    private User L;
    private String M;
    private String N;

    @BindView(R.id.iv_app_icon)
    ImageView iv_app_icon;

    @BindView(R.id.iv_avartar)
    ImageView iv_avartar;

    @BindView(R.id.tv_app_name)
    TextView tv_app_name;

    @BindView(R.id.tv_auth_btn)
    TextView tv_auth_btn;

    @BindView(R.id.tv_username)
    TextView tv_username;

    public class a implements View.OnClickListener {
        public static ChangeQuickRedirect changeQuickRedirect;

        a() {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            if (PatchProxy.proxy(new Object[]{view}, this, changeQuickRedirect, false, 38458, new Class[]{View.class}, Void.TYPE).isSupported) {
                return;
            }
            if (i0.s()) {
                HeyboxSSOActivity.M1(HeyboxSSOActivity.this);
            } else {
                d.I1(((BaseActivity) HeyboxSSOActivity.this).f66601b);
            }
        }
    }

    public class b extends com.max.hbcommon.network.d<Result<JsonObject>> {
        public static ChangeQuickRedirect changeQuickRedirect;

        b() {
        }

        @Override // com.max.hbcommon.network.d, io.reactivex.g0
        public void onError(Throwable th2) {
            if (PatchProxy.proxy(new Object[]{th2}, this, changeQuickRedirect, false, 38459, new Class[]{Throwable.class}, Void.TYPE).isSupported) {
                return;
            }
            if (!(th2 instanceof ApiException)) {
                c cVar = c.f73533a;
                c.f("授权失败");
            }
            super.onError(th2);
        }

        public void onNext(Result<JsonObject> result) {
            if (!PatchProxy.proxy(new Object[]{result}, this, changeQuickRedirect, false, 38460, new Class[]{Result.class}, Void.TYPE).isSupported && HeyboxSSOActivity.this.isActive()) {
                HeyboxSSOActivity.O1(HeyboxSSOActivity.this, result.getResult().toString());
            }
        }

        @Override // com.max.hbcommon.network.d, io.reactivex.g0
        public /* bridge */ /* synthetic */ void onNext(Object obj) {
            if (PatchProxy.proxy(new Object[]{obj}, this, changeQuickRedirect, false, 38461, new Class[]{Object.class}, Void.TYPE).isSupported) {
                return;
            }
            onNext((Result<JsonObject>) obj);
        }
    }

    static /* synthetic */ void M1(HeyboxSSOActivity heyboxSSOActivity) {
        if (PatchProxy.proxy(new Object[]{heyboxSSOActivity}, null, changeQuickRedirect, true, 38456, new Class[]{HeyboxSSOActivity.class}, Void.TYPE).isSupported) {
            return;
        }
        heyboxSSOActivity.Q1();
    }

    static /* synthetic */ void O1(HeyboxSSOActivity heyboxSSOActivity, String str) {
        if (PatchProxy.proxy(new Object[]{heyboxSSOActivity, str}, null, changeQuickRedirect, true, 38457, new Class[]{HeyboxSSOActivity.class, String.class}, Void.TYPE).isSupported) {
            return;
        }
        heyboxSSOActivity.T1(str);
    }

    private void Q1() {
        if (PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 38453, new Class[0], Void.TYPE).isSupported) {
            return;
        }
        V((io.reactivex.disposables.b) i.a().X4(this.M).I5(io.reactivex.schedulers.b.d()).a4(io.reactivex.android.schedulers.a.c()).J5(new b()));
    }

    private void R1() {
        if (PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 38454, new Class[0], Void.TYPE).isSupported) {
            return;
        }
        if (this.N == null) {
            finish();
            return;
        }
        if (i0.s()) {
            this.tv_username.setText(this.L.getAccount_detail().getUsername());
            com.max.hbimage.b.I(this.L.getAccount_detail().getAvartar(), this.iv_avartar, R.drawable.common_default_avatar_40x40);
        } else {
            this.tv_username.setText("未登录");
            this.iv_avartar.setImageResource(R.drawable.common_default_avatar_40x40);
        }
        try {
            PackageManager packageManager = getPackageManager();
            this.iv_app_icon.setBackground(packageManager.getApplicationInfo(this.N, 0).loadIcon(packageManager));
            this.tv_app_name.setText(packageManager.getApplicationInfo(this.N, 0).loadLabel(packageManager));
        } catch (PackageManager.NameNotFoundException unused) {
            finish();
        }
    }

    private void T1(String str) {
        if (PatchProxy.proxy(new Object[]{str}, this, changeQuickRedirect, false, 38455, new Class[]{String.class}, Void.TYPE).isSupported) {
            return;
        }
        Intent intent = new Intent();
        intent.putExtra("auth_info", str);
        setResult(-1, intent);
        finish();
    }

    @Override // com.max.hbcommon.base.BaseActivity
    public void k1() {
        if (PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 38449, new Class[0], Void.TYPE).isSupported) {
            return;
        }
        setContentView(R.layout.activity_heybox_sso);
        HeyBoxApplication.f76795q = true;
        this.f66620u = ButterKnife.a(this);
        this.N = getIntent().getStringExtra("package_name");
        this.M = getIntent().getStringExtra(j5.b.f124283h);
        this.f66616q.setTitle(d.n0(R.string.user_account) + "登录");
        if (i0.s()) {
            return;
        }
        d.I1(this.f66601b);
    }

    @Override // com.max.hbcommon.base.BaseActivity, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, android.app.Activity
    public void onDestroy() {
        if (PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 38451, new Class[0], Void.TYPE).isSupported) {
            return;
        }
        super.onDestroy();
        HeyBoxApplication.f76795q = false;
    }

    @Override // com.max.hbcommon.base.BaseActivity, androidx.fragment.app.FragmentActivity, android.app.Activity
    public void onResume() {
        if (PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 38450, new Class[0], Void.TYPE).isSupported) {
            return;
        }
        super.onResume();
        this.L = i0.i();
        R1();
    }

    @Override // com.max.hbcommon.base.BaseActivity
    public void q1() {
        if (PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 38452, new Class[0], Void.TYPE).isSupported) {
            return;
        }
        this.tv_auth_btn.setOnClickListener(new a());
    }
}
