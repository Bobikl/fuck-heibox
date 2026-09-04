package com.max.xiaoheihe.module.game.adapter.recommend.binder;

import android.content.Context;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.max.hbutils.utils.ViewUtils;
import com.max.xiaoheihe.R;
import com.max.xiaoheihe.bean.game.recommend.FactoryListObj;
import com.max.xiaoheihe.bean.game.recommend.FactoryObj;
import com.max.xiaoheihe.bean.game.recommend.GameRecommendBaseObj;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import java.util.ArrayList;
import kotlin.jvm.internal.f0;

/* JADX INFO: compiled from: FactoryListVHB.kt */
/* JADX INFO: loaded from: classes11.dex */
@androidx.compose.runtime.internal.o(parameters = 0)
public final class b extends r {
    public static ChangeQuickRedirect changeQuickRedirect = null;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public static final int f86088h = 8;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    @dl.d
    private RecommendVHBParam f86089g;

    /* JADX INFO: compiled from: FactoryListVHB.kt */
    public static final class a extends com.max.hbcommon.base.adapter.s<FactoryObj> {
        public static ChangeQuickRedirect changeQuickRedirect;

        /* JADX INFO: renamed from: com.max.xiaoheihe.module.game.adapter.recommend.binder.b$a$a, reason: collision with other inner class name */
        /* JADX INFO: compiled from: FactoryListVHB.kt */
        public static final class ViewOnClickListenerC0775a implements View.OnClickListener {
            public static ChangeQuickRedirect changeQuickRedirect;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            final /* synthetic */ b f86091b;

            /* JADX INFO: renamed from: c, reason: collision with root package name */
            final /* synthetic */ FactoryObj f86092c;

            ViewOnClickListenerC0775a(b bVar, FactoryObj factoryObj) {
                this.f86091b = bVar;
                this.f86092c = factoryObj;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                if (PatchProxy.proxy(new Object[]{view}, this, changeQuickRedirect, false, 35950, new Class[]{View.class}, Void.TYPE).isSupported) {
                    return;
                }
                com.max.xiaoheihe.base.router.b.k0(this.f86091b.v().b(), this.f86092c.getProt());
            }
        }

        a(Context context, ArrayList<FactoryObj> arrayList) {
            super(context, arrayList, R.layout.item_img);
        }

        public void m(@dl.e com.max.hbcommon.base.adapter.s.e eVar, @dl.e FactoryObj factoryObj) {
            if (PatchProxy.proxy(new Object[]{eVar, factoryObj}, this, changeQuickRedirect, false, 35948, new Class[]{com.max.hbcommon.base.adapter.s.e.class, FactoryObj.class}, Void.TYPE).isSupported || eVar == null) {
                return;
            }
            b bVar = b.this;
            if (factoryObj != null) {
                ImageView iv_icon = (ImageView) eVar.i(R.id.iv_icon);
                View viewI = eVar.i(R.id.v_gradient_1);
                View viewI2 = eVar.i(R.id.v_gradient_2);
                TextView textView = (TextView) eVar.i(R.id.tv_factory);
                ImageView imageView = (ImageView) eVar.i(R.id.iv_authentication);
                if (iv_icon != null) {
                    f0.o(iv_icon, "iv_icon");
                    com.max.hbimage.b.H(factoryObj.getImg(), iv_icon);
                    iv_icon.setOnClickListener(new ViewOnClickListenerC0775a(bVar, factoryObj));
                }
                if (textView != null) {
                    textView.setText(factoryObj.getName());
                }
                int iE1 = !com.max.hbcommon.utils.c.u(factoryObj.getColor()) ? com.max.xiaoheihe.utils.d.e1(factoryObj.getColor()) : bVar.v().b().getResources().getColor(R.color.text_primary_1_color);
                if (viewI != null) {
                    viewI.setBackground(ViewUtils.P(0, ViewUtils.k(0.0f, iE1), ViewUtils.k(1.0f, iE1)));
                }
                if (viewI2 != null) {
                    viewI2.setBackground(com.max.hbutils.utils.q.v(bVar.v().b(), iE1, 0.0f));
                }
                eVar.itemView.setBackground(ViewUtils.j(ViewUtils.f(bVar.v().b(), 45.0f), iE1));
                if (!com.max.hbcommon.utils.c.u(factoryObj.getMedal_url())) {
                    if (imageView == null) {
                        return;
                    }
                    imageView.setVisibility(0);
                } else {
                    if (imageView != null) {
                        imageView.setVisibility(8);
                    }
                    String medal_url = factoryObj.getMedal_url();
                    f0.m(imageView);
                    com.max.hbimage.b.K(medal_url, imageView);
                }
            }
        }

        @Override // com.max.hbcommon.base.adapter.s
        public /* bridge */ /* synthetic */ void onBindViewHolder(com.max.hbcommon.base.adapter.s.e eVar, FactoryObj factoryObj) {
            if (PatchProxy.proxy(new Object[]{eVar, factoryObj}, this, changeQuickRedirect, false, 35949, new Class[]{com.max.hbcommon.base.adapter.s.e.class, Object.class}, Void.TYPE).isSupported) {
                return;
            }
            m(eVar, factoryObj);
        }
    }

    public b(@dl.d RecommendVHBParam param) {
        f0.p(param, "param");
        this.f86089g = param;
    }

    @Override // com.max.xiaoheihe.module.game.adapter.recommend.binder.r
    public void g(@dl.d com.max.hbcommon.base.adapter.s.e viewHolder, @dl.d GameRecommendBaseObj data) {
        if (PatchProxy.proxy(new Object[]{viewHolder, data}, this, changeQuickRedirect, false, 35947, new Class[]{com.max.hbcommon.base.adapter.s.e.class, GameRecommendBaseObj.class}, Void.TYPE).isSupported) {
            return;
        }
        f0.p(viewHolder, "viewHolder");
        f0.p(data, "data");
        if (data instanceof FactoryListObj) {
            RecyclerView recyclerView = (RecyclerView) viewHolder.i(R.id.rv);
            recyclerView.setLayoutManager(new LinearLayoutManager(this.f86089g.b(), 0, false));
            if (recyclerView.getItemDecorationCount() == 0) {
                recyclerView.addItemDecoration(new com.max.hbcustomview.d(ViewUtils.f(this.f86089g.b(), 18.0f), ViewUtils.f(this.f86089g.b(), 12.0f)));
            }
            recyclerView.setAdapter(new a(this.f86089g.b(), ((FactoryListObj) data).getList()));
        }
    }

    @dl.d
    public final RecommendVHBParam v() {
        return this.f86089g;
    }

    public final void w(@dl.d RecommendVHBParam recommendVHBParam) {
        if (PatchProxy.proxy(new Object[]{recommendVHBParam}, this, changeQuickRedirect, false, 35946, new Class[]{RecommendVHBParam.class}, Void.TYPE).isSupported) {
            return;
        }
        f0.p(recommendVHBParam, "<set-?>");
        this.f86089g = recommendVHBParam;
    }
}
