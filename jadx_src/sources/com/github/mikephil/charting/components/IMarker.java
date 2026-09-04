package com.github.mikephil.charting.components;

import android.graphics.Canvas;
import com.github.mikephil.charting.data.Entry;
import com.github.mikephil.charting.highlight.Highlight;
import com.github.mikephil.charting.utils.MPPointF;

/* JADX INFO: loaded from: classes6.dex */
public interface IMarker {
    void draw(Canvas canvas, float f10, float f11);

    MPPointF getOffset();

    MPPointF getOffsetForDrawingAtPoint(float f10, float f11);

    void refreshContent(Entry entry, Highlight highlight);
}
