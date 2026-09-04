package com.max.xiaoheihe.module.bbs.adapter;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.widget.CheckBox;
import android.widget.CompoundButton;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.max.hbcommon.bean.analytics.PageEventObj;
import com.max.hbutils.utils.ViewUtils;
import com.max.xiaoheihe.R;
import com.max.xiaoheihe.bean.bbs.BBSTopicCategoryObj;
import com.max.xiaoheihe.bean.bbs.BBSTopicObj;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.PatchProxyResult;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: compiled from: TopicsChooseAdapter.java */
/* JADX INFO: loaded from: classes10.dex */
public class w extends com.max.hbcommon.base.adapter.s<BBSTopicCategoryObj> {
    public static ChangeQuickRedirect changeQuickRedirect;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private b f80718b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private ArrayList<BBSTopicObj> f80719c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private int f80720d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private Context f80721e;

    /* JADX INFO: compiled from: TopicsChooseAdapter.java */
    public class a implements View.OnClickListener {
        public static ChangeQuickRedirect changeQuickRedirect;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ BBSTopicCategoryObj f80722b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ RecyclerView f80723c;

        a(BBSTopicCategoryObj bBSTopicCategoryObj, RecyclerView recyclerView) {
            this.f80722b = bBSTopicCategoryObj;
            this.f80723c = recyclerView;
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            if (PatchProxy.proxy(new Object[]{view}, this, changeQuickRedirect, false, 27481, new Class[]{View.class}, Void.TYPE).isSupported) {
                return;
            }
            this.f80722b.setIsExpanded("1");
            ((c) this.f80723c.getAdapter()).setDataList(this.f80722b.getChildren());
            this.f80723c.getAdapter().notifyDataSetChanged();
            view.setVisibility(8);
        }
    }

    /* JADX INFO: compiled from: TopicsChooseAdapter.java */
    public interface b {
        void K(ArrayList<BBSTopicObj> arrayList);
    }

    /* JADX INFO: compiled from: TopicsChooseAdapter.java */
    public class c extends com.max.hbcommon.base.adapter.u<BBSTopicObj> {
        public static ChangeQuickRedirect changeQuickRedirect;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private boolean f80725b;

        /* JADX INFO: compiled from: TopicsChooseAdapter.java */
        public class a implements View.OnClickListener {
            public static ChangeQuickRedirect changeQuickRedirect;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            final /* synthetic */ CheckBox f80727b;

            a(CheckBox checkBox) {
                this.f80727b = checkBox;
            }

            @Override // android.view.View.OnClickListener
            public void onClick(View view) {
                if (PatchProxy.proxy(new Object[]{view}, this, changeQuickRedirect, false, 27485, new Class[]{View.class}, Void.TYPE).isSupported) {
                    return;
                }
                this.f80727b.performClick();
            }
        }

        /* JADX INFO: compiled from: TopicsChooseAdapter.java */
        public class b implements CompoundButton.OnCheckedChangeListener {
            public static ChangeQuickRedirect changeQuickRedirect;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            final /* synthetic */ BBSTopicObj f80729b;

            b(BBSTopicObj bBSTopicObj) {
                this.f80729b = bBSTopicObj;
            }

            @Override // android.widget.CompoundButton.OnCheckedChangeListener
            public void onCheckedChanged(CompoundButton compoundButton, boolean z10) {
                if (PatchProxy.proxy(new Object[]{compoundButton, new Byte(z10 ? (byte) 1 : (byte) 0)}, this, changeQuickRedirect, false, 27486, new Class[]{CompoundButton.class, Boolean.TYPE}, Void.TYPE).isSupported) {
                    return;
                }
                if (!z10) {
                    w.this.f80719c.remove(this.f80729b);
                    w.this.notifyDataSetChanged();
                    w.this.f80718b.K(w.this.f80719c);
                    return;
                }
                if (w.this.f80719c.size() < w.this.f80720d) {
                    w.this.f80719c.add(this.f80729b);
                    w.this.notifyDataSetChanged();
                    w.this.f80718b.K(w.this.f80719c);
                    if (c.this.f80725b) {
                        w.this.q();
                        return;
                    }
                    return;
                }
                com.max.hbutils.utils.c cVar = com.max.hbutils.utils.c.f73533a;
                com.max.hbutils.utils.c.f("最多选择" + w.this.f80720d + "个社区");
                compoundButton.setChecked(false);
            }
        }

        public c(Context context, List<BBSTopicObj> list, boolean z10) {
            super(context, list);
            this.f80725b = z10;
        }

        @Override // com.max.hbcommon.base.adapter.u
        public /* bridge */ /* synthetic */ int m(int i10, BBSTopicObj bBSTopicObj) {
            Object[] objArr = {new Integer(i10), bBSTopicObj};
            ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
            Class cls = Integer.TYPE;
            PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(objArr, this, changeQuickRedirect2, false, 27483, new Class[]{cls, Object.class}, cls);
            return patchProxyResultProxy.isSupported ? ((Integer) patchProxyResultProxy.result).intValue() : o(i10, bBSTopicObj);
        }

        public int o(int i10, BBSTopicObj bBSTopicObj) {
            return R.layout.item_bbs_topic;
        }

        @Override // com.max.hbcommon.base.adapter.s
        public /* bridge */ /* synthetic */ void onBindViewHolder(com.max.hbcommon.base.adapter.s.e eVar, Object obj) {
            if (PatchProxy.proxy(new Object[]{eVar, obj}, this, changeQuickRedirect, false, 27484, new Class[]{com.max.hbcommon.base.adapter.s.e.class, Object.class}, Void.TYPE).isSupported) {
                return;
            }
            p(eVar, (BBSTopicObj) obj);
        }

        public void p(com.max.hbcommon.base.adapter.s.e eVar, BBSTopicObj bBSTopicObj) {
            if (PatchProxy.proxy(new Object[]{eVar, bBSTopicObj}, this, changeQuickRedirect, false, 27482, new Class[]{com.max.hbcommon.base.adapter.s.e.class, BBSTopicObj.class}, Void.TYPE).isSupported) {
                return;
            }
            ImageView imageView = (ImageView) eVar.i(R.id.iv_icon);
            com.max.hbimage.b.d0(bBSTopicObj.getPic_url(), imageView, ViewUtils.f(imageView.getContext(), 2.0f));
            eVar.p(R.id.tv_name, bBSTopicObj.getName());
            CheckBox checkBox = (CheckBox) eVar.i(R.id.cb_topic);
            checkBox.setVisibility(0);
            checkBox.setOnCheckedChangeListener(null);
            if (w.this.f80719c == null || !w.this.f80719c.contains(bBSTopicObj)) {
                checkBox.setChecked(false);
            } else {
                checkBox.setChecked(true);
            }
            eVar.b().setOnClickListener(new a(checkBox));
            checkBox.setOnCheckedChangeListener(new b(bBSTopicObj));
        }

        public void q(boolean z10) {
            this.f80725b = z10;
        }
    }

    public w(Context context, List<BBSTopicCategoryObj> list, ArrayList<BBSTopicObj> arrayList, int i10, b bVar) {
        super(context, list, R.layout.item_bbs_topic_group);
        this.f80721e = context;
        this.f80718b = bVar;
        this.f80720d = i10;
        if (arrayList != null) {
            this.f80719c = arrayList;
        }
    }

    @Override // com.max.hbcommon.base.adapter.s
    public /* bridge */ /* synthetic */ void onBindViewHolder(com.max.hbcommon.base.adapter.s.e eVar, BBSTopicCategoryObj bBSTopicCategoryObj) {
        if (PatchProxy.proxy(new Object[]{eVar, bBSTopicCategoryObj}, this, changeQuickRedirect, false, 27479, new Class[]{com.max.hbcommon.base.adapter.s.e.class, Object.class}, Void.TYPE).isSupported) {
            return;
        }
        p(eVar, bBSTopicCategoryObj);
    }

    @Override // com.max.hbcommon.base.adapter.s, androidx.recyclerview.widget.RecyclerView.Adapter
    public /* bridge */ /* synthetic */ RecyclerView.ViewHolder onCreateViewHolder(ViewGroup viewGroup, int i10) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{viewGroup, new Integer(i10)}, this, changeQuickRedirect, false, 27480, new Class[]{ViewGroup.class, Integer.TYPE}, RecyclerView.ViewHolder.class);
        return patchProxyResultProxy.isSupported ? (RecyclerView.ViewHolder) patchProxyResultProxy.result : onCreateViewHolder(viewGroup, i10);
    }

    @Override // com.max.hbcommon.base.adapter.s, androidx.recyclerview.widget.RecyclerView.Adapter
    public com.max.hbcommon.base.adapter.s.e onCreateViewHolder(ViewGroup viewGroup, int i10) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{viewGroup, new Integer(i10)}, this, changeQuickRedirect, false, 27476, new Class[]{ViewGroup.class, Integer.TYPE}, com.max.hbcommon.base.adapter.s.e.class);
        if (patchProxyResultProxy.isSupported) {
            return (com.max.hbcommon.base.adapter.s.e) patchProxyResultProxy.result;
        }
        com.max.hbcommon.base.adapter.s.e eVarOnCreateViewHolder = super.onCreateViewHolder(viewGroup, i10);
        ((RecyclerView) eVarOnCreateViewHolder.i(R.id.rv_topic)).setLayoutManager(new GridLayoutManager(this.f80721e, 2));
        TextView textView = (TextView) eVarOnCreateViewHolder.i(R.id.tv_layout_all_arrow);
        bb.d.d(textView, 0);
        textView.setText(lb.b.f131094j);
        return eVarOnCreateViewHolder;
    }

    public void p(com.max.hbcommon.base.adapter.s.e eVar, BBSTopicCategoryObj bBSTopicCategoryObj) {
        if (PatchProxy.proxy(new Object[]{eVar, bBSTopicCategoryObj}, this, changeQuickRedirect, false, 27477, new Class[]{com.max.hbcommon.base.adapter.s.e.class, BBSTopicCategoryObj.class}, Void.TYPE).isSupported) {
            return;
        }
        eVar.p(R.id.tv_name, bBSTopicCategoryObj.getName());
        RecyclerView.LayoutParams layoutParams = (RecyclerView.LayoutParams) eVar.b().getLayoutParams();
        if (eVar.getAdapterPosition() == getDataList().size() - 1) {
            ((ViewGroup.MarginLayoutParams) layoutParams).bottomMargin = ViewUtils.f(this.f80721e, 4.0f);
        } else {
            ((ViewGroup.MarginLayoutParams) layoutParams).bottomMargin = 0;
        }
        RecyclerView recyclerView = (RecyclerView) eVar.i(R.id.rv_topic);
        View viewI = eVar.i(R.id.vg_all);
        ArrayList arrayList = new ArrayList();
        if (bBSTopicCategoryObj.getChildren().size() <= 10 || com.max.hbcommon.utils.c.u(bBSTopicCategoryObj.getKey()) || com.max.hbcommon.utils.c.x(bBSTopicCategoryObj.getIsExpanded())) {
            for (int i10 = 0; i10 < bBSTopicCategoryObj.getChildren().size(); i10++) {
                if (!BBSTopicObj.TOPIC_ID_FORBID.equals(bBSTopicCategoryObj.getChildren().get(i10).getTopic_id())) {
                    arrayList.add(bBSTopicCategoryObj.getChildren().get(i10));
                }
            }
            viewI.setVisibility(8);
        } else {
            for (int i11 = 0; i11 < 10; i11++) {
                if (!BBSTopicObj.TOPIC_ID_FORBID.equals(bBSTopicCategoryObj.getChildren().get(i11).getTopic_id())) {
                    arrayList.add(bBSTopicCategoryObj.getChildren().get(i11));
                }
            }
            viewI.setVisibility(0);
        }
        if (recyclerView.getAdapter() != null) {
            ((c) recyclerView.getAdapter()).setDataList(arrayList);
            ((c) recyclerView.getAdapter()).q("rec".equals(bBSTopicCategoryObj.getKey()));
            recyclerView.getAdapter().notifyDataSetChanged();
        } else {
            recyclerView.setAdapter(new c(this.f80721e, arrayList, "rec".equals(bBSTopicCategoryObj.getKey())));
        }
        eVar.i(R.id.vg_all).setOnClickListener(new a(bBSTopicCategoryObj, recyclerView));
    }

    public void q() {
        if (PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 27478, new Class[0], Void.TYPE).isSupported) {
            return;
        }
        PageEventObj pageEventObj = new PageEventObj();
        pageEventObj.setTime(String.valueOf(System.currentTimeMillis() / 1000));
        pageEventObj.setPath(lb.d.J0);
        pageEventObj.setType("4");
        com.max.hbcommon.analytics.d.c(pageEventObj, true);
    }
}
