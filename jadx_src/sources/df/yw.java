package df;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import android.widget.TextView;
import androidx.cardview.widget.CardView;
import androidx.recyclerview.widget.RecyclerView;
import com.max.hbcustomview.HBLineHeightTextView;
import com.max.xiaoheihe.R;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.PatchProxyResult;

/* JADX INFO: compiled from: ItemRollRoomBinding.java */
/* JADX INFO: loaded from: classes3.dex */
public final class yw implements l3.c {
    public static ChangeQuickRedirect changeQuickRedirect;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @androidx.annotation.n0
    private final RelativeLayout f118068a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @androidx.annotation.n0
    public final CardView f118069b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @androidx.annotation.n0
    public final ImageView f118070c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @androidx.annotation.n0
    public final ImageView f118071d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    @androidx.annotation.n0
    public final ImageView f118072e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    @androidx.annotation.n0
    public final ImageView f118073f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    @androidx.annotation.n0
    public final RelativeLayout f118074g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    @androidx.annotation.n0
    public final RecyclerView f118075h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    @androidx.annotation.n0
    public final HBLineHeightTextView f118076i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    @androidx.annotation.n0
    public final TextView f118077j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    @androidx.annotation.n0
    public final TextView f118078k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    @androidx.annotation.n0
    public final TextView f118079l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    @androidx.annotation.n0
    public final TextView f118080m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    @androidx.annotation.n0
    public final TextView f118081n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    @androidx.annotation.n0
    public final TextView f118082o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    @androidx.annotation.n0
    public final TextView f118083p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    @androidx.annotation.n0
    public final LinearLayout f118084q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    @androidx.annotation.n0
    public final LinearLayout f118085r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    @androidx.annotation.n0
    public final zw f118086s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    @androidx.annotation.n0
    public final LinearLayout f118087t;

    private yw(@androidx.annotation.n0 RelativeLayout relativeLayout, @androidx.annotation.n0 CardView cardView, @androidx.annotation.n0 ImageView imageView, @androidx.annotation.n0 ImageView imageView2, @androidx.annotation.n0 ImageView imageView3, @androidx.annotation.n0 ImageView imageView4, @androidx.annotation.n0 RelativeLayout relativeLayout2, @androidx.annotation.n0 RecyclerView recyclerView, @androidx.annotation.n0 HBLineHeightTextView hBLineHeightTextView, @androidx.annotation.n0 TextView textView, @androidx.annotation.n0 TextView textView2, @androidx.annotation.n0 TextView textView3, @androidx.annotation.n0 TextView textView4, @androidx.annotation.n0 TextView textView5, @androidx.annotation.n0 TextView textView6, @androidx.annotation.n0 TextView textView7, @androidx.annotation.n0 LinearLayout linearLayout, @androidx.annotation.n0 LinearLayout linearLayout2, @androidx.annotation.n0 zw zwVar, @androidx.annotation.n0 LinearLayout linearLayout3) {
        this.f118068a = relativeLayout;
        this.f118069b = cardView;
        this.f118070c = imageView;
        this.f118071d = imageView2;
        this.f118072e = imageView3;
        this.f118073f = imageView4;
        this.f118074g = relativeLayout2;
        this.f118075h = recyclerView;
        this.f118076i = hBLineHeightTextView;
        this.f118077j = textView;
        this.f118078k = textView2;
        this.f118079l = textView3;
        this.f118080m = textView4;
        this.f118081n = textView5;
        this.f118082o = textView6;
        this.f118083p = textView7;
        this.f118084q = linearLayout;
        this.f118085r = linearLayout2;
        this.f118086s = zwVar;
        this.f118087t = linearLayout3;
    }

    @androidx.annotation.n0
    public static yw a(@androidx.annotation.n0 View view) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{view}, null, changeQuickRedirect, true, 19760, new Class[]{View.class}, yw.class);
        if (patchProxyResultProxy.isSupported) {
            return (yw) patchProxyResultProxy.result;
        }
        int i10 = R.id.cv_room_info;
        CardView cardView = (CardView) l3.d.a(view, R.id.cv_room_info);
        if (cardView != null) {
            i10 = R.id.iv_avatar;
            ImageView imageView = (ImageView) l3.d.a(view, R.id.iv_avatar);
            if (imageView != null) {
                i10 = R.id.iv_copy_pwd;
                ImageView imageView2 = (ImageView) l3.d.a(view, R.id.iv_copy_pwd);
                if (imageView2 != null) {
                    i10 = R.id.iv_copy_room;
                    ImageView imageView3 = (ImageView) l3.d.a(view, R.id.iv_copy_room);
                    if (imageView3 != null) {
                        i10 = R.id.iv_scrim;
                        ImageView imageView4 = (ImageView) l3.d.a(view, R.id.iv_scrim);
                        if (imageView4 != null) {
                            i10 = R.id.rl_medal_level;
                            RelativeLayout relativeLayout = (RelativeLayout) l3.d.a(view, R.id.rl_medal_level);
                            if (relativeLayout != null) {
                                i10 = R.id.rv_roll_items;
                                RecyclerView recyclerView = (RecyclerView) l3.d.a(view, R.id.rv_roll_items);
                                if (recyclerView != null) {
                                    i10 = R.id.tv_count_desc;
                                    HBLineHeightTextView hBLineHeightTextView = (HBLineHeightTextView) l3.d.a(view, R.id.tv_count_desc);
                                    if (hBLineHeightTextView != null) {
                                        i10 = R.id.tv_name;
                                        TextView textView = (TextView) l3.d.a(view, R.id.tv_name);
                                        if (textView != null) {
                                            i10 = R.id.tv_privacy_room_tag;
                                            TextView textView2 = (TextView) l3.d.a(view, R.id.tv_privacy_room_tag);
                                            if (textView2 != null) {
                                                i10 = R.id.tv_pwd;
                                                TextView textView3 = (TextView) l3.d.a(view, R.id.tv_pwd);
                                                if (textView3 != null) {
                                                    i10 = R.id.tv_roll_room_id;
                                                    TextView textView4 = (TextView) l3.d.a(view, R.id.tv_roll_room_id);
                                                    if (textView4 != null) {
                                                        i10 = R.id.tv_roll_room_title;
                                                        TextView textView5 = (TextView) l3.d.a(view, R.id.tv_roll_room_title);
                                                        if (textView5 != null) {
                                                            i10 = R.id.tv_room_id;
                                                            TextView textView6 = (TextView) l3.d.a(view, R.id.tv_room_id);
                                                            if (textView6 != null) {
                                                                i10 = R.id.tv_time;
                                                                TextView textView7 = (TextView) l3.d.a(view, R.id.tv_time);
                                                                if (textView7 != null) {
                                                                    i10 = R.id.vg_more_items;
                                                                    LinearLayout linearLayout = (LinearLayout) l3.d.a(view, R.id.vg_more_items);
                                                                    if (linearLayout != null) {
                                                                        i10 = R.id.vg_pwd_info;
                                                                        LinearLayout linearLayout2 = (LinearLayout) l3.d.a(view, R.id.vg_pwd_info);
                                                                        if (linearLayout2 != null) {
                                                                            i10 = R.id.vg_roll_item_info;
                                                                            View viewA = l3.d.a(view, R.id.vg_roll_item_info);
                                                                            if (viewA != null) {
                                                                                zw zwVarA = zw.a(viewA);
                                                                                i10 = R.id.vg_title;
                                                                                LinearLayout linearLayout3 = (LinearLayout) l3.d.a(view, R.id.vg_title);
                                                                                if (linearLayout3 != null) {
                                                                                    return new yw((RelativeLayout) view, cardView, imageView, imageView2, imageView3, imageView4, relativeLayout, recyclerView, hBLineHeightTextView, textView, textView2, textView3, textView4, textView5, textView6, textView7, linearLayout, linearLayout2, zwVarA, linearLayout3);
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
    public static yw c(@androidx.annotation.n0 LayoutInflater layoutInflater) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{layoutInflater}, null, changeQuickRedirect, true, 19758, new Class[]{LayoutInflater.class}, yw.class);
        return patchProxyResultProxy.isSupported ? (yw) patchProxyResultProxy.result : d(layoutInflater, null, false);
    }

    @androidx.annotation.n0
    public static yw d(@androidx.annotation.n0 LayoutInflater layoutInflater, @androidx.annotation.p0 ViewGroup viewGroup, boolean z10) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{layoutInflater, viewGroup, new Byte(z10 ? (byte) 1 : (byte) 0)}, null, changeQuickRedirect, true, 19759, new Class[]{LayoutInflater.class, ViewGroup.class, Boolean.TYPE}, yw.class);
        if (patchProxyResultProxy.isSupported) {
            return (yw) patchProxyResultProxy.result;
        }
        View viewInflate = layoutInflater.inflate(R.layout.item_roll_room, viewGroup, false);
        if (z10) {
            viewGroup.addView(viewInflate);
        }
        return a(viewInflate);
    }

    @androidx.annotation.n0
    public RelativeLayout b() {
        return this.f118068a;
    }

    @Override // l3.c
    @androidx.annotation.n0
    public /* bridge */ /* synthetic */ View getRoot() {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 19761, new Class[0], View.class);
        return patchProxyResultProxy.isSupported ? (View) patchProxyResultProxy.result : b();
    }
}
