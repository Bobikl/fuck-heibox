package com.airbnb.lottie;

import android.animation.Animator;
import android.animation.ValueAnimator;
import android.annotation.SuppressLint;
import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Matrix;
import android.graphics.Rect;
import android.graphics.Typeface;
import android.graphics.drawable.Animatable;
import android.graphics.drawable.Drawable;
import android.view.View;
import android.widget.ImageView;
import androidx.annotation.RestrictTo;
import androidx.annotation.f0;
import androidx.annotation.k0;
import androidx.annotation.n0;
import androidx.annotation.p0;
import androidx.annotation.w0;
import androidx.annotation.x;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: compiled from: LottieDrawable.java */
/* JADX INFO: loaded from: classes6.dex */
public class j extends Drawable implements Drawable.Callback, Animatable {
    public static final int A = -1;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public static final int f37376y = 1;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    public static final int f37377z = 2;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final Matrix f37378b = new Matrix();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private com.airbnb.lottie.g f37379c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final com.airbnb.lottie.utils.g f37380d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private float f37381e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private boolean f37382f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private boolean f37383g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private boolean f37384h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private final ArrayList<r> f37385i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private final ValueAnimator.AnimatorUpdateListener f37386j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    @p0
    private a4.b f37387k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    @p0
    private String f37388l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    @p0
    private com.airbnb.lottie.d f37389m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    @p0
    private a4.a f37390n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    @p0
    com.airbnb.lottie.c f37391o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    @p0
    v f37392p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    private boolean f37393q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    @p0
    private com.airbnb.lottie.model.layer.b f37394r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    private int f37395s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    private boolean f37396t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    private boolean f37397u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    private boolean f37398v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    private boolean f37399w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    private boolean f37400x;

    /* JADX INFO: compiled from: LottieDrawable.java */
    public class a implements r {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ String f37401a;

        a(String str) {
            this.f37401a = str;
        }

        @Override // com.airbnb.lottie.j.r
        public void a(com.airbnb.lottie.g gVar) {
            j.this.r0(this.f37401a);
        }
    }

    /* JADX INFO: compiled from: LottieDrawable.java */
    public class b implements r {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ String f37403a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ String f37404b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ boolean f37405c;

        b(String str, String str2, boolean z10) {
            this.f37403a = str;
            this.f37404b = str2;
            this.f37405c = z10;
        }

        @Override // com.airbnb.lottie.j.r
        public void a(com.airbnb.lottie.g gVar) {
            j.this.s0(this.f37403a, this.f37404b, this.f37405c);
        }
    }

    /* JADX INFO: compiled from: LottieDrawable.java */
    public class c implements r {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ int f37407a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ int f37408b;

        c(int i10, int i11) {
            this.f37407a = i10;
            this.f37408b = i11;
        }

        @Override // com.airbnb.lottie.j.r
        public void a(com.airbnb.lottie.g gVar) {
            j.this.q0(this.f37407a, this.f37408b);
        }
    }

    /* JADX INFO: compiled from: LottieDrawable.java */
    public class d implements r {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ float f37410a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ float f37411b;

        d(float f10, float f11) {
            this.f37410a = f10;
            this.f37411b = f11;
        }

        @Override // com.airbnb.lottie.j.r
        public void a(com.airbnb.lottie.g gVar) {
            j.this.t0(this.f37410a, this.f37411b);
        }
    }

    /* JADX INFO: compiled from: LottieDrawable.java */
    public class e implements r {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ int f37413a;

        e(int i10) {
            this.f37413a = i10;
        }

        @Override // com.airbnb.lottie.j.r
        public void a(com.airbnb.lottie.g gVar) {
            j.this.j0(this.f37413a);
        }
    }

    /* JADX INFO: compiled from: LottieDrawable.java */
    public class f implements r {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ float f37415a;

        f(float f10) {
            this.f37415a = f10;
        }

        @Override // com.airbnb.lottie.j.r
        public void a(com.airbnb.lottie.g gVar) {
            j.this.z0(this.f37415a);
        }
    }

    /* JADX INFO: compiled from: LottieDrawable.java */
    public class g implements r {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ com.airbnb.lottie.model.d f37417a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ Object f37418b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ com.airbnb.lottie.value.j f37419c;

        g(com.airbnb.lottie.model.d dVar, Object obj, com.airbnb.lottie.value.j jVar) {
            this.f37417a = dVar;
            this.f37418b = obj;
            this.f37419c = jVar;
        }

        @Override // com.airbnb.lottie.j.r
        public void a(com.airbnb.lottie.g gVar) {
            j.this.h(this.f37417a, this.f37418b, this.f37419c);
        }
    }

    /* JADX INFO: Add missing generic type declarations: [T] */
    /* JADX INFO: compiled from: LottieDrawable.java */
    public class h<T> extends com.airbnb.lottie.value.j<T> {

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        final /* synthetic */ com.airbnb.lottie.value.l f37421d;

        h(com.airbnb.lottie.value.l lVar) {
            this.f37421d = lVar;
        }

        @Override // com.airbnb.lottie.value.j
        public T a(com.airbnb.lottie.value.b<T> bVar) {
            return (T) this.f37421d.a(bVar);
        }
    }

    /* JADX INFO: compiled from: LottieDrawable.java */
    public class i implements ValueAnimator.AnimatorUpdateListener {
        i() {
        }

        @Override // android.animation.ValueAnimator.AnimatorUpdateListener
        public void onAnimationUpdate(ValueAnimator valueAnimator) {
            if (j.this.f37394r != null) {
                j.this.f37394r.K(j.this.f37380d.h());
            }
        }
    }

    /* JADX INFO: renamed from: com.airbnb.lottie.j$j, reason: collision with other inner class name */
    /* JADX INFO: compiled from: LottieDrawable.java */
    public class C0286j implements r {
        C0286j() {
        }

        @Override // com.airbnb.lottie.j.r
        public void a(com.airbnb.lottie.g gVar) {
            j.this.X();
        }
    }

    /* JADX INFO: compiled from: LottieDrawable.java */
    public class k implements r {
        k() {
        }

        @Override // com.airbnb.lottie.j.r
        public void a(com.airbnb.lottie.g gVar) {
            j.this.e0();
        }
    }

    /* JADX INFO: compiled from: LottieDrawable.java */
    public class l implements r {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ int f37426a;

        l(int i10) {
            this.f37426a = i10;
        }

        @Override // com.airbnb.lottie.j.r
        public void a(com.airbnb.lottie.g gVar) {
            j.this.u0(this.f37426a);
        }
    }

    /* JADX INFO: compiled from: LottieDrawable.java */
    public class m implements r {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ float f37428a;

        m(float f10) {
            this.f37428a = f10;
        }

        @Override // com.airbnb.lottie.j.r
        public void a(com.airbnb.lottie.g gVar) {
            j.this.w0(this.f37428a);
        }
    }

    /* JADX INFO: compiled from: LottieDrawable.java */
    public class n implements r {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ int f37430a;

        n(int i10) {
            this.f37430a = i10;
        }

        @Override // com.airbnb.lottie.j.r
        public void a(com.airbnb.lottie.g gVar) {
            j.this.n0(this.f37430a);
        }
    }

    /* JADX INFO: compiled from: LottieDrawable.java */
    public class o implements r {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ float f37432a;

        o(float f10) {
            this.f37432a = f10;
        }

        @Override // com.airbnb.lottie.j.r
        public void a(com.airbnb.lottie.g gVar) {
            j.this.p0(this.f37432a);
        }
    }

    /* JADX INFO: compiled from: LottieDrawable.java */
    public class p implements r {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ String f37434a;

        p(String str) {
            this.f37434a = str;
        }

        @Override // com.airbnb.lottie.j.r
        public void a(com.airbnb.lottie.g gVar) {
            j.this.v0(this.f37434a);
        }
    }

    /* JADX INFO: compiled from: LottieDrawable.java */
    public class q implements r {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ String f37436a;

        q(String str) {
            this.f37436a = str;
        }

        @Override // com.airbnb.lottie.j.r
        public void a(com.airbnb.lottie.g gVar) {
            j.this.o0(this.f37436a);
        }
    }

    /* JADX INFO: compiled from: LottieDrawable.java */
    public interface r {
        void a(com.airbnb.lottie.g gVar);
    }

    /* JADX INFO: compiled from: LottieDrawable.java */
    @Retention(RetentionPolicy.SOURCE)
    public @interface s {
    }

    public j() {
        com.airbnb.lottie.utils.g gVar = new com.airbnb.lottie.utils.g();
        this.f37380d = gVar;
        this.f37381e = 1.0f;
        this.f37382f = true;
        this.f37383g = false;
        this.f37384h = false;
        this.f37385i = new ArrayList<>();
        i iVar = new i();
        this.f37386j = iVar;
        this.f37395s = 255;
        this.f37399w = true;
        this.f37400x = false;
        gVar.addUpdateListener(iVar);
    }

    private a4.b C() {
        if (getCallback() == null) {
            return null;
        }
        a4.b bVar = this.f37387k;
        if (bVar != null && !bVar.b(y())) {
            this.f37387k = null;
        }
        if (this.f37387k == null) {
            this.f37387k = new a4.b(getCallback(), this.f37388l, this.f37389m, this.f37379c.j());
        }
        return this.f37387k;
    }

    private float F(@n0 Canvas canvas) {
        return Math.min(canvas.getWidth() / this.f37379c.b().width(), canvas.getHeight() / this.f37379c.b().height());
    }

    private boolean j() {
        return this.f37382f || this.f37383g;
    }

    private float k(Rect rect) {
        return rect.width() / rect.height();
    }

    private boolean l() {
        com.airbnb.lottie.g gVar = this.f37379c;
        return gVar == null || getBounds().isEmpty() || k(getBounds()) == k(gVar.b());
    }

    private void m() {
        com.airbnb.lottie.model.layer.b bVar = new com.airbnb.lottie.model.layer.b(this, com.airbnb.lottie.parser.v.a(this.f37379c), this.f37379c.k(), this.f37379c);
        this.f37394r = bVar;
        if (this.f37397u) {
            bVar.I(true);
        }
    }

    private void r(@n0 Canvas canvas) {
        if (l()) {
            t(canvas);
        } else {
            s(canvas);
        }
    }

    private void s(Canvas canvas) {
        float f10;
        if (this.f37394r == null) {
            return;
        }
        int iSave = -1;
        Rect bounds = getBounds();
        float fWidth = bounds.width() / this.f37379c.b().width();
        float fHeight = bounds.height() / this.f37379c.b().height();
        if (this.f37399w) {
            float fMin = Math.min(fWidth, fHeight);
            if (fMin < 1.0f) {
                f10 = 1.0f / fMin;
                fWidth /= f10;
                fHeight /= f10;
            } else {
                f10 = 1.0f;
            }
            if (f10 > 1.0f) {
                iSave = canvas.save();
                float fWidth2 = bounds.width() / 2.0f;
                float fHeight2 = bounds.height() / 2.0f;
                float f11 = fWidth2 * fMin;
                float f12 = fMin * fHeight2;
                canvas.translate(fWidth2 - f11, fHeight2 - f12);
                canvas.scale(f10, f10, f11, f12);
            }
        }
        this.f37378b.reset();
        this.f37378b.preScale(fWidth, fHeight);
        this.f37394r.c(canvas, this.f37378b, this.f37395s);
        if (iSave > 0) {
            canvas.restoreToCount(iSave);
        }
    }

    private void t(Canvas canvas) {
        float f10;
        if (this.f37394r == null) {
            return;
        }
        float f11 = this.f37381e;
        float F = F(canvas);
        if (f11 > F) {
            f10 = this.f37381e / F;
        } else {
            F = f11;
            f10 = 1.0f;
        }
        int iSave = -1;
        if (f10 > 1.0f) {
            iSave = canvas.save();
            float fWidth = this.f37379c.b().width() / 2.0f;
            float fHeight = this.f37379c.b().height() / 2.0f;
            float f12 = fWidth * F;
            float f13 = fHeight * F;
            canvas.translate((L() * fWidth) - f12, (L() * fHeight) - f13);
            canvas.scale(f10, f10, f12, f13);
        }
        this.f37378b.reset();
        this.f37378b.preScale(F, F);
        this.f37394r.c(canvas, this.f37378b, this.f37395s);
        if (iSave > 0) {
            canvas.restoreToCount(iSave);
        }
    }

    @p0
    private Context y() {
        Drawable.Callback callback = getCallback();
        if (callback != null && (callback instanceof View)) {
            return ((View) callback).getContext();
        }
        return null;
    }

    private a4.a z() {
        if (getCallback() == null) {
            return null;
        }
        if (this.f37390n == null) {
            this.f37390n = new a4.a(getCallback(), this.f37391o);
        }
        return this.f37390n;
    }

    public int A() {
        return (int) this.f37380d.i();
    }

    public void A0(int i10) {
        this.f37380d.setRepeatCount(i10);
    }

    @p0
    public Bitmap B(String str) {
        a4.b bVarC = C();
        if (bVarC != null) {
            return bVarC.a(str);
        }
        com.airbnb.lottie.g gVar = this.f37379c;
        com.airbnb.lottie.k kVar = gVar == null ? null : gVar.j().get(str);
        if (kVar != null) {
            return kVar.a();
        }
        return null;
    }

    public void B0(int i10) {
        this.f37380d.setRepeatMode(i10);
    }

    public void C0(boolean z10) {
        this.f37384h = z10;
    }

    @p0
    public String D() {
        return this.f37388l;
    }

    public void D0(float f10) {
        this.f37381e = f10;
    }

    public float E() {
        return this.f37380d.k();
    }

    public void E0(float f10) {
        this.f37380d.B(f10);
    }

    void F0(Boolean bool) {
        this.f37382f = bool.booleanValue();
    }

    public float G() {
        return this.f37380d.l();
    }

    public void G0(v vVar) {
        this.f37392p = vVar;
    }

    @p0
    public t H() {
        com.airbnb.lottie.g gVar = this.f37379c;
        if (gVar != null) {
            return gVar.o();
        }
        return null;
    }

    @p0
    public Bitmap H0(String str, @p0 Bitmap bitmap) {
        a4.b bVarC = C();
        if (bVarC == null) {
            com.airbnb.lottie.utils.f.e("Cannot update bitmap. Most likely the drawable is not added to a View which prevents Lottie from getting a Context.");
            return null;
        }
        Bitmap bitmapE = bVarC.e(str, bitmap);
        invalidateSelf();
        return bitmapE;
    }

    @x(from = 0.0d, to = com.google.android.material.color.utilities.d.f53848a)
    public float I() {
        return this.f37380d.h();
    }

    public boolean I0() {
        return this.f37392p == null && this.f37379c.c().x() > 0;
    }

    public int J() {
        return this.f37380d.getRepeatCount();
    }

    @SuppressLint({"WrongConstant"})
    public int K() {
        return this.f37380d.getRepeatMode();
    }

    public float L() {
        return this.f37381e;
    }

    public float M() {
        return this.f37380d.m();
    }

    @p0
    public v N() {
        return this.f37392p;
    }

    @p0
    public Typeface O(String str, String str2) {
        a4.a aVarZ = z();
        if (aVarZ != null) {
            return aVarZ.b(str, str2);
        }
        return null;
    }

    public boolean P() {
        com.airbnb.lottie.model.layer.b bVar = this.f37394r;
        return bVar != null && bVar.N();
    }

    public boolean Q() {
        com.airbnb.lottie.model.layer.b bVar = this.f37394r;
        return bVar != null && bVar.O();
    }

    public boolean R() {
        com.airbnb.lottie.utils.g gVar = this.f37380d;
        if (gVar == null) {
            return false;
        }
        return gVar.isRunning();
    }

    public boolean S() {
        return this.f37398v;
    }

    public boolean T() {
        return this.f37380d.getRepeatCount() == -1;
    }

    public boolean U() {
        return this.f37393q;
    }

    @Deprecated
    public void V(boolean z10) {
        this.f37380d.setRepeatCount(z10 ? -1 : 0);
    }

    public void W() {
        this.f37385i.clear();
        this.f37380d.o();
    }

    @k0
    public void X() {
        if (this.f37394r == null) {
            this.f37385i.add(new C0286j());
            return;
        }
        if (j() || J() == 0) {
            this.f37380d.p();
        }
        if (j()) {
            return;
        }
        j0((int) (M() < 0.0f ? G() : E()));
        this.f37380d.g();
    }

    public void Y() {
        this.f37380d.removeAllListeners();
    }

    public void Z() {
        this.f37380d.removeAllUpdateListeners();
        this.f37380d.addUpdateListener(this.f37386j);
    }

    public void a0(Animator.AnimatorListener animatorListener) {
        this.f37380d.removeListener(animatorListener);
    }

    @w0(api = 19)
    public void b0(Animator.AnimatorPauseListener animatorPauseListener) {
        this.f37380d.removePauseListener(animatorPauseListener);
    }

    public void c0(ValueAnimator.AnimatorUpdateListener animatorUpdateListener) {
        this.f37380d.removeUpdateListener(animatorUpdateListener);
    }

    public List<com.airbnb.lottie.model.d> d0(com.airbnb.lottie.model.d dVar) {
        if (this.f37394r == null) {
            com.airbnb.lottie.utils.f.e("Cannot resolve KeyPath. Composition is not set yet.");
            return Collections.emptyList();
        }
        ArrayList arrayList = new ArrayList();
        this.f37394r.g(dVar, 0, arrayList, new com.airbnb.lottie.model.d(new String[0]));
        return arrayList;
    }

    @Override // android.graphics.drawable.Drawable
    public void draw(@n0 Canvas canvas) {
        this.f37400x = false;
        com.airbnb.lottie.e.a("Drawable#draw");
        if (this.f37384h) {
            try {
                r(canvas);
            } catch (Throwable th2) {
                com.airbnb.lottie.utils.f.c("Lottie crashed in draw!", th2);
            }
        } else {
            r(canvas);
        }
        com.airbnb.lottie.e.b("Drawable#draw");
    }

    public void e(Animator.AnimatorListener animatorListener) {
        this.f37380d.addListener(animatorListener);
    }

    @k0
    public void e0() {
        if (this.f37394r == null) {
            this.f37385i.add(new k());
            return;
        }
        if (j() || J() == 0) {
            this.f37380d.t();
        }
        if (j()) {
            return;
        }
        j0((int) (M() < 0.0f ? G() : E()));
        this.f37380d.g();
    }

    @w0(api = 19)
    public void f(Animator.AnimatorPauseListener animatorPauseListener) {
        this.f37380d.addPauseListener(animatorPauseListener);
    }

    public void f0() {
        this.f37380d.u();
    }

    public void g(ValueAnimator.AnimatorUpdateListener animatorUpdateListener) {
        this.f37380d.addUpdateListener(animatorUpdateListener);
    }

    public void g0(boolean z10) {
        this.f37398v = z10;
    }

    @Override // android.graphics.drawable.Drawable
    public int getAlpha() {
        return this.f37395s;
    }

    @Override // android.graphics.drawable.Drawable
    public int getIntrinsicHeight() {
        com.airbnb.lottie.g gVar = this.f37379c;
        if (gVar == null) {
            return -1;
        }
        return (int) (gVar.b().height() * L());
    }

    @Override // android.graphics.drawable.Drawable
    public int getIntrinsicWidth() {
        com.airbnb.lottie.g gVar = this.f37379c;
        if (gVar == null) {
            return -1;
        }
        return (int) (gVar.b().width() * L());
    }

    @Override // android.graphics.drawable.Drawable
    public int getOpacity() {
        return -3;
    }

    public <T> void h(com.airbnb.lottie.model.d dVar, T t10, @p0 com.airbnb.lottie.value.j<T> jVar) {
        com.airbnb.lottie.model.layer.b bVar = this.f37394r;
        if (bVar == null) {
            this.f37385i.add(new g(dVar, t10, jVar));
            return;
        }
        boolean zIsEmpty = true;
        if (dVar == com.airbnb.lottie.model.d.f37578c) {
            bVar.f(t10, jVar);
        } else if (dVar.d() != null) {
            dVar.d().f(t10, jVar);
        } else {
            List<com.airbnb.lottie.model.d> listD0 = d0(dVar);
            for (int i10 = 0; i10 < listD0.size(); i10++) {
                listD0.get(i10).d().f(t10, jVar);
            }
            zIsEmpty = true ^ listD0.isEmpty();
        }
        if (zIsEmpty) {
            invalidateSelf();
            if (t10 == com.airbnb.lottie.o.E) {
                z0(I());
            }
        }
    }

    public boolean h0(com.airbnb.lottie.g gVar) {
        if (this.f37379c == gVar) {
            return false;
        }
        this.f37400x = false;
        o();
        this.f37379c = gVar;
        m();
        this.f37380d.v(gVar);
        z0(this.f37380d.getAnimatedFraction());
        D0(this.f37381e);
        Iterator it = new ArrayList(this.f37385i).iterator();
        while (it.hasNext()) {
            r rVar = (r) it.next();
            if (rVar != null) {
                rVar.a(gVar);
            }
            it.remove();
        }
        this.f37385i.clear();
        gVar.z(this.f37396t);
        Drawable.Callback callback = getCallback();
        if (!(callback instanceof ImageView)) {
            return true;
        }
        ImageView imageView = (ImageView) callback;
        imageView.setImageDrawable(null);
        imageView.setImageDrawable(this);
        return true;
    }

    public <T> void i(com.airbnb.lottie.model.d dVar, T t10, com.airbnb.lottie.value.l<T> lVar) {
        h(dVar, t10, new h(lVar));
    }

    public void i0(com.airbnb.lottie.c cVar) {
        this.f37391o = cVar;
        a4.a aVar = this.f37390n;
        if (aVar != null) {
            aVar.d(cVar);
        }
    }

    @Override // android.graphics.drawable.Drawable.Callback
    public void invalidateDrawable(@n0 Drawable drawable) {
        Drawable.Callback callback = getCallback();
        if (callback == null) {
            return;
        }
        callback.invalidateDrawable(this);
    }

    @Override // android.graphics.drawable.Drawable
    public void invalidateSelf() {
        if (this.f37400x) {
            return;
        }
        this.f37400x = true;
        Drawable.Callback callback = getCallback();
        if (callback != null) {
            callback.invalidateDrawable(this);
        }
    }

    @Override // android.graphics.drawable.Animatable
    public boolean isRunning() {
        return R();
    }

    public void j0(int i10) {
        if (this.f37379c == null) {
            this.f37385i.add(new e(i10));
        } else {
            this.f37380d.w(i10);
        }
    }

    public void k0(boolean z10) {
        this.f37383g = z10;
    }

    public void l0(com.airbnb.lottie.d dVar) {
        this.f37389m = dVar;
        a4.b bVar = this.f37387k;
        if (bVar != null) {
            bVar.d(dVar);
        }
    }

    public void m0(@p0 String str) {
        this.f37388l = str;
    }

    public void n() {
        this.f37385i.clear();
        this.f37380d.cancel();
    }

    public void n0(int i10) {
        if (this.f37379c == null) {
            this.f37385i.add(new n(i10));
        } else {
            this.f37380d.x(i10 + 0.99f);
        }
    }

    public void o() {
        if (this.f37380d.isRunning()) {
            this.f37380d.cancel();
        }
        this.f37379c = null;
        this.f37394r = null;
        this.f37387k = null;
        this.f37380d.f();
        invalidateSelf();
    }

    public void o0(String str) {
        com.airbnb.lottie.g gVar = this.f37379c;
        if (gVar == null) {
            this.f37385i.add(new q(str));
            return;
        }
        com.airbnb.lottie.model.g gVarL = gVar.l(str);
        if (gVarL != null) {
            n0((int) (gVarL.f37585b + gVarL.f37586c));
            return;
        }
        throw new IllegalArgumentException("Cannot find marker with name " + str + ".");
    }

    public void p() {
        this.f37399w = false;
    }

    public void p0(@x(from = 0.0d, to = com.google.android.material.color.utilities.d.f53848a) float f10) {
        com.airbnb.lottie.g gVar = this.f37379c;
        if (gVar == null) {
            this.f37385i.add(new o(f10));
        } else {
            n0((int) com.airbnb.lottie.utils.i.k(gVar.r(), this.f37379c.f(), f10));
        }
    }

    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
    public void q(Canvas canvas, Matrix matrix) {
        com.airbnb.lottie.model.layer.b bVar = this.f37394r;
        if (bVar == null) {
            return;
        }
        bVar.c(canvas, matrix, this.f37395s);
    }

    public void q0(int i10, int i11) {
        if (this.f37379c == null) {
            this.f37385i.add(new c(i10, i11));
        } else {
            this.f37380d.y(i10, i11 + 0.99f);
        }
    }

    public void r0(String str) {
        com.airbnb.lottie.g gVar = this.f37379c;
        if (gVar == null) {
            this.f37385i.add(new a(str));
            return;
        }
        com.airbnb.lottie.model.g gVarL = gVar.l(str);
        if (gVarL != null) {
            int i10 = (int) gVarL.f37585b;
            q0(i10, ((int) gVarL.f37586c) + i10);
        } else {
            throw new IllegalArgumentException("Cannot find marker with name " + str + ".");
        }
    }

    public void s0(String str, String str2, boolean z10) {
        com.airbnb.lottie.g gVar = this.f37379c;
        if (gVar == null) {
            this.f37385i.add(new b(str, str2, z10));
            return;
        }
        com.airbnb.lottie.model.g gVarL = gVar.l(str);
        if (gVarL == null) {
            throw new IllegalArgumentException("Cannot find marker with name " + str + ".");
        }
        int i10 = (int) gVarL.f37585b;
        com.airbnb.lottie.model.g gVarL2 = this.f37379c.l(str2);
        if (gVarL2 != null) {
            q0(i10, (int) (gVarL2.f37585b + (z10 ? 1.0f : 0.0f)));
            return;
        }
        throw new IllegalArgumentException("Cannot find marker with name " + str2 + ".");
    }

    @Override // android.graphics.drawable.Drawable.Callback
    public void scheduleDrawable(@n0 Drawable drawable, @n0 Runnable runnable, long j10) {
        Drawable.Callback callback = getCallback();
        if (callback == null) {
            return;
        }
        callback.scheduleDrawable(this, runnable, j10);
    }

    @Override // android.graphics.drawable.Drawable
    public void setAlpha(@f0(from = 0, to = 255) int i10) {
        this.f37395s = i10;
        invalidateSelf();
    }

    @Override // android.graphics.drawable.Drawable
    public void setColorFilter(@p0 ColorFilter colorFilter) {
        com.airbnb.lottie.utils.f.e("Use addColorFilter instead.");
    }

    @Override // android.graphics.drawable.Animatable
    @k0
    public void start() {
        Drawable.Callback callback = getCallback();
        if (!(callback instanceof View) || ((View) callback).isInEditMode()) {
            return;
        }
        X();
    }

    @Override // android.graphics.drawable.Animatable
    @k0
    public void stop() {
        w();
    }

    public void t0(@x(from = 0.0d, to = com.google.android.material.color.utilities.d.f53848a) float f10, @x(from = 0.0d, to = com.google.android.material.color.utilities.d.f53848a) float f11) {
        com.airbnb.lottie.g gVar = this.f37379c;
        if (gVar == null) {
            this.f37385i.add(new d(f10, f11));
        } else {
            q0((int) com.airbnb.lottie.utils.i.k(gVar.r(), this.f37379c.f(), f10), (int) com.airbnb.lottie.utils.i.k(this.f37379c.r(), this.f37379c.f(), f11));
        }
    }

    public void u(boolean z10) {
        if (this.f37393q == z10) {
            return;
        }
        this.f37393q = z10;
        if (this.f37379c != null) {
            m();
        }
    }

    public void u0(int i10) {
        if (this.f37379c == null) {
            this.f37385i.add(new l(i10));
        } else {
            this.f37380d.z(i10);
        }
    }

    @Override // android.graphics.drawable.Drawable.Callback
    public void unscheduleDrawable(@n0 Drawable drawable, @n0 Runnable runnable) {
        Drawable.Callback callback = getCallback();
        if (callback == null) {
            return;
        }
        callback.unscheduleDrawable(this, runnable);
    }

    public boolean v() {
        return this.f37393q;
    }

    public void v0(String str) {
        com.airbnb.lottie.g gVar = this.f37379c;
        if (gVar == null) {
            this.f37385i.add(new p(str));
            return;
        }
        com.airbnb.lottie.model.g gVarL = gVar.l(str);
        if (gVarL != null) {
            u0((int) gVarL.f37585b);
            return;
        }
        throw new IllegalArgumentException("Cannot find marker with name " + str + ".");
    }

    @k0
    public void w() {
        this.f37385i.clear();
        this.f37380d.g();
    }

    public void w0(float f10) {
        com.airbnb.lottie.g gVar = this.f37379c;
        if (gVar == null) {
            this.f37385i.add(new m(f10));
        } else {
            u0((int) com.airbnb.lottie.utils.i.k(gVar.r(), this.f37379c.f(), f10));
        }
    }

    public com.airbnb.lottie.g x() {
        return this.f37379c;
    }

    public void x0(boolean z10) {
        if (this.f37397u == z10) {
            return;
        }
        this.f37397u = z10;
        com.airbnb.lottie.model.layer.b bVar = this.f37394r;
        if (bVar != null) {
            bVar.I(z10);
        }
    }

    public void y0(boolean z10) {
        this.f37396t = z10;
        com.airbnb.lottie.g gVar = this.f37379c;
        if (gVar != null) {
            gVar.z(z10);
        }
    }

    public void z0(@x(from = 0.0d, to = com.google.android.material.color.utilities.d.f53848a) float f10) {
        if (this.f37379c == null) {
            this.f37385i.add(new f(f10));
            return;
        }
        com.airbnb.lottie.e.a("Drawable#setProgress");
        this.f37380d.w(this.f37379c.h(f10));
        com.airbnb.lottie.e.b("Drawable#setProgress");
    }
}
