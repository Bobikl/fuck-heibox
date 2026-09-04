package com.max.xiaoheihe.module.game.component.dota2;

import android.content.Context;
import android.content.DialogInterface;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import android.widget.TextView;
import androidx.compose.runtime.internal.o;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.max.hbcommon.base.adapter.s;
import com.max.hbcommon.component.bubble.k;
import com.max.hbcustomview.bubble.BubbleView;
import com.max.hbutils.utils.ViewUtils;
import com.max.hbutils.utils.n;
import com.max.hbutils.utils.q;
import com.max.xiaoheihe.R;
import com.max.xiaoheihe.bean.game.gameoverview.CalendarObj;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.PatchProxyResult;
import dl.d;
import dl.e;
import fc.c;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;
import java.util.List;
import java.util.Locale;
import kotlin.jvm.internal.f0;
import kotlin.jvm.internal.t0;
import kotlin.jvm.internal.u;

/* JADX INFO: compiled from: Dota2CalendarView.kt */
/* JADX INFO: loaded from: classes11.dex */
@t0({"SMAP\nDota2CalendarView.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Dota2CalendarView.kt\ncom/max/xiaoheihe/module/game/component/dota2/Dota2CalendarView\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,272:1\n1#2:273\n*E\n"})
@o(parameters = 0)
public final class Dota2CalendarView extends LinearLayout {
    public static ChangeQuickRedirect changeQuickRedirect;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    @d
    public static final a f87038h = new a(null);

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public static final int f87039i = 8;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public RecyclerView f87040b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public RelativeLayout f87041c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @d
    private Type f87042d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    @d
    private final ArrayList<CalendarObj> f87043e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private int f87044f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private final int f87045g;

    /* JADX INFO: compiled from: Dota2CalendarView.kt */
    public enum Type {
        Win,
        Count;

        public static ChangeQuickRedirect changeQuickRedirect;

        public static Type valueOf(String str) {
            PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{str}, null, changeQuickRedirect, true, 37096, new Class[]{String.class}, Type.class);
            return (Type) (patchProxyResultProxy.isSupported ? patchProxyResultProxy.result : Enum.valueOf(Type.class, str));
        }

        /* JADX INFO: renamed from: values, reason: to resolve conflict with enum method */
        public static Type[] valuesCustom() {
            PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[0], null, changeQuickRedirect, true, 37095, new Class[0], Type[].class);
            return (Type[]) (patchProxyResultProxy.isSupported ? patchProxyResultProxy.result : values().clone());
        }
    }

    /* JADX INFO: compiled from: Dota2CalendarView.kt */
    public static final class a {
        public static ChangeQuickRedirect changeQuickRedirect;

        private a() {
        }

        public /* synthetic */ a(u uVar) {
            this();
        }

        @e
        public final String a(@e String str) {
            PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{str}, this, changeQuickRedirect, false, 37094, new Class[]{String.class}, String.class);
            if (patchProxyResultProxy.isSupported) {
                return (String) patchProxyResultProxy.result;
            }
            if (str == null) {
                return null;
            }
            try {
                return new SimpleDateFormat("M.d", Locale.getDefault()).format(new Date(n.r(str) * ((long) 1000)));
            } catch (Throwable unused) {
                return null;
            }
        }
    }

    /* JADX INFO: compiled from: Dota2CalendarView.kt */
    public static final class b extends s<CalendarObj> {
        public static ChangeQuickRedirect changeQuickRedirect;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ int f87047c;

        /* JADX INFO: compiled from: Dota2CalendarView.kt */
        public static final class a implements View.OnClickListener {
            public static ChangeQuickRedirect changeQuickRedirect;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            final /* synthetic */ CalendarObj f87048b;

            /* JADX INFO: renamed from: c, reason: collision with root package name */
            final /* synthetic */ b f87049c;

            /* JADX INFO: renamed from: d, reason: collision with root package name */
            final /* synthetic */ s.e f87050d;

            /* JADX INFO: renamed from: e, reason: collision with root package name */
            final /* synthetic */ Dota2CalendarView f87051e;

            /* JADX INFO: renamed from: com.max.xiaoheihe.module.game.component.dota2.Dota2CalendarView$b$a$a, reason: collision with other inner class name */
            /* JADX INFO: compiled from: Dota2CalendarView.kt */
            public static final class DialogInterfaceOnDismissListenerC0788a implements DialogInterface.OnDismissListener {
                public static ChangeQuickRedirect changeQuickRedirect;

                /* JADX INFO: renamed from: b, reason: collision with root package name */
                final /* synthetic */ b f87052b;

                /* JADX INFO: renamed from: c, reason: collision with root package name */
                final /* synthetic */ CalendarObj f87053c;

                /* JADX INFO: renamed from: d, reason: collision with root package name */
                final /* synthetic */ s.e f87054d;

                DialogInterfaceOnDismissListenerC0788a(b bVar, CalendarObj calendarObj, s.e eVar) {
                    this.f87052b = bVar;
                    this.f87053c = calendarObj;
                    this.f87054d = eVar;
                }

                @Override // android.content.DialogInterface.OnDismissListener
                public final void onDismiss(DialogInterface dialogInterface) {
                    if (PatchProxy.proxy(new Object[]{dialogInterface}, this, changeQuickRedirect, false, 37102, new Class[]{DialogInterface.class}, Void.TYPE).isSupported) {
                        return;
                    }
                    b.m(this.f87052b, false, this.f87053c, this.f87054d);
                }
            }

            a(CalendarObj calendarObj, b bVar, s.e eVar, Dota2CalendarView dota2CalendarView) {
                this.f87048b = calendarObj;
                this.f87049c = bVar;
                this.f87050d = eVar;
                this.f87051e = dota2CalendarView;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View it) {
                if (PatchProxy.proxy(new Object[]{it}, this, changeQuickRedirect, false, 37101, new Class[]{View.class}, Void.TYPE).isSupported) {
                    return;
                }
                CalendarObj calendarObj = this.f87048b;
                if (n.q(calendarObj != null ? calendarObj.getCount() : null) > 0) {
                    b.m(this.f87049c, true, this.f87048b, this.f87050d);
                    Dota2CalendarView dota2CalendarView = this.f87051e;
                    CalendarObj calendarObj2 = this.f87048b;
                    f0.o(it, "it");
                    Dota2CalendarView.b(dota2CalendarView, calendarObj2, it, new DialogInterfaceOnDismissListenerC0788a(this.f87049c, this.f87048b, this.f87050d));
                }
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        b(int i10, Context context, ArrayList<CalendarObj> arrayList) {
            super(context, arrayList, R.layout.item_game_overview_calendar_item);
            this.f87047c = i10;
        }

        public static final /* synthetic */ void m(b bVar, boolean z10, CalendarObj calendarObj, s.e eVar) {
            if (PatchProxy.proxy(new Object[]{bVar, new Byte(z10 ? (byte) 1 : (byte) 0), calendarObj, eVar}, null, changeQuickRedirect, true, 37100, new Class[]{b.class, Boolean.TYPE, CalendarObj.class, s.e.class}, Void.TYPE).isSupported) {
                return;
            }
            bVar.n(z10, calendarObj, eVar);
        }

        private final void n(boolean z10, CalendarObj calendarObj, s.e eVar) {
            if (PatchProxy.proxy(new Object[]{new Byte(z10 ? (byte) 1 : (byte) 0), calendarObj, eVar}, this, changeQuickRedirect, false, 37098, new Class[]{Boolean.TYPE, CalendarObj.class, s.e.class}, Void.TYPE).isSupported || calendarObj == null) {
                return;
            }
            Dota2CalendarView dota2CalendarView = Dota2CalendarView.this;
            int i10 = this.f87047c;
            int iE1 = com.max.xiaoheihe.utils.d.e1(dota2CalendarView.f87042d == Type.Win ? calendarObj.getWin_color() : calendarObj.getCount_color());
            if (z10) {
                eVar.itemView.setBackground(q.j(dota2CalendarView.getContext(), iE1, com.max.xiaoheihe.utils.d.F(dota2CalendarView.getContext(), R.color.white_alpha80), 1.0f, 2.0f));
            } else {
                eVar.itemView.setBackground(ViewUtils.G(i10, iE1));
            }
        }

        public void o(@e s.e eVar, @e CalendarObj calendarObj) {
            if (PatchProxy.proxy(new Object[]{eVar, calendarObj}, this, changeQuickRedirect, false, 37097, new Class[]{s.e.class, CalendarObj.class}, Void.TYPE).isSupported || eVar == null) {
                return;
            }
            Dota2CalendarView dota2CalendarView = Dota2CalendarView.this;
            ViewGroup.LayoutParams layoutParams = eVar.itemView.getLayoutParams();
            layoutParams.width = dota2CalendarView.getSize();
            layoutParams.height = dota2CalendarView.getSize();
            eVar.itemView.setLayoutParams(layoutParams);
            if (calendarObj != null ? f0.g(calendarObj.getExtra(), Boolean.TRUE) : false) {
                eVar.itemView.setBackground(null);
                eVar.itemView.setOnClickListener(null);
            } else {
                n(false, calendarObj, eVar);
                eVar.itemView.setOnClickListener(new a(calendarObj, this, eVar, dota2CalendarView));
            }
        }

        @Override // com.max.hbcommon.base.adapter.s
        public /* bridge */ /* synthetic */ void onBindViewHolder(s.e eVar, CalendarObj calendarObj) {
            if (PatchProxy.proxy(new Object[]{eVar, calendarObj}, this, changeQuickRedirect, false, 37099, new Class[]{s.e.class, Object.class}, Void.TYPE).isSupported) {
                return;
            }
            o(eVar, calendarObj);
        }
    }

    public Dota2CalendarView(@e Context context) {
        this(context, null);
    }

    public Dota2CalendarView(@e Context context, @e AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public Dota2CalendarView(@e Context context, @e AttributeSet attributeSet, int i10) {
        this(context, attributeSet, i10, 0);
    }

    public Dota2CalendarView(@e Context context, @e AttributeSet attributeSet, int i10, int i11) {
        super(context, attributeSet, i10, i11);
        this.f87042d = Type.Count;
        this.f87043e = new ArrayList<>();
        this.f87045g = 27;
        c();
    }

    public static final /* synthetic */ void b(Dota2CalendarView dota2CalendarView, CalendarObj calendarObj, View view, DialogInterface.OnDismissListener onDismissListener) {
        if (PatchProxy.proxy(new Object[]{dota2CalendarView, calendarObj, view, onDismissListener}, null, changeQuickRedirect, true, 37093, new Class[]{Dota2CalendarView.class, CalendarObj.class, View.class, DialogInterface.OnDismissListener.class}, Void.TYPE).isSupported) {
            return;
        }
        dota2CalendarView.g(calendarObj, view, onDismissListener);
    }

    private final void c() {
        if (PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 37085, new Class[0], Void.TYPE).isSupported) {
            return;
        }
        setOrientation(1);
        setClipChildren(false);
        int iF = ViewUtils.f(getContext(), 2.0f);
        this.f87044f = (int) (((ViewUtils.L(getContext()) - ViewUtils.f(getContext(), ((this.f87045g - 1) * 3.0f) + 24.0f)) / this.f87045g) + 0.5f);
        setRv(new RecyclerView(getContext()));
        LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(-1, -2);
        layoutParams.bottomMargin = ViewUtils.f(getContext(), 10.0f);
        getRv().setLayoutParams(layoutParams);
        getRv().setLayoutManager(new GridLayoutManager(getContext(), 7, 0, false));
        getRv().setAdapter(new b(iF, getContext(), this.f87043e));
        if (getRv().getItemDecorationCount() == 0) {
            getRv().addItemDecoration(new c(7, ViewUtils.f(getContext(), 3.0f), false));
        }
        addView(getRv());
        setRlMonth(new RelativeLayout(getContext()));
        addView(getRlMonth());
    }

    private final TextView e(String str) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{str}, this, changeQuickRedirect, false, 37089, new Class[]{String.class}, TextView.class);
        if (patchProxyResultProxy.isSupported) {
            return (TextView) patchProxyResultProxy.result;
        }
        TextView textView = new TextView(getContext());
        textView.setTextSize(1, 10.0f);
        textView.setTextColor(com.max.xiaoheihe.utils.d.E(R.color.white_alpha50));
        textView.setText(str);
        return textView;
    }

    private final void f(List<CalendarObj> list) {
        if (PatchProxy.proxy(new Object[]{list}, this, changeQuickRedirect, false, 37090, new Class[]{List.class}, Void.TYPE).isSupported) {
            return;
        }
        int size = list.size();
        int i10 = this.f87045g;
        if (size >= i10 * 7) {
            this.f87043e.addAll(list.subList(0, i10 * 7));
            return;
        }
        this.f87043e.addAll(list);
        int size2 = (this.f87045g * 7) - list.size();
        for (int i11 = 0; i11 < size2; i11++) {
            ArrayList<CalendarObj> arrayList = this.f87043e;
            CalendarObj calendarObj = new CalendarObj(null, null, null, null, null, null, null, null, 255, null);
            calendarObj.setExtra(Boolean.TRUE);
            arrayList.add(calendarObj);
        }
    }

    private final void g(CalendarObj calendarObj, View view, DialogInterface.OnDismissListener onDismissListener) {
        if (PatchProxy.proxy(new Object[]{calendarObj, view, onDismissListener}, this, changeQuickRedirect, false, 37091, new Class[]{CalendarObj.class, View.class, DialogInterface.OnDismissListener.class}, Void.TYPE).isSupported || calendarObj == null) {
            return;
        }
        int[] iArr = new int[2];
        view.getLocationInWindow(iArr);
        View bubbleView = LayoutInflater.from(getContext()).inflate(R.layout.layout_dota2_calendar_bubble, (ViewGroup) null);
        View viewFindViewById = bubbleView.findViewById(R.id.tv_date);
        f0.o(viewFindViewById, "bubbleView.findViewById(R.id.tv_date)");
        View viewFindViewById2 = bubbleView.findViewById(R.id.tv_total);
        f0.o(viewFindViewById2, "bubbleView.findViewById(R.id.tv_total)");
        TextView textView = (TextView) viewFindViewById2;
        View viewFindViewById3 = bubbleView.findViewById(R.id.tv_win);
        f0.o(viewFindViewById3, "bubbleView.findViewById(R.id.tv_win)");
        TextView textView2 = (TextView) viewFindViewById3;
        View viewFindViewById4 = bubbleView.findViewById(R.id.tv_lose);
        f0.o(viewFindViewById4, "bubbleView.findViewById(R.id.tv_lose)");
        TextView textView3 = (TextView) viewFindViewById4;
        ((TextView) viewFindViewById).setText(f87038h.a(calendarObj.getDate()));
        String count = calendarObj.getCount();
        if (count == null) {
            count = "0";
        }
        textView.setText(count);
        String win_count = calendarObj.getWin_count();
        if (win_count == null) {
            win_count = "0";
        }
        textView2.setText(win_count);
        String lose_count = calendarObj.getLose_count();
        textView3.setText(lose_count != null ? lose_count : "0");
        k.a aVar = k.f67402a;
        Context context = getContext();
        f0.o(context, "context");
        int measuredWidth = iArr[0] + (view.getMeasuredWidth() / 2);
        int iV = (iArr[1] - ViewUtils.V(bubbleView)) + ViewUtils.f(getContext(), 6.0f);
        Context context2 = getContext();
        f0.o(context2, "context");
        f0.o(bubbleView, "bubbleView");
        aVar.g(context, measuredWidth, iV, aVar.e(context2, bubbleView, R.color.dota2_bubble_bg_color, 12.0f, BubbleView.TailDirection.Bottom, 6.0f, 13.0f)).Q3(onDismissListener);
    }

    @e
    public final String d(@e String str) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{str}, this, changeQuickRedirect, false, 37092, new Class[]{String.class}, String.class);
        if (patchProxyResultProxy.isSupported) {
            return (String) patchProxyResultProxy.result;
        }
        if (str == null) {
            return null;
        }
        try {
            Date date = new Date(Long.parseLong(str) * ((long) 1000));
            Calendar calendar = Calendar.getInstance();
            calendar.setTime(date);
            if (calendar.get(5) != 1) {
                return null;
            }
            int i10 = calendar.get(2) + 1;
            StringBuilder sb2 = new StringBuilder();
            sb2.append(i10);
            sb2.append((char) 26376);
            return sb2.toString();
        } catch (Throwable unused) {
            return null;
        }
    }

    public final int getCol() {
        return this.f87045g;
    }

    @d
    public final RelativeLayout getRlMonth() {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 37083, new Class[0], RelativeLayout.class);
        if (patchProxyResultProxy.isSupported) {
            return (RelativeLayout) patchProxyResultProxy.result;
        }
        RelativeLayout relativeLayout = this.f87041c;
        if (relativeLayout != null) {
            return relativeLayout;
        }
        f0.S("rlMonth");
        return null;
    }

    @d
    public final RecyclerView getRv() {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 37081, new Class[0], RecyclerView.class);
        if (patchProxyResultProxy.isSupported) {
            return (RecyclerView) patchProxyResultProxy.result;
        }
        RecyclerView recyclerView = this.f87040b;
        if (recyclerView != null) {
            return recyclerView;
        }
        f0.S("rv");
        return null;
    }

    public final int getSize() {
        return this.f87044f;
    }

    public final void setData(@e List<CalendarObj> list) {
        if (PatchProxy.proxy(new Object[]{list}, this, changeQuickRedirect, false, 37088, new Class[]{List.class}, Void.TYPE).isSupported) {
            return;
        }
        if (getLayoutParams() != null) {
            getLayoutParams().height = (ViewUtils.f(getContext(), 3.0f) * 6) + (this.f87044f * 7) + ViewUtils.f(getContext(), 24.0f);
            setLayoutParams(getLayoutParams());
        }
        this.f87043e.clear();
        if (list != null) {
            f(list);
        }
        RecyclerView.Adapter adapter = getRv().getAdapter();
        if (adapter != null) {
            adapter.notifyDataSetChanged();
        }
        getRlMonth().removeAllViews();
        if (this.f87043e.size() > 0) {
            int size = this.f87043e.size();
            for (int i10 = 0; i10 < size; i10++) {
                String strD = d(this.f87043e.get(i10).getDate());
                if (strD != null) {
                    View viewE = e(strD);
                    RelativeLayout.LayoutParams layoutParams = new RelativeLayout.LayoutParams(-2, -2);
                    layoutParams.setMarginStart((i10 / 7) * (this.f87044f + ViewUtils.f(getContext(), 3.0f)));
                    viewE.setLayoutParams(layoutParams);
                    getRlMonth().addView(viewE);
                }
            }
        }
    }

    public final void setItemSize(int i10) {
        if (PatchProxy.proxy(new Object[]{new Integer(i10)}, this, changeQuickRedirect, false, 37086, new Class[]{Integer.TYPE}, Void.TYPE).isSupported) {
            return;
        }
        this.f87044f = i10;
        RecyclerView.Adapter adapter = getRv().getAdapter();
        if (adapter != null) {
            adapter.notifyDataSetChanged();
        }
    }

    public final void setRlMonth(@d RelativeLayout relativeLayout) {
        if (PatchProxy.proxy(new Object[]{relativeLayout}, this, changeQuickRedirect, false, 37084, new Class[]{RelativeLayout.class}, Void.TYPE).isSupported) {
            return;
        }
        f0.p(relativeLayout, "<set-?>");
        this.f87041c = relativeLayout;
    }

    public final void setRv(@d RecyclerView recyclerView) {
        if (PatchProxy.proxy(new Object[]{recyclerView}, this, changeQuickRedirect, false, 37082, new Class[]{RecyclerView.class}, Void.TYPE).isSupported) {
            return;
        }
        f0.p(recyclerView, "<set-?>");
        this.f87040b = recyclerView;
    }

    public final void setSize(int i10) {
        this.f87044f = i10;
    }

    public final void setType(@d Type type) {
        if (PatchProxy.proxy(new Object[]{type}, this, changeQuickRedirect, false, 37087, new Class[]{Type.class}, Void.TYPE).isSupported) {
            return;
        }
        f0.p(type, "type");
        this.f87042d = type;
        RecyclerView.Adapter adapter = getRv().getAdapter();
        if (adapter != null) {
            adapter.notifyDataSetChanged();
        }
    }
}
