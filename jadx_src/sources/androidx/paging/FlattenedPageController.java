package androidx.paging;

import com.umeng.analytics.pro.ak;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt__CollectionsKt;
import kotlinx.coroutines.sync.MutexKt;

/* JADX INFO: compiled from: CachedPageEventFlow.kt */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(bv = {}, d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0002\u0018\u0000*\b\b\u0000\u0010\u0002*\u00020\u00012\u00020\u0001B\u0007¢\u0006\u0004\b\u0016\u0010\u0017J'\u0010\u0007\u001a\u00020\u00062\u0012\u0010\u0005\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\u00040\u0003H\u0086@ø\u0001\u0000¢\u0006\u0004\b\u0007\u0010\bJ\u0019\u0010\n\u001a\b\u0012\u0004\u0012\u00028\u00000\tH\u0086@ø\u0001\u0000¢\u0006\u0004\b\n\u0010\u000bR\u001a\u0010\u000e\u001a\b\u0012\u0004\u0012\u00028\u00000\f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\n\u0010\rR\"\u0010\u0011\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\t0\u000f8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0007\u0010\u0010R\u0014\u0010\u0015\u001a\u00020\u00128\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0013\u0010\u0014\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006\u0018"}, d2 = {"Landroidx/paging/FlattenedPageController;", "", androidx.exifinterface.media.a.f23244d5, "Lkotlin/collections/h0;", "Landroidx/paging/PageEvent;", androidx.core.app.o0.I0, "Lkotlin/b2;", "b", "(Lkotlin/collections/h0;Lkotlin/coroutines/c;)Ljava/lang/Object;", "Landroidx/paging/TemporaryDownstream;", ak.av, "(Lkotlin/coroutines/c;)Ljava/lang/Object;", "Landroidx/paging/i;", "Landroidx/paging/i;", "list", "", "Ljava/util/List;", "snapshots", "Lkotlinx/coroutines/sync/c;", ak.aF, "Lkotlinx/coroutines/sync/c;", "lock", "<init>", "()V", "paging-common"}, k = 1, mv = {1, 4, 2})
public final class FlattenedPageController<T> {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final i<T> list = new i<>();

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    private List<TemporaryDownstream<T>> snapshots = CollectionsKt__CollectionsKt.E();

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    private final kotlinx.coroutines.sync.c lock = MutexKt.b(false, 1, null);

    /* JADX WARN: Code duplicated, block: B:27:0x0086 A[Catch: all -> 0x0040, TryCatch #0 {all -> 0x0040, blocks: (B:13:0x003b, B:25:0x0080, B:27:0x0086, B:29:0x008e, B:30:0x0091, B:24:0x006c), top: B:38:0x0023 }] */
    /* JADX WARN: Code duplicated, block: B:29:0x008e A[Catch: all -> 0x0040, TryCatch #0 {all -> 0x0040, blocks: (B:13:0x003b, B:25:0x0080, B:27:0x0086, B:29:0x008e, B:30:0x0091, B:24:0x006c), top: B:38:0x0023 }] */
    /* JADX WARN: Code duplicated, block: B:33:0x00b4 A[LOOP:0: B:25:0x0080->B:33:0x00b4, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:41:0x00b3 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    @dl.e
    public final Object a(@dl.d kotlin.coroutines.c<? super TemporaryDownstream<T>> cVar) throws Throwable {
        FlattenedPageController$createTemporaryDownstream$1 flattenedPageController$createTemporaryDownstream$1;
        FlattenedPageController<T> flattenedPageController;
        kotlinx.coroutines.sync.c cVar2;
        TemporaryDownstream temporaryDownstream;
        TemporaryDownstream temporaryDownstream2;
        int i10;
        Iterator<T> it;
        int i11;
        kotlin.collections.h0<? extends PageEvent<T>> h0Var;
        if (cVar instanceof FlattenedPageController$createTemporaryDownstream$1) {
            flattenedPageController$createTemporaryDownstream$1 = (FlattenedPageController$createTemporaryDownstream$1) cVar;
            int i12 = flattenedPageController$createTemporaryDownstream$1.f25523c;
            if ((i12 & Integer.MIN_VALUE) != 0) {
                flattenedPageController$createTemporaryDownstream$1.f25523c = i12 - Integer.MIN_VALUE;
            } else {
                flattenedPageController$createTemporaryDownstream$1 = new FlattenedPageController$createTemporaryDownstream$1(this, cVar);
            }
        } else {
            flattenedPageController$createTemporaryDownstream$1 = new FlattenedPageController$createTemporaryDownstream$1(this, cVar);
        }
        Object obj = flattenedPageController$createTemporaryDownstream$1.f25522b;
        Object objH = kotlin.coroutines.intrinsics.b.h();
        int i13 = flattenedPageController$createTemporaryDownstream$1.f25523c;
        try {
            if (i13 != 0) {
                if (i13 == 1) {
                    kotlinx.coroutines.sync.c cVar3 = (kotlinx.coroutines.sync.c) flattenedPageController$createTemporaryDownstream$1.f25526f;
                    flattenedPageController = (FlattenedPageController) flattenedPageController$createTemporaryDownstream$1.f25525e;
                    kotlin.t0.n(obj);
                    cVar2 = cVar3;
                } else {
                    if (i13 != 2) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    int i14 = flattenedPageController$createTemporaryDownstream$1.f25529i;
                    it = (Iterator) flattenedPageController$createTemporaryDownstream$1.f25528h;
                    temporaryDownstream = (TemporaryDownstream) flattenedPageController$createTemporaryDownstream$1.f25527g;
                    temporaryDownstream2 = (TemporaryDownstream) flattenedPageController$createTemporaryDownstream$1.f25526f;
                    cVar2 = (kotlinx.coroutines.sync.c) flattenedPageController$createTemporaryDownstream$1.f25525e;
                    kotlin.t0.n(obj);
                    i10 = i14;
                }
                while (it.hasNext()) {
                    T next = it.next();
                    i11 = i10 + 1;
                    if (i10 < 0) {
                        CollectionsKt__CollectionsKt.W();
                    }
                    h0Var = new kotlin.collections.h0<>(kotlin.coroutines.jvm.internal.a.f(i10).intValue() - Integer.MIN_VALUE, (PageEvent) next);
                    flattenedPageController$createTemporaryDownstream$1.f25525e = cVar2;
                    flattenedPageController$createTemporaryDownstream$1.f25526f = temporaryDownstream2;
                    flattenedPageController$createTemporaryDownstream$1.f25527g = temporaryDownstream;
                    flattenedPageController$createTemporaryDownstream$1.f25528h = it;
                    flattenedPageController$createTemporaryDownstream$1.f25529i = i11;
                    flattenedPageController$createTemporaryDownstream$1.f25523c = 2;
                    if (temporaryDownstream.c(h0Var, flattenedPageController$createTemporaryDownstream$1) == objH) {
                        return objH;
                    }
                    i10 = i11;
                }
                cVar2.f(null);
                return temporaryDownstream2;
            }
            kotlin.t0.n(obj);
            kotlinx.coroutines.sync.c cVar4 = this.lock;
            flattenedPageController$createTemporaryDownstream$1.f25525e = this;
            flattenedPageController$createTemporaryDownstream$1.f25526f = cVar4;
            flattenedPageController$createTemporaryDownstream$1.f25523c = 1;
            if (cVar4.e(null, flattenedPageController$createTemporaryDownstream$1) == objH) {
                return objH;
            }
            flattenedPageController = this;
            cVar2 = cVar4;
            temporaryDownstream = new TemporaryDownstream();
            temporaryDownstream2 = temporaryDownstream;
            i10 = 0;
            it = flattenedPageController.list.b().iterator();
            while (it.hasNext()) {
                T next2 = it.next();
                i11 = i10 + 1;
                if (i10 < 0) {
                    CollectionsKt__CollectionsKt.W();
                }
                h0Var = new kotlin.collections.h0<>(kotlin.coroutines.jvm.internal.a.f(i10).intValue() - Integer.MIN_VALUE, (PageEvent) next2);
                flattenedPageController$createTemporaryDownstream$1.f25525e = cVar2;
                flattenedPageController$createTemporaryDownstream$1.f25526f = temporaryDownstream2;
                flattenedPageController$createTemporaryDownstream$1.f25527g = temporaryDownstream;
                flattenedPageController$createTemporaryDownstream$1.f25528h = it;
                flattenedPageController$createTemporaryDownstream$1.f25529i = i11;
                flattenedPageController$createTemporaryDownstream$1.f25523c = 2;
                if (temporaryDownstream.c(h0Var, flattenedPageController$createTemporaryDownstream$1) == objH) {
                    return objH;
                }
                i10 = i11;
            }
            cVar2.f(null);
            return temporaryDownstream2;
        } catch (Throwable th2) {
            cVar2.f(null);
            throw th2;
        }
    }

    /* JADX WARN: Code duplicated, block: B:27:0x0097 A[Catch: all -> 0x0044, TryCatch #0 {all -> 0x0044, blocks: (B:13:0x003f, B:30:0x00b3, B:25:0x0091, B:27:0x0097, B:33:0x00c7, B:32:0x00c3, B:24:0x0077), top: B:38:0x0023 }] */
    /* JADX WARN: Code duplicated, block: B:29:0x00b2 A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:32:0x00c3 A[Catch: all -> 0x0044, TryCatch #0 {all -> 0x0044, blocks: (B:13:0x003f, B:30:0x00b3, B:25:0x0091, B:27:0x0097, B:33:0x00c7, B:32:0x00c3, B:24:0x0077), top: B:38:0x0023 }] */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:28:0x00b0 -> B:30:0x00b3). Please report as a decompilation issue!!! */
    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions stack size limit reached
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    @dl.e
    public final java.lang.Object b(@dl.d kotlin.collections.h0<? extends androidx.paging.PageEvent<T>> r10, @dl.d kotlin.coroutines.c<? super kotlin.b2> r11) {
        /*
            Method dump skipped, instruction units count: 213
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.paging.FlattenedPageController.b(kotlin.collections.h0, kotlin.coroutines.c):java.lang.Object");
    }
}
