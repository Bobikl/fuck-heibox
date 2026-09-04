package androidx.paging;

import androidx.paging.multicast.Multicaster;
import com.umeng.analytics.pro.ak;
import kotlin.Metadata;
import kotlin.b2;
import kotlin.coroutines.jvm.internal.ContinuationImpl;

/* JADX INFO: compiled from: CachedPagingData.kt */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(bv = {}, d1 = {"\u0000\u001e\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u001a6\u0010\u0006\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\u00030\u0002\"\b\b\u0000\u0010\u0001*\u00020\u0000*\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\u00030\u00022\u0006\u0010\u0005\u001a\u00020\u0004H\u0007\u001aB\u0010\t\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\u00030\u0002\"\b\b\u0000\u0010\u0001*\u00020\u0000*\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\u00030\u00022\u0006\u0010\u0005\u001a\u00020\u00042\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u0007H\u0000¨\u0006\n"}, d2 = {"", androidx.exifinterface.media.a.f23244d5, "Lkotlinx/coroutines/flow/e;", "Landroidx/paging/o0;", "Lkotlinx/coroutines/q0;", "scope", ak.av, "Landroidx/paging/ActiveFlowTracker;", "tracker", "b", "paging-common"}, k = 2, mv = {1, 4, 2})
public final class CachedPagingDataKt {
    @dl.d
    @androidx.annotation.j
    public static final <T> kotlinx.coroutines.flow.e<o0<T>> a(@dl.d kotlinx.coroutines.flow.e<o0<T>> cachedIn, @dl.d kotlinx.coroutines.q0 scope) {
        kotlin.jvm.internal.f0.p(cachedIn, "$this$cachedIn");
        kotlin.jvm.internal.f0.p(scope, "scope");
        return b(cachedIn, scope, null);
    }

    @dl.d
    public static final <T> kotlinx.coroutines.flow.e<o0<T>> b(@dl.d final kotlinx.coroutines.flow.e<o0<T>> cachedIn, @dl.d final kotlinx.coroutines.q0 scope, @dl.e ActiveFlowTracker activeFlowTracker) {
        kotlin.jvm.internal.f0.p(cachedIn, "$this$cachedIn");
        kotlin.jvm.internal.f0.p(scope, "scope");
        final kotlinx.coroutines.flow.e eVarD = FlowExtKt.d(new kotlinx.coroutines.flow.e<MulticastedPagingData<T>>() { // from class: androidx.paging.CachedPagingDataKt$cachedIn$$inlined$map$1

            /* JADX INFO: renamed from: androidx.paging.CachedPagingDataKt$cachedIn$$inlined$map$1$2, reason: invalid class name */
            /* JADX INFO: compiled from: Collect.kt */
            @Metadata(bv = {}, d1 = {"\u0000\u0013\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00028\u00000\u0001J\u001b\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0002\u001a\u00028\u0000H\u0096@ø\u0001\u0000¢\u0006\u0004\b\u0004\u0010\u0005\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006\u0006¸\u0006\u0007"}, d2 = {"kotlinx/coroutines/flow/FlowKt__CollectKt$collect$3", "Lkotlinx/coroutines/flow/f;", "value", "Lkotlin/b2;", "emit", "(Ljava/lang/Object;Lkotlin/coroutines/c;)Ljava/lang/Object;", "kotlinx-coroutines-core", "kotlinx/coroutines/flow/FlowKt__TransformKt$map$$inlined$unsafeTransform$1$2"}, k = 1, mv = {1, 4, 2})
            public static final class AnonymousClass2 implements kotlinx.coroutines.flow.f<o0<T>> {

                /* JADX INFO: renamed from: b, reason: collision with root package name */
                final /* synthetic */ kotlinx.coroutines.flow.f f25435b;

                /* JADX INFO: renamed from: c, reason: collision with root package name */
                final /* synthetic */ CachedPagingDataKt$cachedIn$$inlined$map$1 f25436c;

                /* JADX INFO: renamed from: androidx.paging.CachedPagingDataKt$cachedIn$$inlined$map$1$2$1, reason: invalid class name */
                @Metadata(bv = {}, d1 = {"\u0000\u0016\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0005\"\u0004\b\u0000\u0010\u00002\u0006\u0010\u0001\u001a\u00028\u00002\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002H\u0096@¨\u0006\u0006"}, d2 = {androidx.exifinterface.media.a.f23244d5, "value", "Lkotlin/coroutines/c;", "Lkotlin/b2;", "continuation", "", "kotlinx/coroutines/flow/FlowKt__TransformKt$map$$inlined$unsafeTransform$1$2$1", "emit"}, k = 3, mv = {1, 4, 2})
                @kotlin.coroutines.jvm.internal.d(c = "androidx.paging.CachedPagingDataKt$cachedIn$$inlined$map$1$2", f = "CachedPagingData.kt", i = {}, l = {135}, m = "emit", n = {}, s = {})
                public static final class AnonymousClass1 extends ContinuationImpl {

                    /* JADX INFO: renamed from: b, reason: collision with root package name */
                    /* synthetic */ Object f25437b;

                    /* JADX INFO: renamed from: c, reason: collision with root package name */
                    int f25438c;

                    /* JADX INFO: renamed from: d, reason: collision with root package name */
                    Object f25439d;

                    public AnonymousClass1(kotlin.coroutines.c cVar) {
                        super(cVar);
                    }

                    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                    @dl.e
                    public final Object invokeSuspend(@dl.d Object obj) {
                        this.f25437b = obj;
                        this.f25438c |= Integer.MIN_VALUE;
                        return AnonymousClass2.this.emit(null, this);
                    }
                }

                public AnonymousClass2(kotlinx.coroutines.flow.f fVar, CachedPagingDataKt$cachedIn$$inlined$map$1 cachedPagingDataKt$cachedIn$$inlined$map$1) {
                    this.f25435b = fVar;
                    this.f25436c = cachedPagingDataKt$cachedIn$$inlined$map$1;
                }

                /* JADX WARN: Code duplicated, block: B:7:0x0013  */
                @Override // kotlinx.coroutines.flow.f
                @dl.e
                public Object emit(Object obj, @dl.d kotlin.coroutines.c cVar) throws Throwable {
                    AnonymousClass1 anonymousClass1;
                    if (cVar instanceof AnonymousClass1) {
                        anonymousClass1 = (AnonymousClass1) cVar;
                        int i10 = anonymousClass1.f25438c;
                        if ((i10 & Integer.MIN_VALUE) != 0) {
                            anonymousClass1.f25438c = i10 - Integer.MIN_VALUE;
                        } else {
                            anonymousClass1 = new AnonymousClass1(cVar);
                        }
                    } else {
                        anonymousClass1 = new AnonymousClass1(cVar);
                    }
                    Object obj2 = anonymousClass1.f25437b;
                    Object objH = kotlin.coroutines.intrinsics.b.h();
                    int i11 = anonymousClass1.f25438c;
                    if (i11 == 0) {
                        kotlin.t0.n(obj2);
                        kotlinx.coroutines.flow.f fVar = this.f25435b;
                        MulticastedPagingData multicastedPagingData = new MulticastedPagingData(scope, (o0) obj, null, 4, null);
                        anonymousClass1.f25438c = 1;
                        if (fVar.emit(multicastedPagingData, anonymousClass1) == objH) {
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
            @dl.e
            public Object a(@dl.d kotlinx.coroutines.flow.f fVar, @dl.d kotlin.coroutines.c cVar) {
                Object objA = cachedIn.a(new AnonymousClass2(fVar, this), cVar);
                return objA == kotlin.coroutines.intrinsics.b.h() ? objA : b2.f124493a;
            }
        }, new CachedPagingDataKt$cachedIn$multicastedFlow$2(null));
        return new Multicaster(scope, 1, kotlinx.coroutines.flow.g.d1(kotlinx.coroutines.flow.g.l1(new kotlinx.coroutines.flow.e<o0<T>>() { // from class: androidx.paging.CachedPagingDataKt$cachedIn$$inlined$map$2

            /* JADX INFO: renamed from: androidx.paging.CachedPagingDataKt$cachedIn$$inlined$map$2$2, reason: invalid class name */
            /* JADX INFO: compiled from: Collect.kt */
            @Metadata(bv = {}, d1 = {"\u0000\u0013\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00028\u00000\u0001J\u001b\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0002\u001a\u00028\u0000H\u0096@ø\u0001\u0000¢\u0006\u0004\b\u0004\u0010\u0005\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006\u0006¸\u0006\u0007"}, d2 = {"kotlinx/coroutines/flow/FlowKt__CollectKt$collect$3", "Lkotlinx/coroutines/flow/f;", "value", "Lkotlin/b2;", "emit", "(Ljava/lang/Object;Lkotlin/coroutines/c;)Ljava/lang/Object;", "kotlinx-coroutines-core", "kotlinx/coroutines/flow/FlowKt__TransformKt$map$$inlined$unsafeTransform$1$2"}, k = 1, mv = {1, 4, 2})
            public static final class AnonymousClass2 implements kotlinx.coroutines.flow.f<MulticastedPagingData<T>> {

                /* JADX INFO: renamed from: b, reason: collision with root package name */
                final /* synthetic */ kotlinx.coroutines.flow.f f25442b;

                /* JADX INFO: renamed from: c, reason: collision with root package name */
                final /* synthetic */ CachedPagingDataKt$cachedIn$$inlined$map$2 f25443c;

                /* JADX INFO: renamed from: androidx.paging.CachedPagingDataKt$cachedIn$$inlined$map$2$2$1, reason: invalid class name */
                @Metadata(bv = {}, d1 = {"\u0000\u0016\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0005\"\u0004\b\u0000\u0010\u00002\u0006\u0010\u0001\u001a\u00028\u00002\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002H\u0096@¨\u0006\u0006"}, d2 = {androidx.exifinterface.media.a.f23244d5, "value", "Lkotlin/coroutines/c;", "Lkotlin/b2;", "continuation", "", "kotlinx/coroutines/flow/FlowKt__TransformKt$map$$inlined$unsafeTransform$1$2$1", "emit"}, k = 3, mv = {1, 4, 2})
                @kotlin.coroutines.jvm.internal.d(c = "androidx.paging.CachedPagingDataKt$cachedIn$$inlined$map$2$2", f = "CachedPagingData.kt", i = {}, l = {135}, m = "emit", n = {}, s = {})
                public static final class AnonymousClass1 extends ContinuationImpl {

                    /* JADX INFO: renamed from: b, reason: collision with root package name */
                    /* synthetic */ Object f25444b;

                    /* JADX INFO: renamed from: c, reason: collision with root package name */
                    int f25445c;

                    /* JADX INFO: renamed from: d, reason: collision with root package name */
                    Object f25446d;

                    public AnonymousClass1(kotlin.coroutines.c cVar) {
                        super(cVar);
                    }

                    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                    @dl.e
                    public final Object invokeSuspend(@dl.d Object obj) {
                        this.f25444b = obj;
                        this.f25445c |= Integer.MIN_VALUE;
                        return AnonymousClass2.this.emit(null, this);
                    }
                }

                public AnonymousClass2(kotlinx.coroutines.flow.f fVar, CachedPagingDataKt$cachedIn$$inlined$map$2 cachedPagingDataKt$cachedIn$$inlined$map$2) {
                    this.f25442b = fVar;
                    this.f25443c = cachedPagingDataKt$cachedIn$$inlined$map$2;
                }

                /* JADX WARN: Code duplicated, block: B:7:0x0013  */
                @Override // kotlinx.coroutines.flow.f
                @dl.e
                public Object emit(Object obj, @dl.d kotlin.coroutines.c cVar) throws Throwable {
                    AnonymousClass1 anonymousClass1;
                    if (cVar instanceof AnonymousClass1) {
                        anonymousClass1 = (AnonymousClass1) cVar;
                        int i10 = anonymousClass1.f25445c;
                        if ((i10 & Integer.MIN_VALUE) != 0) {
                            anonymousClass1.f25445c = i10 - Integer.MIN_VALUE;
                        } else {
                            anonymousClass1 = new AnonymousClass1(cVar);
                        }
                    } else {
                        anonymousClass1 = new AnonymousClass1(cVar);
                    }
                    Object obj2 = anonymousClass1.f25444b;
                    Object objH = kotlin.coroutines.intrinsics.b.h();
                    int i11 = anonymousClass1.f25445c;
                    if (i11 == 0) {
                        kotlin.t0.n(obj2);
                        kotlinx.coroutines.flow.f fVar = this.f25442b;
                        o0<T> o0VarA = ((MulticastedPagingData) obj).a();
                        anonymousClass1.f25445c = 1;
                        if (fVar.emit(o0VarA, anonymousClass1) == objH) {
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
            @dl.e
            public Object a(@dl.d kotlinx.coroutines.flow.f fVar, @dl.d kotlin.coroutines.c cVar) {
                Object objA = eVarD.a(new AnonymousClass2(fVar, this), cVar);
                return objA == kotlin.coroutines.intrinsics.b.h() ? objA : b2.f124493a;
            }
        }, new CachedPagingDataKt$cachedIn$multicastedFlow$4(activeFlowTracker, null)), new CachedPagingDataKt$cachedIn$multicastedFlow$5(activeFlowTracker, null)), false, new CachedPagingDataKt$cachedIn$1(null), true, 8, null).i();
    }

    public static /* synthetic */ kotlinx.coroutines.flow.e c(kotlinx.coroutines.flow.e eVar, kotlinx.coroutines.q0 q0Var, ActiveFlowTracker activeFlowTracker, int i10, Object obj) {
        if ((i10 & 2) != 0) {
            activeFlowTracker = null;
        }
        return b(eVar, q0Var, activeFlowTracker);
    }
}
