package com.max.xiaoheihe.module.webview;

import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.PatchProxyResult;
import kotlin.coroutines.jvm.internal.ContinuationImpl;

/* JADX INFO: compiled from: WebFragmentDialog.kt */
/* JADX INFO: loaded from: classes12.dex */
@kotlin.coroutines.jvm.internal.d(c = "com.max.xiaoheihe.module.webview.WebFragmentDialog", f = "WebFragmentDialog.kt", i = {0}, l = {81, 86}, m = "refreshSwipeBackLayoutInnerScrollView", n = {"this"}, s = {"L$0"})
public final class WebFragmentDialog$refreshSwipeBackLayoutInnerScrollView$1 extends ContinuationImpl {
    public static ChangeQuickRedirect changeQuickRedirect;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    Object f94324b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    /* synthetic */ Object f94325c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    final /* synthetic */ WebFragmentDialog f94326d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    int f94327e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    WebFragmentDialog$refreshSwipeBackLayoutInnerScrollView$1(WebFragmentDialog webFragmentDialog, kotlin.coroutines.c<? super WebFragmentDialog$refreshSwipeBackLayoutInnerScrollView$1> cVar) {
        super(cVar);
        this.f94326d = webFragmentDialog;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @dl.e
    public final Object invokeSuspend(@dl.d Object obj) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{obj}, this, changeQuickRedirect, false, 47127, new Class[]{Object.class}, Object.class);
        if (patchProxyResultProxy.isSupported) {
            return patchProxyResultProxy.result;
        }
        this.f94325c = obj;
        this.f94327e |= Integer.MIN_VALUE;
        return WebFragmentDialog.X3(this.f94326d, this);
    }
}
