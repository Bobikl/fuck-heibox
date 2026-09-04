package com.max.xiaoheihe.module.voice.streaming;

import android.content.Context;
import androidx.compose.runtime.internal.o;
import com.max.xiaoheihe.module.voice.audio.AudioBuffer;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.PatchProxyResult;
import dl.d;
import dl.e;
import java.util.List;
import kotlin.b2;
import kotlin.coroutines.c;
import kotlin.jvm.internal.f0;
import kotlin.jvm.internal.u;

/* JADX INFO: compiled from: MicStreamManager.kt */
/* JADX INFO: loaded from: classes12.dex */
@o(parameters = 0)
public final class a {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @d
    public static final C0888a f94163b = new C0888a(null);

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final int f94164c = 8;
    public static ChangeQuickRedirect changeQuickRedirect = null;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final long f94165d = 1;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @d
    private b f94166a;

    /* JADX INFO: renamed from: com.max.xiaoheihe.module.voice.streaming.a$a, reason: collision with other inner class name */
    /* JADX INFO: compiled from: MicStreamManager.kt */
    public static final class C0888a {
        private C0888a() {
        }

        public /* synthetic */ C0888a(u uVar) {
            this();
        }
    }

    public a(@d Context ctx, @d List<String> ipList, @d String port, @d String token) {
        f0.p(ctx, "ctx");
        f0.p(ipList, "ipList");
        f0.p(port, "port");
        f0.p(token, "token");
        this.f94166a = new WifiStreamer(ctx, ipList, port, token);
    }

    @d
    public final String a() {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 46820, new Class[0], String.class);
        return patchProxyResultProxy.isSupported ? (String) patchProxyResultProxy.result : this.f94166a.j();
    }

    public final boolean b() {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 46821, new Class[0], Boolean.TYPE);
        return patchProxyResultProxy.isSupported ? ((Boolean) patchProxyResultProxy.result).booleanValue() : this.f94166a.m();
    }

    @e
    public final Object c(@d c<? super String> cVar) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{cVar}, this, changeQuickRedirect, false, 46819, new Class[]{c.class}, Object.class);
        return patchProxyResultProxy.isSupported ? patchProxyResultProxy.result : this.f94166a.h(cVar);
    }

    public final void d() {
        if (PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 46818, new Class[0], Void.TYPE).isSupported) {
            return;
        }
        this.f94166a.shutdown();
    }

    public final boolean e() {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 46813, new Class[0], Boolean.TYPE);
        return patchProxyResultProxy.isSupported ? ((Boolean) patchProxyResultProxy.result).booleanValue() : this.f94166a.connect();
    }

    public final void f() {
        if (PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 46814, new Class[0], Void.TYPE).isSupported) {
            return;
        }
        this.f94166a.disconnect();
    }

    @e
    public final Object g(@d AudioBuffer audioBuffer, @d c<? super b2> cVar) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{audioBuffer, cVar}, this, changeQuickRedirect, false, 46817, new Class[]{AudioBuffer.class, c.class}, Object.class);
        if (patchProxyResultProxy.isSupported) {
            return patchProxyResultProxy.result;
        }
        Object objK = this.f94166a.k(audioBuffer, cVar);
        return objK == kotlin.coroutines.intrinsics.b.h() ? objK : b2.f124493a;
    }

    @e
    public final Object h(@d short[] sArr, @d c<? super b2> cVar) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{sArr, cVar}, this, changeQuickRedirect, false, 46816, new Class[]{short[].class, c.class}, Object.class);
        if (patchProxyResultProxy.isSupported) {
            return patchProxyResultProxy.result;
        }
        Object objL = this.f94166a.l(sArr, cVar);
        return objL == kotlin.coroutines.intrinsics.b.h() ? objL : b2.f124493a;
    }

    @e
    public final Object i(@d AudioBuffer audioBuffer, @d String str, @d c<? super b2> cVar) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{audioBuffer, str, cVar}, this, changeQuickRedirect, false, 46815, new Class[]{AudioBuffer.class, String.class, c.class}, Object.class);
        if (patchProxyResultProxy.isSupported) {
            return patchProxyResultProxy.result;
        }
        Object objN = this.f94166a.n(audioBuffer, str, cVar);
        return objN == kotlin.coroutines.intrinsics.b.h() ? objN : b2.f124493a;
    }
}
