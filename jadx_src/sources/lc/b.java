package lc;

import androidx.recyclerview.widget.DiffUtil;
import com.max.hbexpression.bean.ExpressionPackViewObj;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.PatchProxyResult;
import kotlin.jvm.internal.f0;

/* JADX INFO: compiled from: ItemDiffCallbacks.kt */
/* JADX INFO: loaded from: classes10.dex */
public final class b extends DiffUtil.ItemCallback<ExpressionPackViewObj> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @dl.d
    public static final b f131303a = new b();
    public static ChangeQuickRedirect changeQuickRedirect;

    private b() {
    }

    public boolean a(@dl.d ExpressionPackViewObj oldItem, @dl.d ExpressionPackViewObj newItem) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{oldItem, newItem}, this, changeQuickRedirect, false, bb.c.g.f32765c2, new Class[]{ExpressionPackViewObj.class, ExpressionPackViewObj.class}, Boolean.TYPE);
        if (patchProxyResultProxy.isSupported) {
            return ((Boolean) patchProxyResultProxy.result).booleanValue();
        }
        f0.p(oldItem, "oldItem");
        f0.p(newItem, "newItem");
        return f0.g(oldItem, newItem);
    }

    @Override // androidx.recyclerview.widget.DiffUtil.ItemCallback
    public /* bridge */ /* synthetic */ boolean areContentsTheSame(ExpressionPackViewObj expressionPackViewObj, ExpressionPackViewObj expressionPackViewObj2) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{expressionPackViewObj, expressionPackViewObj2}, this, changeQuickRedirect, false, bb.c.g.f32805e2, new Class[]{Object.class, Object.class}, Boolean.TYPE);
        return patchProxyResultProxy.isSupported ? ((Boolean) patchProxyResultProxy.result).booleanValue() : a(expressionPackViewObj, expressionPackViewObj2);
    }

    @Override // androidx.recyclerview.widget.DiffUtil.ItemCallback
    public /* bridge */ /* synthetic */ boolean areItemsTheSame(ExpressionPackViewObj expressionPackViewObj, ExpressionPackViewObj expressionPackViewObj2) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{expressionPackViewObj, expressionPackViewObj2}, this, changeQuickRedirect, false, bb.c.g.f32785d2, new Class[]{Object.class, Object.class}, Boolean.TYPE);
        return patchProxyResultProxy.isSupported ? ((Boolean) patchProxyResultProxy.result).booleanValue() : b(expressionPackViewObj, expressionPackViewObj2);
    }

    public boolean b(@dl.d ExpressionPackViewObj oldItem, @dl.d ExpressionPackViewObj newItem) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{oldItem, newItem}, this, changeQuickRedirect, false, bb.c.g.f32745b2, new Class[]{ExpressionPackViewObj.class, ExpressionPackViewObj.class}, Boolean.TYPE);
        if (patchProxyResultProxy.isSupported) {
            return ((Boolean) patchProxyResultProxy.result).booleanValue();
        }
        f0.p(oldItem, "oldItem");
        f0.p(newItem, "newItem");
        return f0.g(oldItem.getPackGroupCode(), newItem.getPackGroupCode());
    }
}
