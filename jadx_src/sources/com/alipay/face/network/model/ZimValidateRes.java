package com.alipay.face.network.model;

/* JADX INFO: loaded from: classes6.dex */
public class ZimValidateRes extends ZimResBase {
    public ResultObject ResultObject;

    public static class ResultObject {
        public String ExtParams;
        public boolean HasNext;
        public String ProductRetCode;
        public String RetCodeSub;
        public String RetMessageSub;
        public String ValidationRetCode;
    }

    public String getExtParams() {
        return this.ResultObject.ExtParams;
    }

    public String getProductRetCode() {
        return this.ResultObject.ProductRetCode;
    }

    public String getRetCodeSub() {
        return this.ResultObject.RetCodeSub;
    }

    public String getRetMessageSub() {
        return this.ResultObject.RetMessageSub;
    }

    public String getValidationRetCode() {
        return this.ResultObject.ValidationRetCode;
    }

    public boolean isHasNext() {
        return this.ResultObject.HasNext;
    }

    public boolean isValid() {
        return this.ResultObject != null;
    }
}
