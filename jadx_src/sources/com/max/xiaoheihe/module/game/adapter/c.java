package com.max.xiaoheihe.module.game.adapter;

import android.content.Context;
import android.text.TextUtils;
import android.widget.TextView;
import com.max.hbcustomview.ProgressBgView;
import com.max.xiaoheihe.R;
import com.max.xiaoheihe.bean.game.CoffeeDialogProgressObj;
import com.max.xiaoheihe.module.trade.TradeInfoUtilKt;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import java.util.List;

/* JADX INFO: compiled from: CoffeeDialogProgressAdapter.kt */
/* JADX INFO: loaded from: classes11.dex */
@androidx.compose.runtime.internal.o(parameters = 0)
public final class c extends com.max.hbcommon.base.adapter.s<CoffeeDialogProgressObj> {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final int f85655c = 8;
    public static ChangeQuickRedirect changeQuickRedirect;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @dl.d
    private Context f85656b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c(@dl.d Context mContext, @dl.d List<CoffeeDialogProgressObj> list) {
        super(mContext, list, R.layout.item_coffee_progress);
        kotlin.jvm.internal.f0.p(mContext, "mContext");
        kotlin.jvm.internal.f0.p(list, "list");
        this.f85656b = mContext;
    }

    @dl.d
    public final Context m() {
        return this.f85656b;
    }

    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    public void n(@dl.e com.max.hbcommon.base.adapter.s.e eVar, @dl.e CoffeeDialogProgressObj coffeeDialogProgressObj) {
        if (PatchProxy.proxy(new Object[]{eVar, coffeeDialogProgressObj}, this, changeQuickRedirect, false, 35521, new Class[]{com.max.hbcommon.base.adapter.s.e.class, CoffeeDialogProgressObj.class}, Void.TYPE).isSupported || coffeeDialogProgressObj == null) {
            return;
        }
        TextView textView = eVar != null ? (TextView) eVar.i(R.id.tv_progress_0) : null;
        TextView textView2 = eVar != null ? (TextView) eVar.i(R.id.tv_progress_desc_0) : null;
        TextView textView3 = eVar != null ? (TextView) eVar.i(R.id.tv_progress_checked_0) : null;
        ProgressBgView progressBgView = eVar != null ? (ProgressBgView) eVar.i(R.id.pb_0) : null;
        if (textView != null) {
            textView.setText(coffeeDialogProgressObj.getTitle());
        }
        String state = coffeeDialogProgressObj.getState();
        if (state != null) {
            switch (state.hashCode()) {
                case 48:
                    if (state.equals("0")) {
                        if (textView2 != null) {
                            textView2.setText(R.string.wait);
                        }
                        if (textView2 != null) {
                            textView2.setTextColor(this.f85656b.getResources().getColor(R.color.text_secondary_2_color));
                        }
                        if (textView != null) {
                            textView.setTextColor(this.f85656b.getResources().getColor(R.color.text_secondary_1_color));
                        }
                        if (progressBgView != null) {
                            progressBgView.setBackgroundResource(R.color.divider_secondary_2_color);
                        }
                        if (textView3 != null) {
                            textView3.setVisibility(8);
                            return;
                        }
                        return;
                    }
                    break;
                case 49:
                    if (state.equals("1")) {
                        if (textView2 != null) {
                            textView2.setText(R.string.doing);
                        }
                        if (textView2 != null) {
                            textView2.setTextColor(this.f85656b.getResources().getColor(R.color.text_primary_1_color));
                        }
                        if (textView != null) {
                            textView.setTextColor(this.f85656b.getResources().getColor(R.color.text_primary_1_color));
                        }
                        TradeInfoUtilKt.F(progressBgView);
                        if (textView3 != null) {
                            textView3.setVisibility(8);
                            return;
                        }
                        return;
                    }
                    break;
                case 50:
                    if (state.equals("2")) {
                        if (textView2 != null) {
                            textView2.setText(R.string.complete);
                        }
                        if (textView2 != null) {
                            textView2.setTextColor(this.f85656b.getResources().getColor(R.color.text_primary_1_color));
                        }
                        if (textView != null) {
                            textView.setTextColor(this.f85656b.getResources().getColor(R.color.text_primary_1_color));
                        }
                        if (progressBgView != null) {
                            progressBgView.setBackgroundResource(R.color.text_primary_1_color);
                        }
                        if (progressBgView != null) {
                            progressBgView.c();
                        }
                        if (textView3 != null) {
                            textView3.setVisibility(0);
                            return;
                        }
                        return;
                    }
                    break;
            }
        }
        if (TextUtils.isEmpty(coffeeDialogProgressObj.getFailedStr())) {
            if (textView2 != null) {
                textView2.setText(R.string.overtime);
            }
        } else if (textView2 != null) {
            textView2.setText(coffeeDialogProgressObj.getFailedStr());
        }
        if (textView2 != null) {
            textView2.setTextColor(this.f85656b.getResources().getColor(R.color.badge_bg_color));
        }
        if (textView != null) {
            textView.setTextColor(this.f85656b.getResources().getColor(R.color.badge_bg_color));
        }
        TradeInfoUtilKt.G(progressBgView);
        if (textView3 != null) {
            textView3.setVisibility(8);
        }
    }

    public final void o(@dl.d Context context) {
        if (PatchProxy.proxy(new Object[]{context}, this, changeQuickRedirect, false, 35520, new Class[]{Context.class}, Void.TYPE).isSupported) {
            return;
        }
        kotlin.jvm.internal.f0.p(context, "<set-?>");
        this.f85656b = context;
    }

    @Override // com.max.hbcommon.base.adapter.s
    public /* bridge */ /* synthetic */ void onBindViewHolder(com.max.hbcommon.base.adapter.s.e eVar, CoffeeDialogProgressObj coffeeDialogProgressObj) {
        if (PatchProxy.proxy(new Object[]{eVar, coffeeDialogProgressObj}, this, changeQuickRedirect, false, 35522, new Class[]{com.max.hbcommon.base.adapter.s.e.class, Object.class}, Void.TYPE).isSupported) {
            return;
        }
        n(eVar, coffeeDialogProgressObj);
    }
}
