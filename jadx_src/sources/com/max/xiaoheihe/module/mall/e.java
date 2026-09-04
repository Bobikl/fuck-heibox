package com.max.xiaoheihe.module.mall;

import android.content.Context;
import android.graphics.drawable.StateListDrawable;
import android.text.SpannableString;
import android.text.SpannableStringBuilder;
import android.text.TextUtils;
import android.text.style.AbsoluteSizeSpan;
import android.text.style.StrikethroughSpan;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.annotation.n0;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.a0;
import androidx.lifecycle.y;
import androidx.recyclerview.widget.RecyclerView;
import com.google.android.flexbox.FlexboxLayout;
import com.max.hbcommon.base.adapter.s;
import com.max.hbcommon.bean.KeyDescObj;
import com.max.hbsearch.SearchNewActivity;
import com.max.hbuikit.bean.param.UiKitSpanObj;
import com.max.hbutils.utils.ViewUtils;
import com.max.xiaoheihe.R;
import com.max.xiaoheihe.bean.mall.MallGameInfoObj;
import com.max.xiaoheihe.bean.mall.MallPriceObj;
import com.max.xiaoheihe.bean.mall.MallProductObj;
import com.max.xiaoheihe.module.game.adapter.v;
import com.max.xiaoheihe.module.game.r1;
import com.max.xiaoheihe.module.game.z;
import com.max.xiaoheihe.module.mall.component.MallProductView;
import com.max.xiaoheihe.utils.i0;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: compiled from: MallProductAdapter.java */
/* JADX INFO: loaded from: classes11.dex */
public class e extends s<MallProductObj> implements y {
    public static ChangeQuickRedirect changeQuickRedirect;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private Context f90716b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private int f90717c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private int f90718d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final a0 f90719e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private v<e> f90720f;

    /* JADX INFO: compiled from: MallProductAdapter.java */
    public class a implements View.OnClickListener {
        public static ChangeQuickRedirect changeQuickRedirect;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ s.e f90721b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ MallProductObj f90722c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        final /* synthetic */ MallGameInfoObj f90723d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        final /* synthetic */ String f90724e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        final /* synthetic */ String f90725f;

        a(s.e eVar, MallProductObj mallProductObj, MallGameInfoObj mallGameInfoObj, String str, String str2) {
            this.f90721b = eVar;
            this.f90722c = mallProductObj;
            this.f90723d = mallGameInfoObj;
            this.f90724e = str;
            this.f90725f = str2;
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            if (PatchProxy.proxy(new Object[]{view}, this, changeQuickRedirect, false, 40322, new Class[]{View.class}, Void.TYPE).isSupported) {
                return;
            }
            com.max.heybox.hblog.g.x("MallProductAdapter, onItemClick, viewHolder = " + this.f90721b);
            e.this.o();
            if ((e.this.f90716b instanceof SearchNewActivity) && this.f90722c.getReport_id() != null) {
                com.max.hbcommon.utils.k.f(this.f90722c.getReport_id(), UiKitSpanObj.TYPE_CLICK, this.f90722c.getCustom_index(), this.f90722c.getCustom_suggested_from());
            }
            if (!com.max.hbcommon.utils.c.u(this.f90722c.getProtocol())) {
                com.max.xiaoheihe.base.router.b.k0(e.this.f90716b, this.f90722c.getProtocol());
            } else if (this.f90723d != null) {
                e.this.f90716b.startActivity(z.b(e.this.f90716b, this.f90724e, this.f90723d.getAppid(), this.f90723d.getGame_type(), null, i0.m(), i0.j(), this.f90725f));
            } else {
                e.this.f90716b.startActivity(MallProductDetailActivity.n2(e.this.f90716b, this.f90725f, this.f90724e));
            }
        }
    }

    public e(Context context, List<MallProductObj> list) {
        super(context, list, R.layout.item_mall_product);
        this.f90719e = new a0(this);
        this.f90716b = context;
        int iL = (int) ((ViewUtils.L(context) - ViewUtils.f(this.f90716b, 31.0f)) / 2.0f);
        this.f90717c = iL;
        this.f90718d = (int) ((iL * 85.0f) / 171.0f);
    }

    public static void p(TextView textView, TextView textView2, TextView textView3, MallProductObj mallProductObj) {
        if (PatchProxy.proxy(new Object[]{textView, textView2, textView3, mallProductObj}, null, changeQuickRedirect, true, 40317, new Class[]{TextView.class, TextView.class, TextView.class, MallProductObj.class}, Void.TYPE).isSupported || textView == null || textView2 == null || textView3 == null) {
            return;
        }
        Context context = textView.getContext();
        if (mallProductObj.getPrice() == null) {
            textView.setVisibility(8);
            textView2.setVisibility(8);
            textView3.setVisibility(8);
            return;
        }
        MallPriceObj price = mallProductObj.getPrice();
        textView.setVisibility(0);
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(context.getResources().getString(R.string.rmb_symbol));
        spannableStringBuilder.setSpan(new AbsoluteSizeSpan(context.getResources().getDimensionPixelSize(R.dimen.text_size_11)), 0, spannableStringBuilder.length(), 33);
        String strG = r1.G(price.getFinal_price());
        if (strG == null) {
            strG = "0";
        }
        spannableStringBuilder.append((CharSequence) strG);
        textView.setText(spannableStringBuilder);
        if (com.max.hbcommon.utils.c.u(price.getInitial_price()) || price.getInitial_price().equals(price.getFinal_price())) {
            textView2.setVisibility(8);
        } else {
            SpannableString spannableString = new SpannableString(context.getResources().getString(R.string.rmb_symbol) + r1.G(price.getInitial_price()));
            spannableString.setSpan(new StrikethroughSpan(), 0, spannableString.length(), 33);
            textView2.setText(spannableString);
            textView2.setVisibility(0);
        }
        r1.j1(textView3, price, mallProductObj.getSale_prefix());
    }

    public static void q(FlexboxLayout flexboxLayout, List<KeyDescObj> list, int i10) {
        int i11;
        int i12;
        List<KeyDescObj> list2 = list;
        int i13 = 0;
        int i14 = 1;
        int i15 = 2;
        if (PatchProxy.proxy(new Object[]{flexboxLayout, list2, new Integer(i10)}, null, changeQuickRedirect, true, 40316, new Class[]{FlexboxLayout.class, List.class, Integer.TYPE}, Void.TYPE).isSupported) {
            return;
        }
        Context context = flexboxLayout.getContext();
        flexboxLayout.removeAllViews();
        if (list2 == null || list.size() <= 0) {
            flexboxLayout.setVisibility(8);
            return;
        }
        flexboxLayout.setVisibility(0);
        int iF = ViewUtils.f(context, 6.0f);
        int iF2 = ViewUtils.f(context, 4.0f);
        int i16 = 0;
        int i17 = 0;
        while (i16 < list.size() && i16 <= i15) {
            String desc = list2.get(i16).getDesc();
            if (com.max.hbcommon.utils.c.u(desc)) {
                i11 = i14;
                i12 = i15;
            } else {
                int i18 = flexboxLayout.getChildCount() > 0 ? i14 : i13;
                TextView textView = new TextView(context);
                textView.setTypeface(com.max.hbresource.a.f71893a.a(com.max.hbresource.a.f71894b));
                textView.setPadding(iF2, ViewUtils.f(context, 1.0f), iF2, ViewUtils.f(context, 1.0f));
                textView.setTextSize(i13, context.getResources().getDimensionPixelSize(R.dimen.text_size_10));
                textView.setTextColor(context.getResources().getColor(R.color.text_secondary_1_color));
                int iH0 = ViewUtils.h0(context, ViewUtils.o(context, textView));
                StateListDrawable stateListDrawable = new StateListDrawable();
                int[] iArr = new int[i15];
                // fill-array-data instruction
                iArr[0] = 16842910;
                iArr[1] = 16842919;
                float f10 = iH0;
                stateListDrawable.addState(iArr, com.max.hbutils.utils.q.M(com.max.hbutils.utils.q.o(context, R.color.background_layer_3_color, f10), context, R.color.divider_primary_1_color, 0.5f));
                stateListDrawable.addState(new int[]{-16842910}, com.max.hbutils.utils.q.M(com.max.hbutils.utils.q.o(context, R.color.transparent, f10), context, R.color.text_secondary_2_color, 0.5f));
                i13 = 0;
                stateListDrawable.addState(new int[0], com.max.hbutils.utils.q.M(com.max.hbutils.utils.q.o(context, R.color.transparent, f10), context, R.color.divider_primary_1_color, 0.5f));
                textView.setBackground(stateListDrawable);
                i11 = 1;
                textView.setSingleLine(true);
                textView.setEllipsize(TextUtils.TruncateAt.END);
                textView.setMinHeight(ViewUtils.f(context, 16.0f));
                textView.setGravity(17);
                textView.setText(desc);
                int iS = (int) (i17 + ViewUtils.S(textView.getPaint(), desc));
                i12 = 2;
                i17 = iS + (iF2 * 2);
                if (i18 != 0) {
                    i17 += iF;
                }
                if (i17 > i10) {
                    return;
                }
                FlexboxLayout.LayoutParams layoutParams = new FlexboxLayout.LayoutParams(-2, -2);
                ((ViewGroup.MarginLayoutParams) layoutParams).leftMargin = i18 != 0 ? iF : 0;
                textView.setLayoutParams(layoutParams);
                flexboxLayout.addView(textView);
            }
            i16++;
            i14 = i11;
            i15 = i12;
            list2 = list;
        }
    }

    @Override // androidx.lifecycle.y
    @n0
    public Lifecycle getLifecycle() {
        return this.f90719e;
    }

    public void n(s.e eVar, MallProductObj mallProductObj) {
        KeyDescObj keyDescObj;
        if (PatchProxy.proxy(new Object[]{eVar, mallProductObj}, this, changeQuickRedirect, false, 40315, new Class[]{s.e.class, MallProductObj.class}, Void.TYPE).isSupported) {
            return;
        }
        MallProductView mallProductView = (MallProductView) eVar.i(R.id.mp);
        boolean zX = com.max.hbcommon.utils.c.x(mallProductObj.getIs_large_image());
        int i10 = zX ? this.f90717c : this.f90718d;
        ViewGroup.LayoutParams layoutParams = mallProductView.f90534k.getLayoutParams();
        int i11 = layoutParams.width;
        int i12 = this.f90717c;
        if (i11 != i12 || layoutParams.height != i10) {
            layoutParams.width = i12;
            layoutParams.height = i10;
            mallProductView.f90534k.setLayoutParams(layoutParams);
        }
        Context context = this.f90716b;
        int i13 = this.f90717c;
        mallProductView.setRadius(ViewUtils.m(context, i13, i13));
        com.max.hbimage.b.K(mallProductObj.getHead_image(), mallProductView.f90534k);
        mallProductView.f90535l.setVisibility(zX ? 0 : 8);
        mallProductView.setName(mallProductObj.getName());
        Context context2 = this.f90716b;
        mallProductView.f90542s.setBackground(com.max.hbutils.utils.q.o(this.f90716b, R.color.text_primary_1_color_alpha80, ViewUtils.h0(context2, ViewUtils.o(context2, mallProductView.f90542s))));
        p(mallProductView.f90540q, mallProductView.f90541r, mallProductView.f90542s, mallProductObj);
        ArrayList arrayList = new ArrayList();
        KeyDescObj keyDescObj2 = null;
        if (mallProductObj.getPrice() == null || mallProductObj.getPrice().getCoupon_info() == null) {
            keyDescObj = null;
        } else {
            keyDescObj = new KeyDescObj();
            keyDescObj.setDesc(mallProductObj.getPrice().getCoupon_info().getCoupon_desc());
        }
        if (mallProductObj.getFlags() != null) {
            for (String str : mallProductObj.getFlags()) {
                KeyDescObj keyDescObj3 = new KeyDescObj();
                keyDescObj3.setDesc(str);
                arrayList.add(keyDescObj3);
            }
        }
        if (mallProductObj.getPrice() != null && mallProductObj.getPrice().getRebate_desc() != null) {
            keyDescObj2 = new KeyDescObj();
            keyDescObj2.setDesc(mallProductObj.getPrice().getRebate_desc());
        }
        r1.y1(this.f90716b, mallProductView.f90536m, keyDescObj, keyDescObj2);
        q(mallProductView.f90538o, arrayList, this.f90717c - ViewUtils.f(this.f90716b, 20.0f));
        String h_src = mallProductObj.getH_src();
        String sku_id = mallProductObj.getSku_id();
        MallGameInfoObj game_info = mallProductObj.getGame_info();
        eVar.b().setTag(mallProductObj);
        eVar.b().setOnClickListener(new a(eVar, mallProductObj, game_info, h_src, sku_id));
    }

    public void o() {
        v<e> vVar;
        if (PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 40318, new Class[0], Void.TYPE).isSupported || (vVar = this.f90720f) == null) {
            return;
        }
        vVar.q();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public void onAttachedToRecyclerView(@n0 RecyclerView recyclerView) {
        if (PatchProxy.proxy(new Object[]{recyclerView}, this, changeQuickRedirect, false, 40319, new Class[]{RecyclerView.class}, Void.TYPE).isSupported) {
            return;
        }
        super.onAttachedToRecyclerView(recyclerView);
        this.f90719e.l(Lifecycle.Event.ON_RESUME);
        this.f90720f = new v<>(this, recyclerView);
    }

    @Override // com.max.hbcommon.base.adapter.s
    public /* bridge */ /* synthetic */ void onBindViewHolder(s.e eVar, MallProductObj mallProductObj) {
        if (PatchProxy.proxy(new Object[]{eVar, mallProductObj}, this, changeQuickRedirect, false, 40321, new Class[]{s.e.class, Object.class}, Void.TYPE).isSupported) {
            return;
        }
        n(eVar, mallProductObj);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public void onDetachedFromRecyclerView(@n0 RecyclerView recyclerView) {
        if (PatchProxy.proxy(new Object[]{recyclerView}, this, changeQuickRedirect, false, 40320, new Class[]{RecyclerView.class}, Void.TYPE).isSupported) {
            return;
        }
        super.onDetachedFromRecyclerView(recyclerView);
        this.f90719e.l(Lifecycle.Event.ON_DESTROY);
    }
}
