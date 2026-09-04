package com.github.penfeizhou.animation;

import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.DrawFilter;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.PaintFlagsDrawFilter;
import android.graphics.drawable.Drawable;
import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import android.util.Log;
import androidx.annotation.n0;
import androidx.annotation.p0;
import com.github.penfeizhou.animation.decode.FrameSeqDecoder;
import com.github.penfeizhou.animation.loader.d;
import java.lang.ref.WeakReference;
import java.nio.ByteBuffer;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

/* JADX INFO: compiled from: FrameAnimationDrawable.java */
/* JADX INFO: loaded from: classes6.dex */
public abstract class a<Decoder extends FrameSeqDecoder> extends Drawable implements androidx.vectordrawable.graphics.drawable.b, FrameSeqDecoder.i {

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private static final String f43145l = a.class.getSimpleName();

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private static final int f43146m = 1;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private static final int f43147n = 2;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final Paint f43148b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final Decoder f43149c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private DrawFilter f43150d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private Matrix f43151e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private Set<androidx.vectordrawable.graphics.drawable.b.a> f43152f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private Bitmap f43153g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private Handler f43154h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private Runnable f43155i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private boolean f43156j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private final Set<WeakReference<Drawable.Callback>> f43157k;

    /* JADX INFO: renamed from: com.github.penfeizhou.animation.a$a, reason: collision with other inner class name */
    /* JADX INFO: compiled from: FrameAnimationDrawable.java */
    public class HandlerC0365a extends Handler {
        HandlerC0365a(Looper looper) {
            super(looper);
        }

        @Override // android.os.Handler
        public void handleMessage(Message message) {
            int i10 = message.what;
            if (i10 == 1) {
                Iterator it = a.this.f43152f.iterator();
                while (it.hasNext()) {
                    ((androidx.vectordrawable.graphics.drawable.b.a) it.next()).c(a.this);
                }
            } else {
                if (i10 != 2) {
                    return;
                }
                Iterator it2 = a.this.f43152f.iterator();
                while (it2.hasNext()) {
                    ((androidx.vectordrawable.graphics.drawable.b.a) it2.next()).b(a.this);
                }
            }
        }
    }

    /* JADX INFO: compiled from: FrameAnimationDrawable.java */
    public class b implements Runnable {
        b() {
        }

        @Override // java.lang.Runnable
        public void run() {
            a.this.invalidateSelf();
        }
    }

    public a(Decoder decoder) {
        Paint paint = new Paint();
        this.f43148b = paint;
        this.f43150d = new PaintFlagsDrawFilter(0, 3);
        this.f43151e = new Matrix();
        this.f43152f = new HashSet();
        this.f43154h = new HandlerC0365a(Looper.getMainLooper());
        this.f43155i = new b();
        this.f43156j = true;
        this.f43157k = new HashSet();
        paint.setAntiAlias(true);
        this.f43149c = decoder;
    }

    public a(d dVar) {
        Paint paint = new Paint();
        this.f43148b = paint;
        this.f43150d = new PaintFlagsDrawFilter(0, 3);
        this.f43151e = new Matrix();
        this.f43152f = new HashSet();
        this.f43154h = new HandlerC0365a(Looper.getMainLooper());
        this.f43155i = new b();
        this.f43156j = true;
        this.f43157k = new HashSet();
        paint.setAntiAlias(true);
        this.f43149c = (Decoder) f(dVar, this);
    }

    private void h() {
        ArrayList arrayList = new ArrayList();
        Drawable.Callback callback = getCallback();
        boolean z10 = false;
        for (WeakReference<Drawable.Callback> weakReference : this.f43157k) {
            Drawable.Callback callback2 = weakReference.get();
            if (callback2 == null) {
                arrayList.add(weakReference);
            } else if (callback2 == callback) {
                z10 = true;
            } else {
                callback2.invalidateDrawable(this);
            }
        }
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            this.f43157k.remove((WeakReference) it.next());
        }
        if (z10) {
            return;
        }
        this.f43157k.add(new WeakReference<>(callback));
    }

    @Override // com.github.penfeizhou.animation.decode.FrameSeqDecoder.i
    public void a(ByteBuffer byteBuffer) {
        if (isRunning()) {
            Bitmap bitmap = this.f43153g;
            if (bitmap == null || bitmap.isRecycled()) {
                this.f43153g = Bitmap.createBitmap(this.f43149c.p().width() / this.f43149c.y(), this.f43149c.p().height() / this.f43149c.y(), Bitmap.Config.ARGB_8888);
            }
            byteBuffer.rewind();
            if (byteBuffer.remaining() < this.f43153g.getByteCount()) {
                Log.e(f43145l, "onRender:Buffer not large enough for pixels");
            } else {
                this.f43153g.copyPixelsFromBuffer(byteBuffer);
                this.f43154h.post(this.f43155i);
            }
        }
    }

    @Override // androidx.vectordrawable.graphics.drawable.b
    public boolean b(@n0 androidx.vectordrawable.graphics.drawable.b.a aVar) {
        return this.f43152f.remove(aVar);
    }

    @Override // androidx.vectordrawable.graphics.drawable.b
    public void c(@n0 androidx.vectordrawable.graphics.drawable.b.a aVar) {
        this.f43152f.add(aVar);
    }

    @Override // androidx.vectordrawable.graphics.drawable.b
    public void clearAnimationCallbacks() {
        this.f43152f.clear();
    }

    @Override // com.github.penfeizhou.animation.decode.FrameSeqDecoder.i
    public void d() {
        Message.obtain(this.f43154h, 2).sendToTarget();
    }

    @Override // android.graphics.drawable.Drawable
    public void draw(Canvas canvas) {
        Bitmap bitmap = this.f43153g;
        if (bitmap == null || bitmap.isRecycled()) {
            return;
        }
        canvas.setDrawFilter(this.f43150d);
        canvas.drawBitmap(this.f43153g, this.f43151e, this.f43148b);
    }

    protected abstract Decoder f(d dVar, FrameSeqDecoder.i iVar);

    public int g() {
        int iV = this.f43149c.v();
        Bitmap bitmap = this.f43153g;
        if (bitmap != null && !bitmap.isRecycled()) {
            iV += this.f43153g.getAllocationByteCount();
        }
        return Math.max(1, iV);
    }

    @Override // android.graphics.drawable.Drawable
    @p0
    public Drawable.Callback getCallback() {
        return super.getCallback();
    }

    @Override // android.graphics.drawable.Drawable
    public int getIntrinsicHeight() {
        try {
            return this.f43149c.p().height();
        } catch (Exception unused) {
            return 0;
        }
    }

    @Override // android.graphics.drawable.Drawable
    public int getIntrinsicWidth() {
        try {
            return this.f43149c.p().width();
        } catch (Exception unused) {
            return 0;
        }
    }

    @Override // android.graphics.drawable.Drawable
    public int getOpacity() {
        return -3;
    }

    public boolean i() {
        return this.f43149c.D();
    }

    @Override // android.graphics.drawable.Drawable
    public void invalidateSelf() {
        super.invalidateSelf();
        Iterator<WeakReference<Drawable.Callback>> it = this.f43157k.iterator();
        while (it.hasNext()) {
            Drawable.Callback callback = it.next().get();
            if (callback != null && callback != getCallback()) {
                callback.invalidateDrawable(this);
            }
        }
    }

    @Override // android.graphics.drawable.Animatable
    public boolean isRunning() {
        return this.f43149c.E();
    }

    public void j() {
        this.f43149c.G();
    }

    public void k() {
        Bitmap bitmap = this.f43153g;
        if (bitmap != null && !bitmap.isRecycled()) {
            this.f43153g.eraseColor(0);
        }
        this.f43149c.M();
    }

    public void l() {
        this.f43149c.N();
    }

    public void m(boolean z10) {
        this.f43156j = z10;
    }

    public void n(int i10) {
        this.f43149c.P(i10);
    }

    @Override // com.github.penfeizhou.animation.decode.FrameSeqDecoder.i
    public void onStart() {
        Message.obtain(this.f43154h, 1).sendToTarget();
    }

    @Override // android.graphics.drawable.Drawable
    public void setAlpha(int i10) {
        this.f43148b.setAlpha(i10);
    }

    @Override // android.graphics.drawable.Drawable
    public void setBounds(int i10, int i11, int i12, int i13) {
        super.setBounds(i10, i11, i12, i13);
        boolean zO = this.f43149c.O(getBounds().width(), getBounds().height());
        this.f43151e.setScale(((getBounds().width() * 1.0f) * this.f43149c.y()) / this.f43149c.p().width(), ((getBounds().height() * 1.0f) * this.f43149c.y()) / this.f43149c.p().height());
        if (zO) {
            this.f43153g = Bitmap.createBitmap(this.f43149c.p().width() / this.f43149c.y(), this.f43149c.p().height() / this.f43149c.y(), Bitmap.Config.ARGB_8888);
        }
    }

    @Override // android.graphics.drawable.Drawable
    public void setColorFilter(ColorFilter colorFilter) {
        this.f43148b.setColorFilter(colorFilter);
    }

    @Override // android.graphics.drawable.Drawable
    public boolean setVisible(boolean z10, boolean z11) {
        h();
        if (this.f43156j) {
            if (z10) {
                if (!isRunning()) {
                    start();
                }
            } else if (isRunning()) {
                stop();
            }
        }
        return super.setVisible(z10, z11);
    }

    @Override // android.graphics.drawable.Animatable
    public void start() {
        this.f43149c.m(this);
        if (this.f43156j) {
            this.f43149c.Q();
        } else {
            if (this.f43149c.E()) {
                return;
            }
            this.f43149c.Q();
        }
    }

    @Override // android.graphics.drawable.Animatable
    public void stop() {
        this.f43149c.K(this);
        if (this.f43156j) {
            this.f43149c.S();
        } else {
            this.f43149c.T();
        }
    }
}
