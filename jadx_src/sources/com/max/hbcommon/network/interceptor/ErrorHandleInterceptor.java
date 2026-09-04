package com.max.hbcommon.network.interceptor;

import android.app.Activity;
import android.content.Context;
import android.content.DialogInterface;
import android.graphics.Bitmap;
import android.graphics.drawable.GradientDrawable;
import android.os.Handler;
import android.os.Looper;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.EditText;
import android.widget.ImageView;
import com.max.hbcommon.R;
import com.max.hbcommon.bean.AuthCodeObj;
import com.max.hbcommon.bean.RequestTagMapObj;
import com.max.hbcommon.network.ApiException;
import com.max.hbutils.bean.Result;
import com.max.hbutils.utils.q;
import com.max.xiaoheihe.bean.game.GameObj;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.PatchProxyResult;
import com.umeng.message.common.inter.ITagManager;
import java.io.EOFException;
import java.io.IOException;
import java.nio.charset.Charset;
import java.nio.charset.UnsupportedCharsetException;
import java.util.concurrent.Semaphore;
import kotlin.b2;
import kotlin.jvm.internal.Ref;
import kotlin.jvm.internal.f0;
import okhttp3.a0;
import okhttp3.c0;
import okhttp3.d0;
import okhttp3.s;
import okhttp3.t;
import okhttp3.u;
import okhttp3.v;
import okio.Buffer;
import okio.BufferedSource;

/* JADX INFO: compiled from: ErrorHandleInterceptor.kt */
/* JADX INFO: loaded from: classes9.dex */
public final class ErrorHandleInterceptor implements u {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @dl.d
    public static final a f68092a = new a(null);

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @dl.d
    public static final String f68093c = "auth";
    public static ChangeQuickRedirect changeQuickRedirect = null;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @dl.d
    public static final String f68094d = "show_captcha";

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    @dl.d
    public static final String f68095e = "without_pass";

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    @dl.d
    public static final String f68096f = "verify_pay";

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    @dl.d
    public static final String f68097g = "alert";

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    @dl.d
    public static final String f68098h = "need_bind_phone";

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    @dl.d
    public static final String f68099i = "heybox__protocol__execute__directly";

    /* JADX INFO: compiled from: ErrorHandleInterceptor.kt */
    public static final class a {
        public static ChangeQuickRedirect changeQuickRedirect;

        private a() {
        }

        public /* synthetic */ a(kotlin.jvm.internal.u uVar) {
            this();
        }

        @xh.m
        public final boolean a(@dl.e String str) {
            PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{str}, this, changeQuickRedirect, false, bb.c.e.f31910me, new Class[]{String.class}, Boolean.TYPE);
            if (patchProxyResultProxy.isSupported) {
                return ((Boolean) patchProxyResultProxy.result).booleanValue();
            }
            return f0.g(ITagManager.SUCCESS, str) || f0.g("auth", str) || f0.g(ErrorHandleInterceptor.f68094d, str) || f0.g(ErrorHandleInterceptor.f68095e, str) || f0.g(ErrorHandleInterceptor.f68096f, str) || f0.g("alert", str);
        }
    }

    /* JADX INFO: compiled from: ErrorHandleInterceptor.kt */
    public interface b {
        void a();

        void b(@dl.d String str, @dl.e String str2);
    }

    /* JADX INFO: compiled from: ErrorHandleInterceptor.kt */
    public static final class c implements com.max.hbcommon.network.m.b {
        public static ChangeQuickRedirect changeQuickRedirect;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ String f68101b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ String f68102c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        final /* synthetic */ AuthCodeObj f68103d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        final /* synthetic */ Ref.ObjectRef<Semaphore> f68104e;

        /* JADX INFO: compiled from: ErrorHandleInterceptor.kt */
        public static final class a implements b {
            public static ChangeQuickRedirect changeQuickRedirect;

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            final /* synthetic */ AuthCodeObj f68105a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            final /* synthetic */ String f68106b;

            /* JADX INFO: renamed from: c, reason: collision with root package name */
            final /* synthetic */ Ref.ObjectRef<Semaphore> f68107c;

            a(AuthCodeObj authCodeObj, String str, Ref.ObjectRef<Semaphore> objectRef) {
                this.f68105a = authCodeObj;
                this.f68106b = str;
                this.f68107c = objectRef;
            }

            @Override // com.max.hbcommon.network.interceptor.ErrorHandleInterceptor.b
            public void a() {
                if (PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, bb.c.e.f31978qe, new Class[0], Void.TYPE).isSupported) {
                    return;
                }
                this.f68107c.f124891b.release();
            }

            @Override // com.max.hbcommon.network.interceptor.ErrorHandleInterceptor.b
            public void b(@dl.d String code, @dl.e String str) {
                if (PatchProxy.proxy(new Object[]{code, str}, this, changeQuickRedirect, false, bb.c.e.f31961pe, new Class[]{String.class, String.class}, Void.TYPE).isSupported) {
                    return;
                }
                f0.p(code, "code");
                this.f68105a.setUser_code(code);
                AuthCodeObj authCodeObj = this.f68105a;
                if (str == null) {
                    str = this.f68106b;
                }
                authCodeObj.setHeaders(str);
                this.f68107c.f124891b.release();
            }
        }

        c(String str, String str2, AuthCodeObj authCodeObj, Ref.ObjectRef<Semaphore> objectRef) {
            this.f68101b = str;
            this.f68102c = str2;
            this.f68103d = authCodeObj;
            this.f68104e = objectRef;
        }

        @Override // com.max.hbcommon.network.m.b
        public void a(@dl.e Exception exc) {
            if (PatchProxy.proxy(new Object[]{exc}, this, changeQuickRedirect, false, bb.c.e.f31944oe, new Class[]{Exception.class}, Void.TYPE).isSupported) {
                return;
            }
            this.f68104e.f124891b.release();
        }

        @Override // com.max.hbcommon.network.m.b
        public void b(@dl.e Bitmap bitmap, @dl.e String str) {
            if (PatchProxy.proxy(new Object[]{bitmap, str}, this, changeQuickRedirect, false, bb.c.e.f31927ne, new Class[]{Bitmap.class, String.class}, Void.TYPE).isSupported) {
                return;
            }
            ErrorHandleInterceptor.this.x(this.f68101b, this.f68102c, bitmap, new a(this.f68103d, str, this.f68104e));
        }
    }

    /* JADX INFO: compiled from: ErrorHandleInterceptor.kt */
    public static final class d implements qb.b.InterfaceC1257b {
        public static ChangeQuickRedirect changeQuickRedirect;

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ qb.a f68108a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ Ref.ObjectRef<Semaphore> f68109b;

        d(qb.a aVar, Ref.ObjectRef<Semaphore> objectRef) {
            this.f68108a = aVar;
            this.f68109b = objectRef;
        }

        @Override // qb.b.InterfaceC1257b
        public void a(@dl.d qb.a captchaResult) {
            if (PatchProxy.proxy(new Object[]{captchaResult}, this, changeQuickRedirect, false, bb.c.e.f31995re, new Class[]{qb.a.class}, Void.TYPE).isSupported) {
                return;
            }
            f0.p(captchaResult, "captchaResult");
            this.f68108a.d(qb.a.f138641d);
            this.f68108a.e(captchaResult.b());
            this.f68108a.f(captchaResult.c());
            this.f68109b.f124891b.release();
        }

        @Override // qb.b.InterfaceC1257b
        public void b() {
            if (PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, bb.c.e.f32012se, new Class[0], Void.TYPE).isSupported) {
                return;
            }
            this.f68109b.f124891b.release();
        }
    }

    /* JADX INFO: compiled from: ErrorHandleInterceptor.kt */
    public static final class e implements b {
        public static ChangeQuickRedirect changeQuickRedirect;

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ AuthCodeObj f68110a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ Ref.ObjectRef<Semaphore> f68111b;

        e(AuthCodeObj authCodeObj, Ref.ObjectRef<Semaphore> objectRef) {
            this.f68110a = authCodeObj;
            this.f68111b = objectRef;
        }

        @Override // com.max.hbcommon.network.interceptor.ErrorHandleInterceptor.b
        public void a() {
            if (PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, bb.c.e.f32046ue, new Class[0], Void.TYPE).isSupported) {
                return;
            }
            this.f68111b.f124891b.release();
        }

        @Override // com.max.hbcommon.network.interceptor.ErrorHandleInterceptor.b
        public void b(@dl.d String code, @dl.e String str) {
            if (PatchProxy.proxy(new Object[]{code, str}, this, changeQuickRedirect, false, bb.c.e.f32029te, new Class[]{String.class, String.class}, Void.TYPE).isSupported) {
                return;
            }
            f0.p(code, "code");
            this.f68110a.setUser_code(code);
            this.f68111b.f124891b.release();
        }
    }

    /* JADX INFO: compiled from: ErrorHandleInterceptor.kt */
    public static final class f implements qb.b.a {
        public static ChangeQuickRedirect changeQuickRedirect;

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ AuthCodeObj f68112a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ Ref.ObjectRef<Semaphore> f68113b;

        f(AuthCodeObj authCodeObj, Ref.ObjectRef<Semaphore> objectRef) {
            this.f68112a = authCodeObj;
            this.f68113b = objectRef;
        }

        @Override // qb.b.a
        public void a() {
            if (PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, bb.c.e.f32063ve, new Class[0], Void.TYPE).isSupported) {
                return;
            }
            this.f68112a.setUser_code("pay_verify");
            this.f68113b.f124891b.release();
        }

        @Override // qb.b.a
        public void onCanceled() {
            if (PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, bb.c.e.f32080we, new Class[0], Void.TYPE).isSupported) {
                return;
            }
            this.f68113b.f124891b.release();
        }
    }

    /* JADX INFO: compiled from: ErrorHandleInterceptor.kt */
    public static final class g implements com.max.hbcommon.network.m.b {
        public static ChangeQuickRedirect changeQuickRedirect;

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ ImageView f68114a;

        g(ImageView imageView) {
            this.f68114a = imageView;
        }

        @Override // com.max.hbcommon.network.m.b
        public void a(@dl.e Exception exc) {
        }

        @Override // com.max.hbcommon.network.m.b
        public void b(@dl.e Bitmap bitmap, @dl.e String str) {
            if (PatchProxy.proxy(new Object[]{bitmap, str}, this, changeQuickRedirect, false, bb.c.e.De, new Class[]{Bitmap.class, String.class}, Void.TYPE).isSupported) {
                return;
            }
            this.f68114a.setImageBitmap(bitmap);
            this.f68114a.setTag(str);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void A(String str, ImageView iv_captcha, View view) {
        if (PatchProxy.proxy(new Object[]{str, iv_captcha, view}, null, changeQuickRedirect, true, bb.c.e.f31876ke, new Class[]{String.class, ImageView.class, View.class}, Void.TYPE).isSupported) {
            return;
        }
        f0.p(iv_captcha, "$iv_captcha");
        new com.max.hbcommon.network.m(new g(iv_captcha)).c(str);
    }

    private final boolean l(s sVar) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{sVar}, this, changeQuickRedirect, false, bb.c.e.Xd, new Class[]{s.class}, Boolean.TYPE);
        if (patchProxyResultProxy.isSupported) {
            return ((Boolean) patchProxyResultProxy.result).booleanValue();
        }
        String strE = sVar.e("Content-Encoding");
        return (strE == null || kotlin.text.u.L1(strE, "identity", true)) ? false : true;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v42, types: [T, java.util.concurrent.Semaphore] */
    /* JADX WARN: Type inference failed for: r1v3, types: [T, okhttp3.d0] */
    /* JADX WARN: Type inference failed for: r2v27, types: [T, java.util.concurrent.Semaphore] */
    /* JADX WARN: Type inference failed for: r3v12, types: [T, java.util.concurrent.Semaphore] */
    /* JADX WARN: Type inference failed for: r3v15, types: [T, java.util.concurrent.Semaphore] */
    private final c0 m(final u.a aVar, final a0 a0Var) throws IOException {
        String status;
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{aVar, a0Var}, this, changeQuickRedirect, false, bb.c.e.Wd, new Class[]{u.a.class, a0.class}, c0.class);
        if (patchProxyResultProxy.isSupported) {
            return (c0) patchProxyResultProxy.result;
        }
        c0 c0VarProceed = aVar.proceed(a0Var);
        final Ref.ObjectRef objectRef = new Ref.ObjectRef();
        ?? Q = c0VarProceed.q();
        objectRef.f124891b = Q;
        Long lValueOf = Q != 0 ? Long.valueOf(Q.getContentLength()) : null;
        if (!l(c0VarProceed.getHeaders())) {
            d0 d0Var = (d0) objectRef.f124891b;
            BufferedSource source = d0Var != null ? d0Var.getSource() : null;
            if (source != null) {
                source.request(Long.MAX_VALUE);
            }
            Buffer buffer = source != null ? source.getBuffer() : null;
            Charset charset = kotlin.text.d.f128566b;
            d0 d0Var2 = (d0) objectRef.f124891b;
            v f132480d = d0Var2 != null ? d0Var2.getF132480d() : null;
            if (f132480d != null) {
                try {
                    Charset charsetF = f132480d.f(charset);
                    if (charsetF != null) {
                        charset = charsetF;
                    }
                } catch (UnsupportedCharsetException unused) {
                    return c0VarProceed;
                }
            }
            if (buffer != null && v(buffer) && (lValueOf == null || lValueOf.longValue() != 0)) {
                String string = buffer.clone().readString(charset);
                com.max.hbcommon.utils.d.a("zzzzrequest = " + string);
                final Ref.ObjectRef objectRef2 = new Ref.ObjectRef();
                yh.a<b2> aVar2 = new yh.a<b2>() { // from class: com.max.hbcommon.network.interceptor.ErrorHandleInterceptor$handleRequest$cancel$1
                    public static ChangeQuickRedirect changeQuickRedirect;

                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    {
                        super(0);
                    }

                    /* JADX WARN: Type inference failed for: r0v3, types: [java.lang.Object, kotlin.b2] */
                    @Override // yh.a
                    public /* bridge */ /* synthetic */ b2 invoke() {
                        PatchProxyResult patchProxyResultProxy2 = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, bb.c.e.Ce, new Class[0], Object.class);
                        if (patchProxyResultProxy2.isSupported) {
                            return patchProxyResultProxy2.result;
                        }
                        invoke2();
                        return b2.f124493a;
                    }

                    /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
                    public final void invoke2() {
                        RequestTagMapObj requestTagMapObj;
                        d0 d0Var3;
                        boolean z10 = false;
                        if (PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, bb.c.e.Be, new Class[0], Void.TYPE).isSupported) {
                            return;
                        }
                        String strE = null;
                        if (a0Var.p(RequestTagMapObj.class) != null) {
                            try {
                                requestTagMapObj = (RequestTagMapObj) a0Var.p(RequestTagMapObj.class);
                            } catch (Exception e10) {
                                com.max.heybox.hblog.g gVarZ = com.max.heybox.hblog.g.f74531b.z();
                                if (gVarZ != null) {
                                    gVarZ.K(e10);
                                }
                                requestTagMapObj = null;
                            }
                        } else {
                            requestTagMapObj = null;
                        }
                        if (requestTagMapObj != null && com.max.hbcommon.utils.c.x(requestTagMapObj.get(com.max.hbcommon.network.b.f68050g))) {
                            z10 = true;
                        }
                        if (z10 && (d0Var3 = objectRef.f124891b) != null) {
                            Ref.ObjectRef<String> objectRef3 = objectRef2;
                            Object objA = com.max.hbutils.utils.k.a(d0Var3.string(), Result.class);
                            f0.o(objA, "deserialize(...)");
                            Result result = (Result) objA;
                            if (!result.isOk()) {
                                if (!com.max.hbcommon.utils.c.u(result.getProtocol())) {
                                    strE = result.getProtocol();
                                } else if (result.getResult() != null) {
                                    strE = com.max.hbutils.utils.k.e(com.max.hbutils.utils.k.p(result.getResult()), ErrorHandleInterceptor.f68099i);
                                }
                                String str = strE;
                                String status2 = result.getStatus();
                                String msg = objectRef3.f124891b;
                                if (msg == null) {
                                    msg = result.getMsg();
                                }
                                throw new ApiException(status2, msg, result.getReferer_path(), str, result);
                            }
                        }
                        aVar.call().cancel();
                    }
                };
                final Result result = (Result) com.max.hbutils.utils.k.a(string, Result.class);
                if (result != null && (status = result.getStatus()) != null) {
                    switch (status.hashCode()) {
                        case -1783473880:
                            if (status.equals(f68095e)) {
                                objectRef2.f124891b = "确认免密支付流程失败";
                                String strE = com.max.hbutils.utils.k.e(string, "result");
                                final String strE2 = com.max.hbutils.utils.k.e(strE, "show_title");
                                final String strE3 = com.max.hbutils.utils.k.e(strE, GameObj.KEY_POINT_PRICE);
                                final Ref.ObjectRef objectRef3 = new Ref.ObjectRef();
                                objectRef3.f124891b = new Semaphore(0);
                                final AuthCodeObj authCodeObj = new AuthCodeObj();
                                new Handler(Looper.getMainLooper()).post(new Runnable() { // from class: com.max.hbcommon.network.interceptor.c
                                    @Override // java.lang.Runnable
                                    public final void run() {
                                        ErrorHandleInterceptor.o(strE2, strE3, authCodeObj, objectRef3);
                                    }
                                });
                                try {
                                    ((Semaphore) objectRef3.f124891b).acquire();
                                    break;
                                } catch (InterruptedException unused2) {
                                }
                                if (f0.g("pay_confirm", authCodeObj.getUser_code())) {
                                    t.a aVarH = a0Var.q().H();
                                    ob.a.k().b(aVarH, a0Var.q().x());
                                    aVarH.W("pay_confirm", "1");
                                    return m(aVar, a0Var.n().D(aVarH.h()).b());
                                }
                                aVar2.invoke();
                            }
                            break;
                        case -1032682526:
                            if (status.equals(f68096f)) {
                                objectRef2.f124891b = "验证密码流程失败";
                                String strE4 = com.max.hbutils.utils.k.e(string, "result");
                                final String strE5 = com.max.hbutils.utils.k.e(strE4, "show_title");
                                final String strE6 = com.max.hbutils.utils.k.e(strE4, GameObj.KEY_POINT_PRICE);
                                final Ref.ObjectRef objectRef4 = new Ref.ObjectRef();
                                objectRef4.f124891b = new Semaphore(0);
                                final AuthCodeObj authCodeObj2 = new AuthCodeObj();
                                new Handler(Looper.getMainLooper()).post(new Runnable() { // from class: com.max.hbcommon.network.interceptor.d
                                    @Override // java.lang.Runnable
                                    public final void run() {
                                        ErrorHandleInterceptor.p(strE5, strE6, authCodeObj2, objectRef4);
                                    }
                                });
                                try {
                                    ((Semaphore) objectRef4.f124891b).acquire();
                                    break;
                                } catch (InterruptedException unused3) {
                                }
                                if (f0.g("pay_verify", authCodeObj2.getUser_code())) {
                                    t.a aVarH2 = a0Var.q().H();
                                    ob.a.k().b(aVarH2, a0Var.q().x());
                                    return m(aVar, a0Var.n().D(aVarH2.h()).b());
                                }
                                aVar2.invoke();
                            }
                            break;
                        case 3005864:
                            if (status.equals("auth")) {
                                objectRef2.f124891b = "验证失败";
                                String strE7 = com.max.hbutils.utils.k.e(string, "result");
                                String strE8 = com.max.hbutils.utils.k.e(strE7, "captcha_url");
                                String strE9 = com.max.hbutils.utils.k.e(strE7, "verify_reason");
                                Ref.ObjectRef objectRef5 = new Ref.ObjectRef();
                                objectRef5.f124891b = new Semaphore(0);
                                AuthCodeObj authCodeObj3 = new AuthCodeObj();
                                new com.max.hbcommon.network.m(new c(strE8, strE9, authCodeObj3, objectRef5)).c(strE8);
                                try {
                                    ((Semaphore) objectRef5.f124891b).acquire();
                                    break;
                                } catch (InterruptedException unused4) {
                                }
                                if (authCodeObj3.getUser_code() != null && authCodeObj3.getHeaders() != null) {
                                    t.a aVarH3 = a0Var.q().H();
                                    ob.a.k().b(aVarH3, a0Var.q().x());
                                    aVarH3.W("auth_code", authCodeObj3.getUser_code());
                                    a0.a aVarN = a0Var.n();
                                    String headers = authCodeObj3.getHeaders();
                                    f0.o(headers, "getHeaders(...)");
                                    return m(aVar, aVarN.a("Cookie", headers).D(aVarH3.h()).b());
                                }
                                aVar2.invoke();
                            }
                            break;
                        case 92899676:
                            if (status.equals("alert")) {
                                String strE10 = com.max.hbutils.utils.k.e(string, "result");
                                final String strE11 = com.max.hbutils.utils.k.e(strE10, "alert_title");
                                final String strE12 = com.max.hbutils.utils.k.e(strE10, "alert_msg");
                                final String strE13 = com.max.hbutils.utils.k.e(strE10, "confirm_btn");
                                final String strE14 = com.max.hbutils.utils.k.e(strE10, "cancel_btn");
                                final Activity activityA = com.max.hbutils.utils.e.b().a();
                                if (activityA != null) {
                                    f0.m(activityA);
                                    if (!activityA.isFinishing()) {
                                        final Ref.BooleanRef booleanRef = new Ref.BooleanRef();
                                        final Semaphore semaphore = new Semaphore(0);
                                        new Handler(Looper.getMainLooper()).post(new Runnable() { // from class: com.max.hbcommon.network.interceptor.e
                                            @Override // java.lang.Runnable
                                            public final void run() {
                                                ErrorHandleInterceptor.q(activityA, strE11, strE12, strE13, strE14, booleanRef, semaphore);
                                            }
                                        });
                                        try {
                                            semaphore.acquire();
                                            break;
                                        } catch (InterruptedException unused5) {
                                        }
                                        if (booleanRef.f124884b) {
                                            t.a aVarH4 = a0Var.q().H();
                                            ob.a.k().b(aVarH4, a0Var.q().x());
                                            aVarH4.W("alert_retry", "1");
                                            return m(aVar, a0Var.n().D(aVarH4.h()).b());
                                        }
                                        aVar2.invoke();
                                    }
                                }
                            }
                            break;
                        case 1578341941:
                            if (status.equals(f68098h)) {
                                final String strE15 = com.max.hbutils.utils.k.e(com.max.hbutils.utils.k.e(string, "result"), "alert_title");
                                Activity activityA2 = com.max.hbutils.utils.e.b().a();
                                if (activityA2 != null) {
                                    f0.m(activityA2);
                                    if (!activityA2.isFinishing()) {
                                        final Ref.BooleanRef booleanRef2 = new Ref.BooleanRef();
                                        final Semaphore semaphore2 = new Semaphore(0);
                                        new Handler(Looper.getMainLooper()).post(new Runnable() { // from class: com.max.hbcommon.network.interceptor.f
                                            @Override // java.lang.Runnable
                                            public final void run() {
                                                ErrorHandleInterceptor.u(strE15, booleanRef2, semaphore2);
                                            }
                                        });
                                        try {
                                            semaphore2.acquire();
                                            break;
                                        } catch (InterruptedException unused6) {
                                        }
                                        if (booleanRef2.f124884b) {
                                            t.a aVarH5 = a0Var.q().H();
                                            String strX = a0Var.q().x();
                                            ob.a.k().b(aVarH5, strX);
                                            a0 a0VarB = a0Var.n().D(aVarH5.h()).b();
                                            Log.d("ErrorHandleInterceptor-dbg", "[handleRequest]\nretry: " + booleanRef2.f124884b + "\npath: " + strX + "\nnewRequest: " + a0VarB);
                                            return m(aVar, a0VarB);
                                        }
                                        aVar2.invoke();
                                    }
                                }
                            }
                            break;
                        case 1994176312:
                            if (status.equals(f68094d)) {
                                objectRef2.f124891b = "验证失败";
                                final Ref.ObjectRef objectRef6 = new Ref.ObjectRef();
                                objectRef6.f124891b = new Semaphore(0);
                                final qb.a aVar3 = new qb.a();
                                new Handler(Looper.getMainLooper()).post(new Runnable() { // from class: com.max.hbcommon.network.interceptor.a
                                    @Override // java.lang.Runnable
                                    public final void run() {
                                        ErrorHandleInterceptor.n(result, aVar3, objectRef6);
                                    }
                                });
                                try {
                                    ((Semaphore) objectRef6.f124891b).acquire();
                                    break;
                                } catch (InterruptedException unused7) {
                                }
                                if (f0.g(aVar3.a(), qb.a.f138641d) || com.max.hbcommon.utils.c.x(result.getReport_canceled())) {
                                    t.a aVarH6 = a0Var.q().H();
                                    ob.a.k().b(aVarH6, a0Var.q().x());
                                    if (f0.g(aVar3.a(), qb.a.f138641d)) {
                                        aVarH6.W("captcha_type", qb.a.f138641d);
                                        aVarH6.W("ticket", aVar3.c());
                                        aVarH6.W("randstr", aVar3.b());
                                    } else {
                                        aVarH6.W("captcha_type", qb.a.f138642e);
                                    }
                                    return m(aVar, a0Var.n().D(aVarH6.h()).b());
                                }
                                aVar2.invoke();
                            }
                            break;
                    }
                }
            }
        }
        return c0VarProceed;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void n(Result resultObj, qb.a captchaInfo, Ref.ObjectRef semaphore) {
        if (PatchProxy.proxy(new Object[]{resultObj, captchaInfo, semaphore}, null, changeQuickRedirect, true, bb.c.e.f31707ae, new Class[]{Result.class, qb.a.class, Ref.ObjectRef.class}, Void.TYPE).isSupported) {
            return;
        }
        f0.p(resultObj, "$resultObj");
        f0.p(captchaInfo, "$captchaInfo");
        f0.p(semaphore, "$semaphore");
        ob.a.a().a(resultObj.getMsg(), new d(captchaInfo, semaphore));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void o(String str, String str2, AuthCodeObj authCodeInfo, Ref.ObjectRef semaphore) {
        if (PatchProxy.proxy(new Object[]{str, str2, authCodeInfo, semaphore}, null, changeQuickRedirect, true, bb.c.e.f31724be, new Class[]{String.class, String.class, AuthCodeObj.class, Ref.ObjectRef.class}, Void.TYPE).isSupported) {
            return;
        }
        f0.p(authCodeInfo, "$authCodeInfo");
        f0.p(semaphore, "$semaphore");
        o.f68157a.d(str, str2, new e(authCodeInfo, semaphore));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void p(String str, String str2, AuthCodeObj authCodeInfo, Ref.ObjectRef semaphore) {
        if (PatchProxy.proxy(new Object[]{str, str2, authCodeInfo, semaphore}, null, changeQuickRedirect, true, bb.c.e.f31741ce, new Class[]{String.class, String.class, AuthCodeObj.class, Ref.ObjectRef.class}, Void.TYPE).isSupported) {
            return;
        }
        f0.p(authCodeInfo, "$authCodeInfo");
        f0.p(semaphore, "$semaphore");
        ob.a.a().b(str, str2, new f(authCodeInfo, semaphore));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void q(Activity it, String str, String str2, String str3, String str4, final Ref.BooleanRef retry, final Semaphore semaphore) {
        if (PatchProxy.proxy(new Object[]{it, str, str2, str3, str4, retry, semaphore}, null, changeQuickRedirect, true, bb.c.e.f31809ge, new Class[]{Activity.class, String.class, String.class, String.class, String.class, Ref.BooleanRef.class, Semaphore.class}, Void.TYPE).isSupported) {
            return;
        }
        f0.p(it, "$it");
        f0.p(retry, "$retry");
        f0.p(semaphore, "$semaphore");
        new com.max.hbcommon.view.a.f(it).y(str).l(str2).u(str3, new DialogInterface.OnClickListener() { // from class: com.max.hbcommon.network.interceptor.j
            @Override // android.content.DialogInterface.OnClickListener
            public final void onClick(DialogInterface dialogInterface, int i10) {
                ErrorHandleInterceptor.r(retry, dialogInterface, i10);
            }
        }).o(str4, new DialogInterface.OnClickListener() { // from class: com.max.hbcommon.network.interceptor.k
            @Override // android.content.DialogInterface.OnClickListener
            public final void onClick(DialogInterface dialogInterface, int i10) {
                ErrorHandleInterceptor.s(retry, dialogInterface, i10);
            }
        }).r(new DialogInterface.OnDismissListener() { // from class: com.max.hbcommon.network.interceptor.b
            @Override // android.content.DialogInterface.OnDismissListener
            public final void onDismiss(DialogInterface dialogInterface) {
                ErrorHandleInterceptor.t(semaphore, dialogInterface);
            }
        }).F();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void r(Ref.BooleanRef retry, DialogInterface dialogInterface, int i10) {
        if (PatchProxy.proxy(new Object[]{retry, dialogInterface, new Integer(i10)}, null, changeQuickRedirect, true, bb.c.e.f31758de, new Class[]{Ref.BooleanRef.class, DialogInterface.class, Integer.TYPE}, Void.TYPE).isSupported) {
            return;
        }
        f0.p(retry, "$retry");
        retry.f124884b = true;
        dialogInterface.dismiss();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void s(Ref.BooleanRef retry, DialogInterface dialogInterface, int i10) {
        if (PatchProxy.proxy(new Object[]{retry, dialogInterface, new Integer(i10)}, null, changeQuickRedirect, true, bb.c.e.f31775ee, new Class[]{Ref.BooleanRef.class, DialogInterface.class, Integer.TYPE}, Void.TYPE).isSupported) {
            return;
        }
        f0.p(retry, "$retry");
        retry.f124884b = false;
        dialogInterface.dismiss();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void t(Semaphore semaphore, DialogInterface dialogInterface) {
        if (PatchProxy.proxy(new Object[]{semaphore, dialogInterface}, null, changeQuickRedirect, true, bb.c.e.f31792fe, new Class[]{Semaphore.class, DialogInterface.class}, Void.TYPE).isSupported) {
            return;
        }
        f0.p(semaphore, "$semaphore");
        semaphore.release();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void u(String str, final Ref.BooleanRef retry, final Semaphore semaphore) {
        if (PatchProxy.proxy(new Object[]{str, retry, semaphore}, null, changeQuickRedirect, true, bb.c.e.f31826he, new Class[]{String.class, Ref.BooleanRef.class, Semaphore.class}, Void.TYPE).isSupported) {
            return;
        }
        f0.p(retry, "$retry");
        f0.p(semaphore, "$semaphore");
        ob.a.o().d(str, new yh.a<b2>() { // from class: com.max.hbcommon.network.interceptor.ErrorHandleInterceptor$handleRequest$1$6$1$1
            public static ChangeQuickRedirect changeQuickRedirect;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(0);
            }

            /* JADX WARN: Type inference failed for: r0v3, types: [java.lang.Object, kotlin.b2] */
            @Override // yh.a
            public /* bridge */ /* synthetic */ b2 invoke() {
                PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, bb.c.e.f32114ye, new Class[0], Object.class);
                if (patchProxyResultProxy.isSupported) {
                    return patchProxyResultProxy.result;
                }
                invoke2();
                return b2.f124493a;
            }

            /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
            public final void invoke2() {
                if (PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, bb.c.e.f32097xe, new Class[0], Void.TYPE).isSupported) {
                    return;
                }
                retry.f124884b = true;
                semaphore.release();
            }
        }, new yh.a<b2>() { // from class: com.max.hbcommon.network.interceptor.ErrorHandleInterceptor$handleRequest$1$6$1$2
            public static ChangeQuickRedirect changeQuickRedirect;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(0);
            }

            /* JADX WARN: Type inference failed for: r0v3, types: [java.lang.Object, kotlin.b2] */
            @Override // yh.a
            public /* bridge */ /* synthetic */ b2 invoke() {
                PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, bb.c.e.Ae, new Class[0], Object.class);
                if (patchProxyResultProxy.isSupported) {
                    return patchProxyResultProxy.result;
                }
                invoke2();
                return b2.f124493a;
            }

            /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
            public final void invoke2() {
                if (PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, bb.c.e.f32131ze, new Class[0], Void.TYPE).isSupported) {
                    return;
                }
                semaphore.release();
            }
        });
    }

    private final boolean v(Buffer buffer) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{buffer}, this, changeQuickRedirect, false, bb.c.e.Yd, new Class[]{Buffer.class}, Boolean.TYPE);
        if (patchProxyResultProxy.isSupported) {
            return ((Boolean) patchProxyResultProxy.result).booleanValue();
        }
        try {
            Buffer buffer2 = new Buffer();
            buffer.copyTo(buffer2, 0L, buffer.size() < 64 ? buffer.size() : 64L);
            for (int i10 = 0; i10 < 16 && !buffer2.exhausted(); i10++) {
                int utf8CodePoint = buffer2.readUtf8CodePoint();
                if (Character.isISOControl(utf8CodePoint) && !Character.isWhitespace(utf8CodePoint)) {
                    return false;
                }
            }
            return true;
        } catch (EOFException unused) {
            return false;
        }
    }

    @xh.m
    public static final boolean w(@dl.e String str) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{str}, null, changeQuickRedirect, true, bb.c.e.f31893le, new Class[]{String.class}, Boolean.TYPE);
        return patchProxyResultProxy.isSupported ? ((Boolean) patchProxyResultProxy.result).booleanValue() : f68092a.a(str);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Multi-variable type inference failed */
    public static final void y(Ref.ObjectRef mContext, EditText et_input_code, b listener, ImageView iv_captcha, DialogInterface dialogInterface, int i10) {
        if (PatchProxy.proxy(new Object[]{mContext, et_input_code, listener, iv_captcha, dialogInterface, new Integer(i10)}, null, changeQuickRedirect, true, bb.c.e.f31843ie, new Class[]{Ref.ObjectRef.class, EditText.class, b.class, ImageView.class, DialogInterface.class, Integer.TYPE}, Void.TYPE).isSupported) {
            return;
        }
        f0.p(mContext, "$mContext");
        f0.p(et_input_code, "$et_input_code");
        f0.p(listener, "$listener");
        f0.p(iv_captcha, "$iv_captcha");
        T t10 = mContext.f124891b;
        f0.n(t10, "null cannot be cast to non-null type android.app.Activity");
        if (com.max.hbcommon.utils.c.g((Activity) t10, et_input_code, ((Activity) mContext.f124891b).getString(R.string.verification_code_empty))) {
            return;
        }
        listener.b(et_input_code.getText().toString(), (String) iv_captcha.getTag());
        dialogInterface.dismiss();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void z(b listener, DialogInterface dialogInterface, int i10) {
        if (PatchProxy.proxy(new Object[]{listener, dialogInterface, new Integer(i10)}, null, changeQuickRedirect, true, bb.c.e.f31859je, new Class[]{b.class, DialogInterface.class, Integer.TYPE}, Void.TYPE).isSupported) {
            return;
        }
        f0.p(listener, "$listener");
        listener.a();
        dialogInterface.dismiss();
    }

    @Override // okhttp3.u
    @dl.d
    public c0 intercept(@dl.d u.a chain) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{chain}, this, changeQuickRedirect, false, bb.c.e.Vd, new Class[]{u.a.class}, c0.class);
        if (patchProxyResultProxy.isSupported) {
            return (c0) patchProxyResultProxy.result;
        }
        f0.p(chain, "chain");
        return m(chain, chain.request());
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v2, types: [T, android.app.Activity] */
    public final void x(@dl.e final String str, @dl.e String str2, @dl.e Bitmap bitmap, @dl.d final b listener) {
        if (PatchProxy.proxy(new Object[]{str, str2, bitmap, listener}, this, changeQuickRedirect, false, bb.c.e.Zd, new Class[]{String.class, String.class, Bitmap.class, b.class}, Void.TYPE).isSupported) {
            return;
        }
        f0.p(listener, "listener");
        final Ref.ObjectRef objectRef = new Ref.ObjectRef();
        ?? N = ob.a.b().n();
        objectRef.f124891b = N;
        if (N == 0 || N.isFinishing()) {
            listener.a();
            return;
        }
        com.max.hbcommon.view.a.f fVar = new com.max.hbcommon.view.a.f((Context) objectRef.f124891b);
        Object systemService = ((Activity) objectRef.f124891b).getSystemService("layout_inflater");
        f0.n(systemService, "null cannot be cast to non-null type android.view.LayoutInflater");
        View viewInflate = ((LayoutInflater) systemService).inflate(R.layout.dialog_code_auth, (ViewGroup) null, false);
        f0.o(viewInflate, "inflate(...)");
        View viewFindViewById = viewInflate.findViewById(R.id.et_input_code);
        f0.n(viewFindViewById, "null cannot be cast to non-null type android.widget.EditText");
        final EditText editText = (EditText) viewFindViewById;
        View viewFindViewById2 = viewInflate.findViewById(R.id.iv_captcha);
        f0.n(viewFindViewById2, "null cannot be cast to non-null type android.widget.ImageView");
        final ImageView imageView = (ImageView) viewFindViewById2;
        com.max.hbcommon.view.a aVarD = fVar.i(viewInflate).y(str2).u("确定", new DialogInterface.OnClickListener() { // from class: com.max.hbcommon.network.interceptor.g
            @Override // android.content.DialogInterface.OnClickListener
            public final void onClick(DialogInterface dialogInterface, int i10) {
                ErrorHandleInterceptor.y(objectRef, editText, listener, imageView, dialogInterface, i10);
            }
        }).o("取消", new DialogInterface.OnClickListener() { // from class: com.max.hbcommon.network.interceptor.h
            @Override // android.content.DialogInterface.OnClickListener
            public final void onClick(DialogInterface dialogInterface, int i10) {
                ErrorHandleInterceptor.z(listener, dialogInterface, i10);
            }
        }).d();
        imageView.setImageBitmap(bitmap);
        GradientDrawable gradientDrawableO = q.o((Context) objectRef.f124891b, R.color.divider_secondary_2_color, 1.0f);
        f0.o(gradientDrawableO, "getRectShape(...)");
        Context context = (Context) objectRef.f124891b;
        int i10 = R.color.text_secondary_2_color;
        editText.setBackgroundDrawable(q.M(gradientDrawableO, context, i10, 1.0f));
        imageView.setBackgroundDrawable(q.M(gradientDrawableO, (Context) objectRef.f124891b, i10, 1.0f));
        imageView.setOnClickListener(new View.OnClickListener() { // from class: com.max.hbcommon.network.interceptor.i
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                ErrorHandleInterceptor.A(str, imageView, view);
            }
        });
        aVarD.show();
    }
}
