package com.max.xiaoheihe.module.game.component;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.drawable.Drawable;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.util.Log;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import android.widget.TextView;
import androidx.compose.runtime.internal.o;
import bb.d;
import com.github.mikephil.charting.charts.LineChart;
import com.github.mikephil.charting.components.XAxis;
import com.github.mikephil.charting.components.YAxis;
import com.github.mikephil.charting.data.Entry;
import com.github.mikephil.charting.data.LineData;
import com.github.mikephil.charting.data.LineDataSet;
import com.github.mikephil.charting.formatter.IValueFormatter;
import com.github.mikephil.charting.utils.ViewPortHandler;
import com.max.hbutils.utils.ViewUtils;
import com.max.xiaoheihe.R;
import com.max.xiaoheihe.view.richtext.RichTextView;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.PatchProxyResult;
import com.umeng.socialize.net.dplus.CommonNetImpl;
import dl.e;
import java.util.List;
import kotlin.jvm.internal.f0;
import kotlin.jvm.internal.t0;
import kotlin.text.StringsKt___StringsKt;
import kotlin.text.u;

/* JADX INFO: compiled from: GameDetailDataItemView.kt */
/* JADX INFO: loaded from: classes11.dex */
@t0({"SMAP\nGameDetailDataItemView.kt\nKotlin\n*S Kotlin\n*F\n+ 1 GameDetailDataItemView.kt\ncom/max/xiaoheihe/module/game/component/GameDetailDataItemView\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,346:1\n1#2:347\n*E\n"})
@o(parameters = 0)
public final class GameDetailDataItemView extends RelativeLayout {
    public static ChangeQuickRedirect changeQuickRedirect = null;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public static final int f86705i = 8;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private LineChart f86706b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private TextView f86707c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public RichTextView f86708d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private TextView f86709e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private LinearLayout f86710f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public TextView f86711g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private TextView f86712h;

    /* JADX INFO: compiled from: GameDetailDataItemView.kt */
    public enum ValueType {
        Text,
        Chart,
        OnlyValue;

        public static ChangeQuickRedirect changeQuickRedirect;

        public static ValueType valueOf(String str) {
            PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{str}, null, changeQuickRedirect, true, 36519, new Class[]{String.class}, ValueType.class);
            return (ValueType) (patchProxyResultProxy.isSupported ? patchProxyResultProxy.result : Enum.valueOf(ValueType.class, str));
        }

        /* JADX INFO: renamed from: values, reason: to resolve conflict with enum method */
        public static ValueType[] valuesCustom() {
            PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[0], null, changeQuickRedirect, true, 36518, new Class[0], ValueType[].class);
            return (ValueType[]) (patchProxyResultProxy.isSupported ? patchProxyResultProxy.result : values().clone());
        }
    }

    /* JADX INFO: compiled from: GameDetailDataItemView.kt */
    public final /* synthetic */ class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f86713a;

        static {
            int[] iArr = new int[ValueType.valuesCustom().length];
            try {
                iArr[ValueType.Text.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[ValueType.Chart.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[ValueType.OnlyValue.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            f86713a = iArr;
        }
    }

    /* JADX INFO: compiled from: GameDetailDataItemView.kt */
    public static final class b implements IValueFormatter {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final b f86714a = new b();
        public static ChangeQuickRedirect changeQuickRedirect;

        b() {
        }

        @Override // com.github.mikephil.charting.formatter.IValueFormatter
        public final String getFormattedValue(float f10, Entry entry, int i10, ViewPortHandler viewPortHandler) {
            return "";
        }
    }

    public GameDetailDataItemView(@e Context context) {
        this(context, null);
    }

    public GameDetailDataItemView(@e Context context, @e AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public GameDetailDataItemView(@e Context context, @e AttributeSet attributeSet, int i10) {
        this(context, attributeSet, i10, 0);
    }

    public GameDetailDataItemView(@e Context context, @e AttributeSet attributeSet, int i10, int i11) {
        super(context, attributeSet, i10, i11);
        a();
    }

    private final void a() {
        View view;
        if (PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 36508, new Class[0], Void.TYPE).isSupported) {
            return;
        }
        this.f86706b = new LineChart(getContext());
        int color = getContext().getResources().getColor(R.color.divider_secondary_1_color);
        LineChart lineChart = this.f86706b;
        if (lineChart == null) {
            f0.S("lineChart");
            lineChart = null;
        }
        YAxis axisRight = lineChart.getAxisRight();
        LineChart lineChart2 = this.f86706b;
        if (lineChart2 == null) {
            f0.S("lineChart");
            lineChart2 = null;
        }
        YAxis axisLeft = lineChart2.getAxisLeft();
        LineChart lineChart3 = this.f86706b;
        if (lineChart3 == null) {
            f0.S("lineChart");
            lineChart3 = null;
        }
        XAxis xAxis = lineChart3.getXAxis();
        axisLeft.setAxisLineColor(color);
        axisLeft.setDrawLabels(false);
        axisLeft.setDrawGridLines(false);
        axisLeft.setDrawAxisLine(false);
        axisRight.setEnabled(false);
        xAxis.setAxisLineColor(color);
        xAxis.setDrawLabels(false);
        xAxis.setDrawGridLines(false);
        xAxis.setDrawAxisLine(false);
        xAxis.setPosition(XAxis.XAxisPosition.BOTTOM);
        LineChart lineChart4 = this.f86706b;
        if (lineChart4 == null) {
            f0.S("lineChart");
            lineChart4 = null;
        }
        lineChart4.setHighlightPerTapEnabled(false);
        LineChart lineChart5 = this.f86706b;
        if (lineChart5 == null) {
            f0.S("lineChart");
            lineChart5 = null;
        }
        lineChart5.getDescription().setEnabled(false);
        LineChart lineChart6 = this.f86706b;
        if (lineChart6 == null) {
            f0.S("lineChart");
            lineChart6 = null;
        }
        lineChart6.getLegend().setEnabled(false);
        LineChart lineChart7 = this.f86706b;
        if (lineChart7 == null) {
            f0.S("lineChart");
            lineChart7 = null;
        }
        lineChart7.setScaleEnabled(false);
        LineChart lineChart8 = this.f86706b;
        if (lineChart8 == null) {
            f0.S("lineChart");
            lineChart8 = null;
        }
        lineChart8.setDragEnabled(false);
        LineChart lineChart9 = this.f86706b;
        if (lineChart9 == null) {
            f0.S("lineChart");
            lineChart9 = null;
        }
        lineChart9.setViewPortOffsets(0.0f, 0.0f, 0.0f, 0.0f);
        RelativeLayout.LayoutParams layoutParams = new RelativeLayout.LayoutParams(ViewUtils.f(getContext(), 53.0f), ViewUtils.f(getContext(), 18.0f));
        layoutParams.topMargin = ViewUtils.f(getContext(), 7.0f);
        layoutParams.addRule(14);
        layoutParams.addRule(10);
        LineChart lineChart10 = this.f86706b;
        if (lineChart10 == null) {
            f0.S("lineChart");
            lineChart10 = null;
        }
        lineChart10.setVisibility(8);
        View view2 = this.f86706b;
        if (view2 == null) {
            f0.S("lineChart");
            view2 = null;
        }
        addView(view2, layoutParams);
        LinearLayout linearLayout = new LinearLayout(getContext());
        this.f86710f = linearLayout;
        linearLayout.setOrientation(0);
        LinearLayout linearLayout2 = this.f86710f;
        if (linearLayout2 == null) {
            f0.S("vg_value");
            linearLayout2 = null;
        }
        linearLayout2.setGravity(81);
        RelativeLayout.LayoutParams layoutParams2 = new RelativeLayout.LayoutParams(-1, -2);
        layoutParams2.bottomMargin = ViewUtils.f(getContext(), 2.0f);
        layoutParams2.addRule(2, R.id.tv_desc);
        View view3 = this.f86710f;
        if (view3 == null) {
            f0.S("vg_value");
            view3 = null;
        }
        addView(view3, layoutParams2);
        TextView textView = new TextView(getContext());
        this.f86707c = textView;
        textView.setTextSize(1, 14.0f);
        TextView textView2 = this.f86707c;
        if (textView2 == null) {
            f0.S("tv_value_before");
            textView2 = null;
        }
        textView2.setIncludeFontPadding(false);
        TextView textView3 = this.f86707c;
        if (textView3 == null) {
            f0.S("tv_value_before");
            textView3 = null;
        }
        textView3.setTextColor(getContext().getResources().getColor(R.color.text_primary_2_color));
        LinearLayout.LayoutParams layoutParams3 = new LinearLayout.LayoutParams(-2, -2);
        layoutParams3.rightMargin = ViewUtils.f(getContext(), 1.0f);
        LinearLayout linearLayout3 = this.f86710f;
        if (linearLayout3 == null) {
            f0.S("vg_value");
            linearLayout3 = null;
        }
        TextView textView4 = this.f86707c;
        if (textView4 == null) {
            f0.S("tv_value_before");
            textView4 = null;
        }
        linearLayout3.addView(textView4, layoutParams3);
        Context context = getContext();
        f0.o(context, "context");
        setTv_value(new RichTextView(context));
        getTv_value().setTextSize(1, 17.0f);
        getTv_value().setIncludeFontPadding(false);
        getTv_value().setTextColor(getContext().getResources().getColor(R.color.text_primary_2_color));
        d.d(getTv_value(), 2);
        LinearLayout linearLayout4 = this.f86710f;
        if (linearLayout4 == null) {
            f0.S("vg_value");
            linearLayout4 = null;
        }
        linearLayout4.addView(getTv_value());
        TextView textView5 = new TextView(getContext());
        this.f86709e = textView5;
        textView5.setTextSize(1, 14.0f);
        TextView textView6 = this.f86709e;
        if (textView6 == null) {
            f0.S("tv_value_after");
            textView6 = null;
        }
        textView6.setIncludeFontPadding(false);
        TextView textView7 = this.f86709e;
        if (textView7 == null) {
            f0.S("tv_value_after");
            textView7 = null;
        }
        textView7.setTextColor(getContext().getResources().getColor(R.color.text_primary_2_color));
        new LinearLayout.LayoutParams(-2, -2).leftMargin = ViewUtils.f(getContext(), 1.0f);
        LinearLayout linearLayout5 = this.f86710f;
        if (linearLayout5 == null) {
            f0.S("vg_value");
            linearLayout5 = null;
        }
        TextView textView8 = this.f86709e;
        if (textView8 == null) {
            f0.S("tv_value_after");
            textView8 = null;
        }
        linearLayout5.addView(textView8, layoutParams3);
        setTv_desc(new TextView(getContext()));
        getTv_desc().setId(R.id.tv_desc);
        getTv_desc().setMaxLines(1);
        getTv_desc().setEllipsize(TextUtils.TruncateAt.END);
        getTv_desc().setTextSize(1, 10.0f);
        getTv_desc().setTextColor(getContext().getResources().getColor(R.color.text_secondary_1_color));
        getTv_desc().setTypeface(d.a().b(0));
        RelativeLayout.LayoutParams layoutParams4 = new RelativeLayout.LayoutParams(-2, -2);
        layoutParams4.addRule(12);
        layoutParams4.addRule(14);
        layoutParams4.bottomMargin = ViewUtils.f(getContext(), 10.0f);
        addView(getTv_desc(), layoutParams4);
        TextView textView9 = new TextView(getContext());
        this.f86712h = textView9;
        textView9.setTextSize(1, 8.0f);
        TextView textView10 = this.f86712h;
        if (textView10 == null) {
            f0.S("tv_rank");
            textView10 = null;
        }
        textView10.setTextColor(getContext().getResources().getColor(R.color.text_secondary_1_color));
        RelativeLayout.LayoutParams layoutParams5 = new RelativeLayout.LayoutParams(-2, -2);
        layoutParams5.addRule(10);
        layoutParams5.addRule(11);
        layoutParams5.topMargin = ViewUtils.f(getContext(), 1.0f);
        layoutParams5.rightMargin = ViewUtils.f(getContext(), 2.0f);
        View view4 = this.f86712h;
        if (view4 == null) {
            f0.S("tv_rank");
            view = null;
        } else {
            view = view4;
        }
        addView(view, layoutParams5);
    }

    public final void b(boolean z10) {
        if (PatchProxy.proxy(new Object[]{new Byte(z10 ? (byte) 1 : (byte) 0)}, this, changeQuickRedirect, false, 36512, new Class[]{Boolean.TYPE}, Void.TYPE).isSupported) {
            return;
        }
        TextView textView = this.f86712h;
        if (textView == null) {
            f0.S("tv_rank");
            textView = null;
        }
        textView.setVisibility(z10 ? 0 : 8);
    }

    @dl.d
    public final TextView getTv_desc() {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 36506, new Class[0], TextView.class);
        if (patchProxyResultProxy.isSupported) {
            return (TextView) patchProxyResultProxy.result;
        }
        TextView textView = this.f86711g;
        if (textView != null) {
            return textView;
        }
        f0.S("tv_desc");
        return null;
    }

    @dl.d
    public final RichTextView getTv_value() {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 36504, new Class[0], RichTextView.class);
        if (patchProxyResultProxy.isSupported) {
            return (RichTextView) patchProxyResultProxy.result;
        }
        RichTextView richTextView = this.f86708d;
        if (richTextView != null) {
            return richTextView;
        }
        f0.S("tv_value");
        return null;
    }

    public final void setDesc(@e String str) {
        if (PatchProxy.proxy(new Object[]{str}, this, changeQuickRedirect, false, 36509, new Class[]{String.class}, Void.TYPE).isSupported) {
            return;
        }
        getTv_desc().setText(str);
    }

    public final void setOnlyValue(@e String str) {
        if (PatchProxy.proxy(new Object[]{str}, this, changeQuickRedirect, false, 36515, new Class[]{String.class}, Void.TYPE).isSupported) {
            return;
        }
        getTv_value().setText(str);
    }

    public final void setRank(@e String str) {
        if (PatchProxy.proxy(new Object[]{str}, this, changeQuickRedirect, false, 36510, new Class[]{String.class}, Void.TYPE).isSupported) {
            return;
        }
        setRank(str, null);
    }

    public final void setRank(@e String str, @e String str2) {
        int i10;
        if (PatchProxy.proxy(new Object[]{str, str2}, this, changeQuickRedirect, false, 36511, new Class[]{String.class, String.class}, Void.TYPE).isSupported) {
            return;
        }
        Resources resources = getContext().getResources();
        if (u.L1(CommonNetImpl.UP, str2, true)) {
            i10 = R.color.victory_color;
        } else {
            i10 = u.L1("down", str2, true) ? R.color.defeat_color : R.color.text_secondary_1_color;
        }
        int color = resources.getColor(i10);
        TextView textView = this.f86712h;
        TextView textView2 = null;
        if (textView == null) {
            f0.S("tv_rank");
            textView = null;
        }
        textView.setTextColor(color);
        TextView textView3 = this.f86712h;
        if (textView3 == null) {
            f0.S("tv_rank");
        } else {
            textView2 = textView3;
        }
        textView2.setText(str);
    }

    public final void setTv_desc(@dl.d TextView textView) {
        if (PatchProxy.proxy(new Object[]{textView}, this, changeQuickRedirect, false, 36507, new Class[]{TextView.class}, Void.TYPE).isSupported) {
            return;
        }
        f0.p(textView, "<set-?>");
        this.f86711g = textView;
    }

    public final void setTv_value(@dl.d RichTextView richTextView) {
        if (PatchProxy.proxy(new Object[]{richTextView}, this, changeQuickRedirect, false, 36505, new Class[]{RichTextView.class}, Void.TYPE).isSupported) {
            return;
        }
        f0.p(richTextView, "<set-?>");
        this.f86708d = richTextView;
    }

    public final void setType(@dl.d ValueType type) {
        if (PatchProxy.proxy(new Object[]{type}, this, changeQuickRedirect, false, 36513, new Class[]{ValueType.class}, Void.TYPE).isSupported) {
            return;
        }
        f0.p(type, "type");
        int i10 = a.f86713a[type.ordinal()];
        View view = null;
        if (i10 == 1) {
            LineChart lineChart = this.f86706b;
            if (lineChart == null) {
                f0.S("lineChart");
                lineChart = null;
            }
            lineChart.setVisibility(8);
            LinearLayout linearLayout = this.f86710f;
            if (linearLayout == null) {
                f0.S("vg_value");
            } else {
                view = linearLayout;
            }
            view.setVisibility(0);
            return;
        }
        if (i10 == 2) {
            LineChart lineChart2 = this.f86706b;
            if (lineChart2 == null) {
                f0.S("lineChart");
                lineChart2 = null;
            }
            lineChart2.setVisibility(0);
            LinearLayout linearLayout2 = this.f86710f;
            if (linearLayout2 == null) {
                f0.S("vg_value");
            } else {
                view = linearLayout2;
            }
            view.setVisibility(8);
            return;
        }
        if (i10 != 3) {
            return;
        }
        LineChart lineChart3 = this.f86706b;
        if (lineChart3 == null) {
            f0.S("lineChart");
            lineChart3 = null;
        }
        lineChart3.setVisibility(8);
        LinearLayout linearLayout3 = this.f86710f;
        if (linearLayout3 == null) {
            f0.S("vg_value");
            linearLayout3 = null;
        }
        linearLayout3.setVisibility(0);
        TextView textView = this.f86707c;
        if (textView == null) {
            f0.S("tv_value_before");
            textView = null;
        }
        textView.setVisibility(8);
        getTv_value().setVisibility(0);
        TextView textView2 = this.f86709e;
        if (textView2 == null) {
            f0.S("tv_value_after");
        } else {
            view = textView2;
        }
        view.setVisibility(8);
    }

    public final void setValueChart(@e List<Entry> list) {
        if (PatchProxy.proxy(new Object[]{list}, this, changeQuickRedirect, false, 36517, new Class[]{List.class}, Void.TYPE).isSupported || list == null) {
            return;
        }
        int color = getContext().getResources().getColor(R.color.text_primary_2_color);
        LineChart lineChart = null;
        LineDataSet lineDataSet = new LineDataSet(list, null);
        lineDataSet.setValueFormatter(b.f86714a);
        Drawable drawable = getContext().getResources().getDrawable(R.drawable.game_linechart_fill_gradient);
        lineDataSet.setDrawFilled(true);
        lineDataSet.setFillDrawable(drawable);
        lineDataSet.setAxisDependency(YAxis.AxisDependency.LEFT);
        lineDataSet.setDrawCircles(false);
        lineDataSet.setColor(color);
        lineDataSet.setMode(LineDataSet.Mode.LINEAR);
        LineData lineData = new LineData(lineDataSet);
        LineChart lineChart2 = this.f86706b;
        if (lineChart2 == null) {
            f0.S("lineChart");
            lineChart2 = null;
        }
        lineChart2.setData(lineData);
        LineChart lineChart3 = this.f86706b;
        if (lineChart3 == null) {
            f0.S("lineChart");
            lineChart3 = null;
        }
        lineChart3.notifyDataSetChanged();
        LineChart lineChart4 = this.f86706b;
        if (lineChart4 == null) {
            f0.S("lineChart");
        } else {
            lineChart = lineChart4;
        }
        lineChart.invalidate();
    }

    public final void setValueColor(int i10) {
        if (PatchProxy.proxy(new Object[]{new Integer(i10)}, this, changeQuickRedirect, false, 36516, new Class[]{Integer.TYPE}, Void.TYPE).isSupported) {
            return;
        }
        TextView textView = this.f86707c;
        TextView textView2 = null;
        if (textView == null) {
            f0.S("tv_value_before");
            textView = null;
        }
        textView.setTextColor(i10);
        getTv_value().setTextColor(i10);
        TextView textView3 = this.f86709e;
        if (textView3 == null) {
            f0.S("tv_value_after");
        } else {
            textView2 = textView3;
        }
        textView2.setTextColor(i10);
    }

    public final void setValueText(@e String str) {
        String strSubstring;
        String str2;
        if (PatchProxy.proxy(new Object[]{str}, this, changeQuickRedirect, false, 36514, new Class[]{String.class}, Void.TYPE).isSupported) {
            return;
        }
        TextView textView = null;
        if (str == null) {
            TextView textView2 = this.f86707c;
            if (textView2 == null) {
                f0.S("tv_value_before");
                textView2 = null;
            }
            textView2.setText((CharSequence) null);
            getTv_value().setText((CharSequence) null);
            TextView textView3 = this.f86709e;
            if (textView3 == null) {
                f0.S("tv_value_after");
                textView3 = null;
            }
            textView3.setText((CharSequence) null);
            return;
        }
        try {
            if (u.v2(str, "$", false, 2, null) || u.v2(str, "￥", false, 2, null) || u.v2(str, "#", false, 2, null)) {
                strSubstring = str.substring(0, 1);
                f0.o(strSubstring, "this as java.lang.String…ing(startIndex, endIndex)");
                str = str.substring(1, str.length());
                f0.o(str, "this as java.lang.String…ing(startIndex, endIndex)");
            } else {
                strSubstring = null;
            }
            int size = StringsKt___StringsKt.h9(str).size() - 1;
            int size2 = StringsKt___StringsKt.h9(str).size();
            for (int i10 = 0; i10 < size2; i10++) {
                char cCharValue = StringsKt___StringsKt.h9(str).get(i10).charValue();
                if (!('0' <= cCharValue && cCharValue < ':') && cCharValue != '.') {
                    size = i10 - 1;
                    break;
                }
            }
            if (size == -1) {
                str2 = str;
                str = null;
            } else if (size == StringsKt___StringsKt.h9(str).size() - 1) {
                str2 = null;
            } else {
                int i11 = size + 1;
                String strSubstring2 = str.substring(0, i11);
                f0.o(strSubstring2, "this as java.lang.String…ing(startIndex, endIndex)");
                String strSubstring3 = str.substring(i11, StringsKt___StringsKt.h9(str).size());
                f0.o(strSubstring3, "this as java.lang.String…ing(startIndex, endIndex)");
                str2 = strSubstring3;
                str = strSubstring2;
            }
            if (strSubstring == null) {
                TextView textView4 = this.f86707c;
                if (textView4 == null) {
                    f0.S("tv_value_before");
                    textView4 = null;
                }
                textView4.setVisibility(8);
            } else {
                TextView textView5 = this.f86707c;
                if (textView5 == null) {
                    f0.S("tv_value_before");
                    textView5 = null;
                }
                textView5.setText(strSubstring);
                TextView textView6 = this.f86707c;
                if (textView6 == null) {
                    f0.S("tv_value_before");
                    textView6 = null;
                }
                textView6.setVisibility(0);
            }
            float f10 = 15.0f;
            if (str == null) {
                getTv_value().setVisibility(8);
                TextView textView7 = this.f86709e;
                if (textView7 == null) {
                    f0.S("tv_value_after");
                    textView7 = null;
                }
                ViewGroup.LayoutParams layoutParams = textView7.getLayoutParams();
                f0.n(layoutParams, "null cannot be cast to non-null type android.view.ViewGroup.MarginLayoutParams");
                ((ViewGroup.MarginLayoutParams) layoutParams).leftMargin = 0;
            } else {
                getTv_value().setVisibility(0);
                TextView textView8 = this.f86709e;
                if (textView8 == null) {
                    f0.S("tv_value_after");
                    textView8 = null;
                }
                ViewGroup.LayoutParams layoutParams2 = textView8.getLayoutParams();
                f0.n(layoutParams2, "null cannot be cast to non-null type android.view.ViewGroup.MarginLayoutParams");
                ((ViewGroup.MarginLayoutParams) layoutParams2).leftMargin = ViewUtils.f(getContext(), 1.0f);
                if (getTv_value().length() >= 6) {
                    getTv_value().setTextSize(1, 15.0f);
                } else {
                    getTv_value().setTextSize(1, 17.0f);
                }
                getTv_value().setText(str);
            }
            if (str2 == null) {
                TextView textView9 = this.f86709e;
                if (textView9 == null) {
                    f0.S("tv_value_after");
                } else {
                    textView = textView9;
                }
                textView.setVisibility(8);
                return;
            }
            TextView textView10 = this.f86709e;
            if (textView10 == null) {
                f0.S("tv_value_after");
                textView10 = null;
            }
            textView10.setText(str2);
            TextView textView11 = this.f86709e;
            if (textView11 == null) {
                f0.S("tv_value_after");
                textView11 = null;
            }
            textView11.setVisibility(0);
            TextView textView12 = this.f86709e;
            if (textView12 == null) {
                f0.S("tv_value_after");
            } else {
                textView = textView12;
            }
            if (!com.max.xiaoheihe.utils.d.L0(str2)) {
                f10 = 14.0f;
            }
            textView.setTextSize(1, f10);
        } catch (Exception e10) {
            String message = e10.getMessage();
            if (message != null) {
                Log.e("GameDetailDataItem", message);
            }
        }
    }
}
