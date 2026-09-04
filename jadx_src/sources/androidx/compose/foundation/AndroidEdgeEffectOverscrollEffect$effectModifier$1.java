package androidx.compose.foundation;

import androidx.compose.foundation.gestures.ForEachGestureKt;
import kotlin.Metadata;
import kotlin.b2;
import kotlin.coroutines.jvm.internal.RestrictedSuspendLambda;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.t0;

/* JADX INFO: compiled from: AndroidOverscroll.kt */
/* JADX INFO: loaded from: classes.dex */
@Metadata(bv = {}, d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@"}, d2 = {"Landroidx/compose/ui/input/pointer/i0;", "Lkotlin/b2;", "<anonymous>"}, k = 3, mv = {1, 7, 1})
@kotlin.coroutines.jvm.internal.d(c = "androidx.compose.foundation.AndroidEdgeEffectOverscrollEffect$effectModifier$1", f = "AndroidOverscroll.kt", i = {}, l = {bb.c.b.f30739k3}, m = "invokeSuspend", n = {}, s = {})
public final class AndroidEdgeEffectOverscrollEffect$effectModifier$1 extends SuspendLambda implements yh.p<androidx.compose.ui.input.pointer.i0, kotlin.coroutines.c<? super b2>, Object> {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    int f4646b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private /* synthetic */ Object f4647c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    final /* synthetic */ AndroidEdgeEffectOverscrollEffect f4648d;

    /* JADX INFO: renamed from: androidx.compose.foundation.AndroidEdgeEffectOverscrollEffect$effectModifier$1$1, reason: invalid class name */
    /* JADX INFO: compiled from: AndroidOverscroll.kt */
    @Metadata(bv = {}, d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@"}, d2 = {"Landroidx/compose/ui/input/pointer/i0;", "Lkotlin/b2;", "<anonymous>"}, k = 3, mv = {1, 7, 1})
    @kotlin.coroutines.jvm.internal.d(c = "androidx.compose.foundation.AndroidEdgeEffectOverscrollEffect$effectModifier$1$1", f = "AndroidOverscroll.kt", i = {}, l = {bb.c.b.f30762l3}, m = "invokeSuspend", n = {}, s = {})
    public static final class AnonymousClass1 extends SuspendLambda implements yh.p<androidx.compose.ui.input.pointer.i0, kotlin.coroutines.c<? super b2>, Object> {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        int f4649b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private /* synthetic */ Object f4650c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        final /* synthetic */ AndroidEdgeEffectOverscrollEffect f4651d;

        /* JADX INFO: renamed from: androidx.compose.foundation.AndroidEdgeEffectOverscrollEffect$effectModifier$1$1$1, reason: invalid class name and collision with other inner class name */
        /* JADX INFO: compiled from: AndroidOverscroll.kt */
        @Metadata(bv = {}, d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@"}, d2 = {"Landroidx/compose/ui/input/pointer/d;", "Lkotlin/b2;", "<anonymous>"}, k = 3, mv = {1, 7, 1})
        @kotlin.coroutines.jvm.internal.d(c = "androidx.compose.foundation.AndroidEdgeEffectOverscrollEffect$effectModifier$1$1$1", f = "AndroidOverscroll.kt", i = {0, 1}, l = {bb.c.b.f30785m3, bb.c.b.f30877q3}, m = "invokeSuspend", n = {"$this$awaitPointerEventScope", "$this$awaitPointerEventScope"}, s = {"L$0", "L$0"})
        public static final class C00321 extends RestrictedSuspendLambda implements yh.p<androidx.compose.ui.input.pointer.d, kotlin.coroutines.c<? super b2>, Object> {

            /* JADX INFO: renamed from: c, reason: collision with root package name */
            int f4652c;

            /* JADX INFO: renamed from: d, reason: collision with root package name */
            private /* synthetic */ Object f4653d;

            /* JADX INFO: renamed from: e, reason: collision with root package name */
            final /* synthetic */ AndroidEdgeEffectOverscrollEffect f4654e;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            C00321(AndroidEdgeEffectOverscrollEffect androidEdgeEffectOverscrollEffect, kotlin.coroutines.c<? super C00321> cVar) {
                super(2, cVar);
                this.f4654e = androidEdgeEffectOverscrollEffect;
            }

            @Override // yh.p
            @dl.e
            /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
            public final Object invoke(@dl.d androidx.compose.ui.input.pointer.d dVar, @dl.e kotlin.coroutines.c<? super b2> cVar) {
                return ((C00321) create(dVar, cVar)).invokeSuspend(b2.f124493a);
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            @dl.d
            public final kotlin.coroutines.c<b2> create(@dl.e Object obj, @dl.d kotlin.coroutines.c<?> cVar) {
                C00321 c00321 = new C00321(this.f4654e, cVar);
                c00321.f4653d = obj;
                return c00321;
            }

            /* JADX WARN: Code duplicated, block: B:25:0x009b  */
            /* JADX WARN: Code duplicated, block: B:28:0x00b1 A[LOOP:1: B:24:0x0099->B:28:0x00b1, LOOP_END] */
            /* JADX WARN: Code duplicated, block: B:43:0x00b5 A[EDGE_INSN: B:43:0x00b5->B:30:0x00b5 BREAK  A[LOOP:1: B:24:0x0099->B:28:0x00b1], SYNTHETIC] */
            /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:15:0x0066 -> B:17:0x0069). Please report as a decompilation issue!!! */
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
                    Method dump skipped, instruction units count: 235
                    To view this dump add '--comments-level debug' option
                */
                throw new UnsupportedOperationException("Method not decompiled: androidx.compose.foundation.AndroidEdgeEffectOverscrollEffect$effectModifier$1.AnonymousClass1.C00321.invokeSuspend(java.lang.Object):java.lang.Object");
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        AnonymousClass1(AndroidEdgeEffectOverscrollEffect androidEdgeEffectOverscrollEffect, kotlin.coroutines.c<? super AnonymousClass1> cVar) {
            super(2, cVar);
            this.f4651d = androidEdgeEffectOverscrollEffect;
        }

        @Override // yh.p
        @dl.e
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Object invoke(@dl.d androidx.compose.ui.input.pointer.i0 i0Var, @dl.e kotlin.coroutines.c<? super b2> cVar) {
            return ((AnonymousClass1) create(i0Var, cVar)).invokeSuspend(b2.f124493a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @dl.d
        public final kotlin.coroutines.c<b2> create(@dl.e Object obj, @dl.d kotlin.coroutines.c<?> cVar) {
            AnonymousClass1 anonymousClass1 = new AnonymousClass1(this.f4651d, cVar);
            anonymousClass1.f4650c = obj;
            return anonymousClass1;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @dl.e
        public final Object invokeSuspend(@dl.d Object obj) throws Throwable {
            Object objH = kotlin.coroutines.intrinsics.b.h();
            int i10 = this.f4649b;
            if (i10 == 0) {
                t0.n(obj);
                androidx.compose.ui.input.pointer.i0 i0Var = (androidx.compose.ui.input.pointer.i0) this.f4650c;
                C00321 c00321 = new C00321(this.f4651d, null);
                this.f4649b = 1;
                if (i0Var.n1(c00321, this) == objH) {
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

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    AndroidEdgeEffectOverscrollEffect$effectModifier$1(AndroidEdgeEffectOverscrollEffect androidEdgeEffectOverscrollEffect, kotlin.coroutines.c<? super AndroidEdgeEffectOverscrollEffect$effectModifier$1> cVar) {
        super(2, cVar);
        this.f4648d = androidEdgeEffectOverscrollEffect;
    }

    @Override // yh.p
    @dl.e
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public final Object invoke(@dl.d androidx.compose.ui.input.pointer.i0 i0Var, @dl.e kotlin.coroutines.c<? super b2> cVar) {
        return ((AndroidEdgeEffectOverscrollEffect$effectModifier$1) create(i0Var, cVar)).invokeSuspend(b2.f124493a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @dl.d
    public final kotlin.coroutines.c<b2> create(@dl.e Object obj, @dl.d kotlin.coroutines.c<?> cVar) {
        AndroidEdgeEffectOverscrollEffect$effectModifier$1 androidEdgeEffectOverscrollEffect$effectModifier$1 = new AndroidEdgeEffectOverscrollEffect$effectModifier$1(this.f4648d, cVar);
        androidEdgeEffectOverscrollEffect$effectModifier$1.f4647c = obj;
        return androidEdgeEffectOverscrollEffect$effectModifier$1;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @dl.e
    public final Object invokeSuspend(@dl.d Object obj) throws Throwable {
        Object objH = kotlin.coroutines.intrinsics.b.h();
        int i10 = this.f4646b;
        if (i10 == 0) {
            t0.n(obj);
            androidx.compose.ui.input.pointer.i0 i0Var = (androidx.compose.ui.input.pointer.i0) this.f4647c;
            AnonymousClass1 anonymousClass1 = new AnonymousClass1(this.f4648d, null);
            this.f4646b = 1;
            if (ForEachGestureKt.d(i0Var, anonymousClass1, this) == objH) {
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
