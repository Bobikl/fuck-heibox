package androidx.compose.ui.node;

import androidx.compose.ui.graphics.g2;
import androidx.compose.ui.graphics.y1;
import androidx.compose.ui.unit.LayoutDirection;
import b1.MutableRect;
import com.max.hbuikit.bean.param.UiKitSpanObj;
import com.ss.bytertc.base.media.screen.RXScreenCaptureService;
import com.umeng.analytics.pro.ak;
import com.umeng.socialize.net.dplus.CommonNetImpl;
import kotlin.Metadata;
import kotlin.b2;

/* JADX INFO: compiled from: OwnedLayer.kt */
/* JADX INFO: loaded from: classes.dex */
@Metadata(bv = {}, d1 = {"\u0000\u0082\u0001\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u0007\n\u0002\b\n\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\b`\u0018\u00002\u00020\u0001J§\u0001\u0010\u001d\u001a\u00020\u001c2\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0004\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0006\u001a\u00020\u00022\u0006\u0010\u0007\u001a\u00020\u00022\u0006\u0010\b\u001a\u00020\u00022\u0006\u0010\t\u001a\u00020\u00022\u0006\u0010\n\u001a\u00020\u00022\u0006\u0010\u000b\u001a\u00020\u00022\u0006\u0010\f\u001a\u00020\u00022\u0006\u0010\u000e\u001a\u00020\r2\u0006\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\u0012\u001a\u00020\u00112\b\u0010\u0014\u001a\u0004\u0018\u00010\u00132\u0006\u0010\u0016\u001a\u00020\u00152\u0006\u0010\u0017\u001a\u00020\u00152\u0006\u0010\u0019\u001a\u00020\u00182\u0006\u0010\u001b\u001a\u00020\u001aH&ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b\u001d\u0010\u001eJ\u001d\u0010!\u001a\u00020\u00112\u0006\u0010 \u001a\u00020\u001fH&ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b!\u0010\"J\u001d\u0010$\u001a\u00020\u001c2\u0006\u0010 \u001a\u00020#H&ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b$\u0010%J\u001d\u0010(\u001a\u00020\u001c2\u0006\u0010'\u001a\u00020&H&ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b(\u0010%J\u0010\u0010+\u001a\u00020\u001c2\u0006\u0010*\u001a\u00020)H&J\b\u0010,\u001a\u00020\u001cH&J\b\u0010-\u001a\u00020\u001cH&J\b\u0010.\u001a\u00020\u001cH&J%\u00101\u001a\u00020\u001f2\u0006\u0010/\u001a\u00020\u001f2\u0006\u00100\u001a\u00020\u0011H&ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b1\u00102J\u0018\u00105\u001a\u00020\u001c2\u0006\u00104\u001a\u0002032\u0006\u00100\u001a\u00020\u0011H&J*\u0010:\u001a\u00020\u001c2\u0012\u00107\u001a\u000e\u0012\u0004\u0012\u00020)\u0012\u0004\u0012\u00020\u001c062\f\u00109\u001a\b\u0012\u0004\u0012\u00020\u001c08H&J\u001d\u0010=\u001a\u00020\u001c2\u0006\u0010<\u001a\u00020;H&ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b=\u0010>J\u001d\u0010?\u001a\u00020\u001c2\u0006\u0010<\u001a\u00020;H&ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b?\u0010>ø\u0001\u0002\u0082\u0002\u0011\n\u0005\b¡\u001e0\u0001\n\u0002\b\u0019\n\u0004\b!0\u0001¨\u0006@À\u0006\u0001"}, d2 = {"Landroidx/compose/ui/node/z0;", "", "", "scaleX", "scaleY", "alpha", "translationX", "translationY", "shadowElevation", "rotationX", "rotationY", "rotationZ", "cameraDistance", "Landroidx/compose/ui/graphics/o2;", "transformOrigin", "Landroidx/compose/ui/graphics/g2;", "shape", "", "clip", "Landroidx/compose/ui/graphics/y1;", "renderEffect", "Landroidx/compose/ui/graphics/l0;", "ambientShadowColor", "spotShadowColor", "Landroidx/compose/ui/unit/LayoutDirection;", "layoutDirection", "Ls1/e;", "density", "Lkotlin/b2;", ak.av, "(FFFFFFFFFFJLandroidx/compose/ui/graphics/g2;ZLandroidx/compose/ui/graphics/y1;JJLandroidx/compose/ui/unit/LayoutDirection;Ls1/e;)V", "Lb1/f;", CommonNetImpl.POSITION, RXScreenCaptureService.KEY_HEIGHT, "(J)Z", "Ls1/n;", "j", "(J)V", "Ls1/r;", UiKitSpanObj.TYPE_SIZE, "g", "Landroidx/compose/ui/graphics/d0;", "canvas", "b", "k", "invalidate", "destroy", "point", "inverse", "f", "(JZ)J", "Lb1/d;", "rect", ak.aF, "Lkotlin/Function1;", "drawBlock", "Lkotlin/Function0;", "invalidateParentLayer", "e", "Landroidx/compose/ui/graphics/c1;", "matrix", "d", "([F)V", "i", "ui_release"}, k = 1, mv = {1, 7, 1})
public interface z0 {
    void a(float scaleX, float scaleY, float alpha, float translationX, float translationY, float shadowElevation, float rotationX, float rotationY, float rotationZ, float cameraDistance, long transformOrigin, @dl.d g2 shape, boolean clip, @dl.e y1 renderEffect, long ambientShadowColor, long spotShadowColor, @dl.d LayoutDirection layoutDirection, @dl.d s1.e density);

    void b(@dl.d androidx.compose.ui.graphics.d0 d0Var);

    void c(@dl.d MutableRect mutableRect, boolean z10);

    void d(@dl.d float[] matrix);

    void destroy();

    void e(@dl.d yh.l<? super androidx.compose.ui.graphics.d0, b2> lVar, @dl.d yh.a<b2> aVar);

    long f(long point, boolean inverse);

    void g(long size);

    boolean h(long position);

    void i(@dl.d float[] matrix);

    void invalidate();

    void j(long position);

    void k();
}
