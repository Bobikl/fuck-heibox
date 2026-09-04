package com.max.xiaoheihe.utils.imageviewer.ui;

import android.app.Activity;
import android.app.Dialog;
import android.content.Context;
import android.content.ContextWrapper;
import android.os.Build;
import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.annotation.d1;
import androidx.annotation.w0;
import androidx.compose.runtime.internal.o;
import androidx.fragment.app.FragmentActivity;
import androidx.recyclerview.widget.RecyclerView;
import bb.c;
import com.heybox.imageviewer.core.Components;
import com.heybox.imageviewer.utils.TransitionStartHelper;
import com.max.hbcommon.bean.KeyDescObj;
import com.max.hbcommon.component.HeyBoxPopupMenu;
import com.max.hbcommon.network.q;
import com.max.hbpermission.PermissionManager;
import com.max.hbutils.bean.Result;
import com.max.hbutils.utils.s;
import com.max.hbutils.utils.x;
import com.max.xiaoheihe.R;
import com.max.xiaoheihe.bean.bbs.ImageOriginalInfoObj;
import com.max.xiaoheihe.utils.i0;
import com.max.xiaoheihe.utils.imageviewer.ImageViewerHelper;
import com.max.xiaoheihe.utils.imageviewer.MediaData;
import com.max.xiaoheihe.view.l;
import com.max.xiaoheihe.view.m;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.PatchProxyResult;
import com.umeng.socialize.UMShareListener;
import com.umeng.socialize.bean.SHARE_MEDIA;
import com.umeng.socialize.media.UMImage;
import dl.d;
import dl.e;
import io.reactivex.disposables.a;
import java.io.File;
import java.util.ArrayList;
import java.util.List;
import kotlin.b0;
import kotlin.b2;
import kotlin.coroutines.intrinsics.b;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.internal.Ref;
import kotlin.jvm.internal.f0;
import kotlin.jvm.internal.t0;
import kotlin.jvm.internal.u;
import kotlin.z;
import kotlinx.coroutines.CoroutineDispatcher;
import kotlinx.coroutines.e1;
import kotlinx.coroutines.i;
import kotlinx.coroutines.k;
import kotlinx.coroutines.q0;
import kotlinx.coroutines.r0;
import yh.p;

/* JADX INFO: compiled from: BaseResUICustomizer.kt */
/* JADX INFO: loaded from: classes13.dex */
@t0({"SMAP\nBaseResUICustomizer.kt\nKotlin\n*S Kotlin\n*F\n+ 1 BaseResUICustomizer.kt\ncom/max/xiaoheihe/utils/imageviewer/ui/BaseResUICustomizer\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,403:1\n1#2:404\n*E\n"})
@o(parameters = 0)
public class BaseResUICustomizer {
    public static ChangeQuickRedirect changeQuickRedirect = null;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    @dl.d
    public static final a f95543i = new a(null);

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public static final int f95544j = 8;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    @dl.d
    protected static final String f95545k = "save";

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    @dl.d
    protected static final String f95546l = "share";

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    @dl.d
    protected static final String f95547m = "delete";

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    @dl.d
    protected static final String f95548n = "parse";

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    protected static final int f95549o = 1;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    protected Context f95550a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @dl.e
    private com.heybox.imageviewer.d f95551b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private int f95552c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private int f95553d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private boolean f95554e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    @dl.d
    private final UMShareListener f95555f = new j();

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    @dl.d
    private final z f95556g = b0.c(new yh.a<io.reactivex.disposables.a>() { // from class: com.max.xiaoheihe.utils.imageviewer.ui.BaseResUICustomizer$mCompositeDisposable$2
        public static ChangeQuickRedirect changeQuickRedirect;

        @d
        public final a a() {
            PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 49270, new Class[0], a.class);
            return patchProxyResultProxy.isSupported ? (a) patchProxyResultProxy.result : new a();
        }

        /* JADX WARN: Type inference failed for: r0v3, types: [io.reactivex.disposables.a, java.lang.Object] */
        @Override // yh.a
        public /* bridge */ /* synthetic */ a invoke() {
            PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 49271, new Class[0], Object.class);
            return patchProxyResultProxy.isSupported ? patchProxyResultProxy.result : a();
        }
    });

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    @dl.d
    private final Handler f95557h = new b(Looper.getMainLooper());

    /* JADX INFO: compiled from: BaseResUICustomizer.kt */
    public static final class a {
        private a() {
        }

        public /* synthetic */ a(u uVar) {
            this();
        }
    }

    /* JADX INFO: compiled from: BaseResUICustomizer.kt */
    public static final class b extends Handler {
        public static ChangeQuickRedirect changeQuickRedirect;

        b(Looper looper) {
            super(looper);
        }

        @Override // android.os.Handler
        public void handleMessage(@dl.d Message msg) {
            if (PatchProxy.proxy(new Object[]{msg}, this, changeQuickRedirect, false, 49269, new Class[]{Message.class}, Void.TYPE).isSupported) {
                return;
            }
            f0.p(msg, "msg");
            if (msg.what == 1) {
                removeMessages(1);
                if (TransitionStartHelper.f59770a.j()) {
                    sendMessageDelayed(msg, 500L);
                    return;
                }
                com.heybox.imageviewer.d dVarX = BaseResUICustomizer.this.x();
                if (dVarX != null) {
                    dVarX.g(msg.arg1);
                }
            }
        }
    }

    /* JADX INFO: compiled from: BaseResUICustomizer.kt */
    public static final class c implements View.OnClickListener {
        public static ChangeQuickRedirect changeQuickRedirect;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ MediaData f95560c;

        c(MediaData mediaData) {
            this.f95560c = mediaData;
        }

        @Override // android.view.View.OnClickListener
        public final void onClick(View view) {
            if (PatchProxy.proxy(new Object[]{view}, this, changeQuickRedirect, false, 49272, new Class[]{View.class}, Void.TYPE).isSupported) {
                return;
            }
            BaseResUICustomizer baseResUICustomizer = BaseResUICustomizer.this;
            Activity activityP = baseResUICustomizer.p(baseResUICustomizer.q());
            if (activityP instanceof FragmentActivity) {
                BaseResUICustomizer.this.A((FragmentActivity) activityP, this.f95560c);
            }
        }
    }

    /* JADX INFO: compiled from: BaseResUICustomizer.kt */
    public static final class d implements com.max.hbpermission.c {
        public static ChangeQuickRedirect changeQuickRedirect;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ MediaData f95562b;

        d(MediaData mediaData) {
            this.f95562b = mediaData;
        }

        @Override // com.max.hbpermission.c
        public void onResult() {
            if (PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 49283, new Class[0], Void.TYPE).isSupported) {
                return;
            }
            x.e();
            x.p(BaseResUICustomizer.this.v(R.string.saving));
            if (Build.VERSION.SDK_INT > 28) {
                BaseResUICustomizer.k(BaseResUICustomizer.this, this.f95562b);
            } else {
                BaseResUICustomizer.l(BaseResUICustomizer.this, this.f95562b);
            }
        }
    }

    /* JADX INFO: compiled from: BaseResUICustomizer.kt */
    public static final class e implements com.max.hbimage.b.s {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final e f95563a = new e();
        public static ChangeQuickRedirect changeQuickRedirect;

        e() {
        }

        @Override // com.max.hbimage.b.s
        public final String getFileName(String str) {
            PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{str}, this, changeQuickRedirect, false, 49284, new Class[]{String.class}, String.class);
            return patchProxyResultProxy.isSupported ? (String) patchProxyResultProxy.result : s.d(str);
        }
    }

    /* JADX INFO: compiled from: BaseResUICustomizer.kt */
    public static final class f extends com.max.hbcommon.network.d<Boolean> {
        public static ChangeQuickRedirect changeQuickRedirect;

        f() {
        }

        public void a(boolean z10) {
            if (!PatchProxy.proxy(new Object[]{new Byte(z10 ? (byte) 1 : (byte) 0)}, this, changeQuickRedirect, false, 49286, new Class[]{Boolean.TYPE}, Void.TYPE).isSupported && BaseResUICustomizer.this.o()) {
                super.onNext(Boolean.valueOf(z10));
                x.e();
                x.p(com.max.xiaoheihe.utils.d.Z());
            }
        }

        @Override // com.max.hbcommon.network.d, io.reactivex.g0
        public void onError(@dl.d Throwable e10) {
            String str;
            if (PatchProxy.proxy(new Object[]{e10}, this, changeQuickRedirect, false, 49285, new Class[]{Throwable.class}, Void.TYPE).isSupported) {
                return;
            }
            f0.p(e10, "e");
            if (BaseResUICustomizer.this.o()) {
                super.onError(e10);
                x.e();
                StringBuilder sb2 = new StringBuilder();
                sb2.append(BaseResUICustomizer.this.v(R.string.save_fail));
                if (e10.getMessage() != null) {
                    str = '\n' + e10.getMessage();
                } else {
                    str = "";
                }
                sb2.append(str);
                x.p(sb2.toString());
            }
        }

        @Override // com.max.hbcommon.network.d, io.reactivex.g0
        public /* bridge */ /* synthetic */ void onNext(Object obj) {
            if (PatchProxy.proxy(new Object[]{obj}, this, changeQuickRedirect, false, 49287, new Class[]{Object.class}, Void.TYPE).isSupported) {
                return;
            }
            a(((Boolean) obj).booleanValue());
        }
    }

    /* JADX INFO: compiled from: BaseResUICustomizer.kt */
    public static final class g implements com.max.hbimage.b.s {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final g f95565a = new g();
        public static ChangeQuickRedirect changeQuickRedirect;

        g() {
        }

        @Override // com.max.hbimage.b.s
        public final String getFileName(String str) {
            PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{str}, this, changeQuickRedirect, false, 49288, new Class[]{String.class}, String.class);
            return patchProxyResultProxy.isSupported ? (String) patchProxyResultProxy.result : s.d(str);
        }
    }

    /* JADX INFO: compiled from: BaseResUICustomizer.kt */
    public static final class h extends com.max.hbcommon.network.d<File> {
        public static ChangeQuickRedirect changeQuickRedirect;

        h() {
        }

        @Override // com.max.hbcommon.network.d, io.reactivex.g0
        public void onError(@dl.d Throwable e10) {
            String str;
            if (PatchProxy.proxy(new Object[]{e10}, this, changeQuickRedirect, false, 49289, new Class[]{Throwable.class}, Void.TYPE).isSupported) {
                return;
            }
            f0.p(e10, "e");
            if (BaseResUICustomizer.this.o()) {
                super.onError(e10);
                x.e();
                StringBuilder sb2 = new StringBuilder();
                sb2.append(BaseResUICustomizer.this.v(R.string.save_fail));
                if (e10.getMessage() != null) {
                    str = '\n' + e10.getMessage();
                } else {
                    str = "";
                }
                sb2.append(str);
                x.p(sb2.toString());
            }
        }

        public void onNext(@dl.d File file) {
            if (PatchProxy.proxy(new Object[]{file}, this, changeQuickRedirect, false, 49290, new Class[]{File.class}, Void.TYPE).isSupported) {
                return;
            }
            f0.p(file, "file");
            if (BaseResUICustomizer.this.o()) {
                super.onNext(file);
                com.max.hbimage.b.l0(BaseResUICustomizer.this.q(), file.getAbsolutePath());
                x.e();
                x.p(com.max.xiaoheihe.utils.d.Z());
            }
        }

        @Override // com.max.hbcommon.network.d, io.reactivex.g0
        public /* bridge */ /* synthetic */ void onNext(Object obj) {
            if (PatchProxy.proxy(new Object[]{obj}, this, changeQuickRedirect, false, 49291, new Class[]{Object.class}, Void.TYPE).isSupported) {
                return;
            }
            onNext((File) obj);
        }
    }

    /* JADX INFO: compiled from: BaseResUICustomizer.kt */
    public static final class i implements HeyBoxPopupMenu.h {
        public static ChangeQuickRedirect changeQuickRedirect;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ Activity f95568b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ MediaData f95569c;

        /* JADX INFO: compiled from: BaseResUICustomizer.kt */
        public static final class a implements m {
            public static ChangeQuickRedirect changeQuickRedirect;

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            final /* synthetic */ BaseResUICustomizer f95570a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            final /* synthetic */ MediaData f95571b;

            a(BaseResUICustomizer baseResUICustomizer, MediaData mediaData) {
                this.f95570a = baseResUICustomizer;
                this.f95571b = mediaData;
            }

            @Override // com.max.xiaoheihe.view.m
            public void a(@dl.d Dialog dialog) {
                if (PatchProxy.proxy(new Object[]{dialog}, this, changeQuickRedirect, false, 49302, new Class[]{Dialog.class}, Void.TYPE).isSupported) {
                    return;
                }
                f0.p(dialog, "dialog");
                this.f95570a.z(this.f95571b);
                dialog.dismiss();
            }

            @Override // com.max.xiaoheihe.view.m
            public void b(@dl.d Dialog dialog) {
                if (PatchProxy.proxy(new Object[]{dialog}, this, changeQuickRedirect, false, 49301, new Class[]{Dialog.class}, Void.TYPE).isSupported) {
                    return;
                }
                f0.p(dialog, "dialog");
                dialog.dismiss();
            }
        }

        i(Activity activity, MediaData mediaData) {
            this.f95568b = activity;
            this.f95569c = mediaData;
        }

        @Override // com.max.hbcommon.component.HeyBoxPopupMenu.h
        public final void a(View view, KeyDescObj keyDescObj) {
            if (PatchProxy.proxy(new Object[]{view, keyDescObj}, this, changeQuickRedirect, false, 49300, new Class[]{View.class, KeyDescObj.class}, Void.TYPE).isSupported) {
                return;
            }
            if (f0.g(BaseResUICustomizer.f95545k, keyDescObj.getKey())) {
                BaseResUICustomizer.this.A((FragmentActivity) this.f95568b, this.f95569c);
                return;
            }
            if (f0.g("share", keyDescObj.getKey())) {
                BaseResUICustomizer.this.I(this.f95569c);
            } else if (f0.g("delete", keyDescObj.getKey())) {
                l.D(BaseResUICustomizer.this.q(), com.max.xiaoheihe.utils.d.n0(R.string.delete_img_confirm), "", com.max.xiaoheihe.utils.d.n0(R.string.confirm), com.max.xiaoheihe.utils.d.n0(R.string.cancel), new a(BaseResUICustomizer.this, this.f95569c));
            } else if (f0.g(BaseResUICustomizer.f95548n, keyDescObj.getKey())) {
                com.max.hbqrcode.b.d(BaseResUICustomizer.this.u(), this.f95568b, this.f95569c.f());
            }
        }
    }

    /* JADX INFO: compiled from: BaseResUICustomizer.kt */
    public static final class j implements UMShareListener {
        public static ChangeQuickRedirect changeQuickRedirect;

        j() {
        }

        @Override // com.umeng.socialize.UMShareListener
        public void onCancel(@dl.e SHARE_MEDIA share_media) {
        }

        @Override // com.umeng.socialize.UMShareListener
        public void onError(@dl.e SHARE_MEDIA share_media, @dl.d Throwable t10) {
            if (PatchProxy.proxy(new Object[]{share_media, t10}, this, changeQuickRedirect, false, 49304, new Class[]{SHARE_MEDIA.class, Throwable.class}, Void.TYPE).isSupported) {
                return;
            }
            f0.p(t10, "t");
            com.max.hbutils.utils.c.f(BaseResUICustomizer.this.q().getString(R.string.share_fail));
        }

        @Override // com.umeng.socialize.UMShareListener
        public void onResult(@dl.e SHARE_MEDIA share_media) {
            if (PatchProxy.proxy(new Object[]{share_media}, this, changeQuickRedirect, false, 49303, new Class[]{SHARE_MEDIA.class}, Void.TYPE).isSupported) {
                return;
            }
            com.max.hbutils.utils.c.f(BaseResUICustomizer.this.q().getString(R.string.share_success));
        }

        @Override // com.umeng.socialize.UMShareListener
        public void onStart(@dl.e SHARE_MEDIA share_media) {
        }
    }

    @w0(29)
    private final void B(MediaData mediaData) {
        if (PatchProxy.proxy(new Object[]{mediaData}, this, changeQuickRedirect, false, 49256, new Class[]{MediaData.class}, Void.TYPE).isSupported) {
            return;
        }
        com.max.heybox.hblog.g.f74531b.M("saveImgAfter28 " + mediaData.D());
        m((io.reactivex.disposables.b) com.max.hbimage.b.j(e.f95563a, mediaData.D()).I5(io.reactivex.schedulers.b.d()).a4(io.reactivex.android.schedulers.a.c()).J5(new f()));
    }

    private final void C(MediaData mediaData) {
        if (PatchProxy.proxy(new Object[]{mediaData}, this, changeQuickRedirect, false, 49257, new Class[]{MediaData.class}, Void.TYPE).isSupported) {
            return;
        }
        m((io.reactivex.disposables.b) com.max.hbimage.b.i(com.max.xiaoheihe.utils.d.T(), g.f95565a, mediaData.D()).I5(io.reactivex.schedulers.b.d()).a4(io.reactivex.android.schedulers.a.c()).J5(new h()));
    }

    public static final /* synthetic */ void k(BaseResUICustomizer baseResUICustomizer, MediaData mediaData) {
        if (PatchProxy.proxy(new Object[]{baseResUICustomizer, mediaData}, null, changeQuickRedirect, true, 49267, new Class[]{BaseResUICustomizer.class, MediaData.class}, Void.TYPE).isSupported) {
            return;
        }
        baseResUICustomizer.B(mediaData);
    }

    public static final /* synthetic */ void l(BaseResUICustomizer baseResUICustomizer, MediaData mediaData) {
        if (PatchProxy.proxy(new Object[]{baseResUICustomizer, mediaData}, null, changeQuickRedirect, true, 49268, new Class[]{BaseResUICustomizer.class, MediaData.class}, Void.TYPE).isSupported) {
            return;
        }
        baseResUICustomizer.C(mediaData);
    }

    public final void A(@dl.d FragmentActivity activity, @dl.d MediaData mediaData) {
        if (PatchProxy.proxy(new Object[]{activity, mediaData}, this, changeQuickRedirect, false, 49258, new Class[]{FragmentActivity.class, MediaData.class}, Void.TYPE).isSupported) {
            return;
        }
        f0.p(activity, "activity");
        f0.p(mediaData, "mediaData");
        PermissionManager.f71603a.T(activity, new d(mediaData));
    }

    public final void D(boolean z10) {
        this.f95554e = z10;
    }

    public final void E(@dl.d Context context) {
        if (PatchProxy.proxy(new Object[]{context}, this, changeQuickRedirect, false, 49253, new Class[]{Context.class}, Void.TYPE).isSupported) {
            return;
        }
        f0.p(context, "<set-?>");
        this.f95550a = context;
    }

    public final void F(int i10) {
        this.f95552c = i10;
    }

    public final void G(int i10) {
        this.f95553d = i10;
    }

    public final void H(@dl.e com.heybox.imageviewer.d dVar) {
        this.f95551b = dVar;
    }

    /* JADX WARN: Type inference failed for: r1v1, types: [T, com.umeng.socialize.media.UMImage] */
    public void I(@dl.d MediaData mediaData) {
        if (PatchProxy.proxy(new Object[]{mediaData}, this, changeQuickRedirect, false, 49260, new Class[]{MediaData.class}, Void.TYPE).isSupported) {
            return;
        }
        f0.p(mediaData, "mediaData");
        Ref.ObjectRef objectRef = new Ref.ObjectRef();
        objectRef.f124891b = new UMImage(q(), mediaData.D());
        k.f(r0.a(e1.c()), null, null, new BaseResUICustomizer$shareImg$1(mediaData, objectRef, this, null), 3, null);
    }

    public final void J(@dl.d MediaData mediaData) {
        if (PatchProxy.proxy(new Object[]{mediaData}, this, changeQuickRedirect, false, 49261, new Class[]{MediaData.class}, Void.TYPE).isSupported) {
            return;
        }
        f0.p(mediaData, "mediaData");
        if (this.f95554e) {
            if (mediaData.D().length() == 0) {
                return;
            }
            String strY = mediaData.y();
            ArrayList arrayList = new ArrayList();
            KeyDescObj keyDescObj = new KeyDescObj();
            keyDescObj.setKey(f95545k);
            keyDescObj.setDesc(q().getString(R.string.save));
            arrayList.add(keyDescObj);
            KeyDescObj keyDescObj2 = new KeyDescObj();
            keyDescObj2.setKey("share");
            keyDescObj2.setDesc(q().getString(R.string.share));
            arrayList.add(keyDescObj2);
            if (!com.max.hbcommon.utils.c.u(strY) && f0.g("1", i0.o().getPermission().getBbs_basic_permission())) {
                KeyDescObj keyDescObj3 = new KeyDescObj();
                keyDescObj3.setKey("delete");
                keyDescObj3.setDesc(q().getString(R.string.delete));
                arrayList.add(keyDescObj3);
            }
            if (!com.max.hbcommon.utils.c.u(mediaData.f())) {
                KeyDescObj keyDescObj4 = new KeyDescObj();
                keyDescObj4.setKey(f95548n);
                keyDescObj4.setDesc("识别二维码");
                arrayList.add(keyDescObj4);
            }
            Activity activityP = p(q());
            if (activityP instanceof FragmentActivity) {
                HeyBoxPopupMenu heyBoxPopupMenu = new HeyBoxPopupMenu(q(), arrayList, false);
                heyBoxPopupMenu.R(new i(activityP, mediaData));
                heyBoxPopupMenu.show();
            }
        }
    }

    /* JADX WARN: Code duplicated, block: B:15:0x0043  */
    /* JADX WARN: Code duplicated, block: B:25:0x0058  */
    public final void K(@dl.d final MediaData mediaData, @dl.e final TextView textView) {
        boolean z10;
        boolean z11;
        if (PatchProxy.proxy(new Object[]{mediaData, textView}, this, changeQuickRedirect, false, 49263, new Class[]{MediaData.class, TextView.class}, Void.TYPE).isSupported) {
            return;
        }
        f0.p(mediaData, "mediaData");
        if (!mediaData.j()) {
            String strG = mediaData.g();
            if (strG == null) {
                z10 = false;
            } else {
                if (strG.length() > 0) {
                    z10 = true;
                } else {
                    z10 = false;
                }
            }
            if (z10) {
                String strE = mediaData.e();
                if (strE != null) {
                    z11 = strE.length() > 0;
                }
                if (z11) {
                    if (textView != null) {
                        textView.setText("查看原图（" + mediaData.e() + (char) 65289);
                    }
                } else if (textView != null) {
                    textView.setText("查看原图");
                }
                if (textView != null) {
                    textView.setOnClickListener(new View.OnClickListener() { // from class: com.max.xiaoheihe.utils.imageviewer.ui.BaseResUICustomizer$updateOriginalImageState$1
                        public static ChangeQuickRedirect changeQuickRedirect;

                        /* JADX INFO: renamed from: com.max.xiaoheihe.utils.imageviewer.ui.BaseResUICustomizer$updateOriginalImageState$1$1, reason: invalid class name */
                        /* JADX INFO: compiled from: BaseResUICustomizer.kt */
                        @kotlin.coroutines.jvm.internal.d(c = "com.max.xiaoheihe.utils.imageviewer.ui.BaseResUICustomizer$updateOriginalImageState$1$1", f = "BaseResUICustomizer.kt", i = {}, l = {c.b.f30625f4}, m = "invokeSuspend", n = {}, s = {})
                        public static final class AnonymousClass1 extends SuspendLambda implements p<q0, kotlin.coroutines.c<? super b2>, Object> {
                            public static ChangeQuickRedirect changeQuickRedirect;

                            /* JADX INFO: renamed from: b, reason: collision with root package name */
                            Object f95597b;

                            /* JADX INFO: renamed from: c, reason: collision with root package name */
                            int f95598c;

                            /* JADX INFO: renamed from: d, reason: collision with root package name */
                            final /* synthetic */ MediaData f95599d;

                            /* JADX INFO: renamed from: e, reason: collision with root package name */
                            final /* synthetic */ BaseResUICustomizer f95600e;

                            /* JADX INFO: renamed from: f, reason: collision with root package name */
                            final /* synthetic */ TextView f95601f;

                            /* JADX INFO: renamed from: com.max.xiaoheihe.utils.imageviewer.ui.BaseResUICustomizer$updateOriginalImageState$1$1$1, reason: invalid class name and collision with other inner class name */
                            /* JADX INFO: compiled from: BaseResUICustomizer.kt */
                            @kotlin.coroutines.jvm.internal.d(c = "com.max.xiaoheihe.utils.imageviewer.ui.BaseResUICustomizer$updateOriginalImageState$1$1$1", f = "BaseResUICustomizer.kt", i = {}, l = {c.b.f30648g4}, m = "invokeSuspend", n = {}, s = {})
                            public static final class C09061 extends SuspendLambda implements p<q0, kotlin.coroutines.c<? super Boolean>, Object> {
                                public static ChangeQuickRedirect changeQuickRedirect;

                                /* JADX INFO: renamed from: b, reason: collision with root package name */
                                int f95602b;

                                /* JADX INFO: renamed from: c, reason: collision with root package name */
                                final /* synthetic */ BaseResUICustomizer f95603c;

                                /* JADX INFO: renamed from: d, reason: collision with root package name */
                                final /* synthetic */ MediaData f95604d;

                                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                C09061(BaseResUICustomizer baseResUICustomizer, MediaData mediaData, kotlin.coroutines.c<? super C09061> cVar) {
                                    super(2, cVar);
                                    this.f95603c = baseResUICustomizer;
                                    this.f95604d = mediaData;
                                }

                                @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                                @d
                                public final kotlin.coroutines.c<b2> create(@e Object obj, @d kotlin.coroutines.c<?> cVar) {
                                    PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{obj, cVar}, this, changeQuickRedirect, false, 49311, new Class[]{Object.class, kotlin.coroutines.c.class}, kotlin.coroutines.c.class);
                                    return patchProxyResultProxy.isSupported ? (kotlin.coroutines.c) patchProxyResultProxy.result : new C09061(this.f95603c, this.f95604d, cVar);
                                }

                                @Override // yh.p
                                public /* bridge */ /* synthetic */ Object invoke(q0 q0Var, kotlin.coroutines.c<? super Boolean> cVar) {
                                    PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{q0Var, cVar}, this, changeQuickRedirect, false, 49313, new Class[]{Object.class, Object.class}, Object.class);
                                    return patchProxyResultProxy.isSupported ? patchProxyResultProxy.result : invoke2(q0Var, cVar);
                                }

                                @e
                                /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
                                public final Object invoke2(@d q0 q0Var, @e kotlin.coroutines.c<? super Boolean> cVar) {
                                    PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{q0Var, cVar}, this, changeQuickRedirect, false, 49312, new Class[]{q0.class, kotlin.coroutines.c.class}, Object.class);
                                    return patchProxyResultProxy.isSupported ? patchProxyResultProxy.result : ((C09061) create(q0Var, cVar)).invokeSuspend(b2.f124493a);
                                }

                                @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                                @e
                                public final Object invokeSuspend(@d Object obj) throws Throwable {
                                    PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{obj}, this, changeQuickRedirect, false, 49310, new Class[]{Object.class}, Object.class);
                                    if (patchProxyResultProxy.isSupported) {
                                        return patchProxyResultProxy.result;
                                    }
                                    Object objH = b.h();
                                    int i10 = this.f95602b;
                                    if (i10 == 0) {
                                        kotlin.t0.n(obj);
                                        ImageViewerHelper.Companion companion = ImageViewerHelper.f95500a;
                                        Context contextQ = this.f95603c.q();
                                        String strD = this.f95604d.D();
                                        this.f95602b = 1;
                                        obj = companion.c(contextQ, strD, this);
                                        if (obj == objH) {
                                            return objH;
                                        }
                                    } else {
                                        if (i10 != 1) {
                                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                                        }
                                        kotlin.t0.n(obj);
                                    }
                                    return obj;
                                }
                            }

                            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                            AnonymousClass1(MediaData mediaData, BaseResUICustomizer baseResUICustomizer, TextView textView, kotlin.coroutines.c<? super AnonymousClass1> cVar) {
                                super(2, cVar);
                                this.f95599d = mediaData;
                                this.f95600e = baseResUICustomizer;
                                this.f95601f = textView;
                            }

                            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                            @d
                            public final kotlin.coroutines.c<b2> create(@e Object obj, @d kotlin.coroutines.c<?> cVar) {
                                PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{obj, cVar}, this, changeQuickRedirect, false, 49307, new Class[]{Object.class, kotlin.coroutines.c.class}, kotlin.coroutines.c.class);
                                return patchProxyResultProxy.isSupported ? (kotlin.coroutines.c) patchProxyResultProxy.result : new AnonymousClass1(this.f95599d, this.f95600e, this.f95601f, cVar);
                            }

                            @Override // yh.p
                            public /* bridge */ /* synthetic */ Object invoke(q0 q0Var, kotlin.coroutines.c<? super b2> cVar) {
                                PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{q0Var, cVar}, this, changeQuickRedirect, false, 49309, new Class[]{Object.class, Object.class}, Object.class);
                                return patchProxyResultProxy.isSupported ? patchProxyResultProxy.result : invoke2(q0Var, cVar);
                            }

                            @e
                            /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
                            public final Object invoke2(@d q0 q0Var, @e kotlin.coroutines.c<? super b2> cVar) {
                                PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{q0Var, cVar}, this, changeQuickRedirect, false, 49308, new Class[]{q0.class, kotlin.coroutines.c.class}, Object.class);
                                return patchProxyResultProxy.isSupported ? patchProxyResultProxy.result : ((AnonymousClass1) create(q0Var, cVar)).invokeSuspend(b2.f124493a);
                            }

                            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                            @e
                            public final Object invokeSuspend(@d Object obj) throws Throwable {
                                MediaData mediaData;
                                PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{obj}, this, changeQuickRedirect, false, 49306, new Class[]{Object.class}, Object.class);
                                if (patchProxyResultProxy.isSupported) {
                                    return patchProxyResultProxy.result;
                                }
                                Object objH = b.h();
                                int i10 = this.f95598c;
                                if (i10 == 0) {
                                    kotlin.t0.n(obj);
                                    MediaData mediaData2 = this.f95599d;
                                    CoroutineDispatcher coroutineDispatcherC = e1.c();
                                    C09061 c09061 = new C09061(this.f95600e, this.f95599d, null);
                                    this.f95597b = mediaData2;
                                    this.f95598c = 1;
                                    Object objH2 = i.h(coroutineDispatcherC, c09061, this);
                                    if (objH2 == objH) {
                                        return objH;
                                    }
                                    mediaData = mediaData2;
                                    obj = objH2;
                                } else {
                                    if (i10 != 1) {
                                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                                    }
                                    mediaData = (MediaData) this.f95597b;
                                    kotlin.t0.n(obj);
                                }
                                mediaData.F(((Boolean) obj).booleanValue());
                                this.f95599d.G(false);
                                MediaData mediaData3 = this.f95599d;
                                String strG = mediaData3.g();
                                f0.m(strG);
                                mediaData3.H(strG);
                                this.f95599d.a(true);
                                com.heybox.imageviewer.d dVarX = this.f95600e.x();
                                if (dVarX != null) {
                                    dVarX.g((int) this.f95599d.A());
                                }
                                TextView textView = this.f95601f;
                                if (textView != null) {
                                    textView.setVisibility(8);
                                }
                                return b2.f124493a;
                            }
                        }

                        @Override // android.view.View.OnClickListener
                        public final void onClick(View view) {
                            if (PatchProxy.proxy(new Object[]{view}, this, changeQuickRedirect, false, 49305, new Class[]{View.class}, Void.TYPE).isSupported) {
                                return;
                            }
                            k.f(r0.a(e1.e()), null, null, new AnonymousClass1(mediaData, this, textView, null), 3, null);
                        }
                    });
                }
                if (textView == null) {
                    return;
                }
                textView.setVisibility(0);
                return;
            }
        }
        if (textView == null) {
            return;
        }
        textView.setVisibility(8);
    }

    public final void m(@dl.e io.reactivex.disposables.b bVar) {
        if (PatchProxy.proxy(new Object[]{bVar}, this, changeQuickRedirect, false, 49264, new Class[]{io.reactivex.disposables.b.class}, Void.TYPE).isSupported || bVar == null) {
            return;
        }
        u().c(bVar);
    }

    public final void n() {
        if (PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 49265, new Class[0], Void.TYPE).isSupported) {
            return;
        }
        u().f();
    }

    public final boolean o() {
        return this.f95554e;
    }

    @dl.e
    public final Activity p(@dl.e Context context) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{context}, this, changeQuickRedirect, false, 49266, new Class[]{Context.class}, Activity.class);
        if (patchProxyResultProxy.isSupported) {
            return (Activity) patchProxyResultProxy.result;
        }
        if (context == null) {
            return null;
        }
        if (context instanceof Activity) {
            return (Activity) context;
        }
        if (context instanceof ContextWrapper) {
            return p(((ContextWrapper) context).getBaseContext());
        }
        return null;
    }

    @dl.d
    public final Context q() {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 49252, new Class[0], Context.class);
        if (patchProxyResultProxy.isSupported) {
            return (Context) patchProxyResultProxy.result;
        }
        Context context = this.f95550a;
        if (context != null) {
            return context;
        }
        f0.S(com.umeng.analytics.pro.d.R);
        return null;
    }

    public final int r() {
        return this.f95552c;
    }

    @dl.d
    public final Handler s() {
        return this.f95557h;
    }

    public final int t() {
        return this.f95553d;
    }

    @dl.d
    public final io.reactivex.disposables.a u() {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 49254, new Class[0], io.reactivex.disposables.a.class);
        return patchProxyResultProxy.isSupported ? (io.reactivex.disposables.a) patchProxyResultProxy.result : (io.reactivex.disposables.a) this.f95556g.getValue();
    }

    @dl.d
    public final String v(@d1 int i10) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{new Integer(i10)}, this, changeQuickRedirect, false, 49255, new Class[]{Integer.TYPE}, String.class);
        if (patchProxyResultProxy.isSupported) {
            return (String) patchProxyResultProxy.result;
        }
        String string = q().getString(i10);
        f0.o(string, "context.getString(id)");
        return string;
    }

    @dl.d
    public final UMShareListener w() {
        return this.f95555f;
    }

    @dl.e
    public final com.heybox.imageviewer.d x() {
        return this.f95551b;
    }

    public final void y(final int i10, @dl.d RecyclerView.ViewHolder viewHolder, @dl.e TextView textView, @dl.e final TextView textView2, @dl.e ImageView imageView) {
        boolean z10 = false;
        if (PatchProxy.proxy(new Object[]{new Integer(i10), viewHolder, textView, textView2, imageView}, this, changeQuickRedirect, false, 49262, new Class[]{Integer.TYPE, RecyclerView.ViewHolder.class, TextView.class, TextView.class, ImageView.class}, Void.TYPE).isSupported) {
            return;
        }
        f0.p(viewHolder, "viewHolder");
        this.f95552c = i10;
        List<com.heybox.imageviewer.core.d> listB = Components.f59730a.e().b();
        this.f95553d = listB.size();
        if (textView != null) {
            textView.setText((i10 + 1) + " / " + this.f95553d);
        }
        if (i10 >= 0 && i10 < this.f95553d) {
            com.heybox.imageviewer.core.d dVar = listB.get(i10);
            f0.n(dVar, "null cannot be cast to non-null type com.max.xiaoheihe.utils.imageviewer.MediaData");
            final MediaData mediaData = (MediaData) dVar;
            if (imageView != null) {
                imageView.setOnClickListener(new c(mediaData));
            }
            if (!mediaData.j()) {
                String strG = mediaData.g();
                if (strG != null) {
                    if (strG.length() > 0) {
                        z10 = true;
                    }
                }
                if (!z10) {
                    m((io.reactivex.disposables.b) com.max.xiaoheihe.network.i.a().g8(mediaData.D()).I5(io.reactivex.schedulers.b.d()).a4(io.reactivex.android.schedulers.a.c()).J5(new com.max.hbcommon.network.d<Result<ImageOriginalInfoObj>>() { // from class: com.max.xiaoheihe.utils.imageviewer.ui.BaseResUICustomizer$onPageSelected$2
                        public static ChangeQuickRedirect changeQuickRedirect;

                        public void onNext(@d Result<ImageOriginalInfoObj> result) {
                            if (PatchProxy.proxy(new Object[]{result}, this, changeQuickRedirect, false, 49273, new Class[]{Result.class}, Void.TYPE).isSupported) {
                                return;
                            }
                            f0.p(result, "result");
                            if (result.getResult() != null) {
                                MediaData mediaData2 = mediaData;
                                ImageOriginalInfoObj result2 = result.getResult();
                                mediaData2.b(result2 != null ? result2.getImgs() : null);
                                MediaData mediaData3 = mediaData;
                                ImageOriginalInfoObj result3 = result.getResult();
                                mediaData3.c(result3 != null ? result3.getFsize() : null);
                                k.f(r0.a(e1.e()), null, null, new BaseResUICustomizer$onPageSelected$2$onNext$1(mediaData, i10, this, textView2, null), 3, null);
                            }
                        }

                        @Override // com.max.hbcommon.network.d, io.reactivex.g0
                        public /* bridge */ /* synthetic */ void onNext(Object obj) {
                            if (PatchProxy.proxy(new Object[]{obj}, this, changeQuickRedirect, false, 49274, new Class[]{Object.class}, Void.TYPE).isSupported) {
                                return;
                            }
                            onNext((Result<ImageOriginalInfoObj>) obj);
                        }
                    }));
                }
            }
            K(mediaData, textView2);
        }
    }

    public final void z(@dl.d MediaData mediaData) {
        if (PatchProxy.proxy(new Object[]{mediaData}, this, changeQuickRedirect, false, 49259, new Class[]{MediaData.class}, Void.TYPE).isSupported) {
            return;
        }
        f0.p(mediaData, "mediaData");
        m((io.reactivex.disposables.b) com.max.xiaoheihe.network.i.a().s5(mediaData.y(), mediaData.D()).I5(io.reactivex.schedulers.b.d()).a4(io.reactivex.android.schedulers.a.c()).J5(new q()));
    }
}
