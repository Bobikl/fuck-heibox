package df;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import android.widget.TextView;
import androidx.recyclerview.widget.RecyclerView;
import com.max.hbcommon.component.segmentfilters.SegmentFilterView;
import com.max.xiaoheihe.R;
import com.max.xiaoheihe.module.game.component.GameAvatarView;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.PatchProxyResult;

/* JADX INFO: compiled from: ItemGameOverviewHeaderBinding.java */
/* JADX INFO: loaded from: classes3.dex */
public final class vl implements l3.c {
    public static ChangeQuickRedirect changeQuickRedirect;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @androidx.annotation.n0
    private final RelativeLayout f116873a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @androidx.annotation.n0
    public final ImageView f116874b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @androidx.annotation.n0
    public final RecyclerView f116875c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @androidx.annotation.n0
    public final TextView f116876d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    @androidx.annotation.n0
    public final TextView f116877e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    @androidx.annotation.n0
    public final TextView f116878f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    @androidx.annotation.n0
    public final SegmentFilterView f116879g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    @androidx.annotation.n0
    public final GameAvatarView f116880h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    @androidx.annotation.n0
    public final RelativeLayout f116881i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    @androidx.annotation.n0
    public final LinearLayout f116882j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    @androidx.annotation.n0
    public final LinearLayout f116883k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    @androidx.annotation.n0
    public final LinearLayout f116884l;

    private vl(@androidx.annotation.n0 RelativeLayout relativeLayout, @androidx.annotation.n0 ImageView imageView, @androidx.annotation.n0 RecyclerView recyclerView, @androidx.annotation.n0 TextView textView, @androidx.annotation.n0 TextView textView2, @androidx.annotation.n0 TextView textView3, @androidx.annotation.n0 SegmentFilterView segmentFilterView, @androidx.annotation.n0 GameAvatarView gameAvatarView, @androidx.annotation.n0 RelativeLayout relativeLayout2, @androidx.annotation.n0 LinearLayout linearLayout, @androidx.annotation.n0 LinearLayout linearLayout2, @androidx.annotation.n0 LinearLayout linearLayout3) {
        this.f116873a = relativeLayout;
        this.f116874b = imageView;
        this.f116875c = recyclerView;
        this.f116876d = textView;
        this.f116877e = textView2;
        this.f116878f = textView3;
        this.f116879g = segmentFilterView;
        this.f116880h = gameAvatarView;
        this.f116881i = relativeLayout2;
        this.f116882j = linearLayout;
        this.f116883k = linearLayout2;
        this.f116884l = linearLayout3;
    }

    @androidx.annotation.n0
    public static vl a(@androidx.annotation.n0 View view) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{view}, null, changeQuickRedirect, true, 18608, new Class[]{View.class}, vl.class);
        if (patchProxyResultProxy.isSupported) {
            return (vl) patchProxyResultProxy.result;
        }
        int i10 = R.id.iv_authentication;
        ImageView imageView = (ImageView) l3.d.a(view, R.id.iv_authentication);
        if (imageView != null) {
            i10 = R.id.rv_selections;
            RecyclerView recyclerView = (RecyclerView) l3.d.a(view, R.id.rv_selections);
            if (recyclerView != null) {
                i10 = R.id.tv_events_progress;
                TextView textView = (TextView) l3.d.a(view, R.id.tv_events_progress);
                if (textView != null) {
                    i10 = R.id.tv_name;
                    TextView textView2 = (TextView) l3.d.a(view, R.id.tv_name);
                    if (textView2 != null) {
                        i10 = R.id.tv_steam_id;
                        TextView textView3 = (TextView) l3.d.a(view, R.id.tv_steam_id);
                        if (textView3 != null) {
                            i10 = R.id.v_filter;
                            SegmentFilterView segmentFilterView = (SegmentFilterView) l3.d.a(view, R.id.v_filter);
                            if (segmentFilterView != null) {
                                i10 = R.id.v_game_avatar;
                                GameAvatarView gameAvatarView = (GameAvatarView) l3.d.a(view, R.id.v_game_avatar);
                                if (gameAvatarView != null) {
                                    i10 = R.id.vg_name;
                                    RelativeLayout relativeLayout = (RelativeLayout) l3.d.a(view, R.id.vg_name);
                                    if (relativeLayout != null) {
                                        i10 = R.id.vg_no_data_help;
                                        LinearLayout linearLayout = (LinearLayout) l3.d.a(view, R.id.vg_no_data_help);
                                        if (linearLayout != null) {
                                            i10 = R.id.vg_plus;
                                            LinearLayout linearLayout2 = (LinearLayout) l3.d.a(view, R.id.vg_plus);
                                            if (linearLayout2 != null) {
                                                i10 = R.id.vg_steam_id;
                                                LinearLayout linearLayout3 = (LinearLayout) l3.d.a(view, R.id.vg_steam_id);
                                                if (linearLayout3 != null) {
                                                    return new vl((RelativeLayout) view, imageView, recyclerView, textView, textView2, textView3, segmentFilterView, gameAvatarView, relativeLayout, linearLayout, linearLayout2, linearLayout3);
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
    public static vl c(@androidx.annotation.n0 LayoutInflater layoutInflater) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{layoutInflater}, null, changeQuickRedirect, true, 18606, new Class[]{LayoutInflater.class}, vl.class);
        return patchProxyResultProxy.isSupported ? (vl) patchProxyResultProxy.result : d(layoutInflater, null, false);
    }

    @androidx.annotation.n0
    public static vl d(@androidx.annotation.n0 LayoutInflater layoutInflater, @androidx.annotation.p0 ViewGroup viewGroup, boolean z10) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{layoutInflater, viewGroup, new Byte(z10 ? (byte) 1 : (byte) 0)}, null, changeQuickRedirect, true, 18607, new Class[]{LayoutInflater.class, ViewGroup.class, Boolean.TYPE}, vl.class);
        if (patchProxyResultProxy.isSupported) {
            return (vl) patchProxyResultProxy.result;
        }
        View viewInflate = layoutInflater.inflate(R.layout.item_game_overview_header, viewGroup, false);
        if (z10) {
            viewGroup.addView(viewInflate);
        }
        return a(viewInflate);
    }

    @androidx.annotation.n0
    public RelativeLayout b() {
        return this.f116873a;
    }

    @Override // l3.c
    @androidx.annotation.n0
    public /* bridge */ /* synthetic */ View getRoot() {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 18609, new Class[0], View.class);
        return patchProxyResultProxy.isSupported ? (View) patchProxyResultProxy.result : b();
    }
}
