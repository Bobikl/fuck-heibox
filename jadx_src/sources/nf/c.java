package nf;

import android.content.Context;
import android.view.View;
import android.widget.TextView;
import androidx.compose.runtime.internal.o;
import com.max.hbcommon.base.adapter.s;
import com.max.hbcommon.bean.KeyDescObj;
import com.max.xiaoheihe.R;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import java.util.List;
import kotlin.jvm.internal.f0;

/* JADX INFO: compiled from: Dota2HeroDataAdapter.kt */
/* JADX INFO: loaded from: classes11.dex */
@o(parameters = 0)
public final class c extends s<KeyDescObj> {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final int f132090c = 8;
    public static ChangeQuickRedirect changeQuickRedirect;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @dl.d
    private final Context f132091b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c(@dl.d Context context, @dl.d List<KeyDescObj> list) {
        super(context, list, R.layout.item_dota2_hero_data);
        f0.p(context, "context");
        f0.p(list, "list");
        this.f132091b = context;
    }

    @dl.d
    public final Context m() {
        return this.f132091b;
    }

    public void n(@dl.e s.e eVar, @dl.d KeyDescObj data) {
        if (PatchProxy.proxy(new Object[]{eVar, data}, this, changeQuickRedirect, false, 35710, new Class[]{s.e.class, KeyDescObj.class}, Void.TYPE).isSupported) {
            return;
        }
        f0.p(data, "data");
        if (eVar != null) {
            View viewI = eVar.i(R.id.tv_desc);
            f0.o(viewI, "viewHolder.getView(R.id.tv_desc)");
            View viewI2 = eVar.i(R.id.tv_value);
            f0.o(viewI2, "viewHolder.getView(R.id.tv_value)");
            TextView textView = (TextView) viewI2;
            ((TextView) viewI).setText(data.getDesc() + ':');
            textView.setText(data.getValue());
            textView.setTextColor(!com.max.hbcommon.utils.c.u(data.getColor()) ? com.max.xiaoheihe.utils.d.e1(data.getColor()) : com.max.xiaoheihe.utils.d.E(R.color.white_alpha80));
        }
    }

    @Override // com.max.hbcommon.base.adapter.s
    public /* bridge */ /* synthetic */ void onBindViewHolder(s.e eVar, KeyDescObj keyDescObj) {
        if (PatchProxy.proxy(new Object[]{eVar, keyDescObj}, this, changeQuickRedirect, false, 35711, new Class[]{s.e.class, Object.class}, Void.TYPE).isSupported) {
            return;
        }
        n(eVar, keyDescObj);
    }
}
