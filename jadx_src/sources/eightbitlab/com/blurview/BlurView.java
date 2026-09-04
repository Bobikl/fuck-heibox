package eightbitlab.com.blurview;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.util.AttributeSet;
import android.util.Log;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import androidx.annotation.l;
import androidx.annotation.n0;

/* JADX INFO: loaded from: classes4.dex */
public class BlurView extends FrameLayout {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private static final String f118690d = BlurView.class.getSimpleName();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    c f118691b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @l
    private int f118692c;

    public BlurView(Context context) {
        super(context);
        this.f118691b = new h();
        a(null, 0);
    }

    public BlurView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f118691b = new h();
        a(attributeSet, 0);
    }

    public BlurView(Context context, AttributeSet attributeSet, int i10) {
        super(context, attributeSet, i10);
        this.f118691b = new h();
        a(attributeSet, i10);
    }

    private void a(AttributeSet attributeSet, int i10) {
        TypedArray typedArrayObtainStyledAttributes = getContext().obtainStyledAttributes(attributeSet, R.styleable.f118693a, i10, 0);
        this.f118692c = typedArrayObtainStyledAttributes.getColor(R.styleable.BlurView_blurOverlayColor, 0);
        typedArrayObtainStyledAttributes.recycle();
    }

    public e b(boolean z10) {
        return this.f118691b.e(z10);
    }

    public e c(boolean z10) {
        return this.f118691b.a(z10);
    }

    public e d(float f10) {
        return this.f118691b.c(f10);
    }

    @Override // android.view.View
    public void draw(Canvas canvas) {
        if (this.f118691b.draw(canvas)) {
            super.draw(canvas);
        }
    }

    public e e(@l int i10) {
        this.f118692c = i10;
        return this.f118691b.d(i10);
    }

    public e f(@n0 ViewGroup viewGroup) {
        a aVar = new a(this, viewGroup, this.f118692c);
        this.f118691b.destroy();
        this.f118691b = aVar;
        return aVar;
    }

    @Override // android.view.ViewGroup, android.view.View
    protected void onAttachedToWindow() {
        super.onAttachedToWindow();
        if (isHardwareAccelerated()) {
            this.f118691b.e(true);
        } else {
            Log.e(f118690d, "BlurView can't be used in not hardware-accelerated window!");
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    protected void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        this.f118691b.e(false);
    }

    @Override // android.view.View
    protected void onSizeChanged(int i10, int i11, int i12, int i13) {
        super.onSizeChanged(i10, i11, i12, i13);
        this.f118691b.b();
    }
}
