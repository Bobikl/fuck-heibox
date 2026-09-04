package com.max.xiaoheihe.flutter;

import android.content.Context;
import androidx.compose.runtime.internal.o;
import com.max.xiaoheihe.okflutter.executors.ProtocolExecutor;
import com.max.xiaoheihe.okflutter.pigeon.IHeyboxProtocol;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.PatchProxyResult;
import dl.e;
import kotlin.b2;
import kotlin.coroutines.c;
import kotlin.coroutines.intrinsics.IntrinsicsKt__IntrinsicsJvmKt;
import kotlin.coroutines.intrinsics.b;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.coroutines.jvm.internal.d;
import kotlin.coroutines.jvm.internal.f;
import kotlin.jvm.internal.Ref;
import kotlin.jvm.internal.f0;
import kotlin.jvm.internal.t0;
import kotlin.text.StringsKt__StringsKt;
import kotlinx.coroutines.e1;
import kotlinx.coroutines.i;
import kotlinx.coroutines.k;
import kotlinx.coroutines.n2;
import kotlinx.coroutines.q;
import kotlinx.coroutines.q0;
import kotlinx.coroutines.r0;
import yh.p;

/* JADX INFO: compiled from: HBProtocolExecutor.kt */
/* JADX INFO: loaded from: classes3.dex */
@t0({"SMAP\nHBProtocolExecutor.kt\nKotlin\n*S Kotlin\n*F\n+ 1 HBProtocolExecutor.kt\ncom/max/xiaoheihe/flutter/HBProtocolExecutor\n+ 2 CancellableContinuation.kt\nkotlinx/coroutines/CancellableContinuationKt\n*L\n1#1,68:1\n314#2,11:69\n*S KotlinDebug\n*F\n+ 1 HBProtocolExecutor.kt\ncom/max/xiaoheihe/flutter/HBProtocolExecutor\n*L\n45#1:69,11\n*E\n"})
@o(parameters = 0)
public final class HBProtocolExecutor implements ProtocolExecutor {
    public static final int $stable = 0;
    public static ChangeQuickRedirect changeQuickRedirect;

    /* JADX INFO: renamed from: com.max.xiaoheihe.flutter.HBProtocolExecutor$execute$1, reason: invalid class name */
    /* JADX INFO: compiled from: HBProtocolExecutor.kt */
    @d(c = "com.max.xiaoheihe.flutter.HBProtocolExecutor$execute$1", f = "HBProtocolExecutor.kt", i = {}, l = {29}, m = "invokeSuspend", n = {}, s = {})
    public static final class AnonymousClass1 extends SuspendLambda implements p<q0, c<? super b2>, Object> {
        public static ChangeQuickRedirect changeQuickRedirect;
        final /* synthetic */ Context $context;
        final /* synthetic */ Ref.ObjectRef<String> $result;
        final /* synthetic */ Ref.ObjectRef<String> $url;
        int label;
        final /* synthetic */ HBProtocolExecutor this$0;

        /* JADX INFO: renamed from: com.max.xiaoheihe.flutter.HBProtocolExecutor$execute$1$1, reason: invalid class name and collision with other inner class name */
        /* JADX INFO: compiled from: HBProtocolExecutor.kt */
        @d(c = "com.max.xiaoheihe.flutter.HBProtocolExecutor$execute$1$1", f = "HBProtocolExecutor.kt", i = {}, l = {30}, m = "invokeSuspend", n = {}, s = {})
        public static final class C06291 extends SuspendLambda implements p<q0, c<? super b2>, Object> {
            public static ChangeQuickRedirect changeQuickRedirect;
            final /* synthetic */ Context $context;
            final /* synthetic */ Ref.ObjectRef<String> $result;
            final /* synthetic */ Ref.ObjectRef<String> $url;
            Object L$0;
            int label;
            final /* synthetic */ HBProtocolExecutor this$0;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            C06291(Ref.ObjectRef<String> objectRef, HBProtocolExecutor hBProtocolExecutor, Context context, Ref.ObjectRef<String> objectRef2, c<? super C06291> cVar) {
                super(2, cVar);
                this.$result = objectRef;
                this.this$0 = hBProtocolExecutor;
                this.$context = context;
                this.$url = objectRef2;
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            @dl.d
            public final c<b2> create(@e Object obj, @dl.d c<?> cVar) {
                PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{obj, cVar}, this, changeQuickRedirect, false, 22022, new Class[]{Object.class, c.class}, c.class);
                return patchProxyResultProxy.isSupported ? (c) patchProxyResultProxy.result : new C06291(this.$result, this.this$0, this.$context, this.$url, cVar);
            }

            @Override // yh.p
            public /* bridge */ /* synthetic */ Object invoke(q0 q0Var, c<? super b2> cVar) {
                PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{q0Var, cVar}, this, changeQuickRedirect, false, 22024, new Class[]{Object.class, Object.class}, Object.class);
                return patchProxyResultProxy.isSupported ? patchProxyResultProxy.result : invoke2(q0Var, cVar);
            }

            @e
            /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
            public final Object invoke2(@dl.d q0 q0Var, @e c<? super b2> cVar) {
                PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{q0Var, cVar}, this, changeQuickRedirect, false, 22023, new Class[]{q0.class, c.class}, Object.class);
                return patchProxyResultProxy.isSupported ? patchProxyResultProxy.result : ((C06291) create(q0Var, cVar)).invokeSuspend(b2.f124493a);
            }

            /* JADX WARN: Multi-variable type inference failed */
            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            @e
            public final Object invokeSuspend(@dl.d Object obj) throws Throwable {
                Ref.ObjectRef<String> objectRef;
                T t10;
                PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{obj}, this, changeQuickRedirect, false, 22021, new Class[]{Object.class}, Object.class);
                if (patchProxyResultProxy.isSupported) {
                    return patchProxyResultProxy.result;
                }
                Object objH = b.h();
                int i10 = this.label;
                if (i10 == 0) {
                    kotlin.t0.n(obj);
                    Ref.ObjectRef<String> objectRef2 = this.$result;
                    HBProtocolExecutor hBProtocolExecutor = this.this$0;
                    Context context = this.$context;
                    String str = this.$url.f124891b;
                    this.L$0 = objectRef2;
                    this.label = 1;
                    Object objExecuteProtocol = hBProtocolExecutor.executeProtocol(context, str, this);
                    if (objExecuteProtocol == objH) {
                        return objH;
                    }
                    objectRef = objectRef2;
                    t10 = objExecuteProtocol;
                } else {
                    if (i10 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    objectRef = (Ref.ObjectRef) this.L$0;
                    kotlin.t0.n(obj);
                    t10 = obj;
                }
                objectRef.f124891b = t10;
                return b2.f124493a;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        AnonymousClass1(Ref.ObjectRef<String> objectRef, HBProtocolExecutor hBProtocolExecutor, Context context, Ref.ObjectRef<String> objectRef2, c<? super AnonymousClass1> cVar) {
            super(2, cVar);
            this.$result = objectRef;
            this.this$0 = hBProtocolExecutor;
            this.$context = context;
            this.$url = objectRef2;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @dl.d
        public final c<b2> create(@e Object obj, @dl.d c<?> cVar) {
            PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{obj, cVar}, this, changeQuickRedirect, false, 22018, new Class[]{Object.class, c.class}, c.class);
            return patchProxyResultProxy.isSupported ? (c) patchProxyResultProxy.result : new AnonymousClass1(this.$result, this.this$0, this.$context, this.$url, cVar);
        }

        @Override // yh.p
        public /* bridge */ /* synthetic */ Object invoke(q0 q0Var, c<? super b2> cVar) {
            PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{q0Var, cVar}, this, changeQuickRedirect, false, 22020, new Class[]{Object.class, Object.class}, Object.class);
            return patchProxyResultProxy.isSupported ? patchProxyResultProxy.result : invoke2(q0Var, cVar);
        }

        @e
        /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
        public final Object invoke2(@dl.d q0 q0Var, @e c<? super b2> cVar) {
            PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{q0Var, cVar}, this, changeQuickRedirect, false, 22019, new Class[]{q0.class, c.class}, Object.class);
            return patchProxyResultProxy.isSupported ? patchProxyResultProxy.result : ((AnonymousClass1) create(q0Var, cVar)).invokeSuspend(b2.f124493a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @e
        public final Object invokeSuspend(@dl.d Object obj) throws Throwable {
            PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{obj}, this, changeQuickRedirect, false, 22017, new Class[]{Object.class}, Object.class);
            if (patchProxyResultProxy.isSupported) {
                return patchProxyResultProxy.result;
            }
            Object objH = b.h();
            int i10 = this.label;
            if (i10 == 0) {
                kotlin.t0.n(obj);
                n2 n2VarE = e1.e();
                C06291 c06291 = new C06291(this.$result, this.this$0, this.$context, this.$url, null);
                this.label = 1;
                if (i.h(n2VarE, c06291, this) == objH) {
                    return objH;
                }
            } else {
                if (i10 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                kotlin.t0.n(obj);
            }
            return b2.f124493a;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r15v6, types: [T, java.lang.String] */
    @Override // com.max.xiaoheihe.okflutter.executors.ProtocolExecutor
    @dl.d
    public IHeyboxProtocol.ProtocolResponse execute(@dl.d Context context, @dl.d String protocol) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{context, protocol}, this, changeQuickRedirect, false, 22015, new Class[]{Context.class, String.class}, IHeyboxProtocol.ProtocolResponse.class);
        if (patchProxyResultProxy.isSupported) {
            return (IHeyboxProtocol.ProtocolResponse) patchProxyResultProxy.result;
        }
        f0.p(context, "context");
        f0.p(protocol, "protocol");
        Ref.ObjectRef objectRef = new Ref.ObjectRef();
        objectRef.f124891b = protocol;
        if (StringsKt__StringsKt.e5(protocol, '{', false, 2, null)) {
            objectRef.f124891b = "heybox://" + protocol;
        }
        long j10 = 0;
        Ref.ObjectRef objectRef2 = new Ref.ObjectRef();
        try {
            k.f(r0.a(e1.e()), null, null, new AnonymousClass1(objectRef2, this, context, objectRef, null), 3, null);
        } catch (Exception unused) {
            j10 = -1;
        }
        IHeyboxProtocol.ProtocolResponse protocolResponseBuild = new IHeyboxProtocol.ProtocolResponse.Builder().setResult((String) objectRef2.f124891b).setResultCode(Long.valueOf(j10)).build();
        f0.o(protocolResponseBuild, "Builder()\n            .s…ode)\n            .build()");
        return protocolResponseBuild;
    }

    @e
    public final Object executeProtocol(@dl.d Context context, @dl.d String str, @dl.d c<? super String> cVar) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{context, str, cVar}, this, changeQuickRedirect, false, 22016, new Class[]{Context.class, String.class, c.class}, Object.class);
        if (patchProxyResultProxy.isSupported) {
            return patchProxyResultProxy.result;
        }
        final q qVar = new q(IntrinsicsKt__IntrinsicsJvmKt.d(cVar), 1);
        qVar.F0();
        hg.b.t(context, str, new com.sankuai.waimai.router.core.d() { // from class: com.max.xiaoheihe.flutter.HBProtocolExecutor$executeProtocol$2$1
            public static ChangeQuickRedirect changeQuickRedirect;

            @Override // com.sankuai.waimai.router.core.d
            public void onError(@dl.d com.sankuai.waimai.router.core.i request, int i10) {
                if (PatchProxy.proxy(new Object[]{request, new Integer(i10)}, this, changeQuickRedirect, false, 22026, new Class[]{com.sankuai.waimai.router.core.i.class, Integer.TYPE}, Void.TYPE).isSupported) {
                    return;
                }
                f0.p(request, "request");
                qVar.I0((String) request.d(String.class, com.max.xiaoheihe.router.c.f94908n), null);
            }

            @Override // com.sankuai.waimai.router.core.d
            public void onSuccess(@dl.d com.sankuai.waimai.router.core.i request) {
                if (PatchProxy.proxy(new Object[]{request}, this, changeQuickRedirect, false, 22025, new Class[]{com.sankuai.waimai.router.core.i.class}, Void.TYPE).isSupported) {
                    return;
                }
                f0.p(request, "request");
                qVar.I0((String) request.d(String.class, com.max.xiaoheihe.router.c.f94908n), null);
            }
        });
        Object objT = qVar.t();
        if (objT == b.h()) {
            f.c(cVar);
        }
        return objT;
    }
}
