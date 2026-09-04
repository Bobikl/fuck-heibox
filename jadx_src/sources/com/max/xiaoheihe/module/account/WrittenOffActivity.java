package com.max.xiaoheihe.module.account;

import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;
import android.os.Handler;
import android.os.Message;
import android.view.View;
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
public class WrittenOffActivity extends BaseActivity {
    private static final int S = 1;
    private static final int T = 2;
    public static ChangeQuickRedirect changeQuickRedirect;
    private Timer M;
    private TimerTask N;
    private String P;
    private String Q;

    @BindView(R.id.et_code)
    EditText etCode;

    @BindView(R.id.et_new)
    EditText etNew;

    @BindView(R.id.ll_number)
    LinearLayout llNumber;

    @BindView(R.id.textView)
    TextView textView;

    @BindView(R.id.tv_current_account)
    TextView tvCurrentAccount;

    @BindView(R.id.tv_finish)
    TextView tvFinish;

    @BindView(R.id.tv_get_code)
    TextView tvGetCode;

    @BindView(R.id.vg_current_account)
    RelativeLayout vgCurrentAccount;

    @BindView(R.id.vg_new_phone)
    LinearLayout vgNewPhone;
    private int L = 1;
    private int O = 60;
    private final Handler R = new d();

    public class a implements View.OnClickListener {
        public static ChangeQuickRedirect changeQuickRedirect;

        /* JADX INFO: renamed from: com.max.xiaoheihe.module.account.WrittenOffActivity$a$a, reason: collision with other inner class name */
        public class DialogInterfaceOnClickListenerC0646a implements DialogInterface.OnClickListener {
            public static ChangeQuickRedirect changeQuickRedirect;

            DialogInterfaceOnClickListenerC0646a() {
            }

            @Override // android.content.DialogInterface.OnClickListener
            public void onClick(DialogInterface dialogInterface, int i10) {
                if (PatchProxy.proxy(new Object[]{dialogInterface, new Integer(i10)}, this, changeQuickRedirect, false, 24737, new Class[]{DialogInterface.class, Integer.TYPE}, Void.TYPE).isSupported) {
                    return;
                }
                WrittenOffActivity writtenOffActivity = WrittenOffActivity.this;
                WrittenOffActivity.R1(writtenOffActivity, writtenOffActivity.P, WrittenOffActivity.this.etCode.getText().toString().trim());
                dialogInterface.dismiss();
            }
        }

        public class b implements DialogInterface.OnClickListener {
            public static ChangeQuickRedirect changeQuickRedirect;

            b() {
            }

            @Override // android.content.DialogInterface.OnClickListener
            public void onClick(DialogInterface dialogInterface, int i10) {
                if (PatchProxy.proxy(new Object[]{dialogInterface, new Integer(i10)}, this, changeQuickRedirect, false, 24738, new Class[]{DialogInterface.class, Integer.TYPE}, Void.TYPE).isSupported) {
                    return;
                }
                dialogInterface.dismiss();
            }
        }

        a() {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            if (PatchProxy.proxy(new Object[]{view}, this, changeQuickRedirect, false, 24736, new Class[]{View.class}, Void.TYPE).isSupported) {
                return;
            }
            com.max.hbcommon.view.a.f fVar = new com.max.hbcommon.view.a.f(((BaseActivity) WrittenOffActivity.this).f66601b);
            fVar.y(com.max.xiaoheihe.utils.d.n0(R.string.written_off_confirm));
            fVar.l(com.max.xiaoheihe.utils.d.n0(R.string.written_off_msg));
            com.max.hbcommon.view.a aVarD = fVar.d();
            aVarD.u(com.max.xiaoheihe.utils.d.n0(R.string.confirm), new DialogInterfaceOnClickListenerC0646a());
            aVarD.r(com.max.xiaoheihe.utils.d.n0(R.string.cancel), new b());
            aVarD.show();
        }
    }

    public class b implements View.OnClickListener {
        public static ChangeQuickRedirect changeQuickRedirect;

        b() {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            if (PatchProxy.proxy(new Object[]{view}, this, changeQuickRedirect, false, 24739, new Class[]{View.class}, Void.TYPE).isSupported) {
                return;
            }
            WrittenOffActivity writtenOffActivity = WrittenOffActivity.this;
            WrittenOffActivity.T1(writtenOffActivity, writtenOffActivity.P);
        }
    }

    public class c extends TimerTask {
        public static ChangeQuickRedirect changeQuickRedirect;

        c() {
        }

        @Override // java.util.TimerTask, java.lang.Runnable
        public void run() {
            if (PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 24740, new Class[0], Void.TYPE).isSupported) {
                return;
            }
            Message message = new Message();
            message.what = 1;
            WrittenOffActivity.this.R.sendMessage(message);
        }
    }

    public class d extends Handler {
        public static ChangeQuickRedirect changeQuickRedirect;

        d() {
        }

        @Override // android.os.Handler
        public void handleMessage(Message message) {
            if (PatchProxy.proxy(new Object[]{message}, this, changeQuickRedirect, false, 24741, new Class[]{Message.class}, Void.TYPE).isSupported) {
                return;
            }
            super.handleMessage(message);
            if (WrittenOffActivity.this.O <= 1) {
                WrittenOffActivity.this.N.cancel();
                WrittenOffActivity writtenOffActivity = WrittenOffActivity.this;
                writtenOffActivity.tvGetCode.setText(writtenOffActivity.getString(R.string.resend));
                WrittenOffActivity.Y1(WrittenOffActivity.this, true);
                return;
            }
            WrittenOffActivity.this.tvGetCode.setText(WrittenOffActivity.X1(WrittenOffActivity.this) + "s重新发送");
            WrittenOffActivity.Y1(WrittenOffActivity.this, false);
        }
    }

    public class e extends com.max.hbcommon.network.d<Result> {
        public static ChangeQuickRedirect changeQuickRedirect;

        e() {
        }

        public void onNext(Result result) {
            if (!PatchProxy.proxy(new Object[]{result}, this, changeQuickRedirect, false, 24742, new Class[]{Result.class}, Void.TYPE).isSupported && WrittenOffActivity.this.isActive()) {
                super.onNext(result);
                com.max.hbutils.utils.c cVar = com.max.hbutils.utils.c.f73533a;
                com.max.hbutils.utils.c.f("验证码已经发送");
                WrittenOffActivity.a2(WrittenOffActivity.this);
            }
        }

        @Override // com.max.hbcommon.network.d, io.reactivex.g0
        public /* bridge */ /* synthetic */ void onNext(Object obj) {
            if (PatchProxy.proxy(new Object[]{obj}, this, changeQuickRedirect, false, 24743, new Class[]{Object.class}, Void.TYPE).isSupported) {
                return;
            }
            onNext((Result) obj);
        }
    }

    public class f extends com.max.hbcommon.network.d<Result> {
        public static ChangeQuickRedirect changeQuickRedirect;

        f() {
        }

        public void onNext(Result result) {
            if (!PatchProxy.proxy(new Object[]{result}, this, changeQuickRedirect, false, 24744, new Class[]{Result.class}, Void.TYPE).isSupported && WrittenOffActivity.this.isActive()) {
                WrittenOffActivity.this.Q = result.getKeyMap().get("sid");
                WrittenOffActivity.O1(WrittenOffActivity.this);
            }
        }

        @Override // com.max.hbcommon.network.d, io.reactivex.g0
        public /* bridge */ /* synthetic */ void onNext(Object obj) {
            if (PatchProxy.proxy(new Object[]{obj}, this, changeQuickRedirect, false, 24745, new Class[]{Object.class}, Void.TYPE).isSupported) {
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
            if (!PatchProxy.proxy(new Object[]{result}, this, changeQuickRedirect, false, 24746, new Class[]{Result.class}, Void.TYPE).isSupported && WrittenOffActivity.this.isActive()) {
                com.max.hbutils.utils.c cVar = com.max.hbutils.utils.c.f73533a;
                com.max.hbutils.utils.c.f("成功");
                com.max.xiaoheihe.utils.d.W0(((BaseActivity) WrittenOffActivity.this).f66601b);
            }
        }

        @Override // com.max.hbcommon.network.d, io.reactivex.g0
        public /* bridge */ /* synthetic */ void onNext(Object obj) {
            if (PatchProxy.proxy(new Object[]{obj}, this, changeQuickRedirect, false, 24747, new Class[]{Object.class}, Void.TYPE).isSupported) {
                return;
            }
            onNext((Result) obj);
        }
    }

    static /* synthetic */ void O1(WrittenOffActivity writtenOffActivity) {
        if (PatchProxy.proxy(new Object[]{writtenOffActivity}, null, changeQuickRedirect, true, 24735, new Class[]{WrittenOffActivity.class}, Void.TYPE).isSupported) {
            return;
        }
        writtenOffActivity.k2();
    }

    static /* synthetic */ void R1(WrittenOffActivity writtenOffActivity, String str, String str2) {
        if (PatchProxy.proxy(new Object[]{writtenOffActivity, str, str2}, null, changeQuickRedirect, true, 24731, new Class[]{WrittenOffActivity.class, String.class, String.class}, Void.TYPE).isSupported) {
            return;
        }
        writtenOffActivity.f2(str, str2);
    }

    static /* synthetic */ void T1(WrittenOffActivity writtenOffActivity, String str) {
        if (PatchProxy.proxy(new Object[]{writtenOffActivity, str}, null, changeQuickRedirect, true, 24732, new Class[]{WrittenOffActivity.class, String.class}, Void.TYPE).isSupported) {
            return;
        }
        writtenOffActivity.e2(str);
    }

    static /* synthetic */ int X1(WrittenOffActivity writtenOffActivity) {
        int i10 = writtenOffActivity.O - 1;
        writtenOffActivity.O = i10;
        return i10;
    }

    static /* synthetic */ void Y1(WrittenOffActivity writtenOffActivity, boolean z10) {
        if (PatchProxy.proxy(new Object[]{writtenOffActivity, new Byte(z10 ? (byte) 1 : (byte) 0)}, null, changeQuickRedirect, true, 24733, new Class[]{WrittenOffActivity.class, Boolean.TYPE}, Void.TYPE).isSupported) {
            return;
        }
        writtenOffActivity.j2(z10);
    }

    static /* synthetic */ void a2(WrittenOffActivity writtenOffActivity) {
        if (PatchProxy.proxy(new Object[]{writtenOffActivity}, null, changeQuickRedirect, true, 24734, new Class[]{WrittenOffActivity.class}, Void.TYPE).isSupported) {
            return;
        }
        writtenOffActivity.h2();
    }

    public static Intent c2(Context context, String str) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{context, str}, null, changeQuickRedirect, true, 24721, new Class[]{Context.class, String.class}, Intent.class);
        if (patchProxyResultProxy.isSupported) {
            return (Intent) patchProxyResultProxy.result;
        }
        Intent intent = new Intent(context, (Class<?>) WrittenOffActivity.class);
        intent.putExtra("phonenum", str);
        return intent;
    }

    private void e2(String str) {
        if (PatchProxy.proxy(new Object[]{str}, this, changeQuickRedirect, false, 24728, new Class[]{String.class}, Void.TYPE).isSupported) {
            return;
        }
        V((io.reactivex.disposables.b) com.max.xiaoheihe.network.i.a().ba(com.max.xiaoheihe.utils.w.a(str)).I5(io.reactivex.schedulers.b.d()).a4(io.reactivex.android.schedulers.a.c()).J5(new e()));
    }

    private void f2(String str, String str2) {
        if (PatchProxy.proxy(new Object[]{str, str2}, this, changeQuickRedirect, false, 24729, new Class[]{String.class, String.class}, Void.TYPE).isSupported) {
            return;
        }
        V((io.reactivex.disposables.b) com.max.xiaoheihe.network.i.a().T1(com.max.xiaoheihe.utils.w.a(str), str2).I5(io.reactivex.schedulers.b.d()).a4(io.reactivex.android.schedulers.a.c()).J5(new f()));
    }

    private void h2() {
        if (PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 24727, new Class[0], Void.TYPE).isSupported) {
            return;
        }
        Timer timer = this.M;
        if (timer != null) {
            timer.cancel();
        }
        this.O = 60;
        this.M = new Timer(true);
        c cVar = new c();
        this.N = cVar;
        this.M.schedule(cVar, 1000L, 1000L);
    }

    private void i2() {
        if (PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 24724, new Class[0], Void.TYPE).isSupported) {
            return;
        }
        this.R.removeCallbacksAndMessages(null);
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
        this.etCode.setText("");
        this.tvGetCode.setText(getString(R.string.get_verification_code));
        j2(true);
        this.vgCurrentAccount.setVisibility(0);
        this.vgNewPhone.setVisibility(8);
        this.tvFinish.setText(R.string.written_off);
    }

    private void j2(boolean z10) {
        if (PatchProxy.proxy(new Object[]{new Byte(z10 ? (byte) 1 : (byte) 0)}, this, changeQuickRedirect, false, 24725, new Class[]{Boolean.TYPE}, Void.TYPE).isSupported) {
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

    private void k2() {
        if (PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 24730, new Class[0], Void.TYPE).isSupported) {
            return;
        }
        V((io.reactivex.disposables.b) com.max.xiaoheihe.network.i.a().T3(com.max.xiaoheihe.utils.w.a(this.P), this.Q).I5(io.reactivex.schedulers.b.d()).a4(io.reactivex.android.schedulers.a.c()).J5(new g()));
    }

    @Override // com.max.hbcommon.base.BaseActivity
    public void k1() {
        if (PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 24722, new Class[0], Void.TYPE).isSupported) {
            return;
        }
        setContentView(R.layout.activity_change_phone);
        this.f66620u = ButterKnife.a(this);
        this.f66616q.setTitle(R.string.written_off_verify);
        String stringExtra = getIntent().getStringExtra("phonenum");
        this.P = stringExtra;
        if (com.max.hbcommon.utils.c.u(stringExtra)) {
            finish();
        } else {
            this.tvCurrentAccount.setText(new StringBuilder(this.P).replace(3, 7, "****"));
        }
        i2();
    }

    @Override // com.max.hbcommon.base.BaseActivity, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, android.app.Activity
    public void onDestroy() {
        if (PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 24726, new Class[0], Void.TYPE).isSupported) {
            return;
        }
        super.onDestroy();
        this.R.removeCallbacksAndMessages(null);
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
        if (PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 24723, new Class[0], Void.TYPE).isSupported) {
            return;
        }
        this.tvFinish.setOnClickListener(new a());
        this.tvGetCode.setOnClickListener(new b());
    }
}
