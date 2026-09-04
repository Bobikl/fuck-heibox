package androidx.constraintlayout.utils.widget;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.graphics.Rect;
import android.util.AttributeSet;
import android.view.View;
import androidx.constraintlayout.widget.R;

/* JADX INFO: loaded from: classes.dex */
public class MockView extends View {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private Paint f19172b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private Paint f19173c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private Paint f19174d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private boolean f19175e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private boolean f19176f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    protected String f19177g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private Rect f19178h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private int f19179i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private int f19180j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private int f19181k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private int f19182l;

    public MockView(Context context) {
        super(context);
        this.f19172b = new Paint();
        this.f19173c = new Paint();
        this.f19174d = new Paint();
        this.f19175e = true;
        this.f19176f = true;
        this.f19177g = null;
        this.f19178h = new Rect();
        this.f19179i = Color.argb(255, 0, 0, 0);
        this.f19180j = Color.argb(255, 200, 200, 200);
        this.f19181k = Color.argb(255, 50, 50, 50);
        this.f19182l = 4;
        a(context, null);
    }

    public MockView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f19172b = new Paint();
        this.f19173c = new Paint();
        this.f19174d = new Paint();
        this.f19175e = true;
        this.f19176f = true;
        this.f19177g = null;
        this.f19178h = new Rect();
        this.f19179i = Color.argb(255, 0, 0, 0);
        this.f19180j = Color.argb(255, 200, 200, 200);
        this.f19181k = Color.argb(255, 50, 50, 50);
        this.f19182l = 4;
        a(context, attributeSet);
    }

    public MockView(Context context, AttributeSet attributeSet, int i10) {
        super(context, attributeSet, i10);
        this.f19172b = new Paint();
        this.f19173c = new Paint();
        this.f19174d = new Paint();
        this.f19175e = true;
        this.f19176f = true;
        this.f19177g = null;
        this.f19178h = new Rect();
        this.f19179i = Color.argb(255, 0, 0, 0);
        this.f19180j = Color.argb(255, 200, 200, 200);
        this.f19181k = Color.argb(255, 50, 50, 50);
        this.f19182l = 4;
        a(context, attributeSet);
    }

    private void a(Context context, AttributeSet attributeSet) {
        if (attributeSet != null) {
            TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, R.styleable.V);
            int indexCount = typedArrayObtainStyledAttributes.getIndexCount();
            for (int i10 = 0; i10 < indexCount; i10++) {
                int index = typedArrayObtainStyledAttributes.getIndex(i10);
                if (index == R.styleable.MockView_mock_label) {
                    this.f19177g = typedArrayObtainStyledAttributes.getString(index);
                } else if (index == R.styleable.MockView_mock_showDiagonals) {
                    this.f19175e = typedArrayObtainStyledAttributes.getBoolean(index, this.f19175e);
                } else if (index == R.styleable.MockView_mock_diagonalsColor) {
                    this.f19179i = typedArrayObtainStyledAttributes.getColor(index, this.f19179i);
                } else if (index == R.styleable.MockView_mock_labelBackgroundColor) {
                    this.f19181k = typedArrayObtainStyledAttributes.getColor(index, this.f19181k);
                } else if (index == R.styleable.MockView_mock_labelColor) {
                    this.f19180j = typedArrayObtainStyledAttributes.getColor(index, this.f19180j);
                } else if (index == R.styleable.MockView_mock_showLabel) {
                    this.f19176f = typedArrayObtainStyledAttributes.getBoolean(index, this.f19176f);
                }
            }
            typedArrayObtainStyledAttributes.recycle();
        }
        if (this.f19177g == null) {
            try {
                this.f19177g = context.getResources().getResourceEntryName(getId());
            } catch (Exception unused) {
            }
        }
        this.f19172b.setColor(this.f19179i);
        this.f19172b.setAntiAlias(true);
        this.f19173c.setColor(this.f19180j);
        this.f19173c.setAntiAlias(true);
        this.f19174d.setColor(this.f19181k);
        this.f19182l = Math.round(this.f19182l * (getResources().getDisplayMetrics().xdpi / 160.0f));
    }

    @Override // android.view.View
    public void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        int width = getWidth();
        int height = getHeight();
        if (this.f19175e) {
            width--;
            height--;
            float f10 = width;
            float f11 = height;
            canvas.drawLine(0.0f, 0.0f, f10, f11, this.f19172b);
            canvas.drawLine(0.0f, f11, f10, 0.0f, this.f19172b);
            canvas.drawLine(0.0f, 0.0f, f10, 0.0f, this.f19172b);
            canvas.drawLine(f10, 0.0f, f10, f11, this.f19172b);
            canvas.drawLine(f10, f11, 0.0f, f11, this.f19172b);
            canvas.drawLine(0.0f, f11, 0.0f, 0.0f, this.f19172b);
        }
        String str = this.f19177g;
        if (str == null || !this.f19176f) {
            return;
        }
        this.f19173c.getTextBounds(str, 0, str.length(), this.f19178h);
        float fWidth = (width - this.f19178h.width()) / 2.0f;
        float fHeight = ((height - this.f19178h.height()) / 2.0f) + this.f19178h.height();
        this.f19178h.offset((int) fWidth, (int) fHeight);
        Rect rect = this.f19178h;
        int i10 = rect.left;
        int i11 = this.f19182l;
        rect.set(i10 - i11, rect.top - i11, rect.right + i11, rect.bottom + i11);
        canvas.drawRect(this.f19178h, this.f19174d);
        canvas.drawText(this.f19177g, fWidth, fHeight, this.f19173c);
    }
}
