package androidx.compose.ui.graphics.vector.compat;

import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import androidx.annotation.f1;
import androidx.annotation.l;
import androidx.core.content.res.q;
import com.ss.bytertc.base.media.screen.RXScreenCaptureService;
import com.starlightc.ucropplus.ui.UCropPlusActivity;
import com.taobao.accs.common.Constants;
import com.umeng.analytics.pro.ak;
import dl.d;
import dl.e;
import kotlin.Metadata;
import kotlin.jvm.internal.f0;
import kotlin.jvm.internal.u;
import org.xmlpull.v1.XmlPullParser;

/* JADX INFO: renamed from: androidx.compose.ui.graphics.vector.compat.a, reason: from toString */
/* JADX INFO: compiled from: XmlVectorParser.android.kt */
/* JADX INFO: loaded from: classes.dex */
@Metadata(bv = {}, d1 = {"\u0000^\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0015\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010\u0007\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0014\b\u0080\b\u0018\u00002\u00020\u0001B\u0019\u0012\u0006\u0010'\u001a\u00020$\u0012\b\b\u0002\u0010(\u001a\u00020\u0002¢\u0006\u0004\b6\u00107J\u0010\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0002J,\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\u0007\u001a\u00020\u00062\f\u0010\t\u001a\b\u0018\u00010\bR\u00020\u00062\u0006\u0010\u000b\u001a\u00020\n2\u0006\u0010\r\u001a\u00020\fJ(\u0010\u0015\u001a\u00020\u00022\u0006\u0010\u0010\u001a\u00020\u000e2\u0006\u0010\u0012\u001a\u00020\u00112\b\b\u0001\u0010\u0013\u001a\u00020\u00022\u0006\u0010\u0014\u001a\u00020\u0002J(\u0010\u0017\u001a\u00020\u00162\u0006\u0010\u0010\u001a\u00020\u000e2\u0006\u0010\u0012\u001a\u00020\u00112\b\b\u0001\u0010\u0013\u001a\u00020\u00022\u0006\u0010\u0014\u001a\u00020\u0016J(\u0010\u0019\u001a\u00020\u00182\u0006\u0010\u0010\u001a\u00020\u000e2\u0006\u0010\u0012\u001a\u00020\u00112\b\b\u0001\u0010\u0013\u001a\u00020\u00022\u0006\u0010\u0014\u001a\u00020\u0018J\u001e\u0010\u001b\u001a\u00020\u00162\u0006\u0010\u0010\u001a\u00020\u000e2\u0006\u0010\u001a\u001a\u00020\u00022\u0006\u0010\u0014\u001a\u00020\u0016J\u001e\u0010\u001c\u001a\u00020\u00022\u0006\u0010\u0010\u001a\u00020\u000e2\u0006\u0010\u001a\u001a\u00020\u00022\u0006\u0010\u0014\u001a\u00020\u0002J\u0018\u0010\u001d\u001a\u0004\u0018\u00010\u00112\u0006\u0010\u0010\u001a\u00020\u000e2\u0006\u0010\u001a\u001a\u00020\u0002J\u001e\u0010\u001f\u001a\u00020\u00162\u0006\u0010\u0010\u001a\u00020\u000e2\u0006\u0010\u001a\u001a\u00020\u00022\u0006\u0010\u001e\u001a\u00020\u0016J8\u0010!\u001a\u00020 2\u0006\u0010\u0010\u001a\u00020\u000e2\f\u0010\t\u001a\b\u0018\u00010\bR\u00020\u00062\u0006\u0010\u0012\u001a\u00020\u00112\b\b\u0001\u0010\u0013\u001a\u00020\u00022\b\b\u0001\u0010\u0014\u001a\u00020\u0002J0\u0010#\u001a\u0004\u0018\u00010\"2\u0006\u0010\u0010\u001a\u00020\u000e2\f\u0010\t\u001a\b\u0018\u00010\bR\u00020\u00062\u0006\u0010\u0012\u001a\u00020\u00112\b\b\u0001\u0010\u0013\u001a\u00020\u0002J\t\u0010%\u001a\u00020$HÆ\u0003J\t\u0010&\u001a\u00020\u0002HÆ\u0003J\u001d\u0010)\u001a\u00020\u00002\b\b\u0002\u0010'\u001a\u00020$2\b\b\u0002\u0010(\u001a\u00020\u0002HÆ\u0001J\t\u0010*\u001a\u00020\u0011HÖ\u0001J\t\u0010+\u001a\u00020\u0002HÖ\u0001J\u0013\u0010-\u001a\u00020\u00182\b\u0010,\u001a\u0004\u0018\u00010\u0001HÖ\u0003R\u0017\u0010'\u001a\u00020$8\u0006¢\u0006\f\n\u0004\b%\u0010.\u001a\u0004\b/\u00100R\"\u0010(\u001a\u00020\u00028\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b&\u00101\u001a\u0004\b2\u00103\"\u0004\b4\u00105¨\u00068"}, d2 = {"Landroidx/compose/ui/graphics/vector/compat/a;", "", "", "resConfig", "Lkotlin/b2;", "r", "Landroid/content/res/Resources;", Constants.SEND_TYPE_RES, "Landroid/content/res/Resources$Theme;", "theme", "Landroid/util/AttributeSet;", "set", "", "attrs", "Landroid/content/res/TypedArray;", "p", "typedArray", "", "attrName", "resId", "defaultValue", "m", "", "l", "", "i", UCropPlusActivity.ARG_INDEX, "g", RXScreenCaptureService.KEY_HEIGHT, "n", "defValue", "f", "Landroidx/core/content/res/d;", "k", "Landroid/content/res/ColorStateList;", "j", "Lorg/xmlpull/v1/XmlPullParser;", ak.av, "b", "xmlParser", "config", ak.aF, "toString", "hashCode", "other", "equals", "Lorg/xmlpull/v1/XmlPullParser;", "o", "()Lorg/xmlpull/v1/XmlPullParser;", "I", "e", "()I", "q", "(I)V", "<init>", "(Lorg/xmlpull/v1/XmlPullParser;I)V", "ui_release"}, k = 1, mv = {1, 7, 1})
public final /* data */ class AndroidVectorParser {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
    @d
    private final XmlPullParser xmlParser;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata and from toString */
    private int config;

    public AndroidVectorParser(@d XmlPullParser xmlParser, int i10) {
        f0.p(xmlParser, "xmlParser");
        this.xmlParser = xmlParser;
        this.config = i10;
    }

    public /* synthetic */ AndroidVectorParser(XmlPullParser xmlPullParser, int i10, int i11, u uVar) {
        this(xmlPullParser, (i11 & 2) != 0 ? 0 : i10);
    }

    public static /* synthetic */ AndroidVectorParser d(AndroidVectorParser androidVectorParser, XmlPullParser xmlPullParser, int i10, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            xmlPullParser = androidVectorParser.xmlParser;
        }
        if ((i11 & 2) != 0) {
            i10 = androidVectorParser.config;
        }
        return androidVectorParser.c(xmlPullParser, i10);
    }

    private final void r(int i10) {
        this.config = i10 | this.config;
    }

    @d
    /* JADX INFO: renamed from: a, reason: from getter */
    public final XmlPullParser getXmlParser() {
        return this.xmlParser;
    }

    /* JADX INFO: renamed from: b, reason: from getter */
    public final int getConfig() {
        return this.config;
    }

    @d
    public final AndroidVectorParser c(@d XmlPullParser xmlParser, int config) {
        f0.p(xmlParser, "xmlParser");
        return new AndroidVectorParser(xmlParser, config);
    }

    public final int e() {
        return this.config;
    }

    public boolean equals(@e Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof AndroidVectorParser)) {
            return false;
        }
        AndroidVectorParser androidVectorParser = (AndroidVectorParser) other;
        return f0.g(this.xmlParser, androidVectorParser.xmlParser) && this.config == androidVectorParser.config;
    }

    public final float f(@d TypedArray typedArray, int index, float defValue) {
        f0.p(typedArray, "typedArray");
        float dimension = typedArray.getDimension(index, defValue);
        r(typedArray.getChangingConfigurations());
        return dimension;
    }

    public final float g(@d TypedArray typedArray, int index, float defaultValue) {
        f0.p(typedArray, "typedArray");
        float f10 = typedArray.getFloat(index, defaultValue);
        r(typedArray.getChangingConfigurations());
        return f10;
    }

    public final int h(@d TypedArray typedArray, int index, int defaultValue) {
        f0.p(typedArray, "typedArray");
        int i10 = typedArray.getInt(index, defaultValue);
        r(typedArray.getChangingConfigurations());
        return i10;
    }

    public int hashCode() {
        return (this.xmlParser.hashCode() * 31) + this.config;
    }

    public final boolean i(@d TypedArray typedArray, @d String attrName, @f1 int resId, boolean defaultValue) {
        f0.p(typedArray, "typedArray");
        f0.p(attrName, "attrName");
        boolean zE = q.e(typedArray, this.xmlParser, attrName, resId, defaultValue);
        r(typedArray.getChangingConfigurations());
        return zE;
    }

    @e
    public final ColorStateList j(@d TypedArray typedArray, @e Resources.Theme theme, @d String attrName, @f1 int resId) {
        f0.p(typedArray, "typedArray");
        f0.p(attrName, "attrName");
        ColorStateList colorStateListG = q.g(typedArray, this.xmlParser, theme, attrName, resId);
        r(typedArray.getChangingConfigurations());
        return colorStateListG;
    }

    @d
    public final androidx.core.content.res.d k(@d TypedArray typedArray, @e Resources.Theme theme, @d String attrName, @f1 int resId, @l int defaultValue) {
        f0.p(typedArray, "typedArray");
        f0.p(attrName, "attrName");
        androidx.core.content.res.d result = q.i(typedArray, this.xmlParser, theme, attrName, resId, defaultValue);
        r(typedArray.getChangingConfigurations());
        f0.o(result, "result");
        return result;
    }

    public final float l(@d TypedArray typedArray, @d String attrName, @f1 int resId, float defaultValue) {
        f0.p(typedArray, "typedArray");
        f0.p(attrName, "attrName");
        float fJ = q.j(typedArray, this.xmlParser, attrName, resId, defaultValue);
        r(typedArray.getChangingConfigurations());
        return fJ;
    }

    public final int m(@d TypedArray typedArray, @d String attrName, @f1 int resId, int defaultValue) {
        f0.p(typedArray, "typedArray");
        f0.p(attrName, "attrName");
        int iK = q.k(typedArray, this.xmlParser, attrName, resId, defaultValue);
        r(typedArray.getChangingConfigurations());
        return iK;
    }

    @e
    public final String n(@d TypedArray typedArray, int index) {
        f0.p(typedArray, "typedArray");
        String string = typedArray.getString(index);
        r(typedArray.getChangingConfigurations());
        return string;
    }

    @d
    public final XmlPullParser o() {
        return this.xmlParser;
    }

    @d
    public final TypedArray p(@d Resources res, @e Resources.Theme theme, @d AttributeSet set, @d int[] attrs) {
        f0.p(res, "res");
        f0.p(set, "set");
        f0.p(attrs, "attrs");
        TypedArray typedArrayS = q.s(res, theme, set, attrs);
        f0.o(typedArrayS, "obtainAttributes(\n      …          attrs\n        )");
        r(typedArrayS.getChangingConfigurations());
        return typedArrayS;
    }

    public final void q(int i10) {
        this.config = i10;
    }

    @d
    public String toString() {
        return "AndroidVectorParser(xmlParser=" + this.xmlParser + ", config=" + this.config + ')';
    }
}
