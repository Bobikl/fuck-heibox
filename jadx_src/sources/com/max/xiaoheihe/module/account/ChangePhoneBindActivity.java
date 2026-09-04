package com.max.xiaoheihe.module.account;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.os.Handler;
import android.os.Message;
import android.view.View;
import android.view.ViewGroup;
import android.widget.EditText;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import android.widget.TextView;
import butterknife.BindView;
import butterknife.ButterKnife;
import com.max.hbcommon.base.BaseActivity;
import com.max.hbutils.bean.Result;
import com.max.xiaoheihe.R;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.PatchProxyResult;
import java.util.Timer;
import java.util.TimerTask;

/* JADX INFO: loaded from: classes9.dex */
public class ChangePhoneBindActivity extends BaseActivity {
    private static final int U = 1;
    private static final int V = 2;
    private static final int W = 1;
    public static ChangeQuickRedirect changeQuickRedirect;
    private Timer M;
    private TimerTask N;
    private String P;
    private String Q;
    private String R;

    @BindView(R.id.et_code)
    EditText etCode;

    @BindView(R.id.et_new)
    EditText etNew;

    @BindView(R.id.ll_number)
    LinearLayout llNumber;

    @BindView(R.id.textView)
    TextView textView;

    @BindView(R.id.tv_area_code)
    TextView tvAreaCode;

    @BindView(R.id.tv_current_account)
    TextView tvCurrentAccount;

    @BindView(R.id.tv_finish)
    TextView tvFinish;

    @BindView(R.id.tv_get_code)
    TextView tvGetCode;

    @BindView(R.id.vg_area_code)
    ViewGroup vgAreaCode;

    @BindView(R.id.vg_current_account)
    RelativeLayout vgCurrentAccount;

    @BindView(R.id.vg_new_phone)
    LinearLayout vgNewPhone;
    private int L = 1;
    private int O = 60;
    private String S = "+86";
    private final Handler T = new e();

    public class a implements View.OnClickListener {
        public static ChangeQuickRedirect changeQuickRedirect;

        a() {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            if (PatchProxy.proxy(new Object[]{view}, this, changeQuickRedirect, false, 22603, new Class[]{View.class}, Void.TYPE).isSupported) {
                return;
            }
            if (ChangePhoneBindActivity.this.L == 1) {
                ChangePhoneBindActivity changePhoneBindActivity = ChangePhoneBindActivity.this;
                ChangePhoneBindActivity.c2(changePhoneBindActivity, changePhoneBindActivity.P, ChangePhoneBindActivity.this.etCode.getText().toString().trim(), false);
                return;
            }
            Activity activity = ((BaseActivity) ChangePhoneBindActivity.this).f66601b;
            ChangePhoneBindActivity changePhoneBindActivity2 = ChangePhoneBindActivity.this;
            if (com.max.hbcommon.utils.c.g(activity, changePhoneBindActivity2.etNew, changePhoneBindActivity2.getString(R.string.phonenum_empty_msg))) {
                return;
            }
            Activity activity2 = ((BaseActivity) ChangePhoneBindActivity.this).f66601b;
            ChangePhoneBindActivity changePhoneBindActivity3 = ChangePhoneBindActivity.this;
            if (com.max.hbcommon.utils.c.g(activity2, changePhoneBindActivity3.etCode, changePhoneBindActivity3.getString(R.string.verification_code_empty))) {
                return;
            }
            ChangePhoneBindActivity.c2(ChangePhoneBindActivity.this, ChangePhoneBindActivity.this.S + ChangePhoneBindActivity.this.etNew.getText().toString().trim(), ChangePhoneBindActivity.this.etCode.getText().toString().trim(), true);
        }
    }

    public class b implements View.OnClickListener {
        public static ChangeQuickRedirect changeQuickRedirect;

        b() {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            if (PatchProxy.proxy(new Object[]{view}, this, changeQuickRedirect, false, 22604, new Class[]{View.class}, Void.TYPE).isSupported) {
                return;
            }
            if (ChangePhoneBindActivity.this.L == 1) {
                ChangePhoneBindActivity changePhoneBindActivity = ChangePhoneBindActivity.this;
                ChangePhoneBindActivity.i2(changePhoneBindActivity, changePhoneBindActivity.P);
            } else if (ChangePhoneBindActivity.this.L == 2) {
                ChangePhoneBindActivity.i2(ChangePhoneBindActivity.this, ChangePhoneBindActivity.this.S + ChangePhoneBindActivity.this.etNew.getText().toString().trim());
            }
        }
    }

    public class c implements View.OnClickListener {
        public static ChangeQuickRedirect changeQuickRedirect;

        c() {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            if (PatchProxy.proxy(new Object[]{view}, this, changeQuickRedirect, false, 22605, new Class[]{View.class}, Void.TYPE).isSupported) {
                return;
            }
            ((BaseActivity) ChangePhoneBindActivity.this).f66601b.startActivityForResult(AreaCodeActivity.T1(((BaseActivity) ChangePhoneBindActivity.this).f66601b), 1);
        }
    }

    public class d extends TimerTask {
        public static ChangeQuickRedirect changeQuickRedirect;

        d() {
        }

        @Override // java.util.TimerTask, java.lang.Runnable
        public void run() {
            if (PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 22606, new Class[0], Void.TYPE).isSupported) {
                return;
            }
            Message message = new Message();
            message.what = 1;
            ChangePhoneBindActivity.this.T.sendMessage(message);
        }
    }

    public class e extends Handler {
        public static ChangeQuickRedirect changeQuickRedirect;

        e() {
        }

        @Override // android.os.Handler
        public void handleMessage(Message message) {
            if (PatchProxy.proxy(new Object[]{message}, this, changeQuickRedirect, false, 22607, new Class[]{Message.class}, Void.TYPE).isSupported) {
                return;
            }
            super.handleMessage(message);
            if (ChangePhoneBindActivity.this.O <= 1) {
                ChangePhoneBindActivity.this.N.cancel();
                ChangePhoneBindActivity changePhoneBindActivity = ChangePhoneBindActivity.this;
                changePhoneBindActivity.tvGetCode.setText(changePhoneBindActivity.getString(R.string.resend));
                ChangePhoneBindActivity.T1(ChangePhoneBindActivity.this, true);
                return;
            }
            ChangePhoneBindActivity.this.tvGetCode.setText(ChangePhoneBindActivity.R1(ChangePhoneBindActivity.this) + "s重新发送");
            ChangePhoneBindActivity.T1(ChangePhoneBindActivity.this, false);
        }
    }

    public class f extends com.max.hbcommon.network.d<Result> {
        public static ChangeQuickRedirect changeQuickRedirect;

        f() {
        }

        public void onNext(Result result) {
            if (!PatchProxy.proxy(new Object[]{result}, this, changeQuickRedirect, false, 22608, new Class[]{Result.class}, Void.TYPE).isSupported && ChangePhoneBindActivity.this.isActive()) {
                super.onNext(result);
                com.max.hbutils.utils.c cVar = com.max.hbutils.utils.c.f73533a;
                com.max.hbutils.utils.c.f("验证码已经发送");
                ChangePhoneBindActivity.W1(ChangePhoneBindActivity.this);
            }
        }

        @Override // com.max.hbcommon.network.d, io.reactivex.g0
        public /* bridge */ /* synthetic */ void onNext(Object obj) {
            if (PatchProxy.proxy(new Object[]{obj}, this, changeQuickRedirect, false, 22609, new Class[]{Object.class}, Void.TYPE).isSupported) {
                return;
            }
            onNext((Result) obj);
        }
    }

    public class g extends com.max.hbcommon.network.d<Result> {
        public static ChangeQuickRedirect changeQuickRedirect;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ boolean f77580b;

        g(boolean z10) {
            this.f77580b = z10;
        }

        public void onNext(Result result) {
            if (!PatchProxy.proxy(new Object[]{result}, this, changeQuickRedirect, false, 22610, new Class[]{Result.class}, Void.TYPE).isSupported && ChangePhoneBindActivity.this.isActive()) {
                if (!this.f77580b) {
                    ChangePhoneBindActivity.this.Q = result.getKeyMap().get("sid");
                    ChangePhoneBindActivity.this.L = 2;
                    ChangePhoneBindActivity.a2(ChangePhoneBindActivity.this);
                } else {
                    ChangePhoneBindActivity.this.R = result.getKeyMap().get("sid");
                    ChangePhoneBindActivity.Y1(ChangePhoneBindActivity.this, ChangePhoneBindActivity.this.S + ChangePhoneBindActivity.this.etNew.getText().toString().trim());
                }
            }
        }

        @Override // com.max.hbcommon.network.d, io.reactivex.g0
        public /* bridge */ /* synthetic */ void onNext(Object obj) {
            if (PatchProxy.proxy(new Object[]{obj}, this, changeQuickRedirect, false, 22611, new Class[]{Object.class}, Void.TYPE).isSupported) {
                return;
            }
            onNext((Result) obj);
        }
    }

    public class h implements com.max.xiaoheihe.utils.a.b {
        public static ChangeQuickRedirect changeQuickRedirect;

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ String f77582a;

        h(String str) {
            this.f77582a = str;
        }

        @Override // com.max.xiaoheihe.utils.a.b
        public void a() {
            if (PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 22612, new Class[0], Void.TYPE).isSupported) {
                return;
            }
            ChangePhoneBindActivity.b2(ChangePhoneBindActivity.this, this.f77582a);
        }
    }

    public class i extends com.max.hbcommon.network.d<Result> {
        public static ChangeQuickRedirect changeQuickRedirect;

        i() {
        }

        public void onNext(Result result) {
            if (!PatchProxy.proxy(new Object[]{result}, this, changeQuickRedirect, false, 22613, new Class[]{Result.class}, Void.TYPE).isSupported && ChangePhoneBindActivity.this.isActive()) {
                com.max.hbutils.utils.c cVar = com.max.hbutils.utils.c.f73533a;
                com.max.hbutils.utils.c.f("成功");
                ChangePhoneBindActivity.this.setResult(-1);
                ChangePhoneBindActivity.this.finish();
            }
        }

        @Override // com.max.hbcommon.network.d, io.reactivex.g0
        public /* bridge */ /* synthetic */ void onNext(Object obj) {
            if (PatchProxy.proxy(new Object[]{obj}, this, changeQuickRedirect, false, 22614, new Class[]{Object.class}, Void.TYPE).isSupported) {
                return;
            }
            onNext((Result) obj);
        }
    }

    static /* synthetic */ int R1(ChangePhoneBindActivity changePhoneBindActivity) {
        int i10 = changePhoneBindActivity.O - 1;
        changePhoneBindActivity.O = i10;
        return i10;
    }

    static /* synthetic */ void T1(ChangePhoneBindActivity changePhoneBindActivity, boolean z10) {
        if (PatchProxy.proxy(new Object[]{changePhoneBindActivity, new Byte(z10 ? (byte) 1 : (byte) 0)}, null, changeQuickRedirect, true, 22598, new Class[]{ChangePhoneBindActivity.class, Boolean.TYPE}, Void.TYPE).isSupported) {
            return;
        }
        changePhoneBindActivity.v2(z10);
    }

    static /* synthetic */ void W1(ChangePhoneBindActivity changePhoneBindActivity) {
        if (PatchProxy.proxy(new Object[]{changePhoneBindActivity}, null, changeQuickRedirect, true, 22599, new Class[]{ChangePhoneBindActivity.class}, Void.TYPE).isSupported) {
            return;
        }
        changePhoneBindActivity.r2();
    }

    static /* synthetic */ void Y1(ChangePhoneBindActivity changePhoneBindActivity, String str) {
        if (PatchProxy.proxy(new Object[]{changePhoneBindActivity, str}, null, changeQuickRedirect, true, 22600, new Class[]{ChangePhoneBindActivity.class, String.class}, Void.TYPE).isSupported) {
            return;
        }
        changePhoneBindActivity.n2(str);
    }

    static /* synthetic */ void a2(ChangePhoneBindActivity changePhoneBindActivity) {
        if (PatchProxy.proxy(new Object[]{changePhoneBindActivity}, null, changeQuickRedirect, true, 22601, new Class[]{ChangePhoneBindActivity.class}, Void.TYPE).isSupported) {
            return;
        }
        changePhoneBindActivity.u2();
    }

    static /* synthetic */ void b2(ChangePhoneBindActivity changePhoneBindActivity, String str) {
        if (PatchProxy.proxy(new Object[]{changePhoneBindActivity, str}, null, changeQuickRedirect, true, 22602, new Class[]{ChangePhoneBindActivity.class, String.class}, Void.TYPE).isSupported) {
            return;
        }
        changePhoneBindActivity.m2(str);
    }

    static /* synthetic */ void c2(ChangePhoneBindActivity changePhoneBindActivity, String str, String str2, boolean z10) {
        if (PatchProxy.proxy(new Object[]{changePhoneBindActivity, str, str2, new Byte(z10 ? (byte) 1 : (byte) 0)}, null, changeQuickRedirect, true, 22596, new Class[]{ChangePhoneBindActivity.class, String.class, String.class, Boolean.TYPE}, Void.TYPE).isSupported) {
            return;
        }
        changePhoneBindActivity.q2(str, str2, z10);
    }

    static /* synthetic */ void i2(ChangePhoneBindActivity changePhoneBindActivity, String str) {
        if (PatchProxy.proxy(new Object[]{changePhoneBindActivity, str}, null, changeQuickRedirect, true, 22597, new Class[]{ChangePhoneBindActivity.class, String.class}, Void.TYPE).isSupported) {
            return;
        }
        changePhoneBindActivity.p2(str);
    }

    private void m2(String str) {
        if (PatchProxy.proxy(new Object[]{str}, this, changeQuickRedirect, false, 22594, new Class[]{String.class}, Void.TYPE).isSupported) {
            return;
        }
        V((io.reactivex.disposables.b) com.max.xiaoheihe.network.i.a().ua(com.max.xiaoheihe.utils.w.a(str), com.max.xiaoheihe.utils.w.a(this.P), this.Q, this.R).I5(io.reactivex.schedulers.b.d()).a4(io.reactivex.android.schedulers.a.c()).J5(new i()));
    }

    private void n2(String str) {
        if (PatchProxy.proxy(new Object[]{str}, this, changeQuickRedirect, false, 22593, new Class[]{String.class}, Void.TYPE).isSupported) {
            return;
        }
        com.max.xiaoheihe.utils.a.a(this, V0(), null, str, new h(str));
    }

    public static Intent o2(Context context, String str) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{context, str}, null, changeQuickRedirect, true, 22584, new Class[]{Context.class, String.class}, Intent.class);
        if (patchProxyResultProxy.isSupported) {
            return (Intent) patchProxyResultProxy.result;
        }
        Intent intent = new Intent(context, (Class<?>) ChangePhoneBindActivity.class);
        intent.putExtra("phonenum", str);
        return intent;
    }

    private void p2(String str) {
        if (PatchProxy.proxy(new Object[]{str}, this, changeQuickRedirect, false, 22591, new Class[]{String.class}, Void.TYPE).isSupported) {
            return;
        }
        V((io.reactivex.disposables.b) com.max.xiaoheihe.network.i.a().ba(com.max.xiaoheihe.utils.w.a(str)).I5(io.reactivex.schedulers.b.d()).a4(io.reactivex.android.schedulers.a.c()).J5(new f()));
    }

    private void q2(String str, String str2, boolean z10) {
        if (PatchProxy.proxy(new Object[]{str, str2, new Byte(z10 ? (byte) 1 : (byte) 0)}, this, changeQuickRedirect, false, 22592, new Class[]{String.class, String.class, Boolean.TYPE}, Void.TYPE).isSupported) {
            return;
        }
        V((io.reactivex.disposables.b) com.max.xiaoheihe.network.i.a().T1(com.max.xiaoheihe.utils.w.a(str), str2).I5(io.reactivex.schedulers.b.d()).a4(io.reactivex.android.schedulers.a.c()).J5(new g(z10)));
    }

    private void r2() {
        if (PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 22590, new Class[0], Void.TYPE).isSupported) {
            return;
        }
        Timer timer = this.M;
        if (timer != null) {
            timer.cancel();
        }
        this.O = 60;
        this.M = new Timer(true);
        d dVar = new d();
        this.N = dVar;
        this.M.schedule(dVar, 1000L, 1000L);
    }

    private void u2() {
        if (PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 22587, new Class[0], Void.TYPE).isSupported) {
            return;
        }
        this.T.removeCallbacksAndMessages(null);
        Timer timer = this.M;
        if (timer != null) {
            timer.cancel();
            this.M = null;
        }
        TimerTask timerTask = this.N;
        if (timerTask != null) {
            timerTask.cancel();
            this.N = null;
        }
        this.tvAreaCode.setText(this.S);
        this.etCode.setText("");
        this.tvGetCode.setText(getString(R.string.get_verification_code));
        v2(true);
        int i10 = this.L;
        if (i10 == 1) {
            this.vgCurrentAccount.setVisibility(0);
            this.vgNewPhone.setVisibility(8);
            this.tvFinish.setText(R.string.next);
        } else if (i10 == 2) {
            this.vgCurrentAccount.setVisibility(8);
            this.vgNewPhone.setVisibility(0);
            this.tvFinish.setText("完成");
        }
    }

    private void v2(boolean z10) {
        if (PatchProxy.proxy(new Object[]{new Byte(z10 ? (byte) 1 : (byte) 0)}, this, changeQuickRedirect, false, 22588, new Class[]{Boolean.TYPE}, Void.TYPE).isSupported) {
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
        if (PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 22585, new Class[0], Void.TYPE).isSupported) {
            return;
        }
        setContentView(R.layout.activity_change_phone);
        this.f66620u = ButterKnife.a(this);
        this.f66616q.setTitle(R.string.change_bind_phone);
        String stringExtra = getIntent().getStringExtra("phonenum");
        this.P = stringExtra;
        if (com.max.hbcommon.utils.c.u(stringExtra)) {
            finish();
        } else {
            this.tvCurrentAccount.setText(new StringBuilder(this.P).replace(3, 7, "****"));
        }
        u2();
    }

    @Override // androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, android.app.Activity
    public void onActivityResult(int i10, int i11, @androidx.annotation.p0 Intent intent) {
        Object[] objArr = {new Integer(i10), new Integer(i11), intent};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        Class cls = Integer.TYPE;
        if (PatchProxy.proxy(objArr, this, changeQuickRedirect2, false, 22595, new Class[]{cls, cls, Intent.class}, Void.TYPE).isSupported) {
            return;
        }
        if (i10 == 1 && i11 == -1) {
            String stringExtra = intent.getStringExtra(AreaCodeActivity.Q);
            this.S = stringExtra;
            this.tvAreaCode.setText(stringExtra);
        }
        super.onActivityResult(i10, i11, intent);
    }

    @Override // com.max.hbcommon.base.BaseActivity, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, android.app.Activity
    public void onDestroy() {
        if (PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 22589, new Class[0], Void.TYPE).isSupported) {
            return;
        }
        super.onDestroy();
        this.T.removeCallbacksAndMessages(null);
        Timer timer = this.M;
        if (timer != null) {
            timer.cancel();
            this.M = null;
        }
        TimerTask timerTask = this.N;
        if (timerTask != null) {
            timerTask.cancel();
            this.N = null;
        }
    }

    @Override // com.max.hbcommon.base.BaseActivity
    public void q1() {
        if (PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 22586, new Class[0], Void.TYPE).isSupported) {
            return;
        }
        this.tvFinish.setOnClickListener(new a());
        this.tvGetCode.setOnClickListener(new b());
        this.vgAreaCode.setOnClickListener(new c());
    }
}
