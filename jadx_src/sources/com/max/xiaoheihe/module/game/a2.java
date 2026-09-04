package com.max.xiaoheihe.module.game;

import android.content.Context;
import android.text.TextUtils;
import android.view.View;
import android.widget.TextView;
import com.lzy.okgo.model.Progress;
import com.max.hbcommon.base.BaseActivity;
import com.max.hbcustomview.CProgressButton;
import com.max.hbutils.bean.Result;
import com.max.xiaoheihe.R;
import com.max.xiaoheihe.bean.game.GameObj;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.PatchProxyResult;
import java.io.File;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

/* JADX INFO: compiled from: SimpleDownloadController.java */
/* JADX INFO: loaded from: classes11.dex */
public class a2 {
    public static ChangeQuickRedirect changeQuickRedirect;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private Set<String> f85532a = new HashSet();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private io.reactivex.disposables.a f85533b;

    /* JADX INFO: compiled from: SimpleDownloadController.java */
    public class a implements r1.y0 {
        public static ChangeQuickRedirect changeQuickRedirect;

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ TextView f85534a;

        a(TextView textView) {
            this.f85534a = textView;
        }

        @Override // com.max.xiaoheihe.module.game.r1.y0
        public void a() {
            if (PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 35120, new Class[0], Void.TYPE).isSupported) {
                return;
            }
            r1.m2(this.f85534a, GameObj.SUBSCRIBE_STATE_SUBSCRIBING, true);
        }

        @Override // com.max.xiaoheihe.module.game.r1.y0
        public void b() {
            if (PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 35119, new Class[0], Void.TYPE).isSupported) {
                return;
            }
            r1.m2(this.f85534a, GameObj.SUBSCRIBE_STATE_SUBSCRIBING, true);
        }
    }

    /* JADX INFO: compiled from: SimpleDownloadController.java */
    public class b extends com.max.hbcommon.network.d<Result> {
        public static ChangeQuickRedirect changeQuickRedirect;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ TextView f85536b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ GameObj f85537c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        final /* synthetic */ String f85538d;

        b(TextView textView, GameObj gameObj, String str) {
            this.f85536b = textView;
            this.f85537c = gameObj;
            this.f85538d = str;
        }

        @Override // com.max.hbcommon.network.d, io.reactivex.g0
        public void onError(Throwable th2) {
            if (PatchProxy.proxy(new Object[]{th2}, this, changeQuickRedirect, false, 35121, new Class[]{Throwable.class}, Void.TYPE).isSupported) {
                return;
            }
            super.onError(th2);
            com.max.hbutils.utils.c cVar = com.max.hbutils.utils.c.f73533a;
            com.max.hbutils.utils.c.f(com.max.xiaoheihe.utils.d.n0(R.string.fail));
            r1.m2(this.f85536b, this.f85537c.getFollow_state(), true);
        }

        public void onNext(Result result) {
            if (PatchProxy.proxy(new Object[]{result}, this, changeQuickRedirect, false, 35122, new Class[]{Result.class}, Void.TYPE).isSupported) {
                return;
            }
            super.onNext(result);
            this.f85537c.setFollow_state(this.f85538d);
        }

        @Override // com.max.hbcommon.network.d, io.reactivex.g0
        public /* bridge */ /* synthetic */ void onNext(Object obj) {
            if (PatchProxy.proxy(new Object[]{obj}, this, changeQuickRedirect, false, 35123, new Class[]{Object.class}, Void.TYPE).isSupported) {
                return;
            }
            onNext((Result) obj);
        }
    }

    /* JADX INFO: compiled from: SimpleDownloadController.java */
    public class c implements View.OnClickListener {
        public static ChangeQuickRedirect changeQuickRedirect;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ Context f85540b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ GameObj f85541c;

        c(Context context, GameObj gameObj) {
            this.f85540b = context;
            this.f85541c = gameObj;
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            if (PatchProxy.proxy(new Object[]{view}, this, changeQuickRedirect, false, 35118, new Class[]{View.class}, Void.TYPE).isSupported) {
                return;
            }
            Context context = this.f85540b;
            context.startActivity(z.b(context, this.f85541c.getH_src(), this.f85541c.getAppid(), this.f85541c.getGame_type(), null, com.max.xiaoheihe.utils.i0.m(), com.max.xiaoheihe.utils.i0.j(), null));
        }
    }

    /* JADX INFO: compiled from: SimpleDownloadController.java */
    public class d implements View.OnClickListener {
        public static ChangeQuickRedirect changeQuickRedirect;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ TextView f85543b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ GameObj f85544c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        final /* synthetic */ boolean f85545d;

        d(TextView textView, GameObj gameObj, boolean z10) {
            this.f85543b = textView;
            this.f85544c = gameObj;
            this.f85545d = z10;
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            if (PatchProxy.proxy(new Object[]{view}, this, changeQuickRedirect, false, 35124, new Class[]{View.class}, Void.TYPE).isSupported) {
                return;
            }
            a2.a(a2.this, this.f85543b, this.f85544c, this.f85545d);
        }
    }

    /* JADX INFO: compiled from: SimpleDownloadController.java */
    public class e implements View.OnClickListener {
        public static ChangeQuickRedirect changeQuickRedirect;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ Context f85547b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ String f85548c;

        e(Context context, String str) {
            this.f85547b = context;
            this.f85548c = str;
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            if (PatchProxy.proxy(new Object[]{view}, this, changeQuickRedirect, false, 35125, new Class[]{View.class}, Void.TYPE).isSupported) {
                return;
            }
            com.max.xiaoheihe.utils.d.d1(this.f85547b, this.f85548c);
        }
    }

    /* JADX INFO: compiled from: SimpleDownloadController.java */
    public class f implements View.OnClickListener {
        public static ChangeQuickRedirect changeQuickRedirect;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ com.max.hbcommon.base.adapter.s.e f85550b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ GameObj f85551c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        final /* synthetic */ boolean f85552d;

        f(com.max.hbcommon.base.adapter.s.e eVar, GameObj gameObj, boolean z10) {
            this.f85550b = eVar;
            this.f85551c = gameObj;
            this.f85552d = z10;
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            if (PatchProxy.proxy(new Object[]{view}, this, changeQuickRedirect, false, 35126, new Class[]{View.class}, Void.TYPE).isSupported) {
                return;
            }
            a2.this.r(this.f85550b, this.f85551c, this.f85552d);
        }
    }

    /* JADX INFO: compiled from: SimpleDownloadController.java */
    public class g implements View.OnClickListener {
        public static ChangeQuickRedirect changeQuickRedirect;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ com.lzy.okserver.download.b f85554b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ com.max.hbcommon.base.adapter.s.e f85555c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        final /* synthetic */ GameObj f85556d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        final /* synthetic */ boolean f85557e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        final /* synthetic */ Progress f85558f;

        g(com.lzy.okserver.download.b bVar, com.max.hbcommon.base.adapter.s.e eVar, GameObj gameObj, boolean z10, Progress progress) {
            this.f85554b = bVar;
            this.f85555c = eVar;
            this.f85556d = gameObj;
            this.f85557e = z10;
            this.f85558f = progress;
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            if (PatchProxy.proxy(new Object[]{view}, this, changeQuickRedirect, false, 35127, new Class[]{View.class}, Void.TYPE).isSupported) {
                return;
            }
            this.f85554b.d("0");
            this.f85554b.h();
            this.f85554b.u();
            a2.this.e(this.f85555c, this.f85556d, this.f85557e, this.f85554b, this.f85558f);
        }
    }

    /* JADX INFO: compiled from: SimpleDownloadController.java */
    public class h implements View.OnClickListener {
        public static ChangeQuickRedirect changeQuickRedirect;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ com.lzy.okserver.download.b f85560b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ Progress f85561c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        final /* synthetic */ com.max.hbcommon.base.adapter.s.e f85562d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        final /* synthetic */ GameObj f85563e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        final /* synthetic */ boolean f85564f;

        h(com.lzy.okserver.download.b bVar, Progress progress, com.max.hbcommon.base.adapter.s.e eVar, GameObj gameObj, boolean z10) {
            this.f85560b = bVar;
            this.f85561c = progress;
            this.f85562d = eVar;
            this.f85563e = gameObj;
            this.f85564f = z10;
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            if (PatchProxy.proxy(new Object[]{view}, this, changeQuickRedirect, false, 35128, new Class[]{View.class}, Void.TYPE).isSupported) {
                return;
            }
            this.f85560b.d("1");
            if (TextUtils.isEmpty(this.f85561c.f64779e) || new File(this.f85561c.f64779e).exists()) {
                this.f85560b.v();
            } else {
                this.f85560b.t();
            }
            a2.this.e(this.f85562d, this.f85563e, this.f85564f, this.f85560b, this.f85561c);
        }
    }

    /* JADX INFO: compiled from: SimpleDownloadController.java */
    public class i implements View.OnClickListener {
        public static ChangeQuickRedirect changeQuickRedirect;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ Context f85566b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ Progress f85567c;

        i(Context context, Progress progress) {
            this.f85566b = context;
            this.f85567c = progress;
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            if (PatchProxy.proxy(new Object[]{view}, this, changeQuickRedirect, false, 35129, new Class[]{View.class}, Void.TYPE).isSupported) {
                return;
            }
            com.max.xiaoheihe.utils.d.e(this.f85566b, this.f85567c.f64776b);
            com.max.xiaoheihe.utils.d.G0(this.f85566b, this.f85567c);
        }
    }

    /* JADX INFO: compiled from: SimpleDownloadController.java */
    public class j implements View.OnClickListener {
        public static ChangeQuickRedirect changeQuickRedirect;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ com.lzy.okserver.download.b f85569b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ com.max.hbcommon.base.adapter.s.e f85570c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        final /* synthetic */ GameObj f85571d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        final /* synthetic */ boolean f85572e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        final /* synthetic */ Progress f85573f;

        j(com.lzy.okserver.download.b bVar, com.max.hbcommon.base.adapter.s.e eVar, GameObj gameObj, boolean z10, Progress progress) {
            this.f85569b = bVar;
            this.f85570c = eVar;
            this.f85571d = gameObj;
            this.f85572e = z10;
            this.f85573f = progress;
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            if (PatchProxy.proxy(new Object[]{view}, this, changeQuickRedirect, false, 35130, new Class[]{View.class}, Void.TYPE).isSupported) {
                return;
            }
            this.f85569b.t();
            a2.this.e(this.f85570c, this.f85571d, this.f85572e, this.f85569b, this.f85573f);
        }
    }

    /* JADX INFO: compiled from: SimpleDownloadController.java */
    public class k implements View.OnClickListener {
        public static ChangeQuickRedirect changeQuickRedirect;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ com.lzy.okserver.download.b f85575b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ com.max.hbcommon.base.adapter.s.e f85576c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        final /* synthetic */ GameObj f85577d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        final /* synthetic */ boolean f85578e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        final /* synthetic */ Progress f85579f;

        k(com.lzy.okserver.download.b bVar, com.max.hbcommon.base.adapter.s.e eVar, GameObj gameObj, boolean z10, Progress progress) {
            this.f85575b = bVar;
            this.f85576c = eVar;
            this.f85577d = gameObj;
            this.f85578e = z10;
            this.f85579f = progress;
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            if (PatchProxy.proxy(new Object[]{view}, this, changeQuickRedirect, false, 35131, new Class[]{View.class}, Void.TYPE).isSupported) {
                return;
            }
            this.f85575b.d("1");
            this.f85575b.v();
            a2.this.e(this.f85576c, this.f85577d, this.f85578e, this.f85575b, this.f85579f);
        }
    }

    /* JADX INFO: compiled from: SimpleDownloadController.java */
    public class l extends com.lzy.okserver.download.a {
        public static ChangeQuickRedirect changeQuickRedirect;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private com.max.hbcommon.base.adapter.s.e f85581b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private GameObj f85582c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private boolean f85583d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        private com.lzy.okserver.download.b f85584e;

        l(Object obj, com.max.hbcommon.base.adapter.s.e eVar, GameObj gameObj, boolean z10, com.lzy.okserver.download.b bVar) {
            super(obj);
            this.f85581b = eVar;
            this.f85582c = gameObj;
            this.f85583d = z10;
            this.f85584e = bVar;
        }

        private void g(Progress progress) {
            if (!PatchProxy.proxy(new Object[]{progress}, this, changeQuickRedirect, false, 35133, new Class[]{Progress.class}, Void.TYPE).isSupported && progress.f64776b.equals(this.f85581b.g())) {
                a2.b(a2.this, this.f85581b, this.f85582c, this.f85583d, this.f85584e, progress);
            }
        }

        private void h(Progress progress) {
            if (!PatchProxy.proxy(new Object[]{progress}, this, changeQuickRedirect, false, 35134, new Class[]{Progress.class}, Void.TYPE).isSupported && progress.f64776b.equals(this.f85581b.g())) {
                a2.this.e(this.f85581b, this.f85582c, this.f85583d, null, null);
            }
        }

        private void i(Progress progress) {
            if (!PatchProxy.proxy(new Object[]{progress}, this, changeQuickRedirect, false, 35132, new Class[]{Progress.class}, Void.TYPE).isSupported && progress.f64776b.equals(this.f85581b.g())) {
                a2.this.e(this.f85581b, this.f85582c, this.f85583d, this.f85584e, progress);
            }
        }

        @Override // com.lzy.okserver.d
        public void a(Progress progress) {
            if (PatchProxy.proxy(new Object[]{progress}, this, changeQuickRedirect, false, 35136, new Class[]{Progress.class}, Void.TYPE).isSupported) {
                return;
            }
            g(progress);
        }

        @Override // com.lzy.okserver.d
        public /* bridge */ /* synthetic */ void b(File file, Progress progress) {
            if (PatchProxy.proxy(new Object[]{file, progress}, this, changeQuickRedirect, false, 35140, new Class[]{Object.class, Progress.class}, Void.TYPE).isSupported) {
                return;
            }
            f(file, progress);
        }

        @Override // com.lzy.okserver.d
        public void c(Progress progress) {
            if (PatchProxy.proxy(new Object[]{progress}, this, changeQuickRedirect, false, 35137, new Class[]{Progress.class}, Void.TYPE).isSupported) {
                return;
            }
            i(progress);
        }

        @Override // com.lzy.okserver.d
        public void d(Progress progress) {
            if (PatchProxy.proxy(new Object[]{progress}, this, changeQuickRedirect, false, 35139, new Class[]{Progress.class}, Void.TYPE).isSupported) {
                return;
            }
            h(progress);
        }

        @Override // com.lzy.okserver.d
        public void e(Progress progress) {
            if (PatchProxy.proxy(new Object[]{progress}, this, changeQuickRedirect, false, 35135, new Class[]{Progress.class}, Void.TYPE).isSupported) {
                return;
            }
            i(progress);
        }

        public void f(File file, Progress progress) {
            if (PatchProxy.proxy(new Object[]{file, progress}, this, changeQuickRedirect, false, 35138, new Class[]{File.class, Progress.class}, Void.TYPE).isSupported) {
                return;
            }
            i(progress);
        }
    }

    static /* synthetic */ void a(a2 a2Var, TextView textView, GameObj gameObj, boolean z10) {
        if (PatchProxy.proxy(new Object[]{a2Var, textView, gameObj, new Byte(z10 ? (byte) 1 : (byte) 0)}, null, changeQuickRedirect, true, 35116, new Class[]{a2.class, TextView.class, GameObj.class, Boolean.TYPE}, Void.TYPE).isSupported) {
            return;
        }
        a2Var.o(textView, gameObj, z10);
    }

    static /* synthetic */ void b(a2 a2Var, com.max.hbcommon.base.adapter.s.e eVar, GameObj gameObj, boolean z10, com.lzy.okserver.download.b bVar, Progress progress) {
        if (PatchProxy.proxy(new Object[]{a2Var, eVar, gameObj, new Byte(z10 ? (byte) 1 : (byte) 0), bVar, progress}, null, changeQuickRedirect, true, 35117, new Class[]{a2.class, com.max.hbcommon.base.adapter.s.e.class, GameObj.class, Boolean.TYPE, com.lzy.okserver.download.b.class, Progress.class}, Void.TYPE).isSupported) {
            return;
        }
        a2Var.p(eVar, gameObj, z10, bVar, progress);
    }

    private void c(io.reactivex.disposables.b bVar) {
        if (PatchProxy.proxy(new Object[]{bVar}, this, changeQuickRedirect, false, 35112, new Class[]{io.reactivex.disposables.b.class}, Void.TYPE).isSupported) {
            return;
        }
        if (this.f85533b == null) {
            this.f85533b = new io.reactivex.disposables.a();
        }
        this.f85533b.c(bVar);
    }

    private void g() {
        io.reactivex.disposables.a aVar;
        if (PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 35113, new Class[0], Void.TYPE).isSupported || (aVar = this.f85533b) == null) {
            return;
        }
        aVar.f();
    }

    private void h(TextView textView, GameObj gameObj, String str, String str2) {
        if (PatchProxy.proxy(new Object[]{textView, gameObj, str, str2}, this, changeQuickRedirect, false, 35111, new Class[]{TextView.class, GameObj.class, String.class, String.class}, Void.TYPE).isSupported) {
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
            c((io.reactivex.disposables.b) zVarNb.I5(io.reactivex.schedulers.b.d()).a4(io.reactivex.android.schedulers.a.c()).J5(new b(textView, gameObj, str)));
        }
    }

    private String i(GameObj gameObj) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{gameObj}, this, changeQuickRedirect, false, 35109, new Class[]{GameObj.class}, String.class);
        if (patchProxyResultProxy.isSupported) {
            return (String) patchProxyResultProxy.result;
        }
        return com.max.xiaoheihe.module.game.c.g(gameObj) + this;
    }

    private int j(Context context, boolean z10) {
        return z10 ? R.drawable.btn_primary_2dp : R.drawable.btn_bg_layer_2_color_alpha20_2dp;
    }

    private int k(Context context, boolean z10) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{context, new Byte(z10 ? (byte) 1 : (byte) 0)}, this, changeQuickRedirect, false, 35114, new Class[]{Context.class, Boolean.TYPE}, Integer.TYPE);
        return patchProxyResultProxy.isSupported ? ((Integer) patchProxyResultProxy.result).intValue() : context.getResources().getColor(R.color.white);
    }

    private int l(Context context, boolean z10) {
        return z10 ? R.drawable.btn_primary_border_2dp : R.drawable.btn_bg_layer_2_color_alpha20_2dp;
    }

    private int m(Context context, boolean z10) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{context, new Byte(z10 ? (byte) 1 : (byte) 0)}, this, changeQuickRedirect, false, 35115, new Class[]{Context.class, Boolean.TYPE}, Integer.TYPE);
        if (patchProxyResultProxy.isSupported) {
            return ((Integer) patchProxyResultProxy.result).intValue();
        }
        return context.getResources().getColor(z10 ? R.color.text_primary_1_color : R.color.white);
    }

    private com.lzy.okserver.download.b n(com.max.hbcommon.base.adapter.s.e eVar, GameObj gameObj, boolean z10) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{eVar, gameObj, new Byte(z10 ? (byte) 1 : (byte) 0)}, this, changeQuickRedirect, false, 35108, new Class[]{com.max.hbcommon.base.adapter.s.e.class, GameObj.class, Boolean.TYPE}, com.lzy.okserver.download.b.class);
        if (patchProxyResultProxy.isSupported) {
            return (com.lzy.okserver.download.b) patchProxyResultProxy.result;
        }
        com.lzy.okserver.download.b bVarU = com.lzy.okserver.b.m(com.max.xiaoheihe.module.game.c.g(gameObj), com.lzy.okgo.b.h(com.max.xiaoheihe.module.game.c.e(gameObj))).c(gameObj).u();
        bVarU.q(new l(i(gameObj), eVar, gameObj, z10, bVarU)).q(new x1());
        bVarU.v();
        return bVarU;
    }

    private void o(TextView textView, GameObj gameObj, boolean z10) {
        if (PatchProxy.proxy(new Object[]{textView, gameObj, new Byte(z10 ? (byte) 1 : (byte) 0)}, this, changeQuickRedirect, false, 35110, new Class[]{TextView.class, GameObj.class, Boolean.TYPE}, Void.TYPE).isSupported) {
            return;
        }
        Context context = textView.getContext();
        if (com.max.xiaoheihe.utils.i0.e(context)) {
            if ("unfollowing".equalsIgnoreCase(gameObj.getFollow_state())) {
                r1.m2(textView, "following", z10);
                h(textView, gameObj, "following", null);
                return;
            }
            if ("following".equalsIgnoreCase(gameObj.getFollow_state())) {
                r1.m2(textView, "unfollowing", z10);
                h(textView, gameObj, "unfollowing", null);
            } else if (GameObj.SUBSCRIBE_STATE_UNSUBSCRIBING.equalsIgnoreCase(gameObj.getFollow_state())) {
                String strX0 = r1.x0();
                r1.h2((BaseActivity) context, com.max.hbcommon.utils.c.B(strX0) ? strX0 : null, r1.Z(gameObj), new a(textView));
            } else if (!GameObj.SUBSCRIBE_STATE_SUBSCRIBING.equalsIgnoreCase(gameObj.getFollow_state())) {
                GameObj.FOLLOW_STATE_OWNED.equalsIgnoreCase(gameObj.getFollow_state());
            } else {
                r1.m2(textView, GameObj.SUBSCRIBE_STATE_UNSUBSCRIBING, z10);
                h(textView, gameObj, GameObj.SUBSCRIBE_STATE_UNSUBSCRIBING, null);
            }
        }
    }

    private void p(com.max.hbcommon.base.adapter.s.e eVar, GameObj gameObj, boolean z10, com.lzy.okserver.download.b bVar, Progress progress) {
        if (PatchProxy.proxy(new Object[]{eVar, gameObj, new Byte(z10 ? (byte) 1 : (byte) 0), bVar, progress}, this, changeQuickRedirect, false, 35105, new Class[]{com.max.hbcommon.base.adapter.s.e.class, GameObj.class, Boolean.TYPE, com.lzy.okserver.download.b.class, Progress.class}, Void.TYPE).isSupported) {
            return;
        }
        TextView textView = (TextView) eVar.i(R.id.tv_download);
        CProgressButton cProgressButton = (CProgressButton) eVar.i(R.id.cpb_download);
        Context context = eVar.b().getContext();
        q(cProgressButton, progress);
        int i10 = progress.f64785k;
        if (i10 == 1) {
            textView.setVisibility(8);
            cProgressButton.setVisibility(0);
            return;
        }
        if (i10 == 2) {
            textView.setVisibility(8);
            cProgressButton.setVisibility(0);
            cProgressButton.setOnClickListener(new g(bVar, eVar, gameObj, z10, progress));
            return;
        }
        if (i10 == 4) {
            textView.setVisibility(0);
            cProgressButton.setVisibility(8);
            textView.setBackgroundResource(j(context, z10));
            textView.setTextColor(k(context, z10));
            textView.setText(context.getResources().getString(R.string.retry));
            textView.setOnClickListener(new h(bVar, progress, eVar, gameObj, z10));
            return;
        }
        if (i10 != 5) {
            textView.setVisibility(0);
            cProgressButton.setVisibility(8);
            textView.setBackgroundResource(j(context, z10));
            textView.setTextColor(k(context, z10));
            textView.setText(context.getResources().getString(R.string.download));
            textView.setOnClickListener(new k(bVar, eVar, gameObj, z10, progress));
            return;
        }
        textView.setVisibility(0);
        cProgressButton.setVisibility(8);
        if (!com.max.hbcommon.utils.f.g(progress.f64779e)) {
            textView.setBackgroundResource(j(context, z10));
            textView.setTextColor(k(context, z10));
            textView.setText(context.getResources().getString(R.string.download));
            textView.setOnClickListener(new j(bVar, eVar, gameObj, z10, progress));
            return;
        }
        textView.setBackgroundResource(l(context, z10));
        textView.setTextColor(m(context, z10));
        String strF = com.max.xiaoheihe.module.game.c.f(context, gameObj.getBundle_id());
        if ("0".equals(strF)) {
            textView.setText(context.getResources().getString(R.string.install_app));
        } else {
            textView.setText(com.max.xiaoheihe.module.game.c.j(strF, gameObj.getVersion_num()) ? context.getResources().getString(R.string.update_app) : context.getResources().getString(R.string.install_app));
        }
        textView.setOnClickListener(new i(context, progress));
    }

    private void q(CProgressButton cProgressButton, Progress progress) {
        if (PatchProxy.proxy(new Object[]{cProgressButton, progress}, this, changeQuickRedirect, false, 35106, new Class[]{CProgressButton.class, Progress.class}, Void.TYPE).isSupported) {
            return;
        }
        if (5 == progress.f64785k) {
            cProgressButton.setVisibility(8);
        } else {
            cProgressButton.setVisibility(0);
            cProgressButton.f((int) (progress.f64781g * 100.0f));
        }
    }

    public void d(com.max.hbcommon.base.adapter.s.e eVar, GameObj gameObj, boolean z10) {
        if (PatchProxy.proxy(new Object[]{eVar, gameObj, new Byte(z10 ? (byte) 1 : (byte) 0)}, this, changeQuickRedirect, false, 35102, new Class[]{com.max.hbcommon.base.adapter.s.e.class, GameObj.class, Boolean.TYPE}, Void.TYPE).isSupported) {
            return;
        }
        e(eVar, gameObj, z10, null, null);
    }

    public void e(com.max.hbcommon.base.adapter.s.e eVar, GameObj gameObj, boolean z10, com.lzy.okserver.download.b bVar, Progress progress) {
        if (PatchProxy.proxy(new Object[]{eVar, gameObj, new Byte(z10 ? (byte) 1 : (byte) 0), bVar, progress}, this, changeQuickRedirect, false, 35103, new Class[]{com.max.hbcommon.base.adapter.s.e.class, GameObj.class, Boolean.TYPE, com.lzy.okserver.download.b.class, Progress.class}, Void.TYPE).isSupported) {
            return;
        }
        TextView textView = (TextView) eVar.i(R.id.tv_download);
        CProgressButton cProgressButton = (CProgressButton) eVar.i(R.id.cpb_download);
        Context context = eVar.b().getContext();
        String strE = com.max.xiaoheihe.module.game.c.e(gameObj);
        eVar.o(com.max.xiaoheihe.module.game.c.g(gameObj));
        this.f85532a.add(i(gameObj));
        if (gameObj.getHeybox_price() != null && !"1".equals(gameObj.getPurchased_state())) {
            textView.setVisibility(0);
            cProgressButton.setVisibility(8);
            textView.setText("购买");
            textView.setOnClickListener(new c(context, gameObj));
            return;
        }
        if (com.max.hbcommon.utils.c.u(strE)) {
            textView.setVisibility(0);
            cProgressButton.setVisibility(8);
            r1.m2(textView, gameObj.getFollow_state(), z10);
            textView.setOnClickListener(new d(textView, gameObj, z10));
            return;
        }
        String bundle_id = gameObj.getBundle_id();
        boolean zJ = com.max.xiaoheihe.module.game.c.j(com.max.xiaoheihe.module.game.c.f(context, bundle_id), gameObj.getVersion_num());
        boolean zI = com.max.xiaoheihe.module.game.c.i(bundle_id);
        if (zI && !zJ) {
            textView.setVisibility(0);
            cProgressButton.setVisibility(8);
            textView.setBackgroundResource(l(context, z10));
            textView.setTextColor(m(context, z10));
            textView.setText(context.getResources().getString(R.string.open_app));
            textView.setOnClickListener(new e(context, bundle_id));
            return;
        }
        if (bVar != null && progress != null) {
            p(eVar, gameObj, z10, bVar, progress);
            return;
        }
        com.lzy.okserver.download.b bVarC = com.max.xiaoheihe.module.game.c.c(gameObj);
        if (bVarC != null) {
            bVarC.q(new l(i(gameObj), eVar, gameObj, z10, bVarC)).q(new x1());
            p(eVar, gameObj, z10, bVarC, bVarC.f64853b);
            return;
        }
        textView.setVisibility(0);
        cProgressButton.setVisibility(8);
        textView.setBackgroundResource(j(context, z10));
        textView.setTextColor(k(context, z10));
        textView.setText(zI ? context.getResources().getString(R.string.update_app) : context.getResources().getString(R.string.download));
        textView.setOnClickListener(new f(eVar, gameObj, z10));
    }

    public void f() {
        if (PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 35104, new Class[0], Void.TYPE).isSupported) {
            return;
        }
        for (String str : this.f85532a) {
            Iterator<Map.Entry<String, com.lzy.okserver.download.b>> it = com.max.xiaoheihe.module.game.c.b().entrySet().iterator();
            while (it.hasNext()) {
                it.next().getValue().x(str);
            }
        }
        this.f85532a.clear();
        g();
    }

    public void r(com.max.hbcommon.base.adapter.s.e eVar, GameObj gameObj, boolean z10) {
        if (PatchProxy.proxy(new Object[]{eVar, gameObj, new Byte(z10 ? (byte) 1 : (byte) 0)}, this, changeQuickRedirect, false, 35107, new Class[]{com.max.hbcommon.base.adapter.s.e.class, GameObj.class, Boolean.TYPE}, Void.TYPE).isSupported) {
            return;
        }
        com.lzy.okserver.download.b bVarN = n(eVar, gameObj, z10);
        e(eVar, gameObj, z10, bVarN, bVarN.f64853b);
    }
}
