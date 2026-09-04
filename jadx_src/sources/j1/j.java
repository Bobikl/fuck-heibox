package j1;

import android.content.Context;
import android.content.res.Resources;
import android.content.res.XmlResourceParser;
import android.util.AttributeSet;
import android.util.TypedValue;
import android.util.Xml;
import androidx.annotation.v;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.p;
import androidx.compose.ui.graphics.vector.compat.AndroidVectorParser;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;
import com.taobao.accs.common.Constants;
import com.umeng.analytics.pro.ak;
import java.io.IOException;
import kotlin.Metadata;
import kotlin.b2;
import kotlin.jvm.internal.f0;
import org.xmlpull.v1.XmlPullParserException;

/* JADX INFO: compiled from: VectorResources.android.kt */
/* JADX INFO: loaded from: classes.dex */
@Metadata(bv = {}, d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u001a\u001d\u0010\u0004\u001a\u00020\u0003*\u00020\u00002\b\b\u0001\u0010\u0002\u001a\u00020\u0001H\u0007¢\u0006\u0004\b\u0004\u0010\u0005\u001a*\u0010\u000b\u001a\u00020\u0003*\u00020\u00002\u000e\b\u0002\u0010\b\u001a\b\u0018\u00010\u0006R\u00020\u00072\u0006\u0010\t\u001a\u00020\u00072\u0006\u0010\n\u001a\u00020\u0001\u001a0\u0010\u0010\u001a\u00020\u000f2\u000e\b\u0002\u0010\b\u001a\b\u0018\u00010\u0006R\u00020\u00072\u0006\u0010\t\u001a\u00020\u00072\u0006\u0010\r\u001a\u00020\f2\u0006\u0010\u000e\u001a\u00020\u0001H\u0000¨\u0006\u0011"}, d2 = {"Landroidx/compose/ui/graphics/vector/c$b;", "", "id", "Landroidx/compose/ui/graphics/vector/c;", ak.aF, "(Landroidx/compose/ui/graphics/vector/c$b;ILandroidx/compose/runtime/p;I)Landroidx/compose/ui/graphics/vector/c;", "Landroid/content/res/Resources$Theme;", "Landroid/content/res/Resources;", "theme", Constants.SEND_TYPE_RES, "resId", "d", "Landroid/content/res/XmlResourceParser;", "parser", "changingConfigurations", "Lj1/e$a;", ak.av, "ui_release"}, k = 2, mv = {1, 7, 1})
public final class j {
    @dl.d
    public static final e.ImageVectorEntry a(@dl.e Resources.Theme theme, @dl.d Resources res, @dl.d XmlResourceParser parser, int i10) throws XmlPullParserException, IOException {
        f0.p(res, "res");
        f0.p(parser, "parser");
        AttributeSet attrs = Xml.asAttributeSet(parser);
        AndroidVectorParser androidVectorParser = new AndroidVectorParser(parser, 0, 2, null);
        f0.o(attrs, "attrs");
        androidx.compose.ui.graphics.vector.c.a aVarA = androidx.compose.ui.graphics.vector.compat.c.a(androidVectorParser, res, theme, attrs);
        int i11 = 0;
        while (!androidx.compose.ui.graphics.vector.compat.c.f(parser)) {
            i11 = androidx.compose.ui.graphics.vector.compat.c.i(androidVectorParser, res, attrs, theme, aVarA, i11);
            parser.next();
        }
        return new e.ImageVectorEntry(aVarA.f(), i10);
    }

    public static /* synthetic */ e.ImageVectorEntry b(Resources.Theme theme, Resources resources, XmlResourceParser xmlResourceParser, int i10, int i11, Object obj) throws XmlPullParserException {
        if ((i11 & 1) != 0) {
            theme = null;
        }
        return a(theme, resources, xmlResourceParser, i10);
    }

    @dl.d
    @androidx.compose.runtime.h
    public static final androidx.compose.ui.graphics.vector.c c(@dl.d androidx.compose.ui.graphics.vector.c.Companion companion, @v int i10, @dl.e p pVar, int i11) throws XmlPullParserException, IOException {
        f0.p(companion, "<this>");
        pVar.T(44534090);
        if (ComposerKt.g0()) {
            ComposerKt.w0(44534090, i11, -1, "androidx.compose.ui.res.vectorResource (VectorResources.android.kt:47)");
        }
        Context context = (Context) pVar.K(AndroidCompositionLocals_androidKt.g());
        Resources resourcesA = h.a(pVar, 0);
        Resources.Theme theme = context.getTheme();
        Object[] objArr = {Integer.valueOf(i10), resourcesA, theme, resourcesA.getConfiguration()};
        pVar.T(-568225417);
        boolean zS = false;
        for (int i12 = 0; i12 < 4; i12++) {
            zS |= pVar.s(objArr[i12]);
        }
        Object objU = pVar.U();
        if (zS || objU == p.INSTANCE.a()) {
            objU = d(companion, theme, resourcesA, i10);
            pVar.N(objU);
        }
        pVar.c0();
        androidx.compose.ui.graphics.vector.c cVar = (androidx.compose.ui.graphics.vector.c) objU;
        if (ComposerKt.g0()) {
            ComposerKt.v0();
        }
        pVar.c0();
        return cVar;
    }

    @dl.d
    public static final androidx.compose.ui.graphics.vector.c d(@dl.d androidx.compose.ui.graphics.vector.c.Companion companion, @dl.e Resources.Theme theme, @dl.d Resources res, int i10) throws XmlPullParserException, IOException {
        f0.p(companion, "<this>");
        f0.p(res, "res");
        TypedValue typedValue = new TypedValue();
        res.getValue(i10, typedValue, true);
        XmlResourceParser xml = res.getXml(i10);
        f0.o(xml, "");
        androidx.compose.ui.graphics.vector.compat.c.m(xml);
        b2 b2Var = b2.f124493a;
        f0.o(xml, "res.getXml(resId).apply { seekToStartTag() }");
        return a(theme, res, xml, typedValue.changingConfigurations).f();
    }

    public static /* synthetic */ androidx.compose.ui.graphics.vector.c e(androidx.compose.ui.graphics.vector.c.Companion companion, Resources.Theme theme, Resources resources, int i10, int i11, Object obj) throws XmlPullParserException {
        if ((i11 & 1) != 0) {
            theme = null;
        }
        return d(companion, theme, resources, i10);
    }
}
