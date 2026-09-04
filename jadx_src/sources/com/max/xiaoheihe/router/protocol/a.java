package com.max.xiaoheihe.router.protocol;

import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;
import android.net.Uri;
import androidx.compose.runtime.internal.o;
import anet.channel.util.HttpConstant;
import com.max.xiaoheihe.R;
import com.max.xiaoheihe.module.bbs.post.ui.activitys.BasePostPageActivity;
import com.max.xiaoheihe.module.webview.t;
import com.max.xiaoheihe.module.webview.y;
import com.max.xiaoheihe.router.c;
import com.max.xiaoheihe.utils.imageviewer.HBImageLoader;
import com.max.xiaoheihe.utils.imageviewer.ImageViewerHelper;
import com.max.xiaoheihe.utils.l0;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.PatchProxyResult;
import com.sankuai.waimai.router.core.f;
import com.sankuai.waimai.router.core.i;
import dl.d;
import java.io.UnsupportedEncodingException;
import java.net.URLDecoder;
import java.util.ArrayList;
import kotlin.jvm.internal.f0;
import kotlin.jvm.internal.t0;
import kotlin.text.Regex;
import kotlin.text.StringsKt__StringsKt;

/* JADX INFO: compiled from: MaxJiaProtocolHandler.kt */
/* JADX INFO: loaded from: classes13.dex */
@t0({"SMAP\nMaxJiaProtocolHandler.kt\nKotlin\n*S Kotlin\n*F\n+ 1 MaxJiaProtocolHandler.kt\ncom/max/xiaoheihe/router/protocol/MaxJiaProtocolHandler\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n+ 3 ArraysJVM.kt\nkotlin/collections/ArraysKt__ArraysJVMKt\n*L\n1#1,220:1\n1855#2,2:221\n37#3,2:223\n37#3,2:225\n*S KotlinDebug\n*F\n+ 1 MaxJiaProtocolHandler.kt\ncom/max/xiaoheihe/router/protocol/MaxJiaProtocolHandler\n*L\n156#1:221,2\n175#1:223,2\n182#1:225,2\n*E\n"})
@o(parameters = 0)
public final class a implements b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final int f95179a = 0;
    public static ChangeQuickRedirect changeQuickRedirect;

    /* JADX INFO: renamed from: com.max.xiaoheihe.router.protocol.a$a, reason: collision with other inner class name */
    /* JADX INFO: compiled from: MaxJiaProtocolHandler.kt */
    public static final class DialogInterfaceOnClickListenerC0901a implements DialogInterface.OnClickListener {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public static final DialogInterfaceOnClickListenerC0901a f95180b = new DialogInterfaceOnClickListenerC0901a();
        public static ChangeQuickRedirect changeQuickRedirect;

        DialogInterfaceOnClickListenerC0901a() {
        }

        @Override // android.content.DialogInterface.OnClickListener
        public final void onClick(DialogInterface dialogInterface, int i10) {
            if (PatchProxy.proxy(new Object[]{dialogInterface, new Integer(i10)}, this, changeQuickRedirect, false, 48319, new Class[]{DialogInterface.class, Integer.TYPE}, Void.TYPE).isSupported) {
                return;
            }
            dialogInterface.dismiss();
        }
    }

    private final String b(String str) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{str}, this, changeQuickRedirect, false, 48316, new Class[]{String.class}, String.class);
        if (patchProxyResultProxy.isSupported) {
            return (String) patchProxyResultProxy.result;
        }
        int iS3 = StringsKt__StringsKt.s3(str, HttpConstant.SCHEME_SPLIT, 0, false, 4, null) + 3;
        int iS4 = StringsKt__StringsKt.s3(str, "#/", iS3, false, 4, null);
        if (iS4 != -1) {
            String strSubstring = str.substring(iS3, iS4);
            f0.o(strSubstring, "this as java.lang.String…ing(startIndex, endIndex)");
            return strSubstring;
        }
        String strSubstring2 = str.substring(iS3);
        f0.o(strSubstring2, "this as java.lang.String).substring(startIndex)");
        return strSubstring2;
    }

    private final int c(String str) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{str}, this, changeQuickRedirect, false, 48318, new Class[]{String.class}, Integer.TYPE);
        if (patchProxyResultProxy.isSupported) {
            return ((Integer) patchProxyResultProxy.result).intValue();
        }
        int iS3 = StringsKt__StringsKt.s3(str, "#/", 0, false, 4, null);
        int i10 = iS3 + 2;
        int iS4 = StringsKt__StringsKt.s3(str, "#/", i10, false, 4, null);
        if (iS3 == -1 || iS4 == -1) {
            return -1;
        }
        String strSubstring = str.substring(i10, iS4);
        f0.o(strSubstring, "this as java.lang.String…ing(startIndex, endIndex)");
        return Integer.parseInt(strSubstring);
    }

    private final String d(String str) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{str}, this, changeQuickRedirect, false, 48317, new Class[]{String.class}, String.class);
        if (patchProxyResultProxy.isSupported) {
            return (String) patchProxyResultProxy.result;
        }
        String strSubstring = str.substring(StringsKt__StringsKt.s3(str, "#/", StringsKt__StringsKt.s3(str, "#/", 0, false, 4, null) + 2, false, 4, null) + 2);
        f0.o(strSubstring, "this as java.lang.String).substring(startIndex)");
        return strSubstring;
    }

    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    @Override // com.max.xiaoheihe.router.protocol.b
    public void a(@d i request, @d f callback) {
        String str;
        String str2;
        String str3;
        String str4;
        String str5;
        String str6;
        String str7;
        String str8;
        String string;
        String string2;
        String str9;
        String str10;
        String str11;
        String str12;
        String str13;
        String str14;
        String str15;
        String str16;
        String str17;
        String str18;
        String str19;
        String str20;
        String str21;
        String str22;
        if (PatchProxy.proxy(new Object[]{request, callback}, this, changeQuickRedirect, false, 48315, new Class[]{i.class, f.class}, Void.TYPE).isSupported) {
        }
        f0.p(request, "request");
        f0.p(callback, "callback");
        String string3 = request.m().toString();
        f0.o(string3, "request.uri.toString()");
        t tVar = (t) request.d(t.class, c.f94905k);
        Context contextB = request.b();
        f0.o(contextB, "request.context");
        String strB = b(string3);
        ArrayList<String> arrayListB = l0.B(string3 + "#/");
        String str23 = "";
        switch (strB.hashCode()) {
            case -1970823542:
                if (strB.equals("OpenSafari")) {
                    String str24 = arrayListB.get(0);
                    Intent intent = new Intent("android.intent.action.VIEW");
                    intent.setData(Uri.parse(str24));
                    com.max.xiaoheihe.utils.d.G1(contextB, intent);
                    break;
                }
                break;
            case -1848677638:
                if (strB.equals("OpenWindow")) {
                    if (arrayListB.size() > 1) {
                        String str25 = arrayListB.get(0);
                        f0.o(str25, "params[0]");
                        str = str25;
                        String str26 = arrayListB.get(1);
                        f0.o(str26, "params[1]");
                        str6 = str26;
                        String str27 = arrayListB.get(2);
                        f0.o(str27, "params[2]");
                        str3 = str27;
                        String str28 = arrayListB.get(3);
                        f0.o(str28, "params[3]");
                        str4 = str28;
                        String str29 = arrayListB.get(4);
                        f0.o(str29, "params[4]");
                        str5 = str29;
                        if (arrayListB.size() > 5) {
                            String str30 = arrayListB.get(5);
                            f0.o(str30, "params[5]");
                            str23 = str30;
                        }
                        str2 = str23;
                    } else {
                        str = "";
                        str2 = str;
                        str3 = str2;
                        str4 = str3;
                        str5 = str4;
                        str6 = str5;
                    }
                    Intent intentC0 = l0.c0(contextB);
                    intentC0.putExtra("title_bgColor", str);
                    intentC0.putExtra("title_textColor", str6);
                    intentC0.putExtra("title", l0.i(str3, "utf-8"));
                    intentC0.putExtra("pageurl", l0.i(str4, "utf-8"));
                    intentC0.putExtra("isPullRefresh", str5);
                    intentC0.putExtra("isMySteamInventory", str2);
                    intentC0.putExtra("active_js", true);
                    l0.x0(contextB, intentC0, 111);
                    break;
                }
                break;
            case -679124688:
                if (strB.equals("ShareUrl") && tVar != null) {
                    tVar.P0(arrayListB);
                }
                break;
            case 63347004:
                if (strB.equals("Alert")) {
                    if (arrayListB.size() > 1) {
                        try {
                            string = URLDecoder.decode(arrayListB.get(0), "utf-8");
                            string2 = URLDecoder.decode(arrayListB.get(1), "utf-8");
                        } catch (UnsupportedEncodingException unused) {
                            string = contextB.getString(R.string.error);
                            string2 = contextB.getString(R.string.error);
                        }
                        str8 = string2;
                        str7 = string;
                    } else {
                        str7 = "";
                        str8 = str7;
                    }
                    com.max.hbcommon.view.a.f fVar = new com.max.hbcommon.view.a.f(contextB);
                    fVar.y(str7);
                    fVar.l(str8);
                    com.max.hbcommon.view.a aVarD = fVar.d();
                    aVarD.u(contextB.getString(R.string.confirm), DialogInterfaceOnClickListenerC0901a.f95180b);
                    aVarD.show();
                    break;
                }
                break;
            case 1062045347:
                if (strB.equals("/showPictureDetail")) {
                    ArrayList arrayList = new ArrayList();
                    for (String str31 : new Regex(";").p(d(string3), 0)) {
                        if (y.j(Uri.parse(str31))) {
                            arrayList.add(y.f(Uri.parse(str31)).toString());
                        } else {
                            arrayList.add(str31);
                        }
                    }
                    int iC = c(string3);
                    String linkId = contextB instanceof BasePostPageActivity ? ((BasePostPageActivity) contextB).getLinkId() : null;
                    if (com.max.hbcommon.utils.c.u(linkId)) {
                        ImageViewerHelper.a.o(ImageViewerHelper.f95500a.a(contextB).c(new HBImageLoader()), contextB, (String[]) arrayList.toArray(new String[0]), null, 4, null).d(iC).p();
                    } else {
                        ImageViewerHelper.f95500a.a(contextB).c(new HBImageLoader()).g(contextB, (String[]) arrayList.toArray(new String[0]), linkId).d(iC).p();
                    }
                    break;
                }
                break;
            case 1631239141:
                if (strB.equals("OpenShareWindow")) {
                    if (arrayListB.size() > 8) {
                        String str32 = arrayListB.get(0);
                        f0.o(str32, "params[0]");
                        String str33 = str32;
                        String str34 = arrayListB.get(1);
                        f0.o(str34, "params[1]");
                        str17 = str34;
                        String str35 = arrayListB.get(2);
                        f0.o(str35, "params[2]");
                        str12 = str35;
                        String str36 = arrayListB.get(3);
                        f0.o(str36, "params[3]");
                        str15 = str36;
                        String str37 = arrayListB.get(4);
                        f0.o(str37, "params[4]");
                        str16 = str37;
                        String str38 = arrayListB.get(5);
                        f0.o(str38, "params[5]");
                        str14 = str38;
                        String str39 = arrayListB.get(6);
                        f0.o(str39, "params[6]");
                        str13 = str39;
                        String str40 = arrayListB.get(7);
                        f0.o(str40, "params[7]");
                        str18 = str40;
                        String str41 = arrayListB.get(8);
                        f0.o(str41, "params[8]");
                        String str42 = str41;
                        if (arrayListB.size() > 9) {
                            String str43 = arrayListB.get(9);
                            f0.o(str43, "params[9]");
                            str21 = str43;
                        } else {
                            str21 = "";
                        }
                        String str44 = str21;
                        if (arrayListB.size() > 10) {
                            String str45 = arrayListB.get(10);
                            f0.o(str45, "params[10]");
                            str22 = str45;
                        } else {
                            str22 = "";
                        }
                        String str46 = str22;
                        if (arrayListB.size() > 11) {
                            String str47 = arrayListB.get(11);
                            f0.o(str47, "params[11]");
                            str23 = str47;
                        }
                        str9 = str33;
                        str10 = str42;
                        str11 = str44;
                        str19 = str46;
                        str20 = str23;
                    } else {
                        str9 = "";
                        str10 = str9;
                        str11 = str10;
                        str12 = str11;
                        str13 = str12;
                        str14 = str13;
                        str15 = str14;
                        str16 = str15;
                        str17 = str16;
                        str18 = str17;
                        str19 = str18;
                        str20 = str19;
                    }
                    if (!l0.n0(contextB, str15)) {
                        String str48 = str11;
                        Intent intentC1 = l0.c0(contextB);
                        intentC1.putExtra("title_bgColor", str9);
                        intentC1.putExtra("title_textColor", str17);
                        intentC1.putExtra("title", l0.i(str12, "utf-8"));
                        intentC1.putExtra("pageurl", l0.i(str15, "utf-8"));
                        intentC1.putExtra("isPullRefresh", str16);
                        intentC1.putExtra("shareTitle", l0.i(str14, "utf-8"));
                        intentC1.putExtra("shareUrl", str13);
                        intentC1.putExtra("shareDesc", l0.i(str18, "utf-8"));
                        intentC1.putExtra("shareImgUrl", str10);
                        intentC1.putExtra("bounds", str48);
                        intentC1.putExtra("orientation", str19);
                        intentC1.putExtra("actID", str20);
                        intentC1.putExtra("showShare", true);
                        intentC1.putExtra("active_js", true);
                        l0.x0(contextB, intentC1, 111);
                    }
                    break;
                }
                break;
            case 1840433511:
                if (strB.equals("ShareSinaUrl") && tVar != null) {
                    tVar.N0(arrayListB);
                }
                break;
        }
    }
}
