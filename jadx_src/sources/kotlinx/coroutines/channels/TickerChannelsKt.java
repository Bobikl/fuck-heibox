package kotlinx.coroutines.channels;

import com.umeng.analytics.pro.ak;
import kotlin.Metadata;
import kotlin.b2;
import kotlin.coroutines.CoroutineContext;
import kotlin.coroutines.EmptyCoroutineContext;
import kotlinx.coroutines.e1;
import kotlinx.coroutines.s2;
import kotlinx.coroutines.v1;

/* JADX INFO: compiled from: TickerChannels.kt */
/* JADX INFO: loaded from: classes5.dex */
@Metadata(bv = {}, d1 = {"\u0000&\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\u001a4\u0010\t\u001a\b\u0012\u0004\u0012\u00020\b0\u00072\u0006\u0010\u0001\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00002\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0006\u001a\u00020\u0005H\u0007\u001a1\u0010\f\u001a\u00020\b2\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u00002\f\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\b0\nH\u0082@ø\u0001\u0000¢\u0006\u0004\b\f\u0010\r\u001a1\u0010\u000e\u001a\u00020\b2\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u00002\f\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\b0\nH\u0082@ø\u0001\u0000¢\u0006\u0004\b\u000e\u0010\r\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006\u000f"}, d2 = {"", "delayMillis", "initialDelayMillis", "Lkotlin/coroutines/CoroutineContext;", com.umeng.analytics.pro.d.R, "Lkotlinx/coroutines/channels/TickerMode;", "mode", "Lkotlinx/coroutines/channels/ReceiveChannel;", "Lkotlin/b2;", "e", "Lkotlinx/coroutines/channels/b0;", "channel", "d", "(JJLkotlinx/coroutines/channels/b0;Lkotlin/coroutines/c;)Ljava/lang/Object;", ak.aF, "kotlinx-coroutines-core"}, k = 2, mv = {1, 6, 0})
public final class TickerChannelsKt {
    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Code duplicated, block: B:24:0x0071 A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:25:0x0072  */
    /* JADX WARN: Code duplicated, block: B:28:0x007f A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:27:0x007d -> B:14:0x0034). Please report as a decompilation issue!!! */
    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions stack size limit reached
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    public static final java.lang.Object c(long r6, long r8, kotlinx.coroutines.channels.b0<? super kotlin.b2> r10, kotlin.coroutines.c<? super kotlin.b2> r11) {
        /*
            boolean r0 = r11 instanceof kotlinx.coroutines.channels.TickerChannelsKt$fixedDelayTicker$1
            if (r0 == 0) goto L13
            r0 = r11
            kotlinx.coroutines.channels.TickerChannelsKt$fixedDelayTicker$1 r0 = (kotlinx.coroutines.channels.TickerChannelsKt$fixedDelayTicker$1) r0
            int r1 = r0.f129009e
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f129009e = r1
            goto L18
        L13:
            kotlinx.coroutines.channels.TickerChannelsKt$fixedDelayTicker$1 r0 = new kotlinx.coroutines.channels.TickerChannelsKt$fixedDelayTicker$1
            r0.<init>(r11)
        L18:
            java.lang.Object r11 = r0.f129008d
            java.lang.Object r1 = kotlin.coroutines.intrinsics.b.h()
            int r2 = r0.f129009e
            r3 = 3
            r4 = 2
            r5 = 1
            if (r2 == 0) goto L53
            if (r2 == r5) goto L48
            if (r2 == r4) goto L3e
            if (r2 != r3) goto L36
            long r6 = r0.f129006b
            java.lang.Object r8 = r0.f129007c
            kotlinx.coroutines.channels.b0 r8 = (kotlinx.coroutines.channels.b0) r8
            kotlin.t0.n(r11)
        L34:
            r10 = r8
            goto L63
        L36:
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            java.lang.String r7 = "call to 'resume' before 'invoke' with coroutine"
            r6.<init>(r7)
            throw r6
        L3e:
            long r6 = r0.f129006b
            java.lang.Object r8 = r0.f129007c
            kotlinx.coroutines.channels.b0 r8 = (kotlinx.coroutines.channels.b0) r8
            kotlin.t0.n(r11)
            goto L73
        L48:
            long r6 = r0.f129006b
            java.lang.Object r8 = r0.f129007c
            r10 = r8
            kotlinx.coroutines.channels.b0 r10 = (kotlinx.coroutines.channels.b0) r10
            kotlin.t0.n(r11)
            goto L63
        L53:
            kotlin.t0.n(r11)
            r0.f129007c = r10
            r0.f129006b = r6
            r0.f129009e = r5
            java.lang.Object r8 = kotlinx.coroutines.DelayKt.b(r8, r0)
            if (r8 != r1) goto L63
            return r1
        L63:
            kotlin.b2 r8 = kotlin.b2.f124493a
            r0.f129007c = r10
            r0.f129006b = r6
            r0.f129009e = r4
            java.lang.Object r8 = r10.X(r8, r0)
            if (r8 != r1) goto L72
            return r1
        L72:
            r8 = r10
        L73:
            r0.f129007c = r8
            r0.f129006b = r6
            r0.f129009e = r3
            java.lang.Object r9 = kotlinx.coroutines.DelayKt.b(r6, r0)
            if (r9 != r1) goto L34
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlinx.coroutines.channels.TickerChannelsKt.c(long, long, kotlinx.coroutines.channels.b0, kotlin.coroutines.c):java.lang.Object");
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Code duplicated, block: B:33:0x00bb A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:34:0x00bc  */
    /* JADX WARN: Code duplicated, block: B:37:0x00c8  */
    /* JADX WARN: Code duplicated, block: B:38:0x00cd  */
    /* JADX WARN: Code duplicated, block: B:41:0x00dd  */
    /* JADX WARN: Code duplicated, block: B:49:0x0114 A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:7:0x0015  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:46:0x00fc -> B:31:0x00aa). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:48:0x0112 -> B:15:0x003d). Please report as a decompilation issue!!! */
    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions stack size limit reached
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    public static final java.lang.Object d(long r18, long r20, kotlinx.coroutines.channels.b0<? super kotlin.b2> r22, kotlin.coroutines.c<? super kotlin.b2> r23) {
        /*
            Method dump skipped, instruction units count: 281
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlinx.coroutines.channels.TickerChannelsKt.d(long, long, kotlinx.coroutines.channels.b0, kotlin.coroutines.c):java.lang.Object");
    }

    @dl.d
    @s2
    public static final ReceiveChannel<b2> e(long j10, long j11, @dl.d CoroutineContext coroutineContext, @dl.d TickerMode tickerMode) {
        if (!(j10 >= 0)) {
            throw new IllegalArgumentException(("Expected non-negative delay, but has " + j10 + " ms").toString());
        }
        if (j11 >= 0) {
            return ProduceKt.e(v1.f130503b, e1.g().I(coroutineContext), 0, new TickerChannelsKt$ticker$3(tickerMode, j10, j11, null));
        }
        throw new IllegalArgumentException(("Expected non-negative initial delay, but has " + j11 + " ms").toString());
    }

    public static /* synthetic */ ReceiveChannel f(long j10, long j11, CoroutineContext coroutineContext, TickerMode tickerMode, int i10, Object obj) {
        if ((i10 & 2) != 0) {
            j11 = j10;
        }
        if ((i10 & 4) != 0) {
            coroutineContext = EmptyCoroutineContext.f124694b;
        }
        if ((i10 & 8) != 0) {
            tickerMode = TickerMode.FIXED_PERIOD;
        }
        return e(j10, j11, coroutineContext, tickerMode);
    }
}
