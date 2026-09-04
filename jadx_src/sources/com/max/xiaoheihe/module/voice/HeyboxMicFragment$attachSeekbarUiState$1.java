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
@d(c = "com.max.xiaoheihe.module.voice.HeyboxMicFragment$attachSeekbarUiState$1", f = "HeyboxMicFragment.kt", i = {}, l = {bb.c.b.f30645g1}, m = "invokeSuspend", n = {}, s = {})
public final class HeyboxMicFragment$attachSeekbarUiState$1 extends SuspendLambda implements p<q0, kotlin.coroutines.c<? super b2>, Object> {
    public static ChangeQuickRedirect changeQuickRedirect;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    int f93867b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    final /* synthetic */ HeyboxMicFragment f93868c;

    /* JADX INFO: renamed from: com.max.xiaoheihe.module.voice.HeyboxMicFragment$attachSeekbarUiState$1$1, reason: invalid class name */
    /* JADX INFO: compiled from: HeyboxMicFragment.kt */
    @d(c = "com.max.xiaoheihe.module.voice.HeyboxMicFragment$attachSeekbarUiState$1$1", f = "HeyboxMicFragment.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
    public static final class AnonymousClass1 extends SuspendLambda implements p<q0, kotlin.coroutines.c<? super b2>, Object> {
        public static ChangeQuickRedirect changeQuickRedirect;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        int f93869b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private /* synthetic */ Object f93870c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        final /* synthetic */ HeyboxMicFragment f93871d;

        /* JADX INFO: renamed from: com.max.xiaoheihe.module.voice.HeyboxMicFragment$attachSeekbarUiState$1$1$1, reason: invalid class name and collision with other inner class name */
        /* JADX INFO: compiled from: HeyboxMicFragment.kt */
        @t0({"SMAP\nHeyboxMicFragment.kt\nKotlin\n*S Kotlin\n*F\n+ 1 HeyboxMicFragment.kt\ncom/max/xiaoheihe/module/voice/HeyboxMicFragment$attachSeekbarUiState$1$1$1\n+ 2 Transform.kt\nkotlinx/coroutines/flow/FlowKt__TransformKt\n+ 3 Emitters.kt\nkotlinx/coroutines/flow/FlowKt__EmittersKt\n+ 4 SafeCollector.common.kt\nkotlinx/coroutines/flow/internal/SafeCollector_commonKt\n*L\n1#1,614:1\n47#2:615\n49#2:619\n50#3:616\n55#3:618\n106#4:617\n*S KotlinDebug\n*F\n+ 1 HeyboxMicFragment.kt\ncom/max/xiaoheihe/module/voice/HeyboxMicFragment$attachSeekbarUiState$1$1$1\n*L\n216#1:615\n216#1:619\n216#1:616\n216#1:618\n216#1:617\n*E\n"})
        @d(c = "com.max.xiaoheihe.module.voice.HeyboxMicFragment$attachSeekbarUiState$1$1$1", f = "HeyboxMicFragment.kt", i = {}, l = {221}, m = "invokeSuspend", n = {}, s = {})
        public static final class C08861 extends SuspendLambda implements p<q0, kotlin.coroutines.c<? super b2>, Object> {
            public static ChangeQuickRedirect changeQuickRedirect;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            int f93872b;

            /* JADX INFO: renamed from: c, reason: collision with root package name */
            final /* synthetic */ HeyboxMicFragment f93873c;

            /* JADX INFO: renamed from: com.max.xiaoheihe.module.voice.HeyboxMicFragment$attachSeekbarUiState$1$1$1$a */
            /* JADX INFO: compiled from: HeyboxMicFragment.kt */
            public static final class a implements f<Integer> {
                public static ChangeQuickRedirect changeQuickRedirect;

                /* JADX INFO: renamed from: b, reason: collision with root package name */
                final /* synthetic */ HeyboxMicFragment f93874b;

                a(HeyboxMicFragment heyboxMicFragment) {
                    this.f93874b = heyboxMicFragment;
                }

                @e
                public final Object a(int i10, @dl.d kotlin.coroutines.c<? super b2> cVar) {
                    PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{new Integer(i10), cVar}, this, changeQuickRedirect, false, 46592, new Class[]{Integer.TYPE, kotlin.coroutines.c.class}, Object.class);
                    if (patchProxyResultProxy.isSupported) {
                        return patchProxyResultProxy.result;
                    }
                    this.f93874b.Y4().f117521l.setProgress(i10);
                    return b2.f124493a;
                }

                @Override // kotlinx.coroutines.flow.f
                public /* bridge */ /* synthetic */ Object emit(Integer num, kotlin.coroutines.c cVar) {
                    PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{num, cVar}, this, changeQuickRedirect, false, 46593, new Class[]{Object.class, kotlin.coroutines.c.class}, Object.class);
                    return patchProxyResultProxy.isSupported ? patchProxyResultProxy.result : a(num.intValue(), cVar);
                }
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            C08861(HeyboxMicFragment heyboxMicFragment, kotlin.coroutines.c<? super C08861> cVar) {
                super(2, cVar);
                this.f93873c = heyboxMicFragment;
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            @dl.d
            public final kotlin.coroutines.c<b2> create(@e Object obj, @dl.d kotlin.coroutines.c<?> cVar) {
                PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{obj, cVar}, this, changeQuickRedirect, false, 46589, new Class[]{Object.class, kotlin.coroutines.c.class}, kotlin.coroutines.c.class);
                return patchProxyResultProxy.isSupported ? (kotlin.coroutines.c) patchProxyResultProxy.result : new C08861(this.f93873c, cVar);
            }

            @Override // yh.p
            public /* bridge */ /* synthetic */ Object invoke(q0 q0Var, kotlin.coroutines.c<? super b2> cVar) {
                PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{q0Var, cVar}, this, changeQuickRedirect, false, 46591, new Class[]{Object.class, Object.class}, Object.class);
                return patchProxyResultProxy.isSupported ? patchProxyResultProxy.result : invoke2(q0Var, cVar);
            }

            @e
            /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
            public final Object invoke2(@dl.d q0 q0Var, @e kotlin.coroutines.c<? super b2> cVar) {
                PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{q0Var, cVar}, this, changeQuickRedirect, false, 46590, new Class[]{q0.class, kotlin.coroutines.c.class}, Object.class);
                return patchProxyResultProxy.isSupported ? patchProxyResultProxy.result : ((C08861) create(q0Var, cVar)).invokeSuspend(b2.f124493a);
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            @e
            public final Object invokeSuspend(@dl.d Object obj) throws Throwable {
                PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{obj}, this, changeQuickRedirect, false, 46588, new Class[]{Object.class}, Object.class);
                if (patchProxyResultProxy.isSupported) {
                    return patchProxyResultProxy.result;
                }
                Object objH = kotlin.coroutines.intrinsics.b.h();
                int i10 = this.f93872b;
                if (i10 == 0) {
                    kotlin.t0.n(obj);
                    final u<com.max.xiaoheihe.module.voice.a> uVarX = HeyboxMicFragment.J4(this.f93873c).x();
                    kotlinx.coroutines.flow.e eVarG0 = g.g0(new kotlinx.coroutines.flow.e<Integer>() { // from class: com.max.xiaoheihe.module.voice.HeyboxMicFragment$attachSeekbarUiState$1$1$1$invokeSuspend$$inlined$map$1
                        public static ChangeQuickRedirect changeQuickRedirect;

                        /* JADX INFO: renamed from: com.max.xiaoheihe.module.voice.HeyboxMicFragment$attachSeekbarUiState$1$1$1$invokeSuspend$$inlined$map$1$2, reason: invalid class name */
                        /* JADX INFO: compiled from: Emitters.kt */
                        @t0({"SMAP\nEmitters.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Emitters.kt\nkotlinx/coroutines/flow/FlowKt__EmittersKt$unsafeTransform$1$1\n+ 2 Transform.kt\nkotlinx/coroutines/flow/FlowKt__TransformKt\n+ 3 HeyboxMicFragment.kt\ncom/max/xiaoheihe/module/voice/HeyboxMicFragment$attachSeekbarUiState$1$1$1\n*L\n1#1,222:1\n48#2:223\n217#3,4:224\n*E\n"})
                        public static final class AnonymousClass2<T> implements f {
                            public static ChangeQuickRedirect changeQuickRedirect;

                            /* JADX INFO: renamed from: b, reason: collision with root package name */
                            final /* synthetic */ f f93876b;

                            /* JADX INFO: renamed from: com.max.xiaoheihe.module.voice.HeyboxMicFragment$attachSeekbarUiState$1$1$1$invokeSuspend$$inlined$map$1$2$1, reason: invalid class name */
                            /* JADX INFO: compiled from: Emitters.kt */
                            @t0({"SMAP\nEmitters.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Emitters.kt\nkotlinx/coroutines/flow/FlowKt__EmittersKt$unsafeTransform$1$1$emit$1\n*L\n1#1,222:1\n*E\n"})
                            @d(c = "com.max.xiaoheihe.module.voice.HeyboxMicFragment$attachSeekbarUiState$1$1$1$invokeSuspend$$inlined$map$1$2", f = "HeyboxMicFragment.kt", i = {}, l = {bb.c.b.f30852p1}, m = "emit", n = {}, s = {})
                            public static final class AnonymousClass1 extends ContinuationImpl {
                                public static ChangeQuickRedirect changeQuickRedirect;

                                /* JADX INFO: renamed from: b, reason: collision with root package name */
                                /* synthetic */ Object f93877b;

                                /* JADX INFO: renamed from: c, reason: collision with root package name */
                                int f93878c;

                                /* JADX INFO: renamed from: d, reason: collision with root package name */
                                Object f93879d;

                                public AnonymousClass1(kotlin.coroutines.c cVar) {
                                    super(cVar);
                                }

                                @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                                @e
                                public final Object invokeSuspend(@dl.d Object obj) {
                                    PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{obj}, this, changeQuickRedirect, false, 46596, new Class[]{Object.class}, Object.class);
                                    if (patchProxyResultProxy.isSupported) {
                                        return patchProxyResultProxy.result;
                                    }
                                    this.f93877b = obj;
                                    this.f93878c |= Integer.MIN_VALUE;
                                    return AnonymousClass2.this.emit(null, this);
                                }
                            }

                            public AnonymousClass2(f fVar) {
                                this.f93876b = fVar;
                            }

                            /* JADX WARN: Code duplicated, block: B:11:0x003a  */
                            @Override // kotlinx.coroutines.flow.f
                            @e
                            public final Object emit(Object obj, @dl.d kotlin.coroutines.c cVar) throws Throwable {
                                AnonymousClass1 anonymousClass1;
                                PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{obj, cVar}, this, changeQuickRedirect, false, 46595, new Class[]{Object.class, kotlin.coroutines.c.class}, Object.class);
                                if (patchProxyResultProxy.isSupported) {
                                    return patchProxyResultProxy.result;
                                }
                                if (cVar instanceof AnonymousClass1) {
                                    anonymousClass1 = (AnonymousClass1) cVar;
                                    int i10 = anonymousClass1.f93878c;
                                    if ((i10 & Integer.MIN_VALUE) != 0) {
                                        anonymousClass1.f93878c = i10 - Integer.MIN_VALUE;
                                    } else {
                                        anonymousClass1 = new AnonymousClass1(cVar);
                                    }
                                } else {
                                    anonymousClass1 = new AnonymousClass1(cVar);
                                }
                                Object obj2 = anonymousClass1.f93877b;
                                Object objH = kotlin.coroutines.intrinsics.b.h();
                                int i11 = anonymousClass1.f93878c;
                                if (i11 == 0) {
                                    kotlin.t0.n(obj2);
                                    f fVar = this.f93876b;
                                    a aVar = (a) obj;
                                    Integer numF = aVar.z() ? kotlin.coroutines.jvm.internal.a.f(aVar.x()) : kotlin.coroutines.jvm.internal.a.f(0);
                                    anonymousClass1.f93878c = 1;
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
                            PatchProxyResult patchProxyResultProxy2 = PatchProxy.proxy(new Object[]{fVar, cVar}, this, changeQuickRedirect, false, 46594, new Class[]{f.class, kotlin.coroutines.c.class}, Object.class);
                            if (patchProxyResultProxy2.isSupported) {
                                return patchProxyResultProxy2.result;
                            }
                            Object objA = uVarX.a(new AnonymousClass2(fVar), cVar);
                            return objA == kotlin.coroutines.intrinsics.b.h() ? objA : b2.f124493a;
                        }
                    });
                    a aVar = new a(this.f93873c);
                    this.f93872b = 1;
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
            this.f93871d = heyboxMicFragment;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @dl.d
        public final kotlin.coroutines.c<b2> create(@e Object obj, @dl.d kotlin.coroutines.c<?> cVar) {
            PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{obj, cVar}, this, changeQuickRedirect, false, 46585, new Class[]{Object.class, kotlin.coroutines.c.class}, kotlin.coroutines.c.class);
            if (patchProxyResultProxy.isSupported) {
                return (kotlin.coroutines.c) patchProxyResultProxy.result;
            }
            AnonymousClass1 anonymousClass1 = new AnonymousClass1(this.f93871d, cVar);
            anonymousClass1.f93870c = obj;
            return anonymousClass1;
        }

        @Override // yh.p
        public /* bridge */ /* synthetic */ Object invoke(q0 q0Var, kotlin.coroutines.c<? super b2> cVar) {
            PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{q0Var, cVar}, this, changeQuickRedirect, false, 46587, new Class[]{Object.class, Object.class}, Object.class);
            return patchProxyResultProxy.isSupported ? patchProxyResultProxy.result : invoke2(q0Var, cVar);
        }

        @e
        /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
        public final Object invoke2(@dl.d q0 q0Var, @e kotlin.coroutines.c<? super b2> cVar) {
            PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{q0Var, cVar}, this, changeQuickRedirect, false, 46586, new Class[]{q0.class, kotlin.coroutines.c.class}, Object.class);
            return patchProxyResultProxy.isSupported ? patchProxyResultProxy.result : ((AnonymousClass1) create(q0Var, cVar)).invokeSuspend(b2.f124493a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @e
        public final Object invokeSuspend(@dl.d Object obj) throws Throwable {
            PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{obj}, this, changeQuickRedirect, false, 46584, new Class[]{Object.class}, Object.class);
            if (patchProxyResultProxy.isSupported) {
                return patchProxyResultProxy.result;
            }
            kotlin.coroutines.intrinsics.b.h();
            if (this.f93869b != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            kotlin.t0.n(obj);
            k.f((q0) this.f93870c, null, null, new C08861(this.f93871d, null), 3, null);
            return b2.f124493a;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    HeyboxMicFragment$attachSeekbarUiState$1(HeyboxMicFragment heyboxMicFragment, kotlin.coroutines.c<? super HeyboxMicFragment$attachSeekbarUiState$1> cVar) {
        super(2, cVar);
        this.f93868c = heyboxMicFragment;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @dl.d
    public final kotlin.coroutines.c<b2> create(@e Object obj, @dl.d kotlin.coroutines.c<?> cVar) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{obj, cVar}, this, changeQuickRedirect, false, 46581, new Class[]{Object.class, kotlin.coroutines.c.class}, kotlin.coroutines.c.class);
        return patchProxyResultProxy.isSupported ? (kotlin.coroutines.c) patchProxyResultProxy.result : new HeyboxMicFragment$attachSeekbarUiState$1(this.f93868c, cVar);
    }

    @Override // yh.p
    public /* bridge */ /* synthetic */ Object invoke(q0 q0Var, kotlin.coroutines.c<? super b2> cVar) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{q0Var, cVar}, this, changeQuickRedirect, false, 46583, new Class[]{Object.class, Object.class}, Object.class);
        return patchProxyResultProxy.isSupported ? patchProxyResultProxy.result : invoke2(q0Var, cVar);
    }

    @e
    /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
    public final Object invoke2(@dl.d q0 q0Var, @e kotlin.coroutines.c<? super b2> cVar) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{q0Var, cVar}, this, changeQuickRedirect, false, 46582, new Class[]{q0.class, kotlin.coroutines.c.class}, Object.class);
        return patchProxyResultProxy.isSupported ? patchProxyResultProxy.result : ((HeyboxMicFragment$attachSeekbarUiState$1) create(q0Var, cVar)).invokeSuspend(b2.f124493a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @e
    public final Object invokeSuspend(@dl.d Object obj) throws Throwable {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{obj}, this, changeQuickRedirect, false, 46580, new Class[]{Object.class}, Object.class);
        if (patchProxyResultProxy.isSupported) {
            return patchProxyResultProxy.result;
        }
        Object objH = kotlin.coroutines.intrinsics.b.h();
        int i10 = this.f93867b;
        if (i10 == 0) {
            kotlin.t0.n(obj);
            HeyboxMicFragment heyboxMicFragment = this.f93868c;
            Lifecycle.State state = Lifecycle.State.RESUMED;
            AnonymousClass1 anonymousClass1 = new AnonymousClass1(heyboxMicFragment, null);
            this.f93867b = 1;
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
