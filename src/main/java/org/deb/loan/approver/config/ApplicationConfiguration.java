package org.deb.loan.approver.config;

import lombok.Getter;
import lombok.Setter;
import org.apache.http.conn.ssl.NoopHostnameVerifier;
import org.apache.http.impl.client.CloseableHttpClient;
import org.apache.http.impl.client.HttpClients;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.http.client.HttpComponentsClientHttpRequestFactory;
import org.springframework.web.client.RestTemplate;

import javax.net.ssl.SSLContext;
import javax.net.ssl.TrustManager;
import javax.net.ssl.X509TrustManager;
import java.security.KeyManagementException;
import java.security.NoSuchAlgorithmException;
import java.security.cert.CertificateException;
import java.security.cert.X509Certificate;
import java.time.Clock;

@Configuration
@Getter
@Setter
public class ApplicationConfiguration {

  @Bean
  public Clock clock() {
    return Clock.systemUTC();
  }

  @Bean
  public RestTemplate restTemplate() throws NoSuchAlgorithmException, KeyManagementException {
    SSLContext sslContext = SSLContext.getInstance("TLSv1.2");
    TrustManager[] trustManagers =
        new TrustManager[] {
          new X509TrustManager() {
            @Override
            public void checkClientTrusted(X509Certificate[] chain, String authType)
                throws CertificateException {
              // will be implemented as per real time requirement.
            }

            @Override
            public void checkServerTrusted(X509Certificate[] chain, String authType)
                throws CertificateException {
              // will be implemented as per real time requirement.
            }

            @Override
            public X509Certificate[] getAcceptedIssuers() {
              return new X509Certificate[0];
            }
          }
        };

    sslContext.init(null, trustManagers, null);
    CloseableHttpClient httpClient =
        HttpClients.custom()
            .setSSLHostnameVerifier(new NoopHostnameVerifier())
            .setSSLContext(sslContext)
            .build();
    HttpComponentsClientHttpRequestFactory requestFactory =
        new HttpComponentsClientHttpRequestFactory();
    requestFactory.setHttpClient(httpClient);
    requestFactory.setConnectTimeout(3000);
    return new RestTemplate(requestFactory);
  }
}
