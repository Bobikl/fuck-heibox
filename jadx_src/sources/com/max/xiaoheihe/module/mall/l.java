package com.max.xiaoheihe.module.mall;

import android.content.Context;
import android.text.SpannableStringBuilder;
import android.view.View;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.cardview.widget.CardView;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.a0;
import androidx.lifecycle.y;
import com.max.hbcommon.base.adapter.s;
import com.max.hbutils.utils.ViewUtils;
import com.max.xiaoheihe.R;
import com.max.xiaoheihe.bean.mall.MallProductObj;
import com.max.xiaoheihe.module.search.SearchHelper;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import java.util.List;
import kotlin.jvm.internal.f0;

/* JADX INFO: compiled from: MallRecProductV2Adapter.kt */
/* JADX INFO: loaded from: classes11.dex */
@androidx.compose.runtime.internal.o(parameters = 0)
public final class l extends s<MallProductObj> implements y {
    public static ChangeQuickRedirect changeQuickRedirect = null;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final int f90798d = 8;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @dl.d
    private final Context f90799b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @dl.d
    private final a0 f90800c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public l(@dl.d Context mContext, @dl.e List<? extends MallProductObj> list) {
        super(mContext, list, R.layout.item_mall_rec_product_v2);
        f0.p(mContext, "mContext");
        this.f90799b = mContext;
        this.f90800c = new a0(this);
    }

    @Override // androidx.lifecycle.y
    @dl.d
    public Lifecycle getLifecycle() {
        return this.f90800c;
    }

    @dl.d
    public final Context m() {
        return this.f90799b;
    }

    public void n(@dl.e s.e eVar, @dl.e MallProductObj mallProductObj) {
        if (PatchProxy.proxy(new Object[]{eVar, mallProductObj}, this, changeQuickRedirect, false, 40663, new Class[]{s.e.class, MallProductObj.class}, Void.TYPE).isSupported || eVar == null || mallProductObj == null) {
            return;
        }
        eVar.itemView.setTag(mallProductObj);
        CardView cardView = (CardView) eVar.i(R.id.cv_container);
        View viewI = eVar.i(R.id.v_stoke);
        ImageView imageView = (ImageView) eVar.i(R.id.iv_img);
        CardView cv_htag = (CardView) eVar.i(R.id.cv_htag);
        LinearLayout ll_htag = (LinearLayout) eVar.i(R.id.ll_htag);
        TextView textView = (TextView) eVar.i(R.id.tv_name);
        TextView currentPriceTextView = (TextView) eVar.i(R.id.tv_current_price);
        TextView originalPriceTextView = (TextView) eVar.i(R.id.tv_original_price);
        TextView tv_discount_info = (TextView) eVar.i(R.id.tv_discount_info);
        float fO = ViewUtils.o(this.f90799b, cardView);
        cardView.setRadius(fO);
        Context context = this.f90799b;
        viewI.setBackground(com.max.hbutils.utils.q.L(context, R.color.divider_secondary_1_color, 0.5f, ViewUtils.h0(context, fO)));
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(mallProductObj.getName());
        SearchHelper.f91573a.a().h(spannableStringBuilder);
        textView.setText(spannableStringBuilder);
        com.max.hbimage.b.K(mallProductObj.getHead_image(), imageView);
        m.a aVar = m.f90801b;
        Context context2 = this.f90799b;
        f0.o(currentPriceTextView, "currentPriceTextView");
        f0.o(originalPriceTextView, "originalPriceTextView");
        f0.o(tv_discount_info, "tv_discount_info");
        aVar.a(context2, mallProductObj, currentPriceTextView, originalPriceTextView, tv_discount_info);
        Context context3 = this.f90799b;
        f0.o(cv_htag, "cv_htag");
        f0.o(ll_htag, "ll_htag");
        aVar.b(context3, mallProductObj, cv_htag, ll_htag);
        Context context4 = this.f90799b;
        View view = eVar.itemView;
        f0.o(view, "viewHolder.itemView");
        aVar.c(context4, mallProductObj, view);
    }

    @Override // com.max.hbcommon.base.adapter.s
    public /* bridge */ /* synthetic */ void onBindViewHolder(s.e eVar, MallProductObj mallProductObj) {
        if (PatchProxy.proxy(new Object[]{eVar, mallProductObj}, this, changeQuickRedirect, false, 40664, new Class[]{s.e.class, Object.class}, Void.TYPE).isSupported) {
            return;
        }
        n(eVar, mallProductObj);
    }
}
