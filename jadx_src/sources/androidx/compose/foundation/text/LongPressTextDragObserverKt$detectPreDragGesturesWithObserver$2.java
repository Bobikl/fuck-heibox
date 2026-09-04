package androidx.compose.foundation.text;

import androidx.compose.ui.input.pointer.i0;
import kotlin.Metadata;
import kotlin.b2;
import kotlin.coroutines.jvm.internal.RestrictedSuspendLambda;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.t0;

/* JADX INFO: compiled from: LongPressTextDragObserver.kt */
/* JADX INFO: loaded from: classes.dex */
@Metadata(bv = {}, d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@"}, d2 = {"Landroidx/compose/ui/input/pointer/i0;", "Lkotlin/b2;", "<anonymous>"}, k = 3, mv = {1, 7, 1})
@kotlin.coroutines.jvm.internal.d(c = "androidx.compose.foundation.text.LongPressTextDragObserverKt$detectPreDragGesturesWithObserver$2", f = "LongPressTextDragObserver.kt", i = {}, l = {98}, m = "invokeSuspend", n = {}, s = {})
public final class LongPressTextDragObserverKt$detectPreDragGesturesWithObserver$2 extends SuspendLambda implements yh.p<i0, kotlin.coroutines.c<? super b2>, Object> {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    int f7865b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private /* synthetic */ Object f7866c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    final /* synthetic */ r f7867d;

    /* JADX INFO: renamed from: androidx.compose.foundation.text.LongPressTextDragObserverKt$detectPreDragGesturesWithObserver$2$1, reason: invalid class name */
    /* JADX INFO: compiled from: LongPressTextDragObserver.kt */
    @Metadata(bv = {}, d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@"}, d2 = {"Landroidx/compose/ui/input/pointer/d;", "Lkotlin/b2;", "<anonymous>"}, k = 3, mv = {1, 7, 1})
    @kotlin.coroutines.jvm.internal.d(c = "androidx.compose.foundation.text.LongPressTextDragObserverKt$detectPreDragGesturesWithObserver$2$1", f = "LongPressTextDragObserver.kt", i = {0, 1, 1}, l = {99, 103}, m = "invokeSuspend", n = {"$this$awaitPointerEventScope", "$this$awaitPointerEventScope", "down"}, s = {"L$0", "L$0", "L$1"})
    public static final class AnonymousClass1 extends RestrictedSuspendLambda implements yh.p<androidx.compose.ui.input.pointer.d, kotlin.coroutines.c<? super b2>, Object> {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        Object f7868c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        int f7869d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        private /* synthetic */ Object f7870e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        final /* synthetic */ r f7871f;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        AnonymousClass1(r rVar, kotlin.coroutines.c<? super AnonymousClass1> cVar) {
            super(2, cVar);
            this.f7871f = rVar;
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
            AnonymousClass1 anonymousClass1 = new AnonymousClass1(this.f7871f, cVar);
            anonymousClass1.f7870e = obj;
            return anonymousClass1;
        }

        /* JADX WARN: Code duplicated, block: B:19:0x006e  */
        /* JADX WARN: Code duplicated, block: B:21:0x0082  */
        /* JADX WARN: Code duplicated, block: B:24:0x008a  */
        /* JADX WARN: Code duplicated, block: B:27:0x008f A[LOOP:0: B:18:0x006c->B:27:0x008f, LOOP_END] */
        /* JADX WARN: Code duplicated, block: B:34:0x008d A[SYNTHETIC] */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:15:0x005e -> B:17:0x0061). Please report as a decompilation issue!!! */
        /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
            jadx.core.utils.exceptions.JadxOverflowException: Regions stack size limit reached
            	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
            	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
            	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
            */
        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @dl.e
        public final java.lang.Object invokeSuspend(@dl.d java.lang.Object r17) {
            /*
                r16 = this;
                r0 = r16
                java.lang.Object r1 = kotlin.coroutines.intrinsics.b.h()
                int r2 = r0.f7869d
                r3 = 2
                r4 = 0
                r5 = 0
                r6 = 1
                if (r2 == 0) goto L33
                if (r2 == r6) goto L29
                if (r2 != r3) goto L21
                java.lang.Object r2 = r0.f7868c
                androidx.compose.ui.input.pointer.y r2 = (androidx.compose.ui.input.pointer.PointerInputChange) r2
                java.lang.Object r7 = r0.f7870e
                androidx.compose.ui.input.pointer.d r7 = (androidx.compose.ui.input.pointer.d) r7
                kotlin.t0.n(r17)
                r9 = r17
                r8 = r0
                goto L61
            L21:
                java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
                java.lang.String r2 = "call to 'resume' before 'invoke' with coroutine"
                r1.<init>(r2)
                throw r1
            L29:
                java.lang.Object r2 = r0.f7870e
                androidx.compose.ui.input.pointer.d r2 = (androidx.compose.ui.input.pointer.d) r2
                kotlin.t0.n(r17)
                r7 = r17
                goto L45
            L33:
                kotlin.t0.n(r17)
                java.lang.Object r2 = r0.f7870e
                androidx.compose.ui.input.pointer.d r2 = (androidx.compose.ui.input.pointer.d) r2
                r0.f7870e = r2
                r0.f7869d = r6
                java.lang.Object r7 = androidx.compose.foundation.gestures.TapGestureDetectorKt.e(r2, r5, r0, r6, r4)
                if (r7 != r1) goto L45
                return r1
            L45:
                androidx.compose.ui.input.pointer.y r7 = (androidx.compose.ui.input.pointer.PointerInputChange) r7
                androidx.compose.foundation.text.r r8 = r0.f7871f
                long r9 = r7.getPosition()
                r8.a(r9)
                r8 = r0
                r15 = r7
                r7 = r2
                r2 = r15
            L54:
                r8.f7870e = r7
                r8.f7868c = r2
                r8.f7869d = r3
                java.lang.Object r9 = androidx.compose.ui.input.pointer.c.t(r7, r4, r8, r6, r4)
                if (r9 != r1) goto L61
                return r1
            L61:
                androidx.compose.ui.input.pointer.p r9 = (androidx.compose.ui.input.pointer.p) r9
                java.util.List r9 = r9.e()
                int r10 = r9.size()
                r11 = r5
            L6c:
                if (r11 >= r10) goto L94
                java.lang.Object r12 = r9.get(r11)
                androidx.compose.ui.input.pointer.y r12 = (androidx.compose.ui.input.pointer.PointerInputChange) r12
                long r13 = r12.getId()
                long r3 = r2.getId()
                boolean r3 = androidx.compose.ui.input.pointer.x.d(r13, r3)
                if (r3 == 0) goto L8a
                boolean r3 = r12.getPressed()
                if (r3 == 0) goto L8a
                r3 = r6
                goto L8b
            L8a:
                r3 = r5
            L8b:
                if (r3 == 0) goto L8f
                r3 = r6
                goto L95
            L8f:
                int r11 = r11 + 1
                r3 = 2
                r4 = 0
                goto L6c
            L94:
                r3 = r5
            L95:
                if (r3 != 0) goto L9f
                androidx.compose.foundation.text.r r1 = r8.f7871f
                r1.d()
                kotlin.b2 r1 = kotlin.b2.f124493a
                return r1
            L9f:
                r3 = 2
                r4 = 0
                goto L54
            */
            throw new UnsupportedOperationException("Method not decompiled: androidx.compose.foundation.text.LongPressTextDragObserverKt$detectPreDragGesturesWithObserver$2.AnonymousClass1.invokeSuspend(java.lang.Object):java.lang.Object");
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    LongPressTextDragObserverKt$detectPreDragGesturesWithObserver$2(r rVar, kotlin.coroutines.c<? super LongPressTextDragObserverKt$detectPreDragGesturesWithObserver$2> cVar) {
        super(2, cVar);
        this.f7867d = rVar;
    }

    @Override // yh.p
    @dl.e
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public final Object invoke(@dl.d i0 i0Var, @dl.e kotlin.coroutines.c<? super b2> cVar) {
        return ((LongPressTextDragObserverKt$detectPreDragGesturesWithObserver$2) create(i0Var, cVar)).invokeSuspend(b2.f124493a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @dl.d
    public final kotlin.coroutines.c<b2> create(@dl.e Object obj, @dl.d kotlin.coroutines.c<?> cVar) {
        LongPressTextDragObserverKt$detectPreDragGesturesWithObserver$2 longPressTextDragObserverKt$detectPreDragGesturesWithObserver$2 = new LongPressTextDragObserverKt$detectPreDragGesturesWithObserver$2(this.f7867d, cVar);
        longPressTextDragObserverKt$detectPreDragGesturesWithObserver$2.f7866c = obj;
        return longPressTextDragObserverKt$detectPreDragGesturesWithObserver$2;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @dl.e
    public final Object invokeSuspend(@dl.d Object obj) throws Throwable {
        Object objH = kotlin.coroutines.intrinsics.b.h();
        int i10 = this.f7865b;
        if (i10 == 0) {
            t0.n(obj);
            i0 i0Var = (i0) this.f7866c;
            AnonymousClass1 anonymousClass1 = new AnonymousClass1(this.f7867d, null);
            this.f7865b = 1;
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
