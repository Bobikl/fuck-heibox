package df;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import android.widget.TextView;
import com.max.hbcommon.component.HeyBoxAvatarView;
import com.max.xiaoheihe.R;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.PatchProxyResult;

/* JADX INFO: compiled from: ItemChooseAvatarDecorBinding.java */
/* JADX INFO: loaded from: classes3.dex */
public final class ef implements l3.c {
    public static ChangeQuickRedirect changeQuickRedirect;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @androidx.annotation.n0
    private final RelativeLayout f110169a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @androidx.annotation.n0
    public final HeyBoxAvatarView f110170b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @androidx.annotation.n0
    public final RelativeLayout f110171c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @androidx.annotation.n0
    public final TextView f110172d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    @androidx.annotation.n0
    public final ImageView f110173e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    @androidx.annotation.n0
    public final View f110174f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    @androidx.annotation.n0
    public final LinearLayout f110175g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    @androidx.annotation.n0
    public final LinearLayout f110176h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    @androidx.annotation.n0
    public final TextView f110177i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    @androidx.annotation.n0
    public final TextView f110178j;

    private ef(@androidx.annotation.n0 RelativeLayout relativeLayout, @androidx.annotation.n0 HeyBoxAvatarView heyBoxAvatarView, @androidx.annotation.n0 RelativeLayout relativeLayout2, @androidx.annotation.n0 TextView textView, @androidx.annotation.n0 ImageView imageView, @androidx.annotation.n0 View view, @androidx.annotation.n0 LinearLayout linearLayout, @androidx.annotation.n0 LinearLayout linearLayout2, @androidx.annotation.n0 TextView textView2, @androidx.annotation.n0 TextView textView3) {
        this.f110169a = relativeLayout;
        this.f110170b = heyBoxAvatarView;
        this.f110171c = relativeLayout2;
        this.f110172d = textView;
        this.f110173e = imageView;
        this.f110174f = view;
        this.f110175g = linearLayout;
        this.f110176h = linearLayout2;
        this.f110177i = textView2;
        this.f110178j = textView3;
    }

    @androidx.annotation.n0
    public static ef a(@androidx.annotation.n0 View view) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{view}, null, changeQuickRedirect, true, 17920, new Class[]{View.class}, ef.class);
        if (patchProxyResultProxy.isSupported) {
            return (ef) patchProxyResultProxy.result;
        }
        int i10 = R.id.avatar;
        HeyBoxAvatarView heyBoxAvatarView = (HeyBoxAvatarView) l3.d.a(view, R.id.avatar);
        if (heyBoxAvatarView != null) {
            i10 = R.id.checked;
            RelativeLayout relativeLayout = (RelativeLayout) l3.d.a(view, R.id.checked);
            if (relativeLayout != null) {
                i10 = R.id.desc;
                TextView textView = (TextView) l3.d.a(view, R.id.desc);
                if (textView != null) {
                    i10 = R.id.descImg;
                    ImageView imageView = (ImageView) l3.d.a(view, R.id.descImg);
                    if (imageView != null) {
                        i10 = R.id.divider;
                        View viewA = l3.d.a(view, R.id.divider);
                        if (viewA != null) {
                            i10 = R.id.ll_desc;
                            LinearLayout linearLayout = (LinearLayout) l3.d.a(view, R.id.ll_desc);
                            if (linearLayout != null) {
                                i10 = R.id.ll_name;
                                LinearLayout linearLayout2 = (LinearLayout) l3.d.a(view, R.id.ll_name);
                                if (linearLayout2 != null) {
                                    i10 = R.id.name;
                                    TextView textView2 = (TextView) l3.d.a(view, R.id.name);
                                    if (textView2 != null) {
                                        i10 = R.id.tag;
                                        TextView textView3 = (TextView) l3.d.a(view, R.id.tag);
                                        if (textView3 != null) {
                                            return new ef((RelativeLayout) view, heyBoxAvatarView, relativeLayout, textView, imageView, viewA, linearLayout, linearLayout2, textView2, textView3);
                                        }
                                    }
                                }
                            }
                        }
                    }
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i10)));
    }

    @androidx.annotation.n0
    public static ef c(@androidx.annotation.n0 LayoutInflater layoutInflater) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{layoutInflater}, null, changeQuickRedirect, true, 17918, new Class[]{LayoutInflater.class}, ef.class);
        return patchProxyResultProxy.isSupported ? (ef) patchProxyResultProxy.result : d(layoutInflater, null, false);
    }

    @androidx.annotation.n0
    public static ef d(@androidx.annotation.n0 LayoutInflater layoutInflater, @androidx.annotation.p0 ViewGroup viewGroup, boolean z10) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{layoutInflater, viewGroup, new Byte(z10 ? (byte) 1 : (byte) 0)}, null, changeQuickRedirect, true, 17919, new Class[]{LayoutInflater.class, ViewGroup.class, Boolean.TYPE}, ef.class);
        if (patchProxyResultProxy.isSupported) {
            return (ef) patchProxyResultProxy.result;
        }
        View viewInflate = layoutInflater.inflate(R.layout.item_choose_avatar_decor, viewGroup, false);
        if (z10) {
            viewGroup.addView(viewInflate);
        }
        return a(viewInflate);
    }

    @androidx.annotation.n0
    public RelativeLayout b() {
        return this.f110169a;
    }

    @Override // l3.c
    @androidx.annotation.n0
    public /* bridge */ /* synthetic */ View getRoot() {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 17921, new Class[0], View.class);
        return patchProxyResultProxy.isSupported ? (View) patchProxyResultProxy.result : b();
    }
}
