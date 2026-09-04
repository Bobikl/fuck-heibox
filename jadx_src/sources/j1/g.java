package j1;

import android.content.Context;
import androidx.annotation.g0;
import androidx.annotation.q;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.m1;
import androidx.compose.runtime.p;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;
import androidx.compose.ui.platform.CompositionLocalsKt;
import com.umeng.analytics.pro.ak;
import kotlin.Metadata;
import kotlin.jvm.internal.f0;

/* JADX INFO: compiled from: PrimitiveResources.android.kt */
/* JADX INFO: loaded from: classes.dex */
@Metadata(bv = {}, d1 = {"\u0000 \n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u0015\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u001a\u0019\u0010\u0002\u001a\u00020\u00002\b\b\u0001\u0010\u0001\u001a\u00020\u0000H\u0007¢\u0006\u0004\b\u0002\u0010\u0003\u001a\u0019\u0010\u0005\u001a\u00020\u00042\b\b\u0001\u0010\u0001\u001a\u00020\u0000H\u0007¢\u0006\u0004\b\u0005\u0010\u0006\u001a\u0019\u0010\b\u001a\u00020\u00072\b\b\u0001\u0010\u0001\u001a\u00020\u0000H\u0007¢\u0006\u0004\b\b\u0010\t\u001a\u001c\u0010\u000b\u001a\u00020\n2\b\b\u0001\u0010\u0001\u001a\u00020\u0000H\u0007ø\u0001\u0000¢\u0006\u0004\b\u000b\u0010\f\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006\r"}, d2 = {"", "id", "d", "(ILandroidx/compose/runtime/p;I)I", "", ak.aF, "(ILandroidx/compose/runtime/p;I)[I", "", ak.av, "(ILandroidx/compose/runtime/p;I)Z", "Ls1/h;", "b", "(ILandroidx/compose/runtime/p;I)F", "ui_release"}, k = 2, mv = {1, 7, 1})
public final class g {
    @m1
    @androidx.compose.runtime.h
    public static final boolean a(@androidx.annotation.h int i10, @dl.e p pVar, int i11) {
        if (ComposerKt.g0()) {
            ComposerKt.w0(-432394447, i11, -1, "androidx.compose.ui.res.booleanResource (PrimitiveResources.android.kt:62)");
        }
        boolean z10 = ((Context) pVar.K(AndroidCompositionLocals_androidKt.g())).getResources().getBoolean(i10);
        if (ComposerKt.g0()) {
            ComposerKt.v0();
        }
        return z10;
    }

    @m1
    @androidx.compose.runtime.h
    public static final float b(@q int i10, @dl.e p pVar, int i11) {
        if (ComposerKt.g0()) {
            ComposerKt.w0(804324951, i11, -1, "androidx.compose.ui.res.dimensionResource (PrimitiveResources.android.kt:75)");
        }
        float fG = s1.h.g(((Context) pVar.K(AndroidCompositionLocals_androidKt.g())).getResources().getDimension(i10) / ((s1.e) pVar.K(CompositionLocalsKt.i())).getF139217b());
        if (ComposerKt.g0()) {
            ComposerKt.v0();
        }
        return fG;
    }

    @m1
    @dl.d
    @androidx.compose.runtime.h
    public static final int[] c(@androidx.annotation.e int i10, @dl.e p pVar, int i11) {
        if (ComposerKt.g0()) {
            ComposerKt.w0(-93991766, i11, -1, "androidx.compose.ui.res.integerArrayResource (PrimitiveResources.android.kt:49)");
        }
        int[] intArray = ((Context) pVar.K(AndroidCompositionLocals_androidKt.g())).getResources().getIntArray(i10);
        f0.o(intArray, "context.resources.getIntArray(id)");
        if (ComposerKt.g0()) {
            ComposerKt.v0();
        }
        return intArray;
    }

    @m1
    @androidx.compose.runtime.h
    public static final int d(@g0 int i10, @dl.e p pVar, int i11) {
        if (ComposerKt.g0()) {
            ComposerKt.w0(916701108, i11, -1, "androidx.compose.ui.res.integerResource (PrimitiveResources.android.kt:36)");
        }
        int integer = ((Context) pVar.K(AndroidCompositionLocals_androidKt.g())).getResources().getInteger(i10);
        if (ComposerKt.g0()) {
            ComposerKt.v0();
        }
        return integer;
    }
}
