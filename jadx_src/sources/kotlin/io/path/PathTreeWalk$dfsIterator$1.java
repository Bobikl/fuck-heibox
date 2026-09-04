package kotlin.io.path;

import java.nio.file.Path;
import kotlin.b2;
import kotlin.coroutines.jvm.internal.RestrictedSuspendLambda;
import yh.p;

/* JADX INFO: compiled from: PathTreeWalk.kt */
/* JADX INFO: loaded from: classes5.dex */
@kotlin.coroutines.jvm.internal.d(c = "kotlin.io.path.PathTreeWalk$dfsIterator$1", f = "PathTreeWalk.kt", i = {0, 0, 0, 0, 0, 0, 1, 1, 1, 2, 2, 2, 2, 2, 2, 3, 3, 3}, l = {184, bb.c.b.I0, 199, 205}, m = "invokeSuspend", n = {"$this$iterator", "stack", "entriesReader", "startNode", "this_$iv", "path$iv", "$this$iterator", "stack", "entriesReader", "$this$iterator", "stack", "entriesReader", "pathNode", "this_$iv", "path$iv", "$this$iterator", "stack", "entriesReader"}, s = {"L$0", "L$1", "L$2", "L$3", "L$4", "L$5", "L$0", "L$1", "L$2", "L$0", "L$1", "L$2", "L$3", "L$4", "L$5", "L$0", "L$1", "L$2"})
public final class PathTreeWalk$dfsIterator$1 extends RestrictedSuspendLambda implements p<kotlin.sequences.o<? super Path>, kotlin.coroutines.c<? super b2>, Object> {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    Object f124798c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    Object f124799d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    Object f124800e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    Object f124801f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    Object f124802g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    int f124803h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private /* synthetic */ Object f124804i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    final /* synthetic */ PathTreeWalk f124805j;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    PathTreeWalk$dfsIterator$1(PathTreeWalk pathTreeWalk, kotlin.coroutines.c<? super PathTreeWalk$dfsIterator$1> cVar) {
        super(2, cVar);
        this.f124805j = pathTreeWalk;
    }

    @Override // yh.p
    @dl.e
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public final Object invoke(@dl.d kotlin.sequences.o<? super Path> oVar, @dl.e kotlin.coroutines.c<? super b2> cVar) {
        return ((PathTreeWalk$dfsIterator$1) create(oVar, cVar)).invokeSuspend(b2.f124493a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @dl.d
    public final kotlin.coroutines.c<b2> create(@dl.e Object obj, @dl.d kotlin.coroutines.c<?> cVar) {
        PathTreeWalk$dfsIterator$1 pathTreeWalk$dfsIterator$1 = new PathTreeWalk$dfsIterator$1(this.f124805j, cVar);
        pathTreeWalk$dfsIterator$1.f124804i = obj;
        return pathTreeWalk$dfsIterator$1;
    }

    /* JADX WARN: Code duplicated, block: B:38:0x0147  */
    /* JADX WARN: Code duplicated, block: B:44:0x0184  */
    /* JADX WARN: Code duplicated, block: B:46:0x018a  */
    /* JADX WARN: Code duplicated, block: B:48:0x019e A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:49:0x019f  */
    /* JADX WARN: Code duplicated, block: B:51:0x01b7 A[PHI: r2 r6 r9 r10 r11 r12 r13
  0x01b7: PHI (r2v14 kotlin.io.path.c) = (r2v11 kotlin.io.path.c), (r2v16 kotlin.io.path.c) binds: [B:45:0x0188, B:50:0x01ab] A[DONT_GENERATE, DONT_INLINE]
  0x01b7: PHI (r6v19 kotlin.collections.i) = (r6v17 kotlin.collections.i), (r6v21 kotlin.collections.i) binds: [B:45:0x0188, B:50:0x01ab] A[DONT_GENERATE, DONT_INLINE]
  0x01b7: PHI (r9v10 kotlin.sequences.o) = (r9v8 kotlin.sequences.o), (r9v12 kotlin.sequences.o) binds: [B:45:0x0188, B:50:0x01ab] A[DONT_GENERATE, DONT_INLINE]
  0x01b7: PHI (r10v6 kotlin.io.path.PathTreeWalk$dfsIterator$1) = (r10v5 kotlin.io.path.PathTreeWalk$dfsIterator$1), (r10v7 kotlin.io.path.PathTreeWalk$dfsIterator$1) binds: [B:45:0x0188, B:50:0x01ab] A[DONT_GENERATE, DONT_INLINE]
  0x01b7: PHI (r11v24 kotlin.io.path.j) = (r11v17 kotlin.io.path.j), (r11v26 kotlin.io.path.j) binds: [B:45:0x0188, B:50:0x01ab] A[DONT_GENERATE, DONT_INLINE]
  0x01b7: PHI (r12v14 kotlin.io.path.PathTreeWalk) = (r12v11 kotlin.io.path.PathTreeWalk), (r12v24 kotlin.io.path.PathTreeWalk) binds: [B:45:0x0188, B:50:0x01ab] A[DONT_GENERATE, DONT_INLINE]
  0x01b7: PHI (r13v8 java.nio.file.Path) = (r13v6 java.nio.file.Path), (r13v10 java.nio.file.Path) binds: [B:45:0x0188, B:50:0x01ab] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:53:0x01cf  */
    /* JADX WARN: Code duplicated, block: B:54:0x01df  */
    /* JADX WARN: Code duplicated, block: B:67:0x017e A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:69:0x015a A[SYNTHETIC] */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:52:0x01cd -> B:36:0x0140). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:53:0x01cf -> B:36:0x0140). Please report as a decompilation issue!!! */
    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions stack size limit reached
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @dl.e
    public final java.lang.Object invokeSuspend(@dl.d java.lang.Object r19) {
        /*
            Method dump skipped, instruction units count: 536
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlin.io.path.PathTreeWalk$dfsIterator$1.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
