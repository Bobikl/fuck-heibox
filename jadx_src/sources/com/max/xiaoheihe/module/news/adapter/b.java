package com.max.xiaoheihe.module.news.adapter;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.cardview.widget.CardView;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.max.hbcommon.base.adapter.s;
import com.max.hbutils.utils.ViewUtils;
import com.max.xiaoheihe.R;
import com.max.xiaoheihe.bean.bbs.BBSTopicObj;
import com.max.xiaoheihe.module.news.ChannelListFragment;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.PatchProxyResult;
import java.util.List;

/* JADX INFO: compiled from: ConceptTopicsAdapter.java */
/* JADX INFO: loaded from: classes12.dex */
public class b extends s<BBSTopicObj> {
    public static ChangeQuickRedirect changeQuickRedirect;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private Context f91294b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private ChannelListFragment.n f91295c;

    /* JADX INFO: compiled from: ConceptTopicsAdapter.java */
    public class a implements View.OnClickListener {
        public static ChangeQuickRedirect changeQuickRedirect;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ BBSTopicObj f91296b;

        a(BBSTopicObj bBSTopicObj) {
            this.f91296b = bBSTopicObj;
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            if (PatchProxy.proxy(new Object[]{view}, this, changeQuickRedirect, false, 42573, new Class[]{View.class}, Void.TYPE).isSupported) {
                return;
            }
            b.m(b.this, this.f91296b);
        }
    }

    /* JADX INFO: renamed from: com.max.xiaoheihe.module.news.adapter.b$b, reason: collision with other inner class name */
    /* JADX INFO: compiled from: ConceptTopicsAdapter.java */
    public class ViewOnClickListenerC0843b implements View.OnClickListener {
        public static ChangeQuickRedirect changeQuickRedirect;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ BBSTopicObj f91298b;

        ViewOnClickListenerC0843b(BBSTopicObj bBSTopicObj) {
            this.f91298b = bBSTopicObj;
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            if (PatchProxy.proxy(new Object[]{view}, this, changeQuickRedirect, false, 42574, new Class[]{View.class}, Void.TYPE).isSupported) {
                return;
            }
            if (b.this.f91295c == null || !b.this.f91295c.a()) {
                com.max.xiaoheihe.module.bbs.utils.b.I(b.this.f91294b, this.f91298b, "link");
            } else {
                b.m(b.this, this.f91298b);
            }
        }
    }

    public b(Context context, List<BBSTopicObj> list, ChannelListFragment.n nVar) {
        super(context, list, R.layout.item_concept_topic);
        this.f91294b = context;
        this.f91295c = nVar;
    }

    static /* synthetic */ void m(b bVar, BBSTopicObj bBSTopicObj) {
        if (PatchProxy.proxy(new Object[]{bVar, bBSTopicObj}, null, changeQuickRedirect, true, 42572, new Class[]{b.class, BBSTopicObj.class}, Void.TYPE).isSupported) {
            return;
        }
        bVar.t(bBSTopicObj);
    }

    public static int[] p(Context context) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{context}, null, changeQuickRedirect, true, 42569, new Class[]{Context.class}, int[].class);
        if (patchProxyResultProxy.isSupported) {
            return (int[]) patchProxyResultProxy.result;
        }
        int iL = (ViewUtils.L(context) - ViewUtils.f(context, 20.0f)) / 4;
        return new int[]{iL, (iL * 100) / 89};
    }

    public static int[] q(Context context) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{context}, null, changeQuickRedirect, true, 42568, new Class[]{Context.class}, int[].class);
        if (patchProxyResultProxy.isSupported) {
            return (int[]) patchProxyResultProxy.result;
        }
        int iL = (ViewUtils.L(context) - ViewUtils.f(context, 36.0f)) / 4;
        return new int[]{iL, (iL * 129) / 110};
    }

    public static int r(Context context) {
        return 4;
    }

    private void t(BBSTopicObj bBSTopicObj) {
        if (PatchProxy.proxy(new Object[]{bBSTopicObj}, this, changeQuickRedirect, false, 42567, new Class[]{BBSTopicObj.class}, Void.TYPE).isSupported) {
            return;
        }
        if (this.f91295c.e(bBSTopicObj)) {
            this.f91295c.b(bBSTopicObj);
            notifyItemChanged(getDataList().indexOf(bBSTopicObj));
        } else if (this.f91295c.getCount() < 8) {
            this.f91295c.d(bBSTopicObj);
            notifyItemChanged(getDataList().indexOf(bBSTopicObj));
        } else {
            com.max.hbutils.utils.c cVar = com.max.hbutils.utils.c.f73533a;
            com.max.hbutils.utils.c.f("最多添加8个置顶社区");
        }
    }

    public static void u(s.e eVar, BBSTopicObj bBSTopicObj) {
        if (PatchProxy.proxy(new Object[]{eVar, bBSTopicObj}, null, changeQuickRedirect, true, 42570, new Class[]{s.e.class, BBSTopicObj.class}, Void.TYPE).isSupported) {
            return;
        }
        ImageView imageView = (ImageView) eVar.i(R.id.iv_bg);
        ImageView imageView2 = (ImageView) eVar.i(R.id.iv_icon);
        ImageView imageView3 = (ImageView) eVar.i(R.id.iv_hot);
        ViewGroup viewGroup = (ViewGroup) eVar.i(R.id.vg_name);
        TextView textView = (TextView) eVar.i(R.id.tv_name);
        com.max.hbimage.b.L(bBSTopicObj.getBg_pic_url(), imageView, R.drawable.common_default_placeholder_375x210);
        Context context = imageView.getContext();
        com.max.hbimage.b.d0(bBSTopicObj.getSmall_pic_url(), imageView2, ViewUtils.m(context, ViewUtils.f(context, 50.0f), ViewUtils.f(context, 50.0f)));
        ConstraintLayout.LayoutParams layoutParams = (ConstraintLayout.LayoutParams) viewGroup.getLayoutParams();
        if (ViewUtils.L(context) >= ViewUtils.f(context, 360.0f)) {
            ((ViewGroup.MarginLayoutParams) layoutParams).topMargin = ViewUtils.f(context, 10.0f);
            textView.setTextSize(1, 11.0f);
            imageView3.getLayoutParams().width = ViewUtils.f(context, 8.0f);
            imageView3.getLayoutParams().height = ViewUtils.f(context, 10.0f);
        } else {
            ((ViewGroup.MarginLayoutParams) layoutParams).topMargin = ViewUtils.f(context, 8.0f);
            textView.setTextSize(1, 10.0f);
        }
        textView.setText(bBSTopicObj.getName());
        if (bBSTopicObj.getHot() == null || com.max.hbcommon.utils.c.u(bBSTopicObj.getHot().getLevel())) {
            imageView3.setVisibility(8);
            return;
        }
        imageView3.setVisibility(0);
        if ("3".equals(bBSTopicObj.getHot().getLevel())) {
            imageView3.setImageResource(R.drawable.ic_topic_hot_level3);
        } else if ("2".equals(bBSTopicObj.getHot().getLevel())) {
            imageView3.setImageResource(R.drawable.ic_topic_hot_level2);
        } else {
            imageView3.setImageResource(R.drawable.ic_topic_hot_level1);
        }
    }

    @Override // com.max.hbcommon.base.adapter.s
    public /* bridge */ /* synthetic */ void onBindViewHolder(s.e eVar, BBSTopicObj bBSTopicObj) {
        if (PatchProxy.proxy(new Object[]{eVar, bBSTopicObj}, this, changeQuickRedirect, false, 42571, new Class[]{s.e.class, Object.class}, Void.TYPE).isSupported) {
            return;
        }
        s(eVar, bBSTopicObj);
    }

    public void s(s.e eVar, BBSTopicObj bBSTopicObj) {
        if (PatchProxy.proxy(new Object[]{eVar, bBSTopicObj}, this, changeQuickRedirect, false, 42566, new Class[]{s.e.class, BBSTopicObj.class}, Void.TYPE).isSupported) {
            return;
        }
        View viewB = eVar.b();
        CardView cardView = (CardView) eVar.i(R.id.cv_root);
        int[] iArrP = this.f91295c != null ? p(this.f91294b) : q(this.f91294b);
        ViewGroup.LayoutParams layoutParams = cardView.getLayoutParams();
        int i10 = layoutParams.width;
        int i11 = iArrP[0];
        if (i10 != i11) {
            layoutParams.width = i11;
        }
        int i12 = layoutParams.height;
        int i13 = iArrP[1];
        if (i12 != i13) {
            layoutParams.height = i13;
        }
        ImageView imageView = (ImageView) eVar.i(R.id.iv_checked);
        ImageView imageView2 = (ImageView) eVar.i(R.id.iv_subscribe);
        u(eVar, bBSTopicObj);
        ChannelListFragment.n nVar = this.f91295c;
        int i14 = 8;
        if (nVar != null) {
            if (nVar.a() && !BBSTopicObj.TOPIC_ID_FORBID.equals(bBSTopicObj.getTopic_id())) {
                i14 = 0;
            }
            imageView.setVisibility(i14);
            if (this.f91295c.e(bBSTopicObj)) {
                imageView.setImageResource(R.drawable.checked_icon_16x16);
            } else {
                imageView.setImageResource(R.drawable.unchecked_icon_16x16);
            }
            imageView.setOnClickListener(new a(bBSTopicObj));
            if (!this.f91295c.a() && this.f91295c.e(bBSTopicObj)) {
                imageView2.setVisibility(0);
            }
        } else {
            imageView.setVisibility(8);
            imageView2.setVisibility(8);
        }
        viewB.setOnClickListener(new ViewOnClickListenerC0843b(bBSTopicObj));
    }
}
