package kotlin.io.path;

import java.nio.file.Path;
import kotlin.b2;
import kotlin.coroutines.jvm.internal.RestrictedSuspendLambda;
import yh.p;

/* JADX INFO: compiled from: PathTreeWalk.kt */
/* JADX INFO: loaded from: classes5.dex */
@kotlin.coroutines.jvm.internal.d(c = "kotlin.io.path.PathTreeWalk$bfsIterator$1", f = "PathTreeWalk.kt", i = {0, 0, 0, 0, 0, 0, 1, 1, 1}, l = {184, bb.c.b.I0}, m = "invokeSuspend", n = {"$this$iterator", "queue", "entriesReader", "pathNode", "this_$iv", "path$iv", "$this$iterator", "queue", "entriesReader"}, s = {"L$0", "L$1", "L$2", "L$3", "L$4", "L$5", "L$0", "L$1", "L$2"})
public final class PathTreeWalk$bfsIterator$1 extends RestrictedSuspendLambda implements p<kotlin.sequences.o<? super Path>, kotlin.coroutines.c<? super b2>, Object> {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    Object f124790c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    Object f124791d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    Object f124792e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    Object f124793f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    Object f124794g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    int f124795h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private /* synthetic */ Object f124796i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    final /* synthetic */ PathTreeWalk f124797j;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    PathTreeWalk$bfsIterator$1(PathTreeWalk pathTreeWalk, kotlin.coroutines.c<? super PathTreeWalk$bfsIterator$1> cVar) {
        super(2, cVar);
        this.f124797j = pathTreeWalk;
    }

    @Override // yh.p
    @dl.e
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public final Object invoke(@dl.d kotlin.sequences.o<? super Path> oVar, @dl.e kotlin.coroutines.c<? super b2> cVar) {
        return ((PathTreeWalk$bfsIterator$1) create(oVar, cVar)).invokeSuspend(b2.f124493a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @dl.d
    public final kotlin.coroutines.c<b2> create(@dl.e Object obj, @dl.d kotlin.coroutines.c<?> cVar) {
        PathTreeWalk$bfsIterator$1 pathTreeWalk$bfsIterator$1 = new PathTreeWalk$bfsIterator$1(this.f124797j, cVar);
        pathTreeWalk$bfsIterator$1.f124796i = obj;
        return pathTreeWalk$bfsIterator$1;
    }

    /* JADX WARN: Code duplicated, block: B:13:0x0087  */
    /* JADX WARN: Code duplicated, block: B:17:0x00b1  */
    /* JADX WARN: Code duplicated, block: B:19:0x00b7  */
    /* JADX WARN: Code duplicated, block: B:21:0x00cb A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:22:0x00cc  */
    /* JADX WARN: Code duplicated, block: B:24:0x00dc A[PHI: r1 r5 r6 r7 r8 r9 r15
  0x00dc: PHI (r1v3 kotlin.io.path.c) = (r1v5 kotlin.io.path.c), (r1v6 kotlin.io.path.c) binds: [B:23:0x00d4, B:18:0x00b5] A[DONT_GENERATE, DONT_INLINE]
  0x00dc: PHI (r5v2 kotlin.collections.i) = (r5v4 kotlin.collections.i), (r5v5 kotlin.collections.i) binds: [B:23:0x00d4, B:18:0x00b5] A[DONT_GENERATE, DONT_INLINE]
  0x00dc: PHI (r6v4 kotlin.sequences.o) = (r6v6 kotlin.sequences.o), (r6v7 kotlin.sequences.o) binds: [B:23:0x00d4, B:18:0x00b5] A[DONT_GENERATE, DONT_INLINE]
  0x00dc: PHI (r7v2 kotlin.io.path.j) = (r7v5 kotlin.io.path.j), (r7v9 kotlin.io.path.j) binds: [B:23:0x00d4, B:18:0x00b5] A[DONT_GENERATE, DONT_INLINE]
  0x00dc: PHI (r8v3 kotlin.io.path.PathTreeWalk) = (r8v11 kotlin.io.path.PathTreeWalk), (r8v12 kotlin.io.path.PathTreeWalk) binds: [B:23:0x00d4, B:18:0x00b5] A[DONT_GENERATE, DONT_INLINE]
  0x00dc: PHI (r9v2 java.nio.file.Path) = (r9v4 java.nio.file.Path), (r9v5 java.nio.file.Path) binds: [B:23:0x00d4, B:18:0x00b5] A[DONT_GENERATE, DONT_INLINE]
  0x00dc: PHI (r15v4 kotlin.io.path.PathTreeWalk$bfsIterator$1) = (r15v5 kotlin.io.path.PathTreeWalk$bfsIterator$1), (r15v6 kotlin.io.path.PathTreeWalk$bfsIterator$1) binds: [B:23:0x00d4, B:18:0x00b5] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:26:0x00f4  */
    /* JADX WARN: Code duplicated, block: B:27:0x00fc  */
    /* JADX WARN: Code duplicated, block: B:29:0x0106  */
    /* JADX WARN: Code duplicated, block: B:37:0x0119 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:38:0x00ab A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:39:0x012d A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:41:0x0080 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:42:0x0080 A[SYNTHETIC] */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:25:0x00f2 -> B:11:0x0080). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:26:0x00f4 -> B:11:0x0080). Please report as a decompilation issue!!! */
    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions count limit reached at block B:17:0x00b1
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @dl.e
    public final java.lang.Object invokeSuspend(@dl.d java.lang.Object r15) {
        /*
            Method dump skipped, instruction units count: 305
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlin.io.path.PathTreeWalk$bfsIterator$1.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
