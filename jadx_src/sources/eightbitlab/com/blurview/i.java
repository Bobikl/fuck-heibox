package eightbitlab.com.blurview;

import android.graphics.Bitmap;
import android.graphics.Rect;
import android.graphics.RenderEffect;
import android.graphics.Shader;
import android.graphics.drawable.BitmapDrawable;
import android.view.View;
import android.view.ViewTreeObserver;
import android.widget.FrameLayout;
import androidx.annotation.n0;
import androidx.annotation.w0;

/* JADX INFO: compiled from: RenderEffectBlur.java */
/* JADX INFO: loaded from: classes4.dex */
@w0(31)
public class i implements b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final View f118715a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final RenderEffectPrecision f118716b;

    /* JADX INFO: compiled from: RenderEffectBlur.java */
    public class a implements ViewTreeObserver.OnGlobalLayoutListener {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ BlurView f118717b;

        a(BlurView blurView) {
            this.f118717b = blurView;
        }

        @Override // android.view.ViewTreeObserver.OnGlobalLayoutListener
        public void onGlobalLayout() {
            this.f118717b.getViewTreeObserver().removeOnGlobalLayoutListener(this);
            this.f118717b.addView(i.this.f118715a, 0, new FrameLayout.LayoutParams(-1, this.f118717b.getMeasuredHeight()));
        }
    }

    public i(BlurView blurView, RenderEffectPrecision renderEffectPrecision) {
        this.f118715a = new View(blurView.getContext());
        this.f118716b = renderEffectPrecision;
        blurView.getViewTreeObserver().addOnGlobalLayoutListener(new a(blurView));
    }

    @Override // eightbitlab.com.blurview.b
    @n0
    public Bitmap.Config a() {
        return Bitmap.Config.ARGB_8888;
    }

    @Override // eightbitlab.com.blurview.b
    public boolean b() {
        return true;
    }

    @Override // eightbitlab.com.blurview.b
    public float c() {
        return this.f118716b == RenderEffectPrecision.EXACT ? 1.0f : 4.0f;
    }

    @Override // eightbitlab.com.blurview.b
    public Bitmap d(Bitmap bitmap, float f10) {
        if (this.f118715a.getBackground() == null) {
            this.f118715a.setBackground(new BitmapDrawable(this.f118715a.getResources(), bitmap));
        }
        this.f118715a.setRenderEffect(this.f118716b == RenderEffectPrecision.EXACT ? RenderEffect.createBlurEffect(f10, f10, Shader.TileMode.MIRROR) : RenderEffect.createBlurEffect(f10, f10, RenderEffect.createBitmapEffect(bitmap, null, new Rect(0, 0, this.f118715a.getWidth(), this.f118715a.getBottom())), Shader.TileMode.MIRROR));
        this.f118715a.invalidate();
        return bitmap;
    }

    @Override // eightbitlab.com.blurview.b
    public void destroy() {
    }
}
