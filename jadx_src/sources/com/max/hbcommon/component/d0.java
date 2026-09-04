package com.max.hbcommon.component;

import android.content.Context;
import android.os.Bundle;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import android.view.WindowManager;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import android.widget.TextView;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.max.hbcommon.R;
import com.max.hbcommon.bean.KeyDescObj;
import com.max.hbcustomview.swipebacklayout.SwipeBackLayout;
import com.max.hbutils.utils.ViewUtils;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.PatchProxyResult;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: compiled from: ListBottomSheetDialog.kt */
/* JADX INFO: loaded from: classes9.dex */
public final class d0 extends com.max.hbcustomview.swipebacklayout.a {
    public static ChangeQuickRedirect changeQuickRedirect;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private final int f67570i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    @dl.e
    private Context f67571j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    @dl.e
    private TextView f67572k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    @dl.e
    private TextView f67573l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private int f67574m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private int f67575n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    @dl.d
    private List<KeyDescObj> f67576o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    private boolean f67577p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    @dl.e
    private CharSequence f67578q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    @dl.d
    private CharSequence f67579r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    private boolean f67580s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    @dl.e
    private b f67581t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    @dl.e
    private View.OnClickListener f67582u;

    /* JADX INFO: compiled from: ListBottomSheetDialog.kt */
    public static final class a {
        public static ChangeQuickRedirect changeQuickRedirect;

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        @dl.d
        private Context f67583a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        @dl.e
        private String f67584b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        @dl.e
        private CharSequence f67585c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private boolean f67586d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        @dl.e
        private b f67587e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        private boolean f67588f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        @dl.e
        private View.OnClickListener f67589g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        @dl.d
        private ArrayList<KeyDescObj> f67590h;

        public a(@dl.d Context context) {
            kotlin.jvm.internal.f0.p(context, "context");
            this.f67583a = context;
            this.f67588f = true;
            this.f67590h = new ArrayList<>();
        }

        @dl.d
        public final a a(@dl.d KeyDescObj item) {
            PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{item}, this, changeQuickRedirect, false, bb.c.d.f31551tc, new Class[]{KeyDescObj.class}, a.class);
            if (patchProxyResultProxy.isSupported) {
                return (a) patchProxyResultProxy.result;
            }
            kotlin.jvm.internal.f0.p(item, "item");
            this.f67590h.add(item);
            return this;
        }

        @dl.d
        public final d0 b() {
            PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, bb.c.d.f31573uc, new Class[0], d0.class);
            return patchProxyResultProxy.isSupported ? (d0) patchProxyResultProxy.result : new d0(this.f67583a, this);
        }

        @dl.e
        public final View.OnClickListener c() {
            return this.f67589g;
        }

        @dl.e
        public final CharSequence d() {
            return this.f67585c;
        }

        public final boolean e() {
            return this.f67588f;
        }

        @dl.d
        public final Context f() {
            return this.f67583a;
        }

        @dl.d
        public final ArrayList<KeyDescObj> g() {
            return this.f67590h;
        }

        @dl.e
        public final b h() {
            return this.f67587e;
        }

        @dl.e
        public final String i() {
            return this.f67584b;
        }

        public final boolean j() {
            return this.f67586d;
        }

        @dl.d
        public final a k(@dl.d View.OnClickListener onClickListener) {
            PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{onClickListener}, this, changeQuickRedirect, false, bb.c.d.f31529sc, new Class[]{View.OnClickListener.class}, a.class);
            if (patchProxyResultProxy.isSupported) {
                return (a) patchProxyResultProxy.result;
            }
            kotlin.jvm.internal.f0.p(onClickListener, "onClickListener");
            this.f67589g = onClickListener;
            return this;
        }

        public final /* synthetic */ void l(View.OnClickListener onClickListener) {
            this.f67589g = onClickListener;
        }

        @dl.d
        public final a m(@dl.d CharSequence text) {
            PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{text}, this, changeQuickRedirect, false, bb.c.d.f31485qc, new Class[]{CharSequence.class}, a.class);
            if (patchProxyResultProxy.isSupported) {
                return (a) patchProxyResultProxy.result;
            }
            kotlin.jvm.internal.f0.p(text, "text");
            this.f67585c = text;
            return this;
        }

        public final /* synthetic */ void n(CharSequence charSequence) {
            this.f67585c = charSequence;
        }

        @dl.d
        public final a o(boolean z10) {
            this.f67588f = z10;
            return this;
        }

        public final /* synthetic */ void p(boolean z10) {
            this.f67588f = z10;
        }

        public final void q(@dl.d Context context) {
            if (PatchProxy.proxy(new Object[]{context}, this, changeQuickRedirect, false, bb.c.d.f31416nc, new Class[]{Context.class}, Void.TYPE).isSupported) {
                return;
            }
            kotlin.jvm.internal.f0.p(context, "<set-?>");
            this.f67583a = context;
        }

        public final /* synthetic */ void r(ArrayList arrayList) {
            if (PatchProxy.proxy(new Object[]{arrayList}, this, changeQuickRedirect, false, bb.c.d.f31439oc, new Class[]{ArrayList.class}, Void.TYPE).isSupported) {
                return;
            }
            kotlin.jvm.internal.f0.p(arrayList, "<set-?>");
            this.f67590h = arrayList;
        }

        @dl.d
        public final a s(@dl.d b heyBoxPopupMenuListener) {
            PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{heyBoxPopupMenuListener}, this, changeQuickRedirect, false, bb.c.d.f31507rc, new Class[]{b.class}, a.class);
            if (patchProxyResultProxy.isSupported) {
                return (a) patchProxyResultProxy.result;
            }
            kotlin.jvm.internal.f0.p(heyBoxPopupMenuListener, "heyBoxPopupMenuListener");
            this.f67587e = heyBoxPopupMenuListener;
            return this;
        }

        public final /* synthetic */ void t(b bVar) {
            this.f67587e = bVar;
        }

        @dl.d
        public final a u(@dl.d String title) {
            PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{title}, this, changeQuickRedirect, false, bb.c.d.f31462pc, new Class[]{String.class}, a.class);
            if (patchProxyResultProxy.isSupported) {
                return (a) patchProxyResultProxy.result;
            }
            kotlin.jvm.internal.f0.p(title, "title");
            this.f67584b = title;
            return this;
        }

        public final /* synthetic */ void v(String str) {
            this.f67584b = str;
        }

        @dl.d
        public final a w(boolean z10) {
            this.f67586d = z10;
            return this;
        }

        public final /* synthetic */ void x(boolean z10) {
            this.f67586d = z10;
        }
    }

    /* JADX INFO: compiled from: ListBottomSheetDialog.kt */
    public interface b {
        void a(@dl.e View view, @dl.e KeyDescObj keyDescObj);
    }

    /* JADX INFO: compiled from: ListBottomSheetDialog.kt */
    public static final class c extends com.max.hbcommon.base.adapter.s<KeyDescObj> {
        public static ChangeQuickRedirect changeQuickRedirect;

        c(Context context, List<KeyDescObj> list, int i10) {
            super(context, list, i10);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final void o(KeyDescObj data, d0 this$0, View view, View view2) {
            b bVar;
            if (PatchProxy.proxy(new Object[]{data, this$0, view, view2}, null, changeQuickRedirect, true, bb.c.d.f31617wc, new Class[]{KeyDescObj.class, d0.class, View.class, View.class}, Void.TYPE).isSupported) {
                return;
            }
            kotlin.jvm.internal.f0.p(data, "$data");
            kotlin.jvm.internal.f0.p(this$0, "this$0");
            if (data.isCanClick() && (bVar = this$0.f67581t) != null) {
                bVar.a(view, data);
            }
            if (this$0.f67577p) {
                this$0.dismiss();
            }
        }

        /* JADX WARN: Code duplicated, block: B:17:0x0071  */
        public void n(@dl.d com.max.hbcommon.base.adapter.s.e viewHolder, @dl.d final KeyDescObj data) {
            boolean z10;
            if (PatchProxy.proxy(new Object[]{viewHolder, data}, this, changeQuickRedirect, false, bb.c.d.f31595vc, new Class[]{com.max.hbcommon.base.adapter.s.e.class, KeyDescObj.class}, Void.TYPE).isSupported) {
                return;
            }
            kotlin.jvm.internal.f0.p(viewHolder, "viewHolder");
            kotlin.jvm.internal.f0.p(data, "data");
            final View viewB = viewHolder.b();
            TextView textView = (TextView) viewB.findViewById(R.id.tv_name);
            ImageView imageView = (ImageView) viewB.findViewById(R.id.iv_icon_tail);
            TextView textView2 = (TextView) viewB.findViewById(R.id.tv_tag_tail);
            textView.setText(data.getTitle());
            imageView.setVisibility(data.isCanClick() ? 0 : 8);
            String desc = data.getDesc();
            if (desc != null) {
                z10 = desc.length() > 0;
            }
            if (z10) {
                textView2.setVisibility(0);
                textView2.setText(data.getDesc());
            } else {
                textView2.setVisibility(8);
            }
            final d0 d0Var = d0.this;
            viewB.setOnClickListener(new View.OnClickListener() { // from class: com.max.hbcommon.component.e0
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    d0.c.o(data, d0Var, viewB, view);
                }
            });
        }

        @Override // com.max.hbcommon.base.adapter.s
        public /* bridge */ /* synthetic */ void onBindViewHolder(com.max.hbcommon.base.adapter.s.e eVar, KeyDescObj keyDescObj) {
            if (PatchProxy.proxy(new Object[]{eVar, keyDescObj}, this, changeQuickRedirect, false, bb.c.d.f31639xc, new Class[]{com.max.hbcommon.base.adapter.s.e.class, Object.class}, Void.TYPE).isSupported) {
                return;
            }
            n(eVar, keyDescObj);
        }
    }

    /* JADX INFO: compiled from: ListBottomSheetDialog.kt */
    public static final class d extends RecyclerView.OnScrollListener {
        public static ChangeQuickRedirect changeQuickRedirect;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ View f67593c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        final /* synthetic */ View f67594d;

        d(View view, View view2) {
            this.f67593c = view;
            this.f67594d = view2;
        }

        @Override // androidx.recyclerview.widget.RecyclerView.OnScrollListener
        public void onScrollStateChanged(@dl.d RecyclerView recyclerView, int i10) {
            if (PatchProxy.proxy(new Object[]{recyclerView, new Integer(i10)}, this, changeQuickRedirect, false, bb.c.d.f31661yc, new Class[]{RecyclerView.class, Integer.TYPE}, Void.TYPE).isSupported) {
                return;
            }
            kotlin.jvm.internal.f0.p(recyclerView, "recyclerView");
            super.onScrollStateChanged(recyclerView, i10);
        }

        @Override // androidx.recyclerview.widget.RecyclerView.OnScrollListener
        public void onScrolled(@dl.d RecyclerView recyclerView, int i10, int i11) {
            Object[] objArr = {recyclerView, new Integer(i10), new Integer(i11)};
            ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
            Class cls = Integer.TYPE;
            if (PatchProxy.proxy(objArr, this, changeQuickRedirect2, false, bb.c.d.f31683zc, new Class[]{RecyclerView.class, cls, cls}, Void.TYPE).isSupported) {
                return;
            }
            kotlin.jvm.internal.f0.p(recyclerView, "recyclerView");
            super.onScrolled(recyclerView, i10, i11);
            LinearLayoutManager linearLayoutManager = (LinearLayoutManager) recyclerView.getLayoutManager();
            d0 d0Var = d0.this;
            kotlin.jvm.internal.f0.m(linearLayoutManager);
            d0Var.B(linearLayoutManager.findFirstVisibleItemPosition());
            d0.this.C(linearLayoutManager.findLastVisibleItemPosition());
            d0 d0Var2 = d0.this;
            View view_gradient_top = this.f67593c;
            kotlin.jvm.internal.f0.o(view_gradient_top, "$view_gradient_top");
            View view_gradient_bottom = this.f67594d;
            kotlin.jvm.internal.f0.o(view_gradient_bottom, "$view_gradient_bottom");
            d0.m(d0Var2, view_gradient_top, view_gradient_bottom, recyclerView.getChildAt(0), recyclerView.getChildAt(d0.this.t() - d0.this.r()));
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d0(@dl.d Context context, @dl.d a builder) {
        super(context, builder.j() ? R.style.FullScreenDialog : R.style.HeyBoxDialog);
        kotlin.jvm.internal.f0.p(context, "context");
        kotlin.jvm.internal.f0.p(builder, "builder");
        this.f67570i = 200;
        this.f67577p = true;
        this.f67571j = builder.f();
        this.f67578q = builder.i();
        this.f67576o = builder.g();
        String strD = builder.d();
        this.f67579r = strD == null ? "取消" : strD;
        this.f67577p = builder.e();
        this.f67581t = builder.h();
        this.f67582u = builder.c();
        this.f67580s = builder.j();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void A(d0 this$0, View view) {
        if (PatchProxy.proxy(new Object[]{this$0, view}, null, changeQuickRedirect, true, bb.c.d.f31324jc, new Class[]{d0.class, View.class}, Void.TYPE).isSupported) {
            return;
        }
        kotlin.jvm.internal.f0.p(this$0, "this$0");
        this$0.p();
    }

    public static final /* synthetic */ void m(d0 d0Var, View view, View view2, View view3, View view4) {
        if (PatchProxy.proxy(new Object[]{d0Var, view, view2, view3, view4}, null, changeQuickRedirect, true, bb.c.d.f31393mc, new Class[]{d0.class, View.class, View.class, View.class, View.class}, Void.TYPE).isSupported) {
            return;
        }
        d0Var.q(view, view2, view3, view4);
    }

    private final void p() {
        if (PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, bb.c.d.f31255gc, new Class[0], Void.TYPE).isSupported) {
            return;
        }
        dismiss();
    }

    /* JADX WARN: Code duplicated, block: B:18:0x005f  */
    /* JADX WARN: Code duplicated, block: B:20:0x0065  */
    /* JADX WARN: Code duplicated, block: B:22:0x006d  */
    /* JADX WARN: Code duplicated, block: B:23:0x006f  */
    /* JADX WARN: Code duplicated, block: B:25:0x0072  */
    private final void q(View view, View view2, View view3, View view4) {
        boolean z10;
        if (!PatchProxy.proxy(new Object[]{view, view2, view3, view4}, this, changeQuickRedirect, false, bb.c.d.f31232fc, new Class[]{View.class, View.class, View.class, View.class}, Void.TYPE).isSupported && this.f67576o.size() > 4) {
            if (this.f67574m != 0 || view3 == null) {
                if (view.getAlpha() == 0.0f) {
                    com.max.hbutils.anim.b.c(view, this.f67570i, true);
                }
            } else if (!ViewUtils.e0(view3)) {
                if (view.getAlpha() == 1.0f) {
                    com.max.hbutils.anim.b.c(view, this.f67570i, false);
                } else if (ViewUtils.e0(view3)) {
                    if (view.getAlpha() == 0.0f) {
                        z10 = true;
                    } else {
                        z10 = false;
                    }
                    if (z10) {
                        com.max.hbutils.anim.b.c(view, this.f67570i, true);
                    }
                }
            } else if (ViewUtils.e0(view3)) {
                if (view.getAlpha() == 0.0f) {
                    z10 = true;
                } else {
                    z10 = false;
                }
                if (z10) {
                    com.max.hbutils.anim.b.c(view, this.f67570i, true);
                }
            }
            if (this.f67575n != this.f67576o.size() - 1 || view4 == null) {
                if (view2.getAlpha() == 0.0f) {
                    com.max.hbutils.anim.b.c(view2, this.f67570i, true);
                    return;
                }
                return;
            }
            Log.d("fitGradient", "isViewCovered:" + ViewUtils.e0(view4) + "  top.getAlpha():" + view2.getAlpha());
            if (!ViewUtils.e0(view4)) {
                if (view2.getAlpha() == 1.0f) {
                    com.max.hbutils.anim.b.c(view2, this.f67570i, false);
                    return;
                }
            }
            if (ViewUtils.e0(view4)) {
                if (view2.getAlpha() == 0.0f) {
                    com.max.hbutils.anim.b.c(view2, this.f67570i, true);
                }
            }
        }
    }

    private final void u() {
        TextView textView;
        if (PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, bb.c.d.f31209ec, new Class[0], Void.TYPE).isSupported) {
            return;
        }
        this.f67573l = (TextView) findViewById(R.id.tv_btn);
        if ((this.f67579r.length() > 0) && (textView = this.f67573l) != null) {
            textView.setText(this.f67579r);
        }
        final View viewFindViewById = findViewById(R.id.cv_cancel);
        viewFindViewById.setOnClickListener(new View.OnClickListener() { // from class: com.max.hbcommon.component.a0
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                d0.v(this.f67200b, viewFindViewById, view);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void v(d0 this$0, View view, View view2) {
        if (PatchProxy.proxy(new Object[]{this$0, view, view2}, null, changeQuickRedirect, true, bb.c.d.f31370lc, new Class[]{d0.class, View.class, View.class}, Void.TYPE).isSupported) {
            return;
        }
        kotlin.jvm.internal.f0.p(this$0, "this$0");
        View.OnClickListener onClickListener = this$0.f67582u;
        if (onClickListener == null) {
            this$0.p();
        } else if (onClickListener != null) {
            onClickListener.onClick(view);
        }
    }

    private final void w() {
        if (PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, bb.c.d.f31186dc, new Class[0], Void.TYPE).isSupported) {
            return;
        }
        View viewFindViewById = findViewById(R.id.view_gradient_bottom);
        View viewFindViewById2 = findViewById(R.id.view_gradient_top);
        if (com.max.hbcommon.utils.c.w(this.f67576o)) {
            return;
        }
        if (this.f67576o.size() > 4) {
            viewFindViewById.setVisibility(0);
        } else {
            viewFindViewById.setVisibility(8);
            viewFindViewById2.setVisibility(8);
        }
        View viewFindViewById3 = findViewById(R.id.rv_data);
        kotlin.jvm.internal.f0.n(viewFindViewById3, "null cannot be cast to non-null type androidx.recyclerview.widget.RecyclerView");
        RecyclerView recyclerView = (RecyclerView) viewFindViewById3;
        recyclerView.setLayoutManager(new LinearLayoutManager(this.f67571j));
        recyclerView.setAdapter(new c(this.f67571j, this.f67576o, R.layout.item_bottom_sheet_dialog));
        recyclerView.post(new Runnable() { // from class: com.max.hbcommon.component.b0
            @Override // java.lang.Runnable
            public final void run() {
                d0.x(this.f67203b);
            }
        });
        recyclerView.addOnScrollListener(new d(viewFindViewById2, viewFindViewById));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void x(d0 this$0) {
        if (PatchProxy.proxy(new Object[]{this$0}, null, changeQuickRedirect, true, bb.c.d.f31347kc, new Class[]{d0.class}, Void.TYPE).isSupported) {
            return;
        }
        kotlin.jvm.internal.f0.p(this$0, "this$0");
        SwipeBackLayout swipeBackLayout = this$0.f69575b;
        if (swipeBackLayout != null) {
            swipeBackLayout.r();
        }
    }

    /* JADX WARN: Code duplicated, block: B:13:0x0031  */
    private final void y() {
        boolean z10;
        if (PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, bb.c.d.f31162cc, new Class[0], Void.TYPE).isSupported) {
            return;
        }
        this.f67572k = (TextView) findViewById(R.id.tv_title);
        CharSequence charSequence = this.f67578q;
        if (charSequence != null) {
            z10 = charSequence.length() > 0;
        }
        if (z10) {
            TextView textView = this.f67572k;
            if (textView != null) {
                textView.setVisibility(0);
            }
            TextView textView2 = this.f67572k;
            if (textView2 == null) {
                return;
            }
            textView2.setText(this.f67578q);
        }
    }

    private final void z() {
        Window window;
        if (PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, bb.c.d.f31139bc, new Class[0], Void.TYPE).isSupported) {
            return;
        }
        View viewFindViewById = findViewById(R.id.view_nav_bar);
        if (!this.f67580s && (window = getWindow()) != null) {
            window.setGravity(17);
            window.getDecorView().setPadding(0, 0, 0, 0);
            WindowManager.LayoutParams attributes = window.getAttributes();
            attributes.width = -1;
            attributes.height = -2;
            window.setAttributes(attributes);
        }
        if (this.f67580s) {
            com.max.hbutils.utils.t.h0(getWindow());
            if (viewFindViewById != null) {
                com.max.hbutils.utils.t.u(getWindow());
                ViewUtils.n0(viewFindViewById, 0, 0, 0, com.max.hbutils.utils.t.o(getContext()));
            }
        }
    }

    public final void B(int i10) {
        this.f67574m = i10;
    }

    public final void C(int i10) {
        this.f67575n = i10;
    }

    public final void D(@dl.d b listener) {
        if (PatchProxy.proxy(new Object[]{listener}, this, changeQuickRedirect, false, bb.c.d.f31301ic, new Class[]{b.class}, Void.TYPE).isSupported) {
            return;
        }
        kotlin.jvm.internal.f0.p(listener, "listener");
        this.f67581t = listener;
    }

    @Override // com.max.hbcustomview.swipebacklayout.a, android.app.Dialog
    public void onCreate(@dl.e Bundle bundle) {
        if (PatchProxy.proxy(new Object[]{bundle}, this, changeQuickRedirect, false, bb.c.d.f31116ac, new Class[]{Bundle.class}, Void.TYPE).isSupported) {
            return;
        }
        super.onCreate(bundle);
        View viewInflate = LayoutInflater.from(getContext()).inflate(R.layout.layout_list_bottom_sheet_dialog, (ViewGroup) null);
        kotlin.jvm.internal.f0.n(viewInflate, "null cannot be cast to non-null type android.widget.RelativeLayout");
        RelativeLayout relativeLayout = (RelativeLayout) viewInflate;
        setContentView(relativeLayout);
        relativeLayout.setOnClickListener(new View.OnClickListener() { // from class: com.max.hbcommon.component.c0
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                d0.A(this.f67404b, view);
            }
        });
        z();
        y();
        w();
        u();
    }

    public final int r() {
        return this.f67574m;
    }

    public final int s() {
        return this.f67570i;
    }

    /* JADX WARN: Code duplicated, block: B:14:0x0031  */
    @Override // android.app.Dialog
    public void setTitle(@dl.e CharSequence charSequence) {
        boolean z10;
        if (PatchProxy.proxy(new Object[]{charSequence}, this, changeQuickRedirect, false, bb.c.d.f31278hc, new Class[]{CharSequence.class}, Void.TYPE).isSupported) {
            return;
        }
        this.f67578q = charSequence;
        if (this.f67572k != null) {
            if (charSequence != null) {
                z10 = charSequence.length() > 0;
            }
            if (z10) {
                TextView textView = this.f67572k;
                if (textView != null) {
                    textView.setVisibility(0);
                }
                TextView textView2 = this.f67572k;
                if (textView2 == null) {
                    return;
                }
                textView2.setText(charSequence);
            }
        }
    }

    public final int t() {
        return this.f67575n;
    }
}
