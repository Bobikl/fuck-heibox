package kotlinx.coroutines.flow;

import com.umeng.analytics.pro.ak;
import kotlin.DeprecationLevel;
import kotlin.Metadata;
import kotlin.b2;
import kotlinx.coroutines.channels.ReceiveChannel;
import kotlinx.coroutines.q0;
import kotlinx.coroutines.u1;

/* JADX INFO: compiled from: Channels.kt */
/* JADX INFO: loaded from: classes5.dex */
@Metadata(bv = {}, d1 = {"\u00002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u001a1\u0010\u0005\u001a\u00020\u0004\"\u0004\b\u0000\u0010\u0000*\b\u0012\u0004\u0012\u00028\u00000\u00012\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00028\u00000\u0002H\u0086@ø\u0001\u0000¢\u0006\u0004\b\u0005\u0010\u0006\u001a9\u0010\t\u001a\u00020\u0004\"\u0004\b\u0000\u0010\u0000*\b\u0012\u0004\u0012\u00028\u00000\u00012\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00028\u00000\u00022\u0006\u0010\b\u001a\u00020\u0007H\u0082@ø\u0001\u0000¢\u0006\u0004\b\t\u0010\n\u001a\u001c\u0010\f\u001a\b\u0012\u0004\u0012\u00028\u00000\u000b\"\u0004\b\u0000\u0010\u0000*\b\u0012\u0004\u0012\u00028\u00000\u0002\u001a\u001c\u0010\r\u001a\b\u0012\u0004\u0012\u00028\u00000\u000b\"\u0004\b\u0000\u0010\u0000*\b\u0012\u0004\u0012\u00028\u00000\u0002\u001a\u001e\u0010\u000f\u001a\b\u0012\u0004\u0012\u00028\u00000\u000b\"\u0004\b\u0000\u0010\u0000*\b\u0012\u0004\u0012\u00028\u00000\u000eH\u0007\u001a&\u0010\u0012\u001a\b\u0012\u0004\u0012\u00028\u00000\u0002\"\u0004\b\u0000\u0010\u0000*\b\u0012\u0004\u0012\u00028\u00000\u000b2\u0006\u0010\u0011\u001a\u00020\u0010H\u0007\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006\u0013"}, d2 = {androidx.exifinterface.media.a.f23244d5, "Lkotlinx/coroutines/flow/f;", "Lkotlinx/coroutines/channels/ReceiveChannel;", "channel", "Lkotlin/b2;", "d", "(Lkotlinx/coroutines/flow/f;Lkotlinx/coroutines/channels/ReceiveChannel;Lkotlin/coroutines/c;)Ljava/lang/Object;", "", "consume", "e", "(Lkotlinx/coroutines/flow/f;Lkotlinx/coroutines/channels/ReceiveChannel;ZLkotlin/coroutines/c;)Ljava/lang/Object;", "Lkotlinx/coroutines/flow/e;", "g", ak.aF, "Lkotlinx/coroutines/channels/h;", "b", "Lkotlinx/coroutines/q0;", "scope", "f", "kotlinx-coroutines-core"}, k = 5, mv = {1, 6, 0}, xs = "kotlinx/coroutines/flow/FlowKt")
public final /* synthetic */ class FlowKt__ChannelsKt {

    /* JADX INFO: Add missing generic type declarations: [T] */
    /* JADX INFO: compiled from: SafeCollector.common.kt */
    @Metadata(bv = {}, d1 = {"\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00028\u00000\u0001J!\u0010\u0005\u001a\u00020\u00042\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00028\u00000\u0002H\u0096@ø\u0001\u0000¢\u0006\u0004\b\u0005\u0010\u0006\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006\u0007¸\u0006\u0000"}, d2 = {"kotlinx/coroutines/flow/internal/SafeCollector_commonKt$unsafeFlow$1", "Lkotlinx/coroutines/flow/e;", "Lkotlinx/coroutines/flow/f;", "collector", "Lkotlin/b2;", ak.av, "(Lkotlinx/coroutines/flow/f;Lkotlin/coroutines/c;)Ljava/lang/Object;", "kotlinx-coroutines-core"}, k = 1, mv = {1, 6, 0})
    public static final class a<T> implements e<T> {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ kotlinx.coroutines.channels.h f129283b;

        public a(kotlinx.coroutines.channels.h hVar) {
            this.f129283b = hVar;
        }

        @Override // kotlinx.coroutines.flow.e
        @dl.e
        public Object a(@dl.d f<? super T> fVar, @dl.d kotlin.coroutines.c<? super b2> cVar) {
            Object objL0 = g.l0(fVar, this.f129283b.u(), cVar);
            return objL0 == kotlin.coroutines.intrinsics.b.h() ? objL0 : b2.f124493a;
        }
    }

    @dl.d
    @kotlin.k(level = DeprecationLevel.WARNING, message = "'BroadcastChannel' is obsolete and all corresponding operators are deprecated in the favour of StateFlow and SharedFlow")
    public static final <T> e<T> b(@dl.d kotlinx.coroutines.channels.h<T> hVar) {
        return new a(hVar);
    }

    @dl.d
    public static final <T> e<T> c(@dl.d ReceiveChannel<? extends T> receiveChannel) {
        return new b(receiveChannel, true, null, 0, null, 28, null);
    }

    @dl.e
    public static final <T> Object d(@dl.d f<? super T> fVar, @dl.d ReceiveChannel<? extends T> receiveChannel, @dl.d kotlin.coroutines.c<? super b2> cVar) throws Throwable {
        Object objE = e(fVar, receiveChannel, true, cVar);
        return objE == kotlin.coroutines.intrinsics.b.h() ? objE : b2.f124493a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Code duplicated, block: B:25:0x006b A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:26:0x006c  */
    /* JADX WARN: Code duplicated, block: B:30:0x0076 A[Catch: all -> 0x0055, TRY_LEAVE, TryCatch #0 {all -> 0x0055, blocks: (B:13:0x0032, B:28:0x0070, B:30:0x0076, B:36:0x0084, B:37:0x0085, B:18:0x004b), top: B:47:0x0022 }] */
    /* JADX WARN: Code duplicated, block: B:32:0x007c A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:33:0x007e  */
    /* JADX WARN: Code duplicated, block: B:36:0x0084 A[Catch: all -> 0x0055, TRY_ENTER, TryCatch #0 {all -> 0x0055, blocks: (B:13:0x0032, B:28:0x0070, B:30:0x0076, B:36:0x0084, B:37:0x0085, B:18:0x004b), top: B:47:0x0022 }] */
    /* JADX WARN: Code duplicated, block: B:37:0x0085 A[Catch: all -> 0x0055, TRY_LEAVE, TryCatch #0 {all -> 0x0055, blocks: (B:13:0x0032, B:28:0x0070, B:30:0x0076, B:36:0x0084, B:37:0x0085, B:18:0x004b), top: B:47:0x0022 }] */
    /* JADX WARN: Code duplicated, block: B:39:0x0097 A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r6v0 */
    /* JADX WARN: Type inference failed for: r6v1 */
    /* JADX WARN: Type inference failed for: r6v2 */
    /* JADX WARN: Type inference failed for: r7v0, types: [kotlinx.coroutines.flow.f, kotlinx.coroutines.flow.f<? super T>] */
    /* JADX WARN: Type inference failed for: r7v1 */
    /* JADX WARN: Type inference failed for: r7v16 */
    /* JADX WARN: Type inference failed for: r7v17, types: [boolean] */
    /* JADX WARN: Type inference failed for: r7v18, types: [boolean] */
    /* JADX WARN: Type inference failed for: r7v2 */
    /* JADX WARN: Type inference failed for: r7v20 */
    /* JADX WARN: Type inference failed for: r7v21 */
    /* JADX WARN: Type inference failed for: r7v22 */
    /* JADX WARN: Type inference failed for: r7v23 */
    /* JADX WARN: Type inference failed for: r7v24 */
    /* JADX WARN: Type inference failed for: r7v25 */
    /* JADX WARN: Type inference failed for: r7v3, types: [boolean] */
    /* JADX WARN: Type inference failed for: r7v5, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r7v7 */
    /* JADX WARN: Type inference failed for: r7v9 */
    /* JADX WARN: Type inference failed for: r9v14 */
    /* JADX WARN: Type inference failed for: r9v15 */
    /* JADX WARN: Type inference failed for: r9v16 */
    /* JADX WARN: Type inference failed for: r9v17 */
    /* JADX WARN: Type inference failed for: r9v3, types: [java.lang.Object, kotlinx.coroutines.flow.f] */
    /* JADX WARN: Type inference failed for: r9v5, types: [boolean] */
    /* JADX WARN: Type inference failed for: r9v7 */
    /* JADX WARN: Type inference failed for: r9v8 */
    /* JADX WARN: Type inference failed for: r9v9 */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:38:0x0095 -> B:14:0x0035). Please report as a decompilation issue!!! */
    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions stack size limit reached
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    public static final <T> java.lang.Object e(kotlinx.coroutines.flow.f<? super T> r7, kotlinx.coroutines.channels.ReceiveChannel<? extends T> r8, boolean r9, kotlin.coroutines.c<? super kotlin.b2> r10) throws java.lang.Throwable {
        /*
            boolean r0 = r10 instanceof kotlinx.coroutines.flow.FlowKt__ChannelsKt$emitAllImpl$1
            if (r0 == 0) goto L13
            r0 = r10
            kotlinx.coroutines.flow.FlowKt__ChannelsKt$emitAllImpl$1 r0 = (kotlinx.coroutines.flow.FlowKt__ChannelsKt$emitAllImpl$1) r0
            int r1 = r0.f129288f
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f129288f = r1
            goto L18
        L13:
            kotlinx.coroutines.flow.FlowKt__ChannelsKt$emitAllImpl$1 r0 = new kotlinx.coroutines.flow.FlowKt__ChannelsKt$emitAllImpl$1
            r0.<init>(r10)
        L18:
            java.lang.Object r10 = r0.f129287e
            java.lang.Object r1 = kotlin.coroutines.intrinsics.b.h()
            int r2 = r0.f129288f
            r3 = 2
            r4 = 1
            if (r2 == 0) goto L57
            if (r2 == r4) goto L41
            if (r2 != r3) goto L39
            boolean r7 = r0.f129286d
            java.lang.Object r8 = r0.f129285c
            kotlinx.coroutines.channels.ReceiveChannel r8 = (kotlinx.coroutines.channels.ReceiveChannel) r8
            java.lang.Object r9 = r0.f129284b
            kotlinx.coroutines.flow.f r9 = (kotlinx.coroutines.flow.f) r9
            kotlin.t0.n(r10)     // Catch: java.lang.Throwable -> L55
        L35:
            r6 = r9
            r9 = r7
            r7 = r6
            goto L5d
        L39:
            java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
            java.lang.String r8 = "call to 'resume' before 'invoke' with coroutine"
            r7.<init>(r8)
            throw r7
        L41:
            boolean r7 = r0.f129286d
            java.lang.Object r8 = r0.f129285c
            kotlinx.coroutines.channels.ReceiveChannel r8 = (kotlinx.coroutines.channels.ReceiveChannel) r8
            java.lang.Object r9 = r0.f129284b
            kotlinx.coroutines.flow.f r9 = (kotlinx.coroutines.flow.f) r9
            kotlin.t0.n(r10)     // Catch: java.lang.Throwable -> L55
            kotlinx.coroutines.channels.n r10 = (kotlinx.coroutines.channels.n) r10     // Catch: java.lang.Throwable -> L55
            java.lang.Object r10 = r10.getHolder()     // Catch: java.lang.Throwable -> L55
            goto L6f
        L55:
            r9 = move-exception
            goto L9c
        L57:
            kotlin.t0.n(r10)
            kotlinx.coroutines.flow.g.o0(r7)
        L5d:
            r0.f129284b = r7     // Catch: java.lang.Throwable -> L98
            r0.f129285c = r8     // Catch: java.lang.Throwable -> L98
            r0.f129286d = r9     // Catch: java.lang.Throwable -> L98
            r0.f129288f = r4     // Catch: java.lang.Throwable -> L98
            java.lang.Object r10 = r8.H(r0)     // Catch: java.lang.Throwable -> L98
            if (r10 != r1) goto L6c
            return r1
        L6c:
            r6 = r9
            r9 = r7
            r7 = r6
        L6f:
            r2 = 0
            boolean r5 = kotlinx.coroutines.channels.n.k(r10)     // Catch: java.lang.Throwable -> L55
            if (r5 == 0) goto L85
            java.lang.Throwable r9 = kotlinx.coroutines.channels.n.f(r10)     // Catch: java.lang.Throwable -> L55
            if (r9 != 0) goto L84
            if (r7 == 0) goto L81
            kotlinx.coroutines.channels.o.b(r8, r2)
        L81:
            kotlin.b2 r7 = kotlin.b2.f124493a
            return r7
        L84:
            throw r9     // Catch: java.lang.Throwable -> L55
        L85:
            java.lang.Object r10 = kotlinx.coroutines.channels.n.i(r10)     // Catch: java.lang.Throwable -> L55
            r0.f129284b = r9     // Catch: java.lang.Throwable -> L55
            r0.f129285c = r8     // Catch: java.lang.Throwable -> L55
            r0.f129286d = r7     // Catch: java.lang.Throwable -> L55
            r0.f129288f = r3     // Catch: java.lang.Throwable -> L55
            java.lang.Object r10 = r9.emit(r10, r0)     // Catch: java.lang.Throwable -> L55
            if (r10 != r1) goto L35
            return r1
        L98:
            r7 = move-exception
            r6 = r9
            r9 = r7
            r7 = r6
        L9c:
            throw r9     // Catch: java.lang.Throwable -> L9d
        L9d:
            r10 = move-exception
            if (r7 == 0) goto La3
            kotlinx.coroutines.channels.o.b(r8, r9)
        La3:
            throw r10
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlinx.coroutines.flow.FlowKt__ChannelsKt.e(kotlinx.coroutines.flow.f, kotlinx.coroutines.channels.ReceiveChannel, boolean, kotlin.coroutines.c):java.lang.Object");
    }

    @dl.d
    @u1
    public static final <T> ReceiveChannel<T> f(@dl.d e<? extends T> eVar, @dl.d q0 q0Var) {
        return kotlinx.coroutines.flow.internal.d.b(eVar).n(q0Var);
    }

    @dl.d
    public static final <T> e<T> g(@dl.d ReceiveChannel<? extends T> receiveChannel) {
        return new b(receiveChannel, false, null, 0, null, 28, null);
    }
}
