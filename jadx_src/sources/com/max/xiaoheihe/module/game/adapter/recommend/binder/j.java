package com.max.xiaoheihe.module.game.adapter.recommend.binder;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.max.hbminiprogram.bean.MiniProgramGroupObj;
import com.max.hbminiprogram.bean.MiniProgramObj;
import com.max.hbminiprogram.component.MiniProgramView;
import com.max.hbutils.utils.ViewUtils;
import com.max.xiaoheihe.R;
import com.max.xiaoheihe.bean.game.recommend.GameRecommendBaseObj;
import com.max.xiaoheihe.bean.game.recommend.MiniProgramListObj;
import com.max.xiaoheihe.module.littleprogram.MiniProgramDialog;
import com.max.xiaoheihe.module.littleprogram.MiniProgramV2Dialog;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import java.util.List;
import kotlin.jvm.internal.f0;

/* JADX INFO: compiled from: MiniProgramV2VHB.kt */
/* JADX INFO: loaded from: classes11.dex */
@androidx.compose.runtime.internal.o(parameters = 0)
public final class j extends r {
    public static ChangeQuickRedirect changeQuickRedirect = null;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public static final int f86161h = 8;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    @dl.d
    private RecommendVHBParam f86162g;

    /* JADX INFO: compiled from: MiniProgramV2VHB.kt */
    public static final class a extends com.max.hbcommon.base.adapter.s<MiniProgramObj> {
        public static ChangeQuickRedirect changeQuickRedirect;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ boolean f86163b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ int f86164c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        final /* synthetic */ j f86165d;

        /* JADX INFO: renamed from: com.max.xiaoheihe.module.game.adapter.recommend.binder.j$a$a, reason: collision with other inner class name */
        /* JADX INFO: compiled from: MiniProgramV2VHB.kt */
        public static final class ViewOnClickListenerC0782a implements View.OnClickListener {
            public static ChangeQuickRedirect changeQuickRedirect;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            final /* synthetic */ MiniProgramView f86166b;

            /* JADX INFO: renamed from: c, reason: collision with root package name */
            final /* synthetic */ j f86167c;

            /* JADX INFO: renamed from: d, reason: collision with root package name */
            final /* synthetic */ MiniProgramObj f86168d;

            ViewOnClickListenerC0782a(MiniProgramView miniProgramView, j jVar, MiniProgramObj miniProgramObj) {
                this.f86166b = miniProgramView;
                this.f86167c = jVar;
                this.f86168d = miniProgramObj;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                if (PatchProxy.proxy(new Object[]{view}, this, changeQuickRedirect, false, 36026, new Class[]{View.class}, Void.TYPE).isSupported) {
                    return;
                }
                int[] iArr = new int[2];
                this.f86166b.getLocationOnScreen(iArr);
                int i10 = iArr[1];
                int measuredHeight = this.f86166b.getMeasuredHeight() + ViewUtils.f(this.f86167c.v().b(), 10.0f);
                if (!com.max.hbcommon.utils.c.w(this.f86168d.getMore_mini_app_v2())) {
                    Context contextB = this.f86167c.v().b();
                    int i11 = i10 + measuredHeight;
                    float f10 = measuredHeight - ViewUtils.f(this.f86167c.v().b(), 8.0f);
                    List<MiniProgramGroupObj> more_mini_app_v2 = this.f86168d.getMore_mini_app_v2();
                    f0.m(more_mini_app_v2);
                    new MiniProgramV2Dialog(contextB, i11, f10, more_mini_app_v2).show();
                } else if (!com.max.hbcommon.utils.c.w(this.f86168d.getMore_mini_app())) {
                    Context contextB2 = this.f86167c.v().b();
                    int i12 = i10 + measuredHeight;
                    float f11 = measuredHeight - ViewUtils.f(this.f86167c.v().b(), 8.0f);
                    List<MiniProgramObj> more_mini_app = this.f86168d.getMore_mini_app();
                    f0.m(more_mini_app);
                    new MiniProgramDialog(contextB2, i12, f11, more_mini_app).show();
                }
                com.max.xiaoheihe.base.router.b.k0(this.f86167c.v().b(), this.f86168d.getProto());
                this.f86168d.setHave_new(false);
                this.f86168d.setShow_animator(false);
                this.f86166b.getIv_point().setVisibility(8);
                this.f86166b.t();
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        a(boolean z10, int i10, j jVar, Context context, List<MiniProgramObj> list) {
            super(context, list, R.layout.item_mini_program_v2);
            this.f86163b = z10;
            this.f86164c = i10;
            this.f86165d = jVar;
        }

        public void m(@dl.e com.max.hbcommon.base.adapter.s.e eVar, @dl.e MiniProgramObj miniProgramObj) {
            if (PatchProxy.proxy(new Object[]{eVar, miniProgramObj}, this, changeQuickRedirect, false, 36024, new Class[]{com.max.hbcommon.base.adapter.s.e.class, MiniProgramObj.class}, Void.TYPE).isSupported || eVar == null) {
                return;
            }
            boolean z10 = this.f86163b;
            int i10 = this.f86164c;
            j jVar = this.f86165d;
            if (miniProgramObj != null) {
                View viewI = eVar.i(R.id.v_mini_program);
                f0.o(viewI, "viewHolder.getView(R.id.v_mini_program)");
                MiniProgramView miniProgramView = (MiniProgramView) viewI;
                miniProgramView.setData(miniProgramObj);
                if (z10) {
                    ViewGroup.LayoutParams layoutParams = miniProgramView.getLayoutParams();
                    layoutParams.height = i10;
                    miniProgramView.setLayoutParams(layoutParams);
                }
                miniProgramView.setOnClickListener(new ViewOnClickListenerC0782a(miniProgramView, jVar, miniProgramObj));
            }
        }

        @Override // com.max.hbcommon.base.adapter.s
        public /* bridge */ /* synthetic */ void onBindViewHolder(com.max.hbcommon.base.adapter.s.e eVar, MiniProgramObj miniProgramObj) {
            if (PatchProxy.proxy(new Object[]{eVar, miniProgramObj}, this, changeQuickRedirect, false, 36025, new Class[]{com.max.hbcommon.base.adapter.s.e.class, Object.class}, Void.TYPE).isSupported) {
                return;
            }
            m(eVar, miniProgramObj);
        }
    }

    public j(@dl.d RecommendVHBParam param) {
        f0.p(param, "param");
        this.f86162g = param;
    }

    @Override // com.max.xiaoheihe.module.game.adapter.recommend.binder.r
    public void g(@dl.d com.max.hbcommon.base.adapter.s.e viewHolder, @dl.d GameRecommendBaseObj data) {
        if (PatchProxy.proxy(new Object[]{viewHolder, data}, this, changeQuickRedirect, false, 36023, new Class[]{com.max.hbcommon.base.adapter.s.e.class, GameRecommendBaseObj.class}, Void.TYPE).isSupported) {
            return;
        }
        f0.p(viewHolder, "viewHolder");
        f0.p(data, "data");
        if (data instanceof MiniProgramListObj) {
            MiniProgramListObj miniProgramListObj = (MiniProgramListObj) data;
            if (miniProgramListObj.getItems() != null) {
                List<MiniProgramObj> items = miniProgramListObj.getItems();
                f0.m(items);
                if (!items.isEmpty()) {
                    RecyclerView recyclerView = (RecyclerView) viewHolder.i(R.id.rv);
                    recyclerView.setLayoutManager(new GridLayoutManager(this.f86162g.b(), 4));
                    if (recyclerView.getItemDecorationCount() == 0) {
                        recyclerView.addItemDecoration(new fc.b(4, ViewUtils.f(this.f86162g.b(), 8.0f), false));
                    }
                    recyclerView.setAdapter(new a(ViewUtils.L(this.f86162g.b()) >= ViewUtils.f(this.f86162g.b(), 390.0f), ViewUtils.f(this.f86162g.b(), 46.0f), this, this.f86162g.b(), miniProgramListObj.getItems()));
                }
            }
        }
    }

    @dl.d
    public final RecommendVHBParam v() {
        return this.f86162g;
    }

    public final void w(@dl.d RecommendVHBParam recommendVHBParam) {
        if (PatchProxy.proxy(new Object[]{recommendVHBParam}, this, changeQuickRedirect, false, 36022, new Class[]{RecommendVHBParam.class}, Void.TYPE).isSupported) {
            return;
        }
        f0.p(recommendVHBParam, "<set-?>");
        this.f86162g = recommendVHBParam;
    }
}
