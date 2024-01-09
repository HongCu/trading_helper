package com.hong.trading.client;

import org.apache.http.HttpHost;
import org.elasticsearch.client.RestClient;
import org.elasticsearch.client.RestHighLevelClient;

import java.io.IOException;

public class ElasticseachClient {
    private String ip;
    private int port;
    protected RestHighLevelClient client;

    public ElasticseachClient(String ip, int port, RestHighLevelClient client) {
        this.ip = ip;
        this.port = port;
        this.client = new RestHighLevelClient(
                RestClient.builder(
                        new HttpHost(ip, port, "http")
                )
        );
    }

    public ElasticseachClient(String ip, int port) {
        this.ip = ip;
        this.port = port;
        this.client = new RestHighLevelClient(
                RestClient.builder(
                        new HttpHost(ip, port, "http")
                )
        );
    }

    public void close() throws IOException {
        this.client.close();
    }
}
