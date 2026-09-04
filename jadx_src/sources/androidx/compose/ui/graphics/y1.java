package androidx.compose.ui.graphics;

import android.graphics.RenderEffect;
import android.os.Build;
import com.umeng.analytics.pro.ak;
import kotlin.Metadata;

/* JADX INFO: compiled from: AndroidRenderEffect.android.kt */
/* JADX INFO: loaded from: classes.dex */
@androidx.compose.runtime.m0
@Metadata(bv = {}, d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b7\u0018\u00002\u00020\u0001B\t\b\u0004¢\u0006\u0004\b\t\u0010\nJ\b\u0010\u0003\u001a\u00020\u0002H\u0007J\b\u0010\u0004\u001a\u00020\u0002H%J\b\u0010\u0006\u001a\u00020\u0005H\u0016R\u0018\u0010\b\u001a\u0004\u0018\u00010\u00028\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0003\u0010\u0007\u0082\u0001\u0003\u000b\f\r¨\u0006\u000e"}, d2 = {"Landroidx/compose/ui/graphics/y1;", "", "Landroid/graphics/RenderEffect;", ak.av, "b", "", ak.aF, "Landroid/graphics/RenderEffect;", "internalRenderEffect", "<init>", "()V", "Landroidx/compose/ui/graphics/p;", "Landroidx/compose/ui/graphics/z;", "Landroidx/compose/ui/graphics/e1;", "ui-graphics_release"}, k = 1, mv = {1, 7, 1})
public abstract class y1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    @dl.e
    private RenderEffect internalRenderEffect;

    private y1() {
    }

    public /* synthetic */ y1(kotlin.jvm.internal.u uVar) {
        this();
    }

    @dl.d
    @androidx.annotation.w0(31)
    public final RenderEffect a() {
        RenderEffect renderEffect = this.internalRenderEffect;
        if (renderEffect != null) {
            return renderEffect;
        }
        RenderEffect renderEffectB = b();
        this.internalRenderEffect = renderEffectB;
        return renderEffectB;
    }

    @dl.d
    @androidx.annotation.w0(31)
    protected abstract RenderEffect b();

    public boolean c() {
        return Build.VERSION.SDK_INT >= 31;
    }
}
