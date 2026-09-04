package com.google.android.exoplayer2.text;

import android.os.Bundle;
import android.os.Parcel;
import com.google.common.collect.ImmutableList;
import java.util.ArrayList;

/* JADX INFO: compiled from: CueDecoder.java */
/* JADX INFO: loaded from: classes7.dex */
public final class c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    static final String f49407a = "c";

    public ImmutableList<b> a(byte[] bArr) {
        Parcel parcelObtain = Parcel.obtain();
        parcelObtain.unmarshall(bArr, 0, bArr.length);
        parcelObtain.setDataPosition(0);
        Bundle bundle = parcelObtain.readBundle(Bundle.class.getClassLoader());
        parcelObtain.recycle();
        return com.google.android.exoplayer2.util.d.b(b.W, (ArrayList) com.google.android.exoplayer2.util.a.g(bundle.getParcelableArrayList("c")));
    }
}
