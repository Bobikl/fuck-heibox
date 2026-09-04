package com.max.xiaoheihe.module.news;

import android.annotation.SuppressLint;
import android.content.Context;
import android.content.res.Resources;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.google.android.flexbox.FlexboxLayout;
import com.max.hbcommon.component.ListSectionHeader;
import com.max.hbcommon.network.p;
import com.max.hbutils.bean.Result;
import com.max.hbutils.utils.ViewUtils;
import com.max.hbutils.utils.n;
import com.max.hbutils.utils.q;
import com.max.hbutils.utils.t;
import com.max.hbutils.utils.x;
import com.max.xiaoheihe.R;
import com.max.xiaoheihe.bean.bbs.FeedbackCateObj;
import com.max.xiaoheihe.bean.news.FeedbackReasonObj;
import com.max.xiaoheihe.module.bbs.ReportReasonFragment;
import com.max.xiaoheihe.network.i;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.PatchProxyResult;
import java.util.ArrayList;

/* JADX INFO: compiled from: NegativeFeedbackDialogFragment.java */
/* JADX INFO: loaded from: classes12.dex */
public class g extends com.max.hbcommon.base.swipeback.a {
    public static ChangeQuickRedirect changeQuickRedirect = null;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    private static final String f91323r = "link_id";

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    private static final String f91324s = "feedback";

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    private static final String f91325t = "h_src";

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    private static final String f91326u = "location";

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private String f91327j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private ArrayList<FeedbackCateObj> f91328k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private String f91329l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private String f91330m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private e f91331n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    private LinearLayout f91332o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    private ListSectionHeader f91333p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    private View f91334q;

    /* JADX INFO: compiled from: NegativeFeedbackDialogFragment.java */
    public class a implements View.OnClickListener {
        public static ChangeQuickRedirect changeQuickRedirect;

        a() {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            if (PatchProxy.proxy(new Object[]{view}, this, changeQuickRedirect, false, 42455, new Class[]{View.class}, Void.TYPE).isSupported) {
                return;
            }
            g.this.dismiss();
        }
    }

    /* JADX INFO: compiled from: NegativeFeedbackDialogFragment.java */
    public class b implements View.OnClickListener {
        public static ChangeQuickRedirect changeQuickRedirect;

        /* JADX INFO: compiled from: NegativeFeedbackDialogFragment.java */
        public class a implements ReportReasonFragment.b {
            public static ChangeQuickRedirect changeQuickRedirect;

            a() {
            }

            @Override // com.max.xiaoheihe.module.bbs.ReportReasonFragment.b
            public void a(String str, String str2) {
                if (PatchProxy.proxy(new Object[]{str, str2}, this, changeQuickRedirect, false, 42457, new Class[]{String.class, String.class}, Void.TYPE).isSupported) {
                    return;
                }
                com.max.xiaoheihe.module.bbs.utils.b.T(g.this.f91327j, str, str2, g.this.f91329l);
                if (g.this.f91331n != null) {
                    g.this.f91331n.a();
                }
            }
        }

        b() {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            if (PatchProxy.proxy(new Object[]{view}, this, changeQuickRedirect, false, 42456, new Class[]{View.class}, Void.TYPE).isSupported) {
                return;
            }
            ReportReasonFragment.f80025u.a(new a(), ReportReasonFragment.ObjectType.link, null, g.this.f91327j, null).show(g.this.getParentFragmentManager(), "reportReasonFragment");
            g.this.dismiss();
        }
    }

    /* JADX INFO: compiled from: NegativeFeedbackDialogFragment.java */
    public class c implements View.OnClickListener {
        public static ChangeQuickRedirect changeQuickRedirect;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ FeedbackReasonObj f91338b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ FeedbackCateObj f91339c;

        c(FeedbackReasonObj feedbackReasonObj, FeedbackCateObj feedbackCateObj) {
            this.f91338b = feedbackReasonObj;
            this.f91339c = feedbackCateObj;
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            if (PatchProxy.proxy(new Object[]{view}, this, changeQuickRedirect, false, 42458, new Class[]{View.class}, Void.TYPE).isSupported) {
                return;
            }
            g.Z3(g.this, this.f91338b.getReason(), this.f91339c.getCate(), this.f91338b.getEvent_id());
        }
    }

    /* JADX INFO: compiled from: NegativeFeedbackDialogFragment.java */
    public class d extends p {
        public static ChangeQuickRedirect changeQuickRedirect;

        d() {
        }

        @Override // com.max.hbcommon.network.p
        public void onNext(Result result) {
            if (PatchProxy.proxy(new Object[]{result}, this, changeQuickRedirect, false, 42459, new Class[]{Result.class}, Void.TYPE).isSupported) {
                return;
            }
            x.j((result == null || com.max.hbcommon.utils.c.u(result.getMsg())) ? "反馈成功" : result.getMsg());
        }

        @Override // com.max.hbcommon.network.p, com.max.hbcommon.network.d, io.reactivex.g0
        public /* bridge */ /* synthetic */ void onNext(Object obj) {
            if (PatchProxy.proxy(new Object[]{obj}, this, changeQuickRedirect, false, 42460, new Class[]{Object.class}, Void.TYPE).isSupported) {
                return;
            }
            onNext((Result) obj);
        }
    }

    /* JADX INFO: compiled from: NegativeFeedbackDialogFragment.java */
    public interface e {
        void a();
    }

    static /* synthetic */ void Z3(g gVar, String str, String str2, String str3) {
        if (PatchProxy.proxy(new Object[]{gVar, str, str2, str3}, null, changeQuickRedirect, true, 42454, new Class[]{g.class, String.class, String.class, String.class}, Void.TYPE).isSupported) {
            return;
        }
        gVar.d4(str, str2, str3);
    }

    @SuppressLint({"AutoDispose"})
    private void a4(String str, String str2, String str3, String str4) {
        if (PatchProxy.proxy(new Object[]{str, str2, str3, str4}, this, changeQuickRedirect, false, 42452, new Class[]{String.class, String.class, String.class, String.class}, Void.TYPE).isSupported) {
            return;
        }
        i.a().S6(str, str2, str3, this.f91329l, this.f91330m, str4).I5(io.reactivex.schedulers.b.d()).a4(io.reactivex.android.schedulers.a.c()).g(new d());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void b4() {
        if (PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 42453, new Class[0], Void.TYPE).isSupported) {
            return;
        }
        int i10 = t.f73585f;
        int iF = ViewUtils.f(getContext(), 20.0f);
        if (i10 == 0) {
            ViewUtils.n0(this.f91334q, 0, 0, 0, iF);
        } else {
            ViewUtils.n0(this.f91334q, 0, 0, 0, Math.max(iF - i10, 0));
        }
    }

    public static g c4(String str, ArrayList<FeedbackCateObj> arrayList, String str2, String str3) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{str, arrayList, str2, str3}, null, changeQuickRedirect, true, 42446, new Class[]{String.class, ArrayList.class, String.class, String.class}, g.class);
        if (patchProxyResultProxy.isSupported) {
            return (g) patchProxyResultProxy.result;
        }
        g gVar = new g();
        Bundle bundle = new Bundle();
        bundle.putString("link_id", str);
        bundle.putSerializable("feedback", arrayList);
        bundle.putString("h_src", str2);
        bundle.putString("location", str3);
        gVar.setArguments(bundle);
        return gVar;
    }

    private void d4(String str, String str2, String str3) {
        if (PatchProxy.proxy(new Object[]{str, str2, str3}, this, changeQuickRedirect, false, 42449, new Class[]{String.class, String.class, String.class}, Void.TYPE).isSupported) {
            return;
        }
        a4(this.f91327j, str, str2, str3);
        e eVar = this.f91331n;
        if (eVar != null) {
            eVar.a();
        }
        dismiss();
    }

    private void e4(LinearLayout linearLayout, ArrayList<FeedbackCateObj> arrayList) {
        if (PatchProxy.proxy(new Object[]{linearLayout, arrayList}, this, changeQuickRedirect, false, 42450, new Class[]{LinearLayout.class, ArrayList.class}, Void.TYPE).isSupported || linearLayout == null || arrayList == null) {
            return;
        }
        Context context = linearLayout.getContext();
        LayoutInflater layoutInflaterFrom = LayoutInflater.from(context);
        linearLayout.removeAllViews();
        int iF = ViewUtils.f(context, 12.0f);
        int iF2 = ViewUtils.f(context, 20.0f);
        int i10 = 0;
        while (i10 < arrayList.size()) {
            FeedbackCateObj feedbackCateObj = arrayList.get(i10);
            View viewInflate = layoutInflaterFrom.inflate(R.layout.item_tag_cate, (ViewGroup) linearLayout, false);
            ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) viewInflate.getLayoutParams();
            marginLayoutParams.topMargin = i10 == 0 ? iF : 0;
            marginLayoutParams.bottomMargin = i10 == arrayList.size() - 1 ? iF : iF2;
            marginLayoutParams.rightMargin = iF;
            marginLayoutParams.leftMargin = iF;
            viewInflate.setLayoutParams(marginLayoutParams);
            linearLayout.addView(viewInflate);
            f4(viewInflate, feedbackCateObj);
            i10++;
        }
    }

    private void f4(View view, FeedbackCateObj feedbackCateObj) {
        Resources resources;
        int i10;
        if (PatchProxy.proxy(new Object[]{view, feedbackCateObj}, this, changeQuickRedirect, false, 42451, new Class[]{View.class, FeedbackCateObj.class}, Void.TYPE).isSupported || feedbackCateObj.getOptions() == null || feedbackCateObj.getOptions().size() <= 0) {
            return;
        }
        TextView textView = (TextView) view.findViewById(R.id.tv_title);
        FlexboxLayout flexboxLayout = (FlexboxLayout) view.findViewById(R.id.fl_tags);
        Context context = textView.getContext();
        int iF = ViewUtils.f(context, 12.0f);
        int iF2 = ViewUtils.f(context, 8.0f);
        int iQ = !com.max.hbcommon.utils.c.u(feedbackCateObj.getCol_count()) ? n.q(feedbackCateObj.getCol_count()) : 2;
        int iL = ((ViewUtils.L(context) - (iF * 2)) - ((iQ - 1) * iF2)) / iQ;
        textView.setText(feedbackCateObj.getText());
        flexboxLayout.removeAllViews();
        int iH0 = ViewUtils.h0(context, ViewUtils.m(context, iL, ViewUtils.f(context, 30.0f)));
        for (FeedbackReasonObj feedbackReasonObj : feedbackCateObj.getOptions()) {
            TextView textView2 = new TextView(context);
            textView2.setPadding(iF, 0, iF, 0);
            textView2.setTextSize(0, context.getResources().getDimensionPixelSize(R.dimen.text_size_12));
            if (feedbackReasonObj.isChecked()) {
                resources = context.getResources();
                i10 = R.color.white;
            } else {
                resources = context.getResources();
                i10 = R.color.text_primary_2_color;
            }
            textView2.setTextColor(resources.getColor(i10));
            textView2.setText(feedbackReasonObj.getText());
            textView2.setGravity(17);
            textView2.setMaxLines(2);
            textView2.setEllipsize(TextUtils.TruncateAt.END);
            textView2.setBackground(q.o(context, feedbackReasonObj.isChecked() ? R.color.brand_color : R.color.background_card_1_color, iH0));
            textView2.setOnClickListener(new c(feedbackReasonObj, feedbackCateObj));
            if (ViewUtils.S(textView2.getPaint(), feedbackReasonObj.getText()) > (ViewUtils.L(context) - ViewUtils.f(context, 84.0f)) / 2.0f) {
                textView2.setTextSize(0, context.getResources().getDimensionPixelSize(R.dimen.text_size_10));
            }
            flexboxLayout.addView(textView2, new ViewGroup.LayoutParams(iL, ViewUtils.f(context, 30.0f)));
        }
    }

    @Override // com.max.hbcommon.base.swipeback.a, com.max.hbcommon.base.c
    public boolean L3() {
        return true;
    }

    public void g4(e eVar) {
        this.f91331n = eVar;
    }

    @Override // androidx.fragment.app.Fragment
    public View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{layoutInflater, viewGroup, bundle}, this, changeQuickRedirect, false, 42447, new Class[]{LayoutInflater.class, ViewGroup.class, Bundle.class}, View.class);
        if (patchProxyResultProxy.isSupported) {
            return (View) patchProxyResultProxy.result;
        }
        if (getArguments() != null) {
            this.f91327j = getArguments().getString("link_id");
            this.f91328k = (ArrayList) getArguments().getSerializable("feedback");
            this.f91329l = getArguments().getString("h_src");
            this.f91330m = getArguments().getString("location");
        }
        return layoutInflater.inflate(R.layout.fragment_common_feedback_dialog, viewGroup, false);
    }

    @Override // com.max.hbcommon.base.swipeback.a, com.max.hbcommon.base.c, androidx.fragment.app.Fragment
    public void onViewCreated(View view, Bundle bundle) {
        if (PatchProxy.proxy(new Object[]{view, bundle}, this, changeQuickRedirect, false, 42448, new Class[]{View.class, Bundle.class}, Void.TYPE).isSupported) {
            return;
        }
        super.onViewCreated(view, bundle);
        this.f91332o = (LinearLayout) view.findViewById(R.id.ll_container);
        this.f91333p = (ListSectionHeader) view.findViewById(R.id.v_lsh);
        this.f91334q = view.findViewById(R.id.bottom_div);
        e4(this.f91332o, this.f91328k);
        view.setOnClickListener(new a());
        this.f91333p.setOnClickListener(new b());
        this.f91334q.post(new Runnable() { // from class: com.max.xiaoheihe.module.news.f
            @Override // java.lang.Runnable
            public final void run() {
                this.f91322b.b4();
            }
        });
    }
}
