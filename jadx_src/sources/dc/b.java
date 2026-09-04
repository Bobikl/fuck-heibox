package dc;

import android.view.View;
import androidx.annotation.d0;
import androidx.recyclerview.widget.RecyclerView;
import bb.c;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.PatchProxyResult;
import dl.d;
import kotlin.jvm.internal.f0;

/* JADX INFO: compiled from: BaseViewHolder.kt */
/* JADX INFO: loaded from: classes10.dex */
public class b extends RecyclerView.ViewHolder {
    public static ChangeQuickRedirect changeQuickRedirect;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b(@d View item) {
        super(item);
        f0.p(item, "item");
    }

    @d
    public final <V extends View> V a(@d0 int i10) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{new Integer(i10)}, this, changeQuickRedirect, false, c.f.jm, new Class[]{Integer.TYPE}, View.class);
        if (patchProxyResultProxy.isSupported) {
            return (V) patchProxyResultProxy.result;
        }
        V v10 = (V) this.itemView.findViewById(i10);
        f0.o(v10, "findViewById(...)");
        return v10;
    }
}
