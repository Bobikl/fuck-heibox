package androidx.p001datastore.core;

import androidx.exifinterface.media.a;
import dl.e;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.b2;
import kotlin.coroutines.c;
import kotlin.coroutines.intrinsics.b;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.coroutines.jvm.internal.d;
import kotlin.t0;
import kotlinx.coroutines.flow.f;
import kotlinx.coroutines.flow.g;
import yh.p;

/* JADX INFO: Add missing generic type declarations: [T] */
/* JADX INFO: compiled from: SingleProcessDataStore.kt */
/* JADX INFO: loaded from: classes.dex */
@Metadata(bv = {}, d1 = {"\u0000\f\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0010\u0003\u001a\u00020\u0002\"\u0004\b\u0000\u0010\u0000*\b\u0012\u0004\u0012\u00028\u00000\u0001H\u008a@"}, d2 = {a.f23244d5, "Lkotlinx/coroutines/flow/f;", "Lkotlin/b2;", "<anonymous>"}, k = 3, mv = {1, 5, 1})
@d(c = "androidx.datastore.core.SingleProcessDataStore$data$1", f = "SingleProcessDataStore.kt", i = {}, l = {117}, m = "invokeSuspend", n = {}, s = {})
public final class SingleProcessDataStore$data$1<T> extends SuspendLambda implements p<f<? super T>, c<? super b2>, Object> {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    int f22098b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private /* synthetic */ Object f22099c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    final /* synthetic */ SingleProcessDataStore<T> f22100d;

    /* JADX INFO: renamed from: androidx.datastore.core.SingleProcessDataStore$data$1$1, reason: invalid class name */
    /* JADX INFO: compiled from: SingleProcessDataStore.kt */
    @Metadata(bv = {}, d1 = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\u0010\u0004\u001a\u00020\u0003\"\u0004\b\u0000\u0010\u00002\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00028\u00000\u0001H\u008a@"}, d2 = {a.f23244d5, "Landroidx/datastore/core/j;", "it", "", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    @d(c = "androidx.datastore.core.SingleProcessDataStore$data$1$1", f = "SingleProcessDataStore.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
    public static final class AnonymousClass1 extends SuspendLambda implements p<j<T>, c<? super Boolean>, Object> {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        int f22101b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        /* synthetic */ Object f22102c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        final /* synthetic */ j<T> f22103d;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        AnonymousClass1(j<T> jVar, c<? super AnonymousClass1> cVar) {
            super(2, cVar);
            this.f22103d = jVar;
        }

        @Override // yh.p
        @e
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Object invoke(@dl.d j<T> jVar, @e c<? super Boolean> cVar) {
            return ((AnonymousClass1) create(jVar, cVar)).invokeSuspend(b2.f124493a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @dl.d
        public final c<b2> create(@e Object obj, @dl.d c<?> cVar) {
            AnonymousClass1 anonymousClass1 = new AnonymousClass1(this.f22103d, cVar);
            anonymousClass1.f22102c = obj;
            return anonymousClass1;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @e
        public final Object invokeSuspend(@dl.d Object obj) throws Throwable {
            b.h();
            if (this.f22101b != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            t0.n(obj);
            j<T> jVar = (j) this.f22102c;
            j<T> jVar2 = this.f22103d;
            boolean z10 = false;
            if (!(jVar2 instanceof b) && !(jVar2 instanceof f) && jVar == jVar2) {
                z10 = true;
            }
            return kotlin.coroutines.jvm.internal.a.a(z10);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    SingleProcessDataStore$data$1(SingleProcessDataStore<T> singleProcessDataStore, c<? super SingleProcessDataStore$data$1> cVar) {
        super(2, cVar);
        this.f22100d = singleProcessDataStore;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @dl.d
    public final c<b2> create(@e Object obj, @dl.d c<?> cVar) {
        SingleProcessDataStore$data$1 singleProcessDataStore$data$1 = new SingleProcessDataStore$data$1(this.f22100d, cVar);
        singleProcessDataStore$data$1.f22099c = obj;
        return singleProcessDataStore$data$1;
    }

    @Override // yh.p
    @e
    public final Object invoke(@dl.d f<? super T> fVar, @e c<? super b2> cVar) {
        return ((SingleProcessDataStore$data$1) create(fVar, cVar)).invokeSuspend(b2.f124493a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @e
    public final Object invokeSuspend(@dl.d Object obj) throws Throwable {
        Object objH = b.h();
        int i10 = this.f22098b;
        if (i10 == 0) {
            t0.n(obj);
            f fVar = (f) this.f22099c;
            j jVar = (j) ((SingleProcessDataStore) this.f22100d).downstreamFlow.getValue();
            if (!(jVar instanceof b)) {
                ((SingleProcessDataStore) this.f22100d).actor.e(new SingleProcessDataStore.b.a(jVar));
            }
            final kotlinx.coroutines.flow.e eVarK0 = g.k0(((SingleProcessDataStore) this.f22100d).downstreamFlow, new AnonymousClass1(jVar, null));
            kotlinx.coroutines.flow.e<T> eVar = new kotlinx.coroutines.flow.e<T>() { // from class: androidx.datastore.core.SingleProcessDataStore$data$1$invokeSuspend$$inlined$map$1

                /* JADX INFO: renamed from: androidx.datastore.core.SingleProcessDataStore$data$1$invokeSuspend$$inlined$map$1$2, reason: invalid class name */
                /* JADX INFO: compiled from: Collect.kt */
                @Metadata(bv = {}, d1 = {"\u0000\u0013\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00028\u00000\u0001J\u001b\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0002\u001a\u00028\u0000H\u0096@ø\u0001\u0000¢\u0006\u0004\b\u0004\u0010\u0005\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006\u0006¸\u0006\u0007"}, d2 = {"kotlinx/coroutines/flow/FlowKt__CollectKt$collect$3", "Lkotlinx/coroutines/flow/f;", "value", "Lkotlin/b2;", "emit", "(Ljava/lang/Object;Lkotlin/coroutines/c;)Ljava/lang/Object;", "kotlinx-coroutines-core", "kotlinx/coroutines/flow/FlowKt__TransformKt$map$$inlined$unsafeTransform$1$2"}, k = 1, mv = {1, 5, 1})
                public static final class AnonymousClass2 implements f<j<T>> {

                    /* JADX INFO: renamed from: b, reason: collision with root package name */
                    final /* synthetic */ f f22105b;

                    /* JADX INFO: renamed from: androidx.datastore.core.SingleProcessDataStore$data$1$invokeSuspend$$inlined$map$1$2$1, reason: invalid class name */
                    @Metadata(k = 3, mv = {1, 5, 1}, xi = 48)
                    @d(c = "androidx.datastore.core.SingleProcessDataStore$data$1$invokeSuspend$$inlined$map$1$2", f = "SingleProcessDataStore.kt", i = {}, l = {137}, m = "emit", n = {}, s = {})
                    public static final class AnonymousClass1 extends ContinuationImpl {

                        /* JADX INFO: renamed from: b, reason: collision with root package name */
                        /* synthetic */ Object f22106b;

                        /* JADX INFO: renamed from: c, reason: collision with root package name */
                        int f22107c;

                        /* JADX INFO: renamed from: d, reason: collision with root package name */
                        Object f22108d;

                        public AnonymousClass1(c cVar) {
                            super(cVar);
                        }

                        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                        @e
                        public final Object invokeSuspend(@dl.d Object obj) {
                            this.f22106b = obj;
                            this.f22107c |= Integer.MIN_VALUE;
                            return AnonymousClass2.this.emit(null, this);
                        }
                    }

                    public AnonymousClass2(f fVar) {
                        this.f22105b = fVar;
                    }

                    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
                    /* JADX WARN: Multi-variable type inference failed */
                    @Override // kotlinx.coroutines.flow.f
                    @e
                    public Object emit(Object obj, @dl.d c cVar) throws Throwable {
                        AnonymousClass1 anonymousClass1;
                        if (cVar instanceof AnonymousClass1) {
                            anonymousClass1 = (AnonymousClass1) cVar;
                            int i10 = anonymousClass1.f22107c;
                            if ((i10 & Integer.MIN_VALUE) != 0) {
                                anonymousClass1.f22107c = i10 - Integer.MIN_VALUE;
                            } else {
                                anonymousClass1 = new AnonymousClass1(cVar);
                            }
                        } else {
                            anonymousClass1 = new AnonymousClass1(cVar);
                        }
                        Object obj2 = anonymousClass1.f22106b;
                        Object objH = b.h();
                        int i11 = anonymousClass1.f22107c;
                        if (i11 == 0) {
                            t0.n(obj2);
                            f fVar = this.f22105b;
                            j jVar = (j) obj;
                            if (jVar instanceof h) {
                                throw ((h) jVar).getReadException();
                            }
                            if (jVar instanceof f) {
                                throw ((f) jVar).getFinalException();
                            }
                            if (!(jVar instanceof b)) {
                                if (jVar instanceof k) {
                                    throw new IllegalStateException("This is a bug in DataStore. Please file a bug at: https://issuetracker.google.com/issues/new?component=907884&template=1466542".toString());
                                }
                                throw new NoWhenBranchMatchedException();
                            }
                            Object objC = ((b) jVar).c();
                            anonymousClass1.f22107c = 1;
                            if (fVar.emit(objC, anonymousClass1) == objH) {
                                return objH;
                            }
                        } else {
                            if (i11 != 1) {
                                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                            }
                            t0.n(obj2);
                        }
                        return b2.f124493a;
                    }
                }

                @Override // kotlinx.coroutines.flow.e
                @e
                public Object a(@dl.d f fVar2, @dl.d c cVar) {
                    Object objA = eVarK0.a(new AnonymousClass2(fVar2), cVar);
                    return objA == b.h() ? objA : b2.f124493a;
                }
            };
            this.f22098b = 1;
            if (g.m0(fVar, eVar, this) == objH) {
                return objH;
            }
        } else {
            if (i10 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            t0.n(obj);
        }
        return b2.f124493a;
    }
}
