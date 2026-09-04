package androidx.appcompat.graphics.drawable;

import android.animation.ObjectAnimator;
import android.animation.TimeInterpolator;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.content.res.XmlResourceParser;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Outline;
import android.graphics.PorterDuff;
import android.graphics.Rect;
import android.graphics.drawable.Animatable;
import android.graphics.drawable.AnimationDrawable;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.util.Log;
import android.util.StateSet;
import android.util.Xml;
import androidx.annotation.l;
import androidx.annotation.n0;
import androidx.annotation.p0;
import androidx.annotation.v;
import androidx.annotation.w0;
import androidx.appcompat.resources.R;
import androidx.appcompat.widget.m0;
import androidx.collection.l2;
import androidx.collection.x0;
import androidx.core.content.res.q;
import androidx.core.graphics.drawable.p;
import androidx.core.util.j;
import androidx.vectordrawable.graphics.drawable.i;
import java.io.IOException;
import org.xmlpull.v1.XmlPullParser;
import org.xmlpull.v1.XmlPullParserException;

/* JADX INFO: compiled from: AnimatedStateListDrawableCompat.java */
/* JADX INFO: loaded from: classes.dex */
public class a extends androidx.appcompat.graphics.drawable.e implements p {
    private static final String A = "transition";
    private static final String B = "item";
    private static final String C = ": <transition> tag requires a 'drawable' attribute or child tag defining a drawable";
    private static final String D = ": <transition> tag requires 'fromId' & 'toId' attributes";
    private static final String E = ": <item> tag requires a 'drawable' attribute or child tag defining a drawable";

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    private static final String f1903z = a.class.getSimpleName();

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    private c f1904u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    private g f1905v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    private int f1906w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    private int f1907x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    private boolean f1908y;

    /* JADX INFO: compiled from: AnimatedStateListDrawableCompat.java */
    public static class b extends g {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final Animatable f1909a;

        b(Animatable animatable) {
            super();
            this.f1909a = animatable;
        }

        @Override // androidx.appcompat.graphics.drawable.a.g
        public void c() {
            this.f1909a.start();
        }

        @Override // androidx.appcompat.graphics.drawable.a.g
        public void d() {
            this.f1909a.stop();
        }
    }

    /* JADX INFO: compiled from: AnimatedStateListDrawableCompat.java */
    public static class c extends androidx.appcompat.graphics.drawable.e.a {
        private static final long M = 4294967296L;
        private static final long N = 8589934592L;
        x0<Long> K;
        l2<Integer> L;

        c(@p0 c cVar, @n0 a aVar, @p0 Resources resources) {
            super(cVar, aVar, resources);
            if (cVar != null) {
                this.K = cVar.K;
                this.L = cVar.L;
            } else {
                this.K = new x0<>();
                this.L = new l2<>();
            }
        }

        private static long H(int i10, int i11) {
            return ((long) i11) | (((long) i10) << 32);
        }

        int F(@n0 int[] iArr, @n0 Drawable drawable, int i10) {
            int iD = super.D(iArr, drawable);
            this.L.n(iD, Integer.valueOf(i10));
            return iD;
        }

        int G(int i10, int i11, @n0 Drawable drawable, boolean z10) {
            int iA = super.a(drawable);
            long jH = H(i10, i11);
            long j10 = z10 ? N : 0L;
            long j11 = iA;
            this.K.a(jH, Long.valueOf(j11 | j10));
            if (z10) {
                this.K.a(H(i11, i10), Long.valueOf(M | j11 | j10));
            }
            return iA;
        }

        int I(int i10) {
            if (i10 < 0) {
                return 0;
            }
            return this.L.h(i10, 0).intValue();
        }

        int J(@n0 int[] iArr) {
            int iE = super.E(iArr);
            return iE >= 0 ? iE : super.E(StateSet.WILD_CARD);
        }

        int K(int i10, int i11) {
            return (int) this.K.h(H(i10, i11), -1L).longValue();
        }

        boolean L(int i10, int i11) {
            return (this.K.h(H(i10, i11), -1L).longValue() & M) != 0;
        }

        boolean M(int i10, int i11) {
            return (this.K.h(H(i10, i11), -1L).longValue() & N) != 0;
        }

        @Override // androidx.appcompat.graphics.drawable.e.a, android.graphics.drawable.Drawable.ConstantState
        @n0
        public Drawable newDrawable() {
            return new a(this, null);
        }

        @Override // androidx.appcompat.graphics.drawable.e.a, android.graphics.drawable.Drawable.ConstantState
        @n0
        public Drawable newDrawable(Resources resources) {
            return new a(this, resources);
        }

        @Override // androidx.appcompat.graphics.drawable.e.a, androidx.appcompat.graphics.drawable.b.d
        void v() {
            this.K = this.K.clone();
            this.L = this.L.clone();
        }
    }

    /* JADX INFO: compiled from: AnimatedStateListDrawableCompat.java */
    public static class d extends g {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final androidx.vectordrawable.graphics.drawable.c f1910a;

        d(androidx.vectordrawable.graphics.drawable.c cVar) {
            super();
            this.f1910a = cVar;
        }

        @Override // androidx.appcompat.graphics.drawable.a.g
        public void c() {
            this.f1910a.start();
        }

        @Override // androidx.appcompat.graphics.drawable.a.g
        public void d() {
            this.f1910a.stop();
        }
    }

    /* JADX INFO: compiled from: AnimatedStateListDrawableCompat.java */
    public static class e extends g {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final ObjectAnimator f1911a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final boolean f1912b;

        e(AnimationDrawable animationDrawable, boolean z10, boolean z11) {
            super();
            int numberOfFrames = animationDrawable.getNumberOfFrames();
            int i10 = z10 ? numberOfFrames - 1 : 0;
            int i11 = z10 ? 0 : numberOfFrames - 1;
            f fVar = new f(animationDrawable, z10);
            ObjectAnimator objectAnimatorOfInt = ObjectAnimator.ofInt(animationDrawable, "currentIndex", i10, i11);
            c0.a.b.a(objectAnimatorOfInt, true);
            objectAnimatorOfInt.setDuration(fVar.a());
            objectAnimatorOfInt.setInterpolator(fVar);
            this.f1912b = z11;
            this.f1911a = objectAnimatorOfInt;
        }

        @Override // androidx.appcompat.graphics.drawable.a.g
        public boolean a() {
            return this.f1912b;
        }

        @Override // androidx.appcompat.graphics.drawable.a.g
        public void b() {
            this.f1911a.reverse();
        }

        @Override // androidx.appcompat.graphics.drawable.a.g
        public void c() {
            this.f1911a.start();
        }

        @Override // androidx.appcompat.graphics.drawable.a.g
        public void d() {
            this.f1911a.cancel();
        }
    }

    /* JADX INFO: compiled from: AnimatedStateListDrawableCompat.java */
    public static class f implements TimeInterpolator {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private int[] f1913a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private int f1914b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private int f1915c;

        f(AnimationDrawable animationDrawable, boolean z10) {
            b(animationDrawable, z10);
        }

        int a() {
            return this.f1915c;
        }

        int b(AnimationDrawable animationDrawable, boolean z10) {
            int numberOfFrames = animationDrawable.getNumberOfFrames();
            this.f1914b = numberOfFrames;
            int[] iArr = this.f1913a;
            if (iArr == null || iArr.length < numberOfFrames) {
                this.f1913a = new int[numberOfFrames];
            }
            int[] iArr2 = this.f1913a;
            int i10 = 0;
            for (int i11 = 0; i11 < numberOfFrames; i11++) {
                int duration = animationDrawable.getDuration(z10 ? (numberOfFrames - i11) - 1 : i11);
                iArr2[i11] = duration;
                i10 += duration;
            }
            this.f1915c = i10;
            return i10;
        }

        @Override // android.animation.TimeInterpolator
        public float getInterpolation(float f10) {
            int i10 = (int) ((f10 * this.f1915c) + 0.5f);
            int i11 = this.f1914b;
            int[] iArr = this.f1913a;
            int i12 = 0;
            while (i12 < i11) {
                int i13 = iArr[i12];
                if (i10 < i13) {
                    break;
                }
                i10 -= i13;
                i12++;
            }
            return (i12 / i11) + (i12 < i11 ? i10 / this.f1915c : 0.0f);
        }
    }

    /* JADX INFO: compiled from: AnimatedStateListDrawableCompat.java */
    public static abstract class g {
        private g() {
        }

        public boolean a() {
            return false;
        }

        public void b() {
        }

        public abstract void c();

        public abstract void d();
    }

    public a() {
        this(null, null);
    }

    a(@p0 c cVar, @p0 Resources resources) {
        super(null);
        this.f1906w = -1;
        this.f1907x = -1;
        i(new c(cVar, this, resources));
        onStateChange(getState());
        jumpToCurrentState();
    }

    @p0
    public static a B(@n0 Context context, @v int i10, @p0 Resources.Theme theme) {
        int next;
        try {
            Resources resources = context.getResources();
            XmlResourceParser xml = resources.getXml(i10);
            AttributeSet attributeSetAsAttributeSet = Xml.asAttributeSet(xml);
            do {
                next = xml.next();
                if (next == 2) {
                    break;
                }
            } while (next != 1);
            if (next == 2) {
                return C(context, resources, xml, attributeSetAsAttributeSet, theme);
            }
            throw new XmlPullParserException("No start tag found");
        } catch (IOException e10) {
            Log.e(f1903z, "parser error", e10);
            return null;
        } catch (XmlPullParserException e11) {
            Log.e(f1903z, "parser error", e11);
            return null;
        }
    }

    @n0
    public static a C(@n0 Context context, @n0 Resources resources, @n0 XmlPullParser xmlPullParser, @n0 AttributeSet attributeSet, @p0 Resources.Theme theme) throws XmlPullParserException, IOException {
        String name = xmlPullParser.getName();
        if (name.equals("animated-selector")) {
            a aVar = new a();
            aVar.v(context, resources, xmlPullParser, attributeSet, theme);
            return aVar;
        }
        throw new XmlPullParserException(xmlPullParser.getPositionDescription() + ": invalid animated-selector tag " + name);
    }

    private void D() {
        onStateChange(getState());
    }

    private int E(@n0 Context context, @n0 Resources resources, @n0 XmlPullParser xmlPullParser, @n0 AttributeSet attributeSet, @p0 Resources.Theme theme) throws XmlPullParserException, IOException {
        int next;
        TypedArray typedArrayS = q.s(resources, theme, attributeSet, R.styleable.f1982b);
        int resourceId = typedArrayS.getResourceId(R.styleable.AnimatedStateListDrawableItem_android_id, 0);
        int resourceId2 = typedArrayS.getResourceId(R.styleable.AnimatedStateListDrawableItem_android_drawable, -1);
        Drawable drawableJ = resourceId2 > 0 ? m0.h().j(context, resourceId2) : null;
        typedArrayS.recycle();
        int[] iArrP = p(attributeSet);
        if (drawableJ == null) {
            do {
                next = xmlPullParser.next();
            } while (next == 4);
            if (next != 2) {
                throw new XmlPullParserException(xmlPullParser.getPositionDescription() + E);
            }
            drawableJ = xmlPullParser.getName().equals("vector") ? i.e(resources, xmlPullParser, attributeSet, theme) : c0.a.c.a(resources, xmlPullParser, attributeSet, theme);
        }
        if (drawableJ != null) {
            return this.f1904u.F(iArrP, drawableJ, resourceId);
        }
        throw new XmlPullParserException(xmlPullParser.getPositionDescription() + E);
    }

    private int F(@n0 Context context, @n0 Resources resources, @n0 XmlPullParser xmlPullParser, @n0 AttributeSet attributeSet, @p0 Resources.Theme theme) throws XmlPullParserException, IOException {
        int next;
        TypedArray typedArrayS = q.s(resources, theme, attributeSet, R.styleable.f1983c);
        int resourceId = typedArrayS.getResourceId(R.styleable.AnimatedStateListDrawableTransition_android_fromId, -1);
        int resourceId2 = typedArrayS.getResourceId(R.styleable.AnimatedStateListDrawableTransition_android_toId, -1);
        int resourceId3 = typedArrayS.getResourceId(R.styleable.AnimatedStateListDrawableTransition_android_drawable, -1);
        Drawable drawableJ = resourceId3 > 0 ? m0.h().j(context, resourceId3) : null;
        boolean z10 = typedArrayS.getBoolean(R.styleable.AnimatedStateListDrawableTransition_android_reversible, false);
        typedArrayS.recycle();
        if (drawableJ == null) {
            do {
                next = xmlPullParser.next();
            } while (next == 4);
            if (next != 2) {
                throw new XmlPullParserException(xmlPullParser.getPositionDescription() + C);
            }
            drawableJ = xmlPullParser.getName().equals("animated-vector") ? androidx.vectordrawable.graphics.drawable.c.e(context, resources, xmlPullParser, attributeSet, theme) : c0.a.c.a(resources, xmlPullParser, attributeSet, theme);
        }
        if (drawableJ == null) {
            throw new XmlPullParserException(xmlPullParser.getPositionDescription() + C);
        }
        if (resourceId != -1 && resourceId2 != -1) {
            return this.f1904u.G(resourceId, resourceId2, drawableJ, z10);
        }
        throw new XmlPullParserException(xmlPullParser.getPositionDescription() + D);
    }

    private boolean G(int i10) {
        int iD;
        int iK;
        g bVar;
        g gVar = this.f1905v;
        if (gVar == null) {
            iD = d();
        } else {
            if (i10 == this.f1906w) {
                return true;
            }
            if (i10 == this.f1907x && gVar.a()) {
                gVar.b();
                this.f1906w = this.f1907x;
                this.f1907x = i10;
                return true;
            }
            iD = this.f1906w;
            gVar.d();
        }
        this.f1905v = null;
        this.f1907x = -1;
        this.f1906w = -1;
        c cVar = this.f1904u;
        int I = cVar.I(iD);
        int I2 = cVar.I(i10);
        if (I2 == 0 || I == 0 || (iK = cVar.K(I, I2)) < 0) {
            return false;
        }
        boolean zM = cVar.M(I, I2);
        h(iK);
        Object current = getCurrent();
        if (current instanceof AnimationDrawable) {
            bVar = new e((AnimationDrawable) current, cVar.L(I, I2), zM);
        } else {
            if (!(current instanceof androidx.vectordrawable.graphics.drawable.c)) {
                if (current instanceof Animatable) {
                    bVar = new b((Animatable) current);
                }
                return false;
            }
            bVar = new d((androidx.vectordrawable.graphics.drawable.c) current);
        }
        bVar.c();
        this.f1905v = bVar;
        this.f1907x = iD;
        this.f1906w = i10;
        return true;
    }

    private void w(@n0 Context context, @n0 Resources resources, @n0 XmlPullParser xmlPullParser, @n0 AttributeSet attributeSet, @p0 Resources.Theme theme) throws XmlPullParserException, IOException {
        int depth = xmlPullParser.getDepth() + 1;
        while (true) {
            int next = xmlPullParser.next();
            if (next == 1) {
                return;
            }
            int depth2 = xmlPullParser.getDepth();
            if (depth2 < depth && next == 3) {
                return;
            }
            if (next == 2 && depth2 <= depth) {
                if (xmlPullParser.getName().equals("item")) {
                    E(context, resources, xmlPullParser, attributeSet, theme);
                } else if (xmlPullParser.getName().equals(A)) {
                    F(context, resources, xmlPullParser, attributeSet, theme);
                }
            }
        }
    }

    private void x(TypedArray typedArray) {
        c cVar = this.f1904u;
        cVar.f1936d |= c0.a.c.b(typedArray);
        cVar.B(typedArray.getBoolean(R.styleable.AnimatedStateListDrawableCompat_android_variablePadding, cVar.f1941i));
        cVar.x(typedArray.getBoolean(R.styleable.AnimatedStateListDrawableCompat_android_constantSize, cVar.f1944l));
        cVar.y(typedArray.getInt(R.styleable.AnimatedStateListDrawableCompat_android_enterFadeDuration, cVar.A));
        cVar.z(typedArray.getInt(R.styleable.AnimatedStateListDrawableCompat_android_exitFadeDuration, cVar.B));
        setDither(typedArray.getBoolean(R.styleable.AnimatedStateListDrawableCompat_android_dither, cVar.f1956x));
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // androidx.appcompat.graphics.drawable.e
    /* JADX INFO: renamed from: A, reason: merged with bridge method [inline-methods] and merged with bridge method [inline-methods] */
    public c o() {
        return new c(this.f1904u, this, null);
    }

    @Override // androidx.appcompat.graphics.drawable.e, androidx.appcompat.graphics.drawable.b, android.graphics.drawable.Drawable
    @w0(21)
    public /* bridge */ /* synthetic */ void applyTheme(@n0 Resources.Theme theme) {
        super.applyTheme(theme);
    }

    @Override // androidx.appcompat.graphics.drawable.e, androidx.appcompat.graphics.drawable.b
    void b() {
        super.b();
        this.f1908y = false;
    }

    @Override // androidx.appcompat.graphics.drawable.b, android.graphics.drawable.Drawable
    @w0(21)
    public /* bridge */ /* synthetic */ boolean canApplyTheme() {
        return super.canApplyTheme();
    }

    @Override // androidx.appcompat.graphics.drawable.b, android.graphics.drawable.Drawable
    public /* bridge */ /* synthetic */ void draw(@n0 Canvas canvas) {
        super.draw(canvas);
    }

    @Override // androidx.appcompat.graphics.drawable.b, android.graphics.drawable.Drawable
    public /* bridge */ /* synthetic */ int getAlpha() {
        return super.getAlpha();
    }

    @Override // androidx.appcompat.graphics.drawable.b, android.graphics.drawable.Drawable
    public /* bridge */ /* synthetic */ int getChangingConfigurations() {
        return super.getChangingConfigurations();
    }

    @Override // androidx.appcompat.graphics.drawable.b, android.graphics.drawable.Drawable
    @n0
    public /* bridge */ /* synthetic */ Drawable getCurrent() {
        return super.getCurrent();
    }

    @Override // androidx.appcompat.graphics.drawable.b, android.graphics.drawable.Drawable
    public /* bridge */ /* synthetic */ void getHotspotBounds(@n0 Rect rect) {
        super.getHotspotBounds(rect);
    }

    @Override // androidx.appcompat.graphics.drawable.b, android.graphics.drawable.Drawable
    public /* bridge */ /* synthetic */ int getIntrinsicHeight() {
        return super.getIntrinsicHeight();
    }

    @Override // androidx.appcompat.graphics.drawable.b, android.graphics.drawable.Drawable
    public /* bridge */ /* synthetic */ int getIntrinsicWidth() {
        return super.getIntrinsicWidth();
    }

    @Override // androidx.appcompat.graphics.drawable.b, android.graphics.drawable.Drawable
    public /* bridge */ /* synthetic */ int getMinimumHeight() {
        return super.getMinimumHeight();
    }

    @Override // androidx.appcompat.graphics.drawable.b, android.graphics.drawable.Drawable
    public /* bridge */ /* synthetic */ int getMinimumWidth() {
        return super.getMinimumWidth();
    }

    @Override // androidx.appcompat.graphics.drawable.b, android.graphics.drawable.Drawable
    public /* bridge */ /* synthetic */ int getOpacity() {
        return super.getOpacity();
    }

    @Override // androidx.appcompat.graphics.drawable.b, android.graphics.drawable.Drawable
    @w0(21)
    public /* bridge */ /* synthetic */ void getOutline(@n0 Outline outline) {
        super.getOutline(outline);
    }

    @Override // androidx.appcompat.graphics.drawable.b, android.graphics.drawable.Drawable
    public /* bridge */ /* synthetic */ boolean getPadding(@n0 Rect rect) {
        return super.getPadding(rect);
    }

    @Override // androidx.appcompat.graphics.drawable.e, androidx.appcompat.graphics.drawable.b
    void i(@n0 androidx.appcompat.graphics.drawable.b.d dVar) {
        super.i(dVar);
        if (dVar instanceof c) {
            this.f1904u = (c) dVar;
        }
    }

    @Override // androidx.appcompat.graphics.drawable.b, android.graphics.drawable.Drawable.Callback
    public /* bridge */ /* synthetic */ void invalidateDrawable(@n0 Drawable drawable) {
        super.invalidateDrawable(drawable);
    }

    @Override // androidx.appcompat.graphics.drawable.b, android.graphics.drawable.Drawable
    public /* bridge */ /* synthetic */ boolean isAutoMirrored() {
        return super.isAutoMirrored();
    }

    @Override // androidx.appcompat.graphics.drawable.e, androidx.appcompat.graphics.drawable.b, android.graphics.drawable.Drawable
    public boolean isStateful() {
        return true;
    }

    @Override // androidx.appcompat.graphics.drawable.b, android.graphics.drawable.Drawable
    public void jumpToCurrentState() {
        super.jumpToCurrentState();
        g gVar = this.f1905v;
        if (gVar != null) {
            gVar.d();
            this.f1905v = null;
            h(this.f1906w);
            this.f1906w = -1;
            this.f1907x = -1;
        }
    }

    @Override // androidx.appcompat.graphics.drawable.b
    public /* bridge */ /* synthetic */ void k(int i10) {
        super.k(i10);
    }

    @Override // androidx.appcompat.graphics.drawable.b
    public /* bridge */ /* synthetic */ void l(int i10) {
        super.l(i10);
    }

    @Override // androidx.appcompat.graphics.drawable.e, androidx.appcompat.graphics.drawable.b, android.graphics.drawable.Drawable
    @n0
    public Drawable mutate() {
        if (!this.f1908y && super.mutate() == this) {
            this.f1904u.v();
            this.f1908y = true;
        }
        return this;
    }

    @Override // androidx.appcompat.graphics.drawable.e
    public /* bridge */ /* synthetic */ void n(int[] iArr, Drawable drawable) {
        super.n(iArr, drawable);
    }

    @Override // androidx.appcompat.graphics.drawable.b, android.graphics.drawable.Drawable
    public /* bridge */ /* synthetic */ boolean onLayoutDirectionChanged(int i10) {
        return super.onLayoutDirectionChanged(i10);
    }

    @Override // androidx.appcompat.graphics.drawable.e, androidx.appcompat.graphics.drawable.b, android.graphics.drawable.Drawable
    protected boolean onStateChange(@n0 int[] iArr) {
        int iJ = this.f1904u.J(iArr);
        boolean z10 = iJ != d() && (G(iJ) || h(iJ));
        Drawable current = getCurrent();
        return current != null ? z10 | current.setState(iArr) : z10;
    }

    @Override // androidx.appcompat.graphics.drawable.b, android.graphics.drawable.Drawable.Callback
    public /* bridge */ /* synthetic */ void scheduleDrawable(@n0 Drawable drawable, @n0 Runnable runnable, long j10) {
        super.scheduleDrawable(drawable, runnable, j10);
    }

    @Override // androidx.appcompat.graphics.drawable.b, android.graphics.drawable.Drawable
    public /* bridge */ /* synthetic */ void setAlpha(int i10) {
        super.setAlpha(i10);
    }

    @Override // androidx.appcompat.graphics.drawable.b, android.graphics.drawable.Drawable
    public /* bridge */ /* synthetic */ void setAutoMirrored(boolean z10) {
        super.setAutoMirrored(z10);
    }

    @Override // androidx.appcompat.graphics.drawable.b, android.graphics.drawable.Drawable
    public /* bridge */ /* synthetic */ void setColorFilter(ColorFilter colorFilter) {
        super.setColorFilter(colorFilter);
    }

    @Override // androidx.appcompat.graphics.drawable.b, android.graphics.drawable.Drawable
    public /* bridge */ /* synthetic */ void setDither(boolean z10) {
        super.setDither(z10);
    }

    @Override // androidx.appcompat.graphics.drawable.b, android.graphics.drawable.Drawable
    public /* bridge */ /* synthetic */ void setHotspot(float f10, float f11) {
        super.setHotspot(f10, f11);
    }

    @Override // androidx.appcompat.graphics.drawable.b, android.graphics.drawable.Drawable
    public /* bridge */ /* synthetic */ void setHotspotBounds(int i10, int i11, int i12, int i13) {
        super.setHotspotBounds(i10, i11, i12, i13);
    }

    @Override // androidx.appcompat.graphics.drawable.b, android.graphics.drawable.Drawable, androidx.core.graphics.drawable.p
    public /* bridge */ /* synthetic */ void setTint(@l int i10) {
        super.setTint(i10);
    }

    @Override // androidx.appcompat.graphics.drawable.b, android.graphics.drawable.Drawable, androidx.core.graphics.drawable.p
    public /* bridge */ /* synthetic */ void setTintList(ColorStateList colorStateList) {
        super.setTintList(colorStateList);
    }

    @Override // androidx.appcompat.graphics.drawable.b, android.graphics.drawable.Drawable, androidx.core.graphics.drawable.p
    public /* bridge */ /* synthetic */ void setTintMode(@n0 PorterDuff.Mode mode) {
        super.setTintMode(mode);
    }

    @Override // androidx.appcompat.graphics.drawable.b, android.graphics.drawable.Drawable
    public boolean setVisible(boolean z10, boolean z11) {
        boolean visible = super.setVisible(z10, z11);
        g gVar = this.f1905v;
        if (gVar != null && (visible || z11)) {
            if (z10) {
                gVar.c();
            } else {
                jumpToCurrentState();
            }
        }
        return visible;
    }

    @Override // androidx.appcompat.graphics.drawable.b, android.graphics.drawable.Drawable.Callback
    public /* bridge */ /* synthetic */ void unscheduleDrawable(@n0 Drawable drawable, @n0 Runnable runnable) {
        super.unscheduleDrawable(drawable, runnable);
    }

    @Override // androidx.appcompat.graphics.drawable.e
    public void v(@n0 Context context, @n0 Resources resources, @n0 XmlPullParser xmlPullParser, @n0 AttributeSet attributeSet, @p0 Resources.Theme theme) throws XmlPullParserException, IOException {
        TypedArray typedArrayS = q.s(resources, theme, attributeSet, R.styleable.f1981a);
        setVisible(typedArrayS.getBoolean(R.styleable.AnimatedStateListDrawableCompat_android_visible, true), true);
        x(typedArrayS);
        m(resources);
        typedArrayS.recycle();
        w(context, resources, xmlPullParser, attributeSet, theme);
        D();
    }

    public void y(@n0 int[] iArr, @n0 Drawable drawable, int i10) {
        j.d(drawable);
        this.f1904u.F(iArr, drawable, i10);
        onStateChange(getState());
    }

    public <T extends Drawable & Animatable> void z(int i10, int i11, @n0 T t10, boolean z10) {
        j.d(t10);
        this.f1904u.G(i10, i11, t10, z10);
    }
}
