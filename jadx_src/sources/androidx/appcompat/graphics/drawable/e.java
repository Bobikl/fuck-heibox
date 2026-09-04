package androidx.appcompat.graphics.drawable;

import android.annotation.SuppressLint;
import android.content.Context;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.util.StateSet;
import androidx.annotation.RestrictTo;
import androidx.annotation.n0;
import androidx.annotation.p0;
import androidx.annotation.w0;
import androidx.appcompat.resources.R;
import androidx.appcompat.widget.m0;
import androidx.core.content.res.q;
import com.max.xiaoheihe.module.bbs.ChannelListActivity;
import java.io.IOException;
import org.xmlpull.v1.XmlPullParser;
import org.xmlpull.v1.XmlPullParserException;

/* JADX INFO: compiled from: StateListDrawable.java */
/* JADX INFO: loaded from: classes.dex */
@SuppressLint({"RestrictedAPI"})
@RestrictTo({RestrictTo.Scope.LIBRARY_GROUP_PREFIX})
public class e extends b {

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    private static final String f1977s = "StateListDrawable";

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    private static final boolean f1978t = false;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    private a f1979q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    private boolean f1980r;

    /* JADX INFO: compiled from: StateListDrawable.java */
    public static class a extends b.d {
        int[][] J;

        a(a aVar, e eVar, Resources resources) {
            super(aVar, eVar, resources);
            if (aVar != null) {
                this.J = aVar.J;
            } else {
                this.J = new int[g()][];
            }
        }

        int D(int[] iArr, Drawable drawable) {
            int iA = a(drawable);
            this.J[iA] = iArr;
            return iA;
        }

        int E(int[] iArr) {
            int[][] iArr2 = this.J;
            int i10 = i();
            for (int i11 = 0; i11 < i10; i11++) {
                if (StateSet.stateSetMatches(iArr2[i11], iArr)) {
                    return i11;
                }
            }
            return -1;
        }

        @Override // android.graphics.drawable.Drawable.ConstantState
        @n0
        public Drawable newDrawable() {
            return new e(this, null);
        }

        @Override // android.graphics.drawable.Drawable.ConstantState
        @n0
        public Drawable newDrawable(Resources resources) {
            return new e(this, resources);
        }

        @Override // androidx.appcompat.graphics.drawable.b.d
        public void r(int i10, int i11) {
            super.r(i10, i11);
            int[][] iArr = new int[i11][];
            System.arraycopy(this.J, 0, iArr, 0, i10);
            this.J = iArr;
        }

        @Override // androidx.appcompat.graphics.drawable.b.d
        void v() {
            int[][] iArr = this.J;
            int[][] iArr2 = new int[iArr.length][];
            for (int length = iArr.length - 1; length >= 0; length--) {
                int[] iArr3 = this.J[length];
                iArr2[length] = iArr3 != null ? (int[]) iArr3.clone() : null;
            }
            this.J = iArr2;
        }
    }

    e() {
        this(null, null);
    }

    e(@p0 a aVar) {
        if (aVar != null) {
            i(aVar);
        }
    }

    e(a aVar, Resources resources) {
        i(new a(aVar, this, resources));
        onStateChange(getState());
    }

    private void w(Context context, Resources resources, XmlPullParser xmlPullParser, AttributeSet attributeSet, Resources.Theme theme) throws XmlPullParserException, IOException {
        int next;
        a aVar = this.f1979q;
        int depth = xmlPullParser.getDepth() + 1;
        while (true) {
            int next2 = xmlPullParser.next();
            if (next2 == 1) {
                return;
            }
            int depth2 = xmlPullParser.getDepth();
            if (depth2 < depth && next2 == 3) {
                return;
            }
            if (next2 == 2 && depth2 <= depth && xmlPullParser.getName().equals(ChannelListActivity.q.f79586f)) {
                TypedArray typedArrayS = q.s(resources, theme, attributeSet, R.styleable.f1985e);
                int resourceId = typedArrayS.getResourceId(R.styleable.StateListDrawableItem_android_drawable, -1);
                Drawable drawableJ = resourceId > 0 ? m0.h().j(context, resourceId) : null;
                typedArrayS.recycle();
                int[] iArrP = p(attributeSet);
                if (drawableJ == null) {
                    do {
                        next = xmlPullParser.next();
                    } while (next == 4);
                    if (next != 2) {
                        throw new XmlPullParserException(xmlPullParser.getPositionDescription() + ": <item> tag requires a 'drawable' attribute or child tag defining a drawable");
                    }
                    drawableJ = c0.a.c.a(resources, xmlPullParser, attributeSet, theme);
                }
                aVar.D(iArrP, drawableJ);
            }
        }
    }

    private void x(TypedArray typedArray) {
        a aVar = this.f1979q;
        aVar.f1936d |= c0.a.c.b(typedArray);
        aVar.f1941i = typedArray.getBoolean(R.styleable.StateListDrawable_android_variablePadding, aVar.f1941i);
        aVar.f1944l = typedArray.getBoolean(R.styleable.StateListDrawable_android_constantSize, aVar.f1944l);
        aVar.A = typedArray.getInt(R.styleable.StateListDrawable_android_enterFadeDuration, aVar.A);
        aVar.B = typedArray.getInt(R.styleable.StateListDrawable_android_exitFadeDuration, aVar.B);
        aVar.f1956x = typedArray.getBoolean(R.styleable.StateListDrawable_android_dither, aVar.f1956x);
    }

    @Override // androidx.appcompat.graphics.drawable.b, android.graphics.drawable.Drawable
    @w0(21)
    public void applyTheme(@n0 Resources.Theme theme) {
        super.applyTheme(theme);
        onStateChange(getState());
    }

    @Override // androidx.appcompat.graphics.drawable.b
    void b() {
        super.b();
        this.f1980r = false;
    }

    @Override // androidx.appcompat.graphics.drawable.b
    void i(@n0 b.d dVar) {
        super.i(dVar);
        if (dVar instanceof a) {
            this.f1979q = (a) dVar;
        }
    }

    @Override // androidx.appcompat.graphics.drawable.b, android.graphics.drawable.Drawable
    public boolean isStateful() {
        return true;
    }

    @Override // androidx.appcompat.graphics.drawable.b, android.graphics.drawable.Drawable
    @n0
    public Drawable mutate() {
        if (!this.f1980r && super.mutate() == this) {
            this.f1979q.v();
            this.f1980r = true;
        }
        return this;
    }

    public void n(int[] iArr, Drawable drawable) {
        if (drawable != null) {
            this.f1979q.D(iArr, drawable);
            onStateChange(getState());
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // androidx.appcompat.graphics.drawable.b
    public a o() {
        return new a(this.f1979q, this, null);
    }

    @Override // androidx.appcompat.graphics.drawable.b, android.graphics.drawable.Drawable
    protected boolean onStateChange(@n0 int[] iArr) {
        boolean zOnStateChange = super.onStateChange(iArr);
        int iE = this.f1979q.E(iArr);
        if (iE < 0) {
            iE = this.f1979q.E(StateSet.WILD_CARD);
        }
        return h(iE) || zOnStateChange;
    }

    int[] p(AttributeSet attributeSet) {
        int attributeCount = attributeSet.getAttributeCount();
        int[] iArr = new int[attributeCount];
        int i10 = 0;
        for (int i11 = 0; i11 < attributeCount; i11++) {
            int attributeNameResource = attributeSet.getAttributeNameResource(i11);
            if (attributeNameResource != 0 && attributeNameResource != 16842960 && attributeNameResource != 16843161) {
                int i12 = i10 + 1;
                if (!attributeSet.getAttributeBooleanValue(i11, false)) {
                    attributeNameResource = -attributeNameResource;
                }
                iArr[i10] = attributeNameResource;
                i10 = i12;
            }
        }
        return StateSet.trimStateSet(iArr, i10);
    }

    int q() {
        return this.f1979q.i();
    }

    Drawable r(int i10) {
        return this.f1979q.h(i10);
    }

    int s(int[] iArr) {
        return this.f1979q.E(iArr);
    }

    a t() {
        return this.f1979q;
    }

    int[] u(int i10) {
        return this.f1979q.J[i10];
    }

    public void v(@n0 Context context, @n0 Resources resources, @n0 XmlPullParser xmlPullParser, @n0 AttributeSet attributeSet, @p0 Resources.Theme theme) throws XmlPullParserException, IOException {
        TypedArray typedArrayS = q.s(resources, theme, attributeSet, R.styleable.f1984d);
        setVisible(typedArrayS.getBoolean(R.styleable.StateListDrawable_android_visible, true), true);
        x(typedArrayS);
        m(resources);
        typedArrayS.recycle();
        w(context, resources, xmlPullParser, attributeSet, theme);
        onStateChange(getState());
    }
}
