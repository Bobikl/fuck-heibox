package x8;

import android.content.Intent;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import androidx.annotation.n0;
import androidx.annotation.p0;
import com.google.android.gms.common.internal.p;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import com.google.android.gms.internal.common.zzag;
import java.util.ArrayList;
import java.util.Iterator;
import org.jsoup.parser.ParseErrorList;
import z8.c;
import z8.d0;

/* JADX INFO: compiled from: com.google.android.gms:play-services-basement@@18.1.0 */
/* JADX INFO: loaded from: classes7.dex */
@v8.a
@d0
public final class b {
    private b() {
    }

    @n0
    @v8.a
    public static <T extends SafeParcelable> T a(@n0 byte[] bArr, @n0 Parcelable.Creator<T> creator) {
        p.l(creator);
        Parcel parcelObtain = Parcel.obtain();
        parcelObtain.unmarshall(bArr, 0, bArr.length);
        parcelObtain.setDataPosition(0);
        T tCreateFromParcel = creator.createFromParcel(parcelObtain);
        parcelObtain.recycle();
        return tCreateFromParcel;
    }

    @v8.a
    @p0
    public static <T extends SafeParcelable> T b(@n0 Intent intent, @n0 String str, @n0 Parcelable.Creator<T> creator) {
        byte[] byteArrayExtra = intent.getByteArrayExtra(str);
        if (byteArrayExtra == null) {
            return null;
        }
        return (T) a(byteArrayExtra, creator);
    }

    @n0
    @v8.a
    public static <T extends SafeParcelable> T c(@n0 String str, @n0 Parcelable.Creator<T> creator) {
        return (T) a(c.b(str), creator);
    }

    @p0
    @Deprecated
    public static <T extends SafeParcelable> ArrayList<T> d(@n0 Bundle bundle, @n0 String str, @n0 Parcelable.Creator<T> creator) {
        ArrayList arrayList = (ArrayList) bundle.getSerializable(str);
        if (arrayList == null) {
            return null;
        }
        ParseErrorList parseErrorList = (ArrayList<T>) new ArrayList(arrayList.size());
        int size = arrayList.size();
        for (int i10 = 0; i10 < size; i10++) {
            parseErrorList.add(a((byte[]) arrayList.get(i10), creator));
        }
        return parseErrorList;
    }

    @v8.a
    @p0
    public static <T extends SafeParcelable> ArrayList<T> e(@n0 Bundle bundle, @n0 String str, @n0 Parcelable.Creator<T> creator) {
        return f(bundle.getByteArray(str), creator);
    }

    @p0
    public static <T extends SafeParcelable> ArrayList<T> f(@p0 byte[] bArr, @n0 Parcelable.Creator<T> creator) {
        if (bArr == null) {
            return null;
        }
        int length = bArr.length;
        Parcel parcelObtain = Parcel.obtain();
        parcelObtain.unmarshall(bArr, 0, length);
        parcelObtain.setDataPosition(0);
        try {
            ArrayList<T> arrayList = new ArrayList<>();
            parcelObtain.readTypedList(arrayList, creator);
            return arrayList;
        } finally {
            parcelObtain.recycle();
        }
    }

    @v8.a
    @p0
    @Deprecated
    public static <T extends SafeParcelable> ArrayList<T> g(@n0 Intent intent, @n0 String str, @n0 Parcelable.Creator<T> creator) {
        ArrayList arrayList = (ArrayList) intent.getSerializableExtra(str);
        if (arrayList == null) {
            return null;
        }
        ParseErrorList parseErrorList = (ArrayList<T>) new ArrayList(arrayList.size());
        int size = arrayList.size();
        for (int i10 = 0; i10 < size; i10++) {
            parseErrorList.add(a((byte[]) arrayList.get(i10), creator));
        }
        return parseErrorList;
    }

    @v8.a
    @p0
    public static <T extends SafeParcelable> ArrayList<T> h(@n0 Intent intent, @n0 String str, @n0 Parcelable.Creator<T> creator) {
        return f(intent.getByteArrayExtra(str), creator);
    }

    @Deprecated
    public static <T extends SafeParcelable> void i(@n0 Iterable<T> iterable, @n0 Bundle bundle, @n0 String str) {
        ArrayList arrayList = new ArrayList();
        Iterator<T> it = iterable.iterator();
        while (it.hasNext()) {
            arrayList.add(m(it.next()));
        }
        bundle.putSerializable(str, arrayList);
    }

    public static <T extends SafeParcelable> void j(@n0 Iterable<T> iterable, @n0 Bundle bundle, @n0 String str) {
        bundle.putByteArray(str, p(iterable));
    }

    @v8.a
    @Deprecated
    public static <T extends SafeParcelable> void k(@n0 Iterable<T> iterable, @n0 Intent intent, @n0 String str) {
        ArrayList arrayList = new ArrayList();
        Iterator<T> it = iterable.iterator();
        while (it.hasNext()) {
            arrayList.add(m(it.next()));
        }
        intent.putExtra(str, arrayList);
    }

    @v8.a
    public static <T extends SafeParcelable> void l(@n0 Iterable<T> iterable, @n0 Intent intent, @n0 String str) {
        intent.putExtra(str, p(iterable));
    }

    @n0
    @v8.a
    public static <T extends SafeParcelable> byte[] m(@n0 T t10) {
        Parcel parcelObtain = Parcel.obtain();
        t10.writeToParcel(parcelObtain, 0);
        byte[] bArrMarshall = parcelObtain.marshall();
        parcelObtain.recycle();
        return bArrMarshall;
    }

    @v8.a
    public static <T extends SafeParcelable> void n(@n0 T t10, @n0 Intent intent, @n0 String str) {
        intent.putExtra(str, m(t10));
    }

    @n0
    @v8.a
    public static <T extends SafeParcelable> String o(@n0 T t10) {
        return c.e(m(t10));
    }

    private static byte[] p(Iterable iterable) {
        Parcel parcelObtain = Parcel.obtain();
        try {
            parcelObtain.writeTypedList(zzag.o(iterable));
            return parcelObtain.marshall();
        } finally {
            parcelObtain.recycle();
        }
    }
}
