package com.max.hblogistics;

import android.content.ClipData;
import android.content.ClipboardManager;
import android.content.Context;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.ProgressBar;
import android.widget.TextView;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.bytedance.bpea.entry.common.DataType;
import com.max.hbcommon.base.adapter.s;
import com.max.hblogistics.bean.logistics.ExpressDetailObj;
import com.max.hblogistics.bean.logistics.ExpressTrailObj;
import com.max.hbutils.bean.Result;
import com.max.hbutils.utils.ViewUtils;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.PatchProxyResult;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: compiled from: LogisticsDialogFragment.java */
/* JADX INFO: loaded from: classes11.dex */
public class f extends com.max.hbcommon.base.c {
    public static ChangeQuickRedirect changeQuickRedirect = null;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    private static final String f71022q = "order_id";

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    private static final String f71023r = "arg_source";

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public static final String f71024s = "cassette";

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private String f71025e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private String f71026f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private ProgressBar f71027g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private View f71028h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private ImageView f71029i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private TextView f71030j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private TextView f71031k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private TextView f71032l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private TextView f71033m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private List<ExpressTrailObj> f71034n = new ArrayList();

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    private s<ExpressTrailObj> f71035o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    private boolean f71036p;

    /* JADX INFO: compiled from: LogisticsDialogFragment.java */
    public class a implements View.OnClickListener {
        public static ChangeQuickRedirect changeQuickRedirect;

        a() {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            if (PatchProxy.proxy(new Object[]{view}, this, changeQuickRedirect, false, bb.c.g.f33199xh, new Class[]{View.class}, Void.TYPE).isSupported) {
                return;
            }
            f.this.dismiss();
        }
    }

    /* JADX INFO: compiled from: LogisticsDialogFragment.java */
    public class b extends s<ExpressTrailObj> {
        public static ChangeQuickRedirect changeQuickRedirect;

        b(Context context, List list, int i10) {
            super(context, list, i10);
        }

        public void m(s.e eVar, ExpressTrailObj expressTrailObj) {
            if (PatchProxy.proxy(new Object[]{eVar, expressTrailObj}, this, changeQuickRedirect, false, bb.c.g.f33219yh, new Class[]{s.e.class, ExpressTrailObj.class}, Void.TYPE).isSupported) {
                return;
            }
            View viewI = eVar.i(R.id.vg_status);
            View viewI2 = eVar.i(R.id.status_line);
            TextView textView = (TextView) eVar.i(R.id.tv_status);
            TextView textView2 = (TextView) eVar.i(R.id.tv_time);
            ImageView imageView = (ImageView) eVar.i(R.id.iv_status);
            textView.setText(expressTrailObj.getStatus());
            textView2.setText(expressTrailObj.getTime());
            Context context = viewI.getContext();
            if (eVar.getAdapterPosition() == getItemCount() - 1) {
                viewI2.setVisibility(8);
                viewI.setPadding(0, 0, 0, 0);
            } else {
                viewI2.setVisibility(0);
                viewI.setPadding(0, 0, 0, ViewUtils.f(context, 40.0f));
            }
            ViewGroup.LayoutParams layoutParams = imageView.getLayoutParams();
            if (eVar.getAdapterPosition() == 0 && f.this.f71036p) {
                int iF = ViewUtils.f(context, 20.0f);
                layoutParams.height = iF;
                layoutParams.width = iF;
                imageView.setLayoutParams(layoutParams);
                imageView.setImageResource(R.drawable.ic_0icon_action_choose_1_20);
                return;
            }
            int iF2 = ViewUtils.f(context, 10.0f);
            layoutParams.height = iF2;
            layoutParams.width = iF2;
            imageView.setLayoutParams(layoutParams);
            imageView.setImageResource(R.drawable.circle_reference);
        }

        @Override // com.max.hbcommon.base.adapter.s
        public /* bridge */ /* synthetic */ void onBindViewHolder(s.e eVar, ExpressTrailObj expressTrailObj) {
            if (PatchProxy.proxy(new Object[]{eVar, expressTrailObj}, this, changeQuickRedirect, false, bb.c.g.f33239zh, new Class[]{s.e.class, Object.class}, Void.TYPE).isSupported) {
                return;
            }
            m(eVar, expressTrailObj);
        }
    }

    /* JADX INFO: compiled from: LogisticsDialogFragment.java */
    public class c extends com.max.hbcommon.network.d<Result<ExpressDetailObj>> {
        public static ChangeQuickRedirect changeQuickRedirect;

        c() {
        }

        @Override // com.max.hbcommon.network.d, io.reactivex.g0
        public void onError(Throwable th2) {
            if (!PatchProxy.proxy(new Object[]{th2}, this, changeQuickRedirect, false, bb.c.g.Ah, new Class[]{Throwable.class}, Void.TYPE).isSupported && f.this.isActive()) {
                super.onError(th2);
                f.this.f71027g.setVisibility(8);
            }
        }

        public void onNext(Result<ExpressDetailObj> result) {
            if (!PatchProxy.proxy(new Object[]{result}, this, changeQuickRedirect, false, bb.c.g.Bh, new Class[]{Result.class}, Void.TYPE).isSupported && f.this.isActive()) {
                super.onNext(result);
                f.this.f71027g.setVisibility(8);
                f.P3(f.this, result.getResult());
            }
        }

        @Override // com.max.hbcommon.network.d, io.reactivex.g0
        public /* bridge */ /* synthetic */ void onNext(Object obj) {
            if (PatchProxy.proxy(new Object[]{obj}, this, changeQuickRedirect, false, bb.c.g.Ch, new Class[]{Object.class}, Void.TYPE).isSupported) {
                return;
            }
            onNext((Result<ExpressDetailObj>) obj);
        }
    }

    /* JADX INFO: compiled from: LogisticsDialogFragment.java */
    public class d implements View.OnClickListener {
        public static ChangeQuickRedirect changeQuickRedirect;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ ExpressDetailObj f71040b;

        d(ExpressDetailObj expressDetailObj) {
            this.f71040b = expressDetailObj;
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            if (PatchProxy.proxy(new Object[]{view}, this, changeQuickRedirect, false, bb.c.g.Dh, new Class[]{View.class}, Void.TYPE).isSupported) {
                return;
            }
            f.Q3(view.getContext(), this.f71040b.getNumber());
            com.max.hbutils.utils.c cVar = com.max.hbutils.utils.c.f73533a;
            com.max.hbutils.utils.c.f(f.this.getString(R.string.text_copied));
        }
    }

    /* JADX INFO: compiled from: LogisticsDialogFragment.java */
    public class e implements View.OnClickListener {
        public static ChangeQuickRedirect changeQuickRedirect;

        e() {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            if (PatchProxy.proxy(new Object[]{view}, this, changeQuickRedirect, false, bb.c.g.Eh, new Class[]{View.class}, Void.TYPE).isSupported || f.f71024s.equals(f.this.f71026f)) {
                return;
            }
            ob.a aVar = ob.a.f132240a;
            ob.a.l().a(view.getContext(), f.this.f71025e);
        }
    }

    static /* synthetic */ void P3(f fVar, ExpressDetailObj expressDetailObj) {
        if (PatchProxy.proxy(new Object[]{fVar, expressDetailObj}, null, changeQuickRedirect, true, bb.c.g.f33159vh, new Class[]{f.class, ExpressDetailObj.class}, Void.TYPE).isSupported) {
            return;
        }
        fVar.X3(expressDetailObj);
    }

    static /* synthetic */ void Q3(Context context, CharSequence charSequence) {
        if (PatchProxy.proxy(new Object[]{context, charSequence}, null, changeQuickRedirect, true, bb.c.g.f33179wh, new Class[]{Context.class, CharSequence.class}, Void.TYPE).isSupported) {
            return;
        }
        T3(context, charSequence);
    }

    private static void T3(Context context, CharSequence charSequence) {
        if (PatchProxy.proxy(new Object[]{context, charSequence}, null, changeQuickRedirect, true, bb.c.g.f33139uh, new Class[]{Context.class, CharSequence.class}, Void.TYPE).isSupported) {
            return;
        }
        ((ClipboardManager) context.getSystemService(DataType.CLIPBOARD)).setPrimaryClip(ClipData.newPlainText("Label", charSequence));
    }

    private void U3() {
        if (PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, bb.c.g.f33099sh, new Class[0], Void.TYPE).isSupported) {
            return;
        }
        addDisposable((io.reactivex.disposables.b) h.a().b(this.f71025e, this.f71026f).I5(io.reactivex.schedulers.b.d()).a4(io.reactivex.android.schedulers.a.c()).J5(new c()));
    }

    public static f V3(String str) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{str}, null, changeQuickRedirect, true, bb.c.g.f33019oh, new Class[]{String.class}, f.class);
        if (patchProxyResultProxy.isSupported) {
            return (f) patchProxyResultProxy.result;
        }
        f fVar = new f();
        Bundle bundle = new Bundle();
        bundle.putString("order_id", str);
        fVar.setArguments(bundle);
        return fVar;
    }

    public static f W3(String str, String str2) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{str, str2}, null, changeQuickRedirect, true, bb.c.g.f32999nh, new Class[]{String.class, String.class}, f.class);
        if (patchProxyResultProxy.isSupported) {
            return (f) patchProxyResultProxy.result;
        }
        f fVar = new f();
        Bundle bundle = new Bundle();
        bundle.putString("order_id", str);
        bundle.putString(f71023r, str2);
        fVar.setArguments(bundle);
        return fVar;
    }

    private void X3(ExpressDetailObj expressDetailObj) {
        if (PatchProxy.proxy(new Object[]{expressDetailObj}, this, changeQuickRedirect, false, bb.c.g.f33119th, new Class[]{ExpressDetailObj.class}, Void.TYPE).isSupported || expressDetailObj == null) {
            return;
        }
        this.f71036p = com.max.hbcommon.utils.c.x(expressDetailObj.getIs_sign());
        com.max.hbimage.b.K(expressDetailObj.getImg(), this.f71029i);
        this.f71030j.setText(expressDetailObj.getName());
        this.f71031k.setText(String.format("%s: %s", getString(R.string.order_number), this.f71025e));
        this.f71032l.setText(String.format("%s: %s", expressDetailObj.getExpress_name(), expressDetailObj.getNumber()));
        this.f71033m.setOnClickListener(new d(expressDetailObj));
        this.f71028h.setOnClickListener(new e());
        if (expressDetailObj.getTrails() != null) {
            this.f71034n.clear();
            this.f71034n.addAll(expressDetailObj.getTrails());
            this.f71035o.notifyDataSetChanged();
        }
    }

    @Override // com.max.hbcommon.base.c
    public boolean L3() {
        return true;
    }

    @Override // androidx.fragment.app.Fragment
    public View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{layoutInflater, viewGroup, bundle}, this, changeQuickRedirect, false, bb.c.g.f33039ph, new Class[]{LayoutInflater.class, ViewGroup.class, Bundle.class}, View.class);
        if (patchProxyResultProxy.isSupported) {
            return (View) patchProxyResultProxy.result;
        }
        if (getArguments() != null) {
            this.f71025e = getArguments().getString("order_id");
            this.f71026f = getArguments().getString(f71023r);
        }
        return layoutInflater.inflate(R.layout.hblogistics_fragment_logistics_dialog, viewGroup, false);
    }

    @Override // com.max.hbcommon.base.c, androidx.fragment.app.j, androidx.fragment.app.Fragment
    public void onStart() {
        if (PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, bb.c.g.f33079rh, new Class[0], Void.TYPE).isSupported) {
            return;
        }
        super.onStart();
        U3();
    }

    @Override // com.max.hbcommon.base.c, androidx.fragment.app.Fragment
    public void onViewCreated(View view, Bundle bundle) {
        if (PatchProxy.proxy(new Object[]{view, bundle}, this, changeQuickRedirect, false, bb.c.g.f33059qh, new Class[]{View.class, Bundle.class}, Void.TYPE).isSupported) {
            return;
        }
        super.onViewCreated(view, bundle);
        view.setOnClickListener(new a());
        RecyclerView recyclerView = (RecyclerView) view.findViewById(R.id.rv_list);
        this.f71027g = (ProgressBar) view.findViewById(R.id.progress);
        this.f71028h = view.findViewById(R.id.vg_preview);
        this.f71029i = (ImageView) view.findViewById(R.id.iv_img);
        this.f71030j = (TextView) view.findViewById(R.id.tv_name);
        this.f71031k = (TextView) view.findViewById(R.id.tv_number);
        this.f71032l = (TextView) view.findViewById(R.id.tv_express);
        this.f71033m = (TextView) view.findViewById(R.id.tv_copy);
        this.f71035o = new b(getContext(), this.f71034n, R.layout.hblogistics_item_express_trail);
        recyclerView.setLayoutManager(new LinearLayoutManager(getContext()));
        recyclerView.setAdapter(this.f71035o);
    }
}
