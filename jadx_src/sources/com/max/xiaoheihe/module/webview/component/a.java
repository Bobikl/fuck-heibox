package com.max.xiaoheihe.module.webview.component;

import androidx.compose.runtime.internal.o;
import com.max.xiaoheihe.module.webview.WebviewFragment;
import com.meituan.robust.ChangeQuickRedirect;
import dl.d;
import dl.e;
import java.lang.ref.WeakReference;
import kotlin.jvm.internal.f0;

/* JADX INFO: compiled from: NestedWebViewScrollChangeListener.kt */
/* JADX INFO: loaded from: classes12.dex */
@o(parameters = 0)
public class a implements NestedWebView.a {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final int f94644c = 8;
    public static ChangeQuickRedirect changeQuickRedirect;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @d
    private final WeakReference<NestedWebView> f94645a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @d
    private final WeakReference<WebviewFragment.o0> f94646b;

    public a(@e WebviewFragment.o0 o0Var, @d NestedWebView webView) {
        f0.p(webView, "webView");
        this.f94645a = new WeakReference<>(webView);
        this.f94646b = new WeakReference<>(o0Var);
    }

    @Override // com.max.xiaoheihe.module.webview.component.NestedWebView.a
    public void a(int i10, int i11, int i12, int i13) {
    }

    @d
    public final WeakReference<WebviewFragment.o0> b() {
        return this.f94646b;
    }

    @d
    public final WeakReference<NestedWebView> c() {
        return this.f94645a;
    }
}
