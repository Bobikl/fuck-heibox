package androidx.compose.ui.graphics;

import android.graphics.Canvas;
import com.umeng.analytics.pro.ak;
import kotlin.Metadata;

/* JADX INFO: compiled from: AndroidCanvas.android.kt */
/* JADX INFO: loaded from: classes.dex */
@Metadata(bv = {}, d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\b\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0011\u0010\u000fJ-\u0010\t\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u00022\u0017\u0010\b\u001a\u0013\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00060\u0004¢\u0006\u0002\b\u0007H\u0086\bø\u0001\u0000R \u0010\u0010\u001a\u00020\n8\u0000X\u0081\u0004¢\u0006\u0012\n\u0004\b\t\u0010\u000b\u0012\u0004\b\u000e\u0010\u000f\u001a\u0004\b\f\u0010\r\u0082\u0002\u0007\n\u0005\b\u009920\u0001¨\u0006\u0012"}, d2 = {"Landroidx/compose/ui/graphics/e0;", "", "Landroid/graphics/Canvas;", "targetCanvas", "Lkotlin/Function1;", "Landroidx/compose/ui/graphics/d0;", "Lkotlin/b2;", "Lkotlin/t;", "block", ak.av, "Landroidx/compose/ui/graphics/b;", "Landroidx/compose/ui/graphics/b;", "b", "()Landroidx/compose/ui/graphics/b;", "getAndroidCanvas$annotations", "()V", "androidCanvas", "<init>", "ui-graphics_release"}, k = 1, mv = {1, 7, 1})
public final class e0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    @dl.d
    private final b androidCanvas = new b();

    @kotlin.r0
    public static /* synthetic */ void c() {
    }

    public final void a(@dl.d Canvas targetCanvas, @dl.d yh.l<? super d0, kotlin.b2> block) {
        kotlin.jvm.internal.f0.p(targetCanvas, "targetCanvas");
        kotlin.jvm.internal.f0.p(block, "block");
        Canvas internalCanvas = getAndroidCanvas().getInternalCanvas();
        getAndroidCanvas().K(targetCanvas);
        block.invoke(getAndroidCanvas());
        getAndroidCanvas().K(internalCanvas);
    }

    @dl.d
    /* JADX INFO: renamed from: b, reason: from getter */
    public final b getAndroidCanvas() {
        return this.androidCanvas;
    }
}
