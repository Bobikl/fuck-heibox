package androidx.compose.ui.platform;

import android.view.View;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.CompositionLocalKt;
import androidx.compose.runtime.EffectsKt;
import androidx.compose.runtime.tooling.InspectionTablesKt;
import androidx.compose.ui.R;
import androidx.lifecycle.Lifecycle;
import com.max.xiaoheihe.bean.mall.MallPriceObj;
import com.umeng.analytics.pro.ak;
import java.util.Set;
import kotlin.Metadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;

/* JADX INFO: compiled from: Wrapper.android.kt */
/* JADX INFO: loaded from: classes.dex */
@Metadata(bv = {}, d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\t\b\u0002\u0018\u00002\u00020\u00012\u00020\u0002B\u0017\u0012\u0006\u0010\u0014\u001a\u00020\u000f\u0012\u0006\u0010\u0018\u001a\u00020\u0001¢\u0006\u0004\b#\u0010$J\"\u0010\u0007\u001a\u00020\u00042\u0011\u0010\u0006\u001a\r\u0012\u0004\u0012\u00020\u00040\u0003¢\u0006\u0002\b\u0005H\u0016¢\u0006\u0004\b\u0007\u0010\bJ\b\u0010\t\u001a\u00020\u0004H\u0016J\u0018\u0010\u000e\u001a\u00020\u00042\u0006\u0010\u000b\u001a\u00020\n2\u0006\u0010\r\u001a\u00020\fH\u0016R\u0017\u0010\u0014\u001a\u00020\u000f8\u0006¢\u0006\f\n\u0004\b\u0010\u0010\u0011\u001a\u0004\b\u0012\u0010\u0013R\u0017\u0010\u0018\u001a\u00020\u00018\u0006¢\u0006\f\n\u0004\b\u0007\u0010\u0015\u001a\u0004\b\u0016\u0010\u0017R\u0016\u0010\u001b\u001a\u00020\u00198\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u000e\u0010\u001aR\u0018\u0010\u001f\u001a\u0004\u0018\u00010\u001c8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u001d\u0010\u001eR\u0014\u0010!\u001a\u00020\u00198VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0010\u0010 R\u0014\u0010\"\u001a\u00020\u00198VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\"\u0010 ¨\u0006%"}, d2 = {"Landroidx/compose/ui/platform/WrappedComposition;", "Landroidx/compose/runtime/q;", "Landroidx/lifecycle/v;", "Lkotlin/Function0;", "Lkotlin/b2;", "Landroidx/compose/runtime/h;", "content", ak.aF, "(Lyh/p;)V", "dispose", "Landroidx/lifecycle/y;", "source", "Landroidx/lifecycle/Lifecycle$Event;", androidx.core.app.o0.I0, "d", "Landroidx/compose/ui/platform/AndroidComposeView;", "b", "Landroidx/compose/ui/platform/AndroidComposeView;", "k", "()Landroidx/compose/ui/platform/AndroidComposeView;", "owner", "Landroidx/compose/runtime/q;", "i", "()Landroidx/compose/runtime/q;", MallPriceObj.TYPE_ORIGINAL, "", "Z", "disposed", "Landroidx/lifecycle/Lifecycle;", "e", "Landroidx/lifecycle/Lifecycle;", "addedToLifecycle", "()Z", "hasInvalidations", "isDisposed", "<init>", "(Landroidx/compose/ui/platform/AndroidComposeView;Landroidx/compose/runtime/q;)V", "ui_release"}, k = 1, mv = {1, 7, 1})
public final class WrappedComposition implements androidx.compose.runtime.q, androidx.lifecycle.v {

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    @dl.d
    private final AndroidComposeView owner;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    @dl.d
    private final androidx.compose.runtime.q original;

    /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata */
    private boolean disposed;

    /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata */
    @dl.e
    private Lifecycle addedToLifecycle;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    @dl.d
    private yh.p<? super androidx.compose.runtime.p, ? super Integer, kotlin.b2> f15771f;

    public WrappedComposition(@dl.d AndroidComposeView owner, @dl.d androidx.compose.runtime.q original) {
        kotlin.jvm.internal.f0.p(owner, "owner");
        kotlin.jvm.internal.f0.p(original, "original");
        this.owner = owner;
        this.original = original;
        this.f15771f = ComposableSingletons$Wrapper_androidKt.f15588a.a();
    }

    @Override // androidx.compose.runtime.q
    public boolean b() {
        return this.original.b();
    }

    @Override // androidx.compose.runtime.q
    @androidx.compose.runtime.i(scheme = "[0[0]]")
    public void c(@dl.d final yh.p<? super androidx.compose.runtime.p, ? super Integer, kotlin.b2> content) {
        kotlin.jvm.internal.f0.p(content, "content");
        this.owner.setOnViewTreeOwnersAvailable(new yh.l<AndroidComposeView.b, kotlin.b2>() { // from class: androidx.compose.ui.platform.WrappedComposition$setContent$1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            /* JADX WARN: Multi-variable type inference failed */
            {
                super(1);
            }

            public final void a(@dl.d AndroidComposeView.b it) {
                kotlin.jvm.internal.f0.p(it, "it");
                if (this.f15772b.disposed) {
                    return;
                }
                Lifecycle lifecycle = it.getLifecycleOwner().getLifecycle();
                kotlin.jvm.internal.f0.o(lifecycle, "it.lifecycleOwner.lifecycle");
                this.f15772b.f15771f = content;
                if (this.f15772b.addedToLifecycle == null) {
                    this.f15772b.addedToLifecycle = lifecycle;
                    lifecycle.a(this.f15772b);
                } else if (lifecycle.b().isAtLeast(Lifecycle.State.CREATED)) {
                    androidx.compose.runtime.q original = this.f15772b.getOriginal();
                    final WrappedComposition wrappedComposition = this.f15772b;
                    final yh.p<androidx.compose.runtime.p, Integer, kotlin.b2> pVar = content;
                    original.c(androidx.compose.runtime.internal.b.c(-2000640158, true, new yh.p<androidx.compose.runtime.p, Integer, kotlin.b2>() { // from class: androidx.compose.ui.platform.WrappedComposition$setContent$1.1

                        /* JADX INFO: renamed from: androidx.compose.ui.platform.WrappedComposition$setContent$1$1$1, reason: invalid class name and collision with other inner class name */
                        /* JADX INFO: compiled from: Wrapper.android.kt */
                        @Metadata(k = 3, mv = {1, 7, 1}, xi = 48)
                        @kotlin.coroutines.jvm.internal.d(c = "androidx.compose.ui.platform.WrappedComposition$setContent$1$1$1", f = "Wrapper.android.kt", i = {}, l = {153}, m = "invokeSuspend", n = {}, s = {})
                        public static final class C00941 extends SuspendLambda implements yh.p<kotlinx.coroutines.q0, kotlin.coroutines.c<? super kotlin.b2>, Object> {

                            /* JADX INFO: renamed from: b, reason: collision with root package name */
                            int f15776b;

                            /* JADX INFO: renamed from: c, reason: collision with root package name */
                            final /* synthetic */ WrappedComposition f15777c;

                            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                            C00941(WrappedComposition wrappedComposition, kotlin.coroutines.c<? super C00941> cVar) {
                                super(2, cVar);
                                this.f15777c = wrappedComposition;
                            }

                            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                            @dl.d
                            public final kotlin.coroutines.c<kotlin.b2> create(@dl.e Object obj, @dl.d kotlin.coroutines.c<?> cVar) {
                                return new C00941(this.f15777c, cVar);
                            }

                            @Override // yh.p
                            @dl.e
                            public final Object invoke(@dl.d kotlinx.coroutines.q0 q0Var, @dl.e kotlin.coroutines.c<? super kotlin.b2> cVar) {
                                return ((C00941) create(q0Var, cVar)).invokeSuspend(kotlin.b2.f124493a);
                            }

                            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                            @dl.e
                            public final Object invokeSuspend(@dl.d Object obj) throws Throwable {
                                Object objH = kotlin.coroutines.intrinsics.b.h();
                                int i10 = this.f15776b;
                                if (i10 == 0) {
                                    kotlin.t0.n(obj);
                                    AndroidComposeView owner = this.f15777c.getOwner();
                                    this.f15776b = 1;
                                    if (owner.i0(this) == objH) {
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

                        /* JADX INFO: renamed from: androidx.compose.ui.platform.WrappedComposition$setContent$1$1$2, reason: invalid class name */
                        /* JADX INFO: compiled from: Wrapper.android.kt */
                        @Metadata(k = 3, mv = {1, 7, 1}, xi = 48)
                        @kotlin.coroutines.jvm.internal.d(c = "androidx.compose.ui.platform.WrappedComposition$setContent$1$1$2", f = "Wrapper.android.kt", i = {}, l = {154}, m = "invokeSuspend", n = {}, s = {})
                        public static final class AnonymousClass2 extends SuspendLambda implements yh.p<kotlinx.coroutines.q0, kotlin.coroutines.c<? super kotlin.b2>, Object> {

                            /* JADX INFO: renamed from: b, reason: collision with root package name */
                            int f15778b;

                            /* JADX INFO: renamed from: c, reason: collision with root package name */
                            final /* synthetic */ WrappedComposition f15779c;

                            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                            AnonymousClass2(WrappedComposition wrappedComposition, kotlin.coroutines.c<? super AnonymousClass2> cVar) {
                                super(2, cVar);
                                this.f15779c = wrappedComposition;
                            }

                            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                            @dl.d
                            public final kotlin.coroutines.c<kotlin.b2> create(@dl.e Object obj, @dl.d kotlin.coroutines.c<?> cVar) {
                                return new AnonymousClass2(this.f15779c, cVar);
                            }

                            @Override // yh.p
                            @dl.e
                            public final Object invoke(@dl.d kotlinx.coroutines.q0 q0Var, @dl.e kotlin.coroutines.c<? super kotlin.b2> cVar) {
                                return ((AnonymousClass2) create(q0Var, cVar)).invokeSuspend(kotlin.b2.f124493a);
                            }

                            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                            @dl.e
                            public final Object invokeSuspend(@dl.d Object obj) throws Throwable {
                                Object objH = kotlin.coroutines.intrinsics.b.h();
                                int i10 = this.f15778b;
                                if (i10 == 0) {
                                    kotlin.t0.n(obj);
                                    AndroidComposeView owner = this.f15779c.getOwner();
                                    this.f15778b = 1;
                                    if (owner.S(this) == objH) {
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
                        /* JADX WARN: Multi-variable type inference failed */
                        {
                            super(2);
                        }

                        @androidx.compose.runtime.h
                        public final void a(@dl.e androidx.compose.runtime.p pVar2, int i10) {
                            if ((i10 & 11) == 2 && pVar2.b()) {
                                pVar2.l();
                                return;
                            }
                            if (ComposerKt.g0()) {
                                ComposerKt.w0(-2000640158, i10, -1, "androidx.compose.ui.platform.WrappedComposition.setContent.<anonymous>.<anonymous> (Wrapper.android.kt:139)");
                            }
                            AndroidComposeView owner = wrappedComposition.getOwner();
                            int i11 = R.id.inspection_slot_table_set;
                            Object tag = owner.getTag(i11);
                            Set<androidx.compose.runtime.tooling.b> set = kotlin.jvm.internal.w0.J(tag) ? (Set) tag : null;
                            if (set == null) {
                                Object parent = wrappedComposition.getOwner().getParent();
                                View view = parent instanceof View ? (View) parent : null;
                                Object tag2 = view != null ? view.getTag(i11) : null;
                                set = kotlin.jvm.internal.w0.J(tag2) ? (Set) tag2 : null;
                            }
                            if (set != null) {
                                set.add(pVar2.V());
                                pVar2.Q();
                            }
                            EffectsKt.h(wrappedComposition.getOwner(), new C00941(wrappedComposition, null), pVar2, 72);
                            EffectsKt.h(wrappedComposition.getOwner(), new AnonymousClass2(wrappedComposition, null), pVar2, 72);
                            androidx.compose.runtime.k1[] k1VarArr = {InspectionTablesKt.a().f(set)};
                            final WrappedComposition wrappedComposition2 = wrappedComposition;
                            final yh.p<androidx.compose.runtime.p, Integer, kotlin.b2> pVar3 = pVar;
                            CompositionLocalKt.b(k1VarArr, androidx.compose.runtime.internal.b.b(pVar2, -1193460702, true, new yh.p<androidx.compose.runtime.p, Integer, kotlin.b2>() { // from class: androidx.compose.ui.platform.WrappedComposition.setContent.1.1.3
                                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                /* JADX WARN: Multi-variable type inference failed */
                                {
                                    super(2);
                                }

                                @androidx.compose.runtime.h
                                public final void a(@dl.e androidx.compose.runtime.p pVar4, int i12) {
                                    if ((i12 & 11) == 2 && pVar4.b()) {
                                        pVar4.l();
                                        return;
                                    }
                                    if (ComposerKt.g0()) {
                                        ComposerKt.w0(-1193460702, i12, -1, "androidx.compose.ui.platform.WrappedComposition.setContent.<anonymous>.<anonymous>.<anonymous> (Wrapper.android.kt:155)");
                                    }
                                    AndroidCompositionLocals_androidKt.a(wrappedComposition2.getOwner(), pVar3, pVar4, 8);
                                    if (ComposerKt.g0()) {
                                        ComposerKt.v0();
                                    }
                                }

                                @Override // yh.p
                                public /* bridge */ /* synthetic */ kotlin.b2 invoke(androidx.compose.runtime.p pVar4, Integer num) {
                                    a(pVar4, num.intValue());
                                    return kotlin.b2.f124493a;
                                }
                            }), pVar2, 56);
                            if (ComposerKt.g0()) {
                                ComposerKt.v0();
                            }
                        }

                        @Override // yh.p
                        public /* bridge */ /* synthetic */ kotlin.b2 invoke(androidx.compose.runtime.p pVar2, Integer num) {
                            a(pVar2, num.intValue());
                            return kotlin.b2.f124493a;
                        }
                    }));
                }
            }

            @Override // yh.l
            public /* bridge */ /* synthetic */ kotlin.b2 invoke(AndroidComposeView.b bVar) {
                a(bVar);
                return kotlin.b2.f124493a;
            }
        });
    }

    @Override // androidx.lifecycle.v
    public void d(@dl.d androidx.lifecycle.y source, @dl.d Lifecycle.Event event) {
        kotlin.jvm.internal.f0.p(source, "source");
        kotlin.jvm.internal.f0.p(event, "event");
        if (event == Lifecycle.Event.ON_DESTROY) {
            dispose();
        } else {
            if (event != Lifecycle.Event.ON_CREATE || this.disposed) {
                return;
            }
            c(this.f15771f);
        }
    }

    @Override // androidx.compose.runtime.q
    public void dispose() {
        if (!this.disposed) {
            this.disposed = true;
            this.owner.getView().setTag(R.id.wrapped_composition_tag, null);
            Lifecycle lifecycle = this.addedToLifecycle;
            if (lifecycle != null) {
                lifecycle.d(this);
            }
        }
        this.original.dispose();
    }

    @dl.d
    /* JADX INFO: renamed from: i, reason: from getter */
    public final androidx.compose.runtime.q getOriginal() {
        return this.original;
    }

    @Override // androidx.compose.runtime.q
    /* JADX INFO: renamed from: isDisposed */
    public boolean getDisposed() {
        return this.original.getDisposed();
    }

    @dl.d
    /* JADX INFO: renamed from: k, reason: from getter */
    public final AndroidComposeView getOwner() {
        return this.owner;
    }
}
