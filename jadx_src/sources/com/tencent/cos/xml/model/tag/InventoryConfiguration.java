package com.tencent.cos.xml.model.tag;

import com.umeng.socialize.net.dplus.db.DBConfig;
import java.util.Set;
import z5.g;

/* JADX INFO: loaded from: classes4.dex */
public class InventoryConfiguration {
    public static final String SCHEDULE_FREQUENCY_DAILY = "Daily";
    public static final String SCHEDULE_FREQUENCY_WEEKLY = "Weekly";
    public Destination destination;
    public Filter filter;

    /* JADX INFO: renamed from: id, reason: collision with root package name */
    public String f99465id;
    public String includedObjectVersions;
    public boolean isEnabled;
    public OptionalFields optionalFields;
    public Schedule schedule;

    public static class COSBucketDestination {
        public String accountId;
        public String bucket;
        public Encryption encryption;
        public String format;
        public String prefix;

        public void setBucket(String str, String str2) {
            if (str == null || str2 == null) {
                return;
            }
            this.bucket = String.format("qcs::cos:%s::%s", str, str2);
        }

        public String toString() {
            StringBuilder sb2 = new StringBuilder("{COSBucketDestination:\n");
            sb2.append("Format:");
            sb2.append(this.format);
            sb2.append("\n");
            sb2.append("AccountId:");
            sb2.append(this.accountId);
            sb2.append("\n");
            sb2.append("Bucket:");
            sb2.append(this.bucket);
            sb2.append("\n");
            sb2.append("Prefix:");
            sb2.append(this.prefix);
            sb2.append("\n");
            Encryption encryption = this.encryption;
            if (encryption != null) {
                sb2.append(encryption.toString());
                sb2.append("\n");
            }
            sb2.append(g.f141884d);
            return sb2.toString();
        }
    }

    public static class Destination {
        public COSBucketDestination cosBucketDestination;

        public String toString() {
            StringBuilder sb2 = new StringBuilder("{Destination:\n");
            COSBucketDestination cOSBucketDestination = this.cosBucketDestination;
            if (cOSBucketDestination != null) {
                sb2.append(cOSBucketDestination.toString());
                sb2.append("\n");
            }
            sb2.append(g.f141884d);
            return sb2.toString();
        }
    }

    public static class Encryption {
        public String sSECOS;

        public String toString() {
            return "{Encryption:\nSSE-COS:" + this.sSECOS + "\n" + g.f141884d;
        }
    }

    public enum Field {
        SIZE("Size"),
        LastModified_Date("LastModifiedDate"),
        StroageClass("StorageClass"),
        ETAG("Etag"),
        IS_MULTIPARTUPLOADed("IsMultipartUploaded"),
        REPLICATION_STATUS("ReplicationStatus");

        String value;

        Field(String str) {
            this.value = str;
        }

        public String getValue() {
            return this.value;
        }
    }

    public static class Filter {
        public String prefix;

        public String toString() {
            return "{Filter:\nPrefix:" + this.prefix + "\n" + g.f141884d;
        }
    }

    public enum Frequency {
        DAILY(InventoryConfiguration.SCHEDULE_FREQUENCY_DAILY);

        String value;

        Frequency(String str) {
            this.value = str;
        }

        public String getValue() {
            return this.value;
        }
    }

    public enum IncludedObjectVersions {
        ALL("All"),
        CURRENT("Current");

        private String desc;

        IncludedObjectVersions(String str) {
            this.desc = str;
        }

        public String getDesc() {
            return this.desc;
        }
    }

    public static class OptionalFields {
        public Set<String> fields;

        public String toString() {
            StringBuilder sb2 = new StringBuilder("{OptionalFields:\n");
            Set<String> set = this.fields;
            if (set != null) {
                for (String str : set) {
                    sb2.append("Field:");
                    sb2.append(str);
                    sb2.append("\n");
                }
            }
            sb2.append(g.f141884d);
            return sb2.toString();
        }
    }

    public static class Schedule {
        public String frequency;

        public String toString() {
            return "{Schedule:\nFrequency:" + this.frequency + "\n" + g.f141884d;
        }
    }

    public String toString() {
        StringBuilder sb2 = new StringBuilder("{InventoryConfiguration:\n");
        sb2.append(DBConfig.ID);
        sb2.append(this.f99465id);
        sb2.append("\n");
        sb2.append("IsEnabled:");
        sb2.append(this.isEnabled);
        sb2.append("\n");
        Destination destination = this.destination;
        if (destination != null) {
            sb2.append(destination.toString());
            sb2.append("\n");
        }
        Schedule schedule = this.schedule;
        if (schedule != null) {
            sb2.append(schedule.toString());
            sb2.append("\n");
        }
        Filter filter = this.filter;
        if (filter != null) {
            sb2.append(filter.toString());
            sb2.append("\n");
        }
        sb2.append("IncludedObjectVersions:");
        sb2.append(this.includedObjectVersions);
        sb2.append("\n");
        OptionalFields optionalFields = this.optionalFields;
        if (optionalFields != null) {
            sb2.append(optionalFields.toString());
            sb2.append("\n");
        }
        sb2.append(g.f141884d);
        return sb2.toString();
    }
}
