package com.max.hbwallet;

import android.app.ProgressDialog;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;
import android.content.res.Resources;
import android.graphics.ColorFilter;
import android.graphics.PorterDuff;
import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import android.widget.TextView;
import androidx.cardview.widget.CardView;
import androidx.fragment.app.FragmentActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.max.hbutils.bean.Result;
import com.max.hbutils.utils.ViewUtils;
import com.max.hbwallet.bean.CouponPresentInfoObj;
import com.max.hbwallet.bean.MallCouponCategoryObj;
import com.max.hbwallet.bean.MallCouponListResultObj;
import com.max.hbwallet.bean.MallCouponObj;
import com.max.hbwallet.bean.MallCouponWrapperObj;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.PatchProxyResult;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: loaded from: classes2.dex */
public class MallCouponListFragment extends com.max.hbcommon.base.d implements t {
    public static ChangeQuickRedirect changeQuickRedirect = null;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    private static final String f73893o = "from";

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    private static final String f73894p = "type";

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    private static final String f73895q = "cat";

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    private static final String f73896r = "order_id";

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    private static final String f73897s = "checked_item_list";

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    private static final String f73898t = "purchase_code";

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private String f73899b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private String f73900c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private String f73901d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private String f73902e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private String f73903f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private ArrayList<MallCouponObj> f73904g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private int f73905h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private k f73906i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private com.max.hbcommon.base.adapter.u<MallCouponWrapperObj> f73907j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private List<MallCouponWrapperObj> f73908k = new ArrayList();

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private RefreshBroadcastReceiver f73909l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private ProgressDialog f73910m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private mb.b1 f73911n;

    public class RefreshBroadcastReceiver extends BroadcastReceiver {
        public static ChangeQuickRedirect changeQuickRedirect;

        private RefreshBroadcastReceiver() {
        }

        /* synthetic */ RefreshBroadcastReceiver(MallCouponListFragment mallCouponListFragment, a aVar) {
            this();
        }

        @Override // android.content.BroadcastReceiver
        public void onReceive(Context context, Intent intent) {
            if (!PatchProxy.proxy(new Object[]{context, intent}, this, changeQuickRedirect, false, bb.c.l.f34033b0, new Class[]{Context.class, Intent.class}, Void.TYPE).isSupported && lb.a.C.equals(intent.getAction())) {
                MallCouponListFragment.this.f73905h = 0;
                MallCouponListFragment.N3(MallCouponListFragment.this);
            }
        }
    }

    public class a extends com.max.hbcommon.base.adapter.u<MallCouponWrapperObj> {
        public static ChangeQuickRedirect changeQuickRedirect;

        /* JADX INFO: renamed from: com.max.hbwallet.MallCouponListFragment$a$a, reason: collision with other inner class name */
        public class ViewOnClickListenerC0592a implements View.OnClickListener {
            public static ChangeQuickRedirect changeQuickRedirect;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            final /* synthetic */ String f73914b;

            ViewOnClickListenerC0592a(String str) {
                this.f73914b = str;
            }

            @Override // android.view.View.OnClickListener
            public void onClick(View view) {
                if (PatchProxy.proxy(new Object[]{view}, this, changeQuickRedirect, false, bb.c.l.I, new Class[]{View.class}, Void.TYPE).isSupported) {
                    return;
                }
                ob.a aVar = ob.a.f132240a;
                ob.a.l().l(((com.max.hbcommon.base.d) MallCouponListFragment.this).mContext, this.f73914b);
            }
        }

        public class b implements View.OnClickListener {
            public static ChangeQuickRedirect changeQuickRedirect;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            final /* synthetic */ MallCouponObj f73916b;

            b(MallCouponObj mallCouponObj) {
                this.f73916b = mallCouponObj;
            }

            @Override // android.view.View.OnClickListener
            public void onClick(View view) {
                if (PatchProxy.proxy(new Object[]{view}, this, changeQuickRedirect, false, bb.c.l.J, new Class[]{View.class}, Void.TYPE).isSupported) {
                    return;
                }
                MallCouponListFragment mallCouponListFragment = MallCouponListFragment.this;
                ob.a aVar = ob.a.f132240a;
                mallCouponListFragment.startActivity(ob.a.l().i(((com.max.hbcommon.base.d) MallCouponListFragment.this).mContext, this.f73916b.getCoupon_id(), this.f73916b.getGame_name()));
            }
        }

        public class c implements View.OnClickListener {
            public static ChangeQuickRedirect changeQuickRedirect;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            final /* synthetic */ MallCouponObj f73918b;

            /* JADX INFO: renamed from: c, reason: collision with root package name */
            final /* synthetic */ String f73919c;

            /* JADX INFO: renamed from: d, reason: collision with root package name */
            final /* synthetic */ String f73920d;

            c(MallCouponObj mallCouponObj, String str, String str2) {
                this.f73918b = mallCouponObj;
                this.f73919c = str;
                this.f73920d = str2;
            }

            @Override // android.view.View.OnClickListener
            public void onClick(View view) {
                if (PatchProxy.proxy(new Object[]{view}, this, changeQuickRedirect, false, bb.c.l.K, new Class[]{View.class}, Void.TYPE).isSupported) {
                    return;
                }
                MallCouponListFragment.Z3(MallCouponListFragment.this, this.f73918b, this.f73919c, this.f73920d);
            }
        }

        public class d implements View.OnClickListener {
            public static ChangeQuickRedirect changeQuickRedirect;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            final /* synthetic */ MallCouponObj f73922b;

            /* JADX INFO: renamed from: c, reason: collision with root package name */
            final /* synthetic */ String f73923c;

            /* JADX INFO: renamed from: d, reason: collision with root package name */
            final /* synthetic */ String f73924d;

            d(MallCouponObj mallCouponObj, String str, String str2) {
                this.f73922b = mallCouponObj;
                this.f73923c = str;
                this.f73924d = str2;
            }

            @Override // android.view.View.OnClickListener
            public void onClick(View view) {
                if (PatchProxy.proxy(new Object[]{view}, this, changeQuickRedirect, false, bb.c.l.L, new Class[]{View.class}, Void.TYPE).isSupported) {
                    return;
                }
                MallCouponListFragment.a4(MallCouponListFragment.this, this.f73922b, this.f73923c, this.f73924d);
            }
        }

        public class e implements View.OnClickListener {
            public static ChangeQuickRedirect changeQuickRedirect;

            e() {
            }

            @Override // android.view.View.OnClickListener
            public void onClick(View view) {
                if (PatchProxy.proxy(new Object[]{view}, this, changeQuickRedirect, false, bb.c.l.M, new Class[]{View.class}, Void.TYPE).isSupported) {
                    return;
                }
                ob.a aVar = ob.a.f132240a;
                ob.a.l().k(((com.max.hbcommon.base.d) MallCouponListFragment.this).mContext, lb.d.W1);
            }
        }

        a(Context context, List list) {
            super(context, list);
        }

        @Override // com.max.hbcommon.base.adapter.u
        public /* bridge */ /* synthetic */ int m(int i10, MallCouponWrapperObj mallCouponWrapperObj) {
            Object[] objArr = {new Integer(i10), mallCouponWrapperObj};
            ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
            Class cls = Integer.TYPE;
            PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(objArr, this, changeQuickRedirect2, false, bb.c.l.G, new Class[]{cls, Object.class}, cls);
            return patchProxyResultProxy.isSupported ? ((Integer) patchProxyResultProxy.result).intValue() : n(i10, mallCouponWrapperObj);
        }

        public int n(int i10, MallCouponWrapperObj mallCouponWrapperObj) {
            Object[] objArr = {new Integer(i10), mallCouponWrapperObj};
            ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
            Class cls = Integer.TYPE;
            PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(objArr, this, changeQuickRedirect2, false, bb.c.l.E, new Class[]{cls, MallCouponWrapperObj.class}, cls);
            if (patchProxyResultProxy.isSupported) {
                return ((Integer) patchProxyResultProxy.result).intValue();
            }
            return 1 == mallCouponWrapperObj.getItemType() ? R.layout.hbwallet_item_category : R.layout.hbwallet_item_coupon;
        }

        public void o(com.max.hbcommon.base.adapter.s.e eVar, MallCouponWrapperObj mallCouponWrapperObj) {
            TextView textView;
            TextView textView2;
            TextView textView3;
            String str;
            int i10;
            String str2;
            int i11;
            int i12;
            if (PatchProxy.proxy(new Object[]{eVar, mallCouponWrapperObj}, this, changeQuickRedirect, false, bb.c.l.F, new Class[]{com.max.hbcommon.base.adapter.s.e.class, MallCouponWrapperObj.class}, Void.TYPE).isSupported) {
                return;
            }
            if (1 == mallCouponWrapperObj.getItemType()) {
                ((TextView) eVar.i(R.id.tv_name)).setText(mallCouponWrapperObj.getDesc());
                return;
            }
            CardView cardView = (CardView) eVar.i(R.id.cv);
            ImageView imageView = (ImageView) eVar.i(R.id.iv_coupon_bg);
            RelativeLayout relativeLayout = (RelativeLayout) eVar.i(R.id.rl_coupon);
            View viewI = eVar.i(R.id.vg_coupon_value);
            TextView textView4 = (TextView) eVar.i(R.id.tv_rmb_symbol);
            TextView textView5 = (TextView) eVar.i(R.id.tv_coupon_value);
            TextView textView6 = (TextView) eVar.i(R.id.tv_discount);
            TextView textView7 = (TextView) eVar.i(R.id.tv_coupon_name);
            TextView textView8 = (TextView) eVar.i(R.id.tv_coupon_time_desc);
            TextView textView9 = (TextView) eVar.i(R.id.tv_coupon_desc);
            View viewI2 = eVar.i(R.id.vg_coupon_option);
            TextView textView10 = (TextView) eVar.i(R.id.tv_coupon_option);
            TextView textView11 = (TextView) eVar.i(R.id.tv_coupon_give);
            ImageView imageView2 = (ImageView) eVar.i(R.id.iv_check_state);
            View viewI3 = eVar.i(R.id.vg_present_desc);
            TextView textView12 = (TextView) eVar.i(R.id.tv_present_desc);
            ImageView imageView3 = (ImageView) eVar.i(R.id.iv_present_avatar);
            TextView textView13 = (TextView) eVar.i(R.id.tv_present_name);
            TextView textView14 = (TextView) eVar.i(R.id.tv_present_time_desc);
            MallCouponObj coupon = mallCouponWrapperObj.getCoupon();
            RecyclerView.LayoutParams layoutParams = (RecyclerView.LayoutParams) cardView.getLayoutParams();
            int iF = ViewUtils.f(((com.max.hbcommon.base.d) MallCouponListFragment.this).mContext, 4.0f);
            int iIndexOf = getDataList().indexOf(mallCouponWrapperObj);
            int i13 = iIndexOf + 1;
            MallCouponWrapperObj mallCouponWrapperObj2 = i13 < getDataList().size() ? getDataList().get(i13) : null;
            int i14 = iIndexOf == 0 ? iF : 0;
            int i15 = (mallCouponWrapperObj2 == null || mallCouponWrapperObj.getItemType() == 0) ? iF : 0;
            if (((ViewGroup.MarginLayoutParams) layoutParams).leftMargin != iF || ((ViewGroup.MarginLayoutParams) layoutParams).bottomMargin != i15 || ((ViewGroup.MarginLayoutParams) layoutParams).topMargin != i14) {
                ((ViewGroup.MarginLayoutParams) layoutParams).leftMargin = iF;
                ((ViewGroup.MarginLayoutParams) layoutParams).rightMargin = iF;
                ((ViewGroup.MarginLayoutParams) layoutParams).topMargin = i14;
                ((ViewGroup.MarginLayoutParams) layoutParams).bottomMargin = i15;
                cardView.setLayoutParams(layoutParams);
            }
            int iV = ViewUtils.V(relativeLayout);
            ViewGroup.LayoutParams layoutParams2 = imageView.getLayoutParams();
            if (layoutParams2.height != iV) {
                layoutParams2.height = iV;
                imageView.setLayoutParams(layoutParams2);
            }
            String name = coupon.getName();
            if (MallCouponObj.TYPE_MONEYOFF.equals(coupon.getType())) {
                viewI2.setVisibility(0);
                com.max.hbimage.b.c(imageView);
                imageView.setColorFilter((ColorFilter) null);
                if (com.max.hbcommon.utils.c.u(coupon.getValue())) {
                    viewI.setVisibility(8);
                } else {
                    viewI.setVisibility(0);
                    if ("9".equals(coupon.getCoupon_type()) || "8".equals(coupon.getCoupon_type())) {
                        textView4.setVisibility(8);
                        if (com.max.hbutils.utils.n.q(coupon.getValue()) % 10 == 0) {
                            textView5.setText(String.valueOf(com.max.hbutils.utils.n.q(coupon.getValue()) / 10));
                        } else {
                            textView5.setText(coupon.getValue());
                        }
                        textView6.setVisibility(0);
                    } else {
                        textView4.setVisibility(0);
                        textView5.setText(coupon.getValue());
                        textView6.setVisibility(8);
                    }
                    bb.d.d(textView5, 2);
                }
                if ("0".equals(coupon.getState())) {
                    imageView.setBackgroundDrawable(ViewUtils.x(0, MallCouponListFragment.this.getResources().getColor(R.color.user_level_7_start), MallCouponListFragment.this.getResources().getColor(R.color.user_level_7_end)));
                    textView10.setVisibility(8);
                    textView11.setVisibility(8);
                    Resources resources = MallCouponListFragment.this.getResources();
                    int i16 = R.color.background_layer_2_color;
                    textView4.setTextColor(resources.getColor(i16));
                    textView6.setTextColor(MallCouponListFragment.this.getResources().getColor(i16));
                    textView5.setTextColor(MallCouponListFragment.this.getResources().getColor(i16));
                    textView3 = textView7;
                    textView3.setTextColor(MallCouponListFragment.this.getResources().getColor(i16));
                    Resources resources2 = MallCouponListFragment.this.getResources();
                    int i17 = R.color.text_secondary_2_color;
                    textView8.setTextColor(resources2.getColor(i17));
                    textView9.setTextColor(MallCouponListFragment.this.getResources().getColor(i17));
                    imageView2.setVisibility(8);
                    cardView.setClickable(false);
                    str2 = name;
                    textView = textView9;
                    textView2 = textView8;
                } else {
                    textView3 = textView7;
                    Resources resources3 = MallCouponListFragment.this.getResources();
                    int i18 = R.color.text_secondary_2_color;
                    str = name;
                    imageView.setBackgroundDrawable(ViewUtils.x(0, resources3.getColor(i18), MallCouponListFragment.this.getResources().getColor(i18)));
                    textView10.setVisibility(0);
                    textView11.setVisibility(8);
                    imageView2.setVisibility(8);
                    textView10.setText(coupon.getState_desc());
                    Resources resources4 = MallCouponListFragment.this.getResources();
                    int i19 = R.color.text_primary_2_color;
                    textView10.setTextColor(resources4.getColor(i19));
                    int iF2 = ViewUtils.f(((com.max.hbcommon.base.d) MallCouponListFragment.this).mContext, 2.0f);
                    Resources resources5 = MallCouponListFragment.this.getResources();
                    int i20 = R.color.divider_color_alpha_50;
                    textView10.setBackgroundDrawable(ViewUtils.H(iF2, resources5.getColor(i20), MallCouponListFragment.this.getResources().getColor(i20)));
                    textView4.setTextColor(MallCouponListFragment.this.getResources().getColor(i19));
                    textView6.setTextColor(MallCouponListFragment.this.getResources().getColor(i19));
                    textView5.setTextColor(MallCouponListFragment.this.getResources().getColor(i19));
                    textView3.setTextColor(MallCouponListFragment.this.getResources().getColor(i19));
                    textView8.setTextColor(MallCouponListFragment.this.getResources().getColor(i19));
                    textView9.setTextColor(MallCouponListFragment.this.getResources().getColor(i19));
                    cardView.setClickable(false);
                    textView10.setClickable(false);
                    textView = textView9;
                    textView2 = textView8;
                    str2 = str;
                }
            } else {
                textView = textView9;
                textView2 = textView8;
                textView3 = textView7;
                str = name;
                cardView.setClickable(false);
                Resources resources6 = MallCouponListFragment.this.getResources();
                int i21 = R.color.background_layer_2_color;
                textView4.setTextColor(resources6.getColor(i21));
                textView6.setTextColor(MallCouponListFragment.this.getResources().getColor(i21));
                textView5.setTextColor(MallCouponListFragment.this.getResources().getColor(i21));
                textView3.setTextColor(MallCouponListFragment.this.getResources().getColor(i21));
                Resources resources7 = MallCouponListFragment.this.getResources();
                int i22 = R.color.text_secondary_2_color;
                textView2.setTextColor(resources7.getColor(i22));
                textView.setTextColor(MallCouponListFragment.this.getResources().getColor(i22));
                imageView.setColorFilter(-1291841493, PorterDuff.Mode.SRC_OVER);
                com.max.hbimage.b.L(coupon.getGame_bg(), imageView, i22);
                viewI.setVisibility(8);
                if ("3".equals(MallCouponListFragment.this.f73900c)) {
                    viewI2.setVisibility(8);
                    if (coupon.getPresent_info() == null || coupon.getPresent_info().getUser_info() == null) {
                        viewI3.setVisibility(8);
                        textView14.setVisibility(8);
                    } else {
                        CouponPresentInfoObj present_info = coupon.getPresent_info();
                        String userid = present_info.getUser_info().getUserid();
                        viewI3.setVisibility(0);
                        textView14.setVisibility(0);
                        textView12.setText(present_info.getDesc());
                        com.max.hbimage.b.I(present_info.getUser_info().getAvartar(), imageView3, R.drawable.common_default_avatar_40x40);
                        textView13.setText(present_info.getUser_info().getUsername());
                        textView14.setText(present_info.getTime_desc());
                        if (com.max.hbcommon.utils.c.u(userid)) {
                            viewI3.setClickable(false);
                        } else {
                            viewI3.setOnClickListener(new ViewOnClickListenerC0592a(userid));
                        }
                    }
                } else {
                    viewI2.setVisibility(0);
                    String state_desc = coupon.getState_desc();
                    if (com.max.hbcommon.utils.c.u(coupon.getPresent_desc())) {
                        i10 = 8;
                        textView11.setVisibility(8);
                    } else {
                        textView11.setVisibility(0);
                        textView11.setText(coupon.getPresent_desc());
                        textView11.setOnClickListener(new b(coupon));
                        i10 = 8;
                    }
                    textView10.setText(state_desc);
                    if ("0".equals(coupon.getState()) || "2".equals(coupon.getState())) {
                        textView10.setTextColor(MallCouponListFragment.this.getResources().getColor(i21));
                        textView10.setBackgroundResource(R.drawable.interactive_2dp);
                        imageView2.setVisibility(8);
                        textView10.setVisibility(0);
                        cardView.setClickable(false);
                        if ("0".equals(coupon.getState())) {
                            str2 = str;
                            textView10.setOnClickListener(new c(coupon, state_desc, str2));
                        } else {
                            str2 = str;
                            textView10.setOnClickListener(new d(coupon, state_desc, str2));
                        }
                    } else {
                        imageView2.setVisibility(i10);
                        textView10.setVisibility(0);
                        textView11.setVisibility(i10);
                        textView10.setTextColor(MallCouponListFragment.this.getResources().getColor(i21));
                        int iF3 = ViewUtils.f(((com.max.hbcommon.base.d) MallCouponListFragment.this).mContext, 2.0f);
                        Resources resources8 = MallCouponListFragment.this.getResources();
                        int i23 = R.color.divider_color_alpha_50;
                        textView10.setBackgroundDrawable(ViewUtils.x(iF3, resources8.getColor(i23), MallCouponListFragment.this.getResources().getColor(i23)));
                        textView10.setClickable(false);
                        if ("1".equals(MallCouponListFragment.this.f73900c)) {
                            cardView.setOnClickListener(new e());
                        } else {
                            cardView.setClickable(false);
                        }
                    }
                }
                str2 = str;
            }
            textView3.setText(str2);
            if (com.max.hbcommon.utils.c.u(coupon.getTime_desc())) {
                i11 = 0;
                i12 = 8;
                textView2.setVisibility(8);
            } else {
                i11 = 0;
                textView2.setVisibility(0);
                textView2.setText(coupon.getTime_desc());
                i12 = 8;
            }
            if (com.max.hbcommon.utils.c.u(coupon.getDescription())) {
                textView.setVisibility(i12);
            } else {
                textView.setVisibility(i11);
                textView.setText(coupon.getDescription());
            }
        }

        @Override // com.max.hbcommon.base.adapter.s
        public /* bridge */ /* synthetic */ void onBindViewHolder(com.max.hbcommon.base.adapter.s.e eVar, Object obj) {
            if (PatchProxy.proxy(new Object[]{eVar, obj}, this, changeQuickRedirect, false, bb.c.l.H, new Class[]{com.max.hbcommon.base.adapter.s.e.class, Object.class}, Void.TYPE).isSupported) {
                return;
            }
            o(eVar, (MallCouponWrapperObj) obj);
        }
    }

    public class b implements DialogInterface.OnClickListener {
        public static ChangeQuickRedirect changeQuickRedirect;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ MallCouponObj f73927b;

        b(MallCouponObj mallCouponObj) {
            this.f73927b = mallCouponObj;
        }

        @Override // android.content.DialogInterface.OnClickListener
        public void onClick(DialogInterface dialogInterface, int i10) {
            if (PatchProxy.proxy(new Object[]{dialogInterface, new Integer(i10)}, this, changeQuickRedirect, false, bb.c.l.N, new Class[]{DialogInterface.class, Integer.TYPE}, Void.TYPE).isSupported) {
                return;
            }
            MallCouponListFragment.V3(MallCouponListFragment.this, this.f73927b);
            dialogInterface.dismiss();
        }
    }

    public class c implements pg.d {
        public static ChangeQuickRedirect changeQuickRedirect;

        c() {
        }

        @Override // pg.d
        public void k(ng.j jVar) {
            if (PatchProxy.proxy(new Object[]{jVar}, this, changeQuickRedirect, false, bb.c.l.O, new Class[]{ng.j.class}, Void.TYPE).isSupported) {
                return;
            }
            MallCouponListFragment.this.f73905h = 0;
            MallCouponListFragment.N3(MallCouponListFragment.this);
        }
    }

    public class d implements pg.b {
        public static ChangeQuickRedirect changeQuickRedirect;

        d() {
        }

        @Override // pg.b
        public void f(ng.j jVar) {
            if (PatchProxy.proxy(new Object[]{jVar}, this, changeQuickRedirect, false, bb.c.l.P, new Class[]{ng.j.class}, Void.TYPE).isSupported) {
                return;
            }
            MallCouponListFragment.e4(MallCouponListFragment.this, 30);
            MallCouponListFragment.N3(MallCouponListFragment.this);
        }
    }

    public class e extends com.max.hbcommon.network.d<Result<MallCouponListResultObj>> {
        public static ChangeQuickRedirect changeQuickRedirect;

        e() {
        }

        @Override // com.max.hbcommon.network.d, io.reactivex.g0
        public void onComplete() {
            if (!PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, bb.c.l.Q, new Class[0], Void.TYPE).isSupported && MallCouponListFragment.this.isActive()) {
                super.onComplete();
                MallCouponListFragment.this.f73911n.f131496c.A(0);
                MallCouponListFragment.this.f73911n.f131496c.p(0);
            }
        }

        @Override // com.max.hbcommon.network.d, io.reactivex.g0
        public void onError(Throwable th2) {
            if (!PatchProxy.proxy(new Object[]{th2}, this, changeQuickRedirect, false, bb.c.l.R, new Class[]{Throwable.class}, Void.TYPE).isSupported && MallCouponListFragment.this.isActive()) {
                super.onError(th2);
                MallCouponListFragment.P3(MallCouponListFragment.this);
                MallCouponListFragment.this.f73911n.f131496c.A(0);
                MallCouponListFragment.this.f73911n.f131496c.p(0);
            }
        }

        public void onNext(Result<MallCouponListResultObj> result) {
            if (!PatchProxy.proxy(new Object[]{result}, this, changeQuickRedirect, false, bb.c.l.S, new Class[]{Result.class}, Void.TYPE).isSupported && MallCouponListFragment.this.isActive()) {
                super.onNext(result);
                if (MallCouponListFragment.this.f73906i != null) {
                    MallCouponListFragment.this.f73906i.U1(MallCouponListFragment.this.f73900c, result.getResult());
                }
                MallCouponListFragment.R3(MallCouponListFragment.this, result.getResult());
            }
        }

        @Override // com.max.hbcommon.network.d, io.reactivex.g0
        public /* bridge */ /* synthetic */ void onNext(Object obj) {
            if (PatchProxy.proxy(new Object[]{obj}, this, changeQuickRedirect, false, bb.c.l.T, new Class[]{Object.class}, Void.TYPE).isSupported) {
                return;
            }
            onNext((Result<MallCouponListResultObj>) obj);
        }
    }

    public class f extends com.max.hbcommon.network.d<Result> {
        public static ChangeQuickRedirect changeQuickRedirect;

        f() {
        }

        @Override // com.max.hbcommon.network.d, io.reactivex.g0
        public void onError(Throwable th2) {
            if (!PatchProxy.proxy(new Object[]{th2}, this, changeQuickRedirect, false, bb.c.l.U, new Class[]{Throwable.class}, Void.TYPE).isSupported && MallCouponListFragment.this.isActive()) {
                super.onError(th2);
                MallCouponListFragment.S3(MallCouponListFragment.this);
            }
        }

        public void onNext(Result result) {
            if (!PatchProxy.proxy(new Object[]{result}, this, changeQuickRedirect, false, bb.c.l.V, new Class[]{Result.class}, Void.TYPE).isSupported && MallCouponListFragment.this.isActive()) {
                super.onNext(result);
                MallCouponListFragment.S3(MallCouponListFragment.this);
                Context context = MallCouponListFragment.this.getContext();
                if (context != null) {
                    context.sendBroadcast(new Intent(lb.a.C));
                }
                if (com.max.hbcommon.utils.c.u(result.getMsg())) {
                    com.max.hbutils.utils.c cVar = com.max.hbutils.utils.c.f73533a;
                    com.max.hbutils.utils.c.f(MallCouponListFragment.this.getString(R.string.success));
                } else {
                    com.max.hbutils.utils.c cVar2 = com.max.hbutils.utils.c.f73533a;
                    com.max.hbutils.utils.c.f(result.getMsg());
                }
            }
        }

        @Override // com.max.hbcommon.network.d, io.reactivex.g0
        public /* bridge */ /* synthetic */ void onNext(Object obj) {
            if (PatchProxy.proxy(new Object[]{obj}, this, changeQuickRedirect, false, bb.c.l.W, new Class[]{Object.class}, Void.TYPE).isSupported) {
                return;
            }
            onNext((Result) obj);
        }
    }

    public class g implements View.OnClickListener {
        public static ChangeQuickRedirect changeQuickRedirect;

        g() {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            if (PatchProxy.proxy(new Object[]{view}, this, changeQuickRedirect, false, bb.c.l.X, new Class[]{View.class}, Void.TYPE).isSupported) {
                return;
            }
            ob.a aVar = ob.a.f132240a;
            ob.a.l().e(((com.max.hbcommon.base.d) MallCouponListFragment.this).mContext);
        }
    }

    public class h implements DialogInterface.OnClickListener {
        public static ChangeQuickRedirect changeQuickRedirect;

        h() {
        }

        @Override // android.content.DialogInterface.OnClickListener
        public void onClick(DialogInterface dialogInterface, int i10) {
            if (PatchProxy.proxy(new Object[]{dialogInterface, new Integer(i10)}, this, changeQuickRedirect, false, bb.c.l.Y, new Class[]{DialogInterface.class, Integer.TYPE}, Void.TYPE).isSupported) {
                return;
            }
            dialogInterface.dismiss();
        }
    }

    public class i implements DialogInterface.OnClickListener {
        public static ChangeQuickRedirect changeQuickRedirect;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ MallCouponObj f73935b;

        i(MallCouponObj mallCouponObj) {
            this.f73935b = mallCouponObj;
        }

        @Override // android.content.DialogInterface.OnClickListener
        public void onClick(DialogInterface dialogInterface, int i10) {
            if (PatchProxy.proxy(new Object[]{dialogInterface, new Integer(i10)}, this, changeQuickRedirect, false, bb.c.l.Z, new Class[]{DialogInterface.class, Integer.TYPE}, Void.TYPE).isSupported) {
                return;
            }
            ob.a aVar = ob.a.f132240a;
            ob.a.d().a((FragmentActivity) ((com.max.hbcommon.base.d) MallCouponListFragment.this).mContext, this.f73935b.getCoupon_id());
            dialogInterface.dismiss();
        }
    }

    public class j implements DialogInterface.OnClickListener {
        public static ChangeQuickRedirect changeQuickRedirect;

        j() {
        }

        @Override // android.content.DialogInterface.OnClickListener
        public void onClick(DialogInterface dialogInterface, int i10) {
            if (PatchProxy.proxy(new Object[]{dialogInterface, new Integer(i10)}, this, changeQuickRedirect, false, bb.c.l.f34010a0, new Class[]{DialogInterface.class, Integer.TYPE}, Void.TYPE).isSupported) {
                return;
            }
            dialogInterface.dismiss();
        }
    }

    public interface k {
        void U1(String str, MallCouponListResultObj mallCouponListResultObj);

        void b(List<MallCouponObj> list);
    }

    static /* synthetic */ void N3(MallCouponListFragment mallCouponListFragment) {
        if (PatchProxy.proxy(new Object[]{mallCouponListFragment}, null, changeQuickRedirect, true, bb.c.l.f34574z, new Class[]{MallCouponListFragment.class}, Void.TYPE).isSupported) {
            return;
        }
        mallCouponListFragment.g4();
    }

    static /* synthetic */ void P3(MallCouponListFragment mallCouponListFragment) {
        if (PatchProxy.proxy(new Object[]{mallCouponListFragment}, null, changeQuickRedirect, true, bb.c.l.A, new Class[]{MallCouponListFragment.class}, Void.TYPE).isSupported) {
            return;
        }
        mallCouponListFragment.showError();
    }

    static /* synthetic */ void R3(MallCouponListFragment mallCouponListFragment, MallCouponListResultObj mallCouponListResultObj) {
        if (PatchProxy.proxy(new Object[]{mallCouponListFragment, mallCouponListResultObj}, null, changeQuickRedirect, true, bb.c.l.B, new Class[]{MallCouponListFragment.class, MallCouponListResultObj.class}, Void.TYPE).isSupported) {
            return;
        }
        mallCouponListFragment.k4(mallCouponListResultObj);
    }

    static /* synthetic */ void S3(MallCouponListFragment mallCouponListFragment) {
        if (PatchProxy.proxy(new Object[]{mallCouponListFragment}, null, changeQuickRedirect, true, bb.c.l.C, new Class[]{MallCouponListFragment.class}, Void.TYPE).isSupported) {
            return;
        }
        mallCouponListFragment.h4();
    }

    static /* synthetic */ void V3(MallCouponListFragment mallCouponListFragment, MallCouponObj mallCouponObj) {
        if (PatchProxy.proxy(new Object[]{mallCouponListFragment, mallCouponObj}, null, changeQuickRedirect, true, bb.c.l.D, new Class[]{MallCouponListFragment.class, MallCouponObj.class}, Void.TYPE).isSupported) {
            return;
        }
        mallCouponListFragment.l4(mallCouponObj);
    }

    static /* synthetic */ void Z3(MallCouponListFragment mallCouponListFragment, MallCouponObj mallCouponObj, String str, String str2) {
        if (PatchProxy.proxy(new Object[]{mallCouponListFragment, mallCouponObj, str, str2}, null, changeQuickRedirect, true, bb.c.l.f34530x, new Class[]{MallCouponListFragment.class, MallCouponObj.class, String.class, String.class}, Void.TYPE).isSupported) {
            return;
        }
        mallCouponListFragment.n4(mallCouponObj, str, str2);
    }

    static /* synthetic */ void a4(MallCouponListFragment mallCouponListFragment, MallCouponObj mallCouponObj, String str, String str2) {
        if (PatchProxy.proxy(new Object[]{mallCouponListFragment, mallCouponObj, str, str2}, null, changeQuickRedirect, true, bb.c.l.f34552y, new Class[]{MallCouponListFragment.class, MallCouponObj.class, String.class, String.class}, Void.TYPE).isSupported) {
            return;
        }
        mallCouponListFragment.o4(mallCouponObj, str, str2);
    }

    static /* synthetic */ int e4(MallCouponListFragment mallCouponListFragment, int i10) {
        int i11 = mallCouponListFragment.f73905h + i10;
        mallCouponListFragment.f73905h = i11;
        return i11;
    }

    private List<MallCouponObj> f4() {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, bb.c.l.f34398r, new Class[0], List.class);
        if (patchProxyResultProxy.isSupported) {
            return (List) patchProxyResultProxy.result;
        }
        ArrayList arrayList = new ArrayList();
        for (MallCouponWrapperObj mallCouponWrapperObj : this.f73908k) {
            if (mallCouponWrapperObj.getItemType() == 0 && mallCouponWrapperObj.getCoupon().isChecked()) {
                arrayList.add(mallCouponWrapperObj.getCoupon());
            }
        }
        return arrayList;
    }

    private void g4() {
        if (PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, bb.c.l.f34307n, new Class[0], Void.TYPE).isSupported) {
            return;
        }
        addDisposable((io.reactivex.disposables.b) ce.b.a().c(this.f73900c, this.f73901d, this.f73902e, this.f73903f, this.f73905h, 30).I5(io.reactivex.schedulers.b.d()).a4(io.reactivex.android.schedulers.a.c()).J5(new e()));
    }

    private void h4() {
        ProgressDialog progressDialog;
        if (PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, bb.c.l.f34486v, new Class[0], Void.TYPE).isSupported || !isActive() || this.mContext.isFinishing() || (progressDialog = this.f73910m) == null) {
            return;
        }
        progressDialog.dismiss();
    }

    public static MallCouponListFragment i4(String str, String str2, String str3, String str4, ArrayList<MallCouponObj> arrayList) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{str, str2, str3, str4, arrayList}, null, changeQuickRedirect, true, bb.c.l.f34124f, new Class[]{String.class, String.class, String.class, String.class, ArrayList.class}, MallCouponListFragment.class);
        return patchProxyResultProxy.isSupported ? (MallCouponListFragment) patchProxyResultProxy.result : j4(str, str2, str3, str4, arrayList, null);
    }

    public static MallCouponListFragment j4(String str, String str2, String str3, String str4, ArrayList<MallCouponObj> arrayList, String str5) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{str, str2, str3, str4, arrayList, str5}, null, changeQuickRedirect, true, bb.c.l.f34147g, new Class[]{String.class, String.class, String.class, String.class, ArrayList.class, String.class}, MallCouponListFragment.class);
        if (patchProxyResultProxy.isSupported) {
            return (MallCouponListFragment) patchProxyResultProxy.result;
        }
        MallCouponListFragment mallCouponListFragment = new MallCouponListFragment();
        Bundle bundle = new Bundle();
        bundle.putString("from", str);
        bundle.putString("type", str2);
        bundle.putString(f73895q, str3);
        bundle.putString("order_id", str4);
        bundle.putSerializable("checked_item_list", arrayList);
        bundle.putString(f73898t, str5);
        mallCouponListFragment.setArguments(bundle);
        return mallCouponListFragment;
    }

    private void k4(MallCouponListResultObj mallCouponListResultObj) {
        if (PatchProxy.proxy(new Object[]{mallCouponListResultObj}, this, changeQuickRedirect, false, bb.c.l.f34353p, new Class[]{MallCouponListResultObj.class}, Void.TYPE).isSupported) {
            return;
        }
        if (mallCouponListResultObj != null) {
            if (this.f73905h == 0) {
                this.f73908k.clear();
            }
            if (mallCouponListResultObj.getList() != null) {
                for (MallCouponCategoryObj mallCouponCategoryObj : mallCouponListResultObj.getList()) {
                    if (!com.max.hbcommon.utils.c.u(mallCouponCategoryObj.getDesc())) {
                        MallCouponWrapperObj mallCouponWrapperObj = new MallCouponWrapperObj();
                        mallCouponWrapperObj.setItemType(1);
                        mallCouponWrapperObj.setDesc(mallCouponCategoryObj.getDesc());
                        this.f73908k.add(mallCouponWrapperObj);
                    }
                    for (MallCouponObj mallCouponObj : mallCouponCategoryObj.getList()) {
                        MallCouponWrapperObj mallCouponWrapperObj2 = new MallCouponWrapperObj();
                        mallCouponWrapperObj2.setItemType(0);
                        mallCouponWrapperObj2.setCoupon(mallCouponObj);
                        mallCouponObj.setChecked(false);
                        ArrayList<MallCouponObj> arrayList = this.f73904g;
                        if (arrayList != null && arrayList.size() > 0) {
                            Iterator<MallCouponObj> it = this.f73904g.iterator();
                            while (it.hasNext()) {
                                if (mallCouponObj.getCoupon_id().equals(it.next().getCoupon_id())) {
                                    mallCouponObj.setChecked(true);
                                }
                            }
                        }
                        this.f73908k.add(mallCouponWrapperObj2);
                    }
                }
            }
            this.f73907j.notifyDataSetChanged();
        }
        if (!this.f73908k.isEmpty()) {
            showContentView();
            return;
        }
        if (!"0".equals(this.f73900c)) {
            showEmpty();
            return;
        }
        showEmpty(R.drawable.common_tag_money_45x45, R.string.tap_to_get_coupon);
        View emptyView = getEmptyView();
        if (emptyView != null) {
            emptyView.setOnClickListener(new g());
        }
    }

    private void l4(MallCouponObj mallCouponObj) {
        if (PatchProxy.proxy(new Object[]{mallCouponObj}, this, changeQuickRedirect, false, bb.c.l.f34330o, new Class[]{MallCouponObj.class}, Void.TYPE).isSupported) {
            return;
        }
        addDisposable((io.reactivex.disposables.b) ce.b.a().j(mallCouponObj.getCoupon_id()).I5(io.reactivex.schedulers.b.d()).a4(io.reactivex.android.schedulers.a.c()).J5(new f()));
    }

    private void m4(MallCouponObj mallCouponObj) {
        if (PatchProxy.proxy(new Object[]{mallCouponObj}, this, changeQuickRedirect, false, bb.c.l.f34376q, new Class[]{MallCouponObj.class}, Void.TYPE).isSupported) {
            return;
        }
        for (MallCouponWrapperObj mallCouponWrapperObj : this.f73908k) {
            if (mallCouponWrapperObj.getItemType() == 0) {
                if (mallCouponWrapperObj.getCoupon().getCoupon_id().equals(mallCouponObj.getCoupon_id())) {
                    mallCouponWrapperObj.getCoupon().setChecked(true);
                } else {
                    mallCouponWrapperObj.getCoupon().setChecked(false);
                }
            }
        }
    }

    private void n4(MallCouponObj mallCouponObj, String str, String str2) {
        if (PatchProxy.proxy(new Object[]{mallCouponObj, str, str2}, this, changeQuickRedirect, false, bb.c.l.f34420s, new Class[]{MallCouponObj.class, String.class, String.class}, Void.TYPE).isSupported || this.mContext.isFinishing()) {
            return;
        }
        new com.max.hbcommon.view.a.f(this.mContext).y(str).l(str2).u(str, new i(mallCouponObj)).o(getString(R.string.cancel), new h()).F();
    }

    private void o4(MallCouponObj mallCouponObj, String str, String str2) {
        if (PatchProxy.proxy(new Object[]{mallCouponObj, str, str2}, this, changeQuickRedirect, false, bb.c.l.f34442t, new Class[]{MallCouponObj.class, String.class, String.class}, Void.TYPE).isSupported || this.mContext.isFinishing()) {
            return;
        }
        new com.max.hbcommon.view.a.f(this.mContext).y(str).l(str2).u(str, new b(mallCouponObj)).o(getString(R.string.cancel), new j()).F();
    }

    @Override // com.max.hbcommon.base.d
    public void initData() {
        if (PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, bb.c.l.f34284m, new Class[0], Void.TYPE).isSupported) {
            return;
        }
        showLoading();
        g4();
    }

    @Override // com.max.hbcommon.base.d
    public void installViews(View view) {
        if (PatchProxy.proxy(new Object[]{view}, this, changeQuickRedirect, false, bb.c.l.f34215j, new Class[]{View.class}, Void.TYPE).isSupported) {
            return;
        }
        mb.b1 b1VarC = mb.b1.c(this.mInflater);
        this.f73911n = b1VarC;
        setContentView(b1VarC);
        if (getArguments() != null) {
            this.f73899b = getArguments().getString("from");
            this.f73900c = getArguments().getString("type");
            this.f73901d = getArguments().getString(f73895q);
            this.f73902e = getArguments().getString("order_id");
            this.f73904g = (ArrayList) getArguments().getSerializable("checked_item_list");
            this.f73903f = getArguments().getString(f73898t);
        }
        this.f73907j = new a(this.mContext, this.f73908k);
        this.f73911n.f131495b.setLayoutManager(new LinearLayoutManager(this.mContext));
        this.f73911n.f131495b.setAdapter(this.f73907j);
        this.f73911n.f131496c.S(new c());
        if ("0".equals(this.f73900c)) {
            this.f73911n.f131496c.b0(false);
        } else {
            this.f73911n.f131496c.f0(new d());
        }
        if (this.mIsFirst) {
            showLoading();
        }
    }

    @Override // com.max.hbcommon.base.d, androidx.fragment.app.Fragment
    public void onAttach(Context context) {
        if (PatchProxy.proxy(new Object[]{context}, this, changeQuickRedirect, false, bb.c.l.f34170h, new Class[]{Context.class}, Void.TYPE).isSupported) {
            return;
        }
        super.onAttach(context);
        if (getParentFragment() instanceof k) {
            this.f73906i = (k) getParentFragment();
            return;
        }
        if (context instanceof k) {
            this.f73906i = (k) context;
            return;
        }
        throw new RuntimeException(getParentFragment() + " or " + context + " must implement CouponListener");
    }

    @Override // com.max.hbcommon.base.d, androidx.fragment.app.Fragment
    public void onDetach() {
        if (PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, bb.c.l.f34193i, new Class[0], Void.TYPE).isSupported) {
            return;
        }
        super.onDetach();
        this.f73906i = null;
    }

    @Override // com.max.hbcommon.base.d
    public void onRefresh() {
        if (PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, bb.c.l.f34464u, new Class[0], Void.TYPE).isSupported) {
            return;
        }
        showLoading();
        g4();
    }

    @Override // com.max.hbcommon.base.d
    public void onRegisterReceiver() {
        if (PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, bb.c.l.f34238k, new Class[0], Void.TYPE).isSupported) {
            return;
        }
        super.onRegisterReceiver();
        RefreshBroadcastReceiver refreshBroadcastReceiver = new RefreshBroadcastReceiver(this, null);
        this.f73909l = refreshBroadcastReceiver;
        registerReceiver(refreshBroadcastReceiver, lb.a.C);
    }

    @Override // com.max.hbcommon.base.d
    public void onUnRegisterReceiver() {
        if (PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, bb.c.l.f34261l, new Class[0], Void.TYPE).isSupported) {
            return;
        }
        unregisterReceiver(this.f73909l);
    }

    @Override // com.max.hbwallet.t
    public void z() {
        Context context;
        if (PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, bb.c.l.f34508w, new Class[0], Void.TYPE).isSupported || (context = getContext()) == null) {
            return;
        }
        context.sendBroadcast(new Intent(lb.a.C));
    }
}
