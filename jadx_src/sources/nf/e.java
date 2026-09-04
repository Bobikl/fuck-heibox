package nf;

import android.content.Context;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.compose.runtime.internal.o;
import com.max.hbcommon.base.adapter.s;
import com.max.hbcommon.bean.KeyDescObj;
import com.max.hbutils.utils.ViewUtils;
import com.max.hbutils.utils.q;
import com.max.xiaoheihe.R;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import java.util.List;
import kotlin.jvm.internal.f0;

/* JADX INFO: compiled from: Dota2SkillUpAdapter.kt */
/* JADX INFO: loaded from: classes11.dex */
@o(parameters = 0)
public final class e extends s<KeyDescObj> {
    public static ChangeQuickRedirect changeQuickRedirect = null;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final int f132096d = 8;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @dl.d
    private final Context f132097b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private int f132098c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public e(@dl.d Context context, @dl.d List<KeyDescObj> list) {
        super(context, list, R.layout.item_hero_skill_up);
        f0.p(context, "context");
        f0.p(list, "list");
        this.f132097b = context;
        this.f132098c = (ViewUtils.L(context) - ViewUtils.f(context, 64.0f)) / 11;
    }

    @dl.d
    public final Context m() {
        return this.f132097b;
    }

    public final int n() {
        return this.f132098c;
    }

    public void o(@dl.e s.e eVar, @dl.d KeyDescObj data) {
        boolean z10 = true;
        if (PatchProxy.proxy(new Object[]{eVar, data}, this, changeQuickRedirect, false, 35714, new Class[]{s.e.class, KeyDescObj.class}, Void.TYPE).isSupported) {
            return;
        }
        f0.p(data, "data");
        if (eVar != null) {
            eVar.itemView.getLayoutParams().width = this.f132098c;
            eVar.itemView.getLayoutParams().height = this.f132098c;
            View viewI = eVar.i(R.id.iv_icon);
            f0.o(viewI, "viewHolder.getView(R.id.iv_icon)");
            View viewI2 = eVar.i(R.id.tv_level);
            f0.o(viewI2, "viewHolder.getView(R.id.tv_level)");
            TextView textView = (TextView) viewI2;
            com.max.hbimage.b.K(data.getIcon(), (ImageView) viewI);
            String value = data.getValue();
            if (value != null && value.length() != 0) {
                z10 = false;
            }
            if (z10) {
                textView.setVisibility(8);
                return;
            }
            textView.setVisibility(0);
            textView.setText(data.getValue());
            textView.setBackground(q.q(this.f132097b, R.color.black_alpha60, q.I(4.0f, 9)));
        }
    }

    @Override // com.max.hbcommon.base.adapter.s
    public /* bridge */ /* synthetic */ void onBindViewHolder(s.e eVar, KeyDescObj keyDescObj) {
        if (PatchProxy.proxy(new Object[]{eVar, keyDescObj}, this, changeQuickRedirect, false, 35715, new Class[]{s.e.class, Object.class}, Void.TYPE).isSupported) {
            return;
        }
        o(eVar, keyDescObj);
    }

    public final void p(int i10) {
        this.f132098c = i10;
    }
}
