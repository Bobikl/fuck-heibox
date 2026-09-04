package androidx.compose.ui.graphics;

import android.graphics.Shader;
import com.umeng.analytics.pro.ak;
import java.util.List;
import kotlin.Metadata;

/* JADX INFO: compiled from: Shader.kt */
/* JADX INFO: loaded from: classes.dex */
@Metadata(bv = {}, d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0007\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0006\u001aQ\u0010\f\u001a\u00060\nj\u0002`\u000b2\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u00002\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00040\u00032\u0010\b\u0002\u0010\u0007\u001a\n\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u00032\b\b\u0002\u0010\t\u001a\u00020\bø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b\f\u0010\r\u001aQ\u0010\u0010\u001a\u00060\nj\u0002`\u000b2\u0006\u0010\u000e\u001a\u00020\u00002\u0006\u0010\u000f\u001a\u00020\u00062\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00040\u00032\u0010\b\u0002\u0010\u0007\u001a\n\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u00032\b\b\u0002\u0010\t\u001a\u00020\bø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b\u0010\u0010\u0011\u001a?\u0010\u0012\u001a\u00060\nj\u0002`\u000b2\u0006\u0010\u000e\u001a\u00020\u00002\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00040\u00032\u0010\b\u0002\u0010\u0007\u001a\n\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u0003ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b\u0012\u0010\u0013\u001a3\u0010\u0018\u001a\u00060\nj\u0002`\u000b2\u0006\u0010\u0015\u001a\u00020\u00142\b\b\u0002\u0010\u0016\u001a\u00020\b2\b\b\u0002\u0010\u0017\u001a\u00020\bø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b\u0018\u0010\u0019\u0082\u0002\u000b\n\u0005\b¡\u001e0\u0001\n\u0002\b\u0019¨\u0006\u001a"}, d2 = {"Lb1/f;", "from", "to", "", "Landroidx/compose/ui/graphics/l0;", "colors", "", "colorStops", "Landroidx/compose/ui/graphics/m2;", "tileMode", "Landroid/graphics/Shader;", "Landroidx/compose/ui/graphics/Shader;", ak.aF, "(JJLjava/util/List;Ljava/util/List;I)Landroid/graphics/Shader;", com.google.android.exoplayer2.text.ttml.d.f49794m0, "radius", "e", "(JFLjava/util/List;Ljava/util/List;I)Landroid/graphics/Shader;", "g", "(JLjava/util/List;Ljava/util/List;)Landroid/graphics/Shader;", "Landroidx/compose/ui/graphics/y0;", "image", "tileModeX", "tileModeY", ak.av, "(Landroidx/compose/ui/graphics/y0;II)Landroid/graphics/Shader;", "ui-graphics_release"}, k = 2, mv = {1, 7, 1})
public final class d2 {
    @dl.d
    public static final Shader a(@dl.d y0 image, int i10, int i11) {
        kotlin.jvm.internal.f0.p(image, "image");
        return r.a(image, i10, i11);
    }

    public static /* synthetic */ Shader b(y0 y0Var, int i10, int i11, int i12, Object obj) {
        if ((i12 & 2) != 0) {
            i10 = m2.INSTANCE.a();
        }
        if ((i12 & 4) != 0) {
            i11 = m2.INSTANCE.a();
        }
        return a(y0Var, i10, i11);
    }

    @dl.d
    public static final Shader c(long j10, long j11, @dl.d List<l0> colors, @dl.e List<Float> list, int i10) {
        kotlin.jvm.internal.f0.p(colors, "colors");
        return r.b(j10, j11, colors, list, i10);
    }

    public static /* synthetic */ Shader d(long j10, long j11, List list, List list2, int i10, int i11, Object obj) {
        if ((i11 & 8) != 0) {
            list2 = null;
        }
        List list3 = list2;
        if ((i11 & 16) != 0) {
            i10 = m2.INSTANCE.a();
        }
        return c(j10, j11, list, list3, i10);
    }

    @dl.d
    public static final Shader e(long j10, float f10, @dl.d List<l0> colors, @dl.e List<Float> list, int i10) {
        kotlin.jvm.internal.f0.p(colors, "colors");
        return r.c(j10, f10, colors, list, i10);
    }

    public static /* synthetic */ Shader f(long j10, float f10, List list, List list2, int i10, int i11, Object obj) {
        if ((i11 & 8) != 0) {
            list2 = null;
        }
        List list3 = list2;
        if ((i11 & 16) != 0) {
            i10 = m2.INSTANCE.a();
        }
        return e(j10, f10, list, list3, i10);
    }

    @dl.d
    public static final Shader g(long j10, @dl.d List<l0> colors, @dl.e List<Float> list) {
        kotlin.jvm.internal.f0.p(colors, "colors");
        return r.d(j10, colors, list);
    }

    public static /* synthetic */ Shader h(long j10, List list, List list2, int i10, Object obj) {
        if ((i10 & 4) != 0) {
            list2 = null;
        }
        return g(j10, list, list2);
    }
}
