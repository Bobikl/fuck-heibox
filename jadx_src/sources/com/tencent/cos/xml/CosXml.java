package com.tencent.cos.xml;

import com.tencent.cos.xml.exception.CosXmlClientException;
import com.tencent.cos.xml.exception.CosXmlServiceException;
import com.tencent.cos.xml.listener.CosXmlBooleanListener;
import com.tencent.cos.xml.listener.CosXmlResultListener;
import com.tencent.cos.xml.model.bucket.DeleteBucketCORSRequest;
import com.tencent.cos.xml.model.bucket.DeleteBucketCORSResult;
import com.tencent.cos.xml.model.bucket.DeleteBucketInventoryRequest;
import com.tencent.cos.xml.model.bucket.DeleteBucketInventoryResult;
import com.tencent.cos.xml.model.bucket.DeleteBucketLifecycleRequest;
import com.tencent.cos.xml.model.bucket.DeleteBucketLifecycleResult;
import com.tencent.cos.xml.model.bucket.DeleteBucketReplicationRequest;
import com.tencent.cos.xml.model.bucket.DeleteBucketReplicationResult;
import com.tencent.cos.xml.model.bucket.DeleteBucketRequest;
import com.tencent.cos.xml.model.bucket.DeleteBucketResult;
import com.tencent.cos.xml.model.bucket.DeleteBucketTaggingRequest;
import com.tencent.cos.xml.model.bucket.DeleteBucketTaggingResult;
import com.tencent.cos.xml.model.bucket.DeleteBucketWebsiteRequest;
import com.tencent.cos.xml.model.bucket.DeleteBucketWebsiteResult;
import com.tencent.cos.xml.model.bucket.GetBucketACLRequest;
import com.tencent.cos.xml.model.bucket.GetBucketACLResult;
import com.tencent.cos.xml.model.bucket.GetBucketAccelerateRequest;
import com.tencent.cos.xml.model.bucket.GetBucketAccelerateResult;
import com.tencent.cos.xml.model.bucket.GetBucketCORSRequest;
import com.tencent.cos.xml.model.bucket.GetBucketCORSResult;
import com.tencent.cos.xml.model.bucket.GetBucketDomainRequest;
import com.tencent.cos.xml.model.bucket.GetBucketDomainResult;
import com.tencent.cos.xml.model.bucket.GetBucketIntelligentTieringRequest;
import com.tencent.cos.xml.model.bucket.GetBucketIntelligentTieringResult;
import com.tencent.cos.xml.model.bucket.GetBucketInventoryRequest;
import com.tencent.cos.xml.model.bucket.GetBucketInventoryResult;
import com.tencent.cos.xml.model.bucket.GetBucketLifecycleRequest;
import com.tencent.cos.xml.model.bucket.GetBucketLifecycleResult;
import com.tencent.cos.xml.model.bucket.GetBucketLocationRequest;
import com.tencent.cos.xml.model.bucket.GetBucketLocationResult;
import com.tencent.cos.xml.model.bucket.GetBucketLoggingRequest;
import com.tencent.cos.xml.model.bucket.GetBucketLoggingResult;
import com.tencent.cos.xml.model.bucket.GetBucketObjectVersionsRequest;
import com.tencent.cos.xml.model.bucket.GetBucketObjectVersionsResult;
import com.tencent.cos.xml.model.bucket.GetBucketRefererRequest;
import com.tencent.cos.xml.model.bucket.GetBucketRefererResult;
import com.tencent.cos.xml.model.bucket.GetBucketReplicationRequest;
import com.tencent.cos.xml.model.bucket.GetBucketReplicationResult;
import com.tencent.cos.xml.model.bucket.GetBucketRequest;
import com.tencent.cos.xml.model.bucket.GetBucketResult;
import com.tencent.cos.xml.model.bucket.GetBucketTaggingRequest;
import com.tencent.cos.xml.model.bucket.GetBucketTaggingResult;
import com.tencent.cos.xml.model.bucket.GetBucketVersioningRequest;
import com.tencent.cos.xml.model.bucket.GetBucketVersioningResult;
import com.tencent.cos.xml.model.bucket.GetBucketWebsiteRequest;
import com.tencent.cos.xml.model.bucket.GetBucketWebsiteResult;
import com.tencent.cos.xml.model.bucket.HeadBucketRequest;
import com.tencent.cos.xml.model.bucket.HeadBucketResult;
import com.tencent.cos.xml.model.bucket.ListBucketInventoryRequest;
import com.tencent.cos.xml.model.bucket.ListBucketInventoryResult;
import com.tencent.cos.xml.model.bucket.ListBucketVersionsRequest;
import com.tencent.cos.xml.model.bucket.ListBucketVersionsResult;
import com.tencent.cos.xml.model.bucket.PutBucketACLRequest;
import com.tencent.cos.xml.model.bucket.PutBucketACLResult;
import com.tencent.cos.xml.model.bucket.PutBucketAccelerateRequest;
import com.tencent.cos.xml.model.bucket.PutBucketAccelerateResult;
import com.tencent.cos.xml.model.bucket.PutBucketCORSRequest;
import com.tencent.cos.xml.model.bucket.PutBucketCORSResult;
import com.tencent.cos.xml.model.bucket.PutBucketDomainRequest;
import com.tencent.cos.xml.model.bucket.PutBucketDomainResult;
import com.tencent.cos.xml.model.bucket.PutBucketIntelligentTieringRequest;
import com.tencent.cos.xml.model.bucket.PutBucketIntelligentTieringResult;
import com.tencent.cos.xml.model.bucket.PutBucketInventoryRequest;
import com.tencent.cos.xml.model.bucket.PutBucketInventoryResult;
import com.tencent.cos.xml.model.bucket.PutBucketLifecycleRequest;
import com.tencent.cos.xml.model.bucket.PutBucketLifecycleResult;
import com.tencent.cos.xml.model.bucket.PutBucketLoggingRequest;
import com.tencent.cos.xml.model.bucket.PutBucketLoggingResult;
import com.tencent.cos.xml.model.bucket.PutBucketRefererRequest;
import com.tencent.cos.xml.model.bucket.PutBucketRefererResult;
import com.tencent.cos.xml.model.bucket.PutBucketReplicationRequest;
import com.tencent.cos.xml.model.bucket.PutBucketReplicationResult;
import com.tencent.cos.xml.model.bucket.PutBucketRequest;
import com.tencent.cos.xml.model.bucket.PutBucketResult;
import com.tencent.cos.xml.model.bucket.PutBucketTaggingRequest;
import com.tencent.cos.xml.model.bucket.PutBucketTaggingResult;
import com.tencent.cos.xml.model.bucket.PutBucketVersioningRequest;
import com.tencent.cos.xml.model.bucket.PutBucketVersioningResult;
import com.tencent.cos.xml.model.bucket.PutBucketWebsiteRequest;
import com.tencent.cos.xml.model.bucket.PutBucketWebsiteResult;
import com.tencent.cos.xml.model.ci.GetDescribeMediaBucketsRequest;
import com.tencent.cos.xml.model.ci.GetDescribeMediaBucketsResult;
import com.tencent.cos.xml.model.ci.GetMediaInfoRequest;
import com.tencent.cos.xml.model.ci.GetMediaInfoResult;
import com.tencent.cos.xml.model.ci.GetSnapshotRequest;
import com.tencent.cos.xml.model.ci.GetSnapshotResult;
import com.tencent.cos.xml.model.ci.GetVideoAuditRequest;
import com.tencent.cos.xml.model.ci.GetVideoAuditResult;
import com.tencent.cos.xml.model.ci.PostAudioAuditRequest;
import com.tencent.cos.xml.model.ci.PostAuditResult;
import com.tencent.cos.xml.model.ci.PostDocumentAuditRequest;
import com.tencent.cos.xml.model.ci.PostTextContentAuditRequest;
import com.tencent.cos.xml.model.ci.PostTextContentAuditResult;
import com.tencent.cos.xml.model.ci.PostTextObjectAuditRequest;
import com.tencent.cos.xml.model.ci.PostVideoAuditRequest;
import com.tencent.cos.xml.model.ci.PreviewDocumentInHtmlLinkRequest;
import com.tencent.cos.xml.model.ci.PreviewDocumentInHtmlLinkResult;
import com.tencent.cos.xml.model.ci.PreviewDocumentInHtmlRequest;
import com.tencent.cos.xml.model.ci.PreviewDocumentInHtmlResult;
import com.tencent.cos.xml.model.ci.PreviewDocumentRequest;
import com.tencent.cos.xml.model.ci.PreviewDocumentResult;
import com.tencent.cos.xml.model.object.AppendObjectRequest;
import com.tencent.cos.xml.model.object.AppendObjectResult;
import com.tencent.cos.xml.model.object.DeleteMultiObjectRequest;
import com.tencent.cos.xml.model.object.DeleteMultiObjectResult;
import com.tencent.cos.xml.model.object.DeleteObjectTaggingRequest;
import com.tencent.cos.xml.model.object.DeleteObjectTaggingResult;
import com.tencent.cos.xml.model.object.GetObjectACLRequest;
import com.tencent.cos.xml.model.object.GetObjectACLResult;
import com.tencent.cos.xml.model.object.GetObjectTaggingRequest;
import com.tencent.cos.xml.model.object.GetObjectTaggingResult;
import com.tencent.cos.xml.model.object.OptionObjectRequest;
import com.tencent.cos.xml.model.object.OptionObjectResult;
import com.tencent.cos.xml.model.object.PutObjectACLRequest;
import com.tencent.cos.xml.model.object.PutObjectACLResult;
import com.tencent.cos.xml.model.object.PutObjectTaggingRequest;
import com.tencent.cos.xml.model.object.PutObjectTaggingResult;
import com.tencent.cos.xml.model.object.RestoreRequest;
import com.tencent.cos.xml.model.object.RestoreResult;
import com.tencent.cos.xml.model.object.SelectObjectContentRequest;
import com.tencent.cos.xml.model.object.SelectObjectContentResult;
import com.tencent.cos.xml.model.service.GetServiceRequest;
import com.tencent.cos.xml.model.service.GetServiceResult;
import com.tencent.cos.xml.model.tag.COSMetaData;

/* JADX INFO: loaded from: classes4.dex */
public interface CosXml extends SimpleCosXml {
    AppendObjectResult appendObject(AppendObjectRequest appendObjectRequest) throws CosXmlServiceException, CosXmlClientException;

    void appendObjectAsync(AppendObjectRequest appendObjectRequest, CosXmlResultListener cosXmlResultListener);

    DeleteBucketResult deleteBucket(DeleteBucketRequest deleteBucketRequest) throws CosXmlServiceException, CosXmlClientException;

    void deleteBucketAsync(DeleteBucketRequest deleteBucketRequest, CosXmlResultListener cosXmlResultListener);

    DeleteBucketCORSResult deleteBucketCORS(DeleteBucketCORSRequest deleteBucketCORSRequest) throws CosXmlServiceException, CosXmlClientException;

    void deleteBucketCORSAsync(DeleteBucketCORSRequest deleteBucketCORSRequest, CosXmlResultListener cosXmlResultListener);

    DeleteBucketInventoryResult deleteBucketInventory(DeleteBucketInventoryRequest deleteBucketInventoryRequest) throws CosXmlServiceException, CosXmlClientException;

    void deleteBucketInventoryAsync(DeleteBucketInventoryRequest deleteBucketInventoryRequest, CosXmlResultListener cosXmlResultListener);

    DeleteBucketLifecycleResult deleteBucketLifecycle(DeleteBucketLifecycleRequest deleteBucketLifecycleRequest) throws CosXmlServiceException, CosXmlClientException;

    void deleteBucketLifecycleAsync(DeleteBucketLifecycleRequest deleteBucketLifecycleRequest, CosXmlResultListener cosXmlResultListener);

    DeleteBucketReplicationResult deleteBucketReplication(DeleteBucketReplicationRequest deleteBucketReplicationRequest) throws CosXmlServiceException, CosXmlClientException;

    void deleteBucketReplicationAsync(DeleteBucketReplicationRequest deleteBucketReplicationRequest, CosXmlResultListener cosXmlResultListener);

    DeleteBucketTaggingResult deleteBucketTagging(DeleteBucketTaggingRequest deleteBucketTaggingRequest) throws CosXmlServiceException, CosXmlClientException;

    void deleteBucketTaggingAsync(DeleteBucketTaggingRequest deleteBucketTaggingRequest, CosXmlResultListener cosXmlResultListener);

    DeleteBucketWebsiteResult deleteBucketWebsite(DeleteBucketWebsiteRequest deleteBucketWebsiteRequest) throws CosXmlServiceException, CosXmlClientException;

    void deleteBucketWebsiteAsync(DeleteBucketWebsiteRequest deleteBucketWebsiteRequest, CosXmlResultListener cosXmlResultListener);

    DeleteMultiObjectResult deleteMultiObject(DeleteMultiObjectRequest deleteMultiObjectRequest) throws CosXmlServiceException, CosXmlClientException;

    void deleteMultiObjectAsync(DeleteMultiObjectRequest deleteMultiObjectRequest, CosXmlResultListener cosXmlResultListener);

    boolean deleteObject(String str, String str2) throws CosXmlServiceException, CosXmlClientException;

    void deleteObjectAsync(String str, String str2, CosXmlBooleanListener cosXmlBooleanListener);

    DeleteObjectTaggingResult deleteObjectTagging(DeleteObjectTaggingRequest deleteObjectTaggingRequest) throws CosXmlServiceException, CosXmlClientException;

    void deleteObjectTaggingAsync(DeleteObjectTaggingRequest deleteObjectTaggingRequest, CosXmlResultListener cosXmlResultListener);

    boolean doesBucketExist(String str) throws CosXmlServiceException, CosXmlClientException;

    void doesBucketExistAsync(String str, CosXmlBooleanListener cosXmlBooleanListener);

    boolean doesObjectExist(String str, String str2) throws CosXmlServiceException, CosXmlClientException;

    void doesObjectExistAsync(String str, String str2, CosXmlBooleanListener cosXmlBooleanListener);

    GetBucketResult getBucket(GetBucketRequest getBucketRequest) throws CosXmlServiceException, CosXmlClientException;

    GetBucketACLResult getBucketACL(GetBucketACLRequest getBucketACLRequest) throws CosXmlServiceException, CosXmlClientException;

    void getBucketACLAsync(GetBucketACLRequest getBucketACLRequest, CosXmlResultListener cosXmlResultListener);

    GetBucketAccelerateResult getBucketAccelerate(GetBucketAccelerateRequest getBucketAccelerateRequest) throws CosXmlServiceException, CosXmlClientException;

    void getBucketAccelerateAsync(GetBucketAccelerateRequest getBucketAccelerateRequest, CosXmlResultListener cosXmlResultListener);

    void getBucketAsync(GetBucketRequest getBucketRequest, CosXmlResultListener cosXmlResultListener);

    GetBucketCORSResult getBucketCORS(GetBucketCORSRequest getBucketCORSRequest) throws CosXmlServiceException, CosXmlClientException;

    void getBucketCORSAsync(GetBucketCORSRequest getBucketCORSRequest, CosXmlResultListener cosXmlResultListener);

    GetBucketDomainResult getBucketDomain(GetBucketDomainRequest getBucketDomainRequest) throws CosXmlServiceException, CosXmlClientException;

    void getBucketDomainAsync(GetBucketDomainRequest getBucketDomainRequest, CosXmlResultListener cosXmlResultListener);

    GetBucketIntelligentTieringResult getBucketIntelligentTiering(GetBucketIntelligentTieringRequest getBucketIntelligentTieringRequest) throws CosXmlServiceException, CosXmlClientException;

    void getBucketIntelligentTieringAsync(GetBucketIntelligentTieringRequest getBucketIntelligentTieringRequest, CosXmlResultListener cosXmlResultListener);

    GetBucketInventoryResult getBucketInventory(GetBucketInventoryRequest getBucketInventoryRequest) throws CosXmlServiceException, CosXmlClientException;

    void getBucketInventoryAsync(GetBucketInventoryRequest getBucketInventoryRequest, CosXmlResultListener cosXmlResultListener);

    GetBucketLifecycleResult getBucketLifecycle(GetBucketLifecycleRequest getBucketLifecycleRequest) throws CosXmlServiceException, CosXmlClientException;

    void getBucketLifecycleAsync(GetBucketLifecycleRequest getBucketLifecycleRequest, CosXmlResultListener cosXmlResultListener);

    GetBucketLocationResult getBucketLocation(GetBucketLocationRequest getBucketLocationRequest) throws CosXmlServiceException, CosXmlClientException;

    void getBucketLocationAsync(GetBucketLocationRequest getBucketLocationRequest, CosXmlResultListener cosXmlResultListener);

    GetBucketLoggingResult getBucketLogging(GetBucketLoggingRequest getBucketLoggingRequest) throws CosXmlServiceException, CosXmlClientException;

    void getBucketLoggingAsync(GetBucketLoggingRequest getBucketLoggingRequest, CosXmlResultListener cosXmlResultListener);

    GetBucketObjectVersionsResult getBucketObjectVersions(GetBucketObjectVersionsRequest getBucketObjectVersionsRequest) throws CosXmlServiceException, CosXmlClientException;

    void getBucketObjectVersionsAsync(GetBucketObjectVersionsRequest getBucketObjectVersionsRequest, CosXmlResultListener cosXmlResultListener);

    GetBucketRefererResult getBucketReferer(GetBucketRefererRequest getBucketRefererRequest) throws CosXmlServiceException, CosXmlClientException;

    void getBucketRefererAsync(GetBucketRefererRequest getBucketRefererRequest, CosXmlResultListener cosXmlResultListener);

    GetBucketReplicationResult getBucketReplication(GetBucketReplicationRequest getBucketReplicationRequest) throws CosXmlServiceException, CosXmlClientException;

    void getBucketReplicationAsync(GetBucketReplicationRequest getBucketReplicationRequest, CosXmlResultListener cosXmlResultListener);

    GetBucketTaggingResult getBucketTagging(GetBucketTaggingRequest getBucketTaggingRequest) throws CosXmlServiceException, CosXmlClientException;

    void getBucketTaggingAsync(GetBucketTaggingRequest getBucketTaggingRequest, CosXmlResultListener cosXmlResultListener);

    GetBucketVersioningResult getBucketVersioning(GetBucketVersioningRequest getBucketVersioningRequest) throws CosXmlServiceException, CosXmlClientException;

    void getBucketVersioningAsync(GetBucketVersioningRequest getBucketVersioningRequest, CosXmlResultListener cosXmlResultListener);

    GetBucketWebsiteResult getBucketWebsite(GetBucketWebsiteRequest getBucketWebsiteRequest) throws CosXmlServiceException, CosXmlClientException;

    void getBucketWebsiteAsync(GetBucketWebsiteRequest getBucketWebsiteRequest, CosXmlResultListener cosXmlResultListener);

    GetDescribeMediaBucketsResult getDescribeMediaBuckets(GetDescribeMediaBucketsRequest getDescribeMediaBucketsRequest) throws CosXmlServiceException, CosXmlClientException;

    void getDescribeMediaBucketsAsync(GetDescribeMediaBucketsRequest getDescribeMediaBucketsRequest, CosXmlResultListener cosXmlResultListener);

    GetMediaInfoResult getMediaInfo(GetMediaInfoRequest getMediaInfoRequest) throws CosXmlServiceException, CosXmlClientException;

    void getMediaInfoAsync(GetMediaInfoRequest getMediaInfoRequest, CosXmlResultListener cosXmlResultListener);

    GetObjectACLResult getObjectACL(GetObjectACLRequest getObjectACLRequest) throws CosXmlServiceException, CosXmlClientException;

    void getObjectACLAsync(GetObjectACLRequest getObjectACLRequest, CosXmlResultListener cosXmlResultListener);

    GetObjectTaggingResult getObjectTagging(GetObjectTaggingRequest getObjectTaggingRequest) throws CosXmlServiceException, CosXmlClientException;

    void getObjectTaggingAsync(GetObjectTaggingRequest getObjectTaggingRequest, CosXmlResultListener cosXmlResultListener);

    GetServiceResult getService(GetServiceRequest getServiceRequest) throws CosXmlServiceException, CosXmlClientException;

    void getServiceAsync(GetServiceRequest getServiceRequest, CosXmlResultListener cosXmlResultListener);

    GetSnapshotResult getSnapshot(GetSnapshotRequest getSnapshotRequest) throws CosXmlServiceException, CosXmlClientException;

    void getSnapshotAsync(GetSnapshotRequest getSnapshotRequest, CosXmlResultListener cosXmlResultListener);

    GetVideoAuditResult getVideoAudit(GetVideoAuditRequest getVideoAuditRequest) throws CosXmlServiceException, CosXmlClientException;

    void getVideoAuditAsync(GetVideoAuditRequest getVideoAuditRequest, CosXmlResultListener cosXmlResultListener);

    HeadBucketResult headBucket(HeadBucketRequest headBucketRequest) throws CosXmlServiceException, CosXmlClientException;

    void headBucketAsync(HeadBucketRequest headBucketRequest, CosXmlResultListener cosXmlResultListener);

    ListBucketInventoryResult listBucketInventory(ListBucketInventoryRequest listBucketInventoryRequest) throws CosXmlServiceException, CosXmlClientException;

    void listBucketInventoryAsync(ListBucketInventoryRequest listBucketInventoryRequest, CosXmlResultListener cosXmlResultListener);

    ListBucketVersionsResult listBucketVersions(ListBucketVersionsRequest listBucketVersionsRequest) throws CosXmlServiceException, CosXmlClientException;

    void listBucketVersionsAsync(ListBucketVersionsRequest listBucketVersionsRequest, CosXmlResultListener cosXmlResultListener);

    OptionObjectResult optionObject(OptionObjectRequest optionObjectRequest) throws CosXmlServiceException, CosXmlClientException;

    void optionObjectAsync(OptionObjectRequest optionObjectRequest, CosXmlResultListener cosXmlResultListener);

    PostAuditResult postAudioAudit(PostAudioAuditRequest postAudioAuditRequest) throws CosXmlServiceException, CosXmlClientException;

    void postAudioAuditAsync(PostAudioAuditRequest postAudioAuditRequest, CosXmlResultListener cosXmlResultListener);

    PostAuditResult postDocumentAudit(PostDocumentAuditRequest postDocumentAuditRequest) throws CosXmlServiceException, CosXmlClientException;

    void postDocumentAuditAsync(PostDocumentAuditRequest postDocumentAuditRequest, CosXmlResultListener cosXmlResultListener);

    PostTextContentAuditResult postTextContentAudit(PostTextContentAuditRequest postTextContentAuditRequest) throws CosXmlServiceException, CosXmlClientException;

    void postTextContentAuditAsync(PostTextContentAuditRequest postTextContentAuditRequest, CosXmlResultListener cosXmlResultListener);

    PostAuditResult postTextObjectAudit(PostTextObjectAuditRequest postTextObjectAuditRequest) throws CosXmlServiceException, CosXmlClientException;

    void postTextObjectAuditAsync(PostTextObjectAuditRequest postTextObjectAuditRequest, CosXmlResultListener cosXmlResultListener);

    PostAuditResult postVideoAudit(PostVideoAuditRequest postVideoAuditRequest) throws CosXmlServiceException, CosXmlClientException;

    void postVideoAuditAsync(PostVideoAuditRequest postVideoAuditRequest, CosXmlResultListener cosXmlResultListener);

    PreviewDocumentResult previewDocument(PreviewDocumentRequest previewDocumentRequest) throws CosXmlServiceException, CosXmlClientException;

    void previewDocumentAsync(PreviewDocumentRequest previewDocumentRequest, CosXmlResultListener cosXmlResultListener);

    PreviewDocumentInHtmlResult previewDocumentInHtml(PreviewDocumentInHtmlRequest previewDocumentInHtmlRequest) throws CosXmlServiceException, CosXmlClientException;

    void previewDocumentInHtmlAsync(PreviewDocumentInHtmlRequest previewDocumentInHtmlRequest, CosXmlResultListener cosXmlResultListener);

    byte[] previewDocumentInHtmlBytes(String str, String str2) throws CosXmlServiceException, CosXmlClientException;

    PreviewDocumentInHtmlLinkResult previewDocumentInHtmlLink(PreviewDocumentInHtmlLinkRequest previewDocumentInHtmlLinkRequest) throws CosXmlServiceException, CosXmlClientException;

    void previewDocumentInHtmlLinkAsync(PreviewDocumentInHtmlLinkRequest previewDocumentInHtmlLinkRequest, CosXmlResultListener cosXmlResultListener);

    PutBucketResult putBucket(PutBucketRequest putBucketRequest) throws CosXmlServiceException, CosXmlClientException;

    PutBucketACLResult putBucketACL(PutBucketACLRequest putBucketACLRequest) throws CosXmlServiceException, CosXmlClientException;

    void putBucketACLAsync(PutBucketACLRequest putBucketACLRequest, CosXmlResultListener cosXmlResultListener);

    PutBucketAccelerateResult putBucketAccelerate(PutBucketAccelerateRequest putBucketAccelerateRequest) throws CosXmlServiceException, CosXmlClientException;

    void putBucketAccelerateAsync(PutBucketAccelerateRequest putBucketAccelerateRequest, CosXmlResultListener cosXmlResultListener);

    void putBucketAsync(PutBucketRequest putBucketRequest, CosXmlResultListener cosXmlResultListener);

    PutBucketCORSResult putBucketCORS(PutBucketCORSRequest putBucketCORSRequest) throws CosXmlServiceException, CosXmlClientException;

    void putBucketCORSAsync(PutBucketCORSRequest putBucketCORSRequest, CosXmlResultListener cosXmlResultListener);

    PutBucketDomainResult putBucketDomain(PutBucketDomainRequest putBucketDomainRequest) throws CosXmlServiceException, CosXmlClientException;

    void putBucketDomainAsync(PutBucketDomainRequest putBucketDomainRequest, CosXmlResultListener cosXmlResultListener);

    PutBucketIntelligentTieringResult putBucketIntelligentTiering(PutBucketIntelligentTieringRequest putBucketIntelligentTieringRequest) throws CosXmlServiceException, CosXmlClientException;

    void putBucketIntelligentTieringAsync(PutBucketIntelligentTieringRequest putBucketIntelligentTieringRequest, CosXmlResultListener cosXmlResultListener);

    PutBucketInventoryResult putBucketInventory(PutBucketInventoryRequest putBucketInventoryRequest) throws CosXmlServiceException, CosXmlClientException;

    void putBucketInventoryAsync(PutBucketInventoryRequest putBucketInventoryRequest, CosXmlResultListener cosXmlResultListener);

    PutBucketLifecycleResult putBucketLifecycle(PutBucketLifecycleRequest putBucketLifecycleRequest) throws CosXmlServiceException, CosXmlClientException;

    void putBucketLifecycleAsync(PutBucketLifecycleRequest putBucketLifecycleRequest, CosXmlResultListener cosXmlResultListener);

    PutBucketLoggingResult putBucketLogging(PutBucketLoggingRequest putBucketLoggingRequest) throws CosXmlServiceException, CosXmlClientException;

    void putBucketLoggingAsync(PutBucketLoggingRequest putBucketLoggingRequest, CosXmlResultListener cosXmlResultListener);

    PutBucketRefererResult putBucketReferer(PutBucketRefererRequest putBucketRefererRequest) throws CosXmlServiceException, CosXmlClientException;

    void putBucketRefererAsync(PutBucketRefererRequest putBucketRefererRequest, CosXmlResultListener cosXmlResultListener);

    PutBucketReplicationResult putBucketReplication(PutBucketReplicationRequest putBucketReplicationRequest) throws CosXmlServiceException, CosXmlClientException;

    void putBucketReplicationAsync(PutBucketReplicationRequest putBucketReplicationRequest, CosXmlResultListener cosXmlResultListener);

    PutBucketTaggingResult putBucketTagging(PutBucketTaggingRequest putBucketTaggingRequest) throws CosXmlServiceException, CosXmlClientException;

    void putBucketTaggingAsync(PutBucketTaggingRequest putBucketTaggingRequest, CosXmlResultListener cosXmlResultListener);

    void putBucketVersionAsync(PutBucketVersioningRequest putBucketVersioningRequest, CosXmlResultListener cosXmlResultListener);

    PutBucketVersioningResult putBucketVersioning(PutBucketVersioningRequest putBucketVersioningRequest) throws CosXmlServiceException, CosXmlClientException;

    PutBucketWebsiteResult putBucketWebsite(PutBucketWebsiteRequest putBucketWebsiteRequest) throws CosXmlServiceException, CosXmlClientException;

    void putBucketWebsiteAsync(PutBucketWebsiteRequest putBucketWebsiteRequest, CosXmlResultListener cosXmlResultListener);

    PutObjectACLResult putObjectACL(PutObjectACLRequest putObjectACLRequest) throws CosXmlServiceException, CosXmlClientException;

    void putObjectACLAsync(PutObjectACLRequest putObjectACLRequest, CosXmlResultListener cosXmlResultListener);

    PutObjectTaggingResult putObjectTagging(PutObjectTaggingRequest putObjectTaggingRequest) throws CosXmlServiceException, CosXmlClientException;

    void putObjectTaggingAsync(PutObjectTaggingRequest putObjectTaggingRequest, CosXmlResultListener cosXmlResultListener);

    RestoreResult restoreObject(RestoreRequest restoreRequest) throws CosXmlServiceException, CosXmlClientException;

    void restoreObjectAsync(RestoreRequest restoreRequest, CosXmlResultListener cosXmlResultListener);

    SelectObjectContentResult selectObjectContent(SelectObjectContentRequest selectObjectContentRequest) throws CosXmlServiceException, CosXmlClientException;

    void selectObjectContentAsync(SelectObjectContentRequest selectObjectContentRequest, CosXmlResultListener cosXmlResultListener);

    @Deprecated
    boolean updateObjectMeta(String str, String str2, COSMetaData cOSMetaData) throws CosXmlServiceException, CosXmlClientException;

    @Deprecated
    void updateObjectMetaAsync(String str, String str2, COSMetaData cOSMetaData, CosXmlBooleanListener cosXmlBooleanListener);

    boolean updateObjectMetaData(String str, String str2, COSMetaData cOSMetaData) throws CosXmlServiceException, CosXmlClientException;

    void updateObjectMetaDataAsync(String str, String str2, COSMetaData cOSMetaData, CosXmlBooleanListener cosXmlBooleanListener);
}
