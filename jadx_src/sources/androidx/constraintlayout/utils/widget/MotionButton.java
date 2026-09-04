package androidx.constraintlayout.utils.widget;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Outline;
import android.graphics.Path;
import android.graphics.RectF;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewOutlineProvider;
import androidx.annotation.w0;
import androidx.appcompat.widget.AppCompatButton;
import androidx.constraintlayout.widget.R;

/* JADX INFO: loaded from: classes.dex */
public class MotionButton extends AppCompatButton {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private float f19183e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private float f19184f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private Path f19185g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    ViewOutlineProvider f19186h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    RectF f19187i;

    public class a extends ViewOutlineProvider {
        a() {
        }

        @Override // android.view.ViewOutlineProvider
        public void getOutline(View view, Outline outline) {
            int width = MotionButton.this.getWidth();
            int height = MotionButton.this.getHeight();
            outline.setRoundRect(0, 0, width, height, (Math.min(width, height) * MotionButton.this.f19183e) / 2.0f);
        }
    }

    public class b extends ViewOutlineProvider {
        b() {
        }

        @Override // android.view.ViewOutlineProvider
        public void getOutline(View view, Outline outline) {
            outline.setRoundRect(0, 0, MotionButton.this.getWidth(), MotionButton.this.getHeight(), MotionButton.this.f19184f);
        }
    }

    public MotionButton(Context context) {
        super(context);
        this.f19183e = 0.0f;
        this.f19184f = Float.NaN;
        c(context, null);
    }

    public MotionButton(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f19183e = 0.0f;
        this.f19184f = Float.NaN;
        c(context, attributeSet);
    }

    public MotionButton(Context context, AttributeSet attributeSet, int i10) {
        super(context, attributeSet, i10);
        this.f19183e = 0.0f;
        this.f19184f = Float.NaN;
        c(context, attributeSet);
    }

    private void c(Context context, AttributeSet attributeSet) {
        setPadding(0, 0, 0, 0);
        if (attributeSet != null) {
            TypedArray typedArrayObtainStyledAttributes = getContext().obtainStyledAttributes(attributeSet, R.styleable.F);
            int indexCount = typedArrayObtainStyledAttributes.getIndexCount();
            for (int i10 = 0; i10 < indexCount; i10++) {
                int index = typedArrayObtainStyledAttributes.getIndex(i10);
                if (index == R.styleable.ImageFilterView_round) {
                    setRound(typedArrayObtainStyledAttributes.getDimension(index, 0.0f));
                } else if (index == R.styleable.ImageFilterView_roundPercent) {
                    setRoundPercent(typedArrayObtainStyledAttributes.getFloat(index, 0.0f));
                }
            }
            typedArrayObtainStyledAttributes.recycle();
        }
    }

    @Override // android.view.View
    public void draw(Canvas canvas) {
        super.draw(canvas);
    }

    public float getRound() {
        return this.f19184f;
    }

    public float getRoundPercent() {
        return this.f19183e;
    }

    @w0(21)
    public void setRound(float f10) {
        if (Float.isNaN(f10)) {
            this.f19184f = f10;
            float f11 = this.f19183e;
            this.f19183e = -1.0f;
            setRoundPercent(f11);
            return;
        }
        boolean z10 = this.f19184f != f10;
        this.f19184f = f10;
        if (f10 != 0.0f) {
            if (this.f19185g == null) {
                this.f19185g = new Path();
            }
            if (this.f19187i == null) {
                this.f19187i = new RectF();
            }
            if (this.f19186h == null) {
                b bVar = new b();
                this.f19186h = bVar;
                setOutlineProvider(bVar);
            }
            setClipToOutline(true);
            this.f19187i.set(0.0f, 0.0f, getWidth(), getHeight());
            this.f19185g.reset();
            Path path = this.f19185g;
            RectF rectF = this.f19187i;
            float f12 = this.f19184f;
            path.addRoundRect(rectF, f12, f12, Path.Direction.CW);
        } else {
            setClipToOutline(false);
        }
        if (z10) {
            invalidateOutline();
        }
    }

    @w0(21)
    public void setRoundPercent(float f10) {
        boolean z10 = this.f19183e != f10;
        this.f19183e = f10;
        if (f10 != 0.0f) {
            if (this.f19185g == null) {
                this.f19185g = new Path();
            }
            if (this.f19187i == null) {
                this.f19187i = new RectF();
            }
            if (this.f19186h == null) {
                a aVar = new a();
                this.f19186h = aVar;
                setOutlineProvider(aVar);
            }
            setClipToOutline(true);
            int width = getWidth();
            int height = getHeight();
            float fMin = (Math.min(width, height) * this.f19183e) / 2.0f;
            this.f19187i.set(0.0f, 0.0f, width, height);
            this.f19185g.reset();
            this.f19185g.addRoundRect(this.f19187i, fMin, fMin, Path.Direction.CW);
        } else {
            setClipToOutline(false);
        }
        if (z10) {
            invalidateOutline();
        }
    }
}
