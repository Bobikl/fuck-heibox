package com.max.xiaoheihe.module.bbs.adapter;

import android.annotation.SuppressLint;
import android.app.Activity;
import android.app.Dialog;
import android.content.Context;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.text.Layout;
import android.text.Spannable;
import android.text.SpannableString;
import android.text.SpannableStringBuilder;
import android.text.TextUtils;
import android.text.style.AbsoluteSizeSpan;
import android.text.style.ClickableSpan;
import android.text.style.ForegroundColorSpan;
import android.text.style.URLSpan;
import android.text.util.Linkify;
import android.view.LayoutInflater;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.annotation.n0;
import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.RecyclerView;
import com.google.gson.JsonObject;
import com.max.hbcommon.bean.account.AvatarDecorationObj;
import com.max.hbcommon.component.HeyBoxAvatarView;
import com.max.hbcustomview.QMUIRadiusImageView;
import com.max.hbcustomview.RowView;
import com.max.hbexpression.widget.SimpleMarkerViewSpan;
import com.max.hbshare.bean.HBShareData;
import com.max.hbshare.bean.PostOptionObj;
import com.max.hbutils.utils.ViewUtils;
import com.max.xiaoheihe.R;
import com.max.xiaoheihe.bean.bbs.BBSCommentObj;
import com.max.xiaoheihe.bean.bbs.BBSCommentsObj;
import com.max.xiaoheihe.bean.bbs.BBSUserInfoObj;
import com.max.xiaoheihe.bean.bbs.ForwardInfo;
import com.max.xiaoheihe.bean.bbs.LinkInfoObj;
import com.max.xiaoheihe.bean.bbs.PostImageObj;
import com.max.xiaoheihe.bean.bbs.webwithnative.WebWithNativeRecommendInfoObj;
import com.max.xiaoheihe.bean.bbs.webwithnative.WebWithNativeRecommendItemObj;
import com.max.xiaoheihe.module.account.SendToFriendActivity;
import com.max.xiaoheihe.module.account.ShareImageDialogFragment;
import com.max.xiaoheihe.module.bbs.ForwardEditActiviy;
import com.max.xiaoheihe.module.bbs.component.BBSUserSectionView;
import com.max.xiaoheihe.module.bbs.component.likecomment.BBSLinkListLikeComment;
import com.max.xiaoheihe.module.bbs.component.likecomment.BBSLinkListLikeCommentBase;
import com.max.xiaoheihe.module.bbs.post.PostPageFactory;
import com.max.xiaoheihe.module.expression.widget.ExpressionTextView;
import com.max.xiaoheihe.utils.ShareViewUtil;
import com.max.xiaoheihe.utils.imageviewer.ImageViewerHelper;
import com.max.xiaoheihe.view.SubCommentView;
import com.max.xiaoheihe.view.UpdatePointViewGroup;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.PatchProxyResult;
import com.starlightc.ucropplus.util.DeviceServiceUtil;
import com.umeng.socialize.UMShareListener;
import com.umeng.socialize.bean.SHARE_MEDIA;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

/* JADX INFO: compiled from: CommentsAdapter.java */
/* JADX INFO: loaded from: classes10.dex */
public class c extends com.max.hbcommon.base.adapter.s<BBSCommentsObj> {
    public static ChangeQuickRedirect changeQuickRedirect = null;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private static final String f80314j = "1";

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private static final String f80315k = "0";

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private static final String f80316l = "2";

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final boolean f80317b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final boolean f80318c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private Context f80319d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private k0 f80320e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private int f80321f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private long f80322g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private boolean f80323h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private WebWithNativeRecommendInfoObj f80324i;

    /* JADX INFO: compiled from: CommentsAdapter.java */
    public class a implements View.OnClickListener {
        public static ChangeQuickRedirect changeQuickRedirect;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ BBSCommentObj f80325b;

        a(BBSCommentObj bBSCommentObj) {
            this.f80325b = bBSCommentObj;
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            if (PatchProxy.proxy(new Object[]{view}, this, changeQuickRedirect, false, 27208, new Class[]{View.class}, Void.TYPE).isSupported) {
                return;
            }
            k0 k0Var = c.this.f80320e;
            BBSCommentObj bBSCommentObj = this.f80325b;
            k0Var.m(bBSCommentObj, bBSCommentObj);
        }
    }

    /* JADX INFO: compiled from: CommentsAdapter.java */
    public class a0 implements ShareImageDialogFragment.e {
        public static ChangeQuickRedirect changeQuickRedirect;

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ BBSCommentObj f80327a;

        a0(BBSCommentObj bBSCommentObj) {
            this.f80327a = bBSCommentObj;
        }

        @Override // com.max.xiaoheihe.module.account.ShareImageDialogFragment.e
        public View a(ViewGroup viewGroup) {
            PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{viewGroup}, this, changeQuickRedirect, false, 27240, new Class[]{ViewGroup.class}, View.class);
            if (patchProxyResultProxy.isSupported) {
                return (View) patchProxyResultProxy.result;
            }
            LinkInfoObj linkInfoObjM1 = c.this.f80320e.M1();
            return ShareViewUtil.e(c.this.f80319d, viewGroup, this.f80327a, linkInfoObjM1 != null ? linkInfoObjM1.getTitle() : null);
        }
    }

    /* JADX INFO: compiled from: CommentsAdapter.java */
    public class b implements View.OnClickListener {
        public static ChangeQuickRedirect changeQuickRedirect;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ BBSCommentObj f80329b;

        b(BBSCommentObj bBSCommentObj) {
            this.f80329b = bBSCommentObj;
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            if (PatchProxy.proxy(new Object[]{view}, this, changeQuickRedirect, false, 27209, new Class[]{View.class}, Void.TYPE).isSupported) {
                return;
            }
            k0 k0Var = c.this.f80320e;
            BBSCommentObj bBSCommentObj = this.f80329b;
            k0Var.m(bBSCommentObj, bBSCommentObj);
        }
    }

    /* JADX INFO: compiled from: CommentsAdapter.java */
    public class b0 implements UMShareListener {
        public static ChangeQuickRedirect changeQuickRedirect;

        b0() {
        }

        @Override // com.umeng.socialize.UMShareListener
        public void onCancel(SHARE_MEDIA share_media) {
        }

        @Override // com.umeng.socialize.UMShareListener
        public void onError(SHARE_MEDIA share_media, Throwable th2) {
        }

        @Override // com.umeng.socialize.UMShareListener
        public void onResult(SHARE_MEDIA share_media) {
            if (PatchProxy.proxy(new Object[]{share_media}, this, changeQuickRedirect, false, 27241, new Class[]{SHARE_MEDIA.class}, Void.TYPE).isSupported) {
                return;
            }
            com.max.hbshare.d.F(c.o(c.this), null, com.max.hbshare.d.f72598t, null, null);
        }

        @Override // com.umeng.socialize.UMShareListener
        public void onStart(SHARE_MEDIA share_media) {
        }
    }

    /* JADX INFO: renamed from: com.max.xiaoheihe.module.bbs.adapter.c$c, reason: collision with other inner class name */
    /* JADX INFO: compiled from: CommentsAdapter.java */
    public class ViewOnLongClickListenerC0678c implements View.OnLongClickListener {
        public static ChangeQuickRedirect changeQuickRedirect;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ LinkInfoObj f80332b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ BBSCommentObj f80333c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        final /* synthetic */ BBSUserInfoObj f80334d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        final /* synthetic */ boolean f80335e;

        ViewOnLongClickListenerC0678c(LinkInfoObj linkInfoObj, BBSCommentObj bBSCommentObj, BBSUserInfoObj bBSUserInfoObj, boolean z10) {
            this.f80332b = linkInfoObj;
            this.f80333c = bBSCommentObj;
            this.f80334d = bBSUserInfoObj;
            this.f80335e = z10;
        }

        @Override // android.view.View.OnLongClickListener
        public boolean onLongClick(View view) {
            PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{view}, this, changeQuickRedirect, false, 27210, new Class[]{View.class}, Boolean.TYPE);
            if (patchProxyResultProxy.isSupported) {
                return ((Boolean) patchProxyResultProxy.result).booleanValue();
            }
            c.v(c.this, this.f80332b, this.f80333c, this.f80334d, this.f80335e);
            return true;
        }
    }

    /* JADX INFO: compiled from: CommentsAdapter.java */
    public class c0 implements RowView.c<BBSCommentObj> {
        public static ChangeQuickRedirect changeQuickRedirect;

        /* JADX INFO: compiled from: CommentsAdapter.java */
        public class a extends com.max.hbcustomview.spans.d {
            public static ChangeQuickRedirect changeQuickRedirect;

            /* JADX INFO: renamed from: d, reason: collision with root package name */
            final /* synthetic */ String f80338d;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            a(int i10, String str) {
                super(i10);
                this.f80338d = str;
            }

            @Override // android.text.style.ClickableSpan
            public void onClick(View view) {
                if (PatchProxy.proxy(new Object[]{view}, this, changeQuickRedirect, false, 27252, new Class[]{View.class}, Void.TYPE).isSupported) {
                    return;
                }
                com.max.xiaoheihe.base.router.b.T(c.this.f80319d, this.f80338d).A();
            }
        }

        /* JADX INFO: compiled from: CommentsAdapter.java */
        public class b implements View.OnTouchListener {
            public static ChangeQuickRedirect changeQuickRedirect;

            b() {
            }

            @Override // android.view.View.OnTouchListener
            public boolean onTouch(View view, MotionEvent motionEvent) {
                PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{view, motionEvent}, this, changeQuickRedirect, false, 27253, new Class[]{View.class, MotionEvent.class}, Boolean.TYPE);
                if (patchProxyResultProxy.isSupported) {
                    return ((Boolean) patchProxyResultProxy.result).booleanValue();
                }
                com.max.hbcommon.utils.d.b("clicktestzzzz", "onTouch");
                TextView textView = (TextView) view;
                Spannable spannableNewSpannable = Spannable.Factory.getInstance().newSpannable(textView.getText());
                int action = motionEvent.getAction();
                if (action != 1 && action != 0) {
                    return false;
                }
                int x10 = (int) motionEvent.getX();
                int y10 = (int) motionEvent.getY();
                int totalPaddingLeft = x10 - textView.getTotalPaddingLeft();
                int totalPaddingTop = y10 - textView.getTotalPaddingTop();
                int scrollX = totalPaddingLeft + textView.getScrollX();
                int scrollY = totalPaddingTop + textView.getScrollY();
                Layout layout = textView.getLayout();
                int offsetForHorizontal = layout.getOffsetForHorizontal(layout.getLineForVertical(scrollY), scrollX);
                ClickableSpan[] clickableSpanArr = (ClickableSpan[]) spannableNewSpannable.getSpans(offsetForHorizontal, offsetForHorizontal, ClickableSpan.class);
                if (clickableSpanArr.length == 0) {
                    return false;
                }
                if (action == 1) {
                    com.max.hbcommon.utils.d.b("clicktestzzzz", " link[0].onClick(widget);");
                    clickableSpanArr[0].onClick(textView);
                }
                return true;
            }
        }

        /* JADX INFO: renamed from: com.max.xiaoheihe.module.bbs.adapter.c$c0$c, reason: collision with other inner class name */
        /* JADX INFO: compiled from: CommentsAdapter.java */
        public class ViewOnTouchListenerC0679c implements View.OnTouchListener {
            public static ChangeQuickRedirect changeQuickRedirect;

            ViewOnTouchListenerC0679c() {
            }

            @Override // android.view.View.OnTouchListener
            public boolean onTouch(View view, MotionEvent motionEvent) {
                PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{view, motionEvent}, this, changeQuickRedirect, false, 27254, new Class[]{View.class, MotionEvent.class}, Boolean.TYPE);
                if (patchProxyResultProxy.isSupported) {
                    return ((Boolean) patchProxyResultProxy.result).booleanValue();
                }
                com.max.hbcommon.utils.d.b("clicktestzzzz", "onTouch");
                TextView textView = (TextView) view;
                Spannable spannableNewSpannable = Spannable.Factory.getInstance().newSpannable(textView.getText());
                int action = motionEvent.getAction();
                if (action != 1 && action != 0) {
                    return false;
                }
                int x10 = (int) motionEvent.getX();
                int y10 = (int) motionEvent.getY();
                int totalPaddingLeft = x10 - textView.getTotalPaddingLeft();
                int totalPaddingTop = y10 - textView.getTotalPaddingTop();
                int scrollX = totalPaddingLeft + textView.getScrollX();
                int scrollY = totalPaddingTop + textView.getScrollY();
                Layout layout = textView.getLayout();
                int offsetForHorizontal = layout.getOffsetForHorizontal(layout.getLineForVertical(scrollY), scrollX);
                ClickableSpan[] clickableSpanArr = (ClickableSpan[]) spannableNewSpannable.getSpans(offsetForHorizontal, offsetForHorizontal, ClickableSpan.class);
                if (clickableSpanArr.length == 0) {
                    return false;
                }
                if (action == 1) {
                    com.max.hbcommon.utils.d.b("clicktestzzzz", " link[0].onClick(widget);");
                    clickableSpanArr[0].onClick(textView);
                }
                return true;
            }
        }

        c0() {
        }

        /* JADX INFO: Access modifiers changed from: private */
        public /* synthetic */ void g(BBSUserInfoObj bBSUserInfoObj, View view) {
            if (PatchProxy.proxy(new Object[]{bBSUserInfoObj, view}, this, changeQuickRedirect, false, 27251, new Class[]{BBSUserInfoObj.class, View.class}, Void.TYPE).isSupported) {
                return;
            }
            com.max.xiaoheihe.base.router.b.T(c.this.f80319d, bBSUserInfoObj.getUserid()).A();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public /* synthetic */ void h(BBSUserInfoObj bBSUserInfoObj, View view) {
            if (PatchProxy.proxy(new Object[]{bBSUserInfoObj, view}, this, changeQuickRedirect, false, 27250, new Class[]{BBSUserInfoObj.class, View.class}, Void.TYPE).isSupported) {
                return;
            }
            com.max.xiaoheihe.base.router.b.T(c.this.f80319d, bBSUserInfoObj.getUserid()).A();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public /* synthetic */ void i(BBSCommentObj bBSCommentObj, BBSLinkListLikeComment bBSLinkListLikeComment, BBSCommentObj bBSCommentObj2, View view) {
            int i10;
            if (!PatchProxy.proxy(new Object[]{bBSCommentObj, bBSLinkListLikeComment, bBSCommentObj2, view}, this, changeQuickRedirect, false, 27249, new Class[]{BBSCommentObj.class, BBSLinkListLikeComment.class, BBSCommentObj.class, View.class}, Void.TYPE).isSupported && com.max.xiaoheihe.utils.i0.e(c.this.f80319d)) {
                int iQ = com.max.hbutils.utils.n.q(bBSCommentObj.getUp());
                if ("1".equals(bBSCommentObj.getIs_support())) {
                    c.this.f80320e.X0(bBSCommentObj.getCommentid(), "2");
                    bBSCommentObj.setIs_support("2");
                    bBSLinkListLikeComment.f80991b.setChecked(false);
                    i10 = iQ - 1;
                    c.r(c.this, i10, "2", bBSCommentObj, bBSCommentObj2);
                } else if ("0".equals(bBSCommentObj.getIs_support())) {
                    c.this.f80320e.X0(bBSCommentObj.getCommentid(), "1");
                    bBSCommentObj.setIs_support("1");
                    bBSLinkListLikeComment.f80991b.setChecked(true, true);
                    i10 = iQ + 1;
                    c.r(c.this, i10, "1", bBSCommentObj, bBSCommentObj2);
                } else {
                    c.this.f80320e.X0(bBSCommentObj.getCommentid(), "1");
                    bBSCommentObj.setIs_support("1");
                    bBSLinkListLikeComment.f80991b.setChecked(true, true);
                    i10 = iQ + 1;
                    c.r(c.this, i10, "1", bBSCommentObj, bBSCommentObj2);
                }
                bBSCommentObj.setUp(String.valueOf(i10));
                bBSLinkListLikeComment.f80991b.setNum(i10);
                if (c.this.f80317b) {
                    c.t(c.this, bBSLinkListLikeComment.f80991b, bBSCommentObj.getUp());
                }
            }
        }

        private void j(com.max.hbcustomview.h hVar, BBSCommentObj bBSCommentObj) {
            if (PatchProxy.proxy(new Object[]{hVar, bBSCommentObj}, this, changeQuickRedirect, false, 27243, new Class[]{com.max.hbcustomview.h.class, BBSCommentObj.class}, Void.TYPE).isSupported) {
                return;
            }
            ExpressionTextView expressionTextView = (ExpressionTextView) hVar.m(R.id.tv_sub_comment_content);
            int iE = com.max.xiaoheihe.utils.d.E(R.color.click_blue);
            int iE2 = com.max.xiaoheihe.utils.d.E(R.color.text_secondary_1_color);
            if (c.this.f80323h) {
                expressionTextView.setTextColor(com.max.xiaoheihe.utils.d.F(c.this.f80319d, R.color.white));
                iE = com.max.xiaoheihe.utils.d.F(c.this.f80319d, R.color.white);
                iE2 = com.max.xiaoheihe.utils.d.F(c.this.f80319d, R.color.white_alpha60);
            }
            String userid = bBSCommentObj.getUser().getUserid();
            String string = c.this.f80319d.getString(R.string.post_owner);
            SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
            String strL1 = com.max.xiaoheihe.utils.d.L1(bBSCommentObj.getUser().getUsername());
            if (strL1 == null) {
                strL1 = "";
            }
            spannableStringBuilder.append(strL1.replaceAll("]", "\u200e]"));
            spannableStringBuilder.setSpan(new a(iE, userid), 0, spannableStringBuilder.length(), 33);
            if ("1".equals(bBSCommentObj.getIs_link_owner())) {
                spannableStringBuilder.append(" ").append((CharSequence) string);
                com.max.hbcustomview.spans.b bVar = new com.max.hbcustomview.spans.b(c.this.f80319d, R.drawable.ic_author_gradient);
                bVar.a(new Rect(0, 0, ViewUtils.f(c.this.f80319d, 24.0f), ViewUtils.f(c.this.f80319d, 13.0f)));
                spannableStringBuilder.setSpan(bVar, spannableStringBuilder.length() - string.length(), spannableStringBuilder.length(), 33);
            }
            String str = c.this.f80319d.getResources().getString(R.string.reply) + com.max.xiaoheihe.utils.d.L1(bBSCommentObj.getReplyuser().getUsername()).replaceAll("]", "\u200e]");
            spannableStringBuilder.append(" ").append((CharSequence) str);
            spannableStringBuilder.setSpan(new ForegroundColorSpan(iE2), spannableStringBuilder.length() - str.length(), spannableStringBuilder.length(), 33);
            spannableStringBuilder.append(": ");
            String text = bBSCommentObj.getText() != null ? bBSCommentObj.getText() : "";
            int length = text.length();
            Spannable spannableString = new SpannableString(text);
            Linkify.addLinks(spannableString, 1);
            for (URLSpan uRLSpan : (URLSpan[]) spannableString.getSpans(0, length, URLSpan.class)) {
                int spanStart = spannableString.getSpanStart(uRLSpan);
                int spanEnd = spannableString.getSpanEnd(uRLSpan);
                spannableString.removeSpan(uRLSpan);
                spannableString.setSpan(new com.max.xiaoheihe.view.o(c.this.f80319d, uRLSpan.getURL()), spanStart, spanEnd, 33);
            }
            if ("1".equals(bBSCommentObj.getIs_cy())) {
                SpannableStringBuilder spannableStringBuilder2 = new SpannableStringBuilder(lb.b.f131098n);
                spannableStringBuilder2.setSpan(new com.max.hbexpression.widget.a(c.this.f80319d, R.drawable.item_cy_icon, ViewUtils.f(c.this.f80319d, 20.0f), 0, (int) expressionTextView.getPaint().getTextSize(), 1), 0, spannableStringBuilder2.length(), 33);
                spannableString = new SpannableStringBuilder(spannableString).insert(0, (CharSequence) spannableStringBuilder2);
            }
            spannableStringBuilder.append((CharSequence) spannableString);
            StringBuilder sb2 = new StringBuilder(c.q(c.this, bBSCommentObj.getCreate_at()));
            if (!com.max.hbcommon.utils.c.u(bBSCommentObj.getIp_location())) {
                sb2.append("·");
                sb2.append(bBSCommentObj.getIp_location());
            }
            spannableStringBuilder.append(" ").append((CharSequence) sb2);
            spannableStringBuilder.setSpan(new ForegroundColorSpan(iE2), spannableStringBuilder.length() - sb2.length(), spannableStringBuilder.length(), 33);
            spannableStringBuilder.setSpan(new AbsoluteSizeSpan(c.this.f80319d.getResources().getDimensionPixelSize(R.dimen.text_size_10)), spannableStringBuilder.length() - sb2.length(), spannableStringBuilder.length(), 33);
            expressionTextView.setText(spannableStringBuilder);
            expressionTextView.setOnTouchListener(new b());
        }

        private void k(@n0 com.max.hbcustomview.h hVar, @n0 BBSCommentObj bBSCommentObj) {
            if (PatchProxy.proxy(new Object[]{hVar, bBSCommentObj}, this, changeQuickRedirect, false, 27244, new Class[]{com.max.hbcustomview.h.class, BBSCommentObj.class}, Void.TYPE).isSupported) {
                return;
            }
            m(hVar, bBSCommentObj);
            l(hVar, bBSCommentObj);
        }

        @SuppressLint({"ClickableViewAccessibility"})
        private void l(@n0 com.max.hbcustomview.h hVar, BBSCommentObj bBSCommentObj) {
            if (PatchProxy.proxy(new Object[]{hVar, bBSCommentObj}, this, changeQuickRedirect, false, 27246, new Class[]{com.max.hbcustomview.h.class, BBSCommentObj.class}, Void.TYPE).isSupported) {
                return;
            }
            ExpressionTextView expressionTextView = (ExpressionTextView) hVar.m(R.id.tv_sub_comment_content);
            if (c.this.f80323h) {
                expressionTextView.setTextColor(com.max.xiaoheihe.utils.d.F(c.this.f80319d, R.color.white));
            }
            SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
            String text = bBSCommentObj.getText() != null ? bBSCommentObj.getText() : "";
            int length = text.length();
            Spannable spannableString = new SpannableString(text);
            Linkify.addLinks(spannableString, 1);
            for (URLSpan uRLSpan : (URLSpan[]) spannableString.getSpans(0, length, URLSpan.class)) {
                int spanStart = spannableString.getSpanStart(uRLSpan);
                int spanEnd = spannableString.getSpanEnd(uRLSpan);
                spannableString.removeSpan(uRLSpan);
                spannableString.setSpan(new com.max.xiaoheihe.view.o(c.this.f80319d, uRLSpan.getURL()), spanStart, spanEnd, 33);
            }
            if ("1".equals(bBSCommentObj.getIs_cy())) {
                SpannableStringBuilder spannableStringBuilder2 = new SpannableStringBuilder(lb.b.f131098n);
                spannableStringBuilder2.setSpan(new com.max.hbexpression.widget.a(c.this.f80319d, R.drawable.item_cy_icon, ViewUtils.f(c.this.f80319d, 20.0f), 0, (int) expressionTextView.getPaint().getTextSize(), 1), 0, spannableStringBuilder2.length(), 33);
                spannableString = new SpannableStringBuilder(spannableString).insert(0, (CharSequence) spannableStringBuilder2);
            }
            spannableStringBuilder.append((CharSequence) spannableString);
            StringBuilder sb2 = new StringBuilder(c.q(c.this, bBSCommentObj.getCreate_at()));
            if (!com.max.hbcommon.utils.c.u(bBSCommentObj.getIp_location())) {
                sb2.append("·");
                sb2.append(bBSCommentObj.getIp_location());
            }
            spannableStringBuilder.append(" ").append((CharSequence) sb2);
            spannableStringBuilder.setSpan(com.max.xiaoheihe.accelworld.e.c(c.this.f80319d, sb2.toString(), c.this.f80323h ? R.color.white_alpha60 : R.color.text_secondary_1_color), spannableStringBuilder.length() - sb2.length(), spannableStringBuilder.length(), 33);
            spannableStringBuilder.append("\ufeff");
            expressionTextView.setLineSpacing(0.0f, 1.0f);
            expressionTextView.setTextSize(1, 13.0f);
            expressionTextView.setCustomLineHeight(ViewUtils.f(c.this.f80319d, 19.0f));
            expressionTextView.setText(spannableStringBuilder);
            expressionTextView.setOnTouchListener(new ViewOnTouchListenerC0679c());
        }

        private void m(@n0 com.max.hbcustomview.h hVar, @n0 final BBSCommentObj bBSCommentObj) {
            String str;
            if (PatchProxy.proxy(new Object[]{hVar, bBSCommentObj}, this, changeQuickRedirect, false, 27245, new Class[]{com.max.hbcustomview.h.class, BBSCommentObj.class}, Void.TYPE).isSupported) {
                return;
            }
            HeyBoxAvatarView heyBoxAvatarView = (HeyBoxAvatarView) hVar.m(R.id.sub_comment_avatar);
            final BBSLinkListLikeComment bBSLinkListLikeComment = (BBSLinkListLikeComment) hVar.m(R.id.bbs_link_list_like_comment);
            TextView textView = (TextView) hVar.m(R.id.tv_name);
            TextView textView2 = (TextView) hVar.m(R.id.tv_reply_to);
            final BBSUserInfoObj user = bBSCommentObj.getUser();
            if (user == null) {
                com.max.heybox.hblog.g.G("[initSubComments][refreshSubCommentTitle] commentUser should not be null");
                return;
            }
            Object objL = hVar.l();
            if (!(objL instanceof BBSCommentObj)) {
                com.max.heybox.hblog.g.G("[initSubComments][refreshSubCommentTitle] invalid rootComment: " + objL);
                return;
            }
            final BBSCommentObj bBSCommentObj2 = (BBSCommentObj) objL;
            boolean zEquals = Objects.equals(bBSCommentObj.getReplyid(), bBSCommentObj2.getCommentid());
            heyBoxAvatarView.setAvatar(user.getAvatar(), (AvatarDecorationObj) null);
            heyBoxAvatarView.setOnClickListener(new View.OnClickListener() { // from class: com.max.xiaoheihe.module.bbs.adapter.d
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    this.f80418b.g(user, view);
                }
            });
            SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(com.max.xiaoheihe.utils.d.M1(user.getUsername()));
            if ("1".equals(bBSCommentObj.getIs_link_owner())) {
                String string = c.this.f80319d.getString(R.string.post_owner);
                spannableStringBuilder.append((CharSequence) " ").append((CharSequence) string);
                com.max.hbcustomview.spans.b bVar = new com.max.hbcustomview.spans.b(c.this.f80319d, R.drawable.ic_author_gradient);
                bVar.a(new Rect(0, 0, ViewUtils.f(c.this.f80319d, 24.0f), ViewUtils.f(c.this.f80319d, 13.0f)));
                spannableStringBuilder.setSpan(bVar, spannableStringBuilder.length() - string.length(), spannableStringBuilder.length(), 33);
            }
            textView.setText(spannableStringBuilder);
            textView.setOnClickListener(new View.OnClickListener() { // from class: com.max.xiaoheihe.module.bbs.adapter.e
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    this.f80420b.h(user, view);
                }
            });
            if (c.this.f80323h) {
                textView.setTextColor(com.max.xiaoheihe.utils.d.F(c.this.f80319d, R.color.white));
            }
            if (zEquals || bBSCommentObj.getReplyuser() == null) {
                str = "";
            } else {
                str = c.this.f80319d.getResources().getString(R.string.reply) + com.max.xiaoheihe.utils.d.M1(bBSCommentObj.getReplyuser().getUsername());
            }
            textView2.setText(str);
            if (c.this.f80323h) {
                textView2.setTextColor(com.max.xiaoheihe.utils.d.F(c.this.f80319d, R.color.white_alpha60));
            }
            bBSLinkListLikeComment.setType(BBSLinkListLikeComment.Type.LikeOnly);
            com.max.xiaoheihe.accelworld.s.a(bBSLinkListLikeComment, 16.0f);
            bBSLinkListLikeComment.f80991b.setIconSize(ViewUtils.f(c.this.f80319d, 14.0f));
            if (c.this.f80323h) {
                bBSLinkListLikeComment.setDarkStyle();
            }
            if (!"0".equals(bBSCommentObj.getIs_support()) && "1".equals(bBSCommentObj.getIs_support())) {
                bBSLinkListLikeComment.f80991b.setChecked(true);
            } else {
                bBSLinkListLikeComment.f80991b.setChecked(false);
            }
            bBSLinkListLikeComment.f80991b.setNum(com.max.hbutils.utils.n.q(bBSCommentObj.getUp()));
            if (c.this.f80317b) {
                c.t(c.this, bBSLinkListLikeComment.f80991b, bBSCommentObj.getUp());
            }
            bBSLinkListLikeComment.f80991b.setOnClickListener(new View.OnClickListener() { // from class: com.max.xiaoheihe.module.bbs.adapter.f
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    this.f80422b.i(bBSCommentObj, bBSLinkListLikeComment, bBSCommentObj2, view);
                }
            });
        }

        @Override // com.max.hbcustomview.RowView.c
        public /* bridge */ /* synthetic */ void a(com.max.hbcustomview.h hVar, BBSCommentObj bBSCommentObj) {
            if (PatchProxy.proxy(new Object[]{hVar, bBSCommentObj}, this, changeQuickRedirect, false, 27248, new Class[]{com.max.hbcustomview.h.class, Object.class}, Void.TYPE).isSupported) {
                return;
            }
            n(hVar, bBSCommentObj);
        }

        @Override // com.max.hbcustomview.RowView.c
        public /* bridge */ /* synthetic */ void b(com.max.hbcustomview.h hVar, BBSCommentObj bBSCommentObj) {
            if (PatchProxy.proxy(new Object[]{hVar, bBSCommentObj}, this, changeQuickRedirect, false, 27247, new Class[]{com.max.hbcustomview.h.class, Object.class}, Void.TYPE).isSupported) {
                return;
            }
            f(hVar, bBSCommentObj);
        }

        public void f(com.max.hbcustomview.h hVar, BBSCommentObj bBSCommentObj) {
        }

        public void n(com.max.hbcustomview.h hVar, BBSCommentObj bBSCommentObj) {
            if (PatchProxy.proxy(new Object[]{hVar, bBSCommentObj}, this, changeQuickRedirect, false, 27242, new Class[]{com.max.hbcustomview.h.class, BBSCommentObj.class}, Void.TYPE).isSupported) {
                return;
            }
            if (bBSCommentObj != null && hVar != null) {
                if (c.this.f80317b) {
                    k(hVar, bBSCommentObj);
                    return;
                } else {
                    j(hVar, bBSCommentObj);
                    return;
                }
            }
            com.max.heybox.hblog.g.G("[initSubComments][setView] invalid param, data: " + bBSCommentObj + ", holder: " + hVar);
        }
    }

    /* JADX INFO: compiled from: CommentsAdapter.java */
    public class d implements PostOptionObj.OnClickListener {
        public static ChangeQuickRedirect changeQuickRedirect;

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ String f80342a;

        /* JADX INFO: compiled from: CommentsAdapter.java */
        public class a implements com.max.xiaoheihe.view.m {
            public static ChangeQuickRedirect changeQuickRedirect;

            a() {
            }

            @Override // com.max.xiaoheihe.view.m
            public void a(Dialog dialog) {
                if (PatchProxy.proxy(new Object[]{dialog}, this, changeQuickRedirect, false, 27213, new Class[]{Dialog.class}, Void.TYPE).isSupported) {
                    return;
                }
                c.this.f80320e.y0(d.this.f80342a, false);
                dialog.dismiss();
            }

            @Override // com.max.xiaoheihe.view.m
            public void b(Dialog dialog) {
                if (PatchProxy.proxy(new Object[]{dialog}, this, changeQuickRedirect, false, 27212, new Class[]{Dialog.class}, Void.TYPE).isSupported) {
                    return;
                }
                dialog.dismiss();
            }
        }

        d(String str) {
            this.f80342a = str;
        }

        @Override // com.max.hbshare.bean.PostOptionObj.OnClickListener
        public void onClick(Dialog dialog, View view, ImageView imageView, TextView textView) {
            if (!PatchProxy.proxy(new Object[]{dialog, view, imageView, textView}, this, changeQuickRedirect, false, 27211, new Class[]{Dialog.class, View.class, ImageView.class, TextView.class}, Void.TYPE).isSupported && com.max.xiaoheihe.utils.i0.e(c.this.f80319d)) {
                com.max.xiaoheihe.view.l.D(c.this.f80319d, "", c.this.f80319d.getString(R.string.confirm_delete_reply), c.this.f80319d.getString(R.string.confirm), c.this.f80319d.getString(R.string.cancel), new a());
            }
        }
    }

    /* JADX INFO: compiled from: CommentsAdapter.java */
    public class d0 implements View.OnClickListener {
        public static ChangeQuickRedirect changeQuickRedirect;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ BBSCommentObj f80345b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ BBSUserSectionView f80346c;

        d0(BBSCommentObj bBSCommentObj, BBSUserSectionView bBSUserSectionView) {
            this.f80345b = bBSCommentObj;
            this.f80346c = bBSUserSectionView;
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            if (!PatchProxy.proxy(new Object[]{view}, this, changeQuickRedirect, false, 27235, new Class[]{View.class}, Void.TYPE).isSupported && com.max.xiaoheihe.utils.i0.e(c.this.f80319d)) {
                int iQ = com.max.hbutils.utils.n.q(this.f80345b.getUp());
                if ("0".equals(this.f80345b.getIs_support())) {
                    c.this.f80320e.X0(this.f80345b.getCommentid(), "2");
                    this.f80345b.setIs_support("2");
                    this.f80346c.f80853i.f80991b.setChecked(false);
                    this.f80346c.f80853i.f80992c.setChecked(false);
                    c.this.Q(iQ, "2", this.f80345b);
                } else if ("1".equals(this.f80345b.getIs_support())) {
                    c.this.f80320e.X0(this.f80345b.getCommentid(), "0");
                    this.f80345b.setIs_support("0");
                    this.f80346c.f80853i.f80991b.setChecked(false);
                    this.f80346c.f80853i.f80992c.setChecked(true);
                    iQ--;
                    c.this.Q(iQ, "0", this.f80345b);
                } else {
                    c.this.f80320e.X0(this.f80345b.getCommentid(), "0");
                    this.f80345b.setIs_support("0");
                    this.f80346c.f80853i.f80991b.setChecked(false);
                    this.f80346c.f80853i.f80992c.setChecked(true);
                    c.this.Q(iQ, "0", this.f80345b);
                }
                this.f80345b.setUp(String.valueOf(iQ));
                this.f80346c.f80853i.f80991b.setNum(iQ);
                if (c.this.f80317b) {
                    c.t(c.this, this.f80346c.f80853i.f80991b, this.f80345b.getUp());
                }
            }
        }
    }

    /* JADX INFO: compiled from: CommentsAdapter.java */
    public class e implements PostOptionObj.OnClickListener {
        public static ChangeQuickRedirect changeQuickRedirect;

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ BBSCommentObj f80348a;

        e(BBSCommentObj bBSCommentObj) {
            this.f80348a = bBSCommentObj;
        }

        @Override // com.max.hbshare.bean.PostOptionObj.OnClickListener
        public void onClick(Dialog dialog, View view, ImageView imageView, TextView textView) {
            if (PatchProxy.proxy(new Object[]{dialog, view, imageView, textView}, this, changeQuickRedirect, false, 27214, new Class[]{Dialog.class, View.class, ImageView.class, TextView.class}, Void.TYPE).isSupported) {
                return;
            }
            com.max.xiaoheihe.utils.d.o(c.this.f80319d, com.max.xiaoheihe.module.expression.core.a.f(c.this.f80319d, new SpannableStringBuilder(this.f80348a.getText().trim()), ViewUtils.f(c.this.f80319d, 13.0f), true));
            com.max.hbutils.utils.c cVar = com.max.hbutils.utils.c.f73533a;
            com.max.hbutils.utils.c.f(c.this.f80319d.getString(R.string.text_copied));
        }
    }

    /* JADX INFO: compiled from: CommentsAdapter.java */
    public class e0 implements View.OnClickListener {
        public static ChangeQuickRedirect changeQuickRedirect;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ QMUIRadiusImageView f80350b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ int f80351c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        final /* synthetic */ String f80352d;

        e0(QMUIRadiusImageView qMUIRadiusImageView, int i10, String str) {
            this.f80350b = qMUIRadiusImageView;
            this.f80351c = i10;
            this.f80352d = str;
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            if (PatchProxy.proxy(new Object[]{view}, this, changeQuickRedirect, false, 27255, new Class[]{View.class}, Void.TYPE).isSupported) {
                return;
            }
            ImageViewerHelper.a(c.this.f80319d).m(ImageViewerHelper.d(this.f80350b, this.f80351c), this.f80352d.split(";")).d(this.f80351c).p();
        }
    }

    /* JADX INFO: compiled from: CommentsAdapter.java */
    public class f implements PostOptionObj.OnClickListener {
        public static ChangeQuickRedirect changeQuickRedirect;

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ String f80354a;

        f(String str) {
            this.f80354a = str;
        }

        @Override // com.max.hbshare.bean.PostOptionObj.OnClickListener
        public void onClick(Dialog dialog, View view, ImageView imageView, TextView textView) {
            if (!PatchProxy.proxy(new Object[]{dialog, view, imageView, textView}, this, changeQuickRedirect, false, 27215, new Class[]{Dialog.class, View.class, ImageView.class, TextView.class}, Void.TYPE).isSupported && com.max.xiaoheihe.utils.i0.e(c.this.f80319d)) {
                c.this.f80320e.R1(this.f80354a);
            }
        }
    }

    /* JADX INFO: compiled from: CommentsAdapter.java */
    public class f0 implements RowView.d<BBSCommentObj> {
        public static ChangeQuickRedirect changeQuickRedirect;

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ BBSCommentObj f80356a;

        f0(BBSCommentObj bBSCommentObj) {
            this.f80356a = bBSCommentObj;
        }

        @Override // com.max.hbcustomview.RowView.d
        public /* bridge */ /* synthetic */ void a(com.max.hbcustomview.h hVar, View view, BBSCommentObj bBSCommentObj) {
            if (PatchProxy.proxy(new Object[]{hVar, view, bBSCommentObj}, this, changeQuickRedirect, false, 27257, new Class[]{com.max.hbcustomview.h.class, View.class, Object.class}, Void.TYPE).isSupported) {
                return;
            }
            b(hVar, view, bBSCommentObj);
        }

        public void b(com.max.hbcustomview.h hVar, View view, BBSCommentObj bBSCommentObj) {
            if (PatchProxy.proxy(new Object[]{hVar, view, bBSCommentObj}, this, changeQuickRedirect, false, 27256, new Class[]{com.max.hbcustomview.h.class, View.class, BBSCommentObj.class}, Void.TYPE).isSupported) {
                return;
            }
            com.max.hbcommon.utils.d.b("clicktestzzzz", "onItemClick");
            c.this.f80320e.m(this.f80356a, bBSCommentObj);
        }
    }

    /* JADX INFO: compiled from: CommentsAdapter.java */
    public class g implements PostOptionObj.OnClickListener {
        public static ChangeQuickRedirect changeQuickRedirect;

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ BBSCommentObj f80358a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ LinkInfoObj f80359b;

        g(BBSCommentObj bBSCommentObj, LinkInfoObj linkInfoObj) {
            this.f80358a = bBSCommentObj;
            this.f80359b = linkInfoObj;
        }

        @Override // com.max.hbshare.bean.PostOptionObj.OnClickListener
        public void onClick(Dialog dialog, View view, ImageView imageView, TextView textView) {
            if (PatchProxy.proxy(new Object[]{dialog, view, imageView, textView}, this, changeQuickRedirect, false, 27216, new Class[]{Dialog.class, View.class, ImageView.class, TextView.class}, Void.TYPE).isSupported) {
                return;
            }
            c cVar = c.this;
            BBSCommentObj bBSCommentObj = this.f80358a;
            LinkInfoObj linkInfoObj = this.f80359b;
            c.w(cVar, bBSCommentObj, linkInfoObj != null ? linkInfoObj.getLinkid() : null);
        }
    }

    /* JADX INFO: compiled from: CommentsAdapter.java */
    public class g0 implements RowView.e<BBSCommentObj> {
        public static ChangeQuickRedirect changeQuickRedirect;

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ LinkInfoObj f80361a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ boolean f80362b;

        g0(LinkInfoObj linkInfoObj, boolean z10) {
            this.f80361a = linkInfoObj;
            this.f80362b = z10;
        }

        @Override // com.max.hbcustomview.RowView.e
        public /* bridge */ /* synthetic */ boolean a(com.max.hbcustomview.h hVar, View view, BBSCommentObj bBSCommentObj) {
            PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{hVar, view, bBSCommentObj}, this, changeQuickRedirect, false, 27259, new Class[]{com.max.hbcustomview.h.class, View.class, Object.class}, Boolean.TYPE);
            return patchProxyResultProxy.isSupported ? ((Boolean) patchProxyResultProxy.result).booleanValue() : b(hVar, view, bBSCommentObj);
        }

        public boolean b(com.max.hbcustomview.h hVar, View view, BBSCommentObj bBSCommentObj) {
            PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{hVar, view, bBSCommentObj}, this, changeQuickRedirect, false, 27258, new Class[]{com.max.hbcustomview.h.class, View.class, BBSCommentObj.class}, Boolean.TYPE);
            if (patchProxyResultProxy.isSupported) {
                return ((Boolean) patchProxyResultProxy.result).booleanValue();
            }
            c.u(c.this, this.f80361a, bBSCommentObj, this.f80362b);
            return true;
        }
    }

    /* JADX INFO: compiled from: CommentsAdapter.java */
    public class h implements PostOptionObj.OnClickListener {
        public static ChangeQuickRedirect changeQuickRedirect;

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ BBSCommentObj f80364a;

        h(BBSCommentObj bBSCommentObj) {
            this.f80364a = bBSCommentObj;
        }

        @Override // com.max.hbshare.bean.PostOptionObj.OnClickListener
        public void onClick(Dialog dialog, View view, ImageView imageView, TextView textView) {
            if (PatchProxy.proxy(new Object[]{dialog, view, imageView, textView}, this, changeQuickRedirect, false, 27217, new Class[]{Dialog.class, View.class, ImageView.class, TextView.class}, Void.TYPE).isSupported) {
                return;
            }
            c.x(c.this, this.f80364a.getCommentid());
        }
    }

    /* JADX INFO: compiled from: CommentsAdapter.java */
    public class h0 implements View.OnClickListener {
        public static ChangeQuickRedirect changeQuickRedirect;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ BBSCommentsObj f80366b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ SubCommentView f80367c;

        h0(BBSCommentsObj bBSCommentsObj, SubCommentView subCommentView) {
            this.f80366b = bBSCommentsObj;
            this.f80367c = subCommentView;
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            if (PatchProxy.proxy(new Object[]{view}, this, changeQuickRedirect, false, 27260, new Class[]{View.class}, Void.TYPE).isSupported) {
                return;
            }
            c.this.f80320e.t3(this.f80366b.getComment().get(0).getCommentid(), this.f80367c);
        }
    }

    /* JADX INFO: compiled from: CommentsAdapter.java */
    public class i implements PostOptionObj.OnClickListener {
        public static ChangeQuickRedirect changeQuickRedirect;

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ String f80369a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ String f80370b;

        i(String str, String str2) {
            this.f80369a = str;
            this.f80370b = str2;
        }

        @Override // com.max.hbshare.bean.PostOptionObj.OnClickListener
        public void onClick(Dialog dialog, View view, ImageView imageView, TextView textView) {
            if (!PatchProxy.proxy(new Object[]{dialog, view, imageView, textView}, this, changeQuickRedirect, false, 27218, new Class[]{Dialog.class, View.class, ImageView.class, TextView.class}, Void.TYPE).isSupported && com.max.xiaoheihe.utils.i0.e(c.this.f80319d)) {
                c.this.f80320e.Q(this.f80369a, this.f80370b);
            }
        }
    }

    /* JADX INFO: compiled from: CommentsAdapter.java */
    public class i0 implements View.OnClickListener {
        public static ChangeQuickRedirect changeQuickRedirect;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ BBSCommentObj f80372b;

        i0(BBSCommentObj bBSCommentObj) {
            this.f80372b = bBSCommentObj;
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            if (PatchProxy.proxy(new Object[]{view}, this, changeQuickRedirect, false, 27261, new Class[]{View.class}, Void.TYPE).isSupported) {
                return;
            }
            k0 k0Var = c.this.f80320e;
            BBSCommentObj bBSCommentObj = this.f80372b;
            k0Var.m(bBSCommentObj, bBSCommentObj);
        }
    }

    /* JADX INFO: compiled from: CommentsAdapter.java */
    public class j implements PostOptionObj.OnClickListener {
        public static ChangeQuickRedirect changeQuickRedirect;

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ String f80374a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ String f80375b;

        j(String str, String str2) {
            this.f80374a = str;
            this.f80375b = str2;
        }

        @Override // com.max.hbshare.bean.PostOptionObj.OnClickListener
        public void onClick(Dialog dialog, View view, ImageView imageView, TextView textView) {
            if (!PatchProxy.proxy(new Object[]{dialog, view, imageView, textView}, this, changeQuickRedirect, false, 27219, new Class[]{Dialog.class, View.class, ImageView.class, TextView.class}, Void.TYPE).isSupported && com.max.xiaoheihe.utils.i0.e(c.this.f80319d)) {
                c.this.f80320e.Z1(this.f80374a, this.f80375b);
            }
        }
    }

    /* JADX INFO: compiled from: CommentsAdapter.java */
    public class j0 implements UpdatePointViewGroup.a {
        public static ChangeQuickRedirect changeQuickRedirect;

        j0() {
        }

        @Override // com.max.xiaoheihe.view.UpdatePointViewGroup.a
        public void a(MotionEvent motionEvent) {
        }
    }

    /* JADX INFO: compiled from: CommentsAdapter.java */
    public class k implements View.OnClickListener {
        public static ChangeQuickRedirect changeQuickRedirect;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ BBSUserInfoObj f80378b;

        k(BBSUserInfoObj bBSUserInfoObj) {
            this.f80378b = bBSUserInfoObj;
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            if (PatchProxy.proxy(new Object[]{view}, this, changeQuickRedirect, false, 27207, new Class[]{View.class}, Void.TYPE).isSupported) {
                return;
            }
            com.max.xiaoheihe.base.router.b.T(c.this.f80319d, this.f80378b.getUserid()).A();
        }
    }

    /* JADX INFO: compiled from: CommentsAdapter.java */
    public interface k0 {
        void D2(String str);

        LinkInfoObj M1();

        void Q(String str, String str2);

        void R1(String str);

        void T(String str);

        void X0(String str, String str2);

        void X2(String str);

        void Z1(String str, String str2);

        void e(String str);

        void j(String str);

        void m(BBSCommentObj bBSCommentObj, BBSCommentObj bBSCommentObj2);

        String n1();

        void p(String str);

        void s0(String str, String str2);

        void t3(String str, SubCommentView subCommentView);

        void u3(BBSCommentObj bBSCommentObj);

        void y0(String str, boolean z10);
    }

    /* JADX INFO: compiled from: CommentsAdapter.java */
    public class l implements PostOptionObj.OnClickListener {
        public static ChangeQuickRedirect changeQuickRedirect;

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ String f80380a;

        /* JADX INFO: compiled from: CommentsAdapter.java */
        public class a implements com.max.xiaoheihe.view.m {
            public static ChangeQuickRedirect changeQuickRedirect;

            a() {
            }

            @Override // com.max.xiaoheihe.view.m
            public void a(Dialog dialog) {
                if (PatchProxy.proxy(new Object[]{dialog}, this, changeQuickRedirect, false, 27223, new Class[]{Dialog.class}, Void.TYPE).isSupported) {
                    return;
                }
                c.this.f80320e.y0(l.this.f80380a, true);
                dialog.dismiss();
            }

            @Override // com.max.xiaoheihe.view.m
            public void b(Dialog dialog) {
                if (PatchProxy.proxy(new Object[]{dialog}, this, changeQuickRedirect, false, 27222, new Class[]{Dialog.class}, Void.TYPE).isSupported) {
                    return;
                }
                dialog.dismiss();
            }
        }

        l(String str) {
            this.f80380a = str;
        }

        @Override // com.max.hbshare.bean.PostOptionObj.OnClickListener
        public void onClick(Dialog dialog, View view, ImageView imageView, TextView textView) {
            if (!PatchProxy.proxy(new Object[]{dialog, view, imageView, textView}, this, changeQuickRedirect, false, 27221, new Class[]{Dialog.class, View.class, ImageView.class, TextView.class}, Void.TYPE).isSupported && com.max.xiaoheihe.utils.i0.e(c.this.f80319d)) {
                com.max.xiaoheihe.view.l.D(c.this.f80319d, "", c.this.f80319d.getString(R.string.confirm_delete_reply), c.this.f80319d.getString(R.string.confirm), c.this.f80319d.getString(R.string.cancel), new a());
            }
        }
    }

    /* JADX INFO: compiled from: CommentsAdapter.java */
    public class m implements PostOptionObj.OnClickListener {
        public static ChangeQuickRedirect changeQuickRedirect;

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ BBSCommentObj f80383a;

        m(BBSCommentObj bBSCommentObj) {
            this.f80383a = bBSCommentObj;
        }

        @Override // com.max.hbshare.bean.PostOptionObj.OnClickListener
        public void onClick(Dialog dialog, View view, ImageView imageView, TextView textView) {
            if (PatchProxy.proxy(new Object[]{dialog, view, imageView, textView}, this, changeQuickRedirect, false, 27224, new Class[]{Dialog.class, View.class, ImageView.class, TextView.class}, Void.TYPE).isSupported) {
                return;
            }
            com.max.xiaoheihe.utils.d.o(c.this.f80319d, com.max.xiaoheihe.module.expression.core.a.f(c.this.f80319d, new SpannableStringBuilder(this.f80383a.getText().trim()), ViewUtils.f(c.this.f80319d, 15.0f), true));
            com.max.hbutils.utils.c cVar = com.max.hbutils.utils.c.f73533a;
            com.max.hbutils.utils.c.f(c.this.f80319d.getString(R.string.text_copied));
        }
    }

    /* JADX INFO: compiled from: CommentsAdapter.java */
    public class n implements PostOptionObj.OnClickListener {
        public static ChangeQuickRedirect changeQuickRedirect;

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ String f80385a;

        n(String str) {
            this.f80385a = str;
        }

        @Override // com.max.hbshare.bean.PostOptionObj.OnClickListener
        public void onClick(Dialog dialog, View view, ImageView imageView, TextView textView) {
            if (!PatchProxy.proxy(new Object[]{dialog, view, imageView, textView}, this, changeQuickRedirect, false, 27225, new Class[]{Dialog.class, View.class, ImageView.class, TextView.class}, Void.TYPE).isSupported && com.max.xiaoheihe.utils.i0.e(c.this.f80319d)) {
                c.this.f80320e.R1(this.f80385a);
            }
        }
    }

    /* JADX INFO: compiled from: CommentsAdapter.java */
    public class o implements PostOptionObj.OnClickListener {
        public static ChangeQuickRedirect changeQuickRedirect;

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ BBSCommentObj f80387a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ LinkInfoObj f80388b;

        o(BBSCommentObj bBSCommentObj, LinkInfoObj linkInfoObj) {
            this.f80387a = bBSCommentObj;
            this.f80388b = linkInfoObj;
        }

        @Override // com.max.hbshare.bean.PostOptionObj.OnClickListener
        public void onClick(Dialog dialog, View view, ImageView imageView, TextView textView) {
            if (PatchProxy.proxy(new Object[]{dialog, view, imageView, textView}, this, changeQuickRedirect, false, 27226, new Class[]{Dialog.class, View.class, ImageView.class, TextView.class}, Void.TYPE).isSupported) {
                return;
            }
            c cVar = c.this;
            BBSCommentObj bBSCommentObj = this.f80387a;
            LinkInfoObj linkInfoObj = this.f80388b;
            c.w(cVar, bBSCommentObj, linkInfoObj != null ? linkInfoObj.getLinkid() : null);
        }
    }

    /* JADX INFO: compiled from: CommentsAdapter.java */
    public class p implements PostOptionObj.OnClickListener {
        public static ChangeQuickRedirect changeQuickRedirect;

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ BBSCommentObj f80390a;

        p(BBSCommentObj bBSCommentObj) {
            this.f80390a = bBSCommentObj;
        }

        @Override // com.max.hbshare.bean.PostOptionObj.OnClickListener
        public void onClick(Dialog dialog, View view, ImageView imageView, TextView textView) {
            if (PatchProxy.proxy(new Object[]{dialog, view, imageView, textView}, this, changeQuickRedirect, false, 27227, new Class[]{Dialog.class, View.class, ImageView.class, TextView.class}, Void.TYPE).isSupported) {
                return;
            }
            c.x(c.this, this.f80390a.getCommentid());
        }
    }

    /* JADX INFO: compiled from: CommentsAdapter.java */
    public class q implements PostOptionObj.OnClickListener {
        public static ChangeQuickRedirect changeQuickRedirect;

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ String f80392a;

        q(String str) {
            this.f80392a = str;
        }

        @Override // com.max.hbshare.bean.PostOptionObj.OnClickListener
        public void onClick(Dialog dialog, View view, ImageView imageView, TextView textView) {
            if (PatchProxy.proxy(new Object[]{dialog, view, imageView, textView}, this, changeQuickRedirect, false, 27228, new Class[]{Dialog.class, View.class, ImageView.class, TextView.class}, Void.TYPE).isSupported) {
                return;
            }
            c.this.f80320e.e(this.f80392a);
        }
    }

    /* JADX INFO: compiled from: CommentsAdapter.java */
    public class r implements PostOptionObj.OnClickListener {
        public static ChangeQuickRedirect changeQuickRedirect;

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ String f80394a;

        r(String str) {
            this.f80394a = str;
        }

        @Override // com.max.hbshare.bean.PostOptionObj.OnClickListener
        public void onClick(Dialog dialog, View view, ImageView imageView, TextView textView) {
            if (PatchProxy.proxy(new Object[]{dialog, view, imageView, textView}, this, changeQuickRedirect, false, 27229, new Class[]{Dialog.class, View.class, ImageView.class, TextView.class}, Void.TYPE).isSupported) {
                return;
            }
            c.this.f80320e.j(this.f80394a);
        }
    }

    /* JADX INFO: compiled from: CommentsAdapter.java */
    public class s implements PostOptionObj.OnClickListener {
        public static ChangeQuickRedirect changeQuickRedirect;

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ BBSUserInfoObj f80396a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ String f80397b;

        s(BBSUserInfoObj bBSUserInfoObj, String str) {
            this.f80396a = bBSUserInfoObj;
            this.f80397b = str;
        }

        @Override // com.max.hbshare.bean.PostOptionObj.OnClickListener
        public void onClick(Dialog dialog, View view, ImageView imageView, TextView textView) {
            if (!PatchProxy.proxy(new Object[]{dialog, view, imageView, textView}, this, changeQuickRedirect, false, 27230, new Class[]{Dialog.class, View.class, ImageView.class, TextView.class}, Void.TYPE).isSupported && com.max.xiaoheihe.utils.i0.e(c.this.f80319d)) {
                c.this.f80320e.Q(this.f80396a.getUserid(), this.f80397b);
            }
        }
    }

    /* JADX INFO: compiled from: CommentsAdapter.java */
    public class t implements PostOptionObj.OnClickListener {
        public static ChangeQuickRedirect changeQuickRedirect;

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ BBSUserInfoObj f80399a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ String f80400b;

        t(BBSUserInfoObj bBSUserInfoObj, String str) {
            this.f80399a = bBSUserInfoObj;
            this.f80400b = str;
        }

        @Override // com.max.hbshare.bean.PostOptionObj.OnClickListener
        public void onClick(Dialog dialog, View view, ImageView imageView, TextView textView) {
            if (!PatchProxy.proxy(new Object[]{dialog, view, imageView, textView}, this, changeQuickRedirect, false, 27231, new Class[]{Dialog.class, View.class, ImageView.class, TextView.class}, Void.TYPE).isSupported && com.max.xiaoheihe.utils.i0.e(c.this.f80319d)) {
                c.this.f80320e.Z1(this.f80399a.getUserid(), this.f80400b);
            }
        }
    }

    /* JADX INFO: compiled from: CommentsAdapter.java */
    public class u implements PostOptionObj.OnClickListener {
        public static ChangeQuickRedirect changeQuickRedirect;

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ String f80402a;

        /* JADX INFO: compiled from: CommentsAdapter.java */
        public class a implements com.max.xiaoheihe.view.m {
            public static ChangeQuickRedirect changeQuickRedirect;

            a() {
            }

            @Override // com.max.xiaoheihe.view.m
            public void a(Dialog dialog) {
                if (PatchProxy.proxy(new Object[]{dialog}, this, changeQuickRedirect, false, 27234, new Class[]{Dialog.class}, Void.TYPE).isSupported) {
                    return;
                }
                c.this.f80320e.p(u.this.f80402a);
                dialog.dismiss();
            }

            @Override // com.max.xiaoheihe.view.m
            public void b(Dialog dialog) {
                if (PatchProxy.proxy(new Object[]{dialog}, this, changeQuickRedirect, false, 27233, new Class[]{Dialog.class}, Void.TYPE).isSupported) {
                    return;
                }
                dialog.dismiss();
            }
        }

        u(String str) {
            this.f80402a = str;
        }

        @Override // com.max.hbshare.bean.PostOptionObj.OnClickListener
        public void onClick(Dialog dialog, View view, ImageView imageView, TextView textView) {
            if (!PatchProxy.proxy(new Object[]{dialog, view, imageView, textView}, this, changeQuickRedirect, false, 27232, new Class[]{Dialog.class, View.class, ImageView.class, TextView.class}, Void.TYPE).isSupported && com.max.xiaoheihe.utils.i0.e(c.this.f80319d)) {
                com.max.xiaoheihe.view.l.D(c.this.f80319d, "", c.this.f80319d.getString(R.string.confirm_delete_img), c.this.f80319d.getString(R.string.confirm), c.this.f80319d.getString(R.string.cancel), new a());
            }
        }
    }

    /* JADX INFO: compiled from: CommentsAdapter.java */
    public class v implements View.OnClickListener {
        public static ChangeQuickRedirect changeQuickRedirect;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ BBSCommentObj f80405b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ BBSUserSectionView f80406c;

        v(BBSCommentObj bBSCommentObj, BBSUserSectionView bBSUserSectionView) {
            this.f80405b = bBSCommentObj;
            this.f80406c = bBSUserSectionView;
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            int i10;
            if (!PatchProxy.proxy(new Object[]{view}, this, changeQuickRedirect, false, 27220, new Class[]{View.class}, Void.TYPE).isSupported && com.max.xiaoheihe.utils.i0.e(c.this.f80319d)) {
                int iQ = com.max.hbutils.utils.n.q(this.f80405b.getUp());
                if ("1".equals(this.f80405b.getIs_support())) {
                    c.this.f80320e.X0(this.f80405b.getCommentid(), "2");
                    this.f80405b.setIs_support("2");
                    this.f80406c.f80853i.f80991b.setChecked(false);
                    this.f80406c.f80853i.f80992c.setChecked(false);
                    i10 = iQ - 1;
                    c.this.Q(i10, "2", this.f80405b);
                } else if ("0".equals(this.f80405b.getIs_support())) {
                    c.this.f80320e.X0(this.f80405b.getCommentid(), "1");
                    this.f80405b.setIs_support("1");
                    this.f80406c.f80853i.f80991b.setChecked(true, true);
                    this.f80406c.f80853i.f80992c.setChecked(false);
                    i10 = iQ + 1;
                    c.this.Q(i10, "1", this.f80405b);
                } else {
                    c.this.f80320e.X0(this.f80405b.getCommentid(), "1");
                    this.f80405b.setIs_support("1");
                    this.f80406c.f80853i.f80991b.setChecked(true, true);
                    this.f80406c.f80853i.f80992c.setChecked(false);
                    i10 = iQ + 1;
                    c.this.Q(i10, "1", this.f80405b);
                }
                this.f80405b.setUp(String.valueOf(i10));
                this.f80406c.f80853i.f80991b.setNum(i10);
                if (c.this.f80317b) {
                    c.t(c.this, this.f80406c.f80853i.f80991b, this.f80405b.getUp());
                }
            }
        }
    }

    /* JADX INFO: compiled from: CommentsAdapter.java */
    public class w implements PostOptionObj.OnClickListener {
        public static ChangeQuickRedirect changeQuickRedirect;

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ String f80408a;

        w(String str) {
            this.f80408a = str;
        }

        @Override // com.max.hbshare.bean.PostOptionObj.OnClickListener
        public void onClick(Dialog dialog, View view, ImageView imageView, TextView textView) {
            if (PatchProxy.proxy(new Object[]{dialog, view, imageView, textView}, this, changeQuickRedirect, false, 27236, new Class[]{Dialog.class, View.class, ImageView.class, TextView.class}, Void.TYPE).isSupported) {
                return;
            }
            c.this.f80320e.D2(this.f80408a);
        }
    }

    /* JADX INFO: compiled from: CommentsAdapter.java */
    public class x implements PostOptionObj.OnClickListener {
        public static ChangeQuickRedirect changeQuickRedirect;

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ String f80410a;

        x(String str) {
            this.f80410a = str;
        }

        @Override // com.max.hbshare.bean.PostOptionObj.OnClickListener
        public void onClick(Dialog dialog, View view, ImageView imageView, TextView textView) {
            if (PatchProxy.proxy(new Object[]{dialog, view, imageView, textView}, this, changeQuickRedirect, false, 27237, new Class[]{Dialog.class, View.class, ImageView.class, TextView.class}, Void.TYPE).isSupported) {
                return;
            }
            c.this.f80320e.X2(this.f80410a);
        }
    }

    /* JADX INFO: compiled from: CommentsAdapter.java */
    public class y implements PostOptionObj.OnClickListener {
        public static ChangeQuickRedirect changeQuickRedirect;

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ String f80412a;

        y(String str) {
            this.f80412a = str;
        }

        @Override // com.max.hbshare.bean.PostOptionObj.OnClickListener
        public void onClick(Dialog dialog, View view, ImageView imageView, TextView textView) {
            if (PatchProxy.proxy(new Object[]{dialog, view, imageView, textView}, this, changeQuickRedirect, false, 27238, new Class[]{Dialog.class, View.class, ImageView.class, TextView.class}, Void.TYPE).isSupported) {
                return;
            }
            c.this.f80320e.T(this.f80412a);
        }
    }

    /* JADX INFO: compiled from: CommentsAdapter.java */
    public class z implements PostOptionObj.OnClickListener {
        public static ChangeQuickRedirect changeQuickRedirect;

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ String f80414a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ LinkInfoObj f80415b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ BBSCommentObj f80416c;

        z(String str, LinkInfoObj linkInfoObj, BBSCommentObj bBSCommentObj) {
            this.f80414a = str;
            this.f80415b = linkInfoObj;
            this.f80416c = bBSCommentObj;
        }

        @Override // com.max.hbshare.bean.PostOptionObj.OnClickListener
        public void onClick(Dialog dialog, View view, ImageView imageView, TextView textView) {
            if (PatchProxy.proxy(new Object[]{dialog, view, imageView, textView}, this, changeQuickRedirect, false, 27239, new Class[]{Dialog.class, View.class, ImageView.class, TextView.class}, Void.TYPE).isSupported) {
                return;
            }
            long jCurrentTimeMillis = System.currentTimeMillis();
            if (c.this.f80322g == 0 || jCurrentTimeMillis - c.this.f80322g > 500) {
                c.this.f80322g = jCurrentTimeMillis;
                if ("18".equals(this.f80414a) || "3".equals(this.f80414a) || "14".equals(this.f80414a)) {
                    return;
                }
                ForwardInfo forwardInfo = new ForwardInfo(com.max.hbcommon.utils.c.u(this.f80415b.getTitle()) ? this.f80415b.getDescription() : this.f80415b.getTitle(), this.f80415b.getUser().getUsername(), this.f80415b.getUser().getUserid(), this.f80415b.getLinkid(), this.f80415b.getThumbs() == null ? this.f80415b.getUser().getAvartar() : this.f80415b.getThumbs().get(0), null);
                if (com.max.xiaoheihe.utils.i0.e(c.this.f80319d)) {
                    com.max.xiaoheihe.utils.d.G1(c.this.f80319d, ForwardEditActiviy.W2(c.this.f80319d, this.f80415b.getLinkid(), this.f80415b.getLink_tag(), c.A(c.this, this.f80416c), forwardInfo));
                }
            }
        }
    }

    public c(Context context, List<BBSCommentsObj> list, k0 k0Var) {
        super(context, list, ad.a.a(ad.a.f1215v, false) ? R.layout.table_row_bbs_comment_v3 : R.layout.table_row_bbs_comment);
        this.f80317b = ad.a.a(ad.a.f1215v, false);
        this.f80318c = ad.a.a(ad.a.G, false);
        this.f80322g = 0L;
        this.f80323h = false;
        this.f80319d = context;
        this.f80320e = k0Var;
        this.f80321f = com.max.hbimage.b.y();
    }

    static /* synthetic */ String A(c cVar, BBSCommentObj bBSCommentObj) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{cVar, bBSCommentObj}, null, changeQuickRedirect, true, 27203, new Class[]{c.class, BBSCommentObj.class}, String.class);
        return patchProxyResultProxy.isSupported ? (String) patchProxyResultProxy.result : cVar.D(bBSCommentObj);
    }

    private String B(String str) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{str}, this, changeQuickRedirect, false, 27195, new Class[]{String.class}, String.class);
        if (patchProxyResultProxy.isSupported) {
            return (String) patchProxyResultProxy.result;
        }
        return this.f80318c ? com.max.hbutils.utils.w.q(this.f80319d, str) : com.max.hbutils.utils.w.t(this.f80319d, str);
    }

    private com.max.hbcommon.base.f C() {
        Object obj = this.f80319d;
        if (obj instanceof com.max.hbcommon.base.f) {
            return (com.max.hbcommon.base.f) obj;
        }
        return null;
    }

    private String D(BBSCommentObj bBSCommentObj) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{bBSCommentObj}, this, changeQuickRedirect, false, 27189, new Class[]{BBSCommentObj.class}, String.class);
        if (patchProxyResultProxy.isSupported) {
            return (String) patchProxyResultProxy.result;
        }
        StringBuilder sb2 = new StringBuilder(com.max.xiaoheihe.utils.j.e(bBSCommentObj.getUser().getUserid(), bBSCommentObj.getUser().getUsername(), bBSCommentObj.getText()));
        StringBuilder sb3 = new StringBuilder();
        List<PostImageObj> imgs = bBSCommentObj.getImgs();
        if (!com.max.hbcommon.utils.c.w(imgs)) {
            for (int i10 = 0; i10 < imgs.size(); i10++) {
                sb3.append(imgs.get(i10).getUrl());
                if (i10 != imgs.size() - 1) {
                    sb3.append(',');
                }
            }
            if (imgs.size() > 1) {
                sb2.append(String.format("<a href=\"heybox://open_image_preview\" data-urls=\"%s\">查看图片(%s)</a>", sb3, Integer.valueOf(imgs.size())));
            } else {
                sb2.append(String.format("<a href=\"heybox://open_image_preview\" data-urls=\"%s\">查看图片</a>", sb3));
            }
        }
        return sb2.toString();
    }

    public static View E(Context context, String str, String str2) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{context, str, str2}, null, changeQuickRedirect, true, 27176, new Class[]{Context.class, String.class, String.class}, View.class);
        if (patchProxyResultProxy.isSupported) {
            return (View) patchProxyResultProxy.result;
        }
        LinearLayout linearLayout = new LinearLayout(context);
        linearLayout.setOrientation(0);
        linearLayout.setPadding(ViewUtils.f(context, 12.0f), 0, ViewUtils.f(context, 45.0f), 0);
        linearLayout.setGravity(16);
        linearLayout.setLayoutParams(new ViewGroup.MarginLayoutParams(-1, ViewUtils.f(context, 54.0f)));
        linearLayout.setBackgroundResource(R.color.divider_secondary_1_color);
        ImageView imageView = new ImageView(context);
        com.max.hbimage.b.H(str, imageView);
        imageView.setLayoutParams(new LinearLayout.LayoutParams(ViewUtils.f(context, 30.0f), ViewUtils.f(context, 30.0f)));
        linearLayout.addView(imageView);
        ExpressionTextView expressionTextView = new ExpressionTextView(context);
        expressionTextView.setText(str2);
        expressionTextView.setMaxLines(1);
        expressionTextView.setEllipsize(TextUtils.TruncateAt.END);
        expressionTextView.setTextColor(com.max.xiaoheihe.utils.d.E(R.color.text_primary_1_color));
        expressionTextView.setTextSize(1, 13.0f);
        LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(-2, -2);
        layoutParams.setMargins(ViewUtils.f(context, 8.0f), 0, 0, 0);
        expressionTextView.setLayoutParams(layoutParams);
        linearLayout.addView(expressionTextView);
        linearLayout.setOnClickListener(null);
        return linearLayout;
    }

    public static PostOptionObj F(String str, int i10, PostOptionObj.OnClickListener onClickListener) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{str, new Integer(i10), onClickListener}, null, changeQuickRedirect, true, 27177, new Class[]{String.class, Integer.TYPE, PostOptionObj.OnClickListener.class}, PostOptionObj.class);
        if (patchProxyResultProxy.isSupported) {
            return (PostOptionObj) patchProxyResultProxy.result;
        }
        PostOptionObj postOptionObj = new PostOptionObj();
        postOptionObj.setName(str);
        postOptionObj.setImage_resource_id(i10);
        postOptionObj.setClick_listener(onClickListener);
        return postOptionObj;
    }

    private String G(String str, String str2) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{str, str2}, this, changeQuickRedirect, false, 27185, new Class[]{String.class, String.class}, String.class);
        if (patchProxyResultProxy.isSupported) {
            return (String) patchProxyResultProxy.result;
        }
        return "#share_comment_[" + str + "]_[" + str2 + "]#";
    }

    /* JADX WARN: Multi-variable type inference failed */
    private void J(LinkInfoObj linkInfoObj, BBSCommentObj bBSCommentObj, BBSUserInfoObj bBSUserInfoObj, boolean z10) {
        boolean z11 = true;
        if (PatchProxy.proxy(new Object[]{linkInfoObj, bBSCommentObj, bBSUserInfoObj, new Byte(z10 ? (byte) 1 : (byte) 0)}, this, changeQuickRedirect, false, 27188, new Class[]{LinkInfoObj.class, BBSCommentObj.class, BBSUserInfoObj.class, Boolean.TYPE}, Void.TYPE).isSupported) {
            return;
        }
        String link_tag = linkInfoObj != null ? linkInfoObj.getLink_tag() : null;
        Object[] objArr = linkInfoObj != null && "1".equals(linkInfoObj.getIs_article());
        String commentid = bBSCommentObj.getCommentid();
        boolean zEquals = "1".equals(com.max.xiaoheihe.utils.i0.i().getPermission().getBbs_basic_permission());
        boolean zEquals2 = "1".equals(com.max.xiaoheihe.utils.i0.i().getPermission().getBbs_advance_permission());
        String userid = com.max.xiaoheihe.utils.i0.i().getAccount_detail().getUserid();
        Object[] objArr2 = (!com.max.hbcommon.utils.c.u(userid) && userid.equals(bBSUserInfoObj.getUserid())) == true || z10 || zEquals;
        Object[] objArr3 = (z10 && objArr == true) || zEquals;
        if (!z10 && !zEquals2) {
            z11 = false;
        }
        ArrayList arrayList = new ArrayList();
        PostOptionObj postOptionObjF = F(this.f80319d.getString(R.string.delete), R.drawable.bbs_sharebutton_delete_46x46, new l(commentid));
        PostOptionObj postOptionObjF2 = F(this.f80319d.getString(R.string.copy), R.drawable.bbs_sharebutton_copy_46x46, new m(bBSCommentObj));
        boolean z12 = z11;
        PostOptionObj postOptionObjF3 = F(this.f80319d.getString(R.string.report), R.drawable.bbs_sharebutton_report_46x46, new n(commentid));
        Object[] objArr4 = objArr3;
        PostOptionObj postOptionObjF4 = F(this.f80319d.getString(R.string.share), R.drawable.bbs_sharebutton_share_46x46, new o(bBSCommentObj, linkInfoObj));
        PostOptionObj postOptionObjF5 = F(this.f80319d.getString(R.string.private_letter), R.drawable.bbs_sharebutton_private_chat_46x46, new p(bBSCommentObj));
        PostOptionObj postOptionObjF6 = F(this.f80319d.getString(R.string.elect_hot_comment), R.drawable.bbs_sharebutton_hot_46x46, new q(commentid));
        PostOptionObj postOptionObjF7 = F(this.f80319d.getString(R.string.cancel_hot_comment), R.drawable.bbs_sharebutton_cancel_hot_46x46, new r(commentid));
        PostOptionObj postOptionObjF8 = F(this.f80319d.getString(R.string.bbs_mute), R.drawable.bbs_sharebutton_ban_46x46, new s(bBSUserInfoObj, commentid));
        PostOptionObj postOptionObjF9 = F(this.f80319d.getString(R.string.bbs_warning), R.drawable.bbs_sharebutton_warn_46x46, new t(bBSUserInfoObj, commentid));
        PostOptionObj postOptionObjF10 = F(this.f80319d.getString(R.string.del_img), R.drawable.bbs_sharebutton_delete_46x46, new u(commentid));
        PostOptionObj postOptionObjF11 = F(this.f80319d.getString(R.string.put_comment_to_bottom), R.drawable.bbs_sharebutton_fold_46x46, new w(commentid));
        PostOptionObj postOptionObjF12 = F(this.f80319d.getString(R.string.to_top_comment), R.drawable.bbs_sharebutton_top_46x46, new x(commentid));
        PostOptionObj postOptionObjF13 = F(this.f80319d.getString(R.string.cancel_top_comment), R.drawable.bbs_sharebutton_cancel_top_46x46, new y(commentid));
        PostOptionObj postOptionObjF14 = F(this.f80319d.getString(R.string.forward), R.drawable.bbs_sharebutton_forward_46x46, new z(link_tag, linkInfoObj, bBSCommentObj));
        if (objArr2 != false) {
            arrayList.add(postOptionObjF);
        }
        arrayList.add(postOptionObjF2);
        arrayList.add(postOptionObjF3);
        if (!ad.a.a(ad.a.f1219z, false)) {
            arrayList.add(postOptionObjF5);
        }
        arrayList.add(postOptionObjF4);
        if (com.max.xiaoheihe.utils.j.f(link_tag).booleanValue()) {
            arrayList.add(postOptionObjF14);
        }
        if (zEquals2) {
            arrayList.add(postOptionObjF6);
            arrayList.add(postOptionObjF7);
        }
        if (zEquals) {
            arrayList.add(postOptionObjF10);
        }
        if (zEquals) {
            arrayList.add(postOptionObjF9);
            arrayList.add(postOptionObjF8);
        }
        if (objArr4 != false) {
            arrayList.add(postOptionObjF11);
        }
        if (z12) {
            if ("1".equals(bBSCommentObj.getTop_comment())) {
                arrayList.add(postOptionObjF13);
            } else {
                arrayList.add(postOptionObjF12);
            }
        }
        Context context = this.f80319d;
        W(context, arrayList, E(context, bBSCommentObj.getUser().getAvatar(), bBSCommentObj.getText()));
    }

    /* JADX WARN: Multi-variable type inference failed */
    private void K(LinkInfoObj linkInfoObj, BBSCommentObj bBSCommentObj, boolean z10) {
        boolean z11 = true;
        if (PatchProxy.proxy(new Object[]{linkInfoObj, bBSCommentObj, new Byte(z10 ? (byte) 1 : (byte) 0)}, this, changeQuickRedirect, false, 27187, new Class[]{LinkInfoObj.class, BBSCommentObj.class, Boolean.TYPE}, Void.TYPE).isSupported) {
            return;
        }
        String userid = com.max.xiaoheihe.utils.i0.i().getAccount_detail().getUserid();
        boolean zEquals = "1".equals(com.max.xiaoheihe.utils.i0.i().getPermission().getBbs_basic_permission());
        if ((!com.max.hbcommon.utils.c.u(userid) && userid.equals(bBSCommentObj.getUser().getUserid())) == false && !z10 && !zEquals) {
            z11 = false;
        }
        String commentid = bBSCommentObj.getCommentid();
        String userid2 = bBSCommentObj.getUser().getUserid();
        ArrayList arrayList = new ArrayList();
        PostOptionObj postOptionObjF = F(this.f80319d.getString(R.string.delete), R.drawable.bbs_sharebutton_delete_46x46, new d(commentid));
        PostOptionObj postOptionObjF2 = F(this.f80319d.getString(R.string.copy), R.drawable.bbs_sharebutton_copy_46x46, new e(bBSCommentObj));
        PostOptionObj postOptionObjF3 = F(this.f80319d.getString(R.string.report), R.drawable.bbs_sharebutton_report_46x46, new f(commentid));
        PostOptionObj postOptionObjF4 = F(this.f80319d.getString(R.string.share), R.drawable.bbs_sharebutton_share_46x46, new g(bBSCommentObj, linkInfoObj));
        PostOptionObj postOptionObjF5 = F(this.f80319d.getString(R.string.private_letter), R.drawable.bbs_sharebutton_private_chat_46x46, new h(bBSCommentObj));
        PostOptionObj postOptionObjF6 = F(this.f80319d.getString(R.string.bbs_mute), R.drawable.bbs_sharebutton_ban_46x46, new i(userid2, commentid));
        PostOptionObj postOptionObjF7 = F(this.f80319d.getString(R.string.bbs_warning), R.drawable.bbs_sharebutton_warn_46x46, new j(userid2, commentid));
        if (z11) {
            arrayList.add(postOptionObjF);
        }
        arrayList.add(postOptionObjF2);
        arrayList.add(postOptionObjF3);
        if (!ad.a.a(ad.a.f1219z, false)) {
            arrayList.add(postOptionObjF5);
        }
        arrayList.add(postOptionObjF4);
        if (zEquals) {
            arrayList.add(postOptionObjF7);
            arrayList.add(postOptionObjF6);
        }
        Context context = this.f80319d;
        W(context, arrayList, E(context, bBSCommentObj.getUser().getAvatar(), bBSCommentObj.getText()));
    }

    private void L(@n0 BBSCommentObj bBSCommentObj, @n0 com.max.hbcommon.base.adapter.s.e eVar, LinearLayout linearLayout) {
        TextView textView;
        if (PatchProxy.proxy(new Object[]{bBSCommentObj, eVar, linearLayout}, this, changeQuickRedirect, false, 27182, new Class[]{BBSCommentObj.class, com.max.hbcommon.base.adapter.s.e.class, LinearLayout.class}, Void.TYPE).isSupported || (textView = (TextView) eVar.i(R.id.tv_author_award)) == null) {
            return;
        }
        if (!com.max.hbcommon.utils.c.x(bBSCommentObj.getIs_author_award())) {
            textView.setVisibility(8);
            return;
        }
        textView.setVisibility(0);
        if (linearLayout.getVisibility() == 0) {
            ((ViewGroup.MarginLayoutParams) textView.getLayoutParams()).topMargin = ViewUtils.f(this.f80319d, 10.0f);
        } else {
            ((ViewGroup.MarginLayoutParams) textView.getLayoutParams()).topMargin = ViewUtils.f(this.f80319d, 7.0f);
        }
    }

    private void M(@n0 BBSLinkListLikeCommentBase bBSLinkListLikeCommentBase, String str) {
        if (PatchProxy.proxy(new Object[]{bBSLinkListLikeCommentBase, str}, this, changeQuickRedirect, false, 27184, new Class[]{BBSLinkListLikeCommentBase.class, String.class}, Void.TYPE).isSupported) {
            return;
        }
        bBSLinkListLikeCommentBase.d(!Objects.equals(str, "0"));
    }

    private void N(BBSCommentObj bBSCommentObj, SpannableStringBuilder spannableStringBuilder) {
        if (PatchProxy.proxy(new Object[]{bBSCommentObj, spannableStringBuilder}, this, changeQuickRedirect, false, 27183, new Class[]{BBSCommentObj.class, SpannableStringBuilder.class}, Void.TYPE).isSupported || com.max.hbcommon.utils.c.u(bBSCommentObj.getDesc_extra())) {
            return;
        }
        spannableStringBuilder.append((CharSequence) bBSCommentObj.getDesc_extra());
        spannableStringBuilder.append("·");
    }

    private void O(@n0 BBSCommentObj bBSCommentObj, @n0 com.max.hbcommon.base.adapter.s.e eVar, BBSUserSectionView bBSUserSectionView) {
        View viewInflate;
        if (PatchProxy.proxy(new Object[]{bBSCommentObj, eVar, bBSUserSectionView}, this, changeQuickRedirect, false, 27181, new Class[]{BBSCommentObj.class, com.max.hbcommon.base.adapter.s.e.class, BBSUserSectionView.class}, Void.TYPE).isSupported || this.f80324i == null || com.max.hbcommon.utils.c.u(bBSCommentObj.getRecommend_state())) {
            return;
        }
        WebWithNativeRecommendItemObj positive_info = com.max.hbcommon.utils.c.x(bBSCommentObj.getRecommend_state()) ? this.f80324i.getPositive_info() : this.f80324i.getNegative_info();
        if (positive_info == null || (viewInflate = LayoutInflater.from(this.f80319d).inflate(R.layout.layout_comment_recommend_tag, (ViewGroup) null, false)) == null) {
            return;
        }
        TextView textView = (TextView) viewInflate.findViewById(R.id.tv_desc);
        ImageView imageView = (ImageView) viewInflate.findViewById(R.id.iv_icon);
        int iG = com.max.hbcommon.utils.l.g(positive_info.getText_check_color());
        int iG2 = com.max.hbcommon.utils.l.g(positive_info.getBg_check_color());
        textView.setText(positive_info.getDesc());
        textView.setTextColor(iG);
        com.max.hbimage.b.K(positive_info.getIcon(), imageView);
        imageView.setAlpha(com.max.xiaoheihe.utils.d.x(iG));
        imageView.setColorFilter(com.max.xiaoheihe.utils.d.J(iG));
        viewInflate.setBackground(com.max.hbutils.utils.q.v(this.f80319d, iG2, 2.0f));
        LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(-2, ViewUtils.f(this.f80319d, 12.0f));
        layoutParams.rightMargin = ViewUtils.f(this.f80319d, 4.0f);
        layoutParams.gravity = 16;
        viewInflate.setLayoutParams(layoutParams);
        bBSUserSectionView.f80858n.addView(viewInflate);
    }

    private void P(String str) {
        k0 k0Var;
        if (PatchProxy.proxy(new Object[]{str}, this, changeQuickRedirect, false, 27186, new Class[]{String.class}, Void.TYPE).isSupported || (k0Var = this.f80320e) == null || k0Var.M1() == null) {
            return;
        }
        String linkid = this.f80320e.M1().getLinkid();
        Context context = this.f80319d;
        context.startActivity(SendToFriendActivity.O.a(context, G(linkid, str), "16"));
        JsonObject jsonObject = new JsonObject();
        jsonObject.addProperty("link_id", linkid);
        jsonObject.addProperty("comment_id", str);
        com.max.hbcommon.analytics.d.d("4", lb.d.Y, null, jsonObject);
    }

    private void S(int i10, String str, BBSCommentObj bBSCommentObj, BBSCommentObj bBSCommentObj2) {
        if (PatchProxy.proxy(new Object[]{new Integer(i10), str, bBSCommentObj, bBSCommentObj2}, this, changeQuickRedirect, false, 27193, new Class[]{Integer.TYPE, String.class, BBSCommentObj.class, BBSCommentObj.class}, Void.TYPE).isSupported || com.max.hbcommon.utils.c.w(getDataList()) || bBSCommentObj == null || bBSCommentObj2 == null) {
            return;
        }
        for (int i11 = 0; i11 < getDataList().size(); i11++) {
            if (getDataList().get(i11) != null && !com.max.hbcommon.utils.c.w(getDataList().get(i11).getComment())) {
                List<BBSCommentObj> comment = getDataList().get(i11).getComment();
                if (Objects.equals(comment.get(0).getCommentid(), bBSCommentObj2.getCommentid())) {
                    for (int i12 = 0; i12 < comment.size(); i12++) {
                        BBSCommentObj bBSCommentObj3 = comment.get(i12);
                        if (bBSCommentObj3 != null && Objects.equals(bBSCommentObj3.getCommentid(), bBSCommentObj.getCommentid())) {
                            bBSCommentObj3.setIs_support(str);
                            bBSCommentObj3.setUp(i10 + "");
                        }
                    }
                }
            }
        }
    }

    private boolean U(BBSCommentObj bBSCommentObj) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{bBSCommentObj}, this, changeQuickRedirect, false, 27190, new Class[]{BBSCommentObj.class}, Boolean.TYPE);
        if (patchProxyResultProxy.isSupported) {
            return ((Boolean) patchProxyResultProxy.result).booleanValue();
        }
        return bBSCommentObj.getImgs() == null || (bBSCommentObj.getImgs().size() == 1 && !"image/gif".equals(bBSCommentObj.getImgs().get(0).getMimetype()));
    }

    private void V(BBSCommentObj bBSCommentObj, String str) {
        if (PatchProxy.proxy(new Object[]{bBSCommentObj, str}, this, changeQuickRedirect, false, 27191, new Class[]{BBSCommentObj.class, String.class}, Void.TYPE).isSupported) {
            return;
        }
        if (!U(bBSCommentObj)) {
            this.f80320e.u3(bBSCommentObj);
            return;
        }
        ShareImageDialogFragment shareImageDialogFragmentX4 = ShareImageDialogFragment.x4();
        shareImageDialogFragmentX4.Q4(com.max.hbimage.image.c.d((Activity) this.f80319d));
        shareImageDialogFragmentX4.D4(new a0(bBSCommentObj));
        b0 b0Var = new b0();
        String str2 = "1".equals(this.f80320e.M1().getIs_article()) ? com.max.hbshare.c.f72549e : com.max.hbshare.c.f72547c;
        JsonObject jsonObject = new JsonObject();
        jsonObject.addProperty("link_id", str);
        jsonObject.addProperty("comment_id", bBSCommentObj.getCommentid());
        shareImageDialogFragmentX4.S4(new com.max.hbshare.c.b(str2, b0Var, jsonObject));
        Context context = this.f80319d;
        if (!(context instanceof AppCompatActivity) || ((AppCompatActivity) context).isFinishing()) {
            return;
        }
        shareImageDialogFragmentX4.show(((AppCompatActivity) this.f80319d).getSupportFragmentManager(), PostPageFactory.M);
    }

    public static void W(Context context, ArrayList<PostOptionObj> arrayList, View view) {
        if (PatchProxy.proxy(new Object[]{context, arrayList, view}, null, changeQuickRedirect, true, 27178, new Class[]{Context.class, ArrayList.class, View.class}, Void.TYPE).isSupported) {
            return;
        }
        DeviceServiceUtil.INSTANCE.vibrate(context, 10L);
        Bundle bundle = new Bundle();
        bundle.putBoolean(com.max.hbshare.d.f72593o, true);
        bundle.putSerializable(com.max.hbshare.d.f72592n, arrayList);
        HBShareData hBShareData = new HBShareData();
        hBShareData.setExtraOpts(bundle);
        hBShareData.setCustomTitleView(view);
        com.max.hbshare.d.E(context, hBShareData);
    }

    static /* synthetic */ com.max.hbcommon.base.f o(c cVar) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{cVar}, null, changeQuickRedirect, true, 27204, new Class[]{c.class}, com.max.hbcommon.base.f.class);
        return patchProxyResultProxy.isSupported ? (com.max.hbcommon.base.f) patchProxyResultProxy.result : cVar.C();
    }

    static /* synthetic */ String q(c cVar, String str) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{cVar, str}, null, changeQuickRedirect, true, 27205, new Class[]{c.class, String.class}, String.class);
        return patchProxyResultProxy.isSupported ? (String) patchProxyResultProxy.result : cVar.B(str);
    }

    static /* synthetic */ void r(c cVar, int i10, String str, BBSCommentObj bBSCommentObj, BBSCommentObj bBSCommentObj2) {
        if (PatchProxy.proxy(new Object[]{cVar, new Integer(i10), str, bBSCommentObj, bBSCommentObj2}, null, changeQuickRedirect, true, 27206, new Class[]{c.class, Integer.TYPE, String.class, BBSCommentObj.class, BBSCommentObj.class}, Void.TYPE).isSupported) {
            return;
        }
        cVar.S(i10, str, bBSCommentObj, bBSCommentObj2);
    }

    static /* synthetic */ void t(c cVar, BBSLinkListLikeCommentBase bBSLinkListLikeCommentBase, String str) {
        if (PatchProxy.proxy(new Object[]{cVar, bBSLinkListLikeCommentBase, str}, null, changeQuickRedirect, true, 27198, new Class[]{c.class, BBSLinkListLikeCommentBase.class, String.class}, Void.TYPE).isSupported) {
            return;
        }
        cVar.M(bBSLinkListLikeCommentBase, str);
    }

    static /* synthetic */ void u(c cVar, LinkInfoObj linkInfoObj, BBSCommentObj bBSCommentObj, boolean z10) {
        if (PatchProxy.proxy(new Object[]{cVar, linkInfoObj, bBSCommentObj, new Byte(z10 ? (byte) 1 : (byte) 0)}, null, changeQuickRedirect, true, 27199, new Class[]{c.class, LinkInfoObj.class, BBSCommentObj.class, Boolean.TYPE}, Void.TYPE).isSupported) {
            return;
        }
        cVar.K(linkInfoObj, bBSCommentObj, z10);
    }

    static /* synthetic */ void v(c cVar, LinkInfoObj linkInfoObj, BBSCommentObj bBSCommentObj, BBSUserInfoObj bBSUserInfoObj, boolean z10) {
        if (PatchProxy.proxy(new Object[]{cVar, linkInfoObj, bBSCommentObj, bBSUserInfoObj, new Byte(z10 ? (byte) 1 : (byte) 0)}, null, changeQuickRedirect, true, 27200, new Class[]{c.class, LinkInfoObj.class, BBSCommentObj.class, BBSUserInfoObj.class, Boolean.TYPE}, Void.TYPE).isSupported) {
            return;
        }
        cVar.J(linkInfoObj, bBSCommentObj, bBSUserInfoObj, z10);
    }

    static /* synthetic */ void w(c cVar, BBSCommentObj bBSCommentObj, String str) {
        if (PatchProxy.proxy(new Object[]{cVar, bBSCommentObj, str}, null, changeQuickRedirect, true, 27201, new Class[]{c.class, BBSCommentObj.class, String.class}, Void.TYPE).isSupported) {
            return;
        }
        cVar.V(bBSCommentObj, str);
    }

    static /* synthetic */ void x(c cVar, String str) {
        if (PatchProxy.proxy(new Object[]{cVar, str}, null, changeQuickRedirect, true, 27202, new Class[]{c.class, String.class}, Void.TYPE).isSupported) {
            return;
        }
        cVar.P(str);
    }

    public void H(com.max.hbcommon.base.adapter.s.e eVar) {
        if (PatchProxy.proxy(new Object[]{eVar}, this, changeQuickRedirect, false, 27194, new Class[]{com.max.hbcommon.base.adapter.s.e.class}, Void.TYPE).isSupported) {
            return;
        }
        ((SubCommentView) eVar.i(R.id.rv_sub_comments)).setViewSetter(new c0());
    }

    /* JADX WARN: Code duplicated, block: B:129:0x065e  */
    /* JADX WARN: Code duplicated, block: B:132:0x068a  */
    /* JADX WARN: Code duplicated, block: B:134:0x0693  */
    /* JADX WARN: Code duplicated, block: B:136:0x06bb  */
    /* JADX WARN: Code duplicated, block: B:139:0x06cd A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:140:0x06cf  */
    /* JADX WARN: Code duplicated, block: B:141:0x06d5  */
    /* JADX WARN: Code duplicated, block: B:142:0x06db  */
    /* JADX WARN: Code duplicated, block: B:55:0x02fc  */
    /* JADX WARN: Code duplicated, block: B:56:0x0301  */
    /* JADX WARN: Code duplicated, block: B:59:0x031b  */
    /* JADX WARN: Code duplicated, block: B:61:0x0321  */
    /* JADX WARN: Code duplicated, block: B:65:0x0340  */
    /* JADX WARN: Code duplicated, block: B:66:0x0351  */
    /* JADX WARN: Code duplicated, block: B:68:0x035c  */
    /* JADX WARN: Code duplicated, block: B:69:0x036c  */
    /* JADX WARN: Code duplicated, block: B:72:0x038e  */
    /* JADX WARN: Code duplicated, block: B:79:0x03cf  */
    /* JADX WARN: Code duplicated, block: B:81:0x03eb  */
    /* JADX WARN: Code duplicated, block: B:83:0x0422  */
    /* JADX WARN: Code duplicated, block: B:84:0x049f  */
    /* JADX WARN: Code duplicated, block: B:87:0x04ab  */
    /* JADX WARN: Code duplicated, block: B:89:0x04c3 A[LOOP:3: B:88:0x04c1->B:89:0x04c3, LOOP_END] */
    /* JADX WARN: Instruction removed from duplicated block: B:87:0x04ab, please report this as an issue */
    @SuppressLint({"RecyclerView"})
    public void I(com.max.hbcommon.base.adapter.s.e eVar, BBSCommentsObj bBSCommentsObj) {
        int i10;
        BBSUserInfoObj bBSUserInfoObj;
        boolean z10;
        SubCommentView subCommentView;
        String str;
        boolean z11;
        SpannableStringBuilder spannableStringBuilder;
        int i11;
        CharSequence text;
        Spannable spannable;
        URLSpan[] uRLSpanArr;
        SpannableStringBuilder spannableStringBuilder2;
        int i12;
        SubCommentView subCommentView2;
        int i13;
        int iF;
        View view;
        if (PatchProxy.proxy(new Object[]{eVar, bBSCommentsObj}, this, changeQuickRedirect, false, 27180, new Class[]{com.max.hbcommon.base.adapter.s.e.class, BBSCommentsObj.class}, Void.TYPE).isSupported) {
            return;
        }
        eVar.b().setTag(R.id.comment, bBSCommentsObj);
        ViewGroup viewGroup = (ViewGroup) eVar.i(R.id.ll_root);
        View viewI = eVar.i(R.id.vg_comments_detail);
        UpdatePointViewGroup updatePointViewGroup = (UpdatePointViewGroup) eVar.i(R.id.vg_main_comment);
        BBSUserSectionView bBSUserSectionView = (BBSUserSectionView) eVar.i(R.id.vg_title);
        ExpressionTextView expressionTextView = (ExpressionTextView) eVar.i(R.id.tv_comment);
        LinearLayout linearLayout = (LinearLayout) eVar.i(R.id.ll_pic);
        View viewI2 = eVar.i(R.id.vg_lab_top);
        View viewI3 = eVar.i(R.id.divider);
        SubCommentView subCommentView3 = (SubCommentView) eVar.i(R.id.rv_sub_comments);
        int iIndexOf = getDataList().indexOf(bBSCommentsObj);
        eVar.b().setTag(bBSCommentsObj);
        if (bBSCommentsObj == this.mDataList.get(getItemCount() - 1)) {
            viewI3.setVisibility(8);
            i10 = 0;
        } else {
            i10 = 0;
            viewI3.setVisibility(0);
        }
        if (this.f80323h) {
            viewGroup.setBackgroundColor(i10);
            viewI3.setBackgroundResource(R.color.white_alpha5);
            subCommentView3.setBackground(com.max.hbutils.utils.q.o(this.f80319d, R.color.white_alpha3, 8.0f));
            subCommentView3.setTransparentBg(this.f80323h);
            bBSUserSectionView.setDarkStyle();
            expressionTextView.setTextColor(-1);
        }
        BBSCommentObj bBSCommentObj = bBSCommentsObj.getComment().get(0);
        if (bBSCommentObj == null) {
            return;
        }
        LinkInfoObj linkInfoObjM1 = this.f80320e.M1();
        BBSUserInfoObj user = linkInfoObjM1 != null ? linkInfoObjM1.getUser() : null;
        boolean zQ = com.max.xiaoheihe.utils.i0.q(user != null ? user.getUserid() : null);
        BBSUserInfoObj user2 = bBSCommentObj.getUser();
        boolean zEquals = "1".equals(com.max.xiaoheihe.utils.i0.i().getPermission().getBbs_basic_permission());
        bBSUserSectionView.setType(BBSUserSectionView.BBSUserSectionType.LinkComment);
        bBSUserSectionView.f80846b.setAvatar(user2.getAvartar(), user2.getAvatar_decoration());
        if ("1".equals(bBSCommentObj.getIs_link_owner())) {
            bBSUserSectionView.f80848d.setVisibility(0);
        } else {
            bBSUserSectionView.f80848d.setVisibility(8);
        }
        k kVar = new k(user2);
        bBSUserSectionView.f80846b.setOnClickListener(kVar);
        bBSUserSectionView.f80859o.removeAllViews();
        if (zEquals) {
            TextView textView = new TextView(this.f80319d);
            textView.setTextColor(this.f80319d.getResources().getColor(R.color.white));
            textView.setBackgroundResource(R.color.user_level_1_end);
            textView.setTextSize(1, 8.0f);
            textView.setPadding(ViewUtils.f(this.f80319d, 2.0f), 0, ViewUtils.f(this.f80319d, 2.0f), 0);
            textView.setText(user2.getUserid());
            LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(-2, -2);
            layoutParams.leftMargin = ViewUtils.f(this.f80319d, 3.0f);
            bBSUserSectionView.f80859o.addView(textView, layoutParams);
        }
        bBSUserSectionView.setName(com.max.xiaoheihe.utils.d.M1(user2.getUsername()));
        bBSUserSectionView.f80847c.setOnClickListener(kVar);
        bBSUserSectionView.a(user2.getMedal(), user2.getMedals(), user2.getUserid());
        if (user2.getLevel_info() != null) {
            bBSUserSectionView.f80850f.setVisibility(0);
            bBSUserSectionView.setLevel(com.max.hbutils.utils.n.q(user2.getLevel_info().getLevel()));
        } else {
            bBSUserSectionView.f80850f.setVisibility(8);
        }
        boolean z12 = !"hot".equalsIgnoreCase(this.f80320e.n1()) && com.max.hbutils.utils.n.r(bBSCommentObj.getFloor_num()) > 0;
        SpannableStringBuilder spannableStringBuilder3 = new SpannableStringBuilder();
        bBSUserSectionView.f80858n.removeAllViews();
        if ("1".equals(bBSCommentObj.getIs_top()) && this.f80318c) {
            if (ad.a.a(ad.a.f1215v, false)) {
                bBSUserInfoObj = user2;
                z10 = zQ;
                subCommentView = subCommentView3;
                str = ad.a.f1215v;
                z11 = true;
            } else {
                TextView textView2 = new TextView(this.f80319d);
                textView2.setText("热评");
                textView2.setGravity(17);
                bBSUserInfoObj = user2;
                textView2.setTextColor(this.f80319d.getResources().getColor(R.color.white));
                textView2.setTextSize(1, 10.0f);
                Context context = this.f80319d;
                str = ad.a.f1215v;
                z10 = zQ;
                LinearLayout.LayoutParams layoutParams2 = new LinearLayout.LayoutParams(ViewUtils.f(context, 26.0f), ViewUtils.f(this.f80319d, 14.0f));
                layoutParams2.rightMargin = ViewUtils.f(this.f80319d, 6.0f);
                subCommentView = subCommentView3;
                Drawable drawableI = ViewUtils.i(ViewUtils.f(this.f80319d, 2.0f), this.f80319d.getResources().getColor(R.color.red_start), this.f80319d.getResources().getColor(R.color.red_end));
                textView2.setBackgroundDrawable(drawableI);
                textView2.setBackground(drawableI);
                bBSUserSectionView.f80858n.addView(textView2, layoutParams2);
            }
            N(bBSCommentObj, spannableStringBuilder3);
            O(bBSCommentObj, eVar, bBSUserSectionView);
            if ("1".equals(bBSCommentObj.getTop_comment())) {
                viewI2.setVisibility(0);
            } else {
                viewI2.setVisibility(8);
            }
            spannableStringBuilder3.append(B(bBSCommentObj.getCreate_at()));
            if (!com.max.hbcommon.utils.c.u(bBSCommentObj.getIp_location())) {
                if (spannableStringBuilder3.length() > 0) {
                    spannableStringBuilder3.append("·");
                }
                spannableStringBuilder3.append((CharSequence) bBSCommentObj.getIp_location());
            }
            bBSUserSectionView.setDesc(spannableStringBuilder3.toString());
            if ("0".equals(bBSCommentObj.getIs_support())) {
                bBSUserSectionView.f80853i.f80991b.setChecked(false);
                bBSUserSectionView.f80853i.f80992c.setChecked(true);
            } else if ("1".equals(bBSCommentObj.getIs_support())) {
                bBSUserSectionView.f80853i.f80991b.setChecked(true);
                bBSUserSectionView.f80853i.f80992c.setChecked(false);
            } else {
                bBSUserSectionView.f80853i.f80991b.setChecked(false);
                bBSUserSectionView.f80853i.f80992c.setChecked(false);
            }
            bBSUserSectionView.f80853i.f80991b.setNum(com.max.hbutils.utils.n.q(bBSCommentObj.getUp()));
            if (this.f80317b) {
                M(bBSUserSectionView.f80853i.f80991b, bBSCommentObj.getUp());
            }
            bBSUserSectionView.f80853i.f80991b.setOnClickListener(new v(bBSCommentObj, bBSUserSectionView));
            bBSUserSectionView.f80853i.f80992c.setOnClickListener(new d0(bBSCommentObj, bBSUserSectionView));
            if (com.max.hbcommon.utils.c.u(bBSCommentObj.getText()) || "1".equals(bBSCommentObj.getIs_cy())) {
                expressionTextView.setVisibility(0);
                spannableStringBuilder = new SpannableStringBuilder();
                spannableStringBuilder.append(bBSCommentObj.getText());
                if ("1".equals(bBSCommentObj.getIs_cy())) {
                    SpannableStringBuilder spannableStringBuilder4 = new SpannableStringBuilder(lb.b.f131098n);
                    int textSize = (int) expressionTextView.getPaint().getTextSize();
                    Context context2 = this.f80319d;
                    spannableStringBuilder4.setSpan(new com.max.hbexpression.widget.a(context2, R.drawable.item_cy_icon, ViewUtils.f(context2, 20.0f), 0, textSize, 1), 0, spannableStringBuilder4.length(), 33);
                    spannableStringBuilder.insert(0, (CharSequence) spannableStringBuilder4);
                }
                if (z11) {
                    SpannableStringBuilder spannableStringBuilder5 = new SpannableStringBuilder("热评");
                    SimpleMarkerViewSpan simpleMarkerViewSpan = new SimpleMarkerViewSpan();
                    TextView textView3 = new TextView(this.f80319d);
                    textView3.setText("热评");
                    textView3.setGravity(17);
                    textView3.setTextColor(this.f80319d.getColor(R.color.background_layer_2_color));
                    textView3.setTextSize(1, 9.0f);
                    textView3.setTypeface(com.max.hbresource.a.f71893a.a(com.max.hbresource.a.f71895c));
                    int iF2 = ViewUtils.f(this.f80319d, 4.0f);
                    int iF3 = ViewUtils.f(this.f80319d, 1.0f);
                    textView3.setPadding(iF2, iF3, iF2, iF3);
                    textView3.setBackground(ViewUtils.i(ViewUtils.f(this.f80319d, 2.0f), this.f80319d.getColor(R.color.store_gradient_free_lottery_start_color), this.f80319d.getColor(R.color.store_gradient_free_lottery_end_color)));
                    i11 = 0;
                    textView3.setIncludeFontPadding(false);
                    simpleMarkerViewSpan.e(this.f80319d, textView3, 0, 4);
                    spannableStringBuilder5.setSpan(simpleMarkerViewSpan, 0, spannableStringBuilder5.length(), 33);
                    spannableStringBuilder.insert(0, (CharSequence) spannableStringBuilder5);
                } else {
                    i11 = 0;
                }
                expressionTextView.setText(spannableStringBuilder);
                text = expressionTextView.getText();
                if (text instanceof Spannable) {
                    spannable = (Spannable) text;
                    uRLSpanArr = (URLSpan[]) spannable.getSpans(i11, text.length(), URLSpan.class);
                    spannableStringBuilder2 = new SpannableStringBuilder(text);
                    for (URLSpan uRLSpan : uRLSpanArr) {
                        spannableStringBuilder2.setSpan(new com.max.xiaoheihe.view.o(this.f80319d, uRLSpan.getURL()), spannable.getSpanStart(uRLSpan), spannable.getSpanEnd(uRLSpan), 34);
                    }
                    expressionTextView.setText(spannableStringBuilder2);
                }
            } else {
                expressionTextView.setVisibility(8);
            }
            if (bBSCommentObj.getImgs() != null || bBSCommentObj.getImgs().size() <= 0) {
                linearLayout.removeAllViews();
                linearLayout.setVisibility(8);
            } else {
                linearLayout.setVisibility(0);
                linearLayout.removeAllViews();
                int size = bBSCommentObj.getImgs().size();
                int i14 = size % 3;
                int i15 = size / 3;
                if (i14 != 0) {
                    i15++;
                }
                int iF4 = ViewUtils.f(this.f80319d, 4.0f);
                int iL = (int) (((double) ViewUtils.L(this.f80319d)) * 0.2d);
                if (iL <= 0) {
                    iL = ViewUtils.f(this.f80319d, 64.0f);
                }
                String str2 = "";
                for (int i16 = 0; i16 < bBSCommentsObj.getComment().get(0).getImgs().size(); i16++) {
                    str2 = str2 + bBSCommentsObj.getComment().get(0).getImgs().get(i16).getUrl() + ";";
                }
                int i17 = 0;
                while (i17 < i15) {
                    LinearLayout linearLayout2 = new LinearLayout(this.f80319d);
                    linearLayout2.setOrientation(0);
                    if (i17 != i15 - 1) {
                        linearLayout2.setPadding(0, 0, 0, iF4);
                    } else {
                        linearLayout2.setPadding(0, 0, 0, 0);
                    }
                    int i18 = i17 + 1;
                    int i19 = i18 * 3 > size ? i14 : 3;
                    int i20 = 0;
                    while (i20 < i19) {
                        int i21 = size;
                        int i22 = i18;
                        int i23 = (i17 * 3) + i20;
                        PostImageObj postImageObj = bBSCommentsObj.getComment().get(0).getImgs().get(i23);
                        int i24 = i14;
                        int i25 = i15;
                        QMUIRadiusImageView qMUIRadiusImageView = new QMUIRadiusImageView(this.f80319d);
                        LinearLayout.LayoutParams layoutParams3 = new LinearLayout.LayoutParams(iL, iL);
                        int i26 = iL;
                        if (i20 != 2) {
                            layoutParams3.setMargins(0, 0, iF4, 0);
                        } else {
                            layoutParams3.setMargins(0, 0, 0, 0);
                        }
                        int i27 = iF4;
                        qMUIRadiusImageView.setBorderWidth(ViewUtils.f(this.f80319d, 0.5f));
                        qMUIRadiusImageView.setBorderColor(this.f80319d.getResources().getColor(this.f80323h ? R.color.white_alpha10 : R.color.divider_secondary_1_color));
                        qMUIRadiusImageView.setCornerRadius(ViewUtils.f(this.f80319d, 5.0f));
                        qMUIRadiusImageView.setScaleType(ImageView.ScaleType.CENTER_CROP);
                        qMUIRadiusImageView.setLayoutParams(layoutParams3);
                        qMUIRadiusImageView.setImageResource(R.drawable.common_default_placeholder_375x210);
                        qMUIRadiusImageView.setId(R.id.iv_image);
                        com.max.hbimage.b.P(postImageObj.getUrl(), qMUIRadiusImageView, R.drawable.common_default_placeholder_375x210, -1, -1, 1.0f, false, -1, false, true);
                        qMUIRadiusImageView.setOnClickListener(new e0(qMUIRadiusImageView, i23, str2));
                        linearLayout2.addView(qMUIRadiusImageView);
                        i20++;
                        size = i21;
                        i18 = i22;
                        i14 = i24;
                        i15 = i25;
                        iL = i26;
                        iF4 = i27;
                    }
                    linearLayout.addView(linearLayout2);
                    i17 = i18;
                }
            }
            L(bBSCommentObj, eVar, linearLayout);
            subCommentView2 = subCommentView;
            subCommentView2.setOnItemclickListener(new f0(bBSCommentObj));
            boolean z13 = z10;
            subCommentView2.setOnItemLongClickListner(new g0(linkInfoObjM1, z13));
            if (bBSCommentsObj.getComment().size() > 1) {
                i13 = 0;
                if (ad.a.a(str, false)) {
                    subCommentView2.setPadding(0, ViewUtils.f(this.f80319d, 6.0f), 0, ViewUtils.f(this.f80319d, 4.0f));
                }
                subCommentView2.setCheckMoreListener(new h0(bBSCommentsObj, subCommentView2));
                subCommentView2.setVisibility(0);
                subCommentView2.setTotalList(bBSCommentsObj.getComment());
            } else {
                i13 = 0;
                subCommentView2.setVisibility(8);
            }
            iF = ViewUtils.f(this.f80319d, 6.0f);
            if (!this.f80317b) {
                view = viewI;
                view.setPadding(i13, i13, i13, iF);
            } else if (iIndexOf == 0) {
                view = viewI;
                view.setPadding(i13, i13, i13, iF);
            } else {
                view = viewI;
                view.setPadding(i13, iF, i13, iF);
            }
            view.setOnClickListener(new i0(bBSCommentObj));
            updatePointViewGroup.setListener(new j0());
            updatePointViewGroup.setOnClickListener(new a(bBSCommentObj));
            expressionTextView.setOnClickListener(new b(bBSCommentObj));
            View.OnLongClickListener viewOnLongClickListenerC0678c = new ViewOnLongClickListenerC0678c(linkInfoObjM1, bBSCommentObj, bBSUserInfoObj, z13);
            expressionTextView.setOnLongClickListener(viewOnLongClickListenerC0678c);
            updatePointViewGroup.setOnLongClickListener(viewOnLongClickListenerC0678c);
        }
        bBSUserInfoObj = user2;
        z10 = zQ;
        subCommentView = subCommentView3;
        str = ad.a.f1215v;
        if (z12 && !this.f80317b) {
            spannableStringBuilder3.append(String.format(this.f80319d.getString(R.string.floor_num), bBSCommentObj.getFloor_num()) + " ");
        }
        z11 = false;
        N(bBSCommentObj, spannableStringBuilder3);
        O(bBSCommentObj, eVar, bBSUserSectionView);
        if ("1".equals(bBSCommentObj.getTop_comment())) {
            viewI2.setVisibility(0);
        } else {
            viewI2.setVisibility(8);
        }
        spannableStringBuilder3.append(B(bBSCommentObj.getCreate_at()));
        if (!com.max.hbcommon.utils.c.u(bBSCommentObj.getIp_location())) {
            if (spannableStringBuilder3.length() > 0) {
                spannableStringBuilder3.append("·");
            }
            spannableStringBuilder3.append((CharSequence) bBSCommentObj.getIp_location());
        }
        bBSUserSectionView.setDesc(spannableStringBuilder3.toString());
        if ("0".equals(bBSCommentObj.getIs_support())) {
            bBSUserSectionView.f80853i.f80991b.setChecked(false);
            bBSUserSectionView.f80853i.f80992c.setChecked(true);
        } else if ("1".equals(bBSCommentObj.getIs_support())) {
            bBSUserSectionView.f80853i.f80991b.setChecked(true);
            bBSUserSectionView.f80853i.f80992c.setChecked(false);
        } else {
            bBSUserSectionView.f80853i.f80991b.setChecked(false);
            bBSUserSectionView.f80853i.f80992c.setChecked(false);
        }
        bBSUserSectionView.f80853i.f80991b.setNum(com.max.hbutils.utils.n.q(bBSCommentObj.getUp()));
        if (this.f80317b) {
            M(bBSUserSectionView.f80853i.f80991b, bBSCommentObj.getUp());
        }
        bBSUserSectionView.f80853i.f80991b.setOnClickListener(new v(bBSCommentObj, bBSUserSectionView));
        bBSUserSectionView.f80853i.f80992c.setOnClickListener(new d0(bBSCommentObj, bBSUserSectionView));
        if (com.max.hbcommon.utils.c.u(bBSCommentObj.getText())) {
            expressionTextView.setVisibility(0);
            spannableStringBuilder = new SpannableStringBuilder();
            spannableStringBuilder.append(bBSCommentObj.getText());
            if ("1".equals(bBSCommentObj.getIs_cy())) {
                SpannableStringBuilder spannableStringBuilder6 = new SpannableStringBuilder(lb.b.f131098n);
                int textSize2 = (int) expressionTextView.getPaint().getTextSize();
                Context context3 = this.f80319d;
                spannableStringBuilder6.setSpan(new com.max.hbexpression.widget.a(context3, R.drawable.item_cy_icon, ViewUtils.f(context3, 20.0f), 0, textSize2, 1), 0, spannableStringBuilder6.length(), 33);
                spannableStringBuilder.insert(0, (CharSequence) spannableStringBuilder6);
            }
            if (z11) {
                SpannableStringBuilder spannableStringBuilder7 = new SpannableStringBuilder("热评");
                SimpleMarkerViewSpan simpleMarkerViewSpan2 = new SimpleMarkerViewSpan();
                TextView textView4 = new TextView(this.f80319d);
                textView4.setText("热评");
                textView4.setGravity(17);
                textView4.setTextColor(this.f80319d.getColor(R.color.background_layer_2_color));
                textView4.setTextSize(1, 9.0f);
                textView4.setTypeface(com.max.hbresource.a.f71893a.a(com.max.hbresource.a.f71895c));
                int iF5 = ViewUtils.f(this.f80319d, 4.0f);
                int iF6 = ViewUtils.f(this.f80319d, 1.0f);
                textView4.setPadding(iF5, iF6, iF5, iF6);
                textView4.setBackground(ViewUtils.i(ViewUtils.f(this.f80319d, 2.0f), this.f80319d.getColor(R.color.store_gradient_free_lottery_start_color), this.f80319d.getColor(R.color.store_gradient_free_lottery_end_color)));
                i11 = 0;
                textView4.setIncludeFontPadding(false);
                simpleMarkerViewSpan2.e(this.f80319d, textView4, 0, 4);
                spannableStringBuilder7.setSpan(simpleMarkerViewSpan2, 0, spannableStringBuilder7.length(), 33);
                spannableStringBuilder.insert(0, (CharSequence) spannableStringBuilder7);
            } else {
                i11 = 0;
            }
            expressionTextView.setText(spannableStringBuilder);
            text = expressionTextView.getText();
            if (text instanceof Spannable) {
                spannable = (Spannable) text;
                uRLSpanArr = (URLSpan[]) spannable.getSpans(i11, text.length(), URLSpan.class);
                spannableStringBuilder2 = new SpannableStringBuilder(text);
                while (i12 < r0) {
                    spannableStringBuilder2.setSpan(new com.max.xiaoheihe.view.o(this.f80319d, uRLSpan.getURL()), spannable.getSpanStart(uRLSpan), spannable.getSpanEnd(uRLSpan), 34);
                }
                expressionTextView.setText(spannableStringBuilder2);
            }
        } else {
            expressionTextView.setVisibility(0);
            spannableStringBuilder = new SpannableStringBuilder();
            spannableStringBuilder.append(bBSCommentObj.getText());
            if ("1".equals(bBSCommentObj.getIs_cy())) {
                SpannableStringBuilder spannableStringBuilder8 = new SpannableStringBuilder(lb.b.f131098n);
                int textSize3 = (int) expressionTextView.getPaint().getTextSize();
                Context context4 = this.f80319d;
                spannableStringBuilder8.setSpan(new com.max.hbexpression.widget.a(context4, R.drawable.item_cy_icon, ViewUtils.f(context4, 20.0f), 0, textSize3, 1), 0, spannableStringBuilder8.length(), 33);
                spannableStringBuilder.insert(0, (CharSequence) spannableStringBuilder8);
            }
            if (z11) {
                SpannableStringBuilder spannableStringBuilder9 = new SpannableStringBuilder("热评");
                SimpleMarkerViewSpan simpleMarkerViewSpan3 = new SimpleMarkerViewSpan();
                TextView textView5 = new TextView(this.f80319d);
                textView5.setText("热评");
                textView5.setGravity(17);
                textView5.setTextColor(this.f80319d.getColor(R.color.background_layer_2_color));
                textView5.setTextSize(1, 9.0f);
                textView5.setTypeface(com.max.hbresource.a.f71893a.a(com.max.hbresource.a.f71895c));
                int iF7 = ViewUtils.f(this.f80319d, 4.0f);
                int iF8 = ViewUtils.f(this.f80319d, 1.0f);
                textView5.setPadding(iF7, iF8, iF7, iF8);
                textView5.setBackground(ViewUtils.i(ViewUtils.f(this.f80319d, 2.0f), this.f80319d.getColor(R.color.store_gradient_free_lottery_start_color), this.f80319d.getColor(R.color.store_gradient_free_lottery_end_color)));
                i11 = 0;
                textView5.setIncludeFontPadding(false);
                simpleMarkerViewSpan3.e(this.f80319d, textView5, 0, 4);
                spannableStringBuilder9.setSpan(simpleMarkerViewSpan3, 0, spannableStringBuilder9.length(), 33);
                spannableStringBuilder.insert(0, (CharSequence) spannableStringBuilder9);
            } else {
                i11 = 0;
            }
            expressionTextView.setText(spannableStringBuilder);
            text = expressionTextView.getText();
            if (text instanceof Spannable) {
                spannable = (Spannable) text;
                uRLSpanArr = (URLSpan[]) spannable.getSpans(i11, text.length(), URLSpan.class);
                spannableStringBuilder2 = new SpannableStringBuilder(text);
                while (i12 < r0) {
                    spannableStringBuilder2.setSpan(new com.max.xiaoheihe.view.o(this.f80319d, uRLSpan.getURL()), spannable.getSpanStart(uRLSpan), spannable.getSpanEnd(uRLSpan), 34);
                }
                expressionTextView.setText(spannableStringBuilder2);
            }
        }
        if (bBSCommentObj.getImgs() != null) {
            linearLayout.removeAllViews();
            linearLayout.setVisibility(8);
        } else {
            linearLayout.removeAllViews();
            linearLayout.setVisibility(8);
        }
        L(bBSCommentObj, eVar, linearLayout);
        subCommentView2 = subCommentView;
        subCommentView2.setOnItemclickListener(new f0(bBSCommentObj));
        boolean z14 = z10;
        subCommentView2.setOnItemLongClickListner(new g0(linkInfoObjM1, z14));
        if (bBSCommentsObj.getComment().size() > 1) {
            i13 = 0;
            if (ad.a.a(str, false)) {
                subCommentView2.setPadding(0, ViewUtils.f(this.f80319d, 6.0f), 0, ViewUtils.f(this.f80319d, 4.0f));
            }
            subCommentView2.setCheckMoreListener(new h0(bBSCommentsObj, subCommentView2));
            subCommentView2.setVisibility(0);
            subCommentView2.setTotalList(bBSCommentsObj.getComment());
        } else {
            i13 = 0;
            subCommentView2.setVisibility(8);
        }
        iF = ViewUtils.f(this.f80319d, 6.0f);
        if (!this.f80317b) {
            view = viewI;
            view.setPadding(i13, i13, i13, iF);
        } else if (iIndexOf == 0) {
            view = viewI;
            view.setPadding(i13, i13, i13, iF);
        } else {
            view = viewI;
            view.setPadding(i13, iF, i13, iF);
        }
        view.setOnClickListener(new i0(bBSCommentObj));
        updatePointViewGroup.setListener(new j0());
        updatePointViewGroup.setOnClickListener(new a(bBSCommentObj));
        expressionTextView.setOnClickListener(new b(bBSCommentObj));
        View.OnLongClickListener viewOnLongClickListenerC0678c2 = new ViewOnLongClickListenerC0678c(linkInfoObjM1, bBSCommentObj, bBSUserInfoObj, z14);
        expressionTextView.setOnLongClickListener(viewOnLongClickListenerC0678c2);
        updatePointViewGroup.setOnLongClickListener(viewOnLongClickListenerC0678c2);
    }

    public void Q(int i10, String str, BBSCommentObj bBSCommentObj) {
        if (PatchProxy.proxy(new Object[]{new Integer(i10), str, bBSCommentObj}, this, changeQuickRedirect, false, 27192, new Class[]{Integer.TYPE, String.class, BBSCommentObj.class}, Void.TYPE).isSupported) {
            return;
        }
        for (int i11 = 0; i11 < getDataList().size(); i11++) {
            if (getDataList().get(i11).getComment().get(0).getFloor_num().equals(bBSCommentObj.getFloor_num())) {
                getDataList().get(i11).getComment().get(0).setIs_support(str);
                BBSCommentObj bBSCommentObj2 = getDataList().get(i11).getComment().get(0);
                bBSCommentObj2.setUp(i10 + "");
                getDataList().get(i11).getComment().set(0, bBSCommentObj2);
            }
        }
    }

    public void R(WebWithNativeRecommendInfoObj webWithNativeRecommendInfoObj) {
        this.f80324i = webWithNativeRecommendInfoObj;
    }

    public void T(boolean z10) {
        this.f80323h = z10;
    }

    @Override // com.max.hbcommon.base.adapter.s
    @SuppressLint({"RecyclerView"})
    public /* bridge */ /* synthetic */ void onBindViewHolder(com.max.hbcommon.base.adapter.s.e eVar, BBSCommentsObj bBSCommentsObj) {
        if (PatchProxy.proxy(new Object[]{eVar, bBSCommentsObj}, this, changeQuickRedirect, false, 27196, new Class[]{com.max.hbcommon.base.adapter.s.e.class, Object.class}, Void.TYPE).isSupported) {
            return;
        }
        I(eVar, bBSCommentsObj);
    }

    @Override // com.max.hbcommon.base.adapter.s, androidx.recyclerview.widget.RecyclerView.Adapter
    public /* bridge */ /* synthetic */ RecyclerView.ViewHolder onCreateViewHolder(ViewGroup viewGroup, int i10) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{viewGroup, new Integer(i10)}, this, changeQuickRedirect, false, 27197, new Class[]{ViewGroup.class, Integer.TYPE}, RecyclerView.ViewHolder.class);
        return patchProxyResultProxy.isSupported ? (RecyclerView.ViewHolder) patchProxyResultProxy.result : onCreateViewHolder(viewGroup, i10);
    }

    @Override // com.max.hbcommon.base.adapter.s, androidx.recyclerview.widget.RecyclerView.Adapter
    public com.max.hbcommon.base.adapter.s.e onCreateViewHolder(ViewGroup viewGroup, int i10) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{viewGroup, new Integer(i10)}, this, changeQuickRedirect, false, 27179, new Class[]{ViewGroup.class, Integer.TYPE}, com.max.hbcommon.base.adapter.s.e.class);
        if (patchProxyResultProxy.isSupported) {
            return (com.max.hbcommon.base.adapter.s.e) patchProxyResultProxy.result;
        }
        com.max.hbcommon.base.adapter.s.e eVarOnCreateViewHolder = super.onCreateViewHolder(viewGroup, i10);
        H(eVarOnCreateViewHolder);
        return eVarOnCreateViewHolder;
    }
}
