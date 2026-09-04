package androidx.compose.foundation.relocation;

import androidx.compose.ui.layout.q;
import b1.i;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.b2;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.t0;
import kotlinx.coroutines.d2;
import kotlinx.coroutines.g2;
import kotlinx.coroutines.q0;
import yh.p;

/* JADX INFO: compiled from: BringIntoViewResponder.kt */
/* JADX INFO: loaded from: classes.dex */
@Metadata(bv = {}, d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@"}, d2 = {"Lkotlinx/coroutines/q0;", "Lkotlin/b2;", "<anonymous>"}, k = 3, mv = {1, 7, 1})
@kotlin.coroutines.jvm.internal.d(c = "androidx.compose.foundation.relocation.BringIntoViewResponderModifier$bringChildIntoView$2", f = "BringIntoViewResponder.kt", i = {0, 1, 1, 1, 2}, l = {224, bb.c.b.f31073z1, 240}, m = "invokeSuspend", n = {"thisRequest", "layoutCoordinates", "thisRequest", "previousRequest", "thisRequest"}, s = {"L$0", "L$0", "L$1", "L$2", "L$0"})
public final class BringIntoViewResponderModifier$bringChildIntoView$2 extends SuspendLambda implements p<q0, kotlin.coroutines.c<? super b2>, Object> {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    Object f7477b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    Object f7478c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    int f7479d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private /* synthetic */ Object f7480e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    final /* synthetic */ BringIntoViewResponderModifier f7481f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    final /* synthetic */ q f7482g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    final /* synthetic */ yh.a<i> f7483h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    BringIntoViewResponderModifier$bringChildIntoView$2(BringIntoViewResponderModifier bringIntoViewResponderModifier, q qVar, yh.a<i> aVar, kotlin.coroutines.c<? super BringIntoViewResponderModifier$bringChildIntoView$2> cVar) {
        super(2, cVar);
        this.f7481f = bringIntoViewResponderModifier;
        this.f7482g = qVar;
        this.f7483h = aVar;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @dl.d
    public final kotlin.coroutines.c<b2> create(@dl.e Object obj, @dl.d kotlin.coroutines.c<?> cVar) {
        BringIntoViewResponderModifier$bringChildIntoView$2 bringIntoViewResponderModifier$bringChildIntoView$2 = new BringIntoViewResponderModifier$bringChildIntoView$2(this.f7481f, this.f7482g, this.f7483h, cVar);
        bringIntoViewResponderModifier$bringChildIntoView$2.f7480e = obj;
        return bringIntoViewResponderModifier$bringChildIntoView$2;
    }

    @Override // yh.p
    @dl.e
    public final Object invoke(@dl.d q0 q0Var, @dl.e kotlin.coroutines.c<? super b2> cVar) {
        return ((BringIntoViewResponderModifier$bringChildIntoView$2) create(q0Var, cVar)).invokeSuspend(b2.f124493a);
    }

    /* JADX WARN: Code duplicated, block: B:45:0x00bb A[Catch: all -> 0x0034, TRY_LEAVE, TryCatch #2 {all -> 0x0034, blocks: (B:13:0x002f, B:43:0x00b3, B:45:0x00bb), top: B:81:0x002f }] */
    /* JADX WARN: Code duplicated, block: B:47:0x00cb A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:48:0x00cc  */
    /* JADX WARN: Code duplicated, block: B:65:0x010f  */
    /* JADX WARN: Code duplicated, block: B:68:0x011c  */
    /* JADX WARN: Code duplicated, block: B:74:0x0132  */
    /* JADX WARN: Code duplicated, block: B:77:0x013f  */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @dl.e
    public final Object invokeSuspend(@dl.d Object obj) throws Throwable {
        q qVar;
        Pair pair;
        Pair pair2;
        Pair pair3;
        BringIntoViewResponderModifier bringIntoViewResponderModifier;
        Pair pair4;
        Object objH = kotlin.coroutines.intrinsics.b.h();
        int i10 = this.f7479d;
        try {
            if (i10 == 0) {
                t0.n(obj);
                q0 q0Var = (q0) this.f7480e;
                q qVarC = this.f7481f.c();
                if (qVarC != null && this.f7482g.p()) {
                    q qVar2 = this.f7482g;
                    i iVarInvoke = this.f7483h.invoke();
                    if (iVarInvoke == null) {
                        return b2.f124493a;
                    }
                    i iVarE = BringIntoViewResponderKt.e(qVarC, qVar2, iVarInvoke);
                    Pair pair5 = new Pair(iVarE, g2.B(q0Var.getCoroutineContext()));
                    Pair pair6 = this.f7481f.newestReceivedRequest;
                    this.f7481f.newestReceivedRequest = pair5;
                    if (pair6 != null) {
                        try {
                            if (BringIntoViewResponderKt.d((i) pair6.e(), iVarE)) {
                                d2 d2Var = (d2) pair6.f();
                                this.f7480e = qVarC;
                                this.f7477b = pair5;
                                this.f7478c = pair6;
                                this.f7479d = 2;
                                if (d2Var.g0(this) == objH) {
                                    return objH;
                                }
                                qVar = qVarC;
                                pair = pair5;
                                pair2 = pair6;
                                if (this.f7481f.newestDispatchedRequest == pair2) {
                                    bringIntoViewResponderModifier = this.f7481f;
                                    this.f7480e = pair;
                                    this.f7477b = null;
                                    this.f7478c = null;
                                    this.f7479d = 3;
                                    if (bringIntoViewResponderModifier.o(pair, qVar, this) == objH) {
                                        return objH;
                                    }
                                    pair4 = pair;
                                    pair = pair4;
                                }
                            }
                        } catch (Throwable th2) {
                            th = th2;
                            objH = pair5;
                            if (this.f7481f.newestDispatchedRequest == this.f7481f.newestReceivedRequest) {
                                this.f7481f.newestDispatchedRequest = null;
                            }
                            if (this.f7481f.newestReceivedRequest == objH) {
                                this.f7481f.newestReceivedRequest = null;
                            }
                            throw th;
                        }
                    }
                    BringIntoViewResponderModifier bringIntoViewResponderModifier2 = this.f7481f;
                    this.f7480e = pair5;
                    this.f7479d = 1;
                    if (bringIntoViewResponderModifier2.o(pair5, qVarC, this) == objH) {
                        return objH;
                    }
                    pair3 = pair5;
                    b2 b2Var = b2.f124493a;
                    if (this.f7481f.newestDispatchedRequest == this.f7481f.newestReceivedRequest) {
                        this.f7481f.newestDispatchedRequest = null;
                    }
                    if (this.f7481f.newestReceivedRequest == pair3) {
                        this.f7481f.newestReceivedRequest = null;
                    }
                    return b2Var;
                }
                return b2.f124493a;
            }
            if (i10 == 1) {
                pair3 = (Pair) this.f7480e;
                t0.n(obj);
                b2 b2Var2 = b2.f124493a;
                if (this.f7481f.newestDispatchedRequest == this.f7481f.newestReceivedRequest) {
                    this.f7481f.newestDispatchedRequest = null;
                }
                if (this.f7481f.newestReceivedRequest == pair3) {
                    this.f7481f.newestReceivedRequest = null;
                }
                return b2Var2;
            }
            if (i10 == 2) {
                pair2 = (Pair) this.f7478c;
                pair = (Pair) this.f7477b;
                qVar = (q) this.f7480e;
                try {
                    t0.n(obj);
                    if (this.f7481f.newestDispatchedRequest == pair2) {
                        bringIntoViewResponderModifier = this.f7481f;
                        this.f7480e = pair;
                        this.f7477b = null;
                        this.f7478c = null;
                        this.f7479d = 3;
                        if (bringIntoViewResponderModifier.o(pair, qVar, this) == objH) {
                            return objH;
                        }
                        pair4 = pair;
                    }
                } catch (Throwable th3) {
                    th = th3;
                    objH = pair;
                    if (this.f7481f.newestDispatchedRequest == this.f7481f.newestReceivedRequest) {
                        this.f7481f.newestDispatchedRequest = null;
                    }
                    if (this.f7481f.newestReceivedRequest == objH) {
                        this.f7481f.newestReceivedRequest = null;
                    }
                    throw th;
                }
            } else {
                if (i10 != 3) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                pair4 = (Pair) this.f7480e;
                t0.n(obj);
            }
            pair = pair4;
            if (this.f7481f.newestDispatchedRequest == this.f7481f.newestReceivedRequest) {
                this.f7481f.newestDispatchedRequest = null;
            }
            if (this.f7481f.newestReceivedRequest == pair) {
                this.f7481f.newestReceivedRequest = null;
            }
            return b2.f124493a;
        } catch (Throwable th4) {
            th = th4;
        }
    }
}
