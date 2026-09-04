package com.taobao.aranger.core.wrapper;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: loaded from: classes4.dex */
public class MethodWrapper extends BaseWrapper implements Parcelable {
    public static final Parcelable.Creator<MethodWrapper> CREATOR = new Parcelable.Creator<MethodWrapper>() { // from class: com.taobao.aranger.core.wrapper.MethodWrapper.1
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public MethodWrapper createFromParcel(Parcel parcel) {
            MethodWrapper methodWrapperObtain = MethodWrapper.obtain();
            methodWrapperObtain.readFromParcel(parcel);
            return methodWrapperObtain;
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public MethodWrapper[] newArray(int i10) {
            return new MethodWrapper[i10];
        }
    };
    private String[] mParameterTypes;
    private String mReturnType;

    private MethodWrapper() {
    }

    public static MethodWrapper obtain() {
        return new MethodWrapper();
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public String[] getParameterTypes() {
        return this.mParameterTypes;
    }

    public String getReturnType() {
        return this.mReturnType;
    }

    @Override // com.taobao.aranger.core.wrapper.BaseWrapper
    void readFromParcel(Parcel parcel) {
        super.readFromParcel(parcel);
        this.mParameterTypes = parcel.createStringArray();
        this.mReturnType = parcel.readString();
    }

    public MethodWrapper setMethodName(String str) {
        setName(str);
        return this;
    }

    public MethodWrapper setParameterTypes(String[] strArr) {
        this.mParameterTypes = strArr;
        return this;
    }

    public MethodWrapper setReturnType(String str) {
        this.mReturnType = str;
        return this;
    }

    @Override // com.taobao.aranger.core.wrapper.BaseWrapper, android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i10) {
        super.writeToParcel(parcel, i10);
        parcel.writeStringArray(this.mParameterTypes);
        parcel.writeString(this.mReturnType);
    }
}
