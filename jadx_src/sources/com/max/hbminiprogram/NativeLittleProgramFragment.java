package com.max.hbminiprogram;

import android.content.Context;
import android.view.MotionEvent;
import android.view.View;
import android.widget.ImageView;
import androidx.core.view.n3;
import androidx.fragment.app.Fragment;
import com.max.hbcommon.component.TitleBar;
import com.max.hbminiprogram.bean.MiniProgramMenuInfoObj;
import com.max.hbminiprogram.fragment.BaseLittleProgramFragment;
import com.max.hbshare.bean.HBShareProtocolData;
import com.max.hbutils.utils.SystemWindowInsetExtensionsKt;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.PatchProxyResult;
import com.umeng.socialize.UMShareListener;
import com.umeng.socialize.bean.SHARE_MEDIA;
import com.umeng.socialize.media.UMImage;
import java.util.Map;
import kotlin.b2;
import kotlin.jvm.internal.Ref;
import kotlin.jvm.internal.f0;
import kotlin.jvm.internal.u;

/* JADX INFO: compiled from: NativeLittleProgramFragment.kt */
/* JADX INFO: loaded from: classes11.dex */
public abstract class NativeLittleProgramFragment extends BaseLittleProgramFragment implements com.max.hbminiprogram.d {
    public static ChangeQuickRedirect changeQuickRedirect = null;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    @dl.d
    public static final a f71046n = new a(null);

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    @dl.d
    public static final String f71047o = "mini_program_id";

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    @dl.d
    private final UMShareListener f71048m = new c();

    /* JADX INFO: compiled from: NativeLittleProgramFragment.kt */
    public static final class a {
        private a() {
        }

        public /* synthetic */ a(u uVar) {
            this();
        }
    }

    /* JADX INFO: compiled from: NativeLittleProgramFragment.kt */
    public static final class b extends com.max.hbshare.c.b {
        b(String str, UMShareListener uMShareListener) {
            super(str, uMShareListener);
        }
    }

    /* JADX INFO: compiled from: NativeLittleProgramFragment.kt */
    public static final class c implements UMShareListener {
        public static ChangeQuickRedirect changeQuickRedirect;

        c() {
        }

        @Override // com.umeng.socialize.UMShareListener
        public void onCancel(@dl.e SHARE_MEDIA share_media) {
        }

        @Override // com.umeng.socialize.UMShareListener
        public void onError(@dl.e SHARE_MEDIA share_media, @dl.e Throwable th2) {
            if (PatchProxy.proxy(new Object[]{share_media, th2}, this, changeQuickRedirect, false, bb.c.h.f33249e, new Class[]{SHARE_MEDIA.class, Throwable.class}, Void.TYPE).isSupported) {
                return;
            }
            com.max.hbutils.utils.c.f(NativeLittleProgramFragment.this.getString(R.string.share_fail));
        }

        @Override // com.umeng.socialize.UMShareListener
        public void onResult(@dl.e SHARE_MEDIA share_media) {
            if (PatchProxy.proxy(new Object[]{share_media}, this, changeQuickRedirect, false, bb.c.h.f33247d, new Class[]{SHARE_MEDIA.class}, Void.TYPE).isSupported) {
                return;
            }
            com.max.hbutils.utils.c.f(NativeLittleProgramFragment.this.getString(R.string.share_success));
            com.max.hbcommon.base.f baseView = NativeLittleProgramFragment.this.getBaseView();
            HBShareProtocolData hBShareProtocolDataW3 = NativeLittleProgramFragment.this.W3();
            String src = hBShareProtocolDataW3 != null ? hBShareProtocolDataW3.getSrc() : null;
            HBShareProtocolData hBShareProtocolDataW4 = NativeLittleProgramFragment.this.W3();
            String mini_program_share = hBShareProtocolDataW4 != null ? hBShareProtocolDataW4.getMini_program_share() : null;
            String strY3 = NativeLittleProgramFragment.this.Y3(share_media);
            HBShareProtocolData hBShareProtocolDataW5 = NativeLittleProgramFragment.this.W3();
            com.max.hbshare.d.F(baseView, src, mini_program_share, strY3, hBShareProtocolDataW5 != null ? hBShareProtocolDataW5.getAct_id() : null);
        }

        @Override // com.umeng.socialize.UMShareListener
        public void onStart(@dl.e SHARE_MEDIA share_media) {
        }
    }

    /* JADX INFO: compiled from: NativeLittleProgramFragment.kt */
    public static final class d extends com.max.hbshare.c.b {
        d(String str, UMShareListener uMShareListener) {
            super(str, uMShareListener);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean B4(View view, MotionEvent motionEvent) {
        return true;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void C4(NativeLittleProgramFragment this$0, View view) {
        if (PatchProxy.proxy(new Object[]{this$0, view}, null, changeQuickRedirect, true, bb.c.h.f33243b, new Class[]{NativeLittleProgramFragment.class, View.class}, Void.TYPE).isSupported) {
            return;
        }
        f0.p(this$0, "this$0");
        this$0.mContext.onBackPressed();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void E4(NativeLittleProgramFragment this$0, MiniProgramMenuInfoObj miniProgramMenuInfoObj) {
        if (PatchProxy.proxy(new Object[]{this$0, miniProgramMenuInfoObj}, null, changeQuickRedirect, true, bb.c.h.f33245c, new Class[]{NativeLittleProgramFragment.class, MiniProgramMenuInfoObj.class}, Void.TYPE).isSupported) {
            return;
        }
        f0.p(this$0, "this$0");
        Context context = this$0.getContext();
        if (context != null) {
            if (this$0.W3() != null) {
                this$0.G4(miniProgramMenuInfoObj);
                return;
            }
            String strQ3 = this$0.Q3();
            HBShareProtocolData hBShareProtocolDataY4 = this$0.y4();
            HBShareProtocolData hBShareProtocolDataY5 = this$0.y4();
            this$0.F4(context, strQ3, hBShareProtocolDataY4, miniProgramMenuInfoObj, new b(hBShareProtocolDataY5 != null ? hBShareProtocolDataY5.getSrc() : null, this$0.f71048m));
        }
    }

    public void A4() {
        if (PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, bb.c.g.Ki, new Class[0], Void.TYPE).isSupported) {
            return;
        }
        com.max.heybox.hblog.g.f74531b.q("NativeLittleProgramFragment(" + getClass().getSimpleName() + "), initParams, arguments = " + getArguments());
    }

    public final boolean D4() {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, bb.c.g.Mi, new Class[0], Boolean.TYPE);
        return patchProxyResultProxy.isSupported ? ((Boolean) patchProxyResultProxy.result).booleanValue() : getContext() instanceof f;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void F4(@dl.d final Context context, @dl.e final String str, @dl.e final HBShareProtocolData hBShareProtocolData, @dl.e final MiniProgramMenuInfoObj miniProgramMenuInfoObj, @dl.d final UMShareListener shareListener) {
        if (PatchProxy.proxy(new Object[]{context, str, hBShareProtocolData, miniProgramMenuInfoObj, shareListener}, this, changeQuickRedirect, false, bb.c.h.f33241a, new Class[]{Context.class, String.class, HBShareProtocolData.class, MiniProgramMenuInfoObj.class, UMShareListener.class}, Void.TYPE).isSupported) {
            return;
        }
        f0.p(context, "context");
        f0.p(shareListener, "shareListener");
        final Ref.ObjectRef objectRef = new Ref.ObjectRef();
        yh.a<b2> aVar = new yh.a<b2>() { // from class: com.max.hbminiprogram.NativeLittleProgramFragment$showLittleProgramDialog$showLittleProgramDialog$1
            public static ChangeQuickRedirect changeQuickRedirect;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(0);
            }

            /* JADX WARN: Type inference failed for: r0v3, types: [java.lang.Object, kotlin.b2] */
            @Override // yh.a
            public /* bridge */ /* synthetic */ b2 invoke() {
                PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, bb.c.h.f33253g, new Class[0], Object.class);
                if (patchProxyResultProxy.isSupported) {
                    return patchProxyResultProxy.result;
                }
                invoke2();
                return b2.f124493a;
            }

            /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
            public final void invoke2() {
                if (PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, bb.c.h.f33251f, new Class[0], Void.TYPE).isSupported) {
                    return;
                }
                Context context2 = context;
                String str2 = str;
                MiniProgramMenuInfoObj miniProgramMenuInfoObj2 = miniProgramMenuInfoObj;
                HBShareProtocolData hBShareProtocolData2 = hBShareProtocolData;
                com.max.hbminiprogram.utils.b.h(context2, str2, miniProgramMenuInfoObj2, hBShareProtocolData2 != null, hBShareProtocolData2, objectRef.f124891b, shareListener);
            }
        };
        if (hBShareProtocolData != null) {
            String img_url = hBShareProtocolData.getImg_url();
            objectRef.f124891b = !com.max.hbcommon.utils.c.u(img_url) ? new UMImage(context, img_url) : new UMImage(context, R.drawable.share_thumbnail);
        }
        aVar.invoke();
    }

    public final void G4(@dl.e MiniProgramMenuInfoObj miniProgramMenuInfoObj) {
        HBShareProtocolData hBShareProtocolDataW3;
        if (PatchProxy.proxy(new Object[]{miniProgramMenuInfoObj}, this, changeQuickRedirect, false, bb.c.g.Qi, new Class[]{MiniProgramMenuInfoObj.class}, Void.TYPE).isSupported || (hBShareProtocolDataW3 = W3()) == null) {
            return;
        }
        com.max.hbminiprogram.utils.b.h(this.mContext, Q3(), miniProgramMenuInfoObj, true, hBShareProtocolDataW3, !com.max.hbcommon.utils.c.u(hBShareProtocolDataW3.getImg_url()) ? new UMImage(this.mContext, hBShareProtocolDataW3.getImg_url()) : new UMImage(this.mContext, R.drawable.share_thumbnail), new d(hBShareProtocolDataW3.getSrc(), this.f71048m));
    }

    public boolean H4() {
        return true;
    }

    @Override // com.max.hbminiprogram.k
    public boolean I0() {
        return false;
    }

    @Override // com.max.hbminiprogram.d
    @dl.e
    public Fragment a2(@dl.e Map<String, ? extends Object> map) {
        return null;
    }

    @Override // com.max.hbminiprogram.fragment.BaseLittleProgramFragment
    public void a4(@dl.e View view, boolean z10) {
        ImageView appbarNavButtonView;
        if (PatchProxy.proxy(new Object[]{view, new Byte(z10 ? (byte) 1 : (byte) 0)}, this, changeQuickRedirect, false, bb.c.g.Li, new Class[]{View.class, Boolean.TYPE}, Void.TYPE).isSupported) {
            return;
        }
        super.a4(view, z10);
        if ((d4() || Z3()) && view != null) {
            view.setOnTouchListener(new View.OnTouchListener() { // from class: com.max.hbminiprogram.m
                @Override // android.view.View.OnTouchListener
                public final boolean onTouch(View view2, MotionEvent motionEvent) {
                    return NativeLittleProgramFragment.B4(view2, motionEvent);
                }
            });
            boolean zX4 = x4();
            boolean zW4 = w4();
            if (zW4 || zX4) {
                SystemWindowInsetExtensionsKt.c(view, n3.m.i(), false, zX4, false, zW4, false, false, false, false, bb.c.b.f31012w6, null);
            }
            view.setBackgroundColor(getResources().getColor(R.color.background_layer_2_color, null));
            if (H4()) {
                this.mTitleBarDivider.setVisibility(0);
                TitleBar titleBar = this.mTitleBar;
                if (titleBar == null || (appbarNavButtonView = titleBar.getAppbarNavButtonView()) == null) {
                    return;
                }
                appbarNavButtonView.setOnClickListener(new View.OnClickListener() { // from class: com.max.hbminiprogram.n
                    @Override // android.view.View.OnClickListener
                    public final void onClick(View view2) {
                        NativeLittleProgramFragment.C4(this.f71301b, view2);
                    }
                });
            }
        }
    }

    @Override // com.max.hbminiprogram.fragment.BaseLittleProgramFragment
    public boolean e4() {
        return true;
    }

    @Override // com.max.hbminiprogram.fragment.BaseLittleProgramFragment
    public void g4() {
        if (PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, bb.c.g.Pi, new Class[0], Void.TYPE).isSupported) {
            return;
        }
        T3(new com.max.hbminiprogram.c() { // from class: com.max.hbminiprogram.l
            @Override // com.max.hbminiprogram.c
            public final void a(MiniProgramMenuInfoObj miniProgramMenuInfoObj) {
                NativeLittleProgramFragment.E4(this.f71300a, miniProgramMenuInfoObj);
            }
        });
    }

    @Override // com.max.hbcommon.base.d
    public void initBaseData() {
        if (PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, bb.c.g.Ji, new Class[0], Void.TYPE).isSupported) {
            return;
        }
        super.initBaseData();
        A4();
    }

    @Override // com.max.hbminiprogram.fragment.BaseLittleProgramFragment, com.max.hbcommon.base.d, androidx.fragment.app.Fragment
    public void onStart() {
        if (PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, bb.c.g.Ni, new Class[0], Void.TYPE).isSupported) {
            return;
        }
        super.onStart();
        if (w4()) {
            return;
        }
        this.mContext.getWindow().setNavigationBarColor(0);
    }

    @Override // com.max.hbcommon.base.d, androidx.fragment.app.Fragment
    public void onStop() {
        if (PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, bb.c.g.Oi, new Class[0], Void.TYPE).isSupported) {
            return;
        }
        super.onStop();
        if (w4()) {
            return;
        }
        this.mContext.getWindow().setNavigationBarColor(-1);
    }

    public boolean w4() {
        return true;
    }

    public boolean x4() {
        return true;
    }

    @dl.e
    public HBShareProtocolData y4() {
        return null;
    }

    @dl.d
    public final UMShareListener z4() {
        return this.f71048m;
    }
}
