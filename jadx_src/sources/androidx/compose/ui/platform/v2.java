package androidx.compose.ui.platform;

import android.content.Context;
import android.os.Build;
import android.util.Log;
import android.view.View;
import android.view.ViewGroup;
import androidx.compose.ui.R;
import androidx.compose.ui.node.LayoutNode;
import com.umeng.analytics.pro.ak;
import java.lang.reflect.Field;
import java.util.Collections;
import java.util.WeakHashMap;
import kotlin.Metadata;

/* JADX INFO: compiled from: Wrapper.android.kt */
/* JADX INFO: loaded from: classes.dex */
@Metadata(bv = {}, d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u001a\u0018\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u0002H\u0001\u001a.\u0010\u000b\u001a\u00020\u0004*\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u00022\u0011\u0010\n\u001a\r\u0012\u0004\u0012\u00020\b0\u0007¢\u0006\u0002\b\tH\u0000¢\u0006\u0004\b\u000b\u0010\f\u001a2\u0010\u000f\u001a\u00020\u00042\u0006\u0010\u000e\u001a\u00020\r2\u0006\u0010\u0003\u001a\u00020\u00022\u0011\u0010\n\u001a\r\u0012\u0004\u0012\u00020\b0\u0007¢\u0006\u0002\b\tH\u0002¢\u0006\u0004\b\u000f\u0010\u0010\u001a\b\u0010\u0011\u001a\u00020\bH\u0002\u001a\u0010\u0010\u0013\u001a\u00020\u00122\u0006\u0010\u000e\u001a\u00020\rH\u0002\"\u0014\u0010\u0016\u001a\u00020\u00148\u0002X\u0082D¢\u0006\u0006\n\u0004\b\u0005\u0010\u0015\"\u0014\u0010\u0019\u001a\u00020\u00178\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000f\u0010\u0018¨\u0006\u001a"}, d2 = {"Landroidx/compose/ui/node/LayoutNode;", com.google.android.exoplayer2.text.ttml.d.W, "Landroidx/compose/runtime/r;", "parent", "Landroidx/compose/runtime/q;", ak.av, "Landroidx/compose/ui/platform/AbstractComposeView;", "Lkotlin/Function0;", "Lkotlin/b2;", "Landroidx/compose/runtime/h;", "content", "e", "(Landroidx/compose/ui/platform/AbstractComposeView;Landroidx/compose/runtime/r;Lyh/p;)Landroidx/compose/runtime/q;", "Landroidx/compose/ui/platform/AndroidComposeView;", "owner", "b", "(Landroidx/compose/ui/platform/AndroidComposeView;Landroidx/compose/runtime/r;Lyh/p;)Landroidx/compose/runtime/q;", ak.aF, "", "d", "", "Ljava/lang/String;", "TAG", "Landroid/view/ViewGroup$LayoutParams;", "Landroid/view/ViewGroup$LayoutParams;", "DefaultLayoutParams", "ui_release"}, k = 2, mv = {1, 7, 1})
public final class v2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @dl.d
    private static final String f15990a = "Wrapper";

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @dl.d
    private static final ViewGroup.LayoutParams f15991b = new ViewGroup.LayoutParams(-2, -2);

    @dl.d
    @androidx.annotation.k0
    public static final androidx.compose.runtime.q a(@dl.d LayoutNode container, @dl.d androidx.compose.runtime.r parent) {
        kotlin.jvm.internal.f0.p(container, "container");
        kotlin.jvm.internal.f0.p(parent, "parent");
        return androidx.compose.runtime.u.a(new androidx.compose.ui.node.m1(container), parent);
    }

    @androidx.compose.runtime.i(scheme = "[0[0]]")
    private static final androidx.compose.runtime.q b(AndroidComposeView androidComposeView, androidx.compose.runtime.r rVar, yh.p<? super androidx.compose.runtime.p, ? super Integer, kotlin.b2> pVar) {
        if (d(androidComposeView)) {
            androidComposeView.setTag(R.id.inspection_slot_table_set, Collections.newSetFromMap(new WeakHashMap()));
            c();
        }
        androidx.compose.runtime.q qVarA = androidx.compose.runtime.u.a(new androidx.compose.ui.node.m1(androidComposeView.getRoot()), rVar);
        View view = androidComposeView.getView();
        int i10 = R.id.wrapped_composition_tag;
        Object tag = view.getTag(i10);
        WrappedComposition wrappedComposition = tag instanceof WrappedComposition ? (WrappedComposition) tag : null;
        if (wrappedComposition == null) {
            wrappedComposition = new WrappedComposition(androidComposeView, qVarA);
            androidComposeView.getView().setTag(i10, wrappedComposition);
        }
        wrappedComposition.c(pVar);
        return wrappedComposition;
    }

    private static final void c() {
        if (InspectableValueKt.e()) {
            return;
        }
        try {
            Field declaredField = Class.forName("androidx.compose.ui.platform.InspectableValueKt").getDeclaredField("isDebugInspectorInfoEnabled");
            declaredField.setAccessible(true);
            declaredField.setBoolean(null, true);
        } catch (Exception unused) {
            Log.w(f15990a, "Could not access isDebugInspectorInfoEnabled. Please set explicitly.");
        }
    }

    private static final boolean d(AndroidComposeView androidComposeView) {
        return Build.VERSION.SDK_INT >= 29 && (u2.f15989a.a(androidComposeView).isEmpty() ^ true);
    }

    @dl.d
    @androidx.compose.runtime.i(scheme = "[0[0]]")
    public static final androidx.compose.runtime.q e(@dl.d AbstractComposeView abstractComposeView, @dl.d androidx.compose.runtime.r parent, @dl.d yh.p<? super androidx.compose.runtime.p, ? super Integer, kotlin.b2> content) {
        kotlin.jvm.internal.f0.p(abstractComposeView, "<this>");
        kotlin.jvm.internal.f0.p(parent, "parent");
        kotlin.jvm.internal.f0.p(content, "content");
        GlobalSnapshotManager.f15641a.a();
        AndroidComposeView androidComposeView = null;
        if (abstractComposeView.getChildCount() > 0) {
            View childAt = abstractComposeView.getChildAt(0);
            if (childAt instanceof AndroidComposeView) {
                androidComposeView = (AndroidComposeView) childAt;
            }
        } else {
            abstractComposeView.removeAllViews();
        }
        if (androidComposeView == null) {
            Context context = abstractComposeView.getContext();
            kotlin.jvm.internal.f0.o(context, "context");
            androidComposeView = new AndroidComposeView(context);
            abstractComposeView.addView(androidComposeView.getView(), f15991b);
        }
        return b(androidComposeView, parent, content);
    }
}
