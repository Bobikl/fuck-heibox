package com.max.xiaoheihe.module.littleprogram.fragment.pubg;

import android.content.Context;
import android.content.res.ColorStateList;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.compose.runtime.internal.o;
import com.max.hbminiprogram.NativeLittleProgramFragment;
import com.max.hbutils.utils.ViewUtils;
import com.max.hbutils.utils.n;
import com.max.xiaoheihe.R;
import com.max.xiaoheihe.bean.game.pubg.PUBGMatchObj;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.PatchProxyResult;
import com.tencent.qcloud.core.util.IOUtils;
import com.umeng.socialize.net.dplus.CommonNetImpl;
import dl.d;
import dl.e;
import java.util.Locale;
import kotlin.jvm.internal.f0;
import kotlin.text.StringsKt__StringsKt;
import xh.m;

/* JADX INFO: compiled from: PUBGUtil.kt */
/* JADX INFO: loaded from: classes11.dex */
@o(parameters = 0)
public final class c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @d
    public static final c f89314a = new c();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final int f89315b = 0;
    public static ChangeQuickRedirect changeQuickRedirect;

    /* JADX INFO: compiled from: PUBGUtil.kt */
    public static final class a implements View.OnClickListener {
        public static ChangeQuickRedirect changeQuickRedirect;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ Context f89316b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ PUBGMatchObj f89317c;

        a(Context context, PUBGMatchObj pUBGMatchObj) {
            this.f89316b = context;
            this.f89317c = pUBGMatchObj;
        }

        @Override // android.view.View.OnClickListener
        public final void onClick(View view) {
            if (PatchProxy.proxy(new Object[]{view}, this, changeQuickRedirect, false, 39613, new Class[]{View.class}, Void.TYPE).isSupported) {
                return;
            }
            com.max.xiaoheihe.base.router.b.j0(this.f89316b, this.f89317c.getProtocol());
        }
    }

    private c() {
    }

    @d
    @m
    public static final NativeLittleProgramFragment a(@e Bundle bundle) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{bundle}, null, changeQuickRedirect, true, 39610, new Class[]{Bundle.class}, NativeLittleProgramFragment.class);
        return patchProxyResultProxy.isSupported ? (NativeLittleProgramFragment) patchProxyResultProxy.result : PUBGGameDataV2Fragment.V.c(bundle);
    }

    @d
    @m
    public static final NativeLittleProgramFragment b(@e String str) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{str}, null, changeQuickRedirect, true, 39609, new Class[]{String.class}, NativeLittleProgramFragment.class);
        return patchProxyResultProxy.isSupported ? (NativeLittleProgramFragment) patchProxyResultProxy.result : PUBGGameDataV2Fragment.V.d(str);
    }

    @d
    @m
    public static final NativeLittleProgramFragment c(@e String str, @e String str2) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{str, str2}, null, changeQuickRedirect, true, 39611, new Class[]{String.class, String.class}, NativeLittleProgramFragment.class);
        return patchProxyResultProxy.isSupported ? (NativeLittleProgramFragment) patchProxyResultProxy.result : PUBGGameDataV2Fragment.V.e(str, null, null, str2);
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code duplicated, block: B:76:0x05d6  */
    /* JADX WARN: Failed to clean up code after switch over string restore
    jadx.core.utils.exceptions.JadxRuntimeException: Can't remove SSA var: r4v53 int, still in use, count: 1, list:
  (r4v53 int) from 0x056b: IF  (r4v53 int) != (83 int)  -> B:56:0x056d A[HIDDEN]
    	at jadx.core.utils.InsnRemover.removeSsaVar(InsnRemover.java:164)
    	at jadx.core.utils.InsnRemover.unbindResult(InsnRemover.java:129)
    	at jadx.core.utils.InsnRemover.unbindInsn(InsnRemover.java:93)
    	at jadx.core.utils.InsnRemover.remove(InsnRemover.java:226)
    	at jadx.core.utils.InsnRemover.remove(InsnRemover.java:215)
    	at jadx.core.dex.visitors.regions.SwitchOverStringVisitor.replaceWithMergedSwitch(SwitchOverStringVisitor.java:355)
    	at jadx.core.dex.visitors.regions.SwitchOverStringVisitor.restoreSwitchOverString(SwitchOverStringVisitor.java:111)
    	at jadx.core.dex.visitors.regions.SwitchOverStringVisitor.visitRegion(SwitchOverStringVisitor.java:72)
    	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseIterativeStepInternal(DepthRegionTraversal.java:140)
    	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseIterative(DepthRegionTraversal.java:47)
    	at jadx.core.dex.visitors.regions.SwitchOverStringVisitor.visit(SwitchOverStringVisitor.java:66)
     */
    @m
    public static final void d(@d Context context, @e View view, @e PUBGMatchObj pUBGMatchObj, boolean z10) {
        char c10;
        int i10;
        if (PatchProxy.proxy(new Object[]{context, view, pUBGMatchObj, new Byte(z10 ? (byte) 1 : (byte) 0)}, null, changeQuickRedirect, true, 39612, new Class[]{Context.class, View.class, PUBGMatchObj.class, Boolean.TYPE}, Void.TYPE).isSupported) {
            return;
        }
        f0.p(context, "context");
        if (view == null) {
            return;
        }
        if (pUBGMatchObj == null) {
            view.setVisibility(8);
            return;
        }
        View viewFindViewById = view.findViewById(R.id.v_item_matches_sign);
        View viewFindViewById2 = view.findViewById(R.id.tv_item_matches_count);
        f0.n(viewFindViewById2, "null cannot be cast to non-null type android.widget.TextView");
        TextView textView = (TextView) viewFindViewById2;
        View viewFindViewById3 = view.findViewById(R.id.vg_rank);
        f0.n(viewFindViewById3, "null cannot be cast to non-null type android.view.ViewGroup");
        ViewGroup viewGroup = (ViewGroup) viewFindViewById3;
        View viewFindViewById4 = view.findViewById(R.id.vg_matches_count);
        f0.n(viewFindViewById4, "null cannot be cast to non-null type android.view.ViewGroup");
        ViewGroup viewGroup2 = (ViewGroup) viewFindViewById4;
        View viewFindViewById5 = view.findViewById(R.id.tv_rank);
        f0.n(viewFindViewById5, "null cannot be cast to non-null type android.widget.TextView");
        TextView textView2 = (TextView) viewFindViewById5;
        View viewFindViewById6 = view.findViewById(R.id.tv_rank_header);
        f0.n(viewFindViewById6, "null cannot be cast to non-null type android.widget.TextView");
        TextView textView3 = (TextView) viewFindViewById6;
        View viewFindViewById7 = view.findViewById(R.id.tv_team_count);
        f0.n(viewFindViewById7, "null cannot be cast to non-null type android.widget.TextView");
        TextView textView4 = (TextView) viewFindViewById7;
        View viewFindViewById8 = view.findViewById(R.id.tv_item_matches_time);
        f0.n(viewFindViewById8, "null cannot be cast to non-null type android.widget.TextView");
        TextView textView5 = (TextView) viewFindViewById8;
        View viewFindViewById9 = view.findViewById(R.id.iv_item_matches_mode);
        f0.n(viewFindViewById9, "null cannot be cast to non-null type android.widget.ImageView");
        ImageView imageView = (ImageView) viewFindViewById9;
        View viewFindViewById10 = view.findViewById(R.id.tv_item_matches_rating);
        f0.n(viewFindViewById10, "null cannot be cast to non-null type android.widget.TextView");
        TextView textView6 = (TextView) viewFindViewById10;
        View viewFindViewById11 = view.findViewById(R.id.tv_item_matches_rating_diff);
        f0.n(viewFindViewById11, "null cannot be cast to non-null type android.widget.TextView");
        TextView textView7 = (TextView) viewFindViewById11;
        View viewFindViewById12 = view.findViewById(R.id.tv_item_matches_rating_hint);
        f0.n(viewFindViewById12, "null cannot be cast to non-null type android.widget.TextView");
        TextView textView8 = (TextView) viewFindViewById12;
        View viewFindViewById13 = view.findViewById(R.id.tv_item_matches_kd);
        f0.n(viewFindViewById13, "null cannot be cast to non-null type android.widget.TextView");
        TextView textView9 = (TextView) viewFindViewById13;
        View viewFindViewById14 = view.findViewById(R.id.tv_item_matches_kd_hint);
        f0.n(viewFindViewById14, "null cannot be cast to non-null type android.widget.TextView");
        TextView textView10 = (TextView) viewFindViewById14;
        View viewFindViewById15 = view.findViewById(R.id.tv_item_matches_score);
        f0.n(viewFindViewById15, "null cannot be cast to non-null type android.widget.TextView");
        TextView textView11 = (TextView) viewFindViewById15;
        View viewFindViewById16 = view.findViewById(R.id.v_item_matches_divider);
        View viewFindViewById17 = view.findViewById(R.id.tv_item_matches_region);
        f0.n(viewFindViewById17, "null cannot be cast to non-null type android.widget.TextView");
        TextView textView12 = (TextView) viewFindViewById17;
        View viewFindViewById18 = view.findViewById(R.id.tv_fpp);
        f0.n(viewFindViewById18, "null cannot be cast to non-null type android.widget.TextView");
        TextView textView13 = (TextView) viewFindViewById18;
        View viewFindViewById19 = view.findViewById(R.id.tv_map);
        f0.n(viewFindViewById19, "null cannot be cast to non-null type android.widget.TextView");
        TextView textView14 = (TextView) viewFindViewById19;
        com.max.hbimage.b.R(pUBGMatchObj.getMode_img(), imageView, 0, ViewUtils.f(context, 11.0f), 1, -1);
        imageView.setImageTintList(ColorStateList.valueOf(context.getResources().getColor(R.color.white_alpha30)));
        if (com.max.hbcommon.utils.c.u(pUBGMatchObj.getMatchId())) {
            viewGroup2.setVisibility(0);
            viewGroup.setVisibility(8);
            textView.setText(pUBGMatchObj.getMatch_count());
        } else {
            viewGroup.setVisibility(0);
            viewGroup2.setVisibility(8);
            textView2.setText(pUBGMatchObj.getRank());
            textView4.setText(IOUtils.DIR_SEPARATOR_UNIX + pUBGMatchObj.getTeam_count());
        }
        textView5.setText(pUBGMatchObj.getTime());
        textView6.setText(pUBGMatchObj.getRating());
        textView7.setText(pUBGMatchObj.getRating_diff());
        if (f0.g(CommonNetImpl.UP, pUBGMatchObj.getRating_trend())) {
            textView7.setTextColor(com.max.xiaoheihe.utils.d.E(R.color.green_70));
        } else if (f0.g("down", pUBGMatchObj.getRating_trend())) {
            textView7.setTextColor(com.max.xiaoheihe.utils.d.E(R.color.red_208));
        }
        float f10 = ViewUtils.f(context, 3.0f);
        int iF = ViewUtils.f(context, 2.0f);
        textView3.setTextColor(context.getResources().getColor(R.color.black));
        textView2.setTextColor(context.getResources().getColor(R.color.black));
        textView.setTextColor(context.getResources().getColor(R.color.black_alpha80));
        textView4.setTextColor(context.getResources().getColor(R.color.black_alpha80));
        if (com.max.hbcommon.utils.c.u(pUBGMatchObj.getMatchId())) {
            if (f0.g("win", pUBGMatchObj.getTag())) {
                viewFindViewById.setVisibility(0);
                viewGroup.setBackground(ViewUtils.G(iF, context.getResources().getColor(R.color.orange_255_110)));
                textView8.setTextColor(context.getResources().getColor(R.color.orange_255_110));
                viewFindViewById.setBackground(ViewUtils.I(new float[]{0.0f, 0.0f, f10, f10, f10, f10, 0.0f, 0.0f}, context.getResources().getColor(R.color.orange_255_110), context.getResources().getColor(R.color.orange_255_110)));
            } else if (f0.g("top10", pUBGMatchObj.getTag())) {
                viewFindViewById.setVisibility(0);
                viewGroup.setBackground(ViewUtils.G(iF, context.getResources().getColor(R.color.yellow_255)));
                textView8.setTextColor(context.getResources().getColor(R.color.yellow_255));
                viewFindViewById.setBackground(ViewUtils.I(new float[]{0.0f, 0.0f, f10, f10, f10, f10, 0.0f, 0.0f}, context.getResources().getColor(R.color.yellow_255), context.getResources().getColor(R.color.yellow_255)));
            } else {
                textView3.setTextColor(context.getResources().getColor(R.color.white_alpha50));
                textView2.setTextColor(context.getResources().getColor(R.color.white_alpha50));
                textView4.setTextColor(context.getResources().getColor(R.color.white_alpha50));
                viewGroup.setBackground(ViewUtils.G(iF, context.getResources().getColor(R.color.white_alpha10)));
                textView8.setTextColor(context.getResources().getColor(R.color.text_secondary_2_color));
                viewFindViewById.setBackground(ViewUtils.I(new float[]{0.0f, 0.0f, f10, f10, f10, f10, 0.0f, 0.0f}, context.getResources().getColor(R.color.white), context.getResources().getColor(R.color.white)));
                viewFindViewById.setVisibility(4);
            }
        } else if (n.q(pUBGMatchObj.getRank()) == 1) {
            viewGroup.setBackground(ViewUtils.G(iF, context.getResources().getColor(R.color.orange_255_110)));
            textView8.setTextColor(context.getResources().getColor(R.color.orange_255_110));
            viewFindViewById.setVisibility(0);
            viewFindViewById.setBackground(ViewUtils.I(new float[]{0.0f, 0.0f, f10, f10, f10, f10, 0.0f, 0.0f}, context.getResources().getColor(R.color.orange_255_110), context.getResources().getColor(R.color.orange_255_110)));
        } else if (n.q(pUBGMatchObj.getRank()) <= 10) {
            viewGroup.setBackground(ViewUtils.G(iF, context.getResources().getColor(R.color.yellow_255)));
            textView8.setTextColor(context.getResources().getColor(R.color.yellow_255));
            viewFindViewById.setVisibility(0);
            viewFindViewById.setBackground(ViewUtils.I(new float[]{0.0f, 0.0f, f10, f10, f10, f10, 0.0f, 0.0f}, context.getResources().getColor(R.color.yellow_255), context.getResources().getColor(R.color.yellow_255)));
        } else {
            textView3.setTextColor(context.getResources().getColor(R.color.white_alpha50));
            textView2.setTextColor(context.getResources().getColor(R.color.white_alpha50));
            textView4.setTextColor(context.getResources().getColor(R.color.white_alpha50));
            viewGroup.setBackground(ViewUtils.G(iF, context.getResources().getColor(R.color.white_alpha10)));
            textView8.setTextColor(context.getResources().getColor(R.color.white_alpha30));
            viewFindViewById.setBackground(ViewUtils.I(new float[]{0.0f, 0.0f, f10, f10, f10, f10, 0.0f, 0.0f}, context.getResources().getColor(R.color.white), context.getResources().getColor(R.color.white)));
            viewFindViewById.setVisibility(4);
        }
        if (TextUtils.isEmpty(pUBGMatchObj.getTag_desc())) {
            textView8.setVisibility(8);
            i10 = 2;
            c10 = 0;
        } else {
            c10 = 0;
            textView8.setVisibility(0);
            textView8.setText(pUBGMatchObj.getTag_desc());
            i10 = 2;
        }
        String[] strArr = new String[i10];
        strArr[c10] = pUBGMatchObj.getMap_name();
        strArr[1] = pUBGMatchObj.getMap_color();
        if (com.max.hbcommon.utils.c.v(strArr)) {
            textView14.setVisibility(8);
        } else {
            textView14.setText(pUBGMatchObj.getMap_name());
            textView14.setBackground(ViewUtils.G(ViewUtils.f(context, 2.0f), com.max.xiaoheihe.utils.d.e1(pUBGMatchObj.getMap_color())));
            textView14.setVisibility(0);
        }
        if (com.max.hbcommon.utils.c.u(pUBGMatchObj.getDamage_dealt())) {
            textView9.setText(pUBGMatchObj.getKd());
        } else {
            textView9.setText(pUBGMatchObj.getDamage_dealt());
        }
        textView12.setText(pUBGMatchObj.getRegion_desc());
        String mode = pUBGMatchObj.getMode();
        f0.o(mode, "obj.mode");
        if (StringsKt__StringsKt.W2(mode, "fpp", false, 2, null)) {
            textView13.setVisibility(0);
        } else {
            textView13.setVisibility(8);
        }
        textView10.setText(pUBGMatchObj.getK());
        textView11.setText(pUBGMatchObj.getScore());
        String score = pUBGMatchObj.getScore();
        f0.o(score, "obj.score");
        Locale locale = Locale.getDefault();
        f0.o(locale, "getDefault()");
        String upperCase = score.toUpperCase(locale);
        f0.o(upperCase, "this as java.lang.String).toUpperCase(locale)");
        if (upperCase.hashCode() != 83) {
            switch (upperCase) {
                case "A":
                    textView11.setTextColor(context.getResources().getColor(R.color.yellow_255));
                    break;
                case "B":
                    textView11.setTextColor(context.getResources().getColor(R.color.white_alpha30));
                    break;
                case "C":
                    textView11.setTextColor(context.getResources().getColor(R.color.white_alpha30));
                    break;
                case "D":
                    textView11.setTextColor(context.getResources().getColor(R.color.white_alpha30));
                    break;
                default:
                    textView11.setTextColor(context.getResources().getColor(R.color.white_alpha30));
                    break;
            }
        } else if (upperCase.equals(androidx.exifinterface.media.a.R4)) {
            textView11.setTextColor(context.getResources().getColor(R.color.orange_255_110));
        } else {
            textView11.setTextColor(context.getResources().getColor(R.color.white_alpha30));
        }
        view.setOnClickListener(new a(context, pUBGMatchObj));
        if (z10) {
            viewFindViewById16.setVisibility(4);
        } else {
            viewFindViewById16.setVisibility(0);
        }
    }
}
