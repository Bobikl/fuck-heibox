package com.max.xiaoheihe.module.news.adapter;

import android.content.Context;
import android.content.Intent;
import android.view.View;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import android.widget.TextView;
import androidx.cardview.widget.CardView;
import com.max.hbcommon.base.adapter.s;
import com.max.hbutils.utils.ViewUtils;
import com.max.xiaoheihe.R;
import com.max.xiaoheihe.bean.bbs.BBSTopicObj;
import com.max.xiaoheihe.module.game.d0;
import com.max.xiaoheihe.module.news.ChannelListFragment;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import java.util.List;

/* JADX INFO: compiled from: ConceptTopicsHorizonAdapter.java */
/* JADX INFO: loaded from: classes12.dex */
public class c extends s<BBSTopicObj> {
    public static ChangeQuickRedirect changeQuickRedirect;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private Context f91300b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private ChannelListFragment.n f91301c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private String f91302d;

    /* JADX INFO: compiled from: ConceptTopicsHorizonAdapter.java */
    public class a implements View.OnClickListener {
        public static ChangeQuickRedirect changeQuickRedirect;

        a() {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            if (PatchProxy.proxy(new Object[]{view}, this, changeQuickRedirect, false, 42579, new Class[]{View.class}, Void.TYPE).isSupported) {
                return;
            }
            Intent intent = new Intent();
            intent.setAction("com.max.xiaoheihe.concept.channel");
            c.this.f91300b.sendBroadcast(intent);
        }
    }

    /* JADX INFO: compiled from: ConceptTopicsHorizonAdapter.java */
    public class b implements View.OnClickListener {
        public static ChangeQuickRedirect changeQuickRedirect;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ BBSTopicObj f91304b;

        b(BBSTopicObj bBSTopicObj) {
            this.f91304b = bBSTopicObj;
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            if (PatchProxy.proxy(new Object[]{view}, this, changeQuickRedirect, false, 42580, new Class[]{View.class}, Void.TYPE).isSupported) {
                return;
            }
            c.n(c.this, this.f91304b);
        }
    }

    /* JADX INFO: renamed from: com.max.xiaoheihe.module.news.adapter.c$c, reason: collision with other inner class name */
    /* JADX INFO: compiled from: ConceptTopicsHorizonAdapter.java */
    public class ViewOnClickListenerC0844c implements View.OnClickListener {
        public static ChangeQuickRedirect changeQuickRedirect;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ ImageView f91306b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ BBSTopicObj f91307c;

        ViewOnClickListenerC0844c(ImageView imageView, BBSTopicObj bBSTopicObj) {
            this.f91306b = imageView;
            this.f91307c = bBSTopicObj;
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            if (PatchProxy.proxy(new Object[]{view}, this, changeQuickRedirect, false, 42581, new Class[]{View.class}, Void.TYPE).isSupported) {
                return;
            }
            if (this.f91306b.getVisibility() == 0) {
                com.max.hbcache.c.z("topic_entry_dot_shown", "1");
                this.f91306b.setVisibility(8);
            }
            if (c.this.f91301c == null || !c.this.f91301c.a()) {
                com.max.xiaoheihe.module.bbs.utils.b.I(c.this.f91300b, this.f91307c, !com.max.hbcommon.utils.c.u(c.this.f91302d) ? "news" : "link");
            } else {
                c.n(c.this, this.f91307c);
            }
        }
    }

    public c(Context context, List<BBSTopicObj> list, ChannelListFragment.n nVar) {
        this(context, list, nVar, null);
    }

    public c(Context context, List<BBSTopicObj> list, ChannelListFragment.n nVar, String str) {
        super(context, list, R.layout.item_concept_topic_horizon);
        this.f91300b = context;
        this.f91301c = nVar;
        this.f91302d = str;
    }

    static /* synthetic */ void n(c cVar, BBSTopicObj bBSTopicObj) {
        if (PatchProxy.proxy(new Object[]{cVar, bBSTopicObj}, null, changeQuickRedirect, true, 42578, new Class[]{c.class, BBSTopicObj.class}, Void.TYPE).isSupported) {
            return;
        }
        cVar.r(bBSTopicObj);
    }

    private void r(BBSTopicObj bBSTopicObj) {
        if (PatchProxy.proxy(new Object[]{bBSTopicObj}, this, changeQuickRedirect, false, 42576, new Class[]{BBSTopicObj.class}, Void.TYPE).isSupported) {
            return;
        }
        this.f91301c.b(bBSTopicObj);
    }

    @Override // com.max.hbcommon.base.adapter.s
    public /* bridge */ /* synthetic */ void onBindViewHolder(s.e eVar, BBSTopicObj bBSTopicObj) {
        if (PatchProxy.proxy(new Object[]{eVar, bBSTopicObj}, this, changeQuickRedirect, false, 42577, new Class[]{s.e.class, Object.class}, Void.TYPE).isSupported) {
            return;
        }
        q(eVar, bBSTopicObj);
    }

    public void q(s.e eVar, BBSTopicObj bBSTopicObj) {
        if (PatchProxy.proxy(new Object[]{eVar, bBSTopicObj}, this, changeQuickRedirect, false, 42575, new Class[]{s.e.class, BBSTopicObj.class}, Void.TYPE).isSupported) {
            return;
        }
        View viewB = eVar.b();
        boolean z10 = !com.max.hbcommon.utils.c.x(com.max.hbcache.c.j("topic_entry_dot_shown"));
        CardView cardView = (CardView) eVar.i(R.id.cv_root);
        ImageView imageView = (ImageView) eVar.i(R.id.iv_bg);
        ImageView imageView2 = (ImageView) eVar.i(R.id.iv_icon);
        RelativeLayout relativeLayout = (RelativeLayout) eVar.i(R.id.rl_content);
        cardView.setRadius(ViewUtils.o(this.f91300b, cardView));
        ImageView imageView3 = (ImageView) eVar.i(R.id.iv_checked);
        ImageView imageView4 = (ImageView) eVar.i(R.id.iv_dot);
        ImageView imageView5 = (ImageView) eVar.i(R.id.iv_corner_tag);
        TextView textView = (TextView) eVar.i(R.id.tv_name);
        if (bBSTopicObj.getHb3style() == null || com.max.hbcommon.utils.c.u(bBSTopicObj.getHb3style().getCorner_img())) {
            imageView5.setVisibility(8);
        } else {
            imageView5.setVisibility(0);
            com.max.hbimage.b.K(bBSTopicObj.getHb3style().getCorner_img(), imageView5);
        }
        if (z10 && eVar.getAdapterPosition() == 0 && d0.f87251w.equals(bBSTopicObj.getName())) {
            imageView4.setVisibility(0);
        } else {
            imageView4.setVisibility(8);
        }
        if (!com.max.hbcommon.utils.c.u(bBSTopicObj.getVirtual_topic_tag())) {
            imageView3.setVisibility(8);
            imageView2.setVisibility(0);
            if (BBSTopicObj.VIRTUAL_TAG_MORE.equals(bBSTopicObj.getVirtual_topic_tag())) {
                imageView.setImageResource(R.color.interactive_color);
                textView.setText("全部社区");
                viewB.setOnClickListener(new a());
                return;
            }
            return;
        }
        textView.setText(bBSTopicObj.getName());
        ChannelListFragment.n nVar = this.f91301c;
        if (nVar != null) {
            imageView3.setVisibility(nVar.a() ? 0 : 8);
            imageView3.setOnClickListener(new b(bBSTopicObj));
        } else {
            imageView3.setVisibility(8);
        }
        if (this.f91301c != null) {
            ((RelativeLayout.LayoutParams) relativeLayout.getLayoutParams()).topMargin = ViewUtils.f(this.f91300b, 6.0f);
        } else {
            ((RelativeLayout.LayoutParams) relativeLayout.getLayoutParams()).topMargin = 0;
        }
        imageView2.setVisibility(8);
        com.max.hbimage.b.K(bBSTopicObj.getSmall_pic_url(), imageView);
        viewB.setOnClickListener(new ViewOnClickListenerC0844c(imageView4, bBSTopicObj));
    }
}
