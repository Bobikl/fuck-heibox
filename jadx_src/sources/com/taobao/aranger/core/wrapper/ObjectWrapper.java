package com.taobao.aranger.core.wrapper;

import android.os.Parcel;
import android.os.Parcelable;
import com.taobao.aranger.annotation.type.ServiceName;

/* JADX INFO: loaded from: classes4.dex */
public class ObjectWrapper extends BaseWrapper implements Parcelable {
    public static final Parcelable.Creator<ObjectWrapper> CREATOR = new Parcelable.Creator<ObjectWrapper>() { // from class: com.taobao.aranger.core.wrapper.ObjectWrapper.1
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public ObjectWrapper createFromParcel(Parcel parcel) {
            ObjectWrapper objectWrapper = new ObjectWrapper();
            objectWrapper.readFromParcel(parcel);
            return objectWrapper;
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public ObjectWrapper[] newArray(int i10) {
            return new ObjectWrapper[i10];
        }
    };
    private String mTimeStamp;
    private int mType;
    private Class objectClass;

    private ObjectWrapper() {
    }

    public static ObjectWrapper obtain() {
        return new ObjectWrapper();
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public Class getObjectClass() {
        return this.objectClass;
    }

    public String getTimeStamp() {
        return this.mTimeStamp;
    }

    public int getType() {
        return this.mType;
    }

    @Override // com.taobao.aranger.core.wrapper.BaseWrapper
    void readFromParcel(Parcel parcel) {
        super.readFromParcel(parcel);
        this.mTimeStamp = parcel.readString();
        this.mType = parcel.readInt();
    }

    public ObjectWrapper setObjectClass(Class<?> cls) {
        this.objectClass = cls;
        setName(((ServiceName) cls.getAnnotation(ServiceName.class)).value());
        return this;
    }

    public ObjectWrapper setTimeStamp(String str) {
        this.mTimeStamp = str;
        return this;
    }

    public ObjectWrapper setType(int i10) {
        this.mType = i10;
        return this;
    }

    @Override // com.taobao.aranger.core.wrapper.BaseWrapper, android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i10) {
        super.writeToParcel(parcel, i10);
        parcel.writeString(this.mTimeStamp);
        parcel.writeInt(this.mType);
    }
}
