package com.heybox.imageviewer.adapter;

import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.PatchProxyResult;
import dl.e;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.d;

/* JADX INFO: compiled from: Repository.kt */
/* JADX INFO: loaded from: classes7.dex */
@d(c = "com.heybox.imageviewer.adapter.Repository$dataSource$1", f = "Repository.kt", i = {0, 0, 1, 1}, l = {60, 71}, m = "load", n = {"this", "params", "this", "params"}, s = {"L$0", "L$1", "L$0", "L$1"})
public final class Repository$dataSource$1$load$1 extends ContinuationImpl {
    public static ChangeQuickRedirect changeQuickRedirect;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    Object f59709b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    Object f59710c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    Object f59711d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    /* synthetic */ Object f59712e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    final /* synthetic */ Repository$dataSource$1 f59713f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    int f59714g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    Repository$dataSource$1$load$1(Repository$dataSource$1 repository$dataSource$1, kotlin.coroutines.c<? super Repository$dataSource$1$load$1> cVar) {
        super(cVar);
        this.f59713f = repository$dataSource$1;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @e
    public final Object invokeSuspend(@dl.d Object obj) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{obj}, this, changeQuickRedirect, false, 112, new Class[]{Object.class}, Object.class);
        if (patchProxyResultProxy.isSupported) {
            return patchProxyResultProxy.result;
        }
        this.f59712e = obj;
        this.f59714g |= Integer.MIN_VALUE;
        return this.f59713f.h(null, this);
    }
}
