package com.max.xiaoheihe.module.mall;

import android.content.Context;
import android.graphics.drawable.GradientDrawable;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import com.max.hbcommon.base.adapter.s;
import com.max.hbutils.utils.ViewUtils;
import com.max.xiaoheihe.R;
import com.max.xiaoheihe.bean.mall.purchase.PurchaseCheckObj;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.PatchProxyResult;
import java.util.List;
import kotlin.b2;
import kotlin.jvm.internal.f0;

/* JADX INFO: compiled from: PurchaseCheckedAdapter.kt */
/* JADX INFO: loaded from: classes11.dex */
@androidx.compose.runtime.internal.o(parameters = 0)
public final class PurchaseCheckedAdapter extends s<PurchaseCheckObj> {
    public static ChangeQuickRedirect changeQuickRedirect = null;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final int f89824e = 8;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @dl.d
    private final Context f89825b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @dl.e
    private final a f89826c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private int f89827d;

    /* JADX INFO: compiled from: PurchaseCheckedAdapter.kt */
    public interface a {
        void a(int i10);
    }

    /* JADX INFO: compiled from: PurchaseCheckedAdapter.kt */
    public static final class b implements View.OnClickListener {
        public static ChangeQuickRedirect changeQuickRedirect;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ PurchaseCheckObj f89828b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ PurchaseCheckedAdapter f89829c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        final /* synthetic */ s.e f89830d;

        b(PurchaseCheckObj purchaseCheckObj, PurchaseCheckedAdapter purchaseCheckedAdapter, s.e eVar) {
            this.f89828b = purchaseCheckObj;
            this.f89829c = purchaseCheckedAdapter;
            this.f89830d = eVar;
        }

        @Override // android.view.View.OnClickListener
        public final void onClick(View view) {
            if (PatchProxy.proxy(new Object[]{view}, this, changeQuickRedirect, false, 40880, new Class[]{View.class}, Void.TYPE).isSupported) {
                return;
            }
            Boolean selected = this.f89828b.getSelected();
            Boolean bool = Boolean.FALSE;
            if (f0.g(selected, bool)) {
                this.f89829c.getDataList().get(this.f89829c.o()).setSelected(bool);
                PurchaseCheckedAdapter purchaseCheckedAdapter = this.f89829c;
                purchaseCheckedAdapter.notifyItemChanged(purchaseCheckedAdapter.o());
                this.f89829c.q(this.f89830d.getAbsoluteAdapterPosition());
                this.f89829c.getDataList().get(this.f89829c.o()).setSelected(Boolean.TRUE);
                PurchaseCheckedAdapter purchaseCheckedAdapter2 = this.f89829c;
                purchaseCheckedAdapter2.notifyItemChanged(purchaseCheckedAdapter2.o());
                a aVarN = this.f89829c.n();
                if (aVarN != null) {
                    aVarN.a(this.f89829c.o());
                }
            }
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public PurchaseCheckedAdapter(@dl.d Context context, @dl.d List<PurchaseCheckObj> list, @dl.e a aVar) {
        super(context, list, R.layout.item_purchase_select);
        f0.p(context, "context");
        f0.p(list, "list");
        this.f89825b = context;
        this.f89826c = aVar;
    }

    @dl.d
    public final Context m() {
        return this.f89825b;
    }

    @dl.e
    public final a n() {
        return this.f89826c;
    }

    public final int o() {
        return this.f89827d;
    }

    @Override // com.max.hbcommon.base.adapter.s
    public /* bridge */ /* synthetic */ void onBindViewHolder(s.e eVar, PurchaseCheckObj purchaseCheckObj) {
        if (PatchProxy.proxy(new Object[]{eVar, purchaseCheckObj}, this, changeQuickRedirect, false, 40877, new Class[]{s.e.class, Object.class}, Void.TYPE).isSupported) {
            return;
        }
        p(eVar, purchaseCheckObj);
    }

    public void p(@dl.e s.e eVar, @dl.e PurchaseCheckObj purchaseCheckObj) {
        if (PatchProxy.proxy(new Object[]{eVar, purchaseCheckObj}, this, changeQuickRedirect, false, 40876, new Class[]{s.e.class, PurchaseCheckObj.class}, Void.TYPE).isSupported || eVar == null || purchaseCheckObj == null) {
            return;
        }
        View viewI = eVar.i(R.id.vg_container);
        f0.o(viewI, "viewHolder.getView(R.id.vg_container)");
        final ViewGroup viewGroup = (ViewGroup) viewI;
        View viewI2 = eVar.i(R.id.tv_out_of_stock);
        f0.o(viewI2, "viewHolder.getView(R.id.tv_out_of_stock)");
        TextView textView = (TextView) viewI2;
        View viewI3 = eVar.i(R.id.tv_text);
        f0.o(viewI3, "viewHolder.getView(R.id.tv_text)");
        final TextView textView2 = (TextView) viewI3;
        View viewI4 = eVar.i(R.id.iv_icon);
        f0.o(viewI4, "viewHolder.getView(R.id.iv_icon)");
        ImageView imageView = (ImageView) viewI4;
        View viewI5 = eVar.i(R.id.tv_rec_desc);
        f0.o(viewI5, "viewHolder.getView(R.id.tv_rec_desc)");
        final TextView textView3 = (TextView) viewI5;
        if (purchaseCheckObj.getIcon() != null) {
            imageView.setVisibility(0);
            Integer icon = purchaseCheckObj.getIcon();
            f0.m(icon);
            imageView.setImageResource(icon.intValue());
        } else {
            imageView.setVisibility(8);
        }
        textView.setVisibility(8);
        int iF = ViewUtils.f(this.f89825b, 3.0f);
        ViewGroup.LayoutParams layoutParams = eVar.itemView.getLayoutParams();
        f0.n(layoutParams, "null cannot be cast to non-null type android.view.ViewGroup.MarginLayoutParams");
        ((ViewGroup.MarginLayoutParams) layoutParams).topMargin = iF;
        textView2.setTextSize(0, this.f89825b.getResources().getDimensionPixelSize(R.dimen.text_size_12));
        textView2.setIncludeFontPadding(false);
        textView2.setLineSpacing(ViewUtils.f(this.f89825b, 2.0f), 1.0f);
        textView2.setText(purchaseCheckObj.getDesc());
        textView3.setVisibility(!com.max.hbcommon.utils.c.u(purchaseCheckObj.getRec_desc()) ? 0 : 4);
        textView3.setText(purchaseCheckObj.getRec_desc());
        Boolean enable = purchaseCheckObj.getEnable();
        Boolean bool = Boolean.TRUE;
        if (f0.g(enable, bool) || !f0.g("0", purchaseCheckObj.getEnable_notify())) {
            if (f0.g(purchaseCheckObj.getSelected(), bool)) {
                if (f0.g("1", purchaseCheckObj.getEnable_notify()) || f0.g("2", purchaseCheckObj.getEnable_notify())) {
                    textView.setVisibility(0);
                    textView.setBackground(ViewUtils.i(ViewUtils.f(this.f89825b, 2.0f), this.f89825b.getResources().getColor(R.color.dialog_btn_black_color), this.f89825b.getResources().getColor(R.color.text_primary_1_color)));
                }
                this.f89827d = eVar.getAbsoluteAdapterPosition();
                com.max.hbmmkv.c.a("mall", new yh.l<com.max.hbmmkv.b, b2>() { // from class: com.max.xiaoheihe.module.mall.PurchaseCheckedAdapter$onBindViewHolder$1$1$2
                    public static ChangeQuickRedirect changeQuickRedirect;

                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    {
                        super(1);
                    }

                    public final void a(@dl.d com.max.hbmmkv.b withMMKV) {
                        if (PatchProxy.proxy(new Object[]{withMMKV}, this, changeQuickRedirect, false, 40878, new Class[]{com.max.hbmmkv.b.class}, Void.TYPE).isSupported) {
                            return;
                        }
                        f0.p(withMMKV, "$this$withMMKV");
                        if (withMMKV.b(ad.d.f1247b, false, true)) {
                            viewGroup.setBackground(com.max.hbutils.utils.q.o(this.m(), R.color.icon_gradient_dark_end_color, 3.0f));
                            textView2.setTextColor(this.m().getResources().getColor(R.color.btn_white_color_normal));
                        } else {
                            viewGroup.setBackground(com.max.hbutils.utils.q.i(this.m(), R.color.background_card_1_color, R.color.text_primary_1_color, 0.5f, 3.0f));
                            textView2.setTextColor(this.m().getResources().getColor(R.color.text_primary_1_color));
                            textView3.setBackground(com.max.hbutils.utils.q.k(this.m(), com.max.xiaoheihe.utils.d.E(R.color.dialog_btn_black_color), com.max.xiaoheihe.utils.d.E(R.color.text_primary_1_color), GradientDrawable.Orientation.BL_TR, new float[]{2.0f, 2.0f, 2.0f, 2.0f, 4.0f, 4.0f, 0.0f, 0.0f}));
                        }
                    }

                    /* JADX WARN: Type inference failed for: r9v3, types: [java.lang.Object, kotlin.b2] */
                    @Override // yh.l
                    public /* bridge */ /* synthetic */ b2 invoke(com.max.hbmmkv.b bVar) {
                        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{bVar}, this, changeQuickRedirect, false, 40879, new Class[]{Object.class}, Object.class);
                        if (patchProxyResultProxy.isSupported) {
                            return patchProxyResultProxy.result;
                        }
                        a(bVar);
                        return b2.f124493a;
                    }
                });
                textView3.setTextColor(com.max.xiaoheihe.utils.d.E(R.color.background_layer_2_color));
            } else {
                if (f0.g("1", purchaseCheckObj.getEnable_notify()) || f0.g("2", purchaseCheckObj.getEnable_notify())) {
                    textView.setVisibility(0);
                    textView.setBackground(ViewUtils.i(ViewUtils.f(this.f89825b, 2.0f), this.f89825b.getResources().getColor(R.color.dialog_btn_black_color), this.f89825b.getResources().getColor(R.color.text_primary_1_color)));
                }
                viewGroup.setBackground(com.max.hbutils.utils.q.o(this.f89825b, R.color.background_card_1_color, 3.0f));
                textView2.setTextColor(this.f89825b.getResources().getColor(R.color.text_primary_2_color));
                textView3.setBackground(com.max.hbutils.utils.q.k(this.f89825b, com.max.xiaoheihe.utils.d.E(R.color.divider_primary_1_color), com.max.xiaoheihe.utils.d.E(R.color.divider_primary_1_color), GradientDrawable.Orientation.BL_TR, new float[]{2.0f, 2.0f, 2.0f, 2.0f, 4.0f, 4.0f, 0.0f, 0.0f}));
                textView3.setTextColor(com.max.xiaoheihe.utils.d.E(R.color.text_primary_2_color));
            }
            if (!com.max.hbcommon.utils.c.u(purchaseCheckObj.getBg_start_color()) && !com.max.hbcommon.utils.c.u(purchaseCheckObj.getBg_end_color())) {
                Context context = this.f89825b;
                String bg_start_color = purchaseCheckObj.getBg_start_color();
                f0.m(bg_start_color);
                int iD = com.max.hbutils.utils.a.d(bg_start_color);
                String bg_end_color = purchaseCheckObj.getBg_end_color();
                f0.m(bg_end_color);
                textView3.setBackground(com.max.hbutils.utils.q.k(context, iD, com.max.hbutils.utils.a.d(bg_end_color), GradientDrawable.Orientation.BL_TR, new float[]{2.0f, 2.0f, 2.0f, 2.0f, 4.0f, 4.0f, 0.0f, 0.0f}));
                textView3.setTextColor(com.max.xiaoheihe.utils.d.E(R.color.white));
            }
            textView3.invalidate();
        } else {
            viewGroup.setBackground(com.max.hbutils.utils.q.o(this.f89825b, R.color.background_card_1_color, 3.0f));
            textView2.setTextColor(this.f89825b.getResources().getColor(R.color.text_secondary_2_color));
        }
        viewGroup.setOnClickListener(new b(purchaseCheckObj, this, eVar));
    }

    public final void q(int i10) {
        this.f89827d = i10;
    }
}
