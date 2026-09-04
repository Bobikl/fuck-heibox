package com.max.xiaoheihe.module.game;

import android.app.Activity;
import android.content.Context;
import android.content.DialogInterface;
import android.util.Log;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.DecelerateInterpolator;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import androidx.recyclerview.widget.SimpleItemAnimator;
import androidx.viewpager2.widget.ViewPager2;
import com.google.android.material.tabs.TabLayout;
import com.max.hbcommon.bean.segmentfilter.FilterGroup;
import com.max.hbcommon.component.FilterButtonView;
import com.max.hbcommon.component.segmentfilters.SecondaryWindowSegmentFilterView;
import com.max.hbcustomview.loadingdialog.LoadingDialog;
import com.max.hbcustomview.tickerview.TickerUtils;
import com.max.hbcustomview.tickerview.TickerView;
import com.max.hbminiprogram.NativeLittleProgramFragment;
import com.max.hbutils.bean.Result;
import com.max.hbutils.utils.ViewUtils;
import com.max.xiaoheihe.R;
import com.max.xiaoheihe.bean.game.CalendarGameCountObj;
import com.max.xiaoheihe.bean.game.CalendarGameGroupListObj;
import com.max.xiaoheihe.bean.game.CalendarGameGroupObj;
import com.max.xiaoheihe.bean.game.GameObj;
import com.max.xiaoheihe.bean.game.GamePublishBaseObj;
import com.max.xiaoheihe.bean.game.PublishGameTitle;
import com.max.xiaoheihe.bean.game.calendar.DayObj;
import com.max.xiaoheihe.bean.game.calendar.FilterGroupListObj;
import com.max.xiaoheihe.bean.game.calendar.GameEventCountDownObj;
import com.max.xiaoheihe.bean.game.calendar.GameEventObj;
import com.max.xiaoheihe.bean.game.calendar.MonthObj;
import com.max.xiaoheihe.module.game.component.CalendarUtils;
import com.max.xiaoheihe.module.game.component.GameEventItemView;
import com.max.xiaoheihe.module.game.component.GameItemView;
import com.max.xiaoheihe.module.game.component.HBCalendarView;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.PatchProxyResult;
import df.i9;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import kotlin.collections.CollectionsKt__CollectionsKt;

/* JADX INFO: compiled from: GamePublishCalendarFragment.kt */
/* JADX INFO: loaded from: classes11.dex */
@kotlin.jvm.internal.t0({"SMAP\nGamePublishCalendarFragment.kt\nKotlin\n*S Kotlin\n*F\n+ 1 GamePublishCalendarFragment.kt\ncom/max/xiaoheihe/module/game/GamePublishCalendarFragment\n+ 2 View.kt\nandroidx/core/view/ViewKt\n*L\n1#1,989:1\n262#2,2:990\n262#2,2:992\n262#2,2:994\n262#2,2:996\n262#2,2:998\n*S KotlinDebug\n*F\n+ 1 GamePublishCalendarFragment.kt\ncom/max/xiaoheihe/module/game/GamePublishCalendarFragment\n*L\n492#1:990,2\n494#1:992,2\n507#1:994,2\n510#1:996,2\n674#1:998,2\n*E\n"})
@n9.a({com.max.hbminiprogram.d.class})
@com.max.hbcommon.analytics.m(path = lb.d.f131139c4)
@androidx.compose.runtime.internal.o(parameters = 0)
public final class GamePublishCalendarFragment extends NativeLittleProgramFragment implements com.max.hbminiprogram.d {
    public static final int E = 8;
    public static ChangeQuickRedirect changeQuickRedirect;

    @dl.e
    private LoadingDialog A;

    @dl.e
    private com.max.xiaoheihe.module.component.a B;

    @dl.e
    private GameEventCountDownObj D;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    private i9 f84567p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    @dl.e
    private com.max.hbcommon.base.adapter.u<PublishGameTitle> f84568q;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    @dl.e
    private com.max.hbcommon.base.adapter.t f84570s;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    @dl.e
    private FilterGroupListObj f84573v;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    private HBCalendarView f84576y;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    private View f84577z;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    @dl.d
    private final List<PublishGameTitle> f84569r = new ArrayList();

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    @dl.d
    private final List<PublishGameTitle> f84571t = new ArrayList();

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    @dl.d
    private List<CalendarGameGroupListObj> f84572u = new ArrayList();

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    @dl.d
    private final kotlinx.coroutines.q0 f84574w = kotlinx.coroutines.r0.a(kotlinx.coroutines.e1.e());

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    private boolean f84575x = true;
    private boolean C = true;

    /* JADX INFO: compiled from: GamePublishCalendarFragment.kt */
    @androidx.compose.runtime.internal.o(parameters = 0)
    public static final class a {
        public static ChangeQuickRedirect changeQuickRedirect = null;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public static final int f84578d = 8;

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        @dl.e
        private CalendarGameGroupListObj f84579a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        @dl.e
        private CalendarGameCountObj f84580b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        @dl.e
        private FilterGroupListObj f84581c;

        public a(@dl.e CalendarGameGroupListObj calendarGameGroupListObj, @dl.e CalendarGameCountObj calendarGameCountObj, @dl.e FilterGroupListObj filterGroupListObj) {
            this.f84579a = calendarGameGroupListObj;
            this.f84580b = calendarGameCountObj;
            this.f84581c = filterGroupListObj;
        }

        public static /* synthetic */ a e(a aVar, CalendarGameGroupListObj calendarGameGroupListObj, CalendarGameCountObj calendarGameCountObj, FilterGroupListObj filterGroupListObj, int i10, Object obj) {
            PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{aVar, calendarGameGroupListObj, calendarGameCountObj, filterGroupListObj, new Integer(i10), obj}, null, changeQuickRedirect, true, 33403, new Class[]{a.class, CalendarGameGroupListObj.class, CalendarGameCountObj.class, FilterGroupListObj.class, Integer.TYPE, Object.class}, a.class);
            if (patchProxyResultProxy.isSupported) {
                return (a) patchProxyResultProxy.result;
            }
            if ((i10 & 1) != 0) {
                calendarGameGroupListObj = aVar.f84579a;
            }
            if ((i10 & 2) != 0) {
                calendarGameCountObj = aVar.f84580b;
            }
            if ((i10 & 4) != 0) {
                filterGroupListObj = aVar.f84581c;
            }
            return aVar.d(calendarGameGroupListObj, calendarGameCountObj, filterGroupListObj);
        }

        @dl.e
        public final CalendarGameGroupListObj a() {
            return this.f84579a;
        }

        @dl.e
        public final CalendarGameCountObj b() {
            return this.f84580b;
        }

        @dl.e
        public final FilterGroupListObj c() {
            return this.f84581c;
        }

        @dl.d
        public final a d(@dl.e CalendarGameGroupListObj calendarGameGroupListObj, @dl.e CalendarGameCountObj calendarGameCountObj, @dl.e FilterGroupListObj filterGroupListObj) {
            PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{calendarGameGroupListObj, calendarGameCountObj, filterGroupListObj}, this, changeQuickRedirect, false, 33402, new Class[]{CalendarGameGroupListObj.class, CalendarGameCountObj.class, FilterGroupListObj.class}, a.class);
            return patchProxyResultProxy.isSupported ? (a) patchProxyResultProxy.result : new a(calendarGameGroupListObj, calendarGameCountObj, filterGroupListObj);
        }

        public boolean equals(@dl.e Object obj) {
            PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{obj}, this, changeQuickRedirect, false, 33406, new Class[]{Object.class}, Boolean.TYPE);
            if (patchProxyResultProxy.isSupported) {
                return ((Boolean) patchProxyResultProxy.result).booleanValue();
            }
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof a)) {
                return false;
            }
            a aVar = (a) obj;
            return kotlin.jvm.internal.f0.g(this.f84579a, aVar.f84579a) && kotlin.jvm.internal.f0.g(this.f84580b, aVar.f84580b) && kotlin.jvm.internal.f0.g(this.f84581c, aVar.f84581c);
        }

        @dl.e
        public final FilterGroupListObj f() {
            return this.f84581c;
        }

        @dl.e
        public final CalendarGameCountObj g() {
            return this.f84580b;
        }

        @dl.e
        public final CalendarGameGroupListObj h() {
            return this.f84579a;
        }

        public int hashCode() {
            PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 33405, new Class[0], Integer.TYPE);
            if (patchProxyResultProxy.isSupported) {
                return ((Integer) patchProxyResultProxy.result).intValue();
            }
            CalendarGameGroupListObj calendarGameGroupListObj = this.f84579a;
            int iHashCode = (calendarGameGroupListObj == null ? 0 : calendarGameGroupListObj.hashCode()) * 31;
            CalendarGameCountObj calendarGameCountObj = this.f84580b;
            int iHashCode2 = (iHashCode + (calendarGameCountObj == null ? 0 : calendarGameCountObj.hashCode())) * 31;
            FilterGroupListObj filterGroupListObj = this.f84581c;
            return iHashCode2 + (filterGroupListObj != null ? filterGroupListObj.hashCode() : 0);
        }

        public final void i(@dl.e FilterGroupListObj filterGroupListObj) {
            this.f84581c = filterGroupListObj;
        }

        public final void j(@dl.e CalendarGameCountObj calendarGameCountObj) {
            this.f84580b = calendarGameCountObj;
        }

        public final void k(@dl.e CalendarGameGroupListObj calendarGameGroupListObj) {
            this.f84579a = calendarGameGroupListObj;
        }

        @dl.d
        public String toString() {
            PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 33404, new Class[0], String.class);
            if (patchProxyResultProxy.isSupported) {
                return (String) patchProxyResultProxy.result;
            }
            return "AllThing(gameListObj=" + this.f84579a + ", gameCountObj=" + this.f84580b + ", filterGroup=" + this.f84581c + ')';
        }
    }

    /* JADX INFO: compiled from: GamePublishCalendarFragment.kt */
    @androidx.compose.runtime.internal.o(parameters = 0)
    public static final class b {
        public static ChangeQuickRedirect changeQuickRedirect = null;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public static final int f84582d = 8;

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        @dl.e
        private CalendarGameGroupListObj f84583a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        @dl.e
        private CalendarGameCountObj f84584b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        @dl.e
        private CalendarGameGroupObj f84585c;

        public b(@dl.e CalendarGameGroupListObj calendarGameGroupListObj, @dl.e CalendarGameCountObj calendarGameCountObj, @dl.e CalendarGameGroupObj calendarGameGroupObj) {
            this.f84583a = calendarGameGroupListObj;
            this.f84584b = calendarGameCountObj;
            this.f84585c = calendarGameGroupObj;
        }

        public static /* synthetic */ b e(b bVar, CalendarGameGroupListObj calendarGameGroupListObj, CalendarGameCountObj calendarGameCountObj, CalendarGameGroupObj calendarGameGroupObj, int i10, Object obj) {
            PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{bVar, calendarGameGroupListObj, calendarGameCountObj, calendarGameGroupObj, new Integer(i10), obj}, null, changeQuickRedirect, true, 33408, new Class[]{b.class, CalendarGameGroupListObj.class, CalendarGameCountObj.class, CalendarGameGroupObj.class, Integer.TYPE, Object.class}, b.class);
            if (patchProxyResultProxy.isSupported) {
                return (b) patchProxyResultProxy.result;
            }
            if ((i10 & 1) != 0) {
                calendarGameGroupListObj = bVar.f84583a;
            }
            if ((i10 & 2) != 0) {
                calendarGameCountObj = bVar.f84584b;
            }
            if ((i10 & 4) != 0) {
                calendarGameGroupObj = bVar.f84585c;
            }
            return bVar.d(calendarGameGroupListObj, calendarGameCountObj, calendarGameGroupObj);
        }

        @dl.e
        public final CalendarGameGroupListObj a() {
            return this.f84583a;
        }

        @dl.e
        public final CalendarGameCountObj b() {
            return this.f84584b;
        }

        @dl.e
        public final CalendarGameGroupObj c() {
            return this.f84585c;
        }

        @dl.d
        public final b d(@dl.e CalendarGameGroupListObj calendarGameGroupListObj, @dl.e CalendarGameCountObj calendarGameCountObj, @dl.e CalendarGameGroupObj calendarGameGroupObj) {
            PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{calendarGameGroupListObj, calendarGameCountObj, calendarGameGroupObj}, this, changeQuickRedirect, false, 33407, new Class[]{CalendarGameGroupListObj.class, CalendarGameCountObj.class, CalendarGameGroupObj.class}, b.class);
            return patchProxyResultProxy.isSupported ? (b) patchProxyResultProxy.result : new b(calendarGameGroupListObj, calendarGameCountObj, calendarGameGroupObj);
        }

        public boolean equals(@dl.e Object obj) {
            PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{obj}, this, changeQuickRedirect, false, 33411, new Class[]{Object.class}, Boolean.TYPE);
            if (patchProxyResultProxy.isSupported) {
                return ((Boolean) patchProxyResultProxy.result).booleanValue();
            }
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof b)) {
                return false;
            }
            b bVar = (b) obj;
            return kotlin.jvm.internal.f0.g(this.f84583a, bVar.f84583a) && kotlin.jvm.internal.f0.g(this.f84584b, bVar.f84584b) && kotlin.jvm.internal.f0.g(this.f84585c, bVar.f84585c);
        }

        @dl.e
        public final CalendarGameCountObj f() {
            return this.f84584b;
        }

        @dl.e
        public final CalendarGameGroupListObj g() {
            return this.f84583a;
        }

        @dl.e
        public final CalendarGameGroupObj h() {
            return this.f84585c;
        }

        public int hashCode() {
            PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 33410, new Class[0], Integer.TYPE);
            if (patchProxyResultProxy.isSupported) {
                return ((Integer) patchProxyResultProxy.result).intValue();
            }
            CalendarGameGroupListObj calendarGameGroupListObj = this.f84583a;
            int iHashCode = (calendarGameGroupListObj == null ? 0 : calendarGameGroupListObj.hashCode()) * 31;
            CalendarGameCountObj calendarGameCountObj = this.f84584b;
            int iHashCode2 = (iHashCode + (calendarGameCountObj == null ? 0 : calendarGameCountObj.hashCode())) * 31;
            CalendarGameGroupObj calendarGameGroupObj = this.f84585c;
            return iHashCode2 + (calendarGameGroupObj != null ? calendarGameGroupObj.hashCode() : 0);
        }

        public final void i(@dl.e CalendarGameCountObj calendarGameCountObj) {
            this.f84584b = calendarGameCountObj;
        }

        public final void j(@dl.e CalendarGameGroupListObj calendarGameGroupListObj) {
            this.f84583a = calendarGameGroupListObj;
        }

        public final void k(@dl.e CalendarGameGroupObj calendarGameGroupObj) {
            this.f84585c = calendarGameGroupObj;
        }

        @dl.d
        public String toString() {
            PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 33409, new Class[0], String.class);
            if (patchProxyResultProxy.isSupported) {
                return (String) patchProxyResultProxy.result;
            }
            return "AllThingWithFilter(gameListObj=" + this.f84583a + ", gameCountObj=" + this.f84584b + ", singleDayGroup=" + this.f84585c + ')';
        }
    }

    /* JADX INFO: compiled from: GamePublishCalendarFragment.kt */
    @androidx.compose.runtime.internal.o(parameters = 0)
    public static final class c extends com.max.hbcommon.base.adapter.u<PublishGameTitle> {
        public static ChangeQuickRedirect changeQuickRedirect = null;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public static final int f84586d = 8;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        @dl.d
        private final Context f84587b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private final int f84588c;

        /* JADX INFO: compiled from: GamePublishCalendarFragment.kt */
        public static final class a implements View.OnClickListener {
            public static ChangeQuickRedirect changeQuickRedirect;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            final /* synthetic */ PublishGameTitle f84589b;

            /* JADX INFO: renamed from: c, reason: collision with root package name */
            final /* synthetic */ GameEventItemView f84590c;

            a(PublishGameTitle publishGameTitle, GameEventItemView gameEventItemView) {
                this.f84589b = publishGameTitle;
                this.f84590c = gameEventItemView;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                if (PatchProxy.proxy(new Object[]{view}, this, changeQuickRedirect, false, 33417, new Class[]{View.class}, Void.TYPE).isSupported) {
                    return;
                }
                GameEventObj event = this.f84589b.getEvent();
                if (com.max.hbcommon.utils.c.u(event != null ? event.getProtocol() : null)) {
                    return;
                }
                Context context = this.f84590c.getContext();
                kotlin.jvm.internal.f0.o(context, "context");
                GameEventObj event2 = this.f84589b.getEvent();
                com.max.xiaoheihe.base.router.b.k0(context, event2 != null ? event2.getProtocol() : null);
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public c(@dl.d Context context, @dl.d List<PublishGameTitle> list, int i10) {
            super(context, list);
            kotlin.jvm.internal.f0.p(context, "context");
            kotlin.jvm.internal.f0.p(list, "list");
            this.f84587b = context;
            this.f84588c = i10;
        }

        public /* synthetic */ c(Context context, List list, int i10, int i11, kotlin.jvm.internal.u uVar) {
            this(context, list, (i11 & 4) != 0 ? 0 : i10);
        }

        private final void r(com.max.hbcommon.base.adapter.s.e eVar) {
            if (PatchProxy.proxy(new Object[]{eVar}, this, changeQuickRedirect, false, 33414, new Class[]{com.max.hbcommon.base.adapter.s.e.class}, Void.TYPE).isSupported) {
                return;
            }
            ViewGroup.LayoutParams layoutParams = eVar.itemView.getLayoutParams();
            kotlin.jvm.internal.f0.n(layoutParams, "null cannot be cast to non-null type android.view.ViewGroup.MarginLayoutParams");
            ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) layoutParams;
            int absoluteAdapterPosition = (eVar.getAbsoluteAdapterPosition() - 1) - this.f84588c;
            int absoluteAdapterPosition2 = (eVar.getAbsoluteAdapterPosition() + 1) - this.f84588c;
            if (absoluteAdapterPosition >= 0 && absoluteAdapterPosition < getDataList().size()) {
                if (getDataList().get(absoluteAdapterPosition).isTitle()) {
                    marginLayoutParams.topMargin = ViewUtils.f(this.f84587b, 6.0f);
                } else {
                    marginLayoutParams.topMargin = 0;
                }
            }
            if (absoluteAdapterPosition2 < 0 || absoluteAdapterPosition2 >= getDataList().size()) {
                return;
            }
            if (getDataList().get(absoluteAdapterPosition2).isTitle()) {
                marginLayoutParams.bottomMargin = ViewUtils.f(this.f84587b, 6.0f);
            } else {
                marginLayoutParams.bottomMargin = 0;
            }
        }

        @Override // com.max.hbcommon.base.adapter.u
        public /* bridge */ /* synthetic */ int m(int i10, PublishGameTitle publishGameTitle) {
            Object[] objArr = {new Integer(i10), publishGameTitle};
            ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
            Class cls = Integer.TYPE;
            PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(objArr, this, changeQuickRedirect2, false, 33415, new Class[]{cls, Object.class}, cls);
            return patchProxyResultProxy.isSupported ? ((Integer) patchProxyResultProxy.result).intValue() : p(i10, publishGameTitle);
        }

        @dl.d
        public final Context n() {
            return this.f84587b;
        }

        public final int o() {
            return this.f84588c;
        }

        @Override // com.max.hbcommon.base.adapter.s
        public /* bridge */ /* synthetic */ void onBindViewHolder(com.max.hbcommon.base.adapter.s.e eVar, Object obj) {
            if (PatchProxy.proxy(new Object[]{eVar, obj}, this, changeQuickRedirect, false, 33416, new Class[]{com.max.hbcommon.base.adapter.s.e.class, Object.class}, Void.TYPE).isSupported) {
                return;
            }
            q(eVar, (PublishGameTitle) obj);
        }

        public int p(int i10, @dl.e PublishGameTitle publishGameTitle) {
            Integer num = new Integer(i10);
            boolean z10 = false;
            ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
            Class cls = Integer.TYPE;
            PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{num, publishGameTitle}, this, changeQuickRedirect2, false, 33412, new Class[]{cls, PublishGameTitle.class}, cls);
            if (patchProxyResultProxy.isSupported) {
                return ((Integer) patchProxyResultProxy.result).intValue();
            }
            if (publishGameTitle != null && publishGameTitle.isGame()) {
                return R.layout.component_game_game_list_normal;
            }
            if (publishGameTitle != null && publishGameTitle.isEvent()) {
                z10 = true;
            }
            return z10 ? R.layout.layout_game_event_item : R.layout.item_game_publish_title;
        }

        public void q(@dl.e com.max.hbcommon.base.adapter.s.e eVar, @dl.e PublishGameTitle publishGameTitle) {
            if (PatchProxy.proxy(new Object[]{eVar, publishGameTitle}, this, changeQuickRedirect, false, 33413, new Class[]{com.max.hbcommon.base.adapter.s.e.class, PublishGameTitle.class}, Void.TYPE).isSupported || eVar == null || publishGameTitle == null) {
                return;
            }
            int iD = eVar.d();
            if (iD == R.layout.component_game_game_list_normal) {
                r(eVar);
                GameItemView giv = (GameItemView) eVar.i(R.id.giv);
                GameObj game = publishGameTitle.getGame();
                kotlin.jvm.internal.f0.m(game);
                game.setRelease_timestamp(publishGameTitle.getDay_timestamp());
                kotlin.jvm.internal.f0.o(giv, "giv");
                GameObj game2 = publishGameTitle.getGame();
                kotlin.jvm.internal.f0.m(game2);
                GameItemView.h(giv, game2, "calendar", null, false, null, null, 60, null);
                return;
            }
            if (iD != R.layout.layout_game_event_item) {
                ((TextView) eVar.i(R.id.tv_title)).setText(publishGameTitle.getTitle());
                return;
            }
            r(eVar);
            GameEventItemView gameEventItemView = (GameEventItemView) eVar.i(R.id.v_game_event_item);
            if (gameEventItemView != null) {
                kotlin.jvm.internal.f0.o(gameEventItemView, "getView<GameEventItemView>(R.id.v_game_event_item)");
                gameEventItemView.setData(publishGameTitle.getEvent());
                gameEventItemView.setOnClickListener(new a(publishGameTitle, gameEventItemView));
            }
        }
    }

    /* JADX INFO: compiled from: GamePublishCalendarFragment.kt */
    public static final class d<T1, T2, T3, R> implements kh.h {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final d<T1, T2, T3, R> f84591a = new d<>();
        public static ChangeQuickRedirect changeQuickRedirect;

        d() {
        }

        @Override // kh.h
        public /* bridge */ /* synthetic */ Object a(Object obj, Object obj2, Object obj3) {
            PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{obj, obj2, obj3}, this, changeQuickRedirect, false, 33419, new Class[]{Object.class, Object.class, Object.class}, Object.class);
            return patchProxyResultProxy.isSupported ? patchProxyResultProxy.result : b((Result) obj, (Result) obj2, (Result) obj3);
        }

        @dl.d
        public final a b(@dl.d Result<CalendarGameGroupListObj> calendarGameListResult, @dl.d Result<CalendarGameCountObj> calendarGameCountResult, @dl.d Result<FilterGroupListObj> filterResult) {
            PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{calendarGameListResult, calendarGameCountResult, filterResult}, this, changeQuickRedirect, false, 33418, new Class[]{Result.class, Result.class, Result.class}, a.class);
            if (patchProxyResultProxy.isSupported) {
                return (a) patchProxyResultProxy.result;
            }
            kotlin.jvm.internal.f0.p(calendarGameListResult, "calendarGameListResult");
            kotlin.jvm.internal.f0.p(calendarGameCountResult, "calendarGameCountResult");
            kotlin.jvm.internal.f0.p(filterResult, "filterResult");
            return new a(calendarGameListResult.getResult(), calendarGameCountResult.getResult(), filterResult.getResult());
        }
    }

    /* JADX INFO: compiled from: GamePublishCalendarFragment.kt */
    public static final class e<T1, T2, T3, R> implements kh.h {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final e<T1, T2, T3, R> f84592a = new e<>();
        public static ChangeQuickRedirect changeQuickRedirect;

        e() {
        }

        @Override // kh.h
        public /* bridge */ /* synthetic */ Object a(Object obj, Object obj2, Object obj3) {
            PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{obj, obj2, obj3}, this, changeQuickRedirect, false, 33428, new Class[]{Object.class, Object.class, Object.class}, Object.class);
            return patchProxyResultProxy.isSupported ? patchProxyResultProxy.result : b((Result) obj, (Result) obj2, (Result) obj3);
        }

        @dl.d
        public final b b(@dl.d Result<CalendarGameGroupListObj> calendarGameListResult, @dl.d Result<CalendarGameCountObj> calendarGameCountResult, @dl.d Result<CalendarGameGroupObj> singleDayResult) {
            PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{calendarGameListResult, calendarGameCountResult, singleDayResult}, this, changeQuickRedirect, false, 33427, new Class[]{Result.class, Result.class, Result.class}, b.class);
            if (patchProxyResultProxy.isSupported) {
                return (b) patchProxyResultProxy.result;
            }
            kotlin.jvm.internal.f0.p(calendarGameListResult, "calendarGameListResult");
            kotlin.jvm.internal.f0.p(calendarGameCountResult, "calendarGameCountResult");
            kotlin.jvm.internal.f0.p(singleDayResult, "singleDayResult");
            return new b(calendarGameListResult.getResult(), calendarGameCountResult.getResult(), singleDayResult.getResult());
        }
    }

    /* JADX INFO: compiled from: GamePublishCalendarFragment.kt */
    public static final class f extends com.max.hbcommon.network.d<b> {
        public static ChangeQuickRedirect changeQuickRedirect;

        f() {
        }

        public void a(@dl.d b result) {
            if (PatchProxy.proxy(new Object[]{result}, this, changeQuickRedirect, false, 33430, new Class[]{b.class}, Void.TYPE).isSupported) {
                return;
            }
            kotlin.jvm.internal.f0.p(result, "result");
            if (GamePublishCalendarFragment.this.isActive()) {
                super.onNext(result);
                GamePublishCalendarFragment.this.f84569r.clear();
                GamePublishCalendarFragment.this.f84572u.clear();
                GamePublishCalendarFragment.D5(GamePublishCalendarFragment.this, result.g(), false, 2, null);
                HBCalendarView hBCalendarView = GamePublishCalendarFragment.this.f84576y;
                if (hBCalendarView == null) {
                    kotlin.jvm.internal.f0.S("viewCalendar");
                    hBCalendarView = null;
                }
                CalendarGameCountObj calendarGameCountObjF = result.f();
                hBCalendarView.g(calendarGameCountObjF != null ? calendarGameCountObjF.getCount_by_month() : null);
                GamePublishCalendarFragment.Z4(GamePublishCalendarFragment.this, result.h());
                GamePublishCalendarFragment.W4(GamePublishCalendarFragment.this);
            }
        }

        @Override // com.max.hbcommon.network.d, io.reactivex.g0
        public void onError(@dl.d Throwable e10) {
            if (PatchProxy.proxy(new Object[]{e10}, this, changeQuickRedirect, false, 33429, new Class[]{Throwable.class}, Void.TYPE).isSupported) {
                return;
            }
            kotlin.jvm.internal.f0.p(e10, "e");
            if (GamePublishCalendarFragment.this.isActive()) {
                super.onError(e10);
                GamePublishCalendarFragment.j5(GamePublishCalendarFragment.this);
            }
        }

        @Override // com.max.hbcommon.network.d, io.reactivex.g0
        public /* bridge */ /* synthetic */ void onNext(Object obj) {
            if (PatchProxy.proxy(new Object[]{obj}, this, changeQuickRedirect, false, 33431, new Class[]{Object.class}, Void.TYPE).isSupported) {
                return;
            }
            a((b) obj);
        }
    }

    /* JADX INFO: compiled from: GamePublishCalendarFragment.kt */
    public static final class g extends com.max.hbcommon.network.d<Result<CalendarGameGroupListObj>> {
        public static ChangeQuickRedirect changeQuickRedirect;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ String f84595c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        final /* synthetic */ boolean f84596d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        final /* synthetic */ String f84597e;

        g(String str, boolean z10, String str2) {
            this.f84595c = str;
            this.f84596d = z10;
            this.f84597e = str2;
        }

        @Override // com.max.hbcommon.network.d, io.reactivex.g0
        public void onError(@dl.d Throwable e10) {
            if (PatchProxy.proxy(new Object[]{e10}, this, changeQuickRedirect, false, 33432, new Class[]{Throwable.class}, Void.TYPE).isSupported) {
                return;
            }
            kotlin.jvm.internal.f0.p(e10, "e");
            if (GamePublishCalendarFragment.this.isActive()) {
                super.onError(e10);
                i9 i9Var = GamePublishCalendarFragment.this.f84567p;
                i9 i9Var2 = null;
                if (i9Var == null) {
                    kotlin.jvm.internal.f0.S("binding");
                    i9Var = null;
                }
                i9Var.f111693g.P();
                i9 i9Var3 = GamePublishCalendarFragment.this.f84567p;
                if (i9Var3 == null) {
                    kotlin.jvm.internal.f0.S("binding");
                } else {
                    i9Var2 = i9Var3;
                }
                i9Var2.f111693g.w();
                GamePublishCalendarFragment.j5(GamePublishCalendarFragment.this);
            }
        }

        public void onNext(@dl.d Result<CalendarGameGroupListObj> result) {
            if (PatchProxy.proxy(new Object[]{result}, this, changeQuickRedirect, false, 33433, new Class[]{Result.class}, Void.TYPE).isSupported) {
                return;
            }
            kotlin.jvm.internal.f0.p(result, "result");
            if (GamePublishCalendarFragment.this.isActive()) {
                if (this.f84595c != null) {
                    GamePublishCalendarFragment.this.f84572u.clear();
                }
                GamePublishCalendarFragment.Y4(GamePublishCalendarFragment.this, result.getResult(), this.f84596d);
                i9 i9Var = null;
                if (!com.max.hbcommon.utils.c.u(this.f84597e)) {
                    GamePublishCalendarFragment.d5(GamePublishCalendarFragment.this, this.f84597e);
                } else if (this.f84595c != null) {
                    GamePublishCalendarFragment gamePublishCalendarFragment = GamePublishCalendarFragment.this;
                    i9 i9Var2 = gamePublishCalendarFragment.f84567p;
                    if (i9Var2 == null) {
                        kotlin.jvm.internal.f0.S("binding");
                        i9Var2 = null;
                    }
                    i9Var2.f111691e.scrollTo(0, 0);
                    if (gamePublishCalendarFragment.f84569r.size() > 0) {
                        i9 i9Var3 = gamePublishCalendarFragment.f84567p;
                        if (i9Var3 == null) {
                            kotlin.jvm.internal.f0.S("binding");
                            i9Var3 = null;
                        }
                        i9Var3.f111691e.scrollToPosition(0);
                    }
                }
                i9 i9Var4 = GamePublishCalendarFragment.this.f84567p;
                if (i9Var4 == null) {
                    kotlin.jvm.internal.f0.S("binding");
                    i9Var4 = null;
                }
                i9Var4.f111693g.P();
                i9 i9Var5 = GamePublishCalendarFragment.this.f84567p;
                if (i9Var5 == null) {
                    kotlin.jvm.internal.f0.S("binding");
                } else {
                    i9Var = i9Var5;
                }
                i9Var.f111693g.w();
                super.onNext(result);
            }
        }

        @Override // com.max.hbcommon.network.d, io.reactivex.g0
        public /* bridge */ /* synthetic */ void onNext(Object obj) {
            if (PatchProxy.proxy(new Object[]{obj}, this, changeQuickRedirect, false, 33434, new Class[]{Object.class}, Void.TYPE).isSupported) {
                return;
            }
            onNext((Result<CalendarGameGroupListObj>) obj);
        }
    }

    /* JADX INFO: compiled from: GamePublishCalendarFragment.kt */
    public static final class h extends com.max.hbcommon.network.d<Result<CalendarGameGroupObj>> {
        public static ChangeQuickRedirect changeQuickRedirect;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ String f84602c;

        h(String str) {
            this.f84602c = str;
        }

        @Override // com.max.hbcommon.network.d, io.reactivex.g0
        public void onError(@dl.d Throwable e10) {
            if (PatchProxy.proxy(new Object[]{e10}, this, changeQuickRedirect, false, 33435, new Class[]{Throwable.class}, Void.TYPE).isSupported) {
                return;
            }
            kotlin.jvm.internal.f0.p(e10, "e");
            if (GamePublishCalendarFragment.this.isActive()) {
                super.onError(e10);
            }
        }

        public void onNext(@dl.d Result<CalendarGameGroupObj> result) {
            if (PatchProxy.proxy(new Object[]{result}, this, changeQuickRedirect, false, 33436, new Class[]{Result.class}, Void.TYPE).isSupported) {
                return;
            }
            kotlin.jvm.internal.f0.p(result, "result");
            if (GamePublishCalendarFragment.this.isActive()) {
                super.onNext(result);
                long jR = com.max.hbutils.utils.n.r(this.f84602c);
                HBCalendarView hBCalendarView = GamePublishCalendarFragment.this.f84576y;
                if (hBCalendarView == null) {
                    kotlin.jvm.internal.f0.S("viewCalendar");
                    hBCalendarView = null;
                }
                if (jR == hBCalendarView.getSelectDayTimestamp()) {
                    CalendarGameGroupObj result2 = result.getResult();
                    if (result2 != null) {
                        result2.setDay_timestamp(this.f84602c);
                    }
                    GamePublishCalendarFragment.Z4(GamePublishCalendarFragment.this, result.getResult());
                }
            }
        }

        @Override // com.max.hbcommon.network.d, io.reactivex.g0
        public /* bridge */ /* synthetic */ void onNext(Object obj) {
            if (PatchProxy.proxy(new Object[]{obj}, this, changeQuickRedirect, false, 33437, new Class[]{Object.class}, Void.TYPE).isSupported) {
                return;
            }
            onNext((Result<CalendarGameGroupObj>) obj);
        }
    }

    /* JADX INFO: compiled from: GamePublishCalendarFragment.kt */
    @kotlin.jvm.internal.t0({"SMAP\nGamePublishCalendarFragment.kt\nKotlin\n*S Kotlin\n*F\n+ 1 GamePublishCalendarFragment.kt\ncom/max/xiaoheihe/module/game/GamePublishCalendarFragment$installViews$1\n+ 2 View.kt\nandroidx/core/view/ViewKt\n*L\n1#1,989:1\n260#2:990\n*S KotlinDebug\n*F\n+ 1 GamePublishCalendarFragment.kt\ncom/max/xiaoheihe/module/game/GamePublishCalendarFragment$installViews$1\n*L\n120#1:990\n*E\n"})
    public static final class i implements View.OnClickListener {
        public static ChangeQuickRedirect changeQuickRedirect;

        i() {
        }

        @Override // android.view.View.OnClickListener
        public final void onClick(View view) {
            if (PatchProxy.proxy(new Object[]{view}, this, changeQuickRedirect, false, 33438, new Class[]{View.class}, Void.TYPE).isSupported) {
                return;
            }
            i9 i9Var = GamePublishCalendarFragment.this.f84567p;
            i9 i9Var2 = null;
            if (i9Var == null) {
                kotlin.jvm.internal.f0.S("binding");
                i9Var = null;
            }
            LinearLayout linearLayout = i9Var.f111703q;
            kotlin.jvm.internal.f0.o(linearLayout, "binding.vgSingleDay");
            if (linearLayout.getVisibility() == 0) {
                i9 i9Var3 = GamePublishCalendarFragment.this.f84567p;
                if (i9Var3 == null) {
                    kotlin.jvm.internal.f0.S("binding");
                    i9Var3 = null;
                }
                i9Var3.f111703q.setVisibility(8);
                i9 i9Var4 = GamePublishCalendarFragment.this.f84567p;
                if (i9Var4 == null) {
                    kotlin.jvm.internal.f0.S("binding");
                    i9Var4 = null;
                }
                i9Var4.f111693g.setVisibility(0);
                i9 i9Var5 = GamePublishCalendarFragment.this.f84567p;
                if (i9Var5 == null) {
                    kotlin.jvm.internal.f0.S("binding");
                } else {
                    i9Var2 = i9Var5;
                }
                i9Var2.f111690d.setColorFilter(com.max.xiaoheihe.utils.d.E(R.color.text_secondary_1_color));
                return;
            }
            try {
                i9 i9Var6 = GamePublishCalendarFragment.this.f84567p;
                if (i9Var6 == null) {
                    kotlin.jvm.internal.f0.S("binding");
                    i9Var6 = null;
                }
                i9Var6.f111692f.scrollTo(0, 0);
                if (GamePublishCalendarFragment.this.f84571t.size() > 0) {
                    i9 i9Var7 = GamePublishCalendarFragment.this.f84567p;
                    if (i9Var7 == null) {
                        kotlin.jvm.internal.f0.S("binding");
                        i9Var7 = null;
                    }
                    i9Var7.f111692f.scrollToPosition(0);
                }
                i9 i9Var8 = GamePublishCalendarFragment.this.f84567p;
                if (i9Var8 == null) {
                    kotlin.jvm.internal.f0.S("binding");
                    i9Var8 = null;
                }
                i9Var8.f111690d.setColorFilter(com.max.xiaoheihe.utils.d.E(R.color.text_primary_1_color));
                if (GamePublishCalendarFragment.this.f84569r.size() > 0) {
                    i9 i9Var9 = GamePublishCalendarFragment.this.f84567p;
                    if (i9Var9 == null) {
                        kotlin.jvm.internal.f0.S("binding");
                        i9Var9 = null;
                    }
                    RecyclerView.LayoutManager layoutManager = i9Var9.f111691e.getLayoutManager();
                    kotlin.jvm.internal.f0.n(layoutManager, "null cannot be cast to non-null type androidx.recyclerview.widget.LinearLayoutManager");
                    int iMin = Math.min(Math.max(0, ((LinearLayoutManager) layoutManager).findFirstVisibleItemPosition()), GamePublishCalendarFragment.this.f84569r.size() - 1);
                    HBCalendarView hBCalendarView = GamePublishCalendarFragment.this.f84576y;
                    if (hBCalendarView == null) {
                        kotlin.jvm.internal.f0.S("viewCalendar");
                        hBCalendarView = null;
                    }
                    ViewPager2 vp = hBCalendarView.getVp();
                    i9 i9Var10 = GamePublishCalendarFragment.this.f84567p;
                    if (i9Var10 == null) {
                        kotlin.jvm.internal.f0.S("binding");
                        i9Var10 = null;
                    }
                    vp.setCurrentItem(i9Var10.f111694h.getSelectedTabPosition(), false);
                    HBCalendarView hBCalendarView2 = GamePublishCalendarFragment.this.f84576y;
                    if (hBCalendarView2 == null) {
                        kotlin.jvm.internal.f0.S("viewCalendar");
                        hBCalendarView2 = null;
                    }
                    hBCalendarView2.setSelectDay(com.max.hbutils.utils.n.r(((PublishGameTitle) GamePublishCalendarFragment.this.f84569r.get(iMin)).getDay_timestamp()));
                }
                i9 i9Var11 = GamePublishCalendarFragment.this.f84567p;
                if (i9Var11 == null) {
                    kotlin.jvm.internal.f0.S("binding");
                    i9Var11 = null;
                }
                i9Var11.f111703q.setVisibility(0);
                i9 i9Var12 = GamePublishCalendarFragment.this.f84567p;
                if (i9Var12 == null) {
                    kotlin.jvm.internal.f0.S("binding");
                } else {
                    i9Var2 = i9Var12;
                }
                i9Var2.f111693g.setVisibility(8);
            } catch (Throwable th2) {
                Log.e("GamePublishCalendarFragment", "ivCalendar click error  " + th2.getMessage());
            }
        }
    }

    /* JADX INFO: compiled from: GamePublishCalendarFragment.kt */
    public static final class j implements View.OnClickListener {
        public static ChangeQuickRedirect changeQuickRedirect;

        /* JADX INFO: compiled from: GamePublishCalendarFragment.kt */
        public static final class a implements com.max.xiaoheihe.module.component.a.InterfaceC0730a {
            public static ChangeQuickRedirect changeQuickRedirect;

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            final /* synthetic */ HashMap<String, String> f84608a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            final /* synthetic */ GamePublishCalendarFragment f84609b;

            a(HashMap<String, String> map, GamePublishCalendarFragment gamePublishCalendarFragment) {
                this.f84608a = map;
                this.f84609b = gamePublishCalendarFragment;
            }

            @Override // com.max.xiaoheihe.module.component.a.InterfaceC0730a
            public void a() {
                if (PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 33440, new Class[0], Void.TYPE).isSupported || kotlin.jvm.internal.f0.g(this.f84608a, GamePublishCalendarFragment.N4(this.f84609b))) {
                    return;
                }
                GamePublishCalendarFragment.k5(this.f84609b);
                GamePublishCalendarFragment.J4(this.f84609b);
            }
        }

        /* JADX INFO: compiled from: GamePublishCalendarFragment.kt */
        public static final class b implements DialogInterface.OnDismissListener {
            public static ChangeQuickRedirect changeQuickRedirect;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            final /* synthetic */ GamePublishCalendarFragment f84610b;

            b(GamePublishCalendarFragment gamePublishCalendarFragment) {
                this.f84610b = gamePublishCalendarFragment;
            }

            @Override // android.content.DialogInterface.OnDismissListener
            public final void onDismiss(DialogInterface dialogInterface) {
                if (PatchProxy.proxy(new Object[]{dialogInterface}, this, changeQuickRedirect, false, 33441, new Class[]{DialogInterface.class}, Void.TYPE).isSupported) {
                    return;
                }
                i9 i9Var = this.f84610b.f84567p;
                if (i9Var == null) {
                    kotlin.jvm.internal.f0.S("binding");
                    i9Var = null;
                }
                FilterButtonView filterButtonView = i9Var.f111689c;
                com.max.xiaoheihe.module.component.a aVar = this.f84610b.B;
                filterButtonView.setChecked(aVar != null && aVar.l());
            }
        }

        j() {
        }

        @Override // android.view.View.OnClickListener
        public final void onClick(View view) {
            FilterGroupListObj filterGroupListObj;
            List<FilterGroup> filters;
            com.max.hbcommon.component.i iVarH;
            if (PatchProxy.proxy(new Object[]{view}, this, changeQuickRedirect, false, 33439, new Class[]{View.class}, Void.TYPE).isSupported || (filterGroupListObj = GamePublishCalendarFragment.this.f84573v) == null || (filters = filterGroupListObj.getFilters()) == null) {
                return;
            }
            GamePublishCalendarFragment gamePublishCalendarFragment = GamePublishCalendarFragment.this;
            HashMap mapN4 = GamePublishCalendarFragment.N4(gamePublishCalendarFragment);
            if (gamePublishCalendarFragment.B == null) {
                Activity mContext = ((com.max.hbcommon.base.d) gamePublishCalendarFragment).mContext;
                kotlin.jvm.internal.f0.o(mContext, "mContext");
                gamePublishCalendarFragment.B = new com.max.xiaoheihe.module.component.a(mContext, filters);
                com.max.xiaoheihe.module.component.a aVar = gamePublishCalendarFragment.B;
                if (aVar != null) {
                    aVar.n(new a(mapN4, gamePublishCalendarFragment));
                }
                com.max.xiaoheihe.module.component.a aVar2 = gamePublishCalendarFragment.B;
                if (aVar2 != null && (iVarH = aVar2.h()) != null) {
                    iVarH.setOnDismissListener(new b(gamePublishCalendarFragment));
                }
            }
            com.max.xiaoheihe.module.component.a aVar3 = gamePublishCalendarFragment.B;
            if (aVar3 != null) {
                aVar3.o();
            }
        }
    }

    /* JADX INFO: compiled from: GamePublishCalendarFragment.kt */
    public static final class k implements pg.d {
        public static ChangeQuickRedirect changeQuickRedirect;

        k() {
        }

        @Override // pg.d
        public final void k(@dl.d ng.j it) {
            if (PatchProxy.proxy(new Object[]{it}, this, changeQuickRedirect, false, 33442, new Class[]{ng.j.class}, Void.TYPE).isSupported) {
                return;
            }
            kotlin.jvm.internal.f0.p(it, "it");
            GamePublishCalendarFragment.v5(GamePublishCalendarFragment.this, true, null, null, 4, null);
        }
    }

    /* JADX INFO: compiled from: GamePublishCalendarFragment.kt */
    public static final class l implements pg.b {
        public static ChangeQuickRedirect changeQuickRedirect;

        l() {
        }

        @Override // pg.b
        public final void f(@dl.d ng.j it) {
            if (PatchProxy.proxy(new Object[]{it}, this, changeQuickRedirect, false, 33443, new Class[]{ng.j.class}, Void.TYPE).isSupported) {
                return;
            }
            kotlin.jvm.internal.f0.p(it, "it");
            GamePublishCalendarFragment.v5(GamePublishCalendarFragment.this, false, null, null, 4, null);
        }
    }

    /* JADX INFO: compiled from: GamePublishCalendarFragment.kt */
    public static final class m implements HBCalendarView.a {
        public static ChangeQuickRedirect changeQuickRedirect;

        m() {
        }

        @Override // com.max.xiaoheihe.module.game.component.HBCalendarView.a
        public void a(@dl.d MonthObj monthObj, int i10) {
            if (PatchProxy.proxy(new Object[]{monthObj, new Integer(i10)}, this, changeQuickRedirect, false, 33450, new Class[]{MonthObj.class, Integer.TYPE}, Void.TYPE).isSupported) {
                return;
            }
            kotlin.jvm.internal.f0.p(monthObj, "monthObj");
            i9 i9Var = GamePublishCalendarFragment.this.f84567p;
            i9 i9Var2 = null;
            if (i9Var == null) {
                kotlin.jvm.internal.f0.S("binding");
                i9Var = null;
            }
            TabLayout tabLayout = i9Var.f111694h;
            i9 i9Var3 = GamePublishCalendarFragment.this.f84567p;
            if (i9Var3 == null) {
                kotlin.jvm.internal.f0.S("binding");
            } else {
                i9Var2 = i9Var3;
            }
            tabLayout.R(i9Var2.f111694h.D(i10));
        }

        @Override // com.max.xiaoheihe.module.game.component.HBCalendarView.a
        public void b(@dl.e DayObj dayObj) {
            if (PatchProxy.proxy(new Object[]{dayObj}, this, changeQuickRedirect, false, 33449, new Class[]{DayObj.class}, Void.TYPE).isSupported) {
                return;
            }
            CalendarGameGroupObj calendarGameGroupObj = null;
            if (dayObj == null) {
                GamePublishCalendarFragment.Z4(GamePublishCalendarFragment.this, null);
                return;
            }
            Iterator it = GamePublishCalendarFragment.this.f84572u.iterator();
            while (it.hasNext()) {
                List<CalendarGameGroupObj> grouped_game_list = ((CalendarGameGroupListObj) it.next()).getGrouped_game_list();
                if (grouped_game_list != null) {
                    int size = grouped_game_list.size();
                    for (int i10 = 0; i10 < size; i10++) {
                        CalendarGameGroupObj calendarGameGroupObj2 = grouped_game_list.get(i10);
                        if (kotlin.jvm.internal.f0.g(calendarGameGroupObj2.getDay_timestamp(), dayObj.getDay_timestamp())) {
                            if (i10 > 0 && i10 < grouped_game_list.size() - 1) {
                                calendarGameGroupObj = calendarGameGroupObj2;
                                break;
                            }
                            break;
                        }
                    }
                }
            }
            if (calendarGameGroupObj != null) {
                GamePublishCalendarFragment.Z4(GamePublishCalendarFragment.this, calendarGameGroupObj);
            } else {
                GamePublishCalendarFragment.Q4(GamePublishCalendarFragment.this, dayObj.getDay_timestamp());
            }
        }
    }

    /* JADX INFO: compiled from: GamePublishCalendarFragment.kt */
    public static final class n implements View.OnClickListener {
        public static ChangeQuickRedirect changeQuickRedirect;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ TabLayout.h f84614b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ GamePublishCalendarFragment f84615c;

        n(TabLayout.h hVar, GamePublishCalendarFragment gamePublishCalendarFragment) {
            this.f84614b = hVar;
            this.f84615c = gamePublishCalendarFragment;
        }

        @Override // android.view.View.OnClickListener
        public final void onClick(@dl.e View view) {
            if (PatchProxy.proxy(new Object[]{view}, this, changeQuickRedirect, false, 33451, new Class[]{View.class}, Void.TYPE).isSupported || this.f84614b.o()) {
                return;
            }
            i9 i9Var = this.f84615c.f84567p;
            if (i9Var == null) {
                kotlin.jvm.internal.f0.S("binding");
                i9Var = null;
            }
            i9Var.f111694h.R(this.f84614b);
        }
    }

    /* JADX INFO: compiled from: GamePublishCalendarFragment.kt */
    @kotlin.jvm.internal.t0({"SMAP\nGamePublishCalendarFragment.kt\nKotlin\n*S Kotlin\n*F\n+ 1 GamePublishCalendarFragment.kt\ncom/max/xiaoheihe/module/game/GamePublishCalendarFragment$onGetGameCountComplete$1$3\n+ 2 View.kt\nandroidx/core/view/ViewKt\n*L\n1#1,989:1\n260#2:990\n260#2:991\n*S KotlinDebug\n*F\n+ 1 GamePublishCalendarFragment.kt\ncom/max/xiaoheihe/module/game/GamePublishCalendarFragment$onGetGameCountComplete$1$3\n*L\n739#1:990\n741#1:991\n*E\n"})
    public static final class o implements TabLayout.f {
        public static ChangeQuickRedirect changeQuickRedirect;

        o() {
        }

        @Override // com.google.android.material.tabs.TabLayout.c
        public void a(@dl.e TabLayout.h hVar) {
            if (PatchProxy.proxy(new Object[]{hVar}, this, changeQuickRedirect, false, 33452, new Class[]{TabLayout.h.class}, Void.TYPE).isSupported || hVar == null) {
                return;
            }
            GamePublishCalendarFragment gamePublishCalendarFragment = GamePublishCalendarFragment.this;
            View viewG = hVar.g();
            if (viewG != null) {
                TextView tvTab = (TextView) viewG.findViewById(R.id.text1);
                kotlin.jvm.internal.f0.o(tvTab, "tvTab");
                GamePublishCalendarFragment.b5(gamePublishCalendarFragment, true, tvTab);
            }
            String str = (String) hVar.m();
            if (str != null) {
                HBCalendarView hBCalendarView = gamePublishCalendarFragment.f84576y;
                if (hBCalendarView == null) {
                    kotlin.jvm.internal.f0.S("viewCalendar");
                    hBCalendarView = null;
                }
                i9 i9Var = gamePublishCalendarFragment.f84567p;
                if (i9Var == null) {
                    kotlin.jvm.internal.f0.S("binding");
                    i9Var = null;
                }
                LinearLayout linearLayout = i9Var.f111703q;
                kotlin.jvm.internal.f0.o(linearLayout, "binding.vgSingleDay");
                hBCalendarView.j(str, false, linearLayout.getVisibility() == 0);
                if (gamePublishCalendarFragment.f84575x) {
                    i9 i9Var2 = gamePublishCalendarFragment.f84567p;
                    if (i9Var2 == null) {
                        kotlin.jvm.internal.f0.S("binding");
                        i9Var2 = null;
                    }
                    LinearLayout linearLayout2 = i9Var2.f111703q;
                    kotlin.jvm.internal.f0.o(linearLayout2, "binding.vgSingleDay");
                    if (linearLayout2.getVisibility() == 0) {
                        return;
                    }
                    GamePublishCalendarFragment.I5(gamePublishCalendarFragment, str, null, 2, null);
                }
            }
        }

        @Override // com.google.android.material.tabs.TabLayout.c
        public void b(@dl.e TabLayout.h hVar) {
            if (PatchProxy.proxy(new Object[]{hVar}, this, changeQuickRedirect, false, 33453, new Class[]{TabLayout.h.class}, Void.TYPE).isSupported || hVar == null) {
                return;
            }
            GamePublishCalendarFragment gamePublishCalendarFragment = GamePublishCalendarFragment.this;
            View viewG = hVar.g();
            if (viewG != null) {
                TextView tvTab = (TextView) viewG.findViewById(R.id.text1);
                kotlin.jvm.internal.f0.o(tvTab, "tvTab");
                GamePublishCalendarFragment.b5(gamePublishCalendarFragment, false, tvTab);
            }
        }

        @Override // com.google.android.material.tabs.TabLayout.c
        public void c(@dl.e TabLayout.h hVar) {
        }
    }

    /* JADX INFO: compiled from: GamePublishCalendarFragment.kt */
    public static final class p implements View.OnClickListener {
        public static ChangeQuickRedirect changeQuickRedirect;

        p() {
        }

        @Override // android.view.View.OnClickListener
        public final void onClick(View view) {
            if (PatchProxy.proxy(new Object[]{view}, this, changeQuickRedirect, false, 33458, new Class[]{View.class}, Void.TYPE).isSupported) {
                return;
            }
            GameEventCountDownObj gameEventCountDownObj = GamePublishCalendarFragment.this.D;
            kotlin.jvm.internal.f0.m(gameEventCountDownObj);
            if (com.max.hbcommon.utils.c.u(gameEventCountDownObj.getEvent_id())) {
                return;
            }
            GamePublishCalendarFragment gamePublishCalendarFragment = GamePublishCalendarFragment.this;
            GameEventCountDownObj gameEventCountDownObj2 = gamePublishCalendarFragment.D;
            kotlin.jvm.internal.f0.m(gameEventCountDownObj2);
            String strValueOf = String.valueOf(com.max.hbutils.utils.n.r(gameEventCountDownObj2.getStart_timestamp()));
            GameEventCountDownObj gameEventCountDownObj3 = GamePublishCalendarFragment.this.D;
            kotlin.jvm.internal.f0.m(gameEventCountDownObj3);
            GamePublishCalendarFragment.c5(gamePublishCalendarFragment, strValueOf, gameEventCountDownObj3.getEvent_id());
        }
    }

    private final <T> T A5(List<T> list) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{list}, this, changeQuickRedirect, false, 33386, new Class[]{List.class}, Object.class);
        if (patchProxyResultProxy.isSupported) {
            return (T) patchProxyResultProxy.result;
        }
        if (CollectionsKt__CollectionsKt.G(list) >= 0) {
            return list.get(CollectionsKt__CollectionsKt.G(list));
        }
        return null;
    }

    private final void B5(CalendarGameCountObj calendarGameCountObj) {
        if (PatchProxy.proxy(new Object[]{calendarGameCountObj}, this, changeQuickRedirect, false, 33375, new Class[]{CalendarGameCountObj.class}, Void.TYPE).isSupported || calendarGameCountObj == null) {
            return;
        }
        GameEventCountDownObj event_countdown = calendarGameCountObj.getEvent_countdown();
        this.D = event_countdown;
        if (event_countdown != null) {
            F5();
        } else {
            i9 i9Var = this.f84567p;
            if (i9Var == null) {
                kotlin.jvm.internal.f0.S("binding");
                i9Var = null;
            }
            LinearLayout linearLayout = i9Var.f111699m;
            kotlin.jvm.internal.f0.o(linearLayout, "binding.vgNextEventCountDown");
            linearLayout.setVisibility(8);
        }
        i9 i9Var2 = this.f84567p;
        if (i9Var2 == null) {
            kotlin.jvm.internal.f0.S("binding");
            i9Var2 = null;
        }
        if (i9Var2.f111694h.getTabCount() != 0 || com.max.hbcommon.utils.c.w(calendarGameCountObj.getCount_by_month())) {
            return;
        }
        HBCalendarView hBCalendarView = this.f84576y;
        if (hBCalendarView == null) {
            kotlin.jvm.internal.f0.S("viewCalendar");
            hBCalendarView = null;
        }
        hBCalendarView.setData(calendarGameCountObj.getCount_by_month());
        HBCalendarView hBCalendarView2 = this.f84576y;
        if (hBCalendarView2 == null) {
            kotlin.jvm.internal.f0.S("viewCalendar");
            hBCalendarView2 = null;
        }
        hBCalendarView2.setOnDateSelectedListener(new m());
        List<MonthObj> count_by_month = calendarGameCountObj.getCount_by_month();
        kotlin.jvm.internal.f0.m(count_by_month);
        for (MonthObj monthObj : count_by_month) {
            i9 i9Var3 = this.f84567p;
            if (i9Var3 == null) {
                kotlin.jvm.internal.f0.S("binding");
                i9Var3 = null;
            }
            TabLayout.h hVarI = i9Var3.f111694h.I();
            kotlin.jvm.internal.f0.o(hVarI, "binding.tab.newTab()");
            StringBuilder sb2 = new StringBuilder();
            sb2.append(CalendarUtils.f86571a.o(com.max.hbutils.utils.n.r(monthObj.getMonth_timestamp())) + 1);
            sb2.append((char) 26376);
            String string = sb2.toString();
            hVarI.D(string);
            hVarI.B(monthObj.getMonth_timestamp());
            hVarI.f55494i.setOnClickListener(new n(hVarI, this));
            hVarI.v(p5(string, hVarI));
            i9 i9Var4 = this.f84567p;
            if (i9Var4 == null) {
                kotlin.jvm.internal.f0.S("binding");
                i9Var4 = null;
            }
            i9Var4.f111694h.i(hVarI);
        }
        i9 i9Var5 = this.f84567p;
        if (i9Var5 == null) {
            kotlin.jvm.internal.f0.S("binding");
            i9Var5 = null;
        }
        i9Var5.f111694h.h(new o());
        kotlinx.coroutines.k.f(this.f84574w, null, null, new GamePublishCalendarFragment$onGetGameCountComplete$1$4(this, calendarGameCountObj, null), 3, null);
    }

    private final void C5(CalendarGameGroupListObj calendarGameGroupListObj, boolean z10) {
        if (PatchProxy.proxy(new Object[]{calendarGameGroupListObj, new Byte(z10 ? (byte) 1 : (byte) 0)}, this, changeQuickRedirect, false, 33365, new Class[]{CalendarGameGroupListObj.class, Boolean.TYPE}, Void.TYPE).isSupported) {
            return;
        }
        if (com.max.hbcommon.utils.c.w(this.f84572u)) {
            this.f84569r.clear();
            this.f84572u.clear();
            com.max.hbcommon.base.adapter.u<PublishGameTitle> uVar = this.f84568q;
            if (uVar != null) {
                uVar.notifyDataSetChanged();
            }
        }
        y5();
        i9 i9Var = null;
        if (calendarGameGroupListObj != null && !com.max.hbcommon.utils.c.w(calendarGameGroupListObj.getGrouped_game_list())) {
            List<PublishGameTitle> listS5 = s5(calendarGameGroupListObj, z10);
            if (z10) {
                this.f84569r.addAll(0, listS5);
                if (this.f84569r.size() == listS5.size()) {
                    com.max.hbcommon.base.adapter.u<PublishGameTitle> uVar2 = this.f84568q;
                    if (uVar2 != null) {
                        uVar2.notifyDataSetChanged();
                    }
                } else {
                    com.max.hbcommon.base.adapter.u<PublishGameTitle> uVar3 = this.f84568q;
                    if (uVar3 != null) {
                        uVar3.notifyItemRangeInserted(0, listS5.size());
                    }
                }
            } else {
                this.f84569r.addAll(listS5);
                if (this.f84569r.size() == listS5.size()) {
                    com.max.hbcommon.base.adapter.u<PublishGameTitle> uVar4 = this.f84568q;
                    if (uVar4 != null) {
                        uVar4.notifyDataSetChanged();
                    }
                } else {
                    com.max.hbcommon.base.adapter.u<PublishGameTitle> uVar5 = this.f84568q;
                    if (uVar5 != null) {
                        uVar5.notifyItemRangeInserted(this.f84569r.size() - listS5.size(), listS5.size());
                    }
                }
            }
            i9 i9Var2 = this.f84567p;
            if (i9Var2 == null) {
                kotlin.jvm.internal.f0.S("binding");
            } else {
                i9Var = i9Var2;
            }
            i9Var.f111688b.b().setVisibility(8);
        } else if (com.max.hbcommon.utils.c.w(this.f84569r)) {
            i9 i9Var3 = this.f84567p;
            if (i9Var3 == null) {
                kotlin.jvm.internal.f0.S("binding");
            } else {
                i9Var = i9Var3;
            }
            i9Var.f111688b.b().setVisibility(0);
        }
        l5(calendarGameGroupListObj, z10);
    }

    static /* synthetic */ void D5(GamePublishCalendarFragment gamePublishCalendarFragment, CalendarGameGroupListObj calendarGameGroupListObj, boolean z10, int i10, Object obj) {
        if (PatchProxy.proxy(new Object[]{gamePublishCalendarFragment, calendarGameGroupListObj, new Byte(z10 ? (byte) 1 : (byte) 0), new Integer(i10), obj}, null, changeQuickRedirect, true, 33366, new Class[]{GamePublishCalendarFragment.class, CalendarGameGroupListObj.class, Boolean.TYPE, Integer.TYPE, Object.class}, Void.TYPE).isSupported) {
            return;
        }
        if ((i10 & 2) != 0) {
            z10 = false;
        }
        gamePublishCalendarFragment.C5(calendarGameGroupListObj, z10);
    }

    private final void E5(CalendarGameGroupObj calendarGameGroupObj) {
        if (PatchProxy.proxy(new Object[]{calendarGameGroupObj}, this, changeQuickRedirect, false, 33374, new Class[]{CalendarGameGroupObj.class}, Void.TYPE).isSupported) {
            return;
        }
        this.f84571t.clear();
        View view = null;
        if (calendarGameGroupObj == null || com.max.hbcommon.utils.c.w(calendarGameGroupObj.getGame_list())) {
            View view2 = this.f84577z;
            if (view2 == null) {
                kotlin.jvm.internal.f0.S("calendarEmptyView");
            } else {
                view = view2;
            }
            view.setVisibility(0);
        } else {
            this.f84571t.addAll(t5(calendarGameGroupObj, false, true));
            View view3 = this.f84577z;
            if (view3 == null) {
                kotlin.jvm.internal.f0.S("calendarEmptyView");
            } else {
                view = view3;
            }
            view.setVisibility(8);
        }
        com.max.hbcommon.base.adapter.t tVar = this.f84570s;
        if (tVar != null) {
            tVar.notifyDataSetChanged();
        }
    }

    private final void F5() {
        if (!PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 33367, new Class[0], Void.TYPE).isSupported && isActive()) {
            GameEventCountDownObj gameEventCountDownObj = this.D;
            i9 i9Var = null;
            if (gameEventCountDownObj != null) {
                kotlin.jvm.internal.f0.m(gameEventCountDownObj);
                if (!com.max.hbcommon.utils.c.u(gameEventCountDownObj.getStart_timestamp())) {
                    GameEventCountDownObj gameEventCountDownObj2 = this.D;
                    kotlin.jvm.internal.f0.m(gameEventCountDownObj2);
                    long jR = com.max.hbutils.utils.n.r(gameEventCountDownObj2.getStart_timestamp()) * 1000;
                    long jCurrentTimeMillis = jR - System.currentTimeMillis();
                    if (jCurrentTimeMillis <= 0) {
                        i9 i9Var2 = this.f84567p;
                        if (i9Var2 == null) {
                            kotlin.jvm.internal.f0.S("binding");
                        } else {
                            i9Var = i9Var2;
                        }
                        LinearLayout linearLayout = i9Var.f111699m;
                        kotlin.jvm.internal.f0.o(linearLayout, "binding.vgNextEventCountDown");
                        linearLayout.setVisibility(8);
                        return;
                    }
                    long j10 = jCurrentTimeMillis / 86400000;
                    i9 i9Var3 = this.f84567p;
                    if (i9Var3 == null) {
                        kotlin.jvm.internal.f0.S("binding");
                        i9Var3 = null;
                    }
                    TextView textView = i9Var3.f111697k;
                    GameEventCountDownObj gameEventCountDownObj3 = this.D;
                    textView.setText(gameEventCountDownObj3 != null ? gameEventCountDownObj3.getDesc() : null);
                    i9 i9Var4 = this.f84567p;
                    if (i9Var4 == null) {
                        kotlin.jvm.internal.f0.S("binding");
                        i9Var4 = null;
                    }
                    i9Var4.f111696j.setText(com.max.hbutils.utils.w.m(this.mContext, jR - (86400000 * j10), true));
                    i9 i9Var5 = this.f84567p;
                    if (i9Var5 == null) {
                        kotlin.jvm.internal.f0.S("binding");
                        i9Var5 = null;
                    }
                    LinearLayout linearLayout2 = i9Var5.f111701o;
                    kotlin.jvm.internal.f0.o(linearLayout2, "binding.vgNextEventDay");
                    linearLayout2.setVisibility(j10 > 0 ? 0 : 8);
                    i9 i9Var6 = this.f84567p;
                    if (i9Var6 == null) {
                        kotlin.jvm.internal.f0.S("binding");
                        i9Var6 = null;
                    }
                    i9Var6.f111695i.setText(String.valueOf(j10));
                    i9 i9Var7 = this.f84567p;
                    if (i9Var7 == null) {
                        kotlin.jvm.internal.f0.S("binding");
                        i9Var7 = null;
                    }
                    LinearLayout linearLayout3 = i9Var7.f111699m;
                    kotlin.jvm.internal.f0.o(linearLayout3, "binding.vgNextEventCountDown");
                    linearLayout3.setVisibility(0);
                    i9 i9Var8 = this.f84567p;
                    if (i9Var8 == null) {
                        kotlin.jvm.internal.f0.S("binding");
                        i9Var8 = null;
                    }
                    i9Var8.f111699m.setOnClickListener(new p());
                    kotlinx.coroutines.k.f(androidx.lifecycle.z.a(this), null, null, new GamePublishCalendarFragment$refreshNextEvent$2(this, null), 3, null);
                    return;
                }
            }
            i9 i9Var9 = this.f84567p;
            if (i9Var9 == null) {
                kotlin.jvm.internal.f0.S("binding");
            } else {
                i9Var = i9Var9;
            }
            LinearLayout linearLayout4 = i9Var.f111699m;
            kotlin.jvm.internal.f0.o(linearLayout4, "binding.vgNextEventCountDown");
            linearLayout4.setVisibility(8);
        }
    }

    private final void G5(boolean z10, TextView textView) {
        if (PatchProxy.proxy(new Object[]{new Byte(z10 ? (byte) 1 : (byte) 0), textView}, this, changeQuickRedirect, false, 33382, new Class[]{Boolean.TYPE, TextView.class}, Void.TYPE).isSupported) {
            return;
        }
        if (z10) {
            textView.setTextColor(this.mContext.getResources().getColor(R.color.text_primary_1_color));
            textView.setBackground(ViewUtils.G(ViewUtils.o(getContext(), textView), com.max.xiaoheihe.utils.d.E(R.color.divider_secondary_1_color)));
            textView.setTypeface(com.max.hbresource.a.f71893a.a(com.max.hbresource.a.f71895c));
        } else {
            textView.setTextColor(this.mContext.getResources().getColor(R.color.text_primary_2_color));
            textView.setBackground(null);
            textView.setTypeface(com.max.hbresource.a.f71893a.a(com.max.hbresource.a.f71894b));
        }
    }

    private final void H5(String str, String str2) {
        boolean z10;
        if (PatchProxy.proxy(new Object[]{str, str2}, this, changeQuickRedirect, false, 33376, new Class[]{String.class, String.class}, Void.TYPE).isSupported || str == null) {
            return;
        }
        long jR = com.max.hbutils.utils.n.r(str);
        String strValueOf = String.valueOf(CalendarUtils.f86571a.n(jR));
        if (this.f84569r.size() <= 0) {
            L5();
            u5(false, strValueOf, str2);
            return;
        }
        if (jR < com.max.hbutils.utils.n.r(this.f84569r.get(0).getDay_timestamp())) {
            L5();
            u5(true, strValueOf, str2);
            return;
        }
        PublishGameTitle publishGameTitle = (PublishGameTitle) A5(this.f84569r);
        i9 i9Var = null;
        if (jR > com.max.hbutils.utils.n.r(publishGameTitle != null ? publishGameTitle.getDay_timestamp() : null)) {
            L5();
            u5(false, strValueOf, str2);
            return;
        }
        if (!com.max.hbcommon.utils.c.u(str2)) {
            J5(str2);
            return;
        }
        int size = this.f84569r.size();
        int i10 = 0;
        while (true) {
            if (i10 >= size) {
                z10 = false;
                break;
            }
            if (kotlin.jvm.internal.f0.g(this.f84569r.get(i10).getMonth_timestamp(), str) || com.max.hbutils.utils.n.r(this.f84569r.get(i10).getMonth_timestamp()) > com.max.hbutils.utils.n.r(str)) {
                i9 i9Var2 = this.f84567p;
                if (i9Var2 == null) {
                    kotlin.jvm.internal.f0.S("binding");
                    i9Var2 = null;
                }
                RecyclerView.LayoutManager layoutManager = i9Var2.f111691e.getLayoutManager();
                kotlin.jvm.internal.f0.n(layoutManager, "null cannot be cast to non-null type androidx.recyclerview.widget.LinearLayoutManager");
                ((LinearLayoutManager) layoutManager).scrollToPositionWithOffset(i10, 0);
                z10 = true;
                break;
            }
            i10++;
        }
        if (z10) {
            return;
        }
        i9 i9Var3 = this.f84567p;
        if (i9Var3 == null) {
            kotlin.jvm.internal.f0.S("binding");
        } else {
            i9Var = i9Var3;
        }
        RecyclerView.LayoutManager layoutManager2 = i9Var.f111691e.getLayoutManager();
        kotlin.jvm.internal.f0.n(layoutManager2, "null cannot be cast to non-null type androidx.recyclerview.widget.LinearLayoutManager");
        ((LinearLayoutManager) layoutManager2).scrollToPositionWithOffset(this.f84569r.size() - 1, 0);
    }

    static /* synthetic */ void I5(GamePublishCalendarFragment gamePublishCalendarFragment, String str, String str2, int i10, Object obj) {
        if (PatchProxy.proxy(new Object[]{gamePublishCalendarFragment, str, str2, new Integer(i10), obj}, null, changeQuickRedirect, true, 33377, new Class[]{GamePublishCalendarFragment.class, String.class, String.class, Integer.TYPE, Object.class}, Void.TYPE).isSupported) {
            return;
        }
        if ((i10 & 2) != 0) {
            str2 = null;
        }
        gamePublishCalendarFragment.H5(str, str2);
    }

    public static final /* synthetic */ void J4(GamePublishCalendarFragment gamePublishCalendarFragment) {
        if (PatchProxy.proxy(new Object[]{gamePublishCalendarFragment}, null, changeQuickRedirect, true, 33389, new Class[]{GamePublishCalendarFragment.class}, Void.TYPE).isSupported) {
            return;
        }
        gamePublishCalendarFragment.o5();
    }

    private final void J5(String str) {
        if (PatchProxy.proxy(new Object[]{str}, this, changeQuickRedirect, false, 33378, new Class[]{String.class}, Void.TYPE).isSupported || com.max.hbcommon.utils.c.u(str)) {
            return;
        }
        int size = this.f84569r.size();
        for (int i10 = 0; i10 < size; i10++) {
            GameEventObj event = this.f84569r.get(i10).getEvent();
            if (kotlin.jvm.internal.f0.g(event != null ? event.getEvent_id() : null, str)) {
                kotlinx.coroutines.k.f(androidx.lifecycle.z.a(this), null, null, new GamePublishCalendarFragment$scrollToEvent$1(this, i10, null), 3, null);
                return;
            }
        }
    }

    private final void K5() {
        if (!PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 33360, new Class[0], Void.TYPE).isSupported && this.f84569r.size() > 0) {
            int size = this.f84569r.size();
            for (int i10 = 0; i10 < size; i10++) {
                long jR = com.max.hbutils.utils.n.r(this.f84569r.get(i10).getDay_timestamp()) * ((long) 1000);
                if (com.max.hbutils.utils.w.N(jR) || jR > System.currentTimeMillis()) {
                    i9 i9Var = this.f84567p;
                    if (i9Var == null) {
                        kotlin.jvm.internal.f0.S("binding");
                        i9Var = null;
                    }
                    RecyclerView.LayoutManager layoutManager = i9Var.f111691e.getLayoutManager();
                    kotlin.jvm.internal.f0.n(layoutManager, "null cannot be cast to non-null type androidx.recyclerview.widget.LinearLayoutManager");
                    ((LinearLayoutManager) layoutManager).scrollToPositionWithOffset(i10, 0);
                    return;
                }
            }
        }
    }

    private final void L5() {
        if (PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 33379, new Class[0], Void.TYPE).isSupported) {
            return;
        }
        Activity mContext = this.mContext;
        kotlin.jvm.internal.f0.o(mContext, "mContext");
        this.A = new LoadingDialog(mContext, null).r();
    }

    public static final /* synthetic */ HashMap N4(GamePublishCalendarFragment gamePublishCalendarFragment) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{gamePublishCalendarFragment}, null, changeQuickRedirect, true, 33387, new Class[]{GamePublishCalendarFragment.class}, HashMap.class);
        return patchProxyResultProxy.isSupported ? (HashMap) patchProxyResultProxy.result : gamePublishCalendarFragment.q5();
    }

    public static final /* synthetic */ void Q4(GamePublishCalendarFragment gamePublishCalendarFragment, String str) {
        if (PatchProxy.proxy(new Object[]{gamePublishCalendarFragment, str}, null, changeQuickRedirect, true, 33400, new Class[]{GamePublishCalendarFragment.class, String.class}, Void.TYPE).isSupported) {
            return;
        }
        gamePublishCalendarFragment.w5(str);
    }

    public static final /* synthetic */ void W4(GamePublishCalendarFragment gamePublishCalendarFragment) {
        if (PatchProxy.proxy(new Object[]{gamePublishCalendarFragment}, null, changeQuickRedirect, true, 33395, new Class[]{GamePublishCalendarFragment.class}, Void.TYPE).isSupported) {
            return;
        }
        gamePublishCalendarFragment.y5();
    }

    public static final /* synthetic */ void X4(GamePublishCalendarFragment gamePublishCalendarFragment, CalendarGameCountObj calendarGameCountObj) {
        if (PatchProxy.proxy(new Object[]{gamePublishCalendarFragment, calendarGameCountObj}, null, changeQuickRedirect, true, 33391, new Class[]{GamePublishCalendarFragment.class, CalendarGameCountObj.class}, Void.TYPE).isSupported) {
            return;
        }
        gamePublishCalendarFragment.B5(calendarGameCountObj);
    }

    public static final /* synthetic */ void Y4(GamePublishCalendarFragment gamePublishCalendarFragment, CalendarGameGroupListObj calendarGameGroupListObj, boolean z10) {
        if (PatchProxy.proxy(new Object[]{gamePublishCalendarFragment, calendarGameGroupListObj, new Byte(z10 ? (byte) 1 : (byte) 0)}, null, changeQuickRedirect, true, 33396, new Class[]{GamePublishCalendarFragment.class, CalendarGameGroupListObj.class, Boolean.TYPE}, Void.TYPE).isSupported) {
            return;
        }
        gamePublishCalendarFragment.C5(calendarGameGroupListObj, z10);
    }

    public static final /* synthetic */ void Z4(GamePublishCalendarFragment gamePublishCalendarFragment, CalendarGameGroupObj calendarGameGroupObj) {
        if (PatchProxy.proxy(new Object[]{gamePublishCalendarFragment, calendarGameGroupObj}, null, changeQuickRedirect, true, 33394, new Class[]{GamePublishCalendarFragment.class, CalendarGameGroupObj.class}, Void.TYPE).isSupported) {
            return;
        }
        gamePublishCalendarFragment.E5(calendarGameGroupObj);
    }

    public static final /* synthetic */ void a5(GamePublishCalendarFragment gamePublishCalendarFragment) {
        if (PatchProxy.proxy(new Object[]{gamePublishCalendarFragment}, null, changeQuickRedirect, true, 33399, new Class[]{GamePublishCalendarFragment.class}, Void.TYPE).isSupported) {
            return;
        }
        gamePublishCalendarFragment.F5();
    }

    public static final /* synthetic */ void b5(GamePublishCalendarFragment gamePublishCalendarFragment, boolean z10, TextView textView) {
        if (PatchProxy.proxy(new Object[]{gamePublishCalendarFragment, new Byte(z10 ? (byte) 1 : (byte) 0), textView}, null, changeQuickRedirect, true, 33401, new Class[]{GamePublishCalendarFragment.class, Boolean.TYPE, TextView.class}, Void.TYPE).isSupported) {
            return;
        }
        gamePublishCalendarFragment.G5(z10, textView);
    }

    public static final /* synthetic */ void c5(GamePublishCalendarFragment gamePublishCalendarFragment, String str, String str2) {
        if (PatchProxy.proxy(new Object[]{gamePublishCalendarFragment, str, str2}, null, changeQuickRedirect, true, 33398, new Class[]{GamePublishCalendarFragment.class, String.class, String.class}, Void.TYPE).isSupported) {
            return;
        }
        gamePublishCalendarFragment.H5(str, str2);
    }

    public static final /* synthetic */ void d5(GamePublishCalendarFragment gamePublishCalendarFragment, String str) {
        if (PatchProxy.proxy(new Object[]{gamePublishCalendarFragment, str}, null, changeQuickRedirect, true, 33397, new Class[]{GamePublishCalendarFragment.class, String.class}, Void.TYPE).isSupported) {
            return;
        }
        gamePublishCalendarFragment.J5(str);
    }

    public static final /* synthetic */ void e5(GamePublishCalendarFragment gamePublishCalendarFragment) {
        if (PatchProxy.proxy(new Object[]{gamePublishCalendarFragment}, null, changeQuickRedirect, true, 33392, new Class[]{GamePublishCalendarFragment.class}, Void.TYPE).isSupported) {
            return;
        }
        gamePublishCalendarFragment.K5();
    }

    public static final /* synthetic */ void i5(GamePublishCalendarFragment gamePublishCalendarFragment) {
        if (PatchProxy.proxy(new Object[]{gamePublishCalendarFragment}, null, changeQuickRedirect, true, 33393, new Class[]{GamePublishCalendarFragment.class}, Void.TYPE).isSupported) {
            return;
        }
        gamePublishCalendarFragment.showContentView();
    }

    public static final /* synthetic */ void j5(GamePublishCalendarFragment gamePublishCalendarFragment) {
        if (PatchProxy.proxy(new Object[]{gamePublishCalendarFragment}, null, changeQuickRedirect, true, 33390, new Class[]{GamePublishCalendarFragment.class}, Void.TYPE).isSupported) {
            return;
        }
        gamePublishCalendarFragment.showError();
    }

    public static final /* synthetic */ void k5(GamePublishCalendarFragment gamePublishCalendarFragment) {
        if (PatchProxy.proxy(new Object[]{gamePublishCalendarFragment}, null, changeQuickRedirect, true, 33388, new Class[]{GamePublishCalendarFragment.class}, Void.TYPE).isSupported) {
            return;
        }
        gamePublishCalendarFragment.L5();
    }

    private final void l5(CalendarGameGroupListObj calendarGameGroupListObj, boolean z10) {
        List<CalendarGameGroupObj> grouped_game_list;
        CalendarGameGroupObj calendarGameGroupObj;
        if (PatchProxy.proxy(new Object[]{calendarGameGroupListObj, new Byte(z10 ? (byte) 1 : (byte) 0)}, this, changeQuickRedirect, false, 33368, new Class[]{CalendarGameGroupListObj.class, Boolean.TYPE}, Void.TYPE).isSupported || calendarGameGroupListObj == null) {
            return;
        }
        String day_timestamp = null;
        if (z10) {
            if (!com.max.hbcommon.utils.c.w(calendarGameGroupListObj.getGrouped_game_list())) {
                List[] listArr = new List[1];
                List<CalendarGameGroupObj> grouped_game_list2 = calendarGameGroupListObj.getGrouped_game_list();
                kotlin.jvm.internal.f0.m(grouped_game_list2);
                CalendarGameGroupObj calendarGameGroupObj2 = (CalendarGameGroupObj) A5(grouped_game_list2);
                listArr[0] = calendarGameGroupObj2 != null ? calendarGameGroupObj2.getGame_list() : null;
                if (!com.max.hbcommon.utils.c.w(listArr) && !com.max.hbcommon.utils.c.w(this.f84572u) && !com.max.hbcommon.utils.c.w(this.f84572u.get(0).getGrouped_game_list())) {
                    List<CalendarGameGroupObj> grouped_game_list3 = this.f84572u.get(0).getGrouped_game_list();
                    kotlin.jvm.internal.f0.m(grouped_game_list3);
                    if (!com.max.hbcommon.utils.c.w(grouped_game_list3.get(0).getGame_list())) {
                        List<CalendarGameGroupObj> grouped_game_list4 = calendarGameGroupListObj.getGrouped_game_list();
                        kotlin.jvm.internal.f0.m(grouped_game_list4);
                        CalendarGameGroupObj calendarGameGroupObj3 = (CalendarGameGroupObj) A5(grouped_game_list4);
                        day_timestamp = calendarGameGroupObj3 != null ? calendarGameGroupObj3.getDay_timestamp() : null;
                        List<CalendarGameGroupObj> grouped_game_list5 = this.f84572u.get(0).getGrouped_game_list();
                        kotlin.jvm.internal.f0.m(grouped_game_list5);
                        if (kotlin.jvm.internal.f0.g(day_timestamp, grouped_game_list5.get(0).getDay_timestamp())) {
                            List<CalendarGameGroupObj> grouped_game_list6 = this.f84572u.get(0).getGrouped_game_list();
                            kotlin.jvm.internal.f0.m(grouped_game_list6);
                            List<GamePublishBaseObj> game_list = grouped_game_list6.get(0).getGame_list();
                            kotlin.jvm.internal.f0.m(game_list);
                            List<CalendarGameGroupObj> grouped_game_list7 = calendarGameGroupListObj.getGrouped_game_list();
                            kotlin.jvm.internal.f0.m(grouped_game_list7);
                            Object objA5 = A5(grouped_game_list7);
                            kotlin.jvm.internal.f0.m(objA5);
                            List<GamePublishBaseObj> game_list2 = ((CalendarGameGroupObj) objA5).getGame_list();
                            kotlin.jvm.internal.f0.m(game_list2);
                            game_list.addAll(0, game_list2);
                            List<CalendarGameGroupObj> grouped_game_list8 = calendarGameGroupListObj.getGrouped_game_list();
                            kotlin.jvm.internal.f0.m(grouped_game_list8);
                            List<CalendarGameGroupObj> grouped_game_list9 = calendarGameGroupListObj.getGrouped_game_list();
                            kotlin.jvm.internal.f0.m(grouped_game_list9);
                            grouped_game_list8.remove(CollectionsKt__CollectionsKt.G(grouped_game_list9));
                        }
                    }
                }
            }
            this.f84572u.add(0, calendarGameGroupListObj);
            return;
        }
        if (!com.max.hbcommon.utils.c.w(calendarGameGroupListObj.getGrouped_game_list())) {
            List<CalendarGameGroupObj> grouped_game_list10 = calendarGameGroupListObj.getGrouped_game_list();
            kotlin.jvm.internal.f0.m(grouped_game_list10);
            if (!com.max.hbcommon.utils.c.w(grouped_game_list10.get(0).getGame_list()) && !com.max.hbcommon.utils.c.w(this.f84572u)) {
                List[] listArr2 = new List[1];
                CalendarGameGroupListObj calendarGameGroupListObj2 = (CalendarGameGroupListObj) A5(this.f84572u);
                listArr2[0] = calendarGameGroupListObj2 != null ? calendarGameGroupListObj2.getGrouped_game_list() : null;
                if (!com.max.hbcommon.utils.c.w(listArr2)) {
                    List[] listArr3 = new List[1];
                    CalendarGameGroupListObj calendarGameGroupListObj3 = (CalendarGameGroupListObj) A5(this.f84572u);
                    List<CalendarGameGroupObj> grouped_game_list11 = calendarGameGroupListObj3 != null ? calendarGameGroupListObj3.getGrouped_game_list() : null;
                    kotlin.jvm.internal.f0.m(grouped_game_list11);
                    listArr3[0] = grouped_game_list11.get(0).getGame_list();
                    if (!com.max.hbcommon.utils.c.w(listArr3)) {
                        List<CalendarGameGroupObj> grouped_game_list12 = calendarGameGroupListObj.getGrouped_game_list();
                        kotlin.jvm.internal.f0.m(grouped_game_list12);
                        String day_timestamp2 = grouped_game_list12.get(0).getDay_timestamp();
                        CalendarGameGroupListObj calendarGameGroupListObj4 = (CalendarGameGroupListObj) A5(this.f84572u);
                        if (calendarGameGroupListObj4 != null && (grouped_game_list = calendarGameGroupListObj4.getGrouped_game_list()) != null && (calendarGameGroupObj = (CalendarGameGroupObj) A5(grouped_game_list)) != null) {
                            day_timestamp = calendarGameGroupObj.getDay_timestamp();
                        }
                        if (kotlin.jvm.internal.f0.g(day_timestamp2, day_timestamp)) {
                            Object objA6 = A5(this.f84572u);
                            kotlin.jvm.internal.f0.m(objA6);
                            List<CalendarGameGroupObj> grouped_game_list13 = ((CalendarGameGroupListObj) objA6).getGrouped_game_list();
                            kotlin.jvm.internal.f0.m(grouped_game_list13);
                            Object objA7 = A5(grouped_game_list13);
                            kotlin.jvm.internal.f0.m(objA7);
                            List<GamePublishBaseObj> game_list3 = ((CalendarGameGroupObj) objA7).getGame_list();
                            kotlin.jvm.internal.f0.m(game_list3);
                            List<CalendarGameGroupObj> grouped_game_list14 = calendarGameGroupListObj.getGrouped_game_list();
                            kotlin.jvm.internal.f0.m(grouped_game_list14);
                            List<GamePublishBaseObj> game_list4 = grouped_game_list14.get(0).getGame_list();
                            kotlin.jvm.internal.f0.m(game_list4);
                            game_list3.addAll(game_list4);
                            List<CalendarGameGroupObj> grouped_game_list15 = calendarGameGroupListObj.getGrouped_game_list();
                            kotlin.jvm.internal.f0.m(grouped_game_list15);
                            grouped_game_list15.remove(0);
                        }
                    }
                }
            }
        }
        this.f84572u.add(calendarGameGroupListObj);
    }

    static /* synthetic */ void m5(GamePublishCalendarFragment gamePublishCalendarFragment, CalendarGameGroupListObj calendarGameGroupListObj, boolean z10, int i10, Object obj) {
        if (PatchProxy.proxy(new Object[]{gamePublishCalendarFragment, calendarGameGroupListObj, new Byte(z10 ? (byte) 1 : (byte) 0), new Integer(i10), obj}, null, changeQuickRedirect, true, 33369, new Class[]{GamePublishCalendarFragment.class, CalendarGameGroupListObj.class, Boolean.TYPE, Integer.TYPE, Object.class}, Void.TYPE).isSupported) {
            return;
        }
        if ((i10 & 2) != 0) {
            z10 = false;
        }
        gamePublishCalendarFragment.l5(calendarGameGroupListObj, z10);
    }

    private final void n5() {
        if (PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 33359, new Class[0], Void.TYPE).isSupported) {
            return;
        }
        addDisposable((io.reactivex.disposables.b) io.reactivex.z.V7(com.max.xiaoheihe.network.i.a().P1(null, new HashMap()).I5(io.reactivex.schedulers.b.d()), com.max.xiaoheihe.network.i.a().k2(new HashMap()).I5(io.reactivex.schedulers.b.d()), com.max.xiaoheihe.network.i.a().M9().I5(io.reactivex.schedulers.b.d()), d.f84591a).a4(io.reactivex.android.schedulers.a.c()).J5(new com.max.hbcommon.network.d<a>() { // from class: com.max.xiaoheihe.module.game.GamePublishCalendarFragment$getAllThings$2
            public static ChangeQuickRedirect changeQuickRedirect;

            public void a(@dl.d GamePublishCalendarFragment.a result) {
                List<FilterGroup> filters;
                if (PatchProxy.proxy(new Object[]{result}, this, changeQuickRedirect, false, 33421, new Class[]{GamePublishCalendarFragment.a.class}, Void.TYPE).isSupported) {
                    return;
                }
                kotlin.jvm.internal.f0.p(result, "result");
                if (this.f84598b.isActive()) {
                    super.onNext(result);
                    this.f84598b.f84569r.clear();
                    this.f84598b.f84572u.clear();
                    this.f84598b.f84573v = null;
                    GamePublishCalendarFragment.D5(this.f84598b, result.h(), false, 2, null);
                    GamePublishCalendarFragment.X4(this.f84598b, result.g());
                    this.f84598b.f84573v = result.f();
                    FilterGroupListObj filterGroupListObj = this.f84598b.f84573v;
                    if (filterGroupListObj != null && (filters = filterGroupListObj.getFilters()) != null) {
                        GamePublishCalendarFragment gamePublishCalendarFragment = this.f84598b;
                        Iterator<FilterGroup> it = filters.iterator();
                        while (it.hasNext()) {
                            SecondaryWindowSegmentFilterView.f67839l.q(it.next());
                        }
                        i9 i9Var = gamePublishCalendarFragment.f84567p;
                        if (i9Var == null) {
                            kotlin.jvm.internal.f0.S("binding");
                            i9Var = null;
                        }
                        FilterButtonView filterButtonView = i9Var.f111689c;
                        SecondaryWindowSegmentFilterView.a aVar = SecondaryWindowSegmentFilterView.f67839l;
                        FilterGroupListObj filterGroupListObj2 = gamePublishCalendarFragment.f84573v;
                        filterButtonView.setChecked(aVar.l(filterGroupListObj2 != null ? filterGroupListObj2.getFilters() : null));
                    }
                    kotlinx.coroutines.k.f(this.f84598b.f84574w, null, null, new GamePublishCalendarFragment$getAllThings$2$onNext$2(this.f84598b, null), 3, null);
                }
            }

            @Override // com.max.hbcommon.network.d, io.reactivex.g0
            public void onError(@dl.d Throwable e10) {
                if (PatchProxy.proxy(new Object[]{e10}, this, changeQuickRedirect, false, 33420, new Class[]{Throwable.class}, Void.TYPE).isSupported) {
                    return;
                }
                kotlin.jvm.internal.f0.p(e10, "e");
                if (this.f84598b.isActive()) {
                    super.onError(e10);
                    GamePublishCalendarFragment.j5(this.f84598b);
                }
            }

            @Override // com.max.hbcommon.network.d, io.reactivex.g0
            public /* bridge */ /* synthetic */ void onNext(Object obj) {
                if (PatchProxy.proxy(new Object[]{obj}, this, changeQuickRedirect, false, 33422, new Class[]{Object.class}, Void.TYPE).isSupported) {
                    return;
                }
                a((GamePublishCalendarFragment.a) obj);
            }
        }));
    }

    private final void o5() {
        if (PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 33361, new Class[0], Void.TYPE).isSupported) {
            return;
        }
        HBCalendarView hBCalendarView = null;
        io.reactivex.z<Result<CalendarGameGroupListObj>> zVarI5 = com.max.xiaoheihe.network.i.a().P1(null, q5()).I5(io.reactivex.schedulers.b.d());
        io.reactivex.z<Result<CalendarGameCountObj>> zVarI6 = com.max.xiaoheihe.network.i.a().k2(q5()).I5(io.reactivex.schedulers.b.d());
        com.max.xiaoheihe.network.e eVarA = com.max.xiaoheihe.network.i.a();
        HBCalendarView hBCalendarView2 = this.f84576y;
        if (hBCalendarView2 == null) {
            kotlin.jvm.internal.f0.S("viewCalendar");
        } else {
            hBCalendarView = hBCalendarView2;
        }
        addDisposable((io.reactivex.disposables.b) io.reactivex.z.V7(zVarI5, zVarI6, eVarA.W0(String.valueOf(hBCalendarView.getSelectDayTimestamp()), q5()).I5(io.reactivex.schedulers.b.d()), e.f84592a).a4(io.reactivex.android.schedulers.a.c()).J5(new f()));
    }

    private final View p5(String str, TabLayout.h hVar) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{str, hVar}, this, changeQuickRedirect, false, 33381, new Class[]{String.class, TabLayout.h.class}, View.class);
        if (patchProxyResultProxy.isSupported) {
            return (View) patchProxyResultProxy.result;
        }
        View viewInflate = View.inflate(this.mContext, R.layout.item_tab_game_calendar, null);
        TextView textView = (TextView) viewInflate.findViewById(R.id.text1);
        if (hVar == null) {
            return viewInflate;
        }
        textView.setText(str);
        boolean zO = hVar.o();
        kotlin.jvm.internal.f0.o(textView, "textView");
        G5(zO, textView);
        return viewInflate;
    }

    private final HashMap<String, String> q5() {
        HashMap<String, String> mapI;
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 33383, new Class[0], HashMap.class);
        if (patchProxyResultProxy.isSupported) {
            return (HashMap) patchProxyResultProxy.result;
        }
        com.max.xiaoheihe.module.component.a aVar = this.B;
        return (aVar == null || (mapI = aVar.i()) == null) ? new HashMap<>() : mapI;
    }

    private final HashMap<String, String> r5() {
        String event_id;
        String strZ;
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 33370, new Class[0], HashMap.class);
        if (patchProxyResultProxy.isSupported) {
            return (HashMap) patchProxyResultProxy.result;
        }
        if (com.max.hbcommon.utils.c.w(this.f84569r)) {
            return null;
        }
        for (PublishGameTitle publishGameTitle : this.f84569r) {
            GameObj game = publishGameTitle.getGame();
            if (game != null && (strZ = r1.Z(game)) != null) {
                kotlin.jvm.internal.f0.o(strZ, "getGameId(it)");
                HashMap<String, String> map = new HashMap<>();
                map.put("end_appid", strZ);
                return map;
            }
            GameEventObj event = publishGameTitle.getEvent();
            if (event != null && (event_id = event.getEvent_id()) != null) {
                HashMap<String, String> map2 = new HashMap<>();
                map2.put("end_event_id", event_id);
                return map2;
            }
        }
        return null;
    }

    private final List<PublishGameTitle> s5(CalendarGameGroupListObj calendarGameGroupListObj, boolean z10) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{calendarGameGroupListObj, new Byte(z10 ? (byte) 1 : (byte) 0)}, this, changeQuickRedirect, false, 33372, new Class[]{CalendarGameGroupListObj.class, Boolean.TYPE}, List.class);
        if (patchProxyResultProxy.isSupported) {
            return (List) patchProxyResultProxy.result;
        }
        ArrayList arrayList = new ArrayList();
        if (!com.max.hbcommon.utils.c.w(calendarGameGroupListObj.getGrouped_game_list())) {
            List<CalendarGameGroupObj> grouped_game_list = calendarGameGroupListObj.getGrouped_game_list();
            kotlin.jvm.internal.f0.m(grouped_game_list);
            Iterator<CalendarGameGroupObj> it = grouped_game_list.iterator();
            while (it.hasNext()) {
                arrayList.addAll(t5(it.next(), z10, false));
            }
        }
        return arrayList;
    }

    /* JADX WARN: Multi-variable type inference failed */
    private final List<PublishGameTitle> t5(CalendarGameGroupObj calendarGameGroupObj, boolean z10, boolean z11) {
        Object[] objArr;
        Object[] objArr2 = {calendarGameGroupObj, new Byte(z10 ? (byte) 1 : (byte) 0), new Byte(z11 ? (byte) 1 : (byte) 0)};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        Class cls = Boolean.TYPE;
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(objArr2, this, changeQuickRedirect2, false, 33373, new Class[]{CalendarGameGroupObj.class, cls, cls}, List.class);
        if (patchProxyResultProxy.isSupported) {
            return (List) patchProxyResultProxy.result;
        }
        ArrayList arrayList = new ArrayList();
        if (!z11 && !com.max.hbcommon.utils.c.w(this.f84569r)) {
            if (!z10) {
                String day_timestamp = calendarGameGroupObj.getDay_timestamp();
                PublishGameTitle publishGameTitle = (PublishGameTitle) A5(this.f84569r);
                objArr = kotlin.jvm.internal.f0.g(day_timestamp, publishGameTitle != null ? publishGameTitle.getDay_timestamp() : null) ? false : true;
            } else if (kotlin.jvm.internal.f0.g(calendarGameGroupObj.getDay_timestamp(), this.f84569r.get(0).getDay_timestamp())) {
                this.f84569r.remove(0);
                com.max.hbcommon.base.adapter.u<PublishGameTitle> uVar = this.f84568q;
                if (uVar != null) {
                    uVar.notifyItemRemoved(0);
                }
            }
        }
        if (objArr != false) {
            String group_name = calendarGameGroupObj.getGroup_name();
            String month_timestamp = calendarGameGroupObj.getMonth_timestamp();
            String day_timestamp2 = calendarGameGroupObj.getDay_timestamp();
            if (day_timestamp2 == null) {
                day_timestamp2 = calendarGameGroupObj.getMonth_timestamp();
            }
            arrayList.add(new PublishGameTitle(group_name, null, month_timestamp, day_timestamp2, null, 16, null));
        }
        if (!com.max.hbcommon.utils.c.w(calendarGameGroupObj.getGame_list())) {
            List<GamePublishBaseObj> game_list = calendarGameGroupObj.getGame_list();
            kotlin.jvm.internal.f0.m(game_list);
            for (GamePublishBaseObj gamePublishBaseObj : game_list) {
                GameObj gameObj = gamePublishBaseObj instanceof GameObj ? (GameObj) gamePublishBaseObj : null;
                String month_timestamp2 = calendarGameGroupObj.getMonth_timestamp();
                String day_timestamp3 = calendarGameGroupObj.getDay_timestamp();
                if (day_timestamp3 == null) {
                    day_timestamp3 = calendarGameGroupObj.getMonth_timestamp();
                }
                arrayList.add(new PublishGameTitle(null, gameObj, month_timestamp2, day_timestamp3, gamePublishBaseObj instanceof GameEventObj ? (GameEventObj) gamePublishBaseObj : null));
            }
        }
        return arrayList;
    }

    private final void u5(boolean z10, String str, String str2) {
        if (PatchProxy.proxy(new Object[]{new Byte(z10 ? (byte) 1 : (byte) 0), str, str2}, this, changeQuickRedirect, false, 33362, new Class[]{Boolean.TYPE, String.class, String.class}, Void.TYPE).isSupported) {
            return;
        }
        HashMap<String, String> mapQ5 = q5();
        if (!com.max.hbcommon.utils.c.w(this.f84572u)) {
            HashMap<String, String> mapX5 = z10 ? null : x5();
            if (mapX5 != null) {
                mapQ5.putAll(mapX5);
            }
            HashMap<String, String> mapR5 = z10 ? r5() : null;
            if (mapR5 != null) {
                mapQ5.putAll(mapR5);
            }
        }
        addDisposable((io.reactivex.disposables.b) com.max.xiaoheihe.network.i.a().P1(str, mapQ5).I5(io.reactivex.schedulers.b.d()).a4(io.reactivex.android.schedulers.a.c()).J5(new g(str, z10, str2)));
    }

    static /* synthetic */ void v5(GamePublishCalendarFragment gamePublishCalendarFragment, boolean z10, String str, String str2, int i10, Object obj) {
        if (PatchProxy.proxy(new Object[]{gamePublishCalendarFragment, new Byte(z10 ? (byte) 1 : (byte) 0), str, str2, new Integer(i10), obj}, null, changeQuickRedirect, true, 33363, new Class[]{GamePublishCalendarFragment.class, Boolean.TYPE, String.class, String.class, Integer.TYPE, Object.class}, Void.TYPE).isSupported) {
            return;
        }
        gamePublishCalendarFragment.u5((i10 & 1) == 0 ? z10 ? 1 : 0 : false, str, (i10 & 4) != 0 ? null : str2);
    }

    private final void w5(String str) {
        if (PatchProxy.proxy(new Object[]{str}, this, changeQuickRedirect, false, 33364, new Class[]{String.class}, Void.TYPE).isSupported) {
            return;
        }
        addDisposable((io.reactivex.disposables.b) com.max.xiaoheihe.network.i.a().W0(str, q5()).I5(io.reactivex.schedulers.b.d()).a4(io.reactivex.android.schedulers.a.c()).J5(new h(str)));
    }

    private final HashMap<String, String> x5() {
        int size;
        String event_id;
        String strZ;
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 33371, new Class[0], HashMap.class);
        if (patchProxyResultProxy.isSupported) {
            return (HashMap) patchProxyResultProxy.result;
        }
        if (com.max.hbcommon.utils.c.w(this.f84569r) || (size = this.f84569r.size() - 1) < 0) {
            return null;
        }
        while (true) {
            int i10 = size - 1;
            GameObj game = this.f84569r.get(size).getGame();
            if (game != null && (strZ = r1.Z(game)) != null) {
                kotlin.jvm.internal.f0.o(strZ, "getGameId(it)");
                HashMap<String, String> map = new HashMap<>();
                map.put("start_appid", strZ);
                return map;
            }
            GameEventObj event = this.f84569r.get(size).getEvent();
            if (event != null && (event_id = event.getEvent_id()) != null) {
                HashMap<String, String> map2 = new HashMap<>();
                map2.put("start_event_id", event_id);
                return map2;
            }
            if (i10 < 0) {
                return null;
            }
            size = i10;
        }
    }

    private final void y5() {
        LoadingDialog loadingDialog;
        boolean z10 = false;
        if (PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 33380, new Class[0], Void.TYPE).isSupported || (loadingDialog = this.A) == null) {
            return;
        }
        if (loadingDialog != null && loadingDialog.i()) {
            z10 = true;
        }
        if (z10) {
            LoadingDialog loadingDialog2 = this.A;
            if (loadingDialog2 != null) {
                loadingDialog2.c();
            }
            this.A = null;
        }
    }

    private final void z5() {
        if (PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 33358, new Class[0], Void.TYPE).isSupported) {
            return;
        }
        i9 i9Var = this.f84567p;
        i9 i9Var2 = null;
        if (i9Var == null) {
            kotlin.jvm.internal.f0.S("binding");
            i9Var = null;
        }
        TickerView tickerView = i9Var.f111696j;
        tickerView.setCharacterLists(TickerUtils.b());
        tickerView.setTextColor(this.mContext.getResources().getColor(R.color.white));
        tickerView.setTextSize(ViewUtils.f(this.mContext, 16.0f));
        tickerView.setTypeface(bb.d.a().b(1));
        tickerView.setAnimationDuration(500L);
        tickerView.setAnimationInterpolator(new DecelerateInterpolator());
        tickerView.setGravity(androidx.core.view.n.f21701b);
        tickerView.setPreferredScrollingDirection(TickerView.ScrollingDirection.DOWN);
        tickerView.setTickerTimeFormat(TickerUtils.TickerTimeFormat.FORMAT_HMS_SEPARATE_BY_SEMICOLON);
        i9 i9Var3 = this.f84567p;
        if (i9Var3 == null) {
            kotlin.jvm.internal.f0.S("binding");
            i9Var3 = null;
        }
        i9Var3.f111695i.setTypeface(bb.d.a().b(1));
        i9 i9Var4 = this.f84567p;
        if (i9Var4 == null) {
            kotlin.jvm.internal.f0.S("binding");
        } else {
            i9Var2 = i9Var4;
        }
        LinearLayout linearLayout = i9Var2.f111700n;
        Activity mContext = this.mContext;
        kotlin.jvm.internal.f0.o(mContext, "mContext");
        linearLayout.setBackground(ViewUtils.i((int) com.max.accelworld.c.a(5.0f, mContext), com.max.xiaoheihe.accelworld.l.h(getContext(), R.color.game_gradient_ultra_lowest_price_start_color), com.max.xiaoheihe.accelworld.l.h(getContext(), R.color.game_gradient_ultra_lowest_price_end_color)));
    }

    @Override // com.max.hbminiprogram.NativeLittleProgramFragment, com.max.hbminiprogram.d
    @dl.d
    public Fragment a2(@dl.e Map<String, ? extends Object> map) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{map}, this, changeQuickRedirect, false, 33385, new Class[]{Map.class}, Fragment.class);
        return patchProxyResultProxy.isSupported ? (Fragment) patchProxyResultProxy.result : new GamePublishCalendarFragment();
    }

    @Override // com.max.hbminiprogram.NativeLittleProgramFragment, com.max.hbminiprogram.fragment.BaseLittleProgramFragment
    public void a4(@dl.e View view, boolean z10) {
        if (PatchProxy.proxy(new Object[]{view, new Byte(z10 ? (byte) 1 : (byte) 0)}, this, changeQuickRedirect, false, 33357, new Class[]{View.class, Boolean.TYPE}, Void.TYPE).isSupported) {
            return;
        }
        super.a4(view, z10);
        this.mTitleBarDivider.setVisibility(8);
        i9 i9VarC = i9.c(this.mInflater);
        kotlin.jvm.internal.f0.o(i9VarC, "inflate(mInflater)");
        this.f84567p = i9VarC;
        i9 i9Var = null;
        if (i9VarC == null) {
            kotlin.jvm.internal.f0.S("binding");
            i9VarC = null;
        }
        setContentView(i9VarC);
        this.mTitleBar.setTitle(R.string.game_publish_calendar);
        Activity mContext = this.mContext;
        kotlin.jvm.internal.f0.o(mContext, "mContext");
        this.f84568q = new c(mContext, this.f84569r, 0, 4, null);
        i9 i9Var2 = this.f84567p;
        if (i9Var2 == null) {
            kotlin.jvm.internal.f0.S("binding");
            i9Var2 = null;
        }
        i9Var2.f111691e.setLayoutManager(new LinearLayoutManager(this.mContext));
        i9 i9Var3 = this.f84567p;
        if (i9Var3 == null) {
            kotlin.jvm.internal.f0.S("binding");
            i9Var3 = null;
        }
        i9Var3.f111691e.setAdapter(this.f84568q);
        i9 i9Var4 = this.f84567p;
        if (i9Var4 == null) {
            kotlin.jvm.internal.f0.S("binding");
            i9Var4 = null;
        }
        i9Var4.f111703q.setVisibility(8);
        this.C = ViewUtils.J(this.mContext) > ViewUtils.f(this.mContext, 700.0f);
        Activity mContext2 = this.mContext;
        kotlin.jvm.internal.f0.o(mContext2, "mContext");
        this.f84570s = new com.max.hbcommon.base.adapter.t(new c(mContext2, this.f84571t, !this.C ? 1 : 0));
        i9 i9Var5 = this.f84567p;
        if (i9Var5 == null) {
            kotlin.jvm.internal.f0.S("binding");
            i9Var5 = null;
        }
        i9Var5.f111692f.setLayoutManager(new LinearLayoutManager(this.mContext));
        i9 i9Var6 = this.f84567p;
        if (i9Var6 == null) {
            kotlin.jvm.internal.f0.S("binding");
            i9Var6 = null;
        }
        i9Var6.f111692f.setAdapter(this.f84570s);
        i9 i9Var7 = this.f84567p;
        if (i9Var7 == null) {
            kotlin.jvm.internal.f0.S("binding");
            i9Var7 = null;
        }
        RecyclerView recyclerView = i9Var7.f111691e;
        kotlin.jvm.internal.f0.o(recyclerView, "binding.rv");
        new com.max.xiaoheihe.module.game.adapter.v(this, recyclerView, false, null, 8, null);
        i9 i9Var8 = this.f84567p;
        if (i9Var8 == null) {
            kotlin.jvm.internal.f0.S("binding");
            i9Var8 = null;
        }
        RecyclerView recyclerView2 = i9Var8.f111692f;
        kotlin.jvm.internal.f0.o(recyclerView2, "binding.rvSingle");
        new com.max.xiaoheihe.module.game.adapter.v(this, recyclerView2, false, null, 8, null);
        if (this.C) {
            i9 i9Var9 = this.f84567p;
            if (i9Var9 == null) {
                kotlin.jvm.internal.f0.S("binding");
                i9Var9 = null;
            }
            i9Var9.f111698l.b().setVisibility(0);
            i9 i9Var10 = this.f84567p;
            if (i9Var10 == null) {
                kotlin.jvm.internal.f0.S("binding");
                i9Var10 = null;
            }
            HBCalendarView hBCalendarView = i9Var10.f111698l.f111477c;
            kotlin.jvm.internal.f0.o(hBCalendarView, "binding.vgCalendar.viewCalendar");
            this.f84576y = hBCalendarView;
            i9 i9Var11 = this.f84567p;
            if (i9Var11 == null) {
                kotlin.jvm.internal.f0.S("binding");
                i9Var11 = null;
            }
            LinearLayout linearLayout = i9Var11.f111698l.f111476b.f114454c;
            kotlin.jvm.internal.f0.o(linearLayout, "binding.vgCalendar.vgEmpty.vgEmpty");
            this.f84577z = linearLayout;
            if (linearLayout == null) {
                kotlin.jvm.internal.f0.S("calendarEmptyView");
                linearLayout = null;
            }
            linearLayout.setVisibility(8);
        } else {
            View viewInflate = this.mInflater.inflate(R.layout.item_game_calendar_header, (ViewGroup) null);
            View viewFindViewById = viewInflate.findViewById(R.id.view_calendar);
            kotlin.jvm.internal.f0.o(viewFindViewById, "calendarView.findViewById(R.id.view_calendar)");
            this.f84576y = (HBCalendarView) viewFindViewById;
            View viewFindViewById2 = viewInflate.findViewById(R.id.vg_empty);
            kotlin.jvm.internal.f0.o(viewFindViewById2, "calendarView.findViewById(R.id.vg_empty)");
            this.f84577z = viewFindViewById2;
            if (viewFindViewById2 == null) {
                kotlin.jvm.internal.f0.S("calendarEmptyView");
                viewFindViewById2 = null;
            }
            viewFindViewById2.setVisibility(8);
            com.max.hbcommon.base.adapter.t tVar = this.f84570s;
            if (tVar != null) {
                tVar.p(R.layout.item_game_calendar_header, viewInflate);
            }
            i9 i9Var12 = this.f84567p;
            if (i9Var12 == null) {
                kotlin.jvm.internal.f0.S("binding");
                i9Var12 = null;
            }
            i9Var12.f111698l.b().setVisibility(8);
        }
        i9 i9Var13 = this.f84567p;
        if (i9Var13 == null) {
            kotlin.jvm.internal.f0.S("binding");
            i9Var13 = null;
        }
        i9Var13.f111690d.setColorFilter(com.max.xiaoheihe.utils.d.E(R.color.text_secondary_1_color));
        i9 i9Var14 = this.f84567p;
        if (i9Var14 == null) {
            kotlin.jvm.internal.f0.S("binding");
            i9Var14 = null;
        }
        i9Var14.f111690d.setOnClickListener(new i());
        i9 i9Var15 = this.f84567p;
        if (i9Var15 == null) {
            kotlin.jvm.internal.f0.S("binding");
            i9Var15 = null;
        }
        i9Var15.f111689c.setImage(R.drawable.common_filter_filled_24x24);
        i9 i9Var16 = this.f84567p;
        if (i9Var16 == null) {
            kotlin.jvm.internal.f0.S("binding");
            i9Var16 = null;
        }
        i9Var16.f111689c.setOnClickListener(new j());
        i9 i9Var17 = this.f84567p;
        if (i9Var17 == null) {
            kotlin.jvm.internal.f0.S("binding");
            i9Var17 = null;
        }
        i9Var17.f111693g.S(new k());
        i9 i9Var18 = this.f84567p;
        if (i9Var18 == null) {
            kotlin.jvm.internal.f0.S("binding");
            i9Var18 = null;
        }
        i9Var18.f111693g.f0(new l());
        i9 i9Var19 = this.f84567p;
        if (i9Var19 == null) {
            kotlin.jvm.internal.f0.S("binding");
            i9Var19 = null;
        }
        i9Var19.f111691e.addOnScrollListener(new RecyclerView.OnScrollListener() { // from class: com.max.xiaoheihe.module.game.GamePublishCalendarFragment$installViews$5
            public static ChangeQuickRedirect changeQuickRedirect;

            @Override // androidx.recyclerview.widget.RecyclerView.OnScrollListener
            public void onScrolled(@dl.d RecyclerView recyclerView3, int i10, int i11) {
                Object[] objArr = {recyclerView3, new Integer(i10), new Integer(i11)};
                ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
                Class cls = Integer.TYPE;
                if (PatchProxy.proxy(objArr, this, changeQuickRedirect2, false, 33444, new Class[]{RecyclerView.class, cls, cls}, Void.TYPE).isSupported) {
                    return;
                }
                kotlin.jvm.internal.f0.p(recyclerView3, "recyclerView");
                super.onScrolled(recyclerView3, i10, i11);
                kotlinx.coroutines.k.f(this.f84604b.f84574w, null, null, new GamePublishCalendarFragment$installViews$5$onScrolled$1(this.f84604b, null), 3, null);
            }
        });
        i9 i9Var20 = this.f84567p;
        if (i9Var20 == null) {
            kotlin.jvm.internal.f0.S("binding");
            i9Var20 = null;
        }
        if (i9Var20.f111691e.getItemAnimator() instanceof SimpleItemAnimator) {
            i9 i9Var21 = this.f84567p;
            if (i9Var21 == null) {
                kotlin.jvm.internal.f0.S("binding");
            } else {
                i9Var = i9Var21;
            }
            RecyclerView.ItemAnimator itemAnimator = i9Var.f111691e.getItemAnimator();
            kotlin.jvm.internal.f0.n(itemAnimator, "null cannot be cast to non-null type androidx.recyclerview.widget.SimpleItemAnimator");
            ((SimpleItemAnimator) itemAnimator).setSupportsChangeAnimations(false);
        }
        z5();
        showLoading();
        n5();
    }

    @Override // com.max.hbminiprogram.fragment.BaseLittleProgramFragment, com.max.hbcommon.base.d
    public void onRefresh() {
        if (PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 33384, new Class[0], Void.TYPE).isSupported) {
            return;
        }
        super.onRefresh();
        showLoading();
        n5();
    }
}
