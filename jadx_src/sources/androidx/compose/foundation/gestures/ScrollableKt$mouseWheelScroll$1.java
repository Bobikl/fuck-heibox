package androidx.compose.foundation.gestures;

import androidx.compose.runtime.m2;
import androidx.compose.ui.input.pointer.i0;
import kotlin.Metadata;
import kotlin.b2;
import kotlin.coroutines.jvm.internal.RestrictedSuspendLambda;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.t0;

/* JADX INFO: compiled from: Scrollable.kt */
/* JADX INFO: loaded from: classes.dex */
@Metadata(bv = {}, d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@"}, d2 = {"Landroidx/compose/ui/input/pointer/i0;", "Lkotlin/b2;", "<anonymous>"}, k = 3, mv = {1, 7, 1})
@kotlin.coroutines.jvm.internal.d(c = "androidx.compose.foundation.gestures.ScrollableKt$mouseWheelScroll$1", f = "Scrollable.kt", i = {}, l = {bb.c.b.D2}, m = "invokeSuspend", n = {}, s = {})
public final class ScrollableKt$mouseWheelScroll$1 extends SuspendLambda implements yh.p<i0, kotlin.coroutines.c<? super b2>, Object> {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    int f5530b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private /* synthetic */ Object f5531c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    final /* synthetic */ l f5532d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    final /* synthetic */ m2<ScrollingLogic> f5533e;

    /* JADX INFO: renamed from: androidx.compose.foundation.gestures.ScrollableKt$mouseWheelScroll$1$1, reason: invalid class name */
    /* JADX INFO: compiled from: Scrollable.kt */
    @Metadata(bv = {}, d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@"}, d2 = {"Landroidx/compose/ui/input/pointer/d;", "Lkotlin/b2;", "<anonymous>"}, k = 3, mv = {1, 7, 1})
    @kotlin.coroutines.jvm.internal.d(c = "androidx.compose.foundation.gestures.ScrollableKt$mouseWheelScroll$1$1", f = "Scrollable.kt", i = {0}, l = {bb.c.b.F2}, m = "invokeSuspend", n = {"$this$awaitPointerEventScope"}, s = {"L$0"})
    public static final class AnonymousClass1 extends RestrictedSuspendLambda implements yh.p<androidx.compose.ui.input.pointer.d, kotlin.coroutines.c<? super b2>, Object> {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        int f5534c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private /* synthetic */ Object f5535d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        final /* synthetic */ l f5536e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        final /* synthetic */ m2<ScrollingLogic> f5537f;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        AnonymousClass1(l lVar, m2<ScrollingLogic> m2Var, kotlin.coroutines.c<? super AnonymousClass1> cVar) {
            super(2, cVar);
            this.f5536e = lVar;
            this.f5537f = m2Var;
        }

        @Override // yh.p
        @dl.e
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Object invoke(@dl.d androidx.compose.ui.input.pointer.d dVar, @dl.e kotlin.coroutines.c<? super b2> cVar) {
            return ((AnonymousClass1) create(dVar, cVar)).invokeSuspend(b2.f124493a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @dl.d
        public final kotlin.coroutines.c<b2> create(@dl.e Object obj, @dl.d kotlin.coroutines.c<?> cVar) {
            AnonymousClass1 anonymousClass1 = new AnonymousClass1(this.f5536e, this.f5537f, cVar);
            anonymousClass1.f5535d = obj;
            return anonymousClass1;
        }

        /* JADX WARN: Code duplicated, block: B:15:0x0045  */
        /* JADX WARN: Code duplicated, block: B:18:0x0054 A[LOOP:0: B:14:0x0043->B:18:0x0054, LOOP_END] */
        /* JADX WARN: Code duplicated, block: B:30:0x0052 A[SYNTHETIC] */
        /* JADX WARN: Code duplicated, block: B:31:0x0057 A[SYNTHETIC] */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:12:0x0032 -> B:13:0x0037). Please report as a decompilation issue!!! */
        /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
            jadx.core.utils.exceptions.JadxOverflowException: Regions stack size limit reached
            	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
            	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
            	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
            */
        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @dl.e
        public final java.lang.Object invokeSuspend(@dl.d java.lang.Object r11) {
            /*
                r10 = this;
                java.lang.Object r0 = kotlin.coroutines.intrinsics.b.h()
                int r1 = r10.f5534c
                r2 = 1
                if (r1 == 0) goto L1e
                if (r1 != r2) goto L16
                java.lang.Object r1 = r10.f5535d
                androidx.compose.ui.input.pointer.d r1 = (androidx.compose.ui.input.pointer.d) r1
                kotlin.t0.n(r11)
                r3 = r1
                r1 = r0
                r0 = r10
                goto L37
            L16:
                java.lang.IllegalStateException r11 = new java.lang.IllegalStateException
                java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
                r11.<init>(r0)
                throw r11
            L1e:
                kotlin.t0.n(r11)
                java.lang.Object r11 = r10.f5535d
                androidx.compose.ui.input.pointer.d r11 = (androidx.compose.ui.input.pointer.d) r11
                r1 = r11
                r11 = r10
            L27:
                r11.f5535d = r1
                r11.f5534c = r2
                java.lang.Object r3 = androidx.compose.foundation.gestures.ScrollableKt.a(r1, r11)
                if (r3 != r0) goto L32
                return r0
            L32:
                r9 = r0
                r0 = r11
                r11 = r3
                r3 = r1
                r1 = r9
            L37:
                androidx.compose.ui.input.pointer.p r11 = (androidx.compose.ui.input.pointer.p) r11
                java.util.List r4 = r11.e()
                int r5 = r4.size()
                r6 = 0
                r7 = r6
            L43:
                if (r7 >= r5) goto L57
                java.lang.Object r8 = r4.get(r7)
                androidx.compose.ui.input.pointer.y r8 = (androidx.compose.ui.input.pointer.PointerInputChange) r8
                boolean r8 = r8.A()
                r8 = r8 ^ r2
                if (r8 != 0) goto L54
                r4 = r6
                goto L58
            L54:
                int r7 = r7 + 1
                goto L43
            L57:
                r4 = r2
            L58:
                if (r4 == 0) goto L9c
                androidx.compose.foundation.gestures.l r4 = r0.f5536e
                androidx.compose.runtime.m2<androidx.compose.foundation.gestures.ScrollingLogic> r5 = r0.f5537f
                long r7 = r3.a()
                long r7 = r4.a(r3, r11, r7)
                java.lang.Object r4 = r5.getValue()
                androidx.compose.foundation.gestures.ScrollingLogic r4 = (androidx.compose.foundation.gestures.ScrollingLogic) r4
                float r5 = r4.t(r7)
                float r5 = r4.n(r5)
                androidx.compose.foundation.gestures.p r4 = r4.getScrollableState()
                float r4 = r4.a(r5)
                r5 = 0
                int r4 = (r4 > r5 ? 1 : (r4 == r5 ? 0 : -1))
                if (r4 != 0) goto L83
                r4 = r2
                goto L84
            L83:
                r4 = r6
            L84:
                if (r4 != 0) goto L9c
                java.util.List r11 = r11.e()
                int r4 = r11.size()
            L8e:
                if (r6 >= r4) goto L9c
                java.lang.Object r5 = r11.get(r6)
                androidx.compose.ui.input.pointer.y r5 = (androidx.compose.ui.input.pointer.PointerInputChange) r5
                r5.a()
                int r6 = r6 + 1
                goto L8e
            L9c:
                r11 = r0
                r0 = r1
                r1 = r3
                goto L27
            */
            throw new UnsupportedOperationException("Method not decompiled: androidx.compose.foundation.gestures.ScrollableKt$mouseWheelScroll$1.AnonymousClass1.invokeSuspend(java.lang.Object):java.lang.Object");
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    ScrollableKt$mouseWheelScroll$1(l lVar, m2<ScrollingLogic> m2Var, kotlin.coroutines.c<? super ScrollableKt$mouseWheelScroll$1> cVar) {
        super(2, cVar);
        this.f5532d = lVar;
        this.f5533e = m2Var;
    }

    @Override // yh.p
    @dl.e
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public final Object invoke(@dl.d i0 i0Var, @dl.e kotlin.coroutines.c<? super b2> cVar) {
        return ((ScrollableKt$mouseWheelScroll$1) create(i0Var, cVar)).invokeSuspend(b2.f124493a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @dl.d
    public final kotlin.coroutines.c<b2> create(@dl.e Object obj, @dl.d kotlin.coroutines.c<?> cVar) {
        ScrollableKt$mouseWheelScroll$1 scrollableKt$mouseWheelScroll$1 = new ScrollableKt$mouseWheelScroll$1(this.f5532d, this.f5533e, cVar);
        scrollableKt$mouseWheelScroll$1.f5531c = obj;
        return scrollableKt$mouseWheelScroll$1;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @dl.e
    public final Object invokeSuspend(@dl.d Object obj) throws Throwable {
        Object objH = kotlin.coroutines.intrinsics.b.h();
        int i10 = this.f5530b;
        if (i10 == 0) {
            t0.n(obj);
            i0 i0Var = (i0) this.f5531c;
            AnonymousClass1 anonymousClass1 = new AnonymousClass1(this.f5532d, this.f5533e, null);
            this.f5530b = 1;
            if (i0Var.n1(anonymousClass1, this) == objH) {
                return objH;
            }
        } else {
            if (i10 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            t0.n(obj);
        }
        return b2.f124493a;
    }
}
