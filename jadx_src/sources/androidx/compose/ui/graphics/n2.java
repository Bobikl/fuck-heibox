package androidx.compose.ui.graphics;

import android.graphics.Shader;
import com.umeng.analytics.pro.ak;
import kotlin.Metadata;

/* JADX INFO: compiled from: AndroidTileMode.android.kt */
/* JADX INFO: loaded from: classes.dex */
@androidx.annotation.w0(31)
@Metadata(bv = {}, d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\bÃ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0007\u0010\bJ\b\u0010\u0003\u001a\u00020\u0002H\u0007J\u0018\u0010\u0005\u001a\u00020\u0004H\u0007ø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\u0004\b\u0005\u0010\u0006\u0082\u0002\u000f\n\u0002\b!\n\u0005\b¡\u001e0\u0001\n\u0002\b\u0019¨\u0006\t"}, d2 = {"Landroidx/compose/ui/graphics/n2;", "", "Landroid/graphics/Shader$TileMode;", "b", "Landroidx/compose/ui/graphics/m2;", ak.av, "()I", "<init>", "()V", "ui-graphics_release"}, k = 1, mv = {1, 7, 1})
public final class n2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @dl.d
    public static final n2 f13928a = new n2();

    private n2() {
    }

    @androidx.annotation.u
    public final int a() {
        return m2.INSTANCE.b();
    }

    @androidx.annotation.u
    @dl.d
    public final Shader.TileMode b() {
        return Shader.TileMode.DECAL;
    }
}
