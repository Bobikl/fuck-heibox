package com.max.xiaoheihe.module.bbs.widget;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.compose.runtime.internal.o;
import com.max.xiaoheihe.base.router.b;
import com.max.xiaoheihe.bean.bbs.CommentPostLinkCardObj;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import dl.d;
import dl.e;
import kotlin.jvm.internal.f0;
import kotlin.jvm.internal.t0;
import kotlin.jvm.internal.u;
import xh.i;

/* JADX INFO: compiled from: LinkPostInfoDecoratorWidget.kt */
/* JADX INFO: loaded from: classes10.dex */
@t0({"SMAP\nLinkPostInfoDecoratorWidget.kt\nKotlin\n*S Kotlin\n*F\n+ 1 LinkPostInfoDecoratorWidget.kt\ncom/max/xiaoheihe/module/bbs/widget/LinkPostInfoDecoratorWidget\n+ 2 View.kt\nandroidx/core/view/ViewKt\n*L\n1#1,46:1\n304#2,2:47\n*S KotlinDebug\n*F\n+ 1 LinkPostInfoDecoratorWidget.kt\ncom/max/xiaoheihe/module/bbs/widget/LinkPostInfoDecoratorWidget\n*L\n20#1:47,2\n*E\n"})
@o(parameters = 0)
public final class LinkPostInfoDecoratorWidget extends LinkPostInfoWidget {
    public static final int N = 0;
    public static ChangeQuickRedirect changeQuickRedirect;

    /* JADX INFO: compiled from: LinkPostInfoDecoratorWidget.kt */
    public static final class a implements View.OnClickListener {
        public static ChangeQuickRedirect changeQuickRedirect;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ CommentPostLinkCardObj f83502c;

        a(CommentPostLinkCardObj commentPostLinkCardObj) {
            this.f83502c = commentPostLinkCardObj;
        }

        @Override // android.view.View.OnClickListener
        public final void onClick(View view) {
            if (PatchProxy.proxy(new Object[]{view}, this, changeQuickRedirect, false, 31343, new Class[]{View.class}, Void.TYPE).isSupported) {
                return;
            }
            Context context = LinkPostInfoDecoratorWidget.this.getContext();
            f0.o(context, "context");
            b.j0(context, this.f83502c.getProtocol());
        }
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    @i
    public LinkPostInfoDecoratorWidget(@d Context context) {
        this(context, null, 0, 6, null);
        f0.p(context, "context");
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    @i
    public LinkPostInfoDecoratorWidget(@d Context context, @e AttributeSet attributeSet) {
        this(context, attributeSet, 0, 4, null);
        f0.p(context, "context");
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    @i
    public LinkPostInfoDecoratorWidget(@d Context context, @e AttributeSet attributeSet, int i10) {
        super(context, attributeSet, i10);
        f0.p(context, "context");
    }

    public /* synthetic */ LinkPostInfoDecoratorWidget(Context context, AttributeSet attributeSet, int i10, int i11, u uVar) {
        this(context, (i11 & 2) != 0 ? null : attributeSet, (i11 & 4) != 0 ? 0 : i10);
    }

    private final void C(CommentPostLinkCardObj commentPostLinkCardObj) {
        String image;
        if (PatchProxy.proxy(new Object[]{commentPostLinkCardObj}, this, changeQuickRedirect, false, 31340, new Class[]{CommentPostLinkCardObj.class}, Void.TYPE).isSupported) {
            return;
        }
        if (commentPostLinkCardObj == null) {
            setVisibility(8);
            return;
        }
        ImageView mPostImageView = getMPostImageView();
        if (mPostImageView != null && (image = commentPostLinkCardObj.getImage()) != null) {
            com.max.hbimage.b.K(image, mPostImageView);
        }
        TextView mPostAuthorTextView = getMPostAuthorTextView();
        if (mPostAuthorTextView != null) {
            mPostAuthorTextView.setText(commentPostLinkCardObj.getText());
        }
        TextView mPostInfoTextView = getMPostInfoTextView();
        if (mPostInfoTextView != null) {
            mPostInfoTextView.setText(commentPostLinkCardObj.getUsername());
        }
        setOnClickListener(new a(commentPostLinkCardObj));
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onAttachedToWindow() {
        if (PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 31341, new Class[0], Void.TYPE).isSupported) {
            return;
        }
        super.onAttachedToWindow();
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onDetachedFromWindow() {
        if (PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 31342, new Class[0], Void.TYPE).isSupported) {
            return;
        }
        super.onDetachedFromWindow();
    }
}
