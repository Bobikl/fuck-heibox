package kotlinx.coroutines;

import com.umeng.analytics.pro.ak;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;
import kotlin.Metadata;
import kotlin.Result;
import kotlin.coroutines.intrinsics.IntrinsicsKt__IntrinsicsJvmKt;

/* JADX INFO: compiled from: Await.kt */
/* JADX INFO: loaded from: classes5.dex */
@Metadata(bv = {}, d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0002\u0010 \n\u0002\b\u0002\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0002\u0018\u0000*\u0004\b\u0000\u0010\u00012\u00020\u0002:\u0002\b\u0004B\u001d\u0012\u0014\u0010\n\u001a\u0010\u0012\f\b\u0001\u0012\b\u0012\u0004\u0012\u00028\u00000\u00070\u0006¢\u0006\u0004\b\u000b\u0010\fJ\u0019\u0010\u0004\u001a\b\u0012\u0004\u0012\u00028\u00000\u0003H\u0086@ø\u0001\u0000¢\u0006\u0004\b\u0004\u0010\u0005R\"\u0010\n\u001a\u0010\u0012\f\b\u0001\u0012\b\u0012\u0004\u0012\u00028\u00000\u00070\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\b\u0010\t\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006\r"}, d2 = {"Lkotlinx/coroutines/e;", androidx.exifinterface.media.a.f23244d5, "", "", "b", "(Lkotlin/coroutines/c;)Ljava/lang/Object;", "", "Lkotlinx/coroutines/w0;", ak.av, "[Lkotlinx/coroutines/w0;", "deferreds", "<init>", "([Lkotlinx/coroutines/w0;)V", "kotlinx-coroutines-core"}, k = 1, mv = {1, 6, 0})
public final class e<T> {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    static final /* synthetic */ AtomicIntegerFieldUpdater f129176b = AtomicIntegerFieldUpdater.newUpdater(e.class, "notCompletedCount");

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    @dl.d
    private final w0<T>[] deferreds;

    @dl.d
    volatile /* synthetic */ int notCompletedCount;

    /* JADX INFO: compiled from: Await.kt */
    @Metadata(bv = {}, d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0003\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\t\b\u0082\u0004\u0018\u00002\u00020\u0001B\u001b\u0012\u0012\u0010\u000b\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\b0\u0007¢\u0006\u0004\b\u001c\u0010\u001dJ\u001a\u0010\u0005\u001a\u00020\u00042\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002H\u0096\u0002¢\u0006\u0004\b\u0005\u0010\u0006R \u0010\u000b\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\b0\u00078\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\t\u0010\nR\"\u0010\u0013\u001a\u00020\f8\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\b\r\u0010\u000e\u001a\u0004\b\u000f\u0010\u0010\"\u0004\b\u0011\u0010\u0012R<\u0010\u001b\u001a\u000e\u0018\u00010\u0014R\b\u0012\u0004\u0012\u00028\u00000\u00152\u0012\u0010\u0016\u001a\u000e\u0018\u00010\u0014R\b\u0012\u0004\u0012\u00028\u00000\u00158F@FX\u0086\u000e¢\u0006\f\u001a\u0004\b\u0017\u0010\u0018\"\u0004\b\u0019\u0010\u001a¨\u0006\u001e"}, d2 = {"Lkotlinx/coroutines/e$a;", "Lkotlinx/coroutines/j2;", "", "cause", "Lkotlin/b2;", "j0", "(Ljava/lang/Throwable;)V", "Lkotlinx/coroutines/p;", "", "f", "Lkotlinx/coroutines/p;", "continuation", "Lkotlinx/coroutines/h1;", "g", "Lkotlinx/coroutines/h1;", "p0", "()Lkotlinx/coroutines/h1;", "r0", "(Lkotlinx/coroutines/h1;)V", "handle", "Lkotlinx/coroutines/e$b;", "Lkotlinx/coroutines/e;", "value", "o0", "()Lkotlinx/coroutines/e$b;", "q0", "(Lkotlinx/coroutines/e$b;)V", "disposer", "<init>", "(Lkotlinx/coroutines/e;Lkotlinx/coroutines/p;)V", "kotlinx-coroutines-core"}, k = 1, mv = {1, 6, 0})
    public final class a extends j2 {

        @dl.d
        private volatile /* synthetic */ Object _disposer = null;

        /* JADX INFO: renamed from: f, reason: collision with root package name and from kotlin metadata */
        @dl.d
        private final p<List<? extends T>> continuation;

        /* JADX INFO: renamed from: g, reason: collision with root package name and from kotlin metadata */
        public h1 handle;

        /* JADX WARN: Multi-variable type inference failed */
        public a(p<? super List<? extends T>> pVar) {
            this.continuation = pVar;
        }

        @Override // yh.l
        public /* bridge */ /* synthetic */ kotlin.b2 invoke(Throwable th2) {
            j0(th2);
            return kotlin.b2.f124493a;
        }

        @Override // kotlinx.coroutines.f0
        public void j0(@dl.e Throwable cause) {
            if (cause != null) {
                Object objC0 = this.continuation.c0(cause);
                if (objC0 != null) {
                    this.continuation.V(objC0);
                    e<T>.b bVarO0 = o0();
                    if (bVarO0 != null) {
                        bVarO0.b();
                        return;
                    }
                    return;
                }
                return;
            }
            if (e.f129176b.decrementAndGet(e.this) == 0) {
                p<List<? extends T>> pVar = this.continuation;
                w0[] w0VarArr = ((e) e.this).deferreds;
                ArrayList arrayList = new ArrayList(w0VarArr.length);
                for (w0 w0Var : w0VarArr) {
                    arrayList.add(w0Var.m());
                }
                Result.a aVar = Result.f124476c;
                pVar.resumeWith(Result.b(arrayList));
            }
        }

        @dl.e
        public final e<T>.b o0() {
            return (b) this._disposer;
        }

        @dl.d
        public final h1 p0() {
            h1 h1Var = this.handle;
            if (h1Var != null) {
                return h1Var;
            }
            kotlin.jvm.internal.f0.S("handle");
            return null;
        }

        public final void q0(@dl.e e<T>.b bVar) {
            this._disposer = bVar;
        }

        public final void r0(@dl.d h1 h1Var) {
            this.handle = h1Var;
        }
    }

    /* JADX INFO: compiled from: Await.kt */
    @Metadata(bv = {}, d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0003\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0082\u0004\u0018\u00002\u00020\u0001B\u001f\u0012\u0016\u0010\r\u001a\u0012\u0012\u000e\u0012\f0\nR\b\u0012\u0004\u0012\u00028\u00000\u000b0\t¢\u0006\u0004\b\u000e\u0010\u000fJ\u0006\u0010\u0003\u001a\u00020\u0002J\u0013\u0010\u0006\u001a\u00020\u00022\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004H\u0096\u0002J\b\u0010\b\u001a\u00020\u0007H\u0016R$\u0010\r\u001a\u0012\u0012\u000e\u0012\f0\nR\b\u0012\u0004\u0012\u00028\u00000\u000b0\t8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0003\u0010\f¨\u0006\u0010"}, d2 = {"Lkotlinx/coroutines/e$b;", "Lkotlinx/coroutines/n;", "Lkotlin/b2;", "b", "", "cause", ak.av, "", "toString", "", "Lkotlinx/coroutines/e$a;", "Lkotlinx/coroutines/e;", "[Lkotlinx/coroutines/e$a;", "nodes", "<init>", "(Lkotlinx/coroutines/e;[Lkotlinx/coroutines/e$a;)V", "kotlinx-coroutines-core"}, k = 1, mv = {1, 6, 0})
    public final class b extends n {

        /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
        @dl.d
        private final e<T>.a[] nodes;

        public b(e<T>.a[] aVarArr) {
            this.nodes = aVarArr;
        }

        @Override // kotlinx.coroutines.o
        public void a(@dl.e Throwable th2) {
            b();
        }

        public final void b() {
            for (e<T>.a aVar : this.nodes) {
                aVar.p0().dispose();
            }
        }

        @Override // yh.l
        public /* bridge */ /* synthetic */ kotlin.b2 invoke(Throwable th2) {
            a(th2);
            return kotlin.b2.f124493a;
        }

        @dl.d
        public String toString() {
            return "DisposeHandlersOnCancel[" + this.nodes + ']';
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public e(@dl.d w0<? extends T>[] w0VarArr) {
        this.deferreds = w0VarArr;
        this.notCompletedCount = w0VarArr.length;
    }

    @dl.e
    public final Object b(@dl.d kotlin.coroutines.c<? super List<? extends T>> cVar) {
        q qVar = new q(IntrinsicsKt__IntrinsicsJvmKt.d(cVar), 1);
        qVar.F0();
        int length = this.deferreds.length;
        a[] aVarArr = new a[length];
        for (int i10 = 0; i10 < length; i10++) {
            w0 w0Var = this.deferreds[i10];
            w0Var.start();
            a aVar = new a(qVar);
            aVar.r0(w0Var.K(aVar));
            kotlin.b2 b2Var = kotlin.b2.f124493a;
            aVarArr[i10] = aVar;
        }
        e<T>.b bVar = new b(aVarArr);
        for (int i11 = 0; i11 < length; i11++) {
            aVarArr[i11].q0(bVar);
        }
        if (qVar.x()) {
            bVar.b();
        } else {
            qVar.L(bVar);
        }
        Object objT = qVar.t();
        if (objT == kotlin.coroutines.intrinsics.b.h()) {
            kotlin.coroutines.jvm.internal.f.c(cVar);
        }
        return objT;
    }
}
