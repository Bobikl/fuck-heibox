package androidx.core.content.res;

import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.content.res.XmlResourceParser;
import android.graphics.Shader;
import android.util.AttributeSet;
import android.util.Log;
import android.util.Xml;
import androidx.annotation.RestrictTo;
import androidx.annotation.n0;
import androidx.annotation.p0;
import java.io.IOException;
import org.xmlpull.v1.XmlPullParserException;

/* JADX INFO: compiled from: ComplexColorCompat.java */
/* JADX INFO: loaded from: classes.dex */
@RestrictTo({RestrictTo.Scope.LIBRARY_GROUP_PREFIX})
public final class d {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private static final String f20558d = "ComplexColorCompat";

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Shader f20559a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final ColorStateList f20560b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private int f20561c;

    private d(Shader shader, ColorStateList colorStateList, @androidx.annotation.l int i10) {
        this.f20559a = shader;
        this.f20560b = colorStateList;
        this.f20561c = i10;
    }

    @n0
    private static d a(@n0 Resources resources, @androidx.annotation.n int i10, @p0 Resources.Theme theme) throws XmlPullParserException, IOException {
        int next;
        XmlResourceParser xml = resources.getXml(i10);
        AttributeSet attributeSetAsAttributeSet = Xml.asAttributeSet(xml);
        do {
            next = xml.next();
            if (next == 2) {
                break;
            }
        } while (next != 1);
        if (next != 2) {
            throw new XmlPullParserException("No start tag found");
        }
        String name = xml.getName();
        name.hashCode();
        if (name.equals("gradient")) {
            return d(g.c(resources, xml, attributeSetAsAttributeSet, theme));
        }
        if (name.equals("selector")) {
            return c(c.b(resources, xml, attributeSetAsAttributeSet, theme));
        }
        throw new XmlPullParserException(xml.getPositionDescription() + ": unsupported complex color tag " + name);
    }

    static d b(@androidx.annotation.l int i10) {
        return new d(null, null, i10);
    }

    static d c(@n0 ColorStateList colorStateList) {
        return new d(null, colorStateList, colorStateList.getDefaultColor());
    }

    static d d(@n0 Shader shader) {
        return new d(shader, null, 0);
    }

    @p0
    public static d g(@n0 Resources resources, @androidx.annotation.n int i10, @p0 Resources.Theme theme) {
        try {
            return a(resources, i10, theme);
        } catch (Exception e10) {
            Log.e(f20558d, "Failed to inflate ComplexColor.", e10);
            return null;
        }
    }

    @androidx.annotation.l
    public int e() {
        return this.f20561c;
    }

    @p0
    public Shader f() {
        return this.f20559a;
    }

    public boolean h() {
        return this.f20559a != null;
    }

    public boolean i() {
        ColorStateList colorStateList;
        return this.f20559a == null && (colorStateList = this.f20560b) != null && colorStateList.isStateful();
    }

    public boolean j(int[] iArr) {
        if (i()) {
            ColorStateList colorStateList = this.f20560b;
            int colorForState = colorStateList.getColorForState(iArr, colorStateList.getDefaultColor());
            if (colorForState != this.f20561c) {
                this.f20561c = colorForState;
                return true;
            }
        }
        return false;
    }

    public void k(@androidx.annotation.l int i10) {
        this.f20561c = i10;
    }

    public boolean l() {
        return h() || this.f20561c != 0;
    }
}
