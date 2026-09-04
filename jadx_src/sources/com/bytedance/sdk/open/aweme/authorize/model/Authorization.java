package com.bytedance.sdk.open.aweme.authorize.model;

import android.os.Bundle;
import com.google.gson.Gson;
import k7.a;
import k7.b;

/* JADX INFO: loaded from: classes6.dex */
public class Authorization {

    public static class Request extends a {
        public String clientKey;
        public String optionalScope0;
        public String optionalScope1;
        public String redirectUri;
        public String scope;
        public String state;
        public VerifyObject verifyObject;

        public Request() {
        }

        public Request(Bundle bundle) {
            fromBundle(bundle);
        }

        @Override // k7.a
        public void fromBundle(Bundle bundle) {
            super.fromBundle(bundle);
            this.state = bundle.getString(i7.a.InterfaceC1087a.f119243c);
            this.clientKey = bundle.getString(i7.a.InterfaceC1087a.f119242b);
            this.redirectUri = bundle.getString(i7.a.InterfaceC1087a.f119245e);
            this.scope = bundle.getString(i7.a.InterfaceC1087a.f119246f);
            this.optionalScope0 = bundle.getString(i7.a.InterfaceC1087a.f119247g);
            this.optionalScope1 = bundle.getString(i7.a.InterfaceC1087a.f119248h);
            String string = bundle.getString(i7.a.InterfaceC1087a.f119250j);
            if (string != null) {
                this.verifyObject = (VerifyObject) new Gson().fromJson(string, VerifyObject.class);
            }
        }

        public String getClientKey() {
            return this.clientKey;
        }

        @Override // k7.a
        public int getType() {
            return 1;
        }

        @Override // k7.a
        public void toBundle(Bundle bundle) {
            super.toBundle(bundle);
            bundle.putString(i7.a.InterfaceC1087a.f119243c, this.state);
            bundle.putString(i7.a.InterfaceC1087a.f119242b, this.clientKey);
            bundle.putString(i7.a.InterfaceC1087a.f119245e, this.redirectUri);
            bundle.putString(i7.a.InterfaceC1087a.f119246f, this.scope);
            bundle.putString(i7.a.InterfaceC1087a.f119247g, this.optionalScope0);
            bundle.putString(i7.a.InterfaceC1087a.f119248h, this.optionalScope1);
            if (this.verifyObject != null) {
                bundle.putString(i7.a.InterfaceC1087a.f119250j, new Gson().toJson(this.verifyObject));
            }
        }
    }

    public static class Response extends b {
        public String authCode;
        public String grantedPermissions;
        public String state;

        public Response() {
        }

        public Response(Bundle bundle) {
            fromBundle(bundle);
        }

        @Override // k7.b
        public void fromBundle(Bundle bundle) {
            super.fromBundle(bundle);
            this.authCode = bundle.getString(i7.a.InterfaceC1087a.f119241a);
            this.state = bundle.getString(i7.a.InterfaceC1087a.f119243c);
            this.grantedPermissions = bundle.getString(i7.a.InterfaceC1087a.f119244d);
        }

        @Override // k7.b
        public int getType() {
            return 2;
        }

        @Override // k7.b
        public void toBundle(Bundle bundle) {
            super.toBundle(bundle);
            bundle.putString(i7.a.InterfaceC1087a.f119241a, this.authCode);
            bundle.putString(i7.a.InterfaceC1087a.f119243c, this.state);
            bundle.putString(i7.a.InterfaceC1087a.f119244d, this.grantedPermissions);
        }
    }
}
