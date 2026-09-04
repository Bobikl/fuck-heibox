package com.max.mediaselector;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.content.pm.ResolveInfo;
import android.content.res.Resources;
import android.database.Cursor;
import android.graphics.Bitmap;
import android.net.Uri;
import android.text.TextUtils;
import androidx.core.content.res.i;
import androidx.fragment.app.Fragment;
import com.google.android.exoplayer2.util.y;
import com.max.heybox.hblog.g;
import com.max.mediaselector.beans.Photo;
import com.max.mediaselector.beans.PhotoFolder;
import com.max.mediaselector.lib.basic.m;
import com.max.mediaselector.lib.basic.q;
import com.max.mediaselector.lib.entity.LocalMedia;
import com.max.mediaselector.lib.style.AlbumWindowStyle;
import com.max.mediaselector.lib.style.BottomNavBarStyle;
import com.max.mediaselector.lib.style.PictureWindowAnimationStyle;
import com.max.mediaselector.lib.style.SelectMainStyle;
import com.max.mediaselector.lib.style.TitleBarStyle;
import com.max.mediaselector.lib.utils.h;
import com.max.mediaselector.utils.HBCompressEngine;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.PatchProxyResult;
import java.io.File;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import oe.t;

/* JADX INFO: compiled from: MediaSelectorUtils.java */
/* JADX INFO: loaded from: classes2.dex */
public class e {
    public static ChangeQuickRedirect changeQuickRedirect;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final String[] f74748a = {"image/jpeg", com.max.mediaselector.lib.config.f.D, "image/gif", "video/mp4", y.f51592q, "video/x-msvideo", y.f51602v};

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final String[] f74749b = {"image/jpeg", com.max.mediaselector.lib.config.f.D, "image/gif"};

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final String[] f74750c = {"image/jpeg", com.max.mediaselector.lib.config.f.D};

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final String[] f74751d = {"image/jpeg", com.max.mediaselector.lib.config.f.D, "video/mp4", y.f51592q, "video/x-msvideo", y.f51602v};

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final String[] f74752e = {"mp4", "mpg4", "mpeg", "mpe", "avi", "flv"};

    public static String a(String str) {
        int iLastIndexOf;
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{str}, null, changeQuickRedirect, true, bb.c.l.f34272la, new Class[]{String.class}, String.class);
        if (patchProxyResultProxy.isSupported) {
            return (String) patchProxyResultProxy.result;
        }
        return (str == null || str.length() <= 0 || (iLastIndexOf = str.lastIndexOf(46)) <= -1 || iLastIndexOf >= str.length() - 1) ? str : str.substring(iLastIndexOf + 1);
    }

    public static com.max.mediaselector.lib.style.a b() {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[0], null, changeQuickRedirect, true, bb.c.l.f34204ia, new Class[0], com.max.mediaselector.lib.style.a.class);
        if (patchProxyResultProxy.isSupported) {
            return (com.max.mediaselector.lib.style.a) patchProxyResultProxy.result;
        }
        com.max.mediaselector.lib.style.a aVar = new com.max.mediaselector.lib.style.a();
        PictureWindowAnimationStyle pictureWindowAnimationStyle = new PictureWindowAnimationStyle();
        pictureWindowAnimationStyle.f75418b = R.anim.ps_activity_open_enter_from_right;
        pictureWindowAnimationStyle.f75419c = R.anim.ps_activity_close_to_right;
        aVar.j(pictureWindowAnimationStyle);
        AlbumWindowStyle albumWindowStyle = new AlbumWindowStyle();
        int i10 = R.color.text_primary_1_not_change_color;
        albumWindowStyle.f(i10);
        albumWindowStyle.k(14);
        Resources resources = com.max.mediaselector.utils.b.a().getResources();
        int i11 = R.color.ps_color_white;
        albumWindowStyle.j(i.e(resources, i11, null));
        aVar.f(albumWindowStyle);
        SelectMainStyle selectMainStyle = new SelectMainStyle();
        selectMainStyle.B1(true);
        selectMainStyle.k1(false);
        selectMainStyle.h1(true);
        selectMainStyle.S0(i10);
        selectMainStyle.s1(R.drawable.ps_default_num_selector);
        selectMainStyle.i1(R.drawable.ps_preview_checkbox_selector);
        selectMainStyle.u1(R.drawable.bg_transpant);
        selectMainStyle.x1(androidx.core.content.d.f(com.max.mediaselector.utils.b.a(), R.color.transparent));
        selectMainStyle.v1("下一步");
        selectMainStyle.M0(R.drawable.ps_preview_gallery_bg);
        selectMainStyle.O0(h.a(com.max.mediaselector.utils.b.a(), 52.0f));
        selectMainStyle.n1("选择");
        selectMainStyle.p1(14);
        selectMainStyle.o1(androidx.core.content.d.f(com.max.mediaselector.utils.b.a(), i11));
        selectMainStyle.j1(h.a(com.max.mediaselector.utils.b.a(), 6.0f));
        int i12 = R.drawable.ps_select_complete_bg;
        selectMainStyle.t1(i12);
        selectMainStyle.C1("下一步");
        selectMainStyle.u1(i12);
        selectMainStyle.D1(androidx.core.content.d.f(com.max.mediaselector.utils.b.a(), i10));
        selectMainStyle.d1(androidx.core.content.d.f(com.max.mediaselector.utils.b.a(), R.color.ps_color_black));
        selectMainStyle.b1(false);
        selectMainStyle.K0(false);
        aVar.h(selectMainStyle);
        TitleBarStyle titleBarStyle = new TitleBarStyle();
        titleBarStyle.L(i.e(com.max.mediaselector.utils.b.a().getResources(), i10, null));
        titleBarStyle.E(true);
        titleBarStyle.C(true);
        titleBarStyle.c0(17);
        int i13 = R.drawable.common_close_v;
        titleBarStyle.I(i13);
        titleBarStyle.a0(i13);
        aVar.i(titleBarStyle);
        BottomNavBarStyle bottomNavBarStyle = new BottomNavBarStyle();
        bottomNavBarStyle.L(androidx.core.content.d.f(com.max.mediaselector.utils.b.a(), i10));
        bottomNavBarStyle.M("已选");
        bottomNavBarStyle.N(androidx.core.content.d.f(com.max.mediaselector.utils.b.a(), R.color.ps_color_9b));
        bottomNavBarStyle.O(16);
        bottomNavBarStyle.F(h.a(com.max.mediaselector.utils.b.a(), 54.0f));
        bottomNavBarStyle.a0(false);
        bottomNavBarStyle.P("已选%1$d/%2$d");
        bottomNavBarStyle.T(androidx.core.content.d.f(com.max.mediaselector.utils.b.a(), i11));
        aVar.g(bottomNavBarStyle);
        return aVar;
    }

    public static void c(Object obj, int i10, int i11) {
        m mVarE;
        Object[] objArr = {obj, new Integer(i10), new Integer(i11)};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        Class cls = Integer.TYPE;
        if (PatchProxy.proxy(objArr, null, changeQuickRedirect2, true, bb.c.l.Z9, new Class[]{Object.class, cls, cls}, Void.TYPE).isSupported || (mVarE = e(obj, i10, true, false, true)) == null) {
            return;
        }
        mVarE.F(false);
        mVarE.a(i11);
    }

    private static m d(q qVar, int i10, int i11, boolean z10, boolean z11, boolean z12, boolean z13) {
        m mVarI;
        Object[] objArr = {qVar, new Integer(i10), new Integer(i11), new Byte(z10 ? (byte) 1 : (byte) 0), new Byte(z11 ? (byte) 1 : (byte) 0), new Byte(z12 ? (byte) 1 : (byte) 0), new Byte(z13 ? (byte) 1 : (byte) 0)};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        Class cls = Integer.TYPE;
        Class cls2 = Boolean.TYPE;
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(objArr, null, changeQuickRedirect2, true, bb.c.l.f34181ha, new Class[]{q.class, cls, cls, cls2, cls2, cls2, cls2}, m.class);
        if (patchProxyResultProxy.isSupported) {
            return (m) patchProxyResultProxy.result;
        }
        if (z12) {
            mVarI = z13 ? qVar.i(com.max.mediaselector.lib.config.h.a()) : qVar.i(com.max.mediaselector.lib.config.h.d());
        } else {
            mVarI = qVar.i(com.max.mediaselector.lib.config.h.c());
        }
        mVarI.T(c.f74745a).A0(b()).j(z10).n(z11).r(true).L(new HBCompressEngine()).F(true).a0(i10).X(i11).z0(2).U(3);
        m.f74958c = System.currentTimeMillis();
        return mVarI;
    }

    public static m e(Object obj, int i10, boolean z10, boolean z11, boolean z12) {
        Object[] objArr = {obj, new Integer(i10), new Byte(z10 ? (byte) 1 : (byte) 0), new Byte(z11 ? (byte) 1 : (byte) 0), new Byte(z12 ? (byte) 1 : (byte) 0)};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        Class cls = Boolean.TYPE;
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(objArr, null, changeQuickRedirect2, true, bb.c.l.f34135fa, new Class[]{Object.class, Integer.TYPE, cls, cls, cls}, m.class);
        return patchProxyResultProxy.isSupported ? (m) patchProxyResultProxy.result : f(obj, i10, z10, z11, z12, 0, true);
    }

    private static m f(Object obj, int i10, boolean z10, boolean z11, boolean z12, int i11, boolean z13) {
        Object[] objArr = {obj, new Integer(i10), new Byte(z10 ? (byte) 1 : (byte) 0), new Byte(z11 ? (byte) 1 : (byte) 0), new Byte(z12 ? (byte) 1 : (byte) 0), new Integer(i11), new Byte(z13 ? (byte) 1 : (byte) 0)};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        Class cls = Integer.TYPE;
        Class cls2 = Boolean.TYPE;
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(objArr, null, changeQuickRedirect2, true, bb.c.l.f34158ga, new Class[]{Object.class, cls, cls2, cls2, cls2, cls, cls2}, m.class);
        if (patchProxyResultProxy.isSupported) {
            return (m) patchProxyResultProxy.result;
        }
        if (obj instanceof Activity) {
            return d(q.a((Activity) obj), i11, i10, z10, z11, z12, z13);
        }
        if (obj instanceof Fragment) {
            return d(q.c((Fragment) obj), i11, i10, z10, z11, z12, z13);
        }
        if (obj instanceof Context) {
            ob.a aVar = ob.a.f132240a;
            Activity activityN = ob.a.b().n();
            if (activityN != null) {
                return d(q.a(activityN), i11, i10, z10, z11, z12, z13);
            }
        }
        return null;
    }

    public static void g(Object obj, int i10, int i11) {
        Object[] objArr = {obj, new Integer(i10), new Integer(i11)};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        Class cls = Integer.TYPE;
        if (PatchProxy.proxy(objArr, null, changeQuickRedirect2, true, bb.c.l.Y9, new Class[]{Object.class, cls, cls}, Void.TYPE).isSupported) {
            return;
        }
        h(obj, i10, i11, true, true, false);
    }

    public static void h(Object obj, int i10, int i11, boolean z10, boolean z11, boolean z12) {
        Object[] objArr = {obj, new Integer(i10), new Integer(i11), new Byte(z10 ? (byte) 1 : (byte) 0), new Byte(z11 ? (byte) 1 : (byte) 0), new Byte(z12 ? (byte) 1 : (byte) 0)};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        Class cls = Integer.TYPE;
        Class cls2 = Boolean.TYPE;
        if (PatchProxy.proxy(objArr, null, changeQuickRedirect2, true, bb.c.l.f34043ba, new Class[]{Object.class, cls, cls, cls2, cls2, cls2}, Void.TYPE).isSupported) {
            return;
        }
        e(obj, i10, z10, z11, z12).a(i11);
    }

    public static void i(Object obj, int i10, t<LocalMedia> tVar) {
        if (PatchProxy.proxy(new Object[]{obj, new Integer(i10), tVar}, null, changeQuickRedirect, true, bb.c.l.f34066ca, new Class[]{Object.class, Integer.TYPE, t.class}, Void.TYPE).isSupported) {
            return;
        }
        j(obj, i10, tVar, true, true, false, true);
    }

    public static void j(Object obj, int i10, t<LocalMedia> tVar, boolean z10, boolean z11, boolean z12, boolean z13) {
        Object[] objArr = {obj, new Integer(i10), tVar, new Byte(z10 ? (byte) 1 : (byte) 0), new Byte(z11 ? (byte) 1 : (byte) 0), new Byte(z12 ? (byte) 1 : (byte) 0), new Byte(z13 ? (byte) 1 : (byte) 0)};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        Class cls = Boolean.TYPE;
        if (PatchProxy.proxy(objArr, null, changeQuickRedirect2, true, bb.c.l.f34089da, new Class[]{Object.class, Integer.TYPE, t.class, cls, cls, cls, cls}, Void.TYPE).isSupported) {
            return;
        }
        k(obj, i10, tVar, z10, z11, z12, z13, true);
    }

    public static void k(Object obj, int i10, t<LocalMedia> tVar, boolean z10, boolean z11, boolean z12, boolean z13, boolean z14) {
        Object[] objArr = {obj, new Integer(i10), tVar, new Byte(z10 ? (byte) 1 : (byte) 0), new Byte(z11 ? (byte) 1 : (byte) 0), new Byte(z12 ? (byte) 1 : (byte) 0), new Byte(z13 ? (byte) 1 : (byte) 0), new Byte(z14 ? (byte) 1 : (byte) 0)};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        Class cls = Boolean.TYPE;
        if (PatchProxy.proxy(objArr, null, changeQuickRedirect2, true, bb.c.l.f34112ea, new Class[]{Object.class, Integer.TYPE, t.class, cls, cls, cls, cls, cls}, Void.TYPE).isSupported) {
            return;
        }
        m mVarF = f(obj, i10, z10, z11, z12, 0, z13);
        mVarF.C(z14);
        mVarF.c(tVar);
    }

    public static void l(Object obj, int i10, int i11, int i12, boolean z10, boolean z11, List<LocalMedia> list, oe.f fVar) {
        m mVarF;
        Object[] objArr = {obj, new Integer(i10), new Integer(i11), new Integer(i12), new Byte(z10 ? (byte) 1 : (byte) 0), new Byte(z11 ? (byte) 1 : (byte) 0), list, fVar};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        Class cls = Integer.TYPE;
        Class cls2 = Boolean.TYPE;
        if (PatchProxy.proxy(objArr, null, changeQuickRedirect2, true, bb.c.l.f34020aa, new Class[]{Object.class, cls, cls, cls, cls2, cls2, List.class, oe.f.class}, Void.TYPE).isSupported || (mVarF = f(obj, i11, true, false, z10, i10, true)) == null) {
            return;
        }
        f.f74753a.d();
        mVarF.F(false);
        mVarF.C(z11);
        mVarF.d0(fVar);
        mVarF.y0(list);
        mVarF.a(i12);
    }

    public static void m(Uri uri, Activity activity, int i10, Uri uri2, int i11, int i12) {
        Object[] objArr = {uri, activity, new Integer(i10), uri2, new Integer(i11), new Integer(i12)};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        Class cls = Integer.TYPE;
        if (PatchProxy.proxy(objArr, null, changeQuickRedirect2, true, bb.c.l.f34226ja, new Class[]{Uri.class, Activity.class, cls, Uri.class, cls, cls}, Void.TYPE).isSupported) {
            return;
        }
        Intent intent = new Intent("com.android.camera.action.CROP");
        intent.setDataAndType(uri, com.max.mediaselector.lib.config.h.f75165f);
        intent.putExtra("crop", "true");
        intent.putExtra("aspectX", i11);
        intent.putExtra("aspectY", i12);
        intent.putExtra("scale", true);
        intent.putExtra("scaleUpIfNeeded", true);
        intent.putExtra("return-data", false);
        intent.putExtra("outputFormat", Bitmap.CompressFormat.JPEG.toString());
        intent.putExtra("noFaceDetection", true);
        intent.putExtra("output", uri2);
        intent.addFlags(1);
        List<ResolveInfo> listQueryIntentActivities = activity.getPackageManager().queryIntentActivities(intent, 65536);
        if (listQueryIntentActivities.size() <= 0) {
            activity.startActivityForResult(intent, i10);
            return;
        }
        Iterator<ResolveInfo> it = listQueryIntentActivities.iterator();
        while (it.hasNext()) {
            activity.grantUriPermission(it.next().activityInfo.packageName, uri2, 2);
        }
        activity.startActivityForResult(intent, i10);
    }

    private static void n(Cursor cursor, Map<String, PhotoFolder> map, String str, String str2) {
        if (PatchProxy.proxy(new Object[]{cursor, map, str, str2}, null, changeQuickRedirect, true, bb.c.l.f34249ka, new Class[]{Cursor.class, Map.class, String.class, String.class}, Void.TYPE).isSupported) {
            return;
        }
        while (cursor.moveToNext()) {
            try {
                int columnIndex = cursor.getColumnIndex("_data");
                int columnIndex2 = cursor.getColumnIndex("date_modified");
                if (columnIndex >= 0 && columnIndex2 >= 0) {
                    String string = cursor.getString(columnIndex);
                    String string2 = cursor.getString(columnIndex2);
                    if (string2 == null) {
                        string2 = String.valueOf(System.currentTimeMillis());
                    }
                    File parentFile = TextUtils.isEmpty(string) ? null : new File(string).getParentFile();
                    if (parentFile != null) {
                        String absolutePath = parentFile.getAbsolutePath();
                        if (map.containsKey(absolutePath)) {
                            Photo photo = new Photo(string, str2, string2);
                            map.get(absolutePath).c().add(photo);
                            map.get(str).c().add(photo);
                        } else {
                            PhotoFolder photoFolder = new PhotoFolder();
                            ArrayList arrayList = new ArrayList();
                            Photo photo2 = new Photo(string, str2, string2);
                            arrayList.add(photo2);
                            photoFolder.h(arrayList);
                            photoFolder.e(absolutePath);
                            photoFolder.g(absolutePath.substring(absolutePath.lastIndexOf(File.separator) + 1, absolutePath.length()));
                            map.put(absolutePath, photoFolder);
                            map.get(str).c().add(photo2);
                        }
                    }
                }
            } catch (Throwable th2) {
                g.G("traverseCusor " + th2.getMessage());
            }
        }
        cursor.close();
    }
}
