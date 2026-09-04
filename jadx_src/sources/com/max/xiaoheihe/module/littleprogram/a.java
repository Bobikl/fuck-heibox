package com.max.xiaoheihe.module.littleprogram;

import android.app.Dialog;
import android.content.Context;
import android.content.DialogInterface;
import android.text.Html;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.annotation.d1;
import com.google.gson.JsonObject;
import com.max.hbcommon.component.bottombutton.BottomButtonLeftItemView;
import com.max.hbcustomview.loadingdialog.LoadingDialog;
import com.max.hbminiprogram.bean.MiniProgramMenuInfoObj;
import com.max.hbminiprogram.bean.MiniProgramPageObj;
import com.max.hbminiprogram.fragment.BaseLittleProgramFragment;
import com.max.hbutils.bean.Result;
import com.max.xiaoheihe.R;
import com.max.xiaoheihe.bean.WebProtocolObj;
import com.max.xiaoheihe.module.littleprogram.view.MiniProgramBoardView;
import com.max.xiaoheihe.router.protocol.HeyboxWebProtocolHandler;
import com.max.xiaoheihe.utils.i0;
import com.max.xiaoheihe.utils.l0;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.PatchProxyResult;
import com.umeng.socialize.UMShareListener;
import com.umeng.socialize.bean.SHARE_MEDIA;
import java.util.Arrays;
import kotlin.jvm.internal.f0;
import kotlin.jvm.internal.u;
import kotlin.jvm.internal.v0;

/* JADX INFO: compiled from: MiniProgramMainOperation.kt */
/* JADX INFO: loaded from: classes11.dex */
@androidx.compose.runtime.internal.o(parameters = 0)
public final class a implements com.max.hbminiprogram.i {
    public static ChangeQuickRedirect changeQuickRedirect;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    @dl.d
    public static final C0809a f88711f = new C0809a(null);

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static final int f88712g = 8;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    @dl.d
    private static final String f88713h = "LittleProgramMainOperation";

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @dl.d
    private com.max.hbminiprogram.h f88714a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @dl.e
    private String f88715b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @dl.e
    private MiniProgramMenuInfoObj f88716c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @dl.e
    private LoadingDialog f88717d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    @dl.d
    private final UMShareListener f88718e;

    /* JADX INFO: renamed from: com.max.xiaoheihe.module.littleprogram.a$a, reason: collision with other inner class name */
    /* JADX INFO: compiled from: MiniProgramMainOperation.kt */
    public static final class C0809a {
        public static ChangeQuickRedirect changeQuickRedirect;

        private C0809a() {
        }

        public /* synthetic */ C0809a(u uVar) {
            this();
        }

        @dl.d
        public final String a() {
            PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 38614, new Class[0], String.class);
            return patchProxyResultProxy.isSupported ? (String) patchProxyResultProxy.result : a.f88713h;
        }
    }

    /* JADX INFO: compiled from: MiniProgramMainOperation.kt */
    public static final class b implements com.max.xiaoheihe.view.m {
        public static ChangeQuickRedirect changeQuickRedirect;

        b() {
        }

        @Override // com.max.xiaoheihe.view.m
        public void a(@dl.d Dialog dialog) {
            if (PatchProxy.proxy(new Object[]{dialog}, this, changeQuickRedirect, false, 38616, new Class[]{Dialog.class}, Void.TYPE).isSupported) {
                return;
            }
            f0.p(dialog, "dialog");
            com.max.xiaoheihe.utils.d.I1(a.this.h().getContext());
            dialog.dismiss();
        }

        @Override // com.max.xiaoheihe.view.m
        public void b(@dl.d Dialog dialog) {
            if (PatchProxy.proxy(new Object[]{dialog}, this, changeQuickRedirect, false, 38615, new Class[]{Dialog.class}, Void.TYPE).isSupported) {
                return;
            }
            f0.p(dialog, "dialog");
            dialog.dismiss();
        }
    }

    /* JADX INFO: compiled from: MiniProgramMainOperation.kt */
    public static final class c extends com.max.hbcommon.network.d<Result<MiniProgramPageObj>> {
        public static ChangeQuickRedirect changeQuickRedirect;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ String f88721c;

        c(String str) {
            this.f88721c = str;
        }

        public void onNext(@dl.d Result<MiniProgramPageObj> result) {
            if (PatchProxy.proxy(new Object[]{result}, this, changeQuickRedirect, false, 38617, new Class[]{Result.class}, Void.TYPE).isSupported) {
                return;
            }
            f0.p(result, "result");
            MiniProgramPageObj result2 = result.getResult();
            if (com.max.hbcommon.utils.c.x(result2 != null ? result2.is_v2() : null)) {
                a.this.v(result, this.f88721c);
            } else {
                a.this.u(result, this.f88721c);
            }
            super.onNext(result);
        }

        @Override // com.max.hbcommon.network.d, io.reactivex.g0
        public /* bridge */ /* synthetic */ void onNext(Object obj) {
            if (PatchProxy.proxy(new Object[]{obj}, this, changeQuickRedirect, false, 38618, new Class[]{Object.class}, Void.TYPE).isSupported) {
                return;
            }
            onNext((Result<MiniProgramPageObj>) obj);
        }
    }

    /* JADX INFO: compiled from: MiniProgramMainOperation.kt */
    public static final class d extends com.max.hbcommon.network.d<Result<MiniProgramMenuInfoObj>> {
        public static ChangeQuickRedirect changeQuickRedirect;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ com.max.hbminiprogram.c f88723c;

        d(com.max.hbminiprogram.c cVar) {
            this.f88723c = cVar;
        }

        @Override // com.max.hbcommon.network.d, io.reactivex.g0
        public void onError(@dl.d Throwable e10) {
            if (PatchProxy.proxy(new Object[]{e10}, this, changeQuickRedirect, false, 38620, new Class[]{Throwable.class}, Void.TYPE).isSupported) {
                return;
            }
            f0.p(e10, "e");
            this.f88723c.a(null);
        }

        public void onNext(@dl.d Result<MiniProgramMenuInfoObj> result) {
            if (PatchProxy.proxy(new Object[]{result}, this, changeQuickRedirect, false, 38619, new Class[]{Result.class}, Void.TYPE).isSupported) {
                return;
            }
            f0.p(result, "result");
            if (a.e(a.this)) {
                a.this.f88716c = result.getResult();
                this.f88723c.a(result.getResult());
                super.onNext(result);
            }
        }

        @Override // com.max.hbcommon.network.d, io.reactivex.g0
        public /* bridge */ /* synthetic */ void onNext(Object obj) {
            if (PatchProxy.proxy(new Object[]{obj}, this, changeQuickRedirect, false, 38621, new Class[]{Object.class}, Void.TYPE).isSupported) {
                return;
            }
            onNext((Result<MiniProgramMenuInfoObj>) obj);
        }
    }

    /* JADX INFO: compiled from: MiniProgramMainOperation.kt */
    public static final class e implements com.max.xiaoheihe.view.m {
        public static ChangeQuickRedirect changeQuickRedirect;

        e() {
        }

        @Override // com.max.xiaoheihe.view.m
        public void a(@dl.d Dialog dialog) {
            if (PatchProxy.proxy(new Object[]{dialog}, this, changeQuickRedirect, false, 38623, new Class[]{Dialog.class}, Void.TYPE).isSupported) {
                return;
            }
            f0.p(dialog, "dialog");
            a.this.k(dialog);
            a.this.r();
        }

        @Override // com.max.xiaoheihe.view.m
        public void b(@dl.d Dialog dialog) {
            if (PatchProxy.proxy(new Object[]{dialog}, this, changeQuickRedirect, false, 38622, new Class[]{Dialog.class}, Void.TYPE).isSupported) {
                return;
            }
            f0.p(dialog, "dialog");
            a.this.k(dialog);
        }
    }

    /* JADX INFO: compiled from: MiniProgramMainOperation.kt */
    public static final class f extends com.max.hbcommon.network.d<Result<Object>> {
        public static ChangeQuickRedirect changeQuickRedirect;

        f() {
        }

        @Override // com.max.hbcommon.network.d, io.reactivex.g0
        public void onError(@dl.d Throwable e10) {
            if (PatchProxy.proxy(new Object[]{e10}, this, changeQuickRedirect, false, 38624, new Class[]{Throwable.class}, Void.TYPE).isSupported) {
                return;
            }
            f0.p(e10, "e");
            super.onError(e10);
            a.this.l();
        }

        public void onNext(@dl.d Result<Object> result) {
            if (PatchProxy.proxy(new Object[]{result}, this, changeQuickRedirect, false, 38625, new Class[]{Result.class}, Void.TYPE).isSupported) {
                return;
            }
            f0.p(result, "result");
            a.this.l();
            a.this.q();
            super.onNext(result);
        }

        @Override // com.max.hbcommon.network.d, io.reactivex.g0
        public /* bridge */ /* synthetic */ void onNext(Object obj) {
            if (PatchProxy.proxy(new Object[]{obj}, this, changeQuickRedirect, false, 38626, new Class[]{Object.class}, Void.TYPE).isSupported) {
                return;
            }
            onNext((Result<Object>) obj);
        }
    }

    /* JADX INFO: compiled from: MiniProgramMainOperation.kt */
    public static final class g implements com.max.hbminiprogram.c {
        public static ChangeQuickRedirect changeQuickRedirect;

        g() {
        }

        @Override // com.max.hbminiprogram.c
        public final void a(@dl.e MiniProgramMenuInfoObj miniProgramMenuInfoObj) {
            if (PatchProxy.proxy(new Object[]{miniProgramMenuInfoObj}, this, changeQuickRedirect, false, 38627, new Class[]{MiniProgramMenuInfoObj.class}, Void.TYPE).isSupported) {
                return;
            }
            a.this.f88716c = miniProgramMenuInfoObj;
        }
    }

    /* JADX INFO: compiled from: MiniProgramMainOperation.kt */
    public static final class h extends com.max.hbcommon.network.d<Result<Object>> {
        public static ChangeQuickRedirect changeQuickRedirect;

        h() {
        }

        public void onNext(@dl.d Result<Object> result) {
            if (PatchProxy.proxy(new Object[]{result}, this, changeQuickRedirect, false, 38628, new Class[]{Result.class}, Void.TYPE).isSupported) {
                return;
            }
            f0.p(result, "result");
            a.this.q();
            a.this.l();
            super.onNext(result);
        }

        @Override // com.max.hbcommon.network.d, io.reactivex.g0
        public /* bridge */ /* synthetic */ void onNext(Object obj) {
            if (PatchProxy.proxy(new Object[]{obj}, this, changeQuickRedirect, false, 38629, new Class[]{Object.class}, Void.TYPE).isSupported) {
                return;
            }
            onNext((Result<Object>) obj);
        }
    }

    /* JADX INFO: compiled from: MiniProgramMainOperation.kt */
    public static final class i implements UMShareListener {
        public static ChangeQuickRedirect changeQuickRedirect;

        i() {
        }

        @Override // com.umeng.socialize.UMShareListener
        public void onCancel(@dl.e SHARE_MEDIA share_media) {
        }

        @Override // com.umeng.socialize.UMShareListener
        public void onError(@dl.e SHARE_MEDIA share_media, @dl.e Throwable th2) {
        }

        @Override // com.umeng.socialize.UMShareListener
        public void onResult(@dl.e SHARE_MEDIA share_media) {
        }

        @Override // com.umeng.socialize.UMShareListener
        public void onStart(@dl.e SHARE_MEDIA share_media) {
        }
    }

    /* JADX INFO: compiled from: MiniProgramMainOperation.kt */
    public static final class j implements View.OnClickListener {
        public static ChangeQuickRedirect changeQuickRedirect;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ com.max.hbcommon.component.i f88729c;

        j(com.max.hbcommon.component.i iVar) {
            this.f88729c = iVar;
        }

        @Override // android.view.View.OnClickListener
        public final void onClick(@dl.e View view) {
            if (PatchProxy.proxy(new Object[]{view}, this, changeQuickRedirect, false, 38630, new Class[]{View.class}, Void.TYPE).isSupported) {
                return;
            }
            a.f(a.this);
            a.this.k(this.f88729c);
        }
    }

    /* JADX INFO: compiled from: MiniProgramMainOperation.kt */
    public static final class k implements View.OnClickListener {
        public static ChangeQuickRedirect changeQuickRedirect;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ com.max.hbcommon.component.i f88731c;

        k(com.max.hbcommon.component.i iVar) {
            this.f88731c = iVar;
        }

        @Override // android.view.View.OnClickListener
        public final void onClick(@dl.e View view) {
            if (PatchProxy.proxy(new Object[]{view}, this, changeQuickRedirect, false, 38631, new Class[]{View.class}, Void.TYPE).isSupported) {
                return;
            }
            a.this.k(this.f88731c);
            a.this.p();
        }
    }

    /* JADX INFO: compiled from: MiniProgramMainOperation.kt */
    public static final class l implements View.OnClickListener {
        public static ChangeQuickRedirect changeQuickRedirect;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ com.max.hbcommon.component.i f88733c;

        l(com.max.hbcommon.component.i iVar) {
            this.f88733c = iVar;
        }

        @Override // android.view.View.OnClickListener
        public final void onClick(@dl.e View view) {
            if (PatchProxy.proxy(new Object[]{view}, this, changeQuickRedirect, false, 38632, new Class[]{View.class}, Void.TYPE).isSupported) {
                return;
            }
            a.this.k(this.f88733c);
        }
    }

    /* JADX INFO: compiled from: MiniProgramMainOperation.kt */
    public static final class m implements View.OnClickListener {
        public static ChangeQuickRedirect changeQuickRedirect;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ com.max.hbcommon.component.i f88735c;

        m(com.max.hbcommon.component.i iVar) {
            this.f88735c = iVar;
        }

        @Override // android.view.View.OnClickListener
        public final void onClick(@dl.e View view) {
            if (PatchProxy.proxy(new Object[]{view}, this, changeQuickRedirect, false, 38633, new Class[]{View.class}, Void.TYPE).isSupported) {
                return;
            }
            a.this.k(this.f88735c);
        }
    }

    /* JADX INFO: compiled from: MiniProgramMainOperation.kt */
    public static final class n implements DialogInterface.OnClickListener {
        public static ChangeQuickRedirect changeQuickRedirect;

        n() {
        }

        @Override // android.content.DialogInterface.OnClickListener
        public final void onClick(DialogInterface dialogInterface, int i10) {
            if (PatchProxy.proxy(new Object[]{dialogInterface, new Integer(i10)}, this, changeQuickRedirect, false, 38634, new Class[]{DialogInterface.class, Integer.TYPE}, Void.TYPE).isSupported) {
                return;
            }
            a.f(a.this);
            dialogInterface.dismiss();
        }
    }

    /* JADX INFO: compiled from: MiniProgramMainOperation.kt */
    public static final class o implements DialogInterface.OnClickListener {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public static final o f88737b = new o();
        public static ChangeQuickRedirect changeQuickRedirect;

        o() {
        }

        @Override // android.content.DialogInterface.OnClickListener
        public final void onClick(DialogInterface dialogInterface, int i10) {
            if (PatchProxy.proxy(new Object[]{dialogInterface, new Integer(i10)}, this, changeQuickRedirect, false, 38635, new Class[]{DialogInterface.class, Integer.TYPE}, Void.TYPE).isSupported) {
                return;
            }
            dialogInterface.dismiss();
        }
    }

    /* JADX INFO: compiled from: MiniProgramMainOperation.kt */
    public static final class p implements DialogInterface.OnClickListener {
        public static ChangeQuickRedirect changeQuickRedirect;

        p() {
        }

        @Override // android.content.DialogInterface.OnClickListener
        public final void onClick(DialogInterface dialogInterface, int i10) {
            if (PatchProxy.proxy(new Object[]{dialogInterface, new Integer(i10)}, this, changeQuickRedirect, false, 38636, new Class[]{DialogInterface.class, Integer.TYPE}, Void.TYPE).isSupported) {
                return;
            }
            dialogInterface.dismiss();
            a.this.p();
        }
    }

    /* JADX INFO: compiled from: MiniProgramMainOperation.kt */
    public static final class q implements DialogInterface.OnClickListener {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public static final q f88739b = new q();
        public static ChangeQuickRedirect changeQuickRedirect;

        q() {
        }

        @Override // android.content.DialogInterface.OnClickListener
        public final void onClick(DialogInterface dialogInterface, int i10) {
            if (PatchProxy.proxy(new Object[]{dialogInterface, new Integer(i10)}, this, changeQuickRedirect, false, 38637, new Class[]{DialogInterface.class, Integer.TYPE}, Void.TYPE).isSupported) {
                return;
            }
            dialogInterface.dismiss();
        }
    }

    public a(@dl.d com.max.hbminiprogram.h miniProgramContext, @dl.e String str) {
        f0.p(miniProgramContext, "miniProgramContext");
        this.f88714a = miniProgramContext;
        this.f88715b = str;
        this.f88718e = new i();
    }

    public static final /* synthetic */ boolean e(a aVar) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{aVar}, null, changeQuickRedirect, true, 38613, new Class[]{a.class}, Boolean.TYPE);
        return patchProxyResultProxy.isSupported ? ((Boolean) patchProxyResultProxy.result).booleanValue() : aVar.m();
    }

    public static final /* synthetic */ void f(a aVar) {
        if (PatchProxy.proxy(new Object[]{aVar}, null, changeQuickRedirect, true, 38612, new Class[]{a.class}, Void.TYPE).isSupported) {
            return;
        }
        aVar.s();
    }

    private final String j(@d1 int i10) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{new Integer(i10)}, this, changeQuickRedirect, false, 38611, new Class[]{Integer.TYPE}, String.class);
        if (patchProxyResultProxy.isSupported) {
            return (String) patchProxyResultProxy.result;
        }
        String string = this.f88714a.getContext().getString(i10);
        f0.o(string, "miniProgramContext.getContext().getString(value)");
        return string;
    }

    private final boolean m() {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 38595, new Class[0], Boolean.TYPE);
        if (patchProxyResultProxy.isSupported) {
            return ((Boolean) patchProxyResultProxy.result).booleanValue();
        }
        return (this.f88714a.isFinishing() || this.f88714a.isDestroyed()) ? false : true;
    }

    private final void s() {
        if (PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 38597, new Class[0], Void.TYPE).isSupported) {
            return;
        }
        HeyboxWebProtocolHandler heyboxWebProtocolHandler = l0.f95687b;
        Context context = this.f88714a.getContext();
        WebProtocolObj webProtocolObjY = l0.y(BaseLittleProgramFragment.f71250k, null, false, false, true, false, false);
        f0.o(webProtocolObjY, "getOpenRouterPathProtoco…      false\n            )");
        heyboxWebProtocolHandler.C(context, null, webProtocolObjY, null);
    }

    @Override // com.max.hbminiprogram.i
    public void a(@dl.e String str) {
        if (PatchProxy.proxy(new Object[]{str}, this, changeQuickRedirect, false, 38601, new Class[]{String.class}, Void.TYPE).isSupported || TextUtils.isEmpty(str) || TextUtils.isEmpty(this.f88715b)) {
            return;
        }
        Context context = this.f88714a.getContext();
        v0 v0Var = v0.f124986a;
        String str2 = String.format(j(R.string.remove_miniprogram), Arrays.copyOf(new Object[]{str}, 1));
        f0.o(str2, "format(format, *args)");
        com.max.xiaoheihe.view.l.D(context, str2, "", j(R.string.confirm_remove), j(R.string.cancel), new e());
    }

    @Override // com.max.hbminiprogram.i
    public void b(@dl.d com.max.hbminiprogram.c callback) {
        if (PatchProxy.proxy(new Object[]{callback}, this, changeQuickRedirect, false, 38604, new Class[]{com.max.hbminiprogram.c.class}, Void.TYPE).isSupported) {
            return;
        }
        f0.p(callback, "callback");
        com.max.hbcommon.utils.d.b(f88713h, "getMiniProgramShareInfo, miniProgramId = " + this.f88715b + ", mMenuInfoObj = " + this.f88716c);
        if (TextUtils.isEmpty(this.f88715b)) {
            callback.a(null);
            return;
        }
        MiniProgramMenuInfoObj miniProgramMenuInfoObj = this.f88716c;
        if (miniProgramMenuInfoObj != null) {
            callback.a(miniProgramMenuInfoObj);
        } else {
            this.f88714a.V((io.reactivex.disposables.b) com.max.xiaoheihe.network.i.a().g7(this.f88715b).I5(io.reactivex.schedulers.b.d()).a4(io.reactivex.android.schedulers.a.c()).J5(new d(callback)));
        }
    }

    @Override // com.max.hbminiprogram.i
    public void c(@dl.e String str) {
        if (PatchProxy.proxy(new Object[]{str}, this, changeQuickRedirect, false, 38596, new Class[]{String.class}, Void.TYPE).isSupported) {
            return;
        }
        if (!i0.s()) {
            com.max.xiaoheihe.view.l.D(this.f88714a.getContext(), "", com.max.xiaoheihe.utils.d.n0(R.string.need_login_to_use), "去登录", "取消", new b());
        } else {
            if (TextUtils.isEmpty(str) || TextUtils.isEmpty(this.f88715b)) {
                return;
            }
            this.f88714a.V((io.reactivex.disposables.b) com.max.xiaoheihe.network.i.a().Hb(this.f88715b).I5(io.reactivex.schedulers.b.d()).a4(io.reactivex.android.schedulers.a.c()).J5(new c(str)));
        }
    }

    @dl.d
    public final com.max.hbminiprogram.h h() {
        return this.f88714a;
    }

    @dl.d
    public final UMShareListener i() {
        return this.f88718e;
    }

    public final void k(@dl.e Dialog dialog) {
        if (PatchProxy.proxy(new Object[]{dialog}, this, changeQuickRedirect, false, 38605, new Class[]{Dialog.class}, Void.TYPE).isSupported || !m() || dialog == null) {
            return;
        }
        dialog.dismiss();
    }

    public final void l() {
        LoadingDialog loadingDialog;
        if (PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 38607, new Class[0], Void.TYPE).isSupported || !m() || (loadingDialog = this.f88717d) == null) {
            return;
        }
        loadingDialog.c();
    }

    public final void n(@dl.e String str, @dl.e String str2) {
        if (PatchProxy.proxy(new Object[]{str, str2}, this, changeQuickRedirect, false, 38609, new Class[]{String.class, String.class}, Void.TYPE).isSupported || com.max.hbcommon.utils.c.u(str)) {
            return;
        }
        JsonObject jsonObject = new JsonObject();
        jsonObject.addProperty("mini_app_id", str);
        if (str2 != null) {
            jsonObject.addProperty("source", str2);
        }
        com.max.hbcommon.analytics.d.e("4", lb.d.f131182i5, null, null, jsonObject, null, true);
    }

    public final void o(@dl.e String str, @dl.e String str2) {
        if (PatchProxy.proxy(new Object[]{str, str2}, this, changeQuickRedirect, false, 38608, new Class[]{String.class, String.class}, Void.TYPE).isSupported || com.max.hbcommon.utils.c.u(str)) {
            return;
        }
        JsonObject jsonObject = new JsonObject();
        jsonObject.addProperty("mini_app_id", str);
        if (str2 != null) {
            jsonObject.addProperty("source", str2);
        }
        com.max.hbcommon.analytics.d.e("1", lb.d.f131175h5, null, null, jsonObject, null, false);
    }

    public final void p() {
        if (PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 38600, new Class[0], Void.TYPE).isSupported) {
            return;
        }
        x();
        this.f88714a.V((io.reactivex.disposables.b) com.max.xiaoheihe.network.i.a().Wb(this.f88715b).I5(io.reactivex.schedulers.b.d()).a4(io.reactivex.android.schedulers.a.c()).J5(new f()));
    }

    public final void q() {
        if (PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 38603, new Class[0], Void.TYPE).isSupported) {
            return;
        }
        this.f88716c = null;
        b(new g());
    }

    public final void r() {
        if (PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 38602, new Class[0], Void.TYPE).isSupported) {
            return;
        }
        x();
        this.f88714a.V((io.reactivex.disposables.b) com.max.xiaoheihe.network.i.a().j5(this.f88715b).I5(io.reactivex.schedulers.b.d()).a4(io.reactivex.android.schedulers.a.c()).J5(new h()));
    }

    public final void t(@dl.d com.max.hbminiprogram.h hVar) {
        if (PatchProxy.proxy(new Object[]{hVar}, this, changeQuickRedirect, false, 38594, new Class[]{com.max.hbminiprogram.h.class}, Void.TYPE).isSupported) {
            return;
        }
        f0.p(hVar, "<set-?>");
        this.f88714a = hVar;
    }

    public final void u(@dl.d Result<MiniProgramPageObj> result, @dl.e String str) {
        if (PatchProxy.proxy(new Object[]{result, str}, this, changeQuickRedirect, false, 38598, new Class[]{Result.class, String.class}, Void.TYPE).isSupported) {
            return;
        }
        f0.p(result, "result");
        if (!m() || TextUtils.isEmpty(str) || TextUtils.isEmpty(this.f88715b)) {
            return;
        }
        MiniProgramPageObj result2 = result.getResult();
        boolean zEquals = Boolean.TRUE.equals(result2 != null ? result2.getMy_app_is_full() : null);
        View viewInflate = LayoutInflater.from(this.f88714a.getContext()).inflate(R.layout.layout_little_program_items_card, (ViewGroup) null);
        f0.n(viewInflate, "null cannot be cast to non-null type android.view.ViewGroup");
        ViewGroup viewGroup = (ViewGroup) viewInflate;
        com.max.hbcommon.component.i iVar = new com.max.hbcommon.component.i(this.f88714a.getContext(), viewGroup);
        BottomButtonLeftItemView bottomButtonLeftItemView = (BottomButtonLeftItemView) viewGroup.findViewById(R.id.bb_cancel);
        View viewFindViewById = viewGroup.findViewById(R.id.v_out);
        TextView textView = (TextView) viewGroup.findViewById(R.id.title);
        if (zEquals) {
            textView.setText(j(R.string.limit_miniprogram));
            bottomButtonLeftItemView.setRightText(j(R.string.manage_miniprogram));
            bottomButtonLeftItemView.setRightClickListener(new j(iVar));
        } else {
            v0 v0Var = v0.f124986a;
            String str2 = String.format(j(R.string.add_to_miniprogram), Arrays.copyOf(new Object[]{str}, 1));
            f0.o(str2, "format(format, *args)");
            textView.setText(Html.fromHtml(str2));
            bottomButtonLeftItemView.setRightText(j(R.string.confirm));
            bottomButtonLeftItemView.setRightClickListener(new k(iVar));
        }
        MiniProgramBoardView miniProgramBoardView = (MiniProgramBoardView) viewGroup.findViewById(R.id.items_container);
        String str3 = this.f88715b;
        f0.m(str3);
        miniProgramBoardView.setData(result2, str3, zEquals);
        bottomButtonLeftItemView.setLeftClickListener(new l(iVar));
        viewFindViewById.setOnClickListener(new m(iVar));
        iVar.show();
    }

    public final void v(@dl.d Result<MiniProgramPageObj> result, @dl.e String str) {
        if (PatchProxy.proxy(new Object[]{result, str}, this, changeQuickRedirect, false, 38599, new Class[]{Result.class, String.class}, Void.TYPE).isSupported) {
            return;
        }
        f0.p(result, "result");
        MiniProgramPageObj result2 = result.getResult();
        if (result2 != null ? f0.g(result2.getMy_app_is_full(), Boolean.TRUE) : false) {
            new com.max.hbcommon.view.a.f(this.f88714a.getContext()).y(j(R.string.limit_miniprogram)).t(R.string.manage_miniprogram, new n()).n(R.string.cancel, o.f88737b).F();
            return;
        }
        com.max.hbcommon.view.a.f fVar = new com.max.hbcommon.view.a.f(this.f88714a.getContext());
        v0 v0Var = v0.f124986a;
        String str2 = String.format(j(R.string.add_to_miniprogram), Arrays.copyOf(new Object[]{str}, 1));
        f0.o(str2, "format(format, *args)");
        fVar.y(Html.fromHtml(str2)).t(R.string.confirm, new p()).n(R.string.cancel, q.f88739b).F();
    }

    public final void w(@dl.d Context context, @dl.e String str) {
        if (PatchProxy.proxy(new Object[]{context, str}, this, changeQuickRedirect, false, 38610, new Class[]{Context.class, String.class}, Void.TYPE).isSupported) {
            return;
        }
        f0.p(context, "context");
        com.max.hbminiprogram.utils.b.h(context, str, this.f88716c, false, null, null, null);
    }

    public final void x() {
        if (!PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 38606, new Class[0], Void.TYPE).isSupported && m()) {
            LoadingDialog loadingDialog = this.f88717d;
            if (loadingDialog != null) {
                if (loadingDialog != null && true == loadingDialog.i()) {
                    return;
                }
            }
            this.f88717d = new LoadingDialog(this.f88714a.getContext(), "", false).r();
        }
    }
}
