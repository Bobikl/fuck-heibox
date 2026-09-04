package com.max.xiaoheihe.module.mall.direct_purchace;

import android.content.DialogInterface;
import android.content.Intent;
import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import android.text.SpannableString;
import android.text.TextUtils;
import android.view.View;
import androidx.appcompat.app.AppCompatActivity;
import androidx.compose.runtime.internal.o;
import androidx.fragment.app.FragmentManager;
import com.google.gson.JsonObject;
import com.max.hbcommon.analytics.l;
import com.max.hbcommon.base.BaseActivity;
import com.max.hbcommon.bean.KeyDescObj;
import com.max.hbcommon.utils.c;
import com.max.hbpay.PaymentManager;
import com.max.hbutils.bean.Result;
import com.max.xiaoheihe.R;
import com.max.xiaoheihe.accelworld.p;
import com.max.xiaoheihe.bean.game.CoffeeDialogDataObj;
import com.max.xiaoheihe.bean.game.CoffeeDialogProgressObj;
import com.max.xiaoheihe.bean.mall.MallPrepareStateObj;
import com.max.xiaoheihe.bean.mall.MallSteamOrderObj;
import com.max.xiaoheihe.bean.mall.PayLinkObj;
import com.max.xiaoheihe.bean.mall.SteamWalletJsObj;
import com.max.xiaoheihe.bean.mall.purchase.BuyTypeValueObj;
import com.max.xiaoheihe.bean.mall.purchase.PurchasePriceObj;
import com.max.xiaoheihe.utils.l0;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.PatchProxyResult;
import dl.d;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicBoolean;
import kotlin.b2;
import kotlin.jvm.internal.f0;

/* JADX INFO: compiled from: SteamPurchaseManager.kt */
/* JADX INFO: loaded from: classes11.dex */
@o(parameters = 0)
public final class SteamPurchaseManager {
    public static ChangeQuickRedirect changeQuickRedirect = null;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public static final int f90646n = 8;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @dl.d
    private final BuyTypeValueObj f90647a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @dl.e
    private a f90648b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @dl.d
    private WeakReference<AppCompatActivity> f90649c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @dl.e
    private io.reactivex.disposables.a f90650d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    @dl.e
    private com.max.hbcommon.view.a f90651e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    @dl.e
    private String f90652f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    @dl.e
    private String f90653g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    @dl.e
    private String f90654h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    @dl.e
    private List<KeyDescObj> f90655i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private boolean f90656j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private int f90657k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private long f90658l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    @dl.d
    private final Handler f90659m;

    /* JADX INFO: compiled from: SteamPurchaseManager.kt */
    public interface a {

        /* JADX INFO: renamed from: com.max.xiaoheihe.module.mall.direct_purchace.SteamPurchaseManager$a$a, reason: collision with other inner class name */
        /* JADX INFO: compiled from: SteamPurchaseManager.kt */
        public static final class C0834a {
            public static ChangeQuickRedirect changeQuickRedirect;

            public static /* synthetic */ void a(a aVar, boolean z10, int i10, Object obj) {
                if (PatchProxy.proxy(new Object[]{aVar, new Byte(z10 ? (byte) 1 : (byte) 0), new Integer(i10), obj}, null, changeQuickRedirect, true, 42026, new Class[]{a.class, Boolean.TYPE, Integer.TYPE, Object.class}, Void.TYPE).isSupported) {
                    return;
                }
                if (obj != null) {
                    throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: tryToShowDialog");
                }
                if ((i10 & 1) != 0) {
                    z10 = true;
                }
                aVar.c(z10);
            }
        }

        @dl.d
        AtomicBoolean a();

        boolean b();

        void c(boolean z10);

        void d();

        boolean isActive();

        void onError();
    }

    /* JADX INFO: compiled from: SteamPurchaseManager.kt */
    public static final class b extends Handler {
        public static ChangeQuickRedirect changeQuickRedirect;

        b(Looper looper) {
            super(looper);
        }

        @Override // android.os.Handler
        public void handleMessage(@dl.d Message msg) {
            if (PatchProxy.proxy(new Object[]{msg}, this, changeQuickRedirect, false, 42034, new Class[]{Message.class}, Void.TYPE).isSupported) {
                return;
            }
            f0.p(msg, "msg");
            boolean z10 = msg.arg2 == 1;
            if (msg.what == 1) {
                SteamPurchaseManager.g(SteamPurchaseManager.this, msg.arg1, z10, msg.obj.toString());
            }
        }
    }

    /* JADX INFO: compiled from: SteamPurchaseManager.kt */
    public static final class c extends com.max.hbcommon.network.d<Result<SteamWalletJsObj>> {
        public static ChangeQuickRedirect changeQuickRedirect;

        c() {
        }

        @Override // com.max.hbcommon.network.d, io.reactivex.g0
        public void onError(@dl.d Throwable e10) {
            if (PatchProxy.proxy(new Object[]{e10}, this, changeQuickRedirect, false, 42035, new Class[]{Throwable.class}, Void.TYPE).isSupported) {
                return;
            }
            f0.p(e10, "e");
            if (SteamPurchaseManager.this.B()) {
                super.onError(e10);
                a aVarX = SteamPurchaseManager.this.x();
                if (aVarX != null) {
                    aVarX.d();
                }
            }
        }

        public void onNext(@dl.d Result<SteamWalletJsObj> result) {
            SteamWalletJsObj result2;
            if (PatchProxy.proxy(new Object[]{result}, this, changeQuickRedirect, false, 42036, new Class[]{Result.class}, Void.TYPE).isSupported) {
                return;
            }
            f0.p(result, "result");
            if (SteamPurchaseManager.this.B()) {
                super.onNext(result);
                a aVarX = SteamPurchaseManager.this.x();
                if (aVarX != null) {
                    aVarX.d();
                }
                AppCompatActivity appCompatActivityA = SteamPurchaseManager.a(SteamPurchaseManager.this);
                if (appCompatActivityA == null || (result2 = result.getResult()) == null) {
                    return;
                }
                p.c(appCompatActivityA, result2, 4);
            }
        }

        @Override // com.max.hbcommon.network.d, io.reactivex.g0
        public /* bridge */ /* synthetic */ void onNext(Object obj) {
            if (PatchProxy.proxy(new Object[]{obj}, this, changeQuickRedirect, false, 42037, new Class[]{Object.class}, Void.TYPE).isSupported) {
                return;
            }
            onNext((Result<SteamWalletJsObj>) obj);
        }
    }

    /* JADX INFO: compiled from: SteamPurchaseManager.kt */
    public static final class d extends com.max.hbcommon.network.d<Result<MallSteamOrderObj>> {
        public static ChangeQuickRedirect changeQuickRedirect;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ int f90668c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        final /* synthetic */ String f90669d;

        d(int i10, String str) {
            this.f90668c = i10;
            this.f90669d = str;
        }

        @Override // com.max.hbcommon.network.d, io.reactivex.g0
        public void onError(@dl.d Throwable e10) {
            AtomicBoolean atomicBooleanA;
            if (PatchProxy.proxy(new Object[]{e10}, this, changeQuickRedirect, false, 42038, new Class[]{Throwable.class}, Void.TYPE).isSupported) {
                return;
            }
            f0.p(e10, "e");
            if (SteamPurchaseManager.this.B()) {
                super.onError(e10);
                a aVarX = SteamPurchaseManager.this.x();
                if (aVarX != null) {
                    aVarX.d();
                }
                a aVarX2 = SteamPurchaseManager.this.x();
                if (aVarX2 == null || (atomicBooleanA = aVarX2.a()) == null) {
                    return;
                }
                atomicBooleanA.set(false);
            }
        }

        public void onNext(@dl.d Result<MallSteamOrderObj> mallSteamOrderObjResult) {
            AtomicBoolean atomicBooleanA;
            if (PatchProxy.proxy(new Object[]{mallSteamOrderObjResult}, this, changeQuickRedirect, false, 42039, new Class[]{Result.class}, Void.TYPE).isSupported) {
                return;
            }
            f0.p(mallSteamOrderObjResult, "mallSteamOrderObjResult");
            if (SteamPurchaseManager.this.B()) {
                super.onNext(mallSteamOrderObjResult);
                a aVarX = SteamPurchaseManager.this.x();
                if (aVarX != null && (atomicBooleanA = aVarX.a()) != null) {
                    atomicBooleanA.set(false);
                }
                if (mallSteamOrderObjResult.getResult() != null) {
                    MallSteamOrderObj result = mallSteamOrderObjResult.getResult();
                    f0.m(result);
                    if (result.getState() != null) {
                        MallSteamOrderObj result2 = mallSteamOrderObjResult.getResult();
                        f0.m(result2);
                        String state = result2.getState();
                        MallSteamOrderObj result3 = mallSteamOrderObjResult.getResult();
                        f0.m(result3);
                        List<KeyDescObj> notice = result3.getNotice();
                        if (notice != null) {
                            SteamPurchaseManager.this.f90655i = notice;
                            SteamPurchaseManager steamPurchaseManager = SteamPurchaseManager.this;
                            List list = steamPurchaseManager.f90655i;
                            f0.m(list);
                            SteamPurchaseManager.t(steamPurchaseManager, list, f0.g("1", state));
                        }
                        if (f0.g("0", state)) {
                            SteamPurchaseManager.this.f90659m.removeMessages(1);
                            SteamPurchaseManager.this.f90659m.sendMessageDelayed(SteamPurchaseManager.this.f90659m.obtainMessage(1, this.f90668c + 1, 1, this.f90669d), SteamPurchaseManager.this.f90658l);
                            return;
                        }
                        if (f0.g("3", state)) {
                            a aVarX2 = SteamPurchaseManager.this.x();
                            if (aVarX2 != null) {
                                aVarX2.d();
                            }
                            if (SteamPurchaseManager.this.f90655i != null) {
                                com.max.xiaoheihe.view.l.m();
                                SteamPurchaseManager.this.f90655i = null;
                            }
                            SteamPurchaseManager.q(SteamPurchaseManager.this);
                            return;
                        }
                        a aVarX3 = SteamPurchaseManager.this.x();
                        if (aVarX3 != null) {
                            aVarX3.d();
                        }
                        if (SteamPurchaseManager.this.f90655i != null) {
                            com.max.xiaoheihe.view.l.m();
                            SteamPurchaseManager.this.f90655i = null;
                        }
                        MallSteamOrderObj result4 = mallSteamOrderObjResult.getResult();
                        f0.m(result4);
                        if (TextUtils.isEmpty(result4.getMsg())) {
                            com.max.hbutils.utils.c.d("支付失败");
                        } else {
                            MallSteamOrderObj result5 = mallSteamOrderObjResult.getResult();
                            f0.m(result5);
                            com.max.hbutils.utils.c.d(result5.getMsg());
                        }
                        SteamPurchaseManager.this.K(null);
                        return;
                    }
                }
                SteamPurchaseManager.this.f90659m.removeMessages(1);
                SteamPurchaseManager.this.f90659m.sendMessageDelayed(SteamPurchaseManager.this.f90659m.obtainMessage(1, this.f90668c + 1, 1, this.f90669d), SteamPurchaseManager.this.f90658l);
            }
        }

        @Override // com.max.hbcommon.network.d, io.reactivex.g0
        public /* bridge */ /* synthetic */ void onNext(Object obj) {
            if (PatchProxy.proxy(new Object[]{obj}, this, changeQuickRedirect, false, 42040, new Class[]{Object.class}, Void.TYPE).isSupported) {
                return;
            }
            onNext((Result<MallSteamOrderObj>) obj);
        }
    }

    /* JADX INFO: compiled from: SteamPurchaseManager.kt */
    public static final class e implements l0.g {
        public static ChangeQuickRedirect changeQuickRedirect;

        e() {
        }

        @Override // com.max.xiaoheihe.utils.l0.g
        public final void a() {
            if (PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 42041, new Class[0], Void.TYPE).isSupported) {
                return;
            }
            SteamPurchaseManager steamPurchaseManager = SteamPurchaseManager.this;
            PurchasePriceObj price = steamPurchaseManager.z().getPrice();
            steamPurchaseManager.f90653g = String.valueOf((int) (com.max.hbutils.utils.n.p(price != null ? price.getCurrent_price() : null) * 1000));
            SteamPurchaseManager steamPurchaseManager2 = SteamPurchaseManager.this;
            steamPurchaseManager2.f90654h = steamPurchaseManager2.z().getItem_id();
            com.max.hbcommon.analytics.l.f66572a.r(SteamDirectPurchaseTool.f90630b);
            SteamPurchaseManager.this.u(0);
        }
    }

    /* JADX INFO: compiled from: SteamPurchaseManager.kt */
    public static final class f extends com.max.hbcommon.network.d<Result<PayLinkObj>> {
        public static ChangeQuickRedirect changeQuickRedirect;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ String f90672c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        final /* synthetic */ int f90673d;

        /* JADX INFO: compiled from: SteamPurchaseManager.kt */
        public static final class a implements Runnable {
            public static ChangeQuickRedirect changeQuickRedirect;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            final /* synthetic */ SteamPurchaseManager f90674b;

            /* JADX INFO: renamed from: c, reason: collision with root package name */
            final /* synthetic */ String f90675c;

            /* JADX INFO: renamed from: d, reason: collision with root package name */
            final /* synthetic */ int f90676d;

            a(SteamPurchaseManager steamPurchaseManager, String str, int i10) {
                this.f90674b = steamPurchaseManager;
                this.f90675c = str;
                this.f90676d = i10;
            }

            @Override // java.lang.Runnable
            public final void run() {
                if (PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 42045, new Class[0], Void.TYPE).isSupported) {
                    return;
                }
                SteamPurchaseManager.h(this.f90674b, this.f90675c, this.f90676d + 1);
            }
        }

        /* JADX INFO: compiled from: SteamPurchaseManager.kt */
        public static final class b implements Runnable {
            public static ChangeQuickRedirect changeQuickRedirect;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            final /* synthetic */ SteamPurchaseManager f90677b;

            /* JADX INFO: renamed from: c, reason: collision with root package name */
            final /* synthetic */ String f90678c;

            /* JADX INFO: renamed from: d, reason: collision with root package name */
            final /* synthetic */ int f90679d;

            b(SteamPurchaseManager steamPurchaseManager, String str, int i10) {
                this.f90677b = steamPurchaseManager;
                this.f90678c = str;
                this.f90679d = i10;
            }

            @Override // java.lang.Runnable
            public final void run() {
                if (PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 42046, new Class[0], Void.TYPE).isSupported) {
                    return;
                }
                SteamPurchaseManager.h(this.f90677b, this.f90678c, this.f90679d + 1);
            }
        }

        /* JADX INFO: compiled from: SteamPurchaseManager.kt */
        public static final class c implements Runnable {
            public static ChangeQuickRedirect changeQuickRedirect;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            final /* synthetic */ SteamPurchaseManager f90680b;

            /* JADX INFO: renamed from: c, reason: collision with root package name */
            final /* synthetic */ Result<PayLinkObj> f90681c;

            /* JADX INFO: renamed from: d, reason: collision with root package name */
            final /* synthetic */ AppCompatActivity f90682d;

            /* JADX INFO: renamed from: e, reason: collision with root package name */
            final /* synthetic */ String f90683e;

            c(SteamPurchaseManager steamPurchaseManager, Result<PayLinkObj> result, AppCompatActivity appCompatActivity, String str) {
                this.f90680b = steamPurchaseManager;
                this.f90681c = result;
                this.f90682d = appCompatActivity;
                this.f90683e = str;
            }

            @Override // java.lang.Runnable
            public final void run() {
                if (PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 42047, new Class[0], Void.TYPE).isSupported) {
                    return;
                }
                com.max.hbcommon.analytics.l.f66572a.u(SteamDirectPurchaseTool.f90633e);
                com.max.xiaoheihe.view.l.m();
                this.f90680b.f90655i = null;
                PayLinkObj result = this.f90681c.getResult();
                f0.m(result);
                String pay_link = result.getPay_link();
                if (TextUtils.isEmpty(pay_link)) {
                    com.max.xiaoheihe.base.router.b.k0(this.f90682d, this.f90683e);
                } else {
                    try {
                        Intent uri = Intent.parseUri(pay_link, 1);
                        AppCompatActivity appCompatActivity = this.f90682d;
                        if (appCompatActivity != null) {
                            appCompatActivity.startActivity(uri);
                        }
                    } catch (Exception unused) {
                        com.max.xiaoheihe.base.router.b.k0(this.f90682d, this.f90683e);
                    }
                }
                SteamPurchaseManager.f(this.f90680b, 0, false);
            }
        }

        /* JADX INFO: compiled from: SteamPurchaseManager.kt */
        public static final class d implements Runnable {
            public static ChangeQuickRedirect changeQuickRedirect;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            final /* synthetic */ SteamPurchaseManager f90684b;

            /* JADX INFO: renamed from: c, reason: collision with root package name */
            final /* synthetic */ Result<PayLinkObj> f90685c;

            d(SteamPurchaseManager steamPurchaseManager, Result<PayLinkObj> result) {
                this.f90684b = steamPurchaseManager;
                this.f90685c = result;
            }

            @Override // java.lang.Runnable
            public final void run() {
                if (PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 42048, new Class[0], Void.TYPE).isSupported) {
                    return;
                }
                a aVarX = this.f90684b.x();
                if (aVarX != null) {
                    aVarX.onError();
                }
                com.max.xiaoheihe.view.l.m();
                this.f90684b.f90655i = null;
                PayLinkObj result = this.f90685c.getResult();
                f0.m(result);
                if (TextUtils.isEmpty(result.getMsg())) {
                    return;
                }
                PayLinkObj result2 = this.f90685c.getResult();
                f0.m(result2);
                com.max.hbutils.utils.c.d(result2.getMsg());
            }
        }

        /* JADX INFO: compiled from: SteamPurchaseManager.kt */
        public static final class e implements Runnable {
            public static ChangeQuickRedirect changeQuickRedirect;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            final /* synthetic */ SteamPurchaseManager f90686b;

            /* JADX INFO: renamed from: c, reason: collision with root package name */
            final /* synthetic */ String f90687c;

            /* JADX INFO: renamed from: d, reason: collision with root package name */
            final /* synthetic */ int f90688d;

            e(SteamPurchaseManager steamPurchaseManager, String str, int i10) {
                this.f90686b = steamPurchaseManager;
                this.f90687c = str;
                this.f90688d = i10;
            }

            @Override // java.lang.Runnable
            public final void run() {
                if (PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 42049, new Class[0], Void.TYPE).isSupported) {
                    return;
                }
                SteamPurchaseManager.h(this.f90686b, this.f90687c, this.f90688d + 1);
            }
        }

        f(String str, int i10) {
            this.f90672c = str;
            this.f90673d = i10;
        }

        @Override // com.max.hbcommon.network.d, io.reactivex.g0
        public void onError(@dl.d Throwable e10) {
            if (PatchProxy.proxy(new Object[]{e10}, this, changeQuickRedirect, false, 42042, new Class[]{Throwable.class}, Void.TYPE).isSupported) {
                return;
            }
            f0.p(e10, "e");
            if (SteamPurchaseManager.this.B()) {
                super.onError(e10);
                SteamPurchaseManager.p(SteamPurchaseManager.this);
            }
        }

        public void onNext(@dl.d Result<PayLinkObj> result) {
            if (PatchProxy.proxy(new Object[]{result}, this, changeQuickRedirect, false, 42043, new Class[]{Result.class}, Void.TYPE).isSupported) {
                return;
            }
            f0.p(result, "result");
            if (SteamPurchaseManager.this.B()) {
                super.onNext(result);
                AppCompatActivity appCompatActivityA = SteamPurchaseManager.a(SteamPurchaseManager.this);
                if (appCompatActivityA != null) {
                    SteamPurchaseManager steamPurchaseManager = SteamPurchaseManager.this;
                    String str = this.f90672c;
                    int i10 = this.f90673d;
                    if (result.getResult() != null) {
                        PayLinkObj result2 = result.getResult();
                        f0.m(result2);
                        if (result2.getState() != null) {
                            PayLinkObj result3 = result.getResult();
                            f0.m(result3);
                            String state = result3.getState();
                            PayLinkObj result4 = result.getResult();
                            f0.m(result4);
                            List<KeyDescObj> notice = result4.getNotice();
                            if (notice != null) {
                                steamPurchaseManager.f90655i = notice;
                                List list = steamPurchaseManager.f90655i;
                                f0.m(list);
                                SteamPurchaseManager.t(steamPurchaseManager, list, f0.g("1", state));
                            }
                            if (f0.g("0", state)) {
                                steamPurchaseManager.f90659m.postDelayed(new a(steamPurchaseManager, str, i10), steamPurchaseManager.f90658l);
                                return;
                            }
                            if (!f0.g("1", state)) {
                                steamPurchaseManager.f90659m.postDelayed(new d(steamPurchaseManager, result), 1000L);
                                return;
                            }
                            PayLinkObj result5 = result.getResult();
                            f0.m(result5);
                            String pay_url = result5.getPay_url();
                            if (TextUtils.isEmpty(pay_url)) {
                                steamPurchaseManager.f90659m.postDelayed(new b(steamPurchaseManager, str, i10), steamPurchaseManager.f90658l);
                                return;
                            } else {
                                steamPurchaseManager.f90659m.postDelayed(new c(steamPurchaseManager, result, appCompatActivityA, pay_url), 500L);
                                return;
                            }
                        }
                    }
                    steamPurchaseManager.f90659m.postDelayed(new e(steamPurchaseManager, str, i10), steamPurchaseManager.f90658l);
                }
            }
        }

        @Override // com.max.hbcommon.network.d, io.reactivex.g0
        public /* bridge */ /* synthetic */ void onNext(Object obj) {
            if (PatchProxy.proxy(new Object[]{obj}, this, changeQuickRedirect, false, 42044, new Class[]{Object.class}, Void.TYPE).isSupported) {
                return;
            }
            onNext((Result<PayLinkObj>) obj);
        }
    }

    /* JADX INFO: compiled from: SteamPurchaseManager.kt */
    public static final class g implements DialogInterface.OnClickListener {
        public static ChangeQuickRedirect changeQuickRedirect;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ boolean f90689b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ SteamPurchaseManager f90690c;

        g(boolean z10, SteamPurchaseManager steamPurchaseManager) {
            this.f90689b = z10;
            this.f90690c = steamPurchaseManager;
        }

        @Override // android.content.DialogInterface.OnClickListener
        public final void onClick(DialogInterface dialogInterface, int i10) {
            if (PatchProxy.proxy(new Object[]{dialogInterface, new Integer(i10)}, this, changeQuickRedirect, false, 42050, new Class[]{DialogInterface.class, Integer.TYPE}, Void.TYPE).isSupported) {
                return;
            }
            if (!this.f90689b) {
                com.max.hbcommon.analytics.l.f66572a.r(SteamDirectPurchaseTool.f90635g);
            }
            com.max.xiaoheihe.module.account.utils.l.D(null, SteamPurchaseManager.a(this.f90690c), false, true, 0);
            dialogInterface.dismiss();
        }
    }

    /* JADX INFO: compiled from: SteamPurchaseManager.kt */
    public static final class h implements DialogInterface.OnClickListener {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public static final h f90691b = new h();
        public static ChangeQuickRedirect changeQuickRedirect;

        h() {
        }

        @Override // android.content.DialogInterface.OnClickListener
        public final void onClick(DialogInterface dialogInterface, int i10) {
            if (PatchProxy.proxy(new Object[]{dialogInterface, new Integer(i10)}, this, changeQuickRedirect, false, 42051, new Class[]{DialogInterface.class, Integer.TYPE}, Void.TYPE).isSupported) {
                return;
            }
            dialogInterface.dismiss();
        }
    }

    /* JADX INFO: compiled from: SteamPurchaseManager.kt */
    public static final class i implements Runnable {
        public static ChangeQuickRedirect changeQuickRedirect;

        i() {
        }

        @Override // java.lang.Runnable
        public final void run() {
            if (PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 42052, new Class[0], Void.TYPE).isSupported) {
                return;
            }
            a aVarX = SteamPurchaseManager.this.x();
            if (aVarX != null) {
                aVarX.onError();
            }
            com.max.xiaoheihe.view.l.m();
        }
    }

    /* JADX INFO: compiled from: SteamPurchaseManager.kt */
    public static final class j implements View.OnClickListener {
        public static ChangeQuickRedirect changeQuickRedirect;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ AppCompatActivity f90693b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ SteamPurchaseManager f90694c;

        j(AppCompatActivity appCompatActivity, SteamPurchaseManager steamPurchaseManager) {
            this.f90693b = appCompatActivity;
            this.f90694c = steamPurchaseManager;
        }

        @Override // android.view.View.OnClickListener
        public final void onClick(@dl.e View view) {
            if (PatchProxy.proxy(new Object[]{view}, this, changeQuickRedirect, false, 42053, new Class[]{View.class}, Void.TYPE).isSupported) {
                return;
            }
            AppCompatActivity appCompatActivity = this.f90693b;
            String strA = this.f90694c.A();
            f0.m(strA);
            com.max.xiaoheihe.base.router.b.a0(appCompatActivity, strA).A();
            this.f90694c.K(null);
        }
    }

    /* JADX INFO: compiled from: SteamPurchaseManager.kt */
    public static final class k implements View.OnClickListener {
        public static ChangeQuickRedirect changeQuickRedirect;

        k() {
        }

        @Override // android.view.View.OnClickListener
        public final void onClick(@dl.e View view) {
            if (PatchProxy.proxy(new Object[]{view}, this, changeQuickRedirect, false, 42054, new Class[]{View.class}, Void.TYPE).isSupported) {
                return;
            }
            SteamPurchaseManager.this.K(null);
        }
    }

    /* JADX INFO: compiled from: SteamPurchaseManager.kt */
    public static final class l implements DialogInterface.OnClickListener {
        public static ChangeQuickRedirect changeQuickRedirect;

        l() {
        }

        @Override // android.content.DialogInterface.OnClickListener
        public final void onClick(@dl.d DialogInterface dialog, int i10) {
            if (PatchProxy.proxy(new Object[]{dialog, new Integer(i10)}, this, changeQuickRedirect, false, 42055, new Class[]{DialogInterface.class, Integer.TYPE}, Void.TYPE).isSupported) {
                return;
            }
            f0.p(dialog, "dialog");
            dialog.dismiss();
            SteamPurchaseManager.this.G();
        }
    }

    /* JADX INFO: compiled from: SteamPurchaseManager.kt */
    public static final class m implements DialogInterface.OnClickListener {
        public static ChangeQuickRedirect changeQuickRedirect;

        m() {
        }

        @Override // android.content.DialogInterface.OnClickListener
        public final void onClick(@dl.d DialogInterface dialog, int i10) {
            if (PatchProxy.proxy(new Object[]{dialog, new Integer(i10)}, this, changeQuickRedirect, false, 42056, new Class[]{DialogInterface.class, Integer.TYPE}, Void.TYPE).isSupported) {
                return;
            }
            f0.p(dialog, "dialog");
            dialog.dismiss();
            SteamPurchaseManager.this.K(null);
        }
    }

    /* JADX INFO: compiled from: SteamPurchaseManager.kt */
    public static final class n extends com.max.hbcommon.network.d<Result<MallSteamOrderObj>> {
        public static ChangeQuickRedirect changeQuickRedirect;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ SteamDirectPurchaseTool.PayType f90699c;

        n(SteamDirectPurchaseTool.PayType payType) {
            this.f90699c = payType;
        }

        @Override // com.max.hbcommon.network.d, io.reactivex.g0
        public void onError(@dl.d Throwable e10) {
            if (PatchProxy.proxy(new Object[]{e10}, this, changeQuickRedirect, false, 42057, new Class[]{Throwable.class}, Void.TYPE).isSupported) {
                return;
            }
            f0.p(e10, "e");
            if (SteamPurchaseManager.this.B()) {
                super.onError(e10);
                a aVarX = SteamPurchaseManager.this.x();
                if (aVarX != null) {
                    aVarX.d();
                }
                com.max.hbutils.utils.c.f(com.max.xiaoheihe.utils.d.n0(R.string.fail));
                a aVarX2 = SteamPurchaseManager.this.x();
                if (aVarX2 != null) {
                    aVarX2.onError();
                }
            }
        }

        public void onNext(@dl.d Result<MallSteamOrderObj> result) {
            if (PatchProxy.proxy(new Object[]{result}, this, changeQuickRedirect, false, 42058, new Class[]{Result.class}, Void.TYPE).isSupported) {
                return;
            }
            f0.p(result, "result");
            if (SteamPurchaseManager.this.B()) {
                super.onNext(result);
                a aVarX = SteamPurchaseManager.this.x();
                if (aVarX != null) {
                    aVarX.d();
                }
                MallSteamOrderObj result2 = result.getResult();
                if (result2 == null || TextUtils.isEmpty(result2.getOrder_id())) {
                    com.max.hbutils.utils.c.f(com.max.xiaoheihe.utils.d.n0(R.string.fail));
                    a aVarX2 = SteamPurchaseManager.this.x();
                    if (aVarX2 != null) {
                        aVarX2.onError();
                        return;
                    }
                    return;
                }
                SteamPurchaseManager.this.K(result2.getOrder_id());
                ArrayList arrayList = new ArrayList();
                a aVarX3 = SteamPurchaseManager.this.x();
                if (aVarX3 != null) {
                    aVarX3.d();
                }
                com.max.xiaoheihe.view.l.A(new CoffeeDialogDataObj(com.max.xiaoheihe.utils.d.n0(R.string.dialog_cafe_stp_title), arrayList, "0", null, null, false, null, null));
                Integer retry_attempts = result2.getRetry_attempts();
                if (retry_attempts != null) {
                    SteamPurchaseManager steamPurchaseManager = SteamPurchaseManager.this;
                    int iIntValue = retry_attempts.intValue();
                    if (iIntValue > 0) {
                        steamPurchaseManager.f90657k = iIntValue;
                    }
                }
                Integer retry_delay = result2.getRetry_delay();
                if (retry_delay != null) {
                    SteamPurchaseManager steamPurchaseManager2 = SteamPurchaseManager.this;
                    int iIntValue2 = retry_delay.intValue();
                    if (iIntValue2 > 0) {
                        steamPurchaseManager2.f90658l = ((long) iIntValue2) * ((long) 1000);
                    }
                }
                if (this.f90699c != SteamDirectPurchaseTool.PayType.AliPay) {
                    SteamPurchaseManager.this.f90655i = new ArrayList();
                    SteamPurchaseManager.f(SteamPurchaseManager.this, 0, false);
                } else if (SteamPurchaseManager.this.C()) {
                    SteamPurchaseManager.h(SteamPurchaseManager.this, result2.getOrder_id(), 0);
                }
            }
        }

        @Override // com.max.hbcommon.network.d, io.reactivex.g0
        public /* bridge */ /* synthetic */ void onNext(Object obj) {
            if (PatchProxy.proxy(new Object[]{obj}, this, changeQuickRedirect, false, 42059, new Class[]{Object.class}, Void.TYPE).isSupported) {
                return;
            }
            onNext((Result<MallSteamOrderObj>) obj);
        }
    }

    public SteamPurchaseManager(@dl.d AppCompatActivity context, @dl.d BuyTypeValueObj steamBuyTypeValue, @dl.e a aVar) {
        f0.p(context, "context");
        f0.p(steamBuyTypeValue, "steamBuyTypeValue");
        this.f90647a = steamBuyTypeValue;
        this.f90648b = aVar;
        this.f90649c = new WeakReference<>(context);
        this.f90657k = 15;
        this.f90658l = 2000L;
        this.f90659m = new b(Looper.getMainLooper());
    }

    private final void D(int i10, boolean z10) {
        if (PatchProxy.proxy(new Object[]{new Integer(i10), new Byte(z10 ? (byte) 1 : (byte) 0)}, this, changeQuickRedirect, false, 42002, new Class[]{Integer.TYPE, Boolean.TYPE}, Void.TYPE).isSupported) {
            return;
        }
        E(i10, z10, "0");
    }

    private final void E(int i10, boolean z10, String str) {
        a aVar;
        AtomicBoolean atomicBooleanA;
        AtomicBoolean atomicBooleanA2;
        boolean z11 = false;
        if (!PatchProxy.proxy(new Object[]{new Integer(i10), new Byte(z10 ? (byte) 1 : (byte) 0), str}, this, changeQuickRedirect, false, 42003, new Class[]{Integer.TYPE, Boolean.TYPE, String.class}, Void.TYPE).isSupported && B()) {
            a aVar2 = this.f90648b;
            if (aVar2 != null && (atomicBooleanA2 = aVar2.a()) != null && atomicBooleanA2.get()) {
                z11 = true;
            }
            if (z11) {
                return;
            }
            if (i10 >= this.f90657k || this.f90652f == null) {
                a aVar3 = this.f90648b;
                if (aVar3 != null) {
                    aVar3.d();
                }
                List<KeyDescObj> list = this.f90655i;
                if (list != null) {
                    N(list);
                } else {
                    com.max.xiaoheihe.view.l.m();
                }
                P();
                return;
            }
            a aVar4 = this.f90648b;
            if (aVar4 != null && (atomicBooleanA = aVar4.a()) != null) {
                atomicBooleanA.set(true);
            }
            if (this.f90655i == null && (aVar = this.f90648b) != null) {
                aVar.c(true);
            }
            if (this.f90650d == null) {
                this.f90650d = new io.reactivex.disposables.a();
            }
            io.reactivex.disposables.a aVar5 = this.f90650d;
            f0.m(aVar5);
            aVar5.c((io.reactivex.disposables.b) com.max.xiaoheihe.network.i.a().A1(this.f90652f, str).I5(io.reactivex.schedulers.b.d()).a4(io.reactivex.android.schedulers.a.c()).J5(new d(i10, str)));
        }
    }

    private final void H(String str, int i10) {
        if (PatchProxy.proxy(new Object[]{str, new Integer(i10)}, this, changeQuickRedirect, false, 42006, new Class[]{String.class, Integer.TYPE}, Void.TYPE).isSupported) {
            return;
        }
        if (i10 < this.f90657k) {
            com.max.xiaoheihe.network.i.a().Y1(str).I5(io.reactivex.schedulers.b.d()).a4(io.reactivex.android.schedulers.a.c()).J5(new f(str, i10));
        } else {
            N(this.f90655i);
        }
    }

    private final void L(boolean z10) {
        if (!PatchProxy.proxy(new Object[]{new Byte(z10 ? (byte) 1 : (byte) 0)}, this, changeQuickRedirect, false, 42011, new Class[]{Boolean.TYPE}, Void.TYPE).isSupported && B()) {
            new com.max.hbcommon.view.a.f(v()).y(com.max.xiaoheihe.utils.d.n0(R.string.bind_steam_tips_title)).l(com.max.xiaoheihe.utils.d.n0(R.string.bind_steam_tips_message)).u(com.max.xiaoheihe.utils.d.n0(R.string.confirm), new g(z10, this)).o(com.max.xiaoheihe.utils.d.n0(R.string.cancel), h.f90691b).F();
        }
    }

    private final void M() {
        if (PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 42007, new Class[0], Void.TYPE).isSupported) {
            return;
        }
        N(null);
    }

    private final void N(List<? extends KeyDescObj> list) {
        int i10 = 0;
        if (PatchProxy.proxy(new Object[]{list}, this, changeQuickRedirect, false, 42009, new Class[]{List.class}, Void.TYPE).isSupported) {
            return;
        }
        a aVar = this.f90648b;
        if (aVar != null) {
            aVar.d();
        }
        ArrayList arrayList = new ArrayList();
        if (list != null) {
            int i11 = 0;
            for (KeyDescObj keyDescObj : list) {
                arrayList.add(new CoffeeDialogProgressObj(keyDescObj.getKey(), String.valueOf(com.max.hbutils.utils.n.q(keyDescObj.getValue()) + 1), null));
                if (f0.g("0", keyDescObj.getValue())) {
                    i10 = i11;
                }
                i11++;
            }
            if (i10 < arrayList.size()) {
                ((CoffeeDialogProgressObj) arrayList.get(i10)).setState("3");
            }
        }
        com.max.xiaoheihe.view.l.w(new CoffeeDialogDataObj(com.max.xiaoheihe.utils.d.n0(R.string.dialog_cafe_stp_title), arrayList, "0", null, null, false, null, null));
        this.f90655i = null;
        this.f90659m.postDelayed(new i(), 1000L);
    }

    private final void O() {
        AppCompatActivity appCompatActivityV;
        if (PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 42004, new Class[0], Void.TYPE).isSupported || !C() || (appCompatActivityV = v()) == null) {
            return;
        }
        try {
            new com.max.hbcommon.component.bottomsheet.a().z("游戏购买成功").h(R.drawable.bottom_sheets_key_correct_green_28x28).n(R.drawable.bottom_sheets_broken_steam_80x80).k(true).x(false).l(new SpannableString("请前往Steam游戏库查看，后续订单问题请联系Steam客服")).v("查看订单", true, new j(appCompatActivityV, this)).p("确认", true, new k()).a().M3(appCompatActivityV.getSupportFragmentManager(), "purchase_success_bottom_sheets");
        } catch (IllegalStateException e10) {
            com.max.heybox.hblog.g.f74531b.u(e10);
        }
    }

    private final void P() {
        if (PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 42013, new Class[0], Void.TYPE).isSupported) {
            return;
        }
        a aVar = this.f90648b;
        if (aVar != null) {
            aVar.d();
        }
        S();
        com.max.hbcommon.view.a aVar2 = this.f90651e;
        if (aVar2 != null) {
            f0.m(aVar2);
            if (aVar2.isShowing()) {
                return;
            }
        }
        if (C()) {
            this.f90651e = new com.max.hbcommon.view.a.f(v()).l("您是否已经完成了支付").u("已支付", new l()).o("未支付", new m()).F();
        }
    }

    private final void Q(SteamDirectPurchaseTool.PayType payType) {
        if (PatchProxy.proxy(new Object[]{payType}, this, changeQuickRedirect, false, 42000, new Class[]{SteamDirectPurchaseTool.PayType.class}, Void.TYPE).isSupported) {
            return;
        }
        R(payType, "0");
    }

    private final void R(SteamDirectPurchaseTool.PayType payType, String str) {
        if (PatchProxy.proxy(new Object[]{payType, str}, this, changeQuickRedirect, false, 42001, new Class[]{SteamDirectPurchaseTool.PayType.class, String.class}, Void.TYPE).isSupported) {
            return;
        }
        String item_id = this.f90647a.getItem_id();
        String str2 = payType == SteamDirectPurchaseTool.PayType.SteamBalance ? "steamaccount" : PaymentManager.f71422u;
        JsonObject jsonObject = new JsonObject();
        jsonObject.addProperty("pay_method", str2);
        com.max.hbcommon.analytics.l.f66572a.s(SteamDirectPurchaseTool.f90632d, jsonObject);
        a aVar = this.f90648b;
        if (aVar != null) {
            a.C0834a.a(aVar, false, 1, null);
        }
        com.max.xiaoheihe.network.i.a().D2(item_id, str2, str).I5(io.reactivex.schedulers.b.d()).a4(io.reactivex.android.schedulers.a.c()).J5(new n(payType));
    }

    private final void S() {
        AtomicBoolean atomicBooleanA;
        if (PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 42014, new Class[0], Void.TYPE).isSupported) {
            return;
        }
        a aVar = this.f90648b;
        if (aVar != null) {
            aVar.d();
        }
        a aVar2 = this.f90648b;
        if (aVar2 == null || (atomicBooleanA = aVar2.a()) == null) {
            return;
        }
        atomicBooleanA.set(false);
    }

    private final void U(List<KeyDescObj> list, boolean z10) {
        if (PatchProxy.proxy(new Object[]{list, new Byte(z10 ? (byte) 1 : (byte) 0)}, this, changeQuickRedirect, false, 42008, new Class[]{List.class, Boolean.TYPE}, Void.TYPE).isSupported) {
            return;
        }
        a aVar = this.f90648b;
        if (aVar != null) {
            aVar.d();
        }
        ArrayList arrayList = new ArrayList();
        for (KeyDescObj keyDescObj : list) {
            arrayList.add(new CoffeeDialogProgressObj(keyDescObj.getKey(), String.valueOf(com.max.hbutils.utils.n.q(keyDescObj.getValue()) + 1), null));
        }
        com.max.xiaoheihe.view.l.w(new CoffeeDialogDataObj(com.max.xiaoheihe.utils.d.n0(R.string.dialog_cafe_stp_title), arrayList, z10 ? "0" : "1", null, null, false, null, null));
    }

    public static final /* synthetic */ AppCompatActivity a(SteamPurchaseManager steamPurchaseManager) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{steamPurchaseManager}, null, changeQuickRedirect, true, 42015, new Class[]{SteamPurchaseManager.class}, AppCompatActivity.class);
        return patchProxyResultProxy.isSupported ? (AppCompatActivity) patchProxyResultProxy.result : steamPurchaseManager.v();
    }

    public static final /* synthetic */ void c(SteamPurchaseManager steamPurchaseManager) {
        if (PatchProxy.proxy(new Object[]{steamPurchaseManager}, null, changeQuickRedirect, true, 42018, new Class[]{SteamPurchaseManager.class}, Void.TYPE).isSupported) {
            return;
        }
        steamPurchaseManager.y();
    }

    public static final /* synthetic */ void f(SteamPurchaseManager steamPurchaseManager, int i10, boolean z10) {
        if (PatchProxy.proxy(new Object[]{steamPurchaseManager, new Integer(i10), new Byte(z10 ? (byte) 1 : (byte) 0)}, null, changeQuickRedirect, true, 42021, new Class[]{SteamPurchaseManager.class, Integer.TYPE, Boolean.TYPE}, Void.TYPE).isSupported) {
            return;
        }
        steamPurchaseManager.D(i10, z10);
    }

    public static final /* synthetic */ void g(SteamPurchaseManager steamPurchaseManager, int i10, boolean z10, String str) {
        if (PatchProxy.proxy(new Object[]{steamPurchaseManager, new Integer(i10), new Byte(z10 ? (byte) 1 : (byte) 0), str}, null, changeQuickRedirect, true, 42025, new Class[]{SteamPurchaseManager.class, Integer.TYPE, Boolean.TYPE, String.class}, Void.TYPE).isSupported) {
            return;
        }
        steamPurchaseManager.E(i10, z10, str);
    }

    public static final /* synthetic */ void h(SteamPurchaseManager steamPurchaseManager, String str, int i10) {
        if (PatchProxy.proxy(new Object[]{steamPurchaseManager, str, new Integer(i10)}, null, changeQuickRedirect, true, 42020, new Class[]{SteamPurchaseManager.class, String.class, Integer.TYPE}, Void.TYPE).isSupported) {
            return;
        }
        steamPurchaseManager.H(str, i10);
    }

    public static final /* synthetic */ void o(SteamPurchaseManager steamPurchaseManager, boolean z10) {
        if (PatchProxy.proxy(new Object[]{steamPurchaseManager, new Byte(z10 ? (byte) 1 : (byte) 0)}, null, changeQuickRedirect, true, 42017, new Class[]{SteamPurchaseManager.class, Boolean.TYPE}, Void.TYPE).isSupported) {
            return;
        }
        steamPurchaseManager.L(z10);
    }

    public static final /* synthetic */ void p(SteamPurchaseManager steamPurchaseManager) {
        if (PatchProxy.proxy(new Object[]{steamPurchaseManager}, null, changeQuickRedirect, true, 42024, new Class[]{SteamPurchaseManager.class}, Void.TYPE).isSupported) {
            return;
        }
        steamPurchaseManager.M();
    }

    public static final /* synthetic */ void q(SteamPurchaseManager steamPurchaseManager) {
        if (PatchProxy.proxy(new Object[]{steamPurchaseManager}, null, changeQuickRedirect, true, 42023, new Class[]{SteamPurchaseManager.class}, Void.TYPE).isSupported) {
            return;
        }
        steamPurchaseManager.O();
    }

    public static final /* synthetic */ void r(SteamPurchaseManager steamPurchaseManager, SteamDirectPurchaseTool.PayType payType) {
        if (PatchProxy.proxy(new Object[]{steamPurchaseManager, payType}, null, changeQuickRedirect, true, 42016, new Class[]{SteamPurchaseManager.class, SteamDirectPurchaseTool.PayType.class}, Void.TYPE).isSupported) {
            return;
        }
        steamPurchaseManager.Q(payType);
    }

    public static final /* synthetic */ void s(SteamPurchaseManager steamPurchaseManager, SteamDirectPurchaseTool.PayType payType, String str) {
        if (PatchProxy.proxy(new Object[]{steamPurchaseManager, payType, str}, null, changeQuickRedirect, true, 42019, new Class[]{SteamPurchaseManager.class, SteamDirectPurchaseTool.PayType.class, String.class}, Void.TYPE).isSupported) {
            return;
        }
        steamPurchaseManager.R(payType, str);
    }

    public static final /* synthetic */ void t(SteamPurchaseManager steamPurchaseManager, List list, boolean z10) {
        if (PatchProxy.proxy(new Object[]{steamPurchaseManager, list, new Byte(z10 ? (byte) 1 : (byte) 0)}, null, changeQuickRedirect, true, 42022, new Class[]{SteamPurchaseManager.class, List.class, Boolean.TYPE}, Void.TYPE).isSupported) {
            return;
        }
        steamPurchaseManager.U(list, z10);
    }

    private final AppCompatActivity v() {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 41995, new Class[0], AppCompatActivity.class);
        return patchProxyResultProxy.isSupported ? (AppCompatActivity) patchProxyResultProxy.result : this.f90649c.get();
    }

    private final void y() {
        if (PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 42012, new Class[0], Void.TYPE).isSupported) {
            return;
        }
        com.max.xiaoheihe.network.i.a().h7("steam_purchase").I5(io.reactivex.schedulers.b.d()).a4(io.reactivex.android.schedulers.a.c()).J5(new c());
    }

    @dl.e
    public final String A() {
        return this.f90652f;
    }

    public final boolean B() {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 41996, new Class[0], Boolean.TYPE);
        if (patchProxyResultProxy.isSupported) {
            return ((Boolean) patchProxyResultProxy.result).booleanValue();
        }
        a aVar = this.f90648b;
        if (aVar != null) {
            return aVar.isActive();
        }
        AppCompatActivity appCompatActivityV = v();
        if (appCompatActivityV == null || appCompatActivityV.isFinishing()) {
            return false;
        }
        return !(appCompatActivityV instanceof BaseActivity) || ((BaseActivity) appCompatActivityV).isActive();
    }

    public final boolean C() {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 41997, new Class[0], Boolean.TYPE);
        if (patchProxyResultProxy.isSupported) {
            return ((Boolean) patchProxyResultProxy.result).booleanValue();
        }
        a aVar = this.f90648b;
        return aVar != null && aVar.b();
    }

    public final void F() {
        AppCompatActivity appCompatActivityV;
        if (PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 41998, new Class[0], Void.TYPE).isSupported || (appCompatActivityV = v()) == null) {
            return;
        }
        com.max.xiaoheihe.module.mall.o.c(appCompatActivityV, new e());
    }

    public final void G() {
        if (PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 42005, new Class[0], Void.TYPE).isSupported) {
            return;
        }
        this.f90659m.removeMessages(1);
        Handler handler = this.f90659m;
        handler.sendMessage(handler.obtainMessage(1, 28, 0, "1"));
    }

    public final void I(@dl.d WeakReference<AppCompatActivity> weakReference) {
        if (PatchProxy.proxy(new Object[]{weakReference}, this, changeQuickRedirect, false, 41994, new Class[]{WeakReference.class}, Void.TYPE).isSupported) {
            return;
        }
        f0.p(weakReference, "<set-?>");
        this.f90649c = weakReference;
    }

    public final void J(@dl.e a aVar) {
        this.f90648b = aVar;
    }

    public final void K(@dl.e String str) {
        this.f90652f = str;
    }

    public final void T() {
        AtomicBoolean atomicBooleanA;
        if (PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 42010, new Class[0], Void.TYPE).isSupported) {
            return;
        }
        a aVar = this.f90648b;
        if (aVar != null) {
            aVar.d();
        }
        io.reactivex.disposables.a aVar2 = this.f90650d;
        if (aVar2 != null) {
            f0.m(aVar2);
            aVar2.f();
        }
        this.f90659m.removeMessages(1);
        a aVar3 = this.f90648b;
        if (aVar3 == null || (atomicBooleanA = aVar3.a()) == null) {
            return;
        }
        atomicBooleanA.set(false);
    }

    public final void u(final int i10) {
        if (PatchProxy.proxy(new Object[]{new Integer(i10)}, this, changeQuickRedirect, false, 41999, new Class[]{Integer.TYPE}, Void.TYPE).isSupported) {
            return;
        }
        String str = this.f90653g;
        String str2 = this.f90654h;
        if (str == null) {
            return;
        }
        if (i10 == 0) {
            if (this.f90656j) {
                return;
            } else {
                this.f90656j = true;
            }
        }
        a aVar = this.f90648b;
        if (aVar != null) {
            a.C0834a.a(aVar, false, 1, null);
        }
        long j10 = 0;
        if (i10 > 4) {
            j10 = 2;
        } else if (i10 > 0) {
            j10 = 1;
        }
        com.max.xiaoheihe.network.i.a().v1(str, str2).I5(io.reactivex.schedulers.b.d()).C1(j10, TimeUnit.SECONDS).a4(io.reactivex.android.schedulers.a.c()).J5(new com.max.hbcommon.network.d<Result<MallPrepareStateObj>>() { // from class: com.max.xiaoheihe.module.mall.direct_purchace.SteamPurchaseManager$checkSteamBalancePrepare$1
            public static ChangeQuickRedirect changeQuickRedirect;

            /* JADX INFO: compiled from: SteamPurchaseManager.kt */
            public static final class a implements com.max.xiaoheihe.module.mall.direct_purchace.a.b {
                public static ChangeQuickRedirect changeQuickRedirect;

                /* JADX INFO: renamed from: a, reason: collision with root package name */
                final /* synthetic */ SteamPurchaseManager f90664a;

                a(SteamPurchaseManager steamPurchaseManager) {
                    this.f90664a = steamPurchaseManager;
                }

                @Override // com.max.xiaoheihe.module.mall.direct_purchace.a.b
                public void a(@d SteamDirectPurchaseTool.PayType type) {
                    if (PatchProxy.proxy(new Object[]{type}, this, changeQuickRedirect, false, 42030, new Class[]{SteamDirectPurchaseTool.PayType.class}, Void.TYPE).isSupported) {
                        return;
                    }
                    f0.p(type, "type");
                    SteamPurchaseManager.r(this.f90664a, type);
                }
            }

            /* JADX INFO: compiled from: SteamPurchaseManager.kt */
            public static final class b implements l0.g {
                public static ChangeQuickRedirect changeQuickRedirect;

                /* JADX INFO: renamed from: a, reason: collision with root package name */
                final /* synthetic */ SteamPurchaseManager f90665a;

                b(SteamPurchaseManager steamPurchaseManager) {
                    this.f90665a = steamPurchaseManager;
                }

                @Override // com.max.xiaoheihe.utils.l0.g
                public final void a() {
                    if (PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 42031, new Class[0], Void.TYPE).isSupported) {
                        return;
                    }
                    l.f66572a.r(SteamDirectPurchaseTool.f90637i);
                    SteamPurchaseManager.c(this.f90665a);
                }
            }

            @Override // com.max.hbcommon.network.d, io.reactivex.g0
            public void onError(@d Throwable e10) {
                if (PatchProxy.proxy(new Object[]{e10}, this, changeQuickRedirect, false, 42027, new Class[]{Throwable.class}, Void.TYPE).isSupported) {
                    return;
                }
                f0.p(e10, "e");
                if (this.f90662b.B()) {
                    super.onError(e10);
                    SteamPurchaseManager.a aVarX = this.f90662b.x();
                    if (aVarX != null) {
                        aVarX.d();
                    }
                    this.f90662b.f90656j = false;
                    SteamPurchaseManager.a aVarX2 = this.f90662b.x();
                    if (aVarX2 != null) {
                        aVarX2.onError();
                    }
                }
            }

            public void onNext(@d Result<MallPrepareStateObj> result) {
                AppCompatActivity appCompatActivityA;
                if (PatchProxy.proxy(new Object[]{result}, this, changeQuickRedirect, false, 42028, new Class[]{Result.class}, Void.TYPE).isSupported) {
                    return;
                }
                f0.p(result, "result");
                if (!this.f90662b.B() || (appCompatActivityA = SteamPurchaseManager.a(this.f90662b)) == null || appCompatActivityA.isFinishing()) {
                    return;
                }
                if (!(appCompatActivityA instanceof BaseActivity) || ((BaseActivity) appCompatActivityA).isActive()) {
                    super.onNext(result);
                    MallPrepareStateObj state = result.getResult();
                    if (f0.g("1", state.getPrepare_state())) {
                        SteamPurchaseManager.a aVarX = this.f90662b.x();
                        if (aVarX != null) {
                            aVarX.d();
                        }
                        this.f90662b.f90656j = false;
                        ArrayList arrayList = new ArrayList();
                        arrayList.add(Integer.valueOf(SteamDirectPurchaseTool.PayType.AliPay.ordinal()));
                        if (c.x(state.getBalance_available())) {
                            arrayList.add(Integer.valueOf(SteamDirectPurchaseTool.PayType.SteamBalance.ordinal()));
                        }
                        PaymentSelectionConfig paymentSelectionConfig = new PaymentSelectionConfig(state.getDesc_desc(), state.getDesc_title(), state.getTitle(), state.getUser_balance(), arrayList, state.getGame_info(), state.getSteam_id_info());
                        l.f66572a.u(SteamDirectPurchaseTool.f90631c);
                        FragmentManager supportFragmentManager = appCompatActivityA.getSupportFragmentManager();
                        f0.o(supportFragmentManager, "activity.supportFragmentManager");
                        SteamDirectPurchaseTool.b(paymentSelectionConfig, supportFragmentManager, new a(this.f90662b));
                        return;
                    }
                    if (f0.g("2", state.getPrepare_state())) {
                        SteamPurchaseManager.a aVarX2 = this.f90662b.x();
                        if (aVarX2 != null) {
                            aVarX2.d();
                        }
                        this.f90662b.f90656j = false;
                        l.f66572a.t(SteamDirectPurchaseTool.f90634f);
                        SteamPurchaseManager.o(this.f90662b, false);
                        return;
                    }
                    if (f0.g("3", state.getPrepare_state())) {
                        SteamPurchaseManager.a aVarX3 = this.f90662b.x();
                        if (aVarX3 != null) {
                            aVarX3.d();
                        }
                        this.f90662b.f90656j = false;
                        l.f66572a.t(SteamDirectPurchaseTool.f90636h);
                        com.max.xiaoheihe.module.mall.o.w((BaseActivity) appCompatActivityA, "登录Steam账号", com.max.hbcommon.utils.l.e(R.string.purchase_login_steam_tips), null, new b(this.f90662b));
                        return;
                    }
                    if (f0.g("4", state.getPrepare_state())) {
                        int i11 = i10;
                        if (i11 <= 10) {
                            this.f90662b.u(i11 + 1);
                            return;
                        }
                        this.f90662b.f90656j = false;
                        SteamPurchaseManager.a aVarX4 = this.f90662b.x();
                        if (aVarX4 != null) {
                            aVarX4.d();
                        }
                        com.max.hbutils.utils.c.f("检测超时请稍后再试");
                        return;
                    }
                    if (f0.g("5", state.getPrepare_state())) {
                        this.f90662b.f90656j = false;
                        SteamPurchaseManager.a aVarX5 = this.f90662b.x();
                        if (aVarX5 != null) {
                            aVarX5.d();
                        }
                        com.max.xiaoheihe.module.mall.o.w((BaseActivity) appCompatActivityA, null, state.getMsg(), null, null);
                        return;
                    }
                    if (!f0.g("6", state.getPrepare_state())) {
                        this.f90662b.f90656j = false;
                        SteamPurchaseManager.a aVarX6 = this.f90662b.x();
                        if (aVarX6 != null) {
                            aVarX6.d();
                        }
                        com.max.xiaoheihe.module.mall.o.w(appCompatActivityA, null, "检测异常", null, null);
                        return;
                    }
                    l.f66572a.u(SteamDirectPurchaseTool.f90638j);
                    this.f90662b.f90656j = false;
                    SteamPurchaseManager.a aVarX7 = this.f90662b.x();
                    if (aVarX7 != null) {
                        aVarX7.d();
                    }
                    f0.o(state, "state");
                    FragmentManager supportFragmentManager2 = appCompatActivityA.getSupportFragmentManager();
                    f0.o(supportFragmentManager2, "activity.supportFragmentManager");
                    final SteamPurchaseManager steamPurchaseManager = this.f90662b;
                    SteamDirectPurchaseTool.c(state, supportFragmentManager2, new yh.a<b2>() { // from class: com.max.xiaoheihe.module.mall.direct_purchace.SteamPurchaseManager$checkSteamBalancePrepare$1$onNext$3
                        public static ChangeQuickRedirect changeQuickRedirect;

                        {
                            super(0);
                        }

                        /* JADX WARN: Type inference failed for: r0v3, types: [java.lang.Object, kotlin.b2] */
                        @Override // yh.a
                        public /* bridge */ /* synthetic */ b2 invoke() {
                            PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 42033, new Class[0], Object.class);
                            if (patchProxyResultProxy.isSupported) {
                                return patchProxyResultProxy.result;
                            }
                            invoke2();
                            return b2.f124493a;
                        }

                        /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
                        public final void invoke2() {
                            if (PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 42032, new Class[0], Void.TYPE).isSupported) {
                                return;
                            }
                            SteamPurchaseManager.s(steamPurchaseManager, SteamDirectPurchaseTool.PayType.AliPay, "1");
                        }
                    });
                }
            }

            @Override // com.max.hbcommon.network.d, io.reactivex.g0
            public /* bridge */ /* synthetic */ void onNext(Object obj) {
                if (PatchProxy.proxy(new Object[]{obj}, this, changeQuickRedirect, false, 42029, new Class[]{Object.class}, Void.TYPE).isSupported) {
                    return;
                }
                onNext((Result<MallPrepareStateObj>) obj);
            }
        });
    }

    @dl.d
    public final WeakReference<AppCompatActivity> w() {
        return this.f90649c;
    }

    @dl.e
    public final a x() {
        return this.f90648b;
    }

    @dl.d
    public final BuyTypeValueObj z() {
        return this.f90647a;
    }
}
