package j1;

import androidx.annotation.d1;
import androidx.annotation.s0;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.m1;
import androidx.compose.runtime.p;
import com.umeng.analytics.pro.ak;
import java.util.Arrays;
import kotlin.Metadata;
import kotlin.jvm.internal.f0;

/* JADX INFO: compiled from: StringResources.android.kt */
/* JADX INFO: loaded from: classes.dex */
@Metadata(bv = {}, d1 = {"\u0000\u001a\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u0011\n\u0002\u0010\u0000\n\u0002\b\u000b\u001a\u0019\u0010\u0003\u001a\u00020\u00022\b\b\u0001\u0010\u0001\u001a\u00020\u0000H\u0007¢\u0006\u0004\b\u0003\u0010\u0004\u001a-\u0010\b\u001a\u00020\u00022\b\b\u0001\u0010\u0001\u001a\u00020\u00002\u0012\u0010\u0007\u001a\n\u0012\u0006\b\u0001\u0012\u00020\u00060\u0005\"\u00020\u0006H\u0007¢\u0006\u0004\b\b\u0010\t\u001a\u001f\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u00020\u00052\b\b\u0001\u0010\u0001\u001a\u00020\u0000H\u0007¢\u0006\u0004\b\n\u0010\u000b\u001a!\u0010\r\u001a\u00020\u00022\b\b\u0001\u0010\u0001\u001a\u00020\u00002\u0006\u0010\f\u001a\u00020\u0000H\u0007¢\u0006\u0004\b\r\u0010\u000e\u001a5\u0010\u000f\u001a\u00020\u00022\b\b\u0001\u0010\u0001\u001a\u00020\u00002\u0006\u0010\f\u001a\u00020\u00002\u0012\u0010\u0007\u001a\n\u0012\u0006\b\u0001\u0012\u00020\u00060\u0005\"\u00020\u0006H\u0007¢\u0006\u0004\b\u000f\u0010\u0010¨\u0006\u0011"}, d2 = {"", "id", "", "d", "(ILandroidx/compose/runtime/p;I)Ljava/lang/String;", "", "", "formatArgs", "e", "(I[Ljava/lang/Object;Landroidx/compose/runtime/p;I)Ljava/lang/String;", ak.aF, "(ILandroidx/compose/runtime/p;I)[Ljava/lang/String;", "count", ak.av, "(IILandroidx/compose/runtime/p;I)Ljava/lang/String;", "b", "(II[Ljava/lang/Object;Landroidx/compose/runtime/p;I)Ljava/lang/String;", "ui_release"}, k = 2, mv = {1, 7, 1})
public final class i {
    @androidx.compose.ui.g
    @dl.d
    @m1
    @androidx.compose.runtime.h
    public static final String a(@s0 int i10, int i11, @dl.e p pVar, int i12) {
        if (ComposerKt.g0()) {
            ComposerKt.w0(1784741530, i12, -1, "androidx.compose.ui.res.pluralStringResource (StringResources.android.kt:75)");
        }
        String quantityString = h.a(pVar, 0).getQuantityString(i10, i11);
        f0.o(quantityString, "resources.getQuantityString(id, count)");
        if (ComposerKt.g0()) {
            ComposerKt.v0();
        }
        return quantityString;
    }

    @androidx.compose.ui.g
    @dl.d
    @m1
    @androidx.compose.runtime.h
    public static final String b(@s0 int i10, int i11, @dl.d Object[] formatArgs, @dl.e p pVar, int i12) {
        f0.p(formatArgs, "formatArgs");
        if (ComposerKt.g0()) {
            ComposerKt.w0(523207213, i12, -1, "androidx.compose.ui.res.pluralStringResource (StringResources.android.kt:91)");
        }
        String quantityString = h.a(pVar, 0).getQuantityString(i10, i11, Arrays.copyOf(formatArgs, formatArgs.length));
        f0.o(quantityString, "resources.getQuantityStr…g(id, count, *formatArgs)");
        if (ComposerKt.g0()) {
            ComposerKt.v0();
        }
        return quantityString;
    }

    @m1
    @dl.d
    @androidx.compose.runtime.h
    public static final String[] c(@androidx.annotation.e int i10, @dl.e p pVar, int i11) {
        if (ComposerKt.g0()) {
            ComposerKt.w0(1562162650, i11, -1, "androidx.compose.ui.res.stringArrayResource (StringResources.android.kt:60)");
        }
        String[] stringArray = h.a(pVar, 0).getStringArray(i10);
        f0.o(stringArray, "resources.getStringArray(id)");
        if (ComposerKt.g0()) {
            ComposerKt.v0();
        }
        return stringArray;
    }

    @m1
    @dl.d
    @androidx.compose.runtime.h
    public static final String d(@d1 int i10, @dl.e p pVar, int i11) {
        if (ComposerKt.g0()) {
            ComposerKt.w0(1223887937, i11, -1, "androidx.compose.ui.res.stringResource (StringResources.android.kt:33)");
        }
        String string = h.a(pVar, 0).getString(i10);
        f0.o(string, "resources.getString(id)");
        if (ComposerKt.g0()) {
            ComposerKt.v0();
        }
        return string;
    }

    @m1
    @dl.d
    @androidx.compose.runtime.h
    public static final String e(@d1 int i10, @dl.d Object[] formatArgs, @dl.e p pVar, int i11) {
        f0.p(formatArgs, "formatArgs");
        if (ComposerKt.g0()) {
            ComposerKt.w0(2071230100, i11, -1, "androidx.compose.ui.res.stringResource (StringResources.android.kt:47)");
        }
        String string = h.a(pVar, 0).getString(i10, Arrays.copyOf(formatArgs, formatArgs.length));
        f0.o(string, "resources.getString(id, *formatArgs)");
        if (ComposerKt.g0()) {
            ComposerKt.v0();
        }
        return string;
    }
}
