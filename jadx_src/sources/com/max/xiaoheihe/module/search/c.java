package com.max.xiaoheihe.module.search;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import androidx.cardview.widget.CardView;
import androidx.compose.runtime.internal.o;
import androidx.recyclerview.widget.RecyclerView;
import com.max.hbcommon.base.adapter.s;
import com.max.hbutils.utils.ViewUtils;
import com.max.xiaoheihe.R;
import com.max.xiaoheihe.bean.news.FeedsContentBaseObj;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import java.util.List;
import kotlin.jvm.internal.f0;

/* JADX INFO: compiled from: SearchNewsListAdapter.kt */
/* JADX INFO: loaded from: classes12.dex */
@o(parameters = 0)
public final class c extends com.max.xiaoheihe.module.news.adapter.a {
    public static ChangeQuickRedirect changeQuickRedirect = null;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public static final int f91629k = 8;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    @dl.d
    private Context f91630j;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c(@dl.d Context context, @dl.e List<? extends FeedsContentBaseObj> list) {
        super(context, list);
        f0.p(context, "context");
        this.f91630j = context;
    }

    @Override // com.max.xiaoheihe.module.news.adapter.a, com.max.hbcommon.base.adapter.s
    public /* bridge */ /* synthetic */ void onBindViewHolder(s.e eVar, Object obj) {
        if (PatchProxy.proxy(new Object[]{eVar, obj}, this, changeQuickRedirect, false, 42905, new Class[]{s.e.class, Object.class}, Void.TYPE).isSupported) {
            return;
        }
        p(eVar, (FeedsContentBaseObj) obj);
    }

    @Override // com.max.xiaoheihe.module.news.adapter.a
    public void p(@dl.d s.e viewHolder, @dl.d FeedsContentBaseObj data) {
        if (PatchProxy.proxy(new Object[]{viewHolder, data}, this, changeQuickRedirect, false, 42904, new Class[]{s.e.class, FeedsContentBaseObj.class}, Void.TYPE).isSupported) {
            return;
        }
        f0.p(viewHolder, "viewHolder");
        f0.p(data, "data");
        super.p(viewHolder, data);
        View viewB = viewHolder.b();
        int iF = ViewUtils.f(this.f91630j, 12.0f);
        if (viewB instanceof CardView) {
            CardView cardView = (CardView) viewB;
            if (cardView.getChildCount() > 0) {
                cardView.getChildAt(0).setBackgroundDrawable(this.f91630j.getResources().getDrawable(R.color.background_card_1_color));
                int iF2 = data == this.mDataList.get(getItemCount() - 1) ? iF : ViewUtils.f(this.f91630j, 4.0f);
                ViewGroup.LayoutParams layoutParams = cardView.getLayoutParams();
                f0.n(layoutParams, "null cannot be cast to non-null type androidx.recyclerview.widget.RecyclerView.LayoutParams");
                RecyclerView.LayoutParams layoutParams2 = (RecyclerView.LayoutParams) layoutParams;
                if (((ViewGroup.MarginLayoutParams) layoutParams2).leftMargin == iF && ((ViewGroup.MarginLayoutParams) layoutParams2).bottomMargin == iF2) {
                    return;
                }
                ((ViewGroup.MarginLayoutParams) layoutParams2).leftMargin = iF;
                ((ViewGroup.MarginLayoutParams) layoutParams2).rightMargin = iF;
                ((ViewGroup.MarginLayoutParams) layoutParams2).bottomMargin = iF2;
                cardView.setLayoutParams(layoutParams2);
            }
        }
    }

    @dl.d
    public final Context r() {
        return this.f91630j;
    }

    public final void s(@dl.d Context context) {
        if (PatchProxy.proxy(new Object[]{context}, this, changeQuickRedirect, false, 42903, new Class[]{Context.class}, Void.TYPE).isSupported) {
            return;
        }
        f0.p(context, "<set-?>");
        this.f91630j = context;
    }
}
