package com.tencent.cos.xml.model.tag;

import java.util.Iterator;
import java.util.List;
import z5.g;

/* JADX INFO: loaded from: classes4.dex */
public class ListBucketVersions {
    public boolean isTruncated;
    public String keyMarker;
    public long maxKeys;
    public String name;
    public String nextKeyMarker;
    public String nextVersionIdMarker;
    public List<ObjectVersion> objectVersionList;
    public String prefix;
    public String versionIdMarker;

    public static class DeleteMarker extends ObjectVersion {
        public String toString() {
            StringBuilder sb2 = new StringBuilder("{DeleteMarker:\n");
            sb2.append("Key:");
            sb2.append(this.key);
            sb2.append("\n");
            sb2.append("VersionId:");
            sb2.append(this.versionId);
            sb2.append("\n");
            sb2.append("IsLatest:");
            sb2.append(this.isLatest);
            sb2.append("\n");
            sb2.append("LastModified:");
            sb2.append(this.lastModified);
            sb2.append("\n");
            Owner owner = this.owner;
            if (owner != null) {
                sb2.append(owner.toString());
                sb2.append("\n");
            }
            sb2.append(g.f141884d);
            return sb2.toString();
        }
    }

    public static class ObjectVersion {
        public boolean isLatest;
        public String key;
        public String lastModified;
        public Owner owner;
        public String versionId;
    }

    public static class Owner {
        public String uid;

        public String toString() {
            return "{Owner:\nUid:" + this.uid + "\n" + g.f141884d;
        }
    }

    public static class Version extends ObjectVersion {
        public String eTag;
        public long size;
        public String storageClass;

        public String toString() {
            StringBuilder sb2 = new StringBuilder("{Version:\n");
            sb2.append("Key:");
            sb2.append(this.key);
            sb2.append("\n");
            sb2.append("VersionId:");
            sb2.append(this.versionId);
            sb2.append("\n");
            sb2.append("IsLatest:");
            sb2.append(this.isLatest);
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
            sb2.append("StorageClass:");
            sb2.append(this.storageClass);
            sb2.append("\n");
            Owner owner = this.owner;
            if (owner != null) {
                sb2.append(owner.toString());
                sb2.append("\n");
            }
            sb2.append(g.f141884d);
            return sb2.toString();
        }
    }

    public String toString() {
        StringBuilder sb2 = new StringBuilder("{ListVersionsResult:\n");
        sb2.append("Name:");
        sb2.append(this.name);
        sb2.append("\n");
        sb2.append("Prefix:");
        sb2.append(this.prefix);
        sb2.append("\n");
        sb2.append("KeyMarker:");
        sb2.append(this.keyMarker);
        sb2.append("\n");
        sb2.append("VersionIdMarker:");
        sb2.append(this.versionIdMarker);
        sb2.append("\n");
        sb2.append("MaxKeys:");
        sb2.append(this.maxKeys);
        sb2.append("\n");
        sb2.append("IsTruncated:");
        sb2.append(this.isTruncated);
        sb2.append("\n");
        sb2.append("NextKeyMarker:");
        sb2.append(this.nextKeyMarker);
        sb2.append("\n");
        sb2.append("NextVersionIdMarker:");
        sb2.append(this.nextVersionIdMarker);
        sb2.append("\n");
        List<ObjectVersion> list = this.objectVersionList;
        if (list != null) {
            Iterator<ObjectVersion> it = list.iterator();
            while (it.hasNext()) {
                sb2.append(it.next().toString());
                sb2.append("\n");
            }
        }
        sb2.append(g.f141884d);
        return sb2.toString();
    }
}
