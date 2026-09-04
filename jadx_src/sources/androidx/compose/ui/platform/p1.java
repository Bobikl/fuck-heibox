package androidx.compose.ui.platform;

import android.view.RenderNode;
import com.umeng.analytics.pro.ak;
import kotlin.Metadata;

/* JADX INFO: compiled from: RenderNodeApi23.android.kt */
/* JADX INFO: loaded from: classes.dex */
@androidx.annotation.w0(28)
@Metadata(bv = {}, d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\bÃ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u000b\u0010\fJ\u0010\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0007J\u0018\u0010\b\u001a\u00020\u00072\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0006\u001a\u00020\u0004H\u0007J\u0010\u0010\t\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0007J\u0018\u0010\n\u001a\u00020\u00072\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0006\u001a\u00020\u0004H\u0007¨\u0006\r"}, d2 = {"Landroidx/compose/ui/platform/p1;", "", "Landroid/view/RenderNode;", "renderNode", "", ak.av, "target", "Lkotlin/b2;", ak.aF, "b", "d", "<init>", "()V", "ui_release"}, k = 1, mv = {1, 7, 1})
public final class p1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @dl.d
    public static final p1 f15962a = new p1();

    private p1() {
    }

    @androidx.annotation.u
    public final int a(@dl.d RenderNode renderNode) {
        kotlin.jvm.internal.f0.p(renderNode, "renderNode");
        return renderNode.getAmbientShadowColor();
    }

    @androidx.annotation.u
    public final int b(@dl.d RenderNode renderNode) {
        kotlin.jvm.internal.f0.p(renderNode, "renderNode");
        return renderNode.getSpotShadowColor();
    }

    @androidx.annotation.u
    public final void c(@dl.d RenderNode renderNode, int i10) {
        kotlin.jvm.internal.f0.p(renderNode, "renderNode");
        renderNode.setAmbientShadowColor(i10);
    }

    @androidx.annotation.u
    public final void d(@dl.d RenderNode renderNode, int i10) {
        kotlin.jvm.internal.f0.p(renderNode, "renderNode");
        renderNode.setSpotShadowColor(i10);
    }
}
