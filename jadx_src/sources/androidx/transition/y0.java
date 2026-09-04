package androidx.transition;

import android.view.View;

/* JADX INFO: compiled from: VisibilityPropagation.java */
/* JADX INFO: loaded from: classes6.dex */
public abstract class y0 extends w {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final String f27970a = "android:visibilityPropagation:visibility";

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static final String f27971b = "android:visibilityPropagation:center";

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static final String[] f27972c = {f27970a, f27971b};

    private static int d(z zVar, int i10) {
        int[] iArr;
        if (zVar == null || (iArr = (int[]) zVar.f27973a.get(f27971b)) == null) {
            return -1;
        }
        return iArr[i10];
    }

    @Override // androidx.transition.w
    public void a(z zVar) {
        View view = zVar.f27974b;
        Integer numValueOf = (Integer) zVar.f27973a.get("android:visibility:visibility");
        if (numValueOf == null) {
            numValueOf = Integer.valueOf(view.getVisibility());
        }
        zVar.f27973a.put(f27970a, numValueOf);
        int[] iArr = {iRound, 0};
        view.getLocationOnScreen(iArr);
        int iRound = iArr[0] + Math.round(view.getTranslationX());
        iArr[0] = iRound + (view.getWidth() / 2);
        int iRound2 = iArr[1] + Math.round(view.getTranslationY());
        iArr[1] = iRound2;
        iArr[1] = iRound2 + (view.getHeight() / 2);
        zVar.f27973a.put(f27971b, iArr);
    }

    @Override // androidx.transition.w
    public String[] b() {
        return f27972c;
    }

    public int e(z zVar) {
        Integer num;
        if (zVar == null || (num = (Integer) zVar.f27973a.get(f27970a)) == null) {
            return 8;
        }
        return num.intValue();
    }

    public int f(z zVar) {
        return d(zVar, 0);
    }

    public int g(z zVar) {
        return d(zVar, 1);
    }
}
