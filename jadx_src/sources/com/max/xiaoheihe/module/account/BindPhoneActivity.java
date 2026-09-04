package com.max.xiaoheihe.module.account;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.os.Handler;
import android.os.Message;
import android.view.View;
import android.view.ViewGroup;
import android.widget.EditText;
import android.widget.TextView;
import butterknife.BindView;
import butterknife.ButterKnife;
import com.max.hbcommon.base.BaseActivity;
import com.max.hbutils.bean.Result;
import com.max.xiaoheihe.R;
import com.max.xiaoheihe.bean.account.User;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.PatchProxyResult;
import java.util.Timer;
import java.util.TimerTask;

/* JADX INFO: loaded from: classes9.dex */
public class BindPhoneActivity extends BaseActivity {
    private static final int R = 1;
    public static ChangeQuickRedirect changeQuickRedirect;
    private Timer L;
    private TimerTask M;
    private String O;

    @BindView(R.id.et_code)
    EditText etCode;

    @BindView(R.id.et_confirm)
    EditText etConfirm;

    @BindView(R.id.et_phone)
    EditText etPhone;

    @BindView(R.id.et_pwd)
    EditText etPwd;

    @BindView(R.id.tv_area_code)
    TextView tvAreaCode;

    @BindView(R.id.tv_finish)
    TextView tvFinish;

    @BindView(R.id.tv_get_code)
    TextView tvGetCode;

    @BindView(R.id.vg_area_code)
    ViewGroup vgAreaCode;
    private int N = 60;
    private String P = "+86";
    private final Handler Q = new e();

    public class a implements View.OnClickListener {
        public static ChangeQuickRedirect changeQuickRedirect;

        a() {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            if (PatchProxy.proxy(new Object[]{view}, this, changeQuickRedirect, false, 22501, new Class[]{View.class}, Void.TYPE).isSupported) {
                return;
            }
            Activity activity = ((BaseActivity) BindPhoneActivity.this).f66601b;
            BindPhoneActivity bindPhoneActivity = BindPhoneActivity.this;
            if (com.max.hbcommon.utils.c.g(activity, bindPhoneActivity.etPhone, bindPhoneActivity.getString(R.string.phonenum_empty_msg))) {
                return;
            }
            Activity activity2 = ((BaseActivity) BindPhoneActivity.this).f66601b;
            BindPhoneActivity bindPhoneActivity2 = BindPhoneActivity.this;
            if (com.max.hbcommon.utils.c.g(activity2, bindPhoneActivity2.etCode, bindPhoneActivity2.getString(R.string.verification_code_empty))) {
                return;
            }
            Activity activity3 = ((BaseActivity) BindPhoneActivity.this).f66601b;
            BindPhoneActivity bindPhoneActivity3 = BindPhoneActivity.this;
            if (com.max.hbcommon.utils.c.g(activity3, bindPhoneActivity3.etPwd, bindPhoneActivity3.getString(R.string.pwd_empty_msg))) {
                return;
            }
            Activity activity4 = ((BaseActivity) BindPhoneActivity.this).f66601b;
            BindPhoneActivity bindPhoneActivity4 = BindPhoneActivity.this;
            if (com.max.hbcommon.utils.c.g(activity4, bindPhoneActivity4.etConfirm, bindPhoneActivity4.getString(R.string.confirm_pwd_empty_msg))) {
                return;
            }
            if (BindPhoneActivity.this.etPwd.length() < 6) {
                com.max.hbutils.utils.c cVar = com.max.hbutils.utils.c.f73533a;
                com.max.hbutils.utils.c.f(BindPhoneActivity.this.getString(R.string.pwd_min_msg));
                return;
            }
            if (BindPhoneActivity.this.etConfirm.length() < 6) {
                com.max.hbutils.utils.c cVar2 = com.max.hbutils.utils.c.f73533a;
                com.max.hbutils.utils.c.f(BindPhoneActivity.this.getString(R.string.confirm_pwd_min_msg));
                return;
            }
            if (BindPhoneActivity.this.etPwd.length() > 20) {
                com.max.hbutils.utils.c cVar3 = com.max.hbutils.utils.c.f73533a;
                com.max.hbutils.utils.c.f(BindPhoneActivity.this.getString(R.string.pwd_max_msg));
            } else if (!BindPhoneActivity.this.etConfirm.getText().toString().equals(BindPhoneActivity.this.etPwd.getText().toString())) {
                com.max.hbutils.utils.c cVar4 = com.max.hbutils.utils.c.f73533a;
                com.max.hbutils.utils.c.f(BindPhoneActivity.this.getString(R.string.diff_pwd_msg));
            } else if (com.max.hbcommon.utils.c.G(BindPhoneActivity.this.etPwd.getText().toString().trim())) {
                com.max.hbutils.utils.c cVar5 = com.max.hbutils.utils.c.f73533a;
                com.max.hbutils.utils.c.f(BindPhoneActivity.this.getString(R.string.pwd_simple_msg));
            } else {
                BindPhoneActivity bindPhoneActivity5 = BindPhoneActivity.this;
                BindPhoneActivity.a2(bindPhoneActivity5, bindPhoneActivity5.etPhone.getText().toString().trim(), BindPhoneActivity.this.etCode.getText().toString().trim());
            }
        }
    }

    public class b implements View.OnClickListener {
        public static ChangeQuickRedirect changeQuickRedirect;

        b() {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            if (PatchProxy.proxy(new Object[]{view}, this, changeQuickRedirect, false, 22502, new Class[]{View.class}, Void.TYPE).isSupported) {
                return;
            }
            BindPhoneActivity bindPhoneActivity = BindPhoneActivity.this;
            BindPhoneActivity.b2(bindPhoneActivity, bindPhoneActivity.etPhone.getText().toString().trim());
        }
    }

    public class c implements View.OnClickListener {
        public static ChangeQuickRedirect changeQuickRedirect;

        c() {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            if (PatchProxy.proxy(new Object[]{view}, this, changeQuickRedirect, false, 22503, new Class[]{View.class}, Void.TYPE).isSupported) {
                return;
            }
            ((BaseActivity) BindPhoneActivity.this).f66601b.startActivityForResult(AreaCodeActivity.T1(((BaseActivity) BindPhoneActivity.this).f66601b), 1);
        }
    }

    public class d extends TimerTask {
        public static ChangeQuickRedirect changeQuickRedirect;

        d() {
        }

        @Override // java.util.TimerTask, java.lang.Runnable
        public void run() {
            if (PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 22504, new Class[0], Void.TYPE).isSupported) {
                return;
            }
            Message message = new Message();
            message.what = 1;
            BindPhoneActivity.this.Q.sendMessage(message);
        }
    }

    public class e extends Handler {
        public static ChangeQuickRedirect changeQuickRedirect;

        e() {
        }

        @Override // android.os.Handler
        public void handleMessage(Message message) {
            if (PatchProxy.proxy(new Object[]{message}, this, changeQuickRedirect, false, 22505, new Class[]{Message.class}, Void.TYPE).isSupported) {
                return;
            }
            super.handleMessage(message);
            if (BindPhoneActivity.this.N <= 1) {
                BindPhoneActivity.this.M.cancel();
                BindPhoneActivity bindPhoneActivity = BindPhoneActivity.this;
                bindPhoneActivity.tvGetCode.setText(bindPhoneActivity.getString(R.string.resend));
                BindPhoneActivity.O1(BindPhoneActivity.this, true);
                return;
            }
            BindPhoneActivity.this.tvGetCode.setText(BindPhoneActivity.i2(BindPhoneActivity.this) + "s重新发送");
            BindPhoneActivity.O1(BindPhoneActivity.this, false);
        }
    }

    public class f extends com.max.hbcommon.network.d<Result> {
        public static ChangeQuickRedirect changeQuickRedirect;

        f() {
        }

        public void onNext(Result result) {
            if (!PatchProxy.proxy(new Object[]{result}, this, changeQuickRedirect, false, 22506, new Class[]{Result.class}, Void.TYPE).isSupported && BindPhoneActivity.this.isActive()) {
                super.onNext(result);
                com.max.hbutils.utils.c cVar = com.max.hbutils.utils.c.f73533a;
                com.max.hbutils.utils.c.f("验证码已经发送");
                BindPhoneActivity.R1(BindPhoneActivity.this);
            }
        }

        @Override // com.max.hbcommon.network.d, io.reactivex.g0
        public /* bridge */ /* synthetic */ void onNext(Object obj) {
            if (PatchProxy.proxy(new Object[]{obj}, this, changeQuickRedirect, false, 22507, new Class[]{Object.class}, Void.TYPE).isSupported) {
                return;
            }
            onNext((Result) obj);
        }
    }

    public class g extends com.max.hbcommon.network.d<Result> {
        public static ChangeQuickRedirect changeQuickRedirect;

        g() {
        }

        public void onNext(Result result) {
            if (!PatchProxy.proxy(new Object[]{result}, this, changeQuickRedirect, false, 22508, new Class[]{Result.class}, Void.TYPE).isSupported && BindPhoneActivity.this.isActive()) {
                BindPhoneActivity.this.O = result.getKeyMap().get("sid");
                BindPhoneActivity.W1(BindPhoneActivity.this, BindPhoneActivity.this.P + BindPhoneActivity.this.etPhone.getText().toString().trim());
            }
        }

        @Override // com.max.hbcommon.network.d, io.reactivex.g0
        public /* bridge */ /* synthetic */ void onNext(Object obj) {
            if (PatchProxy.proxy(new Object[]{obj}, this, changeQuickRedirect, false, 22509, new Class[]{Object.class}, Void.TYPE).isSupported) {
                return;
            }
            onNext((Result) obj);
        }
    }

    public class h implements com.max.xiaoheihe.utils.a.b {
        public static ChangeQuickRedirect changeQuickRedirect;

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ String f77527a;

        h(String str) {
            this.f77527a = str;
        }

        @Override // com.max.xiaoheihe.utils.a.b
        public void a() {
            if (PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 22510, new Class[0], Void.TYPE).isSupported) {
                return;
            }
            BindPhoneActivity.X1(BindPhoneActivity.this, this.f77527a);
        }
    }

    public class i extends com.max.hbcommon.network.d<Result> {
        public static ChangeQuickRedirect changeQuickRedirect;

        i() {
        }

        public void onNext(Result result) {
            if (!PatchProxy.proxy(new Object[]{result}, this, changeQuickRedirect, false, 22511, new Class[]{Result.class}, Void.TYPE).isSupported && BindPhoneActivity.this.isActive()) {
                com.max.hbutils.utils.c cVar = com.max.hbutils.utils.c.f73533a;
                com.max.hbutils.utils.c.f("成功");
                User userI = com.max.xiaoheihe.utils.i0.i();
                userI.setPhonenum(BindPhoneActivity.this.etPhone.getText().toString().trim());
                com.max.xiaoheihe.utils.i0.z(userI);
                BindPhoneActivity.this.setResult(-1);
                BindPhoneActivity.this.finish();
            }
        }

        @Override // com.max.hbcommon.network.d, io.reactivex.g0
        public /* bridge */ /* synthetic */ void onNext(Object obj) {
            if (PatchProxy.proxy(new Object[]{obj}, this, changeQuickRedirect, false, 22512, new Class[]{Object.class}, Void.TYPE).isSupported) {
                return;
            }
            onNext((Result) obj);
        }
    }

    static /* synthetic */ void O1(BindPhoneActivity bindPhoneActivity, boolean z10) {
        if (PatchProxy.proxy(new Object[]{bindPhoneActivity, new Byte(z10 ? (byte) 1 : (byte) 0)}, null, changeQuickRedirect, true, 22497, new Class[]{BindPhoneActivity.class, Boolean.TYPE}, Void.TYPE).isSupported) {
            return;
        }
        bindPhoneActivity.p2(z10);
    }

    static /* synthetic */ void R1(BindPhoneActivity bindPhoneActivity) {
        if (PatchProxy.proxy(new Object[]{bindPhoneActivity}, null, changeQuickRedirect, true, 22498, new Class[]{BindPhoneActivity.class}, Void.TYPE).isSupported) {
            return;
        }
        bindPhoneActivity.o2();
    }

    static /* synthetic */ void W1(BindPhoneActivity bindPhoneActivity, String str) {
        if (PatchProxy.proxy(new Object[]{bindPhoneActivity, str}, null, changeQuickRedirect, true, 22499, new Class[]{BindPhoneActivity.class, String.class}, Void.TYPE).isSupported) {
            return;
        }
        bindPhoneActivity.k2(str);
    }

    static /* synthetic */ void X1(BindPhoneActivity bindPhoneActivity, String str) {
        if (PatchProxy.proxy(new Object[]{bindPhoneActivity, str}, null, changeQuickRedirect, true, 22500, new Class[]{BindPhoneActivity.class, String.class}, Void.TYPE).isSupported) {
            return;
        }
        bindPhoneActivity.j2(str);
    }

    static /* synthetic */ void a2(BindPhoneActivity bindPhoneActivity, String str, String str2) {
        if (PatchProxy.proxy(new Object[]{bindPhoneActivity, str, str2}, null, changeQuickRedirect, true, 22495, new Class[]{BindPhoneActivity.class, String.class, String.class}, Void.TYPE).isSupported) {
            return;
        }
        bindPhoneActivity.n2(str, str2);
    }

    static /* synthetic */ void b2(BindPhoneActivity bindPhoneActivity, String str) {
        if (PatchProxy.proxy(new Object[]{bindPhoneActivity, str}, null, changeQuickRedirect, true, 22496, new Class[]{BindPhoneActivity.class, String.class}, Void.TYPE).isSupported) {
            return;
        }
        bindPhoneActivity.m2(str);
    }

    static /* synthetic */ int i2(BindPhoneActivity bindPhoneActivity) {
        int i10 = bindPhoneActivity.N - 1;
        bindPhoneActivity.N = i10;
        return i10;
    }

    private void j2(String str) {
        if (PatchProxy.proxy(new Object[]{str}, this, changeQuickRedirect, false, 22493, new Class[]{String.class}, Void.TYPE).isSupported) {
            return;
        }
        V((io.reactivex.disposables.b) com.max.xiaoheihe.network.i.a().x2(com.max.xiaoheihe.utils.w.a(this.P + this.etPhone.getText().toString().trim()), com.max.xiaoheihe.utils.w.a(this.etPwd.getText().toString().trim()), this.O).I5(io.reactivex.schedulers.b.d()).a4(io.reactivex.android.schedulers.a.c()).J5(new i()));
    }

    private void k2(String str) {
        if (PatchProxy.proxy(new Object[]{str}, this, changeQuickRedirect, false, 22492, new Class[]{String.class}, Void.TYPE).isSupported) {
            return;
        }
        com.max.xiaoheihe.utils.a.a(this, V0(), null, str, new h(str));
    }

    public static Intent l2(Context context) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{context}, null, changeQuickRedirect, true, 22484, new Class[]{Context.class}, Intent.class);
        return patchProxyResultProxy.isSupported ? (Intent) patchProxyResultProxy.result : new Intent(context, (Class<?>) BindPhoneActivity.class);
    }

    private void m2(String str) {
        if (PatchProxy.proxy(new Object[]{str}, this, changeQuickRedirect, false, 22490, new Class[]{String.class}, Void.TYPE).isSupported) {
            return;
        }
        V((io.reactivex.disposables.b) com.max.xiaoheihe.network.i.a().ba(com.max.xiaoheihe.utils.w.a(this.P + str)).I5(io.reactivex.schedulers.b.d()).a4(io.reactivex.android.schedulers.a.c()).J5(new f()));
    }

    private void n2(String str, String str2) {
        if (PatchProxy.proxy(new Object[]{str, str2}, this, changeQuickRedirect, false, 22491, new Class[]{String.class, String.class}, Void.TYPE).isSupported) {
            return;
        }
        V((io.reactivex.disposables.b) com.max.xiaoheihe.network.i.a().T1(com.max.xiaoheihe.utils.w.a(this.P + str), str2).I5(io.reactivex.schedulers.b.d()).a4(io.reactivex.android.schedulers.a.c()).J5(new g()));
    }

    private void o2() {
        if (PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 22489, new Class[0], Void.TYPE).isSupported) {
            return;
        }
        Timer timer = this.L;
        if (timer != null) {
            timer.cancel();
        }
        this.N = 60;
        this.L = new Timer(true);
        d dVar = new d();
        this.M = dVar;
        this.L.schedule(dVar, 1000L, 1000L);
    }

    private void p2(boolean z10) {
        if (PatchProxy.proxy(new Object[]{new Byte(z10 ? (byte) 1 : (byte) 0)}, this, changeQuickRedirect, false, 22487, new Class[]{Boolean.TYPE}, Void.TYPE).isSupported) {
            return;
        }
        if (z10) {
            this.tvGetCode.setEnabled(true);
            this.tvGetCode.setTextColor(com.max.xiaoheihe.utils.d.E(R.color.interactive_color));
            this.tvGetCode.setBackgroundDrawable(com.max.hbutils.utils.q.M(com.max.hbutils.utils.q.o(this.f66601b, R.color.transparent, 2.0f), this.f66601b, R.color.interactive_color, 1.0f));
        } else {
            this.tvGetCode.setEnabled(false);
            this.tvGetCode.setTextColor(com.max.xiaoheihe.utils.d.E(R.color.text_secondary_2_color));
            this.tvGetCode.setBackgroundDrawable(com.max.hbutils.utils.q.M(com.max.hbutils.utils.q.o(this.f66601b, R.color.transparent, 2.0f), this.f66601b, R.color.text_secondary_2_color, 1.0f));
        }
    }

    @Override // com.max.hbcommon.base.BaseActivity
    public void k1() {
        if (PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 22485, new Class[0], Void.TYPE).isSupported) {
            return;
        }
        setContentView(R.layout.activity_bind_phone);
        this.f66620u = ButterKnife.a(this);
        this.f66616q.setTitle(R.string.binded_phonenum);
        this.tvGetCode.setText(getString(R.string.get_verification_code));
        p2(true);
        this.tvAreaCode.setText(this.P);
    }

    @Override // androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, android.app.Activity
    public void onActivityResult(int i10, int i11, @androidx.annotation.p0 Intent intent) {
        Object[] objArr = {new Integer(i10), new Integer(i11), intent};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        Class cls = Integer.TYPE;
        if (PatchProxy.proxy(objArr, this, changeQuickRedirect2, false, 22494, new Class[]{cls, cls, Intent.class}, Void.TYPE).isSupported) {
            return;
        }
        if (i10 == 1 && i11 == -1) {
            String stringExtra = intent.getStringExtra(AreaCodeActivity.Q);
            this.P = stringExtra;
            this.tvAreaCode.setText(stringExtra);
        }
        super.onActivityResult(i10, i11, intent);
    }

    @Override // com.max.hbcommon.base.BaseActivity, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, android.app.Activity
    public void onDestroy() {
        if (PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 22488, new Class[0], Void.TYPE).isSupported) {
            return;
        }
        super.onDestroy();
        this.Q.removeCallbacksAndMessages(null);
        Timer timer = this.L;
        if (timer != null) {
            timer.cancel();
            this.L = null;
        }
        TimerTask timerTask = this.M;
        if (timerTask != null) {
            timerTask.cancel();
            this.M = null;
        }
    }

    @Override // com.max.hbcommon.base.BaseActivity
    public void q1() {
        if (PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 22486, new Class[0], Void.TYPE).isSupported) {
            return;
        }
        this.tvFinish.setOnClickListener(new a());
        this.tvGetCode.setOnClickListener(new b());
        this.vgAreaCode.setOnClickListener(new c());
    }
}
