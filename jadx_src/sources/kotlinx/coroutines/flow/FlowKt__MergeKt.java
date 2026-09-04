package kotlinx.coroutines.flow;

import com.ss.bytertc.base.media.screen.RXScreenCaptureService;
import com.umeng.analytics.pro.ak;
import kotlin.Metadata;
import kotlin.b2;
import kotlin.collections.ArraysKt___ArraysKt;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.t0;
import kotlinx.coroutines.flow.internal.ChannelFlowMerge;
import kotlinx.coroutines.flow.internal.ChannelFlowTransformLatest;
import kotlinx.coroutines.flow.internal.ChannelLimitedFlowMerge;
import kotlinx.coroutines.internal.q0;
import kotlinx.coroutines.t1;
import kotlinx.coroutines.u1;

/* JADX INFO: compiled from: Merge.kt */
/* JADX INFO: loaded from: classes5.dex */
@Metadata(bv = {}, d1 = {"\u0000R\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0010\u001c\n\u0000\n\u0002\u0010\u0011\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0010\u000e\n\u0002\b\u0004\u001ag\u0010\n\u001a\b\u0012\u0004\u0012\u00028\u00010\u0002\"\u0004\b\u0000\u0010\u0000\"\u0004\b\u0001\u0010\u0001*\b\u0012\u0004\u0012\u00028\u00000\u000227\u0010\t\u001a3\b\u0001\u0012\u0013\u0012\u00118\u0000¢\u0006\f\b\u0004\u0012\b\b\u0005\u0012\u0004\b\b(\u0006\u0012\u0010\u0012\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00010\u00020\u0007\u0012\u0006\u0012\u0004\u0018\u00010\b0\u0003H\u0007ø\u0001\u0000¢\u0006\u0004\b\n\u0010\u000b\u001aq\u0010\u000e\u001a\b\u0012\u0004\u0012\u00028\u00010\u0002\"\u0004\b\u0000\u0010\u0000\"\u0004\b\u0001\u0010\u0001*\b\u0012\u0004\u0012\u00028\u00000\u00022\b\b\u0002\u0010\r\u001a\u00020\f27\u0010\t\u001a3\b\u0001\u0012\u0013\u0012\u00118\u0000¢\u0006\f\b\u0004\u0012\b\b\u0005\u0012\u0004\b\b(\u0006\u0012\u0010\u0012\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00010\u00020\u0007\u0012\u0006\u0012\u0004\u0018\u00010\b0\u0003H\u0007ø\u0001\u0000¢\u0006\u0004\b\u000e\u0010\u000f\u001a$\u0010\u0010\u001a\b\u0012\u0004\u0012\u00028\u00000\u0002\"\u0004\b\u0000\u0010\u0000*\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\u00020\u0002H\u0007\u001a\"\u0010\u0012\u001a\b\u0012\u0004\u0012\u00028\u00000\u0002\"\u0004\b\u0000\u0010\u0000*\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\u00020\u0011\u001a9\u0010\u0015\u001a\b\u0012\u0004\u0012\u00028\u00000\u0002\"\u0004\b\u0000\u0010\u00002\u001e\u0010\u0014\u001a\u0010\u0012\f\b\u0001\u0012\b\u0012\u0004\u0012\u00028\u00000\u00020\u0013\"\b\u0012\u0004\u0012\u00028\u00000\u0002¢\u0006\u0004\b\u0015\u0010\u0016\u001a.\u0010\u0017\u001a\b\u0012\u0004\u0012\u00028\u00000\u0002\"\u0004\b\u0000\u0010\u0000*\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\u00020\u00022\b\b\u0002\u0010\r\u001a\u00020\fH\u0007\u001at\u0010\u001c\u001a\b\u0012\u0004\u0012\u00028\u00010\u0002\"\u0004\b\u0000\u0010\u0000\"\u0004\b\u0001\u0010\u0001*\b\u0012\u0004\u0012\u00028\u00000\u00022D\b\u0001\u0010\t\u001a>\b\u0001\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00010\u0019\u0012\u0013\u0012\u00118\u0000¢\u0006\f\b\u0004\u0012\b\b\u0005\u0012\u0004\b\b(\u0006\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u001a0\u0007\u0012\u0006\u0012\u0004\u0018\u00010\b0\u0018¢\u0006\u0002\b\u001bH\u0007ø\u0001\u0000¢\u0006\u0004\b\u001c\u0010\u001d\u001aj\u0010\u001e\u001a\b\u0012\u0004\u0012\u00028\u00010\u0002\"\u0004\b\u0000\u0010\u0000\"\u0004\b\u0001\u0010\u0001*\b\u0012\u0004\u0012\u00028\u00000\u000229\b\u0005\u0010\t\u001a3\b\u0001\u0012\u0013\u0012\u00118\u0000¢\u0006\f\b\u0004\u0012\b\b\u0005\u0012\u0004\b\b(\u0006\u0012\u0010\u0012\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00010\u00020\u0007\u0012\u0006\u0012\u0004\u0018\u00010\b0\u0003H\u0087\bø\u0001\u0000¢\u0006\u0004\b\u001e\u0010\u000b\u001ac\u0010\u001f\u001a\b\u0012\u0004\u0012\u00028\u00010\u0002\"\u0004\b\u0000\u0010\u0000\"\u0004\b\u0001\u0010\u0001*\b\u0012\u0004\u0012\u00028\u00000\u000223\b\u0001\u0010\t\u001a-\b\u0001\u0012\u0013\u0012\u00118\u0000¢\u0006\f\b\u0004\u0012\b\b\u0005\u0012\u0004\b\b(\u0006\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00010\u0007\u0012\u0006\u0012\u0004\u0018\u00010\b0\u0003H\u0007ø\u0001\u0000¢\u0006\u0004\b\u001f\u0010\u000b\" \u0010%\u001a\u00020\f8\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\n\u0010 \u0012\u0004\b#\u0010$\u001a\u0004\b!\u0010\"\"\u001a\u0010'\u001a\u00020&8\u0006X\u0087T¢\u0006\f\n\u0004\b'\u0010(\u0012\u0004\b)\u0010$\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006*"}, d2 = {androidx.exifinterface.media.a.f23244d5, "R", "Lkotlinx/coroutines/flow/e;", "Lkotlin/Function2;", "Lkotlin/m0;", "name", "value", "Lkotlin/coroutines/c;", "", "transform", ak.av, "(Lkotlinx/coroutines/flow/e;Lyh/p;)Lkotlinx/coroutines/flow/e;", "", "concurrency", ak.aF, "(Lkotlinx/coroutines/flow/e;ILyh/p;)Lkotlinx/coroutines/flow/e;", "e", "", "l", "", "flows", "m", "([Lkotlinx/coroutines/flow/e;)Lkotlinx/coroutines/flow/e;", "f", "Lkotlin/Function3;", "Lkotlinx/coroutines/flow/f;", "Lkotlin/b2;", "Lkotlin/t;", "n", "(Lkotlinx/coroutines/flow/e;Lyh/q;)Lkotlinx/coroutines/flow/e;", "b", "k", "I", RXScreenCaptureService.KEY_HEIGHT, "()I", "getDEFAULT_CONCURRENCY$annotations", "()V", "DEFAULT_CONCURRENCY", "", "DEFAULT_CONCURRENCY_PROPERTY_NAME", "Ljava/lang/String;", "getDEFAULT_CONCURRENCY_PROPERTY_NAME$annotations", "kotlinx-coroutines-core"}, k = 5, mv = {1, 6, 0}, xs = "kotlinx/coroutines/flow/FlowKt")
public final /* synthetic */ class FlowKt__MergeKt {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final int f129516a = q0.b(g.f129935a, 16, 1, Integer.MAX_VALUE);

    /* JADX INFO: Add missing generic type declarations: [T] */
    /* JADX INFO: compiled from: SafeCollector.common.kt */
    @Metadata(bv = {}, d1 = {"\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00028\u00000\u0001J!\u0010\u0005\u001a\u00020\u00042\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00028\u00000\u0002H\u0096@ø\u0001\u0000¢\u0006\u0004\b\u0005\u0010\u0006\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006\u0007¸\u0006\u0000"}, d2 = {"kotlinx/coroutines/flow/internal/SafeCollector_commonKt$unsafeFlow$1", "Lkotlinx/coroutines/flow/e;", "Lkotlinx/coroutines/flow/f;", "collector", "Lkotlin/b2;", ak.av, "(Lkotlinx/coroutines/flow/f;Lkotlin/coroutines/c;)Ljava/lang/Object;", "kotlinx-coroutines-core"}, k = 1, mv = {1, 6, 0})
    public static final class a<T> implements e<T> {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ e f129517b;

        public a(e eVar) {
            this.f129517b = eVar;
        }

        @Override // kotlinx.coroutines.flow.e
        @dl.e
        public Object a(@dl.d f<? super T> fVar, @dl.d kotlin.coroutines.c<? super b2> cVar) {
            Object objA = this.f129517b.a(new FlowKt__MergeKt$flattenConcat$1$1(fVar), cVar);
            return objA == kotlin.coroutines.intrinsics.b.h() ? objA : b2.f124493a;
        }
    }

    @dl.d
    @u1
    public static final <T, R> e<R> a(@dl.d final e<? extends T> eVar, @dl.d final yh.p<? super T, ? super kotlin.coroutines.c<? super e<? extends R>>, ? extends Object> pVar) {
        return g.F0(new e<e<? extends R>>() { // from class: kotlinx.coroutines.flow.FlowKt__MergeKt$flatMapConcat$$inlined$map$1

            /* JADX INFO: renamed from: kotlinx.coroutines.flow.FlowKt__MergeKt$flatMapConcat$$inlined$map$1$2, reason: invalid class name */
            /* JADX INFO: compiled from: Emitters.kt */
            @Metadata(bv = {}, d1 = {"\u0000\f\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\u0010\u0007\u001a\u00020\u0003\"\u0004\b\u0000\u0010\u0000\"\u0004\b\u0001\u0010\u00012\u0006\u0010\u0002\u001a\u00028\u0000H\u008a@¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {androidx.exifinterface.media.a.f23244d5, "R", "value", "Lkotlin/b2;", "emit", "(Ljava/lang/Object;Lkotlin/coroutines/c;)Ljava/lang/Object;", "kotlinx/coroutines/flow/FlowKt__TransformKt$map$$inlined$unsafeTransform$1$2", "<anonymous>"}, k = 3, mv = {1, 6, 0})
            public static final class AnonymousClass2<T> implements f {

                /* JADX INFO: renamed from: b, reason: collision with root package name */
                final /* synthetic */ f f129520b;

                /* JADX INFO: renamed from: c, reason: collision with root package name */
                final /* synthetic */ yh.p f129521c;

                /* JADX INFO: renamed from: kotlinx.coroutines.flow.FlowKt__MergeKt$flatMapConcat$$inlined$map$1$2$1, reason: invalid class name */
                /* JADX INFO: compiled from: Emitters.kt */
                @Metadata(k = 3, mv = {1, 6, 0}, xi = 48)
                @kotlin.coroutines.jvm.internal.d(c = "kotlinx.coroutines.flow.FlowKt__MergeKt$flatMapConcat$$inlined$map$1$2", f = "Merge.kt", i = {}, l = {bb.c.b.f30852p1, bb.c.b.f30852p1}, m = "emit", n = {}, s = {})
                public static final class AnonymousClass1 extends ContinuationImpl {

                    /* JADX INFO: renamed from: b, reason: collision with root package name */
                    /* synthetic */ Object f129522b;

                    /* JADX INFO: renamed from: c, reason: collision with root package name */
                    int f129523c;

                    /* JADX INFO: renamed from: d, reason: collision with root package name */
                    Object f129524d;

                    public AnonymousClass1(kotlin.coroutines.c cVar) {
                        super(cVar);
                    }

                    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                    @dl.e
                    public final Object invokeSuspend(@dl.d Object obj) {
                        this.f129522b = obj;
                        this.f129523c |= Integer.MIN_VALUE;
                        return AnonymousClass2.this.emit(null, this);
                    }
                }

                public AnonymousClass2(f fVar, yh.p pVar) {
                    this.f129520b = fVar;
                    this.f129521c = pVar;
                }

                /* JADX WARN: Code duplicated, block: B:7:0x0013  */
                @Override // kotlinx.coroutines.flow.f
                @dl.e
                public final Object emit(Object obj, @dl.d kotlin.coroutines.c cVar) throws Throwable {
                    AnonymousClass1 anonymousClass1;
                    f fVar;
                    if (cVar instanceof AnonymousClass1) {
                        anonymousClass1 = (AnonymousClass1) cVar;
                        int i10 = anonymousClass1.f129523c;
                        if ((i10 & Integer.MIN_VALUE) != 0) {
                            anonymousClass1.f129523c = i10 - Integer.MIN_VALUE;
                        } else {
                            anonymousClass1 = new AnonymousClass1(cVar);
                        }
                    } else {
                        anonymousClass1 = new AnonymousClass1(cVar);
                    }
                    Object obj2 = anonymousClass1.f129522b;
                    Object objH = kotlin.coroutines.intrinsics.b.h();
                    int i11 = anonymousClass1.f129523c;
                    if (i11 != 0) {
                        if (i11 == 1) {
                            f fVar2 = (f) anonymousClass1.f129524d;
                            t0.n(obj2);
                            fVar = fVar2;
                        } else {
                            if (i11 != 2) {
                                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                            }
                            t0.n(obj2);
                        }
                        return b2.f124493a;
                    }
                    t0.n(obj2);
                    f fVar3 = this.f129520b;
                    yh.p pVar = this.f129521c;
                    anonymousClass1.f129524d = fVar3;
                    anonymousClass1.f129523c = 1;
                    Object objInvoke = pVar.invoke(obj, anonymousClass1);
                    if (objInvoke == objH) {
                        return objH;
                    }
                    obj2 = objInvoke;
                    fVar = fVar3;
                    anonymousClass1.f129524d = null;
                    anonymousClass1.f129523c = 2;
                    if (fVar.emit(obj2, anonymousClass1) == objH) {
                        return objH;
                    }
                    return b2.f124493a;
                }
            }

            @Override // kotlinx.coroutines.flow.e
            @dl.e
            public Object a(@dl.d f fVar, @dl.d kotlin.coroutines.c cVar) {
                Object objA = eVar.a(new AnonymousClass2(fVar, pVar), cVar);
                return objA == kotlin.coroutines.intrinsics.b.h() ? objA : b2.f124493a;
            }
        });
    }

    @dl.d
    @t1
    public static final <T, R> e<R> b(@dl.d e<? extends T> eVar, @kotlin.b @dl.d yh.p<? super T, ? super kotlin.coroutines.c<? super e<? extends R>>, ? extends Object> pVar) {
        return g.b2(eVar, new FlowKt__MergeKt$flatMapLatest$1(pVar, null));
    }

    @dl.d
    @u1
    public static final <T, R> e<R> c(@dl.d final e<? extends T> eVar, int i10, @dl.d final yh.p<? super T, ? super kotlin.coroutines.c<? super e<? extends R>>, ? extends Object> pVar) {
        return g.G0(new e<e<? extends R>>() { // from class: kotlinx.coroutines.flow.FlowKt__MergeKt$flatMapMerge$$inlined$map$1

            /* JADX INFO: renamed from: kotlinx.coroutines.flow.FlowKt__MergeKt$flatMapMerge$$inlined$map$1$2, reason: invalid class name */
            /* JADX INFO: compiled from: Emitters.kt */
            @Metadata(bv = {}, d1 = {"\u0000\f\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\u0010\u0007\u001a\u00020\u0003\"\u0004\b\u0000\u0010\u0000\"\u0004\b\u0001\u0010\u00012\u0006\u0010\u0002\u001a\u00028\u0000H\u008a@¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {androidx.exifinterface.media.a.f23244d5, "R", "value", "Lkotlin/b2;", "emit", "(Ljava/lang/Object;Lkotlin/coroutines/c;)Ljava/lang/Object;", "kotlinx/coroutines/flow/FlowKt__TransformKt$map$$inlined$unsafeTransform$1$2", "<anonymous>"}, k = 3, mv = {1, 6, 0})
            public static final class AnonymousClass2<T> implements f {

                /* JADX INFO: renamed from: b, reason: collision with root package name */
                final /* synthetic */ f f129532b;

                /* JADX INFO: renamed from: c, reason: collision with root package name */
                final /* synthetic */ yh.p f129533c;

                /* JADX INFO: renamed from: kotlinx.coroutines.flow.FlowKt__MergeKt$flatMapMerge$$inlined$map$1$2$1, reason: invalid class name */
                /* JADX INFO: compiled from: Emitters.kt */
                @Metadata(k = 3, mv = {1, 6, 0}, xi = 48)
                @kotlin.coroutines.jvm.internal.d(c = "kotlinx.coroutines.flow.FlowKt__MergeKt$flatMapMerge$$inlined$map$1$2", f = "Merge.kt", i = {}, l = {bb.c.b.f30852p1, bb.c.b.f30852p1}, m = "emit", n = {}, s = {})
                public static final class AnonymousClass1 extends ContinuationImpl {

                    /* JADX INFO: renamed from: b, reason: collision with root package name */
                    /* synthetic */ Object f129534b;

                    /* JADX INFO: renamed from: c, reason: collision with root package name */
                    int f129535c;

                    /* JADX INFO: renamed from: d, reason: collision with root package name */
                    Object f129536d;

                    public AnonymousClass1(kotlin.coroutines.c cVar) {
                        super(cVar);
                    }

                    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                    @dl.e
                    public final Object invokeSuspend(@dl.d Object obj) {
                        this.f129534b = obj;
                        this.f129535c |= Integer.MIN_VALUE;
                        return AnonymousClass2.this.emit(null, this);
                    }
                }

                public AnonymousClass2(f fVar, yh.p pVar) {
                    this.f129532b = fVar;
                    this.f129533c = pVar;
                }

                /* JADX WARN: Code duplicated, block: B:7:0x0013  */
                @Override // kotlinx.coroutines.flow.f
                @dl.e
                public final Object emit(Object obj, @dl.d kotlin.coroutines.c cVar) throws Throwable {
                    AnonymousClass1 anonymousClass1;
                    f fVar;
                    if (cVar instanceof AnonymousClass1) {
                        anonymousClass1 = (AnonymousClass1) cVar;
                        int i10 = anonymousClass1.f129535c;
                        if ((i10 & Integer.MIN_VALUE) != 0) {
                            anonymousClass1.f129535c = i10 - Integer.MIN_VALUE;
                        } else {
                            anonymousClass1 = new AnonymousClass1(cVar);
                        }
                    } else {
                        anonymousClass1 = new AnonymousClass1(cVar);
                    }
                    Object obj2 = anonymousClass1.f129534b;
                    Object objH = kotlin.coroutines.intrinsics.b.h();
                    int i11 = anonymousClass1.f129535c;
                    if (i11 != 0) {
                        if (i11 == 1) {
                            f fVar2 = (f) anonymousClass1.f129536d;
                            t0.n(obj2);
                            fVar = fVar2;
                        } else {
                            if (i11 != 2) {
                                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                            }
                            t0.n(obj2);
                        }
                        return b2.f124493a;
                    }
                    t0.n(obj2);
                    f fVar3 = this.f129532b;
                    yh.p pVar = this.f129533c;
                    anonymousClass1.f129536d = fVar3;
                    anonymousClass1.f129535c = 1;
                    Object objInvoke = pVar.invoke(obj, anonymousClass1);
                    if (objInvoke == objH) {
                        return objH;
                    }
                    obj2 = objInvoke;
                    fVar = fVar3;
                    anonymousClass1.f129536d = null;
                    anonymousClass1.f129535c = 2;
                    if (fVar.emit(obj2, anonymousClass1) == objH) {
                        return objH;
                    }
                    return b2.f124493a;
                }
            }

            @Override // kotlinx.coroutines.flow.e
            @dl.e
            public Object a(@dl.d f fVar, @dl.d kotlin.coroutines.c cVar) {
                Object objA = eVar.a(new AnonymousClass2(fVar, pVar), cVar);
                return objA == kotlin.coroutines.intrinsics.b.h() ? objA : b2.f124493a;
            }
        }, i10);
    }

    public static /* synthetic */ e d(e eVar, int i10, yh.p pVar, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            i10 = f129516a;
        }
        return g.C0(eVar, i10, pVar);
    }

    @dl.d
    @u1
    public static final <T> e<T> e(@dl.d e<? extends e<? extends T>> eVar) {
        return new a(eVar);
    }

    @dl.d
    @u1
    public static final <T> e<T> f(@dl.d e<? extends e<? extends T>> eVar, int i10) {
        if (i10 > 0) {
            return i10 == 1 ? g.F0(eVar) : new ChannelFlowMerge(eVar, i10, null, 0, null, 28, null);
        }
        throw new IllegalArgumentException(("Expected positive concurrency level, but had " + i10).toString());
    }

    public static /* synthetic */ e g(e eVar, int i10, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            i10 = f129516a;
        }
        return g.G0(eVar, i10);
    }

    public static final int h() {
        return f129516a;
    }

    @u1
    public static /* synthetic */ void i() {
    }

    @u1
    public static /* synthetic */ void j() {
    }

    @dl.d
    @t1
    public static final <T, R> e<R> k(@dl.d e<? extends T> eVar, @kotlin.b @dl.d yh.p<? super T, ? super kotlin.coroutines.c<? super R>, ? extends Object> pVar) {
        return g.b2(eVar, new FlowKt__MergeKt$mapLatest$1(pVar, null));
    }

    @dl.d
    public static final <T> e<T> l(@dl.d Iterable<? extends e<? extends T>> iterable) {
        return new ChannelLimitedFlowMerge(iterable, null, 0, null, 14, null);
    }

    @dl.d
    public static final <T> e<T> m(@dl.d e<? extends T>... eVarArr) {
        return g.Y0(ArraysKt___ArraysKt.c6(eVarArr));
    }

    @dl.d
    @t1
    public static final <T, R> e<R> n(@dl.d e<? extends T> eVar, @kotlin.b @dl.d yh.q<? super f<? super R>, ? super T, ? super kotlin.coroutines.c<? super b2>, ? extends Object> qVar) {
        return new ChannelFlowTransformLatest(qVar, eVar, null, 0, null, 28, null);
    }
}
