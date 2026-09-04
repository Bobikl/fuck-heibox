package com.max.hbpay;

import android.app.ProgressDialog;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;
import android.content.IntentFilter;
import android.graphics.drawable.GradientDrawable;
import android.os.Build;
import android.os.Handler;
import android.os.Message;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.annotation.p0;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.k0;
import androidx.lifecycle.x;
import com.alipay.sdk.app.PayTask;
import com.max.hbcommon.base.BaseActivity;
import com.max.hbpay.bean.PayOrderObj;
import com.max.hbpay.bean.PayResult;
import com.max.hbpay.bean.PayTypeInfoObj;
import com.max.hbpay.bean.WeixinQueryObj;
import com.max.hbutils.bean.Result;
import com.max.hbutils.utils.ViewUtils;
import com.max.hbutils.utils.k;
import com.max.hbutils.utils.q;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.PatchProxyResult;
import com.tencent.mm.opensdk.modelpay.PayReq;
import com.tencent.mm.opensdk.openapi.IWXAPI;
import com.tencent.mm.opensdk.openapi.WXAPIFactory;
import io.reactivex.z;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

/* JADX INFO: loaded from: classes11.dex */
public class PaymentManager {
    public static final String A = "hbalance";
    public static final String B = "lianlian";
    public static final String C = "6";
    public static final String D = "1";
    private static final String E = "zzzzpaytest";
    public static ChangeQuickRedirect changeQuickRedirect = null;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public static final int f71417p = 1;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public static final int f71418q = 2;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public static final int f71419r = 3;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public static final int f71420s = 4;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public static final String f71421t = "wechat";

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public static final String f71422u = "alipay";

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public static final String f71423v = "h5";

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public static final String f71424w = "balance";

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public static final String f71425x = "lianlian";

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public static final String f71426y = "wxapp";

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    public static final String f71427z = "aliapp";

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private g f71428a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private io.reactivex.disposables.a f71429b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private ProgressDialog f71430c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private BaseActivity f71431d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private IWXAPI f71432e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private String f71433f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private String f71434g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private String f71435h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private h f71436i;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private List<PayTypeInfoObj> f71440m;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private int f71437j = 0;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private int f71438k = 60;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private boolean f71439l = true;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private int f71441n = 0;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    private PayRespBroadReciver f71442o = new PayRespBroadReciver();

    public enum PAY_TYPE {
        WEIXIN,
        ALI,
        LIANLIAN;

        public static ChangeQuickRedirect changeQuickRedirect;

        public static PAY_TYPE valueOf(String str) {
            PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{str}, null, changeQuickRedirect, true, bb.c.i.f33333i3, new Class[]{String.class}, PAY_TYPE.class);
            return patchProxyResultProxy.isSupported ? (PAY_TYPE) patchProxyResultProxy.result : (PAY_TYPE) Enum.valueOf(PAY_TYPE.class, str);
        }

        /* JADX INFO: renamed from: values, reason: to resolve conflict with enum method */
        public static PAY_TYPE[] valuesCustom() {
            PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[0], null, changeQuickRedirect, true, bb.c.i.f33328h3, new Class[0], PAY_TYPE[].class);
            return patchProxyResultProxy.isSupported ? (PAY_TYPE[]) patchProxyResultProxy.result : (PAY_TYPE[]) values().clone();
        }
    }

    public class PayActivityLifeCycleObserver implements x {
        public static ChangeQuickRedirect changeQuickRedirect;

        public PayActivityLifeCycleObserver() {
        }

        @k0(Lifecycle.Event.ON_CREATE)
        public void onActivityCreate() {
            if (PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, bb.c.i.f33338j3, new Class[0], Void.TYPE).isSupported) {
                return;
            }
            com.max.hbcommon.utils.d.b(PaymentManager.E, "onActivityPause");
        }

        @k0(Lifecycle.Event.ON_DESTROY)
        public void onActivityDestory() {
            if (PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, bb.c.i.f33348l3, new Class[0], Void.TYPE).isSupported) {
                return;
            }
            com.max.hbcommon.utils.d.b(PaymentManager.E, "onActivityDestory");
            PaymentManager.this.f71431d.unregisterReceiver(PaymentManager.this.f71442o);
        }

        @k0(Lifecycle.Event.ON_RESUME)
        public void onActivityResume() {
            if (PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, bb.c.i.f33343k3, new Class[0], Void.TYPE).isSupported) {
                return;
            }
            com.max.hbcommon.utils.d.b(PaymentManager.E, "onActivityResume");
            if (PaymentManager.this.f71430c != null && PaymentManager.this.f71439l) {
                PaymentManager.this.f71430c.dismiss();
            }
            if (!com.max.hbcommon.utils.c.u(PaymentManager.this.f71433f) && PaymentManager.this.f71439l) {
                com.max.hbcommon.utils.d.b(PaymentManager.E, "onResume AppConstant.PAY_RESP_QUERY_WX ");
                PaymentManager.p(PaymentManager.this);
            }
            if (com.max.hbcommon.utils.c.u(PaymentManager.this.f71435h) || !PaymentManager.this.f71439l) {
                return;
            }
            PaymentManager.q(PaymentManager.this);
        }
    }

    public class PayRespBroadReciver extends BroadcastReceiver {
        public static ChangeQuickRedirect changeQuickRedirect;

        private PayRespBroadReciver() {
        }

        @Override // android.content.BroadcastReceiver
        public void onReceive(Context context, Intent intent) {
            if (!PatchProxy.proxy(new Object[]{context, intent}, this, changeQuickRedirect, false, bb.c.i.f33353m3, new Class[]{Context.class, Intent.class}, Void.TYPE).isSupported && intent.getAction().equals(lb.a.M)) {
                int intExtra = intent.getIntExtra("code", -1);
                if (intExtra == -2) {
                    com.max.hbcommon.utils.d.b(PaymentManager.E, "PayRespBroadReciver 已取消 ");
                    PaymentManager.this.f71433f = "";
                    PaymentManager.this.f71428a.U2(PaymentManager.f71426y);
                } else {
                    if (intExtra == 0) {
                        return;
                    }
                    com.max.hbcommon.utils.d.b(PaymentManager.E, "PayRespBroadReciver 失败 ");
                    PaymentManager.this.f71433f = "";
                    PaymentManager.this.f71428a.U2(PaymentManager.f71426y);
                }
            }
        }
    }

    public class a implements View.OnClickListener {
        public static ChangeQuickRedirect changeQuickRedirect;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ int f71446b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ ViewGroup f71447c;

        a(int i10, ViewGroup viewGroup) {
            this.f71446b = i10;
            this.f71447c = viewGroup;
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            if (PatchProxy.proxy(new Object[]{view}, this, changeQuickRedirect, false, bb.c.i.N2, new Class[]{View.class}, Void.TYPE).isSupported) {
                return;
            }
            PaymentManager.this.f71441n = this.f71446b;
            PaymentManager.S(this.f71447c, this.f71446b);
        }
    }

    public class b implements DialogInterface.OnClickListener {
        public static ChangeQuickRedirect changeQuickRedirect;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ List f71449b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ String f71450c;

        b(List list, String str) {
            this.f71449b = list;
            this.f71450c = str;
        }

        @Override // android.content.DialogInterface.OnClickListener
        public void onClick(DialogInterface dialogInterface, int i10) {
            if (PatchProxy.proxy(new Object[]{dialogInterface, new Integer(i10)}, this, changeQuickRedirect, false, bb.c.i.O2, new Class[]{DialogInterface.class, Integer.TYPE}, Void.TYPE).isSupported) {
                return;
            }
            PayTypeInfoObj payTypeInfoObj = (PayTypeInfoObj) this.f71449b.get(PaymentManager.this.f71441n);
            if ("wechat".equals(payTypeInfoObj.getPay_type())) {
                PaymentManager.x(PaymentManager.this, this.f71450c);
            } else if (PaymentManager.f71422u.equals(payTypeInfoObj.getPay_type())) {
                PaymentManager.y(PaymentManager.this, this.f71450c);
            } else if ("h5".equals(payTypeInfoObj.getPay_type())) {
                ob.a aVar = ob.a.f132240a;
                ob.a.p().c(PaymentManager.this.f71431d, payTypeInfoObj.getPay_url());
            } else if ("lianlian".equals(payTypeInfoObj.getPay_type())) {
                PaymentManager.A(PaymentManager.this, this.f71450c);
            }
            dialogInterface.dismiss();
        }
    }

    public class c extends com.max.hbcommon.network.d<Result<PayOrderObj>> {
        public static ChangeQuickRedirect changeQuickRedirect;

        c() {
        }

        @Override // com.max.hbcommon.network.d, io.reactivex.g0
        public void onComplete() {
            if (PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, bb.c.i.Q2, new Class[0], Void.TYPE).isSupported || !PaymentManager.this.f71431d.isActive() || PaymentManager.this.f71430c == null) {
                return;
            }
            PaymentManager.this.f71430c.dismiss();
        }

        @Override // com.max.hbcommon.network.d, io.reactivex.g0
        public void onError(Throwable th2) {
            if (!PatchProxy.proxy(new Object[]{th2}, this, changeQuickRedirect, false, bb.c.i.P2, new Class[]{Throwable.class}, Void.TYPE).isSupported && PaymentManager.this.f71431d.isActive()) {
                super.onError(th2);
                if (PaymentManager.this.f71430c != null) {
                    PaymentManager.this.f71430c.dismiss();
                }
            }
        }

        public void onNext(Result<PayOrderObj> result) {
            String strB;
            if (PatchProxy.proxy(new Object[]{result}, this, changeQuickRedirect, false, bb.c.i.R2, new Class[]{Result.class}, Void.TYPE).isSupported || !PaymentManager.this.f71431d.isActive() || result.getResult() == null) {
                return;
            }
            PayOrderObj result2 = result.getResult();
            PaymentManager.this.f71433f = result2.getOut_trade_no();
            PaymentManager.this.f71428a.E3(result2.getOut_trade_no());
            if (!com.max.hbcommon.utils.c.u(result2.getUrl())) {
                ob.a aVar = ob.a.f132240a;
                ob.a.p().c(PaymentManager.this.f71431d, result2.getUrl());
                return;
            }
            PayReq payReq = new PayReq();
            if (com.max.hbcommon.utils.c.u(result2.getAppid())) {
                ob.a aVar2 = ob.a.f132240a;
                strB = ob.a.b().B(PaymentManager.this.f71431d, "xiaoheihe.weixin_appid");
            } else {
                strB = result2.getAppid();
            }
            payReq.appId = strB;
            payReq.partnerId = result2.getPartnerid();
            payReq.prepayId = result2.getPrepayid();
            payReq.packageValue = result2.getPkg();
            payReq.nonceStr = result2.getNoncestr();
            payReq.timeStamp = result2.getTimestamp();
            payReq.sign = result2.getSign();
            PaymentManager.this.f71432e.sendReq(payReq);
        }

        @Override // com.max.hbcommon.network.d, io.reactivex.g0
        public /* bridge */ /* synthetic */ void onNext(Object obj) {
            if (PatchProxy.proxy(new Object[]{obj}, this, changeQuickRedirect, false, bb.c.i.S2, new Class[]{Object.class}, Void.TYPE).isSupported) {
                return;
            }
            onNext((Result<PayOrderObj>) obj);
        }
    }

    public class d extends com.max.hbcommon.network.d<Result<PayOrderObj>> {
        public static ChangeQuickRedirect changeQuickRedirect;

        public class a implements Runnable {
            public static ChangeQuickRedirect changeQuickRedirect;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            final /* synthetic */ String f71454b;

            a(String str) {
                this.f71454b = str;
            }

            @Override // java.lang.Runnable
            public void run() {
                if (PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, bb.c.i.X2, new Class[0], Void.TYPE).isSupported) {
                    return;
                }
                Map<String, String> mapPayV2 = new PayTask(PaymentManager.this.f71431d).payV2(this.f71454b, true);
                Message message = new Message();
                message.obj = mapPayV2;
                PaymentManager.this.f71436i.sendMessage(message);
            }
        }

        d() {
        }

        @Override // com.max.hbcommon.network.d, io.reactivex.g0
        public void onComplete() {
            if (PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, bb.c.i.U2, new Class[0], Void.TYPE).isSupported || !PaymentManager.this.f71431d.isActive() || PaymentManager.this.f71430c == null) {
                return;
            }
            PaymentManager.this.f71430c.dismiss();
        }

        @Override // com.max.hbcommon.network.d, io.reactivex.g0
        public void onError(Throwable th2) {
            if (!PatchProxy.proxy(new Object[]{th2}, this, changeQuickRedirect, false, bb.c.i.T2, new Class[]{Throwable.class}, Void.TYPE).isSupported && PaymentManager.this.f71431d.isActive()) {
                super.onError(th2);
                if (PaymentManager.this.f71430c != null) {
                    PaymentManager.this.f71430c.dismiss();
                }
            }
        }

        public void onNext(Result<PayOrderObj> result) {
            if (PatchProxy.proxy(new Object[]{result}, this, changeQuickRedirect, false, bb.c.i.V2, new Class[]{Result.class}, Void.TYPE).isSupported || !PaymentManager.this.f71431d.isActive() || result.getResult() == null) {
                return;
            }
            String param_after_urlencode = result.getResult().getParam_after_urlencode();
            PaymentManager.this.f71434g = result.getResult().getOut_trade_no();
            PaymentManager.this.f71428a.E3(result.getResult().getOut_trade_no());
            if (com.max.hbcommon.utils.c.u(result.getResult().getUrl())) {
                new Thread(new a(param_after_urlencode)).start();
            } else {
                ob.a aVar = ob.a.f132240a;
                ob.a.p().c(PaymentManager.this.f71431d, result.getResult().getUrl());
            }
        }

        @Override // com.max.hbcommon.network.d, io.reactivex.g0
        public /* bridge */ /* synthetic */ void onNext(Object obj) {
            if (PatchProxy.proxy(new Object[]{obj}, this, changeQuickRedirect, false, bb.c.i.W2, new Class[]{Object.class}, Void.TYPE).isSupported) {
                return;
            }
            onNext((Result<PayOrderObj>) obj);
        }
    }

    public class e extends com.max.hbcommon.network.d<Result<PayOrderObj>> {
        public static ChangeQuickRedirect changeQuickRedirect;

        e() {
        }

        @Override // com.max.hbcommon.network.d, io.reactivex.g0
        public void onComplete() {
            if (PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, bb.c.i.Z2, new Class[0], Void.TYPE).isSupported || !PaymentManager.this.f71431d.isActive() || PaymentManager.this.f71430c == null) {
                return;
            }
            PaymentManager.this.f71430c.dismiss();
        }

        @Override // com.max.hbcommon.network.d, io.reactivex.g0
        public void onError(Throwable th2) {
            if (!PatchProxy.proxy(new Object[]{th2}, this, changeQuickRedirect, false, bb.c.i.Y2, new Class[]{Throwable.class}, Void.TYPE).isSupported && PaymentManager.this.f71431d.isActive()) {
                super.onError(th2);
                if (PaymentManager.this.f71430c != null) {
                    PaymentManager.this.f71430c.dismiss();
                }
            }
        }

        public void onNext(Result<PayOrderObj> result) {
            if (PatchProxy.proxy(new Object[]{result}, this, changeQuickRedirect, false, bb.c.i.f33287a3, new Class[]{Result.class}, Void.TYPE).isSupported || !PaymentManager.this.f71431d.isActive() || result.getResult() == null) {
                return;
            }
            PayOrderObj result2 = result.getResult();
            PaymentManager.this.f71435h = result2.getOut_trade_no();
            PaymentManager.this.f71428a.E3(result2.getOut_trade_no());
            if (com.max.hbcommon.utils.c.u(result2.getUrl())) {
                return;
            }
            ob.a aVar = ob.a.f132240a;
            ob.a.p().c(PaymentManager.this.f71431d, result2.getUrl());
        }

        @Override // com.max.hbcommon.network.d, io.reactivex.g0
        public /* bridge */ /* synthetic */ void onNext(Object obj) {
            if (PatchProxy.proxy(new Object[]{obj}, this, changeQuickRedirect, false, bb.c.i.f33293b3, new Class[]{Object.class}, Void.TYPE).isSupported) {
                return;
            }
            onNext((Result<PayOrderObj>) obj);
        }
    }

    public class f extends com.max.hbcommon.network.d<Result<WeixinQueryObj>> {
        public static ChangeQuickRedirect changeQuickRedirect;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ PAY_TYPE f71457b;

        public class a implements Runnable {
            public static ChangeQuickRedirect changeQuickRedirect;

            a() {
            }

            @Override // java.lang.Runnable
            public void run() {
                if (PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, bb.c.i.f33323g3, new Class[0], Void.TYPE).isSupported) {
                    return;
                }
                f fVar = f.this;
                PaymentManager.m(PaymentManager.this, fVar.f71457b);
            }
        }

        f(PAY_TYPE pay_type) {
            this.f71457b = pay_type;
        }

        @Override // com.max.hbcommon.network.d, io.reactivex.g0
        public void onComplete() {
            if (PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, bb.c.i.f33305d3, new Class[0], Void.TYPE).isSupported || !PaymentManager.this.f71431d.isActive() || PaymentManager.this.f71430c == null) {
                return;
            }
            PaymentManager.this.f71430c.dismiss();
        }

        @Override // com.max.hbcommon.network.d, io.reactivex.g0
        public void onError(Throwable th2) {
            if (!PatchProxy.proxy(new Object[]{th2}, this, changeQuickRedirect, false, bb.c.i.f33299c3, new Class[]{Throwable.class}, Void.TYPE).isSupported && PaymentManager.this.f71431d.isActive()) {
                super.onError(th2);
                if (PaymentManager.this.f71430c != null) {
                    PaymentManager.this.f71430c.dismiss();
                }
            }
        }

        public void onNext(Result<WeixinQueryObj> result) {
            if (PatchProxy.proxy(new Object[]{result}, this, changeQuickRedirect, false, bb.c.i.f33311e3, new Class[]{Result.class}, Void.TYPE).isSupported || !PaymentManager.this.f71431d.isActive() || result.getResult() == null) {
                return;
            }
            String state = result.getResult().getState();
            PaymentManager.this.f71428a.Y0(result.getResult());
            if ("6".equals(state)) {
                if (PaymentManager.this.f71437j < PaymentManager.this.f71438k) {
                    PaymentManager.k(PaymentManager.this);
                    PaymentManager.this.f71436i.postDelayed(new a(), 2000L);
                    return;
                }
                if (PaymentManager.this.f71430c != null) {
                    PaymentManager.this.f71430c.dismiss();
                }
                PaymentManager.this.f71437j = 0;
                PaymentManager.n(PaymentManager.this, this.f71457b);
                PaymentManager.this.f71428a.o1();
                return;
            }
            if ("1".equals(state)) {
                if (PaymentManager.this.f71430c != null) {
                    PaymentManager.this.f71430c.dismiss();
                }
                PaymentManager.this.f71437j = 0;
                PaymentManager.n(PaymentManager.this, this.f71457b);
                PaymentManager.this.f71428a.S1();
                return;
            }
            if (PaymentManager.this.f71430c != null) {
                PaymentManager.this.f71430c.dismiss();
            }
            PaymentManager.this.f71437j = 0;
            PaymentManager.n(PaymentManager.this, this.f71457b);
            PaymentManager.this.f71428a.o1();
        }

        @Override // com.max.hbcommon.network.d, io.reactivex.g0
        public /* bridge */ /* synthetic */ void onNext(Object obj) {
            if (PatchProxy.proxy(new Object[]{obj}, this, changeQuickRedirect, false, bb.c.i.f33317f3, new Class[]{Object.class}, Void.TYPE).isSupported) {
                return;
            }
            onNext((Result<WeixinQueryObj>) obj);
        }
    }

    public interface g {
        void E3(String str);

        void S1();

        void U2(String str);

        void Y0(WeixinQueryObj weixinQueryObj);

        z<Result<PayOrderObj>> j3(String str);

        void o1();

        z<Result<PayOrderObj>> q0(String str);

        z<Result<PayOrderObj>> z3(String str);
    }

    public static class h extends Handler {
        public static ChangeQuickRedirect changeQuickRedirect;

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final WeakReference<PaymentManager> f71460a;

        public h(PaymentManager paymentManager) {
            this.f71460a = new WeakReference<>(paymentManager);
        }

        @Override // android.os.Handler
        public void handleMessage(Message message) {
            if (PatchProxy.proxy(new Object[]{message}, this, changeQuickRedirect, false, bb.c.i.f33358n3, new Class[]{Message.class}, Void.TYPE).isSupported) {
                return;
            }
            super.handleMessage(message);
            PaymentManager paymentManager = this.f71460a.get();
            if (paymentManager != null) {
                PayResult payResult = new PayResult((Map) message.obj);
                payResult.getResult();
                if (!TextUtils.equals(payResult.getResultStatus(), "9000")) {
                    com.max.hbcommon.utils.d.b(PaymentManager.E, "PayResult 失败 ");
                    PaymentManager.b(paymentManager);
                } else {
                    com.max.hbcommon.utils.d.b(PaymentManager.E, "PayResult 成功 ");
                    if (paymentManager.F()) {
                        PaymentManager.a(paymentManager);
                    }
                }
            }
        }
    }

    public PaymentManager(g gVar, BaseActivity baseActivity) {
        this.f71428a = gVar;
        this.f71431d = baseActivity;
        this.f71429b = baseActivity.V0();
        D();
    }

    static /* synthetic */ void A(PaymentManager paymentManager, String str) {
        if (PatchProxy.proxy(new Object[]{paymentManager, str}, null, changeQuickRedirect, true, bb.c.i.I2, new Class[]{PaymentManager.class, String.class}, Void.TYPE).isSupported) {
            return;
        }
        paymentManager.L(str);
    }

    @p0
    public static PayTypeInfoObj B(List<PayTypeInfoObj> list) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{list}, null, changeQuickRedirect, true, bb.c.i.D2, new Class[]{List.class}, PayTypeInfoObj.class);
        if (patchProxyResultProxy.isSupported) {
            return (PayTypeInfoObj) patchProxyResultProxy.result;
        }
        if (com.max.hbcommon.utils.c.w(list)) {
            return null;
        }
        for (PayTypeInfoObj payTypeInfoObj : list) {
            if ("h5".equals(payTypeInfoObj.getPay_type())) {
                return payTypeInfoObj;
            }
        }
        return null;
    }

    private void D() {
        if (PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, bb.c.i.f33357n2, new Class[0], Void.TYPE).isSupported) {
            return;
        }
        if (com.max.hbcommon.network.b.f68052i) {
            com.max.hbpay.c.a();
        }
        IntentFilter intentFilter = new IntentFilter();
        intentFilter.addAction(lb.a.M);
        if (Build.VERSION.SDK_INT >= 26) {
            this.f71431d.registerReceiver(this.f71442o, intentFilter, 2);
        } else {
            this.f71431d.registerReceiver(this.f71442o, intentFilter);
        }
        ob.a aVar = ob.a.f132240a;
        String strB = ob.a.b().B(this.f71431d, "xiaoheihe.weixin_appid");
        IWXAPI iwxapiCreateWXAPI = WXAPIFactory.createWXAPI(this.f71431d, strB, true);
        this.f71432e = iwxapiCreateWXAPI;
        iwxapiCreateWXAPI.registerApp(strB);
        this.f71431d.getLifecycle().a(new PayActivityLifeCycleObserver() { // from class: com.max.hbpay.PaymentManager.1
        });
        this.f71436i = new h(this);
    }

    public static boolean E(List<PayTypeInfoObj> list, String str) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{list, str}, null, changeQuickRedirect, true, bb.c.i.C2, new Class[]{List.class, String.class}, Boolean.TYPE);
        if (patchProxyResultProxy.isSupported) {
            return ((Boolean) patchProxyResultProxy.result).booleanValue();
        }
        if (!com.max.hbcommon.utils.c.w(list)) {
            for (PayTypeInfoObj payTypeInfoObj : list) {
                if (!com.max.hbcommon.utils.c.u(str) && str.equals(payTypeInfoObj.getPay_type())) {
                    return true;
                }
            }
        }
        return false;
    }

    private void G() {
        if (PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, bb.c.i.f33417z2, new Class[0], Void.TYPE).isSupported) {
            return;
        }
        I(PAY_TYPE.ALI);
    }

    private void H() {
        if (PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, bb.c.i.A2, new Class[0], Void.TYPE).isSupported) {
            return;
        }
        I(PAY_TYPE.LIANLIAN);
    }

    private void I(PAY_TYPE pay_type) {
        if (PatchProxy.proxy(new Object[]{pay_type}, this, changeQuickRedirect, false, bb.c.i.B2, new Class[]{PAY_TYPE.class}, Void.TYPE).isSupported) {
            return;
        }
        z<Result<WeixinQueryObj>> zVarB = null;
        if (pay_type == PAY_TYPE.WEIXIN) {
            zVarB = com.max.hbpay.d.a().a(this.f71433f, null);
        } else if (pay_type == PAY_TYPE.ALI) {
            zVarB = com.max.hbpay.d.a().c(this.f71434g, null);
        } else if (pay_type == PAY_TYPE.LIANLIAN) {
            zVarB = com.max.hbpay.d.a().b(this.f71435h, null);
        }
        if (zVarB == null) {
            return;
        }
        this.f71429b.c((io.reactivex.disposables.b) zVarB.I5(io.reactivex.schedulers.b.d()).a4(io.reactivex.android.schedulers.a.c()).J5(new f(pay_type)));
    }

    private void J() {
        if (PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, bb.c.i.f33412y2, new Class[0], Void.TYPE).isSupported) {
            return;
        }
        I(PAY_TYPE.WEIXIN);
    }

    private void K(String str) {
        if (PatchProxy.proxy(new Object[]{str}, this, changeQuickRedirect, false, bb.c.i.f33397v2, new Class[]{String.class}, Void.TYPE).isSupported) {
            return;
        }
        this.f71430c.setMessage(this.f71431d.getString(R.string.launch_payment));
        if (!this.f71430c.isShowing()) {
            this.f71430c.show();
        }
        this.f71429b.c((io.reactivex.disposables.b) this.f71428a.j3(str).I5(io.reactivex.schedulers.b.d()).a4(io.reactivex.android.schedulers.a.c()).J5(new d()));
    }

    private void L(String str) {
        if (PatchProxy.proxy(new Object[]{str}, this, changeQuickRedirect, false, bb.c.i.f33402w2, new Class[]{String.class}, Void.TYPE).isSupported) {
            return;
        }
        this.f71430c.setMessage(this.f71431d.getString(R.string.launch_payment));
        if (!this.f71430c.isShowing()) {
            this.f71430c.show();
        }
        this.f71429b.c((io.reactivex.disposables.b) this.f71428a.z3(str).I5(io.reactivex.schedulers.b.d()).a4(io.reactivex.android.schedulers.a.c()).J5(new e()));
    }

    private void N(String str) {
        if (PatchProxy.proxy(new Object[]{str}, this, changeQuickRedirect, false, bb.c.i.f33392u2, new Class[]{String.class}, Void.TYPE).isSupported) {
            return;
        }
        this.f71430c.setMessage(this.f71431d.getString(R.string.launch_payment));
        if (!this.f71430c.isShowing()) {
            this.f71430c.show();
        }
        this.f71429b.c((io.reactivex.disposables.b) this.f71428a.q0(str).I5(io.reactivex.schedulers.b.d()).a4(io.reactivex.android.schedulers.a.c()).J5(new c()));
    }

    private void O() {
        if (PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, bb.c.i.f33367p2, new Class[0], Void.TYPE).isSupported) {
            return;
        }
        this.f71434g = "";
        this.f71428a.U2(f71427z);
    }

    private void P(PAY_TYPE pay_type) {
        if (pay_type == PAY_TYPE.WEIXIN) {
            this.f71433f = "";
        } else if (pay_type == PAY_TYPE.ALI) {
            this.f71434g = "";
        } else if (pay_type == PAY_TYPE.LIANLIAN) {
            this.f71435h = "";
        }
    }

    public static void S(ViewGroup viewGroup, int i10) {
        if (PatchProxy.proxy(new Object[]{viewGroup, new Integer(i10)}, null, changeQuickRedirect, true, bb.c.i.f33377r2, new Class[]{ViewGroup.class, Integer.TYPE}, Void.TYPE).isSupported) {
            return;
        }
        Context context = viewGroup.getContext();
        int childCount = viewGroup.getChildCount();
        int i11 = R.color.transparent;
        GradientDrawable gradientDrawableM = q.M(q.o(context, i11, 2.0f), context, R.color.text_primary_1_color, 1.0f);
        GradientDrawable gradientDrawableM2 = q.M(q.o(context, i11, 2.0f), context, R.color.text_secondary_2_color, 0.5f);
        for (int i12 = 0; i12 < childCount; i12++) {
            View childAt = viewGroup.getChildAt(i12);
            TextView textView = (TextView) childAt.findViewById(R.id.tv_desc);
            ImageView imageView = (ImageView) childAt.findViewById(R.id.iv_checkmark);
            if (i12 == i10) {
                imageView.setVisibility(0);
                childAt.setBackground(gradientDrawableM);
                textView.setTextSize(1, 14.0f);
            } else {
                imageView.setVisibility(8);
                childAt.setBackground(gradientDrawableM2);
                textView.setTextSize(1, 12.0f);
            }
        }
    }

    public static void T(View view, int i10) {
        if (PatchProxy.proxy(new Object[]{view, new Integer(i10)}, null, changeQuickRedirect, true, bb.c.i.f33382s2, new Class[]{View.class, Integer.TYPE}, Void.TYPE).isSupported) {
            return;
        }
        Context context = view.getContext();
        ViewGroup viewGroup = (ViewGroup) view.findViewById(R.id.vg_pay_ali);
        ViewGroup viewGroup2 = (ViewGroup) view.findViewById(R.id.vg_pay_weixin);
        TextView textView = (TextView) view.findViewById(R.id.tv_ali_pay);
        TextView textView2 = (TextView) view.findViewById(R.id.tv_weixin_pay);
        ImageView imageView = (ImageView) view.findViewById(R.id.iv_checkmark_ali);
        ImageView imageView2 = (ImageView) view.findViewById(R.id.iv_checkmark_weixin);
        int i11 = R.color.transparent;
        GradientDrawable gradientDrawableM = q.M(q.o(context, i11, 2.0f), context, R.color.text_primary_1_color, 1.0f);
        GradientDrawable gradientDrawableM2 = q.M(q.o(context, i11, 2.0f), context, R.color.text_secondary_2_color, 0.5f);
        if (i10 == 0) {
            imageView2.setVisibility(0);
            imageView.setVisibility(8);
            viewGroup2.setBackground(gradientDrawableM);
            viewGroup.setBackground(gradientDrawableM2);
            textView2.setTextSize(1, 14.0f);
            textView.setTextSize(1, 12.0f);
            return;
        }
        imageView2.setVisibility(8);
        imageView.setVisibility(0);
        viewGroup2.setBackground(gradientDrawableM2);
        viewGroup.setBackground(gradientDrawableM);
        textView2.setTextSize(1, 12.0f);
        textView.setTextSize(1, 14.0f);
    }

    static /* synthetic */ void a(PaymentManager paymentManager) {
        if (PatchProxy.proxy(new Object[]{paymentManager}, null, changeQuickRedirect, true, bb.c.i.E2, new Class[]{PaymentManager.class}, Void.TYPE).isSupported) {
            return;
        }
        paymentManager.G();
    }

    static /* synthetic */ void b(PaymentManager paymentManager) {
        if (PatchProxy.proxy(new Object[]{paymentManager}, null, changeQuickRedirect, true, bb.c.i.F2, new Class[]{PaymentManager.class}, Void.TYPE).isSupported) {
            return;
        }
        paymentManager.O();
    }

    static /* synthetic */ int k(PaymentManager paymentManager) {
        int i10 = paymentManager.f71437j;
        paymentManager.f71437j = i10 + 1;
        return i10;
    }

    static /* synthetic */ void m(PaymentManager paymentManager, PAY_TYPE pay_type) {
        if (PatchProxy.proxy(new Object[]{paymentManager, pay_type}, null, changeQuickRedirect, true, bb.c.i.J2, new Class[]{PaymentManager.class, PAY_TYPE.class}, Void.TYPE).isSupported) {
            return;
        }
        paymentManager.I(pay_type);
    }

    static /* synthetic */ void n(PaymentManager paymentManager, PAY_TYPE pay_type) {
        if (PatchProxy.proxy(new Object[]{paymentManager, pay_type}, null, changeQuickRedirect, true, bb.c.i.K2, new Class[]{PaymentManager.class, PAY_TYPE.class}, Void.TYPE).isSupported) {
            return;
        }
        paymentManager.P(pay_type);
    }

    static /* synthetic */ void p(PaymentManager paymentManager) {
        if (PatchProxy.proxy(new Object[]{paymentManager}, null, changeQuickRedirect, true, bb.c.i.L2, new Class[]{PaymentManager.class}, Void.TYPE).isSupported) {
            return;
        }
        paymentManager.J();
    }

    static /* synthetic */ void q(PaymentManager paymentManager) {
        if (PatchProxy.proxy(new Object[]{paymentManager}, null, changeQuickRedirect, true, bb.c.i.M2, new Class[]{PaymentManager.class}, Void.TYPE).isSupported) {
            return;
        }
        paymentManager.H();
    }

    static /* synthetic */ void x(PaymentManager paymentManager, String str) {
        if (PatchProxy.proxy(new Object[]{paymentManager, str}, null, changeQuickRedirect, true, bb.c.i.G2, new Class[]{PaymentManager.class, String.class}, Void.TYPE).isSupported) {
            return;
        }
        paymentManager.N(str);
    }

    static /* synthetic */ void y(PaymentManager paymentManager, String str) {
        if (PatchProxy.proxy(new Object[]{paymentManager, str}, null, changeQuickRedirect, true, bb.c.i.H2, new Class[]{PaymentManager.class, String.class}, Void.TYPE).isSupported) {
            return;
        }
        paymentManager.K(str);
    }

    public z<Result<WeixinQueryObj>> C(String str, String str2, String str3) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{str, str2, str3}, this, changeQuickRedirect, false, bb.c.i.f33407x2, new Class[]{String.class, String.class, String.class}, z.class);
        if (patchProxyResultProxy.isSupported) {
            return (z) patchProxyResultProxy.result;
        }
        if (f71426y.equals(str)) {
            return com.max.hbpay.d.a().a(str2, str3);
        }
        return "lianlian".equals(str) ? com.max.hbpay.d.a().b(str2, str3) : com.max.hbpay.d.a().c(str2, str3);
    }

    public boolean F() {
        return this.f71439l;
    }

    public ProgressDialog M(int i10, String str) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{new Integer(i10), str}, this, changeQuickRedirect, false, bb.c.i.f33372q2, new Class[]{Integer.TYPE, String.class}, ProgressDialog.class);
        if (patchProxyResultProxy.isSupported) {
            return (ProgressDialog) patchProxyResultProxy.result;
        }
        if (this.f71430c == null) {
            ProgressDialog progressDialog = new ProgressDialog(this.f71431d);
            this.f71430c = progressDialog;
            progressDialog.setIndeterminate(true);
            this.f71430c.setCancelable(false);
        }
        if (i10 == 1) {
            N(str);
        } else if (i10 == 2) {
            K(str);
        } else if (i10 == 3) {
            V(str);
        } else if (i10 == 4) {
            L(str);
        }
        return this.f71430c;
    }

    public void Q(ProgressDialog progressDialog) {
        this.f71430c = progressDialog;
    }

    public void R(List<PayTypeInfoObj> list) {
        if (PatchProxy.proxy(new Object[]{list}, this, changeQuickRedirect, false, bb.c.i.f33362o2, new Class[]{List.class}, Void.TYPE).isSupported) {
            return;
        }
        this.f71440m = k.b(k.p(list), PayTypeInfoObj.class);
    }

    public void U(boolean z10) {
        this.f71439l = z10;
    }

    public void V(String str) {
        if (PatchProxy.proxy(new Object[]{str}, this, changeQuickRedirect, false, bb.c.i.f33387t2, new Class[]{String.class}, Void.TYPE).isSupported) {
            return;
        }
        View viewInflate = LayoutInflater.from(this.f71431d).inflate(R.layout.hbpay_dialog_choose_paytype, (ViewGroup) null);
        viewInflate.setLayoutParams(new ViewGroup.LayoutParams(-1, -2));
        ViewGroup viewGroup = (ViewGroup) viewInflate.findViewById(R.id.vg_container);
        viewGroup.removeAllViews();
        ArrayList arrayList = new ArrayList();
        if (com.max.hbcommon.utils.c.w(this.f71440m)) {
            PayTypeInfoObj payTypeInfoObj = new PayTypeInfoObj();
            payTypeInfoObj.setPay_type("wechat");
            PayTypeInfoObj payTypeInfoObj2 = new PayTypeInfoObj();
            payTypeInfoObj2.setPay_type(f71422u);
            arrayList.add(payTypeInfoObj);
            arrayList.add(payTypeInfoObj2);
        } else {
            arrayList.addAll(this.f71440m);
        }
        for (int i10 = 0; i10 < arrayList.size(); i10++) {
            PayTypeInfoObj payTypeInfoObj3 = (PayTypeInfoObj) arrayList.get(i10);
            View viewInflate2 = LayoutInflater.from(this.f71431d).inflate(R.layout.hbpay_item_paytype_in_dialog, viewGroup, false);
            ImageView imageView = (ImageView) viewInflate2.findViewById(R.id.iv_icon);
            TextView textView = (TextView) viewInflate2.findViewById(R.id.tv_desc);
            if ("wechat".equals(payTypeInfoObj3.getPay_type())) {
                imageView.setImageResource(R.drawable.weixinpay);
                textView.setText("微信");
            } else if (f71422u.equals(payTypeInfoObj3.getPay_type())) {
                imageView.setImageResource(R.drawable.common_alipay_38x38);
                textView.setText("支付宝");
            } else if ("lianlian".equals(payTypeInfoObj3.getPay_type())) {
                imageView.setImageResource(R.drawable.mall_pay_lianlian_50x50);
                textView.setText("连连");
            } else if ("h5".equals(payTypeInfoObj3.getPay_type())) {
                com.max.hbimage.b.K(payTypeInfoObj3.getIcon(), imageView);
                textView.setText(payTypeInfoObj3.getName());
            }
            if (i10 > 0) {
                ((LinearLayout.LayoutParams) viewInflate2.getLayoutParams()).leftMargin = ViewUtils.f(this.f71431d, 42.0f);
            }
            viewInflate2.setOnClickListener(new a(i10, viewGroup));
            viewGroup.addView(viewInflate2);
        }
        this.f71441n = 0;
        S(viewGroup, 0);
        new com.max.hbcommon.view.a.f(this.f71431d).y("选择支付方式").i(viewInflate).g(true).w(true).u("确认支付", new b(arrayList, str)).d().show();
    }
}
