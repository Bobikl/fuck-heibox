package com.google.android.exoplayer2.text;

import android.os.Bundle;
import android.os.Parcel;
import com.umeng.analytics.pro.ak;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: compiled from: CueEncoder.java */
/* JADX INFO: loaded from: classes7.dex */
public final class d {
    public byte[] a(List<b> list) {
        ArrayList<Bundle> arrayListG = com.google.android.exoplayer2.util.d.g(list);
        Bundle bundle = new Bundle();
        bundle.putParcelableArrayList(ak.aF, arrayListG);
        Parcel parcelObtain = Parcel.obtain();
        parcelObtain.writeBundle(bundle);
        byte[] bArrMarshall = parcelObtain.marshall();
        parcelObtain.recycle();
        return bArrMarshall;
    }
}
