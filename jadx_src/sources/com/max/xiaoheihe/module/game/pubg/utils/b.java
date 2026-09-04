package com.max.xiaoheihe.module.game.pubg.utils;

import android.animation.ValueAnimator;
import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.content.res.ColorStateList;
import android.graphics.drawable.GradientDrawable;
import android.text.TextUtils;
import android.util.Pair;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.AccelerateInterpolator;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.ProgressBar;
import android.widget.RelativeLayout;
import android.widget.TextView;
import com.github.mikephil.charting.animation.Easing;
import com.github.mikephil.charting.components.AxisBase;
import com.github.mikephil.charting.components.XAxis;
import com.github.mikephil.charting.components.YAxis;
import com.github.mikephil.charting.data.RadarData;
import com.github.mikephil.charting.data.RadarDataSet;
import com.github.mikephil.charting.data.RadarEntry;
import com.github.mikephil.charting.formatter.IAxisValueFormatter;
import com.max.hbcommon.base.adapter.s;
import com.max.hbcommon.bean.KeyDescObj;
import com.max.hbcommon.component.chart.HeyBoxRadarChart;
import com.max.hbcustomview.CircleProgressView;
import com.max.hbcustomview.GradientTextView;
import com.max.hbcustomview.chart.RadarView;
import com.max.hbutils.utils.ViewUtils;
import com.max.xiaoheihe.R;
import com.max.xiaoheihe.bean.PlayerInfoObj;
import com.max.xiaoheihe.bean.account.ActivityObj;
import com.max.xiaoheihe.bean.account.HeyboxInfoObj;
import com.max.xiaoheihe.bean.account.PlayerRankObj;
import com.max.xiaoheihe.bean.game.ow.OWAchievementsObj;
import com.max.xiaoheihe.bean.game.ow.OWPlayerHeroObj;
import com.max.xiaoheihe.bean.game.pubg.PUBGDataObj;
import com.max.xiaoheihe.bean.game.pubg.PUBGMatchObj;
import com.max.xiaoheihe.bean.game.pubg.PUBGPlayerOverviewObj;
import com.max.xiaoheihe.bean.game.r6.R6KVObj;
import com.max.xiaoheihe.bean.game.r6.R6RadarDataObj;
import com.max.xiaoheihe.module.game.pubg.PUBGPlayerOverViewActivity;
import com.max.xiaoheihe.module.webview.WebActionActivity;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.PatchProxyResult;
import com.umeng.analytics.pro.ak;
import com.umeng.socialize.net.dplus.CommonNetImpl;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: compiled from: PUBGCardUtils.java */
/* JADX INFO: loaded from: classes11.dex */
public class b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final String f88175a = "PUBGCardUtils";
    public static ChangeQuickRedirect changeQuickRedirect;

    /* JADX INFO: compiled from: PUBGCardUtils.java */
    public class a implements ValueAnimator.AnimatorUpdateListener {
        public static ChangeQuickRedirect changeQuickRedirect;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ CircleProgressView f88176b;

        a(CircleProgressView circleProgressView) {
            this.f88176b = circleProgressView;
        }

        @Override // android.animation.ValueAnimator.AnimatorUpdateListener
        public void onAnimationUpdate(ValueAnimator valueAnimator) {
            if (PatchProxy.proxy(new Object[]{valueAnimator}, this, changeQuickRedirect, false, 38360, new Class[]{ValueAnimator.class}, Void.TYPE).isSupported) {
                return;
            }
            this.f88176b.f(((Float) valueAnimator.getAnimatedValue()).floatValue());
        }
    }

    /* JADX INFO: renamed from: com.max.xiaoheihe.module.game.pubg.utils.b$b, reason: collision with other inner class name */
    /* JADX INFO: compiled from: PUBGCardUtils.java */
    public class C0806b implements IAxisValueFormatter {
        public static ChangeQuickRedirect changeQuickRedirect;

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ int f88177a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ List f88178b;

        C0806b(int i10, List list) {
            this.f88177a = i10;
            this.f88178b = list;
        }

        @Override // com.github.mikephil.charting.formatter.IAxisValueFormatter
        public String getFormattedValue(float f10, AxisBase axisBase) {
            PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{new Float(f10), axisBase}, this, changeQuickRedirect, false, 38361, new Class[]{Float.TYPE, AxisBase.class}, String.class);
            if (patchProxyResultProxy.isSupported) {
                return (String) patchProxyResultProxy.result;
            }
            int i10 = (int) f10;
            if (i10 > 0) {
                i10 = this.f88177a - i10;
            }
            return ((R6KVObj) this.f88178b.get(i10)).getK();
        }
    }

    /* JADX INFO: compiled from: PUBGCardUtils.java */
    public class c implements View.OnClickListener {
        public static ChangeQuickRedirect changeQuickRedirect;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ Context f88179b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ String f88180c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        final /* synthetic */ OWPlayerHeroObj f88181d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        final /* synthetic */ String f88182e;

        c(Context context, String str, OWPlayerHeroObj oWPlayerHeroObj, String str2) {
            this.f88179b = context;
            this.f88180c = str;
            this.f88181d = oWPlayerHeroObj;
            this.f88182e = str2;
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            if (PatchProxy.proxy(new Object[]{view}, this, changeQuickRedirect, false, 38362, new Class[]{View.class}, Void.TYPE).isSupported) {
                return;
            }
            Intent intent = new Intent(this.f88179b, (Class<?>) WebActionActivity.class);
            intent.putExtra("pageurl", String.format(lb.a.S2, this.f88180c, this.f88181d.getHero_info().getHero_id(), this.f88182e));
            intent.putExtra("title", com.max.xiaoheihe.utils.d.n0(R.string.ow_hero_overview));
            intent.putExtra("isfullScreen", true);
            intent.putExtra("shareTitle", String.format(com.max.xiaoheihe.utils.d.n0(R.string.ow_share_hero_title), this.f88181d.getHero_info().getDisplayName()));
            intent.putExtra("shareDesc", com.max.xiaoheihe.utils.d.n0(R.string.ow_share_hero_desc));
            intent.putExtra("shareImgUrl", this.f88181d.getHero_info().getHero_img());
            this.f88179b.startActivity(intent);
        }
    }

    /* JADX INFO: compiled from: PUBGCardUtils.java */
    public class d implements View.OnClickListener {
        public static ChangeQuickRedirect changeQuickRedirect;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ m f88183b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ List f88184c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        final /* synthetic */ int f88185d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        final /* synthetic */ List f88186e;

        d(m mVar, List list, int i10, List list2) {
            this.f88183b = mVar;
            this.f88184c = list;
            this.f88185d = i10;
            this.f88186e = list2;
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            if (PatchProxy.proxy(new Object[]{view}, this, changeQuickRedirect, false, 38359, new Class[]{View.class}, Void.TYPE).isSupported) {
                return;
            }
            m mVar = this.f88183b;
            if (mVar != null) {
                mVar.a((KeyDescObj) this.f88184c.get(this.f88185d), Integer.valueOf(this.f88185d));
            }
            for (int i10 = 0; i10 < this.f88186e.size(); i10++) {
                if (i10 == this.f88185d) {
                    ((n) this.f88186e.get(i10)).a();
                } else {
                    ((n) this.f88186e.get(i10)).b();
                }
            }
        }
    }

    /* JADX INFO: compiled from: PUBGCardUtils.java */
    public class e implements n {
        public static ChangeQuickRedirect changeQuickRedirect;

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ ViewGroup f88187a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ View f88188b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ TextView f88189c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        final /* synthetic */ boolean f88190d;

        e(ViewGroup viewGroup, View view, TextView textView, boolean z10) {
            this.f88187a = viewGroup;
            this.f88188b = view;
            this.f88189c = textView;
            this.f88190d = z10;
        }

        @Override // com.max.xiaoheihe.module.game.pubg.utils.b.n
        public void a() {
            if (PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 38363, new Class[0], Void.TYPE).isSupported) {
                return;
            }
            ViewGroup viewGroup = this.f88187a;
            viewGroup.setBackgroundColor(viewGroup.getContext().getResources().getColor(R.color.blue_70_alpha));
            this.f88188b.setVisibility(4);
            TextView textView = this.f88189c;
            if (textView != null) {
                textView.setTextColor(textView.getContext().getResources().getColor(R.color.white));
            }
        }

        @Override // com.max.xiaoheihe.module.game.pubg.utils.b.n
        public void b() {
            if (PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 38364, new Class[0], Void.TYPE).isSupported) {
                return;
            }
            ViewGroup viewGroup = this.f88187a;
            viewGroup.setBackgroundColor(viewGroup.getContext().getResources().getColor(R.color.transparent));
            if (!this.f88190d) {
                this.f88188b.setVisibility(0);
            }
            TextView textView = this.f88189c;
            if (textView != null) {
                textView.setTextColor(textView.getContext().getResources().getColor(R.color.blue_70_alpha));
            }
        }
    }

    /* JADX INFO: compiled from: PUBGCardUtils.java */
    public class f implements n {
        public static ChangeQuickRedirect changeQuickRedirect;

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ ViewGroup f88191a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ TextView f88192b;

        f(ViewGroup viewGroup, TextView textView) {
            this.f88191a = viewGroup;
            this.f88192b = textView;
        }

        @Override // com.max.xiaoheihe.module.game.pubg.utils.b.n
        public void a() {
            if (PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 38365, new Class[0], Void.TYPE).isSupported) {
                return;
            }
            ViewGroup viewGroup = this.f88191a;
            viewGroup.setBackgroundColor(viewGroup.getContext().getResources().getColor(R.color.white_alpha5));
            TextView textView = this.f88192b;
            if (textView != null) {
                textView.setTextColor(textView.getContext().getResources().getColor(R.color.white));
            }
        }

        @Override // com.max.xiaoheihe.module.game.pubg.utils.b.n
        public void b() {
            if (PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 38366, new Class[0], Void.TYPE).isSupported) {
                return;
            }
            ViewGroup viewGroup = this.f88191a;
            viewGroup.setBackgroundColor(viewGroup.getContext().getResources().getColor(R.color.transparent));
            TextView textView = this.f88192b;
            if (textView != null) {
                textView.setTextColor(textView.getContext().getResources().getColor(R.color.white_alpha50));
            }
        }
    }

    /* JADX INFO: compiled from: PUBGCardUtils.java */
    public class g implements View.OnClickListener {
        public static ChangeQuickRedirect changeQuickRedirect;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ Context f88193b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ PUBGMatchObj f88194c;

        g(Context context, PUBGMatchObj pUBGMatchObj) {
            this.f88193b = context;
            this.f88194c = pUBGMatchObj;
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            if (PatchProxy.proxy(new Object[]{view}, this, changeQuickRedirect, false, 38367, new Class[]{View.class}, Void.TYPE).isSupported) {
                return;
            }
            com.max.xiaoheihe.base.router.b.j0(this.f88193b, this.f88194c.getProtocol());
        }
    }

    /* JADX INFO: compiled from: PUBGCardUtils.java */
    public class h implements View.OnClickListener {
        public static ChangeQuickRedirect changeQuickRedirect;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ PlayerInfoObj f88195b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ String f88196c;

        h(PlayerInfoObj playerInfoObj, String str) {
            this.f88195b = playerInfoObj;
            this.f88196c = str;
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            if (PatchProxy.proxy(new Object[]{view}, this, changeQuickRedirect, false, 38368, new Class[]{View.class}, Void.TYPE).isSupported) {
                return;
            }
            PUBGPlayerOverViewActivity.N1(view.getContext(), this.f88195b.getNickname(), this.f88195b.getReal_name(), null, this.f88196c);
        }
    }

    /* JADX INFO: compiled from: PUBGCardUtils.java */
    public class i implements ValueAnimator.AnimatorUpdateListener {
        public static ChangeQuickRedirect changeQuickRedirect;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ ProgressBar f88197b;

        i(ProgressBar progressBar) {
            this.f88197b = progressBar;
        }

        @Override // android.animation.ValueAnimator.AnimatorUpdateListener
        public void onAnimationUpdate(ValueAnimator valueAnimator) {
            if (PatchProxy.proxy(new Object[]{valueAnimator}, this, changeQuickRedirect, false, 38369, new Class[]{ValueAnimator.class}, Void.TYPE).isSupported) {
                return;
            }
            this.f88197b.setProgress(((Integer) valueAnimator.getAnimatedValue()).intValue());
        }
    }

    /* JADX INFO: compiled from: PUBGCardUtils.java */
    public class j implements View.OnClickListener {
        public static ChangeQuickRedirect changeQuickRedirect;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ Context f88198b;

        j(Context context) {
            this.f88198b = context;
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            if (!PatchProxy.proxy(new Object[]{view}, this, changeQuickRedirect, false, 38370, new Class[]{View.class}, Void.TYPE).isSupported && (this.f88198b instanceof Activity)) {
                Intent intent = new Intent(this.f88198b, (Class<?>) WebActionActivity.class);
                intent.putExtra("pageurl", String.format(lb.a.I1, com.max.xiaoheihe.module.account.utils.c.i()));
                intent.putExtra("title", com.max.xiaoheihe.utils.d.n0(R.string.invite_friend));
                this.f88198b.startActivity(intent);
            }
        }
    }

    /* JADX INFO: compiled from: PUBGCardUtils.java */
    public class k implements View.OnClickListener {
        public static ChangeQuickRedirect changeQuickRedirect;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ String f88199b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ PlayerRankObj f88200c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        final /* synthetic */ String f88201d;

        k(String str, PlayerRankObj playerRankObj, String str2) {
            this.f88199b = str;
            this.f88200c = playerRankObj;
            this.f88201d = str2;
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            if (PatchProxy.proxy(new Object[]{view}, this, changeQuickRedirect, false, 38371, new Class[]{View.class}, Void.TYPE).isSupported) {
                return;
            }
            PUBGPlayerOverViewActivity.N1(view.getContext(), this.f88199b, this.f88200c.getReal_name(), null, this.f88201d);
        }
    }

    /* JADX INFO: compiled from: PUBGCardUtils.java */
    public class l implements View.OnClickListener {
        public static ChangeQuickRedirect changeQuickRedirect;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ HeyboxInfoObj f88202b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ String f88203c;

        l(HeyboxInfoObj heyboxInfoObj, String str) {
            this.f88202b = heyboxInfoObj;
            this.f88203c = str;
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            if (PatchProxy.proxy(new Object[]{view}, this, changeQuickRedirect, false, 38372, new Class[]{View.class}, Void.TYPE).isSupported) {
                return;
            }
            com.max.xiaoheihe.base.router.b.U(view.getContext(), this.f88202b.getUserid(), this.f88203c).A();
        }
    }

    /* JADX INFO: compiled from: PUBGCardUtils.java */
    public interface m<T, Y> {
        void a(T t10, Y y10);
    }

    /* JADX INFO: compiled from: PUBGCardUtils.java */
    public interface n {
        void a();

        void b();
    }

    public static int b(Context context, String str) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{context, str}, null, changeQuickRedirect, true, 38345, new Class[]{Context.class, String.class}, Integer.TYPE);
        if (patchProxyResultProxy.isSupported) {
            return ((Integer) patchProxyResultProxy.result).intValue();
        }
        if ("win".equals(str)) {
            return context.getResources().getColor(R.color.game_pubg_color_variant_3);
        }
        return "top10".equals(str) ? context.getResources().getColor(R.color.game_pubg_color_variant_1) : context.getResources().getColor(R.color.white_alpha5);
    }

    public static int c(Context context, String str) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{context, str}, null, changeQuickRedirect, true, 38346, new Class[]{Context.class, String.class}, Integer.TYPE);
        if (patchProxyResultProxy.isSupported) {
            return ((Integer) patchProxyResultProxy.result).intValue();
        }
        return ("win".equals(str) || "top10".equals(str)) ? context.getResources().getColor(R.color.text_primary_1_color) : context.getResources().getColor(R.color.white_alpha50);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ void d(Context context, HeyboxInfoObj heyboxInfoObj, View view) {
        if (PatchProxy.proxy(new Object[]{context, heyboxInfoObj, view}, null, changeQuickRedirect, true, 38358, new Class[]{Context.class, HeyboxInfoObj.class, View.class}, Void.TYPE).isSupported) {
            return;
        }
        com.max.xiaoheihe.base.router.b.T(context, heyboxInfoObj.getUserid()).A();
    }

    public static void e(ViewGroup viewGroup, ActivityObj activityObj, View.OnClickListener onClickListener) {
        if (PatchProxy.proxy(new Object[]{viewGroup, activityObj, onClickListener}, null, changeQuickRedirect, true, 38343, new Class[]{ViewGroup.class, ActivityObj.class, View.OnClickListener.class}, Void.TYPE).isSupported || viewGroup == null) {
            return;
        }
        if (activityObj == null) {
            viewGroup.setVisibility(8);
            return;
        }
        viewGroup.setVisibility(0);
        Context context = viewGroup.getContext();
        ImageView imageView = (ImageView) viewGroup.findViewById(R.id.iv_activity_card);
        ((TextView) viewGroup.findViewById(R.id.tv_internal_tag)).setVisibility(8);
        imageView.getLayoutParams().height = (int) (((ViewUtils.L(viewGroup.getContext()) - ViewUtils.f(context, 24.0f)) * 72.0f) / 375.0f);
        com.max.hbimage.b.K(activityObj.getIcon_url(), imageView);
        imageView.setOnClickListener(onClickListener);
    }

    public static n f(ViewGroup viewGroup, KeyDescObj keyDescObj, boolean z10) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{viewGroup, keyDescObj, new Byte(z10 ? (byte) 1 : (byte) 0)}, null, changeQuickRedirect, true, 38341, new Class[]{ViewGroup.class, KeyDescObj.class, Boolean.TYPE}, n.class);
        if (patchProxyResultProxy.isSupported) {
            return (n) patchProxyResultProxy.result;
        }
        if (viewGroup == null) {
            return null;
        }
        TextView textView = (TextView) viewGroup.findViewById(R.id.tv_item_area_text);
        View viewFindViewById = viewGroup.findViewById(R.id.v_item_area_divider);
        if (z10) {
            viewFindViewById.setVisibility(4);
        } else {
            viewFindViewById.setVisibility(0);
        }
        if (keyDescObj != null) {
            textView.setText(keyDescObj.getValue());
        }
        return new e(viewGroup, viewFindViewById, textView, z10);
    }

    public static n g(ViewGroup viewGroup, KeyDescObj keyDescObj, boolean z10) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{viewGroup, keyDescObj, new Byte(z10 ? (byte) 1 : (byte) 0)}, null, changeQuickRedirect, true, 38342, new Class[]{ViewGroup.class, KeyDescObj.class, Boolean.TYPE}, n.class);
        if (patchProxyResultProxy.isSupported) {
            return (n) patchProxyResultProxy.result;
        }
        if (viewGroup == null) {
            return null;
        }
        TextView textView = (TextView) viewGroup.findViewById(R.id.tv_item_area_text);
        if (keyDescObj != null) {
            textView.setText(keyDescObj.getValue());
        }
        return new f(viewGroup, textView);
    }

    public static void h(ViewGroup viewGroup, List<KeyDescObj> list, String str, boolean z10, m<KeyDescObj, Integer> mVar) {
        int i10 = 0;
        if (PatchProxy.proxy(new Object[]{viewGroup, list, str, new Byte(z10 ? (byte) 1 : (byte) 0), mVar}, null, changeQuickRedirect, true, 38340, new Class[]{ViewGroup.class, List.class, String.class, Boolean.TYPE, m.class}, Void.TYPE).isSupported || viewGroup == null) {
            return;
        }
        if (list == null || list.size() <= 0) {
            viewGroup.setVisibility(4);
            return;
        }
        viewGroup.setVisibility(0);
        viewGroup.removeAllViews();
        LayoutInflater layoutInflaterFrom = LayoutInflater.from(viewGroup.getContext());
        ArrayList arrayList = new ArrayList();
        int i11 = 0;
        while (i11 < list.size()) {
            View viewInflate = z10 ? layoutInflaterFrom.inflate(R.layout.item_area_v2, (ViewGroup) null, false) : layoutInflaterFrom.inflate(R.layout.item_area, (ViewGroup) null, false);
            viewGroup.addView(viewInflate);
            if (z10) {
                arrayList.add(g((ViewGroup) viewInflate, list.get(i11), i11 == 0));
            } else {
                arrayList.add(f((ViewGroup) viewInflate, list.get(i11), i11 == 0));
            }
            viewInflate.setOnClickListener(new d(mVar, list, i11, arrayList));
            i11++;
        }
        for (int i12 = 0; i12 < list.size(); i12++) {
            if (list.get(i12).getKey().equals(str)) {
                i10 = i12;
                break;
            }
        }
        ((n) arrayList.get(i10)).a();
    }

    public static void i(s.e eVar, PUBGMatchObj pUBGMatchObj, int i10) {
        TextView textView;
        ImageView imageView;
        if (PatchProxy.proxy(new Object[]{eVar, pUBGMatchObj, new Integer(i10)}, null, changeQuickRedirect, true, 38352, new Class[]{s.e.class, PUBGMatchObj.class, Integer.TYPE}, Void.TYPE).isSupported || eVar == null) {
            return;
        }
        if (pUBGMatchObj == null) {
            eVar.itemView.setVisibility(8);
            return;
        }
        eVar.itemView.setVisibility(0);
        Context context = eVar.itemView.getContext();
        View viewI = eVar.i(R.id.v_item_matches_sign);
        TextView textView2 = (TextView) eVar.i(R.id.tv_season);
        TextView textView3 = (TextView) eVar.i(R.id.tv_name);
        ImageView imageView2 = (ImageView) eVar.i(R.id.iv_avatar);
        RelativeLayout relativeLayout = (RelativeLayout) eVar.i(R.id.rl_bg);
        RelativeLayout relativeLayout2 = (RelativeLayout) eVar.i(R.id.vg_rank);
        RelativeLayout relativeLayout3 = (RelativeLayout) eVar.i(R.id.vg_matches_count);
        TextView textView4 = (TextView) eVar.i(R.id.tv_rank_header);
        TextView textView5 = (TextView) eVar.i(R.id.tv_rank);
        TextView textView6 = (TextView) eVar.i(R.id.tv_team_count);
        TextView textView7 = (TextView) eVar.i(R.id.tv_item_matches_count);
        TextView textView8 = (TextView) eVar.i(R.id.tv_item_matches_time);
        ImageView imageView3 = (ImageView) eVar.i(R.id.iv_item_matches_mode);
        TextView textView9 = (TextView) eVar.i(R.id.tv_item_matches_rating);
        TextView textView10 = (TextView) eVar.i(R.id.tv_item_matches_rating_diff);
        TextView textView11 = (TextView) eVar.i(R.id.tv_item_matches_rating_hint);
        TextView textView12 = (TextView) eVar.i(R.id.tv_item_matches_kd);
        TextView textView13 = (TextView) eVar.i(R.id.tv_item_matches_kd_hint);
        ImageView imageView4 = (ImageView) eVar.i(R.id.iv_score);
        TextView textView14 = (TextView) eVar.i(R.id.tv_item_matches_region);
        ViewGroup.LayoutParams layoutParams = eVar.itemView.getLayoutParams();
        if (i10 == 1) {
            layoutParams.width = ViewUtils.f(context, 259.0f);
            relativeLayout.setBackgroundResource(R.drawable.pubg_msg_card_bg_in_chat);
        } else {
            layoutParams.width = ViewUtils.L(context) - ViewUtils.f(context, 20.0f);
            relativeLayout.setBackgroundResource(R.drawable.pubg_msg_card_bg);
        }
        if (com.max.hbcommon.utils.c.u(pUBGMatchObj.getMatchId())) {
            relativeLayout3.setVisibility(0);
            relativeLayout2.setVisibility(8);
            textView7.setText(pUBGMatchObj.getMatch_count());
        } else {
            relativeLayout2.setVisibility(0);
            relativeLayout3.setVisibility(8);
            textView5.setText(pUBGMatchObj.getRank());
            textView6.setText("/" + pUBGMatchObj.getTeam_count());
        }
        com.max.hbimage.b.d0(pUBGMatchObj.getPlayer_info().getAvatar(), imageView2, ViewUtils.f(context, 1.0f));
        com.max.hbimage.b.R(pUBGMatchObj.getMode_img(), imageView3, 0, ViewUtils.f(context, 11.0f), 1, -1);
        textView3.setText(pUBGMatchObj.getPlayer_info().getNickname());
        textView2.setText(pUBGMatchObj.getSeason_desc());
        textView7.setText(pUBGMatchObj.getMatch_count());
        textView8.setText(pUBGMatchObj.getTime());
        textView9.setText(pUBGMatchObj.getRating());
        textView10.setText(pUBGMatchObj.getRating_diff());
        if (CommonNetImpl.UP.equals(pUBGMatchObj.getRating_trend())) {
            textView10.setTextColor(com.max.xiaoheihe.utils.d.E(R.color.green_70));
        } else if ("down".equals(pUBGMatchObj.getRating_trend())) {
            textView10.setTextColor(com.max.xiaoheihe.utils.d.E(R.color.red_208));
        }
        if (!com.max.hbcommon.utils.c.u(pUBGMatchObj.getMatchId())) {
            textView = textView11;
            if (com.max.hbutils.utils.n.q(pUBGMatchObj.getRank()) == 1) {
                textView5.setTextColor(context.getResources().getColor(R.color.orange_255_110));
                textView4.setTextColor(context.getResources().getColor(R.color.orange_255_110));
                textView6.setTextColor(context.getResources().getColor(R.color.orange_255_110));
                textView.setTextColor(context.getResources().getColor(R.color.orange_255_110));
                viewI.setVisibility(0);
                viewI.setBackgroundColor(context.getResources().getColor(R.color.orange_255_110));
            } else if (com.max.hbutils.utils.n.q(pUBGMatchObj.getRank()) <= 10) {
                textView5.setTextColor(context.getResources().getColor(R.color.yellow_255));
                textView4.setTextColor(context.getResources().getColor(R.color.yellow_255));
                textView6.setTextColor(context.getResources().getColor(R.color.yellow_255));
                textView.setTextColor(context.getResources().getColor(R.color.yellow_255));
                viewI.setVisibility(0);
                viewI.setBackgroundColor(context.getResources().getColor(R.color.yellow_255));
            } else {
                textView5.setTextColor(context.getResources().getColor(R.color.text_secondary_1_color));
                textView4.setTextColor(context.getResources().getColor(R.color.text_secondary_1_color));
                textView6.setTextColor(context.getResources().getColor(R.color.text_secondary_1_color));
                textView.setTextColor(context.getResources().getColor(R.color.text_secondary_2_color));
                viewI.setBackgroundColor(context.getResources().getColor(R.color.white));
                viewI.setVisibility(4);
            }
        } else if ("win".equals(pUBGMatchObj.getTag())) {
            viewI.setVisibility(0);
            textView = textView11;
            textView.setTextColor(context.getResources().getColor(R.color.orange_255_110));
            viewI.setBackgroundColor(context.getResources().getColor(R.color.orange_255_110));
        } else {
            textView = textView11;
            if ("top10".equals(pUBGMatchObj.getTag())) {
                viewI.setVisibility(0);
                textView.setTextColor(context.getResources().getColor(R.color.yellow_255));
                viewI.setBackgroundColor(context.getResources().getColor(R.color.yellow_255));
            } else {
                textView.setTextColor(context.getResources().getColor(R.color.text_secondary_2_color));
                viewI.setBackgroundColor(context.getResources().getColor(R.color.white));
                viewI.setVisibility(4);
            }
        }
        if (TextUtils.isEmpty(pUBGMatchObj.getTag_desc())) {
            textView.setVisibility(8);
        } else {
            textView.setText(pUBGMatchObj.getTag_desc());
        }
        textView12.setText("总击杀");
        textView14.setText(pUBGMatchObj.getRegion_desc());
        textView13.setText(pUBGMatchObj.getK());
        if (com.max.hbcommon.utils.c.u(pUBGMatchObj.getScore())) {
            imageView4.setVisibility(8);
            return;
        }
        if (ak.aB.equalsIgnoreCase(pUBGMatchObj.getScore())) {
            imageView = imageView4;
            imageView.setImageResource(R.drawable.pubg_msg_score_s);
        } else if (ak.av.equalsIgnoreCase(pUBGMatchObj.getScore())) {
            imageView = imageView4;
            imageView.setImageResource(R.drawable.pubg_msg_score_a);
        } else if ("b".equalsIgnoreCase(pUBGMatchObj.getScore())) {
            imageView = imageView4;
            imageView.setImageResource(R.drawable.pubg_msg_score_b);
        } else if (ak.aF.equalsIgnoreCase(pUBGMatchObj.getScore()) || "d".equalsIgnoreCase(pUBGMatchObj.getScore())) {
            imageView = imageView4;
            imageView.setImageResource(R.drawable.pubg_msg_score_d);
        }
        imageView = imageView4;
        imageView.setVisibility(0);
    }

    public static void j(ViewGroup viewGroup, String str, String str2, float f10) {
        if (PatchProxy.proxy(new Object[]{viewGroup, str, str2, new Float(f10)}, null, changeQuickRedirect, true, 38351, new Class[]{ViewGroup.class, String.class, String.class, Float.TYPE}, Void.TYPE).isSupported || viewGroup == null) {
            return;
        }
        TextView textView = (TextView) viewGroup.findViewById(R.id.tv_view_circle_process_title);
        TextView textView2 = (TextView) viewGroup.findViewById(R.id.tv_view_circle_process_value);
        CircleProgressView circleProgressView = (CircleProgressView) viewGroup.findViewById(R.id.cpv_view_circle_process);
        textView.setText(str);
        textView2.setText(str2);
        ValueAnimator valueAnimatorOfFloat = ValueAnimator.ofFloat(0.0f, f10);
        valueAnimatorOfFloat.setDuration(1000L);
        valueAnimatorOfFloat.setInterpolator(new AccelerateInterpolator());
        valueAnimatorOfFloat.addUpdateListener(new a(circleProgressView));
        valueAnimatorOfFloat.start();
    }

    public static void k(s.e eVar, PlayerRankObj playerRankObj, boolean z10, boolean z11, boolean z12, boolean z13, View.OnClickListener onClickListener, boolean z14) {
        int i10;
        int i11;
        int i12;
        s.e eVar2;
        Object[] objArr = {eVar, playerRankObj, new Byte(z10 ? (byte) 1 : (byte) 0), new Byte(z11 ? (byte) 1 : (byte) 0), new Byte(z12 ? (byte) 1 : (byte) 0), new Byte(z13 ? (byte) 1 : (byte) 0), onClickListener, new Byte(z14 ? (byte) 1 : (byte) 0)};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        Class cls = Boolean.TYPE;
        if (PatchProxy.proxy(objArr, null, changeQuickRedirect2, true, 38348, new Class[]{s.e.class, PlayerRankObj.class, cls, cls, cls, cls, View.OnClickListener.class, cls}, Void.TYPE).isSupported || eVar == null || playerRankObj == null) {
            return;
        }
        final Context context = eVar.itemView.getContext();
        GradientTextView gradientTextView = (GradientTextView) eVar.i(R.id.tv_item_friend_ranking_num);
        ImageView imageView = (ImageView) eVar.i(R.id.iv_item_friend_ranking_avatar);
        TextView textView = (TextView) eVar.i(R.id.tv_item_friend_ranking_nickname);
        TextView textView2 = (TextView) eVar.i(R.id.tv_item_friend_ranking_x_time);
        ImageView imageView2 = (ImageView) eVar.i(R.id.iv_friend_rating_img);
        ProgressBar progressBar = (ProgressBar) eVar.i(R.id.pb_item_friend_ranking_x);
        ViewGroup viewGroup = (ViewGroup) eVar.i(R.id.vg_item_friend_invite);
        ImageView imageView3 = (ImageView) eVar.i(R.id.iv_item_friend_ranking_x_heybox_avatar);
        TextView textView3 = (TextView) eVar.i(R.id.tv_item_friend_ranking_x_heybox_username);
        View viewI = eVar.i(R.id.vg_item_friend_ranking_x_heybox_info);
        View viewI2 = eVar.i(R.id.v_item_friend_ranking_divider);
        bb.d.d(gradientTextView, 4);
        gradientTextView.setText(playerRankObj.getRank() + "");
        if (z10) {
            gradientTextView.setColors(com.max.xiaoheihe.utils.d.E(R.color.white), com.max.xiaoheihe.utils.d.E(R.color.white));
        } else {
            Pair<Integer, Integer> pairM = com.max.xiaoheihe.module.account.utils.l.m(playerRankObj.getRank());
            gradientTextView.setColors(((Integer) pairM.first).intValue(), ((Integer) pairM.second).intValue(), GradientDrawable.Orientation.BL_TR);
        }
        if (gradientTextView.getText().toString().length() >= 3) {
            i10 = 1;
            gradientTextView.setTextSize(1, 14.0f);
        } else {
            i10 = 1;
            gradientTextView.setTextSize(1, 18.0f);
        }
        if (!z13 || com.max.hbcommon.utils.c.u(playerRankObj.getRating_img())) {
            i11 = 0;
            imageView2.setVisibility(8);
        } else {
            i11 = 0;
            imageView2.setVisibility(0);
            com.max.hbimage.b.K(playerRankObj.getRating_img(), imageView2);
        }
        com.max.hbimage.b.d0(playerRankObj.getAvatar(), imageView, ViewUtils.f(context, 3.0f));
        textView.setText(playerRankObj.getNickname());
        progressBar.setVisibility(i11);
        textView2.setText(!com.max.hbcommon.utils.c.u(playerRankObj.getValue_desc()) ? playerRankObj.getValue_desc() : playerRankObj.getValue());
        if (z12) {
            int[] iArr = new int[i10];
            iArr[i11] = (int) playerRankObj.getPercent();
            ValueAnimator valueAnimatorOfInt = ValueAnimator.ofInt(iArr);
            valueAnimatorOfInt.setInterpolator(new AccelerateInterpolator());
            valueAnimatorOfInt.addUpdateListener(new i(progressBar));
            valueAnimatorOfInt.setDuration(500L);
            valueAnimatorOfInt.start();
        } else {
            progressBar.setProgress((int) playerRankObj.getPercent());
        }
        com.max.xiaoheihe.module.account.utils.l.S(progressBar, playerRankObj.getStart_color(), playerRankObj.getEnd_color());
        final HeyboxInfoObj heybox_info = playerRankObj.getHeybox_info();
        if (heybox_info == null || TextUtils.isEmpty(heybox_info.getUserid()) || "-1".equals(heybox_info.getUserid())) {
            viewGroup.setVisibility(i11);
            i12 = 8;
            textView3.setVisibility(8);
            imageView3.setVisibility(8);
            viewI.setOnClickListener(null);
            viewGroup.setOnClickListener(new j(context));
        } else {
            viewGroup.setVisibility(8);
            textView3.setVisibility(i11);
            imageView3.setVisibility(i11);
            viewGroup.setOnClickListener(null);
            viewI.setOnClickListener(new View.OnClickListener() { // from class: com.max.xiaoheihe.module.game.pubg.utils.a
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    b.d(context, heybox_info, view);
                }
            });
            textView3.setText(heybox_info.getUsername());
            com.max.hbimage.b.H(heybox_info.getAvartar(), imageView3);
            i12 = 8;
        }
        if (z11) {
            viewI2.setVisibility(i12);
        } else {
            viewI2.setVisibility(i11);
        }
        if (z10) {
            eVar2 = eVar;
            eVar2.itemView.setBackgroundColor(com.max.xiaoheihe.utils.d.E(R.color.white_alpha5));
        } else {
            eVar2 = eVar;
            if (z14) {
                eVar2.itemView.setBackgroundResource(R.drawable.bg_transpant);
            } else {
                eVar2.itemView.setBackgroundResource(R.drawable.list_item_bg);
            }
        }
        String nickname = playerRankObj.getNickname();
        String player_id = playerRankObj.getPlayer_id();
        if (TextUtils.isEmpty(player_id)) {
            player_id = playerRankObj.getAccount_id();
        }
        if (TextUtils.isEmpty(player_id)) {
            player_id = playerRankObj.getReal_name();
        }
        if (TextUtils.isEmpty(player_id)) {
            player_id = playerRankObj.getNickname();
        }
        if (onClickListener != null) {
            eVar2.itemView.setOnClickListener(onClickListener);
            return;
        }
        if (z13) {
            eVar2.itemView.setOnClickListener(new k(nickname, playerRankObj, player_id));
            return;
        }
        String steam_id = playerRankObj.getSteam_id();
        if (heybox_info == null || TextUtils.isEmpty(heybox_info.getUserid()) || "-1".equals(heybox_info.getUserid())) {
            return;
        }
        eVar2.itemView.setOnClickListener(new l(heybox_info, steam_id));
    }

    public static void l(ViewGroup viewGroup, PUBGMatchObj pUBGMatchObj, boolean z10) {
        int i10;
        int i11;
        if (PatchProxy.proxy(new Object[]{viewGroup, pUBGMatchObj, new Byte(z10 ? (byte) 1 : (byte) 0)}, null, changeQuickRedirect, true, 38344, new Class[]{ViewGroup.class, PUBGMatchObj.class, Boolean.TYPE}, Void.TYPE).isSupported || viewGroup == null) {
            return;
        }
        if (pUBGMatchObj == null) {
            viewGroup.setVisibility(8);
        }
        Context context = viewGroup.getContext();
        View viewFindViewById = viewGroup.findViewById(R.id.v_item_matches_sign);
        TextView textView = (TextView) viewGroup.findViewById(R.id.tv_item_matches_count);
        ViewGroup viewGroup2 = (ViewGroup) viewGroup.findViewById(R.id.vg_rank);
        ViewGroup viewGroup3 = (ViewGroup) viewGroup.findViewById(R.id.vg_matches_count);
        TextView textView2 = (TextView) viewGroup.findViewById(R.id.tv_rank);
        TextView textView3 = (TextView) viewGroup.findViewById(R.id.tv_rank_header);
        TextView textView4 = (TextView) viewGroup.findViewById(R.id.tv_team_count);
        TextView textView5 = (TextView) viewGroup.findViewById(R.id.tv_item_matches_time);
        ImageView imageView = (ImageView) viewGroup.findViewById(R.id.iv_item_matches_mode);
        TextView textView6 = (TextView) viewGroup.findViewById(R.id.tv_item_matches_rating);
        TextView textView7 = (TextView) viewGroup.findViewById(R.id.tv_item_matches_rating_diff);
        TextView textView8 = (TextView) viewGroup.findViewById(R.id.tv_item_matches_rating_hint);
        TextView textView9 = (TextView) viewGroup.findViewById(R.id.tv_item_matches_kd);
        TextView textView10 = (TextView) viewGroup.findViewById(R.id.tv_item_matches_kd_hint);
        TextView textView11 = (TextView) viewGroup.findViewById(R.id.tv_item_matches_score);
        View viewFindViewById2 = viewGroup.findViewById(R.id.v_item_matches_divider);
        TextView textView12 = (TextView) viewGroup.findViewById(R.id.tv_item_matches_region);
        TextView textView13 = (TextView) viewGroup.findViewById(R.id.tv_fpp);
        TextView textView14 = (TextView) viewGroup.findViewById(R.id.tv_map);
        com.max.hbimage.b.R(pUBGMatchObj.getMode_img(), imageView, 0, ViewUtils.f(context, 11.0f), 1, -1);
        if (com.max.hbcommon.utils.c.u(pUBGMatchObj.getMatchId())) {
            viewGroup3.setVisibility(0);
            viewGroup2.setVisibility(8);
            textView.setText(pUBGMatchObj.getMatch_count());
        } else {
            viewGroup2.setVisibility(0);
            viewGroup3.setVisibility(8);
            textView2.setText(pUBGMatchObj.getRank());
            textView4.setText("/" + pUBGMatchObj.getTeam_count());
        }
        textView5.setText(pUBGMatchObj.getTime());
        textView6.setText(pUBGMatchObj.getRating());
        textView7.setText(pUBGMatchObj.getRating_diff());
        if (CommonNetImpl.UP.equals(pUBGMatchObj.getRating_trend())) {
            textView7.setTextColor(com.max.xiaoheihe.utils.d.E(R.color.green_70));
        } else if ("down".equals(pUBGMatchObj.getRating_trend())) {
            textView7.setTextColor(com.max.xiaoheihe.utils.d.E(R.color.red_208));
        }
        if (com.max.hbcommon.utils.c.u(pUBGMatchObj.getMatchId())) {
            if ("win".equals(pUBGMatchObj.getTag())) {
                viewFindViewById.setVisibility(0);
                textView8.setTextColor(context.getResources().getColor(R.color.orange_255_110));
                viewFindViewById.setBackgroundColor(context.getResources().getColor(R.color.orange_255_110));
            } else if ("top10".equals(pUBGMatchObj.getTag())) {
                viewFindViewById.setVisibility(0);
                textView8.setTextColor(context.getResources().getColor(R.color.yellow_255));
                viewFindViewById.setBackgroundColor(context.getResources().getColor(R.color.yellow_255));
            } else {
                textView8.setTextColor(context.getResources().getColor(R.color.text_secondary_2_color));
                viewFindViewById.setBackgroundColor(context.getResources().getColor(R.color.white));
                i10 = 8;
                viewFindViewById.setVisibility(8);
            }
            i10 = 8;
        } else {
            if (com.max.hbutils.utils.n.q(pUBGMatchObj.getRank()) == 1) {
                textView2.setTextColor(context.getResources().getColor(R.color.orange_255_110));
                textView3.setTextColor(context.getResources().getColor(R.color.orange_255_110));
                textView4.setTextColor(context.getResources().getColor(R.color.orange_255_110));
                textView8.setTextColor(context.getResources().getColor(R.color.orange_255_110));
                viewFindViewById.setVisibility(0);
                viewFindViewById.setBackgroundColor(context.getResources().getColor(R.color.orange_255_110));
            } else if (com.max.hbutils.utils.n.q(pUBGMatchObj.getRank()) <= 10) {
                textView2.setTextColor(context.getResources().getColor(R.color.yellow_255));
                textView3.setTextColor(context.getResources().getColor(R.color.yellow_255));
                textView4.setTextColor(context.getResources().getColor(R.color.yellow_255));
                textView8.setTextColor(context.getResources().getColor(R.color.yellow_255));
                viewFindViewById.setVisibility(0);
                viewFindViewById.setBackgroundColor(context.getResources().getColor(R.color.yellow_255));
            } else {
                textView2.setTextColor(context.getResources().getColor(R.color.text_secondary_1_color));
                textView3.setTextColor(context.getResources().getColor(R.color.text_secondary_1_color));
                textView4.setTextColor(context.getResources().getColor(R.color.text_secondary_1_color));
                textView8.setTextColor(context.getResources().getColor(R.color.text_secondary_2_color));
                viewFindViewById.setBackgroundColor(context.getResources().getColor(R.color.white));
                i10 = 8;
                viewFindViewById.setVisibility(8);
            }
            i10 = 8;
        }
        if (TextUtils.isEmpty(pUBGMatchObj.getTag_desc())) {
            textView8.setVisibility(i10);
            i11 = 0;
        } else {
            i11 = 0;
            textView8.setVisibility(0);
            textView8.setText(pUBGMatchObj.getTag_desc());
        }
        byte b10 = 2;
        String[] strArr = new String[2];
        strArr[i11] = pUBGMatchObj.getMap_name();
        strArr[1] = pUBGMatchObj.getMap_color();
        if (com.max.hbcommon.utils.c.v(strArr)) {
            textView14.setVisibility(8);
        } else {
            textView14.setText(pUBGMatchObj.getMap_name());
            textView14.setBackgroundColor(com.max.xiaoheihe.utils.d.e1(pUBGMatchObj.getMap_color()));
            textView14.setVisibility(i11);
        }
        if (com.max.hbcommon.utils.c.u(pUBGMatchObj.getDamage_dealt())) {
            textView9.setText(pUBGMatchObj.getKd());
        } else {
            textView9.setText(pUBGMatchObj.getDamage_dealt());
        }
        textView12.setText(pUBGMatchObj.getRegion_desc());
        if (pUBGMatchObj.getMode().contains("fpp")) {
            textView13.setVisibility(0);
        } else {
            textView13.setVisibility(8);
        }
        textView10.setText(pUBGMatchObj.getK());
        textView11.setText(pUBGMatchObj.getScore());
        String upperCase = pUBGMatchObj.getScore().toUpperCase();
        upperCase.hashCode();
        switch (upperCase.hashCode()) {
            case 65:
                b10 = !upperCase.equals(androidx.exifinterface.media.a.W4) ? (byte) -1 : (byte) 0;
                break;
            case 66:
                b10 = !upperCase.equals("B") ? (byte) -1 : (byte) 1;
                break;
            case 67:
                if (!upperCase.equals("C")) {
                    b10 = -1;
                }
                break;
            case 68:
                b10 = !upperCase.equals("D") ? (byte) -1 : (byte) 3;
                break;
            case 83:
                b10 = !upperCase.equals(androidx.exifinterface.media.a.R4) ? (byte) -1 : (byte) 4;
                break;
            default:
                b10 = -1;
                break;
        }
        switch (b10) {
            case 0:
                textView11.setTextColor(context.getResources().getColor(R.color.yellow_255));
                break;
            case 1:
                textView11.setTextColor(context.getResources().getColor(R.color.text_primary_2_color));
                break;
            case 2:
                textView11.setTextColor(context.getResources().getColor(R.color.text_secondary_1_color));
                break;
            case 3:
                textView11.setTextColor(context.getResources().getColor(R.color.text_secondary_2_color));
                break;
            case 4:
                textView11.setTextColor(context.getResources().getColor(R.color.orange_255_110));
                break;
            default:
                textView11.setTextColor(context.getResources().getColor(R.color.text_secondary_2_color));
                break;
        }
        viewGroup.setOnClickListener(new g(context, pUBGMatchObj));
        if (z10) {
            viewFindViewById2.setVisibility(4);
        } else {
            viewFindViewById2.setVisibility(0);
        }
    }

    public static void m(View view, OWAchievementsObj oWAchievementsObj, String str, View.OnClickListener onClickListener, String str2) {
        if (PatchProxy.proxy(new Object[]{view, oWAchievementsObj, str, onClickListener, str2}, null, changeQuickRedirect, true, 38357, new Class[]{View.class, OWAchievementsObj.class, String.class, View.OnClickListener.class, String.class}, Void.TYPE).isSupported || view == null) {
            return;
        }
        if (oWAchievementsObj == null || com.max.hbcommon.utils.c.w(oWAchievementsObj.getAchievements())) {
            view.setVisibility(8);
            return;
        }
        view.setVisibility(0);
        Context context = view.getContext();
        ViewGroup viewGroup = (ViewGroup) view.findViewById(R.id.vg_matches_card_layout_all_bottom);
        ViewGroup viewGroup2 = (ViewGroup) view.findViewById(R.id.vg_matches_card_no_data);
        TextView textView = (TextView) view.findViewById(R.id.tv_matches_card_no_data);
        View viewFindViewById = view.findViewById(R.id.v_title_divider);
        ViewGroup viewGroup3 = (ViewGroup) view.findViewById(R.id.vg_achievement);
        TextView textView2 = (TextView) view.findViewById(R.id.tv_card_title);
        TextView textView3 = (TextView) view.findViewById(R.id.tv_card_desc);
        textView.setText(context.getString(R.string.have_no_record));
        com.max.xiaoheihe.module.account.utils.l.K(viewGroup, true, onClickListener);
        if (com.max.hbcommon.utils.c.w(oWAchievementsObj.getAchievements())) {
            viewGroup2.setVisibility(0);
        } else {
            viewGroup2.setVisibility(8);
        }
        viewFindViewById.setVisibility(8);
        textView2.setText(str);
        textView2.setTextSize(1, 18.0f);
        textView3.setText("完成度： " + oWAchievementsObj.getAchieved_count() + "/" + oWAchievementsObj.getTotal_count());
        int iMin = Math.min(oWAchievementsObj.getAchievements().size(), 7);
        viewGroup3.removeAllViews();
        for (int i10 = 0; i10 < iMin; i10++) {
            FrameLayout frameLayout = new FrameLayout(context);
            LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(ViewUtils.f(context, 44.0f), ViewUtils.f(context, 44.0f));
            if (i10 != 0) {
                layoutParams.leftMargin = ViewUtils.f(context, 4.0f);
            }
            frameLayout.setLayoutParams(layoutParams);
            ImageView imageView = new ImageView(context);
            FrameLayout.LayoutParams layoutParams2 = new FrameLayout.LayoutParams(ViewUtils.f(context, 34.0f), ViewUtils.f(context, 34.0f));
            layoutParams2.gravity = 17;
            imageView.setLayoutParams(layoutParams2);
            frameLayout.setBackgroundResource(R.color.divider_secondary_2_color);
            frameLayout.addView(imageView);
            com.max.hbimage.b.K(oWAchievementsObj.getAchievements().get(i10).getIcon(), imageView);
            ColorStateList colorStateListValueOf = ColorStateList.valueOf(com.max.xiaoheihe.utils.d.E(R.color.ow_orange));
            ColorStateList colorStateListValueOf2 = ColorStateList.valueOf(com.max.xiaoheihe.utils.d.E(R.color.text_secondary_2_color));
            if ("1".equals(oWAchievementsObj.getAchievements().get(i10).getAchieved())) {
                imageView.setImageTintList(colorStateListValueOf);
            } else {
                imageView.setImageTintList(colorStateListValueOf2);
            }
            viewGroup3.addView(frameLayout);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static void n(View view, List<OWPlayerHeroObj> list, String str, View.OnClickListener onClickListener, String str2, String str3, boolean z10) {
        int i10;
        if (PatchProxy.proxy(new Object[]{view, list, str, onClickListener, str2, str3, new Byte(z10 ? (byte) 1 : (byte) 0)}, null, changeQuickRedirect, true, 38355, new Class[]{View.class, List.class, String.class, View.OnClickListener.class, String.class, String.class, Boolean.TYPE}, Void.TYPE).isSupported || view == null) {
            return;
        }
        if (list == null || list.size() <= 0) {
            view.setVisibility(8);
            return;
        }
        view.setVisibility(0);
        Context context = view.getContext();
        ViewGroup viewGroup = (ViewGroup) view.findViewById(R.id.vg_matches_card_layout_all_bottom);
        ViewGroup viewGroup2 = (ViewGroup) view.findViewById(R.id.vg_matches_card_no_data);
        TextView textView = (TextView) view.findViewById(R.id.tv_matches_card_no_data);
        TextView textView2 = (TextView) view.findViewById(R.id.tv_card_title);
        TextView textView3 = (TextView) view.findViewById(R.id.tv_header_0);
        TextView textView4 = (TextView) view.findViewById(R.id.tv_3);
        TextView textView5 = (TextView) view.findViewById(R.id.tv_1);
        ViewGroup viewGroup3 = (ViewGroup) view.findViewById(R.id.vg_2);
        textView.setText(context.getString(R.string.have_no_record));
        com.max.xiaoheihe.module.account.utils.l.K(viewGroup, list.size() > 4, onClickListener);
        if ("unranked".equals(str3)) {
            viewGroup3.setVisibility(8);
            textView3.setText("游戏时间");
            textView5.setText("胜场");
            textView4.setText("K/D");
            i10 = 0;
        } else {
            i10 = 0;
            viewGroup3.setVisibility(0);
            textView3.setText("场数");
            textView5.setText("胜率");
            textView4.setText("K/D");
        }
        if (list.size() <= 0) {
            viewGroup2.setVisibility(i10);
        } else {
            viewGroup2.setVisibility(8);
        }
        textView2.setText(str);
        textView2.setTextSize(1, 18.0f);
        int[] iArr = {R.id.vg_card_item_0, R.id.vg_card_item_1, R.id.vg_card_item_2, R.id.vg_card_item_3, R.id.vg_card_item_4};
        ViewGroup[] viewGroupArr = new ViewGroup[5];
        int size = list.size();
        int i11 = i10;
        while (i11 < 5) {
            ViewGroup viewGroup4 = (ViewGroup) view.findViewById(iArr[i11]);
            viewGroupArr[i11] = viewGroup4;
            if (i11 < size) {
                o(viewGroup4, list.get(i11), i11 == list.size() - 1 ? 1 : i10, str2, str3, z10);
            } else {
                viewGroup4.setVisibility(8);
            }
            i11++;
        }
    }

    public static void o(ViewGroup viewGroup, OWPlayerHeroObj oWPlayerHeroObj, boolean z10, String str, String str2, boolean z11) {
        int i10;
        Object[] objArr = {viewGroup, oWPlayerHeroObj, new Byte(z10 ? (byte) 1 : (byte) 0), str, str2, new Byte(z11 ? (byte) 1 : (byte) 0)};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        Class cls = Boolean.TYPE;
        if (PatchProxy.proxy(objArr, null, changeQuickRedirect2, true, 38356, new Class[]{ViewGroup.class, OWPlayerHeroObj.class, cls, String.class, String.class, cls}, Void.TYPE).isSupported || viewGroup == null) {
            return;
        }
        if (oWPlayerHeroObj == null) {
            viewGroup.setVisibility(8);
        }
        Context context = viewGroup.getContext();
        ImageView imageView = (ImageView) viewGroup.findViewById(R.id.iv_icon);
        TextView textView = (TextView) viewGroup.findViewById(R.id.tv_name);
        TextView textView2 = (TextView) viewGroup.findViewById(R.id.tv_pb_desc);
        ProgressBar progressBar = (ProgressBar) viewGroup.findViewById(R.id.pb_ranking);
        TextView textView3 = (TextView) viewGroup.findViewById(R.id.tv_v_1);
        RelativeLayout relativeLayout = (RelativeLayout) viewGroup.findViewById(R.id.vg_2);
        TextView textView4 = (TextView) viewGroup.findViewById(R.id.tv_v_2);
        TextView textView5 = (TextView) viewGroup.findViewById(R.id.tv_k_2);
        TextView textView6 = (TextView) viewGroup.findViewById(R.id.tv_v_3);
        View viewFindViewById = viewGroup.findViewById(R.id.v_divider);
        ImageView imageView2 = (ImageView) viewGroup.findViewById(R.id.iv_arrow);
        com.max.hbimage.b.H(oWPlayerHeroObj.getHero_info().getHero_img(), imageView);
        textView.setText(oWPlayerHeroObj.getHero_info().getDisplayName());
        progressBar.setProgress((int) (com.max.hbutils.utils.n.p(oWPlayerHeroObj.getPercent()) * 100.0f));
        if ("unranked".equals(str2)) {
            textView2.setText(oWPlayerHeroObj.getMatch_time());
            relativeLayout.setVisibility(8);
            textView3.setText(oWPlayerHeroObj.getWin_count());
            i10 = 0;
        } else {
            textView2.setText(oWPlayerHeroObj.getMatch_count());
            textView3.setText(oWPlayerHeroObj.getWin_rate());
            i10 = 0;
            relativeLayout.setVisibility(0);
            textView5.setText(oWPlayerHeroObj.getMmr_rank());
            textView4.setText(oWPlayerHeroObj.getMmr());
        }
        textView6.setText(oWPlayerHeroObj.getKd());
        if (z11) {
            imageView2.setVisibility(i10);
            viewGroup.setOnClickListener(new c(context, str, oWPlayerHeroObj, str2));
        } else {
            imageView2.setVisibility(8);
        }
        if (z10) {
            viewFindViewById.setVisibility(4);
        } else {
            viewFindViewById.setVisibility(i10);
        }
    }

    public static void p(s.e eVar, PlayerInfoObj playerInfoObj) {
        if (PatchProxy.proxy(new Object[]{eVar, playerInfoObj}, null, changeQuickRedirect, true, 38347, new Class[]{s.e.class, PlayerInfoObj.class}, Void.TYPE).isSupported) {
            return;
        }
        ImageView imageView = (ImageView) eVar.i(R.id.iv_avatar);
        Context context = imageView.getContext();
        View viewB = eVar.b();
        com.max.hbimage.b.d0(playerInfoObj.getAvatar(), imageView, ViewUtils.f(context, 2.0f));
        eVar.p(R.id.tv_nickname, playerInfoObj.getNickname());
        eVar.p(R.id.tv_update_desc, playerInfoObj.getUpdate_desc());
        eVar.p(R.id.tv_rating, com.max.hbutils.utils.n.s(playerInfoObj.getBest_rating()) + "");
        String player_id = playerInfoObj.getPlayer_id();
        if (TextUtils.isEmpty(player_id)) {
            player_id = playerInfoObj.getAccount_id();
        }
        if (TextUtils.isEmpty(player_id)) {
            player_id = playerInfoObj.getNickname();
        }
        viewB.setOnClickListener(new h(playerInfoObj, player_id));
    }

    public static void q(ViewGroup viewGroup, R6RadarDataObj r6RadarDataObj) {
        if (PatchProxy.proxy(new Object[]{viewGroup, r6RadarDataObj}, null, changeQuickRedirect, true, 38353, new Class[]{ViewGroup.class, R6RadarDataObj.class}, Void.TYPE).isSupported || viewGroup == null) {
            return;
        }
        if (r6RadarDataObj == null) {
            viewGroup.setVisibility(8);
            return;
        }
        viewGroup.setVisibility(0);
        HeyBoxRadarChart heyBoxRadarChart = (HeyBoxRadarChart) viewGroup.findViewById(R.id.hbrc_view_radar_chart_view);
        ViewGroup viewGroup2 = (ViewGroup) viewGroup.findViewById(R.id.vg_view_radar_chart_view_score);
        ViewGroup viewGroup3 = (ViewGroup) viewGroup.findViewById(R.id.vg_view_radar_chart_view_rank);
        r(heyBoxRadarChart, r6RadarDataObj.getScore());
        ((CircleProgressView) viewGroup2.findViewById(R.id.cpv_view_circle_process)).e(com.max.xiaoheihe.utils.d.E(R.color.white_alpha10));
        ((CircleProgressView) viewGroup3.findViewById(R.id.cpv_view_circle_process)).e(com.max.xiaoheihe.utils.d.E(R.color.white_alpha10));
        try {
            j(viewGroup2, r6RadarDataObj.getMain1(), r6RadarDataObj.getDesc1(), Float.parseFloat(r6RadarDataObj.getPercent1()) / 100.0f);
            j(viewGroup3, r6RadarDataObj.getMain2(), r6RadarDataObj.getDesc2(), Float.parseFloat(r6RadarDataObj.getPercent2()) / 100.0f);
        } catch (Exception unused) {
        }
    }

    public static void r(HeyBoxRadarChart heyBoxRadarChart, List<R6KVObj> list) {
        if (PatchProxy.proxy(new Object[]{heyBoxRadarChart, list}, null, changeQuickRedirect, true, 38354, new Class[]{HeyBoxRadarChart.class, List.class}, Void.TYPE).isSupported || heyBoxRadarChart == null) {
            return;
        }
        if (list == null || list.size() <= 0) {
            heyBoxRadarChart.setVisibility(8);
            return;
        }
        int size = list.size();
        heyBoxRadarChart.setVisibility(0);
        heyBoxRadarChart.setBackgroundColor(com.max.xiaoheihe.utils.d.E(R.color.transparent));
        heyBoxRadarChart.getXAxisRenderer().l(com.max.xiaoheihe.utils.d.E(R.color.text_secondary_2_color));
        heyBoxRadarChart.setExtraTopOffset(40.0f);
        heyBoxRadarChart.setExtraBottomOffset(20.0f);
        heyBoxRadarChart.setRotationEnabled(false);
        heyBoxRadarChart.setDescription(null);
        heyBoxRadarChart.getLegend().setEnabled(false);
        Easing.EasingOption easingOption = Easing.EasingOption.EaseInOutQuad;
        heyBoxRadarChart.animateXY(1000, 1000, easingOption, easingOption);
        XAxis xAxis = heyBoxRadarChart.getXAxis();
        xAxis.setValueFormatter(new C0806b(size, list));
        xAxis.setDrawLabels(false);
        YAxis yAxis = heyBoxRadarChart.getYAxis();
        yAxis.setLabelCount(5, true);
        yAxis.setDrawLabels(false);
        yAxis.setAxisMinimum(0.0f);
        yAxis.setAxisMaximum(100.0f);
        ArrayList arrayList = new ArrayList();
        int i10 = 0;
        while (i10 < size) {
            arrayList.add(new RadarEntry(com.max.hbutils.utils.n.p(list.get(i10 > 0 ? size - i10 : i10).getV())));
            i10++;
        }
        RadarDataSet radarDataSet = new RadarDataSet(arrayList, "");
        radarDataSet.setDrawFilled(true);
        radarDataSet.setDrawValues(false);
        radarDataSet.setDrawHighlightIndicators(false);
        radarDataSet.setFillAlpha(154);
        radarDataSet.setFillDrawable(ViewUtils.v(ViewUtils.V(heyBoxRadarChart), ViewUtils.V(heyBoxRadarChart), GradientDrawable.Orientation.TOP_BOTTOM, -14115353, -14115353));
        radarDataSet.setColor(com.max.xiaoheihe.utils.d.E(R.color.text_secondary_2_color));
        ArrayList arrayList2 = new ArrayList();
        arrayList2.add(radarDataSet);
        heyBoxRadarChart.setData(new RadarData(arrayList2));
        heyBoxRadarChart.invalidate();
    }

    public static void s(ViewGroup viewGroup, PUBGPlayerOverviewObj pUBGPlayerOverviewObj) {
        if (PatchProxy.proxy(new Object[]{viewGroup, pUBGPlayerOverviewObj}, null, changeQuickRedirect, true, 38349, new Class[]{ViewGroup.class, PUBGPlayerOverviewObj.class}, Void.TYPE).isSupported || viewGroup == null) {
            return;
        }
        if (pUBGPlayerOverviewObj == null) {
            viewGroup.setVisibility(8);
            return;
        }
        if (pUBGPlayerOverviewObj.getRadar_score() == null && pUBGPlayerOverviewObj.getNormal_score_round() == null && pUBGPlayerOverviewObj.getPlayer_rank_round() == null) {
            viewGroup.setVisibility(8);
            return;
        }
        viewGroup.setVisibility(0);
        RadarView radarView = (RadarView) viewGroup.findViewById(R.id.radar);
        TextView textView = (TextView) viewGroup.findViewById(R.id.tv_score);
        TextView textView2 = (TextView) viewGroup.findViewById(R.id.tv_level);
        TextView textView3 = (TextView) viewGroup.findViewById(R.id.tv_score_desc);
        TextView textView4 = (TextView) viewGroup.findViewById(R.id.tv_level_desc);
        t(radarView, pUBGPlayerOverviewObj.getRadar_score());
        try {
            if (pUBGPlayerOverviewObj.getNormal_score_round() != null) {
                bb.d.d(textView, 2);
                textView.setText(pUBGPlayerOverviewObj.getNormal_score_round().getValue() + "%");
                textView3.setText(pUBGPlayerOverviewObj.getNormal_score_round().getDesc());
            }
            if (pUBGPlayerOverviewObj.getPlayer_rank_round() != null) {
                bb.d.d(textView2, 2);
                textView2.setText(pUBGPlayerOverviewObj.getPlayer_rank_round().getValue());
                textView4.setText(pUBGPlayerOverviewObj.getPlayer_rank_round().getDesc());
            }
        } catch (Exception unused) {
        }
    }

    public static void t(RadarView radarView, List<PUBGDataObj> list) {
        if (PatchProxy.proxy(new Object[]{radarView, list}, null, changeQuickRedirect, true, 38350, new Class[]{RadarView.class, List.class}, Void.TYPE).isSupported || radarView == null) {
            return;
        }
        if (list == null || list.size() <= 0) {
            radarView.setVisibility(8);
            return;
        }
        if (com.max.hbcommon.utils.c.w(list)) {
            return;
        }
        ArrayList<RadarView.b> arrayList = new ArrayList<>();
        for (PUBGDataObj pUBGDataObj : list) {
            arrayList.add(new RadarView.b(pUBGDataObj.getDesc(), com.max.hbutils.utils.n.p(pUBGDataObj.getValue()), false));
        }
        Context context = radarView.getContext();
        int iF = com.max.xiaoheihe.utils.d.F(context, R.color.pubg_radar_end_color);
        int iF2 = com.max.xiaoheihe.utils.d.F(context, R.color.pubg_radar_end_color);
        radarView.setMDescColor(com.max.xiaoheihe.utils.d.F(context, R.color.white_alpha50));
        radarView.setMNormalValueColor(com.max.xiaoheihe.utils.d.F(context, R.color.white));
        radarView.setMNormalValueSizeDP(14.0f);
        radarView.setMax_value(100.0f);
        radarView.setColors(iF, iF2);
        radarView.setData(arrayList, null);
    }
}
