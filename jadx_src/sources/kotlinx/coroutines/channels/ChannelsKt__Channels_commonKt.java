package kotlinx.coroutines.channels;

import com.ss.bytertc.base.media.screen.RXScreenCaptureService;
import com.umeng.analytics.pro.ak;
import java.util.concurrent.CancellationException;
import kotlin.DeprecationLevel;
import kotlin.Metadata;
import kotlin.b2;
import kotlin.r0;
import kotlin.s0;
import kotlinx.coroutines.q1;
import kotlinx.coroutines.s2;

/* JADX INFO: compiled from: Channels.common.kt */
/* JADX INFO: loaded from: classes5.dex */
@Metadata(bv = {}, d1 = {"\u0000H\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\b\u0003\n\u0002\u0010\u0003\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\u001aE\u0010\u0007\u001a\u00028\u0001\"\u0004\b\u0000\u0010\u0000\"\u0004\b\u0001\u0010\u0001*\b\u0012\u0004\u0012\u00028\u00000\u00022\u001d\u0010\u0006\u001a\u0019\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\u0004\u0012\u0004\u0012\u00028\u00010\u0003¢\u0006\u0002\b\u0005H\u0087\b¢\u0006\u0004\b\u0007\u0010\b\u001a)\u0010\n\u001a\u0004\u0018\u00018\u0000\"\b\b\u0000\u0010\u0000*\u00020\t*\b\u0012\u0004\u0012\u00028\u00000\u0004H\u0087@ø\u0001\u0000¢\u0006\u0004\b\n\u0010\u000b\u001a$\u0010\r\u001a\n\u0012\u0006\u0012\u0004\u0018\u00018\u00000\f\"\b\b\u0000\u0010\u0000*\u00020\t*\b\u0012\u0004\u0012\u00028\u00000\u0004H\u0007\u001aR\u0010\u000e\u001a\u00028\u0001\"\u0004\b\u0000\u0010\u0000\"\u0004\b\u0001\u0010\u0001*\b\u0012\u0004\u0012\u00028\u00000\u00042\u001d\u0010\u0006\u001a\u0019\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\u0004\u0012\u0004\u0012\u00028\u00010\u0003¢\u0006\u0002\b\u0005H\u0086\b\u0082\u0002\n\n\b\b\u0001\u0012\u0002\u0010\u0001 \u0001¢\u0006\u0004\b\u000e\u0010\u000f\u001a7\u0010\u0012\u001a\u00020\u0010\"\u0004\b\u0000\u0010\u0000*\b\u0012\u0004\u0012\u00028\u00000\u00042\u0012\u0010\u0011\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00020\u00100\u0003H\u0086Hø\u0001\u0000¢\u0006\u0004\b\u0012\u0010\u0013\u001a)\u0010\u0015\u001a\b\u0012\u0004\u0012\u00028\u00000\u0014\"\u0004\b\u0000\u0010\u0000*\b\u0012\u0004\u0012\u00028\u00000\u0004H\u0086@ø\u0001\u0000¢\u0006\u0004\b\u0015\u0010\u000b\u001a7\u0010\u0016\u001a\u00020\u0010\"\u0004\b\u0000\u0010\u0000*\b\u0012\u0004\u0012\u00028\u00000\u00022\u0012\u0010\u0011\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00020\u00100\u0003H\u0087Hø\u0001\u0000¢\u0006\u0004\b\u0016\u0010\u0017\u001a\u001a\u0010\u001a\u001a\u00020\u0010*\u0006\u0012\u0002\b\u00030\u00042\b\u0010\u0019\u001a\u0004\u0018\u00010\u0018H\u0001\"\u0014\u0010\u001c\u001a\u00020\u001b8\u0000X\u0080T¢\u0006\u0006\n\u0004\b\u001c\u0010\u001d\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006\u001e"}, d2 = {androidx.exifinterface.media.a.S4, "R", "Lkotlinx/coroutines/channels/h;", "Lkotlin/Function1;", "Lkotlinx/coroutines/channels/ReceiveChannel;", "Lkotlin/t;", "block", "b", "(Lkotlinx/coroutines/channels/h;Lyh/l;)Ljava/lang/Object;", "", "i", "(Lkotlinx/coroutines/channels/ReceiveChannel;Lkotlin/coroutines/c;)Ljava/lang/Object;", "Lkotlinx/coroutines/selects/d;", RXScreenCaptureService.KEY_HEIGHT, ak.aF, "(Lkotlinx/coroutines/channels/ReceiveChannel;Lyh/l;)Ljava/lang/Object;", "Lkotlin/b2;", "action", "e", "(Lkotlinx/coroutines/channels/ReceiveChannel;Lyh/l;Lkotlin/coroutines/c;)Ljava/lang/Object;", "", "j", "d", "(Lkotlinx/coroutines/channels/h;Lyh/l;Lkotlin/coroutines/c;)Ljava/lang/Object;", "", "cause", ak.av, "", "DEFAULT_CLOSE_MESSAGE", "Ljava/lang/String;", "kotlinx-coroutines-core"}, k = 5, mv = {1, 6, 0}, xs = "kotlinx/coroutines/channels/ChannelsKt")
public final /* synthetic */ class ChannelsKt__Channels_commonKt {
    @r0
    public static final void a(@dl.d ReceiveChannel<?> receiveChannel, @dl.e Throwable th2) {
        CancellationException cancellationExceptionA = null;
        if (th2 != null) {
            cancellationExceptionA = th2 instanceof CancellationException ? (CancellationException) th2 : null;
            if (cancellationExceptionA == null) {
                cancellationExceptionA = q1.a("Channel was consumed, consumer had failed", th2);
            }
        }
        receiveChannel.e(cancellationExceptionA);
    }

    @s2
    public static final <E, R> R b(@dl.d h<E> hVar, @dl.d yh.l<? super ReceiveChannel<? extends E>, ? extends R> lVar) {
        ReceiveChannel<E> receiveChannelU = hVar.u();
        try {
            return lVar.invoke(receiveChannelU);
        } finally {
            kotlin.jvm.internal.c0.d(1);
            ReceiveChannel.DefaultImpls.b(receiveChannelU, null, 1, null);
            kotlin.jvm.internal.c0.c(1);
        }
    }

    public static final <E, R> R c(@dl.d ReceiveChannel<? extends E> receiveChannel, @dl.d yh.l<? super ReceiveChannel<? extends E>, ? extends R> lVar) {
        try {
            R rInvoke = lVar.invoke(receiveChannel);
            kotlin.jvm.internal.c0.d(1);
            o.b(receiveChannel, null);
            kotlin.jvm.internal.c0.c(1);
            return rInvoke;
        } catch (Throwable th2) {
            try {
                throw th2;
            } catch (Throwable th3) {
                kotlin.jvm.internal.c0.d(1);
                o.b(receiveChannel, th2);
                kotlin.jvm.internal.c0.c(1);
                throw th3;
            }
        }
    }

    /* JADX WARN: Code duplicated, block: B:24:0x0061 A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:25:0x0062  */
    /* JADX WARN: Code duplicated, block: B:28:0x006e A[Catch: all -> 0x0085, TryCatch #0 {all -> 0x0085, blocks: (B:26:0x0066, B:28:0x006e, B:29:0x0079), top: B:40:0x0066 }] */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:25:0x0062 -> B:14:0x0038). Please report as a decompilation issue!!! */
    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions stack size limit reached
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    @kotlinx.coroutines.s2
    @dl.e
    public static final <E> java.lang.Object d(@dl.d kotlinx.coroutines.channels.h<E> r6, @dl.d yh.l<? super E, kotlin.b2> r7, @dl.d kotlin.coroutines.c<? super kotlin.b2> r8) {
        /*
            boolean r0 = r8 instanceof kotlinx.coroutines.channels.ChannelsKt__Channels_commonKt$consumeEach$3
            if (r0 == 0) goto L13
            r0 = r8
            kotlinx.coroutines.channels.ChannelsKt__Channels_commonKt$consumeEach$3 r0 = (kotlinx.coroutines.channels.ChannelsKt__Channels_commonKt$consumeEach$3) r0
            int r1 = r0.f128796f
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f128796f = r1
            goto L18
        L13:
            kotlinx.coroutines.channels.ChannelsKt__Channels_commonKt$consumeEach$3 r0 = new kotlinx.coroutines.channels.ChannelsKt__Channels_commonKt$consumeEach$3
            r0.<init>(r8)
        L18:
            java.lang.Object r8 = r0.f128795e
            java.lang.Object r1 = kotlin.coroutines.intrinsics.b.h()
            int r2 = r0.f128796f
            r3 = 0
            r4 = 1
            if (r2 == 0) goto L45
            if (r2 != r4) goto L3d
            java.lang.Object r6 = r0.f128794d
            kotlinx.coroutines.channels.ChannelIterator r6 = (kotlinx.coroutines.channels.ChannelIterator) r6
            java.lang.Object r7 = r0.f128793c
            kotlinx.coroutines.channels.ReceiveChannel r7 = (kotlinx.coroutines.channels.ReceiveChannel) r7
            java.lang.Object r2 = r0.f128792b
            yh.l r2 = (yh.l) r2
            kotlin.t0.n(r8)     // Catch: java.lang.Throwable -> L3b
            r5 = r0
            r0 = r7
            r7 = r2
        L38:
            r2 = r1
            r1 = r5
            goto L66
        L3b:
            r6 = move-exception
            goto L8f
        L3d:
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            java.lang.String r7 = "call to 'resume' before 'invoke' with coroutine"
            r6.<init>(r7)
            throw r6
        L45:
            kotlin.t0.n(r8)
            kotlinx.coroutines.channels.ReceiveChannel r6 = r6.u()
            kotlinx.coroutines.channels.ChannelIterator r8 = r6.iterator()     // Catch: java.lang.Throwable -> L8b
            r5 = r8
            r8 = r6
            r6 = r5
        L53:
            r0.f128792b = r7     // Catch: java.lang.Throwable -> L88
            r0.f128793c = r8     // Catch: java.lang.Throwable -> L88
            r0.f128794d = r6     // Catch: java.lang.Throwable -> L88
            r0.f128796f = r4     // Catch: java.lang.Throwable -> L88
            java.lang.Object r2 = r6.b(r0)     // Catch: java.lang.Throwable -> L88
            if (r2 != r1) goto L62
            return r1
        L62:
            r5 = r0
            r0 = r8
            r8 = r2
            goto L38
        L66:
            java.lang.Boolean r8 = (java.lang.Boolean) r8     // Catch: java.lang.Throwable -> L85
            boolean r8 = r8.booleanValue()     // Catch: java.lang.Throwable -> L85
            if (r8 == 0) goto L79
            java.lang.Object r8 = r6.next()     // Catch: java.lang.Throwable -> L85
            r7.invoke(r8)     // Catch: java.lang.Throwable -> L85
            r8 = r0
            r0 = r1
            r1 = r2
            goto L53
        L79:
            kotlin.b2 r6 = kotlin.b2.f124493a     // Catch: java.lang.Throwable -> L85
            kotlin.jvm.internal.c0.d(r4)
            kotlinx.coroutines.channels.ReceiveChannel.DefaultImpls.b(r0, r3, r4, r3)
            kotlin.jvm.internal.c0.c(r4)
            return r6
        L85:
            r6 = move-exception
            r7 = r0
            goto L8f
        L88:
            r6 = move-exception
            r7 = r8
            goto L8f
        L8b:
            r7 = move-exception
            r5 = r7
            r7 = r6
            r6 = r5
        L8f:
            kotlin.jvm.internal.c0.d(r4)
            kotlinx.coroutines.channels.ReceiveChannel.DefaultImpls.b(r7, r3, r4, r3)
            kotlin.jvm.internal.c0.c(r4)
            throw r6
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlinx.coroutines.channels.ChannelsKt__Channels_commonKt.d(kotlinx.coroutines.channels.h, yh.l, kotlin.coroutines.c):java.lang.Object");
    }

    /* JADX WARN: Code duplicated, block: B:23:0x0058 A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:24:0x0059  */
    /* JADX WARN: Code duplicated, block: B:27:0x0065 A[Catch: all -> 0x0035, TryCatch #0 {all -> 0x0035, blocks: (B:12:0x0031, B:25:0x005c, B:27:0x0065, B:21:0x004a, B:28:0x006e), top: B:37:0x0031 }] */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:24:0x0059 -> B:25:0x005c). Please report as a decompilation issue!!! */
    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions stack size limit reached
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    @dl.e
    public static final <E> java.lang.Object e(@dl.d kotlinx.coroutines.channels.ReceiveChannel<? extends E> r6, @dl.d yh.l<? super E, kotlin.b2> r7, @dl.d kotlin.coroutines.c<? super kotlin.b2> r8) {
        /*
            boolean r0 = r8 instanceof kotlinx.coroutines.channels.ChannelsKt__Channels_commonKt$consumeEach$1
            if (r0 == 0) goto L13
            r0 = r8
            kotlinx.coroutines.channels.ChannelsKt__Channels_commonKt$consumeEach$1 r0 = (kotlinx.coroutines.channels.ChannelsKt__Channels_commonKt$consumeEach$1) r0
            int r1 = r0.f128791f
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f128791f = r1
            goto L18
        L13:
            kotlinx.coroutines.channels.ChannelsKt__Channels_commonKt$consumeEach$1 r0 = new kotlinx.coroutines.channels.ChannelsKt__Channels_commonKt$consumeEach$1
            r0.<init>(r8)
        L18:
            java.lang.Object r8 = r0.f128790e
            java.lang.Object r1 = kotlin.coroutines.intrinsics.b.h()
            int r2 = r0.f128791f
            r3 = 1
            if (r2 == 0) goto L3f
            if (r2 != r3) goto L37
            java.lang.Object r6 = r0.f128789d
            kotlinx.coroutines.channels.ChannelIterator r6 = (kotlinx.coroutines.channels.ChannelIterator) r6
            java.lang.Object r7 = r0.f128788c
            kotlinx.coroutines.channels.ReceiveChannel r7 = (kotlinx.coroutines.channels.ReceiveChannel) r7
            java.lang.Object r2 = r0.f128787b
            yh.l r2 = (yh.l) r2
            kotlin.t0.n(r8)     // Catch: java.lang.Throwable -> L35
            goto L5c
        L35:
            r6 = move-exception
            goto L7e
        L37:
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            java.lang.String r7 = "call to 'resume' before 'invoke' with coroutine"
            r6.<init>(r7)
            throw r6
        L3f:
            kotlin.t0.n(r8)
            kotlinx.coroutines.channels.ChannelIterator r8 = r6.iterator()     // Catch: java.lang.Throwable -> L7a
            r5 = r7
            r7 = r6
            r6 = r8
            r8 = r5
        L4a:
            r0.f128787b = r8     // Catch: java.lang.Throwable -> L35
            r0.f128788c = r7     // Catch: java.lang.Throwable -> L35
            r0.f128789d = r6     // Catch: java.lang.Throwable -> L35
            r0.f128791f = r3     // Catch: java.lang.Throwable -> L35
            java.lang.Object r2 = r6.b(r0)     // Catch: java.lang.Throwable -> L35
            if (r2 != r1) goto L59
            return r1
        L59:
            r5 = r2
            r2 = r8
            r8 = r5
        L5c:
            r4 = 0
            java.lang.Boolean r8 = (java.lang.Boolean) r8     // Catch: java.lang.Throwable -> L35
            boolean r8 = r8.booleanValue()     // Catch: java.lang.Throwable -> L35
            if (r8 == 0) goto L6e
            java.lang.Object r8 = r6.next()     // Catch: java.lang.Throwable -> L35
            r2.invoke(r8)     // Catch: java.lang.Throwable -> L35
            r8 = r2
            goto L4a
        L6e:
            kotlin.b2 r6 = kotlin.b2.f124493a     // Catch: java.lang.Throwable -> L35
            kotlin.jvm.internal.c0.d(r3)
            kotlinx.coroutines.channels.o.b(r7, r4)
            kotlin.jvm.internal.c0.c(r3)
            return r6
        L7a:
            r7 = move-exception
            r5 = r7
            r7 = r6
            r6 = r5
        L7e:
            throw r6     // Catch: java.lang.Throwable -> L7f
        L7f:
            r8 = move-exception
            kotlin.jvm.internal.c0.d(r3)
            kotlinx.coroutines.channels.o.b(r7, r6)
            kotlin.jvm.internal.c0.c(r3)
            throw r8
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlinx.coroutines.channels.ChannelsKt__Channels_commonKt.e(kotlinx.coroutines.channels.ReceiveChannel, yh.l, kotlin.coroutines.c):java.lang.Object");
    }

    @s2
    private static final <E> Object f(h<E> hVar, yh.l<? super E, b2> lVar, kotlin.coroutines.c<? super b2> cVar) {
        ReceiveChannel<E> receiveChannelU = hVar.u();
        try {
            ChannelIterator<E> it = receiveChannelU.iterator();
            while (true) {
                kotlin.jvm.internal.c0.e(3);
                kotlin.jvm.internal.c0.e(0);
                Object objB = it.b(null);
                kotlin.jvm.internal.c0.e(1);
                if (!((Boolean) objB).booleanValue()) {
                    return b2.f124493a;
                }
                lVar.invoke(it.next());
            }
        } finally {
            kotlin.jvm.internal.c0.d(1);
            ReceiveChannel.DefaultImpls.b(receiveChannelU, null, 1, null);
            kotlin.jvm.internal.c0.c(1);
        }
    }

    private static final <E> Object g(ReceiveChannel<? extends E> receiveChannel, yh.l<? super E, b2> lVar, kotlin.coroutines.c<? super b2> cVar) {
        try {
            ChannelIterator<? extends E> it = receiveChannel.iterator();
            while (true) {
                kotlin.jvm.internal.c0.e(3);
                kotlin.jvm.internal.c0.e(0);
                Object objB = it.b(null);
                kotlin.jvm.internal.c0.e(1);
                if (!((Boolean) objB).booleanValue()) {
                    b2 b2Var = b2.f124493a;
                    kotlin.jvm.internal.c0.d(1);
                    o.b(receiveChannel, null);
                    kotlin.jvm.internal.c0.c(1);
                    return b2Var;
                }
                lVar.invoke(it.next());
            }
        } catch (Throwable th2) {
            try {
                throw th2;
            } catch (Throwable th3) {
                kotlin.jvm.internal.c0.d(1);
                o.b(receiveChannel, th2);
                kotlin.jvm.internal.c0.c(1);
                throw th3;
            }
        }
    }

    @dl.d
    @kotlin.k(level = DeprecationLevel.ERROR, message = "Deprecated in the favour of 'onReceiveCatching'")
    public static final <E> kotlinx.coroutines.selects.d<E> h(@dl.d ReceiveChannel<? extends E> receiveChannel) {
        return receiveChannel.B();
    }

    /* JADX WARN: Multi-variable type inference failed */
    @kotlin.k(level = DeprecationLevel.ERROR, message = "Deprecated in the favour of 'receiveCatching'", replaceWith = @s0(expression = "receiveCatching().getOrNull()", imports = {}))
    @dl.e
    public static final <E> Object i(@dl.d ReceiveChannel<? extends E> receiveChannel, @dl.d kotlin.coroutines.c<? super E> cVar) {
        return receiveChannel.G(cVar);
    }

    /* JADX WARN: Code duplicated, block: B:23:0x0063 A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:24:0x0064  */
    /* JADX WARN: Code duplicated, block: B:28:0x0070 A[Catch: all -> 0x0039, TryCatch #2 {all -> 0x0039, blocks: (B:12:0x0035, B:26:0x0068, B:28:0x0070, B:29:0x0079), top: B:44:0x0035 }] */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r4v1, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r4v2, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r4v5 */
    /* JADX WARN: Type inference failed for: r4v6 */
    /* JADX WARN: Type inference failed for: r4v7 */
    /* JADX WARN: Type inference failed for: r4v8 */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:24:0x0064 -> B:25:0x0067). Please report as a decompilation issue!!! */
    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions stack size limit reached
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    @dl.e
    public static final <E> java.lang.Object j(@dl.d kotlinx.coroutines.channels.ReceiveChannel<? extends E> r8, @dl.d kotlin.coroutines.c<? super java.util.List<? extends E>> r9) {
        /*
            boolean r0 = r9 instanceof kotlinx.coroutines.channels.ChannelsKt__Channels_commonKt$toList$1
            if (r0 == 0) goto L13
            r0 = r9
            kotlinx.coroutines.channels.ChannelsKt__Channels_commonKt$toList$1 r0 = (kotlinx.coroutines.channels.ChannelsKt__Channels_commonKt$toList$1) r0
            int r1 = r0.f128802g
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f128802g = r1
            goto L18
        L13:
            kotlinx.coroutines.channels.ChannelsKt__Channels_commonKt$toList$1 r0 = new kotlinx.coroutines.channels.ChannelsKt__Channels_commonKt$toList$1
            r0.<init>(r9)
        L18:
            java.lang.Object r9 = r0.f128801f
            java.lang.Object r1 = kotlin.coroutines.intrinsics.b.h()
            int r2 = r0.f128802g
            r3 = 1
            if (r2 == 0) goto L44
            if (r2 != r3) goto L3c
            java.lang.Object r8 = r0.f128800e
            kotlinx.coroutines.channels.ChannelIterator r8 = (kotlinx.coroutines.channels.ChannelIterator) r8
            java.lang.Object r2 = r0.f128799d
            kotlinx.coroutines.channels.ReceiveChannel r2 = (kotlinx.coroutines.channels.ReceiveChannel) r2
            java.lang.Object r4 = r0.f128798c
            java.util.List r4 = (java.util.List) r4
            java.lang.Object r5 = r0.f128797b
            java.util.List r5 = (java.util.List) r5
            kotlin.t0.n(r9)     // Catch: java.lang.Throwable -> L39
            goto L67
        L39:
            r8 = move-exception
            r9 = r2
            goto L89
        L3c:
            java.lang.IllegalStateException r8 = new java.lang.IllegalStateException
            java.lang.String r9 = "call to 'resume' before 'invoke' with coroutine"
            r8.<init>(r9)
            throw r8
        L44:
            kotlin.t0.n(r9)
            java.util.List r9 = kotlin.collections.s.i()
            kotlinx.coroutines.channels.ChannelIterator r2 = r8.iterator()     // Catch: java.lang.Throwable -> L85
            r4 = r9
            r5 = r4
            r9 = r8
            r8 = r2
        L53:
            r0.f128797b = r5     // Catch: java.lang.Throwable -> L83
            r0.f128798c = r4     // Catch: java.lang.Throwable -> L83
            r0.f128799d = r9     // Catch: java.lang.Throwable -> L83
            r0.f128800e = r8     // Catch: java.lang.Throwable -> L83
            r0.f128802g = r3     // Catch: java.lang.Throwable -> L83
            java.lang.Object r2 = r8.b(r0)     // Catch: java.lang.Throwable -> L83
            if (r2 != r1) goto L64
            return r1
        L64:
            r7 = r2
            r2 = r9
            r9 = r7
        L67:
            r6 = 0
            java.lang.Boolean r9 = (java.lang.Boolean) r9     // Catch: java.lang.Throwable -> L39
            boolean r9 = r9.booleanValue()     // Catch: java.lang.Throwable -> L39
            if (r9 == 0) goto L79
            java.lang.Object r9 = r8.next()     // Catch: java.lang.Throwable -> L39
            r4.add(r9)     // Catch: java.lang.Throwable -> L39
            r9 = r2
            goto L53
        L79:
            kotlin.b2 r8 = kotlin.b2.f124493a     // Catch: java.lang.Throwable -> L39
            kotlinx.coroutines.channels.o.b(r2, r6)
            java.util.List r8 = kotlin.collections.s.a(r5)
            return r8
        L83:
            r8 = move-exception
            goto L89
        L85:
            r9 = move-exception
            r7 = r9
            r9 = r8
            r8 = r7
        L89:
            throw r8     // Catch: java.lang.Throwable -> L8a
        L8a:
            r0 = move-exception
            kotlinx.coroutines.channels.o.b(r9, r8)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlinx.coroutines.channels.ChannelsKt__Channels_commonKt.j(kotlinx.coroutines.channels.ReceiveChannel, kotlin.coroutines.c):java.lang.Object");
    }
}
