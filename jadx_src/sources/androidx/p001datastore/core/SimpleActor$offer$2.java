package androidx.p001datastore.core;

import androidx.exifinterface.media.a;
import dl.e;
import kotlin.Metadata;
import kotlin.b2;
import kotlin.coroutines.c;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.coroutines.jvm.internal.d;
import kotlinx.coroutines.q0;
import yh.p;

/* JADX INFO: compiled from: SimpleActor.kt */
/* JADX INFO: loaded from: classes.dex */
@Metadata(bv = {}, d1 = {"\u0000\f\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0010\u0003\u001a\u00020\u0002\"\u0004\b\u0000\u0010\u0000*\u00020\u0001H\u008a@"}, d2 = {a.f23244d5, "Lkotlinx/coroutines/q0;", "Lkotlin/b2;", "<anonymous>"}, k = 3, mv = {1, 5, 1})
@d(c = "androidx.datastore.core.SimpleActor$offer$2", f = "SimpleActor.kt", i = {}, l = {122, 122}, m = "invokeSuspend", n = {}, s = {})
public final class SimpleActor$offer$2 extends SuspendLambda implements p<q0, c<? super b2>, Object> {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    Object f22071b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    int f22072c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    final /* synthetic */ SimpleActor<T> f22073d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    SimpleActor$offer$2(SimpleActor<T> simpleActor, c<? super SimpleActor$offer$2> cVar) {
        super(2, cVar);
        this.f22073d = simpleActor;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @dl.d
    public final c<b2> create(@e Object obj, @dl.d c<?> cVar) {
        return new SimpleActor$offer$2(this.f22073d, cVar);
    }

    @Override // yh.p
    @e
    public final Object invoke(@dl.d q0 q0Var, @e c<? super b2> cVar) {
        return ((SimpleActor$offer$2) create(q0Var, cVar)).invokeSuspend(b2.f124493a);
    }

    /* JADX WARN: Code duplicated, block: B:18:0x005a A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:19:0x005b  */
    /* JADX WARN: Code duplicated, block: B:22:0x006b A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:23:0x006c  */
    /* JADX WARN: Code duplicated, block: B:26:0x007a  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:23:0x006c -> B:24:0x006e). Please report as a decompilation issue!!! */
    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions stack size limit reached
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @dl.e
    public final java.lang.Object invokeSuspend(@dl.d java.lang.Object r8) {
        /*
            r7 = this;
            java.lang.Object r0 = kotlin.coroutines.intrinsics.b.h()
            int r1 = r7.f22072c
            r2 = 2
            r3 = 1
            if (r1 == 0) goto L26
            if (r1 == r3) goto L1b
            if (r1 != r2) goto L13
            kotlin.t0.n(r8)
            r8 = r7
            goto L6e
        L13:
            java.lang.IllegalStateException r8 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r8.<init>(r0)
            throw r8
        L1b:
            java.lang.Object r1 = r7.f22071b
            yh.p r1 = (yh.p) r1
            kotlin.t0.n(r8)
            r4 = r1
            r1 = r0
            r0 = r7
            goto L60
        L26:
            kotlin.t0.n(r8)
            androidx.datastore.core.SimpleActor<T> r8 = r7.f22073d
            java.util.concurrent.atomic.AtomicInteger r8 = androidx.p001datastore.core.SimpleActor.c(r8)
            int r8 = r8.get()
            if (r8 <= 0) goto L37
            r8 = r3
            goto L38
        L37:
            r8 = 0
        L38:
            if (r8 == 0) goto L7d
            r8 = r7
        L3b:
            androidx.datastore.core.SimpleActor<T> r1 = r8.f22073d
            kotlinx.coroutines.q0 r1 = androidx.p001datastore.core.SimpleActor.d(r1)
            kotlinx.coroutines.r0.j(r1)
            androidx.datastore.core.SimpleActor<T> r1 = r8.f22073d
            yh.p r1 = androidx.p001datastore.core.SimpleActor.a(r1)
            androidx.datastore.core.SimpleActor<T> r4 = r8.f22073d
            kotlinx.coroutines.channels.k r4 = androidx.p001datastore.core.SimpleActor.b(r4)
            r8.f22071b = r1
            r8.f22072c = r3
            java.lang.Object r4 = r4.h(r8)
            if (r4 != r0) goto L5b
            return r0
        L5b:
            r6 = r0
            r0 = r8
            r8 = r4
            r4 = r1
            r1 = r6
        L60:
            r5 = 0
            r0.f22071b = r5
            r0.f22072c = r2
            java.lang.Object r8 = r4.invoke(r8, r0)
            if (r8 != r1) goto L6c
            return r1
        L6c:
            r8 = r0
            r0 = r1
        L6e:
            androidx.datastore.core.SimpleActor<T> r1 = r8.f22073d
            java.util.concurrent.atomic.AtomicInteger r1 = androidx.p001datastore.core.SimpleActor.c(r1)
            int r1 = r1.decrementAndGet()
            if (r1 != 0) goto L3b
            kotlin.b2 r8 = kotlin.b2.f124493a
            return r8
        L7d:
            java.lang.IllegalStateException r8 = new java.lang.IllegalStateException
            java.lang.String r0 = "Check failed."
            java.lang.String r0 = r0.toString()
            r8.<init>(r0)
            throw r8
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.p001datastore.core.SimpleActor$offer$2.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
