package com.max.xiaoheihe.module.game.adapter.overview;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.compose.runtime.internal.o;
import com.max.hbcommon.base.adapter.s;
import com.max.hbutils.utils.ViewUtils;
import com.max.hbutils.utils.q;
import com.max.xiaoheihe.R;
import com.max.xiaoheihe.bean.game.gameoverview.CareerRecordObj;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import dl.e;
import java.util.List;
import kotlin.jvm.internal.f0;

/* JADX INFO: compiled from: GameCareerRecordAdapter.kt */
/* JADX INFO: loaded from: classes11.dex */
@o(parameters = 0)
public final class a extends s<CareerRecordObj> {
    public static ChangeQuickRedirect changeQuickRedirect = null;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final int f85757d = 8;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @dl.d
    private final Context f85758b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @dl.d
    private List<CareerRecordObj> f85759c;

    /* JADX INFO: renamed from: com.max.xiaoheihe.module.game.adapter.overview.a$a, reason: collision with other inner class name */
    /* JADX INFO: compiled from: GameCareerRecordAdapter.kt */
    public static final class ViewOnClickListenerC0763a implements View.OnClickListener {
        public static ChangeQuickRedirect changeQuickRedirect;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ CareerRecordObj f85761c;

        ViewOnClickListenerC0763a(CareerRecordObj careerRecordObj) {
            this.f85761c = careerRecordObj;
        }

        @Override // android.view.View.OnClickListener
        public final void onClick(View view) {
            if (PatchProxy.proxy(new Object[]{view}, this, changeQuickRedirect, false, 35719, new Class[]{View.class}, Void.TYPE).isSupported) {
                return;
            }
            com.max.xiaoheihe.base.router.b.k0(a.this.m(), this.f85761c.getProtocol());
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a(@dl.d Context context, @dl.d List<CareerRecordObj> list) {
        super(context, list, R.layout.item_career_record);
        f0.p(context, "context");
        f0.p(list, "list");
        this.f85758b = context;
        this.f85759c = list;
    }

    @dl.d
    public final Context m() {
        return this.f85758b;
    }

    @dl.d
    public final List<CareerRecordObj> n() {
        return this.f85759c;
    }

    public void o(@e s.e eVar, @e CareerRecordObj careerRecordObj) {
        if (PatchProxy.proxy(new Object[]{eVar, careerRecordObj}, this, changeQuickRedirect, false, 35717, new Class[]{s.e.class, CareerRecordObj.class}, Void.TYPE).isSupported || eVar == null || careerRecordObj == null) {
            return;
        }
        View viewI = eVar.i(R.id.iv_bg);
        f0.o(viewI, "viewHolder.getView(R.id.iv_bg)");
        View viewI2 = eVar.i(R.id.vg_container);
        f0.o(viewI2, "viewHolder.getView(R.id.vg_container)");
        ViewGroup viewGroup = (ViewGroup) viewI2;
        View viewI3 = eVar.i(R.id.iv_icon);
        f0.o(viewI3, "viewHolder.getView(R.id.iv_icon)");
        ImageView imageView = (ImageView) viewI3;
        View viewI4 = eVar.i(R.id.tv_value);
        f0.o(viewI4, "viewHolder.getView(R.id.tv_value)");
        TextView textView = (TextView) viewI4;
        View viewI5 = eVar.i(R.id.tv_desc);
        f0.o(viewI5, "viewHolder.getView(R.id.tv_desc)");
        TextView textView2 = (TextView) viewI5;
        textView.setText(careerRecordObj.getValue());
        textView2.setText(careerRecordObj.getDesc());
        com.max.hbimage.b.K(careerRecordObj.getBg(), (ImageView) viewI);
        if (com.max.hbcommon.utils.c.u(careerRecordObj.getIcon())) {
            viewGroup.setBackgroundColor(com.max.xiaoheihe.utils.d.e1(careerRecordObj.getColor()));
            imageView.setVisibility(8);
            ViewGroup.LayoutParams layoutParams = textView.getLayoutParams();
            f0.n(layoutParams, "null cannot be cast to non-null type android.view.ViewGroup.MarginLayoutParams");
            ((ViewGroup.MarginLayoutParams) layoutParams).topMargin = 0;
            textView.setTextSize(1, 20.0f);
            ViewGroup.LayoutParams layoutParams2 = textView2.getLayoutParams();
            f0.n(layoutParams2, "null cannot be cast to non-null type android.view.ViewGroup.MarginLayoutParams");
            ((ViewGroup.MarginLayoutParams) layoutParams2).topMargin = ViewUtils.f(this.f85758b, 13.0f);
            textView2.setTextColor(com.max.xiaoheihe.utils.d.F(this.f85758b, R.color.white_alpha80));
        } else {
            viewGroup.setBackground(q.i(this.f85758b, R.color.white_alpha2, R.color.white_alpha5, 0.5f, 5.0f));
            imageView.setVisibility(0);
            com.max.hbimage.b.K(careerRecordObj.getIcon(), imageView);
            ViewGroup.LayoutParams layoutParams3 = textView.getLayoutParams();
            f0.n(layoutParams3, "null cannot be cast to non-null type android.view.ViewGroup.MarginLayoutParams");
            ((ViewGroup.MarginLayoutParams) layoutParams3).topMargin = ViewUtils.f(this.f85758b, 9.0f);
            textView.setTextSize(1, 16.0f);
            ViewGroup.LayoutParams layoutParams4 = textView2.getLayoutParams();
            f0.n(layoutParams4, "null cannot be cast to non-null type android.view.ViewGroup.MarginLayoutParams");
            ((ViewGroup.MarginLayoutParams) layoutParams4).topMargin = ViewUtils.f(this.f85758b, 8.0f);
            textView2.setTextColor(com.max.xiaoheihe.utils.d.F(this.f85758b, R.color.white_alpha30));
        }
        eVar.itemView.setOnClickListener(new ViewOnClickListenerC0763a(careerRecordObj));
    }

    @Override // com.max.hbcommon.base.adapter.s
    public /* bridge */ /* synthetic */ void onBindViewHolder(s.e eVar, CareerRecordObj careerRecordObj) {
        if (PatchProxy.proxy(new Object[]{eVar, careerRecordObj}, this, changeQuickRedirect, false, 35718, new Class[]{s.e.class, Object.class}, Void.TYPE).isSupported) {
            return;
        }
        o(eVar, careerRecordObj);
    }

    public final void p(@dl.d List<CareerRecordObj> list) {
        if (PatchProxy.proxy(new Object[]{list}, this, changeQuickRedirect, false, 35716, new Class[]{List.class}, Void.TYPE).isSupported) {
            return;
        }
        f0.p(list, "<set-?>");
        this.f85759c = list;
    }
}
