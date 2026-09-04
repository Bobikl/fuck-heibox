package androidx.core.provider;

import android.content.ContentResolver;
import android.content.ContentUris;
import android.content.Context;
import android.content.pm.PackageManager;
import android.content.pm.ProviderInfo;
import android.content.pm.Signature;
import android.content.res.Resources;
import android.database.Cursor;
import android.net.Uri;
import android.os.CancellationSignal;
import androidx.annotation.j1;
import androidx.annotation.n0;
import androidx.annotation.p0;
import androidx.annotation.u;
import androidx.annotation.w0;
import com.umeng.analytics.pro.ao;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

/* JADX INFO: compiled from: FontProvider.java */
/* JADX INFO: loaded from: classes.dex */
public class g {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final Comparator<byte[]> f21006a = new Comparator() { // from class: androidx.core.provider.f
        @Override // java.util.Comparator
        public final int compare(Object obj, Object obj2) {
            return g.g((byte[]) obj, (byte[]) obj2);
        }
    };

    /* JADX INFO: compiled from: FontProvider.java */
    @w0(16)
    public static class a {
        private a() {
        }

        @u
        static Cursor a(ContentResolver contentResolver, Uri uri, String[] strArr, String str, String[] strArr2, String str2, Object obj) {
            return contentResolver.query(uri, strArr, str, strArr2, str2, (CancellationSignal) obj);
        }
    }

    private g() {
    }

    private static List<byte[]> b(Signature[] signatureArr) {
        ArrayList arrayList = new ArrayList();
        for (Signature signature : signatureArr) {
            arrayList.add(signature.toByteArray());
        }
        return arrayList;
    }

    private static boolean c(List<byte[]> list, List<byte[]> list2) {
        if (list.size() != list2.size()) {
            return false;
        }
        for (int i10 = 0; i10 < list.size(); i10++) {
            if (!Arrays.equals(list.get(i10), list2.get(i10))) {
                return false;
            }
        }
        return true;
    }

    private static List<List<byte[]>> d(h hVar, Resources resources) {
        return hVar.b() != null ? hVar.b() : androidx.core.content.res.f.c(resources, hVar.c());
    }

    @n0
    static j.b e(@n0 Context context, @n0 h hVar, @p0 CancellationSignal cancellationSignal) throws PackageManager.NameNotFoundException {
        ProviderInfo providerInfoF = f(context.getPackageManager(), hVar, context.getResources());
        return providerInfoF == null ? j.b.a(1, null) : j.b.a(0, h(context, hVar, providerInfoF.authority, cancellationSignal));
    }

    @j1
    @p0
    static ProviderInfo f(@n0 PackageManager packageManager, @n0 h hVar, @p0 Resources resources) throws PackageManager.NameNotFoundException {
        String strF = hVar.f();
        ProviderInfo providerInfoResolveContentProvider = packageManager.resolveContentProvider(strF, 0);
        if (providerInfoResolveContentProvider == null) {
            throw new PackageManager.NameNotFoundException("No package found for authority: " + strF);
        }
        if (!providerInfoResolveContentProvider.packageName.equals(hVar.g())) {
            throw new PackageManager.NameNotFoundException("Found content provider " + strF + ", but package was not " + hVar.g());
        }
        List<byte[]> listB = b(packageManager.getPackageInfo(providerInfoResolveContentProvider.packageName, 64).signatures);
        Collections.sort(listB, f21006a);
        List<List<byte[]>> listD = d(hVar, resources);
        for (int i10 = 0; i10 < listD.size(); i10++) {
            ArrayList arrayList = new ArrayList(listD.get(i10));
            Collections.sort(arrayList, f21006a);
            if (c(listB, arrayList)) {
                return providerInfoResolveContentProvider;
            }
        }
        return null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ int g(byte[] bArr, byte[] bArr2) {
        if (bArr.length != bArr2.length) {
            return bArr.length - bArr2.length;
        }
        for (int i10 = 0; i10 < bArr.length; i10++) {
            byte b10 = bArr[i10];
            byte b11 = bArr2[i10];
            if (b10 != b11) {
                return b10 - b11;
            }
        }
        return 0;
    }

    @j1
    @n0
    static j.c[] h(Context context, h hVar, String str, CancellationSignal cancellationSignal) {
        ArrayList arrayList = new ArrayList();
        Uri uriBuild = new Uri.Builder().scheme("content").authority(str).build();
        Uri uriBuild2 = new Uri.Builder().scheme("content").authority(str).appendPath("file").build();
        Cursor cursorA = null;
        try {
            int i10 = 0;
            cursorA = a.a(context.getContentResolver(), uriBuild, new String[]{ao.f104522d, j.a.f21032a, j.a.f21033b, j.a.f21034c, j.a.f21035d, j.a.f21036e, j.a.f21037f}, "query = ?", new String[]{hVar.h()}, null, cancellationSignal);
            if (cursorA != null && cursorA.getCount() > 0) {
                int columnIndex = cursorA.getColumnIndex(j.a.f21037f);
                ArrayList arrayList2 = new ArrayList();
                int columnIndex2 = cursorA.getColumnIndex(ao.f104522d);
                int columnIndex3 = cursorA.getColumnIndex(j.a.f21032a);
                int columnIndex4 = cursorA.getColumnIndex(j.a.f21033b);
                int columnIndex5 = cursorA.getColumnIndex(j.a.f21035d);
                int columnIndex6 = cursorA.getColumnIndex(j.a.f21036e);
                while (cursorA.moveToNext()) {
                    int i11 = columnIndex != -1 ? cursorA.getInt(columnIndex) : i10;
                    arrayList2.add(j.c.a(columnIndex3 == -1 ? ContentUris.withAppendedId(uriBuild, cursorA.getLong(columnIndex2)) : ContentUris.withAppendedId(uriBuild2, cursorA.getLong(columnIndex3)), columnIndex4 != -1 ? cursorA.getInt(columnIndex4) : i10, columnIndex5 != -1 ? cursorA.getInt(columnIndex5) : 400, columnIndex6 != -1 && cursorA.getInt(columnIndex6) == 1, i11));
                    i10 = 0;
                }
                arrayList = arrayList2;
            }
            return (j.c[]) arrayList.toArray(new j.c[0]);
        } finally {
            if (cursorA != null) {
                cursorA.close();
            }
        }
    }
}
