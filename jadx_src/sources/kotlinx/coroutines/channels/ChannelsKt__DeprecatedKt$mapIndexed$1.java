package kotlinx.coroutines.channels;

import com.starlightc.ucropplus.ui.UCropPlusActivity;
import kotlin.Metadata;
import kotlin.b2;
import kotlin.coroutines.jvm.internal.SuspendLambda;

/* JADX INFO: Add missing generic type declarations: [R] */
/* JADX INFO: compiled from: Deprecated.kt */
/* JADX INFO: loaded from: classes5.dex */
@Metadata(bv = {}, d1 = {"\u0000\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0010\u0004\u001a\u00020\u0003\"\u0004\b\u0000\u0010\u0000\"\u0004\b\u0001\u0010\u0001*\b\u0012\u0004\u0012\u00028\u00010\u0002H\u008a@"}, d2 = {androidx.exifinterface.media.a.S4, "R", "Lkotlinx/coroutines/channels/w;", "Lkotlin/b2;", "<anonymous>"}, k = 3, mv = {1, 6, 0})
@kotlin.coroutines.jvm.internal.d(c = "kotlinx.coroutines.channels.ChannelsKt__DeprecatedKt$mapIndexed$1", f = "Deprecated.kt", i = {0, 0, 1, 1, 2, 2}, l = {bb.c.b.G3, bb.c.b.H3, bb.c.b.H3}, m = "invokeSuspend", n = {"$this$produce", UCropPlusActivity.ARG_INDEX, "$this$produce", UCropPlusActivity.ARG_INDEX, "$this$produce", UCropPlusActivity.ARG_INDEX}, s = {"L$0", "I$0", "L$0", "I$0", "L$0", "I$0"})
public final class ChannelsKt__DeprecatedKt$mapIndexed$1<R> extends SuspendLambda implements yh.p<w<? super R>, kotlin.coroutines.c<? super b2>, Object> {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    Object f128918b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    Object f128919c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    int f128920d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    int f128921e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private /* synthetic */ Object f128922f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    final /* synthetic */ ReceiveChannel<E> f128923g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    final /* synthetic */ yh.q<Integer, E, kotlin.coroutines.c<? super R>, Object> f128924h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    ChannelsKt__DeprecatedKt$mapIndexed$1(ReceiveChannel<? extends E> receiveChannel, yh.q<? super Integer, ? super E, ? super kotlin.coroutines.c<? super R>, ? extends Object> qVar, kotlin.coroutines.c<? super ChannelsKt__DeprecatedKt$mapIndexed$1> cVar) {
        super(2, cVar);
        this.f128923g = receiveChannel;
        this.f128924h = qVar;
    }

    @Override // yh.p
    @dl.e
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public final Object invoke(@dl.d w<? super R> wVar, @dl.e kotlin.coroutines.c<? super b2> cVar) {
        return ((ChannelsKt__DeprecatedKt$mapIndexed$1) create(wVar, cVar)).invokeSuspend(b2.f124493a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @dl.d
    public final kotlin.coroutines.c<b2> create(@dl.e Object obj, @dl.d kotlin.coroutines.c<?> cVar) {
        ChannelsKt__DeprecatedKt$mapIndexed$1 channelsKt__DeprecatedKt$mapIndexed$1 = new ChannelsKt__DeprecatedKt$mapIndexed$1(this.f128923g, this.f128924h, cVar);
        channelsKt__DeprecatedKt$mapIndexed$1.f128922f = obj;
        return channelsKt__DeprecatedKt$mapIndexed$1;
    }

    /* JADX WARN: Code duplicated, block: B:16:0x0067 A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:17:0x0068  */
    /* JADX WARN: Code duplicated, block: B:20:0x0074  */
    /* JADX WARN: Code duplicated, block: B:22:0x0090 A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:23:0x0091  */
    /* JADX WARN: Code duplicated, block: B:26:0x00a7 A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:27:0x00a8  */
    /* JADX WARN: Type inference incomplete: some casts might be missing */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:27:0x00a8 -> B:14:0x0059). Please report as a decompilation issue!!! */
    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions stack size limit reached
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @dl.e
    public final java.lang.Object invokeSuspend(@dl.d java.lang.Object r12) {
        /*
            r11 = this;
            java.lang.Object r0 = kotlin.coroutines.intrinsics.b.h()
            int r1 = r11.f128921e
            r2 = 3
            r3 = 2
            r4 = 1
            if (r1 == 0) goto L4a
            if (r1 == r4) goto L3b
            if (r1 == r3) goto L28
            if (r1 != r2) goto L20
            int r1 = r11.f128920d
            java.lang.Object r5 = r11.f128918b
            kotlinx.coroutines.channels.ChannelIterator r5 = (kotlinx.coroutines.channels.ChannelIterator) r5
            java.lang.Object r6 = r11.f128922f
            kotlinx.coroutines.channels.w r6 = (kotlinx.coroutines.channels.w) r6
            kotlin.t0.n(r12)
            r12 = r6
            goto L58
        L20:
            java.lang.IllegalStateException r12 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r12.<init>(r0)
            throw r12
        L28:
            int r1 = r11.f128920d
            java.lang.Object r5 = r11.f128919c
            kotlinx.coroutines.channels.w r5 = (kotlinx.coroutines.channels.w) r5
            java.lang.Object r6 = r11.f128918b
            kotlinx.coroutines.channels.ChannelIterator r6 = (kotlinx.coroutines.channels.ChannelIterator) r6
            java.lang.Object r7 = r11.f128922f
            kotlinx.coroutines.channels.w r7 = (kotlinx.coroutines.channels.w) r7
            kotlin.t0.n(r12)
            r8 = r11
            goto L96
        L3b:
            int r1 = r11.f128920d
            java.lang.Object r5 = r11.f128918b
            kotlinx.coroutines.channels.ChannelIterator r5 = (kotlinx.coroutines.channels.ChannelIterator) r5
            java.lang.Object r6 = r11.f128922f
            kotlinx.coroutines.channels.w r6 = (kotlinx.coroutines.channels.w) r6
            kotlin.t0.n(r12)
            r7 = r11
            goto L6c
        L4a:
            kotlin.t0.n(r12)
            java.lang.Object r12 = r11.f128922f
            kotlinx.coroutines.channels.w r12 = (kotlinx.coroutines.channels.w) r12
            r1 = 0
            kotlinx.coroutines.channels.ReceiveChannel<E> r5 = r11.f128923g
            kotlinx.coroutines.channels.ChannelIterator r5 = r5.iterator()
        L58:
            r6 = r11
        L59:
            r6.f128922f = r12
            r6.f128918b = r5
            r6.f128920d = r1
            r6.f128921e = r4
            java.lang.Object r7 = r5.b(r6)
            if (r7 != r0) goto L68
            return r0
        L68:
            r10 = r6
            r6 = r12
            r12 = r7
            r7 = r10
        L6c:
            java.lang.Boolean r12 = (java.lang.Boolean) r12
            boolean r12 = r12.booleanValue()
            if (r12 == 0) goto Lac
            java.lang.Object r12 = r5.next()
            yh.q<java.lang.Integer, E, kotlin.coroutines.c<? super R>, java.lang.Object> r8 = r7.f128924h
            int r9 = r1 + 1
            java.lang.Integer r1 = kotlin.coroutines.jvm.internal.a.f(r1)
            r7.f128922f = r6
            r7.f128918b = r5
            r7.f128919c = r6
            r7.f128920d = r9
            r7.f128921e = r3
            java.lang.Object r12 = r8.invoke(r1, r12, r7)
            if (r12 != r0) goto L91
            return r0
        L91:
            r8 = r7
            r1 = r9
            r7 = r6
            r6 = r5
            r5 = r7
        L96:
            r8.f128922f = r7
            r8.f128918b = r6
            r9 = 0
            r8.f128919c = r9
            r8.f128920d = r1
            r8.f128921e = r2
            java.lang.Object r12 = r5.X(r12, r8)
            if (r12 != r0) goto La8
            return r0
        La8:
            r5 = r6
            r12 = r7
            r6 = r8
            goto L59
        Lac:
            kotlin.b2 r12 = kotlin.b2.f124493a
            return r12
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlinx.coroutines.channels.ChannelsKt__DeprecatedKt$mapIndexed$1.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
