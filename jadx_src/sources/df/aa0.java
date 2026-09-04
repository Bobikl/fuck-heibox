package df;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.max.xiaoheihe.R;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.PatchProxyResult;

/* JADX INFO: compiled from: LayoutRollRoomLinkViewBinding.java */
/* JADX INFO: loaded from: classes3.dex */
public final class aa0 implements l3.c {
    public static ChangeQuickRedirect changeQuickRedirect;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @androidx.annotation.n0
    private final LinearLayout f108442a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @androidx.annotation.n0
    public final ImageView f108443b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @androidx.annotation.n0
    public final ImageView f108444c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @androidx.annotation.n0
    public final ImageView f108445d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    @androidx.annotation.n0
    public final LinearLayout f108446e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    @androidx.annotation.n0
    public final TextView f108447f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    @androidx.annotation.n0
    public final TextView f108448g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    @androidx.annotation.n0
    public final TextView f108449h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    @androidx.annotation.n0
    public final TextView f108450i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    @androidx.annotation.n0
    public final LinearLayout f108451j;

    private aa0(@androidx.annotation.n0 LinearLayout linearLayout, @androidx.annotation.n0 ImageView imageView, @androidx.annotation.n0 ImageView imageView2, @androidx.annotation.n0 ImageView imageView3, @androidx.annotation.n0 LinearLayout linearLayout2, @androidx.annotation.n0 TextView textView, @androidx.annotation.n0 TextView textView2, @androidx.annotation.n0 TextView textView3, @androidx.annotation.n0 TextView textView4, @androidx.annotation.n0 LinearLayout linearLayout3) {
        this.f108442a = linearLayout;
        this.f108443b = imageView;
        this.f108444c = imageView2;
        this.f108445d = imageView3;
        this.f108446e = linearLayout2;
        this.f108447f = textView;
        this.f108448g = textView2;
        this.f108449h = textView3;
        this.f108450i = textView4;
        this.f108451j = linearLayout3;
    }

    @androidx.annotation.n0
    public static aa0 a(@androidx.annotation.n0 View view) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{view}, null, changeQuickRedirect, true, 21110, new Class[]{View.class}, aa0.class);
        if (patchProxyResultProxy.isSupported) {
            return (aa0) patchProxyResultProxy.result;
        }
        int i10 = R.id.iv_joined_avatar_0;
        ImageView imageView = (ImageView) l3.d.a(view, R.id.iv_joined_avatar_0);
        if (imageView != null) {
            i10 = R.id.iv_joined_avatar_1;
            ImageView imageView2 = (ImageView) l3.d.a(view, R.id.iv_joined_avatar_1);
            if (imageView2 != null) {
                i10 = R.id.iv_joined_avatar_2;
                ImageView imageView3 = (ImageView) l3.d.a(view, R.id.iv_joined_avatar_2);
                if (imageView3 != null) {
                    i10 = R.id.ll_roll_items;
                    LinearLayout linearLayout = (LinearLayout) l3.d.a(view, R.id.ll_roll_items);
                    if (linearLayout != null) {
                        i10 = R.id.tv_get_prize_user_num;
                        TextView textView = (TextView) l3.d.a(view, R.id.tv_get_prize_user_num);
                        if (textView != null) {
                            i10 = R.id.tv_join_user_count;
                            TextView textView2 = (TextView) l3.d.a(view, R.id.tv_join_user_count);
                            if (textView2 != null) {
                                i10 = R.id.tv_roll_state;
                                TextView textView3 = (TextView) l3.d.a(view, R.id.tv_roll_state);
                                if (textView3 != null) {
                                    i10 = R.id.tv_roll_time_desc;
                                    TextView textView4 = (TextView) l3.d.a(view, R.id.tv_roll_time_desc);
                                    if (textView4 != null) {
                                        i10 = R.id.vg_joined_user_desc;
                                        LinearLayout linearLayout2 = (LinearLayout) l3.d.a(view, R.id.vg_joined_user_desc);
                                        if (linearLayout2 != null) {
                                            return new aa0((LinearLayout) view, imageView, imageView2, imageView3, linearLayout, textView, textView2, textView3, textView4, linearLayout2);
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
    public static aa0 c(@androidx.annotation.n0 LayoutInflater layoutInflater) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{layoutInflater}, null, changeQuickRedirect, true, 21108, new Class[]{LayoutInflater.class}, aa0.class);
        return patchProxyResultProxy.isSupported ? (aa0) patchProxyResultProxy.result : d(layoutInflater, null, false);
    }

    @androidx.annotation.n0
    public static aa0 d(@androidx.annotation.n0 LayoutInflater layoutInflater, @androidx.annotation.p0 ViewGroup viewGroup, boolean z10) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{layoutInflater, viewGroup, new Byte(z10 ? (byte) 1 : (byte) 0)}, null, changeQuickRedirect, true, 21109, new Class[]{LayoutInflater.class, ViewGroup.class, Boolean.TYPE}, aa0.class);
        if (patchProxyResultProxy.isSupported) {
            return (aa0) patchProxyResultProxy.result;
        }
        View viewInflate = layoutInflater.inflate(R.layout.layout_roll_room_link_view, viewGroup, false);
        if (z10) {
            viewGroup.addView(viewInflate);
        }
        return a(viewInflate);
    }

    @androidx.annotation.n0
    public LinearLayout b() {
        return this.f108442a;
    }

    @Override // l3.c
    @androidx.annotation.n0
    public /* bridge */ /* synthetic */ View getRoot() {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 21111, new Class[0], View.class);
        return patchProxyResultProxy.isSupported ? (View) patchProxyResultProxy.result : b();
    }
}
