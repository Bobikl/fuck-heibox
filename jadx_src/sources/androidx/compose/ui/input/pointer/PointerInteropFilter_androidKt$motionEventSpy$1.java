package androidx.compose.ui.input.pointer;

import android.view.MotionEvent;
import kotlin.Metadata;
import kotlin.b2;
import kotlin.coroutines.jvm.internal.RestrictedSuspendLambda;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.t0;

/* JADX INFO: compiled from: PointerInteropFilter.android.kt */
/* JADX INFO: loaded from: classes.dex */
@Metadata(bv = {}, d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@"}, d2 = {"Landroidx/compose/ui/input/pointer/i0;", "Lkotlin/b2;", "<anonymous>"}, k = 3, mv = {1, 7, 1})
@kotlin.coroutines.jvm.internal.d(c = "androidx.compose.ui.input.pointer.PointerInteropFilter_androidKt$motionEventSpy$1", f = "PointerInteropFilter.android.kt", i = {}, l = {bb.c.b.F3}, m = "invokeSuspend", n = {}, s = {})
public final class PointerInteropFilter_androidKt$motionEventSpy$1 extends SuspendLambda implements yh.p<i0, kotlin.coroutines.c<? super b2>, Object> {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    int f14685b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private /* synthetic */ Object f14686c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    final /* synthetic */ yh.l<MotionEvent, b2> f14687d;

    /* JADX INFO: renamed from: androidx.compose.ui.input.pointer.PointerInteropFilter_androidKt$motionEventSpy$1$1, reason: invalid class name */
    /* JADX INFO: compiled from: PointerInteropFilter.android.kt */
    @Metadata(bv = {}, d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@"}, d2 = {"Landroidx/compose/ui/input/pointer/d;", "Lkotlin/b2;", "<anonymous>"}, k = 3, mv = {1, 7, 1})
    @kotlin.coroutines.jvm.internal.d(c = "androidx.compose.ui.input.pointer.PointerInteropFilter_androidKt$motionEventSpy$1$1", f = "PointerInteropFilter.android.kt", i = {0}, l = {bb.c.b.H3}, m = "invokeSuspend", n = {"$this$awaitPointerEventScope"}, s = {"L$0"})
    public static final class AnonymousClass1 extends RestrictedSuspendLambda implements yh.p<d, kotlin.coroutines.c<? super b2>, Object> {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        int f14688c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private /* synthetic */ Object f14689d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        final /* synthetic */ yh.l<MotionEvent, b2> f14690e;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        AnonymousClass1(yh.l<? super MotionEvent, b2> lVar, kotlin.coroutines.c<? super AnonymousClass1> cVar) {
            super(2, cVar);
            this.f14690e = lVar;
        }

        @Override // yh.p
        @dl.e
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Object invoke(@dl.d d dVar, @dl.e kotlin.coroutines.c<? super b2> cVar) {
            return ((AnonymousClass1) create(dVar, cVar)).invokeSuspend(b2.f124493a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @dl.d
        public final kotlin.coroutines.c<b2> create(@dl.e Object obj, @dl.d kotlin.coroutines.c<?> cVar) {
            AnonymousClass1 anonymousClass1 = new AnonymousClass1(this.f14690e, cVar);
            anonymousClass1.f14689d = obj;
            return anonymousClass1;
        }

        /* JADX WARN: Code duplicated, block: B:11:0x0033 A[RETURN] */
        /* JADX WARN: Code duplicated, block: B:12:0x0034  */
        /* JADX WARN: Code duplicated, block: B:15:0x0041  */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:12:0x0034 -> B:13:0x0039). Please report as a decompilation issue!!! */
        /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
            jadx.core.utils.exceptions.JadxOverflowException: Regions count limit reached at block B:12:0x0034
            	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
            	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
            	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
            */
        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @dl.e
        public final java.lang.Object invokeSuspend(@dl.d java.lang.Object r7) {
            /*
                r6 = this;
                java.lang.Object r0 = kotlin.coroutines.intrinsics.b.h()
                int r1 = r6.f14688c
                r2 = 1
                if (r1 == 0) goto L1e
                if (r1 != r2) goto L16
                java.lang.Object r1 = r6.f14689d
                androidx.compose.ui.input.pointer.d r1 = (androidx.compose.ui.input.pointer.d) r1
                kotlin.t0.n(r7)
                r3 = r1
                r1 = r0
                r0 = r6
                goto L39
            L16:
                java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
                java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
                r7.<init>(r0)
                throw r7
            L1e:
                kotlin.t0.n(r7)
                java.lang.Object r7 = r6.f14689d
                androidx.compose.ui.input.pointer.d r7 = (androidx.compose.ui.input.pointer.d) r7
                r1 = r7
                r7 = r6
            L27:
                androidx.compose.ui.input.pointer.PointerEventPass r3 = androidx.compose.ui.input.pointer.PointerEventPass.Initial
                r7.f14689d = r1
                r7.f14688c = r2
                java.lang.Object r3 = r1.r1(r3, r7)
                if (r3 != r0) goto L34
                return r0
            L34:
                r5 = r0
                r0 = r7
                r7 = r3
                r3 = r1
                r1 = r5
            L39:
                androidx.compose.ui.input.pointer.p r7 = (androidx.compose.ui.input.pointer.p) r7
                android.view.MotionEvent r7 = r7.h()
                if (r7 == 0) goto L46
                yh.l<android.view.MotionEvent, kotlin.b2> r4 = r0.f14690e
                r4.invoke(r7)
            L46:
                r7 = r0
                r0 = r1
                r1 = r3
                goto L27
            */
            throw new UnsupportedOperationException("Method not decompiled: androidx.compose.ui.input.pointer.PointerInteropFilter_androidKt$motionEventSpy$1.AnonymousClass1.invokeSuspend(java.lang.Object):java.lang.Object");
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    PointerInteropFilter_androidKt$motionEventSpy$1(yh.l<? super MotionEvent, b2> lVar, kotlin.coroutines.c<? super PointerInteropFilter_androidKt$motionEventSpy$1> cVar) {
        super(2, cVar);
        this.f14687d = lVar;
    }

    @Override // yh.p
    @dl.e
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public final Object invoke(@dl.d i0 i0Var, @dl.e kotlin.coroutines.c<? super b2> cVar) {
        return ((PointerInteropFilter_androidKt$motionEventSpy$1) create(i0Var, cVar)).invokeSuspend(b2.f124493a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @dl.d
    public final kotlin.coroutines.c<b2> create(@dl.e Object obj, @dl.d kotlin.coroutines.c<?> cVar) {
        PointerInteropFilter_androidKt$motionEventSpy$1 pointerInteropFilter_androidKt$motionEventSpy$1 = new PointerInteropFilter_androidKt$motionEventSpy$1(this.f14687d, cVar);
        pointerInteropFilter_androidKt$motionEventSpy$1.f14686c = obj;
        return pointerInteropFilter_androidKt$motionEventSpy$1;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @dl.e
    public final Object invokeSuspend(@dl.d Object obj) throws Throwable {
        Object objH = kotlin.coroutines.intrinsics.b.h();
        int i10 = this.f14685b;
        if (i10 == 0) {
            t0.n(obj);
            i0 i0Var = (i0) this.f14686c;
            i0Var.o1(true);
            AnonymousClass1 anonymousClass1 = new AnonymousClass1(this.f14687d, null);
            this.f14685b = 1;
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
