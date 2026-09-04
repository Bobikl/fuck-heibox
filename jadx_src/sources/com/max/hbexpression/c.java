package com.max.hbexpression;

import android.app.Activity;
import android.content.Context;
import android.graphics.Color;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.ListAdapter;
import android.widget.TextView;
import androidx.annotation.p0;
import androidx.fragment.app.Fragment;
import com.max.hbexpression.bean.ExpressionObj;
import com.max.hbexpression.widget.CustomGridView;
import com.max.hbutils.utils.ViewUtils;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.PatchProxyResult;
import com.ss.android.ttvecamera.TECameraSettings;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: compiled from: ExpressionGridFragment.java */
/* JADX INFO: loaded from: classes10.dex */
public class c extends Fragment {
    public static ChangeQuickRedirect changeQuickRedirect;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private List<ExpressionObj> f70181b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private q.a f70182c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private com.max.hbcommon.base.adapter.m<ExpressionObj> f70183d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private q.b f70184e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private CustomGridView f70185f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private ImageView f70186g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private int f70187h;

    /* JADX INFO: compiled from: ExpressionGridFragment.java */
    public class a implements View.OnClickListener {
        public static ChangeQuickRedirect changeQuickRedirect;

        a() {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            if (PatchProxy.proxy(new Object[]{view}, this, changeQuickRedirect, false, bb.c.f.ZC, new Class[]{View.class}, Void.TYPE).isSupported) {
                return;
            }
            c.this.f70184e.expressionDeleteClick(view);
        }
    }

    /* JADX INFO: compiled from: ExpressionGridFragment.java */
    public class b extends com.max.hbcommon.base.adapter.m<ExpressionObj> {
        public static ChangeQuickRedirect changeQuickRedirect;

        /* JADX INFO: compiled from: ExpressionGridFragment.java */
        public class a implements View.OnClickListener {
            public static ChangeQuickRedirect changeQuickRedirect;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            final /* synthetic */ ExpressionObj f70190b;

            a(ExpressionObj expressionObj) {
                this.f70190b = expressionObj;
            }

            @Override // android.view.View.OnClickListener
            public void onClick(View view) {
                if (PatchProxy.proxy(new Object[]{view}, this, changeQuickRedirect, false, bb.c.f.gD, new Class[]{View.class}, Void.TYPE).isSupported) {
                    return;
                }
                c.this.f70182c.o0(this.f70190b);
                RecentEmojiManger.f70167a.g(this.f70190b);
            }
        }

        /* JADX INFO: renamed from: com.max.hbexpression.c$b$b, reason: collision with other inner class name */
        /* JADX INFO: compiled from: ExpressionGridFragment.java */
        public class ViewOnClickListenerC0568b implements View.OnClickListener {
            public static ChangeQuickRedirect changeQuickRedirect;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            final /* synthetic */ ExpressionObj f70192b;

            ViewOnClickListenerC0568b(ExpressionObj expressionObj) {
                this.f70192b = expressionObj;
            }

            @Override // android.view.View.OnClickListener
            public void onClick(View view) {
                if (PatchProxy.proxy(new Object[]{view}, this, changeQuickRedirect, false, bb.c.f.hD, new Class[]{View.class}, Void.TYPE).isSupported) {
                    return;
                }
                c.this.f70182c.o0(this.f70192b);
            }
        }

        b(Context context, List list) {
            super(context, list);
        }

        @Override // com.max.hbcommon.base.adapter.h
        public /* bridge */ /* synthetic */ void b(com.max.hbcommon.base.adapter.h.a aVar, Object obj) {
            if (PatchProxy.proxy(new Object[]{aVar, obj}, this, changeQuickRedirect, false, bb.c.f.fD, new Class[]{com.max.hbcommon.base.adapter.h.a.class, Object.class}, Void.TYPE).isSupported) {
                return;
            }
            i(aVar, (ExpressionObj) obj);
        }

        @Override // com.max.hbcommon.base.adapter.m
        public /* bridge */ /* synthetic */ int d(int i10, int i11, ExpressionObj expressionObj) {
            Object[] objArr = {new Integer(i10), new Integer(i11), expressionObj};
            ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
            Class cls = Integer.TYPE;
            PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(objArr, this, changeQuickRedirect2, false, bb.c.f.eD, new Class[]{cls, cls, Object.class}, cls);
            return patchProxyResultProxy.isSupported ? ((Integer) patchProxyResultProxy.result).intValue() : g(i10, i11, expressionObj);
        }

        @Override // com.max.hbcommon.base.adapter.m
        public int e() {
            return 2;
        }

        @Override // com.max.hbcommon.base.adapter.m
        public /* bridge */ /* synthetic */ int f(int i10, ExpressionObj expressionObj) {
            Object[] objArr = {new Integer(i10), expressionObj};
            ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
            Class cls = Integer.TYPE;
            PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(objArr, this, changeQuickRedirect2, false, bb.c.f.dD, new Class[]{cls, Object.class}, cls);
            return patchProxyResultProxy.isSupported ? ((Integer) patchProxyResultProxy.result).intValue() : h(i10, expressionObj);
        }

        public int g(int i10, int i11, ExpressionObj expressionObj) {
            Object[] objArr = {new Integer(i10), new Integer(i11), expressionObj};
            ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
            Class cls = Integer.TYPE;
            PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(objArr, this, changeQuickRedirect2, false, bb.c.f.aD, new Class[]{cls, cls, ExpressionObj.class}, cls);
            return patchProxyResultProxy.isSupported ? ((Integer) patchProxyResultProxy.result).intValue() : expressionObj.getType();
        }

        public int h(int i10, ExpressionObj expressionObj) {
            Object[] objArr = {new Integer(i10), expressionObj};
            ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
            Class cls = Integer.TYPE;
            PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(objArr, this, changeQuickRedirect2, false, bb.c.f.bD, new Class[]{cls, ExpressionObj.class}, cls);
            if (patchProxyResultProxy.isSupported) {
                return ((Integer) patchProxyResultProxy.result).intValue();
            }
            return expressionObj.getType() == 1 ? R.layout.hbexpression_item : R.layout.hbexpression_gv_item;
        }

        public void i(com.max.hbcommon.base.adapter.h.a aVar, ExpressionObj expressionObj) {
            if (PatchProxy.proxy(new Object[]{aVar, expressionObj}, this, changeQuickRedirect, false, bb.c.f.cD, new Class[]{com.max.hbcommon.base.adapter.h.a.class, ExpressionObj.class}, Void.TYPE).isSupported) {
                return;
            }
            if (aVar.c() == R.layout.hbexpression_item) {
                f.i(expressionObj, (ImageView) aVar.e(R.id.iv_icon));
                aVar.b().setOnClickListener(new a(expressionObj));
            } else {
                ImageView imageView = (ImageView) aVar.e(R.id.iv_icon);
                ((TextView) aVar.e(R.id.tv_name)).setText(expressionObj.getName());
                f.i(expressionObj, imageView);
                aVar.b().setOnClickListener(new ViewOnClickListenerC0568b(expressionObj));
            }
        }
    }

    public static c N3(List<ExpressionObj> list, Boolean bool) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{list, bool}, null, changeQuickRedirect, true, bb.c.f.UC, new Class[]{List.class, Boolean.class}, c.class);
        if (patchProxyResultProxy.isSupported) {
            return (c) patchProxyResultProxy.result;
        }
        c cVar = new c();
        Bundle bundle = new Bundle();
        bundle.putSerializable("expressionList", (ArrayList) list);
        bundle.putBoolean(TECameraSettings.G0, bool.booleanValue());
        cVar.setArguments(bundle);
        return cVar;
    }

    public void O3() {
        com.max.hbcommon.base.adapter.m<ExpressionObj> mVar;
        if (PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, bb.c.f.YC, new Class[0], Void.TYPE).isSupported || (mVar = this.f70183d) == null) {
            return;
        }
        mVar.notifyDataSetChanged();
    }

    @Override // androidx.fragment.app.Fragment
    public void onAttach(Activity activity) {
        if (PatchProxy.proxy(new Object[]{activity}, this, changeQuickRedirect, false, bb.c.f.VC, new Class[]{Activity.class}, Void.TYPE).isSupported) {
            return;
        }
        super.onAttach(activity);
        if (getParentFragment().getParentFragment() instanceof q.a) {
            this.f70182c = (q.a) getParentFragment().getParentFragment();
        } else if (getParentFragment().getParentFragment().getParentFragment() instanceof q.a) {
            this.f70182c = (q.a) getParentFragment().getParentFragment().getParentFragment();
        } else if (getActivity() instanceof q.a) {
            this.f70182c = (q.a) getActivity();
        } else {
            if (!(getActivity() instanceof com.max.hbminiprogram.h) || !(((com.max.hbminiprogram.h) getActivity()).T() instanceof q.a)) {
                throw new IllegalArgumentException("需要实现ExpressionClickListener");
            }
            this.f70182c = (q.a) ((com.max.hbminiprogram.h) getActivity()).T();
        }
        if (getParentFragment().getParentFragment() instanceof q.b) {
            this.f70184e = (q.b) getParentFragment().getParentFragment();
            return;
        }
        if (getParentFragment().getParentFragment().getParentFragment() instanceof q.b) {
            this.f70184e = (q.b) getParentFragment().getParentFragment().getParentFragment();
            return;
        }
        if (getActivity() instanceof q.b) {
            this.f70184e = (q.b) getActivity();
            return;
        }
        if ((getActivity() instanceof com.max.hbminiprogram.h) && (((com.max.hbminiprogram.h) getActivity()).T() instanceof q.b)) {
            this.f70184e = (q.b) ((com.max.hbminiprogram.h) getActivity()).T();
            return;
        }
        throw new IllegalArgumentException(activity + "需要实现ExpressionDeleteClickListener");
    }

    @Override // androidx.fragment.app.Fragment
    @p0
    public View onCreateView(LayoutInflater layoutInflater, @p0 ViewGroup viewGroup, @p0 Bundle bundle) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{layoutInflater, viewGroup, bundle}, this, changeQuickRedirect, false, bb.c.f.WC, new Class[]{LayoutInflater.class, ViewGroup.class, Bundle.class}, View.class);
        return patchProxyResultProxy.isSupported ? (View) patchProxyResultProxy.result : layoutInflater.inflate(R.layout.hbexpression_my_gridview, viewGroup, false);
    }

    @Override // androidx.fragment.app.Fragment
    public void onViewCreated(View view, @p0 Bundle bundle) {
        if (PatchProxy.proxy(new Object[]{view, bundle}, this, changeQuickRedirect, false, bb.c.f.XC, new Class[]{View.class, Bundle.class}, Void.TYPE).isSupported) {
            return;
        }
        super.onViewCreated(view, bundle);
        this.f70181b = (ArrayList) getArguments().getSerializable("expressionList");
        this.f70185f = (CustomGridView) view.findViewById(R.id.gv_expression);
        if (getArguments().getBoolean(TECameraSettings.G0, false)) {
            view.setBackgroundResource(R.color.color_collect_menu_mask);
            this.f70185f.setNumColumns(8);
        }
        ImageView imageView = (ImageView) view.findViewById(R.id.iv_dlt_emoji);
        this.f70186g = imageView;
        imageView.setOnClickListener(new a());
        b bVar = new b(getActivity(), this.f70181b);
        this.f70183d = bVar;
        this.f70185f.setAdapter((ListAdapter) bVar);
        if (this.f70181b.get(0).getType() == 1) {
            CustomGridView customGridView = this.f70185f;
            if (customGridView != null) {
                ((FrameLayout.LayoutParams) customGridView.getLayoutParams()).setMargins(ViewUtils.f(getContext(), 12.0f), ViewUtils.f(getContext(), 22.0f), ViewUtils.f(getContext(), 12.0f), 0);
                this.f70185f.setNumColumns(7);
            }
            this.f70186g.setVisibility(0);
        } else {
            CustomGridView customGridView2 = this.f70185f;
            if (customGridView2 != null) {
                ((FrameLayout.LayoutParams) customGridView2.getLayoutParams()).setMargins(ViewUtils.f(getContext(), 15.0f), ViewUtils.f(getContext(), 10.0f), ViewUtils.f(getContext(), 15.0f), 0);
                this.f70185f.setNumColumns(4);
            }
            this.f70186g.setVisibility(8);
        }
        if (getParentFragment() == null || !(getParentFragment().getParentFragment() instanceof n)) {
            return;
        }
        boolean zU3 = ((n) getParentFragment().getParentFragment()).U3();
        String strQ3 = ((n) getParentFragment().getParentFragment()).Q3();
        if (zU3) {
            if (strQ3 != null) {
                view.findViewById(R.id.vg_expression_container).setBackgroundColor(Color.parseColor(strQ3));
            } else {
                view.findViewById(R.id.vg_expression_container).setBackgroundResource(R.color.divider_secondary_2_dark_not_change_color);
            }
        }
    }
}
