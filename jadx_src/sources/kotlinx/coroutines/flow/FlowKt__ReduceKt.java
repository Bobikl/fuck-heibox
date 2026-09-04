package kotlinx.coroutines.flow;

import com.ss.bytertc.base.media.screen.RXScreenCaptureService;
import com.umeng.analytics.pro.ak;
import java.util.NoSuchElementException;
import kotlin.Metadata;
import kotlin.b2;
import kotlin.jvm.internal.Ref;
import kotlin.jvm.internal.c0;
import kotlin.t0;
import kotlinx.coroutines.flow.internal.AbortFlowException;

/* JADX INFO: compiled from: Reduce.kt */
/* JADX INFO: loaded from: classes5.dex */
@Metadata(bv = {}, d1 = {"\u0000,\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\f\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\b\u001au\u0010\u000b\u001a\u00028\u0000\"\u0004\b\u0000\u0010\u0000\"\b\b\u0001\u0010\u0001*\u00028\u0000*\b\u0012\u0004\u0012\u00028\u00010\u00022F\u0010\n\u001aB\b\u0001\u0012\u0013\u0012\u00118\u0000¢\u0006\f\b\u0004\u0012\b\b\u0005\u0012\u0004\b\b(\u0006\u0012\u0013\u0012\u00118\u0001¢\u0006\f\b\u0004\u0012\b\b\u0005\u0012\u0004\b\b(\u0007\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\b\u0012\u0006\u0012\u0004\u0018\u00010\t0\u0003H\u0086@ø\u0001\u0000¢\u0006\u0004\b\u000b\u0010\f\u001a{\u0010\u0010\u001a\u00028\u0001\"\u0004\b\u0000\u0010\u0001\"\u0004\b\u0001\u0010\r*\b\u0012\u0004\u0012\u00028\u00000\u00022\u0006\u0010\u000e\u001a\u00028\u00012H\b\u0004\u0010\n\u001aB\b\u0001\u0012\u0013\u0012\u00118\u0001¢\u0006\f\b\u0004\u0012\b\b\u0005\u0012\u0004\b\b(\u000f\u0012\u0013\u0012\u00118\u0000¢\u0006\f\b\u0004\u0012\b\b\u0005\u0012\u0004\b\b(\u0007\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00010\b\u0012\u0006\u0012\u0004\u0018\u00010\t0\u0003H\u0086Hø\u0001\u0000¢\u0006\u0004\b\u0010\u0010\u0011\u001a#\u0010\u0012\u001a\u00028\u0000\"\u0004\b\u0000\u0010\u0001*\b\u0012\u0004\u0012\u00028\u00000\u0002H\u0086@ø\u0001\u0000¢\u0006\u0004\b\u0012\u0010\u0013\u001a%\u0010\u0014\u001a\u0004\u0018\u00018\u0000\"\u0004\b\u0000\u0010\u0001*\b\u0012\u0004\u0012\u00028\u00000\u0002H\u0086@ø\u0001\u0000¢\u0006\u0004\b\u0014\u0010\u0013\u001a#\u0010\u0015\u001a\u00028\u0000\"\u0004\b\u0000\u0010\u0001*\b\u0012\u0004\u0012\u00028\u00000\u0002H\u0086@ø\u0001\u0000¢\u0006\u0004\b\u0015\u0010\u0013\u001aG\u0010\u0019\u001a\u00028\u0000\"\u0004\b\u0000\u0010\u0001*\b\u0012\u0004\u0012\u00028\u00000\u00022\"\u0010\u0018\u001a\u001e\b\u0001\u0012\u0004\u0012\u00028\u0000\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00170\b\u0012\u0006\u0012\u0004\u0018\u00010\t0\u0016H\u0086@ø\u0001\u0000¢\u0006\u0004\b\u0019\u0010\u001a\u001a%\u0010\u001b\u001a\u0004\u0018\u00018\u0000\"\u0004\b\u0000\u0010\u0001*\b\u0012\u0004\u0012\u00028\u00000\u0002H\u0086@ø\u0001\u0000¢\u0006\u0004\b\u001b\u0010\u0013\u001aI\u0010\u001c\u001a\u0004\u0018\u00018\u0000\"\u0004\b\u0000\u0010\u0001*\b\u0012\u0004\u0012\u00028\u00000\u00022\"\u0010\u0018\u001a\u001e\b\u0001\u0012\u0004\u0012\u00028\u0000\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00170\b\u0012\u0006\u0012\u0004\u0018\u00010\t0\u0016H\u0086@ø\u0001\u0000¢\u0006\u0004\b\u001c\u0010\u001a\u001a#\u0010\u001d\u001a\u00028\u0000\"\u0004\b\u0000\u0010\u0001*\b\u0012\u0004\u0012\u00028\u00000\u0002H\u0086@ø\u0001\u0000¢\u0006\u0004\b\u001d\u0010\u0013\u001a%\u0010\u001e\u001a\u0004\u0018\u00018\u0000\"\u0004\b\u0000\u0010\u0001*\b\u0012\u0004\u0012\u00028\u00000\u0002H\u0086@ø\u0001\u0000¢\u0006\u0004\b\u001e\u0010\u0013\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006\u001f"}, d2 = {androidx.exifinterface.media.a.R4, androidx.exifinterface.media.a.f23244d5, "Lkotlinx/coroutines/flow/e;", "Lkotlin/Function3;", "Lkotlin/m0;", "name", "accumulator", "value", "Lkotlin/coroutines/c;", "", "operation", "i", "(Lkotlinx/coroutines/flow/e;Lyh/q;Lkotlin/coroutines/c;)Ljava/lang/Object;", "R", "initial", "acc", "e", "(Lkotlinx/coroutines/flow/e;Ljava/lang/Object;Lyh/q;Lkotlin/coroutines/c;)Ljava/lang/Object;", "j", "(Lkotlinx/coroutines/flow/e;Lkotlin/coroutines/c;)Ljava/lang/Object;", "k", ak.av, "Lkotlin/Function2;", "", "predicate", "b", "(Lkotlinx/coroutines/flow/e;Lyh/p;Lkotlin/coroutines/c;)Ljava/lang/Object;", ak.aF, "d", "g", RXScreenCaptureService.KEY_HEIGHT, "kotlinx-coroutines-core"}, k = 5, mv = {1, 6, 0}, xs = "kotlinx/coroutines/flow/FlowKt")
public final /* synthetic */ class FlowKt__ReduceKt {

    /* JADX INFO: Add missing generic type declarations: [T] */
    /* JADX INFO: compiled from: Limit.kt */
    @Metadata(bv = {}, d1 = {"\u0000\u0013\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00028\u00000\u0001J\u001b\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0002\u001a\u00028\u0000H\u0096@ø\u0001\u0000¢\u0006\u0004\b\u0004\u0010\u0005\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006\u0006¸\u0006\u0000"}, d2 = {"kotlinx/coroutines/flow/FlowKt__LimitKt$collectWhile$collector$1", "Lkotlinx/coroutines/flow/f;", "value", "Lkotlin/b2;", "emit", "(Ljava/lang/Object;Lkotlin/coroutines/c;)Ljava/lang/Object;", "kotlinx-coroutines-core"}, k = 1, mv = {1, 6, 0})
    public static final class a<T> implements kotlinx.coroutines.flow.f<T> {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ Ref.ObjectRef f129560b;

        public a(Ref.ObjectRef objectRef) {
            this.f129560b = objectRef;
        }

        @Override // kotlinx.coroutines.flow.f
        @dl.e
        public Object emit(T t10, @dl.d kotlin.coroutines.c<? super b2> cVar) {
            this.f129560b.f124891b = t10;
            throw new AbortFlowException(this);
        }
    }

    /* JADX INFO: Add missing generic type declarations: [T] */
    /* JADX INFO: compiled from: Limit.kt */
    @Metadata(bv = {}, d1 = {"\u0000\u0013\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00028\u00000\u0001J\u001b\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0002\u001a\u00028\u0000H\u0096@ø\u0001\u0000¢\u0006\u0004\b\u0004\u0010\u0005\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006\u0006¸\u0006\u0000"}, d2 = {"kotlinx/coroutines/flow/FlowKt__LimitKt$collectWhile$collector$1", "Lkotlinx/coroutines/flow/f;", "value", "Lkotlin/b2;", "emit", "(Ljava/lang/Object;Lkotlin/coroutines/c;)Ljava/lang/Object;", "kotlinx-coroutines-core"}, k = 1, mv = {1, 6, 0})
    public static final class b<T> implements kotlinx.coroutines.flow.f<T> {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ Ref.ObjectRef f129561b;

        public b(Ref.ObjectRef objectRef) {
            this.f129561b = objectRef;
        }

        @Override // kotlinx.coroutines.flow.f
        @dl.e
        public Object emit(T t10, @dl.d kotlin.coroutines.c<? super b2> cVar) {
            this.f129561b.f124891b = t10;
            throw new AbortFlowException(this);
        }
    }

    /* JADX INFO: compiled from: Reduce.kt */
    @Metadata(bv = {}, d1 = {"\u0000\f\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u0002\"\u0004\b\u0000\u0010\u00002\u0006\u0010\u0001\u001a\u00028\u0000H\u008a@¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {androidx.exifinterface.media.a.f23244d5, "it", "Lkotlin/b2;", "emit", "(Ljava/lang/Object;Lkotlin/coroutines/c;)Ljava/lang/Object;", "<anonymous>"}, k = 3, mv = {1, 6, 0})
    public static final class c<T> implements kotlinx.coroutines.flow.f {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ Ref.ObjectRef<Object> f129562b;

        c(Ref.ObjectRef<Object> objectRef) {
            this.f129562b = objectRef;
        }

        @Override // kotlinx.coroutines.flow.f
        @dl.e
        public final Object emit(T t10, @dl.d kotlin.coroutines.c<? super b2> cVar) {
            this.f129562b.f124891b = t10;
            return b2.f124493a;
        }
    }

    /* JADX INFO: compiled from: Reduce.kt */
    @Metadata(bv = {}, d1 = {"\u0000\f\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u0002\"\u0004\b\u0000\u0010\u00002\u0006\u0010\u0001\u001a\u00028\u0000H\u008a@¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {androidx.exifinterface.media.a.f23244d5, "it", "Lkotlin/b2;", "emit", "(Ljava/lang/Object;Lkotlin/coroutines/c;)Ljava/lang/Object;", "<anonymous>"}, k = 3, mv = {1, 6, 0})
    public static final class d<T> implements kotlinx.coroutines.flow.f {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ Ref.ObjectRef<T> f129563b;

        d(Ref.ObjectRef<T> objectRef) {
            this.f129563b = objectRef;
        }

        @Override // kotlinx.coroutines.flow.f
        @dl.e
        public final Object emit(T t10, @dl.d kotlin.coroutines.c<? super b2> cVar) {
            this.f129563b.f124891b = t10;
            return b2.f124493a;
        }
    }

    /* JADX INFO: compiled from: Reduce.kt */
    @Metadata(bv = {}, d1 = {"\u0000\f\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u0002\"\u0004\b\u0000\u0010\u00002\u0006\u0010\u0001\u001a\u00028\u0000H\u008a@¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {androidx.exifinterface.media.a.f23244d5, "value", "Lkotlin/b2;", "emit", "(Ljava/lang/Object;Lkotlin/coroutines/c;)Ljava/lang/Object;", "<anonymous>"}, k = 3, mv = {1, 6, 0})
    public static final class e<T> implements kotlinx.coroutines.flow.f {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ Ref.ObjectRef<Object> f129564b;

        e(Ref.ObjectRef<Object> objectRef) {
            this.f129564b = objectRef;
        }

        @Override // kotlinx.coroutines.flow.f
        @dl.e
        public final Object emit(T t10, @dl.d kotlin.coroutines.c<? super b2> cVar) {
            Ref.ObjectRef<Object> objectRef = this.f129564b;
            if (!(objectRef.f124891b == kotlinx.coroutines.flow.internal.l.f130082a)) {
                throw new IllegalArgumentException("Flow has more than one element".toString());
            }
            objectRef.f124891b = t10;
            return b2.f124493a;
        }
    }

    /* JADX INFO: Add missing generic type declarations: [T] */
    /* JADX INFO: compiled from: Limit.kt */
    @Metadata(bv = {}, d1 = {"\u0000\u0013\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00028\u00000\u0001J\u001b\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0002\u001a\u00028\u0000H\u0096@ø\u0001\u0000¢\u0006\u0004\b\u0004\u0010\u0005\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006\u0006¸\u0006\u0000"}, d2 = {"kotlinx/coroutines/flow/FlowKt__LimitKt$collectWhile$collector$1", "Lkotlinx/coroutines/flow/f;", "value", "Lkotlin/b2;", "emit", "(Ljava/lang/Object;Lkotlin/coroutines/c;)Ljava/lang/Object;", "kotlinx-coroutines-core"}, k = 1, mv = {1, 6, 0})
    public static final class f<T> implements kotlinx.coroutines.flow.f<T> {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ Ref.ObjectRef f129565b;

        public f(Ref.ObjectRef objectRef) {
            this.f129565b = objectRef;
        }

        @Override // kotlinx.coroutines.flow.f
        @dl.e
        public Object emit(T t10, @dl.d kotlin.coroutines.c<? super b2> cVar) {
            boolean z10;
            Ref.ObjectRef objectRef = this.f129565b;
            T t11 = objectRef.f124891b;
            T t12 = (T) kotlinx.coroutines.flow.internal.l.f130082a;
            if (t11 == t12) {
                objectRef.f124891b = t10;
                z10 = true;
            } else {
                objectRef.f124891b = t12;
                z10 = false;
            }
            if (z10) {
                return b2.f124493a;
            }
            throw new AbortFlowException(this);
        }
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    @dl.e
    public static final <T> Object a(@dl.d kotlinx.coroutines.flow.e<? extends T> eVar, @dl.d kotlin.coroutines.c<? super T> cVar) throws Throwable {
        FlowKt__ReduceKt$first$1 flowKt__ReduceKt$first$1;
        Ref.ObjectRef objectRef;
        AbortFlowException e10;
        kotlinx.coroutines.flow.f<? super Object> fVar;
        if (cVar instanceof FlowKt__ReduceKt$first$1) {
            flowKt__ReduceKt$first$1 = (FlowKt__ReduceKt$first$1) cVar;
            int i10 = flowKt__ReduceKt$first$1.f129576e;
            if ((i10 & Integer.MIN_VALUE) != 0) {
                flowKt__ReduceKt$first$1.f129576e = i10 - Integer.MIN_VALUE;
            } else {
                flowKt__ReduceKt$first$1 = new FlowKt__ReduceKt$first$1(cVar);
            }
        } else {
            flowKt__ReduceKt$first$1 = new FlowKt__ReduceKt$first$1(cVar);
        }
        Object obj = flowKt__ReduceKt$first$1.f129575d;
        Object objH = kotlin.coroutines.intrinsics.b.h();
        int i11 = flowKt__ReduceKt$first$1.f129576e;
        if (i11 == 0) {
            t0.n(obj);
            Ref.ObjectRef objectRef2 = new Ref.ObjectRef();
            objectRef2.f124891b = (T) kotlinx.coroutines.flow.internal.l.f130082a;
            kotlinx.coroutines.flow.f<? super Object> aVar = new a<>(objectRef2);
            try {
                flowKt__ReduceKt$first$1.f129573b = objectRef2;
                flowKt__ReduceKt$first$1.f129574c = aVar;
                flowKt__ReduceKt$first$1.f129576e = 1;
                if (eVar.a(aVar, flowKt__ReduceKt$first$1) == objH) {
                    return objH;
                }
                objectRef = objectRef2;
            } catch (AbortFlowException e11) {
                objectRef = objectRef2;
                e10 = e11;
                fVar = aVar;
                kotlinx.coroutines.flow.internal.h.b(e10, fVar);
            }
        } else {
            if (i11 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            fVar = (a) flowKt__ReduceKt$first$1.f129574c;
            objectRef = (Ref.ObjectRef) flowKt__ReduceKt$first$1.f129573b;
            try {
                t0.n(obj);
            } catch (AbortFlowException e12) {
                e10 = e12;
                kotlinx.coroutines.flow.internal.h.b(e10, fVar);
            }
        }
        T t10 = objectRef.f124891b;
        if (t10 != kotlinx.coroutines.flow.internal.l.f130082a) {
            return t10;
        }
        throw new NoSuchElementException("Expected at least one element");
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    @dl.e
    public static final <T> Object b(@dl.d kotlinx.coroutines.flow.e<? extends T> eVar, @dl.d yh.p<? super T, ? super kotlin.coroutines.c<? super Boolean>, ? extends Object> pVar, @dl.d kotlin.coroutines.c<? super T> cVar) throws Throwable {
        FlowKt__ReduceKt$first$3 flowKt__ReduceKt$first$3;
        yh.p<? super T, ? super kotlin.coroutines.c<? super Boolean>, ? extends Object> pVar2;
        Ref.ObjectRef objectRef;
        AbortFlowException e10;
        kotlinx.coroutines.flow.f<? super Object> fVar;
        if (cVar instanceof FlowKt__ReduceKt$first$3) {
            flowKt__ReduceKt$first$3 = (FlowKt__ReduceKt$first$3) cVar;
            int i10 = flowKt__ReduceKt$first$3.f129581f;
            if ((i10 & Integer.MIN_VALUE) != 0) {
                flowKt__ReduceKt$first$3.f129581f = i10 - Integer.MIN_VALUE;
            } else {
                flowKt__ReduceKt$first$3 = new FlowKt__ReduceKt$first$3(cVar);
            }
        } else {
            flowKt__ReduceKt$first$3 = new FlowKt__ReduceKt$first$3(cVar);
        }
        Object obj = flowKt__ReduceKt$first$3.f129580e;
        Object objH = kotlin.coroutines.intrinsics.b.h();
        int i11 = flowKt__ReduceKt$first$3.f129581f;
        if (i11 == 0) {
            t0.n(obj);
            Ref.ObjectRef objectRef2 = new Ref.ObjectRef();
            objectRef2.f124891b = (T) kotlinx.coroutines.flow.internal.l.f130082a;
            kotlinx.coroutines.flow.f<? super Object> flowKt__ReduceKt$first$$inlined$collectWhile$2 = new FlowKt__ReduceKt$first$$inlined$collectWhile$2<>(pVar, objectRef2);
            try {
                flowKt__ReduceKt$first$3.f129577b = pVar;
                flowKt__ReduceKt$first$3.f129578c = objectRef2;
                flowKt__ReduceKt$first$3.f129579d = flowKt__ReduceKt$first$$inlined$collectWhile$2;
                flowKt__ReduceKt$first$3.f129581f = 1;
                if (eVar.a(flowKt__ReduceKt$first$$inlined$collectWhile$2, flowKt__ReduceKt$first$3) == objH) {
                    return objH;
                }
                pVar2 = pVar;
                objectRef = objectRef2;
            } catch (AbortFlowException e11) {
                pVar2 = pVar;
                objectRef = objectRef2;
                e10 = e11;
                fVar = flowKt__ReduceKt$first$$inlined$collectWhile$2;
                kotlinx.coroutines.flow.internal.h.b(e10, fVar);
            }
        } else {
            if (i11 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            fVar = (FlowKt__ReduceKt$first$$inlined$collectWhile$2) flowKt__ReduceKt$first$3.f129579d;
            objectRef = (Ref.ObjectRef) flowKt__ReduceKt$first$3.f129578c;
            pVar2 = (yh.p) flowKt__ReduceKt$first$3.f129577b;
            try {
                t0.n(obj);
            } catch (AbortFlowException e12) {
                e10 = e12;
                kotlinx.coroutines.flow.internal.h.b(e10, fVar);
            }
        }
        T t10 = objectRef.f124891b;
        if (t10 != kotlinx.coroutines.flow.internal.l.f130082a) {
            return t10;
        }
        throw new NoSuchElementException("Expected at least one element matching the predicate " + pVar2);
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    @dl.e
    public static final <T> Object c(@dl.d kotlinx.coroutines.flow.e<? extends T> eVar, @dl.d kotlin.coroutines.c<? super T> cVar) throws Throwable {
        FlowKt__ReduceKt$firstOrNull$1 flowKt__ReduceKt$firstOrNull$1;
        Ref.ObjectRef objectRef;
        AbortFlowException e10;
        kotlinx.coroutines.flow.f<? super Object> fVar;
        if (cVar instanceof FlowKt__ReduceKt$firstOrNull$1) {
            flowKt__ReduceKt$firstOrNull$1 = (FlowKt__ReduceKt$firstOrNull$1) cVar;
            int i10 = flowKt__ReduceKt$firstOrNull$1.f129592e;
            if ((i10 & Integer.MIN_VALUE) != 0) {
                flowKt__ReduceKt$firstOrNull$1.f129592e = i10 - Integer.MIN_VALUE;
            } else {
                flowKt__ReduceKt$firstOrNull$1 = new FlowKt__ReduceKt$firstOrNull$1(cVar);
            }
        } else {
            flowKt__ReduceKt$firstOrNull$1 = new FlowKt__ReduceKt$firstOrNull$1(cVar);
        }
        Object obj = flowKt__ReduceKt$firstOrNull$1.f129591d;
        Object objH = kotlin.coroutines.intrinsics.b.h();
        int i11 = flowKt__ReduceKt$firstOrNull$1.f129592e;
        if (i11 == 0) {
            t0.n(obj);
            Ref.ObjectRef objectRef2 = new Ref.ObjectRef();
            kotlinx.coroutines.flow.f<? super Object> bVar = new b<>(objectRef2);
            try {
                flowKt__ReduceKt$firstOrNull$1.f129589b = objectRef2;
                flowKt__ReduceKt$firstOrNull$1.f129590c = bVar;
                flowKt__ReduceKt$firstOrNull$1.f129592e = 1;
                if (eVar.a(bVar, flowKt__ReduceKt$firstOrNull$1) == objH) {
                    return objH;
                }
                objectRef = objectRef2;
            } catch (AbortFlowException e11) {
                objectRef = objectRef2;
                e10 = e11;
                fVar = bVar;
                kotlinx.coroutines.flow.internal.h.b(e10, fVar);
            }
        } else {
            if (i11 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            fVar = (b) flowKt__ReduceKt$firstOrNull$1.f129590c;
            objectRef = (Ref.ObjectRef) flowKt__ReduceKt$firstOrNull$1.f129589b;
            try {
                t0.n(obj);
            } catch (AbortFlowException e12) {
                e10 = e12;
                kotlinx.coroutines.flow.internal.h.b(e10, fVar);
            }
        }
        return objectRef.f124891b;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    @dl.e
    public static final <T> Object d(@dl.d kotlinx.coroutines.flow.e<? extends T> eVar, @dl.d yh.p<? super T, ? super kotlin.coroutines.c<? super Boolean>, ? extends Object> pVar, @dl.d kotlin.coroutines.c<? super T> cVar) throws Throwable {
        FlowKt__ReduceKt$firstOrNull$3 flowKt__ReduceKt$firstOrNull$3;
        Ref.ObjectRef objectRef;
        AbortFlowException e10;
        kotlinx.coroutines.flow.f<? super Object> fVar;
        if (cVar instanceof FlowKt__ReduceKt$firstOrNull$3) {
            flowKt__ReduceKt$firstOrNull$3 = (FlowKt__ReduceKt$firstOrNull$3) cVar;
            int i10 = flowKt__ReduceKt$firstOrNull$3.f129596e;
            if ((i10 & Integer.MIN_VALUE) != 0) {
                flowKt__ReduceKt$firstOrNull$3.f129596e = i10 - Integer.MIN_VALUE;
            } else {
                flowKt__ReduceKt$firstOrNull$3 = new FlowKt__ReduceKt$firstOrNull$3(cVar);
            }
        } else {
            flowKt__ReduceKt$firstOrNull$3 = new FlowKt__ReduceKt$firstOrNull$3(cVar);
        }
        Object obj = flowKt__ReduceKt$firstOrNull$3.f129595d;
        Object objH = kotlin.coroutines.intrinsics.b.h();
        int i11 = flowKt__ReduceKt$firstOrNull$3.f129596e;
        if (i11 == 0) {
            t0.n(obj);
            Ref.ObjectRef objectRef2 = new Ref.ObjectRef();
            kotlinx.coroutines.flow.f<? super Object> flowKt__ReduceKt$firstOrNull$$inlined$collectWhile$2 = new FlowKt__ReduceKt$firstOrNull$$inlined$collectWhile$2<>(pVar, objectRef2);
            try {
                flowKt__ReduceKt$firstOrNull$3.f129593b = objectRef2;
                flowKt__ReduceKt$firstOrNull$3.f129594c = flowKt__ReduceKt$firstOrNull$$inlined$collectWhile$2;
                flowKt__ReduceKt$firstOrNull$3.f129596e = 1;
                if (eVar.a(flowKt__ReduceKt$firstOrNull$$inlined$collectWhile$2, flowKt__ReduceKt$firstOrNull$3) == objH) {
                    return objH;
                }
                objectRef = objectRef2;
            } catch (AbortFlowException e11) {
                objectRef = objectRef2;
                e10 = e11;
                fVar = flowKt__ReduceKt$firstOrNull$$inlined$collectWhile$2;
                kotlinx.coroutines.flow.internal.h.b(e10, fVar);
            }
        } else {
            if (i11 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            fVar = (FlowKt__ReduceKt$firstOrNull$$inlined$collectWhile$2) flowKt__ReduceKt$firstOrNull$3.f129594c;
            objectRef = (Ref.ObjectRef) flowKt__ReduceKt$firstOrNull$3.f129593b;
            try {
                t0.n(obj);
            } catch (AbortFlowException e12) {
                e10 = e12;
                kotlinx.coroutines.flow.internal.h.b(e10, fVar);
            }
        }
        return objectRef.f124891b;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX WARN: Multi-variable type inference failed */
    @dl.e
    public static final <T, R> Object e(@dl.d kotlinx.coroutines.flow.e<? extends T> eVar, R r10, @dl.d yh.q<? super R, ? super T, ? super kotlin.coroutines.c<? super R>, ? extends Object> qVar, @dl.d kotlin.coroutines.c<? super R> cVar) throws Throwable {
        FlowKt__ReduceKt$fold$1 flowKt__ReduceKt$fold$1;
        Ref.ObjectRef objectRef;
        if (cVar instanceof FlowKt__ReduceKt$fold$1) {
            flowKt__ReduceKt$fold$1 = (FlowKt__ReduceKt$fold$1) cVar;
            int i10 = flowKt__ReduceKt$fold$1.f129599d;
            if ((i10 & Integer.MIN_VALUE) != 0) {
                flowKt__ReduceKt$fold$1.f129599d = i10 - Integer.MIN_VALUE;
            } else {
                flowKt__ReduceKt$fold$1 = new FlowKt__ReduceKt$fold$1(cVar);
            }
        } else {
            flowKt__ReduceKt$fold$1 = new FlowKt__ReduceKt$fold$1(cVar);
        }
        Object obj = flowKt__ReduceKt$fold$1.f129598c;
        Object objH = kotlin.coroutines.intrinsics.b.h();
        int i11 = flowKt__ReduceKt$fold$1.f129599d;
        if (i11 == 0) {
            t0.n(obj);
            Ref.ObjectRef objectRef2 = new Ref.ObjectRef();
            objectRef2.f124891b = r10;
            kotlinx.coroutines.flow.f<? super Object> flowKt__ReduceKt$fold$2 = new FlowKt__ReduceKt$fold$2<>(objectRef2, qVar);
            flowKt__ReduceKt$fold$1.f129597b = objectRef2;
            flowKt__ReduceKt$fold$1.f129599d = 1;
            if (eVar.a(flowKt__ReduceKt$fold$2, flowKt__ReduceKt$fold$1) == objH) {
                return objH;
            }
            objectRef = objectRef2;
        } else {
            if (i11 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            objectRef = (Ref.ObjectRef) flowKt__ReduceKt$fold$1.f129597b;
            t0.n(obj);
        }
        return objectRef.f124891b;
    }

    /* JADX WARN: Multi-variable type inference failed */
    private static final <T, R> Object f(kotlinx.coroutines.flow.e<? extends T> eVar, R r10, yh.q<? super R, ? super T, ? super kotlin.coroutines.c<? super R>, ? extends Object> qVar, kotlin.coroutines.c<? super R> cVar) {
        Ref.ObjectRef objectRef = new Ref.ObjectRef();
        objectRef.f124891b = r10;
        FlowKt__ReduceKt$fold$2 flowKt__ReduceKt$fold$2 = new FlowKt__ReduceKt$fold$2(objectRef, qVar);
        c0.e(0);
        eVar.a(flowKt__ReduceKt$fold$2, cVar);
        c0.e(1);
        return objectRef.f124891b;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    @dl.e
    public static final <T> Object g(@dl.d kotlinx.coroutines.flow.e<? extends T> eVar, @dl.d kotlin.coroutines.c<? super T> cVar) throws Throwable {
        FlowKt__ReduceKt$last$1 flowKt__ReduceKt$last$1;
        Ref.ObjectRef objectRef;
        if (cVar instanceof FlowKt__ReduceKt$last$1) {
            flowKt__ReduceKt$last$1 = (FlowKt__ReduceKt$last$1) cVar;
            int i10 = flowKt__ReduceKt$last$1.f129608d;
            if ((i10 & Integer.MIN_VALUE) != 0) {
                flowKt__ReduceKt$last$1.f129608d = i10 - Integer.MIN_VALUE;
            } else {
                flowKt__ReduceKt$last$1 = new FlowKt__ReduceKt$last$1(cVar);
            }
        } else {
            flowKt__ReduceKt$last$1 = new FlowKt__ReduceKt$last$1(cVar);
        }
        Object obj = flowKt__ReduceKt$last$1.f129607c;
        Object objH = kotlin.coroutines.intrinsics.b.h();
        int i11 = flowKt__ReduceKt$last$1.f129608d;
        if (i11 == 0) {
            t0.n(obj);
            Ref.ObjectRef objectRef2 = new Ref.ObjectRef();
            objectRef2.f124891b = (T) kotlinx.coroutines.flow.internal.l.f130082a;
            kotlinx.coroutines.flow.f<? super Object> cVar2 = new c<>(objectRef2);
            flowKt__ReduceKt$last$1.f129606b = objectRef2;
            flowKt__ReduceKt$last$1.f129608d = 1;
            if (eVar.a(cVar2, flowKt__ReduceKt$last$1) == objH) {
                return objH;
            }
            objectRef = objectRef2;
        } else {
            if (i11 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            objectRef = (Ref.ObjectRef) flowKt__ReduceKt$last$1.f129606b;
            t0.n(obj);
        }
        T t10 = objectRef.f124891b;
        if (t10 != kotlinx.coroutines.flow.internal.l.f130082a) {
            return t10;
        }
        throw new NoSuchElementException("Expected at least one element");
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    @dl.e
    public static final <T> Object h(@dl.d kotlinx.coroutines.flow.e<? extends T> eVar, @dl.d kotlin.coroutines.c<? super T> cVar) throws Throwable {
        FlowKt__ReduceKt$lastOrNull$1 flowKt__ReduceKt$lastOrNull$1;
        Ref.ObjectRef objectRef;
        if (cVar instanceof FlowKt__ReduceKt$lastOrNull$1) {
            flowKt__ReduceKt$lastOrNull$1 = (FlowKt__ReduceKt$lastOrNull$1) cVar;
            int i10 = flowKt__ReduceKt$lastOrNull$1.f129611d;
            if ((i10 & Integer.MIN_VALUE) != 0) {
                flowKt__ReduceKt$lastOrNull$1.f129611d = i10 - Integer.MIN_VALUE;
            } else {
                flowKt__ReduceKt$lastOrNull$1 = new FlowKt__ReduceKt$lastOrNull$1(cVar);
            }
        } else {
            flowKt__ReduceKt$lastOrNull$1 = new FlowKt__ReduceKt$lastOrNull$1(cVar);
        }
        Object obj = flowKt__ReduceKt$lastOrNull$1.f129610c;
        Object objH = kotlin.coroutines.intrinsics.b.h();
        int i11 = flowKt__ReduceKt$lastOrNull$1.f129611d;
        if (i11 == 0) {
            t0.n(obj);
            Ref.ObjectRef objectRef2 = new Ref.ObjectRef();
            kotlinx.coroutines.flow.f<? super Object> dVar = new d<>(objectRef2);
            flowKt__ReduceKt$lastOrNull$1.f129609b = objectRef2;
            flowKt__ReduceKt$lastOrNull$1.f129611d = 1;
            if (eVar.a(dVar, flowKt__ReduceKt$lastOrNull$1) == objH) {
                return objH;
            }
            objectRef = objectRef2;
        } else {
            if (i11 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            objectRef = (Ref.ObjectRef) flowKt__ReduceKt$lastOrNull$1.f129609b;
            t0.n(obj);
        }
        return objectRef.f124891b;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX WARN: Type inference failed for: r2v1, types: [T, kotlinx.coroutines.internal.o0] */
    @dl.e
    public static final <S, T extends S> Object i(@dl.d kotlinx.coroutines.flow.e<? extends T> eVar, @dl.d yh.q<? super S, ? super T, ? super kotlin.coroutines.c<? super S>, ? extends Object> qVar, @dl.d kotlin.coroutines.c<? super S> cVar) throws Throwable {
        FlowKt__ReduceKt$reduce$1 flowKt__ReduceKt$reduce$1;
        Ref.ObjectRef objectRef;
        if (cVar instanceof FlowKt__ReduceKt$reduce$1) {
            flowKt__ReduceKt$reduce$1 = (FlowKt__ReduceKt$reduce$1) cVar;
            int i10 = flowKt__ReduceKt$reduce$1.f129614d;
            if ((i10 & Integer.MIN_VALUE) != 0) {
                flowKt__ReduceKt$reduce$1.f129614d = i10 - Integer.MIN_VALUE;
            } else {
                flowKt__ReduceKt$reduce$1 = new FlowKt__ReduceKt$reduce$1(cVar);
            }
        } else {
            flowKt__ReduceKt$reduce$1 = new FlowKt__ReduceKt$reduce$1(cVar);
        }
        Object obj = flowKt__ReduceKt$reduce$1.f129613c;
        Object objH = kotlin.coroutines.intrinsics.b.h();
        int i11 = flowKt__ReduceKt$reduce$1.f129614d;
        if (i11 == 0) {
            t0.n(obj);
            Ref.ObjectRef objectRef2 = new Ref.ObjectRef();
            objectRef2.f124891b = kotlinx.coroutines.flow.internal.l.f130082a;
            kotlinx.coroutines.flow.f<? super Object> flowKt__ReduceKt$reduce$2 = new FlowKt__ReduceKt$reduce$2<>(objectRef2, qVar);
            flowKt__ReduceKt$reduce$1.f129612b = objectRef2;
            flowKt__ReduceKt$reduce$1.f129614d = 1;
            if (eVar.a(flowKt__ReduceKt$reduce$2, flowKt__ReduceKt$reduce$1) == objH) {
                return objH;
            }
            objectRef = objectRef2;
        } else {
            if (i11 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            objectRef = (Ref.ObjectRef) flowKt__ReduceKt$reduce$1.f129612b;
            t0.n(obj);
        }
        T t10 = objectRef.f124891b;
        if (t10 != kotlinx.coroutines.flow.internal.l.f130082a) {
            return t10;
        }
        throw new NoSuchElementException("Empty flow can't be reduced");
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    @dl.e
    public static final <T> Object j(@dl.d kotlinx.coroutines.flow.e<? extends T> eVar, @dl.d kotlin.coroutines.c<? super T> cVar) throws Throwable {
        FlowKt__ReduceKt$single$1 flowKt__ReduceKt$single$1;
        Ref.ObjectRef objectRef;
        if (cVar instanceof FlowKt__ReduceKt$single$1) {
            flowKt__ReduceKt$single$1 = (FlowKt__ReduceKt$single$1) cVar;
            int i10 = flowKt__ReduceKt$single$1.f129623d;
            if ((i10 & Integer.MIN_VALUE) != 0) {
                flowKt__ReduceKt$single$1.f129623d = i10 - Integer.MIN_VALUE;
            } else {
                flowKt__ReduceKt$single$1 = new FlowKt__ReduceKt$single$1(cVar);
            }
        } else {
            flowKt__ReduceKt$single$1 = new FlowKt__ReduceKt$single$1(cVar);
        }
        Object obj = flowKt__ReduceKt$single$1.f129622c;
        Object objH = kotlin.coroutines.intrinsics.b.h();
        int i11 = flowKt__ReduceKt$single$1.f129623d;
        if (i11 == 0) {
            t0.n(obj);
            Ref.ObjectRef objectRef2 = new Ref.ObjectRef();
            objectRef2.f124891b = (T) kotlinx.coroutines.flow.internal.l.f130082a;
            kotlinx.coroutines.flow.f<? super Object> eVar2 = new e<>(objectRef2);
            flowKt__ReduceKt$single$1.f129621b = objectRef2;
            flowKt__ReduceKt$single$1.f129623d = 1;
            if (eVar.a(eVar2, flowKt__ReduceKt$single$1) == objH) {
                return objH;
            }
            objectRef = objectRef2;
        } else {
            if (i11 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            objectRef = (Ref.ObjectRef) flowKt__ReduceKt$single$1.f129621b;
            t0.n(obj);
        }
        T t10 = objectRef.f124891b;
        if (t10 != kotlinx.coroutines.flow.internal.l.f130082a) {
            return t10;
        }
        throw new NoSuchElementException("Flow is empty");
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    @dl.e
    public static final <T> Object k(@dl.d kotlinx.coroutines.flow.e<? extends T> eVar, @dl.d kotlin.coroutines.c<? super T> cVar) throws Throwable {
        FlowKt__ReduceKt$singleOrNull$1 flowKt__ReduceKt$singleOrNull$1;
        Ref.ObjectRef objectRef;
        AbortFlowException e10;
        kotlinx.coroutines.flow.f<? super Object> fVar;
        if (cVar instanceof FlowKt__ReduceKt$singleOrNull$1) {
            flowKt__ReduceKt$singleOrNull$1 = (FlowKt__ReduceKt$singleOrNull$1) cVar;
            int i10 = flowKt__ReduceKt$singleOrNull$1.f129627e;
            if ((i10 & Integer.MIN_VALUE) != 0) {
                flowKt__ReduceKt$singleOrNull$1.f129627e = i10 - Integer.MIN_VALUE;
            } else {
                flowKt__ReduceKt$singleOrNull$1 = new FlowKt__ReduceKt$singleOrNull$1(cVar);
            }
        } else {
            flowKt__ReduceKt$singleOrNull$1 = new FlowKt__ReduceKt$singleOrNull$1(cVar);
        }
        Object obj = flowKt__ReduceKt$singleOrNull$1.f129626d;
        Object objH = kotlin.coroutines.intrinsics.b.h();
        int i11 = flowKt__ReduceKt$singleOrNull$1.f129627e;
        if (i11 == 0) {
            t0.n(obj);
            Ref.ObjectRef objectRef2 = new Ref.ObjectRef();
            objectRef2.f124891b = (T) kotlinx.coroutines.flow.internal.l.f130082a;
            kotlinx.coroutines.flow.f<? super Object> fVar2 = new f<>(objectRef2);
            try {
                flowKt__ReduceKt$singleOrNull$1.f129624b = objectRef2;
                flowKt__ReduceKt$singleOrNull$1.f129625c = fVar2;
                flowKt__ReduceKt$singleOrNull$1.f129627e = 1;
                if (eVar.a(fVar2, flowKt__ReduceKt$singleOrNull$1) == objH) {
                    return objH;
                }
                objectRef = objectRef2;
            } catch (AbortFlowException e11) {
                objectRef = objectRef2;
                e10 = e11;
                fVar = fVar2;
                kotlinx.coroutines.flow.internal.h.b(e10, fVar);
            }
        } else {
            if (i11 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            fVar = (f) flowKt__ReduceKt$singleOrNull$1.f129625c;
            objectRef = (Ref.ObjectRef) flowKt__ReduceKt$singleOrNull$1.f129624b;
            try {
                t0.n(obj);
            } catch (AbortFlowException e12) {
                e10 = e12;
                kotlinx.coroutines.flow.internal.h.b(e10, fVar);
            }
        }
        T t10 = objectRef.f124891b;
        if (t10 == kotlinx.coroutines.flow.internal.l.f130082a) {
            return null;
        }
        return t10;
    }
}
