package com.max.hbexpression;

import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.PatchProxyResult;
import kotlin.b2;
import kotlin.jvm.internal.FunctionReferenceImpl;

/* JADX INFO: compiled from: ExpressionPackGridFragmentV2.kt */
/* JADX INFO: loaded from: classes10.dex */
public final /* synthetic */ class ExpressionPackGridFragmentV2$initRecentUsedExpression$1$3 extends FunctionReferenceImpl implements yh.a<b2> {
    public static ChangeQuickRedirect changeQuickRedirect;

    ExpressionPackGridFragmentV2$initRecentUsedExpression$1$3(Object obj) {
        super(0, obj, ExpressionPackGridFragmentV2.class, "onExpressionClickUp", "onExpressionClickUp()V", 0);
    }

    public final void i() {
        if (PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, bb.c.g.Y, new Class[0], Void.TYPE).isSupported) {
            return;
        }
        ExpressionPackGridFragmentV2.V3((ExpressionPackGridFragmentV2) this.receiver);
    }

    /* JADX WARN: Type inference failed for: r0v3, types: [java.lang.Object, kotlin.b2] */
    @Override // yh.a
    public /* bridge */ /* synthetic */ b2 invoke() {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, bb.c.g.Z, new Class[0], Object.class);
        if (patchProxyResultProxy.isSupported) {
            return patchProxyResultProxy.result;
        }
        i();
        return b2.f124493a;
    }
}
