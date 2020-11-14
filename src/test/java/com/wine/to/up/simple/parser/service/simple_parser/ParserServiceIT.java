package com.wine.to.up.simple.parser.service.simple_parser;

import org.jsoup.Connection;
import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.junit.jupiter.api.Test;

import static org.junit.Assert.*;

import java.io.IOException;

/**
 * Class for testing Jsoup connection used in {@link ParserService}
 */
class ParserServiceIT {
    /**
     * SimpleWine base URL
     */
    private static final String URL = "https://simplewine.ru";

    /**
     * Testing {@link Jsoup#connect(String)} method
     * Trying to establish connection with {@value #URL}
     * Response 200 means that connection succeeded
     *
     * @throws IOException Wrong input URL string value
     */
    @Test
    void testURLConnection() throws IOException {
        Connection.Response res = Jsoup.connect(URL).followRedirects(false).execute();
        assertEquals(200, res.statusCode());
    }
}