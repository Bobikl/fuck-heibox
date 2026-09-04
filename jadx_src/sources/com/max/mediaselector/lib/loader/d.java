package com.max.mediaselector.lib.loader;

import android.content.Context;
import android.database.Cursor;
import android.net.Uri;
import android.text.TextUtils;
import android.util.Log;
import com.max.mediaselector.R;
import com.max.mediaselector.lib.config.PictureSelectionConfig;
import com.max.mediaselector.lib.config.f;
import com.max.mediaselector.lib.config.h;
import com.max.mediaselector.lib.entity.LocalMedia;
import com.max.mediaselector.lib.entity.LocalMediaFolder;
import com.max.mediaselector.lib.thread.PictureThreadUtils;
import com.max.mediaselector.lib.utils.l;
import com.max.mediaselector.lib.utils.o;
import com.max.mediaselector.lib.utils.r;
import com.max.mediaselector.lib.utils.u;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.PatchProxyResult;
import com.umeng.analytics.pro.ao;
import java.io.File;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import oe.m;
import oe.n;

/* JADX INFO: compiled from: LocalMediaPageLoader.java */
/* JADX INFO: loaded from: classes2.dex */
public final class d extends com.max.mediaselector.lib.loader.a {
    public static ChangeQuickRedirect changeQuickRedirect;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    private static final String[] f75261o = {ao.f104522d, "bucket_id", "bucket_display_name", "mime_type"};

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    private static final String[] f75262p = {ao.f104522d, "_data", "bucket_id", "bucket_display_name", "mime_type", "COUNT(*) AS count"};

    /* JADX INFO: compiled from: LocalMediaPageLoader.java */
    public class a extends PictureThreadUtils.d<com.max.mediaselector.lib.entity.a> {
        public static ChangeQuickRedirect changeQuickRedirect;

        /* JADX INFO: renamed from: p, reason: collision with root package name */
        final /* synthetic */ long f75263p;

        /* JADX INFO: renamed from: q, reason: collision with root package name */
        final /* synthetic */ int f75264q;

        /* JADX INFO: renamed from: r, reason: collision with root package name */
        final /* synthetic */ int f75265r;

        /* JADX INFO: renamed from: s, reason: collision with root package name */
        final /* synthetic */ int f75266s;

        /* JADX INFO: renamed from: t, reason: collision with root package name */
        final /* synthetic */ n f75267t;

        a(long j10, int i10, int i11, int i12, n nVar) {
            this.f75263p = j10;
            this.f75264q = i10;
            this.f75265r = i11;
            this.f75266s = i12;
            this.f75267t = nVar;
        }

        @Override // com.max.mediaselector.lib.thread.PictureThreadUtils.f
        public /* bridge */ /* synthetic */ Object f() throws Throwable {
            PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, bb.c.m.U0, new Class[0], Object.class);
            return patchProxyResultProxy.isSupported ? patchProxyResultProxy.result : r();
        }

        @Override // com.max.mediaselector.lib.thread.PictureThreadUtils.f
        public /* bridge */ /* synthetic */ void m(Object obj) {
            if (PatchProxy.proxy(new Object[]{obj}, this, changeQuickRedirect, false, bb.c.m.T0, new Class[]{Object.class}, Void.TYPE).isSupported) {
                return;
            }
            s((com.max.mediaselector.lib.entity.a) obj);
        }

        /* JADX WARN: Code duplicated, block: B:40:0x016c A[Catch: all -> 0x026e, Exception -> 0x0270, PHI: r5
  0x016c: PHI (r5v7 java.lang.String) = (r5v6 java.lang.String), (r5v8 java.lang.String), (r5v8 java.lang.String) binds: [B:34:0x0157, B:36:0x0163, B:38:0x0169] A[DONT_GENERATE, DONT_INLINE], TryCatch #0 {Exception -> 0x0270, blocks: (B:7:0x0020, B:9:0x0027, B:17:0x00ae, B:19:0x00b9, B:20:0x010e, B:22:0x011c, B:23:0x0120, B:25:0x012e, B:27:0x013b, B:29:0x0143, B:76:0x020d, B:33:0x0153, B:35:0x0159, B:37:0x0165, B:40:0x016c, B:43:0x0173, B:45:0x017b, B:48:0x0186, B:50:0x018e, B:53:0x0199, B:55:0x01bb, B:75:0x01f4, B:59:0x01c9, B:61:0x01d7, B:64:0x01de, B:66:0x01e2, B:80:0x0222, B:82:0x022a, B:84:0x022f, B:86:0x023d, B:88:0x0245, B:92:0x0250, B:10:0x0054, B:12:0x0059, B:15:0x008c, B:14:0x0061), top: B:117:0x0020, outer: #1 }] */
        /* JADX WARN: Code duplicated, block: B:59:0x01c9 A[Catch: all -> 0x026e, Exception -> 0x0270, TryCatch #0 {Exception -> 0x0270, blocks: (B:7:0x0020, B:9:0x0027, B:17:0x00ae, B:19:0x00b9, B:20:0x010e, B:22:0x011c, B:23:0x0120, B:25:0x012e, B:27:0x013b, B:29:0x0143, B:76:0x020d, B:33:0x0153, B:35:0x0159, B:37:0x0165, B:40:0x016c, B:43:0x0173, B:45:0x017b, B:48:0x0186, B:50:0x018e, B:53:0x0199, B:55:0x01bb, B:75:0x01f4, B:59:0x01c9, B:61:0x01d7, B:64:0x01de, B:66:0x01e2, B:80:0x0222, B:82:0x022a, B:84:0x022f, B:86:0x023d, B:88:0x0245, B:92:0x0250, B:10:0x0054, B:12:0x0059, B:15:0x008c, B:14:0x0061), top: B:117:0x0020, outer: #1 }] */
        /* JADX WARN: Code duplicated, block: B:61:0x01d7 A[Catch: all -> 0x026e, Exception -> 0x0270, TryCatch #0 {Exception -> 0x0270, blocks: (B:7:0x0020, B:9:0x0027, B:17:0x00ae, B:19:0x00b9, B:20:0x010e, B:22:0x011c, B:23:0x0120, B:25:0x012e, B:27:0x013b, B:29:0x0143, B:76:0x020d, B:33:0x0153, B:35:0x0159, B:37:0x0165, B:40:0x016c, B:43:0x0173, B:45:0x017b, B:48:0x0186, B:50:0x018e, B:53:0x0199, B:55:0x01bb, B:75:0x01f4, B:59:0x01c9, B:61:0x01d7, B:64:0x01de, B:66:0x01e2, B:80:0x0222, B:82:0x022a, B:84:0x022f, B:86:0x023d, B:88:0x0245, B:92:0x0250, B:10:0x0054, B:12:0x0059, B:15:0x008c, B:14:0x0061), top: B:117:0x0020, outer: #1 }] */
        /* JADX WARN: Code duplicated, block: B:64:0x01de A[Catch: all -> 0x026e, Exception -> 0x0270, TryCatch #0 {Exception -> 0x0270, blocks: (B:7:0x0020, B:9:0x0027, B:17:0x00ae, B:19:0x00b9, B:20:0x010e, B:22:0x011c, B:23:0x0120, B:25:0x012e, B:27:0x013b, B:29:0x0143, B:76:0x020d, B:33:0x0153, B:35:0x0159, B:37:0x0165, B:40:0x016c, B:43:0x0173, B:45:0x017b, B:48:0x0186, B:50:0x018e, B:53:0x0199, B:55:0x01bb, B:75:0x01f4, B:59:0x01c9, B:61:0x01d7, B:64:0x01de, B:66:0x01e2, B:80:0x0222, B:82:0x022a, B:84:0x022f, B:86:0x023d, B:88:0x0245, B:92:0x0250, B:10:0x0054, B:12:0x0059, B:15:0x008c, B:14:0x0061), top: B:117:0x0020, outer: #1 }] */
        public com.max.mediaselector.lib.entity.a r() {
            String strG;
            boolean z10;
            String str;
            int i10;
            int i11;
            int i12;
            int i13;
            int i14;
            String str2 = h.f75165f;
            PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, bb.c.m.R0, new Class[0], com.max.mediaselector.lib.entity.a.class);
            if (patchProxyResultProxy.isSupported) {
                return (com.max.mediaselector.lib.entity.a) patchProxyResultProxy.result;
            }
            Cursor cursorQuery = null;
            try {
                try {
                    if (o.f()) {
                        cursorQuery = d.this.f75255a.getContentResolver().query(com.max.mediaselector.lib.loader.a.f75244d, com.max.mediaselector.lib.loader.a.f75254n, l.a(d.m(d.this, this.f75263p), d.n(d.this, this.f75263p), this.f75264q, (this.f75265r - 1) * this.f75266s), null);
                    } else {
                        if (this.f75265r == -1) {
                            strG = d.this.g();
                        } else {
                            strG = d.this.g() + " limit " + this.f75264q + " offset " + ((this.f75265r - 1) * this.f75266s);
                        }
                        cursorQuery = d.this.f75255a.getContentResolver().query(com.max.mediaselector.lib.loader.a.f75244d, com.max.mediaselector.lib.loader.a.f75254n, d.m(d.this, this.f75263p), d.n(d.this, this.f75263p), strG);
                    }
                    if (cursorQuery == null) {
                        if (cursorQuery != null && !cursorQuery.isClosed()) {
                            cursorQuery.close();
                        }
                        return new com.max.mediaselector.lib.entity.a();
                    }
                    ArrayList arrayList = new ArrayList();
                    if (cursorQuery.getCount() > 0) {
                        String[] strArr = com.max.mediaselector.lib.loader.a.f75254n;
                        int columnIndexOrThrow = cursorQuery.getColumnIndexOrThrow(strArr[0]);
                        int columnIndexOrThrow2 = cursorQuery.getColumnIndexOrThrow(strArr[1]);
                        int columnIndexOrThrow3 = cursorQuery.getColumnIndexOrThrow(strArr[2]);
                        int columnIndexOrThrow4 = cursorQuery.getColumnIndexOrThrow(strArr[3]);
                        int columnIndexOrThrow5 = cursorQuery.getColumnIndexOrThrow(strArr[4]);
                        int columnIndexOrThrow6 = cursorQuery.getColumnIndexOrThrow(strArr[5]);
                        int columnIndexOrThrow7 = cursorQuery.getColumnIndexOrThrow(strArr[6]);
                        int columnIndexOrThrow8 = cursorQuery.getColumnIndexOrThrow(strArr[7]);
                        int columnIndexOrThrow9 = cursorQuery.getColumnIndexOrThrow(strArr[8]);
                        int columnIndexOrThrow10 = cursorQuery.getColumnIndexOrThrow(strArr[9]);
                        int columnIndexOrThrow11 = cursorQuery.getColumnIndexOrThrow(strArr[10]);
                        cursorQuery.moveToFirst();
                        int i15 = columnIndexOrThrow11;
                        while (true) {
                            long j10 = cursorQuery.getLong(columnIndexOrThrow);
                            String string = cursorQuery.getString(columnIndexOrThrow3);
                            if (TextUtils.isEmpty(string)) {
                                string = f.x();
                            }
                            int i16 = columnIndexOrThrow;
                            String strM = string;
                            String string2 = cursorQuery.getString(columnIndexOrThrow2);
                            String strN = o.e() ? l.n(j10, strM) : string2;
                            if (d.this.f75256b.f75057x1 && !com.max.mediaselector.lib.utils.n.t(string2)) {
                                str = str2;
                                i11 = columnIndexOrThrow10;
                                i12 = columnIndexOrThrow4;
                                i14 = i15;
                            } else if (strM.endsWith(str2)) {
                                strM = l.m(string2);
                                if (d.this.f75256b.E || !f.f(strM)) {
                                    if (!strM.endsWith(str2) && ((d.this.f75256b.F || !strM.startsWith(f.B())) && (d.this.f75256b.G || !strM.startsWith(f.v())))) {
                                        int i17 = cursorQuery.getInt(columnIndexOrThrow4);
                                        int i18 = cursorQuery.getInt(columnIndexOrThrow5);
                                        long j11 = cursorQuery.getLong(columnIndexOrThrow6);
                                        long j12 = cursorQuery.getLong(columnIndexOrThrow7);
                                        String string3 = cursorQuery.getString(columnIndexOrThrow8);
                                        String string4 = cursorQuery.getString(columnIndexOrThrow9);
                                        long j13 = cursorQuery.getLong(columnIndexOrThrow10);
                                        if (!f.i(strM) || f.e(strM)) {
                                            PictureSelectionConfig pictureSelectionConfig = d.this.f75256b;
                                            str = str2;
                                            i10 = pictureSelectionConfig.f75051s;
                                            i11 = columnIndexOrThrow10;
                                            i12 = columnIndexOrThrow4;
                                            if ((i10 <= 0 && j11 < i10) || (((i13 = pictureSelectionConfig.f75050r) > 0 && j11 > i13) || j11 == 0 || j12 <= 0)) {
                                                i14 = i15;
                                            }
                                        } else {
                                            str = str2;
                                            i11 = columnIndexOrThrow10;
                                            i12 = columnIndexOrThrow4;
                                        }
                                        i14 = i15;
                                        arrayList.add(LocalMedia.a0(j10, strN, string2, string4, string3, j11, d.this.f75256b.f75029b, strM, i17, i18, j12, j13, cursorQuery.getLong(i14)));
                                    }
                                }
                                str = str2;
                                i11 = columnIndexOrThrow10;
                                i12 = columnIndexOrThrow4;
                                i14 = i15;
                            } else {
                                if (!strM.endsWith(str2)) {
                                    int i19 = cursorQuery.getInt(columnIndexOrThrow4);
                                    int i110 = cursorQuery.getInt(columnIndexOrThrow5);
                                    long j14 = cursorQuery.getLong(columnIndexOrThrow6);
                                    long j15 = cursorQuery.getLong(columnIndexOrThrow7);
                                    String string5 = cursorQuery.getString(columnIndexOrThrow8);
                                    String string6 = cursorQuery.getString(columnIndexOrThrow9);
                                    long j16 = cursorQuery.getLong(columnIndexOrThrow10);
                                    if (f.i(strM)) {
                                        PictureSelectionConfig pictureSelectionConfig2 = d.this.f75256b;
                                        str = str2;
                                        i10 = pictureSelectionConfig2.f75051s;
                                        i11 = columnIndexOrThrow10;
                                        i12 = columnIndexOrThrow4;
                                        if (i10 <= 0) {
                                        }
                                        i14 = i15;
                                    } else {
                                        PictureSelectionConfig pictureSelectionConfig3 = d.this.f75256b;
                                        str = str2;
                                        i10 = pictureSelectionConfig3.f75051s;
                                        i11 = columnIndexOrThrow10;
                                        i12 = columnIndexOrThrow4;
                                        if (i10 <= 0) {
                                        }
                                        i14 = i15;
                                    }
                                    i14 = i15;
                                    arrayList.add(LocalMedia.a0(j10, strN, string2, string6, string5, j14, d.this.f75256b.f75029b, strM, i19, i110, j15, j16, cursorQuery.getLong(i14)));
                                }
                                str = str2;
                                i11 = columnIndexOrThrow10;
                                i12 = columnIndexOrThrow4;
                                i14 = i15;
                            }
                            if (!cursorQuery.moveToNext()) {
                                break;
                            }
                            i15 = i14;
                            columnIndexOrThrow = i16;
                            columnIndexOrThrow2 = columnIndexOrThrow2;
                            str2 = str;
                            columnIndexOrThrow4 = i12;
                            columnIndexOrThrow10 = i11;
                        }
                    }
                    if (this.f75263p == -1) {
                        z10 = true;
                        if (this.f75265r == 1) {
                            d dVar = d.this;
                            ArrayList<LocalMedia> arrayListA = e.a(dVar.f75255a, dVar.f75256b.Y);
                            if (arrayListA != null) {
                                arrayList.addAll(arrayListA);
                                r.f(arrayList);
                            }
                        }
                    } else {
                        z10 = true;
                    }
                    com.max.mediaselector.lib.entity.a aVar = new com.max.mediaselector.lib.entity.a(cursorQuery.getCount() > 0 ? z10 : false, arrayList);
                    if (!cursorQuery.isClosed()) {
                        cursorQuery.close();
                    }
                    return aVar;
                } catch (Exception e10) {
                    e10.printStackTrace();
                    Log.i(com.max.mediaselector.lib.loader.a.f75243c, "loadMedia Page Data Error: " + e10.getMessage());
                    com.max.mediaselector.lib.entity.a aVar2 = new com.max.mediaselector.lib.entity.a();
                    if (cursorQuery != null && !cursorQuery.isClosed()) {
                        cursorQuery.close();
                    }
                    return aVar2;
                }
            } catch (Throwable th2) {
                if (cursorQuery != null) {
                    cursorQuery.close();
                }
                throw th2;
            }
            if (cursorQuery != null && !cursorQuery.isClosed()) {
                cursorQuery.close();
            }
            throw th2;
        }

        public void s(com.max.mediaselector.lib.entity.a aVar) {
            if (PatchProxy.proxy(new Object[]{aVar}, this, changeQuickRedirect, false, bb.c.m.S0, new Class[]{com.max.mediaselector.lib.entity.a.class}, Void.TYPE).isSupported) {
                return;
            }
            PictureThreadUtils.d(this);
            n nVar = this.f75267t;
            if (nVar != null) {
                ArrayList<LocalMedia> arrayList = aVar.f75225b;
                if (arrayList == null) {
                    arrayList = new ArrayList<>();
                }
                nVar.a(arrayList, aVar.f75224a);
            }
        }
    }

    /* JADX INFO: compiled from: LocalMediaPageLoader.java */
    public class b extends PictureThreadUtils.d<LocalMediaFolder> {
        public static ChangeQuickRedirect changeQuickRedirect;

        /* JADX INFO: renamed from: p, reason: collision with root package name */
        final /* synthetic */ oe.l f75269p;

        b(oe.l lVar) {
            this.f75269p = lVar;
        }

        @Override // com.max.mediaselector.lib.thread.PictureThreadUtils.f
        public /* bridge */ /* synthetic */ Object f() throws Throwable {
            PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, bb.c.m.Y0, new Class[0], Object.class);
            return patchProxyResultProxy.isSupported ? patchProxyResultProxy.result : r();
        }

        @Override // com.max.mediaselector.lib.thread.PictureThreadUtils.f
        public /* bridge */ /* synthetic */ void m(Object obj) {
            if (PatchProxy.proxy(new Object[]{obj}, this, changeQuickRedirect, false, bb.c.m.X0, new Class[]{Object.class}, Void.TYPE).isSupported) {
                return;
            }
            s((LocalMediaFolder) obj);
        }

        public LocalMediaFolder r() {
            PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, bb.c.m.V0, new Class[0], LocalMediaFolder.class);
            if (patchProxyResultProxy.isSupported) {
                return (LocalMediaFolder) patchProxyResultProxy.result;
            }
            d dVar = d.this;
            return e.b(dVar.f75255a, dVar.f75256b.Y);
        }

        public void s(LocalMediaFolder localMediaFolder) {
            if (PatchProxy.proxy(new Object[]{localMediaFolder}, this, changeQuickRedirect, false, bb.c.m.W0, new Class[]{LocalMediaFolder.class}, Void.TYPE).isSupported) {
                return;
            }
            PictureThreadUtils.d(this);
            oe.l lVar = this.f75269p;
            if (lVar != null) {
                lVar.onComplete(localMediaFolder);
            }
        }
    }

    /* JADX INFO: compiled from: LocalMediaPageLoader.java */
    public class c extends PictureThreadUtils.d<List<LocalMediaFolder>> {
        public static ChangeQuickRedirect changeQuickRedirect;

        /* JADX INFO: renamed from: p, reason: collision with root package name */
        final /* synthetic */ m f75271p;

        c(m mVar) {
            this.f75271p = mVar;
        }

        @Override // com.max.mediaselector.lib.thread.PictureThreadUtils.f
        public /* bridge */ /* synthetic */ Object f() throws Throwable {
            PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, bb.c.m.f34644c1, new Class[0], Object.class);
            return patchProxyResultProxy.isSupported ? patchProxyResultProxy.result : r();
        }

        @Override // com.max.mediaselector.lib.thread.PictureThreadUtils.f
        public /* bridge */ /* synthetic */ void m(Object obj) {
            if (PatchProxy.proxy(new Object[]{obj}, this, changeQuickRedirect, false, bb.c.m.f34621b1, new Class[]{Object.class}, Void.TYPE).isSupported) {
                return;
            }
            s((List) obj);
        }

        public List<LocalMediaFolder> r() {
            int iJ;
            PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, bb.c.m.Z0, new Class[0], List.class);
            if (patchProxyResultProxy.isSupported) {
                return (List) patchProxyResultProxy.result;
            }
            Cursor cursorQuery = d.this.f75255a.getContentResolver().query(com.max.mediaselector.lib.loader.a.f75244d, o.e() ? d.f75261o : d.f75262p, d.q(d.this), d.r(d.this), d.this.g());
            if (cursorQuery != null) {
                try {
                    try {
                        int count = cursorQuery.getCount();
                        ArrayList arrayList = new ArrayList();
                        if (count > 0) {
                            String str = "mime_type";
                            String str2 = "bucket_display_name";
                            if (o.e()) {
                                HashMap map = new HashMap();
                                while (cursorQuery.moveToNext()) {
                                    long j10 = cursorQuery.getLong(cursorQuery.getColumnIndexOrThrow("bucket_id"));
                                    Long l10 = (Long) map.get(Long.valueOf(j10));
                                    map.put(Long.valueOf(j10), l10 == null ? 1L : Long.valueOf(l10.longValue() + 1));
                                }
                                if (cursorQuery.moveToFirst()) {
                                    HashSet hashSet = new HashSet();
                                    iJ = 0;
                                    while (true) {
                                        long j11 = cursorQuery.getLong(cursorQuery.getColumnIndexOrThrow("bucket_id"));
                                        if (!hashSet.contains(Long.valueOf(j11))) {
                                            LocalMediaFolder localMediaFolder = new LocalMediaFolder();
                                            localMediaFolder.o(j11);
                                            String string = cursorQuery.getString(cursorQuery.getColumnIndexOrThrow(str2));
                                            String string2 = cursorQuery.getString(cursorQuery.getColumnIndexOrThrow(str));
                                            long jLongValue = ((Long) map.get(Long.valueOf(j11))).longValue();
                                            long j12 = cursorQuery.getLong(cursorQuery.getColumnIndexOrThrow(ao.f104522d));
                                            localMediaFolder.w(string);
                                            localMediaFolder.y(u.h(Long.valueOf(jLongValue)));
                                            localMediaFolder.u(l.n(j12, string2));
                                            localMediaFolder.v(string2);
                                            arrayList.add(localMediaFolder);
                                            hashSet.add(Long.valueOf(j11));
                                            iJ = (int) (((long) iJ) + jLongValue);
                                        }
                                        if (!cursorQuery.moveToNext()) {
                                            break;
                                        }
                                        str = str;
                                        str2 = str2;
                                    }
                                } else {
                                    iJ = 0;
                                }
                            } else {
                                String str3 = "mime_type";
                                String str4 = "bucket_display_name";
                                cursorQuery.moveToFirst();
                                int i10 = 0;
                                while (true) {
                                    LocalMediaFolder localMediaFolder2 = new LocalMediaFolder();
                                    long j13 = cursorQuery.getLong(cursorQuery.getColumnIndexOrThrow("bucket_id"));
                                    String str5 = str4;
                                    String string3 = cursorQuery.getString(cursorQuery.getColumnIndexOrThrow(str5));
                                    String str6 = str3;
                                    String string4 = cursorQuery.getString(cursorQuery.getColumnIndexOrThrow(str6));
                                    int i11 = cursorQuery.getInt(cursorQuery.getColumnIndexOrThrow("count"));
                                    localMediaFolder2.o(j13);
                                    localMediaFolder2.u(cursorQuery.getString(cursorQuery.getColumnIndexOrThrow("_data")));
                                    localMediaFolder2.w(string3);
                                    localMediaFolder2.v(string4);
                                    localMediaFolder2.y(i11);
                                    arrayList.add(localMediaFolder2);
                                    i10 += i11;
                                    if (!cursorQuery.moveToNext()) {
                                        break;
                                    }
                                    str4 = str5;
                                    str3 = str6;
                                }
                                iJ = i10;
                            }
                            LocalMediaFolder localMediaFolder3 = new LocalMediaFolder();
                            d dVar = d.this;
                            LocalMediaFolder localMediaFolderB = e.b(dVar.f75255a, dVar.f75256b.Y);
                            if (localMediaFolderB != null) {
                                arrayList.add(localMediaFolderB);
                                long jLastModified = new File(localMediaFolderB.d()).lastModified();
                                iJ += localMediaFolderB.j();
                                localMediaFolder3.r(new ArrayList<>());
                                if (cursorQuery.moveToFirst()) {
                                    localMediaFolder3.u(o.e() ? d.s(cursorQuery) : d.t(cursorQuery));
                                    localMediaFolder3.v(d.u(cursorQuery));
                                    if (jLastModified > (f.c(localMediaFolder3.d()) ? new File(com.max.mediaselector.lib.utils.n.m(d.this.f75255a, Uri.parse(localMediaFolder3.d()))).lastModified() : new File(localMediaFolder3.d()).lastModified())) {
                                        localMediaFolder3.u(localMediaFolderB.d());
                                        localMediaFolder3.v(localMediaFolderB.f());
                                    }
                                }
                            } else if (cursorQuery.moveToFirst()) {
                                localMediaFolder3.u(o.e() ? d.s(cursorQuery) : d.t(cursorQuery));
                                localMediaFolder3.v(d.u(cursorQuery));
                            }
                            r.e(arrayList);
                            localMediaFolder3.y(iJ);
                            localMediaFolder3.o(-1L);
                            localMediaFolder3.w(d.this.f75256b.f75029b == h.b() ? d.this.f75255a.getString(R.string.ps_all_audio) : d.this.f75255a.getString(R.string.ps_camera_roll));
                            arrayList.add(0, localMediaFolder3);
                            PictureSelectionConfig pictureSelectionConfig = d.this.f75256b;
                            if (pictureSelectionConfig.G3 && pictureSelectionConfig.f75029b == h.a()) {
                                d.v(d.this, arrayList);
                            }
                            if (!cursorQuery.isClosed()) {
                                cursorQuery.close();
                            }
                            return arrayList;
                        }
                        if (cursorQuery != null && !cursorQuery.isClosed()) {
                            cursorQuery.close();
                        }
                    } catch (Exception e10) {
                        e10.printStackTrace();
                        Log.i(com.max.mediaselector.lib.loader.a.f75243c, "loadAllMedia Data Error: " + e10.getMessage());
                        if (!cursorQuery.isClosed()) {
                        }
                        return new ArrayList();
                    }
                } catch (Throwable th2) {
                    if (!cursorQuery.isClosed()) {
                        cursorQuery.close();
                    }
                    throw th2;
                }
            } else if (cursorQuery != null) {
                cursorQuery.close();
            }
            return new ArrayList();
        }

        public void s(List<LocalMediaFolder> list) {
            if (PatchProxy.proxy(new Object[]{list}, this, changeQuickRedirect, false, bb.c.m.f34598a1, new Class[]{List.class}, Void.TYPE).isSupported) {
                return;
            }
            PictureThreadUtils.d(this);
            m mVar = this.f75271p;
            if (mVar != null) {
                mVar.a(list);
            }
        }
    }

    public d(Context context, PictureSelectionConfig pictureSelectionConfig) {
        this.f75255a = context;
        this.f75256b = pictureSelectionConfig;
    }

    private String A(long j10) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{new Long(j10)}, this, changeQuickRedirect, false, bb.c.m.C0, new Class[]{Long.TYPE}, String.class);
        if (patchProxyResultProxy.isSupported) {
            return (String) patchProxyResultProxy.result;
        }
        String strA = a();
        String strB = b();
        String strD = d();
        int i10 = this.f75256b.f75029b;
        if (i10 == 0) {
            return C(j10, strD, strA, strB);
        }
        if (i10 == 1) {
            return D(j10, strD, strB);
        }
        if (i10 == 2 || i10 == 3) {
            return E(j10, strD, strA, strB);
        }
        return null;
    }

    private String[] B(long j10) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{new Long(j10)}, this, changeQuickRedirect, false, bb.c.m.G0, new Class[]{Long.TYPE}, String[].class);
        if (patchProxyResultProxy.isSupported) {
            return (String[]) patchProxyResultProxy.result;
        }
        int i10 = this.f75256b.f75029b;
        if (i10 == 0) {
            return j10 == -1 ? new String[]{String.valueOf(1), String.valueOf(3)} : new String[]{String.valueOf(1), String.valueOf(3), u.l(Long.valueOf(j10))};
        }
        if (i10 == 1) {
            return J(1, j10);
        }
        if (i10 == 2) {
            return J(3, j10);
        }
        if (i10 != 3) {
            return null;
        }
        return J(2, j10);
    }

    private static String C(long j10, String str, String str2, String str3) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{new Long(j10), str, str2, str3}, null, changeQuickRedirect, true, bb.c.m.D0, new Class[]{Long.TYPE, String.class, String.class, String.class}, String.class);
        if (patchProxyResultProxy.isSupported) {
            return (String) patchProxyResultProxy.result;
        }
        StringBuilder sb2 = new StringBuilder();
        sb2.append("(");
        sb2.append("media_type");
        sb2.append("=?");
        sb2.append(str);
        sb2.append(" OR ");
        sb2.append("media_type");
        sb2.append("=? AND ");
        sb2.append(str2);
        sb2.append(") AND ");
        if (j10 == -1) {
            sb2.append(str3);
            return sb2.toString();
        }
        sb2.append("bucket_id");
        sb2.append("=? AND ");
        sb2.append(str3);
        return sb2.toString();
    }

    private static String D(long j10, String str, String str2) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{new Long(j10), str, str2}, null, changeQuickRedirect, true, bb.c.m.E0, new Class[]{Long.TYPE, String.class, String.class}, String.class);
        if (patchProxyResultProxy.isSupported) {
            return (String) patchProxyResultProxy.result;
        }
        StringBuilder sb2 = new StringBuilder();
        sb2.append("(");
        sb2.append("media_type");
        sb2.append("=?");
        if (j10 == -1) {
            sb2.append(str);
            sb2.append(") AND ");
            sb2.append(str2);
            return sb2.toString();
        }
        sb2.append(str);
        sb2.append(") AND ");
        sb2.append("bucket_id");
        sb2.append("=? AND ");
        sb2.append(str2);
        return sb2.toString();
    }

    private static String E(long j10, String str, String str2, String str3) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{new Long(j10), str, str2, str3}, null, changeQuickRedirect, true, bb.c.m.F0, new Class[]{Long.TYPE, String.class, String.class, String.class}, String.class);
        if (patchProxyResultProxy.isSupported) {
            return (String) patchProxyResultProxy.result;
        }
        StringBuilder sb2 = new StringBuilder();
        sb2.append("(");
        sb2.append("media_type");
        sb2.append("=?");
        sb2.append(str);
        sb2.append(" AND ");
        sb2.append(str2);
        sb2.append(") AND ");
        if (j10 == -1) {
            sb2.append(str3);
            return sb2.toString();
        }
        sb2.append("bucket_id");
        sb2.append("=? AND ");
        sb2.append(str3);
        return sb2.toString();
    }

    private String F() {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, bb.c.m.H0, new Class[0], String.class);
        if (patchProxyResultProxy.isSupported) {
            return (String) patchProxyResultProxy.result;
        }
        String strB = b();
        String strD = d();
        int i10 = this.f75256b.f75029b;
        if (i10 == 0) {
            return H(a(), strB, strD);
        }
        if (i10 == 1) {
            return I(strD, strB);
        }
        if (i10 == 2 || i10 == 3) {
            return K(strD, strB);
        }
        return null;
    }

    private String[] G() {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, bb.c.m.I0, new Class[0], String[].class);
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

    private static String H(String str, String str2, String str3) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{str, str2, str3}, null, changeQuickRedirect, true, bb.c.m.f34897n0, new Class[]{String.class, String.class, String.class}, String.class);
        if (patchProxyResultProxy.isSupported) {
            return (String) patchProxyResultProxy.result;
        }
        StringBuilder sb2 = new StringBuilder();
        sb2.append("(");
        sb2.append("media_type");
        sb2.append("=?");
        sb2.append(str3);
        sb2.append(" OR ");
        sb2.append("media_type");
        sb2.append("=? AND ");
        sb2.append(str);
        sb2.append(") AND ");
        sb2.append(str2);
        if (o.e()) {
            return sb2.toString();
        }
        sb2.append(")");
        sb2.append(" GROUP BY (bucket_id");
        return sb2.toString();
    }

    private static String I(String str, String str2) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{str, str2}, null, changeQuickRedirect, true, bb.c.m.f34920o0, new Class[]{String.class, String.class}, String.class);
        if (patchProxyResultProxy.isSupported) {
            return (String) patchProxyResultProxy.result;
        }
        StringBuilder sb2 = new StringBuilder();
        if (o.e()) {
            sb2.append("media_type");
            sb2.append("=?");
            sb2.append(str);
            sb2.append(" AND ");
            sb2.append(str2);
            return sb2.toString();
        }
        sb2.append("(");
        sb2.append("media_type");
        sb2.append("=?");
        sb2.append(str);
        sb2.append(") AND ");
        sb2.append(str2);
        sb2.append(")");
        sb2.append(" GROUP BY (bucket_id");
        return sb2.toString();
    }

    private static String[] J(int i10, long j10) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{new Integer(i10), new Long(j10)}, null, changeQuickRedirect, true, bb.c.m.f34966q0, new Class[]{Integer.TYPE, Long.TYPE}, String[].class);
        if (patchProxyResultProxy.isSupported) {
            return (String[]) patchProxyResultProxy.result;
        }
        return j10 == -1 ? new String[]{String.valueOf(i10)} : new String[]{String.valueOf(i10), u.l(Long.valueOf(j10))};
    }

    private static String K(String str, String str2) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{str, str2}, null, changeQuickRedirect, true, bb.c.m.f34943p0, new Class[]{String.class, String.class}, String.class);
        if (patchProxyResultProxy.isSupported) {
            return (String) patchProxyResultProxy.result;
        }
        StringBuilder sb2 = new StringBuilder();
        if (o.e()) {
            sb2.append("media_type");
            sb2.append("=?");
            sb2.append(str);
            sb2.append(" AND ");
            sb2.append(str2);
            return sb2.toString();
        }
        sb2.append("(");
        sb2.append("media_type");
        sb2.append("=?");
        sb2.append(str);
        sb2.append(") AND ");
        sb2.append(str2);
        sb2.append(")");
        sb2.append(" GROUP BY (bucket_id");
        return sb2.toString();
    }

    private void L(List<LocalMediaFolder> list) throws Throwable {
        if (PatchProxy.proxy(new Object[]{list}, this, changeQuickRedirect, false, bb.c.m.f35142y0, new Class[]{List.class}, Void.TYPE).isSupported) {
            return;
        }
        for (int i10 = 0; i10 < list.size(); i10++) {
            LocalMediaFolder localMediaFolder = list.get(i10);
            if (localMediaFolder != null) {
                String strC = c(localMediaFolder.a());
                if (!TextUtils.isEmpty(strC)) {
                    localMediaFolder.u(strC);
                }
            }
        }
    }

    static /* synthetic */ String m(d dVar, long j10) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{dVar, new Long(j10)}, null, changeQuickRedirect, true, bb.c.m.J0, new Class[]{d.class, Long.TYPE}, String.class);
        return patchProxyResultProxy.isSupported ? (String) patchProxyResultProxy.result : dVar.A(j10);
    }

    static /* synthetic */ String[] n(d dVar, long j10) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{dVar, new Long(j10)}, null, changeQuickRedirect, true, bb.c.m.K0, new Class[]{d.class, Long.TYPE}, String[].class);
        return patchProxyResultProxy.isSupported ? (String[]) patchProxyResultProxy.result : dVar.B(j10);
    }

    static /* synthetic */ String q(d dVar) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{dVar}, null, changeQuickRedirect, true, bb.c.m.L0, new Class[]{d.class}, String.class);
        return patchProxyResultProxy.isSupported ? (String) patchProxyResultProxy.result : dVar.F();
    }

    static /* synthetic */ String[] r(d dVar) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{dVar}, null, changeQuickRedirect, true, bb.c.m.M0, new Class[]{d.class}, String[].class);
        return patchProxyResultProxy.isSupported ? (String[]) patchProxyResultProxy.result : dVar.G();
    }

    static /* synthetic */ String s(Cursor cursor) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{cursor}, null, changeQuickRedirect, true, bb.c.m.N0, new Class[]{Cursor.class}, String.class);
        return patchProxyResultProxy.isSupported ? (String) patchProxyResultProxy.result : y(cursor);
    }

    static /* synthetic */ String t(Cursor cursor) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{cursor}, null, changeQuickRedirect, true, bb.c.m.O0, new Class[]{Cursor.class}, String.class);
        return patchProxyResultProxy.isSupported ? (String) patchProxyResultProxy.result : z(cursor);
    }

    static /* synthetic */ String u(Cursor cursor) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{cursor}, null, changeQuickRedirect, true, bb.c.m.P0, new Class[]{Cursor.class}, String.class);
        return patchProxyResultProxy.isSupported ? (String) patchProxyResultProxy.result : x(cursor);
    }

    static /* synthetic */ void v(d dVar, List list) throws Throwable {
        if (PatchProxy.proxy(new Object[]{dVar, list}, null, changeQuickRedirect, true, bb.c.m.Q0, new Class[]{d.class, List.class}, Void.TYPE).isSupported) {
            return;
        }
        dVar.L(list);
    }

    public static File w(Context context, Uri uri) {
        String string;
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{context, uri}, null, changeQuickRedirect, true, bb.c.m.f35076v0, new Class[]{Context.class, Uri.class}, File.class);
        if (patchProxyResultProxy.isSupported) {
            return (File) patchProxyResultProxy.result;
        }
        Cursor cursorQuery = context.getContentResolver().query(uri, new String[]{"_data"}, null, null, null);
        if (cursorQuery != null) {
            int columnIndexOrThrow = cursorQuery.getColumnIndexOrThrow("_data");
            cursorQuery.moveToFirst();
            string = cursorQuery.getString(columnIndexOrThrow);
            cursorQuery.close();
        } else {
            Log.e("FileUtils", "Cursor is null for URI: " + uri);
            string = null;
        }
        if (string != null) {
            return new File(string);
        }
        return null;
    }

    private static String x(Cursor cursor) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{cursor}, null, changeQuickRedirect, true, bb.c.m.A0, new Class[]{Cursor.class}, String.class);
        return patchProxyResultProxy.isSupported ? (String) patchProxyResultProxy.result : cursor.getString(cursor.getColumnIndexOrThrow("mime_type"));
    }

    private static String y(Cursor cursor) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{cursor}, null, changeQuickRedirect, true, bb.c.m.f35164z0, new Class[]{Cursor.class}, String.class);
        return patchProxyResultProxy.isSupported ? (String) patchProxyResultProxy.result : l.n(cursor.getLong(cursor.getColumnIndexOrThrow(ao.f104522d)), cursor.getString(cursor.getColumnIndexOrThrow("mime_type")));
    }

    private static String z(Cursor cursor) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{cursor}, null, changeQuickRedirect, true, bb.c.m.B0, new Class[]{Cursor.class}, String.class);
        return patchProxyResultProxy.isSupported ? (String) patchProxyResultProxy.result : cursor.getString(cursor.getColumnIndexOrThrow("_data"));
    }

    @Override // com.max.mediaselector.lib.loader.a
    public String c(long j10) throws Throwable {
        Cursor cursor;
        Cursor cursorQuery;
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{new Long(j10)}, this, changeQuickRedirect, false, bb.c.m.f34988r0, new Class[]{Long.TYPE}, String.class);
        if (patchProxyResultProxy.isSupported) {
            return (String) patchProxyResultProxy.result;
        }
        Cursor cursor2 = null;
        try {
            if (o.f()) {
                cursorQuery = this.f75255a.getContentResolver().query(com.max.mediaselector.lib.loader.a.f75244d, new String[]{ao.f104522d, "mime_type", "_data"}, l.a(A(j10), B(j10), 1, 0), null);
            } else {
                cursorQuery = this.f75255a.getContentResolver().query(com.max.mediaselector.lib.loader.a.f75244d, new String[]{ao.f104522d, "mime_type", "_data"}, A(j10), B(j10), g() + " limit 1 offset 0");
            }
            if (cursorQuery != null) {
                try {
                    if (cursorQuery.getCount() > 0) {
                        if (!cursorQuery.moveToFirst()) {
                            if (!cursorQuery.isClosed()) {
                                cursorQuery.close();
                            }
                            return null;
                        }
                        String strN = o.e() ? l.n(cursorQuery.getLong(cursorQuery.getColumnIndexOrThrow(ao.f104522d)), cursorQuery.getString(cursorQuery.getColumnIndexOrThrow("mime_type"))) : cursorQuery.getString(cursorQuery.getColumnIndexOrThrow("_data"));
                        if (!cursorQuery.isClosed()) {
                            cursorQuery.close();
                        }
                        return strN;
                    }
                } catch (Exception e10) {
                    cursor = cursorQuery;
                    e = e10;
                    try {
                        e.printStackTrace();
                        if (cursor != null && !cursor.isClosed()) {
                            cursor.close();
                        }
                    } catch (Throwable th2) {
                        th = th2;
                        cursor2 = cursor;
                        if (cursor2 != null && !cursor2.isClosed()) {
                            cursor2.close();
                        }
                        throw th;
                    }
                } catch (Throwable th3) {
                    cursor2 = cursorQuery;
                    th = th3;
                    if (cursor2 != null) {
                        cursor2.close();
                    }
                    throw th;
                }
            }
            if (cursorQuery != null && !cursorQuery.isClosed()) {
                cursorQuery.close();
            }
        } catch (Exception e11) {
            e = e11;
            cursor = null;
        } catch (Throwable th4) {
            th = th4;
        }
        return null;
    }

    @Override // com.max.mediaselector.lib.loader.a
    public void h(m<LocalMediaFolder> mVar) {
        if (PatchProxy.proxy(new Object[]{mVar}, this, changeQuickRedirect, false, bb.c.m.f35120x0, new Class[]{m.class}, Void.TYPE).isSupported) {
            return;
        }
        PictureThreadUtils.M(new c(mVar));
    }

    @Override // com.max.mediaselector.lib.loader.a
    public void i(long j10, int i10, n<LocalMedia> nVar) {
        if (PatchProxy.proxy(new Object[]{new Long(j10), new Integer(i10), nVar}, this, changeQuickRedirect, false, bb.c.m.f35010s0, new Class[]{Long.TYPE, Integer.TYPE, n.class}, Void.TYPE).isSupported) {
            return;
        }
        k(j10, 1, i10, i10, nVar);
    }

    @Override // com.max.mediaselector.lib.loader.a
    public void j(oe.l<LocalMediaFolder> lVar) {
        if (PatchProxy.proxy(new Object[]{lVar}, this, changeQuickRedirect, false, bb.c.m.f35098w0, new Class[]{oe.l.class}, Void.TYPE).isSupported) {
            return;
        }
        PictureThreadUtils.M(new b(lVar));
    }

    @Override // com.max.mediaselector.lib.loader.a
    public void k(long j10, int i10, int i11, int i12, n<LocalMedia> nVar) {
        Object[] objArr = {new Long(j10), new Integer(i10), new Integer(i11), new Integer(i12), nVar};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        Class cls = Integer.TYPE;
        if (PatchProxy.proxy(objArr, this, changeQuickRedirect2, false, bb.c.m.f35054u0, new Class[]{Long.TYPE, cls, cls, cls, n.class}, Void.TYPE).isSupported) {
            return;
        }
        PictureThreadUtils.M(new a(j10, i11, i10, i12, nVar));
    }

    @Override // com.max.mediaselector.lib.loader.a
    public void l(long j10, int i10, int i11, n<LocalMedia> nVar) {
        Object[] objArr = {new Long(j10), new Integer(i10), new Integer(i11), nVar};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        Class cls = Integer.TYPE;
        if (PatchProxy.proxy(objArr, this, changeQuickRedirect2, false, bb.c.m.f35032t0, new Class[]{Long.TYPE, cls, cls, n.class}, Void.TYPE).isSupported) {
            return;
        }
        k(j10, i10, i11, i11, nVar);
    }
}
