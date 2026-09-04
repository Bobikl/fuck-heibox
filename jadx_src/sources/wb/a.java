package wb;

import android.view.View;
import androidx.annotation.w0;
import androidx.viewpager2.widget.ViewPager2;
import bb.c;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import dl.d;
import kotlin.jvm.internal.f0;
import kotlin.jvm.internal.t0;
import kotlin.jvm.internal.u;

/* JADX INFO: compiled from: OverlapPageTransformer.kt */
/* JADX INFO: loaded from: classes10.dex */
@t0({"SMAP\nOverlapPageTransformer.kt\nKotlin\n*S Kotlin\n*F\n+ 1 OverlapPageTransformer.kt\ncom/max/hbcustomview/bannerview/transform/OverlapPageTransformer\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,92:1\n1#2:93\n*E\n"})
@w0(api = 21)
public final class a implements ViewPager2.PageTransformer {
    public static ChangeQuickRedirect changeQuickRedirect;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final int f141019a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final float f141020b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final float f141021c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final float f141022d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final float f141023e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final float f141024f;

    public a(int i10, float f10, float f11, float f12, float f13) {
        this.f141019a = i10;
        this.f141020b = f10;
        this.f141021c = f11;
        this.f141022d = f12;
        this.f141023e = f13;
        if (!(0.0f <= f10 && f10 <= 1.0f)) {
            throw new IllegalArgumentException("minScale value should be between 1.0 to 0.0".toString());
        }
        if (!(0.0f <= f12 && f12 <= 1.0f)) {
            throw new IllegalArgumentException("unSelectedItemAlpha value should be between 1.0 to 0.0".toString());
        }
        this.f141024f = 0.2f;
    }

    public /* synthetic */ a(int i10, float f10, float f11, float f12, float f13, int i11, u uVar) {
        this(i10, (i11 & 2) != 0 ? 0.0f : f10, (i11 & 4) != 0 ? 0.0f : f11, (i11 & 8) != 0 ? 0.0f : f12, (i11 & 16) != 0 ? 0.0f : f13);
    }

    @Override // androidx.viewpager2.widget.ViewPager2.PageTransformer
    public void transformPage(@d View page, float f10) {
        if (PatchProxy.proxy(new Object[]{page, new Float(f10)}, this, changeQuickRedirect, false, c.f.f32696yh, new Class[]{View.class, Float.TYPE}, Void.TYPE).isSupported) {
            return;
        }
        f0.p(page, "page");
        page.setElevation(-Math.abs(f10));
        float fMax = Math.max(1.0f - Math.abs(f10 * 0.5f), 0.5f);
        float f11 = this.f141021c;
        if (!(f11 == 0.0f)) {
            float f12 = 1 - fMax;
            if (f10 <= 0.0f) {
                f11 = -f11;
            }
            page.setRotationY(f12 * f11);
        }
        float fMax2 = Math.max(1.0f - Math.abs(this.f141024f * f10), this.f141020b);
        page.setScaleX(fMax2);
        page.setScaleY(fMax2);
        int iA = dh.a.a(((int) this.f141023e) / 2);
        int i10 = this.f141019a;
        if (i10 == 0) {
            page.setTranslationX((iA * f10) + ((f10 > 0.0f ? -page.getWidth() : page.getWidth()) * (1.0f - fMax2)));
        } else {
            if (i10 != 1) {
                throw new IllegalArgumentException("Gives correct orientation value, ViewPager2.ORIENTATION_HORIZONTAL or ViewPager2.ORIENTATION_VERTICAL");
            }
            page.setTranslationY((iA * f10) + ((f10 > 0.0f ? -page.getWidth() : page.getWidth()) * (1.0f - fMax2)));
        }
        if (this.f141022d == 1.0f) {
            return;
        }
        page.setAlpha((f10 < -1.0f || f10 > 1.0f) ? 0.5f / Math.abs(f10 * f10) : ((1 - Math.abs(f10)) * 0.5f) + 0.5f);
    }
}
