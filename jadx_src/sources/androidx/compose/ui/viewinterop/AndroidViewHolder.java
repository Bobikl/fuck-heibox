package androidx.compose.ui.viewinterop;

import android.content.Context;
import android.graphics.Rect;
import android.graphics.Region;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import androidx.compose.runtime.r;
import androidx.compose.runtime.snapshots.SnapshotStateObserver;
import androidx.compose.ui.draw.DrawModifierKt;
import androidx.compose.ui.graphics.d0;
import androidx.compose.ui.input.nestedscroll.NestedScrollDispatcher;
import androidx.compose.ui.input.pointer.PointerInteropFilter_androidKt;
import androidx.compose.ui.layout.OnGloballyPositionedModifierKt;
import androidx.compose.ui.layout.e1;
import androidx.compose.ui.layout.g0;
import androidx.compose.ui.layout.i0;
import androidx.compose.ui.layout.j0;
import androidx.compose.ui.layout.k0;
import androidx.compose.ui.layout.l0;
import androidx.compose.ui.layout.m;
import androidx.compose.ui.layout.q;
import androidx.compose.ui.n;
import androidx.compose.ui.node.LayoutNode;
import androidx.compose.ui.node.b1;
import androidx.compose.ui.platform.AndroidComposeView;
import androidx.compose.ui.platform.WindowRecomposer_androidKt;
import androidx.compose.ui.platform.f1;
import androidx.core.view.w0;
import androidx.core.view.y0;
import androidx.lifecycle.ViewTreeLifecycleOwner;
import androidx.lifecycle.y;
import androidx.savedstate.ViewTreeSavedStateRegistryOwner;
import b1.f;
import com.ss.bytertc.base.media.screen.RXScreenCaptureService;
import com.umeng.analytics.pro.ak;
import com.umeng.analytics.pro.d;
import dl.e;
import fi.u;
import java.util.List;
import kotlin.Metadata;
import kotlin.b2;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.internal.Ref;
import kotlin.jvm.internal.f0;
import kotlin.t0;
import kotlinx.coroutines.k;
import kotlinx.coroutines.q0;
import org.apache.tools.ant.types.selectors.o;
import s1.g;
import s1.x;
import yh.l;
import yh.p;

/* JADX INFO: compiled from: AndroidViewHolder.android.kt */
/* JADX INFO: loaded from: classes.dex */
@Metadata(bv = {}, d1 = {"\u0000´\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0015\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0013\n\u0002\u0010\u0007\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\r\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b \u0018\u00002\u00020\u00012\u00020\u0002B'\u0012\b\u0010\u0092\u0001\u001a\u00030\u0091\u0001\u0012\n\u0010\u0094\u0001\u001a\u0005\u0018\u00010\u0093\u0001\u0012\u0006\u0010B\u001a\u00020@¢\u0006\u0006\b\u0095\u0001\u0010\u0096\u0001J \u0010\u0007\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0005\u001a\u00020\u00032\u0006\u0010\u0006\u001a\u00020\u0003H\u0002J\u0018\u0010\u000b\u001a\u00020\n2\u0006\u0010\b\u001a\u00020\u00032\u0006\u0010\t\u001a\u00020\u0003H\u0014J\u0006\u0010\f\u001a\u00020\nJ0\u0010\u0013\u001a\u00020\n2\u0006\u0010\u000e\u001a\u00020\r2\u0006\u0010\u000f\u001a\u00020\u00032\u0006\u0010\u0010\u001a\u00020\u00032\u0006\u0010\u0011\u001a\u00020\u00032\u0006\u0010\u0012\u001a\u00020\u0003H\u0014J\n\u0010\u0015\u001a\u0004\u0018\u00010\u0014H\u0016J\u0010\u0010\u0017\u001a\u00020\n2\u0006\u0010\u0016\u001a\u00020\rH\u0016J\b\u0010\u0018\u001a\u00020\nH\u0014J\b\u0010\u0019\u001a\u00020\nH\u0014J\u001e\u0010\u001f\u001a\u0004\u0018\u00010\u001e2\b\u0010\u001b\u001a\u0004\u0018\u00010\u001a2\b\u0010\u001d\u001a\u0004\u0018\u00010\u001cH\u0016J\u0018\u0010#\u001a\u00020\n2\u0006\u0010!\u001a\u00020 2\u0006\u0010\"\u001a\u00020 H\u0016J\u0010\u0010%\u001a\u00020\n2\u0006\u0010$\u001a\u00020\u0003H\u0014J\u0012\u0010(\u001a\u00020\r2\b\u0010'\u001a\u0004\u0018\u00010&H\u0016J\b\u0010)\u001a\u00020\rH\u0016J(\u0010,\u001a\u00020\r2\u0006\u0010!\u001a\u00020 2\u0006\u0010\"\u001a\u00020 2\u0006\u0010*\u001a\u00020\u00032\u0006\u0010+\u001a\u00020\u0003H\u0016J\b\u0010-\u001a\u00020\u0003H\u0016J(\u0010.\u001a\u00020\n2\u0006\u0010!\u001a\u00020 2\u0006\u0010\"\u001a\u00020 2\u0006\u0010*\u001a\u00020\u00032\u0006\u0010+\u001a\u00020\u0003H\u0016J\u0018\u0010/\u001a\u00020\n2\u0006\u0010\"\u001a\u00020 2\u0006\u0010+\u001a\u00020\u0003H\u0016J@\u00105\u001a\u00020\n2\u0006\u0010\"\u001a\u00020 2\u0006\u00100\u001a\u00020\u00032\u0006\u00101\u001a\u00020\u00032\u0006\u00102\u001a\u00020\u00032\u0006\u00103\u001a\u00020\u00032\u0006\u0010+\u001a\u00020\u00032\u0006\u00104\u001a\u00020\u001aH\u0016J8\u00106\u001a\u00020\n2\u0006\u0010\"\u001a\u00020 2\u0006\u00100\u001a\u00020\u00032\u0006\u00101\u001a\u00020\u00032\u0006\u00102\u001a\u00020\u00032\u0006\u00103\u001a\u00020\u00032\u0006\u0010+\u001a\u00020\u0003H\u0016J0\u00109\u001a\u00020\n2\u0006\u0010\"\u001a\u00020 2\u0006\u00107\u001a\u00020\u00032\u0006\u00108\u001a\u00020\u00032\u0006\u00104\u001a\u00020\u001a2\u0006\u0010+\u001a\u00020\u0003H\u0016J(\u0010=\u001a\u00020\r2\u0006\u0010\"\u001a\u00020 2\u0006\u0010;\u001a\u00020:2\u0006\u0010<\u001a\u00020:2\u0006\u00104\u001a\u00020\rH\u0016J \u0010>\u001a\u00020\r2\u0006\u0010\"\u001a\u00020 2\u0006\u0010;\u001a\u00020:2\u0006\u0010<\u001a\u00020:H\u0016J\b\u0010?\u001a\u00020\rH\u0016R\u0014\u0010B\u001a\u00020@8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0012\u0010AR.\u0010J\u001a\u0004\u0018\u00010 2\b\u0010C\u001a\u0004\u0018\u00010 8\u0006@@X\u0086\u000e¢\u0006\u0012\n\u0004\bD\u0010E\u001a\u0004\bF\u0010G\"\u0004\bH\u0010IR\u0016\u0010M\u001a\u00020\r8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bK\u0010LR*\u0010U\u001a\u00020N2\u0006\u0010C\u001a\u00020N8\u0006@FX\u0086\u000e¢\u0006\u0012\n\u0004\bO\u0010P\u001a\u0004\bQ\u0010R\"\u0004\bS\u0010TR.\u0010\\\u001a\u0004\u0018\u00010V2\b\u0010C\u001a\u0004\u0018\u00010V8\u0006@FX\u0086\u000e¢\u0006\u0012\n\u0004\b.\u0010W\u001a\u0004\bX\u0010Y\"\u0004\bZ\u0010[R.\u0010c\u001a\u0004\u0018\u00010]2\b\u0010C\u001a\u0004\u0018\u00010]8\u0006@FX\u0086\u000e¢\u0006\u0012\n\u0004\b/\u0010^\u001a\u0004\b_\u0010`\"\u0004\ba\u0010bR\u0014\u0010f\u001a\u00020d8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000f\u0010eR\u0014\u0010\u001b\u001a\u00020\u001a8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bg\u0010hR\u0016\u0010k\u001a\u00020\u00038\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bi\u0010jR\u0016\u0010l\u001a\u00020\u00038\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0011\u0010jR\u0014\u0010p\u001a\u00020m8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bn\u0010oR\u0017\u0010u\u001a\u00020q8\u0006¢\u0006\f\n\u0004\b\u0010\u0010r\u001a\u0004\bs\u0010tR6\u0010w\u001a\b\u0012\u0004\u0012\u00020\n0v2\f\u0010C\u001a\b\u0012\u0004\u0012\u00020\n0v8\u0006@DX\u0086\u000e¢\u0006\u0012\n\u0004\bw\u0010x\u001a\u0004\by\u0010z\"\u0004\b{\u0010|R4\u0010~\u001a\u0010\u0012\u0004\u0012\u00020N\u0012\u0004\u0012\u00020\n\u0018\u00010}8\u0000@\u0000X\u0080\u000e¢\u0006\u0016\n\u0004\b~\u0010\u007f\u001a\u0006\b\u0080\u0001\u0010\u0081\u0001\"\u0006\b\u0082\u0001\u0010\u0083\u0001R3\u0010\u0085\u0001\u001a\u00030\u0084\u00012\u0007\u0010C\u001a\u00030\u0084\u00018\u0006@FX\u0086\u000e¢\u0006\u0018\n\u0006\b\u0085\u0001\u0010\u0086\u0001\u001a\u0006\b\u0087\u0001\u0010\u0088\u0001\"\u0006\b\u0089\u0001\u0010\u008a\u0001R7\u0010\u008b\u0001\u001a\u0011\u0012\u0005\u0012\u00030\u0084\u0001\u0012\u0004\u0012\u00020\n\u0018\u00010}8\u0000@\u0000X\u0080\u000e¢\u0006\u0017\n\u0005\b\u008b\u0001\u0010\u007f\u001a\u0006\b\u008c\u0001\u0010\u0081\u0001\"\u0006\b\u008d\u0001\u0010\u0083\u0001R6\u0010\u008e\u0001\u001a\u0010\u0012\u0004\u0012\u00020\r\u0012\u0004\u0012\u00020\n\u0018\u00010}8\u0000@\u0000X\u0080\u000e¢\u0006\u0017\n\u0005\b\u008e\u0001\u0010\u007f\u001a\u0006\b\u008f\u0001\u0010\u0081\u0001\"\u0006\b\u0090\u0001\u0010\u0083\u0001¨\u0006\u0097\u0001"}, d2 = {"Landroidx/compose/ui/viewinterop/AndroidViewHolder;", "Landroid/view/ViewGroup;", "Landroidx/core/view/w0;", "", o.f136588l, o.f136589m, "preferred", "g", "widthMeasureSpec", "heightMeasureSpec", "Lkotlin/b2;", "onMeasure", RXScreenCaptureService.KEY_HEIGHT, "", "changed", "l", "t", "r", "b", "onLayout", "Landroid/view/ViewGroup$LayoutParams;", "getLayoutParams", "disallowIntercept", "requestDisallowInterceptTouchEvent", "onAttachedToWindow", "onDetachedFromWindow", "", "location", "Landroid/graphics/Rect;", "dirty", "Landroid/view/ViewParent;", "invalidateChildInParent", "Landroid/view/View;", "child", "target", "onDescendantInvalidated", "visibility", "onWindowVisibilityChanged", "Landroid/graphics/Region;", "region", "gatherTransparentRegion", "shouldDelayChildPressedState", "axes", "type", "j0", "getNestedScrollAxes", "j", "k", "dxConsumed", "dyConsumed", "dxUnconsumed", "dyUnconsumed", "consumed", "h0", "G", "dx", "dy", "O", "", "velocityX", "velocityY", "onNestedFling", "onNestedPreFling", "isNestedScrollingEnabled", "Landroidx/compose/ui/input/nestedscroll/NestedScrollDispatcher;", "Landroidx/compose/ui/input/nestedscroll/NestedScrollDispatcher;", "dispatcher", "value", ak.aF, "Landroid/view/View;", "getView", "()Landroid/view/View;", "setView$ui_release", "(Landroid/view/View;)V", sd.b.f139384b, "e", "Z", "hasUpdateBlock", "Landroidx/compose/ui/n;", "f", "Landroidx/compose/ui/n;", "getModifier", "()Landroidx/compose/ui/n;", "setModifier", "(Landroidx/compose/ui/n;)V", "modifier", "Landroidx/lifecycle/y;", "Landroidx/lifecycle/y;", "getLifecycleOwner", "()Landroidx/lifecycle/y;", "setLifecycleOwner", "(Landroidx/lifecycle/y;)V", "lifecycleOwner", "Landroidx/savedstate/d;", "Landroidx/savedstate/d;", "getSavedStateRegistryOwner", "()Landroidx/savedstate/d;", "setSavedStateRegistryOwner", "(Landroidx/savedstate/d;)V", "savedStateRegistryOwner", "Landroidx/compose/runtime/snapshots/SnapshotStateObserver;", "Landroidx/compose/runtime/snapshots/SnapshotStateObserver;", "snapshotObserver", "p", "[I", "q", "I", "lastWidthMeasureSpec", "lastHeightMeasureSpec", "Landroidx/core/view/y0;", ak.aB, "Landroidx/core/view/y0;", "nestedScrollingParentHelper", "Landroidx/compose/ui/node/LayoutNode;", "Landroidx/compose/ui/node/LayoutNode;", "getLayoutNode", "()Landroidx/compose/ui/node/LayoutNode;", "layoutNode", "Lkotlin/Function0;", "update", "Lyh/a;", "getUpdate", "()Lyh/a;", "setUpdate", "(Lyh/a;)V", "Lkotlin/Function1;", "onModifierChanged", "Lyh/l;", "getOnModifierChanged$ui_release", "()Lyh/l;", "setOnModifierChanged$ui_release", "(Lyh/l;)V", "Ls1/e;", "density", "Ls1/e;", "getDensity", "()Ls1/e;", "setDensity", "(Ls1/e;)V", "onDensityChanged", "getOnDensityChanged$ui_release", "setOnDensityChanged$ui_release", "onRequestDisallowInterceptTouchEvent", "getOnRequestDisallowInterceptTouchEvent$ui_release", "setOnRequestDisallowInterceptTouchEvent$ui_release", "Landroid/content/Context;", d.R, "Landroidx/compose/runtime/r;", "parentContext", "<init>", "(Landroid/content/Context;Landroidx/compose/runtime/r;Landroidx/compose/ui/input/nestedscroll/NestedScrollDispatcher;)V", "ui_release"}, k = 1, mv = {1, 7, 1})
public abstract class AndroidViewHolder extends ViewGroup implements w0 {

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    @dl.d
    private final NestedScrollDispatcher dispatcher;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    @e
    private View view;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @dl.d
    private yh.a<b2> f17016d;

    /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata */
    private boolean hasUpdateBlock;

    /* JADX INFO: renamed from: f, reason: collision with root package name and from kotlin metadata */
    @dl.d
    private n modifier;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    @e
    private l<? super n, b2> f17019g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    @dl.d
    private s1.e f17020h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    @e
    private l<? super s1.e, b2> f17021i;

    /* JADX INFO: renamed from: j, reason: collision with root package name and from kotlin metadata */
    @e
    private y lifecycleOwner;

    /* JADX INFO: renamed from: k, reason: collision with root package name and from kotlin metadata */
    @e
    private androidx.savedstate.d savedStateRegistryOwner;

    /* JADX INFO: renamed from: l, reason: collision with root package name and from kotlin metadata */
    @dl.d
    private final SnapshotStateObserver snapshotObserver;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    @dl.d
    private final l<AndroidViewHolder, b2> f17025m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    @dl.d
    private final yh.a<b2> f17026n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    @e
    private l<? super Boolean, b2> f17027o;

    /* JADX INFO: renamed from: p, reason: collision with root package name and from kotlin metadata */
    @dl.d
    private final int[] location;

    /* JADX INFO: renamed from: q, reason: collision with root package name and from kotlin metadata */
    private int lastWidthMeasureSpec;

    /* JADX INFO: renamed from: r, reason: collision with root package name and from kotlin metadata */
    private int lastHeightMeasureSpec;

    /* JADX INFO: renamed from: s, reason: collision with root package name and from kotlin metadata */
    @dl.d
    private final y0 nestedScrollingParentHelper;

    /* JADX INFO: renamed from: t, reason: collision with root package name and from kotlin metadata */
    @dl.d
    private final LayoutNode layoutNode;

    /* JADX INFO: renamed from: androidx.compose.ui.viewinterop.AndroidViewHolder$onNestedFling$1, reason: invalid class name */
    /* JADX INFO: compiled from: AndroidViewHolder.android.kt */
    @Metadata(bv = {}, d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@"}, d2 = {"Lkotlinx/coroutines/q0;", "Lkotlin/b2;", "<anonymous>"}, k = 3, mv = {1, 7, 1})
    @kotlin.coroutines.jvm.internal.d(c = "androidx.compose.ui.viewinterop.AndroidViewHolder$onNestedFling$1", f = "AndroidViewHolder.android.kt", i = {}, l = {480, bb.c.b.f30902r6}, m = "invokeSuspend", n = {}, s = {})
    public static final class AnonymousClass1 extends SuspendLambda implements p<q0, kotlin.coroutines.c<? super b2>, Object> {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        int f17050b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ boolean f17051c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        final /* synthetic */ AndroidViewHolder f17052d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        final /* synthetic */ long f17053e;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        AnonymousClass1(boolean z10, AndroidViewHolder androidViewHolder, long j10, kotlin.coroutines.c<? super AnonymousClass1> cVar) {
            super(2, cVar);
            this.f17051c = z10;
            this.f17052d = androidViewHolder;
            this.f17053e = j10;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @dl.d
        public final kotlin.coroutines.c<b2> create(@e Object obj, @dl.d kotlin.coroutines.c<?> cVar) {
            return new AnonymousClass1(this.f17051c, this.f17052d, this.f17053e, cVar);
        }

        @Override // yh.p
        @e
        public final Object invoke(@dl.d q0 q0Var, @e kotlin.coroutines.c<? super b2> cVar) {
            return ((AnonymousClass1) create(q0Var, cVar)).invokeSuspend(b2.f124493a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @e
        public final Object invokeSuspend(@dl.d Object obj) throws Throwable {
            Object objH = kotlin.coroutines.intrinsics.b.h();
            int i10 = this.f17050b;
            if (i10 == 0) {
                t0.n(obj);
                if (this.f17051c) {
                    NestedScrollDispatcher nestedScrollDispatcher = this.f17052d.dispatcher;
                    long j10 = this.f17053e;
                    long jA = x.f139262b.a();
                    this.f17050b = 2;
                    if (nestedScrollDispatcher.a(j10, jA, this) == objH) {
                        return objH;
                    }
                } else {
                    NestedScrollDispatcher nestedScrollDispatcher2 = this.f17052d.dispatcher;
                    long jA2 = x.f139262b.a();
                    long j11 = this.f17053e;
                    this.f17050b = 1;
                    if (nestedScrollDispatcher2.a(jA2, j11, this) == objH) {
                        return objH;
                    }
                }
            } else {
                if (i10 != 1 && i10 != 2) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                t0.n(obj);
            }
            return b2.f124493a;
        }
    }

    /* JADX INFO: renamed from: androidx.compose.ui.viewinterop.AndroidViewHolder$onNestedPreFling$1, reason: invalid class name and case insensitive filesystem */
    /* JADX INFO: compiled from: AndroidViewHolder.android.kt */
    @Metadata(bv = {}, d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@"}, d2 = {"Lkotlinx/coroutines/q0;", "Lkotlin/b2;", "<anonymous>"}, k = 3, mv = {1, 7, 1})
    @kotlin.coroutines.jvm.internal.d(c = "androidx.compose.ui.viewinterop.AndroidViewHolder$onNestedPreFling$1", f = "AndroidViewHolder.android.kt", i = {}, l = {bb.c.b.E6}, m = "invokeSuspend", n = {}, s = {})
    public static final class C12891 extends SuspendLambda implements p<q0, kotlin.coroutines.c<? super b2>, Object> {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        int f17054b;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        final /* synthetic */ long f17056d;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C12891(long j10, kotlin.coroutines.c<? super C12891> cVar) {
            super(2, cVar);
            this.f17056d = j10;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @dl.d
        public final kotlin.coroutines.c<b2> create(@e Object obj, @dl.d kotlin.coroutines.c<?> cVar) {
            return AndroidViewHolder.this.new C12891(this.f17056d, cVar);
        }

        @Override // yh.p
        @e
        public final Object invoke(@dl.d q0 q0Var, @e kotlin.coroutines.c<? super b2> cVar) {
            return ((C12891) create(q0Var, cVar)).invokeSuspend(b2.f124493a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @e
        public final Object invokeSuspend(@dl.d Object obj) throws Throwable {
            Object objH = kotlin.coroutines.intrinsics.b.h();
            int i10 = this.f17054b;
            if (i10 == 0) {
                t0.n(obj);
                NestedScrollDispatcher nestedScrollDispatcher = AndroidViewHolder.this.dispatcher;
                long j10 = this.f17056d;
                this.f17054b = 1;
                if (nestedScrollDispatcher.c(j10, this) == objH) {
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
    /* JADX WARN: Multi-variable type inference failed */
    public AndroidViewHolder(@dl.d Context context, @e r rVar, @dl.d NestedScrollDispatcher dispatcher) {
        super(context);
        f0.p(context, "context");
        f0.p(dispatcher, "dispatcher");
        this.dispatcher = dispatcher;
        if (rVar != null) {
            WindowRecomposer_androidKt.j(this, rVar);
        }
        setSaveFromParentEnabled(false);
        this.f17016d = new yh.a<b2>() { // from class: androidx.compose.ui.viewinterop.AndroidViewHolder$update$1
            @Override // yh.a
            public /* bridge */ /* synthetic */ b2 invoke() {
                invoke2();
                return b2.f124493a;
            }

            /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
            public final void invoke2() {
            }
        };
        n.Companion companion = n.INSTANCE;
        this.modifier = companion;
        this.f17020h = g.b(1.0f, 0.0f, 2, null);
        this.snapshotObserver = new SnapshotStateObserver(new AndroidViewHolder$snapshotObserver$1(this));
        this.f17025m = new AndroidViewHolder$onCommitAffectingUpdate$1(this);
        this.f17026n = new yh.a<b2>() { // from class: androidx.compose.ui.viewinterop.AndroidViewHolder$runUpdate$1
            {
                super(0);
            }

            @Override // yh.a
            public /* bridge */ /* synthetic */ b2 invoke() {
                invoke2();
                return b2.f124493a;
            }

            /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
            public final void invoke2() {
                if (this.f17057b.hasUpdateBlock) {
                    SnapshotStateObserver snapshotStateObserver = this.f17057b.snapshotObserver;
                    AndroidViewHolder androidViewHolder = this.f17057b;
                    snapshotStateObserver.l(androidViewHolder, androidViewHolder.f17025m, this.f17057b.getUpdate());
                }
            }
        };
        this.location = new int[2];
        this.lastWidthMeasureSpec = Integer.MIN_VALUE;
        this.lastHeightMeasureSpec = Integer.MIN_VALUE;
        this.nestedScrollingParentHelper = new y0(this);
        Object[] objArr = 0 == true ? 1 : 0;
        final LayoutNode layoutNode = new LayoutNode(false, objArr, 3, null);
        final n nVarA = OnGloballyPositionedModifierKt.a(DrawModifierKt.a(PointerInteropFilter_androidKt.c(companion, this), new l<androidx.compose.ui.graphics.drawscope.g, b2>() { // from class: androidx.compose.ui.viewinterop.AndroidViewHolder$layoutNode$1$coreModifier$1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(1);
            }

            public final void a(@dl.d androidx.compose.ui.graphics.drawscope.g drawBehind) {
                f0.p(drawBehind, "$this$drawBehind");
                LayoutNode layoutNode2 = layoutNode;
                AndroidViewHolder androidViewHolder = this;
                d0 d0VarA = drawBehind.getDrawContext().a();
                b1 owner = layoutNode2.getOwner();
                AndroidComposeView androidComposeView = owner instanceof AndroidComposeView ? (AndroidComposeView) owner : null;
                if (androidComposeView != null) {
                    androidComposeView.V(androidViewHolder, androidx.compose.ui.graphics.c.d(d0VarA));
                }
            }

            @Override // yh.l
            public /* bridge */ /* synthetic */ b2 invoke(androidx.compose.ui.graphics.drawscope.g gVar) {
                a(gVar);
                return b2.f124493a;
            }
        }), new l<q, b2>() { // from class: androidx.compose.ui.viewinterop.AndroidViewHolder$layoutNode$1$coreModifier$2
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(1);
            }

            public final void a(@dl.d q it) {
                f0.p(it, "it");
                c.e(this.f17047b, layoutNode);
            }

            @Override // yh.l
            public /* bridge */ /* synthetic */ b2 invoke(q qVar) {
                a(qVar);
                return b2.f124493a;
            }
        });
        layoutNode.f(this.modifier.s0(nVarA));
        this.f17019g = new l<n, b2>() { // from class: androidx.compose.ui.viewinterop.AndroidViewHolder$layoutNode$1$1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(1);
            }

            public final void a(@dl.d n it) {
                f0.p(it, "it");
                layoutNode.f(it.s0(nVarA));
            }

            @Override // yh.l
            public /* bridge */ /* synthetic */ b2 invoke(n nVar) {
                a(nVar);
                return b2.f124493a;
            }
        };
        layoutNode.g(this.f17020h);
        this.f17021i = new l<s1.e, b2>() { // from class: androidx.compose.ui.viewinterop.AndroidViewHolder$layoutNode$1$2
            {
                super(1);
            }

            public final void a(@dl.d s1.e it) {
                f0.p(it, "it");
                layoutNode.g(it);
            }

            @Override // yh.l
            public /* bridge */ /* synthetic */ b2 invoke(s1.e eVar) {
                a(eVar);
                return b2.f124493a;
            }
        };
        final Ref.ObjectRef objectRef = new Ref.ObjectRef();
        layoutNode.C1(new l<b1, b2>() { // from class: androidx.compose.ui.viewinterop.AndroidViewHolder$layoutNode$1$3
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(1);
            }

            public final void a(@dl.d b1 owner) {
                f0.p(owner, "owner");
                AndroidComposeView androidComposeView = owner instanceof AndroidComposeView ? (AndroidComposeView) owner : null;
                if (androidComposeView != null) {
                    androidComposeView.Q(this.f17036b, layoutNode);
                }
                View view = objectRef.f124891b;
                if (view != null) {
                    this.f17036b.setView$ui_release(view);
                }
            }

            @Override // yh.l
            public /* bridge */ /* synthetic */ b2 invoke(b1 b1Var) {
                a(b1Var);
                return b2.f124493a;
            }
        });
        layoutNode.D1(new l<b1, b2>() { // from class: androidx.compose.ui.viewinterop.AndroidViewHolder$layoutNode$1$4
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(1);
            }

            /* JADX WARN: Type inference failed for: r0v3, types: [T, android.view.View] */
            public final void a(@dl.d b1 owner) {
                f0.p(owner, "owner");
                AndroidComposeView androidComposeView = owner instanceof AndroidComposeView ? (AndroidComposeView) owner : null;
                if (androidComposeView != null) {
                    androidComposeView.o0(this.f17039b);
                }
                objectRef.f124891b = this.f17039b.getView();
                this.f17039b.setView$ui_release(null);
            }

            @Override // yh.l
            public /* bridge */ /* synthetic */ b2 invoke(b1 b1Var) {
                a(b1Var);
                return b2.f124493a;
            }
        });
        layoutNode.c(new i0() { // from class: androidx.compose.ui.viewinterop.AndroidViewHolder$layoutNode$1$5
            private final int f(int width) {
                AndroidViewHolder androidViewHolder = this.f17041a;
                ViewGroup.LayoutParams layoutParams = androidViewHolder.getLayoutParams();
                f0.m(layoutParams);
                androidViewHolder.measure(androidViewHolder.g(0, width, layoutParams.width), View.MeasureSpec.makeMeasureSpec(0, 0));
                return this.f17041a.getMeasuredHeight();
            }

            private final int g(int height) {
                AndroidViewHolder androidViewHolder = this.f17041a;
                int iMakeMeasureSpec = View.MeasureSpec.makeMeasureSpec(0, 0);
                AndroidViewHolder androidViewHolder2 = this.f17041a;
                ViewGroup.LayoutParams layoutParams = androidViewHolder2.getLayoutParams();
                f0.m(layoutParams);
                androidViewHolder.measure(iMakeMeasureSpec, androidViewHolder2.g(0, height, layoutParams.height));
                return this.f17041a.getMeasuredWidth();
            }

            @Override // androidx.compose.ui.layout.i0
            @dl.d
            public j0 a(@dl.d l0 measure, @dl.d List<? extends g0> measurables, long j10) {
                f0.p(measure, "$this$measure");
                f0.p(measurables, "measurables");
                if (s1.b.r(j10) != 0) {
                    this.f17041a.getChildAt(0).setMinimumWidth(s1.b.r(j10));
                }
                if (s1.b.q(j10) != 0) {
                    this.f17041a.getChildAt(0).setMinimumHeight(s1.b.q(j10));
                }
                AndroidViewHolder androidViewHolder = this.f17041a;
                int iR = s1.b.r(j10);
                int iP = s1.b.p(j10);
                ViewGroup.LayoutParams layoutParams = this.f17041a.getLayoutParams();
                f0.m(layoutParams);
                int iG = androidViewHolder.g(iR, iP, layoutParams.width);
                AndroidViewHolder androidViewHolder2 = this.f17041a;
                int iQ = s1.b.q(j10);
                int iO = s1.b.o(j10);
                ViewGroup.LayoutParams layoutParams2 = this.f17041a.getLayoutParams();
                f0.m(layoutParams2);
                androidViewHolder.measure(iG, androidViewHolder2.g(iQ, iO, layoutParams2.height));
                int measuredWidth = this.f17041a.getMeasuredWidth();
                int measuredHeight = this.f17041a.getMeasuredHeight();
                final AndroidViewHolder androidViewHolder3 = this.f17041a;
                final LayoutNode layoutNode2 = layoutNode;
                return k0.p(measure, measuredWidth, measuredHeight, null, new l<e1.a, b2>() { // from class: androidx.compose.ui.viewinterop.AndroidViewHolder$layoutNode$1$5$measure$1
                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    {
                        super(1);
                    }

                    public final void a(@dl.d e1.a layout) {
                        f0.p(layout, "$this$layout");
                        c.e(androidViewHolder3, layoutNode2);
                    }

                    @Override // yh.l
                    public /* bridge */ /* synthetic */ b2 invoke(e1.a aVar) {
                        a(aVar);
                        return b2.f124493a;
                    }
                }, 4, null);
            }

            @Override // androidx.compose.ui.layout.i0
            public int b(@dl.d androidx.compose.ui.layout.n nVar, @dl.d List<? extends m> measurables, int i10) {
                f0.p(nVar, "<this>");
                f0.p(measurables, "measurables");
                return f(i10);
            }

            @Override // androidx.compose.ui.layout.i0
            public int c(@dl.d androidx.compose.ui.layout.n nVar, @dl.d List<? extends m> measurables, int i10) {
                f0.p(nVar, "<this>");
                f0.p(measurables, "measurables");
                return g(i10);
            }

            @Override // androidx.compose.ui.layout.i0
            public int d(@dl.d androidx.compose.ui.layout.n nVar, @dl.d List<? extends m> measurables, int i10) {
                f0.p(nVar, "<this>");
                f0.p(measurables, "measurables");
                return f(i10);
            }

            @Override // androidx.compose.ui.layout.i0
            public int e(@dl.d androidx.compose.ui.layout.n nVar, @dl.d List<? extends m> measurables, int i10) {
                f0.p(nVar, "<this>");
                f0.p(measurables, "measurables");
                return g(i10);
            }
        });
        this.layoutNode = layoutNode;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final int g(int min, int max, int preferred) {
        if (preferred >= 0 || min == max) {
            return View.MeasureSpec.makeMeasureSpec(u.I(preferred, min, max), 1073741824);
        }
        if (preferred != -2 || max == Integer.MAX_VALUE) {
            return (preferred != -1 || max == Integer.MAX_VALUE) ? View.MeasureSpec.makeMeasureSpec(0, 0) : View.MeasureSpec.makeMeasureSpec(max, 1073741824);
        }
        return View.MeasureSpec.makeMeasureSpec(max, Integer.MIN_VALUE);
    }

    @Override // androidx.core.view.v0
    public void G(@dl.d View target, int i10, int i11, int i12, int i13, int i14) {
        f0.p(target, "target");
        if (isNestedScrollingEnabled()) {
            this.dispatcher.b(b1.g.a(c.f(i10), c.f(i11)), b1.g.a(c.f(i12), c.f(i13)), c.h(i14));
        }
    }

    @Override // androidx.core.view.v0
    public void O(@dl.d View target, int i10, int i11, @dl.d int[] consumed, int i12) {
        f0.p(target, "target");
        f0.p(consumed, "consumed");
        if (isNestedScrollingEnabled()) {
            long jD = this.dispatcher.d(b1.g.a(c.f(i10), c.f(i11)), c.h(i12));
            consumed[0] = f1.f(f.p(jD));
            consumed[1] = f1.f(f.r(jD));
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public boolean gatherTransparentRegion(@e Region region) {
        if (region == null) {
            return true;
        }
        getLocationInWindow(this.location);
        int[] iArr = this.location;
        int i10 = iArr[0];
        region.op(i10, iArr[1], i10 + getWidth(), this.location[1] + getHeight(), Region.Op.DIFFERENCE);
        return true;
    }

    @dl.d
    /* JADX INFO: renamed from: getDensity, reason: from getter */
    public final s1.e getF17020h() {
        return this.f17020h;
    }

    @dl.d
    public final LayoutNode getLayoutNode() {
        return this.layoutNode;
    }

    @Override // android.view.View
    @e
    public ViewGroup.LayoutParams getLayoutParams() {
        ViewGroup.LayoutParams layoutParams;
        View view = this.view;
        return (view == null || (layoutParams = view.getLayoutParams()) == null) ? new ViewGroup.LayoutParams(-1, -1) : layoutParams;
    }

    @e
    public final y getLifecycleOwner() {
        return this.lifecycleOwner;
    }

    @dl.d
    public final n getModifier() {
        return this.modifier;
    }

    @Override // android.view.ViewGroup, androidx.core.view.x0
    public int getNestedScrollAxes() {
        return this.nestedScrollingParentHelper.a();
    }

    @e
    public final l<s1.e, b2> getOnDensityChanged$ui_release() {
        return this.f17021i;
    }

    @e
    public final l<n, b2> getOnModifierChanged$ui_release() {
        return this.f17019g;
    }

    @e
    public final l<Boolean, b2> getOnRequestDisallowInterceptTouchEvent$ui_release() {
        return this.f17027o;
    }

    @e
    public final androidx.savedstate.d getSavedStateRegistryOwner() {
        return this.savedStateRegistryOwner;
    }

    @dl.d
    public final yh.a<b2> getUpdate() {
        return this.f17016d;
    }

    @e
    public final View getView() {
        return this.view;
    }

    public final void h() {
        int i10;
        int i11 = this.lastWidthMeasureSpec;
        if (i11 == Integer.MIN_VALUE || (i10 = this.lastHeightMeasureSpec) == Integer.MIN_VALUE) {
            return;
        }
        measure(i11, i10);
    }

    @Override // androidx.core.view.w0
    public void h0(@dl.d View target, int i10, int i11, int i12, int i13, int i14, @dl.d int[] consumed) {
        f0.p(target, "target");
        f0.p(consumed, "consumed");
        if (isNestedScrollingEnabled()) {
            long jB = this.dispatcher.b(b1.g.a(c.f(i10), c.f(i11)), b1.g.a(c.f(i12), c.f(i13)), c.h(i14));
            consumed[0] = f1.f(f.p(jB));
            consumed[1] = f1.f(f.r(jB));
        }
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    @e
    public ViewParent invalidateChildInParent(@e int[] location, @e Rect dirty) {
        super.invalidateChildInParent(location, dirty);
        this.layoutNode.I0();
        return null;
    }

    @Override // android.view.View
    public boolean isNestedScrollingEnabled() {
        View view = this.view;
        return view != null ? view.isNestedScrollingEnabled() : super.isNestedScrollingEnabled();
    }

    @Override // androidx.core.view.v0
    public void j(@dl.d View child, @dl.d View target, int i10, int i11) {
        f0.p(child, "child");
        f0.p(target, "target");
        this.nestedScrollingParentHelper.c(child, target, i10, i11);
    }

    @Override // androidx.core.view.v0
    public boolean j0(@dl.d View child, @dl.d View target, int axes, int type) {
        f0.p(child, "child");
        f0.p(target, "target");
        return ((axes & 2) == 0 && (axes & 1) == 0) ? false : true;
    }

    @Override // androidx.core.view.v0
    public void k(@dl.d View target, int i10) {
        f0.p(target, "target");
        this.nestedScrollingParentHelper.e(target, i10);
    }

    @Override // android.view.ViewGroup, android.view.View
    protected void onAttachedToWindow() {
        super.onAttachedToWindow();
        this.snapshotObserver.m();
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public void onDescendantInvalidated(@dl.d View child, @dl.d View target) {
        f0.p(child, "child");
        f0.p(target, "target");
        super.onDescendantInvalidated(child, target);
        this.layoutNode.I0();
    }

    @Override // android.view.ViewGroup, android.view.View
    protected void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        this.snapshotObserver.n();
        this.snapshotObserver.f();
    }

    @Override // android.view.ViewGroup, android.view.View
    protected void onLayout(boolean z10, int i10, int i11, int i12, int i13) {
        View view = this.view;
        if (view != null) {
            view.layout(0, 0, i12 - i10, i13 - i11);
        }
    }

    @Override // android.view.View
    protected void onMeasure(int i10, int i11) {
        View view = this.view;
        if (view != null) {
            view.measure(i10, i11);
        }
        View view2 = this.view;
        int measuredWidth = view2 != null ? view2.getMeasuredWidth() : 0;
        View view3 = this.view;
        setMeasuredDimension(measuredWidth, view3 != null ? view3.getMeasuredHeight() : 0);
        this.lastWidthMeasureSpec = i10;
        this.lastHeightMeasureSpec = i11;
    }

    @Override // android.view.ViewGroup, android.view.ViewParent, androidx.core.view.x0
    public boolean onNestedFling(@dl.d View target, float velocityX, float velocityY, boolean consumed) {
        f0.p(target, "target");
        if (!isNestedScrollingEnabled()) {
            return false;
        }
        k.f(this.dispatcher.f(), null, null, new AnonymousClass1(consumed, this, s1.y.a(c.g(velocityX), c.g(velocityY)), null), 3, null);
        return false;
    }

    @Override // android.view.ViewGroup, android.view.ViewParent, androidx.core.view.x0
    public boolean onNestedPreFling(@dl.d View target, float velocityX, float velocityY) {
        f0.p(target, "target");
        if (!isNestedScrollingEnabled()) {
            return false;
        }
        k.f(this.dispatcher.f(), null, null, new C12891(s1.y.a(c.g(velocityX), c.g(velocityY)), null), 3, null);
        return false;
    }

    @Override // android.view.View
    protected void onWindowVisibilityChanged(int i10) {
        super.onWindowVisibilityChanged(i10);
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public void requestDisallowInterceptTouchEvent(boolean z10) {
        l<? super Boolean, b2> lVar = this.f17027o;
        if (lVar != null) {
            lVar.invoke(Boolean.valueOf(z10));
        }
        super.requestDisallowInterceptTouchEvent(z10);
    }

    public final void setDensity(@dl.d s1.e value) {
        f0.p(value, "value");
        if (value != this.f17020h) {
            this.f17020h = value;
            l<? super s1.e, b2> lVar = this.f17021i;
            if (lVar != null) {
                lVar.invoke(value);
            }
        }
    }

    public final void setLifecycleOwner(@e y yVar) {
        if (yVar != this.lifecycleOwner) {
            this.lifecycleOwner = yVar;
            ViewTreeLifecycleOwner.b(this, yVar);
        }
    }

    public final void setModifier(@dl.d n value) {
        f0.p(value, "value");
        if (value != this.modifier) {
            this.modifier = value;
            l<? super n, b2> lVar = this.f17019g;
            if (lVar != null) {
                lVar.invoke(value);
            }
        }
    }

    public final void setOnDensityChanged$ui_release(@e l<? super s1.e, b2> lVar) {
        this.f17021i = lVar;
    }

    public final void setOnModifierChanged$ui_release(@e l<? super n, b2> lVar) {
        this.f17019g = lVar;
    }

    public final void setOnRequestDisallowInterceptTouchEvent$ui_release(@e l<? super Boolean, b2> lVar) {
        this.f17027o = lVar;
    }

    public final void setSavedStateRegistryOwner(@e androidx.savedstate.d dVar) {
        if (dVar != this.savedStateRegistryOwner) {
            this.savedStateRegistryOwner = dVar;
            ViewTreeSavedStateRegistryOwner.b(this, dVar);
        }
    }

    protected final void setUpdate(@dl.d yh.a<b2> value) {
        f0.p(value, "value");
        this.f17016d = value;
        this.hasUpdateBlock = true;
        this.f17026n.invoke();
    }

    public final void setView$ui_release(@e View view) {
        if (view != this.view) {
            this.view = view;
            removeAllViewsInLayout();
            if (view != null) {
                addView(view);
                this.f17026n.invoke();
            }
        }
    }

    @Override // android.view.ViewGroup
    public boolean shouldDelayChildPressedState() {
        return true;
    }
}
