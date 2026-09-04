package androidx.compose.foundation.relocation;

import androidx.compose.ui.layout.q;
import b1.i;
import kotlin.Metadata;
import kotlin.b2;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.t0;
import kotlinx.coroutines.k;
import kotlinx.coroutines.q0;
import yh.p;

/* JADX INFO: compiled from: BringIntoViewResponder.kt */
/* JADX INFO: loaded from: classes.dex */
@Metadata(bv = {}, d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@"}, d2 = {"Lkotlinx/coroutines/q0;", "Lkotlin/b2;", "<anonymous>"}, k = 3, mv = {1, 7, 1})
@kotlin.coroutines.jvm.internal.d(c = "androidx.compose.foundation.relocation.BringIntoViewResponderModifier$dispatchRequest$2", f = "BringIntoViewResponder.kt", i = {}, l = {bb.c.b.f31052y2}, m = "invokeSuspend", n = {}, s = {})
public final class BringIntoViewResponderModifier$dispatchRequest$2 extends SuspendLambda implements p<q0, kotlin.coroutines.c<? super b2>, Object> {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    int f7484b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private /* synthetic */ Object f7485c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    final /* synthetic */ BringIntoViewResponderModifier f7486d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    final /* synthetic */ q f7487e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    final /* synthetic */ i f7488f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    final /* synthetic */ i f7489g;

    /* JADX INFO: renamed from: androidx.compose.foundation.relocation.BringIntoViewResponderModifier$dispatchRequest$2$1, reason: invalid class name */
    /* JADX INFO: compiled from: BringIntoViewResponder.kt */
    @Metadata(bv = {}, d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@"}, d2 = {"Lkotlinx/coroutines/q0;", "Lkotlin/b2;", "<anonymous>"}, k = 3, mv = {1, 7, 1})
    @kotlin.coroutines.jvm.internal.d(c = "androidx.compose.foundation.relocation.BringIntoViewResponderModifier$dispatchRequest$2$1", f = "BringIntoViewResponder.kt", i = {}, l = {bb.c.b.f30920s2}, m = "invokeSuspend", n = {}, s = {})
    public static final class AnonymousClass1 extends SuspendLambda implements p<q0, kotlin.coroutines.c<? super b2>, Object> {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        int f7490b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ BringIntoViewResponderModifier f7491c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        final /* synthetic */ i f7492d;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        AnonymousClass1(BringIntoViewResponderModifier bringIntoViewResponderModifier, i iVar, kotlin.coroutines.c<? super AnonymousClass1> cVar) {
            super(2, cVar);
            this.f7491c = bringIntoViewResponderModifier;
            this.f7492d = iVar;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @dl.d
        public final kotlin.coroutines.c<b2> create(@dl.e Object obj, @dl.d kotlin.coroutines.c<?> cVar) {
            return new AnonymousClass1(this.f7491c, this.f7492d, cVar);
        }

        @Override // yh.p
        @dl.e
        public final Object invoke(@dl.d q0 q0Var, @dl.e kotlin.coroutines.c<? super b2> cVar) {
            return ((AnonymousClass1) create(q0Var, cVar)).invokeSuspend(b2.f124493a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @dl.e
        public final Object invokeSuspend(@dl.d Object obj) throws Throwable {
            Object objH = kotlin.coroutines.intrinsics.b.h();
            int i10 = this.f7490b;
            if (i10 == 0) {
                t0.n(obj);
                f fVarQ = this.f7491c.q();
                final i iVar = this.f7492d;
                yh.a<i> aVar = new yh.a<i>() { // from class: androidx.compose.foundation.relocation.BringIntoViewResponderModifier.dispatchRequest.2.1.1
                    {
                        super(0);
                    }

                    @Override // yh.a
                    @dl.e
                    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
                    public final i invoke() {
                        return iVar;
                    }
                };
                this.f7490b = 1;
                if (fVarQ.c(aVar, this) == objH) {
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

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    BringIntoViewResponderModifier$dispatchRequest$2(BringIntoViewResponderModifier bringIntoViewResponderModifier, q qVar, i iVar, i iVar2, kotlin.coroutines.c<? super BringIntoViewResponderModifier$dispatchRequest$2> cVar) {
        super(2, cVar);
        this.f7486d = bringIntoViewResponderModifier;
        this.f7487e = qVar;
        this.f7488f = iVar;
        this.f7489g = iVar2;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @dl.d
    public final kotlin.coroutines.c<b2> create(@dl.e Object obj, @dl.d kotlin.coroutines.c<?> cVar) {
        BringIntoViewResponderModifier$dispatchRequest$2 bringIntoViewResponderModifier$dispatchRequest$2 = new BringIntoViewResponderModifier$dispatchRequest$2(this.f7486d, this.f7487e, this.f7488f, this.f7489g, cVar);
        bringIntoViewResponderModifier$dispatchRequest$2.f7485c = obj;
        return bringIntoViewResponderModifier$dispatchRequest$2;
    }

    @Override // yh.p
    @dl.e
    public final Object invoke(@dl.d q0 q0Var, @dl.e kotlin.coroutines.c<? super b2> cVar) {
        return ((BringIntoViewResponderModifier$dispatchRequest$2) create(q0Var, cVar)).invokeSuspend(b2.f124493a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @dl.e
    public final Object invokeSuspend(@dl.d Object obj) throws Throwable {
        Object objH = kotlin.coroutines.intrinsics.b.h();
        int i10 = this.f7484b;
        if (i10 == 0) {
            t0.n(obj);
            k.f((q0) this.f7485c, null, null, new AnonymousClass1(this.f7486d, this.f7488f, null), 3, null);
            c cVarD = this.f7486d.d();
            q qVar = this.f7487e;
            final i iVar = this.f7489g;
            yh.a<i> aVar = new yh.a<i>() { // from class: androidx.compose.foundation.relocation.BringIntoViewResponderModifier$dispatchRequest$2.2
                {
                    super(0);
                }

                @Override // yh.a
                @dl.e
                /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
                public final i invoke() {
                    return iVar;
                }
            };
            this.f7484b = 1;
            if (cVarD.a(qVar, aVar, this) == objH) {
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
