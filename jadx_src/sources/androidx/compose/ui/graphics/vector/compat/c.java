package androidx.compose.ui.graphics.vector.compat;

import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.Shader;
import android.util.AttributeSet;
import android.util.TypedValue;
import androidx.compose.ui.graphics.SolidColor;
import androidx.compose.ui.graphics.a0;
import androidx.compose.ui.graphics.b0;
import androidx.compose.ui.graphics.j2;
import androidx.compose.ui.graphics.k2;
import androidx.compose.ui.graphics.l0;
import androidx.compose.ui.graphics.n0;
import androidx.compose.ui.graphics.n1;
import androidx.compose.ui.graphics.vector.f;
import androidx.compose.ui.graphics.vector.p;
import androidx.compose.ui.graphics.x;
import androidx.core.content.res.q;
import com.ss.bytertc.base.media.screen.RXScreenCaptureService;
import com.taobao.accs.common.Constants;
import com.umeng.analytics.pro.ak;
import dl.d;
import dl.e;
import java.io.IOException;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.f0;
import org.xmlpull.v1.XmlPullParser;
import org.xmlpull.v1.XmlPullParserException;
import s1.h;

/* JADX INFO: compiled from: XmlVectorParser.android.kt */
/* JADX INFO: loaded from: classes.dex */
@Metadata(bv = {}, d1 = {"\u0000X\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\r\n\u0002\u0010\u000e\n\u0002\b\u0006\u001a'\u0010\u0004\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u0002H\u0002ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b\u0004\u0010\u0005\u001a'\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0001\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u0006H\u0002ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b\u0007\u0010\u0005\u001a\f\u0010\n\u001a\u00020\t*\u00020\bH\u0000\u001a<\u0010\u0015\u001a\u00020\u0000*\u00020\u000b2\u0006\u0010\r\u001a\u00020\f2\u0006\u0010\u000f\u001a\u00020\u000e2\u000e\b\u0002\u0010\u0011\u001a\b\u0018\u00010\u0010R\u00020\f2\u0006\u0010\u0013\u001a\u00020\u00122\u0006\u0010\u0014\u001a\u00020\u0000H\u0000\u001a\f\u0010\u0016\u001a\u00020\b*\u00020\bH\u0000\u001a*\u0010\u0017\u001a\u00020\u0012*\u00020\u000b2\u0006\u0010\r\u001a\u00020\f2\f\u0010\u0011\u001a\b\u0018\u00010\u0010R\u00020\f2\u0006\u0010\u000f\u001a\u00020\u000eH\u0000\u001a2\u0010\u0019\u001a\u00020\u0018*\u00020\u000b2\u0006\u0010\r\u001a\u00020\f2\f\u0010\u0011\u001a\b\u0018\u00010\u0010R\u00020\f2\u0006\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\u0013\u001a\u00020\u0012H\u0000\u001a\u0012\u0010\u001d\u001a\u0004\u0018\u00010\u001c2\u0006\u0010\u001b\u001a\u00020\u001aH\u0002\u001a2\u0010\u001e\u001a\u00020\u0018*\u00020\u000b2\u0006\u0010\r\u001a\u00020\f2\f\u0010\u0011\u001a\b\u0018\u00010\u0010R\u00020\f2\u0006\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\u0013\u001a\u00020\u0012H\u0000\u001a2\u0010\u001f\u001a\u00020\u0018*\u00020\u000b2\u0006\u0010\r\u001a\u00020\f2\f\u0010\u0011\u001a\b\u0018\u00010\u0010R\u00020\f2\u0006\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\u0013\u001a\u00020\u0012H\u0000\"\u0014\u0010!\u001a\u00020\u00008\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0017\u0010 \"\u0014\u0010\"\u001a\u00020\u00008\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0004\u0010 \"\u0014\u0010$\u001a\u00020\u00008\u0002X\u0082T¢\u0006\u0006\n\u0004\b#\u0010 \"\u0014\u0010%\u001a\u00020\u00008\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0007\u0010 \"\u0014\u0010'\u001a\u00020\u00008\u0002X\u0082T¢\u0006\u0006\n\u0004\b&\u0010 \"\u0014\u0010(\u001a\u00020\u00008\u0002X\u0082T¢\u0006\u0006\n\u0004\b\n\u0010 \"\u0014\u0010)\u001a\u00020\u00008\u0002X\u0082D¢\u0006\u0006\n\u0004\b\u001d\u0010 \"\u0014\u0010,\u001a\u00020*8\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u001e\u0010+\"\u0014\u0010-\u001a\u00020*8\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0015\u0010+\"\u0014\u0010/\u001a\u00020*8\u0002X\u0082T¢\u0006\u0006\n\u0004\b.\u0010+\u0082\u0002\u000b\n\u0005\b¡\u001e0\u0001\n\u0002\b\u0019¨\u00060"}, d2 = {"", "id", "Landroidx/compose/ui/graphics/j2;", "defValue", "b", "(II)I", "Landroidx/compose/ui/graphics/k2;", "d", "Lorg/xmlpull/v1/XmlPullParser;", "", "f", "Landroidx/compose/ui/graphics/vector/compat/a;", "Landroid/content/res/Resources;", Constants.SEND_TYPE_RES, "Landroid/util/AttributeSet;", "attrs", "Landroid/content/res/Resources$Theme;", "theme", "Landroidx/compose/ui/graphics/vector/c$a;", "builder", "nestedGroups", "i", "m", ak.av, "Lkotlin/b2;", "l", "Landroidx/core/content/res/d;", "complexColor", "Landroidx/compose/ui/graphics/a0;", "g", RXScreenCaptureService.KEY_HEIGHT, "k", "I", "LINECAP_BUTT", "LINECAP_ROUND", ak.aF, "LINECAP_SQUARE", "LINEJOIN_MITER", "e", "LINEJOIN_ROUND", "LINEJOIN_BEVEL", "FILL_TYPE_WINDING", "", "Ljava/lang/String;", "SHAPE_CLIP_PATH", "SHAPE_GROUP", "j", "SHAPE_PATH", "ui_release"}, k = 2, mv = {1, 7, 1})
public final class c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final int f14215a = 0;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static final int f14216b = 1;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static final int f14217c = 2;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private static final int f14218d = 0;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private static final int f14219e = 1;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private static final int f14220f = 2;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private static final int f14221g = 0;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    @d
    private static final String f14222h = "clip-path";

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    @d
    private static final String f14223i = "group";

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    @d
    private static final String f14224j = "path";

    @d
    public static final androidx.compose.ui.graphics.vector.c.a a(@d AndroidVectorParser androidVectorParser, @d Resources res, @e Resources.Theme theme, @d AttributeSet attrs) throws XmlPullParserException {
        long jU;
        int iZ;
        ColorStateList colorStateListJ;
        f0.p(androidVectorParser, "<this>");
        f0.p(res, "res");
        f0.p(attrs, "attrs");
        b bVar = b.f14189a;
        TypedArray typedArrayP = androidVectorParser.p(res, theme, attrs, bVar.H());
        boolean zI = androidVectorParser.i(typedArrayP, "autoMirrored", bVar.b(), false);
        float fL = androidVectorParser.l(typedArrayP, "viewportWidth", bVar.J(), 0.0f);
        float fL2 = androidVectorParser.l(typedArrayP, "viewportHeight", bVar.I(), 0.0f);
        if (fL <= 0.0f) {
            throw new XmlPullParserException(typedArrayP.getPositionDescription() + "<VectorGraphic> tag requires viewportWidth > 0");
        }
        if (fL2 <= 0.0f) {
            throw new XmlPullParserException(typedArrayP.getPositionDescription() + "<VectorGraphic> tag requires viewportHeight > 0");
        }
        float f10 = androidVectorParser.f(typedArrayP, bVar.K(), 0.0f);
        float f11 = androidVectorParser.f(typedArrayP, bVar.o(), 0.0f);
        if (typedArrayP.hasValue(bVar.F())) {
            TypedValue typedValue = new TypedValue();
            typedArrayP.getValue(bVar.F(), typedValue);
            jU = (typedValue.type == 2 || (colorStateListJ = androidVectorParser.j(typedArrayP, theme, "tint", bVar.F())) == null) ? l0.INSTANCE.u() : n0.b(colorStateListJ.getDefaultColor());
        } else {
            jU = l0.INSTANCE.u();
        }
        long j10 = jU;
        int iH = androidVectorParser.h(typedArrayP, bVar.G(), -1);
        if (iH == -1) {
            iZ = x.INSTANCE.z();
        } else if (iH == 3) {
            iZ = x.INSTANCE.B();
        } else if (iH == 5) {
            iZ = x.INSTANCE.z();
        } else if (iH != 9) {
            switch (iH) {
                case 14:
                    iZ = x.INSTANCE.q();
                    break;
                case 15:
                    iZ = x.INSTANCE.v();
                    break;
                case 16:
                    iZ = x.INSTANCE.t();
                    break;
                default:
                    iZ = x.INSTANCE.z();
                    break;
            }
        } else {
            iZ = x.INSTANCE.y();
        }
        int i10 = iZ;
        float fG = h.g(f10 / res.getDisplayMetrics().density);
        float fG2 = h.g(f11 / res.getDisplayMetrics().density);
        typedArrayP.recycle();
        return new androidx.compose.ui.graphics.vector.c.a(null, fG, fG2, fL, fL2, j10, i10, zI, 1, null);
    }

    private static final int b(int i10, int i11) {
        if (i10 == 0) {
            return j2.INSTANCE.a();
        }
        if (i10 != 1) {
            return i10 != 2 ? i11 : j2.INSTANCE.c();
        }
        return j2.INSTANCE.b();
    }

    static /* synthetic */ int c(int i10, int i11, int i12, Object obj) {
        if ((i12 & 2) != 0) {
            i11 = j2.INSTANCE.a();
        }
        return b(i10, i11);
    }

    private static final int d(int i10, int i11) {
        if (i10 == 0) {
            return k2.INSTANCE.b();
        }
        if (i10 != 1) {
            return i10 != 2 ? i11 : k2.INSTANCE.a();
        }
        return k2.INSTANCE.c();
    }

    static /* synthetic */ int e(int i10, int i11, int i12, Object obj) {
        if ((i12 & 2) != 0) {
            i11 = k2.INSTANCE.b();
        }
        return d(i10, i11);
    }

    public static final boolean f(@d XmlPullParser xmlPullParser) {
        f0.p(xmlPullParser, "<this>");
        if (xmlPullParser.getEventType() != 1) {
            return xmlPullParser.getDepth() < 1 && xmlPullParser.getEventType() == 3;
        }
        return true;
    }

    private static final a0 g(androidx.core.content.res.d dVar) {
        if (!dVar.l()) {
            return null;
        }
        Shader shaderF = dVar.f();
        return shaderF != null ? b0.a(shaderF) : new SolidColor(n0.b(dVar.e()), null);
    }

    public static final void h(@d AndroidVectorParser androidVectorParser, @d Resources res, @e Resources.Theme theme, @d AttributeSet attrs, @d androidx.compose.ui.graphics.vector.c.a builder) {
        f0.p(androidVectorParser, "<this>");
        f0.p(res, "res");
        f0.p(attrs, "attrs");
        f0.p(builder, "builder");
        b bVar = b.f14189a;
        TypedArray typedArrayP = androidVectorParser.p(res, theme, attrs, bVar.c());
        String strN = androidVectorParser.n(typedArrayP, bVar.d());
        if (strN == null) {
            strN = "";
        }
        List<f> listB = p.b(androidVectorParser.n(typedArrayP, bVar.e()));
        typedArrayP.recycle();
        builder.a((254 & 1) != 0 ? "" : strN, (254 & 2) != 0 ? 0.0f : 0.0f, (254 & 4) != 0 ? 0.0f : 0.0f, (254 & 8) != 0 ? 0.0f : 0.0f, (254 & 16) != 0 ? 1.0f : 0.0f, (254 & 32) == 0 ? 0.0f : 1.0f, (254 & 64) != 0 ? 0.0f : 0.0f, (254 & 128) == 0 ? 0.0f : 0.0f, (254 & 256) != 0 ? p.h() : listB);
    }

    public static final int i(@d AndroidVectorParser androidVectorParser, @d Resources res, @d AttributeSet attrs, @e Resources.Theme theme, @d androidx.compose.ui.graphics.vector.c.a builder, int i10) throws XmlPullParserException {
        f0.p(androidVectorParser, "<this>");
        f0.p(res, "res");
        f0.p(attrs, "attrs");
        f0.p(builder, "builder");
        int eventType = androidVectorParser.o().getEventType();
        if (eventType != 2) {
            if (eventType != 3 || !f0.g("group", androidVectorParser.o().getName())) {
                return i10;
            }
            int i11 = i10 + 1;
            for (int i12 = 0; i12 < i11; i12++) {
                builder.g();
            }
            return 0;
        }
        String name = androidVectorParser.o().getName();
        if (name == null) {
            return i10;
        }
        int iHashCode = name.hashCode();
        if (iHashCode == -1649314686) {
            if (!name.equals(f14222h)) {
                return i10;
            }
            h(androidVectorParser, res, theme, attrs, builder);
            return i10 + 1;
        }
        if (iHashCode == 3433509) {
            if (!name.equals("path")) {
                return i10;
            }
            l(androidVectorParser, res, theme, attrs, builder);
            return i10;
        }
        if (iHashCode != 98629247 || !name.equals("group")) {
            return i10;
        }
        k(androidVectorParser, res, theme, attrs, builder);
        return i10;
    }

    public static /* synthetic */ int j(AndroidVectorParser androidVectorParser, Resources resources, AttributeSet attributeSet, Resources.Theme theme, androidx.compose.ui.graphics.vector.c.a aVar, int i10, int i11, Object obj) {
        if ((i11 & 4) != 0) {
            theme = null;
        }
        return i(androidVectorParser, resources, attributeSet, theme, aVar, i10);
    }

    public static final void k(@d AndroidVectorParser androidVectorParser, @d Resources res, @e Resources.Theme theme, @d AttributeSet attrs, @d androidx.compose.ui.graphics.vector.c.a builder) {
        f0.p(androidVectorParser, "<this>");
        f0.p(res, "res");
        f0.p(attrs, "attrs");
        f0.p(builder, "builder");
        b bVar = b.f14189a;
        TypedArray typedArrayP = androidVectorParser.p(res, theme, attrs, bVar.f());
        float fL = androidVectorParser.l(typedArrayP, androidx.constraintlayout.motion.widget.f.f18721i, bVar.j(), 0.0f);
        float fG = androidVectorParser.g(typedArrayP, bVar.h(), 0.0f);
        float fG2 = androidVectorParser.g(typedArrayP, bVar.i(), 0.0f);
        float fL2 = androidVectorParser.l(typedArrayP, "scaleX", bVar.k(), 1.0f);
        float fL3 = androidVectorParser.l(typedArrayP, "scaleY", bVar.l(), 1.0f);
        float fL4 = androidVectorParser.l(typedArrayP, "translateX", bVar.m(), 0.0f);
        float fL5 = androidVectorParser.l(typedArrayP, "translateY", bVar.n(), 0.0f);
        String strN = androidVectorParser.n(typedArrayP, bVar.g());
        if (strN == null) {
            strN = "";
        }
        typedArrayP.recycle();
        builder.a(strN, fL, fG, fG2, fL2, fL3, fL4, fL5, p.h());
    }

    public static final void l(@d AndroidVectorParser androidVectorParser, @d Resources res, @e Resources.Theme theme, @d AttributeSet attrs, @d androidx.compose.ui.graphics.vector.c.a builder) throws IllegalArgumentException {
        f0.p(androidVectorParser, "<this>");
        f0.p(res, "res");
        f0.p(attrs, "attrs");
        f0.p(builder, "builder");
        b bVar = b.f14189a;
        TypedArray typedArrayP = androidVectorParser.p(res, theme, attrs, bVar.q());
        if (!q.r(androidVectorParser.o(), "pathData")) {
            throw new IllegalArgumentException("No path data available");
        }
        String strN = androidVectorParser.n(typedArrayP, bVar.t());
        if (strN == null) {
            strN = "";
        }
        String str = strN;
        List<f> listB = p.b(androidVectorParser.n(typedArrayP, bVar.u()));
        androidx.core.content.res.d dVarK = androidVectorParser.k(typedArrayP, theme, "fillColor", bVar.s(), 0);
        float fL = androidVectorParser.l(typedArrayP, "fillAlpha", bVar.r(), 1.0f);
        int iB = b(androidVectorParser.m(typedArrayP, "strokeLineCap", bVar.x(), -1), j2.INSTANCE.a());
        int iD = d(androidVectorParser.m(typedArrayP, "strokeLineJoin", bVar.y(), -1), k2.INSTANCE.a());
        float fL2 = androidVectorParser.l(typedArrayP, "strokeMiterLimit", bVar.z(), 1.0f);
        androidx.core.content.res.d dVarK2 = androidVectorParser.k(typedArrayP, theme, "strokeColor", bVar.w(), 0);
        float fL3 = androidVectorParser.l(typedArrayP, "strokeAlpha", bVar.v(), 1.0f);
        float fL4 = androidVectorParser.l(typedArrayP, "strokeWidth", bVar.A(), 1.0f);
        float fL5 = androidVectorParser.l(typedArrayP, "trimPathEnd", bVar.B(), 1.0f);
        float fL6 = androidVectorParser.l(typedArrayP, "trimPathOffset", bVar.D(), 0.0f);
        float fL7 = androidVectorParser.l(typedArrayP, "trimPathStart", bVar.E(), 0.0f);
        int iM = androidVectorParser.m(typedArrayP, "fillType", bVar.C(), f14221g);
        typedArrayP.recycle();
        a0 a0VarG = g(dVarK);
        a0 a0VarG2 = g(dVarK2);
        n1.Companion companion = n1.INSTANCE;
        builder.c(listB, iM == 0 ? companion.b() : companion.a(), str, a0VarG, fL, a0VarG2, fL3, fL4, iB, iD, fL2, fL7, fL5, fL6);
    }

    @d
    public static final XmlPullParser m(@d XmlPullParser xmlPullParser) throws XmlPullParserException, IOException {
        f0.p(xmlPullParser, "<this>");
        int next = xmlPullParser.next();
        while (next != 2 && next != 1) {
            next = xmlPullParser.next();
        }
        if (next == 2) {
            return xmlPullParser;
        }
        throw new XmlPullParserException("No start tag found");
    }
}
