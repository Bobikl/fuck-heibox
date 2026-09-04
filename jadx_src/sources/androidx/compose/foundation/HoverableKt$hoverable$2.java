package androidx.compose.foundation;

import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.EffectsKt;
import androidx.compose.runtime.a1;
import androidx.compose.runtime.h2;
import androidx.compose.ui.input.pointer.SuspendingPointerInputFilterKt;
import kotlin.Metadata;
import kotlin.b2;
import kotlin.coroutines.CoroutineContext;
import kotlin.coroutines.EmptyCoroutineContext;
import kotlin.coroutines.jvm.internal.RestrictedSuspendLambda;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.internal.Lambda;
import kotlin.t0;
import kotlinx.coroutines.q0;

/* JADX INFO: compiled from: Hoverable.kt */
/* JADX INFO: loaded from: classes.dex */
@Metadata(bv = {}, d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0001\u001a\u00020\u0000*\u00020\u0000H\u000b¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Landroidx/compose/ui/n;", "d", "(Landroidx/compose/ui/n;Landroidx/compose/runtime/p;I)Landroidx/compose/ui/n;"}, k = 3, mv = {1, 7, 1})
public final class HoverableKt$hoverable$2 extends Lambda implements yh.q<androidx.compose.ui.n, androidx.compose.runtime.p, Integer, androidx.compose.ui.n> {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    final /* synthetic */ androidx.compose.foundation.interaction.g f4911b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    final /* synthetic */ boolean f4912c;

    /* JADX INFO: renamed from: androidx.compose.foundation.HoverableKt$hoverable$2$3, reason: invalid class name */
    /* JADX INFO: compiled from: Hoverable.kt */
    @Metadata(k = 3, mv = {1, 7, 1}, xi = 48)
    @kotlin.coroutines.jvm.internal.d(c = "androidx.compose.foundation.HoverableKt$hoverable$2$3", f = "Hoverable.kt", i = {}, l = {102}, m = "invokeSuspend", n = {}, s = {})
    public static final class AnonymousClass3 extends SuspendLambda implements yh.p<androidx.compose.ui.input.pointer.i0, kotlin.coroutines.c<? super b2>, Object> {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        int f4921b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private /* synthetic */ Object f4922c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        final /* synthetic */ q0 f4923d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        final /* synthetic */ androidx.compose.foundation.interaction.g f4924e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        final /* synthetic */ a1<androidx.compose.foundation.interaction.c.a> f4925f;

        /* JADX INFO: renamed from: androidx.compose.foundation.HoverableKt$hoverable$2$3$1, reason: invalid class name */
        /* JADX INFO: compiled from: Hoverable.kt */
        @Metadata(k = 3, mv = {1, 7, 1}, xi = 48)
        @kotlin.coroutines.jvm.internal.d(c = "androidx.compose.foundation.HoverableKt$hoverable$2$3$1", f = "Hoverable.kt", i = {0}, l = {104}, m = "invokeSuspend", n = {"$this$awaitPointerEventScope"}, s = {"L$0"})
        public static final class AnonymousClass1 extends RestrictedSuspendLambda implements yh.p<androidx.compose.ui.input.pointer.d, kotlin.coroutines.c<? super b2>, Object> {

            /* JADX INFO: renamed from: c, reason: collision with root package name */
            int f4926c;

            /* JADX INFO: renamed from: d, reason: collision with root package name */
            private /* synthetic */ Object f4927d;

            /* JADX INFO: renamed from: e, reason: collision with root package name */
            final /* synthetic */ CoroutineContext f4928e;

            /* JADX INFO: renamed from: f, reason: collision with root package name */
            final /* synthetic */ q0 f4929f;

            /* JADX INFO: renamed from: g, reason: collision with root package name */
            final /* synthetic */ androidx.compose.foundation.interaction.g f4930g;

            /* JADX INFO: renamed from: h, reason: collision with root package name */
            final /* synthetic */ a1<androidx.compose.foundation.interaction.c.a> f4931h;

            /* JADX INFO: renamed from: androidx.compose.foundation.HoverableKt$hoverable$2$3$1$1, reason: invalid class name and collision with other inner class name */
            /* JADX INFO: compiled from: Hoverable.kt */
            @Metadata(k = 3, mv = {1, 7, 1}, xi = 48)
            @kotlin.coroutines.jvm.internal.d(c = "androidx.compose.foundation.HoverableKt$hoverable$2$3$1$1", f = "Hoverable.kt", i = {}, l = {106}, m = "invokeSuspend", n = {}, s = {})
            public static final class C00331 extends SuspendLambda implements yh.p<q0, kotlin.coroutines.c<? super b2>, Object> {

                /* JADX INFO: renamed from: b, reason: collision with root package name */
                int f4932b;

                /* JADX INFO: renamed from: c, reason: collision with root package name */
                final /* synthetic */ androidx.compose.foundation.interaction.g f4933c;

                /* JADX INFO: renamed from: d, reason: collision with root package name */
                final /* synthetic */ a1<androidx.compose.foundation.interaction.c.a> f4934d;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                C00331(androidx.compose.foundation.interaction.g gVar, a1<androidx.compose.foundation.interaction.c.a> a1Var, kotlin.coroutines.c<? super C00331> cVar) {
                    super(2, cVar);
                    this.f4933c = gVar;
                    this.f4934d = a1Var;
                }

                @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                @dl.d
                public final kotlin.coroutines.c<b2> create(@dl.e Object obj, @dl.d kotlin.coroutines.c<?> cVar) {
                    return new C00331(this.f4933c, this.f4934d, cVar);
                }

                @Override // yh.p
                @dl.e
                public final Object invoke(@dl.d q0 q0Var, @dl.e kotlin.coroutines.c<? super b2> cVar) {
                    return ((C00331) create(q0Var, cVar)).invokeSuspend(b2.f124493a);
                }

                @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                @dl.e
                public final Object invokeSuspend(@dl.d Object obj) throws Throwable {
                    Object objH = kotlin.coroutines.intrinsics.b.h();
                    int i10 = this.f4932b;
                    if (i10 == 0) {
                        t0.n(obj);
                        androidx.compose.foundation.interaction.g gVar = this.f4933c;
                        a1<androidx.compose.foundation.interaction.c.a> a1Var = this.f4934d;
                        this.f4932b = 1;
                        if (HoverableKt$hoverable$2.e(gVar, a1Var, this) == objH) {
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

            /* JADX INFO: renamed from: androidx.compose.foundation.HoverableKt$hoverable$2$3$1$2, reason: invalid class name */
            /* JADX INFO: compiled from: Hoverable.kt */
            @Metadata(k = 3, mv = {1, 7, 1}, xi = 48)
            @kotlin.coroutines.jvm.internal.d(c = "androidx.compose.foundation.HoverableKt$hoverable$2$3$1$2", f = "Hoverable.kt", i = {}, l = {107}, m = "invokeSuspend", n = {}, s = {})
            public static final class AnonymousClass2 extends SuspendLambda implements yh.p<q0, kotlin.coroutines.c<? super b2>, Object> {

                /* JADX INFO: renamed from: b, reason: collision with root package name */
                int f4935b;

                /* JADX INFO: renamed from: c, reason: collision with root package name */
                final /* synthetic */ a1<androidx.compose.foundation.interaction.c.a> f4936c;

                /* JADX INFO: renamed from: d, reason: collision with root package name */
                final /* synthetic */ androidx.compose.foundation.interaction.g f4937d;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                AnonymousClass2(a1<androidx.compose.foundation.interaction.c.a> a1Var, androidx.compose.foundation.interaction.g gVar, kotlin.coroutines.c<? super AnonymousClass2> cVar) {
                    super(2, cVar);
                    this.f4936c = a1Var;
                    this.f4937d = gVar;
                }

                @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                @dl.d
                public final kotlin.coroutines.c<b2> create(@dl.e Object obj, @dl.d kotlin.coroutines.c<?> cVar) {
                    return new AnonymousClass2(this.f4936c, this.f4937d, cVar);
                }

                @Override // yh.p
                @dl.e
                public final Object invoke(@dl.d q0 q0Var, @dl.e kotlin.coroutines.c<? super b2> cVar) {
                    return ((AnonymousClass2) create(q0Var, cVar)).invokeSuspend(b2.f124493a);
                }

                @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                @dl.e
                public final Object invokeSuspend(@dl.d Object obj) throws Throwable {
                    Object objH = kotlin.coroutines.intrinsics.b.h();
                    int i10 = this.f4935b;
                    if (i10 == 0) {
                        t0.n(obj);
                        a1<androidx.compose.foundation.interaction.c.a> a1Var = this.f4936c;
                        androidx.compose.foundation.interaction.g gVar = this.f4937d;
                        this.f4935b = 1;
                        if (HoverableKt$hoverable$2.f(a1Var, gVar, this) == objH) {
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
            AnonymousClass1(CoroutineContext coroutineContext, q0 q0Var, androidx.compose.foundation.interaction.g gVar, a1<androidx.compose.foundation.interaction.c.a> a1Var, kotlin.coroutines.c<? super AnonymousClass1> cVar) {
                super(2, cVar);
                this.f4928e = coroutineContext;
                this.f4929f = q0Var;
                this.f4930g = gVar;
                this.f4931h = a1Var;
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
                AnonymousClass1 anonymousClass1 = new AnonymousClass1(this.f4928e, this.f4929f, this.f4930g, this.f4931h, cVar);
                anonymousClass1.f4927d = obj;
                return anonymousClass1;
            }

            /* JADX WARN: Code duplicated, block: B:11:0x0030  */
            /* JADX WARN: Code duplicated, block: B:13:0x003a A[RETURN] */
            /* JADX WARN: Code duplicated, block: B:14:0x003b  */
            /* JADX WARN: Code duplicated, block: B:17:0x0052  */
            /* JADX WARN: Code duplicated, block: B:18:0x0065  */
            /* JADX WARN: Code duplicated, block: B:20:0x006f  */
            /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:14:0x003b -> B:15:0x0040). Please report as a decompilation issue!!! */
            /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
                jadx.core.utils.exceptions.JadxOverflowException: Regions stack size limit reached
                	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
                	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
                	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
                */
            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            @dl.e
            public final java.lang.Object invokeSuspend(@dl.d java.lang.Object r15) {
                /*
                    r14 = this;
                    java.lang.Object r0 = kotlin.coroutines.intrinsics.b.h()
                    int r1 = r14.f4926c
                    r2 = 1
                    r3 = 0
                    if (r1 == 0) goto L1f
                    if (r1 != r2) goto L17
                    java.lang.Object r1 = r14.f4927d
                    androidx.compose.ui.input.pointer.d r1 = (androidx.compose.ui.input.pointer.d) r1
                    kotlin.t0.n(r15)
                    r4 = r1
                    r1 = r0
                    r0 = r14
                    goto L40
                L17:
                    java.lang.IllegalStateException r15 = new java.lang.IllegalStateException
                    java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
                    r15.<init>(r0)
                    throw r15
                L1f:
                    kotlin.t0.n(r15)
                    java.lang.Object r15 = r14.f4927d
                    androidx.compose.ui.input.pointer.d r15 = (androidx.compose.ui.input.pointer.d) r15
                    r1 = r15
                    r15 = r14
                L28:
                    kotlin.coroutines.CoroutineContext r4 = r15.f4928e
                    boolean r4 = kotlinx.coroutines.g2.C(r4)
                    if (r4 == 0) goto L85
                    r15.f4927d = r1
                    r15.f4926c = r2
                    java.lang.Object r4 = androidx.compose.ui.input.pointer.c.t(r1, r3, r15, r2, r3)
                    if (r4 != r0) goto L3b
                    return r0
                L3b:
                    r13 = r0
                    r0 = r15
                    r15 = r4
                    r4 = r1
                    r1 = r13
                L40:
                    androidx.compose.ui.input.pointer.p r15 = (androidx.compose.ui.input.pointer.p) r15
                    int r15 = r15.getType()
                    androidx.compose.ui.input.pointer.r$a r5 = androidx.compose.ui.input.pointer.r.INSTANCE
                    int r6 = r5.a()
                    boolean r6 = androidx.compose.ui.input.pointer.r.k(r15, r6)
                    if (r6 == 0) goto L65
                    kotlinx.coroutines.q0 r7 = r0.f4929f
                    r8 = 0
                    r9 = 0
                    androidx.compose.foundation.HoverableKt$hoverable$2$3$1$1 r10 = new androidx.compose.foundation.HoverableKt$hoverable$2$3$1$1
                    androidx.compose.foundation.interaction.g r15 = r0.f4930g
                    androidx.compose.runtime.a1<androidx.compose.foundation.interaction.c$a> r5 = r0.f4931h
                    r10.<init>(r15, r5, r3)
                    r11 = 3
                    r12 = 0
                    kotlinx.coroutines.i.e(r7, r8, r9, r10, r11, r12)
                    goto L81
                L65:
                    int r5 = r5.b()
                    boolean r15 = androidx.compose.ui.input.pointer.r.k(r15, r5)
                    if (r15 == 0) goto L81
                    kotlinx.coroutines.q0 r5 = r0.f4929f
                    r6 = 0
                    r7 = 0
                    androidx.compose.foundation.HoverableKt$hoverable$2$3$1$2 r8 = new androidx.compose.foundation.HoverableKt$hoverable$2$3$1$2
                    androidx.compose.runtime.a1<androidx.compose.foundation.interaction.c$a> r15 = r0.f4931h
                    androidx.compose.foundation.interaction.g r9 = r0.f4930g
                    r8.<init>(r15, r9, r3)
                    r9 = 3
                    r10 = 0
                    kotlinx.coroutines.i.e(r5, r6, r7, r8, r9, r10)
                L81:
                    r15 = r0
                    r0 = r1
                    r1 = r4
                    goto L28
                L85:
                    kotlin.b2 r15 = kotlin.b2.f124493a
                    return r15
                */
                throw new UnsupportedOperationException("Method not decompiled: androidx.compose.foundation.HoverableKt$hoverable$2.AnonymousClass3.AnonymousClass1.invokeSuspend(java.lang.Object):java.lang.Object");
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        AnonymousClass3(q0 q0Var, androidx.compose.foundation.interaction.g gVar, a1<androidx.compose.foundation.interaction.c.a> a1Var, kotlin.coroutines.c<? super AnonymousClass3> cVar) {
            super(2, cVar);
            this.f4923d = q0Var;
            this.f4924e = gVar;
            this.f4925f = a1Var;
        }

        @Override // yh.p
        @dl.e
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Object invoke(@dl.d androidx.compose.ui.input.pointer.i0 i0Var, @dl.e kotlin.coroutines.c<? super b2> cVar) {
            return ((AnonymousClass3) create(i0Var, cVar)).invokeSuspend(b2.f124493a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @dl.d
        public final kotlin.coroutines.c<b2> create(@dl.e Object obj, @dl.d kotlin.coroutines.c<?> cVar) {
            AnonymousClass3 anonymousClass3 = new AnonymousClass3(this.f4923d, this.f4924e, this.f4925f, cVar);
            anonymousClass3.f4922c = obj;
            return anonymousClass3;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @dl.e
        public final Object invokeSuspend(@dl.d Object obj) throws Throwable {
            Object objH = kotlin.coroutines.intrinsics.b.h();
            int i10 = this.f4921b;
            if (i10 == 0) {
                t0.n(obj);
                androidx.compose.ui.input.pointer.i0 i0Var = (androidx.compose.ui.input.pointer.i0) this.f4922c;
                AnonymousClass1 anonymousClass1 = new AnonymousClass1(getContext(), this.f4923d, this.f4924e, this.f4925f, null);
                this.f4921b = 1;
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

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    HoverableKt$hoverable$2(androidx.compose.foundation.interaction.g gVar, boolean z10) {
        super(3);
        this.f4911b = gVar;
        this.f4912c = z10;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public static final Object e(androidx.compose.foundation.interaction.g gVar, a1<androidx.compose.foundation.interaction.c.a> a1Var, kotlin.coroutines.c<? super b2> cVar) throws Throwable {
        HoverableKt$hoverable$2$invoke$emitEnter$1 hoverableKt$hoverable$2$invoke$emitEnter$1;
        androidx.compose.foundation.interaction.c.a aVar;
        if (cVar instanceof HoverableKt$hoverable$2$invoke$emitEnter$1) {
            hoverableKt$hoverable$2$invoke$emitEnter$1 = (HoverableKt$hoverable$2$invoke$emitEnter$1) cVar;
            int i10 = hoverableKt$hoverable$2$invoke$emitEnter$1.f4941e;
            if ((i10 & Integer.MIN_VALUE) != 0) {
                hoverableKt$hoverable$2$invoke$emitEnter$1.f4941e = i10 - Integer.MIN_VALUE;
            } else {
                hoverableKt$hoverable$2$invoke$emitEnter$1 = new HoverableKt$hoverable$2$invoke$emitEnter$1(cVar);
            }
        } else {
            hoverableKt$hoverable$2$invoke$emitEnter$1 = new HoverableKt$hoverable$2$invoke$emitEnter$1(cVar);
        }
        Object obj = hoverableKt$hoverable$2$invoke$emitEnter$1.f4940d;
        Object objH = kotlin.coroutines.intrinsics.b.h();
        int i11 = hoverableKt$hoverable$2$invoke$emitEnter$1.f4941e;
        if (i11 == 0) {
            t0.n(obj);
            if (h(a1Var) == null) {
                androidx.compose.foundation.interaction.c.a aVar2 = new androidx.compose.foundation.interaction.c.a();
                hoverableKt$hoverable$2$invoke$emitEnter$1.f4938b = a1Var;
                hoverableKt$hoverable$2$invoke$emitEnter$1.f4939c = aVar2;
                hoverableKt$hoverable$2$invoke$emitEnter$1.f4941e = 1;
                if (gVar.b(aVar2, hoverableKt$hoverable$2$invoke$emitEnter$1) == objH) {
                    return objH;
                }
                aVar = aVar2;
            }
            return b2.f124493a;
        }
        if (i11 != 1) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        aVar = (androidx.compose.foundation.interaction.c.a) hoverableKt$hoverable$2$invoke$emitEnter$1.f4939c;
        a1Var = (a1) hoverableKt$hoverable$2$invoke$emitEnter$1.f4938b;
        t0.n(obj);
        i(a1Var, aVar);
        return b2.f124493a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public static final Object f(a1<androidx.compose.foundation.interaction.c.a> a1Var, androidx.compose.foundation.interaction.g gVar, kotlin.coroutines.c<? super b2> cVar) throws Throwable {
        HoverableKt$hoverable$2$invoke$emitExit$1 hoverableKt$hoverable$2$invoke$emitExit$1;
        if (cVar instanceof HoverableKt$hoverable$2$invoke$emitExit$1) {
            hoverableKt$hoverable$2$invoke$emitExit$1 = (HoverableKt$hoverable$2$invoke$emitExit$1) cVar;
            int i10 = hoverableKt$hoverable$2$invoke$emitExit$1.f4944d;
            if ((i10 & Integer.MIN_VALUE) != 0) {
                hoverableKt$hoverable$2$invoke$emitExit$1.f4944d = i10 - Integer.MIN_VALUE;
            } else {
                hoverableKt$hoverable$2$invoke$emitExit$1 = new HoverableKt$hoverable$2$invoke$emitExit$1(cVar);
            }
        } else {
            hoverableKt$hoverable$2$invoke$emitExit$1 = new HoverableKt$hoverable$2$invoke$emitExit$1(cVar);
        }
        Object obj = hoverableKt$hoverable$2$invoke$emitExit$1.f4943c;
        Object objH = kotlin.coroutines.intrinsics.b.h();
        int i11 = hoverableKt$hoverable$2$invoke$emitExit$1.f4944d;
        if (i11 == 0) {
            t0.n(obj);
            androidx.compose.foundation.interaction.c.a aVarH = h(a1Var);
            if (aVarH != null) {
                androidx.compose.foundation.interaction.d bVar = new androidx.compose.foundation.interaction.c.b(aVarH);
                hoverableKt$hoverable$2$invoke$emitExit$1.f4942b = a1Var;
                hoverableKt$hoverable$2$invoke$emitExit$1.f4944d = 1;
                if (gVar.b(bVar, hoverableKt$hoverable$2$invoke$emitExit$1) == objH) {
                    return objH;
                }
            }
            return b2.f124493a;
        }
        if (i11 != 1) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        a1Var = (a1) hoverableKt$hoverable$2$invoke$emitExit$1.f4942b;
        t0.n(obj);
        i(a1Var, null);
        return b2.f124493a;
    }

    private static final androidx.compose.foundation.interaction.c.a h(a1<androidx.compose.foundation.interaction.c.a> a1Var) {
        return a1Var.getValue();
    }

    private static final void i(a1<androidx.compose.foundation.interaction.c.a> a1Var, androidx.compose.foundation.interaction.c.a aVar) {
        a1Var.setValue(aVar);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void j(a1<androidx.compose.foundation.interaction.c.a> a1Var, androidx.compose.foundation.interaction.g gVar) {
        androidx.compose.foundation.interaction.c.a aVarH = h(a1Var);
        if (aVarH != null) {
            gVar.a(new androidx.compose.foundation.interaction.c.b(aVarH));
            i(a1Var, null);
        }
    }

    @dl.d
    @androidx.compose.runtime.h
    public final androidx.compose.ui.n d(@dl.d androidx.compose.ui.n composed, @dl.e androidx.compose.runtime.p pVar, int i10) {
        androidx.compose.ui.n nVarC;
        kotlin.jvm.internal.f0.p(composed, "$this$composed");
        pVar.T(1294013553);
        if (ComposerKt.g0()) {
            ComposerKt.w0(1294013553, i10, -1, "androidx.compose.foundation.hoverable.<anonymous> (Hoverable.kt:54)");
        }
        pVar.T(773894976);
        pVar.T(-492369756);
        Object objU = pVar.U();
        androidx.compose.runtime.p.Companion companion = androidx.compose.runtime.p.INSTANCE;
        if (objU == companion.a()) {
            Object xVar = new androidx.compose.runtime.x(EffectsKt.m(EmptyCoroutineContext.f124694b, pVar));
            pVar.N(xVar);
            objU = xVar;
        }
        pVar.c0();
        q0 coroutineScope = ((androidx.compose.runtime.x) objU).getCoroutineScope();
        pVar.c0();
        pVar.T(-492369756);
        Object objU2 = pVar.U();
        if (objU2 == companion.a()) {
            objU2 = h2.g(null, null, 2, null);
            pVar.N(objU2);
        }
        pVar.c0();
        final a1 a1Var = (a1) objU2;
        final androidx.compose.foundation.interaction.g gVar = this.f4911b;
        pVar.T(511388516);
        boolean zS = pVar.s(a1Var) | pVar.s(gVar);
        Object objU3 = pVar.U();
        if (zS || objU3 == companion.a()) {
            objU3 = new yh.l<androidx.compose.runtime.f0, androidx.compose.runtime.e0>() { // from class: androidx.compose.foundation.HoverableKt$hoverable$2$1$1

                /* JADX INFO: compiled from: Effects.kt */
                @Metadata(bv = {}, d1 = {"\u0000\u0011\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\b\u0010\u0003\u001a\u00020\u0002H\u0016¨\u0006\u0004¸\u0006\u0000"}, d2 = {"androidx/compose/runtime/f0$a", "Landroidx/compose/runtime/e0;", "Lkotlin/b2;", "dispose", "runtime_release"}, k = 1, mv = {1, 7, 1})
                public static final class a implements androidx.compose.runtime.e0 {

                    /* JADX INFO: renamed from: a, reason: collision with root package name */
                    final /* synthetic */ a1 f4915a;

                    /* JADX INFO: renamed from: b, reason: collision with root package name */
                    final /* synthetic */ androidx.compose.foundation.interaction.g f4916b;

                    public a(a1 a1Var, androidx.compose.foundation.interaction.g gVar) {
                        this.f4915a = a1Var;
                        this.f4916b = gVar;
                    }

                    @Override // androidx.compose.runtime.e0
                    public void dispose() {
                        HoverableKt$hoverable$2.j(this.f4915a, this.f4916b);
                    }
                }

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                {
                    super(1);
                }

                @Override // yh.l
                @dl.d
                /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
                public final androidx.compose.runtime.e0 invoke(@dl.d androidx.compose.runtime.f0 DisposableEffect) {
                    kotlin.jvm.internal.f0.p(DisposableEffect, "$this$DisposableEffect");
                    return new a(a1Var, gVar);
                }
            };
            pVar.N(objU3);
        }
        pVar.c0();
        EffectsKt.c(gVar, (yh.l) objU3, pVar, 0);
        Boolean boolValueOf = Boolean.valueOf(this.f4912c);
        Object objValueOf = Boolean.valueOf(this.f4912c);
        androidx.compose.foundation.interaction.g gVar2 = this.f4911b;
        boolean z10 = this.f4912c;
        pVar.T(1618982084);
        boolean zS2 = pVar.s(objValueOf) | pVar.s(a1Var) | pVar.s(gVar2);
        Object objU4 = pVar.U();
        if (zS2 || objU4 == companion.a()) {
            objU4 = new HoverableKt$hoverable$2$2$1(z10, a1Var, gVar2, null);
            pVar.N(objU4);
        }
        pVar.c0();
        EffectsKt.h(boolValueOf, (yh.p) objU4, pVar, 64);
        if (this.f4912c) {
            androidx.compose.ui.n.Companion companion2 = androidx.compose.ui.n.INSTANCE;
            androidx.compose.foundation.interaction.g gVar3 = this.f4911b;
            nVarC = SuspendingPointerInputFilterKt.c(companion2, gVar3, new AnonymousClass3(coroutineScope, gVar3, a1Var, null));
        } else {
            nVarC = androidx.compose.ui.n.INSTANCE;
        }
        if (ComposerKt.g0()) {
            ComposerKt.v0();
        }
        pVar.c0();
        return nVarC;
    }

    @Override // yh.q
    public /* bridge */ /* synthetic */ androidx.compose.ui.n invoke(androidx.compose.ui.n nVar, androidx.compose.runtime.p pVar, Integer num) {
        return d(nVar, pVar, num.intValue());
    }
}
