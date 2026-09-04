package com.max.xiaoheihe.module.voice;

import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.RepeatOnLifecycleKt;
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
import kotlinx.coroutines.flow.g;
import kotlinx.coroutines.flow.u;
import kotlinx.coroutines.k;
import kotlinx.coroutines.q0;
import yh.p;

/* JADX INFO: compiled from: HeyboxMicFragment.kt */
/* JADX INFO: loaded from: classes12.dex */
@d(c = "com.max.xiaoheihe.module.voice.HeyboxMicFragment$attachConnectStatusDialog$1", f = "HeyboxMicFragment.kt", i = {}, l = {263}, m = "invokeSuspend", n = {}, s = {})
public final class HeyboxMicFragment$attachConnectStatusDialog$1 extends SuspendLambda implements p<q0, kotlin.coroutines.c<? super b2>, Object> {
    public static ChangeQuickRedirect changeQuickRedirect;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    int f93785b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    final /* synthetic */ HeyboxMicFragment f93786c;

    /* JADX INFO: renamed from: com.max.xiaoheihe.module.voice.HeyboxMicFragment$attachConnectStatusDialog$1$1, reason: invalid class name */
    /* JADX INFO: compiled from: HeyboxMicFragment.kt */
    @d(c = "com.max.xiaoheihe.module.voice.HeyboxMicFragment$attachConnectStatusDialog$1$1", f = "HeyboxMicFragment.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
    public static final class AnonymousClass1 extends SuspendLambda implements p<q0, kotlin.coroutines.c<? super b2>, Object> {
        public static ChangeQuickRedirect changeQuickRedirect;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        int f93787b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private /* synthetic */ Object f93788c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        final /* synthetic */ HeyboxMicFragment f93789d;

        /* JADX INFO: renamed from: com.max.xiaoheihe.module.voice.HeyboxMicFragment$attachConnectStatusDialog$1$1$1, reason: invalid class name and collision with other inner class name */
        /* JADX INFO: compiled from: HeyboxMicFragment.kt */
        @t0({"SMAP\nHeyboxMicFragment.kt\nKotlin\n*S Kotlin\n*F\n+ 1 HeyboxMicFragment.kt\ncom/max/xiaoheihe/module/voice/HeyboxMicFragment$attachConnectStatusDialog$1$1$1\n+ 2 Transform.kt\nkotlinx/coroutines/flow/FlowKt__TransformKt\n+ 3 Emitters.kt\nkotlinx/coroutines/flow/FlowKt__EmittersKt\n+ 4 SafeCollector.common.kt\nkotlinx/coroutines/flow/internal/SafeCollector_commonKt\n*L\n1#1,614:1\n47#2:615\n49#2:619\n50#3:616\n55#3:618\n106#4:617\n*S KotlinDebug\n*F\n+ 1 HeyboxMicFragment.kt\ncom/max/xiaoheihe/module/voice/HeyboxMicFragment$attachConnectStatusDialog$1$1$1\n*L\n265#1:615\n265#1:619\n265#1:616\n265#1:618\n265#1:617\n*E\n"})
        @d(c = "com.max.xiaoheihe.module.voice.HeyboxMicFragment$attachConnectStatusDialog$1$1$1", f = "HeyboxMicFragment.kt", i = {}, l = {bb.c.b.f30669h2}, m = "invokeSuspend", n = {}, s = {})
        public static final class C08841 extends SuspendLambda implements p<q0, kotlin.coroutines.c<? super b2>, Object> {
            public static ChangeQuickRedirect changeQuickRedirect;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            int f93790b;

            /* JADX INFO: renamed from: c, reason: collision with root package name */
            final /* synthetic */ HeyboxMicFragment f93791c;

            /* JADX INFO: renamed from: com.max.xiaoheihe.module.voice.HeyboxMicFragment$attachConnectStatusDialog$1$1$1$a */
            /* JADX INFO: compiled from: HeyboxMicFragment.kt */
            public static final class a implements f<Boolean> {
                public static ChangeQuickRedirect changeQuickRedirect;

                /* JADX INFO: renamed from: b, reason: collision with root package name */
                final /* synthetic */ HeyboxMicFragment f93792b;

                a(HeyboxMicFragment heyboxMicFragment) {
                    this.f93792b = heyboxMicFragment;
                }

                @e
                public final Object a(boolean z10, @dl.d kotlin.coroutines.c<? super b2> cVar) {
                    PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{new Byte(z10 ? (byte) 1 : (byte) 0), cVar}, this, changeQuickRedirect, false, 46504, new Class[]{Boolean.TYPE, kotlin.coroutines.c.class}, Object.class);
                    if (patchProxyResultProxy.isSupported) {
                        return patchProxyResultProxy.result;
                    }
                    if (!z10 || HeyboxMicFragment.I4(this.f93792b).i()) {
                        HeyboxMicFragment.I4(this.f93792b).c();
                    } else {
                        HeyboxMicFragment.I4(this.f93792b).r();
                    }
                    return b2.f124493a;
                }

                @Override // kotlinx.coroutines.flow.f
                public /* bridge */ /* synthetic */ Object emit(Boolean bool, kotlin.coroutines.c cVar) {
                    PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{bool, cVar}, this, changeQuickRedirect, false, 46505, new Class[]{Object.class, kotlin.coroutines.c.class}, Object.class);
                    return patchProxyResultProxy.isSupported ? patchProxyResultProxy.result : a(bool.booleanValue(), cVar);
                }
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            C08841(HeyboxMicFragment heyboxMicFragment, kotlin.coroutines.c<? super C08841> cVar) {
                super(2, cVar);
                this.f93791c = heyboxMicFragment;
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            @dl.d
            public final kotlin.coroutines.c<b2> create(@e Object obj, @dl.d kotlin.coroutines.c<?> cVar) {
                PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{obj, cVar}, this, changeQuickRedirect, false, 46501, new Class[]{Object.class, kotlin.coroutines.c.class}, kotlin.coroutines.c.class);
                return patchProxyResultProxy.isSupported ? (kotlin.coroutines.c) patchProxyResultProxy.result : new C08841(this.f93791c, cVar);
            }

            @Override // yh.p
            public /* bridge */ /* synthetic */ Object invoke(q0 q0Var, kotlin.coroutines.c<? super b2> cVar) {
                PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{q0Var, cVar}, this, changeQuickRedirect, false, 46503, new Class[]{Object.class, Object.class}, Object.class);
                return patchProxyResultProxy.isSupported ? patchProxyResultProxy.result : invoke2(q0Var, cVar);
            }

            @e
            /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
            public final Object invoke2(@dl.d q0 q0Var, @e kotlin.coroutines.c<? super b2> cVar) {
                PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{q0Var, cVar}, this, changeQuickRedirect, false, 46502, new Class[]{q0.class, kotlin.coroutines.c.class}, Object.class);
                return patchProxyResultProxy.isSupported ? patchProxyResultProxy.result : ((C08841) create(q0Var, cVar)).invokeSuspend(b2.f124493a);
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            @e
            public final Object invokeSuspend(@dl.d Object obj) throws Throwable {
                PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{obj}, this, changeQuickRedirect, false, 46500, new Class[]{Object.class}, Object.class);
                if (patchProxyResultProxy.isSupported) {
                    return patchProxyResultProxy.result;
                }
                Object objH = kotlin.coroutines.intrinsics.b.h();
                int i10 = this.f93790b;
                if (i10 == 0) {
                    kotlin.t0.n(obj);
                    final u<com.max.xiaoheihe.module.voice.a> uVarX = HeyboxMicFragment.J4(this.f93791c).x();
                    kotlinx.coroutines.flow.e eVarG0 = g.g0(new kotlinx.coroutines.flow.e<Boolean>() { // from class: com.max.xiaoheihe.module.voice.HeyboxMicFragment$attachConnectStatusDialog$1$1$1$invokeSuspend$$inlined$map$1
                        public static ChangeQuickRedirect changeQuickRedirect;

                        /* JADX INFO: renamed from: com.max.xiaoheihe.module.voice.HeyboxMicFragment$attachConnectStatusDialog$1$1$1$invokeSuspend$$inlined$map$1$2, reason: invalid class name */
                        /* JADX INFO: compiled from: Emitters.kt */
                        @t0({"SMAP\nEmitters.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Emitters.kt\nkotlinx/coroutines/flow/FlowKt__EmittersKt$unsafeTransform$1$1\n+ 2 Transform.kt\nkotlinx/coroutines/flow/FlowKt__TransformKt\n+ 3 HeyboxMicFragment.kt\ncom/max/xiaoheihe/module/voice/HeyboxMicFragment$attachConnectStatusDialog$1$1$1\n*L\n1#1,222:1\n48#2:223\n266#3:224\n*E\n"})
                        public static final class AnonymousClass2<T> implements f {
                            public static ChangeQuickRedirect changeQuickRedirect;

                            /* JADX INFO: renamed from: b, reason: collision with root package name */
                            final /* synthetic */ f f93794b;

                            /* JADX INFO: renamed from: com.max.xiaoheihe.module.voice.HeyboxMicFragment$attachConnectStatusDialog$1$1$1$invokeSuspend$$inlined$map$1$2$1, reason: invalid class name */
                            /* JADX INFO: compiled from: Emitters.kt */
                            @t0({"SMAP\nEmitters.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Emitters.kt\nkotlinx/coroutines/flow/FlowKt__EmittersKt$unsafeTransform$1$1$emit$1\n*L\n1#1,222:1\n*E\n"})
                            @d(c = "com.max.xiaoheihe.module.voice.HeyboxMicFragment$attachConnectStatusDialog$1$1$1$invokeSuspend$$inlined$map$1$2", f = "HeyboxMicFragment.kt", i = {}, l = {bb.c.b.f30852p1}, m = "emit", n = {}, s = {})
                            public static final class AnonymousClass1 extends ContinuationImpl {
                                public static ChangeQuickRedirect changeQuickRedirect;

                                /* JADX INFO: renamed from: b, reason: collision with root package name */
                                /* synthetic */ Object f93795b;

                                /* JADX INFO: renamed from: c, reason: collision with root package name */
                                int f93796c;

                                /* JADX INFO: renamed from: d, reason: collision with root package name */
                                Object f93797d;

                                public AnonymousClass1(kotlin.coroutines.c cVar) {
                                    super(cVar);
                                }

                                @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                                @e
                                public final Object invokeSuspend(@dl.d Object obj) {
                                    PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{obj}, this, changeQuickRedirect, false, 46508, new Class[]{Object.class}, Object.class);
                                    if (patchProxyResultProxy.isSupported) {
                                        return patchProxyResultProxy.result;
                                    }
                                    this.f93795b = obj;
                                    this.f93796c |= Integer.MIN_VALUE;
                                    return AnonymousClass2.this.emit(null, this);
                                }
                            }

                            public AnonymousClass2(f fVar) {
                                this.f93794b = fVar;
                            }

                            /* JADX WARN: Code duplicated, block: B:11:0x003a  */
                            @Override // kotlinx.coroutines.flow.f
                            @e
                            public final Object emit(Object obj, @dl.d kotlin.coroutines.c cVar) throws Throwable {
                                AnonymousClass1 anonymousClass1;
                                boolean z10 = false;
                                PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{obj, cVar}, this, changeQuickRedirect, false, 46507, new Class[]{Object.class, kotlin.coroutines.c.class}, Object.class);
                                if (patchProxyResultProxy.isSupported) {
                                    return patchProxyResultProxy.result;
                                }
                                if (cVar instanceof AnonymousClass1) {
                                    anonymousClass1 = (AnonymousClass1) cVar;
                                    int i10 = anonymousClass1.f93796c;
                                    if ((i10 & Integer.MIN_VALUE) != 0) {
                                        anonymousClass1.f93796c = i10 - Integer.MIN_VALUE;
                                    } else {
                                        anonymousClass1 = new AnonymousClass1(cVar);
                                    }
                                } else {
                                    anonymousClass1 = new AnonymousClass1(cVar);
                                }
                                Object obj2 = anonymousClass1.f93795b;
                                Object objH = kotlin.coroutines.intrinsics.b.h();
                                int i11 = anonymousClass1.f93796c;
                                if (i11 == 0) {
                                    kotlin.t0.n(obj2);
                                    f fVar = this.f93794b;
                                    a aVar = (a) obj;
                                    if (aVar.A() && aVar.w()) {
                                        z10 = true;
                                    }
                                    Boolean boolA = kotlin.coroutines.jvm.internal.a.a(z10);
                                    anonymousClass1.f93796c = 1;
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
                            PatchProxyResult patchProxyResultProxy2 = PatchProxy.proxy(new Object[]{fVar, cVar}, this, changeQuickRedirect, false, 46506, new Class[]{f.class, kotlin.coroutines.c.class}, Object.class);
                            if (patchProxyResultProxy2.isSupported) {
                                return patchProxyResultProxy2.result;
                            }
                            Object objA = uVarX.a(new AnonymousClass2(fVar), cVar);
                            return objA == kotlin.coroutines.intrinsics.b.h() ? objA : b2.f124493a;
                        }
                    });
                    a aVar = new a(this.f93791c);
                    this.f93790b = 1;
                    if (eVarG0.a(aVar, this) == objH) {
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

        /* JADX INFO: renamed from: com.max.xiaoheihe.module.voice.HeyboxMicFragment$attachConnectStatusDialog$1$1$2, reason: invalid class name */
        /* JADX INFO: compiled from: HeyboxMicFragment.kt */
        @t0({"SMAP\nHeyboxMicFragment.kt\nKotlin\n*S Kotlin\n*F\n+ 1 HeyboxMicFragment.kt\ncom/max/xiaoheihe/module/voice/HeyboxMicFragment$attachConnectStatusDialog$1$1$2\n+ 2 Transform.kt\nkotlinx/coroutines/flow/FlowKt__TransformKt\n+ 3 Emitters.kt\nkotlinx/coroutines/flow/FlowKt__EmittersKt\n+ 4 SafeCollector.common.kt\nkotlinx/coroutines/flow/internal/SafeCollector_commonKt\n*L\n1#1,614:1\n47#2:615\n49#2:619\n50#3:616\n55#3:618\n106#4:617\n*S KotlinDebug\n*F\n+ 1 HeyboxMicFragment.kt\ncom/max/xiaoheihe/module/voice/HeyboxMicFragment$attachConnectStatusDialog$1$1$2\n*L\n276#1:615\n276#1:619\n276#1:616\n276#1:618\n276#1:617\n*E\n"})
        @d(c = "com.max.xiaoheihe.module.voice.HeyboxMicFragment$attachConnectStatusDialog$1$1$2", f = "HeyboxMicFragment.kt", i = {}, l = {bb.c.b.f30920s2}, m = "invokeSuspend", n = {}, s = {})
        public static final class AnonymousClass2 extends SuspendLambda implements p<q0, kotlin.coroutines.c<? super b2>, Object> {
            public static ChangeQuickRedirect changeQuickRedirect;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            int f93799b;

            /* JADX INFO: renamed from: c, reason: collision with root package name */
            final /* synthetic */ HeyboxMicFragment f93800c;

            /* JADX INFO: renamed from: com.max.xiaoheihe.module.voice.HeyboxMicFragment$attachConnectStatusDialog$1$1$2$a */
            /* JADX INFO: compiled from: HeyboxMicFragment.kt */
            public static final class a implements f<Boolean> {
                public static ChangeQuickRedirect changeQuickRedirect;

                /* JADX INFO: renamed from: b, reason: collision with root package name */
                final /* synthetic */ HeyboxMicFragment f93801b;

                a(HeyboxMicFragment heyboxMicFragment) {
                    this.f93801b = heyboxMicFragment;
                }

                @e
                public final Object a(boolean z10, @dl.d kotlin.coroutines.c<? super b2> cVar) {
                    PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{new Byte(z10 ? (byte) 1 : (byte) 0), cVar}, this, changeQuickRedirect, false, 46513, new Class[]{Boolean.TYPE, kotlin.coroutines.c.class}, Object.class);
                    if (patchProxyResultProxy.isSupported) {
                        return patchProxyResultProxy.result;
                    }
                    if (z10) {
                        HeyboxMicFragment.N4(this.f93801b);
                    }
                    return b2.f124493a;
                }

                @Override // kotlinx.coroutines.flow.f
                public /* bridge */ /* synthetic */ Object emit(Boolean bool, kotlin.coroutines.c cVar) {
                    PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{bool, cVar}, this, changeQuickRedirect, false, 46514, new Class[]{Object.class, kotlin.coroutines.c.class}, Object.class);
                    return patchProxyResultProxy.isSupported ? patchProxyResultProxy.result : a(bool.booleanValue(), cVar);
                }
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            AnonymousClass2(HeyboxMicFragment heyboxMicFragment, kotlin.coroutines.c<? super AnonymousClass2> cVar) {
                super(2, cVar);
                this.f93800c = heyboxMicFragment;
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            @dl.d
            public final kotlin.coroutines.c<b2> create(@e Object obj, @dl.d kotlin.coroutines.c<?> cVar) {
                PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{obj, cVar}, this, changeQuickRedirect, false, 46510, new Class[]{Object.class, kotlin.coroutines.c.class}, kotlin.coroutines.c.class);
                return patchProxyResultProxy.isSupported ? (kotlin.coroutines.c) patchProxyResultProxy.result : new AnonymousClass2(this.f93800c, cVar);
            }

            @Override // yh.p
            public /* bridge */ /* synthetic */ Object invoke(q0 q0Var, kotlin.coroutines.c<? super b2> cVar) {
                PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{q0Var, cVar}, this, changeQuickRedirect, false, 46512, new Class[]{Object.class, Object.class}, Object.class);
                return patchProxyResultProxy.isSupported ? patchProxyResultProxy.result : invoke2(q0Var, cVar);
            }

            @e
            /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
            public final Object invoke2(@dl.d q0 q0Var, @e kotlin.coroutines.c<? super b2> cVar) {
                PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{q0Var, cVar}, this, changeQuickRedirect, false, 46511, new Class[]{q0.class, kotlin.coroutines.c.class}, Object.class);
                return patchProxyResultProxy.isSupported ? patchProxyResultProxy.result : ((AnonymousClass2) create(q0Var, cVar)).invokeSuspend(b2.f124493a);
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            @e
            public final Object invokeSuspend(@dl.d Object obj) throws Throwable {
                PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{obj}, this, changeQuickRedirect, false, 46509, new Class[]{Object.class}, Object.class);
                if (patchProxyResultProxy.isSupported) {
                    return patchProxyResultProxy.result;
                }
                Object objH = kotlin.coroutines.intrinsics.b.h();
                int i10 = this.f93799b;
                if (i10 == 0) {
                    kotlin.t0.n(obj);
                    final u<com.max.xiaoheihe.module.voice.a> uVarX = HeyboxMicFragment.J4(this.f93800c).x();
                    kotlinx.coroutines.flow.e eVarG0 = g.g0(new kotlinx.coroutines.flow.e<Boolean>() { // from class: com.max.xiaoheihe.module.voice.HeyboxMicFragment$attachConnectStatusDialog$1$1$2$invokeSuspend$$inlined$map$1
                        public static ChangeQuickRedirect changeQuickRedirect;

                        /* JADX INFO: renamed from: com.max.xiaoheihe.module.voice.HeyboxMicFragment$attachConnectStatusDialog$1$1$2$invokeSuspend$$inlined$map$1$2, reason: invalid class name */
                        /* JADX INFO: compiled from: Emitters.kt */
                        @t0({"SMAP\nEmitters.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Emitters.kt\nkotlinx/coroutines/flow/FlowKt__EmittersKt$unsafeTransform$1$1\n+ 2 Transform.kt\nkotlinx/coroutines/flow/FlowKt__TransformKt\n+ 3 HeyboxMicFragment.kt\ncom/max/xiaoheihe/module/voice/HeyboxMicFragment$attachConnectStatusDialog$1$1$2\n*L\n1#1,222:1\n48#2:223\n277#3:224\n*E\n"})
                        public static final class AnonymousClass2<T> implements f {
                            public static ChangeQuickRedirect changeQuickRedirect;

                            /* JADX INFO: renamed from: b, reason: collision with root package name */
                            final /* synthetic */ f f93803b;

                            /* JADX INFO: renamed from: com.max.xiaoheihe.module.voice.HeyboxMicFragment$attachConnectStatusDialog$1$1$2$invokeSuspend$$inlined$map$1$2$1, reason: invalid class name */
                            /* JADX INFO: compiled from: Emitters.kt */
                            @t0({"SMAP\nEmitters.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Emitters.kt\nkotlinx/coroutines/flow/FlowKt__EmittersKt$unsafeTransform$1$1$emit$1\n*L\n1#1,222:1\n*E\n"})
                            @d(c = "com.max.xiaoheihe.module.voice.HeyboxMicFragment$attachConnectStatusDialog$1$1$2$invokeSuspend$$inlined$map$1$2", f = "HeyboxMicFragment.kt", i = {}, l = {bb.c.b.f30852p1}, m = "emit", n = {}, s = {})
                            public static final class AnonymousClass1 extends ContinuationImpl {
                                public static ChangeQuickRedirect changeQuickRedirect;

                                /* JADX INFO: renamed from: b, reason: collision with root package name */
                                /* synthetic */ Object f93804b;

                                /* JADX INFO: renamed from: c, reason: collision with root package name */
                                int f93805c;

                                /* JADX INFO: renamed from: d, reason: collision with root package name */
                                Object f93806d;

                                public AnonymousClass1(kotlin.coroutines.c cVar) {
                                    super(cVar);
                                }

                                @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                                @e
                                public final Object invokeSuspend(@dl.d Object obj) {
                                    PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{obj}, this, changeQuickRedirect, false, 46517, new Class[]{Object.class}, Object.class);
                                    if (patchProxyResultProxy.isSupported) {
                                        return patchProxyResultProxy.result;
                                    }
                                    this.f93804b = obj;
                                    this.f93805c |= Integer.MIN_VALUE;
                                    return AnonymousClass2.this.emit(null, this);
                                }
                            }

                            public AnonymousClass2(f fVar) {
                                this.f93803b = fVar;
                            }

                            /* JADX WARN: Code duplicated, block: B:11:0x003a  */
                            @Override // kotlinx.coroutines.flow.f
                            @e
                            public final Object emit(Object obj, @dl.d kotlin.coroutines.c cVar) throws Throwable {
                                AnonymousClass1 anonymousClass1;
                                boolean z10 = false;
                                PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{obj, cVar}, this, changeQuickRedirect, false, 46516, new Class[]{Object.class, kotlin.coroutines.c.class}, Object.class);
                                if (patchProxyResultProxy.isSupported) {
                                    return patchProxyResultProxy.result;
                                }
                                if (cVar instanceof AnonymousClass1) {
                                    anonymousClass1 = (AnonymousClass1) cVar;
                                    int i10 = anonymousClass1.f93805c;
                                    if ((i10 & Integer.MIN_VALUE) != 0) {
                                        anonymousClass1.f93805c = i10 - Integer.MIN_VALUE;
                                    } else {
                                        anonymousClass1 = new AnonymousClass1(cVar);
                                    }
                                } else {
                                    anonymousClass1 = new AnonymousClass1(cVar);
                                }
                                Object obj2 = anonymousClass1.f93804b;
                                Object objH = kotlin.coroutines.intrinsics.b.h();
                                int i11 = anonymousClass1.f93805c;
                                if (i11 == 0) {
                                    kotlin.t0.n(obj2);
                                    f fVar = this.f93803b;
                                    a aVar = (a) obj;
                                    if (!aVar.A() && !aVar.q() && (!aVar.y() || aVar.r())) {
                                        z10 = true;
                                    }
                                    Boolean boolA = kotlin.coroutines.jvm.internal.a.a(z10);
                                    anonymousClass1.f93805c = 1;
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
                            PatchProxyResult patchProxyResultProxy2 = PatchProxy.proxy(new Object[]{fVar, cVar}, this, changeQuickRedirect, false, 46515, new Class[]{f.class, kotlin.coroutines.c.class}, Object.class);
                            if (patchProxyResultProxy2.isSupported) {
                                return patchProxyResultProxy2.result;
                            }
                            Object objA = uVarX.a(new AnonymousClass2(fVar), cVar);
                            return objA == kotlin.coroutines.intrinsics.b.h() ? objA : b2.f124493a;
                        }
                    });
                    a aVar = new a(this.f93800c);
                    this.f93799b = 1;
                    if (eVarG0.a(aVar, this) == objH) {
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

        /* JADX INFO: renamed from: com.max.xiaoheihe.module.voice.HeyboxMicFragment$attachConnectStatusDialog$1$1$3, reason: invalid class name */
        /* JADX INFO: compiled from: HeyboxMicFragment.kt */
        @t0({"SMAP\nHeyboxMicFragment.kt\nKotlin\n*S Kotlin\n*F\n+ 1 HeyboxMicFragment.kt\ncom/max/xiaoheihe/module/voice/HeyboxMicFragment$attachConnectStatusDialog$1$1$3\n+ 2 Transform.kt\nkotlinx/coroutines/flow/FlowKt__TransformKt\n+ 3 Emitters.kt\nkotlinx/coroutines/flow/FlowKt__EmittersKt\n+ 4 SafeCollector.common.kt\nkotlinx/coroutines/flow/internal/SafeCollector_commonKt\n*L\n1#1,614:1\n47#2:615\n49#2:619\n50#3:616\n55#3:618\n106#4:617\n*S KotlinDebug\n*F\n+ 1 HeyboxMicFragment.kt\ncom/max/xiaoheihe/module/voice/HeyboxMicFragment$attachConnectStatusDialog$1$1$3\n*L\n285#1:615\n285#1:619\n285#1:616\n285#1:618\n285#1:617\n*E\n"})
        @d(c = "com.max.xiaoheihe.module.voice.HeyboxMicFragment$attachConnectStatusDialog$1$1$3", f = "HeyboxMicFragment.kt", i = {}, l = {bb.c.b.B2}, m = "invokeSuspend", n = {}, s = {})
        public static final class AnonymousClass3 extends SuspendLambda implements p<q0, kotlin.coroutines.c<? super b2>, Object> {
            public static ChangeQuickRedirect changeQuickRedirect;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            int f93808b;

            /* JADX INFO: renamed from: c, reason: collision with root package name */
            final /* synthetic */ HeyboxMicFragment f93809c;

            /* JADX INFO: renamed from: com.max.xiaoheihe.module.voice.HeyboxMicFragment$attachConnectStatusDialog$1$1$3$a */
            /* JADX INFO: compiled from: HeyboxMicFragment.kt */
            public static final class a implements f<Boolean> {
                public static ChangeQuickRedirect changeQuickRedirect;

                /* JADX INFO: renamed from: b, reason: collision with root package name */
                final /* synthetic */ HeyboxMicFragment f93810b;

                a(HeyboxMicFragment heyboxMicFragment) {
                    this.f93810b = heyboxMicFragment;
                }

                @e
                public final Object a(boolean z10, @dl.d kotlin.coroutines.c<? super b2> cVar) {
                    PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{new Byte(z10 ? (byte) 1 : (byte) 0), cVar}, this, changeQuickRedirect, false, 46522, new Class[]{Boolean.TYPE, kotlin.coroutines.c.class}, Object.class);
                    if (patchProxyResultProxy.isSupported) {
                        return patchProxyResultProxy.result;
                    }
                    if (z10) {
                        HeyboxMicFragment.R4(this.f93810b);
                    }
                    return b2.f124493a;
                }

                @Override // kotlinx.coroutines.flow.f
                public /* bridge */ /* synthetic */ Object emit(Boolean bool, kotlin.coroutines.c cVar) {
                    PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{bool, cVar}, this, changeQuickRedirect, false, 46523, new Class[]{Object.class, kotlin.coroutines.c.class}, Object.class);
                    return patchProxyResultProxy.isSupported ? patchProxyResultProxy.result : a(bool.booleanValue(), cVar);
                }
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            AnonymousClass3(HeyboxMicFragment heyboxMicFragment, kotlin.coroutines.c<? super AnonymousClass3> cVar) {
                super(2, cVar);
                this.f93809c = heyboxMicFragment;
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            @dl.d
            public final kotlin.coroutines.c<b2> create(@e Object obj, @dl.d kotlin.coroutines.c<?> cVar) {
                PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{obj, cVar}, this, changeQuickRedirect, false, 46519, new Class[]{Object.class, kotlin.coroutines.c.class}, kotlin.coroutines.c.class);
                return patchProxyResultProxy.isSupported ? (kotlin.coroutines.c) patchProxyResultProxy.result : new AnonymousClass3(this.f93809c, cVar);
            }

            @Override // yh.p
            public /* bridge */ /* synthetic */ Object invoke(q0 q0Var, kotlin.coroutines.c<? super b2> cVar) {
                PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{q0Var, cVar}, this, changeQuickRedirect, false, 46521, new Class[]{Object.class, Object.class}, Object.class);
                return patchProxyResultProxy.isSupported ? patchProxyResultProxy.result : invoke2(q0Var, cVar);
            }

            @e
            /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
            public final Object invoke2(@dl.d q0 q0Var, @e kotlin.coroutines.c<? super b2> cVar) {
                PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{q0Var, cVar}, this, changeQuickRedirect, false, 46520, new Class[]{q0.class, kotlin.coroutines.c.class}, Object.class);
                return patchProxyResultProxy.isSupported ? patchProxyResultProxy.result : ((AnonymousClass3) create(q0Var, cVar)).invokeSuspend(b2.f124493a);
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            @e
            public final Object invokeSuspend(@dl.d Object obj) throws Throwable {
                PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{obj}, this, changeQuickRedirect, false, 46518, new Class[]{Object.class}, Object.class);
                if (patchProxyResultProxy.isSupported) {
                    return patchProxyResultProxy.result;
                }
                Object objH = kotlin.coroutines.intrinsics.b.h();
                int i10 = this.f93808b;
                if (i10 == 0) {
                    kotlin.t0.n(obj);
                    final u<com.max.xiaoheihe.module.voice.a> uVarX = HeyboxMicFragment.J4(this.f93809c).x();
                    kotlinx.coroutines.flow.e eVarG0 = g.g0(new kotlinx.coroutines.flow.e<Boolean>() { // from class: com.max.xiaoheihe.module.voice.HeyboxMicFragment$attachConnectStatusDialog$1$1$3$invokeSuspend$$inlined$map$1
                        public static ChangeQuickRedirect changeQuickRedirect;

                        /* JADX INFO: renamed from: com.max.xiaoheihe.module.voice.HeyboxMicFragment$attachConnectStatusDialog$1$1$3$invokeSuspend$$inlined$map$1$2, reason: invalid class name */
                        /* JADX INFO: compiled from: Emitters.kt */
                        @t0({"SMAP\nEmitters.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Emitters.kt\nkotlinx/coroutines/flow/FlowKt__EmittersKt$unsafeTransform$1$1\n+ 2 Transform.kt\nkotlinx/coroutines/flow/FlowKt__TransformKt\n+ 3 HeyboxMicFragment.kt\ncom/max/xiaoheihe/module/voice/HeyboxMicFragment$attachConnectStatusDialog$1$1$3\n*L\n1#1,222:1\n48#2:223\n286#3:224\n*E\n"})
                        public static final class AnonymousClass2<T> implements f {
                            public static ChangeQuickRedirect changeQuickRedirect;

                            /* JADX INFO: renamed from: b, reason: collision with root package name */
                            final /* synthetic */ f f93812b;

                            /* JADX INFO: renamed from: com.max.xiaoheihe.module.voice.HeyboxMicFragment$attachConnectStatusDialog$1$1$3$invokeSuspend$$inlined$map$1$2$1, reason: invalid class name */
                            /* JADX INFO: compiled from: Emitters.kt */
                            @t0({"SMAP\nEmitters.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Emitters.kt\nkotlinx/coroutines/flow/FlowKt__EmittersKt$unsafeTransform$1$1$emit$1\n*L\n1#1,222:1\n*E\n"})
                            @d(c = "com.max.xiaoheihe.module.voice.HeyboxMicFragment$attachConnectStatusDialog$1$1$3$invokeSuspend$$inlined$map$1$2", f = "HeyboxMicFragment.kt", i = {}, l = {bb.c.b.f30852p1}, m = "emit", n = {}, s = {})
                            public static final class AnonymousClass1 extends ContinuationImpl {
                                public static ChangeQuickRedirect changeQuickRedirect;

                                /* JADX INFO: renamed from: b, reason: collision with root package name */
                                /* synthetic */ Object f93813b;

                                /* JADX INFO: renamed from: c, reason: collision with root package name */
                                int f93814c;

                                /* JADX INFO: renamed from: d, reason: collision with root package name */
                                Object f93815d;

                                public AnonymousClass1(kotlin.coroutines.c cVar) {
                                    super(cVar);
                                }

                                @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                                @e
                                public final Object invokeSuspend(@dl.d Object obj) {
                                    PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{obj}, this, changeQuickRedirect, false, 46526, new Class[]{Object.class}, Object.class);
                                    if (patchProxyResultProxy.isSupported) {
                                        return patchProxyResultProxy.result;
                                    }
                                    this.f93813b = obj;
                                    this.f93814c |= Integer.MIN_VALUE;
                                    return AnonymousClass2.this.emit(null, this);
                                }
                            }

                            public AnonymousClass2(f fVar) {
                                this.f93812b = fVar;
                            }

                            /* JADX WARN: Code duplicated, block: B:11:0x003a  */
                            @Override // kotlinx.coroutines.flow.f
                            @e
                            public final Object emit(Object obj, @dl.d kotlin.coroutines.c cVar) throws Throwable {
                                AnonymousClass1 anonymousClass1;
                                boolean z10 = false;
                                PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{obj, cVar}, this, changeQuickRedirect, false, 46525, new Class[]{Object.class, kotlin.coroutines.c.class}, Object.class);
                                if (patchProxyResultProxy.isSupported) {
                                    return patchProxyResultProxy.result;
                                }
                                if (cVar instanceof AnonymousClass1) {
                                    anonymousClass1 = (AnonymousClass1) cVar;
                                    int i10 = anonymousClass1.f93814c;
                                    if ((i10 & Integer.MIN_VALUE) != 0) {
                                        anonymousClass1.f93814c = i10 - Integer.MIN_VALUE;
                                    } else {
                                        anonymousClass1 = new AnonymousClass1(cVar);
                                    }
                                } else {
                                    anonymousClass1 = new AnonymousClass1(cVar);
                                }
                                Object obj2 = anonymousClass1.f93813b;
                                Object objH = kotlin.coroutines.intrinsics.b.h();
                                int i11 = anonymousClass1.f93814c;
                                if (i11 == 0) {
                                    kotlin.t0.n(obj2);
                                    f fVar = this.f93812b;
                                    a aVar = (a) obj;
                                    if (!aVar.A() && !aVar.q() && !aVar.r() && aVar.v()) {
                                        z10 = true;
                                    }
                                    Boolean boolA = kotlin.coroutines.jvm.internal.a.a(z10);
                                    anonymousClass1.f93814c = 1;
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
                            PatchProxyResult patchProxyResultProxy2 = PatchProxy.proxy(new Object[]{fVar, cVar}, this, changeQuickRedirect, false, 46524, new Class[]{f.class, kotlin.coroutines.c.class}, Object.class);
                            if (patchProxyResultProxy2.isSupported) {
                                return patchProxyResultProxy2.result;
                            }
                            Object objA = uVarX.a(new AnonymousClass2(fVar), cVar);
                            return objA == kotlin.coroutines.intrinsics.b.h() ? objA : b2.f124493a;
                        }
                    });
                    a aVar = new a(this.f93809c);
                    this.f93808b = 1;
                    if (eVarG0.a(aVar, this) == objH) {
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

        /* JADX INFO: renamed from: com.max.xiaoheihe.module.voice.HeyboxMicFragment$attachConnectStatusDialog$1$1$4, reason: invalid class name */
        /* JADX INFO: compiled from: HeyboxMicFragment.kt */
        @t0({"SMAP\nHeyboxMicFragment.kt\nKotlin\n*S Kotlin\n*F\n+ 1 HeyboxMicFragment.kt\ncom/max/xiaoheihe/module/voice/HeyboxMicFragment$attachConnectStatusDialog$1$1$4\n+ 2 Transform.kt\nkotlinx/coroutines/flow/FlowKt__TransformKt\n+ 3 Emitters.kt\nkotlinx/coroutines/flow/FlowKt__EmittersKt\n+ 4 SafeCollector.common.kt\nkotlinx/coroutines/flow/internal/SafeCollector_commonKt\n*L\n1#1,614:1\n47#2:615\n49#2:619\n50#3:616\n55#3:618\n106#4:617\n*S KotlinDebug\n*F\n+ 1 HeyboxMicFragment.kt\ncom/max/xiaoheihe/module/voice/HeyboxMicFragment$attachConnectStatusDialog$1$1$4\n*L\n294#1:615\n294#1:619\n294#1:616\n294#1:618\n294#1:617\n*E\n"})
        @d(c = "com.max.xiaoheihe.module.voice.HeyboxMicFragment$attachConnectStatusDialog$1$1$4", f = "HeyboxMicFragment.kt", i = {}, l = {bb.c.b.K2}, m = "invokeSuspend", n = {}, s = {})
        public static final class AnonymousClass4 extends SuspendLambda implements p<q0, kotlin.coroutines.c<? super b2>, Object> {
            public static ChangeQuickRedirect changeQuickRedirect;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            int f93817b;

            /* JADX INFO: renamed from: c, reason: collision with root package name */
            final /* synthetic */ HeyboxMicFragment f93818c;

            /* JADX INFO: renamed from: com.max.xiaoheihe.module.voice.HeyboxMicFragment$attachConnectStatusDialog$1$1$4$a */
            /* JADX INFO: compiled from: HeyboxMicFragment.kt */
            public static final class a implements f<Boolean> {
                public static ChangeQuickRedirect changeQuickRedirect;

                /* JADX INFO: renamed from: b, reason: collision with root package name */
                final /* synthetic */ HeyboxMicFragment f93819b;

                a(HeyboxMicFragment heyboxMicFragment) {
                    this.f93819b = heyboxMicFragment;
                }

                @e
                public final Object a(boolean z10, @dl.d kotlin.coroutines.c<? super b2> cVar) {
                    PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{new Byte(z10 ? (byte) 1 : (byte) 0), cVar}, this, changeQuickRedirect, false, 46531, new Class[]{Boolean.TYPE, kotlin.coroutines.c.class}, Object.class);
                    if (patchProxyResultProxy.isSupported) {
                        return patchProxyResultProxy.result;
                    }
                    if (z10) {
                        HeyboxMicFragment.P4(this.f93819b);
                    }
                    return b2.f124493a;
                }

                @Override // kotlinx.coroutines.flow.f
                public /* bridge */ /* synthetic */ Object emit(Boolean bool, kotlin.coroutines.c cVar) {
                    PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{bool, cVar}, this, changeQuickRedirect, false, 46532, new Class[]{Object.class, kotlin.coroutines.c.class}, Object.class);
                    return patchProxyResultProxy.isSupported ? patchProxyResultProxy.result : a(bool.booleanValue(), cVar);
                }
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            AnonymousClass4(HeyboxMicFragment heyboxMicFragment, kotlin.coroutines.c<? super AnonymousClass4> cVar) {
                super(2, cVar);
                this.f93818c = heyboxMicFragment;
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            @dl.d
            public final kotlin.coroutines.c<b2> create(@e Object obj, @dl.d kotlin.coroutines.c<?> cVar) {
                PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{obj, cVar}, this, changeQuickRedirect, false, 46528, new Class[]{Object.class, kotlin.coroutines.c.class}, kotlin.coroutines.c.class);
                return patchProxyResultProxy.isSupported ? (kotlin.coroutines.c) patchProxyResultProxy.result : new AnonymousClass4(this.f93818c, cVar);
            }

            @Override // yh.p
            public /* bridge */ /* synthetic */ Object invoke(q0 q0Var, kotlin.coroutines.c<? super b2> cVar) {
                PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{q0Var, cVar}, this, changeQuickRedirect, false, 46530, new Class[]{Object.class, Object.class}, Object.class);
                return patchProxyResultProxy.isSupported ? patchProxyResultProxy.result : invoke2(q0Var, cVar);
            }

            @e
            /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
            public final Object invoke2(@dl.d q0 q0Var, @e kotlin.coroutines.c<? super b2> cVar) {
                PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{q0Var, cVar}, this, changeQuickRedirect, false, 46529, new Class[]{q0.class, kotlin.coroutines.c.class}, Object.class);
                return patchProxyResultProxy.isSupported ? patchProxyResultProxy.result : ((AnonymousClass4) create(q0Var, cVar)).invokeSuspend(b2.f124493a);
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            @e
            public final Object invokeSuspend(@dl.d Object obj) throws Throwable {
                PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{obj}, this, changeQuickRedirect, false, 46527, new Class[]{Object.class}, Object.class);
                if (patchProxyResultProxy.isSupported) {
                    return patchProxyResultProxy.result;
                }
                Object objH = kotlin.coroutines.intrinsics.b.h();
                int i10 = this.f93817b;
                if (i10 == 0) {
                    kotlin.t0.n(obj);
                    final u<com.max.xiaoheihe.module.voice.a> uVarX = HeyboxMicFragment.J4(this.f93818c).x();
                    kotlinx.coroutines.flow.e eVarG0 = g.g0(new kotlinx.coroutines.flow.e<Boolean>() { // from class: com.max.xiaoheihe.module.voice.HeyboxMicFragment$attachConnectStatusDialog$1$1$4$invokeSuspend$$inlined$map$1
                        public static ChangeQuickRedirect changeQuickRedirect;

                        /* JADX INFO: renamed from: com.max.xiaoheihe.module.voice.HeyboxMicFragment$attachConnectStatusDialog$1$1$4$invokeSuspend$$inlined$map$1$2, reason: invalid class name */
                        /* JADX INFO: compiled from: Emitters.kt */
                        @t0({"SMAP\nEmitters.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Emitters.kt\nkotlinx/coroutines/flow/FlowKt__EmittersKt$unsafeTransform$1$1\n+ 2 Transform.kt\nkotlinx/coroutines/flow/FlowKt__TransformKt\n+ 3 HeyboxMicFragment.kt\ncom/max/xiaoheihe/module/voice/HeyboxMicFragment$attachConnectStatusDialog$1$1$4\n*L\n1#1,222:1\n48#2:223\n295#3:224\n*E\n"})
                        public static final class AnonymousClass2<T> implements f {
                            public static ChangeQuickRedirect changeQuickRedirect;

                            /* JADX INFO: renamed from: b, reason: collision with root package name */
                            final /* synthetic */ f f93821b;

                            /* JADX INFO: renamed from: com.max.xiaoheihe.module.voice.HeyboxMicFragment$attachConnectStatusDialog$1$1$4$invokeSuspend$$inlined$map$1$2$1, reason: invalid class name */
                            /* JADX INFO: compiled from: Emitters.kt */
                            @t0({"SMAP\nEmitters.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Emitters.kt\nkotlinx/coroutines/flow/FlowKt__EmittersKt$unsafeTransform$1$1$emit$1\n*L\n1#1,222:1\n*E\n"})
                            @d(c = "com.max.xiaoheihe.module.voice.HeyboxMicFragment$attachConnectStatusDialog$1$1$4$invokeSuspend$$inlined$map$1$2", f = "HeyboxMicFragment.kt", i = {}, l = {bb.c.b.f30852p1}, m = "emit", n = {}, s = {})
                            public static final class AnonymousClass1 extends ContinuationImpl {
                                public static ChangeQuickRedirect changeQuickRedirect;

                                /* JADX INFO: renamed from: b, reason: collision with root package name */
                                /* synthetic */ Object f93822b;

                                /* JADX INFO: renamed from: c, reason: collision with root package name */
                                int f93823c;

                                /* JADX INFO: renamed from: d, reason: collision with root package name */
                                Object f93824d;

                                public AnonymousClass1(kotlin.coroutines.c cVar) {
                                    super(cVar);
                                }

                                @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                                @e
                                public final Object invokeSuspend(@dl.d Object obj) {
                                    PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{obj}, this, changeQuickRedirect, false, 46535, new Class[]{Object.class}, Object.class);
                                    if (patchProxyResultProxy.isSupported) {
                                        return patchProxyResultProxy.result;
                                    }
                                    this.f93822b = obj;
                                    this.f93823c |= Integer.MIN_VALUE;
                                    return AnonymousClass2.this.emit(null, this);
                                }
                            }

                            public AnonymousClass2(f fVar) {
                                this.f93821b = fVar;
                            }

                            /* JADX WARN: Code duplicated, block: B:11:0x003a  */
                            @Override // kotlinx.coroutines.flow.f
                            @e
                            public final Object emit(Object obj, @dl.d kotlin.coroutines.c cVar) throws Throwable {
                                AnonymousClass1 anonymousClass1;
                                PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{obj, cVar}, this, changeQuickRedirect, false, 46534, new Class[]{Object.class, kotlin.coroutines.c.class}, Object.class);
                                if (patchProxyResultProxy.isSupported) {
                                    return patchProxyResultProxy.result;
                                }
                                if (cVar instanceof AnonymousClass1) {
                                    anonymousClass1 = (AnonymousClass1) cVar;
                                    int i10 = anonymousClass1.f93823c;
                                    if ((i10 & Integer.MIN_VALUE) != 0) {
                                        anonymousClass1.f93823c = i10 - Integer.MIN_VALUE;
                                    } else {
                                        anonymousClass1 = new AnonymousClass1(cVar);
                                    }
                                } else {
                                    anonymousClass1 = new AnonymousClass1(cVar);
                                }
                                Object obj2 = anonymousClass1.f93822b;
                                Object objH = kotlin.coroutines.intrinsics.b.h();
                                int i11 = anonymousClass1.f93823c;
                                if (i11 == 0) {
                                    kotlin.t0.n(obj2);
                                    f fVar = this.f93821b;
                                    Boolean boolA = kotlin.coroutines.jvm.internal.a.a(((a) obj).q());
                                    anonymousClass1.f93823c = 1;
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
                            PatchProxyResult patchProxyResultProxy2 = PatchProxy.proxy(new Object[]{fVar, cVar}, this, changeQuickRedirect, false, 46533, new Class[]{f.class, kotlin.coroutines.c.class}, Object.class);
                            if (patchProxyResultProxy2.isSupported) {
                                return patchProxyResultProxy2.result;
                            }
                            Object objA = uVarX.a(new AnonymousClass2(fVar), cVar);
                            return objA == kotlin.coroutines.intrinsics.b.h() ? objA : b2.f124493a;
                        }
                    });
                    a aVar = new a(this.f93818c);
                    this.f93817b = 1;
                    if (eVarG0.a(aVar, this) == objH) {
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

        /* JADX INFO: renamed from: com.max.xiaoheihe.module.voice.HeyboxMicFragment$attachConnectStatusDialog$1$1$5, reason: invalid class name */
        /* JADX INFO: compiled from: HeyboxMicFragment.kt */
        @t0({"SMAP\nHeyboxMicFragment.kt\nKotlin\n*S Kotlin\n*F\n+ 1 HeyboxMicFragment.kt\ncom/max/xiaoheihe/module/voice/HeyboxMicFragment$attachConnectStatusDialog$1$1$5\n+ 2 Transform.kt\nkotlinx/coroutines/flow/FlowKt__TransformKt\n+ 3 Emitters.kt\nkotlinx/coroutines/flow/FlowKt__EmittersKt\n+ 4 SafeCollector.common.kt\nkotlinx/coroutines/flow/internal/SafeCollector_commonKt\n*L\n1#1,614:1\n47#2:615\n49#2:619\n50#3:616\n55#3:618\n106#4:617\n*S KotlinDebug\n*F\n+ 1 HeyboxMicFragment.kt\ncom/max/xiaoheihe/module/voice/HeyboxMicFragment$attachConnectStatusDialog$1$1$5\n*L\n303#1:615\n303#1:619\n303#1:616\n303#1:618\n303#1:617\n*E\n"})
        @d(c = "com.max.xiaoheihe.module.voice.HeyboxMicFragment$attachConnectStatusDialog$1$1$5", f = "HeyboxMicFragment.kt", i = {}, l = {305}, m = "invokeSuspend", n = {}, s = {})
        public static final class AnonymousClass5 extends SuspendLambda implements p<q0, kotlin.coroutines.c<? super b2>, Object> {
            public static ChangeQuickRedirect changeQuickRedirect;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            int f93826b;

            /* JADX INFO: renamed from: c, reason: collision with root package name */
            final /* synthetic */ HeyboxMicFragment f93827c;

            /* JADX INFO: renamed from: com.max.xiaoheihe.module.voice.HeyboxMicFragment$attachConnectStatusDialog$1$1$5$a */
            /* JADX INFO: compiled from: HeyboxMicFragment.kt */
            public static final class a implements f<Boolean> {
                public static ChangeQuickRedirect changeQuickRedirect;

                /* JADX INFO: renamed from: b, reason: collision with root package name */
                final /* synthetic */ HeyboxMicFragment f93828b;

                a(HeyboxMicFragment heyboxMicFragment) {
                    this.f93828b = heyboxMicFragment;
                }

                @e
                public final Object a(boolean z10, @dl.d kotlin.coroutines.c<? super b2> cVar) {
                    PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{new Byte(z10 ? (byte) 1 : (byte) 0), cVar}, this, changeQuickRedirect, false, 46540, new Class[]{Boolean.TYPE, kotlin.coroutines.c.class}, Object.class);
                    if (patchProxyResultProxy.isSupported) {
                        return patchProxyResultProxy.result;
                    }
                    HeyboxMicFragment.S4(this.f93828b, z10);
                    return b2.f124493a;
                }

                @Override // kotlinx.coroutines.flow.f
                public /* bridge */ /* synthetic */ Object emit(Boolean bool, kotlin.coroutines.c cVar) {
                    PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{bool, cVar}, this, changeQuickRedirect, false, 46541, new Class[]{Object.class, kotlin.coroutines.c.class}, Object.class);
                    return patchProxyResultProxy.isSupported ? patchProxyResultProxy.result : a(bool.booleanValue(), cVar);
                }
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            AnonymousClass5(HeyboxMicFragment heyboxMicFragment, kotlin.coroutines.c<? super AnonymousClass5> cVar) {
                super(2, cVar);
                this.f93827c = heyboxMicFragment;
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            @dl.d
            public final kotlin.coroutines.c<b2> create(@e Object obj, @dl.d kotlin.coroutines.c<?> cVar) {
                PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{obj, cVar}, this, changeQuickRedirect, false, 46537, new Class[]{Object.class, kotlin.coroutines.c.class}, kotlin.coroutines.c.class);
                return patchProxyResultProxy.isSupported ? (kotlin.coroutines.c) patchProxyResultProxy.result : new AnonymousClass5(this.f93827c, cVar);
            }

            @Override // yh.p
            public /* bridge */ /* synthetic */ Object invoke(q0 q0Var, kotlin.coroutines.c<? super b2> cVar) {
                PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{q0Var, cVar}, this, changeQuickRedirect, false, 46539, new Class[]{Object.class, Object.class}, Object.class);
                return patchProxyResultProxy.isSupported ? patchProxyResultProxy.result : invoke2(q0Var, cVar);
            }

            @e
            /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
            public final Object invoke2(@dl.d q0 q0Var, @e kotlin.coroutines.c<? super b2> cVar) {
                PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{q0Var, cVar}, this, changeQuickRedirect, false, 46538, new Class[]{q0.class, kotlin.coroutines.c.class}, Object.class);
                return patchProxyResultProxy.isSupported ? patchProxyResultProxy.result : ((AnonymousClass5) create(q0Var, cVar)).invokeSuspend(b2.f124493a);
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            @e
            public final Object invokeSuspend(@dl.d Object obj) throws Throwable {
                PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{obj}, this, changeQuickRedirect, false, 46536, new Class[]{Object.class}, Object.class);
                if (patchProxyResultProxy.isSupported) {
                    return patchProxyResultProxy.result;
                }
                Object objH = kotlin.coroutines.intrinsics.b.h();
                int i10 = this.f93826b;
                if (i10 == 0) {
                    kotlin.t0.n(obj);
                    final u<com.max.xiaoheihe.module.voice.a> uVarX = HeyboxMicFragment.J4(this.f93827c).x();
                    kotlinx.coroutines.flow.e eVarG0 = g.g0(g.s0(new kotlinx.coroutines.flow.e<Boolean>() { // from class: com.max.xiaoheihe.module.voice.HeyboxMicFragment$attachConnectStatusDialog$1$1$5$invokeSuspend$$inlined$map$1
                        public static ChangeQuickRedirect changeQuickRedirect;

                        /* JADX INFO: renamed from: com.max.xiaoheihe.module.voice.HeyboxMicFragment$attachConnectStatusDialog$1$1$5$invokeSuspend$$inlined$map$1$2, reason: invalid class name */
                        /* JADX INFO: compiled from: Emitters.kt */
                        @t0({"SMAP\nEmitters.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Emitters.kt\nkotlinx/coroutines/flow/FlowKt__EmittersKt$unsafeTransform$1$1\n+ 2 Transform.kt\nkotlinx/coroutines/flow/FlowKt__TransformKt\n+ 3 HeyboxMicFragment.kt\ncom/max/xiaoheihe/module/voice/HeyboxMicFragment$attachConnectStatusDialog$1$1$5\n*L\n1#1,222:1\n48#2:223\n304#3:224\n*E\n"})
                        public static final class AnonymousClass2<T> implements f {
                            public static ChangeQuickRedirect changeQuickRedirect;

                            /* JADX INFO: renamed from: b, reason: collision with root package name */
                            final /* synthetic */ f f93830b;

                            /* JADX INFO: renamed from: com.max.xiaoheihe.module.voice.HeyboxMicFragment$attachConnectStatusDialog$1$1$5$invokeSuspend$$inlined$map$1$2$1, reason: invalid class name */
                            /* JADX INFO: compiled from: Emitters.kt */
                            @t0({"SMAP\nEmitters.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Emitters.kt\nkotlinx/coroutines/flow/FlowKt__EmittersKt$unsafeTransform$1$1$emit$1\n*L\n1#1,222:1\n*E\n"})
                            @d(c = "com.max.xiaoheihe.module.voice.HeyboxMicFragment$attachConnectStatusDialog$1$1$5$invokeSuspend$$inlined$map$1$2", f = "HeyboxMicFragment.kt", i = {}, l = {bb.c.b.f30852p1}, m = "emit", n = {}, s = {})
                            public static final class AnonymousClass1 extends ContinuationImpl {
                                public static ChangeQuickRedirect changeQuickRedirect;

                                /* JADX INFO: renamed from: b, reason: collision with root package name */
                                /* synthetic */ Object f93831b;

                                /* JADX INFO: renamed from: c, reason: collision with root package name */
                                int f93832c;

                                /* JADX INFO: renamed from: d, reason: collision with root package name */
                                Object f93833d;

                                public AnonymousClass1(kotlin.coroutines.c cVar) {
                                    super(cVar);
                                }

                                @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                                @e
                                public final Object invokeSuspend(@dl.d Object obj) {
                                    PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{obj}, this, changeQuickRedirect, false, 46544, new Class[]{Object.class}, Object.class);
                                    if (patchProxyResultProxy.isSupported) {
                                        return patchProxyResultProxy.result;
                                    }
                                    this.f93831b = obj;
                                    this.f93832c |= Integer.MIN_VALUE;
                                    return AnonymousClass2.this.emit(null, this);
                                }
                            }

                            public AnonymousClass2(f fVar) {
                                this.f93830b = fVar;
                            }

                            /* JADX WARN: Code duplicated, block: B:11:0x003a  */
                            @Override // kotlinx.coroutines.flow.f
                            @e
                            public final Object emit(Object obj, @dl.d kotlin.coroutines.c cVar) throws Throwable {
                                AnonymousClass1 anonymousClass1;
                                PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{obj, cVar}, this, changeQuickRedirect, false, 46543, new Class[]{Object.class, kotlin.coroutines.c.class}, Object.class);
                                if (patchProxyResultProxy.isSupported) {
                                    return patchProxyResultProxy.result;
                                }
                                if (cVar instanceof AnonymousClass1) {
                                    anonymousClass1 = (AnonymousClass1) cVar;
                                    int i10 = anonymousClass1.f93832c;
                                    if ((i10 & Integer.MIN_VALUE) != 0) {
                                        anonymousClass1.f93832c = i10 - Integer.MIN_VALUE;
                                    } else {
                                        anonymousClass1 = new AnonymousClass1(cVar);
                                    }
                                } else {
                                    anonymousClass1 = new AnonymousClass1(cVar);
                                }
                                Object obj2 = anonymousClass1.f93831b;
                                Object objH = kotlin.coroutines.intrinsics.b.h();
                                int i11 = anonymousClass1.f93832c;
                                if (i11 == 0) {
                                    kotlin.t0.n(obj2);
                                    f fVar = this.f93830b;
                                    Boolean boolP = ((a) obj).p();
                                    anonymousClass1.f93832c = 1;
                                    if (fVar.emit(boolP, anonymousClass1) == objH) {
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
                            PatchProxyResult patchProxyResultProxy2 = PatchProxy.proxy(new Object[]{fVar, cVar}, this, changeQuickRedirect, false, 46542, new Class[]{f.class, kotlin.coroutines.c.class}, Object.class);
                            if (patchProxyResultProxy2.isSupported) {
                                return patchProxyResultProxy2.result;
                            }
                            Object objA = uVarX.a(new AnonymousClass2(fVar), cVar);
                            return objA == kotlin.coroutines.intrinsics.b.h() ? objA : b2.f124493a;
                        }
                    }));
                    a aVar = new a(this.f93827c);
                    this.f93826b = 1;
                    if (eVarG0.a(aVar, this) == objH) {
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

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        AnonymousClass1(HeyboxMicFragment heyboxMicFragment, kotlin.coroutines.c<? super AnonymousClass1> cVar) {
            super(2, cVar);
            this.f93789d = heyboxMicFragment;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @dl.d
        public final kotlin.coroutines.c<b2> create(@e Object obj, @dl.d kotlin.coroutines.c<?> cVar) {
            PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{obj, cVar}, this, changeQuickRedirect, false, 46497, new Class[]{Object.class, kotlin.coroutines.c.class}, kotlin.coroutines.c.class);
            if (patchProxyResultProxy.isSupported) {
                return (kotlin.coroutines.c) patchProxyResultProxy.result;
            }
            AnonymousClass1 anonymousClass1 = new AnonymousClass1(this.f93789d, cVar);
            anonymousClass1.f93788c = obj;
            return anonymousClass1;
        }

        @Override // yh.p
        public /* bridge */ /* synthetic */ Object invoke(q0 q0Var, kotlin.coroutines.c<? super b2> cVar) {
            PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{q0Var, cVar}, this, changeQuickRedirect, false, 46499, new Class[]{Object.class, Object.class}, Object.class);
            return patchProxyResultProxy.isSupported ? patchProxyResultProxy.result : invoke2(q0Var, cVar);
        }

        @e
        /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
        public final Object invoke2(@dl.d q0 q0Var, @e kotlin.coroutines.c<? super b2> cVar) {
            PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{q0Var, cVar}, this, changeQuickRedirect, false, 46498, new Class[]{q0.class, kotlin.coroutines.c.class}, Object.class);
            return patchProxyResultProxy.isSupported ? patchProxyResultProxy.result : ((AnonymousClass1) create(q0Var, cVar)).invokeSuspend(b2.f124493a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @e
        public final Object invokeSuspend(@dl.d Object obj) throws Throwable {
            PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{obj}, this, changeQuickRedirect, false, 46496, new Class[]{Object.class}, Object.class);
            if (patchProxyResultProxy.isSupported) {
                return patchProxyResultProxy.result;
            }
            kotlin.coroutines.intrinsics.b.h();
            if (this.f93787b != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            kotlin.t0.n(obj);
            q0 q0Var = (q0) this.f93788c;
            k.f(q0Var, null, null, new C08841(this.f93789d, null), 3, null);
            k.f(q0Var, null, null, new AnonymousClass2(this.f93789d, null), 3, null);
            k.f(q0Var, null, null, new AnonymousClass3(this.f93789d, null), 3, null);
            k.f(q0Var, null, null, new AnonymousClass4(this.f93789d, null), 3, null);
            k.f(q0Var, null, null, new AnonymousClass5(this.f93789d, null), 3, null);
            return b2.f124493a;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    HeyboxMicFragment$attachConnectStatusDialog$1(HeyboxMicFragment heyboxMicFragment, kotlin.coroutines.c<? super HeyboxMicFragment$attachConnectStatusDialog$1> cVar) {
        super(2, cVar);
        this.f93786c = heyboxMicFragment;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @dl.d
    public final kotlin.coroutines.c<b2> create(@e Object obj, @dl.d kotlin.coroutines.c<?> cVar) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{obj, cVar}, this, changeQuickRedirect, false, 46493, new Class[]{Object.class, kotlin.coroutines.c.class}, kotlin.coroutines.c.class);
        return patchProxyResultProxy.isSupported ? (kotlin.coroutines.c) patchProxyResultProxy.result : new HeyboxMicFragment$attachConnectStatusDialog$1(this.f93786c, cVar);
    }

    @Override // yh.p
    public /* bridge */ /* synthetic */ Object invoke(q0 q0Var, kotlin.coroutines.c<? super b2> cVar) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{q0Var, cVar}, this, changeQuickRedirect, false, 46495, new Class[]{Object.class, Object.class}, Object.class);
        return patchProxyResultProxy.isSupported ? patchProxyResultProxy.result : invoke2(q0Var, cVar);
    }

    @e
    /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
    public final Object invoke2(@dl.d q0 q0Var, @e kotlin.coroutines.c<? super b2> cVar) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{q0Var, cVar}, this, changeQuickRedirect, false, 46494, new Class[]{q0.class, kotlin.coroutines.c.class}, Object.class);
        return patchProxyResultProxy.isSupported ? patchProxyResultProxy.result : ((HeyboxMicFragment$attachConnectStatusDialog$1) create(q0Var, cVar)).invokeSuspend(b2.f124493a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @e
    public final Object invokeSuspend(@dl.d Object obj) throws Throwable {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{obj}, this, changeQuickRedirect, false, 46492, new Class[]{Object.class}, Object.class);
        if (patchProxyResultProxy.isSupported) {
            return patchProxyResultProxy.result;
        }
        Object objH = kotlin.coroutines.intrinsics.b.h();
        int i10 = this.f93785b;
        if (i10 == 0) {
            kotlin.t0.n(obj);
            HeyboxMicFragment heyboxMicFragment = this.f93786c;
            Lifecycle.State state = Lifecycle.State.RESUMED;
            AnonymousClass1 anonymousClass1 = new AnonymousClass1(heyboxMicFragment, null);
            this.f93785b = 1;
            if (RepeatOnLifecycleKt.b(heyboxMicFragment, state, anonymousClass1, this) == objH) {
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
