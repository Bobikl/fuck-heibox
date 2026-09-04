package com.max.xiaoheihe.module.game.adapter.overview.binder;

import android.widget.TextView;
import com.max.hbcommon.bean.KeyDescObj;
import com.max.hbcommon.component.segmentfilters.SegmentFilterView;
import com.max.xiaoheihe.R;
import com.max.xiaoheihe.bean.game.gameoverview.BaseGameOverviewObj;
import com.max.xiaoheihe.bean.game.gameoverview.Dota2RadarListObj;
import com.max.xiaoheihe.bean.game.gameoverview.GameOverviewAllRadarObj;
import com.max.xiaoheihe.module.game.component.dota2.Dota2RadarView;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.internal.f0;

/* JADX INFO: compiled from: GameOverviewRadarVHB.kt */
/* JADX INFO: loaded from: classes11.dex */
@androidx.compose.runtime.internal.o(parameters = 0)
public final class y extends cb.c<BaseGameOverviewObj> {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final int f85928b = 8;
    public static ChangeQuickRedirect changeQuickRedirect;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @dl.d
    private final com.max.xiaoheihe.module.game.adapter.overview.d f85929a;

    /* JADX INFO: compiled from: GameOverviewRadarVHB.kt */
    public static final class a implements SegmentFilterView.a {
        public static ChangeQuickRedirect changeQuickRedirect;

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ GameOverviewAllRadarObj f85930a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ Dota2RadarView f85931b;

        a(GameOverviewAllRadarObj gameOverviewAllRadarObj, Dota2RadarView dota2RadarView) {
            this.f85930a = gameOverviewAllRadarObj;
            this.f85931b = dota2RadarView;
        }

        @Override // com.max.hbcommon.component.segmentfilters.SegmentFilterView.a
        public void a(@dl.d KeyDescObj key, int i10) {
            if (PatchProxy.proxy(new Object[]{key, new Integer(i10)}, this, changeQuickRedirect, false, 35844, new Class[]{KeyDescObj.class, Integer.TYPE}, Void.TYPE).isSupported) {
                return;
            }
            f0.p(key, "key");
            this.f85930a.setSelectIndex(i10);
            Dota2RadarView dota2RadarView = this.f85931b;
            List<Dota2RadarListObj> radar_list = this.f85930a.getRadar_list();
            f0.m(radar_list);
            dota2RadarView.setData(radar_list.get(i10));
        }
    }

    public y(@dl.d com.max.xiaoheihe.module.game.adapter.overview.d param) {
        f0.p(param, "param");
        this.f85929a = param;
    }

    @Override // cb.c
    public /* bridge */ /* synthetic */ void b(com.max.hbcommon.base.adapter.s.e eVar, BaseGameOverviewObj baseGameOverviewObj) {
        if (PatchProxy.proxy(new Object[]{eVar, baseGameOverviewObj}, this, changeQuickRedirect, false, 35843, new Class[]{com.max.hbcommon.base.adapter.s.e.class, Object.class}, Void.TYPE).isSupported) {
            return;
        }
        f(eVar, baseGameOverviewObj);
    }

    public void f(@dl.d com.max.hbcommon.base.adapter.s.e viewHolder, @dl.d BaseGameOverviewObj data) {
        if (PatchProxy.proxy(new Object[]{viewHolder, data}, this, changeQuickRedirect, false, 35841, new Class[]{com.max.hbcommon.base.adapter.s.e.class, BaseGameOverviewObj.class}, Void.TYPE).isSupported) {
            return;
        }
        f0.p(viewHolder, "viewHolder");
        f0.p(data, "data");
        if (data instanceof GameOverviewAllRadarObj) {
            TextView textView = (TextView) viewHolder.i(R.id.tv_title);
            SegmentFilterView v_filter = (SegmentFilterView) viewHolder.i(R.id.v_filter);
            Dota2RadarView v_dota2_radar = (Dota2RadarView) viewHolder.i(R.id.v_dota2_radar);
            GameOverviewAllRadarObj gameOverviewAllRadarObj = (GameOverviewAllRadarObj) data;
            String title = gameOverviewAllRadarObj.getTitle();
            if (title == null) {
                title = "雷达图";
            }
            textView.setText(title);
            if (com.max.hbcommon.utils.c.w(gameOverviewAllRadarObj.getRadar_list())) {
                return;
            }
            List<Dota2RadarListObj> radar_list = gameOverviewAllRadarObj.getRadar_list();
            f0.m(radar_list);
            v_dota2_radar.setData(radar_list.get(gameOverviewAllRadarObj.getSelectIndex()));
            f0.o(v_filter, "v_filter");
            f0.o(v_dota2_radar, "v_dota2_radar");
            g(v_filter, v_dota2_radar, gameOverviewAllRadarObj);
        }
    }

    public final void g(@dl.d SegmentFilterView segmentFilterView, @dl.d Dota2RadarView v_dota2_radar, @dl.d GameOverviewAllRadarObj data) {
        if (PatchProxy.proxy(new Object[]{segmentFilterView, v_dota2_radar, data}, this, changeQuickRedirect, false, 35842, new Class[]{SegmentFilterView.class, Dota2RadarView.class, GameOverviewAllRadarObj.class}, Void.TYPE).isSupported) {
            return;
        }
        f0.p(segmentFilterView, "segmentFilterView");
        f0.p(v_dota2_radar, "v_dota2_radar");
        f0.p(data, "data");
        ArrayList arrayList = new ArrayList();
        List<Dota2RadarListObj> radar_list = data.getRadar_list();
        f0.m(radar_list);
        int size = radar_list.size();
        int i10 = 0;
        while (i10 < size) {
            List<Dota2RadarListObj> radar_list2 = data.getRadar_list();
            f0.m(radar_list2);
            Dota2RadarListObj dota2RadarListObj = radar_list2.get(i10);
            KeyDescObj keyDescObj = new KeyDescObj();
            keyDescObj.setDesc(dota2RadarListObj.getDesc());
            keyDescObj.setKey(String.valueOf(i10));
            keyDescObj.setChecked(data.getSelectIndex() == i10);
            arrayList.add(keyDescObj);
            i10++;
        }
        segmentFilterView.setLittleWhiteStyle();
        segmentFilterView.setMOnTabCheckedListener(new a(data, v_dota2_radar));
        segmentFilterView.setData(arrayList);
        segmentFilterView.d();
    }

    @dl.d
    public final com.max.xiaoheihe.module.game.adapter.overview.d h() {
        return this.f85929a;
    }
}
