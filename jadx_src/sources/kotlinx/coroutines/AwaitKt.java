package kotlinx.coroutines;

import com.umeng.analytics.pro.ak;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt__CollectionsKt;

/* JADX INFO: compiled from: Await.kt */
/* JADX INFO: loaded from: classes5.dex */
@Metadata(bv = {}, d1 = {"\u0000*\n\u0000\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\b\u0002\n\u0002\u0010\u001e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u001a?\u0010\u0005\u001a\b\u0012\u0004\u0012\u00028\u00000\u0004\"\u0004\b\u0000\u0010\u00002\u001e\u0010\u0003\u001a\u0010\u0012\f\b\u0001\u0012\b\u0012\u0004\u0012\u00028\u00000\u00020\u0001\"\b\u0012\u0004\u0012\u00028\u00000\u0002H\u0086@ø\u0001\u0000¢\u0006\u0004\b\u0005\u0010\u0006\u001a/\u0010\b\u001a\b\u0012\u0004\u0012\u00028\u00000\u0004\"\u0004\b\u0000\u0010\u0000*\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\u00020\u0007H\u0086@ø\u0001\u0000¢\u0006\u0004\b\b\u0010\t\u001a'\u0010\r\u001a\u00020\f2\u0012\u0010\u000b\u001a\n\u0012\u0006\b\u0001\u0012\u00020\n0\u0001\"\u00020\nH\u0086@ø\u0001\u0000¢\u0006\u0004\b\r\u0010\u000e\u001a\u001d\u0010\u000f\u001a\u00020\f*\b\u0012\u0004\u0012\u00020\n0\u0007H\u0086@ø\u0001\u0000¢\u0006\u0004\b\u000f\u0010\t\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006\u0010"}, d2 = {androidx.exifinterface.media.a.f23244d5, "", "Lkotlinx/coroutines/w0;", "deferreds", "", "b", "([Lkotlinx/coroutines/w0;Lkotlin/coroutines/c;)Ljava/lang/Object;", "", ak.av, "(Ljava/util/Collection;Lkotlin/coroutines/c;)Ljava/lang/Object;", "Lkotlinx/coroutines/d2;", "jobs", "Lkotlin/b2;", "d", "([Lkotlinx/coroutines/d2;Lkotlin/coroutines/c;)Ljava/lang/Object;", ak.aF, "kotlinx-coroutines-core"}, k = 2, mv = {1, 6, 0})
public final class AwaitKt {
    @dl.e
    public static final <T> Object a(@dl.d Collection<? extends w0<? extends T>> collection, @dl.d kotlin.coroutines.c<? super List<? extends T>> cVar) {
        if (collection.isEmpty()) {
            return CollectionsKt__CollectionsKt.E();
        }
        Object[] array = collection.toArray(new w0[0]);
        if (array != null) {
            return new e((w0[]) array).b(cVar);
        }
        throw new NullPointerException("null cannot be cast to non-null type kotlin.Array<T of kotlin.collections.ArraysKt__ArraysJVMKt.toTypedArray>");
    }

    @dl.e
    public static final <T> Object b(@dl.d w0<? extends T>[] w0VarArr, @dl.d kotlin.coroutines.c<? super List<? extends T>> cVar) {
        return w0VarArr.length == 0 ? CollectionsKt__CollectionsKt.E() : new e(w0VarArr).b(cVar);
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    @dl.e
    public static final Object c(@dl.d Collection<? extends d2> collection, @dl.d kotlin.coroutines.c<? super kotlin.b2> cVar) throws Throwable {
        AwaitKt$joinAll$3 awaitKt$joinAll$3;
        Iterator it;
        if (cVar instanceof AwaitKt$joinAll$3) {
            awaitKt$joinAll$3 = (AwaitKt$joinAll$3) cVar;
            int i10 = awaitKt$joinAll$3.f128675d;
            if ((i10 & Integer.MIN_VALUE) != 0) {
                awaitKt$joinAll$3.f128675d = i10 - Integer.MIN_VALUE;
            } else {
                awaitKt$joinAll$3 = new AwaitKt$joinAll$3(cVar);
            }
        } else {
            awaitKt$joinAll$3 = new AwaitKt$joinAll$3(cVar);
        }
        Object obj = awaitKt$joinAll$3.f128674c;
        Object objH = kotlin.coroutines.intrinsics.b.h();
        int i11 = awaitKt$joinAll$3.f128675d;
        if (i11 == 0) {
            kotlin.t0.n(obj);
            it = collection.iterator();
        } else {
            if (i11 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            it = (Iterator) awaitKt$joinAll$3.f128673b;
            kotlin.t0.n(obj);
        }
        while (it.hasNext()) {
            d2 d2Var = (d2) it.next();
            awaitKt$joinAll$3.f128673b = it;
            awaitKt$joinAll$3.f128675d = 1;
            if (d2Var.g0(awaitKt$joinAll$3) == objH) {
                return objH;
            }
        }
        return kotlin.b2.f124493a;
    }

    /* JADX WARN: Code duplicated, block: B:16:0x0045  */
    /* JADX WARN: Code duplicated, block: B:18:0x0055 A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:17:0x0053 -> B:19:0x0056). Please report as a decompilation issue!!! */
    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions stack size limit reached
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    @dl.e
    public static final java.lang.Object d(@dl.d kotlinx.coroutines.d2[] r6, @dl.d kotlin.coroutines.c<? super kotlin.b2> r7) {
        /*
            boolean r0 = r7 instanceof kotlinx.coroutines.AwaitKt$joinAll$1
            if (r0 == 0) goto L13
            r0 = r7
            kotlinx.coroutines.AwaitKt$joinAll$1 r0 = (kotlinx.coroutines.AwaitKt$joinAll$1) r0
            int r1 = r0.f128672f
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f128672f = r1
            goto L18
        L13:
            kotlinx.coroutines.AwaitKt$joinAll$1 r0 = new kotlinx.coroutines.AwaitKt$joinAll$1
            r0.<init>(r7)
        L18:
            java.lang.Object r7 = r0.f128671e
            java.lang.Object r1 = kotlin.coroutines.intrinsics.b.h()
            int r2 = r0.f128672f
            r3 = 1
            if (r2 == 0) goto L3a
            if (r2 != r3) goto L32
            int r6 = r0.f128670d
            int r2 = r0.f128669c
            java.lang.Object r4 = r0.f128668b
            kotlinx.coroutines.d2[] r4 = (kotlinx.coroutines.d2[]) r4
            kotlin.t0.n(r7)
            r7 = r4
            goto L56
        L32:
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            java.lang.String r7 = "call to 'resume' before 'invoke' with coroutine"
            r6.<init>(r7)
            throw r6
        L3a:
            kotlin.t0.n(r7)
            r7 = 0
            int r2 = r6.length
            r5 = r7
            r7 = r6
            r6 = r2
            r2 = r5
        L43:
            if (r2 >= r6) goto L58
            r4 = r7[r2]
            r0.f128668b = r7
            r0.f128669c = r2
            r0.f128670d = r6
            r0.f128672f = r3
            java.lang.Object r4 = r4.g0(r0)
            if (r4 != r1) goto L56
            return r1
        L56:
            int r2 = r2 + r3
            goto L43
        L58:
            kotlin.b2 r6 = kotlin.b2.f124493a
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlinx.coroutines.AwaitKt.d(kotlinx.coroutines.d2[], kotlin.coroutines.c):java.lang.Object");
    }
}
