package com.max.xiaoheihe.module.mall;

import android.content.Context;
import androidx.annotation.n0;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.a0;
import androidx.lifecycle.y;
import androidx.recyclerview.widget.RecyclerView;
import com.max.hbcommon.base.adapter.s;
import com.max.xiaoheihe.R;
import com.max.xiaoheihe.bean.mall.MallProductObj;
import com.max.xiaoheihe.module.game.adapter.v;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import java.util.List;

/* JADX INFO: compiled from: MallRecProductAdapter.java */
/* JADX INFO: loaded from: classes11.dex */
public class k extends s<MallProductObj> implements y {
    public static ChangeQuickRedirect changeQuickRedirect;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private Context f90795b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private a0 f90796c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private v<k> f90797d;

    public k(Context context, List<MallProductObj> list) {
        super(context, list, R.layout.item_mall_rec_product);
        this.f90796c = new a0(this);
        this.f90795b = context;
    }

    @Override // androidx.lifecycle.y
    @n0
    public Lifecycle getLifecycle() {
        return this.f90796c;
    }

    public void m(s.e eVar, MallProductObj mallProductObj) {
        if (PatchProxy.proxy(new Object[]{eVar, mallProductObj}, this, changeQuickRedirect, false, 40658, new Class[]{s.e.class, MallProductObj.class}, Void.TYPE).isSupported) {
            return;
        }
        new m(this.f90795b).f(eVar, mallProductObj);
        eVar.b().setTag(mallProductObj);
    }

    public void n() {
        v<k> vVar;
        if (PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 40659, new Class[0], Void.TYPE).isSupported || (vVar = this.f90797d) == null) {
            return;
        }
        vVar.q();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public void onAttachedToRecyclerView(@n0 RecyclerView recyclerView) {
        if (PatchProxy.proxy(new Object[]{recyclerView}, this, changeQuickRedirect, false, 40660, new Class[]{RecyclerView.class}, Void.TYPE).isSupported) {
            return;
        }
        super.onAttachedToRecyclerView(recyclerView);
        this.f90796c.l(Lifecycle.Event.ON_RESUME);
        this.f90797d = new v<>(this, recyclerView, false);
    }

    @Override // com.max.hbcommon.base.adapter.s
    public /* bridge */ /* synthetic */ void onBindViewHolder(s.e eVar, MallProductObj mallProductObj) {
        if (PatchProxy.proxy(new Object[]{eVar, mallProductObj}, this, changeQuickRedirect, false, 40662, new Class[]{s.e.class, Object.class}, Void.TYPE).isSupported) {
            return;
        }
        m(eVar, mallProductObj);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public void onDetachedFromRecyclerView(@n0 RecyclerView recyclerView) {
        if (PatchProxy.proxy(new Object[]{recyclerView}, this, changeQuickRedirect, false, 40661, new Class[]{RecyclerView.class}, Void.TYPE).isSupported) {
            return;
        }
        super.onDetachedFromRecyclerView(recyclerView);
        this.f90796c.l(Lifecycle.Event.ON_DESTROY);
    }
}
