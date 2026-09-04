package com.max.xiaoheihe.module.trade;

import android.app.Activity;
import android.app.TimePickerDialog;
import android.content.Context;
import android.content.Intent;
import android.view.View;
import android.widget.CompoundButton;
import android.widget.TextView;
import android.widget.TimePicker;
import androidx.compose.runtime.internal.o;
import com.max.hbcommon.base.BaseActivity;
import com.max.hbcommon.network.p;
import com.max.hbcustomview.SwitchButton.SwitchButton;
import com.max.hbutils.bean.Result;
import com.max.xiaoheihe.R;
import com.max.xiaoheihe.bean.trade.TradeSaleSettingsObj;
import com.max.xiaoheihe.network.i;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.PatchProxyResult;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.TimeZone;
import kotlin.jvm.internal.f0;
import kotlin.jvm.internal.u;

/* JADX INFO: compiled from: TradeSellSettingsActivity.kt */
/* JADX INFO: loaded from: classes12.dex */
@o(parameters = 0)
public final class TradeSellSettingsActivity extends BaseActivity {

    @dl.d
    public static final a W = new a(null);
    public static final int X = 8;

    @dl.d
    private static final String Y = "arg_sale_setting";
    public static ChangeQuickRedirect changeQuickRedirect;
    private SwitchButton L;
    private SwitchButton M;
    private TextView N;
    private TextView O;
    private TextView P;
    private View Q;
    private View R;
    private View S;
    private Calendar T;
    private Calendar U;

    @dl.e
    private TradeSaleSettingsObj V;

    /* JADX INFO: compiled from: TradeSellSettingsActivity.kt */
    public static final class a {
        public static ChangeQuickRedirect changeQuickRedirect;

        private a() {
        }

        public /* synthetic */ a(u uVar) {
            this();
        }

        @dl.d
        public final String a() {
            PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 45896, new Class[0], String.class);
            return patchProxyResultProxy.isSupported ? (String) patchProxyResultProxy.result : TradeSellSettingsActivity.Y;
        }

        @dl.d
        public final Intent b(@dl.d Context context) {
            PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{context}, this, changeQuickRedirect, false, 45897, new Class[]{Context.class}, Intent.class);
            if (patchProxyResultProxy.isSupported) {
                return (Intent) patchProxyResultProxy.result;
            }
            f0.p(context, "context");
            return new Intent(context, (Class<?>) TradeSellSettingsActivity.class);
        }
    }

    /* JADX INFO: compiled from: TradeSellSettingsActivity.kt */
    public static final class b extends com.max.hbcommon.network.d<Result<TradeSaleSettingsObj>> {
        public static ChangeQuickRedirect changeQuickRedirect;

        b() {
        }

        @Override // com.max.hbcommon.network.d, io.reactivex.g0
        public void onError(@dl.d Throwable e10) {
            if (PatchProxy.proxy(new Object[]{e10}, this, changeQuickRedirect, false, 45898, new Class[]{Throwable.class}, Void.TYPE).isSupported) {
                return;
            }
            f0.p(e10, "e");
            super.onError(e10);
            TradeSellSettingsActivity.Z1(TradeSellSettingsActivity.this);
        }

        public void onNext(@dl.d Result<TradeSaleSettingsObj> result) {
            if (PatchProxy.proxy(new Object[]{result}, this, changeQuickRedirect, false, 45899, new Class[]{Result.class}, Void.TYPE).isSupported) {
                return;
            }
            f0.p(result, "result");
            TradeSellSettingsActivity.this.V = result.getResult();
            TradeSellSettingsActivity.this.j2();
        }

        @Override // com.max.hbcommon.network.d, io.reactivex.g0
        public /* bridge */ /* synthetic */ void onNext(Object obj) {
            if (PatchProxy.proxy(new Object[]{obj}, this, changeQuickRedirect, false, 45900, new Class[]{Object.class}, Void.TYPE).isSupported) {
                return;
            }
            onNext((Result<TradeSaleSettingsObj>) obj);
        }
    }

    /* JADX INFO: compiled from: TradeSellSettingsActivity.kt */
    public static final class c implements View.OnClickListener {
        public static ChangeQuickRedirect changeQuickRedirect;

        /* JADX INFO: compiled from: TradeSellSettingsActivity.kt */
        public static final class a implements TimePickerDialog.OnTimeSetListener {
            public static ChangeQuickRedirect changeQuickRedirect;

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            final /* synthetic */ TradeSellSettingsActivity f93248a;

            a(TradeSellSettingsActivity tradeSellSettingsActivity) {
                this.f93248a = tradeSellSettingsActivity;
            }

            @Override // android.app.TimePickerDialog.OnTimeSetListener
            public final void onTimeSet(TimePicker timePicker, int i10, int i11) {
                Object[] objArr = {timePicker, new Integer(i10), new Integer(i11)};
                ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
                Class cls = Integer.TYPE;
                if (PatchProxy.proxy(objArr, this, changeQuickRedirect2, false, 45902, new Class[]{TimePicker.class, cls, cls}, Void.TYPE).isSupported) {
                    return;
                }
                Calendar calendar = this.f93248a.T;
                if (calendar == null) {
                    f0.S("mStartTimeCalendar");
                    calendar = null;
                }
                calendar.set(11, i10);
                Calendar calendar2 = this.f93248a.T;
                if (calendar2 == null) {
                    f0.S("mStartTimeCalendar");
                    calendar2 = null;
                }
                calendar2.set(12, i11);
                TradeSellSettingsActivity.W1(this.f93248a);
                TradeSellSettingsActivity tradeSellSettingsActivity = this.f93248a;
                Calendar calendar3 = tradeSellSettingsActivity.T;
                if (calendar3 == null) {
                    f0.S("mStartTimeCalendar");
                    calendar3 = null;
                }
                tradeSellSettingsActivity.e2("auto_sale", null, String.valueOf(calendar3.getTimeInMillis() / ((long) 1000)), null);
            }
        }

        c() {
        }

        @Override // android.view.View.OnClickListener
        public final void onClick(View view) {
            if (PatchProxy.proxy(new Object[]{view}, this, changeQuickRedirect, false, 45901, new Class[]{View.class}, Void.TYPE).isSupported) {
                return;
            }
            Activity activity = ((BaseActivity) TradeSellSettingsActivity.this).f66601b;
            a aVar = new a(TradeSellSettingsActivity.this);
            Calendar calendar = TradeSellSettingsActivity.this.T;
            Calendar calendar2 = null;
            if (calendar == null) {
                f0.S("mStartTimeCalendar");
                calendar = null;
            }
            int i10 = calendar.get(11);
            Calendar calendar3 = TradeSellSettingsActivity.this.T;
            if (calendar3 == null) {
                f0.S("mStartTimeCalendar");
            } else {
                calendar2 = calendar3;
            }
            new TimePickerDialog(activity, aVar, i10, calendar2.get(12), true).show();
        }
    }

    /* JADX INFO: compiled from: TradeSellSettingsActivity.kt */
    public static final class d implements View.OnClickListener {
        public static ChangeQuickRedirect changeQuickRedirect;

        /* JADX INFO: compiled from: TradeSellSettingsActivity.kt */
        public static final class a implements TimePickerDialog.OnTimeSetListener {
            public static ChangeQuickRedirect changeQuickRedirect;

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            final /* synthetic */ TradeSellSettingsActivity f93250a;

            a(TradeSellSettingsActivity tradeSellSettingsActivity) {
                this.f93250a = tradeSellSettingsActivity;
            }

            @Override // android.app.TimePickerDialog.OnTimeSetListener
            public final void onTimeSet(TimePicker timePicker, int i10, int i11) {
                Object[] objArr = {timePicker, new Integer(i10), new Integer(i11)};
                ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
                Class cls = Integer.TYPE;
                if (PatchProxy.proxy(objArr, this, changeQuickRedirect2, false, 45904, new Class[]{TimePicker.class, cls, cls}, Void.TYPE).isSupported) {
                    return;
                }
                Calendar calendar = this.f93250a.U;
                if (calendar == null) {
                    f0.S("mStopTimeCalendar");
                    calendar = null;
                }
                calendar.set(11, i10);
                Calendar calendar2 = this.f93250a.U;
                if (calendar2 == null) {
                    f0.S("mStopTimeCalendar");
                    calendar2 = null;
                }
                calendar2.set(12, i11);
                TradeSellSettingsActivity.X1(this.f93250a);
                TradeSellSettingsActivity tradeSellSettingsActivity = this.f93250a;
                Calendar calendar3 = tradeSellSettingsActivity.U;
                if (calendar3 == null) {
                    f0.S("mStopTimeCalendar");
                    calendar3 = null;
                }
                tradeSellSettingsActivity.e2("auto_sale", null, null, String.valueOf(calendar3.getTimeInMillis() / ((long) 1000)));
            }
        }

        d() {
        }

        @Override // android.view.View.OnClickListener
        public final void onClick(View view) {
            if (PatchProxy.proxy(new Object[]{view}, this, changeQuickRedirect, false, 45903, new Class[]{View.class}, Void.TYPE).isSupported) {
                return;
            }
            Activity activity = ((BaseActivity) TradeSellSettingsActivity.this).f66601b;
            a aVar = new a(TradeSellSettingsActivity.this);
            Calendar calendar = TradeSellSettingsActivity.this.U;
            Calendar calendar2 = null;
            if (calendar == null) {
                f0.S("mStopTimeCalendar");
                calendar = null;
            }
            int i10 = calendar.get(11);
            Calendar calendar3 = TradeSellSettingsActivity.this.U;
            if (calendar3 == null) {
                f0.S("mStopTimeCalendar");
            } else {
                calendar2 = calendar3;
            }
            new TimePickerDialog(activity, aVar, i10, calendar2.get(12), true).show();
        }
    }

    /* JADX INFO: compiled from: TradeSellSettingsActivity.kt */
    public static final class e implements CompoundButton.OnCheckedChangeListener {
        public static ChangeQuickRedirect changeQuickRedirect;

        e() {
        }

        @Override // android.widget.CompoundButton.OnCheckedChangeListener
        public final void onCheckedChanged(CompoundButton compoundButton, boolean z10) {
            if (PatchProxy.proxy(new Object[]{compoundButton, new Byte(z10 ? (byte) 1 : (byte) 0)}, this, changeQuickRedirect, false, 45905, new Class[]{CompoundButton.class, Boolean.TYPE}, Void.TYPE).isSupported) {
                return;
            }
            SwitchButton switchButton = TradeSellSettingsActivity.this.M;
            SwitchButton switchButton2 = null;
            if (switchButton == null) {
                f0.S("sb_timing_sell");
                switchButton = null;
            }
            if (!switchButton.isChecked()) {
                if (z10) {
                    TradeSellSettingsActivity.f2(TradeSellSettingsActivity.this, "sale", "1", null, null, 12, null);
                    return;
                } else {
                    TradeSellSettingsActivity.f2(TradeSellSettingsActivity.this, "sale", "0", null, null, 12, null);
                    return;
                }
            }
            SwitchButton switchButton3 = TradeSellSettingsActivity.this.L;
            if (switchButton3 == null) {
                f0.S("sb_sell_state");
            } else {
                switchButton2 = switchButton3;
            }
            switchButton2.setChecked(!z10, false);
            com.max.hbutils.utils.c.f("请先将定时出售设置关闭");
        }
    }

    /* JADX INFO: compiled from: TradeSellSettingsActivity.kt */
    public static final class f implements CompoundButton.OnCheckedChangeListener {
        public static ChangeQuickRedirect changeQuickRedirect;

        f() {
        }

        @Override // android.widget.CompoundButton.OnCheckedChangeListener
        public final void onCheckedChanged(CompoundButton compoundButton, boolean z10) {
            if (PatchProxy.proxy(new Object[]{compoundButton, new Byte(z10 ? (byte) 1 : (byte) 0)}, this, changeQuickRedirect, false, 45906, new Class[]{CompoundButton.class, Boolean.TYPE}, Void.TYPE).isSupported) {
                return;
            }
            View view = null;
            if (z10) {
                TradeSellSettingsActivity.f2(TradeSellSettingsActivity.this, "auto_sale", "1", null, null, 12, null);
                View view2 = TradeSellSettingsActivity.this.S;
                if (view2 == null) {
                    f0.S("vg_time_set");
                } else {
                    view = view2;
                }
                view.setVisibility(0);
                return;
            }
            TradeSellSettingsActivity.f2(TradeSellSettingsActivity.this, "auto_sale", "0", null, null, 12, null);
            View view3 = TradeSellSettingsActivity.this.S;
            if (view3 == null) {
                f0.S("vg_time_set");
            } else {
                view = view3;
            }
            view.setVisibility(8);
        }
    }

    /* JADX INFO: compiled from: TradeSellSettingsActivity.kt */
    public static final class g implements View.OnClickListener {
        public static ChangeQuickRedirect changeQuickRedirect;

        g() {
        }

        @Override // android.view.View.OnClickListener
        public final void onClick(View view) {
            if (PatchProxy.proxy(new Object[]{view}, this, changeQuickRedirect, false, 45907, new Class[]{View.class}, Void.TYPE).isSupported) {
                return;
            }
            TradeSellSettingsActivity.this.onBackPressed();
        }
    }

    public static final /* synthetic */ void W1(TradeSellSettingsActivity tradeSellSettingsActivity) {
        if (PatchProxy.proxy(new Object[]{tradeSellSettingsActivity}, null, changeQuickRedirect, true, 45893, new Class[]{TradeSellSettingsActivity.class}, Void.TYPE).isSupported) {
            return;
        }
        tradeSellSettingsActivity.h2();
    }

    public static final /* synthetic */ void X1(TradeSellSettingsActivity tradeSellSettingsActivity) {
        if (PatchProxy.proxy(new Object[]{tradeSellSettingsActivity}, null, changeQuickRedirect, true, 45894, new Class[]{TradeSellSettingsActivity.class}, Void.TYPE).isSupported) {
            return;
        }
        tradeSellSettingsActivity.i2();
    }

    public static final /* synthetic */ void Z1(TradeSellSettingsActivity tradeSellSettingsActivity) {
        if (PatchProxy.proxy(new Object[]{tradeSellSettingsActivity}, null, changeQuickRedirect, true, 45895, new Class[]{TradeSellSettingsActivity.class}, Void.TYPE).isSupported) {
            return;
        }
        tradeSellSettingsActivity.C1();
    }

    private final void a2(long j10, TextView textView) {
        if (PatchProxy.proxy(new Object[]{new Long(j10), textView}, this, changeQuickRedirect, false, 45884, new Class[]{Long.TYPE, TextView.class}, Void.TYPE).isSupported) {
            return;
        }
        Date date = new Date(j10);
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("HH:mm");
        simpleDateFormat.setTimeZone(TimeZone.getTimeZone("GMT+0"));
        textView.setText(simpleDateFormat.format(date));
    }

    private final void b2() {
        if (PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 45887, new Class[0], Void.TYPE).isSupported) {
            return;
        }
        V((io.reactivex.disposables.b) i.a().u().I5(io.reactivex.schedulers.b.d()).a4(io.reactivex.android.schedulers.a.c()).J5(new b()));
    }

    private final void c2() {
        if (PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 45883, new Class[0], Void.TYPE).isSupported) {
            return;
        }
        View viewFindViewById = findViewById(R.id.tv_sell_state);
        f0.o(viewFindViewById, "findViewById(R.id.tv_sell_state)");
        this.N = (TextView) viewFindViewById;
        View viewFindViewById2 = findViewById(R.id.sb_sell_state);
        f0.o(viewFindViewById2, "findViewById(R.id.sb_sell_state)");
        this.L = (SwitchButton) viewFindViewById2;
        View viewFindViewById3 = findViewById(R.id.sb_timing_sell);
        f0.o(viewFindViewById3, "findViewById(R.id.sb_timing_sell)");
        this.M = (SwitchButton) viewFindViewById3;
        View viewFindViewById4 = findViewById(R.id.tv_start_time);
        f0.o(viewFindViewById4, "findViewById(R.id.tv_start_time)");
        this.O = (TextView) viewFindViewById4;
        View viewFindViewById5 = findViewById(R.id.tv_stop_time);
        f0.o(viewFindViewById5, "findViewById(R.id.tv_stop_time)");
        this.P = (TextView) viewFindViewById5;
        View viewFindViewById6 = findViewById(R.id.vg_start_time);
        f0.o(viewFindViewById6, "findViewById(R.id.vg_start_time)");
        this.Q = viewFindViewById6;
        View viewFindViewById7 = findViewById(R.id.vg_stop_time);
        f0.o(viewFindViewById7, "findViewById(R.id.vg_stop_time)");
        this.R = viewFindViewById7;
        View viewFindViewById8 = findViewById(R.id.vg_time_set);
        f0.o(viewFindViewById8, "findViewById(R.id.vg_time_set)");
        this.S = viewFindViewById8;
        View view = this.Q;
        SwitchButton switchButton = null;
        if (view == null) {
            f0.S("vg_start_time");
            view = null;
        }
        view.setOnClickListener(new c());
        View view2 = this.R;
        if (view2 == null) {
            f0.S("vg_stop_time");
            view2 = null;
        }
        view2.setOnClickListener(new d());
        SwitchButton switchButton2 = this.L;
        if (switchButton2 == null) {
            f0.S("sb_sell_state");
            switchButton2 = null;
        }
        switchButton2.setOnCheckedChangeListener(new e());
        SwitchButton switchButton3 = this.M;
        if (switchButton3 == null) {
            f0.S("sb_timing_sell");
        } else {
            switchButton = switchButton3;
        }
        switchButton.setOnCheckedChangeListener(new f());
    }

    public static /* synthetic */ void f2(TradeSellSettingsActivity tradeSellSettingsActivity, String str, String str2, String str3, String str4, int i10, Object obj) {
        if (PatchProxy.proxy(new Object[]{tradeSellSettingsActivity, str, str2, str3, str4, new Integer(i10), obj}, null, changeQuickRedirect, true, 45891, new Class[]{TradeSellSettingsActivity.class, String.class, String.class, String.class, String.class, Integer.TYPE, Object.class}, Void.TYPE).isSupported) {
            return;
        }
        tradeSellSettingsActivity.e2((i10 & 1) != 0 ? null : str, (i10 & 2) != 0 ? null : str2, (i10 & 4) != 0 ? null : str3, (i10 & 8) == 0 ? str4 : null);
    }

    private final void h2() {
        if (PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 45885, new Class[0], Void.TYPE).isSupported) {
            return;
        }
        Calendar calendar = this.T;
        TextView textView = null;
        if (calendar == null) {
            f0.S("mStartTimeCalendar");
            calendar = null;
        }
        long timeInMillis = calendar.getTimeInMillis();
        TextView textView2 = this.O;
        if (textView2 == null) {
            f0.S("tv_start_time");
        } else {
            textView = textView2;
        }
        a2(timeInMillis, textView);
    }

    private final void i2() {
        if (PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 45886, new Class[0], Void.TYPE).isSupported) {
            return;
        }
        Calendar calendar = this.U;
        TextView textView = null;
        if (calendar == null) {
            f0.S("mStopTimeCalendar");
            calendar = null;
        }
        long timeInMillis = calendar.getTimeInMillis();
        TextView textView2 = this.P;
        if (textView2 == null) {
            f0.S("tv_stop_time");
        } else {
            textView = textView2;
        }
        a2(timeInMillis, textView);
    }

    public final void e2(@dl.e String str, @dl.e String str2, @dl.e String str3, @dl.e String str4) {
        if (PatchProxy.proxy(new Object[]{str, str2, str3, str4}, this, changeQuickRedirect, false, 45890, new Class[]{String.class, String.class, String.class, String.class}, Void.TYPE).isSupported) {
            return;
        }
        V((io.reactivex.disposables.b) i.a().Q8(str, str2, str3, str4).I5(io.reactivex.schedulers.b.d()).a4(io.reactivex.android.schedulers.a.c()).J5(new p()));
    }

    public final void j2() {
        String auto_stop;
        String auto_start;
        if (PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 45889, new Class[0], Void.TYPE).isSupported) {
            return;
        }
        x1();
        TradeSaleSettingsObj tradeSaleSettingsObj = this.V;
        Calendar calendar = null;
        if (f0.g("1", tradeSaleSettingsObj != null ? tradeSaleSettingsObj.getSale_setting() : null)) {
            TextView textView = this.N;
            if (textView == null) {
                f0.S("tv_sell_state");
                textView = null;
            }
            textView.setText("在售");
            TextView textView2 = this.N;
            if (textView2 == null) {
                f0.S("tv_sell_state");
                textView2 = null;
            }
            textView2.setTextColor(com.max.xiaoheihe.utils.d.E(R.color.text_primary_1_color));
            SwitchButton switchButton = this.L;
            if (switchButton == null) {
                f0.S("sb_sell_state");
                switchButton = null;
            }
            switchButton.setChecked(true, false);
        } else {
            TextView textView3 = this.N;
            if (textView3 == null) {
                f0.S("tv_sell_state");
                textView3 = null;
            }
            textView3.setText("停售");
            TextView textView4 = this.N;
            if (textView4 == null) {
                f0.S("tv_sell_state");
                textView4 = null;
            }
            textView4.setTextColor(com.max.xiaoheihe.utils.d.E(R.color.text_secondary_1_color));
            SwitchButton switchButton2 = this.L;
            if (switchButton2 == null) {
                f0.S("sb_sell_state");
                switchButton2 = null;
            }
            switchButton2.setChecked(false, false);
        }
        TradeSaleSettingsObj tradeSaleSettingsObj2 = this.V;
        if (f0.g("1", tradeSaleSettingsObj2 != null ? tradeSaleSettingsObj2.getAuto_sale_setting() : null)) {
            SwitchButton switchButton3 = this.M;
            if (switchButton3 == null) {
                f0.S("sb_timing_sell");
                switchButton3 = null;
            }
            switchButton3.setChecked(true, false);
            View view = this.S;
            if (view == null) {
                f0.S("vg_time_set");
                view = null;
            }
            view.setVisibility(0);
        } else {
            SwitchButton switchButton4 = this.M;
            if (switchButton4 == null) {
                f0.S("sb_timing_sell");
                switchButton4 = null;
            }
            switchButton4.setChecked(false, false);
            View view2 = this.S;
            if (view2 == null) {
                f0.S("vg_time_set");
                view2 = null;
            }
            view2.setVisibility(8);
        }
        Calendar calendar2 = this.T;
        if (calendar2 == null) {
            f0.S("mStartTimeCalendar");
            calendar2 = null;
        }
        TradeSaleSettingsObj tradeSaleSettingsObj3 = this.V;
        long j10 = 0;
        calendar2.setTimeInMillis((tradeSaleSettingsObj3 == null || (auto_start = tradeSaleSettingsObj3.getAuto_start()) == null) ? 0L : Long.parseLong(auto_start) * ((long) 1000));
        Calendar calendar3 = this.U;
        if (calendar3 == null) {
            f0.S("mStopTimeCalendar");
        } else {
            calendar = calendar3;
        }
        TradeSaleSettingsObj tradeSaleSettingsObj4 = this.V;
        if (tradeSaleSettingsObj4 != null && (auto_stop = tradeSaleSettingsObj4.getAuto_stop()) != null) {
            j10 = Long.parseLong(auto_stop) * ((long) 1000);
        }
        calendar.setTimeInMillis(j10);
        h2();
        i2();
    }

    @Override // com.max.hbcommon.base.BaseActivity
    public void k1() {
        if (PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 45882, new Class[0], Void.TYPE).isSupported) {
            return;
        }
        setContentView(R.layout.activity_trade_sell_settings);
        this.f66616q.setTitle("出售设置");
        this.f66616q.setNavigationOnClickListener(new g());
        Calendar calendar = Calendar.getInstance(TimeZone.getTimeZone("GMT+0"));
        f0.o(calendar, "getInstance(TimeZone.getTimeZone(\"GMT+0\"))");
        this.T = calendar;
        Calendar calendar2 = null;
        if (calendar == null) {
            f0.S("mStartTimeCalendar");
            calendar = null;
        }
        calendar.setTimeInMillis(0L);
        Calendar calendar3 = Calendar.getInstance(TimeZone.getTimeZone("GMT+0"));
        f0.o(calendar3, "getInstance(TimeZone.getTimeZone(\"GMT+0\"))");
        this.U = calendar3;
        if (calendar3 == null) {
            f0.S("mStopTimeCalendar");
        } else {
            calendar2 = calendar3;
        }
        calendar2.setTimeInMillis(0L);
        c2();
        E1();
        b2();
    }

    @Override // com.max.hbcommon.base.BaseActivity
    public void n1() {
        if (PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 45888, new Class[0], Void.TYPE).isSupported) {
            return;
        }
        E1();
        b2();
    }

    @Override // androidx.activity.ComponentActivity, android.app.Activity
    public void onBackPressed() {
        if (PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 45892, new Class[0], Void.TYPE).isSupported) {
            return;
        }
        Intent intent = new Intent();
        String str = Y;
        SwitchButton switchButton = this.L;
        if (switchButton == null) {
            f0.S("sb_sell_state");
            switchButton = null;
        }
        intent.putExtra(str, switchButton.isChecked() ? "1" : "0");
        setResult(-1, intent);
        super.onBackPressed();
    }
}
