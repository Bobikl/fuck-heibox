package com.tencent.cos.xml.model.tag;

import java.util.List;

/* JADX INFO: loaded from: classes4.dex */
public class CompleteMultipartUpload {
    public List<Part> parts;

    public static class Part {
        public String eTag;
        public int partNumber;
    }
}
