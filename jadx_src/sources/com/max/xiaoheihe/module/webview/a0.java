package com.max.xiaoheihe.module.webview;

import com.max.hbutils.core.BaseApplication;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.PatchProxyResult;
import java.io.BufferedReader;
import java.io.InputStream;
import java.io.InputStreamReader;

/* JADX INFO: compiled from: WebStaticJsManager.kt */
/* JADX INFO: loaded from: classes12.dex */
@androidx.compose.runtime.internal.o(parameters = 0)
public final class a0 {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @dl.d
    public static final a f94572b = new a(null);

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final int f94573c = 8;
    public static ChangeQuickRedirect changeQuickRedirect;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @dl.e
    private static a0 f94574d;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @dl.e
    private String f94575a;

    /* JADX INFO: compiled from: WebStaticJsManager.kt */
    @kotlin.jvm.internal.t0({"SMAP\nWebStaticJsManager.kt\nKotlin\n*S Kotlin\n*F\n+ 1 WebStaticJsManager.kt\ncom/max/xiaoheihe/module/webview/WebStaticJsManager$Companion\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,50:1\n1#2:51\n*E\n"})
    public static final class a {
        public static ChangeQuickRedirect changeQuickRedirect;

        private a() {
        }

        public /* synthetic */ a(kotlin.jvm.internal.u uVar) {
            this();
        }

        @dl.d
        @xh.m
        public final synchronized a0 a() {
            PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 47172, new Class[0], a0.class);
            if (patchProxyResultProxy.isSupported) {
                return (a0) patchProxyResultProxy.result;
            }
            if (a0.f94574d == null) {
                a0.f94574d = new a0();
            }
            a0 a0Var = a0.f94574d;
            kotlin.jvm.internal.f0.m(a0Var);
            return a0Var;
        }

        @dl.d
        @xh.m
        public final String b(@dl.d String filename) {
            PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{filename}, this, changeQuickRedirect, false, 47173, new Class[]{String.class}, String.class);
            if (patchProxyResultProxy.isSupported) {
                return (String) patchProxyResultProxy.result;
            }
            kotlin.jvm.internal.f0.p(filename, "filename");
            StringBuilder sb2 = new StringBuilder();
            try {
                InputStream inputStreamOpen = BaseApplication.a().getAssets().open("js/" + filename);
                kotlin.jvm.internal.f0.o(inputStreamOpen, "assetManager.open(\"js/$filename\")");
                BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(inputStreamOpen, "UTF-8"));
                while (true) {
                    String line = bufferedReader.readLine();
                    if (line == null) {
                        break;
                    }
                    sb2.append(line);
                    sb2.append("\n");
                }
            } catch (Throwable th2) {
                com.max.heybox.hblog.g.f74531b.v("readJsFileFromAssets " + filename + " error: " + th2.getMessage());
            }
            String string = sb2.toString();
            kotlin.jvm.internal.f0.o(string, "stringBuilder.toString()");
            return string;
        }
    }

    @dl.d
    @xh.m
    public static final synchronized a0 c() {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[0], null, changeQuickRedirect, true, 47170, new Class[0], a0.class);
        if (patchProxyResultProxy.isSupported) {
            return (a0) patchProxyResultProxy.result;
        }
        return f94572b.a();
    }

    @dl.d
    @xh.m
    public static final String e(@dl.d String str) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{str}, null, changeQuickRedirect, true, 47171, new Class[]{String.class}, String.class);
        return patchProxyResultProxy.isSupported ? (String) patchProxyResultProxy.result : f94572b.b(str);
    }

    @dl.d
    public final synchronized String d() {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 47169, new Class[0], String.class);
        if (patchProxyResultProxy.isSupported) {
            return (String) patchProxyResultProxy.result;
        }
        if (this.f94575a == null) {
            this.f94575a = f94572b.b("jsbridge.js");
        }
        String str = this.f94575a;
        kotlin.jvm.internal.f0.m(str);
        return str;
    }
}
