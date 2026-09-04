package com.tencent.mmkv;

import android.os.Parcel;
import android.os.ParcelFileDescriptor;
import android.os.Parcelable;
import java.io.IOException;

/* JADX INFO: loaded from: classes4.dex */
public final class ParcelableMMKV implements Parcelable {
    public static final Parcelable.Creator<ParcelableMMKV> CREATOR = new Parcelable.Creator<ParcelableMMKV>() { // from class: com.tencent.mmkv.ParcelableMMKV.1
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public ParcelableMMKV createFromParcel(Parcel parcel) {
            String string = parcel.readString();
            ParcelFileDescriptor parcelFileDescriptor = (ParcelFileDescriptor) ParcelFileDescriptor.CREATOR.createFromParcel(parcel);
            ParcelFileDescriptor parcelFileDescriptor2 = (ParcelFileDescriptor) ParcelFileDescriptor.CREATOR.createFromParcel(parcel);
            String string2 = parcel.readString();
            if (parcelFileDescriptor == null || parcelFileDescriptor2 == null) {
                return null;
            }
            return new ParcelableMMKV(string, parcelFileDescriptor.detachFd(), parcelFileDescriptor2.detachFd(), string2);
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public ParcelableMMKV[] newArray(int i10) {
            return new ParcelableMMKV[i10];
        }
    };
    private int ashmemFD;
    private int ashmemMetaFD;
    private String cryptKey;
    private final String mmapID;

    public ParcelableMMKV(MMKV mmkv) {
        this.ashmemFD = -1;
        this.ashmemMetaFD = -1;
        this.cryptKey = null;
        this.mmapID = mmkv.mmapID();
        this.ashmemFD = mmkv.ashmemFD();
        this.ashmemMetaFD = mmkv.ashmemMetaFD();
        this.cryptKey = mmkv.cryptKey();
    }

    private ParcelableMMKV(String str, int i10, int i11, String str2) {
        this.mmapID = str;
        this.ashmemFD = i10;
        this.ashmemMetaFD = i11;
        this.cryptKey = str2;
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 1;
    }

    public MMKV toMMKV() {
        int i10;
        int i11 = this.ashmemFD;
        if (i11 < 0 || (i10 = this.ashmemMetaFD) < 0) {
            return null;
        }
        return MMKV.mmkvWithAshmemFD(this.mmapID, i11, i10, this.cryptKey);
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i10) {
        try {
            parcel.writeString(this.mmapID);
            ParcelFileDescriptor parcelFileDescriptorFromFd = ParcelFileDescriptor.fromFd(this.ashmemFD);
            ParcelFileDescriptor parcelFileDescriptorFromFd2 = ParcelFileDescriptor.fromFd(this.ashmemMetaFD);
            int i11 = i10 | 1;
            parcelFileDescriptorFromFd.writeToParcel(parcel, i11);
            parcelFileDescriptorFromFd2.writeToParcel(parcel, i11);
            String str = this.cryptKey;
            if (str != null) {
                parcel.writeString(str);
            }
        } catch (IOException e10) {
            e10.printStackTrace();
        }
    }
}
