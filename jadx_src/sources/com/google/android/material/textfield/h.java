package com.google.android.material.textfield;

import android.annotation.TargetApi;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffXfermode;
import android.graphics.RectF;
import android.graphics.Region;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.view.View;
import androidx.annotation.n0;
import androidx.annotation.p0;

/* JADX INFO: compiled from: CutoutDrawable.java */
/* JADX INFO: loaded from: classes7.dex */
public class h extends com.google.android.material.shape.k {

    @n0
    b F;

    /* JADX INFO: compiled from: CutoutDrawable.java */
    public static final class b extends com.google.android.material.shape.k.d {

        /* JADX INFO: renamed from: w, reason: collision with root package name */
        @n0
        private final RectF f55645w;

        private b(@n0 com.google.android.material.shape.p pVar, @n0 RectF rectF) {
            super(pVar, null);
            this.f55645w = rectF;
        }

        private b(@n0 b bVar) {
            super(bVar);
            this.f55645w = bVar.f55645w;
        }

        @Override // com.google.android.material.shape.k.d, android.graphics.drawable.Drawable.ConstantState
        @n0
        public Drawable newDrawable() {
            h hVarR0 = h.R0(this);
            hVarR0.invalidateSelf();
            return hVarR0;
        }
    }

    /* JADX INFO: compiled from: CutoutDrawable.java */
    public static class c extends h {
        private Paint G;
        private int H;

        c(@n0 b bVar) {
            super(bVar);
        }

        private Paint W0() {
            if (this.G == null) {
                Paint paint = new Paint(1);
                this.G = paint;
                paint.setStyle(Paint.Style.FILL_AND_STROKE);
                this.G.setColor(-1);
                this.G.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.DST_OUT));
            }
            return this.G;
        }

        private void X0(@n0 Canvas canvas) {
            if (a1(getCallback())) {
                return;
            }
            canvas.restoreToCount(this.H);
        }

        private void Y0(@n0 Canvas canvas) {
            Drawable.Callback callback = getCallback();
            if (!a1(callback)) {
                Z0(canvas);
                return;
            }
            View view = (View) callback;
            if (view.getLayerType() != 2) {
                view.setLayerType(2, null);
            }
        }

        private void Z0(@n0 Canvas canvas) {
            this.H = canvas.saveLayer(0.0f, 0.0f, canvas.getWidth(), canvas.getHeight(), null);
        }

        private boolean a1(Drawable.Callback callback) {
            return callback instanceof View;
        }

        @Override // com.google.android.material.shape.k, android.graphics.drawable.Drawable
        public void draw(@n0 Canvas canvas) {
            Y0(canvas);
            super.draw(canvas);
            X0(canvas);
        }

        @Override // com.google.android.material.shape.k
        protected void s(@n0 Canvas canvas) {
            super.s(canvas);
            canvas.drawRect(this.F.f55645w, W0());
        }
    }

    /* JADX INFO: compiled from: CutoutDrawable.java */
    @TargetApi(18)
    public static class d extends h {
        d(@n0 b bVar) {
            super(bVar);
        }

        @Override // com.google.android.material.shape.k
        protected void s(@n0 Canvas canvas) {
            if (this.F.f55645w.isEmpty()) {
                super.s(canvas);
                return;
            }
            canvas.save();
            if (Build.VERSION.SDK_INT >= 26) {
                canvas.clipOutRect(this.F.f55645w);
            } else {
                canvas.clipRect(this.F.f55645w, Region.Op.DIFFERENCE);
            }
            super.s(canvas);
            canvas.restore();
        }
    }

    private h(@n0 b bVar) {
        super(bVar);
        this.F = bVar;
    }

    static h Q0(@p0 com.google.android.material.shape.p pVar) {
        if (pVar == null) {
            pVar = new com.google.android.material.shape.p();
        }
        return R0(new b(pVar, new RectF()));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static h R0(@n0 b bVar) {
        return new d(bVar);
    }

    boolean S0() {
        return !this.F.f55645w.isEmpty();
    }

    void T0() {
        U0(0.0f, 0.0f, 0.0f, 0.0f);
    }

    void U0(float f10, float f11, float f12, float f13) {
        if (f10 == this.F.f55645w.left && f11 == this.F.f55645w.top && f12 == this.F.f55645w.right && f13 == this.F.f55645w.bottom) {
            return;
        }
        this.F.f55645w.set(f10, f11, f12, f13);
        invalidateSelf();
    }

    void V0(@n0 RectF rectF) {
        U0(rectF.left, rectF.top, rectF.right, rectF.bottom);
    }

    @Override // com.google.android.material.shape.k, android.graphics.drawable.Drawable
    @n0
    public Drawable mutate() {
        this.F = new b(this.F);
        return this;
    }
}
