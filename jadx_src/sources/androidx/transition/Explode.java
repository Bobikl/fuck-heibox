package androidx.transition;

import android.animation.Animator;
import android.animation.TimeInterpolator;
import android.content.Context;
import android.graphics.Rect;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.AccelerateInterpolator;
import android.view.animation.DecelerateInterpolator;

/* JADX INFO: loaded from: classes6.dex */
public class Explode extends Visibility {

    /* JADX INFO: renamed from: p2, reason: collision with root package name */
    private static final String f27696p2 = "android:explode:screenBounds";

    /* JADX INFO: renamed from: x1, reason: collision with root package name */
    private static final TimeInterpolator f27697x1 = new DecelerateInterpolator();

    /* JADX INFO: renamed from: y1, reason: collision with root package name */
    private static final TimeInterpolator f27698y1 = new AccelerateInterpolator();

    /* JADX INFO: renamed from: p1, reason: collision with root package name */
    private int[] f27699p1;

    public Explode() {
        this.f27699p1 = new int[2];
        B0(new c());
    }

    public Explode(@androidx.annotation.n0 Context context, @androidx.annotation.n0 AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f27699p1 = new int[2];
        B0(new c());
    }

    private void I0(z zVar) {
        View view = zVar.f27974b;
        view.getLocationOnScreen(this.f27699p1);
        int[] iArr = this.f27699p1;
        int i10 = iArr[0];
        int i11 = iArr[1];
        zVar.f27973a.put(f27696p2, new Rect(i10, i11, view.getWidth() + i10, view.getHeight() + i11));
    }

    private static float R0(float f10, float f11) {
        return (float) Math.sqrt((f10 * f10) + (f11 * f11));
    }

    private static float S0(View view, int i10, int i11) {
        return R0(Math.max(i10, view.getWidth() - i10), Math.max(i11, view.getHeight() - i11));
    }

    private void T0(View view, Rect rect, int[] iArr) {
        int iCenterY;
        int width;
        view.getLocationOnScreen(this.f27699p1);
        int[] iArr2 = this.f27699p1;
        int i10 = iArr2[0];
        int i11 = iArr2[1];
        Rect rectH = H();
        if (rectH == null) {
            width = (view.getWidth() / 2) + i10 + Math.round(view.getTranslationX());
            iCenterY = (view.getHeight() / 2) + i11 + Math.round(view.getTranslationY());
        } else {
            int iCenterX = rectH.centerX();
            iCenterY = rectH.centerY();
            width = iCenterX;
        }
        float fCenterX = rect.centerX() - width;
        float fCenterY = rect.centerY() - iCenterY;
        if (fCenterX == 0.0f && fCenterY == 0.0f) {
            fCenterX = ((float) (Math.random() * 2.0d)) - 1.0f;
            fCenterY = ((float) (Math.random() * 2.0d)) - 1.0f;
        }
        float fR0 = R0(fCenterX, fCenterY);
        float fS0 = S0(view, width - i10, iCenterY - i11);
        iArr[0] = Math.round((fCenterX / fR0) * fS0);
        iArr[1] = Math.round(fS0 * (fCenterY / fR0));
    }

    @Override // androidx.transition.Visibility
    @androidx.annotation.p0
    public Animator M0(ViewGroup viewGroup, View view, z zVar, z zVar2) {
        if (zVar2 == null) {
            return null;
        }
        Rect rect = (Rect) zVar2.f27973a.get(f27696p2);
        float translationX = view.getTranslationX();
        float translationY = view.getTranslationY();
        T0(viewGroup, rect, this.f27699p1);
        int[] iArr = this.f27699p1;
        return b0.a(view, zVar2, rect.left, rect.top, translationX + iArr[0], translationY + iArr[1], translationX, translationY, f27697x1, this);
    }

    @Override // androidx.transition.Visibility
    @androidx.annotation.p0
    public Animator O0(ViewGroup viewGroup, View view, z zVar, z zVar2) {
        float f10;
        float f11;
        if (zVar == null) {
            return null;
        }
        Rect rect = (Rect) zVar.f27973a.get(f27696p2);
        int i10 = rect.left;
        int i11 = rect.top;
        float translationX = view.getTranslationX();
        float translationY = view.getTranslationY();
        int[] iArr = (int[]) zVar.f27974b.getTag(R.id.transition_position);
        if (iArr != null) {
            int i12 = iArr[0];
            f10 = (i12 - rect.left) + translationX;
            int i13 = iArr[1];
            f11 = (i13 - rect.top) + translationY;
            rect.offsetTo(i12, i13);
        } else {
            f10 = translationX;
            f11 = translationY;
        }
        T0(viewGroup, rect, this.f27699p1);
        int[] iArr2 = this.f27699p1;
        return b0.a(view, zVar, i10, i11, translationX, translationY, f10 + iArr2[0], f11 + iArr2[1], f27698y1, this);
    }

    @Override // androidx.transition.Visibility, androidx.transition.Transition
    public void j(@androidx.annotation.n0 z zVar) {
        super.j(zVar);
        I0(zVar);
    }

    @Override // androidx.transition.Visibility, androidx.transition.Transition
    public void m(@androidx.annotation.n0 z zVar) {
        super.m(zVar);
        I0(zVar);
    }
}
