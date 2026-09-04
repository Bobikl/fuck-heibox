package com.taobao.downloader.request;

/* JADX INFO: loaded from: classes4.dex */
public class Item {
    public String md5;
    public String name;
    public long size;
    public String url;

    public Item() {
    }

    public Item(String str) {
        this.url = str;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof Item)) {
            return false;
        }
        Item item = (Item) obj;
        String str = this.url;
        if (str == null ? item.url != null : !str.equals(item.url)) {
            return false;
        }
        String str2 = this.name;
        String str3 = item.name;
        if (str2 != null) {
            if (str2.equals(str3)) {
                return true;
            }
        } else if (str3 == null) {
            return true;
        }
        return false;
    }

    public int hashCode() {
        String str = this.url;
        int iHashCode = (str != null ? str.hashCode() : 0) * 31;
        String str2 = this.name;
        return iHashCode + (str2 != null ? str2.hashCode() : 0);
    }

    public String toString() {
        return "Item{url='" + this.url + "', size=" + this.size + ", md5='" + this.md5 + "', name='" + this.name + "'}";
    }
}
