package com.tencent.cos.xml.model.tag;

import com.tencent.qcloud.qcloudxml.annoation.XmlBean;
import com.tencent.qcloud.qcloudxml.annoation.XmlElement;
import java.util.LinkedList;
import java.util.List;

/* JADX INFO: loaded from: classes4.dex */
@XmlBean
public class Tagging {
    public TagSet tagSet = new TagSet();

    @XmlBean
    public static class Tag {
        public String key;
        public String value;

        public Tag() {
        }

        public Tag(String str, String str2) {
            this.key = str;
            this.value = str2;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof Tag)) {
                return false;
            }
            Tag tag = (Tag) obj;
            return this.key.equals(tag.key) && this.value.equals(tag.value);
        }
    }

    @XmlBean
    public static class TagSet {

        @XmlElement(ignoreListNote = true)
        public List<Tag> tags = new LinkedList();

        public void addTag(Tag tag) {
            this.tags.add(tag);
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj instanceof TagSet) {
                TagSet tagSet = (TagSet) obj;
                int size = this.tags.size();
                if (size == tagSet.tags.size()) {
                    int i10 = 0;
                    while (true) {
                        int i11 = size - 1;
                        if (size == 0) {
                            return true;
                        }
                        if (!this.tags.get(i10).equals(tagSet.tags.get(i10))) {
                            return false;
                        }
                        i10++;
                        size = i11;
                    }
                }
            }
            return false;
        }
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof Tagging) {
            return this.tagSet.equals(((Tagging) obj).tagSet);
        }
        return false;
    }
}
