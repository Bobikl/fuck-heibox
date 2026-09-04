package com.google.android.exoplayer2.ui;

import android.content.Context;
import android.graphics.Canvas;
import android.util.AttributeSet;
import android.view.View;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* JADX INFO: loaded from: classes7.dex */
public final class CanvasSubtitleOutput extends View implements SubtitleView.a {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final List<q0> f50395b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private List<com.google.android.exoplayer2.text.b> f50396c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private int f50397d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private float f50398e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private e f50399f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private float f50400g;

    public CanvasSubtitleOutput(Context context) {
        this(context, null);
    }

    public CanvasSubtitleOutput(Context context, @androidx.annotation.p0 AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f50395b = new ArrayList();
        this.f50396c = Collections.emptyList();
        this.f50397d = 0;
        this.f50398e = 0.0533f;
        this.f50399f = e.f50717m;
        this.f50400g = 0.08f;
    }

    private static com.google.android.exoplayer2.text.b b(com.google.android.exoplayer2.text.b bVar) {
        com.google.android.exoplayer2.text.b.c cVarB = bVar.c().w(-3.4028235E38f).x(Integer.MIN_VALUE).B(null);
        if (bVar.f49378g == 0) {
            cVarB.t(1.0f - bVar.f49377f, 0);
        } else {
            cVarB.t((-bVar.f49377f) - 1.0f, 1);
        }
        int i10 = bVar.f49379h;
        if (i10 == 0) {
            cVarB.u(2);
        } else if (i10 == 2) {
            cVarB.u(0);
        }
        return cVarB.a();
    }

    @Override // com.google.android.exoplayer2.ui.SubtitleView.a
    public void a(List<com.google.android.exoplayer2.text.b> list, e eVar, float f10, int i10, float f11) {
        this.f50396c = list;
        this.f50399f = eVar;
        this.f50398e = f10;
        this.f50397d = i10;
        this.f50400g = f11;
        while (this.f50395b.size() < list.size()) {
            this.f50395b.add(new q0(getContext()));
        }
        invalidate();
    }

    @Override // android.view.View
    public void dispatchDraw(Canvas canvas) {
        List<com.google.android.exoplayer2.text.b> list = this.f50396c;
        if (list.isEmpty()) {
            return;
        }
        int height = getHeight();
        int paddingLeft = getPaddingLeft();
        int paddingTop = getPaddingTop();
        int width = getWidth() - getPaddingRight();
        int paddingBottom = height - getPaddingBottom();
        if (paddingBottom <= paddingTop || width <= paddingLeft) {
            return;
        }
        int i10 = paddingBottom - paddingTop;
        float fH = t0.h(this.f50397d, this.f50398e, height, i10);
        if (fH <= 0.0f) {
            return;
        }
        int size = list.size();
        int i11 = 0;
        while (i11 < size) {
            com.google.android.exoplayer2.text.b bVarB = list.get(i11);
            if (bVarB.f49388q != Integer.MIN_VALUE) {
                bVarB = b(bVarB);
            }
            com.google.android.exoplayer2.text.b bVar = bVarB;
            int i12 = paddingBottom;
            this.f50395b.get(i11).b(bVar, this.f50399f, fH, t0.h(bVar.f49386o, bVar.f49387p, height, i10), this.f50400g, canvas, paddingLeft, paddingTop, width, i12);
            i11++;
            size = size;
            i10 = i10;
            paddingBottom = i12;
            width = width;
        }
    }
}
