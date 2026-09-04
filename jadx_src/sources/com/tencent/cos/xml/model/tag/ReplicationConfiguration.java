package com.tencent.cos.xml.model.tag;

import java.util.List;
import z5.g;

/* JADX INFO: loaded from: classes4.dex */
public class ReplicationConfiguration {
    public String role;
    public List<Rule> rules;

    public static class Destination {
        public String bucket;
        public String storageClass;

        public String toString() {
            return "{Destination:\nBucket:" + this.bucket + "\nStorageClass:" + this.storageClass + "\n" + g.f141884d;
        }
    }

    public static class Rule {
        public Destination destination;

        /* JADX INFO: renamed from: id, reason: collision with root package name */
        public String f99474id;
        public String prefix;
        public String status;

        public String toString() {
            StringBuilder sb2 = new StringBuilder("{Rule:\n");
            sb2.append("Id:");
            sb2.append(this.f99474id);
            sb2.append("\n");
            sb2.append("Status:");
            sb2.append(this.status);
            sb2.append("\n");
            sb2.append("Prefix:");
            sb2.append(this.prefix);
            sb2.append("\n");
            Destination destination = this.destination;
            if (destination != null) {
                sb2.append(destination.toString());
                sb2.append("\n");
            }
            sb2.append(g.f141884d);
            return sb2.toString();
        }
    }

    public String toString() {
        StringBuilder sb2 = new StringBuilder("{ReplicationConfiguration:\n");
        sb2.append("Role:");
        sb2.append(this.role);
        sb2.append("\n");
        List<Rule> list = this.rules;
        if (list != null) {
            for (Rule rule : list) {
                if (rule != null) {
                    sb2.append(rule.toString());
                    sb2.append("\n");
                }
            }
        }
        sb2.append(g.f141884d);
        return sb2.toString();
    }
}
