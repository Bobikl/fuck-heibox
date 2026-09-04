package com.max.xiaoheihe.module.account;

import android.app.Dialog;
import android.content.Context;
import android.content.Intent;
import android.view.View;
import com.max.hbcommon.base.BaseActivity;
import com.max.hbcustomview.loadingdialog.LoadingDialog;
import com.max.hbutils.bean.Result;
import com.max.xiaoheihe.R;
import com.max.xiaoheihe.bean.account.AuthInfoObj;
import com.max.xiaoheihe.bean.account.User;
import com.max.xiaoheihe.module.account.paysetting.HBalancePaySettingActivity;
import com.max.xiaoheihe.module.webview.WebActionActivity;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.PatchProxyResult;
import com.tencent.connect.common.Constants;
import com.umeng.socialize.UMAuthListener;
import com.umeng.socialize.UMShareAPI;
import com.umeng.socialize.bean.SHARE_MEDIA;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/* JADX INFO: loaded from: classes9.dex */
@ig.d(path = {lb.d.f131209m4})
public class AccountManagerActivity extends BaseActivity {
    public static final String T = "/account/get_auth_info";
    public static ChangeQuickRedirect changeQuickRedirect;
    private String L;
    private String M;
    private String N;
    private UMShareAPI O = null;
    private LoadingDialog P;
    private boolean Q;
    private boolean R;
    private df.b S;

    public class a implements View.OnClickListener {
        public static ChangeQuickRedirect changeQuickRedirect;

        /* JADX INFO: renamed from: com.max.xiaoheihe.module.account.AccountManagerActivity$a$a, reason: collision with other inner class name */
        public class C0634a implements com.max.xiaoheihe.utils.l0.g {
            public static ChangeQuickRedirect changeQuickRedirect;

            C0634a() {
            }

            @Override // com.max.xiaoheihe.utils.l0.g
            public void a() {
                if (PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 22325, new Class[0], Void.TYPE).isSupported) {
                    return;
                }
                AccountManagerActivity.b2(AccountManagerActivity.this);
            }
        }

        a() {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            if (PatchProxy.proxy(new Object[]{view}, this, changeQuickRedirect, false, 22324, new Class[]{View.class}, Void.TYPE).isSupported) {
                return;
            }
            com.max.xiaoheihe.utils.i0.B(AccountManagerActivity.T, new C0634a());
        }
    }

    public class b implements UMAuthListener {
        public static ChangeQuickRedirect changeQuickRedirect;

        public class a implements UMAuthListener {
            public static ChangeQuickRedirect changeQuickRedirect;

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            final /* synthetic */ String f77437a;

            a(String str) {
                this.f77437a = str;
            }

            @Override // com.umeng.socialize.UMAuthListener
            public void onCancel(SHARE_MEDIA share_media, int i10) {
                if (PatchProxy.proxy(new Object[]{share_media, new Integer(i10)}, this, changeQuickRedirect, false, 22332, new Class[]{SHARE_MEDIA.class, Integer.TYPE}, Void.TYPE).isSupported) {
                    return;
                }
                com.max.hbutils.utils.c cVar = com.max.hbutils.utils.c.f73533a;
                com.max.hbutils.utils.c.f(AccountManagerActivity.this.getString(R.string.cancel));
            }

            @Override // com.umeng.socialize.UMAuthListener
            public void onComplete(SHARE_MEDIA share_media, int i10, Map<String, String> map) {
                if (PatchProxy.proxy(new Object[]{share_media, new Integer(i10), map}, this, changeQuickRedirect, false, 22330, new Class[]{SHARE_MEDIA.class, Integer.TYPE, Map.class}, Void.TYPE).isSupported) {
                    return;
                }
                if (map != null) {
                    AccountManagerActivity.h2(AccountManagerActivity.this, map.get("unionid"), map.get("openid"), this.f77437a, map.get("profile_image_url"), map.get("screen_name"), map.get(g0.a.G));
                } else {
                    com.max.hbutils.utils.c cVar = com.max.hbutils.utils.c.f73533a;
                    com.max.hbutils.utils.c.f(AccountManagerActivity.this.getString(R.string.fail));
                }
            }

            @Override // com.umeng.socialize.UMAuthListener
            public void onError(SHARE_MEDIA share_media, int i10, Throwable th2) {
                if (PatchProxy.proxy(new Object[]{share_media, new Integer(i10), th2}, this, changeQuickRedirect, false, 22331, new Class[]{SHARE_MEDIA.class, Integer.TYPE, Throwable.class}, Void.TYPE).isSupported) {
                    return;
                }
                com.max.hbutils.utils.c cVar = com.max.hbutils.utils.c.f73533a;
                com.max.hbutils.utils.c.f(AccountManagerActivity.this.getString(R.string.fail));
            }

            @Override // com.umeng.socialize.UMAuthListener
            public void onStart(SHARE_MEDIA share_media) {
            }
        }

        b() {
        }

        @Override // com.umeng.socialize.UMAuthListener
        public void onCancel(SHARE_MEDIA share_media, int i10) {
            if (PatchProxy.proxy(new Object[]{share_media, new Integer(i10)}, this, changeQuickRedirect, false, 22329, new Class[]{SHARE_MEDIA.class, Integer.TYPE}, Void.TYPE).isSupported) {
                return;
            }
            com.max.hbutils.utils.c cVar = com.max.hbutils.utils.c.f73533a;
            com.max.hbutils.utils.c.f(AccountManagerActivity.this.getString(R.string.cancel));
        }

        @Override // com.umeng.socialize.UMAuthListener
        public void onComplete(SHARE_MEDIA share_media, int i10, Map<String, String> map) {
            if (PatchProxy.proxy(new Object[]{share_media, new Integer(i10), map}, this, changeQuickRedirect, false, 22327, new Class[]{SHARE_MEDIA.class, Integer.TYPE, Map.class}, Void.TYPE).isSupported) {
                return;
            }
            String str = map.get("access_token");
            com.max.hbcommon.utils.d.b("weixinlogin", "  doOauthVerifyonComplete");
            if (com.max.hbcommon.utils.c.u(str) || AccountManagerActivity.this.O == null) {
                return;
            }
            AccountManagerActivity.this.O.getPlatformInfo(((BaseActivity) AccountManagerActivity.this).f66601b, SHARE_MEDIA.WEIXIN, new a(str));
        }

        @Override // com.umeng.socialize.UMAuthListener
        public void onError(SHARE_MEDIA share_media, int i10, Throwable th2) {
            if (PatchProxy.proxy(new Object[]{share_media, new Integer(i10), th2}, this, changeQuickRedirect, false, 22328, new Class[]{SHARE_MEDIA.class, Integer.TYPE, Throwable.class}, Void.TYPE).isSupported) {
                return;
            }
            com.max.hbutils.utils.c cVar = com.max.hbutils.utils.c.f73533a;
            com.max.hbutils.utils.c.f(AccountManagerActivity.this.getString(R.string.fail));
        }

        @Override // com.umeng.socialize.UMAuthListener
        public void onStart(SHARE_MEDIA share_media) {
            if (PatchProxy.proxy(new Object[]{share_media}, this, changeQuickRedirect, false, 22326, new Class[]{SHARE_MEDIA.class}, Void.TYPE).isSupported) {
                return;
            }
            com.max.hbcommon.utils.d.b("weixinlogin", "  doOauthVerifyonStart");
        }
    }

    public class c implements com.max.xiaoheihe.utils.a.b {
        public static ChangeQuickRedirect changeQuickRedirect;

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ String f77439a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ String f77440b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ String f77441c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        final /* synthetic */ String f77442d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        final /* synthetic */ String f77443e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        final /* synthetic */ String f77444f;

        c(String str, String str2, String str3, String str4, String str5, String str6) {
            this.f77439a = str;
            this.f77440b = str2;
            this.f77441c = str3;
            this.f77442d = str4;
            this.f77443e = str5;
            this.f77444f = str6;
        }

        @Override // com.max.xiaoheihe.utils.a.b
        public void a() {
            if (PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 22333, new Class[0], Void.TYPE).isSupported) {
                return;
            }
            AccountManagerActivity accountManagerActivity = AccountManagerActivity.this;
            accountManagerActivity.P = new LoadingDialog(((BaseActivity) accountManagerActivity).f66601b, AccountManagerActivity.this.getString(R.string.logining)).r();
            AccountManagerActivity.l2(AccountManagerActivity.this, this.f77439a, this.f77440b, this.f77441c, this.f77442d, this.f77443e, this.f77444f);
        }
    }

    public class d extends com.max.hbcommon.network.d<Result> {
        public static ChangeQuickRedirect changeQuickRedirect;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ String f77446b;

        d(String str) {
            this.f77446b = str;
        }

        @Override // com.max.hbcommon.network.d, io.reactivex.g0
        public void onComplete() {
            if (!PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 22334, new Class[0], Void.TYPE).isSupported && AccountManagerActivity.this.isActive()) {
                super.onComplete();
                if (AccountManagerActivity.this.P != null) {
                    AccountManagerActivity.this.P.c();
                }
            }
        }

        @Override // com.max.hbcommon.network.d, io.reactivex.g0
        public void onError(Throwable th2) {
            if (!PatchProxy.proxy(new Object[]{th2}, this, changeQuickRedirect, false, 22335, new Class[]{Throwable.class}, Void.TYPE).isSupported && AccountManagerActivity.this.isActive()) {
                super.onError(th2);
                if (AccountManagerActivity.this.P != null) {
                    AccountManagerActivity.this.P.c();
                }
            }
        }

        public void onNext(Result result) {
            if (!PatchProxy.proxy(new Object[]{result}, this, changeQuickRedirect, false, 22336, new Class[]{Result.class}, Void.TYPE).isSupported && AccountManagerActivity.this.isActive()) {
                com.max.hbcache.c.C("user_account", this.f77446b);
                com.max.hbcommon.utils.d.b("zzzzphone", "onNext==" + result);
                AccountManagerActivity.this.n1();
            }
        }

        @Override // com.max.hbcommon.network.d, io.reactivex.g0
        public /* bridge */ /* synthetic */ void onNext(Object obj) {
            if (PatchProxy.proxy(new Object[]{obj}, this, changeQuickRedirect, false, 22337, new Class[]{Object.class}, Void.TYPE).isSupported) {
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
            if (!PatchProxy.proxy(new Object[]{result}, this, changeQuickRedirect, false, 22338, new Class[]{Result.class}, Void.TYPE).isSupported && AccountManagerActivity.this.isActive()) {
                AccountManagerActivity.this.n1();
            }
        }

        @Override // com.max.hbcommon.network.d, io.reactivex.g0
        public /* bridge */ /* synthetic */ void onNext(Object obj) {
            if (PatchProxy.proxy(new Object[]{obj}, this, changeQuickRedirect, false, 22339, new Class[]{Object.class}, Void.TYPE).isSupported) {
                return;
            }
            onNext((Result) obj);
        }
    }

    public class f implements View.OnClickListener {
        public static ChangeQuickRedirect changeQuickRedirect;

        f() {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            if (PatchProxy.proxy(new Object[]{view}, this, changeQuickRedirect, false, 22323, new Class[]{View.class}, Void.TYPE).isSupported) {
                return;
            }
            ((BaseActivity) AccountManagerActivity.this).f66601b.startActivity(UpdatePwdActivity.Q1(((BaseActivity) AccountManagerActivity.this).f66601b, AccountManagerActivity.this.Q));
        }
    }

    public class g implements View.OnClickListener {
        public static ChangeQuickRedirect changeQuickRedirect;

        g() {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            if (PatchProxy.proxy(new Object[]{view}, this, changeQuickRedirect, false, 22340, new Class[]{View.class}, Void.TYPE).isSupported) {
                return;
            }
            ((BaseActivity) AccountManagerActivity.this).f66601b.startActivity(WrittenOffConfirmActivity.T1(((BaseActivity) AccountManagerActivity.this).f66601b));
        }
    }

    public class h implements View.OnClickListener {
        public static ChangeQuickRedirect changeQuickRedirect;

        h() {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            if (PatchProxy.proxy(new Object[]{view}, this, changeQuickRedirect, false, 22341, new Class[]{View.class}, Void.TYPE).isSupported) {
                return;
            }
            ((BaseActivity) AccountManagerActivity.this).f66601b.startActivity(HBalancePaySettingActivity.f2(((BaseActivity) AccountManagerActivity.this).f66601b));
        }
    }

    public class i extends com.max.hbcommon.network.d<Result<List<AuthInfoObj>>> {
        public static ChangeQuickRedirect changeQuickRedirect;

        i() {
        }

        @Override // com.max.hbcommon.network.d, io.reactivex.g0
        public void onComplete() {
            if (!PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 22343, new Class[0], Void.TYPE).isSupported && AccountManagerActivity.this.isActive()) {
                super.onComplete();
            }
        }

        @Override // com.max.hbcommon.network.d, io.reactivex.g0
        public void onError(Throwable th2) {
            if (!PatchProxy.proxy(new Object[]{th2}, this, changeQuickRedirect, false, 22342, new Class[]{Throwable.class}, Void.TYPE).isSupported && AccountManagerActivity.this.isActive()) {
                super.onError(th2);
                AccountManagerActivity.q2(AccountManagerActivity.this);
            }
        }

        public void onNext(Result<List<AuthInfoObj>> result) {
            if (!PatchProxy.proxy(new Object[]{result}, this, changeQuickRedirect, false, 22344, new Class[]{Result.class}, Void.TYPE).isSupported && AccountManagerActivity.this.isActive()) {
                super.onNext(result);
                if (com.max.hbcommon.utils.c.w(result.getResult())) {
                    return;
                }
                AccountManagerActivity.r2(AccountManagerActivity.this, result.getResult());
            }
        }

        @Override // com.max.hbcommon.network.d, io.reactivex.g0
        public /* bridge */ /* synthetic */ void onNext(Object obj) {
            if (PatchProxy.proxy(new Object[]{obj}, this, changeQuickRedirect, false, 22345, new Class[]{Object.class}, Void.TYPE).isSupported) {
                return;
            }
            onNext((Result<List<AuthInfoObj>>) obj);
        }
    }

    public class j implements View.OnClickListener {
        public static ChangeQuickRedirect changeQuickRedirect;

        j() {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            if (PatchProxy.proxy(new Object[]{view}, this, changeQuickRedirect, false, 22346, new Class[]{View.class}, Void.TYPE).isSupported) {
                return;
            }
            ((BaseActivity) AccountManagerActivity.this).f66601b.startActivityForResult(ChangePhoneBindActivity.o2(((BaseActivity) AccountManagerActivity.this).f66601b, AccountManagerActivity.this.L), 100);
        }
    }

    public class k implements View.OnClickListener {
        public static ChangeQuickRedirect changeQuickRedirect;

        k() {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            if (PatchProxy.proxy(new Object[]{view}, this, changeQuickRedirect, false, 22347, new Class[]{View.class}, Void.TYPE).isSupported) {
                return;
            }
            ((BaseActivity) AccountManagerActivity.this).f66601b.startActivityForResult(BindPhoneActivity.l2(((BaseActivity) AccountManagerActivity.this).f66601b), 100);
        }
    }

    public class l implements View.OnClickListener {
        public static ChangeQuickRedirect changeQuickRedirect;

        public class a implements com.max.xiaoheihe.view.m {
            public static ChangeQuickRedirect changeQuickRedirect;

            a() {
            }

            @Override // com.max.xiaoheihe.view.m
            public void a(Dialog dialog) {
                if (PatchProxy.proxy(new Object[]{dialog}, this, changeQuickRedirect, false, 22350, new Class[]{Dialog.class}, Void.TYPE).isSupported) {
                    return;
                }
                AccountManagerActivity accountManagerActivity = AccountManagerActivity.this;
                AccountManagerActivity.Y1(accountManagerActivity, accountManagerActivity.M);
                dialog.dismiss();
            }

            @Override // com.max.xiaoheihe.view.m
            public void b(Dialog dialog) {
                if (PatchProxy.proxy(new Object[]{dialog}, this, changeQuickRedirect, false, 22349, new Class[]{Dialog.class}, Void.TYPE).isSupported) {
                    return;
                }
                dialog.dismiss();
            }
        }

        l() {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            if (PatchProxy.proxy(new Object[]{view}, this, changeQuickRedirect, false, 22348, new Class[]{View.class}, Void.TYPE).isSupported) {
                return;
            }
            com.max.xiaoheihe.view.l.D(((BaseActivity) AccountManagerActivity.this).f66601b, "", AccountManagerActivity.this.getString(R.string.confirm_unbind), AccountManagerActivity.this.getString(R.string.confirm), AccountManagerActivity.this.getString(R.string.cancel), new a());
        }
    }

    public class m implements View.OnClickListener {
        public static ChangeQuickRedirect changeQuickRedirect;

        m() {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            if (PatchProxy.proxy(new Object[]{view}, this, changeQuickRedirect, false, 22351, new Class[]{View.class}, Void.TYPE).isSupported) {
                return;
            }
            AccountManagerActivity.Z1(AccountManagerActivity.this);
        }
    }

    public class n implements View.OnClickListener {
        public static ChangeQuickRedirect changeQuickRedirect;

        n() {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            if (PatchProxy.proxy(new Object[]{view}, this, changeQuickRedirect, false, 22352, new Class[]{View.class}, Void.TYPE).isSupported) {
                return;
            }
            AccountManagerActivity.this.startActivity(new Intent(((BaseActivity) AccountManagerActivity.this).f66601b, (Class<?>) RealNameInfoActivity.class));
        }
    }

    private void A2() {
        UMShareAPI uMShareAPI;
        if (PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 22311, new Class[0], Void.TYPE).isSupported || (uMShareAPI = this.O) == null) {
            return;
        }
        uMShareAPI.doOauthVerify(this, SHARE_MEDIA.WEIXIN, new b());
    }

    private void B2(List<AuthInfoObj> list) {
        if (PatchProxy.proxy(new Object[]{list}, this, changeQuickRedirect, false, 22310, new Class[]{List.class}, Void.TYPE).isSupported) {
            return;
        }
        x1();
        for (AuthInfoObj authInfoObj : list) {
            if ("5".equals(authInfoObj.getSrc_id_type())) {
                this.M = authInfoObj.getSrc_id();
                this.N = authInfoObj.getName();
            } else if ("1".equals(authInfoObj.getSrc_id_type())) {
                this.L = authInfoObj.getSrc_id();
                this.Q = "0".equals(authInfoObj.getHas_password());
            } else if ("-1".equals(authInfoObj.getSrc_id_type())) {
                this.R = authInfoObj.getCertified().booleanValue();
            }
            if (authInfoObj.isIs_maxjia()) {
                authInfoObj.getSrc_desc();
            }
        }
        this.S.f108671m.setVisibility(8);
        User userI = com.max.xiaoheihe.utils.i0.i();
        if (com.max.hbcommon.utils.c.u(this.L)) {
            this.S.f108663e.setText("");
            this.S.f108662d.setText("绑定账号");
            this.S.f108662d.setOnClickListener(new k());
            userI.setPhonenum(null);
        } else {
            this.S.f108663e.setText(this.L.length() > 7 ? new StringBuilder(this.L).replace(3, 7, "****") : this.L);
            this.S.f108662d.setText("更换绑定");
            this.S.f108662d.setOnClickListener(new j());
            userI.setPhonenum(this.L);
        }
        if (this.Q) {
            this.S.f108669k.setTitle(this.f66601b.getResources().getString(R.string.set_pwd));
        }
        com.max.xiaoheihe.utils.i0.z(userI);
        if (com.max.hbcommon.utils.c.u(this.M)) {
            this.S.f108665g.setText("");
            this.S.f108666h.setText("绑定账号");
            this.S.f108666h.setBackgroundResource(R.drawable.text_primary_2dp);
            this.S.f108666h.setOnClickListener(new m());
        } else {
            this.S.f108665g.setText(this.N);
            this.S.f108666h.setText("解除绑定");
            this.S.f108666h.setBackgroundResource(R.drawable.btn_error_2dp);
            this.S.f108666h.setOnClickListener(new l());
        }
        if (this.R) {
            this.S.f108668j.setRightDesc("已认证");
            this.S.f108668j.setOnClickListener(new n());
        } else {
            this.S.f108668j.setRightDesc("去认证");
            this.S.f108668j.setOnClickListener(new a());
        }
    }

    private void C2(String str) {
        if (PatchProxy.proxy(new Object[]{str}, this, changeQuickRedirect, false, 22314, new Class[]{String.class}, Void.TYPE).isSupported) {
            return;
        }
        V((io.reactivex.disposables.b) com.max.xiaoheihe.network.i.a().n7(str).I5(io.reactivex.schedulers.b.d()).a4(io.reactivex.android.schedulers.a.c()).J5(new e()));
    }

    private void D2(String str, String str2, String str3, String str4, String str5, String str6) {
        if (PatchProxy.proxy(new Object[]{str, str2, str3, str4, str5, str6}, this, changeQuickRedirect, false, 22313, new Class[]{String.class, String.class, String.class, String.class, String.class, String.class}, Void.TYPE).isSupported) {
            return;
        }
        com.max.hbcommon.utils.d.b("zzzzphone", "wechat_id==" + str);
        HashMap map = new HashMap();
        map.put("wechat_id", str);
        map.put(Constants.JumpUrlConstants.URL_KEY_OPENID, str2);
        map.put("access_token", str3);
        map.put(com.max.xiaoheihe.module.upload.g.f93525b, str4);
        map.put("name", str5);
        map.put(g0.a.G, str6);
        V((io.reactivex.disposables.b) com.max.xiaoheihe.network.i.a().wa(map).I5(io.reactivex.schedulers.b.d()).a4(io.reactivex.android.schedulers.a.c()).J5(new d(str5)));
    }

    static /* synthetic */ void Y1(AccountManagerActivity accountManagerActivity, String str) {
        if (PatchProxy.proxy(new Object[]{accountManagerActivity, str}, null, changeQuickRedirect, true, 22318, new Class[]{AccountManagerActivity.class, String.class}, Void.TYPE).isSupported) {
            return;
        }
        accountManagerActivity.C2(str);
    }

    static /* synthetic */ void Z1(AccountManagerActivity accountManagerActivity) {
        if (PatchProxy.proxy(new Object[]{accountManagerActivity}, null, changeQuickRedirect, true, 22319, new Class[]{AccountManagerActivity.class}, Void.TYPE).isSupported) {
            return;
        }
        accountManagerActivity.A2();
    }

    static /* synthetic */ void b2(AccountManagerActivity accountManagerActivity) {
        if (PatchProxy.proxy(new Object[]{accountManagerActivity}, null, changeQuickRedirect, true, 22320, new Class[]{AccountManagerActivity.class}, Void.TYPE).isSupported) {
            return;
        }
        accountManagerActivity.x2();
    }

    static /* synthetic */ void h2(AccountManagerActivity accountManagerActivity, String str, String str2, String str3, String str4, String str5, String str6) {
        if (PatchProxy.proxy(new Object[]{accountManagerActivity, str, str2, str3, str4, str5, str6}, null, changeQuickRedirect, true, 22321, new Class[]{AccountManagerActivity.class, String.class, String.class, String.class, String.class, String.class, String.class}, Void.TYPE).isSupported) {
            return;
        }
        accountManagerActivity.v2(str, str2, str3, str4, str5, str6);
    }

    static /* synthetic */ void l2(AccountManagerActivity accountManagerActivity, String str, String str2, String str3, String str4, String str5, String str6) {
        if (PatchProxy.proxy(new Object[]{accountManagerActivity, str, str2, str3, str4, str5, str6}, null, changeQuickRedirect, true, 22322, new Class[]{AccountManagerActivity.class, String.class, String.class, String.class, String.class, String.class, String.class}, Void.TYPE).isSupported) {
            return;
        }
        accountManagerActivity.D2(str, str2, str3, str4, str5, str6);
    }

    static /* synthetic */ void q2(AccountManagerActivity accountManagerActivity) {
        if (PatchProxy.proxy(new Object[]{accountManagerActivity}, null, changeQuickRedirect, true, 22316, new Class[]{AccountManagerActivity.class}, Void.TYPE).isSupported) {
            return;
        }
        accountManagerActivity.C1();
    }

    static /* synthetic */ void r2(AccountManagerActivity accountManagerActivity, List list) {
        if (PatchProxy.proxy(new Object[]{accountManagerActivity, list}, null, changeQuickRedirect, true, 22317, new Class[]{AccountManagerActivity.class, List.class}, Void.TYPE).isSupported) {
            return;
        }
        accountManagerActivity.B2(list);
    }

    private void v2(String str, String str2, String str3, String str4, String str5, String str6) {
        if (PatchProxy.proxy(new Object[]{str, str2, str3, str4, str5, str6}, this, changeQuickRedirect, false, 22312, new Class[]{String.class, String.class, String.class, String.class, String.class, String.class}, Void.TYPE).isSupported) {
            return;
        }
        com.max.xiaoheihe.utils.a.a(this, V0(), str, null, new c(str, str2, str3, str4, str5, str6));
    }

    private void x2() {
        if (PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 22309, new Class[0], Void.TYPE).isSupported) {
            return;
        }
        this.M = null;
        this.L = null;
        this.N = null;
        V((io.reactivex.disposables.b) com.max.xiaoheihe.network.i.a().l7().I5(io.reactivex.schedulers.b.d()).a4(io.reactivex.android.schedulers.a.c()).J5(new i()));
    }

    public static Intent y2(Context context) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{context}, null, changeQuickRedirect, true, 22304, new Class[]{Context.class}, Intent.class);
        return patchProxyResultProxy.isSupported ? (Intent) patchProxyResultProxy.result : new Intent(context, (Class<?>) AccountManagerActivity.class);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void z2(View view) {
        if (PatchProxy.proxy(new Object[]{view}, this, changeQuickRedirect, false, 22315, new Class[]{View.class}, Void.TYPE).isSupported) {
            return;
        }
        this.f66601b.startActivity(WebActionActivity.K2(this.f66601b, lb.a.F4, "登录设备管理", true, false));
    }

    @Override // com.max.hbcommon.base.BaseActivity
    public void k1() {
        if (PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 22305, new Class[0], Void.TYPE).isSupported) {
            return;
        }
        df.b bVarC = df.b.c(this.f66602c);
        this.S = bVarC;
        setContentView(bVarC.b());
        this.O = UMShareAPI.get(this);
        this.f66616q.setTitle(R.string.account_bind);
        E1();
        x2();
    }

    @Override // com.max.hbcommon.base.BaseActivity
    public void n1() {
        if (PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 22307, new Class[0], Void.TYPE).isSupported) {
            return;
        }
        E1();
        x2();
    }

    @Override // androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, android.app.Activity
    public void onActivityResult(int i10, int i11, Intent intent) {
        Object[] objArr = {new Integer(i10), new Integer(i11), intent};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        Class cls = Integer.TYPE;
        if (PatchProxy.proxy(objArr, this, changeQuickRedirect2, false, 22308, new Class[]{cls, cls, Intent.class}, Void.TYPE).isSupported) {
            return;
        }
        super.onActivityResult(i10, i11, intent);
        UMShareAPI uMShareAPI = this.O;
        if (uMShareAPI != null) {
            uMShareAPI.onActivityResult(i10, i11, intent);
        }
        if (i10 == 100 && i11 == -1) {
            n1();
        }
    }

    @Override // com.max.hbcommon.base.BaseActivity
    public void q1() {
        if (PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 22306, new Class[0], Void.TYPE).isSupported) {
            return;
        }
        this.S.f108669k.setOnClickListener(new f());
        if (com.max.xiaoheihe.utils.i0.t()) {
            this.S.f108675q.setVisibility(8);
            this.S.f108676r.setVisibility(8);
        } else {
            this.S.f108675q.setVisibility(0);
            this.S.f108676r.setVisibility(0);
            this.S.f108675q.setOnClickListener(new g());
        }
        this.S.f108670l.setOnClickListener(new View.OnClickListener() { // from class: com.max.xiaoheihe.module.account.a
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f78717b.z2(view);
            }
        });
        this.S.f108672n.setOnClickListener(new h());
    }
}
