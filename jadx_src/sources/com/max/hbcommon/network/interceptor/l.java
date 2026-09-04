package com.max.hbcommon.network.interceptor;

import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.PatchProxyResult;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InterruptedIOException;
import java.net.ProtocolException;
import java.net.SocketTimeoutException;
import java.security.cert.CertificateException;
import javax.net.ssl.SSLHandshakeException;
import javax.net.ssl.SSLPeerUnverifiedException;
import kotlin.jvm.internal.f0;
import okhttp3.a0;
import okhttp3.b0;
import okhttp3.c0;
import okhttp3.internal.connection.RealCall;
import okhttp3.internal.http.RealInterceptorChain;
import okhttp3.internal.http2.ConnectionShutdownException;
import okhttp3.u;
import okhttp3.z;

/* JADX INFO: compiled from: HBRetryAndFollowUpInterceptor.kt */
/* JADX INFO: loaded from: classes9.dex */
public final class l implements u {
    public static ChangeQuickRedirect changeQuickRedirect;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @dl.d
    private final z f68153a;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final int f68154c;

    public l(@dl.d z client) {
        f0.p(client, "client");
        this.f68153a = client;
        this.f68154c = 20;
    }

    private final boolean a(IOException iOException, boolean z10) {
        Object[] objArr = {iOException, new Byte(z10 ? (byte) 1 : (byte) 0)};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        Class cls = Boolean.TYPE;
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(objArr, this, changeQuickRedirect2, false, bb.c.e.He, new Class[]{IOException.class, cls}, cls);
        if (patchProxyResultProxy.isSupported) {
            return ((Boolean) patchProxyResultProxy.result).booleanValue();
        }
        if (iOException instanceof ProtocolException) {
            return false;
        }
        if (iOException instanceof InterruptedIOException) {
            return (iOException instanceof SocketTimeoutException) && !z10;
        }
        return (((iOException instanceof SSLHandshakeException) && (iOException.getCause() instanceof CertificateException)) || (iOException instanceof SSLPeerUnverifiedException)) ? false : true;
    }

    private final boolean b(IOException iOException, RealCall realCall, a0 a0Var, boolean z10) {
        Object[] objArr = {iOException, realCall, a0Var, new Byte(z10 ? (byte) 1 : (byte) 0)};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        Class cls = Boolean.TYPE;
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(objArr, this, changeQuickRedirect2, false, bb.c.e.Fe, new Class[]{IOException.class, RealCall.class, a0.class, cls}, cls);
        if (patchProxyResultProxy.isSupported) {
            return ((Boolean) patchProxyResultProxy.result).booleanValue();
        }
        if (this.f68153a.getRetryOnConnectionFailure()) {
            return !(z10 && c(iOException, a0Var)) && a(iOException, z10) && realCall.retryAfterFailure();
        }
        return false;
    }

    private final boolean c(IOException iOException, a0 a0Var) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{iOException, a0Var}, this, changeQuickRedirect, false, bb.c.e.Ge, new Class[]{IOException.class, a0.class}, Boolean.TYPE);
        if (patchProxyResultProxy.isSupported) {
            return ((Boolean) patchProxyResultProxy.result).booleanValue();
        }
        b0 b0VarF = a0Var.f();
        return (b0VarF != null && b0VarF.isOneShot()) || (iOException instanceof FileNotFoundException);
    }

    @Override // okhttp3.u
    @dl.d
    public c0 intercept(@dl.d u.a chain) throws IOException {
        int i10 = 0;
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{chain}, this, changeQuickRedirect, false, bb.c.e.Ee, new Class[]{u.a.class}, c0.class);
        if (patchProxyResultProxy.isSupported) {
            return (c0) patchProxyResultProxy.result;
        }
        f0.p(chain, "chain");
        RealInterceptorChain realInterceptorChain = (RealInterceptorChain) chain;
        a0 a0VarRequest = realInterceptorChain.request();
        okhttp3.e eVarCall = realInterceptorChain.call();
        c0 c0VarH = null;
        IOException e10 = null;
        while (i10 <= this.f68154c) {
            com.max.heybox.hblog.g.f74531b.M("HBRetryAndFollowUpInterceptor count: " + i10 + "  requestUrl: " + chain.request().q());
            try {
                c0VarH = com.max.hbcommon.network.b.g().h(chain);
                break;
            } catch (IOException e11) {
                e10 = e11;
                com.max.heybox.hblog.g.a aVar = com.max.heybox.hblog.g.f74531b;
                aVar.v("HBRetryAndFollowUpInterceptor retryError  count: " + i10 + "  error: " + e10.getClass().getSimpleName() + "  " + e10.getMessage() + "  url: " + chain.request().q());
                f0.n(eVarCall, "null cannot be cast to non-null type okhttp3.internal.connection.RealCall");
                if (!b(e10, (RealCall) eVarCall, a0VarRequest, !(e10 instanceof ConnectionShutdownException))) {
                    aVar.v("HBRetryAndFollowUpInterceptor  recover is false. count: " + i10 + "   url: " + chain.request().q());
                    throw e10;
                }
                i10++;
            }
        }
        if (c0VarH != null) {
            return c0VarH;
        }
        com.max.heybox.hblog.g.f74531b.v("HBRetryAndFollowUpInterceptor  retryError response=null  count: " + i10 + "  url: " + chain.request().q());
        if (e10 != null) {
            throw e10;
        }
        throw new IOException("retry failed");
    }
}
