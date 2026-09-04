package com.max.xiaoheihe;

import android.app.Activity;
import android.content.DialogInterface;
import android.content.Intent;
import android.text.SpannableStringBuilder;
import android.widget.TextView;
import com.google.gson.JsonObject;
import com.max.hbcustomview.loadingdialog.LoadingDialog;
import com.max.hbutils.bean.Result;
import com.max.xiaoheihe.app.HeyBoxApplication;
import com.max.xiaoheihe.bean.account.User;
import com.max.xiaoheihe.module.account.RegisterOrLoginActivityV2;
import com.max.xiaoheihe.module.ads.AdsActivity;
import com.max.xiaoheihe.utils.i0;
import com.max.xiaoheihe.utils.m0;
import com.max.xiaoheihe.utils.v;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.PatchProxyResult;

/* JADX INFO: loaded from: classes3.dex */
public class SplashActivity extends AdsActivity {
    public static ChangeQuickRedirect changeQuickRedirect;
    private LoadingDialog T;

    public class a implements DialogInterface.OnClickListener {
        public static ChangeQuickRedirect changeQuickRedirect;

        a() {
        }

        @Override // android.content.DialogInterface.OnClickListener
        public void onClick(DialogInterface dialogInterface, int i10) {
            if (PatchProxy.proxy(new Object[]{dialogInterface, new Integer(i10)}, this, changeQuickRedirect, false, bb.c.m.Au, new Class[]{DialogInterface.class, Integer.TYPE}, Void.TYPE).isSupported) {
                return;
            }
            dialogInterface.dismiss();
            SplashActivity.c2(SplashActivity.this);
        }
    }

    public class b implements DialogInterface.OnClickListener {
        public static ChangeQuickRedirect changeQuickRedirect;

        b() {
        }

        @Override // android.content.DialogInterface.OnClickListener
        public void onClick(DialogInterface dialogInterface, int i10) {
            if (PatchProxy.proxy(new Object[]{dialogInterface, new Integer(i10)}, this, changeQuickRedirect, false, bb.c.m.Bu, new Class[]{DialogInterface.class, Integer.TYPE}, Void.TYPE).isSupported) {
                return;
            }
            dialogInterface.dismiss();
            SplashActivity.e2(SplashActivity.this);
        }
    }

    public class c implements DialogInterface.OnClickListener {
        public static ChangeQuickRedirect changeQuickRedirect;

        c() {
        }

        @Override // android.content.DialogInterface.OnClickListener
        public void onClick(DialogInterface dialogInterface, int i10) {
            if (PatchProxy.proxy(new Object[]{dialogInterface, new Integer(i10)}, this, changeQuickRedirect, false, bb.c.m.Cu, new Class[]{DialogInterface.class, Integer.TYPE}, Void.TYPE).isSupported) {
                return;
            }
            dialogInterface.dismiss();
            SplashActivity.f2(SplashActivity.this);
        }
    }

    public class d implements DialogInterface.OnClickListener {
        public static ChangeQuickRedirect changeQuickRedirect;

        d() {
        }

        @Override // android.content.DialogInterface.OnClickListener
        public void onClick(DialogInterface dialogInterface, int i10) {
            if (PatchProxy.proxy(new Object[]{dialogInterface, new Integer(i10)}, this, changeQuickRedirect, false, bb.c.m.Du, new Class[]{DialogInterface.class, Integer.TYPE}, Void.TYPE).isSupported) {
                return;
            }
            dialogInterface.dismiss();
            SplashActivity.e2(SplashActivity.this);
        }
    }

    public class e implements DialogInterface.OnClickListener {
        public static ChangeQuickRedirect changeQuickRedirect;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ String f76418b;

        e(String str) {
            this.f76418b = str;
        }

        @Override // android.content.DialogInterface.OnClickListener
        public void onClick(DialogInterface dialogInterface, int i10) {
            if (PatchProxy.proxy(new Object[]{dialogInterface, new Integer(i10)}, this, changeQuickRedirect, false, bb.c.m.Eu, new Class[]{DialogInterface.class, Integer.TYPE}, Void.TYPE).isSupported) {
                return;
            }
            com.max.hbcache.c.z(lb.a.f130937b1, this.f76418b);
            dialogInterface.dismiss();
        }
    }

    public class f extends com.max.hbcommon.network.d<Result<JsonObject>> {
        public static ChangeQuickRedirect changeQuickRedirect;

        f() {
        }

        @Override // com.max.hbcommon.network.d, io.reactivex.g0
        public void onComplete() {
        }

        @Override // com.max.hbcommon.network.d, io.reactivex.g0
        public void onError(Throwable th2) {
        }

        public void onNext(Result<JsonObject> result) {
            if (PatchProxy.proxy(new Object[]{result}, this, changeQuickRedirect, false, bb.c.m.Fu, new Class[]{Result.class}, Void.TYPE).isSupported) {
                return;
            }
            com.max.hbcache.c.z(lb.a.f130937b1, result.getResult().get("privacy_version").getAsString().replaceAll("v", "").replaceAll(androidx.exifinterface.media.a.X4, ""));
        }

        @Override // com.max.hbcommon.network.d, io.reactivex.g0
        public /* bridge */ /* synthetic */ void onNext(Object obj) {
            if (PatchProxy.proxy(new Object[]{obj}, this, changeQuickRedirect, false, bb.c.m.Gu, new Class[]{Object.class}, Void.TYPE).isSupported) {
                return;
            }
            onNext((Result<JsonObject>) obj);
        }
    }

    public class g extends com.max.hbcommon.network.d<Result<User>> {
        public static ChangeQuickRedirect changeQuickRedirect;

        g() {
        }

        @Override // com.max.hbcommon.network.d, io.reactivex.g0
        public void onError(Throwable th2) {
            if (!PatchProxy.proxy(new Object[]{th2}, this, changeQuickRedirect, false, bb.c.m.Hu, new Class[]{Throwable.class}, Void.TYPE).isSupported && SplashActivity.this.isActive()) {
                super.onError(th2);
                SplashActivity.h2(SplashActivity.this);
                SplashActivity.i2(SplashActivity.this);
            }
        }

        public void onNext(Result<User> result) {
            if (!PatchProxy.proxy(new Object[]{result}, this, changeQuickRedirect, false, bb.c.m.Iu, new Class[]{Result.class}, Void.TYPE).isSupported && SplashActivity.this.isActive()) {
                SplashActivity.h2(SplashActivity.this);
                SplashActivity.j2(SplashActivity.this, result.getResult());
            }
        }

        @Override // com.max.hbcommon.network.d, io.reactivex.g0
        public /* bridge */ /* synthetic */ void onNext(Object obj) {
            if (PatchProxy.proxy(new Object[]{obj}, this, changeQuickRedirect, false, bb.c.m.Ju, new Class[]{Object.class}, Void.TYPE).isSupported) {
                return;
            }
            onNext((Result<User>) obj);
        }
    }

    public class h extends com.max.hbcommon.network.d<Result<JsonObject>> {
        public static ChangeQuickRedirect changeQuickRedirect;

        h() {
        }

        @Override // com.max.hbcommon.network.d, io.reactivex.g0
        public void onError(Throwable th2) {
        }

        public void onNext(Result<JsonObject> result) {
            if (PatchProxy.proxy(new Object[]{result}, this, changeQuickRedirect, false, bb.c.m.Ku, new Class[]{Result.class}, Void.TYPE).isSupported) {
                return;
            }
            String strReplaceAll = result.getResult().get("privacy_version").getAsString().replaceAll("v", "").replaceAll(androidx.exifinterface.media.a.X4, "");
            if (SplashActivity.k2(SplashActivity.this, com.max.hbcache.c.j(lb.a.f130937b1), strReplaceAll)) {
                SplashActivity.l2(SplashActivity.this, strReplaceAll);
            }
        }

        @Override // com.max.hbcommon.network.d, io.reactivex.g0
        public /* bridge */ /* synthetic */ void onNext(Object obj) {
            if (PatchProxy.proxy(new Object[]{obj}, this, changeQuickRedirect, false, bb.c.m.Lu, new Class[]{Object.class}, Void.TYPE).isSupported) {
                return;
            }
            onNext((Result<JsonObject>) obj);
        }
    }

    private void A2() {
        if (PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, bb.c.m.eu, new Class[0], Void.TYPE).isSupported) {
            return;
        }
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder("很抱歉，在您不同意");
        com.max.xiaoheihe.view.l.i(this.f66601b, spannableStringBuilder, true, false);
        spannableStringBuilder.append((CharSequence) "与");
        com.max.xiaoheihe.view.l.i(this.f66601b, spannableStringBuilder, true, true);
        spannableStringBuilder.append((CharSequence) com.max.xiaoheihe.utils.d.n0(R.string.limit_custom_dialog_msg));
        TextView textViewL = com.max.xiaoheihe.view.l.l(this.f66601b);
        textViewL.setText(spannableStringBuilder);
        new com.max.hbcommon.view.a.f(this.f66601b).y(com.max.xiaoheihe.utils.d.n0(R.string.limit_custom_dialog_title)).i(textViewL).g(false).E(0).u("同意并继续", new d()).o("不同意并使用游客模式", new c()).d().show();
    }

    private void B2() {
        if (PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, bb.c.m.du, new Class[0], Void.TYPE).isSupported) {
            return;
        }
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(com.max.xiaoheihe.utils.d.n0(R.string.privacy_dialog_msg));
        com.max.xiaoheihe.view.l.i(this.f66601b, spannableStringBuilder, true, false);
        spannableStringBuilder.append((CharSequence) "与");
        com.max.xiaoheihe.view.l.i(this.f66601b, spannableStringBuilder, true, true);
        TextView textViewL = com.max.xiaoheihe.view.l.l(this.f66601b);
        textViewL.setText(spannableStringBuilder);
        new com.max.hbcommon.view.a.f(this.f66601b).y(com.max.xiaoheihe.utils.d.n0(R.string.privacy_dialog_title)).i(textViewL).g(false).E(0).u("同意", new b()).o("不同意", new a()).d().show();
    }

    private void C2(String str) {
        Activity activityE;
        if (PatchProxy.proxy(new Object[]{str}, this, changeQuickRedirect, false, bb.c.m.hu, new Class[]{String.class}, Void.TYPE).isSupported || (activityE = HeyBoxApplication.C().E()) == null) {
            return;
        }
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder("您好，根据业务开展的实际情况，" + com.max.xiaoheihe.utils.d.A() + "近期更新了");
        com.max.xiaoheihe.view.l.i(activityE, spannableStringBuilder, true, true);
        spannableStringBuilder.append((CharSequence) "中的相关内容，请您点击查看更新后的协议全文。如您对本次内容更新有任何疑问，可通过隐私政策中的联系方式向我们反馈");
        TextView textViewL = com.max.xiaoheihe.view.l.l(activityE);
        textViewL.setText(spannableStringBuilder);
        new com.max.hbcommon.view.a.f(activityE).y(com.max.xiaoheihe.utils.d.n0(R.string.privacy_dialog_title)).i(textViewL).g(false).E(0).u("我了解了", new e(str)).d().show();
    }

    private void D2() {
        if (PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, bb.c.m.lu, new Class[0], Void.TYPE).isSupported) {
            return;
        }
        com.max.xiaoheihe.network.i.a().D1("privacy").I5(io.reactivex.schedulers.b.d()).a4(io.reactivex.android.schedulers.a.c()).g(new f());
    }

    static /* synthetic */ void c2(SplashActivity splashActivity) {
        if (PatchProxy.proxy(new Object[]{splashActivity}, null, changeQuickRedirect, true, bb.c.m.su, new Class[]{SplashActivity.class}, Void.TYPE).isSupported) {
            return;
        }
        splashActivity.A2();
    }

    static /* synthetic */ void e2(SplashActivity splashActivity) {
        if (PatchProxy.proxy(new Object[]{splashActivity}, null, changeQuickRedirect, true, bb.c.m.tu, new Class[]{SplashActivity.class}, Void.TYPE).isSupported) {
            return;
        }
        splashActivity.m2();
    }

    static /* synthetic */ void f2(SplashActivity splashActivity) {
        if (PatchProxy.proxy(new Object[]{splashActivity}, null, changeQuickRedirect, true, bb.c.m.uu, new Class[]{SplashActivity.class}, Void.TYPE).isSupported) {
            return;
        }
        splashActivity.q2();
    }

    static /* synthetic */ void h2(SplashActivity splashActivity) {
        if (PatchProxy.proxy(new Object[]{splashActivity}, null, changeQuickRedirect, true, bb.c.m.vu, new Class[]{SplashActivity.class}, Void.TYPE).isSupported) {
            return;
        }
        splashActivity.v2();
    }

    static /* synthetic */ void i2(SplashActivity splashActivity) {
        if (PatchProxy.proxy(new Object[]{splashActivity}, null, changeQuickRedirect, true, bb.c.m.wu, new Class[]{SplashActivity.class}, Void.TYPE).isSupported) {
            return;
        }
        splashActivity.r2();
    }

    static /* synthetic */ void j2(SplashActivity splashActivity, User user) {
        if (PatchProxy.proxy(new Object[]{splashActivity, user}, null, changeQuickRedirect, true, bb.c.m.xu, new Class[]{SplashActivity.class, User.class}, Void.TYPE).isSupported) {
            return;
        }
        splashActivity.x2(user);
    }

    static /* synthetic */ boolean k2(SplashActivity splashActivity, String str, String str2) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{splashActivity, str, str2}, null, changeQuickRedirect, true, bb.c.m.yu, new Class[]{SplashActivity.class, String.class, String.class}, Boolean.TYPE);
        return patchProxyResultProxy.isSupported ? ((Boolean) patchProxyResultProxy.result).booleanValue() : splashActivity.y2(str, str2);
    }

    static /* synthetic */ void l2(SplashActivity splashActivity, String str) {
        if (PatchProxy.proxy(new Object[]{splashActivity, str}, null, changeQuickRedirect, true, bb.c.m.zu, new Class[]{SplashActivity.class, String.class}, Void.TYPE).isSupported) {
            return;
        }
        splashActivity.C2(str);
    }

    private void m2() {
        if (PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, bb.c.m.gu, new Class[0], Void.TYPE).isSupported) {
            return;
        }
        HeyBoxApplication.C().w();
        D2();
        n2();
    }

    private void n2() {
        if (PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, bb.c.m.iu, new Class[0], Void.TYPE).isSupported) {
            return;
        }
        com.max.hbcache.c.z(com.max.hbcache.c.G0, "0");
        if (i0.s()) {
            u2();
        } else {
            r2();
        }
    }

    private void o2() {
        if (PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, bb.c.m.qu, new Class[0], Void.TYPE).isSupported) {
            return;
        }
        com.max.xiaoheihe.network.i.a().D1("privacy").I5(io.reactivex.schedulers.b.d()).a4(io.reactivex.android.schedulers.a.c()).g(new h());
    }

    private void p2(String str, String str2) {
        if (PatchProxy.proxy(new Object[]{str, str2}, this, changeQuickRedirect, false, bb.c.m.mu, new Class[]{String.class, String.class}, Void.TYPE).isSupported) {
            return;
        }
        z2();
        com.max.xiaoheihe.network.i.a().H(str, str2).I5(io.reactivex.schedulers.b.d()).a4(io.reactivex.android.schedulers.a.c()).g(new g());
    }

    private void q2() {
        if (PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, bb.c.m.fu, new Class[0], Void.TYPE).isSupported) {
            return;
        }
        com.max.hbcache.c.z(com.max.hbcache.c.G0, "1");
        startActivity(new Intent(this.f66601b, (Class<?>) LimittedVisitorMainActivity.class));
        finish();
    }

    private void r2() {
        if (PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, bb.c.m.ku, new Class[0], Void.TYPE).isSupported) {
            return;
        }
        if ("1".equals(com.max.hbcache.c.o("skip_login", ""))) {
            u2();
        } else {
            startActivity(new Intent(this, (Class<?>) RegisterOrLoginActivityV2.class));
            finish();
        }
    }

    private void u2() {
        if (PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, bb.c.m.ju, new Class[0], Void.TYPE).isSupported) {
            return;
        }
        startActivity(new Intent(this, (Class<?>) MainActivity.class));
        finish();
    }

    private void v2() {
        LoadingDialog loadingDialog;
        if (PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, bb.c.m.pu, new Class[0], Void.TYPE).isSupported || (loadingDialog = this.T) == null) {
            return;
        }
        loadingDialog.c();
    }

    private void x2(User user) {
        if (PatchProxy.proxy(new Object[]{user}, this, changeQuickRedirect, false, bb.c.m.nu, new Class[]{User.class}, Void.TYPE).isSupported) {
            return;
        }
        if (user == null) {
            r2();
            return;
        }
        User userO = i0.o();
        userO.setLoginFlag(true);
        if (!com.max.hbcommon.utils.c.u(user.getPkey())) {
            userO.setPkey(user.getPkey());
        }
        if (user.getAccount_detail() != null) {
            userO.setAccount_detail(user.getAccount_detail());
        }
        if (user.getProfile() != null) {
            userO.setProfile(user.getProfile());
        }
        if (user.getVisitor_enabled() != null) {
            userO.setVisitor_enabled(user.getVisitor_enabled());
        }
        userO.setInvite_info(user.getInvite_info());
        i0.z(userO);
        v.h(this.f66601b);
        sendBroadcast(new Intent(lb.a.f130942c0));
        MainActivity.f76171q5 = user.getTips_state();
        if ("1".equals(com.max.hbcache.c.o("valid_ws", ""))) {
            m0.x().C();
        }
        u2();
    }

    private boolean y2(String str, String str2) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{str, str2}, this, changeQuickRedirect, false, bb.c.m.ru, new Class[]{String.class, String.class}, Boolean.TYPE);
        if (patchProxyResultProxy.isSupported) {
            return ((Boolean) patchProxyResultProxy.result).booleanValue();
        }
        if (com.max.hbcommon.utils.c.u(str)) {
            return true;
        }
        return com.max.xiaoheihe.module.game.c.j(str, str2);
    }

    private void z2() {
        if (PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, bb.c.m.ou, new Class[0], Void.TYPE).isSupported) {
            return;
        }
        v2();
        this.T = new LoadingDialog(this.f66601b, "").r();
    }

    @Override // com.max.xiaoheihe.module.ads.AdsActivity
    public String T1() {
        return "yes";
    }

    @Override // com.max.xiaoheihe.module.ads.AdsActivity
    public void Y1(boolean z10) {
        if (PatchProxy.proxy(new Object[]{new Byte(z10 ? (byte) 1 : (byte) 0)}, this, changeQuickRedirect, false, bb.c.m.cu, new Class[]{Boolean.TYPE}, Void.TYPE).isSupported) {
            return;
        }
        if (com.max.hbcommon.utils.c.x(com.max.hbcache.c.j(com.max.hbcache.c.G0))) {
            q2();
            return;
        }
        if (z10) {
            n2();
        } else if (!"1".equals(com.max.hbcache.c.j(lb.a.f130931a1))) {
            B2();
        } else {
            n2();
            o2();
        }
    }
}
