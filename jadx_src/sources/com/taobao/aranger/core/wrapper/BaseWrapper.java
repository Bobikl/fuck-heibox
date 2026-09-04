package com.taobao.aranger.core.wrapper;

import android.os.Parcel;

/* JADX INFO: loaded from: classes4.dex */
public class BaseWrapper {
    private String mName;

    public String getName() {
        return this.mName;
    }

    void readFromParcel(Parcel parcel) {
        this.mName = parcel.readString();
    }

    void setName(String str) {
        this.mName = str;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void writeToParcel(Parcel parcel, int i10) {
        parcel.writeString(this.mName);
    }
}
