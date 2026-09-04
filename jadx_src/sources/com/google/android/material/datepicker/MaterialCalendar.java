package com.google.android.material.datepicker;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.Canvas;
import android.os.Bundle;
import android.view.ContextThemeWrapper;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.GridView;
import android.widget.ListAdapter;
import androidx.annotation.RestrictTo;
import androidx.annotation.e1;
import androidx.annotation.j1;
import androidx.annotation.n0;
import androidx.annotation.p0;
import androidx.annotation.t0;
import androidx.core.view.accessibility.a0;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.PagerSnapHelper;
import androidx.recyclerview.widget.RecyclerView;
import com.google.android.material.R;
import com.google.android.material.button.MaterialButton;
import java.util.Calendar;
import java.util.Iterator;

/* JADX INFO: loaded from: classes7.dex */
@RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
public final class MaterialCalendar<S> extends q<S> {

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    private static final String f53987p = "THEME_RES_ID_KEY";

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    private static final String f53988q = "GRID_SELECTOR_KEY";

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    private static final String f53989r = "CALENDAR_CONSTRAINTS_KEY";

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    private static final String f53990s = "DAY_VIEW_DECORATOR_KEY";

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    private static final String f53991t = "CURRENT_MONTH_KEY";

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    private static final int f53992u = 3;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    @j1
    static final Object f53993v = "MONTHS_VIEW_GROUP_TAG";

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    @j1
    static final Object f53994w = "NAVIGATION_PREV_TAG";

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    @j1
    static final Object f53995x = "NAVIGATION_NEXT_TAG";

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    @j1
    static final Object f53996y = "SELECTOR_TOGGLE_TAG";

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @e1
    private int f53997c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @p0
    private DateSelector<S> f53998d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    @p0
    private CalendarConstraints f53999e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    @p0
    private DayViewDecorator f54000f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    @p0
    private Month f54001g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private CalendarSelector f54002h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private com.google.android.material.datepicker.b f54003i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private RecyclerView f54004j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private RecyclerView f54005k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private View f54006l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private View f54007m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private View f54008n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    private View f54009o;

    public enum CalendarSelector {
        DAY,
        YEAR
    }

    public class a implements View.OnClickListener {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ o f54012b;

        a(o oVar) {
            this.f54012b = oVar;
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            int iFindLastVisibleItemPosition = MaterialCalendar.this.d4().findLastVisibleItemPosition() - 1;
            if (iFindLastVisibleItemPosition >= 0) {
                MaterialCalendar.this.h4(this.f54012b.n(iFindLastVisibleItemPosition));
            }
        }
    }

    public class b implements Runnable {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ int f54014b;

        b(int i10) {
            this.f54014b = i10;
        }

        @Override // java.lang.Runnable
        public void run() {
            MaterialCalendar.this.f54005k.smoothScrollToPosition(this.f54014b);
        }
    }

    public class c extends androidx.core.view.a {
        c() {
        }

        @Override // androidx.core.view.a
        public void onInitializeAccessibilityNodeInfo(View view, @n0 a0 a0Var) {
            super.onInitializeAccessibilityNodeInfo(view, a0Var);
            a0Var.d1(null);
        }
    }

    public class d implements k {
        d() {
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // com.google.android.material.datepicker.MaterialCalendar.k
        public void a(long j10) {
            if (MaterialCalendar.this.f53999e.j().e(j10)) {
                MaterialCalendar.this.f53998d.w0(j10);
                Iterator<p<S>> it = MaterialCalendar.this.f54169b.iterator();
                while (it.hasNext()) {
                    it.next().b(MaterialCalendar.this.f53998d.t());
                }
                MaterialCalendar.this.f54005k.getAdapter().notifyDataSetChanged();
                if (MaterialCalendar.this.f54004j != null) {
                    MaterialCalendar.this.f54004j.getAdapter().notifyDataSetChanged();
                }
            }
        }
    }

    public class e extends androidx.core.view.a {
        e() {
        }

        @Override // androidx.core.view.a
        public void onInitializeAccessibilityNodeInfo(View view, @n0 a0 a0Var) {
            super.onInitializeAccessibilityNodeInfo(view, a0Var);
            a0Var.M1(false);
        }
    }

    public class f extends RecyclerView.ItemDecoration {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final Calendar f54019b = s.v();

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private final Calendar f54020c = s.v();

        f() {
        }

        @Override // androidx.recyclerview.widget.RecyclerView.ItemDecoration
        public void onDraw(@n0 Canvas canvas, @n0 RecyclerView recyclerView, @n0 RecyclerView.State state) {
            if ((recyclerView.getAdapter() instanceof t) && (recyclerView.getLayoutManager() instanceof GridLayoutManager)) {
                t tVar = (t) recyclerView.getAdapter();
                GridLayoutManager gridLayoutManager = (GridLayoutManager) recyclerView.getLayoutManager();
                for (androidx.core.util.k<Long, Long> kVar : MaterialCalendar.this.f53998d.r1()) {
                    Long l10 = kVar.f21263a;
                    if (l10 != null && kVar.f21264b != null) {
                        this.f54019b.setTimeInMillis(l10.longValue());
                        this.f54020c.setTimeInMillis(kVar.f21264b.longValue());
                        int iO = tVar.o(this.f54019b.get(1));
                        int iO2 = tVar.o(this.f54020c.get(1));
                        View viewFindViewByPosition = gridLayoutManager.findViewByPosition(iO);
                        View viewFindViewByPosition2 = gridLayoutManager.findViewByPosition(iO2);
                        int spanCount = iO / gridLayoutManager.getSpanCount();
                        int spanCount2 = iO2 / gridLayoutManager.getSpanCount();
                        int i10 = spanCount;
                        while (i10 <= spanCount2) {
                            View viewFindViewByPosition3 = gridLayoutManager.findViewByPosition(gridLayoutManager.getSpanCount() * i10);
                            if (viewFindViewByPosition3 != null) {
                                canvas.drawRect((i10 != spanCount || viewFindViewByPosition == null) ? 0 : viewFindViewByPosition.getLeft() + (viewFindViewByPosition.getWidth() / 2), viewFindViewByPosition3.getTop() + MaterialCalendar.this.f54003i.f54072d.e(), (i10 != spanCount2 || viewFindViewByPosition2 == null) ? recyclerView.getWidth() : viewFindViewByPosition2.getLeft() + (viewFindViewByPosition2.getWidth() / 2), viewFindViewByPosition3.getBottom() - MaterialCalendar.this.f54003i.f54072d.b(), MaterialCalendar.this.f54003i.f54076h);
                            }
                            i10++;
                        }
                    }
                }
            }
        }
    }

    public class g extends androidx.core.view.a {
        g() {
        }

        @Override // androidx.core.view.a
        public void onInitializeAccessibilityNodeInfo(View view, @n0 a0 a0Var) {
            super.onInitializeAccessibilityNodeInfo(view, a0Var);
            a0Var.q1(MaterialCalendar.this.f54009o.getVisibility() == 0 ? MaterialCalendar.this.getString(R.string.mtrl_picker_toggle_to_year_selection) : MaterialCalendar.this.getString(R.string.mtrl_picker_toggle_to_day_selection));
        }
    }

    public class h extends RecyclerView.OnScrollListener {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ o f54023b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ MaterialButton f54024c;

        h(o oVar, MaterialButton materialButton) {
            this.f54023b = oVar;
            this.f54024c = materialButton;
        }

        @Override // androidx.recyclerview.widget.RecyclerView.OnScrollListener
        public void onScrollStateChanged(@n0 RecyclerView recyclerView, int i10) {
            if (i10 == 0) {
                recyclerView.announceForAccessibility(this.f54024c.getText());
            }
        }

        @Override // androidx.recyclerview.widget.RecyclerView.OnScrollListener
        public void onScrolled(@n0 RecyclerView recyclerView, int i10, int i11) {
            int iFindFirstVisibleItemPosition = i10 < 0 ? MaterialCalendar.this.d4().findFirstVisibleItemPosition() : MaterialCalendar.this.d4().findLastVisibleItemPosition();
            MaterialCalendar.this.f54001g = this.f54023b.n(iFindFirstVisibleItemPosition);
            this.f54024c.setText(this.f54023b.o(iFindFirstVisibleItemPosition));
        }
    }

    public class i implements View.OnClickListener {
        i() {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            MaterialCalendar.this.k4();
        }
    }

    public class j implements View.OnClickListener {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ o f54027b;

        j(o oVar) {
            this.f54027b = oVar;
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            int iFindFirstVisibleItemPosition = MaterialCalendar.this.d4().findFirstVisibleItemPosition() + 1;
            if (iFindFirstVisibleItemPosition < MaterialCalendar.this.f54005k.getAdapter().getItemCount()) {
                MaterialCalendar.this.h4(this.f54027b.n(iFindFirstVisibleItemPosition));
            }
        }
    }

    public interface k {
        void a(long j10);
    }

    private void W3(@n0 View view, @n0 o oVar) {
        MaterialButton materialButton = (MaterialButton) view.findViewById(R.id.month_navigation_fragment_toggle);
        materialButton.setTag(f53996y);
        androidx.core.view.j1.B1(materialButton, new g());
        View viewFindViewById = view.findViewById(R.id.month_navigation_previous);
        this.f54006l = viewFindViewById;
        viewFindViewById.setTag(f53994w);
        View viewFindViewById2 = view.findViewById(R.id.month_navigation_next);
        this.f54007m = viewFindViewById2;
        viewFindViewById2.setTag(f53995x);
        this.f54008n = view.findViewById(R.id.mtrl_calendar_year_selector_frame);
        this.f54009o = view.findViewById(R.id.mtrl_calendar_day_selector_frame);
        i4(CalendarSelector.DAY);
        materialButton.setText(this.f54001g.k());
        this.f54005k.addOnScrollListener(new h(oVar, materialButton));
        materialButton.setOnClickListener(new i());
        this.f54007m.setOnClickListener(new j(oVar));
        this.f54006l.setOnClickListener(new a(oVar));
    }

    @n0
    private RecyclerView.ItemDecoration X3() {
        return new f();
    }

    @t0
    static int b4(@n0 Context context) {
        return context.getResources().getDimensionPixelSize(R.dimen.mtrl_calendar_day_height);
    }

    private static int c4(@n0 Context context) {
        Resources resources = context.getResources();
        int dimensionPixelSize = resources.getDimensionPixelSize(R.dimen.mtrl_calendar_navigation_height) + resources.getDimensionPixelOffset(R.dimen.mtrl_calendar_navigation_top_padding) + resources.getDimensionPixelOffset(R.dimen.mtrl_calendar_navigation_bottom_padding);
        int dimensionPixelSize2 = resources.getDimensionPixelSize(R.dimen.mtrl_calendar_days_of_week_height);
        int i10 = n.f54151h;
        return dimensionPixelSize + dimensionPixelSize2 + (resources.getDimensionPixelSize(R.dimen.mtrl_calendar_day_height) * i10) + ((i10 - 1) * resources.getDimensionPixelOffset(R.dimen.mtrl_calendar_month_vertical_padding)) + resources.getDimensionPixelOffset(R.dimen.mtrl_calendar_bottom_padding);
    }

    @n0
    public static <T> MaterialCalendar<T> e4(@n0 DateSelector<T> dateSelector, @e1 int i10, @n0 CalendarConstraints calendarConstraints) {
        return f4(dateSelector, i10, calendarConstraints, null);
    }

    @n0
    public static <T> MaterialCalendar<T> f4(@n0 DateSelector<T> dateSelector, @e1 int i10, @n0 CalendarConstraints calendarConstraints, @p0 DayViewDecorator dayViewDecorator) {
        MaterialCalendar<T> materialCalendar = new MaterialCalendar<>();
        Bundle bundle = new Bundle();
        bundle.putInt(f53987p, i10);
        bundle.putParcelable(f53988q, dateSelector);
        bundle.putParcelable(f53989r, calendarConstraints);
        bundle.putParcelable(f53990s, dayViewDecorator);
        bundle.putParcelable(f53991t, calendarConstraints.p());
        materialCalendar.setArguments(bundle);
        return materialCalendar;
    }

    private void g4(int i10) {
        this.f54005k.post(new b(i10));
    }

    private void j4() {
        androidx.core.view.j1.B1(this.f54005k, new e());
    }

    @Override // com.google.android.material.datepicker.q
    public boolean L3(@n0 p<S> pVar) {
        return super.L3(pVar);
    }

    @Override // com.google.android.material.datepicker.q
    @p0
    public DateSelector<S> N3() {
        return this.f53998d;
    }

    @p0
    CalendarConstraints Y3() {
        return this.f53999e;
    }

    com.google.android.material.datepicker.b Z3() {
        return this.f54003i;
    }

    @p0
    Month a4() {
        return this.f54001g;
    }

    @n0
    LinearLayoutManager d4() {
        return (LinearLayoutManager) this.f54005k.getLayoutManager();
    }

    void h4(Month month) {
        o oVar = (o) this.f54005k.getAdapter();
        int iP = oVar.p(month);
        int iP2 = iP - oVar.p(this.f54001g);
        boolean z10 = Math.abs(iP2) > 3;
        boolean z11 = iP2 > 0;
        this.f54001g = month;
        if (z10 && z11) {
            this.f54005k.scrollToPosition(iP - 3);
            g4(iP);
        } else if (!z10) {
            g4(iP);
        } else {
            this.f54005k.scrollToPosition(iP + 3);
            g4(iP);
        }
    }

    void i4(CalendarSelector calendarSelector) {
        this.f54002h = calendarSelector;
        if (calendarSelector == CalendarSelector.YEAR) {
            this.f54004j.getLayoutManager().scrollToPosition(((t) this.f54004j.getAdapter()).o(this.f54001g.f54034d));
            this.f54008n.setVisibility(0);
            this.f54009o.setVisibility(8);
            this.f54006l.setVisibility(8);
            this.f54007m.setVisibility(8);
            return;
        }
        if (calendarSelector == CalendarSelector.DAY) {
            this.f54008n.setVisibility(8);
            this.f54009o.setVisibility(0);
            this.f54006l.setVisibility(0);
            this.f54007m.setVisibility(0);
            h4(this.f54001g);
        }
    }

    void k4() {
        CalendarSelector calendarSelector = this.f54002h;
        CalendarSelector calendarSelector2 = CalendarSelector.YEAR;
        if (calendarSelector == calendarSelector2) {
            i4(CalendarSelector.DAY);
        } else if (calendarSelector == CalendarSelector.DAY) {
            i4(calendarSelector2);
        }
    }

    @Override // androidx.fragment.app.Fragment
    public void onCreate(@p0 Bundle bundle) {
        super.onCreate(bundle);
        if (bundle == null) {
            bundle = getArguments();
        }
        this.f53997c = bundle.getInt(f53987p);
        this.f53998d = (DateSelector) bundle.getParcelable(f53988q);
        this.f53999e = (CalendarConstraints) bundle.getParcelable(f53989r);
        this.f54000f = (DayViewDecorator) bundle.getParcelable(f53990s);
        this.f54001g = (Month) bundle.getParcelable(f53991t);
    }

    @Override // androidx.fragment.app.Fragment
    @n0
    public View onCreateView(@n0 LayoutInflater layoutInflater, @p0 ViewGroup viewGroup, @p0 Bundle bundle) {
        int i10;
        final int i11;
        ContextThemeWrapper contextThemeWrapper = new ContextThemeWrapper(getContext(), this.f53997c);
        this.f54003i = new com.google.android.material.datepicker.b(contextThemeWrapper);
        LayoutInflater layoutInflaterCloneInContext = layoutInflater.cloneInContext(contextThemeWrapper);
        Month monthU = this.f53999e.u();
        if (com.google.android.material.datepicker.j.k4(contextThemeWrapper)) {
            i10 = R.layout.mtrl_calendar_vertical;
            i11 = 1;
        } else {
            i10 = R.layout.mtrl_calendar_horizontal;
            i11 = 0;
        }
        View viewInflate = layoutInflaterCloneInContext.inflate(i10, viewGroup, false);
        viewInflate.setMinimumHeight(c4(requireContext()));
        GridView gridView = (GridView) viewInflate.findViewById(R.id.mtrl_calendar_days_of_week);
        androidx.core.view.j1.B1(gridView, new c());
        int iN = this.f53999e.n();
        gridView.setAdapter((ListAdapter) (iN > 0 ? new com.google.android.material.datepicker.i(iN) : new com.google.android.material.datepicker.i()));
        gridView.setNumColumns(monthU.f54035e);
        gridView.setEnabled(false);
        this.f54005k = (RecyclerView) viewInflate.findViewById(R.id.mtrl_calendar_months);
        this.f54005k.setLayoutManager(new SmoothCalendarLayoutManager(getContext(), i11, false) { // from class: com.google.android.material.datepicker.MaterialCalendar.2
            @Override // androidx.recyclerview.widget.LinearLayoutManager
            protected void calculateExtraLayoutSpace(@n0 RecyclerView.State state, @n0 int[] iArr) {
                if (i11 == 0) {
                    iArr[0] = MaterialCalendar.this.f54005k.getWidth();
                    iArr[1] = MaterialCalendar.this.f54005k.getWidth();
                } else {
                    iArr[0] = MaterialCalendar.this.f54005k.getHeight();
                    iArr[1] = MaterialCalendar.this.f54005k.getHeight();
                }
            }
        });
        this.f54005k.setTag(f53993v);
        o oVar = new o(contextThemeWrapper, this.f53998d, this.f53999e, this.f54000f, new d());
        this.f54005k.setAdapter(oVar);
        int integer = contextThemeWrapper.getResources().getInteger(R.integer.mtrl_calendar_year_selector_span);
        RecyclerView recyclerView = (RecyclerView) viewInflate.findViewById(R.id.mtrl_calendar_year_selector_frame);
        this.f54004j = recyclerView;
        if (recyclerView != null) {
            recyclerView.setHasFixedSize(true);
            this.f54004j.setLayoutManager(new GridLayoutManager((Context) contextThemeWrapper, integer, 1, false));
            this.f54004j.setAdapter(new t(this));
            this.f54004j.addItemDecoration(X3());
        }
        if (viewInflate.findViewById(R.id.month_navigation_fragment_toggle) != null) {
            W3(viewInflate, oVar);
        }
        if (!com.google.android.material.datepicker.j.k4(contextThemeWrapper)) {
            new PagerSnapHelper().attachToRecyclerView(this.f54005k);
        }
        this.f54005k.scrollToPosition(oVar.p(this.f54001g));
        j4();
        return viewInflate;
    }

    @Override // androidx.fragment.app.Fragment
    public void onSaveInstanceState(@n0 Bundle bundle) {
        super.onSaveInstanceState(bundle);
        bundle.putInt(f53987p, this.f53997c);
        bundle.putParcelable(f53988q, this.f53998d);
        bundle.putParcelable(f53989r, this.f53999e);
        bundle.putParcelable(f53990s, this.f54000f);
        bundle.putParcelable(f53991t, this.f54001g);
    }
}
