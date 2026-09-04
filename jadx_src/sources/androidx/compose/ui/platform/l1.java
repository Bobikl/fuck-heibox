package androidx.compose.ui.platform;

import android.graphics.RenderNode;
import com.umeng.analytics.pro.ak;
import kotlin.Metadata;

/* JADX INFO: compiled from: RenderNodeApi29.android.kt */
/* JADX INFO: loaded from: classes.dex */
@androidx.annotation.w0(31)
@Metadata(bv = {}, d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\bÃ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\b\u0010\tJ\u001a\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u00022\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004H\u0007¨\u0006\n"}, d2 = {"Landroidx/compose/ui/platform/l1;", "", "Landroid/graphics/RenderNode;", "renderNode", "Landroidx/compose/ui/graphics/y1;", "target", "Lkotlin/b2;", ak.av, "<init>", "()V", "ui_release"}, k = 1, mv = {1, 7, 1})
public final class l1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @dl.d
    public static final l1 f15926a = new l1();

    private l1() {
    }

    @androidx.annotation.u
    public final void a(@dl.d RenderNode renderNode, @dl.e androidx.compose.ui.graphics.y1 y1Var) {
        kotlin.jvm.internal.f0.p(renderNode, "renderNode");
        renderNode.setRenderEffect(y1Var != null ? y1Var.a() : null);
    }
}
