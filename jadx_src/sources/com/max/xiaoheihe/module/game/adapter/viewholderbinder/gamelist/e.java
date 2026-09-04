package com.max.xiaoheihe.module.game.adapter.viewholderbinder.gamelist;

import android.content.Context;
import android.view.View;
import androidx.compose.runtime.internal.o;
import com.max.hbcommon.base.adapter.s;
import com.max.hbsearch.SearchNewActivity;
import com.max.xiaoheihe.R;
import com.max.xiaoheihe.bean.game.GameObj;
import com.max.xiaoheihe.module.game.a2;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import java.util.List;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.jvm.internal.f0;

/* JADX INFO: compiled from: GameListViewHolderBinder.kt */
/* JADX INFO: loaded from: classes11.dex */
@o(parameters = 0)
public abstract class e extends cb.c<GameObj> {
    public static ChangeQuickRedirect changeQuickRedirect = null;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final int f86392f = 8;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @dl.d
    private d f86393a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @dl.d
    private Context f86394b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @dl.d
    private s<?> f86395c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @dl.e
    private a2 f86396d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    @dl.e
    private String f86397e;

    public e(@dl.d d param) {
        f0.p(param, "param");
        this.f86393a = param;
        this.f86394b = param.i();
        this.f86395c = this.f86393a.h();
        this.f86396d = this.f86393a.j();
        this.f86397e = this.f86393a.k();
    }

    private final void g(s.e eVar, GameObj gameObj) {
        View viewI;
        if (PatchProxy.proxy(new Object[]{eVar, gameObj}, this, changeQuickRedirect, false, 36232, new Class[]{s.e.class, GameObj.class}, Void.TYPE).isSupported || (viewI = eVar.i(R.id.divider)) == null) {
            return;
        }
        if (this.f86394b instanceof SearchNewActivity) {
            Boolean showDivider = gameObj.getShowDivider();
            f0.o(showDivider, "data.showDivider");
            if (showDivider.booleanValue() && this.f86393a.l()) {
                viewI.setVisibility(0);
                return;
            }
        }
        viewI.setVisibility(8);
    }

    @Override // cb.c
    public /* bridge */ /* synthetic */ void b(s.e eVar, GameObj gameObj) {
        if (PatchProxy.proxy(new Object[]{eVar, gameObj}, this, changeQuickRedirect, false, 36234, new Class[]{s.e.class, Object.class}, Void.TYPE).isSupported) {
            return;
        }
        f(eVar, gameObj);
    }

    public void f(@dl.d s.e viewHolder, @dl.d GameObj data) {
        if (PatchProxy.proxy(new Object[]{viewHolder, data}, this, changeQuickRedirect, false, 36231, new Class[]{s.e.class, GameObj.class}, Void.TYPE).isSupported) {
            return;
        }
        f0.p(viewHolder, "viewHolder");
        f0.p(data, "data");
        n(viewHolder, data);
        h(viewHolder, data);
        g(viewHolder, data);
    }

    public abstract void h(@dl.d s.e eVar, @dl.d GameObj gameObj);

    @dl.d
    public final s<?> i() {
        return this.f86395c;
    }

    @dl.d
    public final Context j() {
        return this.f86394b;
    }

    @dl.e
    public final a2 k() {
        return this.f86396d;
    }

    @dl.e
    public final String l() {
        return this.f86397e;
    }

    @dl.d
    public final d m() {
        return this.f86393a;
    }

    public final void n(@dl.d s.e viewHolder, @dl.d GameObj data) {
        if (PatchProxy.proxy(new Object[]{viewHolder, data}, this, changeQuickRedirect, false, 36233, new Class[]{s.e.class, GameObj.class}, Void.TYPE).isSupported) {
            return;
        }
        f0.p(viewHolder, "viewHolder");
        f0.p(data, "data");
        StringBuilder sb2 = new StringBuilder();
        List<?> dataList = this.f86395c.getDataList();
        f0.o(dataList, "adapter.dataList");
        sb2.append(CollectionsKt___CollectionsKt.Y2(dataList, data));
        sb2.append("");
        data.setIndex(sb2.toString());
        viewHolder.itemView.setTag(data);
    }

    public final void o(@dl.d s<?> sVar) {
        if (PatchProxy.proxy(new Object[]{sVar}, this, changeQuickRedirect, false, 36230, new Class[]{s.class}, Void.TYPE).isSupported) {
            return;
        }
        f0.p(sVar, "<set-?>");
        this.f86395c = sVar;
    }

    public final void p(@dl.d Context context) {
        if (PatchProxy.proxy(new Object[]{context}, this, changeQuickRedirect, false, 36229, new Class[]{Context.class}, Void.TYPE).isSupported) {
            return;
        }
        f0.p(context, "<set-?>");
        this.f86394b = context;
    }

    public final void q(@dl.e a2 a2Var) {
        this.f86396d = a2Var;
    }

    public final void r(@dl.e String str) {
        this.f86397e = str;
    }

    public final void s(@dl.d d dVar) {
        if (PatchProxy.proxy(new Object[]{dVar}, this, changeQuickRedirect, false, 36228, new Class[]{d.class}, Void.TYPE).isSupported) {
            return;
        }
        f0.p(dVar, "<set-?>");
        this.f86393a = dVar;
    }
}
