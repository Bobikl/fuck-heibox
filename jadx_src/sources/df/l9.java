package df;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.CheckBox;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import android.widget.TextView;
import androidx.viewpager2.widget.ViewPager2;
import com.max.xiaoheihe.R;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.PatchProxyResult;

/* JADX INFO: compiled from: FragmentGameShotPreviewBinding.java */
/* JADX INFO: loaded from: classes3.dex */
public final class l9 implements l3.c {
    public static ChangeQuickRedirect changeQuickRedirect;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @androidx.annotation.n0
    private final LinearLayout f112922a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @androidx.annotation.n0
    public final CheckBox f112923b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @androidx.annotation.n0
    public final ImageView f112924c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @androidx.annotation.n0
    public final TextView f112925d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    @androidx.annotation.n0
    public final RelativeLayout f112926e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    @androidx.annotation.n0
    public final ViewPager2 f112927f;

    private l9(@androidx.annotation.n0 LinearLayout linearLayout, @androidx.annotation.n0 CheckBox checkBox, @androidx.annotation.n0 ImageView imageView, @androidx.annotation.n0 TextView textView, @androidx.annotation.n0 RelativeLayout relativeLayout, @androidx.annotation.n0 ViewPager2 viewPager2) {
        this.f112922a = linearLayout;
        this.f112923b = checkBox;
        this.f112924c = imageView;
        this.f112925d = textView;
        this.f112926e = relativeLayout;
        this.f112927f = viewPager2;
    }

    @androidx.annotation.n0
    public static l9 a(@androidx.annotation.n0 View view) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{view}, null, changeQuickRedirect, true, 17324, new Class[]{View.class}, l9.class);
        if (patchProxyResultProxy.isSupported) {
            return (l9) patchProxyResultProxy.result;
        }
        int i10 = R.id.cb_checked;
        CheckBox checkBox = (CheckBox) l3.d.a(view, R.id.cb_checked);
        if (checkBox != null) {
            i10 = R.id.iv_close;
            ImageView imageView = (ImageView) l3.d.a(view, R.id.iv_close);
            if (imageView != null) {
                i10 = R.id.tv_index;
                TextView textView = (TextView) l3.d.a(view, R.id.tv_index);
                if (textView != null) {
                    i10 = R.id.vg_preview_title;
                    RelativeLayout relativeLayout = (RelativeLayout) l3.d.a(view, R.id.vg_preview_title);
                    if (relativeLayout != null) {
                        i10 = R.id.vp;
                        ViewPager2 viewPager2 = (ViewPager2) l3.d.a(view, R.id.vp);
                        if (viewPager2 != null) {
                            return new l9((LinearLayout) view, checkBox, imageView, textView, relativeLayout, viewPager2);
                        }
                    }
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i10)));
    }

    @androidx.annotation.n0
    public static l9 c(@androidx.annotation.n0 LayoutInflater layoutInflater) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{layoutInflater}, null, changeQuickRedirect, true, 17322, new Class[]{LayoutInflater.class}, l9.class);
        return patchProxyResultProxy.isSupported ? (l9) patchProxyResultProxy.result : d(layoutInflater, null, false);
    }

    @androidx.annotation.n0
    public static l9 d(@androidx.annotation.n0 LayoutInflater layoutInflater, @androidx.annotation.p0 ViewGroup viewGroup, boolean z10) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{layoutInflater, viewGroup, new Byte(z10 ? (byte) 1 : (byte) 0)}, null, changeQuickRedirect, true, 17323, new Class[]{LayoutInflater.class, ViewGroup.class, Boolean.TYPE}, l9.class);
        if (patchProxyResultProxy.isSupported) {
            return (l9) patchProxyResultProxy.result;
        }
        View viewInflate = layoutInflater.inflate(R.layout.fragment_game_shot_preview, viewGroup, false);
        if (z10) {
            viewGroup.addView(viewInflate);
        }
        return a(viewInflate);
    }

    @androidx.annotation.n0
    public LinearLayout b() {
        return this.f112922a;
    }

    @Override // l3.c
    @androidx.annotation.n0
    public /* bridge */ /* synthetic */ View getRoot() {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 17325, new Class[0], View.class);
        return patchProxyResultProxy.isSupported ? (View) patchProxyResultProxy.result : b();
    }
}
