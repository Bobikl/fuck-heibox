package com.bytedance.sdk.open.douyin.model;

import android.annotation.SuppressLint;
import android.os.Bundle;
import com.bytedance.sdk.open.aweme.base.MicroAppInfo;
import java.util.ArrayList;
import k7.a;
import k7.b;

/* JADX INFO: loaded from: classes6.dex */
public class OpenRecord {

    public static class Request extends a {
        public String mCallerPackage;
        public String mClientKey;
        public ArrayList<String> mHashTagList;
        public MicroAppInfo mMicroAppInfo;
        public String mState;
        public int mTargetSceneType = 0;

        public Request() {
        }

        public Request(Bundle bundle) {
            fromBundle(bundle);
        }

        @Override // k7.a
        @SuppressLint({"MissingSuperCall"})
        public boolean checkArgs() {
            return true;
        }

        @Override // k7.a
        @SuppressLint({"MissingSuperCall"})
        public void fromBundle(Bundle bundle) {
            super.fromBundle(bundle);
            this.mCallerPackage = bundle.getString(i7.a.f.f119286c);
            this.callerLocalEntry = bundle.getString(i7.a.f.f119288e);
            this.mState = bundle.getString(i7.a.f.f119284a);
            this.mClientKey = bundle.getString(i7.a.f.f119285b);
            this.mTargetSceneType = bundle.getInt(i7.a.f.f119289f, 0);
            this.mHashTagList = bundle.getStringArrayList(i7.a.f.f119291h);
            this.mMicroAppInfo = MicroAppInfo.unserialize(bundle);
        }

        @Override // k7.a
        public int getType() {
            return 7;
        }

        @Override // k7.a
        @SuppressLint({"MissingSuperCall"})
        public void toBundle(Bundle bundle) {
            super.toBundle(bundle);
            bundle.putString(i7.a.f.f119288e, this.callerLocalEntry);
            bundle.putString(i7.a.f.f119285b, this.mClientKey);
            bundle.putString(i7.a.f.f119286c, this.mCallerPackage);
            bundle.putString(i7.a.f.f119284a, this.mState);
            bundle.putInt(i7.a.f.f119289f, this.mTargetSceneType);
            ArrayList<String> arrayList = this.mHashTagList;
            if (arrayList != null && arrayList.size() > 0) {
                bundle.putString(i7.a.f.f119290g, this.mHashTagList.get(0));
                bundle.putStringArrayList(i7.a.f.f119291h, this.mHashTagList);
            }
            MicroAppInfo microAppInfo = this.mMicroAppInfo;
            if (microAppInfo != null) {
                microAppInfo.serialize(bundle);
            }
        }
    }

    public static class Response extends b {
        public String state;

        public Response() {
        }

        public Response(Bundle bundle) {
            fromBundle(bundle);
        }

        @Override // k7.b
        @SuppressLint({"MissingSuperCall"})
        public void fromBundle(Bundle bundle) {
            this.errorCode = bundle.getInt(i7.a.f.f119294k);
            this.errorMsg = bundle.getString(i7.a.f.f119295l);
            this.extras = bundle.getBundle(i7.a.b.f119253b);
            this.state = bundle.getString(i7.a.f.f119284a);
        }

        @Override // k7.b
        public int getType() {
            return 8;
        }

        @Override // k7.b
        @SuppressLint({"MissingSuperCall"})
        public void toBundle(Bundle bundle) {
            bundle.putInt(i7.a.f.f119294k, this.errorCode);
            bundle.putString(i7.a.f.f119295l, this.errorMsg);
            bundle.putInt(i7.a.f.f119293j, getType());
            bundle.putBundle(i7.a.b.f119253b, this.extras);
            bundle.putString(i7.a.f.f119284a, this.state);
        }
    }
}
