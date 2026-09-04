package eightbitlab.com.blurview;

import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.drawable.Drawable;
import android.view.ViewGroup;
import android.view.ViewTreeObserver;
import androidx.annotation.l;
import androidx.annotation.n0;
import androidx.annotation.p0;

/* JADX INFO: compiled from: BlockingBlurController.java */
/* JADX INFO: loaded from: classes4.dex */
public final class a implements c {

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    @l
    static final int f118694q = 0;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private d f118697e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private Bitmap f118698f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    final BlurView f118699g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private int f118700h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private final ViewGroup f118701i;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private boolean f118706n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    @p0
    private Drawable f118707o;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private float f118695c = 16.0f;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private final int[] f118702j = new int[2];

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private final int[] f118703k = new int[2];

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private final ViewTreeObserver.OnPreDrawListener f118704l = new ViewTreeObserverOnPreDrawListenerC1070a();

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private boolean f118705m = true;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    private final Paint f118708p = new Paint(2);

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private b f118696d = new g();

    /* JADX INFO: renamed from: eightbitlab.com.blurview.a$a, reason: collision with other inner class name */
    /* JADX INFO: compiled from: BlockingBlurController.java */
    public class ViewTreeObserverOnPreDrawListenerC1070a implements ViewTreeObserver.OnPreDrawListener {
        ViewTreeObserverOnPreDrawListenerC1070a() {
        }

        @Override // android.view.ViewTreeObserver.OnPreDrawListener
        public boolean onPreDraw() {
            a.this.l();
            return true;
        }
    }

    a(@n0 BlurView blurView, @n0 ViewGroup viewGroup, @l int i10) {
        this.f118701i = viewGroup;
        this.f118699g = blurView;
        this.f118700h = i10;
        j(blurView.getMeasuredWidth(), blurView.getMeasuredHeight());
    }

    private void i() {
        this.f118698f = this.f118696d.d(this.f118698f, this.f118695c);
        if (this.f118696d.b()) {
            return;
        }
        this.f118697e.setBitmap(this.f118698f);
    }

    private void k() {
        this.f118701i.getLocationOnScreen(this.f118702j);
        this.f118699g.getLocationOnScreen(this.f118703k);
        int[] iArr = this.f118703k;
        int i10 = iArr[0];
        int[] iArr2 = this.f118702j;
        int i11 = i10 - iArr2[0];
        int i12 = iArr[1] - iArr2[1];
        float height = this.f118699g.getHeight() / this.f118698f.getHeight();
        float width = this.f118699g.getWidth() / this.f118698f.getWidth();
        this.f118697e.translate((-i11) / width, (-i12) / height);
        this.f118697e.scale(1.0f / width, 1.0f / height);
    }

    @Override // eightbitlab.com.blurview.e
    public e a(boolean z10) {
        this.f118705m = z10;
        e(z10);
        this.f118699g.invalidate();
        return this;
    }

    @Override // eightbitlab.com.blurview.c
    public void b() {
        j(this.f118699g.getMeasuredWidth(), this.f118699g.getMeasuredHeight());
    }

    @Override // eightbitlab.com.blurview.e
    public e c(float f10) {
        this.f118695c = f10;
        return this;
    }

    @Override // eightbitlab.com.blurview.e
    public e d(int i10) {
        if (this.f118700h != i10) {
            this.f118700h = i10;
            this.f118699g.invalidate();
        }
        return this;
    }

    @Override // eightbitlab.com.blurview.c
    public void destroy() {
        e(false);
        this.f118696d.destroy();
        this.f118706n = false;
    }

    @Override // eightbitlab.com.blurview.c
    public boolean draw(Canvas canvas) {
        if (this.f118705m && this.f118706n) {
            if (canvas instanceof d) {
                return false;
            }
            l();
            if (!(this.f118696d instanceof i)) {
                float height = this.f118699g.getHeight() / this.f118698f.getHeight();
                float width = this.f118699g.getWidth() / this.f118698f.getWidth();
                canvas.save();
                canvas.scale(width, height);
                canvas.drawBitmap(this.f118698f, 0.0f, 0.0f, this.f118708p);
                canvas.restore();
            }
            int i10 = this.f118700h;
            if (i10 != 0) {
                canvas.drawColor(i10);
            }
        }
        return true;
    }

    @Override // eightbitlab.com.blurview.e
    public e e(boolean z10) {
        this.f118701i.getViewTreeObserver().removeOnPreDrawListener(this.f118704l);
        if (z10) {
            this.f118701i.getViewTreeObserver().addOnPreDrawListener(this.f118704l);
        }
        return this;
    }

    @Override // eightbitlab.com.blurview.e
    public e f(@p0 Drawable drawable) {
        this.f118707o = drawable;
        return this;
    }

    @Override // eightbitlab.com.blurview.e
    @Deprecated
    public e g(boolean z10) {
        return this;
    }

    @Override // eightbitlab.com.blurview.e
    public e h(b bVar) {
        this.f118696d = bVar;
        return this;
    }

    void j(int i10, int i11) {
        k kVar = new k(this.f118696d.c());
        if (kVar.b(i10, i11)) {
            this.f118699g.setWillNotDraw(true);
            return;
        }
        this.f118699g.setWillNotDraw(false);
        k.a aVarD = kVar.d(i10, i11);
        this.f118698f = Bitmap.createBitmap(aVarD.f118726a, aVarD.f118727b, this.f118696d.a());
        this.f118697e = new d(this.f118698f);
        this.f118706n = true;
    }

    void l() {
        if (this.f118705m && this.f118706n) {
            Drawable drawable = this.f118707o;
            if (drawable == null) {
                this.f118698f.eraseColor(0);
            } else {
                drawable.draw(this.f118697e);
            }
            this.f118697e.save();
            k();
            this.f118701i.draw(this.f118697e);
            this.f118697e.restore();
            i();
        }
    }
}
