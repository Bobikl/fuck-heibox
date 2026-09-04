package com.tencent.cos.xml.model.tag;

import java.util.List;
import z5.g;

/* JADX INFO: loaded from: classes4.dex */
public class ListBucket {
    public List<CommonPrefixes> commonPrefixesList;
    public List<Contents> contentsList;
    public String delimiter;
    public String encodingType;
    public boolean isTruncated;
    public String marker;
    public int maxKeys;
    public String name;
    public String nextMarker;
    public String prefix;

    public static class CommonPrefixes {
        public String prefix;

        public String toString() {
            return "{CommonPrefixes:\nPrefix:" + this.prefix + "\n" + g.f141884d;
        }
    }

    public static class Contents {
        public String eTag;
        public String key;
        public String lastModified;
        public Owner owner;
        public long size;
        public String storageClass;

        public String toString() {
            StringBuilder sb2 = new StringBuilder("{Contents:\n");
            sb2.append("Key:");
            sb2.append(this.key);
            sb2.append("\n");
            sb2.append("LastModified:");
            sb2.append(this.lastModified);
            sb2.append("\n");
            sb2.append("ETag:");
            sb2.append(this.eTag);
            sb2.append("\n");
            sb2.append("Size:");
            sb2.append(this.size);
            sb2.append("\n");
            Owner owner = this.owner;
            if (owner != null) {
                sb2.append(owner.toString());
                sb2.append("\n");
            }
            sb2.append("StorageClass:");
            sb2.append(this.storageClass);
            sb2.append("\n");
            sb2.append(g.f141884d);
            return sb2.toString();
        }
    }

    public static class Owner {

        /* JADX INFO: renamed from: id, reason: collision with root package name */
        public String f99468id;

        public String toString() {
            return "{Owner:\nId:" + this.f99468id + "\n" + g.f141884d;
        }
    }

    public String toString() {
        StringBuilder sb2 = new StringBuilder("{ListBucket:\n");
        sb2.append("Name:");
        sb2.append(this.name);
        sb2.append("\n");
        sb2.append("Encoding-Type:");
        sb2.append(this.encodingType);
        sb2.append("\n");
        sb2.append("Prefix:");
        sb2.append(this.prefix);
        sb2.append("\n");
        sb2.append("Marker:");
        sb2.append(this.marker);
        sb2.append("\n");
        sb2.append("MaxKeys:");
        sb2.append(this.maxKeys);
        sb2.append("\n");
        sb2.append("IsTruncated:");
        sb2.append(this.isTruncated);
        sb2.append("\n");
        sb2.append("NextMarker:");
        sb2.append(this.nextMarker);
        sb2.append("\n");
        List<Contents> list = this.contentsList;
        if (list != null) {
            for (Contents contents : list) {
                if (contents != null) {
                    sb2.append(contents.toString());
                    sb2.append("\n");
                }
            }
        }
        List<CommonPrefixes> list2 = this.commonPrefixesList;
        if (list2 != null) {
            for (CommonPrefixes commonPrefixes : list2) {
                if (commonPrefixes != null) {
                    sb2.append(commonPrefixes.toString());
                    sb2.append("\n");
                }
            }
        }
        sb2.append("Delimiter:");
        sb2.append(this.delimiter);
        sb2.append("\n");
        sb2.append(g.f141884d);
        return sb2.toString();
    }
}
