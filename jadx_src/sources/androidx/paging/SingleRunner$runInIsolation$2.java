package androidx.paging;

import kotlin.Metadata;
import kotlin.b2;
import kotlin.coroutines.CoroutineContext;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlinx.coroutines.d2;

/* JADX INFO: compiled from: SingleRunner.kt */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(bv = {}, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0004\u001a\u00020\u0001*\u00020\u0000H\u008a@¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lkotlinx/coroutines/q0;", "Lkotlin/b2;", "invoke", "(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;", "<anonymous>"}, k = 3, mv = {1, 4, 2})
@kotlin.coroutines.jvm.internal.d(c = "androidx.paging.SingleRunner$runInIsolation$2", f = "SingleRunner.kt", i = {0, 1}, l = {55, 59, 61, 61}, m = "invokeSuspend", n = {"myJob", "myJob"}, s = {"L$0", "L$0"})
public final class SingleRunner$runInIsolation$2 extends SuspendLambda implements yh.p<kotlinx.coroutines.q0, kotlin.coroutines.c<? super b2>, Object> {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private /* synthetic */ Object f26342b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    int f26343c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    final /* synthetic */ SingleRunner f26344d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    final /* synthetic */ int f26345e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    final /* synthetic */ yh.l f26346f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    SingleRunner$runInIsolation$2(SingleRunner singleRunner, int i10, yh.l lVar, kotlin.coroutines.c cVar) {
        super(2, cVar);
        this.f26344d = singleRunner;
        this.f26345e = i10;
        this.f26346f = lVar;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @dl.d
    public final kotlin.coroutines.c<b2> create(@dl.e Object obj, @dl.d kotlin.coroutines.c<?> completion) {
        kotlin.jvm.internal.f0.p(completion, "completion");
        SingleRunner$runInIsolation$2 singleRunner$runInIsolation$2 = new SingleRunner$runInIsolation$2(this.f26344d, this.f26345e, this.f26346f, completion);
        singleRunner$runInIsolation$2.f26342b = obj;
        return singleRunner$runInIsolation$2;
    }

    @Override // yh.p
    public final Object invoke(kotlinx.coroutines.q0 q0Var, kotlin.coroutines.c<? super b2> cVar) {
        return ((SingleRunner$runInIsolation$2) create(q0Var, cVar)).invokeSuspend(b2.f124493a);
    }

    /* JADX WARN: Code duplicated, block: B:31:0x008d A[RETURN] */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v0, types: [int] */
    /* JADX WARN: Type inference failed for: r1v1, types: [kotlinx.coroutines.d2] */
    /* JADX WARN: Type inference failed for: r1v14 */
    /* JADX WARN: Type inference failed for: r1v15 */
    /* JADX WARN: Type inference failed for: r1v9, types: [kotlinx.coroutines.d2] */
    /* JADX WARN: Type inference failed for: r3v2, types: [androidx.paging.SingleRunner$Holder] */
    /* JADX WARN: Type inference failed for: r9v15, types: [androidx.paging.SingleRunner$Holder] */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @dl.e
    public final Object invokeSuspend(@dl.d Object obj) throws Throwable {
        d2 d2Var;
        ?? r10;
        Object objH = kotlin.coroutines.intrinsics.b.h();
        ?? r11 = this.f26343c;
        int i10 = 4;
        try {
            if (r11 != 0) {
                if (r11 == 1) {
                    d2 d2Var2 = (d2) this.f26342b;
                    kotlin.t0.n(obj);
                    d2Var = d2Var2;
                } else if (r11 == 2) {
                    d2 d2Var3 = (d2) this.f26342b;
                    kotlin.t0.n(obj);
                    r11 = d2Var3;
                    r11 = d2Var;
                    r10 = this.f26344d.holder;
                    i10 = 0;
                    this.f26342b = null;
                    this.f26343c = 3;
                    if (r10.a(r11, this) == objH) {
                        return objH;
                    }
                } else {
                    if (r11 != 3) {
                        if (r11 != 4) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        Throwable th2 = (Throwable) this.f26342b;
                        kotlin.t0.n(obj);
                        throw th2;
                    }
                    kotlin.t0.n(obj);
                }
                return b2.f124493a;
            }
            kotlin.t0.n(obj);
            CoroutineContext.a aVarF = ((kotlinx.coroutines.q0) this.f26342b).getCoroutineContext().f(d2.INSTANCE);
            if (aVarF == null) {
                throw new IllegalStateException("Internal error. coroutineScope should've created a job.".toString());
            }
            d2 d2Var4 = (d2) aVarF;
            SingleRunner.Holder holder = this.f26344d.holder;
            int i11 = this.f26345e;
            this.f26342b = d2Var4;
            this.f26343c = 1;
            Object objB = holder.b(i11, d2Var4, this);
            if (objB == objH) {
                return objH;
            }
            d2Var = d2Var4;
            obj = objB;
            if (((Boolean) obj).booleanValue()) {
                yh.l lVar = this.f26346f;
                this.f26342b = d2Var;
                this.f26343c = 2;
                if (lVar.invoke(this) == objH) {
                    r11 = d2Var;
                    return objH;
                }
                r11 = d2Var;
                r10 = this.f26344d.holder;
                i10 = 0;
                this.f26342b = null;
                this.f26343c = 3;
                if (r10.a(r11, this) == objH) {
                    return objH;
                }
            }
            return b2.f124493a;
        } catch (Throwable th3) {
            ?? r12 = this.f26344d.holder;
            this.f26342b = th3;
            this.f26343c = i10;
            if (r12.a(r11, this) == objH) {
                return objH;
            }
            throw th3;
        }
    }
}
