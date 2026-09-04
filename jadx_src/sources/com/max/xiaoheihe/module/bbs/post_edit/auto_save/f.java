package com.max.xiaoheihe.module.bbs.post_edit.auto_save;

import android.content.Context;
import android.content.DialogInterface;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import androidx.compose.runtime.internal.o;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.max.hbutils.utils.ViewUtils;
import com.max.xiaoheihe.R;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.PatchProxyResult;
import df.h5;
import kotlin.Result;
import kotlin.b2;
import kotlin.jvm.internal.f0;
import kotlin.jvm.internal.t0;
import kotlin.text.u;
import yh.l;

/* JADX INFO: compiled from: RestorePostEditDialogDelegate.kt */
/* JADX INFO: loaded from: classes10.dex */
@t0({"SMAP\nRestorePostEditDialogDelegate.kt\nKotlin\n*S Kotlin\n*F\n+ 1 RestorePostEditDialogDelegate.kt\ncom/max/xiaoheihe/module/bbs/post_edit/auto_save/RestorePostEditDialogDelegate\n+ 2 View.kt\nandroidx/core/view/ViewKt\n*L\n1#1,91:1\n262#2,2:92\n262#2,2:94\n*S KotlinDebug\n*F\n+ 1 RestorePostEditDialogDelegate.kt\ncom/max/xiaoheihe/module/bbs/post_edit/auto_save/RestorePostEditDialogDelegate\n*L\n32#1:92,2\n38#1:94,2\n*E\n"})
@o(parameters = 0)
public final class f {
    public static ChangeQuickRedirect changeQuickRedirect = null;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final int f82922f = 8;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @dl.e
    private final String f82923a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @dl.e
    private final String f82924b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @dl.e
    private l<? super DialogInterface, b2> f82925c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @dl.e
    private l<? super DialogInterface, b2> f82926d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    @dl.e
    private View.OnClickListener f82927e;

    /* JADX INFO: compiled from: RestorePostEditDialogDelegate.kt */
    public static final class a implements DialogInterface.OnClickListener {
        public static ChangeQuickRedirect changeQuickRedirect;

        a() {
        }

        @Override // android.content.DialogInterface.OnClickListener
        public final void onClick(@dl.d DialogInterface dialog, int i10) {
            if (PatchProxy.proxy(new Object[]{dialog, new Integer(i10)}, this, changeQuickRedirect, false, 30930, new Class[]{DialogInterface.class, Integer.TYPE}, Void.TYPE).isSupported) {
                return;
            }
            f0.p(dialog, "dialog");
            l lVar = f.this.f82926d;
            if (lVar != null) {
                lVar.invoke(dialog);
            }
        }
    }

    /* JADX INFO: compiled from: RestorePostEditDialogDelegate.kt */
    public static final class b implements DialogInterface.OnClickListener {
        public static ChangeQuickRedirect changeQuickRedirect;

        b() {
        }

        @Override // android.content.DialogInterface.OnClickListener
        public final void onClick(@dl.d DialogInterface dialog, int i10) {
            if (PatchProxy.proxy(new Object[]{dialog, new Integer(i10)}, this, changeQuickRedirect, false, 30931, new Class[]{DialogInterface.class, Integer.TYPE}, Void.TYPE).isSupported) {
                return;
            }
            f0.p(dialog, "dialog");
            l lVar = f.this.f82925c;
            if (lVar != null) {
                lVar.invoke(dialog);
            }
        }
    }

    /* JADX INFO: compiled from: RestorePostEditDialogDelegate.kt */
    public static final class c implements View.OnClickListener {
        public static ChangeQuickRedirect changeQuickRedirect;

        c() {
        }

        @Override // android.view.View.OnClickListener
        public final void onClick(View view) {
            View.OnClickListener onClickListener;
            if (PatchProxy.proxy(new Object[]{view}, this, changeQuickRedirect, false, 30932, new Class[]{View.class}, Void.TYPE).isSupported || (onClickListener = f.this.f82927e) == null) {
                return;
            }
            onClickListener.onClick(view);
        }
    }

    public f(@dl.e String str, @dl.e String str2) {
        this.f82923a = str;
        this.f82924b = str2;
    }

    private final View d(Context context) {
        boolean z10 = true;
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{context}, this, changeQuickRedirect, false, 30925, new Class[]{Context.class}, View.class);
        if (patchProxyResultProxy.isSupported) {
            return (View) patchProxyResultProxy.result;
        }
        h5 h5VarD = h5.d(LayoutInflater.from(context), null, false);
        f0.o(h5VarD, "inflate(inflater, null, false)");
        String str = this.f82923a;
        if (str == null || u.V1(str)) {
            ImageView imageView = h5VarD.f111253b;
            f0.o(imageView, "binding.ivImg");
            imageView.setVisibility(8);
            ViewGroup.LayoutParams layoutParams = h5VarD.f111255d.getLayoutParams();
            if (layoutParams != null) {
                layoutParams.height = ViewUtils.f(context, 58.0f);
                h5VarD.f111255d.setLayoutParams(layoutParams);
            }
        } else {
            ImageView imageView2 = h5VarD.f111253b;
            f0.o(imageView2, "binding.ivImg");
            imageView2.setVisibility(0);
            ViewGroup.LayoutParams layoutParams2 = h5VarD.f111255d.getLayoutParams();
            if (layoutParams2 != null) {
                layoutParams2.height = ViewUtils.f(context, 62.0f);
                h5VarD.f111255d.setLayoutParams(layoutParams2);
            }
            com.max.hbimage.b.d0(this.f82923a, h5VarD.f111253b, ViewUtils.f(context, 3.0f));
        }
        String str2 = this.f82924b;
        if (str2 == null || str2.length() == 0) {
            h5VarD.f111254c.setTextColor(context.getColor(R.color.text_secondary_2_color));
            String str3 = this.f82923a;
            if (str3 != null && !u.V1(str3)) {
                z10 = false;
            }
            if (z10) {
                h5VarD.f111254c.setText("暂无编辑");
                h5VarD.f111254c.setGravity(17);
            } else {
                h5VarD.f111254c.setText("暂未输入正文");
                h5VarD.f111254c.setGravity(8388627);
            }
        } else {
            h5VarD.f111254c.setText(this.f82924b);
        }
        ConstraintLayout constraintLayoutB = h5VarD.b();
        f0.o(constraintLayoutB, "binding.root");
        return constraintLayoutB;
    }

    @dl.d
    public final f e(@dl.d View.OnClickListener onAction) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{onAction}, this, changeQuickRedirect, false, 30928, new Class[]{View.OnClickListener.class}, f.class);
        if (patchProxyResultProxy.isSupported) {
            return (f) patchProxyResultProxy.result;
        }
        f0.p(onAction, "onAction");
        this.f82927e = onAction;
        return this;
    }

    @dl.d
    public final f f(@dl.d l<? super DialogInterface, b2> onAction) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{onAction}, this, changeQuickRedirect, false, 30927, new Class[]{l.class}, f.class);
        if (patchProxyResultProxy.isSupported) {
            return (f) patchProxyResultProxy.result;
        }
        f0.p(onAction, "onAction");
        this.f82926d = onAction;
        return this;
    }

    @dl.d
    public final f g(@dl.d l<? super DialogInterface, b2> onAction) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{onAction}, this, changeQuickRedirect, false, 30926, new Class[]{l.class}, f.class);
        if (patchProxyResultProxy.isSupported) {
            return (f) patchProxyResultProxy.result;
        }
        f0.p(onAction, "onAction");
        this.f82925c = onAction;
        return this;
    }

    public final void h(@dl.d Context context) {
        if (PatchProxy.proxy(new Object[]{context}, this, changeQuickRedirect, false, 30929, new Class[]{Context.class}, Void.TYPE).isSupported) {
            return;
        }
        f0.p(context, "context");
        try {
            Result.a aVar = Result.f124476c;
            Result.b(new com.max.hbcommon.view.a.f(context).y("要继续编辑作品吗？").i(d(context)).o("存草稿", new a()).u("去编辑", new b()).g(false).w(true).q(new c()).F());
        } catch (Throwable th2) {
            Result.a aVar2 = Result.f124476c;
            Result.b(kotlin.t0.a(th2));
        }
    }
}
