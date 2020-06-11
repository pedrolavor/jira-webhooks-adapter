package dev.pedrolavor.jirawebhookdiscord;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.http.HttpEntity;
import org.springframework.http.HttpHeaders;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.web.client.HttpClientErrorException;
import org.springframework.web.client.RestTemplate;

import lombok.extern.slf4j.Slf4j;

@Slf4j
@RunWith(SpringRunner.class)
@SpringBootTest
public class DiscordWebhooksTest {

  @Value("${discord.webhook}")
  private String url;
  
  private HttpEntity<String> createRequest(String body) {
    HttpHeaders headers = new HttpHeaders();
    headers.setContentType(MediaType.APPLICATION_JSON);
    return new HttpEntity<String>(body, headers);
  }

  @Test
  public void whenSendTestRequestToDiscord_ThenSuccess() {

    String body = "{" +
      "\"username\": \"Custom Jira Webhook\"," +
      "\"avatar_url\": \"https://i.imgur.com/4M34hi2.png\"," +
      "\"content\": \"Hi, this is a test message!\"" +
    "}";

    RestTemplate restTemplate = new RestTemplate();
    ResponseEntity<Object> response = restTemplate.postForEntity(url, createRequest(body), Object.class);

    assertEquals(204, response.getStatusCodeValue(), "Response Status should be 204 Created.");
  }

  @Test
  public void whenBodyWrong_ThenBadRequest() {

    String bodyWrong = "{" +
      "\"username\": \"Custom Jira Webhook\"," +
      "\"avatar_url\": \"https://i.imgur.com/4M34hi2.png\"," +
      "\"content\": \"Hi, this is a test message!\",,,,,," +
    "}";

    try {
      RestTemplate restTemplate = new RestTemplate();
      restTemplate.postForEntity(url, createRequest(bodyWrong), null);
    } catch (HttpClientErrorException ex) {
      log.error(ex.getMessage(), ex);
      assertEquals(400, ex.getRawStatusCode(), "Should return 400: Bad Request when body wrong.");
    }
  }

  @Test(expected = HttpClientErrorException.class)
  public void whenWrongUrl_ThenException() {
    RestTemplate restTemplate = new RestTemplate();
    restTemplate.postForEntity(url + "asdf", null, Object.class);
  }
  
}