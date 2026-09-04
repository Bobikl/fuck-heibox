package com.max.xiaoheihe.loader.dynamic_so;

import com.max.hbapkinstaller.g;
import com.max.xiaoheihe.loader.bean.dynamic_so.DynamicSoInfoObj;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.PatchProxyResult;
import dl.e;
import java.io.File;
import kotlin.b2;
import kotlin.coroutines.c;
import kotlin.coroutines.intrinsics.b;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.coroutines.jvm.internal.d;
import kotlin.jvm.internal.f0;
import kotlin.t0;
import kotlin.text.u;
import kotlinx.coroutines.q0;
import yh.p;

/* JADX INFO: compiled from: DynamicSoManager.kt */
/* JADX INFO: loaded from: classes3.dex */
@d(c = "com.max.xiaoheihe.loader.dynamic_so.DynamicSoManager$unZipSo$1", f = "DynamicSoManager.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
public final class DynamicSoManager$unZipSo$1 extends SuspendLambda implements p<q0, c<? super b2>, Object> {
    public static ChangeQuickRedirect changeQuickRedirect;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    int f77291b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    final /* synthetic */ File f77292c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    final /* synthetic */ DynamicSoManager f77293d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    final /* synthetic */ DynamicSoInfoObj f77294e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    DynamicSoManager$unZipSo$1(File file, DynamicSoManager dynamicSoManager, DynamicSoInfoObj dynamicSoInfoObj, c<? super DynamicSoManager$unZipSo$1> cVar) {
        super(2, cVar);
        this.f77292c = file;
        this.f77293d = dynamicSoManager;
        this.f77294e = dynamicSoInfoObj;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @dl.d
    public final c<b2> create(@e Object obj, @dl.d c<?> cVar) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{obj, cVar}, this, changeQuickRedirect, false, 22097, new Class[]{Object.class, c.class}, c.class);
        return patchProxyResultProxy.isSupported ? (c) patchProxyResultProxy.result : new DynamicSoManager$unZipSo$1(this.f77292c, this.f77293d, this.f77294e, cVar);
    }

    @Override // yh.p
    public /* bridge */ /* synthetic */ Object invoke(q0 q0Var, c<? super b2> cVar) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{q0Var, cVar}, this, changeQuickRedirect, false, 22099, new Class[]{Object.class, Object.class}, Object.class);
        return patchProxyResultProxy.isSupported ? patchProxyResultProxy.result : invoke2(q0Var, cVar);
    }

    @e
    /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
    public final Object invoke2(@dl.d q0 q0Var, @e c<? super b2> cVar) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{q0Var, cVar}, this, changeQuickRedirect, false, 22098, new Class[]{q0.class, c.class}, Object.class);
        return patchProxyResultProxy.isSupported ? patchProxyResultProxy.result : ((DynamicSoManager$unZipSo$1) create(q0Var, cVar)).invokeSuspend(b2.f124493a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @e
    public final Object invokeSuspend(@dl.d Object obj) throws Throwable {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{obj}, this, changeQuickRedirect, false, 22096, new Class[]{Object.class}, Object.class);
        if (patchProxyResultProxy.isSupported) {
            return patchProxyResultProxy.result;
        }
        b.h();
        if (this.f77291b != 0) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        t0.n(obj);
        String absolutePath = this.f77292c.getAbsolutePath();
        f0.o(absolutePath, "getAbsolutePath(...)");
        if (u.K1(absolutePath, DynamicSoManager.f77250e, false, 2, null)) {
            this.f77293d.l(this.f77294e);
        } else {
            try {
                g gVar = g.f65809a;
                String absolutePath2 = this.f77292c.getAbsolutePath();
                f0.o(absolutePath2, "getAbsolutePath(...)");
                gVar.f(absolutePath2, DynamicSoManager.f77251f);
                if (new File(DynamicSoManager.f77251f + this.f77294e.getKey() + DynamicSoManager.f77250e).exists()) {
                    this.f77293d.l(this.f77294e);
                }
            } catch (Throwable th2) {
                try {
                    com.max.heybox.hblog.g.f74531b.v("DynamicSoManager unZipSo   key: " + this.f77294e.getKey() + "  error: " + th2.getMessage());
                } finally {
                    this.f77292c.delete();
                }
            }
        }
        return b2.f124493a;
    }
}
