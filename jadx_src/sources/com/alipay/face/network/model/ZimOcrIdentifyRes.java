package com.alipay.face.network.model;

/* JADX INFO: loaded from: classes6.dex */
public class ZimOcrIdentifyRes extends ZimResBase {
    public ResultObjectInfo ResultObject;

    public static class ResultObjectInfo {
        public OCRInfo OcrInfo;
        public String RetCode;
        public String RetCodeSub;
        public String RetMessageSub;
    }

    public boolean isValid() {
        ResultObjectInfo resultObjectInfo = this.ResultObject;
        return (resultObjectInfo == null || resultObjectInfo.OcrInfo == null) ? false : true;
    }
}
