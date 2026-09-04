package com.umeng.message.proguard;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.widget.Button;
import androidx.core.view.j1;

/* JADX INFO: loaded from: classes4.dex */
public final class bd extends Button {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private Paint f105779a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private float f105780b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private float f105781c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private float f105782d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private float f105783e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private float f105784f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private int f105785g;

    public bd(Context context) {
        super(context);
        setBackgroundColor(0);
        this.f105779a = new Paint();
        this.f105785g = bb.a(1.0f);
        this.f105784f = bb.a(2.0f);
    }

    @Override // android.widget.TextView, android.view.View
    protected final void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        this.f105780b = getWidth() / 2;
        this.f105781c = getHeight() / 2;
        float fMin = (Math.min(getHeight(), getWidth()) / 2) - this.f105785g;
        this.f105782d = fMin;
        this.f105783e = fMin / 1.4142f;
        this.f105779a.setAntiAlias(true);
        this.f105779a.setColor(j1.f21601t);
        this.f105779a.setStyle(Paint.Style.FILL);
        canvas.drawCircle(this.f105780b, this.f105781c, this.f105782d, this.f105779a);
        this.f105779a.setColor(-1);
        this.f105779a.setStrokeWidth(this.f105784f);
        this.f105779a.setStyle(Paint.Style.STROKE);
        canvas.drawCircle(this.f105780b, this.f105781c, this.f105782d, this.f105779a);
        float f10 = this.f105780b;
        float f11 = this.f105783e;
        float f12 = this.f105781c;
        canvas.drawLine(f10 - f11, f12 - f11, f10 + f11, f12 + f11, this.f105779a);
        float f13 = this.f105780b;
        float f14 = this.f105783e;
        float f15 = this.f105781c;
        canvas.drawLine(f13 + f14, f15 - f14, f13 - f14, f15 + f14, this.f105779a);
    }
}
