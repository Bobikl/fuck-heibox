package androidx.versionedparcelable;

import android.os.Bundle;
import android.os.Parcelable;
import androidx.annotation.RestrictTo;
import androidx.annotation.n0;
import androidx.annotation.p0;
import java.io.InputStream;
import java.io.OutputStream;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: compiled from: ParcelUtils.java */
/* JADX INFO: loaded from: classes6.dex */
public class c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final String f28182a = "a";

    private c() {
    }

    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP_PREFIX})
    public static <T extends g> T a(InputStream inputStream) {
        return (T) new f(inputStream, null).g0();
    }

    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP_PREFIX})
    public static <T extends g> T b(Parcelable parcelable) {
        if (parcelable instanceof ParcelImpl) {
            return (T) ((ParcelImpl) parcelable).a();
        }
        throw new IllegalArgumentException("Invalid parcel");
    }

    @p0
    public static <T extends g> T c(@n0 Bundle bundle, @n0 String str) {
        try {
            Bundle bundle2 = (Bundle) bundle.getParcelable(str);
            if (bundle2 == null) {
                return null;
            }
            bundle2.setClassLoader(c.class.getClassLoader());
            return (T) b(bundle2.getParcelable("a"));
        } catch (RuntimeException unused) {
            return null;
        }
    }

    @p0
    public static <T extends g> List<T> d(Bundle bundle, String str) {
        ArrayList arrayList = new ArrayList();
        try {
            Bundle bundle2 = (Bundle) bundle.getParcelable(str);
            bundle2.setClassLoader(c.class.getClassLoader());
            Iterator it = bundle2.getParcelableArrayList("a").iterator();
            while (it.hasNext()) {
                arrayList.add(b((Parcelable) it.next()));
            }
            return arrayList;
        } catch (RuntimeException unused) {
            return null;
        }
    }

    public static void e(@n0 Bundle bundle, @n0 String str, @p0 g gVar) {
        if (gVar == null) {
            return;
        }
        Bundle bundle2 = new Bundle();
        bundle2.putParcelable("a", h(gVar));
        bundle.putParcelable(str, bundle2);
    }

    public static void f(@n0 Bundle bundle, @n0 String str, @n0 List<? extends g> list) {
        Bundle bundle2 = new Bundle();
        ArrayList<? extends Parcelable> arrayList = new ArrayList<>();
        Iterator<? extends g> it = list.iterator();
        while (it.hasNext()) {
            arrayList.add(h(it.next()));
        }
        bundle2.putParcelableArrayList("a", arrayList);
        bundle.putParcelable(str, bundle2);
    }

    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP_PREFIX})
    public static void g(g gVar, OutputStream outputStream) {
        f fVar = new f(null, outputStream);
        fVar.l1(gVar);
        fVar.a();
    }

    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP_PREFIX})
    public static Parcelable h(g gVar) {
        return new ParcelImpl(gVar);
    }
}
