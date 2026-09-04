package kotlin.coroutines;

import java.io.Serializable;
import kotlin.b2;
import kotlin.jvm.internal.Ref;
import kotlin.jvm.internal.f0;
import kotlin.jvm.internal.u;
import kotlin.u0;
import yh.p;

/* JADX INFO: compiled from: CoroutineContextImpl.kt */
/* JADX INFO: loaded from: classes5.dex */
@u0(version = "1.3")
public final class CombinedContext implements CoroutineContext, Serializable {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @dl.d
    private final CoroutineContext f124686b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @dl.d
    private final CoroutineContext.a f124687c;

    /* JADX INFO: compiled from: CoroutineContextImpl.kt */
    public static final class Serialized implements Serializable {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        @dl.d
        public static final a f124688c = new a(null);
        private static final long serialVersionUID = 0;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        @dl.d
        private final CoroutineContext[] f124689b;

        /* JADX INFO: compiled from: CoroutineContextImpl.kt */
        public static final class a {
            private a() {
            }

            public /* synthetic */ a(u uVar) {
                this();
            }
        }

        public Serialized(@dl.d CoroutineContext[] elements) {
            f0.p(elements, "elements");
            this.f124689b = elements;
        }

        private final Object b() {
            CoroutineContext[] coroutineContextArr = this.f124689b;
            CoroutineContext coroutineContextI = EmptyCoroutineContext.f124694b;
            for (CoroutineContext coroutineContext : coroutineContextArr) {
                coroutineContextI = coroutineContextI.I(coroutineContext);
            }
            return coroutineContextI;
        }

        @dl.d
        public final CoroutineContext[] a() {
            return this.f124689b;
        }
    }

    public CombinedContext(@dl.d CoroutineContext left, @dl.d CoroutineContext.a element) {
        f0.p(left, "left");
        f0.p(element, "element");
        this.f124686b = left;
        this.f124687c = element;
    }

    private final boolean c(CoroutineContext.a aVar) {
        return f0.g(f(aVar.getKey()), aVar);
    }

    private final boolean h(CombinedContext combinedContext) {
        while (c(combinedContext.f124687c)) {
            CoroutineContext coroutineContext = combinedContext.f124686b;
            if (!(coroutineContext instanceof CombinedContext)) {
                f0.n(coroutineContext, "null cannot be cast to non-null type kotlin.coroutines.CoroutineContext.Element");
                return c((CoroutineContext.a) coroutineContext);
            }
            combinedContext = (CombinedContext) coroutineContext;
        }
        return false;
    }

    private final int j() {
        int i10 = 2;
        CombinedContext combinedContext = this;
        while (true) {
            CoroutineContext coroutineContext = combinedContext.f124686b;
            combinedContext = coroutineContext instanceof CombinedContext ? (CombinedContext) coroutineContext : null;
            if (combinedContext == null) {
                return i10;
            }
            i10++;
        }
    }

    private final Object l() {
        int iJ = j();
        final CoroutineContext[] coroutineContextArr = new CoroutineContext[iJ];
        final Ref.IntRef intRef = new Ref.IntRef();
        g(b2.f124493a, new p<b2, CoroutineContext.a, b2>() { // from class: kotlin.coroutines.CombinedContext$writeReplace$1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(2);
            }

            public final void a(@dl.d b2 b2Var, @dl.d CoroutineContext.a element) {
                f0.p(b2Var, "<anonymous parameter 0>");
                f0.p(element, "element");
                CoroutineContext[] coroutineContextArr2 = coroutineContextArr;
                Ref.IntRef intRef2 = intRef;
                int i10 = intRef2.f124889b;
                intRef2.f124889b = i10 + 1;
                coroutineContextArr2[i10] = element;
            }

            @Override // yh.p
            public /* bridge */ /* synthetic */ b2 invoke(b2 b2Var, CoroutineContext.a aVar) {
                a(b2Var, aVar);
                return b2.f124493a;
            }
        });
        if (intRef.f124889b == iJ) {
            return new Serialized(coroutineContextArr);
        }
        throw new IllegalStateException("Check failed.".toString());
    }

    @Override // kotlin.coroutines.CoroutineContext
    @dl.d
    public CoroutineContext I(@dl.d CoroutineContext coroutineContext) {
        return CoroutineContext.DefaultImpls.a(this, coroutineContext);
    }

    @Override // kotlin.coroutines.CoroutineContext
    @dl.d
    public CoroutineContext d(@dl.d CoroutineContext.b<?> key) {
        f0.p(key, "key");
        if (this.f124687c.f(key) != null) {
            return this.f124686b;
        }
        CoroutineContext coroutineContextD = this.f124686b.d(key);
        if (coroutineContextD == this.f124686b) {
            return this;
        }
        return coroutineContextD == EmptyCoroutineContext.f124694b ? this.f124687c : new CombinedContext(coroutineContextD, this.f124687c);
    }

    public boolean equals(@dl.e Object obj) {
        if (this != obj) {
            if (obj instanceof CombinedContext) {
                CombinedContext combinedContext = (CombinedContext) obj;
                if (combinedContext.j() != j() || !combinedContext.h(this)) {
                }
            }
            return false;
        }
        return true;
    }

    @Override // kotlin.coroutines.CoroutineContext
    @dl.e
    public <E extends CoroutineContext.a> E f(@dl.d CoroutineContext.b<E> key) {
        f0.p(key, "key");
        CombinedContext combinedContext = this;
        while (true) {
            E e10 = (E) combinedContext.f124687c.f(key);
            if (e10 != null) {
                return e10;
            }
            CoroutineContext coroutineContext = combinedContext.f124686b;
            if (!(coroutineContext instanceof CombinedContext)) {
                return (E) coroutineContext.f(key);
            }
            combinedContext = (CombinedContext) coroutineContext;
        }
    }

    @Override // kotlin.coroutines.CoroutineContext
    public <R> R g(R r10, @dl.d p<? super R, ? super CoroutineContext.a, ? extends R> operation) {
        f0.p(operation, "operation");
        return operation.invoke((Object) this.f124686b.g(r10, operation), this.f124687c);
    }

    public int hashCode() {
        return this.f124686b.hashCode() + this.f124687c.hashCode();
    }

    @dl.d
    public String toString() {
        return '[' + ((String) g("", new p<String, CoroutineContext.a, String>() { // from class: kotlin.coroutines.CombinedContext.toString.1
            @Override // yh.p
            @dl.d
            /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
            public final String invoke(@dl.d String acc, @dl.d CoroutineContext.a element) {
                f0.p(acc, "acc");
                f0.p(element, "element");
                if (acc.length() == 0) {
                    return element.toString();
                }
                return acc + ", " + element;
            }
        })) + ']';
    }
}
