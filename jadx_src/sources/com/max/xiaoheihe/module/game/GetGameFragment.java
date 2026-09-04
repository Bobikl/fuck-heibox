package com.max.xiaoheihe.module.game;

import android.animation.Animator;
import android.animation.ObjectAnimator;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.util.Log;
import android.view.View;
import android.view.ViewGroup;
import android.webkit.ValueCallback;
import android.widget.LinearLayout;
import butterknife.BindView;
import butterknife.ButterKnife;
import com.google.gson.JsonObject;
import com.max.hbcommon.component.bottombutton.BottomButtonLeftItemView;
import com.max.hbcustomview.loadingdialog.LoadingDialog;
import com.max.hbutils.bean.Result;
import com.max.xiaoheihe.R;
import com.max.xiaoheihe.bean.account.PushStateObj;
import com.max.xiaoheihe.bean.mall.SteamWalletJsObj;
import com.max.xiaoheihe.module.magic.MagicUtil;
import com.max.xiaoheihe.module.mall.SteamStoreAddFreeGamesActivity;
import com.max.xiaoheihe.module.webview.WebviewFragment;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.PatchProxyResult;

/* JADX INFO: loaded from: classes11.dex */
public class GetGameFragment extends com.max.hbcommon.base.d {
    public static ChangeQuickRedirect changeQuickRedirect = null;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public static final String f85295k = "type";

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private static final String f85296l = "url";

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private static final String f85297m = "getSelectedPackageIds()";

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private static final String f85298n = "window.selectAll()";

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    private static final String f85299o = "window.app.hasSelectAll";

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    private static final int f85300p = 200;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private Runnable f85302c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private PushStateObj f85303d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private String f85304e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private String f85305f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private RefreshPlatformGamesAllCheckedBroadcastReceiver f85306g;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private LoadingDialog f85308i;

    @BindView(R.id.ll_bottom_bar)
    BottomButtonLeftItemView mConfirmView;

    @BindView(R.id.ll_remind_bubble)
    LinearLayout mRemindBubble;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    Handler f85301b = new Handler();

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private int f85307h = 0;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private long f85309j = 0;

    public class RefreshPlatformGamesAllCheckedBroadcastReceiver extends BroadcastReceiver {
        public static ChangeQuickRedirect changeQuickRedirect;

        private RefreshPlatformGamesAllCheckedBroadcastReceiver() {
        }

        /* synthetic */ RefreshPlatformGamesAllCheckedBroadcastReceiver(GetGameFragment getGameFragment, a aVar) {
            this();
        }

        @Override // android.content.BroadcastReceiver
        public void onReceive(Context context, Intent intent) {
            if (!PatchProxy.proxy(new Object[]{context, intent}, this, changeQuickRedirect, false, 35009, new Class[]{Context.class, Intent.class}, Void.TYPE).isSupported && lb.a.Q.equals(intent.getAction())) {
                String stringExtra = intent.getStringExtra(lb.a.f131014o0);
                String stringExtra2 = intent.getStringExtra(lb.a.f131008n0);
                String stringExtra3 = intent.getStringExtra(lb.a.f131020p0);
                GetGameFragment getGameFragment = GetGameFragment.this;
                if (getGameFragment.mConfirmView != null) {
                    if (("addfreelicense".equals(getGameFragment.f85304e) && "steam".equals(stringExtra)) || ("addfreelicense_epic".equals(GetGameFragment.this.f85304e) && "epic".equals(stringExtra))) {
                        if ("0".equals(stringExtra2)) {
                            GetGameFragment.this.mConfirmView.setChecked(false, false);
                        } else if ("1".equals(stringExtra2)) {
                            GetGameFragment.this.mConfirmView.setChecked(true, false);
                        }
                        if ("1".equals(stringExtra3)) {
                            GetGameFragment.this.mConfirmView.setVisibility(8);
                        } else {
                            GetGameFragment.this.mConfirmView.setVisibility(0);
                        }
                    }
                }
            }
        }
    }

    public class a implements Runnable {
        public static ChangeQuickRedirect changeQuickRedirect;

        /* JADX INFO: renamed from: com.max.xiaoheihe.module.game.GetGameFragment$a$a, reason: collision with other inner class name */
        public class C0758a implements Animator.AnimatorListener {
            public static ChangeQuickRedirect changeQuickRedirect;

            C0758a() {
            }

            @Override // android.animation.Animator.AnimatorListener
            public void onAnimationCancel(Animator animator) {
            }

            @Override // android.animation.Animator.AnimatorListener
            public void onAnimationEnd(Animator animator) {
                if (PatchProxy.proxy(new Object[]{animator}, this, changeQuickRedirect, false, 34984, new Class[]{Animator.class}, Void.TYPE).isSupported) {
                    return;
                }
                GetGameFragment.this.mRemindBubble.setVisibility(8);
            }

            @Override // android.animation.Animator.AnimatorListener
            public void onAnimationRepeat(Animator animator) {
            }

            @Override // android.animation.Animator.AnimatorListener
            public void onAnimationStart(Animator animator) {
            }
        }

        a() {
        }

        @Override // java.lang.Runnable
        public void run() {
            if (PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 34983, new Class[0], Void.TYPE).isSupported || 8 == GetGameFragment.this.mRemindBubble.getVisibility()) {
                return;
            }
            ObjectAnimator duration = ObjectAnimator.ofFloat(GetGameFragment.this.mRemindBubble, "alpha", 1.0f, 0.0f).setDuration(300L);
            duration.addListener(new C0758a());
            duration.start();
            GetGameFragment.this.addValueAnimator(duration);
        }
    }

    public class b implements DialogInterface.OnClickListener {
        public static ChangeQuickRedirect changeQuickRedirect;

        b() {
        }

        @Override // android.content.DialogInterface.OnClickListener
        public void onClick(DialogInterface dialogInterface, int i10) {
            if (PatchProxy.proxy(new Object[]{dialogInterface, new Integer(i10)}, this, changeQuickRedirect, false, 34985, new Class[]{DialogInterface.class, Integer.TYPE}, Void.TYPE).isSupported) {
                return;
            }
            dialogInterface.dismiss();
            com.max.xiaoheihe.utils.d.B0(((com.max.hbcommon.base.d) GetGameFragment.this).mContext);
        }
    }

    public class c implements View.OnClickListener {
        public static ChangeQuickRedirect changeQuickRedirect;

        c() {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            if (PatchProxy.proxy(new Object[]{view}, this, changeQuickRedirect, false, 34986, new Class[]{View.class}, Void.TYPE).isSupported) {
                return;
            }
            GetGameFragment.this.mRemindBubble.setVisibility(8);
            if (GetGameFragment.this.f85302c != null) {
                GetGameFragment getGameFragment = GetGameFragment.this;
                getGameFragment.f85301b.removeCallbacks(getGameFragment.f85302c);
            }
        }
    }

    public class d implements View.OnClickListener {
        public static ChangeQuickRedirect changeQuickRedirect;

        public class a implements com.max.xiaoheihe.utils.l0.i {
            public static ChangeQuickRedirect changeQuickRedirect;

            a() {
            }

            /* JADX INFO: Access modifiers changed from: private */
            public /* synthetic */ kotlin.b2 d(String str, SteamWalletJsObj steamWalletJsObj) {
                PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{str, steamWalletJsObj}, this, changeQuickRedirect, false, 34989, new Class[]{String.class, SteamWalletJsObj.class}, kotlin.b2.class);
                if (patchProxyResultProxy.isSupported) {
                    return (kotlin.b2) patchProxyResultProxy.result;
                }
                GetGameFragment getGameFragment = GetGameFragment.this;
                getGameFragment.startActivity(SteamStoreAddFreeGamesActivity.p2(((com.max.hbcommon.base.d) getGameFragment).mContext, str, steamWalletJsObj));
                return null;
            }

            @Override // com.max.xiaoheihe.utils.l0.i
            public void a(String str) {
                if (PatchProxy.proxy(new Object[]{str}, this, changeQuickRedirect, false, 34988, new Class[]{String.class}, Void.TYPE).isSupported) {
                    return;
                }
                final String strW = com.max.xiaoheihe.utils.l0.w(str);
                Log.d("onReceiveValue", "JS_GET_SELECTED_PACKAGE_IDS" + strW);
                if (com.max.hbcommon.utils.c.u(strW)) {
                    return;
                }
                if ("addfreelicense_epic".equals(GetGameFragment.this.f85304e)) {
                    GetGameFragment.Y3(GetGameFragment.this, strW);
                } else {
                    MagicUtil.f89378a.d(((com.max.hbcommon.base.d) GetGameFragment.this).mContext, new yh.l() { // from class: com.max.xiaoheihe.module.game.w1
                        @Override // yh.l
                        public final Object invoke(Object obj) {
                            return this.f88528b.d(strW, (SteamWalletJsObj) obj);
                        }
                    });
                }
            }

            @Override // com.max.xiaoheihe.utils.l0.i
            public boolean b() {
                return true;
            }
        }

        public class b implements ValueCallback<String> {
            public static ChangeQuickRedirect changeQuickRedirect;

            public class a implements yh.l<SteamWalletJsObj, kotlin.b2> {
                public static ChangeQuickRedirect changeQuickRedirect;

                /* JADX INFO: renamed from: b, reason: collision with root package name */
                final /* synthetic */ String f85318b;

                a(String str) {
                    this.f85318b = str;
                }

                public kotlin.b2 a(SteamWalletJsObj steamWalletJsObj) {
                    PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{steamWalletJsObj}, this, changeQuickRedirect, false, 34992, new Class[]{SteamWalletJsObj.class}, kotlin.b2.class);
                    if (patchProxyResultProxy.isSupported) {
                        return (kotlin.b2) patchProxyResultProxy.result;
                    }
                    GetGameFragment getGameFragment = GetGameFragment.this;
                    getGameFragment.startActivity(SteamStoreAddFreeGamesActivity.p2(((com.max.hbcommon.base.d) getGameFragment).mContext, this.f85318b, steamWalletJsObj));
                    return null;
                }

                /* JADX WARN: Type inference failed for: r9v3, types: [java.lang.Object, kotlin.b2] */
                @Override // yh.l
                public /* bridge */ /* synthetic */ kotlin.b2 invoke(SteamWalletJsObj steamWalletJsObj) {
                    PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{steamWalletJsObj}, this, changeQuickRedirect, false, 34993, new Class[]{Object.class}, Object.class);
                    return patchProxyResultProxy.isSupported ? patchProxyResultProxy.result : a(steamWalletJsObj);
                }
            }

            b() {
            }

            public void a(String str) {
                if (PatchProxy.proxy(new Object[]{str}, this, changeQuickRedirect, false, 34990, new Class[]{String.class}, Void.TYPE).isSupported) {
                    return;
                }
                String strW = com.max.xiaoheihe.utils.l0.w(str);
                Log.d("onReceiveValue", "JS_GET_SELECTED_PACKAGE_IDS" + strW);
                if (com.max.hbcommon.utils.c.u(strW)) {
                    return;
                }
                if ("addfreelicense_epic".equals(GetGameFragment.this.f85304e)) {
                    GetGameFragment.Y3(GetGameFragment.this, strW);
                } else {
                    MagicUtil.f89378a.d(((com.max.hbcommon.base.d) GetGameFragment.this).mContext, new a(strW));
                }
            }

            @Override // android.webkit.ValueCallback
            public /* bridge */ /* synthetic */ void onReceiveValue(String str) {
                if (PatchProxy.proxy(new Object[]{str}, this, changeQuickRedirect, false, 34991, new Class[]{Object.class}, Void.TYPE).isSupported) {
                    return;
                }
                a(str);
            }
        }

        d() {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            WebviewFragment webviewFragment;
            if (PatchProxy.proxy(new Object[]{view}, this, changeQuickRedirect, false, 34987, new Class[]{View.class}, Void.TYPE).isSupported || (webviewFragment = (WebviewFragment) GetGameFragment.this.getChildFragmentManager().r0(R.id.fragment_container)) == null || webviewFragment.I6("getSelectedPackageIds", com.max.xiaoheihe.module.webview.c0.f94589k, new a())) {
                return;
            }
            webviewFragment.H6(GetGameFragment.f85297m, new b());
        }
    }

    public class e implements View.OnClickListener {
        public static ChangeQuickRedirect changeQuickRedirect;

        e() {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            if (PatchProxy.proxy(new Object[]{view}, this, changeQuickRedirect, false, 34994, new Class[]{View.class}, Void.TYPE).isSupported) {
                return;
            }
            GetGameFragment.this.mConfirmView.getLeftButton().setClickable(false);
            if ("0".equals(GetGameFragment.this.f85303d.getPush_state()) && !com.max.xiaoheihe.utils.d.N0(((com.max.hbcommon.base.d) GetGameFragment.this).mContext)) {
                GetGameFragment.this.q4();
            }
            if ("0".equals(GetGameFragment.this.f85303d.getPush_state())) {
                GetGameFragment.O3(GetGameFragment.this, true);
                GetGameFragment getGameFragment = GetGameFragment.this;
                GetGameFragment.P3(getGameFragment, getGameFragment.f85303d, "1");
            } else {
                GetGameFragment.O3(GetGameFragment.this, false);
                GetGameFragment getGameFragment2 = GetGameFragment.this;
                GetGameFragment.P3(getGameFragment2, getGameFragment2.f85303d, "0");
            }
        }
    }

    public class f implements BottomButtonLeftItemView.a {
        public static ChangeQuickRedirect changeQuickRedirect;

        f() {
        }

        @Override // com.max.hbcommon.component.bottombutton.BottomButtonLeftItemView.a
        public void a(boolean z10) {
            if (PatchProxy.proxy(new Object[]{new Byte(z10 ? (byte) 1 : (byte) 0)}, this, changeQuickRedirect, false, 34995, new Class[]{Boolean.TYPE}, Void.TYPE).isSupported) {
                return;
            }
            GetGameFragment.Q3(GetGameFragment.this);
        }
    }

    public class g implements ValueCallback<String> {
        public static ChangeQuickRedirect changeQuickRedirect;

        g() {
        }

        public void a(String str) {
            if (PatchProxy.proxy(new Object[]{str}, this, changeQuickRedirect, false, 34996, new Class[]{String.class}, Void.TYPE).isSupported) {
                return;
            }
            String strW = com.max.xiaoheihe.utils.l0.w(str);
            if (com.max.hbcommon.utils.c.u(strW)) {
                return;
            }
            if ("true".equals(strW)) {
                GetGameFragment.this.mConfirmView.setChecked(true, false);
            } else {
                GetGameFragment.this.mConfirmView.setChecked(false, false);
            }
        }

        @Override // android.webkit.ValueCallback
        public /* bridge */ /* synthetic */ void onReceiveValue(String str) {
            if (PatchProxy.proxy(new Object[]{str}, this, changeQuickRedirect, false, 34997, new Class[]{Object.class}, Void.TYPE).isSupported) {
                return;
            }
            a(str);
        }
    }

    public class h extends com.max.hbcommon.network.d<Result<PushStateObj>> {
        public static ChangeQuickRedirect changeQuickRedirect;

        h() {
        }

        @Override // com.max.hbcommon.network.d, io.reactivex.g0
        public void onComplete() {
            if (!PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 34999, new Class[0], Void.TYPE).isSupported && GetGameFragment.this.isActive()) {
                super.onComplete();
            }
        }

        @Override // com.max.hbcommon.network.d, io.reactivex.g0
        public void onError(Throwable th2) {
            if (!PatchProxy.proxy(new Object[]{th2}, this, changeQuickRedirect, false, 34998, new Class[]{Throwable.class}, Void.TYPE).isSupported && GetGameFragment.this.isActive()) {
                super.onError(th2);
                GetGameFragment.R3(GetGameFragment.this);
                GetGameFragment.this.mConfirmView.getLeftButton().setClickable(true);
            }
        }

        public void onNext(Result<PushStateObj> result) {
            if (!PatchProxy.proxy(new Object[]{result}, this, changeQuickRedirect, false, 35000, new Class[]{Result.class}, Void.TYPE).isSupported && GetGameFragment.this.isActive()) {
                super.onNext(result);
                GetGameFragment.S3(GetGameFragment.this);
                GetGameFragment getGameFragment = GetGameFragment.this;
                getGameFragment.o4(getGameFragment.f85307h);
                GetGameFragment.this.f85303d = result.getResult();
                GetGameFragment getGameFragment2 = GetGameFragment.this;
                GetGameFragment.U3(getGameFragment2, getGameFragment2.f85303d);
                GetGameFragment.this.mConfirmView.getLeftButton().setClickable(true);
            }
        }

        @Override // com.max.hbcommon.network.d, io.reactivex.g0
        public /* bridge */ /* synthetic */ void onNext(Object obj) {
            if (PatchProxy.proxy(new Object[]{obj}, this, changeQuickRedirect, false, 35001, new Class[]{Object.class}, Void.TYPE).isSupported) {
                return;
            }
            onNext((Result<PushStateObj>) obj);
        }
    }

    public class i extends com.max.hbcommon.network.p {
        public static ChangeQuickRedirect changeQuickRedirect;

        i() {
        }

        @Override // com.max.hbcommon.network.p, com.max.hbcommon.network.d, io.reactivex.g0
        public void onError(Throwable th2) {
            if (PatchProxy.proxy(new Object[]{th2}, this, changeQuickRedirect, false, 35003, new Class[]{Throwable.class}, Void.TYPE).isSupported) {
                return;
            }
            GetGameFragment.V3(GetGameFragment.this);
        }

        @Override // com.max.hbcommon.network.p
        public void onNext(Result result) {
            if (PatchProxy.proxy(new Object[]{result}, this, changeQuickRedirect, false, 35002, new Class[]{Result.class}, Void.TYPE).isSupported) {
                return;
            }
            GetGameFragment.V3(GetGameFragment.this);
        }

        @Override // com.max.hbcommon.network.p, com.max.hbcommon.network.d, io.reactivex.g0
        public /* bridge */ /* synthetic */ void onNext(Object obj) {
            if (PatchProxy.proxy(new Object[]{obj}, this, changeQuickRedirect, false, 35004, new Class[]{Object.class}, Void.TYPE).isSupported) {
                return;
            }
            onNext((Result) obj);
        }
    }

    public class j extends com.max.hbcommon.network.d<Result> {
        public static ChangeQuickRedirect changeQuickRedirect;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ PushStateObj f85325b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ String f85326c;

        j(PushStateObj pushStateObj, String str) {
            this.f85325b = pushStateObj;
            this.f85326c = str;
        }

        @Override // com.max.hbcommon.network.d, io.reactivex.g0
        public void onComplete() {
            if (!PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 35006, new Class[0], Void.TYPE).isSupported && GetGameFragment.this.isActive()) {
                super.onComplete();
            }
        }

        @Override // com.max.hbcommon.network.d, io.reactivex.g0
        public void onError(Throwable th2) {
            if (!PatchProxy.proxy(new Object[]{th2}, this, changeQuickRedirect, false, 35005, new Class[]{Throwable.class}, Void.TYPE).isSupported && GetGameFragment.this.isActive()) {
                super.onError(th2);
                if ("0".equals(GetGameFragment.this.f85303d.getPush_state())) {
                    GetGameFragment.O3(GetGameFragment.this, false);
                } else {
                    GetGameFragment.O3(GetGameFragment.this, true);
                }
                GetGameFragment.this.mConfirmView.getLeftButton().setClickable(true);
            }
        }

        public void onNext(Result result) {
            if (!PatchProxy.proxy(new Object[]{result}, this, changeQuickRedirect, false, 35007, new Class[]{Result.class}, Void.TYPE).isSupported && GetGameFragment.this.isActive()) {
                super.onNext(result);
                this.f85325b.setPush_state(this.f85326c);
                GetGameFragment.this.mConfirmView.getLeftButton().setClickable(true);
                if (GetGameFragment.this.getActivity() instanceof GetGameActivity) {
                    ((GetGameActivity) GetGameFragment.this.getActivity()).M1();
                }
            }
        }

        @Override // com.max.hbcommon.network.d, io.reactivex.g0
        public /* bridge */ /* synthetic */ void onNext(Object obj) {
            if (PatchProxy.proxy(new Object[]{obj}, this, changeQuickRedirect, false, 35008, new Class[]{Object.class}, Void.TYPE).isSupported) {
                return;
            }
            onNext((Result) obj);
        }
    }

    static /* synthetic */ void O3(GetGameFragment getGameFragment, boolean z10) {
        if (PatchProxy.proxy(new Object[]{getGameFragment, new Byte(z10 ? (byte) 1 : (byte) 0)}, null, changeQuickRedirect, true, 34976, new Class[]{GetGameFragment.class, Boolean.TYPE}, Void.TYPE).isSupported) {
            return;
        }
        getGameFragment.u4(z10);
    }

    static /* synthetic */ void P3(GetGameFragment getGameFragment, PushStateObj pushStateObj, String str) {
        if (PatchProxy.proxy(new Object[]{getGameFragment, pushStateObj, str}, null, changeQuickRedirect, true, 34977, new Class[]{GetGameFragment.class, PushStateObj.class, String.class}, Void.TYPE).isSupported) {
            return;
        }
        getGameFragment.s4(pushStateObj, str);
    }

    static /* synthetic */ void Q3(GetGameFragment getGameFragment) {
        if (PatchProxy.proxy(new Object[]{getGameFragment}, null, changeQuickRedirect, true, 34978, new Class[]{GetGameFragment.class}, Void.TYPE).isSupported) {
            return;
        }
        getGameFragment.g4();
    }

    static /* synthetic */ void R3(GetGameFragment getGameFragment) {
        if (PatchProxy.proxy(new Object[]{getGameFragment}, null, changeQuickRedirect, true, 34979, new Class[]{GetGameFragment.class}, Void.TYPE).isSupported) {
            return;
        }
        getGameFragment.showError();
    }

    static /* synthetic */ void S3(GetGameFragment getGameFragment) {
        if (PatchProxy.proxy(new Object[]{getGameFragment}, null, changeQuickRedirect, true, 34980, new Class[]{GetGameFragment.class}, Void.TYPE).isSupported) {
            return;
        }
        getGameFragment.showContentView();
    }

    static /* synthetic */ void U3(GetGameFragment getGameFragment, PushStateObj pushStateObj) {
        if (PatchProxy.proxy(new Object[]{getGameFragment, pushStateObj}, null, changeQuickRedirect, true, 34981, new Class[]{GetGameFragment.class, PushStateObj.class}, Void.TYPE).isSupported) {
            return;
        }
        getGameFragment.p4(pushStateObj);
    }

    static /* synthetic */ void V3(GetGameFragment getGameFragment) {
        if (PatchProxy.proxy(new Object[]{getGameFragment}, null, changeQuickRedirect, true, 34982, new Class[]{GetGameFragment.class}, Void.TYPE).isSupported) {
            return;
        }
        getGameFragment.j4();
    }

    static /* synthetic */ void Y3(GetGameFragment getGameFragment, String str) {
        if (PatchProxy.proxy(new Object[]{getGameFragment, str}, null, changeQuickRedirect, true, 34975, new Class[]{GetGameFragment.class, String.class}, Void.TYPE).isSupported) {
            return;
        }
        getGameFragment.m4(str);
    }

    private void g4() {
        if (PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 34959, new Class[0], Void.TYPE).isSupported) {
            return;
        }
        long jCurrentTimeMillis = System.currentTimeMillis();
        if (jCurrentTimeMillis - this.f85309j > 200) {
            this.f85309j = jCurrentTimeMillis;
            r4();
        } else {
            com.max.hbutils.utils.c cVar = com.max.hbutils.utils.c.f73533a;
            com.max.hbutils.utils.c.f(getString(R.string.operation_too_fast));
        }
    }

    private void h4() {
        WebviewFragment webviewFragment;
        if (PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 34961, new Class[0], Void.TYPE).isSupported || (webviewFragment = (WebviewFragment) getChildFragmentManager().r0(R.id.fragment_container)) == null) {
            return;
        }
        webviewFragment.H6(f85299o, new g());
    }

    private void j4() {
        LoadingDialog loadingDialog;
        if (PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 34969, new Class[0], Void.TYPE).isSupported || !isActive() || this.mContext.isFinishing() || (loadingDialog = this.f85308i) == null) {
            return;
        }
        loadingDialog.c();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ void k4(JsonObject jsonObject) {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ void l4(WebviewFragment webviewFragment) {
        if (PatchProxy.proxy(new Object[]{webviewFragment}, null, changeQuickRedirect, true, 34974, new Class[]{WebviewFragment.class}, Void.TYPE).isSupported) {
            return;
        }
        webviewFragment.H6(f85298n, null);
    }

    private void m4(String str) {
        if (PatchProxy.proxy(new Object[]{str}, this, changeQuickRedirect, false, 34967, new Class[]{String.class}, Void.TYPE).isSupported) {
            return;
        }
        t4();
        r1.f1(this.mContext, str, false, new i());
    }

    public static GetGameFragment n4(String str, String str2) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{str, str2}, null, changeQuickRedirect, true, 34955, new Class[]{String.class, String.class}, GetGameFragment.class);
        if (patchProxyResultProxy.isSupported) {
            return (GetGameFragment) patchProxyResultProxy.result;
        }
        GetGameFragment getGameFragment = new GetGameFragment();
        Bundle bundle = new Bundle();
        bundle.putString("type", str);
        bundle.putString("url", str2);
        getGameFragment.setArguments(bundle);
        return getGameFragment;
    }

    private void p4(PushStateObj pushStateObj) {
        if (PatchProxy.proxy(new Object[]{pushStateObj}, this, changeQuickRedirect, false, 34971, new Class[]{PushStateObj.class}, Void.TYPE).isSupported) {
            return;
        }
        if ("1".equals(pushStateObj.getPush_state())) {
            u4(true);
        } else {
            u4(false);
        }
    }

    private void r4() {
        final WebviewFragment webviewFragment;
        if (PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 34960, new Class[0], Void.TYPE).isSupported || (webviewFragment = (WebviewFragment) getChildFragmentManager().r0(R.id.fragment_container)) == null) {
            return;
        }
        com.max.xiaoheihe.accelworld.j.e("selectAll", webviewFragment, new com.max.xiaoheihe.module.webview.t.b() { // from class: com.max.xiaoheihe.module.game.u1
            @Override // com.max.xiaoheihe.module.webview.t.b
            public final void a(JsonObject jsonObject) {
                GetGameFragment.k4(jsonObject);
            }
        }, new com.max.xiaoheihe.module.webview.t.a() { // from class: com.max.xiaoheihe.module.game.v1
            @Override // com.max.xiaoheihe.module.webview.t.a
            public final void a() {
                GetGameFragment.l4(webviewFragment);
            }
        }, null);
    }

    private void s4(PushStateObj pushStateObj, String str) {
        if (PatchProxy.proxy(new Object[]{pushStateObj, str}, this, changeQuickRedirect, false, 34970, new Class[]{PushStateObj.class, String.class}, Void.TYPE).isSupported) {
            return;
        }
        addDisposable((io.reactivex.disposables.b) com.max.xiaoheihe.network.i.a().l2(pushStateObj.getPush_type(), str).I5(io.reactivex.schedulers.b.d()).a4(io.reactivex.android.schedulers.a.c()).J5(new j(pushStateObj, str)));
    }

    private void t4() {
        if (PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 34968, new Class[0], Void.TYPE).isSupported || !isActive() || this.mContext.isFinishing()) {
            return;
        }
        LoadingDialog loadingDialog = this.f85308i;
        if (loadingDialog == null || !loadingDialog.i()) {
            this.f85308i = new LoadingDialog(this.mContext, "", false).r();
        }
    }

    private void u4(boolean z10) {
        if (PatchProxy.proxy(new Object[]{new Byte(z10 ? (byte) 1 : (byte) 0)}, this, changeQuickRedirect, false, 34965, new Class[]{Boolean.TYPE}, Void.TYPE).isSupported) {
            return;
        }
        this.mConfirmView.setLeftIcon(this.mContext.getDrawable(z10 ? R.drawable.common_news_filled_24x24 : R.drawable.common_news_line_24_24));
        this.mConfirmView.setLeftText(this.mContext.getString(z10 ? R.string.not_limit_remind : R.string.had_limit_remind));
    }

    void i4() {
        if (PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 34966, new Class[0], Void.TYPE).isSupported) {
            return;
        }
        this.mConfirmView.getLeftButton().setClickable(false);
        addDisposable((io.reactivex.disposables.b) com.max.xiaoheihe.network.i.a().q2().I5(io.reactivex.schedulers.b.d()).a4(io.reactivex.android.schedulers.a.c()).J5(new h()));
    }

    @Override // com.max.hbcommon.base.d
    public void initData() {
        if (PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 34958, new Class[0], Void.TYPE).isSupported) {
            return;
        }
        showContentView();
        showLoading();
        if (((WebviewFragment) getChildFragmentManager().r0(R.id.fragment_container)) == null) {
            getChildFragmentManager().u().b(R.id.fragment_container, new com.max.xiaoheihe.module.webview.u(this.f85305f).m(true).a()).m();
        }
        i4();
        this.mConfirmView.setRightClickListener(new d());
        this.mConfirmView.setLeftClickListener(new e());
        this.mConfirmView.setCheckboxListener(new f());
    }

    @Override // com.max.hbcommon.base.d
    public void installViews(View view) {
        if (PatchProxy.proxy(new Object[]{view}, this, changeQuickRedirect, false, 34956, new Class[]{View.class}, Void.TYPE).isSupported) {
            return;
        }
        setContentView(R.layout.fragment_get_game);
        this.mUnBinder = ButterKnife.f(this, view);
        if (getArguments() != null) {
            this.f85304e = getArguments().getString("type");
            this.f85305f = getArguments().getString("url");
        }
        if ("addfreelicense_epic".equals(this.f85304e)) {
            this.mConfirmView.setRightText(this.mContext.getString(R.string.click_to_login_epic));
        } else {
            this.mConfirmView.setRightText(this.mContext.getString(R.string.click_to_login_steam));
        }
        h4();
        if (!"1".equals(com.max.hbcache.c.j(com.max.hbcache.c.O))) {
            this.mRemindBubble.setVisibility(0);
            this.f85302c = new a();
            this.mRemindBubble.setOnClickListener(new c());
            this.f85301b.postDelayed(this.f85302c, 5000L);
            com.max.hbcache.c.z(com.max.hbcache.c.O, "1");
        }
        u4(false);
        if (this.mIsFirst) {
            showLoading();
        }
    }

    public void o4(int i10) {
        if (PatchProxy.proxy(new Object[]{new Integer(i10)}, this, changeQuickRedirect, false, 34973, new Class[]{Integer.TYPE}, Void.TYPE).isSupported) {
            return;
        }
        this.f85307h = i10;
        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) this.mConfirmView.getLayoutParams();
        marginLayoutParams.bottomMargin = i10;
        this.mConfirmView.setLayoutParams(marginLayoutParams);
    }

    @Override // com.max.hbcommon.base.d, androidx.fragment.app.Fragment
    public void onDestroy() {
        if (PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 34963, new Class[0], Void.TYPE).isSupported) {
            return;
        }
        super.onDestroy();
        Runnable runnable = this.f85302c;
        if (runnable != null) {
            this.f85301b.removeCallbacks(runnable);
        }
    }

    @Override // com.max.hbcommon.base.d
    public void onRefresh() {
        if (PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 34962, new Class[0], Void.TYPE).isSupported) {
            return;
        }
        showLoading();
        i4();
    }

    @Override // com.max.hbcommon.base.d
    public void onRegisterReceiver() {
        if (PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 34957, new Class[0], Void.TYPE).isSupported) {
            return;
        }
        super.onRegisterReceiver();
        RefreshPlatformGamesAllCheckedBroadcastReceiver refreshPlatformGamesAllCheckedBroadcastReceiver = new RefreshPlatformGamesAllCheckedBroadcastReceiver(this, null);
        this.f85306g = refreshPlatformGamesAllCheckedBroadcastReceiver;
        registerReceiver(refreshPlatformGamesAllCheckedBroadcastReceiver, lb.a.Q);
    }

    @Override // com.max.hbcommon.base.d
    public void onUnRegisterReceiver() {
        if (PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 34964, new Class[0], Void.TYPE).isSupported) {
            return;
        }
        super.onUnRegisterReceiver();
        unregisterReceiver(this.f85306g);
    }

    public void q4() {
        if (PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 34972, new Class[0], Void.TYPE).isSupported) {
            return;
        }
        new com.max.hbcommon.view.a.f(this.mContext).x(R.string.please_enable_notification_title).k(R.string.please_enable_notification_context).t(R.string.to_open, new b()).w(true).g(false).F();
    }
}
