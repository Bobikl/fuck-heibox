package com.max.xiaoheihe.view;

import android.content.Context;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.max.hbcommon.component.ExpandMoreButton;
import com.max.hbcustomview.RowView;
import com.max.xiaoheihe.R;
import com.max.xiaoheihe.bean.bbs.BBSCommentObj;
import com.max.xiaoheihe.bean.bbs.BBSSubCommentsObj;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.PatchProxyResult;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes13.dex */
public class SubCommentView extends RowView<BBSCommentObj> {
    public static ChangeQuickRedirect changeQuickRedirect;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    private List<BBSCommentObj> f95837o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    private boolean f95838p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    private int f95839q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    private String f95840r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    private boolean f95841s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    private boolean f95842t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public View.OnClickListener f95843u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    private View.OnClickListener f95844v;

    public class a implements View.OnClickListener {
        public static ChangeQuickRedirect changeQuickRedirect;

        a() {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            if (PatchProxy.proxy(new Object[]{view}, this, changeQuickRedirect, false, 49487, new Class[]{View.class}, Void.TYPE).isSupported || SubCommentView.this.f95841s) {
                return;
            }
            SubCommentView.this.f95841s = true;
            SubCommentView.this.f95844v.onClick(view);
        }
    }

    public SubCommentView(Context context) {
        super(context);
        this.f95837o = new ArrayList();
        this.f95838p = false;
        this.f95841s = false;
        this.f95842t = false;
        this.f95843u = new a();
    }

    public SubCommentView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f95837o = new ArrayList();
        this.f95838p = false;
        this.f95841s = false;
        this.f95842t = false;
        this.f95843u = new a();
    }

    private void r() {
        if (PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 49485, new Class[0], Void.TYPE).isSupported) {
            return;
        }
        View viewInflate = LayoutInflater.from(getContext()).inflate(R.layout.table_row_more_comment, (ViewGroup) this, false);
        viewInflate.setVisibility(s() ? 0 : 8);
        ExpandMoreButton expandMoreButton = (ExpandMoreButton) viewInflate.findViewById(R.id.emb);
        View viewFindViewById = viewInflate.findViewById(R.id.v_divider);
        expandMoreButton.setBackgroundResource(R.color.transparent);
        if (this.f95837o.get(0).isIs_loaded()) {
            expandMoreButton.setText("查看更多回复");
        } else {
            expandMoreButton.setText("全部 " + this.f95839q + " 条回复");
        }
        if (this.f95842t) {
            expandMoreButton.setBackgroundColor(0);
            expandMoreButton.setColor(com.max.xiaoheihe.utils.d.E(R.color.white_alpha60));
            viewFindViewById.setBackgroundResource(R.color.white_alpha10);
        }
        viewInflate.setOnClickListener(this.f95843u);
        setmFooter(viewInflate);
        if (viewInflate.getVisibility() == 0) {
            setPadding(getPaddingLeft(), getPaddingTop(), getPaddingRight(), 0);
        } else {
            setPadding(getPaddingLeft(), getPaddingTop(), getPaddingRight(), getPaddingTop());
        }
    }

    private void t() {
        if (PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 49484, new Class[0], Void.TYPE).isSupported) {
            return;
        }
        r();
        ArrayList arrayList = new ArrayList();
        arrayList.addAll(this.f95837o);
        arrayList.remove(0);
        j(arrayList);
    }

    public String getmLastVal() {
        return this.f95840r;
    }

    @Override // com.max.hbcustomview.RowView
    public View l(int i10) {
        List<T> list;
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{new Integer(i10)}, this, changeQuickRedirect, false, 49486, new Class[]{Integer.TYPE}, View.class);
        if (patchProxyResultProxy.isSupported) {
            return (View) patchProxyResultProxy.result;
        }
        if (!ad.a.a(ad.a.f1215v, false)) {
            return super.l(i10);
        }
        if (this.f68786f.size() <= i10 || (list = this.f68784d) == 0 || list.size() <= i10) {
            return null;
        }
        BBSCommentObj bBSCommentObj = com.max.hbcommon.utils.c.w(this.f95837o) ? null : this.f95837o.get(0);
        View view = this.f68786f.get(i10);
        if (this.f68783c != null && view != null) {
            Object tag = view.getTag(R.id.tag_viewholder);
            if (tag instanceof com.max.hbcustomview.h) {
                com.max.hbcustomview.h hVar = (com.max.hbcustomview.h) tag;
                hVar.y(i10);
                hVar.w(RowView.h(this.f68784d));
                hVar.z(bBSCommentObj);
                this.f68783c.a(hVar, g(i10));
            }
        }
        return view;
    }

    public void p(BBSSubCommentsObj bBSSubCommentsObj) {
        if (PatchProxy.proxy(new Object[]{bBSSubCommentsObj}, this, changeQuickRedirect, false, 49482, new Class[]{BBSSubCommentsObj.class}, Void.TYPE).isSupported) {
            return;
        }
        this.f95841s = false;
        this.f95838p = com.max.hbcommon.utils.c.x(bBSSubCommentsObj.getHas_more());
        this.f95837o.get(0).setHas_more(bBSSubCommentsObj.getHas_more());
        this.f95837o.get(0).setIs_loaded(true);
        this.f95840r = bBSSubCommentsObj.getLastval();
        for (BBSCommentObj bBSCommentObj : bBSSubCommentsObj.getComments()) {
            if (!this.f95837o.contains(bBSCommentObj)) {
                this.f95837o.add(bBSCommentObj);
            }
        }
        t();
    }

    public void q() {
        this.f95841s = false;
    }

    public boolean s() {
        return this.f95838p;
    }

    public void setCheckMoreListener(View.OnClickListener onClickListener) {
        this.f95844v = onClickListener;
    }

    public void setTotalList(List<BBSCommentObj> list) {
        if (PatchProxy.proxy(new Object[]{list}, this, changeQuickRedirect, false, 49483, new Class[]{List.class}, Void.TYPE).isSupported || list == null || list.size() <= 0) {
            return;
        }
        this.f95837o = list;
        for (int size = list.size() - 1; size >= 0; size--) {
            if (!this.f95837o.get(size).isIs_local()) {
                this.f95840r = this.f95837o.get(size).getCommentid();
                break;
            }
        }
        this.f95838p = com.max.hbcommon.utils.c.x(this.f95837o.get(0).hasMoreComment());
        this.f95839q = com.max.hbutils.utils.n.q(this.f95837o.get(0).getChildNum());
        t();
    }

    public void setTransparentBg(boolean z10) {
        this.f95842t = z10;
    }
}
