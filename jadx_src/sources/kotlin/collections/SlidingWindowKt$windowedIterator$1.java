package kotlin.collections;

import java.util.Iterator;
import java.util.List;
import kotlin.b2;
import kotlin.coroutines.jvm.internal.RestrictedSuspendLambda;

/* JADX INFO: Add missing generic type declarations: [T] */
/* JADX INFO: compiled from: SlidingWindow.kt */
/* JADX INFO: loaded from: classes5.dex */
@kotlin.coroutines.jvm.internal.d(c = "kotlin.collections.SlidingWindowKt$windowedIterator$1", f = "SlidingWindow.kt", i = {0, 0, 0, 2, 2, 3, 3}, l = {34, 40, 49, 55, 58}, m = "invokeSuspend", n = {"$this$iterator", "buffer", "gap", "$this$iterator", "buffer", "$this$iterator", "buffer"}, s = {"L$0", "L$1", "I$0", "L$0", "L$1", "L$0", "L$1"})
public final class SlidingWindowKt$windowedIterator$1<T> extends RestrictedSuspendLambda implements yh.p<kotlin.sequences.o<? super List<? extends T>>, kotlin.coroutines.c<? super b2>, Object> {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    Object f124547c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    Object f124548d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    int f124549e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    int f124550f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private /* synthetic */ Object f124551g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    final /* synthetic */ int f124552h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    final /* synthetic */ int f124553i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    final /* synthetic */ Iterator<T> f124554j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    final /* synthetic */ boolean f124555k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    final /* synthetic */ boolean f124556l;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    SlidingWindowKt$windowedIterator$1(int i10, int i11, Iterator<? extends T> it, boolean z10, boolean z11, kotlin.coroutines.c<? super SlidingWindowKt$windowedIterator$1> cVar) {
        super(2, cVar);
        this.f124552h = i10;
        this.f124553i = i11;
        this.f124554j = it;
        this.f124555k = z10;
        this.f124556l = z11;
    }

    @Override // yh.p
    @dl.e
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public final Object invoke(@dl.d kotlin.sequences.o<? super List<? extends T>> oVar, @dl.e kotlin.coroutines.c<? super b2> cVar) {
        return ((SlidingWindowKt$windowedIterator$1) create(oVar, cVar)).invokeSuspend(b2.f124493a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @dl.d
    public final kotlin.coroutines.c<b2> create(@dl.e Object obj, @dl.d kotlin.coroutines.c<?> cVar) {
        SlidingWindowKt$windowedIterator$1 slidingWindowKt$windowedIterator$1 = new SlidingWindowKt$windowedIterator$1(this.f124552h, this.f124553i, this.f124554j, this.f124555k, this.f124556l, cVar);
        slidingWindowKt$windowedIterator$1.f124551g = obj;
        return slidingWindowKt$windowedIterator$1;
    }

    /* JADX WARN: Code duplicated, block: B:46:0x00eb  */
    /* JADX WARN: Code duplicated, block: B:53:0x0109  */
    /* JADX WARN: Code duplicated, block: B:54:0x010b  */
    /* JADX WARN: Code duplicated, block: B:57:0x011e A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:80:0x00f8 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:81:0x0105 A[SYNTHETIC] */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:27:0x00a5 -> B:29:0x00a8). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:56:0x011c -> B:58:0x011f). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:69:0x014a -> B:71:0x014d). Please report as a decompilation issue!!! */
    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions stack size limit reached
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @dl.e
    public final java.lang.Object invokeSuspend(@dl.d java.lang.Object r13) {
        /*
            Method dump skipped, instruction units count: 364
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlin.collections.SlidingWindowKt$windowedIterator$1.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
