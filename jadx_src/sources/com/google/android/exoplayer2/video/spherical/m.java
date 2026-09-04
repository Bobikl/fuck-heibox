package com.google.android.exoplayer2.video.spherical;

import android.content.Context;
import android.graphics.PointF;
import android.view.GestureDetector;
import android.view.MotionEvent;
import android.view.View;

/* JADX INFO: compiled from: TouchTracker.java */
/* JADX INFO: loaded from: classes7.dex */
public final class m extends GestureDetector.SimpleOnGestureListener implements View.OnTouchListener, d.a {

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    static final float f51946h = 45.0f;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final a f51949d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final float f51950e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final GestureDetector f51951f;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final PointF f51947b = new PointF();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final PointF f51948c = new PointF();

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private volatile float f51952g = 3.1415927f;

    /* JADX INFO: compiled from: TouchTracker.java */
    public interface a {
        void b(PointF pointF);

        boolean onSingleTapUp(MotionEvent motionEvent);
    }

    public m(Context context, a aVar, float f10) {
        this.f51949d = aVar;
        this.f51950e = f10;
        this.f51951f = new GestureDetector(context, this);
    }

    @Override // com.google.android.exoplayer2.video.spherical.d.a
    @androidx.annotation.g
    public void a(float[] fArr, float f10) {
        this.f51952g = -f10;
    }

    @Override // android.view.GestureDetector.SimpleOnGestureListener, android.view.GestureDetector.OnGestureListener
    public boolean onDown(MotionEvent motionEvent) {
        this.f51947b.set(motionEvent.getX(), motionEvent.getY());
        return true;
    }

    @Override // android.view.GestureDetector.SimpleOnGestureListener, android.view.GestureDetector.OnGestureListener
    public boolean onScroll(MotionEvent motionEvent, MotionEvent motionEvent2, float f10, float f11) {
        float x10 = (motionEvent2.getX() - this.f51947b.x) / this.f51950e;
        float y10 = motionEvent2.getY();
        PointF pointF = this.f51947b;
        float f12 = (y10 - pointF.y) / this.f51950e;
        pointF.set(motionEvent2.getX(), motionEvent2.getY());
        double d10 = this.f51952g;
        float fCos = (float) Math.cos(d10);
        float fSin = (float) Math.sin(d10);
        PointF pointF2 = this.f51948c;
        pointF2.x -= (fCos * x10) - (fSin * f12);
        float f13 = pointF2.y + (fSin * x10) + (fCos * f12);
        pointF2.y = f13;
        pointF2.y = Math.max(-45.0f, Math.min(f51946h, f13));
        this.f51949d.b(this.f51948c);
        return true;
    }

    @Override // android.view.GestureDetector.SimpleOnGestureListener, android.view.GestureDetector.OnGestureListener
    public boolean onSingleTapUp(MotionEvent motionEvent) {
        return this.f51949d.onSingleTapUp(motionEvent);
    }

    @Override // android.view.View.OnTouchListener
    public boolean onTouch(View view, MotionEvent motionEvent) {
        return this.f51951f.onTouchEvent(motionEvent);
    }
}
