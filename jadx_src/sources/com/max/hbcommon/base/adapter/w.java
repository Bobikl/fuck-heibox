package com.max.hbcommon.base.adapter;

import android.annotation.SuppressLint;
import android.content.Context;
import android.graphics.Rect;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.DecelerateInterpolator;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.annotation.n0;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.max.hbcommon.R;
import com.max.hbutils.utils.ViewUtils;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.PatchProxyResult;

/* JADX INFO: compiled from: RVSeeMoreAdapter.java */
/* JADX INFO: loaded from: classes9.dex */
public class w extends RecyclerView.Adapter<s.e> {
    public static ChangeQuickRedirect changeQuickRedirect;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private s f66835b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private Context f66836c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private boolean f66837d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final int f66838e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private s.e f66839f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    boolean f66840g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    RecyclerView f66841h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private View.OnClickListener f66842i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private int f66843j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private int f66844k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private int f66845l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private int f66846m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private int f66847n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    private int f66848o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    private String f66849p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    private String f66850q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    private boolean f66851r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    private int f66852s;

    /* JADX INFO: compiled from: RVSeeMoreAdapter.java */
    public class a implements View.OnTouchListener {
        public static ChangeQuickRedirect changeQuickRedirect;

        a() {
        }

        @Override // android.view.View.OnTouchListener
        public boolean onTouch(View view, MotionEvent motionEvent) {
            PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{view, motionEvent}, this, changeQuickRedirect, false, bb.c.d.T0, new Class[]{View.class, MotionEvent.class}, Boolean.TYPE);
            if (patchProxyResultProxy.isSupported) {
                return ((Boolean) patchProxyResultProxy.result).booleanValue();
            }
            if (motionEvent.getAction() == 1) {
                int iM = w.m(w.this);
                if (iM > w.this.f66843j) {
                    w wVar = w.this;
                    wVar.u(iM - wVar.f66843j);
                }
                if (w.o(w.this)) {
                    w.p(w.this);
                }
            }
            return false;
        }
    }

    /* JADX INFO: compiled from: RVSeeMoreAdapter.java */
    public class b extends RecyclerView.OnScrollListener {
        public static ChangeQuickRedirect changeQuickRedirect;

        b() {
        }

        @Override // androidx.recyclerview.widget.RecyclerView.OnScrollListener
        public void onScrollStateChanged(@n0 RecyclerView recyclerView, int i10) {
            if (PatchProxy.proxy(new Object[]{recyclerView, new Integer(i10)}, this, changeQuickRedirect, false, bb.c.d.U0, new Class[]{RecyclerView.class, Integer.TYPE}, Void.TYPE).isSupported) {
                return;
            }
            super.onScrollStateChanged(recyclerView, i10);
            int iM = w.m(w.this);
            if (i10 == 0) {
                w wVar = w.this;
                if (wVar.f66840g && iM > wVar.f66843j) {
                    w wVar2 = w.this;
                    wVar2.u(iM - wVar2.f66843j);
                    w.this.f66840g = false;
                    return;
                }
            }
            if (i10 == 1 || i10 == 2) {
                w.this.f66840g = true;
            } else {
                w.this.f66840g = false;
            }
        }

        @Override // androidx.recyclerview.widget.RecyclerView.OnScrollListener
        public void onScrolled(@n0 RecyclerView recyclerView, int i10, int i11) {
            Object[] objArr = {recyclerView, new Integer(i10), new Integer(i11)};
            ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
            Class cls = Integer.TYPE;
            if (PatchProxy.proxy(objArr, this, changeQuickRedirect2, false, bb.c.d.V0, new Class[]{RecyclerView.class, cls, cls}, Void.TYPE).isSupported) {
                return;
            }
            if (i10 <= 0 || !w.q(w.this)) {
                super.onScrolled(recyclerView, i10, i11);
            } else {
                super.onScrolled(recyclerView, i10 / w.this.f66845l, i11);
            }
            if (!ViewUtils.f0(w.this.f66841h)) {
                w.s(w.this);
            } else if (w.m(w.this) > 0) {
                w.t(w.this);
            }
        }
    }

    /* JADX INFO: compiled from: RVSeeMoreAdapter.java */
    public class c extends GridLayoutManager.SpanSizeLookup {
        public static ChangeQuickRedirect changeQuickRedirect;

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ GridLayoutManager f66855a;

        c(GridLayoutManager gridLayoutManager) {
            this.f66855a = gridLayoutManager;
        }

        @Override // androidx.recyclerview.widget.GridLayoutManager.SpanSizeLookup
        public int getSpanSize(int i10) {
            Object[] objArr = {new Integer(i10)};
            ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
            Class cls = Integer.TYPE;
            PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(objArr, this, changeQuickRedirect2, false, bb.c.d.W0, new Class[]{cls}, cls);
            if (patchProxyResultProxy.isSupported) {
                return ((Integer) patchProxyResultProxy.result).intValue();
            }
            if (i10 < w.this.getItemCount() - 1) {
                return 1;
            }
            return this.f66855a.getSpanCount();
        }
    }

    public w(Context context, s sVar, View.OnClickListener onClickListener) {
        this(context, sVar, onClickListener, 33, 70);
    }

    public w(Context context, s sVar, View.OnClickListener onClickListener, int i10, int i11) {
        this.f66837d = false;
        this.f66838e = R.layout.item_rv_footer_see_more;
        this.f66840g = true;
        this.f66843j = 0;
        this.f66844k = 0;
        this.f66845l = 3;
        this.f66846m = 0;
        this.f66847n = 0;
        this.f66848o = 0;
        this.f66849p = "左滑查看更多";
        this.f66850q = "松开查看更多";
        this.f66851r = true;
        this.f66852s = R.color.background_card_1_color;
        this.f66835b = sVar;
        this.f66836c = context;
        this.f66842i = onClickListener;
        x(i10, i11);
    }

    public w(Context context, s sVar, View.OnClickListener onClickListener, boolean z10) {
        this(context, sVar, onClickListener, z10 ? 20 : 33, z10 ? 45 : 70);
        this.f66837d = z10;
    }

    @SuppressLint({"ClickableViewAccessibility"})
    private void B() {
        if (PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 2103, new Class[0], Void.TYPE).isSupported) {
            return;
        }
        this.f66841h.setOnTouchListener(new a());
        this.f66841h.addOnScrollListener(new b());
    }

    private void C() {
        View.OnClickListener onClickListener;
        if (PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 2111, new Class[0], Void.TYPE).isSupported || (onClickListener = this.f66842i) == null) {
            return;
        }
        onClickListener.onClick(this.f66839f.i(R.id.vg_container));
    }

    private void D() {
        if (PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 2105, new Class[0], Void.TYPE).isSupported) {
            return;
        }
        K(v());
    }

    private boolean E() {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, bb.c.d.F0, new Class[0], Boolean.TYPE);
        if (patchProxyResultProxy.isSupported) {
            return ((Boolean) patchProxyResultProxy.result).booleanValue();
        }
        return v() > this.f66844k;
    }

    private void F() {
        if (PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 2107, new Class[0], Void.TYPE).isSupported) {
            return;
        }
        K(this.f66843j);
    }

    private void K(int i10) {
        if (PatchProxy.proxy(new Object[]{new Integer(i10)}, this, changeQuickRedirect, false, 2106, new Class[]{Integer.TYPE}, Void.TYPE).isSupported) {
            return;
        }
        s.e eVar = this.f66839f;
        int i11 = R.id.v_blank;
        ViewGroup.LayoutParams layoutParams = eVar.i(i11).getLayoutParams();
        layoutParams.width = (this.f66847n - Math.max(this.f66843j, i10)) + this.f66846m;
        this.f66839f.i(i11).setLayoutParams(layoutParams);
        TextView textView = (TextView) this.f66839f.i(R.id.tv_desc);
        ImageView imageView = (ImageView) this.f66839f.i(R.id.iv_icon);
        if (i10 > this.f66844k) {
            textView.setText(this.f66850q);
            imageView.setRotation(0.0f);
            return;
        }
        textView.setText(this.f66849p);
        int i12 = this.f66843j;
        if (i10 <= i12) {
            imageView.setRotation(180.0f);
        } else {
            imageView.setRotation(180 - (((i10 - i12) * 180) / (this.f66844k - i12)));
        }
    }

    static /* synthetic */ int m(w wVar) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{wVar}, null, changeQuickRedirect, true, bb.c.d.N0, new Class[]{w.class}, Integer.TYPE);
        return patchProxyResultProxy.isSupported ? ((Integer) patchProxyResultProxy.result).intValue() : wVar.v();
    }

    static /* synthetic */ boolean o(w wVar) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{wVar}, null, changeQuickRedirect, true, bb.c.d.O0, new Class[]{w.class}, Boolean.TYPE);
        return patchProxyResultProxy.isSupported ? ((Boolean) patchProxyResultProxy.result).booleanValue() : wVar.E();
    }

    static /* synthetic */ void p(w wVar) {
        if (PatchProxy.proxy(new Object[]{wVar}, null, changeQuickRedirect, true, bb.c.d.P0, new Class[]{w.class}, Void.TYPE).isSupported) {
            return;
        }
        wVar.C();
    }

    static /* synthetic */ boolean q(w wVar) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{wVar}, null, changeQuickRedirect, true, bb.c.d.Q0, new Class[]{w.class}, Boolean.TYPE);
        return patchProxyResultProxy.isSupported ? ((Boolean) patchProxyResultProxy.result).booleanValue() : wVar.z();
    }

    static /* synthetic */ void s(w wVar) {
        if (PatchProxy.proxy(new Object[]{wVar}, null, changeQuickRedirect, true, bb.c.d.R0, new Class[]{w.class}, Void.TYPE).isSupported) {
            return;
        }
        wVar.F();
    }

    static /* synthetic */ void t(w wVar) {
        if (PatchProxy.proxy(new Object[]{wVar}, null, changeQuickRedirect, true, bb.c.d.S0, new Class[]{w.class}, Void.TYPE).isSupported) {
            return;
        }
        wVar.D();
    }

    private int v() {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, bb.c.d.H0, new Class[0], Integer.TYPE);
        if (patchProxyResultProxy.isSupported) {
            return ((Integer) patchProxyResultProxy.result).intValue();
        }
        Rect rect = new Rect();
        if (this.f66851r && this.f66839f != null && ViewUtils.f0(this.f66841h) && ((LinearLayoutManager) this.f66841h.getLayoutManager()).findLastVisibleItemPosition() == getItemCount() - 1 && this.f66839f.itemView.getLocalVisibleRect(rect)) {
            return rect.right - rect.left;
        }
        return 0;
    }

    private void x(int i10, int i11) {
        Context context;
        int i12;
        Context context2;
        int i13;
        Object[] objArr = {new Integer(i10), new Integer(i11)};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        Class cls = Integer.TYPE;
        if (PatchProxy.proxy(objArr, this, changeQuickRedirect2, false, bb.c.d.f31495r0, new Class[]{cls, cls}, Void.TYPE).isSupported) {
            return;
        }
        ic.a aVar = ic.a.f119343a;
        this.f66843j = aVar.b(this.f66836c, i10);
        this.f66844k = aVar.b(this.f66836c, i11);
        if (this.f66837d) {
            context = this.f66836c;
            i12 = 5;
        } else {
            context = this.f66836c;
            i12 = 9;
        }
        this.f66846m = aVar.b(context, i12);
        if (this.f66837d) {
            context2 = this.f66836c;
            i13 = 36;
        } else {
            context2 = this.f66836c;
            i13 = 72;
        }
        this.f66847n = aVar.b(context2, i13);
        this.f66848o = aVar.b(this.f66836c, 71);
    }

    private void y() {
        if (PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 2104, new Class[0], Void.TYPE).isSupported) {
            return;
        }
        this.f66839f.itemView.setBackgroundDrawable(com.max.hbutils.utils.q.y(this.f66836c, this.f66852s, 3.0f));
        this.f66839f.i(R.id.v_blank).getLayoutParams().width = (this.f66847n - this.f66843j) + this.f66846m;
        if (this.f66848o <= 0) {
            this.f66839f.i(R.id.vg_container).getLayoutParams().height = -1;
        } else {
            this.f66839f.i(R.id.vg_container).getLayoutParams().height = this.f66848o;
        }
        if (this.f66837d) {
            this.f66839f.i(R.id.vg_container).getLayoutParams().width = ViewUtils.f(this.f66836c, 36.0f);
        } else {
            this.f66839f.i(R.id.vg_container).getLayoutParams().width = ViewUtils.f(this.f66836c, 72.0f);
        }
        this.f66839f.i(R.id.vg_container).setOnClickListener(this.f66842i);
        this.f66839f.itemView.setVisibility(A() ? 0 : 8);
    }

    private boolean z() {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, bb.c.d.G0, new Class[0], Boolean.TYPE);
        if (patchProxyResultProxy.isSupported) {
            return ((Boolean) patchProxyResultProxy.result).booleanValue();
        }
        return v() > this.f66843j;
    }

    public boolean A() {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, bb.c.d.K0, new Class[0], Boolean.TYPE);
        if (patchProxyResultProxy.isSupported) {
            return ((Boolean) patchProxyResultProxy.result).booleanValue();
        }
        LinearLayoutManager linearLayoutManager = (LinearLayoutManager) this.f66841h.getLayoutManager();
        RecyclerView.Adapter adapter = this.f66841h.getAdapter();
        if (linearLayoutManager == null || adapter == null) {
            return false;
        }
        return linearLayoutManager.findLastCompletelyVisibleItemPosition() < adapter.getItemCount() - (this.f66851r ? 2 : 1) || linearLayoutManager.findFirstCompletelyVisibleItemPosition() > 0;
    }

    public void G(boolean z10) {
        this.f66851r = z10;
    }

    public void H(int i10) {
        this.f66852s = i10;
    }

    public void I(String str, String str2) {
        this.f66849p = str;
        this.f66850q = str2;
    }

    public void J(int i10) {
        if (PatchProxy.proxy(new Object[]{new Integer(i10)}, this, changeQuickRedirect, false, bb.c.d.J0, new Class[]{Integer.TYPE}, Void.TYPE).isSupported) {
            return;
        }
        this.f66848o = ic.a.f119343a.b(this.f66836c, i10);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public int getItemCount() {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, bb.c.d.f31517s0, new Class[0], Integer.TYPE);
        if (patchProxyResultProxy.isSupported) {
            return ((Integer) patchProxyResultProxy.result).intValue();
        }
        return this.f66851r ? this.f66835b.getItemCount() + 1 : this.f66835b.getItemCount();
    }

    @dl.e
    public Object getItemData(int i10) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{new Integer(i10)}, this, changeQuickRedirect, false, bb.c.d.f31539t0, new Class[]{Integer.TYPE}, Object.class);
        if (patchProxyResultProxy.isSupported) {
            return patchProxyResultProxy.result;
        }
        Object itemData = this.f66835b.getItemData(i10);
        com.max.heybox.hblog.g.x("RVSeeMoreAdapter, itemData = " + itemData + ", position = " + i10);
        return itemData;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public int getItemViewType(int i10) {
        Object[] objArr = {new Integer(i10)};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        Class cls = Integer.TYPE;
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(objArr, this, changeQuickRedirect2, false, 2101, new Class[]{cls}, cls);
        if (patchProxyResultProxy.isSupported) {
            return ((Integer) patchProxyResultProxy.result).intValue();
        }
        return (this.f66851r && i10 == getItemCount() - 1) ? this.f66838e : this.f66835b.getItemViewType(i10);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public void onAttachedToRecyclerView(@n0 RecyclerView recyclerView) {
        if (PatchProxy.proxy(new Object[]{recyclerView}, this, changeQuickRedirect, false, 2109, new Class[]{RecyclerView.class}, Void.TYPE).isSupported) {
            return;
        }
        this.f66835b.onAttachedToRecyclerView(recyclerView);
        RecyclerView.LayoutManager layoutManager = recyclerView.getLayoutManager();
        if (!(layoutManager instanceof LinearLayoutManager)) {
            throw new IllegalStateException("only support LinearLayoutManager !");
        }
        if (layoutManager instanceof GridLayoutManager) {
            GridLayoutManager gridLayoutManager = (GridLayoutManager) layoutManager;
            gridLayoutManager.setSpanSizeLookup(new c(gridLayoutManager));
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public /* bridge */ /* synthetic */ void onBindViewHolder(@n0 RecyclerView.ViewHolder viewHolder, int i10) {
        if (PatchProxy.proxy(new Object[]{viewHolder, new Integer(i10)}, this, changeQuickRedirect, false, bb.c.d.L0, new Class[]{RecyclerView.ViewHolder.class, Integer.TYPE}, Void.TYPE).isSupported) {
            return;
        }
        onBindViewHolder((s.e) viewHolder, i10);
    }

    public void onBindViewHolder(@n0 s.e eVar, int i10) {
        if (PatchProxy.proxy(new Object[]{eVar, new Integer(i10)}, this, changeQuickRedirect, false, 2108, new Class[]{s.e.class, Integer.TYPE}, Void.TYPE).isSupported) {
            return;
        }
        if (getItemViewType(i10) == this.f66838e) {
            y();
        } else {
            this.f66835b.onBindViewHolder(eVar, i10);
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public /* bridge */ /* synthetic */ RecyclerView.ViewHolder onCreateViewHolder(ViewGroup viewGroup, int i10) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{viewGroup, new Integer(i10)}, this, changeQuickRedirect, false, bb.c.d.M0, new Class[]{ViewGroup.class, Integer.TYPE}, RecyclerView.ViewHolder.class);
        return patchProxyResultProxy.isSupported ? (RecyclerView.ViewHolder) patchProxyResultProxy.result : onCreateViewHolder(viewGroup, i10);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public s.e onCreateViewHolder(ViewGroup viewGroup, int i10) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{viewGroup, new Integer(i10)}, this, changeQuickRedirect, false, 2102, new Class[]{ViewGroup.class, Integer.TYPE}, s.e.class);
        if (patchProxyResultProxy.isSupported) {
            return (s.e) patchProxyResultProxy.result;
        }
        this.f66841h = (RecyclerView) viewGroup;
        int i11 = this.f66838e;
        if (i10 != i11) {
            return this.f66835b.onCreateViewHolder(viewGroup, i10);
        }
        this.f66839f = new s.e(this.f66838e, this.f66835b.mInflater.inflate(i11, viewGroup, false));
        B();
        s.e eVar = this.f66839f;
        eVar.itemView.setVisibility(A() ? 0 : 8);
        return eVar;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public void onDetachedFromRecyclerView(@n0 RecyclerView recyclerView) {
        if (PatchProxy.proxy(new Object[]{recyclerView}, this, changeQuickRedirect, false, 2110, new Class[]{RecyclerView.class}, Void.TYPE).isSupported) {
            return;
        }
        this.f66835b.onDetachedFromRecyclerView(recyclerView);
        super.onDetachedFromRecyclerView(recyclerView);
    }

    public void u(int i10) {
        if (PatchProxy.proxy(new Object[]{new Integer(i10)}, this, changeQuickRedirect, false, bb.c.d.I0, new Class[]{Integer.TYPE}, Void.TYPE).isSupported) {
            return;
        }
        this.f66841h.smoothScrollBy(-i10, 0, new DecelerateInterpolator());
    }

    public s w() {
        return this.f66835b;
    }
}
