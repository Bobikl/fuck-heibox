package com.taobao.aranger.core.entity;

import android.os.Parcel;
import android.os.Parcelable;
import com.taobao.aranger.core.wrapper.ParameterWrapper;
import com.taobao.aranger.utils.SerializeUtils;

/* JADX INFO: loaded from: classes4.dex */
public class Reply implements Parcelable {
    public static final Parcelable.Creator<Reply> CREATOR = new Parcelable.Creator<Reply>() { // from class: com.taobao.aranger.core.entity.Reply.1
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public Reply createFromParcel(Parcel parcel) {
            Reply replyObtain = Reply.obtain();
            replyObtain.readFromParcel(parcel);
            return replyObtain;
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public Reply[] newArray(int i10) {
            return new Reply[i10];
        }
    };
    private int mErrorCode;
    private String mErrorMessage;
    private ParameterWrapper[] mFlowParameterWrappers;
    private long mInvokeTime;
    private Object mResult;

    private Reply() {
    }

    public static Reply obtain() {
        return new Reply();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void readFromParcel(Parcel parcel) {
        this.mErrorCode = parcel.readInt();
        if (parcel.readInt() == 0) {
            this.mErrorMessage = parcel.readString();
        }
        if (parcel.readInt() == 0) {
            this.mFlowParameterWrappers = (ParameterWrapper[]) SerializeUtils.readFromParcel(getClass().getClassLoader(), parcel);
        }
        this.mInvokeTime = parcel.readLong();
        this.mResult = SerializeUtils.readFromParcel(getClass().getClassLoader(), parcel);
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public int getErrorCode() {
        return this.mErrorCode;
    }

    public String getErrorMessage() {
        return this.mErrorMessage;
    }

    public ParameterWrapper[] getFlowParameterWrappers() {
        return this.mFlowParameterWrappers;
    }

    public long getInvokeTime() {
        return this.mInvokeTime;
    }

    public Object getResult() {
        return this.mResult;
    }

    public boolean isError() {
        return this.mErrorCode != 0;
    }

    public Reply setErrorCode(int i10) {
        this.mErrorCode = i10;
        return this;
    }

    public Reply setErrorMessage(String str) {
        this.mErrorMessage = str;
        return this;
    }

    public Reply setFlowParameterWrappers(ParameterWrapper[] parameterWrapperArr) {
        this.mFlowParameterWrappers = parameterWrapperArr;
        return this;
    }

    public Reply setInvokeTime(long j10) {
        this.mInvokeTime = j10;
        return this;
    }

    public Reply setResult(Object obj) {
        this.mResult = obj;
        return this;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i10) {
        parcel.writeInt(this.mErrorCode);
        if (this.mErrorMessage != null) {
            parcel.writeInt(0);
            parcel.writeString(this.mErrorMessage);
        } else {
            parcel.writeInt(1);
        }
        if (this.mFlowParameterWrappers != null) {
            parcel.writeInt(0);
            SerializeUtils.writeToParcel(parcel, this.mFlowParameterWrappers, i10, true);
        } else {
            parcel.writeInt(1);
        }
        parcel.writeLong(this.mInvokeTime);
        SerializeUtils.writeToParcel(parcel, this.mResult, i10, true);
    }
}
