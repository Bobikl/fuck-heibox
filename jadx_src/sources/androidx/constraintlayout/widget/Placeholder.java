package androidx.constraintlayout.widget;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.Typeface;
import android.util.AttributeSet;
import android.view.View;
import androidx.constraintlayout.core.widgets.ConstraintWidget;

/* JADX INFO: loaded from: classes.dex */
public class Placeholder extends View {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private int f19386b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private View f19387c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private int f19388d;

    public Placeholder(Context context) {
        super(context);
        this.f19386b = -1;
        this.f19387c = null;
        this.f19388d = 4;
        a(null);
    }

    public Placeholder(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f19386b = -1;
        this.f19387c = null;
        this.f19388d = 4;
        a(attributeSet);
    }

    public Placeholder(Context context, AttributeSet attributeSet, int i10) {
        super(context, attributeSet, i10);
        this.f19386b = -1;
        this.f19387c = null;
        this.f19388d = 4;
        a(attributeSet);
    }

    public Placeholder(Context context, AttributeSet attributeSet, int i10, int i11) {
        super(context, attributeSet, i10);
        this.f19386b = -1;
        this.f19387c = null;
        this.f19388d = 4;
        a(attributeSet);
    }

    private void a(AttributeSet attributeSet) {
        super.setVisibility(this.f19388d);
        this.f19386b = -1;
        if (attributeSet != null) {
            TypedArray typedArrayObtainStyledAttributes = getContext().obtainStyledAttributes(attributeSet, R.styleable.f19433w);
            int indexCount = typedArrayObtainStyledAttributes.getIndexCount();
            for (int i10 = 0; i10 < indexCount; i10++) {
                int index = typedArrayObtainStyledAttributes.getIndex(i10);
                if (index == R.styleable.ConstraintLayout_placeholder_content) {
                    this.f19386b = typedArrayObtainStyledAttributes.getResourceId(index, this.f19386b);
                } else if (index == R.styleable.ConstraintLayout_placeholder_placeholder_emptyVisibility) {
                    this.f19388d = typedArrayObtainStyledAttributes.getInt(index, this.f19388d);
                }
            }
            typedArrayObtainStyledAttributes.recycle();
        }
    }

    public void b(ConstraintLayout constraintLayout) {
        if (this.f19387c == null) {
            return;
        }
        ConstraintLayout.LayoutParams layoutParams = (ConstraintLayout.LayoutParams) getLayoutParams();
        ConstraintLayout.LayoutParams layoutParams2 = (ConstraintLayout.LayoutParams) this.f19387c.getLayoutParams();
        layoutParams2.f19327u0.V1(0);
        ConstraintWidget.DimensionBehaviour dimensionBehaviourH = layoutParams.f19327u0.H();
        ConstraintWidget.DimensionBehaviour dimensionBehaviour = ConstraintWidget.DimensionBehaviour.FIXED;
        if (dimensionBehaviourH != dimensionBehaviour) {
            layoutParams.f19327u0.W1(layoutParams2.f19327u0.j0());
        }
        if (layoutParams.f19327u0.g0() != dimensionBehaviour) {
            layoutParams.f19327u0.s1(layoutParams2.f19327u0.D());
        }
        layoutParams2.f19327u0.V1(8);
    }

    public void c(ConstraintLayout constraintLayout) {
        if (this.f19386b == -1 && !isInEditMode()) {
            setVisibility(this.f19388d);
        }
        View viewFindViewById = constraintLayout.findViewById(this.f19386b);
        this.f19387c = viewFindViewById;
        if (viewFindViewById != null) {
            ((ConstraintLayout.LayoutParams) viewFindViewById.getLayoutParams()).f19303i0 = true;
            this.f19387c.setVisibility(0);
            setVisibility(0);
        }
    }

    public View getContent() {
        return this.f19387c;
    }

    public int getEmptyVisibility() {
        return this.f19388d;
    }

    @Override // android.view.View
    public void onDraw(Canvas canvas) {
        if (isInEditMode()) {
            canvas.drawRGB(bb.c.b.f30852p1, bb.c.b.f30852p1, bb.c.b.f30852p1);
            Paint paint = new Paint();
            paint.setARGB(255, 210, 210, 210);
            paint.setTextAlign(Paint.Align.CENTER);
            paint.setTypeface(Typeface.create(Typeface.DEFAULT, 0));
            Rect rect = new Rect();
            canvas.getClipBounds(rect);
            paint.setTextSize(rect.height());
            int iHeight = rect.height();
            int iWidth = rect.width();
            paint.setTextAlign(Paint.Align.LEFT);
            paint.getTextBounds("?", 0, 1, rect);
            canvas.drawText("?", ((iWidth / 2.0f) - (rect.width() / 2.0f)) - rect.left, ((iHeight / 2.0f) + (rect.height() / 2.0f)) - rect.bottom, paint);
        }
    }

    public void setContentId(int i10) {
        View viewFindViewById;
        if (this.f19386b == i10) {
            return;
        }
        View view = this.f19387c;
        if (view != null) {
            view.setVisibility(0);
            ((ConstraintLayout.LayoutParams) this.f19387c.getLayoutParams()).f19303i0 = false;
            this.f19387c = null;
        }
        this.f19386b = i10;
        if (i10 == -1 || (viewFindViewById = ((View) getParent()).findViewById(i10)) == null) {
            return;
        }
        viewFindViewById.setVisibility(8);
    }

    public void setEmptyVisibility(int i10) {
        this.f19388d = i10;
    }
}
