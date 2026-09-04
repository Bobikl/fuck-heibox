package androidx.transition;

import android.graphics.Rect;
import android.view.View;
import android.view.ViewGroup;
import androidx.core.view.j1;

/* JADX INFO: compiled from: SidePropagation.java */
/* JADX INFO: loaded from: classes6.dex */
public class q extends y0 {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private float f27901d = 3.0f;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private int f27902e = 80;

    /* JADX WARN: Code duplicated, block: B:10:0x0017  */
    /* JADX WARN: Code duplicated, block: B:9:0x0015  */
    private int h(View view, int i10, int i11, int i12, int i13, int i14, int i15, int i16, int i17) {
        int i18 = this.f27902e;
        if (i18 == 8388611) {
            if (j1.Z(view) == 1) {
                i18 = 5;
            } else {
                i18 = 3;
            }
        } else if (i18 == 8388613) {
            if (j1.Z(view) == 1) {
                i18 = 3;
            } else {
                i18 = 5;
            }
        }
        if (i18 == 3) {
            return (i16 - i10) + Math.abs(i13 - i11);
        }
        if (i18 == 5) {
            return (i10 - i14) + Math.abs(i13 - i11);
        }
        if (i18 == 48) {
            return (i17 - i11) + Math.abs(i12 - i10);
        }
        if (i18 != 80) {
            return 0;
        }
        return (i11 - i15) + Math.abs(i12 - i10);
    }

    private int i(ViewGroup viewGroup) {
        int i10 = this.f27902e;
        return (i10 == 3 || i10 == 5 || i10 == 8388611 || i10 == 8388613) ? viewGroup.getWidth() : viewGroup.getHeight();
    }

    @Override // androidx.transition.w
    public long c(ViewGroup viewGroup, Transition transition, z zVar, z zVar2) {
        int i10;
        int iCenterX;
        int iCenterY;
        z zVar3 = zVar;
        if (zVar3 == null && zVar2 == null) {
            return 0L;
        }
        Rect rectH = transition.H();
        if (zVar2 == null || e(zVar3) == 0) {
            i10 = -1;
        } else {
            zVar3 = zVar2;
            i10 = 1;
        }
        int iF = f(zVar3);
        int iG = g(zVar3);
        int[] iArr = new int[2];
        viewGroup.getLocationOnScreen(iArr);
        int iRound = iArr[0] + Math.round(viewGroup.getTranslationX());
        int iRound2 = iArr[1] + Math.round(viewGroup.getTranslationY());
        int width = iRound + viewGroup.getWidth();
        int height = iRound2 + viewGroup.getHeight();
        if (rectH != null) {
            iCenterX = rectH.centerX();
            iCenterY = rectH.centerY();
        } else {
            iCenterX = (iRound + width) / 2;
            iCenterY = (iRound2 + height) / 2;
        }
        float fH = h(viewGroup, iF, iG, iCenterX, iCenterY, iRound, iRound2, width, height) / i(viewGroup);
        long jG = transition.G();
        if (jG < 0) {
            jG = 300;
        }
        return Math.round(((jG * ((long) i10)) / this.f27901d) * fH);
    }

    public void j(float f10) {
        if (f10 == 0.0f) {
            throw new IllegalArgumentException("propagationSpeed may not be 0");
        }
        this.f27901d = f10;
    }

    public void k(int i10) {
        this.f27902e = i10;
    }
}
