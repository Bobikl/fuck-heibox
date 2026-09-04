package com.tencent.cos.xml.model.tag;

import java.util.List;
import z5.g;

/* JADX INFO: loaded from: classes4.dex */
public class DeleteResult {
    public List<Deleted> deletedList;
    public List<Error> errorList;

    public static class Deleted {
        public boolean deleteMarker;
        public String deleteMarkerVersionId;
        public String key;
        public String versionId;

        public String toString() {
            return "{Deleted:\nKey:" + this.key + "\nVersionId:" + this.versionId + "\nDeleteMarker:" + this.deleteMarker + "\nDeleteMarkerVersionId:" + this.deleteMarkerVersionId + "\n" + g.f141884d;
        }
    }

    public static class Error {
        public String code;
        public String key;
        public String message;
        public String versionId;

        public String toString() {
            return "{CosError:\nKey:" + this.key + "\nCode:" + this.code + "\nMessage:" + this.message + "\nVersionId:" + this.versionId + "\n" + g.f141884d;
        }
    }

    public String toString() {
        StringBuilder sb2 = new StringBuilder("{DeleteResult:\n");
        List<Deleted> list = this.deletedList;
        if (list != null) {
            for (Deleted deleted : list) {
                if (deleted != null) {
                    sb2.append(deleted.toString());
                    sb2.append("\n");
                }
            }
        }
        List<Error> list2 = this.errorList;
        if (list2 != null) {
            for (Error error : list2) {
                if (error != null) {
                    sb2.append(error.toString());
                    sb2.append("\n");
                }
            }
        }
        sb2.append(g.f141884d);
        return sb2.toString();
    }
}
