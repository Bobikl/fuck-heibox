package com.max.mediaselector.lib.loader;

import android.content.ContentResolver;
import android.content.Context;
import android.database.Cursor;
import android.net.Uri;
import android.text.TextUtils;
import com.max.mediaselector.R;
import com.max.mediaselector.lib.config.PictureSelectionConfig;
import com.max.mediaselector.lib.config.f;
import com.max.mediaselector.lib.config.h;
import com.max.mediaselector.lib.entity.LocalMedia;
import com.max.mediaselector.lib.entity.LocalMediaFolder;
import com.max.mediaselector.lib.thread.PictureThreadUtils;
import com.max.mediaselector.lib.utils.o;
import com.max.mediaselector.lib.utils.r;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.PatchProxyResult;
import java.util.ArrayList;
import java.util.List;
import oe.l;
import oe.m;

/* JADX INFO: compiled from: LocalMediaLoader.java */
/* JADX INFO: loaded from: classes2.dex */
public final class b extends com.max.mediaselector.lib.loader.a {
    public static ChangeQuickRedirect changeQuickRedirect;

    /* JADX INFO: compiled from: LocalMediaLoader.java */
    public class a extends PictureThreadUtils.d<LocalMediaFolder> {
        public static ChangeQuickRedirect changeQuickRedirect;

        /* JADX INFO: renamed from: p, reason: collision with root package name */
        final /* synthetic */ l f75257p;

        a(l lVar) {
            this.f75257p = lVar;
        }

        @Override // com.max.mediaselector.lib.thread.PictureThreadUtils.f
        public /* bridge */ /* synthetic */ Object f() throws Throwable {
            PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, bb.c.m.f34782i0, new Class[0], Object.class);
            return patchProxyResultProxy.isSupported ? patchProxyResultProxy.result : r();
        }

        @Override // com.max.mediaselector.lib.thread.PictureThreadUtils.f
        public /* bridge */ /* synthetic */ void m(Object obj) {
            if (PatchProxy.proxy(new Object[]{obj}, this, changeQuickRedirect, false, bb.c.m.f34759h0, new Class[]{Object.class}, Void.TYPE).isSupported) {
                return;
            }
            s((LocalMediaFolder) obj);
        }

        public LocalMediaFolder r() {
            PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, bb.c.m.f34713f0, new Class[0], LocalMediaFolder.class);
            if (patchProxyResultProxy.isSupported) {
                return (LocalMediaFolder) patchProxyResultProxy.result;
            }
            b bVar = b.this;
            return e.b(bVar.f75255a, bVar.f75256b.Y);
        }

        public void s(LocalMediaFolder localMediaFolder) {
            if (PatchProxy.proxy(new Object[]{localMediaFolder}, this, changeQuickRedirect, false, bb.c.m.f34736g0, new Class[]{LocalMediaFolder.class}, Void.TYPE).isSupported) {
                return;
            }
            PictureThreadUtils.d(this);
            l lVar = this.f75257p;
            if (lVar != null) {
                lVar.onComplete(localMediaFolder);
            }
        }
    }

    /* JADX INFO: renamed from: com.max.mediaselector.lib.loader.b$b, reason: collision with other inner class name */
    /* JADX INFO: compiled from: LocalMediaLoader.java */
    public class C0607b extends PictureThreadUtils.d<List<LocalMediaFolder>> {
        public static ChangeQuickRedirect changeQuickRedirect;

        /* JADX INFO: renamed from: p, reason: collision with root package name */
        final /* synthetic */ m f75259p;

        C0607b(m mVar) {
            this.f75259p = mVar;
        }

        @Override // com.max.mediaselector.lib.thread.PictureThreadUtils.f
        public /* bridge */ /* synthetic */ Object f() throws Throwable {
            PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, bb.c.m.f34874m0, new Class[0], Object.class);
            return patchProxyResultProxy.isSupported ? patchProxyResultProxy.result : r();
        }

        @Override // com.max.mediaselector.lib.thread.PictureThreadUtils.f
        public /* bridge */ /* synthetic */ void m(Object obj) {
            if (PatchProxy.proxy(new Object[]{obj}, this, changeQuickRedirect, false, bb.c.m.f34851l0, new Class[]{Object.class}, Void.TYPE).isSupported) {
                return;
            }
            s((List) obj);
        }

        /* JADX WARN: Code duplicated, block: B:101:0x02b4  */
        /* JADX WARN: Code duplicated, block: B:114:0x01e9 A[EDGE_INSN: B:114:0x01e9->B:68:0x01e9 BREAK  A[LOOP:0: B:109:0x00b2->B:84:0x0282], SYNTHETIC] */
        /* JADX WARN: Code duplicated, block: B:84:0x0282 A[LOOP:0: B:109:0x00b2->B:84:0x0282, LOOP_END] */
        public List<LocalMediaFolder> r() {
            ArrayList arrayList;
            int i10;
            String str;
            int i11;
            int i12;
            int i13;
            int i14;
            LocalMediaFolder localMediaFolder;
            String str2 = h.f75165f;
            PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, bb.c.m.f34805j0, new Class[0], List.class);
            if (patchProxyResultProxy.isSupported) {
                return (List) patchProxyResultProxy.result;
            }
            ArrayList arrayList2 = new ArrayList();
            ContentResolver contentResolver = b.this.f75255a.getContentResolver();
            Uri uri = com.max.mediaselector.lib.loader.a.f75244d;
            String[] strArr = com.max.mediaselector.lib.loader.a.f75254n;
            Cursor cursorQuery = contentResolver.query(uri, strArr, b.m(b.this), b.n(b.this), b.this.g());
            if (cursorQuery != null) {
                try {
                    try {
                        LocalMediaFolder localMediaFolder2 = new LocalMediaFolder();
                        ArrayList<LocalMedia> arrayList3 = new ArrayList<>();
                        if (cursorQuery.getCount() > 0) {
                            int columnIndexOrThrow = cursorQuery.getColumnIndexOrThrow(strArr[0]);
                            int columnIndexOrThrow2 = cursorQuery.getColumnIndexOrThrow(strArr[1]);
                            int columnIndexOrThrow3 = cursorQuery.getColumnIndexOrThrow(strArr[2]);
                            int columnIndexOrThrow4 = cursorQuery.getColumnIndexOrThrow(strArr[3]);
                            int columnIndexOrThrow5 = cursorQuery.getColumnIndexOrThrow(strArr[4]);
                            int columnIndexOrThrow6 = cursorQuery.getColumnIndexOrThrow(strArr[5]);
                            int columnIndexOrThrow7 = cursorQuery.getColumnIndexOrThrow(strArr[6]);
                            int columnIndexOrThrow8 = cursorQuery.getColumnIndexOrThrow(strArr[7]);
                            int columnIndexOrThrow9 = cursorQuery.getColumnIndexOrThrow(strArr[8]);
                            LocalMediaFolder localMediaFolder3 = localMediaFolder2;
                            int columnIndexOrThrow10 = cursorQuery.getColumnIndexOrThrow(strArr[9]);
                            int columnIndexOrThrow11 = cursorQuery.getColumnIndexOrThrow(strArr[10]);
                            cursorQuery.moveToFirst();
                            ArrayList arrayList4 = arrayList2;
                            int i15 = columnIndexOrThrow11;
                            while (true) {
                                try {
                                    long j10 = cursorQuery.getLong(columnIndexOrThrow);
                                    String string = cursorQuery.getString(columnIndexOrThrow3);
                                    if (TextUtils.isEmpty(string)) {
                                        string = f.x();
                                    }
                                    int i16 = columnIndexOrThrow;
                                    String strM = string;
                                    String string2 = cursorQuery.getString(columnIndexOrThrow2);
                                    String strN = o.e() ? com.max.mediaselector.lib.utils.l.n(j10, strM) : string2;
                                    try {
                                        if (strM.endsWith(str2)) {
                                            strM = com.max.mediaselector.lib.utils.l.m(string2);
                                            i10 = columnIndexOrThrow2;
                                            if (b.this.f75256b.E || !f.f(strM)) {
                                            }
                                            str = str2;
                                            i11 = columnIndexOrThrow10;
                                            i12 = columnIndexOrThrow3;
                                            i13 = columnIndexOrThrow4;
                                            arrayList = arrayList4;
                                            localMediaFolder = localMediaFolder3;
                                            i14 = i15;
                                            if (!cursorQuery.moveToNext()) {
                                                break;
                                            }
                                            arrayList4 = arrayList;
                                            i15 = i14;
                                            localMediaFolder3 = localMediaFolder;
                                            columnIndexOrThrow = i16;
                                            columnIndexOrThrow2 = i10;
                                            str2 = str;
                                            columnIndexOrThrow10 = i11;
                                            columnIndexOrThrow3 = i12;
                                            columnIndexOrThrow4 = i13;
                                        } else {
                                            i10 = columnIndexOrThrow2;
                                        }
                                        if (!strM.endsWith(str2) && ((b.this.f75256b.F || !strM.startsWith(f.B())) && (b.this.f75256b.G || !strM.startsWith(f.v())))) {
                                            int i17 = cursorQuery.getInt(columnIndexOrThrow4);
                                            int i18 = cursorQuery.getInt(columnIndexOrThrow5);
                                            long j11 = cursorQuery.getLong(columnIndexOrThrow6);
                                            long j12 = cursorQuery.getLong(columnIndexOrThrow7);
                                            String string3 = cursorQuery.getString(columnIndexOrThrow8);
                                            String string4 = cursorQuery.getString(columnIndexOrThrow9);
                                            long j13 = cursorQuery.getLong(columnIndexOrThrow10);
                                            if (f.i(strM) || f.e(strM)) {
                                                str = str2;
                                                PictureSelectionConfig pictureSelectionConfig = b.this.f75256b;
                                                i11 = columnIndexOrThrow10;
                                                int i19 = pictureSelectionConfig.f75051s;
                                                i12 = columnIndexOrThrow3;
                                                i13 = columnIndexOrThrow4;
                                                if (i19 <= 0 || j11 >= i19) {
                                                    int i20 = pictureSelectionConfig.f75050r;
                                                    if ((i20 <= 0 || j11 <= i20) && j11 != 0 && j12 > 0) {
                                                    }
                                                    if (!cursorQuery.moveToNext()) {
                                                        break;
                                                        break;
                                                    }
                                                    arrayList4 = arrayList;
                                                    i15 = i14;
                                                    localMediaFolder3 = localMediaFolder;
                                                    columnIndexOrThrow = i16;
                                                    columnIndexOrThrow2 = i10;
                                                    str2 = str;
                                                    columnIndexOrThrow10 = i11;
                                                    columnIndexOrThrow3 = i12;
                                                    columnIndexOrThrow4 = i13;
                                                }
                                            } else {
                                                str = str2;
                                                i11 = columnIndexOrThrow10;
                                                i12 = columnIndexOrThrow3;
                                                i13 = columnIndexOrThrow4;
                                            }
                                            i14 = i15;
                                            LocalMedia localMediaA0 = LocalMedia.a0(j10, strN, string2, string4, string3, j11, b.this.f75256b.f75029b, strM, i17, i18, j12, j13, cursorQuery.getLong(i14));
                                            arrayList = arrayList4;
                                            LocalMediaFolder localMediaFolderO = b.o(b.this, strN, strM, string3, arrayList);
                                            localMediaFolderO.o(localMediaA0.c());
                                            localMediaFolderO.c().add(localMediaA0);
                                            localMediaFolderO.y(localMediaFolderO.j() + 1);
                                            localMediaFolderO.o(localMediaA0.c());
                                            arrayList3.add(localMediaA0);
                                            localMediaFolder = localMediaFolder3;
                                            localMediaFolder.y(localMediaFolder3.j() + 1);
                                            if (!cursorQuery.moveToNext()) {
                                                break;
                                                break;
                                            }
                                            arrayList4 = arrayList;
                                            i15 = i14;
                                            localMediaFolder3 = localMediaFolder;
                                            columnIndexOrThrow = i16;
                                            columnIndexOrThrow2 = i10;
                                            str2 = str;
                                            columnIndexOrThrow10 = i11;
                                            columnIndexOrThrow3 = i12;
                                            columnIndexOrThrow4 = i13;
                                        } else {
                                            str = str2;
                                            i11 = columnIndexOrThrow10;
                                            i12 = columnIndexOrThrow3;
                                            i13 = columnIndexOrThrow4;
                                        }
                                        if (!cursorQuery.moveToNext()) {
                                            break;
                                            break;
                                        }
                                        arrayList4 = arrayList;
                                        i15 = i14;
                                        localMediaFolder3 = localMediaFolder;
                                        columnIndexOrThrow = i16;
                                        columnIndexOrThrow2 = i10;
                                        str2 = str;
                                        columnIndexOrThrow10 = i11;
                                        columnIndexOrThrow3 = i12;
                                        columnIndexOrThrow4 = i13;
                                    } catch (Exception e10) {
                                        e = e10;
                                        e.printStackTrace();
                                        if (!cursorQuery.isClosed()) {
                                        }
                                        return arrayList;
                                    }
                                    arrayList = arrayList4;
                                    localMediaFolder = localMediaFolder3;
                                    i14 = i15;
                                } catch (Exception e11) {
                                    e = e11;
                                    arrayList = arrayList4;
                                }
                            }
                            b bVar = b.this;
                            LocalMediaFolder localMediaFolderB = e.b(bVar.f75255a, bVar.f75256b.Y);
                            if (localMediaFolderB != null) {
                                arrayList.add(localMediaFolderB);
                                localMediaFolder.y(localMediaFolder.j() + localMediaFolderB.j());
                                localMediaFolder.r(localMediaFolderB.c());
                                arrayList3.addAll(0, localMediaFolderB.c());
                                if (60 > localMediaFolderB.j()) {
                                    if (arrayList3.size() > 60) {
                                        r.f(arrayList3.subList(0, 60));
                                    } else {
                                        r.f(arrayList3);
                                    }
                                }
                            }
                            if (arrayList3.size() > 0) {
                                r.e(arrayList);
                                arrayList.add(0, localMediaFolder);
                                localMediaFolder.u(arrayList3.get(0).E());
                                localMediaFolder.v(arrayList3.get(0).A());
                                localMediaFolder.w(b.this.f75256b.f75029b == h.b() ? b.this.f75255a.getString(R.string.ps_all_audio) : b.this.f75255a.getString(R.string.ps_camera_roll));
                                localMediaFolder.o(-1L);
                                localMediaFolder.r(arrayList3);
                            }
                        } else {
                            arrayList = arrayList2;
                        }
                        if (cursorQuery != null && !cursorQuery.isClosed()) {
                            cursorQuery.close();
                        }
                    } catch (Exception e12) {
                        e = e12;
                        arrayList = arrayList2;
                    }
                } catch (Throwable th2) {
                    if (!cursorQuery.isClosed()) {
                        cursorQuery.close();
                    }
                    throw th2;
                }
            } else {
                arrayList = arrayList2;
                if (cursorQuery != null) {
                    cursorQuery.close();
                }
            }
            return arrayList;
        }

        public void s(List<LocalMediaFolder> list) {
            if (PatchProxy.proxy(new Object[]{list}, this, changeQuickRedirect, false, bb.c.m.f34828k0, new Class[]{List.class}, Void.TYPE).isSupported) {
                return;
            }
            PictureThreadUtils.d(this);
            m mVar = this.f75259p;
            if (mVar != null) {
                mVar.a(list);
            }
        }
    }

    public b(Context context, PictureSelectionConfig pictureSelectionConfig) {
        this.f75255a = context;
        this.f75256b = pictureSelectionConfig;
    }

    static /* synthetic */ String m(b bVar) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{bVar}, null, changeQuickRedirect, true, bb.c.m.f34643c0, new Class[]{b.class}, String.class);
        return patchProxyResultProxy.isSupported ? (String) patchProxyResultProxy.result : bVar.q();
    }

    static /* synthetic */ String[] n(b bVar) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{bVar}, null, changeQuickRedirect, true, bb.c.m.f34667d0, new Class[]{b.class}, String[].class);
        return patchProxyResultProxy.isSupported ? (String[]) patchProxyResultProxy.result : bVar.r();
    }

    static /* synthetic */ LocalMediaFolder o(b bVar, String str, String str2, String str3, List list) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{bVar, str, str2, str3, list}, null, changeQuickRedirect, true, bb.c.m.f34690e0, new Class[]{b.class, String.class, String.class, String.class, List.class}, LocalMediaFolder.class);
        return patchProxyResultProxy.isSupported ? (LocalMediaFolder) patchProxyResultProxy.result : bVar.p(str, str2, str3, list);
    }

    private LocalMediaFolder p(String str, String str2, String str3, List<LocalMediaFolder> list) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{str, str2, str3, list}, this, changeQuickRedirect, false, bb.c.m.f34620b0, new Class[]{String.class, String.class, String.class, List.class}, LocalMediaFolder.class);
        if (patchProxyResultProxy.isSupported) {
            return (LocalMediaFolder) patchProxyResultProxy.result;
        }
        for (LocalMediaFolder localMediaFolder : list) {
            String strH = localMediaFolder.h();
            if (!TextUtils.isEmpty(strH) && TextUtils.equals(strH, str3)) {
                return localMediaFolder;
            }
        }
        LocalMediaFolder localMediaFolder2 = new LocalMediaFolder();
        localMediaFolder2.w(str3);
        localMediaFolder2.u(str);
        localMediaFolder2.v(str2);
        list.add(localMediaFolder2);
        return localMediaFolder2;
    }

    private String q() {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, bb.c.m.Z, new Class[0], String.class);
        if (patchProxyResultProxy.isSupported) {
            return (String) patchProxyResultProxy.result;
        }
        String strA = a();
        String strB = b();
        String strD = d();
        int i10 = this.f75256b.f75029b;
        if (i10 == 0) {
            return s(strA, strB, strD);
        }
        if (i10 == 1) {
            return t(strB, strD);
        }
        if (i10 == 2) {
            return u(strB, strD);
        }
        if (i10 != 3) {
            return null;
        }
        return u(strA, strD);
    }

    private String[] r() {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, bb.c.m.f34597a0, new Class[0], String[].class);
        if (patchProxyResultProxy.isSupported) {
            return (String[]) patchProxyResultProxy.result;
        }
        int i10 = this.f75256b.f75029b;
        if (i10 == 0) {
            return com.max.mediaselector.lib.loader.a.e();
        }
        if (i10 == 1) {
            return com.max.mediaselector.lib.loader.a.f(1);
        }
        if (i10 == 2) {
            return com.max.mediaselector.lib.loader.a.f(3);
        }
        if (i10 != 3) {
            return null;
        }
        return com.max.mediaselector.lib.loader.a.f(2);
    }

    private static String s(String str, String str2, String str3) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{str, str2, str3}, null, changeQuickRedirect, true, bb.c.m.V, new Class[]{String.class, String.class, String.class}, String.class);
        if (patchProxyResultProxy.isSupported) {
            return (String) patchProxyResultProxy.result;
        }
        return "(media_type=?" + str3 + " OR media_type=? AND " + str + ") AND " + str2;
    }

    private static String t(String str, String str2) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{str, str2}, null, changeQuickRedirect, true, bb.c.m.W, new Class[]{String.class, String.class}, String.class);
        if (patchProxyResultProxy.isSupported) {
            return (String) patchProxyResultProxy.result;
        }
        return "media_type=?" + str2 + " AND " + str;
    }

    private static String u(String str, String str2) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{str, str2}, null, changeQuickRedirect, true, bb.c.m.U, new Class[]{String.class, String.class}, String.class);
        if (patchProxyResultProxy.isSupported) {
            return (String) patchProxyResultProxy.result;
        }
        return "media_type=?" + str2 + " AND " + str;
    }

    @Override // com.max.mediaselector.lib.loader.a
    public void h(m<LocalMediaFolder> mVar) {
        if (PatchProxy.proxy(new Object[]{mVar}, this, changeQuickRedirect, false, bb.c.m.Y, new Class[]{m.class}, Void.TYPE).isSupported) {
            return;
        }
        PictureThreadUtils.M(new C0607b(mVar));
    }

    @Override // com.max.mediaselector.lib.loader.a
    public void j(l<LocalMediaFolder> lVar) {
        if (PatchProxy.proxy(new Object[]{lVar}, this, changeQuickRedirect, false, bb.c.m.X, new Class[]{l.class}, Void.TYPE).isSupported) {
            return;
        }
        PictureThreadUtils.M(new a(lVar));
    }
}
