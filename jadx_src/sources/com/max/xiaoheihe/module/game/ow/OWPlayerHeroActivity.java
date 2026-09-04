package com.max.xiaoheihe.module.game.ow;

import android.content.Context;
import android.content.Intent;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AbsListView;
import android.widget.ImageView;
import android.widget.ListAdapter;
import android.widget.ListView;
import android.widget.RelativeLayout;
import android.widget.TextView;
import butterknife.BindView;
import butterknife.ButterKnife;
import com.max.hbcommon.base.BaseActivity;
import com.max.hbcommon.base.adapter.h;
import com.max.hbcustomview.HorizontalScrollListView;
import com.max.hbutils.bean.Result;
import com.max.hbutils.utils.ViewUtils;
import com.max.hbutils.utils.n;
import com.max.xiaoheihe.R;
import com.max.xiaoheihe.bean.game.ow.OWPlayerHeroObj;
import com.max.xiaoheihe.bean.game.ow.OWPlayerOverviewObj;
import com.max.xiaoheihe.module.webview.WebActionActivity;
import com.max.xiaoheihe.network.i;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.PatchProxyResult;
import com.scwang.smartrefresh.layout.SmartRefreshLayout;
import com.ss.bytertc.base.media.screen.RXScreenCaptureService;
import com.umeng.analytics.pro.ak;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import ng.j;
import org.apache.tools.ant.types.selectors.o;

/* JADX INFO: loaded from: classes11.dex */
public class OWPlayerHeroActivity extends BaseActivity implements View.OnClickListener {
    private static final String P3 = "OWPlayerHeroActivity";
    private static final String Q3 = "ARG_PLAYER_ID";
    private static final String R3 = "ARG_SEASON";
    private static final String S3 = "ARG_SHOW_DTL";
    private static final String T3 = "match_time";
    private static final String U3 = "mmr";
    private static final String V3 = "mmr_rank";
    private static final String W3 = "kill";
    private static final String X3 = "kd";
    private static final String Y3 = "dmg";
    private static final String Z3 = "death";

    /* JADX INFO: renamed from: a4, reason: collision with root package name */
    private static final String f87923a4 = "heal";

    /* JADX INFO: renamed from: b4, reason: collision with root package name */
    private static final String f87924b4 = "weapon_acc";

    /* JADX INFO: renamed from: c4, reason: collision with root package name */
    private static final String f87925c4 = "critical_acc";
    public static ChangeQuickRedirect changeQuickRedirect = null;

    /* JADX INFO: renamed from: d4, reason: collision with root package name */
    private static final String f87926d4 = "avg_alone_kill";

    /* JADX INFO: renamed from: e4, reason: collision with root package name */
    private static final String f87927e4 = "avg_dmg";

    /* JADX INFO: renamed from: f4, reason: collision with root package name */
    private static final String f87928f4 = "avg_heal";

    /* JADX INFO: renamed from: g4, reason: collision with root package name */
    private static final String f87929g4 = "avg_last_hit";

    /* JADX INFO: renamed from: h4, reason: collision with root package name */
    private static final String f87930h4 = "avg_aad_time";

    /* JADX INFO: renamed from: i4, reason: collision with root package name */
    private static final String f87931i4 = "avg_aad_kill";

    /* JADX INFO: renamed from: j4, reason: collision with root package name */
    private static final String f87932j4 = "avg_on_fire_time";

    /* JADX INFO: renamed from: k4, reason: collision with root package name */
    private static final String f87933k4 = "alone_kill";

    /* JADX INFO: renamed from: l4, reason: collision with root package name */
    private static final String f87934l4 = "last_hit";

    /* JADX INFO: renamed from: m4, reason: collision with root package name */
    private static final String f87935m4 = "on_fire_time";
    private RelativeLayout G2;
    private HorizontalScrollListView G3;
    private HorizontalScrollListView.a J3;
    private String K3;
    private String M3;
    private h<OWPlayerHeroObj> N;
    private String N3;
    private ImageView O;
    private boolean O3;
    private TextView P;
    private TextView Q;
    private TextView R;
    private TextView S;
    private TextView T;
    private TextView U;
    private TextView V;
    private TextView W;
    private TextView X;
    private TextView Y;
    private TextView Z;

    /* JADX INFO: renamed from: a0, reason: collision with root package name */
    private TextView f87936a0;

    /* JADX INFO: renamed from: b0, reason: collision with root package name */
    private TextView f87937b0;

    /* JADX INFO: renamed from: c0, reason: collision with root package name */
    private TextView f87938c0;

    @BindView(R.id.lv)
    ListView mListView;

    @BindView(R.id.srl)
    SmartRefreshLayout mRefreshLayout;

    @BindView(R.id.sticky_layout_header)
    RelativeLayout mStickyLayoutHeaderView;

    /* JADX INFO: renamed from: p1, reason: collision with root package name */
    private TextView f87939p1;

    /* JADX INFO: renamed from: p2, reason: collision with root package name */
    private TextView f87940p2;

    /* JADX INFO: renamed from: p3, reason: collision with root package name */
    private ViewGroup f87941p3;

    /* JADX INFO: renamed from: x1, reason: collision with root package name */
    private TextView f87942x1;

    /* JADX INFO: renamed from: x2, reason: collision with root package name */
    private TextView f87943x2;

    /* JADX INFO: renamed from: y1, reason: collision with root package name */
    private TextView f87944y1;

    /* JADX INFO: renamed from: y2, reason: collision with root package name */
    private TextView f87945y2;
    private int L = 0;
    private List<OWPlayerHeroObj> M = new ArrayList();
    private int L3 = -1;

    public class a extends h<OWPlayerHeroObj> {
        public static ChangeQuickRedirect changeQuickRedirect;

        /* JADX INFO: renamed from: com.max.xiaoheihe.module.game.ow.OWPlayerHeroActivity$a$a, reason: collision with other inner class name */
        public class ViewOnClickListenerC0803a implements View.OnClickListener {
            public static ChangeQuickRedirect changeQuickRedirect;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            final /* synthetic */ OWPlayerHeroObj f87947b;

            ViewOnClickListenerC0803a(OWPlayerHeroObj oWPlayerHeroObj) {
                this.f87947b = oWPlayerHeroObj;
            }

            @Override // android.view.View.OnClickListener
            public void onClick(View view) {
                if (PatchProxy.proxy(new Object[]{view}, this, changeQuickRedirect, false, 38055, new Class[]{View.class}, Void.TYPE).isSupported) {
                    return;
                }
                Intent intent = new Intent(((BaseActivity) OWPlayerHeroActivity.this).f66601b, (Class<?>) WebActionActivity.class);
                intent.putExtra("pageurl", String.format(lb.a.S2, OWPlayerHeroActivity.this.M3, this.f87947b.getHero_info().getHero_id(), OWPlayerHeroActivity.this.N3));
                intent.putExtra("title", com.max.xiaoheihe.utils.d.n0(R.string.ow_hero_overview));
                intent.putExtra("isfullScreen", true);
                intent.putExtra("shareTitle", String.format(com.max.xiaoheihe.utils.d.n0(R.string.ow_share_hero_title), this.f87947b.getHero_info().getDisplayName()));
                intent.putExtra("shareDesc", com.max.xiaoheihe.utils.d.n0(R.string.ow_share_hero_desc));
                intent.putExtra("shareImgUrl", this.f87947b.getHero_info().getHero_img());
                ((BaseActivity) OWPlayerHeroActivity.this).f66601b.startActivity(intent);
            }
        }

        public class b implements View.OnClickListener {
            public static ChangeQuickRedirect changeQuickRedirect;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            final /* synthetic */ OWPlayerHeroObj f87949b;

            b(OWPlayerHeroObj oWPlayerHeroObj) {
                this.f87949b = oWPlayerHeroObj;
            }

            @Override // android.view.View.OnClickListener
            public void onClick(View view) {
                if (PatchProxy.proxy(new Object[]{view}, this, changeQuickRedirect, false, 38056, new Class[]{View.class}, Void.TYPE).isSupported) {
                    return;
                }
                Intent intent = new Intent(((BaseActivity) OWPlayerHeroActivity.this).f66601b, (Class<?>) WebActionActivity.class);
                intent.putExtra("pageurl", String.format(lb.a.S2, OWPlayerHeroActivity.this.M3, this.f87949b.getHero_info().getHero_id(), OWPlayerHeroActivity.this.N3));
                intent.putExtra("title", com.max.xiaoheihe.utils.d.n0(R.string.ow_hero_overview));
                intent.putExtra("isfullScreen", true);
                intent.putExtra("shareTitle", String.format(com.max.xiaoheihe.utils.d.n0(R.string.ow_share_hero_title), this.f87949b.getHero_info().getDisplayName()));
                intent.putExtra("shareDesc", com.max.xiaoheihe.utils.d.n0(R.string.ow_share_hero_desc));
                intent.putExtra("shareImgUrl", this.f87949b.getHero_info().getHero_img());
                ((BaseActivity) OWPlayerHeroActivity.this).f66601b.startActivity(intent);
            }
        }

        public class c implements Runnable {
            public static ChangeQuickRedirect changeQuickRedirect;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            final /* synthetic */ HorizontalScrollListView f87951b;

            c(HorizontalScrollListView horizontalScrollListView) {
                this.f87951b = horizontalScrollListView;
            }

            @Override // java.lang.Runnable
            public void run() {
                if (PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 38057, new Class[0], Void.TYPE).isSupported) {
                    return;
                }
                this.f87951b.scrollTo(OWPlayerHeroActivity.this.J3.a(), OWPlayerHeroActivity.this.J3.b());
            }
        }

        a(Context context, List list, int i10) {
            super(context, list, i10);
        }

        @Override // com.max.hbcommon.base.adapter.h
        public /* bridge */ /* synthetic */ void b(h.a aVar, OWPlayerHeroObj oWPlayerHeroObj) {
            if (PatchProxy.proxy(new Object[]{aVar, oWPlayerHeroObj}, this, changeQuickRedirect, false, 38054, new Class[]{h.a.class, Object.class}, Void.TYPE).isSupported) {
                return;
            }
            d(aVar, oWPlayerHeroObj);
        }

        public void d(h.a aVar, OWPlayerHeroObj oWPlayerHeroObj) {
            TextView textView;
            TextView textView2;
            TextView textView3;
            TextView textView4;
            TextView textView5;
            TextView textView6;
            TextView textView7;
            TextView textView8;
            TextView textView9;
            TextView textView10;
            if (PatchProxy.proxy(new Object[]{aVar, oWPlayerHeroObj}, this, changeQuickRedirect, false, 38053, new Class[]{h.a.class, OWPlayerHeroObj.class}, Void.TYPE).isSupported) {
                return;
            }
            com.max.hbimage.b.H(oWPlayerHeroObj.getHero_info().getHero_img(), (ImageView) aVar.e(R.id.iv_icon));
            aVar.h(R.id.tv_name, oWPlayerHeroObj.getHero_info().getDisplayName());
            TextView textView11 = (TextView) aVar.e(R.id.tv_match_time);
            TextView textView12 = (TextView) aVar.e(R.id.tv_mmr);
            TextView textView13 = (TextView) aVar.e(R.id.tv_mmr_rank);
            TextView textView14 = (TextView) aVar.e(R.id.tv_kill);
            TextView textView15 = (TextView) aVar.e(R.id.tv_death);
            TextView textView16 = (TextView) aVar.e(R.id.tv_kd);
            TextView textView17 = (TextView) aVar.e(R.id.tv_dmg);
            TextView textView18 = (TextView) aVar.e(R.id.tv_heal);
            TextView textView19 = (TextView) aVar.e(R.id.tv_weapon_acc);
            TextView textView20 = (TextView) aVar.e(R.id.tv_critical_acc);
            TextView textView21 = (TextView) aVar.e(R.id.tv_avg_alone_kill);
            TextView textView22 = (TextView) aVar.e(R.id.tv_avg_dmg);
            TextView textView23 = (TextView) aVar.e(R.id.tv_avg_heal);
            TextView textView24 = (TextView) aVar.e(R.id.tv_avg_last_hit);
            TextView textView25 = (TextView) aVar.e(R.id.tv_avg_aad_time);
            TextView textView26 = (TextView) aVar.e(R.id.tv_avg_aad_kill);
            TextView textView27 = (TextView) aVar.e(R.id.tv_avg_on_fire_time);
            TextView textView28 = (TextView) aVar.e(R.id.tv_alone_kill);
            TextView textView29 = (TextView) aVar.e(R.id.tv_last_hit);
            TextView textView30 = (TextView) aVar.e(R.id.tv_on_fire_time);
            textView11.setTextColor(com.max.xiaoheihe.utils.d.E(R.color.text_secondary_1_color));
            textView12.setTextColor(com.max.xiaoheihe.utils.d.E(R.color.text_secondary_1_color));
            textView13.setTextColor(com.max.xiaoheihe.utils.d.E(R.color.text_secondary_1_color));
            textView14.setTextColor(com.max.xiaoheihe.utils.d.E(R.color.text_secondary_1_color));
            textView15.setTextColor(com.max.xiaoheihe.utils.d.E(R.color.text_secondary_1_color));
            textView16.setTextColor(com.max.xiaoheihe.utils.d.E(R.color.text_secondary_1_color));
            textView17.setTextColor(com.max.xiaoheihe.utils.d.E(R.color.text_secondary_1_color));
            textView18.setTextColor(com.max.xiaoheihe.utils.d.E(R.color.text_secondary_1_color));
            textView19.setTextColor(com.max.xiaoheihe.utils.d.E(R.color.text_secondary_1_color));
            textView20.setTextColor(com.max.xiaoheihe.utils.d.E(R.color.text_secondary_1_color));
            textView21.setTextColor(com.max.xiaoheihe.utils.d.E(R.color.text_secondary_1_color));
            textView22.setTextColor(com.max.xiaoheihe.utils.d.E(R.color.text_secondary_1_color));
            textView23.setTextColor(com.max.xiaoheihe.utils.d.E(R.color.text_secondary_1_color));
            textView24.setTextColor(com.max.xiaoheihe.utils.d.E(R.color.text_secondary_1_color));
            textView25.setTextColor(com.max.xiaoheihe.utils.d.E(R.color.text_secondary_1_color));
            textView26.setTextColor(com.max.xiaoheihe.utils.d.E(R.color.text_secondary_1_color));
            textView27.setTextColor(com.max.xiaoheihe.utils.d.E(R.color.text_secondary_1_color));
            textView28.setTextColor(com.max.xiaoheihe.utils.d.E(R.color.text_secondary_1_color));
            textView29.setTextColor(com.max.xiaoheihe.utils.d.E(R.color.text_secondary_1_color));
            textView30.setTextColor(com.max.xiaoheihe.utils.d.E(R.color.text_secondary_1_color));
            if ("unranked".equals(OWPlayerHeroActivity.this.N3)) {
                textView12.setVisibility(8);
                textView13.setVisibility(8);
                textView21.setVisibility(8);
                textView22.setVisibility(8);
                textView23.setVisibility(8);
                textView24.setVisibility(8);
                textView25.setVisibility(8);
                textView26.setVisibility(8);
                textView27.setVisibility(8);
                textView11.setText(oWPlayerHeroObj.getMatch_time());
                textView14.setText(oWPlayerHeroObj.getKill());
                textView15.setText(oWPlayerHeroObj.getDeath());
                textView16.setText(oWPlayerHeroObj.getKd());
                textView17.setText(oWPlayerHeroObj.getDmg());
                textView3 = textView18;
                textView3.setText(oWPlayerHeroObj.getHeal());
                textView4 = textView27;
                textView5 = textView19;
                textView5.setText(oWPlayerHeroObj.getWeapon_acc());
                textView6 = textView26;
                textView7 = textView20;
                textView7.setText(oWPlayerHeroObj.getCritical_acc());
                textView = textView25;
                textView28.setText(oWPlayerHeroObj.getAlone_kill());
                textView29.setText(oWPlayerHeroObj.getLast_hit());
                textView30.setText(oWPlayerHeroObj.getOn_fire_time());
                textView8 = textView23;
                textView2 = textView17;
                textView9 = textView24;
                textView10 = textView28;
            } else {
                textView = textView25;
                textView2 = textView17;
                textView3 = textView18;
                textView4 = textView27;
                textView5 = textView19;
                textView6 = textView26;
                textView7 = textView20;
                textView14.setVisibility(8);
                textView15.setVisibility(8);
                textView2.setVisibility(8);
                textView3.setVisibility(8);
                textView28.setVisibility(8);
                textView29.setVisibility(8);
                textView30.setVisibility(8);
                textView11.setText(oWPlayerHeroObj.getMatch_time());
                textView12.setText(oWPlayerHeroObj.getMmr());
                textView13.setText(oWPlayerHeroObj.getMmr_rank());
                textView16.setText(oWPlayerHeroObj.getKd());
                textView5.setText(oWPlayerHeroObj.getWeapon_acc());
                textView7.setText(oWPlayerHeroObj.getCritical_acc());
                textView21.setText(oWPlayerHeroObj.getAvg_alone_kill());
                textView22.setText(oWPlayerHeroObj.getAvg_dmg());
                textView8 = textView23;
                textView8.setText(oWPlayerHeroObj.getAvg_heal());
                textView9 = textView24;
                textView9.setText(oWPlayerHeroObj.getAvg_last_hit());
                textView10 = textView28;
                textView.setText(oWPlayerHeroObj.getAvg_aad_time());
                textView6.setText(oWPlayerHeroObj.getAvg_aad_kill());
                textView4.setText(oWPlayerHeroObj.getAvg_on_fire_time());
            }
            TextView textView31 = textView9;
            if (OWPlayerHeroActivity.T3.equals(OWPlayerHeroActivity.this.K3)) {
                textView11.setTextColor(com.max.xiaoheihe.utils.d.E(R.color.text_primary_1_color));
            } else if ("mmr".equals(OWPlayerHeroActivity.this.K3)) {
                textView12.setTextColor(com.max.xiaoheihe.utils.d.E(R.color.text_primary_1_color));
            } else if (OWPlayerHeroActivity.V3.equals(OWPlayerHeroActivity.this.K3)) {
                textView13.setTextColor(com.max.xiaoheihe.utils.d.E(R.color.text_primary_1_color));
            } else if (OWPlayerHeroActivity.W3.equals(OWPlayerHeroActivity.this.K3)) {
                textView14.setTextColor(com.max.xiaoheihe.utils.d.E(R.color.text_primary_1_color));
            } else if (OWPlayerHeroActivity.Z3.equals(OWPlayerHeroActivity.this.K3)) {
                textView15.setTextColor(com.max.xiaoheihe.utils.d.E(R.color.text_primary_1_color));
            } else if (OWPlayerHeroActivity.X3.equals(OWPlayerHeroActivity.this.K3)) {
                textView16.setTextColor(com.max.xiaoheihe.utils.d.E(R.color.text_primary_1_color));
            } else if (OWPlayerHeroActivity.Y3.equals(OWPlayerHeroActivity.this.K3)) {
                textView2.setTextColor(com.max.xiaoheihe.utils.d.E(R.color.text_primary_1_color));
            } else if (OWPlayerHeroActivity.f87923a4.equals(OWPlayerHeroActivity.this.K3)) {
                textView3.setTextColor(com.max.xiaoheihe.utils.d.E(R.color.text_primary_1_color));
            } else if (OWPlayerHeroActivity.f87924b4.equals(OWPlayerHeroActivity.this.K3)) {
                textView5.setTextColor(com.max.xiaoheihe.utils.d.E(R.color.text_primary_1_color));
            } else if (OWPlayerHeroActivity.f87925c4.equals(OWPlayerHeroActivity.this.K3)) {
                textView7.setTextColor(com.max.xiaoheihe.utils.d.E(R.color.text_primary_1_color));
            } else if (OWPlayerHeroActivity.f87926d4.equals(OWPlayerHeroActivity.this.K3)) {
                textView21.setTextColor(com.max.xiaoheihe.utils.d.E(R.color.text_primary_1_color));
            } else if (OWPlayerHeroActivity.f87927e4.equals(OWPlayerHeroActivity.this.K3)) {
                textView22.setTextColor(com.max.xiaoheihe.utils.d.E(R.color.text_primary_1_color));
            } else if (OWPlayerHeroActivity.f87928f4.equals(OWPlayerHeroActivity.this.K3)) {
                textView8.setTextColor(com.max.xiaoheihe.utils.d.E(R.color.text_primary_1_color));
            } else if (OWPlayerHeroActivity.f87929g4.equals(OWPlayerHeroActivity.this.K3)) {
                textView31.setTextColor(com.max.xiaoheihe.utils.d.E(R.color.text_primary_1_color));
            } else if (OWPlayerHeroActivity.f87930h4.equals(OWPlayerHeroActivity.this.K3)) {
                textView.setTextColor(com.max.xiaoheihe.utils.d.E(R.color.text_primary_1_color));
            } else if (OWPlayerHeroActivity.f87931i4.equals(OWPlayerHeroActivity.this.K3)) {
                textView6.setTextColor(com.max.xiaoheihe.utils.d.E(R.color.text_primary_1_color));
            } else if (OWPlayerHeroActivity.f87932j4.equals(OWPlayerHeroActivity.this.K3)) {
                textView4.setTextColor(com.max.xiaoheihe.utils.d.E(R.color.text_primary_1_color));
            } else if (OWPlayerHeroActivity.f87933k4.equals(OWPlayerHeroActivity.this.K3)) {
                textView10.setTextColor(com.max.xiaoheihe.utils.d.E(R.color.text_primary_1_color));
            } else if (OWPlayerHeroActivity.f87934l4.equals(OWPlayerHeroActivity.this.K3)) {
                textView29.setTextColor(com.max.xiaoheihe.utils.d.E(R.color.text_primary_1_color));
            } else if (OWPlayerHeroActivity.f87935m4.equals(OWPlayerHeroActivity.this.K3)) {
                textView30.setTextColor(com.max.xiaoheihe.utils.d.E(R.color.text_primary_1_color));
            }
            ImageView imageView = (ImageView) aVar.e(R.id.iv_gradient);
            HorizontalScrollListView horizontalScrollListView = (HorizontalScrollListView) aVar.e(R.id.hsv);
            horizontalScrollListView.setIv_gradient(imageView);
            ViewGroup viewGroup = (ViewGroup) aVar.e(R.id.vg_container);
            View viewB = aVar.b();
            if (OWPlayerHeroActivity.this.O3) {
                viewB.setOnClickListener(new ViewOnClickListenerC0803a(oWPlayerHeroObj));
                viewGroup.setOnClickListener(new b(oWPlayerHeroObj));
            }
            if (horizontalScrollListView.getObservable() == null) {
                horizontalScrollListView.setObservable(OWPlayerHeroActivity.this.J3);
                OWPlayerHeroActivity.this.J3.addObserver(horizontalScrollListView);
            }
            if (OWPlayerHeroActivity.this.J3.a() != 0) {
                horizontalScrollListView.post(new c(horizontalScrollListView));
            }
        }
    }

    public class b implements AbsListView.OnScrollListener {
        public static ChangeQuickRedirect changeQuickRedirect;

        b() {
        }

        @Override // android.widget.AbsListView.OnScrollListener
        public void onScroll(AbsListView absListView, int i10, int i11, int i12) {
            Object[] objArr = {absListView, new Integer(i10), new Integer(i11), new Integer(i12)};
            ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
            Class cls = Integer.TYPE;
            if (PatchProxy.proxy(objArr, this, changeQuickRedirect2, false, 38058, new Class[]{AbsListView.class, cls, cls, cls}, Void.TYPE).isSupported) {
                return;
            }
            if (OWPlayerHeroActivity.this.G2.getTop() < 0 && OWPlayerHeroActivity.this.G2.getChildCount() > 0) {
                OWPlayerHeroActivity.this.G2.removeView(OWPlayerHeroActivity.this.f87941p3);
                OWPlayerHeroActivity oWPlayerHeroActivity = OWPlayerHeroActivity.this;
                oWPlayerHeroActivity.mStickyLayoutHeaderView.addView(oWPlayerHeroActivity.f87941p3);
            } else {
                if (OWPlayerHeroActivity.this.G2.getTop() < 0 || OWPlayerHeroActivity.this.mStickyLayoutHeaderView.getChildCount() <= 0) {
                    return;
                }
                OWPlayerHeroActivity oWPlayerHeroActivity2 = OWPlayerHeroActivity.this;
                oWPlayerHeroActivity2.mStickyLayoutHeaderView.removeView(oWPlayerHeroActivity2.f87941p3);
                OWPlayerHeroActivity.this.G2.addView(OWPlayerHeroActivity.this.f87941p3);
            }
        }

        @Override // android.widget.AbsListView.OnScrollListener
        public void onScrollStateChanged(AbsListView absListView, int i10) {
        }
    }

    public class c implements pg.d {
        public static ChangeQuickRedirect changeQuickRedirect;

        c() {
        }

        @Override // pg.d
        public void k(j jVar) {
            if (PatchProxy.proxy(new Object[]{jVar}, this, changeQuickRedirect, false, 38059, new Class[]{j.class}, Void.TYPE).isSupported) {
                return;
            }
            OWPlayerHeroActivity.this.L = 0;
            OWPlayerHeroActivity.R1(OWPlayerHeroActivity.this);
        }
    }

    public class d extends com.max.hbcommon.network.d<Result<OWPlayerOverviewObj>> {
        public static ChangeQuickRedirect changeQuickRedirect;

        d() {
        }

        @Override // com.max.hbcommon.network.d, io.reactivex.g0
        public void onComplete() {
            SmartRefreshLayout smartRefreshLayout;
            if (PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 38061, new Class[0], Void.TYPE).isSupported || !OWPlayerHeroActivity.this.isActive() || (smartRefreshLayout = OWPlayerHeroActivity.this.mRefreshLayout) == null) {
                return;
            }
            smartRefreshLayout.A(0);
        }

        @Override // com.max.hbcommon.network.d, io.reactivex.g0
        public void onError(Throwable th2) {
            if (!PatchProxy.proxy(new Object[]{th2}, this, changeQuickRedirect, false, 38060, new Class[]{Throwable.class}, Void.TYPE).isSupported && OWPlayerHeroActivity.this.isActive()) {
                SmartRefreshLayout smartRefreshLayout = OWPlayerHeroActivity.this.mRefreshLayout;
                if (smartRefreshLayout != null) {
                    smartRefreshLayout.A(0);
                }
                super.onError(th2);
                OWPlayerHeroActivity.T1(OWPlayerHeroActivity.this);
                th2.printStackTrace();
            }
        }

        public void onNext(Result<OWPlayerOverviewObj> result) {
            if (!PatchProxy.proxy(new Object[]{result}, this, changeQuickRedirect, false, 38062, new Class[]{Result.class}, Void.TYPE).isSupported && OWPlayerHeroActivity.this.isActive()) {
                if (result == null || result.getResult() == null || result.getResult().getHeros() == null) {
                    OWPlayerHeroActivity.W1(OWPlayerHeroActivity.this);
                } else {
                    OWPlayerHeroActivity.V1(OWPlayerHeroActivity.this, result.getResult().getHeros());
                }
            }
        }

        @Override // com.max.hbcommon.network.d, io.reactivex.g0
        public /* bridge */ /* synthetic */ void onNext(Object obj) {
            if (PatchProxy.proxy(new Object[]{obj}, this, changeQuickRedirect, false, 38063, new Class[]{Object.class}, Void.TYPE).isSupported) {
                return;
            }
            onNext((Result<OWPlayerOverviewObj>) obj);
        }
    }

    public class e implements Comparator<OWPlayerHeroObj> {
        public static ChangeQuickRedirect changeQuickRedirect;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        String f87956b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        int f87957c;

        public e(OWPlayerHeroActivity oWPlayerHeroActivity, String str) {
            this(str, 1);
        }

        public e(String str, int i10) {
            this.f87956b = str;
            this.f87957c = i10;
        }

        public int a(OWPlayerHeroObj oWPlayerHeroObj, OWPlayerHeroObj oWPlayerHeroObj2) {
            int i10;
            int iCompareTo;
            PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{oWPlayerHeroObj, oWPlayerHeroObj2}, this, changeQuickRedirect, false, 38064, new Class[]{OWPlayerHeroObj.class, OWPlayerHeroObj.class}, Integer.TYPE);
            if (patchProxyResultProxy.isSupported) {
                return ((Integer) patchProxyResultProxy.result).intValue();
            }
            if (OWPlayerHeroActivity.T3.equals(this.f87956b)) {
                Float fValueOf = Float.valueOf(0.0f);
                Float fValueOf2 = Float.valueOf(0.0f);
                if (oWPlayerHeroObj != null) {
                    if (oWPlayerHeroObj.getMatch_time().contains(RXScreenCaptureService.KEY_HEIGHT)) {
                        fValueOf = Float.valueOf(n.p(oWPlayerHeroObj.getMatch_time().replaceAll(RXScreenCaptureService.KEY_HEIGHT, "")) * 3600.0f);
                    } else {
                        fValueOf = oWPlayerHeroObj.getMatch_time().contains(o.f136588l) ? Float.valueOf(n.p(oWPlayerHeroObj.getMatch_time().replaceAll(o.f136588l, "")) * 60.0f) : Float.valueOf(n.p(oWPlayerHeroObj.getMatch_time().replaceAll(ak.aB, "")));
                    }
                }
                if (oWPlayerHeroObj2 != null) {
                    if (oWPlayerHeroObj2.getMatch_time().contains(RXScreenCaptureService.KEY_HEIGHT)) {
                        fValueOf2 = Float.valueOf(n.p(oWPlayerHeroObj2.getMatch_time().replaceAll(RXScreenCaptureService.KEY_HEIGHT, "")) * 3600.0f);
                    } else {
                        fValueOf2 = oWPlayerHeroObj2.getMatch_time().contains(o.f136588l) ? Float.valueOf(n.p(oWPlayerHeroObj2.getMatch_time().replaceAll(o.f136588l, "")) * 60.0f) : Float.valueOf(n.p(oWPlayerHeroObj2.getMatch_time().replaceAll(ak.aB, "")));
                    }
                }
                return this.f87957c * fValueOf.compareTo(fValueOf2);
            }
            if ("mmr".equals(this.f87956b)) {
                Float fValueOf3 = Float.valueOf(n.p(oWPlayerHeroObj.getMmr()));
                Float fValueOf4 = Float.valueOf(n.p(oWPlayerHeroObj2.getMmr()));
                i10 = this.f87957c;
                iCompareTo = fValueOf3.compareTo(fValueOf4);
            } else if (OWPlayerHeroActivity.V3.equals(this.f87956b)) {
                Float fValueOf5 = Float.valueOf(n.p(oWPlayerHeroObj.getMmr_rank().replaceAll("#", "")));
                Float fValueOf6 = Float.valueOf(n.p(oWPlayerHeroObj2.getMmr_rank().replaceAll("#", "")));
                i10 = this.f87957c;
                iCompareTo = fValueOf5.compareTo(fValueOf6);
            } else if (OWPlayerHeroActivity.W3.equals(this.f87956b)) {
                Float fValueOf7 = Float.valueOf(n.p(oWPlayerHeroObj.getKill()));
                Float fValueOf8 = Float.valueOf(n.p(oWPlayerHeroObj2.getKill()));
                i10 = this.f87957c;
                iCompareTo = fValueOf7.compareTo(fValueOf8);
            } else if (OWPlayerHeroActivity.Z3.equals(this.f87956b)) {
                Float fValueOf9 = Float.valueOf(n.p(oWPlayerHeroObj.getDeath()));
                Float fValueOf10 = Float.valueOf(n.p(oWPlayerHeroObj2.getDeath()));
                i10 = this.f87957c;
                iCompareTo = fValueOf9.compareTo(fValueOf10);
            } else if (OWPlayerHeroActivity.X3.equals(this.f87956b)) {
                Float fValueOf11 = Float.valueOf(n.p(oWPlayerHeroObj.getKd()));
                Float fValueOf12 = Float.valueOf(n.p(oWPlayerHeroObj2.getKd()));
                i10 = this.f87957c;
                iCompareTo = fValueOf11.compareTo(fValueOf12);
            } else if (OWPlayerHeroActivity.Y3.equals(this.f87956b)) {
                Float fValueOf13 = Float.valueOf(n.p(oWPlayerHeroObj.getDmg()));
                Float fValueOf14 = Float.valueOf(n.p(oWPlayerHeroObj2.getDmg()));
                i10 = this.f87957c;
                iCompareTo = fValueOf13.compareTo(fValueOf14);
            } else if (OWPlayerHeroActivity.f87923a4.equals(this.f87956b)) {
                Float fValueOf15 = Float.valueOf(n.p(oWPlayerHeroObj.getHeal()));
                Float fValueOf16 = Float.valueOf(n.p(oWPlayerHeroObj2.getHeal()));
                i10 = this.f87957c;
                iCompareTo = fValueOf15.compareTo(fValueOf16);
            } else if (OWPlayerHeroActivity.f87924b4.equals(this.f87956b)) {
                Float fValueOf17 = Float.valueOf(n.p(oWPlayerHeroObj.getWeapon_acc().replaceAll("%", "")));
                Float fValueOf18 = Float.valueOf(n.p(oWPlayerHeroObj2.getWeapon_acc().replaceAll("%", "")));
                i10 = this.f87957c;
                iCompareTo = fValueOf17.compareTo(fValueOf18);
            } else if (OWPlayerHeroActivity.f87925c4.equals(this.f87956b)) {
                Float fValueOf19 = Float.valueOf(n.p(oWPlayerHeroObj.getCritical_acc().replaceAll("%", "")));
                Float fValueOf20 = Float.valueOf(n.p(oWPlayerHeroObj2.getCritical_acc().replaceAll("%", "")));
                i10 = this.f87957c;
                iCompareTo = fValueOf19.compareTo(fValueOf20);
            } else if (OWPlayerHeroActivity.f87926d4.equals(this.f87956b)) {
                Float fValueOf21 = Float.valueOf(n.p(oWPlayerHeroObj.getAvg_alone_kill()));
                Float fValueOf22 = Float.valueOf(n.p(oWPlayerHeroObj2.getAvg_alone_kill()));
                i10 = this.f87957c;
                iCompareTo = fValueOf21.compareTo(fValueOf22);
            } else if (OWPlayerHeroActivity.f87927e4.equals(this.f87956b)) {
                Float fValueOf23 = Float.valueOf(n.p(oWPlayerHeroObj.getAvg_dmg()));
                Float fValueOf24 = Float.valueOf(n.p(oWPlayerHeroObj2.getAvg_dmg()));
                i10 = this.f87957c;
                iCompareTo = fValueOf23.compareTo(fValueOf24);
            } else if (OWPlayerHeroActivity.f87928f4.equals(this.f87956b)) {
                Float fValueOf25 = Float.valueOf(n.p(oWPlayerHeroObj.getAvg_heal()));
                Float fValueOf26 = Float.valueOf(n.p(oWPlayerHeroObj2.getAvg_heal()));
                i10 = this.f87957c;
                iCompareTo = fValueOf25.compareTo(fValueOf26);
            } else if (OWPlayerHeroActivity.f87929g4.equals(this.f87956b)) {
                Float fValueOf27 = Float.valueOf(n.p(oWPlayerHeroObj.getAvg_last_hit()));
                Float fValueOf28 = Float.valueOf(n.p(oWPlayerHeroObj2.getAvg_last_hit()));
                i10 = this.f87957c;
                iCompareTo = fValueOf27.compareTo(fValueOf28);
            } else {
                if (OWPlayerHeroActivity.f87930h4.equals(this.f87956b)) {
                    Float fValueOf29 = Float.valueOf(0.0f);
                    Float fValueOf30 = Float.valueOf(0.0f);
                    if (oWPlayerHeroObj != null) {
                        if (oWPlayerHeroObj.getAvg_aad_time().contains(RXScreenCaptureService.KEY_HEIGHT)) {
                            fValueOf29 = Float.valueOf(n.p(oWPlayerHeroObj.getAvg_aad_time().replaceAll(RXScreenCaptureService.KEY_HEIGHT, "")) * 3600.0f);
                        } else {
                            fValueOf29 = oWPlayerHeroObj.getAvg_aad_time().contains(o.f136588l) ? Float.valueOf(n.p(oWPlayerHeroObj.getAvg_aad_time().replaceAll(o.f136588l, "")) * 60.0f) : Float.valueOf(n.p(oWPlayerHeroObj.getAvg_aad_time().replaceAll(ak.aB, "")));
                        }
                    }
                    if (oWPlayerHeroObj2 != null) {
                        if (oWPlayerHeroObj2.getAvg_aad_time().contains(RXScreenCaptureService.KEY_HEIGHT)) {
                            fValueOf30 = Float.valueOf(n.p(oWPlayerHeroObj2.getAvg_aad_time().replaceAll(RXScreenCaptureService.KEY_HEIGHT, "")) * 3600.0f);
                        } else {
                            fValueOf30 = oWPlayerHeroObj2.getAvg_aad_time().contains(o.f136588l) ? Float.valueOf(n.p(oWPlayerHeroObj2.getAvg_aad_time().replaceAll(o.f136588l, "")) * 60.0f) : Float.valueOf(n.p(oWPlayerHeroObj2.getAvg_aad_time().replaceAll(ak.aB, "")));
                        }
                    }
                    return this.f87957c * fValueOf29.compareTo(fValueOf30);
                }
                if (OWPlayerHeroActivity.f87931i4.equals(this.f87956b)) {
                    Float fValueOf31 = Float.valueOf(n.p(oWPlayerHeroObj.getAvg_aad_kill()));
                    Float fValueOf32 = Float.valueOf(n.p(oWPlayerHeroObj2.getAvg_aad_kill()));
                    i10 = this.f87957c;
                    iCompareTo = fValueOf31.compareTo(fValueOf32);
                } else {
                    if (OWPlayerHeroActivity.f87932j4.equals(this.f87956b)) {
                        Float fValueOf33 = Float.valueOf(0.0f);
                        Float fValueOf34 = Float.valueOf(0.0f);
                        if (oWPlayerHeroObj != null) {
                            if (oWPlayerHeroObj.getAvg_on_fire_time().contains(RXScreenCaptureService.KEY_HEIGHT)) {
                                fValueOf33 = Float.valueOf(n.p(oWPlayerHeroObj.getAvg_on_fire_time().replaceAll(RXScreenCaptureService.KEY_HEIGHT, "")) * 3600.0f);
                            } else {
                                fValueOf33 = oWPlayerHeroObj.getAvg_on_fire_time().contains(o.f136588l) ? Float.valueOf(n.p(oWPlayerHeroObj.getAvg_on_fire_time().replaceAll(o.f136588l, "")) * 60.0f) : Float.valueOf(n.p(oWPlayerHeroObj.getAvg_on_fire_time().replaceAll(ak.aB, "")));
                            }
                        }
                        if (oWPlayerHeroObj2 != null) {
                            if (oWPlayerHeroObj2.getAvg_on_fire_time().contains(RXScreenCaptureService.KEY_HEIGHT)) {
                                fValueOf34 = Float.valueOf(n.p(oWPlayerHeroObj2.getAvg_on_fire_time().replaceAll(RXScreenCaptureService.KEY_HEIGHT, "")) * 3600.0f);
                            } else {
                                fValueOf34 = oWPlayerHeroObj2.getAvg_on_fire_time().contains(o.f136588l) ? Float.valueOf(n.p(oWPlayerHeroObj2.getAvg_on_fire_time().replaceAll(o.f136588l, "")) * 60.0f) : Float.valueOf(n.p(oWPlayerHeroObj2.getAvg_on_fire_time().replaceAll(ak.aB, "")));
                            }
                        }
                        return this.f87957c * fValueOf33.compareTo(fValueOf34);
                    }
                    if (OWPlayerHeroActivity.f87933k4.equals(this.f87956b)) {
                        Float fValueOf35 = Float.valueOf(n.p(oWPlayerHeroObj.getAlone_kill()));
                        Float fValueOf36 = Float.valueOf(n.p(oWPlayerHeroObj2.getAlone_kill()));
                        i10 = this.f87957c;
                        iCompareTo = fValueOf35.compareTo(fValueOf36);
                    } else {
                        if (!OWPlayerHeroActivity.f87934l4.equals(this.f87956b)) {
                            if (!OWPlayerHeroActivity.f87935m4.equals(this.f87956b)) {
                                return 0;
                            }
                            Float fValueOf37 = Float.valueOf(0.0f);
                            Float fValueOf38 = Float.valueOf(0.0f);
                            if (oWPlayerHeroObj != null) {
                                if (oWPlayerHeroObj.getOn_fire_time().contains(RXScreenCaptureService.KEY_HEIGHT)) {
                                    fValueOf37 = Float.valueOf(n.p(oWPlayerHeroObj.getOn_fire_time().replaceAll(RXScreenCaptureService.KEY_HEIGHT, "")) * 3600.0f);
                                } else {
                                    fValueOf37 = oWPlayerHeroObj.getOn_fire_time().contains(o.f136588l) ? Float.valueOf(n.p(oWPlayerHeroObj.getOn_fire_time().replaceAll(o.f136588l, "")) * 60.0f) : Float.valueOf(n.p(oWPlayerHeroObj.getOn_fire_time().replaceAll(ak.aB, "")));
                                }
                            }
                            if (oWPlayerHeroObj2 != null) {
                                if (oWPlayerHeroObj2.getOn_fire_time().contains(RXScreenCaptureService.KEY_HEIGHT)) {
                                    fValueOf38 = Float.valueOf(n.p(oWPlayerHeroObj2.getOn_fire_time().replaceAll(RXScreenCaptureService.KEY_HEIGHT, "")) * 3600.0f);
                                } else {
                                    fValueOf38 = oWPlayerHeroObj2.getOn_fire_time().contains(o.f136588l) ? Float.valueOf(n.p(oWPlayerHeroObj2.getOn_fire_time().replaceAll(o.f136588l, "")) * 60.0f) : Float.valueOf(n.p(oWPlayerHeroObj2.getOn_fire_time().replaceAll(ak.aB, "")));
                                }
                            }
                            return this.f87957c * fValueOf37.compareTo(fValueOf38);
                        }
                        Float fValueOf39 = Float.valueOf(n.p(oWPlayerHeroObj.getLast_hit()));
                        Float fValueOf40 = Float.valueOf(n.p(oWPlayerHeroObj2.getLast_hit()));
                        i10 = this.f87957c;
                        iCompareTo = fValueOf39.compareTo(fValueOf40);
                    }
                }
            }
            return i10 * iCompareTo;
        }

        @Override // java.util.Comparator
        public /* bridge */ /* synthetic */ int compare(OWPlayerHeroObj oWPlayerHeroObj, OWPlayerHeroObj oWPlayerHeroObj2) {
            PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{oWPlayerHeroObj, oWPlayerHeroObj2}, this, changeQuickRedirect, false, 38065, new Class[]{Object.class, Object.class}, Integer.TYPE);
            return patchProxyResultProxy.isSupported ? ((Integer) patchProxyResultProxy.result).intValue() : a(oWPlayerHeroObj, oWPlayerHeroObj2);
        }
    }

    static /* synthetic */ void R1(OWPlayerHeroActivity oWPlayerHeroActivity) {
        if (PatchProxy.proxy(new Object[]{oWPlayerHeroActivity}, null, changeQuickRedirect, true, 38049, new Class[]{OWPlayerHeroActivity.class}, Void.TYPE).isSupported) {
            return;
        }
        oWPlayerHeroActivity.h2();
    }

    static /* synthetic */ void T1(OWPlayerHeroActivity oWPlayerHeroActivity) {
        if (PatchProxy.proxy(new Object[]{oWPlayerHeroActivity}, null, changeQuickRedirect, true, 38050, new Class[]{OWPlayerHeroActivity.class}, Void.TYPE).isSupported) {
            return;
        }
        oWPlayerHeroActivity.C1();
    }

    static /* synthetic */ void V1(OWPlayerHeroActivity oWPlayerHeroActivity, List list) {
        if (PatchProxy.proxy(new Object[]{oWPlayerHeroActivity, list}, null, changeQuickRedirect, true, 38051, new Class[]{OWPlayerHeroActivity.class, List.class}, Void.TYPE).isSupported) {
            return;
        }
        oWPlayerHeroActivity.l2(list);
    }

    static /* synthetic */ void W1(OWPlayerHeroActivity oWPlayerHeroActivity) {
        if (PatchProxy.proxy(new Object[]{oWPlayerHeroActivity}, null, changeQuickRedirect, true, 38052, new Class[]{OWPlayerHeroActivity.class}, Void.TYPE).isSupported) {
            return;
        }
        oWPlayerHeroActivity.C1();
    }

    private void h2() {
        if (PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 38043, new Class[0], Void.TYPE).isSupported) {
            return;
        }
        V((io.reactivex.disposables.b) i.a().lb(this.M3, this.N3).I5(io.reactivex.schedulers.b.d()).a4(io.reactivex.android.schedulers.a.c()).J5(new d()));
    }

    public static Intent i2(Context context, String str, String str2, boolean z10) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{context, str, str2, new Byte(z10 ? (byte) 1 : (byte) 0)}, null, changeQuickRedirect, true, 38040, new Class[]{Context.class, String.class, String.class, Boolean.TYPE}, Intent.class);
        if (patchProxyResultProxy.isSupported) {
            return (Intent) patchProxyResultProxy.result;
        }
        Intent intent = new Intent(context, (Class<?>) OWPlayerHeroActivity.class);
        intent.putExtra("ARG_PLAYER_ID", str);
        intent.putExtra("ARG_SEASON", str2);
        intent.putExtra(S3, z10);
        return intent;
    }

    private void j2() {
        String str;
        if (PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 38048, new Class[0], Void.TYPE).isSupported) {
            return;
        }
        int i10 = this.L3;
        if (i10 == 1) {
            str = "\uf106";
        } else {
            str = i10 == -1 ? "\uf107" : "";
        }
        this.P.setTextColor(this.f66601b.getResources().getColor(R.color.text_secondary_1_color));
        this.Q.setTextColor(this.f66601b.getResources().getColor(R.color.text_secondary_1_color));
        this.R.setTextColor(this.f66601b.getResources().getColor(R.color.text_secondary_1_color));
        this.S.setTextColor(this.f66601b.getResources().getColor(R.color.text_secondary_1_color));
        this.U.setTextColor(this.f66601b.getResources().getColor(R.color.text_secondary_1_color));
        this.T.setTextColor(this.f66601b.getResources().getColor(R.color.text_secondary_1_color));
        this.V.setTextColor(this.f66601b.getResources().getColor(R.color.text_secondary_1_color));
        this.W.setTextColor(this.f66601b.getResources().getColor(R.color.text_secondary_1_color));
        this.X.setTextColor(this.f66601b.getResources().getColor(R.color.text_secondary_1_color));
        this.Y.setTextColor(this.f66601b.getResources().getColor(R.color.text_secondary_1_color));
        this.Z.setTextColor(this.f66601b.getResources().getColor(R.color.text_secondary_1_color));
        this.f87936a0.setTextColor(this.f66601b.getResources().getColor(R.color.text_secondary_1_color));
        this.f87937b0.setTextColor(this.f66601b.getResources().getColor(R.color.text_secondary_1_color));
        this.f87938c0.setTextColor(this.f66601b.getResources().getColor(R.color.text_secondary_1_color));
        this.f87939p1.setTextColor(this.f66601b.getResources().getColor(R.color.text_secondary_1_color));
        this.f87942x1.setTextColor(this.f66601b.getResources().getColor(R.color.text_secondary_1_color));
        this.f87944y1.setTextColor(this.f66601b.getResources().getColor(R.color.text_secondary_1_color));
        this.f87940p2.setTextColor(this.f66601b.getResources().getColor(R.color.text_secondary_1_color));
        this.f87943x2.setTextColor(this.f66601b.getResources().getColor(R.color.text_secondary_1_color));
        this.f87945y2.setTextColor(this.f66601b.getResources().getColor(R.color.text_secondary_1_color));
        this.P.setText(getString(R.string.ow_hero_match_time));
        this.Q.setText(getString(R.string.ow_hero_mmr));
        this.R.setText(getString(R.string.ow_hero_mmr_rank));
        this.S.setText(getString(R.string.ow_hero_kill));
        this.U.setText(getString(R.string.ow_hero_death));
        this.T.setText(getString(R.string.ow_hero_kd));
        this.V.setText(getString(R.string.ow_hero_dmg));
        this.W.setText(getString(R.string.ow_hero_heal));
        this.X.setText(getString(R.string.ow_hero_weapon_acc));
        this.Y.setText(getString(R.string.ow_hero_critical_acc));
        this.Z.setText(getString(R.string.ow_hero_avg_alone_kill));
        this.f87936a0.setText(getString(R.string.ow_hero_avg_dmg));
        this.f87937b0.setText(getString(R.string.ow_hero_avg_heal));
        this.f87938c0.setText(getString(R.string.ow_hero_avg_last_hit));
        this.f87939p1.setText(getString(R.string.ow_hero_avg_aad_time));
        this.f87942x1.setText(getString(R.string.ow_hero_avg_aad_kill));
        this.f87944y1.setText(getString(R.string.ow_hero_avg_on_fire_time));
        this.f87940p2.setText(getString(R.string.ow_hero_alone_kill));
        this.f87943x2.setText(getString(R.string.ow_hero_last_hit));
        this.f87945y2.setText(getString(R.string.ow_hero_on_fire_time));
        if (T3.equals(this.K3)) {
            this.P.setText(getString(R.string.ow_hero_match_time) + str);
            this.P.setTextColor(com.max.xiaoheihe.utils.d.E(R.color.text_primary_1_color));
            return;
        }
        if ("mmr".equals(this.K3)) {
            this.Q.setText(getString(R.string.ow_hero_mmr) + str);
            this.Q.setTextColor(com.max.xiaoheihe.utils.d.E(R.color.text_primary_1_color));
            return;
        }
        if (V3.equals(this.K3)) {
            this.R.setText(getString(R.string.ow_hero_mmr_rank) + str);
            this.R.setTextColor(com.max.xiaoheihe.utils.d.E(R.color.text_primary_1_color));
            return;
        }
        if (W3.equals(this.K3)) {
            this.S.setText(getString(R.string.ow_hero_kill) + str);
            this.S.setTextColor(com.max.xiaoheihe.utils.d.E(R.color.text_primary_1_color));
            return;
        }
        if (Z3.equals(this.K3)) {
            this.U.setText(getString(R.string.ow_hero_death) + str);
            this.U.setTextColor(com.max.xiaoheihe.utils.d.E(R.color.text_primary_1_color));
            return;
        }
        if (X3.equals(this.K3)) {
            this.T.setText(getString(R.string.ow_hero_kd) + str);
            this.T.setTextColor(com.max.xiaoheihe.utils.d.E(R.color.text_primary_1_color));
            return;
        }
        if (Y3.equals(this.K3)) {
            this.V.setText(getString(R.string.ow_hero_dmg) + str);
            this.V.setTextColor(com.max.xiaoheihe.utils.d.E(R.color.text_primary_1_color));
            return;
        }
        if (f87923a4.equals(this.K3)) {
            this.W.setText(getString(R.string.ow_hero_heal) + str);
            this.W.setTextColor(com.max.xiaoheihe.utils.d.E(R.color.text_primary_1_color));
            return;
        }
        if (f87924b4.equals(this.K3)) {
            this.X.setText(getString(R.string.ow_hero_weapon_acc) + str);
            this.X.setTextColor(com.max.xiaoheihe.utils.d.E(R.color.text_primary_1_color));
            return;
        }
        if (f87925c4.equals(this.K3)) {
            this.Y.setText(getString(R.string.ow_hero_critical_acc) + str);
            this.Y.setTextColor(com.max.xiaoheihe.utils.d.E(R.color.text_primary_1_color));
            return;
        }
        if (f87926d4.equals(this.K3)) {
            this.Z.setText(getString(R.string.ow_hero_avg_alone_kill) + str);
            this.Z.setTextColor(com.max.xiaoheihe.utils.d.E(R.color.text_primary_1_color));
            return;
        }
        if (f87927e4.equals(this.K3)) {
            this.f87936a0.setText(getString(R.string.ow_hero_avg_dmg) + str);
            this.f87936a0.setTextColor(com.max.xiaoheihe.utils.d.E(R.color.text_primary_1_color));
            return;
        }
        if (f87928f4.equals(this.K3)) {
            this.f87937b0.setText(getString(R.string.ow_hero_avg_heal) + str);
            this.f87937b0.setTextColor(com.max.xiaoheihe.utils.d.E(R.color.text_primary_1_color));
            return;
        }
        if (f87929g4.equals(this.K3)) {
            this.f87938c0.setText(getString(R.string.ow_hero_avg_last_hit) + str);
            this.f87938c0.setTextColor(com.max.xiaoheihe.utils.d.E(R.color.text_primary_1_color));
            return;
        }
        if (f87930h4.equals(this.K3)) {
            this.f87939p1.setText(getString(R.string.ow_hero_avg_aad_time) + str);
            this.f87939p1.setTextColor(com.max.xiaoheihe.utils.d.E(R.color.text_primary_1_color));
            return;
        }
        if (f87931i4.equals(this.K3)) {
            this.f87942x1.setText(getString(R.string.ow_hero_avg_aad_kill) + str);
            this.f87942x1.setTextColor(com.max.xiaoheihe.utils.d.E(R.color.text_primary_1_color));
            return;
        }
        if (f87932j4.equals(this.K3)) {
            this.f87944y1.setText(getString(R.string.ow_hero_avg_on_fire_time) + str);
            this.f87944y1.setTextColor(com.max.xiaoheihe.utils.d.E(R.color.text_primary_1_color));
            return;
        }
        if (f87933k4.equals(this.K3)) {
            this.f87940p2.setText(getString(R.string.ow_hero_alone_kill) + str);
            this.f87940p2.setTextColor(com.max.xiaoheihe.utils.d.E(R.color.text_primary_1_color));
            return;
        }
        if (f87934l4.equals(this.K3)) {
            this.f87943x2.setText(getString(R.string.ow_hero_last_hit) + str);
            this.f87943x2.setTextColor(com.max.xiaoheihe.utils.d.E(R.color.text_primary_1_color));
            return;
        }
        if (f87935m4.equals(this.K3)) {
            this.f87945y2.setText(getString(R.string.ow_hero_on_fire_time) + str);
            this.f87945y2.setTextColor(com.max.xiaoheihe.utils.d.E(R.color.text_primary_1_color));
        }
    }

    private void k2() {
        if (PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 38042, new Class[0], Void.TYPE).isSupported) {
            return;
        }
        this.O = (ImageView) this.f87941p3.findViewById(R.id.iv_gradient_header);
        this.P = (TextView) this.f87941p3.findViewById(R.id.tv_sort_match_time);
        this.Q = (TextView) this.f87941p3.findViewById(R.id.tv_sort_mmr);
        this.R = (TextView) this.f87941p3.findViewById(R.id.tv_sort_mmr_rank);
        this.S = (TextView) this.f87941p3.findViewById(R.id.tv_sort_kill);
        this.U = (TextView) this.f87941p3.findViewById(R.id.tv_sort_death);
        this.T = (TextView) this.f87941p3.findViewById(R.id.tv_sort_kd);
        this.V = (TextView) this.f87941p3.findViewById(R.id.tv_sort_dmg);
        this.W = (TextView) this.f87941p3.findViewById(R.id.tv_sort_heal);
        this.X = (TextView) this.f87941p3.findViewById(R.id.tv_sort_weapon_acc);
        this.Y = (TextView) this.f87941p3.findViewById(R.id.tv_sort_critical_acc);
        this.Z = (TextView) this.f87941p3.findViewById(R.id.tv_sort_avg_alone_kill);
        this.f87936a0 = (TextView) this.f87941p3.findViewById(R.id.tv_sort_avg_dmg);
        this.f87937b0 = (TextView) this.f87941p3.findViewById(R.id.tv_sort_avg_heal);
        this.f87938c0 = (TextView) this.f87941p3.findViewById(R.id.tv_sort_avg_last_hit);
        this.f87939p1 = (TextView) this.f87941p3.findViewById(R.id.tv_sort_avg_aad_time);
        this.f87942x1 = (TextView) this.f87941p3.findViewById(R.id.tv_sort_avg_aad_kill);
        this.f87944y1 = (TextView) this.f87941p3.findViewById(R.id.tv_sort_avg_on_fire_time);
        this.f87940p2 = (TextView) this.f87941p3.findViewById(R.id.tv_sort_alone_kill);
        this.f87943x2 = (TextView) this.f87941p3.findViewById(R.id.tv_sort_last_hit);
        this.f87945y2 = (TextView) this.f87941p3.findViewById(R.id.tv_sort_on_fire_time);
        bb.d.d(this.P, 0);
        bb.d.d(this.Q, 0);
        bb.d.d(this.R, 0);
        bb.d.d(this.S, 0);
        bb.d.d(this.U, 0);
        bb.d.d(this.T, 0);
        bb.d.d(this.V, 0);
        bb.d.d(this.W, 0);
        bb.d.d(this.X, 0);
        bb.d.d(this.Y, 0);
        bb.d.d(this.Z, 0);
        bb.d.d(this.f87936a0, 0);
        bb.d.d(this.f87937b0, 0);
        bb.d.d(this.f87938c0, 0);
        bb.d.d(this.f87939p1, 0);
        bb.d.d(this.f87942x1, 0);
        bb.d.d(this.f87944y1, 0);
        bb.d.d(this.f87940p2, 0);
        bb.d.d(this.f87943x2, 0);
        bb.d.d(this.f87945y2, 0);
        if ("unranked".equals(this.N3)) {
            this.Q.setVisibility(8);
            this.R.setVisibility(8);
            this.Z.setVisibility(8);
            this.f87936a0.setVisibility(8);
            this.f87937b0.setVisibility(8);
            this.f87938c0.setVisibility(8);
            this.f87939p1.setVisibility(8);
            this.f87942x1.setVisibility(8);
            this.f87944y1.setVisibility(8);
        } else {
            this.S.setVisibility(8);
            this.U.setVisibility(8);
            this.V.setVisibility(8);
            this.W.setVisibility(8);
            this.f87940p2.setVisibility(8);
            this.f87943x2.setVisibility(8);
            this.f87945y2.setVisibility(8);
        }
        this.P.setOnClickListener(this);
        this.Q.setOnClickListener(this);
        this.R.setOnClickListener(this);
        this.S.setOnClickListener(this);
        this.U.setOnClickListener(this);
        this.T.setOnClickListener(this);
        this.V.setOnClickListener(this);
        this.W.setOnClickListener(this);
        this.X.setOnClickListener(this);
        this.Y.setOnClickListener(this);
        this.Z.setOnClickListener(this);
        this.f87936a0.setOnClickListener(this);
        this.f87937b0.setOnClickListener(this);
        this.f87938c0.setOnClickListener(this);
        this.f87939p1.setOnClickListener(this);
        this.f87942x1.setOnClickListener(this);
        this.f87944y1.setOnClickListener(this);
        this.f87940p2.setOnClickListener(this);
        this.f87943x2.setOnClickListener(this);
        this.f87945y2.setOnClickListener(this);
        HorizontalScrollListView horizontalScrollListView = (HorizontalScrollListView) this.f87941p3.findViewById(R.id.hsv_header);
        this.G3 = horizontalScrollListView;
        horizontalScrollListView.setIv_gradient(this.O);
    }

    private void l2(List<OWPlayerHeroObj> list) {
        if (PatchProxy.proxy(new Object[]{list}, this, changeQuickRedirect, false, 38045, new Class[]{List.class}, Void.TYPE).isSupported) {
            return;
        }
        x1();
        if (list == null) {
            return;
        }
        this.M.clear();
        this.M.addAll(list);
        this.K3 = T3;
        this.L3 = -1;
        m2();
    }

    private void m2() {
        if (PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 38047, new Class[0], Void.TYPE).isSupported) {
            return;
        }
        if (this.K3 == null) {
            this.N.notifyDataSetChanged();
            return;
        }
        j2();
        Collections.sort(this.M, new e(this.K3, this.L3));
        this.N.notifyDataSetChanged();
    }

    @Override // com.max.hbcommon.base.BaseActivity
    public void k1() {
        if (PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 38041, new Class[0], Void.TYPE).isSupported) {
            return;
        }
        setContentView(R.layout.fragment_r6_player_operator);
        this.f66620u = ButterKnife.a(this);
        this.M3 = getIntent().getStringExtra("ARG_PLAYER_ID");
        this.N3 = getIntent().getStringExtra("ARG_SEASON");
        this.O3 = getIntent().getBooleanExtra(S3, false);
        this.f66616q.setTitle(com.max.xiaoheihe.utils.d.n0(R.string.update_log));
        if ("unranked".equals(this.N3)) {
            this.f66616q.setTitle("我的英雄（快速）");
        } else {
            this.f66616q.setTitle("我的英雄（竞技）");
        }
        this.f66617r.setVisibility(0);
        this.N = new a(this.f66601b, this.M, R.layout.item_ow_player_hero_data);
        this.f87941p3 = (ViewGroup) this.f66602c.inflate(R.layout.item_ow_player_hero_data_header, (ViewGroup) this.mListView, false);
        k2();
        HorizontalScrollListView.a aVar = new HorizontalScrollListView.a();
        this.J3 = aVar;
        this.G3.setObservable(aVar);
        this.J3.addObserver(this.G3);
        RelativeLayout relativeLayout = new RelativeLayout(this.f66601b);
        this.G2 = relativeLayout;
        relativeLayout.setLayoutParams(new AbsListView.LayoutParams(-1, ViewUtils.V(this.f87941p3)));
        this.G2.addView(this.f87941p3);
        this.mListView.addHeaderView(this.G2, null, false);
        this.mListView.setAdapter((ListAdapter) this.N);
        this.mListView.setOnScrollListener(new b());
        this.mRefreshLayout.S(new c());
        this.mRefreshLayout.b0(false);
        E1();
        h2();
    }

    @Override // com.max.hbcommon.base.BaseActivity
    public void n1() {
        if (PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 38044, new Class[0], Void.TYPE).isSupported) {
            return;
        }
        E1();
        h2();
    }

    @Override // android.view.View.OnClickListener
    public void onClick(View view) {
        if (PatchProxy.proxy(new Object[]{view}, this, changeQuickRedirect, false, 38046, new Class[]{View.class}, Void.TYPE).isSupported) {
        }
        int id2 = view.getId();
        if (id2 == R.id.tv_sort_heal) {
            if (f87923a4.equals(this.K3)) {
                this.L3 = -this.L3;
            } else {
                this.K3 = f87923a4;
                this.L3 = -1;
            }
            m2();
            return;
        }
        if (id2 == R.id.tv_sort_last_hit) {
            if (f87934l4.equals(this.K3)) {
                this.L3 = -this.L3;
            } else {
                this.K3 = f87934l4;
                this.L3 = -1;
            }
            m2();
            return;
        }
        if (id2 == R.id.tv_sort_weapon_acc) {
            if (f87924b4.equals(this.K3)) {
                this.L3 = -this.L3;
            } else {
                this.K3 = f87924b4;
                this.L3 = -1;
            }
            m2();
            return;
        }
        switch (id2) {
            case R.id.tv_sort_alone_kill /* 2131365685 */:
                if (f87933k4.equals(this.K3)) {
                    this.L3 = -this.L3;
                } else {
                    this.K3 = f87933k4;
                    this.L3 = -1;
                }
                m2();
                break;
            case R.id.tv_sort_avg_aad_kill /* 2131365686 */:
                if (f87931i4.equals(this.K3)) {
                    this.L3 = -this.L3;
                } else {
                    this.K3 = f87931i4;
                    this.L3 = -1;
                }
                m2();
                break;
            case R.id.tv_sort_avg_aad_time /* 2131365687 */:
                if (f87930h4.equals(this.K3)) {
                    this.L3 = -this.L3;
                } else {
                    this.K3 = f87930h4;
                    this.L3 = -1;
                }
                m2();
                break;
            case R.id.tv_sort_avg_alone_kill /* 2131365688 */:
                if (f87926d4.equals(this.K3)) {
                    this.L3 = -this.L3;
                } else {
                    this.K3 = f87926d4;
                    this.L3 = -1;
                }
                m2();
                break;
            case R.id.tv_sort_avg_dmg /* 2131365689 */:
                if (f87927e4.equals(this.K3)) {
                    this.L3 = -this.L3;
                } else {
                    this.K3 = f87927e4;
                    this.L3 = -1;
                }
                m2();
                break;
            case R.id.tv_sort_avg_heal /* 2131365690 */:
                if (f87928f4.equals(this.K3)) {
                    this.L3 = -this.L3;
                } else {
                    this.K3 = f87928f4;
                    this.L3 = -1;
                }
                m2();
                break;
            case R.id.tv_sort_avg_last_hit /* 2131365691 */:
                if (f87929g4.equals(this.K3)) {
                    this.L3 = -this.L3;
                } else {
                    this.K3 = f87929g4;
                    this.L3 = -1;
                }
                m2();
                break;
            case R.id.tv_sort_avg_on_fire_time /* 2131365692 */:
                if (f87932j4.equals(this.K3)) {
                    this.L3 = -this.L3;
                } else {
                    this.K3 = f87932j4;
                    this.L3 = -1;
                }
                m2();
                break;
            case R.id.tv_sort_critical_acc /* 2131365693 */:
                if (f87925c4.equals(this.K3)) {
                    this.L3 = -this.L3;
                } else {
                    this.K3 = f87925c4;
                    this.L3 = -1;
                }
                m2();
                break;
            default:
                switch (id2) {
                    case R.id.tv_sort_death /* 2131365696 */:
                        if (Z3.equals(this.K3)) {
                            this.L3 = -this.L3;
                        } else {
                            this.K3 = Z3;
                            this.L3 = -1;
                        }
                        m2();
                        break;
                    case R.id.tv_sort_dmg /* 2131365697 */:
                        if (Y3.equals(this.K3)) {
                            this.L3 = -this.L3;
                        } else {
                            this.K3 = Y3;
                            this.L3 = -1;
                        }
                        m2();
                        break;
                    default:
                        switch (id2) {
                            case R.id.tv_sort_kd /* 2131365703 */:
                                if (X3.equals(this.K3)) {
                                    this.L3 = -this.L3;
                                } else {
                                    this.K3 = X3;
                                    this.L3 = -1;
                                }
                                m2();
                                break;
                            case R.id.tv_sort_kill /* 2131365704 */:
                                if (W3.equals(this.K3)) {
                                    this.L3 = -this.L3;
                                } else {
                                    this.K3 = W3;
                                    this.L3 = -1;
                                }
                                m2();
                                break;
                            default:
                                switch (id2) {
                                    case R.id.tv_sort_match_time /* 2131365709 */:
                                        if (T3.equals(this.K3)) {
                                            this.L3 = -this.L3;
                                        } else {
                                            this.K3 = T3;
                                            this.L3 = -1;
                                        }
                                        m2();
                                        break;
                                    case R.id.tv_sort_mmr /* 2131365710 */:
                                        if ("mmr".equals(this.K3)) {
                                            this.L3 = -this.L3;
                                        } else {
                                            this.K3 = "mmr";
                                            this.L3 = -1;
                                        }
                                        m2();
                                        break;
                                    case R.id.tv_sort_mmr_rank /* 2131365711 */:
                                        if (V3.equals(this.K3)) {
                                            this.L3 = -this.L3;
                                        } else {
                                            this.K3 = V3;
                                            this.L3 = -1;
                                        }
                                        m2();
                                        break;
                                    case R.id.tv_sort_on_fire_time /* 2131365712 */:
                                        if (f87935m4.equals(this.K3)) {
                                            this.L3 = -this.L3;
                                        } else {
                                            this.K3 = f87935m4;
                                            this.L3 = -1;
                                        }
                                        m2();
                                        break;
                                }
                                break;
                        }
                        break;
                }
                break;
        }
    }
}
