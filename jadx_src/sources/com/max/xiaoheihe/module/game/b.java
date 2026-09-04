package com.max.xiaoheihe.module.game;

import android.content.Context;
import android.content.DialogInterface;
import android.text.TextUtils;
import android.text.format.Formatter;
import android.view.View;
import android.widget.ProgressBar;
import android.widget.TextView;
import com.lzy.okgo.model.Progress;
import com.max.hbcommon.base.BaseActivity;
import com.max.hbutils.bean.Result;
import com.max.xiaoheihe.R;
import com.max.xiaoheihe.bean.game.GameObj;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.PatchProxyResult;
import java.io.File;
import java.io.Serializable;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

/* JADX INFO: compiled from: AppDownloadController.java */
/* JADX INFO: loaded from: classes11.dex */
public class b {
    public static ChangeQuickRedirect changeQuickRedirect;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private Set<String> f86433a = new HashSet();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private io.reactivex.disposables.a f86434b;

    /* JADX INFO: compiled from: AppDownloadController.java */
    public class a implements View.OnClickListener {
        public static ChangeQuickRedirect changeQuickRedirect;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ com.lzy.okserver.download.b f86435b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ Progress f86436c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        final /* synthetic */ com.max.hbcommon.base.adapter.s.e f86437d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        final /* synthetic */ GameObj f86438e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        final /* synthetic */ boolean f86439f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        final /* synthetic */ s f86440g;

        a(com.lzy.okserver.download.b bVar, Progress progress, com.max.hbcommon.base.adapter.s.e eVar, GameObj gameObj, boolean z10, s sVar) {
            this.f86435b = bVar;
            this.f86436c = progress;
            this.f86437d = eVar;
            this.f86438e = gameObj;
            this.f86439f = z10;
            this.f86440g = sVar;
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            if (PatchProxy.proxy(new Object[]{view}, this, changeQuickRedirect, false, 32172, new Class[]{View.class}, Void.TYPE).isSupported) {
                return;
            }
            this.f86435b.d("1");
            if (TextUtils.isEmpty(this.f86436c.f64779e) || new File(this.f86436c.f64779e).exists()) {
                this.f86435b.v();
            } else {
                this.f86435b.t();
            }
            b.this.f(this.f86437d, this.f86438e, this.f86439f, this.f86435b, this.f86436c, this.f86440g);
        }
    }

    /* JADX INFO: renamed from: com.max.xiaoheihe.module.game.b$b, reason: collision with other inner class name */
    /* JADX INFO: compiled from: AppDownloadController.java */
    public class ViewOnClickListenerC0785b implements View.OnClickListener {
        public static ChangeQuickRedirect changeQuickRedirect;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ Context f86442b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ Progress f86443c;

        ViewOnClickListenerC0785b(Context context, Progress progress) {
            this.f86442b = context;
            this.f86443c = progress;
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            if (PatchProxy.proxy(new Object[]{view}, this, changeQuickRedirect, false, 32173, new Class[]{View.class}, Void.TYPE).isSupported) {
                return;
            }
            com.max.xiaoheihe.utils.d.e(this.f86442b, this.f86443c.f64776b);
            com.max.xiaoheihe.utils.d.G0(this.f86442b, this.f86443c);
        }
    }

    /* JADX INFO: compiled from: AppDownloadController.java */
    public class c implements View.OnClickListener {
        public static ChangeQuickRedirect changeQuickRedirect;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ com.lzy.okserver.download.b f86445b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ com.max.hbcommon.base.adapter.s.e f86446c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        final /* synthetic */ GameObj f86447d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        final /* synthetic */ boolean f86448e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        final /* synthetic */ Progress f86449f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        final /* synthetic */ s f86450g;

        c(com.lzy.okserver.download.b bVar, com.max.hbcommon.base.adapter.s.e eVar, GameObj gameObj, boolean z10, Progress progress, s sVar) {
            this.f86445b = bVar;
            this.f86446c = eVar;
            this.f86447d = gameObj;
            this.f86448e = z10;
            this.f86449f = progress;
            this.f86450g = sVar;
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            if (PatchProxy.proxy(new Object[]{view}, this, changeQuickRedirect, false, 32174, new Class[]{View.class}, Void.TYPE).isSupported) {
                return;
            }
            this.f86445b.t();
            b.this.f(this.f86446c, this.f86447d, this.f86448e, this.f86445b, this.f86449f, this.f86450g);
        }
    }

    /* JADX INFO: compiled from: AppDownloadController.java */
    public class d implements View.OnClickListener {
        public static ChangeQuickRedirect changeQuickRedirect;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ com.lzy.okserver.download.b f86452b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ com.max.hbcommon.base.adapter.s.e f86453c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        final /* synthetic */ GameObj f86454d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        final /* synthetic */ boolean f86455e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        final /* synthetic */ Progress f86456f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        final /* synthetic */ s f86457g;

        d(com.lzy.okserver.download.b bVar, com.max.hbcommon.base.adapter.s.e eVar, GameObj gameObj, boolean z10, Progress progress, s sVar) {
            this.f86452b = bVar;
            this.f86453c = eVar;
            this.f86454d = gameObj;
            this.f86455e = z10;
            this.f86456f = progress;
            this.f86457g = sVar;
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            if (PatchProxy.proxy(new Object[]{view}, this, changeQuickRedirect, false, 32175, new Class[]{View.class}, Void.TYPE).isSupported) {
                return;
            }
            this.f86452b.d("1");
            this.f86452b.v();
            b.this.f(this.f86453c, this.f86454d, this.f86455e, this.f86452b, this.f86456f, this.f86457g);
        }
    }

    /* JADX INFO: compiled from: AppDownloadController.java */
    public class e implements r1.y0 {
        public static ChangeQuickRedirect changeQuickRedirect;

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ TextView f86459a;

        e(TextView textView) {
            this.f86459a = textView;
        }

        @Override // com.max.xiaoheihe.module.game.r1.y0
        public void a() {
            if (PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 32177, new Class[0], Void.TYPE).isSupported) {
                return;
            }
            r1.m2(this.f86459a, GameObj.SUBSCRIBE_STATE_SUBSCRIBING, true);
        }

        @Override // com.max.xiaoheihe.module.game.r1.y0
        public void b() {
            if (PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 32176, new Class[0], Void.TYPE).isSupported) {
                return;
            }
            r1.m2(this.f86459a, GameObj.SUBSCRIBE_STATE_SUBSCRIBING, true);
        }
    }

    /* JADX INFO: compiled from: AppDownloadController.java */
    public class f extends com.max.hbcommon.network.d<Result> {
        public static ChangeQuickRedirect changeQuickRedirect;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ TextView f86461b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ GameObj f86462c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        final /* synthetic */ String f86463d;

        f(TextView textView, GameObj gameObj, String str) {
            this.f86461b = textView;
            this.f86462c = gameObj;
            this.f86463d = str;
        }

        @Override // com.max.hbcommon.network.d, io.reactivex.g0
        public void onError(Throwable th2) {
            if (PatchProxy.proxy(new Object[]{th2}, this, changeQuickRedirect, false, 32178, new Class[]{Throwable.class}, Void.TYPE).isSupported) {
                return;
            }
            super.onError(th2);
            com.max.hbutils.utils.c cVar = com.max.hbutils.utils.c.f73533a;
            com.max.hbutils.utils.c.f(com.max.xiaoheihe.utils.d.n0(R.string.fail));
            r1.m2(this.f86461b, this.f86462c.getFollow_state(), true);
        }

        public void onNext(Result result) {
            if (PatchProxy.proxy(new Object[]{result}, this, changeQuickRedirect, false, 32179, new Class[]{Result.class}, Void.TYPE).isSupported) {
                return;
            }
            super.onNext(result);
            this.f86462c.setFollow_state(this.f86463d);
        }

        @Override // com.max.hbcommon.network.d, io.reactivex.g0
        public /* bridge */ /* synthetic */ void onNext(Object obj) {
            if (PatchProxy.proxy(new Object[]{obj}, this, changeQuickRedirect, false, 32180, new Class[]{Object.class}, Void.TYPE).isSupported) {
                return;
            }
            onNext((Result) obj);
        }
    }

    /* JADX INFO: compiled from: AppDownloadController.java */
    public class g implements DialogInterface.OnClickListener {
        public static ChangeQuickRedirect changeQuickRedirect;

        g() {
        }

        @Override // android.content.DialogInterface.OnClickListener
        public void onClick(DialogInterface dialogInterface, int i10) {
            if (PatchProxy.proxy(new Object[]{dialogInterface, new Integer(i10)}, this, changeQuickRedirect, false, 32181, new Class[]{DialogInterface.class, Integer.TYPE}, Void.TYPE).isSupported) {
                return;
            }
            dialogInterface.dismiss();
        }
    }

    /* JADX INFO: compiled from: AppDownloadController.java */
    public class h implements DialogInterface.OnClickListener {
        public static ChangeQuickRedirect changeQuickRedirect;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ com.lzy.okserver.download.b f86466b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ com.max.hbcommon.base.adapter.s.e f86467c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        final /* synthetic */ GameObj f86468d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        final /* synthetic */ boolean f86469e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        final /* synthetic */ Progress f86470f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        final /* synthetic */ s f86471g;

        h(com.lzy.okserver.download.b bVar, com.max.hbcommon.base.adapter.s.e eVar, GameObj gameObj, boolean z10, Progress progress, s sVar) {
            this.f86466b = bVar;
            this.f86467c = eVar;
            this.f86468d = gameObj;
            this.f86469e = z10;
            this.f86470f = progress;
            this.f86471g = sVar;
        }

        @Override // android.content.DialogInterface.OnClickListener
        public void onClick(DialogInterface dialogInterface, int i10) {
            if (PatchProxy.proxy(new Object[]{dialogInterface, new Integer(i10)}, this, changeQuickRedirect, false, 32182, new Class[]{DialogInterface.class, Integer.TYPE}, Void.TYPE).isSupported) {
                return;
            }
            this.f86466b.r(true);
            b.this.f(this.f86467c, this.f86468d, this.f86469e, this.f86466b, this.f86470f, this.f86471g);
            dialogInterface.dismiss();
        }
    }

    /* JADX INFO: compiled from: AppDownloadController.java */
    public class i implements io.reactivex.g0<com.lzy.okserver.download.b> {
        public static ChangeQuickRedirect changeQuickRedirect;

        i() {
        }

        public void a(com.lzy.okserver.download.b bVar) {
            if (PatchProxy.proxy(new Object[]{bVar}, this, changeQuickRedirect, false, 32170, new Class[]{com.lzy.okserver.download.b.class}, Void.TYPE).isSupported) {
                return;
            }
            bVar.q(new x1()).v();
        }

        @Override // io.reactivex.g0
        public void onComplete() {
        }

        @Override // io.reactivex.g0
        public void onError(Throwable th2) {
        }

        @Override // io.reactivex.g0
        public /* bridge */ /* synthetic */ void onNext(com.lzy.okserver.download.b bVar) {
            if (PatchProxy.proxy(new Object[]{bVar}, this, changeQuickRedirect, false, 32171, new Class[]{Object.class}, Void.TYPE).isSupported) {
                return;
            }
            a(bVar);
        }

        @Override // io.reactivex.g0
        public void onSubscribe(io.reactivex.disposables.b bVar) {
        }
    }

    /* JADX INFO: compiled from: AppDownloadController.java */
    public class j implements io.reactivex.c0<com.lzy.okserver.download.b> {
        public static ChangeQuickRedirect changeQuickRedirect;

        j() {
        }

        @Override // io.reactivex.c0
        public void a(io.reactivex.b0<com.lzy.okserver.download.b> b0Var) throws Exception {
            if (PatchProxy.proxy(new Object[]{b0Var}, this, changeQuickRedirect, false, 32183, new Class[]{io.reactivex.b0.class}, Void.TYPE).isSupported) {
                return;
            }
            Iterator<Map.Entry<String, com.lzy.okserver.download.b>> it = com.max.xiaoheihe.module.game.c.b().entrySet().iterator();
            while (it.hasNext()) {
                com.lzy.okserver.download.b value = it.next().getValue();
                Progress progress = value.f64853b;
                if (progress.f64785k != 5) {
                    Serializable serializable = progress.f64790p;
                    if (!(serializable instanceof String) || !"0".equals((String) serializable)) {
                        b0Var.onNext(value);
                    }
                }
            }
            b0Var.onComplete();
        }
    }

    /* JADX INFO: compiled from: AppDownloadController.java */
    public class k implements View.OnClickListener {
        public static ChangeQuickRedirect changeQuickRedirect;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ Context f86473b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ GameObj f86474c;

        k(Context context, GameObj gameObj) {
            this.f86473b = context;
            this.f86474c = gameObj;
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            if (PatchProxy.proxy(new Object[]{view}, this, changeQuickRedirect, false, 32184, new Class[]{View.class}, Void.TYPE).isSupported) {
                return;
            }
            Context context = this.f86473b;
            context.startActivity(z.b(context, this.f86474c.getH_src(), this.f86474c.getAppid(), this.f86474c.getGame_type(), null, com.max.xiaoheihe.utils.i0.m(), com.max.xiaoheihe.utils.i0.j(), null));
        }
    }

    /* JADX INFO: compiled from: AppDownloadController.java */
    public class l implements View.OnClickListener {
        public static ChangeQuickRedirect changeQuickRedirect;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ TextView f86476b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ GameObj f86477c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        final /* synthetic */ boolean f86478d;

        l(TextView textView, GameObj gameObj, boolean z10) {
            this.f86476b = textView;
            this.f86477c = gameObj;
            this.f86478d = z10;
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            if (PatchProxy.proxy(new Object[]{view}, this, changeQuickRedirect, false, 32185, new Class[]{View.class}, Void.TYPE).isSupported) {
                return;
            }
            b.a(b.this, this.f86476b, this.f86477c, this.f86478d);
        }
    }

    /* JADX INFO: compiled from: AppDownloadController.java */
    public class m implements View.OnClickListener {
        public static ChangeQuickRedirect changeQuickRedirect;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ Context f86480b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ String f86481c;

        m(Context context, String str) {
            this.f86480b = context;
            this.f86481c = str;
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            if (PatchProxy.proxy(new Object[]{view}, this, changeQuickRedirect, false, 32186, new Class[]{View.class}, Void.TYPE).isSupported) {
                return;
            }
            com.max.xiaoheihe.utils.d.d1(this.f86480b, this.f86481c);
        }
    }

    /* JADX INFO: compiled from: AppDownloadController.java */
    public class n implements View.OnClickListener {
        public static ChangeQuickRedirect changeQuickRedirect;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ Context f86483b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ com.max.hbcommon.base.adapter.s.e f86484c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        final /* synthetic */ GameObj f86485d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        final /* synthetic */ boolean f86486e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        final /* synthetic */ s f86487f;

        /* JADX INFO: compiled from: AppDownloadController.java */
        public class a implements com.max.hbcommon.utils.i.c {
            public static ChangeQuickRedirect changeQuickRedirect;

            a() {
            }

            @Override // com.max.hbcommon.utils.i.c
            public void a() {
                if (PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 32188, new Class[0], Void.TYPE).isSupported) {
                    return;
                }
                n nVar = n.this;
                b.this.q(nVar.f86484c, nVar.f86485d, nVar.f86486e, nVar.f86487f);
            }

            @Override // com.max.hbcommon.utils.i.c
            public void b() {
            }
        }

        n(Context context, com.max.hbcommon.base.adapter.s.e eVar, GameObj gameObj, boolean z10, s sVar) {
            this.f86483b = context;
            this.f86484c = eVar;
            this.f86485d = gameObj;
            this.f86486e = z10;
            this.f86487f = sVar;
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            if (PatchProxy.proxy(new Object[]{view}, this, changeQuickRedirect, false, 32187, new Class[]{View.class}, Void.TYPE).isSupported) {
                return;
            }
            com.max.hbcommon.utils.i.a(this.f86483b, new a());
        }
    }

    /* JADX INFO: compiled from: AppDownloadController.java */
    public class o implements View.OnClickListener {
        public static ChangeQuickRedirect changeQuickRedirect;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ Context f86490b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ com.max.hbcommon.base.adapter.s.e f86491c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        final /* synthetic */ GameObj f86492d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        final /* synthetic */ boolean f86493e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        final /* synthetic */ com.lzy.okserver.download.b f86494f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        final /* synthetic */ Progress f86495g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        final /* synthetic */ s f86496h;

        o(Context context, com.max.hbcommon.base.adapter.s.e eVar, GameObj gameObj, boolean z10, com.lzy.okserver.download.b bVar, Progress progress, s sVar) {
            this.f86490b = context;
            this.f86491c = eVar;
            this.f86492d = gameObj;
            this.f86493e = z10;
            this.f86494f = bVar;
            this.f86495g = progress;
            this.f86496h = sVar;
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            if (PatchProxy.proxy(new Object[]{view}, this, changeQuickRedirect, false, 32189, new Class[]{View.class}, Void.TYPE).isSupported) {
                return;
            }
            b.b(b.this, this.f86490b, this.f86491c, this.f86492d, this.f86493e, this.f86494f, this.f86495g, this.f86496h);
        }
    }

    /* JADX INFO: compiled from: AppDownloadController.java */
    public class p implements View.OnClickListener {
        public static ChangeQuickRedirect changeQuickRedirect;

        p() {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
        }
    }

    /* JADX INFO: compiled from: AppDownloadController.java */
    public class q implements View.OnClickListener {
        public static ChangeQuickRedirect changeQuickRedirect;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ com.lzy.okserver.download.b f86499b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ com.max.hbcommon.base.adapter.s.e f86500c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        final /* synthetic */ GameObj f86501d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        final /* synthetic */ boolean f86502e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        final /* synthetic */ Progress f86503f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        final /* synthetic */ s f86504g;

        q(com.lzy.okserver.download.b bVar, com.max.hbcommon.base.adapter.s.e eVar, GameObj gameObj, boolean z10, Progress progress, s sVar) {
            this.f86499b = bVar;
            this.f86500c = eVar;
            this.f86501d = gameObj;
            this.f86502e = z10;
            this.f86503f = progress;
            this.f86504g = sVar;
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            if (PatchProxy.proxy(new Object[]{view}, this, changeQuickRedirect, false, 32190, new Class[]{View.class}, Void.TYPE).isSupported) {
                return;
            }
            this.f86499b.d("0");
            this.f86499b.h();
            this.f86499b.u();
            b.this.f(this.f86500c, this.f86501d, this.f86502e, this.f86499b, this.f86503f, this.f86504g);
        }
    }

    /* JADX INFO: compiled from: AppDownloadController.java */
    public class r extends com.lzy.okserver.download.a {
        public static ChangeQuickRedirect changeQuickRedirect;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private com.max.hbcommon.base.adapter.s.e f86506b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private GameObj f86507c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private boolean f86508d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        private com.lzy.okserver.download.b f86509e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        private s f86510f;

        r(Object obj, com.max.hbcommon.base.adapter.s.e eVar, GameObj gameObj, boolean z10, com.lzy.okserver.download.b bVar, s sVar) {
            super(obj);
            this.f86506b = eVar;
            this.f86507c = gameObj;
            this.f86508d = z10;
            this.f86509e = bVar;
            this.f86510f = sVar;
        }

        private void g(Progress progress) {
            if (!PatchProxy.proxy(new Object[]{progress}, this, changeQuickRedirect, false, 32192, new Class[]{Progress.class}, Void.TYPE).isSupported && progress.f64776b.equals(this.f86506b.g())) {
                b.c(b.this, this.f86506b, this.f86507c, this.f86508d, this.f86509e, progress, this.f86510f);
            }
        }

        private void h(Progress progress) {
            if (!PatchProxy.proxy(new Object[]{progress}, this, changeQuickRedirect, false, 32193, new Class[]{Progress.class}, Void.TYPE).isSupported && progress.f64776b.equals(this.f86506b.g())) {
                b.this.f(this.f86506b, this.f86507c, this.f86508d, null, null, this.f86510f);
            }
        }

        private void i(Progress progress) {
            if (!PatchProxy.proxy(new Object[]{progress}, this, changeQuickRedirect, false, 32191, new Class[]{Progress.class}, Void.TYPE).isSupported && progress.f64776b.equals(this.f86506b.g())) {
                b.this.f(this.f86506b, this.f86507c, this.f86508d, this.f86509e, progress, this.f86510f);
            }
        }

        @Override // com.lzy.okserver.d
        public void a(Progress progress) {
            if (PatchProxy.proxy(new Object[]{progress}, this, changeQuickRedirect, false, 32195, new Class[]{Progress.class}, Void.TYPE).isSupported) {
                return;
            }
            g(progress);
        }

        @Override // com.lzy.okserver.d
        public /* bridge */ /* synthetic */ void b(File file, Progress progress) {
            if (PatchProxy.proxy(new Object[]{file, progress}, this, changeQuickRedirect, false, 32199, new Class[]{Object.class, Progress.class}, Void.TYPE).isSupported) {
                return;
            }
            f(file, progress);
        }

        @Override // com.lzy.okserver.d
        public void c(Progress progress) {
            if (PatchProxy.proxy(new Object[]{progress}, this, changeQuickRedirect, false, 32196, new Class[]{Progress.class}, Void.TYPE).isSupported) {
                return;
            }
            i(progress);
        }

        @Override // com.lzy.okserver.d
        public void d(Progress progress) {
            if (PatchProxy.proxy(new Object[]{progress}, this, changeQuickRedirect, false, 32198, new Class[]{Progress.class}, Void.TYPE).isSupported) {
                return;
            }
            h(progress);
        }

        @Override // com.lzy.okserver.d
        public void e(Progress progress) {
            if (PatchProxy.proxy(new Object[]{progress}, this, changeQuickRedirect, false, 32194, new Class[]{Progress.class}, Void.TYPE).isSupported) {
                return;
            }
            i(progress);
        }

        public void f(File file, Progress progress) {
            if (PatchProxy.proxy(new Object[]{file, progress}, this, changeQuickRedirect, false, 32197, new Class[]{File.class, Progress.class}, Void.TYPE).isSupported) {
                return;
            }
            i(progress);
        }
    }

    /* JADX INFO: compiled from: AppDownloadController.java */
    public interface s {
        void a();

        void b(com.lzy.okserver.download.b bVar, Progress progress);

        void c();

        void d();

        boolean isActive();
    }

    static /* synthetic */ void a(b bVar, TextView textView, GameObj gameObj, boolean z10) {
        if (PatchProxy.proxy(new Object[]{bVar, textView, gameObj, new Byte(z10 ? (byte) 1 : (byte) 0)}, null, changeQuickRedirect, true, 32167, new Class[]{b.class, TextView.class, GameObj.class, Boolean.TYPE}, Void.TYPE).isSupported) {
            return;
        }
        bVar.l(textView, gameObj, z10);
    }

    static /* synthetic */ void b(b bVar, Context context, com.max.hbcommon.base.adapter.s.e eVar, GameObj gameObj, boolean z10, com.lzy.okserver.download.b bVar2, Progress progress, s sVar) {
        if (PatchProxy.proxy(new Object[]{bVar, context, eVar, gameObj, new Byte(z10 ? (byte) 1 : (byte) 0), bVar2, progress, sVar}, null, changeQuickRedirect, true, 32168, new Class[]{b.class, Context.class, com.max.hbcommon.base.adapter.s.e.class, GameObj.class, Boolean.TYPE, com.lzy.okserver.download.b.class, Progress.class, s.class}, Void.TYPE).isSupported) {
            return;
        }
        bVar.p(context, eVar, gameObj, z10, bVar2, progress, sVar);
    }

    static /* synthetic */ void c(b bVar, com.max.hbcommon.base.adapter.s.e eVar, GameObj gameObj, boolean z10, com.lzy.okserver.download.b bVar2, Progress progress, s sVar) {
        if (PatchProxy.proxy(new Object[]{bVar, eVar, gameObj, new Byte(z10 ? (byte) 1 : (byte) 0), bVar2, progress, sVar}, null, changeQuickRedirect, true, 32169, new Class[]{b.class, com.max.hbcommon.base.adapter.s.e.class, GameObj.class, Boolean.TYPE, com.lzy.okserver.download.b.class, Progress.class, s.class}, Void.TYPE).isSupported) {
            return;
        }
        bVar.m(eVar, gameObj, z10, bVar2, progress, sVar);
    }

    private void d(io.reactivex.disposables.b bVar) {
        if (PatchProxy.proxy(new Object[]{bVar}, this, changeQuickRedirect, false, 32165, new Class[]{io.reactivex.disposables.b.class}, Void.TYPE).isSupported) {
            return;
        }
        if (this.f86434b == null) {
            this.f86434b = new io.reactivex.disposables.a();
        }
        this.f86434b.c(bVar);
    }

    private void h() {
        io.reactivex.disposables.a aVar;
        if (PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 32166, new Class[0], Void.TYPE).isSupported || (aVar = this.f86434b) == null) {
            return;
        }
        aVar.f();
    }

    private void i(TextView textView, GameObj gameObj, String str, String str2) {
        if (PatchProxy.proxy(new Object[]{textView, gameObj, str, str2}, this, changeQuickRedirect, false, 32163, new Class[]{TextView.class, GameObj.class, String.class, String.class}, Void.TYPE).isSupported) {
            return;
        }
        io.reactivex.z<Result> zVarNb = null;
        if ("unfollowing".equalsIgnoreCase(str)) {
            zVarNb = com.max.xiaoheihe.network.i.a().x3(r1.Z(gameObj));
        } else if ("following".equalsIgnoreCase(str)) {
            zVarNb = com.max.xiaoheihe.network.i.a().cb(r1.Z(gameObj));
        } else if (GameObj.SUBSCRIBE_STATE_UNSUBSCRIBING.equalsIgnoreCase(str)) {
            zVarNb = com.max.xiaoheihe.network.i.a().l8(r1.Z(gameObj));
        } else if (GameObj.SUBSCRIBE_STATE_SUBSCRIBING.equalsIgnoreCase(str)) {
            zVarNb = com.max.xiaoheihe.network.i.a().nb(r1.Z(gameObj), str2);
        }
        if (zVarNb != null) {
            d((io.reactivex.disposables.b) zVarNb.I5(io.reactivex.schedulers.b.d()).a4(io.reactivex.android.schedulers.a.c()).J5(new f(textView, gameObj, str)));
        }
    }

    private String j(GameObj gameObj) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{gameObj}, this, changeQuickRedirect, false, 32161, new Class[]{GameObj.class}, String.class);
        if (patchProxyResultProxy.isSupported) {
            return (String) patchProxyResultProxy.result;
        }
        return com.max.xiaoheihe.module.game.c.g(gameObj) + this;
    }

    private com.lzy.okserver.download.b k(com.max.hbcommon.base.adapter.s.e eVar, GameObj gameObj, boolean z10, s sVar) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{eVar, gameObj, new Byte(z10 ? (byte) 1 : (byte) 0), sVar}, this, changeQuickRedirect, false, 32160, new Class[]{com.max.hbcommon.base.adapter.s.e.class, GameObj.class, Boolean.TYPE, s.class}, com.lzy.okserver.download.b.class);
        if (patchProxyResultProxy.isSupported) {
            return (com.lzy.okserver.download.b) patchProxyResultProxy.result;
        }
        com.lzy.okserver.download.b bVarU = com.lzy.okserver.b.m(com.max.xiaoheihe.module.game.c.g(gameObj), com.lzy.okgo.b.h(com.max.xiaoheihe.module.game.c.e(gameObj))).c(gameObj).u();
        bVarU.q(new r(j(gameObj), eVar, gameObj, z10, bVarU, sVar)).q(new x1());
        bVarU.v();
        return bVarU;
    }

    private void l(TextView textView, GameObj gameObj, boolean z10) {
        if (PatchProxy.proxy(new Object[]{textView, gameObj, new Byte(z10 ? (byte) 1 : (byte) 0)}, this, changeQuickRedirect, false, 32162, new Class[]{TextView.class, GameObj.class, Boolean.TYPE}, Void.TYPE).isSupported) {
            return;
        }
        Context context = textView.getContext();
        if (com.max.xiaoheihe.utils.i0.e(context)) {
            if ("unfollowing".equalsIgnoreCase(gameObj.getFollow_state())) {
                r1.m2(textView, "following", z10);
                i(textView, gameObj, "following", null);
                return;
            }
            if ("following".equalsIgnoreCase(gameObj.getFollow_state())) {
                r1.m2(textView, "unfollowing", z10);
                i(textView, gameObj, "unfollowing", null);
            } else if (GameObj.SUBSCRIBE_STATE_UNSUBSCRIBING.equalsIgnoreCase(gameObj.getFollow_state())) {
                String strX0 = r1.x0();
                r1.h2((BaseActivity) context, com.max.hbcommon.utils.c.B(strX0) ? strX0 : null, r1.Z(gameObj), new e(textView));
            } else if (!GameObj.SUBSCRIBE_STATE_SUBSCRIBING.equalsIgnoreCase(gameObj.getFollow_state())) {
                GameObj.FOLLOW_STATE_OWNED.equalsIgnoreCase(gameObj.getFollow_state());
            } else {
                r1.m2(textView, GameObj.SUBSCRIBE_STATE_UNSUBSCRIBING, true);
                i(textView, gameObj, GameObj.SUBSCRIBE_STATE_UNSUBSCRIBING, null);
            }
        }
    }

    private void m(com.max.hbcommon.base.adapter.s.e eVar, GameObj gameObj, boolean z10, com.lzy.okserver.download.b bVar, Progress progress, s sVar) {
        if (PatchProxy.proxy(new Object[]{eVar, gameObj, new Byte(z10 ? (byte) 1 : (byte) 0), bVar, progress, sVar}, this, changeQuickRedirect, false, 32157, new Class[]{com.max.hbcommon.base.adapter.s.e.class, GameObj.class, Boolean.TYPE, com.lzy.okserver.download.b.class, Progress.class, s.class}, Void.TYPE).isSupported) {
            return;
        }
        TextView textView = (TextView) eVar.i(R.id.tv_download);
        TextView textView2 = (TextView) eVar.i(R.id.tv_progress_btn_left);
        TextView textView3 = (TextView) eVar.i(R.id.tv_progress_btn_right);
        TextView textView4 = (TextView) eVar.i(R.id.tv_progress);
        ProgressBar progressBar = (ProgressBar) eVar.i(R.id.pb_download);
        Context context = eVar.b().getContext();
        textView2.setText(context.getResources().getString(R.string.cancel));
        textView2.setOnClickListener(new o(context, eVar, gameObj, z10, bVar, progress, sVar));
        n(progressBar, textView4, progress);
        int i10 = progress.f64785k;
        if (i10 == 1) {
            textView.setVisibility(8);
            textView2.setVisibility(0);
            textView3.setVisibility(0);
            textView3.setText(context.getResources().getString(R.string.pause));
            textView3.setOnClickListener(new p());
        } else if (i10 == 2) {
            textView.setVisibility(8);
            textView2.setVisibility(0);
            textView3.setVisibility(0);
            textView3.setText(context.getResources().getString(R.string.pause));
            textView3.setOnClickListener(new q(bVar, eVar, gameObj, z10, progress, sVar));
        } else if (i10 == 4) {
            textView.setVisibility(8);
            textView2.setVisibility(0);
            textView3.setVisibility(0);
            textView3.setText(context.getResources().getString(R.string.retry));
            textView3.setOnClickListener(new a(bVar, progress, eVar, gameObj, z10, sVar));
        } else if (i10 != 5) {
            textView.setVisibility(8);
            textView2.setVisibility(0);
            textView3.setVisibility(0);
            textView3.setText(context.getResources().getString(R.string.go_on));
            textView3.setOnClickListener(new d(bVar, eVar, gameObj, z10, progress, sVar));
        } else {
            textView.setVisibility(0);
            textView2.setVisibility(8);
            textView3.setVisibility(8);
            if (com.max.hbcommon.utils.f.g(progress.f64779e)) {
                String strF = com.max.xiaoheihe.module.game.c.f(context, gameObj.getBundle_id());
                if ("0".equals(strF)) {
                    textView.setText(context.getResources().getString(R.string.install_app));
                } else {
                    textView.setText(com.max.xiaoheihe.module.game.c.j(strF, gameObj.getVersion_num()) ? context.getResources().getString(R.string.update_app) : context.getResources().getString(R.string.install_app));
                }
                textView.setOnClickListener(new ViewOnClickListenerC0785b(context, progress));
            } else {
                textView.setText(context.getResources().getString(R.string.download));
                textView.setOnClickListener(new c(bVar, eVar, gameObj, z10, progress, sVar));
            }
        }
        if (sVar == null || !sVar.isActive()) {
            return;
        }
        sVar.b(bVar, progress);
    }

    private void n(ProgressBar progressBar, TextView textView, Progress progress) {
        if (PatchProxy.proxy(new Object[]{progressBar, textView, progress}, this, changeQuickRedirect, false, 32158, new Class[]{ProgressBar.class, TextView.class, Progress.class}, Void.TYPE).isSupported) {
            return;
        }
        Context context = progressBar.getContext();
        if (5 == progress.f64785k) {
            progressBar.setVisibility(8);
            if (textView != null) {
                textView.setTextColor(context.getResources().getColor(R.color.text_secondary_1_color));
                textView.setTextSize(0, context.getResources().getDimensionPixelSize(R.dimen.text_size_12));
                textView.setVisibility(0);
                textView.setText(context.getResources().getString(R.string.download_completed));
                return;
            }
            return;
        }
        progressBar.setVisibility(0);
        progressBar.setProgress((int) (progress.f64781g * 100.0f));
        if (textView != null) {
            textView.setVisibility(0);
            if (4 == progress.f64785k) {
                textView.setTextColor(context.getResources().getColor(R.color.badge_bg_color));
                textView.setTextSize(0, context.getResources().getDimensionPixelSize(R.dimen.text_size_10));
                textView.setText(context.getResources().getString(R.string.download_error));
            } else {
                textView.setTextColor(context.getResources().getColor(R.color.text_primary_1_color));
                textView.setTextSize(0, context.getResources().getDimensionPixelSize(R.dimen.text_size_10));
                textView.setText(String.format("%s / %s", Formatter.formatFileSize(context, progress.f64783i), Formatter.formatFileSize(context, progress.f64782h)));
            }
        }
    }

    public static void o() {
        if (PatchProxy.proxy(new Object[0], null, changeQuickRedirect, true, 32153, new Class[0], Void.TYPE).isSupported) {
            return;
        }
        io.reactivex.z.q1(new j()).I5(io.reactivex.schedulers.b.d()).a4(io.reactivex.android.schedulers.a.c()).g(new i());
    }

    private void p(Context context, com.max.hbcommon.base.adapter.s.e eVar, GameObj gameObj, boolean z10, com.lzy.okserver.download.b bVar, Progress progress, s sVar) {
        if (PatchProxy.proxy(new Object[]{context, eVar, gameObj, new Byte(z10 ? (byte) 1 : (byte) 0), bVar, progress, sVar}, this, changeQuickRedirect, false, 32164, new Class[]{Context.class, com.max.hbcommon.base.adapter.s.e.class, GameObj.class, Boolean.TYPE, com.lzy.okserver.download.b.class, Progress.class, s.class}, Void.TYPE).isSupported) {
            return;
        }
        new com.max.hbcommon.view.a.f(context).x(R.string.delete_task).k(R.string.delete_task_and_file).t(R.string.delete, new h(bVar, eVar, gameObj, z10, progress, sVar)).n(R.string.cancel, new g()).F();
    }

    public void e(com.max.hbcommon.base.adapter.s.e eVar, GameObj gameObj, boolean z10) {
        if (PatchProxy.proxy(new Object[]{eVar, gameObj, new Byte(z10 ? (byte) 1 : (byte) 0)}, this, changeQuickRedirect, false, 32154, new Class[]{com.max.hbcommon.base.adapter.s.e.class, GameObj.class, Boolean.TYPE}, Void.TYPE).isSupported) {
            return;
        }
        f(eVar, gameObj, z10, null, null, null);
    }

    public void f(com.max.hbcommon.base.adapter.s.e eVar, GameObj gameObj, boolean z10, com.lzy.okserver.download.b bVar, Progress progress, s sVar) {
        if (PatchProxy.proxy(new Object[]{eVar, gameObj, new Byte(z10 ? (byte) 1 : (byte) 0), bVar, progress, sVar}, this, changeQuickRedirect, false, 32155, new Class[]{com.max.hbcommon.base.adapter.s.e.class, GameObj.class, Boolean.TYPE, com.lzy.okserver.download.b.class, Progress.class, s.class}, Void.TYPE).isSupported) {
            return;
        }
        TextView textView = (TextView) eVar.i(R.id.tv_download);
        TextView textView2 = (TextView) eVar.i(R.id.tv_progress_btn_left);
        TextView textView3 = (TextView) eVar.i(R.id.tv_progress_btn_right);
        TextView textView4 = (TextView) eVar.i(R.id.tv_progress);
        ProgressBar progressBar = (ProgressBar) eVar.i(R.id.pb_download);
        Context context = eVar.b().getContext();
        String strE = com.max.xiaoheihe.module.game.c.e(gameObj);
        eVar.o(com.max.xiaoheihe.module.game.c.g(gameObj));
        this.f86433a.add(j(gameObj));
        if (gameObj.getHeybox_price() != null && !"1".equals(gameObj.getPurchased_state())) {
            textView.setVisibility(0);
            textView2.setVisibility(8);
            textView3.setVisibility(8);
            progressBar.setVisibility(8);
            if (textView4 != null) {
                textView4.setVisibility(8);
            }
            textView.setText("购买");
            textView.setOnClickListener(new k(context, gameObj));
            return;
        }
        if (com.max.hbcommon.utils.c.u(strE)) {
            textView.setVisibility(0);
            textView2.setVisibility(8);
            textView3.setVisibility(8);
            progressBar.setVisibility(8);
            if (textView4 != null) {
                textView4.setVisibility(8);
            }
            r1.m2(textView, gameObj.getFollow_state(), z10);
            textView.setOnClickListener(new l(textView, gameObj, z10));
            if (sVar == null || !sVar.isActive()) {
                return;
            }
            sVar.c();
            return;
        }
        String bundle_id = gameObj.getBundle_id();
        boolean zJ = com.max.xiaoheihe.module.game.c.j(com.max.xiaoheihe.module.game.c.f(context, bundle_id), gameObj.getVersion_num());
        boolean zI = com.max.xiaoheihe.module.game.c.i(bundle_id);
        if (zI && !zJ) {
            textView.setVisibility(0);
            textView2.setVisibility(8);
            textView3.setVisibility(8);
            progressBar.setVisibility(8);
            if (textView4 != null) {
                textView4.setVisibility(8);
            }
            textView.setText(context.getResources().getString(R.string.open_app));
            textView.setOnClickListener(new m(context, bundle_id));
            if (sVar == null || !sVar.isActive()) {
                return;
            }
            sVar.d();
            return;
        }
        if (bVar != null && progress != null) {
            m(eVar, gameObj, z10, bVar, progress, sVar);
            return;
        }
        com.lzy.okserver.download.b bVarC = com.max.xiaoheihe.module.game.c.c(gameObj);
        if (bVarC != null) {
            bVarC.q(new r(j(gameObj), eVar, gameObj, z10, bVarC, sVar)).q(new x1());
            m(eVar, gameObj, z10, bVarC, bVarC.f64853b, sVar);
            return;
        }
        textView.setVisibility(0);
        textView2.setVisibility(8);
        textView3.setVisibility(8);
        progressBar.setVisibility(8);
        if (textView4 != null) {
            textView4.setVisibility(8);
        }
        textView.setText(zI ? context.getResources().getString(R.string.update_app) : context.getResources().getString(R.string.download));
        textView.setOnClickListener(new n(context, eVar, gameObj, z10, sVar));
        if (sVar == null || !sVar.isActive()) {
            return;
        }
        sVar.a();
    }

    public void g() {
        if (PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 32156, new Class[0], Void.TYPE).isSupported) {
            return;
        }
        for (String str : this.f86433a) {
            Iterator<Map.Entry<String, com.lzy.okserver.download.b>> it = com.max.xiaoheihe.module.game.c.b().entrySet().iterator();
            while (it.hasNext()) {
                it.next().getValue().x(str);
            }
        }
        this.f86433a.clear();
        h();
    }

    public void q(com.max.hbcommon.base.adapter.s.e eVar, GameObj gameObj, boolean z10, s sVar) {
        if (PatchProxy.proxy(new Object[]{eVar, gameObj, new Byte(z10 ? (byte) 1 : (byte) 0), sVar}, this, changeQuickRedirect, false, 32159, new Class[]{com.max.hbcommon.base.adapter.s.e.class, GameObj.class, Boolean.TYPE, s.class}, Void.TYPE).isSupported || TextUtils.isEmpty(com.max.xiaoheihe.module.game.c.g(gameObj))) {
            return;
        }
        com.lzy.okserver.download.b bVarK = k(eVar, gameObj, z10, sVar);
        f(eVar, gameObj, z10, bVarK, bVarK.f64853b, sVar);
    }
}
