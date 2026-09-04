package com.max.xiaoheihe.module.game;

import android.app.Activity;
import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.DashPathEffect;
import android.graphics.Paint;
import android.graphics.PathEffect;
import android.graphics.Rect;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.GradientDrawable;
import android.os.Bundle;
import android.text.TextUtils;
import android.util.Pair;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.CompoundButton;
import android.widget.GridView;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.ListAdapter;
import android.widget.PopupWindow;
import android.widget.RelativeLayout;
import android.widget.TextView;
import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import butterknife.BindView;
import butterknife.ButterKnife;
import com.max.hbcommon.bean.FiltersObj;
import com.max.hbcommon.bean.KeyDescObj;
import com.max.hbcustomview.GradientTextView;
import com.max.hbminiprogram.NativeLittleProgramFragment;
import com.max.hbutils.bean.Result;
import com.max.hbutils.utils.ViewUtils;
import com.max.xiaoheihe.R;
import com.max.xiaoheihe.bean.PlayerInfoObj;
import com.max.xiaoheihe.bean.game.PlayerLeaderboardsObj;
import com.max.xiaoheihe.bean.game.pubg.PUBGRatingDistributionObj;
import com.max.xiaoheihe.module.game.ow.OWPlayerOverViewActivity;
import com.max.xiaoheihe.module.game.pubg.PUBGPlayerOverViewActivity;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.PatchProxyResult;
import com.scwang.smartrefresh.layout.SmartRefreshLayout;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

/* JADX INFO: loaded from: classes11.dex */
@n9.a({com.max.hbminiprogram.d.class})
public class PlayerLeaderboardsFragment extends NativeLittleProgramFragment implements com.max.xiaoheihe.module.game.adapter.e.b {
    private static final String Q = "game_type";
    public static ChangeQuickRedirect changeQuickRedirect;
    private String B;
    private List<FiltersObj> C;
    private com.max.hbcommon.base.adapter.s<PlayerInfoObj> G;
    private com.max.hbcommon.base.adapter.s<PUBGRatingDistributionObj> H;
    private com.max.hbcommon.base.adapter.t I;
    private FiltersObj J;
    private PopupWindow K;
    private GridView L;
    private float M;
    private int N;

    @BindView(R.id.rv)
    RecyclerView mRecyclerView;

    @BindView(R.id.srl)
    SmartRefreshLayout mRefreshLayout;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    LinearLayout f85332p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    View f85333q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    RecyclerView f85334r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    TextView f85335s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    TextView f85336t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    TextView f85337u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    TextView f85338v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    View f85339w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    TextView f85340x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    TextView f85341y;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    TextView f85342z;
    private int A = 2;
    private Map<String, String> D = new HashMap(16);
    private List<PlayerInfoObj> E = new ArrayList();
    private List<PUBGRatingDistributionObj> F = new ArrayList();
    private int O = -1;
    private List<String> P = new ArrayList();

    public class a extends com.max.hbcommon.base.adapter.s<PlayerInfoObj> {
        public static ChangeQuickRedirect changeQuickRedirect;

        /* JADX INFO: renamed from: com.max.xiaoheihe.module.game.PlayerLeaderboardsFragment$a$a, reason: collision with other inner class name */
        public class ViewOnClickListenerC0759a implements View.OnClickListener {
            public static ChangeQuickRedirect changeQuickRedirect;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            final /* synthetic */ String f85344b;

            /* JADX INFO: renamed from: c, reason: collision with root package name */
            final /* synthetic */ PlayerInfoObj f85345c;

            /* JADX INFO: renamed from: d, reason: collision with root package name */
            final /* synthetic */ String f85346d;

            ViewOnClickListenerC0759a(String str, PlayerInfoObj playerInfoObj, String str2) {
                this.f85344b = str;
                this.f85345c = playerInfoObj;
                this.f85346d = str2;
            }

            @Override // android.view.View.OnClickListener
            public void onClick(View view) {
                if (PatchProxy.proxy(new Object[]{view}, this, changeQuickRedirect, false, 35077, new Class[]{View.class}, Void.TYPE).isSupported) {
                    return;
                }
                if (lb.a.J0.equals(PlayerLeaderboardsFragment.this.B)) {
                    PUBGPlayerOverViewActivity.N1(((com.max.hbcommon.base.d) PlayerLeaderboardsFragment.this).mContext, this.f85344b, this.f85345c.getReal_name(), null, this.f85346d);
                } else if (lb.a.M0.equals(PlayerLeaderboardsFragment.this.B)) {
                    ((com.max.hbcommon.base.d) PlayerLeaderboardsFragment.this).mContext.startActivity(OWPlayerOverViewActivity.M1(((com.max.hbcommon.base.d) PlayerLeaderboardsFragment.this).mContext, this.f85346d, this.f85344b));
                }
            }
        }

        a(Context context, List list, int i10) {
            super(context, list, i10);
        }

        private void n(LinearLayout linearLayout, String str) {
            if (PatchProxy.proxy(new Object[]{linearLayout, str}, this, changeQuickRedirect, false, 35075, new Class[]{LinearLayout.class, String.class}, Void.TYPE).isSupported) {
                return;
            }
            linearLayout.removeAllViews();
            if (com.max.xiaoheihe.utils.l0.j0(str)) {
                ImageView imageView = new ImageView(((com.max.hbcommon.base.d) PlayerLeaderboardsFragment.this).mContext);
                imageView.setLayoutParams(new LinearLayout.LayoutParams(ViewUtils.f(((com.max.hbcommon.base.d) PlayerLeaderboardsFragment.this).mContext, 35.0f), ViewUtils.f(((com.max.hbcommon.base.d) PlayerLeaderboardsFragment.this).mContext, 14.0f)));
                linearLayout.addView(imageView);
                com.max.hbimage.b.K(str, imageView);
                return;
            }
            TextView textView = new TextView(((com.max.hbcommon.base.d) PlayerLeaderboardsFragment.this).mContext);
            linearLayout.addView(textView);
            textView.setTextSize(0, ((com.max.hbcommon.base.d) PlayerLeaderboardsFragment.this).mContext.getResources().getDimensionPixelSize(R.dimen.text_size_12));
            textView.setTextColor(((com.max.hbcommon.base.d) PlayerLeaderboardsFragment.this).mContext.getResources().getColor(R.color.text_primary_1_color));
            textView.setSingleLine(true);
            textView.setEllipsize(TextUtils.TruncateAt.END);
            textView.setText(str);
        }

        private void o(com.max.hbcommon.base.adapter.s.e eVar, PlayerInfoObj playerInfoObj) {
            String rank;
            if (PatchProxy.proxy(new Object[]{eVar, playerInfoObj}, this, changeQuickRedirect, false, 35074, new Class[]{com.max.hbcommon.base.adapter.s.e.class, PlayerInfoObj.class}, Void.TYPE).isSupported) {
                return;
            }
            eVar.b().setPadding(ViewUtils.f(((com.max.hbcommon.base.d) PlayerLeaderboardsFragment.this).mContext, 4.0f), 0, ViewUtils.f(((com.max.hbcommon.base.d) PlayerLeaderboardsFragment.this).mContext, 4.0f), 0);
            GradientTextView gradientTextView = (GradientTextView) eVar.i(R.id.tv_rank);
            View viewI = eVar.i(R.id.left_space);
            ImageView imageView = (ImageView) eVar.i(R.id.iv_avatar);
            TextView textView = (TextView) eVar.i(R.id.tv_nickname);
            LinearLayout linearLayout = (LinearLayout) eVar.i(R.id.ll_value0);
            LinearLayout linearLayout2 = (LinearLayout) eVar.i(R.id.ll_value1);
            LinearLayout linearLayout3 = (LinearLayout) eVar.i(R.id.ll_value2);
            if (com.max.hbcommon.utils.c.u(playerInfoObj.getRank())) {
                rank = ((eVar.getAdapterPosition() - PlayerLeaderboardsFragment.this.I.u()) + 1) + "";
            } else {
                rank = playerInfoObj.getRank();
            }
            Pair<Integer, Integer> pairO = com.max.xiaoheihe.module.account.utils.l.o(com.max.hbutils.utils.n.q(rank));
            gradientTextView.setColors(((Integer) pairO.first).intValue(), ((Integer) pairO.second).intValue(), GradientDrawable.Orientation.BL_TR);
            bb.d.d(gradientTextView, 3);
            gradientTextView.setText(rank);
            viewI.setVisibility(8);
            com.max.hbimage.b.d0(playerInfoObj.getPlayer_info().getAvatar(), imageView, ViewUtils.f(((com.max.hbcommon.base.d) PlayerLeaderboardsFragment.this).mContext, 2.0f));
            textView.setText(playerInfoObj.getPlayer_info().getNickname());
            linearLayout.setVisibility(0);
            linearLayout2.setVisibility(0);
            n(linearLayout, playerInfoObj.getValue1());
            n(linearLayout2, playerInfoObj.getValue2());
            if (PlayerLeaderboardsFragment.this.A != 3) {
                linearLayout3.setVisibility(8);
            } else {
                linearLayout3.setVisibility(0);
                n(linearLayout3, playerInfoObj.getValue3());
            }
        }

        /* JADX WARN: Code duplicated, block: B:55:0x0239  */
        /* JADX WARN: Code duplicated, block: B:58:0x0257  */
        /* JADX WARN: Code duplicated, block: B:59:0x025f  */
        /* JADX WARN: Code duplicated, block: B:61:0x026b  */
        /* JADX WARN: Code duplicated, block: B:69:0x0298  */
        /* JADX WARN: Code duplicated, block: B:72:0x02ab  */
        /* JADX WARN: Code duplicated, block: B:80:0x02d6  */
        /* JADX WARN: Code duplicated, block: B:82:0x02e3  */
        /* JADX WARN: Code duplicated, block: B:84:0x02ef  */
        /* JADX WARN: Code duplicated, block: B:86:0x02fb  */
        public void m(com.max.hbcommon.base.adapter.s.e eVar, PlayerInfoObj playerInfoObj) {
            String rank;
            String nickname;
            String avatar;
            String str;
            String portraitAvatar;
            String nickname2;
            if (PatchProxy.proxy(new Object[]{eVar, playerInfoObj}, this, changeQuickRedirect, false, 35073, new Class[]{com.max.hbcommon.base.adapter.s.e.class, PlayerInfoObj.class}, Void.TYPE).isSupported) {
                return;
            }
            if (eVar.d() == R.layout.item_player_leaderboards_normal_wrapper) {
                o(eVar, playerInfoObj);
            } else {
                ImageView imageView = (ImageView) eVar.i(R.id.iv_avatar);
                ImageView imageView2 = (ImageView) eVar.i(R.id.iv_rating_img);
                TextView textView = (TextView) eVar.i(R.id.tv_nickname);
                TextView textView2 = (TextView) eVar.i(R.id.tv_value0);
                TextView textView3 = (TextView) eVar.i(R.id.tv_value1);
                TextView textView4 = (TextView) eVar.i(R.id.tv_value2);
                if (com.max.hbcommon.utils.c.u(playerInfoObj.getRank())) {
                    rank = ((eVar.getAdapterPosition() - PlayerLeaderboardsFragment.this.I.u()) + 1) + "";
                } else {
                    rank = playerInfoObj.getRank();
                }
                if (eVar.i(R.id.tv_rank) instanceof GradientTextView) {
                    GradientTextView gradientTextView = (GradientTextView) eVar.i(R.id.tv_rank);
                    Pair<Integer, Integer> pairO = com.max.xiaoheihe.module.account.utils.l.o(com.max.hbutils.utils.n.q(rank));
                    gradientTextView.setColors(((Integer) pairO.first).intValue(), ((Integer) pairO.second).intValue(), GradientDrawable.Orientation.BL_TR);
                    bb.d.d(gradientTextView, 3);
                    gradientTextView.setText(rank);
                } else {
                    ((TextView) eVar.i(R.id.tv_rank)).setText(rank);
                }
                if (lb.a.J0.equals(PlayerLeaderboardsFragment.this.B)) {
                    String nickname3 = playerInfoObj.getNickname();
                    avatar = playerInfoObj.getAvatar();
                    if (com.max.hbcommon.utils.c.u(playerInfoObj.getRating_img())) {
                        imageView2.setVisibility(4);
                    } else {
                        imageView2.setVisibility(0);
                        com.max.hbimage.b.K(playerInfoObj.getRating_img(), imageView2);
                    }
                    textView2.setGravity(16);
                    nickname = nickname3;
                } else {
                    if (lb.a.K0.equals(PlayerLeaderboardsFragment.this.B)) {
                        String name = playerInfoObj.getName();
                        portraitAvatar = playerInfoObj.getAvatar();
                        nickname2 = name;
                        imageView2.setVisibility(8);
                    } else if (lb.a.L0.equals(PlayerLeaderboardsFragment.this.B)) {
                        String nickname4 = playerInfoObj.getNickname();
                        portraitAvatar = playerInfoObj.getAvatar();
                        nickname2 = nickname4;
                        imageView2.setVisibility(8);
                    } else if (lb.a.S0.equals(PlayerLeaderboardsFragment.this.B)) {
                        nickname2 = playerInfoObj.getNickname();
                        portraitAvatar = playerInfoObj.getAvatar();
                        if (com.max.hbcommon.utils.c.u(playerInfoObj.getLevel_img())) {
                            imageView2.setVisibility(4);
                        } else {
                            imageView2.setVisibility(0);
                            com.max.hbimage.b.K(playerInfoObj.getLevel_img(), imageView2);
                        }
                        textView2.setGravity(16);
                    } else {
                        if (lb.a.M0.equals(PlayerLeaderboardsFragment.this.B)) {
                            String nickname5 = playerInfoObj.getNickname();
                            portraitAvatar = playerInfoObj.getPortraitAvatar();
                            nickname2 = nickname5;
                            imageView2.setVisibility(8);
                        } else if (lb.a.R0.equals(PlayerLeaderboardsFragment.this.B)) {
                            nickname = playerInfoObj.getNickname();
                            avatar = playerInfoObj.getAvatar();
                            imageView2.setVisibility(8);
                        } else if (lb.a.T0.equals(PlayerLeaderboardsFragment.this.B) || "csgo".equals(PlayerLeaderboardsFragment.this.B) || lb.a.V0.equals(PlayerLeaderboardsFragment.this.B)) {
                            nickname = playerInfoObj.getPlayer_info().getNickname();
                            avatar = playerInfoObj.getPlayer_info().getAvatar();
                            imageView2.setVisibility(8);
                        } else {
                            imageView2.setVisibility(8);
                            str = null;
                            nickname = null;
                        }
                        com.max.hbcommon.utils.d.a("PlayerLeaderboardsFragment, mBoardAdapter, name = " + nickname + ", avatar = " + str);
                        if (imageView != null) {
                            com.max.hbimage.b.d0(str, imageView, ViewUtils.f(((com.max.hbcommon.base.d) PlayerLeaderboardsFragment.this).mContext, 2.0f));
                        }
                        textView.setText(nickname);
                        if (lb.a.S0.equals(PlayerLeaderboardsFragment.this.B)) {
                            textView2.setText(playerInfoObj.getLevel_desc());
                        } else if (!lb.a.R0.equals(PlayerLeaderboardsFragment.this.B) || lb.a.T0.equals(PlayerLeaderboardsFragment.this.B) || "csgo".equals(PlayerLeaderboardsFragment.this.B) || lb.a.V0.equals(PlayerLeaderboardsFragment.this.B)) {
                            textView2.setText(playerInfoObj.getValue1());
                        } else {
                            textView2.setText(playerInfoObj.getValue());
                        }
                        if (!lb.a.R0.equals(PlayerLeaderboardsFragment.this.B) || lb.a.T0.equals(PlayerLeaderboardsFragment.this.B) || "csgo".equals(PlayerLeaderboardsFragment.this.B) || lb.a.V0.equals(PlayerLeaderboardsFragment.this.B)) {
                            textView3.setVisibility(0);
                            textView3.setText(playerInfoObj.getValue2());
                        } else {
                            textView3.setVisibility(8);
                        }
                        if (textView4 != null) {
                            if ((!lb.a.T0.equals(PlayerLeaderboardsFragment.this.B) || lb.a.V0.equals(PlayerLeaderboardsFragment.this.B)) && PlayerLeaderboardsFragment.this.A == 3) {
                                textView4.setVisibility(0);
                                textView4.setText(playerInfoObj.getValue3());
                            } else {
                                textView4.setVisibility(8);
                            }
                        }
                    }
                    str = portraitAvatar;
                    nickname = nickname2;
                    com.max.hbcommon.utils.d.a("PlayerLeaderboardsFragment, mBoardAdapter, name = " + nickname + ", avatar = " + str);
                    if (imageView != null) {
                        com.max.hbimage.b.d0(str, imageView, ViewUtils.f(((com.max.hbcommon.base.d) PlayerLeaderboardsFragment.this).mContext, 2.0f));
                    }
                    textView.setText(nickname);
                    if (lb.a.S0.equals(PlayerLeaderboardsFragment.this.B)) {
                        textView2.setText(playerInfoObj.getLevel_desc());
                    } else if (lb.a.R0.equals(PlayerLeaderboardsFragment.this.B)) {
                        textView2.setText(playerInfoObj.getValue1());
                    } else {
                        textView2.setText(playerInfoObj.getValue1());
                    }
                    if (lb.a.R0.equals(PlayerLeaderboardsFragment.this.B)) {
                        textView3.setVisibility(0);
                        textView3.setText(playerInfoObj.getValue2());
                    } else {
                        textView3.setVisibility(0);
                        textView3.setText(playerInfoObj.getValue2());
                    }
                    if (textView4 != null) {
                        if (lb.a.T0.equals(PlayerLeaderboardsFragment.this.B)) {
                            textView4.setVisibility(0);
                            textView4.setText(playerInfoObj.getValue3());
                        } else {
                            textView4.setVisibility(0);
                            textView4.setText(playerInfoObj.getValue3());
                        }
                    }
                }
                str = avatar;
                com.max.hbcommon.utils.d.a("PlayerLeaderboardsFragment, mBoardAdapter, name = " + nickname + ", avatar = " + str);
                if (imageView != null) {
                    com.max.hbimage.b.d0(str, imageView, ViewUtils.f(((com.max.hbcommon.base.d) PlayerLeaderboardsFragment.this).mContext, 2.0f));
                }
                textView.setText(nickname);
                if (lb.a.S0.equals(PlayerLeaderboardsFragment.this.B)) {
                    textView2.setText(playerInfoObj.getLevel_desc());
                } else if (lb.a.R0.equals(PlayerLeaderboardsFragment.this.B)) {
                    textView2.setText(playerInfoObj.getValue1());
                } else {
                    textView2.setText(playerInfoObj.getValue1());
                }
                if (lb.a.R0.equals(PlayerLeaderboardsFragment.this.B)) {
                    textView3.setVisibility(0);
                    textView3.setText(playerInfoObj.getValue2());
                } else {
                    textView3.setVisibility(0);
                    textView3.setText(playerInfoObj.getValue2());
                }
                if (textView4 != null) {
                    if (lb.a.T0.equals(PlayerLeaderboardsFragment.this.B)) {
                        textView4.setVisibility(0);
                        textView4.setText(playerInfoObj.getValue3());
                    } else {
                        textView4.setVisibility(0);
                        textView4.setText(playerInfoObj.getValue3());
                    }
                }
            }
            String nickname6 = playerInfoObj.getNickname();
            playerInfoObj.getId();
            String player_id = playerInfoObj.getPlayer_id();
            playerInfoObj.getName();
            playerInfoObj.getAccount_id();
            playerInfoObj.getPlayer_info();
            eVar.itemView.setOnClickListener(new ViewOnClickListenerC0759a(nickname6, playerInfoObj, player_id));
        }

        @Override // com.max.hbcommon.base.adapter.s
        public /* bridge */ /* synthetic */ void onBindViewHolder(com.max.hbcommon.base.adapter.s.e eVar, PlayerInfoObj playerInfoObj) {
            if (PatchProxy.proxy(new Object[]{eVar, playerInfoObj}, this, changeQuickRedirect, false, 35076, new Class[]{com.max.hbcommon.base.adapter.s.e.class, Object.class}, Void.TYPE).isSupported) {
                return;
            }
            m(eVar, playerInfoObj);
        }
    }

    public class b implements Animation.AnimationListener {
        public static ChangeQuickRedirect changeQuickRedirect;

        b() {
        }

        @Override // android.view.animation.Animation.AnimationListener
        public void onAnimationEnd(Animation animation) {
        }

        @Override // android.view.animation.Animation.AnimationListener
        public void onAnimationRepeat(Animation animation) {
        }

        @Override // android.view.animation.Animation.AnimationListener
        public void onAnimationStart(Animation animation) {
            if (PatchProxy.proxy(new Object[]{animation}, this, changeQuickRedirect, false, 35078, new Class[]{Animation.class}, Void.TYPE).isSupported) {
                return;
            }
            PlayerLeaderboardsFragment.this.L.setVisibility(0);
        }
    }

    public class c implements Animation.AnimationListener {
        public static ChangeQuickRedirect changeQuickRedirect;

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ GridView f85349a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ PopupWindow f85350b;

        c(GridView gridView, PopupWindow popupWindow) {
            this.f85349a = gridView;
            this.f85350b = popupWindow;
        }

        @Override // android.view.animation.Animation.AnimationListener
        public void onAnimationEnd(Animation animation) {
            if (PatchProxy.proxy(new Object[]{animation}, this, changeQuickRedirect, false, 35079, new Class[]{Animation.class}, Void.TYPE).isSupported) {
                return;
            }
            this.f85349a.setVisibility(8);
            this.f85350b.dismiss();
        }

        @Override // android.view.animation.Animation.AnimationListener
        public void onAnimationRepeat(Animation animation) {
        }

        @Override // android.view.animation.Animation.AnimationListener
        public void onAnimationStart(Animation animation) {
        }
    }

    public class d extends com.max.hbcommon.base.adapter.s<PUBGRatingDistributionObj> {
        public static ChangeQuickRedirect changeQuickRedirect;

        d(Context context, List list, int i10) {
            super(context, list, i10);
        }

        public void m(com.max.hbcommon.base.adapter.s.e eVar, PUBGRatingDistributionObj pUBGRatingDistributionObj) {
            if (PatchProxy.proxy(new Object[]{eVar, pUBGRatingDistributionObj}, this, changeQuickRedirect, false, 35080, new Class[]{com.max.hbcommon.base.adapter.s.e.class, PUBGRatingDistributionObj.class}, Void.TYPE).isSupported) {
                return;
            }
            eVar.itemView.setTag(pUBGRatingDistributionObj);
            TextView textView = (TextView) eVar.i(R.id.tv_value);
            RelativeLayout.LayoutParams layoutParams = (RelativeLayout.LayoutParams) textView.getLayoutParams();
            layoutParams.width = 20;
            layoutParams.height = (int) ((ViewUtils.V(PlayerLeaderboardsFragment.this.f85334r) - 144) * com.max.hbutils.utils.n.p(pUBGRatingDistributionObj.getHeight()));
            textView.setBackgroundColor(PlayerLeaderboardsFragment.Q4(PlayerLeaderboardsFragment.this, eVar.getAdapterPosition(), getItemCount()));
            textView.setLayoutParams(layoutParams);
            if (eVar.getAdapterPosition() == PlayerLeaderboardsFragment.this.O) {
                eVar.i(R.id.view_checked).setVisibility(0);
            } else {
                eVar.i(R.id.view_checked).setVisibility(8);
            }
        }

        @Override // com.max.hbcommon.base.adapter.s
        public /* bridge */ /* synthetic */ void onBindViewHolder(com.max.hbcommon.base.adapter.s.e eVar, PUBGRatingDistributionObj pUBGRatingDistributionObj) {
            if (PatchProxy.proxy(new Object[]{eVar, pUBGRatingDistributionObj}, this, changeQuickRedirect, false, 35081, new Class[]{com.max.hbcommon.base.adapter.s.e.class, Object.class}, Void.TYPE).isSupported) {
                return;
            }
            m(eVar, pUBGRatingDistributionObj);
        }
    }

    public class e implements com.max.hbcommon.base.adapter.s.c {
        public static ChangeQuickRedirect changeQuickRedirect;

        e() {
        }

        @Override // com.max.hbcommon.base.adapter.s.c
        public void a(ViewGroup viewGroup, View view, int i10) {
            if (!PatchProxy.proxy(new Object[]{viewGroup, view, new Integer(i10)}, this, changeQuickRedirect, false, 35082, new Class[]{ViewGroup.class, View.class, Integer.TYPE}, Void.TYPE).isSupported && i10 != PlayerLeaderboardsFragment.this.O && i10 >= 0 && i10 < PlayerLeaderboardsFragment.this.F.size()) {
                PlayerLeaderboardsFragment.this.O = i10;
                PlayerLeaderboardsFragment.this.H.notifyDataSetChanged();
                PUBGRatingDistributionObj pUBGRatingDistributionObj = (PUBGRatingDistributionObj) PlayerLeaderboardsFragment.this.F.get(i10);
                PlayerLeaderboardsFragment.this.f85339w.setElevation(10.0f);
                PlayerLeaderboardsFragment.this.f85339w.setVisibility(0);
                int iL = ((ViewUtils.L(((com.max.hbcommon.base.d) PlayerLeaderboardsFragment.this).mContext) - 260) - 16) - ViewUtils.f(((com.max.hbcommon.base.d) PlayerLeaderboardsFragment.this).mContext, 8.0f);
                if (view.getRight() > iL) {
                    PlayerLeaderboardsFragment.this.f85339w.setTranslationX(iL);
                } else {
                    PlayerLeaderboardsFragment.this.f85339w.setTranslationX(view.getRight());
                }
                PlayerLeaderboardsFragment.this.f85339w.setTranslationY(80.0f);
                PlayerLeaderboardsFragment.this.f85340x.setText(pUBGRatingDistributionObj.getStart() + "\n-" + pUBGRatingDistributionObj.getEnd());
                PlayerLeaderboardsFragment.this.f85341y.setText(pUBGRatingDistributionObj.getPercentile());
                PlayerLeaderboardsFragment.this.f85342z.setText(pUBGRatingDistributionObj.getTop());
            }
        }
    }

    public class f extends RecyclerView.OnScrollListener {
        public static ChangeQuickRedirect changeQuickRedirect;

        f() {
        }

        @Override // androidx.recyclerview.widget.RecyclerView.OnScrollListener
        public void onScrolled(RecyclerView recyclerView, int i10, int i11) {
            Object[] objArr = {recyclerView, new Integer(i10), new Integer(i11)};
            ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
            Class cls = Integer.TYPE;
            if (PatchProxy.proxy(objArr, this, changeQuickRedirect2, false, 35083, new Class[]{RecyclerView.class, cls, cls}, Void.TYPE).isSupported) {
                return;
            }
            super.onScrolled(recyclerView, i10, i11);
            if (PlayerLeaderboardsFragment.this.f85339w.getVisibility() == 0) {
                PlayerLeaderboardsFragment.this.f85339w.offsetLeftAndRight(-i10);
            }
        }
    }

    public class g implements pg.d {
        public static ChangeQuickRedirect changeQuickRedirect;

        g() {
        }

        @Override // pg.d
        public void k(ng.j jVar) {
            if (PatchProxy.proxy(new Object[]{jVar}, this, changeQuickRedirect, false, 35084, new Class[]{ng.j.class}, Void.TYPE).isSupported) {
                return;
            }
            PlayerLeaderboardsFragment.Y4(PlayerLeaderboardsFragment.this, false);
        }
    }

    public class h extends com.max.hbcommon.network.d<Result<PlayerLeaderboardsObj>> {
        public static ChangeQuickRedirect changeQuickRedirect;

        h() {
        }

        @Override // com.max.hbcommon.network.d, io.reactivex.g0
        public void onComplete() {
            if (!PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 35086, new Class[0], Void.TYPE).isSupported && PlayerLeaderboardsFragment.this.isActive()) {
                super.onComplete();
                PlayerLeaderboardsFragment.this.mRefreshLayout.A(0);
                PlayerLeaderboardsFragment.this.mRefreshLayout.p(0);
            }
        }

        @Override // com.max.hbcommon.network.d, io.reactivex.g0
        public void onError(Throwable th2) {
            if (!PatchProxy.proxy(new Object[]{th2}, this, changeQuickRedirect, false, 35085, new Class[]{Throwable.class}, Void.TYPE).isSupported && PlayerLeaderboardsFragment.this.isActive()) {
                super.onError(th2);
                PlayerLeaderboardsFragment.Z4(PlayerLeaderboardsFragment.this);
                PlayerLeaderboardsFragment.this.mRefreshLayout.A(0);
                PlayerLeaderboardsFragment.this.mRefreshLayout.p(0);
            }
        }

        public void onNext(Result<PlayerLeaderboardsObj> result) {
            if (!PatchProxy.proxy(new Object[]{result}, this, changeQuickRedirect, false, 35087, new Class[]{Result.class}, Void.TYPE).isSupported && PlayerLeaderboardsFragment.this.isActive()) {
                super.onNext(result);
                PlayerLeaderboardsFragment.a5(PlayerLeaderboardsFragment.this, result.getResult());
            }
        }

        @Override // com.max.hbcommon.network.d, io.reactivex.g0
        public /* bridge */ /* synthetic */ void onNext(Object obj) {
            if (PatchProxy.proxy(new Object[]{obj}, this, changeQuickRedirect, false, 35088, new Class[]{Object.class}, Void.TYPE).isSupported) {
                return;
            }
            onNext((Result<PlayerLeaderboardsObj>) obj);
        }
    }

    public class i implements View.OnClickListener {
        public static ChangeQuickRedirect changeQuickRedirect;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ int f85357b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ TextView f85358c;

        i(int i10, TextView textView) {
            this.f85357b = i10;
            this.f85358c = textView;
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            if (PatchProxy.proxy(new Object[]{view}, this, changeQuickRedirect, false, 35089, new Class[]{View.class}, Void.TYPE).isSupported) {
                return;
            }
            PlayerLeaderboardsFragment playerLeaderboardsFragment = PlayerLeaderboardsFragment.this;
            playerLeaderboardsFragment.J = (FiltersObj) playerLeaderboardsFragment.C.get(this.f85357b);
            PlayerLeaderboardsFragment playerLeaderboardsFragment2 = PlayerLeaderboardsFragment.this;
            PlayerLeaderboardsFragment.f5(playerLeaderboardsFragment2, ((com.max.hbcommon.base.d) playerLeaderboardsFragment2).mContext, this.f85358c, PlayerLeaderboardsFragment.this.J.getValues(), PlayerLeaderboardsFragment.this);
        }
    }

    public class j implements View.OnClickListener {
        public static ChangeQuickRedirect changeQuickRedirect;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ Context f85360b;

        j(Context context) {
            this.f85360b = context;
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            if (PatchProxy.proxy(new Object[]{view}, this, changeQuickRedirect, false, 35090, new Class[]{View.class}, Void.TYPE).isSupported) {
                return;
            }
            PlayerLeaderboardsFragment playerLeaderboardsFragment = PlayerLeaderboardsFragment.this;
            playerLeaderboardsFragment.u5(this.f85360b, playerLeaderboardsFragment.K, PlayerLeaderboardsFragment.this.L);
        }
    }

    public class k implements PopupWindow.OnDismissListener {
        public static ChangeQuickRedirect changeQuickRedirect;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ View f85362b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ Context f85363c;

        k(View view, Context context) {
            this.f85362b = view;
            this.f85363c = context;
        }

        @Override // android.widget.PopupWindow.OnDismissListener
        public void onDismiss() {
            View view;
            if (PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 35091, new Class[0], Void.TYPE).isSupported || (view = this.f85362b) == null || !(view instanceof TextView)) {
                return;
            }
            TextView textView = (TextView) view;
            textView.setTextColor(this.f85363c.getResources().getColor(R.color.text_secondary_1_color));
            PlayerLeaderboardsFragment playerLeaderboardsFragment = PlayerLeaderboardsFragment.this;
            KeyDescObj keyDescObjJ5 = PlayerLeaderboardsFragment.j5(playerLeaderboardsFragment, playerLeaderboardsFragment.J);
            if (keyDescObjJ5 != null) {
                textView.setText(keyDescObjJ5.getValue() + " " + lb.b.f131094j);
            }
        }
    }

    public class l extends RecyclerView.ItemDecoration {
        public static ChangeQuickRedirect changeQuickRedirect;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private Paint f85365b = new Paint();

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private Paint f85366c = new Paint();

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private PathEffect f85367d = new DashPathEffect(new float[]{5.0f, 5.0f, 5.0f, 5.0f}, 1.0f);

        public l() {
            this.f85365b.setAntiAlias(true);
            this.f85366c.setAntiAlias(true);
        }

        @Override // androidx.recyclerview.widget.RecyclerView.ItemDecoration
        public void getItemOffsets(Rect rect, View view, RecyclerView recyclerView, RecyclerView.State state) {
            if (PatchProxy.proxy(new Object[]{rect, view, recyclerView, state}, this, changeQuickRedirect, false, 35093, new Class[]{Rect.class, View.class, RecyclerView.class, RecyclerView.State.class}, Void.TYPE).isSupported) {
                return;
            }
            int childAdapterPosition = recyclerView.getChildAdapterPosition(view);
            int itemCount = recyclerView.getAdapter().getItemCount();
            if (childAdapterPosition == 0) {
                rect.set(40, 84, 0, 40);
            } else if (childAdapterPosition == itemCount - 1) {
                rect.set(0, 84, 40, 40);
            } else {
                rect.set(0, 84, 0, 40);
            }
        }

        @Override // androidx.recyclerview.widget.RecyclerView.ItemDecoration
        public void onDraw(Canvas canvas, RecyclerView recyclerView, RecyclerView.State state) {
            int width;
            int i10;
            float f10;
            int i11;
            boolean z10 = false;
            if (PatchProxy.proxy(new Object[]{canvas, recyclerView, state}, this, changeQuickRedirect, false, 35092, new Class[]{Canvas.class, RecyclerView.class, RecyclerView.State.class}, Void.TYPE).isSupported) {
                return;
            }
            if (recyclerView.getClipToPadding()) {
                int paddingLeft = recyclerView.getPaddingLeft();
                int width2 = recyclerView.getWidth() - recyclerView.getPaddingRight();
                canvas.clipRect(paddingLeft, recyclerView.getPaddingTop(), width2, recyclerView.getHeight() - recyclerView.getPaddingBottom());
                i10 = paddingLeft;
                width = width2;
            } else {
                width = recyclerView.getWidth();
                i10 = 0;
            }
            int top = recyclerView.getTop() + 84;
            int height = recyclerView.getHeight() - 40;
            int i12 = (int) ((height - top) / 4.0f);
            int i13 = 0;
            while (true) {
                f10 = 2.0f;
                i11 = -1972501;
                if (i13 >= 5) {
                    break;
                }
                if (i13 == 0 || i13 == 4) {
                    this.f85365b.setPathEffect(null);
                    this.f85365b.setStyle(Paint.Style.STROKE);
                    this.f85365b.setColor(-1972501);
                    this.f85365b.setStrokeWidth(2.0f);
                } else {
                    this.f85365b.setPathEffect(null);
                    this.f85365b.setStyle(Paint.Style.STROKE);
                    this.f85365b.setColor(2145511147);
                    this.f85365b.setStrokeWidth(1.0f);
                }
                float f11 = (i13 * i12) + top;
                canvas.drawLine(i10, f11, width, f11, this.f85365b);
                i13++;
                i12 = i12;
            }
            int childCount = recyclerView.getChildCount();
            int i14 = 0;
            while (i14 < childCount) {
                View childAt = recyclerView.getChildAt(i14);
                PUBGRatingDistributionObj pUBGRatingDistributionObj = (PUBGRatingDistributionObj) childAt.getTag();
                Iterator it = PlayerLeaderboardsFragment.this.P.iterator();
                boolean z11 = z10;
                while (it.hasNext()) {
                    if (((String) it.next()).equals(pUBGRatingDistributionObj.getStart())) {
                        z11 = true;
                    }
                }
                if (z11) {
                    int iQ = com.max.hbutils.utils.n.q(pUBGRatingDistributionObj.getStart());
                    int iQ2 = iQ + ((com.max.hbutils.utils.n.q(pUBGRatingDistributionObj.getEnd()) - iQ) / 2);
                    int left = childAt.getLeft();
                    this.f85366c.setColor(androidx.core.view.j1.f21601t);
                    this.f85366c.setTextSize(18.0f);
                    this.f85366c.setTextAlign(Paint.Align.CENTER);
                    String strValueOf = String.valueOf(iQ2);
                    float f12 = left + 16;
                    canvas.drawText(strValueOf, f12, 60.0f, this.f85366c);
                    this.f85365b.setPathEffect(this.f85367d);
                    this.f85365b.setStyle(Paint.Style.STROKE);
                    this.f85365b.setColor(i11);
                    this.f85365b.setStrokeWidth(f10);
                    canvas.drawLine(f12, top, f12, height, this.f85365b);
                }
                i14++;
                i11 = i11;
                f10 = f10;
                z10 = false;
            }
        }
    }

    static /* synthetic */ int Q4(PlayerLeaderboardsFragment playerLeaderboardsFragment, int i10, int i11) {
        Object[] objArr = {playerLeaderboardsFragment, new Integer(i10), new Integer(i11)};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        Class cls = Integer.TYPE;
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(objArr, null, changeQuickRedirect2, true, 35067, new Class[]{PlayerLeaderboardsFragment.class, cls, cls}, cls);
        return patchProxyResultProxy.isSupported ? ((Integer) patchProxyResultProxy.result).intValue() : playerLeaderboardsFragment.s5(i10, i11);
    }

    static /* synthetic */ void Y4(PlayerLeaderboardsFragment playerLeaderboardsFragment, boolean z10) {
        if (PatchProxy.proxy(new Object[]{playerLeaderboardsFragment, new Byte(z10 ? (byte) 1 : (byte) 0)}, null, changeQuickRedirect, true, 35068, new Class[]{PlayerLeaderboardsFragment.class, Boolean.TYPE}, Void.TYPE).isSupported) {
            return;
        }
        playerLeaderboardsFragment.t5(z10);
    }

    static /* synthetic */ void Z4(PlayerLeaderboardsFragment playerLeaderboardsFragment) {
        if (PatchProxy.proxy(new Object[]{playerLeaderboardsFragment}, null, changeQuickRedirect, true, 35069, new Class[]{PlayerLeaderboardsFragment.class}, Void.TYPE).isSupported) {
            return;
        }
        playerLeaderboardsFragment.showError();
    }

    static /* synthetic */ void a5(PlayerLeaderboardsFragment playerLeaderboardsFragment, PlayerLeaderboardsObj playerLeaderboardsObj) {
        if (PatchProxy.proxy(new Object[]{playerLeaderboardsFragment, playerLeaderboardsObj}, null, changeQuickRedirect, true, 35070, new Class[]{PlayerLeaderboardsFragment.class, PlayerLeaderboardsObj.class}, Void.TYPE).isSupported) {
            return;
        }
        playerLeaderboardsFragment.x5(playerLeaderboardsObj);
    }

    static /* synthetic */ void f5(PlayerLeaderboardsFragment playerLeaderboardsFragment, Context context, View view, List list, com.max.xiaoheihe.module.game.adapter.e.b bVar) {
        if (PatchProxy.proxy(new Object[]{playerLeaderboardsFragment, context, view, list, bVar}, null, changeQuickRedirect, true, 35071, new Class[]{PlayerLeaderboardsFragment.class, Context.class, View.class, List.class, com.max.xiaoheihe.module.game.adapter.e.b.class}, Void.TYPE).isSupported) {
            return;
        }
        playerLeaderboardsFragment.y5(context, view, list, bVar);
    }

    static /* synthetic */ KeyDescObj j5(PlayerLeaderboardsFragment playerLeaderboardsFragment, FiltersObj filtersObj) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{playerLeaderboardsFragment, filtersObj}, null, changeQuickRedirect, true, 35072, new Class[]{PlayerLeaderboardsFragment.class, FiltersObj.class}, KeyDescObj.class);
        return patchProxyResultProxy.isSupported ? (KeyDescObj) patchProxyResultProxy.result : playerLeaderboardsFragment.r5(filtersObj);
    }

    private KeyDescObj r5(FiltersObj filtersObj) {
        List<KeyDescObj> values;
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{filtersObj}, this, changeQuickRedirect, false, 35063, new Class[]{FiltersObj.class}, KeyDescObj.class);
        if (patchProxyResultProxy.isSupported) {
            return (KeyDescObj) patchProxyResultProxy.result;
        }
        if (filtersObj == null || (values = filtersObj.getValues()) == null) {
            return null;
        }
        for (KeyDescObj keyDescObj : values) {
            if (keyDescObj.isChecked()) {
                return keyDescObj;
            }
        }
        return null;
    }

    private int s5(int i10, int i11) {
        Object[] objArr = {new Integer(i10), new Integer(i11)};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        Class cls = Integer.TYPE;
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(objArr, this, changeQuickRedirect2, false, 35065, new Class[]{cls, cls}, cls);
        if (patchProxyResultProxy.isSupported) {
            return ((Integer) patchProxyResultProxy.result).intValue();
        }
        int i12 = this.N;
        float f10 = 1.0f;
        if (i10 <= i12 && i12 != 0) {
            f10 = (i10 * 1.0f) / i12;
        } else if (i11 - i12 != 0) {
            f10 = 1.0f - (((i10 * 1.0f) - i12) / (i11 - i12));
        }
        return Color.rgb((int) (((double) 90) + ((double) ((-13) * f10)) + 0.5d), (int) (((double) 205) + ((double) ((-55) * f10)) + 0.5d), (int) (((double) 215) + ((double) (18 * f10)) + 0.5d));
    }

    private void t5(boolean z10) {
        io.reactivex.z<Result<PlayerLeaderboardsObj>> zVarT8;
        if (PatchProxy.proxy(new Object[]{new Byte(z10 ? (byte) 1 : (byte) 0)}, this, changeQuickRedirect, false, 35057, new Class[]{Boolean.TYPE}, Void.TYPE).isSupported) {
            return;
        }
        if (this.C != null) {
            this.D.clear();
            for (FiltersObj filtersObj : this.C) {
                String key = filtersObj.getKey();
                KeyDescObj keyDescObjR5 = r5(filtersObj);
                if (keyDescObjR5 != null) {
                    this.D.put(key, keyDescObjR5.getKey());
                    if (z10) {
                        break;
                    }
                }
            }
        }
        if (lb.a.J0.equals(this.B)) {
            zVarT8 = com.max.xiaoheihe.network.i.a().w6(this.D);
        } else if (lb.a.K0.equals(this.B)) {
            zVarT8 = com.max.xiaoheihe.network.i.a().A0(this.D);
        } else if (lb.a.L0.equals(this.B)) {
            zVarT8 = com.max.xiaoheihe.network.i.a().x6(this.D);
        } else if (lb.a.M0.equals(this.B)) {
            zVarT8 = com.max.xiaoheihe.network.i.a().v3(this.D);
        } else if (lb.a.R0.equals(this.B)) {
            zVarT8 = com.max.xiaoheihe.network.i.a().B5(this.D);
        } else if (lb.a.T0.equals(this.B)) {
            zVarT8 = com.max.xiaoheihe.network.i.a().h5(this.D);
        } else if ("csgo".equals(this.B)) {
            zVarT8 = com.max.xiaoheihe.network.i.a().y(this.D);
        } else {
            zVarT8 = lb.a.V0.equals(this.B) ? com.max.xiaoheihe.network.i.a().T8(this.D) : com.max.xiaoheihe.network.i.a().w6(this.D);
        }
        addDisposable((io.reactivex.disposables.b) zVarT8.I5(io.reactivex.schedulers.b.d()).a4(io.reactivex.android.schedulers.a.c()).J5(new h()));
    }

    public static PlayerLeaderboardsFragment v5(String str) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{str}, null, changeQuickRedirect, true, 35052, new Class[]{String.class}, PlayerLeaderboardsFragment.class);
        if (patchProxyResultProxy.isSupported) {
            return (PlayerLeaderboardsFragment) patchProxyResultProxy.result;
        }
        PlayerLeaderboardsFragment playerLeaderboardsFragment = new PlayerLeaderboardsFragment();
        Bundle bundle = new Bundle();
        bundle.putString("game_type", str);
        playerLeaderboardsFragment.setArguments(bundle);
        return playerLeaderboardsFragment;
    }

    private void x5(PlayerLeaderboardsObj playerLeaderboardsObj) {
        KeyDescObj keyDescObjR5;
        if (PatchProxy.proxy(new Object[]{playerLeaderboardsObj}, this, changeQuickRedirect, false, 35058, new Class[]{PlayerLeaderboardsObj.class}, Void.TYPE).isSupported) {
            return;
        }
        showContentView();
        if (playerLeaderboardsObj != null) {
            if (lb.a.M0.equals(this.B)) {
                playerLeaderboardsObj.setBoard(playerLeaderboardsObj.getBoards());
            } else if (lb.a.R0.equals(this.B) || lb.a.T0.equals(this.B) || "csgo".equals(this.B) || lb.a.V0.equals(this.B)) {
                playerLeaderboardsObj.setBoard(playerLeaderboardsObj.getPlayer_list());
            }
            w5(playerLeaderboardsObj.getFilter());
            if (playerLeaderboardsObj.getRating_distribution() == null || playerLeaderboardsObj.getRating_distribution().size() <= 0) {
                this.f85333q.setVisibility(8);
            } else {
                this.f85333q.setVisibility(0);
                this.f85339w.setVisibility(8);
                this.O = -1;
                this.M = 0.0f;
                this.N = 0;
                this.F.clear();
                this.F.addAll(playerLeaderboardsObj.getRating_distribution());
                int size = this.F.size();
                for (int i10 = 0; i10 < size; i10++) {
                    PUBGRatingDistributionObj pUBGRatingDistributionObj = this.F.get(i10);
                    if (com.max.hbutils.utils.n.p(pUBGRatingDistributionObj.getHeight()) > this.M) {
                        this.M = com.max.hbutils.utils.n.p(pUBGRatingDistributionObj.getHeight());
                        this.N = i10;
                    }
                }
                if (size > 5) {
                    this.P.clear();
                    this.P.add(this.F.get(0).getStart());
                    this.P.add(this.F.get(size / 4).getStart());
                    this.P.add(this.F.get(size / 2).getStart());
                    this.P.add(this.F.get((size * 3) / 4).getStart());
                    this.P.add(this.F.get(size - 1).getStart());
                }
                this.H.notifyDataSetChanged();
                this.f85334r.scrollToPosition((size - Math.min(ViewUtils.L(this.mContext) / 32, size)) / 2);
            }
            if (playerLeaderboardsObj.getBoard() != null) {
                if (!com.max.hbcommon.utils.c.u(playerLeaderboardsObj.getBoard_value_desc())) {
                    this.f85335s.setText(playerLeaderboardsObj.getBoard_value_desc());
                } else if (playerLeaderboardsObj.getFilter() != null && playerLeaderboardsObj.getFilter().size() > 0 && (keyDescObjR5 = r5(playerLeaderboardsObj.getFilter().get(playerLeaderboardsObj.getFilter().size() - 1))) != null) {
                    this.f85335s.setText(keyDescObjR5.getValue());
                }
                if (lb.a.T0.equals(this.B) || "csgo".equals(this.B) || lb.a.V0.equals(this.B)) {
                    this.f85336t.setVisibility(0);
                    this.f85336t.setText(playerLeaderboardsObj.getKey1());
                    this.f85337u.setVisibility(0);
                    this.f85337u.setText(playerLeaderboardsObj.getKey2());
                    if (com.max.hbcommon.utils.c.u(playerLeaderboardsObj.getKey3())) {
                        this.f85338v.setVisibility(8);
                        this.A = 2;
                    } else {
                        this.f85338v.setVisibility(0);
                        this.f85338v.setText(playerLeaderboardsObj.getKey3());
                        this.A = 3;
                    }
                }
                this.E.clear();
                this.E.addAll(playerLeaderboardsObj.getBoard());
                this.I.notifyDataSetChanged();
            }
        }
    }

    private void y5(Context context, View view, List<KeyDescObj> list, com.max.xiaoheihe.module.game.adapter.e.b bVar) {
        if (PatchProxy.proxy(new Object[]{context, view, list, bVar}, this, changeQuickRedirect, false, 35061, new Class[]{Context.class, View.class, List.class, com.max.xiaoheihe.module.game.adapter.e.b.class}, Void.TYPE).isSupported) {
            return;
        }
        if ((context instanceof Activity) && ((Activity) context).isFinishing()) {
            return;
        }
        View viewInflate = LayoutInflater.from(context).inflate(R.layout.layout_filter, (ViewGroup) null);
        View viewFindViewById = viewInflate.findViewById(R.id.divider_top);
        this.L = (GridView) viewInflate.findViewById(R.id.gv_filter);
        viewFindViewById.setVisibility(0);
        this.L.setAdapter((ListAdapter) new com.max.xiaoheihe.module.game.adapter.e(context, list, r5(this.J), bVar, 1));
        PopupWindow popupWindow = this.K;
        if (popupWindow != null) {
            popupWindow.dismiss();
        }
        this.K = new PopupWindow(viewInflate, -1, -1, true);
        viewInflate.setOnClickListener(new j(context));
        this.K.setTouchable(true);
        this.K.setBackgroundDrawable(new BitmapDrawable());
        this.K.setAnimationStyle(0);
        this.K.setOnDismissListener(new k(view, context));
        if (this.K.isShowing() || view == null) {
            return;
        }
        ViewUtils.o0(this.K, view);
        Animation animationLoadAnimation = AnimationUtils.loadAnimation(this.mContext, R.anim.filter_slide_in);
        animationLoadAnimation.setAnimationListener(new b());
        this.L.startAnimation(animationLoadAnimation);
        if (view instanceof TextView) {
            ((TextView) view).setTextColor(context.getResources().getColor(R.color.text_primary_1_color));
        }
    }

    private void z5(FiltersObj filtersObj, KeyDescObj keyDescObj) {
        List<KeyDescObj> values;
        if (PatchProxy.proxy(new Object[]{filtersObj, keyDescObj}, this, changeQuickRedirect, false, 35064, new Class[]{FiltersObj.class, KeyDescObj.class}, Void.TYPE).isSupported || filtersObj == null || keyDescObj == null || (values = filtersObj.getValues()) == null) {
            return;
        }
        for (KeyDescObj keyDescObj2 : values) {
            if (keyDescObj2.getKey() == null || !keyDescObj2.getKey().equals(keyDescObj.getKey())) {
                keyDescObj2.setChecked(false);
            } else {
                keyDescObj2.setChecked(true);
            }
        }
    }

    @Override // com.max.hbminiprogram.NativeLittleProgramFragment
    public void A4() {
        if (PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 35054, new Class[0], Void.TYPE).isSupported || getArguments() == null) {
            return;
        }
        this.B = getArguments().getString("game_type");
    }

    @Override // com.max.xiaoheihe.module.game.adapter.e.b
    public void a(CompoundButton compoundButton, KeyDescObj keyDescObj) {
        boolean z10 = false;
        if (PatchProxy.proxy(new Object[]{compoundButton, keyDescObj}, this, changeQuickRedirect, false, 35059, new Class[]{CompoundButton.class, KeyDescObj.class}, Void.TYPE).isSupported) {
            return;
        }
        z5(this.J, keyDescObj);
        u5(this.mContext, this.K, this.L);
        FiltersObj filtersObj = this.J;
        if (filtersObj != null && this.C.indexOf(filtersObj) == 0) {
            z10 = true;
        }
        t5(z10);
    }

    @Override // com.max.hbminiprogram.NativeLittleProgramFragment, com.max.hbminiprogram.d
    @androidx.annotation.n0
    public Fragment a2(@androidx.annotation.p0 Map<String, ?> map) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{map}, this, changeQuickRedirect, false, 35053, new Class[]{Map.class}, Fragment.class);
        if (patchProxyResultProxy.isSupported) {
            return (Fragment) patchProxyResultProxy.result;
        }
        if (map == null) {
            return null;
        }
        return v5((String) map.get("game_type"));
    }

    @Override // com.max.hbminiprogram.NativeLittleProgramFragment, com.max.hbminiprogram.fragment.BaseLittleProgramFragment
    public void a4(View view, boolean z10) {
        if (PatchProxy.proxy(new Object[]{view, new Byte(z10 ? (byte) 1 : (byte) 0)}, this, changeQuickRedirect, false, 35055, new Class[]{View.class, Boolean.TYPE}, Void.TYPE).isSupported) {
            return;
        }
        super.a4(view, z10);
        setContentView(R.layout.layout_sample_refresh_rv);
        this.mUnBinder = ButterKnife.f(this, view);
        this.mTitleBar.setTitle(getString(R.string.rank));
        this.mTitleBarDivider.setVisibility(0);
        this.mRecyclerView.setClipToPadding(false);
        this.mRecyclerView.setClipChildren(false);
        this.mRecyclerView.setPadding(0, 0, 0, ViewUtils.f(this.mContext, 4.0f));
        int i10 = R.layout.item_player_leaderboards_pubg;
        if (lb.a.R0.equals(this.B)) {
            i10 = R.layout.item_player_leaderboards_destiny2;
        } else if ("csgo".equals(this.B)) {
            i10 = R.layout.item_player_leaderboards_normal_wrapper;
        }
        this.G = new a(this.mContext, this.E, i10);
        d dVar = new d(this.mContext, this.F, R.layout.item_rating_distribution_pubg);
        this.H = dVar;
        dVar.setOnItemClickListener(new e());
        this.I = new com.max.hbcommon.base.adapter.t(this.G);
        this.mRecyclerView.setLayoutManager(new LinearLayoutManager(this.mContext));
        Activity activity = this.mContext;
        com.max.hbcommon.base.adapter.i iVar = new com.max.hbcommon.base.adapter.i(activity, ViewUtils.f(activity, 4.0f), ViewUtils.f(this.mContext, 4.0f));
        iVar.h(getResources().getColor(R.color.divider_color));
        this.mRecyclerView.addItemDecoration(iVar);
        View viewInflate = this.mInflater.inflate(R.layout.item_player_leaderboards_header_pubg, (ViewGroup) this.mRecyclerView, false);
        this.f85332p = (LinearLayout) viewInflate.findViewById(R.id.vg_filter);
        this.f85333q = viewInflate.findViewById(R.id.vg_rating_distribution);
        this.f85334r = (RecyclerView) viewInflate.findViewById(R.id.rv_rating_distribution);
        this.f85339w = viewInflate.findViewById(R.id.vg_rating_detail);
        this.f85340x = (TextView) viewInflate.findViewById(R.id.tv_rating_start_end);
        this.f85341y = (TextView) viewInflate.findViewById(R.id.tv_rating_percentile);
        this.f85342z = (TextView) viewInflate.findViewById(R.id.tv_rating_top);
        TextView textView = (TextView) viewInflate.findViewById(R.id.tv_distribution_title);
        TextView textView2 = (TextView) viewInflate.findViewById(R.id.tv_rating_desc);
        ImageView imageView = (ImageView) viewInflate.findViewById(R.id.iv_rating_space);
        ViewGroup viewGroup = (ViewGroup) viewInflate.findViewById(R.id.vg_pubg_header);
        ViewGroup viewGroup2 = (ViewGroup) viewInflate.findViewById(R.id.vg_destiny2_header);
        ViewGroup viewGroup3 = (ViewGroup) viewInflate.findViewById(R.id.vg_eclipse_header);
        ViewGroup viewGroup4 = (ViewGroup) viewInflate.findViewById(R.id.vg_player_header);
        if (lb.a.R0.equals(this.B)) {
            this.f85335s = (TextView) viewGroup2.findViewById(R.id.tv_board_value_desc);
            viewGroup.setVisibility(8);
            viewGroup2.setVisibility(0);
            viewGroup3.setVisibility(8);
            viewGroup4.setVisibility(8);
        } else if ("csgo".equals(this.B)) {
            this.f85336t = (TextView) viewGroup4.findViewById(R.id.tv_value0);
            this.f85337u = (TextView) viewGroup4.findViewById(R.id.tv_value1);
            this.f85338v = (TextView) viewGroup4.findViewById(R.id.tv_value2);
            this.f85335s = (TextView) viewGroup4.findViewById(R.id.tv_value2);
            viewGroup.setVisibility(8);
            viewGroup2.setVisibility(8);
            viewGroup3.setVisibility(8);
            viewGroup4.setVisibility(0);
        } else {
            this.f85336t = (TextView) viewGroup.findViewById(R.id.tv_board_value_desc0);
            this.f85337u = (TextView) viewGroup.findViewById(R.id.tv_board_value_desc1);
            this.f85338v = (TextView) viewGroup.findViewById(R.id.tv_board_value_desc);
            this.f85335s = (TextView) viewGroup.findViewById(R.id.tv_board_value_desc);
            viewGroup.setVisibility(0);
            viewGroup2.setVisibility(8);
            viewGroup3.setVisibility(8);
            viewGroup4.setVisibility(8);
        }
        if (lb.a.J0.equals(this.B)) {
            textView.setText(R.string.rating_distribution);
            textView2.setText(R.string.rating);
            imageView.setVisibility(0);
        } else if (lb.a.K0.equals(this.B)) {
            textView.setText(R.string.mmr_distribution);
            textView2.setText(R.string.mmr);
            imageView.setVisibility(8);
        } else if (lb.a.L0.equals(this.B)) {
            textView.setText(R.string.mmr_distribution);
            textView2.setText(R.string.k_avg);
            imageView.setVisibility(8);
        } else {
            textView.setText(R.string.rating_distribution);
            textView2.setText(R.string.rating);
            imageView.setVisibility(8);
        }
        this.f85334r.setLayerType(1, null);
        this.f85334r.setLayoutManager(new LinearLayoutManager(requireContext(), 0, false));
        this.f85334r.addItemDecoration(new l());
        this.f85334r.setAdapter(this.H);
        this.f85334r.addOnScrollListener(new f());
        this.I.p(R.layout.item_player_leaderboards_header_pubg, viewInflate);
        this.mRecyclerView.setAdapter(this.I);
        this.mRefreshLayout.S(new g());
        this.mRefreshLayout.b0(false);
        if (this.mIsFirst) {
            showLoading();
        }
    }

    @Override // com.max.hbminiprogram.fragment.BaseLittleProgramFragment, com.max.hbcommon.base.d
    public void initData() {
        if (PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 35056, new Class[0], Void.TYPE).isSupported) {
            return;
        }
        super.initData();
        showLoading();
        t5(false);
    }

    @Override // com.max.hbminiprogram.fragment.BaseLittleProgramFragment, com.max.hbcommon.base.d
    public void onRefresh() {
        if (PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 35066, new Class[0], Void.TYPE).isSupported) {
            return;
        }
        showLoading();
        t5(false);
    }

    public void u5(Context context, PopupWindow popupWindow, GridView gridView) {
        if (PatchProxy.proxy(new Object[]{context, popupWindow, gridView}, this, changeQuickRedirect, false, 35062, new Class[]{Context.class, PopupWindow.class, GridView.class}, Void.TYPE).isSupported) {
            return;
        }
        if (((context instanceof Activity) && ((Activity) context).isFinishing()) || popupWindow == null || !popupWindow.isShowing()) {
            return;
        }
        Animation animationLoadAnimation = AnimationUtils.loadAnimation(this.mContext, R.anim.filter_slide_out);
        animationLoadAnimation.setAnimationListener(new c(gridView, popupWindow));
        gridView.startAnimation(animationLoadAnimation);
    }

    public void w5(List<FiltersObj> list) {
        if (PatchProxy.proxy(new Object[]{list}, this, changeQuickRedirect, false, 35060, new Class[]{List.class}, Void.TYPE).isSupported) {
            return;
        }
        if (list == null) {
            this.f85332p.setVisibility(8);
            return;
        }
        for (int i10 = 0; i10 < list.size(); i10++) {
            String str = this.D.get(list.get(i10).getKey());
            List<KeyDescObj> values = list.get(i10).getValues();
            if (values != null) {
                KeyDescObj keyDescObj = null;
                for (int i11 = 0; i11 < values.size(); i11++) {
                    KeyDescObj keyDescObj2 = values.get(i11);
                    keyDescObj2.setIndex(i11);
                    if (lb.a.M0.equals(this.B)) {
                        keyDescObj2.setValue(keyDescObj2.getDesc());
                    }
                    keyDescObj2.setChecked(false);
                    if (!com.max.hbcommon.utils.c.u(str) && str.equals(keyDescObj2.getKey())) {
                        keyDescObj = keyDescObj2;
                    }
                }
                if (keyDescObj != null) {
                    keyDescObj.setChecked(true);
                } else if (values.size() > 0) {
                    values.get(0).setChecked(true);
                }
            }
        }
        if (this.C == null) {
            this.C = new ArrayList();
        }
        this.C.clear();
        this.C.addAll(list);
        this.f85332p.removeAllViews();
        this.f85332p.setOrientation(0);
        this.f85332p.setBackgroundColor(this.mContext.getResources().getColor(R.color.white));
        for (int i12 = 0; i12 < this.C.size(); i12++) {
            KeyDescObj keyDescObjR5 = r5(this.C.get(i12));
            TextView textView = new TextView(this.mContext);
            textView.setTextColor(this.mContext.getResources().getColor(R.color.text_secondary_1_color));
            textView.setTextSize(0, this.mContext.getResources().getDimensionPixelSize(R.dimen.text_size_12));
            bb.d.d(textView, 0);
            textView.setGravity(17);
            LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(0, -1);
            layoutParams.weight = 1.0f;
            textView.setLayoutParams(layoutParams);
            if (keyDescObjR5 != null) {
                textView.setText(keyDescObjR5.getValue() + " " + lb.b.f131094j);
            }
            textView.setOnClickListener(new i(i12, textView));
            this.f85332p.addView(textView);
            if (this.C.size() > 1 && i12 != this.C.size() - 1) {
                View view = new View(this.mContext);
                LinearLayout.LayoutParams layoutParams2 = new LinearLayout.LayoutParams(ViewUtils.f(this.mContext, 1.0f), ViewUtils.f(this.mContext, 16.0f));
                layoutParams2.gravity = 17;
                view.setLayoutParams(layoutParams2);
                view.setBackgroundColor(this.mContext.getResources().getColor(R.color.tab_layout_divider_color));
                this.f85332p.addView(view);
            }
        }
    }
}
