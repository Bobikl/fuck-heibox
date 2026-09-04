package com.huawei.hms.common.internal.safeparcel;

import android.content.Intent;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import com.huawei.hms.common.internal.Preconditions;
import com.huawei.hms.common.util.Base64Utils;
import java.util.ArrayList;
import java.util.Iterator;
import org.jsoup.parser.ParseErrorList;

/* JADX INFO: loaded from: classes7.dex */
public final class SafeParcelableSerializer {
    public static <S extends SafeParcelable> S deserializeFromBytes(byte[] bArr, Parcelable.Creator<S> creator) {
        Preconditions.checkNotNull(creator);
        Parcel parcelObtain = Parcel.obtain();
        parcelObtain.unmarshall(bArr, 0, bArr.length);
        parcelObtain.setDataPosition(0);
        S sCreateFromParcel = creator.createFromParcel(parcelObtain);
        parcelObtain.recycle();
        return sCreateFromParcel;
    }

    public static <S extends SafeParcelable> S deserializeFromIntentExtra(Intent intent, String str, Parcelable.Creator<S> creator) {
        byte[] byteArrayExtra = intent.getByteArrayExtra(str);
        if (byteArrayExtra == null) {
            return null;
        }
        return (S) deserializeFromBytes(byteArrayExtra, creator);
    }

    public static <S extends SafeParcelable> S deserializeFromString(String str, Parcelable.Creator<S> creator) {
        return (S) deserializeFromBytes(Base64Utils.decodeUrlSafe(str), creator);
    }

    public static <S extends SafeParcelable> ArrayList<S> deserializeIterableFromBundle(Bundle bundle, String str, Parcelable.Creator<S> creator) {
        ArrayList arrayList;
        if (bundle == null || (arrayList = (ArrayList) bundle.getSerializable(str)) == null) {
            return null;
        }
        ParseErrorList parseErrorList = (ArrayList<S>) new ArrayList(arrayList.size());
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            parseErrorList.add(deserializeFromBytes((byte[]) it.next(), creator));
        }
        return parseErrorList;
    }

    public static <S extends SafeParcelable> ArrayList<S> deserializeIterableFromIntentExtra(Intent intent, String str, Parcelable.Creator<S> creator) {
        ArrayList arrayList = (ArrayList) intent.getSerializableExtra(str);
        if (arrayList == null) {
            return null;
        }
        ParseErrorList parseErrorList = (ArrayList<S>) new ArrayList(arrayList.size());
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            parseErrorList.add(deserializeFromBytes((byte[]) it.next(), creator));
        }
        return parseErrorList;
    }

    public static <S extends SafeParcelable> void serializeIterableToBundle(Iterable<S> iterable, Bundle bundle, String str) {
        ArrayList arrayList = new ArrayList();
        Iterator<S> it = iterable.iterator();
        while (it.hasNext()) {
            arrayList.add(serializeToBytes(it.next()));
        }
        bundle.putSerializable(str, arrayList);
    }

    public static <S extends SafeParcelable> void serializeIterableToIntentExtra(Iterable<S> iterable, Intent intent, String str) {
        ArrayList arrayList = new ArrayList();
        Iterator<S> it = iterable.iterator();
        while (it.hasNext()) {
            arrayList.add(serializeToBytes(it.next()));
        }
        intent.putExtra(str, arrayList);
    }

    public static <S extends SafeParcelable> byte[] serializeToBytes(S s10) {
        Parcel parcelObtain = Parcel.obtain();
        s10.writeToParcel(parcelObtain, 0);
        byte[] bArrMarshall = parcelObtain.marshall();
        parcelObtain.recycle();
        return bArrMarshall;
    }

    public static <S extends SafeParcelable> void serializeToIntentExtra(S s10, Intent intent, String str) {
        intent.putExtra(str, serializeToBytes(s10));
    }

    public static <S extends SafeParcelable> String serializeToString(S s10) {
        return Base64Utils.encodeUrlSafe(serializeToBytes(s10));
    }
}
