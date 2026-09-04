package nf;

import android.content.Context;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.compose.runtime.internal.o;
import com.max.hbcommon.base.adapter.s;
import com.max.hbcommon.bean.KeyDescObj;
import com.max.xiaoheihe.R;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import java.util.List;
import kotlin.jvm.internal.f0;

/* JADX INFO: compiled from: Dota2HeroKillAdapter.kt */
/* JADX INFO: loaded from: classes11.dex */
@o(parameters = 0)
public final class d extends s<KeyDescObj> {
    public static ChangeQuickRedirect changeQuickRedirect = null;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final int f132092e = 8;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @dl.d
    private final Context f132093b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final int f132094c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final int f132095d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d(@dl.d Context context, @dl.d List<KeyDescObj> list, int i10, int i11) {
        super(context, list, R.layout.item_dota2_hero_kill);
        f0.p(context, "context");
        f0.p(list, "list");
        this.f132093b = context;
        this.f132094c = i10;
        this.f132095d = i11;
    }

    @dl.d
    public final Context m() {
        return this.f132093b;
    }

    public final int n() {
        return this.f132095d;
    }

    public final int o() {
        return this.f132094c;
    }

    @Override // com.max.hbcommon.base.adapter.s
    public /* bridge */ /* synthetic */ void onBindViewHolder(s.e eVar, KeyDescObj keyDescObj) {
        if (PatchProxy.proxy(new Object[]{eVar, keyDescObj}, this, changeQuickRedirect, false, 35713, new Class[]{s.e.class, Object.class}, Void.TYPE).isSupported) {
            return;
        }
        p(eVar, keyDescObj);
    }

    public void p(@dl.e s.e eVar, @dl.d KeyDescObj data) {
        if (PatchProxy.proxy(new Object[]{eVar, data}, this, changeQuickRedirect, false, 35712, new Class[]{s.e.class, KeyDescObj.class}, Void.TYPE).isSupported) {
            return;
        }
        f0.p(data, "data");
        if (eVar != null) {
            View viewI = eVar.i(R.id.iv_icon);
            f0.o(viewI, "viewHolder.getView(R.id.iv_icon)");
            ImageView imageView = (ImageView) viewI;
            View viewI2 = eVar.i(R.id.tv_value);
            f0.o(viewI2, "viewHolder.getView(R.id.tv_value)");
            imageView.getLayoutParams().width = this.f132094c;
            imageView.getLayoutParams().height = this.f132095d;
            com.max.hbimage.b.K(data.getIcon(), imageView);
            ((TextView) viewI2).setText('X' + data.getNum());
        }
    }
}
