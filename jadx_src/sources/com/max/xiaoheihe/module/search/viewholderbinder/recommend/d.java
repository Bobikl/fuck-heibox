package com.max.xiaoheihe.module.search.viewholderbinder.recommend;

import android.view.View;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.compose.runtime.internal.o;
import com.google.android.flexbox.FlexboxLayout;
import com.max.hbcommon.base.adapter.s;
import com.max.hbcommon.bean.KeyDescObj;
import com.max.hbutils.utils.ViewUtils;
import com.max.xiaoheihe.R;
import com.max.xiaoheihe.bean.HeyBoxContentObj;
import com.max.xiaoheihe.bean.mall.MallGameInfoObj;
import com.max.xiaoheihe.bean.mall.MallProductObj;
import com.max.xiaoheihe.module.game.r1;
import com.max.xiaoheihe.module.game.z;
import com.max.xiaoheihe.module.mall.MallProductDetailActivity;
import com.max.xiaoheihe.utils.i0;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import java.util.ArrayList;
import kotlin.jvm.internal.f0;

/* JADX INFO: compiled from: SearchRecProduct.kt */
/* JADX INFO: loaded from: classes12.dex */
@o(parameters = 0)
public final class d extends g {
    public static ChangeQuickRedirect changeQuickRedirect;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final int f91850f = 0;

    /* JADX INFO: compiled from: SearchRecProduct.kt */
    public static final class a implements View.OnClickListener {
        public static ChangeQuickRedirect changeQuickRedirect;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ MallGameInfoObj f91851b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ d f91852c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        final /* synthetic */ String f91853d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        final /* synthetic */ String f91854e;

        a(MallGameInfoObj mallGameInfoObj, d dVar, String str, String str2) {
            this.f91851b = mallGameInfoObj;
            this.f91852c = dVar;
            this.f91853d = str;
            this.f91854e = str2;
        }

        @Override // android.view.View.OnClickListener
        public final void onClick(View view) {
            if (PatchProxy.proxy(new Object[]{view}, this, changeQuickRedirect, false, 43442, new Class[]{View.class}, Void.TYPE).isSupported) {
                return;
            }
            if (this.f91851b != null) {
                this.f91852c.i().startActivity(z.b(this.f91852c.i(), this.f91853d, this.f91851b.getAppid(), this.f91851b.getGame_type(), null, i0.m(), i0.j(), this.f91854e));
            } else {
                this.f91852c.i().startActivity(MallProductDetailActivity.n2(this.f91852c.i(), this.f91854e, this.f91853d));
            }
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d(@dl.d f param) {
        super(param);
        f0.p(param, "param");
    }

    @Override // com.max.xiaoheihe.module.search.viewholderbinder.recommend.g, cb.c
    public /* bridge */ /* synthetic */ void b(s.e eVar, HeyBoxContentObj heyBoxContentObj) {
        if (PatchProxy.proxy(new Object[]{eVar, heyBoxContentObj}, this, changeQuickRedirect, false, 43441, new Class[]{s.e.class, Object.class}, Void.TYPE).isSupported) {
            return;
        }
        f(eVar, heyBoxContentObj);
    }

    @Override // com.max.xiaoheihe.module.search.viewholderbinder.recommend.g
    public void f(@dl.d s.e viewHolder, @dl.d HeyBoxContentObj data) {
        KeyDescObj keyDescObj;
        if (PatchProxy.proxy(new Object[]{viewHolder, data}, this, changeQuickRedirect, false, 43440, new Class[]{s.e.class, HeyBoxContentObj.class}, Void.TYPE).isSupported) {
            return;
        }
        f0.p(viewHolder, "viewHolder");
        f0.p(data, "data");
        super.f(viewHolder, data);
        Object data2 = data.getData();
        f0.n(data2, "null cannot be cast to non-null type com.max.xiaoheihe.bean.mall.MallProductObj");
        MallProductObj mallProductObj = (MallProductObj) data2;
        ImageView imageView = (ImageView) viewHolder.i(R.id.iv_img);
        ImageView imageView2 = (ImageView) viewHolder.i(R.id.iv_game_bg);
        LinearLayout linearLayout = (LinearLayout) viewHolder.i(R.id.ll_htag);
        TextView textView = (TextView) viewHolder.i(R.id.tv_name);
        FlexboxLayout flexboxLayout = (FlexboxLayout) viewHolder.i(R.id.fl_tags);
        if (mallProductObj.getGame_info() != null) {
            imageView2.setVisibility(0);
            com.max.hbimage.b.d0(mallProductObj.getHead_image(), imageView2, ViewUtils.f(i(), 2.0f));
            imageView.setBackgroundResource(R.drawable.sku_background_empty);
        } else {
            imageView2.setVisibility(8);
            com.max.hbimage.b.K(mallProductObj.getHead_image(), imageView);
        }
        textView.setText(mallProductObj.getName());
        com.max.xiaoheihe.module.mall.e.p((TextView) viewHolder.i(R.id.tv_current_price), (TextView) viewHolder.i(R.id.tv_original_price), (TextView) viewHolder.i(R.id.tv_discount), mallProductObj);
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
        r1.y1(i(), linearLayout, keyDescObj, keyDescObj2);
        com.max.xiaoheihe.module.mall.e.q(flexboxLayout, arrayList, ViewUtils.L(i()) - ViewUtils.f(i(), 200.0f));
        viewHolder.b().setOnClickListener(new a(mallProductObj.getGame_info(), this, mallProductObj.getH_src(), mallProductObj.getSku_id()));
    }
}
