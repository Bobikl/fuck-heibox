package com.scwang.smartrefresh.layout.header;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.DashPathEffect;
import android.graphics.Paint;
import android.util.AttributeSet;
import android.view.View;
import android.widget.TextView;
import androidx.annotation.n0;
import com.scwang.smartrefresh.layout.R;
import com.scwang.smartrefresh.layout.internal.InternalAbstract;
import com.scwang.smartrefresh.layout.util.b;
import ng.g;
import ng.i;
import ng.j;

/* JADX INFO: loaded from: classes8.dex */
public class FalsifyHeader extends InternalAbstract implements g {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    protected i f96737e;

    public FalsifyHeader(Context context) {
        this(context, null);
    }

    public FalsifyHeader(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, 0);
    }

    @Override // com.scwang.smartrefresh.layout.internal.InternalAbstract, ng.h
    public void b(@n0 i iVar, int i10, int i11) {
        this.f96737e = iVar;
    }

    @Override // android.view.ViewGroup, android.view.View
    protected void dispatchDraw(Canvas canvas) {
        super.dispatchDraw(canvas);
        if (isInEditMode()) {
            int iD = b.d(5.0f);
            Context context = getContext();
            Paint paint = new Paint();
            paint.setStyle(Paint.Style.STROKE);
            paint.setColor(-858993460);
            paint.setStrokeWidth(b.d(1.0f));
            float f10 = iD;
            paint.setPathEffect(new DashPathEffect(new float[]{f10, f10, f10, f10}, 1.0f));
            canvas.drawRect(f10, f10, getWidth() - iD, getBottom() - iD, paint);
            TextView textView = new TextView(context);
            textView.setText(context.getString(R.string.srl_component_falsify, getClass().getSimpleName(), Float.valueOf(b.j(getHeight()))));
            textView.setTextColor(-858993460);
            textView.setGravity(17);
            textView.measure(View.MeasureSpec.makeMeasureSpec(getWidth(), 1073741824), View.MeasureSpec.makeMeasureSpec(getHeight(), 1073741824));
            textView.layout(0, 0, getWidth(), getHeight());
            textView.draw(canvas);
        }
    }

    @Override // com.scwang.smartrefresh.layout.internal.InternalAbstract, ng.h
    public void o(@n0 j jVar, int i10, int i11) {
        if (this.f96737e != null) {
            jVar.x();
        }
    }
}
