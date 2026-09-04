package com.tencent.cos.xml.model.tag;

import java.util.List;
import z5.g;

/* JADX INFO: loaded from: classes4.dex */
public class ListMultipartUploads {
    public String bucket;
    public List<CommonPrefixes> commonPrefixes;
    public String delimiter;
    public String encodingType;
    public boolean isTruncated;
    public String keyMarker;
    public String maxUploads;
    public String nextKeyMarker;
    public String nextUploadIdMarker;
    public String prefix;
    public String uploadIdMarker;
    public List<Upload> uploads;

    public static class CommonPrefixes {
        public String prefix;

        public String toString() {
            return "{CommonPrefixes:\nPrefix:" + this.prefix + "\n" + g.f141884d;
        }
    }

    public static class Initiator {
        public String displayName;

        /* JADX INFO: renamed from: id, reason: collision with root package name */
        public String f99469id;
        public String uin;

        public String toString() {
            return "{Initiator:\nUin:" + this.uin + "\nId:" + this.f99469id + "\nDisplayName:" + this.displayName + "\n" + g.f141884d;
        }
    }

    public static class Owner {
        public String displayName;

        /* JADX INFO: renamed from: id, reason: collision with root package name */
        public String f99470id;
        public String uid;

        public String toString() {
            return "{Owner:\nUid:" + this.uid + "\nId:" + this.f99470id + "\nDisplayName:" + this.displayName + "\n" + g.f141884d;
        }
    }

    public static class Upload {
        public String initiated;
        public Initiator initiator;
        public String key;
        public Owner owner;
        public String storageClass;
        public String uploadID;

        public String toString() {
            StringBuilder sb2 = new StringBuilder("{Upload:\n");
            sb2.append("Key:");
            sb2.append(this.key);
            sb2.append("\n");
            sb2.append("UploadID:");
            sb2.append(this.uploadID);
            sb2.append("\n");
            sb2.append("StorageClass:");
            sb2.append(this.storageClass);
            sb2.append("\n");
            Initiator initiator = this.initiator;
            if (initiator != null) {
                sb2.append(initiator.toString());
                sb2.append("\n");
            }
            Owner owner = this.owner;
            if (owner != null) {
                sb2.append(owner.toString());
                sb2.append("\n");
            }
            sb2.append("Initiated:");
            sb2.append(this.initiated);
            sb2.append("\n");
            sb2.append(g.f141884d);
            return sb2.toString();
        }
    }

    public String toString() {
        StringBuilder sb2 = new StringBuilder("{ListMultipartUploads:\n");
        sb2.append("Bucket:");
        sb2.append(this.bucket);
        sb2.append("\n");
        sb2.append("Encoding-Type:");
        sb2.append(this.encodingType);
        sb2.append("\n");
        sb2.append("KeyMarker:");
        sb2.append(this.keyMarker);
        sb2.append("\n");
        sb2.append("UploadIdMarker:");
        sb2.append(this.uploadIdMarker);
        sb2.append("\n");
        sb2.append("NextKeyMarker:");
        sb2.append(this.nextKeyMarker);
        sb2.append("\n");
        sb2.append("NextUploadIdMarker:");
        sb2.append(this.nextUploadIdMarker);
        sb2.append("\n");
        sb2.append("MaxUploads:");
        sb2.append(this.maxUploads);
        sb2.append("\n");
        sb2.append("IsTruncated:");
        sb2.append(this.isTruncated);
        sb2.append("\n");
        sb2.append("Prefix:");
        sb2.append(this.prefix);
        sb2.append("\n");
        sb2.append("Delimiter:");
        sb2.append(this.delimiter);
        sb2.append("\n");
        List<Upload> list = this.uploads;
        if (list != null) {
            for (Upload upload : list) {
                if (upload != null) {
                    sb2.append(upload.toString());
                    sb2.append("\n");
                }
            }
        }
        List<CommonPrefixes> list2 = this.commonPrefixes;
        if (list2 != null) {
            for (CommonPrefixes commonPrefixes : list2) {
                if (commonPrefixes != null) {
                    sb2.append(commonPrefixes.toString());
                    sb2.append("\n");
                }
            }
        }
        sb2.append(g.f141884d);
        return sb2.toString();
    }
}
