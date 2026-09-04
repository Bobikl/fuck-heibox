package com.max.xiaoheihe.module.game.component;

import android.app.Activity;
import android.content.Context;
import android.text.SpannableString;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.appcompat.app.AppCompatActivity;
import androidx.compose.runtime.internal.o;
import com.max.hbutils.utils.ViewUtils;
import com.max.hbutils.utils.q;
import com.max.hbutils.utils.x;
import com.max.heybox.hblog.g;
import com.max.xiaoheihe.R;
import com.max.xiaoheihe.utils.l0;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.PatchProxyResult;
import dl.d;
import dl.e;
import kotlin.b2;
import kotlin.jvm.internal.f0;
import kotlin.jvm.internal.t0;
import yh.l;

/* JADX INFO: compiled from: EventStateView.kt */
/* JADX INFO: loaded from: classes11.dex */
@t0({"SMAP\nEventStateView.kt\nKotlin\n*S Kotlin\n*F\n+ 1 EventStateView.kt\ncom/max/xiaoheihe/module/game/component/EventStateView\n+ 2 View.kt\nandroidx/core/view/ViewKt\n*L\n1#1,184:1\n262#2,2:185\n262#2,2:187\n*S KotlinDebug\n*F\n+ 1 EventStateView.kt\ncom/max/xiaoheihe/module/game/component/EventStateView\n*L\n164#1:185,2\n176#1:187,2\n*E\n"})
@o(parameters = 0)
public final class EventStateView extends LinearLayout {
    public static ChangeQuickRedirect changeQuickRedirect = null;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final int f86600d = 8;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public ImageView f86601b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public TextView f86602c;

    /* JADX INFO: compiled from: EventStateView.kt */
    public static final class a implements View.OnClickListener {
        public static ChangeQuickRedirect changeQuickRedirect;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ String f86604c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        final /* synthetic */ long f86605d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        final /* synthetic */ long f86606e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        final /* synthetic */ String f86607f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        final /* synthetic */ l0.g f86608g;

        a(String str, long j10, long j11, String str2, l0.g gVar) {
            this.f86604c = str;
            this.f86605d = j10;
            this.f86606e = j11;
            this.f86607f = str2;
            this.f86608g = gVar;
        }

        @Override // android.view.View.OnClickListener
        public final void onClick(View view) {
            if (PatchProxy.proxy(new Object[]{view}, this, changeQuickRedirect, false, 36328, new Class[]{View.class}, Void.TYPE).isSupported) {
                return;
            }
            if (CalendarUtils.f86571a.e(EventStateView.this.getContext(), this.f86604c, this.f86605d, this.f86606e)) {
                x.m(Integer.valueOf(R.string.already_add_calendar));
            } else {
                EventStateView.a(EventStateView.this, this.f86605d, this.f86606e, this.f86604c, this.f86607f, this.f86608g);
            }
        }
    }

    /* JADX INFO: compiled from: EventStateView.kt */
    public static final class b implements View.OnClickListener {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public static final b f86609b = new b();
        public static ChangeQuickRedirect changeQuickRedirect;

        b() {
        }

        @Override // android.view.View.OnClickListener
        public final void onClick(@e View view) {
        }
    }

    public EventStateView(@e Context context) {
        this(context, null);
    }

    public EventStateView(@e Context context, @e AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public EventStateView(@e Context context, @e AttributeSet attributeSet, int i10) {
        this(context, attributeSet, i10, 0);
    }

    public EventStateView(@e Context context, @e AttributeSet attributeSet, int i10, int i11) {
        super(context, attributeSet, i10, i11);
        b();
    }

    public static final /* synthetic */ void a(EventStateView eventStateView, long j10, long j11, String str, String str2, l0.g gVar) {
        Object[] objArr = {eventStateView, new Long(j10), new Long(j11), str, str2, gVar};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        Class cls = Long.TYPE;
        if (PatchProxy.proxy(objArr, null, changeQuickRedirect2, true, 36327, new Class[]{EventStateView.class, cls, cls, String.class, String.class, l0.g.class}, Void.TYPE).isSupported) {
            return;
        }
        eventStateView.e(j10, j11, str, str2, gVar);
    }

    private final void b() {
        if (PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 36320, new Class[0], Void.TYPE).isSupported) {
            return;
        }
        setOrientation(0);
        setGravity(16);
        ImageView imageView = new ImageView(getContext());
        imageView.setImageResource(R.drawable.game_time_filled_24x24);
        Context context = imageView.getContext();
        f0.o(context, "context");
        int iA = (int) com.max.accelworld.c.a(11.0f, context);
        imageView.setLayoutParams(new LinearLayout.LayoutParams(iA, iA));
        addView(imageView);
        setIv_icon(imageView);
        TextView textView = new TextView(getContext());
        textView.setTextSize(1, 9.0f);
        textView.setLayoutParams(new LinearLayout.LayoutParams(-2, -2));
        addView(textView);
        setTv_state(textView);
    }

    private final void c() {
        if (PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 36325, new Class[0], Void.TYPE).isSupported) {
            return;
        }
        getIv_icon().setVisibility(0);
        ViewGroup.LayoutParams layoutParams = getIv_icon().getLayoutParams();
        f0.n(layoutParams, "null cannot be cast to non-null type android.view.ViewGroup.MarginLayoutParams");
        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) layoutParams;
        Context context = getContext();
        f0.o(context, "context");
        marginLayoutParams.setMarginStart((int) com.max.accelworld.c.a(4.0f, context));
        marginLayoutParams.setMarginEnd(0);
        ViewGroup.LayoutParams layoutParams2 = getTv_state().getLayoutParams();
        f0.n(layoutParams2, "null cannot be cast to non-null type android.view.ViewGroup.MarginLayoutParams");
        ViewGroup.MarginLayoutParams marginLayoutParams2 = (ViewGroup.MarginLayoutParams) layoutParams2;
        Context context2 = getContext();
        f0.o(context2, "context");
        marginLayoutParams2.setMarginStart((int) com.max.accelworld.c.a(2.0f, context2));
        Context context3 = getContext();
        f0.o(context3, "context");
        marginLayoutParams2.setMarginEnd((int) com.max.accelworld.c.a(5.0f, context3));
    }

    private final void d() {
        if (PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 36326, new Class[0], Void.TYPE).isSupported) {
            return;
        }
        getIv_icon().setVisibility(8);
        ViewGroup.LayoutParams layoutParams = getTv_state().getLayoutParams();
        f0.n(layoutParams, "null cannot be cast to non-null type android.view.ViewGroup.MarginLayoutParams");
        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) layoutParams;
        Context context = getContext();
        f0.o(context, "context");
        marginLayoutParams.setMarginStart((int) com.max.accelworld.c.a(4.0f, context));
        Context context2 = getContext();
        f0.o(context2, "context");
        marginLayoutParams.setMarginEnd((int) com.max.accelworld.c.a(4.0f, context2));
    }

    private final void e(final long j10, final long j11, final String str, final String str2, final l0.g gVar) {
        AppCompatActivity appCompatActivity;
        Object[] objArr = {new Long(j10), new Long(j11), str, str2, gVar};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        Class cls = Long.TYPE;
        if (PatchProxy.proxy(objArr, this, changeQuickRedirect2, false, 36323, new Class[]{cls, cls, String.class, String.class, l0.g.class}, Void.TYPE).isSupported) {
            return;
        }
        if (getContext() instanceof AppCompatActivity) {
            Context context = getContext();
            f0.n(context, "null cannot be cast to non-null type androidx.appcompat.app.AppCompatActivity");
            appCompatActivity = (AppCompatActivity) context;
        } else {
            Activity activityA = com.max.hbutils.utils.e.b().a();
            f0.n(activityA, "null cannot be cast to non-null type androidx.appcompat.app.AppCompatActivity");
            appCompatActivity = (AppCompatActivity) activityA;
        }
        try {
            new com.max.hbcommon.component.bottomsheet.a().z("促销活动提醒").h(R.drawable.bottom_sheets_key_correct_blue_28x28).n(R.drawable.bottom_sheets_broken_date_80x80).k(true).x(false).l(new SpannableString("活动开始后，小黑盒会通过系统日历提醒你，\n是否创建日历提醒日程？")).v("好的", true, new View.OnClickListener() { // from class: com.max.xiaoheihe.module.game.component.EventStateView$showAddCalendarDialog$bSheets$1
                public static ChangeQuickRedirect changeQuickRedirect;

                @Override // android.view.View.OnClickListener
                public final void onClick(@e View view) {
                    if (PatchProxy.proxy(new Object[]{view}, this, changeQuickRedirect, false, 36329, new Class[]{View.class}, Void.TYPE).isSupported) {
                        return;
                    }
                    CalendarUtils calendarUtils = CalendarUtils.f86571a;
                    Context context2 = this.f86610b.getContext();
                    f0.o(context2, "context");
                    String str3 = str;
                    String str4 = str2;
                    long j12 = j10;
                    long j13 = j11;
                    final EventStateView eventStateView = this.f86610b;
                    calendarUtils.d(context2, str3, str4, j12, j13, false, true, 15, new l<Integer, b2>() { // from class: com.max.xiaoheihe.module.game.component.EventStateView$showAddCalendarDialog$bSheets$1.1
                        public static ChangeQuickRedirect changeQuickRedirect;

                        {
                            super(1);
                        }

                        public final void a(int i10) {
                            int i11;
                            if (PatchProxy.proxy(new Object[]{new Integer(i10)}, this, changeQuickRedirect, false, 36330, new Class[]{Integer.TYPE}, Void.TYPE).isSupported) {
                                return;
                            }
                            Context context3 = eventStateView.getContext();
                            if (i10 != 1) {
                                i11 = i10 != 2 ? R.string.add_calendar_fail : R.string.already_add_calendar;
                            } else {
                                eventStateView.getIv_icon().setColorFilter(com.max.xiaoheihe.accelworld.l.h(eventStateView.getContext(), R.color.text_primary_1_color));
                                i11 = R.string.add_calendar_success;
                            }
                            String string = context3.getString(i11);
                            f0.o(string, "context.getString(\n     …  }\n                    )");
                            com.max.hbutils.utils.c.d(string);
                        }

                        /* JADX WARN: Type inference failed for: r9v4, types: [java.lang.Object, kotlin.b2] */
                        @Override // yh.l
                        public /* bridge */ /* synthetic */ b2 invoke(Integer num) {
                            PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{num}, this, changeQuickRedirect, false, 36331, new Class[]{Object.class}, Object.class);
                            if (patchProxyResultProxy.isSupported) {
                                return patchProxyResultProxy.result;
                            }
                            a(num.intValue());
                            return b2.f124493a;
                        }
                    });
                    l0.g gVar2 = gVar;
                    if (gVar2 != null) {
                        gVar2.a();
                    }
                }
            }).p("不提醒", true, b.f86609b).a().M3(appCompatActivity.getSupportFragmentManager(), "game_publish_calendar");
        } catch (IllegalStateException e10) {
            g.f74531b.u(e10);
        }
    }

    static /* synthetic */ void f(EventStateView eventStateView, long j10, long j11, String str, String str2, l0.g gVar, int i10, Object obj) {
        Object[] objArr = {eventStateView, new Long(j10), new Long(j11), str, str2, gVar, new Integer(i10), obj};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        Class cls = Long.TYPE;
        if (PatchProxy.proxy(objArr, null, changeQuickRedirect2, true, 36324, new Class[]{EventStateView.class, cls, cls, String.class, String.class, l0.g.class, Integer.TYPE, Object.class}, Void.TYPE).isSupported) {
            return;
        }
        eventStateView.e(j10, j11, (i10 & 4) != 0 ? null : str, (i10 & 8) == 0 ? str2 : null, gVar);
    }

    public static /* synthetic */ void setTime$default(EventStateView eventStateView, long j10, long j11, String str, String str2, l0.g gVar, int i10, Object obj) {
        Object[] objArr = {eventStateView, new Long(j10), new Long(j11), str, str2, gVar, new Integer(i10), obj};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        Class cls = Long.TYPE;
        if (PatchProxy.proxy(objArr, null, changeQuickRedirect2, true, 36322, new Class[]{EventStateView.class, cls, cls, String.class, String.class, l0.g.class, Integer.TYPE, Object.class}, Void.TYPE).isSupported) {
            return;
        }
        eventStateView.setTime(j10, j11, (i10 & 4) != 0 ? null : str, (i10 & 8) == 0 ? str2 : null, gVar);
    }

    @d
    public final ImageView getIv_icon() {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 36316, new Class[0], ImageView.class);
        if (patchProxyResultProxy.isSupported) {
            return (ImageView) patchProxyResultProxy.result;
        }
        ImageView imageView = this.f86601b;
        if (imageView != null) {
            return imageView;
        }
        f0.S("iv_icon");
        return null;
    }

    @d
    public final TextView getTv_state() {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 36318, new Class[0], TextView.class);
        if (patchProxyResultProxy.isSupported) {
            return (TextView) patchProxyResultProxy.result;
        }
        TextView textView = this.f86602c;
        if (textView != null) {
            return textView;
        }
        f0.S("tv_state");
        return null;
    }

    public final void setIv_icon(@d ImageView imageView) {
        if (PatchProxy.proxy(new Object[]{imageView}, this, changeQuickRedirect, false, 36317, new Class[]{ImageView.class}, Void.TYPE).isSupported) {
            return;
        }
        f0.p(imageView, "<set-?>");
        this.f86601b = imageView;
    }

    public final void setTime(long j10, long j11, @e String str, @e String str2, @e l0.g gVar) {
        boolean z10 = false;
        Object[] objArr = {new Long(j10), new Long(j11), str, str2, gVar};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        Class cls = Long.TYPE;
        if (PatchProxy.proxy(objArr, this, changeQuickRedirect2, false, 36321, new Class[]{cls, cls, String.class, String.class, l0.g.class}, Void.TYPE).isSupported) {
            return;
        }
        long jCurrentTimeMillis = System.currentTimeMillis();
        if (jCurrentTimeMillis < j10) {
            c();
            int iH = com.max.xiaoheihe.accelworld.l.h(getContext(), R.color.text_primary_1_color);
            TextView tv_state = getTv_state();
            tv_state.setText("提醒我");
            tv_state.setTextColor(iH);
            ImageView iv_icon = getIv_icon();
            iv_icon.setColorFilter(CalendarUtils.f86571a.e(iv_icon.getContext(), str, j10, j11) ? com.max.xiaoheihe.accelworld.l.h(iv_icon.getContext(), R.color.text_primary_1_color) : com.max.xiaoheihe.accelworld.l.h(iv_icon.getContext(), R.color.text_secondary_2_color));
            setBackground(q.o(getContext(), R.color.background_card_1_color, 3.0f));
            if (str != null) {
                setOnClickListener(new a(str, j10, j11, str2, gVar));
                return;
            } else {
                setOnClickListener(null);
                return;
            }
        }
        if (j10 <= jCurrentTimeMillis && jCurrentTimeMillis <= j11) {
            z10 = true;
        }
        if (!z10) {
            d();
            int iH2 = com.max.xiaoheihe.accelworld.l.h(getContext(), R.color.text_secondary_1_color);
            TextView tv_state2 = getTv_state();
            tv_state2.setText("已结束");
            tv_state2.setTextColor(iH2);
            setBackground(q.o(getContext(), R.color.background_card_1_color, 2.0f));
            setOnClickListener(null);
            return;
        }
        d();
        int iH3 = com.max.xiaoheihe.accelworld.l.h(getContext(), R.color.white);
        TextView tv_state3 = getTv_state();
        tv_state3.setText("进行中");
        tv_state3.setTextColor(iH3);
        getIv_icon().setColorFilter(iH3);
        Context context = getContext();
        f0.o(context, "context");
        setBackground(ViewUtils.i((int) com.max.accelworld.c.a(3.0f, context), com.max.xiaoheihe.accelworld.l.h(getContext(), R.color.game_gradient_ultra_lowest_price_start_color), com.max.xiaoheihe.accelworld.l.h(getContext(), R.color.game_gradient_ultra_lowest_price_end_color)));
        setOnClickListener(null);
    }

    public final void setTv_state(@d TextView textView) {
        if (PatchProxy.proxy(new Object[]{textView}, this, changeQuickRedirect, false, 36319, new Class[]{TextView.class}, Void.TYPE).isSupported) {
            return;
        }
        f0.p(textView, "<set-?>");
        this.f86602c = textView;
    }
}
