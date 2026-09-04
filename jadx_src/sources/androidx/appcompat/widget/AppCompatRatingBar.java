package androidx.appcompat.widget;

import android.content.Context;
import android.graphics.Bitmap;
import android.util.AttributeSet;
import android.view.View;
import android.widget.RatingBar;
import androidx.appcompat.R;

/* JADX INFO: loaded from: classes.dex */
public class AppCompatRatingBar extends RatingBar {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final k f2428b;

    public AppCompatRatingBar(@androidx.annotation.n0 Context context) {
        this(context, null);
    }

    public AppCompatRatingBar(@androidx.annotation.n0 Context context, @androidx.annotation.p0 AttributeSet attributeSet) {
        this(context, attributeSet, R.attr.ratingBarStyle);
    }

    public AppCompatRatingBar(@androidx.annotation.n0 Context context, @androidx.annotation.p0 AttributeSet attributeSet, int i10) {
        super(context, attributeSet, i10);
        s0.a(this, getContext());
        k kVar = new k(this);
        this.f2428b = kVar;
        kVar.c(attributeSet, i10);
    }

    @Override // android.widget.RatingBar, android.widget.AbsSeekBar, android.widget.ProgressBar, android.view.View
    protected synchronized void onMeasure(int i10, int i11) {
        super.onMeasure(i10, i11);
        Bitmap bitmapB = this.f2428b.b();
        if (bitmapB != null) {
            setMeasuredDimension(View.resolveSizeAndState(bitmapB.getWidth() * getNumStars(), i10, 0), getMeasuredHeight());
        }
    }
}
