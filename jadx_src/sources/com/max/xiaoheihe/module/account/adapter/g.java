package com.max.xiaoheihe.module.account.adapter;

import android.content.Context;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.cardview.widget.CardView;
import androidx.compose.runtime.internal.o;
import com.max.hbcommon.base.adapter.s;
import com.max.hbutils.utils.ViewUtils;
import com.max.xiaoheihe.R;
import com.max.xiaoheihe.module.game.r1;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import java.util.List;
import kotlin.jvm.internal.f0;

/* JADX INFO: compiled from: PlatformAdapter.kt */
/* JADX INFO: loaded from: classes9.dex */
@o(parameters = 0)
public final class g extends s<String> {
    public static ChangeQuickRedirect changeQuickRedirect = null;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final int f78786e = 8;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @dl.d
    private final Context f78787b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final int f78788c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private boolean f78789d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public g(@dl.d Context mContext, @dl.e List<String> list, int i10) {
        super(mContext, list, R.layout.item_platform);
        f0.p(mContext, "mContext");
        this.f78787b = mContext;
        this.f78788c = i10;
    }

    public final boolean m() {
        return this.f78789d;
    }

    public final int n() {
        return this.f78788c;
    }

    public void o(@dl.d s.e viewHolder, @dl.d String data) {
        if (PatchProxy.proxy(new Object[]{viewHolder, data}, this, changeQuickRedirect, false, 24827, new Class[]{s.e.class, String.class}, Void.TYPE).isSupported) {
            return;
        }
        f0.p(viewHolder, "viewHolder");
        f0.p(data, "data");
        viewHolder.itemView.getLayoutParams().width = this.f78788c;
        ImageView imageView = (ImageView) viewHolder.i(R.id.iv_icon);
        CardView cardView = (CardView) viewHolder.i(R.id.card);
        TextView textView = (TextView) viewHolder.i(R.id.tv_name);
        View viewI = viewHolder.i(R.id.vg_drag);
        cardView.setRadius(ViewUtils.m(this.f78787b, ViewUtils.W(cardView), ViewUtils.f(this.f78787b, 66.0f)));
        imageView.setImageResource(r1.m0(data));
        imageView.setColorFilter(this.f78787b.getResources().getColor(R.color.text_primary_1_color));
        textView.setText(r1.r0(data));
        viewI.setVisibility(this.f78789d ? 0 : 8);
    }

    @Override // com.max.hbcommon.base.adapter.s
    public /* bridge */ /* synthetic */ void onBindViewHolder(s.e eVar, String str) {
        if (PatchProxy.proxy(new Object[]{eVar, str}, this, changeQuickRedirect, false, 24828, new Class[]{s.e.class, Object.class}, Void.TYPE).isSupported) {
            return;
        }
        o(eVar, str);
    }

    public final void p(boolean z10) {
        this.f78789d = z10;
    }
}
