package com.max.mediaselector.lib.loader.repository;

import android.content.Context;
import android.database.Cursor;
import android.net.Uri;
import android.provider.MediaStore;
import android.text.TextUtils;
import androidx.paging.PagingState;
import androidx.paging.q0;
import bb.c;
import com.max.heybox.hblog.g;
import com.max.mediaselector.lib.config.f;
import com.max.mediaselector.lib.config.h;
import com.max.mediaselector.lib.entity.LocalMedia;
import com.max.mediaselector.lib.utils.l;
import com.max.mediaselector.lib.utils.o;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.PatchProxyResult;
import dl.d;
import dl.e;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.List;
import kotlin.NoWhenBranchMatchedException;
import kotlin.b2;
import kotlin.enums.EnumEntriesKt;
import kotlin.jvm.internal.f0;
import kotlin.jvm.internal.u;

/* JADX INFO: compiled from: GalleryMediaItemPagingSource.kt */
/* JADX INFO: loaded from: classes2.dex */
public final class GalleryMediaItemPagingSource extends q0<Integer, LocalMedia> {
    public static ChangeQuickRedirect changeQuickRedirect = null;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    @d
    public static final a f75273e = new a(null);

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    @d
    private static final String f75274f = "GalleryMediaItemPagingSource-dbg";

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @d
    private final WeakReference<Context> f75275c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @d
    private final MediaType f75276d;

    /* JADX INFO: compiled from: GalleryMediaItemPagingSource.kt */
    public enum MediaType {
        ONLY_VIDEO,
        ONLY_IMAGE;

        private static final /* synthetic */ kotlin.enums.a $ENTRIES = EnumEntriesKt.b(values());
        public static ChangeQuickRedirect changeQuickRedirect;

        @d
        public static kotlin.enums.a<MediaType> getEntries() {
            return $ENTRIES;
        }

        public static MediaType valueOf(String str) {
            PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{str}, null, changeQuickRedirect, true, c.m.f34875m1, new Class[]{String.class}, MediaType.class);
            return (MediaType) (patchProxyResultProxy.isSupported ? patchProxyResultProxy.result : Enum.valueOf(MediaType.class, str));
        }

        /* JADX INFO: renamed from: values, reason: to resolve conflict with enum method */
        public static MediaType[] valuesCustom() {
            PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[0], null, changeQuickRedirect, true, c.m.f34852l1, new Class[0], MediaType[].class);
            return (MediaType[]) (patchProxyResultProxy.isSupported ? patchProxyResultProxy.result : values().clone());
        }
    }

    /* JADX INFO: compiled from: GalleryMediaItemPagingSource.kt */
    public static final class a {
        private a() {
        }

        public /* synthetic */ a(u uVar) {
            this();
        }
    }

    /* JADX INFO: compiled from: GalleryMediaItemPagingSource.kt */
    public final /* synthetic */ class b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f75277a;

        static {
            int[] iArr = new int[MediaType.valuesCustom().length];
            try {
                iArr[MediaType.ONLY_VIDEO.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[MediaType.ONLY_IMAGE.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            f75277a = iArr;
        }
    }

    public GalleryMediaItemPagingSource(@d WeakReference<Context> contextRef, @d MediaType mediaType) {
        f0.p(contextRef, "contextRef");
        f0.p(mediaType, "mediaType");
        this.f75275c = contextRef;
        this.f75276d = mediaType;
    }

    private final List<LocalMedia> l(int i10, int i11) {
        Cursor cursorM;
        int iD;
        ArrayList arrayList;
        Object[] objArr = {new Integer(i10), new Integer(i11)};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        Class cls = Integer.TYPE;
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(objArr, this, changeQuickRedirect2, false, c.m.f34783i1, new Class[]{cls, cls}, List.class);
        if (patchProxyResultProxy.isSupported) {
            return (List) patchProxyResultProxy.result;
        }
        ArrayList arrayList2 = new ArrayList();
        Context context = this.f75275c.get();
        if (context != null && (cursorM = m(context, i10, i11)) != null) {
            try {
                if (cursorM.getCount() <= 0) {
                    g.f74531b.v("[GalleryMediaItemPagingSource-dbg][loadPageMediaData] count: " + cursorM.getCount());
                    arrayList = arrayList2;
                } else {
                    String[] strArr = com.max.mediaselector.lib.loader.a.f75254n;
                    int columnIndexOrThrow = cursorM.getColumnIndexOrThrow(strArr[0]);
                    int columnIndexOrThrow2 = cursorM.getColumnIndexOrThrow(strArr[1]);
                    int columnIndexOrThrow3 = cursorM.getColumnIndexOrThrow(strArr[2]);
                    int columnIndexOrThrow4 = cursorM.getColumnIndexOrThrow(strArr[3]);
                    int columnIndexOrThrow5 = cursorM.getColumnIndexOrThrow(strArr[4]);
                    int columnIndexOrThrow6 = cursorM.getColumnIndexOrThrow(strArr[5]);
                    int columnIndexOrThrow7 = cursorM.getColumnIndexOrThrow(strArr[6]);
                    int columnIndexOrThrow8 = cursorM.getColumnIndexOrThrow(strArr[7]);
                    int columnIndexOrThrow9 = cursorM.getColumnIndexOrThrow(strArr[8]);
                    int columnIndexOrThrow10 = cursorM.getColumnIndexOrThrow(strArr[9]);
                    int columnIndexOrThrow11 = cursorM.getColumnIndexOrThrow(strArr[10]);
                    cursorM.moveToFirst();
                    while (true) {
                        long j10 = cursorM.getLong(columnIndexOrThrow);
                        String string = cursorM.getString(columnIndexOrThrow3);
                        if (TextUtils.isEmpty(string)) {
                            string = f.x();
                        }
                        int i12 = columnIndexOrThrow;
                        String str = string;
                        String string2 = cursorM.getString(columnIndexOrThrow2);
                        String strN = o.e() ? l.n(j10, str) : string2;
                        f0.m(str);
                        int i13 = columnIndexOrThrow2;
                        ArrayList arrayList3 = arrayList2;
                        int i14 = columnIndexOrThrow3;
                        String strM = kotlin.text.u.K1(str, h.f75165f, false, 2, null) ? l.m(string2) : str;
                        int i15 = cursorM.getInt(columnIndexOrThrow4);
                        int i16 = cursorM.getInt(columnIndexOrThrow5);
                        long j11 = cursorM.getLong(columnIndexOrThrow6);
                        long j12 = cursorM.getLong(columnIndexOrThrow7);
                        String string3 = cursorM.getString(columnIndexOrThrow8);
                        String string4 = cursorM.getString(columnIndexOrThrow9);
                        long j13 = cursorM.getLong(columnIndexOrThrow10);
                        int i17 = b.f75277a[this.f75276d.ordinal()];
                        if (i17 == 1) {
                            iD = h.d();
                        } else {
                            if (i17 != 2) {
                                throw new NoWhenBranchMatchedException();
                            }
                            iD = h.c();
                        }
                        LocalMedia localMediaA0 = LocalMedia.a0(j10, strN, string2, string4, string3, j11, iD, strM, i15, i16, j12, j13, cursorM.getLong(columnIndexOrThrow11));
                        localMediaA0.G0(0);
                        arrayList = arrayList3;
                        arrayList.add(localMediaA0);
                        if (!cursorM.moveToNext()) {
                            break;
                        }
                        columnIndexOrThrow = i12;
                        arrayList2 = arrayList;
                        columnIndexOrThrow2 = i13;
                        columnIndexOrThrow3 = i14;
                    }
                }
                b2 b2Var = b2.f124493a;
                kotlin.io.b.a(cursorM, null);
                return arrayList;
            } catch (Throwable th2) {
                try {
                    throw th2;
                } catch (Throwable th3) {
                    kotlin.io.b.a(cursorM, th2);
                    throw th3;
                }
            }
        }
        return arrayList2;
    }

    private final Cursor m(Context context, int i10, int i11) {
        Uri uri;
        Object[] objArr = {context, new Integer(i10), new Integer(i11)};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        Class cls = Integer.TYPE;
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(objArr, this, changeQuickRedirect2, false, c.m.f34806j1, new Class[]{Context.class, cls, cls}, Cursor.class);
        if (patchProxyResultProxy.isSupported) {
            return (Cursor) patchProxyResultProxy.result;
        }
        int i12 = b.f75277a[this.f75276d.ordinal()];
        if (i12 == 1) {
            uri = MediaStore.Video.Media.EXTERNAL_CONTENT_URI;
        } else {
            if (i12 != 2) {
                throw new NoWhenBranchMatchedException();
            }
            uri = MediaStore.Images.Media.EXTERNAL_CONTENT_URI;
        }
        if (o.f()) {
            return context.getContentResolver().query(uri, com.max.mediaselector.lib.loader.a.f75254n, l.a(null, null, i11, i10 * i11), null);
        }
        return context.getContentResolver().query(MediaStore.Files.getContentUri("external"), com.max.mediaselector.lib.loader.a.f75254n, "media_type = ?", this.f75276d == MediaType.ONLY_IMAGE ? new String[]{"1"} : new String[]{"3"}, "date_modified DESC limit " + i11 + " offset " + (i10 * i11));
    }

    /* JADX WARN: Type inference failed for: r9v2, types: [java.lang.Integer, java.lang.Object] */
    @Override // androidx.paging.q0
    public /* bridge */ /* synthetic */ Integer f(PagingState<Integer, LocalMedia> pagingState) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{pagingState}, this, changeQuickRedirect, false, c.m.f34829k1, new Class[]{PagingState.class}, Object.class);
        return patchProxyResultProxy.isSupported ? patchProxyResultProxy.result : k(pagingState);
    }

    @Override // androidx.paging.q0
    @e
    public Object h(@d q0.a<Integer> aVar, @d kotlin.coroutines.c<? super q0.b<Integer, LocalMedia>> cVar) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{aVar, cVar}, this, changeQuickRedirect, false, c.m.f34760h1, new Class[]{q0.a.class, kotlin.coroutines.c.class}, Object.class);
        if (patchProxyResultProxy.isSupported) {
            return patchProxyResultProxy.result;
        }
        try {
            Integer numA = aVar.a();
            int iIntValue = numA != null ? numA.intValue() : 0;
            List<LocalMedia> listL = l(iIntValue, aVar.getLoadSize());
            return new q0.b.Page(listL, iIntValue > 0 ? kotlin.coroutines.jvm.internal.a.f(iIntValue - 1) : null, listL.isEmpty() ^ true ? kotlin.coroutines.jvm.internal.a.f(iIntValue + 1) : null);
        } catch (Exception e10) {
            g.f74531b.v("[GalleryMediaItemPagingSource-dbg][load] error: " + e10);
            return new q0.b.Error(e10);
        }
    }

    @e
    public Integer k(@d PagingState<Integer, LocalMedia> state) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{state}, this, changeQuickRedirect, false, c.m.f34737g1, new Class[]{PagingState.class}, Integer.class);
        if (patchProxyResultProxy.isSupported) {
            return (Integer) patchProxyResultProxy.result;
        }
        f0.p(state, "state");
        return null;
    }
}
