package df;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.CheckBox;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import android.widget.TextView;
import androidx.recyclerview.widget.RecyclerView;
import com.max.xiaoheihe.R;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.PatchProxyResult;

/* JADX INFO: compiled from: LayoutVideoCompletedRecommendFullscreenBinding.java */
/* JADX INFO: loaded from: classes3.dex */
public final class dc0 implements l3.c {
    public static ChangeQuickRedirect changeQuickRedirect;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @androidx.annotation.n0
    private final LinearLayout f109727a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @androidx.annotation.n0
    public final ImageView f109728b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @androidx.annotation.n0
    public final ImageView f109729c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @androidx.annotation.n0
    public final ImageView f109730d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    @androidx.annotation.n0
    public final ImageView f109731e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    @androidx.annotation.n0
    public final CheckBox f109732f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    @androidx.annotation.n0
    public final ImageView f109733g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    @androidx.annotation.n0
    public final ImageView f109734h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    @androidx.annotation.n0
    public final RecyclerView f109735i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    @androidx.annotation.n0
    public final TextView f109736j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    @androidx.annotation.n0
    public final TextView f109737k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    @androidx.annotation.n0
    public final TextView f109738l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    @androidx.annotation.n0
    public final TextView f109739m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    @androidx.annotation.n0
    public final TextView f109740n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    @androidx.annotation.n0
    public final TextView f109741o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    @androidx.annotation.n0
    public final TextView f109742p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    @androidx.annotation.n0
    public final TextView f109743q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    @androidx.annotation.n0
    public final LinearLayout f109744r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    @androidx.annotation.n0
    public final LinearLayout f109745s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    @androidx.annotation.n0
    public final LinearLayout f109746t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    @androidx.annotation.n0
    public final LinearLayout f109747u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    @androidx.annotation.n0
    public final LinearLayout f109748v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    @androidx.annotation.n0
    public final RelativeLayout f109749w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    @androidx.annotation.n0
    public final LinearLayout f109750x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    @androidx.annotation.n0
    public final LinearLayout f109751y;

    private dc0(@androidx.annotation.n0 LinearLayout linearLayout, @androidx.annotation.n0 ImageView imageView, @androidx.annotation.n0 ImageView imageView2, @androidx.annotation.n0 ImageView imageView3, @androidx.annotation.n0 ImageView imageView4, @androidx.annotation.n0 CheckBox checkBox, @androidx.annotation.n0 ImageView imageView5, @androidx.annotation.n0 ImageView imageView6, @androidx.annotation.n0 RecyclerView recyclerView, @androidx.annotation.n0 TextView textView, @androidx.annotation.n0 TextView textView2, @androidx.annotation.n0 TextView textView3, @androidx.annotation.n0 TextView textView4, @androidx.annotation.n0 TextView textView5, @androidx.annotation.n0 TextView textView6, @androidx.annotation.n0 TextView textView7, @androidx.annotation.n0 TextView textView8, @androidx.annotation.n0 LinearLayout linearLayout2, @androidx.annotation.n0 LinearLayout linearLayout3, @androidx.annotation.n0 LinearLayout linearLayout4, @androidx.annotation.n0 LinearLayout linearLayout5, @androidx.annotation.n0 LinearLayout linearLayout6, @androidx.annotation.n0 RelativeLayout relativeLayout, @androidx.annotation.n0 LinearLayout linearLayout7, @androidx.annotation.n0 LinearLayout linearLayout8) {
        this.f109727a = linearLayout;
        this.f109728b = imageView;
        this.f109729c = imageView2;
        this.f109730d = imageView3;
        this.f109731e = imageView4;
        this.f109732f = checkBox;
        this.f109733g = imageView5;
        this.f109734h = imageView6;
        this.f109735i = recyclerView;
        this.f109736j = textView;
        this.f109737k = textView2;
        this.f109738l = textView3;
        this.f109739m = textView4;
        this.f109740n = textView5;
        this.f109741o = textView6;
        this.f109742p = textView7;
        this.f109743q = textView8;
        this.f109744r = linearLayout2;
        this.f109745s = linearLayout3;
        this.f109746t = linearLayout4;
        this.f109747u = linearLayout5;
        this.f109748v = linearLayout6;
        this.f109749w = relativeLayout;
        this.f109750x = linearLayout7;
        this.f109751y = linearLayout8;
    }

    @androidx.annotation.n0
    public static dc0 a(@androidx.annotation.n0 View view) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{view}, null, changeQuickRedirect, true, 21325, new Class[]{View.class}, dc0.class);
        if (patchProxyResultProxy.isSupported) {
            return (dc0) patchProxyResultProxy.result;
        }
        int i10 = R.id.iv_author_avatar;
        ImageView imageView = (ImageView) l3.d.a(view, R.id.iv_author_avatar);
        if (imageView != null) {
            i10 = R.id.iv_back;
            ImageView imageView2 = (ImageView) l3.d.a(view, R.id.iv_back);
            if (imageView2 != null) {
                i10 = R.id.iv_charge;
                ImageView imageView3 = (ImageView) l3.d.a(view, R.id.iv_charge);
                if (imageView3 != null) {
                    i10 = R.id.iv_collect;
                    ImageView imageView4 = (ImageView) l3.d.a(view, R.id.iv_collect);
                    if (imageView4 != null) {
                        i10 = R.id.iv_like;
                        CheckBox checkBox = (CheckBox) l3.d.a(view, R.id.iv_like);
                        if (checkBox != null) {
                            i10 = R.id.iv_reward;
                            ImageView imageView5 = (ImageView) l3.d.a(view, R.id.iv_reward);
                            if (imageView5 != null) {
                                i10 = R.id.iv_subscribe;
                                ImageView imageView6 = (ImageView) l3.d.a(view, R.id.iv_subscribe);
                                if (imageView6 != null) {
                                    i10 = R.id.rv_video_recommend;
                                    RecyclerView recyclerView = (RecyclerView) l3.d.a(view, R.id.rv_video_recommend);
                                    if (recyclerView != null) {
                                        i10 = R.id.tv_author_info;
                                        TextView textView = (TextView) l3.d.a(view, R.id.tv_author_info);
                                        if (textView != null) {
                                            i10 = R.id.tv_author_name;
                                            TextView textView2 = (TextView) l3.d.a(view, R.id.tv_author_name);
                                            if (textView2 != null) {
                                                i10 = R.id.tv_charge;
                                                TextView textView3 = (TextView) l3.d.a(view, R.id.tv_charge);
                                                if (textView3 != null) {
                                                    i10 = R.id.tv_collect;
                                                    TextView textView4 = (TextView) l3.d.a(view, R.id.tv_collect);
                                                    if (textView4 != null) {
                                                        i10 = R.id.tv_like;
                                                        TextView textView5 = (TextView) l3.d.a(view, R.id.tv_like);
                                                        if (textView5 != null) {
                                                            i10 = R.id.tv_reward;
                                                            TextView textView6 = (TextView) l3.d.a(view, R.id.tv_reward);
                                                            if (textView6 != null) {
                                                                i10 = R.id.tv_reward_count_desc;
                                                                TextView textView7 = (TextView) l3.d.a(view, R.id.tv_reward_count_desc);
                                                                if (textView7 != null) {
                                                                    i10 = R.id.tv_subscribe;
                                                                    TextView textView8 = (TextView) l3.d.a(view, R.id.tv_subscribe);
                                                                    if (textView8 != null) {
                                                                        i10 = R.id.vg_charge;
                                                                        LinearLayout linearLayout = (LinearLayout) l3.d.a(view, R.id.vg_charge);
                                                                        if (linearLayout != null) {
                                                                            i10 = R.id.vg_collect;
                                                                            LinearLayout linearLayout2 = (LinearLayout) l3.d.a(view, R.id.vg_collect);
                                                                            if (linearLayout2 != null) {
                                                                                i10 = R.id.vg_like;
                                                                                LinearLayout linearLayout3 = (LinearLayout) l3.d.a(view, R.id.vg_like);
                                                                                if (linearLayout3 != null) {
                                                                                    i10 = R.id.vg_replay;
                                                                                    LinearLayout linearLayout4 = (LinearLayout) l3.d.a(view, R.id.vg_replay);
                                                                                    if (linearLayout4 != null) {
                                                                                        i10 = R.id.vg_reward;
                                                                                        LinearLayout linearLayout5 = (LinearLayout) l3.d.a(view, R.id.vg_reward);
                                                                                        if (linearLayout5 != null) {
                                                                                            i10 = R.id.vg_reward_guys;
                                                                                            RelativeLayout relativeLayout = (RelativeLayout) l3.d.a(view, R.id.vg_reward_guys);
                                                                                            if (relativeLayout != null) {
                                                                                                i10 = R.id.vg_share;
                                                                                                LinearLayout linearLayout6 = (LinearLayout) l3.d.a(view, R.id.vg_share);
                                                                                                if (linearLayout6 != null) {
                                                                                                    i10 = R.id.vg_subscribe;
                                                                                                    LinearLayout linearLayout7 = (LinearLayout) l3.d.a(view, R.id.vg_subscribe);
                                                                                                    if (linearLayout7 != null) {
                                                                                                        return new dc0((LinearLayout) view, imageView, imageView2, imageView3, imageView4, checkBox, imageView5, imageView6, recyclerView, textView, textView2, textView3, textView4, textView5, textView6, textView7, textView8, linearLayout, linearLayout2, linearLayout3, linearLayout4, linearLayout5, relativeLayout, linearLayout6, linearLayout7);
                                                                                                    }
                                                                                                }
                                                                                            }
                                                                                        }
                                                                                    }
                                                                                }
                                                                            }
                                                                        }
                                                                    }
                                                                }
                                                            }
                                                        }
                                                    }
                                                }
                                            }
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
    public static dc0 c(@androidx.annotation.n0 LayoutInflater layoutInflater) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{layoutInflater}, null, changeQuickRedirect, true, 21323, new Class[]{LayoutInflater.class}, dc0.class);
        return patchProxyResultProxy.isSupported ? (dc0) patchProxyResultProxy.result : d(layoutInflater, null, false);
    }

    @androidx.annotation.n0
    public static dc0 d(@androidx.annotation.n0 LayoutInflater layoutInflater, @androidx.annotation.p0 ViewGroup viewGroup, boolean z10) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{layoutInflater, viewGroup, new Byte(z10 ? (byte) 1 : (byte) 0)}, null, changeQuickRedirect, true, 21324, new Class[]{LayoutInflater.class, ViewGroup.class, Boolean.TYPE}, dc0.class);
        if (patchProxyResultProxy.isSupported) {
            return (dc0) patchProxyResultProxy.result;
        }
        View viewInflate = layoutInflater.inflate(R.layout.layout_video_completed_recommend_fullscreen, viewGroup, false);
        if (z10) {
            viewGroup.addView(viewInflate);
        }
        return a(viewInflate);
    }

    @androidx.annotation.n0
    public LinearLayout b() {
        return this.f109727a;
    }

    @Override // l3.c
    @androidx.annotation.n0
    public /* bridge */ /* synthetic */ View getRoot() {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 21326, new Class[0], View.class);
        return patchProxyResultProxy.isSupported ? (View) patchProxyResultProxy.result : b();
    }
}
