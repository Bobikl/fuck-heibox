package wb;

import android.view.View;
import androidx.viewpager2.widget.ViewPager2;
import bb.c;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;

/* JADX INFO: compiled from: ScaleInTransformer.java */
/* JADX INFO: loaded from: classes10.dex */
public class b implements ViewPager2.PageTransformer {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static final float f141025b = 0.5f;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final float f141026c = 0.85f;
    public static ChangeQuickRedirect changeQuickRedirect;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final float f141027a;

    public b(float f10) {
        this.f141027a = f10;
    }

    @Override // androidx.viewpager2.widget.ViewPager2.PageTransformer
    public void transformPage(View view, float f10) {
        if (PatchProxy.proxy(new Object[]{view, new Float(f10)}, this, changeQuickRedirect, false, c.f.f32718zh, new Class[]{View.class, Float.TYPE}, Void.TYPE).isSupported) {
            return;
        }
        int width = view.getWidth();
        view.setPivotY(view.getHeight() / 2.0f);
        float f11 = width;
        view.setPivotX(f11 / 2.0f);
        if (f10 < -1.0f) {
            view.setScaleX(this.f141027a);
            view.setScaleY(this.f141027a);
            view.setPivotX(f11);
            return;
        }
        if (f10 > 1.0f) {
            view.setPivotX(0.0f);
            view.setScaleX(this.f141027a);
            view.setScaleY(this.f141027a);
        } else {
            if (f10 < 0.0f) {
                float f12 = this.f141027a;
                float f13 = ((f10 + 1.0f) * (1.0f - f12)) + f12;
                view.setScaleX(f13);
                view.setScaleY(f13);
                view.setPivotX(f11 * (((-f10) * 0.5f) + 0.5f));
                return;
            }
            float f14 = 1.0f - f10;
            float f15 = this.f141027a;
            float f16 = ((1.0f - f15) * f14) + f15;
            view.setScaleX(f16);
            view.setScaleY(f16);
            view.setPivotX(f11 * f14 * 0.5f);
        }
    }
}
