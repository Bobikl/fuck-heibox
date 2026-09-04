package com.starlightc.ucropplus.view.widget;

import android.annotation.TargetApi;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Rect;
import android.text.TextUtils;
import android.util.AttributeSet;
import androidx.annotation.l;
import androidx.annotation.n0;
import androidx.appcompat.widget.AppCompatTextView;
import androidx.core.content.d;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.PatchProxyResult;
import com.starlightc.ucropplus.R;
import com.starlightc.ucropplus.model.AspectRatio;
import java.util.Locale;

/* JADX INFO: loaded from: classes4.dex */
public class AspectRatioTextView extends AppCompatTextView {
    public static ChangeQuickRedirect changeQuickRedirect;
    private final float MARGIN_MULTIPLIER;
    private float mAspectRatio;
    private String mAspectRatioTitle;
    private float mAspectRatioX;
    private float mAspectRatioY;
    private final Rect mCanvasClipBounds;
    private Paint mDotPaint;
    private int mDotSize;

    public AspectRatioTextView(Context context) {
        this(context, null);
    }

    public AspectRatioTextView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public AspectRatioTextView(Context context, AttributeSet attributeSet, int i10) {
        super(context, attributeSet, i10);
        this.MARGIN_MULTIPLIER = 1.5f;
        this.mCanvasClipBounds = new Rect();
        init(context.obtainStyledAttributes(attributeSet, R.styleable.ucrop_AspectRatioTextView));
    }

    @TargetApi(21)
    public AspectRatioTextView(Context context, AttributeSet attributeSet, int i10, int i11) {
        super(context, attributeSet, i10);
        this.MARGIN_MULTIPLIER = 1.5f;
        this.mCanvasClipBounds = new Rect();
        init(context.obtainStyledAttributes(attributeSet, R.styleable.ucrop_AspectRatioTextView));
    }

    private void applyActiveColor(@l int i10) {
        if (PatchProxy.proxy(new Object[]{new Integer(i10)}, this, changeQuickRedirect, false, 51155, new Class[]{Integer.TYPE}, Void.TYPE).isSupported) {
            return;
        }
        Paint paint = this.mDotPaint;
        if (paint != null) {
            paint.setColor(i10);
        }
        setTextColor(new ColorStateList(new int[][]{new int[]{android.R.attr.state_selected}, new int[]{0}}, new int[]{i10, d.f(getContext(), R.color.ucrop_color_widget)}));
    }

    private void init(@n0 TypedArray typedArray) {
        if (PatchProxy.proxy(new Object[]{typedArray}, this, changeQuickRedirect, false, 51154, new Class[]{TypedArray.class}, Void.TYPE).isSupported) {
            return;
        }
        setGravity(1);
        this.mAspectRatioTitle = typedArray.getString(R.styleable.ucrop_AspectRatioTextView_ucrop_artv_ratio_title);
        this.mAspectRatioX = typedArray.getFloat(R.styleable.ucrop_AspectRatioTextView_ucrop_artv_ratio_x, 0.0f);
        float f10 = typedArray.getFloat(R.styleable.ucrop_AspectRatioTextView_ucrop_artv_ratio_y, 0.0f);
        this.mAspectRatioY = f10;
        float f11 = this.mAspectRatioX;
        if (f11 == 0.0f || f10 == 0.0f) {
            this.mAspectRatio = 0.0f;
        } else {
            this.mAspectRatio = f11 / f10;
        }
        this.mDotSize = getContext().getResources().getDimensionPixelSize(R.dimen.ucrop_size_dot_scale_text_view);
        Paint paint = new Paint(1);
        this.mDotPaint = paint;
        paint.setStyle(Paint.Style.FILL);
        setTitle();
        applyActiveColor(getResources().getColor(R.color.ucrop_color_widget_active));
        typedArray.recycle();
    }

    private void setTitle() {
        if (PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 51156, new Class[0], Void.TYPE).isSupported) {
            return;
        }
        if (TextUtils.isEmpty(this.mAspectRatioTitle)) {
            setText(String.format(Locale.US, "%d:%d", Integer.valueOf((int) this.mAspectRatioX), Integer.valueOf((int) this.mAspectRatioY)));
        } else {
            setText(this.mAspectRatioTitle);
        }
    }

    private void toggleAspectRatio() {
        if (this.mAspectRatio != 0.0f) {
            float f10 = this.mAspectRatioX;
            float f11 = this.mAspectRatioY;
            this.mAspectRatioX = f11;
            this.mAspectRatioY = f10;
            this.mAspectRatio = f11 / f10;
        }
    }

    public float getAspectRatio(boolean z10) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{new Byte(z10 ? (byte) 1 : (byte) 0)}, this, changeQuickRedirect, false, 51152, new Class[]{Boolean.TYPE}, Float.TYPE);
        if (patchProxyResultProxy.isSupported) {
            return ((Float) patchProxyResultProxy.result).floatValue();
        }
        if (z10) {
            toggleAspectRatio();
            setTitle();
        }
        return this.mAspectRatio;
    }

    @Override // android.widget.TextView, android.view.View
    public void onDraw(Canvas canvas) {
        if (PatchProxy.proxy(new Object[]{canvas}, this, changeQuickRedirect, false, 51153, new Class[]{Canvas.class}, Void.TYPE).isSupported) {
            return;
        }
        super.onDraw(canvas);
        if (isSelected()) {
            canvas.getClipBounds(this.mCanvasClipBounds);
            Rect rect = this.mCanvasClipBounds;
            float f10 = (rect.right - rect.left) / 2.0f;
            float f11 = rect.bottom - (rect.top / 2.0f);
            int i10 = this.mDotSize;
            canvas.drawCircle(f10, f11 - (i10 * 1.5f), i10 / 2.0f, this.mDotPaint);
        }
    }

    public void setActiveColor(@l int i10) {
        if (PatchProxy.proxy(new Object[]{new Integer(i10)}, this, changeQuickRedirect, false, 51150, new Class[]{Integer.TYPE}, Void.TYPE).isSupported) {
            return;
        }
        applyActiveColor(i10);
        invalidate();
    }

    public void setAspectRatio(@n0 AspectRatio aspectRatio) {
        if (PatchProxy.proxy(new Object[]{aspectRatio}, this, changeQuickRedirect, false, 51151, new Class[]{AspectRatio.class}, Void.TYPE).isSupported) {
            return;
        }
        this.mAspectRatioTitle = aspectRatio.getAspectRatioTitle();
        this.mAspectRatioX = aspectRatio.getAspectRatioX();
        float aspectRatioY = aspectRatio.getAspectRatioY();
        this.mAspectRatioY = aspectRatioY;
        float f10 = this.mAspectRatioX;
        if (f10 == 0.0f || aspectRatioY == 0.0f) {
            this.mAspectRatio = 0.0f;
        } else {
            this.mAspectRatio = f10 / aspectRatioY;
        }
        setTitle();
    }
}
