package com.max.hbwallet;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.GradientDrawable;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.max.hbcustomview.QMUIRadiusImageView;
import com.max.hbutils.utils.ViewUtils;
import com.max.hbwallet.bean.MallCouponObj;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.PatchProxyResult;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.Ref;

/* JADX INFO: compiled from: MallCouponListAdatper.kt */
/* JADX INFO: loaded from: classes2.dex */
@kotlin.jvm.internal.t0({"SMAP\nMallCouponListAdatper.kt\nKotlin\n*S Kotlin\n*F\n+ 1 MallCouponListAdatper.kt\ncom/max/hbwallet/MallCouponListAdatper\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,240:1\n1855#2,2:241\n*S KotlinDebug\n*F\n+ 1 MallCouponListAdatper.kt\ncom/max/hbwallet/MallCouponListAdatper\n*L\n196#1:241,2\n*E\n"})
public class h1 extends com.max.hbcommon.base.adapter.s<MallCouponObj> {
    public static ChangeQuickRedirect changeQuickRedirect;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @dl.d
    private final Context f74210b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @dl.e
    private a f74211c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @dl.e
    private a f74212d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    @dl.e
    private b f74213e;

    /* JADX INFO: compiled from: MallCouponListAdatper.kt */
    public interface a {
        void a(@dl.e View view, @dl.d MallCouponObj mallCouponObj);
    }

    /* JADX INFO: compiled from: MallCouponListAdatper.kt */
    public interface b {
        void a(@dl.d MallCouponObj mallCouponObj);

        boolean isValid();
    }

    /* JADX INFO: compiled from: MallCouponListAdatper.kt */
    public static final class c implements com.max.hbimage.b.q {
        public static ChangeQuickRedirect changeQuickRedirect;

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ Ref.ObjectRef<QMUIRadiusImageView> f74214a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ Ref.ObjectRef<ImageView> f74215b;

        c(Ref.ObjectRef<QMUIRadiusImageView> objectRef, Ref.ObjectRef<ImageView> objectRef2) {
            this.f74214a = objectRef;
            this.f74215b = objectRef2;
        }

        @Override // com.max.hbimage.b.q
        public void a(@dl.e Drawable drawable) {
            if (PatchProxy.proxy(new Object[]{drawable}, this, changeQuickRedirect, false, bb.c.l.f34101e, new Class[]{Drawable.class}, Void.TYPE).isSupported || drawable == null) {
                return;
            }
            Ref.ObjectRef<QMUIRadiusImageView> objectRef = this.f74214a;
            Ref.ObjectRef<ImageView> objectRef2 = this.f74215b;
            com.max.hbcommon.utils.d.b("zzzzimg", "width2=" + drawable.getIntrinsicWidth() + "    height2=" + drawable.getIntrinsicHeight());
            objectRef.f124891b.setImageDrawable(drawable);
            ViewGroup.LayoutParams layoutParams = objectRef2.f124891b.getLayoutParams();
            kotlin.jvm.internal.f0.n(layoutParams, "null cannot be cast to non-null type androidx.constraintlayout.widget.ConstraintLayout.LayoutParams");
            ((ConstraintLayout.LayoutParams) layoutParams).H = drawable + ".intrinsicWidth:" + drawable + ".intrinsicHeight";
            objectRef2.f124891b.setImageDrawable(drawable);
            objectRef2.f124891b.setVisibility(0);
        }

        @Override // com.max.hbimage.b.q
        public /* synthetic */ void b(Drawable drawable) {
            com.max.hbimage.d.a(this, drawable);
        }

        @Override // com.max.hbimage.b.q
        public void onLoadFailed(@dl.e Drawable drawable) {
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public h1(@dl.d Context mContext, @dl.d List<? extends MallCouponObj> list) {
        super(mContext, list, R.layout.hbwallet_item_backpack_coupon);
        kotlin.jvm.internal.f0.p(mContext, "mContext");
        kotlin.jvm.internal.f0.p(list, "list");
        this.f74210b = mContext;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Multi-variable type inference failed */
    public static final void A(MallCouponObj data, Ref.ObjectRef iv_checkmark, h1 this$0, View view) {
        if (PatchProxy.proxy(new Object[]{data, iv_checkmark, this$0, view}, null, changeQuickRedirect, true, bb.c.l.f34055c, new Class[]{MallCouponObj.class, Ref.ObjectRef.class, h1.class, View.class}, Void.TYPE).isSupported) {
            return;
        }
        kotlin.jvm.internal.f0.p(data, "$data");
        kotlin.jvm.internal.f0.p(iv_checkmark, "$iv_checkmark");
        kotlin.jvm.internal.f0.p(this$0, "this$0");
        if (data.isChecked()) {
            data.setChecked(false);
            ((ImageView) iv_checkmark.f124891b).setImageResource(R.drawable.unchecked_gray_icon_16x16);
        } else {
            this$0.q();
            data.setChecked(true);
            ((ImageView) iv_checkmark.f124891b).setImageResource(R.drawable.checked_icon_16x16);
        }
        this$0.notifyDataSetChanged();
        b bVar = this$0.f74213e;
        if (bVar != null) {
            bVar.a(data);
        }
    }

    private final void E(com.max.hbcommon.base.adapter.s.e eVar, boolean z10) {
        if (PatchProxy.proxy(new Object[]{eVar, new Byte(z10 ? (byte) 1 : (byte) 0)}, this, changeQuickRedirect, false, bb.c.k.zC, new Class[]{com.max.hbcommon.base.adapter.s.e.class, Boolean.TYPE}, Void.TYPE).isSupported) {
            return;
        }
        TextView textView = (TextView) eVar.i(R.id.tv_name);
        TextView textView2 = (TextView) eVar.i(R.id.tv_time);
        TextView textView3 = (TextView) eVar.i(R.id.tv_desc);
        TextView textView4 = (TextView) eVar.i(R.id.tv_action);
        TextView textView5 = (TextView) eVar.i(R.id.tv_action_x);
        if (z10) {
            textView.setTextColor(com.max.hbcommon.utils.l.a(R.color.text_primary_1_color));
            int i10 = R.color.text_secondary_1_color;
            textView2.setTextColor(com.max.hbcommon.utils.l.a(i10));
            textView3.setTextColor(com.max.hbcommon.utils.l.a(i10));
            int i11 = R.color.background_layer_2_color;
            textView4.setTextColor(com.max.hbcommon.utils.l.a(i11));
            textView5.setTextColor(com.max.hbcommon.utils.l.a(i11));
            int i12 = R.drawable.text_primary_2dp;
            textView4.setBackgroundResource(i12);
            textView5.setBackgroundResource(i12);
            return;
        }
        textView.setTextColor(com.max.hbcommon.utils.l.a(R.color.background_layer_2_color));
        int i13 = R.color.text_secondary_2_color;
        textView2.setTextColor(com.max.hbcommon.utils.l.a(i13));
        textView3.setTextColor(com.max.hbcommon.utils.l.a(i13));
        int i14 = R.color.text_primary_1_color;
        textView4.setTextColor(com.max.hbcommon.utils.l.a(i14));
        textView5.setTextColor(com.max.hbcommon.utils.l.a(i14));
        int i15 = R.drawable.bg_layer_2_color_2dp;
        textView4.setBackgroundResource(i15);
        textView5.setBackgroundResource(i15);
    }

    private final void q() {
        List<MallCouponObj> dataList;
        if (PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, bb.c.k.xC, new Class[0], Void.TYPE).isSupported || (dataList = getDataList()) == null) {
            return;
        }
        Iterator<T> it = dataList.iterator();
        while (it.hasNext()) {
            ((MallCouponObj) it.next()).setChecked(false);
        }
    }

    private final boolean v(String str) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{str}, this, changeQuickRedirect, false, bb.c.k.yC, new Class[]{String.class}, Boolean.TYPE);
        if (patchProxyResultProxy.isSupported) {
            return ((Boolean) patchProxyResultProxy.result).booleanValue();
        }
        return kotlin.jvm.internal.f0.g("10", str) || kotlin.jvm.internal.f0.g("11", str);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void x(h1 this$0, MallCouponObj data, View view) {
        if (PatchProxy.proxy(new Object[]{this$0, data, view}, null, changeQuickRedirect, true, bb.c.k.AC, new Class[]{h1.class, MallCouponObj.class, View.class}, Void.TYPE).isSupported) {
            return;
        }
        kotlin.jvm.internal.f0.p(this$0, "this$0");
        kotlin.jvm.internal.f0.p(data, "$data");
        a aVar = this$0.f74212d;
        if (aVar != null) {
            aVar.a(view, data);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void y(h1 this$0, MallCouponObj data, View view) {
        if (PatchProxy.proxy(new Object[]{this$0, data, view}, null, changeQuickRedirect, true, bb.c.l.f34009a, new Class[]{h1.class, MallCouponObj.class, View.class}, Void.TYPE).isSupported) {
            return;
        }
        kotlin.jvm.internal.f0.p(this$0, "this$0");
        kotlin.jvm.internal.f0.p(data, "$data");
        a aVar = this$0.f74211c;
        if (aVar != null) {
            aVar.a(view, data);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void z(h1 this$0, MallCouponObj data, View view) {
        if (PatchProxy.proxy(new Object[]{this$0, data, view}, null, changeQuickRedirect, true, bb.c.l.f34032b, new Class[]{h1.class, MallCouponObj.class, View.class}, Void.TYPE).isSupported) {
            return;
        }
        kotlin.jvm.internal.f0.p(this$0, "this$0");
        kotlin.jvm.internal.f0.p(data, "$data");
        pb.p pVarP = ob.a.p();
        Context context = this$0.f74210b;
        String protocol = data.getProtocol();
        kotlin.jvm.internal.f0.o(protocol, "getProtocol(...)");
        pVarP.c(context, protocol);
    }

    public final void B(@dl.e a aVar) {
        this.f74211c = aVar;
    }

    public final void C(@dl.e a aVar) {
        this.f74212d = aVar;
    }

    public final void D(@dl.e b bVar) {
        this.f74213e = bVar;
    }

    @Override // com.max.hbcommon.base.adapter.s
    public /* bridge */ /* synthetic */ void onBindViewHolder(com.max.hbcommon.base.adapter.s.e eVar, MallCouponObj mallCouponObj) {
        if (PatchProxy.proxy(new Object[]{eVar, mallCouponObj}, this, changeQuickRedirect, false, bb.c.l.f34078d, new Class[]{com.max.hbcommon.base.adapter.s.e.class, Object.class}, Void.TYPE).isSupported) {
            return;
        }
        w(eVar, mallCouponObj);
    }

    @dl.e
    public final a r() {
        return this.f74211c;
    }

    @dl.e
    public final a s() {
        return this.f74212d;
    }

    @dl.d
    public final Context t() {
        return this.f74210b;
    }

    @dl.e
    public final b u() {
        return this.f74213e;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r10v5, types: [T, android.view.View] */
    /* JADX WARN: Type inference failed for: r14v1, types: [T, android.view.View] */
    /* JADX WARN: Type inference failed for: r4v2, types: [T, android.view.View] */
    public void w(@dl.d com.max.hbcommon.base.adapter.s.e viewHolder, @dl.d final MallCouponObj data) {
        int i10;
        boolean z10;
        if (PatchProxy.proxy(new Object[]{viewHolder, data}, this, changeQuickRedirect, false, bb.c.k.wC, new Class[]{com.max.hbcommon.base.adapter.s.e.class, MallCouponObj.class}, Void.TYPE).isSupported) {
            return;
        }
        kotlin.jvm.internal.f0.p(viewHolder, "viewHolder");
        kotlin.jvm.internal.f0.p(data, "data");
        TextView textView = (TextView) viewHolder.i(R.id.tv_name);
        TextView textView2 = (TextView) viewHolder.i(R.id.tv_time);
        TextView textView3 = (TextView) viewHolder.i(R.id.tv_desc);
        Ref.ObjectRef objectRef = new Ref.ObjectRef();
        objectRef.f124891b = viewHolder.i(R.id.iv_icon);
        ImageView imageView = (ImageView) viewHolder.i(R.id.iv_tag_new);
        View viewI = viewHolder.i(R.id.vg_tag_stack);
        ImageView imageView2 = (ImageView) viewHolder.i(R.id.iv_bg);
        Ref.ObjectRef objectRef2 = new Ref.ObjectRef();
        objectRef2.f124891b = viewHolder.i(R.id.iv_gradient);
        ViewGroup viewGroup = (ViewGroup) viewHolder.i(R.id.vg_price);
        TextView textView4 = (TextView) viewHolder.i(R.id.tv_price);
        TextView textView5 = (TextView) viewHolder.i(R.id.tv_discount);
        TextView textView6 = (TextView) viewHolder.i(R.id.tv_unit);
        View viewI2 = viewHolder.i(R.id.tv_action);
        View viewI3 = viewHolder.i(R.id.tv_action_x);
        final Ref.ObjectRef objectRef3 = new Ref.ObjectRef();
        objectRef3.f124891b = viewHolder.i(R.id.iv_checkmark);
        textView.setText(data.getName());
        if (com.max.hbcommon.utils.c.u(data.getTime_desc())) {
            textView2.setVisibility(8);
        } else {
            textView2.setVisibility(0);
            textView2.setText(data.getTime_desc());
        }
        if (com.max.hbcommon.utils.c.u(data.getDescription())) {
            i10 = 0;
            textView3.setVisibility(8);
        } else {
            i10 = 0;
            textView3.setVisibility(0);
            textView3.setText(data.getDescription());
        }
        if (v(data.getCoupon_type())) {
            viewI.setVisibility(i10);
            imageView.setVisibility(8);
            GradientDrawable.Orientation orientation = GradientDrawable.Orientation.BL_TR;
            int[] iArr = new int[2];
            iArr[i10] = com.max.hbcommon.utils.l.a(R.color.orange_start);
            iArr[1] = com.max.hbcommon.utils.l.a(R.color.orange_end);
            GradientDrawable gradientDrawable = new GradientDrawable(orientation, iArr);
            gradientDrawable.setCornerRadii(com.max.hbutils.utils.q.I(ViewUtils.f(this.f74210b, 5.0f), 6));
            viewI.setBackground(gradientDrawable);
        } else {
            viewI.setVisibility(8);
            imageView.setVisibility(data.isIs_new() ? 0 : 8);
        }
        if (com.max.hbcommon.utils.c.u(data.getPresent_desc())) {
            ((TextView) viewI3).setVisibility(8);
        } else {
            TextView textView7 = (TextView) viewI3;
            textView7.setVisibility(0);
            textView7.setText(data.getPresent_desc());
            textView7.setOnClickListener(new View.OnClickListener() { // from class: com.max.hbwallet.d1
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    h1.x(this.f74196b, data, view);
                }
            });
        }
        TextView textView8 = (TextView) viewI2;
        textView8.setText(data.getState_desc());
        if (kotlin.jvm.internal.f0.g("0", data.getCoupon_type()) || kotlin.jvm.internal.f0.g("4", data.getCoupon_type()) || v(data.getCoupon_type())) {
            viewGroup.setVisibility(0);
            ((QMUIRadiusImageView) objectRef.f124891b).setVisibility(8);
            textView6.setVisibility(0);
            textView5.setVisibility(8);
            if (v(data.getCoupon_type())) {
                imageView2.setBackgroundResource(R.color.gold_light_alpha8);
            } else {
                imageView2.setBackgroundResource(R.color.divider_secondary_1_color);
            }
            textView4.setText(data.getValue());
            E(viewHolder, true);
            ((ImageView) objectRef2.f124891b).setVisibility(8);
        } else if (kotlin.jvm.internal.f0.g("9", data.getCoupon_type()) || kotlin.jvm.internal.f0.g("8", data.getCoupon_type())) {
            viewGroup.setVisibility(0);
            textView6.setVisibility(8);
            textView5.setVisibility(0);
            ((QMUIRadiusImageView) objectRef.f124891b).setVisibility(8);
            imageView2.setBackgroundResource(R.color.divider_secondary_1_color);
            if (com.max.hbutils.utils.n.q(data.getValue()) % 10 == 0) {
                textView4.setText(String.valueOf(com.max.hbutils.utils.n.q(data.getValue()) / 10));
            } else {
                textView4.setText(data.getValue());
            }
            E(viewHolder, true);
            ((ImageView) objectRef2.f124891b).setVisibility(8);
        } else if (kotlin.jvm.internal.f0.g("6", data.getCoupon_type())) {
            E(viewHolder, false);
            viewGroup.setVisibility(8);
            ((QMUIRadiusImageView) objectRef.f124891b).setVisibility(0);
            imageView2.setBackgroundResource(R.drawable.wallet_csgo_351x80);
            ((QMUIRadiusImageView) objectRef.f124891b).setImageDrawable(null);
            com.max.hbimage.b.K(data.getImage_url(), (ImageView) objectRef.f124891b);
            ((ImageView) objectRef2.f124891b).setVisibility(8);
        } else {
            E(viewHolder, false);
            viewGroup.setVisibility(8);
            ((QMUIRadiusImageView) objectRef.f124891b).setVisibility(0);
            ((ImageView) objectRef2.f124891b).setVisibility(8);
            ((QMUIRadiusImageView) objectRef.f124891b).setImageDrawable(null);
            imageView2.setBackgroundResource(R.drawable.gradient_hashtag_bg);
            com.max.hbimage.b.X(this.f74210b, (View) objectRef.f124891b, data.getImage_url(), new c(objectRef, objectRef2));
        }
        textView8.setOnClickListener(new View.OnClickListener() { // from class: com.max.hbwallet.e1
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                h1.y(this.f74199b, data, view);
            }
        });
        b bVar = this.f74213e;
        if (bVar != null) {
            textView8.setVisibility(8);
            ((TextView) viewI3).setVisibility(8);
            if (bVar.isValid()) {
                z10 = false;
                ((ImageView) objectRef3.f124891b).setVisibility(0);
                if (data.isChecked()) {
                    ((ImageView) objectRef3.f124891b).setImageResource(R.drawable.checked_icon_16x16);
                } else {
                    ((ImageView) objectRef3.f124891b).setImageResource(R.drawable.unchecked_gray_icon_16x16);
                }
            } else {
                z10 = false;
                ((ImageView) objectRef3.f124891b).setVisibility(8);
            }
        } else {
            z10 = false;
        }
        if (((kotlin.jvm.internal.f0.g("1", data.getCoupon_type()) || kotlin.jvm.internal.f0.g("2", data.getCoupon_type()) || kotlin.jvm.internal.f0.g("3", data.getCoupon_type()) || kotlin.jvm.internal.f0.g("5", data.getCoupon_type())) ? true : z10) && !com.max.hbcommon.utils.c.u(data.getProtocol())) {
            viewHolder.itemView.setOnClickListener(new View.OnClickListener() { // from class: com.max.hbwallet.f1
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    h1.z(this.f74202b, data, view);
                }
            });
            return;
        }
        b bVar2 = this.f74213e;
        if ((bVar2 == null || !bVar2.isValid()) ? z10 : true) {
            viewHolder.itemView.setOnClickListener(new View.OnClickListener() { // from class: com.max.hbwallet.g1
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    h1.A(data, objectRef3, this, view);
                }
            });
        } else {
            viewHolder.itemView.setOnClickListener(null);
        }
    }
}
