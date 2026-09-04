package com.max.hbcommon.component;

import android.content.Context;
import android.content.res.Resources;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.ScrollView;
import android.widget.TextView;
import androidx.core.view.ViewGroupKt;
import com.max.hbcommon.R;
import com.max.hbcommon.bean.NewFilterListObj;
import com.max.hbcommon.bean.NewFilterObj;
import com.max.hbcommon.component.bottombutton.BottomButtonLeftItemView;
import com.max.hbcommon.component.bottombutton.base.BaseBottomButton;
import com.max.hbutils.utils.ViewUtils;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.PatchProxyResult;
import java.util.ArrayList;
import java.util.List;
import kotlin.sequences.SequencesKt___SequencesKt;

/* JADX INFO: compiled from: FilterListDialog.kt */
/* JADX INFO: loaded from: classes9.dex */
public final class o extends i {
    public static ChangeQuickRedirect changeQuickRedirect;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private List<NewFilterListObj> f67802m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private List<Integer> f67803n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    @dl.d
    private List<Integer> f67804o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    @dl.d
    private a f67805p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    private LinearLayout f67806q;

    /* JADX INFO: compiled from: FilterListDialog.kt */
    public interface a {
        void a(@dl.d List<Integer> list);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public o(@dl.d Context context, @dl.d List<NewFilterListObj> filterListList, @dl.d List<Integer> selectedList, @dl.d a listener) throws Exception {
        super(context, null);
        kotlin.jvm.internal.f0.p(context, "context");
        kotlin.jvm.internal.f0.p(filterListList, "filterListList");
        kotlin.jvm.internal.f0.p(selectedList, "selectedList");
        kotlin.jvm.internal.f0.p(listener, "listener");
        this.f67804o = new ArrayList();
        E(filterListList, selectedList);
        this.f67805p = listener;
        r();
        setCancelable(true);
    }

    private final void C(TextView textView, boolean z10) {
        if (PatchProxy.proxy(new Object[]{textView, new Byte(z10 ? (byte) 1 : (byte) 0)}, this, changeQuickRedirect, false, bb.c.d.D7, new Class[]{TextView.class, Boolean.TYPE}, Void.TYPE).isSupported || textView == null) {
            return;
        }
        if (z10) {
            textView.setBackgroundResource(R.drawable.bg_divider_concept_border_text_primary_2dp);
            textView.setTextColor(this.f67717i.getResources().getColor(R.color.text_primary_1_color));
            return;
        }
        int iF = ViewUtils.f(this.f67717i, 2.0f);
        Resources resources = this.f67717i.getResources();
        int i10 = R.color.divider_secondary_1_color;
        textView.setBackgroundDrawable(ViewUtils.H(iF, resources.getColor(i10), this.f67717i.getResources().getColor(i10)));
        textView.setTextColor(this.f67717i.getResources().getColor(R.color.text_primary_2_color));
    }

    private final void D() {
        if (PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, bb.c.d.E7, new Class[0], Void.TYPE).isSupported) {
            return;
        }
        List<NewFilterListObj> list = this.f67802m;
        if (list == null) {
            kotlin.jvm.internal.f0.S("mFilterListList");
            list = null;
        }
        int size = list.size();
        for (int i10 = 0; i10 < size; i10++) {
            List<NewFilterListObj> list2 = this.f67802m;
            if (list2 == null) {
                kotlin.jvm.internal.f0.S("mFilterListList");
                list2 = null;
            }
            List<NewFilterObj> filters = list2.get(i10).getFilters();
            kotlin.jvm.internal.f0.m(filters);
            int size2 = filters.size();
            int i11 = 0;
            while (i11 < size2) {
                View viewZ = z(i10, i11);
                kotlin.jvm.internal.f0.n(viewZ, "null cannot be cast to non-null type android.widget.TextView");
                C((TextView) viewZ, i11 == 0);
                i11++;
            }
            this.f67804o.set(i10, 0);
        }
    }

    private final void q(List<NewFilterListObj> list, List<Integer> list2) throws Exception {
        if (PatchProxy.proxy(new Object[]{list, list2}, this, changeQuickRedirect, false, bb.c.d.f31656y7, new Class[]{List.class, List.class}, Void.TYPE).isSupported) {
            return;
        }
        if (list.size() != list2.size()) {
            throw new Exception("filterListList and selectedList must has same size!!!");
        }
        int size = list2.size();
        for (int i10 = 0; i10 < size; i10++) {
            if (list2.get(i10).intValue() >= 0) {
                int iIntValue = list2.get(i10).intValue();
                List<NewFilterObj> filters = list.get(i10).getFilters();
                if (iIntValue < (filters != null ? filters.size() : 0)) {
                }
            }
            throw new Exception("selectedList must legal!!!");
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r15v0, types: [android.view.View, android.widget.TextView] */
    /* JADX WARN: Type inference failed for: r15v4, types: [android.view.View, android.widget.LinearLayout] */
    /* JADX WARN: Type inference failed for: r15v5 */
    /* JADX WARN: Type inference failed for: r15v8 */
    /* JADX WARN: Type inference failed for: r15v9 */
    /* JADX WARN: Type inference failed for: r23v0 */
    /* JADX WARN: Type inference failed for: r2v16, types: [android.view.ViewGroup] */
    /* JADX WARN: Type inference failed for: r2v30 */
    /* JADX WARN: Type inference failed for: r2v31 */
    /* JADX WARN: Type inference failed for: r3v11, types: [android.view.ViewGroup] */
    /* JADX WARN: Type inference failed for: r3v12 */
    /* JADX WARN: Type inference failed for: r3v14, types: [android.view.View, android.view.ViewGroup, android.widget.LinearLayout] */
    /* JADX WARN: Type inference failed for: r3v15 */
    /* JADX WARN: Type inference failed for: r3v16 */
    /* JADX WARN: Type inference failed for: r3v6, types: [android.view.ViewGroup] */
    /* JADX WARN: Type inference failed for: r4v4 */
    /* JADX WARN: Type inference failed for: r4v5 */
    /* JADX WARN: Type inference failed for: r4v8 */
    /* JADX WARN: Type inference failed for: r8v0 */
    /* JADX WARN: Type inference failed for: r8v1, types: [boolean, int] */
    /* JADX WARN: Type inference failed for: r8v11, types: [android.view.ViewGroup] */
    /* JADX WARN: Type inference failed for: r8v16 */
    /* JADX WARN: Type inference failed for: r8v17 */
    /* JADX WARN: Type inference failed for: r8v2 */
    private final void r() {
        LinearLayout linearLayout;
        int i10;
        ?? r10;
        int i11;
        int i12;
        byte b10;
        byte b11;
        ?? r11;
        ?? linearLayout2;
        ?? r12;
        ?? r13 = 0;
        if (PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, bb.c.d.f31612w7, new Class[0], Void.TYPE).isSupported) {
            return;
        }
        List<NewFilterListObj> list = null;
        View viewInflate = getLayoutInflater().inflate(R.layout.dialog_filter_list, (ViewGroup) null, false);
        List<NewFilterListObj> list2 = this.f67802m;
        String str = "mFilterListList";
        if (list2 == null) {
            kotlin.jvm.internal.f0.S("mFilterListList");
            list2 = null;
        }
        if (list2.size() > 0) {
            viewInflate.setOnClickListener(new View.OnClickListener() { // from class: com.max.hbcommon.component.j
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    o.s(this.f67788b, view);
                }
            });
            int iF = ViewUtils.f(this.f67717i, 8.0f);
            int iF2 = ViewUtils.f(this.f67717i, 12.0f);
            int iF3 = ViewUtils.f(this.f67717i, 12.0f);
            int iF4 = ViewUtils.f(this.f67717i, 8.0f);
            ScrollView scrollView = (ScrollView) viewInflate.findViewById(R.id.vg_scroll);
            LinearLayout linearLayout3 = new LinearLayout(this.f67717i);
            this.f67806q = linearLayout3;
            linearLayout3.setOrientation(1);
            LinearLayout linearLayout4 = this.f67806q;
            if (linearLayout4 == null) {
                kotlin.jvm.internal.f0.S("mFilterView");
                linearLayout4 = null;
            }
            byte b12 = -2;
            linearLayout4.setLayoutParams(new LinearLayout.LayoutParams(-1, -2));
            LinearLayout linearLayout5 = this.f67806q;
            if (linearLayout5 == null) {
                kotlin.jvm.internal.f0.S("mFilterView");
                linearLayout5 = null;
            }
            linearLayout5.setOnClickListener(new View.OnClickListener() { // from class: com.max.hbcommon.component.k
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    o.t(view);
                }
            });
            LinearLayout linearLayout6 = this.f67806q;
            if (linearLayout6 == null) {
                kotlin.jvm.internal.f0.S("mFilterView");
                linearLayout6 = null;
            }
            scrollView.addView(linearLayout6);
            List<NewFilterListObj> list3 = this.f67802m;
            if (list3 == null) {
                kotlin.jvm.internal.f0.S("mFilterListList");
                list3 = null;
            }
            int size = list3.size();
            int i13 = 0;
            while (i13 < size) {
                List<NewFilterListObj> list4 = this.f67802m;
                if (list4 == null) {
                    kotlin.jvm.internal.f0.S(str);
                    list4 = list;
                }
                NewFilterListObj newFilterListObj = list4.get(i13);
                ?? textView = new TextView(this.f67717i);
                textView.setPadding(iF2, iF2, iF2, r13);
                textView.setTextColor(this.f67717i.getResources().getColor(R.color.text_secondary_1_color));
                textView.setTextSize(r13, this.f67717i.getResources().getDimensionPixelSize(R.dimen.text_size_13));
                textView.setIncludeFontPadding(r13);
                textView.setText(newFilterListObj.getDesc());
                LinearLayout linearLayout7 = this.f67806q;
                ?? r14 = linearLayout7;
                if (linearLayout7 == null) {
                    kotlin.jvm.internal.f0.S("mFilterView");
                    r14 = 0;
                }
                r14.addView(textView);
                if (newFilterListObj.getFilters() != null) {
                    List<NewFilterObj> filters = newFilterListObj.getFilters();
                    kotlin.jvm.internal.f0.m(filters);
                    int size2 = filters.size();
                    int iL = ViewUtils.L(this.f67717i) - (iF2 * 2);
                    ?? linearLayout8 = new LinearLayout(this.f67717i);
                    linearLayout8.setOrientation(r13);
                    LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(-1, -2);
                    layoutParams.setMargins(iF2, iF, iF2, iF);
                    linearLayout8.setLayoutParams(layoutParams);
                    LinearLayout linearLayout9 = this.f67806q;
                    if (linearLayout9 == null) {
                        r11 = linearLayout9;
                        kotlin.jvm.internal.f0.S("mFilterView");
                        r11 = 0;
                    }
                    r11 = linearLayout9;
                    r11.addView(linearLayout8);
                    int i14 = 0;
                    int iS = 0;
                    ?? r15 = linearLayout8;
                    while (i14 < size2) {
                        List<NewFilterObj> filters2 = newFilterListObj.getFilters();
                        kotlin.jvm.internal.f0.m(filters2);
                        NewFilterObj newFilterObj = filters2.get(i14);
                        int i15 = size2;
                        TextView textViewX = x(newFilterObj, i13, i14);
                        String desc = newFilterObj.getDesc();
                        int i16 = size;
                        NewFilterListObj newFilterListObj2 = newFilterListObj;
                        float f10 = iF3 * 2;
                        int i17 = i13;
                        double dS = ((double) (ViewUtils.S(textViewX.getPaint(), desc) + f10)) + 0.5d;
                        ?? r23 = r15;
                        if (i14 != 0) {
                            dS += (double) iF4;
                        }
                        int i18 = i14;
                        int i19 = iF4;
                        if (((double) iS) + dS >= iL) {
                            linearLayout2 = new LinearLayout(this.f67717i);
                            linearLayout2.setOrientation(0);
                            LinearLayout.LayoutParams layoutParams2 = new LinearLayout.LayoutParams(-1, -2);
                            layoutParams2.setMargins(iF2, 0, iF2, iF);
                            linearLayout2.setLayoutParams(layoutParams2);
                            textViewX.setLayoutParams(new LinearLayout.LayoutParams(-2, -2));
                            linearLayout2.addView(textViewX);
                            LinearLayout linearLayout10 = this.f67806q;
                            if (linearLayout10 == null) {
                                r12 = linearLayout10;
                                kotlin.jvm.internal.f0.S("mFilterView");
                                r12 = 0;
                            }
                            r12 = linearLayout10;
                            r12.addView(linearLayout2);
                            iS = (int) (((double) (ViewUtils.S(textViewX.getPaint(), desc) + f10)) + 0.5d);
                        } else {
                            linearLayout2 = r23;
                            linearLayout2.addView(textViewX);
                            iS += (int) dS;
                        }
                        r15 = linearLayout2;
                        size = i16;
                        newFilterListObj = newFilterListObj2;
                        i13 = i17;
                        iF4 = i19;
                        i14 = i18 + 1;
                        size2 = i15;
                    }
                    i10 = iF4;
                    i11 = size;
                    i12 = i13;
                    r10 = 0;
                    b11 = -1;
                    b10 = -2;
                } else {
                    i10 = iF4;
                    r10 = r13;
                    i11 = size;
                    i12 = i13;
                    b10 = b12;
                    b11 = -1;
                }
                i13 = i12 + 1;
                r13 = r10;
                b12 = b10;
                str = str;
                size = i11;
                iF4 = i10;
                list = null;
            }
            LinearLayout linearLayout11 = this.f67806q;
            if (linearLayout11 == null) {
                kotlin.jvm.internal.f0.S("mFilterView");
                linearLayout = null;
            } else {
                linearLayout = linearLayout11;
            }
            linearLayout.addView(u());
        }
        this.f67720l = viewInflate;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void s(o this$0, View view) {
        if (PatchProxy.proxy(new Object[]{this$0, view}, null, changeQuickRedirect, true, bb.c.d.G7, new Class[]{o.class, View.class}, Void.TYPE).isSupported) {
            return;
        }
        kotlin.jvm.internal.f0.p(this$0, "this$0");
        this$0.dismiss();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void t(View view) {
    }

    private final BottomButtonLeftItemView u() {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, bb.c.d.B7, new Class[0], BottomButtonLeftItemView.class);
        if (patchProxyResultProxy.isSupported) {
            return (BottomButtonLeftItemView) patchProxyResultProxy.result;
        }
        int iF = ViewUtils.f(this.f67717i, 8.0f);
        BottomButtonLeftItemView bottomButtonLeftItemView = new BottomButtonLeftItemView(this.f67717i);
        LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(-1, -2);
        layoutParams.topMargin = iF;
        bottomButtonLeftItemView.setLayoutParams(layoutParams);
        bottomButtonLeftItemView.setShowLeftButton(true);
        bottomButtonLeftItemView.k(false);
        bottomButtonLeftItemView.setLeftIconVisible(false);
        bottomButtonLeftItemView.setLeftText(this.f67717i.getResources().getString(R.string.reset));
        bottomButtonLeftItemView.setLeftClickListener(new View.OnClickListener() { // from class: com.max.hbcommon.component.m
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                o.v(this.f67793b, view);
            }
        });
        bottomButtonLeftItemView.setRightText(this.f67717i.getResources().getString(R.string.complete));
        bottomButtonLeftItemView.setRightButtonStyle(BaseBottomButton.BaseBottomButtonStyle.BlackWhite);
        bottomButtonLeftItemView.setRightClickListener(new View.OnClickListener() { // from class: com.max.hbcommon.component.n
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                o.w(this.f67799b, view);
            }
        });
        return bottomButtonLeftItemView;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void v(o this$0, View view) {
        if (PatchProxy.proxy(new Object[]{this$0, view}, null, changeQuickRedirect, true, bb.c.d.I7, new Class[]{o.class, View.class}, Void.TYPE).isSupported) {
            return;
        }
        kotlin.jvm.internal.f0.p(this$0, "this$0");
        this$0.D();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void w(o this$0, View view) {
        if (PatchProxy.proxy(new Object[]{this$0, view}, null, changeQuickRedirect, true, bb.c.d.J7, new Class[]{o.class, View.class}, Void.TYPE).isSupported) {
            return;
        }
        kotlin.jvm.internal.f0.p(this$0, "this$0");
        if (this$0.A()) {
            this$0.f67805p.a(this$0.f67804o);
        }
        this$0.dismiss();
    }

    private final TextView x(NewFilterObj newFilterObj, final int i10, final int i11) {
        Object[] objArr = {newFilterObj, new Integer(i10), new Integer(i11)};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        Class cls = Integer.TYPE;
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(objArr, this, changeQuickRedirect2, false, bb.c.d.A7, new Class[]{NewFilterObj.class, cls, cls}, TextView.class);
        if (patchProxyResultProxy.isSupported) {
            return (TextView) patchProxyResultProxy.result;
        }
        int iF = ViewUtils.f(this.f67717i, 12.0f);
        int iF2 = ViewUtils.f(this.f67717i, 6.5f);
        int iF3 = ViewUtils.f(this.f67717i, 8.0f);
        TextView textView = new TextView(this.f67717i);
        textView.setTag(newFilterObj);
        LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(-2, -2);
        if (i11 == 0) {
            layoutParams.setMargins(0, 0, 0, 0);
        } else {
            layoutParams.setMargins(iF3, 0, 0, 0);
        }
        textView.setLayoutParams(layoutParams);
        textView.setGravity(17);
        textView.setPadding(iF, iF2, iF, iF2);
        textView.setTextSize(0, this.f67717i.getResources().getDimensionPixelSize(R.dimen.text_size_12));
        textView.setIncludeFontPadding(false);
        textView.setText(newFilterObj.getDesc());
        textView.setOnClickListener(new View.OnClickListener() { // from class: com.max.hbcommon.component.l
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                o.y(this.f67789b, i10, i11, view);
            }
        });
        C(textView, i11 == this.f67804o.get(i10).intValue());
        return textView;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void y(o this$0, int i10, int i11, View view) {
        Object[] objArr = {this$0, new Integer(i10), new Integer(i11), view};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        Class cls = Integer.TYPE;
        if (PatchProxy.proxy(objArr, null, changeQuickRedirect2, true, bb.c.d.H7, new Class[]{o.class, cls, cls, View.class}, Void.TYPE).isSupported) {
            return;
        }
        kotlin.jvm.internal.f0.p(this$0, "this$0");
        View viewZ = this$0.z(i10, this$0.f67804o.get(i10).intValue());
        kotlin.jvm.internal.f0.n(viewZ, "null cannot be cast to non-null type android.widget.TextView");
        this$0.C((TextView) viewZ, false);
        View viewZ2 = this$0.z(i10, i11);
        kotlin.jvm.internal.f0.n(viewZ2, "null cannot be cast to non-null type android.widget.TextView");
        this$0.C((TextView) viewZ2, true);
        this$0.f67804o.set(i10, Integer.valueOf(i11));
    }

    private final View z(int i10, int i11) {
        Object[] objArr = {new Integer(i10), new Integer(i11)};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        Class cls = Integer.TYPE;
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(objArr, this, changeQuickRedirect2, false, bb.c.d.C7, new Class[]{cls, cls}, View.class);
        if (patchProxyResultProxy.isSupported) {
            return (View) patchProxyResultProxy.result;
        }
        ArrayList arrayList = new ArrayList();
        LinearLayout linearLayout = this.f67806q;
        if (linearLayout == null) {
            kotlin.jvm.internal.f0.S("mFilterView");
            linearLayout = null;
        }
        for (View view : ViewGroupKt.e(linearLayout)) {
            if (view instanceof LinearLayout) {
                arrayList.add(SequencesKt___SequencesKt.d3(ViewGroupKt.e((ViewGroup) view)));
            }
        }
        if (i10 >= arrayList.size() || i11 >= ((List) arrayList.get(i10)).size()) {
            return null;
        }
        return (View) ((List) arrayList.get(i10)).get(i11);
    }

    public final boolean A() {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, bb.c.d.F7, new Class[0], Boolean.TYPE);
        if (patchProxyResultProxy.isSupported) {
            return ((Boolean) patchProxyResultProxy.result).booleanValue();
        }
        List<Integer> list = this.f67804o;
        List<Integer> list2 = this.f67803n;
        if (list2 == null) {
            kotlin.jvm.internal.f0.S("mSelectedListSource");
            list2 = null;
        }
        return !kotlin.jvm.internal.f0.g(list, list2);
    }

    public final void B() {
        if (PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, bb.c.d.f31678z7, new Class[0], Void.TYPE).isSupported) {
            return;
        }
        List<NewFilterListObj> list = this.f67802m;
        if (list == null) {
            kotlin.jvm.internal.f0.S("mFilterListList");
            list = null;
        }
        int size = list.size();
        for (int i10 = 0; i10 < size; i10++) {
            List<NewFilterListObj> list2 = this.f67802m;
            if (list2 == null) {
                kotlin.jvm.internal.f0.S("mFilterListList");
                list2 = null;
            }
            List<NewFilterObj> filters = list2.get(i10).getFilters();
            int size2 = filters != null ? filters.size() : 0;
            int i11 = 0;
            while (i11 < size2) {
                View viewZ = z(i10, i11);
                kotlin.jvm.internal.f0.n(viewZ, "null cannot be cast to non-null type android.widget.TextView");
                C((TextView) viewZ, i11 == this.f67804o.get(i10).intValue());
                i11++;
            }
        }
    }

    public final void E(@dl.d List<NewFilterListObj> filterListList, @dl.d List<Integer> selectedList) throws Exception {
        if (PatchProxy.proxy(new Object[]{filterListList, selectedList}, this, changeQuickRedirect, false, bb.c.d.f31634x7, new Class[]{List.class, List.class}, Void.TYPE).isSupported) {
            return;
        }
        kotlin.jvm.internal.f0.p(filterListList, "filterListList");
        kotlin.jvm.internal.f0.p(selectedList, "selectedList");
        q(filterListList, selectedList);
        this.f67802m = filterListList;
        this.f67803n = selectedList;
        this.f67804o.clear();
        List<Integer> list = this.f67804o;
        List<Integer> list2 = this.f67803n;
        if (list2 == null) {
            kotlin.jvm.internal.f0.S("mSelectedListSource");
            list2 = null;
        }
        list.addAll(list2);
    }
}
