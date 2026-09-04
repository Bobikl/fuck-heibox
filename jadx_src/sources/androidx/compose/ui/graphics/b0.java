package androidx.compose.ui.graphics;

import android.graphics.Shader;
import com.max.hbuikit.bean.param.UiKitSpanObj;
import com.umeng.analytics.pro.ak;
import kotlin.Metadata;

/* JADX INFO: compiled from: Brush.kt */
/* JADX INFO: loaded from: classes.dex */
@Metadata(bv = {}, d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u001a\u0012\u0010\u0004\u001a\u00020\u00032\n\u0010\u0002\u001a\u00060\u0000j\u0002`\u0001¨\u0006\u0005"}, d2 = {"Landroid/graphics/Shader;", "Landroidx/compose/ui/graphics/Shader;", "shader", "Landroidx/compose/ui/graphics/c2;", ak.av, "ui-graphics_release"}, k = 2, mv = {1, 7, 1})
public final class b0 {

    /* JADX INFO: compiled from: Brush.kt */
    @Metadata(bv = {}, d1 = {"\u0000\u001b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J!\u0010\u0006\u001a\u00060\u0004j\u0002`\u00052\u0006\u0010\u0003\u001a\u00020\u0002H\u0016ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b\u0006\u0010\u0007\u0082\u0002\u000b\n\u0005\b¡\u001e0\u0001\n\u0002\b\u0019¨\u0006\b"}, d2 = {"androidx/compose/ui/graphics/b0$a", "Landroidx/compose/ui/graphics/c2;", "Lb1/m;", UiKitSpanObj.TYPE_SIZE, "Landroid/graphics/Shader;", "Landroidx/compose/ui/graphics/Shader;", ak.aF, "(J)Landroid/graphics/Shader;", "ui-graphics_release"}, k = 1, mv = {1, 7, 1})
    public static final class a extends c2 {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        final /* synthetic */ Shader f13658e;

        a(Shader shader) {
            this.f13658e = shader;
        }

        @Override // androidx.compose.ui.graphics.c2
        @dl.d
        public Shader c(long size) {
            return this.f13658e;
        }
    }

    @dl.d
    public static final c2 a(@dl.d Shader shader) {
        kotlin.jvm.internal.f0.p(shader, "shader");
        return new a(shader);
    }
}
