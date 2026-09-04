package androidx.transition;

import android.graphics.Rect;
import android.view.ViewGroup;

/* JADX INFO: compiled from: CircularPropagation.java */
/* JADX INFO: loaded from: classes6.dex */
public class c extends y0 {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private float f27839d = 3.0f;

    private static float h(float f10, float f11, float f12, float f13) {
        float f14 = f12 - f10;
        float f15 = f13 - f11;
        return (float) Math.sqrt((f14 * f14) + (f15 * f15));
    }

    @Override // androidx.transition.w
    public long c(ViewGroup viewGroup, Transition transition, z zVar, z zVar2) {
        int i10;
        int iRound;
        int iCenterX;
        if (zVar == null && zVar2 == null) {
            return 0L;
        }
        if (zVar2 == null || e(zVar) == 0) {
            i10 = -1;
        } else {
            zVar = zVar2;
            i10 = 1;
        }
        int iF = f(zVar);
        int iG = g(zVar);
        Rect rectH = transition.H();
        if (rectH != null) {
            iCenterX = rectH.centerX();
            iRound = rectH.centerY();
        } else {
            int[] iArr = new int[2];
            viewGroup.getLocationOnScreen(iArr);
            int iRound2 = Math.round(iArr[0] + (viewGroup.getWidth() / 2) + viewGroup.getTranslationX());
            iRound = Math.round(iArr[1] + (viewGroup.getHeight() / 2) + viewGroup.getTranslationY());
            iCenterX = iRound2;
        }
        float fH = h(iF, iG, iCenterX, iRound) / h(0.0f, 0.0f, viewGroup.getWidth(), viewGroup.getHeight());
        long jG = transition.G();
        if (jG < 0) {
            jG = 300;
        }
        return Math.round(((jG * ((long) i10)) / this.f27839d) * fH);
    }

    public void i(float f10) {
        if (f10 == 0.0f) {
            throw new IllegalArgumentException("propagationSpeed may not be 0");
        }
        this.f27839d = f10;
    }
}
