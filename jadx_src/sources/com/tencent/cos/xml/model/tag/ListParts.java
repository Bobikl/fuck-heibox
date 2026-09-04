package com.tencent.cos.xml.model.tag;

import java.util.List;
import z5.g;

/* JADX INFO: loaded from: classes4.dex */
public class ListParts {
    public String bucket;
    public String encodingType;
    public Initiator initiator;
    public boolean isTruncated;
    public String key;
    public String maxParts;
    public String nextPartNumberMarker;
    public Owner owner;
    public String partNumberMarker;
    public List<Part> parts;
    public String storageClass;
    public String uploadId;

    public static class Initiator {
        public String disPlayName;

        /* JADX INFO: renamed from: id, reason: collision with root package name */
        public String f99471id;

        public String toString() {
            return "{Initiator:\nId:" + this.f99471id + "\nDisPlayName:" + this.disPlayName + "\n" + g.f141884d;
        }
    }

    public static class Owner {
        public String disPlayName;

        /* JADX INFO: renamed from: id, reason: collision with root package name */
        public String f99472id;

        public String toString() {
            return "{Owner:\nId:" + this.f99472id + "\nDisPlayName:" + this.disPlayName + "\n" + g.f141884d;
        }
    }

    public static class Part {
        public String eTag;
        public String lastModified;
        public String partNumber;
        public String size;

        public String toString() {
            return "{Part:\nPartNumber:" + this.partNumber + "\nLastModified:" + this.lastModified + "\nETag:" + this.eTag + "\nSize:" + this.size + "\n" + g.f141884d;
        }
    }

    public String toString() {
        StringBuilder sb2 = new StringBuilder("{ListParts:\n");
        sb2.append("Bucket:");
        sb2.append(this.bucket);
        sb2.append("\n");
        sb2.append("Encoding-Type:");
        sb2.append(this.encodingType);
        sb2.append("\n");
        sb2.append("Key:");
        sb2.append(this.key);
        sb2.append("\n");
        sb2.append("UploadId:");
        sb2.append(this.uploadId);
        sb2.append("\n");
        Owner owner = this.owner;
        if (owner != null) {
            sb2.append(owner.toString());
            sb2.append("\n");
        }
        sb2.append("PartNumberMarker:");
        sb2.append(this.partNumberMarker);
        sb2.append("\n");
        Initiator initiator = this.initiator;
        if (initiator != null) {
            sb2.append(initiator.toString());
            sb2.append("\n");
        }
        sb2.append("StorageClass:");
        sb2.append(this.storageClass);
        sb2.append("\n");
        sb2.append("NextPartNumberMarker:");
        sb2.append(this.nextPartNumberMarker);
        sb2.append("\n");
        sb2.append("MaxParts:");
        sb2.append(this.maxParts);
        sb2.append("\n");
        sb2.append("IsTruncated:");
        sb2.append(this.isTruncated);
        sb2.append("\n");
        List<Part> list = this.parts;
        if (list != null) {
            for (Part part : list) {
                if (part != null) {
                    sb2.append(part.toString());
                    sb2.append("\n");
                }
            }
        }
        sb2.append(g.f141884d);
        return sb2.toString();
    }
}
