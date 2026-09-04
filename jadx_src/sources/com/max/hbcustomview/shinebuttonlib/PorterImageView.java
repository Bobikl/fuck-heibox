package com.max.hbcustomview.shinebuttonlib;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffXfermode;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.util.Log;
import android.widget.ImageView;
import androidx.appcompat.widget.AppCompatImageView;
import androidx.core.content.res.i;
import androidx.core.view.j1;
import com.max.hbcustomview.R;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import java.lang.ref.SoftReference;

/* JADX INFO: loaded from: classes10.dex */
public abstract class PorterImageView extends AppCompatImageView {
    public static ChangeQuickRedirect changeQuickRedirect;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    private static final String f69379u = PorterImageView.class.getSimpleName();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private Canvas f69380b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private Paint f69381c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private Canvas f69382d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private Paint f69383e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    int f69384f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private boolean f69385g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    protected boolean f69386h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private boolean f69387i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    protected Paint f69388j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private final PorterDuffXfermode f69389k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private final PorterDuffXfermode f69390l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    protected Drawable f69391m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    protected Canvas f69392n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    protected float f69393o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    protected float f69394p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    protected int f69395q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    protected SoftReference<Bitmap> f69396r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    protected SoftReference<Bitmap> f69397s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    protected SoftReference<Bitmap> f69398t;

    public PorterImageView(Context context) {
        super(context);
        this.f69384f = -7829368;
        this.f69385g = true;
        this.f69386h = true;
        this.f69387i = false;
        this.f69389k = new PorterDuffXfermode(PorterDuff.Mode.SRC_IN);
        this.f69390l = new PorterDuffXfermode(PorterDuff.Mode.CLEAR);
        this.f69393o = 1.0f;
        this.f69394p = 1.0f;
        this.f69395q = i.e(getContext().getResources(), R.color.text_primary_1_color, null);
        i(context, null, 0);
    }

    public PorterImageView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f69384f = -7829368;
        this.f69385g = true;
        this.f69386h = true;
        this.f69387i = false;
        this.f69389k = new PorterDuffXfermode(PorterDuff.Mode.SRC_IN);
        this.f69390l = new PorterDuffXfermode(PorterDuff.Mode.CLEAR);
        this.f69393o = 1.0f;
        this.f69394p = 1.0f;
        this.f69395q = i.e(getContext().getResources(), R.color.text_primary_1_color, null);
        i(context, attributeSet, 0);
    }

    public PorterImageView(Context context, AttributeSet attributeSet, int i10) {
        super(context, attributeSet, i10);
        this.f69384f = -7829368;
        this.f69385g = true;
        this.f69386h = true;
        this.f69387i = false;
        this.f69389k = new PorterDuffXfermode(PorterDuff.Mode.SRC_IN);
        this.f69390l = new PorterDuffXfermode(PorterDuff.Mode.CLEAR);
        this.f69393o = 1.0f;
        this.f69394p = 1.0f;
        this.f69395q = i.e(getContext().getResources(), R.color.text_primary_1_color, null);
        i(context, attributeSet, i10);
    }

    private void d(int i10, int i11, int i12, int i13) {
        boolean z10 = false;
        Object[] objArr = {new Integer(i10), new Integer(i11), new Integer(i12), new Integer(i13)};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        Class cls = Integer.TYPE;
        if (PatchProxy.proxy(objArr, this, changeQuickRedirect2, false, bb.c.f.Ap, new Class[]{cls, cls, cls, cls}, Void.TYPE).isSupported) {
            return;
        }
        boolean z11 = (i10 == i12 && i11 == i13) ? false : true;
        if (i10 > 0 && i11 > 0) {
            z10 = true;
        }
        if (z10) {
            if (this.f69380b == null || z11) {
                this.f69392n = new Canvas();
                Bitmap bitmapCreateBitmap = Bitmap.createBitmap(i10, i11, Bitmap.Config.ARGB_8888);
                this.f69396r = new SoftReference<>(bitmapCreateBitmap);
                this.f69392n.setBitmap(bitmapCreateBitmap);
                this.f69388j.setColor(this.f69395q);
                setCoverDrawable(i10, i11);
                this.f69380b = new Canvas();
                Bitmap bitmapCreateBitmap2 = Bitmap.createBitmap(i10, i11, Bitmap.Config.ARGB_8888);
                this.f69397s = new SoftReference<>(bitmapCreateBitmap2);
                this.f69380b.setBitmap(bitmapCreateBitmap2);
                this.f69381c.reset();
                g(this.f69380b, this.f69381c, i10, i11);
                this.f69382d = new Canvas();
                Bitmap bitmapCreateBitmap3 = Bitmap.createBitmap(i10, i11, Bitmap.Config.ARGB_8888);
                this.f69398t = new SoftReference<>(bitmapCreateBitmap3);
                this.f69382d.setBitmap(bitmapCreateBitmap3);
                Paint paint = new Paint(1);
                this.f69383e = paint;
                paint.setColor(this.f69384f);
                this.f69385g = true;
            }
        }
    }

    private void i(Context context, AttributeSet attributeSet, int i10) {
        if (PatchProxy.proxy(new Object[]{context, attributeSet, new Integer(i10)}, this, changeQuickRedirect, false, bb.c.f.up, new Class[]{Context.class, AttributeSet.class, Integer.TYPE}, Void.TYPE).isSupported) {
            return;
        }
        if (getScaleType() == ImageView.ScaleType.FIT_CENTER) {
            setScaleType(ImageView.ScaleType.CENTER_CROP);
        }
        Paint paint = new Paint(1);
        this.f69381c = paint;
        paint.setColor(j1.f21601t);
        Paint paint2 = new Paint();
        this.f69388j = paint2;
        paint2.setAntiAlias(true);
        this.f69388j.setStyle(Paint.Style.FILL);
    }

    public abstract void g(Canvas canvas, Paint paint, int i10, int i11);

    public abstract PorterDuffXfermode getPorterDuffXfermode();

    public void h() {
        if (PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, bb.c.f.zp, new Class[0], Void.TYPE).isSupported || this.f69380b == null) {
            return;
        }
        this.f69380b = null;
        int width = getWidth();
        int height = getHeight();
        d(width, height, width, height);
    }

    @Override // android.view.View
    public void invalidate() {
        if (PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, bb.c.f.wp, new Class[0], Void.TYPE).isSupported) {
            return;
        }
        this.f69385g = true;
        super.invalidate();
    }

    @Override // android.widget.ImageView, android.view.View
    public void onDraw(Canvas canvas) {
        Drawable drawable;
        if (PatchProxy.proxy(new Object[]{canvas}, this, changeQuickRedirect, false, bb.c.f.Bp, new Class[]{Canvas.class}, Void.TYPE).isSupported) {
            return;
        }
        if (this.f69387i) {
            if (this.f69386h) {
                this.f69392n.drawColor(0, PorterDuff.Mode.CLEAR);
                this.f69391m.draw(this.f69392n);
                this.f69388j.setXfermode(this.f69389k);
                this.f69392n.drawRect(0.0f, this.f69393o * getHeight(), getHeight(), getHeight(), this.f69388j);
                this.f69388j.setXfermode(this.f69390l);
                this.f69392n.drawRect(0.0f, 0.0f, getHeight(), this.f69393o * getHeight(), this.f69388j);
            } else {
                this.f69392n.drawColor(0, PorterDuff.Mode.CLEAR);
                this.f69391m.draw(this.f69392n);
                this.f69388j.setXfermode(this.f69389k);
                this.f69392n.drawRect(0.0f, 0.0f, this.f69394p * getHeight(), getHeight(), this.f69388j);
                this.f69388j.setXfermode(this.f69390l);
                this.f69392n.drawRect(this.f69394p * getHeight(), 0.0f, getHeight(), getHeight(), this.f69388j);
            }
        }
        if (isInEditMode()) {
            super.onDraw(canvas);
            return;
        }
        int iSaveLayer = canvas.saveLayer(0.0f, 0.0f, getWidth(), getHeight(), null, 31);
        try {
            try {
                if (this.f69385g && (drawable = getDrawable()) != null) {
                    this.f69385g = false;
                    Matrix imageMatrix = getImageMatrix();
                    if (imageMatrix == null) {
                        drawable.draw(this.f69382d);
                    } else {
                        int saveCount = this.f69382d.getSaveCount();
                        this.f69382d.save();
                        this.f69382d.concat(imageMatrix);
                        if (this.f69398t.get() == null) {
                            h();
                        }
                        this.f69398t.get().eraseColor(Color.parseColor("#00000000"));
                        drawable.draw(this.f69382d);
                        this.f69382d.restoreToCount(saveCount);
                    }
                    this.f69383e.reset();
                    this.f69383e.setFilterBitmap(false);
                    this.f69383e.setXfermode(getPorterDuffXfermode());
                    if (this.f69397s.get() == null) {
                        h();
                    }
                    Bitmap bitmap = this.f69397s.get();
                    if (bitmap != null) {
                        this.f69382d.drawBitmap(bitmap, 0.0f, 0.0f, this.f69383e);
                    }
                }
                if (!this.f69385g) {
                    this.f69383e.setXfermode(null);
                    if (this.f69398t.get() == null) {
                        h();
                    }
                    Bitmap bitmap2 = this.f69398t.get();
                    if (bitmap2 != null) {
                        canvas.drawBitmap(bitmap2, 0.0f, 0.0f, this.f69383e);
                    }
                    if (this.f69387i) {
                        if (this.f69396r.get() == null) {
                            h();
                        }
                        Bitmap bitmap3 = this.f69396r.get();
                        if (bitmap3 != null) {
                            canvas.drawBitmap(bitmap3, 0.0f, 0.0f, this.f69383e);
                        }
                    }
                }
            } catch (Exception e10) {
                Log.e(f69379u, "Exception occured while drawing " + getId(), e10);
            }
        } finally {
            canvas.restoreToCount(iSaveLayer);
        }
    }

    @Override // android.widget.ImageView, android.view.View
    public void onMeasure(int i10, int i11) {
        Object[] objArr = {new Integer(i10), new Integer(i11)};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        Class cls = Integer.TYPE;
        if (PatchProxy.proxy(objArr, this, changeQuickRedirect2, false, bb.c.f.Cp, new Class[]{cls, cls}, Void.TYPE).isSupported) {
            return;
        }
        if (i10 == 0) {
            i10 = 50;
        }
        if (i11 == 0) {
            i11 = 50;
        }
        super.onMeasure(i10, i11);
    }

    @Override // android.view.View
    public void onSizeChanged(int i10, int i11, int i12, int i13) {
        Object[] objArr = {new Integer(i10), new Integer(i11), new Integer(i12), new Integer(i13)};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        Class cls = Integer.TYPE;
        if (PatchProxy.proxy(objArr, this, changeQuickRedirect2, false, bb.c.f.xp, new Class[]{cls, cls, cls, cls}, Void.TYPE).isSupported) {
            return;
        }
        super.onSizeChanged(i10, i11, i12, i13);
        d(i10, i11, i12, i13);
    }

    public void setAllowProcess(boolean z10) {
        this.f69387i = z10;
    }

    public void setCoverDrawable(int i10, int i11) {
        Object[] objArr = {new Integer(i10), new Integer(i11)};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        Class cls = Integer.TYPE;
        if (PatchProxy.proxy(objArr, this, changeQuickRedirect2, false, bb.c.f.yp, new Class[]{cls, cls}, Void.TYPE).isSupported) {
            return;
        }
        Drawable drawableG = i.g(getContext().getResources(), R.drawable.ic_upvote_24, null);
        this.f69391m = drawableG;
        drawableG.setBounds(0, 0, i10, i11);
    }

    public void setMaskColor(int i10) {
        if (PatchProxy.proxy(new Object[]{new Integer(i10)}, this, changeQuickRedirect, false, bb.c.f.Dp, new Class[]{Integer.TYPE}, Void.TYPE).isSupported) {
            return;
        }
        this.f69395q = i10;
        this.f69388j.setColor(i10);
        invalidate();
    }

    public void setSrcColor(int i10) {
        if (PatchProxy.proxy(new Object[]{new Integer(i10)}, this, changeQuickRedirect, false, bb.c.f.vp, new Class[]{Integer.TYPE}, Void.TYPE).isSupported) {
            return;
        }
        this.f69384f = i10;
        setImageDrawable(new ColorDrawable(i10));
        Paint paint = this.f69383e;
        if (paint != null) {
            paint.setColor(i10);
            invalidate();
        }
    }
}
