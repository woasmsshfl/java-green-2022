package jsonex01;

import java.util.HashMap;

import org.json.simple.JSONObject;
import net.nurigo.java_sdk.api.Message;
import net.nurigo.java_sdk.exceptions.CoolsmsException;

/**
 * @class ExampleSend
 * @brief This sample code demonstrate how to send sms through CoolSMS Rest API
 *        PHP
 */

// SMS같은 약자는MySMS자로 써준다.

public class MySMS {
  public static void main(String[] args) {
    String api_key = "NCSJBNNULJC6AO58";
    String api_secret = "DWAPV4XEEBFD48FVLHZYSIVRVMR2XV1T";
    Message coolsms = new Message(api_key, api_secret);

    // 4 params(to, from, type, text) are mandatory. must be filled
    HashMap<String, String> params = new HashMap<String, String>();
    params.put("to", "01022227460");
    params.put("from", "01023860732");
    params.put("type", "SMS");
    params.put("text", "황포냉면 해운대점 많은 이용 바랍니다 감사합니다");
    params.put("app_version", "test app 1.2"); // application name and version

    try {
      JSONObject obj = (JSONObject) coolsms.send(params);
      System.out.println(obj.toString());
    } catch (CoolsmsException e) {
      System.out.println(e.getMessage());
      System.out.println(e.getCode());
    }
  }
}