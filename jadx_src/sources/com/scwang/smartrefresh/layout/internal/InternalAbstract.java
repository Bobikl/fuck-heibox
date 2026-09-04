package com.scwang.smartrefresh.layout.internal;

import android.annotation.SuppressLint;
import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.widget.RelativeLayout;
import androidx.annotation.l;
import androidx.annotation.n0;
import androidx.annotation.p0;
import com.scwang.smartrefresh.layout.SmartRefreshLayout;
import com.scwang.smartrefresh.layout.constant.RefreshState;
import com.scwang.smartrefresh.layout.impl.RefreshFooterWrapper;
import com.scwang.smartrefresh.layout.impl.RefreshHeaderWrapper;
import ng.f;
import ng.g;
import ng.h;
import ng.i;
import ng.j;

/* JADX INFO: loaded from: classes8.dex */
public abstract class InternalAbstract extends RelativeLayout implements h {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    protected View f96764b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    protected og.b f96765c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    protected h f96766d;

    protected InternalAbstract(Context context, AttributeSet attributeSet, int i10) {
        super(context, attributeSet, i10);
    }

    /* JADX WARN: Multi-variable type inference failed */
    protected InternalAbstract(@n0 View view) {
        this(view, view instanceof h ? (h) view : null);
    }

    protected InternalAbstract(@n0 View view, @p0 h hVar) {
        super(view.getContext(), null, 0);
        this.f96764b = view;
        this.f96766d = hVar;
        if ((this instanceof RefreshFooterWrapper) && (hVar instanceof g) && hVar.getSpinnerStyle() == og.b.f132314h) {
            hVar.getView().setScaleY(-1.0f);
            return;
        }
        if (this instanceof RefreshHeaderWrapper) {
            h hVar2 = this.f96766d;
            if ((hVar2 instanceof f) && hVar2.getSpinnerStyle() == og.b.f132314h) {
                hVar.getView().setScaleY(-1.0f);
            }
        }
    }

    public void b(@n0 i iVar, int i10, int i11) {
        h hVar = this.f96766d;
        if (hVar != null && hVar != this) {
            hVar.b(iVar, i10, i11);
            return;
        }
        View view = this.f96764b;
        if (view != null) {
            ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
            if (layoutParams instanceof SmartRefreshLayout.LayoutParams) {
                iVar.a(this, ((SmartRefreshLayout.LayoutParams) layoutParams).f96630a);
            }
        }
    }

    public boolean equals(Object obj) {
        if (super.equals(obj)) {
            return true;
        }
        return (obj instanceof h) && getView() == ((h) obj).getView();
    }

    public int g(@n0 j jVar, boolean z10) {
        h hVar = this.f96766d;
        if (hVar == null || hVar == this) {
            return 0;
        }
        return hVar.g(jVar, z10);
    }

    @Override // ng.h
    @n0
    public og.b getSpinnerStyle() {
        int i10;
        og.b bVar = this.f96765c;
        if (bVar != null) {
            return bVar;
        }
        h hVar = this.f96766d;
        if (hVar != null && hVar != this) {
            return hVar.getSpinnerStyle();
        }
        View view = this.f96764b;
        if (view != null) {
            ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
            if (layoutParams instanceof SmartRefreshLayout.LayoutParams) {
                og.b bVar2 = ((SmartRefreshLayout.LayoutParams) layoutParams).f96631b;
                this.f96765c = bVar2;
                if (bVar2 != null) {
                    return bVar2;
                }
            }
            if (layoutParams != null && ((i10 = layoutParams.height) == 0 || i10 == -1)) {
                for (og.b bVar3 : og.b.f132315i) {
                    if (bVar3.f132318c) {
                        this.f96765c = bVar3;
                        return bVar3;
                    }
                }
            }
        }
        og.b bVar4 = og.b.f132310d;
        this.f96765c = bVar4;
        return bVar4;
    }

    @Override // ng.h
    @n0
    public View getView() {
        View view = this.f96764b;
        return view == null ? this : view;
    }

    public void h(float f10, int i10, int i11) {
        h hVar = this.f96766d;
        if (hVar == null || hVar == this) {
            return;
        }
        hVar.h(f10, i10, i11);
    }

    public boolean j() {
        h hVar = this.f96766d;
        return (hVar == null || hVar == this || !hVar.j()) ? false : true;
    }

    public void o(@n0 j jVar, int i10, int i11) {
        h hVar = this.f96766d;
        if (hVar == null || hVar == this) {
            return;
        }
        hVar.o(jVar, i10, i11);
    }

    public void p(@n0 j jVar, int i10, int i11) {
        h hVar = this.f96766d;
        if (hVar == null || hVar == this) {
            return;
        }
        hVar.p(jVar, i10, i11);
    }

    public void q(@n0 j jVar, @n0 RefreshState refreshState, @n0 RefreshState refreshState2) {
        h hVar = this.f96766d;
        if (hVar == null || hVar == this) {
            return;
        }
        if ((this instanceof RefreshFooterWrapper) && (hVar instanceof g)) {
            if (refreshState.isFooter) {
                refreshState = refreshState.toHeader();
            }
            if (refreshState2.isFooter) {
                refreshState2 = refreshState2.toHeader();
            }
        } else if ((this instanceof RefreshHeaderWrapper) && (hVar instanceof f)) {
            if (refreshState.isHeader) {
                refreshState = refreshState.toFooter();
            }
            if (refreshState2.isHeader) {
                refreshState2 = refreshState2.toFooter();
            }
        }
        h hVar2 = this.f96766d;
        if (hVar2 != null) {
            hVar2.q(jVar, refreshState, refreshState2);
        }
    }

    public void r(boolean z10, float f10, int i10, int i11, int i12) {
        h hVar = this.f96766d;
        if (hVar == null || hVar == this) {
            return;
        }
        hVar.r(z10, f10, i10, i11, i12);
    }

    @SuppressLint({"RestrictedApi"})
    public boolean setNoMoreData(boolean z10) {
        h hVar = this.f96766d;
        return (hVar instanceof f) && ((f) hVar).setNoMoreData(z10);
    }

    public void setPrimaryColors(@l int... iArr) {
        h hVar = this.f96766d;
        if (hVar == null || hVar == this) {
            return;
        }
        hVar.setPrimaryColors(iArr);
    }
}
