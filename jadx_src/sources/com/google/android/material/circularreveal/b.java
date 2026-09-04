package com.google.android.material.circularreveal;

import android.graphics.Bitmap;
import android.graphics.BitmapShader;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.Rect;
import android.graphics.Shader;
import android.graphics.drawable.Drawable;
import android.view.View;
import androidx.annotation.l;
import androidx.annotation.n0;
import androidx.annotation.p0;
import androidx.core.view.j1;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;

/* JADX INFO: compiled from: CircularRevealHelper.java */
/* JADX INFO: loaded from: classes7.dex */
public class b {

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private static final boolean f53620k = false;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public static final int f53621l = 0;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public static final int f53622m = 1;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public static final int f53623n = 2;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public static final int f53624o = 2;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final a f53625a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @n0
    private final View f53626b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @n0
    private final Path f53627c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @n0
    private final Paint f53628d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    @n0
    private final Paint f53629e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    @p0
    private c.e f53630f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    @p0
    private Drawable f53631g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private Paint f53632h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private boolean f53633i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private boolean f53634j;

    /* JADX INFO: compiled from: CircularRevealHelper.java */
    public interface a {
        void b(Canvas canvas);

        boolean c();
    }

    /* JADX INFO: renamed from: com.google.android.material.circularreveal.b$b, reason: collision with other inner class name */
    /* JADX INFO: compiled from: CircularRevealHelper.java */
    @Retention(RetentionPolicy.SOURCE)
    public @interface InterfaceC0421b {
    }

    /* JADX WARN: Multi-variable type inference failed */
    public b(a aVar) {
        this.f53625a = aVar;
        View view = (View) aVar;
        this.f53626b = view;
        view.setWillNotDraw(false);
        this.f53627c = new Path();
        this.f53628d = new Paint(7);
        Paint paint = new Paint(1);
        this.f53629e = paint;
        paint.setColor(0);
    }

    private void d(@n0 Canvas canvas, int i10, float f10) {
        this.f53632h.setColor(i10);
        this.f53632h.setStrokeWidth(f10);
        c.e eVar = this.f53630f;
        canvas.drawCircle(eVar.f53640a, eVar.f53641b, eVar.f53642c - (f10 / 2.0f), this.f53632h);
    }

    private void e(@n0 Canvas canvas) {
        this.f53625a.b(canvas);
        if (r()) {
            c.e eVar = this.f53630f;
            canvas.drawCircle(eVar.f53640a, eVar.f53641b, eVar.f53642c, this.f53629e);
        }
        if (p()) {
            d(canvas, j1.f21601t, 10.0f);
            d(canvas, y1.a.f141526c, 5.0f);
        }
        f(canvas);
    }

    private void f(@n0 Canvas canvas) {
        if (q()) {
            Rect bounds = this.f53631g.getBounds();
            float fWidth = this.f53630f.f53640a - (bounds.width() / 2.0f);
            float fHeight = this.f53630f.f53641b - (bounds.height() / 2.0f);
            canvas.translate(fWidth, fHeight);
            this.f53631g.draw(canvas);
            canvas.translate(-fWidth, -fHeight);
        }
    }

    private float i(@n0 c.e eVar) {
        return h9.a.b(eVar.f53640a, eVar.f53641b, 0.0f, 0.0f, this.f53626b.getWidth(), this.f53626b.getHeight());
    }

    private void k() {
        if (f53624o == 1) {
            this.f53627c.rewind();
            c.e eVar = this.f53630f;
            if (eVar != null) {
                this.f53627c.addCircle(eVar.f53640a, eVar.f53641b, eVar.f53642c, Path.Direction.CW);
            }
        }
        this.f53626b.invalidate();
    }

    private boolean p() {
        c.e eVar = this.f53630f;
        boolean z10 = eVar == null || eVar.a();
        if (f53624o == 0) {
            return !z10 && this.f53634j;
        }
        return !z10;
    }

    private boolean q() {
        return (this.f53633i || this.f53631g == null || this.f53630f == null) ? false : true;
    }

    private boolean r() {
        return (this.f53633i || Color.alpha(this.f53629e.getColor()) == 0) ? false : true;
    }

    public void a() {
        if (f53624o == 0) {
            this.f53633i = true;
            this.f53634j = false;
            this.f53626b.buildDrawingCache();
            Bitmap drawingCache = this.f53626b.getDrawingCache();
            if (drawingCache == null && this.f53626b.getWidth() != 0 && this.f53626b.getHeight() != 0) {
                drawingCache = Bitmap.createBitmap(this.f53626b.getWidth(), this.f53626b.getHeight(), Bitmap.Config.ARGB_8888);
                this.f53626b.draw(new Canvas(drawingCache));
            }
            if (drawingCache != null) {
                Paint paint = this.f53628d;
                Shader.TileMode tileMode = Shader.TileMode.CLAMP;
                paint.setShader(new BitmapShader(drawingCache, tileMode, tileMode));
            }
            this.f53633i = false;
            this.f53634j = true;
        }
    }

    public void b() {
        if (f53624o == 0) {
            this.f53634j = false;
            this.f53626b.destroyDrawingCache();
            this.f53628d.setShader(null);
            this.f53626b.invalidate();
        }
    }

    public void c(@n0 Canvas canvas) {
        if (p()) {
            int i10 = f53624o;
            if (i10 == 0) {
                c.e eVar = this.f53630f;
                canvas.drawCircle(eVar.f53640a, eVar.f53641b, eVar.f53642c, this.f53628d);
                if (r()) {
                    c.e eVar2 = this.f53630f;
                    canvas.drawCircle(eVar2.f53640a, eVar2.f53641b, eVar2.f53642c, this.f53629e);
                }
            } else if (i10 == 1) {
                int iSave = canvas.save();
                canvas.clipPath(this.f53627c);
                this.f53625a.b(canvas);
                if (r()) {
                    canvas.drawRect(0.0f, 0.0f, this.f53626b.getWidth(), this.f53626b.getHeight(), this.f53629e);
                }
                canvas.restoreToCount(iSave);
            } else {
                if (i10 != 2) {
                    throw new IllegalStateException("Unsupported strategy " + i10);
                }
                this.f53625a.b(canvas);
                if (r()) {
                    canvas.drawRect(0.0f, 0.0f, this.f53626b.getWidth(), this.f53626b.getHeight(), this.f53629e);
                }
            }
        } else {
            this.f53625a.b(canvas);
            if (r()) {
                canvas.drawRect(0.0f, 0.0f, this.f53626b.getWidth(), this.f53626b.getHeight(), this.f53629e);
            }
        }
        f(canvas);
    }

    @p0
    public Drawable g() {
        return this.f53631g;
    }

    @l
    public int h() {
        return this.f53629e.getColor();
    }

    @p0
    public c.e j() {
        c.e eVar = this.f53630f;
        if (eVar == null) {
            return null;
        }
        c.e eVar2 = new c.e(eVar);
        if (eVar2.a()) {
            eVar2.f53642c = i(eVar2);
        }
        return eVar2;
    }

    public boolean l() {
        return this.f53625a.c() && !p();
    }

    public void m(@p0 Drawable drawable) {
        this.f53631g = drawable;
        this.f53626b.invalidate();
    }

    public void n(@l int i10) {
        this.f53629e.setColor(i10);
        this.f53626b.invalidate();
    }

    public void o(@p0 c.e eVar) {
        if (eVar == null) {
            this.f53630f = null;
        } else {
            c.e eVar2 = this.f53630f;
            if (eVar2 == null) {
                this.f53630f = new c.e(eVar);
            } else {
                eVar2.c(eVar);
            }
            if (h9.a.e(eVar.f53642c, i(eVar), 1.0E-4f)) {
                this.f53630f.f53642c = Float.MAX_VALUE;
            }
        }
        k();
    }
}
