package com.max.xiaoheihe.module.news.viewholderbinder;

import android.text.Layout;
import android.text.SpannableStringBuilder;
import android.text.SpannedString;
import android.view.MotionEvent;
import android.view.View;
import android.widget.TextView;
import com.max.hbutils.utils.ViewUtils;
import com.max.xiaoheihe.R;
import com.max.xiaoheihe.bean.bbs.BBSLinkObj;
import com.max.xiaoheihe.bean.bbs.BBSUserInfoObj;
import com.max.xiaoheihe.bean.news.FeedsContentBaseObj;
import com.max.xiaoheihe.module.bbs.component.BBSLinkListBottomBar;
import com.max.xiaoheihe.module.bbs.component.BBSUserSectionView;
import com.max.xiaoheihe.module.expression.widget.ExpressionTextView;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.PatchProxyResult;

/* JADX INFO: compiled from: NewsHotCommentVHB.kt */
/* JADX INFO: loaded from: classes12.dex */
@androidx.compose.runtime.internal.o(parameters = 0)
public final class u extends h0 {
    public static ChangeQuickRedirect changeQuickRedirect;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public static final int f91505k = 0;

    /* JADX INFO: compiled from: NewsHotCommentVHB.kt */
    public static final class a implements View.OnClickListener {
        public static ChangeQuickRedirect changeQuickRedirect;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ String f91507c;

        a(String str) {
            this.f91507c = str;
        }

        @Override // android.view.View.OnClickListener
        public final void onClick(View view) {
            if (PatchProxy.proxy(new Object[]{view}, this, changeQuickRedirect, false, 42728, new Class[]{View.class}, Void.TYPE).isSupported) {
                return;
            }
            com.max.xiaoheihe.base.router.b.T(u.this.m(), this.f91507c).A();
        }
    }

    /* JADX INFO: compiled from: NewsHotCommentVHB.kt */
    public static final class b implements View.OnClickListener {
        public static ChangeQuickRedirect changeQuickRedirect;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ String f91509c;

        b(String str) {
            this.f91509c = str;
        }

        @Override // android.view.View.OnClickListener
        public final void onClick(View view) {
            if (PatchProxy.proxy(new Object[]{view}, this, changeQuickRedirect, false, 42729, new Class[]{View.class}, Void.TYPE).isSupported) {
                return;
            }
            com.max.xiaoheihe.base.router.b.T(u.this.m(), this.f91509c).A();
        }
    }

    /* JADX INFO: compiled from: NewsHotCommentVHB.kt */
    public static final class c implements View.OnClickListener {
        public static ChangeQuickRedirect changeQuickRedirect;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ BBSLinkObj f91511c;

        c(BBSLinkObj bBSLinkObj) {
            this.f91511c = bBSLinkObj;
        }

        @Override // android.view.View.OnClickListener
        public final void onClick(View view) {
            if (PatchProxy.proxy(new Object[]{view}, this, changeQuickRedirect, false, 42730, new Class[]{View.class}, Void.TYPE).isSupported) {
                return;
            }
            com.max.xiaoheihe.module.bbs.utils.b.E(u.this.m(), this.f91511c);
        }
    }

    /* JADX INFO: compiled from: NewsHotCommentVHB.kt */
    public static final class d implements View.OnTouchListener {
        public static ChangeQuickRedirect changeQuickRedirect;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private long f91512b;

        d() {
        }

        public final long a() {
            return this.f91512b;
        }

        public final void b(long j10) {
            this.f91512b = j10;
        }

        @Override // android.view.View.OnTouchListener
        public boolean onTouch(@dl.d View v10, @dl.d MotionEvent event) {
            PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{v10, event}, this, changeQuickRedirect, false, 42731, new Class[]{View.class, MotionEvent.class}, Boolean.TYPE);
            if (patchProxyResultProxy.isSupported) {
                return ((Boolean) patchProxyResultProxy.result).booleanValue();
            }
            kotlin.jvm.internal.f0.p(v10, "v");
            kotlin.jvm.internal.f0.p(event, "event");
            int action = event.getAction();
            if (action == 0) {
                this.f91512b = System.currentTimeMillis();
            }
            TextView textView = (TextView) v10;
            CharSequence text = textView.getText();
            if (!(text instanceof SpannedString) || action != 1 || System.currentTimeMillis() - this.f91512b > 300) {
                return false;
            }
            int x10 = (int) event.getX();
            int y10 = (int) event.getY();
            int totalPaddingLeft = x10 - textView.getTotalPaddingLeft();
            int totalPaddingTop = y10 - textView.getTotalPaddingTop();
            int scrollX = totalPaddingLeft + textView.getScrollX();
            int scrollY = totalPaddingTop + textView.getScrollY();
            Layout layout = textView.getLayout();
            int offsetForHorizontal = layout.getOffsetForHorizontal(layout.getLineForVertical(scrollY), scrollX);
            com.max.hbcustomview.spans.d[] dVarArr = (com.max.hbcustomview.spans.d[]) ((SpannedString) text).getSpans(offsetForHorizontal, offsetForHorizontal, com.max.hbcustomview.spans.d.class);
            if (dVarArr.length != 0) {
                dVarArr[0].onClick(textView);
                return true;
            }
            return false;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public u(@dl.d g0 param) {
        super(param);
        kotlin.jvm.internal.f0.p(param, "param");
    }

    @Override // com.max.xiaoheihe.module.news.viewholderbinder.h0
    public void i(@dl.d com.max.hbcommon.base.adapter.s.e viewHolder, @dl.d FeedsContentBaseObj data) {
        if (PatchProxy.proxy(new Object[]{viewHolder, data}, this, changeQuickRedirect, false, 42726, new Class[]{com.max.hbcommon.base.adapter.s.e.class, FeedsContentBaseObj.class}, Void.TYPE).isSupported) {
            return;
        }
        kotlin.jvm.internal.f0.p(viewHolder, "viewHolder");
        kotlin.jvm.internal.f0.p(data, "data");
        BBSLinkObj bBSLinkObj = (BBSLinkObj) data;
        BBSUserSectionView bBSUserSectionView = (BBSUserSectionView) viewHolder.i(R.id.vg_title);
        BBSLinkListBottomBar bBSLinkListBottomBar = (BBSLinkListBottomBar) viewHolder.i(R.id.vg_bottom_bar);
        BBSUserSectionView.BBSUserSectionType bBSUserSectionType = BBSUserSectionView.BBSUserSectionType.Link;
        bBSLinkListBottomBar.setType(bBSUserSectionType);
        bBSLinkListBottomBar.getTv_desc().setRichStackData(bBSLinkObj.getBottom_rich_text());
        bBSUserSectionView.setType(bBSUserSectionType);
        bBSLinkListBottomBar.setType(bBSUserSectionType);
        K(bBSUserSectionView.getIv_more(), bBSLinkObj, q());
        View viewI = viewHolder.i(R.id.tv_title);
        kotlin.jvm.internal.f0.n(viewI, "null cannot be cast to non-null type android.widget.TextView");
        G((TextView) viewI, bBSLinkObj, bBSLinkObj.getTitle());
        if (bBSLinkObj.getHot_comment() != null) {
            bBSLinkListBottomBar.getLikeComment().getBll_comment().setNum(bBSLinkObj.getHot_comment().getChild_num());
            bBSLinkListBottomBar.getLikeComment().getBll_like().setNum(bBSLinkObj.getHot_comment().getUp());
            ExpressionTextView expressionTextView = (ExpressionTextView) viewHolder.i(R.id.tv_content);
            SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder("");
            int iE = com.max.xiaoheihe.utils.d.E(R.color.hot_comment_start);
            int iE2 = com.max.xiaoheihe.utils.d.E(R.color.hot_comment_end);
            int dimensionPixelSize = m().getResources().getDimensionPixelSize(R.dimen.text_size_10);
            int color = m().getResources().getColor(R.color.white);
            int iF = ViewUtils.f(m(), 1.0f);
            BBSUserInfoObj user = bBSLinkObj.getHot_comment().getUser();
            if (user != null) {
                String userid = user.getUserid();
                bBSUserSectionView.a(user.getMedal(), user.getMedals(), user.getUserid());
                bBSUserSectionView.setName(user.getUsername());
                bBSUserSectionView.getAvartar().setAvatar(user.getAvartar(), user.getAvatar_decoration());
                bBSUserSectionView.getAvartar().setOnClickListener(new a(userid));
                bBSUserSectionView.getTv_name().setOnClickListener(new b(userid));
            }
            spannableStringBuilder.append((CharSequence) "热评").append((CharSequence) " ");
            spannableStringBuilder.setSpan(new com.max.hbcustomview.spans.b(new com.max.hbcustomview.f("热评", dimensionPixelSize, color, iE, iE2, iF, ViewUtils.f(m(), 4.0f), ViewUtils.f(m(), 2.0f)), 0), 0, 2, 33);
            if (kotlin.jvm.internal.f0.g("1", bBSLinkObj.getHot_comment().getIs_cy())) {
                SpannableStringBuilder spannableStringBuilder2 = new SpannableStringBuilder(lb.b.f131098n);
                spannableStringBuilder2.setSpan(new com.max.hbexpression.widget.a(m(), R.drawable.item_cy_icon, ViewUtils.f(m(), 20.0f), 0, (int) expressionTextView.getPaint().getTextSize()), 0, spannableStringBuilder2.length(), 33);
                spannableStringBuilder.append((CharSequence) spannableStringBuilder2);
            }
            if (bBSLinkObj.getHot_comment().getText() != null) {
                spannableStringBuilder.append((CharSequence) bBSLinkObj.getHot_comment().getText());
            }
            if (spannableStringBuilder.length() > 0) {
                expressionTextView.setVisibility(0);
                expressionTextView.setText(spannableStringBuilder);
                expressionTextView.setOnClickListener(new c(bBSLinkObj));
                expressionTextView.setOnTouchListener(new d());
            } else {
                expressionTextView.setVisibility(8);
            }
        }
        E(viewHolder, data);
    }

    @Override // com.max.xiaoheihe.module.news.viewholderbinder.h0
    public void w(@dl.d com.max.hbcommon.base.adapter.s.e viewHolder, @dl.d BBSLinkObj data) {
        if (PatchProxy.proxy(new Object[]{viewHolder, data}, this, changeQuickRedirect, false, 42727, new Class[]{com.max.hbcommon.base.adapter.s.e.class, BBSLinkObj.class}, Void.TYPE).isSupported) {
            return;
        }
        kotlin.jvm.internal.f0.p(viewHolder, "viewHolder");
        kotlin.jvm.internal.f0.p(data, "data");
    }
}
