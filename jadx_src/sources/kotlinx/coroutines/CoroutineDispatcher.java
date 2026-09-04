package kotlinx.coroutines;

import com.umeng.analytics.pro.ak;
import kotlin.DeprecationLevel;
import kotlin.Metadata;
import kotlin.coroutines.CoroutineContext;

/* JADX INFO: compiled from: CoroutineDispatcher.kt */
/* JADX INFO: loaded from: classes5.dex */
@Metadata(bv = {}, d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0002\b\u0006\b&\u0018\u0000 \u001b2\u00020\u00012\u00020\u0002:\u0001\u001cB\u0007¢\u0006\u0004\b\u0019\u0010\u001aJ\u0010\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0004\u001a\u00020\u0003H\u0016J\u0010\u0010\t\u001a\u00020\u00002\u0006\u0010\b\u001a\u00020\u0007H\u0017J\u001c\u0010\u000e\u001a\u00020\r2\u0006\u0010\u0004\u001a\u00020\u00032\n\u0010\f\u001a\u00060\nj\u0002`\u000bH&J\u001c\u0010\u000f\u001a\u00020\r2\u0006\u0010\u0004\u001a\u00020\u00032\n\u0010\f\u001a\u00060\nj\u0002`\u000bH\u0017J \u0010\u0013\u001a\b\u0012\u0004\u0012\u00028\u00000\u0011\"\u0004\b\u0000\u0010\u00102\f\u0010\u0012\u001a\b\u0012\u0004\u0012\u00028\u00000\u0011J\u0012\u0010\u0014\u001a\u00020\r2\n\u0010\u0012\u001a\u0006\u0012\u0002\b\u00030\u0011J\u0011\u0010\u0016\u001a\u00020\u00002\u0006\u0010\u0015\u001a\u00020\u0000H\u0087\u0002J\b\u0010\u0018\u001a\u00020\u0017H\u0016¨\u0006\u001d"}, d2 = {"Lkotlinx/coroutines/CoroutineDispatcher;", "Lkotlin/coroutines/a;", "Lkotlin/coroutines/d;", "Lkotlin/coroutines/CoroutineContext;", com.umeng.analytics.pro.d.R, "", androidx.exifinterface.media.a.X4, "", "parallelism", "c0", "Ljava/lang/Runnable;", "Lkotlinx/coroutines/Runnable;", "block", "Lkotlin/b2;", "O", "R", androidx.exifinterface.media.a.f23244d5, "Lkotlin/coroutines/c;", "continuation", "Q", "k", "other", "j0", "", "toString", "<init>", "()V", ak.aF, "Key", "kotlinx-coroutines-core"}, k = 1, mv = {1, 6, 0})
public abstract class CoroutineDispatcher extends kotlin.coroutines.a implements kotlin.coroutines.d {

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    @dl.d
    public static final Companion INSTANCE = new Companion(null);

    /* JADX INFO: renamed from: kotlinx.coroutines.CoroutineDispatcher$Key, reason: from kotlin metadata */
    /* JADX INFO: compiled from: CoroutineDispatcher.kt */
    @Metadata(bv = {}, d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0087\u0003\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\t\b\u0002¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Lkotlinx/coroutines/CoroutineDispatcher$Key;", "Lkotlin/coroutines/b;", "Lkotlin/coroutines/d;", "Lkotlinx/coroutines/CoroutineDispatcher;", "<init>", "()V", "kotlinx-coroutines-core"}, k = 1, mv = {1, 6, 0})
    @kotlin.q
    public static final class Companion extends kotlin.coroutines.b<kotlin.coroutines.d, CoroutineDispatcher> {
        private Companion() {
            super(kotlin.coroutines.d.f124698w1, new yh.l<CoroutineContext.a, CoroutineDispatcher>() { // from class: kotlinx.coroutines.CoroutineDispatcher.Key.1
                @Override // yh.l
                @dl.e
                /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
                public final CoroutineDispatcher invoke(@dl.d CoroutineContext.a aVar) {
                    if (aVar instanceof CoroutineDispatcher) {
                        return (CoroutineDispatcher) aVar;
                    }
                    return null;
                }
            });
        }

        public /* synthetic */ Companion(kotlin.jvm.internal.u uVar) {
            this();
        }
    }

    public CoroutineDispatcher() {
        super(kotlin.coroutines.d.f124698w1);
    }

    public abstract void O(@dl.d CoroutineContext coroutineContext, @dl.d Runnable runnable);

    @Override // kotlin.coroutines.d
    @dl.d
    public final <T> kotlin.coroutines.c<T> Q(@dl.d kotlin.coroutines.c<? super T> continuation) {
        return new kotlinx.coroutines.internal.l(this, continuation);
    }

    @z1
    public void R(@dl.d CoroutineContext coroutineContext, @dl.d Runnable runnable) {
        O(coroutineContext, runnable);
    }

    public boolean V(@dl.d CoroutineContext context) {
        return true;
    }

    @dl.d
    @t1
    public CoroutineDispatcher c0(int parallelism) {
        kotlinx.coroutines.internal.s.a(parallelism);
        return new kotlinx.coroutines.internal.r(this, parallelism);
    }

    @Override // kotlin.coroutines.a, kotlin.coroutines.CoroutineContext.a, kotlin.coroutines.CoroutineContext
    @dl.d
    public CoroutineContext d(@dl.d CoroutineContext.b<?> bVar) {
        return kotlin.coroutines.d.a.c(this, bVar);
    }

    @Override // kotlin.coroutines.a, kotlin.coroutines.CoroutineContext.a, kotlin.coroutines.CoroutineContext
    @dl.e
    public <E extends CoroutineContext.a> E f(@dl.d CoroutineContext.b<E> bVar) {
        return (E) kotlin.coroutines.d.a.b(this, bVar);
    }

    @dl.d
    @kotlin.k(level = DeprecationLevel.ERROR, message = "Operator '+' on two CoroutineDispatcher objects is meaningless. CoroutineDispatcher is a coroutine context element and `+` is a set-sum operator for coroutine contexts. The dispatcher to the right of `+` just replaces the dispatcher to the left.")
    public final CoroutineDispatcher j0(@dl.d CoroutineDispatcher other) {
        return other;
    }

    @Override // kotlin.coroutines.d
    public final void k(@dl.d kotlin.coroutines.c<?> cVar) {
        ((kotlinx.coroutines.internal.l) cVar).q();
    }

    @dl.d
    public String toString() {
        return t0.a(this) + '@' + t0.b(this);
    }
}
