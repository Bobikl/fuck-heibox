package androidx.constraintlayout.motion.widget;

import android.graphics.RectF;
import android.view.View;
import java.util.HashSet;

/* JADX INFO: compiled from: KeyPositionBase.java */
/* JADX INFO: loaded from: classes.dex */
public abstract class k extends f {
    protected static final float E = 20.0f;
    int D = f.f18718f;

    k() {
    }

    @Override // androidx.constraintlayout.motion.widget.f
    void d(HashSet<String> hashSet) {
    }

    abstract void o(int i10, int i11, float f10, float f11, float f12, float f13);

    abstract float p();

    abstract float q();

    public abstract boolean r(int i10, int i11, RectF rectF, RectF rectF2, float f10, float f11);

    abstract void s(View view, RectF rectF, RectF rectF2, float f10, float f11, String[] strArr, float[] fArr);
}
