package com.max.xiaoheihe.module.game.component;

import android.animation.ValueAnimator;
import android.content.Context;
import android.util.AttributeSet;
import android.util.Log;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.compose.runtime.internal.o;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import androidx.viewpager2.widget.ViewPager2;
import com.max.hbcommon.base.adapter.s;
import com.max.hbutils.utils.ViewUtils;
import com.max.hbutils.utils.k;
import com.max.hbutils.utils.n;
import com.max.hbutils.utils.q;
import com.max.xiaoheihe.R;
import com.max.xiaoheihe.bean.game.calendar.ColorObj;
import com.max.xiaoheihe.bean.game.calendar.DayObj;
import com.max.xiaoheihe.bean.game.calendar.MonthObj;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.PatchProxyResult;
import dl.d;
import dl.e;
import java.util.ArrayList;
import java.util.List;
import kotlin.b2;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.internal.f0;
import kotlin.t0;
import kotlinx.coroutines.DelayKt;
import kotlinx.coroutines.e1;
import kotlinx.coroutines.q0;
import kotlinx.coroutines.r0;
import yh.p;

/* JADX INFO: compiled from: HBCalendarView.kt */
/* JADX INFO: loaded from: classes11.dex */
@o(parameters = 0)
public final class HBCalendarView extends LinearLayout {
    public static ChangeQuickRedirect changeQuickRedirect = null;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public static final int f86867j = 8;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @d
    private final String f86868b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @e
    private a f86869c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public ViewPager2 f86870d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private long f86871e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private int f86872f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private int f86873g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    @d
    private final List<MonthObj> f86874h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    @d
    private final q0 f86875i;

    /* JADX INFO: compiled from: HBCalendarView.kt */
    public interface a {
        void a(@d MonthObj monthObj, int i10);

        void b(@e DayObj dayObj);
    }

    /* JADX INFO: compiled from: HBCalendarView.kt */
    public static final class b extends ViewPager2.OnPageChangeCallback {
        public static ChangeQuickRedirect changeQuickRedirect;

        b() {
        }

        @Override // androidx.viewpager2.widget.ViewPager2.OnPageChangeCallback
        public void onPageScrollStateChanged(int i10) {
            if (PatchProxy.proxy(new Object[]{new Integer(i10)}, this, changeQuickRedirect, false, 36822, new Class[]{Integer.TYPE}, Void.TYPE).isSupported) {
                return;
            }
            super.onPageScrollStateChanged(i10);
            if (i10 == 0) {
                HBCalendarView.this.i();
                int currentItem = HBCalendarView.this.getVp().getCurrentItem();
                if (currentItem < 0 || currentItem >= HBCalendarView.this.getMonthList().size()) {
                    return;
                }
                MonthObj monthObj = HBCalendarView.this.getMonthList().get(currentItem);
                if (CalendarUtils.f86571a.u(n.r(monthObj.getMonth_timestamp()), HBCalendarView.this.f86871e) || com.max.hbcommon.utils.c.w(monthObj.getCount_by_day())) {
                    return;
                }
                DayObj dayObj = null;
                List<DayObj> count_by_day = monthObj.getCount_by_day();
                f0.m(count_by_day);
                for (DayObj dayObj2 : count_by_day) {
                    if (CalendarUtils.f86571a.u(n.r(monthObj.getMonth_timestamp()), n.r(dayObj2.getDay_timestamp())) && n.q(dayObj2.getCount()) > 0) {
                        HBCalendarView.this.setSelectDay(n.r(dayObj2.getDay_timestamp()));
                        dayObj = dayObj2;
                        break;
                    }
                }
                a onDateSelectedListener = HBCalendarView.this.getOnDateSelectedListener();
                if (onDateSelectedListener != null) {
                    onDateSelectedListener.b(dayObj);
                }
            }
        }

        @Override // androidx.viewpager2.widget.ViewPager2.OnPageChangeCallback
        public void onPageSelected(int i10) {
            a onDateSelectedListener;
            if (PatchProxy.proxy(new Object[]{new Integer(i10)}, this, changeQuickRedirect, false, 36821, new Class[]{Integer.TYPE}, Void.TYPE).isSupported) {
                return;
            }
            super.onPageSelected(i10);
            if (i10 < 0 || i10 >= HBCalendarView.this.getMonthList().size() || (onDateSelectedListener = HBCalendarView.this.getOnDateSelectedListener()) == null) {
                return;
            }
            onDateSelectedListener.a(HBCalendarView.this.getMonthList().get(i10), i10);
        }
    }

    public HBCalendarView(@e Context context) {
        this(context, null);
    }

    public HBCalendarView(@e Context context, @e AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public HBCalendarView(@e Context context, @e AttributeSet attributeSet, int i10) {
        this(context, attributeSet, i10, 0);
    }

    public HBCalendarView(@e Context context, @e AttributeSet attributeSet, int i10, int i11) {
        super(context, attributeSet, i10, i11);
        this.f86868b = "HBCalendarView";
        this.f86874h = new ArrayList();
        this.f86875i = r0.a(e1.e());
        e();
    }

    public static final /* synthetic */ void b(HBCalendarView hBCalendarView, long j10) {
        if (PatchProxy.proxy(new Object[]{hBCalendarView, new Long(j10)}, null, changeQuickRedirect, true, 36805, new Class[]{HBCalendarView.class, Long.TYPE}, Void.TYPE).isSupported) {
            return;
        }
        hBCalendarView.h(j10);
    }

    private final void d(List<MonthObj> list) {
        List<DayObj> count_by_day;
        List<DayObj> count_by_day2;
        int i10 = 1;
        if (PatchProxy.proxy(new Object[]{list}, this, changeQuickRedirect, false, 36803, new Class[]{List.class}, Void.TYPE).isSupported) {
            return;
        }
        if (list != null) {
            List listB = k.b(k.r(list), MonthObj.class);
            int size = list.size();
            int i11 = 0;
            while (i11 < size) {
                MonthObj monthObj = list.get(i11);
                long jR = n.r(monthObj.getMonth_timestamp());
                CalendarUtils calendarUtils = CalendarUtils.f86571a;
                int iT = calendarUtils.t(jR);
                int iO = calendarUtils.o(jR);
                Log.d(this.f86868b, "index: " + i11 + "  monthTimestamp: " + jR + "  year: " + iT + "  month:" + iO);
                if (i11 == 0) {
                    List<DayObj> listS = calendarUtils.s(iT, iO);
                    List[] listArr = new List[i10];
                    listArr[0] = listS;
                    if (!com.max.hbcommon.utils.c.w(listArr) && (count_by_day2 = monthObj.getCount_by_day()) != null) {
                        count_by_day2.addAll(0, listS);
                    }
                } else {
                    int i12 = i11 - 1;
                    List<DayObj> count_by_day3 = ((MonthObj) listB.get(i12)).getCount_by_day();
                    f0.m(count_by_day3);
                    int size2 = count_by_day3.size();
                    int iL = calendarUtils.l(iT, iO);
                    for (int i13 = 0; i13 < iL; i13++) {
                        List<DayObj> count_by_day4 = monthObj.getCount_by_day();
                        if (count_by_day4 != null) {
                            List<DayObj> count_by_day5 = ((MonthObj) listB.get(i12)).getCount_by_day();
                            f0.m(count_by_day5);
                            count_by_day4.add(0, count_by_day5.get((size2 - 1) - i13));
                        }
                    }
                }
                if (i11 == list.size() - 1) {
                    List<DayObj> listR = CalendarUtils.f86571a.r(iT, iO);
                    if (!com.max.hbcommon.utils.c.w(listR) && (count_by_day = monthObj.getCount_by_day()) != null) {
                        count_by_day.addAll(listR);
                    }
                } else {
                    int iK = CalendarUtils.f86571a.k(iT, iO);
                    for (int i14 = 0; i14 < iK; i14++) {
                        List<DayObj> count_by_day6 = monthObj.getCount_by_day();
                        if (count_by_day6 != null) {
                            List<DayObj> count_by_day7 = ((MonthObj) listB.get(i11 + 1)).getCount_by_day();
                            f0.m(count_by_day7);
                            count_by_day6.add(count_by_day7.get(i14));
                        }
                    }
                }
                i11++;
                i10 = 1;
            }
        }
    }

    private final void e() {
        if (PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 36795, new Class[0], Void.TYPE).isSupported) {
            return;
        }
        setOrientation(1);
        int iL = ViewUtils.L(getContext());
        float fM = ViewUtils.m(getContext(), iL, iL);
        setBackground(q.i(getContext(), R.color.background_layer_2_color, R.color.divider_secondary_1_color, 0.5f, ViewUtils.h0(getContext(), fM)));
        View viewInflate = View.inflate(getContext(), R.layout.layout_calendar_week, null);
        viewInflate.setLayoutParams(new LinearLayout.LayoutParams(-1, ViewUtils.f(getContext(), 27.0f)));
        viewInflate.setBackground(q.M(q.E(getContext(), R.color.divider_secondary_2_color, ViewUtils.h0(getContext(), fM)), getContext(), R.color.divider_secondary_1_color, 0.5f));
        addView(viewInflate);
        setVp(new ViewPager2(getContext()));
        this.f86872f = ViewUtils.f(getContext(), 8.0f);
        getVp().setPadding(0, this.f86872f, 0, 0);
        getVp().setLayoutParams(new LinearLayout.LayoutParams(ViewUtils.L(getContext()) - ViewUtils.f(getContext(), 24.0f), ViewUtils.f(getContext(), 198.0f)));
        this.f86873g = ViewUtils.f(getContext(), 38.0f);
        addView(getVp());
    }

    private final int f(long j10) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{new Long(j10)}, this, changeQuickRedirect, false, 36804, new Class[]{Long.TYPE}, Integer.TYPE);
        if (patchProxyResultProxy.isSupported) {
            return ((Integer) patchProxyResultProxy.result).intValue();
        }
        CalendarUtils calendarUtils = CalendarUtils.f86571a;
        return this.f86872f + (calendarUtils.f(calendarUtils.t(j10), calendarUtils.o(j10)) * this.f86873g);
    }

    private final void h(long j10) {
        RecyclerView.Adapter adapter;
        if (PatchProxy.proxy(new Object[]{new Long(j10)}, this, changeQuickRedirect, false, 36799, new Class[]{Long.TYPE}, Void.TYPE).isSupported) {
            return;
        }
        int size = this.f86874h.size();
        for (int i10 = 0; i10 < size; i10++) {
            MonthObj monthObj = this.f86874h.get(i10);
            if (CalendarUtils.f86571a.u(n.r(monthObj.getMonth_timestamp()), j10)) {
                List<DayObj> count_by_day = monthObj.getCount_by_day();
                f0.m(count_by_day);
                int size2 = count_by_day.size();
                for (int i11 = 0; i11 < size2; i11++) {
                    List<DayObj> count_by_day2 = monthObj.getCount_by_day();
                    f0.m(count_by_day2);
                    if (n.r(count_by_day2.get(i11).getDay_timestamp()) == j10) {
                        View childAt = getVp().getChildAt(0);
                        f0.n(childAt, "null cannot be cast to non-null type androidx.recyclerview.widget.RecyclerView");
                        RecyclerView.LayoutManager layoutManager = ((RecyclerView) childAt).getLayoutManager();
                        View viewFindViewByPosition = layoutManager != null ? layoutManager.findViewByPosition(i10) : null;
                        RecyclerView recyclerView = viewFindViewByPosition != null ? (RecyclerView) viewFindViewByPosition.findViewById(R.id.rv_month) : null;
                        if (recyclerView == null || (adapter = recyclerView.getAdapter()) == null) {
                            return;
                        }
                        adapter.notifyItemChanged(i11);
                        return;
                    }
                }
                return;
            }
        }
    }

    public static /* synthetic */ void k(HBCalendarView hBCalendarView, String str, boolean z10, boolean z11, int i10, Object obj) {
        Object[] objArr = {hBCalendarView, str, new Byte(z10 ? (byte) 1 : (byte) 0), new Byte(z11 ? (byte) 1 : (byte) 0), new Integer(i10), obj};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        Class cls = Boolean.TYPE;
        if (PatchProxy.proxy(objArr, null, changeQuickRedirect2, true, 36801, new Class[]{HBCalendarView.class, String.class, cls, cls, Integer.TYPE, Object.class}, Void.TYPE).isSupported) {
            return;
        }
        hBCalendarView.j(str, (i10 & 2) == 0 ? z10 ? 1 : 0 : false, (i10 & 4) == 0 ? z11 ? 1 : 0 : true);
    }

    public final void g(@e List<MonthObj> list) {
        if (PatchProxy.proxy(new Object[]{list}, this, changeQuickRedirect, false, 36797, new Class[]{List.class}, Void.TYPE).isSupported || list == null) {
            return;
        }
        this.f86874h.clear();
        List<MonthObj> list2 = this.f86874h;
        List listB = k.b(k.r(list), MonthObj.class);
        f0.o(listB, "deserializeList(\n       …ss.java\n                )");
        list2.addAll(listB);
        d(this.f86874h);
        RecyclerView.Adapter adapter = getVp().getAdapter();
        if (adapter != null) {
            adapter.notifyDataSetChanged();
        }
    }

    public final int getLineHeight() {
        return this.f86873g;
    }

    @d
    public final q0 getMainScope() {
        return this.f86875i;
    }

    @d
    public final List<MonthObj> getMonthList() {
        return this.f86874h;
    }

    @e
    public final a getOnDateSelectedListener() {
        return this.f86869c;
    }

    public final long getSelectDayTimestamp() {
        return this.f86871e;
    }

    @d
    public final String getTAG() {
        return this.f86868b;
    }

    public final int getTopPadding() {
        return this.f86872f;
    }

    @d
    public final ViewPager2 getVp() {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 36793, new Class[0], ViewPager2.class);
        if (patchProxyResultProxy.isSupported) {
            return (ViewPager2) patchProxyResultProxy.result;
        }
        ViewPager2 viewPager2 = this.f86870d;
        if (viewPager2 != null) {
            return viewPager2;
        }
        f0.S("vp");
        return null;
    }

    public final void i() {
        int iV;
        int iF;
        if (PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 36802, new Class[0], Void.TYPE).isSupported || (iV = ViewUtils.V(getVp())) == (iF = f(n.r(this.f86874h.get(getVp().getCurrentItem()).getMonth_timestamp())))) {
            return;
        }
        ValueAnimator valueAnimatorOfInt = ValueAnimator.ofInt(iV, iF);
        valueAnimatorOfInt.setDuration(500L);
        valueAnimatorOfInt.setInterpolator(new androidx.interpolator.view.animation.b());
        valueAnimatorOfInt.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() { // from class: com.max.xiaoheihe.module.game.component.HBCalendarView$refreshHeight$1
            public static ChangeQuickRedirect changeQuickRedirect;

            /* JADX INFO: renamed from: com.max.xiaoheihe.module.game.component.HBCalendarView$refreshHeight$1$1, reason: invalid class name */
            /* JADX INFO: compiled from: HBCalendarView.kt */
            @kotlin.coroutines.jvm.internal.d(c = "com.max.xiaoheihe.module.game.component.HBCalendarView$refreshHeight$1$1", f = "HBCalendarView.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
            public static final class AnonymousClass1 extends SuspendLambda implements p<q0, kotlin.coroutines.c<? super b2>, Object> {
                public static ChangeQuickRedirect changeQuickRedirect;

                /* JADX INFO: renamed from: b, reason: collision with root package name */
                int f86878b;

                /* JADX INFO: renamed from: c, reason: collision with root package name */
                final /* synthetic */ ValueAnimator f86879c;

                /* JADX INFO: renamed from: d, reason: collision with root package name */
                final /* synthetic */ HBCalendarView f86880d;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                AnonymousClass1(ValueAnimator valueAnimator, HBCalendarView hBCalendarView, kotlin.coroutines.c<? super AnonymousClass1> cVar) {
                    super(2, cVar);
                    this.f86879c = valueAnimator;
                    this.f86880d = hBCalendarView;
                }

                @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                @d
                public final kotlin.coroutines.c<b2> create(@e Object obj, @d kotlin.coroutines.c<?> cVar) {
                    PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{obj, cVar}, this, changeQuickRedirect, false, 36808, new Class[]{Object.class, kotlin.coroutines.c.class}, kotlin.coroutines.c.class);
                    return patchProxyResultProxy.isSupported ? (kotlin.coroutines.c) patchProxyResultProxy.result : new AnonymousClass1(this.f86879c, this.f86880d, cVar);
                }

                @Override // yh.p
                public /* bridge */ /* synthetic */ Object invoke(q0 q0Var, kotlin.coroutines.c<? super b2> cVar) {
                    PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{q0Var, cVar}, this, changeQuickRedirect, false, 36810, new Class[]{Object.class, Object.class}, Object.class);
                    return patchProxyResultProxy.isSupported ? patchProxyResultProxy.result : invoke2(q0Var, cVar);
                }

                @e
                /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
                public final Object invoke2(@d q0 q0Var, @e kotlin.coroutines.c<? super b2> cVar) {
                    PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{q0Var, cVar}, this, changeQuickRedirect, false, 36809, new Class[]{q0.class, kotlin.coroutines.c.class}, Object.class);
                    return patchProxyResultProxy.isSupported ? patchProxyResultProxy.result : ((AnonymousClass1) create(q0Var, cVar)).invokeSuspend(b2.f124493a);
                }

                @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                @e
                public final Object invokeSuspend(@d Object obj) throws Throwable {
                    PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{obj}, this, changeQuickRedirect, false, 36807, new Class[]{Object.class}, Object.class);
                    if (patchProxyResultProxy.isSupported) {
                        return patchProxyResultProxy.result;
                    }
                    kotlin.coroutines.intrinsics.b.h();
                    if (this.f86878b != 0) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    t0.n(obj);
                    Object animatedValue = this.f86879c.getAnimatedValue();
                    f0.n(animatedValue, "null cannot be cast to non-null type kotlin.Int");
                    int iIntValue = ((Integer) animatedValue).intValue();
                    ViewGroup.LayoutParams layoutParams = this.f86880d.getVp().getLayoutParams();
                    layoutParams.height = iIntValue;
                    this.f86880d.getVp().setLayoutParams(layoutParams);
                    return b2.f124493a;
                }
            }

            @Override // android.animation.ValueAnimator.AnimatorUpdateListener
            public final void onAnimationUpdate(@d ValueAnimator it) {
                if (PatchProxy.proxy(new Object[]{it}, this, changeQuickRedirect, false, 36806, new Class[]{ValueAnimator.class}, Void.TYPE).isSupported) {
                    return;
                }
                f0.p(it, "it");
                kotlinx.coroutines.k.f(this.f86877b.getMainScope(), null, null, new AnonymousClass1(it, this.f86877b, null), 3, null);
            }
        });
        valueAnimatorOfInt.start();
    }

    public final void j(@e String str, boolean z10, boolean z11) {
        Object[] objArr = {str, new Byte(z10 ? (byte) 1 : (byte) 0), new Byte(z11 ? (byte) 1 : (byte) 0)};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        Class cls = Boolean.TYPE;
        if (PatchProxy.proxy(objArr, this, changeQuickRedirect2, false, 36800, new Class[]{String.class, cls, cls}, Void.TYPE).isSupported || str == null) {
            return;
        }
        int size = this.f86874h.size();
        for (int i10 = 0; i10 < size; i10++) {
            if (CalendarUtils.f86571a.u(n.r(this.f86874h.get(i10).getMonth_timestamp()), n.r(str))) {
                if (z10) {
                    long j10 = this.f86871e;
                    this.f86871e = n.r(str);
                    h(j10);
                    h(this.f86871e);
                }
                getVp().setCurrentItem(i10, z11);
                return;
            }
        }
    }

    public final void setData(@e final List<MonthObj> list) {
        if (PatchProxy.proxy(new Object[]{list}, this, changeQuickRedirect, false, 36796, new Class[]{List.class}, Void.TYPE).isSupported || list == null) {
            return;
        }
        this.f86874h.clear();
        List<MonthObj> list2 = this.f86874h;
        List listB = k.b(k.r(list), MonthObj.class);
        f0.o(listB, "deserializeList(\n       …ss.java\n                )");
        list2.addAll(listB);
        d(this.f86874h);
        getVp().setOffscreenPageLimit(list.size());
        ViewPager2 vp = getVp();
        final Context context = getContext();
        final List<MonthObj> list3 = this.f86874h;
        vp.setAdapter(new s<MonthObj>(context, list3) { // from class: com.max.xiaoheihe.module.game.component.HBCalendarView$setData$1$1
            public static ChangeQuickRedirect changeQuickRedirect;

            public void m(@e final s.e eVar, @e final MonthObj monthObj) {
                if (PatchProxy.proxy(new Object[]{eVar, monthObj}, this, changeQuickRedirect, false, 36811, new Class[]{s.e.class, MonthObj.class}, Void.TYPE).isSupported || eVar == null) {
                    return;
                }
                final HBCalendarView hBCalendarView = this.f86881b;
                final List<MonthObj> list4 = list;
                if (monthObj != null) {
                    View viewI = eVar.i(R.id.rv_month);
                    f0.o(viewI, "monthHolder.getView(R.id.rv_month)");
                    final RecyclerView recyclerView = (RecyclerView) viewI;
                    recyclerView.setLayoutManager(new GridLayoutManager(hBCalendarView.getContext(), 7));
                    final Context context2 = hBCalendarView.getContext();
                    final List<DayObj> count_by_day = monthObj.getCount_by_day();
                    recyclerView.setAdapter(new s<DayObj>(context2, count_by_day) { // from class: com.max.xiaoheihe.module.game.component.HBCalendarView$setData$1$1$onBindViewHolder$1$1$1
                        public static ChangeQuickRedirect changeQuickRedirect;

                        /* JADX INFO: compiled from: HBCalendarView.kt */
                        public final /* synthetic */ class a {

                            /* JADX INFO: renamed from: a, reason: collision with root package name */
                            public static final /* synthetic */ int[] f86888a;

                            static {
                                int[] iArr = new int[CalendarUtils.MonthPosition.valuesCustom().length];
                                try {
                                    iArr[CalendarUtils.MonthPosition.BEFORE_MONTH.ordinal()] = 1;
                                } catch (NoSuchFieldError unused) {
                                }
                                try {
                                    iArr[CalendarUtils.MonthPosition.AFTER_MONTH.ordinal()] = 2;
                                } catch (NoSuchFieldError unused2) {
                                }
                                try {
                                    iArr[CalendarUtils.MonthPosition.IN_MONTH.ordinal()] = 3;
                                } catch (NoSuchFieldError unused3) {
                                }
                                f86888a = iArr;
                            }
                        }

                        /* JADX INFO: compiled from: HBCalendarView.kt */
                        public static final class b implements View.OnClickListener {
                            public static ChangeQuickRedirect changeQuickRedirect;

                            /* JADX INFO: renamed from: b, reason: collision with root package name */
                            final /* synthetic */ int f86889b;

                            /* JADX INFO: renamed from: c, reason: collision with root package name */
                            final /* synthetic */ HBCalendarView f86890c;

                            /* JADX INFO: renamed from: d, reason: collision with root package name */
                            final /* synthetic */ DayObj f86891d;

                            /* JADX INFO: renamed from: e, reason: collision with root package name */
                            final /* synthetic */ long f86892e;

                            /* JADX INFO: renamed from: f, reason: collision with root package name */
                            final /* synthetic */ RecyclerView f86893f;

                            /* JADX INFO: renamed from: g, reason: collision with root package name */
                            final /* synthetic */ s.e f86894g;

                            b(int i10, HBCalendarView hBCalendarView, DayObj dayObj, long j10, RecyclerView recyclerView, s.e eVar) {
                                this.f86889b = i10;
                                this.f86890c = hBCalendarView;
                                this.f86891d = dayObj;
                                this.f86892e = j10;
                                this.f86893f = recyclerView;
                                this.f86894g = eVar;
                            }

                            @Override // android.view.View.OnClickListener
                            public final void onClick(View view) {
                                if (!PatchProxy.proxy(new Object[]{view}, this, changeQuickRedirect, false, 36820, new Class[]{View.class}, Void.TYPE).isSupported && this.f86889b > 0) {
                                    HBCalendarView.a onDateSelectedListener = this.f86890c.getOnDateSelectedListener();
                                    if (onDateSelectedListener != null) {
                                        onDateSelectedListener.b(this.f86891d);
                                    }
                                    long j10 = this.f86890c.f86871e;
                                    this.f86890c.f86871e = this.f86892e;
                                    HBCalendarView.b(this.f86890c, j10);
                                    RecyclerView.Adapter adapter = this.f86893f.getAdapter();
                                    if (adapter != null) {
                                        adapter.notifyItemChanged(this.f86894g.getAbsoluteAdapterPosition());
                                    }
                                }
                            }
                        }

                        public void m(@e s.e eVar2, @e final DayObj dayObj) {
                            if (PatchProxy.proxy(new Object[]{eVar2, dayObj}, this, changeQuickRedirect, false, 36813, new Class[]{s.e.class, DayObj.class}, Void.TYPE).isSupported || eVar2 == null) {
                                return;
                            }
                            final HBCalendarView hBCalendarView2 = hBCalendarView;
                            MonthObj monthObj2 = monthObj;
                            final s.e eVar3 = eVar;
                            final List<MonthObj> list5 = list4;
                            RecyclerView recyclerView2 = recyclerView;
                            if (dayObj != null) {
                                View viewI2 = eVar2.i(R.id.v_bg);
                                TextView textView = (TextView) eVar2.i(R.id.tv_date);
                                final long jR = n.r(dayObj.getDay_timestamp());
                                int iF = ViewUtils.f(hBCalendarView2.getContext(), 13.0f);
                                CalendarUtils calendarUtils = CalendarUtils.f86571a;
                                final CalendarUtils.MonthPosition monthPositionH = calendarUtils.h(n.r(monthObj2.getMonth_timestamp()), jR);
                                final int iQ = n.q(dayObj.getCount());
                                textView.setText(String.valueOf(calendarUtils.j(jR)));
                                textView.setTextSize(1, 12.0f);
                                int i10 = a.f86888a[monthPositionH.ordinal()];
                                if (i10 == 1 || i10 == 2) {
                                    textView.setTypeface(com.max.hbresource.a.f71893a.a(com.max.hbresource.a.f71894b));
                                    viewI2.setAlpha(0.0f);
                                    textView.setTextColor(com.max.xiaoheihe.utils.d.E(R.color.divider_primary_1_color));
                                    eVar2.itemView.setOnClickListener(new View.OnClickListener() { // from class: com.max.xiaoheihe.module.game.component.HBCalendarView$setData$1$1$onBindViewHolder$1$1$1$onBindViewHolder$1$1$1
                                        public static ChangeQuickRedirect changeQuickRedirect;

                                        /* JADX INFO: renamed from: com.max.xiaoheihe.module.game.component.HBCalendarView$setData$1$1$onBindViewHolder$1$1$1$onBindViewHolder$1$1$1$1, reason: invalid class name */
                                        /* JADX INFO: compiled from: HBCalendarView.kt */
                                        @kotlin.coroutines.jvm.internal.d(c = "com.max.xiaoheihe.module.game.component.HBCalendarView$setData$1$1$onBindViewHolder$1$1$1$onBindViewHolder$1$1$1$1", f = "HBCalendarView.kt", i = {}, l = {bb.c.b.f31028x0}, m = "invokeSuspend", n = {}, s = {})
                                        public static final class AnonymousClass1 extends SuspendLambda implements p<q0, kotlin.coroutines.c<? super b2>, Object> {
                                            public static ChangeQuickRedirect changeQuickRedirect;

                                            /* JADX INFO: renamed from: b, reason: collision with root package name */
                                            int f86902b;

                                            /* JADX INFO: renamed from: c, reason: collision with root package name */
                                            final /* synthetic */ HBCalendarView f86903c;

                                            /* JADX INFO: renamed from: d, reason: collision with root package name */
                                            final /* synthetic */ DayObj f86904d;

                                            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                            AnonymousClass1(HBCalendarView hBCalendarView, DayObj dayObj, kotlin.coroutines.c<? super AnonymousClass1> cVar) {
                                                super(2, cVar);
                                                this.f86903c = hBCalendarView;
                                                this.f86904d = dayObj;
                                            }

                                            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                                            @d
                                            public final kotlin.coroutines.c<b2> create(@e Object obj, @d kotlin.coroutines.c<?> cVar) {
                                                PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{obj, cVar}, this, changeQuickRedirect, false, 36817, new Class[]{Object.class, kotlin.coroutines.c.class}, kotlin.coroutines.c.class);
                                                return patchProxyResultProxy.isSupported ? (kotlin.coroutines.c) patchProxyResultProxy.result : new AnonymousClass1(this.f86903c, this.f86904d, cVar);
                                            }

                                            @Override // yh.p
                                            public /* bridge */ /* synthetic */ Object invoke(q0 q0Var, kotlin.coroutines.c<? super b2> cVar) {
                                                PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{q0Var, cVar}, this, changeQuickRedirect, false, 36819, new Class[]{Object.class, Object.class}, Object.class);
                                                return patchProxyResultProxy.isSupported ? patchProxyResultProxy.result : invoke2(q0Var, cVar);
                                            }

                                            @e
                                            /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
                                            public final Object invoke2(@d q0 q0Var, @e kotlin.coroutines.c<? super b2> cVar) {
                                                PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{q0Var, cVar}, this, changeQuickRedirect, false, 36818, new Class[]{q0.class, kotlin.coroutines.c.class}, Object.class);
                                                return patchProxyResultProxy.isSupported ? patchProxyResultProxy.result : ((AnonymousClass1) create(q0Var, cVar)).invokeSuspend(b2.f124493a);
                                            }

                                            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                                            @e
                                            public final Object invokeSuspend(@d Object obj) throws Throwable {
                                                PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{obj}, this, changeQuickRedirect, false, 36816, new Class[]{Object.class}, Object.class);
                                                if (patchProxyResultProxy.isSupported) {
                                                    return patchProxyResultProxy.result;
                                                }
                                                Object objH = kotlin.coroutines.intrinsics.b.h();
                                                int i10 = this.f86902b;
                                                if (i10 == 0) {
                                                    t0.n(obj);
                                                    this.f86902b = 1;
                                                    if (DelayKt.b(150L, this) == objH) {
                                                        return objH;
                                                    }
                                                } else {
                                                    if (i10 != 1) {
                                                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                                                    }
                                                    t0.n(obj);
                                                }
                                                HBCalendarView.a onDateSelectedListener = this.f86903c.getOnDateSelectedListener();
                                                if (onDateSelectedListener != null) {
                                                    onDateSelectedListener.b(this.f86904d);
                                                }
                                                return b2.f124493a;
                                            }
                                        }

                                        @Override // android.view.View.OnClickListener
                                        public final void onClick(View view) {
                                            if (!PatchProxy.proxy(new Object[]{view}, this, changeQuickRedirect, false, 36815, new Class[]{View.class}, Void.TYPE).isSupported && iQ > 0) {
                                                long j10 = hBCalendarView2.f86871e;
                                                hBCalendarView2.f86871e = jR;
                                                if (monthPositionH == CalendarUtils.MonthPosition.BEFORE_MONTH) {
                                                    if (eVar3.getAbsoluteAdapterPosition() > 0) {
                                                        int absoluteAdapterPosition = eVar3.getAbsoluteAdapterPosition() - 1;
                                                        hBCalendarView2.getVp().setCurrentItem(absoluteAdapterPosition, true);
                                                        RecyclerView.Adapter adapter = hBCalendarView2.getVp().getAdapter();
                                                        if (adapter != null) {
                                                            adapter.notifyItemChanged(absoluteAdapterPosition);
                                                        }
                                                        HBCalendarView.b(hBCalendarView2, j10);
                                                    }
                                                } else if (eVar3.getAbsoluteAdapterPosition() < list5.size() - 1) {
                                                    int absoluteAdapterPosition2 = eVar3.getAbsoluteAdapterPosition() + 1;
                                                    hBCalendarView2.getVp().setCurrentItem(absoluteAdapterPosition2, true);
                                                    RecyclerView.Adapter adapter2 = hBCalendarView2.getVp().getAdapter();
                                                    if (adapter2 != null) {
                                                        adapter2.notifyItemChanged(absoluteAdapterPosition2);
                                                    }
                                                    HBCalendarView.b(hBCalendarView2, j10);
                                                }
                                                kotlinx.coroutines.k.f(hBCalendarView2.getMainScope(), null, null, new AnonymousClass1(hBCalendarView2, dayObj, null), 3, null);
                                            }
                                        }
                                    });
                                    return;
                                }
                                if (i10 != 3) {
                                    return;
                                }
                                textView.setTypeface(com.max.hbresource.a.f71893a.a(com.max.hbresource.a.f71895c));
                                if (jR == hBCalendarView2.f86871e) {
                                    viewI2.setAlpha(1.0f);
                                    viewI2.setBackground(ViewUtils.G(iF, com.max.xiaoheihe.utils.d.E(R.color.text_primary_1_color)));
                                    textView.setTextColor(com.max.xiaoheihe.utils.d.E(R.color.white));
                                } else if (iQ == 0) {
                                    viewI2.setAlpha(0.0f);
                                    textView.setTextColor(com.max.xiaoheihe.utils.d.E(R.color.text_secondary_2_color));
                                } else {
                                    ColorObj color_info = dayObj.getColor_info();
                                    viewI2.setAlpha(n.p(color_info != null ? color_info.getOpacity() : null));
                                    ColorObj color_info2 = dayObj.getColor_info();
                                    int iE1 = com.max.xiaoheihe.utils.d.e1(color_info2 != null ? color_info2.getStart() : null);
                                    ColorObj color_info3 = dayObj.getColor_info();
                                    viewI2.setBackground(ViewUtils.i(iF, iE1, com.max.xiaoheihe.utils.d.e1(color_info3 != null ? color_info3.getEnd() : null)));
                                    textView.setTextColor(com.max.xiaoheihe.utils.d.E(R.color.white));
                                }
                                if (jR == calendarUtils.g()) {
                                    textView.setText("今天");
                                    textView.setTextSize(1, 9.0f);
                                }
                                eVar2.itemView.setOnClickListener(new b(iQ, hBCalendarView2, dayObj, jR, recyclerView2, eVar2));
                            }
                        }

                        @Override // com.max.hbcommon.base.adapter.s
                        public /* bridge */ /* synthetic */ void onBindViewHolder(s.e eVar2, DayObj dayObj) {
                            if (PatchProxy.proxy(new Object[]{eVar2, dayObj}, this, changeQuickRedirect, false, 36814, new Class[]{s.e.class, Object.class}, Void.TYPE).isSupported) {
                                return;
                            }
                            m(eVar2, dayObj);
                        }
                    });
                }
            }

            @Override // com.max.hbcommon.base.adapter.s
            public /* bridge */ /* synthetic */ void onBindViewHolder(s.e eVar, MonthObj monthObj) {
                if (PatchProxy.proxy(new Object[]{eVar, monthObj}, this, changeQuickRedirect, false, 36812, new Class[]{s.e.class, Object.class}, Void.TYPE).isSupported) {
                    return;
                }
                m(eVar, monthObj);
            }
        });
        int size = list.size();
        for (int i10 = 0; i10 < size; i10++) {
            long jR = n.r(list.get(i10).getMonth_timestamp());
            CalendarUtils calendarUtils = CalendarUtils.f86571a;
            if (calendarUtils.u(calendarUtils.g(), jR)) {
                getVp().setCurrentItem(i10, false);
                getVp().getLayoutParams().height = f(jR);
                break;
            }
        }
        getVp().registerOnPageChangeCallback(new b());
    }

    public final void setLineHeight(int i10) {
        this.f86873g = i10;
    }

    public final void setOnDateSelectedListener(@e a aVar) {
        this.f86869c = aVar;
    }

    public final void setSelectDay(long j10) {
        if (PatchProxy.proxy(new Object[]{new Long(j10)}, this, changeQuickRedirect, false, 36798, new Class[]{Long.TYPE}, Void.TYPE).isSupported) {
            return;
        }
        long j11 = this.f86871e;
        this.f86871e = j10;
        h(j11);
        h(this.f86871e);
        a aVar = this.f86869c;
        if (aVar != null) {
            aVar.b(new DayObj(String.valueOf(j10), null, null, 6, null));
        }
    }

    public final void setTopPadding(int i10) {
        this.f86872f = i10;
    }

    public final void setVp(@d ViewPager2 viewPager2) {
        if (PatchProxy.proxy(new Object[]{viewPager2}, this, changeQuickRedirect, false, 36794, new Class[]{ViewPager2.class}, Void.TYPE).isSupported) {
            return;
        }
        f0.p(viewPager2, "<set-?>");
        this.f86870d = viewPager2;
    }
}
