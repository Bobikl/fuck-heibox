package androidx.appcompat.widget;

import android.content.Context;
import android.graphics.Canvas;
import android.util.AttributeSet;
import android.widget.SeekBar;
import androidx.appcompat.R;

/* JADX INFO: loaded from: classes.dex */
public class AppCompatSeekBar extends SeekBar {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final n f2429b;

    public AppCompatSeekBar(@androidx.annotation.n0 Context context) {
        this(context, null);
    }

    public AppCompatSeekBar(@androidx.annotation.n0 Context context, @androidx.annotation.p0 AttributeSet attributeSet) {
        this(context, attributeSet, R.attr.seekBarStyle);
    }

    public AppCompatSeekBar(@androidx.annotation.n0 Context context, @androidx.annotation.p0 AttributeSet attributeSet, int i10) {
        super(context, attributeSet, i10);
        s0.a(this, getContext());
        n nVar = new n(this);
        this.f2429b = nVar;
        nVar.c(attributeSet, i10);
    }

    @Override // android.widget.AbsSeekBar, android.widget.ProgressBar, android.view.View
    protected void drawableStateChanged() {
        super.drawableStateChanged();
        this.f2429b.h();
    }

    @Override // android.widget.AbsSeekBar, android.widget.ProgressBar, android.view.View
    public void jumpDrawablesToCurrentState() {
        super.jumpDrawablesToCurrentState();
        this.f2429b.l();
    }

    @Override // android.widget.AbsSeekBar, android.widget.ProgressBar, android.view.View
    protected synchronized void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        this.f2429b.g(canvas);
    }
}
