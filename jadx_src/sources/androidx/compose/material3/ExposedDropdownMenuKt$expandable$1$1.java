package androidx.compose.material3;

import androidx.compose.foundation.gestures.ForEachGestureKt;
import kotlin.Metadata;
import kotlin.coroutines.jvm.internal.RestrictedSuspendLambda;
import kotlin.coroutines.jvm.internal.SuspendLambda;

/* JADX INFO: compiled from: ExposedDropdownMenu.kt */
/* JADX INFO: loaded from: classes.dex */
@Metadata(k = 3, mv = {1, 7, 1}, xi = 48)
@kotlin.coroutines.jvm.internal.d(c = "androidx.compose.material3.ExposedDropdownMenuKt$expandable$1$1", f = "ExposedDropdownMenu.kt", i = {}, l = {bb.c.b.f30743k7}, m = "invokeSuspend", n = {}, s = {})
public final class ExposedDropdownMenuKt$expandable$1$1 extends SuspendLambda implements yh.p<androidx.compose.ui.input.pointer.i0, kotlin.coroutines.c<? super kotlin.b2>, Object> {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    int f9454b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private /* synthetic */ Object f9455c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    final /* synthetic */ yh.a<kotlin.b2> f9456d;

    /* JADX INFO: renamed from: androidx.compose.material3.ExposedDropdownMenuKt$expandable$1$1$1, reason: invalid class name */
    /* JADX INFO: compiled from: ExposedDropdownMenu.kt */
    @Metadata(k = 3, mv = {1, 7, 1}, xi = 48)
    @kotlin.coroutines.jvm.internal.d(c = "androidx.compose.material3.ExposedDropdownMenuKt$expandable$1$1$1", f = "ExposedDropdownMenu.kt", i = {}, l = {bb.c.b.f30766l7}, m = "invokeSuspend", n = {}, s = {})
    public static final class AnonymousClass1 extends SuspendLambda implements yh.p<androidx.compose.ui.input.pointer.i0, kotlin.coroutines.c<? super kotlin.b2>, Object> {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        int f9457b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private /* synthetic */ Object f9458c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        final /* synthetic */ yh.a<kotlin.b2> f9459d;

        /* JADX INFO: renamed from: androidx.compose.material3.ExposedDropdownMenuKt$expandable$1$1$1$1, reason: invalid class name and collision with other inner class name */
        /* JADX INFO: compiled from: ExposedDropdownMenu.kt */
        @Metadata(k = 3, mv = {1, 7, 1}, xi = 48)
        @kotlin.coroutines.jvm.internal.d(c = "androidx.compose.material3.ExposedDropdownMenuKt$expandable$1$1$1$1", f = "ExposedDropdownMenu.kt", i = {}, l = {bb.c.b.f30789m7}, m = "invokeSuspend", n = {}, s = {})
        public static final class C00641 extends SuspendLambda implements yh.p<kotlinx.coroutines.q0, kotlin.coroutines.c<? super kotlin.b2>, Object> {

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            int f9460b;

            /* JADX INFO: renamed from: c, reason: collision with root package name */
            final /* synthetic */ androidx.compose.ui.input.pointer.i0 f9461c;

            /* JADX INFO: renamed from: d, reason: collision with root package name */
            final /* synthetic */ yh.a<kotlin.b2> f9462d;

            /* JADX INFO: renamed from: androidx.compose.material3.ExposedDropdownMenuKt$expandable$1$1$1$1$1, reason: invalid class name and collision with other inner class name */
            /* JADX INFO: compiled from: ExposedDropdownMenu.kt */
            @Metadata(k = 3, mv = {1, 7, 1}, xi = 48)
            @kotlin.coroutines.jvm.internal.d(c = "androidx.compose.material3.ExposedDropdownMenuKt$expandable$1$1$1$1$1", f = "ExposedDropdownMenu.kt", i = {0}, l = {bb.c.b.f30858p7}, m = "invokeSuspend", n = {"$this$awaitPointerEventScope"}, s = {"L$0"})
            public static final class C00651 extends RestrictedSuspendLambda implements yh.p<androidx.compose.ui.input.pointer.d, kotlin.coroutines.c<? super kotlin.b2>, Object> {

                /* JADX INFO: renamed from: c, reason: collision with root package name */
                int f9463c;

                /* JADX INFO: renamed from: d, reason: collision with root package name */
                private /* synthetic */ Object f9464d;

                /* JADX INFO: renamed from: e, reason: collision with root package name */
                final /* synthetic */ yh.a<kotlin.b2> f9465e;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                C00651(yh.a<kotlin.b2> aVar, kotlin.coroutines.c<? super C00651> cVar) {
                    super(2, cVar);
                    this.f9465e = aVar;
                }

                @Override // yh.p
                @dl.e
                /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
                public final Object invoke(@dl.d androidx.compose.ui.input.pointer.d dVar, @dl.e kotlin.coroutines.c<? super kotlin.b2> cVar) {
                    return ((C00651) create(dVar, cVar)).invokeSuspend(kotlin.b2.f124493a);
                }

                @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                @dl.d
                public final kotlin.coroutines.c<kotlin.b2> create(@dl.e Object obj, @dl.d kotlin.coroutines.c<?> cVar) {
                    C00651 c00651 = new C00651(this.f9465e, cVar);
                    c00651.f9464d = obj;
                    return c00651;
                }

                /* JADX WARN: Code duplicated, block: B:15:0x0047  */
                /* JADX WARN: Code duplicated, block: B:18:0x0054 A[LOOP:0: B:14:0x0045->B:18:0x0054, LOOP_END] */
                /* JADX WARN: Code duplicated, block: B:24:0x0058 A[EDGE_INSN: B:24:0x0058->B:20:0x0058 BREAK  A[LOOP:0: B:14:0x0045->B:18:0x0054], SYNTHETIC] */
                /* JADX WARN: Code duplicated, block: B:25:0x0057 A[SYNTHETIC] */
                /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:12:0x0034 -> B:13:0x0039). Please report as a decompilation issue!!! */
                /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
                    jadx.core.utils.exceptions.JadxOverflowException: Regions stack size limit reached
                    	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
                    	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
                    	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
                    */
                @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                @dl.e
                public final java.lang.Object invokeSuspend(@dl.d java.lang.Object r10) {
                    /*
                        r9 = this;
                        java.lang.Object r0 = kotlin.coroutines.intrinsics.b.h()
                        int r1 = r9.f9463c
                        r2 = 1
                        if (r1 == 0) goto L1e
                        if (r1 != r2) goto L16
                        java.lang.Object r1 = r9.f9464d
                        androidx.compose.ui.input.pointer.d r1 = (androidx.compose.ui.input.pointer.d) r1
                        kotlin.t0.n(r10)
                        r3 = r1
                        r1 = r0
                        r0 = r9
                        goto L39
                    L16:
                        java.lang.IllegalStateException r10 = new java.lang.IllegalStateException
                        java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
                        r10.<init>(r0)
                        throw r10
                    L1e:
                        kotlin.t0.n(r10)
                        java.lang.Object r10 = r9.f9464d
                        androidx.compose.ui.input.pointer.d r10 = (androidx.compose.ui.input.pointer.d) r10
                        r1 = r10
                        r10 = r9
                    L27:
                        androidx.compose.ui.input.pointer.PointerEventPass r3 = androidx.compose.ui.input.pointer.PointerEventPass.Initial
                        r10.f9464d = r1
                        r10.f9463c = r2
                        java.lang.Object r3 = r1.r1(r3, r10)
                        if (r3 != r0) goto L34
                        return r0
                    L34:
                        r8 = r0
                        r0 = r10
                        r10 = r3
                        r3 = r1
                        r1 = r8
                    L39:
                        androidx.compose.ui.input.pointer.p r10 = (androidx.compose.ui.input.pointer.p) r10
                        java.util.List r10 = r10.e()
                        int r4 = r10.size()
                        r5 = 0
                        r6 = r5
                    L45:
                        if (r6 >= r4) goto L57
                        java.lang.Object r7 = r10.get(r6)
                        androidx.compose.ui.input.pointer.y r7 = (androidx.compose.ui.input.pointer.PointerInputChange) r7
                        boolean r7 = androidx.compose.ui.input.pointer.q.d(r7)
                        if (r7 != 0) goto L54
                        goto L58
                    L54:
                        int r6 = r6 + 1
                        goto L45
                    L57:
                        r5 = r2
                    L58:
                        if (r5 == 0) goto L62
                        yh.a<kotlin.b2> r10 = r0.f9465e
                        r10.invoke()
                        kotlin.b2 r10 = kotlin.b2.f124493a
                        return r10
                    L62:
                        r10 = r0
                        r0 = r1
                        r1 = r3
                        goto L27
                    */
                    throw new UnsupportedOperationException("Method not decompiled: androidx.compose.material3.ExposedDropdownMenuKt$expandable$1$1.AnonymousClass1.C00641.C00651.invokeSuspend(java.lang.Object):java.lang.Object");
                }
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            C00641(androidx.compose.ui.input.pointer.i0 i0Var, yh.a<kotlin.b2> aVar, kotlin.coroutines.c<? super C00641> cVar) {
                super(2, cVar);
                this.f9461c = i0Var;
                this.f9462d = aVar;
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            @dl.d
            public final kotlin.coroutines.c<kotlin.b2> create(@dl.e Object obj, @dl.d kotlin.coroutines.c<?> cVar) {
                return new C00641(this.f9461c, this.f9462d, cVar);
            }

            @Override // yh.p
            @dl.e
            public final Object invoke(@dl.d kotlinx.coroutines.q0 q0Var, @dl.e kotlin.coroutines.c<? super kotlin.b2> cVar) {
                return ((C00641) create(q0Var, cVar)).invokeSuspend(kotlin.b2.f124493a);
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            @dl.e
            public final Object invokeSuspend(@dl.d Object obj) throws Throwable {
                Object objH = kotlin.coroutines.intrinsics.b.h();
                int i10 = this.f9460b;
                if (i10 == 0) {
                    kotlin.t0.n(obj);
                    androidx.compose.ui.input.pointer.i0 i0Var = this.f9461c;
                    C00651 c00651 = new C00651(this.f9462d, null);
                    this.f9460b = 1;
                    if (i0Var.n1(c00651, this) == objH) {
                        return objH;
                    }
                } else {
                    if (i10 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    kotlin.t0.n(obj);
                }
                return kotlin.b2.f124493a;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        AnonymousClass1(yh.a<kotlin.b2> aVar, kotlin.coroutines.c<? super AnonymousClass1> cVar) {
            super(2, cVar);
            this.f9459d = aVar;
        }

        @Override // yh.p
        @dl.e
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Object invoke(@dl.d androidx.compose.ui.input.pointer.i0 i0Var, @dl.e kotlin.coroutines.c<? super kotlin.b2> cVar) {
            return ((AnonymousClass1) create(i0Var, cVar)).invokeSuspend(kotlin.b2.f124493a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @dl.d
        public final kotlin.coroutines.c<kotlin.b2> create(@dl.e Object obj, @dl.d kotlin.coroutines.c<?> cVar) {
            AnonymousClass1 anonymousClass1 = new AnonymousClass1(this.f9459d, cVar);
            anonymousClass1.f9458c = obj;
            return anonymousClass1;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @dl.e
        public final Object invokeSuspend(@dl.d Object obj) throws Throwable {
            Object objH = kotlin.coroutines.intrinsics.b.h();
            int i10 = this.f9457b;
            if (i10 == 0) {
                kotlin.t0.n(obj);
                C00641 c00641 = new C00641((androidx.compose.ui.input.pointer.i0) this.f9458c, this.f9459d, null);
                this.f9457b = 1;
                if (kotlinx.coroutines.r0.g(c00641, this) == objH) {
                    return objH;
                }
            } else {
                if (i10 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                kotlin.t0.n(obj);
            }
            return kotlin.b2.f124493a;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    ExposedDropdownMenuKt$expandable$1$1(yh.a<kotlin.b2> aVar, kotlin.coroutines.c<? super ExposedDropdownMenuKt$expandable$1$1> cVar) {
        super(2, cVar);
        this.f9456d = aVar;
    }

    @Override // yh.p
    @dl.e
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public final Object invoke(@dl.d androidx.compose.ui.input.pointer.i0 i0Var, @dl.e kotlin.coroutines.c<? super kotlin.b2> cVar) {
        return ((ExposedDropdownMenuKt$expandable$1$1) create(i0Var, cVar)).invokeSuspend(kotlin.b2.f124493a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @dl.d
    public final kotlin.coroutines.c<kotlin.b2> create(@dl.e Object obj, @dl.d kotlin.coroutines.c<?> cVar) {
        ExposedDropdownMenuKt$expandable$1$1 exposedDropdownMenuKt$expandable$1$1 = new ExposedDropdownMenuKt$expandable$1$1(this.f9456d, cVar);
        exposedDropdownMenuKt$expandable$1$1.f9455c = obj;
        return exposedDropdownMenuKt$expandable$1$1;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @dl.e
    public final Object invokeSuspend(@dl.d Object obj) throws Throwable {
        Object objH = kotlin.coroutines.intrinsics.b.h();
        int i10 = this.f9454b;
        if (i10 == 0) {
            kotlin.t0.n(obj);
            androidx.compose.ui.input.pointer.i0 i0Var = (androidx.compose.ui.input.pointer.i0) this.f9455c;
            AnonymousClass1 anonymousClass1 = new AnonymousClass1(this.f9456d, null);
            this.f9454b = 1;
            if (ForEachGestureKt.d(i0Var, anonymousClass1, this) == objH) {
                return objH;
            }
        } else {
            if (i10 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            kotlin.t0.n(obj);
        }
        return kotlin.b2.f124493a;
    }
}
