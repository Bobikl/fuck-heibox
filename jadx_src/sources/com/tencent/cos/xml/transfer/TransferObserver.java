package com.tencent.cos.xml.transfer;

/* JADX INFO: loaded from: classes4.dex */
public class TransferObserver {
    private final String transferId;
    private TransferListener transferListener;
    private TransferState transferState;

    protected TransferObserver(String str) {
        this.transferId = str;
    }

    public String getTransferId() {
        return this.transferId;
    }

    public TransferListener getTransferListener() {
        return this.transferListener;
    }

    public TransferState getTransferState() {
        return this.transferState;
    }

    public void setTransferListener(TransferListener transferListener) {
        this.transferListener = transferListener;
    }

    protected void setTransferState(TransferState transferState) {
        this.transferState = transferState;
    }
}
