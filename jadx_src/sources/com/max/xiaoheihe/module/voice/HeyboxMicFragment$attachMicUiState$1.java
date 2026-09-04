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
@d(c = "com.max.xiaoheihe.module.voice.HeyboxMicFragment$attachMicUiState$1", f = "HeyboxMicFragment.kt", i = {}, l = {183}, m = "invokeSuspend", n = {}, s = {})
public final class HeyboxMicFragment$attachMicUiState$1 extends SuspendLambda implements p<q0, kotlin.coroutines.c<? super b2>, Object> {
    public static ChangeQuickRedirect changeQuickRedirect;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    int f93835b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    final /* synthetic */ HeyboxMicFragment f93836c;

    /* JADX INFO: renamed from: com.max.xiaoheihe.module.voice.HeyboxMicFragment$attachMicUiState$1$1, reason: invalid class name */
    /* JADX INFO: compiled from: HeyboxMicFragment.kt */
    @d(c = "com.max.xiaoheihe.module.voice.HeyboxMicFragment$attachMicUiState$1$1", f = "HeyboxMicFragment.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
    public static final class AnonymousClass1 extends SuspendLambda implements p<q0, kotlin.coroutines.c<? super b2>, Object> {
        public static ChangeQuickRedirect changeQuickRedirect;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        int f93837b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private /* synthetic */ Object f93838c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        final /* synthetic */ HeyboxMicFragment f93839d;

        /* JADX INFO: renamed from: com.max.xiaoheihe.module.voice.HeyboxMicFragment$attachMicUiState$1$1$1, reason: invalid class name and collision with other inner class name */
        /* JADX INFO: compiled from: HeyboxMicFragment.kt */
        @t0({"SMAP\nHeyboxMicFragment.kt\nKotlin\n*S Kotlin\n*F\n+ 1 HeyboxMicFragment.kt\ncom/max/xiaoheihe/module/voice/HeyboxMicFragment$attachMicUiState$1$1$1\n+ 2 Transform.kt\nkotlinx/coroutines/flow/FlowKt__TransformKt\n+ 3 Emitters.kt\nkotlinx/coroutines/flow/FlowKt__EmittersKt\n+ 4 SafeCollector.common.kt\nkotlinx/coroutines/flow/internal/SafeCollector_commonKt\n*L\n1#1,614:1\n47#2:615\n49#2:619\n50#3:616\n55#3:618\n106#4:617\n*S KotlinDebug\n*F\n+ 1 HeyboxMicFragment.kt\ncom/max/xiaoheihe/module/voice/HeyboxMicFragment$attachMicUiState$1$1$1\n*L\n185#1:615\n185#1:619\n185#1:616\n185#1:618\n185#1:617\n*E\n"})
        @d(c = "com.max.xiaoheihe.module.voice.HeyboxMicFragment$attachMicUiState$1$1$1", f = "HeyboxMicFragment.kt", i = {}, l = {187}, m = "invokeSuspend", n = {}, s = {})
        public static final class C08851 extends SuspendLambda implements p<q0, kotlin.coroutines.c<? super b2>, Object> {
            public static ChangeQuickRedirect changeQuickRedirect;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            int f93840b;

            /* JADX INFO: renamed from: c, reason: collision with root package name */
            final /* synthetic */ HeyboxMicFragment f93841c;

            /* JADX INFO: renamed from: com.max.xiaoheihe.module.voice.HeyboxMicFragment$attachMicUiState$1$1$1$a */
            /* JADX INFO: compiled from: HeyboxMicFragment.kt */
            public static final class a implements f<Boolean> {
                public static ChangeQuickRedirect changeQuickRedirect;

                /* JADX INFO: renamed from: b, reason: collision with root package name */
                final /* synthetic */ HeyboxMicFragment f93842b;

                a(HeyboxMicFragment heyboxMicFragment) {
                    this.f93842b = heyboxMicFragment;
                }

                @e
                public final Object a(boolean z10, @dl.d kotlin.coroutines.c<? super b2> cVar) {
                    PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{new Byte(z10 ? (byte) 1 : (byte) 0), cVar}, this, changeQuickRedirect, false, 46557, new Class[]{Boolean.TYPE, kotlin.coroutines.c.class}, Object.class);
                    if (patchProxyResultProxy.isSupported) {
                        return patchProxyResultProxy.result;
                    }
                    HeyboxMicFragment.T4(this.f93842b, z10);
                    return b2.f124493a;
                }

                @Override // kotlinx.coroutines.flow.f
                public /* bridge */ /* synthetic */ Object emit(Boolean bool, kotlin.coroutines.c cVar) {
                    PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{bool, cVar}, this, changeQuickRedirect, false, 46558, new Class[]{Object.class, kotlin.coroutines.c.class}, Object.class);
                    return patchProxyResultProxy.isSupported ? patchProxyResultProxy.result : a(bool.booleanValue(), cVar);
                }
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            C08851(HeyboxMicFragment heyboxMicFragment, kotlin.coroutines.c<? super C08851> cVar) {
                super(2, cVar);
                this.f93841c = heyboxMicFragment;
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            @dl.d
            public final kotlin.coroutines.c<b2> create(@e Object obj, @dl.d kotlin.coroutines.c<?> cVar) {
                PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{obj, cVar}, this, changeQuickRedirect, false, 46554, new Class[]{Object.class, kotlin.coroutines.c.class}, kotlin.coroutines.c.class);
                return patchProxyResultProxy.isSupported ? (kotlin.coroutines.c) patchProxyResultProxy.result : new C08851(this.f93841c, cVar);
            }

            @Override // yh.p
            public /* bridge */ /* synthetic */ Object invoke(q0 q0Var, kotlin.coroutines.c<? super b2> cVar) {
                PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{q0Var, cVar}, this, changeQuickRedirect, false, 46556, new Class[]{Object.class, Object.class}, Object.class);
                return patchProxyResultProxy.isSupported ? patchProxyResultProxy.result : invoke2(q0Var, cVar);
            }

            @e
            /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
            public final Object invoke2(@dl.d q0 q0Var, @e kotlin.coroutines.c<? super b2> cVar) {
                PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{q0Var, cVar}, this, changeQuickRedirect, false, 46555, new Class[]{q0.class, kotlin.coroutines.c.class}, Object.class);
                return patchProxyResultProxy.isSupported ? patchProxyResultProxy.result : ((C08851) create(q0Var, cVar)).invokeSuspend(b2.f124493a);
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            @e
            public final Object invokeSuspend(@dl.d Object obj) throws Throwable {
                PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{obj}, this, changeQuickRedirect, false, 46553, new Class[]{Object.class}, Object.class);
                if (patchProxyResultProxy.isSupported) {
                    return patchProxyResultProxy.result;
                }
                Object objH = kotlin.coroutines.intrinsics.b.h();
                int i10 = this.f93840b;
                if (i10 == 0) {
                    kotlin.t0.n(obj);
                    final u<com.max.xiaoheihe.module.voice.a> uVarX = HeyboxMicFragment.J4(this.f93841c).x();
                    kotlinx.coroutines.flow.e eVarS0 = g.s0(g.g0(new kotlinx.coroutines.flow.e<Boolean>() { // from class: com.max.xiaoheihe.module.voice.HeyboxMicFragment$attachMicUiState$1$1$1$invokeSuspend$$inlined$map$1
                        public static ChangeQuickRedirect changeQuickRedirect;

                        /* JADX INFO: renamed from: com.max.xiaoheihe.module.voice.HeyboxMicFragment$attachMicUiState$1$1$1$invokeSuspend$$inlined$map$1$2, reason: invalid class name */
                        /* JADX INFO: compiled from: Emitters.kt */
                        @t0({"SMAP\nEmitters.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Emitters.kt\nkotlinx/coroutines/flow/FlowKt__EmittersKt$unsafeTransform$1$1\n+ 2 Transform.kt\nkotlinx/coroutines/flow/FlowKt__TransformKt\n+ 3 HeyboxMicFragment.kt\ncom/max/xiaoheihe/module/voice/HeyboxMicFragment$attachMicUiState$1$1$1\n*L\n1#1,222:1\n48#2:223\n186#3:224\n*E\n"})
                        public static final class AnonymousClass2<T> implements f {
                            public static ChangeQuickRedirect changeQuickRedirect;

                            /* JADX INFO: renamed from: b, reason: collision with root package name */
                            final /* synthetic */ f f93844b;

                            /* JADX INFO: renamed from: com.max.xiaoheihe.module.voice.HeyboxMicFragment$attachMicUiState$1$1$1$invokeSuspend$$inlined$map$1$2$1, reason: invalid class name */
                            /* JADX INFO: compiled from: Emitters.kt */
                            @t0({"SMAP\nEmitters.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Emitters.kt\nkotlinx/coroutines/flow/FlowKt__EmittersKt$unsafeTransform$1$1$emit$1\n*L\n1#1,222:1\n*E\n"})
                            @d(c = "com.max.xiaoheihe.module.voice.HeyboxMicFragment$attachMicUiState$1$1$1$invokeSuspend$$inlined$map$1$2", f = "HeyboxMicFragment.kt", i = {}, l = {bb.c.b.f30852p1}, m = "emit", n = {}, s = {})
                            public static final class AnonymousClass1 extends ContinuationImpl {
                                public static ChangeQuickRedirect changeQuickRedirect;

                                /* JADX INFO: renamed from: b, reason: collision with root package name */
                                /* synthetic */ Object f93845b;

                                /* JADX INFO: renamed from: c, reason: collision with root package name */
                                int f93846c;

                                /* JADX INFO: renamed from: d, reason: collision with root package name */
                                Object f93847d;

                                public AnonymousClass1(kotlin.coroutines.c cVar) {
                                    super(cVar);
                                }

                                @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                                @e
                                public final Object invokeSuspend(@dl.d Object obj) {
                                    PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{obj}, this, changeQuickRedirect, false, 46561, new Class[]{Object.class}, Object.class);
                                    if (patchProxyResultProxy.isSupported) {
                                        return patchProxyResultProxy.result;
                                    }
                                    this.f93845b = obj;
                                    this.f93846c |= Integer.MIN_VALUE;
                                    return AnonymousClass2.this.emit(null, this);
                                }
                            }

                            public AnonymousClass2(f fVar) {
                                this.f93844b = fVar;
                            }

                            /* JADX WARN: Code duplicated, block: B:11:0x003a  */
                            @Override // kotlinx.coroutines.flow.f
                            @e
                            public final Object emit(Object obj, @dl.d kotlin.coroutines.c cVar) throws Throwable {
                                AnonymousClass1 anonymousClass1;
                                PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{obj, cVar}, this, changeQuickRedirect, false, 46560, new Class[]{Object.class, kotlin.coroutines.c.class}, Object.class);
                                if (patchProxyResultProxy.isSupported) {
                                    return patchProxyResultProxy.result;
                                }
                                if (cVar instanceof AnonymousClass1) {
                                    anonymousClass1 = (AnonymousClass1) cVar;
                                    int i10 = anonymousClass1.f93846c;
                                    if ((i10 & Integer.MIN_VALUE) != 0) {
                                        anonymousClass1.f93846c = i10 - Integer.MIN_VALUE;
                                    } else {
                                        anonymousClass1 = new AnonymousClass1(cVar);
                                    }
                                } else {
                                    anonymousClass1 = new AnonymousClass1(cVar);
                                }
                                Object obj2 = anonymousClass1.f93845b;
                                Object objH = kotlin.coroutines.intrinsics.b.h();
                                int i11 = anonymousClass1.f93846c;
                                if (i11 == 0) {
                                    kotlin.t0.n(obj2);
                                    f fVar = this.f93844b;
                                    Boolean boolA = kotlin.coroutines.jvm.internal.a.a(((a) obj).B());
                                    anonymousClass1.f93846c = 1;
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
                            PatchProxyResult patchProxyResultProxy2 = PatchProxy.proxy(new Object[]{fVar, cVar}, this, changeQuickRedirect, false, 46559, new Class[]{f.class, kotlin.coroutines.c.class}, Object.class);
                            if (patchProxyResultProxy2.isSupported) {
                                return patchProxyResultProxy2.result;
                            }
                            Object objA = uVarX.a(new AnonymousClass2(fVar), cVar);
                            return objA == kotlin.coroutines.intrinsics.b.h() ? objA : b2.f124493a;
                        }
                    }));
                    a aVar = new a(this.f93841c);
                    this.f93840b = 1;
                    if (eVarS0.a(aVar, this) == objH) {
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

        /* JADX INFO: renamed from: com.max.xiaoheihe.module.voice.HeyboxMicFragment$attachMicUiState$1$1$2, reason: invalid class name */
        /* JADX INFO: compiled from: HeyboxMicFragment.kt */
        @t0({"SMAP\nHeyboxMicFragment.kt\nKotlin\n*S Kotlin\n*F\n+ 1 HeyboxMicFragment.kt\ncom/max/xiaoheihe/module/voice/HeyboxMicFragment$attachMicUiState$1$1$2\n+ 2 Transform.kt\nkotlinx/coroutines/flow/FlowKt__TransformKt\n+ 3 Emitters.kt\nkotlinx/coroutines/flow/FlowKt__EmittersKt\n+ 4 SafeCollector.common.kt\nkotlinx/coroutines/flow/internal/SafeCollector_commonKt\n*L\n1#1,614:1\n47#2:615\n49#2:619\n50#3:616\n55#3:618\n106#4:617\n*S KotlinDebug\n*F\n+ 1 HeyboxMicFragment.kt\ncom/max/xiaoheihe/module/voice/HeyboxMicFragment$attachMicUiState$1$1$2\n*L\n192#1:615\n192#1:619\n192#1:616\n192#1:618\n192#1:617\n*E\n"})
        @d(c = "com.max.xiaoheihe.module.voice.HeyboxMicFragment$attachMicUiState$1$1$2", f = "HeyboxMicFragment.kt", i = {}, l = {bb.c.b.P0}, m = "invokeSuspend", n = {}, s = {})
        public static final class AnonymousClass2 extends SuspendLambda implements p<q0, kotlin.coroutines.c<? super b2>, Object> {
            public static ChangeQuickRedirect changeQuickRedirect;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            int f93849b;

            /* JADX INFO: renamed from: c, reason: collision with root package name */
            final /* synthetic */ HeyboxMicFragment f93850c;

            /* JADX INFO: renamed from: com.max.xiaoheihe.module.voice.HeyboxMicFragment$attachMicUiState$1$1$2$a */
            /* JADX INFO: compiled from: HeyboxMicFragment.kt */
            public static final class a implements f<Integer> {
                public static ChangeQuickRedirect changeQuickRedirect;

                /* JADX INFO: renamed from: b, reason: collision with root package name */
                final /* synthetic */ HeyboxMicFragment f93851b;

                a(HeyboxMicFragment heyboxMicFragment) {
                    this.f93851b = heyboxMicFragment;
                }

                @e
                public final Object a(int i10, @dl.d kotlin.coroutines.c<? super b2> cVar) {
                    PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{new Integer(i10), cVar}, this, changeQuickRedirect, false, 46566, new Class[]{Integer.TYPE, kotlin.coroutines.c.class}, Object.class);
                    if (patchProxyResultProxy.isSupported) {
                        return patchProxyResultProxy.result;
                    }
                    this.f93851b.Y4().f117513d.setProgress(i10);
                    return b2.f124493a;
                }

                @Override // kotlinx.coroutines.flow.f
                public /* bridge */ /* synthetic */ Object emit(Integer num, kotlin.coroutines.c cVar) {
                    PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{num, cVar}, this, changeQuickRedirect, false, 46567, new Class[]{Object.class, kotlin.coroutines.c.class}, Object.class);
                    return patchProxyResultProxy.isSupported ? patchProxyResultProxy.result : a(num.intValue(), cVar);
                }
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            AnonymousClass2(HeyboxMicFragment heyboxMicFragment, kotlin.coroutines.c<? super AnonymousClass2> cVar) {
                super(2, cVar);
                this.f93850c = heyboxMicFragment;
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            @dl.d
            public final kotlin.coroutines.c<b2> create(@e Object obj, @dl.d kotlin.coroutines.c<?> cVar) {
                PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{obj, cVar}, this, changeQuickRedirect, false, 46563, new Class[]{Object.class, kotlin.coroutines.c.class}, kotlin.coroutines.c.class);
                return patchProxyResultProxy.isSupported ? (kotlin.coroutines.c) patchProxyResultProxy.result : new AnonymousClass2(this.f93850c, cVar);
            }

            @Override // yh.p
            public /* bridge */ /* synthetic */ Object invoke(q0 q0Var, kotlin.coroutines.c<? super b2> cVar) {
                PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{q0Var, cVar}, this, changeQuickRedirect, false, 46565, new Class[]{Object.class, Object.class}, Object.class);
                return patchProxyResultProxy.isSupported ? patchProxyResultProxy.result : invoke2(q0Var, cVar);
            }

            @e
            /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
            public final Object invoke2(@dl.d q0 q0Var, @e kotlin.coroutines.c<? super b2> cVar) {
                PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{q0Var, cVar}, this, changeQuickRedirect, false, 46564, new Class[]{q0.class, kotlin.coroutines.c.class}, Object.class);
                return patchProxyResultProxy.isSupported ? patchProxyResultProxy.result : ((AnonymousClass2) create(q0Var, cVar)).invokeSuspend(b2.f124493a);
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            @e
            public final Object invokeSuspend(@dl.d Object obj) throws Throwable {
                PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{obj}, this, changeQuickRedirect, false, 46562, new Class[]{Object.class}, Object.class);
                if (patchProxyResultProxy.isSupported) {
                    return patchProxyResultProxy.result;
                }
                Object objH = kotlin.coroutines.intrinsics.b.h();
                int i10 = this.f93849b;
                if (i10 == 0) {
                    kotlin.t0.n(obj);
                    final u<com.max.xiaoheihe.module.voice.a> uVarX = HeyboxMicFragment.J4(this.f93850c).x();
                    kotlinx.coroutines.flow.e eVarS0 = g.s0(g.g0(new kotlinx.coroutines.flow.e<Integer>() { // from class: com.max.xiaoheihe.module.voice.HeyboxMicFragment$attachMicUiState$1$1$2$invokeSuspend$$inlined$map$1
                        public static ChangeQuickRedirect changeQuickRedirect;

                        /* JADX INFO: renamed from: com.max.xiaoheihe.module.voice.HeyboxMicFragment$attachMicUiState$1$1$2$invokeSuspend$$inlined$map$1$2, reason: invalid class name */
                        /* JADX INFO: compiled from: Emitters.kt */
                        @t0({"SMAP\nEmitters.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Emitters.kt\nkotlinx/coroutines/flow/FlowKt__EmittersKt$unsafeTransform$1$1\n+ 2 Transform.kt\nkotlinx/coroutines/flow/FlowKt__TransformKt\n+ 3 HeyboxMicFragment.kt\ncom/max/xiaoheihe/module/voice/HeyboxMicFragment$attachMicUiState$1$1$2\n*L\n1#1,222:1\n48#2:223\n193#3,4:224\n*E\n"})
                        public static final class AnonymousClass2<T> implements f {
                            public static ChangeQuickRedirect changeQuickRedirect;

                            /* JADX INFO: renamed from: b, reason: collision with root package name */
                            final /* synthetic */ f f93853b;

                            /* JADX INFO: renamed from: com.max.xiaoheihe.module.voice.HeyboxMicFragment$attachMicUiState$1$1$2$invokeSuspend$$inlined$map$1$2$1, reason: invalid class name */
                            /* JADX INFO: compiled from: Emitters.kt */
                            @t0({"SMAP\nEmitters.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Emitters.kt\nkotlinx/coroutines/flow/FlowKt__EmittersKt$unsafeTransform$1$1$emit$1\n*L\n1#1,222:1\n*E\n"})
                            @d(c = "com.max.xiaoheihe.module.voice.HeyboxMicFragment$attachMicUiState$1$1$2$invokeSuspend$$inlined$map$1$2", f = "HeyboxMicFragment.kt", i = {}, l = {bb.c.b.f30852p1}, m = "emit", n = {}, s = {})
                            public static final class AnonymousClass1 extends ContinuationImpl {
                                public static ChangeQuickRedirect changeQuickRedirect;

                                /* JADX INFO: renamed from: b, reason: collision with root package name */
                                /* synthetic */ Object f93854b;

                                /* JADX INFO: renamed from: c, reason: collision with root package name */
                                int f93855c;

                                /* JADX INFO: renamed from: d, reason: collision with root package name */
                                Object f93856d;

                                public AnonymousClass1(kotlin.coroutines.c cVar) {
                                    super(cVar);
                                }

                                @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                                @e
                                public final Object invokeSuspend(@dl.d Object obj) {
                                    PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{obj}, this, changeQuickRedirect, false, 46570, new Class[]{Object.class}, Object.class);
                                    if (patchProxyResultProxy.isSupported) {
                                        return patchProxyResultProxy.result;
                                    }
                                    this.f93854b = obj;
                                    this.f93855c |= Integer.MIN_VALUE;
                                    return AnonymousClass2.this.emit(null, this);
                                }
                            }

                            public AnonymousClass2(f fVar) {
                                this.f93853b = fVar;
                            }

                            /* JADX WARN: Code duplicated, block: B:11:0x003a  */
                            @Override // kotlinx.coroutines.flow.f
                            @e
                            public final Object emit(Object obj, @dl.d kotlin.coroutines.c cVar) throws Throwable {
                                AnonymousClass1 anonymousClass1;
                                PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{obj, cVar}, this, changeQuickRedirect, false, 46569, new Class[]{Object.class, kotlin.coroutines.c.class}, Object.class);
                                if (patchProxyResultProxy.isSupported) {
                                    return patchProxyResultProxy.result;
                                }
                                if (cVar instanceof AnonymousClass1) {
                                    anonymousClass1 = (AnonymousClass1) cVar;
                                    int i10 = anonymousClass1.f93855c;
                                    if ((i10 & Integer.MIN_VALUE) != 0) {
                                        anonymousClass1.f93855c = i10 - Integer.MIN_VALUE;
                                    } else {
                                        anonymousClass1 = new AnonymousClass1(cVar);
                                    }
                                } else {
                                    anonymousClass1 = new AnonymousClass1(cVar);
                                }
                                Object obj2 = anonymousClass1.f93854b;
                                Object objH = kotlin.coroutines.intrinsics.b.h();
                                int i11 = anonymousClass1.f93855c;
                                if (i11 == 0) {
                                    kotlin.t0.n(obj2);
                                    f fVar = this.f93853b;
                                    a aVar = (a) obj;
                                    Integer numF = (aVar.x() <= 0 || !aVar.z()) ? kotlin.coroutines.jvm.internal.a.f(0) : kotlin.coroutines.jvm.internal.a.f(aVar.t());
                                    anonymousClass1.f93855c = 1;
                                    if (fVar.emit(numF, anonymousClass1) == objH) {
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
                        public Object a(@dl.d f<? super Integer> fVar, @dl.d kotlin.coroutines.c cVar) {
                            PatchProxyResult patchProxyResultProxy2 = PatchProxy.proxy(new Object[]{fVar, cVar}, this, changeQuickRedirect, false, 46568, new Class[]{f.class, kotlin.coroutines.c.class}, Object.class);
                            if (patchProxyResultProxy2.isSupported) {
                                return patchProxyResultProxy2.result;
                            }
                            Object objA = uVarX.a(new AnonymousClass2(fVar), cVar);
                            return objA == kotlin.coroutines.intrinsics.b.h() ? objA : b2.f124493a;
                        }
                    }));
                    a aVar = new a(this.f93850c);
                    this.f93849b = 1;
                    if (eVarS0.a(aVar, this) == objH) {
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

        /* JADX INFO: renamed from: com.max.xiaoheihe.module.voice.HeyboxMicFragment$attachMicUiState$1$1$3, reason: invalid class name */
        /* JADX INFO: compiled from: HeyboxMicFragment.kt */
        @t0({"SMAP\nHeyboxMicFragment.kt\nKotlin\n*S Kotlin\n*F\n+ 1 HeyboxMicFragment.kt\ncom/max/xiaoheihe/module/voice/HeyboxMicFragment$attachMicUiState$1$1$3\n+ 2 Transform.kt\nkotlinx/coroutines/flow/FlowKt__TransformKt\n+ 3 Emitters.kt\nkotlinx/coroutines/flow/FlowKt__EmittersKt\n+ 4 SafeCollector.common.kt\nkotlinx/coroutines/flow/internal/SafeCollector_commonKt\n*L\n1#1,614:1\n47#2:615\n49#2:619\n50#3:616\n55#3:618\n106#4:617\n*S KotlinDebug\n*F\n+ 1 HeyboxMicFragment.kt\ncom/max/xiaoheihe/module/voice/HeyboxMicFragment$attachMicUiState$1$1$3\n*L\n202#1:615\n202#1:619\n202#1:616\n202#1:618\n202#1:617\n*E\n"})
        @d(c = "com.max.xiaoheihe.module.voice.HeyboxMicFragment$attachMicUiState$1$1$3", f = "HeyboxMicFragment.kt", i = {}, l = {204}, m = "invokeSuspend", n = {}, s = {})
        public static final class AnonymousClass3 extends SuspendLambda implements p<q0, kotlin.coroutines.c<? super b2>, Object> {
            public static ChangeQuickRedirect changeQuickRedirect;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            int f93858b;

            /* JADX INFO: renamed from: c, reason: collision with root package name */
            final /* synthetic */ HeyboxMicFragment f93859c;

            /* JADX INFO: renamed from: com.max.xiaoheihe.module.voice.HeyboxMicFragment$attachMicUiState$1$1$3$a */
            /* JADX INFO: compiled from: HeyboxMicFragment.kt */
            public static final class a implements f<Boolean> {
                public static ChangeQuickRedirect changeQuickRedirect;

                /* JADX INFO: renamed from: b, reason: collision with root package name */
                final /* synthetic */ HeyboxMicFragment f93860b;

                a(HeyboxMicFragment heyboxMicFragment) {
                    this.f93860b = heyboxMicFragment;
                }

                @e
                public final Object a(boolean z10, @dl.d kotlin.coroutines.c<? super b2> cVar) {
                    PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{new Byte(z10 ? (byte) 1 : (byte) 0), cVar}, this, changeQuickRedirect, false, 46575, new Class[]{Boolean.TYPE, kotlin.coroutines.c.class}, Object.class);
                    if (patchProxyResultProxy.isSupported) {
                        return patchProxyResultProxy.result;
                    }
                    this.f93860b.Y4().f117519j.setClickable(z10);
                    return b2.f124493a;
                }

                @Override // kotlinx.coroutines.flow.f
                public /* bridge */ /* synthetic */ Object emit(Boolean bool, kotlin.coroutines.c cVar) {
                    PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{bool, cVar}, this, changeQuickRedirect, false, 46576, new Class[]{Object.class, kotlin.coroutines.c.class}, Object.class);
                    return patchProxyResultProxy.isSupported ? patchProxyResultProxy.result : a(bool.booleanValue(), cVar);
                }
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            AnonymousClass3(HeyboxMicFragment heyboxMicFragment, kotlin.coroutines.c<? super AnonymousClass3> cVar) {
                super(2, cVar);
                this.f93859c = heyboxMicFragment;
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            @dl.d
            public final kotlin.coroutines.c<b2> create(@e Object obj, @dl.d kotlin.coroutines.c<?> cVar) {
                PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{obj, cVar}, this, changeQuickRedirect, false, 46572, new Class[]{Object.class, kotlin.coroutines.c.class}, kotlin.coroutines.c.class);
                return patchProxyResultProxy.isSupported ? (kotlin.coroutines.c) patchProxyResultProxy.result : new AnonymousClass3(this.f93859c, cVar);
            }

            @Override // yh.p
            public /* bridge */ /* synthetic */ Object invoke(q0 q0Var, kotlin.coroutines.c<? super b2> cVar) {
                PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{q0Var, cVar}, this, changeQuickRedirect, false, 46574, new Class[]{Object.class, Object.class}, Object.class);
                return patchProxyResultProxy.isSupported ? patchProxyResultProxy.result : invoke2(q0Var, cVar);
            }

            @e
            /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
            public final Object invoke2(@dl.d q0 q0Var, @e kotlin.coroutines.c<? super b2> cVar) {
                PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{q0Var, cVar}, this, changeQuickRedirect, false, 46573, new Class[]{q0.class, kotlin.coroutines.c.class}, Object.class);
                return patchProxyResultProxy.isSupported ? patchProxyResultProxy.result : ((AnonymousClass3) create(q0Var, cVar)).invokeSuspend(b2.f124493a);
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            @e
            public final Object invokeSuspend(@dl.d Object obj) throws Throwable {
                PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{obj}, this, changeQuickRedirect, false, 46571, new Class[]{Object.class}, Object.class);
                if (patchProxyResultProxy.isSupported) {
                    return patchProxyResultProxy.result;
                }
                Object objH = kotlin.coroutines.intrinsics.b.h();
                int i10 = this.f93858b;
                if (i10 == 0) {
                    kotlin.t0.n(obj);
                    final u<com.max.xiaoheihe.module.voice.a> uVarX = HeyboxMicFragment.J4(this.f93859c).x();
                    kotlinx.coroutines.flow.e eVarG0 = g.g0(new kotlinx.coroutines.flow.e<Boolean>() { // from class: com.max.xiaoheihe.module.voice.HeyboxMicFragment$attachMicUiState$1$1$3$invokeSuspend$$inlined$map$1
                        public static ChangeQuickRedirect changeQuickRedirect;

                        /* JADX INFO: renamed from: com.max.xiaoheihe.module.voice.HeyboxMicFragment$attachMicUiState$1$1$3$invokeSuspend$$inlined$map$1$2, reason: invalid class name */
                        /* JADX INFO: compiled from: Emitters.kt */
                        @t0({"SMAP\nEmitters.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Emitters.kt\nkotlinx/coroutines/flow/FlowKt__EmittersKt$unsafeTransform$1$1\n+ 2 Transform.kt\nkotlinx/coroutines/flow/FlowKt__TransformKt\n+ 3 HeyboxMicFragment.kt\ncom/max/xiaoheihe/module/voice/HeyboxMicFragment$attachMicUiState$1$1$3\n*L\n1#1,222:1\n48#2:223\n203#3:224\n*E\n"})
                        public static final class AnonymousClass2<T> implements f {
                            public static ChangeQuickRedirect changeQuickRedirect;

                            /* JADX INFO: renamed from: b, reason: collision with root package name */
                            final /* synthetic */ f f93862b;

                            /* JADX INFO: renamed from: com.max.xiaoheihe.module.voice.HeyboxMicFragment$attachMicUiState$1$1$3$invokeSuspend$$inlined$map$1$2$1, reason: invalid class name */
                            /* JADX INFO: compiled from: Emitters.kt */
                            @t0({"SMAP\nEmitters.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Emitters.kt\nkotlinx/coroutines/flow/FlowKt__EmittersKt$unsafeTransform$1$1$emit$1\n*L\n1#1,222:1\n*E\n"})
                            @d(c = "com.max.xiaoheihe.module.voice.HeyboxMicFragment$attachMicUiState$1$1$3$invokeSuspend$$inlined$map$1$2", f = "HeyboxMicFragment.kt", i = {}, l = {bb.c.b.f30852p1}, m = "emit", n = {}, s = {})
                            public static final class AnonymousClass1 extends ContinuationImpl {
                                public static ChangeQuickRedirect changeQuickRedirect;

                                /* JADX INFO: renamed from: b, reason: collision with root package name */
                                /* synthetic */ Object f93863b;

                                /* JADX INFO: renamed from: c, reason: collision with root package name */
                                int f93864c;

                                /* JADX INFO: renamed from: d, reason: collision with root package name */
                                Object f93865d;

                                public AnonymousClass1(kotlin.coroutines.c cVar) {
                                    super(cVar);
                                }

                                @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                                @e
                                public final Object invokeSuspend(@dl.d Object obj) {
                                    PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{obj}, this, changeQuickRedirect, false, 46579, new Class[]{Object.class}, Object.class);
                                    if (patchProxyResultProxy.isSupported) {
                                        return patchProxyResultProxy.result;
                                    }
                                    this.f93863b = obj;
                                    this.f93864c |= Integer.MIN_VALUE;
                                    return AnonymousClass2.this.emit(null, this);
                                }
                            }

                            public AnonymousClass2(f fVar) {
                                this.f93862b = fVar;
                            }

                            /* JADX WARN: Code duplicated, block: B:11:0x003a  */
                            @Override // kotlinx.coroutines.flow.f
                            @e
                            public final Object emit(Object obj, @dl.d kotlin.coroutines.c cVar) throws Throwable {
                                AnonymousClass1 anonymousClass1;
                                PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{obj, cVar}, this, changeQuickRedirect, false, 46578, new Class[]{Object.class, kotlin.coroutines.c.class}, Object.class);
                                if (patchProxyResultProxy.isSupported) {
                                    return patchProxyResultProxy.result;
                                }
                                if (cVar instanceof AnonymousClass1) {
                                    anonymousClass1 = (AnonymousClass1) cVar;
                                    int i10 = anonymousClass1.f93864c;
                                    if ((i10 & Integer.MIN_VALUE) != 0) {
                                        anonymousClass1.f93864c = i10 - Integer.MIN_VALUE;
                                    } else {
                                        anonymousClass1 = new AnonymousClass1(cVar);
                                    }
                                } else {
                                    anonymousClass1 = new AnonymousClass1(cVar);
                                }
                                Object obj2 = anonymousClass1.f93863b;
                                Object objH = kotlin.coroutines.intrinsics.b.h();
                                int i11 = anonymousClass1.f93864c;
                                if (i11 == 0) {
                                    kotlin.t0.n(obj2);
                                    f fVar = this.f93862b;
                                    Boolean boolA = kotlin.coroutines.jvm.internal.a.a(((a) obj).C());
                                    anonymousClass1.f93864c = 1;
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
                            PatchProxyResult patchProxyResultProxy2 = PatchProxy.proxy(new Object[]{fVar, cVar}, this, changeQuickRedirect, false, 46577, new Class[]{f.class, kotlin.coroutines.c.class}, Object.class);
                            if (patchProxyResultProxy2.isSupported) {
                                return patchProxyResultProxy2.result;
                            }
                            Object objA = uVarX.a(new AnonymousClass2(fVar), cVar);
                            return objA == kotlin.coroutines.intrinsics.b.h() ? objA : b2.f124493a;
                        }
                    });
                    a aVar = new a(this.f93859c);
                    this.f93858b = 1;
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
            this.f93839d = heyboxMicFragment;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @dl.d
        public final kotlin.coroutines.c<b2> create(@e Object obj, @dl.d kotlin.coroutines.c<?> cVar) {
            PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{obj, cVar}, this, changeQuickRedirect, false, 46550, new Class[]{Object.class, kotlin.coroutines.c.class}, kotlin.coroutines.c.class);
            if (patchProxyResultProxy.isSupported) {
                return (kotlin.coroutines.c) patchProxyResultProxy.result;
            }
            AnonymousClass1 anonymousClass1 = new AnonymousClass1(this.f93839d, cVar);
            anonymousClass1.f93838c = obj;
            return anonymousClass1;
        }

        @Override // yh.p
        public /* bridge */ /* synthetic */ Object invoke(q0 q0Var, kotlin.coroutines.c<? super b2> cVar) {
            PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{q0Var, cVar}, this, changeQuickRedirect, false, 46552, new Class[]{Object.class, Object.class}, Object.class);
            return patchProxyResultProxy.isSupported ? patchProxyResultProxy.result : invoke2(q0Var, cVar);
        }

        @e
        /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
        public final Object invoke2(@dl.d q0 q0Var, @e kotlin.coroutines.c<? super b2> cVar) {
            PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{q0Var, cVar}, this, changeQuickRedirect, false, 46551, new Class[]{q0.class, kotlin.coroutines.c.class}, Object.class);
            return patchProxyResultProxy.isSupported ? patchProxyResultProxy.result : ((AnonymousClass1) create(q0Var, cVar)).invokeSuspend(b2.f124493a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @e
        public final Object invokeSuspend(@dl.d Object obj) throws Throwable {
            PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{obj}, this, changeQuickRedirect, false, 46549, new Class[]{Object.class}, Object.class);
            if (patchProxyResultProxy.isSupported) {
                return patchProxyResultProxy.result;
            }
            kotlin.coroutines.intrinsics.b.h();
            if (this.f93837b != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            kotlin.t0.n(obj);
            q0 q0Var = (q0) this.f93838c;
            k.f(q0Var, null, null, new C08851(this.f93839d, null), 3, null);
            k.f(q0Var, null, null, new AnonymousClass2(this.f93839d, null), 3, null);
            k.f(q0Var, null, null, new AnonymousClass3(this.f93839d, null), 3, null);
            return b2.f124493a;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    HeyboxMicFragment$attachMicUiState$1(HeyboxMicFragment heyboxMicFragment, kotlin.coroutines.c<? super HeyboxMicFragment$attachMicUiState$1> cVar) {
        super(2, cVar);
        this.f93836c = heyboxMicFragment;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @dl.d
    public final kotlin.coroutines.c<b2> create(@e Object obj, @dl.d kotlin.coroutines.c<?> cVar) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{obj, cVar}, this, changeQuickRedirect, false, 46546, new Class[]{Object.class, kotlin.coroutines.c.class}, kotlin.coroutines.c.class);
        return patchProxyResultProxy.isSupported ? (kotlin.coroutines.c) patchProxyResultProxy.result : new HeyboxMicFragment$attachMicUiState$1(this.f93836c, cVar);
    }

    @Override // yh.p
    public /* bridge */ /* synthetic */ Object invoke(q0 q0Var, kotlin.coroutines.c<? super b2> cVar) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{q0Var, cVar}, this, changeQuickRedirect, false, 46548, new Class[]{Object.class, Object.class}, Object.class);
        return patchProxyResultProxy.isSupported ? patchProxyResultProxy.result : invoke2(q0Var, cVar);
    }

    @e
    /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
    public final Object invoke2(@dl.d q0 q0Var, @e kotlin.coroutines.c<? super b2> cVar) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{q0Var, cVar}, this, changeQuickRedirect, false, 46547, new Class[]{q0.class, kotlin.coroutines.c.class}, Object.class);
        return patchProxyResultProxy.isSupported ? patchProxyResultProxy.result : ((HeyboxMicFragment$attachMicUiState$1) create(q0Var, cVar)).invokeSuspend(b2.f124493a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @e
    public final Object invokeSuspend(@dl.d Object obj) throws Throwable {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{obj}, this, changeQuickRedirect, false, 46545, new Class[]{Object.class}, Object.class);
        if (patchProxyResultProxy.isSupported) {
            return patchProxyResultProxy.result;
        }
        Object objH = kotlin.coroutines.intrinsics.b.h();
        int i10 = this.f93835b;
        if (i10 == 0) {
            kotlin.t0.n(obj);
            HeyboxMicFragment heyboxMicFragment = this.f93836c;
            Lifecycle.State state = Lifecycle.State.RESUMED;
            AnonymousClass1 anonymousClass1 = new AnonymousClass1(heyboxMicFragment, null);
            this.f93835b = 1;
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
