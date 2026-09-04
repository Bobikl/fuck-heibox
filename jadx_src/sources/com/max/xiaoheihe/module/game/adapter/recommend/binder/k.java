package com.max.xiaoheihe.module.game.adapter.recommend.binder;

import android.graphics.Color;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.GradientDrawable;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.LinearLayout;
import com.max.hbminiprogram.bean.MiniProgramObj;
import com.max.hbutils.utils.ViewUtils;
import com.max.xiaoheihe.R;
import com.max.xiaoheihe.bean.game.recommend.GameRecommendBaseObj;
import com.max.xiaoheihe.bean.game.recommend.GradientColorObj;
import com.max.xiaoheihe.bean.game.recommend.MiniProgramListObj;
import com.max.xiaoheihe.module.game.adapter.recommend.GameRecommendAdapter;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.PatchProxyResult;
import df.tq;
import java.util.List;
import kotlin.collections.ArraysKt___ArraysKt;
import kotlin.jvm.internal.f0;

/* JADX INFO: compiled from: MiniProgramVHB.kt */
/* JADX INFO: loaded from: classes11.dex */
@androidx.compose.runtime.internal.o(parameters = 0)
public final class k extends r {
    public static ChangeQuickRedirect changeQuickRedirect = null;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public static final int f86169h = 8;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    @dl.d
    private RecommendVHBParam f86170g;

    /* JADX INFO: compiled from: MiniProgramVHB.kt */
    public static final class a implements View.OnClickListener {
        public static ChangeQuickRedirect changeQuickRedirect;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ MiniProgramObj f86171b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ tq f86172c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        final /* synthetic */ k f86173d;

        a(MiniProgramObj miniProgramObj, tq tqVar, k kVar) {
            this.f86171b = miniProgramObj;
            this.f86172c = tqVar;
            this.f86173d = kVar;
        }

        @Override // android.view.View.OnClickListener
        public final void onClick(View view) {
            if (PatchProxy.proxy(new Object[]{view}, this, changeQuickRedirect, false, 36031, new Class[]{View.class}, Void.TYPE).isSupported) {
                return;
            }
            this.f86171b.setHave_new(false);
            this.f86172c.f116054d.setVisibility(8);
            com.max.xiaoheihe.base.router.b.k0(this.f86173d.x().b(), this.f86171b.getProto());
            com.max.hbcommon.base.adapter.u<?> uVarA = this.f86173d.x().a();
            f0.n(uVarA, "null cannot be cast to non-null type com.max.xiaoheihe.module.game.adapter.recommend.GameRecommendAdapter");
            ((GameRecommendAdapter) uVarA).t().b();
        }
    }

    public k(@dl.d RecommendVHBParam param) {
        f0.p(param, "param");
        this.f86170g = param;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code duplicated, block: B:44:0x0093  */
    private final Drawable v(GradientColorObj gradientColorObj) {
        GradientDrawable.Orientation orientation;
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{gradientColorObj}, this, changeQuickRedirect, false, 36029, new Class[]{GradientColorObj.class}, Drawable.class);
        if (patchProxyResultProxy.isSupported) {
            return (Drawable) patchProxyResultProxy.result;
        }
        if (gradientColorObj == null) {
            return null;
        }
        String direction = gradientColorObj.getDirection();
        if (direction != null) {
            switch (direction) {
                case "b_t":
                    orientation = GradientDrawable.Orientation.BOTTOM_TOP;
                    break;
                case "l_r":
                    orientation = GradientDrawable.Orientation.LEFT_RIGHT;
                    break;
                case "r_l":
                    orientation = GradientDrawable.Orientation.RIGHT_LEFT;
                    break;
                case "t_b":
                    orientation = GradientDrawable.Orientation.TOP_BOTTOM;
                    break;
                case "lb_rt":
                    orientation = GradientDrawable.Orientation.BL_TR;
                    break;
                case "lt_rb":
                    orientation = GradientDrawable.Orientation.TL_BR;
                    break;
                case "rb_lt":
                    orientation = GradientDrawable.Orientation.BR_TL;
                    break;
                case "rt_lb":
                    orientation = GradientDrawable.Orientation.TR_BL;
                    break;
                default:
                    orientation = GradientDrawable.Orientation.LEFT_RIGHT;
                    break;
            }
        } else {
            orientation = GradientDrawable.Orientation.LEFT_RIGHT;
        }
        GradientDrawable gradientDrawable = new GradientDrawable(orientation, ArraysKt___ArraysKt.dz(new Integer[]{Integer.valueOf(Color.parseColor(gradientColorObj.getStart_color())), Integer.valueOf(Color.parseColor(gradientColorObj.getEnd_color()))}));
        gradientDrawable.setShape(1);
        return gradientDrawable;
    }

    private final LinearLayout w(LinearLayout linearLayout, boolean z10) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{linearLayout, new Byte(z10 ? (byte) 1 : (byte) 0)}, this, changeQuickRedirect, false, 36030, new Class[]{LinearLayout.class, Boolean.TYPE}, LinearLayout.class);
        if (patchProxyResultProxy.isSupported) {
            return (LinearLayout) patchProxyResultProxy.result;
        }
        LinearLayout linearLayout2 = new LinearLayout(this.f86170g.b());
        LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(-1, -2);
        if (!z10) {
            layoutParams.topMargin = ViewUtils.f(this.f86170g.b(), 10.0f);
        }
        linearLayout.addView(linearLayout2, layoutParams);
        return linearLayout2;
    }

    /* JADX WARN: Code duplicated, block: B:24:0x00fa  */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r10v0 */
    /* JADX WARN: Type inference failed for: r10v1, types: [boolean, int] */
    /* JADX WARN: Type inference failed for: r10v6 */
    /* JADX WARN: Type inference failed for: r14v5 */
    /* JADX WARN: Type inference failed for: r14v6 */
    /* JADX WARN: Type inference failed for: r14v7, types: [android.widget.ImageView] */
    /* JADX WARN: Type inference failed for: r14v9 */
    /* JADX WARN: Type inference failed for: r16v0, types: [com.max.xiaoheihe.module.game.adapter.recommend.binder.k, java.lang.Object] */
    @Override // com.max.xiaoheihe.module.game.adapter.recommend.binder.r
    public void g(@dl.d com.max.hbcommon.base.adapter.s.e viewHolder, @dl.d GameRecommendBaseObj data) {
        char c10;
        ?? r10 = 0;
        boolean z10 = true;
        if (PatchProxy.proxy(new Object[]{viewHolder, data}, this, changeQuickRedirect, false, 36028, new Class[]{com.max.hbcommon.base.adapter.s.e.class, GameRecommendBaseObj.class}, Void.TYPE).isSupported) {
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
                    LinearLayout container = (LinearLayout) viewHolder.i(R.id.ll_miniprogram);
                    int iL = (ViewUtils.L(this.f86170g.b()) - (ViewUtils.f(this.f86170g.b(), 60.0f) * 5)) / 6;
                    container.removeAllViews();
                    f0.o(container, "container");
                    LinearLayout linearLayoutW = w(container, true);
                    List<MiniProgramObj> items2 = miniProgramListObj.getItems();
                    f0.m(items2);
                    int size = items2.size();
                    int i10 = 0;
                    int i11 = 0;
                    while (i10 < size) {
                        List<MiniProgramObj> items3 = miniProgramListObj.getItems();
                        f0.m(items3);
                        MiniProgramObj miniProgramObj = items3.get(i10);
                        int i12 = i10 / 5;
                        int i13 = i10 % 5;
                        if (i12 != i11) {
                            linearLayoutW = w(container, r10);
                            i11 = i12;
                        }
                        tq tqVarC = tq.c(LayoutInflater.from(this.f86170g.b()));
                        f0.o(tqVarC, "inflate(LayoutInflater.from(param.context))");
                        com.max.hbimage.b.K(miniProgramObj.getBg_img(), tqVarC.f116053c);
                        if (miniProgramObj.getIcon_img() != null) {
                            String icon_img = miniProgramObj.getIcon_img();
                            f0.m(icon_img);
                            if ((icon_img.length() > 0 ? z10 : r10) != 0) {
                                tqVarC.f116052b.setVisibility(r10);
                                com.max.hbimage.b.d0(miniProgramObj.getIcon_img(), tqVarC.f116052b, ViewUtils.o(this.f86170g.b(), tqVarC.f116052b));
                            } else {
                                tqVarC.f116052b.setVisibility(8);
                            }
                        } else {
                            tqVarC.f116052b.setVisibility(8);
                        }
                        tqVarC.f116054d.setVisibility(miniProgramObj.getHave_new() ? 0 : 8);
                        tqVarC.b().setOnClickListener(new a(miniProgramObj, tqVarC, this));
                        tqVarC.f116055e.setText(miniProgramObj.getName());
                        LinearLayout.LayoutParams layoutParams = (LinearLayout.LayoutParams) tqVarC.b().getLayoutParams();
                        if (layoutParams == null) {
                            c10 = 0;
                            layoutParams = new LinearLayout.LayoutParams(ViewUtils.f(this.f86170g.b(), 60.0f), -2);
                        } else {
                            c10 = 0;
                        }
                        if (i13 == 0) {
                            layoutParams.leftMargin = iL;
                        }
                        layoutParams.rightMargin = iL;
                        linearLayoutW.addView(tqVarC.b(), layoutParams);
                        i10++;
                        r10 = 0;
                        z10 = true;
                    }
                }
            }
        }
    }

    @dl.d
    public final RecommendVHBParam x() {
        return this.f86170g;
    }

    public final void y(@dl.d RecommendVHBParam recommendVHBParam) {
        if (PatchProxy.proxy(new Object[]{recommendVHBParam}, this, changeQuickRedirect, false, 36027, new Class[]{RecommendVHBParam.class}, Void.TYPE).isSupported) {
            return;
        }
        f0.p(recommendVHBParam, "<set-?>");
        this.f86170g = recommendVHBParam;
    }
}
