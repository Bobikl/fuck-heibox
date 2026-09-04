package androidx.compose.ui.input.nestedscroll;

import androidx.compose.runtime.internal.o;
import b1.f;
import com.ss.bytertc.base.media.screen.RXScreenCaptureService;
import com.umeng.analytics.pro.ak;
import dl.d;
import dl.e;
import kotlin.Metadata;
import kotlin.jvm.internal.f0;
import kotlin.t0;
import kotlinx.coroutines.q0;
import s1.x;

/* JADX INFO: compiled from: NestedScrollModifier.kt */
/* JADX INFO: loaded from: classes.dex */
@o(parameters = 0)
@Metadata(bv = {}, d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u000b\b\u0007\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b'\u0010(J#\u0010\u0006\u001a\u00020\u00022\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0004ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b\u0006\u0010\u0007J+\u0010\t\u001a\u00020\u00022\u0006\u0010\b\u001a\u00020\u00022\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0004ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b\t\u0010\nJ!\u0010\f\u001a\u00020\u000b2\u0006\u0010\u0003\u001a\u00020\u000bH\u0086@ø\u0001\u0000ø\u0001\u0001ø\u0001\u0001¢\u0006\u0004\b\f\u0010\rJ)\u0010\u000e\u001a\u00020\u000b2\u0006\u0010\b\u001a\u00020\u000b2\u0006\u0010\u0003\u001a\u00020\u000bH\u0086@ø\u0001\u0000ø\u0001\u0001ø\u0001\u0001¢\u0006\u0004\b\u000e\u0010\u000fR$\u0010\u0016\u001a\u0004\u0018\u00010\u00108\u0000@\u0000X\u0080\u000e¢\u0006\u0012\n\u0004\b\t\u0010\u0011\u001a\u0004\b\u0012\u0010\u0013\"\u0004\b\u0014\u0010\u0015R$\u0010\u001d\u001a\u0004\u0018\u00010\u00178\u0000@\u0000X\u0080\u000e¢\u0006\u0012\n\u0004\b\f\u0010\u0018\u001a\u0004\b\u0019\u0010\u001a\"\u0004\b\u001b\u0010\u001cR*\u0010\u001f\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00100\u001e8\u0000@\u0000X\u0080\u000e¢\u0006\u0012\n\u0004\b\u001f\u0010 \u001a\u0004\b!\u0010\"\"\u0004\b#\u0010$R\u0011\u0010&\u001a\u00020\u00108F¢\u0006\u0006\u001a\u0004\b%\u0010\u0013\u0082\u0002\u000b\n\u0005\b¡\u001e0\u0001\n\u0002\b\u0019¨\u0006)"}, d2 = {"Landroidx/compose/ui/input/nestedscroll/NestedScrollDispatcher;", "", "Lb1/f;", "available", "Landroidx/compose/ui/input/nestedscroll/c;", "source", "d", "(JI)J", "consumed", "b", "(JJI)J", "Ls1/x;", ak.aF, "(JLkotlin/coroutines/c;)Ljava/lang/Object;", ak.av, "(JJLkotlin/coroutines/c;)Ljava/lang/Object;", "Lkotlinx/coroutines/q0;", "Lkotlinx/coroutines/q0;", "g", "()Lkotlinx/coroutines/q0;", "j", "(Lkotlinx/coroutines/q0;)V", "originNestedScrollScope", "Landroidx/compose/ui/input/nestedscroll/b;", "Landroidx/compose/ui/input/nestedscroll/b;", RXScreenCaptureService.KEY_HEIGHT, "()Landroidx/compose/ui/input/nestedscroll/b;", "k", "(Landroidx/compose/ui/input/nestedscroll/b;)V", "parent", "Lkotlin/Function0;", "calculateNestedScrollScope", "Lyh/a;", "e", "()Lyh/a;", "i", "(Lyh/a;)V", "f", "coroutineScope", "<init>", "()V", "ui_release"}, k = 1, mv = {1, 7, 1})
public final class NestedScrollDispatcher {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final int f14623d = 8;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @d
    private yh.a<? extends q0> f14624a = new yh.a<q0>() { // from class: androidx.compose.ui.input.nestedscroll.NestedScrollDispatcher$calculateNestedScrollScope$1
        {
            super(0);
        }

        @Override // yh.a
        @e
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final q0 invoke() {
            return this.f14627b.getOriginNestedScrollScope();
        }
    };

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    @e
    private q0 originNestedScrollScope;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    @e
    private b parent;

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    @e
    public final Object a(long j10, long j11, @d kotlin.coroutines.c<? super x> cVar) {
        NestedScrollDispatcher$dispatchPostFling$1 nestedScrollDispatcher$dispatchPostFling$1;
        long jA;
        if (cVar instanceof NestedScrollDispatcher$dispatchPostFling$1) {
            nestedScrollDispatcher$dispatchPostFling$1 = (NestedScrollDispatcher$dispatchPostFling$1) cVar;
            int i10 = nestedScrollDispatcher$dispatchPostFling$1.f14630d;
            if ((i10 & Integer.MIN_VALUE) != 0) {
                nestedScrollDispatcher$dispatchPostFling$1.f14630d = i10 - Integer.MIN_VALUE;
            } else {
                nestedScrollDispatcher$dispatchPostFling$1 = new NestedScrollDispatcher$dispatchPostFling$1(this, cVar);
            }
        } else {
            nestedScrollDispatcher$dispatchPostFling$1 = new NestedScrollDispatcher$dispatchPostFling$1(this, cVar);
        }
        NestedScrollDispatcher$dispatchPostFling$1 nestedScrollDispatcher$dispatchPostFling$2 = nestedScrollDispatcher$dispatchPostFling$1;
        Object objA = nestedScrollDispatcher$dispatchPostFling$2.f14628b;
        Object objH = kotlin.coroutines.intrinsics.b.h();
        int i11 = nestedScrollDispatcher$dispatchPostFling$2.f14630d;
        if (i11 == 0) {
            t0.n(objA);
            b bVar = this.parent;
            if (bVar != null) {
                nestedScrollDispatcher$dispatchPostFling$2.f14630d = 1;
                objA = bVar.a(j10, j11, nestedScrollDispatcher$dispatchPostFling$2);
                if (objA == objH) {
                    return objH;
                }
            } else {
                jA = x.f139262b.a();
            }
            return x.b(jA);
        }
        if (i11 != 1) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        t0.n(objA);
        jA = ((x) objA).getF139264a();
        return x.b(jA);
    }

    public final long b(long consumed, long available, int source) {
        b bVar = this.parent;
        return bVar != null ? bVar.c(consumed, available, source) : f.f30364b.e();
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    @e
    public final Object c(long j10, @d kotlin.coroutines.c<? super x> cVar) {
        NestedScrollDispatcher$dispatchPreFling$1 nestedScrollDispatcher$dispatchPreFling$1;
        long jA;
        if (cVar instanceof NestedScrollDispatcher$dispatchPreFling$1) {
            nestedScrollDispatcher$dispatchPreFling$1 = (NestedScrollDispatcher$dispatchPreFling$1) cVar;
            int i10 = nestedScrollDispatcher$dispatchPreFling$1.f14633d;
            if ((i10 & Integer.MIN_VALUE) != 0) {
                nestedScrollDispatcher$dispatchPreFling$1.f14633d = i10 - Integer.MIN_VALUE;
            } else {
                nestedScrollDispatcher$dispatchPreFling$1 = new NestedScrollDispatcher$dispatchPreFling$1(this, cVar);
            }
        } else {
            nestedScrollDispatcher$dispatchPreFling$1 = new NestedScrollDispatcher$dispatchPreFling$1(this, cVar);
        }
        Object objD = nestedScrollDispatcher$dispatchPreFling$1.f14631b;
        Object objH = kotlin.coroutines.intrinsics.b.h();
        int i11 = nestedScrollDispatcher$dispatchPreFling$1.f14633d;
        if (i11 == 0) {
            t0.n(objD);
            b bVar = this.parent;
            if (bVar != null) {
                nestedScrollDispatcher$dispatchPreFling$1.f14633d = 1;
                objD = bVar.d(j10, nestedScrollDispatcher$dispatchPreFling$1);
                if (objD == objH) {
                    return objH;
                }
            } else {
                jA = x.f139262b.a();
            }
            return x.b(jA);
        }
        if (i11 != 1) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        t0.n(objD);
        jA = ((x) objD).getF139264a();
        return x.b(jA);
    }

    public final long d(long available, int source) {
        b bVar = this.parent;
        return bVar != null ? bVar.e(available, source) : f.f30364b.e();
    }

    @d
    public final yh.a<q0> e() {
        return this.f14624a;
    }

    @d
    public final q0 f() {
        q0 q0VarInvoke = this.f14624a.invoke();
        if (q0VarInvoke != null) {
            return q0VarInvoke;
        }
        throw new IllegalStateException("in order to access nested coroutine scope you need to attach dispatcher to the `Modifier.nestedScroll` first.");
    }

    @e
    /* JADX INFO: renamed from: g, reason: from getter */
    public final q0 getOriginNestedScrollScope() {
        return this.originNestedScrollScope;
    }

    @e
    /* JADX INFO: renamed from: h, reason: from getter */
    public final b getParent() {
        return this.parent;
    }

    public final void i(@d yh.a<? extends q0> aVar) {
        f0.p(aVar, "<set-?>");
        this.f14624a = aVar;
    }

    public final void j(@e q0 q0Var) {
        this.originNestedScrollScope = q0Var;
    }

    public final void k(@e b bVar) {
        this.parent = bVar;
    }
}
