package androidx.cardview.widget;

import android.content.Context;
import android.content.res.ColorStateList;
import android.view.View;
import androidx.annotation.p0;
import androidx.annotation.w0;

/* JADX INFO: compiled from: CardViewApi21Impl.java */
/* JADX INFO: loaded from: classes.dex */
@w0(21)
public class b implements e {
    b() {
    }

    private f p(d dVar) {
        return (f) dVar.f();
    }

    @Override // androidx.cardview.widget.e
    public float a(d dVar) {
        return p(dVar).d();
    }

    @Override // androidx.cardview.widget.e
    public float b(d dVar) {
        return p(dVar).c();
    }

    @Override // androidx.cardview.widget.e
    public float c(d dVar) {
        return a(dVar) * 2.0f;
    }

    @Override // androidx.cardview.widget.e
    public float d(d dVar) {
        return dVar.h().getElevation();
    }

    @Override // androidx.cardview.widget.e
    public void e(d dVar) {
        if (!dVar.c()) {
            dVar.b(0, 0, 0, 0);
            return;
        }
        float fB = b(dVar);
        float fA = a(dVar);
        int iCeil = (int) Math.ceil(g.c(fB, fA, dVar.g()));
        int iCeil2 = (int) Math.ceil(g.d(fB, fA, dVar.g()));
        dVar.b(iCeil, iCeil2, iCeil, iCeil2);
    }

    @Override // androidx.cardview.widget.e
    public float f(d dVar) {
        return a(dVar) * 2.0f;
    }

    @Override // androidx.cardview.widget.e
    public void g(d dVar, float f10) {
        p(dVar).g(f10, dVar.c(), dVar.g());
        e(dVar);
    }

    @Override // androidx.cardview.widget.e
    public void h(d dVar, float f10) {
        p(dVar).h(f10);
    }

    @Override // androidx.cardview.widget.e
    public void i(d dVar, float f10) {
        dVar.h().setElevation(f10);
    }

    @Override // androidx.cardview.widget.e
    public ColorStateList j(d dVar) {
        return p(dVar).b();
    }

    @Override // androidx.cardview.widget.e
    public void k(d dVar) {
        g(dVar, b(dVar));
    }

    @Override // androidx.cardview.widget.e
    public void l(d dVar, Context context, ColorStateList colorStateList, float f10, float f11, float f12) {
        dVar.e(new f(colorStateList, f10));
        View viewH = dVar.h();
        viewH.setClipToOutline(true);
        viewH.setElevation(f11);
        g(dVar, f12);
    }

    @Override // androidx.cardview.widget.e
    public void m(d dVar) {
        g(dVar, b(dVar));
    }

    @Override // androidx.cardview.widget.e
    public void n() {
    }

    @Override // androidx.cardview.widget.e
    public void o(d dVar, @p0 ColorStateList colorStateList) {
        p(dVar).f(colorStateList);
    }
}
