package com.bumptech.glide.load.resource.gif;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.drawable.Animatable;
import android.graphics.drawable.Drawable;
import android.view.Gravity;
import androidx.annotation.j1;
import androidx.annotation.n0;
import com.bumptech.glide.Glide;
import com.bumptech.glide.util.m;
import java.nio.ByteBuffer;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: compiled from: GifDrawable.java */
/* JADX INFO: loaded from: classes6.dex */
public class c extends Drawable implements g.b, Animatable, androidx.vectordrawable.graphics.drawable.b {

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public static final int f41670m = -1;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public static final int f41671n = 0;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    private static final int f41672o = 119;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final a f41673b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private boolean f41674c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private boolean f41675d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private boolean f41676e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private boolean f41677f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private int f41678g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private int f41679h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private boolean f41680i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private Paint f41681j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private Rect f41682k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private List<androidx.vectordrawable.graphics.drawable.b.a> f41683l;

    /* JADX INFO: compiled from: GifDrawable.java */
    public static final class a extends Drawable.ConstantState {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        @j1
        final g f41684a;

        a(g gVar) {
            this.f41684a = gVar;
        }

        @Override // android.graphics.drawable.Drawable.ConstantState
        public int getChangingConfigurations() {
            return 0;
        }

        @Override // android.graphics.drawable.Drawable.ConstantState
        @n0
        public Drawable newDrawable() {
            return new c(this);
        }

        @Override // android.graphics.drawable.Drawable.ConstantState
        @n0
        public Drawable newDrawable(Resources resources) {
            return newDrawable();
        }
    }

    @Deprecated
    public c(Context context, com.bumptech.glide.gifdecoder.a aVar, com.bumptech.glide.load.engine.bitmap_recycle.e eVar, com.bumptech.glide.load.i<Bitmap> iVar, int i10, int i11, Bitmap bitmap) {
        this(context, aVar, iVar, i10, i11, bitmap);
    }

    public c(Context context, com.bumptech.glide.gifdecoder.a aVar, com.bumptech.glide.load.i<Bitmap> iVar, int i10, int i11, Bitmap bitmap) {
        this(new a(new g(Glide.e(context), aVar, i10, i11, iVar, bitmap)));
    }

    c(a aVar) {
        this.f41677f = true;
        this.f41679h = -1;
        this.f41673b = (a) m.e(aVar);
    }

    @j1
    c(g gVar, Paint paint) {
        this(new a(gVar));
        this.f41681j = paint;
    }

    /* JADX WARN: Multi-variable type inference failed */
    private Drawable.Callback d() {
        Drawable.Callback callback = getCallback();
        while (callback instanceof Drawable) {
            callback = ((Drawable) callback).getCallback();
        }
        return callback;
    }

    private Rect f() {
        if (this.f41682k == null) {
            this.f41682k = new Rect();
        }
        return this.f41682k;
    }

    private Paint k() {
        if (this.f41681j == null) {
            this.f41681j = new Paint(2);
        }
        return this.f41681j;
    }

    private void n() {
        List<androidx.vectordrawable.graphics.drawable.b.a> list = this.f41683l;
        if (list != null) {
            int size = list.size();
            for (int i10 = 0; i10 < size; i10++) {
                this.f41683l.get(i10).b(this);
            }
        }
    }

    private void p() {
        this.f41678g = 0;
    }

    private void u() {
        m.b(!this.f41676e, "You cannot start a recycled Drawable. Ensure thatyou clear any references to the Drawable when clearing the corresponding request.");
        if (this.f41673b.f41684a.f() == 1) {
            invalidateSelf();
        } else {
            if (this.f41674c) {
                return;
            }
            this.f41674c = true;
            this.f41673b.f41684a.v(this);
            invalidateSelf();
        }
    }

    private void v() {
        this.f41674c = false;
        this.f41673b.f41684a.w(this);
    }

    @Override // com.bumptech.glide.load.resource.gif.g.b
    public void a() {
        if (d() == null) {
            stop();
            invalidateSelf();
            return;
        }
        invalidateSelf();
        if (i() == h() - 1) {
            this.f41678g++;
        }
        int i10 = this.f41679h;
        if (i10 == -1 || this.f41678g < i10) {
            return;
        }
        n();
        stop();
    }

    @Override // androidx.vectordrawable.graphics.drawable.b
    public boolean b(@n0 androidx.vectordrawable.graphics.drawable.b.a aVar) {
        List<androidx.vectordrawable.graphics.drawable.b.a> list = this.f41683l;
        if (list == null || aVar == null) {
            return false;
        }
        return list.remove(aVar);
    }

    @Override // androidx.vectordrawable.graphics.drawable.b
    public void c(@n0 androidx.vectordrawable.graphics.drawable.b.a aVar) {
        if (aVar == null) {
            return;
        }
        if (this.f41683l == null) {
            this.f41683l = new ArrayList();
        }
        this.f41683l.add(aVar);
    }

    @Override // androidx.vectordrawable.graphics.drawable.b
    public void clearAnimationCallbacks() {
        List<androidx.vectordrawable.graphics.drawable.b.a> list = this.f41683l;
        if (list != null) {
            list.clear();
        }
    }

    @Override // android.graphics.drawable.Drawable
    public void draw(@n0 Canvas canvas) {
        if (this.f41676e) {
            return;
        }
        if (this.f41680i) {
            Gravity.apply(119, getIntrinsicWidth(), getIntrinsicHeight(), getBounds(), f());
            this.f41680i = false;
        }
        canvas.drawBitmap(this.f41673b.f41684a.c(), (Rect) null, f(), k());
    }

    public ByteBuffer e() {
        return this.f41673b.f41684a.b();
    }

    public Bitmap g() {
        return this.f41673b.f41684a.e();
    }

    @Override // android.graphics.drawable.Drawable
    public Drawable.ConstantState getConstantState() {
        return this.f41673b;
    }

    @Override // android.graphics.drawable.Drawable
    public int getIntrinsicHeight() {
        return this.f41673b.f41684a.i();
    }

    @Override // android.graphics.drawable.Drawable
    public int getIntrinsicWidth() {
        return this.f41673b.f41684a.m();
    }

    @Override // android.graphics.drawable.Drawable
    public int getOpacity() {
        return -2;
    }

    public int h() {
        return this.f41673b.f41684a.f();
    }

    public int i() {
        return this.f41673b.f41684a.d();
    }

    @Override // android.graphics.drawable.Animatable
    public boolean isRunning() {
        return this.f41674c;
    }

    public com.bumptech.glide.load.i<Bitmap> j() {
        return this.f41673b.f41684a.h();
    }

    public int l() {
        return this.f41673b.f41684a.l();
    }

    boolean m() {
        return this.f41676e;
    }

    public void o() {
        this.f41676e = true;
        this.f41673b.f41684a.a();
    }

    @Override // android.graphics.drawable.Drawable
    protected void onBoundsChange(Rect rect) {
        super.onBoundsChange(rect);
        this.f41680i = true;
    }

    public void q(com.bumptech.glide.load.i<Bitmap> iVar, Bitmap bitmap) {
        this.f41673b.f41684a.q(iVar, bitmap);
    }

    void r(boolean z10) {
        this.f41674c = z10;
    }

    public void s(int i10) {
        if (i10 <= 0 && i10 != -1 && i10 != 0) {
            throw new IllegalArgumentException("Loop count must be greater than 0, or equal to GlideDrawable.LOOP_FOREVER, or equal to GlideDrawable.LOOP_INTRINSIC");
        }
        if (i10 != 0) {
            this.f41679h = i10;
        } else {
            int iJ = this.f41673b.f41684a.j();
            this.f41679h = iJ != 0 ? iJ : -1;
        }
    }

    @Override // android.graphics.drawable.Drawable
    public void setAlpha(int i10) {
        k().setAlpha(i10);
    }

    @Override // android.graphics.drawable.Drawable
    public void setColorFilter(ColorFilter colorFilter) {
        k().setColorFilter(colorFilter);
    }

    @Override // android.graphics.drawable.Drawable
    public boolean setVisible(boolean z10, boolean z11) {
        m.b(!this.f41676e, "Cannot change the visibility of a recycled resource. Ensure that you unset the Drawable from your View before changing the View's visibility.");
        this.f41677f = z10;
        if (!z10) {
            v();
        } else if (this.f41675d) {
            u();
        }
        return super.setVisible(z10, z11);
    }

    @Override // android.graphics.drawable.Animatable
    public void start() {
        this.f41675d = true;
        p();
        if (this.f41677f) {
            u();
        }
    }

    @Override // android.graphics.drawable.Animatable
    public void stop() {
        this.f41675d = false;
        v();
    }

    public void t() {
        m.b(!this.f41674c, "You cannot restart a currently running animation.");
        this.f41673b.f41684a.r();
        start();
    }
}
