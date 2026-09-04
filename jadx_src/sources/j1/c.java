package j1;

import android.content.Context;
import androidx.annotation.b0;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.m1;
import androidx.compose.runtime.p;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;
import androidx.compose.ui.text.font.LoadedFontFamily;
import androidx.compose.ui.text.font.a1;
import androidx.compose.ui.text.font.v;
import androidx.compose.ui.text.font.z0;
import com.umeng.analytics.pro.ak;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.DeprecationLevel;
import kotlin.Metadata;
import kotlin.jvm.internal.f0;
import kotlin.k;
import kotlin.s0;

/* JADX INFO: compiled from: FontResources.android.kt */
/* JADX INFO: loaded from: classes.dex */
@Metadata(bv = {}, d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u001a\u0017\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\u0007¢\u0006\u0004\b\u0003\u0010\u0004\u001a\u0018\u0010\u0007\u001a\u00020\u00022\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0003\u001a\u00020\u0000H\u0003¨\u0006\b"}, d2 = {"Landroidx/compose/ui/text/font/v;", com.google.android.exoplayer2.text.ttml.d.K, "Landroidx/compose/ui/text/font/a1;", ak.av, "(Landroidx/compose/ui/text/font/v;Landroidx/compose/runtime/p;I)Landroidx/compose/ui/text/font/a1;", "Landroid/content/Context;", com.umeng.analytics.pro.d.R, "b", "ui_release"}, k = 2, mv = {1, 7, 1})
public final class c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @dl.d
    private static final Object f124193a = new Object();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @dl.d
    @b0("cacheLock")
    private static final Map<v, a1> f124194b = new LinkedHashMap();

    @dl.d
    @k(level = DeprecationLevel.WARNING, message = "Prefer to preload fonts using FontFamily.Resolver.", replaceWith = @s0(expression = "FontFamily.Resolver.preload(fontFamily, Font.AndroidResourceLoader(context))", imports = {}))
    @m1
    @androidx.compose.runtime.h
    public static final a1 a(@dl.d v fontFamily, @dl.e p pVar, int i10) {
        f0.p(fontFamily, "fontFamily");
        if (ComposerKt.g0()) {
            ComposerKt.w0(-190831095, i10, -1, "androidx.compose.ui.res.fontResource (FontResources.android.kt:53)");
        }
        a1 a1VarB = b((Context) pVar.K(AndroidCompositionLocals_androidKt.g()), fontFamily);
        if (ComposerKt.g0()) {
            ComposerKt.v0();
        }
        return a1VarB;
    }

    @k(level = DeprecationLevel.WARNING, message = "Prefer to preload fonts using FontFamily.Resolver.", replaceWith = @s0(expression = "FontFamily.Resolver.preload(fontFamily, Font.AndroidResourceLoader(context))", imports = {}))
    private static final a1 b(Context context, v vVar) {
        a1 a1Var;
        if (!(vVar instanceof z0) && !(vVar instanceof LoadedFontFamily)) {
            return androidx.compose.ui.text.font.k.d(context, vVar, null, 4, null);
        }
        synchronized (f124193a) {
            Map<v, a1> map = f124194b;
            a1 a1VarD = map.get(vVar);
            if (a1VarD == null) {
                a1VarD = androidx.compose.ui.text.font.k.d(context, vVar, null, 4, null);
                map.put(vVar, a1VarD);
            }
            a1Var = a1VarD;
        }
        return a1Var;
    }
}
