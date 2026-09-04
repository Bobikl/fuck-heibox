package com.max.xiaoheihe.module.voice;

import android.os.RemoteException;
import com.max.heybox.hblog.g;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.PatchProxyResult;
import dl.e;
import kotlin.Pair;
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
@t0({"SMAP\nHeyboxMicFragment.kt\nKotlin\n*S Kotlin\n*F\n+ 1 HeyboxMicFragment.kt\ncom/max/xiaoheihe/module/voice/HeyboxMicFragment$installViews$6\n+ 2 Transform.kt\nkotlinx/coroutines/flow/FlowKt__TransformKt\n+ 3 Emitters.kt\nkotlinx/coroutines/flow/FlowKt__EmittersKt\n+ 4 SafeCollector.common.kt\nkotlinx/coroutines/flow/internal/SafeCollector_commonKt\n*L\n1#1,614:1\n47#2:615\n49#2:619\n50#3:616\n55#3:618\n106#4:617\n*S KotlinDebug\n*F\n+ 1 HeyboxMicFragment.kt\ncom/max/xiaoheihe/module/voice/HeyboxMicFragment$installViews$6\n*L\n170#1:615\n170#1:619\n170#1:616\n170#1:618\n170#1:617\n*E\n"})
@d(c = "com.max.xiaoheihe.module.voice.HeyboxMicFragment$installViews$6", f = "HeyboxMicFragment.kt", i = {}, l = {172}, m = "invokeSuspend", n = {}, s = {})
public final class HeyboxMicFragment$installViews$6 extends SuspendLambda implements p<q0, kotlin.coroutines.c<? super b2>, Object> {
    public static ChangeQuickRedirect changeQuickRedirect;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    int f93921b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    final /* synthetic */ HeyboxMicFragment f93922c;

    /* JADX INFO: compiled from: HeyboxMicFragment.kt */
    public static final class a implements f<Pair<? extends Boolean, ? extends PCDeviceInfo>> {
        public static ChangeQuickRedirect changeQuickRedirect;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ HeyboxMicFragment f93923b;

        a(HeyboxMicFragment heyboxMicFragment) {
            this.f93923b = heyboxMicFragment;
        }

        @e
        public final Object a(@dl.d Pair<Boolean, PCDeviceInfo> pair, @dl.d kotlin.coroutines.c<? super b2> cVar) throws RemoteException {
            PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{pair, cVar}, this, changeQuickRedirect, false, 46620, new Class[]{Pair.class, kotlin.coroutines.c.class}, Object.class);
            if (patchProxyResultProxy.isSupported) {
                return patchProxyResultProxy.result;
            }
            g.f74531b.q("HeyboxMicFragment, serviceConnected, it = " + pair);
            if (pair.e().booleanValue() && pair.f() != null) {
                HeyboxMicFragment.J4(this.f93923b).v();
            }
            return b2.f124493a;
        }

        @Override // kotlinx.coroutines.flow.f
        public /* bridge */ /* synthetic */ Object emit(Pair<? extends Boolean, ? extends PCDeviceInfo> pair, kotlin.coroutines.c cVar) {
            PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{pair, cVar}, this, changeQuickRedirect, false, 46621, new Class[]{Object.class, kotlin.coroutines.c.class}, Object.class);
            return patchProxyResultProxy.isSupported ? patchProxyResultProxy.result : a(pair, cVar);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    HeyboxMicFragment$installViews$6(HeyboxMicFragment heyboxMicFragment, kotlin.coroutines.c<? super HeyboxMicFragment$installViews$6> cVar) {
        super(2, cVar);
        this.f93922c = heyboxMicFragment;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @dl.d
    public final kotlin.coroutines.c<b2> create(@e Object obj, @dl.d kotlin.coroutines.c<?> cVar) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{obj, cVar}, this, changeQuickRedirect, false, 46617, new Class[]{Object.class, kotlin.coroutines.c.class}, kotlin.coroutines.c.class);
        return patchProxyResultProxy.isSupported ? (kotlin.coroutines.c) patchProxyResultProxy.result : new HeyboxMicFragment$installViews$6(this.f93922c, cVar);
    }

    @Override // yh.p
    public /* bridge */ /* synthetic */ Object invoke(q0 q0Var, kotlin.coroutines.c<? super b2> cVar) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{q0Var, cVar}, this, changeQuickRedirect, false, 46619, new Class[]{Object.class, Object.class}, Object.class);
        return patchProxyResultProxy.isSupported ? patchProxyResultProxy.result : invoke2(q0Var, cVar);
    }

    @e
    /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
    public final Object invoke2(@dl.d q0 q0Var, @e kotlin.coroutines.c<? super b2> cVar) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{q0Var, cVar}, this, changeQuickRedirect, false, 46618, new Class[]{q0.class, kotlin.coroutines.c.class}, Object.class);
        return patchProxyResultProxy.isSupported ? patchProxyResultProxy.result : ((HeyboxMicFragment$installViews$6) create(q0Var, cVar)).invokeSuspend(b2.f124493a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @e
    public final Object invokeSuspend(@dl.d Object obj) throws Throwable {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{obj}, this, changeQuickRedirect, false, 46616, new Class[]{Object.class}, Object.class);
        if (patchProxyResultProxy.isSupported) {
            return patchProxyResultProxy.result;
        }
        Object objH = kotlin.coroutines.intrinsics.b.h();
        int i10 = this.f93921b;
        if (i10 == 0) {
            kotlin.t0.n(obj);
            final u<com.max.xiaoheihe.module.voice.a> uVarX = HeyboxMicFragment.J4(this.f93922c).x();
            kotlinx.coroutines.flow.e eVarG0 = kotlinx.coroutines.flow.g.g0(new kotlinx.coroutines.flow.e<Pair<? extends Boolean, ? extends PCDeviceInfo>>() { // from class: com.max.xiaoheihe.module.voice.HeyboxMicFragment$installViews$6$invokeSuspend$$inlined$map$1
                public static ChangeQuickRedirect changeQuickRedirect;

                /* JADX INFO: renamed from: com.max.xiaoheihe.module.voice.HeyboxMicFragment$installViews$6$invokeSuspend$$inlined$map$1$2, reason: invalid class name */
                /* JADX INFO: compiled from: Emitters.kt */
                @t0({"SMAP\nEmitters.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Emitters.kt\nkotlinx/coroutines/flow/FlowKt__EmittersKt$unsafeTransform$1$1\n+ 2 Transform.kt\nkotlinx/coroutines/flow/FlowKt__TransformKt\n+ 3 HeyboxMicFragment.kt\ncom/max/xiaoheihe/module/voice/HeyboxMicFragment$installViews$6\n*L\n1#1,222:1\n48#2:223\n171#3:224\n*E\n"})
                public static final class AnonymousClass2<T> implements f {
                    public static ChangeQuickRedirect changeQuickRedirect;

                    /* JADX INFO: renamed from: b, reason: collision with root package name */
                    final /* synthetic */ f f93925b;

                    /* JADX INFO: renamed from: com.max.xiaoheihe.module.voice.HeyboxMicFragment$installViews$6$invokeSuspend$$inlined$map$1$2$1, reason: invalid class name */
                    /* JADX INFO: compiled from: Emitters.kt */
                    @t0({"SMAP\nEmitters.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Emitters.kt\nkotlinx/coroutines/flow/FlowKt__EmittersKt$unsafeTransform$1$1$emit$1\n*L\n1#1,222:1\n*E\n"})
                    @d(c = "com.max.xiaoheihe.module.voice.HeyboxMicFragment$installViews$6$invokeSuspend$$inlined$map$1$2", f = "HeyboxMicFragment.kt", i = {}, l = {bb.c.b.f30852p1}, m = "emit", n = {}, s = {})
                    public static final class AnonymousClass1 extends ContinuationImpl {
                        public static ChangeQuickRedirect changeQuickRedirect;

                        /* JADX INFO: renamed from: b, reason: collision with root package name */
                        /* synthetic */ Object f93926b;

                        /* JADX INFO: renamed from: c, reason: collision with root package name */
                        int f93927c;

                        /* JADX INFO: renamed from: d, reason: collision with root package name */
                        Object f93928d;

                        public AnonymousClass1(kotlin.coroutines.c cVar) {
                            super(cVar);
                        }

                        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                        @e
                        public final Object invokeSuspend(@dl.d Object obj) {
                            PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{obj}, this, changeQuickRedirect, false, 46624, new Class[]{Object.class}, Object.class);
                            if (patchProxyResultProxy.isSupported) {
                                return patchProxyResultProxy.result;
                            }
                            this.f93926b = obj;
                            this.f93927c |= Integer.MIN_VALUE;
                            return AnonymousClass2.this.emit(null, this);
                        }
                    }

                    public AnonymousClass2(f fVar) {
                        this.f93925b = fVar;
                    }

                    /* JADX WARN: Code duplicated, block: B:11:0x003a  */
                    @Override // kotlinx.coroutines.flow.f
                    @e
                    public final Object emit(Object obj, @dl.d kotlin.coroutines.c cVar) throws Throwable {
                        AnonymousClass1 anonymousClass1;
                        boolean z10 = false;
                        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{obj, cVar}, this, changeQuickRedirect, false, 46623, new Class[]{Object.class, kotlin.coroutines.c.class}, Object.class);
                        if (patchProxyResultProxy.isSupported) {
                            return patchProxyResultProxy.result;
                        }
                        if (cVar instanceof AnonymousClass1) {
                            anonymousClass1 = (AnonymousClass1) cVar;
                            int i10 = anonymousClass1.f93927c;
                            if ((i10 & Integer.MIN_VALUE) != 0) {
                                anonymousClass1.f93927c = i10 - Integer.MIN_VALUE;
                            } else {
                                anonymousClass1 = new AnonymousClass1(cVar);
                            }
                        } else {
                            anonymousClass1 = new AnonymousClass1(cVar);
                        }
                        Object obj2 = anonymousClass1.f93926b;
                        Object objH = kotlin.coroutines.intrinsics.b.h();
                        int i11 = anonymousClass1.f93927c;
                        if (i11 == 0) {
                            kotlin.t0.n(obj2);
                            f fVar = this.f93925b;
                            a aVar = (a) obj;
                            if (aVar.w() && aVar.y()) {
                                z10 = true;
                            }
                            Pair pair = new Pair(kotlin.coroutines.jvm.internal.a.a(z10), aVar.u());
                            anonymousClass1.f93927c = 1;
                            if (fVar.emit(pair, anonymousClass1) == objH) {
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
                public Object a(@dl.d f<? super Pair<? extends Boolean, ? extends PCDeviceInfo>> fVar, @dl.d kotlin.coroutines.c cVar) {
                    PatchProxyResult patchProxyResultProxy2 = PatchProxy.proxy(new Object[]{fVar, cVar}, this, changeQuickRedirect, false, 46622, new Class[]{f.class, kotlin.coroutines.c.class}, Object.class);
                    if (patchProxyResultProxy2.isSupported) {
                        return patchProxyResultProxy2.result;
                    }
                    Object objA = uVarX.a(new AnonymousClass2(fVar), cVar);
                    return objA == kotlin.coroutines.intrinsics.b.h() ? objA : b2.f124493a;
                }
            });
            a aVar = new a(this.f93922c);
            this.f93921b = 1;
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
