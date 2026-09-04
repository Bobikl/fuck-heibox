package androidx.transition;

import android.animation.TypeEvaluator;
import android.graphics.Rect;

/* JADX INFO: compiled from: RectEvaluator.java */
/* JADX INFO: loaded from: classes6.dex */
public class o implements TypeEvaluator<Rect> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private Rect f27893a;

    o() {
    }

    o(Rect rect) {
        this.f27893a = rect;
    }

    @Override // android.animation.TypeEvaluator
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public Rect evaluate(float f10, Rect rect, Rect rect2) {
        int i10 = rect.left;
        int i11 = i10 + ((int) ((rect2.left - i10) * f10));
        int i12 = rect.top;
        int i13 = i12 + ((int) ((rect2.top - i12) * f10));
        int i14 = rect.right;
        int i15 = i14 + ((int) ((rect2.right - i14) * f10));
        int i16 = rect.bottom;
        int i17 = i16 + ((int) ((rect2.bottom - i16) * f10));
        Rect rect3 = this.f27893a;
        if (rect3 == null) {
            return new Rect(i11, i13, i15, i17);
        }
        rect3.set(i11, i13, i15, i17);
        return this.f27893a;
    }
}
