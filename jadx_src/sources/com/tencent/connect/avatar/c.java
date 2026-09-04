package com.tencent.connect.avatar;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Matrix;
import android.graphics.PointF;
import android.graphics.Rect;
import android.view.MotionEvent;
import android.view.animation.Animation;
import android.view.animation.ScaleAnimation;
import android.view.animation.TranslateAnimation;
import android.widget.ImageView;

/* JADX INFO: compiled from: ProGuard */
/* JADX INFO: loaded from: classes4.dex */
public class c extends ImageView {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    final String f99396a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public boolean f99397b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private Matrix f99398c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private Matrix f99399d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private int f99400e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private float f99401f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private float f99402g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private Bitmap f99403h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private boolean f99404i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private float f99405j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private float f99406k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private PointF f99407l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private PointF f99408m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private float f99409n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    private float f99410o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    private Rect f99411p;

    public c(Context context) {
        super(context);
        this.f99398c = new Matrix();
        this.f99399d = new Matrix();
        this.f99400e = 0;
        this.f99401f = 1.0f;
        this.f99402g = 1.0f;
        this.f99404i = false;
        this.f99396a = "TouchView";
        this.f99407l = new PointF();
        this.f99408m = new PointF();
        this.f99409n = 1.0f;
        this.f99410o = 0.0f;
        this.f99397b = false;
        Rect rect = new Rect();
        this.f99411p = rect;
        getDrawingRect(rect);
        a();
    }

    private float a(MotionEvent motionEvent) {
        if (motionEvent.getPointerCount() < 2) {
            return 0.0f;
        }
        float x10 = motionEvent.getX(0) - motionEvent.getX(1);
        float y10 = motionEvent.getY(0) - motionEvent.getY(1);
        return (float) Math.sqrt((x10 * x10) + (y10 * y10));
    }

    private void a() {
    }

    private void a(PointF pointF) {
        if (this.f99403h == null) {
            return;
        }
        float[] fArr = new float[9];
        this.f99398c.getValues(fArr);
        float f10 = fArr[2];
        float f11 = fArr[5];
        float f12 = fArr[0];
        float width = this.f99403h.getWidth() * f12;
        float height = this.f99403h.getHeight() * f12;
        Rect rect = this.f99411p;
        float f13 = rect.left - f10;
        if (f13 <= 1.0f) {
            f13 = 1.0f;
        }
        float f14 = (f10 + width) - rect.right;
        if (f14 <= 1.0f) {
            f14 = 1.0f;
        }
        float fWidth = (rect.width() * f13) / (f14 + f13);
        Rect rect2 = this.f99411p;
        float f15 = fWidth + rect2.left;
        float f16 = rect2.top - f11;
        float f17 = (f11 + height) - rect2.bottom;
        if (f16 <= 1.0f) {
            f16 = 1.0f;
        }
        pointF.set(f15, ((rect2.height() * f16) / ((f17 > 1.0f ? f17 : 1.0f) + f16)) + this.f99411p.top);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void b() {
        boolean z10;
        Animation translateAnimation;
        if (this.f99403h == null) {
            return;
        }
        float fWidth = this.f99411p.width();
        float fHeight = this.f99411p.height();
        float[] fArr = new float[9];
        this.f99398c.getValues(fArr);
        float f10 = fArr[2];
        float f11 = fArr[5];
        float f12 = fArr[0];
        float f13 = this.f99401f;
        if (f12 > f13) {
            float f14 = f13 / f12;
            this.f99410o = f14;
            Matrix matrix = this.f99398c;
            PointF pointF = this.f99408m;
            matrix.postScale(f14, f14, pointF.x, pointF.y);
            setImageMatrix(this.f99398c);
            float f15 = this.f99410o;
            float f16 = 1.0f / f15;
            float f17 = 1.0f / f15;
            PointF pointF2 = this.f99408m;
            translateAnimation = new ScaleAnimation(f16, 1.0f, f17, 1.0f, pointF2.x, pointF2.y);
        } else {
            float f18 = this.f99402g;
            if (f12 < f18) {
                float f19 = f18 / f12;
                this.f99410o = f19;
                Matrix matrix2 = this.f99398c;
                PointF pointF3 = this.f99408m;
                matrix2.postScale(f19, f19, pointF3.x, pointF3.y);
                float f20 = this.f99410o;
                PointF pointF4 = this.f99408m;
                translateAnimation = new ScaleAnimation(1.0f, f20, 1.0f, f20, pointF4.x, pointF4.y);
            } else {
                float width = this.f99403h.getWidth() * f12;
                float height = this.f99403h.getHeight() * f12;
                Rect rect = this.f99411p;
                int i10 = rect.left;
                float f21 = i10 - f10;
                int i11 = rect.top;
                float f22 = i11 - f11;
                if (f21 < 0.0f) {
                    f10 = i10;
                    z10 = true;
                } else {
                    z10 = false;
                }
                if (f22 < 0.0f) {
                    f11 = i11;
                    z10 = true;
                }
                float f23 = height - f22;
                if (width - f21 < fWidth) {
                    f10 = i10 - (width - fWidth);
                    z10 = true;
                }
                if (f23 < fHeight) {
                    f11 = i11 - (height - fHeight);
                    z10 = true;
                }
                if (z10) {
                    float f24 = fArr[2] - f10;
                    float f25 = fArr[5] - f11;
                    fArr[2] = f10;
                    fArr[5] = f11;
                    this.f99398c.setValues(fArr);
                    setImageMatrix(this.f99398c);
                    translateAnimation = new TranslateAnimation(f24, 0.0f, f25, 0.0f);
                } else {
                    setImageMatrix(this.f99398c);
                    translateAnimation = null;
                }
            }
        }
        if (translateAnimation != null) {
            this.f99404i = true;
            translateAnimation.setDuration(300L);
            startAnimation(translateAnimation);
            new Thread(new Runnable() { // from class: com.tencent.connect.avatar.c.1
                @Override // java.lang.Runnable
                public void run() {
                    try {
                        Thread.sleep(300L);
                    } catch (InterruptedException e10) {
                        e10.printStackTrace();
                    }
                    c.this.post(new Runnable() { // from class: com.tencent.connect.avatar.c.1.1
                        @Override // java.lang.Runnable
                        public void run() {
                            c.this.clearAnimation();
                            c.this.b();
                        }
                    });
                    c.this.f99404i = false;
                }
            }).start();
        }
    }

    private void c() {
        if (this.f99403h == null) {
            return;
        }
        float[] fArr = {fMax, 0.0f, this.f99405j, 0.0f, fMax, height, 0.0f, 0.0f, 0.0f};
        this.f99398c.getValues(fArr);
        float fMax = Math.max(this.f99411p.width() / this.f99403h.getWidth(), this.f99411p.height() / this.f99403h.getHeight());
        this.f99405j = this.f99411p.left - (((this.f99403h.getWidth() * fMax) - this.f99411p.width()) / 2.0f);
        float height = this.f99411p.top - (((this.f99403h.getHeight() * fMax) - this.f99411p.height()) / 2.0f);
        this.f99406k = height;
        this.f99398c.setValues(fArr);
        float fMin = Math.min(2048.0f / this.f99403h.getWidth(), 2048.0f / this.f99403h.getHeight());
        this.f99401f = fMin;
        this.f99402g = fMax;
        if (fMin < fMax) {
            this.f99401f = fMax;
        }
        setImageMatrix(this.f99398c);
    }

    public void a(Rect rect) {
        this.f99411p = rect;
        if (this.f99403h != null) {
            c();
        }
    }

    /* JADX WARN: Code duplicated, block: B:26:0x0089  */
    @Override // android.view.View
    public boolean onTouchEvent(MotionEvent motionEvent) {
        if (this.f99404i) {
            return true;
        }
        int action = motionEvent.getAction() & 255;
        if (action == 0) {
            this.f99398c.set(getImageMatrix());
            this.f99399d.set(this.f99398c);
            this.f99407l.set(motionEvent.getX(), motionEvent.getY());
            this.f99400e = 1;
        } else if (action == 1) {
            b();
            this.f99400e = 0;
        } else if (action == 2) {
            int i10 = this.f99400e;
            if (i10 == 1) {
                this.f99398c.set(this.f99399d);
                this.f99398c.postTranslate(motionEvent.getX() - this.f99407l.x, motionEvent.getY() - this.f99407l.y);
                setImageMatrix(this.f99398c);
            } else if (i10 == 2) {
                Matrix matrix = this.f99398c;
                matrix.set(matrix);
                float fA = a(motionEvent);
                if (fA > 10.0f) {
                    this.f99398c.set(this.f99399d);
                    float f10 = fA / this.f99409n;
                    Matrix matrix2 = this.f99398c;
                    PointF pointF = this.f99408m;
                    matrix2.postScale(f10, f10, pointF.x, pointF.y);
                }
                setImageMatrix(this.f99398c);
            }
        } else if (action == 5) {
            float fA2 = a(motionEvent);
            this.f99409n = fA2;
            if (fA2 > 10.0f) {
                this.f99399d.set(this.f99398c);
                a(this.f99408m);
                this.f99400e = 2;
            }
        } else if (action == 6) {
            b();
            this.f99400e = 0;
        }
        this.f99397b = true;
        return true;
    }

    @Override // android.widget.ImageView
    public void setImageBitmap(Bitmap bitmap) {
        super.setImageBitmap(bitmap);
        this.f99403h = bitmap;
        if (bitmap != null) {
            this.f99403h = bitmap;
        }
    }
}
