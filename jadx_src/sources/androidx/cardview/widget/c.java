package androidx.cardview.widget;

import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.RectF;
import androidx.annotation.p0;

/* JADX INFO: compiled from: CardViewBaseImpl.java */
/* JADX INFO: loaded from: classes.dex */
public class c implements e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    final RectF f3385a = new RectF();

    /* JADX INFO: compiled from: CardViewBaseImpl.java */
    public class a implements g.a {
        a() {
        }

        @Override // androidx.cardview.widget.g.a
        public void a(Canvas canvas, RectF rectF, float f10, Paint paint) {
            float f11 = 2.0f * f10;
            float fWidth = (rectF.width() - f11) - 1.0f;
            float fHeight = (rectF.height() - f11) - 1.0f;
            if (f10 >= 1.0f) {
                float f12 = f10 + 0.5f;
                float f13 = -f12;
                c.this.f3385a.set(f13, f13, f12, f12);
                int iSave = canvas.save();
                canvas.translate(rectF.left + f12, rectF.top + f12);
                canvas.drawArc(c.this.f3385a, 180.0f, 90.0f, true, paint);
                canvas.translate(fWidth, 0.0f);
                canvas.rotate(90.0f);
                canvas.drawArc(c.this.f3385a, 180.0f, 90.0f, true, paint);
                canvas.translate(fHeight, 0.0f);
                canvas.rotate(90.0f);
                canvas.drawArc(c.this.f3385a, 180.0f, 90.0f, true, paint);
                canvas.translate(fWidth, 0.0f);
                canvas.rotate(90.0f);
                canvas.drawArc(c.this.f3385a, 180.0f, 90.0f, true, paint);
                canvas.restoreToCount(iSave);
                float f14 = (rectF.left + f12) - 1.0f;
                float f15 = rectF.top;
                canvas.drawRect(f14, f15, (rectF.right - f12) + 1.0f, f15 + f12, paint);
                float f16 = (rectF.left + f12) - 1.0f;
                float f17 = rectF.bottom;
                canvas.drawRect(f16, f17 - f12, (rectF.right - f12) + 1.0f, f17, paint);
            }
            canvas.drawRect(rectF.left, rectF.top + f10, rectF.right, rectF.bottom - f10, paint);
        }
    }

    c() {
    }

    private g p(Context context, ColorStateList colorStateList, float f10, float f11, float f12) {
        return new g(context.getResources(), colorStateList, f10, f11, f12);
    }

    private g q(d dVar) {
        return (g) dVar.f();
    }

    @Override // androidx.cardview.widget.e
    public float a(d dVar) {
        return q(dVar).g();
    }

    @Override // androidx.cardview.widget.e
    public float b(d dVar) {
        return q(dVar).i();
    }

    @Override // androidx.cardview.widget.e
    public float c(d dVar) {
        return q(dVar).j();
    }

    @Override // androidx.cardview.widget.e
    public float d(d dVar) {
        return q(dVar).l();
    }

    @Override // androidx.cardview.widget.e
    public void e(d dVar) {
        Rect rect = new Rect();
        q(dVar).h(rect);
        dVar.d((int) Math.ceil(f(dVar)), (int) Math.ceil(c(dVar)));
        dVar.b(rect.left, rect.top, rect.right, rect.bottom);
    }

    @Override // androidx.cardview.widget.e
    public float f(d dVar) {
        return q(dVar).k();
    }

    @Override // androidx.cardview.widget.e
    public void g(d dVar, float f10) {
        q(dVar).q(f10);
        e(dVar);
    }

    @Override // androidx.cardview.widget.e
    public void h(d dVar, float f10) {
        q(dVar).p(f10);
        e(dVar);
    }

    @Override // androidx.cardview.widget.e
    public void i(d dVar, float f10) {
        q(dVar).r(f10);
    }

    @Override // androidx.cardview.widget.e
    public ColorStateList j(d dVar) {
        return q(dVar).f();
    }

    @Override // androidx.cardview.widget.e
    public void k(d dVar) {
        q(dVar).m(dVar.g());
        e(dVar);
    }

    @Override // androidx.cardview.widget.e
    public void l(d dVar, Context context, ColorStateList colorStateList, float f10, float f11, float f12) {
        g gVarP = p(context, colorStateList, f10, f11, f12);
        gVarP.m(dVar.g());
        dVar.e(gVarP);
        e(dVar);
    }

    @Override // androidx.cardview.widget.e
    public void m(d dVar) {
    }

    @Override // androidx.cardview.widget.e
    public void n() {
        g.f3400s = new a();
    }

    @Override // androidx.cardview.widget.e
    public void o(d dVar, @p0 ColorStateList colorStateList) {
        q(dVar).o(colorStateList);
    }
}
