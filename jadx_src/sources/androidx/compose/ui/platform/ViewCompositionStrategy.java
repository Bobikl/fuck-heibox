package androidx.compose.ui.platform;

import android.view.View;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.ViewTreeLifecycleOwner;
import com.umeng.analytics.pro.ak;
import com.umeng.message.common.UPushNotificationChannel;
import kotlin.Metadata;
import kotlin.jvm.internal.Ref;

/* JADX INFO: compiled from: ViewCompositionStrategy.android.kt */
/* JADX INFO: loaded from: classes.dex */
@Metadata(bv = {}, d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\bf\u0018\u0000 \u00062\u00020\u0001:\u0005\u0006\u0007\b\t\nJ\u0016\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u00042\u0006\u0010\u0003\u001a\u00020\u0002H&ø\u0001\u0000\u0082\u0002\u0006\n\u0004\b!0\u0001¨\u0006\u000bÀ\u0006\u0001"}, d2 = {"Landroidx/compose/ui/platform/ViewCompositionStrategy;", "", "Landroidx/compose/ui/platform/AbstractComposeView;", sd.b.f139384b, "Lkotlin/Function0;", "Lkotlin/b2;", ak.av, "DisposeOnDetachedFromWindow", "DisposeOnDetachedFromWindowOrReleasedFromPool", "b", "DisposeOnViewTreeLifecycleDestroyed", "ui_release"}, k = 1, mv = {1, 7, 1})
public interface ViewCompositionStrategy {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    @dl.d
    public static final Companion INSTANCE = Companion.f15697a;

    /* JADX INFO: compiled from: ViewCompositionStrategy.android.kt */
    @androidx.compose.runtime.internal.o(parameters = 0)
    @Metadata(bv = {}, d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0007\u0010\bJ\u0016\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016¨\u0006\t"}, d2 = {"Landroidx/compose/ui/platform/ViewCompositionStrategy$DisposeOnDetachedFromWindow;", "Landroidx/compose/ui/platform/ViewCompositionStrategy;", "Landroidx/compose/ui/platform/AbstractComposeView;", sd.b.f139384b, "Lkotlin/Function0;", "Lkotlin/b2;", ak.av, "<init>", "()V", "ui_release"}, k = 1, mv = {1, 7, 1})
    public static final class DisposeOnDetachedFromWindow implements ViewCompositionStrategy {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        @dl.d
        public static final DisposeOnDetachedFromWindow f15678b = new DisposeOnDetachedFromWindow();

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public static final int f15679c = 0;

        /* JADX INFO: compiled from: ViewCompositionStrategy.android.kt */
        @Metadata(bv = {}, d1 = {"\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u0010\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016J\u0010\u0010\u0006\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016¨\u0006\u0007"}, d2 = {"androidx/compose/ui/platform/ViewCompositionStrategy$DisposeOnDetachedFromWindow$a", "Landroid/view/View$OnAttachStateChangeListener;", "Landroid/view/View;", "v", "Lkotlin/b2;", "onViewAttachedToWindow", "onViewDetachedFromWindow", "ui_release"}, k = 1, mv = {1, 7, 1})
        public static final class a implements View.OnAttachStateChangeListener {

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            final /* synthetic */ AbstractComposeView f15680b;

            a(AbstractComposeView abstractComposeView) {
                this.f15680b = abstractComposeView;
            }

            @Override // android.view.View.OnAttachStateChangeListener
            public void onViewAttachedToWindow(@dl.d View v10) {
                kotlin.jvm.internal.f0.p(v10, "v");
            }

            @Override // android.view.View.OnAttachStateChangeListener
            public void onViewDetachedFromWindow(@dl.d View v10) {
                kotlin.jvm.internal.f0.p(v10, "v");
                this.f15680b.e();
            }
        }

        private DisposeOnDetachedFromWindow() {
        }

        @Override // androidx.compose.ui.platform.ViewCompositionStrategy
        @dl.d
        public yh.a<kotlin.b2> a(@dl.d final AbstractComposeView view) {
            kotlin.jvm.internal.f0.p(view, "view");
            final a aVar = new a(view);
            view.addOnAttachStateChangeListener(aVar);
            return new yh.a<kotlin.b2>() { // from class: androidx.compose.ui.platform.ViewCompositionStrategy$DisposeOnDetachedFromWindow$installFor$1
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                {
                    super(0);
                }

                @Override // yh.a
                public /* bridge */ /* synthetic */ kotlin.b2 invoke() {
                    invoke2();
                    return kotlin.b2.f124493a;
                }

                /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
                public final void invoke2() {
                    view.removeOnAttachStateChangeListener(aVar);
                }
            };
        }
    }

    /* JADX INFO: compiled from: ViewCompositionStrategy.android.kt */
    @androidx.compose.runtime.internal.o(parameters = 0)
    @Metadata(bv = {}, d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0007\u0010\bJ\u0016\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016¨\u0006\t"}, d2 = {"Landroidx/compose/ui/platform/ViewCompositionStrategy$DisposeOnDetachedFromWindowOrReleasedFromPool;", "Landroidx/compose/ui/platform/ViewCompositionStrategy;", "Landroidx/compose/ui/platform/AbstractComposeView;", sd.b.f139384b, "Lkotlin/Function0;", "Lkotlin/b2;", ak.av, "<init>", "()V", "ui_release"}, k = 1, mv = {1, 7, 1})
    public static final class DisposeOnDetachedFromWindowOrReleasedFromPool implements ViewCompositionStrategy {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        @dl.d
        public static final DisposeOnDetachedFromWindowOrReleasedFromPool f15683b = new DisposeOnDetachedFromWindowOrReleasedFromPool();

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public static final int f15684c = 0;

        /* JADX INFO: compiled from: ViewCompositionStrategy.android.kt */
        @Metadata(bv = {}, d1 = {"\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u0010\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016J\u0010\u0010\u0006\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016¨\u0006\u0007"}, d2 = {"androidx/compose/ui/platform/ViewCompositionStrategy$DisposeOnDetachedFromWindowOrReleasedFromPool$a", "Landroid/view/View$OnAttachStateChangeListener;", "Landroid/view/View;", "v", "Lkotlin/b2;", "onViewAttachedToWindow", "onViewDetachedFromWindow", "ui_release"}, k = 1, mv = {1, 7, 1})
        public static final class a implements View.OnAttachStateChangeListener {

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            final /* synthetic */ AbstractComposeView f15685b;

            a(AbstractComposeView abstractComposeView) {
                this.f15685b = abstractComposeView;
            }

            @Override // android.view.View.OnAttachStateChangeListener
            public void onViewAttachedToWindow(@dl.d View v10) {
                kotlin.jvm.internal.f0.p(v10, "v");
            }

            @Override // android.view.View.OnAttachStateChangeListener
            public void onViewDetachedFromWindow(@dl.d View v10) {
                kotlin.jvm.internal.f0.p(v10, "v");
                if (c2.a.f(this.f15685b)) {
                    return;
                }
                this.f15685b.e();
            }
        }

        /* JADX INFO: compiled from: ViewCompositionStrategy.android.kt */
        @Metadata(bv = {}, d1 = {"\u0000\u0006\n\u0002\u0018\u0002\n\u0000\u0010\u0001\u001a\u00020\u0000H\n"}, d2 = {"Lkotlin/b2;", "<anonymous>"}, k = 3, mv = {1, 7, 1})
        public static final class b implements c2.b {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            final /* synthetic */ AbstractComposeView f15686a;

            b(AbstractComposeView abstractComposeView) {
                this.f15686a = abstractComposeView;
            }

            @Override // c2.b
            public final void a() {
                this.f15686a.e();
            }
        }

        private DisposeOnDetachedFromWindowOrReleasedFromPool() {
        }

        @Override // androidx.compose.ui.platform.ViewCompositionStrategy
        @dl.d
        public yh.a<kotlin.b2> a(@dl.d final AbstractComposeView view) {
            kotlin.jvm.internal.f0.p(view, "view");
            final a aVar = new a(view);
            view.addOnAttachStateChangeListener(aVar);
            final b bVar = new b(view);
            c2.a.a(view, bVar);
            return new yh.a<kotlin.b2>() { // from class: androidx.compose.ui.platform.ViewCompositionStrategy$DisposeOnDetachedFromWindowOrReleasedFromPool$installFor$1
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                {
                    super(0);
                }

                @Override // yh.a
                public /* bridge */ /* synthetic */ kotlin.b2 invoke() {
                    invoke2();
                    return kotlin.b2.f124493a;
                }

                /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
                public final void invoke2() {
                    view.removeOnAttachStateChangeListener(aVar);
                    c2.a.g(view, bVar);
                }
            };
        }
    }

    /* JADX INFO: compiled from: ViewCompositionStrategy.android.kt */
    @androidx.compose.runtime.internal.o(parameters = 0)
    @Metadata(bv = {}, d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0007\u0010\bJ\u0016\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016¨\u0006\t"}, d2 = {"Landroidx/compose/ui/platform/ViewCompositionStrategy$DisposeOnViewTreeLifecycleDestroyed;", "Landroidx/compose/ui/platform/ViewCompositionStrategy;", "Landroidx/compose/ui/platform/AbstractComposeView;", sd.b.f139384b, "Lkotlin/Function0;", "Lkotlin/b2;", ak.av, "<init>", "()V", "ui_release"}, k = 1, mv = {1, 7, 1})
    public static final class DisposeOnViewTreeLifecycleDestroyed implements ViewCompositionStrategy {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        @dl.d
        public static final DisposeOnViewTreeLifecycleDestroyed f15690b = new DisposeOnViewTreeLifecycleDestroyed();

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public static final int f15691c = 0;

        /* JADX INFO: compiled from: ViewCompositionStrategy.android.kt */
        @Metadata(bv = {}, d1 = {"\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u0010\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016J\u0010\u0010\u0006\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016¨\u0006\u0007"}, d2 = {"androidx/compose/ui/platform/ViewCompositionStrategy$DisposeOnViewTreeLifecycleDestroyed$a", "Landroid/view/View$OnAttachStateChangeListener;", "Landroid/view/View;", "v", "Lkotlin/b2;", "onViewAttachedToWindow", "onViewDetachedFromWindow", "ui_release"}, k = 1, mv = {1, 7, 1})
        public static final class a implements View.OnAttachStateChangeListener {

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            final /* synthetic */ AbstractComposeView f15692b;

            /* JADX INFO: renamed from: c, reason: collision with root package name */
            final /* synthetic */ Ref.ObjectRef<yh.a<kotlin.b2>> f15693c;

            a(AbstractComposeView abstractComposeView, Ref.ObjectRef<yh.a<kotlin.b2>> objectRef) {
                this.f15692b = abstractComposeView;
                this.f15693c = objectRef;
            }

            /* JADX WARN: Type inference failed for: r4v7, types: [T, yh.a] */
            @Override // android.view.View.OnAttachStateChangeListener
            public void onViewAttachedToWindow(@dl.d View v10) {
                kotlin.jvm.internal.f0.p(v10, "v");
                androidx.lifecycle.y yVarA = ViewTreeLifecycleOwner.a(this.f15692b);
                AbstractComposeView abstractComposeView = this.f15692b;
                if (yVarA == null) {
                    throw new IllegalStateException(("View tree for " + abstractComposeView + " has no ViewTreeLifecycleOwner").toString());
                }
                kotlin.jvm.internal.f0.o(yVarA, "checkNotNull(ViewTreeLif…                        }");
                Ref.ObjectRef<yh.a<kotlin.b2>> objectRef = this.f15693c;
                AbstractComposeView abstractComposeView2 = this.f15692b;
                Lifecycle lifecycle = yVarA.getLifecycle();
                kotlin.jvm.internal.f0.o(lifecycle, "lco.lifecycle");
                objectRef.f124891b = ViewCompositionStrategy_androidKt.c(abstractComposeView2, lifecycle);
                this.f15692b.removeOnAttachStateChangeListener(this);
            }

            @Override // android.view.View.OnAttachStateChangeListener
            public void onViewDetachedFromWindow(@dl.d View v10) {
                kotlin.jvm.internal.f0.p(v10, "v");
            }
        }

        private DisposeOnViewTreeLifecycleDestroyed() {
        }

        /* JADX WARN: Type inference failed for: r2v0, types: [T, androidx.compose.ui.platform.ViewCompositionStrategy$DisposeOnViewTreeLifecycleDestroyed$installFor$1] */
        @Override // androidx.compose.ui.platform.ViewCompositionStrategy
        @dl.d
        public yh.a<kotlin.b2> a(@dl.d final AbstractComposeView view) {
            kotlin.jvm.internal.f0.p(view, "view");
            if (!view.isAttachedToWindow()) {
                final Ref.ObjectRef objectRef = new Ref.ObjectRef();
                final a aVar = new a(view, objectRef);
                view.addOnAttachStateChangeListener(aVar);
                objectRef.f124891b = new yh.a<kotlin.b2>() { // from class: androidx.compose.ui.platform.ViewCompositionStrategy$DisposeOnViewTreeLifecycleDestroyed$installFor$1
                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    {
                        super(0);
                    }

                    @Override // yh.a
                    public /* bridge */ /* synthetic */ kotlin.b2 invoke() {
                        invoke2();
                        return kotlin.b2.f124493a;
                    }

                    /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
                    public final void invoke2() {
                        view.removeOnAttachStateChangeListener(aVar);
                    }
                };
                return new yh.a<kotlin.b2>() { // from class: androidx.compose.ui.platform.ViewCompositionStrategy$DisposeOnViewTreeLifecycleDestroyed$installFor$2
                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    {
                        super(0);
                    }

                    @Override // yh.a
                    public /* bridge */ /* synthetic */ kotlin.b2 invoke() {
                        invoke2();
                        return kotlin.b2.f124493a;
                    }

                    /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
                    public final void invoke2() {
                        objectRef.f124891b.invoke();
                    }
                };
            }
            androidx.lifecycle.y yVarA = ViewTreeLifecycleOwner.a(view);
            if (yVarA != null) {
                kotlin.jvm.internal.f0.o(yVarA, "checkNotNull(ViewTreeLif…eOwner\"\n                }");
                Lifecycle lifecycle = yVarA.getLifecycle();
                kotlin.jvm.internal.f0.o(lifecycle, "lco.lifecycle");
                return ViewCompositionStrategy_androidKt.c(view, lifecycle);
            }
            throw new IllegalStateException(("View tree for " + view + " has no ViewTreeLifecycleOwner").toString());
        }
    }

    /* JADX INFO: renamed from: androidx.compose.ui.platform.ViewCompositionStrategy$a, reason: from kotlin metadata */
    /* JADX INFO: compiled from: ViewCompositionStrategy.android.kt */
    @Metadata(bv = {}, d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0006\u0010\u0007R\u0011\u0010\u0005\u001a\u00020\u00028F¢\u0006\u0006\u001a\u0004\b\u0003\u0010\u0004¨\u0006\b"}, d2 = {"Landroidx/compose/ui/platform/ViewCompositionStrategy$a;", "", "Landroidx/compose/ui/platform/ViewCompositionStrategy;", ak.av, "()Landroidx/compose/ui/platform/ViewCompositionStrategy;", UPushNotificationChannel.DEFAULT_NOTIFICATION_CHANNEL_NAME, "<init>", "()V", "ui_release"}, k = 1, mv = {1, 7, 1})
    public static final class Companion {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        static final /* synthetic */ Companion f15697a = new Companion();

        private Companion() {
        }

        @dl.d
        public final ViewCompositionStrategy a() {
            return DisposeOnDetachedFromWindowOrReleasedFromPool.f15683b;
        }
    }

    /* JADX INFO: compiled from: ViewCompositionStrategy.android.kt */
    @androidx.compose.runtime.internal.o(parameters = 0)
    @Metadata(bv = {}, d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\n\u001a\u00020\u0007¢\u0006\u0004\b\u000b\u0010\fB\u0011\b\u0016\u0012\u0006\u0010\u000e\u001a\u00020\r¢\u0006\u0004\b\u000b\u0010\u000fJ\u0016\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016R\u0014\u0010\n\u001a\u00020\u00078\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\b\u0010\t¨\u0006\u0010"}, d2 = {"Landroidx/compose/ui/platform/ViewCompositionStrategy$b;", "Landroidx/compose/ui/platform/ViewCompositionStrategy;", "Landroidx/compose/ui/platform/AbstractComposeView;", sd.b.f139384b, "Lkotlin/Function0;", "Lkotlin/b2;", ak.av, "Landroidx/lifecycle/Lifecycle;", "b", "Landroidx/lifecycle/Lifecycle;", "lifecycle", "<init>", "(Landroidx/lifecycle/Lifecycle;)V", "Landroidx/lifecycle/y;", "lifecycleOwner", "(Landroidx/lifecycle/y;)V", "ui_release"}, k = 1, mv = {1, 7, 1})
    public static final class b implements ViewCompositionStrategy {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public static final int f15698c = 8;

        /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
        @dl.d
        private final Lifecycle lifecycle;

        public b(@dl.d Lifecycle lifecycle) {
            kotlin.jvm.internal.f0.p(lifecycle, "lifecycle");
            this.lifecycle = lifecycle;
        }

        /* JADX WARN: Illegal instructions before constructor call */
        public b(@dl.d androidx.lifecycle.y lifecycleOwner) {
            kotlin.jvm.internal.f0.p(lifecycleOwner, "lifecycleOwner");
            Lifecycle lifecycle = lifecycleOwner.getLifecycle();
            kotlin.jvm.internal.f0.o(lifecycle, "lifecycleOwner.lifecycle");
            this(lifecycle);
        }

        @Override // androidx.compose.ui.platform.ViewCompositionStrategy
        @dl.d
        public yh.a<kotlin.b2> a(@dl.d AbstractComposeView view) {
            kotlin.jvm.internal.f0.p(view, "view");
            return ViewCompositionStrategy_androidKt.c(view, this.lifecycle);
        }
    }

    @dl.d
    yh.a<kotlin.b2> a(@dl.d AbstractComposeView abstractComposeView);
}
