package androidx.compose.ui.input.pointer;

import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.j2;
import androidx.compose.ui.ComposedModifierKt;
import androidx.compose.ui.platform.CompositionLocalsKt;
import androidx.compose.ui.platform.InspectableValueKt;
import androidx.compose.ui.platform.x0;
import com.umeng.analytics.pro.ak;
import kotlin.Metadata;
import kotlin.b2;
import kotlin.coroutines.jvm.internal.RestrictedSuspendLambda;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.t0;

/* JADX INFO: compiled from: PointerIcon.kt */
/* JADX INFO: loaded from: classes.dex */
@Metadata(bv = {}, d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\u001a\u001e\u0010\u0005\u001a\u00020\u0000*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u00012\b\b\u0002\u0010\u0004\u001a\u00020\u0003H\u0007¨\u0006\u0006"}, d2 = {"Landroidx/compose/ui/n;", "Landroidx/compose/ui/input/pointer/t;", "icon", "", "overrideDescendants", ak.av, "ui_release"}, k = 2, mv = {1, 7, 1})
public final class PointerIconKt {
    @j2
    @dl.d
    public static final androidx.compose.ui.n a(@dl.d androidx.compose.ui.n nVar, @dl.d final t icon, final boolean z10) {
        kotlin.jvm.internal.f0.p(nVar, "<this>");
        kotlin.jvm.internal.f0.p(icon, "icon");
        return ComposedModifierKt.g(nVar, InspectableValueKt.e() ? new yh.l<x0, b2>() { // from class: androidx.compose.ui.input.pointer.PointerIconKt$pointerHoverIcon$$inlined$debugInspectorInfo$1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(1);
            }

            public final void a(@dl.d x0 x0Var) {
                kotlin.jvm.internal.f0.p(x0Var, "$this$null");
                x0Var.d("pointerHoverIcon");
                x0Var.getProperties().c("icon", icon);
                x0Var.getProperties().c("overrideDescendants", Boolean.valueOf(z10));
            }

            @Override // yh.l
            public /* bridge */ /* synthetic */ b2 invoke(x0 x0Var) {
                a(x0Var);
                return b2.f124493a;
            }
        } : InspectableValueKt.b(), new yh.q<androidx.compose.ui.n, androidx.compose.runtime.p, Integer, androidx.compose.ui.n>() { // from class: androidx.compose.ui.input.pointer.PointerIconKt$pointerHoverIcon$2

            /* JADX INFO: renamed from: androidx.compose.ui.input.pointer.PointerIconKt$pointerHoverIcon$2$1, reason: invalid class name */
            /* JADX INFO: compiled from: PointerIcon.kt */
            @Metadata(k = 3, mv = {1, 7, 1}, xi = 48)
            @kotlin.coroutines.jvm.internal.d(c = "androidx.compose.ui.input.pointer.PointerIconKt$pointerHoverIcon$2$1", f = "PointerIcon.kt", i = {}, l = {74}, m = "invokeSuspend", n = {}, s = {})
            public static final class AnonymousClass1 extends SuspendLambda implements yh.p<i0, kotlin.coroutines.c<? super b2>, Object> {

                /* JADX INFO: renamed from: b, reason: collision with root package name */
                int f14665b;

                /* JADX INFO: renamed from: c, reason: collision with root package name */
                private /* synthetic */ Object f14666c;

                /* JADX INFO: renamed from: d, reason: collision with root package name */
                final /* synthetic */ boolean f14667d;

                /* JADX INFO: renamed from: e, reason: collision with root package name */
                final /* synthetic */ v f14668e;

                /* JADX INFO: renamed from: f, reason: collision with root package name */
                final /* synthetic */ t f14669f;

                /* JADX INFO: renamed from: androidx.compose.ui.input.pointer.PointerIconKt$pointerHoverIcon$2$1$1, reason: invalid class name and collision with other inner class name */
                /* JADX INFO: compiled from: PointerIcon.kt */
                @Metadata(k = 3, mv = {1, 7, 1}, xi = 48)
                @kotlin.coroutines.jvm.internal.d(c = "androidx.compose.ui.input.pointer.PointerIconKt$pointerHoverIcon$2$1$1", f = "PointerIcon.kt", i = {0}, l = {80}, m = "invokeSuspend", n = {"$this$awaitPointerEventScope"}, s = {"L$0"})
                public static final class C00871 extends RestrictedSuspendLambda implements yh.p<d, kotlin.coroutines.c<? super b2>, Object> {

                    /* JADX INFO: renamed from: c, reason: collision with root package name */
                    int f14670c;

                    /* JADX INFO: renamed from: d, reason: collision with root package name */
                    private /* synthetic */ Object f14671d;

                    /* JADX INFO: renamed from: e, reason: collision with root package name */
                    final /* synthetic */ boolean f14672e;

                    /* JADX INFO: renamed from: f, reason: collision with root package name */
                    final /* synthetic */ v f14673f;

                    /* JADX INFO: renamed from: g, reason: collision with root package name */
                    final /* synthetic */ t f14674g;

                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    C00871(boolean z10, v vVar, t tVar, kotlin.coroutines.c<? super C00871> cVar) {
                        super(2, cVar);
                        this.f14672e = z10;
                        this.f14673f = vVar;
                        this.f14674g = tVar;
                    }

                    @Override // yh.p
                    @dl.e
                    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
                    public final Object invoke(@dl.d d dVar, @dl.e kotlin.coroutines.c<? super b2> cVar) {
                        return ((C00871) create(dVar, cVar)).invokeSuspend(b2.f124493a);
                    }

                    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                    @dl.d
                    public final kotlin.coroutines.c<b2> create(@dl.e Object obj, @dl.d kotlin.coroutines.c<?> cVar) {
                        C00871 c00871 = new C00871(this.f14672e, this.f14673f, this.f14674g, cVar);
                        c00871.f14671d = obj;
                        return c00871;
                    }

                    /* JADX WARN: Code duplicated, block: B:11:0x002b  */
                    /* JADX WARN: Code duplicated, block: B:12:0x002e  */
                    /* JADX WARN: Code duplicated, block: B:15:0x003a A[RETURN] */
                    /* JADX WARN: Code duplicated, block: B:16:0x003b  */
                    /* JADX WARN: Code duplicated, block: B:19:0x0053  */
                    /* JADX WARN: Code duplicated, block: B:24:0x007c A[ADDED_TO_REGION] */
                    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:16:0x003b -> B:17:0x0040). Please report as a decompilation issue!!! */
                    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
                        jadx.core.utils.exceptions.JadxOverflowException: Regions count limit reached at block B:19:0x0053
                        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
                        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
                        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
                        */
                    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                    @dl.e
                    public final java.lang.Object invokeSuspend(@dl.d java.lang.Object r13) {
                        /*
                            r12 = this;
                            java.lang.Object r0 = kotlin.coroutines.intrinsics.b.h()
                            int r1 = r12.f14670c
                            r2 = 1
                            if (r1 == 0) goto L1e
                            if (r1 != r2) goto L16
                            java.lang.Object r1 = r12.f14671d
                            androidx.compose.ui.input.pointer.d r1 = (androidx.compose.ui.input.pointer.d) r1
                            kotlin.t0.n(r13)
                            r3 = r1
                            r1 = r0
                            r0 = r12
                            goto L40
                        L16:
                            java.lang.IllegalStateException r13 = new java.lang.IllegalStateException
                            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
                            r13.<init>(r0)
                            throw r13
                        L1e:
                            kotlin.t0.n(r13)
                            java.lang.Object r13 = r12.f14671d
                            androidx.compose.ui.input.pointer.d r13 = (androidx.compose.ui.input.pointer.d) r13
                            r1 = r13
                            r13 = r12
                        L27:
                            boolean r3 = r13.f14672e
                            if (r3 == 0) goto L2e
                            androidx.compose.ui.input.pointer.PointerEventPass r3 = androidx.compose.ui.input.pointer.PointerEventPass.Main
                            goto L30
                        L2e:
                            androidx.compose.ui.input.pointer.PointerEventPass r3 = androidx.compose.ui.input.pointer.PointerEventPass.Initial
                        L30:
                            r13.f14671d = r1
                            r13.f14670c = r2
                            java.lang.Object r3 = r1.r1(r3, r13)
                            if (r3 != r0) goto L3b
                            return r0
                        L3b:
                            r11 = r0
                            r0 = r13
                            r13 = r3
                            r3 = r1
                            r1 = r11
                        L40:
                            androidx.compose.ui.input.pointer.p r13 = (androidx.compose.ui.input.pointer.p) r13
                            int r4 = r13.getType()
                            androidx.compose.ui.input.pointer.r$a r5 = androidx.compose.ui.input.pointer.r.INSTANCE
                            int r6 = r5.e()
                            boolean r4 = androidx.compose.ui.input.pointer.r.k(r4, r6)
                            r6 = 0
                            if (r4 == 0) goto L6e
                            java.util.List r4 = r13.e()
                            java.lang.Object r4 = r4.get(r6)
                            androidx.compose.ui.input.pointer.y r4 = (androidx.compose.ui.input.pointer.PointerInputChange) r4
                            long r7 = r3.a()
                            b1.m$a r9 = b1.m.f30386b
                            long r9 = r9.c()
                            boolean r4 = androidx.compose.ui.input.pointer.q.j(r4, r7, r9)
                            if (r4 == 0) goto L6e
                            r6 = r2
                        L6e:
                            int r13 = r13.getType()
                            int r4 = r5.b()
                            boolean r13 = androidx.compose.ui.input.pointer.r.k(r13, r4)
                            if (r13 != 0) goto L85
                            if (r6 != 0) goto L85
                            androidx.compose.ui.input.pointer.v r13 = r0.f14673f
                            androidx.compose.ui.input.pointer.t r4 = r0.f14674g
                            r13.a(r4)
                        L85:
                            r13 = r0
                            r0 = r1
                            r1 = r3
                            goto L27
                        */
                        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.ui.input.pointer.PointerIconKt$pointerHoverIcon$2.AnonymousClass1.C00871.invokeSuspend(java.lang.Object):java.lang.Object");
                    }
                }

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                AnonymousClass1(boolean z10, v vVar, t tVar, kotlin.coroutines.c<? super AnonymousClass1> cVar) {
                    super(2, cVar);
                    this.f14667d = z10;
                    this.f14668e = vVar;
                    this.f14669f = tVar;
                }

                @Override // yh.p
                @dl.e
                /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
                public final Object invoke(@dl.d i0 i0Var, @dl.e kotlin.coroutines.c<? super b2> cVar) {
                    return ((AnonymousClass1) create(i0Var, cVar)).invokeSuspend(b2.f124493a);
                }

                @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                @dl.d
                public final kotlin.coroutines.c<b2> create(@dl.e Object obj, @dl.d kotlin.coroutines.c<?> cVar) {
                    AnonymousClass1 anonymousClass1 = new AnonymousClass1(this.f14667d, this.f14668e, this.f14669f, cVar);
                    anonymousClass1.f14666c = obj;
                    return anonymousClass1;
                }

                @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                @dl.e
                public final Object invokeSuspend(@dl.d Object obj) throws Throwable {
                    Object objH = kotlin.coroutines.intrinsics.b.h();
                    int i10 = this.f14665b;
                    if (i10 == 0) {
                        t0.n(obj);
                        i0 i0Var = (i0) this.f14666c;
                        C00871 c00871 = new C00871(this.f14667d, this.f14668e, this.f14669f, null);
                        this.f14665b = 1;
                        if (i0Var.n1(c00871, this) == objH) {
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
            {
                super(3);
            }

            @dl.d
            @androidx.compose.runtime.h
            public final androidx.compose.ui.n a(@dl.d androidx.compose.ui.n composed, @dl.e androidx.compose.runtime.p pVar, int i10) {
                kotlin.jvm.internal.f0.p(composed, "$this$composed");
                pVar.T(811087536);
                if (ComposerKt.g0()) {
                    ComposerKt.w0(811087536, i10, -1, "androidx.compose.ui.input.pointer.pointerHoverIcon.<anonymous> (PointerIcon.kt:67)");
                }
                v vVar = (v) pVar.K(CompositionLocalsKt.q());
                androidx.compose.ui.n nVarB = vVar == null ? androidx.compose.ui.n.INSTANCE : SuspendingPointerInputFilterKt.b(composed, icon, Boolean.valueOf(z10), new AnonymousClass1(z10, vVar, icon, null));
                if (ComposerKt.g0()) {
                    ComposerKt.v0();
                }
                pVar.c0();
                return nVarB;
            }

            @Override // yh.q
            public /* bridge */ /* synthetic */ androidx.compose.ui.n invoke(androidx.compose.ui.n nVar2, androidx.compose.runtime.p pVar, Integer num) {
                return a(nVar2, pVar, num.intValue());
            }
        });
    }

    public static /* synthetic */ androidx.compose.ui.n b(androidx.compose.ui.n nVar, t tVar, boolean z10, int i10, Object obj) {
        if ((i10 & 2) != 0) {
            z10 = false;
        }
        return a(nVar, tVar, z10);
    }
}
