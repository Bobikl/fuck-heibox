package com.tencent.rtmp.ui;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Rect;
import android.util.AttributeSet;
import android.view.View;
import android.view.animation.ScaleAnimation;

/* JADX INFO: loaded from: classes4.dex */
public class FocusIndicatorView extends View {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    final ScaleAnimation f102097a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final Paint f102098b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final int f102099c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final Rect f102100d;

    public FocusIndicatorView(Context context) {
        this(context, null);
    }

    public FocusIndicatorView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public FocusIndicatorView(Context context, AttributeSet attributeSet, int i10) {
        super(context, attributeSet, i10);
        this.f102100d = new Rect();
        int i11 = (int) ((getResources().getDisplayMetrics().density * 1.0f) + 0.5f);
        this.f102099c = i11;
        Paint paint = new Paint();
        this.f102098b = paint;
        paint.setColor(-1);
        paint.setStyle(Paint.Style.STROKE);
        paint.setStrokeWidth(i11);
        ScaleAnimation scaleAnimation = new ScaleAnimation(1.3f, 1.0f, 1.3f, 1.0f, 1, 0.5f, 1, 0.5f);
        this.f102097a = scaleAnimation;
        scaleAnimation.setDuration(200L);
    }

    @Override // android.view.View
    protected void onDraw(Canvas canvas) {
        int i10 = this.f102099c / 2;
        Rect rect = this.f102100d;
        rect.left = i10;
        rect.top = i10;
        rect.right = getWidth() - i10;
        this.f102100d.bottom = getHeight() - i10;
        canvas.drawRect(this.f102100d, this.f102098b);
    }
}
