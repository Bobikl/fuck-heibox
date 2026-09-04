package com.max.xiaoheihe.module.littleprogram.fragment.dota2;

import android.content.Context;
import android.graphics.drawable.GradientDrawable;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.LinearInterpolator;
import android.view.animation.RotateAnimation;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.compose.runtime.internal.o;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.max.hbcommon.base.adapter.s;
import com.max.hbcommon.bean.KeyDescObj;
import com.max.hbcommon.bean.segmentfilter.FilterGroup;
import com.max.hbcommon.bean.segmentfilter.FilterItem;
import com.max.hbcommon.component.HeyBoxPopupMenu;
import com.max.hbcommon.component.segmentfilters.SecondaryWindowSegmentFilterView;
import com.max.hbcommon.component.segmentfilters.SegmentFilterView;
import com.max.hbcustomview.QMUIRadiusImageView;
import com.max.hbutils.utils.ViewUtils;
import com.max.hbutils.utils.n;
import com.max.hbutils.utils.q;
import com.max.xiaoheihe.R;
import com.max.xiaoheihe.bean.game.gameoverview.GameOverviewHeaderInfoObj;
import com.max.xiaoheihe.module.game.component.GameAvatarView;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.internal.f0;
import xh.m;

/* JADX INFO: compiled from: Dota2Util.kt */
/* JADX INFO: loaded from: classes11.dex */
@o(parameters = 0)
public final class c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @dl.d
    public static final c f89134a = new c();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final int f89135b = 0;
    public static ChangeQuickRedirect changeQuickRedirect;

    /* JADX INFO: compiled from: Dota2Util.kt */
    public static final class a extends s<FilterGroup> {
        public static ChangeQuickRedirect changeQuickRedirect;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ Context f89136b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ List<FilterGroup> f89137c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        final /* synthetic */ int f89138d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        final /* synthetic */ com.max.xiaoheihe.module.game.adapter.overview.b.InterfaceC0764b f89139e;

        /* JADX INFO: renamed from: com.max.xiaoheihe.module.littleprogram.fragment.dota2.c$a$a, reason: collision with other inner class name */
        /* JADX INFO: compiled from: Dota2Util.kt */
        public static final class ViewOnClickListenerC0814a implements View.OnClickListener {
            public static ChangeQuickRedirect changeQuickRedirect;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            final /* synthetic */ FilterGroup f89140b;

            /* JADX INFO: renamed from: c, reason: collision with root package name */
            final /* synthetic */ Context f89141c;

            /* JADX INFO: renamed from: d, reason: collision with root package name */
            final /* synthetic */ com.max.xiaoheihe.module.game.adapter.overview.b.InterfaceC0764b f89142d;

            /* JADX INFO: renamed from: e, reason: collision with root package name */
            final /* synthetic */ List<FilterGroup> f89143e;

            /* JADX INFO: renamed from: com.max.xiaoheihe.module.littleprogram.fragment.dota2.c$a$a$a, reason: collision with other inner class name */
            /* JADX INFO: compiled from: Dota2Util.kt */
            public static final class C0815a implements HeyBoxPopupMenu.h {
                public static ChangeQuickRedirect changeQuickRedirect;

                /* JADX INFO: renamed from: a, reason: collision with root package name */
                final /* synthetic */ FilterGroup f89144a;

                /* JADX INFO: renamed from: b, reason: collision with root package name */
                final /* synthetic */ ArrayList<KeyDescObj> f89145b;

                /* JADX INFO: renamed from: c, reason: collision with root package name */
                final /* synthetic */ com.max.xiaoheihe.module.game.adapter.overview.b.InterfaceC0764b f89146c;

                /* JADX INFO: renamed from: d, reason: collision with root package name */
                final /* synthetic */ List<FilterGroup> f89147d;

                C0815a(FilterGroup filterGroup, ArrayList<KeyDescObj> arrayList, com.max.xiaoheihe.module.game.adapter.overview.b.InterfaceC0764b interfaceC0764b, List<FilterGroup> list) {
                    this.f89144a = filterGroup;
                    this.f89145b = arrayList;
                    this.f89146c = interfaceC0764b;
                    this.f89147d = list;
                }

                @Override // com.max.hbcommon.component.HeyBoxPopupMenu.h
                public final void a(View view, KeyDescObj keyDescObj) {
                    if (PatchProxy.proxy(new Object[]{view, keyDescObj}, this, changeQuickRedirect, false, 39374, new Class[]{View.class, KeyDescObj.class}, Void.TYPE).isSupported) {
                        return;
                    }
                    SecondaryWindowSegmentFilterView.a aVar = SecondaryWindowSegmentFilterView.f67839l;
                    FilterGroup filterGroup = this.f89144a;
                    aVar.u(filterGroup, filterGroup.getFilters().get(this.f89145b.indexOf(keyDescObj)));
                    com.max.xiaoheihe.module.game.adapter.overview.b.InterfaceC0764b interfaceC0764b = this.f89146c;
                    if (interfaceC0764b != null) {
                        List<FilterGroup> list = this.f89147d;
                        f0.m(list);
                        interfaceC0764b.a(list);
                    }
                }
            }

            ViewOnClickListenerC0814a(FilterGroup filterGroup, Context context, com.max.xiaoheihe.module.game.adapter.overview.b.InterfaceC0764b interfaceC0764b, List<FilterGroup> list) {
                this.f89140b = filterGroup;
                this.f89141c = context;
                this.f89142d = interfaceC0764b;
                this.f89143e = list;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                if (PatchProxy.proxy(new Object[]{view}, this, changeQuickRedirect, false, 39373, new Class[]{View.class}, Void.TYPE).isSupported || com.max.hbcommon.utils.c.w(this.f89140b.getFilters())) {
                    return;
                }
                FilterItem filterItemC = SecondaryWindowSegmentFilterView.f67839l.c(this.f89140b);
                ArrayList arrayList = new ArrayList();
                boolean z10 = false;
                for (FilterItem filterItem : this.f89140b.getFilters()) {
                    KeyDescObj keyDescObj = new KeyDescObj();
                    keyDescObj.setKey(filterItem.getKey());
                    keyDescObj.setDesc(filterItem.getDesc());
                    if (f0.g(filterItemC != null ? filterItemC.getKey() : null, filterItem.getKey())) {
                        keyDescObj.setChecked(true);
                        z10 = true;
                    }
                    arrayList.add(keyDescObj);
                }
                if (!z10) {
                    ((KeyDescObj) arrayList.get(0)).setChecked(true);
                }
                HeyBoxPopupMenu heyBoxPopupMenu = new HeyBoxPopupMenu(this.f89141c, arrayList);
                heyBoxPopupMenu.R(new C0815a(this.f89140b, arrayList, this.f89142d, this.f89143e));
                heyBoxPopupMenu.show();
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        a(Context context, List<FilterGroup> list, int i10, com.max.xiaoheihe.module.game.adapter.overview.b.InterfaceC0764b interfaceC0764b) {
            super(context, list, R.layout.item_module_select);
            this.f89136b = context;
            this.f89137c = list;
            this.f89138d = i10;
            this.f89139e = interfaceC0764b;
        }

        public void m(@dl.e s.e eVar, @dl.e FilterGroup filterGroup) {
            if (PatchProxy.proxy(new Object[]{eVar, filterGroup}, this, changeQuickRedirect, false, 39371, new Class[]{s.e.class, FilterGroup.class}, Void.TYPE).isSupported || eVar == null) {
                return;
            }
            int i10 = this.f89138d;
            Context context = this.f89136b;
            com.max.xiaoheihe.module.game.adapter.overview.b.InterfaceC0764b interfaceC0764b = this.f89139e;
            List<FilterGroup> list = this.f89137c;
            if (filterGroup != null) {
                GradientDrawable gradientDrawableE = ViewUtils.E(i10, com.max.xiaoheihe.utils.d.E(R.color.white_alpha5));
                TextView textView = (TextView) eVar.i(R.id.tv_button);
                ViewGroup.LayoutParams layoutParams = textView.getLayoutParams();
                f0.n(layoutParams, "null cannot be cast to non-null type android.view.ViewGroup.MarginLayoutParams");
                ((ViewGroup.MarginLayoutParams) layoutParams).setMarginEnd(ViewUtils.f(context, 4.0f));
                FilterItem filterItemC = SecondaryWindowSegmentFilterView.f67839l.c(filterGroup);
                if (filterItemC == null) {
                    filterItemC = filterGroup.getFilters().get(0);
                }
                textView.setText(filterItemC.getDesc() + " \uf0d7");
                textView.setTypeface(bb.d.a().b(0));
                textView.setBackground(gradientDrawableE);
                eVar.itemView.setOnClickListener(new ViewOnClickListenerC0814a(filterGroup, context, interfaceC0764b, list));
            }
        }

        @Override // com.max.hbcommon.base.adapter.s
        public /* bridge */ /* synthetic */ void onBindViewHolder(s.e eVar, FilterGroup filterGroup) {
            if (PatchProxy.proxy(new Object[]{eVar, filterGroup}, this, changeQuickRedirect, false, 39372, new Class[]{s.e.class, Object.class}, Void.TYPE).isSupported) {
                return;
            }
            m(eVar, filterGroup);
        }
    }

    /* JADX INFO: compiled from: Dota2Util.kt */
    public static final class b implements SegmentFilterView.a {
        public static ChangeQuickRedirect changeQuickRedirect;

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ FilterGroup f89148a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ com.max.xiaoheihe.module.game.adapter.overview.b.InterfaceC0764b f89149b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ List<FilterGroup> f89150c;

        b(FilterGroup filterGroup, com.max.xiaoheihe.module.game.adapter.overview.b.InterfaceC0764b interfaceC0764b, List<FilterGroup> list) {
            this.f89148a = filterGroup;
            this.f89149b = interfaceC0764b;
            this.f89150c = list;
        }

        @Override // com.max.hbcommon.component.segmentfilters.SegmentFilterView.a
        public void a(@dl.d KeyDescObj keyDescObj, int i10) {
            if (PatchProxy.proxy(new Object[]{keyDescObj, new Integer(i10)}, this, changeQuickRedirect, false, 39375, new Class[]{KeyDescObj.class, Integer.TYPE}, Void.TYPE).isSupported) {
                return;
            }
            f0.p(keyDescObj, "keyDescObj");
            SecondaryWindowSegmentFilterView.a aVar = SecondaryWindowSegmentFilterView.f67839l;
            FilterGroup filterGroup = this.f89148a;
            aVar.u(filterGroup, filterGroup.getFilters().get(i10));
            com.max.xiaoheihe.module.game.adapter.overview.b.InterfaceC0764b interfaceC0764b = this.f89149b;
            if (interfaceC0764b != null) {
                interfaceC0764b.a(this.f89150c);
            }
        }
    }

    /* JADX INFO: renamed from: com.max.xiaoheihe.module.littleprogram.fragment.dota2.c$c, reason: collision with other inner class name */
    /* JADX INFO: compiled from: Dota2Util.kt */
    public static final class ViewOnClickListenerC0816c implements View.OnClickListener {
        public static ChangeQuickRedirect changeQuickRedirect;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ Context f89151b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ GameOverviewHeaderInfoObj f89152c;

        ViewOnClickListenerC0816c(Context context, GameOverviewHeaderInfoObj gameOverviewHeaderInfoObj) {
            this.f89151b = context;
            this.f89152c = gameOverviewHeaderInfoObj;
        }

        @Override // android.view.View.OnClickListener
        public final void onClick(View view) {
            if (PatchProxy.proxy(new Object[]{view}, this, changeQuickRedirect, false, 39376, new Class[]{View.class}, Void.TYPE).isSupported) {
                return;
            }
            com.max.xiaoheihe.utils.d.o(this.f89151b, this.f89152c.getSteam_id());
            com.max.hbutils.utils.c.f(this.f89151b.getString(R.string.text_copied));
        }
    }

    /* JADX INFO: compiled from: Dota2Util.kt */
    public static final class d implements View.OnClickListener {
        public static ChangeQuickRedirect changeQuickRedirect;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ Context f89153b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ String f89154c;

        d(Context context, String str) {
            this.f89153b = context;
            this.f89154c = str;
        }

        @Override // android.view.View.OnClickListener
        public final void onClick(View view) {
            if (PatchProxy.proxy(new Object[]{view}, this, changeQuickRedirect, false, 39377, new Class[]{View.class}, Void.TYPE).isSupported) {
                return;
            }
            com.max.xiaoheihe.base.router.b.k0(this.f89153b, this.f89154c);
        }
    }

    /* JADX INFO: compiled from: Dota2Util.kt */
    public static final class e implements View.OnClickListener {
        public static ChangeQuickRedirect changeQuickRedirect;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ Context f89155b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ String f89156c;

        e(Context context, String str) {
            this.f89155b = context;
            this.f89156c = str;
        }

        @Override // android.view.View.OnClickListener
        public final void onClick(View view) {
            if (PatchProxy.proxy(new Object[]{view}, this, changeQuickRedirect, false, 39378, new Class[]{View.class}, Void.TYPE).isSupported) {
                return;
            }
            com.max.xiaoheihe.base.router.b.k0(this.f89155b, this.f89156c);
        }
    }

    /* JADX INFO: compiled from: Dota2Util.kt */
    public static final class f implements View.OnClickListener {
        public static ChangeQuickRedirect changeQuickRedirect;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ Context f89157b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ GameOverviewHeaderInfoObj f89158c;

        f(Context context, GameOverviewHeaderInfoObj gameOverviewHeaderInfoObj) {
            this.f89157b = context;
            this.f89158c = gameOverviewHeaderInfoObj;
        }

        @Override // android.view.View.OnClickListener
        public final void onClick(View view) {
            if (PatchProxy.proxy(new Object[]{view}, this, changeQuickRedirect, false, 39379, new Class[]{View.class}, Void.TYPE).isSupported) {
                return;
            }
            com.max.xiaoheihe.utils.d.o(this.f89157b, this.f89158c.getSteam_id());
            com.max.hbutils.utils.c.f(this.f89157b.getString(R.string.text_copied));
        }
    }

    /* JADX INFO: compiled from: Dota2Util.kt */
    public static final class g implements Runnable {
        public static ChangeQuickRedirect changeQuickRedirect;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ View f89159b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ Context f89160c;

        g(View view, Context context) {
            this.f89159b = view;
            this.f89160c = context;
        }

        @Override // java.lang.Runnable
        public final void run() {
            if (PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 39380, new Class[0], Void.TYPE).isSupported) {
                return;
            }
            ViewGroup.LayoutParams layoutParams = this.f89159b.getLayoutParams();
            layoutParams.width = ViewUtils.J(this.f89160c);
            layoutParams.height = ViewUtils.J(this.f89160c);
            this.f89159b.setLayoutParams(layoutParams);
            this.f89159b.setScaleX(3.0f);
            this.f89159b.setScaleY(3.0f);
            RotateAnimation rotateAnimation = new RotateAnimation(0.0f, 360.0f, 1, 0.5f, 1, 0.5f);
            rotateAnimation.setDuration(com.google.android.exoplayer2.text.cea.a.A);
            rotateAnimation.setRepeatCount(-1);
            rotateAnimation.setInterpolator(new LinearInterpolator());
            this.f89159b.startAnimation(rotateAnimation);
        }
    }

    private c() {
    }

    @m
    public static final void f(@dl.d Context context, @dl.d View ivBg) {
        if (PatchProxy.proxy(new Object[]{context, ivBg}, null, changeQuickRedirect, true, 39365, new Class[]{Context.class, View.class}, Void.TYPE).isSupported) {
            return;
        }
        f0.p(context, "context");
        f0.p(ivBg, "ivBg");
        ivBg.post(new g(ivBg, context));
    }

    public final void a(@dl.d Context context, @dl.d RecyclerView rv_selections, @dl.e List<FilterGroup> list, @dl.e com.max.xiaoheihe.module.game.adapter.overview.b.InterfaceC0764b interfaceC0764b) {
        if (PatchProxy.proxy(new Object[]{context, rv_selections, list, interfaceC0764b}, this, changeQuickRedirect, false, 39369, new Class[]{Context.class, RecyclerView.class, List.class, com.max.xiaoheihe.module.game.adapter.overview.b.InterfaceC0764b.class}, Void.TYPE).isSupported) {
            return;
        }
        f0.p(context, "context");
        f0.p(rv_selections, "rv_selections");
        if (list != null) {
            int iM = ViewUtils.m(context, ViewUtils.f(context, 65.0f), ViewUtils.f(context, 20.0f));
            rv_selections.setLayoutManager(new LinearLayoutManager(context, 0, false));
            rv_selections.setAdapter(new a(context, list, iM, interfaceC0764b));
        }
    }

    public final void b(@dl.d Context context, @dl.d SegmentFilterView v_filter, @dl.d List<FilterGroup> filters, @dl.e com.max.xiaoheihe.module.game.adapter.overview.b.InterfaceC0764b interfaceC0764b) {
        if (PatchProxy.proxy(new Object[]{context, v_filter, filters, interfaceC0764b}, this, changeQuickRedirect, false, 39368, new Class[]{Context.class, SegmentFilterView.class, List.class, com.max.xiaoheihe.module.game.adapter.overview.b.InterfaceC0764b.class}, Void.TYPE).isSupported) {
            return;
        }
        f0.p(context, "context");
        f0.p(v_filter, "v_filter");
        f0.p(filters, "filters");
        FilterGroup filterGroup = filters.get(0);
        if (filterGroup.getFilters().size() > 0) {
            ArrayList arrayList = new ArrayList();
            for (FilterItem filterItem : filterGroup.getFilters()) {
                KeyDescObj keyDescObj = new KeyDescObj();
                keyDescObj.setDesc(filterItem.getDesc());
                keyDescObj.setKey(filterItem.getKey());
                keyDescObj.setChecked(filterItem.isCustom_checked());
                arrayList.add(keyDescObj);
            }
            v_filter.setLittleWhiteStyle();
            v_filter.setMOnTabCheckedListener(new b(filterGroup, interfaceC0764b, filters));
            v_filter.setData(arrayList);
            v_filter.d();
        }
    }

    public final void c(@dl.d Context context, @dl.e ViewGroup viewGroup, @dl.e GameOverviewHeaderInfoObj gameOverviewHeaderInfoObj, @dl.e String str, @dl.e com.max.xiaoheihe.module.game.adapter.overview.b.InterfaceC0764b interfaceC0764b) {
        if (PatchProxy.proxy(new Object[]{context, viewGroup, gameOverviewHeaderInfoObj, str, interfaceC0764b}, this, changeQuickRedirect, false, 39366, new Class[]{Context.class, ViewGroup.class, GameOverviewHeaderInfoObj.class, String.class, com.max.xiaoheihe.module.game.adapter.overview.b.InterfaceC0764b.class}, Void.TYPE).isSupported) {
            return;
        }
        f0.p(context, "context");
        if (viewGroup == null || gameOverviewHeaderInfoObj == null) {
            return;
        }
        GameAvatarView gameAvatarView = (GameAvatarView) viewGroup.findViewById(R.id.v_game_avatar);
        TextView textView = (TextView) viewGroup.findViewById(R.id.tv_name);
        RecyclerView rv_selections = (RecyclerView) viewGroup.findViewById(R.id.rv_selections);
        SegmentFilterView v_filter = (SegmentFilterView) viewGroup.findViewById(R.id.v_filter);
        View viewFindViewById = viewGroup.findViewById(R.id.vg_steam_id);
        TextView textView2 = (TextView) viewGroup.findViewById(R.id.tv_steam_id);
        ViewGroup viewGroup2 = (ViewGroup) viewGroup.findViewById(R.id.vg_no_data_help);
        ImageView imageView = (ImageView) viewGroup.findViewById(R.id.iv_authentication);
        View viewFindViewById2 = viewGroup.findViewById(R.id.vg_plus);
        View viewFindViewById3 = viewGroup.findViewById(R.id.vg_name);
        TextView textView3 = (TextView) viewGroup.findViewById(R.id.tv_events_progress);
        gameAvatarView.setRadius(ViewUtils.o(context, gameAvatarView));
        gameAvatarView.setAuth(com.max.hbcommon.utils.c.x(gameOverviewHeaderInfoObj.is_heybox_user()));
        com.max.hbimage.b.K(gameOverviewHeaderInfoObj.getAvatar(), gameAvatarView.getIv_avatar());
        textView.setText(gameOverviewHeaderInfoObj.getName());
        if (com.max.hbcommon.utils.c.u(gameOverviewHeaderInfoObj.getSteam_id())) {
            viewFindViewById.setVisibility(8);
        } else {
            viewFindViewById.setVisibility(0);
            textView2.setText("SteamID: " + gameOverviewHeaderInfoObj.getSteam_id());
            viewFindViewById.setOnClickListener(new ViewOnClickListenerC0816c(context, gameOverviewHeaderInfoObj));
        }
        if (com.max.hbcommon.utils.c.u(str)) {
            viewGroup2.setVisibility(8);
        } else {
            viewGroup2.setVisibility(0);
            viewGroup2.setOnClickListener(new d(context, str));
        }
        imageView.setVisibility(com.max.hbcommon.utils.c.x(gameOverviewHeaderInfoObj.is_verified()) ? 0 : 8);
        if (com.max.hbcommon.utils.c.x(gameOverviewHeaderInfoObj.is_plus_subscriber())) {
            viewFindViewById2.setVisibility(0);
            viewFindViewById2.setBackground(q.o(context, R.color.black_alpha10, 8.0f));
            ViewGroup.LayoutParams layoutParams = viewFindViewById3.getLayoutParams();
            f0.n(layoutParams, "null cannot be cast to non-null type android.view.ViewGroup.MarginLayoutParams");
            ((ViewGroup.MarginLayoutParams) layoutParams).topMargin = 0;
            textView3.setText(String.valueOf(n.q(gameOverviewHeaderInfoObj.getEvent_points()) / 1000));
        } else {
            viewFindViewById2.setVisibility(8);
            ViewGroup.LayoutParams layoutParams2 = viewFindViewById3.getLayoutParams();
            f0.n(layoutParams2, "null cannot be cast to non-null type android.view.ViewGroup.MarginLayoutParams");
            ((ViewGroup.MarginLayoutParams) layoutParams2).topMargin = ViewUtils.f(context, 10.0f);
        }
        if (com.max.hbcommon.utils.c.w(gameOverviewHeaderInfoObj.getFilters())) {
            return;
        }
        List<FilterGroup> filters = gameOverviewHeaderInfoObj.getFilters();
        f0.m(filters);
        if (filters.size() > 1) {
            rv_selections.setVisibility(0);
            v_filter.setVisibility(8);
            c cVar = f89134a;
            f0.o(rv_selections, "rv_selections");
            cVar.a(context, rv_selections, gameOverviewHeaderInfoObj.getFilters(), interfaceC0764b);
            return;
        }
        rv_selections.setVisibility(8);
        v_filter.setVisibility(0);
        c cVar2 = f89134a;
        f0.o(v_filter, "v_filter");
        List<FilterGroup> filters2 = gameOverviewHeaderInfoObj.getFilters();
        f0.m(filters2);
        cVar2.b(context, v_filter, filters2, interfaceC0764b);
    }

    public final void d(@dl.d Context context, @dl.e ViewGroup viewGroup, @dl.e GameOverviewHeaderInfoObj gameOverviewHeaderInfoObj, @dl.e String str, @dl.e com.max.xiaoheihe.module.game.adapter.overview.b.InterfaceC0764b interfaceC0764b) {
        if (PatchProxy.proxy(new Object[]{context, viewGroup, gameOverviewHeaderInfoObj, str, interfaceC0764b}, this, changeQuickRedirect, false, 39367, new Class[]{Context.class, ViewGroup.class, GameOverviewHeaderInfoObj.class, String.class, com.max.xiaoheihe.module.game.adapter.overview.b.InterfaceC0764b.class}, Void.TYPE).isSupported) {
            return;
        }
        f0.p(context, "context");
        if (viewGroup == null || gameOverviewHeaderInfoObj == null) {
            return;
        }
        QMUIRadiusImageView qMUIRadiusImageView = (QMUIRadiusImageView) viewGroup.findViewById(R.id.iv_hero_avatar);
        TextView textView = (TextView) viewGroup.findViewById(R.id.tv_name);
        RecyclerView rv_selections = (RecyclerView) viewGroup.findViewById(R.id.rv_selections);
        SegmentFilterView v_filter = (SegmentFilterView) viewGroup.findViewById(R.id.v_filter);
        qMUIRadiusImageView.setOnClickListener(new e(context, str));
        com.max.hbimage.b.K(gameOverviewHeaderInfoObj.getAvatar(), qMUIRadiusImageView);
        textView.setText(gameOverviewHeaderInfoObj.getName());
        if (com.max.hbcommon.utils.c.w(gameOverviewHeaderInfoObj.getFilters())) {
            return;
        }
        List<FilterGroup> filters = gameOverviewHeaderInfoObj.getFilters();
        f0.m(filters);
        if (filters.size() > 1) {
            c cVar = f89134a;
            f0.o(rv_selections, "rv_selections");
            cVar.a(context, rv_selections, gameOverviewHeaderInfoObj.getFilters(), interfaceC0764b);
        } else {
            c cVar2 = f89134a;
            f0.o(v_filter, "v_filter");
            List<FilterGroup> filters2 = gameOverviewHeaderInfoObj.getFilters();
            f0.m(filters2);
            cVar2.b(context, v_filter, filters2, interfaceC0764b);
        }
    }

    public final void e(@dl.d Context context, @dl.e ViewGroup viewGroup, @dl.e GameOverviewHeaderInfoObj gameOverviewHeaderInfoObj) {
        if (PatchProxy.proxy(new Object[]{context, viewGroup, gameOverviewHeaderInfoObj}, this, changeQuickRedirect, false, 39370, new Class[]{Context.class, ViewGroup.class, GameOverviewHeaderInfoObj.class}, Void.TYPE).isSupported) {
            return;
        }
        f0.p(context, "context");
        if (viewGroup == null || gameOverviewHeaderInfoObj == null) {
            return;
        }
        GameAvatarView gameAvatarView = (GameAvatarView) viewGroup.findViewById(R.id.v_game_avatar);
        TextView textView = (TextView) viewGroup.findViewById(R.id.tv_name);
        View viewFindViewById = viewGroup.findViewById(R.id.vg_steam_id);
        TextView textView2 = (TextView) viewGroup.findViewById(R.id.tv_steam_id);
        gameAvatarView.setRadius(ViewUtils.o(context, gameAvatarView));
        com.max.hbimage.b.K(gameOverviewHeaderInfoObj.getAvatar(), gameAvatarView.getIv_avatar());
        textView.setText(gameOverviewHeaderInfoObj.getName());
        if (com.max.hbcommon.utils.c.u(gameOverviewHeaderInfoObj.getSteam_id())) {
            viewFindViewById.setVisibility(8);
            return;
        }
        viewFindViewById.setVisibility(0);
        textView2.setText("SteamID: " + gameOverviewHeaderInfoObj.getSteam_id());
        viewFindViewById.setOnClickListener(new f(context, gameOverviewHeaderInfoObj));
    }
}
