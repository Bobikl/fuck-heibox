package df;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import android.widget.Space;
import android.widget.TextView;
import androidx.cardview.widget.CardView;
import androidx.core.widget.NestedScrollView;
import androidx.recyclerview.widget.RecyclerView;
import com.donkingliang.consecutivescroller.ConsecutiveScrollerLayout;
import com.max.hbcommon.component.ListSectionHeader;
import com.max.hbcommon.component.bottombutton.BottomButtonLeftItemView;
import com.max.hbcustomview.HBLineHeightTextView;
import com.max.xiaoheihe.R;
import com.max.xiaoheihe.module.bbs.component.BBSUserSectionView;
import com.max.xiaoheihe.module.expression.widget.ExpressionTextView;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.PatchProxyResult;
import com.scwang.smartrefresh.layout.SmartRefreshLayout;

/* JADX INFO: compiled from: FragmentRollRoomDetailBinding.java */
/* JADX INFO: loaded from: classes3.dex */
public final class gb implements l3.c {
    public static ChangeQuickRedirect changeQuickRedirect;

    @androidx.annotation.n0
    public final RelativeLayout A;

    @androidx.annotation.n0
    public final LinearLayout B;

    @androidx.annotation.n0
    public final r80 C;

    @androidx.annotation.n0
    public final RelativeLayout D;

    @androidx.annotation.n0
    public final RelativeLayout E;

    @androidx.annotation.n0
    public final LinearLayout F;

    @androidx.annotation.n0
    public final RelativeLayout G;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @androidx.annotation.n0
    private final RelativeLayout f110899a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @androidx.annotation.n0
    public final BottomButtonLeftItemView f110900b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @androidx.annotation.n0
    public final ConsecutiveScrollerLayout f110901c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @androidx.annotation.n0
    public final CardView f110902d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    @androidx.annotation.n0
    public final ImageView f110903e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    @androidx.annotation.n0
    public final ListSectionHeader f110904f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    @androidx.annotation.n0
    public final NestedScrollView f110905g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    @androidx.annotation.n0
    public final RecyclerView f110906h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    @androidx.annotation.n0
    public final RecyclerView f110907i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    @androidx.annotation.n0
    public final RecyclerView f110908j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    @androidx.annotation.n0
    public final Space f110909k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    @androidx.annotation.n0
    public final Space f110910l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    @androidx.annotation.n0
    public final SmartRefreshLayout f110911m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    @androidx.annotation.n0
    public final ExpressionTextView f110912n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    @androidx.annotation.n0
    public final TextView f110913o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    @androidx.annotation.n0
    public final TextView f110914p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    @androidx.annotation.n0
    public final TextView f110915q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    @androidx.annotation.n0
    public final TextView f110916r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    @androidx.annotation.n0
    public final TextView f110917s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    @androidx.annotation.n0
    public final TextView f110918t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    @androidx.annotation.n0
    public final TextView f110919u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    @androidx.annotation.n0
    public final HBLineHeightTextView f110920v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    @androidx.annotation.n0
    public final TextView f110921w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    @androidx.annotation.n0
    public final BBSUserSectionView f110922x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    @androidx.annotation.n0
    public final View f110923y;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    @androidx.annotation.n0
    public final LinearLayout f110924z;

    private gb(@androidx.annotation.n0 RelativeLayout relativeLayout, @androidx.annotation.n0 BottomButtonLeftItemView bottomButtonLeftItemView, @androidx.annotation.n0 ConsecutiveScrollerLayout consecutiveScrollerLayout, @androidx.annotation.n0 CardView cardView, @androidx.annotation.n0 ImageView imageView, @androidx.annotation.n0 ListSectionHeader listSectionHeader, @androidx.annotation.n0 NestedScrollView nestedScrollView, @androidx.annotation.n0 RecyclerView recyclerView, @androidx.annotation.n0 RecyclerView recyclerView2, @androidx.annotation.n0 RecyclerView recyclerView3, @androidx.annotation.n0 Space space, @androidx.annotation.n0 Space space2, @androidx.annotation.n0 SmartRefreshLayout smartRefreshLayout, @androidx.annotation.n0 ExpressionTextView expressionTextView, @androidx.annotation.n0 TextView textView, @androidx.annotation.n0 TextView textView2, @androidx.annotation.n0 TextView textView3, @androidx.annotation.n0 TextView textView4, @androidx.annotation.n0 TextView textView5, @androidx.annotation.n0 TextView textView6, @androidx.annotation.n0 TextView textView7, @androidx.annotation.n0 HBLineHeightTextView hBLineHeightTextView, @androidx.annotation.n0 TextView textView8, @androidx.annotation.n0 BBSUserSectionView bBSUserSectionView, @androidx.annotation.n0 View view, @androidx.annotation.n0 LinearLayout linearLayout, @androidx.annotation.n0 RelativeLayout relativeLayout2, @androidx.annotation.n0 LinearLayout linearLayout2, @androidx.annotation.n0 r80 r80Var, @androidx.annotation.n0 RelativeLayout relativeLayout3, @androidx.annotation.n0 RelativeLayout relativeLayout4, @androidx.annotation.n0 LinearLayout linearLayout3, @androidx.annotation.n0 RelativeLayout relativeLayout5) {
        this.f110899a = relativeLayout;
        this.f110900b = bottomButtonLeftItemView;
        this.f110901c = consecutiveScrollerLayout;
        this.f110902d = cardView;
        this.f110903e = imageView;
        this.f110904f = listSectionHeader;
        this.f110905g = nestedScrollView;
        this.f110906h = recyclerView;
        this.f110907i = recyclerView2;
        this.f110908j = recyclerView3;
        this.f110909k = space;
        this.f110910l = space2;
        this.f110911m = smartRefreshLayout;
        this.f110912n = expressionTextView;
        this.f110913o = textView;
        this.f110914p = textView2;
        this.f110915q = textView3;
        this.f110916r = textView4;
        this.f110917s = textView5;
        this.f110918t = textView6;
        this.f110919u = textView7;
        this.f110920v = hBLineHeightTextView;
        this.f110921w = textView8;
        this.f110922x = bBSUserSectionView;
        this.f110923y = view;
        this.f110924z = linearLayout;
        this.A = relativeLayout2;
        this.B = linearLayout2;
        this.C = r80Var;
        this.D = relativeLayout3;
        this.E = relativeLayout4;
        this.F = linearLayout3;
        this.G = relativeLayout5;
    }

    @androidx.annotation.n0
    public static gb a(@androidx.annotation.n0 View view) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{view}, null, changeQuickRedirect, true, 17512, new Class[]{View.class}, gb.class);
        if (patchProxyResultProxy.isSupported) {
            return (gb) patchProxyResultProxy.result;
        }
        int i10 = R.id.bottom_button;
        BottomButtonLeftItemView bottomButtonLeftItemView = (BottomButtonLeftItemView) l3.d.a(view, R.id.bottom_button);
        if (bottomButtonLeftItemView != null) {
            i10 = R.id.csl;
            ConsecutiveScrollerLayout consecutiveScrollerLayout = (ConsecutiveScrollerLayout) l3.d.a(view, R.id.csl);
            if (consecutiveScrollerLayout != null) {
                i10 = R.id.cv_room_info;
                CardView cardView = (CardView) l3.d.a(view, R.id.cv_room_info);
                if (cardView != null) {
                    i10 = R.id.iv_like;
                    ImageView imageView = (ImageView) l3.d.a(view, R.id.iv_like);
                    if (imageView != null) {
                        i10 = R.id.lsh_win;
                        ListSectionHeader listSectionHeader = (ListSectionHeader) l3.d.a(view, R.id.lsh_win);
                        if (listSectionHeader != null) {
                            i10 = R.id.nsv_room_info;
                            NestedScrollView nestedScrollView = (NestedScrollView) l3.d.a(view, R.id.nsv_room_info);
                            if (nestedScrollView != null) {
                                i10 = R.id.rv_joined_user;
                                RecyclerView recyclerView = (RecyclerView) l3.d.a(view, R.id.rv_joined_user);
                                if (recyclerView != null) {
                                    i10 = R.id.rv_roll_items;
                                    RecyclerView recyclerView2 = (RecyclerView) l3.d.a(view, R.id.rv_roll_items);
                                    if (recyclerView2 != null) {
                                        i10 = R.id.rv_win_user;
                                        RecyclerView recyclerView3 = (RecyclerView) l3.d.a(view, R.id.rv_win_user);
                                        if (recyclerView3 != null) {
                                            i10 = R.id.space_content;
                                            Space space = (Space) l3.d.a(view, R.id.space_content);
                                            if (space != null) {
                                                i10 = R.id.space_joined_user;
                                                Space space2 = (Space) l3.d.a(view, R.id.space_joined_user);
                                                if (space2 != null) {
                                                    i10 = R.id.srl;
                                                    SmartRefreshLayout smartRefreshLayout = (SmartRefreshLayout) l3.d.a(view, R.id.srl);
                                                    if (smartRefreshLayout != null) {
                                                        i10 = R.id.tv_content;
                                                        ExpressionTextView expressionTextView = (ExpressionTextView) l3.d.a(view, R.id.tv_content);
                                                        if (expressionTextView != null) {
                                                            i10 = R.id.tv_get_prize_user_count;
                                                            TextView textView = (TextView) l3.d.a(view, R.id.tv_get_prize_user_count);
                                                            if (textView != null) {
                                                                i10 = R.id.tv_join_user_count;
                                                                TextView textView2 = (TextView) l3.d.a(view, R.id.tv_join_user_count);
                                                                if (textView2 != null) {
                                                                    i10 = R.id.tv_like;
                                                                    TextView textView3 = (TextView) l3.d.a(view, R.id.tv_like);
                                                                    if (textView3 != null) {
                                                                        i10 = R.id.tv_rmb_symbol;
                                                                        TextView textView4 = (TextView) l3.d.a(view, R.id.tv_rmb_symbol);
                                                                        if (textView4 != null) {
                                                                            i10 = R.id.tv_roll_item_count;
                                                                            TextView textView5 = (TextView) l3.d.a(view, R.id.tv_roll_item_count);
                                                                            if (textView5 != null) {
                                                                                i10 = R.id.tv_roll_item_price;
                                                                                TextView textView6 = (TextView) l3.d.a(view, R.id.tv_roll_item_price);
                                                                                if (textView6 != null) {
                                                                                    i10 = R.id.tv_time_desc;
                                                                                    TextView textView7 = (TextView) l3.d.a(view, R.id.tv_time_desc);
                                                                                    if (textView7 != null) {
                                                                                        i10 = R.id.tv_title;
                                                                                        HBLineHeightTextView hBLineHeightTextView = (HBLineHeightTextView) l3.d.a(view, R.id.tv_title);
                                                                                        if (hBLineHeightTextView != null) {
                                                                                            i10 = R.id.tv_total_price;
                                                                                            TextView textView8 = (TextView) l3.d.a(view, R.id.tv_total_price);
                                                                                            if (textView8 != null) {
                                                                                                i10 = R.id.v_user;
                                                                                                BBSUserSectionView bBSUserSectionView = (BBSUserSectionView) l3.d.a(view, R.id.v_user);
                                                                                                if (bBSUserSectionView != null) {
                                                                                                    i10 = R.id.v_user_mask;
                                                                                                    View viewA = l3.d.a(view, R.id.v_user_mask);
                                                                                                    if (viewA != null) {
                                                                                                        i10 = R.id.vg_joined_info;
                                                                                                        LinearLayout linearLayout = (LinearLayout) l3.d.a(view, R.id.vg_joined_info);
                                                                                                        if (linearLayout != null) {
                                                                                                            i10 = R.id.vg_joined_user;
                                                                                                            RelativeLayout relativeLayout = (RelativeLayout) l3.d.a(view, R.id.vg_joined_user);
                                                                                                            if (relativeLayout != null) {
                                                                                                                i10 = R.id.vg_like;
                                                                                                                LinearLayout linearLayout2 = (LinearLayout) l3.d.a(view, R.id.vg_like);
                                                                                                                if (linearLayout2 != null) {
                                                                                                                    i10 = R.id.vg_message;
                                                                                                                    View viewA2 = l3.d.a(view, R.id.vg_message);
                                                                                                                    if (viewA2 != null) {
                                                                                                                        r80 r80VarA = r80.a(viewA2);
                                                                                                                        i10 = R.id.vg_pwd_info;
                                                                                                                        RelativeLayout relativeLayout2 = (RelativeLayout) l3.d.a(view, R.id.vg_pwd_info);
                                                                                                                        if (relativeLayout2 != null) {
                                                                                                                            i10 = R.id.vg_roll_item_info;
                                                                                                                            RelativeLayout relativeLayout3 = (RelativeLayout) l3.d.a(view, R.id.vg_roll_item_info);
                                                                                                                            if (relativeLayout3 != null) {
                                                                                                                                i10 = R.id.vg_share;
                                                                                                                                LinearLayout linearLayout3 = (LinearLayout) l3.d.a(view, R.id.vg_share);
                                                                                                                                if (linearLayout3 != null) {
                                                                                                                                    i10 = R.id.vg_total_price;
                                                                                                                                    RelativeLayout relativeLayout4 = (RelativeLayout) l3.d.a(view, R.id.vg_total_price);
                                                                                                                                    if (relativeLayout4 != null) {
                                                                                                                                        return new gb((RelativeLayout) view, bottomButtonLeftItemView, consecutiveScrollerLayout, cardView, imageView, listSectionHeader, nestedScrollView, recyclerView, recyclerView2, recyclerView3, space, space2, smartRefreshLayout, expressionTextView, textView, textView2, textView3, textView4, textView5, textView6, textView7, hBLineHeightTextView, textView8, bBSUserSectionView, viewA, linearLayout, relativeLayout, linearLayout2, r80VarA, relativeLayout2, relativeLayout3, linearLayout3, relativeLayout4);
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
    public static gb c(@androidx.annotation.n0 LayoutInflater layoutInflater) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{layoutInflater}, null, changeQuickRedirect, true, 17510, new Class[]{LayoutInflater.class}, gb.class);
        return patchProxyResultProxy.isSupported ? (gb) patchProxyResultProxy.result : d(layoutInflater, null, false);
    }

    @androidx.annotation.n0
    public static gb d(@androidx.annotation.n0 LayoutInflater layoutInflater, @androidx.annotation.p0 ViewGroup viewGroup, boolean z10) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{layoutInflater, viewGroup, new Byte(z10 ? (byte) 1 : (byte) 0)}, null, changeQuickRedirect, true, 17511, new Class[]{LayoutInflater.class, ViewGroup.class, Boolean.TYPE}, gb.class);
        if (patchProxyResultProxy.isSupported) {
            return (gb) patchProxyResultProxy.result;
        }
        View viewInflate = layoutInflater.inflate(R.layout.fragment_roll_room_detail, viewGroup, false);
        if (z10) {
            viewGroup.addView(viewInflate);
        }
        return a(viewInflate);
    }

    @androidx.annotation.n0
    public RelativeLayout b() {
        return this.f110899a;
    }

    @Override // l3.c
    @androidx.annotation.n0
    public /* bridge */ /* synthetic */ View getRoot() {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 17513, new Class[0], View.class);
        return patchProxyResultProxy.isSupported ? (View) patchProxyResultProxy.result : b();
    }
}
