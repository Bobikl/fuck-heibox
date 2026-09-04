package com.tencent.cos.xml.model.tag;

import com.tencent.qcloud.qcloudxml.annoation.XmlBean;
import com.tencent.qcloud.qcloudxml.annoation.XmlElement;
import java.util.List;

/* JADX INFO: loaded from: classes4.dex */
@XmlBean(name = "Response")
public class DescribeMediaBucketsResult {

    @XmlElement(flatListNote = true)
    public List<MediaBucketList> mediaBucketList;
    public int pageNumber;
    public int pageSize;
    public String requestId;
    public int totalCount;

    @XmlBean
    public static class MediaBucketList {
        public String bucketId;
        public String createTime;
        public String name;
        public String region;
    }
}
