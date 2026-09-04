package com.max.mediaselector.lib.loader;

import android.content.Context;
import android.net.Uri;
import android.provider.MediaStore;
import android.text.TextUtils;
import com.huawei.hms.framework.common.ContainerUtils;
import com.max.mediaselector.lib.config.PictureSelectionConfig;
import com.max.mediaselector.lib.config.f;
import com.max.mediaselector.lib.config.h;
import com.max.mediaselector.lib.entity.LocalMedia;
import com.max.mediaselector.lib.entity.LocalMediaFolder;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.PatchProxyResult;
import com.umeng.analytics.pro.ao;
import java.util.HashSet;
import java.util.Locale;
import oe.l;
import oe.m;
import oe.n;

/* JADX INFO: compiled from: IBridgeMediaLoader.java */
/* JADX INFO: loaded from: classes2.dex */
public class a {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    protected static final String f75243c = "a";
    public static ChangeQuickRedirect changeQuickRedirect = null;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final String f75245e = "date_modified DESC";

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    protected static final String f75246f = "!='image/*'";

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    protected static final String f75247g = " AND (mime_type!='image/gif' AND mime_type!='image/*')";

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    protected static final String f75248h = " GROUP BY (bucket_id";

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    protected static final String f75249i = "count";

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    protected static final String f75251k = "duration";

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    protected static final int f75253m = 60;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    protected Context f75255a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    protected PictureSelectionConfig f75256b;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final Uri f75244d = MediaStore.Files.getContentUri("external");

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    protected static final String f75252l = "bucket_display_name";

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    protected static final String f75250j = "bucket_id";

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public static final String[] f75254n = {ao.f104522d, "_data", "mime_type", "width", "height", "duration", "_size", f75252l, "_display_name", f75250j, "date_added"};

    public static String[] e() {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[0], null, changeQuickRedirect, true, bb.c.m.P, new Class[0], String[].class);
        return patchProxyResultProxy.isSupported ? (String[]) patchProxyResultProxy.result : new String[]{String.valueOf(1), String.valueOf(3)};
    }

    public static String[] f(int i10) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{new Integer(i10)}, null, changeQuickRedirect, true, bb.c.m.O, new Class[]{Integer.TYPE}, String[].class);
        return patchProxyResultProxy.isSupported ? (String[]) patchProxyResultProxy.result : new String[]{String.valueOf(i10)};
    }

    public String a() {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, bb.c.m.Q, new Class[0], String.class);
        if (patchProxyResultProxy.isSupported) {
            return (String) patchProxyResultProxy.result;
        }
        PictureSelectionConfig pictureSelectionConfig = this.f75256b;
        int i10 = pictureSelectionConfig.f75050r;
        long j10 = i10 == 0 ? Long.MAX_VALUE : i10;
        Locale locale = Locale.CHINA;
        Object[] objArr = new Object[3];
        objArr[0] = Long.valueOf(Math.max(0L, pictureSelectionConfig.f75051s));
        objArr[1] = Math.max(0L, (long) this.f75256b.f75051s) == 0 ? "" : ContainerUtils.KEY_VALUE_DELIMITER;
        objArr[2] = Long.valueOf(j10);
        return String.format(locale, "%d <%s duration and duration <= %d", objArr);
    }

    public String b() {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, bb.c.m.R, new Class[0], String.class);
        if (patchProxyResultProxy.isSupported) {
            return (String) patchProxyResultProxy.result;
        }
        PictureSelectionConfig pictureSelectionConfig = this.f75256b;
        long j10 = pictureSelectionConfig.f75059y;
        if (j10 == 0) {
            j10 = Long.MAX_VALUE;
        }
        Locale locale = Locale.CHINA;
        Object[] objArr = new Object[3];
        objArr[0] = Long.valueOf(Math.max(0L, pictureSelectionConfig.f75062z));
        objArr[1] = Math.max(0L, this.f75256b.f75062z) == 0 ? "" : ContainerUtils.KEY_VALUE_DELIMITER;
        objArr[2] = Long.valueOf(j10);
        return String.format(locale, "%d <%s _size and _size <= %d", objArr);
    }

    public String c(long j10) {
        return null;
    }

    /* JADX WARN: Code duplicated, block: B:35:0x008f  */
    /* JADX WARN: Code duplicated, block: B:36:0x0092  */
    public String d() {
        String str;
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, bb.c.m.S, new Class[0], String.class);
        if (patchProxyResultProxy.isSupported) {
            return (String) patchProxyResultProxy.result;
        }
        HashSet<String> hashSet = new HashSet(this.f75256b.Q);
        StringBuilder sb2 = new StringBuilder();
        int i10 = -1;
        for (String str2 : hashSet) {
            if (!TextUtils.isEmpty(str2)) {
                if (this.f75256b.f75029b == h.d()) {
                    if (!str2.startsWith("image") && !str2.startsWith("audio")) {
                        i10++;
                        if (i10 == 0) {
                            str = " AND ";
                        } else {
                            str = " OR ";
                        }
                        sb2.append(str);
                        sb2.append("mime_type");
                        sb2.append("='");
                        sb2.append(str2);
                        sb2.append("'");
                    }
                } else if (this.f75256b.f75029b == h.c()) {
                    if (!str2.startsWith("audio") && !str2.startsWith("video")) {
                        i10++;
                        if (i10 == 0) {
                            str = " AND ";
                        } else {
                            str = " OR ";
                        }
                        sb2.append(str);
                        sb2.append("mime_type");
                        sb2.append("='");
                        sb2.append(str2);
                        sb2.append("'");
                    }
                } else if (this.f75256b.f75029b != h.b() || (!str2.startsWith("video") && !str2.startsWith("image"))) {
                    i10++;
                    if (i10 == 0) {
                        str = " AND ";
                    } else {
                        str = " OR ";
                    }
                    sb2.append(str);
                    sb2.append("mime_type");
                    sb2.append("='");
                    sb2.append(str2);
                    sb2.append("'");
                }
            }
        }
        if (this.f75256b.f75029b != h.d() && !this.f75256b.E && !hashSet.contains(f.w())) {
            sb2.append(f75247g);
        }
        return sb2.toString();
    }

    public String g() {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, bb.c.m.T, new Class[0], String.class);
        if (patchProxyResultProxy.isSupported) {
            return (String) patchProxyResultProxy.result;
        }
        return TextUtils.isEmpty(this.f75256b.f75030b0) ? f75245e : this.f75256b.f75030b0;
    }

    public void h(m<LocalMediaFolder> mVar) {
    }

    public void i(long j10, int i10, n<LocalMedia> nVar) {
    }

    public void j(l<LocalMediaFolder> lVar) {
    }

    public void k(long j10, int i10, int i11, int i12, n<LocalMedia> nVar) {
    }

    public void l(long j10, int i10, int i11, n<LocalMedia> nVar) {
    }
}
