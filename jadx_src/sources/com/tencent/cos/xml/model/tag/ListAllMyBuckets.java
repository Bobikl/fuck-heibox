package com.tencent.cos.xml.model.tag;

import com.tencent.qcloud.qcloudxml.annoation.XmlBean;
import com.tencent.qcloud.qcloudxml.annoation.XmlElement;
import java.util.List;
import z5.g;

/* JADX INFO: loaded from: classes4.dex */
@XmlBean(name = "ListAllMyBucketsResult")
public class ListAllMyBuckets {
    public List<Bucket> buckets;
    public Owner owner;

    @XmlBean
    public static class Bucket {

        @XmlElement(name = "CreationDate")
        public String createDate;
        public String location;
        public String name;
        public String type;

        public String toString() {
            return "{Bucket:\nName:" + this.name + "\nLocation:" + this.location + "\nCreateDate:" + this.createDate + "\n" + g.f141884d;
        }
    }

    @XmlBean
    public static class Owner {

        @XmlElement(name = "DisplayName")
        public String disPlayName;

        /* JADX INFO: renamed from: id, reason: collision with root package name */
        @XmlElement(name = "ID")
        public String f99467id;

        public String toString() {
            return "{Owner:\nID:" + this.f99467id + "\nDisPlayName:" + this.disPlayName + "\n" + g.f141884d;
        }
    }

    public String toString() {
        StringBuilder sb2 = new StringBuilder("{ListAllMyBuckets:\n");
        Owner owner = this.owner;
        if (owner != null) {
            sb2.append(owner.toString());
            sb2.append("\n");
        }
        sb2.append("Buckets:\n");
        for (Bucket bucket : this.buckets) {
            if (bucket != null) {
                sb2.append(bucket.toString());
                sb2.append("\n");
            }
        }
        sb2.append(g.f141884d);
        sb2.append("\n");
        sb2.append(g.f141884d);
        return sb2.toString();
    }
}
