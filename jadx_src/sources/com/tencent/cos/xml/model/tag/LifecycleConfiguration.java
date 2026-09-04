package com.tencent.cos.xml.model.tag;

import java.util.List;
import z5.g;

/* JADX INFO: loaded from: classes4.dex */
public class LifecycleConfiguration {
    public List<Rule> rules;

    public static class AbortIncompleteMultiUpload {
        public int daysAfterInitiation;

        public String toString() {
            return "{AbortIncompleteMultiUpload:\nDaysAfterInitiation:" + this.daysAfterInitiation + "\n" + g.f141884d;
        }
    }

    public static class Expiration {
        public String date;
        public int days;
        public String expiredObjectDeleteMarker;

        public String toString() {
            return "{Expiration:\nDays:" + this.days + "\nDate:" + this.date + "\nExpiredObjectDeleteMarker:" + this.expiredObjectDeleteMarker + "\n" + g.f141884d;
        }
    }

    public static class Filter {
        public String prefix;

        public String toString() {
            return "{Filter:\nPrefix:" + this.prefix + "\n" + g.f141884d;
        }
    }

    public static class NoncurrentVersionExpiration {
        public int noncurrentDays;

        public String toString() {
            return "{NoncurrentVersionExpiration:\nNoncurrentDays:" + this.noncurrentDays + "\n" + g.f141884d;
        }
    }

    public static class NoncurrentVersionTransition {
        public int noncurrentDays;
        public String storageClass;

        public String toString() {
            return "{NoncurrentVersionTransition:\nNoncurrentDays:" + this.noncurrentDays + "\nStorageClass:" + this.storageClass + "\n" + g.f141884d;
        }
    }

    public static class Rule {
        public AbortIncompleteMultiUpload abortIncompleteMultiUpload;
        public Expiration expiration;
        public Filter filter;

        /* JADX INFO: renamed from: id, reason: collision with root package name */
        public String f99466id;
        public NoncurrentVersionExpiration noncurrentVersionExpiration;
        public NoncurrentVersionTransition noncurrentVersionTransition;
        public String status;
        public Transition transition;

        public String toString() {
            StringBuilder sb2 = new StringBuilder("{Rule:\n");
            sb2.append("Id:");
            sb2.append(this.f99466id);
            sb2.append("\n");
            Filter filter = this.filter;
            if (filter != null) {
                sb2.append(filter.toString());
                sb2.append("\n");
            }
            sb2.append("Status:");
            sb2.append(this.status);
            sb2.append("\n");
            Transition transition = this.transition;
            if (transition != null) {
                sb2.append(transition.toString());
                sb2.append("\n");
            }
            Expiration expiration = this.expiration;
            if (expiration != null) {
                sb2.append(expiration.toString());
                sb2.append("\n");
            }
            NoncurrentVersionExpiration noncurrentVersionExpiration = this.noncurrentVersionExpiration;
            if (noncurrentVersionExpiration != null) {
                sb2.append(noncurrentVersionExpiration.toString());
                sb2.append("\n");
            }
            NoncurrentVersionTransition noncurrentVersionTransition = this.noncurrentVersionTransition;
            if (noncurrentVersionTransition != null) {
                sb2.append(noncurrentVersionTransition.toString());
                sb2.append("\n");
            }
            AbortIncompleteMultiUpload abortIncompleteMultiUpload = this.abortIncompleteMultiUpload;
            if (abortIncompleteMultiUpload != null) {
                sb2.append(abortIncompleteMultiUpload.toString());
                sb2.append("\n");
            }
            sb2.append(g.f141884d);
            return sb2.toString();
        }
    }

    public static class Transition {
        public String date;
        public int days;
        public String storageClass;

        public String toString() {
            return "{Transition:\nDays:" + this.days + "\nDate:" + this.date + "\nStorageClass:" + this.storageClass + "\n" + g.f141884d;
        }
    }

    public String toString() {
        StringBuilder sb2 = new StringBuilder("{LifecycleConfiguration:\n");
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
