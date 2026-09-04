package j1;

import android.content.Context;
import android.content.res.Resources;
import android.content.res.XmlResourceParser;
import android.util.TypedValue;
import androidx.annotation.v;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.p;
import androidx.compose.ui.graphics.painter.BitmapPainter;
import androidx.compose.ui.graphics.painter.Painter;
import androidx.compose.ui.graphics.vector.VectorPainterKt;
import androidx.compose.ui.graphics.y0;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;
import com.taobao.accs.common.Constants;
import com.umeng.analytics.pro.ak;
import java.io.IOException;
import kotlin.Metadata;
import kotlin.jvm.internal.f0;
import kotlin.text.StringsKt__StringsKt;
import org.xmlpull.v1.XmlPullParserException;

/* JADX INFO: compiled from: PainterResources.android.kt */
/* JADX INFO: loaded from: classes.dex */
@Metadata(bv = {}, d1 = {"\u0000*\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u001a\u0019\u0010\u0003\u001a\u00020\u00022\b\b\u0001\u0010\u0001\u001a\u00020\u0000H\u0007¢\u0006\u0004\b\u0003\u0010\u0004\u001a3\u0010\u000b\u001a\u00020\n2\n\u0010\u0007\u001a\u00060\u0005R\u00020\u00062\u0006\u0010\b\u001a\u00020\u00062\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\t\u001a\u00020\u0000H\u0003¢\u0006\u0004\b\u000b\u0010\f\u001a\u0018\u0010\u000e\u001a\u00020\r2\u0006\u0010\b\u001a\u00020\u00062\u0006\u0010\u0001\u001a\u00020\u0000H\u0002¨\u0006\u000f"}, d2 = {"", "id", "Landroidx/compose/ui/graphics/painter/Painter;", "d", "(ILandroidx/compose/runtime/p;I)Landroidx/compose/ui/graphics/painter/Painter;", "Landroid/content/res/Resources$Theme;", "Landroid/content/res/Resources;", "theme", Constants.SEND_TYPE_RES, "changingConfigurations", "Landroidx/compose/ui/graphics/vector/c;", ak.aF, "(Landroid/content/res/Resources$Theme;Landroid/content/res/Resources;IILandroidx/compose/runtime/p;I)Landroidx/compose/ui/graphics/vector/c;", "Landroidx/compose/ui/graphics/y0;", "b", "ui_release"}, k = 2, mv = {1, 7, 1})
public final class f {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @dl.d
    private static final String f124202a = "Only VectorDrawables and rasterized asset types are supported ex. PNG, JPG";

    /* JADX INFO: Access modifiers changed from: private */
    public static final y0 b(Resources resources, int i10) {
        try {
            return d.b(y0.INSTANCE, resources, i10);
        } catch (Throwable unused) {
            throw new IllegalArgumentException(f124202a);
        }
    }

    @androidx.compose.runtime.h
    private static final androidx.compose.ui.graphics.vector.c c(Resources.Theme theme, Resources resources, int i10, int i11, p pVar, int i12) throws XmlPullParserException, IOException {
        pVar.T(21855625);
        if (ComposerKt.g0()) {
            ComposerKt.w0(21855625, i12, -1, "androidx.compose.ui.res.loadVectorResource (PainterResources.android.kt:81)");
        }
        e eVar = (e) pVar.K(AndroidCompositionLocals_androidKt.h());
        e.Key key = new e.Key(theme, i10);
        e.ImageVectorEntry imageVectorEntryB = eVar.b(key);
        if (imageVectorEntryB == null) {
            XmlResourceParser xml = resources.getXml(i10);
            f0.o(xml, "res.getXml(id)");
            if (!f0.g(androidx.compose.ui.graphics.vector.compat.c.m(xml).getName(), "vector")) {
                throw new IllegalArgumentException(f124202a);
            }
            imageVectorEntryB = j.a(theme, resources, xml, i11);
            eVar.d(key, imageVectorEntryB);
        }
        androidx.compose.ui.graphics.vector.c cVarF = imageVectorEntryB.f();
        if (ComposerKt.g0()) {
            ComposerKt.v0();
        }
        pVar.c0();
        return cVarF;
    }

    @dl.d
    @androidx.compose.runtime.h
    public static final Painter d(@v int i10, @dl.e p pVar, int i11) {
        Painter bitmapPainter;
        pVar.T(473971343);
        if (ComposerKt.g0()) {
            ComposerKt.w0(473971343, i11, -1, "androidx.compose.ui.res.painterResource (PainterResources.android.kt:56)");
        }
        Context context = (Context) pVar.K(AndroidCompositionLocals_androidKt.g());
        Resources resourcesA = h.a(pVar, 0);
        pVar.T(-492369756);
        Object objU = pVar.U();
        p.Companion companion = p.INSTANCE;
        if (objU == companion.a()) {
            objU = new TypedValue();
            pVar.N(objU);
        }
        pVar.c0();
        TypedValue typedValue = (TypedValue) objU;
        resourcesA.getValue(i10, typedValue, true);
        CharSequence charSequence = typedValue.string;
        if (charSequence != null && StringsKt__StringsKt.c3(charSequence, ".xml", false, 2, null)) {
            pVar.T(-738265327);
            Resources.Theme theme = context.getTheme();
            f0.o(theme, "context.theme");
            bitmapPainter = VectorPainterKt.c(c(theme, resourcesA, i10, typedValue.changingConfigurations, pVar, ((i11 << 6) & bb.c.b.f30796me) | 72), pVar, 0);
            pVar.c0();
        } else {
            pVar.T(-738265172);
            Object objValueOf = Integer.valueOf(i10);
            Object theme2 = context.getTheme();
            pVar.T(1618982084);
            boolean zS = pVar.s(objValueOf) | pVar.s(charSequence) | pVar.s(theme2);
            Object objU2 = pVar.U();
            if (zS || objU2 == companion.a()) {
                objU2 = b(resourcesA, i10);
                pVar.N(objU2);
            }
            pVar.c0();
            bitmapPainter = new BitmapPainter((y0) objU2, 0L, 0L, 6, null);
            pVar.c0();
        }
        if (ComposerKt.g0()) {
            ComposerKt.v0();
        }
        pVar.c0();
        return bitmapPainter;
    }
}
