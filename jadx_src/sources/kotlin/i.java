package kotlin;

/* JADX INFO: compiled from: DeepRecursive.kt */
/* JADX INFO: loaded from: classes5.dex */
@kotlin.coroutines.g
@u0(version = org.apache.tools.ant.util.s0.f136932w)
@e2(markerClass = {q.class})
public abstract class i<T, R> {
    private i() {
    }

    public /* synthetic */ i(kotlin.jvm.internal.u uVar) {
        this();
    }

    @dl.e
    public abstract Object a(T t10, @dl.d kotlin.coroutines.c<? super R> cVar);

    @dl.e
    public abstract <U, S> Object c(@dl.d g<U, S> gVar, U u10, @dl.d kotlin.coroutines.c<? super S> cVar);

    @dl.d
    @k(level = DeprecationLevel.ERROR, message = "'invoke' should not be called from DeepRecursiveScope. Use 'callRecursive' to do recursion in the heap instead of the call stack.", replaceWith = @s0(expression = "this.callRecursive(value)", imports = {}))
    public final Void d(@dl.d g<?, ?> gVar, @dl.e Object obj) {
        kotlin.jvm.internal.f0.p(gVar, "<this>");
        throw new UnsupportedOperationException("Should not be called from DeepRecursiveScope");
    }
}
