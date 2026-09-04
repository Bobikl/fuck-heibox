package com.max.xiaoheihe.module.game.component.dota2;

import android.content.Context;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.compose.runtime.internal.o;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.max.hbcommon.base.adapter.s;
import com.max.hbcommon.bean.KeyDescObj;
import com.max.hbcommon.utils.c;
import com.max.hbcustomview.chart.RadarView;
import com.max.hbutils.utils.n;
import com.max.hbutils.utils.q;
import com.max.xiaoheihe.R;
import com.max.xiaoheihe.bean.game.gameoverview.Dota2RadarListObj;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.PatchProxyResult;
import dl.d;
import dl.e;
import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.internal.f0;

/* JADX INFO: compiled from: Dota2RadarView.kt */
/* JADX INFO: loaded from: classes11.dex */
@o(parameters = 0)
public final class Dota2RadarView extends LinearLayout {
    public static ChangeQuickRedirect changeQuickRedirect = null;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public static final int f87198j = 8;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public ViewGroup f87199b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public RadarView f87200c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public TextView f87201d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public TextView f87202e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public TextView f87203f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public TextView f87204g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public RecyclerView f87205h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    @d
    private final ArrayList<KeyDescObj> f87206i;

    /* JADX INFO: compiled from: Dota2RadarView.kt */
    public static final class a extends s<KeyDescObj> {
        public static ChangeQuickRedirect changeQuickRedirect;

        a(Context context, ArrayList<KeyDescObj> arrayList) {
            super(context, arrayList, R.layout.item_dota2_radar_bottom_data);
        }

        public void m(@e s.e eVar, @e KeyDescObj keyDescObj) {
            if (PatchProxy.proxy(new Object[]{eVar, keyDescObj}, this, changeQuickRedirect, false, 37351, new Class[]{s.e.class, KeyDescObj.class}, Void.TYPE).isSupported || eVar == null || keyDescObj == null) {
                return;
            }
            TextView textView = (TextView) eVar.i(R.id.tv_value);
            TextView textView2 = (TextView) eVar.i(R.id.tv_desc);
            textView.setText(keyDescObj.getValue());
            textView2.setText(keyDescObj.getDesc());
        }

        @Override // com.max.hbcommon.base.adapter.s
        public /* bridge */ /* synthetic */ void onBindViewHolder(s.e eVar, KeyDescObj keyDescObj) {
            if (PatchProxy.proxy(new Object[]{eVar, keyDescObj}, this, changeQuickRedirect, false, 37352, new Class[]{s.e.class, Object.class}, Void.TYPE).isSupported) {
                return;
            }
            m(eVar, keyDescObj);
        }
    }

    public Dota2RadarView(@e Context context) {
        this(context, null);
    }

    public Dota2RadarView(@e Context context, @e AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public Dota2RadarView(@e Context context, @e AttributeSet attributeSet, int i10) {
        this(context, attributeSet, i10, 0);
    }

    public Dota2RadarView(@e Context context, @e AttributeSet attributeSet, int i10, int i11) {
        super(context, attributeSet, i10, i11);
        this.f87206i = new ArrayList<>();
        a();
    }

    private final void a() {
        if (PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 37349, new Class[0], Void.TYPE).isSupported) {
            return;
        }
        View viewInflate = LayoutInflater.from(getContext()).inflate(R.layout.view_dota2_radar, (ViewGroup) null, false);
        viewInflate.setLayoutParams(new LinearLayout.LayoutParams(-1, -2));
        addView(viewInflate);
        View viewFindViewById = findViewById(R.id.vg_data);
        f0.o(viewFindViewById, "findViewById(R.id.vg_data)");
        setVgData((ViewGroup) viewFindViewById);
        View viewFindViewById2 = findViewById(R.id.radar);
        f0.o(viewFindViewById2, "findViewById(R.id.radar)");
        setRadarView((RadarView) viewFindViewById2);
        View viewFindViewById3 = findViewById(R.id.tv_win_rate);
        f0.o(viewFindViewById3, "findViewById(R.id.tv_win_rate)");
        setTvWinRate((TextView) viewFindViewById3);
        View viewFindViewById4 = findViewById(R.id.tv_win);
        f0.o(viewFindViewById4, "findViewById(R.id.tv_win)");
        setTvWin((TextView) viewFindViewById4);
        View viewFindViewById5 = findViewById(R.id.tv_lose);
        f0.o(viewFindViewById5, "findViewById(R.id.tv_lose)");
        setTvLose((TextView) viewFindViewById5);
        View viewFindViewById6 = findViewById(R.id.tv_kda);
        f0.o(viewFindViewById6, "findViewById(R.id.tv_kda)");
        setTvKDA((TextView) viewFindViewById6);
        View viewFindViewById7 = findViewById(R.id.rv);
        f0.o(viewFindViewById7, "findViewById(R.id.rv)");
        setRv((RecyclerView) viewFindViewById7);
        getRv().setAdapter(new a(getContext(), this.f87206i));
        setBackground(q.i(getContext(), R.color.white_alpha5, R.color.white_alpha2, 0.5f, 8.0f));
        getVgData().setBackground(q.s(getContext(), R.color.white_alpha1, 8.0f));
    }

    @d
    public final ArrayList<KeyDescObj> getDataList() {
        return this.f87206i;
    }

    @d
    public final RadarView getRadarView() {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 37337, new Class[0], RadarView.class);
        if (patchProxyResultProxy.isSupported) {
            return (RadarView) patchProxyResultProxy.result;
        }
        RadarView radarView = this.f87200c;
        if (radarView != null) {
            return radarView;
        }
        f0.S("radarView");
        return null;
    }

    @d
    public final RecyclerView getRv() {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 37347, new Class[0], RecyclerView.class);
        if (patchProxyResultProxy.isSupported) {
            return (RecyclerView) patchProxyResultProxy.result;
        }
        RecyclerView recyclerView = this.f87205h;
        if (recyclerView != null) {
            return recyclerView;
        }
        f0.S("rv");
        return null;
    }

    @d
    public final TextView getTvKDA() {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 37345, new Class[0], TextView.class);
        if (patchProxyResultProxy.isSupported) {
            return (TextView) patchProxyResultProxy.result;
        }
        TextView textView = this.f87204g;
        if (textView != null) {
            return textView;
        }
        f0.S("tvKDA");
        return null;
    }

    @d
    public final TextView getTvLose() {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 37343, new Class[0], TextView.class);
        if (patchProxyResultProxy.isSupported) {
            return (TextView) patchProxyResultProxy.result;
        }
        TextView textView = this.f87203f;
        if (textView != null) {
            return textView;
        }
        f0.S("tvLose");
        return null;
    }

    @d
    public final TextView getTvWin() {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 37341, new Class[0], TextView.class);
        if (patchProxyResultProxy.isSupported) {
            return (TextView) patchProxyResultProxy.result;
        }
        TextView textView = this.f87202e;
        if (textView != null) {
            return textView;
        }
        f0.S("tvWin");
        return null;
    }

    @d
    public final TextView getTvWinRate() {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 37339, new Class[0], TextView.class);
        if (patchProxyResultProxy.isSupported) {
            return (TextView) patchProxyResultProxy.result;
        }
        TextView textView = this.f87201d;
        if (textView != null) {
            return textView;
        }
        f0.S("tvWinRate");
        return null;
    }

    @d
    public final ViewGroup getVgData() {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 37335, new Class[0], ViewGroup.class);
        if (patchProxyResultProxy.isSupported) {
            return (ViewGroup) patchProxyResultProxy.result;
        }
        ViewGroup viewGroup = this.f87199b;
        if (viewGroup != null) {
            return viewGroup;
        }
        f0.S("vgData");
        return null;
    }

    public final void setData(@e Dota2RadarListObj dota2RadarListObj) {
        if (PatchProxy.proxy(new Object[]{dota2RadarListObj}, this, changeQuickRedirect, false, 37350, new Class[]{Dota2RadarListObj.class}, Void.TYPE).isSupported || dota2RadarListObj == null) {
            return;
        }
        if (!c.w(dota2RadarListObj.getRadar_data_list())) {
            ArrayList arrayList = new ArrayList();
            List<KeyDescObj> radar_data_list = dota2RadarListObj.getRadar_data_list();
            f0.m(radar_data_list);
            for (KeyDescObj keyDescObj : radar_data_list) {
                String desc = keyDescObj.getDesc();
                f0.o(desc, "radarData.desc");
                arrayList.add(new RadarView.b(desc, n.p(keyDescObj.getValue()), false));
            }
            int iF = com.max.xiaoheihe.utils.d.F(getContext(), R.color.dota2_radar_start_color);
            int iF2 = com.max.xiaoheihe.utils.d.F(getContext(), R.color.dota2_radar_end_color);
            getRadarView().setMDescColor(com.max.xiaoheihe.utils.d.F(getContext(), R.color.white_alpha50));
            getRadarView().setMNormalValueColor(com.max.xiaoheihe.utils.d.F(getContext(), R.color.white));
            getRadarView().setMax_value(100.0f);
            getRadarView().setColors(iF, iF2);
            RadarView.setData$default(getRadarView(), arrayList, null, 2, null);
        }
        getTvWinRate().setText(dota2RadarListObj.getWin_rate());
        getTvWin().setText(dota2RadarListObj.getWin());
        getTvLose().setText(dota2RadarListObj.getLose());
        getTvKDA().setText(dota2RadarListObj.getKda());
        if (c.w(dota2RadarListObj.getStats_list())) {
            return;
        }
        RecyclerView rv = getRv();
        Context context = getContext();
        List<KeyDescObj> stats_list = dota2RadarListObj.getStats_list();
        f0.m(stats_list);
        rv.setLayoutManager(new GridLayoutManager(context, stats_list.size()));
        this.f87206i.clear();
        ArrayList<KeyDescObj> arrayList2 = this.f87206i;
        List<KeyDescObj> stats_list2 = dota2RadarListObj.getStats_list();
        f0.m(stats_list2);
        arrayList2.addAll(stats_list2);
        RecyclerView.Adapter adapter = getRv().getAdapter();
        if (adapter != null) {
            adapter.notifyDataSetChanged();
        }
    }

    public final void setRadarView(@d RadarView radarView) {
        if (PatchProxy.proxy(new Object[]{radarView}, this, changeQuickRedirect, false, 37338, new Class[]{RadarView.class}, Void.TYPE).isSupported) {
            return;
        }
        f0.p(radarView, "<set-?>");
        this.f87200c = radarView;
    }

    public final void setRv(@d RecyclerView recyclerView) {
        if (PatchProxy.proxy(new Object[]{recyclerView}, this, changeQuickRedirect, false, 37348, new Class[]{RecyclerView.class}, Void.TYPE).isSupported) {
            return;
        }
        f0.p(recyclerView, "<set-?>");
        this.f87205h = recyclerView;
    }

    public final void setTvKDA(@d TextView textView) {
        if (PatchProxy.proxy(new Object[]{textView}, this, changeQuickRedirect, false, 37346, new Class[]{TextView.class}, Void.TYPE).isSupported) {
            return;
        }
        f0.p(textView, "<set-?>");
        this.f87204g = textView;
    }

    public final void setTvLose(@d TextView textView) {
        if (PatchProxy.proxy(new Object[]{textView}, this, changeQuickRedirect, false, 37344, new Class[]{TextView.class}, Void.TYPE).isSupported) {
            return;
        }
        f0.p(textView, "<set-?>");
        this.f87203f = textView;
    }

    public final void setTvWin(@d TextView textView) {
        if (PatchProxy.proxy(new Object[]{textView}, this, changeQuickRedirect, false, 37342, new Class[]{TextView.class}, Void.TYPE).isSupported) {
            return;
        }
        f0.p(textView, "<set-?>");
        this.f87202e = textView;
    }

    public final void setTvWinRate(@d TextView textView) {
        if (PatchProxy.proxy(new Object[]{textView}, this, changeQuickRedirect, false, 37340, new Class[]{TextView.class}, Void.TYPE).isSupported) {
            return;
        }
        f0.p(textView, "<set-?>");
        this.f87201d = textView;
    }

    public final void setVgData(@d ViewGroup viewGroup) {
        if (PatchProxy.proxy(new Object[]{viewGroup}, this, changeQuickRedirect, false, 37336, new Class[]{ViewGroup.class}, Void.TYPE).isSupported) {
            return;
        }
        f0.p(viewGroup, "<set-?>");
        this.f87199b = viewGroup;
    }
}
