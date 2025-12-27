package org.learning;

import software.amazon.awssdk.auth.credentials.AwsCredentialsProvider;
import software.amazon.awssdk.auth.credentials.DefaultCredentialsProvider;
import software.amazon.awssdk.auth.credentials.ProfileCredentialsProvider;
import software.amazon.awssdk.http.async.SdkAsyncHttpClient;
import software.amazon.awssdk.http.nio.netty.NettyNioAsyncHttpClient;
import software.amazon.awssdk.services.kinesis.KinesisAsyncClient;
import software.amazon.awssdk.services.kinesis.KinesisAsyncClientBuilder;
import software.amazon.awssdk.services.kinesis.endpoints.internal.Arn;
import software.amazon.awssdk.services.kinesis.model.DescribeStreamSummaryRequest;
import software.amazon.awssdk.services.kinesis.model.DescribeStreamSummaryResponse;
import software.amazon.awssdk.utils.AttributeMap;

import java.io.IOException;
import java.net.URISyntaxException;
import java.time.Duration;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
	public static void main(String[] args) {
	}

//	private long getCreationEpoch(Arn streamArn) {
//		final DescribeStreamSummaryRequest request = DescribeStreamSummaryRequest.builder()
//				.streamARN(streamArn.toString())
//				.build();
//
//		DescribeStreamSummaryResponse response = null;
//		try {
//			response = FutureUtils.resolveOrCancelFuture(
//					buildAsyncKinesisClientForStreamOwner().describeStreamSummary(request), Duration.ofSeconds(60));
//		} catch (Exception e) {
//			e.printStackTrace();
//		}
//		return response.streamDescriptionSummary().streamCreationTimestamp().toEpochMilli();
//	}

//	public final KinesisAsyncClient buildAsyncKinesisClientForStreamOwner() throws URISyntaxException, IOException {
//		if (this.kinesisAsyncClientForStreamOwner == null) {
//			final KinesisAsyncClient client;
//			if (isCrossAccount()) {
//				client = buildAsyncKinesisClient(getCrossAccountCredentialsProvider());
//			} else {
//				client = buildAsyncKinesisClient(getCredentialsProvider());
//			}
//			this.kinesisAsyncClientForStreamOwner = client;
//		}
//		return this.kinesisAsyncClientForStreamOwner;
//	}
//
//	private KinesisAsyncClient buildAsyncKinesisClient(AwsCredentialsProvider creds) throws URISyntaxException, IOException {
//		// Setup H2 client config.
//		final NettyNioAsyncHttpClient.Builder builder = NettyNioAsyncHttpClient.builder()
//				.maxConcurrency(Integer.MAX_VALUE)
//				.protocol(getKinesisClientProtocol());
//
//		final SdkAsyncHttpClient sdkAsyncHttpClient =
//				builder.buildWithDefaults(AttributeMap.builder().build());
//
//		// Setup client builder by default values
//		final KinesisAsyncClientBuilder kinesisAsyncClientBuilder = KinesisAsyncClient.builder().region(getRegion());
//		kinesisAsyncClientBuilder.httpClient(sdkAsyncHttpClient);
//		kinesisAsyncClientBuilder.credentialsProvider(creds);
//
//		return kinesisAsyncClientBuilder.build();
//	}
//
//	private AwsCredentialsProvider getCredentialsProvider() {
//		final String awsProfile = System.getProperty(AWS_ACCOUNT_PROFILE_PROPERTY);
//		return (awsProfile != null) ?
//				ProfileCredentialsProvider.builder().profileName(awsProfile).build() : DefaultCredentialsProvider.create();
//	}
}

