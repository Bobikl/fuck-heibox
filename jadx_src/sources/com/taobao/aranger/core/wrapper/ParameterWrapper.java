package com.taobao.aranger.core.wrapper;

import android.os.IBinder;
import android.os.Parcel;
import android.os.Parcelable;
import com.taobao.aranger.exception.IPCException;
import com.taobao.aranger.logs.IPCLog;
import com.taobao.aranger.utils.SerializeUtils;
import com.taobao.aranger.utils.TypeCenter;
import com.taobao.aranger.utils.TypeUtils;
import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/* JADX INFO: loaded from: classes4.dex */
public class ParameterWrapper extends BaseWrapper implements Parcelable {
    private IBinder mClientServiceBinder;
    private Object mData;
    private int mFlowFlag = 0;
    private String mTimeStamp;
    private static final String TAG = ParameterWrapper.class.getSimpleName();
    public static final Parcelable.Creator<ParameterWrapper> CREATOR = new Parcelable.Creator<ParameterWrapper>() { // from class: com.taobao.aranger.core.wrapper.ParameterWrapper.1
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public ParameterWrapper createFromParcel(Parcel parcel) {
            ParameterWrapper parameterWrapperObtain = ParameterWrapper.obtain();
            parameterWrapperObtain.readFromParcel(parcel);
            return parameterWrapperObtain;
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public ParameterWrapper[] newArray(int i10) {
            return new ParameterWrapper[i10];
        }
    };

    private ParameterWrapper() {
    }

    public static ParameterWrapper obtain() {
        return new ParameterWrapper();
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public Class<?> getClassType() throws IPCException {
        Object obj = this.mData;
        if (obj != null) {
            return obj.getClass();
        }
        if (getName() != null) {
            return TypeCenter.getInstance().getClassType(getName());
        }
        return null;
    }

    public IBinder getClientServiceBinder() {
        return this.mClientServiceBinder;
    }

    public Object getData() {
        return this.mData;
    }

    public int getFlowFlag() {
        return this.mFlowFlag;
    }

    public String getTimeStamp() {
        return this.mTimeStamp;
    }

    @Override // com.taobao.aranger.core.wrapper.BaseWrapper
    void readFromParcel(Parcel parcel) {
        super.readFromParcel(parcel);
        this.mFlowFlag = parcel.readInt();
        if (parcel.readInt() == 0) {
            this.mTimeStamp = parcel.readString();
        }
        if (parcel.readInt() == 0) {
            this.mClientServiceBinder = parcel.readStrongBinder();
        }
        this.mData = SerializeUtils.readFromParcel(getClass().getClassLoader(), parcel);
    }

    public ParameterWrapper setClientServiceBinder(IBinder iBinder) {
        this.mClientServiceBinder = iBinder;
        return this;
    }

    public ParameterWrapper setData(Object obj) {
        this.mData = obj;
        if (obj == null) {
            setName(null);
            return this;
        }
        Class<?> cls = obj.getClass();
        setName(TypeUtils.getClassId(cls));
        if (this.mFlowFlag == 1) {
            if (cls.isArray()) {
                this.mData = Array.newInstance(cls.getComponentType(), TypeUtils.getObjectArraySize(cls.getName(), this.mData));
            } else if (List.class.isAssignableFrom(cls)) {
                this.mData = new ArrayList();
            } else if (Map.class.isAssignableFrom(cls)) {
                this.mData = new HashMap();
            } else {
                try {
                    this.mData = cls.getDeclaredConstructor(new Class[0]).newInstance(new Object[0]);
                } catch (Exception e10) {
                    IPCLog.e(TAG, "[setData][newInstance]", e10, new Object[0]);
                }
            }
        }
        return this;
    }

    public ParameterWrapper setFlowFlag(int i10) {
        this.mFlowFlag = i10;
        return this;
    }

    public ParameterWrapper setParameterName(String str) {
        setName(str);
        return this;
    }

    public ParameterWrapper setTimeStamp(String str) {
        this.mTimeStamp = str;
        return this;
    }

    @Override // com.taobao.aranger.core.wrapper.BaseWrapper, android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i10) {
        super.writeToParcel(parcel, i10);
        parcel.writeInt(this.mFlowFlag);
        if (this.mTimeStamp != null) {
            parcel.writeInt(0);
            parcel.writeString(this.mTimeStamp);
        } else {
            parcel.writeInt(1);
        }
        if (this.mClientServiceBinder != null) {
            parcel.writeInt(0);
            parcel.writeStrongBinder(this.mClientServiceBinder);
        } else {
            parcel.writeInt(1);
        }
        SerializeUtils.writeToParcel(parcel, this.mData, i10, false);
    }
}
