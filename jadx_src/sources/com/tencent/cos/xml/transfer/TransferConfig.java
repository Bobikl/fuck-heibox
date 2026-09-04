package com.tencent.cos.xml.transfer;

/* JADX INFO: loaded from: classes4.dex */
public class TransferConfig {
    protected long divisionForCopy;
    protected long divisionForUpload;
    private boolean forceSimpleUpload;
    protected long sliceSizeForCopy;
    protected long sliceSizeForUpload;
    private boolean verifyCRC64;

    public static class Builder {
        private long divisionForCopy = 5242880;
        private long sliceSizeForCopy = 5242880;
        private long divisionForUpload = 2097152;
        private long sliceSizeForUpload = 1048576;
        private boolean forceSimpleUpload = false;
        private boolean verifyCRC64 = true;

        private Builder setVerifyCRC64(boolean z10) {
            this.verifyCRC64 = z10;
            return this;
        }

        public TransferConfig build() {
            return new TransferConfig(this);
        }

        public Builder setDividsionForCopy(long j10) {
            if (j10 > 0) {
                this.divisionForCopy = j10;
            }
            return this;
        }

        public Builder setDivisionForUpload(long j10) {
            if (j10 > 0) {
                this.divisionForUpload = j10;
            }
            return this;
        }

        public Builder setForceSimpleUpload(boolean z10) {
            this.forceSimpleUpload = z10;
            return this;
        }

        public Builder setSliceSizeForCopy(long j10) {
            if (j10 > 0) {
                this.sliceSizeForCopy = j10;
            }
            return this;
        }

        public Builder setSliceSizeForUpload(long j10) {
            if (j10 > 0) {
                this.sliceSizeForUpload = j10;
            }
            return this;
        }
    }

    TransferConfig(Builder builder) {
        this.verifyCRC64 = true;
        this.divisionForCopy = builder.divisionForCopy;
        this.sliceSizeForCopy = builder.sliceSizeForCopy;
        this.divisionForUpload = builder.divisionForUpload;
        this.sliceSizeForUpload = builder.sliceSizeForUpload;
        this.forceSimpleUpload = builder.forceSimpleUpload;
        this.verifyCRC64 = builder.verifyCRC64;
    }

    public long getDivisionForCopy() {
        return this.divisionForCopy;
    }

    public boolean isForceSimpleUpload() {
        return this.forceSimpleUpload;
    }

    public boolean isVerifyCRC64() {
        return this.verifyCRC64;
    }
}
