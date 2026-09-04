package androidx.compose.ui.platform;

import android.content.ContentResolver;
import android.content.Context;
import android.database.ContentObserver;
import android.net.Uri;
import android.os.Handler;
import android.os.Looper;
import android.provider.Settings;
import android.view.View;
import android.view.ViewParent;
import androidx.compose.runtime.PausableMonotonicFrameClock;
import androidx.compose.runtime.Recomposer;
import androidx.compose.ui.R;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.ViewTreeLifecycleOwner;
import com.ss.bytertc.base.media.screen.RXScreenCaptureService;
import com.umeng.analytics.pro.ak;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.Metadata;
import kotlin.coroutines.CoroutineContext;
import kotlin.coroutines.EmptyCoroutineContext;
import kotlin.jvm.internal.Ref;
import kotlinx.coroutines.CoroutineStart;

/* JADX INFO: compiled from: WindowRecomposer.android.kt */
/* JADX INFO: loaded from: classes.dex */
@Metadata(bv = {}, d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0007\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010%\n\u0002\b\u0012\u001a\f\u0010\u0002\u001a\u0004\u0018\u00010\u0001*\u00020\u0000\u001a\u0016\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00060\u00052\u0006\u0010\u0004\u001a\u00020\u0003H\u0002\u001a\"\u0010\r\u001a\u00020\f*\u00020\u00002\b\b\u0002\u0010\t\u001a\u00020\b2\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\nH\u0007\"&\u0010\u0011\u001a\u0014\u0012\u0004\u0012\u00020\u0003\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00060\u00050\u000e8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000f\u0010\u0010\",\u0010\u0017\u001a\u0004\u0018\u00010\u0001*\u00020\u00002\b\u0010\u0012\u001a\u0004\u0018\u00010\u00018F@FX\u0086\u000e¢\u0006\f\u001a\u0004\b\u0013\u0010\u0014\"\u0004\b\u0015\u0010\u0016\"\u0018\u0010\u001a\u001a\u00020\u0000*\u00020\u00008BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b\u0018\u0010\u0019\"\u001e\u0010\u001f\u001a\u00020\f*\u00020\u00008@X\u0080\u0004¢\u0006\f\u0012\u0004\b\u001d\u0010\u001e\u001a\u0004\b\u001b\u0010\u001c¨\u0006 "}, d2 = {"Landroid/view/View;", "Landroidx/compose/runtime/r;", "d", "Landroid/content/Context;", "applicationContext", "Lkotlinx/coroutines/flow/u;", "", "e", "Lkotlin/coroutines/CoroutineContext;", "coroutineContext", "Landroidx/lifecycle/Lifecycle;", "lifecycle", "Landroidx/compose/runtime/Recomposer;", "b", "", ak.av, "Ljava/util/Map;", "animationScale", "value", "f", "(Landroid/view/View;)Landroidx/compose/runtime/r;", "j", "(Landroid/view/View;Landroidx/compose/runtime/r;)V", "compositionContext", "g", "(Landroid/view/View;)Landroid/view/View;", "contentChild", RXScreenCaptureService.KEY_HEIGHT, "(Landroid/view/View;)Landroidx/compose/runtime/Recomposer;", "getWindowRecomposer$annotations", "(Landroid/view/View;)V", "windowRecomposer", "ui_release"}, k = 2, mv = {1, 7, 1})
public final class WindowRecomposer_androidKt {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @dl.d
    private static final Map<Context, kotlinx.coroutines.flow.u<Float>> f15738a = new LinkedHashMap();

    /* JADX INFO: compiled from: WindowRecomposer.android.kt */
    @Metadata(bv = {}, d1 = {"\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u0010\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016J\u0010\u0010\u0006\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016¨\u0006\u0007"}, d2 = {"androidx/compose/ui/platform/WindowRecomposer_androidKt$a", "Landroid/view/View$OnAttachStateChangeListener;", "Landroid/view/View;", "v", "Lkotlin/b2;", "onViewAttachedToWindow", "onViewDetachedFromWindow", "ui_release"}, k = 1, mv = {1, 7, 1})
    public static final class a implements View.OnAttachStateChangeListener {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ View f15739b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ Recomposer f15740c;

        a(View view, Recomposer recomposer) {
            this.f15739b = view;
            this.f15740c = recomposer;
        }

        @Override // android.view.View.OnAttachStateChangeListener
        public void onViewAttachedToWindow(@dl.d View v10) {
            kotlin.jvm.internal.f0.p(v10, "v");
        }

        @Override // android.view.View.OnAttachStateChangeListener
        public void onViewDetachedFromWindow(@dl.d View v10) {
            kotlin.jvm.internal.f0.p(v10, "v");
            this.f15739b.removeOnAttachStateChangeListener(this);
            this.f15740c.i0();
        }
    }

    /* JADX INFO: compiled from: WindowRecomposer.android.kt */
    @Metadata(bv = {}, d1 = {"\u0000\u001d\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u001a\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u00022\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004H\u0016¨\u0006\b"}, d2 = {"androidx/compose/ui/platform/WindowRecomposer_androidKt$b", "Landroid/database/ContentObserver;", "", "selfChange", "Landroid/net/Uri;", "uri", "Lkotlin/b2;", "onChange", "ui_release"}, k = 1, mv = {1, 7, 1})
    public static final class b extends ContentObserver {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ kotlinx.coroutines.channels.k<kotlin.b2> f15741a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        b(kotlinx.coroutines.channels.k<kotlin.b2> kVar, Handler handler) {
            super(handler);
            this.f15741a = kVar;
        }

        @Override // android.database.ContentObserver
        public void onChange(boolean z10, @dl.e Uri uri) {
            this.f15741a.v(kotlin.b2.f124493a);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v12, types: [kotlin.coroutines.CoroutineContext] */
    /* JADX WARN: Type inference failed for: r0v14, types: [T, androidx.compose.ui.platform.c1] */
    /* JADX WARN: Type inference failed for: r0v17 */
    /* JADX WARN: Type inference failed for: r0v18 */
    /* JADX WARN: Type inference failed for: r10v3, types: [kotlin.coroutines.CoroutineContext] */
    @androidx.compose.ui.g
    @dl.d
    public static final Recomposer b(@dl.d final View view, @dl.d CoroutineContext coroutineContext, @dl.e Lifecycle lifecycle) {
        final PausableMonotonicFrameClock pausableMonotonicFrameClock;
        CoroutineContext coroutineContext2;
        ?? c1Var;
        kotlin.jvm.internal.f0.p(view, "<this>");
        kotlin.jvm.internal.f0.p(coroutineContext, "coroutineContext");
        if (coroutineContext.f(kotlin.coroutines.d.f124698w1) == null || coroutineContext.f(androidx.compose.runtime.w0.INSTANCE) == null) {
            coroutineContext = AndroidUiDispatcher.INSTANCE.a().I(coroutineContext);
        }
        androidx.compose.runtime.w0 w0Var = (androidx.compose.runtime.w0) coroutineContext.f(androidx.compose.runtime.w0.INSTANCE);
        if (w0Var != null) {
            PausableMonotonicFrameClock pausableMonotonicFrameClock2 = new PausableMonotonicFrameClock(w0Var);
            pausableMonotonicFrameClock2.h();
            pausableMonotonicFrameClock = pausableMonotonicFrameClock2;
        } else {
            pausableMonotonicFrameClock = null;
        }
        final Ref.ObjectRef objectRef = new Ref.ObjectRef();
        androidx.compose.ui.q qVar = (androidx.compose.ui.q) coroutineContext.f(androidx.compose.ui.q.INSTANCE);
        ?? r10 = qVar;
        if (qVar == null) {
            c1Var = new c1();
            objectRef.f124891b = c1Var;
        }
        if (pausableMonotonicFrameClock != null) {
            r10 = c1Var;
            coroutineContext2 = pausableMonotonicFrameClock;
        } else {
            r10 = c1Var;
            coroutineContext2 = EmptyCoroutineContext.f124694b;
        }
        CoroutineContext coroutineContextI = coroutineContext.I(coroutineContext2).I(r10);
        final Recomposer recomposer = new Recomposer(coroutineContextI);
        final kotlinx.coroutines.q0 q0VarA = kotlinx.coroutines.r0.a(coroutineContextI);
        if (lifecycle == null) {
            androidx.lifecycle.y yVarA = ViewTreeLifecycleOwner.a(view);
            lifecycle = yVarA != null ? yVarA.getLifecycle() : null;
        }
        if (lifecycle != null) {
            view.addOnAttachStateChangeListener(new a(view, recomposer));
            lifecycle.a(new androidx.lifecycle.v() { // from class: androidx.compose.ui.platform.WindowRecomposer_androidKt$createLifecycleAwareWindowRecomposer$2

                /* JADX INFO: compiled from: WindowRecomposer.android.kt */
                @Metadata(k = 3, mv = {1, 7, 1}, xi = 48)
                public final /* synthetic */ class a {

                    /* JADX INFO: renamed from: a, reason: collision with root package name */
                    public static final /* synthetic */ int[] f15747a;

                    static {
                        int[] iArr = new int[Lifecycle.Event.values().length];
                        iArr[Lifecycle.Event.ON_CREATE.ordinal()] = 1;
                        iArr[Lifecycle.Event.ON_START.ordinal()] = 2;
                        iArr[Lifecycle.Event.ON_STOP.ordinal()] = 3;
                        iArr[Lifecycle.Event.ON_DESTROY.ordinal()] = 4;
                        iArr[Lifecycle.Event.ON_PAUSE.ordinal()] = 5;
                        iArr[Lifecycle.Event.ON_RESUME.ordinal()] = 6;
                        iArr[Lifecycle.Event.ON_ANY.ordinal()] = 7;
                        f15747a = iArr;
                    }
                }

                @Override // androidx.lifecycle.v
                public void d(@dl.d androidx.lifecycle.y lifecycleOwner, @dl.d Lifecycle.Event event) {
                    kotlin.jvm.internal.f0.p(lifecycleOwner, "lifecycleOwner");
                    kotlin.jvm.internal.f0.p(event, "event");
                    int i10 = a.f15747a[event.ordinal()];
                    if (i10 == 1) {
                        kotlinx.coroutines.k.f(q0VarA, null, CoroutineStart.UNDISPATCHED, new WindowRecomposer_androidKt$createLifecycleAwareWindowRecomposer$2$onStateChanged$1(objectRef, recomposer, lifecycleOwner, this, view, null), 1, null);
                        return;
                    }
                    if (i10 == 2) {
                        PausableMonotonicFrameClock pausableMonotonicFrameClock3 = pausableMonotonicFrameClock;
                        if (pausableMonotonicFrameClock3 != null) {
                            pausableMonotonicFrameClock3.j();
                            return;
                        }
                        return;
                    }
                    if (i10 != 3) {
                        if (i10 != 4) {
                            return;
                        }
                        recomposer.i0();
                    } else {
                        PausableMonotonicFrameClock pausableMonotonicFrameClock4 = pausableMonotonicFrameClock;
                        if (pausableMonotonicFrameClock4 != null) {
                            pausableMonotonicFrameClock4.h();
                        }
                    }
                }
            });
            return recomposer;
        }
        throw new IllegalStateException(("ViewTreeLifecycleOwner not found from " + view).toString());
    }

    public static /* synthetic */ Recomposer c(View view, CoroutineContext coroutineContext, Lifecycle lifecycle, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            coroutineContext = EmptyCoroutineContext.f124694b;
        }
        if ((i10 & 2) != 0) {
            lifecycle = null;
        }
        return b(view, coroutineContext, lifecycle);
    }

    @dl.e
    public static final androidx.compose.runtime.r d(@dl.d View view) {
        kotlin.jvm.internal.f0.p(view, "<this>");
        androidx.compose.runtime.r rVarF = f(view);
        if (rVarF != null) {
            return rVarF;
        }
        for (ViewParent parent = view.getParent(); rVarF == null && (parent instanceof View); parent = parent.getParent()) {
            rVarF = f((View) parent);
        }
        return rVarF;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final kotlinx.coroutines.flow.u<Float> e(Context context) {
        kotlinx.coroutines.flow.u<Float> uVar;
        Map<Context, kotlinx.coroutines.flow.u<Float>> map = f15738a;
        synchronized (map) {
            kotlinx.coroutines.flow.u<Float> uVarN1 = map.get(context);
            if (uVarN1 == null) {
                ContentResolver contentResolver = context.getContentResolver();
                Uri uriFor = Settings.Global.getUriFor("animator_duration_scale");
                kotlinx.coroutines.channels.k kVarD = kotlinx.coroutines.channels.m.d(-1, null, null, 6, null);
                uVarN1 = kotlinx.coroutines.flow.g.N1(kotlinx.coroutines.flow.g.I0(new WindowRecomposer_androidKt$getAnimationScaleFlowFor$1$1$1(contentResolver, uriFor, new b(kVarD, androidx.core.os.l.a(Looper.getMainLooper())), kVarD, context, null)), kotlinx.coroutines.r0.b(), kotlinx.coroutines.flow.r.Companion.b(kotlinx.coroutines.flow.r.INSTANCE, 0L, 0L, 3, null), Float.valueOf(Settings.Global.getFloat(context.getContentResolver(), "animator_duration_scale", 1.0f)));
                map.put(context, uVarN1);
            }
            uVar = uVarN1;
        }
        return uVar;
    }

    @dl.e
    public static final androidx.compose.runtime.r f(@dl.d View view) {
        kotlin.jvm.internal.f0.p(view, "<this>");
        Object tag = view.getTag(R.id.androidx_compose_ui_view_composition_context);
        if (tag instanceof androidx.compose.runtime.r) {
            return (androidx.compose.runtime.r) tag;
        }
        return null;
    }

    private static final View g(View view) {
        Object parent = view.getParent();
        while (parent instanceof View) {
            View view2 = (View) parent;
            if (view2.getId() == 16908290) {
                return view;
            }
            parent = view2.getParent();
            view = view2;
        }
        return view;
    }

    @dl.d
    public static final Recomposer h(@dl.d View view) {
        kotlin.jvm.internal.f0.p(view, "<this>");
        if (!view.isAttachedToWindow()) {
            throw new IllegalStateException(("Cannot locate windowRecomposer; View " + view + " is not attached to a window").toString());
        }
        View viewG = g(view);
        androidx.compose.runtime.r rVarF = f(viewG);
        if (rVarF == null) {
            return WindowRecomposerPolicy.f15731a.b(viewG);
        }
        if (rVarF instanceof Recomposer) {
            return (Recomposer) rVarF;
        }
        throw new IllegalStateException("root viewTreeParentCompositionContext is not a Recomposer".toString());
    }

    public static /* synthetic */ void i(View view) {
    }

    public static final void j(@dl.d View view, @dl.e androidx.compose.runtime.r rVar) {
        kotlin.jvm.internal.f0.p(view, "<this>");
        view.setTag(R.id.androidx_compose_ui_view_composition_context, rVar);
    }
}
