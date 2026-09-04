package com.max.xiaoheihe.module.webview;

import com.eclipsesource.v8.V8;
import com.eclipsesource.v8.V8Array;
import com.eclipsesource.v8.V8Object;
import com.eclipsesource.v8.V8Value;
import com.eclipsesource.v8.utils.MemoryManager;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.PatchProxyResult;
import kotlinx.coroutines.e1;

/* JADX INFO: compiled from: JsCoreManager.kt */
/* JADX INFO: loaded from: classes12.dex */
@androidx.compose.runtime.internal.o(parameters = 0)
public final class JsCoreManager {
    public static ChangeQuickRedirect changeQuickRedirect = null;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    @dl.d
    public static final a f94217e = new a(null);

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final int f94218f = 8;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    @dl.d
    public static final String f94219g = "JsProtocol";

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    @dl.e
    private static JsCoreManager f94220h;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @dl.e
    private V8 f94221a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @dl.e
    private MemoryManager f94222b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @dl.d
    private JSCore f94223c = new JSCore();

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @dl.e
    private V8Object f94224d;

    /* JADX INFO: compiled from: JsCoreManager.kt */
    public static final class a {
        public static ChangeQuickRedirect changeQuickRedirect;

        private a() {
        }

        public /* synthetic */ a(kotlin.jvm.internal.u uVar) {
            this();
        }

        @dl.d
        @xh.m
        public final JsCoreManager a() {
            PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 46924, new Class[0], JsCoreManager.class);
            if (patchProxyResultProxy.isSupported) {
                return (JsCoreManager) patchProxyResultProxy.result;
            }
            if (JsCoreManager.f94220h == null) {
                JsCoreManager.f94220h = new JsCoreManager();
            }
            JsCoreManager jsCoreManager = JsCoreManager.f94220h;
            kotlin.jvm.internal.f0.m(jsCoreManager);
            return jsCoreManager;
        }

        @xh.m
        public final void b() {
            if (PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 46926, new Class[0], Void.TYPE).isSupported) {
                return;
            }
            JsCoreManager jsCoreManager = JsCoreManager.f94220h;
            if (jsCoreManager != null) {
                JsCoreManager.e(jsCoreManager);
            }
            JsCoreManager.f94220h = null;
        }

        @dl.e
        @xh.m
        public final String c(@dl.e Object obj) {
            PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{obj}, this, changeQuickRedirect, false, 46925, new Class[]{Object.class}, String.class);
            if (patchProxyResultProxy.isSupported) {
                return (String) patchProxyResultProxy.result;
            }
            if (obj == null) {
                return "";
            }
            if (!(obj instanceof V8Object)) {
                return obj.toString();
            }
            V8 v8CreateV8Runtime = V8.createV8Runtime();
            MemoryManager memoryManager = new MemoryManager(v8CreateV8Runtime);
            Object objExecuteFunction = v8CreateV8Runtime.getObject("JSON").executeFunction("stringify", new V8Array(v8CreateV8Runtime).push((V8Value) obj));
            kotlin.jvm.internal.f0.n(objExecuteFunction, "null cannot be cast to non-null type kotlin.String");
            String str = (String) objExecuteFunction;
            memoryManager.release();
            return str;
        }
    }

    public static final /* synthetic */ void e(JsCoreManager jsCoreManager) {
        if (PatchProxy.proxy(new Object[]{jsCoreManager}, null, changeQuickRedirect, true, 46923, new Class[]{JsCoreManager.class}, Void.TYPE).isSupported) {
            return;
        }
        jsCoreManager.n();
    }

    public static /* synthetic */ void k(JsCoreManager jsCoreManager, String str, JSCore jSCore, int i10, Object obj) {
        if (PatchProxy.proxy(new Object[]{jsCoreManager, str, jSCore, new Integer(i10), obj}, null, changeQuickRedirect, true, 46918, new Class[]{JsCoreManager.class, String.class, JSCore.class, Integer.TYPE, Object.class}, Void.TYPE).isSupported) {
            return;
        }
        if ((i10 & 2) != 0) {
            jSCore = null;
        }
        jsCoreManager.j(str, jSCore);
    }

    @dl.d
    @xh.m
    public static final JsCoreManager l() {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[0], null, changeQuickRedirect, true, 46920, new Class[0], JsCoreManager.class);
        return patchProxyResultProxy.isSupported ? (JsCoreManager) patchProxyResultProxy.result : f94217e.a();
    }

    private final void n() {
        if (PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 46919, new Class[0], Void.TYPE).isSupported) {
            return;
        }
        try {
            MemoryManager memoryManager = this.f94222b;
            if (memoryManager != null) {
                memoryManager.release();
            }
        } catch (Throwable th2) {
            com.max.heybox.hblog.g.f74531b.v("JSCORE release error: " + th2.getMessage());
        }
    }

    @xh.m
    public static final void o() {
        if (PatchProxy.proxy(new Object[0], null, changeQuickRedirect, true, 46922, new Class[0], Void.TYPE).isSupported) {
            return;
        }
        f94217e.b();
    }

    @dl.e
    @xh.m
    public static final String q(@dl.e Object obj) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{obj}, null, changeQuickRedirect, true, 46921, new Class[]{Object.class}, String.class);
        return patchProxyResultProxy.isSupported ? (String) patchProxyResultProxy.result : f94217e.c(obj);
    }

    public final synchronized void j(@dl.e String str, @dl.e JSCore jSCore) {
        if (PatchProxy.proxy(new Object[]{str, jSCore}, this, changeQuickRedirect, false, 46917, new Class[]{String.class, JSCore.class}, Void.TYPE).isSupported) {
            return;
        }
        if (str != null) {
            kotlinx.coroutines.k.f(kotlinx.coroutines.r0.a(e1.e()), null, null, new JsCoreManager$evaluateJsInJsCore$1$1(this, jSCore, str, null), 3, null);
        }
    }

    @dl.e
    public final V8 m() {
        return this.f94221a;
    }

    public final void p(@dl.e V8 v10) {
        this.f94221a = v10;
    }
}
