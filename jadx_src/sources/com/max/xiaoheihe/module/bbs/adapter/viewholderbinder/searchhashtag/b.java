package com.max.xiaoheihe.module.bbs.adapter.viewholderbinder.searchhashtag;

import android.content.Context;
import android.text.SpannableStringBuilder;
import android.view.View;
import android.widget.TextView;
import androidx.compose.runtime.internal.o;
import cb.c;
import com.max.hbcommon.base.adapter.s;
import com.max.hbcustomview.f;
import com.max.hbsearch.SearchNewActivity;
import com.max.hbutils.utils.ViewUtils;
import com.max.xiaoheihe.R;
import com.max.xiaoheihe.bean.bbs.HashtagObj;
import com.max.xiaoheihe.module.bbs.adapter.t;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import dl.d;
import dl.e;
import kotlin.jvm.internal.f0;

/* JADX INFO: compiled from: SearchHashtagViewHolderBinder.kt */
/* JADX INFO: loaded from: classes10.dex */
@o(parameters = 0)
public final class b extends c<HashtagObj> {
    public static ChangeQuickRedirect changeQuickRedirect = null;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final int f80709e = 8;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @d
    private com.max.xiaoheihe.module.bbs.adapter.viewholderbinder.searchhashtag.a f80710a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @d
    private Context f80711b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @d
    private s<?> f80712c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @e
    private t.a f80713d;

    /* JADX INFO: compiled from: SearchHashtagViewHolderBinder.kt */
    public static final class a implements View.OnClickListener {
        public static ChangeQuickRedirect changeQuickRedirect;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ HashtagObj f80715c;

        a(HashtagObj hashtagObj) {
            this.f80715c = hashtagObj;
        }

        @Override // android.view.View.OnClickListener
        public final void onClick(View view) {
            if (PatchProxy.proxy(new Object[]{view}, this, changeQuickRedirect, false, 27581, new Class[]{View.class}, Void.TYPE).isSupported) {
                return;
            }
            com.max.xiaoheihe.base.router.b.k0(b.this.h(), this.f80715c.getAct_protocol());
        }
    }

    /* JADX INFO: renamed from: com.max.xiaoheihe.module.bbs.adapter.viewholderbinder.searchhashtag.b$b, reason: collision with other inner class name */
    /* JADX INFO: compiled from: SearchHashtagViewHolderBinder.kt */
    public static final class ViewOnClickListenerC0689b implements View.OnClickListener {
        public static ChangeQuickRedirect changeQuickRedirect;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ HashtagObj f80717c;

        ViewOnClickListenerC0689b(HashtagObj hashtagObj) {
            this.f80717c = hashtagObj;
        }

        @Override // android.view.View.OnClickListener
        public final void onClick(View view) {
            t.a aVarI;
            if (PatchProxy.proxy(new Object[]{view}, this, changeQuickRedirect, false, 27582, new Class[]{View.class}, Void.TYPE).isSupported || (aVarI = b.this.i()) == null) {
                return;
            }
            aVarI.a(this.f80717c);
        }
    }

    public b(@d com.max.xiaoheihe.module.bbs.adapter.viewholderbinder.searchhashtag.a param) {
        f0.p(param, "param");
        this.f80710a = param;
        this.f80711b = param.h();
        this.f80712c = this.f80710a.g();
        this.f80713d = this.f80710a.i();
    }

    @Override // cb.c
    public /* bridge */ /* synthetic */ void b(s.e eVar, HashtagObj hashtagObj) {
        if (PatchProxy.proxy(new Object[]{eVar, hashtagObj}, this, changeQuickRedirect, false, 27580, new Class[]{s.e.class, Object.class}, Void.TYPE).isSupported) {
            return;
        }
        f(eVar, hashtagObj);
    }

    public void f(@d s.e viewHolder, @d HashtagObj data) {
        if (PatchProxy.proxy(new Object[]{viewHolder, data}, this, changeQuickRedirect, false, 27579, new Class[]{s.e.class, HashtagObj.class}, Void.TYPE).isSupported) {
            return;
        }
        f0.p(viewHolder, "viewHolder");
        f0.p(data, "data");
        View viewI = viewHolder.i(R.id.vg_content);
        View viewI2 = viewHolder.i(R.id.view_line);
        if ("<hr>".equals(data.getType())) {
            viewI2.setVisibility(0);
            viewI.setVisibility(8);
            return;
        }
        viewI2.setVisibility(8);
        viewI.setVisibility(0);
        TextView textView = (TextView) viewHolder.i(R.id.tv_name);
        TextView textView2 = (TextView) viewHolder.i(R.id.tv_desc);
        View viewI3 = viewHolder.i(R.id.vg_detail);
        View viewI4 = viewHolder.i(R.id.divider);
        if (data.getDesc() != null) {
            textView2.setText(data.getDesc());
        } else {
            textView2.setText("");
        }
        String str = '#' + data.getName() + '#';
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(str);
        if (com.max.hbcommon.utils.c.u(data.getSub_title())) {
            textView.setText(str);
        } else {
            String sub_title = data.getSub_title();
            int iE1 = com.max.xiaoheihe.utils.d.e1(data.getStart_color());
            int iE2 = com.max.xiaoheihe.utils.d.e1(data.getEnd_color());
            int dimensionPixelSize = this.f80711b.getResources().getDimensionPixelSize(R.dimen.text_size_10);
            int color = this.f80711b.getResources().getColor(R.color.white);
            int iF = ViewUtils.f(this.f80711b, 1.0f);
            spannableStringBuilder.append((CharSequence) "  ").append((CharSequence) sub_title);
            spannableStringBuilder.setSpan(new com.max.hbcustomview.spans.b(new f(sub_title, dimensionPixelSize, color, iE1, iE2, iF, ViewUtils.f(this.f80711b, 2.0f), ViewUtils.f(this.f80711b, 1.0f)), 0), spannableStringBuilder.length() - sub_title.length(), spannableStringBuilder.length(), 33);
            textView.setText(spannableStringBuilder);
        }
        if (com.max.hbcommon.utils.c.u(data.getAct_protocol())) {
            viewI3.setVisibility(8);
        } else {
            viewI3.setVisibility(0);
            viewI3.setOnClickListener(new a(data));
        }
        viewHolder.b().setOnClickListener(new ViewOnClickListenerC0689b(data));
        if (viewI4 != null) {
            if (this.f80711b instanceof SearchNewActivity) {
                Boolean showDivider = data.getShowDivider();
                f0.o(showDivider, "data.showDivider");
                if (showDivider.booleanValue() && this.f80710a.j()) {
                    viewI4.setVisibility(0);
                    return;
                }
            }
            viewI4.setVisibility(8);
        }
    }

    @d
    public final s<?> g() {
        return this.f80712c;
    }

    @d
    public final Context h() {
        return this.f80711b;
    }

    @e
    public final t.a i() {
        return this.f80713d;
    }

    @d
    public final com.max.xiaoheihe.module.bbs.adapter.viewholderbinder.searchhashtag.a j() {
        return this.f80710a;
    }

    public final void k(@d s<?> sVar) {
        if (PatchProxy.proxy(new Object[]{sVar}, this, changeQuickRedirect, false, 27578, new Class[]{s.class}, Void.TYPE).isSupported) {
            return;
        }
        f0.p(sVar, "<set-?>");
        this.f80712c = sVar;
    }

    public final void l(@d Context context) {
        if (PatchProxy.proxy(new Object[]{context}, this, changeQuickRedirect, false, 27577, new Class[]{Context.class}, Void.TYPE).isSupported) {
            return;
        }
        f0.p(context, "<set-?>");
        this.f80711b = context;
    }

    public final void m(@e t.a aVar) {
        this.f80713d = aVar;
    }

    public final void n(@d com.max.xiaoheihe.module.bbs.adapter.viewholderbinder.searchhashtag.a aVar) {
        if (PatchProxy.proxy(new Object[]{aVar}, this, changeQuickRedirect, false, 27576, new Class[]{com.max.xiaoheihe.module.bbs.adapter.viewholderbinder.searchhashtag.a.class}, Void.TYPE).isSupported) {
            return;
        }
        f0.p(aVar, "<set-?>");
        this.f80710a = aVar;
    }
}
