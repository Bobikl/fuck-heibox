package androidx.appcompat.graphics.drawable;

import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Outline;
import android.graphics.PorterDuff;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.os.SystemClock;
import android.util.SparseArray;
import androidx.annotation.RestrictTo;
import androidx.annotation.l;
import androidx.annotation.n0;
import androidx.annotation.p0;
import androidx.annotation.w0;

/* JADX INFO: compiled from: DrawableContainer.java */
/* JADX INFO: loaded from: classes.dex */
@RestrictTo({RestrictTo.Scope.LIBRARY_GROUP_PREFIX})
public class b extends Drawable implements Drawable.Callback {

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private static final boolean f1916n = false;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    private static final String f1917o = "DrawableContainer";

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    private static final boolean f1918p = true;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private d f1919b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private Rect f1920c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private Drawable f1921d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private Drawable f1922e;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private boolean f1924g;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private boolean f1926i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private Runnable f1927j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private long f1928k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private long f1929l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private c f1930m;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private int f1923f = 255;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private int f1925h = -1;

    /* JADX INFO: compiled from: DrawableContainer.java */
    public class a implements Runnable {
        a() {
        }

        @Override // java.lang.Runnable
        public void run() {
            b.this.a(true);
            b.this.invalidateSelf();
        }
    }

    /* JADX INFO: renamed from: androidx.appcompat.graphics.drawable.b$b, reason: collision with other inner class name */
    /* JADX INFO: compiled from: DrawableContainer.java */
    @w0(21)
    public static class C0015b {
        private C0015b() {
        }

        public static boolean a(Drawable.ConstantState constantState) {
            return constantState.canApplyTheme();
        }

        public static void b(Drawable drawable, Outline outline) {
            drawable.getOutline(outline);
        }

        public static Resources c(Resources.Theme theme) {
            return theme.getResources();
        }
    }

    /* JADX INFO: compiled from: DrawableContainer.java */
    public static class c implements Drawable.Callback {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private Drawable.Callback f1932b;

        c() {
        }

        public Drawable.Callback a() {
            Drawable.Callback callback = this.f1932b;
            this.f1932b = null;
            return callback;
        }

        public c b(Drawable.Callback callback) {
            this.f1932b = callback;
            return this;
        }

        @Override // android.graphics.drawable.Drawable.Callback
        public void invalidateDrawable(@n0 Drawable drawable) {
        }

        @Override // android.graphics.drawable.Drawable.Callback
        public void scheduleDrawable(@n0 Drawable drawable, @n0 Runnable runnable, long j10) {
            Drawable.Callback callback = this.f1932b;
            if (callback != null) {
                callback.scheduleDrawable(drawable, runnable, j10);
            }
        }

        @Override // android.graphics.drawable.Drawable.Callback
        public void unscheduleDrawable(@n0 Drawable drawable, @n0 Runnable runnable) {
            Drawable.Callback callback = this.f1932b;
            if (callback != null) {
                callback.unscheduleDrawable(drawable, runnable);
            }
        }
    }

    /* JADX INFO: compiled from: DrawableContainer.java */
    public static abstract class d extends Drawable.ConstantState {
        int A;
        int B;
        boolean C;
        ColorFilter D;
        boolean E;
        ColorStateList F;
        PorterDuff.Mode G;
        boolean H;
        boolean I;

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final b f1933a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        Resources f1934b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        int f1935c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        int f1936d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f1937e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        SparseArray<Drawable.ConstantState> f1938f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        Drawable[] f1939g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        int f1940h;

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        boolean f1941i;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        boolean f1942j;

        /* JADX INFO: renamed from: k, reason: collision with root package name */
        Rect f1943k;

        /* JADX INFO: renamed from: l, reason: collision with root package name */
        boolean f1944l;

        /* JADX INFO: renamed from: m, reason: collision with root package name */
        boolean f1945m;

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        int f1946n;

        /* JADX INFO: renamed from: o, reason: collision with root package name */
        int f1947o;

        /* JADX INFO: renamed from: p, reason: collision with root package name */
        int f1948p;

        /* JADX INFO: renamed from: q, reason: collision with root package name */
        int f1949q;

        /* JADX INFO: renamed from: r, reason: collision with root package name */
        boolean f1950r;

        /* JADX INFO: renamed from: s, reason: collision with root package name */
        int f1951s;

        /* JADX INFO: renamed from: t, reason: collision with root package name */
        boolean f1952t;

        /* JADX INFO: renamed from: u, reason: collision with root package name */
        boolean f1953u;

        /* JADX INFO: renamed from: v, reason: collision with root package name */
        boolean f1954v;

        /* JADX INFO: renamed from: w, reason: collision with root package name */
        boolean f1955w;

        /* JADX INFO: renamed from: x, reason: collision with root package name */
        boolean f1956x;

        /* JADX INFO: renamed from: y, reason: collision with root package name */
        boolean f1957y;

        /* JADX INFO: renamed from: z, reason: collision with root package name */
        int f1958z;

        d(d dVar, b bVar, Resources resources) {
            this.f1941i = false;
            this.f1944l = false;
            this.f1956x = true;
            this.A = 0;
            this.B = 0;
            this.f1933a = bVar;
            this.f1934b = resources != null ? resources : dVar != null ? dVar.f1934b : null;
            int iG = b.g(resources, dVar != null ? dVar.f1935c : 0);
            this.f1935c = iG;
            if (dVar == null) {
                this.f1939g = new Drawable[10];
                this.f1940h = 0;
                return;
            }
            this.f1936d = dVar.f1936d;
            this.f1937e = dVar.f1937e;
            this.f1954v = true;
            this.f1955w = true;
            this.f1941i = dVar.f1941i;
            this.f1944l = dVar.f1944l;
            this.f1956x = dVar.f1956x;
            this.f1957y = dVar.f1957y;
            this.f1958z = dVar.f1958z;
            this.A = dVar.A;
            this.B = dVar.B;
            this.C = dVar.C;
            this.D = dVar.D;
            this.E = dVar.E;
            this.F = dVar.F;
            this.G = dVar.G;
            this.H = dVar.H;
            this.I = dVar.I;
            if (dVar.f1935c == iG) {
                if (dVar.f1942j) {
                    this.f1943k = dVar.f1943k != null ? new Rect(dVar.f1943k) : null;
                    this.f1942j = true;
                }
                if (dVar.f1945m) {
                    this.f1946n = dVar.f1946n;
                    this.f1947o = dVar.f1947o;
                    this.f1948p = dVar.f1948p;
                    this.f1949q = dVar.f1949q;
                    this.f1945m = true;
                }
            }
            if (dVar.f1950r) {
                this.f1951s = dVar.f1951s;
                this.f1950r = true;
            }
            if (dVar.f1952t) {
                this.f1953u = dVar.f1953u;
                this.f1952t = true;
            }
            Drawable[] drawableArr = dVar.f1939g;
            this.f1939g = new Drawable[drawableArr.length];
            this.f1940h = dVar.f1940h;
            SparseArray<Drawable.ConstantState> sparseArray = dVar.f1938f;
            if (sparseArray != null) {
                this.f1938f = sparseArray.clone();
            } else {
                this.f1938f = new SparseArray<>(this.f1940h);
            }
            int i10 = this.f1940h;
            for (int i11 = 0; i11 < i10; i11++) {
                Drawable drawable = drawableArr[i11];
                if (drawable != null) {
                    Drawable.ConstantState constantState = drawable.getConstantState();
                    if (constantState != null) {
                        this.f1938f.put(i11, constantState);
                    } else {
                        this.f1939g[i11] = drawableArr[i11];
                    }
                }
            }
        }

        private void f() {
            SparseArray<Drawable.ConstantState> sparseArray = this.f1938f;
            if (sparseArray != null) {
                int size = sparseArray.size();
                for (int i10 = 0; i10 < size; i10++) {
                    this.f1939g[this.f1938f.keyAt(i10)] = w(this.f1938f.valueAt(i10).newDrawable(this.f1934b));
                }
                this.f1938f = null;
            }
        }

        private Drawable w(Drawable drawable) {
            androidx.core.graphics.drawable.d.m(drawable, this.f1958z);
            Drawable drawableMutate = drawable.mutate();
            drawableMutate.setCallback(this.f1933a);
            return drawableMutate;
        }

        final boolean A(int i10, int i11) {
            int i12 = this.f1940h;
            Drawable[] drawableArr = this.f1939g;
            boolean z10 = false;
            for (int i13 = 0; i13 < i12; i13++) {
                Drawable drawable = drawableArr[i13];
                if (drawable != null) {
                    boolean zM = androidx.core.graphics.drawable.d.m(drawable, i10);
                    if (i13 == i11) {
                        z10 = zM;
                    }
                }
            }
            this.f1958z = i10;
            return z10;
        }

        public final void B(boolean z10) {
            this.f1941i = z10;
        }

        final void C(Resources resources) {
            if (resources != null) {
                this.f1934b = resources;
                int iG = b.g(resources, this.f1935c);
                int i10 = this.f1935c;
                this.f1935c = iG;
                if (i10 != iG) {
                    this.f1945m = false;
                    this.f1942j = false;
                }
            }
        }

        public final int a(Drawable drawable) {
            int i10 = this.f1940h;
            if (i10 >= this.f1939g.length) {
                r(i10, i10 + 10);
            }
            drawable.mutate();
            drawable.setVisible(false, true);
            drawable.setCallback(this.f1933a);
            this.f1939g[i10] = drawable;
            this.f1940h++;
            this.f1937e = drawable.getChangingConfigurations() | this.f1937e;
            s();
            this.f1943k = null;
            this.f1942j = false;
            this.f1945m = false;
            this.f1954v = false;
            return i10;
        }

        @w0(21)
        final void b(Resources.Theme theme) {
            if (theme != null) {
                f();
                int i10 = this.f1940h;
                Drawable[] drawableArr = this.f1939g;
                for (int i11 = 0; i11 < i10; i11++) {
                    Drawable drawable = drawableArr[i11];
                    if (drawable != null && androidx.core.graphics.drawable.d.b(drawable)) {
                        androidx.core.graphics.drawable.d.a(drawableArr[i11], theme);
                        this.f1937e |= drawableArr[i11].getChangingConfigurations();
                    }
                }
                C(C0015b.c(theme));
            }
        }

        public boolean c() {
            if (this.f1954v) {
                return this.f1955w;
            }
            f();
            this.f1954v = true;
            int i10 = this.f1940h;
            Drawable[] drawableArr = this.f1939g;
            for (int i11 = 0; i11 < i10; i11++) {
                if (drawableArr[i11].getConstantState() == null) {
                    this.f1955w = false;
                    return false;
                }
            }
            this.f1955w = true;
            return true;
        }

        @Override // android.graphics.drawable.Drawable.ConstantState
        @w0(21)
        public boolean canApplyTheme() {
            int i10 = this.f1940h;
            Drawable[] drawableArr = this.f1939g;
            for (int i11 = 0; i11 < i10; i11++) {
                Drawable drawable = drawableArr[i11];
                if (drawable == null) {
                    Drawable.ConstantState constantState = this.f1938f.get(i11);
                    if (constantState != null && C0015b.a(constantState)) {
                        return true;
                    }
                } else if (androidx.core.graphics.drawable.d.b(drawable)) {
                    return true;
                }
            }
            return false;
        }

        final void d() {
            this.f1957y = false;
        }

        protected void e() {
            this.f1945m = true;
            f();
            int i10 = this.f1940h;
            Drawable[] drawableArr = this.f1939g;
            this.f1947o = -1;
            this.f1946n = -1;
            this.f1949q = 0;
            this.f1948p = 0;
            for (int i11 = 0; i11 < i10; i11++) {
                Drawable drawable = drawableArr[i11];
                int intrinsicWidth = drawable.getIntrinsicWidth();
                if (intrinsicWidth > this.f1946n) {
                    this.f1946n = intrinsicWidth;
                }
                int intrinsicHeight = drawable.getIntrinsicHeight();
                if (intrinsicHeight > this.f1947o) {
                    this.f1947o = intrinsicHeight;
                }
                int minimumWidth = drawable.getMinimumWidth();
                if (minimumWidth > this.f1948p) {
                    this.f1948p = minimumWidth;
                }
                int minimumHeight = drawable.getMinimumHeight();
                if (minimumHeight > this.f1949q) {
                    this.f1949q = minimumHeight;
                }
            }
        }

        final int g() {
            return this.f1939g.length;
        }

        @Override // android.graphics.drawable.Drawable.ConstantState
        public int getChangingConfigurations() {
            return this.f1936d | this.f1937e;
        }

        public final Drawable h(int i10) {
            int iIndexOfKey;
            Drawable drawable = this.f1939g[i10];
            if (drawable != null) {
                return drawable;
            }
            SparseArray<Drawable.ConstantState> sparseArray = this.f1938f;
            if (sparseArray == null || (iIndexOfKey = sparseArray.indexOfKey(i10)) < 0) {
                return null;
            }
            Drawable drawableW = w(this.f1938f.valueAt(iIndexOfKey).newDrawable(this.f1934b));
            this.f1939g[i10] = drawableW;
            this.f1938f.removeAt(iIndexOfKey);
            if (this.f1938f.size() == 0) {
                this.f1938f = null;
            }
            return drawableW;
        }

        public final int i() {
            return this.f1940h;
        }

        public final int j() {
            if (!this.f1945m) {
                e();
            }
            return this.f1947o;
        }

        public final int k() {
            if (!this.f1945m) {
                e();
            }
            return this.f1949q;
        }

        public final int l() {
            if (!this.f1945m) {
                e();
            }
            return this.f1948p;
        }

        public final Rect m() {
            Rect rect = null;
            if (this.f1941i) {
                return null;
            }
            Rect rect2 = this.f1943k;
            if (rect2 != null || this.f1942j) {
                return rect2;
            }
            f();
            Rect rect3 = new Rect();
            int i10 = this.f1940h;
            Drawable[] drawableArr = this.f1939g;
            for (int i11 = 0; i11 < i10; i11++) {
                if (drawableArr[i11].getPadding(rect3)) {
                    if (rect == null) {
                        rect = new Rect(0, 0, 0, 0);
                    }
                    int i12 = rect3.left;
                    if (i12 > rect.left) {
                        rect.left = i12;
                    }
                    int i13 = rect3.top;
                    if (i13 > rect.top) {
                        rect.top = i13;
                    }
                    int i14 = rect3.right;
                    if (i14 > rect.right) {
                        rect.right = i14;
                    }
                    int i15 = rect3.bottom;
                    if (i15 > rect.bottom) {
                        rect.bottom = i15;
                    }
                }
            }
            this.f1942j = true;
            this.f1943k = rect;
            return rect;
        }

        public final int n() {
            if (!this.f1945m) {
                e();
            }
            return this.f1946n;
        }

        public final int o() {
            return this.A;
        }

        public final int p() {
            return this.B;
        }

        public final int q() {
            if (this.f1950r) {
                return this.f1951s;
            }
            f();
            int i10 = this.f1940h;
            Drawable[] drawableArr = this.f1939g;
            int opacity = i10 > 0 ? drawableArr[0].getOpacity() : -2;
            for (int i11 = 1; i11 < i10; i11++) {
                opacity = Drawable.resolveOpacity(opacity, drawableArr[i11].getOpacity());
            }
            this.f1951s = opacity;
            this.f1950r = true;
            return opacity;
        }

        public void r(int i10, int i11) {
            Drawable[] drawableArr = new Drawable[i11];
            Drawable[] drawableArr2 = this.f1939g;
            if (drawableArr2 != null) {
                System.arraycopy(drawableArr2, 0, drawableArr, 0, i10);
            }
            this.f1939g = drawableArr;
        }

        void s() {
            this.f1950r = false;
            this.f1952t = false;
        }

        public final boolean t() {
            return this.f1944l;
        }

        public final boolean u() {
            if (this.f1952t) {
                return this.f1953u;
            }
            f();
            int i10 = this.f1940h;
            Drawable[] drawableArr = this.f1939g;
            boolean z10 = false;
            for (int i11 = 0; i11 < i10; i11++) {
                if (drawableArr[i11].isStateful()) {
                    z10 = true;
                    break;
                }
            }
            this.f1953u = z10;
            this.f1952t = true;
            return z10;
        }

        void v() {
            int i10 = this.f1940h;
            Drawable[] drawableArr = this.f1939g;
            for (int i11 = 0; i11 < i10; i11++) {
                Drawable drawable = drawableArr[i11];
                if (drawable != null) {
                    drawable.mutate();
                }
            }
            this.f1957y = true;
        }

        public final void x(boolean z10) {
            this.f1944l = z10;
        }

        public final void y(int i10) {
            this.A = i10;
        }

        public final void z(int i10) {
            this.B = i10;
        }
    }

    b() {
    }

    private void e(Drawable drawable) {
        if (this.f1930m == null) {
            this.f1930m = new c();
        }
        drawable.setCallback(this.f1930m.b(drawable.getCallback()));
        try {
            if (this.f1919b.A <= 0 && this.f1924g) {
                drawable.setAlpha(this.f1923f);
            }
            d dVar = this.f1919b;
            if (dVar.E) {
                drawable.setColorFilter(dVar.D);
            } else {
                if (dVar.H) {
                    androidx.core.graphics.drawable.d.o(drawable, dVar.F);
                }
                d dVar2 = this.f1919b;
                if (dVar2.I) {
                    androidx.core.graphics.drawable.d.p(drawable, dVar2.G);
                }
            }
            drawable.setVisible(isVisible(), true);
            drawable.setDither(this.f1919b.f1956x);
            drawable.setState(getState());
            drawable.setLevel(getLevel());
            drawable.setBounds(getBounds());
            androidx.core.graphics.drawable.d.m(drawable, androidx.core.graphics.drawable.d.f(this));
            androidx.core.graphics.drawable.d.j(drawable, this.f1919b.C);
            Rect rect = this.f1920c;
            if (rect != null) {
                androidx.core.graphics.drawable.d.l(drawable, rect.left, rect.top, rect.right, rect.bottom);
            }
        } finally {
            drawable.setCallback(this.f1930m.a());
        }
    }

    private boolean f() {
        return isAutoMirrored() && androidx.core.graphics.drawable.d.f(this) == 1;
    }

    static int g(@p0 Resources resources, int i10) {
        if (resources != null) {
            i10 = resources.getDisplayMetrics().densityDpi;
        }
        if (i10 == 0) {
            return 160;
        }
        return i10;
    }

    /* JADX WARN: Code duplicated, block: B:14:0x003d  */
    /* JADX WARN: Code duplicated, block: B:16:0x0043  */
    /* JADX WARN: Code duplicated, block: B:18:0x0047  */
    /* JADX WARN: Code duplicated, block: B:19:0x0050  */
    /* JADX WARN: Code duplicated, block: B:20:0x0061  */
    /* JADX WARN: Code duplicated, block: B:23:0x0066 A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:26:? A[ADDED_TO_REGION, RETURN, SYNTHETIC] */
    void a(boolean z10) {
        boolean z11;
        Drawable drawable;
        long j10;
        boolean z12 = true;
        this.f1924g = true;
        long jUptimeMillis = SystemClock.uptimeMillis();
        Drawable drawable2 = this.f1921d;
        if (drawable2 != null) {
            long j11 = this.f1928k;
            if (j11 != 0) {
                if (j11 <= jUptimeMillis) {
                    drawable2.setAlpha(this.f1923f);
                    this.f1928k = 0L;
                } else {
                    drawable2.setAlpha(((255 - (((int) ((j11 - jUptimeMillis) * 255)) / this.f1919b.A)) * this.f1923f) / 255);
                    z11 = true;
                }
            }
            drawable = this.f1922e;
            if (drawable != null) {
                j10 = this.f1929l;
                if (j10 == 0) {
                    if (j10 <= jUptimeMillis) {
                        drawable.setVisible(false, false);
                        this.f1922e = null;
                        this.f1929l = 0L;
                    } else {
                        drawable.setAlpha(((((int) ((j10 - jUptimeMillis) * 255)) / this.f1919b.B) * this.f1923f) / 255);
                    }
                }
                if (z10 || !z12) {
                }
                scheduleSelf(this.f1927j, jUptimeMillis + 16);
                return;
            }
            this.f1929l = 0L;
            z12 = z11;
            if (z10) {
            }
        }
        this.f1928k = 0L;
        z11 = false;
        drawable = this.f1922e;
        if (drawable != null) {
            j10 = this.f1929l;
            if (j10 == 0) {
                if (j10 <= jUptimeMillis) {
                    drawable.setVisible(false, false);
                    this.f1922e = null;
                    this.f1929l = 0L;
                } else {
                    drawable.setAlpha(((((int) ((j10 - jUptimeMillis) * 255)) / this.f1919b.B) * this.f1923f) / 255);
                }
            }
            if (z10) {
            }
        }
        this.f1929l = 0L;
        z12 = z11;
        if (z10) {
        }
    }

    @Override // android.graphics.drawable.Drawable
    @w0(21)
    public void applyTheme(@n0 Resources.Theme theme) {
        this.f1919b.b(theme);
    }

    void b() {
        this.f1919b.d();
        this.f1926i = false;
    }

    d c() {
        return this.f1919b;
    }

    @Override // android.graphics.drawable.Drawable
    @w0(21)
    public boolean canApplyTheme() {
        return this.f1919b.canApplyTheme();
    }

    int d() {
        return this.f1925h;
    }

    @Override // android.graphics.drawable.Drawable
    public void draw(@n0 Canvas canvas) {
        Drawable drawable = this.f1921d;
        if (drawable != null) {
            drawable.draw(canvas);
        }
        Drawable drawable2 = this.f1922e;
        if (drawable2 != null) {
            drawable2.draw(canvas);
        }
    }

    @Override // android.graphics.drawable.Drawable
    public int getAlpha() {
        return this.f1923f;
    }

    @Override // android.graphics.drawable.Drawable
    public int getChangingConfigurations() {
        return super.getChangingConfigurations() | this.f1919b.getChangingConfigurations();
    }

    @Override // android.graphics.drawable.Drawable
    public final Drawable.ConstantState getConstantState() {
        if (!this.f1919b.c()) {
            return null;
        }
        this.f1919b.f1936d = getChangingConfigurations();
        return this.f1919b;
    }

    @Override // android.graphics.drawable.Drawable
    @n0
    public Drawable getCurrent() {
        return this.f1921d;
    }

    @Override // android.graphics.drawable.Drawable
    public void getHotspotBounds(@n0 Rect rect) {
        Rect rect2 = this.f1920c;
        if (rect2 != null) {
            rect.set(rect2);
        } else {
            super.getHotspotBounds(rect);
        }
    }

    @Override // android.graphics.drawable.Drawable
    public int getIntrinsicHeight() {
        if (this.f1919b.t()) {
            return this.f1919b.j();
        }
        Drawable drawable = this.f1921d;
        if (drawable != null) {
            return drawable.getIntrinsicHeight();
        }
        return -1;
    }

    @Override // android.graphics.drawable.Drawable
    public int getIntrinsicWidth() {
        if (this.f1919b.t()) {
            return this.f1919b.n();
        }
        Drawable drawable = this.f1921d;
        if (drawable != null) {
            return drawable.getIntrinsicWidth();
        }
        return -1;
    }

    @Override // android.graphics.drawable.Drawable
    public int getMinimumHeight() {
        if (this.f1919b.t()) {
            return this.f1919b.k();
        }
        Drawable drawable = this.f1921d;
        if (drawable != null) {
            return drawable.getMinimumHeight();
        }
        return 0;
    }

    @Override // android.graphics.drawable.Drawable
    public int getMinimumWidth() {
        if (this.f1919b.t()) {
            return this.f1919b.l();
        }
        Drawable drawable = this.f1921d;
        if (drawable != null) {
            return drawable.getMinimumWidth();
        }
        return 0;
    }

    @Override // android.graphics.drawable.Drawable
    public int getOpacity() {
        Drawable drawable = this.f1921d;
        if (drawable == null || !drawable.isVisible()) {
            return -2;
        }
        return this.f1919b.q();
    }

    @Override // android.graphics.drawable.Drawable
    @w0(21)
    public void getOutline(@n0 Outline outline) {
        Drawable drawable = this.f1921d;
        if (drawable != null) {
            C0015b.b(drawable, outline);
        }
    }

    @Override // android.graphics.drawable.Drawable
    public boolean getPadding(@n0 Rect rect) {
        boolean padding;
        Rect rectM = this.f1919b.m();
        if (rectM != null) {
            rect.set(rectM);
            padding = (rectM.right | ((rectM.left | rectM.top) | rectM.bottom)) != 0;
        } else {
            Drawable drawable = this.f1921d;
            padding = drawable != null ? drawable.getPadding(rect) : super.getPadding(rect);
        }
        if (f()) {
            int i10 = rect.left;
            rect.left = rect.right;
            rect.right = i10;
        }
        return padding;
    }

    /* JADX WARN: Code duplicated, block: B:26:0x0055  */
    boolean h(int i10) {
        if (i10 == this.f1925h) {
            return false;
        }
        long jUptimeMillis = SystemClock.uptimeMillis();
        if (this.f1919b.B > 0) {
            Drawable drawable = this.f1922e;
            if (drawable != null) {
                drawable.setVisible(false, false);
            }
            Drawable drawable2 = this.f1921d;
            if (drawable2 != null) {
                this.f1922e = drawable2;
                this.f1929l = ((long) this.f1919b.B) + jUptimeMillis;
            } else {
                this.f1922e = null;
                this.f1929l = 0L;
            }
        } else {
            Drawable drawable3 = this.f1921d;
            if (drawable3 != null) {
                drawable3.setVisible(false, false);
            }
        }
        if (i10 >= 0) {
            d dVar = this.f1919b;
            if (i10 < dVar.f1940h) {
                Drawable drawableH = dVar.h(i10);
                this.f1921d = drawableH;
                this.f1925h = i10;
                if (drawableH != null) {
                    int i11 = this.f1919b.A;
                    if (i11 > 0) {
                        this.f1928k = jUptimeMillis + ((long) i11);
                    }
                    e(drawableH);
                }
            } else {
                this.f1921d = null;
                this.f1925h = -1;
            }
        } else {
            this.f1921d = null;
            this.f1925h = -1;
        }
        if (this.f1928k != 0 || this.f1929l != 0) {
            Runnable runnable = this.f1927j;
            if (runnable == null) {
                this.f1927j = new a();
            } else {
                unscheduleSelf(runnable);
            }
            a(true);
        }
        invalidateSelf();
        return true;
    }

    void i(d dVar) {
        this.f1919b = dVar;
        int i10 = this.f1925h;
        if (i10 >= 0) {
            Drawable drawableH = dVar.h(i10);
            this.f1921d = drawableH;
            if (drawableH != null) {
                e(drawableH);
            }
        }
        this.f1922e = null;
    }

    public void invalidateDrawable(@n0 Drawable drawable) {
        d dVar = this.f1919b;
        if (dVar != null) {
            dVar.s();
        }
        if (drawable != this.f1921d || getCallback() == null) {
            return;
        }
        getCallback().invalidateDrawable(this);
    }

    @Override // android.graphics.drawable.Drawable
    public boolean isAutoMirrored() {
        return this.f1919b.C;
    }

    @Override // android.graphics.drawable.Drawable
    public boolean isStateful() {
        return this.f1919b.u();
    }

    void j(int i10) {
        h(i10);
    }

    @Override // android.graphics.drawable.Drawable
    public void jumpToCurrentState() {
        boolean z10;
        Drawable drawable = this.f1922e;
        boolean z11 = true;
        if (drawable != null) {
            drawable.jumpToCurrentState();
            this.f1922e = null;
            z10 = true;
        } else {
            z10 = false;
        }
        Drawable drawable2 = this.f1921d;
        if (drawable2 != null) {
            drawable2.jumpToCurrentState();
            if (this.f1924g) {
                this.f1921d.setAlpha(this.f1923f);
            }
        }
        if (this.f1929l != 0) {
            this.f1929l = 0L;
            z10 = true;
        }
        if (this.f1928k != 0) {
            this.f1928k = 0L;
        } else {
            z11 = z10;
        }
        if (z11) {
            invalidateSelf();
        }
    }

    public void k(int i10) {
        this.f1919b.A = i10;
    }

    public void l(int i10) {
        this.f1919b.B = i10;
    }

    final void m(Resources resources) {
        this.f1919b.C(resources);
    }

    @Override // android.graphics.drawable.Drawable
    public Drawable mutate() {
        if (!this.f1926i && super.mutate() == this) {
            d dVarC = c();
            dVarC.v();
            i(dVarC);
            this.f1926i = true;
        }
        return this;
    }

    @Override // android.graphics.drawable.Drawable
    protected void onBoundsChange(Rect rect) {
        Drawable drawable = this.f1922e;
        if (drawable != null) {
            drawable.setBounds(rect);
        }
        Drawable drawable2 = this.f1921d;
        if (drawable2 != null) {
            drawable2.setBounds(rect);
        }
    }

    @Override // android.graphics.drawable.Drawable
    public boolean onLayoutDirectionChanged(int i10) {
        return this.f1919b.A(i10, d());
    }

    @Override // android.graphics.drawable.Drawable
    protected boolean onLevelChange(int i10) {
        Drawable drawable = this.f1922e;
        if (drawable != null) {
            return drawable.setLevel(i10);
        }
        Drawable drawable2 = this.f1921d;
        if (drawable2 != null) {
            return drawable2.setLevel(i10);
        }
        return false;
    }

    @Override // android.graphics.drawable.Drawable
    protected boolean onStateChange(@n0 int[] iArr) {
        Drawable drawable = this.f1922e;
        if (drawable != null) {
            return drawable.setState(iArr);
        }
        Drawable drawable2 = this.f1921d;
        if (drawable2 != null) {
            return drawable2.setState(iArr);
        }
        return false;
    }

    public void scheduleDrawable(@n0 Drawable drawable, @n0 Runnable runnable, long j10) {
        if (drawable != this.f1921d || getCallback() == null) {
            return;
        }
        getCallback().scheduleDrawable(this, runnable, j10);
    }

    @Override // android.graphics.drawable.Drawable
    public void setAlpha(int i10) {
        if (this.f1924g && this.f1923f == i10) {
            return;
        }
        this.f1924g = true;
        this.f1923f = i10;
        Drawable drawable = this.f1921d;
        if (drawable != null) {
            if (this.f1928k == 0) {
                drawable.setAlpha(i10);
            } else {
                a(false);
            }
        }
    }

    @Override // android.graphics.drawable.Drawable
    public void setAutoMirrored(boolean z10) {
        d dVar = this.f1919b;
        if (dVar.C != z10) {
            dVar.C = z10;
            Drawable drawable = this.f1921d;
            if (drawable != null) {
                androidx.core.graphics.drawable.d.j(drawable, z10);
            }
        }
    }

    @Override // android.graphics.drawable.Drawable
    public void setColorFilter(ColorFilter colorFilter) {
        d dVar = this.f1919b;
        dVar.E = true;
        if (dVar.D != colorFilter) {
            dVar.D = colorFilter;
            Drawable drawable = this.f1921d;
            if (drawable != null) {
                drawable.setColorFilter(colorFilter);
            }
        }
    }

    @Override // android.graphics.drawable.Drawable
    public void setDither(boolean z10) {
        d dVar = this.f1919b;
        if (dVar.f1956x != z10) {
            dVar.f1956x = z10;
            Drawable drawable = this.f1921d;
            if (drawable != null) {
                drawable.setDither(z10);
            }
        }
    }

    @Override // android.graphics.drawable.Drawable
    public void setHotspot(float f10, float f11) {
        Drawable drawable = this.f1921d;
        if (drawable != null) {
            androidx.core.graphics.drawable.d.k(drawable, f10, f11);
        }
    }

    @Override // android.graphics.drawable.Drawable
    public void setHotspotBounds(int i10, int i11, int i12, int i13) {
        Rect rect = this.f1920c;
        if (rect == null) {
            this.f1920c = new Rect(i10, i11, i12, i13);
        } else {
            rect.set(i10, i11, i12, i13);
        }
        Drawable drawable = this.f1921d;
        if (drawable != null) {
            androidx.core.graphics.drawable.d.l(drawable, i10, i11, i12, i13);
        }
    }

    @Override // android.graphics.drawable.Drawable, androidx.core.graphics.drawable.p
    public void setTint(@l int i10) {
        setTintList(ColorStateList.valueOf(i10));
    }

    @Override // android.graphics.drawable.Drawable, androidx.core.graphics.drawable.p
    public void setTintList(ColorStateList colorStateList) {
        d dVar = this.f1919b;
        dVar.H = true;
        if (dVar.F != colorStateList) {
            dVar.F = colorStateList;
            androidx.core.graphics.drawable.d.o(this.f1921d, colorStateList);
        }
    }

    @Override // android.graphics.drawable.Drawable, androidx.core.graphics.drawable.p
    public void setTintMode(@n0 PorterDuff.Mode mode) {
        d dVar = this.f1919b;
        dVar.I = true;
        if (dVar.G != mode) {
            dVar.G = mode;
            androidx.core.graphics.drawable.d.p(this.f1921d, mode);
        }
    }

    @Override // android.graphics.drawable.Drawable
    public boolean setVisible(boolean z10, boolean z11) {
        boolean visible = super.setVisible(z10, z11);
        Drawable drawable = this.f1922e;
        if (drawable != null) {
            drawable.setVisible(z10, z11);
        }
        Drawable drawable2 = this.f1921d;
        if (drawable2 != null) {
            drawable2.setVisible(z10, z11);
        }
        return visible;
    }

    public void unscheduleDrawable(@n0 Drawable drawable, @n0 Runnable runnable) {
        if (drawable != this.f1921d || getCallback() == null) {
            return;
        }
        getCallback().unscheduleDrawable(this, runnable);
    }
}
