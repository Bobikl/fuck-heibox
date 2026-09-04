package com.max.xiaoheihe.module.account;

import android.os.Handler;
import android.os.Message;
import android.view.View;
import android.widget.LinearLayout;
import com.max.hbcommon.base.BaseActivity;
import com.max.hbcustomview.AutoPlayView;
import com.max.hbcustomview.PinEntryEditText;
import com.max.hbutils.bean.Result;
import com.max.hbutils.utils.ViewUtils;
import com.max.xiaoheihe.R;
import com.max.xiaoheihe.bean.account.AuthInfoObj;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import df.c3;
import java.util.List;
import java.util.Timer;
import java.util.TimerTask;

/* JADX INFO: loaded from: classes9.dex */
@ig.d(path = {lb.d.f131237q4})
public class VerifyPhoneActivity extends BaseActivity {
    public static ChangeQuickRedirect changeQuickRedirect;
    private c3 L;
    private String M;
    private Timer N;
    private TimerTask O;
    private int P = 60;
    private final Handler Q = new g();

    public class a implements PinEntryEditText.i {
        public static ChangeQuickRedirect changeQuickRedirect;

        a() {
        }

        @Override // com.max.hbcustomview.PinEntryEditText.i
        public void a(CharSequence charSequence) {
            if (PatchProxy.proxy(new Object[]{charSequence}, this, changeQuickRedirect, false, 24662, new Class[]{CharSequence.class}, Void.TYPE).isSupported) {
                return;
            }
            VerifyPhoneActivity.M1(VerifyPhoneActivity.this, charSequence.toString());
        }
    }

    public class b implements View.OnClickListener {
        public static ChangeQuickRedirect changeQuickRedirect;

        b() {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            if (PatchProxy.proxy(new Object[]{view}, this, changeQuickRedirect, false, 24663, new Class[]{View.class}, Void.TYPE).isSupported) {
                return;
            }
            VerifyPhoneActivity verifyPhoneActivity = VerifyPhoneActivity.this;
            VerifyPhoneActivity.Q1(verifyPhoneActivity, verifyPhoneActivity.M);
        }
    }

    public class c extends com.max.hbcommon.network.d<Result<List<AuthInfoObj>>> {
        public static ChangeQuickRedirect changeQuickRedirect;

        c() {
        }

        @Override // com.max.hbcommon.network.d, io.reactivex.g0
        public void onError(Throwable th2) {
            if (!PatchProxy.proxy(new Object[]{th2}, this, changeQuickRedirect, false, 24664, new Class[]{Throwable.class}, Void.TYPE).isSupported && VerifyPhoneActivity.this.isActive()) {
                super.onError(th2);
                VerifyPhoneActivity.R1(VerifyPhoneActivity.this);
            }
        }

        public void onNext(Result<List<AuthInfoObj>> result) {
            if (!PatchProxy.proxy(new Object[]{result}, this, changeQuickRedirect, false, 24665, new Class[]{Result.class}, Void.TYPE).isSupported && VerifyPhoneActivity.this.isActive()) {
                super.onNext(result);
                if (com.max.hbcommon.utils.c.w(result.getResult())) {
                    return;
                }
                VerifyPhoneActivity.T1(VerifyPhoneActivity.this, result.getResult());
            }
        }

        @Override // com.max.hbcommon.network.d, io.reactivex.g0
        public /* bridge */ /* synthetic */ void onNext(Object obj) {
            if (PatchProxy.proxy(new Object[]{obj}, this, changeQuickRedirect, false, 24666, new Class[]{Object.class}, Void.TYPE).isSupported) {
                return;
            }
            onNext((Result<List<AuthInfoObj>>) obj);
        }
    }

    public class d extends com.max.hbcommon.network.d<Result> {
        public static ChangeQuickRedirect changeQuickRedirect;

        d() {
        }

        public void onNext(Result result) {
            if (!PatchProxy.proxy(new Object[]{result}, this, changeQuickRedirect, false, 24667, new Class[]{Result.class}, Void.TYPE).isSupported && VerifyPhoneActivity.this.isActive()) {
                super.onNext(result);
                VerifyPhoneActivity.V1(VerifyPhoneActivity.this);
            }
        }

        @Override // com.max.hbcommon.network.d, io.reactivex.g0
        public /* bridge */ /* synthetic */ void onNext(Object obj) {
            if (PatchProxy.proxy(new Object[]{obj}, this, changeQuickRedirect, false, 24668, new Class[]{Object.class}, Void.TYPE).isSupported) {
                return;
            }
            onNext((Result) obj);
        }
    }

    public class e extends com.max.hbcommon.network.d<Result> {
        public static ChangeQuickRedirect changeQuickRedirect;

        e() {
        }

        public void onNext(Result result) {
            if (!PatchProxy.proxy(new Object[]{result}, this, changeQuickRedirect, false, 24669, new Class[]{Result.class}, Void.TYPE).isSupported && VerifyPhoneActivity.this.isActive()) {
                com.max.hbutils.utils.c cVar = com.max.hbutils.utils.c.f73533a;
                com.max.hbutils.utils.c.f("验证成功");
                VerifyPhoneActivity.this.setResult(-1);
                VerifyPhoneActivity.this.finish();
            }
        }

        @Override // com.max.hbcommon.network.d, io.reactivex.g0
        public /* bridge */ /* synthetic */ void onNext(Object obj) {
            if (PatchProxy.proxy(new Object[]{obj}, this, changeQuickRedirect, false, 24670, new Class[]{Object.class}, Void.TYPE).isSupported) {
                return;
            }
            onNext((Result) obj);
        }
    }

    public class f extends TimerTask {
        public static ChangeQuickRedirect changeQuickRedirect;

        f() {
        }

        @Override // java.util.TimerTask, java.lang.Runnable
        public void run() {
            if (PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 24671, new Class[0], Void.TYPE).isSupported) {
                return;
            }
            Message message = new Message();
            message.what = 1;
            VerifyPhoneActivity.this.Q.sendMessage(message);
        }
    }

    public class g extends Handler {
        public static ChangeQuickRedirect changeQuickRedirect;

        g() {
        }

        @Override // android.os.Handler
        public void handleMessage(Message message) {
            if (PatchProxy.proxy(new Object[]{message}, this, changeQuickRedirect, false, 24672, new Class[]{Message.class}, Void.TYPE).isSupported) {
                return;
            }
            super.handleMessage(message);
            if (VerifyPhoneActivity.this.P <= 1) {
                VerifyPhoneActivity.this.O.cancel();
                VerifyPhoneActivity.this.L.f109133f.setText(VerifyPhoneActivity.this.getString(R.string.resend));
                VerifyPhoneActivity.a2(VerifyPhoneActivity.this, true);
                return;
            }
            VerifyPhoneActivity.this.L.f109133f.setText("重新发送(" + VerifyPhoneActivity.Y1(VerifyPhoneActivity.this) + "s)");
            VerifyPhoneActivity.a2(VerifyPhoneActivity.this, false);
        }
    }

    static /* synthetic */ void M1(VerifyPhoneActivity verifyPhoneActivity, String str) {
        if (PatchProxy.proxy(new Object[]{verifyPhoneActivity, str}, null, changeQuickRedirect, true, 24656, new Class[]{VerifyPhoneActivity.class, String.class}, Void.TYPE).isSupported) {
            return;
        }
        verifyPhoneActivity.j2(str);
    }

    static /* synthetic */ void Q1(VerifyPhoneActivity verifyPhoneActivity, String str) {
        if (PatchProxy.proxy(new Object[]{verifyPhoneActivity, str}, null, changeQuickRedirect, true, 24657, new Class[]{VerifyPhoneActivity.class, String.class}, Void.TYPE).isSupported) {
            return;
        }
        verifyPhoneActivity.c2(str);
    }

    static /* synthetic */ void R1(VerifyPhoneActivity verifyPhoneActivity) {
        if (PatchProxy.proxy(new Object[]{verifyPhoneActivity}, null, changeQuickRedirect, true, 24658, new Class[]{VerifyPhoneActivity.class}, Void.TYPE).isSupported) {
            return;
        }
        verifyPhoneActivity.C1();
    }

    static /* synthetic */ void T1(VerifyPhoneActivity verifyPhoneActivity, List list) {
        if (PatchProxy.proxy(new Object[]{verifyPhoneActivity, list}, null, changeQuickRedirect, true, 24659, new Class[]{VerifyPhoneActivity.class, List.class}, Void.TYPE).isSupported) {
            return;
        }
        verifyPhoneActivity.f2(list);
    }

    static /* synthetic */ void V1(VerifyPhoneActivity verifyPhoneActivity) {
        if (PatchProxy.proxy(new Object[]{verifyPhoneActivity}, null, changeQuickRedirect, true, 24660, new Class[]{VerifyPhoneActivity.class}, Void.TYPE).isSupported) {
            return;
        }
        verifyPhoneActivity.h2();
    }

    static /* synthetic */ int Y1(VerifyPhoneActivity verifyPhoneActivity) {
        int i10 = verifyPhoneActivity.P - 1;
        verifyPhoneActivity.P = i10;
        return i10;
    }

    static /* synthetic */ void a2(VerifyPhoneActivity verifyPhoneActivity, boolean z10) {
        if (PatchProxy.proxy(new Object[]{verifyPhoneActivity, new Byte(z10 ? (byte) 1 : (byte) 0)}, null, changeQuickRedirect, true, 24661, new Class[]{VerifyPhoneActivity.class, Boolean.TYPE}, Void.TYPE).isSupported) {
            return;
        }
        verifyPhoneActivity.i2(z10);
    }

    private void b2() {
        if (PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 24649, new Class[0], Void.TYPE).isSupported) {
            return;
        }
        this.M = null;
        V((io.reactivex.disposables.b) com.max.xiaoheihe.network.i.a().l7().I5(io.reactivex.schedulers.b.d()).a4(io.reactivex.android.schedulers.a.c()).J5(new c()));
    }

    private void c2(String str) {
        if (PatchProxy.proxy(new Object[]{str}, this, changeQuickRedirect, false, 24651, new Class[]{String.class}, Void.TYPE).isSupported) {
            return;
        }
        V((io.reactivex.disposables.b) com.max.xiaoheihe.network.i.a().ba(com.max.xiaoheihe.utils.w.a(str)).I5(io.reactivex.schedulers.b.d()).a4(io.reactivex.android.schedulers.a.c()).J5(new d()));
    }

    private void e2() {
        AutoPlayView autoPlayView;
        if (PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 24648, new Class[0], Void.TYPE).isSupported) {
            return;
        }
        this.L.f109137j.removeAllViews();
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
            this.L.f109137j.addView(autoPlayView);
        }
        this.L.f109132e.setOnPinEnteredListener(new a());
        this.L.f109133f.setOnClickListener(new b());
    }

    private void f2(List<AuthInfoObj> list) {
        if (PatchProxy.proxy(new Object[]{list}, this, changeQuickRedirect, false, 24650, new Class[]{List.class}, Void.TYPE).isSupported) {
            return;
        }
        x1();
        for (AuthInfoObj authInfoObj : list) {
            if ("1".equals(authInfoObj.getSrc_id_type())) {
                this.M = authInfoObj.getSrc_id();
                break;
            }
        }
        if (com.max.hbcommon.utils.c.u(this.M)) {
            return;
        }
        Object objReplace = this.M.length() > 7 ? new StringBuilder(this.M).replace(3, 7, "****") : this.M;
        this.L.f109134g.setText("请输入发送至 " + objReplace + " 的 4 位验证码");
        c2(this.M);
    }

    private void h2() {
        if (PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 24654, new Class[0], Void.TYPE).isSupported) {
            return;
        }
        Timer timer = this.N;
        if (timer != null) {
            timer.cancel();
        }
        this.P = 60;
        this.N = new Timer(true);
        f fVar = new f();
        this.O = fVar;
        this.N.schedule(fVar, 1000L, 1000L);
    }

    private void i2(boolean z10) {
        if (PatchProxy.proxy(new Object[]{new Byte(z10 ? (byte) 1 : (byte) 0)}, this, changeQuickRedirect, false, 24655, new Class[]{Boolean.TYPE}, Void.TYPE).isSupported) {
            return;
        }
        if (z10) {
            this.L.f109133f.setEnabled(true);
            this.L.f109133f.setTextColor(com.max.xiaoheihe.utils.d.E(R.color.white));
            this.L.f109133f.setBackgroundDrawable(com.max.hbutils.utils.q.o(this.f66601b, R.color.text_primary_1_color, 2.0f));
        } else {
            this.L.f109133f.setEnabled(false);
            this.L.f109133f.setTextColor(com.max.xiaoheihe.utils.d.E(R.color.text_secondary_2_color));
            this.L.f109133f.setBackgroundDrawable(com.max.hbutils.utils.q.o(this.f66601b, R.color.divider_color, 2.0f));
        }
    }

    private void j2(String str) {
        if (PatchProxy.proxy(new Object[]{str}, this, changeQuickRedirect, false, 24652, new Class[]{String.class}, Void.TYPE).isSupported) {
            return;
        }
        V((io.reactivex.disposables.b) com.max.xiaoheihe.network.i.a().g1(com.max.xiaoheihe.utils.w.a(this.M), str).I5(io.reactivex.schedulers.b.d()).a4(io.reactivex.android.schedulers.a.c()).J5(new e()));
    }

    @Override // com.max.hbcommon.base.BaseActivity
    public void k1() {
        if (PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 24647, new Class[0], Void.TYPE).isSupported) {
            return;
        }
        c3 c3VarC = c3.c(this.f66602c);
        this.L = c3VarC;
        setContentView(c3VarC.b());
        this.L.f109136i.setTitle("手机验证");
        e2();
        b2();
    }

    @Override // com.max.hbcommon.base.BaseActivity, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, android.app.Activity
    public void onDestroy() {
        if (PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 24653, new Class[0], Void.TYPE).isSupported) {
            return;
        }
        super.onDestroy();
        this.Q.removeCallbacksAndMessages(null);
        Timer timer = this.N;
        if (timer != null) {
            timer.cancel();
            this.N = null;
        }
        TimerTask timerTask = this.O;
        if (timerTask != null) {
            timerTask.cancel();
            this.O = null;
        }
    }
}
