package androidx.legacy.widget;

import android.annotation.SuppressLint;
import android.content.Context;
import android.graphics.Canvas;
import android.util.AttributeSet;
import android.view.View;
import androidx.annotation.n0;
import androidx.annotation.p0;

/* JADX INFO: loaded from: classes6.dex */
@Deprecated
public class Space extends View {
    @Deprecated
    public Space(@n0 Context context) {
        this(context, null);
    }

    @Deprecated
    public Space(@n0 Context context, @p0 AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    @Deprecated
    public Space(@n0 Context context, @p0 AttributeSet attributeSet, int i10) {
        super(context, attributeSet, i10);
        if (getVisibility() == 0) {
            setVisibility(4);
        }
    }

    private static int a(int i10, int i11) {
        int mode = View.MeasureSpec.getMode(i11);
        int size = View.MeasureSpec.getSize(i11);
        if (mode != Integer.MIN_VALUE) {
            return mode != 1073741824 ? i10 : size;
        }
        return Math.min(i10, size);
    }

    @Override // android.view.View
    @SuppressLint({"MissingSuperCall"})
    @Deprecated
    public void draw(Canvas canvas) {
    }

    @Override // android.view.View
    @Deprecated
    protected void onMeasure(int i10, int i11) {
        setMeasuredDimension(a(getSuggestedMinimumWidth(), i10), a(getSuggestedMinimumHeight(), i11));
    }
}
