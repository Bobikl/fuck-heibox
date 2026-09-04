package com.max.hbexpression;

import android.view.View;
import com.max.hbexpression.bean.ExpressionObj;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.PatchProxyResult;
import kotlin.jvm.internal.FunctionReferenceImpl;
import kotlin.jvm.internal.f0;

/* JADX INFO: compiled from: ExpressionPackGridFragmentV2.kt */
/* JADX INFO: loaded from: classes10.dex */
public final /* synthetic */ class ExpressionPackGridFragmentV2$initRecentUsedExpression$1$2 extends FunctionReferenceImpl implements yh.p<ExpressionObj, View, Boolean> {
    public static ChangeQuickRedirect changeQuickRedirect;

    ExpressionPackGridFragmentV2$initRecentUsedExpression$1$2(Object obj) {
        super(2, obj, ExpressionPackGridFragmentV2.class, "onSmallExpressionLongClick", "onSmallExpressionLongClick(Lcom/max/hbexpression/bean/ExpressionObj;Landroid/view/View;)Z", 0);
    }

    @dl.d
    public final Boolean i(@dl.d ExpressionObj p10, @dl.d View p11) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{p10, p11}, this, changeQuickRedirect, false, bb.c.g.W, new Class[]{ExpressionObj.class, View.class}, Boolean.class);
        if (patchProxyResultProxy.isSupported) {
            return (Boolean) patchProxyResultProxy.result;
        }
        f0.p(p10, "p0");
        f0.p(p11, "p1");
        return Boolean.valueOf(ExpressionPackGridFragmentV2.W3((ExpressionPackGridFragmentV2) this.receiver, p10, p11));
    }

    /* JADX WARN: Type inference failed for: r10v3, types: [java.lang.Boolean, java.lang.Object] */
    @Override // yh.p
    public /* bridge */ /* synthetic */ Boolean invoke(ExpressionObj expressionObj, View view) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{expressionObj, view}, this, changeQuickRedirect, false, bb.c.g.X, new Class[]{Object.class, Object.class}, Object.class);
        return patchProxyResultProxy.isSupported ? patchProxyResultProxy.result : i(expressionObj, view);
    }
}
