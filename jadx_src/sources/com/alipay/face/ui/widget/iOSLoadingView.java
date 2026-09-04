package com.alipay.face.ui.widget;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.graphics.Rect;
import android.util.AttributeSet;
import android.view.View;

/* JADX INFO: loaded from: classes6.dex */
public class iOSLoadingView extends View {

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private static final String f39102j = iOSLoadingView.class.getSimpleName();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private int f39103b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private int f39104c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private int f39105d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private int f39106e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private Paint f39107f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private int f39108g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private Rect f39109h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private String[] f39110i;

    public iOSLoadingView(Context context) {
        this(context, null);
    }

    public iOSLoadingView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public iOSLoadingView(Context context, AttributeSet attributeSet, int i10) {
        super(context, attributeSet, i10);
        this.f39108g = 0;
        this.f39110i = new String[]{"#bbbbbb", "#aaaaaa", "#999999", "#888888", "#777777", "#666666"};
        a();
    }

    private void a() {
        this.f39107f = new Paint(1);
    }

    @Override // android.view.View
    protected void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        if (this.f39109h == null) {
            int i10 = this.f39103b;
            int i11 = this.f39105d;
            this.f39109h = new Rect((i10 - i11) / 2, 0, (i10 + i11) / 2, this.f39106e);
        }
        for (int i12 = 0; i12 < 12; i12++) {
            int i13 = this.f39108g;
            if (i12 - i13 >= 5) {
                this.f39107f.setColor(Color.parseColor(this.f39110i[5]));
            } else if (i12 - i13 >= 0 && i12 - i13 < 5) {
                this.f39107f.setColor(Color.parseColor(this.f39110i[i12 - i13]));
            } else if (i12 - i13 >= -7 && i12 - i13 < 0) {
                this.f39107f.setColor(Color.parseColor(this.f39110i[5]));
            } else if (i12 - i13 >= -11 && i12 - i13 < -7) {
                this.f39107f.setColor(Color.parseColor(this.f39110i[(i12 + 12) - i13]));
            }
            canvas.drawRect(this.f39109h, this.f39107f);
            int i14 = this.f39103b;
            canvas.rotate(30.0f, i14 / 2, i14 / 2);
        }
        int i15 = this.f39108g + 1;
        this.f39108g = i15;
        if (i15 > 11) {
            this.f39108g = 0;
        }
        postInvalidateDelayed(100L);
    }

    @Override // android.view.View
    protected void onMeasure(int i10, int i11) {
        int mode = View.MeasureSpec.getMode(i10);
        int mode2 = View.MeasureSpec.getMode(i11);
        if (mode == Integer.MIN_VALUE || mode2 == Integer.MIN_VALUE) {
            this.f39103b = 200;
        } else {
            this.f39103b = View.MeasureSpec.getSize(i10);
            int size = View.MeasureSpec.getSize(i11);
            this.f39104c = size;
            this.f39103b = Math.min(this.f39103b, size);
        }
        int i12 = this.f39103b;
        int i13 = i12 / 12;
        this.f39105d = i13;
        this.f39106e = i13 * 4;
        setMeasuredDimension(i12, i12);
    }
}
