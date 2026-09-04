package com.max.xiaoheihe.module.voice;

import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.PatchProxyResult;
import dl.e;
import kotlin.b2;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.coroutines.jvm.internal.d;
import kotlin.jvm.internal.t0;
import kotlinx.coroutines.flow.f;
import kotlinx.coroutines.flow.u;
import kotlinx.coroutines.q0;
import yh.p;

/* JADX INFO: compiled from: HeyboxMicFragment.kt */
/* JADX INFO: loaded from: classes12.dex */
@t0({"SMAP\nHeyboxMicFragment.kt\nKotlin\n*S Kotlin\n*F\n+ 1 HeyboxMicFragment.kt\ncom/max/xiaoheihe/module/voice/HeyboxMicFragment$installViews$5\n+ 2 Transform.kt\nkotlinx/coroutines/flow/FlowKt__TransformKt\n+ 3 Emitters.kt\nkotlinx/coroutines/flow/FlowKt__EmittersKt\n+ 4 SafeCollector.common.kt\nkotlinx/coroutines/flow/internal/SafeCollector_commonKt\n*L\n1#1,614:1\n47#2:615\n49#2:619\n50#3:616\n55#3:618\n106#4:617\n*S KotlinDebug\n*F\n+ 1 HeyboxMicFragment.kt\ncom/max/xiaoheihe/module/voice/HeyboxMicFragment$installViews$5\n*L\n161#1:615\n161#1:619\n161#1:616\n161#1:618\n161#1:617\n*E\n"})
@d(c = "com.max.xiaoheihe.module.voice.HeyboxMicFragment$installViews$5", f = "HeyboxMicFragment.kt", i = {}, l = {163}, m = "invokeSuspend", n = {}, s = {})
public final class HeyboxMicFragment$installViews$5 extends SuspendLambda implements p<q0, kotlin.coroutines.c<? super b2>, Object> {
    public static ChangeQuickRedirect changeQuickRedirect;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    int f93912b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    final /* synthetic */ HeyboxMicFragment f93913c;

    /* JADX INFO: compiled from: HeyboxMicFragment.kt */
    public static final class a implements f<Boolean> {
        public static ChangeQuickRedirect changeQuickRedirect;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ HeyboxMicFragment f93914b;

        a(HeyboxMicFragment heyboxMicFragment) {
            this.f93914b = heyboxMicFragment;
        }

        @e
        public final Object a(boolean z10, @dl.d kotlin.coroutines.c<? super b2> cVar) {
            PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{new Byte(z10 ? (byte) 1 : (byte) 0), cVar}, this, changeQuickRedirect, false, 46611, new Class[]{Boolean.TYPE, kotlin.coroutines.c.class}, Object.class);
            if (patchProxyResultProxy.isSupported) {
                return patchProxyResultProxy.result;
            }
            if (z10) {
                HeyboxMicFragment.J4(this.f93914b).t();
            }
            return b2.f124493a;
        }

        @Override // kotlinx.coroutines.flow.f
        public /* bridge */ /* synthetic */ Object emit(Boolean bool, kotlin.coroutines.c cVar) {
            PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{bool, cVar}, this, changeQuickRedirect, false, 46612, new Class[]{Object.class, kotlin.coroutines.c.class}, Object.class);
            return patchProxyResultProxy.isSupported ? patchProxyResultProxy.result : a(bool.booleanValue(), cVar);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    HeyboxMicFragment$installViews$5(HeyboxMicFragment heyboxMicFragment, kotlin.coroutines.c<? super HeyboxMicFragment$installViews$5> cVar) {
        super(2, cVar);
        this.f93913c = heyboxMicFragment;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @dl.d
    public final kotlin.coroutines.c<b2> create(@e Object obj, @dl.d kotlin.coroutines.c<?> cVar) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{obj, cVar}, this, changeQuickRedirect, false, 46608, new Class[]{Object.class, kotlin.coroutines.c.class}, kotlin.coroutines.c.class);
        return patchProxyResultProxy.isSupported ? (kotlin.coroutines.c) patchProxyResultProxy.result : new HeyboxMicFragment$installViews$5(this.f93913c, cVar);
    }

    @Override // yh.p
    public /* bridge */ /* synthetic */ Object invoke(q0 q0Var, kotlin.coroutines.c<? super b2> cVar) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{q0Var, cVar}, this, changeQuickRedirect, false, 46610, new Class[]{Object.class, Object.class}, Object.class);
        return patchProxyResultProxy.isSupported ? patchProxyResultProxy.result : invoke2(q0Var, cVar);
    }

    @e
    /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
    public final Object invoke2(@dl.d q0 q0Var, @e kotlin.coroutines.c<? super b2> cVar) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{q0Var, cVar}, this, changeQuickRedirect, false, 46609, new Class[]{q0.class, kotlin.coroutines.c.class}, Object.class);
        return patchProxyResultProxy.isSupported ? patchProxyResultProxy.result : ((HeyboxMicFragment$installViews$5) create(q0Var, cVar)).invokeSuspend(b2.f124493a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @e
    public final Object invokeSuspend(@dl.d Object obj) throws Throwable {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{obj}, this, changeQuickRedirect, false, 46607, new Class[]{Object.class}, Object.class);
        if (patchProxyResultProxy.isSupported) {
            return patchProxyResultProxy.result;
        }
        Object objH = kotlin.coroutines.intrinsics.b.h();
        int i10 = this.f93912b;
        if (i10 == 0) {
            kotlin.t0.n(obj);
            final u<com.max.xiaoheihe.module.voice.a> uVarX = HeyboxMicFragment.J4(this.f93913c).x();
            kotlinx.coroutines.flow.e<Boolean> eVar = new kotlinx.coroutines.flow.e<Boolean>() { // from class: com.max.xiaoheihe.module.voice.HeyboxMicFragment$installViews$5$invokeSuspend$$inlined$map$1
                public static ChangeQuickRedirect changeQuickRedirect;

                /* JADX INFO: renamed from: com.max.xiaoheihe.module.voice.HeyboxMicFragment$installViews$5$invokeSuspend$$inlined$map$1$2, reason: invalid class name */
                /* JADX INFO: compiled from: Emitters.kt */
                @t0({"SMAP\nEmitters.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Emitters.kt\nkotlinx/coroutines/flow/FlowKt__EmittersKt$unsafeTransform$1$1\n+ 2 Transform.kt\nkotlinx/coroutines/flow/FlowKt__TransformKt\n+ 3 HeyboxMicFragment.kt\ncom/max/xiaoheihe/module/voice/HeyboxMicFragment$installViews$5\n*L\n1#1,222:1\n48#2:223\n162#3:224\n*E\n"})
                public static final class AnonymousClass2<T> implements f {
                    public static ChangeQuickRedirect changeQuickRedirect;

                    /* JADX INFO: renamed from: b, reason: collision with root package name */
                    final /* synthetic */ f f93916b;

                    /* JADX INFO: renamed from: com.max.xiaoheihe.module.voice.HeyboxMicFragment$installViews$5$invokeSuspend$$inlined$map$1$2$1, reason: invalid class name */
                    /* JADX INFO: compiled from: Emitters.kt */
                    @t0({"SMAP\nEmitters.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Emitters.kt\nkotlinx/coroutines/flow/FlowKt__EmittersKt$unsafeTransform$1$1$emit$1\n*L\n1#1,222:1\n*E\n"})
                    @d(c = "com.max.xiaoheihe.module.voice.HeyboxMicFragment$installViews$5$invokeSuspend$$inlined$map$1$2", f = "HeyboxMicFragment.kt", i = {}, l = {bb.c.b.f30852p1}, m = "emit", n = {}, s = {})
                    public static final class AnonymousClass1 extends ContinuationImpl {
                        public static ChangeQuickRedirect changeQuickRedirect;

                        /* JADX INFO: renamed from: b, reason: collision with root package name */
                        /* synthetic */ Object f93917b;

                        /* JADX INFO: renamed from: c, reason: collision with root package name */
                        int f93918c;

                        /* JADX INFO: renamed from: d, reason: collision with root package name */
                        Object f93919d;

                        public AnonymousClass1(kotlin.coroutines.c cVar) {
                            super(cVar);
                        }

                        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                        @e
                        public final Object invokeSuspend(@dl.d Object obj) {
                            PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{obj}, this, changeQuickRedirect, false, 46615, new Class[]{Object.class}, Object.class);
                            if (patchProxyResultProxy.isSupported) {
                                return patchProxyResultProxy.result;
                            }
                            this.f93917b = obj;
                            this.f93918c |= Integer.MIN_VALUE;
                            return AnonymousClass2.this.emit(null, this);
                        }
                    }

                    public AnonymousClass2(f fVar) {
                        this.f93916b = fVar;
                    }

                    /* JADX WARN: Code duplicated, block: B:11:0x003a  */
                    @Override // kotlinx.coroutines.flow.f
                    @e
                    public final Object emit(Object obj, @dl.d kotlin.coroutines.c cVar) throws Throwable {
                        AnonymousClass1 anonymousClass1;
                        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{obj, cVar}, this, changeQuickRedirect, false, 46614, new Class[]{Object.class, kotlin.coroutines.c.class}, Object.class);
                        if (patchProxyResultProxy.isSupported) {
                            return patchProxyResultProxy.result;
                        }
                        if (cVar instanceof AnonymousClass1) {
                            anonymousClass1 = (AnonymousClass1) cVar;
                            int i10 = anonymousClass1.f93918c;
                            if ((i10 & Integer.MIN_VALUE) != 0) {
                                anonymousClass1.f93918c = i10 - Integer.MIN_VALUE;
                            } else {
                                anonymousClass1 = new AnonymousClass1(cVar);
                            }
                        } else {
                            anonymousClass1 = new AnonymousClass1(cVar);
                        }
                        Object obj2 = anonymousClass1.f93917b;
                        Object objH = kotlin.coroutines.intrinsics.b.h();
                        int i11 = anonymousClass1.f93918c;
                        if (i11 == 0) {
                            kotlin.t0.n(obj2);
                            f fVar = this.f93916b;
                            Boolean boolA = kotlin.coroutines.jvm.internal.a.a(((a) obj).w());
                            anonymousClass1.f93918c = 1;
                            if (fVar.emit(boolA, anonymousClass1) == objH) {
                                return objH;
                            }
                        } else {
                            if (i11 != 1) {
                                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                            }
                            kotlin.t0.n(obj2);
                        }
                        return b2.f124493a;
                    }
                }

                @Override // kotlinx.coroutines.flow.e
                @e
                public Object a(@dl.d f<? super Boolean> fVar, @dl.d kotlin.coroutines.c cVar) {
                    PatchProxyResult patchProxyResultProxy2 = PatchProxy.proxy(new Object[]{fVar, cVar}, this, changeQuickRedirect, false, 46613, new Class[]{f.class, kotlin.coroutines.c.class}, Object.class);
                    if (patchProxyResultProxy2.isSupported) {
                        return patchProxyResultProxy2.result;
                    }
                    Object objA = uVarX.a(new AnonymousClass2(fVar), cVar);
                    return objA == kotlin.coroutines.intrinsics.b.h() ? objA : b2.f124493a;
                }
            };
            a aVar = new a(this.f93913c);
            this.f93912b = 1;
            if (eVar.a(aVar, this) == objH) {
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
