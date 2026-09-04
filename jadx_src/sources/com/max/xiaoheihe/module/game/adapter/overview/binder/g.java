package com.max.xiaoheihe.module.game.adapter.overview.binder;

import android.content.Context;
import android.view.View;
import android.widget.TextView;
import com.max.hbcommon.bean.KeyDescObj;
import com.max.hbcommon.component.segmentfilters.SegmentFilterView;
import com.max.hbutils.utils.ViewUtils;
import com.max.xiaoheihe.R;
import com.max.xiaoheihe.bean.game.gameoverview.BaseGameOverviewObj;
import com.max.xiaoheihe.bean.game.gameoverview.GameOverviewCalendarListObj;
import com.max.xiaoheihe.module.game.component.dota2.Dota2CalendarView;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import java.util.ArrayList;
import kotlin.jvm.internal.f0;

/* JADX INFO: compiled from: GameOverviewCalendarVHB.kt */
/* JADX INFO: loaded from: classes11.dex */
@androidx.compose.runtime.internal.o(parameters = 0)
public final class g extends cb.c<BaseGameOverviewObj> {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final int f85868b = 8;
    public static ChangeQuickRedirect changeQuickRedirect;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @dl.d
    private final com.max.xiaoheihe.module.game.adapter.overview.d f85869a;

    /* JADX INFO: compiled from: GameOverviewCalendarVHB.kt */
    public static final class a implements View.OnClickListener {
        public static ChangeQuickRedirect changeQuickRedirect;

        a() {
        }

        @Override // android.view.View.OnClickListener
        public final void onClick(View view) {
            if (PatchProxy.proxy(new Object[]{view}, this, changeQuickRedirect, false, 35770, new Class[]{View.class}, Void.TYPE).isSupported) {
                return;
            }
            com.max.xiaoheihe.base.router.b.n0(g.this.h().b(), g.this.h().h(), g.this.h().g());
        }
    }

    /* JADX INFO: compiled from: GameOverviewCalendarVHB.kt */
    public static final class b implements SegmentFilterView.a {
        public static ChangeQuickRedirect changeQuickRedirect;

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ GameOverviewCalendarListObj f85871a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ Dota2CalendarView f85872b;

        b(GameOverviewCalendarListObj gameOverviewCalendarListObj, Dota2CalendarView dota2CalendarView) {
            this.f85871a = gameOverviewCalendarListObj;
            this.f85872b = dota2CalendarView;
        }

        @Override // com.max.hbcommon.component.segmentfilters.SegmentFilterView.a
        public void a(@dl.d KeyDescObj key, int i10) {
            if (PatchProxy.proxy(new Object[]{key, new Integer(i10)}, this, changeQuickRedirect, false, 35771, new Class[]{KeyDescObj.class, Integer.TYPE}, Void.TYPE).isSupported) {
                return;
            }
            f0.p(key, "key");
            if (i10 == 0) {
                this.f85871a.setWin(Boolean.FALSE);
                this.f85872b.setType(Dota2CalendarView.Type.Count);
            } else {
                this.f85871a.setWin(Boolean.TRUE);
                this.f85872b.setType(Dota2CalendarView.Type.Win);
            }
        }
    }

    public g(@dl.d com.max.xiaoheihe.module.game.adapter.overview.d param) {
        f0.p(param, "param");
        this.f85869a = param;
    }

    @Override // cb.c
    public /* bridge */ /* synthetic */ void b(com.max.hbcommon.base.adapter.s.e eVar, BaseGameOverviewObj baseGameOverviewObj) {
        if (PatchProxy.proxy(new Object[]{eVar, baseGameOverviewObj}, this, changeQuickRedirect, false, 35769, new Class[]{com.max.hbcommon.base.adapter.s.e.class, Object.class}, Void.TYPE).isSupported) {
            return;
        }
        f(eVar, baseGameOverviewObj);
    }

    public void f(@dl.d com.max.hbcommon.base.adapter.s.e viewHolder, @dl.d BaseGameOverviewObj data) {
        if (PatchProxy.proxy(new Object[]{viewHolder, data}, this, changeQuickRedirect, false, 35767, new Class[]{com.max.hbcommon.base.adapter.s.e.class, BaseGameOverviewObj.class}, Void.TYPE).isSupported) {
            return;
        }
        f0.p(viewHolder, "viewHolder");
        f0.p(data, "data");
        viewHolder.setIsRecyclable(false);
        if (data instanceof GameOverviewCalendarListObj) {
            View viewI = viewHolder.i(R.id.tv_title);
            f0.o(viewI, "viewHolder.getView(R.id.tv_title)");
            View viewI2 = viewHolder.i(R.id.v_filter);
            f0.o(viewI2, "viewHolder.getView(R.id.v_filter)");
            View viewI3 = viewHolder.i(R.id.v_calendar);
            f0.o(viewI3, "viewHolder.getView(R.id.v_calendar)");
            Dota2CalendarView dota2CalendarView = (Dota2CalendarView) viewI3;
            TextView textView = (TextView) viewHolder.i(R.id.tv_button);
            GameOverviewCalendarListObj gameOverviewCalendarListObj = (GameOverviewCalendarListObj) data;
            ((TextView) viewI).setText(gameOverviewCalendarListObj.getTitle());
            dota2CalendarView.setData(gameOverviewCalendarListObj.getCalendar());
            g(this.f85869a.b(), (SegmentFilterView) viewI2, gameOverviewCalendarListObj, dota2CalendarView);
            textView.setText("全部活动 \uf0da");
            textView.setTypeface(bb.d.a().b(0));
            textView.setBackground(com.max.hbutils.utils.q.d(this.f85869a.b(), R.color.white_alpha5, R.color.white_alpha4, ViewUtils.o(this.f85869a.b(), textView)));
            textView.setOnClickListener(new a());
        }
    }

    public final void g(@dl.d Context context, @dl.d SegmentFilterView segmentFilterView, @dl.d GameOverviewCalendarListObj data, @dl.d Dota2CalendarView v_calendar) {
        if (PatchProxy.proxy(new Object[]{context, segmentFilterView, data, v_calendar}, this, changeQuickRedirect, false, 35768, new Class[]{Context.class, SegmentFilterView.class, GameOverviewCalendarListObj.class, Dota2CalendarView.class}, Void.TYPE).isSupported) {
            return;
        }
        f0.p(context, "context");
        f0.p(segmentFilterView, "segmentFilterView");
        f0.p(data, "data");
        f0.p(v_calendar, "v_calendar");
        ArrayList arrayList = new ArrayList();
        KeyDescObj keyDescObj = new KeyDescObj();
        keyDescObj.setDesc("场次");
        keyDescObj.setKey("0");
        Boolean win = data.getWin();
        Boolean bool = Boolean.TRUE;
        keyDescObj.setChecked(!f0.g(win, bool));
        arrayList.add(keyDescObj);
        KeyDescObj keyDescObj2 = new KeyDescObj();
        keyDescObj2.setDesc("胜率");
        keyDescObj2.setKey("1");
        keyDescObj2.setChecked(f0.g(data.getWin(), bool));
        arrayList.add(keyDescObj2);
        segmentFilterView.setLittleWhiteStyle();
        segmentFilterView.setMOnTabCheckedListener(new b(data, v_calendar));
        segmentFilterView.setData(arrayList);
        segmentFilterView.d();
    }

    @dl.d
    public final com.max.xiaoheihe.module.game.adapter.overview.d h() {
        return this.f85869a;
    }
}
