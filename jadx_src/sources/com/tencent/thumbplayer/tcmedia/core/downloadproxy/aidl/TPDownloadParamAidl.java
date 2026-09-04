package com.tencent.thumbplayer.tcmedia.core.downloadproxy.aidl;

import android.os.Parcel;
import android.os.Parcelable;
import com.tencent.thumbplayer.tcmedia.core.downloadproxy.api.ITPDLProxyLogListener;
import com.tencent.thumbplayer.tcmedia.core.downloadproxy.utils.TPDLProxyLog;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

/* JADX INFO: loaded from: classes4.dex */
public class TPDownloadParamAidl implements Parcelable {
    public static final Parcelable.Creator<TPDownloadParamAidl> CREATOR = new Parcelable.Creator<TPDownloadParamAidl>() { // from class: com.tencent.thumbplayer.tcmedia.core.downloadproxy.aidl.TPDownloadParamAidl.1
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final TPDownloadParamAidl createFromParcel(Parcel parcel) {
            return new TPDownloadParamAidl(parcel);
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final TPDownloadParamAidl[] newArray(int i10) {
            return new TPDownloadParamAidl[i10];
        }
    };
    private int dlType;
    private Map<String, Object> extInfoMap;
    private ArrayList<String> urlList;

    protected TPDownloadParamAidl(Parcel parcel) {
        try {
            this.urlList = parcel.createStringArrayList();
            this.dlType = parcel.readInt();
            this.extInfoMap = parcel.readHashMap(TPDownloadParamAidl.class.getClassLoader());
        } catch (Throwable th2) {
            TPDLProxyLog.e("TPDownloadParamAidl", 0, ITPDLProxyLogListener.COMMON_TAG, th2.toString());
            this.urlList = new ArrayList<>();
            this.dlType = 0;
            this.extInfoMap = new HashMap();
        }
    }

    public TPDownloadParamAidl(ArrayList<String> arrayList, int i10, Map<String, Object> map) {
        this.urlList = arrayList;
        this.dlType = i10;
        this.extInfoMap = map;
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public int getDlType() {
        return this.dlType;
    }

    public Map<String, Object> getExtInfoMap() {
        return this.extInfoMap;
    }

    public ArrayList<String> getUrlList() {
        return this.urlList;
    }

    public void setDlType(int i10) {
        this.dlType = i10;
    }

    public void setExtInfoMap(Map<String, Object> map) {
        this.extInfoMap = map;
    }

    public void setUrlList(ArrayList<String> arrayList) {
        this.urlList = arrayList;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i10) {
        parcel.writeStringList(this.urlList);
        parcel.writeInt(this.dlType);
        parcel.writeMap(this.extInfoMap);
    }
}
