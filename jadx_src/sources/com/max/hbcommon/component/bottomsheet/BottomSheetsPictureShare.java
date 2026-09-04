package com.max.hbcommon.component.bottomsheet;

import android.content.Context;
import android.graphics.Bitmap;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import androidx.lifecycle.z;
import com.max.commentimagepainter.sharecard.GameOrderCassetteView;
import com.max.hbcommon.R;
import com.max.hbcustomview.loadingdialog.LoadingDialog;
import com.max.hbutils.utils.ViewUtils;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.PatchProxyResult;
import java.io.Serializable;
import kotlin.b2;
import kotlin.jvm.internal.f0;
import kotlin.jvm.internal.t0;
import kotlin.jvm.internal.u;
import kotlinx.coroutines.e1;
import mb.p0;

/* JADX INFO: compiled from: BottomSheetsPictureShare.kt */
/* JADX INFO: loaded from: classes9.dex */
@t0({"SMAP\nBottomSheetsPictureShare.kt\nKotlin\n*S Kotlin\n*F\n+ 1 BottomSheetsPictureShare.kt\ncom/max/hbcommon/component/bottomsheet/BottomSheetsPictureShare\n+ 2 View.kt\nandroidx/core/view/ViewKt\n*L\n1#1,165:1\n185#2,3:166\n*S KotlinDebug\n*F\n+ 1 BottomSheetsPictureShare.kt\ncom/max/hbcommon/component/bottomsheet/BottomSheetsPictureShare\n*L\n146#1:166,3\n*E\n"})
public class BottomSheetsPictureShare extends ee.a {
    public static ChangeQuickRedirect changeQuickRedirect = null;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    @dl.d
    public static final a f67231j = new a(null);

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    @dl.d
    public static final String f67232k = "ARG_PARAMS";

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    protected p0 f67233e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private BottomSheetsParams f67234f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    @dl.e
    private View f67235g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    @dl.e
    private CharSequence f67236h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    @dl.e
    private LoadingDialog f67237i;

    /* JADX INFO: compiled from: BottomSheetsPictureShare.kt */
    public static final class a {
        private a() {
        }

        public /* synthetic */ a(u uVar) {
            this();
        }
    }

    /* JADX INFO: compiled from: View.kt */
    @t0({"SMAP\nView.kt\nKotlin\n*S Kotlin\n*F\n+ 1 View.kt\nandroidx/core/view/ViewKt$postDelayed$runnable$1\n+ 2 BottomSheetsPictureShare.kt\ncom/max/hbcommon/component/bottomsheet/BottomSheetsPictureShare\n*L\n1#1,411:1\n147#2,9:412\n*E\n"})
    public static final class b implements Runnable {
        public static ChangeQuickRedirect changeQuickRedirect;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ GameOrderCassetteView f67239c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        final /* synthetic */ yh.l f67240d;

        public b(GameOrderCassetteView gameOrderCassetteView, yh.l lVar) {
            this.f67239c = gameOrderCassetteView;
            this.f67240d = lVar;
        }

        @Override // java.lang.Runnable
        public final void run() {
            if (PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, bb.c.d.Xj, new Class[0], Void.TYPE).isSupported) {
                return;
            }
            kotlinx.coroutines.k.f(z.a(BottomSheetsPictureShare.this), e1.a(), null, new BottomSheetsPictureShare$loadShareGameOrderCassetteBitmap$1$1(this.f67239c, BottomSheetsPictureShare.this, this.f67240d, null), 2, null);
        }
    }

    private final void g4() {
        if (PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, bb.c.d.Oj, new Class[0], Void.TYPE).isSupported) {
            return;
        }
        a4().f131697f.setBackground(com.max.hbutils.utils.q.E(getContext(), R.color.background_layer_2_color, ViewUtils.h0(getContext(), ViewUtils.t(getContext()))));
    }

    private final void h4() {
        if (PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, bb.c.d.Rj, new Class[0], Void.TYPE).isSupported || this.f67235g == null) {
            return;
        }
        a4().f131698g.removeAllViews();
        a4().f131698g.addView(this.f67235g, new ViewGroup.LayoutParams(-1, -2));
    }

    private final void i4() {
        if (PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, bb.c.d.Pj, new Class[0], Void.TYPE).isSupported) {
            return;
        }
        BottomSheetsParams bottomSheetsParams = this.f67234f;
        if (bottomSheetsParams == null) {
            f0.S("mParams");
            bottomSheetsParams = null;
        }
        if (!bottomSheetsParams.j()) {
            a4().f131694c.setVisibility(8);
        } else {
            a4().f131694c.setVisibility(0);
            a4().f131694c.setOnClickListener(new View.OnClickListener() { // from class: com.max.hbcommon.component.bottomsheet.r
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    BottomSheetsPictureShare.j4(this.f67289b, view);
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void j4(BottomSheetsPictureShare this$0, View view) {
        if (PatchProxy.proxy(new Object[]{this$0, view}, null, changeQuickRedirect, true, bb.c.d.Wj, new Class[]{BottomSheetsPictureShare.class, View.class}, Void.TYPE).isSupported) {
            return;
        }
        f0.p(this$0, "this$0");
        this$0.dismiss();
    }

    private final void k4() {
        if (PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, bb.c.d.Qj, new Class[0], Void.TYPE).isSupported) {
            return;
        }
        CharSequence charSequence = this.f67236h;
        if (charSequence == null || charSequence.length() == 0) {
            a4().f131696e.setVisibility(8);
        } else {
            a4().f131696e.setText(this.f67236h);
            a4().f131696e.setVisibility(0);
        }
    }

    @dl.d
    public final p0 a4() {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, bb.c.d.Jj, new Class[0], p0.class);
        if (patchProxyResultProxy.isSupported) {
            return (p0) patchProxyResultProxy.result;
        }
        p0 p0Var = this.f67233e;
        if (p0Var != null) {
            return p0Var;
        }
        f0.S("binding");
        return null;
    }

    @dl.d
    public final ImageView b4() {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, bb.c.d.Vj, new Class[0], ImageView.class);
        if (patchProxyResultProxy.isSupported) {
            return (ImageView) patchProxyResultProxy.result;
        }
        ImageView ivClose = a4().f131694c;
        f0.o(ivClose, "ivClose");
        return ivClose;
    }

    @dl.e
    public final View c4() {
        return this.f67235g;
    }

    @dl.e
    public final CharSequence d4() {
        return this.f67236h;
    }

    @dl.d
    public final GameOrderCassetteView e4() {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, bb.c.d.Tj, new Class[0], GameOrderCassetteView.class);
        if (patchProxyResultProxy.isSupported) {
            return (GameOrderCassetteView) patchProxyResultProxy.result;
        }
        GameOrderCassetteView gameOrderCassetteShare = a4().f131693b;
        f0.o(gameOrderCassetteShare, "gameOrderCassetteShare");
        return gameOrderCassetteShare;
    }

    @dl.d
    public final ImageView f4() {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, bb.c.d.Sj, new Class[0], ImageView.class);
        if (patchProxyResultProxy.isSupported) {
            return (ImageView) patchProxyResultProxy.result;
        }
        ImageView ivSharePicture = a4().f131695d;
        f0.o(ivSharePicture, "ivSharePicture");
        return ivSharePicture;
    }

    public final boolean isViewCreated() {
        return this.f67233e != null;
    }

    public final void l4() {
        if (PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, bb.c.d.Nj, new Class[0], Void.TYPE).isSupported) {
            return;
        }
        g4();
        h4();
        k4();
        i4();
    }

    /* JADX WARN: Code duplicated, block: B:15:0x0044  */
    public final void m4(boolean z10, @dl.d yh.l<? super Bitmap, b2> onLoadFinish) {
        boolean z11 = false;
        if (PatchProxy.proxy(new Object[]{new Byte(z10 ? (byte) 1 : (byte) 0), onLoadFinish}, this, changeQuickRedirect, false, bb.c.d.Uj, new Class[]{Boolean.TYPE, yh.l.class}, Void.TYPE).isSupported) {
            return;
        }
        f0.p(onLoadFinish, "onLoadFinish");
        Context context = getContext();
        if (context == null) {
            return;
        }
        LoadingDialog loadingDialog = this.f67237i;
        if (loadingDialog == null) {
            LoadingDialog loadingDialog2 = new LoadingDialog(context);
            this.f67237i = loadingDialog2;
            loadingDialog2.r();
        } else {
            if (loadingDialog != null && !loadingDialog.i()) {
                z11 = true;
            }
            if (z11) {
                LoadingDialog loadingDialog3 = new LoadingDialog(context);
                this.f67237i = loadingDialog3;
                loadingDialog3.r();
            }
        }
        GameOrderCassetteView gameOrderCassetteViewE4 = e4();
        gameOrderCassetteViewE4.l(z10);
        gameOrderCassetteViewE4.postDelayed(new b(gameOrderCassetteViewE4, onLoadFinish), 30L);
    }

    public final void n4(@dl.d p0 p0Var) {
        if (PatchProxy.proxy(new Object[]{p0Var}, this, changeQuickRedirect, false, bb.c.d.Kj, new Class[]{p0.class}, Void.TYPE).isSupported) {
            return;
        }
        f0.p(p0Var, "<set-?>");
        this.f67233e = p0Var;
    }

    public final void o4(@dl.e View view) {
        this.f67235g = view;
    }

    @Override // fe.a, androidx.fragment.app.Fragment
    @dl.e
    public View onCreateView(@dl.d LayoutInflater inflater, @dl.e ViewGroup viewGroup, @dl.e Bundle bundle) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{inflater, viewGroup, bundle}, this, changeQuickRedirect, false, bb.c.d.Lj, new Class[]{LayoutInflater.class, ViewGroup.class, Bundle.class}, View.class);
        if (patchProxyResultProxy.isSupported) {
            return (View) patchProxyResultProxy.result;
        }
        f0.p(inflater, "inflater");
        if (getArguments() != null) {
            Serializable serializable = requireArguments().getSerializable("ARG_PARAMS");
            f0.n(serializable, "null cannot be cast to non-null type com.max.hbcommon.component.bottomsheet.BottomSheetsParams");
            this.f67234f = (BottomSheetsParams) serializable;
        }
        return inflater.inflate(R.layout.layout_bottom_sheets_picture_share, viewGroup, false);
    }

    @Override // com.max.hbwidget.hbdialog.animator.AnimatorBottomDialogFragment, androidx.fragment.app.Fragment
    public void onViewCreated(@dl.d View view, @dl.e Bundle bundle) {
        if (PatchProxy.proxy(new Object[]{view, bundle}, this, changeQuickRedirect, false, bb.c.d.Mj, new Class[]{View.class, Bundle.class}, Void.TYPE).isSupported) {
            return;
        }
        f0.p(view, "view");
        super.onViewCreated(view, bundle);
        p0 p0VarA = p0.a(view);
        f0.o(p0VarA, "bind(...)");
        n4(p0VarA);
        l4();
    }

    public final void p4(@dl.e CharSequence charSequence) {
        this.f67236h = charSequence;
    }
}
