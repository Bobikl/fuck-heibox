package com.max.xiaoheihe.module.mall;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.text.SpannableString;
import android.text.SpannableStringBuilder;
import android.text.style.AbsoluteSizeSpan;
import android.text.style.StrikethroughSpan;
import android.view.View;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.cardview.widget.CardView;
import com.max.hbcommon.base.adapter.s;
import com.max.hbcommon.bean.KeyDescObj;
import com.max.hbcustomview.QMUIRadiusImageView;
import com.max.hbutils.utils.ViewUtils;
import com.max.xiaoheihe.R;
import com.max.xiaoheihe.bean.mall.MallGameInfoObj;
import com.max.xiaoheihe.bean.mall.MallPriceObj;
import com.max.xiaoheihe.bean.mall.MallProductObj;
import com.max.xiaoheihe.module.game.r1;
import com.max.xiaoheihe.module.game.z;
import com.max.xiaoheihe.module.search.SearchHelper;
import com.max.xiaoheihe.utils.i0;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import kotlin.jvm.internal.f0;
import kotlin.jvm.internal.u;

/* JADX INFO: compiled from: MallRecProductVHB.kt */
/* JADX INFO: loaded from: classes11.dex */
@androidx.compose.runtime.internal.o(parameters = 0)
public final class m extends cb.c<MallProductObj> {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @dl.d
    public static final a f90801b = new a(null);

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final int f90802c = 8;
    public static ChangeQuickRedirect changeQuickRedirect;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @dl.d
    private final Context f90803a;

    /* JADX INFO: compiled from: MallRecProductVHB.kt */
    public static final class a {
        public static ChangeQuickRedirect changeQuickRedirect;

        /* JADX INFO: renamed from: com.max.xiaoheihe.module.mall.m$a$a, reason: collision with other inner class name */
        /* JADX INFO: compiled from: MallRecProductVHB.kt */
        public static final class ViewOnClickListenerC0837a implements View.OnClickListener {
            public static ChangeQuickRedirect changeQuickRedirect;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            final /* synthetic */ MallGameInfoObj f90804b;

            /* JADX INFO: renamed from: c, reason: collision with root package name */
            final /* synthetic */ Context f90805c;

            /* JADX INFO: renamed from: d, reason: collision with root package name */
            final /* synthetic */ String f90806d;

            /* JADX INFO: renamed from: e, reason: collision with root package name */
            final /* synthetic */ String f90807e;

            ViewOnClickListenerC0837a(MallGameInfoObj mallGameInfoObj, Context context, String str, String str2) {
                this.f90804b = mallGameInfoObj;
                this.f90805c = context;
                this.f90806d = str;
                this.f90807e = str2;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                if (PatchProxy.proxy(new Object[]{view}, this, changeQuickRedirect, false, 40670, new Class[]{View.class}, Void.TYPE).isSupported) {
                    return;
                }
                MallGameInfoObj mallGameInfoObj = this.f90804b;
                if (mallGameInfoObj != null) {
                    Context context = this.f90805c;
                    context.startActivity(z.b(context, this.f90806d, mallGameInfoObj.getAppid(), this.f90804b.getGame_type(), null, i0.m(), i0.j(), this.f90807e));
                } else {
                    Context context2 = this.f90805c;
                    context2.startActivity(MallProductDetailActivity.n2(context2, this.f90807e, this.f90806d));
                }
            }
        }

        private a() {
        }

        public /* synthetic */ a(u uVar) {
            this();
        }

        public final void a(@dl.d Context mContext, @dl.d MallProductObj data, @dl.d TextView currentPriceTextView, @dl.d TextView originalPriceTextView, @dl.d TextView tv_discount_info) {
            if (PatchProxy.proxy(new Object[]{mContext, data, currentPriceTextView, originalPriceTextView, tv_discount_info}, this, changeQuickRedirect, false, 40667, new Class[]{Context.class, MallProductObj.class, TextView.class, TextView.class, TextView.class}, Void.TYPE).isSupported) {
                return;
            }
            f0.p(mContext, "mContext");
            f0.p(data, "data");
            f0.p(currentPriceTextView, "currentPriceTextView");
            f0.p(originalPriceTextView, "originalPriceTextView");
            f0.p(tv_discount_info, "tv_discount_info");
            if (data.getPrice() == null) {
                currentPriceTextView.setVisibility(8);
                originalPriceTextView.setVisibility(8);
                return;
            }
            MallPriceObj price = data.getPrice();
            currentPriceTextView.setVisibility(0);
            SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(com.max.xiaoheihe.utils.d.n0(R.string.rmb_symbol));
            spannableStringBuilder.setSpan(new AbsoluteSizeSpan(mContext.getResources().getDimensionPixelSize(R.dimen.text_size_10)), 0, spannableStringBuilder.length(), 33);
            String strG = r1.G(price.getFinal_price());
            if (strG == null) {
                strG = "0";
            }
            spannableStringBuilder.append((CharSequence) strG);
            currentPriceTextView.setText(spannableStringBuilder);
            if (com.max.hbcommon.utils.c.u(price.getInitial_price()) || f0.g(price.getInitial_price(), price.getFinal_price())) {
                originalPriceTextView.setVisibility(8);
            } else {
                SpannableString spannableString = new SpannableString(com.max.xiaoheihe.utils.d.n0(R.string.rmb_symbol) + r1.G(price.getInitial_price()));
                spannableString.setSpan(new StrikethroughSpan(), 0, spannableString.length(), 33);
                originalPriceTextView.setText(spannableString);
                originalPriceTextView.setVisibility(0);
            }
            if (com.max.hbcommon.utils.c.u(data.getPrice().getDiscount()) || com.max.hbutils.utils.n.p(data.getPrice().getDiscount()) >= 1.0f) {
                tv_discount_info.setVisibility(8);
                return;
            }
            tv_discount_info.setVisibility(0);
            StringBuilder sb2 = new StringBuilder();
            sb2.append('-');
            sb2.append((int) ((1.0f - com.max.hbutils.utils.n.p(data.getPrice().getDiscount())) * 100.0f));
            sb2.append('%');
            tv_discount_info.setText(sb2.toString());
            tv_discount_info.setBackground(ViewUtils.G(ViewUtils.o(mContext, tv_discount_info), com.max.xiaoheihe.utils.d.E(R.color.text_primary_1_color_alpha80)));
        }

        public final void b(@dl.d Context mContext, @dl.d MallProductObj data, @dl.d CardView cv_htag, @dl.d LinearLayout ll_htag) {
            KeyDescObj keyDescObj;
            if (PatchProxy.proxy(new Object[]{mContext, data, cv_htag, ll_htag}, this, changeQuickRedirect, false, 40668, new Class[]{Context.class, MallProductObj.class, CardView.class, LinearLayout.class}, Void.TYPE).isSupported) {
                return;
            }
            f0.p(mContext, "mContext");
            f0.p(data, "data");
            f0.p(cv_htag, "cv_htag");
            f0.p(ll_htag, "ll_htag");
            KeyDescObj keyDescObj2 = null;
            if (data.getPrice() == null || data.getPrice().getCoupon_info() == null) {
                keyDescObj = null;
            } else {
                keyDescObj = new KeyDescObj();
                keyDescObj.setDesc(data.getPrice().getCoupon_info().getCoupon_desc());
            }
            if (data.getPrice() != null && data.getPrice().getRebate_desc() != null) {
                keyDescObj2 = new KeyDescObj();
                keyDescObj2.setDesc(data.getPrice().getRebate_desc());
            }
            if (keyDescObj == null && keyDescObj2 == null) {
                cv_htag.setVisibility(8);
                return;
            }
            cv_htag.setVisibility(0);
            cv_htag.setRadius(ViewUtils.o(mContext, cv_htag));
            r1.y1(mContext, ll_htag, keyDescObj, keyDescObj2);
        }

        public final void c(@dl.d Context mContext, @dl.d MallProductObj data, @dl.d View item) {
            if (PatchProxy.proxy(new Object[]{mContext, data, item}, this, changeQuickRedirect, false, 40669, new Class[]{Context.class, MallProductObj.class, View.class}, Void.TYPE).isSupported) {
                return;
            }
            f0.p(mContext, "mContext");
            f0.p(data, "data");
            f0.p(item, "item");
            item.setOnClickListener(new ViewOnClickListenerC0837a(data.getGame_info(), mContext, data.getH_src(), data.getSku_id()));
        }
    }

    /* JADX INFO: compiled from: MallRecProductVHB.kt */
    public static final class b implements com.max.hbimage.b.q {
        public static ChangeQuickRedirect changeQuickRedirect;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ QMUIRadiusImageView f90809b;

        b(QMUIRadiusImageView qMUIRadiusImageView) {
            this.f90809b = qMUIRadiusImageView;
        }

        @Override // com.max.hbimage.b.q
        public void a(@dl.e Drawable drawable) {
            if (PatchProxy.proxy(new Object[]{drawable}, this, changeQuickRedirect, false, 40671, new Class[]{Drawable.class}, Void.TYPE).isSupported || drawable == null) {
                return;
            }
            m mVar = m.this;
            QMUIRadiusImageView qMUIRadiusImageView = this.f90809b;
            if (drawable.getMinimumWidth() <= 0 || drawable.getMinimumHeight() <= 0) {
                return;
            }
            int iF = ViewUtils.f(mVar.g(), 100.0f);
            if (drawable.getMinimumWidth() < drawable.getMinimumHeight()) {
                qMUIRadiusImageView.getLayoutParams().width = (drawable.getMinimumWidth() * iF) / drawable.getMinimumHeight();
                qMUIRadiusImageView.getLayoutParams().height = iF;
            } else {
                qMUIRadiusImageView.getLayoutParams().width = iF;
                qMUIRadiusImageView.getLayoutParams().height = (iF * drawable.getMinimumHeight()) / drawable.getMinimumWidth();
            }
            qMUIRadiusImageView.setCornerRadius(ViewUtils.f(mVar.g(), 3.0f));
            qMUIRadiusImageView.setImageDrawable(drawable);
            qMUIRadiusImageView.setVisibility(0);
        }

        @Override // com.max.hbimage.b.q
        public /* synthetic */ void b(Drawable drawable) {
            com.max.hbimage.d.a(this, drawable);
        }

        @Override // com.max.hbimage.b.q
        public void onLoadFailed(@dl.e Drawable drawable) {
        }
    }

    public m(@dl.d Context mContext) {
        f0.p(mContext, "mContext");
        this.f90803a = mContext;
    }

    @Override // cb.c
    public /* bridge */ /* synthetic */ void b(s.e eVar, MallProductObj mallProductObj) {
        if (PatchProxy.proxy(new Object[]{eVar, mallProductObj}, this, changeQuickRedirect, false, 40666, new Class[]{s.e.class, Object.class}, Void.TYPE).isSupported) {
            return;
        }
        f(eVar, mallProductObj);
    }

    public void f(@dl.d s.e viewHolder, @dl.d MallProductObj data) {
        if (PatchProxy.proxy(new Object[]{viewHolder, data}, this, changeQuickRedirect, false, 40665, new Class[]{s.e.class, MallProductObj.class}, Void.TYPE).isSupported) {
            return;
        }
        f0.p(viewHolder, "viewHolder");
        f0.p(data, "data");
        CardView cardView = (CardView) viewHolder.i(R.id.cv_container);
        View viewI = viewHolder.i(R.id.v_stoke);
        QMUIRadiusImageView qMUIRadiusImageView = (QMUIRadiusImageView) viewHolder.i(R.id.iv_img);
        ImageView imageView = (ImageView) viewHolder.i(R.id.iv_bg);
        CardView cv_htag = (CardView) viewHolder.i(R.id.cv_htag);
        LinearLayout ll_htag = (LinearLayout) viewHolder.i(R.id.ll_htag);
        TextView textView = (TextView) viewHolder.i(R.id.tv_name);
        TextView currentPriceTextView = (TextView) viewHolder.i(R.id.tv_current_price);
        TextView originalPriceTextView = (TextView) viewHolder.i(R.id.tv_original_price);
        TextView tv_discount_info = (TextView) viewHolder.i(R.id.tv_discount_info);
        float fO = ViewUtils.o(this.f90803a, cardView);
        cardView.setRadius(fO);
        Context context = this.f90803a;
        viewI.setBackground(com.max.hbutils.utils.q.L(context, R.color.divider_secondary_1_color, 0.5f, ViewUtils.h0(context, fO)));
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(data.getName());
        SearchHelper.f91573a.a().h(spannableStringBuilder);
        textView.setText(spannableStringBuilder);
        if (data.getGame_info() != null) {
            com.max.hbimage.b.X(this.f90803a, qMUIRadiusImageView, data.getHead_image(), new b(qMUIRadiusImageView));
            imageView.setImageResource(R.drawable.sku_background_empty);
        } else {
            qMUIRadiusImageView.setVisibility(8);
            com.max.hbimage.b.K(data.getHead_image(), imageView);
        }
        a aVar = f90801b;
        Context context2 = this.f90803a;
        f0.o(currentPriceTextView, "currentPriceTextView");
        f0.o(originalPriceTextView, "originalPriceTextView");
        f0.o(tv_discount_info, "tv_discount_info");
        aVar.a(context2, data, currentPriceTextView, originalPriceTextView, tv_discount_info);
        Context context3 = this.f90803a;
        f0.o(cv_htag, "cv_htag");
        f0.o(ll_htag, "ll_htag");
        aVar.b(context3, data, cv_htag, ll_htag);
        Context context4 = this.f90803a;
        View view = viewHolder.itemView;
        f0.o(view, "viewHolder.itemView");
        aVar.c(context4, data, view);
    }

    @dl.d
    public final Context g() {
        return this.f90803a;
    }
}
