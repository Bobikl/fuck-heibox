package kotlinx.coroutines.channels;

import kotlin.Metadata;
import kotlin.b2;
import kotlin.coroutines.jvm.internal.SuspendLambda;

/* JADX INFO: Add missing generic type declarations: [E] */
/* JADX INFO: compiled from: Broadcast.kt */
/* JADX INFO: loaded from: classes5.dex */
@Metadata(bv = {}, d1 = {"\u0000\f\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0010\u0003\u001a\u00020\u0002\"\u0004\b\u0000\u0010\u0000*\b\u0012\u0004\u0012\u00028\u00000\u0001H\u008a@"}, d2 = {androidx.exifinterface.media.a.S4, "Lkotlinx/coroutines/channels/w;", "Lkotlin/b2;", "<anonymous>"}, k = 3, mv = {1, 6, 0})
@kotlin.coroutines.jvm.internal.d(c = "kotlinx.coroutines.channels.BroadcastKt$broadcast$2", f = "Broadcast.kt", i = {0, 1}, l = {53, 54}, m = "invokeSuspend", n = {"$this$broadcast", "$this$broadcast"}, s = {"L$0", "L$0"})
public final class BroadcastKt$broadcast$2<E> extends SuspendLambda implements yh.p<w<? super E>, kotlin.coroutines.c<? super b2>, Object> {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    Object f128773b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    int f128774c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private /* synthetic */ Object f128775d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    final /* synthetic */ ReceiveChannel<E> f128776e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    BroadcastKt$broadcast$2(ReceiveChannel<? extends E> receiveChannel, kotlin.coroutines.c<? super BroadcastKt$broadcast$2> cVar) {
        super(2, cVar);
        this.f128776e = receiveChannel;
    }

    @Override // yh.p
    @dl.e
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public final Object invoke(@dl.d w<? super E> wVar, @dl.e kotlin.coroutines.c<? super b2> cVar) {
        return ((BroadcastKt$broadcast$2) create(wVar, cVar)).invokeSuspend(b2.f124493a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @dl.d
    public final kotlin.coroutines.c<b2> create(@dl.e Object obj, @dl.d kotlin.coroutines.c<?> cVar) {
        BroadcastKt$broadcast$2 broadcastKt$broadcast$2 = new BroadcastKt$broadcast$2(this.f128776e, cVar);
        broadcastKt$broadcast$2.f128775d = obj;
        return broadcastKt$broadcast$2;
    }

    /* JADX WARN: Code duplicated, block: B:14:0x004a A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:15:0x004b  */
    /* JADX WARN: Code duplicated, block: B:18:0x0057  */
    /* JADX WARN: Code duplicated, block: B:20:0x0067 A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:21:0x0068  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:21:0x0068 -> B:12:0x003e). Please report as a decompilation issue!!! */
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
            int r1 = r7.f128774c
            r2 = 2
            r3 = 1
            if (r1 == 0) goto L30
            if (r1 == r3) goto L23
            if (r1 != r2) goto L1b
            java.lang.Object r1 = r7.f128773b
            kotlinx.coroutines.channels.ChannelIterator r1 = (kotlinx.coroutines.channels.ChannelIterator) r1
            java.lang.Object r4 = r7.f128775d
            kotlinx.coroutines.channels.w r4 = (kotlinx.coroutines.channels.w) r4
            kotlin.t0.n(r8)
            r8 = r4
            goto L3d
        L1b:
            java.lang.IllegalStateException r8 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r8.<init>(r0)
            throw r8
        L23:
            java.lang.Object r1 = r7.f128773b
            kotlinx.coroutines.channels.ChannelIterator r1 = (kotlinx.coroutines.channels.ChannelIterator) r1
            java.lang.Object r4 = r7.f128775d
            kotlinx.coroutines.channels.w r4 = (kotlinx.coroutines.channels.w) r4
            kotlin.t0.n(r8)
            r5 = r7
            goto L4f
        L30:
            kotlin.t0.n(r8)
            java.lang.Object r8 = r7.f128775d
            kotlinx.coroutines.channels.w r8 = (kotlinx.coroutines.channels.w) r8
            kotlinx.coroutines.channels.ReceiveChannel<E> r1 = r7.f128776e
            kotlinx.coroutines.channels.ChannelIterator r1 = r1.iterator()
        L3d:
            r4 = r7
        L3e:
            r4.f128775d = r8
            r4.f128773b = r1
            r4.f128774c = r3
            java.lang.Object r5 = r1.b(r4)
            if (r5 != r0) goto L4b
            return r0
        L4b:
            r6 = r4
            r4 = r8
            r8 = r5
            r5 = r6
        L4f:
            java.lang.Boolean r8 = (java.lang.Boolean) r8
            boolean r8 = r8.booleanValue()
            if (r8 == 0) goto L6b
            java.lang.Object r8 = r1.next()
            r5.f128775d = r4
            r5.f128773b = r1
            r5.f128774c = r2
            java.lang.Object r8 = r4.X(r8, r5)
            if (r8 != r0) goto L68
            return r0
        L68:
            r8 = r4
            r4 = r5
            goto L3e
        L6b:
            kotlin.b2 r8 = kotlin.b2.f124493a
            return r8
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlinx.coroutines.channels.BroadcastKt$broadcast$2.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
