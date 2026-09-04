package com.starlightc.ucropplus.ui;

import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.PatchProxyResult;
import kotlin.b2;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.t0;

/* JADX INFO: compiled from: TextStyleFragment.kt */
/* JADX INFO: loaded from: classes4.dex */
@kotlin.coroutines.jvm.internal.d(c = "com.starlightc.ucropplus.ui.TextStyleFragment$installViews$3$1", f = "TextStyleFragment.kt", i = {}, l = {124}, m = "invokeSuspend", n = {}, s = {})
public final class TextStyleFragment$installViews$3$1 extends SuspendLambda implements yh.l<kotlin.coroutines.c<? super b2>, Object> {
    public static ChangeQuickRedirect changeQuickRedirect;
    int label;
    final /* synthetic */ TextStyleFragment this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    TextStyleFragment$installViews$3$1(TextStyleFragment textStyleFragment, kotlin.coroutines.c<? super TextStyleFragment$installViews$3$1> cVar) {
        super(1, cVar);
        this.this$0 = textStyleFragment;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @dl.d
    public final kotlin.coroutines.c<b2> create(@dl.d kotlin.coroutines.c<?> cVar) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{cVar}, this, changeQuickRedirect, false, 50560, new Class[]{kotlin.coroutines.c.class}, kotlin.coroutines.c.class);
        return patchProxyResultProxy.isSupported ? (kotlin.coroutines.c) patchProxyResultProxy.result : new TextStyleFragment$installViews$3$1(this.this$0, cVar);
    }

    @Override // yh.l
    public /* bridge */ /* synthetic */ Object invoke(kotlin.coroutines.c<? super b2> cVar) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{cVar}, this, changeQuickRedirect, false, 50562, new Class[]{Object.class}, Object.class);
        return patchProxyResultProxy.isSupported ? patchProxyResultProxy.result : invoke2(cVar);
    }

    @dl.e
    /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
    public final Object invoke2(@dl.e kotlin.coroutines.c<? super b2> cVar) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{cVar}, this, changeQuickRedirect, false, 50561, new Class[]{kotlin.coroutines.c.class}, Object.class);
        return patchProxyResultProxy.isSupported ? patchProxyResultProxy.result : ((TextStyleFragment$installViews$3$1) create(cVar)).invokeSuspend(b2.f124493a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @dl.e
    public final Object invokeSuspend(@dl.d Object obj) throws Throwable {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{obj}, this, changeQuickRedirect, false, 50559, new Class[]{Object.class}, Object.class);
        if (patchProxyResultProxy.isSupported) {
            return patchProxyResultProxy.result;
        }
        Object objH = kotlin.coroutines.intrinsics.b.h();
        int i10 = this.label;
        if (i10 == 0) {
            t0.n(obj);
            this.this$0.mOffset += this.this$0.mLimit;
            TextStyleFragment textStyleFragment = this.this$0;
            this.label = 1;
            if (textStyleFragment.getAdvanceTypefaceList(this) == objH) {
                return objH;
            }
        } else {
            if (i10 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            t0.n(obj);
        }
        return b2.f124493a;
    }
}
