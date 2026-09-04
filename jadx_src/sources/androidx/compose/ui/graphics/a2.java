package androidx.compose.ui.graphics;

import android.graphics.RenderEffect;
import com.umeng.analytics.pro.ak;
import kotlin.Metadata;

/* JADX INFO: compiled from: AndroidRenderEffect.android.kt */
/* JADX INFO: loaded from: classes.dex */
@androidx.annotation.w0(31)
@Metadata(bv = {}, d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0007\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\bÃ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0010\u0010\u0011J7\u0010\n\u001a\u00020\t2\b\u0010\u0003\u001a\u0004\u0018\u00010\u00022\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0006\u001a\u00020\u00042\u0006\u0010\b\u001a\u00020\u0007H\u0007ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b\n\u0010\u000bJ'\u0010\u000e\u001a\u00020\t2\b\u0010\u0003\u001a\u0004\u0018\u00010\u00022\u0006\u0010\r\u001a\u00020\fH\u0007ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b\u000e\u0010\u000f\u0082\u0002\u000b\n\u0005\b¡\u001e0\u0001\n\u0002\b\u0019¨\u0006\u0012"}, d2 = {"Landroidx/compose/ui/graphics/a2;", "", "Landroidx/compose/ui/graphics/y1;", "inputRenderEffect", "", "radiusX", "radiusY", "Landroidx/compose/ui/graphics/m2;", "edgeTreatment", "Landroid/graphics/RenderEffect;", ak.av, "(Landroidx/compose/ui/graphics/y1;FFI)Landroid/graphics/RenderEffect;", "Lb1/f;", androidx.constraintlayout.core.motion.utils.w.c.R, "b", "(Landroidx/compose/ui/graphics/y1;J)Landroid/graphics/RenderEffect;", "<init>", "()V", "ui-graphics_release"}, k = 1, mv = {1, 7, 1})
public final class a2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @dl.d
    public static final a2 f13654a = new a2();

    private a2() {
    }

    @androidx.annotation.u
    @dl.d
    public final RenderEffect a(@dl.e y1 inputRenderEffect, float radiusX, float radiusY, int edgeTreatment) {
        if (inputRenderEffect == null) {
            RenderEffect renderEffectCreateBlurEffect = RenderEffect.createBlurEffect(radiusX, radiusY, s.b(edgeTreatment));
            kotlin.jvm.internal.f0.o(renderEffectCreateBlurEffect, "{\n            android.gr…)\n            )\n        }");
            return renderEffectCreateBlurEffect;
        }
        RenderEffect renderEffectCreateBlurEffect2 = RenderEffect.createBlurEffect(radiusX, radiusY, inputRenderEffect.a(), s.b(edgeTreatment));
        kotlin.jvm.internal.f0.o(renderEffectCreateBlurEffect2, "{\n            android.gr…)\n            )\n        }");
        return renderEffectCreateBlurEffect2;
    }

    @androidx.annotation.u
    @dl.d
    public final RenderEffect b(@dl.e y1 inputRenderEffect, long offset) {
        if (inputRenderEffect == null) {
            RenderEffect renderEffectCreateOffsetEffect = RenderEffect.createOffsetEffect(b1.f.p(offset), b1.f.r(offset));
            kotlin.jvm.internal.f0.o(renderEffectCreateOffsetEffect, "{\n            android.gr…et.x, offset.y)\n        }");
            return renderEffectCreateOffsetEffect;
        }
        RenderEffect renderEffectCreateOffsetEffect2 = RenderEffect.createOffsetEffect(b1.f.p(offset), b1.f.r(offset), inputRenderEffect.a());
        kotlin.jvm.internal.f0.o(renderEffectCreateOffsetEffect2, "{\n            android.gr…)\n            )\n        }");
        return renderEffectCreateOffsetEffect2;
    }
}
