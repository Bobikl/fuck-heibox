package lc;

import androidx.recyclerview.widget.DiffUtil;
import com.max.hbexpression.bean.ExpressionObj;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.PatchProxyResult;
import kotlin.jvm.internal.f0;

/* JADX INFO: compiled from: ItemDiffCallbacks.kt */
/* JADX INFO: loaded from: classes10.dex */
public final class a extends DiffUtil.ItemCallback<ExpressionObj> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @dl.d
    public static final a f131302a = new a();
    public static ChangeQuickRedirect changeQuickRedirect;

    private a() {
    }

    public boolean a(@dl.d ExpressionObj oldItem, @dl.d ExpressionObj newItem) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{oldItem, newItem}, this, changeQuickRedirect, false, bb.c.g.Y1, new Class[]{ExpressionObj.class, ExpressionObj.class}, Boolean.TYPE);
        if (patchProxyResultProxy.isSupported) {
            return ((Boolean) patchProxyResultProxy.result).booleanValue();
        }
        f0.p(oldItem, "oldItem");
        f0.p(newItem, "newItem");
        return f0.g(oldItem.getUrl(), newItem.getUrl()) && oldItem.getResId() == newItem.getResId() && oldItem.getType() == newItem.getType();
    }

    @Override // androidx.recyclerview.widget.DiffUtil.ItemCallback
    public /* bridge */ /* synthetic */ boolean areContentsTheSame(ExpressionObj expressionObj, ExpressionObj expressionObj2) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{expressionObj, expressionObj2}, this, changeQuickRedirect, false, bb.c.g.f32725a2, new Class[]{Object.class, Object.class}, Boolean.TYPE);
        return patchProxyResultProxy.isSupported ? ((Boolean) patchProxyResultProxy.result).booleanValue() : a(expressionObj, expressionObj2);
    }

    @Override // androidx.recyclerview.widget.DiffUtil.ItemCallback
    public /* bridge */ /* synthetic */ boolean areItemsTheSame(ExpressionObj expressionObj, ExpressionObj expressionObj2) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{expressionObj, expressionObj2}, this, changeQuickRedirect, false, bb.c.g.Z1, new Class[]{Object.class, Object.class}, Boolean.TYPE);
        return patchProxyResultProxy.isSupported ? ((Boolean) patchProxyResultProxy.result).booleanValue() : b(expressionObj, expressionObj2);
    }

    public boolean b(@dl.d ExpressionObj oldItem, @dl.d ExpressionObj newItem) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{oldItem, newItem}, this, changeQuickRedirect, false, bb.c.g.X1, new Class[]{ExpressionObj.class, ExpressionObj.class}, Boolean.TYPE);
        if (patchProxyResultProxy.isSupported) {
            return ((Boolean) patchProxyResultProxy.result).booleanValue();
        }
        f0.p(oldItem, "oldItem");
        f0.p(newItem, "newItem");
        return f0.g(oldItem.getName(), newItem.getName()) && f0.g(oldItem.getEmoji_key(), newItem.getEmoji_key());
    }
}
