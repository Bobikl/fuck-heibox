package androidx.compose.ui.graphics;

import android.graphics.Shader;
import com.max.hbuikit.bean.param.UiKitSpanObj;
import com.umeng.analytics.pro.ak;
import kotlin.Metadata;

/* JADX INFO: compiled from: Brush.kt */
/* JADX INFO: loaded from: classes.dex */
@androidx.compose.runtime.m0
@Metadata(bv = {}, d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0007\n\u0000\n\u0002\u0018\u0002\n\u0002\b\n\b'\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0014\u0010\u0015J!\u0010\u0006\u001a\u00060\u0004j\u0002`\u00052\u0006\u0010\u0003\u001a\u00020\u0002H&ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b\u0006\u0010\u0007J+\u0010\r\u001a\u00020\f2\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\t\u001a\u00020\b2\u0006\u0010\u000b\u001a\u00020\nø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b\r\u0010\u000eR\u001e\u0010\u0010\u001a\n\u0018\u00010\u0004j\u0004\u0018\u0001`\u00058\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0006\u0010\u000fR\u001f\u0010\u0013\u001a\u00020\u00028\u0002@\u0002X\u0082\u000eø\u0001\u0001ø\u0001\u0000ø\u0001\u0002¢\u0006\u0006\n\u0004\b\u0011\u0010\u0012\u0082\u0002\u000f\n\u0005\b¡\u001e0\u0001\n\u0002\b\u0019\n\u0002\b!¨\u0006\u0016"}, d2 = {"Landroidx/compose/ui/graphics/c2;", "Landroidx/compose/ui/graphics/a0;", "Lb1/m;", UiKitSpanObj.TYPE_SIZE, "Landroid/graphics/Shader;", "Landroidx/compose/ui/graphics/Shader;", ak.aF, "(J)Landroid/graphics/Shader;", "Landroidx/compose/ui/graphics/h1;", "p", "", "alpha", "Lkotlin/b2;", ak.av, "(JLandroidx/compose/ui/graphics/h1;F)V", "Landroid/graphics/Shader;", "internalShader", "d", "J", "createdSize", "<init>", "()V", "ui-graphics_release"}, k = 1, mv = {1, 7, 1})
public abstract class c2 extends a0 {

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    @dl.e
    private Shader internalShader;

    /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata */
    private long createdSize;

    public c2() {
        super(null);
        this.createdSize = b1.m.f30386b.a();
    }

    @Override // androidx.compose.ui.graphics.a0
    public final void a(long size, @dl.d h1 p10, float alpha) {
        kotlin.jvm.internal.f0.p(p10, "p");
        Shader shaderC = this.internalShader;
        if (shaderC == null || !b1.m.k(this.createdSize, size)) {
            shaderC = c(size);
            this.internalShader = shaderC;
            this.createdSize = size;
        }
        long jA = p10.a();
        l0.Companion companion = l0.INSTANCE;
        if (!l0.y(jA, companion.a())) {
            p10.i(companion.a());
        }
        if (!kotlin.jvm.internal.f0.g(p10.m(), shaderC)) {
            p10.y(shaderC);
        }
        if (p10.d() == alpha) {
            return;
        }
        p10.f(alpha);
    }

    @dl.d
    public abstract Shader c(long size);
}
