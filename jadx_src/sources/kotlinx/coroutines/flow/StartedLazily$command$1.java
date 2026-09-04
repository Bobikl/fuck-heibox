package kotlinx.coroutines.flow;

import com.umeng.analytics.pro.ak;
import kotlin.KotlinNothingValueException;
import kotlin.Metadata;
import kotlin.b2;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.internal.Ref;
import kotlin.t0;

/* JADX INFO: compiled from: SharingStarted.kt */
/* JADX INFO: loaded from: classes5.dex */
@Metadata(bv = {}, d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0010\u0003\u001a\u00020\u0002*\b\u0012\u0004\u0012\u00020\u00010\u0000H\u008a@"}, d2 = {"Lkotlinx/coroutines/flow/f;", "Lkotlinx/coroutines/flow/SharingCommand;", "Lkotlin/b2;", "<anonymous>"}, k = 3, mv = {1, 6, 0})
@kotlin.coroutines.jvm.internal.d(c = "kotlinx.coroutines.flow.StartedLazily$command$1", f = "SharingStarted.kt", i = {}, l = {155}, m = "invokeSuspend", n = {}, s = {})
public final class StartedLazily$command$1 extends SuspendLambda implements yh.p<f<? super SharingCommand>, kotlin.coroutines.c<? super b2>, Object> {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    int f129893b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private /* synthetic */ Object f129894c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    final /* synthetic */ u<Integer> f129895d;

    /* JADX INFO: renamed from: kotlinx.coroutines.flow.StartedLazily$command$1$1, reason: invalid class name */
    /* JADX INFO: compiled from: SharingStarted.kt */
    @Metadata(bv = {}, d1 = {"\u0000\u000e\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\u008a@¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"", "count", "Lkotlin/b2;", ak.av, "(ILkotlin/coroutines/c;)Ljava/lang/Object;"}, k = 3, mv = {1, 6, 0})
    public static final class AnonymousClass1<T> implements f {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ Ref.BooleanRef f129896b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ f<SharingCommand> f129897c;

        /* JADX WARN: Multi-variable type inference failed */
        AnonymousClass1(Ref.BooleanRef booleanRef, f<? super SharingCommand> fVar) {
            this.f129896b = booleanRef;
            this.f129897c = fVar;
        }

        /* JADX WARN: Code duplicated, block: B:7:0x0013  */
        @dl.e
        public final Object a(int i10, @dl.d kotlin.coroutines.c<? super b2> cVar) throws Throwable {
            StartedLazily$command$1$1$emit$1 startedLazily$command$1$1$emit$1;
            if (cVar instanceof StartedLazily$command$1$1$emit$1) {
                startedLazily$command$1$1$emit$1 = (StartedLazily$command$1$1$emit$1) cVar;
                int i11 = startedLazily$command$1$1$emit$1.f129900d;
                if ((i11 & Integer.MIN_VALUE) != 0) {
                    startedLazily$command$1$1$emit$1.f129900d = i11 - Integer.MIN_VALUE;
                } else {
                    startedLazily$command$1$1$emit$1 = new StartedLazily$command$1$1$emit$1(this, cVar);
                }
            } else {
                startedLazily$command$1$1$emit$1 = new StartedLazily$command$1$1$emit$1(this, cVar);
            }
            Object obj = startedLazily$command$1$1$emit$1.f129898b;
            Object objH = kotlin.coroutines.intrinsics.b.h();
            int i12 = startedLazily$command$1$1$emit$1.f129900d;
            if (i12 == 0) {
                t0.n(obj);
                if (i10 > 0) {
                    Ref.BooleanRef booleanRef = this.f129896b;
                    if (!booleanRef.f124884b) {
                        booleanRef.f124884b = true;
                        f<SharingCommand> fVar = this.f129897c;
                        SharingCommand sharingCommand = SharingCommand.START;
                        startedLazily$command$1$1$emit$1.f129900d = 1;
                        if (fVar.emit(sharingCommand, startedLazily$command$1$1$emit$1) == objH) {
                            return objH;
                        }
                    }
                }
                return b2.f124493a;
            }
            if (i12 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            t0.n(obj);
            return b2.f124493a;
        }

        @Override // kotlinx.coroutines.flow.f
        public /* bridge */ /* synthetic */ Object emit(Object obj, kotlin.coroutines.c cVar) {
            return a(((Number) obj).intValue(), cVar);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    StartedLazily$command$1(u<Integer> uVar, kotlin.coroutines.c<? super StartedLazily$command$1> cVar) {
        super(2, cVar);
        this.f129895d = uVar;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @dl.d
    public final kotlin.coroutines.c<b2> create(@dl.e Object obj, @dl.d kotlin.coroutines.c<?> cVar) {
        StartedLazily$command$1 startedLazily$command$1 = new StartedLazily$command$1(this.f129895d, cVar);
        startedLazily$command$1.f129894c = obj;
        return startedLazily$command$1;
    }

    @Override // yh.p
    @dl.e
    public final Object invoke(@dl.d f<? super SharingCommand> fVar, @dl.e kotlin.coroutines.c<? super b2> cVar) {
        return ((StartedLazily$command$1) create(fVar, cVar)).invokeSuspend(b2.f124493a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @dl.e
    public final Object invokeSuspend(@dl.d Object obj) throws Throwable {
        Object objH = kotlin.coroutines.intrinsics.b.h();
        int i10 = this.f129893b;
        if (i10 == 0) {
            t0.n(obj);
            f fVar = (f) this.f129894c;
            Ref.BooleanRef booleanRef = new Ref.BooleanRef();
            u<Integer> uVar = this.f129895d;
            AnonymousClass1 anonymousClass1 = new AnonymousClass1(booleanRef, fVar);
            this.f129893b = 1;
            if (uVar.a(anonymousClass1, this) == objH) {
                return objH;
            }
        } else {
            if (i10 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            t0.n(obj);
        }
        throw new KotlinNothingValueException();
    }
}
