package com.max.xiaoheihe.module.littleprogram.fragment.dota2;

import android.content.Context;
import android.os.Bundle;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.compose.runtime.internal.o;
import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import androidx.transition.AutoTransition;
import androidx.transition.v;
import com.donkingliang.consecutivescroller.ConsecutiveScrollerLayout;
import com.github.mikephil.charting.charts.LineChart;
import com.github.mikephil.charting.components.AxisBase;
import com.github.mikephil.charting.components.XAxis;
import com.github.mikephil.charting.data.Entry;
import com.github.mikephil.charting.data.LineData;
import com.github.mikephil.charting.data.LineDataSet;
import com.github.mikephil.charting.formatter.IAxisValueFormatter;
import com.github.mikephil.charting.formatter.IValueFormatter;
import com.github.mikephil.charting.utils.ViewPortHandler;
import com.max.hbcommon.base.adapter.s;
import com.max.hbcommon.bean.KeyDescObj;
import com.max.hbcommon.component.segmentfilters.SegmentFilterView;
import com.max.hbcustomview.chart.RadarView;
import com.max.hbutils.utils.ViewUtils;
import com.max.hbutils.utils.n;
import com.max.hbutils.utils.q;
import com.max.xiaoheihe.R;
import com.max.xiaoheihe.bean.game.dota2.Dota2BanPickDataObj;
import com.max.xiaoheihe.bean.game.dota2.Dota2BanPickObj;
import com.max.xiaoheihe.bean.game.dota2.Dota2ChartObj;
import com.max.xiaoheihe.bean.game.dota2.Dota2HeroObj;
import com.max.xiaoheihe.bean.game.dota2.Dota2MatchDetailObj;
import com.max.xiaoheihe.bean.game.dota2.Dota2PlayerObj;
import com.max.xiaoheihe.bean.game.dota2.Dota2TeamInfoObj;
import com.max.xiaoheihe.bean.game.dota2.Dota2TeamObj;
import com.max.xiaoheihe.bean.game.dota2.Dota2TeamSumObj;
import com.max.xiaoheihe.bean.game.dota2.Dota2UnitObj;
import com.max.xiaoheihe.bean.game.dota2.HeroKillObj;
import com.max.xiaoheihe.bean.game.dota2.MatchInfoObj;
import com.max.xiaoheihe.bean.game.dota2.MatchSizeObj;
import com.max.xiaoheihe.bean.game.dota2.ResultColorObj;
import com.max.xiaoheihe.bean.game.gameoverview.KDAObj;
import com.max.xiaoheihe.bean.game.gameoverview.Overlaymatch;
import com.max.xiaoheihe.module.game.adapter.dota2.Dota2DataTeamAdapter;
import com.max.xiaoheihe.module.game.component.KDAView;
import com.max.xiaoheihe.module.game.component.dota2.Dota2DanView;
import com.max.xiaoheihe.module.game.component.dota2.Dota2GoldDataMarkerView;
import com.max.xiaoheihe.module.game.component.dota2.Dota2HeroImageView;
import com.max.xiaoheihe.module.game.component.dota2.Dota2MatchDetailChart;
import com.max.xiaoheihe.module.game.component.dota2.Dota2MatchTitleView;
import com.max.xiaoheihe.module.game.component.dota2.Dota2PlayerSelectorView;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.PatchProxyResult;
import df.j8;
import java.text.DecimalFormat;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.collections.CollectionsKt__CollectionsKt;
import kotlin.jvm.internal.f0;
import kotlin.jvm.internal.t0;
import kotlin.jvm.internal.u;
import mb.s0;
import xh.m;

/* JADX INFO: compiled from: Dota2MatchDetailContentFragment.kt */
/* JADX INFO: loaded from: classes11.dex */
@o(parameters = 0)
public final class b extends Fragment implements com.max.xiaoheihe.module.littleprogram.fragment.dota2.f {
    public static ChangeQuickRedirect changeQuickRedirect = null;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    @dl.d
    public static final a f89090j = new a(null);

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public static final int f89091k = 8;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    @dl.d
    public static final String f89092l = "match_data";

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public j8 f89093b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private int f89094c;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    @dl.e
    private Dota2DataTeamAdapter f89096e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private int f89097f;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    @dl.e
    private Dota2MatchDetailObj f89100i;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @dl.d
    private ArrayList<Dota2PlayerObj> f89095d = new ArrayList<>();

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private int f89098g = 5;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private boolean f89099h = true;

    /* JADX INFO: compiled from: Dota2MatchDetailContentFragment.kt */
    @t0({"SMAP\nDota2MatchDetailContentFragment.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Dota2MatchDetailContentFragment.kt\ncom/max/xiaoheihe/module/littleprogram/fragment/dota2/Dota2MatchDetailContentFragment$Companion\n+ 2 View.kt\nandroidx/core/view/ViewKt\n*L\n1#1,1166:1\n262#2,2:1167\n262#2,2:1169\n*S KotlinDebug\n*F\n+ 1 Dota2MatchDetailContentFragment.kt\ncom/max/xiaoheihe/module/littleprogram/fragment/dota2/Dota2MatchDetailContentFragment$Companion\n*L\n106#1:1167,2\n118#1:1169,2\n*E\n"})
    public static final class a {
        public static ChangeQuickRedirect changeQuickRedirect;

        /* JADX INFO: renamed from: com.max.xiaoheihe.module.littleprogram.fragment.dota2.b$a$a, reason: collision with other inner class name */
        /* JADX INFO: compiled from: Dota2MatchDetailContentFragment.kt */
        public static final class C0810a extends s<Dota2PlayerObj> {
            public static ChangeQuickRedirect changeQuickRedirect;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            private int f89101b;

            /* JADX INFO: renamed from: c, reason: collision with root package name */
            private long f89102c;

            /* JADX INFO: renamed from: d, reason: collision with root package name */
            final /* synthetic */ Context f89103d;

            /* JADX INFO: renamed from: e, reason: collision with root package name */
            final /* synthetic */ boolean f89104e;

            /* JADX INFO: renamed from: f, reason: collision with root package name */
            final /* synthetic */ RecyclerView f89105f;

            /* JADX INFO: renamed from: g, reason: collision with root package name */
            final /* synthetic */ ViewGroup f89106g;

            /* JADX INFO: renamed from: h, reason: collision with root package name */
            final /* synthetic */ int f89107h;

            /* JADX INFO: renamed from: i, reason: collision with root package name */
            final /* synthetic */ boolean f89108i;

            /* JADX INFO: renamed from: com.max.xiaoheihe.module.littleprogram.fragment.dota2.b$a$a$a, reason: collision with other inner class name */
            /* JADX INFO: compiled from: Dota2MatchDetailContentFragment.kt */
            public static final class ViewOnClickListenerC0811a implements View.OnClickListener {
                public static ChangeQuickRedirect changeQuickRedirect;

                /* JADX INFO: renamed from: c, reason: collision with root package name */
                final /* synthetic */ ViewGroup f89110c;

                /* JADX INFO: renamed from: d, reason: collision with root package name */
                final /* synthetic */ RecyclerView f89111d;

                /* JADX INFO: renamed from: e, reason: collision with root package name */
                final /* synthetic */ Dota2PlayerObj f89112e;

                /* JADX INFO: renamed from: f, reason: collision with root package name */
                final /* synthetic */ ViewGroup f89113f;

                /* JADX INFO: renamed from: g, reason: collision with root package name */
                final /* synthetic */ s.e f89114g;

                ViewOnClickListenerC0811a(ViewGroup viewGroup, RecyclerView recyclerView, Dota2PlayerObj dota2PlayerObj, ViewGroup viewGroup2, s.e eVar) {
                    this.f89110c = viewGroup;
                    this.f89111d = recyclerView;
                    this.f89112e = dota2PlayerObj;
                    this.f89113f = viewGroup2;
                    this.f89114g = eVar;
                }

                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    if (PatchProxy.proxy(new Object[]{view}, this, changeQuickRedirect, false, 39186, new Class[]{View.class}, Void.TYPE).isSupported) {
                        return;
                    }
                    long jCurrentTimeMillis = System.currentTimeMillis();
                    if (jCurrentTimeMillis - C0810a.this.n() <= 500) {
                        return;
                    }
                    C0810a.this.w(jCurrentTimeMillis);
                    AutoTransition autoTransition = new AutoTransition();
                    autoTransition.z(this.f89110c, true);
                    ViewGroup viewGroup = null;
                    if (C0810a.this.o() >= 0 && C0810a.this.o() < C0810a.this.getDataList().size()) {
                        RecyclerView.LayoutManager layoutManager = this.f89111d.getLayoutManager();
                        f0.n(layoutManager, "null cannot be cast to non-null type androidx.recyclerview.widget.LinearLayoutManager");
                        View viewFindViewByPosition = ((LinearLayoutManager) layoutManager).findViewByPosition(C0810a.this.o());
                        viewGroup = viewFindViewByPosition != null ? (ViewGroup) viewFindViewByPosition.findViewById(R.id.vg_expand) : null;
                        if (viewGroup != null) {
                            autoTransition.z(viewGroup, true);
                        }
                    }
                    autoTransition.w0(200L);
                    Dota2PlayerObj dota2PlayerObj = this.f89112e;
                    if (dota2PlayerObj != null && dota2PlayerObj.getExpand()) {
                        ViewGroup viewGroup2 = this.f89113f;
                        f0.n(viewGroup2, "null cannot be cast to non-null type android.view.ViewGroup");
                        v.b(viewGroup2, autoTransition);
                        Dota2PlayerObj dota2PlayerObj2 = this.f89112e;
                        if (dota2PlayerObj2 != null) {
                            dota2PlayerObj2.setExpand(false);
                        }
                        C0810a.this.x(-1);
                    } else {
                        ViewGroup viewGroup3 = this.f89113f;
                        f0.n(viewGroup3, "null cannot be cast to non-null type android.view.ViewGroup");
                        v.b(viewGroup3, autoTransition);
                        Dota2PlayerObj dota2PlayerObj3 = this.f89112e;
                        if (dota2PlayerObj3 != null) {
                            dota2PlayerObj3.setExpand(true);
                        }
                        if (C0810a.this.o() >= 0 && C0810a.this.o() < C0810a.this.getDataList().size()) {
                            Dota2PlayerObj dota2PlayerObj4 = C0810a.this.getDataList().get(C0810a.this.o());
                            if (dota2PlayerObj4 != null) {
                                dota2PlayerObj4.setExpand(false);
                            }
                            C0810a.m(C0810a.this, viewGroup, dota2PlayerObj4);
                        }
                        C0810a.this.x(this.f89114g.getAbsoluteAdapterPosition());
                    }
                    C0810a.m(C0810a.this, this.f89110c, this.f89112e);
                }
            }

            /* JADX INFO: renamed from: com.max.xiaoheihe.module.littleprogram.fragment.dota2.b$a$a$b, reason: collision with other inner class name */
            /* JADX INFO: compiled from: Dota2MatchDetailContentFragment.kt */
            public static final class ViewOnClickListenerC0812b implements View.OnClickListener {
                public static ChangeQuickRedirect changeQuickRedirect;

                /* JADX INFO: renamed from: b, reason: collision with root package name */
                final /* synthetic */ boolean f89115b;

                /* JADX INFO: renamed from: c, reason: collision with root package name */
                final /* synthetic */ Context f89116c;

                /* JADX INFO: renamed from: d, reason: collision with root package name */
                final /* synthetic */ Dota2PlayerObj f89117d;

                ViewOnClickListenerC0812b(boolean z10, Context context, Dota2PlayerObj dota2PlayerObj) {
                    this.f89115b = z10;
                    this.f89116c = context;
                    this.f89117d = dota2PlayerObj;
                }

                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    if (PatchProxy.proxy(new Object[]{view}, this, changeQuickRedirect, false, 39187, new Class[]{View.class}, Void.TYPE).isSupported || this.f89115b) {
                        return;
                    }
                    Context context = this.f89116c;
                    Dota2HeroObj hero_info = this.f89117d.getHero_info();
                    com.max.xiaoheihe.base.router.b.k0(context, hero_info != null ? hero_info.getProtocol() : null);
                }
            }

            /* JADX INFO: renamed from: com.max.xiaoheihe.module.littleprogram.fragment.dota2.b$a$a$c */
            /* JADX INFO: compiled from: Dota2MatchDetailContentFragment.kt */
            public static final class c implements View.OnClickListener {
                public static ChangeQuickRedirect changeQuickRedirect;

                /* JADX INFO: renamed from: b, reason: collision with root package name */
                final /* synthetic */ boolean f89118b;

                /* JADX INFO: renamed from: c, reason: collision with root package name */
                final /* synthetic */ Dota2PlayerObj f89119c;

                /* JADX INFO: renamed from: d, reason: collision with root package name */
                final /* synthetic */ Context f89120d;

                c(boolean z10, Dota2PlayerObj dota2PlayerObj, Context context) {
                    this.f89118b = z10;
                    this.f89119c = dota2PlayerObj;
                    this.f89120d = context;
                }

                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    if (PatchProxy.proxy(new Object[]{view}, this, changeQuickRedirect, false, 39188, new Class[]{View.class}, Void.TYPE).isSupported || this.f89118b || com.max.hbcommon.utils.c.u(this.f89119c.getAccount_id())) {
                        return;
                    }
                    com.max.xiaoheihe.base.router.b.p0(this.f89120d, null, this.f89119c.getAccount_id());
                }
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            C0810a(Context context, boolean z10, RecyclerView recyclerView, ViewGroup viewGroup, int i10, boolean z11, List<Dota2PlayerObj> list) {
                super(context, list, R.layout.item_dota2_match_player);
                this.f89103d = context;
                this.f89104e = z10;
                this.f89105f = recyclerView;
                this.f89106g = viewGroup;
                this.f89107h = i10;
                this.f89108i = z11;
                this.f89101b = -1;
            }

            public static final /* synthetic */ void m(C0810a c0810a, ViewGroup viewGroup, Dota2PlayerObj dota2PlayerObj) {
                if (PatchProxy.proxy(new Object[]{c0810a, viewGroup, dota2PlayerObj}, null, changeQuickRedirect, true, 39185, new Class[]{C0810a.class, ViewGroup.class, Dota2PlayerObj.class}, Void.TYPE).isSupported) {
                    return;
                }
                c0810a.q(viewGroup, dota2PlayerObj);
            }

            private final void q(ViewGroup viewGroup, Dota2PlayerObj dota2PlayerObj) {
                if (PatchProxy.proxy(new Object[]{viewGroup, dota2PlayerObj}, this, changeQuickRedirect, false, 39178, new Class[]{ViewGroup.class, Dota2PlayerObj.class}, Void.TYPE).isSupported) {
                    return;
                }
                ViewGroup.LayoutParams layoutParams = viewGroup != null ? viewGroup.getLayoutParams() : null;
                if (dota2PlayerObj != null && dota2PlayerObj.getExpand()) {
                    if (layoutParams != null) {
                        layoutParams.height = -2;
                    }
                } else if (layoutParams != null) {
                    layoutParams.height = 0;
                }
                if (viewGroup == null) {
                    return;
                }
                viewGroup.setLayoutParams(layoutParams);
            }

            private final void r(Dota2PlayerObj dota2PlayerObj, View view) {
                if (PatchProxy.proxy(new Object[]{dota2PlayerObj, view}, this, changeQuickRedirect, false, 39180, new Class[]{Dota2PlayerObj.class, View.class}, Void.TYPE).isSupported || dota2PlayerObj == null) {
                    return;
                }
                int i10 = this.f89107h;
                Context context = this.f89103d;
                View viewFindViewById = view.findViewById(R.id.tv_score);
                f0.o(viewFindViewById, "viewExpand.findViewById(R.id.tv_score)");
                View viewFindViewById2 = view.findViewById(R.id.tv_all_damage);
                f0.o(viewFindViewById2, "viewExpand.findViewById(R.id.tv_all_damage)");
                View viewFindViewById3 = view.findViewById(R.id.tv_all_gold);
                f0.o(viewFindViewById3, "viewExpand.findViewById(R.id.tv_all_gold)");
                View viewFindViewById4 = view.findViewById(R.id.rv_backpack);
                f0.o(viewFindViewById4, "viewExpand.findViewById(R.id.rv_backpack)");
                RecyclerView recyclerView = (RecyclerView) viewFindViewById4;
                View viewFindViewById5 = view.findViewById(R.id.vg_unit);
                f0.o(viewFindViewById5, "viewExpand.findViewById(R.id.vg_unit)");
                ViewGroup viewGroup = (ViewGroup) viewFindViewById5;
                View viewFindViewById6 = view.findViewById(R.id.rv_hero_data);
                f0.o(viewFindViewById6, "viewExpand.findViewById(R.id.rv_hero_data)");
                RecyclerView recyclerView2 = (RecyclerView) viewFindViewById6;
                View viewFindViewById7 = view.findViewById(R.id.vg_hero_kill);
                f0.o(viewFindViewById7, "viewExpand.findViewById(R.id.vg_hero_kill)");
                LinearLayout linearLayout = (LinearLayout) viewFindViewById7;
                View viewFindViewById8 = view.findViewById(R.id.vg_support_tools);
                f0.o(viewFindViewById8, "viewExpand.findViewById(R.id.vg_support_tools)");
                LinearLayout linearLayout2 = (LinearLayout) viewFindViewById8;
                View viewFindViewById9 = view.findViewById(R.id.rv_hero_buff);
                f0.o(viewFindViewById9, "viewExpand.findViewById(R.id.rv_hero_buff)");
                RecyclerView recyclerView3 = (RecyclerView) viewFindViewById9;
                View viewFindViewById10 = view.findViewById(R.id.rv_hero_level_up);
                f0.o(viewFindViewById10, "viewExpand.findViewById(R.id.rv_hero_level_up)");
                RecyclerView recyclerView4 = (RecyclerView) viewFindViewById10;
                view.setBackgroundColor(com.max.xiaoheihe.utils.d.I(0.06f, i10));
                ((TextView) viewFindViewById).setText(dota2PlayerObj.getMvp_score());
                ((TextView) viewFindViewById2).setText(dota2PlayerObj.getDamage());
                ((TextView) viewFindViewById3).setText(dota2PlayerObj.getGold());
                List<String> backpack = dota2PlayerObj.getBackpack();
                if (backpack != null) {
                    recyclerView.setLayoutManager(new LinearLayoutManager(context, 0, false));
                    if (recyclerView.getItemDecorationCount() == 0) {
                        recyclerView.addItemDecoration(new com.max.hbcustomview.d(ViewUtils.f(context, 2.0f), 0));
                    }
                    recyclerView.setAdapter(new nf.b(context, backpack, ViewUtils.f(context, 24.0f), ViewUtils.f(context, 17.0f)));
                }
                v(viewGroup, dota2PlayerObj.getUnit());
                List<KeyDescObj> hero_data = dota2PlayerObj.getHero_data();
                if (hero_data != null) {
                    recyclerView2.setLayoutManager(new GridLayoutManager(context, 3));
                    recyclerView2.setAdapter(new nf.c(context, hero_data));
                }
                if (com.max.hbcommon.utils.c.w(dota2PlayerObj.getPermanent_buffs())) {
                    recyclerView3.setVisibility(8);
                } else {
                    List<KeyDescObj> permanent_buffs = dota2PlayerObj.getPermanent_buffs();
                    if (permanent_buffs != null) {
                        recyclerView3.setVisibility(0);
                        recyclerView3.setLayoutManager(new LinearLayoutManager(context, 0, false));
                        if (recyclerView3.getItemDecorationCount() == 0) {
                            recyclerView3.addItemDecoration(new com.max.hbcustomview.d(ViewUtils.f(context, 4.0f), 0));
                        }
                        recyclerView3.setAdapter(new nf.a(context, permanent_buffs));
                    }
                }
                s(linearLayout, dota2PlayerObj.getHero_kill());
                u(linearLayout2, dota2PlayerObj.getSupport_items());
                if (com.max.hbcommon.utils.c.w(dota2PlayerObj.getSkill_up())) {
                    recyclerView4.setVisibility(8);
                    return;
                }
                List<KeyDescObj> skill_up = dota2PlayerObj.getSkill_up();
                if (skill_up != null) {
                    recyclerView4.setVisibility(0);
                    recyclerView4.setLayoutManager(new GridLayoutManager(context, 11));
                    if (recyclerView4.getItemDecorationCount() == 0) {
                        recyclerView4.addItemDecoration(new fc.b(11, ViewUtils.f(context, 4.0f), false));
                    }
                    recyclerView4.setAdapter(new nf.e(context, skill_up));
                }
            }

            private final void s(ViewGroup viewGroup, HeroKillObj heroKillObj) {
                if (PatchProxy.proxy(new Object[]{viewGroup, heroKillObj}, this, changeQuickRedirect, false, 39182, new Class[]{ViewGroup.class, HeroKillObj.class}, Void.TYPE).isSupported) {
                    return;
                }
                if (heroKillObj == null || com.max.hbcommon.utils.c.w(heroKillObj.getData_list())) {
                    viewGroup.setVisibility(8);
                    return;
                }
                viewGroup.setBackground(ViewUtils.G(ViewUtils.o(this.f89103d, viewGroup), com.max.xiaoheihe.utils.d.E(R.color.white_alpha2)));
                viewGroup.setVisibility(0);
                View viewFindViewById = viewGroup.findViewById(R.id.rv_hero_kill);
                f0.o(viewFindViewById, "vgContainer.findViewById(R.id.rv_hero_kill)");
                RecyclerView recyclerView = (RecyclerView) viewFindViewById;
                recyclerView.setLayoutManager(new LinearLayoutManager(this.f89103d, 0, false));
                Context context = this.f89103d;
                List<KeyDescObj> data_list = heroKillObj.getData_list();
                f0.m(data_list);
                recyclerView.setAdapter(new nf.d(context, data_list, ViewUtils.f(this.f89103d, 15.0f), ViewUtils.f(this.f89103d, 15.0f)));
            }

            private final void t(Dota2PlayerObj dota2PlayerObj, View view, boolean z10) {
                if (PatchProxy.proxy(new Object[]{dota2PlayerObj, view, new Byte(z10 ? (byte) 1 : (byte) 0)}, this, changeQuickRedirect, false, 39179, new Class[]{Dota2PlayerObj.class, View.class, Boolean.TYPE}, Void.TYPE).isSupported || dota2PlayerObj == null) {
                    return;
                }
                int i10 = this.f89107h;
                Context context = this.f89103d;
                boolean z11 = this.f89108i;
                View viewFindViewById = view.findViewById(R.id.v_select);
                f0.o(viewFindViewById, "itemView.findViewById(R.id.v_select)");
                View viewFindViewById2 = view.findViewById(R.id.v_dota2_hero);
                f0.o(viewFindViewById2, "itemView.findViewById(R.id.v_dota2_hero)");
                Dota2HeroImageView dota2HeroImageView = (Dota2HeroImageView) viewFindViewById2;
                View viewFindViewById3 = view.findViewById(R.id.tv_name);
                f0.o(viewFindViewById3, "itemView.findViewById(R.id.tv_name)");
                TextView textView = (TextView) viewFindViewById3;
                View viewFindViewById4 = view.findViewById(R.id.iv_authentication);
                f0.o(viewFindViewById4, "itemView.findViewById(R.id.iv_authentication)");
                ImageView imageView = (ImageView) viewFindViewById4;
                View viewFindViewById5 = view.findViewById(R.id.v_dota2_dan);
                f0.o(viewFindViewById5, "itemView.findViewById(R.id.v_dota2_dan)");
                Dota2DanView dota2DanView = (Dota2DanView) viewFindViewById5;
                View viewFindViewById6 = view.findViewById(R.id.tv_fight_rate);
                f0.o(viewFindViewById6, "itemView.findViewById(R.id.tv_fight_rate)");
                TextView textView2 = (TextView) viewFindViewById6;
                View viewFindViewById7 = view.findViewById(R.id.tv_damage_rate);
                f0.o(viewFindViewById7, "itemView.findViewById(R.id.tv_damage_rate)");
                TextView textView3 = (TextView) viewFindViewById7;
                View viewFindViewById8 = view.findViewById(R.id.rv_equip);
                f0.o(viewFindViewById8, "itemView.findViewById(R.id.rv_equip)");
                RecyclerView recyclerView = (RecyclerView) viewFindViewById8;
                View viewFindViewById9 = view.findViewById(R.id.iv_equip_1);
                f0.o(viewFindViewById9, "itemView.findViewById(R.id.iv_equip_1)");
                ImageView imageView2 = (ImageView) viewFindViewById9;
                View viewFindViewById10 = view.findViewById(R.id.iv_equip_2);
                f0.o(viewFindViewById10, "itemView.findViewById(R.id.iv_equip_2)");
                ImageView imageView3 = (ImageView) viewFindViewById10;
                View viewFindViewById11 = view.findViewById(R.id.v_kda);
                f0.o(viewFindViewById11, "itemView.findViewById(R.id.v_kda)");
                KDAView kDAView = (KDAView) viewFindViewById11;
                View viewFindViewById12 = view.findViewById(R.id.tv_kda);
                f0.o(viewFindViewById12, "itemView.findViewById(R.id.tv_kda)");
                TextView textView4 = (TextView) viewFindViewById12;
                View viewFindViewById13 = view.findViewById(R.id.iv_avatar);
                f0.o(viewFindViewById13, "itemView.findViewById(R.id.iv_avatar)");
                ImageView imageView4 = (ImageView) viewFindViewById13;
                view.setBackgroundColor(com.max.xiaoheihe.utils.d.I(0.1f, i10));
                if (com.max.hbcommon.utils.c.x(dota2PlayerObj.is_me())) {
                    viewFindViewById.setVisibility(0);
                    viewFindViewById.setBackground(q.B(context, i10, 5.0f));
                } else {
                    viewFindViewById.setVisibility(8);
                }
                Dota2HeroObj hero_info = dota2PlayerObj.getHero_info();
                com.max.hbimage.b.K(hero_info != null ? hero_info.getHero_image() : null, dota2HeroImageView.getIv_image());
                TextView tv_level = dota2HeroImageView.getTv_level();
                Dota2HeroObj hero_info2 = dota2PlayerObj.getHero_info();
                tv_level.setText(hero_info2 != null ? hero_info2.getLevel() : null);
                Dota2HeroObj hero_info3 = dota2PlayerObj.getHero_info();
                String hero_variant = hero_info3 != null ? hero_info3.getHero_variant() : null;
                if (hero_variant == null || hero_variant.length() == 0) {
                    dota2HeroImageView.getIv_icon().setVisibility(8);
                } else {
                    dota2HeroImageView.getIv_icon().setVisibility(0);
                    Dota2HeroObj hero_info4 = dota2PlayerObj.getHero_info();
                    com.max.hbimage.b.g0(hero_info4 != null ? hero_info4.getHero_variant() : null, dota2HeroImageView.getIv_icon(), ViewUtils.f(context, 3.0f), -1, null, 1);
                }
                dota2HeroImageView.getV_mvp().setVisibility(com.max.hbcommon.utils.c.x(dota2PlayerObj.is_mvp()) ? 0 : 8);
                dota2HeroImageView.setOnClickListener(new ViewOnClickListenerC0812b(z10, context, dota2PlayerObj));
                textView.setText(dota2PlayerObj.getName());
                textView.setTextColor(i10);
                c cVar = new c(z10, dota2PlayerObj, context);
                textView.setOnClickListener(cVar);
                if (z11) {
                    imageView4.setVisibility(0);
                    imageView4.setOnClickListener(cVar);
                    com.max.hbimage.b.K(dota2PlayerObj.getAvatar(), imageView4);
                } else {
                    imageView4.setVisibility(8);
                }
                Dota2TeamInfoObj team_info = dota2PlayerObj.getTeam_info();
                if (com.max.hbcommon.utils.c.u(team_info != null ? team_info.getIcon() : null)) {
                    imageView.setVisibility(8);
                } else {
                    imageView.setVisibility(0);
                    Dota2TeamInfoObj team_info2 = dota2PlayerObj.getTeam_info();
                    com.max.hbimage.b.K(team_info2 != null ? team_info2.getIcon() : null, imageView);
                }
                if (com.max.hbcommon.utils.c.u(dota2PlayerObj.getDan_icon())) {
                    dota2DanView.setVisibility(8);
                } else {
                    dota2DanView.setVisibility(0);
                    com.max.hbimage.b.K(dota2PlayerObj.getDan_icon(), dota2DanView.getIv_dan());
                    if (com.max.hbcommon.utils.c.u(dota2PlayerObj.getDan_value())) {
                        dota2DanView.getTv_top_num().setVisibility(8);
                    } else {
                        dota2DanView.getTv_top_num().setText('#' + dota2PlayerObj.getDan_value());
                        dota2DanView.getTv_top_num().setVisibility(0);
                    }
                }
                textView2.setText(dota2PlayerObj.getFight_rate());
                textView3.setText(dota2PlayerObj.getDamage_rate());
                kDAView.setKDA(dota2PlayerObj.getKda());
                kDAView.setColor(com.max.xiaoheihe.utils.d.E(R.color.white));
                kDAView.setTypeFace(bb.d.a().b(5));
                KDAObj kda = dota2PlayerObj.getKda();
                textView4.setText(kda != null ? kda.getKd() : null);
                com.max.hbimage.b.K(dota2PlayerObj.getAghanims_img(), imageView2);
                com.max.hbimage.b.K(dota2PlayerObj.getNeutral(), imageView3);
                recyclerView.setLayoutManager(new GridLayoutManager(context, 3));
                if (recyclerView.getItemDecorationCount() == 0) {
                    recyclerView.addItemDecoration(new fc.b(3, ViewUtils.f(context, 3.0f), false));
                }
                List<String> items = dota2PlayerObj.getItems();
                if (items != null) {
                    recyclerView.setAdapter(new nf.b(context, items, ViewUtils.f(context, 26.0f), ViewUtils.f(context, 20.0f)));
                }
            }

            private final void u(ViewGroup viewGroup, HeroKillObj heroKillObj) {
                if (PatchProxy.proxy(new Object[]{viewGroup, heroKillObj}, this, changeQuickRedirect, false, 39183, new Class[]{ViewGroup.class, HeroKillObj.class}, Void.TYPE).isSupported) {
                    return;
                }
                if (heroKillObj == null || com.max.hbcommon.utils.c.w(heroKillObj.getData_list())) {
                    viewGroup.setVisibility(8);
                    return;
                }
                viewGroup.setBackground(ViewUtils.G(ViewUtils.o(this.f89103d, viewGroup), com.max.xiaoheihe.utils.d.E(R.color.white_alpha2)));
                viewGroup.setVisibility(0);
                View viewFindViewById = viewGroup.findViewById(R.id.rv_support_tools);
                f0.o(viewFindViewById, "vgContainer.findViewById(R.id.rv_support_tools)");
                RecyclerView recyclerView = (RecyclerView) viewFindViewById;
                recyclerView.setLayoutManager(new LinearLayoutManager(this.f89103d, 0, false));
                Context context = this.f89103d;
                List<KeyDescObj> data_list = heroKillObj.getData_list();
                f0.m(data_list);
                recyclerView.setAdapter(new nf.d(context, data_list, ViewUtils.f(this.f89103d, 15.0f), ViewUtils.f(this.f89103d, 11.0f)));
            }

            private final void v(ViewGroup viewGroup, Dota2UnitObj dota2UnitObj) {
                if (PatchProxy.proxy(new Object[]{viewGroup, dota2UnitObj}, this, changeQuickRedirect, false, 39181, new Class[]{ViewGroup.class, Dota2UnitObj.class}, Void.TYPE).isSupported) {
                    return;
                }
                if (dota2UnitObj == null) {
                    viewGroup.setVisibility(8);
                    return;
                }
                View viewFindViewById = viewGroup.findViewById(R.id.tv_unit_name);
                f0.o(viewFindViewById, "vgUnit.findViewById(R.id.tv_unit_name)");
                View viewFindViewById2 = viewGroup.findViewById(R.id.rv_unit_equip);
                f0.o(viewFindViewById2, "vgUnit.findViewById(R.id.rv_unit_equip)");
                RecyclerView recyclerView = (RecyclerView) viewFindViewById2;
                View viewFindViewById3 = viewGroup.findViewById(R.id.iv_unit_equip);
                f0.o(viewFindViewById3, "vgUnit.findViewById(R.id.iv_unit_equip)");
                ImageView imageView = (ImageView) viewFindViewById3;
                View viewFindViewById4 = viewGroup.findViewById(R.id.rv_unit_backpack);
                f0.o(viewFindViewById4, "vgUnit.findViewById(R.id.rv_unit_backpack)");
                RecyclerView recyclerView2 = (RecyclerView) viewFindViewById4;
                viewGroup.setVisibility(0);
                ((TextView) viewFindViewById).setText(dota2UnitObj.getDesc());
                recyclerView.setLayoutManager(new LinearLayoutManager(this.f89103d, 0, false));
                if (recyclerView.getItemDecorationCount() == 0) {
                    recyclerView.addItemDecoration(new com.max.hbcustomview.d(ViewUtils.f(this.f89103d, 3.0f), 0));
                }
                List<String> items = dota2UnitObj.getItems();
                if (items != null) {
                    Context context = this.f89103d;
                    recyclerView.setAdapter(new nf.b(context, items, ViewUtils.f(context, 24.0f), ViewUtils.f(context, 17.0f)));
                }
                if (com.max.hbcommon.utils.c.u(dota2UnitObj.getNeutral())) {
                    imageView.setVisibility(8);
                } else {
                    imageView.setVisibility(0);
                    com.max.hbimage.b.K(dota2UnitObj.getNeutral(), imageView);
                }
                recyclerView2.setLayoutManager(new LinearLayoutManager(this.f89103d, 0, false));
                if (recyclerView2.getItemDecorationCount() == 0) {
                    recyclerView2.addItemDecoration(new com.max.hbcustomview.d(ViewUtils.f(this.f89103d, 2.0f), 0));
                }
                List<String> backpack = dota2UnitObj.getBackpack();
                if (backpack != null) {
                    Context context2 = this.f89103d;
                    recyclerView2.setAdapter(new nf.b(context2, backpack, ViewUtils.f(context2, 24.0f), ViewUtils.f(context2, 17.0f)));
                }
            }

            public final long n() {
                return this.f89102c;
            }

            public final int o() {
                return this.f89101b;
            }

            @Override // com.max.hbcommon.base.adapter.s
            public /* bridge */ /* synthetic */ void onBindViewHolder(s.e eVar, Dota2PlayerObj dota2PlayerObj) {
                if (PatchProxy.proxy(new Object[]{eVar, dota2PlayerObj}, this, changeQuickRedirect, false, 39184, new Class[]{s.e.class, Object.class}, Void.TYPE).isSupported) {
                    return;
                }
                p(eVar, dota2PlayerObj);
            }

            public void p(@dl.e s.e eVar, @dl.e Dota2PlayerObj dota2PlayerObj) {
                if (PatchProxy.proxy(new Object[]{eVar, dota2PlayerObj}, this, changeQuickRedirect, false, 39177, new Class[]{s.e.class, Dota2PlayerObj.class}, Void.TYPE).isSupported || eVar == null) {
                    return;
                }
                boolean z10 = this.f89104e;
                RecyclerView recyclerView = this.f89105f;
                ViewGroup viewGroup = this.f89106g;
                View viewI = eVar.i(R.id.vg_item);
                f0.o(viewI, "viewHolder.getView(R.id.vg_item)");
                ViewGroup viewGroup2 = (ViewGroup) viewI;
                View viewI2 = eVar.i(R.id.vg_expand);
                f0.o(viewI2, "viewHolder.getView(R.id.vg_expand)");
                ViewGroup viewGroup3 = (ViewGroup) viewI2;
                View viewI3 = eVar.i(R.id.v_div);
                f0.o(viewI3, "viewHolder.getView(R.id.v_div)");
                viewI3.setVisibility(eVar.getAbsoluteAdapterPosition() == getDataList().size() - 1 ? 8 : 0);
                if (z10) {
                    ViewGroup.LayoutParams layoutParams = viewGroup3.getLayoutParams();
                    if (layoutParams != null) {
                        layoutParams.height = 0;
                    }
                    viewGroup3.setLayoutParams(layoutParams);
                } else {
                    q(viewGroup3, dota2PlayerObj);
                    viewGroup2.setOnClickListener(new ViewOnClickListenerC0811a(viewGroup3, recyclerView, dota2PlayerObj, viewGroup, eVar));
                    r(dota2PlayerObj, viewGroup3);
                }
                t(dota2PlayerObj, viewGroup2, z10);
            }

            public final void w(long j10) {
                this.f89102c = j10;
            }

            public final void x(int i10) {
                this.f89101b = i10;
            }
        }

        private a() {
        }

        public /* synthetic */ a(u uVar) {
            this();
        }

        public static final /* synthetic */ void a(a aVar, Context context, Dota2MatchDetailObj dota2MatchDetailObj, MatchSizeObj matchSizeObj, Dota2MatchTitleView dota2MatchTitleView, RecyclerView recyclerView, ViewGroup viewGroup, boolean z10, boolean z11) {
            Object[] objArr = {aVar, context, dota2MatchDetailObj, matchSizeObj, dota2MatchTitleView, recyclerView, viewGroup, new Byte(z10 ? (byte) 1 : (byte) 0), new Byte(z11 ? (byte) 1 : (byte) 0)};
            ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
            Class cls = Boolean.TYPE;
            if (PatchProxy.proxy(objArr, null, changeQuickRedirect2, true, 39176, new Class[]{a.class, Context.class, Dota2MatchDetailObj.class, MatchSizeObj.class, Dota2MatchTitleView.class, RecyclerView.class, ViewGroup.class, cls, cls}, Void.TYPE).isSupported) {
                return;
            }
            aVar.h(context, dota2MatchDetailObj, matchSizeObj, dota2MatchTitleView, recyclerView, viewGroup, z10, z11);
        }

        public static /* synthetic */ View c(a aVar, Context context, Dota2BanPickDataObj dota2BanPickDataObj, boolean z10, int i10, Object obj) {
            PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{aVar, context, dota2BanPickDataObj, new Byte(z10 ? (byte) 1 : (byte) 0), new Integer(i10), obj}, null, changeQuickRedirect, true, 39175, new Class[]{a.class, Context.class, Dota2BanPickDataObj.class, Boolean.TYPE, Integer.TYPE, Object.class}, View.class);
            if (patchProxyResultProxy.isSupported) {
                return (View) patchProxyResultProxy.result;
            }
            if ((i10 & 4) != 0) {
                z10 = false;
            }
            return aVar.b(context, dota2BanPickDataObj, z10);
        }

        public static /* synthetic */ void g(a aVar, Context context, LinearLayout linearLayout, List list, boolean z10, int i10, Object obj) {
            if (PatchProxy.proxy(new Object[]{aVar, context, linearLayout, list, new Byte(z10 ? (byte) 1 : (byte) 0), new Integer(i10), obj}, null, changeQuickRedirect, true, 39173, new Class[]{a.class, Context.class, LinearLayout.class, List.class, Boolean.TYPE, Integer.TYPE, Object.class}, Void.TYPE).isSupported) {
                return;
            }
            aVar.f(context, linearLayout, list, (i10 & 8) == 0 ? z10 ? 1 : 0 : false);
        }

        @m
        private final void h(Context context, Dota2MatchDetailObj dota2MatchDetailObj, MatchSizeObj matchSizeObj, Dota2MatchTitleView dota2MatchTitleView, RecyclerView recyclerView, ViewGroup viewGroup, boolean z10, boolean z11) {
            int iE1;
            Object[] objArr = {context, dota2MatchDetailObj, matchSizeObj, dota2MatchTitleView, recyclerView, viewGroup, new Byte(z10 ? (byte) 1 : (byte) 0), new Byte(z11 ? (byte) 1 : (byte) 0)};
            ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
            Class cls = Boolean.TYPE;
            if (PatchProxy.proxy(objArr, this, changeQuickRedirect2, false, 39170, new Class[]{Context.class, Dota2MatchDetailObj.class, MatchSizeObj.class, Dota2MatchTitleView.class, RecyclerView.class, ViewGroup.class, cls, cls}, Void.TYPE).isSupported || dota2MatchDetailObj == null || matchSizeObj == null) {
                return;
            }
            boolean zX = com.max.hbcommon.utils.c.x(matchSizeObj.getWin());
            if (z10) {
                ResultColorObj result_color = dota2MatchDetailObj.getResult_color();
                iE1 = com.max.xiaoheihe.utils.d.e1(result_color != null ? result_color.getWin_color() : null);
            } else {
                ResultColorObj result_color2 = dota2MatchDetailObj.getResult_color();
                iE1 = com.max.xiaoheihe.utils.d.e1(result_color2 != null ? result_color2.getLose_color() : null);
            }
            int i10 = iE1;
            dota2MatchTitleView.getTv_name().setText(matchSizeObj.getName());
            dota2MatchTitleView.getTv_win().setText(zX ? "胜利" : "失败");
            dota2MatchTitleView.getTv_kill().setText(matchSizeObj.getKill());
            dota2MatchTitleView.getTv_gold().setText(matchSizeObj.getGold());
            dota2MatchTitleView.setColor(i10);
            dota2MatchTitleView.setBackgroundColor(com.max.xiaoheihe.utils.d.I(0.1f, i10));
            recyclerView.setLayoutManager(new LinearLayoutManager(context));
            recyclerView.setAdapter(new C0810a(context, z11, recyclerView, viewGroup, i10, ViewUtils.L(context) >= ViewUtils.f(context, 375.0f), matchSizeObj.getPlayer_list()));
        }

        public static /* synthetic */ void j(a aVar, Context context, Dota2MatchDetailObj dota2MatchDetailObj, ImageView imageView, ViewGroup viewGroup, ViewGroup viewGroup2, ViewGroup viewGroup3, boolean z10, int i10, Object obj) {
            if (PatchProxy.proxy(new Object[]{aVar, context, dota2MatchDetailObj, imageView, viewGroup, viewGroup2, viewGroup3, new Byte(z10 ? (byte) 1 : (byte) 0), new Integer(i10), obj}, null, changeQuickRedirect, true, 39169, new Class[]{a.class, Context.class, Dota2MatchDetailObj.class, ImageView.class, ViewGroup.class, ViewGroup.class, ViewGroup.class, Boolean.TYPE, Integer.TYPE, Object.class}, Void.TYPE).isSupported) {
                return;
            }
            aVar.i(context, dota2MatchDetailObj, imageView, viewGroup, viewGroup2, viewGroup3, (i10 & 64) != 0 ? false : z10 ? 1 : 0);
        }

        @dl.d
        @m
        public final View b(@dl.d Context context, @dl.d Dota2BanPickDataObj data, boolean z10) {
            PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{context, data, new Byte(z10 ? (byte) 1 : (byte) 0)}, this, changeQuickRedirect, false, 39174, new Class[]{Context.class, Dota2BanPickDataObj.class, Boolean.TYPE}, View.class);
            if (patchProxyResultProxy.isSupported) {
                return (View) patchProxyResultProxy.result;
            }
            f0.p(context, "context");
            f0.p(data, "data");
            int iL = (ViewUtils.L(context) - ViewUtils.f(context, ((12 * 2.0f) + 16.0f) + 13.0f)) / 14;
            LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(iL, iL);
            layoutParams.setMarginEnd(ViewUtils.f(context, 2.0f));
            View dataView = LayoutInflater.from(context).inflate(R.layout.item_dota2_ban_pick_data, (ViewGroup) null, false);
            dataView.setLayoutParams(layoutParams);
            ImageView imageView = (ImageView) dataView.findViewById(R.id.iv_hero_image);
            TextView textView = (TextView) dataView.findViewById(R.id.tv_order);
            Dota2HeroObj hero_info = data.getHero_info();
            com.max.hbimage.b.K(hero_info != null ? hero_info.getHero_image() : null, imageView);
            textView.setText(data.getOrder());
            textView.setBackground(q.w(context, R.color.black_alpha60, q.I(3.0f, 9)));
            if (z10) {
                dataView.setAlpha(0.3f);
            }
            f0.o(dataView, "dataView");
            return dataView;
        }

        @m
        public final void d(@dl.d Context context, @dl.d Dota2MatchDetailObj data, @dl.d s0 binding) {
            Dota2TeamObj dire_team_info;
            List<Dota2BanPickDataObj> dire_pick;
            List<Dota2BanPickDataObj> dire_ban;
            List<Dota2BanPickDataObj> radiant_pick;
            List<Dota2BanPickDataObj> radiant_ban;
            Dota2TeamObj radiant_team_info;
            if (PatchProxy.proxy(new Object[]{context, data, binding}, this, changeQuickRedirect, false, 39171, new Class[]{Context.class, Dota2MatchDetailObj.class, s0.class}, Void.TYPE).isSupported) {
                return;
            }
            f0.p(context, "context");
            f0.p(data, "data");
            f0.p(binding, "binding");
            if (data.getBan_pick() == null) {
                binding.b().setVisibility(8);
                return;
            }
            binding.b().setVisibility(0);
            Dota2BanPickObj ban_pick = data.getBan_pick();
            if (ban_pick != null && (radiant_team_info = ban_pick.getRadiant_team_info()) != null) {
                com.max.hbimage.b.K(radiant_team_info.getLogo(), binding.f131742c);
                binding.f131744e.setText(radiant_team_info.getName());
            }
            Dota2BanPickObj ban_pick2 = data.getBan_pick();
            if (ban_pick2 != null && (radiant_ban = ban_pick2.getRadiant_ban()) != null) {
                a aVar = b.f89090j;
                LinearLayout linearLayout = binding.f131747h;
                f0.o(linearLayout, "binding.vgRadiantBan");
                aVar.f(context, linearLayout, radiant_ban, true);
            }
            Dota2BanPickObj ban_pick3 = data.getBan_pick();
            if (ban_pick3 != null && (radiant_pick = ban_pick3.getRadiant_pick()) != null) {
                a aVar2 = b.f89090j;
                LinearLayout linearLayout2 = binding.f131748i;
                f0.o(linearLayout2, "binding.vgRadiantPick");
                aVar2.f(context, linearLayout2, radiant_pick, false);
            }
            Dota2BanPickObj ban_pick4 = data.getBan_pick();
            if (ban_pick4 != null && (dire_ban = ban_pick4.getDire_ban()) != null) {
                a aVar3 = b.f89090j;
                LinearLayout linearLayout3 = binding.f131745f;
                f0.o(linearLayout3, "binding.vgDireBan");
                aVar3.f(context, linearLayout3, dire_ban, true);
            }
            Dota2BanPickObj ban_pick5 = data.getBan_pick();
            if (ban_pick5 != null && (dire_pick = ban_pick5.getDire_pick()) != null) {
                a aVar4 = b.f89090j;
                LinearLayout linearLayout4 = binding.f131746g;
                f0.o(linearLayout4, "binding.vgDirePick");
                aVar4.f(context, linearLayout4, dire_pick, false);
            }
            Dota2BanPickObj ban_pick6 = data.getBan_pick();
            if (ban_pick6 == null || (dire_team_info = ban_pick6.getDire_team_info()) == null) {
                return;
            }
            com.max.hbimage.b.K(dire_team_info.getLogo(), binding.f131741b);
            binding.f131743d.setText(dire_team_info.getName());
        }

        @dl.d
        @m
        public final Fragment e(@dl.e Dota2MatchDetailObj dota2MatchDetailObj) {
            PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{dota2MatchDetailObj}, this, changeQuickRedirect, false, 39167, new Class[]{Dota2MatchDetailObj.class}, Fragment.class);
            if (patchProxyResultProxy.isSupported) {
                return (Fragment) patchProxyResultProxy.result;
            }
            Bundle bundle = new Bundle();
            bundle.putSerializable(b.f89092l, dota2MatchDetailObj);
            b bVar = new b();
            bVar.setArguments(bundle);
            return bVar;
        }

        @m
        public final void f(@dl.d Context context, @dl.d LinearLayout llContainer, @dl.d List<Dota2BanPickDataObj> list, boolean z10) {
            if (PatchProxy.proxy(new Object[]{context, llContainer, list, new Byte(z10 ? (byte) 1 : (byte) 0)}, this, changeQuickRedirect, false, 39172, new Class[]{Context.class, LinearLayout.class, List.class, Boolean.TYPE}, Void.TYPE).isSupported) {
                return;
            }
            f0.p(context, "context");
            f0.p(llContainer, "llContainer");
            f0.p(list, "list");
            llContainer.removeAllViews();
            Iterator<Dota2BanPickDataObj> it = list.iterator();
            while (it.hasNext()) {
                llContainer.addView(b(context, it.next(), z10));
            }
        }

        @m
        public final void i(@dl.d Context context, @dl.d Dota2MatchDetailObj data, @dl.d ImageView ivHeader, @dl.d ViewGroup vgTop, @dl.d ViewGroup vgContent, @dl.d ViewGroup root, boolean z10) {
            Overlaymatch match_rank_change;
            Overlaymatch match_rank_change2;
            if (PatchProxy.proxy(new Object[]{context, data, ivHeader, vgTop, vgContent, root, new Byte(z10 ? (byte) 1 : (byte) 0)}, this, changeQuickRedirect, false, 39168, new Class[]{Context.class, Dota2MatchDetailObj.class, ImageView.class, ViewGroup.class, ViewGroup.class, ViewGroup.class, Boolean.TYPE}, Void.TYPE).isSupported) {
                return;
            }
            f0.p(context, "context");
            f0.p(data, "data");
            f0.p(ivHeader, "ivHeader");
            f0.p(vgTop, "vgTop");
            f0.p(vgContent, "vgContent");
            f0.p(root, "root");
            if (f0.g(data.getParty_name(), "天辉")) {
                ivHeader.setBackgroundResource(R.drawable.game_dota2_tianhui_bg_375x171);
            } else {
                ivHeader.setBackgroundResource(R.drawable.game_dota2_yeyan_bg_375x171);
            }
            View viewFindViewById = vgTop.findViewById(R.id.iv_dan_icon);
            f0.o(viewFindViewById, "vgTop.findViewById(R.id.iv_dan_icon)");
            ImageView imageView = (ImageView) viewFindViewById;
            View viewFindViewById2 = vgTop.findViewById(R.id.tv_team);
            f0.o(viewFindViewById2, "vgTop.findViewById(R.id.tv_team)");
            TextView textView = (TextView) viewFindViewById2;
            View viewFindViewById3 = vgTop.findViewById(R.id.tv_result);
            f0.o(viewFindViewById3, "vgTop.findViewById(R.id.tv_result)");
            TextView textView2 = (TextView) viewFindViewById3;
            View viewFindViewById4 = vgTop.findViewById(R.id.vg_rank);
            f0.o(viewFindViewById4, "vgTop.findViewById(R.id.vg_rank)");
            View viewFindViewById5 = vgTop.findViewById(R.id.tv_rank);
            f0.o(viewFindViewById5, "vgTop.findViewById(R.id.tv_rank)");
            TextView textView3 = (TextView) viewFindViewById5;
            View viewFindViewById6 = vgTop.findViewById(R.id.tv_delta);
            f0.o(viewFindViewById6, "vgTop.findViewById(R.id.tv_delta)");
            TextView textView4 = (TextView) viewFindViewById6;
            View viewFindViewById7 = vgTop.findViewById(R.id.tv_server);
            f0.o(viewFindViewById7, "vgTop.findViewById(R.id.tv_server)");
            TextView textView5 = (TextView) viewFindViewById7;
            View viewFindViewById8 = vgTop.findViewById(R.id.tv_module_name);
            f0.o(viewFindViewById8, "vgTop.findViewById(R.id.tv_module_name)");
            TextView textView6 = (TextView) viewFindViewById8;
            View viewFindViewById9 = vgTop.findViewById(R.id.tv_match_id);
            f0.o(viewFindViewById9, "vgTop.findViewById(R.id.tv_match_id)");
            TextView textView7 = (TextView) viewFindViewById9;
            View viewFindViewById10 = vgTop.findViewById(R.id.tv_date);
            f0.o(viewFindViewById10, "vgTop.findViewById(R.id.tv_date)");
            TextView textView8 = (TextView) viewFindViewById10;
            View viewFindViewById11 = vgTop.findViewById(R.id.tv_duration);
            f0.o(viewFindViewById11, "vgTop.findViewById(R.id.tv_duration)");
            TextView textView9 = (TextView) viewFindViewById11;
            View viewFindViewById12 = vgContent.findViewById(R.id.v_match_title_tianhui);
            f0.o(viewFindViewById12, "vgContent.findViewById(R.id.v_match_title_tianhui)");
            Dota2MatchTitleView dota2MatchTitleView = (Dota2MatchTitleView) viewFindViewById12;
            View viewFindViewById13 = vgContent.findViewById(R.id.rv_tianhui);
            f0.o(viewFindViewById13, "vgContent.findViewById(R.id.rv_tianhui)");
            RecyclerView recyclerView = (RecyclerView) viewFindViewById13;
            View viewFindViewById14 = vgContent.findViewById(R.id.v_match_title_yeyan);
            f0.o(viewFindViewById14, "vgContent.findViewById(R.id.v_match_title_yeyan)");
            Dota2MatchTitleView dota2MatchTitleView2 = (Dota2MatchTitleView) viewFindViewById14;
            View viewFindViewById15 = vgContent.findViewById(R.id.rv_yeyan);
            f0.o(viewFindViewById15, "vgContent.findViewById(R.id.rv_yeyan)");
            RecyclerView recyclerView2 = (RecyclerView) viewFindViewById15;
            MatchInfoObj match_info = data.getMatch_info();
            com.max.hbimage.b.K(match_info != null ? match_info.getDan_icon() : null, imageView);
            textView.setText(data.getParty_name());
            MatchInfoObj match_info2 = data.getMatch_info();
            textView2.setText(com.max.hbcommon.utils.c.x(match_info2 != null ? match_info2.getWin() : null) ? "胜利" : "失败");
            MatchInfoObj match_info3 = data.getMatch_info();
            if ((match_info3 != null ? match_info3.getMatch_rank_change() : null) != null) {
                int delta = 0;
                viewFindViewById4.setVisibility(0);
                textView4.setTypeface(bb.d.a().b(0));
                MatchInfoObj match_info4 = data.getMatch_info();
                if (match_info4 != null && (match_rank_change2 = match_info4.getMatch_rank_change()) != null) {
                    delta = match_rank_change2.getDelta();
                }
                MatchInfoObj match_info5 = data.getMatch_info();
                textView3.setText(String.valueOf((match_info5 == null || (match_rank_change = match_info5.getMatch_rank_change()) == null) ? null : Integer.valueOf(match_rank_change.getRank())));
                if (delta >= 0) {
                    textView4.setTextColor(com.max.xiaoheihe.utils.d.E(R.color.dota2_tianhui));
                    StringBuilder sb2 = new StringBuilder();
                    sb2.append((char) 61656);
                    sb2.append(delta);
                    textView4.setText(sb2.toString());
                } else {
                    textView4.setTextColor(com.max.xiaoheihe.utils.d.E(R.color.dota2_yemo));
                    StringBuilder sb3 = new StringBuilder();
                    sb3.append((char) 61655);
                    sb3.append(-delta);
                    textView4.setText(sb3.toString());
                }
            } else {
                viewFindViewById4.setVisibility(8);
            }
            textView5.setText(data.getServer());
            MatchInfoObj match_info6 = data.getMatch_info();
            textView6.setText(match_info6 != null ? match_info6.getMode_desc() : null);
            MatchInfoObj match_info7 = data.getMatch_info();
            textView7.setText(match_info7 != null ? match_info7.getMatch_id() : null);
            MatchInfoObj match_info8 = data.getMatch_info();
            textView8.setText(match_info8 != null ? match_info8.getFinish_desc() : null);
            MatchInfoObj match_info9 = data.getMatch_info();
            textView9.setText(match_info9 != null ? match_info9.getDuration() : null);
            h(context, data, data.getRadiant(), dota2MatchTitleView, recyclerView, root, true, z10);
            h(context, data, data.getDire(), dota2MatchTitleView2, recyclerView2, root, false, z10);
        }
    }

    /* JADX INFO: renamed from: com.max.xiaoheihe.module.littleprogram.fragment.dota2.b$b, reason: collision with other inner class name */
    /* JADX INFO: compiled from: Dota2MatchDetailContentFragment.kt */
    public interface InterfaceC0813b {
        void I2();
    }

    /* JADX INFO: compiled from: Dota2MatchDetailContentFragment.kt */
    public static final class c implements SegmentFilterView.a {
        public static ChangeQuickRedirect changeQuickRedirect;

        c() {
        }

        @Override // com.max.hbcommon.component.segmentfilters.SegmentFilterView.a
        public void a(@dl.d KeyDescObj key, int i10) {
            Dota2DataTeamAdapter.Type type;
            if (PatchProxy.proxy(new Object[]{key, new Integer(i10)}, this, changeQuickRedirect, false, 39189, new Class[]{KeyDescObj.class, Integer.TYPE}, Void.TYPE).isSupported) {
                return;
            }
            f0.p(key, "key");
            b.this.f89094c = i10;
            if (b.this.f89094c == 3) {
                b.this.a4().f112083y.setVisibility(8);
                b.this.a4().f112082x.setVisibility(0);
                return;
            }
            b.this.a4().f112083y.setVisibility(0);
            b.this.a4().f112082x.setVisibility(8);
            b.this.a4().f112066h.setVisibility(8);
            Dota2DataTeamAdapter dota2DataTeamAdapter = b.this.f89096e;
            if (dota2DataTeamAdapter != null) {
                int i11 = b.this.f89094c;
                if (i11 == 1) {
                    type = Dota2DataTeamAdapter.Type.Fight;
                } else if (i11 != 2) {
                    type = Dota2DataTeamAdapter.Type.Damage;
                } else {
                    b.this.a4().f112066h.setVisibility(0);
                    type = Dota2DataTeamAdapter.Type.Rate;
                }
                dota2DataTeamAdapter.u(type);
            }
        }
    }

    /* JADX INFO: compiled from: Dota2MatchDetailContentFragment.kt */
    public static final class d implements SegmentFilterView.a {
        public static ChangeQuickRedirect changeQuickRedirect;

        d() {
        }

        @Override // com.max.hbcommon.component.segmentfilters.SegmentFilterView.a
        public void a(@dl.d KeyDescObj key, int i10) {
            if (PatchProxy.proxy(new Object[]{key, new Integer(i10)}, this, changeQuickRedirect, false, 39190, new Class[]{KeyDescObj.class, Integer.TYPE}, Void.TYPE).isSupported) {
                return;
            }
            f0.p(key, "key");
            if (i10 == 0) {
                b.this.a4().f112065g.setText("个人经济");
                b.this.a4().f112067i.setChartType(Dota2MatchDetailChart.Type.Gold);
            } else {
                b.this.a4().f112065g.setText("个人等级");
                b.this.a4().f112067i.setChartType(Dota2MatchDetailChart.Type.Exp);
            }
        }
    }

    /* JADX INFO: compiled from: Dota2MatchDetailContentFragment.kt */
    public static final class e implements IAxisValueFormatter {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final e f89123a = new e();
        public static ChangeQuickRedirect changeQuickRedirect;

        e() {
        }

        @Override // com.github.mikephil.charting.formatter.IAxisValueFormatter
        public final String getFormattedValue(float f10, AxisBase axisBase) {
            PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{new Float(f10), axisBase}, this, changeQuickRedirect, false, 39191, new Class[]{Float.TYPE, AxisBase.class}, String.class);
            if (patchProxyResultProxy.isSupported) {
                return (String) patchProxyResultProxy.result;
            }
            return new DecimalFormat("#,###").format(Integer.valueOf(((int) f10) / 1000)) + 'k';
        }
    }

    /* JADX INFO: compiled from: Dota2MatchDetailContentFragment.kt */
    public static final class f implements IAxisValueFormatter {
        public static ChangeQuickRedirect changeQuickRedirect;

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ List<Dota2ChartObj> f89124a;

        f(List<Dota2ChartObj> list) {
            this.f89124a = list;
        }

        @Override // com.github.mikephil.charting.formatter.IAxisValueFormatter
        public final String getFormattedValue(float f10, AxisBase axisBase) {
            PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{new Float(f10), axisBase}, this, changeQuickRedirect, false, 39192, new Class[]{Float.TYPE, AxisBase.class}, String.class);
            if (patchProxyResultProxy.isSupported) {
                return (String) patchProxyResultProxy.result;
            }
            try {
                return String.valueOf(n.q(this.f89124a.get((int) f10).getTime()) / 60);
            } catch (Throwable unused) {
                return "";
            }
        }
    }

    /* JADX INFO: compiled from: Dota2MatchDetailContentFragment.kt */
    public static final class g implements IValueFormatter {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final g f89125a = new g();
        public static ChangeQuickRedirect changeQuickRedirect;

        g() {
        }

        @Override // com.github.mikephil.charting.formatter.IValueFormatter
        public final String getFormattedValue(float f10, Entry entry, int i10, ViewPortHandler viewPortHandler) {
            return null;
        }
    }

    /* JADX INFO: compiled from: Dota2MatchDetailContentFragment.kt */
    @t0({"SMAP\nDota2MatchDetailContentFragment.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Dota2MatchDetailContentFragment.kt\ncom/max/xiaoheihe/module/littleprogram/fragment/dota2/Dota2MatchDetailContentFragment$initPlayerSelector$1\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 3 View.kt\nandroidx/core/view/ViewKt\n*L\n1#1,1166:1\n1#2:1167\n260#3:1168\n*S KotlinDebug\n*F\n+ 1 Dota2MatchDetailContentFragment.kt\ncom/max/xiaoheihe/module/littleprogram/fragment/dota2/Dota2MatchDetailContentFragment$initPlayerSelector$1\n*L\n1123#1:1168\n*E\n"})
    public static final class h implements View.OnClickListener {
        public static ChangeQuickRedirect changeQuickRedirect;

        h() {
        }

        @Override // android.view.View.OnClickListener
        public final void onClick(View view) {
            if (PatchProxy.proxy(new Object[]{view}, this, changeQuickRedirect, false, 39193, new Class[]{View.class}, Void.TYPE).isSupported) {
                return;
            }
            ConsecutiveScrollerLayout consecutiveScrollerLayoutB = b.this.a4().b();
            AutoTransition autoTransition = new AutoTransition();
            autoTransition.w0(200L);
            v.b(consecutiveScrollerLayoutB, autoTransition);
            RecyclerView recyclerView = b.this.a4().f112062d;
            f0.o(recyclerView, "binding.rvPlayerSelector");
            if (recyclerView.getVisibility() == 0) {
                b.this.a4().f112062d.setVisibility(8);
                return;
            }
            b.this.f89099h = true;
            b.this.a4().f112062d.setVisibility(0);
            b.R3(b.this);
        }
    }

    /* JADX INFO: compiled from: Dota2MatchDetailContentFragment.kt */
    @t0({"SMAP\nDota2MatchDetailContentFragment.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Dota2MatchDetailContentFragment.kt\ncom/max/xiaoheihe/module/littleprogram/fragment/dota2/Dota2MatchDetailContentFragment$initPlayerSelector$2\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 3 View.kt\nandroidx/core/view/ViewKt\n*L\n1#1,1166:1\n1#2:1167\n260#3:1168\n*S KotlinDebug\n*F\n+ 1 Dota2MatchDetailContentFragment.kt\ncom/max/xiaoheihe/module/littleprogram/fragment/dota2/Dota2MatchDetailContentFragment$initPlayerSelector$2\n*L\n1140#1:1168\n*E\n"})
    public static final class i implements View.OnClickListener {
        public static ChangeQuickRedirect changeQuickRedirect;

        i() {
        }

        @Override // android.view.View.OnClickListener
        public final void onClick(View view) {
            if (PatchProxy.proxy(new Object[]{view}, this, changeQuickRedirect, false, 39194, new Class[]{View.class}, Void.TYPE).isSupported) {
                return;
            }
            ConsecutiveScrollerLayout consecutiveScrollerLayoutB = b.this.a4().b();
            AutoTransition autoTransition = new AutoTransition();
            autoTransition.w0(200L);
            v.b(consecutiveScrollerLayoutB, autoTransition);
            RecyclerView recyclerView = b.this.a4().f112062d;
            f0.o(recyclerView, "binding.rvPlayerSelector");
            if (recyclerView.getVisibility() == 0) {
                b.this.a4().f112062d.setVisibility(8);
                return;
            }
            b.this.f89099h = false;
            b.this.a4().f112062d.setVisibility(0);
            b.R3(b.this);
        }
    }

    /* JADX INFO: compiled from: Dota2MatchDetailContentFragment.kt */
    public static final class j extends s<Dota2PlayerObj> {
        public static ChangeQuickRedirect changeQuickRedirect;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ int f89128b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ b f89129c;

        /* JADX INFO: compiled from: Dota2MatchDetailContentFragment.kt */
        @t0({"SMAP\nDota2MatchDetailContentFragment.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Dota2MatchDetailContentFragment.kt\ncom/max/xiaoheihe/module/littleprogram/fragment/dota2/Dota2MatchDetailContentFragment$onCreateView$2$onBindViewHolder$1$1$1\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,1166:1\n1#2:1167\n*E\n"})
        public static final class a implements View.OnClickListener {
            public static ChangeQuickRedirect changeQuickRedirect;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            final /* synthetic */ b f89130b;

            /* JADX INFO: renamed from: c, reason: collision with root package name */
            final /* synthetic */ int f89131c;

            a(b bVar, int i10) {
                this.f89130b = bVar;
                this.f89131c = i10;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                if (PatchProxy.proxy(new Object[]{view}, this, changeQuickRedirect, false, 39197, new Class[]{View.class}, Void.TYPE).isSupported) {
                    return;
                }
                if (this.f89130b.f89099h) {
                    this.f89130b.f89097f = this.f89131c;
                } else {
                    this.f89130b.f89098g = this.f89131c;
                }
                b.P3(this.f89130b);
                ConsecutiveScrollerLayout consecutiveScrollerLayoutB = this.f89130b.a4().b();
                AutoTransition autoTransition = new AutoTransition();
                autoTransition.w0(200L);
                v.b(consecutiveScrollerLayoutB, autoTransition);
                this.f89130b.a4().f112062d.setVisibility(8);
                b.S3(this.f89130b);
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        j(int i10, b bVar, Context context, ArrayList<Dota2PlayerObj> arrayList) {
            super(context, arrayList, R.layout.item_dota2_player_selector);
            this.f89128b = i10;
            this.f89129c = bVar;
        }

        public void m(@dl.e s.e eVar, @dl.e Dota2PlayerObj dota2PlayerObj) {
            if (PatchProxy.proxy(new Object[]{eVar, dota2PlayerObj}, this, changeQuickRedirect, false, 39195, new Class[]{s.e.class, Dota2PlayerObj.class}, Void.TYPE).isSupported || eVar == null) {
                return;
            }
            int i10 = this.f89128b;
            b bVar = this.f89129c;
            if (dota2PlayerObj != null) {
                ImageView imageView = (ImageView) eVar.i(R.id.iv_icon);
                ViewGroup.LayoutParams layoutParams = imageView.getLayoutParams();
                layoutParams.width = i10;
                layoutParams.height = (i10 * 26) / 46;
                imageView.setLayoutParams(layoutParams);
                Dota2HeroObj hero_info = dota2PlayerObj.getHero_info();
                com.max.hbimage.b.K(hero_info != null ? hero_info.getHero_image() : null, imageView);
                int absoluteAdapterPosition = eVar.getAbsoluteAdapterPosition();
                if (!(bVar.f89099h && absoluteAdapterPosition == bVar.f89097f) && (bVar.f89099h || absoluteAdapterPosition != bVar.f89098g)) {
                    imageView.setAlpha(0.3f);
                } else {
                    imageView.setAlpha(1.0f);
                }
                imageView.setOnClickListener(new a(bVar, absoluteAdapterPosition));
            }
        }

        @Override // com.max.hbcommon.base.adapter.s
        public /* bridge */ /* synthetic */ void onBindViewHolder(s.e eVar, Dota2PlayerObj dota2PlayerObj) {
            if (PatchProxy.proxy(new Object[]{eVar, dota2PlayerObj}, this, changeQuickRedirect, false, 39196, new Class[]{s.e.class, Object.class}, Void.TYPE).isSupported) {
                return;
            }
            m(eVar, dota2PlayerObj);
        }
    }

    /* JADX INFO: compiled from: Dota2MatchDetailContentFragment.kt */
    public static final class k implements View.OnClickListener {
        public static ChangeQuickRedirect changeQuickRedirect;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ Dota2MatchDetailObj f89133c;

        k(Dota2MatchDetailObj dota2MatchDetailObj) {
            this.f89133c = dota2MatchDetailObj;
        }

        @Override // android.view.View.OnClickListener
        public final void onClick(View view) {
            if (PatchProxy.proxy(new Object[]{view}, this, changeQuickRedirect, false, 39198, new Class[]{View.class}, Void.TYPE).isSupported) {
                return;
            }
            Context context = b.this.getContext();
            MatchInfoObj match_info = this.f89133c.getMatch_info();
            com.max.xiaoheihe.utils.d.o(context, match_info != null ? match_info.getMatch_id() : null);
            com.max.hbutils.utils.c.f(com.max.xiaoheihe.utils.d.n0(R.string.text_copied));
        }
    }

    public static final /* synthetic */ void P3(b bVar) {
        if (PatchProxy.proxy(new Object[]{bVar}, null, changeQuickRedirect, true, 39164, new Class[]{b.class}, Void.TYPE).isSupported) {
            return;
        }
        bVar.g4();
    }

    public static final /* synthetic */ void R3(b bVar) {
        if (PatchProxy.proxy(new Object[]{bVar}, null, changeQuickRedirect, true, 39166, new Class[]{b.class}, Void.TYPE).isSupported) {
            return;
        }
        bVar.i4();
    }

    public static final /* synthetic */ void S3(b bVar) {
        if (PatchProxy.proxy(new Object[]{bVar}, null, changeQuickRedirect, true, 39165, new Class[]{b.class}, Void.TYPE).isSupported) {
            return;
        }
        bVar.l4();
    }

    private final void X3() {
        if (PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 39154, new Class[0], Void.TYPE).isSupported) {
            return;
        }
        ArrayList arrayList = new ArrayList();
        KeyDescObj keyDescObj = new KeyDescObj();
        keyDescObj.setDesc("输出");
        keyDescObj.setKey("0");
        keyDescObj.setChecked(this.f89094c == 0);
        arrayList.add(keyDescObj);
        KeyDescObj keyDescObj2 = new KeyDescObj();
        keyDescObj2.setDesc("参团");
        keyDescObj2.setKey("1");
        keyDescObj2.setChecked(this.f89094c == 1);
        arrayList.add(keyDescObj2);
        KeyDescObj keyDescObj3 = new KeyDescObj();
        keyDescObj3.setDesc("输出经济比");
        keyDescObj3.setKey("2");
        keyDescObj3.setChecked(this.f89094c == 2);
        arrayList.add(keyDescObj3);
        if (!com.max.hbcommon.utils.c.w(this.f89095d.get(0).getRadar_data_list())) {
            KeyDescObj keyDescObj4 = new KeyDescObj();
            keyDescObj4.setDesc("雷达图");
            keyDescObj4.setKey("3");
            keyDescObj4.setChecked(this.f89094c == 3);
            arrayList.add(keyDescObj4);
        }
        a4().f112069k.setLittleWhiteStyle();
        a4().f112069k.setMOnTabCheckedListener(new c());
        a4().f112069k.setData(arrayList);
        a4().f112069k.d();
    }

    private final void Y3() {
        if (PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 39153, new Class[0], Void.TYPE).isSupported) {
            return;
        }
        ArrayList arrayList = new ArrayList();
        KeyDescObj keyDescObj = new KeyDescObj();
        keyDescObj.setDesc("经济");
        keyDescObj.setKey("0");
        keyDescObj.setChecked(a4().f112067i.getChartType() == Dota2MatchDetailChart.Type.Gold);
        arrayList.add(keyDescObj);
        KeyDescObj keyDescObj2 = new KeyDescObj();
        keyDescObj2.setDesc("经验");
        keyDescObj2.setKey("1");
        keyDescObj2.setChecked(a4().f112067i.getChartType() == Dota2MatchDetailChart.Type.Exp);
        arrayList.add(keyDescObj2);
        a4().f112070l.setLittleWhiteStyle();
        a4().f112070l.setMOnTabCheckedListener(new d());
        a4().f112070l.setData(arrayList);
        a4().f112070l.d();
    }

    @dl.d
    @m
    public static final View Z3(@dl.d Context context, @dl.d Dota2BanPickDataObj dota2BanPickDataObj, boolean z10) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{context, dota2BanPickDataObj, new Byte(z10 ? (byte) 1 : (byte) 0)}, null, changeQuickRedirect, true, 39163, new Class[]{Context.class, Dota2BanPickDataObj.class, Boolean.TYPE}, View.class);
        return patchProxyResultProxy.isSupported ? (View) patchProxyResultProxy.result : f89090j.b(context, dota2BanPickDataObj, z10);
    }

    @m
    public static final void c4(@dl.d Context context, @dl.d Dota2MatchDetailObj dota2MatchDetailObj, @dl.d s0 s0Var) {
        if (PatchProxy.proxy(new Object[]{context, dota2MatchDetailObj, s0Var}, null, changeQuickRedirect, true, 39161, new Class[]{Context.class, Dota2MatchDetailObj.class, s0.class}, Void.TYPE).isSupported) {
            return;
        }
        f89090j.d(context, dota2MatchDetailObj, s0Var);
    }

    private final void d4() {
        if (PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 39148, new Class[0], Void.TYPE).isSupported) {
            return;
        }
        a4().f112077s.setBackground(ViewUtils.G(ViewUtils.o(getContext(), a4().f112077s), com.max.xiaoheihe.utils.d.F(getContext(), R.color.white_alpha2)));
        a4().f112078t.setBackground(q.s(getContext(), R.color.white_alpha3, 8.0f));
    }

    /* JADX WARN: Multi-variable type inference failed */
    private final void e4(Dota2MatchDetailObj dota2MatchDetailObj) {
        if (PatchProxy.proxy(new Object[]{dota2MatchDetailObj}, this, changeQuickRedirect, false, 39152, new Class[]{Dota2MatchDetailObj.class}, Void.TYPE).isSupported) {
            return;
        }
        List[] listArr = new List[1];
        Dota2TeamSumObj radiant_sum = dota2MatchDetailObj.getRadiant_sum();
        listArr[0] = radiant_sum != null ? radiant_sum.getGraph_gold() : null;
        if (com.max.hbcommon.utils.c.w(listArr)) {
            List[] listArr2 = new List[1];
            Dota2TeamSumObj dire_sum = dota2MatchDetailObj.getDire_sum();
            listArr2[0] = dire_sum != null ? dire_sum.getGraph_gold() : null;
            if (com.max.hbcommon.utils.c.w(listArr2)) {
                a4().f112060b.setVisibility(8);
                return;
            }
        }
        a4().f112060b.setVisibility(0);
        Dota2MatchDetailChart.a aVar = Dota2MatchDetailChart.f87131j;
        Context context = getContext();
        f0.m(context);
        LineChart lineChart = a4().f112060b;
        f0.o(lineChart, "binding.chartGold");
        aVar.a(context, lineChart);
        com.max.hbcommon.component.chart.k kVar = new com.max.hbcommon.component.chart.k(a4().f112060b, a4().f112060b.getAnimator(), a4().f112060b.getViewPortHandler());
        kVar.j(0.0f, com.max.xiaoheihe.utils.d.E(R.color.dota2_tianhui), com.max.xiaoheihe.utils.d.E(R.color.dota2_yemo));
        a4().f112060b.setRenderer(kVar);
        a4().f112060b.getAxisLeft().setValueFormatter(e.f89123a);
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = new ArrayList();
        Dota2TeamSumObj radiant_sum2 = dota2MatchDetailObj.getRadiant_sum();
        List<Dota2ChartObj> graph_gold = radiant_sum2 != null ? radiant_sum2.getGraph_gold() : null;
        f0.m(graph_gold);
        Dota2TeamSumObj dire_sum2 = dota2MatchDetailObj.getDire_sum();
        List<Dota2ChartObj> graph_gold2 = dire_sum2 != null ? dire_sum2.getGraph_gold() : null;
        f0.m(graph_gold2);
        int size = graph_gold.size();
        for (int i10 = 0; i10 < size; i10++) {
            Dota2ChartObj dota2ChartObj = new Dota2ChartObj(graph_gold.get(i10).getTime(), String.valueOf(n.q(graph_gold.get(i10).getValue()) - n.q(graph_gold2.get(i10).getValue())), null, null);
            arrayList.add(dota2ChartObj);
            arrayList2.add(new Entry(i10, n.p(dota2ChartObj.getValue()), dota2ChartObj));
        }
        a4().f112060b.clear();
        XAxis xAxis = a4().f112060b.getXAxis();
        f0.o(xAxis, "binding.chartGold.getXAxis()");
        try {
            xAxis.setLabelCount(((n.q(graph_gold2.get(CollectionsKt__CollectionsKt.G(graph_gold2)).getTime()) / 60) + 4) / 5, true);
        } catch (Throwable th2) {
            Log.e("setLabelCount", String.valueOf(th2.getMessage()));
        }
        xAxis.setValueFormatter(new f(graph_gold));
        LineDataSet lineDataSet = new LineDataSet(arrayList2, "");
        lineDataSet.setLineWidth(1.0f);
        lineDataSet.setDrawCircles(false);
        lineDataSet.setHighLightColor(com.max.xiaoheihe.utils.d.E(R.color.white_alpha5));
        lineDataSet.setHighlightLineWidth(5.0f);
        lineDataSet.setDrawValues(false);
        lineDataSet.setDrawHorizontalHighlightIndicator(false);
        lineDataSet.setDrawVerticalHighlightIndicator(true);
        lineDataSet.setMode(LineDataSet.Mode.CUBIC_BEZIER);
        lineDataSet.setDrawFilled(true);
        lineDataSet.setValueFormatter(g.f89125a);
        LineData lineData = (LineData) a4().f112060b.getData();
        if (lineData == null) {
            lineData = new LineData();
        }
        lineData.addDataSet(lineDataSet);
        a4().f112060b.setData(lineData);
        Context context2 = getContext();
        f0.m(context2);
        Dota2GoldDataMarkerView dota2GoldDataMarkerView = new Dota2GoldDataMarkerView(context2, arrayList);
        dota2GoldDataMarkerView.setChartView(a4().f112060b);
        a4().f112060b.setMarker(dota2GoldDataMarkerView);
        a4().f112060b.invalidate();
    }

    private final void f4(Dota2MatchDetailObj dota2MatchDetailObj) {
        Dota2DataTeamAdapter.Type type;
        if (PatchProxy.proxy(new Object[]{dota2MatchDetailObj}, this, changeQuickRedirect, false, 39155, new Class[]{Dota2MatchDetailObj.class}, Void.TYPE).isSupported) {
            return;
        }
        a4().f112080v.setBackground(q.i(getContext(), R.color.white_alpha2, R.color.white_alpha5, 0.5f, 8.0f));
        this.f89095d.clear();
        List[] listArr = new List[1];
        MatchSizeObj radiant = dota2MatchDetailObj.getRadiant();
        listArr[0] = radiant != null ? radiant.getPlayer_list() : null;
        if (!com.max.hbcommon.utils.c.w(listArr)) {
            ArrayList<Dota2PlayerObj> arrayList = this.f89095d;
            MatchSizeObj radiant2 = dota2MatchDetailObj.getRadiant();
            f0.m(radiant2);
            List<Dota2PlayerObj> player_list = radiant2.getPlayer_list();
            f0.m(player_list);
            arrayList.addAll(player_list);
        }
        List[] listArr2 = new List[1];
        MatchSizeObj dire = dota2MatchDetailObj.getDire();
        listArr2[0] = dire != null ? dire.getPlayer_list() : null;
        if (!com.max.hbcommon.utils.c.w(listArr2)) {
            ArrayList<Dota2PlayerObj> arrayList2 = this.f89095d;
            MatchSizeObj dire2 = dota2MatchDetailObj.getDire();
            f0.m(dire2);
            List<Dota2PlayerObj> player_list2 = dire2.getPlayer_list();
            f0.m(player_list2);
            arrayList2.addAll(player_list2);
        }
        Dota2DataTeamAdapter dota2DataTeamAdapter = this.f89096e;
        if (dota2DataTeamAdapter != null) {
            int i10 = this.f89094c;
            if (i10 != 1) {
                type = i10 != 2 ? Dota2DataTeamAdapter.Type.Damage : Dota2DataTeamAdapter.Type.Rate;
            } else {
                type = Dota2DataTeamAdapter.Type.Fight;
            }
            dota2DataTeamAdapter.u(type);
        }
        Dota2DataTeamAdapter dota2DataTeamAdapter2 = this.f89096e;
        if (dota2DataTeamAdapter2 != null) {
            dota2DataTeamAdapter2.notifyDataSetChanged();
        }
    }

    private final void g4() {
        if (PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 39156, new Class[0], Void.TYPE).isSupported) {
            return;
        }
        Dota2PlayerObj dota2PlayerObj = this.f89095d.get(this.f89097f);
        f0.o(dota2PlayerObj, "dataList[selector1]");
        Dota2PlayerObj dota2PlayerObj2 = dota2PlayerObj;
        Dota2PlayerObj dota2PlayerObj3 = this.f89095d.get(this.f89098g);
        f0.o(dota2PlayerObj3, "dataList[selector2]");
        Dota2PlayerObj dota2PlayerObj4 = dota2PlayerObj3;
        Dota2PlayerSelectorView dota2PlayerSelectorView = a4().f112073o;
        String name = dota2PlayerObj2.getName();
        Dota2HeroObj hero_info = dota2PlayerObj2.getHero_info();
        dota2PlayerSelectorView.setData(name, hero_info != null ? hero_info.getHero_image() : null, com.max.xiaoheihe.utils.d.E(R.color.dota2_tianhui));
        a4().f112073o.setOnClickListener(new h());
        Dota2PlayerSelectorView dota2PlayerSelectorView2 = a4().f112074p;
        String name2 = dota2PlayerObj4.getName();
        Dota2HeroObj hero_info2 = dota2PlayerObj4.getHero_info();
        dota2PlayerSelectorView2.setData(name2, hero_info2 != null ? hero_info2.getHero_image() : null, com.max.xiaoheihe.utils.d.E(R.color.dota2_yellow));
        a4().f112074p.setOnClickListener(new i());
    }

    @dl.d
    @m
    public static final Fragment h4(@dl.e Dota2MatchDetailObj dota2MatchDetailObj) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{dota2MatchDetailObj}, null, changeQuickRedirect, true, 39158, new Class[]{Dota2MatchDetailObj.class}, Fragment.class);
        return patchProxyResultProxy.isSupported ? (Fragment) patchProxyResultProxy.result : f89090j.e(dota2MatchDetailObj);
    }

    private final void i4() {
        if (PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 39157, new Class[0], Void.TYPE).isSupported) {
            return;
        }
        int size = this.f89095d.size();
        for (int i10 = 0; i10 < size; i10++) {
            RecyclerView.Adapter adapter = a4().f112062d.getAdapter();
            if (adapter != null) {
                adapter.notifyItemChanged(i10);
            }
        }
    }

    @m
    public static final void j4(@dl.d Context context, @dl.d LinearLayout linearLayout, @dl.d List<Dota2BanPickDataObj> list, boolean z10) {
        if (PatchProxy.proxy(new Object[]{context, linearLayout, list, new Byte(z10 ? (byte) 1 : (byte) 0)}, null, changeQuickRedirect, true, 39162, new Class[]{Context.class, LinearLayout.class, List.class, Boolean.TYPE}, Void.TYPE).isSupported) {
            return;
        }
        f89090j.f(context, linearLayout, list, z10);
    }

    @m
    private static final void k4(Context context, Dota2MatchDetailObj dota2MatchDetailObj, MatchSizeObj matchSizeObj, Dota2MatchTitleView dota2MatchTitleView, RecyclerView recyclerView, ViewGroup viewGroup, boolean z10, boolean z11) {
        Object[] objArr = {context, dota2MatchDetailObj, matchSizeObj, dota2MatchTitleView, recyclerView, viewGroup, new Byte(z10 ? (byte) 1 : (byte) 0), new Byte(z11 ? (byte) 1 : (byte) 0)};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        Class cls = Boolean.TYPE;
        if (PatchProxy.proxy(objArr, null, changeQuickRedirect2, true, 39160, new Class[]{Context.class, Dota2MatchDetailObj.class, MatchSizeObj.class, Dota2MatchTitleView.class, RecyclerView.class, ViewGroup.class, cls, cls}, Void.TYPE).isSupported) {
            return;
        }
        a.a(f89090j, context, dota2MatchDetailObj, matchSizeObj, dota2MatchTitleView, recyclerView, viewGroup, z10, z11);
    }

    private final void l4() {
        if (PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 39149, new Class[0], Void.TYPE).isSupported) {
            return;
        }
        List<KeyDescObj> radar_data_list = this.f89095d.get(this.f89097f).getRadar_data_list();
        List<KeyDescObj> radar_data_list2 = this.f89095d.get(this.f89098g).getRadar_data_list();
        if (com.max.hbcommon.utils.c.w(radar_data_list) || com.max.hbcommon.utils.c.w(radar_data_list2)) {
            return;
        }
        a4().f112075q.setColors(com.max.xiaoheihe.utils.d.E(R.color.dota2_tianhui), com.max.xiaoheihe.utils.d.E(R.color.dota2_tianhui));
        a4().f112075q.setColors2(com.max.xiaoheihe.utils.d.E(R.color.dota2_yellow), com.max.xiaoheihe.utils.d.E(R.color.dota2_yellow));
        a4().f112075q.setMax_value(100.0f);
        a4().f112075q.setMNormalValueColor(com.max.xiaoheihe.utils.d.F(getContext(), R.color.white_alpha50));
        a4().f112075q.setMDescColor(com.max.xiaoheihe.utils.d.F(getContext(), R.color.white_alpha50));
        ArrayList<RadarView.b> arrayList = new ArrayList<>();
        f0.m(radar_data_list);
        for (KeyDescObj keyDescObj : radar_data_list) {
            String desc = keyDescObj.getDesc();
            f0.o(desc, "radarData.desc");
            arrayList.add(new RadarView.b(desc, n.p(keyDescObj.getValue()), true));
        }
        ArrayList<RadarView.b> arrayList2 = new ArrayList<>();
        f0.m(radar_data_list2);
        for (KeyDescObj keyDescObj2 : radar_data_list2) {
            String desc2 = keyDescObj2.getDesc();
            f0.o(desc2, "radarData.desc");
            arrayList2.add(new RadarView.b(desc2, n.p(keyDescObj2.getValue()), true));
        }
        a4().f112075q.setData(arrayList, arrayList2);
    }

    @m
    public static final void m4(@dl.d Context context, @dl.d Dota2MatchDetailObj dota2MatchDetailObj, @dl.d ImageView imageView, @dl.d ViewGroup viewGroup, @dl.d ViewGroup viewGroup2, @dl.d ViewGroup viewGroup3, boolean z10) {
        if (PatchProxy.proxy(new Object[]{context, dota2MatchDetailObj, imageView, viewGroup, viewGroup2, viewGroup3, new Byte(z10 ? (byte) 1 : (byte) 0)}, null, changeQuickRedirect, true, 39159, new Class[]{Context.class, Dota2MatchDetailObj.class, ImageView.class, ViewGroup.class, ViewGroup.class, ViewGroup.class, Boolean.TYPE}, Void.TYPE).isSupported) {
            return;
        }
        f89090j.i(context, dota2MatchDetailObj, imageView, viewGroup, viewGroup2, viewGroup3, z10);
    }

    @dl.d
    public final j8 a4() {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 39145, new Class[0], j8.class);
        if (patchProxyResultProxy.isSupported) {
            return (j8) patchProxyResultProxy.result;
        }
        j8 j8Var = this.f89093b;
        if (j8Var != null) {
            return j8Var;
        }
        f0.S("binding");
        return null;
    }

    @dl.e
    public final InterfaceC0813b b4() {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 39151, new Class[0], InterfaceC0813b.class);
        if (patchProxyResultProxy.isSupported) {
            return (InterfaceC0813b) patchProxyResultProxy.result;
        }
        if (!(getParentFragment() instanceof InterfaceC0813b)) {
            return null;
        }
        androidx.activity.result.b parentFragment = getParentFragment();
        f0.n(parentFragment, "null cannot be cast to non-null type com.max.xiaoheihe.module.littleprogram.fragment.dota2.Dota2MatchDetailContentFragment.OnGetMatchDetail");
        return (InterfaceC0813b) parentFragment;
    }

    @Override // com.max.xiaoheihe.module.littleprogram.fragment.dota2.f
    public void h() {
    }

    public final void n4(@dl.d j8 j8Var) {
        if (PatchProxy.proxy(new Object[]{j8Var}, this, changeQuickRedirect, false, 39146, new Class[]{j8.class}, Void.TYPE).isSupported) {
            return;
        }
        f0.p(j8Var, "<set-?>");
        this.f89093b = j8Var;
    }

    @Override // androidx.fragment.app.Fragment
    @dl.e
    public View onCreateView(@dl.d LayoutInflater inflater, @dl.e ViewGroup viewGroup, @dl.e Bundle bundle) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{inflater, viewGroup, bundle}, this, changeQuickRedirect, false, 39147, new Class[]{LayoutInflater.class, ViewGroup.class, Bundle.class}, View.class);
        if (patchProxyResultProxy.isSupported) {
            return (View) patchProxyResultProxy.result;
        }
        f0.p(inflater, "inflater");
        j8 j8VarC = j8.c(inflater);
        f0.o(j8VarC, "inflate(inflater)");
        n4(j8VarC);
        Bundle arguments = getArguments();
        if (arguments != null) {
            this.f89100i = (Dota2MatchDetailObj) arguments.getSerializable(f89092l);
        }
        d4();
        a4().f112061c.setLayoutManager(new GridLayoutManager(getContext(), 5, 0, false));
        Context context = getContext();
        f0.m(context);
        this.f89096e = new Dota2DataTeamAdapter(context, this.f89095d);
        if (a4().f112061c.getItemDecorationCount() == 0) {
            a4().f112061c.addItemDecoration(new fc.c(5, ViewUtils.f(getContext(), 9.0f), false));
        }
        a4().f112061c.setAdapter(this.f89096e);
        a4().f112062d.setBackground(q.o(getContext(), R.color.white_alpha5, 3.0f));
        a4().f112062d.setLayoutManager(new GridLayoutManager(getContext(), 5));
        a4().f112062d.setAdapter(new j((ViewUtils.L(getContext()) - ViewUtils.f(getContext(), 144.0f)) / 5, this, getContext(), this.f89095d));
        r2(this.f89100i);
        return a4().b();
    }

    /* JADX WARN: Failed to calculate best type for var: r0v26 ??
    jadx.core.utils.exceptions.JadxRuntimeException: Type update failed for variable: r0v26 ??, new type: android.widget.LinearLayout
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:109)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:59)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.calculateFromBounds(TypeInferenceVisitor.java:147)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.setBestType(TypeInferenceVisitor.java:125)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.lambda$runTypePropagation$2(TypeInferenceVisitor.java:103)
    	at java.base/java.util.ArrayList.forEach(ArrayList.java:1511)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.runTypePropagation(TypeInferenceVisitor.java:103)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.visit(TypeInferenceVisitor.java:75)
    Caused by: java.lang.NullPointerException: Cannot invoke "jadx.core.dex.instructions.args.InsnArg.getType()" because "arg" is null
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.verifyType(TypeUpdate.java:210)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.queueTypeUpdate(TypeUpdate.java:171)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.sameFirstArgListener(TypeUpdate.java:454)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.requestUpdate(TypeUpdate.java:310)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.runUpdate(TypeUpdate.java:124)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:91)
    	... 7 more
     */
    /* JADX WARN: Failed to calculate best type for var: r0v28 ??
    jadx.core.utils.exceptions.JadxRuntimeException: Type update failed for variable: r0v28 ??, new type: android.widget.RelativeLayout
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:109)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:59)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.calculateFromBounds(TypeInferenceVisitor.java:147)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.setBestType(TypeInferenceVisitor.java:125)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.lambda$runTypePropagation$2(TypeInferenceVisitor.java:103)
    	at java.base/java.util.ArrayList.forEach(ArrayList.java:1511)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.runTypePropagation(TypeInferenceVisitor.java:103)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.visit(TypeInferenceVisitor.java:75)
    Caused by: java.lang.NullPointerException: Cannot invoke "jadx.core.dex.instructions.args.InsnArg.getType()" because "arg" is null
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.verifyType(TypeUpdate.java:210)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.queueTypeUpdate(TypeUpdate.java:171)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.sameFirstArgListener(TypeUpdate.java:454)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.requestUpdate(TypeUpdate.java:310)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.runUpdate(TypeUpdate.java:124)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:91)
    	... 7 more
     */
    /* JADX WARN: Failed to calculate best type for var: r0v30 ??
    jadx.core.utils.exceptions.JadxRuntimeException: Type update failed for variable: r0v30 ??, new type: android.view.View
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:109)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:59)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.calculateFromBounds(TypeInferenceVisitor.java:147)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.setBestType(TypeInferenceVisitor.java:125)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.lambda$runTypePropagation$2(TypeInferenceVisitor.java:103)
    	at java.base/java.util.ArrayList.forEach(ArrayList.java:1511)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.runTypePropagation(TypeInferenceVisitor.java:103)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.visit(TypeInferenceVisitor.java:75)
    Caused by: java.lang.NullPointerException: Cannot invoke "jadx.core.dex.instructions.args.InsnArg.getType()" because "arg" is null
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.verifyType(TypeUpdate.java:210)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.queueTypeUpdate(TypeUpdate.java:171)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.sameFirstArgListener(TypeUpdate.java:454)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.requestUpdate(TypeUpdate.java:310)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.runUpdate(TypeUpdate.java:124)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:91)
    	... 7 more
     */
    /* JADX WARN: Failed to calculate best type for var: r0v7 ??
    jadx.core.utils.exceptions.JadxRuntimeException: Type update failed for variable: r0v7 ??, new type: android.widget.LinearLayout
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:109)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:59)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.calculateFromBounds(TypeInferenceVisitor.java:147)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.setBestType(TypeInferenceVisitor.java:125)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.lambda$runTypePropagation$2(TypeInferenceVisitor.java:103)
    	at java.base/java.util.ArrayList.forEach(ArrayList.java:1511)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.runTypePropagation(TypeInferenceVisitor.java:103)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.visit(TypeInferenceVisitor.java:75)
    Caused by: java.lang.NullPointerException: Cannot invoke "jadx.core.dex.instructions.args.InsnArg.getType()" because "arg" is null
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.verifyType(TypeUpdate.java:210)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.queueTypeUpdate(TypeUpdate.java:171)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.sameFirstArgListener(TypeUpdate.java:454)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.requestUpdate(TypeUpdate.java:310)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.runUpdate(TypeUpdate.java:124)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:91)
    	... 7 more
     */
    /* JADX WARN: Failed to calculate best type for var: r13v1 ??
    jadx.core.utils.exceptions.JadxRuntimeException: Type update failed for variable: r13v1 ??, new type: int
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:109)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:59)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.calculateFromBounds(FixTypesVisitor.java:159)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.setBestType(FixTypesVisitor.java:136)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.deduceType(FixTypesVisitor.java:241)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryDeduceTypes(FixTypesVisitor.java:224)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
    Caused by: java.lang.NullPointerException: Cannot invoke "jadx.core.dex.instructions.args.InsnArg.getType()" because "arg" is null
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.verifyType(TypeUpdate.java:210)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.queueTypeUpdate(TypeUpdate.java:171)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.sameFirstArgListener(TypeUpdate.java:454)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.requestUpdate(TypeUpdate.java:310)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.runUpdate(TypeUpdate.java:124)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:91)
    	... 6 more
     */
    /* JADX WARN: Failed to calculate best type for var: r13v1 ??
    jadx.core.utils.exceptions.JadxRuntimeException: Type update failed for variable: r13v1 ??, new type: int
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:109)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:59)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.calculateFromBounds(TypeInferenceVisitor.java:147)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.setBestType(TypeInferenceVisitor.java:125)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.lambda$runTypePropagation$2(TypeInferenceVisitor.java:103)
    	at java.base/java.util.ArrayList.forEach(ArrayList.java:1511)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.runTypePropagation(TypeInferenceVisitor.java:103)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.visit(TypeInferenceVisitor.java:75)
    Caused by: java.lang.NullPointerException: Cannot invoke "jadx.core.dex.instructions.args.InsnArg.getType()" because "arg" is null
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.verifyType(TypeUpdate.java:210)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.queueTypeUpdate(TypeUpdate.java:171)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.sameFirstArgListener(TypeUpdate.java:454)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.requestUpdate(TypeUpdate.java:310)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.runUpdate(TypeUpdate.java:124)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:91)
    	... 7 more
     */
    /* JADX WARN: Failed to calculate best type for var: r13v2 ??
    jadx.core.utils.exceptions.JadxRuntimeException: Type update failed for variable: r13v2 ??, new type: int
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:109)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:59)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.calculateFromBounds(TypeInferenceVisitor.java:147)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.setBestType(TypeInferenceVisitor.java:125)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.lambda$runTypePropagation$2(TypeInferenceVisitor.java:103)
    	at java.base/java.util.ArrayList.forEach(ArrayList.java:1511)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.runTypePropagation(TypeInferenceVisitor.java:103)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.visit(TypeInferenceVisitor.java:75)
    Caused by: java.lang.NullPointerException: Cannot invoke "jadx.core.dex.instructions.args.InsnArg.getType()" because "arg" is null
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.verifyType(TypeUpdate.java:210)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.queueTypeUpdate(TypeUpdate.java:171)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.sameFirstArgListener(TypeUpdate.java:454)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.requestUpdate(TypeUpdate.java:310)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.runUpdate(TypeUpdate.java:124)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:91)
    	... 7 more
     */
    /* JADX WARN: Failed to calculate best type for var: r13v3 ??
    jadx.core.utils.exceptions.JadxRuntimeException: Type update failed for variable: r13v3 ??, new type: int
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:109)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:59)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.calculateFromBounds(TypeInferenceVisitor.java:147)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.setBestType(TypeInferenceVisitor.java:125)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.lambda$runTypePropagation$2(TypeInferenceVisitor.java:103)
    	at java.base/java.util.ArrayList.forEach(ArrayList.java:1511)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.runTypePropagation(TypeInferenceVisitor.java:103)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.visit(TypeInferenceVisitor.java:75)
    Caused by: java.lang.NullPointerException: Cannot invoke "jadx.core.dex.instructions.args.InsnArg.getType()" because "arg" is null
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.verifyType(TypeUpdate.java:210)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.queueTypeUpdate(TypeUpdate.java:171)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.sameFirstArgListener(TypeUpdate.java:454)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.requestUpdate(TypeUpdate.java:310)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.runUpdate(TypeUpdate.java:124)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:91)
    	... 7 more
     */
    /*  JADX ERROR: Types fix failed
        jadx.core.utils.exceptions.JadxRuntimeException: Type update failed for variable: r13v1 ??, new type: int
        	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:109)
        	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:59)
        	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryPossibleTypes(FixTypesVisitor.java:186)
        	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.deduceType(FixTypesVisitor.java:245)
        	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryDeduceTypes(FixTypesVisitor.java:224)
        	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
        Caused by: java.lang.NullPointerException: Cannot invoke "jadx.core.dex.instructions.args.InsnArg.getType()" because "arg" is null
        	at jadx.core.dex.visitors.typeinference.TypeUpdate.verifyType(TypeUpdate.java:210)
        	at jadx.core.dex.visitors.typeinference.TypeUpdate.queueTypeUpdate(TypeUpdate.java:171)
        	at jadx.core.dex.visitors.typeinference.TypeUpdate.sameFirstArgListener(TypeUpdate.java:454)
        	at jadx.core.dex.visitors.typeinference.TypeUpdate.requestUpdate(TypeUpdate.java:310)
        	at jadx.core.dex.visitors.typeinference.TypeUpdate.runUpdate(TypeUpdate.java:124)
        	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:91)
        	... 5 more
        */
    @Override // com.max.xiaoheihe.module.littleprogram.fragment.dota2.f
    public void r2(@dl.e com.max.xiaoheihe.bean.game.dota2.Dota2MatchDetailObj r17) {
        /*
            Method dump skipped, instruction units count: 450
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.max.xiaoheihe.module.littleprogram.fragment.dota2.b.r2(com.max.xiaoheihe.bean.game.dota2.Dota2MatchDetailObj):void");
    }
}
