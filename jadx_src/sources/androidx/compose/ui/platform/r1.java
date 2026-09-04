package androidx.compose.ui.platform;

import android.graphics.Rect;
import androidx.compose.ui.semantics.SemanticsNode;
import com.umeng.analytics.pro.ak;
import kotlin.Metadata;

/* JADX INFO: compiled from: AndroidComposeViewAccessibilityDelegateCompat.android.kt */
/* JADX INFO: loaded from: classes.dex */
@Metadata(bv = {}, d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0000\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0007\u001a\u00020\u0002\u0012\u0006\u0010\u000b\u001a\u00020\b¢\u0006\u0004\b\f\u0010\rR\u0017\u0010\u0007\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0004\u001a\u0004\b\u0005\u0010\u0006R\u0017\u0010\u000b\u001a\u00020\b8\u0006¢\u0006\f\n\u0004\b\u0005\u0010\t\u001a\u0004\b\u0003\u0010\n¨\u0006\u000e"}, d2 = {"Landroidx/compose/ui/platform/r1;", "", "Landroidx/compose/ui/semantics/SemanticsNode;", ak.av, "Landroidx/compose/ui/semantics/SemanticsNode;", "b", "()Landroidx/compose/ui/semantics/SemanticsNode;", "semanticsNode", "Landroid/graphics/Rect;", "Landroid/graphics/Rect;", "()Landroid/graphics/Rect;", "adjustedBounds", "<init>", "(Landroidx/compose/ui/semantics/SemanticsNode;Landroid/graphics/Rect;)V", "ui_release"}, k = 1, mv = {1, 7, 1})
public final class r1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    @dl.d
    private final SemanticsNode semanticsNode;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    @dl.d
    private final Rect adjustedBounds;

    public r1(@dl.d SemanticsNode semanticsNode, @dl.d Rect adjustedBounds) {
        kotlin.jvm.internal.f0.p(semanticsNode, "semanticsNode");
        kotlin.jvm.internal.f0.p(adjustedBounds, "adjustedBounds");
        this.semanticsNode = semanticsNode;
        this.adjustedBounds = adjustedBounds;
    }

    @dl.d
    /* JADX INFO: renamed from: a, reason: from getter */
    public final Rect getAdjustedBounds() {
        return this.adjustedBounds;
    }

    @dl.d
    /* JADX INFO: renamed from: b, reason: from getter */
    public final SemanticsNode getSemanticsNode() {
        return this.semanticsNode;
    }
}
