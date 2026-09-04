package nf;

import android.content.Context;
import android.view.View;
import android.widget.ImageView;
import androidx.cardview.widget.CardView;
import androidx.compose.runtime.internal.o;
import com.max.hbcommon.base.adapter.s;
import com.max.hbutils.utils.ViewUtils;
import com.max.xiaoheihe.R;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import java.util.List;
import kotlin.jvm.internal.f0;

/* JADX INFO: compiled from: Dota2EquipAdapter.kt */
/* JADX INFO: loaded from: classes11.dex */
@o(parameters = 0)
public final class b extends s<String> {
    public static ChangeQuickRedirect changeQuickRedirect = null;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final int f132086e = 8;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @dl.d
    private final Context f132087b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final int f132088c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final int f132089d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b(@dl.d Context context, @dl.d List<String> list, int i10, int i11) {
        super(context, list, R.layout.item_equip);
        f0.p(context, "context");
        f0.p(list, "list");
        this.f132087b = context;
        this.f132088c = i10;
        this.f132089d = i11;
    }

    @dl.d
    public final Context m() {
        return this.f132087b;
    }

    public final int n() {
        return this.f132089d;
    }

    public final int o() {
        return this.f132088c;
    }

    @Override // com.max.hbcommon.base.adapter.s
    public /* bridge */ /* synthetic */ void onBindViewHolder(s.e eVar, String str) {
        if (PatchProxy.proxy(new Object[]{eVar, str}, this, changeQuickRedirect, false, 35709, new Class[]{s.e.class, Object.class}, Void.TYPE).isSupported) {
            return;
        }
        p(eVar, str);
    }

    public void p(@dl.e s.e eVar, @dl.e String str) {
        if (PatchProxy.proxy(new Object[]{eVar, str}, this, changeQuickRedirect, false, 35708, new Class[]{s.e.class, String.class}, Void.TYPE).isSupported || eVar == null) {
            return;
        }
        View view = eVar.itemView;
        f0.n(view, "null cannot be cast to non-null type androidx.cardview.widget.CardView");
        CardView cardView = (CardView) view;
        View viewI = eVar.i(R.id.iv_equip);
        f0.o(viewI, "viewHolder.getView(R.id.iv_equip)");
        ImageView imageView = (ImageView) viewI;
        cardView.getLayoutParams().width = this.f132088c;
        cardView.getLayoutParams().height = this.f132089d;
        cardView.setRadius(ViewUtils.p(this.f132087b, cardView, ViewUtils.ViewType.IMAGE));
        imageView.setVisibility(com.max.hbcommon.utils.c.u(str) ? 8 : 0);
        com.max.hbimage.b.K(str, imageView);
    }
}
