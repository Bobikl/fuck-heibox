package androidx.compose.ui.input.nestedscroll;

import androidx.compose.runtime.a1;
import androidx.compose.runtime.h2;
import androidx.compose.ui.modifier.e;
import androidx.compose.ui.modifier.m;
import androidx.compose.ui.modifier.p;
import androidx.compose.ui.n;
import androidx.compose.ui.o;
import com.alipay.zoloz.android.phone.mrpc.core.f;
import com.umeng.analytics.pro.ak;
import dl.d;
import kotlin.Metadata;
import kotlin.jvm.internal.f0;
import kotlin.t0;
import kotlinx.coroutines.q0;
import s1.x;
import yh.l;

/* JADX INFO: compiled from: NestedScrollModifierLocal.kt */
/* JADX INFO: loaded from: classes.dex */
@Metadata(bv = {}, d1 = {"\u0000J\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0010\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\b\b\u0000\u0018\u00002\u00020\u00012\n\u0012\u0006\u0012\u0004\u0018\u00010\u00000\u00022\u00020\u0003B\u0017\u0012\u0006\u0010\u001b\u001a\u00020\u0016\u0012\u0006\u0010\u001f\u001a\u00020\u0003¢\u0006\u0004\b1\u00102J\u0010\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0016J%\u0010\f\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\b2\u0006\u0010\u000b\u001a\u00020\nH\u0016ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b\f\u0010\rJ-\u0010\u000f\u001a\u00020\b2\u0006\u0010\u000e\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\b2\u0006\u0010\u000b\u001a\u00020\nH\u0016ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b\u000f\u0010\u0010J!\u0010\u0012\u001a\u00020\u00112\u0006\u0010\t\u001a\u00020\u0011H\u0096@ø\u0001\u0000ø\u0001\u0001ø\u0001\u0001¢\u0006\u0004\b\u0012\u0010\u0013J)\u0010\u0014\u001a\u00020\u00112\u0006\u0010\u000e\u001a\u00020\u00112\u0006\u0010\t\u001a\u00020\u0011H\u0096@ø\u0001\u0000ø\u0001\u0001ø\u0001\u0001¢\u0006\u0004\b\u0014\u0010\u0015R\u0017\u0010\u001b\u001a\u00020\u00168\u0006¢\u0006\f\n\u0004\b\u0017\u0010\u0018\u001a\u0004\b\u0019\u0010\u001aR\u0017\u0010\u001f\u001a\u00020\u00038\u0006¢\u0006\f\n\u0004\b\u000f\u0010\u001c\u001a\u0004\b\u001d\u0010\u001eR/\u0010&\u001a\u0004\u0018\u00010\u00002\b\u0010 \u001a\u0004\u0018\u00010\u00008B@BX\u0082\u008e\u0002¢\u0006\u0012\n\u0004\b\u0012\u0010!\u001a\u0004\b\"\u0010#\"\u0004\b$\u0010%R\u0014\u0010*\u001a\u00020'8BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b(\u0010)R\u001c\u0010.\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00000+8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b,\u0010-R\u0014\u00100\u001a\u00020\u00008VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b/\u0010#\u0082\u0002\u000b\n\u0005\b¡\u001e0\u0001\n\u0002\b\u0019¨\u00063"}, d2 = {"Landroidx/compose/ui/input/nestedscroll/NestedScrollModifierLocal;", "Landroidx/compose/ui/modifier/e;", "Landroidx/compose/ui/modifier/m;", "Landroidx/compose/ui/input/nestedscroll/b;", "Landroidx/compose/ui/modifier/n;", "scope", "Lkotlin/b2;", "w1", "Lb1/f;", "available", "Landroidx/compose/ui/input/nestedscroll/c;", "source", "e", "(JI)J", "consumed", ak.aF, "(JJI)J", "Ls1/x;", "d", "(JLkotlin/coroutines/c;)Ljava/lang/Object;", ak.av, "(JJLkotlin/coroutines/c;)Ljava/lang/Object;", "Landroidx/compose/ui/input/nestedscroll/NestedScrollDispatcher;", "b", "Landroidx/compose/ui/input/nestedscroll/NestedScrollDispatcher;", "m", "()Landroidx/compose/ui/input/nestedscroll/NestedScrollDispatcher;", "dispatcher", "Landroidx/compose/ui/input/nestedscroll/b;", "g", "()Landroidx/compose/ui/input/nestedscroll/b;", f.f39665q, "<set-?>", "Landroidx/compose/runtime/a1;", "o", "()Landroidx/compose/ui/input/nestedscroll/NestedScrollModifierLocal;", "r", "(Landroidx/compose/ui/input/nestedscroll/NestedScrollModifierLocal;)V", "parent", "Lkotlinx/coroutines/q0;", "n", "()Lkotlinx/coroutines/q0;", "nestedCoroutineScope", "Landroidx/compose/ui/modifier/p;", "getKey", "()Landroidx/compose/ui/modifier/p;", "key", "q", "value", "<init>", "(Landroidx/compose/ui/input/nestedscroll/NestedScrollDispatcher;Landroidx/compose/ui/input/nestedscroll/b;)V", "ui_release"}, k = 1, mv = {1, 7, 1})
public final class NestedScrollModifierLocal implements e, m<NestedScrollModifierLocal>, b {

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    @d
    private final NestedScrollDispatcher dispatcher;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    @d
    private final b connection;

    /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata */
    @d
    private final a1 parent;

    public NestedScrollModifierLocal(@d NestedScrollDispatcher dispatcher, @d b connection) {
        f0.p(dispatcher, "dispatcher");
        f0.p(connection, "connection");
        this.dispatcher = dispatcher;
        this.connection = connection;
        dispatcher.i(new yh.a<q0>() { // from class: androidx.compose.ui.input.nestedscroll.NestedScrollModifierLocal.1
            {
                super(0);
            }

            @Override // yh.a
            @d
            /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
            public final q0 invoke() {
                return NestedScrollModifierLocal.this.n();
            }
        });
        this.parent = h2.g(null, null, 2, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final q0 n() {
        q0 originNestedScrollScope;
        NestedScrollModifierLocal nestedScrollModifierLocalO = o();
        if ((nestedScrollModifierLocalO == null || (originNestedScrollScope = nestedScrollModifierLocalO.n()) == null) && (originNestedScrollScope = this.dispatcher.getOriginNestedScrollScope()) == null) {
            throw new IllegalStateException("in order to access nested coroutine scope you need to attach dispatcher to the `Modifier.nestedScroll` first.");
        }
        return originNestedScrollScope;
    }

    /* JADX WARN: Multi-variable type inference failed */
    private final NestedScrollModifierLocal o() {
        return (NestedScrollModifierLocal) this.parent.getValue();
    }

    private final void r(NestedScrollModifierLocal nestedScrollModifierLocal) {
        this.parent.setValue(nestedScrollModifierLocal);
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0016  */
    @Override // androidx.compose.ui.input.nestedscroll.b
    @dl.e
    public Object a(long j10, long j11, @d kotlin.coroutines.c<? super x> cVar) throws Throwable {
        NestedScrollModifierLocal$onPostFling$1 nestedScrollModifierLocal$onPostFling$1;
        long j12;
        long j13;
        NestedScrollModifierLocal nestedScrollModifierLocal;
        long j14;
        long jA;
        long j15;
        if (cVar instanceof NestedScrollModifierLocal$onPostFling$1) {
            nestedScrollModifierLocal$onPostFling$1 = (NestedScrollModifierLocal$onPostFling$1) cVar;
            int i10 = nestedScrollModifierLocal$onPostFling$1.f14647g;
            if ((i10 & Integer.MIN_VALUE) != 0) {
                nestedScrollModifierLocal$onPostFling$1.f14647g = i10 - Integer.MIN_VALUE;
            } else {
                nestedScrollModifierLocal$onPostFling$1 = new NestedScrollModifierLocal$onPostFling$1(this, cVar);
            }
        } else {
            nestedScrollModifierLocal$onPostFling$1 = new NestedScrollModifierLocal$onPostFling$1(this, cVar);
        }
        Object objA = nestedScrollModifierLocal$onPostFling$1.f14645e;
        Object objH = kotlin.coroutines.intrinsics.b.h();
        int i11 = nestedScrollModifierLocal$onPostFling$1.f14647g;
        if (i11 != 0) {
            if (i11 == 1) {
                long j16 = nestedScrollModifierLocal$onPostFling$1.f14644d;
                long j17 = nestedScrollModifierLocal$onPostFling$1.f14643c;
                nestedScrollModifierLocal = (NestedScrollModifierLocal) nestedScrollModifierLocal$onPostFling$1.f14642b;
                t0.n(objA);
                j13 = j16;
                j12 = j17;
            } else {
                if (i11 != 2) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                j15 = nestedScrollModifierLocal$onPostFling$1.f14643c;
                t0.n(objA);
            }
            jA = ((x) objA).getF139264a();
            j14 = j15;
            return x.b(x.q(j14, jA));
        }
        t0.n(objA);
        b bVar = this.connection;
        nestedScrollModifierLocal$onPostFling$1.f14642b = this;
        j12 = j10;
        nestedScrollModifierLocal$onPostFling$1.f14643c = j12;
        j13 = j11;
        nestedScrollModifierLocal$onPostFling$1.f14644d = j13;
        nestedScrollModifierLocal$onPostFling$1.f14647g = 1;
        objA = bVar.a(j10, j11, nestedScrollModifierLocal$onPostFling$1);
        if (objA == objH) {
            return objH;
        }
        nestedScrollModifierLocal = this;
        long f139264a = ((x) objA).getF139264a();
        NestedScrollModifierLocal nestedScrollModifierLocalO = nestedScrollModifierLocal.o();
        if (nestedScrollModifierLocalO != null) {
            long jQ = x.q(j12, f139264a);
            long jP = x.p(j13, f139264a);
            nestedScrollModifierLocal$onPostFling$1.f14642b = null;
            nestedScrollModifierLocal$onPostFling$1.f14643c = f139264a;
            nestedScrollModifierLocal$onPostFling$1.f14647g = 2;
            objA = nestedScrollModifierLocalO.a(jQ, jP, nestedScrollModifierLocal$onPostFling$1);
            if (objA == objH) {
                return objH;
            }
            j15 = f139264a;
            jA = ((x) objA).getF139264a();
            j14 = j15;
        } else {
            j14 = f139264a;
            jA = x.f139262b.a();
        }
        return x.b(x.q(j14, jA));
    }

    @Override // androidx.compose.ui.n.c, androidx.compose.ui.n
    public /* synthetic */ boolean a0(l lVar) {
        return o.a(this, lVar);
    }

    @Override // androidx.compose.ui.input.nestedscroll.b
    public long c(long consumed, long available, int source) {
        long jC = this.connection.c(consumed, available, source);
        NestedScrollModifierLocal nestedScrollModifierLocalO = o();
        return b1.f.v(jC, nestedScrollModifierLocalO != null ? nestedScrollModifierLocalO.c(b1.f.v(consumed, jC), b1.f.u(available, jC), source) : b1.f.f30364b.e());
    }

    /* JADX WARN: Code duplicated, block: B:26:0x007b A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    @Override // androidx.compose.ui.input.nestedscroll.b
    @dl.e
    public Object d(long j10, @d kotlin.coroutines.c<? super x> cVar) throws Throwable {
        NestedScrollModifierLocal$onPreFling$1 nestedScrollModifierLocal$onPreFling$1;
        long jA;
        NestedScrollModifierLocal nestedScrollModifierLocal;
        long j11;
        if (cVar instanceof NestedScrollModifierLocal$onPreFling$1) {
            nestedScrollModifierLocal$onPreFling$1 = (NestedScrollModifierLocal$onPreFling$1) cVar;
            int i10 = nestedScrollModifierLocal$onPreFling$1.f14652f;
            if ((i10 & Integer.MIN_VALUE) != 0) {
                nestedScrollModifierLocal$onPreFling$1.f14652f = i10 - Integer.MIN_VALUE;
            } else {
                nestedScrollModifierLocal$onPreFling$1 = new NestedScrollModifierLocal$onPreFling$1(this, cVar);
            }
        } else {
            nestedScrollModifierLocal$onPreFling$1 = new NestedScrollModifierLocal$onPreFling$1(this, cVar);
        }
        Object objD = nestedScrollModifierLocal$onPreFling$1.f14650d;
        Object objH = kotlin.coroutines.intrinsics.b.h();
        int i11 = nestedScrollModifierLocal$onPreFling$1.f14652f;
        if (i11 != 0) {
            if (i11 == 1) {
                j10 = nestedScrollModifierLocal$onPreFling$1.f14649c;
                nestedScrollModifierLocal = (NestedScrollModifierLocal) nestedScrollModifierLocal$onPreFling$1.f14648b;
                t0.n(objD);
            } else {
                if (i11 != 2) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                j11 = nestedScrollModifierLocal$onPreFling$1.f14649c;
                t0.n(objD);
            }
            return x.b(x.q(j11, ((x) objD).getF139264a()));
        }
        t0.n(objD);
        NestedScrollModifierLocal nestedScrollModifierLocalO = o();
        if (nestedScrollModifierLocalO != null) {
            nestedScrollModifierLocal$onPreFling$1.f14648b = this;
            nestedScrollModifierLocal$onPreFling$1.f14649c = j10;
            nestedScrollModifierLocal$onPreFling$1.f14652f = 1;
            objD = nestedScrollModifierLocalO.d(j10, nestedScrollModifierLocal$onPreFling$1);
            if (objD == objH) {
                return objH;
            }
            nestedScrollModifierLocal = this;
        } else {
            jA = x.f139262b.a();
            nestedScrollModifierLocal = this;
        }
        long j12 = j10;
        j11 = jA;
        b bVar = nestedScrollModifierLocal.connection;
        long jP = x.p(j12, j11);
        nestedScrollModifierLocal$onPreFling$1.f14648b = null;
        nestedScrollModifierLocal$onPreFling$1.f14649c = j11;
        nestedScrollModifierLocal$onPreFling$1.f14652f = 2;
        objD = bVar.d(jP, nestedScrollModifierLocal$onPreFling$1);
        if (objD == objH) {
            return objH;
        }
        return x.b(x.q(j11, ((x) objD).getF139264a()));
        jA = ((x) objD).getF139264a();
        long j13 = j10;
        j11 = jA;
        b bVar2 = nestedScrollModifierLocal.connection;
        long jP2 = x.p(j13, j11);
        nestedScrollModifierLocal$onPreFling$1.f14648b = null;
        nestedScrollModifierLocal$onPreFling$1.f14649c = j11;
        nestedScrollModifierLocal$onPreFling$1.f14652f = 2;
        objD = bVar2.d(jP2, nestedScrollModifierLocal$onPreFling$1);
        if (objD == objH) {
            return objH;
        }
        return x.b(x.q(j11, ((x) objD).getF139264a()));
    }

    @Override // androidx.compose.ui.input.nestedscroll.b
    public long e(long available, int source) {
        NestedScrollModifierLocal nestedScrollModifierLocalO = o();
        long jE = nestedScrollModifierLocalO != null ? nestedScrollModifierLocalO.e(available, source) : b1.f.f30364b.e();
        return b1.f.v(jE, this.connection.e(b1.f.u(available, jE), source));
    }

    @d
    /* JADX INFO: renamed from: g, reason: from getter */
    public final b getConnection() {
        return this.connection;
    }

    @Override // androidx.compose.ui.modifier.m
    @d
    public p<NestedScrollModifierLocal> getKey() {
        return NestedScrollModifierLocalKt.a();
    }

    @d
    /* JADX INFO: renamed from: m, reason: from getter */
    public final NestedScrollDispatcher getDispatcher() {
        return this.dispatcher;
    }

    @Override // androidx.compose.ui.modifier.m
    @d
    /* JADX INFO: renamed from: q, reason: merged with bridge method [inline-methods] */
    public NestedScrollModifierLocal getValue() {
        return this;
    }

    @Override // androidx.compose.ui.n
    public /* synthetic */ n s0(n nVar) {
        return androidx.compose.ui.m.a(this, nVar);
    }

    @Override // androidx.compose.ui.n.c, androidx.compose.ui.n
    public /* synthetic */ boolean t(l lVar) {
        return o.b(this, lVar);
    }

    @Override // androidx.compose.ui.n.c, androidx.compose.ui.n
    public /* synthetic */ Object v(Object obj, yh.p pVar) {
        return o.d(this, obj, pVar);
    }

    @Override // androidx.compose.ui.modifier.e
    public void w1(@d androidx.compose.ui.modifier.n scope) {
        f0.p(scope, "scope");
        r((NestedScrollModifierLocal) scope.a(NestedScrollModifierLocalKt.a()));
        this.dispatcher.k(o());
    }

    @Override // androidx.compose.ui.n.c, androidx.compose.ui.n
    public /* synthetic */ Object x(Object obj, yh.p pVar) {
        return o.c(this, obj, pVar);
    }
}
