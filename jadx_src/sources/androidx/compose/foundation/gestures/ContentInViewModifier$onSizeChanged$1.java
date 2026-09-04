package androidx.compose.foundation.gestures;

import kotlin.Metadata;
import kotlin.b2;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.t0;
import kotlinx.coroutines.d2;
import kotlinx.coroutines.q0;

/* JADX INFO: compiled from: ContentInViewModifier.kt */
/* JADX INFO: loaded from: classes.dex */
@Metadata(bv = {}, d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@"}, d2 = {"Lkotlinx/coroutines/q0;", "Lkotlin/b2;", "<anonymous>"}, k = 3, mv = {1, 7, 1})
@kotlin.coroutines.jvm.internal.d(c = "androidx.compose.foundation.gestures.ContentInViewModifier$onSizeChanged$1", f = "ContentInViewModifier.kt", i = {0}, l = {195}, m = "invokeSuspend", n = {"job"}, s = {"L$0"})
public final class ContentInViewModifier$onSizeChanged$1 extends SuspendLambda implements yh.p<q0, kotlin.coroutines.c<? super b2>, Object> {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    int f5124b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private /* synthetic */ Object f5125c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    final /* synthetic */ ContentInViewModifier f5126d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    final /* synthetic */ b1.i f5127e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    final /* synthetic */ b1.i f5128f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    ContentInViewModifier$onSizeChanged$1(ContentInViewModifier contentInViewModifier, b1.i iVar, b1.i iVar2, kotlin.coroutines.c<? super ContentInViewModifier$onSizeChanged$1> cVar) {
        super(2, cVar);
        this.f5126d = contentInViewModifier;
        this.f5127e = iVar;
        this.f5128f = iVar2;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @dl.d
    public final kotlin.coroutines.c<b2> create(@dl.e Object obj, @dl.d kotlin.coroutines.c<?> cVar) {
        ContentInViewModifier$onSizeChanged$1 contentInViewModifier$onSizeChanged$1 = new ContentInViewModifier$onSizeChanged$1(this.f5126d, this.f5127e, this.f5128f, cVar);
        contentInViewModifier$onSizeChanged$1.f5125c = obj;
        return contentInViewModifier$onSizeChanged$1;
    }

    @Override // yh.p
    @dl.e
    public final Object invoke(@dl.d q0 q0Var, @dl.e kotlin.coroutines.c<? super b2> cVar) {
        return ((ContentInViewModifier$onSizeChanged$1) create(q0Var, cVar)).invokeSuspend(b2.f124493a);
    }

    /* JADX WARN: Code duplicated, block: B:19:0x0052  */
    /* JADX WARN: Code duplicated, block: B:26:0x0070  */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @dl.e
    public final Object invokeSuspend(@dl.d Object obj) throws Throwable {
        d2 d2Var;
        Throwable th2;
        Object objH = kotlin.coroutines.intrinsics.b.h();
        int i10 = this.f5124b;
        if (i10 != 0) {
            if (i10 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            d2Var = (d2) this.f5125c;
            try {
                t0.n(obj);
                if (this.f5126d.focusAnimationJob == d2Var) {
                    this.f5126d.focusedChildBeingAnimated = null;
                    this.f5126d.z(null);
                    this.f5126d.focusAnimationJob = null;
                }
                return b2.f124493a;
            } catch (Throwable th3) {
                th2 = th3;
                if (this.f5126d.focusAnimationJob == d2Var) {
                    this.f5126d.focusedChildBeingAnimated = null;
                    this.f5126d.z(null);
                    this.f5126d.focusAnimationJob = null;
                }
                throw th2;
            }
        }
        t0.n(obj);
        d2 d2VarF = kotlinx.coroutines.k.f((q0) this.f5125c, null, null, new ContentInViewModifier$onSizeChanged$1$job$1(this.f5126d, this.f5127e, this.f5128f, null), 3, null);
        this.f5126d.focusAnimationJob = d2VarF;
        try {
            this.f5125c = d2VarF;
            this.f5124b = 1;
            if (d2VarF.g0(this) == objH) {
                return objH;
            }
            d2Var = d2VarF;
            if (this.f5126d.focusAnimationJob == d2Var) {
                this.f5126d.focusedChildBeingAnimated = null;
                this.f5126d.z(null);
                this.f5126d.focusAnimationJob = null;
            }
            return b2.f124493a;
        } catch (Throwable th4) {
            d2Var = d2VarF;
            th2 = th4;
            if (this.f5126d.focusAnimationJob == d2Var) {
                this.f5126d.focusedChildBeingAnimated = null;
                this.f5126d.z(null);
                this.f5126d.focusAnimationJob = null;
            }
            throw th2;
        }
    }
}
