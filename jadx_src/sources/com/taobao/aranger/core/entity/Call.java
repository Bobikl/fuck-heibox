package com.taobao.aranger.core.entity;

import android.net.Uri;
import android.os.Parcel;
import android.os.Parcelable;
import com.taobao.aranger.core.wrapper.MethodWrapper;
import com.taobao.aranger.core.wrapper.ObjectWrapper;
import com.taobao.aranger.core.wrapper.ParameterWrapper;
import com.taobao.aranger.utils.SerializeUtils;

/* JADX INFO: loaded from: classes4.dex */
public class Call implements Parcelable {
    public static final Parcelable.Creator<Call> CREATOR = new Parcelable.Creator<Call>() { // from class: com.taobao.aranger.core.entity.Call.1
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public Call createFromParcel(Parcel parcel) {
            Call callObtain = Call.obtain();
            callObtain.readFromParcel(parcel);
            return callObtain;
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public Call[] newArray(int i10) {
            return new Call[i10];
        }
    };
    private boolean isOneWay;
    private long mDataSize;
    private MethodWrapper mMethodWrapper;
    private ObjectWrapper mObjectWrapper;
    private ParameterWrapper[] mParameterWrappers;
    private Uri mRemoteProviderUri;

    private Call() {
    }

    public static Call obtain() {
        return new Call();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void readFromParcel(Parcel parcel) {
        this.mObjectWrapper = ObjectWrapper.CREATOR.createFromParcel(parcel);
        this.mMethodWrapper = MethodWrapper.CREATOR.createFromParcel(parcel);
        this.mParameterWrappers = (ParameterWrapper[]) SerializeUtils.readFromParcel(getClass().getClassLoader(), parcel);
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public long getDataSize() {
        return this.mDataSize;
    }

    public MethodWrapper getMethodWrapper() {
        return this.mMethodWrapper;
    }

    public ObjectWrapper getObjectWrapper() {
        return this.mObjectWrapper;
    }

    public ParameterWrapper[] getParameterWrappers() {
        return this.mParameterWrappers;
    }

    public Uri getRemoteProviderUri() {
        return this.mRemoteProviderUri;
    }

    public boolean isOneWay() {
        return this.isOneWay;
    }

    public Call setMethodWrapper(MethodWrapper methodWrapper) {
        this.mMethodWrapper = methodWrapper;
        return this;
    }

    public Call setObjectWrapper(ObjectWrapper objectWrapper) {
        this.mObjectWrapper = objectWrapper;
        return this;
    }

    public Call setOneWay(boolean z10) {
        this.isOneWay = z10;
        return this;
    }

    public Call setParameterWrappers(ParameterWrapper[] parameterWrapperArr) {
        this.mParameterWrappers = parameterWrapperArr;
        return this;
    }

    public Call setRemoteProviderUri(Uri uri) {
        this.mRemoteProviderUri = uri;
        return this;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i10) {
        this.mObjectWrapper.writeToParcel(parcel, i10);
        this.mMethodWrapper.writeToParcel(parcel, i10);
        this.mDataSize = SerializeUtils.writeToParcel(parcel, this.mParameterWrappers, i10, true);
    }
}
