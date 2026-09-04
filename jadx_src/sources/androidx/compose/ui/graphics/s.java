package androidx.compose.ui.graphics;

import android.graphics.Shader;
import android.os.Build;
import com.umeng.analytics.pro.ak;
import kotlin.Metadata;

/* JADX INFO: compiled from: AndroidTileMode.android.kt */
/* JADX INFO: loaded from: classes.dex */
@Metadata(bv = {}, d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\u001a\u0017\u0010\u0002\u001a\u00020\u0001*\u00020\u0000ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b\u0002\u0010\u0003\u001a\u0017\u0010\u0005\u001a\u00020\u0004*\u00020\u0000ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b\u0005\u0010\u0006\u001a\u0014\u0010\u0007\u001a\u00020\u0000*\u00020\u0004ø\u0001\u0001¢\u0006\u0004\b\u0007\u0010\b\u0082\u0002\u000b\n\u0005\b¡\u001e0\u0001\n\u0002\b\u0019¨\u0006\t"}, d2 = {"Landroidx/compose/ui/graphics/m2;", "", ak.av, "(I)Z", "Landroid/graphics/Shader$TileMode;", "b", "(I)Landroid/graphics/Shader$TileMode;", ak.aF, "(Landroid/graphics/Shader$TileMode;)I", "ui-graphics_release"}, k = 2, mv = {1, 7, 1})
public final class s {

    /* JADX INFO: compiled from: AndroidTileMode.android.kt */
    @Metadata(k = 3, mv = {1, 7, 1}, xi = 48)
    public final /* synthetic */ class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f13974a;

        static {
            int[] iArr = new int[Shader.TileMode.values().length];
            iArr[Shader.TileMode.CLAMP.ordinal()] = 1;
            iArr[Shader.TileMode.MIRROR.ordinal()] = 2;
            iArr[Shader.TileMode.REPEAT.ordinal()] = 3;
            f13974a = iArr;
        }
    }

    public static final boolean a(int i10) {
        return Build.VERSION.SDK_INT >= 31 || !m2.h(i10, m2.INSTANCE.b());
    }

    @dl.d
    public static final Shader.TileMode b(int i10) {
        m2.Companion companion = m2.INSTANCE;
        if (m2.h(i10, companion.a())) {
            return Shader.TileMode.CLAMP;
        }
        if (m2.h(i10, companion.d())) {
            return Shader.TileMode.REPEAT;
        }
        if (m2.h(i10, companion.c())) {
            return Shader.TileMode.MIRROR;
        }
        if (m2.h(i10, companion.b()) && Build.VERSION.SDK_INT >= 31) {
            return n2.f13928a.b();
        }
        return Shader.TileMode.CLAMP;
    }

    public static final int c(@dl.d Shader.TileMode tileMode) {
        kotlin.jvm.internal.f0.p(tileMode, "<this>");
        int i10 = a.f13974a[tileMode.ordinal()];
        if (i10 == 1) {
            return m2.INSTANCE.a();
        }
        if (i10 == 2) {
            return m2.INSTANCE.c();
        }
        if (i10 != 3) {
            return (Build.VERSION.SDK_INT < 31 || tileMode != Shader.TileMode.DECAL) ? m2.INSTANCE.a() : n2.f13928a.a();
        }
        return m2.INSTANCE.d();
    }
}
