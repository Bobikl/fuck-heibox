package com.tencent.cos.xml.model.tag;

import java.util.List;
import z5.g;

/* JADX INFO: loaded from: classes4.dex */
public class AccessControlPolicy {
    public AccessControlList accessControlList;
    public Owner owner;

    public static class AccessControlList {
        public List<Grant> grants;

        public String toString() {
            StringBuilder sb2 = new StringBuilder("{AccessControlList:\n");
            List<Grant> list = this.grants;
            if (list != null) {
                for (Grant grant : list) {
                    if (grant != null) {
                        sb2.append(grant.toString());
                        sb2.append("\n");
                    }
                }
            }
            sb2.append(g.f141884d);
            return sb2.toString();
        }
    }

    public static class Grant {
        public Grantee grantee;
        public String permission;

        public String toString() {
            StringBuilder sb2 = new StringBuilder("{Grant:\n");
            Grantee grantee = this.grantee;
            if (grantee != null) {
                sb2.append(grantee.toString());
                sb2.append("\n");
            }
            sb2.append("Permission:");
            sb2.append(this.permission);
            sb2.append("\n");
            sb2.append(g.f141884d);
            return sb2.toString();
        }
    }

    public static class Grantee {
        public String displayName;

        /* JADX INFO: renamed from: id, reason: collision with root package name */
        public String f99462id;
        public String uri;

        public String toString() {
            return "{Grantee:\nURI:" + this.uri + "\nId:" + this.f99462id + "\nDisplayName:" + this.displayName + "\n" + g.f141884d;
        }
    }

    public static class Owner {
        public String displayName;

        /* JADX INFO: renamed from: id, reason: collision with root package name */
        public String f99463id;

        public String toString() {
            return "{Owner:\nId:" + this.f99463id + "\nDisplayName:" + this.displayName + "\n" + g.f141884d;
        }
    }

    public String toString() {
        StringBuilder sb2 = new StringBuilder("{AccessControlPolicy:\n");
        Owner owner = this.owner;
        if (owner != null) {
            sb2.append(owner.toString());
            sb2.append("\n");
        }
        AccessControlList accessControlList = this.accessControlList;
        if (accessControlList != null) {
            sb2.append(accessControlList.toString());
            sb2.append("\n");
        }
        sb2.append(g.f141884d);
        return sb2.toString();
    }
}
