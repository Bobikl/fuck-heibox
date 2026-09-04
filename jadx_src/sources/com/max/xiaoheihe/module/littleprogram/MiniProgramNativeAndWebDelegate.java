package com.max.xiaoheihe.module.littleprogram;

import android.content.Context;
import androidx.compose.runtime.internal.o;
import com.google.gson.JsonObject;
import com.max.hbminiprogram.bean.MiniProgramMenuInfoObj;
import com.max.hbshare.bean.HBShareProtocolData;
import com.max.xiaoheihe.R;
import com.max.xiaoheihe.bean.IconCfgObj;
import com.max.xiaoheihe.bean.NavBarCfgObj;
import com.max.xiaoheihe.bean.WebProtocolObj;
import com.max.xiaoheihe.utils.l0;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.PatchProxyResult;
import com.umeng.socialize.UMShareListener;
import com.umeng.socialize.media.UMImage;
import dl.d;
import dl.e;
import kotlin.b2;
import kotlin.jvm.internal.Ref;
import kotlin.jvm.internal.f0;
import kotlin.jvm.internal.u;
import xh.m;

/* JADX INFO: compiled from: MiniProgramNativeAndWebDelegate.kt */
/* JADX INFO: loaded from: classes11.dex */
@o(parameters = 0)
public final class MiniProgramNativeAndWebDelegate {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final int f88674b = 0;
    public static ChangeQuickRedirect changeQuickRedirect;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @d
    public static final Companion f88673a = new Companion(null);

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @d
    private static final String f88675c = "LittleProgramDelegate";

    /* JADX INFO: compiled from: MiniProgramNativeAndWebDelegate.kt */
    public static final class Companion {
        public static ChangeQuickRedirect changeQuickRedirect;

        private Companion() {
        }

        public /* synthetic */ Companion(u uVar) {
            this();
        }

        @d
        public final String a() {
            PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 38639, new Class[0], String.class);
            return patchProxyResultProxy.isSupported ? (String) patchProxyResultProxy.result : MiniProgramNativeAndWebDelegate.f88675c;
        }

        /* JADX WARN: Multi-variable type inference failed */
        /* JADX WARN: Type inference failed for: r0v13, types: [T, com.max.hbshare.bean.HBShareProtocolData] */
        /* JADX WARN: Type inference failed for: r3v5, types: [T, com.max.hbshare.bean.HBShareProtocolData] */
        @m
        public final void b(@d final Context context, @e final String str, @e WebProtocolObj webProtocolObj, @e final String str2, @e final MiniProgramMenuInfoObj miniProgramMenuInfoObj, @d final UMShareListener shareListener) {
            NavBarCfgObj navBarCfgObj;
            if (PatchProxy.proxy(new Object[]{context, str, webProtocolObj, str2, miniProgramMenuInfoObj, shareListener}, this, changeQuickRedirect, false, 38640, new Class[]{Context.class, String.class, WebProtocolObj.class, String.class, MiniProgramMenuInfoObj.class, UMShareListener.class}, Void.TYPE).isSupported) {
                return;
            }
            f0.p(context, "context");
            f0.p(shareListener, "shareListener");
            final Ref.ObjectRef objectRef = new Ref.ObjectRef();
            final Ref.BooleanRef booleanRef = new Ref.BooleanRef();
            final Ref.ObjectRef objectRef2 = new Ref.ObjectRef();
            yh.a<b2> aVar = new yh.a<b2>() { // from class: com.max.xiaoheihe.module.littleprogram.MiniProgramNativeAndWebDelegate$Companion$showMiniProgramDialog$showLittleProgramDialog$1
                public static ChangeQuickRedirect changeQuickRedirect;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                {
                    super(0);
                }

                /* JADX WARN: Type inference failed for: r0v3, types: [java.lang.Object, kotlin.b2] */
                @Override // yh.a
                public /* bridge */ /* synthetic */ b2 invoke() {
                    PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 38642, new Class[0], Object.class);
                    if (patchProxyResultProxy.isSupported) {
                        return patchProxyResultProxy.result;
                    }
                    invoke2();
                    return b2.f124493a;
                }

                /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
                public final void invoke2() {
                    if (PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 38641, new Class[0], Void.TYPE).isSupported) {
                        return;
                    }
                    Context context2 = context;
                    String str3 = str2;
                    MiniProgramMenuInfoObj miniProgramMenuInfoObj2 = miniProgramMenuInfoObj;
                    boolean z10 = booleanRef.f124884b;
                    HBShareProtocolData hBShareProtocolData = objectRef2.f124891b;
                    if (hBShareProtocolData != null) {
                        String str4 = str;
                        JsonObject report_extra = hBShareProtocolData.getReport_extra();
                        if (report_extra == null) {
                            report_extra = new JsonObject();
                        }
                        report_extra.addProperty("web_url", str4);
                        hBShareProtocolData.setReport_extra(report_extra);
                        b2 b2Var = b2.f124493a;
                    } else {
                        hBShareProtocolData = null;
                    }
                    UMImage uMImage = objectRef.f124891b;
                    HBShareProtocolData hBShareProtocolData2 = objectRef2.f124891b;
                    String src = hBShareProtocolData2 != null ? hBShareProtocolData2.getSrc() : null;
                    UMShareListener uMShareListener = shareListener;
                    HBShareProtocolData hBShareProtocolData3 = objectRef2.f124891b;
                    com.max.hbminiprogram.utils.b.h(context2, str3, miniProgramMenuInfoObj2, z10, hBShareProtocolData, uMImage, new com.max.hbshare.c.b(src, uMShareListener, hBShareProtocolData3 != null ? hBShareProtocolData3.getReport_extra() : null));
                }
            };
            if ((miniProgramMenuInfoObj != null ? miniProgramMenuInfoObj.getShare_info() : null) != null) {
                ?? share_info = miniProgramMenuInfoObj.getShare_info();
                if (share_info != 0) {
                    objectRef2.f124891b = share_info;
                    String img_url = share_info.getImg_url();
                    objectRef.f124891b = !com.max.hbcommon.utils.c.u(img_url) ? new UMImage(context, img_url) : new UMImage(context, R.drawable.share_thumbnail);
                    booleanRef.f124884b = true;
                }
            } else if (webProtocolObj != null && (navBarCfgObj = (NavBarCfgObj) webProtocolObj.objectOf("navigation_bar", NavBarCfgObj.class)) != null) {
                IconCfgObj right_icon = navBarCfgObj.getRight_icon();
                WebProtocolObj protocol = right_icon != null ? right_icon.getProtocol() : null;
                if (right_icon != null && protocol != null) {
                    ?? A0 = l0.a0(protocol);
                    objectRef2.f124891b = A0;
                    String img_url2 = A0 != 0 ? A0.getImg_url() : null;
                    objectRef.f124891b = !com.max.hbcommon.utils.c.u(img_url2) ? new UMImage(context, img_url2) : new UMImage(context, R.drawable.share_thumbnail);
                    booleanRef.f124884b = right_icon.isEnabled();
                }
            }
            aVar.invoke();
        }
    }

    @m
    public static final void b(@d Context context, @e String str, @e WebProtocolObj webProtocolObj, @e String str2, @e MiniProgramMenuInfoObj miniProgramMenuInfoObj, @d UMShareListener uMShareListener) {
        if (PatchProxy.proxy(new Object[]{context, str, webProtocolObj, str2, miniProgramMenuInfoObj, uMShareListener}, null, changeQuickRedirect, true, 38638, new Class[]{Context.class, String.class, WebProtocolObj.class, String.class, MiniProgramMenuInfoObj.class, UMShareListener.class}, Void.TYPE).isSupported) {
            return;
        }
        f88673a.b(context, str, webProtocolObj, str2, miniProgramMenuInfoObj, uMShareListener);
    }
}
