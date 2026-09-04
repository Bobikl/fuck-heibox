package com.max.xiaoheihe.module.mall;

import android.app.AlertDialog;
import android.app.Dialog;
import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;
import android.graphics.drawable.AnimationDrawable;
import android.os.Handler;
import android.os.Message;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import android.webkit.WebView;
import android.widget.ImageView;
import android.widget.ProgressBar;
import android.widget.TextView;
import butterknife.BindView;
import butterknife.ButterKnife;
import com.max.hbcommon.base.BaseActivity;
import com.max.hbcommon.bean.EncryptionParamsObj;
import com.max.hbcommon.bean.PostEncryptParamsObj;
import com.max.hbutils.bean.Result;
import com.max.xiaoheihe.R;
import com.max.xiaoheihe.app.HeyBoxApplication;
import com.max.xiaoheihe.bean.StateObj;
import com.max.xiaoheihe.bean.WebProtocolObj;
import com.max.xiaoheihe.bean.mall.MallSteamKeyStateObj;
import com.max.xiaoheihe.bean.mall.MallSteamReportObj;
import com.max.xiaoheihe.bean.mall.SteamBalanceObj;
import com.max.xiaoheihe.bean.mall.SteamWalletJsObj;
import com.max.xiaoheihe.bean.proxy.ProxyAddressObj;
import com.max.xiaoheihe.module.webview.WebviewFragment;
import com.max.xiaoheihe.module.webview.u;
import com.max.xiaoheihe.utils.i0;
import com.max.xiaoheihe.utils.w;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.Constants;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.PatchProxyResult;
import com.umeng.analytics.MobclickAgent;
import com.umeng.message.common.inter.ITagManager;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.TimeUnit;

/* JADX INFO: loaded from: classes11.dex */
public class SteamStoreRedeemWalletCodeActivity extends BaseActivity {
    public static final String G2 = "status_activating";
    public static final String G3 = "status_login";
    public static final String J3 = "status_all_activate_succeed";
    public static final String K3 = "status_all_activate_failed";
    public static final String L3 = "success";
    public static final String M3 = "fail";
    public static final String N3 = "wait";
    public static final String O3 = "key_list";
    public static final String P3 = "key_balance";
    private static final int Q3 = 15;
    private static final int R3 = 2000;

    /* JADX INFO: renamed from: c0, reason: collision with root package name */
    private static final String f89929c0 = "order_id";
    public static ChangeQuickRedirect changeQuickRedirect = null;

    /* JADX INFO: renamed from: p1, reason: collision with root package name */
    private static final String f89930p1 = "url_data";

    /* JADX INFO: renamed from: p2, reason: collision with root package name */
    private static final String f89931p2 = "relogin";

    /* JADX INFO: renamed from: p3, reason: collision with root package name */
    public static final String f89932p3 = "status_relogin";

    /* JADX INFO: renamed from: x1, reason: collision with root package name */
    private static final String f89933x1 = "keys";

    /* JADX INFO: renamed from: x2, reason: collision with root package name */
    private static final String f89934x2 = "canActivate";

    /* JADX INFO: renamed from: y1, reason: collision with root package name */
    private static final String f89935y1 = "redeemwalletcode";

    /* JADX INFO: renamed from: y2, reason: collision with root package name */
    public static final String f89936y2 = "status_not_activate";
    ProgressBar L;
    TextView M;
    TextView N;
    ImageView O;
    View P;
    TextView Q;
    private String R;
    private SteamWalletJsObj S;
    private ArrayList<String> T;
    private String U;
    private String W;
    private int X;
    private String Y;
    private Dialog Z;

    @BindView(R.id.tv_status)
    TextView mStatusTextView;
    private ArrayList<MallSteamKeyStateObj> V = new ArrayList<>();

    /* JADX INFO: renamed from: a0, reason: collision with root package name */
    private final g f89937a0 = new g(this);

    /* JADX INFO: renamed from: b0, reason: collision with root package name */
    private List<String> f89938b0 = new ArrayList();

    public class a extends WebviewFragment.o0 {
        public static ChangeQuickRedirect changeQuickRedirect;

        a() {
        }

        @Override // com.max.xiaoheihe.module.webview.WebviewFragment.o0
        public void b(WebProtocolObj webProtocolObj) {
            boolean z10 = true;
            if (!PatchProxy.proxy(new Object[]{webProtocolObj}, this, changeQuickRedirect, false, 41111, new Class[]{WebProtocolObj.class}, Void.TYPE).isSupported && WebProtocolObj.PROTOCOL_TYPE_STEAM_CALLBACK.equals(webProtocolObj.getProtocol_type())) {
                String strValueOf = webProtocolObj.valueOf("type");
                String strValueOf2 = webProtocolObj.valueOf("state");
                String strValueOf3 = webProtocolObj.valueOf("msg");
                SteamBalanceObj steamBalanceObj = (SteamBalanceObj) webProtocolObj.objectOf("info", SteamBalanceObj.class);
                if (!SteamStoreRedeemWalletCodeActivity.f89935y1.equals(strValueOf)) {
                    if ("relogin".equals(strValueOf)) {
                        SteamStoreRedeemWalletCodeActivity.this.f89938b0.add("relogin");
                        SteamStoreRedeemWalletCodeActivity.l2(SteamStoreRedeemWalletCodeActivity.this);
                        com.max.xiaoheihe.utils.d.k(((BaseActivity) SteamStoreRedeemWalletCodeActivity.this).f66601b, SteamStoreRedeemWalletCodeActivity.this.S.getCheckLogin().getRelogin_url());
                        SteamStoreRedeemWalletCodeActivity.this.U = SteamStoreRedeemWalletCodeActivity.f89932p3;
                        SteamStoreRedeemWalletCodeActivity steamStoreRedeemWalletCodeActivity = SteamStoreRedeemWalletCodeActivity.this;
                        SteamStoreRedeemWalletCodeActivity.W1(steamStoreRedeemWalletCodeActivity, steamStoreRedeemWalletCodeActivity.S.getCheckLogin().getRelogin_url());
                        SteamStoreRedeemWalletCodeActivity.X1(SteamStoreRedeemWalletCodeActivity.this);
                        SteamStoreRedeemWalletCodeActivity.m2(SteamStoreRedeemWalletCodeActivity.this, null);
                        return;
                    }
                    if (!SteamStoreRedeemWalletCodeActivity.f89934x2.equals(strValueOf) || !ITagManager.SUCCESS.equalsIgnoreCase(strValueOf2)) {
                        SteamStoreRedeemWalletCodeActivity.this.f89938b0.add("steamCallbackInvalid: " + SteamStoreRedeemWalletCodeActivity.this.T.size());
                        return;
                    }
                    if (SteamStoreRedeemWalletCodeActivity.this.T == null) {
                        if (SteamStoreRedeemWalletCodeActivity.this.Y == null) {
                            SteamStoreRedeemWalletCodeActivity.c2(SteamStoreRedeemWalletCodeActivity.this, 0L);
                            return;
                        }
                        SteamStoreRedeemWalletCodeActivity.this.f89938b0.add("canActivate jsActivateKeys: mPreparedKeys");
                        SteamStoreRedeemWalletCodeActivity steamStoreRedeemWalletCodeActivity2 = SteamStoreRedeemWalletCodeActivity.this;
                        SteamStoreRedeemWalletCodeActivity.Z1(steamStoreRedeemWalletCodeActivity2, steamStoreRedeemWalletCodeActivity2.Y);
                        return;
                    }
                    SteamStoreRedeemWalletCodeActivity.this.f89938b0.add("canActivate jsActivateKeys: " + SteamStoreRedeemWalletCodeActivity.this.T.size());
                    SteamStoreRedeemWalletCodeActivity steamStoreRedeemWalletCodeActivity3 = SteamStoreRedeemWalletCodeActivity.this;
                    SteamStoreRedeemWalletCodeActivity.Z1(steamStoreRedeemWalletCodeActivity3, com.max.hbutils.utils.k.r(steamStoreRedeemWalletCodeActivity3.T));
                    return;
                }
                if (!ITagManager.SUCCESS.equalsIgnoreCase(strValueOf2) || steamBalanceObj == null || steamBalanceObj.getKeys() == null || steamBalanceObj.getKeys().size() <= 0) {
                    if (z5.f.f141859j.equalsIgnoreCase(strValueOf2)) {
                        SteamStoreRedeemWalletCodeActivity.this.U = "status_all_activate_failed";
                        SteamStoreRedeemWalletCodeActivity.this.f89938b0.add("redeemwalletcode failed");
                        SteamStoreRedeemWalletCodeActivity.m2(SteamStoreRedeemWalletCodeActivity.this, strValueOf3);
                        return;
                    } else {
                        com.max.hbutils.utils.c cVar = com.max.hbutils.utils.c.f73533a;
                        com.max.hbutils.utils.c.f(SteamStoreRedeemWalletCodeActivity.this.getString(R.string.fail));
                        SteamStoreRedeemWalletCodeActivity.l2(SteamStoreRedeemWalletCodeActivity.this);
                        return;
                    }
                }
                SteamStoreRedeemWalletCodeActivity.this.V.clear();
                SteamStoreRedeemWalletCodeActivity.this.V.addAll(steamBalanceObj.getKeys());
                for (MallSteamKeyStateObj mallSteamKeyStateObj : SteamStoreRedeemWalletCodeActivity.this.V) {
                    if (mallSteamKeyStateObj.getState() == 0) {
                        if ("9".equals(mallSteamKeyStateObj.getError_code())) {
                            strValueOf3 = SteamStoreRedeemWalletCodeActivity.this.getString(R.string.redeemed_tips);
                        }
                        z10 = false;
                        break;
                    }
                }
                if (z10) {
                    SteamStoreRedeemWalletCodeActivity.this.U = "status_all_activate_succeed";
                    SteamStoreRedeemWalletCodeActivity.this.W = steamBalanceObj.getCurrent_balance();
                } else {
                    SteamStoreRedeemWalletCodeActivity.this.U = "status_all_activate_failed";
                }
                Intent intent = new Intent();
                intent.putExtra("key_list", SteamStoreRedeemWalletCodeActivity.this.V);
                intent.putExtra(SteamStoreRedeemWalletCodeActivity.P3, SteamStoreRedeemWalletCodeActivity.this.W);
                SteamStoreRedeemWalletCodeActivity.this.setResult(-1, intent);
                SteamStoreRedeemWalletCodeActivity.this.f89938b0.add("redeemwalletcode ok: " + z10 + ", " + SteamStoreRedeemWalletCodeActivity.this.V.size());
                SteamStoreRedeemWalletCodeActivity.T1(SteamStoreRedeemWalletCodeActivity.this);
                SteamStoreRedeemWalletCodeActivity.m2(SteamStoreRedeemWalletCodeActivity.this, strValueOf3);
            }
        }

        @Override // com.max.xiaoheihe.module.webview.WebviewFragment.o0
        public void g(WebView webView, String str, int i10, int i11) {
            Object[] objArr = {webView, str, new Integer(i10), new Integer(i11)};
            ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
            Class cls = Integer.TYPE;
            if (!PatchProxy.proxy(objArr, this, changeQuickRedirect2, false, 41110, new Class[]{WebView.class, String.class, cls, cls}, Void.TYPE).isSupported && i11 - 1 == 0) {
                if (str.matches(SteamStoreRedeemWalletCodeActivity.this.S.getCheckLogin().getRegular())) {
                    SteamStoreRedeemWalletCodeActivity.this.f89938b0.add("jsCheckLogin()");
                    SteamStoreRedeemWalletCodeActivity.o2(SteamStoreRedeemWalletCodeActivity.this);
                } else if (str.contains("/login")) {
                    SteamStoreRedeemWalletCodeActivity.this.f89938b0.add("url.contains(login)");
                    SteamStoreRedeemWalletCodeActivity.this.U = "status_login";
                }
                SteamStoreRedeemWalletCodeActivity.m2(SteamStoreRedeemWalletCodeActivity.this, null);
            }
        }

        @Override // com.max.xiaoheihe.module.webview.WebviewFragment.o0
        public void i(WebView webView, String str, int i10, int i11) {
            Object[] objArr = {webView, str, new Integer(i10), new Integer(i11)};
            ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
            Class cls = Integer.TYPE;
            if (PatchProxy.proxy(objArr, this, changeQuickRedirect2, false, 41109, new Class[]{WebView.class, String.class, cls, cls}, Void.TYPE).isSupported) {
                return;
            }
            if (str.matches(SteamStoreRedeemWalletCodeActivity.this.S.getRedeemwallet().getRegular())) {
                SteamStoreRedeemWalletCodeActivity.k2(SteamStoreRedeemWalletCodeActivity.this);
            } else if (str.contains("/login")) {
                SteamStoreRedeemWalletCodeActivity.l2(SteamStoreRedeemWalletCodeActivity.this);
            }
            SteamStoreRedeemWalletCodeActivity.m2(SteamStoreRedeemWalletCodeActivity.this, null);
        }

        @Override // com.max.xiaoheihe.module.webview.WebviewFragment.o0
        public void o(WebView webView, String str) {
            if (PatchProxy.proxy(new Object[]{webView, str}, this, changeQuickRedirect, false, 41108, new Class[]{WebView.class, String.class}, Void.TYPE).isSupported || com.max.hbcommon.utils.c.u(str) || ((BaseActivity) SteamStoreRedeemWalletCodeActivity.this).f66616q == null || ((BaseActivity) SteamStoreRedeemWalletCodeActivity.this).f66616q.getVisibility() != 0) {
                return;
            }
            if ("about:blank".equalsIgnoreCase(str)) {
                str = SteamStoreRedeemWalletCodeActivity.this.getString(R.string.loading);
            }
            ((BaseActivity) SteamStoreRedeemWalletCodeActivity.this).f66616q.setTitle(str);
        }
    }

    public class b implements View.OnClickListener {
        public static ChangeQuickRedirect changeQuickRedirect;

        b() {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            if (PatchProxy.proxy(new Object[]{view}, this, changeQuickRedirect, false, 41112, new Class[]{View.class}, Void.TYPE).isSupported) {
                return;
            }
            SteamStoreRedeemWalletCodeActivity.l2(SteamStoreRedeemWalletCodeActivity.this);
            SteamStoreRedeemWalletCodeActivity.this.finish();
        }
    }

    public class c implements View.OnClickListener {
        public static ChangeQuickRedirect changeQuickRedirect;

        c() {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            if (PatchProxy.proxy(new Object[]{view}, this, changeQuickRedirect, false, 41113, new Class[]{View.class}, Void.TYPE).isSupported) {
                return;
            }
            SteamStoreRedeemWalletCodeActivity.l2(SteamStoreRedeemWalletCodeActivity.this);
            SteamStoreRedeemWalletCodeActivity.this.finish();
        }
    }

    public class d implements DialogInterface.OnClickListener {
        public static ChangeQuickRedirect changeQuickRedirect;

        d() {
        }

        @Override // android.content.DialogInterface.OnClickListener
        public void onClick(DialogInterface dialogInterface, int i10) {
            if (PatchProxy.proxy(new Object[]{dialogInterface, new Integer(i10)}, this, changeQuickRedirect, false, 41114, new Class[]{DialogInterface.class, Integer.TYPE}, Void.TYPE).isSupported) {
                return;
            }
            dialogInterface.dismiss();
        }
    }

    public class e extends com.max.hbcommon.network.d<Result<StateObj>> {
        public static ChangeQuickRedirect changeQuickRedirect;

        e() {
        }

        @Override // com.max.hbcommon.network.d, io.reactivex.g0
        public void onError(Throwable th2) {
            if (PatchProxy.proxy(new Object[]{th2}, this, changeQuickRedirect, false, 41115, new Class[]{Throwable.class}, Void.TYPE).isSupported) {
                return;
            }
            SteamStoreRedeemWalletCodeActivity.h2(SteamStoreRedeemWalletCodeActivity.this);
            if (SteamStoreRedeemWalletCodeActivity.this.isActive()) {
                super.onError(th2);
                SteamStoreRedeemWalletCodeActivity.this.f89938b0.add("mallAssignPrepare onError: " + SteamStoreRedeemWalletCodeActivity.this.X);
                SteamStoreRedeemWalletCodeActivity.this.U = "status_all_activate_failed";
                SteamStoreRedeemWalletCodeActivity.m2(SteamStoreRedeemWalletCodeActivity.this, null);
            }
        }

        public void onNext(Result<StateObj> result) {
            if (PatchProxy.proxy(new Object[]{result}, this, changeQuickRedirect, false, 41116, new Class[]{Result.class}, Void.TYPE).isSupported) {
                return;
            }
            SteamStoreRedeemWalletCodeActivity.h2(SteamStoreRedeemWalletCodeActivity.this);
            if (SteamStoreRedeemWalletCodeActivity.this.isActive()) {
                super.onNext(result);
                String state = result.getResult() != null ? result.getResult().getState() : null;
                if ("success".equals(state)) {
                    SteamStoreRedeemWalletCodeActivity.this.f89938b0.add("mallAssignPrepare stateSuccess: " + SteamStoreRedeemWalletCodeActivity.this.X);
                    SteamStoreRedeemWalletCodeActivity.i2(SteamStoreRedeemWalletCodeActivity.this);
                    return;
                }
                if ("fail".equals(state)) {
                    SteamStoreRedeemWalletCodeActivity.this.f89938b0.add("mallAssignPrepare stateFail: " + SteamStoreRedeemWalletCodeActivity.this.X);
                    SteamStoreRedeemWalletCodeActivity.this.U = "status_all_activate_failed";
                    SteamStoreRedeemWalletCodeActivity.m2(SteamStoreRedeemWalletCodeActivity.this, null);
                    return;
                }
                if (!SteamStoreRedeemWalletCodeActivity.N3.equals(state)) {
                    SteamStoreRedeemWalletCodeActivity.this.f89938b0.add("mallAssignPrepare stateInvalid: " + state);
                    return;
                }
                SteamStoreRedeemWalletCodeActivity.this.f89938b0.add("mallAssignPrepare stateWait: " + SteamStoreRedeemWalletCodeActivity.this.X);
                if (SteamStoreRedeemWalletCodeActivity.this.X <= 15) {
                    SteamStoreRedeemWalletCodeActivity.c2(SteamStoreRedeemWalletCodeActivity.this, 2000L);
                } else {
                    SteamStoreRedeemWalletCodeActivity.this.U = "status_all_activate_failed";
                    SteamStoreRedeemWalletCodeActivity.m2(SteamStoreRedeemWalletCodeActivity.this, null);
                }
            }
        }

        @Override // com.max.hbcommon.network.d, io.reactivex.g0
        public /* bridge */ /* synthetic */ void onNext(Object obj) {
            if (PatchProxy.proxy(new Object[]{obj}, this, changeQuickRedirect, false, 41117, new Class[]{Object.class}, Void.TYPE).isSupported) {
                return;
            }
            onNext((Result<StateObj>) obj);
        }
    }

    public class f extends com.max.hbcommon.network.d<Result<EncryptionParamsObj>> {
        public static ChangeQuickRedirect changeQuickRedirect;

        f() {
        }

        @Override // com.max.hbcommon.network.d, io.reactivex.g0
        public void onError(Throwable th2) {
            if (!PatchProxy.proxy(new Object[]{th2}, this, changeQuickRedirect, false, 41118, new Class[]{Throwable.class}, Void.TYPE).isSupported && SteamStoreRedeemWalletCodeActivity.this.isActive()) {
                super.onError(th2);
                SteamStoreRedeemWalletCodeActivity.this.f89938b0.add("mallAssignKeys: onError");
                SteamStoreRedeemWalletCodeActivity.this.U = "status_all_activate_failed";
                SteamStoreRedeemWalletCodeActivity.m2(SteamStoreRedeemWalletCodeActivity.this, null);
            }
        }

        public void onNext(Result<EncryptionParamsObj> result) {
            if (!PatchProxy.proxy(new Object[]{result}, this, changeQuickRedirect, false, 41119, new Class[]{Result.class}, Void.TYPE).isSupported && SteamStoreRedeemWalletCodeActivity.this.isActive()) {
                super.onNext(result);
                EncryptionParamsObj result2 = result.getResult();
                if (result2 == null) {
                    SteamStoreRedeemWalletCodeActivity.this.f89938b0.add("mallAssignKeys: failed");
                    SteamStoreRedeemWalletCodeActivity.this.U = "status_all_activate_failed";
                    SteamStoreRedeemWalletCodeActivity.m2(SteamStoreRedeemWalletCodeActivity.this, null);
                    return;
                }
                SteamStoreRedeemWalletCodeActivity.this.Y = com.max.hbcommon.utils.e.c(result2.getP1(), w.c(result2.getP3()));
                String strA1 = com.max.xiaoheihe.utils.d.a1(SteamStoreRedeemWalletCodeActivity.this.Y);
                if (SteamStoreRedeemWalletCodeActivity.this.Y == null || !strA1.equals(result2.getP2())) {
                    SteamStoreRedeemWalletCodeActivity.this.f89938b0.add("mallAssignKeys: decrypt failed");
                    SteamStoreRedeemWalletCodeActivity.this.U = "status_all_activate_failed";
                    SteamStoreRedeemWalletCodeActivity.m2(SteamStoreRedeemWalletCodeActivity.this, null);
                } else {
                    SteamStoreRedeemWalletCodeActivity.this.f89938b0.add("mallAssignKeys: jsCheckLogin");
                    SteamStoreRedeemWalletCodeActivity steamStoreRedeemWalletCodeActivity = SteamStoreRedeemWalletCodeActivity.this;
                    SteamStoreRedeemWalletCodeActivity.Z1(steamStoreRedeemWalletCodeActivity, steamStoreRedeemWalletCodeActivity.Y);
                }
            }
        }

        @Override // com.max.hbcommon.network.d, io.reactivex.g0
        public /* bridge */ /* synthetic */ void onNext(Object obj) {
            if (PatchProxy.proxy(new Object[]{obj}, this, changeQuickRedirect, false, 41120, new Class[]{Object.class}, Void.TYPE).isSupported) {
                return;
            }
            onNext((Result<EncryptionParamsObj>) obj);
        }
    }

    public static class g extends Handler {
        public static ChangeQuickRedirect changeQuickRedirect;

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final WeakReference<SteamStoreRedeemWalletCodeActivity> f89945a;

        public g(SteamStoreRedeemWalletCodeActivity steamStoreRedeemWalletCodeActivity) {
            this.f89945a = new WeakReference<>(steamStoreRedeemWalletCodeActivity);
        }

        @Override // android.os.Handler
        public void handleMessage(Message message) {
            if (PatchProxy.proxy(new Object[]{message}, this, changeQuickRedirect, false, 41121, new Class[]{Message.class}, Void.TYPE).isSupported) {
                return;
            }
            super.handleMessage(message);
            SteamStoreRedeemWalletCodeActivity steamStoreRedeemWalletCodeActivity = this.f89945a.get();
            if (steamStoreRedeemWalletCodeActivity != null) {
                steamStoreRedeemWalletCodeActivity.G2();
            }
        }
    }

    private void A2() {
        if (PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 41094, new Class[0], Void.TYPE).isSupported) {
            return;
        }
        V((io.reactivex.disposables.b) com.max.xiaoheihe.network.i.a().Z6(this.R).I5(io.reactivex.schedulers.b.d()).a4(io.reactivex.android.schedulers.a.c()).J5(new f()));
    }

    private void B2(long j10) {
        if (PatchProxy.proxy(new Object[]{new Long(j10)}, this, changeQuickRedirect, false, 41093, new Class[]{Long.TYPE}, Void.TYPE).isSupported) {
            return;
        }
        V((io.reactivex.disposables.b) com.max.xiaoheihe.network.i.a().s3(this.R).w1(j10, TimeUnit.MILLISECONDS).I5(io.reactivex.schedulers.b.d()).a4(io.reactivex.android.schedulers.a.c()).J5(new e()));
    }

    private void C2() {
        if (PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 41095, new Class[0], Void.TYPE).isSupported) {
            return;
        }
        MallSteamReportObj mallSteamReportObj = new MallSteamReportObj();
        mallSteamReportObj.setData_type(1);
        mallSteamReportObj.setKeys(this.V);
        PostEncryptParamsObj postEncryptParamsObjV0 = com.max.xiaoheihe.utils.d.v0(com.max.hbutils.utils.k.p(mallSteamReportObj), true);
        com.max.xiaoheihe.network.i.a().g6(this.R, postEncryptParamsObjV0.getData(), postEncryptParamsObjV0.getKey(), postEncryptParamsObjV0.getSid(), postEncryptParamsObjV0.getTime()).I5(io.reactivex.schedulers.b.d()).a4(io.reactivex.android.schedulers.a.c()).g(new com.max.hbcommon.network.p());
    }

    private void D2() {
        if (PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 41085, new Class[0], Void.TYPE).isSupported || this.f66601b.isFinishing()) {
            return;
        }
        if (this.Z == null) {
            AlertDialog.Builder builder = new AlertDialog.Builder(this.f66601b);
            View viewInflate = this.f66602c.inflate(R.layout.dialog_activation, (ViewGroup) null, false);
            this.L = (ProgressBar) viewInflate.findViewById(R.id.pb_title);
            this.M = (TextView) viewInflate.findViewById(R.id.tv_title);
            this.N = (TextView) viewInflate.findViewById(R.id.tv_progress_0);
            TextView textView = (TextView) viewInflate.findViewById(R.id.tv_progress_desc_0);
            this.O = (ImageView) viewInflate.findViewById(R.id.pb_0);
            this.P = viewInflate.findViewById(R.id.vg_button_panel);
            TextView textView2 = (TextView) viewInflate.findViewById(R.id.tv_negative_button);
            this.Q = (TextView) viewInflate.findViewById(R.id.tv_positive_button);
            this.N.setText((CharSequence) null);
            this.N.setTextColor(getResources().getColor(R.color.badge_bg_color));
            textView.setText((CharSequence) null);
            textView2.setVisibility(8);
            AlertDialog alertDialogCreate = builder.setView(viewInflate).setCancelable(false).create();
            this.Z = alertDialogCreate;
            Window window = alertDialogCreate.getWindow();
            if (window != null) {
                window.setBackgroundDrawableResource(android.R.color.transparent);
            }
        }
        if (this.Z.isShowing()) {
            return;
        }
        this.Z.show();
        H2(null);
        this.f89937a0.removeCallbacksAndMessages(null);
        this.f89937a0.sendEmptyMessageDelayed(0, 10000L);
    }

    private void E2() {
        if (PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 41088, new Class[0], Void.TYPE).isSupported || this.f66601b.isFinishing()) {
            return;
        }
        new com.max.hbcommon.view.a.f(this.f66601b).x(R.string.prompt).k(R.string.purchase_relogin).t(R.string.confirm, new d()).F();
    }

    private void H2(String str) {
        if (PatchProxy.proxy(new Object[]{str}, this, changeQuickRedirect, false, 41084, new Class[]{String.class}, Void.TYPE).isSupported) {
            return;
        }
        if ("status_login".equals(this.U) || f89932p3.equals(this.U)) {
            this.mStatusTextView.setText(getString(R.string.purchase_login));
        } else if ("status_not_activate".equals(this.U) || "status_activating".equals(this.U)) {
            this.mStatusTextView.setText(getString(R.string.recharging_please_wait));
        } else if ("status_all_activate_succeed".equals(this.U)) {
            this.mStatusTextView.setText(getString(R.string.recharge_succeed));
        } else if ("status_all_activate_failed".equals(this.U)) {
            this.mStatusTextView.setText(getString(R.string.recharge_failed));
        }
        Dialog dialog = this.Z;
        if (dialog == null || !dialog.isShowing()) {
            return;
        }
        if ("status_not_activate".equals(this.U) || "status_activating".equals(this.U)) {
            this.L.setVisibility(0);
            this.M.setText(getString(R.string.recharging_please_wait));
            this.N.setText((CharSequence) null);
            AnimationDrawable animationDrawable = (AnimationDrawable) getResources().getDrawable(R.drawable.pb_loading);
            this.O.setImageDrawable(animationDrawable);
            animationDrawable.start();
            this.P.setVisibility(8);
            return;
        }
        if ("status_all_activate_succeed".equals(this.U)) {
            this.L.setVisibility(8);
            this.M.setText(getString(R.string.recharge_succeed));
            this.N.setText((CharSequence) null);
            this.O.setImageResource(R.color.interactive_color);
            this.P.setVisibility(0);
            this.Q.setVisibility(0);
            this.Q.setOnClickListener(new b());
            return;
        }
        if ("status_all_activate_failed".equals(this.U)) {
            this.L.setVisibility(8);
            this.M.setText(getString(R.string.recharge_failed));
            this.N.setText(str);
            this.O.setImageDrawable((AnimationDrawable) getResources().getDrawable(R.drawable.pb_loading_timeout));
            this.P.setVisibility(0);
            this.Q.setVisibility(0);
            this.Q.setOnClickListener(new c());
        }
    }

    static /* synthetic */ void T1(SteamStoreRedeemWalletCodeActivity steamStoreRedeemWalletCodeActivity) {
        if (PatchProxy.proxy(new Object[]{steamStoreRedeemWalletCodeActivity}, null, changeQuickRedirect, true, 41102, new Class[]{SteamStoreRedeemWalletCodeActivity.class}, Void.TYPE).isSupported) {
            return;
        }
        steamStoreRedeemWalletCodeActivity.C2();
    }

    static /* synthetic */ void W1(SteamStoreRedeemWalletCodeActivity steamStoreRedeemWalletCodeActivity, String str) {
        if (PatchProxy.proxy(new Object[]{steamStoreRedeemWalletCodeActivity, str}, null, changeQuickRedirect, true, 41103, new Class[]{SteamStoreRedeemWalletCodeActivity.class, String.class}, Void.TYPE).isSupported) {
            return;
        }
        steamStoreRedeemWalletCodeActivity.z2(str);
    }

    static /* synthetic */ void X1(SteamStoreRedeemWalletCodeActivity steamStoreRedeemWalletCodeActivity) {
        if (PatchProxy.proxy(new Object[]{steamStoreRedeemWalletCodeActivity}, null, changeQuickRedirect, true, 41104, new Class[]{SteamStoreRedeemWalletCodeActivity.class}, Void.TYPE).isSupported) {
            return;
        }
        steamStoreRedeemWalletCodeActivity.E2();
    }

    static /* synthetic */ void Z1(SteamStoreRedeemWalletCodeActivity steamStoreRedeemWalletCodeActivity, String str) {
        if (PatchProxy.proxy(new Object[]{steamStoreRedeemWalletCodeActivity, str}, null, changeQuickRedirect, true, 41105, new Class[]{SteamStoreRedeemWalletCodeActivity.class, String.class}, Void.TYPE).isSupported) {
            return;
        }
        steamStoreRedeemWalletCodeActivity.x2(str);
    }

    static /* synthetic */ void c2(SteamStoreRedeemWalletCodeActivity steamStoreRedeemWalletCodeActivity, long j10) {
        if (PatchProxy.proxy(new Object[]{steamStoreRedeemWalletCodeActivity, new Long(j10)}, null, changeQuickRedirect, true, 41106, new Class[]{SteamStoreRedeemWalletCodeActivity.class, Long.TYPE}, Void.TYPE).isSupported) {
            return;
        }
        steamStoreRedeemWalletCodeActivity.B2(j10);
    }

    static /* synthetic */ int h2(SteamStoreRedeemWalletCodeActivity steamStoreRedeemWalletCodeActivity) {
        int i10 = steamStoreRedeemWalletCodeActivity.X;
        steamStoreRedeemWalletCodeActivity.X = i10 + 1;
        return i10;
    }

    static /* synthetic */ void i2(SteamStoreRedeemWalletCodeActivity steamStoreRedeemWalletCodeActivity) {
        if (PatchProxy.proxy(new Object[]{steamStoreRedeemWalletCodeActivity}, null, changeQuickRedirect, true, 41107, new Class[]{SteamStoreRedeemWalletCodeActivity.class}, Void.TYPE).isSupported) {
            return;
        }
        steamStoreRedeemWalletCodeActivity.A2();
    }

    static /* synthetic */ void k2(SteamStoreRedeemWalletCodeActivity steamStoreRedeemWalletCodeActivity) {
        if (PatchProxy.proxy(new Object[]{steamStoreRedeemWalletCodeActivity}, null, changeQuickRedirect, true, 41098, new Class[]{SteamStoreRedeemWalletCodeActivity.class}, Void.TYPE).isSupported) {
            return;
        }
        steamStoreRedeemWalletCodeActivity.D2();
    }

    static /* synthetic */ void l2(SteamStoreRedeemWalletCodeActivity steamStoreRedeemWalletCodeActivity) {
        if (PatchProxy.proxy(new Object[]{steamStoreRedeemWalletCodeActivity}, null, changeQuickRedirect, true, 41099, new Class[]{SteamStoreRedeemWalletCodeActivity.class}, Void.TYPE).isSupported) {
            return;
        }
        steamStoreRedeemWalletCodeActivity.v2();
    }

    static /* synthetic */ void m2(SteamStoreRedeemWalletCodeActivity steamStoreRedeemWalletCodeActivity, String str) {
        if (PatchProxy.proxy(new Object[]{steamStoreRedeemWalletCodeActivity, str}, null, changeQuickRedirect, true, 41100, new Class[]{SteamStoreRedeemWalletCodeActivity.class, String.class}, Void.TYPE).isSupported) {
            return;
        }
        steamStoreRedeemWalletCodeActivity.H2(str);
    }

    static /* synthetic */ void o2(SteamStoreRedeemWalletCodeActivity steamStoreRedeemWalletCodeActivity) {
        if (PatchProxy.proxy(new Object[]{steamStoreRedeemWalletCodeActivity}, null, changeQuickRedirect, true, 41101, new Class[]{SteamStoreRedeemWalletCodeActivity.class}, Void.TYPE).isSupported) {
            return;
        }
        steamStoreRedeemWalletCodeActivity.y2();
    }

    private void q2() {
        if (PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 41096, new Class[0], Void.TYPE).isSupported) {
            return;
        }
        StringBuilder sb2 = new StringBuilder(Constants.ARRAY_TYPE);
        for (int i10 = 0; i10 < this.f89938b0.size(); i10++) {
            if (i10 != 0) {
                sb2.append(", ");
            }
            sb2.append(this.f89938b0.get(i10));
        }
        sb2.append("]");
        MobclickAgent.reportError(HeyBoxApplication.C(), new IllegalArgumentException("RedeemWalletCode: userId: " + i0.j() + ", status: " + this.U + ", options: " + ((Object) sb2)));
    }

    private void r2(String str) {
        WebviewFragment webviewFragment;
        if (PatchProxy.proxy(new Object[]{str}, this, changeQuickRedirect, false, 41089, new Class[]{String.class}, Void.TYPE).isSupported || (webviewFragment = (WebviewFragment) getSupportFragmentManager().r0(R.id.fragment_container)) == null) {
            return;
        }
        webviewFragment.H6(str, null);
    }

    public static Intent u2(Context context, String str, SteamWalletJsObj steamWalletJsObj, ArrayList<String> arrayList) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{context, str, steamWalletJsObj, arrayList}, null, changeQuickRedirect, true, 41082, new Class[]{Context.class, String.class, SteamWalletJsObj.class, ArrayList.class}, Intent.class);
        if (patchProxyResultProxy.isSupported) {
            return (Intent) patchProxyResultProxy.result;
        }
        Intent intent = new Intent(context, (Class<?>) SteamStoreRedeemWalletCodeActivity.class);
        intent.putExtra("order_id", str);
        intent.putExtra(f89930p1, steamWalletJsObj);
        intent.putExtra("keys", arrayList);
        return intent;
    }

    private void v2() {
        Dialog dialog;
        if (PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 41086, new Class[0], Void.TYPE).isSupported) {
            return;
        }
        this.f89937a0.removeCallbacksAndMessages(null);
        if (this.f66601b.isFinishing() || (dialog = this.Z) == null || !dialog.isShowing()) {
            return;
        }
        this.Z.dismiss();
    }

    private void x2(String str) {
        if (PatchProxy.proxy(new Object[]{str}, this, changeQuickRedirect, false, 41091, new Class[]{String.class}, Void.TYPE).isSupported) {
            return;
        }
        EncryptionParamsObj js = this.S.getRedeemwallet().getJs();
        String strC = com.max.hbcommon.utils.e.c(js.getP1(), w.c(js.getP3()));
        String strA1 = com.max.xiaoheihe.utils.d.a1(strC);
        if (strC == null || !strA1.equals(js.getP2())) {
            return;
        }
        r2(strC.replaceAll(this.S.getRedeemwallet().getKey(), str));
    }

    private void y2() {
        if (PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 41092, new Class[0], Void.TYPE).isSupported) {
            return;
        }
        EncryptionParamsObj js = this.S.getCheckLogin().getJs();
        String strC = com.max.hbcommon.utils.e.c(js.getP1(), w.c(js.getP3()));
        String strA1 = com.max.xiaoheihe.utils.d.a1(strC);
        if (strC == null || !strA1.equals(js.getP2())) {
            return;
        }
        r2(strC);
    }

    private void z2(String str) {
        WebviewFragment webviewFragment;
        if (PatchProxy.proxy(new Object[]{str}, this, changeQuickRedirect, false, 41090, new Class[]{String.class}, Void.TYPE).isSupported || (webviewFragment = (WebviewFragment) getSupportFragmentManager().r0(R.id.fragment_container)) == null) {
            return;
        }
        webviewFragment.t7(str);
    }

    public void G2() {
        Dialog dialog;
        if (PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 41087, new Class[0], Void.TYPE).isSupported || (dialog = this.Z) == null || !dialog.isShowing()) {
            return;
        }
        if ("status_not_activate".equals(this.U) || "status_activating".equals(this.U)) {
            this.f89938b0.add("setCancelable(true)");
            this.Z.setCancelable(true);
        }
    }

    /* JADX WARN: Code duplicated, block: B:14:0x0095  */
    @Override // com.max.hbcommon.base.BaseActivity
    public void k1() {
        String str;
        if (PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 41083, new Class[0], Void.TYPE).isSupported) {
            return;
        }
        setContentView(R.layout.activity_steam_store_redeem_wallet_code);
        ButterKnife.a(this);
        this.R = getIntent().getStringExtra("order_id");
        this.S = (SteamWalletJsObj) getIntent().getSerializableExtra(f89930p1);
        this.T = (ArrayList) getIntent().getSerializableExtra("keys");
        this.f66616q.setTitle(getString(R.string.loading));
        this.f66617r.setVisibility(0);
        this.U = "status_not_activate";
        String str2 = null;
        if (this.S.getSteam_proxy() == null || this.S.getSteam_proxy().getProxy() == null) {
            str = null;
        } else {
            String strV = com.max.xiaoheihe.utils.d.v(this.S.getSteam_proxy().getProxy());
            if (com.max.hbcommon.utils.c.u(strV)) {
                str = null;
            } else {
                String[] strArrSplit = strV.split(":");
                if (strArrSplit.length > 1) {
                    str2 = strArrSplit[0];
                    str = strArrSplit[1];
                } else {
                    str = null;
                }
            }
        }
        if (((WebviewFragment) getSupportFragmentManager().r0(R.id.fragment_container)) == null) {
            WebviewFragment webviewFragmentA = new u(this.S.getCheckLogin().getUrl()).t(new ProxyAddressObj(str2, str)).a();
            webviewFragmentA.Y7(new a());
            getSupportFragmentManager().u().b(R.id.fragment_container, webviewFragmentA).m();
        }
    }

    @Override // com.max.hbcommon.base.BaseActivity, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, android.app.Activity
    public void onDestroy() {
        if (PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 41097, new Class[0], Void.TYPE).isSupported) {
            return;
        }
        this.f89937a0.removeCallbacksAndMessages(null);
        v2();
        if (!"status_all_activate_succeed".equals(this.U)) {
            q2();
        }
        super.onDestroy();
    }
}
