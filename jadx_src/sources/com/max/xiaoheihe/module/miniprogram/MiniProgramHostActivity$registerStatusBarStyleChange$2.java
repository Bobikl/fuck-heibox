package com.max.xiaoheihe.module.miniprogram;

import com.max.heybox.hblog.g;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.PatchProxyResult;
import dl.e;
import kotlin.KotlinNothingValueException;
import kotlin.b2;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.t0;
import kotlinx.coroutines.flow.f;
import kotlinx.coroutines.flow.u;
import kotlinx.coroutines.q0;
import yh.p;

/* JADX INFO: compiled from: MiniProgramHostActivity.kt */
/* JADX INFO: loaded from: classes11.dex */
@kotlin.coroutines.jvm.internal.d(c = "com.max.xiaoheihe.module.miniprogram.MiniProgramHostActivity$registerStatusBarStyleChange$2", f = "MiniProgramHostActivity.kt", i = {}, l = {188}, m = "invokeSuspend", n = {}, s = {})
public final class MiniProgramHostActivity$registerStatusBarStyleChange$2 extends SuspendLambda implements p<q0, kotlin.coroutines.c<? super b2>, Object> {
    public static ChangeQuickRedirect changeQuickRedirect;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    int f91073b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private /* synthetic */ Object f91074c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    final /* synthetic */ MiniProgramHostActivity f91075d;

    /* JADX INFO: compiled from: MiniProgramHostActivity.kt */
    public static final class a implements f<Boolean> {
        public static ChangeQuickRedirect changeQuickRedirect;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ q0 f91076b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ MiniProgramHostActivity f91077c;

        a(q0 q0Var, MiniProgramHostActivity miniProgramHostActivity) {
            this.f91076b = q0Var;
            this.f91077c = miniProgramHostActivity;
        }

        @e
        public final Object a(boolean z10, @dl.d kotlin.coroutines.c<? super b2> cVar) {
            PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{new Byte(z10 ? (byte) 1 : (byte) 0), cVar}, this, changeQuickRedirect, false, 42217, new Class[]{Boolean.TYPE, kotlin.coroutines.c.class}, Object.class);
            if (patchProxyResultProxy.isSupported) {
                return patchProxyResultProxy.result;
            }
            g.f74531b.q("MiniProgramHostActivity(" + this.f91076b + "), registerStatusBarStyleChange, setOnApplyWindowInsetsListener, isAppearanceLightStatusBars = " + z10);
            MiniProgramHostActivity.Z3(this.f91077c);
            return b2.f124493a;
        }

        @Override // kotlinx.coroutines.flow.f
        public /* bridge */ /* synthetic */ Object emit(Boolean bool, kotlin.coroutines.c cVar) {
            PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{bool, cVar}, this, changeQuickRedirect, false, 42218, new Class[]{Object.class, kotlin.coroutines.c.class}, Object.class);
            return patchProxyResultProxy.isSupported ? patchProxyResultProxy.result : a(bool.booleanValue(), cVar);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    MiniProgramHostActivity$registerStatusBarStyleChange$2(MiniProgramHostActivity miniProgramHostActivity, kotlin.coroutines.c<? super MiniProgramHostActivity$registerStatusBarStyleChange$2> cVar) {
        super(2, cVar);
        this.f91075d = miniProgramHostActivity;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @dl.d
    public final kotlin.coroutines.c<b2> create(@e Object obj, @dl.d kotlin.coroutines.c<?> cVar) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{obj, cVar}, this, changeQuickRedirect, false, 42214, new Class[]{Object.class, kotlin.coroutines.c.class}, kotlin.coroutines.c.class);
        if (patchProxyResultProxy.isSupported) {
            return (kotlin.coroutines.c) patchProxyResultProxy.result;
        }
        MiniProgramHostActivity$registerStatusBarStyleChange$2 miniProgramHostActivity$registerStatusBarStyleChange$2 = new MiniProgramHostActivity$registerStatusBarStyleChange$2(this.f91075d, cVar);
        miniProgramHostActivity$registerStatusBarStyleChange$2.f91074c = obj;
        return miniProgramHostActivity$registerStatusBarStyleChange$2;
    }

    @Override // yh.p
    public /* bridge */ /* synthetic */ Object invoke(q0 q0Var, kotlin.coroutines.c<? super b2> cVar) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{q0Var, cVar}, this, changeQuickRedirect, false, 42216, new Class[]{Object.class, Object.class}, Object.class);
        return patchProxyResultProxy.isSupported ? patchProxyResultProxy.result : invoke2(q0Var, cVar);
    }

    @e
    /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
    public final Object invoke2(@dl.d q0 q0Var, @e kotlin.coroutines.c<? super b2> cVar) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{q0Var, cVar}, this, changeQuickRedirect, false, 42215, new Class[]{q0.class, kotlin.coroutines.c.class}, Object.class);
        return patchProxyResultProxy.isSupported ? patchProxyResultProxy.result : ((MiniProgramHostActivity$registerStatusBarStyleChange$2) create(q0Var, cVar)).invokeSuspend(b2.f124493a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @e
    public final Object invokeSuspend(@dl.d Object obj) throws Throwable {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{obj}, this, changeQuickRedirect, false, 42213, new Class[]{Object.class}, Object.class);
        if (patchProxyResultProxy.isSupported) {
            return patchProxyResultProxy.result;
        }
        Object objH = kotlin.coroutines.intrinsics.b.h();
        int i10 = this.f91073b;
        if (i10 == 0) {
            t0.n(obj);
            q0 q0Var = (q0) this.f91074c;
            u<Boolean> uVarO = MiniProgramHostActivity.V3(this.f91075d).o();
            a aVar = new a(q0Var, this.f91075d);
            this.f91073b = 1;
            if (uVarO.a(aVar, this) == objH) {
                return objH;
            }
        } else {
            if (i10 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            t0.n(obj);
        }
        throw new KotlinNothingValueException();
    }
}
