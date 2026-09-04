package kotlinx.coroutines.flow;

import com.ss.bytertc.base.media.screen.RXScreenCaptureService;
import com.umeng.analytics.pro.ak;
import kotlin.Metadata;
import kotlin.b2;
import kotlin.collections.h0;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.jvm.internal.Ref;
import kotlin.jvm.internal.c0;
import kotlin.jvm.internal.f0;
import kotlin.t0;

/* JADX INFO: compiled from: Transform.kt */
/* JADX INFO: loaded from: classes5.dex */
@Metadata(bv = {}, d1 = {"\u00008\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\u0010\u0000\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\b\u001aO\u0010\u0007\u001a\b\u0012\u0004\u0012\u00028\u00000\u0001\"\u0004\b\u0000\u0010\u0000*\b\u0012\u0004\u0012\u00028\u00000\u00012$\b\u0004\u0010\u0006\u001a\u001e\b\u0001\u0012\u0004\u0012\u00028\u0000\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00040\u0003\u0012\u0006\u0012\u0004\u0018\u00010\u00050\u0002H\u0086\bø\u0001\u0000¢\u0006\u0004\b\u0007\u0010\b\u001aO\u0010\t\u001a\b\u0012\u0004\u0012\u00028\u00000\u0001\"\u0004\b\u0000\u0010\u0000*\b\u0012\u0004\u0012\u00028\u00000\u00012$\b\u0004\u0010\u0006\u001a\u001e\b\u0001\u0012\u0004\u0012\u00028\u0000\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00040\u0003\u0012\u0006\u0012\u0004\u0018\u00010\u00050\u0002H\u0086\bø\u0001\u0000¢\u0006\u0004\b\t\u0010\b\u001a\u001f\u0010\u000b\u001a\b\u0012\u0004\u0012\u00028\u00000\u0001\"\u0006\b\u0000\u0010\n\u0018\u0001*\u0006\u0012\u0002\b\u00030\u0001H\u0086\b\u001a\"\u0010\f\u001a\b\u0012\u0004\u0012\u00028\u00000\u0001\"\b\b\u0000\u0010\u0000*\u00020\u0005*\n\u0012\u0006\u0012\u0004\u0018\u00018\u00000\u0001\u001ad\u0010\u0011\u001a\b\u0012\u0004\u0012\u00028\u00010\u0001\"\u0004\b\u0000\u0010\u0000\"\u0004\b\u0001\u0010\n*\b\u0012\u0004\u0012\u00028\u00000\u000123\b\u0004\u0010\u0010\u001a-\b\u0001\u0012\u0013\u0012\u00118\u0000¢\u0006\f\b\r\u0012\b\b\u000e\u0012\u0004\b\b(\u000f\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00010\u0003\u0012\u0006\u0012\u0004\u0018\u00010\u00050\u0002H\u0086\bø\u0001\u0000¢\u0006\u0004\b\u0011\u0010\b\u001aj\u0010\u0012\u001a\b\u0012\u0004\u0012\u00028\u00010\u0001\"\u0004\b\u0000\u0010\u0000\"\b\b\u0001\u0010\n*\u00020\u0005*\b\u0012\u0004\u0012\u00028\u00000\u000125\b\u0004\u0010\u0010\u001a/\b\u0001\u0012\u0013\u0012\u00118\u0000¢\u0006\f\b\r\u0012\b\b\u000e\u0012\u0004\b\b(\u000f\u0012\f\u0012\n\u0012\u0006\u0012\u0004\u0018\u00018\u00010\u0003\u0012\u0006\u0012\u0004\u0018\u00010\u00050\u0002H\u0086\bø\u0001\u0000¢\u0006\u0004\b\u0012\u0010\b\u001a\"\u0010\u0014\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\u00130\u0001\"\u0004\b\u0000\u0010\u0000*\b\u0012\u0004\u0012\u00028\u00000\u0001\u001aJ\u0010\u0017\u001a\b\u0012\u0004\u0012\u00028\u00000\u0001\"\u0004\b\u0000\u0010\u0000*\b\u0012\u0004\u0012\u00028\u00000\u00012\"\u0010\u0016\u001a\u001e\b\u0001\u0012\u0004\u0012\u00028\u0000\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00150\u0003\u0012\u0006\u0012\u0004\u0018\u00010\u00050\u0002ø\u0001\u0000¢\u0006\u0004\b\u0017\u0010\b\u001a~\u0010\u001c\u001a\b\u0012\u0004\u0012\u00028\u00010\u0001\"\u0004\b\u0000\u0010\u0000\"\u0004\b\u0001\u0010\n*\b\u0012\u0004\u0012\u00028\u00000\u00012\u0006\u0010\u0018\u001a\u00028\u00012H\b\u0001\u0010\u001b\u001aB\b\u0001\u0012\u0013\u0012\u00118\u0001¢\u0006\f\b\r\u0012\b\b\u000e\u0012\u0004\b\b(\u001a\u0012\u0013\u0012\u00118\u0000¢\u0006\f\b\r\u0012\b\b\u000e\u0012\u0004\b\b(\u000f\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00010\u0003\u0012\u0006\u0012\u0004\u0018\u00010\u00050\u0019ø\u0001\u0000¢\u0006\u0004\b\u001c\u0010\u001d\u001a~\u0010\u001e\u001a\b\u0012\u0004\u0012\u00028\u00010\u0001\"\u0004\b\u0000\u0010\u0000\"\u0004\b\u0001\u0010\n*\b\u0012\u0004\u0012\u00028\u00000\u00012\u0006\u0010\u0018\u001a\u00028\u00012H\b\u0001\u0010\u001b\u001aB\b\u0001\u0012\u0013\u0012\u00118\u0001¢\u0006\f\b\r\u0012\b\b\u000e\u0012\u0004\b\b(\u001a\u0012\u0013\u0012\u00118\u0000¢\u0006\f\b\r\u0012\b\b\u000e\u0012\u0004\b\b(\u000f\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00010\u0003\u0012\u0006\u0012\u0004\u0018\u00010\u00050\u0019ø\u0001\u0000¢\u0006\u0004\b\u001e\u0010\u001d\u001an\u0010\u001f\u001a\b\u0012\u0004\u0012\u00028\u00000\u0001\"\u0004\b\u0000\u0010\u0000*\b\u0012\u0004\u0012\u00028\u00000\u00012F\u0010\u001b\u001aB\b\u0001\u0012\u0013\u0012\u00118\u0000¢\u0006\f\b\r\u0012\b\b\u000e\u0012\u0004\b\b(\u001a\u0012\u0013\u0012\u00118\u0000¢\u0006\f\b\r\u0012\b\b\u000e\u0012\u0004\b\b(\u000f\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\u0003\u0012\u0006\u0012\u0004\u0018\u00010\u00050\u0019ø\u0001\u0000¢\u0006\u0004\b\u001f\u0010 \u0082\u0002\u0004\n\u0002\b\u0019¨\u0006!"}, d2 = {androidx.exifinterface.media.a.f23244d5, "Lkotlinx/coroutines/flow/e;", "Lkotlin/Function2;", "Lkotlin/coroutines/c;", "", "", "predicate", ak.av, "(Lkotlinx/coroutines/flow/e;Lyh/p;)Lkotlinx/coroutines/flow/e;", ak.aF, "R", "b", "d", "Lkotlin/m0;", "name", "value", "transform", "e", "f", "Lkotlin/collections/h0;", "k", "Lkotlin/b2;", "action", "g", "initial", "Lkotlin/Function3;", "accumulator", "operation", "j", "(Lkotlinx/coroutines/flow/e;Ljava/lang/Object;Lyh/q;)Lkotlinx/coroutines/flow/e;", RXScreenCaptureService.KEY_HEIGHT, "i", "(Lkotlinx/coroutines/flow/e;Lyh/q;)Lkotlinx/coroutines/flow/e;", "kotlinx-coroutines-core"}, k = 5, mv = {1, 6, 0}, xs = "kotlinx/coroutines/flow/FlowKt")
public final /* synthetic */ class FlowKt__TransformKt {

    /* JADX INFO: Add missing generic type declarations: [T] */
    /* JADX INFO: compiled from: SafeCollector.common.kt */
    @Metadata(bv = {}, d1 = {"\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00028\u00000\u0001J!\u0010\u0005\u001a\u00020\u00042\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00028\u00000\u0002H\u0096@ø\u0001\u0000¢\u0006\u0004\b\u0005\u0010\u0006\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006\u0007¸\u0006\u0000"}, d2 = {"kotlinx/coroutines/flow/internal/SafeCollector_commonKt$unsafeFlow$1", "Lkotlinx/coroutines/flow/e;", "Lkotlinx/coroutines/flow/f;", "collector", "Lkotlin/b2;", ak.av, "(Lkotlinx/coroutines/flow/f;Lkotlin/coroutines/c;)Ljava/lang/Object;", "kotlinx-coroutines-core"}, k = 1, mv = {1, 6, 0})
    public static final class a<T> implements e<T> {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ e f129648b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ yh.q f129649c;

        public a(e eVar, yh.q qVar) {
            this.f129648b = eVar;
            this.f129649c = qVar;
        }

        @Override // kotlinx.coroutines.flow.e
        @dl.e
        public Object a(@dl.d f<? super T> fVar, @dl.d kotlin.coroutines.c<? super b2> cVar) {
            Ref.ObjectRef objectRef = new Ref.ObjectRef();
            objectRef.f124891b = (T) kotlinx.coroutines.flow.internal.l.f130082a;
            Object objA = this.f129648b.a(new FlowKt__TransformKt$runningReduce$1$1(objectRef, this.f129649c, fVar), cVar);
            return objA == kotlin.coroutines.intrinsics.b.h() ? objA : b2.f124493a;
        }
    }

    /* JADX INFO: Add missing generic type declarations: [T] */
    /* JADX INFO: compiled from: SafeCollector.common.kt */
    @Metadata(bv = {}, d1 = {"\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00028\u00000\u0001J!\u0010\u0005\u001a\u00020\u00042\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00028\u00000\u0002H\u0096@ø\u0001\u0000¢\u0006\u0004\b\u0005\u0010\u0006\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006\u0007¸\u0006\u0000"}, d2 = {"kotlinx/coroutines/flow/internal/SafeCollector_commonKt$unsafeFlow$1", "Lkotlinx/coroutines/flow/e;", "Lkotlinx/coroutines/flow/f;", "collector", "Lkotlin/b2;", ak.av, "(Lkotlinx/coroutines/flow/f;Lkotlin/coroutines/c;)Ljava/lang/Object;", "kotlinx-coroutines-core"}, k = 1, mv = {1, 6, 0})
    public static final class b<T> implements e<h0<? extends T>> {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ e f129650b;

        public b(e eVar) {
            this.f129650b = eVar;
        }

        @Override // kotlinx.coroutines.flow.e
        @dl.e
        public Object a(@dl.d f<? super h0<? extends T>> fVar, @dl.d kotlin.coroutines.c<? super b2> cVar) {
            Object objA = this.f129650b.a(new FlowKt__TransformKt$withIndex$1$1(fVar, new Ref.IntRef()), cVar);
            return objA == kotlin.coroutines.intrinsics.b.h() ? objA : b2.f124493a;
        }
    }

    @dl.d
    public static final <T> e<T> a(@dl.d e<? extends T> eVar, @dl.d yh.p<? super T, ? super kotlin.coroutines.c<? super Boolean>, ? extends Object> pVar) {
        return new FlowKt__TransformKt$filter$$inlined$unsafeTransform$1(eVar, pVar);
    }

    public static final /* synthetic */ <R> e<R> b(e<?> eVar) {
        f0.w();
        return new FlowKt__TransformKt$filterIsInstance$$inlined$filter$1(eVar);
    }

    @dl.d
    public static final <T> e<T> c(@dl.d e<? extends T> eVar, @dl.d yh.p<? super T, ? super kotlin.coroutines.c<? super Boolean>, ? extends Object> pVar) {
        return new FlowKt__TransformKt$filterNot$$inlined$unsafeTransform$1(eVar, pVar);
    }

    @dl.d
    public static final <T> e<T> d(@dl.d final e<? extends T> eVar) {
        return new e<T>() { // from class: kotlinx.coroutines.flow.FlowKt__TransformKt$filterNotNull$$inlined$unsafeTransform$1

            /* JADX INFO: renamed from: kotlinx.coroutines.flow.FlowKt__TransformKt$filterNotNull$$inlined$unsafeTransform$1$2, reason: invalid class name */
            /* JADX INFO: compiled from: Emitters.kt */
            @Metadata(bv = {}, d1 = {"\u0000\f\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\u0010\u0007\u001a\u00020\u0003\"\u0004\b\u0000\u0010\u0000\"\u0004\b\u0001\u0010\u00012\u0006\u0010\u0002\u001a\u00028\u0000H\u008a@¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {androidx.exifinterface.media.a.f23244d5, "R", "value", "Lkotlin/b2;", "emit", "(Ljava/lang/Object;Lkotlin/coroutines/c;)Ljava/lang/Object;", "kotlinx/coroutines/flow/FlowKt__EmittersKt$unsafeTransform$1$1", "<anonymous>"}, k = 3, mv = {1, 6, 0})
            public static final class AnonymousClass2<T> implements f {

                /* JADX INFO: renamed from: b, reason: collision with root package name */
                final /* synthetic */ f f129686b;

                /* JADX INFO: renamed from: kotlinx.coroutines.flow.FlowKt__TransformKt$filterNotNull$$inlined$unsafeTransform$1$2$1, reason: invalid class name */
                /* JADX INFO: compiled from: Emitters.kt */
                @Metadata(k = 3, mv = {1, 6, 0}, xi = 48)
                @kotlin.coroutines.jvm.internal.d(c = "kotlinx.coroutines.flow.FlowKt__TransformKt$filterNotNull$$inlined$unsafeTransform$1$2", f = "Transform.kt", i = {}, l = {bb.c.b.f30852p1}, m = "emit", n = {}, s = {})
                public static final class AnonymousClass1 extends ContinuationImpl {

                    /* JADX INFO: renamed from: b, reason: collision with root package name */
                    /* synthetic */ Object f129687b;

                    /* JADX INFO: renamed from: c, reason: collision with root package name */
                    int f129688c;

                    public AnonymousClass1(kotlin.coroutines.c cVar) {
                        super(cVar);
                    }

                    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                    @dl.e
                    public final Object invokeSuspend(@dl.d Object obj) {
                        this.f129687b = obj;
                        this.f129688c |= Integer.MIN_VALUE;
                        return AnonymousClass2.this.emit(null, this);
                    }
                }

                public AnonymousClass2(f fVar) {
                    this.f129686b = fVar;
                }

                /* JADX WARN: Code duplicated, block: B:7:0x0013  */
                @Override // kotlinx.coroutines.flow.f
                @dl.e
                public final Object emit(T t10, @dl.d kotlin.coroutines.c<? super b2> cVar) throws Throwable {
                    AnonymousClass1 anonymousClass1;
                    if (cVar instanceof AnonymousClass1) {
                        anonymousClass1 = (AnonymousClass1) cVar;
                        int i10 = anonymousClass1.f129688c;
                        if ((i10 & Integer.MIN_VALUE) != 0) {
                            anonymousClass1.f129688c = i10 - Integer.MIN_VALUE;
                        } else {
                            anonymousClass1 = new AnonymousClass1(cVar);
                        }
                    } else {
                        anonymousClass1 = new AnonymousClass1(cVar);
                    }
                    Object obj = anonymousClass1.f129687b;
                    Object objH = kotlin.coroutines.intrinsics.b.h();
                    int i11 = anonymousClass1.f129688c;
                    if (i11 == 0) {
                        t0.n(obj);
                        f fVar = this.f129686b;
                        if (t10 != null) {
                            anonymousClass1.f129688c = 1;
                            if (fVar.emit(t10, anonymousClass1) == objH) {
                                return objH;
                            }
                        }
                    } else {
                        if (i11 != 1) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        t0.n(obj);
                    }
                    return b2.f124493a;
                }
            }

            @Override // kotlinx.coroutines.flow.e
            @dl.e
            public Object a(@dl.d f fVar, @dl.d kotlin.coroutines.c cVar) {
                Object objA = eVar.a(new AnonymousClass2(fVar), cVar);
                return objA == kotlin.coroutines.intrinsics.b.h() ? objA : b2.f124493a;
            }
        };
    }

    @dl.d
    public static final <T, R> e<R> e(@dl.d e<? extends T> eVar, @dl.d yh.p<? super T, ? super kotlin.coroutines.c<? super R>, ? extends Object> pVar) {
        return new FlowKt__TransformKt$map$$inlined$unsafeTransform$1(eVar, pVar);
    }

    @dl.d
    public static final <T, R> e<R> f(@dl.d e<? extends T> eVar, @dl.d yh.p<? super T, ? super kotlin.coroutines.c<? super R>, ? extends Object> pVar) {
        return new FlowKt__TransformKt$mapNotNull$$inlined$unsafeTransform$1(eVar, pVar);
    }

    @dl.d
    public static final <T> e<T> g(@dl.d final e<? extends T> eVar, @dl.d final yh.p<? super T, ? super kotlin.coroutines.c<? super b2>, ? extends Object> pVar) {
        return new e<T>() { // from class: kotlinx.coroutines.flow.FlowKt__TransformKt$onEach$$inlined$unsafeTransform$1

            /* JADX INFO: renamed from: kotlinx.coroutines.flow.FlowKt__TransformKt$onEach$$inlined$unsafeTransform$1$2, reason: invalid class name */
            /* JADX INFO: compiled from: Emitters.kt */
            @Metadata(bv = {}, d1 = {"\u0000\f\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\u0010\u0007\u001a\u00020\u0003\"\u0004\b\u0000\u0010\u0000\"\u0004\b\u0001\u0010\u00012\u0006\u0010\u0002\u001a\u00028\u0000H\u008a@¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {androidx.exifinterface.media.a.f23244d5, "R", "value", "Lkotlin/b2;", "emit", "(Ljava/lang/Object;Lkotlin/coroutines/c;)Ljava/lang/Object;", "kotlinx/coroutines/flow/FlowKt__EmittersKt$unsafeTransform$1$1", "<anonymous>"}, k = 3, mv = {1, 6, 0})
            public static final class AnonymousClass2<T> implements f {

                /* JADX INFO: renamed from: b, reason: collision with root package name */
                final /* synthetic */ f f129714b;

                /* JADX INFO: renamed from: c, reason: collision with root package name */
                final /* synthetic */ yh.p f129715c;

                /* JADX INFO: renamed from: kotlinx.coroutines.flow.FlowKt__TransformKt$onEach$$inlined$unsafeTransform$1$2$1, reason: invalid class name */
                /* JADX INFO: compiled from: Emitters.kt */
                @Metadata(k = 3, mv = {1, 6, 0}, xi = 48)
                @kotlin.coroutines.jvm.internal.d(c = "kotlinx.coroutines.flow.FlowKt__TransformKt$onEach$$inlined$unsafeTransform$1$2", f = "Transform.kt", i = {0, 0}, l = {bb.c.b.f30852p1, 224}, m = "emit", n = {"value", "$this$onEach_u24lambda_u2d7"}, s = {"L$0", "L$1"})
                public static final class AnonymousClass1 extends ContinuationImpl {

                    /* JADX INFO: renamed from: b, reason: collision with root package name */
                    /* synthetic */ Object f129716b;

                    /* JADX INFO: renamed from: c, reason: collision with root package name */
                    int f129717c;

                    /* JADX INFO: renamed from: e, reason: collision with root package name */
                    Object f129719e;

                    /* JADX INFO: renamed from: f, reason: collision with root package name */
                    Object f129720f;

                    public AnonymousClass1(kotlin.coroutines.c cVar) {
                        super(cVar);
                    }

                    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                    @dl.e
                    public final Object invokeSuspend(@dl.d Object obj) {
                        this.f129716b = obj;
                        this.f129717c |= Integer.MIN_VALUE;
                        return AnonymousClass2.this.emit(null, this);
                    }
                }

                public AnonymousClass2(f fVar, yh.p pVar) {
                    this.f129714b = fVar;
                    this.f129715c = pVar;
                }

                /* JADX WARN: Code duplicated, block: B:7:0x0013  */
                /* JADX WARN: Multi-variable type inference failed */
                @Override // kotlinx.coroutines.flow.f
                @dl.e
                public final Object emit(T t10, @dl.d kotlin.coroutines.c<? super b2> cVar) throws Throwable {
                    AnonymousClass1 anonymousClass1;
                    Object obj;
                    f fVar;
                    if (cVar instanceof AnonymousClass1) {
                        anonymousClass1 = (AnonymousClass1) cVar;
                        int i10 = anonymousClass1.f129717c;
                        if ((i10 & Integer.MIN_VALUE) != 0) {
                            anonymousClass1.f129717c = i10 - Integer.MIN_VALUE;
                        } else {
                            anonymousClass1 = new AnonymousClass1(cVar);
                        }
                    } else {
                        anonymousClass1 = new AnonymousClass1(cVar);
                    }
                    Object obj2 = anonymousClass1.f129716b;
                    Object objH = kotlin.coroutines.intrinsics.b.h();
                    int i11 = anonymousClass1.f129717c;
                    if (i11 != 0) {
                        if (i11 == 1) {
                            f fVar2 = (f) anonymousClass1.f129720f;
                            obj = anonymousClass1.f129719e;
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
                    f fVar3 = this.f129714b;
                    yh.p pVar = this.f129715c;
                    anonymousClass1.f129719e = t10;
                    anonymousClass1.f129720f = fVar3;
                    anonymousClass1.f129717c = 1;
                    c0.e(6);
                    Object objInvoke = pVar.invoke(t10, anonymousClass1);
                    c0.e(7);
                    if (objInvoke == objH) {
                        return objH;
                    }
                    obj = t10;
                    fVar = fVar3;
                    anonymousClass1.f129719e = null;
                    anonymousClass1.f129720f = null;
                    anonymousClass1.f129717c = 2;
                    if (fVar.emit(obj, anonymousClass1) == objH) {
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
        };
    }

    @dl.d
    public static final <T, R> e<R> h(@dl.d e<? extends T> eVar, R r10, @kotlin.b @dl.d yh.q<? super R, ? super T, ? super kotlin.coroutines.c<? super R>, ? extends Object> qVar) {
        return new FlowKt__TransformKt$runningFold$$inlined$unsafeFlow$1(r10, eVar, qVar);
    }

    @dl.d
    public static final <T> e<T> i(@dl.d e<? extends T> eVar, @dl.d yh.q<? super T, ? super T, ? super kotlin.coroutines.c<? super T>, ? extends Object> qVar) {
        return new a(eVar, qVar);
    }

    @dl.d
    public static final <T, R> e<R> j(@dl.d e<? extends T> eVar, R r10, @kotlin.b @dl.d yh.q<? super R, ? super T, ? super kotlin.coroutines.c<? super R>, ? extends Object> qVar) {
        return g.y1(eVar, r10, qVar);
    }

    @dl.d
    public static final <T> e<h0<T>> k(@dl.d e<? extends T> eVar) {
        return new b(eVar);
    }
}
