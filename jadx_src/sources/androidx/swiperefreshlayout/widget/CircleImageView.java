package androidx.swiperefreshlayout.widget;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.RadialGradient;
import android.graphics.Shader;
import android.graphics.drawable.ShapeDrawable;
import android.graphics.drawable.shapes.OvalShape;
import android.view.animation.Animation;
import android.widget.ImageView;
import androidx.core.content.d;
import androidx.core.view.j1;

/* JADX INFO: loaded from: classes6.dex */
public class CircleImageView extends ImageView {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private static final int f27503d = 503316480;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private static final int f27504e = 1023410176;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private static final float f27505f = 0.0f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private static final float f27506g = 1.75f;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private static final float f27507h = 3.5f;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private static final int f27508i = 4;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private Animation.AnimationListener f27509b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    int f27510c;

    public class a extends OvalShape {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private RadialGradient f27511b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private Paint f27512c = new Paint();

        a(int i10) {
            CircleImageView.this.f27510c = i10;
            a((int) rect().width());
        }

        private void a(int i10) {
            float f10 = i10 / 2;
            RadialGradient radialGradient = new RadialGradient(f10, f10, CircleImageView.this.f27510c, new int[]{CircleImageView.f27504e, 0}, (float[]) null, Shader.TileMode.CLAMP);
            this.f27511b = radialGradient;
            this.f27512c.setShader(radialGradient);
        }

        @Override // android.graphics.drawable.shapes.OvalShape, android.graphics.drawable.shapes.RectShape, android.graphics.drawable.shapes.Shape
        public void draw(Canvas canvas, Paint paint) {
            int width = CircleImageView.this.getWidth() / 2;
            float f10 = width;
            float height = CircleImageView.this.getHeight() / 2;
            canvas.drawCircle(f10, height, f10, this.f27512c);
            canvas.drawCircle(f10, height, width - CircleImageView.this.f27510c, paint);
        }

        @Override // android.graphics.drawable.shapes.RectShape, android.graphics.drawable.shapes.Shape
        protected void onResize(float f10, float f11) {
            super.onResize(f10, f11);
            a((int) f10);
        }
    }

    CircleImageView(Context context, int i10) {
        ShapeDrawable shapeDrawable;
        super(context);
        float f10 = getContext().getResources().getDisplayMetrics().density;
        int i11 = (int) (f27506g * f10);
        int i12 = (int) (0.0f * f10);
        this.f27510c = (int) (f27507h * f10);
        if (a()) {
            shapeDrawable = new ShapeDrawable(new OvalShape());
            j1.N1(this, f10 * 4.0f);
        } else {
            ShapeDrawable shapeDrawable2 = new ShapeDrawable(new a(this.f27510c));
            setLayerType(1, shapeDrawable2.getPaint());
            shapeDrawable2.getPaint().setShadowLayer(this.f27510c, i12, i11, f27503d);
            int i13 = this.f27510c;
            setPadding(i13, i13, i13, i13);
            shapeDrawable = shapeDrawable2;
        }
        shapeDrawable.getPaint().setColor(i10);
        j1.I1(this, shapeDrawable);
    }

    private boolean a() {
        return true;
    }

    @Override // android.view.View
    public void onAnimationEnd() {
        super.onAnimationEnd();
        Animation.AnimationListener animationListener = this.f27509b;
        if (animationListener != null) {
            animationListener.onAnimationEnd(getAnimation());
        }
    }

    @Override // android.view.View
    public void onAnimationStart() {
        super.onAnimationStart();
        Animation.AnimationListener animationListener = this.f27509b;
        if (animationListener != null) {
            animationListener.onAnimationStart(getAnimation());
        }
    }

    @Override // android.widget.ImageView, android.view.View
    protected void onMeasure(int i10, int i11) {
        super.onMeasure(i10, i11);
        if (a()) {
            return;
        }
        setMeasuredDimension(getMeasuredWidth() + (this.f27510c * 2), getMeasuredHeight() + (this.f27510c * 2));
    }

    public void setAnimationListener(Animation.AnimationListener animationListener) {
        this.f27509b = animationListener;
    }

    @Override // android.view.View
    public void setBackgroundColor(int i10) {
        if (getBackground() instanceof ShapeDrawable) {
            ((ShapeDrawable) getBackground()).getPaint().setColor(i10);
        }
    }

    public void setBackgroundColorRes(int i10) {
        setBackgroundColor(d.f(getContext(), i10));
    }
}
